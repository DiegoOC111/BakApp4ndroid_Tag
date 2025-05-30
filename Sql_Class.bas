B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#RaisesSynchronousEvents: Fx_DataRow
Sub Class_Globals
	Dim vDataSet As Map
	Dim vDatatable As Map
	Dim vRow As Map
	Dim vFormulario As Object
		
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize()
	'parser.Initialize
	'vFormulario = Me_
End Sub

public Sub Fx_DataSet(vGetString_Json As String) As Map
	
	Dim Parser As JSONParser
	Parser.Initialize(vGetString_Json)
	Dim Ds As Map = Parser.NextObject
	Return Ds
		
End Sub

public Sub Fx_DataTable(vGetString_Json As String) As List
	
	Dim Ds As Map = Fx_DataSet(vGetString_Json)
	Dim Table As List = Ds.Get("Table")
	Return Table
		
End Sub

Public Sub Parse(XML As String) As Map
	Dim in As InputStream
	Dim b() As Byte = XML.GetBytes("UTF8")
	in.InitializeFromBytesArray(b, 0, b.Length)
Dim parse2 As BitmapDrawable
	Return parse2
End Sub

public Sub Fx_NDataRow(Consulta_Sql As String) As Map
		
	Dim Js As HttpJob
	Dim Row As Map
	
	'Row.Initialize
	
	'Js  = Funciones.Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql,Me)
	
	'Wait For (Js) JobDone(Js As HttpJob)
	
	'If Js.Success Then
		
	'	Dim vGetString_Json As String = Js.GetString
	'	Log(vGetString_Json)
		
	'	If  vGetString_Json <> $"{"Table":[]}"$ Then
	'		Dim Table As List = Fx_DataSet(vGetString_Json).Get("Table")
	'		vRow = Table.Get(0)
	'	End If
		
	'End If
	
	Return Row
		
End Sub

Sub Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql As String,Me_ As Object) 
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  			<soap:Body>
    			<Sb_GetDataSet_Json xmlns="http://BakApp">
      			<Consulta_Sql>$Xml{Consulta_Sql}</Consulta_Sql>
    			</Sb_GetDataSet_Json>
  			</soap:Body>
		</soap:Envelope>"$

	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString("http://" & Main.vGlobal_Ip_WebService & "/Ws_BakApp.asmx",vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_GetDataSet_Json""$)
	
	'ProgressDialogShow2("Revisando...",False)
	Wait For (Js) JobDone(Js As HttpJob)
	If Js.Success Then
	' ...
	End If
	'Return Js
	
End Sub