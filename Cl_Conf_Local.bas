B4A=true
Group=Default Group\Configuracion\Conf. local
ModulesStructureVersion=1
Type=Class
Version=10.7
@EndOfDesignText@
Sub Class_Globals
	
	Dim Consulta_Sql As String
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub Sb_Revisar_WebService As ResumableSub
	
	Dim Exite_Ip_webservice As Boolean
	
	Try
		Consulta_Sql = "Select * From Conf_Local"
		Dim Existe As Int = Variables.vSql.ExecQuerySingleResult("Select Count(*) From Conf_Local")
	
		If Existe = 0 Then
			Consulta_Sql = "Insert Into Conf_Local (Ip_WebService,IdDispositivo) Values ('...','" & Variables.Global_IdDispositivo & "')"
			Variables.vSql.ExecQuery(Consulta_Sql)
			Exite_Ip_webservice = False
		Else
			Exite_Ip_webservice = True
		End If
	
		Consulta_Sql = "Select * From Conf_Local"
		Dim Fila As Map
		Fila.Initialize
		Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta_Sql,Null)

		Variables.Global_Ip_WebService = Fila.Get("ip_webservice")
	Catch
		Variables.Global_Ip_WebService = "..."
		Log(LastException)
	End Try
	
	Return Exite_Ip_webservice
						
End Sub