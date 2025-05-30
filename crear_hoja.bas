B4A=true
Group=Default Group\inventario
ModulesStructureVersion=1
Type=Activity
Version=12.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
 
#End Region

Sub Process_Globals
	Private xui As XUI
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private focusTimer As Timer
	Private timer2 As Timer
	Private timer3 As Timer
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private listaObjetos As Map
	Private detalles As List
	Private dialog As B4XDialog
	Private aux_cod As String
	Private aux_can As String
	Private Map1Aux As Map 
	Private Map2Aux As Map 
	Private Buscar As Boolean
	Private cache_spinner As Int
	Private XclvDetalle As CustomListView	
	Private lbl_canL As Label
	Private lbl_stock As Label
	Private lbl_stocks As Label
	Private cache As B4XView
	Private Contador1 As Map
	Private Contador2 As Map
	Private UltBuscado As String
	Private Panelbus As Panel
	Private Cache_Des As String
	Private Cache_Stock As String
	Private Txt_escaner As EditText
	Private Btn_esc_productos As Button
	Private Btn_Cancelar As Button
	Private Btn_enviar As Button
	Private Iniciado As Boolean
	Private Btn_esc_sector As Button
	Private Txt_ed_can As EditText
	Private Lbl_ed_cod As Label
	Private Txt_Lector As EditText
	Private Lbl_descr As Label
	Private Lbl_sector As Label
	Private Lbl_cod As Label
	Private Lbl_desc As Label
	Private Lbl_can As Label
	Private MainPanel As Panel
	Private SubPabel As Panel
	Private Spinner1 As Spinner
	Private TipCon As String
	Private Lbl_tipo As Label
	Private Lbl_tipcod As Label
	Private auxspin As String
	Private Btn_Eliminar As Button
	Private Btn_editar As Button
	Private Btn_Cancel As Button
	Private Lbl_SpFm As Label
	Private Lbl_Fm As Label
	Private Lbl_SbFm As Label
	Private Lbl_Marca As Label
	Private Lbl_FechaUlt As Label
	Private Lbl_codprincipal As Label
	Private Lbl_stockInfo As Label
	Private Lbl_ActPos As Label
	Private Lbl_contador As Label
	Private Btn_observaciones As Button
	Private Btn_Observacion As Button
	Private Lbl_descI As Label
	Private Btn_VolverInfo As Button
	Private Txt_Observacion As EditText
	Private Btn_VolverOBS As Button
	Private Btn_EnviarObs As Button
	Private Lbl_Observacion As Label
	Private SectInfo As Map
	Private Lbl_precio As Label
	Private Btn_Menu As Label
	Private Btn_EditadContadores As Button
	Private Btn_EditarContador2 As Button
	Private Btn_VolverInv As Button
	Private Btn_MnmVolver As Button
	Private TgBtn_1 As ToggleButton
	Private TgBtn_2 As ToggleButton
	Private List_Contador1 As CustomListView
	Private Lbl_rut As Label
	Private Lbl_NombreCon As Label
	Private drawer As B4XDrawer
	Private FT As Boolean
	Private Btn_CerrarMenu As Label
	Private Lbl_NomCAux As Label
	Private Btn_ElCon As Button
	Private Btn_Guardar1 As Button
	Private Btn_EditarC2 As Button
	Private Btn_InfoPRodsBusc As Button
	Private Btn_VolverOBS2 As Button
	Private cache_spinner2 As Int
	Private Spinner2 As Spinner
	Private List_Objs As CustomListView
	Private Btn_BuscarObj As Button
	Private Label2 As Label
	Private Lbl_CodPBSC As Label
	Private Lbl_CodRapBSC As Label
	Private Lbl_CodTecBSC As Label
	Private Lbl_DescBSC As Label
	Private Txt_BuscObjs As EditText
	Private Btn_BuscarPorDes As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Wait For(iniciar) complete(r As Int)
	'Do not forget to load the layout file created with the visual designer. For example:
	
'	listaObjetos.Initialize
'	detalles.Initialize
'	
'	drawer.Initialize(Me,"",Activity,50%x)
'	drawer.CenterPanel.LoadLayout("crear_h")
'	drawer.LeftPanel.LoadLayout("Inv_menu")
'	
'	dialog.Initialize(Activity)
'	dialog.Title = "Escanee el sector"
'	
'	XclvDetalle.DefaultTextBackgroundColor = Colors.Black
'	
'	Map1Aux.Initialize
'	Map2Aux.Initialize
'	
'	cache_spinner = 0
'	cache_spinner2 = 0
'	
'	Iniciado = False
'	Btn_esc_sector.RequestFocus
'	
'	Contador1.Initialize
'	Contador2.Initialize
'	
'	Contador1.Put("Rut", " ")
'	Contador2.Put("Rut", " ")
'	
'	Contador1.Put("Nombre", "")
'	Contador2.Put("Nombre", "")
'	
'	Contador1.Put("Id", 0)
'	Contador2.Put("Id", 0)
'	Dim rutaArchivo As String = DBUtils.GetDBFolder
'	Dim nombreArchivo As String = "miMapa.txt"
'	TipCon = "1"
'	If File.Exists(rutaArchivo, nombreArchivo) Then
'		Dim jsonString As String
'		jsonString = File.ReadString(rutaArchivo, nombreArchivo)
'    
'		' Parsear el JSON
'		Dim jsonParser As JSONParser
'		jsonParser.Initialize(jsonString)
'    
'		' Convertir el JSON a un Map (suponiendo que es un objeto JSON)
'		Dim map As Map
'		map = jsonParser.NextObject
'		Dim auxi As Map = map.Get("Inventario")
'		Dim auxis As String =  auxi.Get("Id")
'		If auxis = Inventario_Activo.Id Then
'			Msgbox2Async("Hay una hoja sin guardar. ¿Desea continuar con la misma hoja?", "Alerta", "Sí", "", "No", Null, False)
'
'			Wait For Msgbox_Result (Result5 As Int)
'			
'			If Result5 = DialogResponse.POSITIVE Then
'				wait for(rellenar(map)) complete(resul As Int )
'			Else
'				Msgbox2Async("Al hacer esto, los contenidos de la hoja se eliminarán. ¿Está seguro?", "Alerta", "Sí", "", "No", Null, False)
'			
'
'				Wait For Msgbox_Result (Result5 As Int)
'				If Result5 = DialogResponse.POSITIVE Then
'					File.Delete(rutaArchivo, nombreArchivo)
'					FT = True
'					wait for (Contadores) complete(res As Int )
'					Iniciado = False
'	
'					Btn_Menu.Visible = False
'				Else
'					StartActivity(invent)
'		
'					Activity.Finish
'				End If
'				
'			End If
'		End If
'		
'		' Leer el contenido del archivo TXT
'		
'	Else
'		FT = True
'		
'	
'		wait for (Contadores) complete(res As Int)
'	
'		Btn_Menu.Visible = False
'		Iniciado = False
'			
'	End If
	

End Sub
Sub iniciar As ResumableSub
	
	listaObjetos.Initialize
	detalles.Initialize
	
	drawer.Initialize(Me,"",Activity,50%x)
	drawer.CenterPanel.LoadLayout("crear_h")
	drawer.LeftPanel.LoadLayout("Inv_menu")
	
	dialog.Initialize(Activity)
	dialog.Title = "Escanee el sector"
	
	XclvDetalle.DefaultTextBackgroundColor = Colors.Black
	
	Map1Aux.Initialize
	Map2Aux.Initialize
	
	cache_spinner = 0
	cache_spinner2 = 0
	
	Iniciado = False
	Btn_esc_sector.RequestFocus
	
	Contador1.Initialize
	Contador2.Initialize
	
	Contador1.Put("Rut", " ")
	Contador2.Put("Rut", " ")
	
	Contador1.Put("Nombre", "")
	Contador2.Put("Nombre", "")
	
	Contador1.Put("Id", 0)
	Contador2.Put("Id", 0)
	Dim rutaArchivo As String = DBUtils.GetDBFolder
	Dim nombreArchivo As String = "miMapa.txt"
	TipCon = "1"
	If File.Exists(rutaArchivo, nombreArchivo) Then
		Dim jsonString As String
		jsonString = File.ReadString(rutaArchivo, nombreArchivo)
    
		' Parsear el JSON
		Dim jsonParser As JSONParser
		jsonParser.Initialize(jsonString)
    
		' Convertir el JSON a un Map (suponiendo que es un objeto JSON)
		Dim map As Map
		map = jsonParser.NextObject
		Dim auxi As Map = map.Get("Inventario")
		Dim auxis As String =  auxi.Get("Id")
		If auxis = Inventario_Activo.Id Then
			Msgbox2Async("Hay una hoja sin guardar. ¿Desea continuar con la misma hoja?", "Alerta", "Sí", "", "No", Null, False)

			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
				wait for(rellenar(map)) complete(resul As Int )
			Else
				Msgbox2Async("Al hacer esto, los contenidos de la hoja se eliminarán. ¿Está seguro?", "Alerta", "Sí", "", "No", Null, False)
			

				Wait For Msgbox_Result (Result5 As Int)
				If Result5 = DialogResponse.POSITIVE Then
					File.Delete(rutaArchivo, nombreArchivo)
					FT = True
					wait for (Contadores) complete(res As Int )
					Iniciado = False
	
					Btn_Menu.Visible = False
				Else
					StartActivity(invent)
		
					Activity.Finish
				End If
				
			End If
		End If
		
		' Leer el contenido del archivo TXT
		
	Else
		FT = True
		
	
		wait for (Contadores) complete(res As Int)
	
		Btn_Menu.Visible = False
		Iniciado = False
			
	End If
	Return 1
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CambioLista(AUX As Int)
	
	For i = 0 To XclvDetalle.Size - 1
			
		Dim a As B4XView = XclvDetalle.GetPanel(i)
        
		' Verificar si el Tag no es null y es del tipo Map
		If a.Tag <> Null And a.Tag Is Map Then
				
			Dim existingMap As Map = a.Tag
				
			Dim Lbl As Label = existingMap.Get("pos")
			Dim Num As String = Lbl.Text
			
			
			Dim Num2 As Int = INT0(Num)
			
			If Num2 >= AUX+1 Then
	
				Lbl.Text = String0(i+1)
			
				' Actualiza el Tag del panel
				existingMap.Put("pos", Lbl)
				XclvDetalle.Refresh
				
			End If
			
		End If
		
	Next
	
End Sub

Private Sub Btn_esc_sector_Click
	
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, 300dip, 150dip)
	p.LoadLayout("Lector")
	
	dialog.PutAtTop = True
	dialog.Title = "Por favor, escanee el sector"
	
	focusTimer.Initialize("focusTimer", 100)
	focusTimer.Enabled = True
	
	Iniciado = True
	
	Wait For (dialog.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
	
		Dim Js As HttpJob = sect_bus(Txt_Lector.Text, Me)
'		
		Wait For (Js) JobDone(Js As HttpJob)
		
		If Js.Success Then
	
			Dim vJson As String = Js.GetString
			
			If  vJson = $"{"Table":[]}"$ Then
				
				Dim bmp1 As Bitmap
			
				Msgbox2Async("El sector no se encontró. Por favor, verifica que el sector corresponda al inventario actual.", "Error", "OK", "", "", Null, False)
				Wait For Msgbox_Result (Result5 As Int)
			
				If Result5 = DialogResponse.POSITIVE Then
	
					Btn_esc_sector_Click
					Return
	
				End If
				
				Btn_esc_sector_Click

				Return
				
			End If
	
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim fila As Map = Filas.Get(0)
			
			Dim bmp1 As Bitmap	
			Dim a As Boolean = 	fila.Get("Abierto")
			If a Then 
				
				Else 
				Dim tex As String = "El sector: " & fila.Get("Sector") & " no está abierto."
			
				Msgbox2Async(tex , "Confirmación", "Aceptar", "", "", Null, False)
				Wait For Msgbox_Result (Result5 As Int)
				Btn_esc_sector_Click
				Return 
					
			End If
			bmp1 = LoadBitmap(File.DirAssets, "question.png")
	
			Dim tex As String  = "¿Deseas entrar al sector : " &fila.Get("Sector")&" ?"
			
			Msgbox2Async(tex , "Confirmación", "NO", "", "SI", bmp1, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
			
				Btn_esc_sector_Click
				Return
			
			End If
			
			SectInfo = fila
			
			Lbl_sector.Text = fila.Get("Sector")
			Lbl_sector.Tag =  fila.Get("Id")
			
			Btn_esc_sector.Visible=False
			
			Panelbus.Visible = True
			
			Btn_esc_productos.RequestFocus
			
			Btn_Menu.Visible = True

		Else 
			desconectado
			
			Return
		End If
	
	End If
	
	Iniciado = False
	
End Sub

Sub focusTimer_Tick

	focusTimer.Enabled = False ' Desactiva el Timer después de que se ejecute
	
	If Txt_Lector.IsInitialized Then

		Log("tik1")
		Txt_Lector.RequestFocus ' Enfoca el campo de texto
		
	End If
	
End Sub

Sub timer3_Tick

	timer3.Enabled = False

	If Txt_ed_can.IsInitialized Then
		
		Txt_ed_can.RequestFocus
		
	End If

End Sub

Sub timer2_Tick

	timer2.Enabled = False
	
	If Txt_escaner.IsInitialized Then
		
		Txt_escaner.RequestFocus
		
	End If

End Sub
Private Sub Btn_esc_productos_Click

	Buscar = False
	Dim c As B4XView = xui.CreatePanel("")

	c.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)
	dialog.Title = "Nuevo item"
'			Dim AUX As Boolean = False
	c.LoadLayout("Vista_escaner")
	dialog.PutAtTop = True

	Spinner1.AddAll(Array As String("Principal","Tecnico","Rapido"))
	Spinner1.SelectedIndex = cache_spinner
	
	timer2.Initialize("timer2", 100)
	timer2.Enabled = True
	
	Iniciado = True
	
	Wait For (dialog.ShowCustom(c, "OK", "", "CANCEL")) Complete (Result6 As Int)
	
	If Result6 = xui.DialogResponse_Positive Then
	
		cache_spinner = Spinner1.SelectedIndex
		auxspin = Spinner1.SelectedItem
	
		Dim Codigo As String = Txt_escaner.Text
			
		Dim Js As HttpJob = Bsc(auxspin, Codigo, Me)
'		
		Wait For (Js) JobDone(Js As HttpJob)
		
		If Js.Success Then
	
			Dim vJson As String = Js.GetString
			
			If  vJson = $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
				
				Dim bmp1 As Bitmap
			
				Msgbox2Async("Producto no encontrado en la base de datos.", "Error", "OK", "", "", Null, False)
				Wait For Msgbox_Result (Result5 As Int)
			
				If Result5 = DialogResponse.POSITIVE Then
		
					Txt_escaner.Text  = ""
		
				End If
				
				Btn_esc_productos_Click
				Return
				
			End If
				
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim fila As Map = Filas.Get(0)
		
			Codigo = fila.Get(auxspin)
			Crear(Filas,Codigo)

'			fila =Filas.Get(0)
'			
'			Cache_Des = fila.Get("Descripcion")
'			Cache_Stock = fila.Get("StockBodega")
'			
'			Log(Cache_Des)
'						
'			Dim aux_des As String
'			Dim q As B4XView = xui.CreatePanel("")
'			q.SetLayoutAnimated(0, 0, 0, 300dip, 270dip)
'			dialog.Title = "Nuevo item"
'			'			Dim AUX As Boolean = False
'			q.LoadLayout("Items_Hoja")
'			dialog.PutAtTop = True
'			'			Dim AUX2 As Boolean
'			
'			Btn_esc_productos.Visible = True
'			Btn_esc_sector.Visible = False
'			lbl_stock.Text = Cache_Stock
'			Lbl_descr.Text = Cache_Des
'			Lbl_ed_cod.Text = Codigo
'			aux_cod = Lbl_ed_cod.Text
'			Lbl_tipo.Text = auxspin	
'			aux_des = Lbl_descr.Text
'			focusTimer.Initialize("timer3", 100)
'			focusTimer.Enabled = True
'			Wait For (SomeResumableSub(Codigo)) Complete (Result As Boolean)
'		
'			' Puedes realizar acciones adicionales aquí basadas en el resultado de SomeResumableSub
'			If Result Then
'				
'				Wait For (dialog.ShowCustom(q, "OK", "", "CANCEL")) Complete (Result2 As Int)
'				
'				If Result2 = xui.DialogResponse_Positive Then
'				
'					aux_can = Txt_ed_can.Text
'					If IsNumber(Txt_ed_can.Text) = True Then
'						Dim num As Int = Txt_ed_can.Text
'						If num = 0  Then
'							Dim bmp1 As Bitmap
'							bmp1 = LoadBitmap(File.DirAssets, "warning.png")
'							Msgbox2Async("La cantidad no puede ser 0 " , "Alerta", "Ok", "", "", bmp1, False)
'							Wait For Msgbox_Result (Result11 As Int)
'					
'							If Result11 = DialogResponse.POSITIVE Then
'								Btn_esc_productos_Click
'								Return
'							Else
'								Btn_esc_productos_Click
'								Return
'							End If
'						End If
'					Else
'						num = 0
'						If num = 0 Then
'							Dim bmp1 As Bitmap
'							bmp1 = LoadBitmap(File.DirAssets, "warning.png")
'							Msgbox2Async("La cantidad no puede ser 0 " , "Alerta", "Ok", "", "", bmp1, False)
'							Wait For Msgbox_Result (Result11 As Int)
'					
'							If Result11 = DialogResponse.POSITIVE Then
'								Btn_esc_productos_Click
'								Return
'								
'							Else
'								Btn_esc_productos_Click
'								Return
'								
'							End If
'						End If
'						
'					End If
'					
'					
'					Dim p As B4XView = xui.CreatePanel("")
'					p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,180dip)
'					p.LoadLayout("vista_item")
'					p.Color = Colors.Transparent
'					Lbl_cod.Text = Lbl_ed_cod.Text
'					Lbl_tipcod.Text = Lbl_tipo.Text
'					Lbl_can.Text = aux_can
'					Lbl_desc.Text = aux_des
'					
'					If Lbl_desc.Text.Length >= 25 Then
'						' Inserta un espacio en la posición 24
'						Dim newString As String = Lbl_desc.Text.SubString2(0, 25) &  CRLF  & Lbl_desc.Text.SubString(25)
'						Lbl_desc.Text = newString
'		
'					End If
'					
'					p.Tag = CreateMap("cod": Lbl_ed_cod.Text, "desc": Lbl_desc.Text, "can": Txt_ed_can.Text, "tipo": Lbl_tipcod.Text, "infoP": fila )
'					XclvDetalle.Add(p,"")
'					Private vSalir As Int
'					Dim bmp1 As Bitmap
'					bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'					vSalir = Msgbox2("Item agregado con exito", "    ", "Ok", "", "", bmp1)
'					Txt_escaner.Text  = ""
'					
'									
'				Else
'				
'				End If
'			
'			Else
'				 
'				Dim bmp1 As Bitmap
'				bmp1 = LoadBitmap(File.DirAssets, "warning.png")
'				Msgbox2Async("Producto ya en la hoja, ¿desea editar? " , "Validación", "Si", "", "No", bmp1, False)
'				Wait For Msgbox_Result (Result4 As Int)
'				
'				If Result4 = DialogResponse.POSITIVE Then
'					ShowEditDialog(cache)
'				End If
'				
'			End If
'	
'		End If
'		'	buscar(Escaner.Text)
'		
'	End If
'	
	
'	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me,Codigo,"01","CM","PR","01P",1,"")
'		
'	Wait For (Js) JobDone(Js As HttpJob)
'		
'	If Js.Success Then
'	
'		Dim vJson As String = Js.GetString
'	
'		If  vJson <> $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
'			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'			Dim fila As Map
'			fila =Filas.Get(0)
'			
'			Cache_Des = fila.Get("Descripcion")
'			Cache_Stock = fila.Get("StockBodega")
'			
'			Log(Cache_Des)
'						
'			Dim aux_des As String
'			Dim q As B4XView = xui.CreatePanel("")
'			q.SetLayoutAnimated(0, 0, 0, 300dip, 270dip)
'			dialog.Title = "Nuevo item"
			''			Dim AUX As Boolean = False
'			q.LoadLayout("Items_Hoja")
'			dialog.PutAtTop = True
			''			Dim AUX2 As Boolean
'			
'			Btn_esc_productos.Visible = True
'			Btn_esc_sector.Visible = False
'			lbl_stock.Text = Cache_Stock
'			Lbl_descr.Text = Cache_Des
'			Lbl_ed_cod.Text = Codigo
'			aux_cod = Lbl_ed_cod.Text
'				
'			aux_des = Lbl_descr.Text
'			Wait For (SomeResumableSub(Codigo)) Complete (Result As Boolean)
			'
'			' Puedes realizar acciones adicionales aquí basadas en el resultado de SomeResumableSub
'			If Result Then
'				
'				Wait For (dialog.ShowCustom(q, "OK", "", "CANCEL")) Complete (Result2 As Int)
'				
'				If Result2 = xui.DialogResponse_Positive Then
'				
'					aux_can = Txt_ed_can.Text
'					Dim p As B4XView = xui.CreatePanel("")
'					p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,150dip)
'					p.LoadLayout("vista_item")
'					p.Color = Colors.Transparent
'					Lbl_cod.Text = Lbl_ed_cod.Text
'		
'					Lbl_can.Text = aux_can
'					Lbl_desc.Text = aux_des
'					
'					If Lbl_desc.Text.Length >= 25 Then
'						' Inserta un espacio en la posición 24
'						Dim newString As String = Lbl_desc.Text.SubString2(0, 25) &  CRLF  & Lbl_desc.Text.SubString(25)
'						Lbl_desc.Text = newString
			'
'					End If
'		
'					p.Tag = CreateMap("cod": Lbl_ed_cod.Text, "desc": Lbl_desc.Text, "can": Txt_ed_can.Text)
'					XclvDetalle.Add(p,"")
'					ToastMessageShow("Agregado con exito", False)
'					Txt_escaner.Text  = ""
'									
'				Else
'				
'				End If
'			
'			Else
'				 
'				Dim bmp1 As Bitmap
'				bmp1 = LoadBitmap(File.DirAssets, "warning.png")
'				Msgbox2Async("Producto ya en la hoja, ¿desea editar? " , "Validación", "Si", "", "No", bmp1, False)
'				Wait For Msgbox_Result (Result4 As Int)
'				
'				If Result4 = DialogResponse.POSITIVE Then 
'					ShowEditDialog(cache)
'				End If
'				
'			End If			
'	
'		Else
'			
'			Dim bmp1 As Bitmap
'			bmp1 = LoadBitmap(File.DirAssets, "emoticon-sad.png")
'			
'			Msgbox2Async("Producto no encontrado" , "Error", "OK", "", "", bmp1, False)
'			Wait For Msgbox_Result (Result5 As Int)
'			
'			If Result5 = DialogResponse.POSITIVE Then
'				Txt_escaner.Text  = ""
'			End If
'		
		Else
			
			desconectado
			Return
		End If
'		
	Else

		Iniciado = False
			
	End If
'	
	''	buscar(Escaner.Text)
			
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Devuelve True para consumir el evento.
	
	
	If KeyCode = KeyCodes.KEYCODE_BACK  Then
		
		If Iniciado Then
			
			dialog.Close(DialogResponse.CANCEL)
			Return True
			
		End If
		
		If drawer.LeftOpen Then
	
			drawer.LeftOpen = False
			Return True
	
		End If
	
		Private vSalir As Int
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
		
		vSalir = Msgbox2("¿Seguro qué desea salir? Todos los datos se borrarán.", "S A L I R", "Sí", "", "No", bmp1)

'		Dim bmp1 As Bitmap
'		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'		Wait For Msgbox_Result (vSalir As Int)
		
		If vSalir = DialogResponse.POSITIVE Then
			Dim rutaArchivo As String = DBUtils.GetDBFolder
			Dim nombreArchivo As String = "miMapa.txt"
			File.Delete(rutaArchivo, nombreArchivo)
			
			Return False
			
		Else
			
			Return True
			
		End If
		
	End If
	
	Return False

End Sub


Private Sub XclvDetalle_ItemClick (Index As Int, Value As Object)
	
	
End Sub

Sub Crear(Mapa As List, Codigo As String)

	Iniciado = True
					
	Dim fila As Map
	fila =Mapa.Get(0)
			
	Cache_Des = fila.Get("Descripcion")
	Cache_Stock = fila.Get("StFisicoUd1")
			
	Log(Cache_Des)
						
	Dim aux_des As String
	
	Dim q As B4XView = xui.CreatePanel("")
	q.SetLayoutAnimated(0, 0, 0, 300dip, 270dip)
	
	dialog.Title = "Agregar Nuevo Ítem"
	'			Dim AUX As Boolean = False
	q.LoadLayout("Items_Hoja")
	dialog.PutAtTop = True
	'			Dim AUX2 As Boolean
			
	Btn_esc_productos.Visible = True
	Btn_esc_sector.Visible = False
	
	lbl_stock.Text = Cache_Stock
	Lbl_descr.Text = Cache_Des
	
	Lbl_ed_cod.Text = Codigo
	aux_cod = Lbl_ed_cod.Text
	
	Lbl_tipo.Text = auxspin
	aux_des = Lbl_descr.Text
	
	timer3.Initialize("timer3", 300)
	timer3.Enabled = True
	
	Wait For (SomeResumableSub(Codigo, auxspin)) Complete (Result As Boolean)
		
	' Puedes realizar acciones adicionales aquí basadas en el resultado de SomeResumableSub
	If Result Then
				
		Wait For (dialog.ShowCustom(q, "GUARDAR", "", "CANCEL")) Complete (Result2 As Int)
				
		If Result2 = xui.DialogResponse_Positive Then
				
			aux_can = Txt_ed_can.Text
	
			If IsNumber(Txt_ed_can.Text) = True Then
	
				Dim num As Int = Txt_ed_can.Text
	
				If num = 0  Then
	
					Dim bmp1 As Bitmap
					bmp1 = LoadBitmap(File.DirAssets, "warning.png")
					Msgbox2Async("La cantidad no puede ser 0 " , "Alerta", "Ok", "", "", bmp1, False)
	
					Wait For Msgbox_Result (Result11 As Int)
					
					If Result11 = DialogResponse.POSITIVE Then
	
						Crear(Mapa, Codigo)

						Return
					Else
	
						Crear(Mapa, Codigo)

						Return
	
					End If
	
				End If
	
			Else
	
				num = 0
	
				If num = 0 Then
	
					Dim bmp1 As Bitmap
					bmp1 = LoadBitmap(File.DirAssets, "warning.png")
					Msgbox2Async("La cantidad no puede ser 0 " , "Alerta", "Ok", "", "", bmp1, False)
					Wait For Msgbox_Result (Result11 As Int)
					
					If Result11 = DialogResponse.POSITIVE Then
	
						Crear(Mapa, Codigo)
						Return
								
					Else
	
						Crear(Mapa, Codigo)

						Return
								
					End If
	
				End If
						
			End If
									
			Dim p As B4XView = xui.CreatePanel("")
			p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,160dip)
			p.LoadLayout("vista_item")
			p.Color = Colors.Black
			
			Lbl_cod.Text = Lbl_ed_cod.Text
			
			Lbl_tipcod.Text = Lbl_tipo.Text
			Lbl_can.Text = aux_can
			
			Lbl_desc.Text = aux_des
			Lbl_ActPos.Text	= String0(XclvDetalle.Size + 1)
			
			If Lbl_desc.Text.Length >= 25 Then
				' Inserta un espacio en la posición 24
				Dim newString As String = Lbl_desc.Text.SubString2(0, 25) &  CRLF  & Lbl_desc.Text.SubString(25)
				Lbl_desc.Text = newString
		
			End If
			
			Btn_observaciones.Tag = ""
			
			p.Tag = CreateMap("cod": Lbl_ed_cod.Text, "desc": Lbl_desc.Text, "can": Lbl_can, "tipo": Lbl_tipcod.Text,"pos": Lbl_ActPos ,"infoP": fila, "Obs": Btn_observaciones )
			
			XclvDetalle.Add(p,"")
			
			
			
			detalles.Add( CreateMap("cod": Lbl_ed_cod.Text, "desc": Lbl_desc.Text, "can": Lbl_can.Text, "tipo": Lbl_tipcod.Text,"pos": Lbl_ActPos ,"infoP": fila, "Obs": ""))
			listaObjetos.Put("Sector",SectInfo)
			listaObjetos.Put("Inventario",Inventario_Activo.tomap)
			listaObjetos.Put("Lista",detalles)
			listaObjetos.Put("C1",Contador1)
			listaObjetos.Put("C2",Contador2)
			Dim jeison As JSONGenerator
			jeison.Initialize(listaObjetos)
			Dim ts As String  = jeison.ToPrettyString(1)
			Dim rutaArchivo As String = DBUtils.GetDBFolder
			Dim nombreArchivo As String = "miMapa.txt"
			
			File.WriteString(rutaArchivo, nombreArchivo, ts)
'			/*/
			If File.Exists(rutaArchivo, nombreArchivo) Then
				Log("Creado")
			End If
			
			Lbl_contador.Text = XclvDetalle.Size
			
			Private vSalir As Int
			
			Dim bmp1 As Bitmap
			
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
			
			vSalir = Msgbox2("El ítem se ha agregado con éxito.", "Operación Exitosa", "OK", "", "", bmp1)
			
			If Txt_escaner.IsInitialized Then
				
				Txt_escaner.Text  = ""
				
			End If
					
									
		Else
				
		End If
			
	Else
				 
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "warning.png")
			
		Msgbox2Async("El producto ya está en la hoja. ¿Desea editarlo?", "Validación", "Sí", "", "No", bmp1, False)

		Wait For Msgbox_Result (Result4 As Int)
				
		If Result4 = DialogResponse.POSITIVE Then
			
			Wait for (ShowEditDialog(cache)) Complete (R As Int)
			
		End If
				
	End If
	
	Iniciado = False
	
End Sub

Sub ShowEditDialog(p As B4XView) As  ResumableSub
	Dim index As Int  = XclvDetalle.GetItemFromView(p)
	Iniciado = True
	
	Dim q As B4XView = xui.CreatePanel("")
	Dim mapa As Map = p.Tag
	
	dialog.Title = "Editar el item: "& mapa.Get("cod")
	
	q.SetLayoutAnimated(0, 0, 0, 300dip, 270dip)
	q.LoadLayout("Items_Hoja")
	
	dialog.PutAtTop = True
	    
	' Asigna los valores actuales a los campos del diálogo
		
	
	Lbl_ed_cod.Text = mapa.Get("cod")
	Lbl_ed_cod.Visible = True

	Dim auxD As Label = mapa.Get("can")
	
	Txt_ed_can.Text = auxD.Text
	Lbl_descr.Text = mapa.Get("desc")

	Lbl_descr.Visible = True
	lbl_canL.Visible = True

	lbl_stocks.Visible = True
	lbl_stock.Visible = True

	Txt_ed_can.Visible = True
	
	Log(mapa)
	
	Lbl_tipo.Text = mapa.Get("tipo")
	
	Dim map2 As Map = mapa.get("infoP")
	
	lbl_stock.Text = map2.get("StFisicoUd1")

	timer3.Initialize("timer3", 300)
	timer3.Enabled = True
	
	Wait For (dialog.ShowCustom(q, "OK", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		
		If IsNumber(Txt_ed_can.Text) = True Then
			
			Dim num As Int = Txt_ed_can.Text
			
		Else
			
			num = 0
			
		End If
		
		If num = 0 Then
			
			Dim bmp1 As Bitmap
			bmp1 = LoadBitmap(File.DirAssets, "warning.png")
			
			Msgbox2Async("La cantidad no puede ser 0 " , "Alerta", "Ok", "", "", bmp1, False)
			
			Wait For Msgbox_Result (Result11 As Int)
					
			If Result11 = DialogResponse.POSITIVE Then
				
				Wait for (ShowEditDialog(p)) complete (R As Int)

				Return 0
				
			Else
				
				Wait for (ShowEditDialog(p)) complete (R As Int)

				Return 0
				
			End If
			
		End If
		
		If Lbl_ed_cod.Text <> "" And num > 0 Then
			
			Dim aux_cod As String = Lbl_ed_cod.Text
			Dim aux_can As String = Txt_ed_can.Text
			Dim aux_des As String = Lbl_descr.Text
        
			' Actualiza el panel con los nuevos valores
			
			Dim l As List  = listaObjetos.Get("Lista")
			Dim m_a As Map = l.Get(index)
			m_a.Put("can",aux_can )
			l.Set(index,m_a)
			auxD.Text = aux_can
			
			' Actualiza el Tag del panel
			mapa.Put("can", auxD)
			Dim jeison As JSONGenerator
			jeison.Initialize(listaObjetos)
			Dim ts As String  = jeison.ToPrettyString(1)
			Dim rutaArchivo As String = DBUtils.GetDBFolder
			Dim nombreArchivo As String = "miMapa.txt"
			
			File.WriteString(rutaArchivo, nombreArchivo, ts)
'			/*/
			If File.Exists(rutaArchivo, nombreArchivo) Then
				Log("Creado")
			End If
			Private vSalir As Int
			Dim bmp1 As Bitmap
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
			
			vSalir = Msgbox2("Item editado con exito", "Operación Exitosa", "Ok", "", "", bmp1)
        	
			' Si es necesario, aquí puedes añadir la lógica para guardar estos cambios en una base de datos o archivo.
			
		End If
		
	End If
	
	Return 1

End Sub

Private Sub XclvDetalle_ItemLongClick (Index As Int, Value As Object)
	
	Private vSalir As Int
	Dim x As B4XView = xui.CreatePanel("")
	Dim bmp1 As Bitmap
	Dim p As B4XView = XclvDetalle.GetPanel(Index)
	
	x.SetLayoutAnimated(0, 0, 0, 350dip, 380dip)
	x.LoadLayout("info_aux")
	
	dialog.Title = ""
	Iniciado = True
	Wait For (dialog.ShowCustom(x, "", "", "")) Complete (Eleccion As Int)
	
  
		
	If Eleccion = xui.DialogResponse_Positive Then
		
		
		Wait for(ShowEditDialog(p)) complete(r As Int)

		Iniciado = False

	Else If Eleccion = xui.DialogResponse_Negative Then

		Private vSalir2 As Int
		Dim bmp2 As Bitmap
		bmp2 = LoadBitmap(File.DirAssets, "warning.png")

		vSalir2 = Msgbox2("¿Está seguro de que desea eliminar el ítem?", "Confirmación de eliminación", "Eliminar", "", "Cancelar", bmp2)

		If vSalir2 =  DialogResponse.POSITIVE Then

			XclvDetalle.RemoveAt(Index)
			Lbl_contador.Text = XclvDetalle.Size

			CambioLista(Index)
				
			Private vSalir As Int
			Dim bmp1 As Bitmap
			bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
			vSalir = Msgbox2("Item eliminado  con exito", "Operación Exitosa", "Ok", "", "", bmp1)
								
		End If
	
	Else If Eleccion = 33 Then
	
		Dim p As B4XView = XclvDetalle.GetPanel(Index)
			
		Dim mapa As Map = p.Tag
		Dim InfoProd As Map = mapa.Get("infoP")
		Log(mapa.Get("infoP"))
			
		Dim z As B4XView = xui.CreatePanel("")
		Dim bmp1 As Bitmap
		z.SetLayoutAnimated(0, 0, 0, 300dip, 500dip)
			
		z.LoadLayout("info_prod")
			
		bmp1 = LoadBitmap(File.DirAssets, "question.png")
			
		dialog.Title = ""
			
		Lbl_SpFm.Text  =	InfoProd.Get("NombreSuper")
		Lbl_Fm.Text  =	InfoProd.Get("NombreFamilia")
		
		Lbl_SbFm.Text= 	InfoProd.Get("NombreSub")
		Lbl_codprincipal.Text = InfoProd.Get("Principal")
		
		Lbl_stockInfo.Text = InfoProd.Get("StFisicoUd1")
		Lbl_Marca.Text = InfoProd.Get("MARCA")
		
		Lbl_descI.Text =  InfoProd.Get("Descripcion")
		Lbl_precio.Text =  "$"&InfoProd.Get("PrecioListaUd1")
		
		Wait For (dialog.ShowCustom(z, "", "", "")) Complete (Eleccion As Int)
		If Eleccion = xui.DialogResponse_Positive Then
			
		End If
	
	Else If Eleccion = 22 Then
	
		wait for (Coment(p, Index)) complete (Res As Int)
		
	End If
	
	Iniciado = False
	
End Sub
Private Sub Coment(B As B4XView, i As String) As ResumableSub
	
	Dim z As B4XView = xui.CreatePanel("")
	z.SetLayoutAnimated(0, 0, 0, Activity.Width, 350dip)
			
	z.LoadLayout("Obs")
	Dim mapa As Map = B.Tag
	Dim btn As Button = mapa.Get("Obs")
	
	Lbl_Observacion.Text = "Observacion del item: "& mapa.Get("cod")
	Txt_Observacion.Text = btn.Tag
	
	Wait For (dialog.ShowCustom(z, "", "", "")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		
		Dim res As String = Txt_Observacion.Text
		btn.Tag = Txt_Observacion.Text.ToUpperCase
		mapa.Put("Obs", btn)
		Dim l As List  = listaObjetos.Get("Lista")
		Dim m_a As Map = l.Get(i)
		m_a.Put("Obs",Txt_Observacion.Text.ToUpperCase )
		l.Set(i,m_a)
		Dim jeison As JSONGenerator
		jeison.Initialize(listaObjetos)
		Dim ts As String  = jeison.ToPrettyString(1)
		Dim rutaArchivo As String = DBUtils.GetDBFolder
		Dim nombreArchivo As String = "miMapa.txt"
			
		File.WriteString(rutaArchivo, nombreArchivo, ts)
'			/*/
		If File.Exists(rutaArchivo, nombreArchivo) Then
			Log("Creado")
		End If
	End If

	Return 1

End Sub

Private Sub Btn_Cancelar_Click

	Private vSalir As Int
	Dim bmp1 As Bitmap
	bmp1 = LoadBitmap(File.DirAssets, "exit.png")
	vSalir = Msgbox2("¿Esta seguro de salir, al hacerlo se borrara todos los datos de la hoja?", "S A L I R", "Si", "", "No", bmp1)
	
		
'		Dim bmp1 As Bitmap
'		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'		Wait For Msgbox_Result (vSalir As Int)
		
	If vSalir = DialogResponse.POSITIVE Then
		Dim rutaArchivo As String = DBUtils.GetDBFolder
		Dim nombreArchivo As String = "miMapa.txt"
		File.Delete(rutaArchivo, nombreArchivo)
			
		
		StartActivity(invent)
		
		Activity.Finish
		
		
	Else
		
	End If

End Sub

Private Sub Btn_enviar_Click
	
	If Msgbox2("¿Desea enviar la hoja?","Confirmación","Sí","","No", Null) = DialogResponse.POSITIVE Then
		wait for(AUXENV) complete(r As Int)
		
	End If
''	If Result = DialogResponse.POSITIVE Then
''		Log(Result)
'	ProgressDialogShow("Cargando hoja")
'		
'	Dim P As Phone
'	
'	DateTime.DateFormat = "yyyy-MM-dd"
'	
'	Dim ListOb As List
'	ListOb.Initialize
'	
'	Dim Hora As String = DateTime.Time(DateTime.Now)
'	Dim date As String = DateTime.Date(DateTime.Now)
'	
'	date = date&" "&Hora
'	
'	Dim modelo As String = Variables.Global_Row_Usuario_Activo.Get("NOKOFU")
'	
'	If XclvDetalle.Size > 0 Then
'		
'		Dim Items As List
'		Items.Initialize()
'		
'		Dim Item As Item_Contenido
'		Item.Initialize()
'		
'		For i = 0 To XclvDetalle.Size - 1
'			
'			Dim a As B4XView = XclvDetalle.GetPanel(i)
'        
'			' Verificar si el Tag no es null y es del tipo Map
'			If a.Tag <> Null And a.Tag Is Map Then
'				
'				Dim existingMap As Map = a.Tag
'				
'				Dim map2 As Map = existingMap.Get("infoP")
'				
'				
'				Dim Clase As Clase_Hoja_Detalle
'				Dim Cod As String = map2.Get("Principal")
'				Dim Leibol As Label  = existingMap.Get("can")
'				Dim Cantis As Double = Leibol.Text.As(Double)
'				
'				Dim des_btn As Button = existingMap.Get("Obs")
'				Dim ITM As Label = existingMap.Get("pos")
'				Dim positem As String = ITM.Text
'				Dim des As String = des_btn.Tag
'				
'				Dim U1 As String  = map2.Get("Ud1")
'				Dim U2 As String =	map2.Get("Ud2")
'				Dim Rtu As Double =  map2.Get("Rtu")
'				
'				Dim contid1 As Int = Contador1.Get("Id")
'				Dim contid2 As Int = Contador2.Get("Id")
'				
'				Clase.Initialize(1, 100, "001", Inventario_Activo.Id, Inventario_Activo.Empresa, Inventario_Activo.Sucursal, Inventario_Activo.Bodega, Inventario_Activo.FuncionarioCargo, contid1 ,contid2 , positem, SectInfo.Get("Id"), _
'                SectInfo.Get("Sector"),"","", Cod, "", 0, "", date, Rtu, _
'                0, 1, Cantis, U1 , Cantis, U2, Cantis , des, 0, "", "")
'				
'				
'				Dim NumDeHoja As Int = 1
'				
'				ListOb.Add(Clase.ToMap)
'				
'			End If
'			
'		Next
'		
'		Dim Clase2 As Clase_Hoja
'		
''		Clase2.Initialize(1, Inventario_Activo.Id, NumDeHoja , modelo, date, Inventario_Activo.FuncionarioCargo, 101, 102, date, False, ListOb )
'		Clase2.Initialize(1, Inventario_Activo.Id, NumDeHoja , modelo, date, Inventario_Activo.FuncionarioCargo, Contador1.Get("Id"), Contador2.Get("Id"), date, False )
'		
'		Dim JSON2 As String = Clase2.ToJson
'		Dim jsonGenerator As JSONGenerator
'		
'		jsonGenerator.Initialize2(ListOb)
''		jsonGenerator.Initialize(ListOb)
'
'		Dim jsonString As String = jsonGenerator.ToPrettyString(1)
'		Dim Js As HttpJob = sect_bus(SectInfo.Get("Id"), Me)
''		
'		Wait For (Js) JobDone(Js As HttpJob)
'		
'		If Js.Success Then
'	
'			Dim vJson As String = Js.GetString
'			
'			If  vJson = $"{"Table":[]}"$ Then
'				
'				Dim bmp1 As Bitmap
'			
'				
'				
'				
'					
'
'				Return
'				
'			End If
'	
'			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'			Dim fila As Map = Filas.Get(0)
'			
'			Dim bmp1 As Bitmap
'			Dim ac As Boolean = 	fila.Get("Abierto")
'			If ac Then
'				
'			Else
'				Dim tex As String = "El sector '" & fila.Get("Sector") & "' no está abierto. Por favor, confirme que el sector no se cerró durante el proceso."
'
'			
'				Msgbox2Async(tex , "Confirmación", "Aceptar", "", "", Null, False)
'				Wait For Msgbox_Result (Result5 As Int)
'				Return
'					
'			End If
'		Else
'			desconectado
'			Return
'		End If
'				
'		Dim Js As HttpJob = env_JS(JSON2,jsonString, Me)
'		
'		wait For (Js) JobDone(Js As HttpJob)
'		
'		If Js.Success Then
'	
'			Dim vJson As String = Js.GetString
'			
'			If  vJson = $"{"Table":[]}"$ Then
'				
'			Else
'				ProgressDialogHide
'				Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'				Dim fila As Map = Filas.Get(0)
'				
'				Dim NumHoja As String = fila.Get("Numero")
'				Dim Correcto As Boolean = fila.Get("EsCorrecto")
'				
'				If Correcto Then
'					
'					
'					Dim texto As String = "La hoja ha sido creada y guardada exitosamente." & CRLF & _
'                      "Número de Hoja: " & NumHoja
'					  
'					dialog.Title = "Creación Exitosa de Hoja de Inventario"
'					Log(vJson)
'					Dim rutaArchivo As String = DBUtils.GetDBFolder
'					Dim nombreArchivo As String = "miMapa.txt"
'					File.Delete(rutaArchivo, nombreArchivo)
'					Wait For(dialog.Show(texto,"Aceptar","","")) complete(resl As Int)
'					
'					StartActivity(invent)
'					Activity.Finish
'					
'				End If
''				Dim NHoja As String = fila.Get("Numero_Hoja")
''				Dim parser As JSONParser
''				parser.Initialize(vJson)
'				'
''				' Convertir el JSON en un Map
''				Dim root As Map
''				root = parser.NextObject()
'				'
''				' Obtener el valor de "Numero_Hoja"
''				Dim numeroHoja As String
''				numeroHoja = root.Get("Numero_Hoja")
''				Dim texto As String = "La hoja número " & numeroHoja & " ha sido creada y guardada exitosamente."
''				dialog.Title = "Hoja de Inventario Creada"
''				Wait For(dialog.Show(texto,"Ok","","")) complete(resl As Int)
'			
'				
'					
'				
'			End If
'			
'		Else
'			desconectado
'			Return
'		End If
'		
'	Else
'		
'		Private vSalir As Int
'		Dim bmp1 As Bitmap
'		
'		bmp1 = LoadBitmap(File.DirAssets, "symbol-delete.png")
'		
'		vSalir = Msgbox2("No puede enviar una hoja vacía.", "Error", "OK", "", "", bmp1)
'
'			
'	End If
''	Else
''		Log(Result)
''		Return
''	End If
''	Log(Result)
End Sub



Private Sub AUXENV As ResumableSub
	ProgressDialogShow("Cargando hoja")
		
	Dim P As Phone
	
	DateTime.DateFormat = "yyyy-MM-dd"
	
	Dim ListOb As List
	ListOb.Initialize
	
	Dim Hora As String = DateTime.Time(DateTime.Now)
	Dim date As String = DateTime.Date(DateTime.Now)
	
	date = date&" "&Hora
	
	Dim modelo As String = Variables.Global_Row_Usuario_Activo.Get("NOKOFU")
	
	If XclvDetalle.Size > 0 Then
		
		Dim Items As List
		Items.Initialize()
		
		Dim Item As Item_Contenido
		Item.Initialize()
		
		For i = 0 To XclvDetalle.Size - 1
			
			Dim a As B4XView = XclvDetalle.GetPanel(i)
        
			' Verificar si el Tag no es null y es del tipo Map
			If a.Tag <> Null And a.Tag Is Map Then
				
				Dim existingMap As Map = a.Tag
				
				Dim map2 As Map = existingMap.Get("infoP")
				
				
				Dim Clase As Clase_Hoja_Detalle
				Dim Cod As String = map2.Get("Principal")
				Dim Leibol As Label  = existingMap.Get("can")
				Dim Cantis As Double = Leibol.Text.As(Double)
				
				Dim des_btn As Button = existingMap.Get("Obs")
				Dim ITM As Label = existingMap.Get("pos")
				Dim positem As String = ITM.Text
				Dim des As String = des_btn.Tag
				
				Dim U1 As String  = map2.Get("Ud1")
				Dim U2 As String =	map2.Get("Ud2")
				Dim Rtu As Double =  map2.Get("Rtu")
				
				Dim contid1 As Int = Contador1.Get("Id")
				Dim contid2 As Int = Contador2.Get("Id")
				
				Clase.Initialize(1, 100, "001", Inventario_Activo.Id, Inventario_Activo.Empresa, Inventario_Activo.Sucursal, Inventario_Activo.Bodega, Inventario_Activo.FuncionarioCargo, contid1 ,contid2 , positem, SectInfo.Get("Id"), _
                SectInfo.Get("Sector"),"","", Cod, "", 0, "", date, Rtu, _
                0, 1, Cantis, U1 , Cantis, U2, Cantis , des, 0, "", "")
				
				
				Dim NumDeHoja As Int = 1
				
				ListOb.Add(Clase.ToMap)
				
			End If
			
		Next
		
		Dim Clase2 As Clase_Hoja
		
'		Clase2.Initialize(1, Inventario_Activo.Id, NumDeHoja , modelo, date, Inventario_Activo.FuncionarioCargo, 101, 102, date, False, ListOb )
		Clase2.Initialize(1, Inventario_Activo.Id, NumDeHoja , modelo, date, Inventario_Activo.FuncionarioCargo, Contador1.Get("Id"), Contador2.Get("Id"), date, False )
		
		Dim JSON2 As String = Clase2.ToJson
		Dim jsonGenerator As JSONGenerator
		
		jsonGenerator.Initialize2(ListOb)
'		jsonGenerator.Initialize(ListOb)

		Dim jsonString As String = jsonGenerator.ToPrettyString(1)
		Dim Js As HttpJob = sect_bus(SectInfo.Get("Id"), Me)
'		
		Wait For (Js) JobDone(Js As HttpJob)
		
		If Js.Success Then
	
			Dim vJson As String = Js.GetString
			
			If  vJson = $"{"Table":[]}"$ Then
				
				Dim bmp1 As Bitmap
			
				
				
				
					

				Return 0
				
			End If
	
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
			Dim fila As Map = Filas.Get(0)
			
			Dim bmp1 As Bitmap
			Dim ac As Boolean = 	fila.Get("Abierto")
			If ac Then
				
			Else
				Dim tex As String = "El sector '" & fila.Get("Sector") & "' no está abierto. Por favor, confirme que el sector no se cerró durante el proceso."

			
				Msgbox2Async(tex , "Confirmación", "Aceptar", "", "", Null, False)
				Wait For Msgbox_Result (Result5 As Int)
				Return 0
					
			End If
		Else
			desconectado
			Return 0 
		End If
				
		Dim Js As HttpJob = env_JS(JSON2,jsonString, Me)
		
		wait For (Js) JobDone(Js As HttpJob)
		
		If Js.Success Then
	
			Dim vJson As String = Js.GetString
			
			If  vJson = $"{"Table":[]}"$ Then
				
			Else
				ProgressDialogHide
				Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
				Dim fila As Map = Filas.Get(0)
				
				Dim NumHoja As String = fila.Get("Numero")
				Dim Correcto As Boolean = fila.Get("EsCorrecto")
				
				If Correcto Then
					
					
					Dim texto As String = "La hoja ha sido creada y guardada exitosamente." & CRLF & _
                      "Número de Hoja: " & NumHoja
					  
					dialog.Title = "Creación Exitosa de Hoja de Inventario"
					Log(vJson)
					Dim rutaArchivo As String = DBUtils.GetDBFolder
					Dim nombreArchivo As String = "miMapa.txt"
					File.Delete(rutaArchivo, nombreArchivo)
					Wait For(dialog.Show(texto,"Aceptar","","")) complete(resl As Int)
					
					StartActivity(invent)
					Activity.Finish
					
				End If
'				Dim NHoja As String = fila.Get("Numero_Hoja")
'				Dim parser As JSONParser
'				parser.Initialize(vJson)
				'
'				' Convertir el JSON en un Map
'				Dim root As Map
'				root = parser.NextObject()
				'
'				' Obtener el valor de "Numero_Hoja"
'				Dim numeroHoja As String
'				numeroHoja = root.Get("Numero_Hoja")
'				Dim texto As String = "La hoja número " & numeroHoja & " ha sido creada y guardada exitosamente."
'				dialog.Title = "Hoja de Inventario Creada"
'				Wait For(dialog.Show(texto,"Ok","","")) complete(resl As Int)
			
				
					
				
			End If
			
		Else
			desconectado
			Return 0 
		End If
		
	Else
		
		Private vSalir As Int
		Dim bmp1 As Bitmap
		
		bmp1 = LoadBitmap(File.DirAssets, "symbol-delete.png")
		
		vSalir = Msgbox2("No puede enviar una hoja vacía.", "Error", "OK", "", "", bmp1)
		Return 0 
			
	End If
'	Else
'		Log(Result)
'		Return
'	End If
'	Log(Result)
	
	Return 0
End Sub
Sub SomeResumableSub(codigo As String, tipo As String ) As ResumableSub
	
	Dim aux_cod As String = codigo

	For i = 0 To XclvDetalle.Size - 1
		
		Dim a As B4XView = XclvDetalle.GetPanel(i)
        
		' Verificar si el Tag no es null y es del tipo Map
		If a.Tag <> Null And a.Tag Is Map Then
			
			Dim existingMap As Map = a.Tag
			Dim map2 As Map = existingMap.Get("infoP")
			Dim auxR As String = map2.Get(tipo)
			
			Log(auxR.Length)
			
			If auxR = aux_cod Then
				
				cache = a
				
				Return False

			End If
			
		Else
			
			Log("Tag is null or not a Map for panel at index " & i)
			
		End If
		
	Next


	Return True
	
End Sub

Private Sub Txt_escaner_EnterPressed
	
	dialog.Close(DialogResponse.POSITIVE)
	
End Sub

Private Sub Txt_Lector_EnterPressed
	
	dialog.Close(DialogResponse.POSITIVE)
	
End Sub


Private Sub Btn_AuxMen_Click
	
	dialog.Close(33)
	
End Sub

Private Sub Btn_editar_Click
	
	dialog.Close(xui.DialogResponse_Positive)
	
End Sub

Private Sub Btn_Eliminar_Click
	
	dialog.Close(xui.DialogResponse_Negative)
	
End Sub

Private Sub Btn_Cancel_Click
	
	
	dialog.Close(xui.DialogResponse_Cancel)
	
End Sub

Private Sub Txt_ed_can_EnterPressed
	
	dialog.Close(xui.DialogResponse_Positive)
	
End Sub

Private Sub Bsc(Tipo As String, Codigo As String, Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_TraerProductoInventario xmlns="http://BakApp">
      <_IdInventario>$Xml{Inventario_Activo.Id}</_IdInventario>
      <_Empresa>$Xml{Inventario_Activo.Empresa}</_Empresa>
      <_Sucursal>$Xml{Inventario_Activo.Sucursal}</_Sucursal>
      <_Bodega>$Xml{Inventario_Activo.Bodega}</_Bodega>
      <_Tipo>$Xml{Tipo}</_Tipo>
      <_Codigo>$Xml{Codigo}</_Codigo>
    </Sb_Inv_TraerProductoInventario>
  </soap:Body>
</soap:Envelope>
"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_TraerProductoInventario""$)
	Js.GetRequest.Timeout = 3000
	Return Js
	
End Sub

Private Sub sect_bus(sec As String, Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_BuscarSector xmlns="http://BakApp">
      <Sector>$Xml{sec}</Sector>
	  <IdInv>$Xml{Inventario_Activo.Id}</IdInv>
    </Sb_Inv_BuscarSector>
  </soap:Body>
</soap:Envelope>"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_BuscarSector""$)
	Js.GetRequest.Timeout = 3000

	Return Js
	
End Sub
Private Sub env_JS(JSHOJ As String,JSDET As String, Me_ As Object) As HttpJob
	
'	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
	'<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	'  <soap:Body>
	'    <JS_ProcesarHojas xmlns="http://BakApp">
	'      <InventarioJson>$Xml{JSstr}</InventarioJson>
	'    </JS_ProcesarHojas>
	'  </soap:Body>
	'</soap:Envelope>"$

	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_IngresarHoja xmlns="http://BakApp">
      <_Inv_Hoja>$Xml{JSHOJ}</_Inv_Hoja>
      <_Ls_Inv_Hoja_Detalle>$Xml{JSDET}</_Ls_Inv_Hoja_Detalle>
    </Sb_Inv_IngresarHoja>
  </soap:Body>
</soap:Envelope>"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim JS As HttpJob
	
	JS.Initialize("",Me_)'
	JS.PostString(PostString,vXml)
	JS.GetRequest.SetContentType("text/xml; charset=utf-8")
	JS.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_IngresarHoja""$)
'	JS.GetRequest.SetHeader("SOAPAction",$""http://BakApp/JS_ProcesarHojas""$)
	JS.GetRequest.Timeout = 3000

	Return JS
	
End Sub

Private Sub Busc_Contadores( Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <Sb_Inv_BuscarContador xmlns="http://BakApp">
      <Rut>$Xml{Contador1.Get("Rut")}</Rut>
	  <Rut2>$Xml{Contador2.Get("Rut")}</Rut2>
    </Sb_Inv_BuscarContador>
  </soap:Body>
</soap:Envelope>"$

	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_BuscarContador""$)
	Js.GetRequest.Timeout = 3000

	Return Js
	
End Sub
' Función para formatear un número entero a una cadena con ceros a la izquierda
' Función para formatear un número entero a una cadena con ceros a la izquierda
Public Sub String0(Number As Int) As String
	
	Dim auxTXT As String = Number.As(String)
	
	Do While auxTXT.Length <> 3
		
		auxTXT = "0"&auxTXT
	
	Loop
	
	Return auxTXT

End Sub

Public Sub INT0(Number As String) As Int
	
	Dim result As String = Number
	
	Do While result.StartsWith("0")
		
		result = result.SubString(1)
		
	Loop
	
	If result = "" Then
		
		Return 0
		
	End If
	
	Return result.As(String)
	
End Sub



Private Sub Btn_Observacion_Click
	
	dialog.Close(22)
	
End Sub

Private Sub Btn_VolverInfo_Click
	
	dialog.Close(0)
	
End Sub

Private Sub Btn_observaciones_Click

	Dim btn As Button =   Sender
	Dim texto As String = btn.Tag
	dialog.Title = "Observacion"
	
	Wait For(dialog.Show(texto,"Ok","","")) complete(resl As Int)

End Sub

Private Sub Btn_EnviarObs_Click

	dialog.Close(xui.DialogResponse_Positive)
	
End Sub

Private Sub Btn_VolverOBS_Click
	
	dialog.Close(xui.DialogResponse_Negative)
	
End Sub


Private Sub Btn_Menu_Click
	
	drawer.LeftOpen = True
	Buscar = True 

	dialog.BlurBackground = False
'	If Eleccion = 11 Then 
'		
'		
'		else if Eleccion = 99 Then 
'			
'		Else if Eleccion = 12  Then 
'			
'		Else If Eleccion = 13 Then 
'			
'			
'			
'	End If
	
End Sub

Private Sub Btn_EditadContadores_Click
	
	dialog.Close(11)
	
	Map1Aux.Put("Rut", Contador1.Get("Rut"))
	Map1Aux.Put("Nombre", Contador1.Get("Nombre"))
	Map2Aux.Put("Rut", Contador2.Get("Rut"))
	Map2Aux.Put("Nombre", Contador2.Get("Nombre"))
	Map1Aux.Put("Id", Contador1.Get("Id"))
	Map2Aux.Put("Id", Contador2.Get("Id"))
	
	TipCon = "1"
	
	wait for(Contadores) complete(r As Int)
	
End Sub

Private Sub Btn_EditarContador2_Click
	
	dialog.Close(99)

End Sub

Private Sub Btn_VolverInv_Click

	Btn_Cancelar_Click

End Sub

Private Sub Btn_MnmVolver_Click

	dialog.Close(12)
	
End Sub

Private Sub TgBtn_2_CheckedChange(Checked As Boolean)

	If Checked Then

		TgBtn_1.Checked = False
		TgBtn_2.TextColor = Colors.Blue
		Lbl_NomCAux.Text = Contador2.Get("Nombre")

		If Contador2.Get("Nombre") = "" Then

			Btn_ElCon.Visible = False
			
		Else
			Btn_ElCon.Visible = True
				
		End If
		
	Else
			
		TgBtn_2.TextColor = Colors.White
			
	End If

End Sub

Private Sub TgBtn_1_CheckedChange(Checked As Boolean)

	If Checked Then

		TgBtn_2.Checked = False
		Btn_ElCon.Visible = False
		
		TgBtn_1.TextColor = Colors.Blue
		Lbl_NomCAux.Text = Contador1.Get("Nombre")

	Else
			
		TgBtn_1.TextColor = Colors.White
					
	End If

End Sub

Private Sub AUXC() As ResumableSub
	
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, Activity.Width, Activity.Height)
	dialog.Title = ""
	p.LoadLayout("Contador_Vista")

	dialog.PutAtTop = True
	List_Contador1.Clear

	If FT Then

		Btn_Guardar1.Visible = False
		
	Else

		Btn_Guardar1.Visible = True
		Iniciado = True
		
	End If
	If TipCon = "2" Then
		Btn_Guardar1.Visible = True
		
	End If
	If TipCon = "1" Then
		
		Lbl_NomCAux.Text = Contador1.Get("Nombre")
		Btn_ElCon.Visible = False
		
	Else
		
		Lbl_NomCAux.Text = Contador2.Get("Nombre")
		
		If Contador2.Get("Nombre") <> "" Then
		
			Btn_ElCon.Visible = True
		
		End If
			
	End If
	
	Dim Js As HttpJob = Busc_Contadores(Me)
		
	Wait For (Js) JobDone(Jas As HttpJob)
		
	If Jas.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson = $"{"Table":[]}"$ Then
			
		Else
	
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
	
			For i = 0 To Filas.Size - 1
	
				Dim fila As Map = Filas.Get(i)
				Dim q As B4XView = xui.CreatePanel("")
	
				q.SetLayoutAnimated(100,0,0,List_Contador1.AsView.Width,70dip)
				q.LoadLayout("VistaCon")
				q.Color = Colors.Black
	
				Lbl_rut.Text = fila.Get("Rut")
				Lbl_NombreCon.Text = fila.Get("Nombre")
	
				q.Tag = fila
	
				List_Contador1.Add(q,"")
	
			Next
	
		End If
		
	Else
		desconectado
		Iniciado = False
		dialog.Close(xui.DialogResponse_Cancel)
		Return 1
	End If
	
	Wait For (dialog.ShowCustom(p, "", "", "CANCEL")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Cancel Or Result = DialogResponse.CANCEL Then
	
		If FT Then
	
			Btn_Cancelar_Click
	
		Else
	
			Contador1 = Map1Aux
			Contador2 = Map2Aux
		End If
		
	End If
	
	Iniciado = False
	
	FT = False
	
	Return 1
	
End Sub
Sub BlockUI(Block As Boolean)
'	For Each v As View In Activity.GetAllViewsRecursive
'		v.Enabled = Not(Block)
'	Next
'    
'	' Alternativamente, puedes agregar un Panel transparente sobre toda la actividad
'	If Block Then
'		Dim pnlBlock As Panel
'		pnlBlock.Initialize("pnlBlock")
'		pnlBlock.Color = Colors.ARGB(150, 0, 0, 0)
'		Activity.AddView(pnlBlock, 0, 0, 100%x, 100%y)
'	Else
'		' Remueve el panel de bloqueo si existe
'		Dim pnlBlock As Panel = Activity.GetView(Activity.NumberOfViews - 1)
'		If pnlBlock Is Panel Then
'			pnlBlock.RemoveView
'		End If
'	End If
End Sub
Private Sub Contadores() As ResumableSub
	BlockUI(True)
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, Activity.Width, Activity.Height)
	dialog.Title = ""
	p.LoadLayout("Contador_Vista")

	dialog.PutAtTop = True
	List_Contador1.Clear

	If FT Then

		Btn_Guardar1.Visible = False
		
	Else

		Btn_Guardar1.Visible = True			
		Iniciado = True
		
	End If 
	If TipCon = "2" Then 
		Btn_Guardar1.Visible = True
		
	End If
	If TipCon = "1" Then 
		
		Lbl_NomCAux.Text = Contador1.Get("Nombre")
		Btn_ElCon.Visible = False
		
		Else 
		
		Lbl_NomCAux.Text = Contador2.Get("Nombre")
		
		If Contador2.Get("Nombre") <> "" Then 
		
			Btn_ElCon.Visible = True
		
		End If
			
	End If
	
	Dim Js As HttpJob = Busc_Contadores(Me)
		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson = $"{"Table":[]}"$ Then
			
		Else
	
			Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
	
			For i = 0 To Filas.Size - 1
	
				Dim fila As Map = Filas.Get(i)
				Dim q As B4XView = xui.CreatePanel("")
	
				q.SetLayoutAnimated(100,0,0,List_Contador1.AsView.Width,70dip)
				q.LoadLayout("VistaCon")
				q.Color = Colors.Black
	
				Lbl_rut.Text = fila.Get("Rut")
				Lbl_NombreCon.Text = fila.Get("Nombre")
	
				q.Tag = fila
	
				List_Contador1.Add(q,"")
	
			Next
	
		End If
		
	Else 
		desconectado
		Contadores
		Iniciado = False
		dialog.Close(xui.DialogResponse_Cancel)
		Return 0
	End If
	BlockUI(False)
	
	Wait For (dialog.ShowCustom(p, "", "", "CANCEL")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Cancel Or Result = DialogResponse.CANCEL Then
	
		If FT Then
	
			Btn_Cancelar_Click
	
		Else
	
			Contador1 = Map1Aux		
			Contador2 = Map2Aux
		End If
		
	End If
	
	Iniciado = False
	
	FT = False
	
	Return 1

End Sub

'Private Sub List_Contador1_ItemLongClick (Index As Int, Value As Object)
''	Dim p As B4XView  = List_Contador1.GetPanel(Index)
''	Dim mapa As Map = p.tag
''	If TipCon = "1"  Then
''		
''		Private vSalir As Int
''		Dim bmp1 As Bitmap
''		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
''		Dim tx As String = "¿Estás seguro de que deseas seleccionar a: " & mapa.Get("Nombre") & "?"
''
''		vSalir = Msgbox2(tx, "Confirmar", "Si", "", "No", Null)
''		
'''		Dim bmp1 As Bitmap
'''		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'''		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'''		Wait For Msgbox_Result (vSalir As Int)
''		
''		If vSalir = DialogResponse.POSITIVE Then
''			Contador1 = mapa
''			If FT Then
''				Private vSalir As Int
''				Dim bmp1 As Bitmap
''				bmp1 = LoadBitmap(File.DirAssets, "exit.png")
''				Dim tx As String = "¿Desea agregar un segundo contador? "
''
''				vSalir = Msgbox2(tx, "Confirmar", "Si", "", "No", Null)
''				If vSalir = DialogResponse.POSITIVE Then
''					TipCon = "2"
''					Contadores
''					Return
''				Else
''					Btn_Guardar1_Click
''				End If
''			End If
''			Btn_Guardar1_Click
''				
''			Return
''		Else
''		End If
''	End If
''	If TipCon = "2" Then
''		If FT Then 
''			
''			
''		End If
''		Private vSalir As Int
''		Dim bmp1 As Bitmap
''		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
''		Dim tx As String = "¿Estás seguro de que deseas seleccionar a: " & mapa.Get("Nombre") & "?"
''
''		vSalir = Msgbox2(tx, "Confirmar", "Si", "", "No", Null)
''		
'''		Dim bmp1 As Bitmap
'''		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'''		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'''		Wait For Msgbox_Result (vSalir As Int)
''		
''		If vSalir = DialogResponse.POSITIVE Then
''			Contador2 = mapa
''			
''			Btn_Guardar1_Click
''			
''			
''			Return
''		Else
''		End If
''	
''		
''	End If
''	
'End Sub

Private Sub Btn_CerrarMenu_Click
	
	drawer.LeftOpen = False
	
End Sub

Private Sub Btn_ElCon_Click
	
	Btn_ElCon.Visible = False
	
	Contador2.Clear
	Contador2.Put("Rut", " ")
	Contador2.Put("Nombre", "")
	
	wait for(Contadores) complete(r As Int)

End Sub

Private Sub Btn_Guardar1_Click

	dialog.Close(xui.DialogResponse_Positive)

End Sub

Private Sub Btn_EditarC2_Click
	
	dialog.Close(11)
	
	Map1Aux.Put("Rut", Contador1.Get("Rut"))
	Map1Aux.Put("Nombre", Contador1.Get("Nombre"))
	
	Map2Aux.Put("Rut", Contador2.Get("Rut"))
	Map2Aux.Put("Nombre", Contador2.Get("Nombre"))
	
	Map1Aux.Put("Id", Contador1.Get("Id"))
	Map2Aux.Put("Id", Contador2.Get("Id"))
	
	TipCon = "2"
	
	wait for(Contadores) complete(r As Int)

End Sub

Private Sub List_Contador1_ItemClick (Index As Int, Value As Object)

	Dim p As B4XView  = List_Contador1.GetPanel(Index)
	Dim mapa As Map = p.tag

	If TipCon = "1"  Then
		
		Private vSalir As Int
		Dim bmp1 As Bitmap
		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
		Dim tx As String = "¿Estás seguro de que deseas seleccionar a: " & mapa.Get("Nombre") & "?"

		vSalir = Msgbox2(tx, "Confirmar", "Si", "", "No", Null)
		
'		Dim bmp1 As Bitmap
'		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'		Wait For Msgbox_Result (vSalir As Int)
		
		If vSalir = DialogResponse.POSITIVE Then

			Contador1 = mapa
			

			If FT Then

				Private vSalir As Int
				Dim bmp1 As Bitmap
				bmp1 = LoadBitmap(File.DirAssets, "exit.png")
				Dim tx As String = "¿Desea agregar un segundo contador? "

				vSalir = Msgbox2(tx, "Confirmar", "Si", "", "No", Null)

				If vSalir = DialogResponse.POSITIVE Then

					TipCon = "2"
					Contadores
					Return

				Else

					Btn_Guardar1_Click

				End If
			Else
				listaObjetos.Put("C1",Contador1)
				Dim jeison As JSONGenerator
				jeison.Initialize(listaObjetos)
				Dim ts As String  = jeison.ToPrettyString(1)
				Dim rutaArchivo As String = DBUtils.GetDBFolder
				Dim nombreArchivo As String = "miMapa.txt"
			
				File.WriteString(rutaArchivo, nombreArchivo, ts)
'			/*/
				If File.Exists(rutaArchivo, nombreArchivo) Then
					Log("Creado")
				End If
			End If
			
			Btn_Guardar1_Click
				
			Return
		Else

		End If

	End If

	If TipCon = "2" Then
		Btn_Guardar1.Visible = True 
		If FT Then
			
			
		End If

		Private vSalir As Int
		Dim bmp1 As Bitmap

		bmp1 = LoadBitmap(File.DirAssets, "exit.png")
		Dim tx As String = "¿Estás seguro de que deseas seleccionar a: " & mapa.Get("Nombre") & "?"

		vSalir = Msgbox2(tx, "Confirmar", "Si", "", "No", Null)
		
'		Dim bmp1 As Bitmap
'		bmp1 = LoadBitmap(File.DirAssets, "ok_button.png")
'		Msgbox2Async("¿Estas seguro de cerrar la aplicación?" , "S A L I R", "Si", "", "No", bmp1, False)
'		Wait For Msgbox_Result (vSalir As Int)
		
		If vSalir = DialogResponse.POSITIVE Then
			If FT  Then 
				
				Contador2 = mapa
			
				Btn_Guardar1_Click
			Else
				Contador2 = mapa
			
				Btn_Guardar1_Click
				listaObjetos.Put("C2",Contador1)
				Dim jeison As JSONGenerator
				jeison.Initialize(listaObjetos)
				Dim ts As String  = jeison.ToPrettyString(1)
				Dim rutaArchivo As String = DBUtils.GetDBFolder
				Dim nombreArchivo As String = "miMapa.txt"
			
				File.WriteString(rutaArchivo, nombreArchivo, ts)
'			/*/
				If File.Exists(rutaArchivo, nombreArchivo) Then
					Log("Creado")
				End If
			End If
			
						
			Return
		
		Else
		
		End If
	
	End If
	
End Sub

Private Sub Btn_InfoPRodsBusc_Click
	
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, Activity.Width, Activity.Height)
	p.LoadLayout("Vista_Buscar_Objeto")
	
	dialog.PutAtTop = True
	dialog.Title = "Buscador de productos"
	
	Spinner2.AddAll(Array As String("Descripcion","Principal","Tecnico","Rapido"))
	Spinner2.SelectedIndex = cache_spinner2
	
	auxspin = Spinner2.SelectedItem
	
	Iniciado = True
	
	If UltBuscado <> "" Then 
	
		Wait for(Buscar_x_Comentario(auxspin, UltBuscado, Me)) Complete(ac As Int)
			
	End If
	
	Wait For (dialog.ShowCustom(p, "", "", "")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		
		
	End If
	
	Iniciado = False
End Sub

Private Sub Btn_VolverOBS2_Click
	
	dialog.Close(xui.DialogResponse_Cancel)
	
End Sub

Private Sub Spinner2_ItemClick (Position As Int, Value As Object)
	
	auxspin = Spinner2.SelectedIndex

End Sub

Private Sub List_Objs_ItemLongClick (Index As Int, Value As Object)
	
	Dim bmp1 As Bitmap
	Dim x As B4XView = List_Objs.GetPanel(Index)
	Dim straux As String = x.Tag
	
	Dim mapaux As Map
	Dim Js As HttpJob = Bsc(auxspin, straux, Me)
'		
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
			
		If  vJson = $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
				
			Dim bmp1 As Bitmap
			
			Msgbox2Async("Producto no encontrado en la base de datos.", "Error", "OK", "", "", Null, False)
			Wait For Msgbox_Result (Result5 As Int)
			
			If Result5 = DialogResponse.POSITIVE Then
			End If

			Return
		
				
		End If
				
		Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
		Dim fila As Map = Filas.Get(0)
		Dim Codigo As  String = fila.Get(auxspin)
		Dim bmp1 As Bitmap

		
		If Buscar Then 
			
			Dim tx As String = "¿Desea Ver info del item: "&Codigo&"?"
			
			Else 
				
			Dim tx As String = "¿Desea agregar el item: "&Codigo&"?"
			
				
		End If

		Msgbox2Async(tx, "Confirmacion", "Si", "", "No", Null, False)
		Wait For Msgbox_Result (Result5 As Int)
			
		If Result5 = DialogResponse.POSITIVE Then
			
			Dim InfoProd As Map = fila
			
			Dim z As B4XView = xui.CreatePanel("")
			Dim bmp1 As Bitmap

			If Buscar Then

				z.SetLayoutAnimated(0, 0, 0, 300dip, 500dip)
				
				z.LoadLayout("info_prod")
			
				bmp1 = LoadBitmap(File.DirAssets, "question.png")
			
				dialog.Title = ""
				
				Lbl_SpFm.Text  =	InfoProd.Get("NombreSuper")
				Lbl_Fm.Text  =	InfoProd.Get("NombreFamilia")
				Lbl_SbFm.Text= 	InfoProd.Get("NombreSub")
				Lbl_codprincipal.Text = InfoProd.Get("Principal")
				Lbl_stockInfo.Text = InfoProd.Get("StFisicoUd1")
				Lbl_Marca.Text = InfoProd.Get("MARCA")
				Lbl_descI.Text =  InfoProd.Get("Descripcion")
				Lbl_precio.Text =  "$"&InfoProd.Get("PrecioListaUd1")

				Wait For (dialog.ShowCustom(z, "", "", "")) Complete (Eleccion As Int)

				If Eleccion = xui.DialogResponse_Positive Then
					
					Btn_InfoPRodsBusc_Click
										
				Else
					
					Btn_InfoPRodsBusc_Click
					
				End If
				
				Else 
					
				Crear(Filas,Codigo)
				
			End If
'			z.SetLayoutAnimated(0, 0, 0, 300dip, 500dip)
'			
'			z.LoadLayout("info_prod")
'			
'			bmp1 = LoadBitmap(File.DirAssets, "question.png")
'			
'			dialog.Title = ""
'			
'			Lbl_SpFm.Text  =	InfoProd.Get("NombreSuper")
'			Lbl_Fm.Text  =	InfoProd.Get("NombreFamilia")
'			Lbl_SbFm.Text= 	InfoProd.Get("NombreSub")
'			Lbl_codprincipal.Text = InfoProd.Get("Principal")
'			Lbl_stockInfo.Text = InfoProd.Get("StFisicoUd1")
'			Lbl_Marca.Text = InfoProd.Get("MARCA")
'			Lbl_descI.Text =  InfoProd.Get("Descripcion")
'			Lbl_precio.Text =  "$"&InfoProd.Get("PrecioListaUd1")
'			Wait For (dialog.ShowCustom(z, "", "", "")) Complete (Eleccion As Int)
'			If Eleccion = xui.DialogResponse_Positive Then
'				Btn_InfoPRodsBusc_Click
'				Else 
'				Btn_InfoPRodsBusc_Click
'				
'			
'		
'			
'			End If
		
		End If
		
	Else 
		desconectado

		Return
	End If
	
End Sub

Private Sub Buscar_x_Comentario(Tipo As String, VDescripcion As String, Me_ As Object) As ResumableSub 'HttpJob
	
	List_Objs.Clear
		
	Dim vCadena As String
	UltBuscado = VDescripcion
	vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescripcion, "Mp.KOPR+Mp.NOKOPR" & " LIKE '%","")

'	Lv_Productos.Clear

	'B4XLoading.Show

	Dim Consulta_Sql As String
	
	Dim Empresa As String = Inventario_Activo.Empresa
	Dim Sucursal As String = Inventario_Activo.Sucursal
	Dim Bodega As String = Inventario_Activo.Bodega
	Dim Consul As String  = ""
	
	If auxspin = "Tecnico" Then 
		
		Consul = "WHERE Mp.KOPRTE  Like '%" & vCadena & "%'"
		
	else if auxspin = "Rapido" Then 
		
		Consul = "WHERE Mp.KOPRRA  Like '%" & vCadena & "%'"
	  
	Else if auxspin = "Principal" Then 
		
		Consul = "WHERE Mp.KOPR  Like '%" & vCadena & "%'"
			
	Else if auxspin = "Descripcion" Then 
		
		Consul = "WHERE Mp.NOKOPR  Like '%" & vCadena & "%'"
		
	End If
'	Consulta_Sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
'                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
'                   "From MAEPR Mp With (Nolock)" & CRLF & _
'				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
'				   		"' And Ms.KOSU = '" & Sucursal & _
'						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
'				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
'				   		"' And Tb.KOSU = '" & Sucursal & _
'						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
'                   "WHERE Mp.KOPR+Mp.NOKOPR  Like '%" & vCadena & "%'" & CRLF & _
'                   "Order by Mp.KOPR" & CRLF & _
	'                   "Option ( Fast 20 )"
'				   
'	Consulta_Sql = "SELECT TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
'                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
'                   "From MAEPR Mp With (Nolock)" & CRLF & _
'				   "Left Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
'				   		"' And Ms.KOSU = '" & Sucursal & _
'						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
'				   "Left Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
'				   		"' And Tb.KOSU = '" & Sucursal & _
'						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR" & CRLF & _
'                   Consul & CRLF & _
'                   "Order by Mp.KOPR" & CRLF & _
	'                   "Option ( Fast 25 )"
'				   
	Consulta_Sql = "SELECT TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO," & CRLF & _
                   "Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC" & CRLF & _
                   "From MAEPR Mp With (Nolock)" & CRLF & _
				   "RIGHT Join MAEST Ms On Ms.EMPRESA = '" & Empresa & _
				   		"' And Ms.KOSU = '" & Sucursal & _
						"' AND Ms.KOBO = '" & Bodega & "' AND Mp.KOPR = Ms.KOPR" & CRLF & _
				   "RIGHT Join TABBOPR Tb On Tb.EMPRESA = '" & Empresa & _
				   		"' And Tb.KOSU = '" & Sucursal & _
						"' AND Tb.KOBO = '" & Bodega & "' AND Tb.KOPR = Ms.KOPR " & CRLF & _
						"RIGHT JOIN BAKAPP_PRB.dbo.Zw_Inv_FotoInventario FT ON FT.Codigo = Mp.KOPR And FT.IdInventario =  '" & Inventario_Activo.Id & "'  AND FT.Empresa = '"&Inventario_Activo.Empresa&"' And FT.Sucursal = '" &Inventario_Activo.Sucursal &"' And FT.Bodega = '"&Inventario_Activo.Bodega&"' " & CRLF & _
                   Consul & CRLF & _
                   "Order by Mp.KOPR" & CRLF & _
                   "Option ( Fast 25 )"
				   
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
			
'				Dim Codigo As String = Fila.Get("CODIGO")
'				Dim CODTECNICO As String = Fila.Get("CODTECNICO")
'				Dim STFI1 As Double  = Fila.Get("STFI1")
'				Dim DESCRIPCION As String = Fila.Get("DESCRIPCION")
												
'				Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'		
'			
				Dim v As B4XView = xui.CreatePanel("")
				v.SetLayoutAnimated(100,0,0,List_Objs.AsView.Width,200dip)
				v.LoadLayout("Vista_ObjBuscado")
				v.Color = Colors.Black
				
				v.Tag = Fila.Get("CODIGO")
				auxspin = "Principal"
				Lbl_CodPBSC.Text =  Fila.Get("CODIGO")
				Lbl_CodRapBSC.Text =  Fila.Get("RAPIDO")
				Lbl_CodTecBSC.Text = Fila.Get("CODTECNICO")
				Lbl_DescBSC.Text =  Fila.Get("DESCRIPCION")
				List_Objs.Add(v,"")
				
		
				
			Next
			
'			Log(Codigo & " - " & DESCRIPCION)
'			
		Else
		
			ToastMessageShow("No se encontraron registros",False)
			
		End If
	Else 
		desconectado
		Return 0
	End If

'	B4XLoading.Hide
	ProgressDialogHide
	
	Return 1
	
	
'	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
'<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
'  <soap:Body>
'    <Sb_Inv_TraerProductoInventarioComentario xmlns="http://BakApp">
'      <_IdInventario>$Xml{Inventario_Activo.Id}</_IdInventario>
'      <_Empresa>$Xml{Inventario_Activo.Empresa}</_Empresa>
'      <_Sucursal>$Xml{Inventario_Activo.Sucursal}</_Sucursal>
'      <_Bodega>$Xml{Inventario_Activo.Bodega}</_Bodega>
'      <_Tipo>$Xml{Tipo}</_Tipo>
'      <_Codigo>$Xml{Codigo}</_Codigo>
'    </Sb_Inv_TraerProductoInventarioComentario>
'  </soap:Body>
'</soap:Envelope>
'"$
'	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
'	Dim Js As HttpJob
'	
'	Js.Initialize("",Me_)'
'	Js.PostString(PostString,vXml)
'	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
'	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Inv_TraerProductoInventarioComentario""$)
'	
'	Return Js
	
End Sub

Private Sub Btn_BuscarObj_Click
	
	Dim p As Phone
	
	p.HideKeyboard(Activity)
	cache_spinner2 = Spinner2.SelectedIndex
	
	Private vSalir As Int
	Dim x As B4XView = xui.CreatePanel("")

	x.SetLayoutAnimated(0, 0, 0, 350dip, 380dip)
	x.LoadLayout("Vista_ObjBuscado")
	
	auxspin = Spinner2.SelectedItem
	
	Dim Codigo As String = Txt_BuscObjs.Text
		
	wait for (Buscar_x_Comentario(auxspin,Codigo, Me)) complete(ac As Int)
		
'	Dim Js As HttpJob = Buscar_x_Comentario(auxspin, Codigo, Me)
''		
'	Wait For (Js) JobDone(Js As HttpJob)
'		
'	If Js.Success Then
'	
'		Dim vJson As String = Js.GetString
'			
'		If  vJson = $"{"Table":[{"Codigo":"Error_No hay ninguna fila en la posición 0.","Version":"1.0.0.35"}]}"$ Then
'				
'	
'				
'		End If
'				
'		Dim	Filas As List = Funciones.Fx_DataTable(Js.GetString)
'		For i = 0 To Filas.Size - 1
'			Dim fila As Map = Filas.Get(i)
'			Dim v As B4XView = xui.CreatePanel("")
'			v.SetLayoutAnimated(100,0,0,List_Contador1.AsView.Width,200dip)
'			v.LoadLayout("Vista_ObjBuscado")
'			v.Color = Colors.Black
'			
'			v.Tag = fila
'			auxspin = "Principal"
'			Lbl_CodPBSC.Text =  fila.get("Principal")
'			Lbl_CodRapBSC.Text =  fila.get("Rapido")
'			Lbl_CodTecBSC.Text =  fila.get("Tecnico")
'			Lbl_DescBSC.Text =  fila.get("Descripcion")
'			List_Objs.Add(v,"")
'			
'
'		Next
'	End If
End Sub

Private Sub Txt_BuscObjs_EnterPressed
	
	Btn_BuscarObj_Click
	
End Sub


Private Sub Btn_BuscarPorDes_Click
	
	Buscar = False
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, Activity.Width, Activity.Height)
	p.LoadLayout("Vista_Buscar_Objeto")
	
	dialog.PutAtTop = True
	dialog.Title = "Buscador de productos"
	
	Spinner2.AddAll(Array As String("Descripcion","Principal","Tecnico","Rapido"))
	Spinner2.SelectedIndex = cache_spinner2
	
	Iniciado = True
	
	If UltBuscado <> "" Then
	
		Buscar_x_Comentario(auxspin, UltBuscado, Me)
		
	End If
	
	Wait For (dialog.ShowCustom(p, "", "", "")) Complete (Result As Int)
	
	If Result = xui.DialogResponse_Positive Then
		
	End If
	
	Iniciado = False

End Sub

Private Sub desconectado
	
	Msgbox2Async("Se ha perdido la conexion, No cierre el programa o se perderan los datos.", "Intente Reconectar", "Probar Conexion", "", "", Null, False)
	Wait For Msgbox_Result (Result5 As Int)
	If Result5 = DialogResponse.POSITIVE Then 
		wait for(intentar) complete(r As Int)
		Return
	End If
	 		
End Sub
private Sub intentar As ResumableSub
	Dim Consulta_Sql As String 
	Consulta_Sql = "Select Top 1 EMPRESA From CONFIES"
	ProgressDialogShow("Probando conexión")
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			ProgressDialogHide
				
			Dim bmp1 As Bitmap = LoadBitmap(File.DirAssets, "ok_button.png")
				
			Msgbox2Async("Conexion existosa" , "Conexión WebService", "Ok", "", "",bmp1, False)
			Wait For Msgbox_Result (Result As Int)
		
			
		
			'DBUtils.UpdateRecord(Variables.vSql,"Conf_Local","Ip_Webservice",Variables.Global_Ip_WebService,CreateMap("IdDispositivo": Variables.Global_IdDispositivo ))
			'DBUtils.UpdateRecord(Variables.vSql,"Conf_Local","Ip_Webservice",Variables.Global_Ip_WebService,CreateMap("IdDispositivo": Variables.Global_IdDispositivo ))
					
			'Activity.Finish
			
		End If
	Else
		desconectado
		
	End If
	
	Return 1
	
End Sub

Private Sub rellenar(Mapa As Map )  As ResumableSub
	SectInfo = Mapa.Get("Sector")
	Dim listaAux As List =  Mapa.Get("Lista")
	detalles = Mapa.Get("Lista")
	listaObjetos = Mapa
	Contador1 = Mapa.Get("C1")
	Contador2 = Mapa.Get("C2")
	Lbl_sector.Text = SectInfo.Get("Sector")
	Panelbus.Visible = True
	Lbl_contador.Text = listaAux.Size
	Btn_Menu.Visible = True 
	Btn_esc_sector.Visible = False
	For i = 0 To listaAux.Size - 1
		Dim Info As Map = listaAux.Get(i)
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.Width,160dip)
		p.LoadLayout("vista_item")
		p.Color = Colors.Black
		Dim fila As Map  = 	Info.Get("infoP")
		Lbl_cod.Text = Info.Get("cod")
			
		Lbl_tipcod.Text = Info.Get("tipo")
		Lbl_can.Text = Info.Get("can")
			
		Lbl_desc.Text = Info.Get("desc")
		Lbl_ActPos.Text	= String0(XclvDetalle.Size + 1)
			
		If Lbl_desc.Text.Length >= 25 Then
			' Inserta un espacio en la posición 24
			Dim newString As String = Lbl_desc.Text.SubString2(0, 25) &  CRLF  & Lbl_desc.Text.SubString(25)
			Lbl_desc.Text = newString
		
		End If
			
		Btn_observaciones.Tag = Info.Get("Obs")
			
		p.Tag = CreateMap("cod": Lbl_cod.Text, "desc": Lbl_desc.Text, "can": Lbl_can, "tipo": Lbl_tipcod.Text,"pos": Lbl_ActPos ,"infoP": fila, "Obs": Btn_observaciones )
			
		XclvDetalle.Add(p,"")
		
		
		
	Next
	Return 1
End Sub