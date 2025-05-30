B4A=true
Group=Default Group\Tomar pedido
ModulesStructureVersion=1
Type=Activity
Version=10.9
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public Id_DocEnc As Int
	Public Id_DocDet As Int
	'Public Acepta_Dscto_Marca As Boolean
	'Public Dscto_Marca As Int' = 10
	Public Total_Linea_Origen As Double
	Public Total_Descuento As Double
	Public Total_Pc As Double 
	Public NroDscto As Int
	Public Dscto_Max As Int
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim Consulta_Sql As String
	Dim bmp1 As Bitmap
	
	Dim xui As XUI

	Private XclvDescuentos As CustomListView
	Private Btn_Agregar_Descuento As Button
	Private Lbl_Total_Dscto_Porc As Label
	Private Lbl_Total_Dscto_Valor As Label
	Private Lbl_Total_Linea As Label
	Private Btn_Volver As Button
	Private Lbl_Id_DocDsc As B4XView
	Private Lbl_Kodt As B4XView
	Private Lbl_Item As B4XView
	Private Lbl_Podt As B4XView
	Private Lbl_Vadt As B4XView
	
	'Dim FUNCIONARIO As String 
	
	Dim Fila As Map
	Dim Dsctos As List
	Dim	SubTotal_Linea As Double
	Dim NroDscto_Max As Int
	Dim bmp1 As Bitmap
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:

	'FUNCIONARIO = Variables.Global_Row_Usuario_Activo.Get("KOFU")

	Consulta_Sql = "Select * From Detalle_Doc Where Id_DocDet = " & Id_DocDet
	Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
	
	Activity.LoadLayout("Cp_Post_01_Descuentos")
	
	Dim Codigo As String =Fila.Get("codigo")
	Dim Descripcion As String =Fila.Get("descripcion")
	
	Activity.Title = Codigo.Trim & "-" & Descripcion.Trim
	
'	Dim ValNetoLinea As Double = Fila.Get("valnetolinea")
'	Dim DescuentoValor As Double = Fila.Get("descuentovalor")
	
	'Precio = ValNetoLinea+DescuentoValor
	
	If Dscto_Max > 0 Then
		NroDscto_Max = NroDscto+1
	End If
	
	Sb_Cargar_Descuentos
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Sb_Cargar_Descuentos()
		   
	Dim xui As XUI
	XclvDescuentos.DefaultTextBackgroundColor = Colors.Transparent
	XclvDescuentos.Clear
	Private Row As Int
	Private Cursor1 As Cursor
	
	Dsctos.Initialize

'	Dim RowNumber As Int = 0
	Dim ItemStr As String

	Consulta_Sql ="Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original From Descuentos_Doc Where Id_DocEnc = " & Id_DocEnc & " And Id_DocDet = " & Id_DocDet
	Cursor1 = Variables.vSql.ExecQuery(Consulta_Sql)
	
	If Cursor1.RowCount > 0 Then
		
		NroDscto = Cursor1.RowCount
		
		For Row = 0 To NroDscto - 1
			
			Cursor1.Position = Row
			Dsctos.Add(Cursor1.GetString2(0))
			
			Dim Id_DocDsc As Int = Cursor1.GetString("Id_DocDsc")
					
			Dim Item As Int = Row+1
			ItemStr = Funciones.Rellenar_Izquierda(Item,2,"0")
		
			Dim p As B4XView = xui.CreatePanel("")
			
			p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsView.Width,70dip)
			p.LoadLayout("Items_Descuentos")
			p.Color = Colors.Transparent

			Dim Kodt As String = Cursor1.GetString("Kodt")
			Dim Podt As Double = Cursor1.GetString("Podt")
			Dim Vadt As Double = Cursor1.GetString("Vadt")

			Lbl_Id_DocDsc.Tag = Id_DocDsc
			Lbl_Kodt.Text = Kodt
			Lbl_Podt.Text = "% " & NumberFormat(Podt,0,2)
			Lbl_Podt.Tag = Podt
			Lbl_Vadt.Text = "$ " & NumberFormat(Vadt,0,2)
			Lbl_Vadt.Tag = Vadt
			Lbl_Item.Tag = Item
			Lbl_Item.Text = "Item: " & ItemStr
		
			XclvDescuentos.Add(p,"")
			
		Next
		
	Else
		ToastMessageShow("No items found", False)
	End If
	
	DBUtils.UpdateRecord(Variables.vSql,"Detalle_Doc","NroDscto",NroDscto,CreateMap("Id_DocDet": Id_DocDet))
	
	Cursor1.Close
	Sb_Sumar_Totales
		
End Sub

Sub Sb_Sumar_Totales()

	Total_Descuento = 0
	
	For i = 0 To XclvDescuentos.Size -1
		
		Dim p As B4XView = XclvDescuentos.GetPanel(i)
		
		If p.NumberOfViews > 0 Then
			
			Dim vLbl_Vadt As Label = p.GetView(4)
			Dim Vadt As Double = Funciones.Fx_NuloPorNro(vLbl_Vadt.Tag, 0)

			Total_Descuento = Total_Descuento+Vadt
						
		End If
		
	Next
	
	SubTotal_Linea = Round2(Total_Linea_Origen-Total_Descuento, 0)
	Total_Pc = 0

	If Total_Descuento <> 0 Then
		Total_Pc = (Total_Descuento / Total_Linea_Origen) * 100
	End If
	
	Lbl_Total_Dscto_Porc.Text = "% " & NumberFormat(Total_Pc,0,2)
	Lbl_Total_Dscto_Valor.Text = "$ " & NumberFormat(Total_Descuento,0,2)
	Lbl_Total_Linea.Text = "$ " & NumberFormat(SubTotal_Linea,0,2)

End Sub

Private Sub Btn_Volver_Click
	Activity.Finish
End Sub

Private Sub Btn_Agregar_Descuento_Click
	
	Dim DescuentoPorc As Double
	
	Wait For(Sb_Agregar_Descuento) Complete (ResultDscto As Double)
	DescuentoPorc = ResultDscto
	
	If DescuentoPorc > 0 Then
		
		Dim Kodt As String = "D_SIN_TIPO"
		Dim Podt As Double = DescuentoPorc
		Dim Vadt As Double
		
		Dim Valor As Double = SubTotal_Linea
		Dim Decimales As Int = 0

		If Podt <> 0 Or Vadt <> 0 Then

			If Podt <> 0 Then

				If Podt > 0 Then
					Vadt = Round2((Podt / 100) * Valor,Decimales)
					Podt = Round2((Vadt / Valor) * 100,5)
				Else
					Vadt = 0
				End If

			Else 

				If Vadt <> 0 Then
					Podt = Round2((Vadt / Valor) * 100,5)
				Else
					Podt = 0
				End If

			End If

			Podt = Round2(Podt,Decimales)

			If Podt <> 0 Then

				Consulta_Sql = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)"
				Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object (Id_DocEnc,Id_DocDet,"",Kodt,Podt,Vadt,Podt))
		
				'Dim DescuentoValor As Double = Fila.Get("descuentovalor")
				'Dim DescuentoPorc As Double = Fila.Get("descuentoporc")
				'Dim DescuentoPorc_Original As Double = Fila.Get("descuentoporc")
		
			End If
			
		End If
		
		Sb_Cargar_Descuentos
		
	End If
	
End Sub

Sub Sb_Agregar_Descuento As ResumableSub
	
	Private Base As B4XView
	Private dialog As B4XDialog
	Dim DescuentoPorc As Double
	
	If Dscto_Max > 0 Then
		
		If NroDscto_Max = NroDscto Then
		
			bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
			Msgbox2Async("No puede agregar mas líneas de descuento","Validación", "Ok", "", "", bmp1, False)
			Wait For Msgbox_Result (Result As Int)
			DescuentoPorc = 0
			Return DescuentoPorc
			
		End If
		
	End If
	
	
	Base = Activity
	dialog.Initialize (Base)
	
	Private InputTemplate As B4XInputTemplate
	InputTemplate.Initialize
	
	If Dscto_Max > 0 Then
		
		InputTemplate.lblTitle.Text = "Ingrese % descuento. Max " & Dscto_Max & "%"
		InputTemplate.Text = Dscto_Max
		
	Else

'		If Acepta_Dscto_Marca Then
'			InputTemplate.lblTitle.Text = "Ingrese % descuento. Max " & Dscto_Marca & "%"
'			InputTemplate.Text = Dscto_Marca
'		Else
			InputTemplate.lblTitle.Text = "Ingrese % descuento"
			InputTemplate.Text = ""
		'End If			
		
	End If
	
	InputTemplate.ConfigureForNumbers(False,False)
				
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		Try
			Dim NewDescuentoPorc As Double = InputTemplate.Text
			
			If Dscto_Max > 0 Then
			
				If NewDescuentoPorc > Dscto_Max Then
					bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
					Msgbox2Async("El descuento no puede ser mayor a un " & Dscto_Max & "%","Validación", "Ok", "", "", bmp1, False)
					Wait For Msgbox_Result (Result As Int)
					DescuentoPorc = 0
				Else
					DescuentoPorc = NewDescuentoPorc
				End If
				
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
	
	Return DescuentoPorc
	
End Sub

Private Sub XclvDescuentos_ItemLongClick (Index As Int, Value As Object)
	
	Dim xui As XUI
	Dim Item As CLVItem  = XclvDescuentos.GetRawListItem(Index)
	Dim p As Panel = Item.Panel.GetView(0)
	Dim LblIdDocDsc As Label = p.GetView(0)
	Dim LblItem As Label = p.GetView(5)
	
				
	If NroDscto <> LblItem.Tag Then
		bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
		Msgbox2Async("Solo puede hacer cambios en la ultima fila","Validación", "Ok","","", bmp1, True)
		Return
	End If		
	
	Dim Id_DocDsc As Int = LblIdDocDsc.Tag
	
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
		
	Dim sf As Object = xui.Msgbox2Async("¿Confirma la eliminación de este descuento?","" ,"SI","","NO",bmp1)
	Wait For (sf) Msgbox_result (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then

		Consulta_Sql = "Select Id_DocDsc From Descuentos_Doc Where Id_DocDsc = " & Id_DocDsc
		Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)
		
		If Fila_Dscto.IsInitialized Then
			DBUtils.DeleteRecord(Variables.vSql,"Descuentos_Doc",Fila_Dscto)
		End If
		
		p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p.Height)
		Sleep(600)
		XclvDescuentos.RemoveAt(Index)
			
		'ToastMessageShow("Registr eliminado",False)
	
		Sb_Cargar_Descuentos	
			
	End If
	
End Sub