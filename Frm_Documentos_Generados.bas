B4A=true
Group=Default Group\Sistemas\Post-Bk
ModulesStructureVersion=1
Type=Activity
Version=11.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Public Idmaeedo_Sel As Int
	Public Tido_Sel As String
	Public Nudo_Sel As String
	Public Koen_Sel As String
	Public Suen_Sel As String
	Public Doc_Seleccionado As Boolean
	Public Estado_Sel As String

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private DateTemplateDesde As B4XDateTemplate
	Private DateTemplateHasta As B4XDateTemplate
	Private CantTop As Int

	Dim Consulta_Sql As String
	
	Private XclvDetalle As CustomListView
	Private Rdb_COV As RadioButton
	Private Rdb_NVV As RadioButton
	Private Btn_Actualizar As Button
	Private Btn_Volver As Button
	Private B4XLoading As B4XLoadingIndicator
	Private Lbl_Tido As B4XView
	Private Lbl_Nudo As B4XView
	Private Lbl_KoenSuen As B4XView
	Private Lbl_Rut As B4XView
	Private Lbl_Razon_Social As B4XView
	Private Lbl_Total As B4XView
	Private Lbl_Items As B4XView
	Private Lbl_Idmaeedo As B4XView
	Private Btn_Fecha_Desde As Button
	Private Btn_Fecha_Hasta As Button
	Private Lbl_Feemdo As B4XView
	Private Lbl_Estado As B4XView
	Private Chk_SoloPendientes As CheckBox
	Private Txt_Top As EditText
	Private Lbl_Sucursal As B4XView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Activity.LoadLayout("Cp_Documentos_Generados")
	Base = Activity
	Dialog.Initialize (Base)
	Dialog.Title = "Bakapp"
	
	DateTemplateDesde.Initialize
	DateTemplateHasta.Initialize
		
	DateTemplateDesde.Date = DateTime.Now
	DateTemplateHasta.Date = DateTime.Now
	
	Btn_Fecha_Desde.Text = DateTime.Date(DateTemplateDesde.Date)
	Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplateHasta.Date)
	
	DateTemplateDesde.MaxYear = DateTime.GetYear(DateTime.Now)
	DateTemplateDesde.MinYear = DateTemplateDesde.MaxYear - 10
	
	DateTemplateHasta.MaxYear = DateTime.GetYear(DateTime.Now)
	DateTemplateHasta.MinYear = DateTemplateDesde.MaxYear - 10
	
	B4XLoading.Hide
	
	Dim Items As List
	Items.Initialize
	Items.Add("10")
	Items.Add("20")
	Items.Add("30")
	Items.Add("40")
	Items.Add("50")
	Items.Add("100")
	
	CantTop = 10
	Txt_Top.Text = CantTop
	
	Doc_Seleccionado = False
	Idmaeedo_Sel = 0
	Koen_Sel = ""
	Suen_Sel = ""
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub XclvDetalle_ItemLongClick (Index As Int, Value As Object)
	
	Dim XUI As XUI
	Dim Item As CLVItem  = XclvDetalle.GetRawListItem(Index)
	Dim p As Panel = Item.Panel.GetView(0)
	
	Dim LblNudo As Label = p.GetView(0)
	Dim LblTido As Label = p.GetView(3)
	Dim LblIdmaeedo As Label = p.GetView(8)
	Dim LblEstado As Label = p.GetView(14)
	
	Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "symbol-cancel.png")
	
	If LblEstado.Tag = "C" Then
				
		Dim sf As Object = XUI.Msgbox2Async(LblTido.Text & "-" & LblNudo.Text & CRLF & _
						  					"Cerrado completamente" ,"Validación" ,"Ok","","",bmp1)
		Wait For (sf) Msgbox_result (Result As Int)
		Return
		
	End If
	
	Estado_Sel = LblEstado.Tag
	bmp1 = LoadBitmap(File.DirAssets, "question.png")
			
	Dim sf As Object = XUI.Msgbox2Async(LblTido.Text & "-" & LblNudo.Text ,"Seleccionar documento" ,"Seleccionar","Cancelar","",bmp1)
	Wait For (sf) Msgbox_result (Result As Int)

	If Result = XUI.DialogResponse_Positive Then
		
		Doc_Seleccionado = True
		Idmaeedo_Sel = LblIdmaeedo.Tag
		
		Activity.Finish
		
	End If
		
End Sub

Private Sub Btn_Actualizar_Click
	
	XclvDetalle.Clear
	B4XLoading.Show
	
	Dim Tido As String	
	
	If Rdb_COV.Checked Then Tido = "COV"
	If Rdb_NVV.Checked Then Tido = "NVV"
		
	Dim DDesde As Int = DateTime.GetDayOfMonth(DateTemplateDesde.Date)
	Dim MDesde As Int = DateTime.GetMonth(DateTemplateDesde.Date)
	Dim YDesde As Int = DateTime.Getyear(DateTemplateDesde.Date)
	
	Dim DHasta As Int = DateTime.GetDayOfMonth(DateTemplateHasta.Date)
	Dim MHasta As Int = DateTime.GetMonth(DateTemplateHasta.Date)
	Dim YHasta As Int = DateTime.Getyear(DateTemplateHasta.Date)
	
	Dim Fecha As String = YDesde & Funciones.Rellenar_Izquierda(MDesde,2,"0") & Funciones.Rellenar_Izquierda(DDesde,2,"0")
	Dim FechaDesde As String = YDesde & "-" & Funciones.Rellenar_Izquierda(MDesde,2,"0") & "-" & Funciones.Rellenar_Izquierda(DDesde,2,"0")
	Dim FechaHasta As String = YHasta & "-" & Funciones.Rellenar_Izquierda(MHasta,2,"0") & "-" & Funciones.Rellenar_Izquierda(DHasta,2,"0")
	
	Dim FiltroEsdo As String
	
	If Chk_SoloPendientes.Checked Then
		FiltroEsdo = "And ESDO = ''"
	End If
	
	CantTop = Txt_Top.Text
	
	Consulta_Sql = "Select Top " & CantTop & " IDMAEEDO,TIDO,NUDO,SUDO,ESDO,En.NOKOEN As RAZON,ENDO,SUENDO,CONVERT(varchar, FEEMDO,103) As FEEMDO,En.RTEN As RUT,VANEDO,VAIVDO,VABRDO," & CRLF & _
       			   "(Select Count(KOPRCT) From MAEDDO Ddo Where Edo.IDMAEEDO = Ddo.IDMAEEDO) As ITEMS" & CRLF & _ 
				   "From MAEEDO Edo" & CRLF & _
				   "Left Join MAEEN En On En.KOEN = Edo.ENDO And En.SUEN = Edo.SUENDO" & CRLF & _ 
				   "Where TIDO = '" & Tido & "'" & CRLF & _ 
				   "And FEEMDO BETWEEN CONVERT(DateTime, '" & FechaDesde & " 00:00:00', 102) AND CONVERT(DATETIME, '" & FechaHasta & " 23:59:59', 102)" & CRLF & _
				   "--And FEEMDO = '" & Fecha & "'" & CRLF & _
				   "And KOFUDO = '" & Variables.Global_Row_Usuario_Activo.Get("KOFU") & "'" & CRLF & _ 
				   FiltroEsdo & CRLF & _
				   "Order by NUDO Desc"
	ProgressDialogShow("Buscando documentos...")
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)

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
			
				Dim Tido As String = Fila.Get("TIDO")
				Dim Nudo As String = Fila.Get("NUDO")
				Dim Sudo As String = Fila.Get("SUDO")
				Dim Koen As String = Fila.Get("ENDO")
				Dim Suen As String = Fila.Get("SUENDO")
				Dim Rut As String = Fila.Get("RUT")
				Dim Esdo As String = Fila.Get("ESDO")				
				Dim Feemdo As String = Fila.Get("FEEMDO")
				Dim Razon_Social As String = Fila.Get("RAZON")
				Dim Total As Double = Fila.Get("VABRDO")
				Dim Items As Int = Fila.Get("ITEMS")
				Dim Idmaeedo As Int = Fila.Get("IDMAEEDO")
												
				Dim p As B4XView = XUI.CreatePanel("")
			
				p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,200dip)
				p.LoadLayout("Items_Documentos_Generados")
				p.Color = Colors.Transparent
				
				Lbl_Tido.Text = Tido
				Lbl_Nudo.Text = Nudo
				Lbl_Sucursal.Text = Sudo
				Lbl_Feemdo.Text = Feemdo
				Lbl_KoenSuen.Tag = Koen & ";" & Suen
				Lbl_Razon_Social.Text = Razon_Social
				Lbl_Total.Tag = Total
				Lbl_Total.Text = "$ " & NumberFormat(Total,0,2)
				Lbl_Items.Text = Items
				Lbl_Rut.Tag = Rut
				Lbl_Rut.Text = NumberFormat(Rut,0,0) & "-" & Funciones.RutDigito(Rut)
				Lbl_Idmaeedo.Tag = Idmaeedo
				Lbl_Idmaeedo.Text = "ID: " & Idmaeedo
				Lbl_Estado.Tag = Esdo
				
				If Esdo = "C" Then 
					Lbl_Estado.Text = "Cerrado"
					Lbl_Estado.TextColor = Colors.RGB(240, 124, 73)
				End If
				If Esdo.Trim = "" Then 
					Lbl_Estado.Text = "Abierto"
					Lbl_Estado.TextColor = Colors.RGB(189, 247, 164)
				End If
				If Esdo = "N" Then Lbl_Estado.Text = "Nulo"
				
				XclvDetalle.Add(p,"")
			
				Log(Lbl_Idmaeedo.Text)
				
			Next
						
		Else
		
			ToastMessageShow("No se encontraron registros",False)
			
		End If
		
	End If

	B4XLoading.Hide
	ProgressDialogHide

	
End Sub

Private Sub Btn_Volver_Click
	Activity.Finish
End Sub

'Private Sub Cmb_Cant_Filas_Mostrar_SelectedIndexChanged (Index As Int)
'	'Dialog.Show($"Selected item: ${Cmb_Cant_Filas_Mostrar.GetItem(Index)}"$, "OK", "", "")
'	CantTop = Cmb_Cant_Filas_Mostrar.GetItem(Index)
'End Sub

Private Sub Btn_Fecha_Desde_Click
	Wait For (Dialog.ShowTemplate(DateTemplateDesde, "", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Btn_Fecha_Desde.Text = DateTime.Date(DateTemplateDesde.Date)
	End If
End Sub

Private Sub Btn_Fecha_Hasta_Click
	Wait For (Dialog.ShowTemplate(DateTemplateHasta, "", "", "CANCEL")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplateHasta.Date)
	End If
End Sub