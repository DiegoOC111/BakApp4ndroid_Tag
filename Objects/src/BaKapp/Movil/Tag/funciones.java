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
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _fx_traer_iddispositivo(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_traer_iddispositivo", false))
	 {return ((String) Debug.delegate(null, "fx_traer_iddispositivo", new Object[] {_ba}));}
anywheresoftware.b4a.phone.Phone _p = null;
String _id = "";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub Fx_Traer_IdDispositivo As String";
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=24444933;
 //BA.debugLineNum = 24444933;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=24444937;
 //BA.debugLineNum = 24444937;BA.debugLine="If Api < 9 Then";
if (_api<9) { 
RDebugUtils.currentLine=24444939;
 //BA.debugLineNum = 24444939;BA.debugLine="id= p.GetSettings(\"android_id\")";
_id = _p.GetSettings("android_id");
 }else {
RDebugUtils.currentLine=24444942;
 //BA.debugLineNum = 24444942;BA.debugLine="id= r.GetStaticField(\"android.os.Build\", \"SERIAL";
_id = BA.ObjectToString(_r.GetStaticField("android.os.Build","SERIAL"));
RDebugUtils.currentLine=24444943;
 //BA.debugLineNum = 24444943;BA.debugLine="If id.ToLowerCase = \"unknown\" Then id= p.GetSett";
if ((_id.toLowerCase()).equals("unknown")) { 
_id = _p.GetSettings("android_id");};
 };
RDebugUtils.currentLine=24444949;
 //BA.debugLineNum = 24444949;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=24444951;
 //BA.debugLineNum = 24444951;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getdataset_json(anywheresoftware.b4a.BA _ba,String _consulta_sql,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_getdataset_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_getdataset_json", new Object[] {_ba,_consulta_sql,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Json(Consult";
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_GetDataSet_Json xmlns=\"http://BakApp\">\n"+"      			<Consulta_Sql>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_consulta_sql))+"</Consulta_Sql>\n"+"    			</Sb_GetDataSet_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=22872078;
 //BA.debugLineNum = 22872078;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=22872079;
 //BA.debugLineNum = 22872079;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=22872080;
 //BA.debugLineNum = 22872080;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_GetDataSet_Json\""));
RDebugUtils.currentLine=22872082;
 //BA.debugLineNum = 22872082;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=22872084;
 //BA.debugLineNum = 22872084;BA.debugLine="End Sub";
return null;
}
public static String  _fx_traeclaverd(anywheresoftware.b4a.BA _ba,String _vclave) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_traeclaverd", false))
	 {return ((String) Debug.delegate(null, "fx_traeclaverd", new Object[] {_ba,_vclave}));}
int _valorascii = 0;
String _passencriptado = "";
String _letra = "";
long _cadenard = 0L;
int _x = 0;
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub Fx_TraeClaveRD(vClave As String) As Str";
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Dim valorAscii As Int";
_valorascii = 0;
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="Dim PassEncriptado, Letra As String";
_passencriptado = "";
_letra = "";
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Dim CadenaRD As Long";
_cadenard = 0L;
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="vClave = vClave.Trim";
_vclave = _vclave.trim();
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="For x = 1 To vClave.Length";
{
final int step5 = 1;
final int limit5 = _vclave.length();
_x = (int) (1) ;
for (;_x <= limit5 ;_x = _x + step5 ) {
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="Letra = Mid(vClave,  x, 1)";
_letra = _mid(_ba,_vclave,_x,(int) (1));
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="valorAscii = Asc(Letra)";
_valorascii = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar(_letra));
RDebugUtils.currentLine=24379405;
 //BA.debugLineNum = 24379405;BA.debugLine="If x = 1 Then";
if (_x==1) { 
RDebugUtils.currentLine=24379406;
 //BA.debugLineNum = 24379406;BA.debugLine="CadenaRD = (17225 + valorAscii) * 1";
_cadenard = (long) ((17225+_valorascii)*1);
 }else 
{RDebugUtils.currentLine=24379407;
 //BA.debugLineNum = 24379407;BA.debugLine="Else If x = 2 Then";
if (_x==2) { 
RDebugUtils.currentLine=24379408;
 //BA.debugLineNum = 24379408;BA.debugLine="CadenaRD = (1847 + valorAscii) * 8";
_cadenard = (long) ((1847+_valorascii)*8);
 }else 
{RDebugUtils.currentLine=24379409;
 //BA.debugLineNum = 24379409;BA.debugLine="Else If x = 3 Then";
if (_x==3) { 
RDebugUtils.currentLine=24379410;
 //BA.debugLineNum = 24379410;BA.debugLine="CadenaRD = (1217 + valorAscii) * 27";
_cadenard = (long) ((1217+_valorascii)*27);
 }else 
{RDebugUtils.currentLine=24379411;
 //BA.debugLineNum = 24379411;BA.debugLine="Else If x = 4 Then";
if (_x==4) { 
RDebugUtils.currentLine=24379412;
 //BA.debugLineNum = 24379412;BA.debugLine="CadenaRD = (237 + valorAscii) * 64";
_cadenard = (long) ((237+_valorascii)*64);
 }else 
{RDebugUtils.currentLine=24379413;
 //BA.debugLineNum = 24379413;BA.debugLine="Else If x = 5 Then";
if (_x==5) { 
RDebugUtils.currentLine=24379414;
 //BA.debugLineNum = 24379414;BA.debugLine="CadenaRD = (201 + valorAscii) * 125";
_cadenard = (long) ((201+_valorascii)*125);
 }}}}}
;
RDebugUtils.currentLine=24379417;
 //BA.debugLineNum = 24379417;BA.debugLine="PassEncriptado = PassEncriptado & CadenaRD";
_passencriptado = _passencriptado+BA.NumberToString(_cadenard);
RDebugUtils.currentLine=24379418;
 //BA.debugLineNum = 24379418;BA.debugLine="CadenaRD = 0";
_cadenard = (long) (0);
 }
};
RDebugUtils.currentLine=24379421;
 //BA.debugLineNum = 24379421;BA.debugLine="Return PassEncriptado";
if (true) return _passencriptado;
RDebugUtils.currentLine=24379423;
 //BA.debugLineNum = 24379423;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fx_datarow(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_datarow", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "fx_datarow", new Object[] {_ba,_vgetstring_json}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="public Sub Fx_DataRow(vGetString_Json As String) A";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Dim Table As List = Fx_DataSet(vGetString_Json).G";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_fx_dataset(_ba,_vgetstring_json).Get((Object)("Table"))));
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="Dim Row As Map = Table.Get(0)";
_row = new anywheresoftware.b4a.objects.collections.Map();
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_table.Get((int) (0))));
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Return Row";
if (true) return _row;
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return null;
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _text,int _start,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "mid", false))
	 {return ((String) Debug.delegate(null, "mid", new Object[] {_ba,_text,_start,_length}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_length-1));
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return "";
}
public static String  _fx_cadena_a_buscar_sql(anywheresoftware.b4a.BA _ba,String _vcadena,String _vcampo,String _vand_or) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_cadena_a_buscar_sql", false))
	 {return ((String) Debug.delegate(null, "fx_cadena_a_buscar_sql", new Object[] {_ba,_vcadena,_vcampo,_vand_or}));}
String _linea1 = "";
String _linea2 = "";
String _vconcatenar = "";
int _i = 0;
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Public Sub Fx_Cadena_a_buscar_SQL(vCadena As Strin";
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="Dim linea1, linea2 As String";
_linea1 = "";
_linea2 = "";
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="Dim vConcatenar As String = \"\"";
_vconcatenar = "";
RDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="If vAnd_Or = \"\" Then vAnd_Or = \"And\"";
if ((_vand_or).equals("")) { 
_vand_or = "And";};
RDebugUtils.currentLine=24510474;
 //BA.debugLineNum = 24510474;BA.debugLine="For i = 1 To vCadena.Length' Len(vCadena)";
{
final int step4 = 1;
final int limit4 = _vcadena.length();
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=24510475;
 //BA.debugLineNum = 24510475;BA.debugLine="linea1 = LTrim(Mid(vCadena, i, 1)).ToUpperCase'U";
_linea1 = _ltrim(_ba,_mid(_ba,_vcadena,_i,(int) (1))).toUpperCase();
RDebugUtils.currentLine=24510476;
 //BA.debugLineNum = 24510476;BA.debugLine="linea2 = linea1.ToLowerCase'LCase(linea1)";
_linea2 = _linea1.toLowerCase();
RDebugUtils.currentLine=24510478;
 //BA.debugLineNum = 24510478;BA.debugLine="If linea1 = \"\" Then";
if ((_linea1).equals("")) { 
RDebugUtils.currentLine=24510479;
 //BA.debugLineNum = 24510479;BA.debugLine="vConcatenar = vConcatenar & \"%' \" & vAnd_Or & \"";
_vconcatenar = _vconcatenar+"%' "+_vand_or+" "+_vcampo;
 }else {
RDebugUtils.currentLine=24510481;
 //BA.debugLineNum = 24510481;BA.debugLine="vConcatenar = vConcatenar & \"[\" & linea1 & line";
_vconcatenar = _vconcatenar+"["+_linea1+_linea2+"]";
 };
 }
};
RDebugUtils.currentLine=24510484;
 //BA.debugLineNum = 24510484;BA.debugLine="Return vConcatenar";
if (true) return _vconcatenar;
RDebugUtils.currentLine=24510486;
 //BA.debugLineNum = 24510486;BA.debugLine="End Sub";
return "";
}
public static String  _rutdigito(anywheresoftware.b4a.BA _ba,long _numero) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rutdigito", false))
	 {return ((String) Debug.delegate(null, "rutdigito", new Object[] {_ba,_numero}));}
int _cuenta = 0;
int _suma = 0;
int _resto = 0;
int _digito = 0;
double _dig = 0;
int _nro = 0;
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Sub RutDigito(numero As Long) As String";
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="Dim cuenta, Suma, resto, Digito As Int";
_cuenta = 0;
_suma = 0;
_resto = 0;
_digito = 0;
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="Dim dig As Double";
_dig = 0;
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="Suma = 0";
_suma = (int) (0);
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="cuenta = 2";
_cuenta = (int) (2);
RDebugUtils.currentLine=25100295;
 //BA.debugLineNum = 25100295;BA.debugLine="Do Until numero = 0";
while (!(_numero==0)) {
RDebugUtils.currentLine=25100296;
 //BA.debugLineNum = 25100296;BA.debugLine="dig = numero Mod 10";
_dig = _numero%10;
RDebugUtils.currentLine=25100297;
 //BA.debugLineNum = 25100297;BA.debugLine="Dim Nro As Int = numero/10";
_nro = (int) (_numero/(double)10);
RDebugUtils.currentLine=25100298;
 //BA.debugLineNum = 25100298;BA.debugLine="numero = Nro";
_numero = (long) (_nro);
RDebugUtils.currentLine=25100300;
 //BA.debugLineNum = 25100300;BA.debugLine="Suma = Suma + (dig * cuenta)";
_suma = (int) (_suma+(_dig*_cuenta));
RDebugUtils.currentLine=25100301;
 //BA.debugLineNum = 25100301;BA.debugLine="cuenta = cuenta + 1";
_cuenta = (int) (_cuenta+1);
RDebugUtils.currentLine=25100302;
 //BA.debugLineNum = 25100302;BA.debugLine="If cuenta = 8 Then cuenta = 2";
if (_cuenta==8) { 
_cuenta = (int) (2);};
 }
;
RDebugUtils.currentLine=25100305;
 //BA.debugLineNum = 25100305;BA.debugLine="resto = Suma Mod 11";
_resto = (int) (_suma%11);
RDebugUtils.currentLine=25100306;
 //BA.debugLineNum = 25100306;BA.debugLine="Digito = 11 - resto";
_digito = (int) (11-_resto);
RDebugUtils.currentLine=25100308;
 //BA.debugLineNum = 25100308;BA.debugLine="Select Case Digito";
switch (_digito) {
case 10: {
RDebugUtils.currentLine=25100309;
 //BA.debugLineNum = 25100309;BA.debugLine="Case 10 : Return \"K\"";
if (true) return "K";
 break; }
case 11: {
RDebugUtils.currentLine=25100310;
 //BA.debugLineNum = 25100310;BA.debugLine="Case 11 : Return \"0\"";
if (true) return "0";
 break; }
default: {
RDebugUtils.currentLine=25100311;
 //BA.debugLineNum = 25100311;BA.debugLine="Case Else : Return Digito' Trim(Str(Digito))";
if (true) return BA.NumberToString(_digito);
 break; }
}
;
RDebugUtils.currentLine=25100314;
 //BA.debugLineNum = 25100314;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_entidad_json(anywheresoftware.b4a.BA _ba,Object _me_,String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_entidad_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_entidad_json", new Object[] {_ba,_me_,_koen,_suen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me_";
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_Traer_Entidad_Json xmlns=\"http://BakApp\">\n"+"      			<Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</Koen>\n"+"      			<Suen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_suen))+"</Suen>\n"+"    			</Sb_Traer_Entidad_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23134222;
 //BA.debugLineNum = 23134222;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23134225;
 //BA.debugLineNum = 23134225;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23134226;
 //BA.debugLineNum = 23134226;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23134227;
 //BA.debugLineNum = 23134227;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Entidad_Json\""));
RDebugUtils.currentLine=23134229;
 //BA.debugLineNum = 23134229;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23134231;
 //BA.debugLineNum = 23134231;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _fx_datatable(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_datatable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "fx_datatable", new Object[] {_ba,_vgetstring_json}));}
anywheresoftware.b4a.objects.collections.Map _ds = null;
anywheresoftware.b4a.objects.collections.List _table = null;
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="public Sub Fx_DataTable(vGetString_Json As String)";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Dim Ds As Map = Fx_DataSet(vGetString_Json)";
_ds = new anywheresoftware.b4a.objects.collections.Map();
_ds = _fx_dataset(_ba,_vgetstring_json);
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="Dim Table As List = Ds.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ds.Get((Object)("Table"))));
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="Return Table";
if (true) return _table;
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_productos_json(anywheresoftware.b4a.BA _ba,Object _me_,String _codigo,String _empresa,String _sucursal,String _bodega,String _lista,int _untrans,String _koen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_productos_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_productos_json", new Object[] {_ba,_me_,_codigo,_empresa,_sucursal,_bodega,_lista,_untrans,_koen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me";
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_Traer_Productos_Json xmlns=\"http://BakApp\">\n"+"      			<Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</Codigo>\n"+"      			<Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</Empresa>\n"+"      			<Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</Sucursal>\n"+"      			<Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</Bodega>\n"+"      			<Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_lista))+"</Lista>\n"+"      			<UnTrans>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_untrans))+"</UnTrans>\n"+"      			<Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</Koen>\n"+"    			</Sb_Traer_Productos_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=22937623;
 //BA.debugLineNum = 22937623;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=22937624;
 //BA.debugLineNum = 22937624;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=22937626;
 //BA.debugLineNum = 22937626;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=22937627;
 //BA.debugLineNum = 22937627;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=22937628;
 //BA.debugLineNum = 22937628;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=22937629;
 //BA.debugLineNum = 22937629;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Productos_Json\""));
RDebugUtils.currentLine=22937631;
 //BA.debugLineNum = 22937631;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=22937633;
 //BA.debugLineNum = 22937633;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_enviarcorreobakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _modalidad,String _codfuncionario,int _idmaeedo,String _para,String _cc) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_enviarcorreobakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_enviarcorreobakapp", new Object[] {_ba,_me_,_empresa,_modalidad,_codfuncionario,_idmaeedo,_para,_cc}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarCorreoBakapp(Me_";
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_EnviarCorreoBakapp xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"			      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			      <_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"			      <_CodFuncionario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codfuncionario))+"</_CodFuncionario>\n"+"			      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"			      <_Para>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_para))+"</_Para>\n"+"			      <_Cc>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cc))+"</_Cc>\n"+"			    </Sb_EnviarCorreoBakapp>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=23920657;
 //BA.debugLineNum = 23920657;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23920658;
 //BA.debugLineNum = 23920658;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23920660;
 //BA.debugLineNum = 23920660;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23920661;
 //BA.debugLineNum = 23920661;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23920662;
 //BA.debugLineNum = 23920662;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23920663;
 //BA.debugLineNum = 23920663;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EnviarCorreoBakapp\""));
RDebugUtils.currentLine=23920665;
 //BA.debugLineNum = 23920665;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23920667;
 //BA.debugLineNum = 23920667;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_formatomodalidad(anywheresoftware.b4a.BA _ba,String _empresa,String _modalidad,String _tido,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_formatomodalidad", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_formatomodalidad", new Object[] {_ba,_empresa,_modalidad,_tido,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_FormatoModalidad(Empres";
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_FormatoModalidad xmlns=\"http://BakApp\">\n"+"				      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"				      <_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"				      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"				    </Sb_FormatoModalidad>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=24248335;
 //BA.debugLineNum = 24248335;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=24248336;
 //BA.debugLineNum = 24248336;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=24248337;
 //BA.debugLineNum = 24248337;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=24248338;
 //BA.debugLineNum = 24248338;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_FormatoModalidad\""));
RDebugUtils.currentLine=24248340;
 //BA.debugLineNum = 24248340;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=24248342;
 //BA.debugLineNum = 24248342;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_enviarimprimirbakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _modalidad,String _codfuncionario,int _idmaeedo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_enviarimprimirbakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_enviarimprimirbakapp", new Object[] {_ba,_me_,_empresa,_modalidad,_codfuncionario,_idmaeedo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me";
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				<soap12:Body>\n"+"					<Sb_EnviarImprimirBakapp xmlns=\"http://BakApp\">\n"+"						<_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"						<_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"						<_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"						<_CodFuncionario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codfuncionario))+"</_CodFuncionario>\n"+"						<_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"					</Sb_EnviarImprimirBakapp>\n"+"				</soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=23855119;
 //BA.debugLineNum = 23855119;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23855120;
 //BA.debugLineNum = 23855120;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23855122;
 //BA.debugLineNum = 23855122;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23855123;
 //BA.debugLineNum = 23855123;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23855124;
 //BA.debugLineNum = 23855124;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23855125;
 //BA.debugLineNum = 23855125;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EnviarImprimirBakapp\""));
RDebugUtils.currentLine=23855127;
 //BA.debugLineNum = 23855127;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23855129;
 //BA.debugLineNum = 23855129;BA.debugLine="End Sub";
return null;
}
public static boolean  _fx_isemail(anywheresoftware.b4a.BA _ba,String _emailaddress) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_isemail", false))
	 {return ((Boolean) Debug.delegate(null, "fx_isemail", new Object[] {_ba,_emailaddress}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Sub Fx_IsEmail(EmailAddress As String) As Boolean";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="Log(MatchEmail.Match)";
anywheresoftware.b4a.keywords.Common.LogImpl("625034755",_matchemail.getMatch(),0);
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=25034758;
 //BA.debugLineNum = 25034758;BA.debugLine="Log(\"Oops, Por favor vuelve a comprobar tu direc";
anywheresoftware.b4a.keywords.Common.LogImpl("625034758","Oops, Por favor vuelve a comprobar tu dirección de email",0);
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=25034761;
 //BA.debugLineNum = 25034761;BA.debugLine="End Sub";
return false;
}
public static String  _ltrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ltrim", false))
	 {return ((String) Debug.delegate(null, "ltrim", new Object[] {_ba,_s}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Sub LTrim(s As String) As String";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\s+)",_s);
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revcarpetatmp(anywheresoftware.b4a.BA _ba,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_revcarpetatmp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_revcarpetatmp", new Object[] {_ba,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevCarpetaTmp (Me_ As O";
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_RevCarpetaTmpResponse xmlns=\"http://BakApp\" />\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23396362;
 //BA.debugLineNum = 23396362;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23396365;
 //BA.debugLineNum = 23396365;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23396366;
 //BA.debugLineNum = 23396366;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23396367;
 //BA.debugLineNum = 23396367;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_RevCarpetaTmp\""));
RDebugUtils.currentLine=23396369;
 //BA.debugLineNum = 23396369;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23396371;
 //BA.debugLineNum = 23396371;BA.debugLine="End Sub";
return null;
}
public static boolean  _fx_solo_enteros(anywheresoftware.b4a.BA _ba,double _cantidad,String _divisible) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_solo_enteros", false))
	 {return ((Boolean) Debug.delegate(null, "fx_solo_enteros", new Object[] {_ba,_cantidad,_divisible}));}
boolean _cant_tiene_decimales = false;
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub Fx_Solo_Enteros(Cantidad As Double, Div";
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="Dim Cant_Tiene_Decimales As Boolean";
_cant_tiene_decimales = false;
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="If Cantidad <> 0 Then";
if (_cantidad!=0) { 
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="If  IsNumber(Cantidad) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_cantidad))) { 
RDebugUtils.currentLine=24576007;
 //BA.debugLineNum = 24576007;BA.debugLine="If NumberFormat(Cantidad,0,0) = Cantidad Then";
if ((anywheresoftware.b4a.keywords.Common.NumberFormat(_cantidad,(int) (0),(int) (0))).equals(BA.NumberToString(_cantidad))) { 
RDebugUtils.currentLine=24576009;
 //BA.debugLineNum = 24576009;BA.debugLine="Cant_Tiene_Decimales = False";
_cant_tiene_decimales = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=24576012;
 //BA.debugLineNum = 24576012;BA.debugLine="Cant_Tiene_Decimales = True";
_cant_tiene_decimales = anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=24576016;
 //BA.debugLineNum = 24576016;BA.debugLine="If Cant_Tiene_Decimales Then";
if (_cant_tiene_decimales) { 
RDebugUtils.currentLine=24576017;
 //BA.debugLineNum = 24576017;BA.debugLine="If Divisible = \"0\" Or Divisible = \"N\" Then";
if ((_divisible).equals("0") || (_divisible).equals("N")) { 
RDebugUtils.currentLine=24576018;
 //BA.debugLineNum = 24576018;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 };
 };
RDebugUtils.currentLine=24576024;
 //BA.debugLineNum = 24576024;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=24576026;
 //BA.debugLineNum = 24576026;BA.debugLine="End Sub";
return false;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_concepto_json(anywheresoftware.b4a.BA _ba,Object _me_,String _concepto,String _empresa,String _sucursal,String _bodega,String _lista,String _koen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_concepto_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_concepto_json", new Object[] {_ba,_me_,_concepto,_empresa,_sucursal,_bodega,_lista,_koen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me_";
RDebugUtils.currentLine=23003144;
 //BA.debugLineNum = 23003144;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Concepto_Json xmlns=\"http://BakApp\">\n"+"			      <_Concepto>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_concepto))+"</_Concepto>\n"+"			      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursal>\n"+"			      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</_Bodega>\n"+"			      <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_lista))+"</_Lista>\n"+"			      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"			    </Sb_Traer_Concepto_Json>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=23003158;
 //BA.debugLineNum = 23003158;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23003159;
 //BA.debugLineNum = 23003159;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23003161;
 //BA.debugLineNum = 23003161;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23003162;
 //BA.debugLineNum = 23003162;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23003163;
 //BA.debugLineNum = 23003163;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23003164;
 //BA.debugLineNum = 23003164;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Concepto_Json\""));
RDebugUtils.currentLine=23003166;
 //BA.debugLineNum = 23003166;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23003168;
 //BA.debugLineNum = 23003168;BA.debugLine="End Sub";
return null;
}
public static String  _rellenar_izquierda(anywheresoftware.b4a.BA _ba,String _cadena,int _cantcaracteres,String _relleno) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rellenar_izquierda", false))
	 {return ((String) Debug.delegate(null, "rellenar_izquierda", new Object[] {_ba,_cadena,_cantcaracteres,_relleno}));}
int _i = 0;
String _nro = "";
int _cantidad = 0;
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Public Sub Rellenar_Izquierda(Cadena As String,Can";
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="Dim nro As String";
_nro = "";
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="nro = Cadena.Length";
_nro = BA.NumberToString(_cadena.length());
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
_cantidad = (int) (_cantcaracteres-(double)(Double.parseDouble(_nro)));
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=24903689;
 //BA.debugLineNum = 24903689;BA.debugLine="For i = 0 To Cantidad - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cantidad-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=24903690;
 //BA.debugLineNum = 24903690;BA.debugLine="Cadena = Relleno & Cadena";
_cadena = _relleno+_cadena;
 }
};
 };
RDebugUtils.currentLine=24903694;
 //BA.debugLineNum = 24903694;BA.debugLine="Return Cadena";
if (true) return _cadena;
RDebugUtils.currentLine=24903696;
 //BA.debugLineNum = 24903696;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revisardocvslistaprecio(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo,int _vnta_dias_venci_coti) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_revisardocvslistaprecio", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_revisardocvslistaprecio", new Object[] {_ba,_me_,_idmaeedo,_vnta_dias_venci_coti}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio";
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_RevisarDocVsListaPrecio xmlns=\"http://BakApp\">\n"+"				      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"				      <_Vnta_Dias_Venci_Coti>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_vnta_dias_venci_coti))+"</_Vnta_Dias_Venci_Coti>\n"+"				    </Sb_RevisarDocVsListaPrecio>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=24182796;
 //BA.debugLineNum = 24182796;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=24182797;
 //BA.debugLineNum = 24182797;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=24182799;
 //BA.debugLineNum = 24182799;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=24182800;
 //BA.debugLineNum = 24182800;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=24182801;
 //BA.debugLineNum = 24182801;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=24182802;
 //BA.debugLineNum = 24182802;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_RevisarDocVsListaPrecio\""));
RDebugUtils.currentLine=24182804;
 //BA.debugLineNum = 24182804;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=24182806;
 //BA.debugLineNum = 24182806;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_actualizar_observaciones_documento(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo,String _obdo,String _ocdo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_actualizar_observaciones_documento", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_actualizar_observaciones_documento", new Object[] {_ba,_me_,_idmaeedo,_obdo,_ocdo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Actualizar_Observacione";
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_Actualizar_Observaciones_Documento xmlns=\"http://BakApp\">\n"+"				      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"				      <_Observaciones>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_obdo))+"</_Observaciones>\n"+"				      <_Orden_De_Compra>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_ocdo))+"</_Orden_De_Compra>\n"+"				    </Sb_Actualizar_Observaciones_Documento>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=24117264;
 //BA.debugLineNum = 24117264;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=24117265;
 //BA.debugLineNum = 24117265;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=24117266;
 //BA.debugLineNum = 24117266;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=24117267;
 //BA.debugLineNum = 24117267;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Actualizar_Observaciones_Documento\""));
RDebugUtils.currentLine=24117269;
 //BA.debugLineNum = 24117269;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=24117271;
 //BA.debugLineNum = 24117271;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_documento(anywheresoftware.b4a.BA _ba,Object _me_,String _tido,String _nudo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_documento", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_documento", new Object[] {_ba,_me_,_tido,_nudo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento(Me_ As";
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Documento xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"			      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"			      <_Nudo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_nudo))+"</_Nudo>\n"+"			    </Sb_Traer_Documento>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23986190;
 //BA.debugLineNum = 23986190;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23986192;
 //BA.debugLineNum = 23986192;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23986193;
 //BA.debugLineNum = 23986193;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23986194;
 //BA.debugLineNum = 23986194;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23986195;
 //BA.debugLineNum = 23986195;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Documento\""));
RDebugUtils.currentLine=23986197;
 //BA.debugLineNum = 23986197;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23986199;
 //BA.debugLineNum = 23986199;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_documento2(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_documento2", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_documento2", new Object[] {_ba,_me_,_idmaeedo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento2(Me_ As";
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Documento2 xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"			      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"			    </Sb_Traer_Documento2>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=24051724;
 //BA.debugLineNum = 24051724;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=24051725;
 //BA.debugLineNum = 24051725;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=24051727;
 //BA.debugLineNum = 24051727;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=24051728;
 //BA.debugLineNum = 24051728;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=24051729;
 //BA.debugLineNum = 24051729;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=24051730;
 //BA.debugLineNum = 24051730;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Documento2\""));
RDebugUtils.currentLine=24051732;
 //BA.debugLineNum = 24051732;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=24051734;
 //BA.debugLineNum = 24051734;BA.debugLine="End Sub";
return null;
}
public static String  _sb_borrartodoslosregistrosdelabasededatos(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sb_borrartodoslosregistrosdelabasededatos", false))
	 {return ((String) Debug.delegate(null, "sb_borrartodoslosregistrosdelabasededatos", new Object[] {_ba}));}
String _consulta_sql = "";
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Sub Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos";
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc]\"";
_consulta_sql = "Delete From [Descuentos_Doc]";
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc]\"";
_consulta_sql = "Delete From [DespaFacil_Doc]";
RDebugUtils.currentLine=25231368;
 //BA.debugLineNum = 25231368;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=25231370;
 //BA.debugLineNum = 25231370;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc]\"";
_consulta_sql = "Delete From [Detalle_Doc]";
RDebugUtils.currentLine=25231371;
 //BA.debugLineNum = 25231371;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=25231373;
 //BA.debugLineNum = 25231373;BA.debugLine="Consulta_Sql = \"Delete From [Encabezado_Doc]\"";
_consulta_sql = "Delete From [Encabezado_Doc]";
RDebugUtils.currentLine=25231374;
 //BA.debugLineNum = 25231374;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=25231376;
 //BA.debugLineNum = 25231376;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc]\"";
_consulta_sql = "Delete From [Impuestos_Doc]";
RDebugUtils.currentLine=25231377;
 //BA.debugLineNum = 25231377;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=25231379;
 //BA.debugLineNum = 25231379;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc]\"";
_consulta_sql = "Delete From [Observaciones_Doc]";
RDebugUtils.currentLine=25231380;
 //BA.debugLineNum = 25231380;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=25231382;
 //BA.debugLineNum = 25231382;BA.debugLine="End Sub";
return "";
}
public static String  _fx_nulopornro(anywheresoftware.b4a.BA _ba,Object _value,double _valorxdefecto) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_nulopornro", false))
	 {return ((String) Debug.delegate(null, "fx_nulopornro", new Object[] {_ba,_value,_valorxdefecto}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub Fx_NuloPorNro(value As Object, valorxde";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="If IsNull(value) Then";
if (_isnull(_ba,_value)) { 
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="Return valorxdefecto";
if (true) return BA.NumberToString(_valorxdefecto);
 };
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="Return value";
if (true) return BA.ObjectToString(_value);
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="End Sub";
return "";
}
public static String  _sb_borrar_todos_registros_de_tabla(anywheresoftware.b4a.BA _ba,String _tabla,String _campo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sb_borrar_todos_registros_de_tabla", false))
	 {return ((String) Debug.delegate(null, "sb_borrar_todos_registros_de_tabla", new Object[] {_ba,_tabla,_campo}));}
String _consulta_sql = "";
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
String _id = "";
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Sub Sb_Borrar_Todos_Registros_De_Tabla(Tabla As St";
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="Tabla = Tabla.ToLowerCase";
_tabla = _tabla.toLowerCase();
RDebugUtils.currentLine=25165831;
 //BA.debugLineNum = 25165831;BA.debugLine="Campo = Campo.ToLowerCase";
_campo = _campo.toLowerCase();
RDebugUtils.currentLine=25165833;
 //BA.debugLineNum = 25165833;BA.debugLine="Consulta_Sql = \"Select \" & Campo & \" From \" & Tab";
_consulta_sql = "Select "+_campo+" From "+_tabla;
RDebugUtils.currentLine=25165835;
 //BA.debugLineNum = 25165835;BA.debugLine="Table = DBUtils.ExecuteMemoryTable(Variables.vSql";
_table = mostCurrent._dbutils._executememorytable /*anywheresoftware.b4a.objects.collections.List*/ (_ba,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,_consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=25165837;
 //BA.debugLineNum = 25165837;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=25165838;
 //BA.debugLineNum = 25165838;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=25165839;
 //BA.debugLineNum = 25165839;BA.debugLine="Dim Id = Cols(0)";
_id = _cols[(int) (0)];
RDebugUtils.currentLine=25165840;
 //BA.debugLineNum = 25165840;BA.debugLine="Consulta_Sql = \"Delete From [\" & Tabla & \"] Wher";
_consulta_sql = "Delete From ["+_tabla+"] Where ["+_campo+"] = ?";
RDebugUtils.currentLine=25165841;
 //BA.debugLineNum = 25165841;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(_consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
 }
};
RDebugUtils.currentLine=25165844;
 //BA.debugLineNum = 25165844;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_usar_clave_docdespsimple_poswii(anywheresoftware.b4a.BA _ba,Object _me_,String _clave,String _koen,boolean _eliminar) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_usar_clave_docdespsimple_poswii", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_usar_clave_docdespsimple_poswii", new Object[] {_ba,_me_,_clave,_koen,_eliminar}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimpl";
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_Usar_Clave_DocDespSimple_Poswii xmlns=\"http://BakApp\">\n"+"				      <_Clave>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_clave))+"</_Clave>\n"+"				      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"				      <_Eliminar>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_eliminar))+"</_Eliminar>\n"+"				    </Sb_Usar_Clave_DocDespSimple_Poswii>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=24313868;
 //BA.debugLineNum = 24313868;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=24313869;
 //BA.debugLineNum = 24313869;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=24313871;
 //BA.debugLineNum = 24313871;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=24313872;
 //BA.debugLineNum = 24313872;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=24313873;
 //BA.debugLineNum = 24313873;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=24313874;
 //BA.debugLineNum = 24313874;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Usar_Clave_DocDespSimple_Poswii\""));
RDebugUtils.currentLine=24313876;
 //BA.debugLineNum = 24313876;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=24313878;
 //BA.debugLineNum = 24313878;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_usar_dscto_poswii(anywheresoftware.b4a.BA _ba,Object _me_,String _clave,String _kofu,boolean _eliminar) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_usar_dscto_poswii", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_usar_dscto_poswii", new Object[] {_ba,_me_,_clave,_kofu,_eliminar}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me_ A";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"			    <Sb_Usar_Dscto_Poswii xmlns=\"http://BakApp\">\n"+"			      <_Clave>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_clave))+"</_Clave>\n"+"			      <_Kofu>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_kofu))+"</_Kofu>\n"+"			      <_Eliminar>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_eliminar))+"</_Eliminar>\n"+"			    </Sb_Usar_Dscto_Poswii>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=23724044;
 //BA.debugLineNum = 23724044;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23724045;
 //BA.debugLineNum = 23724045;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23724047;
 //BA.debugLineNum = 23724047;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23724048;
 //BA.debugLineNum = 23724048;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23724049;
 //BA.debugLineNum = 23724049;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23724050;
 //BA.debugLineNum = 23724050;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Usar_Dscto_Poswii\""));
RDebugUtils.currentLine=23724052;
 //BA.debugLineNum = 23724052;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23724054;
 //BA.debugLineNum = 23724054;BA.debugLine="End Sub";
return null;
}
public static boolean  _cbool(anywheresoftware.b4a.BA _ba,double _inint) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cbool", false))
	 {return ((Boolean) Debug.delegate(null, "cbool", new Object[] {_ba,_inint}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Sub Cbool(inInt As Double) As Boolean";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="If inInt = 0 Then Return False";
if (_inint==0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="End Sub";
return false;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_descuento_global_x_cliente(anywheresoftware.b4a.BA _ba,Object _me_,String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_descuento_global_x_cliente", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_descuento_global_x_cliente", new Object[] {_ba,_me_,_koen,_suen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuento_Global_";
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_Traer_Descuento_Global_X_Cliente xmlns=\"http://BakApp\">\n"+"		      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"		      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"		      <_Suen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_suen))+"</_Suen>\n"+"		    </Sb_Traer_Descuento_Global_X_Cliente>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=23789580;
 //BA.debugLineNum = 23789580;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23789581;
 //BA.debugLineNum = 23789581;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23789583;
 //BA.debugLineNum = 23789583;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23789584;
 //BA.debugLineNum = 23789584;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23789585;
 //BA.debugLineNum = 23789585;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23789586;
 //BA.debugLineNum = 23789586;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Descuento_Global_X_Cliente\""));
RDebugUtils.currentLine=23789588;
 //BA.debugLineNum = 23789588;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23789590;
 //BA.debugLineNum = 23789590;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_editardocumentojsonbakapp2(anywheresoftware.b4a.BA _ba,Object _me_,int _oldidmaeedo,String _cod_func_eliminador,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,String _despafaciljs,boolean _cambiar_nrodocumento) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_editardocumentojsonbakapp2", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_editardocumentojsonbakapp2", new Object[] {_ba,_me_,_oldidmaeedo,_cod_func_eliminador,_encabezadojs,_destallejs,_descuentosjs,_observacionesjs,_despafaciljs,_cambiar_nrodocumento}));}
int _id = 0;
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
RDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_EditarDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"+"				      <_OldIdmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_oldidmaeedo))+"</_OldIdmaeedo>\n"+"				      <_Cod_Func_Eliminador>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cod_func_eliminador))+"</_Cod_Func_Eliminador>\n"+"				      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Cambiar_NroDocumento>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cambiar_nrodocumento))+"</_Cambiar_NroDocumento>\n"+"				      <_DespachoSimpleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_despafaciljs))+"</_DespachoSimpleJs>\n"+"				      <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"				    </Sb_EditarDocumentoJsonBakapp2>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=23658526;
 //BA.debugLineNum = 23658526;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23658527;
 //BA.debugLineNum = 23658527;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23658529;
 //BA.debugLineNum = 23658529;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23658530;
 //BA.debugLineNum = 23658530;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23658531;
 //BA.debugLineNum = 23658531;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23658532;
 //BA.debugLineNum = 23658532;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""));
RDebugUtils.currentLine=23658534;
 //BA.debugLineNum = 23658534;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23658536;
 //BA.debugLineNum = 23658536;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getdataset_sb_json_impbk(anywheresoftware.b4a.BA _ba,Object _me_,String _json,String _nombretabla) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_getdataset_sb_json_impbk", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_getdataset_sb_json_impbk", new Object[] {_ba,_me_,_json,_nombretabla}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpB";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		    <Sb_Json_ImpBk xmlns=\"http://BakApp\">\n"+"		      <_Json>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_json))+"</_Json>\n"+"		      <_NombreTabla>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_nombretabla))+"</_NombreTabla>\n"+"		    </Sb_Json_ImpBk>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=23330827;
 //BA.debugLineNum = 23330827;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23330832;
 //BA.debugLineNum = 23330832;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Json_ImpBk\""));
RDebugUtils.currentLine=23330835;
 //BA.debugLineNum = 23330835;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_creadocumentojsonbakapp2(anywheresoftware.b4a.BA _ba,Object _me_,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,String _despachosimplejs) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_creadocumentojsonbakapp2", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_creadocumentojsonbakapp2", new Object[] {_ba,_me_,_encabezadojs,_destallejs,_descuentosjs,_observacionesjs,_despachosimplejs}));}
int _id = 0;
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"			    <Sb_CreaDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"+"					<_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				    <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				    <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				    <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"			      <_DespachoSimpleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_despachosimplejs))+"</_DespachoSimpleJs>\n"+"			      <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"			    </Sb_CreaDocumentoJsonBakapp2>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=23527441;
 //BA.debugLineNum = 23527441;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23527442;
 //BA.debugLineNum = 23527442;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23527444;
 //BA.debugLineNum = 23527444;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23527445;
 //BA.debugLineNum = 23527445;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23527446;
 //BA.debugLineNum = 23527446;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23527447;
 //BA.debugLineNum = 23527447;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_CreaDocumentoJsonBakapp2\""));
RDebugUtils.currentLine=23527449;
 //BA.debugLineNum = 23527449;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23527451;
 //BA.debugLineNum = 23527451;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revisar_stock_fila(anywheresoftware.b4a.BA _ba,Object _me_,String _tido,String _empresa,String _sucursal,String _bodega,String _codigo,double _cantidad,int _untrans,String _tidopa) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_revisar_stock_fila", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_revisar_stock_fila", new Object[] {_ba,_me_,_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Revisar_Stock_Fila(Me_";
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_Revisar_Stock_Fila xmlns=\"http://BakApp\">\n"+"		      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"		      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"		      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursal>\n"+"		      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</_Bodega>\n"+"		      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</_Codigo>\n"+"		      <_Cantidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cantidad))+"</_Cantidad>\n"+"		      <_UnTrans>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_untrans))+"</_UnTrans>\n"+"		      <_Tidopa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tidopa))+"</_Tidopa>\n"+"		    </Sb_Revisar_Stock_Fila>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=23199770;
 //BA.debugLineNum = 23199770;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23199771;
 //BA.debugLineNum = 23199771;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23199773;
 //BA.debugLineNum = 23199773;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23199774;
 //BA.debugLineNum = 23199774;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23199775;
 //BA.debugLineNum = 23199775;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23199776;
 //BA.debugLineNum = 23199776;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Revisar_Stock_Fila\""));
RDebugUtils.currentLine=23199778;
 //BA.debugLineNum = 23199778;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23199780;
 //BA.debugLineNum = 23199780;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _sucursal,String _codigo,String _codlista,boolean _prct,String _tict,double _poriva,double _porila,String _koen,boolean _chkvaloresneto) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista", new Object[] {_ba,_me_,_empresa,_sucursal,_codigo,_codlista,_prct,_tict,_poriva,_porila,_koen,_chkvaloresneto}));}
String _vprct = "";
String _vchkvaloresneto = "";
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuentos_Setead";
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="Dim vPrct,vChkValoresNeto As String";
_vprct = "";
_vchkvaloresneto = "";
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="If Prct Then";
if (_prct) { 
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="vPrct = \"True\"";
_vprct = "True";
 }else {
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="vPrct = False";
_vprct = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="If ChkValoresNeto Then";
if (_chkvaloresneto) { 
RDebugUtils.currentLine=23265300;
 //BA.debugLineNum = 23265300;BA.debugLine="vChkValoresNeto = \"True\"";
_vchkvaloresneto = "True";
 }else {
RDebugUtils.currentLine=23265302;
 //BA.debugLineNum = 23265302;BA.debugLine="vChkValoresNeto = False";
_vchkvaloresneto = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=23265305;
 //BA.debugLineNum = 23265305;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			<soap12:Body>\n"+"			<Sb_Traer_Descuentos_Seteados_Desde_Lista xmlns=\"http://BakApp\">\n"+"			<_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			<_Sucursa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursa>\n"+"			<_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</_Codigo>\n"+"			<_CodLista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codlista))+"</_CodLista>\n"+"		      <_Prct>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_prct))+"</_Prct>\n"+"		      <_Tict>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tict))+"</_Tict>\n"+"		      <_PorIva>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_poriva))+"</_PorIva>\n"+"		      <_PorIla>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_porila))+"</_PorIla>\n"+"		      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"		      <_ChkValoresNeto>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_chkvaloresneto))+"</_ChkValoresNeto>\n"+"		    </Sb_Traer_Descuentos_Seteados_Desde_Lista>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=23265323;
 //BA.debugLineNum = 23265323;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23265324;
 //BA.debugLineNum = 23265324;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23265326;
 //BA.debugLineNum = 23265326;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23265327;
 //BA.debugLineNum = 23265327;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23265328;
 //BA.debugLineNum = 23265328;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23265329;
 //BA.debugLineNum = 23265329;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Descuentos_Seteados_Desde_Lista\""));
RDebugUtils.currentLine=23265331;
 //BA.debugLineNum = 23265331;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23265333;
 //BA.debugLineNum = 23265333;BA.debugLine="End Sub";
return null;
}
public static double  _cdouble(anywheresoftware.b4a.BA _ba,String _ins) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cdouble", false))
	 {return ((Double) Debug.delegate(null, "cdouble", new Object[] {_ba,_ins}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub CDouble(InS As String) As Double";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Return InS";
if (true) return (double)(Double.parseDouble(_ins));
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
return 0;
}
public static String  _rellenar_derecha(anywheresoftware.b4a.BA _ba,String _cadena,int _cantcaracteres,String _relleno) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rellenar_derecha", false))
	 {return ((String) Debug.delegate(null, "rellenar_derecha", new Object[] {_ba,_cadena,_cantcaracteres,_relleno}));}
int _i = 0;
String _nro = "";
int _cantidad = 0;
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Public Sub Rellenar_Derecha(Cadena As String,CantC";
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="Dim nro As String";
_nro = "";
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="nro = Cadena.Length";
_nro = BA.NumberToString(_cadena.length());
RDebugUtils.currentLine=24838150;
 //BA.debugLineNum = 24838150;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
_cantidad = (int) (_cantcaracteres-(double)(Double.parseDouble(_nro)));
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=24838153;
 //BA.debugLineNum = 24838153;BA.debugLine="For i = 0 To Cantidad - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cantidad-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="Cadena = Cadena & Relleno";
_cadena = _cadena+_relleno;
 }
};
 };
RDebugUtils.currentLine=24838158;
 //BA.debugLineNum = 24838158;BA.debugLine="Return Cadena";
if (true) return _cadena;
RDebugUtils.currentLine=24838160;
 //BA.debugLineNum = 24838160;BA.debugLine="End Sub";
return "";
}
public static String  _fecha_formato(anywheresoftware.b4a.BA _ba,long _fecha,String _separador) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fecha_formato", false))
	 {return ((String) Debug.delegate(null, "fecha_formato", new Object[] {_ba,_fecha,_separador}));}
String _vyear = "";
String _vmonth = "";
String _vday = "";
String _fechastr = "";
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Public Sub Fecha_Formato(Fecha As Long,Separador A";
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="Dim vYear = DateTime.GetYear(Fecha)";
_vyear = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_fecha));
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="Dim vMonth = DateTime.GetMonth(Fecha)";
_vmonth = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_fecha));
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="Dim vDay = DateTime.GetDayOfMonth(Fecha)";
_vday = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_fecha));
RDebugUtils.currentLine=24969222;
 //BA.debugLineNum = 24969222;BA.debugLine="If Separador = \"\" Then";
if ((_separador).equals("")) { 
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="Separador = \"/\"";
_separador = "/";
 };
RDebugUtils.currentLine=24969226;
 //BA.debugLineNum = 24969226;BA.debugLine="Dim FechaStr As String = Rellenar_Izquierda(vDay,";
_fechastr = _rellenar_izquierda(_ba,_vday,(int) (2),"0")+_separador+_rellenar_izquierda(_ba,_vmonth,(int) (2),"0")+_separador+_vyear;
RDebugUtils.currentLine=24969228;
 //BA.debugLineNum = 24969228;BA.debugLine="Return FechaStr";
if (true) return _fechastr;
RDebugUtils.currentLine=24969230;
 //BA.debugLineNum = 24969230;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fx_dataset(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_dataset", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "fx_dataset", new Object[] {_ba,_vgetstring_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _ds = null;
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="public Sub Fx_DataSet(vGetString_Json As String) A";
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Dim Parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="Parser.Initialize(vGetString_Json)";
_parser.Initialize(_vgetstring_json);
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="Dim Ds As Map = Parser.NextObject";
_ds = new anywheresoftware.b4a.objects.collections.Map();
_ds = _parser.NextObject();
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="Return Ds";
if (true) return _ds;
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_creadocumentojsonbakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_creadocumentojsonbakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_creadocumentojsonbakapp", new Object[] {_ba,_me_,_encabezadojs,_destallejs,_descuentosjs,_observacionesjs}));}
int _id = 0;
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		          <Sb_CreaDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"				   </Sb_CreaDocumentoJsonBakapp>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=23461904;
 //BA.debugLineNum = 23461904;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23461905;
 //BA.debugLineNum = 23461905;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23461907;
 //BA.debugLineNum = 23461907;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23461908;
 //BA.debugLineNum = 23461908;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23461909;
 //BA.debugLineNum = 23461909;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23461910;
 //BA.debugLineNum = 23461910;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_CreaDocumentoJsonBakapp\""));
RDebugUtils.currentLine=23461912;
 //BA.debugLineNum = 23461912;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23461914;
 //BA.debugLineNum = 23461914;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_editardocumentojsonbakapp(anywheresoftware.b4a.BA _ba,Object _me_,int _oldidmaeedo,String _cod_func_eliminador,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,boolean _cambiar_nrodocumento) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_editardocumentojsonbakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_editardocumentojsonbakapp", new Object[] {_ba,_me_,_oldidmaeedo,_cod_func_eliminador,_encabezadojs,_destallejs,_descuentosjs,_observacionesjs,_cambiar_nrodocumento}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
RDebugUtils.currentLine=23592969;
 //BA.debugLineNum = 23592969;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_EditarDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"+"				      <_OldIdmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_oldidmaeedo))+"</_OldIdmaeedo>\n"+"				      <_Cod_Func_Eliminador>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cod_func_eliminador))+"</_Cod_Func_Eliminador>\n"+"				      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Cambiar_NroDocumento>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cambiar_nrodocumento))+"</_Cambiar_NroDocumento>\n"+"				    </Sb_EditarDocumentoJsonBakapp>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=23592985;
 //BA.debugLineNum = 23592985;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23592986;
 //BA.debugLineNum = 23592986;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23592988;
 //BA.debugLineNum = 23592988;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23592989;
 //BA.debugLineNum = 23592989;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23592990;
 //BA.debugLineNum = 23592990;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23592991;
 //BA.debugLineNum = 23592991;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""));
RDebugUtils.currentLine=23592993;
 //BA.debugLineNum = 23592993;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23592995;
 //BA.debugLineNum = 23592995;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getmodalidad_gral(anywheresoftware.b4a.BA _ba,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_getmodalidad_gral", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_getmodalidad_gral", new Object[] {_ba,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetModalidad_Gral(Me_ A";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Dim	vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		    <Sb_GetModalidad_Gral xmlns=\"http://BakApp\">\n"+"		    <Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</Global_BaseBk>\n"+"		    </Sb_GetModalidad_Gral>\n"+"		  </soap:Body>\n"+"		</soap:Envelope");
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=23068685;
 //BA.debugLineNum = 23068685;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=23068688;
 //BA.debugLineNum = 23068688;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_GetModalidad_Gral\""));
RDebugUtils.currentLine=23068690;
 //BA.debugLineNum = 23068690;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=23068692;
 //BA.debugLineNum = 23068692;BA.debugLine="End Sub";
return null;
}
public static boolean  _isnull(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "isnull", false))
	 {return ((Boolean) Debug.delegate(null, "isnull", new Object[] {_ba,_o}));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Sub IsNull(O As Object) As Boolean";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Return (O=Null)";
if (true) return (_o== null);
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="End Sub";
return false;
}
public static String  _fx_nuloporstr(anywheresoftware.b4a.BA _ba,Object _value,String _valorxdefecto) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_nuloporstr", false))
	 {return ((String) Debug.delegate(null, "fx_nuloporstr", new Object[] {_ba,_value,_valorxdefecto}));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Public Sub Fx_NuloPorStr(value As Object,valorxdef";
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="If IsNull(value) Then";
if (_isnull(_ba,_value)) { 
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="Return valorxdefecto";
if (true) return _valorxdefecto;
 };
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="Return value";
if (true) return BA.ObjectToString(_value);
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="End Sub";
return "";
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "left", false))
	 {return ((String) Debug.delegate(null, "left", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Return Text.SubString2(0, Length)";
if (true) return _text.substring((int) (0),_length);
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="End Sub";
return "";
}
public static String  _right(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "right", false))
	 {return ((String) Debug.delegate(null, "right", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="Return Text.SubString(Text.Length-Length)";
if (true) return _text.substring((int) (_text.length()-_length));
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="End Sub";
return "";
}
public static String  _rtrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rtrim", false))
	 {return ((String) Debug.delegate(null, "rtrim", new Object[] {_ba,_s}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub RTrim(s As String) As String";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("(\\s+)$",_s);
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _text,String _delimiter) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "split", false))
	 {return ((String[]) Debug.delegate(null, "split", new Object[] {_ba,_text,_delimiter}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Return Regex.Split(Delimiter,Text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_text);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return null;
}
}