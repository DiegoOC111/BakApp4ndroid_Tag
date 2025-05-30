B4A=true
Group=Default Group\Funciones
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Sub Left(Text As String, Length As Int)As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString2(0, Length)
End Sub

Sub Right(Text As String, Length As Int) As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString(Text.Length-Length)
End Sub

Sub Mid(Text As String, Start As Int, Length As Int) As String
	Return Text.SubString2(Start-1,Start+Length-1)
End Sub

'Description: VB equivalent LTrim method using Regular Expressions
'Tag: LTrim, Regular Expressions
Sub LTrim(s As String) As String
	Dim m As Matcher = Regex.Matcher("^(\s+)", s)
	If m.Find Then
		Return s.SubString(m.GetEnd(1))
	Else
		Return s
	End If
End Sub

'Description: VB equivalent RTrim method using Regular Expressions
'Tag: RTrim, Regular Expressions
Sub RTrim(s As String) As String
	Dim m As Matcher = Regex.Matcher("(\s+)$", s)
	If m.Find Then
		Return s.SubString(m.GetEnd(1))
	Else
		Return s
	End If
End Sub

Sub Split(Text As String, Delimiter As String) As String()
	Return Regex.Split(Delimiter,Text)
End Sub

Sub Cbool(inInt As Double) As Boolean
	If inInt = 0 Then Return False
	Return True
End Sub

Sub CDouble(InS As String) As Double
	Return InS
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

public Sub Fx_DataRow(vGetString_Json As String) As Map
	Dim Table As List = Fx_DataSet(vGetString_Json).Get("Table")
	Dim Row As Map = Table.Get(0)
	Return Row
End Sub

Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Json(Consulta_Sql As String,Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  			<soap:Body>
    			<Sb_GetDataSet_Json xmlns="http://BakApp">
      			<Consulta_Sql>$Xml{Consulta_Sql}</Consulta_Sql>
    			</Sb_GetDataSet_Json>
  			</soap:Body>
		</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_GetDataSet_Json""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me_ As Object, _
												Codigo As String, _
												Empresa As String, _
												Sucursal As String, _
												Bodega As String, _
												Lista As String, _
												UnTrans As Int, _
												Koen As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  			<soap:Body>
    			<Sb_Traer_Productos_Json xmlns="http://BakApp">
      			<Codigo>$Xml{Codigo}</Codigo>
      			<Empresa>$Xml{Empresa}</Empresa>
      			<Sucursal>$Xml{Sucursal}</Sucursal>
      			<Bodega>$Xml{Bodega}</Bodega>
      			<Lista>$Xml{Lista}</Lista>
      			<UnTrans>$Xml{UnTrans}</UnTrans>
      			<Koen>$Xml{Koen}</Koen>
    			</Sb_Traer_Productos_Json>
  			</soap:Body>
		</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Productos_Json""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me_ As Object, _
											   Concepto As String, _
											   Empresa As String, _
											   Sucursal As String, _
											   Bodega As String, _
											   Lista As String, _
											   Koen As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
			<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
			  <soap12:Body>
			    <Sb_Traer_Concepto_Json xmlns="http://BakApp">
			      <_Concepto>$Xml{Concepto}</_Concepto>
			      <_Empresa>$Xml{Empresa}</_Empresa>
			      <_Sucursal>$Xml{Sucursal}</_Sucursal>
			      <_Bodega>$Xml{Bodega}</_Bodega>
			      <_Lista>$Xml{Lista}</_Lista>
			      <_Koen>$Xml{Koen}</_Koen>
			    </Sb_Traer_Concepto_Json>
			  </soap12:Body>
			</soap12:Envelope>"$
			
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Concepto_Json""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_GetModalidad_Gral(Me_ As Object) As HttpJob

	Dim	vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
		  <soap:Body>
		    <Sb_GetModalidad_Gral xmlns="http://BakApp">
		    <Global_BaseBk>$Xml{Variables.Global_BaseBk}</Global_BaseBk>
		    </Sb_GetModalidad_Gral>
		  </soap:Body>
		</soap:Envelope"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_GetModalidad_Gral""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me_ As Object, _
											  Koen As String, _
											  Suen As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
        <soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  			<soap:Body>
    			<Sb_Traer_Entidad_Json xmlns="http://BakApp">
      			<Koen>$Xml{Koen}</Koen>
      			<Suen>$Xml{Suen}</Suen>
    			</Sb_Traer_Entidad_Json>
  			</soap:Body>
		</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Entidad_Json""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Revisar_Stock_Fila(Me_ As Object, _
											  Tido As String, _
											  Empresa As String, _
											  Sucursal As String, _
											  Bodega As String, _
											  Codigo As String, _
											  Cantidad As Double, _
											  UnTrans As Int, _
											  Tidopa As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
		  <soap12:Body>
		    <Sb_Revisar_Stock_Fila xmlns="http://BakApp">
		      <_Tido>$Xml{Tido}</_Tido>
		      <_Empresa>$Xml{Empresa}</_Empresa>
		      <_Sucursal>$Xml{Sucursal}</_Sucursal>
		      <_Bodega>$Xml{Bodega}</_Bodega>
		      <_Codigo>$Xml{Codigo}</_Codigo>
		      <_Cantidad>$Xml{Cantidad}</_Cantidad>
		      <_UnTrans>$Xml{UnTrans}</_UnTrans>
		      <_Tidopa>$Xml{Tidopa}</_Tidopa>
		    </Sb_Revisar_Stock_Fila>
		  </soap12:Body>
		</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Revisar_Stock_Fila""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Descuentos_Seteados_Desde_Lista(Me_ As Object, _
																 Empresa As String, _
																 Sucursal As String, _
																 Codigo As String, _
																 CodLista As String, _
																 Prct As Boolean, _
																 Tict As String, _
																 PorIva As Double, _
																 PorIla As Double, _
																 Koen As String, _
																 ChkValoresNeto As Boolean) As HttpJob

	Dim vPrct,vChkValoresNeto As String
							
	If Prct Then
		vPrct = "True"
	Else
		vPrct = False
	End If
	If ChkValoresNeto Then
		vChkValoresNeto = "True"
	Else
		vChkValoresNeto = False
	End If
			
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
			<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
			<soap12:Body>
			<Sb_Traer_Descuentos_Seteados_Desde_Lista xmlns="http://BakApp">
			<_Empresa>$Xml{Empresa}</_Empresa>
			<_Sucursa>$Xml{Sucursal}</_Sucursa>
			<_Codigo>$Xml{Codigo}</_Codigo>
			<_CodLista>$Xml{CodLista}</_CodLista>
		      <_Prct>$Xml{Prct}</_Prct>
		      <_Tict>$Xml{Tict}</_Tict>
		      <_PorIva>$Xml{PorIva}</_PorIva>
		      <_PorIla>$Xml{PorIla}</_PorIla>
		      <_Koen>$Xml{Koen}</_Koen>
		      <_ChkValoresNeto>$Xml{ChkValoresNeto}</_ChkValoresNeto>
		    </Sb_Traer_Descuentos_Seteados_Desde_Lista>
		  </soap12:Body>
		</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Descuentos_Seteados_Desde_Lista""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk(Me_ As Object,Json As String,NombreTabla As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
		  <soap:Body>
		    <Sb_Json_ImpBk xmlns="http://BakApp">
		      <_Json>$Xml{Json}</_Json>
		      <_NombreTabla>$Xml{NombreTabla}</_NombreTabla>
		    </Sb_Json_ImpBk>
		  </soap:Body>
		</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Json_ImpBk""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_RevCarpetaTmp (Me_ As Object) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
		  <soap12:Body>
		    <Sb_RevCarpetaTmpResponse xmlns="http://BakApp" />
		  </soap12:Body>
		</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_RevCarpetaTmp""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp(Me_ As Object,EncabezadoJs As String,DestalleJs As String,DescuentosJs As String,ObservacionesJs As String) As HttpJob
	
	Dim Id As Int = Variables.Global_Row_EstacionBk.Get("Id")
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
		  <soap:Body>
		          <Sb_CreaDocumentoJsonBakapp xmlns="http://BakApp">
				      <_EncabezadoJs>$Xml{EncabezadoJs}</_EncabezadoJs>
				      <_DestalleJs>$Xml{DestalleJs}</_DestalleJs>
				      <_DescuentosJs>$Xml{DescuentosJs}</_DescuentosJs>
				      <_ObservacionesJs>$Xml{ObservacionesJs}</_ObservacionesJs>
					  <_Id_Estacion>$Xml{Id}</_Id_Estacion>
				   </Sb_CreaDocumentoJsonBakapp>
		  </soap:Body>
		</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_CreaDocumentoJsonBakapp""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp2(Me_ As Object,EncabezadoJs As String,DestalleJs As String,DescuentosJs As String,ObservacionesJs As String,DespachoSimpleJs As String) As HttpJob
	
	Dim Id As Int = Variables.Global_Row_EstacionBk.Get("Id")
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
		  <soap12:Body>
			    <Sb_CreaDocumentoJsonBakapp2 xmlns="http://BakApp">
					<_EncabezadoJs>$Xml{EncabezadoJs}</_EncabezadoJs>
				    <_DestalleJs>$Xml{DestalleJs}</_DestalleJs>
				    <_DescuentosJs>$Xml{DescuentosJs}</_DescuentosJs>
				    <_ObservacionesJs>$Xml{ObservacionesJs}</_ObservacionesJs>
			      <_DespachoSimpleJs>$Xml{DespachoSimpleJs}</_DespachoSimpleJs>
			      <_Id_Estacion>$Xml{Id}</_Id_Estacion>
			    </Sb_CreaDocumentoJsonBakapp2>
		  </soap12:Body>
		</soap12:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_CreaDocumentoJsonBakapp2""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBakapp(Me_ As Object, _
													 OldIdmaeedo As Int, _
													 Cod_Func_Eliminador As String, _
													 EncabezadoJs As String, _
													 DestalleJs As String, _
													 DescuentosJs As String, _
													 ObservacionesJs As String, _
													 Cambiar_NroDocumento As Boolean) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
				<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				  <soap12:Body>
				    <Sb_EditarDocumentoJsonBakapp xmlns="http://BakApp">
				      <_OldIdmaeedo>$Xml{OldIdmaeedo}</_OldIdmaeedo>
				      <_Cod_Func_Eliminador>$Xml{Cod_Func_Eliminador}</_Cod_Func_Eliminador>
				      <_Global_BaseBk>$Xml{Variables.Global_BaseBk}</_Global_BaseBk>
				      <_EncabezadoJs>$Xml{EncabezadoJs}</_EncabezadoJs>
				      <_DestalleJs>$Xml{DestalleJs}</_DestalleJs>
				      <_DescuentosJs>$Xml{DescuentosJs}</_DescuentosJs>
				      <_ObservacionesJs>$Xml{ObservacionesJs}</_ObservacionesJs>
					  <_Cambiar_NroDocumento>$Xml{Cambiar_NroDocumento}</_Cambiar_NroDocumento>
				    </Sb_EditarDocumentoJsonBakapp>
				  </soap12:Body>
				</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_EditarDocumentoJsonBakapp2""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBakapp2(Me_ As Object, _
													 OldIdmaeedo As Int, _
													 Cod_Func_Eliminador As String, _
													 EncabezadoJs As String, _
													 DestalleJs As String, _
													 DescuentosJs As String, _
													 ObservacionesJs As String, _
													 DespaFaciljs As String, _
													 Cambiar_NroDocumento As Boolean) As HttpJob
	
	Dim Id As Int = Variables.Global_Row_EstacionBk.Get("Id")
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
				<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				  <soap12:Body>
				    <Sb_EditarDocumentoJsonBakapp2 xmlns="http://BakApp">
				      <_OldIdmaeedo>$Xml{OldIdmaeedo}</_OldIdmaeedo>
				      <_Cod_Func_Eliminador>$Xml{Cod_Func_Eliminador}</_Cod_Func_Eliminador>
				      <_Global_BaseBk>$Xml{Variables.Global_BaseBk}</_Global_BaseBk>
				      <_EncabezadoJs>$Xml{EncabezadoJs}</_EncabezadoJs>
				      <_DestalleJs>$Xml{DestalleJs}</_DestalleJs>
				      <_DescuentosJs>$Xml{DescuentosJs}</_DescuentosJs>
				      <_ObservacionesJs>$Xml{ObservacionesJs}</_ObservacionesJs>
					  <_Cambiar_NroDocumento>$Xml{Cambiar_NroDocumento}</_Cambiar_NroDocumento>
				      <_DespachoSimpleJs>$Xml{DespaFaciljs}</_DespachoSimpleJs>
				      <_Id_Estacion>$Xml{Id}</_Id_Estacion>
				    </Sb_EditarDocumentoJsonBakapp2>
				  </soap12:Body>
				</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_EditarDocumentoJsonBakapp2""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me_ As Object,Clave As String,Kofu As String,Eliminar As Boolean) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
		  <soap:Body>
			    <Sb_Usar_Dscto_Poswii xmlns="http://BakApp">
			      <_Clave>$Xml{Clave}</_Clave>
			      <_Kofu>$Xml{Kofu}</_Kofu>
			      <_Eliminar>$Xml{Eliminar}</_Eliminar>
			    </Sb_Usar_Dscto_Poswii>
		  </soap:Body>
		</soap:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Usar_Dscto_Poswii""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Descuento_Global_X_Cliente(Me_ As Object,Koen As String,Suen As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
		<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
		  <soap12:Body>
		    <Sb_Traer_Descuento_Global_X_Cliente xmlns="http://BakApp">
		      <_Global_BaseBk>$Xml{Variables.Global_BaseBk}</_Global_BaseBk>
		      <_Koen>$Xml{Koen}</_Koen>
		      <_Suen>$Xml{Suen}</_Suen>
		    </Sb_Traer_Descuento_Global_X_Cliente>
		  </soap12:Body>
		</soap12:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Descuento_Global_X_Cliente""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me_ As Object,Empresa As String,Modalidad As String,CodFuncionario As String,Idmaeedo As Int) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
			<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				<soap12:Body>
					<Sb_EnviarImprimirBakapp xmlns="http://BakApp">
						<_Global_BaseBk2>$Xml{Variables.Global_BaseBk}</_Global_BaseBk2>
						<_Empresa>$Xml{Empresa}</_Empresa>
						<_Modalidad>$Xml{Modalidad}</_Modalidad>
						<_CodFuncionario>$Xml{CodFuncionario}</_CodFuncionario>
						<_Idmaeedo>$Xml{Idmaeedo}</_Idmaeedo>
					</Sb_EnviarImprimirBakapp>
				</soap12:Body>
			</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_EnviarImprimirBakapp""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_EnviarCorreoBakapp(Me_ As Object,Empresa As String,Modalidad As String,CodFuncionario As String,Idmaeedo As Int,Para As String,Cc As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
			<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
			  <soap12:Body>
			    <Sb_EnviarCorreoBakapp xmlns="http://BakApp">
			      <_Global_BaseBk>$Xml{Variables.Global_BaseBk}</_Global_BaseBk>
			      <_Empresa>$Xml{Empresa}</_Empresa>
			      <_Modalidad>$Xml{Modalidad}</_Modalidad>
			      <_CodFuncionario>$Xml{CodFuncionario}</_CodFuncionario>
			      <_Idmaeedo>$Xml{Idmaeedo}</_Idmaeedo>
			      <_Para>$Xml{Para}</_Para>
			      <_Cc>$Xml{Cc}</_Cc>
			    </Sb_EnviarCorreoBakapp>
			  </soap12:Body>
			</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_EnviarCorreoBakapp""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Documento(Me_ As Object,Tido As String,Nudo As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
			<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
			  <soap12:Body>
			    <Sb_Traer_Documento xmlns="http://BakApp">
			      <_Global_BaseBk2>$Xml{Variables.Global_BaseBk}</_Global_BaseBk2>
			      <_Tido>$Xml{Tido}</_Tido>
			      <_Nudo>$Xml{Nudo}</_Nudo>
			    </Sb_Traer_Documento>
			  </soap12:Body>
			</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Documento""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Traer_Documento2(Me_ As Object,Idmaeedo As Int) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
			<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
			  <soap12:Body>
			    <Sb_Traer_Documento2 xmlns="http://BakApp">
			      <_Global_BaseBk2>$Xml{Variables.Global_BaseBk}</_Global_BaseBk2>
			      <_Idmaeedo>$Xml{Idmaeedo}</_Idmaeedo>
			    </Sb_Traer_Documento2>
			  </soap12:Body>
			</soap12:Envelope>"$
			
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Traer_Documento2""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Actualizar_Observaciones_Documento(Me_ As Object,Idmaeedo As Int,Obdo As String, Ocdo As String) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
				<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				  <soap12:Body>
				    <Sb_Actualizar_Observaciones_Documento xmlns="http://BakApp">
				      <_Idmaeedo>$Xml{Idmaeedo}</_Idmaeedo>
				      <_Observaciones>$Xml{Obdo}</_Observaciones>
				      <_Orden_De_Compra>$Xml{Ocdo}</_Orden_De_Compra>
				    </Sb_Actualizar_Observaciones_Documento>
				  </soap12:Body>
				</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Actualizar_Observaciones_Documento""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio(Me_ As Object,Idmaeedo As Int,Vnta_Dias_Venci_Coti As Int) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
				<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				  <soap12:Body>
				    <Sb_RevisarDocVsListaPrecio xmlns="http://BakApp">
				      <_Idmaeedo>$Xml{Idmaeedo}</_Idmaeedo>
				      <_Vnta_Dias_Venci_Coti>$Xml{Vnta_Dias_Venci_Coti}</_Vnta_Dias_Venci_Coti>
				    </Sb_RevisarDocVsListaPrecio>
				  </soap12:Body>
				</soap12:Envelope>"$
		
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_RevisarDocVsListaPrecio""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_FormatoModalidad(Empresa As String,Modalidad As String,Tido As String,Me_ As Object) As HttpJob
		
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
				<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				  <soap12:Body>
				    <Sb_FormatoModalidad xmlns="http://BakApp">
				      <_Empresa>$Xml{Empresa}</_Empresa>
				      <_Modalidad>$Xml{Modalidad}</_Modalidad>
				      <_Tido>$Xml{Tido}</_Tido>
				    </Sb_FormatoModalidad>
				  </soap12:Body>
				</soap12:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)'
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_FormatoModalidad""$)
	
	Return Js
	
End Sub

Public Sub Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimple_Poswii(Me_ As Object,Clave As String,Koen As String,Eliminar As Boolean) As HttpJob
	
	Dim vXml As String = $"<?xml version="1.0" encoding="utf-8"?>
				<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
				  <soap12:Body>
				    <Sb_Usar_Clave_DocDespSimple_Poswii xmlns="http://BakApp">
				      <_Clave>$Xml{Clave}</_Clave>
				      <_Koen>$Xml{Koen}</_Koen>
				      <_Eliminar>$Xml{Eliminar}</_Eliminar>
				    </Sb_Usar_Clave_DocDespSimple_Poswii>
				  </soap12:Body>
				</soap12:Envelope>"$
	Dim PostString As String ="http://" & Variables.Global_Ip_WebService & "/Ws_BakApp.asmx"
	Dim Js As HttpJob
	
	Js.Initialize("",Me_)
	Js.PostString(PostString,vXml)
	Js.GetRequest.SetContentType("text/xml; charset=utf-8")
	Js.GetRequest.SetHeader("SOAPAction",$""http://BakApp/Sb_Usar_Clave_DocDespSimple_Poswii""$)
	
	Return Js
	
End Sub

Public Sub Fx_TraeClaveRD(vClave As String) As String

	Dim valorAscii As Int
	Dim PassEncriptado, Letra As String
	Dim CadenaRD As Long
	vClave = vClave.Trim

	For x = 1 To vClave.Length
		
		Letra = Mid(vClave,  x, 1)
		valorAscii = Asc(Letra)
		'txtAscii.Text = valor.ToString

		If x = 1 Then
			CadenaRD = (17225 + valorAscii) * 1
			Else If x = 2 Then
			CadenaRD = (1847 + valorAscii) * 8
			Else If x = 3 Then
			CadenaRD = (1217 + valorAscii) * 27
			Else If x = 4 Then
			CadenaRD = (237 + valorAscii) * 64
			Else If x = 5 Then
			CadenaRD = (201 + valorAscii) * 125
		End If

		PassEncriptado = PassEncriptado & CadenaRD
		CadenaRD = 0
	Next

	Return PassEncriptado

End Sub

Sub Fx_Traer_IdDispositivo As String

	Dim p As Phone
	Dim id As String
	Dim r As Reflector
	Dim Api As Int

	Api = r.GetStaticField("android.os.Build$VERSION", "SDK_INT")

	If Api < 9 Then
		'dispositivo antiguo
		id= p.GetSettings("android_id")
	Else
		'Nuevo dispositivo
		id= r.GetStaticField("android.os.Build", "SERIAL")
		If id.ToLowerCase = "unknown" Then id= p.GetSettings("android_id")
	End If
	
'	Dim pi As PhoneId
'	Dim textImei As String = pi.GetDeviceId

	Return id

End Sub

Public Sub Fx_Cadena_a_buscar_SQL(vCadena As String, _
                                  vCampo As String, _
                                  vAnd_Or As String) As String

	Dim linea1, linea2 As String
	Dim vConcatenar As String = ""
'	Dim vI As Integer
	
	If vAnd_Or = "" Then vAnd_Or = "And"

	For i = 1 To vCadena.Length' Len(vCadena)
		linea1 = LTrim(Mid(vCadena, i, 1)).ToUpperCase'UCase(LTrim(Mid(cadena, w, 1)))
		linea2 = linea1.ToLowerCase'LCase(linea1)

		If linea1 = "" Then
			vConcatenar = vConcatenar & "%' " & vAnd_Or & " " & vCampo
		Else
			vConcatenar = vConcatenar & "[" & linea1 & linea2 & "]"
		End If
	Next
	Return vConcatenar
	
End Sub

Public Sub Fx_Solo_Enteros(Cantidad As Double, Divisible As String) As Boolean
	
	Dim Cant_Tiene_Decimales As Boolean

	If Cantidad <> 0 Then

		If  IsNumber(Cantidad) Then
			If NumberFormat(Cantidad,0,0) = Cantidad Then
				' es entero
				Cant_Tiene_Decimales = False
			Else
				' es decimal
				Cant_Tiene_Decimales = True
			End If
		End If

		If Cant_Tiene_Decimales Then
			If Divisible = "0" Or Divisible = "N" Then
				Return False
			End If
		End If

	End If
	
	Return True
	
End Sub

Public Sub Fx_NuloPorNro(value As Object, valorxdefecto As Double)

	If IsNull(value) Then
		Return valorxdefecto
	End If

	Return value
        
End Sub

Public Sub Fx_NuloPorStr(value As Object,valorxdefecto As String)

	If IsNull(value) Then
		Return valorxdefecto
	End If

	Return value
        
End Sub

Sub IsNull(O As Object) As Boolean
	Return (O=Null)
End Sub

Public Sub Rellenar_Derecha(Cadena As String,CantCaracteres As Int,Relleno As String) As String

	Dim i As Int
	Dim nro As String
	nro = Cadena.Length

	Dim Cantidad As Int = CantCaracteres - nro

	If Cantidad > 0 Then
		For i = 0 To Cantidad - 1
			Cadena = Cadena & Relleno
		Next
	End If

	Return Cadena

End Sub

Public Sub Rellenar_Izquierda(Cadena As String,CantCaracteres As Int,Relleno As String) As String

	Dim i As Int
	Dim nro As String
	nro = Cadena.Length

	Dim Cantidad As Int = CantCaracteres - nro

	If Cantidad > 0 Then
		For i = 0 To Cantidad - 1
			Cadena = Relleno & Cadena
		Next
	End If

	Return Cadena

End Sub

'Formato de fecha dd/MM/yyyy
'Si el Separador es = "" el separador sera /
Public Sub Fecha_Formato(Fecha As Long,Separador As String) As String
	
	Dim vYear = DateTime.GetYear(Fecha)
	Dim vMonth = DateTime.GetMonth(Fecha)
	Dim vDay = DateTime.GetDayOfMonth(Fecha)
	
	If Separador = "" Then
		Separador = "/"
	End If		
	
	Dim FechaStr As String = Rellenar_Izquierda(vDay,2,"0") & Separador & Rellenar_Izquierda(vMonth,2,"0") & Separador & vYear
	
	Return FechaStr
	
End Sub

Sub Fx_IsEmail(EmailAddress As String) As Boolean
	Dim MatchEmail As Matcher = Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$", EmailAddress)
	If MatchEmail.Find = True Then
		Log(MatchEmail.Match)
		Return True
	Else
		Log("Oops, Por favor vuelve a comprobar tu dirección de email")
		Return False
	End If
End Sub

Sub RutDigito(numero As Long) As String

	Dim cuenta, Suma, resto, Digito As Int
	Dim dig As Double
	Suma = 0
	cuenta = 2
	
	Do Until numero = 0
		dig = numero Mod 10
		Dim Nro As Int = numero/10
		numero = Nro
		'numero = NumberFormat(Nro,0,0)
		Suma = Suma + (dig * cuenta)
		cuenta = cuenta + 1
		If cuenta = 8 Then cuenta = 2
	Loop 'Until numero = 0

	resto = Suma Mod 11
	Digito = 11 - resto

	Select Case Digito
		Case 10 : Return "K"
		Case 11 : Return "0"
		Case Else : Return Digito' Trim(Str(Digito))
	End Select
	
End Sub

Sub Sb_Borrar_Todos_Registros_De_Tabla(Tabla As String, Campo As String)
	
	Dim Consulta_Sql As String
	Dim Table As List
	Dim Cols() As String
	
	Tabla = Tabla.ToLowerCase
	Campo = Campo.ToLowerCase
	
	Consulta_Sql = "Select " & Campo & " From " & Tabla
		
	Table = DBUtils.ExecuteMemoryTable(Variables.vSql, Consulta_Sql, Null,0)

	For i = 0 To Table.Size - 1
		Cols = Table.Get(i)
		Dim Id = Cols(0)
		Consulta_Sql = "Delete From [" & Tabla & "] Where [" & Campo & "] = ?"
		Variables.vSql.ExecNonQuery2(Consulta_Sql, Array As Object(Id))
	Next
	
End Sub

Sub Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos
	
	Dim Consulta_Sql As String
	
	Consulta_Sql = "Delete From [Descuentos_Doc]"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [DespaFacil_Doc]"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Detalle_Doc]"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Encabezado_Doc]"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Impuestos_Doc]"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
	
	Consulta_Sql = "Delete From [Observaciones_Doc]"
	Variables.vSql.ExecNonQuery(Consulta_Sql)
		
End Sub

