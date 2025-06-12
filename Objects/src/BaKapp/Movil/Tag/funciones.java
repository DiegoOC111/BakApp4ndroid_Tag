package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class funciones {
private static funciones mostCurrent = new funciones();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static boolean  _cbool(anywheresoftware.b4a.BA _ba,double _inint) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Cbool(inInt As Double) As Boolean";
 //BA.debugLineNum = 49;BA.debugLine="If inInt = 0 Then Return False";
if (_inint==0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 //BA.debugLineNum = 50;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return false;
}
public static double  _cdouble(anywheresoftware.b4a.BA _ba,String _ins) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub CDouble(InS As String) As Double";
 //BA.debugLineNum = 54;BA.debugLine="Return InS";
if (true) return (double)(Double.parseDouble(_ins));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return 0;
}
public static String  _fecha_formato(anywheresoftware.b4a.BA _ba,long _fecha,String _separador) throws Exception{
String _vyear = "";
String _vmonth = "";
String _vday = "";
String _fechastr = "";
 //BA.debugLineNum = 913;BA.debugLine="Public Sub Fecha_Formato(Fecha As Long,Separador A";
 //BA.debugLineNum = 915;BA.debugLine="Dim vYear = DateTime.GetYear(Fecha)";
_vyear = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_fecha));
 //BA.debugLineNum = 916;BA.debugLine="Dim vMonth = DateTime.GetMonth(Fecha)";
_vmonth = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_fecha));
 //BA.debugLineNum = 917;BA.debugLine="Dim vDay = DateTime.GetDayOfMonth(Fecha)";
_vday = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_fecha));
 //BA.debugLineNum = 919;BA.debugLine="If Separador = \"\" Then";
if ((_separador).equals("")) { 
 //BA.debugLineNum = 920;BA.debugLine="Separador = \"/\"";
_separador = "/";
 };
 //BA.debugLineNum = 923;BA.debugLine="Dim FechaStr As String = Rellenar_Izquierda(vDay,";
_fechastr = _rellenar_izquierda(_ba,_vday,(int) (2),"0")+_separador+_rellenar_izquierda(_ba,_vmonth,(int) (2),"0")+_separador+_vyear;
 //BA.debugLineNum = 925;BA.debugLine="Return FechaStr";
if (true) return _fechastr;
 //BA.debugLineNum = 927;BA.debugLine="End Sub";
return "";
}
public static String  _fx_cadena_a_buscar_sql(anywheresoftware.b4a.BA _ba,String _vcadena,String _vcampo,String _vand_or) throws Exception{
String _linea1 = "";
String _linea2 = "";
String _vconcatenar = "";
int _i = 0;
 //BA.debugLineNum = 799;BA.debugLine="Public Sub Fx_Cadena_a_buscar_SQL(vCadena As Strin";
 //BA.debugLineNum = 803;BA.debugLine="Dim linea1, linea2 As String";
_linea1 = "";
_linea2 = "";
 //BA.debugLineNum = 804;BA.debugLine="Dim vConcatenar As String = \"\"";
_vconcatenar = "";
 //BA.debugLineNum = 807;BA.debugLine="If vAnd_Or = \"\" Then vAnd_Or = \"And\"";
if ((_vand_or).equals("")) { 
_vand_or = "And";};
 //BA.debugLineNum = 809;BA.debugLine="For i = 1 To vCadena.Length' Len(vCadena)";
{
final int step4 = 1;
final int limit4 = _vcadena.length();
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 810;BA.debugLine="linea1 = LTrim(Mid(vCadena, i, 1)).ToUpperCase'U";
_linea1 = _ltrim(_ba,_mid(_ba,_vcadena,_i,(int) (1))).toUpperCase();
 //BA.debugLineNum = 811;BA.debugLine="linea2 = linea1.ToLowerCase'LCase(linea1)";
_linea2 = _linea1.toLowerCase();
 //BA.debugLineNum = 813;BA.debugLine="If linea1 = \"\" Then";
if ((_linea1).equals("")) { 
 //BA.debugLineNum = 814;BA.debugLine="vConcatenar = vConcatenar & \"%' \" & vAnd_Or & \"";
_vconcatenar = _vconcatenar+"%' "+_vand_or+" "+_vcampo;
 }else {
 //BA.debugLineNum = 816;BA.debugLine="vConcatenar = vConcatenar & \"[\" & linea1 & line";
_vconcatenar = _vconcatenar+"["+_linea1+_linea2+"]";
 };
 }
};
 //BA.debugLineNum = 819;BA.debugLine="Return vConcatenar";
if (true) return _vconcatenar;
 //BA.debugLineNum = 821;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fx_datarow(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
 //BA.debugLineNum = 74;BA.debugLine="public Sub Fx_DataRow(vGetString_Json As String) A";
 //BA.debugLineNum = 75;BA.debugLine="Dim Table As List = Fx_DataSet(vGetString_Json).G";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_fx_dataset(_ba,_vgetstring_json).Get((Object)("Table"))));
 //BA.debugLineNum = 76;BA.debugLine="Dim Row As Map = Table.Get(0)";
_row = new anywheresoftware.b4a.objects.collections.Map();
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_table.Get((int) (0))));
 //BA.debugLineNum = 77;BA.debugLine="Return Row";
if (true) return _row;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _fx_dataset(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _ds = null;
 //BA.debugLineNum = 57;BA.debugLine="public Sub Fx_DataSet(vGetString_Json As String) A";
 //BA.debugLineNum = 59;BA.debugLine="Dim Parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 60;BA.debugLine="Parser.Initialize(vGetString_Json)";
_parser.Initialize(_vgetstring_json);
 //BA.debugLineNum = 61;BA.debugLine="Dim Ds As Map = Parser.NextObject";
_ds = new anywheresoftware.b4a.objects.collections.Map();
_ds = _parser.NextObject();
 //BA.debugLineNum = 62;BA.debugLine="Return Ds";
if (true) return _ds;
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _fx_datatable(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
anywheresoftware.b4a.objects.collections.Map _ds = null;
anywheresoftware.b4a.objects.collections.List _table = null;
 //BA.debugLineNum = 66;BA.debugLine="public Sub Fx_DataTable(vGetString_Json As String)";
 //BA.debugLineNum = 68;BA.debugLine="Dim Ds As Map = Fx_DataSet(vGetString_Json)";
_ds = new anywheresoftware.b4a.objects.collections.Map();
_ds = _fx_dataset(_ba,_vgetstring_json);
 //BA.debugLineNum = 69;BA.debugLine="Dim Table As List = Ds.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ds.Get((Object)("Table"))));
 //BA.debugLineNum = 70;BA.debugLine="Return Table";
if (true) return _table;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_actualizar_observaciones_documento(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo,String _obdo,String _ocdo) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 644;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Actualizar_Observacione";
 //BA.debugLineNum = 646;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_Actualizar_Observaciones_Documento xmlns=\"http://BakApp\">\n"+"				      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"				      <_Observaciones>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_obdo))+"</_Observaciones>\n"+"				      <_Orden_De_Compra>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_ocdo))+"</_Orden_De_Compra>\n"+"				    </Sb_Actualizar_Observaciones_Documento>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
 //BA.debugLineNum = 657;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 658;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 660;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 661;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 662;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 663;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Actualizar_Observaciones_Documento\""));
 //BA.debugLineNum = 665;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_creadocumentojsonbakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs) throws Exception{
int _id = 0;
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 355;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
 //BA.debugLineNum = 357;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
 //BA.debugLineNum = 359;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		          <Sb_CreaDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"				   </Sb_CreaDocumentoJsonBakapp>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
 //BA.debugLineNum = 371;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 372;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 374;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 375;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 376;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 377;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_CreaDocumentoJsonBakapp\""));
 //BA.debugLineNum = 379;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_creadocumentojsonbakapp2(anywheresoftware.b4a.BA _ba,Object _me_,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,String _despachosimplejs) throws Exception{
int _id = 0;
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 383;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
 //BA.debugLineNum = 385;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
 //BA.debugLineNum = 387;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"			    <Sb_CreaDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"+"					<_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				    <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				    <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				    <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"			      <_DespachoSimpleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_despachosimplejs))+"</_DespachoSimpleJs>\n"+"			      <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"			    </Sb_CreaDocumentoJsonBakapp2>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
 //BA.debugLineNum = 400;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 401;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 403;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 404;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 405;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 406;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_CreaDocumentoJsonBakapp2\""));
 //BA.debugLineNum = 408;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_editardocumentojsonbakapp(anywheresoftware.b4a.BA _ba,Object _me_,int _oldidmaeedo,String _cod_func_eliminador,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,boolean _cambiar_nrodocumento) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 412;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
 //BA.debugLineNum = 421;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_EditarDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"+"				      <_OldIdmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_oldidmaeedo))+"</_OldIdmaeedo>\n"+"				      <_Cod_Func_Eliminador>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cod_func_eliminador))+"</_Cod_Func_Eliminador>\n"+"				      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Cambiar_NroDocumento>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cambiar_nrodocumento))+"</_Cambiar_NroDocumento>\n"+"				    </Sb_EditarDocumentoJsonBakapp>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
 //BA.debugLineNum = 437;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 438;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 440;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 441;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 442;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 443;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""));
 //BA.debugLineNum = 445;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_editardocumentojsonbakapp2(anywheresoftware.b4a.BA _ba,Object _me_,int _oldidmaeedo,String _cod_func_eliminador,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,String _despafaciljs,boolean _cambiar_nrodocumento) throws Exception{
int _id = 0;
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 449;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
 //BA.debugLineNum = 459;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
 //BA.debugLineNum = 461;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_EditarDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"+"				      <_OldIdmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_oldidmaeedo))+"</_OldIdmaeedo>\n"+"				      <_Cod_Func_Eliminador>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cod_func_eliminador))+"</_Cod_Func_Eliminador>\n"+"				      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Cambiar_NroDocumento>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cambiar_nrodocumento))+"</_Cambiar_NroDocumento>\n"+"				      <_DespachoSimpleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_despafaciljs))+"</_DespachoSimpleJs>\n"+"				      <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"				    </Sb_EditarDocumentoJsonBakapp2>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
 //BA.debugLineNum = 479;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 480;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 482;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 483;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 484;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 485;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""));
 //BA.debugLineNum = 487;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_enviarcorreobakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _modalidad,String _codfuncionario,int _idmaeedo,String _para,String _cc) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 566;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarCorreoBakapp(Me_";
 //BA.debugLineNum = 568;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_EnviarCorreoBakapp xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"			      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			      <_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"			      <_CodFuncionario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codfuncionario))+"</_CodFuncionario>\n"+"			      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"			      <_Para>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_para))+"</_Para>\n"+"			      <_Cc>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cc))+"</_Cc>\n"+"			    </Sb_EnviarCorreoBakapp>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
 //BA.debugLineNum = 583;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 584;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 586;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 587;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 588;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 589;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_EnviarCorreoBakapp\""));
 //BA.debugLineNum = 591;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_enviarimprimirbakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _modalidad,String _codfuncionario,int _idmaeedo) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 539;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me";
 //BA.debugLineNum = 541;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				<soap12:Body>\n"+"					<Sb_EnviarImprimirBakapp xmlns=\"http://BakApp\">\n"+"						<_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"						<_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"						<_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"						<_CodFuncionario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codfuncionario))+"</_CodFuncionario>\n"+"						<_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"					</Sb_EnviarImprimirBakapp>\n"+"				</soap12:Body>\n"+"			</soap12:Envelope>");
 //BA.debugLineNum = 554;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 555;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 557;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 558;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 559;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 560;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_EnviarImprimirBakapp\""));
 //BA.debugLineNum = 562;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_formatomodalidad(anywheresoftware.b4a.BA _ba,String _empresa,String _modalidad,String _tido,Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 693;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_FormatoModalidad(Empres";
 //BA.debugLineNum = 695;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_FormatoModalidad xmlns=\"http://BakApp\">\n"+"				      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"				      <_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"				      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"				    </Sb_FormatoModalidad>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
 //BA.debugLineNum = 705;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 706;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 708;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 709;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 710;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 711;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_FormatoModalidad\""));
 //BA.debugLineNum = 713;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getdataset_json(anywheresoftware.b4a.BA _ba,String _consulta_sql,Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 80;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Json(Consult";
 //BA.debugLineNum = 82;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_GetDataSet_Json xmlns=\"http://BakApp\">\n"+"      			<Consulta_Sql>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_consulta_sql))+"</Consulta_Sql>\n"+"    			</Sb_GetDataSet_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
 //BA.debugLineNum = 90;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 91;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 93;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 94;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 95;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 96;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_GetDataSet_Json\""));
 //BA.debugLineNum = 98;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getdataset_sb_json_impbk(anywheresoftware.b4a.BA _ba,Object _me_,String _json,String _nombretabla) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 311;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpB";
 //BA.debugLineNum = 313;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		    <Sb_Json_ImpBk xmlns=\"http://BakApp\">\n"+"		      <_Json>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_json))+"</_Json>\n"+"		      <_NombreTabla>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_nombretabla))+"</_NombreTabla>\n"+"		    </Sb_Json_ImpBk>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
 //BA.debugLineNum = 322;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 323;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 325;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 326;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 327;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 328;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Json_ImpBk\""));
 //BA.debugLineNum = 330;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getmodalidad_gral(anywheresoftware.b4a.BA _ba,Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 171;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetModalidad_Gral(Me_ A";
 //BA.debugLineNum = 173;BA.debugLine="Dim	vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		    <Sb_GetModalidad_Gral xmlns=\"http://BakApp\">\n"+"		    <Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</Global_BaseBk>\n"+"		    </Sb_GetModalidad_Gral>\n"+"		  </soap:Body>\n"+"		</soap:Envelope");
 //BA.debugLineNum = 181;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 182;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 184;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 185;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 186;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 187;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_GetModalidad_Gral\""));
 //BA.debugLineNum = 189;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revcarpetatmp(anywheresoftware.b4a.BA _ba,Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 334;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevCarpetaTmp (Me_ As O";
 //BA.debugLineNum = 336;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_RevCarpetaTmpResponse xmlns=\"http://BakApp\" />\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
 //BA.debugLineNum = 343;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 344;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 346;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 347;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 348;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 349;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_RevCarpetaTmp\""));
 //BA.debugLineNum = 351;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revisar_stock_fila(anywheresoftware.b4a.BA _ba,Object _me_,String _tido,String _empresa,String _sucursal,String _bodega,String _codigo,double _cantidad,int _untrans,String _tidopa) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 218;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Revisar_Stock_Fila(Me_";
 //BA.debugLineNum = 228;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_Revisar_Stock_Fila xmlns=\"http://BakApp\">\n"+"		      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"		      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"		      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursal>\n"+"		      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</_Bodega>\n"+"		      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</_Codigo>\n"+"		      <_Cantidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cantidad))+"</_Cantidad>\n"+"		      <_UnTrans>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_untrans))+"</_UnTrans>\n"+"		      <_Tidopa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tidopa))+"</_Tidopa>\n"+"		    </Sb_Revisar_Stock_Fila>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
 //BA.debugLineNum = 244;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 245;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 247;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 248;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 249;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 250;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Revisar_Stock_Fila\""));
 //BA.debugLineNum = 252;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revisardocvslistaprecio(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo,int _vnta_dias_venci_coti) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 669;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio";
 //BA.debugLineNum = 671;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_RevisarDocVsListaPrecio xmlns=\"http://BakApp\">\n"+"				      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"				      <_Vnta_Dias_Venci_Coti>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_vnta_dias_venci_coti))+"</_Vnta_Dias_Venci_Coti>\n"+"				    </Sb_RevisarDocVsListaPrecio>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
 //BA.debugLineNum = 681;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 682;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 684;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 685;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 686;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 687;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_RevisarDocVsListaPrecio\""));
 //BA.debugLineNum = 689;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_concepto_json(anywheresoftware.b4a.BA _ba,Object _me_,String _concepto,String _empresa,String _sucursal,String _bodega,String _lista,String _koen) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 137;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me_";
 //BA.debugLineNum = 145;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Concepto_Json xmlns=\"http://BakApp\">\n"+"			      <_Concepto>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_concepto))+"</_Concepto>\n"+"			      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursal>\n"+"			      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</_Bodega>\n"+"			      <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_lista))+"</_Lista>\n"+"			      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"			    </Sb_Traer_Concepto_Json>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
 //BA.debugLineNum = 159;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 160;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 162;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 163;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 164;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 165;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Concepto_Json\""));
 //BA.debugLineNum = 167;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_descuento_global_x_cliente(anywheresoftware.b4a.BA _ba,Object _me_,String _koen,String _suen) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 515;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuento_Global_";
 //BA.debugLineNum = 517;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_Traer_Descuento_Global_X_Cliente xmlns=\"http://BakApp\">\n"+"		      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"		      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"		      <_Suen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_suen))+"</_Suen>\n"+"		    </Sb_Traer_Descuento_Global_X_Cliente>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
 //BA.debugLineNum = 527;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 528;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 530;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 531;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 532;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 533;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Descuento_Global_X_Cliente\""));
 //BA.debugLineNum = 535;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _sucursal,String _codigo,String _codlista,boolean _prct,String _tict,double _poriva,double _porila,String _koen,boolean _chkvaloresneto) throws Exception{
String _vprct = "";
String _vchkvaloresneto = "";
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 256;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuentos_Setead";
 //BA.debugLineNum = 268;BA.debugLine="Dim vPrct,vChkValoresNeto As String";
_vprct = "";
_vchkvaloresneto = "";
 //BA.debugLineNum = 270;BA.debugLine="If Prct Then";
if (_prct) { 
 //BA.debugLineNum = 271;BA.debugLine="vPrct = \"True\"";
_vprct = "True";
 }else {
 //BA.debugLineNum = 273;BA.debugLine="vPrct = False";
_vprct = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 275;BA.debugLine="If ChkValoresNeto Then";
if (_chkvaloresneto) { 
 //BA.debugLineNum = 276;BA.debugLine="vChkValoresNeto = \"True\"";
_vchkvaloresneto = "True";
 }else {
 //BA.debugLineNum = 278;BA.debugLine="vChkValoresNeto = False";
_vchkvaloresneto = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 281;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			<soap12:Body>\n"+"			<Sb_Traer_Descuentos_Seteados_Desde_Lista xmlns=\"http://BakApp\">\n"+"			<_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			<_Sucursa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursa>\n"+"			<_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</_Codigo>\n"+"			<_CodLista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codlista))+"</_CodLista>\n"+"		      <_Prct>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_prct))+"</_Prct>\n"+"		      <_Tict>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tict))+"</_Tict>\n"+"		      <_PorIva>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_poriva))+"</_PorIva>\n"+"		      <_PorIla>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_porila))+"</_PorIla>\n"+"		      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"		      <_ChkValoresNeto>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_chkvaloresneto))+"</_ChkValoresNeto>\n"+"		    </Sb_Traer_Descuentos_Seteados_Desde_Lista>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
 //BA.debugLineNum = 299;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 300;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 302;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 303;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 304;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 305;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Descuentos_Seteados_Desde_Lista\""));
 //BA.debugLineNum = 307;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_documento(anywheresoftware.b4a.BA _ba,Object _me_,String _tido,String _nudo) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 595;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento(Me_ As";
 //BA.debugLineNum = 597;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Documento xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"			      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"			      <_Nudo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_nudo))+"</_Nudo>\n"+"			    </Sb_Traer_Documento>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
 //BA.debugLineNum = 608;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 609;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 611;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 612;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 613;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 614;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Documento\""));
 //BA.debugLineNum = 616;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 618;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_documento2(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 620;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento2(Me_ As";
 //BA.debugLineNum = 622;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Documento2 xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"			      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"			    </Sb_Traer_Documento2>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
 //BA.debugLineNum = 632;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 633;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 635;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 636;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 637;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 638;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Documento2\""));
 //BA.debugLineNum = 640;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_entidad_json(anywheresoftware.b4a.BA _ba,Object _me_,String _koen,String _suen) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 193;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me_";
 //BA.debugLineNum = 197;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_Traer_Entidad_Json xmlns=\"http://BakApp\">\n"+"      			<Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</Koen>\n"+"      			<Suen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_suen))+"</Suen>\n"+"    			</Sb_Traer_Entidad_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
 //BA.debugLineNum = 206;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 207;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 209;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 210;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 211;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 212;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Entidad_Json\""));
 //BA.debugLineNum = 214;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_productos_json(anywheresoftware.b4a.BA _ba,Object _me_,String _codigo,String _empresa,String _sucursal,String _bodega,String _lista,int _untrans,String _koen) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 102;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me";
 //BA.debugLineNum = 111;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_Traer_Productos_Json xmlns=\"http://BakApp\">\n"+"      			<Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</Codigo>\n"+"      			<Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</Empresa>\n"+"      			<Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</Sucursal>\n"+"      			<Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</Bodega>\n"+"      			<Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_lista))+"</Lista>\n"+"      			<UnTrans>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_untrans))+"</UnTrans>\n"+"      			<Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</Koen>\n"+"    			</Sb_Traer_Productos_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
 //BA.debugLineNum = 125;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 126;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 128;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 129;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 130;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 131;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Productos_Json\""));
 //BA.debugLineNum = 133;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_usar_clave_docdespsimple_poswii(anywheresoftware.b4a.BA _ba,Object _me_,String _clave,String _koen,boolean _eliminar) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 717;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimpl";
 //BA.debugLineNum = 719;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_Usar_Clave_DocDespSimple_Poswii xmlns=\"http://BakApp\">\n"+"				      <_Clave>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_clave))+"</_Clave>\n"+"				      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"				      <_Eliminar>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_eliminar))+"</_Eliminar>\n"+"				    </Sb_Usar_Clave_DocDespSimple_Poswii>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
 //BA.debugLineNum = 729;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 730;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 732;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 733;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 734;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 735;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Usar_Clave_DocDespSimple_Poswii\""));
 //BA.debugLineNum = 737;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 739;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_usar_dscto_poswii(anywheresoftware.b4a.BA _ba,Object _me_,String _clave,String _kofu,boolean _eliminar) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 491;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me_ A";
 //BA.debugLineNum = 493;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"			    <Sb_Usar_Dscto_Poswii xmlns=\"http://BakApp\">\n"+"			      <_Clave>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_clave))+"</_Clave>\n"+"			      <_Kofu>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_kofu))+"</_Kofu>\n"+"			      <_Eliminar>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_eliminar))+"</_Eliminar>\n"+"			    </Sb_Usar_Dscto_Poswii>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
 //BA.debugLineNum = 503;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 504;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 506;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ ((_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
 //BA.debugLineNum = 507;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 508;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 509;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Usar_Dscto_Poswii\""));
 //BA.debugLineNum = 511;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return null;
}
public static boolean  _fx_isemail(anywheresoftware.b4a.BA _ba,String _emailaddress) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
 //BA.debugLineNum = 929;BA.debugLine="Sub Fx_IsEmail(EmailAddress As String) As Boolean";
 //BA.debugLineNum = 930;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
 //BA.debugLineNum = 931;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 932;BA.debugLine="Log(MatchEmail.Match)";
anywheresoftware.b4a.keywords.Common.LogImpl("724969219",_matchemail.getMatch(),0);
 //BA.debugLineNum = 933;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 935;BA.debugLine="Log(\"Oops, Por favor vuelve a comprobar tu direc";
anywheresoftware.b4a.keywords.Common.LogImpl("724969222","Oops, Por favor vuelve a comprobar tu dirección de email",0);
 //BA.debugLineNum = 936;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 938;BA.debugLine="End Sub";
return false;
}
public static String  _fx_nulopornro(anywheresoftware.b4a.BA _ba,Object _value,double _valorxdefecto) throws Exception{
 //BA.debugLineNum = 851;BA.debugLine="Public Sub Fx_NuloPorNro(value As Object, valorxde";
 //BA.debugLineNum = 853;BA.debugLine="If IsNull(value) Then";
if (_isnull(_ba,_value)) { 
 //BA.debugLineNum = 854;BA.debugLine="Return valorxdefecto";
if (true) return BA.NumberToString(_valorxdefecto);
 };
 //BA.debugLineNum = 857;BA.debugLine="Return value";
if (true) return BA.ObjectToString(_value);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return "";
}
public static String  _fx_nuloporstr(anywheresoftware.b4a.BA _ba,Object _value,String _valorxdefecto) throws Exception{
 //BA.debugLineNum = 861;BA.debugLine="Public Sub Fx_NuloPorStr(value As Object,valorxdef";
 //BA.debugLineNum = 863;BA.debugLine="If IsNull(value) Then";
if (_isnull(_ba,_value)) { 
 //BA.debugLineNum = 864;BA.debugLine="Return valorxdefecto";
if (true) return _valorxdefecto;
 };
 //BA.debugLineNum = 867;BA.debugLine="Return value";
if (true) return BA.ObjectToString(_value);
 //BA.debugLineNum = 869;BA.debugLine="End Sub";
return "";
}
public static boolean  _fx_solo_enteros(anywheresoftware.b4a.BA _ba,double _cantidad,String _divisible) throws Exception{
boolean _cant_tiene_decimales = false;
 //BA.debugLineNum = 823;BA.debugLine="Public Sub Fx_Solo_Enteros(Cantidad As Double, Div";
 //BA.debugLineNum = 825;BA.debugLine="Dim Cant_Tiene_Decimales As Boolean";
_cant_tiene_decimales = false;
 //BA.debugLineNum = 827;BA.debugLine="If Cantidad <> 0 Then";
if (_cantidad!=0) { 
 //BA.debugLineNum = 829;BA.debugLine="If  IsNumber(Cantidad) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_cantidad))) { 
 //BA.debugLineNum = 830;BA.debugLine="If NumberFormat(Cantidad,0,0) = Cantidad Then";
if ((anywheresoftware.b4a.keywords.Common.NumberFormat(_cantidad,(int) (0),(int) (0))).equals(BA.NumberToString(_cantidad))) { 
 //BA.debugLineNum = 832;BA.debugLine="Cant_Tiene_Decimales = False";
_cant_tiene_decimales = anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 835;BA.debugLine="Cant_Tiene_Decimales = True";
_cant_tiene_decimales = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 //BA.debugLineNum = 839;BA.debugLine="If Cant_Tiene_Decimales Then";
if (_cant_tiene_decimales) { 
 //BA.debugLineNum = 840;BA.debugLine="If Divisible = \"0\" Or Divisible = \"N\" Then";
if ((_divisible).equals("0") || (_divisible).equals("N")) { 
 //BA.debugLineNum = 841;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 };
 };
 //BA.debugLineNum = 847;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
return false;
}
public static String  _fx_traeclaverd(anywheresoftware.b4a.BA _ba,String _vclave) throws Exception{
int _valorascii = 0;
String _passencriptado = "";
String _letra = "";
long _cadenard = 0L;
int _x = 0;
 //BA.debugLineNum = 741;BA.debugLine="Public Sub Fx_TraeClaveRD(vClave As String) As Str";
 //BA.debugLineNum = 743;BA.debugLine="Dim valorAscii As Int";
_valorascii = 0;
 //BA.debugLineNum = 744;BA.debugLine="Dim PassEncriptado, Letra As String";
_passencriptado = "";
_letra = "";
 //BA.debugLineNum = 745;BA.debugLine="Dim CadenaRD As Long";
_cadenard = 0L;
 //BA.debugLineNum = 746;BA.debugLine="vClave = vClave.Trim";
_vclave = _vclave.trim();
 //BA.debugLineNum = 748;BA.debugLine="For x = 1 To vClave.Length";
{
final int step5 = 1;
final int limit5 = _vclave.length();
_x = (int) (1) ;
for (;_x <= limit5 ;_x = _x + step5 ) {
 //BA.debugLineNum = 750;BA.debugLine="Letra = Mid(vClave,  x, 1)";
_letra = _mid(_ba,_vclave,_x,(int) (1));
 //BA.debugLineNum = 751;BA.debugLine="valorAscii = Asc(Letra)";
_valorascii = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar(_letra));
 //BA.debugLineNum = 754;BA.debugLine="If x = 1 Then";
if (_x==1) { 
 //BA.debugLineNum = 755;BA.debugLine="CadenaRD = (17225 + valorAscii) * 1";
_cadenard = (long) ((17225+_valorascii)*1);
 }else if(_x==2) { 
 //BA.debugLineNum = 757;BA.debugLine="CadenaRD = (1847 + valorAscii) * 8";
_cadenard = (long) ((1847+_valorascii)*8);
 }else if(_x==3) { 
 //BA.debugLineNum = 759;BA.debugLine="CadenaRD = (1217 + valorAscii) * 27";
_cadenard = (long) ((1217+_valorascii)*27);
 }else if(_x==4) { 
 //BA.debugLineNum = 761;BA.debugLine="CadenaRD = (237 + valorAscii) * 64";
_cadenard = (long) ((237+_valorascii)*64);
 }else if(_x==5) { 
 //BA.debugLineNum = 763;BA.debugLine="CadenaRD = (201 + valorAscii) * 125";
_cadenard = (long) ((201+_valorascii)*125);
 };
 //BA.debugLineNum = 766;BA.debugLine="PassEncriptado = PassEncriptado & CadenaRD";
_passencriptado = _passencriptado+BA.NumberToString(_cadenard);
 //BA.debugLineNum = 767;BA.debugLine="CadenaRD = 0";
_cadenard = (long) (0);
 }
};
 //BA.debugLineNum = 770;BA.debugLine="Return PassEncriptado";
if (true) return _passencriptado;
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return "";
}
public static String  _fx_traer_iddispositivo(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
String _id = "";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
 //BA.debugLineNum = 774;BA.debugLine="Sub Fx_Traer_IdDispositivo As String";
 //BA.debugLineNum = 776;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 777;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 778;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 779;BA.debugLine="Dim Api As Int";
_api = 0;
 //BA.debugLineNum = 781;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
 //BA.debugLineNum = 783;BA.debugLine="If Api < 9 Then";
if (_api<9) { 
 //BA.debugLineNum = 785;BA.debugLine="id= p.GetSettings(\"android_id\")";
_id = _p.GetSettings("android_id");
 }else {
 //BA.debugLineNum = 788;BA.debugLine="id= r.GetStaticField(\"android.os.Build\", \"SERIAL";
_id = BA.ObjectToString(_r.GetStaticField("android.os.Build","SERIAL"));
 //BA.debugLineNum = 789;BA.debugLine="If id.ToLowerCase = \"unknown\" Then id= p.GetSett";
if ((_id.toLowerCase()).equals("unknown")) { 
_id = _p.GetSettings("android_id");};
 };
 //BA.debugLineNum = 795;BA.debugLine="Return id";
if (true) return _id;
 //BA.debugLineNum = 797;BA.debugLine="End Sub";
return "";
}
public static boolean  _isnull(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
 //BA.debugLineNum = 871;BA.debugLine="Sub IsNull(O As Object) As Boolean";
 //BA.debugLineNum = 872;BA.debugLine="Return (O=Null)";
if (true) return (_o== null);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return false;
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
 //BA.debugLineNum = 9;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
 //BA.debugLineNum = 10;BA.debugLine="Return Text.SubString2(0, Length)";
if (true) return _text.substring((int) (0),_length);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _ltrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 24;BA.debugLine="Sub LTrim(s As String) As String";
 //BA.debugLineNum = 25;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\s+)",_s);
 //BA.debugLineNum = 26;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 27;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
 //BA.debugLineNum = 29;BA.debugLine="Return s";
if (true) return _s;
 };
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _text,int _start,int _length) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
 //BA.debugLineNum = 19;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_length-1));
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _rellenar_derecha(anywheresoftware.b4a.BA _ba,String _cadena,int _cantcaracteres,String _relleno) throws Exception{
int _i = 0;
String _nro = "";
int _cantidad = 0;
 //BA.debugLineNum = 875;BA.debugLine="Public Sub Rellenar_Derecha(Cadena As String,CantC";
 //BA.debugLineNum = 877;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 878;BA.debugLine="Dim nro As String";
_nro = "";
 //BA.debugLineNum = 879;BA.debugLine="nro = Cadena.Length";
_nro = BA.NumberToString(_cadena.length());
 //BA.debugLineNum = 881;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
_cantidad = (int) (_cantcaracteres-(double)(Double.parseDouble(_nro)));
 //BA.debugLineNum = 883;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
 //BA.debugLineNum = 884;BA.debugLine="For i = 0 To Cantidad - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cantidad-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 885;BA.debugLine="Cadena = Cadena & Relleno";
_cadena = _cadena+_relleno;
 }
};
 };
 //BA.debugLineNum = 889;BA.debugLine="Return Cadena";
if (true) return _cadena;
 //BA.debugLineNum = 891;BA.debugLine="End Sub";
return "";
}
public static String  _rellenar_izquierda(anywheresoftware.b4a.BA _ba,String _cadena,int _cantcaracteres,String _relleno) throws Exception{
int _i = 0;
String _nro = "";
int _cantidad = 0;
 //BA.debugLineNum = 893;BA.debugLine="Public Sub Rellenar_Izquierda(Cadena As String,Can";
 //BA.debugLineNum = 895;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 896;BA.debugLine="Dim nro As String";
_nro = "";
 //BA.debugLineNum = 897;BA.debugLine="nro = Cadena.Length";
_nro = BA.NumberToString(_cadena.length());
 //BA.debugLineNum = 899;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
_cantidad = (int) (_cantcaracteres-(double)(Double.parseDouble(_nro)));
 //BA.debugLineNum = 901;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
 //BA.debugLineNum = 902;BA.debugLine="For i = 0 To Cantidad - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cantidad-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 903;BA.debugLine="Cadena = Relleno & Cadena";
_cadena = _relleno+_cadena;
 }
};
 };
 //BA.debugLineNum = 907;BA.debugLine="Return Cadena";
if (true) return _cadena;
 //BA.debugLineNum = 909;BA.debugLine="End Sub";
return "";
}
public static String  _right(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
 //BA.debugLineNum = 14;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
 //BA.debugLineNum = 15;BA.debugLine="Return Text.SubString(Text.Length-Length)";
if (true) return _text.substring((int) (_text.length()-_length));
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _rtrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub RTrim(s As String) As String";
 //BA.debugLineNum = 36;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("(\\s+)$",_s);
 //BA.debugLineNum = 37;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 38;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
 //BA.debugLineNum = 40;BA.debugLine="Return s";
if (true) return _s;
 };
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _rutdigito(anywheresoftware.b4a.BA _ba,long _numero) throws Exception{
int _cuenta = 0;
int _suma = 0;
int _resto = 0;
int _digito = 0;
double _dig = 0;
int _nro = 0;
 //BA.debugLineNum = 940;BA.debugLine="Sub RutDigito(numero As Long) As String";
 //BA.debugLineNum = 942;BA.debugLine="Dim cuenta, Suma, resto, Digito As Int";
_cuenta = 0;
_suma = 0;
_resto = 0;
_digito = 0;
 //BA.debugLineNum = 943;BA.debugLine="Dim dig As Double";
_dig = 0;
 //BA.debugLineNum = 944;BA.debugLine="Suma = 0";
_suma = (int) (0);
 //BA.debugLineNum = 945;BA.debugLine="cuenta = 2";
_cuenta = (int) (2);
 //BA.debugLineNum = 947;BA.debugLine="Do Until numero = 0";
while (!(_numero==0)) {
 //BA.debugLineNum = 948;BA.debugLine="dig = numero Mod 10";
_dig = _numero%10;
 //BA.debugLineNum = 949;BA.debugLine="Dim Nro As Int = numero/10";
_nro = (int) (_numero/(double)10);
 //BA.debugLineNum = 950;BA.debugLine="numero = Nro";
_numero = (long) (_nro);
 //BA.debugLineNum = 952;BA.debugLine="Suma = Suma + (dig * cuenta)";
_suma = (int) (_suma+(_dig*_cuenta));
 //BA.debugLineNum = 953;BA.debugLine="cuenta = cuenta + 1";
_cuenta = (int) (_cuenta+1);
 //BA.debugLineNum = 954;BA.debugLine="If cuenta = 8 Then cuenta = 2";
if (_cuenta==8) { 
_cuenta = (int) (2);};
 }
;
 //BA.debugLineNum = 957;BA.debugLine="resto = Suma Mod 11";
_resto = (int) (_suma%11);
 //BA.debugLineNum = 958;BA.debugLine="Digito = 11 - resto";
_digito = (int) (11-_resto);
 //BA.debugLineNum = 960;BA.debugLine="Select Case Digito";
switch (_digito) {
case 10: {
 //BA.debugLineNum = 961;BA.debugLine="Case 10 : Return \"K\"";
if (true) return "K";
 break; }
case 11: {
 //BA.debugLineNum = 962;BA.debugLine="Case 11 : Return \"0\"";
if (true) return "0";
 break; }
default: {
 //BA.debugLineNum = 963;BA.debugLine="Case Else : Return Digito' Trim(Str(Digito))";
if (true) return BA.NumberToString(_digito);
 break; }
}
;
 //BA.debugLineNum = 966;BA.debugLine="End Sub";
return "";
}
public static String  _sb_borrar_todos_registros_de_tabla(anywheresoftware.b4a.BA _ba,String _tabla,String _campo) throws Exception{
String _consulta_sql = "";
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
String _id = "";
 //BA.debugLineNum = 968;BA.debugLine="Sub Sb_Borrar_Todos_Registros_De_Tabla(Tabla As St";
 //BA.debugLineNum = 970;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 971;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 972;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
 //BA.debugLineNum = 974;BA.debugLine="Tabla = Tabla.ToLowerCase";
_tabla = _tabla.toLowerCase();
 //BA.debugLineNum = 975;BA.debugLine="Campo = Campo.ToLowerCase";
_campo = _campo.toLowerCase();
 //BA.debugLineNum = 977;BA.debugLine="Consulta_Sql = \"Select \" & Campo & \" From \" & Tab";
_consulta_sql = "Select "+_campo+" From "+_tabla;
 //BA.debugLineNum = 979;BA.debugLine="Table = DBUtils.ExecuteMemoryTable(Variables.vSql";
_table = mostCurrent._dbutils._executememorytable /*anywheresoftware.b4a.objects.collections.List*/ (_ba,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,_consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
 //BA.debugLineNum = 981;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 982;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
 //BA.debugLineNum = 983;BA.debugLine="Dim Id = Cols(0)";
_id = _cols[(int) (0)];
 //BA.debugLineNum = 984;BA.debugLine="Consulta_Sql = \"Delete From [\" & Tabla & \"] Wher";
_consulta_sql = "Delete From ["+_tabla+"] Where ["+_campo+"] = ?";
 //BA.debugLineNum = 985;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(_consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
 }
};
 //BA.debugLineNum = 988;BA.debugLine="End Sub";
return "";
}
public static String  _sb_borrartodoslosregistrosdelabasededatos(anywheresoftware.b4a.BA _ba) throws Exception{
String _consulta_sql = "";
 //BA.debugLineNum = 990;BA.debugLine="Sub Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos";
 //BA.debugLineNum = 992;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 994;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc]\"";
_consulta_sql = "Delete From [Descuentos_Doc]";
 //BA.debugLineNum = 995;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
 //BA.debugLineNum = 997;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc]\"";
_consulta_sql = "Delete From [DespaFacil_Doc]";
 //BA.debugLineNum = 998;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
 //BA.debugLineNum = 1000;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc]\"";
_consulta_sql = "Delete From [Detalle_Doc]";
 //BA.debugLineNum = 1001;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
 //BA.debugLineNum = 1003;BA.debugLine="Consulta_Sql = \"Delete From [Encabezado_Doc]\"";
_consulta_sql = "Delete From [Encabezado_Doc]";
 //BA.debugLineNum = 1004;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
 //BA.debugLineNum = 1006;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc]\"";
_consulta_sql = "Delete From [Impuestos_Doc]";
 //BA.debugLineNum = 1007;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
 //BA.debugLineNum = 1009;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc]\"";
_consulta_sql = "Delete From [Observaciones_Doc]";
 //BA.debugLineNum = 1010;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
 //BA.debugLineNum = 1012;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _text,String _delimiter) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
 //BA.debugLineNum = 45;BA.debugLine="Return Regex.Split(Delimiter,Text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_text);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
}
