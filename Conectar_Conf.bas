B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private Consulta_Sql As String
	Dim vError As String
	Dim bmp1 As Bitmap
	Public Estado As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	'Datos del dispositivo
	
End Sub


Sub Fx_Traer_Nombre_Base_De_Datos As ResumableSub
	
	Dim Resultado As Int = 0
	
	' 1.- Obtenemos primero el nombre de la base de datos de Bakapp
	''ProgressDialogShow("Cargando nombre de base de datos...")
	
	Consulta_Sql = 	"Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'"

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	''ProgressDialogShow("Rescatando Base_Bakapp")
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			
			Log("1.- Obtenemos primero el nombre de la base de datos de Bakapp")				
			Dim Fila As Map = Funciones.Fx_DataRow(Js.GetString)				
			Variables.Global_BaseBk = Fila.Get("Global_BaseBk")
			Log("DB BakApp: " & Variables.Global_BaseBk)
			Resultado = 1
			
		End If
	End If
	'ProgressDialogHide
	Return Resultado
	
End Sub

Sub Fx_Cargar_Configuracion_Estacion As ResumableSub
	
	Dim Resultado As Int = 0
	
	' 2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp
	'ProgressDialogShow("Cargando configuración de estación y general...")
	Consulta_Sql = "Select * From " & Variables.Global_BaseBk & "Zw_EstacionesBkp Where NombreEquipo = '" & Variables.Global_IdDispositivo & "' And TipoEstacion = 'B4A'"

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	'ProgressDialogShow("Rescatando Estacion Bk")
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
				
			Log("2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp")
			Variables.Global_Row_EstacionBk = Funciones.Fx_DataRow(Js.GetString)
			Log("Configuracion_Estacion_Cargada")
			Resultado = 1
	
		End If
	End If
	
	'ProgressDialogHide
	Return Resultado
	
End Sub

Sub Fx_Traer_Usuario_Por_Defecto(Usuario_X_Defecto As String) As ResumableSub
	
	Dim Resultado As Int = 0
	
	'ProgressDialogShow("Auntentificando usuario...")
	' 4.- Cargamos al usuario por defecto y lo traemos
	
	Consulta_Sql = "Select Top 1 * From TABFU Where KOFU = '" & Usuario_X_Defecto  & "'"
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)

	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
									
			Log("4.- Cargamos al usuario por defecto y lo traemos")
			Variables.Global_Row_Usuario_Activo = Funciones.Fx_DataRow(Js.GetString)
			Resultado = 1
	
		End If
	
	End If
	
	'ProgressDialogHide
	Return Resultado
	
End Sub

Sub Fx_Cargar_Listas_Precios_Por_Usuario(Usuario_X_Defecto As String) As ResumableSub
	
	Dim Resultado As Int = 0
	
	'5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar
	'ProgressDialogShow("Rescatando Listas de precios del usuario Bk")
	Consulta_Sql = "Select KOLT As Kolt,KOLT+'-'+NOKOLT As Nokolt From TABPP" & CRLF & _
					"Where KOLT In (Select SUBSTRING(KOOP,4,3)" & CRLF & _
					"From MAEUS Where KOUS = '" & Usuario_X_Defecto & "' And KOOP LIKE 'LI-%') And TILT = 'P'" & CRLF & _
					"Order By Nokolt"
																
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
										
			Log("5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar")										
			Variables.Global_Listas_Precios_Usuario = Funciones.Fx_DataTable(vJson)
			Resultado = 1
			
		End If
	
	End If
	
	'ProgressDialogHide
	Return Resultado
	
End Sub

Sub Fx_Cargar_Configuracion_Estacion_Y_General(Empresa As String,Modalidad As String) As ResumableSub
	
	Dim Resultado As Int = 0
	
	'6.- Cargamos la configuración por Estación CONFIEST
							
	Consulta_Sql = "Select Top 1 *,Getdate() As Fecha_Servidor From CONFIEST" & CRLF & _
				   							"Inner Join " &  Variables.Global_BaseBk & "Zw_Configuracion On Empresa = EMPRESA And Modalidad = '" & Modalidad & "'" & CRLF & _
				   							"Where EMPRESA = '" & Empresa & "' And MODALIDAD = '" & Modalidad & "'"
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
							
			Log("6.- Cargamos la configuración por Estación CONFIEST")
							
			Variables.Global_Row_Configuracion_Estacion = Funciones.Fx_DataRow(Js.GetString)
			
			Variables.Gl_Modalidad = Modalidad
			Variables.Gl_Empresa = Variables.Global_Row_Configuracion_Estacion.Get("EMPRESA")
			Variables.Gl_Sucursal = Variables.Global_Row_Configuracion_Estacion.Get("ESUCURSAL")
			Variables.Gl_Bodega = Variables.Global_Row_Configuracion_Estacion.Get("EBODEGA")
			Variables.Gl_Caja = Variables.Global_Row_Configuracion_Estacion.Get("ECAJA")
			Variables.Gl_Lista_Precios =  Funciones.Mid(Variables.Global_Row_Configuracion_Estacion.Get("ELISTAVEN"),6,3)
			Variables.Gl_Lista_Costos = Funciones.Mid(Variables.Global_Row_Configuracion_Estacion.Get("ELISTACOM"),6,3)
			Variables.Gl_Fecha_Servidor = Funciones.Mid(Variables.Global_Row_Configuracion_Estacion.Get("Fecha_Servidor"),1,10)
		
			'7.- Finalmente cargamos la configuración General
		
			Consulta_Sql = "Select" & CRLF & _
						    "Empresa,Pr_AutoPr_Crear_Codigo_Principal_Automatico, Pr_AutoPr_Correlativo_Por_Iniciales, Pr_AutoPr_Correlativo_General," & CRLF & _
							"Pr_AutoPr_Tablas_Para_Iniciales_Cod_Automatico, Pr_AutoPr_Max_Cant_Caracteres_Del_Codigo, Pr_AutoPr_Ultimo_Codigo_Creado_Correlativo_General," & CRLF & _
							"Pr_Desc_Producto_Solo_Mayusculas, Pr_Creacion_Exigir_Precio, Pr_Creacion_Exigir_Clasificacion_busqueda, Pr_Creacion_Exigir_Codigo_Alternativo," & CRLF & _
							"Tbl_Ranking, Revisa_Taza_Cambio, Revisar_Taza_Solo_Mon_Extranjeras, Vnta_Dias_Venci_Coti, Vnta_TipoValor_Bruto_Neto, Vnta_EntidadXdefecto," & CRLF & _
							"Vnta_SucEntXdefecto, Vnta_Producto_NoCreado, Vnta_Preguntar_Documento, SOC_CodTurno, SOC_Buscar_Producto, SOC_Aprueba_Solo_G1," & CRLF & _
							"SOC_Aprueba_G1_y_G2, SOC_Prod_Crea_Solo_Marcas_Proveedor, SOC_Prod_Crea_Max_Carac_Nom, SOC_Valor_1ra_Aprobacion, SOC_Dias_Apela," & CRLF & _
							"SOC_Tipo_Creacion_Producto_Normal_Matriz, Precio_Costos_Desde, Precios_Venta_Desde_Random, Precios_Venta_Desde_BakApp," & CRLF & _
							"Vnta_Redondear_Dscto_Cero, Nodo_Raiz_Asociados, Vnta_Ofrecer_Otras_Bod_Stock_Insuficiente, Conservar_Responzable_Doc_Relacionado," & CRLF & _
							"Preguntar_Si_Cambia_Responsable_Doc_Relacionado, ServTecnico_Empresa, ServTecnico_Sucursal, ServTecnico_Bodega" & CRLF & _
							"From " & Variables.Global_BaseBk & "Zw_Configuracion" & CRLF & _
							"Where Modalidad_General = 1"
		
			Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
									
			Wait For (Js) JobDone(Js As HttpJob)
	
			If Js.Success Then
						
				Dim vJson As String = Js.GetString
				'ProgressDialogShow("Cargando configuracion")
				If  vJson <> $"{"Table":[]}"$ Then
															
					Log("7.- Cargamos la configuración General")
					Log("Fecha servidor: " & Variables.Gl_Fecha_Servidor)
															
					Variables.Global_Row_Configuracion_General = Funciones.Fx_DataRow(Js.GetString)
					Resultado = 1
																				
				Else
					Variables.Global_Row_Configuracion_General = Null
				End If
						
			Else
				Log("Error al cargar Configuracion General")
				Log(Js.ErrorMessage)
			End If
											
		Else
			Variables.Global_Row_Configuracion_Estacion = Null
		End If
						
	Else
		Log(Js.ErrorMessage)
	End If
			
	Return Resultado
					
End Sub

Sub Sb_Cargar_Datos_De_Configuracion() As ResumableSub
		
	bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")

	' 1.- Obtenemos primero el nombre de la base de datos de Bakapp
	Wait For(Fx_Traer_Nombre_Base_De_Datos) Complete (Result As Int)
		
	If Result = 0 Then
		Msgbox2Async("Falta la configuración de la Base de datos Bakapp en TABCARAC","Validación", "Ok","","", bmp1, True)
		Return 0
	End If
	
	' 2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp
	Wait For(Fx_Cargar_Configuracion_Estacion) Complete (Result As Int)
		
	If Result = 0 Then
		Msgbox2Async("El dispositivo no esta registrado en la base de datos"  & CRLF & _
					 "Id del dispositivo: " & Variables.Global_IdDispositivo , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return 0
	End If
	
	' 3.- Iniciamos la sesion
	Log("3.- Iniciamos la sesion")
	
	Variables.Global_Sesion_Star = True
		
	Dim Usar_Datos_X_Defecto As Boolean = Variables.Global_Row_EstacionBk.Get("Usar_Datos_X_Defecto")
	Dim Empresa_X_Defecto As String = Variables.Global_Row_EstacionBk.Get("Empresa_X_Defecto")
	Dim Usuario_X_Defecto As String = Funciones.LTrim(Variables.Global_Row_EstacionBk.Get("Usuario_X_Defecto"))
	Dim Modalidad_X_Defecto As String= Variables.Global_Row_EstacionBk.Get("Modalidad_X_Defecto")
	
	If Usuario_X_Defecto = "" Then
		Msgbox2Async("Falta el usuario por defecto"  & CRLF & _
					 "Id del dispositivo: " & Variables.Global_IdDispositivo , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return 0
	End If
	
	' 4.- Cargamos al usuario por defecto y lo traemos
	Wait For(Fx_Traer_Usuario_Por_Defecto(Usuario_X_Defecto)) Complete (Result As Int)
	
	If Result = 0 Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("El usuario no existe."  & CRLF & _
					"Usuario: " & Usuario_X_Defecto , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return 0
	End If
	
	'5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar
	Wait For(Fx_Cargar_Listas_Precios_Por_Usuario(Usuario_X_Defecto)) Complete (Result As Int)
	
	If Result = 0 Then
		Msgbox2Async("El usuario no posee permisos para ninguna lista de precios en Random."  & CRLF & _
					 "Usuario: " & Usuario_X_Defecto , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return 0
	End If
		
	'6.- Cargamos la configuración por Estación CONFIEST y la configuración general
	Wait For(Fx_Cargar_Configuracion_Estacion_Y_General(Empresa_X_Defecto,Modalidad_X_Defecto)) Complete (Result As Int)
	
	If Result = 0 Then
		Msgbox2Async("No se reconoce la modalidad para el dispositivo. Modalidad:" & Modalidad_X_Defecto  & CRLF & _
					 "Id del dispositivo: " & Variables.Global_IdDispositivo , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return 0
	End If
	
	'7.- Cargar monedas
	
	Wait For(Sb_Cargar_Modedas) Complete (Result As Int)
	
	If Result = 0 Then
'		Msgbox2Async("No se reconoce la modalidad para el dispositivo. Modalidad:" & Modalidad_X_Defecto  & CRLF & _
'					 "Id del dispositivo: " & Variables.Global_IdDispositivo , "Validación", "Ok", "", "", bmp1, False)
'		Wait For Msgbox_Result (Result As Int)
		Return 0
	End If
	
	'8.- Revisar si existe carpeta TMP en Servidor Web Service.
	Wait For(Sb_Revisar_Carptea_Tmp_Servidor) Complete (ResultTmp As Boolean)
	
	If Not(ResultTmp) Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async(vError, "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return 2
	End If
	
	Dim CLFx As ClFunciones
	CLFx.Initialize
	
	Wait For(CLFx.Sb_ExisteTabla("@WMS_GATEWAY_STOCK")) Complete (ResultTmp As Boolean)
	Variables.Global_ExisteTabla_MS_GATEWAY_STOCK = ResultTmp
	
	'10.- Traemos los datos para despacho simple Villar
	Wait For(Fx_Cargar_Sis_DespachoSimple_DocDestino) Complete (Result As Int)
	Wait For(Fx_Cargar_Sis_DespachoSimple_Tipo) Complete (Result As Int)
	Wait For(Fx_Cargar_Sis_DespachoSimple_TipoPago) Complete (Result As Int)
	
	Return 1
	
End Sub

Sub Sb_Cargar_Modedas As ResumableSub
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select TOP 1 * From TABMO Where KOMO = '$'"
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	'ProgressDialogShow("Cargando Monedas...")
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Variables.Global_Row_Moneda = Funciones.Fx_DataRow(Js.GetString)
			
			Consulta_Sql = "Select TOP 1 * From MAEMO Where KOMO = 'US$' AND FEMO = '20200110' Order by IDMAEMO DESC"
			
			Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
			Wait For (Js) JobDone(Js As HttpJob)
		
			If Js.Success Then
						
				Dim vJson As String = Js.GetString
						
				If  vJson <> $"{"Table":[]}"$ Then
		
					Variables.Global_Row_Dolar = Funciones.Fx_DataRow(Js.GetString)
					
					Return 1

				End If
				
			Else
					
				'ProgressDialogHide
								
				Dim bmp1 As Bitmap
	
				bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
				Msgbox2Async("No existe tasa de cambio del dolar del hoy", "Validación", "Ok", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
				Log(Js.ErrorMessage)
	
			End If
		
		End If
		
	Else
			
		'ProgressDialogHide
								
		Dim bmp1 As Bitmap
	
		bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
		Msgbox2Async("Error al buscar la moneda $", "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Log(Js.ErrorMessage)
	
	End If
	
	Return 0
	
End Sub

Sub Sb_Revisar_Carptea_Tmp_Servidor As ResumableSub
	
	Dim ExisteRuta As Boolean
	vError = ""
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_RevCarpetaTmp(Me)
	Wait For (Js) JobDone(Js As HttpJob)
	'ProgressDialogShow("Revisando existencia de carpeta Tmp en servidor...")
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim Fila As Map = Filas.Get(0)
			
			ExisteRuta = Fila.Get("ExisteRuta")
			vError = Fila.Get("Error")
			
		End If
	
	End If
	
	Return ExisteRuta
	
End Sub

Sub Fx_Cargar_Sis_DespachoSimple_DocDestino() As ResumableSub
	
	Dim Resultado As Int = 0
	
	' Traemos la lista de tipos de documentos para despacho simple
	'ProgressDialogShow("Rescatando SIS_DESPACHOSIMPLE_DOCDESTINO")
	Consulta_Sql = "Select * From " & Variables.Global_BaseBk & "Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_DOCDESTINO'"
																
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
										
			Log("Traemos la lista de tipos de documentos para despacho simple")										
			Variables.Global_Sis_DespachoSimple_DocDestino = Funciones.Fx_DataTable(vJson)
			Resultado = 1
			
		End If
	
	End If
	
	Return Resultado
	
End Sub

Sub Fx_Cargar_Sis_DespachoSimple_Tipo() As ResumableSub
	
	Dim Resultado As Int = 0
	
	' Traemos la lista de tipos de despacho o retiro
	'ProgressDialogShow("Rescatando SIS_DESPACHOSIMPLE_TIPO")
	Consulta_Sql = "Select * From " & Variables.Global_BaseBk & "Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPO'"
																
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
										
			Log("Traemos la lista de tipos de despacho o retiro")										
			Variables.Global_Sis_DespachoSimple_Tipo = Funciones.Fx_DataTable(vJson)
			Resultado = 1
			
		End If
	
	End If
	
	Return Resultado
	
End Sub

Sub Fx_Cargar_Sis_DespachoSimple_TipoPago() As ResumableSub
	
	Dim Resultado As Int = 0
	
	' Traemos la lista de tipos de pago
	'ProgressDialogShow("Rescatando SIS_DESPACHOSIMPLE_TIPOPAGO")
	Consulta_Sql = "Select * From " & Variables.Global_BaseBk & "Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPOPAGO'"
																
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
										
			Log("Traemos la lista de tipos de pago")
			Variables.Global_Sis_DespachoSimple_TipoPago = Funciones.Fx_DataTable(vJson)
			Resultado = 1
			
		End If
	
	End If
	
	Return Resultado
	
End Sub

Sub Sb_Probar_Conexion
	
	Consulta_Sql = "Select Top 1 EMPRESA From CONFIES"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	'ProgressDialogShow("Probando conexión")
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
		Estado = "Conectado"
		End If
	Else
		ProgressDialogHide
		Estado = "Desconectado"
	End If
	
End Sub

