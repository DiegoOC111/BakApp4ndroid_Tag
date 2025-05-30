B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	
	Private Consulta_Sql As String
	
	Public Idmaeedo As Int
	Public Id_DocEnc As Int
	Public Row_Entidad As Map
	Public Fila_Encabezado As Map
	Public Fila_Observaciones As Map
	Public Fila_DespaFacil As Map
	
	Public Cambiar_Entidad As Boolean
	Public Crear_NVV_Desde_COV As Boolean
	Public Usar_Precio_Original As Boolean
	
	Private Fila_IdEnc As Map
	Public ChkValores As Boolean
	
	Dim FUNCIONARIO As String '= Variables.Global_Row_Usuario_Activo.Get("KOFU")
	
	Dim TotalNetoDoc As Double
	Dim TotalBrutoDoc As Double
	
	Dim bmp1, bmp2 As Bitmap
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	'ChkValores = True
	FUNCIONARIO = Variables.Global_Row_Usuario_Activo.Get("KOFU")
End Sub

Sub Sb_Nuevo_Documento As ResumableSub

	Dim	B4A_DespachoSimple As Boolean = Variables.Global_Row_Configuracion_Estacion.Get("B4A_DespachoSimple")

	Consulta_Sql = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(1))
	
	Consulta_Sql = "DELETE FROM [Detalle_Doc] WHERE [id_docenc] = ?"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
	
	Consulta_Sql = "DELETE FROM [Descuentos_Doc] WHERE id_docenc = ?"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
	
	Consulta_Sql = "DELETE FROM [Impuestos_Doc] WHERE id_docenc = ?"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))
	
	Consulta_Sql = "DELETE FROM [Observaciones_Doc] WHERE id_docenc = ?"
	Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(0))

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
	
	If B4A_DespachoSimple Then
	
		'Insertamos una fila en despacho facil
		Consulta_Sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)"
		Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As String (Id_DocEnc))
	
		'Cargamos el despacho facil en la variable
		Consulta_Sql = "Select * From DespaFacil_Doc Where Id_DocEnc = " & Id_DocEnc
		Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	End If
	
	Log("Documento cargado... Id_DocEnc = " & Id_DocEnc)

	' Las fechas se deben trabajar en formato Long y transformarlas en formato fecha
	Dim FechaEmision As Long = DateTime.Now
	Dim Fecha_1er_Vencimiento As Long = FechaEmision
	Dim FechaUltVencimiento As Long = FechaEmision
	Dim FechaRecepcion As Long = FechaEmision

	DateTime.DateFormat = "dd-MM-yyyy"

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
	
	Centro_Costo = "LUVTVEN"
	Centro_Costo = Variables.Global_Row_Configuracion_Estacion.Get(Centro_Costo)
	
	ListaPrecios = Variables.Gl_Lista_Precios
	
	Fila_Encabezado.Put("TipoDoc".ToLowerCase,"NVV")
	Fila_Encabezado.Put("NroDocumento".ToLowerCase,NewNroDocumento)
	
	Fila_Encabezado.Put("FechaEmision".ToLowerCase,FechaEmision)
	Fila_Encabezado.Put("Fecha_1er_Vencimiento".ToLowerCase,Fecha_1er_Vencimiento)
	Fila_Encabezado.Put("FechaUltVencimiento".ToLowerCase,FechaUltVencimiento)
	Fila_Encabezado.Put("FechaRecepcion".ToLowerCase,FechaRecepcion)
	
	Fila_Encabezado.Put("Cuotas".ToLowerCase,Cuotas)
	Fila_Encabezado.Put("Dias_1er_Vencimiento".ToLowerCase,Dias_1er_Vencimiento)
	Fila_Encabezado.Put("Dias_Vencimiento".ToLowerCase,Dias_Vencimiento)

	If Not(Row_Entidad.IsInitialized) Then
		Row_Entidad = Variables.Global_Row_Entidad_X_Defecto
	End If

	Dim CodEntidad As String = Row_Entidad.Get("KOEN")
	Dim CodSucEntidad As String = Row_Entidad.Get("SUEN")
	Dim Nombre_Entidad As String = Row_Entidad.Get("NOKOEN")

	Fila_Encabezado.Put("CodEntidad".ToLowerCase,CodEntidad)
	Fila_Encabezado.Put("CodSucEntidad".ToLowerCase,CodSucEntidad)
	Fila_Encabezado.Put("Nombre_Entidad".ToLowerCase,Nombre_Entidad)
	
	Fila_Encabezado.Put("ListaPrecios".ToLowerCase,ListaPrecios)
	Fila_Encabezado.Put("CodFuncionario".ToLowerCase,Variables.Global_Row_Usuario_Activo.Get("KOFU"))
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

	Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,False,False)

	If Idmaeedo <> 0 Then
		
		ProgressDialogShow("Buscando productos...")
		
		Wait For(Sb_Traer_Encabezado) Complete (FEnc As Map)
		
		If FEnc.IsInitialized Then
			
			Fila_Encabezado.Put("empresa",FEnc.Get("EMPRESA"))
			Fila_Encabezado.Put("sucursal",FEnc.Get("SUDO"))
			DBUtils.UpdateRecord2(Variables.vSql,"Encabezado_Doc",Fila_Encabezado,Fila_IdEnc)
			
			Variables.Gl_Empresa = FEnc.Get("EMPRESA")
			Variables.Gl_Sucursal = FEnc.Get("SUDO")
						
		End If
		
		Wait For(Sb_Incorporar_Productos) Complete (Result As Boolean)
		
		Wait For(Sb_Traer_Observaciones) Complete (Flobs As Map)
	
		If Flobs.IsInitialized Then
			Fila_Observaciones.Put("observaciones",Flobs.Get("OBDO"))
			Fila_Observaciones.Put("orden_compra",Flobs.Get("OCDO"))
			DBUtils.UpdateRecord2(Variables.vSql,"Observaciones_Doc",Fila_Observaciones,Fila_IdEnc)
		End If
		
		
		If B4A_DespachoSimple Then
		
			Wait For(Sb_Traer_Despacho_Simple) Complete (Fldesp As Map)
	
			If Fldesp.IsInitialized Then
				
				Fila_DespaFacil.Put("CodTipoDespacho".ToLowerCase,Fldesp.Get("CodTipoDespacho"))
				Fila_DespaFacil.Put("TipoDespacho".ToLowerCase,Fldesp.Get("TipoDespacho"))
	
				Fila_DespaFacil.Put("CodTipoPagoDesp".ToLowerCase,Fldesp.Get("CodTipoPagoDesp"))
				Fila_DespaFacil.Put("TipoPagoDesp".ToLowerCase,Fldesp.Get("TipoPagoDesp"))
	
				Fila_DespaFacil.Put("CodDocDestino".ToLowerCase,Fldesp.Get("CodDocDestino"))
				Fila_DespaFacil.Put("DocDestino".ToLowerCase,Fldesp.Get("DocDestino"))
	
				Fila_DespaFacil.Put("TransporteDesp".ToLowerCase,Fldesp.Get("TransporteDesp"))
				Fila_DespaFacil.Put("DireccionDesp".ToLowerCase,Fldesp.Get("DireccionDesp"))
				Fila_DespaFacil.Put("ObservacionesDesp".ToLowerCase,Fldesp.Get("ObservacionesDesp"))
				
				DBUtils.UpdateRecord2(Variables.vSql,"DespaFacil_Doc",Fila_DespaFacil,Fila_IdEnc)
				
			End If
		
		End If
		
		ProgressDialogHide
	End If

	Return Id_DocEnc

End Sub

Sub Sb_Actualizar_Datos_De_La_Entidad(RowEntidad As Map, _
                                      Revisar_Permiso_Lista_Precio As Boolean, _
                                      Aplicar_Venciminetos As Boolean)

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
	Dias_Vencimiento = RowEntidad.Get("DIASVENCI")

	Dim Rut As String

	Fila_Encabezado.Put("CodEntidad".ToLowerCase,RowEntidad.Get("KOEN"))
	Fila_Encabezado.Put("CodSucEntidad".ToLowerCase,RowEntidad.Get("SUEN"))
	Fila_Encabezado.Put("Nombre_Entidad".ToLowerCase,RowEntidad.Get("NOKOEN"))
				
'	Lbl_CodEntidad.Text = RowEntidad.Get("KOEN")
'	Lbl_Rut.Text = RowEntidad.Get("Rut")
'	Lbl_Nombre.Text = RowEntidad.Get("NOKOEN")
'	Lbl_Direccion.Text = RowEntidad.Get("DIEN")
'	Lbl_Ciudad.Text = RowEntidad.Get("CIUDAD")
'	Lbl_Comuna.Text = RowEntidad.Get("COMUNA")

	Lista = RowEntidad.Get("LVEN")
	Lista = Funciones.Mid(Lista, 6, 3)
		
	Permiso = "Lp-" & Lista
	'Else
	'_Permiso = "Lc-" & _Lista
	'End If

	If Cuotas = 0 Then Cuotas = 1

	Dim Cuotas_F(Cuotas - 1) As Long

	If Not(Aplicar_Venciminetos) Then
		Dias_1er_Vencimiento = 0
	End If

	If Dias_1er_Vencimiento > 0 Then

		'If MessageBox.Show("¿Asigna los vencimientos prefijados a la entidad?" & vbCrLf & vbCrLf & _
		'                  "Número máximo de vencimientos: " & _Cuotas & vbCrLf & _
		'                  "Días al primer vencimiento: " & _Dias_1er_Vencimiento, "Cuenta corriente", _
		'                  MessageBoxButtons.YesNo, MessageBoxIcon.Question, MessageBoxDefaultButton.Button1) = System.Windows.Forms.DialogResult.Yes Then

		Fila_Encabezado.Put("Dias_1er_Vencimiento".ToLowerCase,Dias_1er_Vencimiento)
		Fila_Encabezado.Put("Dias_Vencimiento".ToLowerCase,Dias_Vencimiento)

		'If _Tipo_Documento = Enum_Tipo_Documento.Venta Or _Tipo_Documento = Enum_Tipo_Documento.Compra Then
		'If TienePermiso("Bkp00034") Then
		'Sb_Revisar_CtaCte()

		Dim FechasVenci As Long = FechaEmision
		Dim dias As Int

		If Dias_1er_Vencimiento > 0 Then
			dias = Dias_1er_Vencimiento
			For i = 1 To Cuotas
				'_FechasVenci = DateAdd(DateInterval.Day, _dias, _FechasVenci)
				
				FechasVenci = DateTime.Add(FechasVenci, 0, 0, dias)
				
				Cuotas_F(i - 1) = FechasVenci
				dias = Dias_Vencimiento
			Next
			FechaUltVencimiento = FechasVenci
		Else
			Cuotas = 1
		End If

		Fecha_1er_Vencimiento = Cuotas_F(0)
		
		'End If

		' End If

		'Else

		'   _Fecha_1er_Vencimiento = _FechaEmision
		'   _FechaUltVencimiento = _FechaEmision
		'   _Cuotas = 0
		'   _Dias_1er_Vencimiento = 0
		'   _Dias_Vencimiento = 0

		'End If
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

		Dim Tiene_Permiso_Lista As Boolean '= TienePermiso(_Permiso, , False) 'TienePermiso(_Permiso, , True, , "TRABAJAR CON LISTA " & _Permiso)
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
							   
			Dim bmp1 As Bitmap
	
			bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
			Msgbox2Async("Usted no tiene permiso para trabajar con la lista"  & CRLF & _
						 "La lista seguirá siendo:" & ListaPrecios , "Validación", "Ok", "", "", bmp1, False)
			'Wait For Msgbox_Result (Result As Int)
	
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
			'Lbl_Lista_Precios.Text = Nokolt
			Exit
		End If
					
	Next
	
	'Sb_Emision_Vencimientos()

	Dim Bloqueado As Boolean = RowEntidad.Get("BLOQUEADO")

	If Bloqueado Then

		Dim bmp1 As Bitmap
	
		bmp1 = LoadBitmap(File.DirAssets, "user.png")
										
		Msgbox2Async("¡CLIENTE BLOQUEADO!"  & CRLF & _
						 "LSolo es posible generar cotizaciones", "CLIENTE MOROSO", "Ok", "", "", bmp1, False)
								
	End If
	
End Sub

Sub Sb_Procesar_Datos(Cabeza As String, Fila As Map)
	
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

	Dim Precio As Double = Fila.Get("precio")

	Dim PrecioNeto As Double
	Dim PrecioBruto As Double

	Dim PrecioNetoRealUd1 As Double
	Dim PrecioNetoRealUd2 As Double

	Dim Total As Double

	Dim Decimal = 2
	
	Dim Cantidad As Double = Fila.Get("cantidad")
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

	'TecladoSoft.HideKeyboard
		
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
		'	Txt_Cantidad.Tag = 0
		'	Txt_Cantidad.Text = ""
'		Txt_Cantidad.SelectAll'
		'TecladoSoft.ShowKeyboard(Txt_Cantidad)
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


	If Descontar Then

		PrecioNetoRealUd1 = 0
		PrecioNetoRealUd2 = 0

		If Prct = 0 Then

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

		End If

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
	TotalBruto = Round2(TotalBruto, Decimal)

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
	
	'Lbl_Descuento.Text = NumberFormat(DescuentoPorc,0,2)  & " %"
	
	
	Dim TipoValor As String
	
	If ChkValores Then
		'Lbl_Total.Text = "$ " & NumberFormat(TotalNeto,0,2)
		TipoValor = "N"
	Else
		'Lbl_Total.Text = "$ " & NumberFormat(TotalBruto,0,0)
		TipoValor = "B"
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
		
End Sub

Sub Sb_Traer_Entidad(Koen As String,Suen As String) As ResumableSub
	
	Dim Fila As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me,Koen,Suen)
	
	Fila = Null
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Fila =Filas.Get(0)
				
			Row_Entidad = Fila
						
		End If
			
	Else
		Log(Js.ErrorMessage)
	End If
	
	Return Fila
	
End Sub

Sub Sb_Incorporar_Productos() As ResumableSub
	
	Dim CampoPrecio As String
	
	Consulta_Sql = "Select * From MAEDDO Where IDMAEEDO = " & Idmaeedo & " Order By IDMAEDDO"
	
	ChkValores = True

	If ChkValores Then
		CampoPrecio = "PPPRNE"
	Else ' Bruto
		CampoPrecio = "PPPRBR"
	End If
	
	' Debo crear un metodo para traer los productos desde el Web Service con los precios actuales en caso de que el documento este vencido
	' ********
	' Traer el producto con los valores actuales con esta funcion en un MAP ' Fx_HttJob_Ws_Sb_Traer_Productos_Json
	
	Consulta_Sql = "Select MAEDDO.*,Case WHEN UDTRPR = 1 Then CAPRCO1-CAPREX1 Else CAPRCO2-CAPREX2 END AS 'Cantidad'," & CRLF & _
                   "CAPRCO1-CAPREX1 As 'CantUd1_Dori',CAPRCO2-CAPREX2 AS 'CantUd2_Dori'," & CRLF & _
				   "Case WHEN UDTRPR = 1 Then " & CampoPrecio & " Else " & CampoPrecio & "*RLUDPR END AS 'Precio'" & CRLF & _
				   "From MAEDDO WITH ( NOLOCK )" & CRLF & _
				   "Where IDMAEEDO = " & Idmaeedo & " And ( ESLIDO<>'C' OR ESFALI='I')" & CRLF & _
                   "Order by IDMAEDDO"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim Lista As List = Funciones.Fx_DataTable(Js.GetString)
			
			For Each Fila As Map In Lista
			
				Dim Codigo As String = Fila.Get("KOPRCT")
				Dim Descripcion As String = Fila.Get("NOKOPR")
				Dim Prct As Boolean = Fila.Get("PRCT")
				Dim Tict As String = Fila.Get("TICT")
				Dim Nulido As String = Fila.Get("NULIDO")
				Dim Podtglli As Double = Fila.Get("PODTGLLI")
				Dim Rludpr As Double = Fila.Get("RLUDPR")
				Dim Udtpr As Int = Fila.Get("UDTRPR")
				Dim Cantidad As Double = Fila.Get("Cantidad")
				Dim Vaneli As Double = Fila.Get("VANELI")
				Dim Vabrdo As Double = Fila.Get("VABRLI")
				
				Dim CodFuncionario As String = Fila.Get("KOFULIDO")
				Dim Codlista As String = Fila.Get("KOLTPR")
				Codlista = Codlista.Replace("TABPP","")
				Dim Moneda As String = Fila.Get("MOPPPR")
				Dim Tipo_moneda As String = Fila.Get("TIMOPPPR")
				Dim Tipo_cambio As Double = Fila.Get("TAMOPPPR")
				
				Dim Idmaeedo_Dori As Int = Fila.Get("IDMAEEDO")
				Dim Idmaeddo_Dori As Int = Fila.Get("IDMAEDDO")
				
				Dim Empresa As String = Fila.Get("EMPRESA")
				Dim Sucursal As String = Fila.Get("SULIDO")
				Dim Bodega As String = Fila.Get("BOSULIDO")
				
				Variables.Gl_Bodega = Bodega
				
				Dim Emprepa As String = Fila.Get("EMPRESA")
				Dim Tidopa As String = Fila.Get("TIDO")
				Dim Nudopa As String = Fila.Get("NUDO")
				Dim Endopa As String = Fila.Get("ENDO")
				Dim Nulidopa As String = Fila.Get("NULIDO")
				
				Dim CantUd1_Dori As Double = Fila.Get("CantUd1_Dori")
				Dim CantUd2_Dori As Double = Fila.Get("CantUd2_Dori")
				
				Dim Precio As Double = Fila.Get("Precio")
								
				If Usar_Precio_Original And Not(Prct) Then
					Wait For(Sb_Traer_Producto2(Codigo,Empresa,Sucursal,Bodega)) complete (RowProducto As Map)
					Precio = RowProducto.Get("Precio")
				End If
				
				If Crear_NVV_Desde_COV = False Then
					
					Idmaeedo_Dori = 0
					Idmaeddo_Dori = 0
					Emprepa = ""
					Tidopa = ""
					Nudopa = ""
					Endopa = ""
					Nulidopa = ""
					
				End If

				If Udtpr = 2 Then
					Precio = Precio*Rludpr
				End If
				
				ProgressDialogShow(Codigo & "-" & Descripcion)
				
				DateTime.DateFormat = "dd-MM-yyyy"

				' Las fechas se deben trabajar en formato Long y transformarlas en formato fecha
				Dim FechaEmision As Long = DateTime.Now
				
				If Prct And Usar_Precio_Original Then
					
					If Tict = "D" Then
						
						Wait For(Sb_Traer_Concepto(Codigo,Empresa,Sucursal,Bodega,Podtglli)) Complete (Id_DocDet As Int)
					
						Consulta_Sql = "Select * From Detalle_Doc Where Id_DocDet = " & Id_DocDet
						Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
						
						Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
						Dim Fila_Id As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
						
						New_Row.Put("Idmaeedo_Dori",Idmaeedo_Dori)
						New_Row.Put("Idmaeddo_Dori",Idmaeddo_Dori)
						New_Row.Put("Emprepa",Emprepa)
						New_Row.Put("Tidopa",Tidopa)
						New_Row.Put("Nudopa",Nudopa)
						New_Row.Put("Endopa",Endopa)
						New_Row.Put("Nulidopa",Nulidopa)
						New_Row.Put("CantUd1_Dori",CantUd1_Dori)
						New_Row.Put("CantUd2_Dori",CantUd2_Dori)
						
						New_Row.Put("codfuncionario",CodFuncionario)
						New_Row.Put("codvendedor",CodFuncionario)
						New_Row.Put("codlista",Codlista)
				
						New_Row.Put("moneda",Moneda)
						New_Row.Put("tipo_moneda",Tipo_moneda)
						New_Row.Put("tipo_cambio",Tipo_cambio)
						
						New_Row.Put("fechaemision",FechaEmision)
						New_Row.Put("fecharecepcion",FechaEmision)
						 
						New_Row.Put("empresa",Empresa)
						New_Row.Put("sucursal",Sucursal)
						New_Row.Put("bodega",Bodega)
						
						Sb_Procesar_Datos("DescuentoPorc",New_Row)
					
						DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",New_Row,Fila_Id)
					
						If Id_DocDet <> 0 Then
							Log(Codigo & "-" & Descripcion)
						End If
						
					End If
										
				End If
				
				If Not(Prct) Then
					
					TotalNetoDoc = TotalNetoDoc + Vaneli
					TotalBrutoDoc = TotalBrutoDoc + Vabrdo

					Wait For(Sb_Traer_Producto(Codigo,Empresa,Sucursal,Bodega)) Complete (Id_DocDet As Int)
					
					If Id_DocDet <> 0 Then
						
						Consulta_Sql = "Select * From Detalle_Doc Where Id_DocDet = " & Id_DocDet
						Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
				
						Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
						Dim Fila_Id As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
			
						New_Row.Put("idmaeedo_dori",Idmaeedo_Dori)
						New_Row.Put("idmaeddo_dori",Idmaeddo_Dori)
						New_Row.Put("emprepa",Emprepa)
						New_Row.Put("tidopa",Tidopa)
						New_Row.Put("nudopa",Nudopa)
						New_Row.Put("endopa",Endopa)
						New_Row.Put("nulidopa",Nulidopa)
						
						New_Row.Put("cantUd1_dori",CantUd1_Dori)
						New_Row.Put("cantUd2_dori",CantUd2_Dori)
			
						New_Row.Put("cantidad",Cantidad)
						New_Row.Put("precio",Precio)
						
						New_Row.Put("codfuncionario",CodFuncionario)
						New_Row.Put("codvendedor",CodFuncionario)
						New_Row.Put("codlista",Codlista)
				
						New_Row.Put("moneda",Moneda)
						New_Row.Put("tipo_moneda",Tipo_moneda)
						New_Row.Put("tipo_cambio",Tipo_cambio)
						
						New_Row.Put("fechaemision",FechaEmision)
						New_Row.Put("fecharecepcion",FechaEmision)
						
						New_Row.Put("empresa",Empresa)
						New_Row.Put("sucursal",Sucursal)
						New_Row.Put("bodega",Bodega)
						
						Sb_Procesar_Datos("Cantidad",New_Row)
						
						Wait For(Sb_Traer_Descuentos(Nulido)) Complete (TblDescuentos As List)
						
						Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = " & Id_DocDet
						Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
						
						If TblDescuentos <> Null Then
							Sb_Insertar_Descuentos_En_Escala(New_Row,Fila_Dscto,TblDescuentos,Precio)
						End If
										
						DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",New_Row,Fila_Id)
						
						Log(Codigo & "-" & Descripcion)
										
					End If
					
				End If
				
			Next

		End If
	
	End If
	
	Return True
	
End Sub

Sub Sb_Traer_Producto2(Codigo As String,Empresa As String,Sucursal As String,Bodega As String) As ResumableSub
	
'	Dim Empresa As String = Variables.Gl_Empresa
'	Dim Sucursal As String = Variables.Gl_Sucursal
'	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String =  Fila_Encabezado.Get("ListaPrecios".ToLowerCase)

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me,Codigo,Empresa,Sucursal,Bodega,Lista,1,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim RFila As Map = Filas.Get(0)
			
			Dim ErrorStr As String =RFila.Get("Error")
				
			If ErrorStr = Null Then
				Return Null
			End If
			
		End If
						
	Else
		Return Null
	End If
		
	Return RFila
	
End Sub

Sub Sb_Traer_Producto(Codigo As String,Empresa As String,Sucursal As String,Bodega As String) As ResumableSub
	
'	Dim Empresa As String = Variables.Gl_Empresa
'	Dim Sucursal As String = Variables.Gl_Sucursal
'	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String =  Fila_Encabezado.Get("ListaPrecios".ToLowerCase)' Variables.Gl_Lista_Precios

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me,Codigo,Empresa,Sucursal,Bodega,Lista,1,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim Fila As Map = Filas.Get(0)
			
			Dim ErrorStr As String =Fila.Get("Error")
				
			If ErrorStr = Null Then
				'bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
				'Msgbox2Async(ErrorStr,"Problema al traer el producto", "Ok","","", bmp1, True)
				'ProgressDialogHide
			End If
				
			Fila.Put("Id_DocEnc",Id_DocEnc)

			Fila.Put("moneda",Variables.Global_Row_Moneda.Get("KOMO"))
			Fila.Put("tipo_moneda",Variables.Global_Row_Moneda.Get("TIMO"))
			Fila.Put("tipo_cambio",Variables.Global_Row_Moneda.Get("VAMO"))
							
			DBUtils.InsertMaps(Variables.vSql,"Detalle_Doc",Filas)
			
			Consulta_Sql = "Select * From Detalle_Doc Where Id_DocEnc = " & Id_DocEnc & " Order by Id_DocDet Desc"
			Dim New_Row As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
'				
			Dim Id_DocDet As Int = New_Row.Get("id_docdet")
'				
'			Consulta_Sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = " & Id_DocDet
'			Dim Fila_Id As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
'			
'			
'			Sb_Procesar_Datos("Cantidad",Fila_Id)
'				
'			DBUtils.UpdateRecord2(Variables.vSql,"Detalle_Doc",New_Row,Fila_Id)
			 		
			Return Id_DocDet'Fila_Id
			
'			Frm_Post_01_Producto.Id_DocDet = New_Row.Get("id_docdet")
'			StartActivity(Frm_Post_01_Producto)					
			
		End If
						
	Else
'		Log(Js.ErrorMessage)
'		ToastMessageShow("PRODUCTO NO ENCONTRADO", False)
'		Txt_Codigo.Text = ""
'		StartActivity(Buscar_productos)
	End If
		
	'ProgressDialogHide
	Return 0
	
End Sub

Sub Sb_Traer_Concepto(Concepto As String,Empresa As String,Sucursal As String,Bodega As String,DescuentoPorc As Double) As ResumableSub
	
	'Dim Concepto As String = "DESCUENTO"
'	Dim Empresa As String = Variables.Gl_Empresa
'	Dim Sucursal As String = Variables.Gl_Sucursal
'	Dim Bodega As String = Variables.Gl_Bodega
	Dim Lista As String = Variables.Gl_Lista_Precios

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me,Concepto,Empresa,Sucursal,Bodega,Lista,"")
		
	Wait For (Js) JobDone(Js As HttpJob)
	'ProgressDialogShow("Buscando concepto...")
	
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
				
			Return Id_DocDet2
		
		End If
						
	Else
		Log(Js.ErrorMessage)
		ToastMessageShow("CONCEPTO NO ENCONTRADO", False)
	End If
	
	Return 0
	
End Sub

Sub Sb_Traer_Descuentos(Nulido As String) As ResumableSub	
	
	Consulta_Sql = "Select *,KODT As 'Kodt',PODT As 'Dscto',VADT As 'Valor' From MAEDTLI Where IDMAEEDO = " & Idmaeedo & " And NULIDO = '" & Nulido & "' Order By IDMAEDTLI"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
	
'			Dim Kodt As String = "D_SIN_TIPO"'FilaDscto.Get("Kodt")
'			Dim Podt As Double = FilaDscto.Get("Dscto")
'			Dim Vadt As Double = FilaDscto.Get("Valor")
			
			Dim Lista As List = Funciones.Fx_DataTable(Js.GetString)
	
			Return Lista
	
		End If
	
	End If
	
	Return Null
		
End Sub

Sub Sb_Insertar_Descuentos_En_Escala(Fila As Map,Fila_Dscto As Map,TblDescuentos As List,Precio As Double)

	Dim Id_DocDet As Int = Fila.Get("id_docdet")
	Dim Id_DocEnc As Int = Fila.Get("id_docenc")

	Dim NroDscto As Int = 0
	'Dim Precio As Double '= Lbl_Precio.Tag

'	If ChkValores.Checked Then
'		_Precio = _Fila.Cells("ValNetoLinea").Value
'	Else
'		_Precio = _Fila.Cells("ValBrutoLinea").Value
'	End If

	Dim Valor As Double = Fila.Get("valnetolinea")
	'Dim Redondear_Dscto As Boolean' = Chk_Redondear_Cero.Checked
	Dim Total_Descuento As Double
	Dim Total_Pc As Double

	'Eliminar_Campos(_Ds_Matriz_Documentos.Tables("Descuentos_Doc"), _Id)
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

	Sb_Procesar_Datos("DescuentoValor",Fila)

End Sub

Sub Sb_Traer_Encabezado() As ResumableSub
	
	Consulta_Sql = "Select * From MAEEDO Where IDMAEEDO = " & Idmaeedo
	
	Dim Fila As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	
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

Sub Sb_Traer_Observaciones() As ResumableSub
	
	Consulta_Sql = "Select * From MAEEDOOB Where IDMAEEDO = " & Idmaeedo
	
	Dim Fila As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	
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

Sub Sb_Traer_Despacho_Simple() As ResumableSub
	
	Consulta_Sql = "Select * From " & Variables.Global_BaseBk & "Zw_Despacho_Simple Where Idmaeedo = " & Idmaeedo
	
	Dim Fila As Map
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	
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
