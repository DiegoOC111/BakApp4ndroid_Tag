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
Public Observaciones As String
Public Orden_compra As String


End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Dim bmp1 As Bitmap
	Private Txt_Observaciones As EditText
	Private Txt_Orden_compra As EditText
	Private Btn_Grabar As Button
	
	Private Btn_Cerrar As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Activity.LoadLayout("Op_Edita_Observaciones")
	
	Txt_Observaciones.Text = Observaciones
	Txt_Orden_compra.Text = Orden_compra
	
End Sub

Sub Activity_Resume
	Txt_Observaciones.Text = Observaciones
	Txt_Orden_compra.Text = Orden_compra
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Btn_Grabar_Click
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Actualizar_Observaciones_Documento(Me,Idmaeedo,Txt_Observaciones.Text.Trim,Txt_Orden_compra.Text.Trim)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Respuesta As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Dim Actualizado As String = Respuesta.Get("Actualizado")
			
			If Actualizado Then
				
				bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
				Msgbox2Async("Datos actualizados correctamente","Actualizar", "Ok", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
				
				Frm_Buscar_Documento.Observaciones = Txt_Observaciones.Text
				Frm_Buscar_Documento.OCC = Txt_Orden_compra.Text
				
				Activity.Finish
				
			Else
				
				bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
				Msgbox2Async("Error!",LastException, "Ok", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
									
			End If
			
		Else
		
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("Error!",LastException, "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		
		End If
		
	End If	
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		Return True
	End If
		
End Sub

Private Sub Btn_Cerrar_Click
	
	Dim XUI As XUI
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Msgbox2Async("¿Confirma cerrar sin grabar?","C E R R A R", "Si", "", "No", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result = XUI.DialogResponse_Positive Then
		Activity.Finish
	End If
	
End Sub