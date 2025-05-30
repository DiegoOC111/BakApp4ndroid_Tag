B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private focusTimer As Timer
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Private titulo As Label
	Private cr_hoja As Button
	Private Txt_Inventario As EditText
	Private Btn_Inv As Button
	Private dialog As B4XDialog
	Private xui As XUI
	
	Private Btn_hoja As Button
	Private PanelMain As Panel
	Private Lbl_Activo As Label
	Private Lbl_funcionario As Label
	Private Lbl_NombreF As Label
	Private Lbl_NInventario As Label
	Private Lbl_NBodega As Label
	Private Lbl_NSucursal As Label
	Private Lbl_NEmpresa As Label
	Private Lbl_Bodega As Label
	Private Lbl_Sucursal As Label
	Private Lbl_Empresa As Label
	Private Lbl_Id As Label
	Private Flag As Boolean
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("inventario")
	dialog.Initialize(Activity)
	dialog.Title = "Ingrese ID Inventario"
	Btn_Inv_Click
	Flag = False
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Devuelve True para consumir el evento.
	
	
	If KeyCode = KeyCodes.KEYCODE_BACK And Flag Then
		
		Private vSalir As Int
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
		vSalir = Msgbox2("¿Estas seguro de salir, al hacerlo se borrara todos los datos del inventario?", "S A L I R", "Si", "", "No", bmp1)
		
'		Dim bmp1 As Bitmap
'		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'		Wait For Msgbox_Result (vSalir As Int)
		
		If vSalir = DialogResponse.POSITIVE Then
			Return False
		Else
			Return True
		End If
		
	End If
	
	Return False
End Sub
Public Sub LlenarLabelsDesdeMap(datos As Map)
	Dim aux As Boolean 
	aux = datos.Get("Activo")
	If aux Then 
		Lbl_Activo.TextColor = Colors.Green
		Else 
			
		Lbl_Activo.TextColor = Colors.Red
			
	End If
	Lbl_funcionario.Text = datos.Get("FuncionarioCargo")
	Lbl_NombreF.Text = datos.Get("NombreFuncionario")
	Lbl_NInventario.Text = datos.Get("NombreInventario")
	Lbl_NBodega.Text = datos.Get("Nombre_Bodega")
	Lbl_NSucursal.Text = datos.Get("Nombre_Sucursal")
	Lbl_NEmpresa.Text = datos.Get("Nombre_Empresa")
	Lbl_Bodega.Text = datos.Get("Bodega")
	Lbl_Sucursal.Text = datos.Get("Sucursal")
	Lbl_Empresa.Text = datos.Get("Empresa")
	Lbl_Id.Text = datos.Get("Id")
End Sub
Sub focusTimer_Tick
	focusTimer.Enabled = False ' Desactiva el Timer después de que se ejecute
	
	If Txt_Inventario.IsInitialized Then
		
		Txt_Inventario.RequestFocus ' Enfoca el campo de texto
		
	End If
	
End Sub
Private Sub cr_hoja_Click
	
End Sub
Private Sub Inventario_Buscar(Id As String, Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_BuscarInventario xmlns="http://BakApp">
      <Inventario>$Xml{Id}</Inventario>
    </Sb_Inv_BuscarInventario>
  </soap:Body>
</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_BuscarInventario""$)
	Js.GetRequest.Timeout = 3000
	Return Js
	
End Sub


Private Sub Btn_Inv_Click
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 300dip, 150dip)
	p.LoadLayout("Inventario_Info")
	dialog.PutAtTop = True
	
	dialog.ShowCustom(p, "Listo", "", "Cancelar")
	focusTimer.Initialize("focusTimer", 100)
	focusTimer.Enabled = True
	
	Wait For (dialog.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Dim Js As HttpJob = Inventario_Buscar(Txt_Inventario.Text, Me)
'		
		Wait For (Js) JobDone(Js As HttpJob)
		
		If Js.Success Then
	
			Dim vJson As String = Js.GetString
			
			If  vJson = $"{"Table":[]}"$ Then
				
				Dim bmp1 As Bitmap
				Msgbox2Async("El inventario no pudo ser encontrado. Por favor, verifique los datos e intente nuevamente.", "Error", "Aceptar", "", "", Null, False)
				
				Wait For Msgbox_Result (Result5 As Int)
			
				If Result5 = DialogResponse.POSITIVE Then
					Btn_Inv_Click
					Return
				End If
				
					Btn_Inv_Click

				Return
				
			End If
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim fila As Map = Filas.Get(0)
			Inventario_Activo.RellenarDesdeMap(fila)
			Dim bmp1 As Bitmap
			bmp1 = LoadBitmap(File.DirAssets, "question.png")
			If Inventario_Activo.Activo Then 
				Dim tex As String = "¿Desea entrar al inventario : "&Inventario_Activo.NombreInventario &"?"
				
				Else 
					
				Dim tex As String = "El inventario no esta disponible : "&Inventario_Activo.NombreInventario &"?"
				Msgbox2Async(tex," ", "", "", "OK", bmp1, False)
				Wait For Msgbox_Result (Result5 As Int)
				
				If Result5 = DialogResponse.POSITIVE Or Result5 = DialogResponse.CANCEL Then
					Btn_Inv_Click
					Return
					Else 
					Btn_Inv_Click
					Return
				End If
			End If
			
			Msgbox2Async(tex," ", "No", "", "Si", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Or Result5 = DialogResponse.CANCEL Then
				Btn_Inv_Click
				Return
				
			End If
				
			

			
			LlenarLabelsDesdeMap(fila)
			Btn_Inv.Visible=False
			Btn_hoja.Visible = True 
			PanelMain.Visible = True 
			Flag = True 
		Else 
			desconectado
			Return
		End If
	Else 
		StartActivity(Frm_Menu_Principal)
		Activity.Finish
		
	End If
	
End Sub

Private Sub Btn_hoja_Click
	wait for(intentar) complete(r As Int)
	If r = 0 Then 
		
		Return
		
	End If
	
	StartActivity(crear_hoja)
	
End Sub

Private Sub desconectado As ResumableSub 
	
	Msgbox2Async("Se ha perdido la conexion", "Intente Reconectar", "Probar Conexion", "", "", Null, False)
	Wait For Msgbox_Result (Result5 As Int)
	If Result5 = DialogResponse.POSITIVE Then
		wait for(intentar) complete(r As Int)
		If r = 0 Then 
			Return 0
		End If
		
	End If
	Return 1 
End Sub
private Sub intentar As ResumableSub
	Dim Consulta_Sql As String
	Consulta_Sql = "Select Top 1 EMPRESA From CONFIES"
	ProgressDialogShow("Probando conexión")
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			ProgressDialogHide
				
			Dim bmp1 As Bitmap = LoadBitmap(File.DirAssets, "ok_button.png")
				
			Msgbox2Async("Conexion existosa" , "Conexión WebService", "Ok", "", "",bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		
			
		
			'DBUtils.UpdateRecord(Variables.vSql,"Conf_Local","Ip_Webservice",Variables.Global_Ip_WebService,CreateMap("IdDispositivo": Variables.Global_IdDispositivo ))
			'DBUtils.UpdateRecord(Variables.vSql,"Conf_Local","Ip_Webservice",Variables.Global_Ip_WebService,CreateMap("IdDispositivo": Variables.Global_IdDispositivo ))
					
			'Activity.Finish
			
		End If
	Else
		ProgressDialogHide
		
		Msgbox2Async("Conexion Fallida" , "Conexión WebService", "Ok", "", "",Null, False)
		Wait For Msgbox_Result (Result As Int)
		
		Return 0
	End If
	
	Return 1
	
End Sub