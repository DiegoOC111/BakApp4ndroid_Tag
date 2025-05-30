B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	Dim sql1 As JsbcSQL
	Dim sIP As String = "//192.168.1.80"
	Dim sPort As String = ":1433"
	Dim sDatabase As String = "Db"
	Dim sUser As String = "User"
	Dim sPassword As String = "Clave"


End Sub

Public Sub Koneksi()
Try	
	sql1.InitializeAsync("sql1","net.sourceforge.jtds.jdbc.Driver","jdbc:jtds:sqlserver:" & sIP & sPort & ";databaseName=" & sDatabase & ";user=" & sUser & ";password=" & sPassword & ";appname=SKMJL;wsid=TEST;loginTimeout=1)
	ProgressDialogShow("Conectado Ok")
Catsh
	Log("Error en la conexión")
	Log(LastException.Message)
	Return
End Try