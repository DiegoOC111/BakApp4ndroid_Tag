B4A=true
Group=Default Group\Tomar pedido
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: true
#End Region

Sub Process_Globals
	
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Public Id_DocEnc As Int
	Public Row_Entidad As Map
	
	Public Fila_Encabezado As Map
	Public Fila_Observaciones As Map
	Public Fila_DespaFacil As Map
	
	Public Cambiar_Entidad As Boolean
	Public Crear_NVV_Desde_COV As Boolean
	Public Nuevo_Documento As Boolean
	Public Editar_Documento As Boolean
	Public Idmaeedo_Origen As Int
	Public Nudo_Origen As String
	Public TipoDoc As String
	Public Grabar As Boolean

End Sub

Sub Globals
	
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	'Private smAct2 As SlidingMenu2
	'Private lblSidemen As Label
	
	'Dim CLFx As ClFunciones	
	Dim CLFx2 As ClFunciones2
			
	Private Tab_Post As TabHost
		
	Private Consulta_Sql As String

	Private Chk_Valores_Netos As CheckBox
	Private Lbl_Total_Neto As Label
	Private Lbl_Total_Iva As Label
	Private Lbl_Total_Impuestos As Label
	Private Lbl_Total_Bruto As Label
	
	Private Id_DocDet As Int

	Private IDList As List
	
	Private Lbl_Detalle As Label
	
	Dim Fila_IdEnc As Map
	
	Dim New_Idmaeedo As Int
	
	Private Btn_Limpiar As Button
	
	Private Txt_Observaciones As EditText
	Private Txt_Orden_compra As EditText
	Private Lbl_Centro_Costo As Label
	Private Lbl_CodEntidad As Label
	Private Lbl_CodSucEntidad As Label
	Private Lbl_Rut As Label
	Private Lbl_Nombre As Label
	Private Lbl_Direccion As Label
	Private Lbl_Ciudad As Label
	Private Lbl_Comuna As Label
	'Private Cmd_ListaPrecio As Spinner
	
	Private Txt_Codigo As EditText
	Private Btn_Canbiar_Cliente As Button
	Private XclvDetalle As CustomListView
	Private Label1 As B4XView
	Private Lbl_Codigo As B4XView
	
	Private Lbl_Descripcion As B4XView
	Private Lbl_Datos As B4XView
	Private Lbl_Item As B4XView
	Private Lbl_Items As Label
	
	Private Lbl_FechaEmision As Label
	Private Lbl_Fecha_1er_Vencimiento As Label
	Private Lbl_FechaUltVencimiento As Label
	Private Lbl_Coutas As Label
	Private Lbl_Dias_1er_Vencimiento As Label
	Private Lbl_Dias_Vencimiento As Label
	
	Private Btn_Limpiar_Codigo As Button
	Private Btn_Grabar As Button
	
	Private Txt_Flp_WebService As B4XFloatTextField
	Private InputTemplate As B4XInputTemplate
	Private LongTextTemplate As B4XLongTextTemplate
	Private Btn_DsctoGlobal As Button
	
	Private Hay_Descuentos_Globales As Boolean
	
	Private Btn_ListaPrecio As Button
	Private SearchTemplate As B4XSearchTemplate
	
	Private DespSimple_DocDestino As B4XSearchTemplate
	Private DespSimple_Tipo As B4XSearchTemplate
	Private DespSimple_TipoPago As B4XSearchTemplate
	
	Private Lbl_Lista_Precios As Label
	Dim Cl_PermisoX As Cl_PermisoXui

	Private B4A_DespachoSimple As Boolean

	Private Lbl_TipoDespacho As Label
	Private Lbl_TipoPagoDesp As Label
	Private Lbl_CodDocDestino As Label
	Private Txt_DireccionDesp As EditText
	Private Txt_TransporteDesp As EditText
	Private Txt_ObservacionesDesp As EditText
	Private Btn_TipoDespachoSimple As Button
	Private Btn_TipoPagoDesp As Button
	Private Btn_CodDocDestino As Button
	
	Private bmp1 As Bitmap
	Private bmp2 As Bitmap
	
	Private Lbl_DireccionDesp As Label
	Private Lbl_TransporteDesp As Label
	Private Lbl_ObservacionesDesp As Label
	Private Lbl_Observaciones As Label
	
	Dim BuscandoProducto As Boolean
	Dim BuscandoEntidad As Boolean
	Dim EditandoProducto As Boolean
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Cp_Post_01_Detalle")

	Activity.LoadLayout("Cp_Post")

	'CLFx.Initialize
	CLFx2.Initialize(Null,"")
	CLFx2.DesignerCreateView(Activity,Null,Null)
	
	Grabar = False
	
	bmp1 = LoadBitmap(File.DirAssets, "user.png") :	bmp2 = LoadBitmap(File.DirAssets, "user_.png")
	Tab_Post.AddTabWithIcon ("", bmp2, bmp1, "Cp_Post_01_Encabezado") 'load the layout file of each page
	
	bmp1 = LoadBitmap(File.DirAssets, "view_details.png") :	bmp2 = LoadBitmap(File.DirAssets, "view_details_.png")
	Tab_Post.AddTabWithIcon ("", bmp2, bmp1, "Cp_Post_01_Detalle") 'load the layout file of each page
	
	bmp1 = LoadBitmap(File.DirAssets, "calc.png") :	bmp2 = LoadBitmap(File.DirAssets, "calc_.png")
	Tab_Post.AddTabWithIcon ("", bmp2, bmp1, "Cp_Post_01_Totales") 'load the layout file of each page
	
	bmp1 = LoadBitmap(File.DirAssets, "comment.png") :	bmp2 = LoadBitmap(File.DirAssets, "comment_.png")
	Tab_Post.AddTabWithIcon ("", bmp2, bmp1, "Cp_Post_01_Observaciones") 'load the layout file of each page
	
	B4A_DespachoSimple = Variables.Global_Row_Configuracion_Estacion.Get("B4A_DespachoSimple")
	
	If B4A_DespachoSimple Then
		
		bmp1 = LoadBitmap(File.DirAssets, "delivery.png") :	bmp2 = LoadBitmap(File.DirAssets, "delivery_.png")
		Tab_Post.AddTabWithIcon ("", bmp2, bmp1, "Cp_Post_01_DespSimple") 'load the layout file of each page
		'Tab_Post.Visible = B4A_DespachoSimple
	
	End If
	
	Cl_PermisoX.Initialize(Null,"")
	Cl_PermisoX.DesignerCreateView(Activity,Null,Null)
	
	Tab_Post.CurrentTab = 1
	
	InputTemplate.Initialize
	LongTextTemplate.Initialize
	SearchTemplate.Initialize
	
	DespSimple_DocDestino.Initialize
	DespSimple_Tipo.Initialize
	DespSimple_TipoPago.Initialize
	
	Dim Items As List
	Items.Initialize

	For Each Fila As Map In Variables.Global_Listas_Precios_Usuario
		Dim Nokolt As String = Fila.Get("Nokolt")
		Dim Name As String = Nokolt.Trim
		Items.Add(Name)
	Next
	SearchTemplate.SetItems(Items)
	Items.Clear
	
	For Each Fila As Map In Variables.Global_Sis_DespachoSimple_DocDestino
		'Dim CodigoTabla As String  = Fila.Get("CodigoTabla")
		Dim NombreTabla As String  = Fila.Get("NombreTabla")
		Dim Name As String = NombreTabla.Trim
		Items.Add(Name)
	Next
	DespSimple_DocDestino.SetItems(Items)
	Items.Clear
	
	For Each Fila As Map In Variables.Global_Sis_DespachoSimple_Tipo
		'Dim CodigoTabla As String  = Fila.Get("CodigoTabla")
		Dim NombreTabla As String  = Fila.Get("NombreTabla")
		Dim Name As String = NombreTabla.Trim
		Items.Add(Name)
	Next
	DespSimple_Tipo.SetItems(Items)
	Items.Clear
	
	For Each Fila As Map In Variables.Global_Sis_DespachoSimple_TipoPago
		'Dim CodigoTabla As String  = Fila.Get("CodigoTabla")
		Dim NombreTabla As String  = Fila.Get("NombreTabla")
		Dim Name As String = NombreTabla.Trim
		Items.Add(Name)
	Next
	DespSimple_TipoPago.SetItems(Items)
	Items.Clear
	
End Sub


Sub Activity_Resume
	
	Hay_Descuentos_Globales = False
	
	Wait For(Sb_Titulo) complete(res As Boolean)
	
	If Cambiar_Entidad Then
		Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,True,True,True)
		DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
		Cambiar_Entidad = False
		Return
	End If
	
	If BuscandoProducto Then
		If Not(Buscar_productos.Msj.EsCorrecto) Then
			BuscandoProducto = False
			Return
		End If
	End If
	
	If BuscandoEntidad Then
		If Not(Buscar_entidad.Msj.EsCorrecto) Then
			BuscandoEntidad = False
			Return
		End If
	End If
	
	If EditandoProducto Then		
		EditandoProducto = False
		If Not(Frm_Post_01_Producto.Msj.EsCorrecto) Then
			Return
		End If
	End If	
		
	If Id_DocEnc = 0 Or Nuevo_Documento Then

		Consulta_Sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1"
		Fila_Encabezado = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
		If Not(Fila_Encabezado.IsInitialized) Then
			Sb_Nuevo_Documento
		Else
			Wait For (Sb_Cargar_Documento(True)) Complete (Listo As Boolean)
		End If
		
	Else
		
		Wait For (Sb_Cargar_Documento(False)) Complete (Listo As Boolean)
			
	End If
	
	Txt_Codigo.Text = ""
	Lbl_Items.Text = "Total Items: 0"
	
	Frm_Post_01_Producto.ModoConsulta = False
	
	Sb_Cargar_Detalle(True)
	
End Sub

Private Sub Sb_Titulo As ResumableSub
	
	Activity.Title = "New Doc..." & Variables.Gl_Sucursal
	
	If Crear_NVV_Desde_COV Then
		Activity.Title = "NVV desde COV: " & Nudo_Origen
	Else
		If Editar_Documento Then
			Activity.Title = "Editando: " & TipoDoc & "-" & Nudo_Origen
		End If
	End If
	
	Return True
End Sub

Sub Sb_Cargar_Documento(Nuevo_Doc As Boolean) As ResumableSub
	
	If Nuevo_Doc Then
		'Cargamos el encabezado en la variable
		Consulta_Sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1"
		Fila_Encabezado = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	Else
		'Cargamos el encabezado en la variable
		Consulta_Sql = "Select * From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
		Fila_Encabezado = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	End If

	'Rescatamos el Id del nuevo documento
	Id_DocEnc = Fila_Encabezado.Get("id_docenc")

	'Cargamos los datos de nustra varible para las ediciones del encabezado y las observaciones
	Consulta_Sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)

	'Cargamos las observaciones en la variable
	Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_Observaciones = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
	If Not(Fila_Observaciones.IsInitialized)  Then
		
		'Insertamos una fila en las observaciones
		Consulta_Sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)"
		Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As String (Id_DocEnc))

		'Cargamos las observaciones en la variable
		Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
		Fila_Observaciones = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	End If
	
	Txt_Observaciones.Text = Fila_Observaciones.Get("observaciones")
	Txt_Orden_compra.Text = Fila_Observaciones.Get("orden_compra")
	
	'Cargamos las lod datos del despacho simple
	Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	If Not(Fila_DespaFacil.IsInitialized)  Then
	
		Consulta_Sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)"
		Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As String (Id_DocEnc))
		
		Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
		Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
	End If
	
	If B4A_DespachoSimple Then

		Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get("CodTipoDespacho".ToLowerCase)
		Lbl_TipoDespacho.Text = Fila_DespaFacil.Get("TipoDespacho".ToLowerCase)
	
		Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get("CodTipoPagoDesp".ToLowerCase)
		Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get("TipoPagoDesp".ToLowerCase)
	
		Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get("CodDocDestino".ToLowerCase)
		Lbl_CodDocDestino.Text = Fila_DespaFacil.Get("DocDestino".ToLowerCase)
	
		Txt_TransporteDesp.Text =  Fila_DespaFacil.Get("TransporteDesp".ToLowerCase)
		Txt_DireccionDesp.Text =  Fila_DespaFacil.Get("DireccionDesp".ToLowerCase)
		Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get("ObservacionesDesp".ToLowerCase)
		
	End If
	
	Log("Documento cargado... Id_DocEnc = " & Id_DocEnc)
	
	Wait For (Sb_Cargar_Entidad(Editar_Documento)) Complete (Fin As Boolean)
		
	If Row_Entidad.IsInitialized Then
		
		Lbl_CodEntidad.Text = Row_Entidad.Get("KOEN")
		Lbl_CodSucEntidad.Text = Row_Entidad.Get("SUEN")
		Lbl_Rut.Text = Row_Entidad.Get("Rut")
		Lbl_Nombre.Text = Row_Entidad.Get("NOKOEN")
		Lbl_Direccion.Text = Row_Entidad.Get("DIEN")
		Lbl_Ciudad.Text = Row_Entidad.Get("CIUDAD")
		Lbl_Comuna.Text = Row_Entidad.Get("COMUNA")
				
	Else
	
		Lbl_CodEntidad.Text = ""
		Lbl_CodSucEntidad.Text = ""
		Lbl_Rut.Text = ""
		Lbl_Nombre.Text = ""
		Lbl_Direccion.Text = ""
		Lbl_Ciudad.Text = ""
		Lbl_Comuna.Text = ""
					
	End If
		
	Dim ListaPrecios As String = Fila_Encabezado.Get("ListaPrecios".ToLowerCase)
	
	For i = 0 To Variables.Global_Listas_Precios_Usuario.Size - 1
		
		Dim m As Map = Variables.Global_Listas_Precios_Usuario.Get(i)
		Dim Kolt As String = m.Get("Kolt")
		Dim Nokolt As String = m.Get("Nokolt")
			
		If ListaPrecios = Kolt Then
			Lbl_Lista_Precios.Text = Nokolt
			Exit
		End If
					
	Next
	
	Try
		' ACA SE CAE LA APLICACION *****
		Lbl_FechaEmision.Text = DateTime.Date(Fila_Encabezado.Get("Fechaemision".ToLowerCase))
		Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fila_Encabezado.Get("Fecha_1er_Vencimiento".ToLowerCase))
		Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila_Encabezado.Get("FechaUltVencimiento".ToLowerCase))
	Catch
		Log(LastException)
	End Try
		
	Lbl_Coutas.Text = Fila_Encabezado.Get("Cuotas".ToLowerCase)
	Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.Get("Dias_1er_Vencimiento".ToLowerCase)
	Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get("Dias_Vencimiento".ToLowerCase)
		
	Wait For(Sb_VisibleOcultarDespachoSimple) complete (res As Boolean)
		
	' Las fechas se deben trabajar en formato Long y transformarlas en formato fecha
	Return True
	
End Sub

Sub Sb_Cargar_Documento2
	
'	'Cargamos el encabezado en la variable
	Consulta_Sql = "Select * From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_Encabezado = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
'
'	'Rescatamos el Id del nuevo documento
'	Id_DocEnc = Fila_Encabezado.Get("id_docenc")

	'Cargamos los datos de nustra varible para las ediciones del encabezado y las observaciones
	Consulta_Sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)

	'Cargamos las observaciones en la variable
	Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_Observaciones = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Txt_Observaciones.Text = Fila_Observaciones.Get("observaciones")
	Txt_Orden_compra.Text = Fila_Observaciones.Get("orden_compra")
	
	
	'Cargamos las lod datos del despacho simple
	Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get("CodTipoDespacho".ToLowerCase)
	Lbl_TipoDespacho.Text = Fila_DespaFacil.Get("TipoDespacho".ToLowerCase)
	
	Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get("CodTipoPagoDesp".ToLowerCase)
	Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get("TipoPagoDesp".ToLowerCase)
	
	Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get("CodDocDestino".ToLowerCase)
	Lbl_CodDocDestino.Text = Fila_DespaFacil.Get("DocDestino".ToLowerCase)
	
	Txt_DireccionDesp.Text =  Fila_DespaFacil.Get("DireccionDesp".ToLowerCase)
	Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get("ObservacionesDesp".ToLowerCase)
	
	Log("Documento cargado... Id_DocEnc = " & Id_DocEnc)
	
	Wait For (Sb_Cargar_Entidad(False)) Complete (Fin As Boolean)
	
	' Las fechas se deben trabajar en formato Long y transformarlas en formato fecha
	
	Lbl_FechaEmision.Text = DateTime.Date(Fila_Encabezado.Get("Fechaemision".ToLowerCase))
	Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fila_Encabezado.Get("Fecha_1er_Vencimiento".ToLowerCase))
	Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila_Encabezado.Get("FechaUltVencimiento".ToLowerCase))
	
	Lbl_Coutas.Text = Fila_Encabezado.Get("Cuotas")
	Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.Get("Dias_1er_Vencimiento")
	Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get("Dias_Vencimiento")
	
End Sub

Sub Sb_Cargar_Entidad(ActualizarDatos As Boolean) As ResumableSub
	
	Dim xui As XUI
	
	Dim Koen As String = Fila_Encabezado.Get("CodEntidad".ToLowerCase)
	Dim Suen As String = Fila_Encabezado.Get("CodSucEntidad".ToLowerCase)
	Dim Nokoen As String = Fila_Encabezado.Get("Nombre_Entidad".ToLowerCase)
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me,Koen,Suen)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Row_Entidad =Filas.Get(0)
			  
			If ActualizarDatos Then
				Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,False,Editar_Documento,False)
			End If
			Log("Entidad cargada " & Koen.Trim & " - " & Nokoen)
																
		Else
			'Fila = Null
		End If
			
	Else
		Log(Js.ErrorMessage)
	End If
		
	Return True
			
End Sub


Sub Sb_Cargar_Detalle(Cargar_Activity As Boolean)
		   
'	Consulta_Sql = "Select Codigo,Descripcion,Cantidad,Precio,descuentoporc,valnetolinea From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc
'	DBUtils.ExecuteListView_Detalle_Productos(Variables.vSql, Consulta_Sql, Null, 0, Lv_Detalle)

	Wait For(Sb_Titulo) complete(res As Boolean)

	If Cargar_Activity Then
		If Frm_Post_01_Producto.Id_DocDet <> 0 Then
			StartActivity(Frm_Post_01_Producto)
			Return
		End If
	End If
		
	Dim xui As XUI
	XclvDetalle.DefaultTextBackgroundColor = Colors.Transparent
	XclvDetalle.Clear
	Private Row As Int
	Private Cursor1 As Cursor
	
	IDList.Initialize

	Dim RowNumber As Int = 0
	Dim ItemStr As String

	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea,Bodega " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
	If Cursor1.RowCount > 0 Then
		
		RowNumber = Cursor1.RowCount
		
		For Row = 0 To RowNumber - 1
			
			Cursor1.Position = Row
			IDList.Add(Cursor1.GetString2(0))
			
			Dim Id_DocDet As Int = Cursor1.GetString("Id_DocDet")
			Dim Codigo As String = Cursor1.GetString("Codigo")
			Dim Descripcion As String = Cursor1.GetString("Descripcion")
		
			Dim Cantidad As String  =  NumberFormat(Cursor1.GetString("Cantidad"),0,2)
			Dim UdTrans As String = Cursor1.GetString("UdTrans")
			Dim Tict As String = Cursor1.GetString("Tict")
			Dim Prct As Int = Cursor1.GetString("Prct")
			Dim Precio As String  = "$ " &  NumberFormat(Cursor1.GetString("Precio"),0,2)
			Dim descuentoporc As String = NumberFormat(Cursor1.GetString("DescuentoPorc"),0,2)
			Dim valnetolinea As String = "$ " &  NumberFormat(Cursor1.GetString("ValNetoLinea"),0,0)
			Dim Bodega As String = Cursor1.GetString("Bodega")
												
			If Descripcion.Length > 35 Then
				Descripcion = Funciones.Mid(Descripcion,1,35)
			End If
		
			If Cursor1.GetString("DescuentoPorc") = 0 Then
				descuentoporc = ""
			Else
				descuentoporc = " -%." & descuentoporc & " "
			End If
											
			Dim Item As Int = Row+1
			ItemStr = Funciones.Rellenar_Izquierda(Item,2,"0")
													
			Dim Datos As String = "Cant. " & UdTrans & " " & Cantidad & " X " & Precio & descuentoporc & CRLF & "Total: " & valnetolinea & ".-		Bod: " & Bodega
			
			Dim p As B4XView = xui.CreatePanel("")
			
			p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,130dip)
			p.LoadLayout("Items_Detalle")
			p.Color = Colors.Transparent

			Lbl_Codigo.Tag = Id_DocDet
			Lbl_Codigo.Text = Codigo
			Lbl_Descripcion.Tag = Tict
			Lbl_Descripcion.Text = Descripcion
			Lbl_Item.Tag = Prct
			Lbl_Item.Text = "Item: " & ItemStr
			Lbl_Datos.Text = Datos
			
			
'			' Dim bmp1 As Bitmap
'	
'			bmp1 = LoadBitmap(File.DirAssets, "symbol-delete.png")
'			Img_Eliminar.SetBitmap(bmp1.Resize(40dip, 30dip, True))' (SignatureTemplate.Bitmap.Resize(ImageView1.Width, ImageView1.Height, True))
			
			XclvDetalle.Add(p,"")
			
		Next
		
	Else
		ToastMessageShow("No items found", False)
	End If
	
	Cursor1.Close
	
	Sb_Sumar_Totales

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		
		Private vSalir As Int
		' Dim bmp1 As Bitmap
	
		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
		
		vSalir = Msgbox2("¿Estas seguro de salir de la venta?", "S A L I R", "Si", "", "No", bmp1)
		If vSalir = DialogResponse.POSITIVE Then
			
			Private Cursor1 As Cursor
			
			Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
			If Crear_NVV_Desde_COV Or Editar_Documento Or Cursor1.RowCount = 0 Then
				
				Funciones.Sb_Borrar_Todos_Registros_De_Tabla("Encabezado_Doc","Id_DocEnc")
				Funciones.Sb_Borrar_Todos_Registros_De_Tabla("Detalle_Doc","Id_DocEnc")
				Funciones.Sb_Borrar_Todos_Registros_De_Tabla("Descuentos_Doc","Id_DocEnc")
				Funciones.Sb_Borrar_Todos_Registros_De_Tabla("Impuestos_Doc","Id_DocEnc")
				Funciones.Sb_Borrar_Todos_Registros_De_Tabla("Observaciones_Doc","Id_DocEnc")
				Funciones.Sb_Borrar_Todos_Registros_De_Tabla("DespaFacil_Doc","Id_DocEnc")
				
			Else
								
				Sb_GrabarObservacionesDespachos
				
			End If
			
			Return False
		Else
			Return True
			
		End If
	End If
	Return False
	
End Sub

Sub Btn_Editar_Click
	
	' Dim bmp1 As Bitmap

	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	If	Hay_Descuentos_Globales Then
		Msgbox2Async("EXISTEN DESCUENTOS GLOBALES" & CRLF & _
		"NO PUEDE EDITAR LA FILA" & CRLF & _
		"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION","Doc. VISADO", "Ok","","", bmp1, True)
		Return
	End If
	
	Dim Btn As Button = Sender
	
	Id_DocDet = Btn.Tag
	EditandoProducto = True
	Frm_Post_01_Producto.Id_DocDet = Id_DocDet
	StartActivity(Frm_Post_01_Producto)
	
End Sub

Sub Txt_Codigo_EnterPressed
	
	' Dim bmp1 As Bitmap
	
	'bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	If	Hay_Descuentos_Globales Then
		Msgbox2Async("EXISTEN DESCUENTOS GLOBALES" & CRLF & _
		"NO PUEDE AGREMAR MAS ITEM" & CRLF & _
		"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS","Doc. VISADO", "Ok","","", bmp1, True)
		Return
	End If
	
	Wait For(Sb_ProductoModoConsulta) Complete (RsMosCs As Boolean)
	If Not(RsMosCs) Then
		Return
	End If
	
	Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return
	End If
	
	Sb_GrabarObservacionesDespachos
	
	Dim Codigo As String = Txt_Codigo.Text.Trim
	
	If Codigo = "" Then
		Txt_Codigo.Text = ""
		StartActivity(Buscar_productos)
		Return
	End If
	
	ProgressDialogShow("Buscando producto...")
		
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String =  Fila_Encabezado.Get("ListaPrecios".ToLowerCase)' Variables.Gl_Lista_Precios

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me,Codigo,Empresa,Sucursal,Bodega,Lista,1,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim Fila As Map = Filas.Get(0)
			
			Dim ErrorStr As String =Fila.Get("Codigo")
	
			If ErrorStr.Contains("Error_")  Then
				ProgressDialogHide
				Buscar_productos.ProductoABuscar = Txt_Codigo.Text.Trim
				StartActivity(Buscar_productos)
				Return
			End If
				
			Fila.Put("Id_DocEnc",Id_DocEnc)

			DBUtils.InsertMaps(Variables.vSql,"Detalle_Doc",Filas)
			
			Consulta_Sql = "Select * From Detalle_Doc Order by Id_DocDet Desc"
			Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
				
			DateTime.DateFormat = "dd-MM-yyyy"

			' Las fechas se deben trabajar en formato Long y transformarlas en formato fecha
			Dim FechaEmision As Long = DateTime.Now
				
			New_Row.Put("fechaemision",FechaEmision)
			New_Row.Put("fecharecepcion",FechaEmision)
			
			New_Row.Put("moneda",Variables.Global_Row_Moneda.Get("KOMO"))
			New_Row.Put("tipo_moneda",Variables.Global_Row_Moneda.Get("TIMO"))
			New_Row.Put("tipo_cambio",Variables.Global_Row_Moneda.Get("VAMO"))
			New_Row.Put("codlista",Lista)
				
			Dim Id_DocDet As Int = New_Row.Get("id_docdet")
				
			Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
			Dim Fila_Id As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
				
			DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",New_Row,Fila_Id)
			 		
			Frm_Post_01_Producto.Id_DocDet = New_Row.Get("id_docdet")
			StartActivity(Frm_Post_01_Producto)					
			
		End If
						
	Else
		Log(Js.ErrorMessage)
		'ToastMessageShow("PRODUCTO NO ENCONTRADO", False)
		'Txt_Codigo.Text = ""
		Buscar_productos.ProductoABuscar = Txt_Codigo.Text.Trim
		StartActivity(Buscar_productos)
	End If
		
	ProgressDialogHide
		
End Sub



Sub Sb_Traer_Concepto(Concepto As String)
	
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String = Variables.Gl_Lista_Precios

	Sb_GrabarObservacionesDespachos

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me,Concepto,Empresa,Sucursal,Bodega,Lista,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
	ProgressDialogShow("Buscando concepto...")
	
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim Fila As Map = Filas.Get(0)
				
			Fila.Put("Id_DocEnc",Id_DocEnc)

			Fila.Put("moneda",Variables.Global_Row_Moneda.Get("KOMO"))
			Fila.Put("tipo_moneda",Variables.Global_Row_Moneda.Get("TIMO"))
			Fila.Put("tipo_cambio",Variables.Global_Row_Moneda.Get("VAMO"))
				
			DBUtils.InsertMaps(Variables.vSql,"Detalle_Doc",Filas)
			
			Consulta_Sql = "Select * From Detalle_Doc Order by Id_DocDet Desc"
			Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
			 			 
			Consulta_Sql = "Select * From Detalle_Doc Where Id_DocDet = " & Id_DocDet
			Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
			
			Dim Id_DocDet As Int = New_Row.Get("id_docdet")
				
			Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
			Dim Fila_Id As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
				
			DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",New_Row,Fila_Id)			
				
			Sb_Procesar_Fila("DescuentoPorc",Fila)
						 
			Frm_Post_01_Producto.Id_DocDet = New_Row.Get("id_docdet")
			StartActivity(Frm_Post_01_Producto)
			
		End If
						
	Else
		Log(Js.ErrorMessage)
		ToastMessageShow("CONCEPTO NO ENCONTRADO", False)
		'Txt_Codigo.Text = ""
		Buscar_productos.ProductoABuscar = Txt_Codigo.Text.Trim
		StartActivity(Buscar_productos)
	End If
		
End Sub


Sub Sb_Procesar_Fila(Cabeza As String, Id_DocDet2 As Int)
	
	Dim Fila,Fila_Id As Map
	
	Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet2
	Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocDet = " & Id_DocDet2
	Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Dim UnTrans As Int = Fila.Get("untrans")
	Dim PorIva As Double = Fila.Get("poriva")
	Dim PorIla As Double = Fila.Get("porila")
	Dim Rtu As Double = Fila.Get("rtu")

	Dim Impuestos As  Double = 1 + ((PorIva + PorIla) / 100)
	
	Dim TotalIva As Double
	Dim TotalIla As Double
	Dim TotalNeto As Double
	Dim TotalBruto As Double

	Dim TotalDsctoNeto As Double
	Dim TotalDsctoBruto As Double

	Dim Precio As Double = Fila.Get(Cabeza.ToLowerCase)

	Dim PrecioNeto As Double
	Dim PrecioBruto As Double

	Dim PrecioNetoRealUd1 As Double
	Dim PrecioNetoRealUd2 As Double

	Dim Total As Double

	Dim Decimal = 2
	
	Dim Cantidad As Double
	Dim CantUd1 As Double
	Dim CantUd2 As Double
	
	Dim Divisible As String '= RowProducto.Get("DIVISIBLE")
	Dim Divisible2 As String '= RowProducto.Get("DIVISIBLE2")
	
	Dim DescuentoValor As Double = Fila.Get("descuentovalor")
	Dim DescuentoPorc As Double = Fila.Get("descuentoporc")
	Dim DescuentoPorc_Original As Double = Fila.Get("descuentoporc")
	Dim DescMaximo As Double = Fila.Get("descmaximo")

	Dim Tict = Fila.Get("tict")
	Dim Prct = Fila.Get("prct")
	Dim Tipr = Fila.Get("tipr")

	Dim CodLista As String = Fila.Get("codlista")

	Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tables("Descuentos_Doc").Compute("Count(Podt)", "Id = " & _Id & " And Podt > 0")

	Dim No_Aplica_Redondeo As Boolean '= Fila.Get("no_aplica_redondeo")
	Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_Cero.Checked

	If No_Aplica_Redondeo Then
		Aplicar_Redondeo = False
	End If

	Dim TotalNeto_Calculo As Double
	Dim TotalBruto_Calculo As Double

	Dim Descontar As Boolean
	Dim Total_Concepto As Double

	'SI EL PRODUCTO ES UN CONCEPTO DE DESCUENTO O RECARGO

	Dim DescuentoValor_Anterior As Double = Fila.Get("descuentovalor_anterior")
	Dim Recargo As Double

	If Cantidad = 0 And Tipr <> "" Then
		'Fila.Get("DescuentoPorc") = 0
	End If
	
'	Dim phone1 As Phone
'	phone1.HideKeyboard(Activity)

	Dim Precio_Calculado As Double
	
	Dim Moneda_Enc As String = Fila_Encabezado.Get("moneda_doc")
	Dim Tipo_Moneda_Enc As String = Fila_Encabezado.Get("tipomoneda")
	Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.Get("tasadorig_doc")

	Dim Moneda_Det As String = Fila.Get("moneda")
	Dim Tipo_Moneda_Det As String = Fila.Get("tipo_moneda")
	Dim Tipo_Cambio_Det As Double = Fila.Get("tipo_cambio")
	
	Dim Decimales = 2
	
	If Moneda_Det.Trim <> Moneda_Enc.Trim Then
		If Tipo_Moneda_Enc = "N" Then
			Precio_Calculado = Round2(Precio * Tipo_Cambio_Ent, 2)
		Else
			Precio_Calculado = Round2(Precio / Tipo_Cambio_Ent, 2)
			Decimales = 2
		End If
	Else
		If Tipo_Moneda_Enc <> "N" Then
			Decimales = 2
		End If
		Precio_Calculado = Precio
	End If

'	TecladoSoft.HideKeyboard
		
	Dim Divi As String
	
	If UnTrans = 1 Then
		Divi = Divisible
	End If
	
	If UnTrans = 2 Then
		Divi = Divisible2
	End If
	
'	If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi)) Then
'			
'		Msgbox2("El producto solo permite cantidades enteras","Validación","Ok","","", Null)
'		Cantidad = 0
'		Txt_Cantidad.Tag = 0
'		Txt_Cantidad.Text = ""
'		Txt_Cantidad.SelectAll
'		TecladoSoft.ShowKeyboard(Txt_Cantidad)
'		Return
'	
'	End If
	
	If UnTrans = 1 Then
		If Rtu = 1 Then
			CantUd1 = Cantidad
			CantUd2 = Cantidad * Rtu
		Else
			CantUd1 = Cantidad
			CantUd2 = Cantidad / Rtu
		End If
	End If
	
	If UnTrans = 2 Then
		If Rtu > 1 Then
			CantUd2 = Cantidad
			CantUd1 = Cantidad * Rtu
		Else
			CantUd2 = Cantidad
			CantUd1 = Cantidad / Rtu
		End If
	End If

	If Prct = 1 Then

		'Total_Concepto '= Fila.Get(_Cabeza)

		'If ChkValores.Checked Then
		'    _Precio = Grilla_Encabezado.Rows(0).Cells("TotalNetoDoc").Value
		'Else
		'    _Precio = Grilla_Encabezado.Rows(0).Cells("TotalBrutoDoc").Value
		'End If

		TotalNeto_Calculo = Lbl_Total_Neto.Tag
		TotalBruto_Calculo = Lbl_Total_Bruto.Tag

		If Tict = "D" Then

			Descontar = True
			Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1
			TotalNeto_Calculo = TotalNeto_Calculo + DescuentoValor_Anterior
			
			If Cabeza = "DescuentoPorc" Then
				
				If Chk_Valores_Netos.Checked Then
					DescuentoValor = Round2((DescuentoPorc / 100) * TotalNeto_Calculo, Decimales)
					'If Aplicar_Redondeo Then Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalNeto_Calculo) * 100, 5)
				Else
					DescuentoValor = Round2((DescuentoPorc / 100) * TotalBruto_Calculo,Decimales)
					'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalBruto_Calculo) * 100, 5)
				End If

			Else If Cabeza = "DescuentoValor" Then

				If Chk_Valores_Netos.Checked Then
					'If Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalNeto_Calculo) * 100, 5)
				Else
					'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalBruto_Calculo) * 100, 5)
				End If

			End If

		Else If Tict = "R" Then

			Total_Concepto = Fila.Get("valnetolinea")
			Recargo = Fila.Get("recargovalor")

			If Chk_Valores_Netos.Checked Then
				TotalNeto = Total_Concepto
			Else
				TotalNeto = Round2(Total_Concepto / Impuestos, 3)
				TotalBruto = Total_Concepto
			End If

			If Cabeza = "DescuentoPorc" Then

				TotalNeto_Calculo = TotalNeto_Calculo - Recargo
				TotalBruto_Calculo = TotalBruto_Calculo - Recargo

				DescuentoPorc = DescuentoPorc / 100

				If Chk_Valores_Netos.Checked Then
					
					TotalNeto = Round2((1 + DescuentoPorc) * TotalNeto_Calculo, Decimales)
					Recargo = Round2(TotalNeto - TotalNeto_Calculo, Decimales)
					'If _Aplicar_Redondeo Then _Recargo = Fx_Redondeo_Descuento(_Recargo, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((Recargo / TotalNeto_Calculo) * 100, 5)
					TotalNeto = Recargo
					
				Else
					
					Recargo = Round2((DescuentoPorc / 100) * TotalBruto_Calculo,Decimales)
					'If _Aplicar_Redondeo Then _Recargo = Fx_Redondeo_Descuento(_Recargo, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((Recargo / TotalBruto_Calculo) * 100, 5)
					
				End If

			Else If Cabeza = "ValNetoLinea" Then

				TotalNeto_Calculo = TotalNeto_Calculo - Recargo
				TotalBruto_Calculo = TotalBruto_Calculo - Recargo

				If Chk_Valores_Netos.Checked Then
					'If _Aplicar_Redondeo Then _Total_Concepto = Fx_Redondeo_Descuento(_Total_Concepto, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((Total_Concepto / (TotalNeto_Calculo)) * 100, 5)
				Else
					'If _Aplicar_Redondeo Then _Total_Concepto = Fx_Redondeo_Descuento(_Total_Concepto, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / (TotalBruto_Calculo)) * 100, 5)
				End If

				Recargo = Total_Concepto

			End If

			DescuentoValor = 0

		End If

		'DsctoNeto = 0	'.Cells("DsctoNeto").Value = 0
		'.Cells("DsctoBruto").Value = 0
		'.Cells("ValIvaLinea").Value = 0
		'.Cells("ValIlaLinea").Value = 0
		'.Cells("ValNetoLinea").Value = 0
		'.Cells("ValBrutoLinea").Value = 0
		'.Cells("PrecioNetoRealUd1").Value = 0
		'.Cells("PrecioNetoRealUd2").Value = 0
		'.Cells("SubTotal").Value = 0

	Else

		If Chk_Valores_Netos.Checked Then
			PrecioNeto = Precio_Calculado
		Else
			PrecioNeto = Round2(Precio_Calculado / Impuestos, 3)
			PrecioBruto = Precio_Calculado
		End If

		TotalNeto = Round2(PrecioNeto * Cantidad, 3)
		TotalBruto = Round2((TotalNeto * Impuestos), Decimales)

		If Cabeza = "Cantidad" And Tict = "" Then

			DescuentoPorc = 0
			DescuentoValor = 0
			'.Cells("DescuentoPorc").Value = _DescuentoPorc
			'.Cells("DescuentoValor").Value = _Descuento
			''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''Eliminar_Campos(_Ds_Matriz_Documentos.Tables("Descuentos_Doc"), _Id)

		End If

		'If CBool(_Prct) Then
		'    _TotalNeto_Calculo = _Precio '_TblEncabezado.Rows(0).Item("TotalNetoDoc")
		'    _TotalBruto_Calculo = _Precio '_TblEncabezado.Rows(0).Item("TotalBrutoDoc")
		'Else
		
		TotalNeto_Calculo = TotalNeto
		TotalBruto_Calculo = TotalBruto
		
		'End If

		If Cabeza = "DescuentoPorc" Or Cabeza = "Precio" Then

			If Precio > 0 Then

				If Chk_Valores_Netos.Checked Then
				
					DescuentoValor = Round2((DescuentoPorc / 100) * TotalNeto_Calculo, Decimales)
					'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalNeto_Calculo) * 100, 5)
				
				Else
				
					DescuentoValor = Round2((DescuentoPorc / 100) * TotalBruto_Calculo,Decimales)
					'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalBruto_Calculo) * 100, 5)
				
				End If

			End If

		Else If Cabeza = "DescuentoValor" Then

			If Chk_Valores_Netos.Checked Then
				'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
				DescuentoPorc = Round2((DescuentoValor / TotalNeto_Calculo) * 100, 5)
			Else
				'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
				DescuentoPorc = Round2((DescuentoValor / TotalBruto_Calculo) * 100, 5)
			End If

		End If

	End If
	

	Fila.Put("DescuentoPorc",DescuentoPorc)
	Fila.Put("DescuentoValor",DescuentoValor)
	Fila.Put("DescuentoValor_Anterior",DescuentoValor_Anterior)

	Fila.Put("DsctoRealPorc",0)
	Fila.Put("DsctoRealValor",0)
	
	Fila.Put("descmaximo",DescuentoPorc)
	
'	.Cells("DescuentoPorc").Value = _DescuentoPorc
'	.Cells("DescuentoValor").Value = _Descuento
'	.Cells("DescuentoValor_Anterior").Value = _Descuento
'	.Cells("RecargoValor").Value = _Recargo
	'
'	.Cells("DsctoRealPorc").Value = 0
'	.Cells("DsctoRealValor").Value = 0

	Dim PrecioCalculado As Double

	Dim Valor_Dscto As Double
	Dim CodFunAutoriza_Dscto = "xyz"
	Dim CodPermiso_Dscto = "Bkp00014"

	If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) And String.IsNullOrEmpty(_Codigo) = False Then

		Dim PrecioLista As Double

		If Chk_Valores_Netos.Checked Then
			PrecioLista = Round2(Fila.Get("precionetoudlista"), 0)
		Else
			PrecioLista = Round2(Fila.Get("preciobrutoudlista"), 0)
		End If

'		Dim PrecioListaUd1 As Double = Fila.Get("preciolistaud1")
'		Dim PrecioListaUd2 As Double = Fila.Get("preciolistaud2")

		Dim Precio_Cn_Dscto As Double = (Precio_Calculado * Cantidad) - DescuentoValor
		Dim Precio_NetoLista As Double = Fila.Get("preciolistaud" & UnTrans) * Cantidad
		Dim Valor_Dscto_Real As Double = Round2(Precio_NetoLista - Precio_Cn_Dscto, 2)

		Dim Dscto_Real As Double = 0

		If Valor_Dscto_Real > 0 Then
			Dscto_Real = Round2((Valor_Dscto_Real / Precio_NetoLista) * 100, 3)
		End If

'		.Cells("Tiene_Dscto").Value = False
'		.Cells("DsctoRealPorc").Value = _Dscto_Real
'		.Cells("DsctoRealValor").Value = _Valor_Dscto_Real

		Dim CodFunAutoriza As String = Fila.Get("codfunautoriza")

		Dim Tiene_Dscto As Boolean
		Dim ValVtaDescMax As Boolean

		If CodFunAutoriza = "xyz" Then CodFunAutoriza = "" 'FUNCIONARIO

		If Precio_Cn_Dscto < Precio_NetoLista Then

			Dim Vizado As Boolean '= Grilla_Encabezado.Rows(0).Cells("Vizado").Value

			If DescMaximo = 0 Then DescMaximo = 0.5

			If Dscto_Real > DescMaximo Then

				Tiene_Dscto = True

				If Vizado Then
					ValVtaDescMax = True
				Else

					'"CodFunAutoriza").Value = CodFunAutoriza

					Dim Mensaje = ""
					Dim MsIcono As Object

					'Dim _Tbl As DataTable = Fx_Trae_Permiso_Bk(_CodFunAutoriza, _CodPermiso_Dscto)
					'
'						If CBool(_Tbl.Rows.Count) Then 'Not Fx_Tiene_Permiso(Me, "Bkp00014", , True) Then
'							_Valor_Dscto = _Tbl.Rows(0).Item("Valor_Dscto")
'						End If

					Dim Msj_DsctoReal = ""

					If Precio <> PrecioLista Then
						Msj_DsctoReal = CRLF & "Descuento Real: " & Dscto_Real & "%"
					End If

					If Dscto_Real > Valor_Dscto Then

						Mensaje = CRLF & CRLF & "¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!"
						'_MsIcono = MessageBoxIcon.Stop
						'.Cells("ValVtaDescMax").Value = False
						ValVtaDescMax =False
					Else

						'CodFunAutoriza_Dscto = FUNCIONARIO
						'MsIcono = MessageBoxIcon.Exclamation
						ValVtaDescMax =True

					End If

'						.Cells("DsctoRealPorc").Value = _Dscto_Real
'						.Cells("CodPermiso").Value = _CodPermiso_Dscto

'													If _Mostrar_Mensaje Then
					'
'								MessageBoxEx.Show(Me, "Descuento máximo según lista: " & _DescMaximo & "%" & Environment.NewLine &
'								"Descuento aplicado: " & _DescuentoPorc & "%" & Environment.NewLine &
'								_Msj_DsctoReal & _Mensaje & Environment.NewLine & Environment.NewLine,
'								"Supera descuento máximo según lista de precios",
'								MessageBoxButtons.OK, _MsIcono, MessageBoxDefaultButton.Button1, Me.TopMost)

				End If

			End If

		End If

	Else
		ValVtaDescMax = True
		'.Cells("ValVtaDescMax").Value = True
	End If

	'End If

	If Chk_Valores_Netos.Checked Then ' SI VALORES SON NETOS

		TotalNeto = TotalNeto - DescuentoValor

	Else                      ' SI VALORES SON BRUTOS

		TotalBruto = TotalBruto - DescuentoValor

	End If

	'End If

	If Chk_Valores_Netos.Checked Then ' SI VALORES SON NETOS

		TotalNeto = Round2(TotalNeto, Decimales)
		TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
		TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
		TotalBruto = Round2((TotalNeto * Impuestos), 0)
		TotalDsctoNeto = DescuentoValor

		Total = TotalNeto

		PrecioNeto = Precio
		PrecioBruto = Round2(Precio * Impuestos, Decimales)

		If Tict = "D" Then
			TotalDsctoBruto = Round2((DescuentoValor * Impuestos), Decimales)
		End If

		If Tict = "R" Then

			TotalDsctoBruto = TotalBruto
			TotalDsctoNeto = 0

		End If

	Else                      ' SI VALORES SON BRUTOS

		TotalNeto = Round2(TotalBruto / Impuestos, 5)
		TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
		TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
		TotalDsctoBruto = DescuentoValor
		Total = TotalBruto

		PrecioBruto = PrecioCalculado
		PrecioNeto = Round2(Precio / Impuestos, 3)

		If Tict = "R" Then

			TotalDsctoBruto = 0
			TotalDsctoNeto = TotalNeto

		End If

	End If


'	If Descontar Then
	'
'		PrecioNetoRealUd1 = 0
'		PrecioNetoRealUd2 = 0
	'
'		If Chk_Valores_Netos.Checked Then ' SI VALORES SON NETOS
'			TotalNeto = TotalNeto - DescuentoValor
'			TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
'			TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
'			TotalBruto = Round2((TotalNeto * Impuestos), 0)
'			TotalDsctoNeto = DescuentoValor
'			Total = TotalNeto
'		Else                      ' SI VALORES SON BRUTOS
'			TotalBruto = DescuentoValor
'			TotalNeto = Round2(TotalBruto / Impuestos, 5)
'			TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
'			TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
'			TotalDsctoBruto = DescuentoValor
'			Total = TotalBruto
'		End If
	'
'		If TotalNeto > 0 Then
	'
'			TotalIla = TotalIla * -1
'			TotalIva = TotalIva * -1
'			TotalNeto = TotalNeto * -1
'			TotalBruto = TotalBruto * -1
'			Total = Total * -1
	'
'		End If
	'
'	Else
	'
'		If Cantidad > 0 Then
	'
'			PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1, 5)
'			PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2, 5)
	'
'			If Chk_Valores_Netos.Checked = False Then
'				PrecioNeto = PrecioNetoRealUd1
'			End If
	'
'		Else
'			PrecioNetoRealUd1 = 0
'			PrecioNetoRealUd2 = 0
'		End If
	'
'	End If
	'
	If Prct = 1 Then

		Dim Multiplo As Int

		If Tict = "D" Then
			Multiplo = -1
		Else If Tict = "R" Then
			Multiplo = 1
		End If

		If Chk_Valores_Netos.Checked Then
			
			CantUd1 = TotalNeto * Multiplo
			CantUd2 = 0
			
		Else
			
			CantUd1 = TotalBruto * Multiplo
			CantUd2 = 0
					
		End If
		
	End If
	
	If Prct = 0 Then
		
		If Cantidad > 0 Then
		
			PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1, 5)
			PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2, 5)
		
			If Chk_Valores_Netos.Checked = False Then
				PrecioNeto = PrecioNetoRealUd1
			End If
		
		Else
			PrecioNetoRealUd1 = 0
			PrecioNetoRealUd2 = 0
		End If
		
	End If


'	Dim NroImpuestos As Int

'	If PorIla > 0 Then

'		ConsultaSql = "Select KOIM,POIM From TABIM Where KOIM IN (Select KOIM From TABIMPR Where KOPR = '" & Codigo & "')"
'		Dim TblIla As DataTable = Sql.FxGetTablas(ConsultaSql)

'		If CBool(TblIla.Rows.Count) Then
	'
'			EliminarCampos(DsMatrizDocumentos.Tables("ImpuestosDoc"), Id)
	'
'			For Each FilaIla As DataRow In TblIla.Rows
	'
'				Dim Koimli As String = FilaIla.Item("KOIM")
'				Dim Poimli As Double = FilaIla.Item("POIM")
'				Dim Vaimli As Double = (Round2(TotalNeto * (Poimli / 100), 5))
	'
'				Dim NewFila As DataRow
'				NewFila = DsMatrizDocumentos.Tables("ImpuestosDoc").NewRow
'				With NewFila
'				.Item("Id") = Id
'				.Item("Poimli") = Poimli
'				.Item("Koimli") = Koimli
'				.Item("Vaimli") = Vaimli
'				.Item("Lilg") = String.Empty
'				DsMatrizDocumentos.Tables("ImpuestosDoc").Rows.Add(NewFila)
'				End With
'				NroImpuestos += 1
'			Next
	'
'		End If

'	End If


	TotalIla = Round2(TotalIla, 2)
	TotalIva = Round2(TotalIva, 2)
	TotalNeto = Round2(TotalNeto, Decimal)
	TotalBruto = Round2(TotalBruto, 0)

'	If ChkValores Then
'		Lbl_Total.Text = "$ " & NumberFormat(TotalNeto,0,2)
'	Else
'		Lbl_Total.Text = "$ " & NumberFormat(TotalBruto,0,0)
'	End If


	Fila.Put("cantidad",Cantidad)
	Fila.Put("cantud1",CantUd1)
	Fila.Put("cantud2",CantUd2)

	Fila.Put("valnetolinea",TotalNeto)
	Fila.Put("valivalinea",TotalIva)
	Fila.Put("valilalinea",TotalIla)
	Fila.Put("valbrutolinea",TotalBruto)
	
	Fila.Put("dsctoneto",TotalDsctoNeto)
	Fila.Put("dsctobruto",TotalDsctoBruto)
	
	Fila.Put("precionetorealud1",PrecioNetoRealUd1)
	Fila.Put("precionetorealud2",PrecioNetoRealUd2)
	
	Fila.Put("codfuncionario",Variables.Global_Row_Usuario_Activo.Get("KOFU"))
	Fila.Put("codvendedor",Variables.Global_Row_Usuario_Activo.Get("KOFU"))
	
	DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",Fila,Fila_Id)
	
	Sb_Cargar_Detalle(True)
	
	'Wait For(Fx_Enviar_Correo_Bakapp(Idmaeedo,Para)) Complete (Resultado As String)
	'Lbl_Descuento.Text = NumberFormat(DescuentoPorc,0,2)  & " %"
		
End Sub

Sub Btn_Buscar_Click
	
	' Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	If	Hay_Descuentos_Globales Then
		Msgbox2Async("EXISTEN DESCUENTOS GLOBALES" & CRLF & _
		"NO PUEDE AGREMAR MAS ITEM" & CRLF & _
		"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS","Doc. VISADO", "Ok","","", bmp1, True)
		Return
	End If
	
	Wait For(Sb_ProductoModoConsulta) Complete (RsMosCs As Boolean)
	If Not(RsMosCs) Then
		Return
	End If
	
	Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato) Complete (Resultado As Boolean)
	If Not(Resultado) Then
		Return
	End If
	
	Sb_GrabarObservacionesDespachos
	
	BuscandoProducto = True
	Buscar_productos.ProductoABuscar = Txt_Codigo.Text.Trim	
	Buscar_productos.Lista =  Fila_Encabezado.Get("ListaPrecios".ToLowerCase)	
	StartActivity(Buscar_productos)		
	
End Sub

Private Sub Sb_ProductoModoConsulta As ResumableSub
	
	If B4A_DespachoSimple And XclvDetalle.Size = 0 And Lbl_TipoDespacho.Text = "" Then
		
		' Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		
		Msgbox2Async("No existe tipo de despacho" & CRLF & _
					 "Indique su opción.", "Validación", "SOLO CONSULTAR PRODUCTO", "", "CANCELAR", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
			
		If Result = DialogResponse.POSITIVE Then
			Frm_Post_01_Producto.ModoConsulta = True
		Else
			Return False
		End If		
				
	End If
	
	Return True
End Sub

Sub Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato As ResumableSub
	
	Dim Secueven As String = Row_Entidad.Get("SECUEVEN")
	Dim Tido As String = TipoDoc
	
	If Secueven.Contains("B") Then
		Tido = "BLV"
	Else
		Tido = "NVV"	
	End If
	
	Dim RowDoc As Map
	
	Select Case Tido
		Case "COV"
			RowDoc = Variables.Global_COV
		Case "NVV"
			RowDoc = Variables.Global_NVV
		Case "BLV"
			RowDoc = Variables.Global_BLV
		Case "FCV"
			RowDoc = Variables.Global_FCV
	End Select
	
	Dim NroLineasXpag As Int = RowDoc.Get("NroLineasXpag")
	Dim Lineas As Int = XclvDetalle.Size
	
	' Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	If NroLineasXpag < Lineas+1 Then
		Msgbox2Async("No es posible ingresar más líneas en detalle" & CRLF & _
		"Máximo de líneas por documento [" & NroLineasXpag & "]","Validación", "Ok","","", bmp1, True)
		Return False
	End If
	
	Return True
End Sub


Sub Sb_Cargar_IDList
	
	Private Row As Int
	Private Cursor1 As Cursor
	
	IDList.Initialize

	Dim RowNumber As Int = 0

	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
	If Cursor1.RowCount > 0 Then
		RowNumber = Cursor1.RowCount
		IDList.Initialize
		For Row = 0 To RowNumber - 1
			Cursor1.Position = Row
			IDList.Add(Cursor1.GetString2(0))
		Next
	Else
		ToastMessageShow("No items found", False)
	End If
	
	Cursor1.Close
	
End Sub

Sub Sb_Sumar_Totales
	
	Wait For(Fx_Validar_Descuentos_Globales) Complete (Accion As Boolean)
	'Wait For Fx_Validar_Descuentos_Globales

	Dim Total_Neto As Double
	Dim CantTotal As Double = 0
	Dim Items = 0
	Dim Decimal = 0
	Dim Moneda As String '= _TblEncabezado.Rows(0).Item("Moneda_Doc").ToString.Trim

	If Moneda <> "$" Then
		Decimal = 2
	End If

	Dim Total_Neto As Double

	Dim SQL As SQL = Variables.vSql
	Dim Detalle As ResultSet
		
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc
	
	Detalle = SQL.ExecQuery(Consulta_Sql)
	
	Hay_Descuentos_Globales = False
		
	Do While Detalle.NextRow
		
		Dim Cantidad As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("Cantidad"), 0)
		Dim Precio As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("Precio"), 0)
		Dim ValNetoLinea As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("ValNetoLinea"), 0)
		Dim Tict As String = Detalle.GetString("Tict")
		Dim UnTrans As Int= Detalle.GetString("UnTrans")
		
		If Tict = "D" Then
			Hay_Descuentos_Globales = True
		End If
		
		Dim Cant As Double=Funciones.Fx_NuloPorNro(Detalle.GetDouble("CantUd" & UnTrans), 0)
		
		CantTotal = CantTotal+ Round2(Cant,0)
		
		Total_Neto = Total_Neto + ValNetoLinea
		
		Items = Items+1
		
	Loop
	

	Dim ItemStr As String = Funciones.Rellenar_Izquierda(Items,2,"0")
	If ItemStr = "00" Then ItemStr = 0
	Lbl_Items.Text = "Total Items: " & ItemStr
	
	Lbl_Total_Neto.Tag = Round2(Total_Neto,0)
	Lbl_Total_Iva.Tag = Round2(Total_Neto*0.19,0)
	Lbl_Total_Impuestos.Tag = 0
	Lbl_Total_Bruto.Tag = Round2(Lbl_Total_Neto.Tag+Lbl_Total_Iva.Tag,0)
	
	Lbl_Total_Neto.Text = "$ " & NumberFormat(Lbl_Total_Neto.Tag,0,2)
	Lbl_Total_Iva.Text =  "$ " & NumberFormat(Lbl_Total_Iva.Tag,0,2)
	Lbl_Total_Impuestos.Text  = "$ " & NumberFormat(Lbl_Total_Impuestos.Tag,0,2)
	Lbl_Total_Neto.Text = "$ " & NumberFormat(Lbl_Total_Neto.Tag,0,2)
	Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Bruto.Tag,0,0)
	
	Fila_Encabezado.Put("TotalNetoDoc".ToLowerCase,Lbl_Total_Neto.Tag)
	Fila_Encabezado.Put("TotalIvaDoc".ToLowerCase,Lbl_Total_Iva.Tag)
	Fila_Encabezado.Put("TotalBrutoDoc".ToLowerCase,Lbl_Total_Bruto.Tag)
	
	Fila_Encabezado.Put("CantTotal".ToLowerCase,CantTotal)
	
	'Actualizamos la base de datos
	DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
	
End Sub

Sub Tab_Post_TabChanged
	
	If Not(Row_Entidad.IsInitialized) Then
		
		If Tab_Post.CurrentTab <> 0 Then
		
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("Debe ingresar la entidad","Validación", "Ok","","", bmp1, True)
			Tab_Post.CurrentTab = 0
		
		End If
		
	End If
		
	If Tab_Post.CurrentTab = 2 Then
		
		Chk_Valores_Netos.Checked = True
		
		Lbl_Total_Neto.Text = NumberFormat(Lbl_Total_Neto.Tag,0,0)
		Lbl_Total_Iva.Text = NumberFormat(Lbl_Total_Iva.Tag,0,0)
		Lbl_Total_Impuestos.Text = NumberFormat(Lbl_Total_Impuestos.Tag,0,0)
		Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Bruto.Tag,0,0)
				
	End If
	
End Sub

Sub Sb_Nuevo_Documento

	ProgressDialogShow("Preparando...")

	Consulta_Sql = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(1))
	
'	Consulta_Sql = "DELETE FROM [Detalle_Doc] WHERE [id_docenc] = ?"
'	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
'	
'	Consulta_Sql = "DELETE FROM [Descuentos_Doc] WHERE id_docenc = ?"
'	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
'	
'	Consulta_Sql = "DELETE FROM [Impuestos_Doc] WHERE id_docenc = ?"
'	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
'	
'	Consulta_Sql = "DELETE FROM [Observaciones_Doc] WHERE id_docenc = ?"
'	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
'	
'	Consulta_Sql = "DELETE FROM [DespaFacil_Doc] WHERE id_docenc = ?"
'	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
	
	Consulta_Sql = "Delete From [Detalle_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Descuentos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Impuestos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Observaciones_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [DespaFacil_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Variables.Gl_Empresa = Variables.Global_Row_Configuracion_Estacion.Get("EMPRESA")
	Variables.Gl_Sucursal = Variables.Global_Row_Configuracion_Estacion.Get("ESUCURSAL")
	Variables.Gl_Bodega = Variables.Global_Row_Configuracion_Estacion.Get("EBODEGA")
	
	'Insertamos una fila en el Encabezado
	Consulta_Sql = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object (1,Variables.Gl_Modalidad,Variables.Gl_Empresa,Variables.Gl_Sucursal))

	'Cargamos el encabezado en la variable
	Consulta_Sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1"
	Fila_Encabezado = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)

	'Rescatamos el Id del nuevo documento
	Id_DocEnc = Fila_Encabezado.Get("id_docenc")

	'Cargamos los datos de nuestra varible para las ediciones del encabezado y las observaciones
	Consulta_Sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)

	'Insertamos una fila en las observaciones
	Consulta_Sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As String (Id_DocEnc))

	'Cargamos las observaciones en la variable
	Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_Observaciones = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Txt_Observaciones.Text = ""
	Txt_Orden_compra.Text = ""
	
	'Insertamos una fila en despacho Simple
	Consulta_Sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As String (Id_DocEnc))
	
	Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
	Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
	If B4A_DespachoSimple Then
	
		Lbl_TipoDespacho.Tag = 0
		Lbl_TipoDespacho.Text = ""
		Lbl_TipoPagoDesp.Tag =  0
		Lbl_TipoPagoDesp.Text = ""
		Txt_TransporteDesp.Text = ""
		Lbl_CodDocDestino.Tag =  ""
		Lbl_CodDocDestino.Text = ""
		Txt_DireccionDesp.Text = ""
		Txt_ObservacionesDesp.Text = ""
		
	End If
		
	Log("Documento cargado... Id_DocEnc = " & Id_DocEnc)

	DateTime.DateFormat = "dd-MM-yyyy"

	' Las fechas se deben trabajar en formato Long y transformarlas en formato fecha
	Dim FechaEmision As Long = DateTime.Now
	Dim Fecha_1er_Vencimiento As Long = FechaEmision
	Dim FechaUltVencimiento As Long = FechaEmision
	Dim FechaRecepcion As Long = FechaEmision

	'Lbl_FechaEmision.Text = Funciones.Fecha_Formato(FechaEmision,"") 'Fila_Encabezado.Get("FechaEmision")
	
	Lbl_FechaEmision.Text = DateTime.Date(FechaEmision)
	Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(FechaEmision)
	Lbl_FechaUltVencimiento.Text = DateTime.Date(FechaEmision)
	
	Dim Cuotas As Int = 0
	Dim Dias_1er_Vencimiento As Int = 0
	Dim Dias_Vencimiento As Int = 0
	Dim Forma_de_Pago As String = ""
	
	Dim Centro_Costo As String
	
	Dim Moneda_Doc As String = Variables.Global_Row_Moneda.Get("KOMO")
	Dim Valor_Dolar As Double = Variables.Global_Row_Dolar.Get("VAMO")
	Dim Tasadorig_Doc As Double = Variables.Global_Row_Moneda.Get("VAMO")
	Dim TipoMoneda As String =Variables.Global_Row_Moneda.Get("TIMO")
	
	
	Dim ListaPrecios As String
	
	Dim NewNroDocumento = "NEWXXXXXXX"
	
	Dim DocEn_Neto_Bruto As String = Variables.Global_Row_Configuracion_Estacion.Get("Vnta_TipoValor_Bruto_Neto")
	
	If DocEn_Neto_Bruto = "N" Then
		Chk_Valores_Netos.Checked = True
	Else
		Chk_Valores_Netos.Checked = False
	End If
	
	Centro_Costo = "LUVTVEN"
	Centro_Costo = Variables.Global_Row_Configuracion_Estacion.Get(Centro_Costo)
	
	Lbl_Centro_Costo.Text = Centro_Costo
	
	ListaPrecios = Variables.Gl_Lista_Precios
	
	Chk_Valores_Netos.Enabled = False
	
	Fila_Encabezado.Put("TipoDoc".ToLowerCase,"NVV")
	Fila_Encabezado.Put("NroDocumento".ToLowerCase,NewNroDocumento)
	
	Fila_Encabezado.Put("FechaEmision".ToLowerCase,FechaEmision)
	Fila_Encabezado.Put("Fecha_1er_Vencimiento".ToLowerCase,Fecha_1er_Vencimiento)
	Fila_Encabezado.Put("FechaUltVencimiento".ToLowerCase,FechaUltVencimiento)
	Fila_Encabezado.Put("FechaRecepcion".ToLowerCase,FechaRecepcion)
	
	Fila_Encabezado.Put("Cuotas".ToLowerCase,Cuotas)
	Fila_Encabezado.Put("Dias_1er_Vencimiento".ToLowerCase,Dias_1er_Vencimiento)
	Fila_Encabezado.Put("Dias_Vencimiento".ToLowerCase,Dias_Vencimiento)

	Row_Entidad = Variables.Global_Row_Entidad_X_Defecto
	
	Dim CodEntidad As String
	Dim CodSucEntidad As String
	Dim Nombre_Entidad As String
	
	If Row_Entidad.IsInitialized Then
		CodEntidad = Row_Entidad.Get("KOEN")
		CodSucEntidad = Row_Entidad.Get("SUEN")
		Nombre_Entidad = Row_Entidad.Get("NOKOEN")
	End If

	Fila_Encabezado.Put("CodEntidad".ToLowerCase,CodEntidad)
	Fila_Encabezado.Put("CodSucEntidad".ToLowerCase,CodSucEntidad)
	Fila_Encabezado.Put("Nombre_Entidad".ToLowerCase,Nombre_Entidad)
	
	Fila_Encabezado.Put("ListaPrecios".ToLowerCase,ListaPrecios)
	Fila_Encabezado.Put("CodFuncionario".ToLowerCase,Variables.Global_Row_Usuario_Activo.Get("KOFU"))
'	Fila_Encabezado.Put("CodVendedor".ToLowerCase,Variables.Global_Row_Usuario_Activo.Get("KOFU"))
	Fila_Encabezado.Put("NomFuncionario".ToLowerCase,Variables.Global_Row_Usuario_Activo.Get("NOKOFU"))
	
	Fila_Encabezado.Put("Moneda_Doc".ToLowerCase,Moneda_Doc)
	Fila_Encabezado.Put("TipoMoneda".ToLowerCase,TipoMoneda)
	Fila_Encabezado.Put("Valor_Dolar".ToLowerCase,Valor_Dolar)
	Fila_Encabezado.Put("Tasadorig_Doc".ToLowerCase,Tasadorig_Doc)

	Fila_Encabezado.Put("DocEn_Neto_Bruto".ToLowerCase,DocEn_Neto_Bruto)
	
	Fila_Encabezado.Put("Centro_Costo".ToLowerCase,Centro_Costo)

	Fila_Encabezado.Put("CodEntidadFisica".ToLowerCase,"")
	Fila_Encabezado.Put("CodSucEntidadFisica".ToLowerCase,"")
	Fila_Encabezado.Put("Nombre_Entidad_Fisica".ToLowerCase,"")
	Fila_Encabezado.Put("Fun_Auto_Deuda_Ven".ToLowerCase,"")
	Fila_Encabezado.Put("Fun_Auto_Stock_Ins".ToLowerCase,"")
	Fila_Encabezado.Put("Fun_Auto_Cupo_Exe".ToLowerCase,"")
	Fila_Encabezado.Put("SubTido".ToLowerCase,"")
		
	'Actualizamos la base de datos
	DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)

	If Row_Entidad.IsInitialized Then
		Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,False,False,True)
	Else
		Lbl_CodEntidad.Text = ""
		Lbl_CodSucEntidad.Text = ""
		Lbl_Rut.Text = ""
		Lbl_Nombre.Text = ""
		Lbl_Direccion.Text = ""
		Lbl_Ciudad.Text = ""
		Lbl_Comuna.Text = ""
		Tab_Post.CurrentTab = 0
	End If
	
	Frm_Post_01_Producto.ModoConsulta = False

	ProgressDialogHide

End Sub

Private Sub Btn_Limpiar_Click
	
	Dim XUI As XUI
	' Dim bmp1 As Bitmap
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Msgbox2Async("¿Estas seguro de querer limpiar este documento?","L I M P I A R", "Si", "", "No", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result = XUI.DialogResponse_Positive Then
		Crear_NVV_Desde_COV = False
		Nuevo_Documento = True
		Editar_Documento = False
		Idmaeedo_Origen = 0
		Nudo_Origen = ""
		Sb_Nuevo_Documento
		Sb_Cargar_Detalle(False)
	End If	
	
End Sub

Sub Sb_Actualizar_Datos_De_La_Entidad(RowEntidad As Map, _
                                      Revisar_Permiso_Lista_Precio As Boolean, _
                                      Aplicar_Venciminetos As Boolean, _
									  ActualizarListaPrecio As Boolean)

	ProgressDialogShow("Actualizando datos de la entidad...")
	
	DateTime.DateFormat = "dd-MM-yyyy"

	Dim FechaEmision As Long = DateTime.Now
	Dim Fecha_1er_Vencimiento As Long = FechaEmision
	Dim FechaUltVencimiento As Long = FechaEmision
	Dim FechaRecepcion As Long = FechaEmision
		
	Dim Cuotas As Int = 1
	Dim Dias_1er_Vencimiento As Int = 0
	Dim Dias_Vencimiento As Int = 0
	Dim Forma_pago As String

	Fila_Encabezado.Put("CodEntidad".ToLowerCase,"")
	Fila_Encabezado.Put("CodSucEntidad".ToLowerCase,"")
	Fila_Encabezado.Put("CodEntidadFisica".ToLowerCase,"")
	Fila_Encabezado.Put("CodSucEntidadFisica".ToLowerCase,"")
	Fila_Encabezado.Put("Nombre_Entidad".ToLowerCase,"")

	Dim Lista As String
	Dim Permiso As String

	Dim ListaPrecios = Fila_Encabezado.Get("ListaPrecios".ToLowerCase)
	Lista = ListaPrecios

	Cuotas = RowEntidad.Get("NUVECR")
	Dias_1er_Vencimiento = RowEntidad.Get("DIPRVE")
	Dias_Vencimiento = Funciones.Fx_NuloPorNro(RowEntidad.Get("DIASVENCI"),0)

	Dim Rut As String

	Fila_Encabezado.Put("CodEntidad".ToLowerCase,RowEntidad.Get("KOEN"))
	Fila_Encabezado.Put("CodSucEntidad".ToLowerCase,RowEntidad.Get("SUEN"))
	Fila_Encabezado.Put("Nombre_Entidad".ToLowerCase,RowEntidad.Get("NOKOEN"))
				
	Lbl_CodEntidad.Text = RowEntidad.Get("KOEN")
	Lbl_CodSucEntidad.Text = RowEntidad.Get("SUEN")
	Lbl_Rut.Text = RowEntidad.Get("Rut")
	Lbl_Nombre.Text = RowEntidad.Get("NOKOEN")
	Lbl_Direccion.Text = RowEntidad.Get("DIEN")
	Lbl_Ciudad.Text = RowEntidad.Get("CIUDAD")
	Lbl_Comuna.Text = RowEntidad.Get("COMUNA")

	If ActualizarListaPrecio Then
		Lista = RowEntidad.Get("LVEN")
		Lista = Funciones.Mid(Lista, 6, 3)
	End If
		
	Permiso = "Lp-" & Lista

	If Cuotas = 0 Then Cuotas = 1

	If Not(Aplicar_Venciminetos) Then
		Dias_1er_Vencimiento = 0
	End If

	If Dias_1er_Vencimiento > 0 Then

		Fila_Encabezado.Put("Dias_1er_Vencimiento".ToLowerCase,Dias_1er_Vencimiento)
		Fila_Encabezado.Put("Dias_Vencimiento".ToLowerCase,Dias_Vencimiento)

		Dim FechasVenci As Long = FechaEmision
		Dim dias As Int

		If Dias_1er_Vencimiento > 0 Then

			dias = Dias_1er_Vencimiento

			For i = 1 To Cuotas
					
				FechasVenci = DateTime.Add(FechasVenci, 0, 0, dias)
				If i = 1 Then
					Fecha_1er_Vencimiento = FechasVenci
				End If
				
				dias = Dias_Vencimiento

			Next

			FechaUltVencimiento = FechasVenci

		Else
			Cuotas = 1
		End If
	
	Else

		Fecha_1er_Vencimiento = FechaEmision
		FechaUltVencimiento = FechaEmision
		Cuotas = 1
		Dias_1er_Vencimiento = 0
		Dias_Vencimiento = 0

	End If

	Forma_pago = RowEntidad.Get("CPEN")
	
	Fila_Encabezado.Put("FechaEmision".ToLowerCase,FechaEmision)
	Fila_Encabezado.Put("Fecha_1er_Vencimiento".ToLowerCase,Fecha_1er_Vencimiento)
	Fila_Encabezado.Put("FechaUltVencimiento".ToLowerCase,FechaUltVencimiento)
	Fila_Encabezado.Put("FechaRecepcion".ToLowerCase,FechaRecepcion)
	
	Fila_Encabezado.Put("Cuotas",Cuotas)
	Fila_Encabezado.Put("Dias_1er_Vencimiento",Dias_1er_Vencimiento)
	Fila_Encabezado.Put("Dias_Vencimiento",Dias_Vencimiento)

	Fila_Observaciones.Put("Forma_pago",Forma_pago)

	If Revisar_Permiso_Lista_Precio Then

		Dim Tiene_Permiso_Lista As Boolean
		Dim Cambiar_lista As Boolean
		Dim Mostrar_Mensaje_cambio_lista As Boolean


		For i = 0 To Variables.Global_Listas_Precios_Usuario.Size - 1
			Dim m As Map = Variables.Global_Listas_Precios_Usuario.Get(i)
			Dim value As String = m.Get("Kolt")
			
			If Lista = value Then
				Tiene_Permiso_Lista = True
				Exit
			End If
					
		Next
		
		If Tiene_Permiso_Lista Then
			Cambiar_lista = True
		Else
							   
			bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
			Msgbox2Async("Usted no tiene permiso para trabajar con la lista: " & Lista & CRLF & _
						 "La lista seguirá siendo:" & ListaPrecios , "Validación", "Ok", "", "", bmp1, False)
	
		End If

		If Cambiar_lista Then
			ListaPrecios = Lista
			Fila_Encabezado.Put("ListaPrecios".ToLowerCase,ListaPrecios)
		End If
		
	End If
	
	For i = 0 To Variables.Global_Listas_Precios_Usuario.Size - 1
		
		Dim m As Map = Variables.Global_Listas_Precios_Usuario.Get(i)
		Dim Kolt As String = m.Get("Kolt")
		Dim Nokolt As String = m.Get("Nokolt")
			
		If Lista = Kolt Then
			Lbl_Lista_Precios.Text = Nokolt
			Exit
		End If
					
	Next
	
	'Sb_Emision_Vencimientos()

	Dim Bloqueado As Boolean = RowEntidad.Get("BLOQUEADO")

	If Bloqueado Then

		bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
		Msgbox2Async("¡CLIENTE BLOQUEADO!"  & CRLF & _
						 "Solo es posible generar cotizaciones", "CLIENTE MOROSO", "Ok", "", "", bmp1, False)
								
	End If
	
	Lbl_FechaEmision.Text = DateTime.Date(FechaEmision)
	Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fila_Encabezado.Get("Fecha_1er_Vencimiento".ToLowerCase))
	Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila_Encabezado.Get("FechaUltVencimiento".ToLowerCase))
	
	Lbl_Coutas.Text = Fila_Encabezado.Get("Cuotas")
	Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.Get("Dias_1er_Vencimiento")
	Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get("Dias_Vencimiento")

	Dim Secueven As String = Row_Entidad.Get("SECUEVEN")

	If ActualizarListaPrecio And B4A_DespachoSimple Then
		
		Wait For(Sb_Trae_Secueven(Secueven)) Complete (vTidoNudo As TidoNudo)

		Lbl_CodDocDestino.Tag = vTidoNudo.Tido
		Lbl_CodDocDestino.Text = vTidoNudo.Notido
				
		DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
				
	End If
	
	Wait For(Sb_VisibleOcultarDespachoSimple) complete (res As Boolean)
	
	ProgressDialogHide

End Sub

Private Sub Sb_Trae_Secueven(Secueven As String) As ResumableSub
	
'	-- NGF NCV,GDV,FCV
'	-- NFG NCV,FCV,GDV
'	-- NGB NCV,GDV,BLV
'	-- NBG NCV,BLV,GDV

	Dim vSb_TidoNotido As TidoNudo
	vSb_TidoNotido.Initialize

	Dim Tido As String
	Dim Notido As String

	Select Case Secueven
		Case "NGF"
			Tido = "GDV": Notido = "GUIA DE DESPACHO DE VENTA"
		Case "NFG"
			Tido = "FCV": Notido = "FACTURA DE VENTA"
		Case "NGB"
			Tido = "GDV": Notido = "GUIA DE DESPACHO DE VENTA"
		Case "NBG"
			Tido = "BLV": Notido = "BOLETA DE VENTA"
		Case Else
			Tido = "": Notido = ""
	End Select		
	
	vSb_TidoNotido.Tido = Tido
	vSb_TidoNotido.Notido = Notido
	
	Return vSb_TidoNotido

End Sub



Private Sub Btn_Canbiar_Cliente_Click
	
	' Dim bmp1 As Bitmap
	Private Cursor1 As Cursor

	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
	If Cursor1.RowCount > 0 Then
		
		Dim Secueven As String = Row_Entidad.Get("SECUEVEN")
		
		If Not(Secueven.Contains("B")) Then
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
					
			Msgbox2Async("¡No se puede cambiar la entidad ya que existen datos en el documento!","Validación", "Cerrar","","", bmp1, True)
			Wait For Msgbox_Result (Result As Int)
			Return
		End If
					
	End If
	
	Sb_GrabarObservacionesDespachos
	
	BuscandoEntidad = True	
	StartActivity(Buscar_entidad)
	
End Sub

Private Sub XclvDetalle_ItemLongClick (Index As Int, Value As Object)
			
	Dim xui As XUI
	Dim Item As CLVItem  = XclvDetalle.GetRawListItem(Index)
	Dim p As Panel = Item.Panel.GetView(0)
	Dim LblCodigo As Label = p.GetView(0)
	Dim LblDescripcion As Label = p.GetView(1)
	Dim LblItem As Label = p.GetView(3)
	Dim Prct As Boolean = Funciones.Cbool(LblItem.Tag)
	Dim Tict As String = LblDescripcion.Tag

	' Dim bmp1 As Bitmap	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
			
	Dim Editar As String = "Editar"
			
	If Prct Then
		Editar = ""
	Else
		If	Hay_Descuentos_Globales Then
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("EXISTEN DESCUENTOS GLOBALES" & CRLF & _
						 "NO PUEDE HACER GESTION EN ESTA FILA" & CRLF & _
						 "DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION","Doc. VISADO", "Ok","","", bmp1, True)
			Return
		End If
	End If
	
	Dim sf As Object = xui.Msgbox2Async(LblDescripcion.Text,"Código: " & LblCodigo.Text ,Editar,"Cancelar","Eliminar",bmp1)
	Wait For (sf) Msgbox_result (Result As Int)

	Id_DocDet = LblCodigo.Tag

	If Result = xui.DialogResponse_Positive Then
		
		Sb_GrabarObservacionesDespachos
		EditandoProducto = True
		Frm_Post_01_Producto.Id_DocDet = Id_DocDet
		StartActivity(Frm_Post_01_Producto)
	
	End If
	
	If Result = xui.DialogResponse_Negative Then
		
		Dim sf As Object = xui.Msgbox2Async("¿Confirma la eliminación de este articulo?","Código: " & LblCodigo.Text ,"SI","","NO",bmp1)
		Wait For (sf) Msgbox_result (Result As Int)
	
		If Result = xui.DialogResponse_Positive Then

			Dim Fila_Id As Map
			Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
			Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
			DBUtils.DeleteRecord(Variables.vSql,"Detalle_Doc",Fila_Id)
		
			Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = " & Id_DocDet
			Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
			If Fila_Dscto.IsInitialized Then
				DBUtils.DeleteRecord(Variables.vSql,"Descuentos_Doc",Fila_Dscto)
			End If
		
		
			p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p.Height)
			Sleep(600)
			XclvDetalle.RemoveAt(Index)
	
			Private Cursor1 As Cursor
			Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Precio,DescuentoPorc,ValNetoLinea " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
			If Cursor1.RowCount > 0 Then
		
				Dim	RowNumber = Cursor1.RowCount
				
				For i = 0 To RowNumber-1
					
					Try
						Item = XclvDetalle.GetRawListItem(i)
						p = Item.Panel.GetView(0)
						Dim LblItem As Label = p.GetView(3)
						Dim ItemStr As String = Funciones.Rellenar_Izquierda(i+1,2,"0")
						LblItem.Text = "Item: " & ItemStr
					Catch
						Log(LastException)
					End Try
					
				Next
			
			End If
			
			Sb_Sumar_Totales
			
			'ToastMessageShow("Registr eliminado",False)
				
		End If
	
	End If
		
End Sub

Private Sub XclvDetalle_ItemClick (Index As Int, Value As Object)
	'Sb_Editar_Producto(Index,Value)
End Sub

Sub Sb_Editar_Producto (Index As Int, Value As Object)
	
	Dim xui As XUI
	Dim Item As CLVItem  = XclvDetalle.GetRawListItem(Index)
	Dim p As Panel = Item.Panel.GetView(0)
	Dim LblCodigo As Label = p.GetView(0)
			
	Id_DocDet = LblCodigo.Tag
	
	Frm_Post_01_Producto.Id_DocDet = Id_DocDet
	StartActivity(Frm_Post_01_Producto)
	
End Sub

Private Sub Btn_Limpiar_Codigo_Click
	Txt_Codigo.Text = ""
	Txt_Codigo.SelectAll
End Sub

Private Sub Btn_Grabar_Click
	
	Btn_Grabar.Enabled = False

	If Editar_Documento Then
		Wait For (Sb_Editar_Documento)  Complete (Result As Boolean)
	Else
		Wait For (Sb_Grabara_Nuevo_Documento) Complete (Result As Boolean)
	End If
		
	Btn_Grabar.Enabled = True
		
End Sub

Sub Sb_Grabara_Nuevo_Documento As ResumableSub
	
	' Dim bmp1 As Bitmap
	
	bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	
	Wait For(Sb_Grabar_StandBy) Complete (Result As Int)
		
	If Result = 0 Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("No existe detalle en el documento","Validación", "Ok","","", bmp1, True)
		Return True
	End If
				
	If Result = 4 Then
'		Msgbox2Async("Documento Stand-By creado en el Webservice", "Documento Stand-By", "Ok", "", "", bmp1, False)
'		Wait For Msgbox_Result (Result As Int)
	Else
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("Error!", "Documento Stand-By", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return True
	End If
	
	If Crear_NVV_Desde_COV Then
		Tido = "NVV"
	Else
		
		bmp1 = LoadBitmap(File.DirAssets, "save.png")
		Msgbox2Async("Seleccione documento a grabar", "Grabar documento", "NVV (Nota de venta)", "Cancelar", "COV (Cotización)", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	
		Dim Tido As String = ""
	
		If Result = DialogResponse.POSITIVE Then
			Tido = "NVV"
		End If
	
		If Result = DialogResponse.NEGATIVE Then
			Tido = "COV"
		End If
	
		If Result = DialogResponse.CANCEL Then
			Return True
		End If
	End If

	Fila_Encabezado.Put("TipoDoc".ToLowerCase,Tido)
	DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
	
	If Tido = "NVV" Then
	
		Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete (Result2 As Boolean)
	
'		If Result2 = True Then
'			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'			Msgbox2Async("Productos con Stock suficiente", "Grabar documento", "Ok", "", "", bmp1, True)
'			Wait For Msgbox_Result (Result As Int)
'		End If
	
		If Result2 = False Then
			
			Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario("Bkp00015")) Complete (Rst As Boolean)
			
			If Not(Rst) Then
				Return True
			End If
		
		End If
		
	End If
	
	ProgressDialogShow("Creando documento...")
		
	'Actualizamos la base de datos
	Sb_GrabarObservacionesDespachos
	'Fila_Observaciones.Put("observaciones".ToLowerCase,Txt_Observaciones.Text.Trim)
	'Fila_Observaciones.Put("orden_compra".ToLowerCase,Txt_Orden_compra.Text.Trim)
	'DBUtils.UpdateRecord2(Variables.vSql,"Observaciones_Doc",Fila_Observaciones,Fila_IdEnc)
	
	' Asi se deben armar los datos para generar el archivo Json de salida.
	' Se debe utilizar la funcion ExecuteJSON del asistente DBUtils
	' Se debe crear un arreglo en el cual se van poniendo los tipos de datos de cada uno de los campos que se requieren armar,
	' En este ejemplo se describen los campos de la tabla de descuentos.
	
	Dim Array_Encabezado() As String = GeneraArreglo("Encabezado_Doc")
	Consulta_Sql = "Select * From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Encabezado As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Encabezado)
	
	Dim Array_Detalle() As String = GeneraArreglo("Detalle_Doc")
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Detalle As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Detalle)
	
	Dim Array_Descuentos() As String = GeneraArreglo("Descuentos_Doc")
	Consulta_Sql = "Select * From Descuentos_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Descuentos As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Descuentos)
	
	Dim Array_Impuestos() As String = GeneraArreglo("Impuestos_Doc")
	Consulta_Sql = "Select * From Impuestos_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Impuestos As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Impuestos)
	
	Dim Array_Observaciones() As String = GeneraArreglo("Observaciones_Doc")
	Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Observaciones As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Observaciones)
	
	Dim Array_DespaFacil() As String = GeneraArreglo("DespaFacil_Doc")
	Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim DespaFacil As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_DespaFacil)
					
	Dim Json_Encabezado As String
	Dim Json_Detalle As String
	Dim Json_Descuentos As String
	Dim Json_Obseravciones As String
	Dim Json_DespaFacil As String
						
	Dim Encabezadojs As List
	Encabezadojs.Initialize
	Encabezadojs.Add(Encabezado)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Encabezadojs)
	Json_Encabezado = JSONGenerator.ToPrettyString(1)
	
	Dim Detallejs As List
	Detallejs.Initialize
	Detallejs.Add(Detalle)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Detallejs)
	Json_Detalle = JSONGenerator.ToPrettyString(1)
	
	Dim Descuentosjs As List
	Descuentosjs.Initialize
	Descuentosjs.Add(Descuentos)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Descuentosjs)
	Json_Descuentos = JSONGenerator.ToPrettyString(1)
				
	Dim Observacionesjs As List
	Observacionesjs.Initialize
	Observacionesjs.Add(Observaciones)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Observacionesjs)
	Json_Obseravciones = JSONGenerator.ToPrettyString(1)
	
	Dim DespaFaciljs As List
	DespaFaciljs.Initialize
	DespaFaciljs.Add(DespaFacil)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(DespaFaciljs)
	Json_DespaFacil = JSONGenerator.ToPrettyString(1)
	
	Dim EmailRandom As String = "EMAILCOMER" 'Variables.Global_Row_EstacionBk.Get("Mail_Random")
	Dim Para As String
	
	If EmailRandom <> "" And EmailRandom <> Null Then
		Try
			Para = Row_Entidad.Get(EmailRandom)
		Catch
			Para = ""
			Log(LastException)
		End Try
	End If
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp2(Me,Json_Encabezado,Json_Detalle,Json_Descuentos,Json_Obseravciones,Json_DespaFacil)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			ProgressDialogHide
			
			Dim Respuesta As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Dim Idmaeedo As Int = Respuesta.Get("Idmaeedo")
			Dim Error As String = Respuesta.Get("Error")
			
			If Idmaeedo <> 0 Then
				
				Dim Endo As String = Fila_Encabezado.Get("codentidad")
				Dim Suendo As String = Fila_Encabezado.Get("codsucentidad")
				Dim Tido As String = Respuesta.Get("Tido")
				Dim Nudo As String = Respuesta.Get("Nudo")
				Dim Obseravacion As String = Fila_Observaciones.Get("observacion")
				Dim NroOCC As String = Fila_Observaciones.Get("nroocc")
		
'				Frm_Buscar_Documento.Idmaeedo = Idmaeedo
'				Frm_Buscar_Documento.Koen = Endo
'				Frm_Buscar_Documento.Suen = Suendo
'				Frm_Buscar_Documento.Observaciones = Obseravacion
'				Frm_Buscar_Documento.OCC = NroOCC
'				Frm_Buscar_Documento.Para = Para
'				Frm_Buscar_Documento.Tido = Tido
'				Frm_Buscar_Documento.Nudo = Nudo
'				Grabar = True
'		
'				Activity.Finish
'				Return
'				bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'				
'				Msgbox2Async("Documento generado correctamente","Bakapp", "Ok","","", bmp1, False)
				
				Tab_Post.CurrentTab = 1
				Crear_NVV_Desde_COV = False
				Nuevo_Documento = True
				Editar_Documento = False
				Idmaeedo_Origen = 0
				Nudo_Origen = ""
				Sb_Nuevo_Documento
				Sb_Cargar_Detalle(False)
				
				Dim ErrorMailImp As Boolean
				bmp1 = LoadBitmap(File.DirAssets, "document-delivery-receipt-ok-2.png")
	
				Msgbox2Async("Documento guardado correctamente", Tido & "-" & Nudo, "Imprimir", "Enviar correo e imprimir","Enviar correo", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
	
				bmp1 = LoadBitmap(File.DirAssets, "warning.png")
	
				'Solo Imprimir
				If Result = DialogResponse.POSITIVE Then
					
					'Wait For(Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
					Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
		
					If Resultado <> "Ok" Then
						Msgbox2Async(Resultado,"Error al imprimir", "Ok","","", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
					
				End If
	
				'Solo Enviar Correo
				If Result = DialogResponse.NEGATIVE Then
					
					Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmaeedo,Endo,Suendo,Para,"EMAILCOMER",True)) Complete (Resultado As String)
					
					If Resultado <> "Ok" Then
						Msgbox2Async(Resultado,"Error al imprimir", "Ok","","", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
										
				End If
	
				'Enviar correo e imprimir
				If Result = DialogResponse.CANCEL Then
				
					Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmaeedo,Endo,Suendo,Para,"EMAILCOMER",True)) Complete (Resultado As String)
					
					Log(Resultado)
					If Resultado <> "Ok" Then
						Msgbox2Async(Resultado,"Error al enviar correo", "Ok","","", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
					
					Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
		
					If Resultado <> "Ok" Then
						'bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
						Msgbox2Async(Resultado,"Error al imprimir", "Ok","","", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If

				End If
				
				If ErrorMailImp Then
					
					'bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
					Msgbox2Async("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente" & CRLF & _
									Tido & "-" & Nudo, _
									"Información","Ok","","", bmp1, False)
					Wait For Msgbox_Result (Result As Int)
				
				End If
				
				Activity.Finish
				
			Else
				
				Msgbox2Async(Error,"Error al grabar", "Cerrar","","", bmp1, True)
				Wait For Msgbox_Result (Result As Int)
			
			End If
						
		End If
										
	End If
	
	ProgressDialogHide
	
	Return True
	
End Sub


Sub Sb_Editar_Documento As ResumableSub
	
	' Dim bmp1 As Bitmap
	
	bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	
	Wait For(Sb_Grabar_StandBy) Complete (Result As Int)
		
	If Result = 0 Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("No existe detalle en el documento","Validación", "Ok","","", bmp1, True)
		Return True
	End If
				
	If Result = 4 Then
'		Msgbox2Async("Documento Stand-By creado en el Webservice", "Documento Stand-By", "Ok", "", "", bmp1, False)
'		Wait For Msgbox_Result (Result As Int)
	Else
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("Error!", "Documento Stand-By", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		Return True
	End If
		
	Dim Tido As String = TipoDoc
	Dim Cambiar_NroDocumento As Boolean = False
	
	Fila_Encabezado.Put("TipoDoc".ToLowerCase,Tido)
	DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
	
	If Tido = "NVV" Then
		
		Cambiar_NroDocumento = True
	
		Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete (Result2 As Boolean)
	
'		If Result2 = True Then
'			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'			Msgbox2Async("Productos con Stock suficiente", "Grabar documento", "Ok", "", "", bmp1, True)
'			Wait For Msgbox_Result (Result As Int)
'		End If
	
		If Result2 = False Then
			
			Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario("Bkp00015")) Complete (Rst As Boolean)
			
			If Not(Rst) Then
				Return True
			End If
								
		End If
		
	End If
	
	ProgressDialogShow("Actualizando el documento...")
		
	'Actualizamos la base de datos
	Sb_GrabarObservacionesDespachos
	'Fila_Observaciones.Put("observaciones".ToLowerCase,Txt_Observaciones.Text.Trim)
	'Fila_Observaciones.Put("orden_compra".ToLowerCase,Txt_Orden_compra.Text.Trim)
	'DBUtils.UpdateRecord2(Variables.vSql,"Observaciones_Doc",Fila_Observaciones,Fila_IdEnc)
	
	' Asi se deben armar los datos para generar el archivo Json de salida.
	' Se debe utilizar la funcion ExecuteJSON del asistente DBUtils
	' Se debe crear un arreglo en el cual se van poniendo los tipos de datos de cada uno de los campos que se requieren armar,
	' En este ejemplo se describen los campos de la tabla de descuentos.
	
	Dim Array_Encabezado() As String = GeneraArreglo("Encabezado_Doc")
	Consulta_Sql = "Select * From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Encabezado As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Encabezado)
	
	Dim Array_Detalle() As String = GeneraArreglo("Detalle_Doc")
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Detalle As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Detalle)
	
	Dim Array_Descuentos() As String = GeneraArreglo("Descuentos_Doc")
	Consulta_Sql = "Select * From Descuentos_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Descuentos As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Descuentos)
	
	Dim Array_Impuestos() As String = GeneraArreglo("Impuestos_Doc")
	Consulta_Sql = "Select * From Impuestos_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Impuestos As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Impuestos)
	
	Dim Array_Observaciones() As String = GeneraArreglo("Observaciones_Doc")
	Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Observaciones As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Observaciones)
	
	Dim Array_DespaFacil() As String = GeneraArreglo("DespaFacil_Doc")
	Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim DespaFacil As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_DespaFacil)
					
	Dim Json_Encabezado As String
	Dim Json_Detalle As String
	Dim Json_Descuentos As String
	Dim Json_Obseravciones As String
	Dim Json_DespaFacil As String
						
	Dim Encabezadojs As List
	Encabezadojs.Initialize
	Encabezadojs.Add(Encabezado)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Encabezadojs)	
	Json_Encabezado = JSONGenerator.ToPrettyString(1)
	
	Dim Detallejs As List
	Detallejs.Initialize
	Detallejs.Add(Detalle)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Detallejs)	
	Json_Detalle = JSONGenerator.ToPrettyString(1)
	
	Dim Descuentosjs As List
	Descuentosjs.Initialize
	Descuentosjs.Add(Descuentos)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Descuentosjs)	
	Json_Descuentos = JSONGenerator.ToPrettyString(1)
				
	Dim Observacionesjs As List
	Observacionesjs.Initialize
	Observacionesjs.Add(Observaciones)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Observacionesjs)				
	Json_Obseravciones = JSONGenerator.ToPrettyString(1)
	
	Dim DespaFaciljs As List
	DespaFaciljs.Initialize
	DespaFaciljs.Add(DespaFacil)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(DespaFaciljs)
	Json_DespaFacil = JSONGenerator.ToPrettyString(1)
	
	Dim EmailRandom As String = "EMAILCOMER" 'Variables.Global_Row_EstacionBk.Get("Mail_Random")
	Dim Para As String
	
	If EmailRandom <> "" And EmailRandom <> Null Then
		Try
			Para = Row_Entidad.Get(EmailRandom)
		Catch
			Para = ""
			Log(LastException)
		End Try
	End If
		
	Dim OldIdmaeedo As Int = Idmaeedo_Origen
	Dim CodFuncionario As String = Variables.Global_Row_Usuario_Activo.Get("KOFU")
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_EditarDocumentoJsonBakapp2(Me, _
																			OldIdmaeedo, _
																			CodFuncionario, _
																			Json_Encabezado, _
																			Json_Detalle, _
																			Json_Descuentos, _
																			Json_Obseravciones, _
																			Json_DespaFacil, _
																			Cambiar_NroDocumento)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			ProgressDialogHide
			
			Dim Respuesta As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Dim Idmaeedo As Int = Respuesta.Get("Idmaeedo")
			Dim Error As String = Respuesta.Get("Error")
			
			If Idmaeedo <> 0 Then
				
				Dim Endo As String = Fila_Encabezado.Get("CodEntidad")
				Dim Suendo As String = Fila_Encabezado.Get("CodSucEntidad")
				Dim Tido As String = Respuesta.Get("Tido")
				Dim Nudo As String = Respuesta.Get("Nudo")
				Dim Obseravacion As String = Fila_Observaciones.Get("Observacion")
				Dim NroOCC As String = Fila_Observaciones.Get("NroOCC")
				
'				Frm_Buscar_Documento.Idmaeedo = Idmaeedo
'				Frm_Buscar_Documento.Koen = Endo
'				Frm_Buscar_Documento.Suen = Suendo
'				Frm_Buscar_Documento.Observaciones = Obseravacion
'				Frm_Buscar_Documento.OCC = NroOCC
'				Frm_Buscar_Documento.Para = Para
'				Frm_Buscar_Documento.Tido = Tido
'				Frm_Buscar_Documento.Nudo = Nudo
'				Grabar = True
'				
'				Activity.Finish
'				Return
				
				bmp1 = LoadBitmap(File.DirAssets, "document-delivery-receipt-ok-2.png")
				
				'Msgbox2Async("Documento generado correctamente","Bakapp", "Ok","","", bmp1, True)
				Tab_Post.CurrentTab = 1
				Crear_NVV_Desde_COV = False
				Nuevo_Documento = True
				Editar_Documento = False
				Idmaeedo_Origen = 0
				Nudo_Origen = ""
				Sb_Nuevo_Documento
				Sb_Cargar_Detalle(False)
				
				Msgbox2Async("Documento actualizado correctamente", Tido & "-" & Nudo, "Enviar correo o imprimir", "","Cerrar", bmp1, True)
				Wait For Msgbox_Result (Result As Int)
	
				If Result <> DialogResponse.POSITIVE Then
					Activity.Finish
					Return True
				End If
				
				
				bmp1 = LoadBitmap(File.DirAssets, "send-mail-back-printer.png")
				Dim ErrorMailImp As Boolean
	
				Msgbox2Async("Elija su opción", Tido & "-" & Nudo, "Imprimir", "Enviar correo e imprimir","Enviar correo", bmp1, True)
				Wait For Msgbox_Result (Result As Int)
	
				' Solo imprimir
				If Result = DialogResponse.POSITIVE Then
					
					'Wait For(Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
					Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
		
					If Resultado <> "Ok" Then
						bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
						Msgbox2Async(Resultado,"Error al imprimir", "Ok","","", bmp1, True)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
					
				End If
	
				' Solo Enviar Correo
				If Result = DialogResponse.NEGATIVE Then
					
					'Wait For(Fx_Enviar_Correo_Bakapp(Idmaeedo,Para)) Complete (Resultado As String)
					Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmaeedo,Endo,Suendo,Para,"EMAILCOMER",True)) Complete (Resultado As String)
					
					If Resultado <> "Ok" Then
						bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
						Msgbox2Async(Resultado,"Error al enviar correo", "Ok","","", bmp1, True)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
					
				End If
	
				' Enviar correo e imprimir
				If Result = DialogResponse.CANCEL Then
					
					'Wait For(Fx_Enviar_Correo_Bakapp(Idmaeedo,Para)) Complete (Resultado As String)
					Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmaeedo,Endo,Suendo,Para,"EMAILCOMER",True)) Complete (Resultado As String)
					
					Log(Resultado)
					If Resultado <> "Ok" Then
						bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
						Msgbox2Async(Resultado,"Error al enviar correo", "Ok","","", bmp1, True)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
					
					'Wait For(Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
					Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo)) Complete (Resultado As String)
					
					If Resultado <> "Ok" Then
						bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
						Msgbox2Async(Resultado,"Error al imprimir", "Ok","","", bmp1, True)
						Wait For Msgbox_Result (Result As Int)
						ErrorMailImp = True
					End If
					
				End If
				
				If ErrorMailImp Then
					
					bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
					Msgbox2Async("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente" & CRLF & Tido & "-" & Nudo, _
								 "Información","Ok","","", bmp1, False)
					Wait For Msgbox_Result (Result As Int)
				
				End If
				
			End If
								
			Activity.Finish
				
		Else
				
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
					
			Msgbox2Async(Error,"Error al grabar", "Cerrar","","", bmp1, True)
			Wait For Msgbox_Result (Result As Int)
			
		End If
						
	End If
		
	ProgressDialogHide
	
	Return True
	
End Sub

Sub Sb_Ingresar_Correo_Validar(Para As String) As ResumableSub
	
	Private Base As B4XView
		
	Private dialog As B4XDialog
	Base = Activity
	dialog.Initialize (Base)
				
	Dim xui As XUI
	' Dim bmp1 As Bitmap
	
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
		
		Wait For (Sb_Ingresar_Correo_Validar(Para)) Complete (Resultado As String)
		
		Para = Resultado 
		
	End If
	
	Return Para
	
End Sub

Private Sub Sb_Grabar_StandBy As ResumableSub 
	
	Dim Accion As Int
	
	Private Cursor1 As Cursor
	
	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
	If Cursor1.RowCount = 0 Then
		
		Return 0
						
	End If

		
	'Actualizamos la base de datos
	Sb_GrabarObservacionesDespachos
	
	'Fila_Observaciones.Put("observaciones".ToLowerCase,Txt_Observaciones.Text.Trim)
	'Fila_Observaciones.Put("orden_compra".ToLowerCase,Txt_Orden_compra.Text.Trim)
	'DBUtils.UpdateRecord2(Variables.vSql,"Observaciones_Doc",Fila_Observaciones,Fila_IdEnc)
	
	' Asi se deben armar los datos para generar el archivo Json de salida.
	' Se debe utilizar la funcion ExecuteJSON del asistente DBUtils
	' Se debe crear un arreglo en el cual se van poniendo los tipos de datos de cada uno de los campos que se requieren armar,
	' En este ejemplo se describen los campos de la tabla de descuentos.
	
	Dim Array_Encabezado() As String = GeneraArreglo("Encabezado_Doc")
	Consulta_Sql = "Select * From Encabezado_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Encabezado As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Encabezado)
	
	Dim Array_Detalle() As String = GeneraArreglo("Detalle_Doc")
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Detalle As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Detalle)
	
	Dim Array_Descuentos() As String = GeneraArreglo("Descuentos_Doc")
	Consulta_Sql = "Select * From Descuentos_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Descuentos As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Descuentos)
	
	Dim Array_Impuestos() As String = GeneraArreglo("Impuestos_Doc")
	Consulta_Sql = "Select * From Impuestos_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Impuestos As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Impuestos)
	
	Dim Array_Observaciones() As String = GeneraArreglo("Observaciones_Doc")
	Consulta_Sql = "Select * From Observaciones_Doc Where Id_DocEnc = " & Id_DocEnc
	Dim Observaciones As Map = DBUtils.ExecuteJSON(Variables.vSql,Consulta_Sql,Null,0, Array_Observaciones)
					
	Dim Encabezadojs As List
	Encabezadojs.Initialize
	Encabezadojs.Add(Encabezado)
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize2(Encabezadojs)
	
	Dim Json As String = JSONGenerator.ToPrettyString(1)
	Dim Json2 As String = JSONGenerator.ToString
	
	Log(Json2)'(JSONGenerator.ToPrettyString(2))
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk(Me,Json,"Encabezado")
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Accion = 1
			
			Dim Detallejs As List
			Detallejs.Initialize
			Detallejs.Add(Detalle)
			Dim JSONGenerator As JSONGenerator
			JSONGenerator.Initialize2(Detallejs)
				
			Json = JSONGenerator.ToPrettyString(1)
				
			Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk(Me,Json,"Detalle")
			Wait For (Js) JobDone(Js As HttpJob)
			
			If Js.Success Then
						
				Dim vJson As String = Js.GetString
						
				If  vJson <> $"{"Table":[]}"$ Then
					
					Accion = 2
				
					Dim Descuentosjs As List
					Descuentosjs.Initialize
					Descuentosjs.Add(Descuentos)
					Dim JSONGenerator As JSONGenerator
					JSONGenerator.Initialize2(Descuentosjs)
				
					Json = JSONGenerator.ToPrettyString(1)
				
					Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk(Me,Json,"Descuentos")
					Wait For (Js) JobDone(Js As HttpJob)
			
					If Js.Success Then
						
						Dim vJson As String = Js.GetString
						
						If  vJson <> $"{"Table":[]}"$ Then
							
							Accion = 3
				
							Dim Observacionesjs As List
							Observacionesjs.Initialize
							Observacionesjs.Add(Observaciones)
							Dim JSONGenerator As JSONGenerator
							JSONGenerator.Initialize2(Observacionesjs)
				
							Json = JSONGenerator.ToPrettyString(1)
				
							Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk(Me,Json,"Observaciones")
							Wait For (Js) JobDone(Js As HttpJob)
			
							If Js.Success Then
						
								Dim vJson As String = Js.GetString
						
								If  vJson <> $"{"Table":[]}"$ Then
									
									Accion = 4
				
									'					Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk(Me,Json,"Detalle")
									'					Wait For (Js) JobDone(Js As HttpJob)
						
								End If
										
							End If
						
						End If
										
					End If
						
				End If
										
			End If
						
		End If
										
	End If
	
	Return Accion
		
End Sub

'Esta función permite generar un arreglo que trae la composición de la tabla de la base de datos SQLite
'Con la consulta PRAGMA se devuelve la estructura de la tabla de la base de datos SQLite
Private Sub GeneraArreglo(Tabla As String) As String()
	
	Consulta_Sql = "PRAGMA table_info('" & Tabla & "')"
	
	Private Tbl As Cursor
	
	Tbl = Variables.vSql.ExecQuery(Consulta_Sql)
	
	If Tbl.RowCount > 0 Then
		
		Dim	CantFilas As Int = Tbl.RowCount
		Dim Arreglo(CantFilas) As String
				
		For i = 0 To CantFilas-1
					
			Try
				
				Tbl.Position = i
				
				Dim nameDB As String = Tbl.GetString("name")
				Dim TypeDB As String = Tbl.GetString("type")
				
				If nameDB.Contains("Fecha") And TypeDB = "DOUBLE" Then
					Arreglo(i) = DBUtils.DB_DATE
				Else
						
					Select Case TypeDB
						Case "DOUBLE"
							Arreglo(i) = DBUtils.DB_DOUBLE
						Case "INTEGER","INT"
							Arreglo(i) = DBUtils.DB_INTEGER
						Case "INTEGER"
							Arreglo(i) = DBUtils.DB_INTEGER
						Case "BOOLEAN"
							Arreglo(i) = DBUtils.DB_BOOLEAN
						Case "STRING"
							Arreglo(i) = DBUtils.DB_TEXT
						Case "DATE"
							Arreglo(i) = DBUtils.DB_DATE
						Case Else
							If TypeDB.Contains("CHAR") Then
								Arreglo(i) = DBUtils.DB_TEXT
							Else
								Dim hola As String = "Aca"
							End If
					End Select
						
				End If				
										
			Catch
				Log(LastException)
			End Try
					
		Next
		
		Return Arreglo
			
	End If
	
	Return Null
		
End Sub

Private Sub Btn_DsctoGlobal_Click

	' Dim bmp1 As Bitmap
	Private Cursor1 As Cursor
	Dim DescuentoPorc As Double

	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
	If Cursor1.RowCount = 0 Then
		
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
					
		Msgbox2Async("¡No se puede agregar un concepto global si no existen datos en el documento!","Validación", "Cerrar","","", bmp1, True)
		Wait For Msgbox_Result (Result As Int)
		Return
						
	End If
	
	Wait For(Fx_ExisteDescuentoGlobal) Complete (RsdctoGl As Boolean)
	If RsdctoGl Then
		Return
	End If
	
	Btn_DsctoGlobal.Enabled = False
	
	Wait For(Sb_Buscar_Dscto_X_Cliente) Complete (ResultDscto As Double)
	DescuentoPorc = ResultDscto
	
	If ResultDscto < 0 Then
		Btn_DsctoGlobal.Enabled = True
		ProgressDialogHide
		Return 
	End If
	
	If ResultDscto > 0 Then
		DescuentoPorc = ResultDscto
	End If
	
	If ResultDscto = 0 Then
	
		Wait For(Fx_Insertar_Dscto_Global_Permiso) Complete (Result As Int)
		DescuentoPorc = Result
	
		If Result = 0 Then
			Btn_DsctoGlobal.Enabled = True
			Return
		End If
		
	End If
	
	Dim Concepto As String = "DESCUENTO"
	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String = Variables.Gl_Lista_Precios

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me,Concepto,Empresa,Sucursal,Bodega,Lista,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
	ProgressDialogShow("Buscando concepto...")
	
	If Js.Success Then
			
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim Fila As Map = Filas.Get(0)
				
			Fila.Put("Id_DocEnc",Id_DocEnc)

			Fila.Put("Moneda",Variables.Global_Row_Moneda.Get("KOMO"))
			Fila.Put("Tipo_Moneda",Variables.Global_Row_Moneda.Get("TIMO"))
			Fila.Put("Tipo_Cambio",Variables.Global_Row_Moneda.Get("VAMO"))
			Fila.Put("DescuentoPorc",DescuentoPorc)
			
			DBUtils.InsertMaps(Variables.vSql,"Detalle_Doc",Filas)
			
			Consulta_Sql = "Select * From Detalle_Doc Order by Id_DocDet Desc"
			Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
			 			 
			Dim Id_DocDet2 As Int = New_Row.Get("id_docdet")
				
			Sb_Procesar_Fila("DescuentoPorc",Id_DocDet2)
			
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
					
			Msgbox2Async("Descuento incorporado correctamente","Dscto. Global", "Ok","","", bmp1, True)
			Wait For Msgbox_Result (Result As Int)
		
		End If
						
	Else
		Log(Js.ErrorMessage)
		ToastMessageShow("CONCEPTO NO ENCONTRADO", False)
	End If

	Btn_DsctoGlobal.Enabled = True
	ProgressDialogHide
	
End Sub

Sub Sb_Buscar_Dscto_X_Cliente As ResumableSub
	
	'ProgressDialogShow("Comprobando permiso...")
	
	Dim xui As XUI
	
	Dim Koen As String = Fila_Encabezado.Get("CodEntidad".ToLowerCase)
	Dim Suen As String = Fila_Encabezado.Get("CodSucEntidad".ToLowerCase)
	
	Dim DescuentoPorc As Double
	
	DescuentoPorc = 0
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Descuento_Global_X_Cliente(Me,Koen,Suen)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Fila As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Dim TieneDsctoEspecial As Boolean = Fila.Get("TieneDsctoEspecial")
			Dim Error As String = Fila.Get("Error")
			DescuentoPorc = Fila.Get("Descuento")
		
			' Dim bmp1 As Bitmap
		
'			If Error <> "" Then
'				bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
'				Msgbox2Async("Error!", "Documento Stand-By", "Ok", "", "", bmp1, False)
'				Wait For Msgbox_Result (Result As Int)
'				Return 0
'			End If
			
		
			If TieneDsctoEspecial = False Then
				Return DescuentoPorc
			End If
			
			bmp1 = LoadBitmap(File.DirAssets, "question.png")
			
'			Dim sf As Object = xui.Msgbox2Async("¿Confirma el descuento adicional de un " & DescuentoPorc & "%?" & CRLF & _
'						"[SI] Confirmar" & CRLF & _
'						"[NO] Agregar un descuento menor","Descuento global adicional","Confirmar","","Ingr. otro Dscto.",Null)
'						
			Dim sf As Object = xui.Msgbox2Async("¿Confirma el descuento adicional de un " & DescuentoPorc & "%?", _
												"Descuento global adicional","Confirmar","Cancelar","Ingresar otro dscto.",Null)
			Wait For (sf) Msgbox_result (Result As Int)
			
			If Result = xui.DialogResponse_Cancel Then
				Return -1
			End If
						
			If Result = xui.DialogResponse_Negative Then
				
				Private Base As B4XView
				Private dialog As B4XDialog
	
				Base = Activity
				dialog.Initialize (Base)
				
				InputTemplate.lblTitle.Text = "Ingrese descuento. Max " & DescuentoPorc & "%"
				InputTemplate.Text = ""
				InputTemplate.ConfigureForNumbers(False,False)
				
				Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
				If Result = xui.DialogResponse_Positive Then
					Try
						Dim NewDescuentoPorc As Double = InputTemplate.Text
						
						If NewDescuentoPorc > DescuentoPorc Then
							bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
							Msgbox2Async("El descuento no puede ser mayor a un " & DescuentoPorc & "%" & CRLF & _
							"Debe ingresar un código de autorización","Validación", "Ok", "", "", bmp1, False)
							Wait For Msgbox_Result (Result As Int)
							DescuentoPorc = 0
						Else
							DescuentoPorc = NewDescuentoPorc
						End If
						
					Catch
						Log(LastException)
						bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
						Msgbox2Async("Error!",LastException, "Ok", "", "", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
						DescuentoPorc = -1
					End Try
				Else
					DescuentoPorc = -1
				End If
			End If
					
		End If
		
	End If
	
	'ProgressDialogHide
	Return DescuentoPorc
	
End Sub

Sub Fx_Insertar_Dscto_Global_Permiso As ResumableSub
	
	Private Base As B4XView
	Dim xui As XUI
	Private dialog As B4XDialog
	
	Base = Activity
	dialog.Initialize (Base)
	
	Dim Existe As Boolean
	Dim Otorgado As Boolean
	Dim DescuentoPorc As Int = 0
	
	Dim Clave As String

	InputTemplate.lblTitle.Text = "Ingrese clave del descuento"
	InputTemplate.Text = ""

	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Clave = InputTemplate.Text
	Else
		Return 0
	End If
	
	' Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me,Clave,Variables.Global_Row_Usuario_Activo.Get("KOFU"),False)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Fila As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Existe = Fila.Get("Existe")
			Otorgado = Fila.Get("Otorgado")
			DescuentoPorc = Fila.Get("Descuento")
			
			ProgressDialogHide
			
			If Existe Then
				If Otorgado Then
					Msgbox2Async("Este descuento ya fue utilizado" , "Validación", "Ok", "", "", bmp1, False)
					Wait For Msgbox_Result (Result As Int)
					DescuentoPorc = 0
				Else
					If DescuentoPorc <=0 Then
						Msgbox2Async("No se puede incorporar este descuento, ya que no es un valor valido." & CRLF & _
						"Porc.Dscto: " & DescuentoPorc & "%" , "Validación", "Ok", "", "", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
						DescuentoPorc = 0
					Else
						bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
						Msgbox2Async("Descuento aceptado." & CRLF & "Porc.Dscto: " & DescuentoPorc & "%" , "Validación", "Ok", "", "", bmp1, False)
						Wait For Msgbox_Result (Result As Int)
					End If
				End If
			Else
				Msgbox2Async("No se reconoce la clave para el descuento" , "Validación", "Ok", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
			End If
		End If
		
	Else
		Msgbox2Async("Error de conexión con el servidor" , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	End If
		
	ProgressDialogHide
	Return DescuentoPorc
	
End Sub

Sub Fx_Cambiar_DocDespSimple_Poswii As ResumableSub
	
	Private Base As B4XView
	Dim xui As XUI
	Private dialog As B4XDialog
	
	Base = Activity
	dialog.Initialize (Base)
	
	Dim Existe As Boolean
	Dim Otorgado As Boolean
	
	Dim Clave As String
	Dim Koen As String = Row_Entidad.Get("KOEN")

	InputTemplate.lblTitle.Text = "Ingrese clave del permiso"
	InputTemplate.Text = ""

	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Clave = InputTemplate.Text
	Else
		Return False
	End If
	
	' Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimple_Poswii(Me,Clave,Koen,False)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Fila As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Existe = Fila.Get("Existe")
			Otorgado = Fila.Get("Otorgado")
						
			ProgressDialogHide
			
			If Existe Then
				If Otorgado Then
					Msgbox2Async("Este permiso ya fue utilizado" , "Validación", "Ok", "", "", bmp1, False)
					Wait For Msgbox_Result (Result As Int)
				Else
'					bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'					Msgbox2Async("Permiso aceptado.", "Validación", "Ok", "", "", bmp1, False)
'					Wait For Msgbox_Result (Result As Int)
					Return True
				End If
			Else
				Msgbox2Async("No se reconoce la clave para el descuento" , "Validación", "Ok", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
			End If
		End If
		
	Else
		Msgbox2Async("Error de conexión con el servidor" , "Validación", "Ok", "", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	End If
		
	ProgressDialogHide
	Return False
	
End Sub

Private Sub Btn_Limpiar_LongClick
	Return
	' Dim bmp1 As Bitmap
	
	Wait For (Sb_Ingresar_Correo_Validar("")) Complete (Resultado As String)
	
	bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	Msgbox2Async(Resultado,"Respuesta correo", "Ok", "", "", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
	
End Sub

Private Sub Lbl_Lista_Precios_LongClick
	
	' Dim bmp1 As Bitmap
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario("Bkp00009")) Complete (Rst As Boolean)
			
	If Not(Rst) Then
		Return
	End If
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Msgbox2Async("¿desea cambiar la lista de precios " & SearchTemplate.SelectedItem & "?","Cambiar lista", "Si", "", "No", bmp1, False)
	Wait For Msgbox_Result (Result As Int)
		
	If Result <> XUI.DialogResponse_Positive Then
		Return
	End If

	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Listas de precios autorizadas"
	
	Wait For (Dialog.ShowTemplate(SearchTemplate, "", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		
		Msgbox2Async("¿Confirma utilizar la lista " & SearchTemplate.SelectedItem & "?","Confirmación", "Si", "", "No", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
		
		If Result = XUI.DialogResponse_Positive Then
			Lbl_Lista_Precios.Text = SearchTemplate.SelectedItem
			Dim Kolt As String = Funciones.Mid(Lbl_Lista_Precios.Text,1,3)
			Fila_Encabezado.Put("ListaPrecios".ToLowerCase,Kolt)
			DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
		End If
		
	End If
	
End Sub

Private Sub Label12_LongClick
	
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Observaciones"

	LongTextTemplate.CustomListView1.DefaultTextBackgroundColor = XUI.Color_White
	LongTextTemplate.CustomListView1.DefaultTextColor = XUI.Color_Black
	LongTextTemplate.Text = Txt_Observaciones.Text
	
	Dialog.ShowTemplate(LongTextTemplate, "OK", "", "")
	'Wait For (Dialog.ShowTemplate(LongTextTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		Txt_Observaciones.Text = LongTextTemplate.Text
'	End If
	
End Sub

Private Sub Label11_LongClick
	
	' Dim bmp1 As Bitmap
	
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Orden de compra"
	
	InputTemplate.lblTitle.Text = "Número de orden de compra"
	InputTemplate.Text = Txt_Orden_compra.Text
	
	Wait For (Dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Txt_Orden_compra.Text = InputTemplate.Text
	End If
		
End Sub

Sub Fx_Validar_Descuentos_Globales As ResumableSub
	
	Dim Contador As Int
	Dim Contador_Item As Int

	Dim TotalNetoDoc As Double = Funciones.Fx_NuloPorNro(Lbl_Total_Neto.Tag,0)
	Dim TotalIvaDoc As Double = Funciones.Fx_NuloPorNro(Lbl_Total_Iva.Tag,0)
	Dim TotalIlaDoc As Double = Funciones.Fx_NuloPorNro(Lbl_Total_Impuestos.Tag,0)
	Dim TotalBrutoDoc As Double = Funciones.Fx_NuloPorNro(Lbl_Total_Bruto.Tag,0)

	Dim TotalNetoSDscto As Double = 0
	Dim TotalDsctoGlobal As Double = 0
	Dim DsctoPorcGlobal As Double = 0

	Dim Afecta_Precio_Real As Boolean
	
	Dim SQL As SQL = Variables.vSql
	Dim Detalle As ResultSet
		
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc
	
	Detalle = SQL.ExecQuery(Consulta_Sql)
	
	Do While Detalle.NextRow
		
		Dim Cantidad As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("Cantidad"), 0)
		Dim Precio As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("Precio"), 0)
		Dim ValNetoLinea As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("ValNetoLinea"), 0)
		Dim UnTrans As Int= Detalle.GetString("UnTrans")
	
		Dim Codigo As String = Detalle.GetString("Codigo")
		Dim Tict As String = Detalle.GetString("Tict")
		Dim Prct As Boolean = Funciones.Cbool(Detalle.GetInt("Prct"))

		Dim Id_Oferta As Int '= Detalle.GetString("Id_Oferta").Value
		Dim Oferta As String '= Detalle.GetString("Oferta").Value
		'Dim Es_Padre_Oferta As Int '= Detalle.GetString("Es_Padre_Oferta").Value
		Dim Padre_Oferta As Int '= Detalle.GetString("Padre_Oferta").Value
		Dim Aplica_Oferta As Boolean '= Detalle.GetString("Aplica_Oferta").Value

		Dim ValVtaDescMax As Boolean = Funciones.Cbool(Detalle.GetInt("ValVtaDescMax"))

		If Tict <> "D" Then

			'If Not _Aplica_Oferta Or (_Aplica_Oferta And _Es_Padre_Oferta) Then
			TotalNetoSDscto = TotalNetoSDscto + Round2(Detalle.GetDouble("ValNetoLinea"),2) '   Math.Round(NuloPorNro(Detalle.GetString("ValNetoLinea").Value, 0), 2)
			'End If

			If Prct = False Then
				Contador_Item = Contador_Item + 1
			End If

		Else If Tict = "D" Then

			If Aplica_Oferta Then

				TotalNetoSDscto = TotalNetoSDscto + Round2(Detalle.GetDouble("ValNetoLinea"),2)
				'TotalNetoSDscto += Math.Round(NuloPorNro(Detalle.GetString("ValNetoLinea").Value, 0), 2)

			Else

				'Consulta_Sql = "Select * From TABCT Where KOCT = '" & _Codigo & "'"
				'Dim _RowConcepto As DataRow = _Sql.Fx_Get_DataRow(Consulta_Sql)

				'If Not (_RowConcepto Is Nothing) Then
				Afecta_Precio_Real = True'_RowConcepto.Item("RECAPRRE")
				'End If

				TotalDsctoGlobal = TotalDsctoGlobal + Round2(Detalle.GetDouble("ValNetoLinea")*-1,2)
				'Math.Round(NuloPorNro(Detalle.GetString("ValNetoLinea").Value, 0) * -1, 2)

			End If
		End If

	Loop


	Dim Var_DsctoGlobal As Double
	Dim Dscto_Parcilizado As Double

	If TotalDsctoGlobal > 0 Then
		DsctoPorcGlobal = 0
		DsctoPorcGlobal = TotalDsctoGlobal / TotalNetoSDscto
		Var_DsctoGlobal = Round2(DsctoPorcGlobal, 3)
		DsctoPorcGlobal = Round2(100 * DsctoPorcGlobal, 2)
		Dscto_Parcilizado = TotalDsctoGlobal / Contador_Item
	End If

	Dim Tiene_Dscto_Superado_Autorizado As Boolean
	Dim CodFuncionario_Autoriza As String

	Do While Detalle.NextRow

		Dim Id_DocDet As Int = Detalle.GetString("Id_DocDet")
		Dim Codigo As String = Detalle.GetString("Codigo")

		If Codigo = "" Then Exit

		Dim Prct As Boolean = Funciones.Cbool(Detalle.GetInt("Prct"))
		Dim Tict As String = Detalle.GetString("Tict")
		
		Dim ImportanciaPorc As Double
		Dim ImportanciaValor As Double

		Dim DescuentoValor As Double = Round2(Detalle.GetDouble("DescuentoValor"), 3)
		Dim NetoLinea As Double = Round2(Detalle.GetDouble("ValNetoLinea"), 3)
		Dim BrutoLinea As Double = Round2(Detalle.GetDouble("ValBrutoLinea"), 3)

		Dim CantUd1 As Double = Detalle.GetDouble("CantUd1")
		Dim CantUd2 As Double = Detalle.GetDouble("CantUd2")
		Dim NetoRealUd1 As Double
		Dim NetoRealUd2 As Double

		Dim DescuentoPorc As Double = Detalle.GetDouble("DescuentoPorc")
		Dim DsctoMaximoLinea As Double = Detalle.GetDouble("DescMaximo")
		Dim Rtu As Double = Detalle.GetDouble("Rtu")

		If Prct = False Then

			ImportanciaPorc = Round2(NetoLinea / TotalNetoSDscto, 5)
			ImportanciaValor = Round2(ImportanciaPorc * TotalDsctoGlobal, 5)

			Dim PrecioNetoUd1 As Double = Round2(NetoLinea / CantUd1, 3)
			NetoRealUd1 = Round2(PrecioNetoUd1 - (PrecioNetoUd1 * Var_DsctoGlobal), 3)

			If Rtu = 1 Then
				NetoRealUd2 = NetoRealUd1 * Rtu
				NetoRealUd2 = NetoRealUd1
			Else
				NetoRealUd2 = Round2((NetoLinea / CantUd2) - ((NetoLinea / CantUd2) * Var_DsctoGlobal), 3)
			End If


			Dim DsctoReal As Double = DsctoPorcGlobal
			DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","DsctoRealPorc",DsctoReal,CreateMap("Id_DocDet": Id_DocDet))
			
			Dim DsctoLinea As Double = Funciones.Fx_NuloPorNro(Detalle.GetDouble("DescuentoPorc"), 0)

			DsctoReal = Round2(100 * (1 - ((1 - (DsctoLinea / 100.0)) * (1 - (DsctoPorcGlobal / 100.0)))), 3)

			'If _DsctoLinea > 0 Then
			'    _DsctoReal = Detalle.GetString("DescuentoPorc")
			'End If

			If Afecta_Precio_Real = False Then
				If NetoLinea > 0 Then
					NetoRealUd1 = Round2(NetoLinea / CantUd1, 5)
					NetoRealUd2 = Round2(NetoLinea / CantUd2, 5)
				Else
					NetoRealUd1 = 0
					NetoRealUd2 = 0
				End If
			End If

			'Actualizamos los descuentos reales de las lineas
			DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","PrecioNetoRealUd1",NetoRealUd1,CreateMap("Id_DocDet": Id_DocDet))
			DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","PrecioNetoRealUd1",NetoRealUd2,CreateMap("Id_DocDet": Id_DocDet))
			
			Dim DsctoRealValor As Double

			If Chk_Valores_Netos.Checked Then
				DsctoRealValor = Round2((DsctoReal / 100) * TotalNetoDoc, 1)
			Else
				DsctoRealValor = Round2((DsctoReal / 100) * TotalBrutoDoc, 0)
			End If

			DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","DsctoRealPorc",DsctoReal,CreateMap("Id_DocDet": Id_DocDet))
			DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","DsctoRealValor",DsctoRealValor,CreateMap("Id_DocDet": Id_DocDet))

			Dim Tiene_Dscto As Boolean = Funciones.Cbool(Detalle.GetInt("Tiene_Dscto"))
			Dim ValVtaDescMax As Boolean = Funciones.Cbool(Detalle.GetInt("ValVtaDescMax"))

			If DsctoReal > DsctoMaximoLinea Then

				Dim CodFunAutoriza As String = Detalle.GetString("CodFunAutoriza")
				Dim CodVendedor As String = Detalle.GetString("CodVendedor")
				Dim CodPermiso As String = Funciones.Fx_NuloPorNro(Detalle.GetString("CodPermiso"), "")
				Dim Valor_Dscto As Double

				If CodFunAutoriza = "xyz" Then CodFunAutoriza = CodVendedor 'FUNCIONARIO

				'Dim _Tbl As DataTable = Fx_Trae_Permiso_Bk(_CodFunAutoriza, "Bkp00039")

				'If CBool(_Tbl.Rows.Count) Then 'Not Fx_Tiene_Permiso(Me, "Bkp00014", , True) Then
				'_Valor_Dscto = _Tbl.Rows(0).Item("Valor_Dscto")
				'End If

				Dim Es_Padre_Oferta As Boolean = Funciones.Cbool(Detalle.GetInt("Es_Padre_Oferta"))
				Dim Aplica_Oferta As Boolean = Funciones.Cbool(Detalle.GetString("Aplica_Oferta"))

				If Aplica_Oferta = False Or Es_Padre_Oferta Then

					If Valor_Dscto >= DsctoReal Then
						
'						Detalle.GetString("ValVtaDescMax") = False
'						Detalle.GetString("DsctoGlobalSuperado") = False
						
						DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","DsctoGlobalSuperado",False,CreateMap("Id_DocDet": Id_DocDet))
						DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","CodFuncionario_Autoriza",CodFunAutoriza,CreateMap("Id_DocDet": Id_DocDet))
						
					Else
						
						DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","ValVtaDescMax",True,CreateMap("Id_DocDet": Id_DocDet))
						DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","DsctoGlobalSuperado",True,CreateMap("Id_DocDet": Id_DocDet))
						Contador = Contador + 1
						
					End If

				End If

			End If

		End If

	Loop

'	Tiene_Dsctos_Superados = Funciones.Cbool(Contador)
'	Descuento_Global_Superado = Tiene_Dsctos_Superados

	If Contador = 0 Then

'		If Tiene_Dscto_Superado_Autorizado Then
'
'			For Each _FilaPer As DataRow In _TblPermisos.Rows
'				Dim _CodPermiso_Fila = _FilaPer.Item("CodPermiso")
'				If _CodPermiso_Fila = "Bkp00039" Then
'					_FilaPer.Item("Autorizado") = True
'					_FilaPer.Item("CodFuncionario_Autoriza") = _CodFuncionario_Autoriza
'					_FilaPer.Item("NomFuncionario_Autoriza") = _Sql.Fx_Trae_Dato("TABFU", "NOKOFU", "KOFU = '" & _CodFuncionario_Autoriza & "'")
'					_FilaPer.Item("Necesita_Permiso") = True
'					_FilaPer.Item("Permiso_Presencial") = True
'					Exit For
'				End If
'			Next
'
'		End If

		Return True

	Else

'		If _Mostrar_Alerta Then
'			MessageBoxEx.Show(Me, "Existen productos que superan el descuento máximo según lo establecido en la lista de precios",
'			"Superado descuento máximo",
'			MessageBoxButtons.OK, MessageBoxIcon.Stop, MessageBoxDefaultButton.Button1, Me.TopMost)
'			Sb_Marcar_Grilla()
'		End If
		Return False

	End If	
		
End Sub

Sub Sb_Recorrer_Detalle_Rev_Stock() As ResumableSub
	
	Dim SQL As SQL = Variables.vSql
	Dim Detalle As ResultSet
	Dim ProConStockInsuficiente As Int
		
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc	
	Detalle = SQL.ExecQuery(Consulta_Sql)

	ProgressDialogShow("Revisando stock...")
		
	Do While Detalle.NextRow
		
		Dim Id_DocDet As Int = Detalle.GetString("Id_DocDet")
		Dim	Empresa As String = Detalle.GetString("Empresa")
		Dim	Sucursal As String = Detalle.GetString("Sucursal")
		Dim	Bodega As String = Detalle.GetString("Bodega")
		Dim Codigo As String = Detalle.GetString("Codigo")
		Dim Cantidad As Double =Funciones.Fx_NuloPorNro(Detalle.GetDouble("Cantidad"), 0)
		Dim UnTrans As Int= Detalle.GetString("UnTrans")
		Dim	Tidopa As String
		
		Dim Tict As String = Detalle.GetString("Tict")
		Dim Prct As Boolean = Funciones.Cbool(Detalle.GetInt("Prct"))
		
		Dim	Tido As String
							
		If Prct = False Then

			Wait For(Sb_Revisar_Stock_X_Fila(Id_DocDet,Tido,Codigo,Empresa,Sucursal,Bodega,Cantidad,UnTrans,"")) Complete (Result As Boolean)

			If Result = False Then
				ProConStockInsuficiente = ProConStockInsuficiente+1
			End If

		End If

	Loop
	
	ProgressDialogHide
	
	If ProConStockInsuficiente > 0 Then
		Return False
	End If
	
	Return True
	
End Sub

Sub Sb_Revisar_Stock_X_Fila(vId_DocDet As Int, _
							Tido As String, _
							Codigo As String, _
							Empresa As String, _
							Sucursal As String, _
							Bodega As String, _
							Cantidad As Double, _
							UnTrans As Int, _
							Tidopa As String) As ResumableSub

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Revisar_Stock_Fila(Me,Tido,Empresa,Sucursal,Bodega,Codigo,Cantidad,UnTrans,Tidopa)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim FilaStk As Map = Filas.Get(0)
				
			Dim Stock_Disponible As Double = FilaStk.Get("Stock_Disponible")
			Dim Stock_Fisico As Double = FilaStk.Get("Stock_Fisico")
			Log("Stock disponible: " & Stock_Disponible & ", Stock fisico: " & Stock_Fisico)
				
			Dim Stock_Suficiente As Boolean

			If Stock_Disponible <= 0 Then
				Stock_Suficiente = False
			Else
				If Stock_Disponible - Cantidad >= 0 Then
					Stock_Suficiente = True
				End If
			End If

			DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","stockbodega",Stock_Disponible,CreateMap("Id_DocDet": vId_DocDet))

			'Fila.Put("stockbodega",Stock_Disponible)
		
			If Stock_Suficiente = False Then					
				Return False					
			End If
																					
		Else
			
			Dim xui As XUI			
			Dim sf As Object = xui.Msgbox2Async("No se pudo establecer comunicación con el servidor WebService...","Error de comunicación","OK","","",Null)
			Return False
			
		End If
							
	Else
		Log(Js.ErrorMessage)
	End If
	
	Return True
	
End Sub

Private Sub Fx_ExisteDescuentoGlobal As ResumableSub
	
	Dim Cursor1 As Cursor
	Dim RowNumber As Int = 0
	
	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea " & _
									 "From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
	If Cursor1.RowCount > 0 Then
		
		RowNumber = Cursor1.RowCount
		
		For Row = 0 To RowNumber - 1
			
			Cursor1.Position = Row
			IDList.Add(Cursor1.GetString2(0))
			
			Dim Id_DocDet As Int = Cursor1.GetString("Id_DocDet")
			Dim Tict As String = Cursor1.GetString("Tict")
			Dim Prct As Int = Cursor1.GetString("Prct")
			
			If Prct = 1 And Tict = "D" Then
				' Dim bmp1 As Bitmap	
				bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
				Msgbox2Async("¡YA EXISTE UN DESCUENTO GLOBAL!","Validación", "OK", "", "", bmp1, False)
				Wait For Msgbox_Result (Result As Int)
				Return True												
			End If
			
		Next
		
	Else
		ToastMessageShow("No items found", False)
	End If
	
	Cursor1.Close	
	
	Return False
	
End Sub

Private Sub Sb_GrabarObservacionesDespachos
	
	If  Not(Txt_ObservacionesDesp.IsInitialized) Then
		Return
	End If
	
	If Txt_ObservacionesDesp.Visible Then
		Txt_Observaciones.Text = Txt_ObservacionesDesp.Text
	End If
	
	Fila_Observaciones.Put("Observaciones",Txt_Observaciones.Text)
	Fila_Observaciones.Put("Orden_compra",Txt_Orden_compra.Text)
	DBUtils.UpdateRecord2(Variables.vSql,"Observaciones_Doc",Fila_Observaciones,Fila_IdEnc)
				
	Fila_DespaFacil.Put("CodTipoDespacho",Lbl_TipoDespacho.Tag)
	Fila_DespaFacil.Put("TipoDespacho",Lbl_TipoDespacho.Text)
	Fila_DespaFacil.Put("CodTipoPagoDesp",Lbl_TipoPagoDesp.Tag)
	Fila_DespaFacil.Put("TipoPagoDesp",Lbl_TipoPagoDesp.Text)
	Fila_DespaFacil.Put("CodDocDestino",Lbl_CodDocDestino.Tag)
	Fila_DespaFacil.Put("DocDestino",Lbl_CodDocDestino.Text)
	Fila_DespaFacil.Put("TransporteDesp",Txt_TransporteDesp.Text)
	Fila_DespaFacil.Put("DireccionDesp",Txt_DireccionDesp.Text)
	Fila_DespaFacil.Put("ObservacionesDesp",Txt_ObservacionesDesp.Text)
	DBUtils.UpdateRecord2(Variables.vSql,"DespaFacil_Doc",Fila_DespaFacil,Fila_IdEnc)
	
End Sub


Private Sub Btn_TipoDespachoSimple_Click
	
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Seleccione el Tipo de despacho"
	
	Wait For (Dialog.ShowTemplate(DespSimple_Tipo, "", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		
		If Result = XUI.DialogResponse_Positive Then
			
			For Each Fila As Map In Variables.Global_Sis_DespachoSimple_Tipo
				
				Dim CodigoTabla As String  = Fila.Get("CodigoTabla")
				Dim NombreTabla As String  = Fila.Get("NombreTabla")
				
				If DespSimple_Tipo.SelectedItem.Trim = NombreTabla.Trim Then
					
					Dim Emp As String = Fila.Get("Emp")
					Dim Suc As String = Fila.Get("Suc")
					Dim Bod As String = Fila.Get("Bod")
					
					Private Row As Int
					Private Cursor1 As Cursor
	
					Dim RowNumber As Int = 0

					Cursor1 = Variables.vSql.ExecQuery("Select Bodega From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc)
	
					If Cursor1.RowCount > 0 Then
						RowNumber = Cursor1.RowCount						
						For Row = 0 To RowNumber - 1
							Cursor1.Position = Row							
							If Cursor1.GetString("Bodega").Trim <> Bod.Trim Then
								bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
								Msgbox2Async("No se puede cambiar el tipo de despacho, ya que es de otra sucursal y hay productos en el listado", _
											 "Validación", "Ok", "", "", bmp1, False)
								Wait For Msgbox_Result (Result As Int)
								Return
							End If
						Next					
					End If	
					Cursor1.Close
									
					Fila_Encabezado.Put("Empresa".ToLowerCase,Emp)
					Fila_Encabezado.Put("Sucursal".ToLowerCase,Suc)
					DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
					
					Variables.Gl_Empresa = Emp
					Variables.Gl_Sucursal = Suc
					Variables.Gl_Bodega = Bod
					
					Lbl_TipoDespacho.Tag = CodigoTabla
					Lbl_TipoDespacho.Text = NombreTabla
					
					Wait For(Sb_Titulo) complete(res As Boolean)
					Wait For(Sb_VisibleOcultarDespachoSimple) complete (res As Boolean)
					
					Sb_GrabarObservacionesDespachos
					
					ToastMessageShow("SUCURSAL: " & Suc, False)
										
					Exit
					
				End If
				
			Next
			
		End If
		
	End If
	
End Sub

Private Sub Btn_TipoPagoDesp_Click
	
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Seleccione el Tipo de despacho"
	
	Wait For (Dialog.ShowTemplate(DespSimple_TipoPago, "", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		
		If Result = XUI.DialogResponse_Positive Then
			
			For Each Fila As Map In Variables.Global_Sis_DespachoSimple_TipoPago
				
				Dim CodigoTabla As String  = Fila.Get("CodigoTabla")
				Dim NombreTabla As String  = Fila.Get("NombreTabla")
				
				If DespSimple_TipoPago.SelectedItem.Trim = NombreTabla.Trim Then
					Lbl_TipoPagoDesp.Tag = CodigoTabla
					Lbl_TipoPagoDesp.Text = NombreTabla
					Exit
				End If
				
			Next
			
		End If
		
	End If
	
End Sub

Private Sub Btn_CodDocDestino_Click	
	
	Wait For (Fx_Cambiar_DocDespSimple_Poswii) complete (TienePermiso As Boolean) 
	
	If Not(TienePermiso) Then
		Return
	End If	
	
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
			
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Seleccione el Tipo de despacho"
	
	Wait For (Dialog.ShowTemplate(DespSimple_DocDestino, "", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		
		If Result = XUI.DialogResponse_Positive Then
			
			For Each Fila As Map In Variables.Global_Sis_DespachoSimple_DocDestino
				
				Dim CodigoTabla As String  = Fila.Get("CodigoTabla")
				Dim NombreTabla As String  = Fila.Get("NombreTabla")
				
				If DespSimple_DocDestino.SelectedItem.Trim = NombreTabla.Trim Then
					Lbl_CodDocDestino.Tag = CodigoTabla
					Lbl_CodDocDestino.Text = NombreTabla
					Exit
				End If
				
			Next
			
		End If
		
	End If
	
End Sub

Private Sub Sb_VisibleOcultarDespachoSimple As ResumableSub
	
	If B4A_DespachoSimple = False Then
		Return False
		'SubExists(Lbl_TipoDespacho,"")
	End If	
	
	Dim EnbDesp As Boolean
	
	If Lbl_TipoDespacho.Text.Contains("DESPACHO") Then
		EnbDesp = True
	Else
		EnbDesp = False
	End If
					
	Txt_DireccionDesp.Visible = EnbDesp
	Txt_ObservacionesDesp.Visible = EnbDesp
	Txt_TransporteDesp.Visible = EnbDesp
					
	Lbl_DireccionDesp.Visible = EnbDesp
	Lbl_TransporteDesp.Visible = EnbDesp
	Lbl_ObservacionesDesp.Visible = EnbDesp
	Lbl_Observaciones.Visible = EnbDesp
	Txt_Observaciones.Visible = Not(EnbDesp)
	
	Return True
	
End Sub