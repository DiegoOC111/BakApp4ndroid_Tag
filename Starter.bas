B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=8.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
'	Public vSql As SQL
	
	'Dim sql1 As JdbcSQL
'	Dim MsSql As JdbcSQL
'	Dim sIP As String = "//186.67.37.218"
'	Dim sPort As String = ":1517"
'	Dim sDatabase As String = "SIERRALTA_PRB"
'	Dim sUser As String = "SIERRALTA_PRB"
'	Dim sPassword As String = "SIERRALTA_PRB"
	
End Sub

Sub Service_Create
	
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.

'	Dim vDirectorio As String = DBUtils.GetDBFolder
'	
'	File.Delete(File.DirRootExternal, "BakApp_Db.db")
'	File.Delete(vDirectorio, "BakApp_Db.db")
'	
'	File.Copy(File.DirAssets, "BakApp_Db.db", File.DirRootExternal, "BakApp_Db.db")
	
	
	'vSql.Initialize(vDirectorio, "BakApp_Db.db", True)
	
	DisableStrictMode
	
End Sub

Sub DisableStrictMode
	Dim jo As JavaObject
	jo.InitializeStatic("android.os.Build.VERSION")
	If jo.GetField("SDK_INT") > 9 Then
		Dim policy As JavaObject
		policy = policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder", Null)
		policy = policy.RunMethodJO("permitAll", Null).RunMethodJO("build", Null)
		Dim sm As JavaObject
		sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy", Array(policy))
	End If
End Sub

Sub Service_Start (StartingIntent As Intent)

                                                                                                                                                              	
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub


'Sub Connect As ResumableSub
'	MsSql.InitializeAsync("MsSql","net.sourceforge.jtds.jdbc.Driver","jdbc:jtds:sqlserver:" & sIP & sPort & ";databaseName=" & sDatabase & ";user=" & sUser & ";password=" & sPassword & ";appname=SKMJL;wsid=TEST;loginTimeout=10",sUser,sPassword)
'	Wait For MySQL_Ready (Success As Boolean)
'	If Success = False Then
'		Log("Check unfiltered logs for JDBC errors.")
'	End If
'	Return Success
'End Sub

'Sub CloseConnection
'	MsSql.Close
'End Sub

'Sub Fx_Global_Base_Bk As ResumableSub
''	Wait For (Connect) Complete (Success As Boolean)
''	If Success Then
'		Try
'			Dim Consulta_Sql As String = 	"Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'"
'			Dim sf As Object = MsSql.ExecQueryAsync("mssql", Consulta_Sql, Null)
'			Wait For (sf) mysql_QueryComplete (Success As Boolean, Crsr As JdbcResultSet)
'			If Success Then
'				Do While Crsr.NextRow
'					Variables.Global_BaseBk = Crsr.GetString("Global_BaseBk")
'					Log("DB BakApp: " & Variables.Global_BaseBk)
'				Loop
'				Crsr.Close
'			End If
'		Catch
'			Success = False
'			Log(LastException)
'		End Try
'		CloseConnection
''	End If
''	Return Success
'End Sub


'Public Sub Connect2()
'	Try
'		MsSql.Close
'		'MsSql.InitializeAsync("Connect", "net.sourceforge.jtds.jdbc.Driver", "jdbc:jtds:sqlserver://192.168.1.5:65218;databaseName=MyDBName;user=UserName;password=MyPW;appname=SKMJL;wsid=MyWS;loginTimeout=10", "UserName", "MyPW")  'sql 2012
'		MsSql.InitializeAsync("MsSql","net.sourceforge.jtds.jdbc.Driver","jdbc:jtds:sqlserver:" & sIP & sPort & ";databaseName=" & sDatabase & ";user=" & sUser & ";password=" & sPassword & ";appname=SKMJL;wsid=TEST;loginTimeout=10",sUser,sPassword)
'		Fx_Global_Base_Bk
'		'Msgbox2Async("Connection Ok" , "Network Error", "OK","","", Null, True)
'	Catch
'		Msgbox2Async("Connection to the network failed: " & CRLF & LastException.Message , "Network Error", "OK","","", Null, True)
'	End Try
'
'End Sub


