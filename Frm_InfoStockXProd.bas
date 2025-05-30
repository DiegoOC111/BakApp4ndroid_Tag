B4A=true
Group=Default Group\Productos
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False	
#End Region

Sub Process_Globals
	'Estas variables globales se declararán una sola vez cuando se inicie la aplicación.
	'Se puede acceder a estas variables desde todos los módulos.

	Dim Msj As Mensajes
	'Dim FilaSeleccionada As Map
	Dim Codigo As String
	Dim Descripcion As String

End Sub

Sub Globals
	'Estas variables globales se volverán a declarar cada vez que se cree la actividad.
	'Solo se puede acceder a estas variables desde este módulo.

	Dim bmp1 As Bitmap

	Private Lbl_Codigo As Label
	Private Lbl_Descripcion As Label
	Private Xclv_StokXbodega As CustomListView
	
	Private Lbl_Bodega As B4XView
	Private Lbl_InfoStock As B4XView
		
End Sub

Sub Activity_Create(FirstTime As Boolean)

	'No olvides cargar el archivo de diseño creado con el diseñador visual. Por ejemplo:
	Activity.LoadLayout("St_StockXBodega")
	Msj.Initialize

	Lbl_Codigo.Text = Codigo
	Lbl_Descripcion.Text = Descripcion

End Sub

Sub Activity_Resume

	Revisar_Stock

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Revisar_Stock()' As ResumableSub
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Ts.NOKOSU,Tb.NOKOBO,STFI1" & CRLF & _
                   "From MAEST Ms" & CRLF & _
				   "Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO" & CRLF & _
				   "Left Join TABSU Ts On Ts.EMPRESA = Ms.EMPRESA And Ts.KOSU = Ms.KOSU" & CRLF & _
                   "Where KOPR = '" & Codigo & "'"
	
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
	
'			Dim Items As List
'			Items.Initialize

			Dim xui As XUI
			Private Dialog As B4XDialog
	
			Dialog.Initialize (Activity)
			Dialog.Title = "Stock X Bodega"
	
			Xclv_StokXbodega.DefaultTextBackgroundColor = Colors.Transparent
			Xclv_StokXbodega.Clear
	
			For Each vFilaStb As Map In TblStockXbodega
				
				Dim p As B4XView = xui.CreatePanel("")
		
				p.SetLayoutAnimated(100,0,0,Xclv_StokXbodega.AsView.Width,100dip)
				p.LoadLayout("Items_StockXProducto")
				p.Color = Colors.Transparent
				
				Dim Stock As String  = NumberFormat(vFilaStb.Get("STFI1"),0,2)
				
				'Lbl_Sucursal.Tag = vFilaStb.Get("KOSU")
				'Lbl_Sucursal.Text = vFilaStb.Get("KOSU") & " - " & vFilaStb.Get("NOKOSU")
				Lbl_Bodega.Text = vFilaStb.Get("KOSU") & " - " & vFilaStb.Get("KOBO") & " - " & vFilaStb.Get("NOKOBO")
				Lbl_InfoStock.Text = "Stock disponible: " & Stock
				p.Tag =vFilaStb
				Xclv_StokXbodega.add(p,"")
				
			Next
	
		End If
	
	End If
	
End Sub

Private Sub Xclv_StokXbodega_ItemLongClick (Index As Int, Value As Object)
	
'	FilaSeleccionada.Initialize
	
	Dim xui As XUI
	Dim Item As CLVItem  = Xclv_StokXbodega.GetRawListItem(Index)
	Dim p As Panel = Item.Panel.GetView(0)
'	FilaSeleccionada = p.Tag
	
	Msj.EsCorrecto = True
	Msj.Tag = p.Tag
	Dim FilaSeleccionada As Map = p.Tag
	bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
	
	Dim Stock As String  = NumberFormat(FilaSeleccionada.Get("STFI1"),0,2)
	
	Dim sf As Object = xui.Msgbox2Async("Bodega: " & FilaSeleccionada.Get("NOKOBO") & CRLF & _
										"Stock disponible: " & Stock,"Selección de bodega","Confirmar","Cancelar","",bmp1)
	Wait For (sf) Msgbox_result (Result As Int)
	
	If Result <> DialogResponse.POSITIVE Then
		Return
	End If	
	
	Activity.Finish
	
End Sub

