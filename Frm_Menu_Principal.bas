B4A=true
Group=Default Group\Menu Principal
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
	
	Private Btn_PostVenta As Button
	Private Lbl_Nombre_Usuario As Label
	Private Lbl_Version As Label
	
	Private Btn_CodAlternativos As Button
	Private Btn_Inventario As Button
	Private Lbl_Modalidad As Label
	Private Btn_Etiqueta As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("Menu_Principal")		

	Lbl_Nombre_Usuario.Text = "Usuario activo: " & Variables.Global_Row_Usuario_Activo.Get("KOFU") & "-" & Variables.Global_Row_Usuario_Activo.Get("NOKOFU")
	Lbl_Modalidad.Text = "Modalidad: " & Variables.Gl_Modalidad
	Lbl_Version.Text = Application.LabelName & " versión: " &  Application.VersionName
			
	Btn_CodAlternativos.Enabled = False
	Btn_Inventario.Enabled = False
			
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Btn_PostVenta_Click
	
	Dim CLFx2 As ClFunciones2
	CLFx2.Initialize(Null,"")
	CLFx2.DesignerCreateView(Activity,Null,Null)
	
	Wait For(CLFx2.Sb_RevisarFormatos) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return
	End If

	Dim	B4A_DespachoSimple As Boolean = Variables.Global_Row_Configuracion_Estacion.Get("B4A_DespachoSimple")

	If B4A_DespachoSimple Then
		Crear_DocumentoConEndXDefecto
	Else
		StartActivity(Frm_Menu_Post_Venta)
	End If
	
End Sub

Private Sub Crear_DocumentoConEndXDefecto
	
	Dim Koen As String = Variables.Global_Row_Configuracion_Estacion.Get("Vnta_EntidadXdefecto")
	Dim Suen As String = Variables.Global_Row_Configuracion_Estacion.Get("Vnta_SucEntXdefecto")

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me,Koen,Suen)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Variables.Global_Row_Entidad_X_Defecto = Funciones.Fx_DataRow(Js.GetString)
			Log("8.- Cargamos la Entidad por defecto")

			StartActivity(Frm_Menu_Post_Venta)
			
		Else
				
			Dim bmp1 As Bitmap
	
			bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
			Msgbox2Async("No existe la entidad por defecto"  & CRLF & _
						 "Para poder trabajar con el dispositivo debe configurar una entidad por defecto" , "Validación", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
															
		End If
																
	End If
	
End Sub

Private Sub Lbl_Version_LongClick
	
	Msgbox2Async("¿Estas seguro de limpiar la base de datos local?" , "LIMPIAR DB", "Si", "", "No", Null, False)
	Wait For Msgbox_Result (Result As Int)
	
	If Result = DialogResponse.POSITIVE Then
		Funciones.Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos
		ToastMessageShow("BASE DE DATOS LIMPIA...", False)
	End If
	
End Sub

	Private Sub Lbl_Nombre_Usuario_LongClick
	
	Dim Cl_PermisoX As Cl_PermisoXui
	Cl_PermisoX.Initialize(Null,"")
	Cl_PermisoX.DesignerCreateView(Activity,Null,Null)

	Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario("Bkp00015")) Complete (Rst As Boolean)

End Sub

Private Sub Btn_Etiqueta_Click
	StartActivity(Frm_etiquetas)
	
End Sub