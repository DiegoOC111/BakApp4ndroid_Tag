B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
#DesignerProperty: Key: BooleanExample, DisplayName: Show Seconds, FieldType: Boolean, DefaultValue: True
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Text color

Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object	
	Private Txt_Codigo As B4XView
	'Private Xclv_StokXbodega As CustomListView
	'Private Lbl_Sucursal As B4XView	
	Private Lbl_Bodega As B4XView
	'Private Lbl_InfoStock As B4XView
	Private Lbl_Descripcion As B4XView
	Private Xclv_StokXbodega As CustomListView
	Private Lbl_Sucursal As B4XView
	Private Lbl_InfoStock As B4XView
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

Sub Revisar_Stock(Codigo As String) As ResumableSub
	
'	Private xui As XUI
'	Private Dialog As B4XDialog
	Private Base As B4XView = mBase
	Private Msj As Mensajes
	
	Base.LoadLayout("St_StockXBodega")
	
	Msj.Initialize
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Tb.NOKOBO As BODEGA,STFI1" & CRLF & _
                   "From MAEST Ms" & CRLF & _
				   "Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO" & CRLF & _
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
	
			Dialog.Initialize (mBase)
			Dialog.Title = "Stock X Bodega"
	
			Dim p As B4XView = xui.CreatePanel("")
			p.SetLayoutAnimated(0, 0,0, 320dip, 250dip)
			p.LoadLayout("Items_StockXProducto")
			
			'xclv_StokXbodega.Initialize(mBase,"")			
			
			For Each vFilaStb As Map In TblStockXbodega
			
				Dim Stock As String  = NumberFormat(vFilaStb.Get("STFI1"),0,2)
				Dim Bodega As String
				
				Bodega = vFilaStb.Get("BODEGA")			
				Bodega = Funciones.Rellenar_Derecha(Bodega.Trim,20,".")
				
				Lbl_Sucursal.Tag = vFilaStb.Get("KOSU")
				Lbl_Sucursal.Text = vFilaStb.Get("KOSU") & " - " & vFilaStb.Get("NOKOSU")				
				Lbl_Bodega.Text = vFilaStb.Get("KOBO") & " - " & vFilaStb.Get("NOKOBO")
				'Lbl_Bodega.Tag = vFilaStb.Get("EMPRESA") & "-" & vFilaStb.Get("KOSU") & "-" & vFilaStb.Get("KOBO")
				Lbl_InfoStock.Text = "Stock disponible: " & Stock				
				Xclv_StokXbodega.add(p,vFilaStb)
				
			Next
	
'			SearchTemplateStock.SetItems(Items)

'			Base = mBase
'			Dialog.Initialize (Base)
'			Dialog.Title = "Stock X Bodega"

			Dialog.PutAtTop = True 'put the dialog at the top of the screen
			Wait For (Dialog.ShowCustom(p, "", "", "")) Complete (Result As Int)
			
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

Private Sub Xclv_StokXbodega_ItemLongClick (Index As Int, Value As Object)
	
End Sub