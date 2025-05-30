B4A=true
Group=Default Group\Sistemas\Post-Bk
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim bmp1 As Bitmap

	Private Btn_Venta As Button
	Private Btn_Buscar_Documentos As Button
	Private Btn_Ver_Documentos As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("Cp_Menu_Post_Venta")
End Sub

Sub Activity_Resume

	If Frm_Documentos_Generados.Doc_Seleccionado Then
		
		Dim Idmaeedo As Int = Frm_Documentos_Generados.Idmaeedo_Sel

		Wait For(Sb_Ir_Al_Documento2(Idmaeedo)) Complete (Result As Boolean)
		
		Frm_Documentos_Generados.Doc_Seleccionado = False
		Frm_Documentos_Generados.Idmaeedo_Sel = 0
		
		If Result Then
			StartActivity(Frm_Buscar_Documento)
		End If
				
	End If
	
'	If Frm_Post_01_Formulario.Grabar Then
'		StartActivity(Frm_Buscar_Documento)
'	End If	

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Btn_Venta_Click	
	
'	Wait For(Sb_RevisarFormatos) Complete (Resultado As Boolean)
'	If Not(Resultado) Then
'		Return 
'	End If
	
	Frm_Post_01_Formulario.Id_DocEnc = 0
	Frm_Post_01_Formulario.Nuevo_Documento = True
	StartActivity(Frm_Post_01_Formulario)
	
End Sub

Private Sub Btn_Buscar_Documentos_Click
	
	Frm_Post_01_Formulario.Grabar = False
	
	Dim bmp1 As Bitmap
	
	bmp1 = LoadBitmap(File.DirAssets, "document-delivery-receipt-ok-2.png")
	
	Msgbox2Async("SELECCIONE EL TIPO DE DOCUMENTO","Buscar documento", "NOTA DE VENTA", "","COTIZACION", bmp1, True)
	Wait For Msgbox_Result (Result As Int)
	
	Dim Tido As String
	
	If Result = DialogResponse.POSITIVE Then
		Tido = "NVV"
	End If
	
	If Result = DialogResponse.NEGATIVE Then
		Tido = "COV"
	End If
	
	If Tido = "" Then
		Return
	End If
	
	Dim bmp1 As Bitmap
	
	Private InputTemplate As B4XInputTemplate
	Private xui As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	InputTemplate.Initialize
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Orden de compra"
	
	InputTemplate.lblTitle.Text = "Número de documento a buscar"
	InputTemplate.Text = ""
	
	Wait For (Dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Numero As Int)
	If Numero <> xui.DialogResponse_Positive Then
		Return
	End If
	
	If InputTemplate.Text = "" Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("El número del documento no puede estar vacío","Validación", "Okr","","", bmp1, True)
		Return
	End If
	
	Wait For(Sb_Ir_Al_Documento(Tido,InputTemplate.Text)) Complete (Resultado As Boolean)
	
	If Resultado Then
		StartActivity(Frm_Buscar_Documento)
	End If
	
	
End Sub

Sub Sb_Ir_Al_Documento(Tido As String,Nudo As String) As ResumableSub
	
	Wait For( Sb_BuscarDoc(Tido,Nudo)) Complete (Documento As Map)
	
	If Documento = Null Then
		Return False
	End If
	
	Dim Enviado As Boolean = Documento.Get("Enviado")
	Dim Error As String = Documento.Get("Error")
	
	If Enviado = False Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async(Error,"Validación", "Aceptar","","", bmp1, True)
		Return False
	End If
		
	'Dim EmailRandom As String = Documento.Get("EMAILCOMER") 'Variables.Global_Row_EstacionBk.Get("Mail_Random")
	
	Dim Idmaeedo As Int = Documento.Get("IDMAEEDO")
	Dim Endo As String = Documento.Get("ENDO")
	Dim Suendo As String = Documento.Get("SUENDO")
	Dim Obseravacion As String= Documento.Get("OBDO")
	Dim NroOCC As String = Documento.Get("OCDO")
	Dim Kofuen As String = Documento.Get("KOFUDO")
	Dim Para As String = Documento.Get("EMAILCOMER")
	
	If Kofuen <> Variables.Global_Row_Usuario_Activo.Get("KOFU") Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("Este documento es de otro usuario","Validación", "Aceptar","","", bmp1, True)
		Return False
	End If
	
	Frm_Buscar_Documento.Idmaeedo = Idmaeedo
	Frm_Buscar_Documento.Koen = Endo
	Frm_Buscar_Documento.Suen = Suendo
	Frm_Buscar_Documento.Observaciones = Obseravacion
	Frm_Buscar_Documento.OCC = NroOCC
	Frm_Buscar_Documento.Para = Para
	Frm_Buscar_Documento.Tido = Tido
	Frm_Buscar_Documento.Nudo = Nudo
	
	Return True
			
End Sub

Sub Sb_Ir_Al_Documento2(Idmaeedo As Int) As ResumableSub
	
	Wait For( Sb_BuscarDoc2(Idmaeedo)) Complete (Documento As Map)
	
	If Documento = Null Then
		Return False
	End If
	
	Dim Enviado As Boolean = Documento.Get("Enviado")
	Dim Error As String = Documento.Get("Error")
	
	If Enviado = False Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async(Error,"Validación", "Aceptar","","", bmp1, True)
		Return False
	End If
		
	'Dim EmailRandom As String = Documento.Get("EMAILCOMER") 'Variables.Global_Row_EstacionBk.Get("Mail_Random")
	
	Dim Idmaeedo As Int = Documento.Get("IDMAEEDO")
	Dim Tido As String = Documento.Get("TIDO")
	Dim Nudo As String = Documento.Get("NUDO")
	Dim Endo As String = Documento.Get("ENDO")
	Dim Suendo As String = Documento.Get("SUENDO")
	Dim Obseravacion As String= Documento.Get("OBDO")
	Dim NroOCC As String = Documento.Get("OCDO")
	Dim Kofuen As String = Documento.Get("KOFUDO")
	Dim Para As String =Documento.Get("EMAILCOMER")
	
	If Kofuen <> Variables.Global_Row_Usuario_Activo.Get("KOFU") Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("Este documento es de otro usuario","Validación", "Aceptar","","", bmp1, True)
		Return False
	End If
	
	Frm_Buscar_Documento.Idmaeedo = Idmaeedo
	Frm_Buscar_Documento.Koen = Endo
	Frm_Buscar_Documento.Suen = Suendo
	Frm_Buscar_Documento.Observaciones = Obseravacion
	Frm_Buscar_Documento.OCC = NroOCC
	Frm_Buscar_Documento.Para = Para
	Frm_Buscar_Documento.Tido = Tido
	Frm_Buscar_Documento.Nudo = Nudo
	
	Return True
			
End Sub

Sub Sb_BuscarDoc(Tido As String,Nudo As String) As ResumableSub
	
	Dim Row_Documento As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Documento(Me,Tido,Nudo)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Row_Documento =Filas.Get(0)
			
		Else
			Row_Documento = Null
		End If
			
	Else
		Row_Documento = Null
		Log(Js.ErrorMessage)
	End If
	
	Return Row_Documento
	
End Sub

Sub Sb_BuscarDoc2(Idmaeedo As Int) As ResumableSub
	
	Dim Row_Documento As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Documento2(Me,Idmaeedo)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Row_Documento =Filas.Get(0)
			
		Else
			Row_Documento = Null
		End If
			
	Else
		Row_Documento = Null
		Log(Js.ErrorMessage)
	End If
	
	Return Row_Documento
	
End Sub

Sub Sb_Fx_TraerDatosEntidad(Koen As String,Suen As String) As ResumableSub
	
	Dim xui As XUI
	Dim Row_Entidad As Map
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me,Koen,Suen)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Row_Entidad =Filas.Get(0)
			
		Else
			Row_Entidad = Null
		End If
			
	Else
		Row_Entidad = Null
		Log(Js.ErrorMessage)
	End If
	
	Return Row_Entidad
		
End Sub

Private Sub Btn_Ver_Documentos_Click
	Frm_Post_01_Formulario.Grabar = False
	StartActivity(Frm_Documentos_Generados)
End Sub

Sub Sb_Ver_Documento(Idmaeedo As Int,Koen As String, Suen As String)
	
	Dim NewDoc As Crear_Documento
	NewDoc.Initialize
	NewDoc.Idmaeedo = Idmaeedo
	Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Complete (RowEntidad As Map)
		
	If RowEntidad = Null Then
		Return
	End If
		
	NewDoc.Row_Entidad = RowEntidad
		
	Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_DocEnc As Int)
		
	If Id_DocEnc <> 0 Then
			
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
		Msgbox2Async("Ahora puede editar el documento","Editar Documento", "Ok","","", bmp1, True)
			
		Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc
		StartActivity(Frm_Post_01_Formulario)
			
	End If
	
End Sub