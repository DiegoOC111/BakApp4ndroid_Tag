B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.9
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
	Public Msj As Mensajes
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Dim xui As XUI
	
	Private Lbl_Codigo As B4XView
	Private Lbl_Codsucursal As B4XView
	Private Lbl_Razon_Social As B4XView
	Private Lbl_Direccion As B4XView
	Private Lbl_Rut As B4XView
	Private Lbl_Tipo As B4XView

	Private Txt_Codigo_Descripcion As EditText
	Private Btn_Buscar As Button
	Private B4XLoading As B4XLoadingIndicator
	Private XclvDetalle As CustomListView
	Private LblItems As Label

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	Activity.LoadLayout("Buscador")
	Activity.Title = "BUSCAR ENTIDADES"

	XclvDetalle.DefaultTextBackgroundColor = Colors.Transparent
	B4XLoading.Hide
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Btn_Aceptar_Click
	Dim btn As Button = Sender
	ToastMessageShow(btn.Tag,False)
End Sub

Private Sub Btn_Buscar_Click
	Sb_Buscar_Entidad(Txt_Codigo_Descripcion.Text)
End Sub

Private Sub Txt_Codigo_Descripcion_EnterPressed
	Sb_Buscar_Entidad(Txt_Codigo_Descripcion.Text)
End Sub

Sub Sb_Buscar_Entidad(Descripcion As String)
		
	Dim Cadena As String
	
	Cadena = Funciones.Fx_Cadena_a_buscar_SQL(Descripcion, "KOEN+NOKOEN+SUEN+DIEN" & " LIKE '%","")

	XclvDetalle.Clear
	B4XLoading.Show

	Dim Condicion_Entidad As String
	Dim Filtro_Extra As String
	Dim Filtro_Entidades As String
	Dim Filtro_Vendedores As String

	Consulta_Sql = "Select Top (30) IDMAEEN,KOEN,SUEN,RTEN,NOKOEN,SIEN,DIEN," & CRLF & _
					"Case TIEN " & CRLF & _
					"When 'A' Then 'Ambos' " & CRLF & _
					"When 'P' Then 'Proveedor' When 'C' Then 'Cliente' Else '' End As Tipo_Entidad," & CRLF & _
					"SUBSTRING(LCEN,6,3) As LCosto,SUBSTRING(LVEN,6,3) As LVenta," & CRLF & _
					"BLOQUEADO,BLOQENCOM," & CRLF & _
					"Case BLOQUEADO When 1 Then 'SI' Else '' End As Bloqueado_Venta," & CRLF & _
					"Case BLOQENCOM When 1 Then 'SI' Else '' End As Bloqueado_Compra" & CRLF & _
					"From MAEEN With (Nolock) " & CRLF & _
					"Where KOEN+NOKOEN+SUEN+DIEN LIKE '%" & Cadena & "%'" & CRLF & _
					Condicion_Entidad & CRLF & _
					Filtro_Extra & CRLF & _
					Filtro_Entidades & CRLF & _
					Filtro_Vendedores & CRLF & _
					"Order by KOEN"
			
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	ProgressDialogShow("Buscando entidades...")

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
			
				Dim Koen As String = Fila.Get("KOEN")
				Dim Suen As String = Fila.Get("SUEN")
				Dim Nokoen As String = Fila.Get("NOKOEN")
				Dim Dien As String = Fila.Get("DIEN")
				Dim Tipo As String = Fila.Get("Tipo_Entidad")
				Dim Rten As String = Fila.Get("RTEN")
				'Dim Rut As String = Fila.Get("Rut")
				
				Rten = NumberFormat(Rten,0,0) & "-" & Funciones.RutDigito(Rten)
												
				Dim p As B4XView = xui.CreatePanel("")
			
				p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,160dip)
				p.LoadLayout("Items_Entidades")
				p.Color = Colors.Transparent
				
				Lbl_Codigo.Tag = Koen
				Lbl_Codsucursal.Tag = Suen
				Lbl_Razon_Social.Tag = Nokoen
				Lbl_Direccion.Tag = Dien
				Lbl_Tipo.Text = Tipo.ToUpperCase
				Lbl_Rut.Text = Rten.Replace(",",".")
				
				Lbl_Codigo.Text = Koen
				If Suen.Trim <> "" Then
					Lbl_Codsucursal.Text = "Suc.: " & Suen
				Else
					Lbl_Codsucursal.Text = ""
				End If
				Lbl_Razon_Social.Text = Nokoen
				Lbl_Direccion.Text = Dien
											
				XclvDetalle.Add(p,"")
				
				Log(Koen & Suen & Nokoen)
				
			Next
									
		End If
		
	Else
		
		ToastMessageShow("No se encontraron registros",False)
	
	End If

	B4XLoading.Hide
	ProgressDialogHide

End Sub

Private Sub XclvDetalle_ItemLongClick (Index As Int, Value As Object)
	
	Dim xui As XUI
	Dim Item As CLVItem  = XclvDetalle.GetRawListItem(Index)
	Dim p As Panel = Item.Panel.GetView(0)
	Dim LblKoen As Label = p.GetView(0)
	Dim LblSuen As Label = p.GetView(1)

	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me,LblKoen.Text,LblSuen.Tag)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
		
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Fila =Filas.Get(0)
				
			Log(LblKoen.Text)
			Dim Nokoen As String = Fila.Get("NOKOEN")
									
			Dim sf As Object = xui.Msgbox2Async("¿Confirma la selección?" & CRLF & Nokoen ,LblKoen.Text & LblSuen.Text,"SI","","NO",Null)
			Wait For (sf) Msgbox_result (Result As Int)
			
			If Result = xui.DialogResponse_Positive Then
	
				Frm_Post_01_Formulario.Row_Entidad = Fila
				Frm_Post_01_Formulario.Fila_Encabezado.Put("codentidad",LblKoen.Text)
				Frm_Post_01_Formulario.Fila_Encabezado.Put("codsucentidad",LblSuen.Tag)
				Frm_Post_01_Formulario.Fila_Encabezado.Put("nombre_entidad",Nokoen)
				Frm_Post_01_Formulario.Cambiar_Entidad = True
				
				Msj.EsCorrecto = True
				
				Activity.Finish
	
			End If
			
		Else
			Fila = Null
		End If
			
	Else
		Log(Js.ErrorMessage)
	End If
	
	
End Sub