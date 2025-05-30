B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=StaticCode
Version=7.01
@EndOfDesignText@
'DBUtils
' Version 2.02
Sub Process_Globals
	
	Public DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT,DB_DATE,DB_DOUBLE,DB_BOOLEAN As String
	
	DB_REAL = "REAL"
	DB_INTEGER = "INTEGER"
	DB_BLOB = "BLOB"
	DB_TEXT = "TEXT"
	DB_DATE = "DATE"
	DB_DOUBLE = "DOUBLE"
	DB_BOOLEAN = "BOOLEAN"
	
	Private HtmlCSS As String = $"
		table {width: 100%;border: 1px solid #cef;text-align: left; }
		th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }
		td,th {	padding: 4px 5px; }
		.odd {background-color: #def; } 
		.odd td {border-bottom: 1px solid #cef; }
		a { text-decoration:none; color: #000;}"$
End Sub

#if B4J
''Returns the path to a folder where you can create a database, preferably on the secondary storage.
'Public Sub GetDBFolder (AppName As String) As String
'	Return File.DirData(AppName)
'End Sub
'
''Copies a database file that was added in the Files tab. The database must be copied to a writable location.
''This method copies the database to the storage card. If the storage card is not available the file is copied to the internal folder.
''The target folder is returned.
''If the database file already exists then no copying is done.
'Public Sub CopyDBFromAssets (FileName As String, AppName As String) As String
'	Dim TargetDir As String = GetDBFolder(AppName)
'	If File.Exists(TargetDir, FileName) = False Then
'		File.Copy(File.DirAssets, FileName, TargetDir, FileName)
'	End If
'	Return TargetDir
'End Sub

#Else
'Devuelve la ruta a una carpeta donde puede crear una base de datos, preferiblemente en el almacenamiento secundario.
Public Sub GetDBFolder As String
#If B4A
	Dim rp As RuntimePermissions
	If File.ExternalWritable Then
		Return rp.GetSafeDirDefaultExternal("")
	Else 
		Return File.DirInternal
	End If
#Else If B4i
	Return File.DirDocuments
#End If
End Sub

'Copia un archivo de base de datos que se agregó en la pestaña Archivos. La base de datos debe copiarse a una ubicación de escritura.
'Este método copia la base de datos a la tarjeta de almacenamiento. Si la tarjeta de almacenamiento no está disponible, el archivo se copia en la carpeta interna.
'Se devuelve la carpeta de destino.
'Si el archivo de la base de datos ya existe, entonces no se realiza ninguna copia.
Public Sub CopyDBFromAssets (FileName As String) As String
	Dim TargetDir As String = GetDBFolder
	If File.Exists(TargetDir, FileName) = False Then
		File.Copy(File.DirAssets, FileName, TargetDir, FileName)
	End If
	Return TargetDir
End Sub

#End If

Private Sub EscapeField(f As String) As String
	Return "[" & f & "]"
End Sub

#If B4i
''Creates a new table with the given name.
''FieldsAndTypes - A map with the fields names as keys and the types as values.
''You can use the DB_... constants for the types.
''PrimaryKey - The column that will be the primary key. Pass empty string if not needed.
'Public Sub CreateTable(SQL As SQL, TableName As String, Fields As List, Types As List, PrimaryKey As String)
'	Dim sb As StringBuilder
'	sb.Initialize
'	sb.Append("(")
'	For i = 0 To Fields.Size - 1
'		If i > 0 Then sb.Append(", ")
'		sb.Append("[").Append(Fields.Get(i)).Append("] ").Append(Types.Get(i))
'		If Fields.Get(i) = PrimaryKey Then sb.Append(" PRIMARY KEY")
'	Next
'	sb.Append(")")
'	Dim query As String
'	query = "CREATE TABLE IF NOT EXISTS [" & TableName & "] " & sb.ToString
'	Log("CreateTable: " & query)
'	SQL.ExecNonQuery(query)
'End Sub
#Else

'Crea una nueva tabla con el nombre de pila.
'FieldsAndTypes: un mapa con los nombres de los campos como claves y los tipos como valores.
'Puede usar las constantes DB _... para los tipos.
'PrimaryKey - La columna que será la clave principal. Pase cadena vacía si no es necesario.
Public Sub CreateTable(SQL As SQL, TableName As String, FieldsAndTypes As Map, PrimaryKey As String)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("(")
	For i = 0 To FieldsAndTypes.Size - 1
		Dim field, ftype As String
		field = FieldsAndTypes.GetKeyAt(i)
		ftype = FieldsAndTypes.GetValueAt(i)
		If i > 0 Then sb.Append(", ")
		sb.Append(EscapeField(field)).Append(" ").Append(ftype)
		If field = PrimaryKey Then sb.Append(" PRIMARY KEY")
	Next
	sb.Append(")")
	Dim query As String = "CREATE TABLE IF NOT EXISTS " & EscapeField(TableName) & " " & sb.ToString
	Log("CreateTable: " & query)
	SQL.ExecNonQuery(query)
End Sub
#End If

'Elimina la tabla dada.
Public Sub DropTable(SQL As SQL, TableName As String)
	Dim query As String = "DROP TABLE IF EXISTS" & EscapeField(TableName)
	Log("DropTable: " & query)
	SQL.ExecNonQuery(query)
End Sub

'Inserta los datos en la mesa.
'ListOfMaps - Una lista con mapas como elementos. Cada mapa representa un registro donde las claves del mapa son los nombres de las columnas
'y los valores de los mapas son los valores.
'Tenga en cuenta que debe crear un nuevo mapa para cada registro (esto puede hacerse llamando a Dim para redirigir el mapa).

Public Sub InsertMaps(SQL As SQL, TableName As String, ListOfMaps As List)
	Dim sb, columns, values As StringBuilder
	'Pequeño check para un error común donde se usa el mismo mapa en un bucle, esto evita insertar un registro duplicado
	If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = ListOfMaps.Get(1) Then
		Log("Mismo mapa encontrado dos veces en la lista. Cada elemento de la lista debe incluir un objeto de mapa diferente.")
		Return
	End If
	SQL.BeginTransaction
	Try
		For i1 = 0 To ListOfMaps.Size - 1
			sb.Initialize
			columns.Initialize
			values.Initialize
			Dim listOfValues As List
			listOfValues.Initialize
			sb.Append("INSERT INTO [" & TableName & "] (")
			Dim m As Map = ListOfMaps.Get(i1) ' Convertimos el primer registro de la lista en un Map (Row)
			For Each col As String In m.Keys ' Recorremos las columnas del Map (nuestra tabla) y obtenemos el nombre de las columna en la variable col
				Dim value As Object = m.Get(col) ' Extraemos el valor de la celda con el nombre de la columna (col)
				If listOfValues.Size > 0 Then
					columns.Append(", ")
					values.Append(", ")
				End If
				columns.Append(EscapeField(col)) ' En esta variable se va creando la cadena con los nombres de las columnas
				values.Append("?")               ' En esta variable se va creando la cadena con los ? (datos de las columnas) 
				listOfValues.Add(value)          ' En esta variable se va creando la lista con los valores de los datos de la fila 
			Next
			sb.Append(columns.ToString).Append(") VALUES (").Append(values.ToString).Append(")") ' Se concatena todo y se crea una consulta SQL para insertar los datos del registro.
			If i1 = 0 Then Log("InsertMaps (first query out of " & ListOfMaps.Size & "): " & sb.ToString)
			SQL.ExecNonQuery2(sb.ToString, listOfValues) ' Se inserta la fila en la tabla SQL
		Next
		SQL.TransactionSuccessful
	Catch
		Log(LastException)
		#If B4i OR B4J
		SQL.Rollback
		#End If
	End Try
#If B4A
	SQL.EndTransaction
#End If
End Sub




'Ejecuta la consulta y devuelve el resultado como una lista de matrices.
'Cada elemento de la lista es una matriz de cadenas.
'StringArgs - Valores para reemplazar signos de interrogación en la consulta. Pase nulo si no es necesario.
'Límite - Limita los resultados. Pase 0 para todos los resultados.
Public Sub ExecuteMemoryTable(SQL As SQL, Query As String, StringArgs() As String, Limit As Int) As List
	Dim cur As ResultSet
	If StringArgs = Null Then
		Dim StringArgs(0) As String
	End If
	cur = SQL.ExecQuery2(Query, StringArgs)
	Log("ExecuteMemoryTable: " & Query)
	Dim table As List
	table.Initialize
	Do While cur.NextRow
		Dim values(cur.ColumnCount) As String
		For col = 0 To cur.ColumnCount - 1
			values(col) = cur.GetString2(col)
		Next
		table.Add(values)
		If Limit > 0 And table.Size >= Limit Then Exit
	Loop
	cur.Close
	Return table
End Sub

'Ejecuta la consulta y devuelve un mapa con los nombres de las columnas como claves
'y los primeros valores de registro Como los valores de las entradas.
'Las llaves tienen una carcasa inferior.
'Devuelve un mapa no inicializado si no hay resultados.
 Public Sub ExecuteMap(SQL As SQL, Query As String, StringArgs() As String) As Map
	Dim res As Map
	Dim cur As ResultSet
	If StringArgs <> Null Then
		cur = SQL.ExecQuery2(Query, StringArgs)
	Else
		cur = SQL.ExecQuery(Query)
	End If
	Log("ExecuteMap: " & Query)
	If cur.NextRow = False Then
		Log("No records found.")
		Return res
	End If
	res.Initialize
	For i = 0 To cur.ColumnCount - 1
		res.Put(cur.GetColumnName(i).ToLowerCase, cur.GetString2(i))
	Next
	cur.Close
	Return res
End Sub

#if B4A
'Ejecuta la consulta y llena el Spinner con los valores en la primera columna
Sub ExecuteSpinner(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, Spinner1 As Spinner)
	Spinner1.Clear
	Dim Table As List
	Table = ExecuteMemoryTable(SQL, Query, StringArgs, Limit)
	   
	Dim Cols() As String
	For i = 0 To Table.Size - 1
		Cols = Table.Get(i)
		Spinner1.Add(Cols(0))
	Next
End Sub

'Ejecuta la consulta y llena el ListView con el valor.
'Si TwoLines es verdadero, la primera columna se mapea a la primera línea y la segunda columna se mapea
'a la segunda línea.
'En ambos casos, el valor establecido en la fila es la matriz con todos los valores de registros.
Public Sub ExecuteListView(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, ListView1 As ListView, _
	TwoLines As Boolean)
	ListView1.Clear
	Dim Table As List
	Table = ExecuteMemoryTable(SQL, Query, StringArgs, Limit)
	Dim Cols() As String
	For i = 0 To Table.Size - 1
		Cols = Table.Get(i)
		If TwoLines Then
			ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)
		Else
			ListView1.AddSingleLine2(Cols(0), Cols)
		End If
	Next
End Sub

Public Sub ExecuteListView_Detalle_Productos(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, ListView1 As ListView)
	ListView1.Clear
	Dim Table As List
	Table = ExecuteMemoryTable(SQL, Query, StringArgs, Limit)
	Dim Cols() As String
	For i = 0 To Table.Size - 1
		Cols = Table.Get(i)

		Dim Codigo As String = Cols(0)
		Dim Descripcion As String = Cols(1)
		
		Dim Cantidad As String  =  NumberFormat(Cols(2),0,2)
		Dim Precio As String  = "$ " &  NumberFormat(Cols(3),0,2)
		Dim descuentoporc As String = NumberFormat(Cols(4),0,2)
		Dim valnetolinea As String = "$ " &  NumberFormat(Cols(5),0,2)
												
		If Descripcion.Length > 35 Then
			Descripcion = Funciones.Mid(Descripcion,1,35)
		End If
		
		If Cols(4) = 0 Then			
			descuentoporc = " "
		Else
			descuentoporc = " -%." & descuentoporc & " "
		End If
											
		Dim Item = i+1
		Dim ItemStr As String = Funciones.Rellenar_Izquierda(Item,2,"0")
													
		Dim vDetalle As String = Descripcion & "..." & CRLF & "Item: " & ItemStr & " Cant. " & Cantidad & " " & " X " & Precio & descuentoporc & "Total: " & valnetolinea
					
		ListView1.AddTwoLines(Codigo,vDetalle)

	Next

End Sub


#Else If B4J
'Public Sub ExecuteTableView(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, _
'	TableView1 As TableView)
'	TableView1.Items.Clear
'	Dim cur As ResultSet
'	If StringArgs = Null Then
'		Dim StringArgs(0) As String
'	End If
'	cur = SQL.ExecQuery2(Query, StringArgs)
'	Dim cols As List
'	cols.Initialize
'	For i = 0 To cur.ColumnCount - 1
'		cols.Add(cur.GetColumnName(i))
'	Next
'	TableView1.SetColumns(cols)
'	Do While cur.NextRow
'		Dim values(cur.ColumnCount) As String
'		For col = 0 To cur.ColumnCount - 1
'			values(col) = cur.GetString2(col)
'		Next
'		TableView1.Items.Add(values)
'		If Limit > 0 And TableView1.Items.Size >= Limit Then Exit
'	Loop
'	cur.Close
'End Sub
#End If

'Ejecuta la consulta y rellena la lista dada con los valores en la primera columna.
Public Sub ExecuteList2(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, List As List)
	List.Clear
	List.AddAll(ExecuteList(SQL, Query, StringArgs, Limit))
End Sub

'Ejecuta la consulta y devuelve una lista con los valores en la primera columna.
Public Sub ExecuteList(SQL As SQL, Query As String, StringArgs() As String, Limit As Int) As List
	Dim Table As List = ExecuteMemoryTable(SQL, Query, StringArgs, Limit)
	Dim res As List
	res.Initialize
	For Each Cols() As String In Table
		res.Add(Cols(0))
	Next
	Return res
End Sub

'Ejecuta la consulta dada y crea un Mapa que puede pasar a JSONGenerator y generar texto JSON.
'DBTypes: enumera el tipo de cada columna en el conjunto de resultados.
'Ejemplo de uso: (no olvide agregar una referencia a la biblioteca JSON)
'	Dim gen As JSONGenerator
'	gen.Initialize(DBUtils.ExecuteJSON(SQL, "SELECT Id, Birthday FROM Students", Null, _
'		0, Array As String(DBUtils.DB_TEXT, DBUtils.DB_INTEGER)))
'	Dim JSONString As String
'	JSONString = gen.ToPrettyString(4)
'	Msgbox(JSONString, "")
Public Sub ExecuteJSON (SQL As SQL, Query As String, StringArgs() As String, Limit As Int, DBTypes As List) As Map
	Dim table As List
	Dim cur As ResultSet
	If StringArgs <> Null Then
		cur = SQL.ExecQuery2(Query, StringArgs)
	Else
		cur = SQL.ExecQuery(Query)
	End If
	Log("ExecuteJSON: " & Query)
	Dim table As List
	table.Initialize
	Do While cur.NextRow
		Dim m As Map
		m.Initialize
		For i = 0 To cur.ColumnCount - 1
			Select DBTypes.Get(i)
				Case DB_TEXT
					m.Put(cur.GetColumnName(i), cur.GetString2(i))
				Case DB_INTEGER
					m.Put(cur.GetColumnName(i), cur.GetLong2(i))
				Case DB_REAL, DB_DOUBLE
					m.Put(cur.GetColumnName(i), cur.GetDouble2(i))
				Case DB_DATE
					Dim Fecha As String = DateTime.Date(cur.GetLong2(i))
					m.Put(cur.GetColumnName(i), Fecha)
				Case DB_BOOLEAN
					m.Put(cur.GetColumnName(i), cur.GetString2(i))
				Case Else
					Log("Invalid type: " & DBTypes.Get(i))
			End Select
		Next
		table.Add(m)
		If Limit > 0 And table.Size >= Limit Then Exit
	Loop
	cur.Close
	Dim root As Map
	root.Initialize
	root.Put("root", table)
	Return root
End Sub

'Crea un texto html que muestra los datos en una tabla.
'El estilo de la tabla puede modificarse modificando la variable HtmlCSS.
Public Sub ExecuteHtml(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, Clickable As Boolean) As String
	Dim cur As ResultSet
	If StringArgs <> Null Then
		cur = SQL.ExecQuery2(Query, StringArgs)
	Else
		cur = SQL.ExecQuery(Query)
	End If
	Log("ExecuteHtml: " & Query)
																														 
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("<html><body>").Append(CRLF)
	sb.Append("<style type='text/css'>").Append(HtmlCSS).Append("</style>").Append(CRLF)
	sb.Append("<table><thead><tr>").Append(CRLF)
	For i = 0 To cur.ColumnCount - 1
		sb.Append("<th>").Append(cur.GetColumnName(i)).Append("</th>")
	Next
	sb.Append("</thead>")
	
'	For i = 0 To cur.ColumnCount - 1
'		If i = 1 Then
'			sb.Append("<th style='width:200px;'>").Append(cur.GetColumnName(i)).Append("</th>")
'		Else
'			sb.Append("<th>").Append(cur.GetColumnName(i)).Append("</th>")
'		End If
'	Next
		
	sb.Append("</tr>").Append(CRLF)
	Dim row As Int
	Do While cur.NextRow
		If row Mod 2 = 0 Then
			sb.Append("<tr>")
		Else
			sb.Append("<tr class='odd'>")
		End If
		For i = 0 To cur.ColumnCount - 1
			sb.Append("<td>")
			If Clickable Then
				sb.Append("<a href='http://").Append(i).Append(".")
				sb.Append(row)
				
				Dim sValor = cur.GetString2(i)
			
				sb.Append(".stub'>").Append(sValor).Append("</a>")
			Else
				sb.Append(cur.GetString2(i))
			End If
			sb.Append("</td>")
		Next
		sb.Append("</tr>").Append(CRLF)
		row = row + 1
	Loop
	cur.Close
	sb.Append("</table></body></html>")
	Return sb.ToString
End Sub

Public Sub ExecuteHtml2(SQL As SQL, Query As String, StringArgs() As String, Limit As Int, Clickable As Boolean) As String
	Dim cur As ResultSet
	If StringArgs <> Null Then
		cur = SQL.ExecQuery2(Query, StringArgs)
	Else
		cur = SQL.ExecQuery(Query)
	End If
	Log("ExecuteHtml: " & Query)
																														 
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("<html><body>").Append(CRLF)
	sb.Append("<style type='text/css'>").Append(HtmlCSS).Append("</style>").Append(CRLF)
	sb.Append("<table><thead><tr>").Append(CRLF)
	For i = 0 To cur.ColumnCount - 1
		sb.Append("<th>").Append(cur.GetColumnName(i)).Append("</th>")
	Next
	sb.Append("</thead>")
	
'	For i = 0 To cur.ColumnCount - 1
'		If i = 1 Then
'			sb.Append("<th style='width:200px;'>").Append(cur.GetColumnName(i)).Append("</th>")
'		Else
'			sb.Append("<th>").Append(cur.GetColumnName(i)).Append("</th>")
'		End If
'	Next
		
	sb.Append("</tr>").Append(CRLF)
	Dim row As Int
	Do While cur.NextRow
		If row Mod 2 = 0 Then
			sb.Append("<tr>")
		Else
			sb.Append("<tr class='odd'>")
		End If
		For i = 0 To cur.ColumnCount - 1
			sb.Append("<td>")
			If Clickable Then
				sb.Append("<a href='http://").Append(i).Append(".")
				sb.Append(row)
				
				Dim sValor =cur.GetString2(i)
				Dim sValor_Str As String = sValor
									
				If  i = 3 Or i = 4 Or i = 5 Or i = 6 Then
				
					If IsNumber(sValor) Then
						
						sValor_Str = NumberFormat2( sValor, 0,2,2, True) 'returns, eg 1,234.15
						sValor_Str = sValor_Str.Replace(",", "*")  ' replaces , by *
						sValor_Str = sValor_Str.Replace(".", ",")  ' replaces . by ,
						sValor_Str = sValor_Str.Replace("*", ".")
						sValor_Str = sValor_Str.Replace(",00", "")
							
					End If
				
				End If
					
														
				sb.Append(".stub'>").Append(sValor_Str).Append("</a>")
			Else
				sb.Append(cur.GetString2(i))
			End If
			sb.Append("</td>")
		Next
		sb.Append("</tr>").Append(CRLF)
		row = row + 1
	Loop
	cur.Close
	sb.Append("</table></body></html>")
	Return sb.ToString
End Sub
'Obtiene la versión actual de la base de datos. Si la tabla DBVersion no existe, se crea y la actual
'versión está configurada en la versión 1.
Public Sub GetDBVersion (SQL As SQL) As Int
	Dim count, version As Int
	count = SQL.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'")
	If count > 0 Then
		version = SQL.ExecQuerySingleResult("SELECT version FROM DBVersion")
	Else
		'Create the versions table.
		#if B4i
			CreateTable(SQL, "DBVersion", Array("version"), Array(DB_INTEGER), "version")		
		#Else
		Dim m As Map = CreateMap("version": DB_INTEGER)
		CreateTable(SQL, "DBVersion", m, "version")
		#End If
		SQL.ExecNonQuery("INSERT INTO DBVersion VALUES (1)")
		version = 1
	End If
	Return version
End Sub

'Establece la versión de la base de datos en el número de versión proporcionado.
Public Sub SetDBVersion (SQL As SQL, Version As Int)
	SQL.ExecNonQuery2("UPDATE DBVersion set version = ?", Array As Object(Version))
End Sub

'actualiza un solo campo en un registro
'Campo es el nombre de la columna
Public Sub UpdateRecord(SQL As SQL, TableName As String, Field As String, NewValue As Object, _
		WhereFieldEquals As Map)
	UpdateRecord2(SQL, TableName, CreateMap(Field: NewValue), WhereFieldEquals)
End Sub

'actualiza múltiples campos en un registro
'en el mapa de Campos las claves son los nombres de las columnas
Public Sub UpdateRecord2(SQL As SQL, TableName As String, Fields As Map, WhereFieldEquals As Map)
	If WhereFieldEquals.Size = 0 Then
		Log("WhereFieldEquals map empty!")
		Return
	End If
	If Fields.Size = 0 Then
		Log("Fields empty")
		Return
	End If
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("UPDATE ").Append(EscapeField(TableName)).Append(" SET ")
	Dim args As List
	args.Initialize
	For Each col As String In Fields.Keys
		sb.Append(EscapeField(col)).Append("=?")
		sb.Append(",")
		args.Add(Fields.Get(col))
	Next
	sb.Remove(sb.Length - 1, sb.Length)
	sb.Append(" WHERE ")
	For Each col As String In WhereFieldEquals.Keys
		sb.Append(EscapeField(col)).Append(" = ?")
		sb.Append(" AND ")
		args.Add(WhereFieldEquals.Get(col))
	Next
	sb.Remove(sb.Length - " AND ".Length, sb.Length)
	Log("UpdateRecord: " & sb.ToString)
	SQL.ExecNonQuery2(sb.ToString, args)
End Sub


'borra un registro
Public Sub DeleteRecord(SQL As SQL, TableName As String, WhereFieldEquals As Map)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("DELETE FROM " & EscapeField(TableName) & " WHERE ")
	If WhereFieldEquals.Size = 0 Then
		Log("WhereFieldEquals map empty!")
		Return
	End If
	Dim args As List
	args.Initialize
	For Each col As String In WhereFieldEquals.Keys
		If args.Size > 0 Then sb.Append(" AND ")
		sb.Append(EscapeField(col)).Append(" = ?")
		args.Add(WhereFieldEquals.Get(col))
	Next
	Log("DeleteRecord: " & sb.ToString)
	SQL.ExecNonQuery2(sb.ToString, args)
End Sub

