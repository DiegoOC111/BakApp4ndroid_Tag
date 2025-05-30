B4A=true
Group=Default Group\Clases
ModulesStructureVersion=1
Type=Class
Version=9.5
@EndOfDesignText@
Sub Class_Globals
	
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub Sb_Traer_Configuracion_Global()
		
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Top 1 * From CONFIEST" & CRLF & _ 
				   "Inner Join " &  Variables.Global_BaseBk & "Zw_Configuracion On Empresa = EMPRESA And Modalidad = MODALIDAD" & CRLF & _
				   "Where MODALIDAD = '  '"
		
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
		
		Dim vJson As String = Js.GetString
		
		If  vJson <> $"{"Table":[]}"$ Then
			
			Variables.Global_Row_Configuracion_General = Funciones.Fx_DataRow(Js.GetString)
			
		Else
			
			Variables.Global_Row_Configuracion_General = Null
			
		End If
				
	Else
		Log(Js.ErrorMessage)
	End If
	'ProgressDialogHide
End Sub