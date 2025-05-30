B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=Class
Version=12.5
@EndOfDesignText@
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	Public NewPara As String
	Private Consulta_Sql As String
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

Sub Fx_Enviar_Correo_Bakapp1(Idmaeedo As Int,Koen As String, Suen As String, Para As String, CampoEmail As String,EditarMaeen As Boolean)  As ResumableSub
	
	Dim CodFuncionario As String = Variables.Global_Row_Usuario_Activo.Get("KOFU")
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Modalidad As String = Variables.Gl_Modalidad
	Dim Error As String
		
	Private Base As B4XView
	Private dialog As B4XDialog
	
	dialog.Initialize (Base)
				
	Dim xui As XUI

	Wait For(Sb_Ingresar_Correo_Validar(Koen,Suen,Para,"EMAILCOMER",True)) Complete (Resultado As String)
	NewPara = Resultado
	
	If NewPara = "" Then
		Return "Sin correo receptor"
	End If
	
	If NewPara = "Cancelar" Then
		Return "Cancelado por el usuario"
	End If
	
	Para = NewPara
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_EnviarCorreoBakapp(Me,Empresa,Modalidad,CodFuncionario,Idmaeedo,NewPara,"")
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Respuesta As Map = Funciones.Fx_DataRow(Js.GetString)
			Dim Error As String = Respuesta.Get("Error")
			
			If Error = "Ok" Then
				ToastMessageShow("Docuemto enviado a casilla de salida de email...",False)
			End If
			
			'Para = Error
			
		Else
			Error = "Falta la función en el WS"
		End If
		
	End If
	
	Return Error
	
End Sub

Sub Sb_Ingresar_Correo_Validar(Koen As String, Suen As String, Para As String, CampoEmail As String,EditarMaeen As Boolean) As ResumableSub
	
	Private Base As B4XView
		
	Private dialog As B4XDialog
	Base = mBase
	dialog.Initialize (Base)
				
	Dim xui As XUI
	Dim bmp1 As Bitmap
	
	Private InputTemplate As B4XInputTemplate
	InputTemplate.Initialize
	
	InputTemplate.lblTitle.Text = "Ingrese correo del cliente"
	InputTemplate.Text = Para
					
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Try
			Para = InputTemplate.Text.Trim
		Catch
			Log(LastException)
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("Error!",LastException, "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
			Para = "Error"
		End Try
	Else
		Para = "Cancelar"
	End If
	
	If Para = "Cancelar" Then
		Return Para
	End If
	
	If Funciones.Fx_IsEmail(Para) = False Then
		
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("Por favor vuelve a comprobar tu dirección de email","Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		
		Wait For (Sb_Ingresar_Correo_Validar(Koen,Suen,Para,CampoEmail,EditarMaeen)) Complete (Resultado As String)
		
		Para = Resultado
		
	End If
	
	If Para <> "Cancelar" Then
	
		If EditarMaeen Then
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
			Wait For (Fx_ActualizarCorreoEntidad(Koen,Suen,Para,CampoEmail)) Complete (Res As Boolean)
			If Res Then
				Msgbox2Async("Correo actualizado en la ficha del cliente","Información", "Ok", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
			End If
		End If
		
	End If
		
	Return Para
	
End Sub

Sub Fx_ActualizarCorreoEntidad(Koen As String, Suen As String, Para As String, CampoEmail As String) As ResumableSub
	
	Dim Consulta_Sql As String = "Update MAEEN Set " & CampoEmail & " = '" & Para & "' Where KOEN = '" & Koen & "' And SUEN = '" & Suen & "'" & CRLF & _
								 "Select Cast(1 As Bit) As Ok"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
			Return True
		End If
	
	End If
	
	Return False
	
End Sub

Sub Fx_Imprimir_Bakapp(Idmaeedo As Int) As ResumableSub
	
	Dim CodFuncionario As String = Variables.Global_Row_Usuario_Activo.Get("KOFU")
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Modalidad As String = Variables.Gl_Modalidad
	Dim Error As String
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me,Empresa,Modalidad,CodFuncionario,Idmaeedo)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Respuesta As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Dim Error As String = Respuesta.Get("Error")
			
			If Error = "Ok" Then
				ToastMessageShow("Documento enviado a imprimir...",False)
			End If
			
		Else
			Error = "Falta la función en el WS"
		End If
		
	End If
	
	Return Error
	
End Sub

Sub Fx_Formato_Modalidad(Empresa As String, Modalidad As String,Tido As String) As ResumableSub
	
	Dim Respuesta As Map
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_FormatoModalidad(Empresa,Modalidad,Tido,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	'ProgressDialogShow("Rescatando Estacion Bk")
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then				
			Respuesta = Funciones.Fx_DataRow(Js.GetString)
		End If
	End If
	
	Return Respuesta
	
End Sub

Sub Sb_RevisarFormatos As ResumableSub
	
	Wait For(Fx_RevisarFormato("COV")) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return False
	End If
		
	Wait For(Fx_RevisarFormato("NVV")) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return False
	End If
	
	Wait For(Fx_RevisarFormato("BLV")) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return False
	End If
	
	Wait For(Fx_RevisarFormato("FCV")) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return False
	End If
	
	Return True
	
End Sub

Private Sub Fx_RevisarFormato(Tido As String) As ResumableSub
	
	Dim bmp1 As Bitmap
	
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")

	Dim CLFx2 As ClFunciones2
	CLFx2.Initialize(Null,"")
	CLFx2.DesignerCreateView(mBase,Null,Null)
	Wait For(CLFx2.Fx_Formato_Modalidad(Variables.Gl_Empresa,Variables.Gl_Modalidad,Tido)) Complete (Resultado As Map)
	
	Dim EsCorrecto As Boolean = Resultado.Get("EsCorrecto")
	
	If Not(EsCorrecto) Then
		Dim ErrorMsg As String = Resultado.Get("Error")
		Msgbox2Async(ErrorMsg & CRLF & _
					 "Informe al administrador del sistema", "Validación", "Aceptar","","", bmp1, True)
		Wait For Msgbox_Result (Result As Int)
		Return False
	Else
		
		Dim TieneFormato As Boolean = Resultado.Get("TieneFormato")
		Dim NombreFomato As String = Resultado.Get("NombreFomato")
		Dim NombreFomatoEnMod As String = Resultado.Get("NombreFomatoEnMod")
		
		Dim Msg As String
		
		If Not(TieneFormato) Then
		
			If NombreFomatoEnMod = "" Then
				Msg = "No existe formato asociado a Empresa: [" & Variables.Gl_Empresa & "],Modalidad: " & Variables.Gl_Modalidad
			Else If NombreFomato = "" Then
				Msg = "No existe el formato [" & NombreFomatoEnMod & "] para Empresa: [" & Variables.Gl_Empresa & "],Modalidad: " & Variables.Gl_Modalidad
			End If
			
			Msgbox2Async(Msg & CRLF & _
					 "Informe al administrador del sistema", "Validación" & CRLF & Tido & "-" & Resultado.Get("Notido"), "Aceptar","","", bmp1, True)
			Wait For Msgbox_Result (Result As Int)
			Return False
		End If
	End If
	
	Select Case Tido
		Case "COV"
			Variables.Global_COV = Resultado
		Case "NVV"
			Variables.Global_NVV = Resultado
		Case "BLV"
			Variables.Global_BLV = Resultado
		Case "FCV"
			Variables.Global_FCV = Resultado
	End Select
	
	Return True
End Sub