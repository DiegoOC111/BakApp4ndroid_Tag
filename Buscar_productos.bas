B4A=true
Group=Default Group\Productos
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Dim Consulta_Sql As String
	Public Fila As Map
	Public Lista As String 
	Public ProductoABuscar As String
	Public Msj As Mensajes
	Public VerStockOtrasBodegas As Boolean

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	

	Private Txt_Codigo_Descripcion As EditText
	Private Btn_Buscar As Button
	Public Id_DocEnc As Int
'	Private Lv_Productos As ListView
	
	Dim TecladoSoft As IME ' biblioteca IME
	Dim xui As XUI
	
	Private XclvDetalle As CustomListView
	Private Lbl_Codigo As B4XView
	Private Lbl_CodTecnico As B4XView
	Private Lbl_Descripcion As B4XView
	Private Lbl_Datos As B4XView
	
	Private Btn_Seleccionar As B4XView
	Private Img_Eliminar As B4XImageView
	
	Private B4XLoading As B4XLoadingIndicator
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
    Activity.LoadLayout("Buscador")
	Activity.Title = "BUSCAR PRODUCTOS"
	
	Msj.Initialize
	Txt_Codigo_Descripcion.RequestFocus
	
	'TecladoSoft.HideKeyboard
	TecladoSoft.ShowKeyboard(Txt_Codigo_Descripcion)
	B4XLoading.Hide
	
	Txt_Codigo_Descripcion.Text = ProductoABuscar
	
	If Txt_Codigo_Descripcion.Text <> "" Then
		Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Txt_Codigo_Descripcion.Text)
	End If
	
End Sub

Sub Activity_Resume
	Fila = Null
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Sb_Buscar_Producto(VCodigo As String,VDescripcion As String)
		
	Dim vCadena As String
	
	vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescripcion, "Mp.KOPR+Mp.NOKOPR" & " LIKE '%","")

	XclvDetalle.Clear
	B4XLoading.Show

	Consulta_Sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1," & CRLF & _
                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
                   "From MAEPR Mp With (Nolock)" & CRLF & _
				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
				   		"' And Ms.KOSU = '" & Sucursal & _
						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
				   		"' And Tb.KOSU = '" & Sucursal & _
						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
                   "WHERE Mp.KOPR+Mp.NOKOPR  Like '%" & vCadena & "%'" & CRLF & _
                   "Order by Mp.KOPR" & CRLF & _
                   "Option ( Fast 20 )"
				   
	If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then
		
		Consulta_Sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR," & CRLF & _
					   "Case When '" & Bodega.Trim & "' = '01' Then Isnull(Ms.STOCK_ALAMEDA,0) When '" & Bodega.Trim & "' = '02' Then Isnull(Ms.STOCK_ENEA,0) Else 0 End As STFI1" & CRLF & _
                   	   "--,Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
                   	   "From MAEPR Mp With (Nolock)" & CRLF & _
				       "Left Join [@WMS_GATEWAY_STOCK] Ms On Ms.SKU = Mp.KOPR" & CRLF & _
                       "WHERE Mp.KOPR+Mp.NOKOPR  Like '%" & vCadena & "%'" & CRLF & _
                       "Order by Mp.KOPR" & CRLF & _
                       "Option ( Fast 20 )"
		
	End If
			
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
			
				Dim CODIGO As String = Fila.Get("CODIGO")
				Dim CODTECNICO As String = Fila.Get("CODTECNICO")
				Dim STFI1 As Double  = Fila.Get("STFI1")
				Dim DESCRIPCION As String = Fila.Get("DESCRIPCION")
												
'				vItem = vItem+1
'				vDetalle = vDetalle & vItem & ".- " & CODIGO & " - " & DESCRIPCION & CRLF
'				'Lv_Productos.AddTwoLines(CODIGO,DESCRIPCION)
				
				Dim p As B4XView = xui.CreatePanel("")
			
				p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,160dip)
				p.LoadLayout("Items_Productos")
				p.Color = Colors.Transparent
				
				Btn_Seleccionar.Tag = CODIGO
				Lbl_Codigo.Text = CODIGO
				Lbl_CodTecnico.Text = CODTECNICO
				Lbl_Descripcion.Text = DESCRIPCION
				Lbl_Datos.Text = "Stock: " & STFI1 & ", Bod: " & Bodega
				
				XclvDetalle.Add(p,"")
				
			Next
			
			Log(CODIGO & " - " & DESCRIPCION)
			
		Else
		
			ToastMessageShow("No se encontraron registros",False)
			
		End If
		
	End If

	B4XLoading.Hide
	ProgressDialogHide

End Sub

Sub Btn_Buscar_Click
	Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Txt_Codigo_Descripcion.Text)
End Sub

Sub Lv_Productos_ItemLongClick (Position As Int, Value As Object)

	Dim Empresa As String = Variables.Gl_Empresa
	Dim Sucursal As String = Variables.Gl_Sucursal
	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String = Variables.Gl_Lista_Precios

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me,Value,Empresa,Sucursal,Bodega,Lista,1,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)  
			Fila =Filas.Get(0)
				
			Dim Codigo As String = Fila.Get("Codigo")
			Log(Codigo)
			Dim Descripcion As String = Fila.Get("Descripcion")
			Dim StockBodega As Double  = Fila.Get("StockBodega")
					
			Dim vSTOCK As String = "Stock: " & StockBodega
						
			Private vSalir As Int
			vSalir = Msgbox2("¿Confirma la selección?" & CRLF & Descripcion & CRLF & vSTOCK, Codigo, "Si", "", "No", Null)
			
			If vSalir = DialogResponse.POSITIVE Then
														
				Fila.Put("Id_DocEnc",Frm_Post_01_Formulario.Id_DocEnc)
				
				DBUtils.InsertMaps(Variables.vSql,"Detalle_Doc",Filas)
				
				Consulta_Sql = "Select * From Detalle_Doc Order by Id_DocDet Desc"
			 
				Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
			 			 
				Frm_Post_01_Producto.Id_DocDet = New_Row.Get("id_docdet")
				Activity.Finish
				
			Else
				Fila = Null
			End If
				
		End If
						
	Else
		Log(Js.ErrorMessage)
	End If
	
End Sub

Private Sub Txt_Codigo_Descripcion_EnterPressed
	Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Txt_Codigo_Descripcion.Text)
End Sub

Private Sub Btn_Seleccionar_Click
	
	Dim Btn As Button = Sender
	Dim Codigo As String = Btn.Tag

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me,Codigo,Empresa,Sucursal,Bodega,Lista,1,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Fila = Filas.Get(0)
				
			Dim ErrorStr As String =Fila.Get("Error")
				
			If ErrorStr = Null Then
				Dim bmp1 As Bitmap
				bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
				Msgbox2Async(ErrorStr,"Problema al traer el producto", "Ok","","", bmp1, True)
				Fila = Null
				Return
			End If
				
			Dim Codigo As String = Fila.Get("Codigo")
			Log(Codigo)
			Dim Descripcion As String = Fila.Get("Descripcion")
			Dim StockBodega As Double  = Fila.Get("StockBodega")
					
			Dim vSTOCK As String = "Stock: " & StockBodega
						
			Dim sf As Object = xui.Msgbox2Async("¿Confirma la selección?" & CRLF & Descripcion & CRLF & vSTOCK,Codigo,"SI","","NO",Null)
			Wait For (sf) Msgbox_result (Result As Int)
			

			
			If Result = xui.DialogResponse_Positive Then
						
				Fila.Put("Id_DocEnc",Frm_Post_01_Formulario.Id_DocEnc)
				
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
			 			 
				Msj.EsCorrecto = True
						 
				Frm_Post_01_Producto.Id_DocDet = New_Row.Get("id_docdet")
				StartActivity(Frm_Post_01_Producto)
				
				Activity.Finish
				
			End If
			
		Else
			Fila = Null
		End If
						
	Else
		Log(Js.ErrorMessage)
	End If
	
End Sub

