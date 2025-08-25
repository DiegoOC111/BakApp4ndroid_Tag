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
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Fx_Traer_IdDispositivo As String";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="If Api < 9 Then";
if (_api<9) { 
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="id= p.GetSettings(\"android_id\")";
_id = _p.GetSettings("android_id");
 }else {
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="id= r.GetStaticField(\"android.os.Build\", \"SERIAL";
_id = BA.ObjectToString(_r.GetStaticField("android.os.Build","SERIAL"));
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="If id.ToLowerCase = \"unknown\" Then id= p.GetSett";
if ((_id.toLowerCase()).equals("unknown")) { 
_id = _p.GetSettings("android_id");};
 };
RDebugUtils.currentLine=8126485;
 //BA.debugLineNum = 8126485;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=8126487;
 //BA.debugLineNum = 8126487;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getdataset_json(anywheresoftware.b4a.BA _ba,String _consulta_sql,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_getdataset_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_getdataset_json", new Object[] {_ba,_consulta_sql,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Json(Consult";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_GetDataSet_Json xmlns=\"http://BakApp\">\n"+"      			<Consulta_Sql>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_consulta_sql))+"</Consulta_Sql>\n"+"    			</Sb_GetDataSet_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6553613;
 //BA.debugLineNum = 6553613;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6553616;
 //BA.debugLineNum = 6553616;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_GetDataSet_Json\""));
RDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub Fx_TraeClaveRD(vClave As String) As Str";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Dim valorAscii As Int";
_valorascii = 0;
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Dim PassEncriptado, Letra As String";
_passencriptado = "";
_letra = "";
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="Dim CadenaRD As Long";
_cadenard = 0L;
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="vClave = vClave.Trim";
_vclave = _vclave.trim();
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="For x = 1 To vClave.Length";
{
final int step5 = 1;
final int limit5 = _vclave.length();
_x = (int) (1) ;
for (;_x <= limit5 ;_x = _x + step5 ) {
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="Letra = Mid(vClave,  x, 1)";
_letra = _mid(_ba,_vclave,_x,(int) (1));
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="valorAscii = Asc(Letra)";
_valorascii = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar(_letra));
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="If x = 1 Then";
if (_x==1) { 
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="CadenaRD = (17225 + valorAscii) * 1";
_cadenard = (long) ((17225+_valorascii)*1);
 }else 
{RDebugUtils.currentLine=8060943;
 //BA.debugLineNum = 8060943;BA.debugLine="Else If x = 2 Then";
if (_x==2) { 
RDebugUtils.currentLine=8060944;
 //BA.debugLineNum = 8060944;BA.debugLine="CadenaRD = (1847 + valorAscii) * 8";
_cadenard = (long) ((1847+_valorascii)*8);
 }else 
{RDebugUtils.currentLine=8060945;
 //BA.debugLineNum = 8060945;BA.debugLine="Else If x = 3 Then";
if (_x==3) { 
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="CadenaRD = (1217 + valorAscii) * 27";
_cadenard = (long) ((1217+_valorascii)*27);
 }else 
{RDebugUtils.currentLine=8060947;
 //BA.debugLineNum = 8060947;BA.debugLine="Else If x = 4 Then";
if (_x==4) { 
RDebugUtils.currentLine=8060948;
 //BA.debugLineNum = 8060948;BA.debugLine="CadenaRD = (237 + valorAscii) * 64";
_cadenard = (long) ((237+_valorascii)*64);
 }else 
{RDebugUtils.currentLine=8060949;
 //BA.debugLineNum = 8060949;BA.debugLine="Else If x = 5 Then";
if (_x==5) { 
RDebugUtils.currentLine=8060950;
 //BA.debugLineNum = 8060950;BA.debugLine="CadenaRD = (201 + valorAscii) * 125";
_cadenard = (long) ((201+_valorascii)*125);
 }}}}}
;
RDebugUtils.currentLine=8060953;
 //BA.debugLineNum = 8060953;BA.debugLine="PassEncriptado = PassEncriptado & CadenaRD";
_passencriptado = _passencriptado+BA.NumberToString(_cadenard);
RDebugUtils.currentLine=8060954;
 //BA.debugLineNum = 8060954;BA.debugLine="CadenaRD = 0";
_cadenard = (long) (0);
 }
};
RDebugUtils.currentLine=8060957;
 //BA.debugLineNum = 8060957;BA.debugLine="Return PassEncriptado";
if (true) return _passencriptado;
RDebugUtils.currentLine=8060959;
 //BA.debugLineNum = 8060959;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fx_datarow(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_datarow", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "fx_datarow", new Object[] {_ba,_vgetstring_json}));}
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="public Sub Fx_DataRow(vGetString_Json As String) A";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim Table As List = Fx_DataSet(vGetString_Json).G";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_fx_dataset(_ba,_vgetstring_json).Get((Object)("Table"))));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim Row As Map = Table.Get(0)";
_row = new anywheresoftware.b4a.objects.collections.Map();
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_table.Get((int) (0))));
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Return Row";
if (true) return _row;
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="End Sub";
return null;
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _text,int _start,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "mid", false))
	 {return ((String) Debug.delegate(null, "mid", new Object[] {_ba,_text,_start,_length}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_length-1));
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Fx_Cadena_a_buscar_SQL(vCadena As Strin";
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Dim linea1, linea2 As String";
_linea1 = "";
_linea2 = "";
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="Dim vConcatenar As String = \"\"";
_vconcatenar = "";
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="If vAnd_Or = \"\" Then vAnd_Or = \"And\"";
if ((_vand_or).equals("")) { 
_vand_or = "And";};
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="For i = 1 To vCadena.Length' Len(vCadena)";
{
final int step4 = 1;
final int limit4 = _vcadena.length();
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="linea1 = LTrim(Mid(vCadena, i, 1)).ToUpperCase'U";
_linea1 = _ltrim(_ba,_mid(_ba,_vcadena,_i,(int) (1))).toUpperCase();
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="linea2 = linea1.ToLowerCase'LCase(linea1)";
_linea2 = _linea1.toLowerCase();
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="If linea1 = \"\" Then";
if ((_linea1).equals("")) { 
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="vConcatenar = vConcatenar & \"%' \" & vAnd_Or & \"";
_vconcatenar = _vconcatenar+"%' "+_vand_or+" "+_vcampo;
 }else {
RDebugUtils.currentLine=8192017;
 //BA.debugLineNum = 8192017;BA.debugLine="vConcatenar = vConcatenar & \"[\" & linea1 & line";
_vconcatenar = _vconcatenar+"["+_linea1+_linea2+"]";
 };
 }
};
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="Return vConcatenar";
if (true) return _vconcatenar;
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub RutDigito(numero As Long) As String";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Dim cuenta, Suma, resto, Digito As Int";
_cuenta = 0;
_suma = 0;
_resto = 0;
_digito = 0;
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Dim dig As Double";
_dig = 0;
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Suma = 0";
_suma = (int) (0);
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="cuenta = 2";
_cuenta = (int) (2);
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Do Until numero = 0";
while (!(_numero==0)) {
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="dig = numero Mod 10";
_dig = _numero%10;
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Dim Nro As Int = numero/10";
_nro = (int) (_numero/(double)10);
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="numero = Nro";
_numero = (long) (_nro);
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="Suma = Suma + (dig * cuenta)";
_suma = (int) (_suma+(_dig*_cuenta));
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="cuenta = cuenta + 1";
_cuenta = (int) (_cuenta+1);
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="If cuenta = 8 Then cuenta = 2";
if (_cuenta==8) { 
_cuenta = (int) (2);};
 }
;
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="resto = Suma Mod 11";
_resto = (int) (_suma%11);
RDebugUtils.currentLine=8781842;
 //BA.debugLineNum = 8781842;BA.debugLine="Digito = 11 - resto";
_digito = (int) (11-_resto);
RDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="Select Case Digito";
switch (_digito) {
case 10: {
RDebugUtils.currentLine=8781845;
 //BA.debugLineNum = 8781845;BA.debugLine="Case 10 : Return \"K\"";
if (true) return "K";
 break; }
case 11: {
RDebugUtils.currentLine=8781846;
 //BA.debugLineNum = 8781846;BA.debugLine="Case 11 : Return \"0\"";
if (true) return "0";
 break; }
default: {
RDebugUtils.currentLine=8781847;
 //BA.debugLineNum = 8781847;BA.debugLine="Case Else : Return Digito' Trim(Str(Digito))";
if (true) return BA.NumberToString(_digito);
 break; }
}
;
RDebugUtils.currentLine=8781850;
 //BA.debugLineNum = 8781850;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_entidad_json(anywheresoftware.b4a.BA _ba,Object _me_,String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_entidad_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_entidad_json", new Object[] {_ba,_me_,_koen,_suen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me_";
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_Traer_Entidad_Json xmlns=\"http://BakApp\">\n"+"      			<Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</Koen>\n"+"      			<Suen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_suen))+"</Suen>\n"+"    			</Sb_Traer_Entidad_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6815762;
 //BA.debugLineNum = 6815762;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Entidad_Json\""));
RDebugUtils.currentLine=6815765;
 //BA.debugLineNum = 6815765;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6815767;
 //BA.debugLineNum = 6815767;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _fx_datatable(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_datatable", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "fx_datatable", new Object[] {_ba,_vgetstring_json}));}
anywheresoftware.b4a.objects.collections.Map _ds = null;
anywheresoftware.b4a.objects.collections.List _table = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="public Sub Fx_DataTable(vGetString_Json As String)";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim Ds As Map = Fx_DataSet(vGetString_Json)";
_ds = new anywheresoftware.b4a.objects.collections.Map();
_ds = _fx_dataset(_ba,_vgetstring_json);
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim Table As List = Ds.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ds.Get((Object)("Table"))));
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Return Table";
if (true) return _table;
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_productos_json(anywheresoftware.b4a.BA _ba,Object _me_,String _codigo,String _empresa,String _sucursal,String _bodega,String _lista,int _untrans,String _koen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_productos_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_productos_json", new Object[] {_ba,_me_,_codigo,_empresa,_sucursal,_bodega,_lista,_untrans,_koen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me";
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  			<soap:Body>\n"+"    			<Sb_Traer_Productos_Json xmlns=\"http://BakApp\">\n"+"      			<Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</Codigo>\n"+"      			<Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</Empresa>\n"+"      			<Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</Sucursal>\n"+"      			<Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</Bodega>\n"+"      			<Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_lista))+"</Lista>\n"+"      			<UnTrans>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_untrans))+"</UnTrans>\n"+"      			<Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</Koen>\n"+"    			</Sb_Traer_Productos_Json>\n"+"  			</soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=6619159;
 //BA.debugLineNum = 6619159;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6619160;
 //BA.debugLineNum = 6619160;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6619162;
 //BA.debugLineNum = 6619162;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6619163;
 //BA.debugLineNum = 6619163;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6619164;
 //BA.debugLineNum = 6619164;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6619165;
 //BA.debugLineNum = 6619165;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Productos_Json\""));
RDebugUtils.currentLine=6619167;
 //BA.debugLineNum = 6619167;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6619169;
 //BA.debugLineNum = 6619169;BA.debugLine="End Sub";
return null;
}
public static String  _ltrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ltrim", false))
	 {return ((String) Debug.delegate(null, "ltrim", new Object[] {_ba,_s}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub LTrim(s As String) As String";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\s+)",_s);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revcarpetatmp(anywheresoftware.b4a.BA _ba,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_revcarpetatmp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_revcarpetatmp", new Object[] {_ba,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevCarpetaTmp (Me_ As O";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_RevCarpetaTmpResponse xmlns=\"http://BakApp\" />\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_RevCarpetaTmp\""));
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7077907;
 //BA.debugLineNum = 7077907;BA.debugLine="End Sub";
return null;
}
public static boolean  _cbool(anywheresoftware.b4a.BA _ba,double _inint) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cbool", false))
	 {return ((Boolean) Debug.delegate(null, "cbool", new Object[] {_ba,_inint}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Cbool(inInt As Double) As Boolean";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="If inInt = 0 Then Return False";
if (_inint==0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="End Sub";
return false;
}
public static double  _cdouble(anywheresoftware.b4a.BA _ba,String _ins) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cdouble", false))
	 {return ((Double) Debug.delegate(null, "cdouble", new Object[] {_ba,_ins}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub CDouble(InS As String) As Double";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return InS";
if (true) return (double)(Double.parseDouble(_ins));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return 0;
}
public static String  _fecha_formato(anywheresoftware.b4a.BA _ba,long _fecha,String _separador) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fecha_formato", false))
	 {return ((String) Debug.delegate(null, "fecha_formato", new Object[] {_ba,_fecha,_separador}));}
String _vyear = "";
String _vmonth = "";
String _vday = "";
String _fechastr = "";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub Fecha_Formato(Fecha As Long,Separador A";
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim vYear = DateTime.GetYear(Fecha)";
_vyear = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_fecha));
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Dim vMonth = DateTime.GetMonth(Fecha)";
_vmonth = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_fecha));
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Dim vDay = DateTime.GetDayOfMonth(Fecha)";
_vday = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_fecha));
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="If Separador = \"\" Then";
if ((_separador).equals("")) { 
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="Separador = \"/\"";
_separador = "/";
 };
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="Dim FechaStr As String = Rellenar_Izquierda(vDay,";
_fechastr = _rellenar_izquierda(_ba,_vday,(int) (2),"0")+_separador+_rellenar_izquierda(_ba,_vmonth,(int) (2),"0")+_separador+_vyear;
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="Return FechaStr";
if (true) return _fechastr;
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="End Sub";
return "";
}
public static String  _rellenar_izquierda(anywheresoftware.b4a.BA _ba,String _cadena,int _cantcaracteres,String _relleno) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rellenar_izquierda", false))
	 {return ((String) Debug.delegate(null, "rellenar_izquierda", new Object[] {_ba,_cadena,_cantcaracteres,_relleno}));}
int _i = 0;
String _nro = "";
int _cantidad = 0;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub Rellenar_Izquierda(Cadena As String,Can";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Dim nro As String";
_nro = "";
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="nro = Cadena.Length";
_nro = BA.NumberToString(_cadena.length());
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
_cantidad = (int) (_cantcaracteres-(double)(Double.parseDouble(_nro)));
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="For i = 0 To Cantidad - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cantidad-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="Cadena = Relleno & Cadena";
_cadena = _relleno+_cadena;
 }
};
 };
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="Return Cadena";
if (true) return _cadena;
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fx_dataset(anywheresoftware.b4a.BA _ba,String _vgetstring_json) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_dataset", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "fx_dataset", new Object[] {_ba,_vgetstring_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _ds = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="public Sub Fx_DataSet(vGetString_Json As String) A";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Dim Parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Parser.Initialize(vGetString_Json)";
_parser.Initialize(_vgetstring_json);
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="Dim Ds As Map = Parser.NextObject";
_ds = new anywheresoftware.b4a.objects.collections.Map();
_ds = _parser.NextObject();
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Return Ds";
if (true) return _ds;
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_actualizar_observaciones_documento(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo,String _obdo,String _ocdo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_actualizar_observaciones_documento", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_actualizar_observaciones_documento", new Object[] {_ba,_me_,_idmaeedo,_obdo,_ocdo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Actualizar_Observacione";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_Actualizar_Observaciones_Documento xmlns=\"http://BakApp\">\n"+"				      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"				      <_Observaciones>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_obdo))+"</_Observaciones>\n"+"				      <_Orden_De_Compra>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_ocdo))+"</_Orden_De_Compra>\n"+"				    </Sb_Actualizar_Observaciones_Documento>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Actualizar_Observaciones_Documento\""));
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		          <Sb_CreaDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"				   </Sb_CreaDocumentoJsonBakapp>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_CreaDocumentoJsonBakapp\""));
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"			    <Sb_CreaDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"+"					<_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				    <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				    <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				    <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"			      <_DespachoSimpleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_despachosimplejs))+"</_DespachoSimpleJs>\n"+"			      <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"			    </Sb_CreaDocumentoJsonBakapp2>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7208982;
 //BA.debugLineNum = 7208982;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_CreaDocumentoJsonBakapp2\""));
RDebugUtils.currentLine=7208985;
 //BA.debugLineNum = 7208985;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7208987;
 //BA.debugLineNum = 7208987;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_editardocumentojsonbakapp(anywheresoftware.b4a.BA _ba,Object _me_,int _oldidmaeedo,String _cod_func_eliminador,String _encabezadojs,String _destallejs,String _descuentosjs,String _observacionesjs,boolean _cambiar_nrodocumento) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_editardocumentojsonbakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_editardocumentojsonbakapp", new Object[] {_ba,_me_,_oldidmaeedo,_cod_func_eliminador,_encabezadojs,_destallejs,_descuentosjs,_observacionesjs,_cambiar_nrodocumento}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_EditarDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"+"				      <_OldIdmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_oldidmaeedo))+"</_OldIdmaeedo>\n"+"				      <_Cod_Func_Eliminador>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cod_func_eliminador))+"</_Cod_Func_Eliminador>\n"+"				      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Cambiar_NroDocumento>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cambiar_nrodocumento))+"</_Cambiar_NroDocumento>\n"+"				    </Sb_EditarDocumentoJsonBakapp>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7274525;
 //BA.debugLineNum = 7274525;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7274526;
 //BA.debugLineNum = 7274526;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7274527;
 //BA.debugLineNum = 7274527;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""));
RDebugUtils.currentLine=7274529;
 //BA.debugLineNum = 7274529;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7274531;
 //BA.debugLineNum = 7274531;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
_id = (int)(BA.ObjectToNumber(mostCurrent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Id"))));
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_EditarDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"+"				      <_OldIdmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_oldidmaeedo))+"</_OldIdmaeedo>\n"+"				      <_Cod_Func_Eliminador>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cod_func_eliminador))+"</_Cod_Func_Eliminador>\n"+"				      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"				      <_EncabezadoJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_encabezadojs))+"</_EncabezadoJs>\n"+"				      <_DestalleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_destallejs))+"</_DestalleJs>\n"+"				      <_DescuentosJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_descuentosjs))+"</_DescuentosJs>\n"+"				      <_ObservacionesJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_observacionesjs))+"</_ObservacionesJs>\n"+"					  <_Cambiar_NroDocumento>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cambiar_nrodocumento))+"</_Cambiar_NroDocumento>\n"+"				      <_DespachoSimpleJs>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_despafaciljs))+"</_DespachoSimpleJs>\n"+"				      <_Id_Estacion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_id))+"</_Id_Estacion>\n"+"				    </Sb_EditarDocumentoJsonBakapp2>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=7340062;
 //BA.debugLineNum = 7340062;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7340063;
 //BA.debugLineNum = 7340063;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7340065;
 //BA.debugLineNum = 7340065;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7340066;
 //BA.debugLineNum = 7340066;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7340067;
 //BA.debugLineNum = 7340067;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7340068;
 //BA.debugLineNum = 7340068;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""));
RDebugUtils.currentLine=7340070;
 //BA.debugLineNum = 7340070;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7340072;
 //BA.debugLineNum = 7340072;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_enviarcorreobakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _modalidad,String _codfuncionario,int _idmaeedo,String _para,String _cc) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_enviarcorreobakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_enviarcorreobakapp", new Object[] {_ba,_me_,_empresa,_modalidad,_codfuncionario,_idmaeedo,_para,_cc}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarCorreoBakapp(Me_";
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_EnviarCorreoBakapp xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"			      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			      <_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"			      <_CodFuncionario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codfuncionario))+"</_CodFuncionario>\n"+"			      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"			      <_Para>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_para))+"</_Para>\n"+"			      <_Cc>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cc))+"</_Cc>\n"+"			    </Sb_EnviarCorreoBakapp>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7602199;
 //BA.debugLineNum = 7602199;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EnviarCorreoBakapp\""));
RDebugUtils.currentLine=7602201;
 //BA.debugLineNum = 7602201;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7602203;
 //BA.debugLineNum = 7602203;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_enviarimprimirbakapp(anywheresoftware.b4a.BA _ba,Object _me_,String _empresa,String _modalidad,String _codfuncionario,int _idmaeedo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_enviarimprimirbakapp", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_enviarimprimirbakapp", new Object[] {_ba,_me_,_empresa,_modalidad,_codfuncionario,_idmaeedo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				<soap12:Body>\n"+"					<Sb_EnviarImprimirBakapp xmlns=\"http://BakApp\">\n"+"						<_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"						<_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"						<_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"						<_CodFuncionario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codfuncionario))+"</_CodFuncionario>\n"+"						<_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"					</Sb_EnviarImprimirBakapp>\n"+"				</soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7536660;
 //BA.debugLineNum = 7536660;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_EnviarImprimirBakapp\""));
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_formatomodalidad(anywheresoftware.b4a.BA _ba,String _empresa,String _modalidad,String _tido,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_formatomodalidad", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_formatomodalidad", new Object[] {_ba,_empresa,_modalidad,_tido,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_FormatoModalidad(Empres";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_FormatoModalidad xmlns=\"http://BakApp\">\n"+"				      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"				      <_Modalidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_modalidad))+"</_Modalidad>\n"+"				      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"				    </Sb_FormatoModalidad>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7929873;
 //BA.debugLineNum = 7929873;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7929874;
 //BA.debugLineNum = 7929874;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_FormatoModalidad\""));
RDebugUtils.currentLine=7929876;
 //BA.debugLineNum = 7929876;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7929878;
 //BA.debugLineNum = 7929878;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getdataset_sb_json_impbk(anywheresoftware.b4a.BA _ba,Object _me_,String _json,String _nombretabla) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_getdataset_sb_json_impbk", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_getdataset_sb_json_impbk", new Object[] {_ba,_me_,_json,_nombretabla}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpB";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		    <Sb_Json_ImpBk xmlns=\"http://BakApp\">\n"+"		      <_Json>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_json))+"</_Json>\n"+"		      <_NombreTabla>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_nombretabla))+"</_NombreTabla>\n"+"		    </Sb_Json_ImpBk>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Json_ImpBk\""));
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_getmodalidad_gral(anywheresoftware.b4a.BA _ba,Object _me_) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_getmodalidad_gral", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_getmodalidad_gral", new Object[] {_ba,_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetModalidad_Gral(Me_ A";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim	vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"		    <Sb_GetModalidad_Gral xmlns=\"http://BakApp\">\n"+"		    <Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</Global_BaseBk>\n"+"		    </Sb_GetModalidad_Gral>\n"+"		  </soap:Body>\n"+"		</soap:Envelope");
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_GetModalidad_Gral\""));
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revisar_stock_fila(anywheresoftware.b4a.BA _ba,Object _me_,String _tido,String _empresa,String _sucursal,String _bodega,String _codigo,double _cantidad,int _untrans,String _tidopa) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_revisar_stock_fila", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_revisar_stock_fila", new Object[] {_ba,_me_,_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Revisar_Stock_Fila(Me_";
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_Revisar_Stock_Fila xmlns=\"http://BakApp\">\n"+"		      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"		      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"		      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursal>\n"+"		      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</_Bodega>\n"+"		      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</_Codigo>\n"+"		      <_Cantidad>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_cantidad))+"</_Cantidad>\n"+"		      <_UnTrans>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_untrans))+"</_UnTrans>\n"+"		      <_Tidopa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tidopa))+"</_Tidopa>\n"+"		    </Sb_Revisar_Stock_Fila>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=6881306;
 //BA.debugLineNum = 6881306;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6881307;
 //BA.debugLineNum = 6881307;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6881309;
 //BA.debugLineNum = 6881309;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6881310;
 //BA.debugLineNum = 6881310;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6881311;
 //BA.debugLineNum = 6881311;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6881312;
 //BA.debugLineNum = 6881312;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Revisar_Stock_Fila\""));
RDebugUtils.currentLine=6881314;
 //BA.debugLineNum = 6881314;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6881316;
 //BA.debugLineNum = 6881316;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_revisardocvslistaprecio(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo,int _vnta_dias_venci_coti) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_revisardocvslistaprecio", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_revisardocvslistaprecio", new Object[] {_ba,_me_,_idmaeedo,_vnta_dias_venci_coti}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_RevisarDocVsListaPrecio xmlns=\"http://BakApp\">\n"+"				      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"				      <_Vnta_Dias_Venci_Coti>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_vnta_dias_venci_coti))+"</_Vnta_Dias_Venci_Coti>\n"+"				    </Sb_RevisarDocVsListaPrecio>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_RevisarDocVsListaPrecio\""));
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_concepto_json(anywheresoftware.b4a.BA _ba,Object _me_,String _concepto,String _empresa,String _sucursal,String _bodega,String _lista,String _koen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_concepto_json", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_concepto_json", new Object[] {_ba,_me_,_concepto,_empresa,_sucursal,_bodega,_lista,_koen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me_";
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Concepto_Json xmlns=\"http://BakApp\">\n"+"			      <_Concepto>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_concepto))+"</_Concepto>\n"+"			      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursal>\n"+"			      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_bodega))+"</_Bodega>\n"+"			      <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_lista))+"</_Lista>\n"+"			      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"			    </Sb_Traer_Concepto_Json>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=6684694;
 //BA.debugLineNum = 6684694;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6684695;
 //BA.debugLineNum = 6684695;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6684697;
 //BA.debugLineNum = 6684697;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6684698;
 //BA.debugLineNum = 6684698;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6684699;
 //BA.debugLineNum = 6684699;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6684700;
 //BA.debugLineNum = 6684700;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Concepto_Json\""));
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6684704;
 //BA.debugLineNum = 6684704;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_descuento_global_x_cliente(anywheresoftware.b4a.BA _ba,Object _me_,String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_descuento_global_x_cliente", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_descuento_global_x_cliente", new Object[] {_ba,_me_,_koen,_suen}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuento_Global_";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"		  <soap12:Body>\n"+"		    <Sb_Traer_Descuento_Global_X_Cliente xmlns=\"http://BakApp\">\n"+"		      <_Global_BaseBk>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk>\n"+"		      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"		      <_Suen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_suen))+"</_Suen>\n"+"		    </Sb_Traer_Descuento_Global_X_Cliente>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Descuento_Global_X_Cliente\""));
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuentos_Setead";
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="Dim vPrct,vChkValoresNeto As String";
_vprct = "";
_vchkvaloresneto = "";
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="If Prct Then";
if (_prct) { 
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="vPrct = \"True\"";
_vprct = "True";
 }else {
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="vPrct = False";
_vprct = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="If ChkValoresNeto Then";
if (_chkvaloresneto) { 
RDebugUtils.currentLine=6946836;
 //BA.debugLineNum = 6946836;BA.debugLine="vChkValoresNeto = \"True\"";
_vchkvaloresneto = "True";
 }else {
RDebugUtils.currentLine=6946838;
 //BA.debugLineNum = 6946838;BA.debugLine="vChkValoresNeto = False";
_vchkvaloresneto = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6946841;
 //BA.debugLineNum = 6946841;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			<soap12:Body>\n"+"			<Sb_Traer_Descuentos_Seteados_Desde_Lista xmlns=\"http://BakApp\">\n"+"			<_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_empresa))+"</_Empresa>\n"+"			<_Sucursa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_sucursal))+"</_Sucursa>\n"+"			<_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codigo))+"</_Codigo>\n"+"			<_CodLista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_codlista))+"</_CodLista>\n"+"		      <_Prct>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_prct))+"</_Prct>\n"+"		      <_Tict>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tict))+"</_Tict>\n"+"		      <_PorIva>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_poriva))+"</_PorIva>\n"+"		      <_PorIla>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_porila))+"</_PorIla>\n"+"		      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"		      <_ChkValoresNeto>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_chkvaloresneto))+"</_ChkValoresNeto>\n"+"		    </Sb_Traer_Descuentos_Seteados_Desde_Lista>\n"+"		  </soap12:Body>\n"+"		</soap12:Envelope>");
RDebugUtils.currentLine=6946859;
 //BA.debugLineNum = 6946859;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=6946860;
 //BA.debugLineNum = 6946860;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=6946862;
 //BA.debugLineNum = 6946862;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=6946863;
 //BA.debugLineNum = 6946863;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=6946864;
 //BA.debugLineNum = 6946864;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=6946865;
 //BA.debugLineNum = 6946865;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Descuentos_Seteados_Desde_Lista\""));
RDebugUtils.currentLine=6946867;
 //BA.debugLineNum = 6946867;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=6946869;
 //BA.debugLineNum = 6946869;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_documento(anywheresoftware.b4a.BA _ba,Object _me_,String _tido,String _nudo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_documento", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_documento", new Object[] {_ba,_me_,_tido,_nudo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento(Me_ As";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Documento xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"			      <_Tido>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_tido))+"</_Tido>\n"+"			      <_Nudo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_nudo))+"</_Nudo>\n"+"			    </Sb_Traer_Documento>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7667731;
 //BA.debugLineNum = 7667731;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Documento\""));
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7667735;
 //BA.debugLineNum = 7667735;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_traer_documento2(anywheresoftware.b4a.BA _ba,Object _me_,int _idmaeedo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_traer_documento2", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_traer_documento2", new Object[] {_ba,_me_,_idmaeedo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento2(Me_ As";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"			  <soap12:Body>\n"+"			    <Sb_Traer_Documento2 xmlns=\"http://BakApp\">\n"+"			      <_Global_BaseBk2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(mostCurrent._variables._global_basebk /*String*/ ))+"</_Global_BaseBk2>\n"+"			      <_Idmaeedo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_idmaeedo))+"</_Idmaeedo>\n"+"			    </Sb_Traer_Documento2>\n"+"			  </soap12:Body>\n"+"			</soap12:Envelope>");
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Traer_Documento2\""));
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7733270;
 //BA.debugLineNum = 7733270;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_usar_clave_docdespsimple_poswii(anywheresoftware.b4a.BA _ba,Object _me_,String _clave,String _koen,boolean _eliminar) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_usar_clave_docdespsimple_poswii", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_usar_clave_docdespsimple_poswii", new Object[] {_ba,_me_,_clave,_koen,_eliminar}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimpl";
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"				  <soap12:Body>\n"+"				    <Sb_Usar_Clave_DocDespSimple_Poswii xmlns=\"http://BakApp\">\n"+"				      <_Clave>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_clave))+"</_Clave>\n"+"				      <_Koen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_koen))+"</_Koen>\n"+"				      <_Eliminar>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_eliminar))+"</_Eliminar>\n"+"				    </Sb_Usar_Clave_DocDespSimple_Poswii>\n"+"				  </soap12:Body>\n"+"				</soap12:Envelope>");
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Usar_Clave_DocDespSimple_Poswii\""));
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _fx_httjob_ws_sb_usar_dscto_poswii(anywheresoftware.b4a.BA _ba,Object _me_,String _clave,String _kofu,boolean _eliminar) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_httjob_ws_sb_usar_dscto_poswii", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(null, "fx_httjob_ws_sb_usar_dscto_poswii", new Object[] {_ba,_me_,_clave,_kofu,_eliminar}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me_ A";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"		  <soap:Body>\n"+"			    <Sb_Usar_Dscto_Poswii xmlns=\"http://BakApp\">\n"+"			      <_Clave>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_clave))+"</_Clave>\n"+"			      <_Kofu>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_kofu))+"</_Kofu>\n"+"			      <_Eliminar>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_eliminar))+"</_Eliminar>\n"+"			    </Sb_Usar_Dscto_Poswii>\n"+"		  </soap:Body>\n"+"		</soap:Envelope>");
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="Js.Initialize(\"\",Me_)";
_js._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),"",_me_);
RDebugUtils.currentLine=7405584;
 //BA.debugLineNum = 7405584;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Usar_Dscto_Poswii\""));
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=7405590;
 //BA.debugLineNum = 7405590;BA.debugLine="End Sub";
return null;
}
public static boolean  _fx_isemail(anywheresoftware.b4a.BA _ba,String _emailaddress) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_isemail", false))
	 {return ((Boolean) Debug.delegate(null, "fx_isemail", new Object[] {_ba,_emailaddress}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub Fx_IsEmail(EmailAddress As String) As Boolean";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Log(MatchEmail.Match)";
anywheresoftware.b4a.keywords.Common.LogImpl("28716291",_matchemail.getMatch(),0);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="Log(\"Oops, Por favor vuelve a comprobar tu direc";
anywheresoftware.b4a.keywords.Common.LogImpl("28716294","Oops, Por favor vuelve a comprobar tu dirección de email",0);
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="End Sub";
return false;
}
public static String  _fx_nulopornro(anywheresoftware.b4a.BA _ba,Object _value,double _valorxdefecto) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_nulopornro", false))
	 {return ((String) Debug.delegate(null, "fx_nulopornro", new Object[] {_ba,_value,_valorxdefecto}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub Fx_NuloPorNro(value As Object, valorxde";
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="If IsNull(value) Then";
if (_isnull(_ba,_value)) { 
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Return valorxdefecto";
if (true) return BA.NumberToString(_valorxdefecto);
 };
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Return value";
if (true) return BA.ObjectToString(_value);
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="End Sub";
return "";
}
public static boolean  _isnull(anywheresoftware.b4a.BA _ba,Object _o) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "isnull", false))
	 {return ((Boolean) Debug.delegate(null, "isnull", new Object[] {_ba,_o}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub IsNull(O As Object) As Boolean";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return (O=Null)";
if (true) return (_o== null);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return false;
}
public static String  _fx_nuloporstr(anywheresoftware.b4a.BA _ba,Object _value,String _valorxdefecto) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_nuloporstr", false))
	 {return ((String) Debug.delegate(null, "fx_nuloporstr", new Object[] {_ba,_value,_valorxdefecto}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub Fx_NuloPorStr(value As Object,valorxdef";
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="If IsNull(value) Then";
if (_isnull(_ba,_value)) { 
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Return valorxdefecto";
if (true) return _valorxdefecto;
 };
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="Return value";
if (true) return BA.ObjectToString(_value);
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="End Sub";
return "";
}
public static boolean  _fx_solo_enteros(anywheresoftware.b4a.BA _ba,double _cantidad,String _divisible) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fx_solo_enteros", false))
	 {return ((Boolean) Debug.delegate(null, "fx_solo_enteros", new Object[] {_ba,_cantidad,_divisible}));}
boolean _cant_tiene_decimales = false;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub Fx_Solo_Enteros(Cantidad As Double, Div";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim Cant_Tiene_Decimales As Boolean";
_cant_tiene_decimales = false;
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="If Cantidad <> 0 Then";
if (_cantidad!=0) { 
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="If  IsNumber(Cantidad) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_cantidad))) { 
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="If NumberFormat(Cantidad,0,0) = Cantidad Then";
if ((anywheresoftware.b4a.keywords.Common.NumberFormat(_cantidad,(int) (0),(int) (0))).equals(BA.NumberToString(_cantidad))) { 
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Cant_Tiene_Decimales = False";
_cant_tiene_decimales = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="Cant_Tiene_Decimales = True";
_cant_tiene_decimales = anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="If Cant_Tiene_Decimales Then";
if (_cant_tiene_decimales) { 
RDebugUtils.currentLine=8257553;
 //BA.debugLineNum = 8257553;BA.debugLine="If Divisible = \"0\" Or Divisible = \"N\" Then";
if ((_divisible).equals("0") || (_divisible).equals("N")) { 
RDebugUtils.currentLine=8257554;
 //BA.debugLineNum = 8257554;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 };
 };
RDebugUtils.currentLine=8257560;
 //BA.debugLineNum = 8257560;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=8257562;
 //BA.debugLineNum = 8257562;BA.debugLine="End Sub";
return false;
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "left", false))
	 {return ((String) Debug.delegate(null, "left", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Return Text.SubString2(0, Length)";
if (true) return _text.substring((int) (0),_length);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return "";
}
public static String  _rellenar_derecha(anywheresoftware.b4a.BA _ba,String _cadena,int _cantcaracteres,String _relleno) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rellenar_derecha", false))
	 {return ((String) Debug.delegate(null, "rellenar_derecha", new Object[] {_ba,_cadena,_cantcaracteres,_relleno}));}
int _i = 0;
String _nro = "";
int _cantidad = 0;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Rellenar_Derecha(Cadena As String,CantC";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Dim nro As String";
_nro = "";
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="nro = Cadena.Length";
_nro = BA.NumberToString(_cadena.length());
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
_cantidad = (int) (_cantcaracteres-(double)(Double.parseDouble(_nro)));
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="For i = 0 To Cantidad - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cantidad-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Cadena = Cadena & Relleno";
_cadena = _cadena+_relleno;
 }
};
 };
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Return Cadena";
if (true) return _cadena;
RDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="End Sub";
return "";
}
public static String  _right(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "right", false))
	 {return ((String) Debug.delegate(null, "right", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Return Text.SubString(Text.Length-Length)";
if (true) return _text.substring((int) (_text.length()-_length));
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="End Sub";
return "";
}
public static String  _rtrim(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rtrim", false))
	 {return ((String) Debug.delegate(null, "rtrim", new Object[] {_ba,_s}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub RTrim(s As String) As String";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("(\\s+)$",_s);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Return s.SubString(m.GetEnd(1))";
if (true) return _s.substring(_m.GetEnd((int) (1)));
 }else {
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub Sb_Borrar_Todos_Registros_De_Tabla(Tabla As St";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Tabla = Tabla.ToLowerCase";
_tabla = _tabla.toLowerCase();
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="Campo = Campo.ToLowerCase";
_campo = _campo.toLowerCase();
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="Consulta_Sql = \"Select \" & Campo & \" From \" & Tab";
_consulta_sql = "Select "+_campo+" From "+_tabla;
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="Table = DBUtils.ExecuteMemoryTable(Variables.vSql";
_table = mostCurrent._dbutils._executememorytable /*anywheresoftware.b4a.objects.collections.List*/ (_ba,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,_consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="Dim Id = Cols(0)";
_id = _cols[(int) (0)];
RDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="Consulta_Sql = \"Delete From [\" & Tabla & \"] Wher";
_consulta_sql = "Delete From ["+_tabla+"] Where ["+_campo+"] = ?";
RDebugUtils.currentLine=8847377;
 //BA.debugLineNum = 8847377;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(_consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
 }
};
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="End Sub";
return "";
}
public static String  _sb_borrartodoslosregistrosdelabasededatos(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sb_borrartodoslosregistrosdelabasededatos", false))
	 {return ((String) Debug.delegate(null, "sb_borrartodoslosregistrosdelabasededatos", new Object[] {_ba}));}
String _consulta_sql = "";
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc]\"";
_consulta_sql = "Delete From [Descuentos_Doc]";
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc]\"";
_consulta_sql = "Delete From [DespaFacil_Doc]";
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc]\"";
_consulta_sql = "Delete From [Detalle_Doc]";
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="Consulta_Sql = \"Delete From [Encabezado_Doc]\"";
_consulta_sql = "Delete From [Encabezado_Doc]";
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc]\"";
_consulta_sql = "Delete From [Impuestos_Doc]";
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc]\"";
_consulta_sql = "Delete From [Observaciones_Doc]";
RDebugUtils.currentLine=8912916;
 //BA.debugLineNum = 8912916;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_consulta_sql);
RDebugUtils.currentLine=8912918;
 //BA.debugLineNum = 8912918;BA.debugLine="End Sub";
return "";
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _text,String _delimiter) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "split", false))
	 {return ((String[]) Debug.delegate(null, "split", new Object[] {_ba,_text,_delimiter}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Return Regex.Split(Delimiter,Text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_text);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return null;
}
}