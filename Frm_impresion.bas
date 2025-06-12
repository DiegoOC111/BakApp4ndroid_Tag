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
	Type TableData(CODIGO As String, CODTECNICO As String, DESCRIPCION As String, MRPR As String, STFI1 As Double, RAPIDO As String, KOPRAL As String, DATOSUBIC As String)
	Dim DataList As List
	Dim DataPrice As List
	Type OtherPriceData (TILT As String, KOLT As String, MELT As String, MOLT As String, TIMOLT As String, NOKOLT As String, FEVI As String, OPERA As String, ECUDEF01UD As String, ECUDEF02UD As String)
	Type OtherData(Principal As String, Rapido As String, Tecnico As String, Rtu As Double, Ud1 As String, Ud2 As String, Descripcion As String, StFisicoUd1 As Double, StFisicoUd2 As Double, SuperFamilia As String, NombreSuper As String, Familia As String, NombreFamilia As String, SubFamilia As String, NombreSub As String, MRPR As String, MARCA As String, PrecioListaUd1 As Double, PrecioListaUd2 As Double)
	Dim ObjSelec As OtherData
	Type Etiqueta (NombreEtiqueta As String, FUNCION As String)
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private tip As String
	Private Ancho As Float = 2
	Private Alto As Float = 1.6
	Private Btn_Buscar As Button
	Private Panelinfo As Panel
	Private Btn_BuscarProd As Button
	Private Panel_Buscador As Panel
	Private ListView1 As ListView
	Private EditText1 As EditText
	Private B4XComboBox1 As B4XComboBox
	Private Btn_CerrarBuscador As Button
	Private selectedString As String
	Private Txt_codigo As EditText
	Private Lbl_tipo As Label
	Private Lbl_codigo As Label
	Private Lbl_Desc As Label
	Private cantidad As Int
	Private Lbl_precio As Label
	Private Btn_imprimir As Button
	Private Serial1 As Serial
	Private ConnectedPrinter As Socket
	Private PrinterIP As String  ' Dirección IP de la impresora Zebra
	Private PrinterPort As Int = 9100  ' Puerto estándar para impresión Zebra
	Private AStreams As AsyncStreams  ' Manejo de flujo de datos
	Private Combo_Impresion As B4XComboBox
	Private Combo_TipoBusqueda As B4XComboBox
	Private Btn_Volver As Button
	Dim datos As Map
	Dim SelectedPrice As Int
	Dim stringPrecio1 As String
	Private Combo_precios As B4XComboBox
	Private PanelVista As Panel
	Private WebView1 As WebView
	Private ImageView1 As ImageView
	Dim Etiquetas As List
	Dim etiqueta_ZPL As String
	Private B4XPlusMinus1 As B4XPlusMinus
	Private Spinner_cant As Spinner
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("impresion")
	DataPrice.Initialize
	DataList.Initialize
	Dim stringList As List
	stringList.Initialize
	stringList.Add("Tecnico")
	stringList.Add("Rapido")
	stringList.Add("Principal")
	stringList.Add("Descripcion")
	
	Dim stringList2 As List
	stringList2.Initialize
	
	For i = 1 To 10
		Spinner_cant.Add(i) ' B4A lo convierte automáticamente a string
	Next
	Combo_TipoBusqueda.SetItems(stringList)
	Combo_Impresion.SetItems(stringList2)
	selectedString = "Tecnico"
	LeerDatos
	Dim Js As HttpJob = Sb_TraerEtiquetas(Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		Dim vJson As String = Js.GetString
			
		If  vJson = $"{"Table":[]}"$ Then
			Dim bmp1 As Bitmap
			
			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
			Msgbox2Async("Error al buscar las etiquetas.", "Error", "OK", "", "", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
	
			End If

			Return
				
		End If
		Etiquetas = ParseEtiquetas(vJson)
		For Each ET As Etiqueta In Etiquetas
			stringList2.Add(ET.NombreEtiqueta)
		Next
		
	Else
		bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
		Msgbox2Async("Error al traer las etiquetas.", "Error", "OK", "", "", bmp1, False)
		Wait For Msgbox_Result (Result5 As Int)
		Return
	End If
	Combo_Impresion.SetItems(stringList2)
	tip = Combo_Impresion.GetItem(0)
'	Dim Js As HttpJob = Sb_BuscarListaPrecios(Me)
'	Wait For (Js) JobDone(Js As HttpJob)
'		
'	If Js.Success Then
'		Dim vJson As String = Js.GetString
'			
'		If  vJson = $"{"Table":[]}"$ Then
'			Dim bmp1 As Bitmap
'			
'			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
'			Msgbox2Async("Error al buscar la lista de precios.", "Error", "OK", "", "", bmp1, False)
'			Wait For Msgbox_Result (Result5 As Int)
'			
'			If Result5 = DialogResponse.POSITIVE Then
'	
'			End If
'
'			Return
'				
'		End If
'		DataPrice = ParseOtherPriceJSON(vJson)
'		
'		Else 
'			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
'			Msgbox2Async("Error al comunicarse con la base de datos.", "Error", "OK", "", "", bmp1, False)
'			Wait For Msgbox_Result (Result5 As Int)
'			Return
'	End If
'	
'	
'	
'	
'	Dim stringListPrice As List
'	stringListPrice.Initialize
'	For Each p As OtherPriceData In DataPrice
'		stringListPrice.Add(p.KOLT &" | "& p.NOKOLT)
'	Next
'	Combo_precios.SetItems(stringListPrice)
'	SelectedPrice = 0
'	Dim aux As OtherPriceData = DataPrice.Get(SelectedPrice)
'	stringPrecio = aux.KOLT
	
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
		PrinterIP = datos.Get("Ip")
		stringPrecio1 = datos.Get("KOLT")
		PrinterPort = datos.Get("Puerto")
		
	Else
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "printer.png")
		Msgbox2Async("Falta la configuración la configuración de la impresora." , "Alerta", "Ok", "", "", bmp1, False)
	
		Log("El archivo no existe.")
		datos.Initialize  ' Por si necesitas usar el Map aunque esté vacío
	End If
	
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
	
	

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub ParseJSON(json As String)
	Dim parser As JSONParser
	parser.Initialize(json)
	Dim root As Map = parser.NextObject
	Dim tableList As List = root.Get("Table")
    
	DataList.Initialize
    
	For Each entry As Map In tableList
		Dim data As TableData
		data.Initialize
		data.CODIGO = entry.Get("CODIGO")
		data.CODTECNICO = entry.Get("CODTECNICO")
		data.DESCRIPCION = entry.Get("DESCRIPCION")
		data.MRPR = entry.Get("MRPR")
		data.STFI1 = entry.Get("STFI1")
		data.RAPIDO = entry.Get("RAPIDO")
		data.KOPRAL = entry.Get("KOPRAL")
		data.DATOSUBIC = entry.Get("DATOSUBIC")
        
		DataList.Add(data)
'		Dim text As String =  & " | " & 
'		ListView1.Add
		ListView1.AddTwoLinesAndBitmap("Codigo: "&data.CODIGO, data.DESCRIPCION, Null) 
	Next
End Sub
Sub ParseOtherJSON(json As String)
	Dim parser As JSONParser
	parser.Initialize(json)
	Dim root As Map = parser.NextObject
	Dim tableList As List = root.Get("Table")

	For Each entry As Map In tableList
		Dim data As OtherData
		data.Initialize
		data.Principal = entry.Get("Principal")
		data.Rapido = entry.Get("Rapido")
		data.Tecnico = entry.Get("Tecnico")
		data.Rtu = entry.Get("Rtu")
		data.Ud1 = entry.Get("Ud1")
		data.Ud2 = entry.Get("Ud2")
		data.Descripcion = entry.Get("Descripcion")
		data.StFisicoUd1 = entry.Get("StFisicoUd1")
		data.StFisicoUd2 = entry.Get("StFisicoUd2")
		data.SuperFamilia = entry.Get("SuperFamilia")
		data.NombreSuper = entry.Get("NombreSuper")
		data.Familia = entry.Get("Familia")
		data.NombreFamilia = entry.Get("NombreFamilia")
		data.SubFamilia = entry.Get("SubFamilia")
		data.NombreSub = entry.Get("NombreSub")
		data.MRPR = entry.Get("MRPR")
		data.MARCA = entry.Get("MARCA")
		data.PrecioListaUd1 = entry.Get("PrecioListaUd1")
		data.PrecioListaUd2 = entry.Get("PrecioListaUd2")
		ObjSelec = data
		'
		Log("Producto: " & data.Descripcion & " - " & data.MARCA)
	Next
	
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


Private Sub Btn_Buscar_Click
	Panel_Buscador.Visible = True
	Btn_Buscar.Visible = False
End Sub

Private Sub Btn_BuscarProd_Click
	Log("Preess")
	If(Txt_codigo.Text <> "") Then
		wait for(Buscar_x_Comentario(selectedString,Txt_codigo.Text,Me)) complete(ac As Int)
		Else
			Return
	End If
End Sub

Private Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim selectedData As TableData = DataList.Get(Position)
	
	Dim Js As HttpJob = Bsc("Principal",selectedData.CODIGO,Me,Variables.Gl_Empresa,Variables.Gl_Sucursal,Variables.Gl_Bodega, stringPrecio1)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
	Dim vJson As String = Js.GetString
			
	If  vJson = $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
				
		Dim bmp1 As Bitmap
			
		bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
		Msgbox2Async("Producto no encontrado en la base de datos.", "Error", "OK", "", "", bmp1, False)
		Wait For Msgbox_Result (Result5 As Int)
			
		If Result5 = DialogResponse.POSITIVE Then
		End If

		Return
				
	End If
		ParseOtherJSON(Js.GetString)
End If
	Btn_Buscar.Visible= True
	Panelinfo.Visible = True
	Panel_Buscador.Visible = False
	Lbl_codigo.Text = ObjSelec.Principal.As(String)
	Lbl_Desc.Text = ObjSelec.Descripcion
	Lbl_precio.Text = "$"&FormatearMiles(ObjSelec.PrecioListaUd1)&".-"
	
	Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me, ObjSelec.Principal)
	Wait For (Js2) JobDone(Js2 As HttpJob)
	
	If Js2.Success Then
		Dim parser As JSONParser
		parser.Initialize(Js2.GetString)
    
		Dim m As Map = parser.NextObject
		Dim EsCorrecto As Boolean = m.Get("EsCorrecto")
		Dim Etiqueta As String = m.Get("Etiqueta")
		Dim Mensaje As String = m.Get("Mensaje")
    
		If EsCorrecto Then
			etiqueta_ZPL = Etiqueta
		Else
			Dim bmp1 As Bitmap
			
			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
			Msgbox2Async("Error creando la etiqueta.", "Error", "OK", "", "", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
			End If
		End If
	Else
		Log("Error en la petición HTTP")
	End If

	Js2.Release
End Sub

Sub FormatearMiles(numero As String) As String
	
	numero = numero.Replace(",", "").Replace(".", "").Trim
    
	If numero.Length = 0 Then Return ""
    
	Dim sb As StringBuilder
	sb.Initialize

	Dim contador As Int = 0
	For i = numero.Length - 1 To 0 Step -1
		sb.Insert(0, numero.CharAt(i))
		contador = contador + 1
		If contador Mod 3 = 0 And i > 0 Then
			sb.Insert(0, ".")
		End If
	Next

	Return sb.ToString
End Sub

Private Sub B4XComboBox1_SelectedIndexChanged (Index As Int)
	selectedString = B4XComboBox1.GetItem(Index)
End Sub

Private Sub Btn_CerrarBuscador_Click
	Btn_Buscar.Visible= True
	
	Panel_Buscador.Visible = False
End Sub


Private Sub Bsc(Tipo As String, Codigo As String, Me_ As Object, Empresa As String,Sucursal As String, Bodega As String,Lista As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_TraerProductoInventarioTicket xmlns="http://BakApp">
      <_Empresa>${Empresa}</_Empresa>
      <_Sucursal>${Sucursal}</_Sucursal>
      <_Bodega>${Bodega}</_Bodega>
      <_Tipo>${Tipo}</_Tipo>
      <_Codigo>${Codigo}</_Codigo>
	   <_Lista>${Lista}</_Lista>
    </Sb_Inv_TraerProductoInventarioTicket>
  </soap:Body>
</soap:Envelope>
"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_TraerProductoInventarioTicket""$)
	Return Js
	
End Sub
Private Sub Buscar_x_Comentario(Tipo As String, VDescripcion As String, Me_ As Object) As ResumableSub 'HttpJob
	
	DataList.Clear
	ListView1.Clear
		
	Dim vCadena As String
	vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescripcion, "Mp.KOPR+Mp.NOKOPR" & " LIKE '%","")

'	Lv_Productos.Clear

	'B4XLoading.Show

	Dim Consulta_Sql As String
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = "CM "
	Dim Bodega As String = "PR "
	Dim Consul As String  = ""
	
	If selectedString = "Tecnico" Then
		
		Consul = "WHERE Mp.KOPRTE  Like '%" & vCadena & "%'"
		
	else if selectedString = "Rapido" Then
		
		Consul = "WHERE Mp.KOPRRA  Like '%" & vCadena & "%'"
	  
	Else if selectedString = "Principal" Then
		
		Consul = "WHERE Mp.KOPR  Like '%" & vCadena & "%'"
			
	Else if selectedString = "Descripcion" Then
		
		Consul = "WHERE Mp.NOKOPR  Like '%" & vCadena & "%'"
		
	End If
''	Consulta_Sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
'	'                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
'	'                   "From MAEPR Mp With (Nolock)" & CRLF & _
''				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
''				   		"' And Ms.KOSU = '" & Sucursal & _
''						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
''				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
''				   		"' And Tb.KOSU = '" & Sucursal & _
''						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
'	'                   "WHERE Mp.KOPR+Mp.NOKOPR  Like '%" & vCadena & "%'" & CRLF & _
'	'                   "Order by Mp.KOPR" & CRLF & _
'	'                   "Option ( Fast 20 )"
''				   
''	Consulta_Sql = "SELECT TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
'	'                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
'	'                   "From MAEPR Mp With (Nolock)" & CRLF & _
''				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
''				   		"' And Ms.KOSU = '" & Sucursal & _
''						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
''				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
''				   		"' And Tb.KOSU = '" & Sucursal & _
''						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
'	'                   Consul & CRLF & _
'	'                   "Order by Mp.KOPR" & CRLF & _
'	'                   "Option ( Fast 25 )"
	'----este
					   
	Consulta_Sql = "SELECT TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
                   "From MAEPR Mp With (Nolock)" & CRLF & _
				   "RIGHT Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
				   		"' And Ms.KOSU = '" & Sucursal & _
						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
				   "RIGHT Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
				   		"' And Tb.KOSU = '" & Sucursal & _
						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR " & CRLF & _
						 Consul & CRLF & _
                   "Order by Mp.KOPR" & CRLF & _
                   "Option ( Fast 25 )"
				   
				   
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	ProgressDialogShow("Buscando prooductos...")

	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
			
			ParseJSON(vJson)
			
'			Log(Codigo & " - " & DESCRIPCION)
'			
		Else
		
			ToastMessageShow("No se encontraron registros",False)
			
		End If
	Else
		
	End If

'	B4XLoading.Hide
	ProgressDialogHide
	
	Return 1
	
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
Public Sub Sb_Inv_TraerProductoInventarioTicket(Me_ As Object, Empresa As String, Sucursal As String, Bodega As String, Tipo As String, Codigo As String, Lista As String) As HttpJob

	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_TraerProductoInventarioTicket xmlns="http://BakApp">
      <_Empresa>${Empresa}</_Empresa>
      <_Sucursal>${Sucursal}</_Sucursal>
      <_Bodega>${Bodega}</_Bodega>
      <_Tipo>${Tipo}</_Tipo>
      <_Codigo>${Codigo}</_Codigo>
      <_Lista>${Lista}</_Lista>
    </Sb_Inv_TraerProductoInventarioTicket>
  </soap:Body>
</soap:Envelope>"$

	Dim PostString As String = "http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob

	Js.Initialize("", Me_)
	Js.PostString(PostString, vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction", "http://BakApp/Sb_Inv_TraerProductoInventarioTicket")

	Return Js

End Sub
Private Sub Txt_codigo_EnterPressed
	Btn_BuscarProd_Click
End Sub

Private Sub Btn_imprimir_Click
	EnviarEtiqueta(etiqueta_ZPL)
End Sub
Sub AddLineBreak(str As String) As String
	If str.Length > 22 Then
		Return str.SubString2(0, 22) & "\n" & str.SubString(22)
	Else
		Return str
	End If
End Sub

Sub CrearZPLVenta(Cod As String, Desc As String, Dinero As String, Fech As String, Nom As String, Sb As String) As String
	'
	Dim CPCL As String
	CPCL = $"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ
^XA
^MMT
^PW432
^LL0240
^LS0
^FT17,38^A0N,34,33^FH\^FD<Nom>^FS
^FT19,73^A0N,17,16^FH\^FD<Sb>^FS
^SL0
^FT172,232^A0N,31,31
^FC%,{,#
^FD%d/%m/%y^FS
^FT19,128^A0N,44,45^FH\^FD<Dinero>^FS
^FT19,166^A0N,17,14^FH\^FD<Desc>^FS
^FT19,197^A0N,17,14^FH\^FD<Cod>^FS
^PQ1,0,1,Y^XZ"$
	' Configuración inicial
'	ZPL = "! 0 200 200 264 1" & CRLF
'	ZPL = ZPL & "PW 416" & CRLF
'	ZPL = ZPL & "TONE 0" & CRLF
'	ZPL = ZPL & "SPEED 1" & CRLF
'	ZPL = ZPL & "ON-FEED IGNORE" & CRLF
'	ZPL = ZPL & "NO-PACE" & CRLF
'	ZPL = ZPL & "GAP-SENSE" & CRLF
'    
'	' Datos de texto
'	ZPL = ZPL & "T 4 0 8 20 " & Nom & CRLF
'	ZPL = ZPL & "T 4 0 10 97 " & Dinero & CRLF
'	ZPL = ZPL & "T 7 0 286 199 " & Fech & CRLF
'	ZPL = ZPL & "T 0 0  8 150  " &Desc & CRLF
'	ZPL = ZPL & "T 7 0 8 199 " & Cod & CRLF
'	ZPL = ZPL & "T 7 0 8 69 " & Sb & CRLF
'    
'	' Final de la etiqueta
'	ZPL = ZPL & "PRINT" & CRLF
	
	CPCL = CPCL.Replace("<Nom>",Nom)
	CPCL = CPCL.Replace("<Dinero>",Dinero)
	CPCL = CPCL.Replace("<Fecha>",Fech)
	CPCL = CPCL.Replace("<Desc>",Desc)
	CPCL = CPCL.Replace("<Cod>",Cod)
	CPCL = CPCL.Replace("<Sb>",Sb)
	CPCL = CPCL.Replace("ñ","n")
	CPCL = CPCL.Replace("Ñ","N")
	
	Return CPCL
End Sub
Sub CrearZPLBodega(Cod As String, Desc As String, Fech As String, Titulo As String) As String
	Dim CPCL As String
	CPCL = $"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ
^XA
^MMT
^PW432
^LL0240
^LS0
^BY2,3,48^FT51,100^BCN,,Y,N
^FD>:<Codigo>^FS
^FT18,29^A0N,18,43^FH\^FD<Titulo>^FS
^FT18,151^A0N,14,14^FH\^FD<Desc1>^FS
^FT18,172^A0N,14,14^FH\^FD<Desc2>^FS
^FT141,219^A0N,18,33^FH\^FD<Fecha>^FS
^PQ1,0,1,Y^XZ
"$

	CPCL = CPCL.Replace("<Codigo>", Cod)
	CPCL = CPCL.Replace("<Titulo>", Titulo)
	CPCL = CPCL.Replace("<Fecha>", Fech)
	CPCL = CPCL.Replace("<Desc1>", Desc)
	CPCL = CPCL.Replace("ñ","n")
	CPCL = CPCL.Replace("Ñ","N")
	' Retornar el CPCL generado
	Return CPCL
End Sub

Sub EnviarEtiquetaZPL(ZPL As String)
	Dim bmp1 As Bitmap
	Try
		
		

		' Verificar y cerrar conexión previa, si existe
		If ConnectedPrinter.IsInitialized Then
			If ConnectedPrinter.Connected Then
				ConnectedPrinter.Close
				Log("Conexión anterior cerrada.")
			End If
		End If

		' Conectar a la impresora
		ConnectedPrinter.Initialize("ConnectedPrinter")
		ConnectedPrinter.Connect(PrinterIP, PrinterPort, 5000) ' Tiempo de espera: 5000 ms

		Wait For ConnectedPrinter_Connected (Success As Boolean)
		If Success Then
			Log("Conectado a la impresora.")
			ProgressDialogShow("Mandando a impresión...")
			
			' Crear AsyncStreams para enviar datos
			If AStreams.IsInitialized Then
				AStreams.Close ' Cerrar AsyncStreams si estaban inicializados
			End If
			AStreams.Initialize(ConnectedPrinter.InputStream, ConnectedPrinter.OutputStream, "AStreams")
			Dim residuales As String = "^XA^IDR:*.*^XZ"
			AStreams.Write(residuales.GetBytes("UTF8"))
			
			AStreams.Write(ZPL.GetBytes("UTF8"))
			Log("Etiqueta enviada exitosamente.")
			ProgressDialogHide
			bmp1 = LoadBitmap(File.DirAssets, "printer.png")
			Msgbox2Async("Se ha impreso la etiqueta","Impresión exitosa", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		Else
			ProgressDialogHide
			Log("Error al conectar con la impresora.")
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("Error de impresión" , "Error al imprimir", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		End If
	Catch
		ProgressDialogHide
		Log("Error al enviar la etiqueta: " & LastException.Message)
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async( "Error de impresión: "&LastException.Message,"Error al imprimir" , "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		
		' Asegurarse de cerrar la conexión después de enviar
		If ConnectedPrinter.Connected Then
			ConnectedPrinter.Close
			Log("Conexión cerrada después de enviar.")
		End If
	End Try
End Sub
Sub EnviarCalibrar(ZPL As String)
	Dim bmp1 As Bitmap
	Try
		
		

		' Verificar y cerrar conexión previa, si existe
		If ConnectedPrinter.IsInitialized Then
			If ConnectedPrinter.Connected Then
				ConnectedPrinter.Close
				Log("Conexión anterior cerrada.")
			End If
		End If

		' Conectar a la impresora
		ConnectedPrinter.Initialize("ConnectedPrinter")
		ConnectedPrinter.Connect(PrinterIP, PrinterPort, 5000) ' Tiempo de espera: 5000 ms

		Wait For ConnectedPrinter_Connected (Success As Boolean)
		If Success Then
			Log("Conectado a la impresora.")
			ProgressDialogShow("Mandando a impresión...")
			
			' Crear AsyncStreams para enviar datos
			If AStreams.IsInitialized Then
				AStreams.Close ' Cerrar AsyncStreams si estaban inicializados
			End If
			AStreams.Initialize(ConnectedPrinter.InputStream, ConnectedPrinter.OutputStream, "AStreams")
			Dim residuales As String = "^XA^IDR:*.*^XZ"
			AStreams.Write(residuales.GetBytes("UTF8"))
			
			AStreams.Write(ZPL.GetBytes("UTF8"))
			Log("Impresora Calibrada Exitosamente.")
			ProgressDialogHide
			bmp1 = LoadBitmap(File.DirAssets, "printer.png")
			Msgbox2Async("Impresora Calibrada Exitosamente","Calibración exitosa", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		Else
			ProgressDialogHide
			Log("Error al conectar con la impresora.")
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("Error de comandos" , "Error al calibrar", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		End If
	Catch
		ProgressDialogHide
		Log("Error al enviar la etiqueta: " & LastException.Message)
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async( "Error de impresión: "&LastException.Message,"Error al imprimir" , "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		
		' Asegurarse de cerrar la conexión después de enviar
		If ConnectedPrinter.Connected Then
			ConnectedPrinter.Close
			Log("Conexión cerrada después de enviar.")
		End If
	End Try
End Sub



Sub EnviarEtiqueta(zpl As String )
	Dim bmp1 As Bitmap
	Try
		Dim FechaActual As String


		
		

		' Verificar y cerrar conexión previa, si existe
		If ConnectedPrinter.IsInitialized Then
			If ConnectedPrinter.Connected Then
				ConnectedPrinter.Close
				Log("Conexión anterior cerrada.")
			End If
		End If

		' Conectar a la impresora
		ConnectedPrinter.Initialize("ConnectedPrinter")
		ConnectedPrinter.Connect(PrinterIP, PrinterPort, 5000) ' Tiempo de espera: 5000 ms

		Wait For ConnectedPrinter_Connected (Success As Boolean)
		If Success Then
			Log("Conectado a la impresora.")
			ProgressDialogShow("Mandando a impresión...")
			
			' Crear AsyncStreams para enviar datos
			If AStreams.IsInitialized Then
				AStreams.Close ' Cerrar AsyncStreams si estaban inicializados
			End If
			AStreams.Initialize(ConnectedPrinter.InputStream, ConnectedPrinter.OutputStream, "AStreams")
			Dim residuales As String = "^XA^IDR:*.*^XZ"
			AStreams.Write(residuales.GetBytes("UTF8"))
			
			AStreams.Write(zpl.GetBytes("UTF8"))
			Log("Etiqueta enviada exitosamente.")
			ProgressDialogHide
			bmp1 = LoadBitmap(File.DirAssets, "printer.png")
			Msgbox2Async("Se ha impreso la etiqueta","Impresión exitosa", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		Else
			ProgressDialogHide
			Log("Error al conectar con la impresora.")
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("Error de impresión" , "Error al imprimir", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		End If
	Catch
		ProgressDialogHide
		Log("Error al enviar la etiqueta: " & LastException.Message)
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async( "Error de impresión: "&LastException.Message,"Error al imprimir" , "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		
		' Asegurarse de cerrar la conexión después de enviar
		If ConnectedPrinter.Connected Then
			ConnectedPrinter.Close
			Log("Conexión cerrada después de enviar.")
		End If
	End Try
End Sub


Private Sub Combo_Impresion_SelectedIndexChanged (Index As Int)
	tip = Combo_Impresion.GetItem(Index)
	Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me, ObjSelec.Principal)
	Wait For (Js2) JobDone(Js2 As HttpJob)
	If Js2.Success Then
		Dim parser As JSONParser
		parser.Initialize(Js2.GetString)
    
		Dim m As Map = parser.NextObject
		Dim EsCorrecto As Boolean = m.Get("EsCorrecto")
		Dim Etiqueta As String = m.Get("Etiqueta")
		Dim Mensaje As String = m.Get("Mensaje")
    
		If EsCorrecto Then
			etiqueta_ZPL = Etiqueta
		Else
			Dim bmp1 As Bitmap
			
			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
			Msgbox2Async("Error creando la etiqueta.", "Error", "OK", "", "", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
			End If
		End If
	Else
		Log("Error en la petición HTTP")
	End If

	Js2.Release
End Sub

Private Sub Combo_TipoBusqueda_SelectedIndexChanged (Index As Int)
	selectedString = Combo_TipoBusqueda.GetItem(Index)
End Sub

Private Sub Btn_Volver_Click
	Activity.Finish
	
End Sub

'Private Sub Combo_precios_SelectedIndexChanged (Index As Int)
'	SelectedPrice = Index
'	Dim aux As OtherPriceData = DataPrice.Get(SelectedPrice)
'	stringPrecio = aux.KOLT
'End Sub

Private Sub Btn_Calibrar_Click
	Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "printer.png")
	Msgbox2Async("¿Estas seguro de calibrar la impresora?" , "Impresora", "Aceptar", "Cancelar", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
	If(Result <> DialogResponse.POSITIVE ) Then
		Return
	End If
	
	Dim zpl As String = $"^XA
~JC
^XZ"$
	EnviarCalibrar(zpl)
End Sub


Private Sub Btn_Ver_Click()
	Panelinfo.Visible=False
	Dim FechaActual As String
	FechaActual = DateTime.Date(DateTime.Now)
	Dim zpl As String = etiqueta_ZPL
		
	Dim job As HttpJob
	job.Initialize("", Me)
	job.PostString($"https://api.labelary.com/v1/printers/8dpmm/labels/${Ancho}x${Alto}/0/"$, zpl)
	job.GetRequest.SetHeader("Accept", "image/png")

	Wait For (job) JobDone(j As HttpJob)
	If j.Success Then
		Dim bmp As Bitmap = j.GetBitmap
		ImageView1.Bitmap = bmp
	Else
		Log("Error: " & j.ErrorMessage)
		ToastMessageShow("No se pudo generar la etiqueta", True)
	End If
	j.Release
	PanelVista.Visible=True
	Btn_Buscar.Visible = False
End Sub

Private Sub Btn_cerrarVIEW_Click
	PanelVista.Visible =False
	Panelinfo.Visible=True
	Btn_Buscar.Visible = True
	
End Sub

Private Sub Btn_Menos_Click
	Ancho = Ancho - 0.5
	Alto = Alto - 0.5
	Btn_Ver_Click
End Sub

Private Sub Btn_mas_Click
	Ancho = Ancho + 0.5
	Alto = Alto + 0.5
	Btn_Ver_Click
End Sub

Public Sub Sb_ImprimirEtiquetaZPL_01(Me_ As Object,   Codigo As String) As HttpJob

	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_ImprimirEtiquetaZPL_01 xmlns="http://BakApp">
      <_NombreEtiqueta>${tip}</_NombreEtiqueta>
      <_Codigo>${Codigo}</_Codigo>
      <_CodLista>${stringPrecio1}</_CodLista>
      <_Empresa>${Variables.Gl_Empresa}</_Empresa>
      <_Sucursal>${Variables.Gl_Sucursal}</_Sucursal>
      <_Bodega>${Variables.Gl_Bodega}</_Bodega>
      <_CodAlternativo></_CodAlternativo>
    </Sb_ImprimirEtiquetaZPL_01>
  </soap:Body>
</soap:Envelope>"$

	Dim PostString As String = "http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob

	Js.Initialize("", Me_)
	Js.PostString(PostString, vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction", "http://BakApp/Sb_ImprimirEtiquetaZPL_01")

	Return Js

End Sub



Private Sub Spinner_cant_ItemClick (Position As Int, Value As Object)
	Dim seleccionado As Int = Value
	cantidad = seleccionado
End Sub