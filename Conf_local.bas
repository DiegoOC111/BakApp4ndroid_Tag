B4A=true
Group=Default Group\Configuracion\Conf. local
ModulesStructureVersion=1
Type=Activity
Version=10.7
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim Consulta_Sql As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Label1 As Label
	Private Txt_Ip_WebService As EditText
	Private Btn_Grabar As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("Conf_Local1")
	
	Txt_Ip_WebService.Text = Variables.Global_Ip_WebService
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Btn_Grabar_Click
	
	Variables.Global_Ip_WebService = Txt_Ip_WebService.Text.Trim
	
	Consulta_Sql = "Select Top 1 EMPRESA From CONFIES"
	
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	ProgressDialogShow("Probando conexión")
	If Js.Success Then
	
		Dim vJson As String = Js.GetString
		If  vJson <> $"{"Table":[]}"$ Then
			ProgressDialogHide
			Msgbox2Async("Conexion existosa" , "Conexión WebService", "Ok", "", "", Null, False)
			Wait For Msgbox_Result (Result As Int)
		
			DBUtils.UpdateRecord(Variables.vSql,"Conf_Local","Ip_Webservice",Variables.Global_Ip_WebService,CreateMap("IdDispositivo": Variables.Global_IdDispositivo ))
					
			Activity.Finish
			
		End If
	Else
		ProgressDialogHide
		Msgbox2Async("No se pudo establecer la conexion con el Web Service" , "Conexión WebService", "Ok", "", "", Null, False)
	End If
			
End Sub