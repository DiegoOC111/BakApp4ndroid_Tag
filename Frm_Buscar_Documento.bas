B4A=true
Group=Default Group\Sistemas\Post-Bk
ModulesStructureVersion=1
Type=Activity
Version=11.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Public Idmaeedo As Int
	Public Tido As String
	Public Nudo As String
	Public Koen As String
	Public Suen As String
	Public OCC As String
	Public Observaciones As String
	Public Para As String
	Public Estado As String
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim bmp1 As Bitmap

	Private Btn_Transformar_NVV As Button
	Private Btn_Editar_Documento As Button
	Private Btn_Imprimir As Button
	Private Btn_Enviar_Correo As Button
	Private Btn_Enviar_Correo_Imprimir As Button		
	Private Lbl_Etiqueta As Label	
	Private Btn_Cerrar As Button
	Dim Cl_PermisoX As Cl_PermisoXui
	Dim ClFx As ClFunciones2
		
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("Op_Edita_Print_Email_Etc")
	
	If Tido = "COV" Then
		Btn_Transformar_NVV.Enabled = False
	End If
	
	If Tido = "COV" Then 
		Lbl_Etiqueta.Text = "Cotización: " & Nudo
		Btn_Transformar_NVV.Enabled = True
	End If
	
	If Tido = "NVV" Then
		Lbl_Etiqueta.Text = "Nota de venta: " & Nudo
		Btn_Transformar_NVV.Enabled = False
	End If
	
	Cl_PermisoX.Initialize(Null,"")
	Cl_PermisoX.DesignerCreateView(Activity,Null,Null)
	
	ClFx.Initialize(Null,"")
	ClFx.DesignerCreateView(Activity,Null,Null)
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Btn_Transformar_NVV_Click
	
	bmp1 = LoadBitmap(File.DirAssets, "proforma-ok-2.png")
	Msgbox2Async("¿Confirma la creación de la NVV?", "Transformar a NVV", "Si","Cancelar","", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
	
	If Result <> DialogResponse.POSITIVE Then
		Return
	End If
						
	Dim NewDoc As Crear_Documento
	NewDoc.Initialize
	NewDoc.Idmaeedo = Idmaeedo
	NewDoc.Crear_NVV_Desde_COV = True
	NewDoc.Usar_Precio_Original = True
	Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Complete (RowEntidad As Map)
		
	If RowEntidad = Null Then
		Return
	End If
		
	NewDoc.Row_Entidad = RowEntidad
		
	Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_DocEnc As Int)
		
	If Id_DocEnc <> 0 Then
			
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Msgbox2Async("Ahora puede editar el documento","Editar Documento", "Ok","","", bmp1, False)
			
		Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc
		Frm_Post_01_Formulario.Crear_NVV_Desde_COV = True
		Frm_Post_01_Formulario.Idmaeedo_Origen = Idmaeedo
		Frm_Post_01_Formulario.Nudo_Origen = Nudo
		Frm_Post_01_Formulario.TipoDoc = "NVV"
		
		StartActivity(Frm_Post_01_Formulario)
		Activity.Finish
			
	End If
	
End Sub

Private Sub Btn_Editar_Documento_Click	
	
	Dim EditarDocumento As String = ""
	
	If Tido = "COV" Then
		EditarDocumento = "Editar Documento."
	End If
	
	bmp1 = LoadBitmap(File.DirAssets, "proforma-edit.png")
	Msgbox2Async("Editar documento", Tido & "-" & Nudo, "Editar Observaciones.", "Cancelar",EditarDocumento, bmp1, False)
	Wait For Msgbox_Result (Result As Int)
	
	If Result = DialogResponse.POSITIVE Then
					
		Frm_Editar_ObsOc.Idmaeedo = Idmaeedo
		Frm_Editar_ObsOc.Observaciones = Observaciones
		Frm_Editar_ObsOc.Orden_compra = OCC
		StartActivity(Frm_Editar_ObsOc)
					
	End If
	
	If Result = DialogResponse.NEGATIVE Then
		
		Wait For(Sb_SePuedeEditarDocumento) Complete (Rs As Boolean)
		
		If Not(Rs) Then
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Dim Msg As String
			If Tido = "COV" Then
				Msg = "No se puede editar este documento ya que es sustentatorio de una NOTA DE VENTA"
			End If
			If Tido = "NVV" Then
				Msg = "No se puede editar este documento ya que es sustentatorio de una FACTURA"
			End If
			Msgbox2Async(Msg,"Validación", "Ok","","", bmp1, False)
			Return
		End If
		
		
		Wait For(Sb_RevisarDifPrecios) Complete (RsRow As Map)
		
		If RsRow = Null Then
			Return
		End If
		
		'{"Table":[{"Permitir":true,"HayDifPrecios":false,"Error":"","Permiso":"Pbk00010","Respuesta":"","Version":"1.0.0.17"}]}
		Dim Permitir As Boolean = RsRow.Get("Permitir")
		Dim HayDifPrecios As Boolean = RsRow.Get("HayDifPrecios")
		Dim Error As String = RsRow.Get("Error")
		Dim Permiso As String = RsRow.Get("Permiso")
		Dim Respuesta As String = RsRow.Get("Respuesta")
		Dim VersionWs As String	 = RsRow.Get("VersionWs")
		
		If Error <> "" Then
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
			Msgbox2Async(Error,"Error WebService", "Ok","","", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
			Return
		End If
				
		Dim	Usar_Precio_Original As Boolean
				
		If HayDifPrecios Then
			
			Dim MsP As String
			If Not(Permitir) Then
				bmp1 = LoadBitmap(File.DirAssets, "security-danger.png")
				MsP = CRLF & " *(Requiere permiso)"
			Else
				bmp1 = LoadBitmap(File.DirAssets, "warning.png")
			End If
			
			Dim XUI As XUI
			
			Msgbox2Async(Respuesta,"Documento vencido" & MsP, "Dejar precio original (*)", "Cancelar", "Dejar Precio Actual", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		
			If Result = XUI.DialogResponse_Positive Then
				
				If Not(Permitir) Then
					
					Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(Permiso)) Complete (Rst As Boolean)
			
					If Not(Rst) Then
						Return
					End If
				
				End If
				
				Usar_Precio_Original = True

			End If
			
			If Result= XUI.DialogResponse_Cancel Then
				Return
			End If
					
		End If
					
		Dim NewDoc As Crear_Documento
		
		NewDoc.Initialize
		NewDoc.Idmaeedo = Idmaeedo
		NewDoc.Usar_Precio_Original = Usar_Precio_Original
		
		Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Complete (RowEntidad As Map)
		
		If RowEntidad = Null Then
			Return
		End If
		
		NewDoc.Row_Entidad = RowEntidad
		
		Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_DocEnc As Int)
		
		If Id_DocEnc <> 0 Then
			
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
			Msgbox2Async("Ahora puede editar el documento","Editar Documento", "Ok","","", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
			
			Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc
			Frm_Post_01_Formulario.Idmaeedo_Origen = Idmaeedo
			Frm_Post_01_Formulario.TipoDoc = Tido
			Frm_Post_01_Formulario.Nudo_Origen = Nudo
			Frm_Post_01_Formulario.Editar_Documento = True
						
			StartActivity(Frm_Post_01_Formulario)
			Activity.Finish
			
		End If
					
	End If
	
End Sub

Sub Sb_SePuedeEditarDocumento() As ResumableSub
	
	Dim Consulta_Sql As String = "Select Count(*) As Regitros_Sutentatorios" & CRLF & _
								 "From MAEDDO Where IDRST In (Select IDMAEDDO From MAEDDO Where IDMAEEDO = " & Idmaeedo & ") And ARCHIRST = 'MAEDDO'"
			
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
				
		Dim vJson As String = Js.GetString
				
		If  vJson <> $"{"Table":[]}"$ Then
				
			Dim Fila As Map = Funciones.Fx_DataRow(Js.GetString)
				
			Dim Regitros_Sutentatorios As Int = Fila.Get("Regitros_Sutentatorios")
			
			If Regitros_Sutentatorios > 0 Then
				Return False
			End If
	
		End If
	
	End If	
	
	Return True
	
End Sub

Private Sub Btn_Imprimir_Click
	
	Dim XUI As XUI
	bmp1 = LoadBitmap(File.DirAssets, "printer.png")
	
	Msgbox2Async("¿Confirma imprimir el documento?","IMPRIMIR", "Si", "Cancelar", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result <> XUI.DialogResponse_Positive Then
		Return
	End If
	
'	Dim ClFx As ClFunciones2
'	ClFx.Initialize(Null,"")
'	ClFx.DesignerCreateView(Activity,Null,Null)
	'Wait For(Fx_Imprimir_Bakapp) Complete (Resultado As String)
	Wait For(ClFx.Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
		
	If Resultado = "Ok" Then
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Msgbox2Async("Impresión enviada correctamente", "Imprimir","Ok","","", bmp1, False)
	Else
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async(Resultado,"Error al imprimir", "Aceptar","","", bmp1, False)
		Return
	End If
	
End Sub

Private Sub Btn_Enviar_Correo_Click
	
	Dim XUI As XUI
	bmp1 = LoadBitmap(File.DirAssets, "send-mail-back.png")
	
	Msgbox2Async("¿Confirma enviar el correo?","CORREO", "Si", "Cancelar", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result <> XUI.DialogResponse_Positive Then
		Return
	End If
	
'	Dim ClFx As ClFunciones2
'	ClFx.Initialize(Null,"")
'	ClFx.DesignerCreateView(Activity,Null,Null)
	
	Wait For(ClFx.Fx_Enviar_Correo_Bakapp1(Idmaeedo,Koen,Suen,Para,"EMAILCOMER",True)) Complete (Resultado As String)
		
	'Wait For(Fx_Enviar_Correo_Bakapp) Complete (Resultado As String)
					
	If Resultado = "Ok" Then
		Para =	ClFx.NewPara
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Msgbox2Async("correo enviado correctamente","Correo" ,"Ok","","", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	Else
		If Resultado.ToLowerCase <> "cancelado por el usuario" Then
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async(Resultado,"Error al enviar correo", "Ok","","", bmp1, True)
			Wait For Msgbox_Result (Result As Int)
		End If		
	End If
	
End Sub

Private Sub Btn_Enviar_Correo_Imprimir_Click
	
	Dim XUI As XUI
	bmp1 = LoadBitmap(File.DirAssets, "send-mail-back-printer.png")
	
	Msgbox2Async("¿Confirma imprimir y reenviar correo?","EMAIL-IMPRIMIR", "Si", "Cancelar", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result <> XUI.DialogResponse_Positive Then
		Return
	End If
	
'	Dim ClFx As ClFunciones2
'	ClFx.Initialize(Null,"")
'	ClFx.DesignerCreateView(Activity,Null,Null)
	'Wait For(Fx_Imprimir_Bakapp) Complete (Resultado As String)
	Wait For(ClFx.Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
		
	If Resultado = "Ok" Then
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Msgbox2Async("Impresión enviada correctamente", "Imprimir","Ok","","", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	Else
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async(Resultado,"Error al imprimir", "Ok","","", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return
	End If
	
'	Dim ClFx As ClFunciones2
'	ClFx.Initialize(Null,"")
'	ClFx.DesignerCreateView(Activity,Null,Null)
	
	Wait For(ClFx.Fx_Enviar_Correo_Bakapp1(Idmaeedo,Koen,Suen,Para,"EMAILCOMER",True)) Complete (Resultado As String)
	
	'Wait For(Fx_Enviar_Correo_Bakapp) Complete (Resultado As String)
					
	If Resultado = "Ok" Then
		Para =	ClFx.NewPara
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Msgbox2Async("correo enviado correctamente","Correo" ,"Ok","","", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	Else
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async(Resultado,"Error al enviar correo", "Ok","","", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	End If
	
End Sub

'Sub Fx_Imprimir_Bakapp() As ResumableSub
'	
'	Dim CodFuncionario As String = Variables.Global_Row_Usuario_Activo.Get("KOFU")
'	Dim Empresa As String = Variables.Gl_Empresa
'	Dim Modalidad As String = Variables.Gl_Modalidad
'	Dim Error As String
'	
'	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me,Empresa,Modalidad,CodFuncionario,Idmaeedo)
'	Wait For (Js) JobDone(Js As HttpJob)
'		
'	If Js.Success Then
'		
'		Dim vJson As String = Js.GetString
'						
'		If  vJson <> $"{"Table":[]}"$ Then
'			
'			Dim Respuesta As Map = Funciones.Fx_DataRow(Js.GetString)
'			
'			Dim Error As String = Respuesta.Get("Error")
'			
'			If Error = "Ok" Then
'				ToastMessageShow("Docuemto enviado a imprimir...",False)
'			End If
'			
'		Else
'			Error = "Falta la función en el WS"
'		End If
'		
'	End If
'	
'	Return Error
'	
'End Sub
'
'Sub Sb_Ingresar_Correo_Validar(Para2 As String) As ResumableSub
'	
'	Private Base As B4XView
'	Private InputTemplate As B4XInputTemplate
'	Private dialog As B4XDialog
'	Base = Activity
'	dialog.Initialize (Base)
'				
'	Dim xui As XUI
'	
'	InputTemplate.Initialize
'	
'	InputTemplate.lblTitle.Text = "Ingrese correo del cliente"
'	InputTemplate.Text = Para2
'					
'	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
'	If Result = xui.DialogResponse_Positive Then
'		Try
'			Para2 = InputTemplate.Text.Trim
'		Catch
'			Log(LastException)
'			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
'			Msgbox2Async("Error!",LastException, "Ok", "", "", bmp1, False)
'			Wait For Msgbox_Result (Result As Int)
'			Para2 = "Error"
'		End Try
'	Else
'		Para2 = "Cancelar"
'	End If
'	
'	If Para2 = "Cancelar" Then
'		Return Para2
'	End If
'	
'	If Funciones.Fx_IsEmail(Para2) = False Then
'		
'		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
'		Msgbox2Async("Por favor vuelve a comprobar tu dirección de email","Validación", "Ok", "", "", bmp1, False)
'		Wait For Msgbox_Result (Result As Int)
'		
'		Wait For (Sb_Ingresar_Correo_Validar(Para2)) Complete (Resultado As String)
'		
'		Para2 = Resultado
'		
'	End If
'	
'	Return Para2
'	
'End Sub

Private Sub Btn_Cerrar_Click
	
	Dim XUI As XUI
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Msgbox2Async("¿Confirma cerrar la ventana?","C E R R A R", "Si", "", "No", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result = XUI.DialogResponse_Positive Then
		Frm_Post_01_Formulario.Grabar = False
		Activity.Finish
	End If
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		Return True
	End If
		
End Sub


Sub Sb_RevisarDifPrecios() As ResumableSub
	
	Dim Vnta_Dias_Venci_Coti As Int = Variables.Global_Row_Configuracion_General.Get("Vnta_Dias_Venci_Coti")
	
	Dim Fila As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio(Me,Idmaeedo,Vnta_Dias_Venci_Coti)
	
	Fila = Null
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Fila =Filas.Get(0)
						
		End If
			
	Else
		Log(Js.ErrorMessage)
	End If
	
	Return Fila
	
End Sub