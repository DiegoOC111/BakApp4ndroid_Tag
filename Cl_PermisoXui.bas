B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	Private Txt_Clave As B4XView
	Private Lbl_DescripcionPermiso As B4XView
	Public PermisoAceptado As Boolean
	Private Consulta_Sql As String
	Public Error As String
	Public RowUsuarioAutoriza As Map
	Private Lbl_Codigo As B4XView
	Public bmp1 As Bitmap
	Public Aceptado As Boolean
	Public Cancelado As Boolean
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
    Tag = mBase.Tag
    mBase.Tag = Me 
  	'Dim clr As Int = xui.PaintOrColorToColor(Props.Get("TextColor")) 'Example of getting a color value from Props
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Sub Sb_ValidarPermisoUsuario(CodPermiso As String) As ResumableSub
	
	Wait For(Fx_ValidarPermisoUsuario(CodPermiso)) Complete (Rst As Boolean)
	
	If Not(Rst) Then
		If Not(Cancelado) Then
			Msgbox2Async(Error , "Validación", "Ok", "", "", bmp1, False)
		End If	
		Return False
	End If
	
	Return True
	
End Sub

Sub Fx_ValidarPermisoUsuario(CodPermiso As String) As ResumableSub
	
	Error = ""
	Aceptado = False
	Cancelado = False
	
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	Wait For(Sb_Traer_Nombre_Permiso(CodPermiso)) Complete (RowPermiso As Map)
	
	If Not(RowPermiso.IsInitialized) Then
		Error = "No existe el permiso [" & CodPermiso & "] en la base de datos"
		Return False
	End If
	
	Wait For(TienePermiso(CodPermiso,Variables.Global_Row_Usuario_Activo.Get("KOFU"))) Complete (Result2 As Boolean)
	If Result2 Then
		RowUsuarioAutoriza = Variables.Global_Row_Usuario_Activo
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Return True
	End If
	
	Dim xui As XUI
	Private dialog As B4XDialog
	
	dialog.Initialize (mBase)
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0,0, 320dip, 250dip)
	p.LoadLayout("Cp_ValidarPermisoUsuario")
	
	Dim DescripcionPermiso As String = RowPermiso.Get("DescripcionPermiso")
	Lbl_Codigo.Text = "CODIGO: " & CodPermiso.Trim
	Lbl_DescripcionPermiso.Text =DescripcionPermiso.Trim
	
	dialog.PutAtTop = True 'put the dialog at the top of the screen
	Wait For (dialog.ShowCustom(p, "ACEPTAR", "", "CANCELAR")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		
		Aceptado = True
		Dim Clave As String = Txt_Clave.Text
		
		Wait For(Sb_RevisarPermisoUsuario(CodPermiso,Clave)) Complete (Row As Map)

		If Row = Null Then

			ProgressDialogHide
			Msgbox2Async(Error , "Validación", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
			
			Wait For(Fx_ValidarPermisoUsuario(CodPermiso)) Complete (Rst As Boolean)
			If Not(Rst) Then
				Return False
			End If

		End If
		
		RowUsuarioAutoriza = Row
		
	Else
		
		ProgressDialogHide
		Cancelado = True
		Error = "Accion cancelada, no se ingresa ninguna clave"
		Return False
		
	End If
	
	ProgressDialogHide
	bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	Return True

End Sub

Sub Fx_RowTraerUsuario(Kofu As String) As ResumableSub
	
	Dim Row As Map
	Dim Consulta_Sql As String = "Select Top 1 * From TABFU Where KOFU = '" & Kofu  & "'"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then			
			Row = Funciones.Fx_DataRow(Js.GetString)						
		Else
			Error = "El usuario " & Kofu & " no existe"
			Return Null
		End If
	
	End If
	
	Return Row
	
End Sub

Sub Sb_RevisarPermisoUsuario(CodPermiso As String,vClave As String)As ResumableSub
	
	Dim Row As Map
	vClave = Funciones.Fx_TraeClaveRD(vClave)
		
	If vClave.Trim = "" Then
		
		Error = "La clave no puede estar vacia"
		Return Null
	End If
	
	Dim Consulta_Sql As String = "Select Top 1 * From TABFU Where PWFU = '" & vClave  & "'"
	Log(vClave)
	
	ProgressDialogShow("Revisando permiso")
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
			
			Row = Funciones.Fx_DataRow(Js.GetString)
				
			Wait For(TienePermiso(CodPermiso,Row.Get("KOFU"))) Complete (Result2 As Boolean)
			
			If Not(Result2) Then
				ProgressDialogHide
				Return Null
			End If
			
		Else
			ProgressDialogHide
			Error = "Clave invalida"
			Return Null
		End If
	
	End If
	
	ProgressDialogHide
	Return Row
	
End Sub

Sub TienePermiso(CodPermiso As String, CodUsuario As String) As ResumableSub
	
	ProgressDialogShow("Revisando permiso...")
	Consulta_Sql = "Select Top 1 * From " & Variables.Global_BaseBk & "ZW_PermisosVsUsuarios Where CodUsuario = '" & CodUsuario & "' And CodPermiso = '" & CodPermiso & "'"
			
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
		ProgressDialogHide

		If  vJson <> $"{"Table":[]}"$ Then
			Return True
		Else
			
			Wait For(Fx_RowTraerUsuario(CodUsuario)) Complete(Rs As Map)
			
			If Rs = Null Then
				Error = "El usuario [" & CodUsuario & "] no exite"
				Return False
			End If
			Dim Nokofu As String = Rs.Get("NOKOFU")
			Error = "El usuario [" & CodUsuario & "]-" & Nokofu.Trim & " no tiene clave apara realizar esta acción"
			Return False
			
		End If

	End If
	
	ProgressDialogHide
	Return False
	
End Sub

Sub Sb_Traer_Nombre_Permiso(CodPermiso As String) As ResumableSub
	
	Dim RowPermiso As Map
	ProgressDialogShow("Revisando permiso...")
	
	Consulta_Sql = "Select Top 1 * From " & Variables.Global_BaseBk & "ZW_Permisos Where CodPermiso = '" & CodPermiso & "'"
			
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			RowPermiso = Funciones.Fx_DataRow(Js.GetString)			
		Else
			RowPermiso = Null
		End If

	End If
	
	ProgressDialogHide
	Return RowPermiso
	
End Sub