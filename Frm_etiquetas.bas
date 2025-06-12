B4A=true
Group=Default Group\Sistemas\Etiquetas
ModulesStructureVersion=1
Type=Activity
Version=13.1
@EndOfDesignText@
#Region  Activity Attributes 
#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private Serial1 As Serial
	Private ConnectedPrinter As Socket
	 ' Puerto estándar para impresión Zebra
	Private AStreams As AsyncStreams
	Dim stringPrecio As String
End Sub

Sub Globals
	Dim Etiquetas As List
	
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private PrinterMap As Map
	Private PrinterList As ListView
	Private SelectedPrinterIP As String  ' IP de la impresora seleccionada
	Dim datos As Map
	Dim xui As XUI
	Dim IsEnabled As Boolean
	Private Btn_Conf As Button
	Private Btn_Cerrar As Button
	Private General As Panel
	Private Panel_Conf As Panel
	Private Btn_Etq1 As Button
	Private Btn_Etq2 As Button
	Private Img_Venta As ImageView
	Private Img_bodega As ImageView
	Private Btn_Ed_Nombre As Button
	Private Btn_Ed_ID As Button
	Private Lbl_Nombre As Label
	Dim stringListPrice As List
	Private Lbl_Estado As Label
	Private Btn_Probar_Conexion As Button
	Private Lbl_Imprimir As Label
	Private Lbl_IP As Label
	Private clv As CustomListView
	Private ColorEnabled As Int = Colors.RGB(86,73,255)
	Private ColorDisabled As Int = Colors.RGB(162,156,255)
	Dim SelectedPrice As Int 
	Private Btn_Guardar As Button
	Private Label5 As Label
	Dim DataPrice As List
	Private Btn_Ed_Precio As Button
	Dim Changes As Boolean
	
	Private Btn_Volver As Button
	Private Lbl_precio_act As Label
	Private Lbl_puerto As Label
	Private Btn_editarPuerto As Button
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Etiqueta_men")
'	Img_bodega.Bitmap = LoadBitmap(File.DirAssets,"Etiqueta_bodega.png")
'	Img_Venta.Bitmap = LoadBitmap(File.DirAssets,"Etiqueta_venta.png")
	Changes = False
	Dim Js As HttpJob = Sb_BuscarListaPrecios(Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		Dim vJson As String = Js.GetString
			
		If  vJson = $"{"Table":[]}"$ Then
			Dim bmp1 As Bitmap
			
			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
			Msgbox2Async("Error al buscar la lista de precios.", "Error", "OK", "", "", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
	
			End If

			Return
				
		End If
		DataPrice = ParseOtherPriceJSON(vJson)
		
	Else
		bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
		Msgbox2Async("Error al comunicarse con la base de datos.", "Error", "OK", "", "", bmp1, False)
		Wait For Msgbox_Result (Result5 As Int)
		Return
	End If
	
	
	
	
	
	stringListPrice.Initialize
	For Each p As OtherPriceData In DataPrice
		stringListPrice.Add(p.KOLT &" | "& p.NOKOLT)
	Next
	SelectedPrice = 0
	Dim aux As OtherPriceData = DataPrice.Get(SelectedPrice)
	stringPrecio = aux.KOLT
	LeerDatos
	CargarLista
	
	
	

End Sub


Sub ParseOtherPriceJSON(json As String) As List
	Dim parser As JSONParser
	parser.Initialize(json)
	Dim root As Map = parser.NextObject
	Dim tableList As List = root.Get("Table")
    
	Dim result As List
	result.Initialize

	For Each entry As Map In tableList
		Dim data As OtherPriceData
		data.Initialize
		data.TILT = entry.Get("TILT")
		data.KOLT = entry.Get("KOLT")
		data.MELT = entry.Get("MELT")
		data.MOLT = entry.Get("MOLT")
		data.TIMOLT = entry.Get("TIMOLT")
		data.NOKOLT = entry.Get("NOKOLT")
        
		If entry.ContainsKey("FEVI") And entry.Get("FEVI") <> Null Then
			data.FEVI = entry.Get("FEVI")
		Else
			data.FEVI = ""
		End If
        
		data.OPERA = entry.Get("OPERA")
		data.ECUDEF01UD = entry.Get("ECUDEF01UD")
		data.ECUDEF02UD = entry.Get("ECUDEF02UD")
        
		result.Add(data)
	Next

	Return result
End Sub

Public Sub Sb_BuscarListaPrecios(Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_BuscarListaPrecios xmlns="http://BakApp" />
  </soap:Body>
</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_BuscarListaPrecios""$)
	
	Return Js
	
End Sub
Sub Activity_Resume

End Sub
Sub CrearDatos()
	
	Dim datos As Map
	datos.Initialize
	datos.Put("Ip",Lbl_IP.Text )
	datos.Put("Nombre", Lbl_Nombre.Text )
	datos.Put("Seleccionado", SelectedPrice)
	Dim ipText As String = Lbl_puerto.Text
	Dim IpINT As Int =  ipText
	datos.Put("Puerto", IpINT)
	Dim aux As OtherPriceData = DataPrice.Get(SelectedPrice)
	stringPrecio = aux.KOLT
	Dim stringNoPrecio As String  = aux.NOKOLT
	datos.Put("KOLT",stringPrecio )
	datos.Put("NOKOLT",stringNoPrecio )
	
	File.WriteMap(File.DirInternal, "impresora.map", datos)

	
	
End Sub
Sub CargarLista
	ProgressDialogShow2("Cargando etiquetas",False)
	clv.Clear
	Dim ListaPersonas As List
	ListaPersonas.Initialize

	
	
	
	
	Dim Js As HttpJob = Sb_TraerEtiquetas(Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		Dim vJson As String = Js.GetString
			
		If  vJson = $"{"Table":[]}"$ Then
			Dim bmp1 As Bitmap
			ProgressDialogHide
			
			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
			Msgbox2Async("No hay etiquetas de tipo '(Movil)' en la base de datos.", "Error", "OK", "", "", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If(Result5 = DialogResponse.POSITIVE)Then
			
				Btn_Etq1.Enabled = False
			
			End If
			Return
		
		End If
		Etiquetas = ParseEtiquetas(vJson)
		
		For Each ET As Etiqueta In Etiquetas
			Dim job As HttpJob
			job.Initialize("", Me)
			
			
			Dim Ancho, Alto As Float

			Dim m As Matcher = Regex.Matcher("(\d+)[xX](\d+)", ET.NombreEtiqueta)
			If m.Find Then
				Ancho = m.Group(1)
				Alto = m.Group(2)
				Ancho = Ancho / 2.54
				Alto = Alto / 2.54
				Ancho = NumberFormat2(Ancho, 1, 2, 2, False)
				Alto = NumberFormat2(Alto, 1, 2, 2, False)
				Log("Ancho: " & Ancho)
				Log("Alto: " & Alto)
				job.PostString($"https://api.labelary.com/v1/printers/8dpmm/labels/${Alto}x${Ancho}/0/"$, ET.FUNCION)
			Else
				job.PostString($"https://api.labelary.com/v1/printers/8dpmm/labels/2x5/0/"$, ET.FUNCION)
			End If
			
			
			job.GetRequest.SetHeader("Accept", "image/png")

			Wait For (job) JobDone(j As HttpJob)
			If j.Success Then
				Dim bmp As Bitmap = j.GetBitmap
				Dim Etiqueta As Map
				Etiqueta.Initialize
				Etiqueta.Put("tipo", ET.NombreEtiqueta)
				Etiqueta.Put("imagen", bmp)

	
				ListaPersonas.Add(Etiqueta)

			Else
				Log("Error: " & j.ErrorMessage)
				ToastMessageShow("No se pudo generar la etiqueta", True)
			End If
			j.Release
		Next
		
	Else
		
		bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
		Msgbox2Async("Error al traer las etiquetas.", "Error", "OK", "", "", bmp1, False)
		Wait For Msgbox_Result (Result5 As Int)
		If(Result5 = DialogResponse.POSITIVE)Then 
			ProgressDialogHide
			
			Btn_Etq1.Enabled = False
			
		End If
		Return
	End If

	For Each Etiqueta As Map In ListaPersonas
		Dim p As Panel = xui.CreatePanel("")
		p.SetLayoutAnimated(0, 0, 0, clv.AsView.Width, 150dip)
		p.LoadLayout("item_nombre_imagen")

		' Asignamos los controles desde el panel
		Dim lbl As Label = p.GetView(0) ' primer control del layout
		Dim img As ImageView = p.GetView(1) ' segundo control
		
		lbl.Text = Etiqueta.Get("tipo")
		img.Bitmap = Etiqueta.Get("imagen")

		clv.Add(p, "")
		
	Next
	ProgressDialogHide
End Sub


Private Sub Sb_TraerEtiquetas(Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_TraerEtiquetas xmlns="http://BakApp" />
  </soap:Body>
</soap:Envelope>
"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_TraerEtiquetas""$)
	Return Js
	
End Sub
	
Sub ParseEtiquetas(Json As String ) As List
	Dim parser As JSONParser
	parser.Initialize(Json)
	Dim root As Map = parser.NextObject
	Dim tableList As List = root.Get("Table")
    
	Dim result As List
	result.Initialize

	For Each entry As Map In tableList
		Dim data As Etiqueta
		data.Initialize
		data.NombreEtiqueta = entry.Get("NombreEtiqueta")
		data.FUNCION = entry.Get("FUNCION")
		
    
		result.Add(data)
	Next

	Return result
End Sub
Sub LeerDatos()
	If File.Exists(File.DirInternal, "impresora.map") Then
		datos = File.ReadMap(File.DirInternal, "impresora.map")
		Lbl_IP.Text = datos.Get("Ip")
		Lbl_Nombre.Text = datos.Get("Nombre")
		Lbl_precio_act.Text =  datos.Get("KOLT")  &"|"& datos.Get("NOKOLT")
		Dim aux As OtherPriceData = DataPrice.Get(SelectedPrice)
		SelectedPrice = datos.Get("Seleccionado")
		stringPrecio = aux.KOLT
		Lbl_puerto.Text = datos.Get("Puerto")
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "printer.png")
		Msgbox2Async("Se encontro la configuración de impresora", "Impresora encontrada", "Ok", "", "", bmp1, False)
		Btn_Etq1.Enabled=True 
		Lbl_Imprimir.Visible = False
	Else
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "printer.png")
		Msgbox2Async("Falta la configuración la configuración de la impresora." , "Alerta", "Ok", "", "", bmp1, False)
		Btn_Conf_Click
		Btn_Cerrar.Enabled = False
		
		Log("El archivo no existe.")
		datos.Initialize  ' Por si necesitas usar el Map aunque esté vacío
	End If
	
	
	
	
	
	
End Sub
Sub Activity_Pause (UserClosed As Boolean)

End Sub

'Sub VerificarImpresoras As ResumableSub
'	PrinterList.Clear  ' Limpiar la lista antes de verificar
'	Dim impresorasEncontradas As Boolean = False
'	
'	For Each nombre As String In PrinterMap.Keys
'		Dim ip As String = PrinterMap.Get(nombre)
'		If Ping(ip) Then ' Realizar ping antes de intentar conectar
'			Dim Socket As Socket
'			Socket.Initialize("Socket")
'			Socket.Connect(ip, PrinterPort, 1000)  ' Tiempo de espera: 1000 ms
'			Wait For Socket_Connected (Success As Boolean)
'			If Success Then
'				PrinterList.AddSingleLine(nombre & " - " & ip)
'				Socket.Close
'				impresorasEncontradas = True  ' Marcar que se encontró al menos una impresora
'			End If
'		End If
'	Next
'
'	ProgressDialogHide
'
'	If impresorasEncontradas = False Then
'		Dim bmp1 As Bitmap = LoadBitmap(File.DirAssets, "symbol-cancel.png")
'		Msgbox2Async("No se encontraron impresoras disponibles en la red", "Error", "Reintentar", "", "Salir", bmp1, False)
'		Wait For Msgbox_Result (Result As Int)
'		Select Case Result
'			Case DialogResponse.POSITIVE
'				Wait For (VerificarImpresoras) Complete
'			Case DialogResponse.NEGATIVE
'				
'				Activity.Finish  ' Cerrar la actividad actual
'				StartActivity(Frm_Menu_Principal)
'		End Select
'	End If
'
'	Return True
'End Sub

Sub Ping(IP As String) As Boolean
	Try
		Dim p As Phone
		Dim r As Int = p.Shell("ping -c 1 -w 1 " & IP, Null, Null, Null)
		Return (r = 0)  ' Si el ping es exitoso, devuelve True
	Catch
		Return False
	End Try
End Sub
'
'Private Sub PrinterList_ItemClick (Position As Int, Value As Object)
'	SelectedPrinterIP = Value
'	Log("Impresora seleccionada: " & SelectedPrinterIP)
'End Sub

Private Sub Btn_Conf_Click
	General.Visible= False
	Btn_Guardar.Color = ColorDisabled
	IsEnabled = False
	Panel_Conf.Visible = True
End Sub

Private Sub Btn_Cerrar_Click
	General.Visible= True
	Panel_Conf.Visible = False
End Sub

Private Sub Btn_Etq1_Click
	StartActivity(Frm_impresion)
	
End Sub

Private Sub Btn_Etq2_Click
	StartActivity(Frm_impresion)
End Sub

Private Sub Btn_Ed_ID_Click
	Private InputTemplate As B4XInputTemplate
	Private Base As B4XView
	Private dialog As B4XDialog


	
	InputTemplate.Initialize
	
	Base = Activity
	dialog.Initialize (Base)
	

	InputTemplate.lblTitle.Text = "Ingrese la ip"
	InputTemplate.Text = ""

				
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Res As Int)
	If (Res = DialogResponse.CANCEL) Then
		Return
	End If
	Changes = True
	Lbl_IP.Text = InputTemplate.Text
	
End Sub

Private Sub Btn_Ed_Nombre_Click
	Private InputTemplate As B4XInputTemplate
	Private Base As B4XView
	Private dialog As B4XDialog


	
	InputTemplate.Initialize
	
	Base = Activity
	dialog.Initialize (Base)
	

				
	InputTemplate.lblTitle.Text = "Ingrese el nombre"
	InputTemplate.Text = ""
				
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Res As Int)
	If (Res = DialogResponse.CANCEL) Then
		Return 
	End If
	Changes = True
	Lbl_Nombre.Text = InputTemplate.Text
End Sub

Private Sub Btn_Probar_Conexion_Click
'	-----SOlO PRUEBAS
'	Dim bmp1 As Bitmap
'	bmp1 = LoadBitmap(File.DirAssets, "printer.png")
'	Msgbox2Async("Conexión exitosa" , "Notificación", "Aceptar", "Cancelar", "", bmp1, False)
'	Wait For Msgbox_Result (Result As Int)
''		Simula un cambio de estado disabled To enabled
'	IsEnabled = True
'	Changes = False
'	Btn_Guardar.Color = ColorEnabled
'	Return
'	------
	If Ping(Lbl_IP.Text) Then
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "printer.png")
		Msgbox2Async("Conexión exitosa" , "Notificación", "Aceptar", "Cancelar", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
'		Simula un cambio de estado disabled To enabled
		IsEnabled = True
		Changes = False
		Btn_Guardar.Color = ColorEnabled
		Return
	End If
	Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
	Msgbox2Async("Conexión Fallida" , "Notificación", "Aceptar", "", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
End Sub

Private Sub Btn_Guardar_Click
	If Changes Then
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
		Msgbox2Async("Se realizaron cambios en la configuración, debe probar conexión antes de guradar" , "Configuración Impresora ", "Continuar", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return
	End If
	If IsEnabled Then
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "save.png")
		Msgbox2Async("¿Desea guardar la configuración actual?" , "Configuración local", "Si", "No", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		If Result = xui.DialogResponse_Positive Then
			If Lbl_puerto.Text <> "---" Then 
				
			If Lbl_IP.Text <> "---" Then
				If Lbl_Nombre.Text <> "---" Then
					CrearDatos
					Btn_Etq1.Enabled = True
					Lbl_Imprimir.Visible = False
				Else
					Dim bmp1 As Bitmap
					bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
					Msgbox2Async("No puede quedar un parametro en blanco, asigne un nombre" , "Configuración Impresora", "Continuar", "", "", bmp1, False)
					Wait For Msgbox_Result (Result As Int)
					Return
				End If
			Else
				Dim bmp1 As Bitmap
				bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
				Msgbox2Async("No puede quedar un parametro en blanco, Asigne una ip" , "Configuración Impresora ", "Continuar", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
				Return
			End If
			Else 
				Dim bmp1 As Bitmap
				bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
				Msgbox2Async("No puede quedar un parametro en blanco, Asigne un puerto" , "Configuración Impresora ", "Continuar", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
				Return
		End If
		
			
		End If
		Btn_Cerrar.Enabled = True
		Btn_Etq1.Enabled = True
	
		Return
	End If
	Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
	Msgbox2Async("Antes de guardar una configuración se debe de probar conexión" , "Configuración local", "Continuar", "", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
	
End Sub

Private Sub Btn_Ed_Precio_Click
	
	InputListAsync(stringListPrice, "Seleccione precio ", SelectedPrice, True)
	Wait For InputList_Result (Index As Int)
	If Index <> DialogResponse.CANCEL Then
		SelectedPrice = Index
		Dim  aux As OtherPriceData = DataPrice.Get(Index)
		stringPrecio = aux.KOLT&"|"&aux.NOKOLT
		Lbl_precio_act.Text = stringPrecio
		Changes = True
	End If
	
End Sub

Private Sub Btn_Volver_Click
	Activity.Finish
	
End Sub

Private Sub Btn_editarPuerto_Click
	Private InputTemplate As B4XInputTemplate
	Private Base As B4XView
	Private dialog As B4XDialog

	InputTemplate.Initialize
	Base = Activity
	dialog.Initialize(Base)

	InputTemplate.lblTitle.Text = "Ingrese el puerto"
	If (Lbl_puerto.Text <> Null) Then 
		InputTemplate.Text = Lbl_puerto.Text
		Else
		InputTemplate.Text = ""
			
	End If
	
	InputTemplate.ConfigureForNumbers(False,False)
	
	Wait For (dialog.ShowTemplate(InputTemplate, "Guardar", "Por defecto", "Cancel")) Complete (Res As Int)
	If (Res = DialogResponse.CANCEL) Then
		Return
	End If
	If(Res = DialogResponse.NEGATIVE) Then 
		Changes = True
		Lbl_puerto.Text = 9100
	End If
	If(Res = DialogResponse.POSITIVE) Then
		Changes = True
		Lbl_puerto.Text = InputTemplate.Text
	End If
	
	
	
End Sub
