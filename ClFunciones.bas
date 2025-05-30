B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub TienePermiso(CodPermiso As String, CodUsuario As String) As ResumableSub
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Top 1 * From " & Variables.Global_BaseBk & "ZW_PermisosVsUsuarios Where CodUsuario = '" & CodUsuario & "' And CodPermiso = '" & CodPermiso & "'"
			
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then							
			Return True
		Else
			Return False
		End If

	End If
	
	Return False
	
End Sub

Sub Sb_ExisteTabla(Tabla As String) As ResumableSub
	
	'vError = ""
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Select Top 1 * From INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '" & Tabla & "'"
			
	Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	Wait For (Js) JobDone(Js As HttpJob)
	Log("Revisando la existencia de Tabla " & Tabla)
		
	If Js.Success Then
						
		Dim vJson As String = Js.GetString
						
		If  vJson <> $"{"Table":[]}"$ Then
			
			Dim vJson As String = Js.GetString
						
			If  vJson <> $"{"Table":[]}"$ Then
				Return True
			Else
				Return False
			End If
			
		End If
	
	End If
	
	Return False
	
End Sub



