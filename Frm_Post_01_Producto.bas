B4A=true
Group=Default Group\Tomar pedido
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

	Public Id_DocDet As Int
	Public Editar As Boolean
	Public ModoConsulta As Boolean
	Public Msj As Mensajes
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim Consulta_Sql As String
	
	Dim xui As XUI
	'Private Cmb_Precios As Spinner
	Private Txt_Codigo As EditText
	Private Lbl_Descripcion As Label
	Private Lbl_Ubicacion As Label
	Private Lbl_Stock As Label
	Private Txt_Cantidad As EditText
	Private Lbl_Precio As Label
	Private Lbl_Descuento As Label
	Private Lbl_Total As Label
	
	Dim Fila_Enc As Map
	Dim Fila As Map
	Dim Fila_Id As Map
	Dim Fila_Dscto As Map
	Dim RowProducto As Map
	Dim TblDescuentos As List
		
	Dim Procesar_Dscto As Boolean
		
	Private Btn_Aceptar As Button
	Private Btn_Eliminar As Button
	
	Dim TecladoSoft As IME ' biblioteca IME
	
	Dim TotalNetoDoc As Double
	Dim TotalBrutoDoc As Double
	Dim Total_Linea As Double
	
	Dim ChkValores As Boolean
	
	Dim FUNCIONARIO As String
	
	Private XclvDescuentos As CustomListView
	Private Lbl_Kodt As B4XView
	Private Lbl_Item As B4XView
	Private Lbl_Podt As B4XView
	Private Lbl_Vadt As B4XView
	
	Private Btn_Editar_Descuento As Button
	Private Btn_Revisar_Stock As Button
	Private Btn_Ubicacion As Button
	
	Private Lbl_ModoConsulta As Label
	Private Lbl_Bodega As Label
	Private Lbl_ListaPrecio As Label
	Private Btn_Editar_Precio As Button
	
	Dim Cl_PermisoX As Cl_PermisoXui	
	
	Dim bmp1 As Bitmap
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
		
	Activity.LoadLayout("Cp_Post_01_Producto")
	Msj.Initialize
	
	FUNCIONARIO = Variables.Global_Row_Usuario_Activo.Get("KOFU")
	
	Lbl_Bodega.Text = "Stock Bod. " & Variables.Gl_Bodega
	Lbl_ModoConsulta.Visible = ModoConsulta
	Btn_Aceptar.Visible = Not(ModoConsulta)
	
	If ModoConsulta Then
		Btn_Eliminar.Text = "CERRAR"
	End If
	
	ChkValores = True 'Valores Netos
		
	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocDet = " & Id_DocDet
	Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
	Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = " & Id_DocDet
	Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)

	'Cargamos el encabezado en la variable
	Consulta_Sql = "Select * From Encabezado_Doc Where Id_DocEnc = " & Fila.Get("id_docenc")
	Fila_Enc = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Txt_Codigo.Text = Fila.Get("codigo")
	Txt_Cantidad.Tag = Fila.Get("cantidad")
	Lbl_Descripcion.Text = Fila.Get("descripcion")
	Lbl_Precio.Tag = Fila.Get("precio")
	Lbl_Descuento.Tag = Fila.Get("descuentoporc")
	
	Total_Linea = Fila.Get("cantidad")*Fila.Get("precio")
	
	If ChkValores Then
		Lbl_Total.Tag = Fila.Get("valnetolinea")
	Else
		Lbl_Total.Tag = Fila.Get("valbrutolinea")
	End If

	If Lbl_Total.Tag = Null Then
		Lbl_Total.Tag = 0
	End If
		
	Lbl_Ubicacion.Text = Fila.Get("ubicacionbod")
	
	If Txt_Cantidad.Tag > 0 Then
		Txt_Cantidad.Text = Txt_Cantidad.Tag
	Else
		Txt_Cantidad.Text = ""
	End If
		
	Lbl_Precio.Text = "$ " & NumberFormat(Lbl_Precio.Tag,0,2)
	Lbl_Descuento.Text = NumberFormat(Lbl_Descuento.Tag,0,2)  & " %"
	Lbl_Total.Text = "$ " & NumberFormat(Lbl_Total.Tag,0,2)
		
	Lbl_Bodega.Text = "Stock Bod. " & Fila.Get("bodega")	
	Lbl_Stock.Text = Fila.Get("stockbodega")
	
'	For Each FilaLp As Map In Variables.Global_Listas_Precios_Usuario
'			
'		Dim Nokolt As String  = FilaLp.Get("Nokolt")
'		Cmb_Precios.Add(Nokolt)
'				
'	Next
	
	Dim Kolt As String = Fila.Get("codlista") 'Funciones.Mid(Cmb_Precios.SelectedItem,1,3)
	
	For Each Fl As Map In Variables.Global_Listas_Precios_Usuario
		Dim Kolt1 As String = Fl.Get("Kolt")
		Dim Nokolt1 As String = Fl.Get("Nokolt")
		If Kolt = Kolt1 Then
			Lbl_ListaPrecio.Text = Nokolt1
			Exit
		End If
	Next
	
	' Se saca desde la tabla Zw_TablaDeCaracterizaciones aquellas marcas que tienen descuento especial
	' La Tabla debe llamarse DSCTO_MARCA y el NombreTabla = 'MRPR', el porcentaje de descuento se saca desde el campo Porcentaje
				   
	Consulta_Sql = "Select Mp.*,Mr.*,Cast(Case When Crz.CodigoTabla Is Null Then 0 Else 1 End As Bit) As Acepta_Dscto_Marca,Isnull(Crz.Porcentaje,0) As Dscto_Marca" & CRLF & _
				   "From MAEPR Mp" & CRLF & _
				   "Left Join TABMR Mr On Mp.MRPR = Mr.KOMR" & CRLF & _
				   "Left Join " & Variables.Global_BaseBk & "Zw_TablaDeCaracterizaciones Crz On Crz.Tabla = 'DSCTO_MARCA' And Crz.NombreTabla = 'MRPR' And Crz.CodigoTabla = Mp.MRPR" & CRLF & _
				   "Where Mp.KOPR = '" & Fila.Get("codigo") & "'"
				
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
					
			RowProducto = Funciones.Fx_DataRow(Js.GetString)
						
		End If
										
	End If
	
	Id_DocDet = 0
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Descuentos_Seteados_Desde_Lista(Me,Variables.Gl_Empresa, _
																						Variables.Gl_Sucursal, _
																						Txt_Codigo.Text, _
																						Kolt, _
																						True, _
																						"", _
																						Fila.Get("poriva"), _
																						Fila.Get("porila"), _
																						"", _
																						True)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
					
			TblDescuentos = Funciones.Fx_DataTable(vJson)
					
		End If
										
	End If
	
	' mostrar el teclado
	If Txt_Cantidad.Text = "" Then
		TecladoSoft.ShowKeyboard(Txt_Cantidad)
	End If
	
	Cl_PermisoX.Initialize(Null,"")
	Cl_PermisoX.DesignerCreateView(Activity,Null,Null)
	
	' ocultar teclado
	TecladoSoft.HideKeyboard
	
	Procesar_Dscto = False
	   	
End Sub

Sub Activity_Resume

	If Procesar_Dscto Then
		'Fila.Get("descuentovalor")
		Fila.Put("descuentoporc",Frm_Post_01_Descuentos.Total_Pc)
		'Fila.Get("descuentoporc")
	
		Sb_Procesar_Datos("DescuentoPorc")
		Procesar_Dscto = False
	End If
	
	If Frm_InfoStockXProd.Msj.EsCorrecto Then
		
		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	
		Dim FilaSeleccionada As Map = Frm_InfoStockXProd.Msj.Tag
		
		Fila.Put("sucursal",FilaSeleccionada.Get("KOSU"))
		Fila.Put("bodega",FilaSeleccionada.Get("KOBO"))
		
		Lbl_Bodega.Text = "Stock Bod. " & Fila.Get("bodega")
		Lbl_Stock.Text = FilaSeleccionada.Get("STFI1")
	
'		Dim sf As Object = xui.Msgbox2Async(FilaSeleccionada.Get("NOKOBO"),"Fila seleccionada","Ok","","",bmp1)
'		Wait For (sf) Msgbox_result (Result As Int)
		
	End If	
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	
	Private vSalir As Int
	
	If KeyCode = KeyCodes.KEYCODE_BACK Then				
				
		If ModoConsulta Then			
			ModoConsulta = False
			DBUtils.DeleteRecord(Variables.vSql,"Detalle_Doc",Fila_Id)
			Id_DocDet = 0
			Return False					
		End If
				
		Dim Total As Double
		
		If ChkValores Then
			Total = Fila.Get("valnetolinea")
		Else
			Total = Fila.Get("valbrutolinea")
		End If
		
		If 0 = Txt_Cantidad.Tag Then
			
			vSalir = Msgbox2("Si deja la cantidad en cero el producto no se agregara a la lista" & CRLF & _
							"¿Estas seguro de salir?", "Validaación", "Si", "", "No", Null)
			
			If vSalir = DialogResponse.POSITIVE Then
				DBUtils.DeleteRecord(Variables.vSql,"Detalle_Doc",Fila_Id)
				Id_DocDet = 0
				Return False
			Else
				Return True
			End If
			
		End If
		
		If Total <> Lbl_Total.Tag Then
						
			vSalir = Msgbox2("¿Estas seguro de cerrar sin aplicar los cambios?", "SALIR SIN GRABAR", "Si", "", "No", Null)
			
			If vSalir = DialogResponse.POSITIVE Then
				
				If Not(Editar) Then
					DBUtils.DeleteRecord(Variables.vSql,"Detalle_Doc",Fila_Id)
				End If
				
				Id_DocDet = 0
				Return False
				
			Else
				Return True
			End If
			
		Else
			Id_DocDet = 0
			Return False
		End If
				
	End If
	
	Id_DocDet = 0
	Return False
	
End Sub

Sub Txt_Cantidad_Click   'if you are in the focus
	Txt_Cantidad.SelectAll
End Sub

Sub Txt_Cantidad_EnterPressed
	
	Txt_Cantidad.Tag = Txt_Cantidad.Text
	If Txt_Cantidad.Text.Trim = "" Then Txt_Cantidad.Tag = 0
	
	Wait For (Sb_Procesar_Datos("Cantidad")) Complete (Result As Boolean)
		
	If Txt_Cantidad.Tag > 0 Then		
		Sb_Insertar_Descuentos_En_Escala				
	End If
	
End Sub

Sub Btn_Eliminar_Click
	
	If ModoConsulta Then
		ModoConsulta = False
		DBUtils.DeleteRecord(Variables.vSql,"Detalle_Doc",Fila_Id)
		Id_DocDet = 0
		Activity.Finish
		Return
	End If
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
	Dim sf As Object = xui.Msgbox2Async("¿Estas seguro de eliminar este producto?","E L I M I N A R" ,"SI","","NO",bmp1)
	Wait For (sf) Msgbox_result (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		
		DBUtils.DeleteRecord(Variables.vSql,"Detalle_Doc",Fila_Id)
		
		Id_DocDet= Fila.Get("id_docdet")
		
		Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = " & Id_DocDet
		Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
		If Fila_Dscto.IsInitialized Then
			DBUtils.DeleteRecord(Variables.vSql,"Descuentos_Doc",Fila_Dscto)
		End If
		
		Id_DocDet = 0
		Activity.Finish
		
	End If
			
End Sub

Sub Sb_Procesar_Datos(Cabeza As String) As ResumableSub
	
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

	Dim Precio As Double = Lbl_Precio.Tag

	Dim PrecioNeto As Double
	Dim PrecioBruto As Double

	Dim PrecioNetoRealUd1 As Double
	Dim PrecioNetoRealUd2 As Double

	Dim Total As Double

	Dim Decimal = 2
	
	Dim Cantidad As Double = Txt_Cantidad.Tag
	Dim CantUd1 As Double
	Dim CantUd2 As Double
	
	Dim Divisible As String = RowProducto.Get("DIVISIBLE")
	Dim Divisible2 As String = RowProducto.Get("DIVISIBLE2")
	
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
	
	Dim Moneda_Enc As String = Fila_Enc.Get("moneda_doc")
	Dim Tipo_Moneda_Enc As String = Fila_Enc.Get("tipomoneda")
	Dim Tipo_Cambio_Ent As Double = Fila_Enc.Get("tasadorig_doc")

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

	TecladoSoft.HideKeyboard
		
	Dim Divi As String
	
	If UnTrans = 1 Then
		Divi = Divisible
	End If
	
	If UnTrans = 2 Then
		Divi = Divisible2
	End If
	
	If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi)) Then
			
		Msgbox2("El producto solo permite cantidades enteras","Validación","Ok","","", Null)
		Cantidad = 0
		Txt_Cantidad.Tag = 0
		Txt_Cantidad.Text = ""
		Txt_Cantidad.SelectAll
		TecladoSoft.ShowKeyboard(Txt_Cantidad)
		Return
	
	End If
	
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

		TotalNeto_Calculo = TotalNetoDoc
		TotalBruto_Calculo = TotalBrutoDoc

		If Tict = "D" Then

			Descontar = True
			Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1
			TotalNeto_Calculo = TotalNeto_Calculo + DescuentoValor_Anterior
			
			If Cabeza = "DescuentoPorc" Then
				
				If ChkValores Then
					DescuentoValor = Round2((DescuentoPorc / 100) * TotalNeto_Calculo, Decimales)
					'If Aplicar_Redondeo Then Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalNeto_Calculo) * 100, 5)
				Else
					DescuentoValor = Round2((DescuentoPorc / 100) * TotalBruto_Calculo,Decimales)
					'If _Aplicar_Redondeo Then _Descuento = Fx_Redondeo_Descuento(_Descuento, Chk_Redondear_Cero.Checked)
					DescuentoPorc = Round2((DescuentoValor / TotalBruto_Calculo) * 100, 5)
				End If

			Else If Cabeza = "DescuentoValor" Then

				If ChkValores Then
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

			If ChkValores Then
				TotalNeto = Total_Concepto
			Else
				TotalNeto = Round2(Total_Concepto / Impuestos, 3)
				TotalBruto = Total_Concepto
			End If

			If Cabeza = "DescuentoPorc" Then

				TotalNeto_Calculo = TotalNeto_Calculo - Recargo
				TotalBruto_Calculo = TotalBruto_Calculo - Recargo

				DescuentoPorc = DescuentoPorc / 100

				If ChkValores Then
					
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

				If ChkValores Then
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

		If ChkValores Then
			PrecioNeto = Precio_Calculado
		Else
			PrecioNeto = Round2(Precio_Calculado / Impuestos, 3)
			PrecioBruto = Precio_Calculado
		End If

		TotalNeto = Round2(PrecioNeto * Cantidad, 3)
		TotalBruto = Round2((TotalNeto * Impuestos), 0)

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

				If ChkValores Then
				
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

			If ChkValores Then
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

		If ChkValores Then
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

		If CodFunAutoriza = "xyz" Then CodFunAutoriza = FUNCIONARIO

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

						CodFunAutoriza_Dscto = FUNCIONARIO
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

	If ChkValores Then ' SI VALORES SON NETOS
		TotalNeto = TotalNeto - DescuentoValor
	Else                      ' SI VALORES SON BRUTOS
		TotalBruto = TotalBruto - DescuentoValor
	End If

	'End If

	If ChkValores Then ' SI VALORES SON NETOS

		TotalNeto = Round2(TotalNeto, Decimales)
		TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
		TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
		TotalBruto = Round2((TotalNeto * Impuestos), 0)
		TotalDsctoNeto = DescuentoValor

		Total = TotalNeto

		PrecioNeto = Precio
		PrecioBruto = Round2(Precio * Impuestos, 0)

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


	If Descontar Then

		PrecioNetoRealUd1 = 0
		PrecioNetoRealUd2 = 0

		If ChkValores Then ' SI VALORES SON NETOS
			TotalNeto = TotalNeto - DescuentoValor
			TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
			TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
			TotalBruto = Round2((TotalNeto * Impuestos), 0)
			TotalDsctoNeto = DescuentoValor
			Total = TotalNeto
		Else                      ' SI VALORES SON BRUTOS
			TotalBruto = DescuentoValor
			TotalNeto = Round2(TotalBruto / Impuestos, 5)
			TotalIva = (Round2(TotalNeto * (PorIva / 100), 5))
			TotalIla = (Round2(TotalNeto * (PorIla / 100), 5))
			TotalDsctoBruto = DescuentoValor
			Total = TotalBruto
		End If

		If TotalNeto > 0 Then

			TotalIla = TotalIla * -1
			TotalIva = TotalIva * -1
			TotalNeto = TotalNeto * -1
			TotalBruto = TotalBruto * -1
			Total = Total * -1

		End If

		'.Cells("Precio").Value = 0

	Else

		If Cantidad > 0 Then

			PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1, 5)
			PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2, 5)

			If ChkValores = False Then
				PrecioNeto = PrecioNetoRealUd1
			End If

		Else
			PrecioNetoRealUd1 = 0
			PrecioNetoRealUd2 = 0
		End If

	End If

	If Prct = 1 Then

		Dim Multiplo = 1

		If Tict = "D" Then
			Multiplo = -1
		Else If Tict = "R" Then
			Multiplo = 1
		End If

		If ChkValores Then
			
			CantUd1 = TotalNeto * Multiplo
			CantUd2 = 0
			'.Cells("CDespUd1").Value = CantUd1
			
		Else
			
			CantUd1 = TotalBruto * Multiplo
			CantUd2 = 0
			'.Cells("CDespUd1").Value = CantUd1
			
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

	If ChkValores Then
		Lbl_Total.Text = "$ " & NumberFormat(TotalNeto,0,2)
	Else
		Lbl_Total.Text = "$ " & NumberFormat(TotalBruto,0,0)
	End If

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
	
	Lbl_Descuento.Text = NumberFormat(DescuentoPorc,0,2)  & " %"
	
	
	Dim TipoValor As String
	
	If ChkValores Then
		Lbl_Total.Text = "$ " & NumberFormat(TotalNeto,0,2)
		TipoValor = "N"
		Total_Linea = TotalNeto	+ DescuentoValor
	Else
		Lbl_Total.Text = "$ " & NumberFormat(TotalBruto,0,0)
		TipoValor = "B"
		Total_Linea = TotalBruto + DescuentoValor
	End If
	
	Fila.Put("tipovalor",TipoValor)
	
	Dim PrecioNetoUd As Double = PrecioNeto
	Dim PrecioBrutoUd As Double = PrecioBruto
	
	Dim PrecioNetoUdLista As Double = Round2(Fila.Get("precionetoudlista"), 0)
	Dim PrecioBrutoUdLista As Double = Round2(Fila.Get("preciobrutoudlista"), 0)

	Fila.Put("precionetoud",PrecioNetoUd)
	'Fila.Put("precionetoudlista",PrecioNetoUdLista)
	Fila.Put("preciobrutoud",PrecioBrutoUd)
	'Fila.Put("preciobrutoudlista",PrecioBrutoUdLista)
		
	Return True
		
End Sub

Sub Sb_Insertar_Descuentos_En_Escala() As ResumableSub

	ProgressDialogShow("Buscando productos...")
	
	Id_DocDet= Fila.Get("id_docdet")
	Dim Id_DocEnc As Int = Fila.Get("id_docenc")

	Dim NroDscto As Int = 0
	Dim Precio As Double = Lbl_Precio.Tag

'	If ChkValores.Checked Then
'		_Precio = _Fila.Cells("ValNetoLinea").Value
'	Else
'		_Precio = _Fila.Cells("ValBrutoLinea").Value
'	End If

	Dim Valor As Double = Fila.Get("valnetolinea")
	'Dim Redondear_Dscto As Boolean' = Chk_Redondear_Cero.Checked
	Dim Total_Descuento As Double
	Dim Total_Pc As Double

	If Fila_Dscto.IsInitialized Then
		DBUtils.DeleteRecord(Variables.vSql,"Descuentos_Doc",Fila_Dscto)
	End If

	Dim Decimales As Int

	Dim Moneda_Det As String '= _Fila.Cells("Moneda").Value
	Dim Moneda_Enc As String '= _TblEncabezado.Rows(0).Item("Moneda_Doc")

	Dim Tipo_Moneda_Enc As String '= _TblEncabezado.Rows(0).Item("TipoMoneda")
	Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.Rows(0).Item("Valor_Dolar")

	If Moneda_Det.Trim <> Moneda_Enc.Trim Then
		If Tipo_Moneda_Enc <> "N" Then
			Decimales = 2
		End If
	Else
		If Tipo_Moneda_Enc <> "N" Then
			Decimales = 2
		End If
	End If

	'If ChkValores.Checked Then
	'    _Decimal = 2
	'Else
	'    _Decimal = 0
	'End If
	
	'Dim Cols() As String
	
	For i = 0 To TblDescuentos.Size - 1
		
		Dim FilaDscto As Map = TblDescuentos.Get(i) ' Convertimos el primer registro de la lista en un Map (Row)
		'Cols = TblDescuentos.Get(i)
	
		'Dim TCampo As String = FilaDscto.Get("Tcampo")

		Dim Kodt As String = "D_SIN_TIPO"'FilaDscto.Get("Kodt")
		Dim Podt As Double = FilaDscto.Get("Dscto")
		Dim Vadt As Double = FilaDscto.Get("Valor")

		If Podt <> 0 Or Vadt <> 0 Then

			If Podt <> 0 Then '_TCampo = "Dp" Then

				If Podt > 0 Then
					Vadt = Round2((Podt / 100) * Valor,Decimales)
					'If _Redondear_Dscto Then _Vadt = Fx_Redondeo_Descuento(_Vadt, _Redondear_Dscto)
					'_DescuentoPorc = Math.Round((_Descuento / _TotalNeto_Calculo) * 100, 5)
					Podt = Round2((Vadt / Valor) * 100,5)
					'Podt = Math.Round((_Vadt / _Valor) * 100, 5)
				Else
					Vadt = 0
				End If

			Else 'If _Cabeza = "Vadt" Then

				If Vadt <> 0 Then
					'If _Redondear_Dscto Then _Vadt = Fx_Redondeo_Descuento(_Vadt, _Redondear_Dscto)
					Podt = Round2((Vadt / Valor) * 100,5)
					'_Podt = Math.Round((_Vadt / _Valor) * 100, 5)
				Else
					Podt = 0
				End If

			End If

			Podt = Round2(Podt,Decimales)

			If Podt <> 0 Then

				Consulta_Sql = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)"
				Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object (Id_DocEnc,Id_DocDet,"",Kodt,Podt,Vadt,Podt))
		
				NroDscto = NroDscto + 1

			End If

			Total_Descuento = Total_Descuento + Vadt
			Valor = Valor - Vadt

		End If

	Next

	If Total_Descuento <> 0 Then
		Total_Pc = Total_Descuento / Precio
	End If

	'_Fila.Cells("Podt").Value = _Podt
	'_Fila.Cells("Vadt").Value = _Vadt
	'_Fila.Cells("UltDscto").Value = _Vadt
	'_Fila.Cells("Podt_Original").Value = _Podt_Original
	'_Fila.Cells("CodDscto").Value = "D_SIN_TIPO"

	'If ChkValores.Checked Then
	'    _DescuentoValor = _Fila.Item("VADTNELI")
	'Else
	'    _DescuentoValor = _Fila.Item("VADTBRLI")
	'End If

	Fila.Put("descuentovalor",Total_Descuento)
	Fila.Put("nrodscto",NroDscto)
	
	'_Fila.Cells("DescuentoValor").Value = _Total_Descuento
	'_Fila.Cells("NroDscto").Value = _NroDscto

	Sb_Procesar_Datos("DescuentoValor")

	ProgressDialogHide

End Sub

Sub Sb_Revisar_Descuentos
	
	Consulta_Sql = "Select * From Descuentos_Doc Where Id_DocDet = " & Id_DocDet
	TblDescuentos = DBUtils.ExecuteList(Variables.vSql,Consulta_Sql,Null,0)
	
End Sub

Sub Btn_Aceptar_Click

	If 0 = Txt_Cantidad.Tag  Then
		
		Msgbox2Async("No puede agregar un producto con cantidad cero" , "Validación", "Ok", "", "", Null, False)
		Wait For Msgbox_Result (Result As Int)
		Return

	Else
			
		Dim Codigo As String = Fila.Get("codigo")
		Dim Tido As String = "NVV" 
		Dim Empresa As String = Fila.Get("empresa")
		Dim Sucursal As String = Fila.Get("sucursal")
		Dim Bodega As String = Fila.Get("bodega")
		Dim Cantidad As Double = Fila.Get("cantidad")
		Dim UnTrans As Int = Fila.Get("untrans")
		Dim Tidopa As String = Fila.Get("tidopa")
						
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

				Fila.Put("stockbodega",Stock_Disponible)
				Lbl_Stock.Text = Fila.Get("stockbodega")

				If Stock_Suficiente = False Then
					
'					Dim bmp1 As Bitmap
	
					bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png") 'symbol-cancel.png
																			
					Dim sf As Object = xui.Msgbox2Async("Producto con stock insuficiente, Stock disponible: " & Stock_Disponible & CRLF & _
													"¿Desea agregarlo de todas formas?","Validación","SI","","NO",bmp1)
					Wait For (sf) Msgbox_result (Result As Int)
			
					If Result <> xui.DialogResponse_Positive Then
						Return
					End If
					
				End If
				
				Id_DocDet = 0

				'Dim Kolt As String = Funciones.Mid(Cmb_Precios.SelectedItem,1,3)

				Fila.Put("codfuncionario",Variables.Global_Row_Usuario_Activo.Get("KOFU"))
				Fila.Put("codvendedor",Variables.Global_Row_Usuario_Activo.Get("KOFU"))
				'Fila.Put("codlista",Kolt)
				
				Fila.Put("moneda",Variables.Global_Row_Moneda.Get("KOMO"))
				Fila.Put("tipo_moneda",Variables.Global_Row_Moneda.Get("TIMO"))
				Fila.Put("tipo_cambio",Variables.Global_Row_Moneda.Get("VAMO"))
				
				DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",Fila,Fila_Id)
				Msj.EsCorrecto = True
				Activity.Finish
															
			Else
				Dim sf As Object = xui.Msgbox2Async("No se pudo establecer comunicación con el servidor WebService...","Error de comunicación","OK","","",Null)
				Return
			End If
							
		Else
			Log(Js.ErrorMessage)
		End If

	End If
	
End Sub

Private Sub Btn_Editar_Descuento_Click
	
	Dim Acepta_Dscto_Marca As Boolean = RowProducto.Get("Acepta_Dscto_Marca") 'Nokomr.Contains("*")
	Dim Dscto_Max As Double = RowProducto.Get("Dscto_Marca")
	Dim NroDscto As Int 
	
	If Not(Acepta_Dscto_Marca) Then
		
'		Dim bmp1 As Bitmap
		
		bmp1 = LoadBitmap(File.DirAssets, "key.png")
		
		Msgbox2Async("Para ingresar el descuento necesita una clave de autorización" , "Validación", "Ok", "Cancelar", "", bmp1, False)
		Wait For Msgbox_Result (Result As Int)
	
		If Result <> xui.DialogResponse_Positive Then
			Return
		End If

		Wait For(Fx_Insertar_Dscto_Global_Permiso) Complete (Result As Int)
		Dscto_Max = Result
	
		If Result = 0 Then			
			Return
		End If
		
	End If
	
	NroDscto = Fila.Get("nrodscto")
	
	Id_DocDet= Fila.Get("id_docdet")
	Frm_Post_01_Descuentos.Id_DocEnc =Fila.Get("id_docenc")
	Frm_Post_01_Descuentos.Id_DocDet =Id_DocDet
'	Frm_Post_01_Descuentos.Acepta_Dscto_Marca = Acepta_Dscto_Marca
'	Frm_Post_01_Descuentos.Dscto_Marca = Dscto_Marca
	Frm_Post_01_Descuentos.Dscto_Max = Dscto_Max
	Frm_Post_01_Descuentos.Total_Linea_Origen = Total_Linea
	Frm_Post_01_Descuentos.NroDscto = NroDscto
		
	Procesar_Dscto = True
		
	StartActivity(Frm_Post_01_Descuentos)
	
End Sub

Sub Sb_Cargar_Descuentos()'(Cargar_Activity As Boolean)
		   
	Id_DocDet= Fila.Get("id_docdet")
	Dim Id_DocEnc As Int = Fila.Get("id_docenc")
		   
'	If Cargar_Activity Then
'		If Frm_Post_01_Producto.Id_DocDet <> 0 Then
'			StartActivity("Cp_Post_01_Descuentos")
'		End If
'	End If
		
	Dim xui As XUI
	XclvDescuentos.DefaultTextBackgroundColor = Colors.Transparent
	XclvDescuentos.Clear
	Private Row As Int
	Private Cursor1 As Cursor
	
	Private IDList As List
	IDList.Initialize

	Dim RowNumber As Int = 0
	Dim ItemStr As String

	Cursor1 = Variables.vSql.ExecQuery("Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original " & _
									 "From Descuentos_Doc Where Id_DocEnc = " & Id_DocEnc & " And Id_DocDet = " & Id_DocDet)
	
	If Cursor1.RowCount > 0 Then
		
		RowNumber = Cursor1.RowCount
		
		For Row = 0 To RowNumber - 1
			
			Cursor1.Position = Row
			IDList.Add(Cursor1.GetString2(0))
			
			'Dim Id_DocDsc As Int = Cursor1.GetString("Id_DocDsc")
			Dim Kodt As Double = Cursor1.GetString("Kodt")
			Dim Podt As Double = Cursor1.GetString("Podt")
			Dim Vadt As Double = Cursor1.GetString("Vadt")
		
'			Dim Cantidad As String  =  NumberFormat(Cursor1.GetString("Cantidad"),0,2)
'			Dim UdTrans As String = Cursor1.GetString("UdTrans")
'			Dim Precio As String  = "$ " &  NumberFormat(Cursor1.GetString("Precio"),0,2)
'			Dim descuentoporc As String = NumberFormat(Cursor1.GetString("DescuentoPorc"),0,2)
'			Dim valnetolinea As String = "$ " &  NumberFormat(Cursor1.GetString("ValNetoLinea"),0,2)
												
'			If Cursor1.GetString("DescuentoPorc") = 0 Then
'				descuentoporc = ""
'			Else
'				descuentoporc = " -%." & descuentoporc & " "
'			End If
											
			Dim Item As Int = Row+1
			ItemStr = Funciones.Rellenar_Izquierda(Item,2,"0")
													
			'Dim Datos As String = "Cant. " & Cantidad & " " & UdTrans & " X " & Precio & descuentoporc & "Total: " & valnetolinea
			'Dim Datos As String = "Cant. " & UdTrans & " " & Cantidad & " X " & Precio & descuentoporc & CRLF & "Total: " & valnetolinea
			
			Dim p As B4XView = xui.CreatePanel("")
			
			p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsView.Width,150dip)
			p.LoadLayout("Items_Detalle")
			p.Color = Colors.Transparent

			Lbl_Kodt.Tag = Kodt
			Lbl_Kodt.Text = Kodt
			
			Lbl_Podt.Tag = Podt
			Lbl_Podt.Text = Podt
			
			Lbl_Vadt.Tag = Vadt
			Lbl_Vadt.Text = Vadt

			Lbl_Item.Text = "Item: " & ItemStr
					
'			Dim bmp1 As Bitmap
'	
'			bmp1 = LoadBitmap(File.DirAssets, "symbol-delete.png")
'			
'				
'			Img_Eliminar.SetBitmap(bmp1.Resize(40dip, 30dip, True))' (SignatureTemplate.Bitmap.Resize(ImageView1.Width, ImageView1.Height, True))
			
			XclvDescuentos.Add(p,"")
			
		Next
		
	Else
		ToastMessageShow("No items found", False)
	End If
	
	Cursor1.Close
	
	'Sb_Sumar_Totales

End Sub


Sub Fx_Insertar_Dscto_Global_Permiso As ResumableSub
	
	Private Base As B4XView
	Dim xui As XUI
	Private dialog As B4XDialog
	Dim bmp1 As Bitmap
	
	Base = Activity
	dialog.Initialize (Base)
	
	Dim Existe As Boolean
	Dim Otorgado As Boolean
	Dim DescuentoPorc As Int = 0
	
	Dim Clave As String
	
	Private InputTemplate As B4XInputTemplate
	
	InputTemplate.Initialize
	InputTemplate.lblTitle.Text = "Ingrese clave del descuento"
	InputTemplate.Text = ""
	
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Clave = InputTemplate.Text	
	Else
		Return 0
	End If
	
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	If Clave = "" Then
		Msgbox2Async("No se ingreso ninguna clave" , "Validación", "Ok", "", "", bmp1, False)
		Return 0
	End If
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me,Clave,Variables.Global_Row_Usuario_Activo.Get("KOFU"),False)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim FilaDscto As Map = Funciones.Fx_DataRow(Js.GetString)
			
			Existe = FilaDscto.Get("Existe")
			Otorgado = FilaDscto.Get("Otorgado")
			DescuentoPorc = FilaDscto.Get("Descuento")
			
			If Existe Then
				If Otorgado Then
					Msgbox2Async("Este descuento ya fue utilizado" , "Validación", "Ok", "", "", bmp1, False)
					DescuentoPorc = 0
				Else
					If DescuentoPorc <=0 Then
						Msgbox2Async("No se puede incorporar este descuento, ya que no es un valor valido." & CRLF & _
						"Porc.Dscto: " & DescuentoPorc & "%" , "Validación", "Ok", "", "", bmp1, False)
						DescuentoPorc = 0
					Else
						bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
						Msgbox2Async("Descuento aceptado." & CRLF & "Porc.Dscto: " & DescuentoPorc & "%" , "Validación", "Ok", "", "", bmp1, False)
					End If
				End If
			Else
				Msgbox2Async("No se reconoce la clave para el descuento" , "Validación", "Ok", "", "", bmp1, False)
			End If
		End If
		
	Else
		Msgbox2Async("Error de conexión con el servidor" , "Validación", "Ok", "", "", bmp1, False)
	End If
		
	ProgressDialogHide
	Return DescuentoPorc
	
End Sub

Private Sub Btn_Revisar_Stock_Click
	
'	Dim bmp1 As Bitmap
	
	If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then
	
		Wait For (Revisar_StockVillar) Complete (Msj2 As Mensajes)
		If Not(Msj2.EsCorrecto) Then
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async(Msj.Mensaje, Msj.Detalle, "Ok", "", "", bmp1, False)
			Return
		End If
		
	Else
		
		Frm_InfoStockXProd.Codigo = Txt_Codigo.Text
		Frm_InfoStockXProd.Descripcion = Lbl_Descripcion.Text
		StartActivity(Frm_InfoStockXProd)
		
'		Wait For (Cl_VerStockXBod.Revisar_Stock(Txt_Codigo.Text)) Complete (Msj As Mensajes)
'		If Not(Msj.EsCorrecto) Then
'			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
'			Msgbox2Async(Msj.Mensaje, Msj.Detalle, "Ok", "", "", bmp1, False)
'			Return
'		End If		
		
	End If
	
	Return
	
	Private xui As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA," & CRLF & _
				   "EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1" & CRLF & _
                   "From MAEST Ms" & CRLF & _
                   "Where KOPR = '" & Txt_Codigo.Text & "'" & CRLF & _
                   "And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)"
	
	If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then

		Consulta_Sql = "Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '" & Txt_Codigo.Text & "'" & CRLF & _
					   "Union" & CRLF & _
					   "Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '" & Txt_Codigo.Text & "'"
		
	End If
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
										
			Log("Traer Stock x bodega")
			Dim TblStockXbodega As List = Funciones.Fx_DataTable(vJson)

			Private SearchTemplateStock As B4XSearchTemplate
			SearchTemplateStock.Initialize
	
			Dim Items As List
			Items.Initialize
	
			For Each vFilaStb As Map In TblStockXbodega
			
				Dim Stock As String  = NumberFormat(vFilaStb.Get("STFI1"),0,2)
				Dim Bodega As String
				
				If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then
					Bodega = vFilaStb.Get("BODEGA")
				Else
					Bodega = Funciones.Mid(vFilaStb.Get("BODEGA"),1,15)
				End If
				
				Bodega = Funciones.Rellenar_Derecha(Bodega.Trim,20,".")
				
				Dim Name As String = Bodega & " " & Stock
				Items.Add(Name)
				
			Next
	
			SearchTemplateStock.SetItems(Items)

			Base = Activity
			Dialog.Initialize (Base)
			Dialog.Title = "Stock X Bodega"
			
			Wait For (Dialog.ShowTemplate(SearchTemplateStock, "", "", "CERRAR")) Complete (Result As Int)
			If Result = xui.DialogResponse_Positive Then
		
			End If
						
		End If
	
	End If
	
End Sub

Private Sub Revisar_StockVillar As ResumableSub
	
	Private xui As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private Msj As Mensajes
	
	Msj.Initialize
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA," & CRLF & _
				   "EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1" & CRLF & _
                   "From MAEST Ms" & CRLF & _
                   "Where KOPR = '" & Txt_Codigo.Text & "'" & CRLF & _
                   "And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)"
	
	If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then

		Consulta_Sql = "Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '" & Txt_Codigo.Text & "'" & CRLF & _
					   "Union" & CRLF & _
					   "Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '" & Txt_Codigo.Text & "'"
		
	End If
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If	vJson = $"{"Table":[]}"$ Then
		
			Msj.Detalle = "Información"
			Msj.Mensaje = "No existe información"
		
		Else
										
			Log("Traer Stock x bodega")
			Dim TblStockXbodega As List = Funciones.Fx_DataTable(vJson)

			Private SearchTemplateStock As B4XSearchTemplate
			SearchTemplateStock.Initialize
	
			Dim Items As List
			Items.Initialize
	
			For Each vFilaStb As Map In TblStockXbodega
			
				Dim Stock As String  = NumberFormat(vFilaStb.Get("STFI1"),0,2)
				Dim Bodega As String
				
				If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then
					Bodega = vFilaStb.Get("BODEGA")
				Else
					Bodega = Funciones.Mid(vFilaStb.Get("BODEGA"),1,15)
				End If
				
				Bodega = Funciones.Rellenar_Derecha(Bodega.Trim,20,".")
				
				Dim Name As String = Bodega & " " & Stock
				Items.Add(Name)
				
			Next
	
			SearchTemplateStock.SetItems(Items)

			Base = Activity
			Dialog.Initialize (Base)
			Dialog.Title = "Stock X Bodega"
			
			Wait For (Dialog.ShowTemplate(SearchTemplateStock, "", "", "CERRAR")) Complete (Result As Int)
			If Result = xui.DialogResponse_Positive Then
				Msj.EsCorrecto = True
			End If
						
		End If
	
	End If
	
	Return Msj
	
End Sub

Private Sub Revisar_Stock As ResumableSub
	
	Private xui As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private Msj As Mensajes
	
	Msj.Initialize
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Tb.NOKOBO As BODEGA,STFI1" & CRLF & _
                   "From MAEST Ms" & CRLF & _
				   "Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO" & CRLF & _
                   "Where KOPR = '" & Txt_Codigo.Text & "'"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If	vJson = $"{"Table":[]}"$ Then
		
			Msj.Detalle = "Información"
			Msj.Mensaje = "No existe información"
		
		Else
										
			Log("Traer Stock x bodega")
			Dim TblStockXbodega As List = Funciones.Fx_DataTable(vJson)

			Private SearchTemplateStock As B4XSearchTemplate
			SearchTemplateStock.Initialize
	
			Dim Items As List
			Items.Initialize
	
			For Each vFilaStb As Map In TblStockXbodega
			
				Dim Stock As String  = NumberFormat(vFilaStb.Get("STFI1"),0,2)
				Dim Bodega As String
				
				'If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK Then
				Bodega = vFilaStb.Get("BODEGA")
				'Else
				'	Bodega = Funciones.Mid(vFilaStb.Get("BODEGA"),1,15)
				'End If
				
				Bodega = Funciones.Rellenar_Derecha(Bodega.Trim,20,".")
				
				Dim Name As String = Bodega & " " & Stock
				Items.Add(vFilaStb)
				
			Next
	
			SearchTemplateStock.SetItems(Items)

			Base = Activity
			Dialog.Initialize (Base)
			Dialog.Title = "Stock X Bodega"
			
			Wait For (Dialog.ShowTemplate(SearchTemplateStock, "", "", "CERRAR")) Complete (Result As Int)
			If Result = xui.DialogResponse_Positive Then
				Msj.EsCorrecto = True
				Msj.Resultado = SearchTemplateStock.SelectedItem
			Else
				Msj.EsCorrecto = True
				Msj.Resultado = ""
			End If
						
		End If
	
	End If
	
	Return Msj
	
End Sub

Private Sub Btn_Ubicacion_Click
	
	
	Private xui As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Pubc.Empresa,Pubc.Sucursal,Pubc.Bodega,Pubc.Id_Mapa,Pubc.Codigo_Sector," & CRLF & _
                   "Pubc.Codigo_Ubic," & CRLF & _
                   "Isnull((Select NOKOBO From TABBO Where" & CRLF & _
                   "EMPRESA = Pubc.Empresa And KOSU = Pubc.Sucursal And KOBO = Pubc.Bodega),'') As NOKOBO," & CRLF & _
                   "Pubc.Codigo,U_mapa.Nombre_Mapa,U_sector.Nombre_Sector," & CRLF & _
                   "Isnull(U_bodega.Descripcion_Ubic,'') As Descripcion_Ubic" & CRLF & _
                   "From" & CRLF & _
                   Variables.Global_BaseBk & "Zw_Prod_Ubicacion As Pubc LEFT OUTER JOIN" & CRLF & _
                   Variables.Global_BaseBk & "Zw_WMS_Ubicaciones_Bodega As U_bodega ON Pubc.Id_Mapa = U_bodega.Id_Mapa And Pubc.Codigo_Ubic = U_bodega.Codigo_Ubic LEFT OUTER JOIN" & CRLF & _
                   Variables.Global_BaseBk & "Zw_WMS_Ubicaciones_Mapa_Det As U_sector ON Pubc.Codigo_Sector = U_sector.Codigo_Sector And Pubc.Id_Mapa = U_sector.Id_Mapa LEFT OUTER JOIN" & CRLF & _
                   Variables.Global_BaseBk & "Zw_WMS_Ubicaciones_Mapa_Enc As U_mapa ON Pubc.Id_Mapa = U_mapa.Id_Mapa" & CRLF & _
                   "Where Pubc.Codigo = '" & Txt_Codigo.Text & "'"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson = $"{"Table":[]}"$ Then
			
			'Dim bmp1 As Bitmap
			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
			Msgbox2Async("No tiene otras ubicaciones registradas en el sistema" , "Validación", "Ok", "", "", bmp1, False)
			
		Else
										
			Log("Traer Ubicación x bodega")
			Dim TblUbicXbodega As List = Funciones.Fx_DataTable(vJson)

			Private SearchTemplateStock As B4XSearchTemplate
			SearchTemplateStock.Initialize
	
			Dim Items As List
			Items.Initialize
	
			For Each vFilaUb As Map In TblUbicXbodega
			
				Dim Codigo_Ubic As String  = vFilaUb.Get("Codigo_Ubic")
				Dim Bodega As String = vFilaUb.Get("Bodega")
				Dim Nokobo As String = Funciones.Mid(vFilaUb.Get("NOKOBO"),1,15)
				
				Nokobo = Funciones.Rellenar_Derecha(Nokobo.Trim,20,".")
				
				Dim Name As String = Bodega & " " & Codigo_Ubic
				Items.Add(Name)
				
			Next
	
			SearchTemplateStock.SetItems(Items)

			Base = Activity
			Dialog.Initialize(Base)
			Dialog.Title = "Ubicación X Bodega"
			
			Wait For (Dialog.ShowTemplate(SearchTemplateStock, "", "", "CERRAR")) Complete (Result As Int)
			If Result = xui.DialogResponse_Positive Then
		
			End If
						
		End If
	
	End If

	
End Sub

Private Sub Btn_Editar_Precio_Click
	
	Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario("Bkp00006")) Complete (Rst As Boolean)
			
	If Not(Rst) Then
		Return
	End If
	
	Private Base As B4XView
	Dim xui As XUI
	Private dialog As B4XDialog
	'Dim bmp1 As Bitmap
	
	Base = Activity
	dialog.Initialize (Base)

	Private InputTemplate As B4XInputTemplate
	
	InputTemplate.Initialize
	InputTemplate.lblTitle.Text = "Ingrese clave del descuento"
	InputTemplate.ConfigureForNumbers(False,False)
	InputTemplate.Text = Funciones.CDouble(Lbl_Precio.Tag)
	
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		
		Lbl_Precio.Tag = InputTemplate.Text
		Lbl_Precio.Text = "$ " & NumberFormat(Lbl_Precio.Tag,0,2)
		Txt_Cantidad.Tag = 0
		Txt_Cantidad.Text = ""
	
		Wait For (Sb_Procesar_Datos("Cantidad")) Complete (Result2 As Boolean)
		
	End If
	
End Sub