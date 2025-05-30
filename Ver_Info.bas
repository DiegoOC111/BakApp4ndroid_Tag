B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private Iniciado As Boolean
	Private dialog As B4XDialog
	Private auxspin As String
	Private Btn_BuscarObj As Button
	Private Btn_VolverOBS2 As Button
	Private List_Objs As CustomListView
	Private Spinner2 As Spinner
	Private Txt_BuscObjs As EditText
	Private Lbl_CodPBSC As Label
	Private Lbl_CodRapBSC As Label
	Private Lbl_CodTecBSC As Label
	Private Lbl_DescBSC As Label
	Private Btn_VolverInfo As Button
	Private ImageView1 As ImageView
	Private Lbl_codprincipal As Label
	Private Lbl_descI As Label
	Private Lbl_FechaUlt As Label
	Private Lbl_Fm As Label
	Private Lbl_Marca As Label
	Private Lbl_precio As Label
	Private Lbl_SbFm As Label
	Private Lbl_SpFm As Label
	Private Lbl_stockInfo As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Vista_Buscar_Objeto")
	dialog.Initialize(Activity)
	dialog.PutAtTop = True
	dialog.Title = ""
	
	Spinner2.AddAll(Array As String("Descripcion","Principal","Tecnico","Rapido"))
	auxspin = "Descripcion"
	
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Private Sub Btn_BuscarObj_Click
	
	Dim p As Phone
	
	p.HideKeyboard(Activity)
	
	Private vSalir As Int
	Dim x As B4XView = xui.CreatePanel("")

	x.SetLayoutAnimated(0, 0, 0, 350dip, 380dip)
	x.LoadLayout("Vista_ObjBuscado")
	
		
	Dim Codigo As String = Txt_BuscObjs.Text
		
	wait for (Buscar_x_Comentario("",Codigo, Me)) complete(ac As Int)
		
'	Dim Js As HttpJob = Buscar_x_Comentario(auxspin, Codigo, Me)
	''
'	Wait For (Js) JobDone(Js As HttpJob)
'		
'	If Js.Success Then
'	
'		Dim vJson As String = Js.GetString
'			
'		If  vJson = $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
'				
'	
'				
'		End If
'				
'		Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'		For i = 0 To Filas.Size - 1
'			Dim fila As Map = Filas.Get(i)
'			Dim v As B4XView = xui.CreatePanel("")
'			v.SetLayoutAnimated(100,0,0,List_Contador1.AsView.Width,200dip)
'			v.LoadLayout("Vista_ObjBuscado")
'			v.Color = Colors.Black
'			
'			v.Tag = fila
'			auxspin = "Principal"
'			Lbl_CodPBSC.Text =  fila.get("Principal")
'			Lbl_CodRapBSC.Text =  fila.get("Rapido")
'			Lbl_CodTecBSC.Text =  fila.get("Tecnico")
'			Lbl_DescBSC.Text =  fila.get("Descripcion")
'			List_Objs.Add(v,"")
'			
	'
'		Next
'	End If
End Sub
Private Sub Buscar_x_Comentario(Tipo As String, VDescripcion As String, Me_ As Object) As ResumableSub 'HttpJob
	
	List_Objs.Clear
		
	Dim vCadena As String
	vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescripcion, "Mp.KOPR+Mp.NOKOPR" & " LIKE '%","")

'	Lv_Productos.Clear

	'B4XLoading.Show

	Dim Consulta_Sql As String
	
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	Dim Consul As String  = ""
	
	If auxspin = "Tecnico" Then
		
		Consul = "WHERE Mp.KOPRTE  Like '%" & vCadena & "%'"
		
	else if auxspin = "Rapido" Then
		
		Consul = "WHERE Mp.KOPRRA  Like '%" & vCadena & "%'"
	  
	Else if auxspin = "Principal" Then
		
		Consul = "WHERE Mp.KOPR  Like '%" & vCadena & "%'"
			
	Else if auxspin = "Descripcion" Then
		
		Consul = "WHERE Mp.NOKOPR  Like '%" & vCadena & "%'"
		
	End If
'	Consulta_Sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
	'                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
	'                   "From MAEPR Mp With (Nolock)" & CRLF & _
'				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
'				   		"' And Ms.KOSU = '" & Sucursal & _
'						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
'				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
'				   		"' And Tb.KOSU = '" & Sucursal & _
'						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
	'                   "WHERE Mp.KOPR+Mp.NOKOPR  Like '%" & vCadena & "%'" & CRLF & _
	'                   "Order by Mp.KOPR" & CRLF & _
	'                   "Option ( Fast 20 )"
'				   
'	Consulta_Sql = "SELECT TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
	'                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
	'                   "From MAEPR Mp With (Nolock)" & CRLF & _
'				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
'				   		"' And Ms.KOSU = '" & Sucursal & _
'						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
'				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
'				   		"' And Tb.KOSU = '" & Sucursal & _
'						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
	'                   Consul & CRLF & _
	'                   "Order by Mp.KOPR" & CRLF & _
	'                   "Option ( Fast 25 )"
'				   
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
			
			Log(vJson)
			Dim parser As JSONParser
			parser.Initialize(vJson)
			Dim root As Map = parser.NextObject
			Dim Table As List = root.Get("Table")
			
			'Rnd(0, 101)
													
			For Each Fila As Map In Table
			
'				Dim Codigo As String = Fila.Get("CODIGO")
'				Dim CODTECNICO As String = Fila.Get("CODTECNICO")
'				Dim STFI1 As Double  = Fila.Get("STFI1")
'				Dim DESCRIPCION As String = Fila.Get("DESCRIPCION")
												
'				Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'		
'			
				Dim v As B4XView = xui.CreatePanel("")
				v.SetLayoutAnimated(100,0,0,List_Objs.AsView.Width,200dip)
				v.LoadLayout("Vista_ObjBuscado")
				v.Color = Colors.Black
				
				v.Tag = Fila.Get("CODIGO")
				auxspin = "Principal"
				Lbl_CodPBSC.Text =  Fila.Get("CODIGO")
				Lbl_CodRapBSC.Text =  Fila.Get("RAPIDO")
				Lbl_CodTecBSC.Text = Fila.Get("CODTECNICO")
				Lbl_DescBSC.Text =  Fila.Get("DESCRIPCION")
				List_Objs.Add(v,"")
				
		
				
			Next
			
'			Log(Codigo & " - " & DESCRIPCION)
'			
		Else
		
			ToastMessageShow("No se encontraron registros",False)
			
		End If
	Else 
		Msgbox2Async("No hay conexion con el WebService", "Error", "OK", "", "", Null, False)
		Wait For Msgbox_Result (Result5 As Int)
	End If

'	B4XLoading.Hide
	ProgressDialogHide
	
	Return 1
	
	
'	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
	'<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	'  <soap:Body>
	'    <Sb_Inv_TraerProductoInventarioComentario xmlns="http://BakApp">
	'      <_IdInventario>$Xml{Inventario_Activo.Id}</_IdInventario>
	'      <_Empresa>$Xml{Inventario_Activo.Empresa}</_Empresa>
	'      <_Sucursal>$Xml{Inventario_Activo.Sucursal}</_Sucursal>
	'      <_Bodega>$Xml{Inventario_Activo.Bodega}</_Bodega>
	'      <_Tipo>$Xml{Tipo}</_Tipo>
	'      <_Codigo>$Xml{Codigo}</_Codigo>
	'    </Sb_Inv_TraerProductoInventarioComentario>
	'  </soap:Body>
	'</soap:Envelope>
	'"$
'	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
'	Dim Js As HttpJob
'	
'	Js.Initialize("",Me_)'
'	Js.PostString(PostString,vXml)
'	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
'	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_TraerProductoInventarioComentario""$)
'	
'	Return Js
	
End Sub

Private Sub Spinner2_ItemClick (Position As Int, Value As Object)
	auxspin = Spinner2.GetItem(Position)
End Sub
Private Sub List_Objs_ItemLongClick (Index As Int, Value As Object)
	
	Dim bmp1 As Bitmap
	Dim x As B4XView = List_Objs.GetPanel(Index)
	Dim straux As String = x.Tag
	
	Dim mapaux As Map
	Dim Js As HttpJob = Bsc(auxspin, straux, Me)
'		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
			
		If  vJson = $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
				
			Dim bmp1 As Bitmap
			
			Msgbox2Async("Producto no encontrado en la base de datos.", "Error", "OK", "", "", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
			End If

			Return
				
		End If
				
		Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
		Dim fila As Map = Filas.Get(0)
		Dim Codigo As  String = fila.Get(auxspin)
		Dim bmp1 As Bitmap

		
		
			
		Dim tx As String = "¿Desea Ver info del item: "&Codigo&"?"
			
		

		Msgbox2Async(tx, "Confirmacion", "Si", "", "No", Null, False)
		Wait For Msgbox_Result (Result5 As Int)
			
		If Result5 = DialogResponse.POSITIVE Then
			
			Dim InfoProd As Map = fila
			
			Dim z As B4XView = xui.CreatePanel("")
			Dim bmp1 As Bitmap


				z.SetLayoutAnimated(0, 0, 0, 300dip, 500dip)
				
				z.LoadLayout("info_prod")
			
				bmp1 = LoadBitmap(File.DirAssets, "question.png")
			
				dialog.Title = ""
				
				Lbl_SpFm.Text  =	InfoProd.Get("NombreSuper")
				Lbl_Fm.Text  =	InfoProd.Get("NombreFamilia")
				Lbl_SbFm.Text= 	InfoProd.Get("NombreSub")
				Lbl_codprincipal.Text = InfoProd.Get("Principal")
				Lbl_stockInfo.Text = InfoProd.Get("StFisicoUd1")
				Lbl_Marca.Text = InfoProd.Get("MARCA")
				Lbl_descI.Text =  InfoProd.Get("Descripcion")
				Lbl_precio.Text =  "$"&InfoProd.Get("PrecioListaUd1")
				Iniciado = True
				Wait For (dialog.ShowCustom(z, "", "", "")) Complete (Eleccion As Int)

				If Eleccion = xui.DialogResponse_Positive Then
					
										
				Else
					
					
					
				End If
				
				Iniciado = False
					
				
'			z.SetLayoutAnimated(0, 0, 0, 300dip, 500dip)
'			
'			z.LoadLayout("info_prod")
'			
'			bmp1 = LoadBitmap(File.DirAssets, "question.png")
'			
'			dialog.Title = ""
'			
'			Lbl_SpFm.Text  =	InfoProd.Get("NombreSuper")
'			Lbl_Fm.Text  =	InfoProd.Get("NombreFamilia")
'			Lbl_SbFm.Text= 	InfoProd.Get("NombreSub")
'			Lbl_codprincipal.Text = InfoProd.Get("Principal")
'			Lbl_stockInfo.Text = InfoProd.Get("StFisicoUd1")
'			Lbl_Marca.Text = InfoProd.Get("MARCA")
'			Lbl_descI.Text =  InfoProd.Get("Descripcion")
'			Lbl_precio.Text =  "$"&InfoProd.Get("PrecioListaUd1")
'			Wait For (dialog.ShowCustom(z, "", "", "")) Complete (Eleccion As Int)
'			If Eleccion = xui.DialogResponse_Positive Then
'				Btn_InfoPRodsBusc_Click
'				Else 
'				Btn_InfoPRodsBusc_Click
'				
'			
'		
'			
'			End If
		
		End If
		
	End If
	
End Sub
Private Sub Bsc(Tipo As String, Codigo As String, Me_ As Object) As HttpJob
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_TraerProductoInventario2 xmlns="http://BakApp">
      <_Empresa>$Xml{Empresa}</_Empresa>
      <_Sucursal>$Xml{Sucursal}</_Sucursal>
      <_Bodega>$Xml{Bodega}</_Bodega>
      <_Tipo>$Xml{Tipo}</_Tipo>
      <_Codigo>$Xml{Codigo}</_Codigo>
    </Sb_Inv_TraerProductoInventario2>
  </soap:Body>
</soap:Envelope>
"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_TraerProductoInventario2""$)
	
	Return Js
	
End Sub

Private Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode = KeyCodes.KEYCODE_BACK  Then
		
	If Iniciado Then
			
		dialog.Close(DialogResponse.CANCEL)
		Return True
			
	End If
	
	End If 
	Return False 
End Sub

Private Sub Txt_BuscObjs_EnterPressed
	Btn_BuscarObj_Click
End Sub

Private Sub Btn_VolverOBS2_Click
	StartActivity(Frm_Menu_Principal)
	Activity.Finish
	
End Sub

Private Sub Btn_VolverInfo_Click
	dialog.Close(DialogResponse.CANCEL)
	
End Sub