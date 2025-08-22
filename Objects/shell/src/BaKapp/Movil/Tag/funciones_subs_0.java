package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class funciones_subs_0 {


public static RemoteObject  _cbool(RemoteObject _ba,RemoteObject _inint) throws Exception{
try {
		Debug.PushSubsStack("Cbool (funciones) ","funciones",23,_ba,funciones.mostCurrent,48);
if (RapidSub.canDelegate("cbool")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","cbool", _ba, _inint);}
;
Debug.locals.put("inInt", _inint);
 BA.debugLineNum = 48;BA.debugLine="Sub Cbool(inInt As Double) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="If inInt = 0 Then Return False";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_inint,BA.numberCast(double.class, 0))) { 
if (true) return funciones.mostCurrent.__c.getField(true,"False");};
 BA.debugLineNum = 50;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return funciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cdouble(RemoteObject _ba,RemoteObject _ins) throws Exception{
try {
		Debug.PushSubsStack("CDouble (funciones) ","funciones",23,_ba,funciones.mostCurrent,53);
if (RapidSub.canDelegate("cdouble")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","cdouble", _ba, _ins);}
;
Debug.locals.put("InS", _ins);
 BA.debugLineNum = 53;BA.debugLine="Sub CDouble(InS As String) As Double";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Return InS";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(double.class, _ins);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fecha_formato(RemoteObject _ba,RemoteObject _fecha,RemoteObject _separador) throws Exception{
try {
		Debug.PushSubsStack("Fecha_Formato (funciones) ","funciones",23,_ba,funciones.mostCurrent,913);
if (RapidSub.canDelegate("fecha_formato")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fecha_formato", _ba, _fecha, _separador);}
RemoteObject _vyear = RemoteObject.createImmutable("");
RemoteObject _vmonth = RemoteObject.createImmutable("");
RemoteObject _vday = RemoteObject.createImmutable("");
RemoteObject _fechastr = RemoteObject.createImmutable("");
;
Debug.locals.put("Fecha", _fecha);
Debug.locals.put("Separador", _separador);
 BA.debugLineNum = 913;BA.debugLine="Public Sub Fecha_Formato(Fecha As Long,Separador A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 915;BA.debugLine="Dim vYear = DateTime.GetYear(Fecha)";
Debug.ShouldStop(262144);
_vyear = BA.NumberToString(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fecha)));Debug.locals.put("vYear", _vyear);Debug.locals.put("vYear", _vyear);
 BA.debugLineNum = 916;BA.debugLine="Dim vMonth = DateTime.GetMonth(Fecha)";
Debug.ShouldStop(524288);
_vmonth = BA.NumberToString(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fecha)));Debug.locals.put("vMonth", _vmonth);Debug.locals.put("vMonth", _vmonth);
 BA.debugLineNum = 917;BA.debugLine="Dim vDay = DateTime.GetDayOfMonth(Fecha)";
Debug.ShouldStop(1048576);
_vday = BA.NumberToString(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fecha)));Debug.locals.put("vDay", _vday);Debug.locals.put("vDay", _vday);
 BA.debugLineNum = 919;BA.debugLine="If Separador = \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_separador,BA.ObjectToString(""))) { 
 BA.debugLineNum = 920;BA.debugLine="Separador = \"/\"";
Debug.ShouldStop(8388608);
_separador = BA.ObjectToString("/");Debug.locals.put("Separador", _separador);
 };
 BA.debugLineNum = 923;BA.debugLine="Dim FechaStr As String = Rellenar_Izquierda(vDay,";
Debug.ShouldStop(67108864);
_fechastr = RemoteObject.concat(_rellenar_izquierda(_ba,_vday,BA.numberCast(int.class, 2),RemoteObject.createImmutable("0")),_separador,_rellenar_izquierda(_ba,_vmonth,BA.numberCast(int.class, 2),RemoteObject.createImmutable("0")),_separador,_vyear);Debug.locals.put("FechaStr", _fechastr);Debug.locals.put("FechaStr", _fechastr);
 BA.debugLineNum = 925;BA.debugLine="Return FechaStr";
Debug.ShouldStop(268435456);
if (true) return _fechastr;
 BA.debugLineNum = 927;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_cadena_a_buscar_sql(RemoteObject _ba,RemoteObject _vcadena,RemoteObject _vcampo,RemoteObject _vand_or) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cadena_a_buscar_SQL (funciones) ","funciones",23,_ba,funciones.mostCurrent,799);
if (RapidSub.canDelegate("fx_cadena_a_buscar_sql")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_cadena_a_buscar_sql", _ba, _vcadena, _vcampo, _vand_or);}
RemoteObject _linea1 = RemoteObject.createImmutable("");
RemoteObject _linea2 = RemoteObject.createImmutable("");
RemoteObject _vconcatenar = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("vCadena", _vcadena);
Debug.locals.put("vCampo", _vcampo);
Debug.locals.put("vAnd_Or", _vand_or);
 BA.debugLineNum = 799;BA.debugLine="Public Sub Fx_Cadena_a_buscar_SQL(vCadena As Strin";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 803;BA.debugLine="Dim linea1, linea2 As String";
Debug.ShouldStop(4);
_linea1 = RemoteObject.createImmutable("");Debug.locals.put("linea1", _linea1);
_linea2 = RemoteObject.createImmutable("");Debug.locals.put("linea2", _linea2);
 BA.debugLineNum = 804;BA.debugLine="Dim vConcatenar As String = \"\"";
Debug.ShouldStop(8);
_vconcatenar = BA.ObjectToString("");Debug.locals.put("vConcatenar", _vconcatenar);Debug.locals.put("vConcatenar", _vconcatenar);
 BA.debugLineNum = 807;BA.debugLine="If vAnd_Or = \"\" Then vAnd_Or = \"And\"";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_vand_or,BA.ObjectToString(""))) { 
_vand_or = BA.ObjectToString("And");Debug.locals.put("vAnd_Or", _vand_or);};
 BA.debugLineNum = 809;BA.debugLine="For i = 1 To vCadena.Length' Len(vCadena)";
Debug.ShouldStop(256);
{
final int step4 = 1;
final int limit4 = _vcadena.runMethod(true,"length").<Integer>get().intValue();
_i = 1 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 810;BA.debugLine="linea1 = LTrim(Mid(vCadena, i, 1)).ToUpperCase'U";
Debug.ShouldStop(512);
_linea1 = _ltrim(_ba,_mid(_ba,_vcadena,BA.numberCast(int.class, _i),BA.numberCast(int.class, 1))).runMethod(true,"toUpperCase");Debug.locals.put("linea1", _linea1);
 BA.debugLineNum = 811;BA.debugLine="linea2 = linea1.ToLowerCase'LCase(linea1)";
Debug.ShouldStop(1024);
_linea2 = _linea1.runMethod(true,"toLowerCase");Debug.locals.put("linea2", _linea2);
 BA.debugLineNum = 813;BA.debugLine="If linea1 = \"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_linea1,BA.ObjectToString(""))) { 
 BA.debugLineNum = 814;BA.debugLine="vConcatenar = vConcatenar & \"%' \" & vAnd_Or & \"";
Debug.ShouldStop(8192);
_vconcatenar = RemoteObject.concat(_vconcatenar,RemoteObject.createImmutable("%' "),_vand_or,RemoteObject.createImmutable(" "),_vcampo);Debug.locals.put("vConcatenar", _vconcatenar);
 }else {
 BA.debugLineNum = 816;BA.debugLine="vConcatenar = vConcatenar & \"[\" & linea1 & line";
Debug.ShouldStop(32768);
_vconcatenar = RemoteObject.concat(_vconcatenar,RemoteObject.createImmutable("["),_linea1,_linea2,RemoteObject.createImmutable("]"));Debug.locals.put("vConcatenar", _vconcatenar);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 819;BA.debugLine="Return vConcatenar";
Debug.ShouldStop(262144);
if (true) return _vconcatenar;
 BA.debugLineNum = 821;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_datarow(RemoteObject _ba,RemoteObject _vgetstring_json) throws Exception{
try {
		Debug.PushSubsStack("Fx_DataRow (funciones) ","funciones",23,_ba,funciones.mostCurrent,74);
if (RapidSub.canDelegate("fx_datarow")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_datarow", _ba, _vgetstring_json);}
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("vGetString_Json", _vgetstring_json);
 BA.debugLineNum = 74;BA.debugLine="public Sub Fx_DataRow(vGetString_Json As String) A";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Dim Table As List = Fx_DataSet(vGetString_Json).G";
Debug.ShouldStop(1024);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _fx_dataset(_ba,_vgetstring_json).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 76;BA.debugLine="Dim Row As Map = Table.Get(0)";
Debug.ShouldStop(2048);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 77;BA.debugLine="Return Row";
Debug.ShouldStop(4096);
if (true) return _row;
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_dataset(RemoteObject _ba,RemoteObject _vgetstring_json) throws Exception{
try {
		Debug.PushSubsStack("Fx_DataSet (funciones) ","funciones",23,_ba,funciones.mostCurrent,57);
if (RapidSub.canDelegate("fx_dataset")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_dataset", _ba, _vgetstring_json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _ds = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("vGetString_Json", _vgetstring_json);
 BA.debugLineNum = 57;BA.debugLine="public Sub Fx_DataSet(vGetString_Json As String) A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="Dim Parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("Parser", _parser);
 BA.debugLineNum = 60;BA.debugLine="Parser.Initialize(vGetString_Json)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_vgetstring_json));
 BA.debugLineNum = 61;BA.debugLine="Dim Ds As Map = Parser.NextObject";
Debug.ShouldStop(268435456);
_ds = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ds = _parser.runMethod(false,"NextObject");Debug.locals.put("Ds", _ds);Debug.locals.put("Ds", _ds);
 BA.debugLineNum = 62;BA.debugLine="Return Ds";
Debug.ShouldStop(536870912);
if (true) return _ds;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_datatable(RemoteObject _ba,RemoteObject _vgetstring_json) throws Exception{
try {
		Debug.PushSubsStack("Fx_DataTable (funciones) ","funciones",23,_ba,funciones.mostCurrent,66);
if (RapidSub.canDelegate("fx_datatable")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_datatable", _ba, _vgetstring_json);}
RemoteObject _ds = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("vGetString_Json", _vgetstring_json);
 BA.debugLineNum = 66;BA.debugLine="public Sub Fx_DataTable(vGetString_Json As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="Dim Ds As Map = Fx_DataSet(vGetString_Json)";
Debug.ShouldStop(8);
_ds = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ds = _fx_dataset(_ba,_vgetstring_json);Debug.locals.put("Ds", _ds);Debug.locals.put("Ds", _ds);
 BA.debugLineNum = 69;BA.debugLine="Dim Table As List = Ds.Get(\"Table\")";
Debug.ShouldStop(16);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ds.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 70;BA.debugLine="Return Table";
Debug.ShouldStop(32);
if (true) return _table;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_actualizar_observaciones_documento(RemoteObject _ba,RemoteObject _me_,RemoteObject _idmaeedo,RemoteObject _obdo,RemoteObject _ocdo) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Actualizar_Observaciones_Documento (funciones) ","funciones",23,_ba,funciones.mostCurrent,644);
if (RapidSub.canDelegate("fx_httjob_ws_sb_actualizar_observaciones_documento")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_actualizar_observaciones_documento", _ba, _me_, _idmaeedo, _obdo, _ocdo);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Idmaeedo", _idmaeedo);
Debug.locals.put("Obdo", _obdo);
Debug.locals.put("Ocdo", _ocdo);
 BA.debugLineNum = 644;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Actualizar_Observacione";
Debug.ShouldStop(8);
 BA.debugLineNum = 646;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(32);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				  <soap12:Body>\n"),RemoteObject.createImmutable("				    <Sb_Actualizar_Observaciones_Documento xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_Idmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_idmaeedo))),RemoteObject.createImmutable("</_Idmaeedo>\n"),RemoteObject.createImmutable("				      <_Observaciones>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_obdo))),RemoteObject.createImmutable("</_Observaciones>\n"),RemoteObject.createImmutable("				      <_Orden_De_Compra>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_ocdo))),RemoteObject.createImmutable("</_Orden_De_Compra>\n"),RemoteObject.createImmutable("				    </Sb_Actualizar_Observaciones_Documento>\n"),RemoteObject.createImmutable("				  </soap12:Body>\n"),RemoteObject.createImmutable("				</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 657;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(65536);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 658;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(131072);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 660;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(524288);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 661;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(1048576);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 662;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(2097152);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 663;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(4194304);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Actualizar_Observaciones_Documento\""))));
 BA.debugLineNum = 665;BA.debugLine="Return Js";
Debug.ShouldStop(16777216);
if (true) return _js;
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_creadocumentojsonbakapp(RemoteObject _ba,RemoteObject _me_,RemoteObject _encabezadojs,RemoteObject _destallejs,RemoteObject _descuentosjs,RemoteObject _observacionesjs) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp (funciones) ","funciones",23,_ba,funciones.mostCurrent,355);
if (RapidSub.canDelegate("fx_httjob_ws_sb_creadocumentojsonbakapp")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_creadocumentojsonbakapp", _ba, _me_, _encabezadojs, _destallejs, _descuentosjs, _observacionesjs);}
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("EncabezadoJs", _encabezadojs);
Debug.locals.put("DestalleJs", _destallejs);
Debug.locals.put("DescuentosJs", _descuentosjs);
Debug.locals.put("ObservacionesJs", _observacionesjs);
 BA.debugLineNum = 355;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
Debug.ShouldStop(4);
 BA.debugLineNum = 357;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
Debug.ShouldStop(16);
_id = BA.numberCast(int.class, funciones.mostCurrent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))));Debug.locals.put("Id", _id);Debug.locals.put("Id", _id);
 BA.debugLineNum = 359;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(64);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("		  <soap:Body>\n"),RemoteObject.createImmutable("		          <Sb_CreaDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_EncabezadoJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_encabezadojs))),RemoteObject.createImmutable("</_EncabezadoJs>\n"),RemoteObject.createImmutable("				      <_DestalleJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_destallejs))),RemoteObject.createImmutable("</_DestalleJs>\n"),RemoteObject.createImmutable("				      <_DescuentosJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_descuentosjs))),RemoteObject.createImmutable("</_DescuentosJs>\n"),RemoteObject.createImmutable("				      <_ObservacionesJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_observacionesjs))),RemoteObject.createImmutable("</_ObservacionesJs>\n"),RemoteObject.createImmutable("					  <_Id_Estacion>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_id))),RemoteObject.createImmutable("</_Id_Estacion>\n"),RemoteObject.createImmutable("				   </Sb_CreaDocumentoJsonBakapp>\n"),RemoteObject.createImmutable("		  </soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 371;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(262144);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 372;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(524288);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 374;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(2097152);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 375;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(4194304);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 376;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(8388608);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 377;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(16777216);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_CreaDocumentoJsonBakapp\""))));
 BA.debugLineNum = 379;BA.debugLine="Return Js";
Debug.ShouldStop(67108864);
if (true) return _js;
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_creadocumentojsonbakapp2(RemoteObject _ba,RemoteObject _me_,RemoteObject _encabezadojs,RemoteObject _destallejs,RemoteObject _descuentosjs,RemoteObject _observacionesjs,RemoteObject _despachosimplejs) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp2 (funciones) ","funciones",23,_ba,funciones.mostCurrent,383);
if (RapidSub.canDelegate("fx_httjob_ws_sb_creadocumentojsonbakapp2")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_creadocumentojsonbakapp2", _ba, _me_, _encabezadojs, _destallejs, _descuentosjs, _observacionesjs, _despachosimplejs);}
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("EncabezadoJs", _encabezadojs);
Debug.locals.put("DestalleJs", _destallejs);
Debug.locals.put("DescuentosJs", _descuentosjs);
Debug.locals.put("ObservacionesJs", _observacionesjs);
Debug.locals.put("DespachoSimpleJs", _despachosimplejs);
 BA.debugLineNum = 383;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_CreaDocumentoJsonBakapp";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 385;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
Debug.ShouldStop(1);
_id = BA.numberCast(int.class, funciones.mostCurrent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))));Debug.locals.put("Id", _id);Debug.locals.put("Id", _id);
 BA.debugLineNum = 387;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(4);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("		  <soap12:Body>\n"),RemoteObject.createImmutable("			    <Sb_CreaDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("					<_EncabezadoJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_encabezadojs))),RemoteObject.createImmutable("</_EncabezadoJs>\n"),RemoteObject.createImmutable("				    <_DestalleJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_destallejs))),RemoteObject.createImmutable("</_DestalleJs>\n"),RemoteObject.createImmutable("				    <_DescuentosJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_descuentosjs))),RemoteObject.createImmutable("</_DescuentosJs>\n"),RemoteObject.createImmutable("				    <_ObservacionesJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_observacionesjs))),RemoteObject.createImmutable("</_ObservacionesJs>\n"),RemoteObject.createImmutable("			      <_DespachoSimpleJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_despachosimplejs))),RemoteObject.createImmutable("</_DespachoSimpleJs>\n"),RemoteObject.createImmutable("			      <_Id_Estacion>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_id))),RemoteObject.createImmutable("</_Id_Estacion>\n"),RemoteObject.createImmutable("			    </Sb_CreaDocumentoJsonBakapp2>\n"),RemoteObject.createImmutable("		  </soap12:Body>\n"),RemoteObject.createImmutable("		</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 400;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(32768);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 401;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(65536);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 403;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(262144);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 404;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(524288);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 405;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(1048576);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 406;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(2097152);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_CreaDocumentoJsonBakapp2\""))));
 BA.debugLineNum = 408;BA.debugLine="Return Js";
Debug.ShouldStop(8388608);
if (true) return _js;
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_editardocumentojsonbakapp(RemoteObject _ba,RemoteObject _me_,RemoteObject _oldidmaeedo,RemoteObject _cod_func_eliminador,RemoteObject _encabezadojs,RemoteObject _destallejs,RemoteObject _descuentosjs,RemoteObject _observacionesjs,RemoteObject _cambiar_nrodocumento) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_EditarDocumentoJsonBakapp (funciones) ","funciones",23,_ba,funciones.mostCurrent,412);
if (RapidSub.canDelegate("fx_httjob_ws_sb_editardocumentojsonbakapp")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_editardocumentojsonbakapp", _ba, _me_, _oldidmaeedo, _cod_func_eliminador, _encabezadojs, _destallejs, _descuentosjs, _observacionesjs, _cambiar_nrodocumento);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("OldIdmaeedo", _oldidmaeedo);
Debug.locals.put("Cod_Func_Eliminador", _cod_func_eliminador);
Debug.locals.put("EncabezadoJs", _encabezadojs);
Debug.locals.put("DestalleJs", _destallejs);
Debug.locals.put("DescuentosJs", _descuentosjs);
Debug.locals.put("ObservacionesJs", _observacionesjs);
Debug.locals.put("Cambiar_NroDocumento", _cambiar_nrodocumento);
 BA.debugLineNum = 412;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 421;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				  <soap12:Body>\n"),RemoteObject.createImmutable("				    <Sb_EditarDocumentoJsonBakapp xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_OldIdmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_oldidmaeedo))),RemoteObject.createImmutable("</_OldIdmaeedo>\n"),RemoteObject.createImmutable("				      <_Cod_Func_Eliminador>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_cod_func_eliminador))),RemoteObject.createImmutable("</_Cod_Func_Eliminador>\n"),RemoteObject.createImmutable("				      <_Global_BaseBk>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk>\n"),RemoteObject.createImmutable("				      <_EncabezadoJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_encabezadojs))),RemoteObject.createImmutable("</_EncabezadoJs>\n"),RemoteObject.createImmutable("				      <_DestalleJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_destallejs))),RemoteObject.createImmutable("</_DestalleJs>\n"),RemoteObject.createImmutable("				      <_DescuentosJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_descuentosjs))),RemoteObject.createImmutable("</_DescuentosJs>\n"),RemoteObject.createImmutable("				      <_ObservacionesJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_observacionesjs))),RemoteObject.createImmutable("</_ObservacionesJs>\n"),RemoteObject.createImmutable("					  <_Cambiar_NroDocumento>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_cambiar_nrodocumento))),RemoteObject.createImmutable("</_Cambiar_NroDocumento>\n"),RemoteObject.createImmutable("				    </Sb_EditarDocumentoJsonBakapp>\n"),RemoteObject.createImmutable("				  </soap12:Body>\n"),RemoteObject.createImmutable("				</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 437;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(1048576);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 438;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(2097152);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 440;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(8388608);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 441;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(16777216);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 442;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(33554432);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 443;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(67108864);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""))));
 BA.debugLineNum = 445;BA.debugLine="Return Js";
Debug.ShouldStop(268435456);
if (true) return _js;
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_editardocumentojsonbakapp2(RemoteObject _ba,RemoteObject _me_,RemoteObject _oldidmaeedo,RemoteObject _cod_func_eliminador,RemoteObject _encabezadojs,RemoteObject _destallejs,RemoteObject _descuentosjs,RemoteObject _observacionesjs,RemoteObject _despafaciljs,RemoteObject _cambiar_nrodocumento) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_EditarDocumentoJsonBakapp2 (funciones) ","funciones",23,_ba,funciones.mostCurrent,449);
if (RapidSub.canDelegate("fx_httjob_ws_sb_editardocumentojsonbakapp2")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_editardocumentojsonbakapp2", _ba, _me_, _oldidmaeedo, _cod_func_eliminador, _encabezadojs, _destallejs, _descuentosjs, _observacionesjs, _despafaciljs, _cambiar_nrodocumento);}
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("OldIdmaeedo", _oldidmaeedo);
Debug.locals.put("Cod_Func_Eliminador", _cod_func_eliminador);
Debug.locals.put("EncabezadoJs", _encabezadojs);
Debug.locals.put("DestalleJs", _destallejs);
Debug.locals.put("DescuentosJs", _descuentosjs);
Debug.locals.put("ObservacionesJs", _observacionesjs);
Debug.locals.put("DespaFaciljs", _despafaciljs);
Debug.locals.put("Cambiar_NroDocumento", _cambiar_nrodocumento);
 BA.debugLineNum = 449;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EditarDocumentoJsonBaka";
Debug.ShouldStop(1);
 BA.debugLineNum = 459;BA.debugLine="Dim Id As Int = Variables.Global_Row_EstacionBk.G";
Debug.ShouldStop(1024);
_id = BA.numberCast(int.class, funciones.mostCurrent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Id")))));Debug.locals.put("Id", _id);Debug.locals.put("Id", _id);
 BA.debugLineNum = 461;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(4096);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				  <soap12:Body>\n"),RemoteObject.createImmutable("				    <Sb_EditarDocumentoJsonBakapp2 xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_OldIdmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_oldidmaeedo))),RemoteObject.createImmutable("</_OldIdmaeedo>\n"),RemoteObject.createImmutable("				      <_Cod_Func_Eliminador>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_cod_func_eliminador))),RemoteObject.createImmutable("</_Cod_Func_Eliminador>\n"),RemoteObject.createImmutable("				      <_Global_BaseBk>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk>\n"),RemoteObject.createImmutable("				      <_EncabezadoJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_encabezadojs))),RemoteObject.createImmutable("</_EncabezadoJs>\n"),RemoteObject.createImmutable("				      <_DestalleJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_destallejs))),RemoteObject.createImmutable("</_DestalleJs>\n"),RemoteObject.createImmutable("				      <_DescuentosJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_descuentosjs))),RemoteObject.createImmutable("</_DescuentosJs>\n"),RemoteObject.createImmutable("				      <_ObservacionesJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_observacionesjs))),RemoteObject.createImmutable("</_ObservacionesJs>\n"),RemoteObject.createImmutable("					  <_Cambiar_NroDocumento>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_cambiar_nrodocumento))),RemoteObject.createImmutable("</_Cambiar_NroDocumento>\n"),RemoteObject.createImmutable("				      <_DespachoSimpleJs>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_despafaciljs))),RemoteObject.createImmutable("</_DespachoSimpleJs>\n"),RemoteObject.createImmutable("				      <_Id_Estacion>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_id))),RemoteObject.createImmutable("</_Id_Estacion>\n"),RemoteObject.createImmutable("				    </Sb_EditarDocumentoJsonBakapp2>\n"),RemoteObject.createImmutable("				  </soap12:Body>\n"),RemoteObject.createImmutable("				</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 479;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(1073741824);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 480;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(-2147483648);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 482;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(2);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 483;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(4);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 484;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(8);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 485;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(16);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_EditarDocumentoJsonBakapp2\""))));
 BA.debugLineNum = 487;BA.debugLine="Return Js";
Debug.ShouldStop(64);
if (true) return _js;
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_enviarcorreobakapp(RemoteObject _ba,RemoteObject _me_,RemoteObject _empresa,RemoteObject _modalidad,RemoteObject _codfuncionario,RemoteObject _idmaeedo,RemoteObject _para,RemoteObject _cc) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_EnviarCorreoBakapp (funciones) ","funciones",23,_ba,funciones.mostCurrent,566);
if (RapidSub.canDelegate("fx_httjob_ws_sb_enviarcorreobakapp")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_enviarcorreobakapp", _ba, _me_, _empresa, _modalidad, _codfuncionario, _idmaeedo, _para, _cc);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Modalidad", _modalidad);
Debug.locals.put("CodFuncionario", _codfuncionario);
Debug.locals.put("Idmaeedo", _idmaeedo);
Debug.locals.put("Para", _para);
Debug.locals.put("Cc", _cc);
 BA.debugLineNum = 566;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarCorreoBakapp(Me_";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 568;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(8388608);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("			  <soap12:Body>\n"),RemoteObject.createImmutable("			    <Sb_EnviarCorreoBakapp xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("			      <_Global_BaseBk>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk>\n"),RemoteObject.createImmutable("			      <_Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("			      <_Modalidad>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_modalidad))),RemoteObject.createImmutable("</_Modalidad>\n"),RemoteObject.createImmutable("			      <_CodFuncionario>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_codfuncionario))),RemoteObject.createImmutable("</_CodFuncionario>\n"),RemoteObject.createImmutable("			      <_Idmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_idmaeedo))),RemoteObject.createImmutable("</_Idmaeedo>\n"),RemoteObject.createImmutable("			      <_Para>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_para))),RemoteObject.createImmutable("</_Para>\n"),RemoteObject.createImmutable("			      <_Cc>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_cc))),RemoteObject.createImmutable("</_Cc>\n"),RemoteObject.createImmutable("			    </Sb_EnviarCorreoBakapp>\n"),RemoteObject.createImmutable("			  </soap12:Body>\n"),RemoteObject.createImmutable("			</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 583;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(64);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 584;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(128);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 586;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(512);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 587;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(1024);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 588;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(2048);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 589;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(4096);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_EnviarCorreoBakapp\""))));
 BA.debugLineNum = 591;BA.debugLine="Return Js";
Debug.ShouldStop(16384);
if (true) return _js;
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_enviarimprimirbakapp(RemoteObject _ba,RemoteObject _me_,RemoteObject _empresa,RemoteObject _modalidad,RemoteObject _codfuncionario,RemoteObject _idmaeedo) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_EnviarImprimirBakapp (funciones) ","funciones",23,_ba,funciones.mostCurrent,539);
if (RapidSub.canDelegate("fx_httjob_ws_sb_enviarimprimirbakapp")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_enviarimprimirbakapp", _ba, _me_, _empresa, _modalidad, _codfuncionario, _idmaeedo);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Modalidad", _modalidad);
Debug.locals.put("CodFuncionario", _codfuncionario);
Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 539;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_EnviarImprimirBakapp(Me";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 541;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(268435456);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				<soap12:Body>\n"),RemoteObject.createImmutable("					<Sb_EnviarImprimirBakapp xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("						<_Global_BaseBk2>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk2>\n"),RemoteObject.createImmutable("						<_Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("						<_Modalidad>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_modalidad))),RemoteObject.createImmutable("</_Modalidad>\n"),RemoteObject.createImmutable("						<_CodFuncionario>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_codfuncionario))),RemoteObject.createImmutable("</_CodFuncionario>\n"),RemoteObject.createImmutable("						<_Idmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_idmaeedo))),RemoteObject.createImmutable("</_Idmaeedo>\n"),RemoteObject.createImmutable("					</Sb_EnviarImprimirBakapp>\n"),RemoteObject.createImmutable("				</soap12:Body>\n"),RemoteObject.createImmutable("			</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 554;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(512);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 555;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(1024);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 557;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(4096);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 558;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(8192);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 559;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(16384);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 560;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(32768);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_EnviarImprimirBakapp\""))));
 BA.debugLineNum = 562;BA.debugLine="Return Js";
Debug.ShouldStop(131072);
if (true) return _js;
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_formatomodalidad(RemoteObject _ba,RemoteObject _empresa,RemoteObject _modalidad,RemoteObject _tido,RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_FormatoModalidad (funciones) ","funciones",23,_ba,funciones.mostCurrent,693);
if (RapidSub.canDelegate("fx_httjob_ws_sb_formatomodalidad")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_formatomodalidad", _ba, _empresa, _modalidad, _tido, _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Modalidad", _modalidad);
Debug.locals.put("Tido", _tido);
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 693;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_FormatoModalidad(Empres";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 695;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(4194304);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				  <soap12:Body>\n"),RemoteObject.createImmutable("				    <Sb_FormatoModalidad xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("				      <_Modalidad>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_modalidad))),RemoteObject.createImmutable("</_Modalidad>\n"),RemoteObject.createImmutable("				      <_Tido>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_tido))),RemoteObject.createImmutable("</_Tido>\n"),RemoteObject.createImmutable("				    </Sb_FormatoModalidad>\n"),RemoteObject.createImmutable("				  </soap12:Body>\n"),RemoteObject.createImmutable("				</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 705;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(1);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 706;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(2);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 708;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(8);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 709;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(16);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 710;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(32);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 711;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(64);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_FormatoModalidad\""))));
 BA.debugLineNum = 713;BA.debugLine="Return Js";
Debug.ShouldStop(256);
if (true) return _js;
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_getdataset_json(RemoteObject _ba,RemoteObject _consulta_sql,RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_GetDataSet_Json (funciones) ","funciones",23,_ba,funciones.mostCurrent,80);
if (RapidSub.canDelegate("fx_httjob_ws_sb_getdataset_json")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_getdataset_json", _ba, _consulta_sql, _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Consulta_Sql", _consulta_sql);
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 80;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Json(Consult";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(131072);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  			<soap:Body>\n"),RemoteObject.createImmutable("    			<Sb_GetDataSet_Json xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("      			<Consulta_Sql>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_consulta_sql))),RemoteObject.createImmutable("</Consulta_Sql>\n"),RemoteObject.createImmutable("    			</Sb_GetDataSet_Json>\n"),RemoteObject.createImmutable("  			</soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 90;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(33554432);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 91;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(67108864);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 93;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(268435456);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 94;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(536870912);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 95;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(1073741824);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 96;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(-2147483648);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_GetDataSet_Json\""))));
 BA.debugLineNum = 98;BA.debugLine="Return Js";
Debug.ShouldStop(2);
if (true) return _js;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_getdataset_sb_json_impbk(RemoteObject _ba,RemoteObject _me_,RemoteObject _json,RemoteObject _nombretabla) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpBk (funciones) ","funciones",23,_ba,funciones.mostCurrent,311);
if (RapidSub.canDelegate("fx_httjob_ws_sb_getdataset_sb_json_impbk")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_getdataset_sb_json_impbk", _ba, _me_, _json, _nombretabla);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Json", _json);
Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 311;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetDataSet_Sb_Json_ImpB";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 313;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16777216);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("		  <soap:Body>\n"),RemoteObject.createImmutable("		    <Sb_Json_ImpBk xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("		      <_Json>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_json))),RemoteObject.createImmutable("</_Json>\n"),RemoteObject.createImmutable("		      <_NombreTabla>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_nombretabla))),RemoteObject.createImmutable("</_NombreTabla>\n"),RemoteObject.createImmutable("		    </Sb_Json_ImpBk>\n"),RemoteObject.createImmutable("		  </soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 322;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(2);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 323;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(4);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 325;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(16);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 326;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(32);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 327;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(64);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 328;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(128);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Json_ImpBk\""))));
 BA.debugLineNum = 330;BA.debugLine="Return Js";
Debug.ShouldStop(512);
if (true) return _js;
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_getmodalidad_gral(RemoteObject _ba,RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_GetModalidad_Gral (funciones) ","funciones",23,_ba,funciones.mostCurrent,171);
if (RapidSub.canDelegate("fx_httjob_ws_sb_getmodalidad_gral")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_getmodalidad_gral", _ba, _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 171;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_GetModalidad_Gral(Me_ A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="Dim	vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(4096);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("		  <soap:Body>\n"),RemoteObject.createImmutable("		    <Sb_GetModalidad_Gral xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("		    <Global_BaseBk>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</Global_BaseBk>\n"),RemoteObject.createImmutable("		    </Sb_GetModalidad_Gral>\n"),RemoteObject.createImmutable("		  </soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 181;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(1048576);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 182;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(2097152);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 184;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(8388608);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 185;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(16777216);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 186;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(33554432);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 187;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(67108864);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_GetModalidad_Gral\""))));
 BA.debugLineNum = 189;BA.debugLine="Return Js";
Debug.ShouldStop(268435456);
if (true) return _js;
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_revcarpetatmp(RemoteObject _ba,RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_RevCarpetaTmp (funciones) ","funciones",23,_ba,funciones.mostCurrent,334);
if (RapidSub.canDelegate("fx_httjob_ws_sb_revcarpetatmp")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_revcarpetatmp", _ba, _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 334;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevCarpetaTmp (Me_ As O";
Debug.ShouldStop(8192);
 BA.debugLineNum = 336;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(32768);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("		  <soap12:Body>\n"),RemoteObject.createImmutable("		    <Sb_RevCarpetaTmpResponse xmlns=\"http://BakApp\" />\n"),RemoteObject.createImmutable("		  </soap12:Body>\n"),RemoteObject.createImmutable("		</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 343;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(4194304);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 344;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(8388608);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 346;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(33554432);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 347;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(67108864);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 348;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(134217728);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 349;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(268435456);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_RevCarpetaTmp\""))));
 BA.debugLineNum = 351;BA.debugLine="Return Js";
Debug.ShouldStop(1073741824);
if (true) return _js;
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_revisar_stock_fila(RemoteObject _ba,RemoteObject _me_,RemoteObject _tido,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _codigo,RemoteObject _cantidad,RemoteObject _untrans,RemoteObject _tidopa) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Revisar_Stock_Fila (funciones) ","funciones",23,_ba,funciones.mostCurrent,218);
if (RapidSub.canDelegate("fx_httjob_ws_sb_revisar_stock_fila")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_revisar_stock_fila", _ba, _me_, _tido, _empresa, _sucursal, _bodega, _codigo, _cantidad, _untrans, _tidopa);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Tido", _tido);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Cantidad", _cantidad);
Debug.locals.put("UnTrans", _untrans);
Debug.locals.put("Tidopa", _tidopa);
 BA.debugLineNum = 218;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Revisar_Stock_Fila(Me_";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 228;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(8);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("		  <soap12:Body>\n"),RemoteObject.createImmutable("		    <Sb_Revisar_Stock_Fila xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("		      <_Tido>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_tido))),RemoteObject.createImmutable("</_Tido>\n"),RemoteObject.createImmutable("		      <_Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("		      <_Sucursal>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_sucursal))),RemoteObject.createImmutable("</_Sucursal>\n"),RemoteObject.createImmutable("		      <_Bodega>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_bodega))),RemoteObject.createImmutable("</_Bodega>\n"),RemoteObject.createImmutable("		      <_Codigo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_codigo))),RemoteObject.createImmutable("</_Codigo>\n"),RemoteObject.createImmutable("		      <_Cantidad>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_cantidad))),RemoteObject.createImmutable("</_Cantidad>\n"),RemoteObject.createImmutable("		      <_UnTrans>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_untrans))),RemoteObject.createImmutable("</_UnTrans>\n"),RemoteObject.createImmutable("		      <_Tidopa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_tidopa))),RemoteObject.createImmutable("</_Tidopa>\n"),RemoteObject.createImmutable("		    </Sb_Revisar_Stock_Fila>\n"),RemoteObject.createImmutable("		  </soap12:Body>\n"),RemoteObject.createImmutable("		</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 244;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(524288);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 245;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(1048576);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 247;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(4194304);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 248;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(8388608);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 249;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(16777216);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 250;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(33554432);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Revisar_Stock_Fila\""))));
 BA.debugLineNum = 252;BA.debugLine="Return Js";
Debug.ShouldStop(134217728);
if (true) return _js;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_revisardocvslistaprecio(RemoteObject _ba,RemoteObject _me_,RemoteObject _idmaeedo,RemoteObject _vnta_dias_venci_coti) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio (funciones) ","funciones",23,_ba,funciones.mostCurrent,669);
if (RapidSub.canDelegate("fx_httjob_ws_sb_revisardocvslistaprecio")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_revisardocvslistaprecio", _ba, _me_, _idmaeedo, _vnta_dias_venci_coti);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Idmaeedo", _idmaeedo);
Debug.locals.put("Vnta_Dias_Venci_Coti", _vnta_dias_venci_coti);
 BA.debugLineNum = 669;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_RevisarDocVsListaPrecio";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 671;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(1073741824);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				  <soap12:Body>\n"),RemoteObject.createImmutable("				    <Sb_RevisarDocVsListaPrecio xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_Idmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_idmaeedo))),RemoteObject.createImmutable("</_Idmaeedo>\n"),RemoteObject.createImmutable("				      <_Vnta_Dias_Venci_Coti>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_vnta_dias_venci_coti))),RemoteObject.createImmutable("</_Vnta_Dias_Venci_Coti>\n"),RemoteObject.createImmutable("				    </Sb_RevisarDocVsListaPrecio>\n"),RemoteObject.createImmutable("				  </soap12:Body>\n"),RemoteObject.createImmutable("				</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 681;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(256);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 682;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(512);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 684;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(2048);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 685;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(4096);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 686;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(8192);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 687;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(16384);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_RevisarDocVsListaPrecio\""))));
 BA.debugLineNum = 689;BA.debugLine="Return Js";
Debug.ShouldStop(65536);
if (true) return _js;
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_concepto_json(RemoteObject _ba,RemoteObject _me_,RemoteObject _concepto,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _lista,RemoteObject _koen) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Concepto_Json (funciones) ","funciones",23,_ba,funciones.mostCurrent,137);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_concepto_json")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_concepto_json", _ba, _me_, _concepto, _empresa, _sucursal, _bodega, _lista, _koen);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Concepto", _concepto);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("Lista", _lista);
Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 137;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Concepto_Json(Me_";
Debug.ShouldStop(256);
 BA.debugLineNum = 145;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(65536);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("			  <soap12:Body>\n"),RemoteObject.createImmutable("			    <Sb_Traer_Concepto_Json xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("			      <_Concepto>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_concepto))),RemoteObject.createImmutable("</_Concepto>\n"),RemoteObject.createImmutable("			      <_Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("			      <_Sucursal>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_sucursal))),RemoteObject.createImmutable("</_Sucursal>\n"),RemoteObject.createImmutable("			      <_Bodega>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_bodega))),RemoteObject.createImmutable("</_Bodega>\n"),RemoteObject.createImmutable("			      <_Lista>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_lista))),RemoteObject.createImmutable("</_Lista>\n"),RemoteObject.createImmutable("			      <_Koen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_koen))),RemoteObject.createImmutable("</_Koen>\n"),RemoteObject.createImmutable("			    </Sb_Traer_Concepto_Json>\n"),RemoteObject.createImmutable("			  </soap12:Body>\n"),RemoteObject.createImmutable("			</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 159;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(1073741824);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 160;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(-2147483648);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 162;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(2);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 163;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(4);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 164;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(8);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 165;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(16);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Concepto_Json\""))));
 BA.debugLineNum = 167;BA.debugLine="Return Js";
Debug.ShouldStop(64);
if (true) return _js;
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_descuento_global_x_cliente(RemoteObject _ba,RemoteObject _me_,RemoteObject _koen,RemoteObject _suen) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Descuento_Global_X_Cliente (funciones) ","funciones",23,_ba,funciones.mostCurrent,515);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_descuento_global_x_cliente")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_descuento_global_x_cliente", _ba, _me_, _koen, _suen);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 515;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuento_Global_";
Debug.ShouldStop(4);
 BA.debugLineNum = 517;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("		  <soap12:Body>\n"),RemoteObject.createImmutable("		    <Sb_Traer_Descuento_Global_X_Cliente xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("		      <_Global_BaseBk>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk>\n"),RemoteObject.createImmutable("		      <_Koen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_koen))),RemoteObject.createImmutable("</_Koen>\n"),RemoteObject.createImmutable("		      <_Suen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_suen))),RemoteObject.createImmutable("</_Suen>\n"),RemoteObject.createImmutable("		    </Sb_Traer_Descuento_Global_X_Cliente>\n"),RemoteObject.createImmutable("		  </soap12:Body>\n"),RemoteObject.createImmutable("		</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 527;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(16384);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 528;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(32768);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 530;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(131072);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 531;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(262144);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 532;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(524288);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 533;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(1048576);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Descuento_Global_X_Cliente\""))));
 BA.debugLineNum = 535;BA.debugLine="Return Js";
Debug.ShouldStop(4194304);
if (true) return _js;
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista(RemoteObject _ba,RemoteObject _me_,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _codigo,RemoteObject _codlista,RemoteObject _prct,RemoteObject _tict,RemoteObject _poriva,RemoteObject _porila,RemoteObject _koen,RemoteObject _chkvaloresneto) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Descuentos_Seteados_Desde_Lista (funciones) ","funciones",23,_ba,funciones.mostCurrent,256);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista", _ba, _me_, _empresa, _sucursal, _codigo, _codlista, _prct, _tict, _poriva, _porila, _koen, _chkvaloresneto);}
RemoteObject _vprct = RemoteObject.createImmutable("");
RemoteObject _vchkvaloresneto = RemoteObject.createImmutable("");
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("CodLista", _codlista);
Debug.locals.put("Prct", _prct);
Debug.locals.put("Tict", _tict);
Debug.locals.put("PorIva", _poriva);
Debug.locals.put("PorIla", _porila);
Debug.locals.put("Koen", _koen);
Debug.locals.put("ChkValoresNeto", _chkvaloresneto);
 BA.debugLineNum = 256;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Descuentos_Setead";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 268;BA.debugLine="Dim vPrct,vChkValoresNeto As String";
Debug.ShouldStop(2048);
_vprct = RemoteObject.createImmutable("");Debug.locals.put("vPrct", _vprct);
_vchkvaloresneto = RemoteObject.createImmutable("");Debug.locals.put("vChkValoresNeto", _vchkvaloresneto);
 BA.debugLineNum = 270;BA.debugLine="If Prct Then";
Debug.ShouldStop(8192);
if (_prct.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 271;BA.debugLine="vPrct = \"True\"";
Debug.ShouldStop(16384);
_vprct = BA.ObjectToString("True");Debug.locals.put("vPrct", _vprct);
 }else {
 BA.debugLineNum = 273;BA.debugLine="vPrct = False";
Debug.ShouldStop(65536);
_vprct = BA.ObjectToString(funciones.mostCurrent.__c.getField(true,"False"));Debug.locals.put("vPrct", _vprct);
 };
 BA.debugLineNum = 275;BA.debugLine="If ChkValoresNeto Then";
Debug.ShouldStop(262144);
if (_chkvaloresneto.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 276;BA.debugLine="vChkValoresNeto = \"True\"";
Debug.ShouldStop(524288);
_vchkvaloresneto = BA.ObjectToString("True");Debug.locals.put("vChkValoresNeto", _vchkvaloresneto);
 }else {
 BA.debugLineNum = 278;BA.debugLine="vChkValoresNeto = False";
Debug.ShouldStop(2097152);
_vchkvaloresneto = BA.ObjectToString(funciones.mostCurrent.__c.getField(true,"False"));Debug.locals.put("vChkValoresNeto", _vchkvaloresneto);
 };
 BA.debugLineNum = 281;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16777216);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("			<soap12:Body>\n"),RemoteObject.createImmutable("			<Sb_Traer_Descuentos_Seteados_Desde_Lista xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("			<_Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("			<_Sucursa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_sucursal))),RemoteObject.createImmutable("</_Sucursa>\n"),RemoteObject.createImmutable("			<_Codigo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_codigo))),RemoteObject.createImmutable("</_Codigo>\n"),RemoteObject.createImmutable("			<_CodLista>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_codlista))),RemoteObject.createImmutable("</_CodLista>\n"),RemoteObject.createImmutable("		      <_Prct>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_prct))),RemoteObject.createImmutable("</_Prct>\n"),RemoteObject.createImmutable("		      <_Tict>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_tict))),RemoteObject.createImmutable("</_Tict>\n"),RemoteObject.createImmutable("		      <_PorIva>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_poriva))),RemoteObject.createImmutable("</_PorIva>\n"),RemoteObject.createImmutable("		      <_PorIla>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_porila))),RemoteObject.createImmutable("</_PorIla>\n"),RemoteObject.createImmutable("		      <_Koen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_koen))),RemoteObject.createImmutable("</_Koen>\n"),RemoteObject.createImmutable("		      <_ChkValoresNeto>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_chkvaloresneto))),RemoteObject.createImmutable("</_ChkValoresNeto>\n"),RemoteObject.createImmutable("		    </Sb_Traer_Descuentos_Seteados_Desde_Lista>\n"),RemoteObject.createImmutable("		  </soap12:Body>\n"),RemoteObject.createImmutable("		</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 299;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(1024);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 300;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(2048);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 302;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(8192);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 303;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(16384);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 304;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(32768);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 305;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(65536);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Descuentos_Seteados_Desde_Lista\""))));
 BA.debugLineNum = 307;BA.debugLine="Return Js";
Debug.ShouldStop(262144);
if (true) return _js;
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_documento(RemoteObject _ba,RemoteObject _me_,RemoteObject _tido,RemoteObject _nudo) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Documento (funciones) ","funciones",23,_ba,funciones.mostCurrent,595);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_documento")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_documento", _ba, _me_, _tido, _nudo);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Tido", _tido);
Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 595;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento(Me_ As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 597;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(1048576);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("			  <soap12:Body>\n"),RemoteObject.createImmutable("			    <Sb_Traer_Documento xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("			      <_Global_BaseBk2>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk2>\n"),RemoteObject.createImmutable("			      <_Tido>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_tido))),RemoteObject.createImmutable("</_Tido>\n"),RemoteObject.createImmutable("			      <_Nudo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_nudo))),RemoteObject.createImmutable("</_Nudo>\n"),RemoteObject.createImmutable("			    </Sb_Traer_Documento>\n"),RemoteObject.createImmutable("			  </soap12:Body>\n"),RemoteObject.createImmutable("			</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 608;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(-2147483648);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 609;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(1);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 611;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(4);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 612;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(8);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 613;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(16);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 614;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(32);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Documento\""))));
 BA.debugLineNum = 616;BA.debugLine="Return Js";
Debug.ShouldStop(128);
if (true) return _js;
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_documento2(RemoteObject _ba,RemoteObject _me_,RemoteObject _idmaeedo) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Documento2 (funciones) ","funciones",23,_ba,funciones.mostCurrent,620);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_documento2")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_documento2", _ba, _me_, _idmaeedo);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 620;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Documento2(Me_ As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 622;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(8192);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("			<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("			  <soap12:Body>\n"),RemoteObject.createImmutable("			    <Sb_Traer_Documento2 xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("			      <_Global_BaseBk2>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((funciones.mostCurrent._variables._global_basebk /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Global_BaseBk2>\n"),RemoteObject.createImmutable("			      <_Idmaeedo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_idmaeedo))),RemoteObject.createImmutable("</_Idmaeedo>\n"),RemoteObject.createImmutable("			    </Sb_Traer_Documento2>\n"),RemoteObject.createImmutable("			  </soap12:Body>\n"),RemoteObject.createImmutable("			</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 632;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(8388608);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 633;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(16777216);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 635;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(67108864);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 636;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(134217728);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 637;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(268435456);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 638;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(536870912);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Documento2\""))));
 BA.debugLineNum = 640;BA.debugLine="Return Js";
Debug.ShouldStop(-2147483648);
if (true) return _js;
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_entidad_json(RemoteObject _ba,RemoteObject _me_,RemoteObject _koen,RemoteObject _suen) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Entidad_Json (funciones) ","funciones",23,_ba,funciones.mostCurrent,193);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_entidad_json")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_entidad_json", _ba, _me_, _koen, _suen);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 193;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Entidad_Json(Me_";
Debug.ShouldStop(1);
 BA.debugLineNum = 197;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  			<soap:Body>\n"),RemoteObject.createImmutable("    			<Sb_Traer_Entidad_Json xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("      			<Koen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_koen))),RemoteObject.createImmutable("</Koen>\n"),RemoteObject.createImmutable("      			<Suen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_suen))),RemoteObject.createImmutable("</Suen>\n"),RemoteObject.createImmutable("    			</Sb_Traer_Entidad_Json>\n"),RemoteObject.createImmutable("  			</soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 206;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(8192);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 207;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(16384);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 209;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(65536);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 210;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(131072);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 211;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(262144);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 212;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(524288);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Entidad_Json\""))));
 BA.debugLineNum = 214;BA.debugLine="Return Js";
Debug.ShouldStop(2097152);
if (true) return _js;
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_traer_productos_json(RemoteObject _ba,RemoteObject _me_,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _lista,RemoteObject _untrans,RemoteObject _koen) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Traer_Productos_Json (funciones) ","funciones",23,_ba,funciones.mostCurrent,102);
if (RapidSub.canDelegate("fx_httjob_ws_sb_traer_productos_json")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_traer_productos_json", _ba, _me_, _codigo, _empresa, _sucursal, _bodega, _lista, _untrans, _koen);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("Lista", _lista);
Debug.locals.put("UnTrans", _untrans);
Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 102;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Traer_Productos_Json(Me";
Debug.ShouldStop(32);
 BA.debugLineNum = 111;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16384);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("        <soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  			<soap:Body>\n"),RemoteObject.createImmutable("    			<Sb_Traer_Productos_Json xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("      			<Codigo>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_codigo))),RemoteObject.createImmutable("</Codigo>\n"),RemoteObject.createImmutable("      			<Empresa>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_empresa))),RemoteObject.createImmutable("</Empresa>\n"),RemoteObject.createImmutable("      			<Sucursal>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_sucursal))),RemoteObject.createImmutable("</Sucursal>\n"),RemoteObject.createImmutable("      			<Bodega>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_bodega))),RemoteObject.createImmutable("</Bodega>\n"),RemoteObject.createImmutable("      			<Lista>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_lista))),RemoteObject.createImmutable("</Lista>\n"),RemoteObject.createImmutable("      			<UnTrans>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_untrans))),RemoteObject.createImmutable("</UnTrans>\n"),RemoteObject.createImmutable("      			<Koen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_koen))),RemoteObject.createImmutable("</Koen>\n"),RemoteObject.createImmutable("    			</Sb_Traer_Productos_Json>\n"),RemoteObject.createImmutable("  			</soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 125;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(268435456);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 126;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(536870912);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 128;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(-2147483648);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 129;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(1);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 130;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(2);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 131;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(4);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Traer_Productos_Json\""))));
 BA.debugLineNum = 133;BA.debugLine="Return Js";
Debug.ShouldStop(16);
if (true) return _js;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_usar_clave_docdespsimple_poswii(RemoteObject _ba,RemoteObject _me_,RemoteObject _clave,RemoteObject _koen,RemoteObject _eliminar) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimple_Poswii (funciones) ","funciones",23,_ba,funciones.mostCurrent,717);
if (RapidSub.canDelegate("fx_httjob_ws_sb_usar_clave_docdespsimple_poswii")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_usar_clave_docdespsimple_poswii", _ba, _me_, _clave, _koen, _eliminar);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Clave", _clave);
Debug.locals.put("Koen", _koen);
Debug.locals.put("Eliminar", _eliminar);
 BA.debugLineNum = 717;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Clave_DocDespSimpl";
Debug.ShouldStop(4096);
 BA.debugLineNum = 719;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16384);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("				<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("				  <soap12:Body>\n"),RemoteObject.createImmutable("				    <Sb_Usar_Clave_DocDespSimple_Poswii xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("				      <_Clave>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_clave))),RemoteObject.createImmutable("</_Clave>\n"),RemoteObject.createImmutable("				      <_Koen>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_koen))),RemoteObject.createImmutable("</_Koen>\n"),RemoteObject.createImmutable("				      <_Eliminar>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_eliminar))),RemoteObject.createImmutable("</_Eliminar>\n"),RemoteObject.createImmutable("				    </Sb_Usar_Clave_DocDespSimple_Poswii>\n"),RemoteObject.createImmutable("				  </soap12:Body>\n"),RemoteObject.createImmutable("				</soap12:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 729;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(16777216);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 730;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(33554432);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 732;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(134217728);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 733;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(268435456);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 734;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(536870912);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 735;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(1073741824);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Usar_Clave_DocDespSimple_Poswii\""))));
 BA.debugLineNum = 737;BA.debugLine="Return Js";
Debug.ShouldStop(1);
if (true) return _js;
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_httjob_ws_sb_usar_dscto_poswii(RemoteObject _ba,RemoteObject _me_,RemoteObject _clave,RemoteObject _kofu,RemoteObject _eliminar) throws Exception{
try {
		Debug.PushSubsStack("Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii (funciones) ","funciones",23,_ba,funciones.mostCurrent,491);
if (RapidSub.canDelegate("fx_httjob_ws_sb_usar_dscto_poswii")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_httjob_ws_sb_usar_dscto_poswii", _ba, _me_, _clave, _kofu, _eliminar);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
;
Debug.locals.put("Me_", _me_);
Debug.locals.put("Clave", _clave);
Debug.locals.put("Kofu", _kofu);
Debug.locals.put("Eliminar", _eliminar);
 BA.debugLineNum = 491;BA.debugLine="Public Sub Fx_HttJob_Ws_Sb_Usar_Dscto_Poswii(Me_ A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 493;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(4096);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("		<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("		  <soap:Body>\n"),RemoteObject.createImmutable("			    <Sb_Usar_Dscto_Poswii xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("			      <_Clave>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_clave))),RemoteObject.createImmutable("</_Clave>\n"),RemoteObject.createImmutable("			      <_Kofu>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_kofu))),RemoteObject.createImmutable("</_Kofu>\n"),RemoteObject.createImmutable("			      <_Eliminar>"),funciones.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_eliminar))),RemoteObject.createImmutable("</_Eliminar>\n"),RemoteObject.createImmutable("			    </Sb_Usar_Dscto_Poswii>\n"),RemoteObject.createImmutable("		  </soap:Body>\n"),RemoteObject.createImmutable("		</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 503;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(4194304);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),funciones.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 504;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(8388608);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 506;BA.debugLine="Js.Initialize(\"\",Me_)";
Debug.ShouldStop(33554432);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 507;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(67108864);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 508;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(134217728);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 509;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(268435456);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Usar_Dscto_Poswii\""))));
 BA.debugLineNum = 511;BA.debugLine="Return Js";
Debug.ShouldStop(1073741824);
if (true) return _js;
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_isemail(RemoteObject _ba,RemoteObject _emailaddress) throws Exception{
try {
		Debug.PushSubsStack("Fx_IsEmail (funciones) ","funciones",23,_ba,funciones.mostCurrent,929);
if (RapidSub.canDelegate("fx_isemail")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_isemail", _ba, _emailaddress);}
RemoteObject _matchemail = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("EmailAddress", _emailaddress);
 BA.debugLineNum = 929;BA.debugLine="Sub Fx_IsEmail(EmailAddress As String) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 930;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
Debug.ShouldStop(2);
_matchemail = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matchemail = funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$")),(Object)(_emailaddress));Debug.locals.put("MatchEmail", _matchemail);Debug.locals.put("MatchEmail", _matchemail);
 BA.debugLineNum = 931;BA.debugLine="If MatchEmail.Find = True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_matchemail.runMethod(true,"Find"),funciones.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 932;BA.debugLine="Log(MatchEmail.Match)";
Debug.ShouldStop(8);
funciones.mostCurrent.__c.runVoidMethod ("LogImpl","625034755",_matchemail.runMethod(true,"getMatch"),0);
 BA.debugLineNum = 933;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return funciones.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 935;BA.debugLine="Log(\"Oops, Por favor vuelve a comprobar tu direc";
Debug.ShouldStop(64);
funciones.mostCurrent.__c.runVoidMethod ("LogImpl","625034758",RemoteObject.createImmutable("Oops, Por favor vuelve a comprobar tu dirección de email"),0);
 BA.debugLineNum = 936;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return funciones.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 938;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_nulopornro(RemoteObject _ba,RemoteObject _value,RemoteObject _valorxdefecto) throws Exception{
try {
		Debug.PushSubsStack("Fx_NuloPorNro (funciones) ","funciones",23,_ba,funciones.mostCurrent,851);
if (RapidSub.canDelegate("fx_nulopornro")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_nulopornro", _ba, _value, _valorxdefecto);}
;
Debug.locals.put("value", _value);
Debug.locals.put("valorxdefecto", _valorxdefecto);
 BA.debugLineNum = 851;BA.debugLine="Public Sub Fx_NuloPorNro(value As Object, valorxde";
Debug.ShouldStop(262144);
 BA.debugLineNum = 853;BA.debugLine="If IsNull(value) Then";
Debug.ShouldStop(1048576);
if (_isnull(_ba,_value).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 854;BA.debugLine="Return valorxdefecto";
Debug.ShouldStop(2097152);
if (true) return BA.NumberToString(_valorxdefecto);
 };
 BA.debugLineNum = 857;BA.debugLine="Return value";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString(_value);
 BA.debugLineNum = 859;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_nuloporstr(RemoteObject _ba,RemoteObject _value,RemoteObject _valorxdefecto) throws Exception{
try {
		Debug.PushSubsStack("Fx_NuloPorStr (funciones) ","funciones",23,_ba,funciones.mostCurrent,861);
if (RapidSub.canDelegate("fx_nuloporstr")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_nuloporstr", _ba, _value, _valorxdefecto);}
;
Debug.locals.put("value", _value);
Debug.locals.put("valorxdefecto", _valorxdefecto);
 BA.debugLineNum = 861;BA.debugLine="Public Sub Fx_NuloPorStr(value As Object,valorxdef";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 863;BA.debugLine="If IsNull(value) Then";
Debug.ShouldStop(1073741824);
if (_isnull(_ba,_value).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 864;BA.debugLine="Return valorxdefecto";
Debug.ShouldStop(-2147483648);
if (true) return _valorxdefecto;
 };
 BA.debugLineNum = 867;BA.debugLine="Return value";
Debug.ShouldStop(4);
if (true) return BA.ObjectToString(_value);
 BA.debugLineNum = 869;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_solo_enteros(RemoteObject _ba,RemoteObject _cantidad,RemoteObject _divisible) throws Exception{
try {
		Debug.PushSubsStack("Fx_Solo_Enteros (funciones) ","funciones",23,_ba,funciones.mostCurrent,823);
if (RapidSub.canDelegate("fx_solo_enteros")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_solo_enteros", _ba, _cantidad, _divisible);}
RemoteObject _cant_tiene_decimales = RemoteObject.createImmutable(false);
;
Debug.locals.put("Cantidad", _cantidad);
Debug.locals.put("Divisible", _divisible);
 BA.debugLineNum = 823;BA.debugLine="Public Sub Fx_Solo_Enteros(Cantidad As Double, Div";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 825;BA.debugLine="Dim Cant_Tiene_Decimales As Boolean";
Debug.ShouldStop(16777216);
_cant_tiene_decimales = RemoteObject.createImmutable(false);Debug.locals.put("Cant_Tiene_Decimales", _cant_tiene_decimales);
 BA.debugLineNum = 827;BA.debugLine="If Cantidad <> 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 829;BA.debugLine="If  IsNumber(Cantidad) Then";
Debug.ShouldStop(268435456);
if (funciones.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(_cantidad))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 830;BA.debugLine="If NumberFormat(Cantidad,0,0) = Cantidad Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",funciones.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_cantidad),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))),BA.NumberToString(_cantidad))) { 
 BA.debugLineNum = 832;BA.debugLine="Cant_Tiene_Decimales = False";
Debug.ShouldStop(-2147483648);
_cant_tiene_decimales = funciones.mostCurrent.__c.getField(true,"False");Debug.locals.put("Cant_Tiene_Decimales", _cant_tiene_decimales);
 }else {
 BA.debugLineNum = 835;BA.debugLine="Cant_Tiene_Decimales = True";
Debug.ShouldStop(4);
_cant_tiene_decimales = funciones.mostCurrent.__c.getField(true,"True");Debug.locals.put("Cant_Tiene_Decimales", _cant_tiene_decimales);
 };
 };
 BA.debugLineNum = 839;BA.debugLine="If Cant_Tiene_Decimales Then";
Debug.ShouldStop(64);
if (_cant_tiene_decimales.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 840;BA.debugLine="If Divisible = \"0\" Or Divisible = \"N\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_divisible,BA.ObjectToString("0")) || RemoteObject.solveBoolean("=",_divisible,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 841;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) return funciones.mostCurrent.__c.getField(true,"False");
 };
 };
 };
 BA.debugLineNum = 847;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return funciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 849;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_traeclaverd(RemoteObject _ba,RemoteObject _vclave) throws Exception{
try {
		Debug.PushSubsStack("Fx_TraeClaveRD (funciones) ","funciones",23,_ba,funciones.mostCurrent,741);
if (RapidSub.canDelegate("fx_traeclaverd")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_traeclaverd", _ba, _vclave);}
RemoteObject _valorascii = RemoteObject.createImmutable(0);
RemoteObject _passencriptado = RemoteObject.createImmutable("");
RemoteObject _letra = RemoteObject.createImmutable("");
RemoteObject _cadenard = RemoteObject.createImmutable(0L);
int _x = 0;
;
Debug.locals.put("vClave", _vclave);
 BA.debugLineNum = 741;BA.debugLine="Public Sub Fx_TraeClaveRD(vClave As String) As Str";
Debug.ShouldStop(16);
 BA.debugLineNum = 743;BA.debugLine="Dim valorAscii As Int";
Debug.ShouldStop(64);
_valorascii = RemoteObject.createImmutable(0);Debug.locals.put("valorAscii", _valorascii);
 BA.debugLineNum = 744;BA.debugLine="Dim PassEncriptado, Letra As String";
Debug.ShouldStop(128);
_passencriptado = RemoteObject.createImmutable("");Debug.locals.put("PassEncriptado", _passencriptado);
_letra = RemoteObject.createImmutable("");Debug.locals.put("Letra", _letra);
 BA.debugLineNum = 745;BA.debugLine="Dim CadenaRD As Long";
Debug.ShouldStop(256);
_cadenard = RemoteObject.createImmutable(0L);Debug.locals.put("CadenaRD", _cadenard);
 BA.debugLineNum = 746;BA.debugLine="vClave = vClave.Trim";
Debug.ShouldStop(512);
_vclave = _vclave.runMethod(true,"trim");Debug.locals.put("vClave", _vclave);
 BA.debugLineNum = 748;BA.debugLine="For x = 1 To vClave.Length";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = _vclave.runMethod(true,"length").<Integer>get().intValue();
_x = 1 ;
for (;(step5 > 0 && _x <= limit5) || (step5 < 0 && _x >= limit5) ;_x = ((int)(0 + _x + step5))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 750;BA.debugLine="Letra = Mid(vClave,  x, 1)";
Debug.ShouldStop(8192);
_letra = _mid(_ba,_vclave,BA.numberCast(int.class, _x),BA.numberCast(int.class, 1));Debug.locals.put("Letra", _letra);
 BA.debugLineNum = 751;BA.debugLine="valorAscii = Asc(Letra)";
Debug.ShouldStop(16384);
_valorascii = funciones.mostCurrent.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(_letra)));Debug.locals.put("valorAscii", _valorascii);
 BA.debugLineNum = 754;BA.debugLine="If x = 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 755;BA.debugLine="CadenaRD = (17225 + valorAscii) * 1";
Debug.ShouldStop(262144);
_cadenard = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(17225),_valorascii}, "+",1, 1)),RemoteObject.createImmutable(1)}, "*",0, 1));Debug.locals.put("CadenaRD", _cadenard);
 }else 
{ BA.debugLineNum = 756;BA.debugLine="Else If x = 2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 757;BA.debugLine="CadenaRD = (1847 + valorAscii) * 8";
Debug.ShouldStop(1048576);
_cadenard = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1847),_valorascii}, "+",1, 1)),RemoteObject.createImmutable(8)}, "*",0, 1));Debug.locals.put("CadenaRD", _cadenard);
 }else 
{ BA.debugLineNum = 758;BA.debugLine="Else If x = 3 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 759;BA.debugLine="CadenaRD = (1217 + valorAscii) * 27";
Debug.ShouldStop(4194304);
_cadenard = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1217),_valorascii}, "+",1, 1)),RemoteObject.createImmutable(27)}, "*",0, 1));Debug.locals.put("CadenaRD", _cadenard);
 }else 
{ BA.debugLineNum = 760;BA.debugLine="Else If x = 4 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 761;BA.debugLine="CadenaRD = (237 + valorAscii) * 64";
Debug.ShouldStop(16777216);
_cadenard = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(237),_valorascii}, "+",1, 1)),RemoteObject.createImmutable(64)}, "*",0, 1));Debug.locals.put("CadenaRD", _cadenard);
 }else 
{ BA.debugLineNum = 762;BA.debugLine="Else If x = 5 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_x),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 763;BA.debugLine="CadenaRD = (201 + valorAscii) * 125";
Debug.ShouldStop(67108864);
_cadenard = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(201),_valorascii}, "+",1, 1)),RemoteObject.createImmutable(125)}, "*",0, 1));Debug.locals.put("CadenaRD", _cadenard);
 }}}}}
;
 BA.debugLineNum = 766;BA.debugLine="PassEncriptado = PassEncriptado & CadenaRD";
Debug.ShouldStop(536870912);
_passencriptado = RemoteObject.concat(_passencriptado,_cadenard);Debug.locals.put("PassEncriptado", _passencriptado);
 BA.debugLineNum = 767;BA.debugLine="CadenaRD = 0";
Debug.ShouldStop(1073741824);
_cadenard = BA.numberCast(long.class, 0);Debug.locals.put("CadenaRD", _cadenard);
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 770;BA.debugLine="Return PassEncriptado";
Debug.ShouldStop(2);
if (true) return _passencriptado;
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_traer_iddispositivo(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Fx_Traer_IdDispositivo (funciones) ","funciones",23,_ba,funciones.mostCurrent,774);
if (RapidSub.canDelegate("fx_traer_iddispositivo")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","fx_traer_iddispositivo", _ba);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _api = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 774;BA.debugLine="Sub Fx_Traer_IdDispositivo As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 776;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 777;BA.debugLine="Dim id As String";
Debug.ShouldStop(256);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 778;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(512);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 779;BA.debugLine="Dim Api As Int";
Debug.ShouldStop(1024);
_api = RemoteObject.createImmutable(0);Debug.locals.put("Api", _api);
 BA.debugLineNum = 781;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
Debug.ShouldStop(4096);
_api = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build$VERSION")),(Object)(RemoteObject.createImmutable("SDK_INT"))));Debug.locals.put("Api", _api);
 BA.debugLineNum = 783;BA.debugLine="If Api < 9 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",_api,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 785;BA.debugLine="id= p.GetSettings(\"android_id\")";
Debug.ShouldStop(65536);
_id = _p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));Debug.locals.put("id", _id);
 }else {
 BA.debugLineNum = 788;BA.debugLine="id= r.GetStaticField(\"android.os.Build\", \"SERIAL";
Debug.ShouldStop(524288);
_id = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.os.Build")),(Object)(RemoteObject.createImmutable("SERIAL"))));Debug.locals.put("id", _id);
 BA.debugLineNum = 789;BA.debugLine="If id.ToLowerCase = \"unknown\" Then id= p.GetSett";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_id.runMethod(true,"toLowerCase"),BA.ObjectToString("unknown"))) { 
_id = _p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));Debug.locals.put("id", _id);};
 };
 BA.debugLineNum = 795;BA.debugLine="Return id";
Debug.ShouldStop(67108864);
if (true) return _id;
 BA.debugLineNum = 797;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnull(RemoteObject _ba,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("IsNull (funciones) ","funciones",23,_ba,funciones.mostCurrent,871);
if (RapidSub.canDelegate("isnull")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","isnull", _ba, _o);}
;
Debug.locals.put("O", _o);
 BA.debugLineNum = 871;BA.debugLine="Sub IsNull(O As Object) As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 872;BA.debugLine="Return (O=Null)";
Debug.ShouldStop(128);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("n",_o)));
 BA.debugLineNum = 873;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _left(RemoteObject _ba,RemoteObject _text,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Left (funciones) ","funciones",23,_ba,funciones.mostCurrent,8);
if (RapidSub.canDelegate("left")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","left", _ba, _text, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 8;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_length = _text.runMethod(true,"length");Debug.locals.put("Length", _length);};
 BA.debugLineNum = 10;BA.debugLine="Return Text.SubString2(0, Length)";
Debug.ShouldStop(512);
if (true) return _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_length));
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ltrim(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("LTrim (funciones) ","funciones",23,_ba,funciones.mostCurrent,24);
if (RapidSub.canDelegate("ltrim")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","ltrim", _ba, _s);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 24;BA.debugLine="Sub LTrim(s As String) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"^(\\s+)\", s)";
Debug.ShouldStop(16777216);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(\\s+)")),(Object)(_s));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 26;BA.debugLine="If m.Find Then";
Debug.ShouldStop(33554432);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="Return s.SubString(m.GetEnd(1))";
Debug.ShouldStop(67108864);
if (true) return _s.runMethod(true,"substring",(Object)(_m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 29;BA.debugLine="Return s";
Debug.ShouldStop(268435456);
if (true) return _s;
 };
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mid(RemoteObject _ba,RemoteObject _text,RemoteObject _start,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Mid (funciones) ","funciones",23,_ba,funciones.mostCurrent,18);
if (RapidSub.canDelegate("mid")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","mid", _ba, _text, _start, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Start", _start);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 18;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
Debug.ShouldStop(262144);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_start,_length,RemoteObject.createImmutable(1)}, "+-",2, 1)));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rellenar_derecha(RemoteObject _ba,RemoteObject _cadena,RemoteObject _cantcaracteres,RemoteObject _relleno) throws Exception{
try {
		Debug.PushSubsStack("Rellenar_Derecha (funciones) ","funciones",23,_ba,funciones.mostCurrent,875);
if (RapidSub.canDelegate("rellenar_derecha")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","rellenar_derecha", _ba, _cadena, _cantcaracteres, _relleno);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _nro = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
;
Debug.locals.put("Cadena", _cadena);
Debug.locals.put("CantCaracteres", _cantcaracteres);
Debug.locals.put("Relleno", _relleno);
 BA.debugLineNum = 875;BA.debugLine="Public Sub Rellenar_Derecha(Cadena As String,CantC";
Debug.ShouldStop(1024);
 BA.debugLineNum = 877;BA.debugLine="Dim i As Int";
Debug.ShouldStop(4096);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 878;BA.debugLine="Dim nro As String";
Debug.ShouldStop(8192);
_nro = RemoteObject.createImmutable("");Debug.locals.put("nro", _nro);
 BA.debugLineNum = 879;BA.debugLine="nro = Cadena.Length";
Debug.ShouldStop(16384);
_nro = BA.NumberToString(_cadena.runMethod(true,"length"));Debug.locals.put("nro", _nro);
 BA.debugLineNum = 881;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
Debug.ShouldStop(65536);
_cantidad = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cantcaracteres,BA.numberCast(double.class, _nro)}, "-",1, 0));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 883;BA.debugLine="If Cantidad > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 884;BA.debugLine="For i = 0 To Cantidad - 1";
Debug.ShouldStop(524288);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cantidad,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _i.<Integer>get().intValue() <= limit6) || (step6 < 0 && _i.<Integer>get().intValue() >= limit6) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 885;BA.debugLine="Cadena = Cadena & Relleno";
Debug.ShouldStop(1048576);
_cadena = RemoteObject.concat(_cadena,_relleno);Debug.locals.put("Cadena", _cadena);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 889;BA.debugLine="Return Cadena";
Debug.ShouldStop(16777216);
if (true) return _cadena;
 BA.debugLineNum = 891;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rellenar_izquierda(RemoteObject _ba,RemoteObject _cadena,RemoteObject _cantcaracteres,RemoteObject _relleno) throws Exception{
try {
		Debug.PushSubsStack("Rellenar_Izquierda (funciones) ","funciones",23,_ba,funciones.mostCurrent,893);
if (RapidSub.canDelegate("rellenar_izquierda")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","rellenar_izquierda", _ba, _cadena, _cantcaracteres, _relleno);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _nro = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
;
Debug.locals.put("Cadena", _cadena);
Debug.locals.put("CantCaracteres", _cantcaracteres);
Debug.locals.put("Relleno", _relleno);
 BA.debugLineNum = 893;BA.debugLine="Public Sub Rellenar_Izquierda(Cadena As String,Can";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 895;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1073741824);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 896;BA.debugLine="Dim nro As String";
Debug.ShouldStop(-2147483648);
_nro = RemoteObject.createImmutable("");Debug.locals.put("nro", _nro);
 BA.debugLineNum = 897;BA.debugLine="nro = Cadena.Length";
Debug.ShouldStop(1);
_nro = BA.NumberToString(_cadena.runMethod(true,"length"));Debug.locals.put("nro", _nro);
 BA.debugLineNum = 899;BA.debugLine="Dim Cantidad As Int = CantCaracteres - nro";
Debug.ShouldStop(4);
_cantidad = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cantcaracteres,BA.numberCast(double.class, _nro)}, "-",1, 0));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 901;BA.debugLine="If Cantidad > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 902;BA.debugLine="For i = 0 To Cantidad - 1";
Debug.ShouldStop(32);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cantidad,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _i.<Integer>get().intValue() <= limit6) || (step6 < 0 && _i.<Integer>get().intValue() >= limit6) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 903;BA.debugLine="Cadena = Relleno & Cadena";
Debug.ShouldStop(64);
_cadena = RemoteObject.concat(_relleno,_cadena);Debug.locals.put("Cadena", _cadena);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 907;BA.debugLine="Return Cadena";
Debug.ShouldStop(1024);
if (true) return _cadena;
 BA.debugLineNum = 909;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _right(RemoteObject _ba,RemoteObject _text,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Right (funciones) ","funciones",23,_ba,funciones.mostCurrent,13);
if (RapidSub.canDelegate("right")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","right", _ba, _text, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 13;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_length = _text.runMethod(true,"length");Debug.locals.put("Length", _length);};
 BA.debugLineNum = 15;BA.debugLine="Return Text.SubString(Text.Length-Length)";
Debug.ShouldStop(16384);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),_length}, "-",1, 1)));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rtrim(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("RTrim (funciones) ","funciones",23,_ba,funciones.mostCurrent,35);
if (RapidSub.canDelegate("rtrim")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","rtrim", _ba, _s);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 35;BA.debugLine="Sub RTrim(s As String) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\s+)$\", s)";
Debug.ShouldStop(8);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(\\s+)$")),(Object)(_s));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 37;BA.debugLine="If m.Find Then";
Debug.ShouldStop(16);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 38;BA.debugLine="Return s.SubString(m.GetEnd(1))";
Debug.ShouldStop(32);
if (true) return _s.runMethod(true,"substring",(Object)(_m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 1)))));
 }else {
 BA.debugLineNum = 40;BA.debugLine="Return s";
Debug.ShouldStop(128);
if (true) return _s;
 };
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rutdigito(RemoteObject _ba,RemoteObject _numero) throws Exception{
try {
		Debug.PushSubsStack("RutDigito (funciones) ","funciones",23,_ba,funciones.mostCurrent,940);
if (RapidSub.canDelegate("rutdigito")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","rutdigito", _ba, _numero);}
RemoteObject _cuenta = RemoteObject.createImmutable(0);
RemoteObject _suma = RemoteObject.createImmutable(0);
RemoteObject _resto = RemoteObject.createImmutable(0);
RemoteObject _digito = RemoteObject.createImmutable(0);
RemoteObject _dig = RemoteObject.createImmutable(0);
RemoteObject _nro = RemoteObject.createImmutable(0);
;
Debug.locals.put("numero", _numero);
 BA.debugLineNum = 940;BA.debugLine="Sub RutDigito(numero As Long) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 942;BA.debugLine="Dim cuenta, Suma, resto, Digito As Int";
Debug.ShouldStop(8192);
_cuenta = RemoteObject.createImmutable(0);Debug.locals.put("cuenta", _cuenta);
_suma = RemoteObject.createImmutable(0);Debug.locals.put("Suma", _suma);
_resto = RemoteObject.createImmutable(0);Debug.locals.put("resto", _resto);
_digito = RemoteObject.createImmutable(0);Debug.locals.put("Digito", _digito);
 BA.debugLineNum = 943;BA.debugLine="Dim dig As Double";
Debug.ShouldStop(16384);
_dig = RemoteObject.createImmutable(0);Debug.locals.put("dig", _dig);
 BA.debugLineNum = 944;BA.debugLine="Suma = 0";
Debug.ShouldStop(32768);
_suma = BA.numberCast(int.class, 0);Debug.locals.put("Suma", _suma);
 BA.debugLineNum = 945;BA.debugLine="cuenta = 2";
Debug.ShouldStop(65536);
_cuenta = BA.numberCast(int.class, 2);Debug.locals.put("cuenta", _cuenta);
 BA.debugLineNum = 947;BA.debugLine="Do Until numero = 0";
Debug.ShouldStop(262144);
while (!(RemoteObject.solveBoolean("=",_numero,BA.numberCast(long.class, 0)))) {
 BA.debugLineNum = 948;BA.debugLine="dig = numero Mod 10";
Debug.ShouldStop(524288);
_dig = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_numero,RemoteObject.createImmutable(10)}, "%",0, 2));Debug.locals.put("dig", _dig);
 BA.debugLineNum = 949;BA.debugLine="Dim Nro As Int = numero/10";
Debug.ShouldStop(1048576);
_nro = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_numero,RemoteObject.createImmutable(10)}, "/",0, 0));Debug.locals.put("Nro", _nro);Debug.locals.put("Nro", _nro);
 BA.debugLineNum = 950;BA.debugLine="numero = Nro";
Debug.ShouldStop(2097152);
_numero = BA.numberCast(long.class, _nro);Debug.locals.put("numero", _numero);
 BA.debugLineNum = 952;BA.debugLine="Suma = Suma + (dig * cuenta)";
Debug.ShouldStop(8388608);
_suma = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_suma,(RemoteObject.solve(new RemoteObject[] {_dig,_cuenta}, "*",0, 0))}, "+",1, 0));Debug.locals.put("Suma", _suma);
 BA.debugLineNum = 953;BA.debugLine="cuenta = cuenta + 1";
Debug.ShouldStop(16777216);
_cuenta = RemoteObject.solve(new RemoteObject[] {_cuenta,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("cuenta", _cuenta);
 BA.debugLineNum = 954;BA.debugLine="If cuenta = 8 Then cuenta = 2";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cuenta,BA.numberCast(double.class, 8))) { 
_cuenta = BA.numberCast(int.class, 2);Debug.locals.put("cuenta", _cuenta);};
 }
;
 BA.debugLineNum = 957;BA.debugLine="resto = Suma Mod 11";
Debug.ShouldStop(268435456);
_resto = RemoteObject.solve(new RemoteObject[] {_suma,RemoteObject.createImmutable(11)}, "%",0, 1);Debug.locals.put("resto", _resto);
 BA.debugLineNum = 958;BA.debugLine="Digito = 11 - resto";
Debug.ShouldStop(536870912);
_digito = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(11),_resto}, "-",1, 1);Debug.locals.put("Digito", _digito);
 BA.debugLineNum = 960;BA.debugLine="Select Case Digito";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_digito,BA.numberCast(int.class, 10),BA.numberCast(int.class, 11))) {
case 0: {
 BA.debugLineNum = 961;BA.debugLine="Case 10 : Return \"K\"";
Debug.ShouldStop(1);
if (true) return BA.ObjectToString("K");
 break; }
case 1: {
 BA.debugLineNum = 962;BA.debugLine="Case 11 : Return \"0\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("0");
 break; }
default: {
 BA.debugLineNum = 963;BA.debugLine="Case Else : Return Digito' Trim(Str(Digito))";
Debug.ShouldStop(4);
if (true) return BA.NumberToString(_digito);
 break; }
}
;
 BA.debugLineNum = 966;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_borrar_todos_registros_de_tabla(RemoteObject _ba,RemoteObject _tabla,RemoteObject _campo) throws Exception{
try {
		Debug.PushSubsStack("Sb_Borrar_Todos_Registros_De_Tabla (funciones) ","funciones",23,_ba,funciones.mostCurrent,968);
if (RapidSub.canDelegate("sb_borrar_todos_registros_de_tabla")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","sb_borrar_todos_registros_de_tabla", _ba, _tabla, _campo);}
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
RemoteObject _id = RemoteObject.createImmutable("");
;
Debug.locals.put("Tabla", _tabla);
Debug.locals.put("Campo", _campo);
 BA.debugLineNum = 968;BA.debugLine="Sub Sb_Borrar_Todos_Registros_De_Tabla(Tabla As St";
Debug.ShouldStop(128);
 BA.debugLineNum = 970;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(512);
_consulta_sql = RemoteObject.createImmutable("");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 971;BA.debugLine="Dim Table As List";
Debug.ShouldStop(1024);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 972;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(2048);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 974;BA.debugLine="Tabla = Tabla.ToLowerCase";
Debug.ShouldStop(8192);
_tabla = _tabla.runMethod(true,"toLowerCase");Debug.locals.put("Tabla", _tabla);
 BA.debugLineNum = 975;BA.debugLine="Campo = Campo.ToLowerCase";
Debug.ShouldStop(16384);
_campo = _campo.runMethod(true,"toLowerCase");Debug.locals.put("Campo", _campo);
 BA.debugLineNum = 977;BA.debugLine="Consulta_Sql = \"Select \" & Campo & \" From \" & Tab";
Debug.ShouldStop(65536);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select "),_campo,RemoteObject.createImmutable(" From "),_tabla);Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 979;BA.debugLine="Table = DBUtils.ExecuteMemoryTable(Variables.vSql";
Debug.ShouldStop(262144);
_table = funciones.mostCurrent._dbutils.runMethod(false,"_executememorytable" /*RemoteObject*/ ,_ba,(Object)(funciones.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(_consulta_sql),(Object)((funciones.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("Table", _table);
 BA.debugLineNum = 981;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(1048576);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 982;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(2097152);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 983;BA.debugLine="Dim Id = Cols(0)";
Debug.ShouldStop(4194304);
_id = _cols.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Id", _id);Debug.locals.put("Id", _id);
 BA.debugLineNum = 984;BA.debugLine="Consulta_Sql = \"Delete From [\" & Tabla & \"] Wher";
Debug.ShouldStop(8388608);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Delete From ["),_tabla,RemoteObject.createImmutable("] Where ["),_campo,RemoteObject.createImmutable("] = ?"));Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 985;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(16777216);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(_consulta_sql),(Object)(funciones.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 988;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_borrartodoslosregistrosdelabasededatos(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos (funciones) ","funciones",23,_ba,funciones.mostCurrent,990);
if (RapidSub.canDelegate("sb_borrartodoslosregistrosdelabasededatos")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","sb_borrartodoslosregistrosdelabasededatos", _ba);}
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 990;BA.debugLine="Sub Sb_BorrarTodosLosRegistrosDeLaBaseDeDatos";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 992;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(-2147483648);
_consulta_sql = RemoteObject.createImmutable("");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 994;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc]\"";
Debug.ShouldStop(2);
_consulta_sql = BA.ObjectToString("Delete From [Descuentos_Doc]");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 995;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(4);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_consulta_sql));
 BA.debugLineNum = 997;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc]\"";
Debug.ShouldStop(16);
_consulta_sql = BA.ObjectToString("Delete From [DespaFacil_Doc]");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 998;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(32);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_consulta_sql));
 BA.debugLineNum = 1000;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc]\"";
Debug.ShouldStop(128);
_consulta_sql = BA.ObjectToString("Delete From [Detalle_Doc]");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 1001;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(256);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_consulta_sql));
 BA.debugLineNum = 1003;BA.debugLine="Consulta_Sql = \"Delete From [Encabezado_Doc]\"";
Debug.ShouldStop(1024);
_consulta_sql = BA.ObjectToString("Delete From [Encabezado_Doc]");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 1004;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(2048);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_consulta_sql));
 BA.debugLineNum = 1006;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc]\"";
Debug.ShouldStop(8192);
_consulta_sql = BA.ObjectToString("Delete From [Impuestos_Doc]");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 1007;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(16384);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_consulta_sql));
 BA.debugLineNum = 1009;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc]\"";
Debug.ShouldStop(65536);
_consulta_sql = BA.ObjectToString("Delete From [Observaciones_Doc]");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 1010;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
Debug.ShouldStop(131072);
funciones.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_consulta_sql));
 BA.debugLineNum = 1012;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _split(RemoteObject _ba,RemoteObject _text,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("Split (funciones) ","funciones",23,_ba,funciones.mostCurrent,44);
if (RapidSub.canDelegate("split")) { return BaKapp.Movil.Tag.funciones.remoteMe.runUserSub(false, "funciones","split", _ba, _text, _delimiter);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Delimiter", _delimiter);
 BA.debugLineNum = 44;BA.debugLine="Sub Split(Text As String, Delimiter As String) As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return Regex.Split(Delimiter,Text)";
Debug.ShouldStop(4096);
if (true) return funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(_delimiter),(Object)(_text));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}