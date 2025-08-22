package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_impresion_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,69);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","activity_create", _firsttime);}
RemoteObject _stringlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _stringlist2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _et = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._etiqueta");
RemoteObject _valorbuscado = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="Activity.LoadLayout(\"impresion\")";
Debug.ShouldStop(64);
frm_impresion.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("impresion")),frm_impresion.mostCurrent.activityBA);
 BA.debugLineNum = 72;BA.debugLine="DataPrice.Initialize";
Debug.ShouldStop(128);
frm_impresion._dataprice.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="DataList.Initialize";
Debug.ShouldStop(256);
frm_impresion._datalist.runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="Dim stringList As List";
Debug.ShouldStop(512);
_stringlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("stringList", _stringlist);
 BA.debugLineNum = 75;BA.debugLine="stringList.Initialize";
Debug.ShouldStop(1024);
_stringlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="stringList.Add(\"Principal\")";
Debug.ShouldStop(2048);
_stringlist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Principal"))));
 BA.debugLineNum = 78;BA.debugLine="stringList.Add(\"Tecnico\")";
Debug.ShouldStop(8192);
_stringlist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Tecnico"))));
 BA.debugLineNum = 79;BA.debugLine="stringList.Add(\"Rapido\")";
Debug.ShouldStop(16384);
_stringlist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Rapido"))));
 BA.debugLineNum = 80;BA.debugLine="stringList.Add(\"Descripcion\")";
Debug.ShouldStop(32768);
_stringlist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Descripcion"))));
 BA.debugLineNum = 82;BA.debugLine="Dim stringList2 As List";
Debug.ShouldStop(131072);
_stringlist2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("stringList2", _stringlist2);
 BA.debugLineNum = 83;BA.debugLine="stringList2.Initialize";
Debug.ShouldStop(262144);
_stringlist2.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="For i = 1 To 10";
Debug.ShouldStop(1048576);
{
final int step12 = 1;
final int limit12 = 10;
_i = 1 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Spinner_cant.Add(i) ' B4A lo convierte automátic";
Debug.ShouldStop(2097152);
frm_impresion.mostCurrent._spinner_cant.runVoidMethod ("Add",(Object)(BA.NumberToString(_i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 88;BA.debugLine="cantidad = 1";
Debug.ShouldStop(8388608);
frm_impresion._cantidad = BA.numberCast(int.class, 1);
 BA.debugLineNum = 89;BA.debugLine="Combo_TipoBusqueda.SetItems(stringList)";
Debug.ShouldStop(16777216);
frm_impresion.mostCurrent._combo_tipobusqueda.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(_stringlist));
 BA.debugLineNum = 90;BA.debugLine="Combo_Impresion.SetItems(stringList2)";
Debug.ShouldStop(33554432);
frm_impresion.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(_stringlist2));
 BA.debugLineNum = 91;BA.debugLine="selectedString = \"Principal\"";
Debug.ShouldStop(67108864);
frm_impresion.mostCurrent._selectedstring = BA.ObjectToString("Principal");
 BA.debugLineNum = 92;BA.debugLine="LeerDatos";
Debug.ShouldStop(134217728);
_leerdatos();
 BA.debugLineNum = 113;BA.debugLine="Etiquetas = Frm_etiquetas.Etiquetas";
Debug.ShouldStop(65536);
frm_impresion.mostCurrent._etiquetas = frm_impresion.mostCurrent._frm_etiquetas._etiquetas /*RemoteObject*/ ;
 BA.debugLineNum = 114;BA.debugLine="For Each ET As Etiqueta In Etiquetas";
Debug.ShouldStop(131072);
{
final RemoteObject group21 = frm_impresion.mostCurrent._etiquetas;
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_et = (group21.runMethod(false,"Get",index21));Debug.locals.put("ET", _et);
Debug.locals.put("ET", _et);
 BA.debugLineNum = 115;BA.debugLine="stringList2.Add(ET.NombreEtiqueta)";
Debug.ShouldStop(262144);
_stringlist2.runVoidMethod ("Add",(Object)((_et.getField(true,"NombreEtiqueta" /*RemoteObject*/ ))));
 }
}Debug.locals.put("ET", _et);
;
 BA.debugLineNum = 124;BA.debugLine="Combo_Impresion.SetItems(stringList2)";
Debug.ShouldStop(134217728);
frm_impresion.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(_stringlist2));
 BA.debugLineNum = 125;BA.debugLine="If (Frm_etiquetas.default.Length <> 0) Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("!",frm_impresion.mostCurrent._frm_etiquetas._default /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 126;BA.debugLine="Dim valorBuscado As String = Frm_etiquetas.defau";
Debug.ShouldStop(536870912);
_valorbuscado = frm_impresion.mostCurrent._frm_etiquetas._default /*RemoteObject*/ ;Debug.locals.put("valorBuscado", _valorbuscado);Debug.locals.put("valorBuscado", _valorbuscado);
 BA.debugLineNum = 128;BA.debugLine="For i = 0 To Combo_Impresion.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {frm_impresion.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 129;BA.debugLine="If Combo_Impresion.GetItem(i) = valorBuscado Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",frm_impresion.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))),_valorbuscado)) { 
 BA.debugLineNum = 130;BA.debugLine="Combo_Impresion.SelectedIndex = i";
Debug.ShouldStop(2);
frm_impresion.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 131;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="tip = Frm_etiquetas.default";
Debug.ShouldStop(32);
frm_impresion.mostCurrent._tip = frm_impresion.mostCurrent._frm_etiquetas._default /*RemoteObject*/ ;
 }else {
 BA.debugLineNum = 136;BA.debugLine="tip = Combo_Impresion.GetItem(0)";
Debug.ShouldStop(128);
frm_impresion.mostCurrent._tip = frm_impresion.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 182;BA.debugLine="Btn_Buscar_Click";
Debug.ShouldStop(2097152);
_btn_buscar_click();
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,224);
if (RapidSub.canDelegate("activity_keypress")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 224;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, frm_impresion.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 227;BA.debugLine="IME1.HideKeyboard";
Debug.ShouldStop(4);
frm_impresion.mostCurrent._ime1.runVoidMethod ("HideKeyboard",frm_impresion.mostCurrent.activityBA);
 BA.debugLineNum = 228;BA.debugLine="If YaBusco = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",frm_impresion._yabusco,frm_impresion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 229;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
frm_impresion.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 231;BA.debugLine="If Panel_Buscador.Visible = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",frm_impresion.mostCurrent._panel_buscador.runMethod(true,"getVisible"),frm_impresion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 232;BA.debugLine="Panel_Buscador.Visible = False";
Debug.ShouldStop(128);
frm_impresion.mostCurrent._panel_buscador.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 233;BA.debugLine="Btn_Buscar.Visible = True";
Debug.ShouldStop(256);
frm_impresion.mostCurrent._btn_buscar.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 234;BA.debugLine="Panelinfo.Visible = True";
Debug.ShouldStop(512);
frm_impresion.mostCurrent._panelinfo.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 }else 
{ BA.debugLineNum = 235;BA.debugLine="else If PanelVista.Visible = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",frm_impresion.mostCurrent._panelvista.runMethod(true,"getVisible"),frm_impresion.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 236;BA.debugLine="PanelVista.Visible = False";
Debug.ShouldStop(2048);
frm_impresion.mostCurrent._panelvista.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 237;BA.debugLine="Btn_Buscar.Visible = True";
Debug.ShouldStop(4096);
frm_impresion.mostCurrent._btn_buscar.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 238;BA.debugLine="Panelinfo.Visible = True";
Debug.ShouldStop(8192);
frm_impresion.mostCurrent._panelinfo.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 241;BA.debugLine="Btn_Volver_Click";
Debug.ShouldStop(65536);
_btn_volver_click();
 }}
;
 BA.debugLineNum = 246;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return frm_impresion.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 249;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return frm_impresion.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,279);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 279;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,275);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","activity_resume");}
 BA.debugLineNum = 275;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlinebreak(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("AddLineBreak (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,680);
if (RapidSub.canDelegate("addlinebreak")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","addlinebreak", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 680;BA.debugLine="Sub AddLineBreak(str As String) As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 681;BA.debugLine="If str.Length > 22 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_str.runMethod(true,"length"),BA.numberCast(double.class, 22))) { 
 BA.debugLineNum = 682;BA.debugLine="Return str.SubString2(0, 22) & \"\\n\" & str.SubStr";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(_str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 22))),RemoteObject.createImmutable("\\n"),_str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 22))));
 }else {
 BA.debugLineNum = 684;BA.debugLine="Return str";
Debug.ShouldStop(2048);
if (true) return _str;
 };
 BA.debugLineNum = 686;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xcombobox1_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("B4XComboBox1_SelectedIndexChanged (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,494);
if (RapidSub.canDelegate("b4xcombobox1_selectedindexchanged")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","b4xcombobox1_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 494;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
Debug.ShouldStop(8192);
 BA.debugLineNum = 495;BA.debugLine="selectedString = B4XComboBox1.GetItem(Index)";
Debug.ShouldStop(16384);
frm_impresion.mostCurrent._selectedstring = frm_impresion.mostCurrent._b4xcombobox1.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_index));
 BA.debugLineNum = 496;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bsc(RemoteObject _tipo,RemoteObject _codigo,RemoteObject _me_,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _lista) throws Exception{
try {
		Debug.PushSubsStack("Bsc (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,508);
if (RapidSub.canDelegate("bsc")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","bsc", _tipo, _codigo, _me_, _empresa, _sucursal, _bodega, _lista);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Tipo", _tipo);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Me_", _me_);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 508;BA.debugLine="Private Sub Bsc(Tipo As String, Codigo As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 510;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(536870912);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_Inv_TraerProductoInventarioTicket xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("      <_Empresa>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("      <_Sucursal>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sucursal))),RemoteObject.createImmutable("</_Sucursal>\n"),RemoteObject.createImmutable("      <_Bodega>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_bodega))),RemoteObject.createImmutable("</_Bodega>\n"),RemoteObject.createImmutable("      <_Tipo>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tipo))),RemoteObject.createImmutable("</_Tipo>\n"),RemoteObject.createImmutable("      <_Codigo>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codigo))),RemoteObject.createImmutable("</_Codigo>\n"),RemoteObject.createImmutable("	   <_Lista>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lista))),RemoteObject.createImmutable("</_Lista>\n"),RemoteObject.createImmutable("    </Sb_Inv_TraerProductoInventarioTicket>\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>\n"),RemoteObject.createImmutable("")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 525;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(4096);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_impresion.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 526;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(8192);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 528;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(32768);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_impresion.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 529;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(65536);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 530;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(131072);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 531;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(262144);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_Inv_TraerProductoInventarioTicket\""))));
 BA.debugLineNum = 532;BA.debugLine="Return Js";
Debug.ShouldStop(524288);
if (true) return _js;
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_buscar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,383);
if (RapidSub.canDelegate("btn_buscar_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_buscar_click");}
 BA.debugLineNum = 383;BA.debugLine="Private Sub Btn_Buscar_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 384;BA.debugLine="Panel_Buscador.Visible = True";
Debug.ShouldStop(-2147483648);
frm_impresion.mostCurrent._panel_buscador.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 385;BA.debugLine="Btn_Buscar.Visible = False";
Debug.ShouldStop(1);
frm_impresion.mostCurrent._btn_buscar.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 386;BA.debugLine="Txt_codigo.Text = \"\"";
Debug.ShouldStop(2);
frm_impresion.mostCurrent._txt_codigo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 387;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4);
frm_impresion.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 388;BA.debugLine="Txt_codigo.RequestFocus";
Debug.ShouldStop(8);
frm_impresion.mostCurrent._txt_codigo.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_buscarprod_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_BuscarProd_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,391);
if (RapidSub.canDelegate("btn_buscarprod_click")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_buscarprod_click"); return;}
ResumableSub_Btn_BuscarProd_Click rsub = new ResumableSub_Btn_BuscarProd_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_BuscarProd_Click extends BA.ResumableSub {
public ResumableSub_Btn_BuscarProd_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _ac = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_BuscarProd_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,391);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 392;BA.debugLine="Log(\"Preess\")";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63014657",RemoteObject.createImmutable("Preess"),0);
 BA.debugLineNum = 393;BA.debugLine="If(Txt_codigo.Text <> \"\") Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if ((RemoteObject.solveBoolean("!",parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 394;BA.debugLine="IME1.HideKeyboard";
Debug.ShouldStop(512);
parent.mostCurrent._ime1.runVoidMethod ("HideKeyboard",frm_impresion.mostCurrent.activityBA);
 BA.debugLineNum = 396;BA.debugLine="wait for(Buscar_x_Comentario(selectedString,Txt_";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "btn_buscarprod_click"), _buscar_x_comentario(parent.mostCurrent._selectedstring,parent.mostCurrent._txt_codigo.runMethod(true,"getText"),frm_impresion.getObject()));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_ac = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ac", _ac);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 398;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _ac) throws Exception{
}
public static void  _btn_calibrar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Calibrar_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1006);
if (RapidSub.canDelegate("btn_calibrar_click")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_calibrar_click"); return;}
ResumableSub_Btn_Calibrar_Click rsub = new ResumableSub_Btn_Calibrar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Calibrar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Calibrar_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _zpl = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Calibrar_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1006);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1007;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(16384);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 1008;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
Debug.ShouldStop(32768);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 1009;BA.debugLine="Msgbox2Async(\"¿Estas seguro de calibrar la impres";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Estas seguro de calibrar la impresora?")),(Object)(BA.ObjectToCharSequence("Impresora")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1010;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "btn_calibrar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1011;BA.debugLine="If(Result <> DialogResponse.POSITIVE ) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1012;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1015;BA.debugLine="Dim zpl As String = $\"^XA ~JC ^XZ\"$";
Debug.ShouldStop(4194304);
_zpl = (RemoteObject.concat(RemoteObject.createImmutable("^XA\n"),RemoteObject.createImmutable("~JC\n"),RemoteObject.createImmutable("^XZ")));Debug.locals.put("zpl", _zpl);Debug.locals.put("zpl", _zpl);
 BA.debugLineNum = 1018;BA.debugLine="EnviarCalibrar(zpl)";
Debug.ShouldStop(33554432);
_enviarcalibrar(_zpl);
 BA.debugLineNum = 1019;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btn_cerrarbuscador_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_CerrarBuscador_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,498);
if (RapidSub.canDelegate("btn_cerrarbuscador_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_cerrarbuscador_click");}
 BA.debugLineNum = 498;BA.debugLine="Private Sub Btn_CerrarBuscador_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 499;BA.debugLine="If YaBusco = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",frm_impresion._yabusco,frm_impresion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 500;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
frm_impresion.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 502;BA.debugLine="Btn_Buscar.Visible= True";
Debug.ShouldStop(2097152);
frm_impresion.mostCurrent._btn_buscar.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 504;BA.debugLine="Panel_Buscador.Visible = False";
Debug.ShouldStop(8388608);
frm_impresion.mostCurrent._panel_buscador.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_cerrarview_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_cerrarVIEW_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1046);
if (RapidSub.canDelegate("btn_cerrarview_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_cerrarview_click");}
 BA.debugLineNum = 1046;BA.debugLine="Private Sub Btn_cerrarVIEW_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1047;BA.debugLine="PanelVista.Visible =False";
Debug.ShouldStop(4194304);
frm_impresion.mostCurrent._panelvista.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1048;BA.debugLine="Panelinfo.Visible=True";
Debug.ShouldStop(8388608);
frm_impresion.mostCurrent._panelinfo.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1049;BA.debugLine="Btn_Buscar.Visible = True";
Debug.ShouldStop(16777216);
frm_impresion.mostCurrent._btn_buscar.runMethod(true,"setVisible",frm_impresion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_imprimir_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_imprimir_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,677);
if (RapidSub.canDelegate("btn_imprimir_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_imprimir_click");}
 BA.debugLineNum = 677;BA.debugLine="Private Sub Btn_imprimir_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 678;BA.debugLine="EnviarEtiqueta(etiqueta_ZPL)";
Debug.ShouldStop(32);
_enviaretiqueta(frm_impresion.mostCurrent._etiqueta_zpl);
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_limpiar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_limpiar_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1101);
if (RapidSub.canDelegate("btn_limpiar_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_limpiar_click");}
 BA.debugLineNum = 1101;BA.debugLine="Private Sub Btn_limpiar_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1102;BA.debugLine="Txt_codigo.Text = \"\"";
Debug.ShouldStop(8192);
frm_impresion.mostCurrent._txt_codigo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1103;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_mas_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_mas_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1059);
if (RapidSub.canDelegate("btn_mas_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_mas_click");}
 BA.debugLineNum = 1059;BA.debugLine="Private Sub Btn_mas_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1060;BA.debugLine="Ancho = Ancho + 0.5";
Debug.ShouldStop(8);
frm_impresion._ancho = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {frm_impresion._ancho,RemoteObject.createImmutable(0.5)}, "+",1, 0));
 BA.debugLineNum = 1061;BA.debugLine="Alto = Alto + 0.5";
Debug.ShouldStop(16);
frm_impresion._alto = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {frm_impresion._alto,RemoteObject.createImmutable(0.5)}, "+",1, 0));
 BA.debugLineNum = 1062;BA.debugLine="Btn_Ver_Click";
Debug.ShouldStop(32);
_btn_ver_click();
 BA.debugLineNum = 1063;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_menos_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Menos_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1053);
if (RapidSub.canDelegate("btn_menos_click")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_menos_click");}
 BA.debugLineNum = 1053;BA.debugLine="Private Sub Btn_Menos_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1054;BA.debugLine="Ancho = Ancho - 0.5";
Debug.ShouldStop(536870912);
frm_impresion._ancho = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {frm_impresion._ancho,RemoteObject.createImmutable(0.5)}, "-",1, 0));
 BA.debugLineNum = 1055;BA.debugLine="Alto = Alto - 0.5";
Debug.ShouldStop(1073741824);
frm_impresion._alto = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {frm_impresion._alto,RemoteObject.createImmutable(0.5)}, "-",1, 0));
 BA.debugLineNum = 1056;BA.debugLine="Btn_Ver_Click";
Debug.ShouldStop(-2147483648);
_btn_ver_click();
 BA.debugLineNum = 1057;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_ver_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Ver_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1022);
if (RapidSub.canDelegate("btn_ver_click")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_ver_click"); return;}
ResumableSub_Btn_Ver_Click rsub = new ResumableSub_Btn_Ver_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Ver_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ver_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _fechaactual = RemoteObject.createImmutable("");
RemoteObject _zpl = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _j = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Ver_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1022);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1023;BA.debugLine="Panelinfo.Visible=False";
Debug.ShouldStop(1073741824);
parent.mostCurrent._panelinfo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1024;BA.debugLine="Dim FechaActual As String";
Debug.ShouldStop(-2147483648);
_fechaactual = RemoteObject.createImmutable("");Debug.locals.put("FechaActual", _fechaactual);
 BA.debugLineNum = 1025;BA.debugLine="FechaActual = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(1);
_fechaactual = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("FechaActual", _fechaactual);
 BA.debugLineNum = 1026;BA.debugLine="Dim zpl As String = etiqueta_ZPL";
Debug.ShouldStop(2);
_zpl = parent.mostCurrent._etiqueta_zpl;Debug.locals.put("zpl", _zpl);Debug.locals.put("zpl", _zpl);
 BA.debugLineNum = 1028;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(8);
_job = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1029;BA.debugLine="job.Initialize(\"\", Me)";
Debug.ShouldStop(16);
_job.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_impresion.processBA,(Object)(BA.ObjectToString("")),(Object)(frm_impresion.getObject()));
 BA.debugLineNum = 1030;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/prin";
Debug.ShouldStop(32);
_job.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://api.labelary.com/v1/printers/8dpmm/labels/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._ancho))),RemoteObject.createImmutable("x"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._alto))),RemoteObject.createImmutable("/0/")))),(Object)(_zpl));
 BA.debugLineNum = 1031;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"image/png\")";
Debug.ShouldStop(64);
_job.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("image/png")));
 BA.debugLineNum = 1033;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "btn_ver_click"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1034;BA.debugLine="If j.Success Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1035;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
Debug.ShouldStop(1024);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _j.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getbitmap" /*RemoteObject*/ );Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1036;BA.debugLine="ImageView1.Bitmap = bmp";
Debug.ShouldStop(2048);
parent.mostCurrent._imageview1.runMethod(false,"setBitmap",(_bmp.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1038;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64390928",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1039;BA.debugLine="ToastMessageShow(\"No se pudo generar la etiqueta";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No se pudo generar la etiqueta")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1041;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1042;BA.debugLine="PanelVista.Visible=True";
Debug.ShouldStop(131072);
parent.mostCurrent._panelvista.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1043;BA.debugLine="Btn_Buscar.Visible = False";
Debug.ShouldStop(262144);
parent.mostCurrent._btn_buscar.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static void  _btn_volver_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Volver_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,988);
if (RapidSub.canDelegate("btn_volver_click")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","btn_volver_click"); return;}
ResumableSub_Btn_Volver_Click rsub = new ResumableSub_Btn_Volver_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Volver_Click extends BA.ResumableSub {
public ResumableSub_Btn_Volver_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Volver_Click (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,988);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 989;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(268435456);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 990;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(536870912);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 991;BA.debugLine="Msgbox2Async(\"Si sales, se perdera la información";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Si sales, se perdera la información de la etiqueta actual")),(Object)(BA.ObjectToCharSequence("Advertencia")),(Object)(BA.ObjectToString("Salir")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 992;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "btn_volver_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 993;BA.debugLine="If(Result = DialogResponse.POSITIVE ) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 994;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 998;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _buscar_x_comentario(RemoteObject _tipo,RemoteObject _vdescripcion,RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Buscar_x_Comentario (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,535);
if (RapidSub.canDelegate("buscar_x_comentario")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","buscar_x_comentario", _tipo, _vdescripcion, _me_);}
ResumableSub_Buscar_x_Comentario rsub = new ResumableSub_Buscar_x_Comentario(null,_tipo,_vdescripcion,_me_);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Buscar_x_Comentario extends BA.ResumableSub {
public ResumableSub_Buscar_x_Comentario(BaKapp.Movil.Tag.frm_impresion parent,RemoteObject _tipo,RemoteObject _vdescripcion,RemoteObject _me_) {
this.parent = parent;
this._tipo = _tipo;
this._vdescripcion = _vdescripcion;
this._me_ = _me_;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _tipo;
RemoteObject _vdescripcion;
RemoteObject _me_;
RemoteObject _vcadena = RemoteObject.createImmutable("");
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _consul = RemoteObject.createImmutable("");
RemoteObject _tabcodal = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Buscar_x_Comentario (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,535);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Tipo", _tipo);
Debug.locals.put("VDescripcion", _vdescripcion);
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 537;BA.debugLine="DataList.Clear";
Debug.ShouldStop(16777216);
parent._datalist.runVoidMethod ("Clear");
 BA.debugLineNum = 538;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(33554432);
parent.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 540;BA.debugLine="Dim vCadena As String";
Debug.ShouldStop(134217728);
_vcadena = RemoteObject.createImmutable("");Debug.locals.put("vCadena", _vcadena);
 BA.debugLineNum = 541;BA.debugLine="vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescr";
Debug.ShouldStop(268435456);
_vcadena = parent.mostCurrent._funciones.runMethod(true,"_fx_cadena_a_buscar_sql" /*RemoteObject*/ ,frm_impresion.mostCurrent.activityBA,(Object)(_vdescripcion),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Mp.KOPR+Mp.NOKOPR"),RemoteObject.createImmutable(" LIKE '%"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vCadena", _vcadena);
 BA.debugLineNum = 546;BA.debugLine="ProgressDialogShow(\"Buscando prooductos...\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_impresion.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando prooductos..."))));
 BA.debugLineNum = 548;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(8);
_consulta_sql = RemoteObject.createImmutable("");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 549;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(16);
_empresa = parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ;Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 550;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
Debug.ShouldStop(32);
_sucursal = parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ;Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 551;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
Debug.ShouldStop(64);
_bodega = parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ ;Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 552;BA.debugLine="Dim Consul As String  = \"\"";
Debug.ShouldStop(128);
_consul = BA.ObjectToString("");Debug.locals.put("Consul", _consul);Debug.locals.put("Consul", _consul);
 BA.debugLineNum = 553;BA.debugLine="Dim tabcodal As String = \"\"";
Debug.ShouldStop(256);
_tabcodal = BA.ObjectToString("");Debug.locals.put("tabcodal", _tabcodal);Debug.locals.put("tabcodal", _tabcodal);
 BA.debugLineNum = 554;BA.debugLine="If selectedString = \"Tecnico\" Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._selectedstring,BA.ObjectToString("Tecnico"))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 558;BA.debugLine="else if selectedString = \"Rapido\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._selectedstring,BA.ObjectToString("Rapido"))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 562;BA.debugLine="Else if selectedString = \"Principal\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._selectedstring,BA.ObjectToString("Principal"))) { 
this.state = 7;
}else 
{ BA.debugLineNum = 568;BA.debugLine="Else if selectedString = \"Descripcion\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._selectedstring,BA.ObjectToString("Descripcion"))) { 
this.state = 9;
}}}}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 556;BA.debugLine="Consul = \"WHERE Mp.KOPRTE  Like '%\" & vCadena &";
Debug.ShouldStop(2048);
_consul = RemoteObject.concat(RemoteObject.createImmutable("WHERE Mp.KOPRTE  Like '%"),_vcadena,RemoteObject.createImmutable("%'"));Debug.locals.put("Consul", _consul);
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 560;BA.debugLine="Consul = \"WHERE Mp.KOPRRA  Like '%\" & vCadena &";
Debug.ShouldStop(32768);
_consul = RemoteObject.concat(RemoteObject.createImmutable("WHERE Mp.KOPRRA  Like '%"),_vcadena,RemoteObject.createImmutable("%'"));Debug.locals.put("Consul", _consul);
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 564;BA.debugLine="Consul = \"WHERE (Mp.KOPR  Like '%\" & vCadena & \"";
Debug.ShouldStop(524288);
_consul = RemoteObject.concat(RemoteObject.createImmutable("WHERE (Mp.KOPR  Like '%"),_vcadena,RemoteObject.createImmutable("%') OR ((ta.KOPRAL = '"),_vdescripcion,RemoteObject.createImmutable("' ) and (ta.KOEN = '')) "));Debug.locals.put("Consul", _consul);
 BA.debugLineNum = 565;BA.debugLine="tabcodal = \"left join TABCODAL ta on Mp.KOPR = t";
Debug.ShouldStop(1048576);
_tabcodal = BA.ObjectToString("left join TABCODAL ta on Mp.KOPR = ta.KOPR");Debug.locals.put("tabcodal", _tabcodal);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 570;BA.debugLine="Consul = \"WHERE Mp.NOKOPR  Like '%\" & vCadena &";
Debug.ShouldStop(33554432);
_consul = RemoteObject.concat(RemoteObject.createImmutable("WHERE Mp.NOKOPR  Like '%"),_vcadena,RemoteObject.createImmutable("%'"));Debug.locals.put("Consul", _consul);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 575;BA.debugLine="Consulta_Sql = \"SELECT distinct TOP (25) Mp.KOPR";
Debug.ShouldStop(1073741824);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("SELECT distinct TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEPR Mp With (Nolock)"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("RIGHT Join MAEST Ms On Ms.EMPRESA = '"),_empresa,RemoteObject.createImmutable("' And Ms.KOSU = '"),_sucursal,RemoteObject.createImmutable("' AND Ms.KOBO = '"),_bodega,RemoteObject.createImmutable("' AND Mp.KOPR = Ms.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("RIGHT Join TABBOPR Tb On Tb.EMPRESA = '"),_empresa,RemoteObject.createImmutable("' And Tb.KOSU = '"),_sucursal,RemoteObject.createImmutable("' AND Tb.KOBO = '"),_bodega,RemoteObject.createImmutable("' AND Tb.KOPR = Ms.KOPR "),parent.mostCurrent.__c.getField(true,"CRLF"),_tabcodal,parent.mostCurrent.__c.getField(true,"CRLF"),_consul,parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order by Mp.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Option ( Fast 25 )"));Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 589;BA.debugLine="Consulta_Sql = $\"SELECT distinct TOP (25) Mp.KOPR";
Debug.ShouldStop(4096);
_consulta_sql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT distinct TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR, KOPRRA as RAPIDO,\n"),RemoteObject.createImmutable("Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL\n"),RemoteObject.createImmutable("From MAEPR Mp With (Nolock)\n"),RemoteObject.createImmutable("left join TABCODAL ta on Mp.KOPR = ta.KOPR\n"),RemoteObject.createImmutable("inner join MAEPREM Me on Me.EMPRESA = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_empresa))),RemoteObject.createImmutable("' and Me.KOPR = Mp.KOPR\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_consul))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Order by Mp.KOPR")));Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 599;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(4194304);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_impresion.mostCurrent.activityBA,(Object)(_consulta_sql),(Object)(frm_impresion.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 600;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "buscar_x_comentario"), (_js));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 601;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 11:
//if
this.state = 22;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 603;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(67108864);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 605;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(268435456);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 607;BA.debugLine="ParseJSON(vJson)";
Debug.ShouldStop(1073741824);
_parsejson(_vjson);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 613;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No se encontraron registros")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 621;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 623;BA.debugLine="Return 1";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((1)));return;};
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _combo_impresion_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("Combo_Impresion_SelectedIndexChanged (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,952);
if (RapidSub.canDelegate("combo_impresion_selectedindexchanged")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","combo_impresion_selectedindexchanged", _index); return;}
ResumableSub_Combo_Impresion_SelectedIndexChanged rsub = new ResumableSub_Combo_Impresion_SelectedIndexChanged(null,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Combo_Impresion_SelectedIndexChanged extends BA.ResumableSub {
public ResumableSub_Combo_Impresion_SelectedIndexChanged(BaKapp.Movil.Tag.frm_impresion parent,RemoteObject _index) {
this.parent = parent;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _index;
RemoteObject _js2 = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _escorrecto = RemoteObject.createImmutable(false);
RemoteObject _etiqueta = RemoteObject.createImmutable("");
RemoteObject _mensaje = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result5 = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Combo_Impresion_SelectedIndexChanged (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,952);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 953;BA.debugLine="tip = Combo_Impresion.GetItem(Index)";
Debug.ShouldStop(16777216);
parent.mostCurrent._tip = parent.mostCurrent._combo_impresion.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_index));
 BA.debugLineNum = 954;BA.debugLine="Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me";
Debug.ShouldStop(33554432);
_js2 = _sb_imprimiretiquetazpl_01(frm_impresion.getObject(),parent._objselec.getField(true,"Principal" /*RemoteObject*/ ));Debug.locals.put("Js2", _js2);Debug.locals.put("Js2", _js2);
 BA.debugLineNum = 955;BA.debugLine="Wait For (Js2) JobDone(Js2 As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "combo_impresion_selectedindexchanged"), (_js2));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js2", _js2);
;
 BA.debugLineNum = 956;BA.debugLine="If Js2.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 16;
if (_js2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 957;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 958;BA.debugLine="parser.Initialize(Js2.GetString)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_js2.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 960;BA.debugLine="Dim m As Map = parser.NextObject";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 961;BA.debugLine="Dim EsCorrecto As Boolean = m.Get(\"EsCorrecto\")";
Debug.ShouldStop(1);
_escorrecto = BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EsCorrecto")))));Debug.locals.put("EsCorrecto", _escorrecto);Debug.locals.put("EsCorrecto", _escorrecto);
 BA.debugLineNum = 962;BA.debugLine="Dim Etiqueta As String = m.Get(\"Etiqueta\")";
Debug.ShouldStop(2);
_etiqueta = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Etiqueta")))));Debug.locals.put("Etiqueta", _etiqueta);Debug.locals.put("Etiqueta", _etiqueta);
 BA.debugLineNum = 963;BA.debugLine="Dim Mensaje As String = m.Get(\"Mensaje\")";
Debug.ShouldStop(4);
_mensaje = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Mensaje")))));Debug.locals.put("Mensaje", _mensaje);Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 965;BA.debugLine="If EsCorrecto Then";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 13;
if (_escorrecto.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 966;BA.debugLine="etiqueta_ZPL = Etiqueta";
Debug.ShouldStop(32);
parent.mostCurrent._etiqueta_zpl = _etiqueta;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 968;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(128);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 970;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
Debug.ShouldStop(512);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 971;BA.debugLine="Msgbox2Async(\"Error creando la etiqueta.\", \"Err";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error creando la etiqueta.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 972;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "combo_impresion_selectedindexchanged"), null);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 974;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8192);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 978;BA.debugLine="Log(\"Error en la petición HTTP\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64128794",RemoteObject.createImmutable("Error en la petición HTTP"),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 981;BA.debugLine="Js2.Release";
Debug.ShouldStop(1048576);
_js2.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 982;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _combo_tipobusqueda_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("Combo_TipoBusqueda_SelectedIndexChanged (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,984);
if (RapidSub.canDelegate("combo_tipobusqueda_selectedindexchanged")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","combo_tipobusqueda_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 984;BA.debugLine="Private Sub Combo_TipoBusqueda_SelectedIndexChange";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 985;BA.debugLine="selectedString = Combo_TipoBusqueda.GetItem(Index";
Debug.ShouldStop(16777216);
frm_impresion.mostCurrent._selectedstring = frm_impresion.mostCurrent._combo_tipobusqueda.runClassMethod (BaKapp.Movil.Tag.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_index));
 BA.debugLineNum = 986;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearzplbodega(RemoteObject _cod,RemoteObject _desc,RemoteObject _fech,RemoteObject _titulo) throws Exception{
try {
		Debug.PushSubsStack("CrearZPLBodega (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,738);
if (RapidSub.canDelegate("crearzplbodega")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","crearzplbodega", _cod, _desc, _fech, _titulo);}
RemoteObject _cpcl = RemoteObject.createImmutable("");
Debug.locals.put("Cod", _cod);
Debug.locals.put("Desc", _desc);
Debug.locals.put("Fech", _fech);
Debug.locals.put("Titulo", _titulo);
 BA.debugLineNum = 738;BA.debugLine="Sub CrearZPLBodega(Cod As String, Desc As String,";
Debug.ShouldStop(2);
 BA.debugLineNum = 739;BA.debugLine="Dim CPCL As String";
Debug.ShouldStop(4);
_cpcl = RemoteObject.createImmutable("");Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 740;BA.debugLine="CPCL = $\"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^";
Debug.ShouldStop(8);
_cpcl = (RemoteObject.concat(RemoteObject.createImmutable("^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ\n"),RemoteObject.createImmutable("^XA\n"),RemoteObject.createImmutable("^MMT\n"),RemoteObject.createImmutable("^PW432\n"),RemoteObject.createImmutable("^LL0240\n"),RemoteObject.createImmutable("^LS0\n"),RemoteObject.createImmutable("^BY2,3,48^FT51,100^BCN,,Y,N\n"),RemoteObject.createImmutable("^FD>:<Codigo>^FS\n"),RemoteObject.createImmutable("^FT18,29^A0N,18,43^FH\\^FD<Titulo>^FS\n"),RemoteObject.createImmutable("^FT18,151^A0N,14,14^FH\\^FD<Desc1>^FS\n"),RemoteObject.createImmutable("^FT18,172^A0N,14,14^FH\\^FD<Desc2>^FS\n"),RemoteObject.createImmutable("^FT141,219^A0N,18,33^FH\\^FD<Fecha>^FS\n"),RemoteObject.createImmutable("^PQ1,0,1,Y^XZ\n"),RemoteObject.createImmutable("")));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 755;BA.debugLine="CPCL = CPCL.Replace(\"<Codigo>\", Cod)";
Debug.ShouldStop(262144);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Codigo>")),(Object)(_cod));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 756;BA.debugLine="CPCL = CPCL.Replace(\"<Titulo>\", Titulo)";
Debug.ShouldStop(524288);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Titulo>")),(Object)(_titulo));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 757;BA.debugLine="CPCL = CPCL.Replace(\"<Fecha>\", Fech)";
Debug.ShouldStop(1048576);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Fecha>")),(Object)(_fech));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 758;BA.debugLine="CPCL = CPCL.Replace(\"<Desc1>\", Desc)";
Debug.ShouldStop(2097152);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Desc1>")),(Object)(_desc));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 759;BA.debugLine="CPCL = CPCL.Replace(\"ñ\",\"n\")";
Debug.ShouldStop(4194304);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("ñ")),(Object)(RemoteObject.createImmutable("n")));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 760;BA.debugLine="CPCL = CPCL.Replace(\"Ñ\",\"N\")";
Debug.ShouldStop(8388608);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("Ñ")),(Object)(RemoteObject.createImmutable("N")));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 762;BA.debugLine="Return CPCL";
Debug.ShouldStop(33554432);
if (true) return _cpcl;
 BA.debugLineNum = 763;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearzplventa(RemoteObject _cod,RemoteObject _desc,RemoteObject _dinero,RemoteObject _fech,RemoteObject _nom,RemoteObject _sb) throws Exception{
try {
		Debug.PushSubsStack("CrearZPLVenta (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,688);
if (RapidSub.canDelegate("crearzplventa")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","crearzplventa", _cod, _desc, _dinero, _fech, _nom, _sb);}
RemoteObject _cpcl = RemoteObject.createImmutable("");
Debug.locals.put("Cod", _cod);
Debug.locals.put("Desc", _desc);
Debug.locals.put("Dinero", _dinero);
Debug.locals.put("Fech", _fech);
Debug.locals.put("Nom", _nom);
Debug.locals.put("Sb", _sb);
 BA.debugLineNum = 688;BA.debugLine="Sub CrearZPLVenta(Cod As String, Desc As String, D";
Debug.ShouldStop(32768);
 BA.debugLineNum = 690;BA.debugLine="Dim CPCL As String";
Debug.ShouldStop(131072);
_cpcl = RemoteObject.createImmutable("");Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 691;BA.debugLine="CPCL = $\"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^";
Debug.ShouldStop(262144);
_cpcl = (RemoteObject.concat(RemoteObject.createImmutable("^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ\n"),RemoteObject.createImmutable("^XA\n"),RemoteObject.createImmutable("^MMT\n"),RemoteObject.createImmutable("^PW432\n"),RemoteObject.createImmutable("^LL0240\n"),RemoteObject.createImmutable("^LS0\n"),RemoteObject.createImmutable("^FT17,38^A0N,34,33^FH\\^FD<Nom>^FS\n"),RemoteObject.createImmutable("^FT19,73^A0N,17,16^FH\\^FD<Sb>^FS\n"),RemoteObject.createImmutable("^SL0\n"),RemoteObject.createImmutable("^FT172,232^A0N,31,31\n"),RemoteObject.createImmutable("^FC%,{,#\n"),RemoteObject.createImmutable("^FD%d/%m/%y^FS\n"),RemoteObject.createImmutable("^FT19,128^A0N,44,45^FH\\^FD<Dinero>^FS\n"),RemoteObject.createImmutable("^FT19,166^A0N,17,14^FH\\^FD<Desc>^FS\n"),RemoteObject.createImmutable("^FT19,197^A0N,17,14^FH\\^FD<Cod>^FS\n"),RemoteObject.createImmutable("^PQ1,0,1,Y^XZ")));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 727;BA.debugLine="CPCL = CPCL.Replace(\"<Nom>\",Nom)";
Debug.ShouldStop(4194304);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Nom>")),(Object)(_nom));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 728;BA.debugLine="CPCL = CPCL.Replace(\"<Dinero>\",Dinero)";
Debug.ShouldStop(8388608);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Dinero>")),(Object)(_dinero));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 729;BA.debugLine="CPCL = CPCL.Replace(\"<Fecha>\",Fech)";
Debug.ShouldStop(16777216);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Fecha>")),(Object)(_fech));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 730;BA.debugLine="CPCL = CPCL.Replace(\"<Desc>\",Desc)";
Debug.ShouldStop(33554432);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Desc>")),(Object)(_desc));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 731;BA.debugLine="CPCL = CPCL.Replace(\"<Cod>\",Cod)";
Debug.ShouldStop(67108864);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Cod>")),(Object)(_cod));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 732;BA.debugLine="CPCL = CPCL.Replace(\"<Sb>\",Sb)";
Debug.ShouldStop(134217728);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("<Sb>")),(Object)(_sb));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 733;BA.debugLine="CPCL = CPCL.Replace(\"ñ\",\"n\")";
Debug.ShouldStop(268435456);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("ñ")),(Object)(RemoteObject.createImmutable("n")));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 734;BA.debugLine="CPCL = CPCL.Replace(\"Ñ\",\"N\")";
Debug.ShouldStop(536870912);
_cpcl = _cpcl.runMethod(true,"replace",(Object)(BA.ObjectToString("Ñ")),(Object)(RemoteObject.createImmutable("N")));Debug.locals.put("CPCL", _cpcl);
 BA.debugLineNum = 736;BA.debugLine="Return CPCL";
Debug.ShouldStop(-2147483648);
if (true) return _cpcl;
 BA.debugLineNum = 737;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _enviarcalibrar(RemoteObject _zpl) throws Exception{
try {
		Debug.PushSubsStack("EnviarCalibrar (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,826);
if (RapidSub.canDelegate("enviarcalibrar")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","enviarcalibrar", _zpl); return;}
ResumableSub_EnviarCalibrar rsub = new ResumableSub_EnviarCalibrar(null,_zpl);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EnviarCalibrar extends BA.ResumableSub {
public ResumableSub_EnviarCalibrar(BaKapp.Movil.Tag.frm_impresion parent,RemoteObject _zpl) {
this.parent = parent;
this._zpl = _zpl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _zpl;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _residuales = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarCalibrar (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,826);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("ZPL", _zpl);
 BA.debugLineNum = 827;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(67108864);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 828;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//try
this.state = 28;
this.catchState = 23;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 23;
 BA.debugLineNum = 833;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent._connectedprinter.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 834;BA.debugLine="If ConnectedPrinter.Connected Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._connectedprinter.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 835;BA.debugLine="ConnectedPrinter.Close";
Debug.ShouldStop(4);
parent.mostCurrent._connectedprinter.runVoidMethod ("Close");
 BA.debugLineNum = 836;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63997706",RemoteObject.createImmutable("Conexión anterior cerrada."),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 841;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
Debug.ShouldStop(256);
parent.mostCurrent._connectedprinter.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("ConnectedPrinter")));
 BA.debugLineNum = 842;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
Debug.ShouldStop(512);
parent.mostCurrent._connectedprinter.runVoidMethod ("Connect",frm_impresion.processBA,(Object)(parent.mostCurrent._printerip),(Object)(parent._printerport),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 844;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","connectedprinter_connected", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviarcalibrar"), null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 845;BA.debugLine="If Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 12:
//if
this.state = 21;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 20;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 846;BA.debugLine="Log(\"Conectado a la impresora.\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63997716",RemoteObject.createImmutable("Conectado a la impresora."),0);
 BA.debugLineNum = 847;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_impresion.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Mandando a impresión..."))));
 BA.debugLineNum = 850;BA.debugLine="If AStreams.IsInitialized Then";
Debug.ShouldStop(131072);
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent._astreams.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 851;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
Debug.ShouldStop(262144);
parent.mostCurrent._astreams.runVoidMethod ("Close");
 if (true) break;

case 18:
//C
this.state = 21;
;
 BA.debugLineNum = 853;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
Debug.ShouldStop(1048576);
parent.mostCurrent._astreams.runVoidMethod ("Initialize",frm_impresion.processBA,(Object)(parent.mostCurrent._connectedprinter.runMethod(false,"getInputStream")),(Object)(parent.mostCurrent._connectedprinter.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 854;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
Debug.ShouldStop(2097152);
_residuales = BA.ObjectToString("^XA^IDR:*.*^XZ");Debug.locals.put("residuales", _residuales);Debug.locals.put("residuales", _residuales);
 BA.debugLineNum = 855;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
Debug.ShouldStop(4194304);
parent.mostCurrent._astreams.runVoidMethod ("Write",(Object)(_residuales.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 857;BA.debugLine="AStreams.Write(ZPL.GetBytes(\"UTF8\"))";
Debug.ShouldStop(16777216);
parent.mostCurrent._astreams.runVoidMethod ("Write",(Object)(_zpl.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 858;BA.debugLine="Log(\"Impresora Calibrada Exitosamente.\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63997728",RemoteObject.createImmutable("Impresora Calibrada Exitosamente."),0);
 BA.debugLineNum = 859;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 860;BA.debugLine="ToastMessageShow(\"Calibración completa\",False)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Calibración completa")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 863;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 864;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63997734",RemoteObject.createImmutable("Error al conectar con la impresora."),0);
 BA.debugLineNum = 865;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(1);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 866;BA.debugLine="Msgbox2Async(\"Error de comandos\" , \"Error al ca";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de comandos")),(Object)(BA.ObjectToCharSequence("Error al calibrar")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 867;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviarcalibrar"), null);
this.state = 30;
return;
case 30:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 21:
//C
this.state = 28;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 870;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 871;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63997741",RemoteObject.concat(RemoteObject.createImmutable("Error al enviar la etiqueta: "),parent.mostCurrent.__c.runMethod(false,"LastException",frm_impresion.mostCurrent.activityBA).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 872;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(128);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 873;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error de impresión: "),parent.mostCurrent.__c.runMethod(false,"LastException",frm_impresion.mostCurrent.activityBA).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 874;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviarcalibrar"), null);
this.state = 31;
return;
case 31:
//C
this.state = 24;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 877;BA.debugLine="If ConnectedPrinter.Connected Then";
Debug.ShouldStop(4096);
if (true) break;

case 24:
//if
this.state = 27;
if (parent.mostCurrent._connectedprinter.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 878;BA.debugLine="ConnectedPrinter.Close";
Debug.ShouldStop(8192);
parent.mostCurrent._connectedprinter.runVoidMethod ("Close");
 BA.debugLineNum = 879;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63997749",RemoteObject.createImmutable("Conexión cerrada después de enviar."),0);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 882;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_impresion.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _connectedprinter_connected(RemoteObject _success) throws Exception{
}
public static void  _enviaretiqueta(RemoteObject _zpl) throws Exception{
try {
		Debug.PushSubsStack("EnviarEtiqueta (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,886);
if (RapidSub.canDelegate("enviaretiqueta")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","enviaretiqueta", _zpl); return;}
ResumableSub_EnviarEtiqueta rsub = new ResumableSub_EnviarEtiqueta(null,_zpl);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EnviarEtiqueta extends BA.ResumableSub {
public ResumableSub_EnviarEtiqueta(BaKapp.Movil.Tag.frm_impresion parent,RemoteObject _zpl) {
this.parent = parent;
this._zpl = _zpl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _zpl;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _fechaactual = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _residuales = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
int step20;
int limit20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarEtiqueta (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,886);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("zpl", _zpl);
 BA.debugLineNum = 887;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4194304);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 888;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 27;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 27;
 BA.debugLineNum = 889;BA.debugLine="Dim FechaActual As String";
Debug.ShouldStop(16777216);
_fechaactual = RemoteObject.createImmutable("");Debug.locals.put("FechaActual", _fechaactual);
 BA.debugLineNum = 890;BA.debugLine="ProgressDialogShow(\"Imprimiendo etiquetas\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_impresion.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Imprimiendo etiquetas"))));
 BA.debugLineNum = 897;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent._connectedprinter.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 898;BA.debugLine="If ConnectedPrinter.Connected Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._connectedprinter.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 899;BA.debugLine="ConnectedPrinter.Close";
Debug.ShouldStop(4);
parent.mostCurrent._connectedprinter.runVoidMethod ("Close");
 BA.debugLineNum = 900;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64063246",RemoteObject.createImmutable("Conexión anterior cerrada."),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 905;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
Debug.ShouldStop(256);
parent.mostCurrent._connectedprinter.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("ConnectedPrinter")));
 BA.debugLineNum = 906;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
Debug.ShouldStop(512);
parent.mostCurrent._connectedprinter.runVoidMethod ("Connect",frm_impresion.processBA,(Object)(parent.mostCurrent._printerip),(Object)(parent._printerport),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 908;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","connectedprinter_connected", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiqueta"), null);
this.state = 33;
return;
case 33:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 909;BA.debugLine="If Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 12:
//if
this.state = 25;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 24;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 910;BA.debugLine="Log(\"Conectado a la impresora.\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64063256",RemoteObject.createImmutable("Conectado a la impresora."),0);
 BA.debugLineNum = 913;BA.debugLine="If AStreams.IsInitialized Then";
Debug.ShouldStop(65536);
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent._astreams.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 914;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
Debug.ShouldStop(131072);
parent.mostCurrent._astreams.runVoidMethod ("Close");
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 916;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
Debug.ShouldStop(524288);
parent.mostCurrent._astreams.runVoidMethod ("Initialize",frm_impresion.processBA,(Object)(parent.mostCurrent._connectedprinter.runMethod(false,"getInputStream")),(Object)(parent.mostCurrent._connectedprinter.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 917;BA.debugLine="For i = 1 To cantidad";
Debug.ShouldStop(1048576);
if (true) break;

case 19:
//for
this.state = 22;
step20 = 1;
limit20 = parent._cantidad.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 34;
if (true) break;

case 34:
//C
this.state = 22;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 21;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step20)) ;
Debug.locals.put("i", _i);
if (true) break;

case 21:
//C
this.state = 35;
 BA.debugLineNum = 918;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
Debug.ShouldStop(2097152);
_residuales = BA.ObjectToString("^XA^IDR:*.*^XZ");Debug.locals.put("residuales", _residuales);Debug.locals.put("residuales", _residuales);
 BA.debugLineNum = 919;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
Debug.ShouldStop(4194304);
parent.mostCurrent._astreams.runVoidMethod ("Write",(Object)(_residuales.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 921;BA.debugLine="AStreams.Write(zpl.GetBytes(\"UTF8\"))";
Debug.ShouldStop(16777216);
parent.mostCurrent._astreams.runVoidMethod ("Write",(Object)(_zpl.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 922;BA.debugLine="Log(\"Etiqueta enviada exitosamente.\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64063268",RemoteObject.createImmutable("Etiqueta enviada exitosamente."),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 925;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 926;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
Debug.ShouldStop(536870912);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 927;BA.debugLine="ToastMessageShow(\"impresión exitosa\",False)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("impresión exitosa")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 930;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 931;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64063277",RemoteObject.createImmutable("Error al conectar con la impresora."),0);
 BA.debugLineNum = 932;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(8);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 933;BA.debugLine="Msgbox2Async(\"Error de impresión\" , \"Error al i";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de impresión")),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 934;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiqueta"), null);
this.state = 36;
return;
case 36:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 25:
//C
this.state = 32;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
 BA.debugLineNum = 937;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 938;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64063284",RemoteObject.concat(RemoteObject.createImmutable("Error al enviar la etiqueta: "),parent.mostCurrent.__c.runMethod(false,"LastException",frm_impresion.mostCurrent.activityBA).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 939;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(1024);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 940;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error de impresión: "),parent.mostCurrent.__c.runMethod(false,"LastException",frm_impresion.mostCurrent.activityBA).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 941;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiqueta"), null);
this.state = 37;
return;
case 37:
//C
this.state = 28;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 944;BA.debugLine="If ConnectedPrinter.Connected Then";
Debug.ShouldStop(32768);
if (true) break;

case 28:
//if
this.state = 31;
if (parent.mostCurrent._connectedprinter.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 945;BA.debugLine="ConnectedPrinter.Close";
Debug.ShouldStop(65536);
parent.mostCurrent._connectedprinter.runVoidMethod ("Close");
 BA.debugLineNum = 946;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","64063292",RemoteObject.createImmutable("Conexión cerrada después de enviar."),0);
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 949;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_impresion.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _enviaretiquetazpl(RemoteObject _zpl) throws Exception{
try {
		Debug.PushSubsStack("EnviarEtiquetaZPL (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,765);
if (RapidSub.canDelegate("enviaretiquetazpl")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","enviaretiquetazpl", _zpl); return;}
ResumableSub_EnviarEtiquetaZPL rsub = new ResumableSub_EnviarEtiquetaZPL(null,_zpl);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EnviarEtiquetaZPL extends BA.ResumableSub {
public ResumableSub_EnviarEtiquetaZPL(BaKapp.Movil.Tag.frm_impresion parent,RemoteObject _zpl) {
this.parent = parent;
this._zpl = _zpl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _zpl;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _residuales = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarEtiquetaZPL (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,765);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("ZPL", _zpl);
 BA.debugLineNum = 766;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(536870912);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 767;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//try
this.state = 28;
this.catchState = 23;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 23;
 BA.debugLineNum = 772;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent._connectedprinter.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 773;BA.debugLine="If ConnectedPrinter.Connected Then";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._connectedprinter.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 774;BA.debugLine="ConnectedPrinter.Close";
Debug.ShouldStop(32);
parent.mostCurrent._connectedprinter.runVoidMethod ("Close");
 BA.debugLineNum = 775;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63932170",RemoteObject.createImmutable("Conexión anterior cerrada."),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 780;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
Debug.ShouldStop(2048);
parent.mostCurrent._connectedprinter.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("ConnectedPrinter")));
 BA.debugLineNum = 781;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
Debug.ShouldStop(4096);
parent.mostCurrent._connectedprinter.runVoidMethod ("Connect",frm_impresion.processBA,(Object)(parent.mostCurrent._printerip),(Object)(parent._printerport),(Object)(BA.numberCast(int.class, 5000)));
 BA.debugLineNum = 783;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","connectedprinter_connected", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 784;BA.debugLine="If Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 12:
//if
this.state = 21;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 20;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 785;BA.debugLine="Log(\"Conectado a la impresora.\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63932180",RemoteObject.createImmutable("Conectado a la impresora."),0);
 BA.debugLineNum = 786;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_impresion.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Mandando a impresión..."))));
 BA.debugLineNum = 789;BA.debugLine="If AStreams.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent._astreams.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 790;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
Debug.ShouldStop(2097152);
parent.mostCurrent._astreams.runVoidMethod ("Close");
 if (true) break;

case 18:
//C
this.state = 21;
;
 BA.debugLineNum = 793;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStre";
Debug.ShouldStop(16777216);
parent.mostCurrent._astreams.runVoidMethod ("Initialize",frm_impresion.processBA,(Object)(parent.mostCurrent._connectedprinter.runMethod(false,"getInputStream")),(Object)(parent.mostCurrent._connectedprinter.runMethod(false,"getOutputStream")),(Object)(RemoteObject.createImmutable("AStreams")));
 BA.debugLineNum = 794;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
Debug.ShouldStop(33554432);
_residuales = BA.ObjectToString("^XA^IDR:*.*^XZ");Debug.locals.put("residuales", _residuales);Debug.locals.put("residuales", _residuales);
 BA.debugLineNum = 795;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
Debug.ShouldStop(67108864);
parent.mostCurrent._astreams.runVoidMethod ("Write",(Object)(_residuales.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 797;BA.debugLine="AStreams.Write(ZPL.GetBytes(\"UTF8\"))";
Debug.ShouldStop(268435456);
parent.mostCurrent._astreams.runVoidMethod ("Write",(Object)(_zpl.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 798;BA.debugLine="Log(\"Etiqueta enviada exitosamente.\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63932193",RemoteObject.createImmutable("Etiqueta enviada exitosamente."),0);
 BA.debugLineNum = 801;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 802;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
Debug.ShouldStop(2);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 803;BA.debugLine="Msgbox2Async(\"Se ha impreso la etiqueta\",\"Impre";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Se ha impreso la etiqueta")),(Object)(BA.ObjectToCharSequence("Impresión exitosa")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 804;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 30;
return;
case 30:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 806;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 807;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63932202",RemoteObject.createImmutable("Error al conectar con la impresora."),0);
 BA.debugLineNum = 808;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(128);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 809;BA.debugLine="Msgbox2Async(\"Error de impresión\" , \"Error al i";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de impresión")),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 810;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 21:
//C
this.state = 28;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 813;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 814;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63932209",RemoteObject.concat(RemoteObject.createImmutable("Error al enviar la etiqueta: "),parent.mostCurrent.__c.runMethod(false,"LastException",frm_impresion.mostCurrent.activityBA).runMethod(true,"getMessage")),0);
 BA.debugLineNum = 815;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(16384);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 816;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error de impresión: "),parent.mostCurrent.__c.runMethod(false,"LastException",frm_impresion.mostCurrent.activityBA).runMethod(true,"getMessage")))),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 817;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 820;BA.debugLine="If ConnectedPrinter.Connected Then";
Debug.ShouldStop(524288);
if (true) break;

case 24:
//if
this.state = 27;
if (parent.mostCurrent._connectedprinter.runMethod(true,"getConnected").<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 821;BA.debugLine="ConnectedPrinter.Close";
Debug.ShouldStop(1048576);
parent.mostCurrent._connectedprinter.runVoidMethod ("Close");
 BA.debugLineNum = 822;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63932217",RemoteObject.createImmutable("Conexión cerrada después de enviar."),0);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_impresion.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _formatearmiles(RemoteObject _numero) throws Exception{
try {
		Debug.PushSubsStack("FormatearMiles (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,473);
if (RapidSub.canDelegate("formatearmiles")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","formatearmiles", _numero);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _contador = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("numero", _numero);
 BA.debugLineNum = 473;BA.debugLine="Sub FormatearMiles(numero As String) As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 475;BA.debugLine="numero = numero.Replace(\",\", \"\").Replace(\".\", \"\")";
Debug.ShouldStop(67108864);
_numero = _numero.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString(".")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"trim");Debug.locals.put("numero", _numero);
 BA.debugLineNum = 477;BA.debugLine="If numero.Length = 0 Then Return \"\"";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_numero.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 479;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1073741824);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 480;BA.debugLine="sb.Initialize";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 482;BA.debugLine="Dim contador As Int = 0";
Debug.ShouldStop(2);
_contador = BA.numberCast(int.class, 0);Debug.locals.put("contador", _contador);Debug.locals.put("contador", _contador);
 BA.debugLineNum = 483;BA.debugLine="For i = numero.Length - 1 To 0 Step -1";
Debug.ShouldStop(4);
{
final int step6 = -1;
final int limit6 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_numero.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 484;BA.debugLine="sb.Insert(0, numero.CharAt(i))";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Insert",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString(_numero.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 485;BA.debugLine="contador = contador + 1";
Debug.ShouldStop(16);
_contador = RemoteObject.solve(new RemoteObject[] {_contador,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("contador", _contador);
 BA.debugLineNum = 486;BA.debugLine="If contador Mod 3 = 0 And i > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_contador,RemoteObject.createImmutable(3)}, "%",0, 1),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 487;BA.debugLine="sb.Insert(0, \".\")";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Insert",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable(".")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 491;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(1024);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private tip As String";
frm_impresion.mostCurrent._tip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Private Ancho As Float = 2";
frm_impresion._ancho = BA.numberCast(float.class, 2);
 //BA.debugLineNum = 28;BA.debugLine="Dim IME1 As IME";
frm_impresion.mostCurrent._ime1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 29;BA.debugLine="Private Alto As Float = 1.6";
frm_impresion._alto = BA.numberCast(float.class, 1.6);
 //BA.debugLineNum = 30;BA.debugLine="Private Btn_Buscar As Button";
frm_impresion.mostCurrent._btn_buscar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Panelinfo As Panel";
frm_impresion.mostCurrent._panelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Btn_BuscarProd As Button";
frm_impresion.mostCurrent._btn_buscarprod = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Panel_Buscador As Panel";
frm_impresion.mostCurrent._panel_buscador = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private YaBusco As Boolean = False";
frm_impresion._yabusco = frm_impresion.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 35;BA.debugLine="Private ListView1 As ListView";
frm_impresion.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private EditText1 As EditText";
frm_impresion.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
frm_impresion.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xcombobox");
 //BA.debugLineNum = 38;BA.debugLine="Private Btn_CerrarBuscador As Button";
frm_impresion.mostCurrent._btn_cerrarbuscador = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private selectedString As String";
frm_impresion.mostCurrent._selectedstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Private Txt_codigo As EditText";
frm_impresion.mostCurrent._txt_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Lbl_tipo As Label";
frm_impresion.mostCurrent._lbl_tipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Lbl_codigo As Label";
frm_impresion.mostCurrent._lbl_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Lbl_Desc As Label";
frm_impresion.mostCurrent._lbl_desc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private cantidad As Int";
frm_impresion._cantidad = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 45;BA.debugLine="Private Lbl_precio As Label";
frm_impresion.mostCurrent._lbl_precio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Btn_imprimir As Button";
frm_impresion.mostCurrent._btn_imprimir = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Serial1 As Serial";
frm_impresion.mostCurrent._serial1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial");
 //BA.debugLineNum = 48;BA.debugLine="Private ConnectedPrinter As Socket";
frm_impresion.mostCurrent._connectedprinter = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private PrinterIP As String  ' Dirección IP de la";
frm_impresion.mostCurrent._printerip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 50;BA.debugLine="Private PrinterPort As Int = 9100  ' Puerto están";
frm_impresion._printerport = BA.numberCast(int.class, 9100);
 //BA.debugLineNum = 51;BA.debugLine="Private AStreams As AsyncStreams  ' Manejo de flu";
frm_impresion.mostCurrent._astreams = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 52;BA.debugLine="Private Combo_Impresion As B4XComboBox";
frm_impresion.mostCurrent._combo_impresion = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xcombobox");
 //BA.debugLineNum = 53;BA.debugLine="Private Combo_TipoBusqueda As B4XComboBox";
frm_impresion.mostCurrent._combo_tipobusqueda = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xcombobox");
 //BA.debugLineNum = 54;BA.debugLine="Private Btn_Volver As Button";
frm_impresion.mostCurrent._btn_volver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Dim datos As Map";
frm_impresion.mostCurrent._datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 56;BA.debugLine="Dim SelectedPrice As Int";
frm_impresion._selectedprice = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 57;BA.debugLine="Dim stringPrecio1 As String";
frm_impresion.mostCurrent._stringprecio1 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Private Combo_precios As B4XComboBox";
frm_impresion.mostCurrent._combo_precios = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xcombobox");
 //BA.debugLineNum = 59;BA.debugLine="Private PanelVista As Panel";
frm_impresion.mostCurrent._panelvista = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private WebView1 As WebView";
frm_impresion.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private ImageView1 As ImageView";
frm_impresion.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Dim Etiquetas As List";
frm_impresion.mostCurrent._etiquetas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 63;BA.debugLine="Dim etiqueta_ZPL As String";
frm_impresion.mostCurrent._etiqueta_zpl = RemoteObject.createImmutable("");
 //BA.debugLineNum = 64;BA.debugLine="Private B4XPlusMinus1 As B4XPlusMinus";
frm_impresion.mostCurrent._b4xplusminus1 = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xplusminus");
 //BA.debugLineNum = 65;BA.debugLine="Private Spinner_cant As Spinner";
frm_impresion.mostCurrent._spinner_cant = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Btn_limpiar As Button";
frm_impresion.mostCurrent._btn_limpiar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _leerdatos() throws Exception{
try {
		Debug.PushSubsStack("LeerDatos (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,207);
if (RapidSub.canDelegate("leerdatos")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","leerdatos");}
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 207;BA.debugLine="Sub LeerDatos()";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
Debug.ShouldStop(32768);
if (frm_impresion.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(frm_impresion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("impresora.map"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 209;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
Debug.ShouldStop(65536);
frm_impresion.mostCurrent._datos = frm_impresion.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(frm_impresion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("impresora.map")));
 BA.debugLineNum = 210;BA.debugLine="PrinterIP = datos.Get(\"Ip\")";
Debug.ShouldStop(131072);
frm_impresion.mostCurrent._printerip = BA.ObjectToString(frm_impresion.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ip")))));
 BA.debugLineNum = 211;BA.debugLine="stringPrecio1 = datos.Get(\"KOLT\")";
Debug.ShouldStop(262144);
frm_impresion.mostCurrent._stringprecio1 = BA.ObjectToString(frm_impresion.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOLT")))));
 BA.debugLineNum = 212;BA.debugLine="PrinterPort = datos.Get(\"Puerto\")";
Debug.ShouldStop(524288);
frm_impresion._printerport = BA.numberCast(int.class, frm_impresion.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Puerto")))));
 }else {
 BA.debugLineNum = 215;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4194304);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 216;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
Debug.ShouldStop(8388608);
_bmp1 = frm_impresion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_impresion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 217;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
Debug.ShouldStop(16777216);
frm_impresion.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora.")),(Object)(BA.ObjectToCharSequence("Alerta")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(frm_impresion.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 219;BA.debugLine="Log(\"El archivo no existe.\")";
Debug.ShouldStop(67108864);
frm_impresion.mostCurrent.__c.runVoidMethod ("LogImpl","62424844",RemoteObject.createImmutable("El archivo no existe."),0);
 BA.debugLineNum = 220;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
Debug.ShouldStop(134217728);
frm_impresion.mostCurrent._datos.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,402);
if (RapidSub.canDelegate("listview1_itemclick")) { BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","listview1_itemclick", _position, _value); return;}
ResumableSub_ListView1_ItemClick rsub = new ResumableSub_ListView1_ItemClick(null,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListView1_ItemClick extends BA.ResumableSub {
public ResumableSub_ListView1_ItemClick(BaKapp.Movil.Tag.frm_impresion parent,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_impresion parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _selecteddata = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._tabledata");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result5 = RemoteObject.createImmutable(0);
RemoteObject _js2 = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _escorrecto = RemoteObject.createImmutable(false);
RemoteObject _etiqueta = RemoteObject.createImmutable("");
RemoteObject _mensaje = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,402);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 403;BA.debugLine="Dim selectedData As TableData = DataList.Get(Posi";
Debug.ShouldStop(262144);
_selecteddata = (parent._datalist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("selectedData", _selecteddata);Debug.locals.put("selectedData", _selecteddata);
 BA.debugLineNum = 404;BA.debugLine="ProgressDialogShow2(\"Rellenando la etiqueta\", Fal";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",frm_impresion.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Rellenando la etiqueta")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 405;BA.debugLine="Dim Js As HttpJob = Bsc(\"Principal\",selectedData.";
Debug.ShouldStop(1048576);
_js = _bsc(BA.ObjectToString("Principal"),_selecteddata.getField(true,"CODIGO" /*RemoteObject*/ ),frm_impresion.getObject(),parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ,parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ,parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ ,parent.mostCurrent._stringprecio1);Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 406;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "listview1_itemclick"), (_js));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 408;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 12;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 410;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(33554432);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 412;BA.debugLine="If  vJson = $\"{\"Table\":[{\"Codigo\":\"Error_No hay";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[{\"Codigo\":\"Error_No hay ninguna fila en la posición 0.\",\"Version\":\"1.0.0.35\"}]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 413;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 414;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(536870912);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 416;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
Debug.ShouldStop(-2147483648);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 417;BA.debugLine="Msgbox2Async(\"Producto no encontrado en la base";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Producto no encontrado en la base de datos.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 418;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "listview1_itemclick"), null);
this.state = 34;
return;
case 34:
//C
this.state = 7;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 420;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 423;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 426;BA.debugLine="ParseOtherJSON(Js.GetString)";
Debug.ShouldStop(512);
_parseotherjson(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ ));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 428;BA.debugLine="Btn_Buscar.Visible= True";
Debug.ShouldStop(2048);
parent.mostCurrent._btn_buscar.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 429;BA.debugLine="Panelinfo.Visible = True";
Debug.ShouldStop(4096);
parent.mostCurrent._panelinfo.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 430;BA.debugLine="Panel_Buscador.Visible = False";
Debug.ShouldStop(8192);
parent.mostCurrent._panel_buscador.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 431;BA.debugLine="Lbl_codigo.Text = ObjSelec.Principal";
Debug.ShouldStop(16384);
parent.mostCurrent._lbl_codigo.runMethod(true,"setText",BA.ObjectToCharSequence(parent._objselec.getField(true,"Principal" /*RemoteObject*/ )));
 BA.debugLineNum = 432;BA.debugLine="Lbl_Desc.Text = ObjSelec.Descripcion";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_desc.runMethod(true,"setText",BA.ObjectToCharSequence(parent._objselec.getField(true,"Descripcion" /*RemoteObject*/ )));
 BA.debugLineNum = 433;BA.debugLine="Lbl_precio.Text = stringPrecio1";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_precio.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._stringprecio1));
 BA.debugLineNum = 435;BA.debugLine="Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me";
Debug.ShouldStop(262144);
_js2 = _sb_imprimiretiquetazpl_01(frm_impresion.getObject(),parent._objselec.getField(true,"Principal" /*RemoteObject*/ ));Debug.locals.put("Js2", _js2);Debug.locals.put("Js2", _js2);
 BA.debugLineNum = 436;BA.debugLine="Wait For (Js2) JobDone(Js2 As HttpJob)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "listview1_itemclick"), (_js2));
this.state = 35;
return;
case 35:
//C
this.state = 13;
_js2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js2", _js2);
;
 BA.debugLineNum = 438;BA.debugLine="If Js2.Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//if
this.state = 32;
if (_js2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 27;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 439;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 440;BA.debugLine="parser.Initialize(Js2.GetString)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_js2.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 442;BA.debugLine="Dim m As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 443;BA.debugLine="Dim EsCorrecto As Boolean = m.Get(\"EsCorrecto\")";
Debug.ShouldStop(67108864);
_escorrecto = BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EsCorrecto")))));Debug.locals.put("EsCorrecto", _escorrecto);Debug.locals.put("EsCorrecto", _escorrecto);
 BA.debugLineNum = 444;BA.debugLine="Dim Etiqueta As String = m.Get(\"Etiqueta\")";
Debug.ShouldStop(134217728);
_etiqueta = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Etiqueta")))));Debug.locals.put("Etiqueta", _etiqueta);Debug.locals.put("Etiqueta", _etiqueta);
 BA.debugLineNum = 445;BA.debugLine="Dim Mensaje As String = m.Get(\"Mensaje\")";
Debug.ShouldStop(268435456);
_mensaje = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Mensaje")))));Debug.locals.put("Mensaje", _mensaje);Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 446;BA.debugLine="YaBusco = True";
Debug.ShouldStop(536870912);
parent._yabusco = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 447;BA.debugLine="If EsCorrecto Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 16:
//if
this.state = 25;
if (_escorrecto.<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 25;
 BA.debugLineNum = 448;BA.debugLine="etiqueta_ZPL = Etiqueta";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._etiqueta_zpl = _etiqueta;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 450;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(2);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 452;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
Debug.ShouldStop(8);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 453;BA.debugLine="Msgbox2Async(\"Error creando la etiqueta.\", \"Err";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error creando la etiqueta.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 454;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "listview1_itemclick"), null);
this.state = 36;
return;
case 36:
//C
this.state = 21;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 456;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 32;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 460;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
Debug.ShouldStop(2048);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 461;BA.debugLine="Msgbox2Async(\"Error de comunicación.\", \"Error\",";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de comunicación.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_impresion.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 462;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_impresion.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_impresion", "listview1_itemclick"), null);
this.state = 37;
return;
case 37:
//C
this.state = 28;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 464;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (true) break;

case 28:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 466;BA.debugLine="Log(\"Error en la petición HTTP\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","63080256",RemoteObject.createImmutable("Error en la petición HTTP"),0);
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 468;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 470;BA.debugLine="Js2.Release";
Debug.ShouldStop(2097152);
_js2.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _parseetiquetas(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("ParseEtiquetas (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,186);
if (RapidSub.canDelegate("parseetiquetas")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","parseetiquetas", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tablelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._etiqueta");
Debug.locals.put("Json", _json);
 BA.debugLineNum = 186;BA.debugLine="Sub ParseEtiquetas(Json As String ) As List";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 188;BA.debugLine="parser.Initialize(Json)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 189;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 190;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
Debug.ShouldStop(536870912);
_tablelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tablelist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("tableList", _tablelist);Debug.locals.put("tableList", _tablelist);
 BA.debugLineNum = 192;BA.debugLine="Dim result As List";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 193;BA.debugLine="result.Initialize";
Debug.ShouldStop(1);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="For Each entry As Map In tableList";
Debug.ShouldStop(4);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _tablelist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 196;BA.debugLine="Dim data As Etiqueta";
Debug.ShouldStop(8);
_data = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._etiqueta");Debug.locals.put("data", _data);
 BA.debugLineNum = 197;BA.debugLine="data.Initialize";
Debug.ShouldStop(16);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 198;BA.debugLine="data.NombreEtiqueta = entry.Get(\"NombreEtiqueta\"";
Debug.ShouldStop(32);
_data.setField ("NombreEtiqueta" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreEtiqueta"))))));
 BA.debugLineNum = 199;BA.debugLine="data.FUNCION = entry.Get(\"FUNCION\")";
Debug.ShouldStop(64);
_data.setField ("FUNCION" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FUNCION"))))));
 BA.debugLineNum = 202;BA.debugLine="result.Add(data)";
Debug.ShouldStop(512);
_result.runVoidMethod ("Add",(Object)((_data)));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 205;BA.debugLine="Return result";
Debug.ShouldStop(4096);
if (true) return _result;
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsejson(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("ParseJSON (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,284);
if (RapidSub.canDelegate("parsejson")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","parsejson", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tablelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._tabledata");
Debug.locals.put("json", _json);
 BA.debugLineNum = 284;BA.debugLine="Sub ParseJSON(json As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 286;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 287;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 288;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
Debug.ShouldStop(-2147483648);
_tablelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tablelist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("tableList", _tablelist);Debug.locals.put("tableList", _tablelist);
 BA.debugLineNum = 290;BA.debugLine="DataList.Initialize";
Debug.ShouldStop(2);
frm_impresion._datalist.runVoidMethod ("Initialize");
 BA.debugLineNum = 291;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4);
frm_impresion.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 293;BA.debugLine="For Each entry As Map In tableList";
Debug.ShouldStop(16);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _tablelist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 294;BA.debugLine="Dim data As TableData";
Debug.ShouldStop(32);
_data = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._tabledata");Debug.locals.put("data", _data);
 BA.debugLineNum = 295;BA.debugLine="data.Initialize";
Debug.ShouldStop(64);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 296;BA.debugLine="data.CODIGO = entry.Get(\"CODIGO\")";
Debug.ShouldStop(128);
_data.setField ("CODIGO" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODIGO"))))));
 BA.debugLineNum = 297;BA.debugLine="data.CODTECNICO = entry.Get(\"CODTECNICO\")";
Debug.ShouldStop(256);
_data.setField ("CODTECNICO" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODTECNICO"))))));
 BA.debugLineNum = 298;BA.debugLine="data.DESCRIPCION = entry.Get(\"DESCRIPCION\")";
Debug.ShouldStop(512);
_data.setField ("DESCRIPCION" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DESCRIPCION"))))));
 BA.debugLineNum = 299;BA.debugLine="data.MRPR = entry.Get(\"MRPR\")";
Debug.ShouldStop(1024);
_data.setField ("MRPR" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MRPR"))))));
 BA.debugLineNum = 300;BA.debugLine="data.RAPIDO = entry.Get(\"RAPIDO\")";
Debug.ShouldStop(2048);
_data.setField ("RAPIDO" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RAPIDO"))))));
 BA.debugLineNum = 301;BA.debugLine="data.KOPRAL = entry.Get(\"KOPRAL\")";
Debug.ShouldStop(4096);
_data.setField ("KOPRAL" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOPRAL"))))));
 BA.debugLineNum = 303;BA.debugLine="DataList.Add(data)";
Debug.ShouldStop(16384);
frm_impresion._datalist.runVoidMethod ("Add",(Object)((_data)));
 BA.debugLineNum = 309;BA.debugLine="ListView1.AddTwoLinesAndBitmap(\"Codigo: \"&data.C";
Debug.ShouldStop(1048576);
frm_impresion.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Codigo: "),_data.getField(true,"CODIGO" /*RemoteObject*/ )))),(Object)(BA.ObjectToCharSequence(_data.getField(true,"DESCRIPCION" /*RemoteObject*/ ))),(Object)((frm_impresion.mostCurrent.__c.getField(false,"Null"))));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseotherjson(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("ParseOtherJSON (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,313);
if (RapidSub.canDelegate("parseotherjson")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","parseotherjson", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tablelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherdata");
Debug.locals.put("json", _json);
 BA.debugLineNum = 313;BA.debugLine="Sub ParseOtherJSON(json As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 315;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 316;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 317;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
Debug.ShouldStop(268435456);
_tablelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tablelist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("tableList", _tablelist);Debug.locals.put("tableList", _tablelist);
 BA.debugLineNum = 319;BA.debugLine="For Each entry As Map In tableList";
Debug.ShouldStop(1073741824);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = _tablelist;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group5.runMethod(false,"Get",index5));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 320;BA.debugLine="Dim data As OtherData";
Debug.ShouldStop(-2147483648);
_data = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._otherdata");Debug.locals.put("data", _data);
 BA.debugLineNum = 321;BA.debugLine="data.Initialize";
Debug.ShouldStop(1);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 322;BA.debugLine="data.Principal = entry.Get(\"Principal\")";
Debug.ShouldStop(2);
_data.setField ("Principal" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Principal"))))));
 BA.debugLineNum = 323;BA.debugLine="data.Rapido = entry.Get(\"Rapido\")";
Debug.ShouldStop(4);
_data.setField ("Rapido" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rapido"))))));
 BA.debugLineNum = 324;BA.debugLine="data.Tecnico = entry.Get(\"Tecnico\")";
Debug.ShouldStop(8);
_data.setField ("Tecnico" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tecnico"))))));
 BA.debugLineNum = 325;BA.debugLine="data.Rtu = entry.Get(\"Rtu\")";
Debug.ShouldStop(16);
_data.setField ("Rtu" /*RemoteObject*/ ,BA.numberCast(double.class, _entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rtu"))))));
 BA.debugLineNum = 326;BA.debugLine="data.Ud1 = entry.Get(\"Ud1\")";
Debug.ShouldStop(32);
_data.setField ("Ud1" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ud1"))))));
 BA.debugLineNum = 327;BA.debugLine="data.Ud2 = entry.Get(\"Ud2\")";
Debug.ShouldStop(64);
_data.setField ("Ud2" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ud2"))))));
 BA.debugLineNum = 328;BA.debugLine="data.Descripcion = entry.Get(\"Descripcion\")";
Debug.ShouldStop(128);
_data.setField ("Descripcion" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descripcion"))))));
 BA.debugLineNum = 329;BA.debugLine="data.StFisicoUd1 = entry.Get(\"StFisicoUd1\")";
Debug.ShouldStop(256);
_data.setField ("StFisicoUd1" /*RemoteObject*/ ,BA.numberCast(double.class, _entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StFisicoUd1"))))));
 BA.debugLineNum = 330;BA.debugLine="data.StFisicoUd2 = entry.Get(\"StFisicoUd2\")";
Debug.ShouldStop(512);
_data.setField ("StFisicoUd2" /*RemoteObject*/ ,BA.numberCast(double.class, _entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StFisicoUd2"))))));
 BA.debugLineNum = 331;BA.debugLine="data.SuperFamilia = entry.Get(\"SuperFamilia\")";
Debug.ShouldStop(1024);
_data.setField ("SuperFamilia" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SuperFamilia"))))));
 BA.debugLineNum = 332;BA.debugLine="data.NombreSuper = entry.Get(\"NombreSuper\")";
Debug.ShouldStop(2048);
_data.setField ("NombreSuper" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreSuper"))))));
 BA.debugLineNum = 333;BA.debugLine="data.Familia = entry.Get(\"Familia\")";
Debug.ShouldStop(4096);
_data.setField ("Familia" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Familia"))))));
 BA.debugLineNum = 334;BA.debugLine="data.NombreFamilia = entry.Get(\"NombreFamilia\")";
Debug.ShouldStop(8192);
_data.setField ("NombreFamilia" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreFamilia"))))));
 BA.debugLineNum = 335;BA.debugLine="data.SubFamilia = entry.Get(\"SubFamilia\")";
Debug.ShouldStop(16384);
_data.setField ("SubFamilia" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SubFamilia"))))));
 BA.debugLineNum = 336;BA.debugLine="data.NombreSub = entry.Get(\"NombreSub\")";
Debug.ShouldStop(32768);
_data.setField ("NombreSub" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreSub"))))));
 BA.debugLineNum = 337;BA.debugLine="data.MRPR = entry.Get(\"MRPR\")";
Debug.ShouldStop(65536);
_data.setField ("MRPR" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MRPR"))))));
 BA.debugLineNum = 338;BA.debugLine="data.MARCA = entry.Get(\"MARCA\")";
Debug.ShouldStop(131072);
_data.setField ("MARCA" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MARCA"))))));
 BA.debugLineNum = 339;BA.debugLine="data.PrecioListaUd1 = entry.Get(\"PrecioListaUd1\"";
Debug.ShouldStop(262144);
_data.setField ("PrecioListaUd1" /*RemoteObject*/ ,BA.numberCast(double.class, _entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrecioListaUd1"))))));
 BA.debugLineNum = 340;BA.debugLine="data.PrecioListaUd2 = entry.Get(\"PrecioListaUd2\"";
Debug.ShouldStop(524288);
_data.setField ("PrecioListaUd2" /*RemoteObject*/ ,BA.numberCast(double.class, _entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrecioListaUd2"))))));
 BA.debugLineNum = 341;BA.debugLine="ObjSelec = data";
Debug.ShouldStop(1048576);
frm_impresion._objselec = _data;
 BA.debugLineNum = 343;BA.debugLine="Log(\"Producto: \" & data.Descripcion & \" - \" & da";
Debug.ShouldStop(4194304);
frm_impresion.mostCurrent.__c.runVoidMethod ("LogImpl","62818078",RemoteObject.concat(RemoteObject.createImmutable("Producto: "),_data.getField(true,"Descripcion" /*RemoteObject*/ ),RemoteObject.createImmutable(" - "),_data.getField(true,"MARCA" /*RemoteObject*/ )),0);
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseotherpricejson(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("ParseOtherPriceJSON (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,347);
if (RapidSub.canDelegate("parseotherpricejson")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","parseotherpricejson", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tablelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");
Debug.locals.put("json", _json);
 BA.debugLineNum = 347;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(134217728);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 349;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 350;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(536870912);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 351;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
Debug.ShouldStop(1073741824);
_tablelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tablelist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("tableList", _tablelist);Debug.locals.put("tableList", _tablelist);
 BA.debugLineNum = 353;BA.debugLine="Dim result As List";
Debug.ShouldStop(1);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 354;BA.debugLine="result.Initialize";
Debug.ShouldStop(2);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 356;BA.debugLine="For Each entry As Map In tableList";
Debug.ShouldStop(8);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _tablelist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 357;BA.debugLine="Dim data As OtherPriceData";
Debug.ShouldStop(16);
_data = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._otherpricedata");Debug.locals.put("data", _data);
 BA.debugLineNum = 358;BA.debugLine="data.Initialize";
Debug.ShouldStop(32);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 359;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
Debug.ShouldStop(64);
_data.setField ("TILT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TILT"))))));
 BA.debugLineNum = 360;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
Debug.ShouldStop(128);
_data.setField ("KOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOLT"))))));
 BA.debugLineNum = 361;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
Debug.ShouldStop(256);
_data.setField ("MELT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MELT"))))));
 BA.debugLineNum = 362;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
Debug.ShouldStop(512);
_data.setField ("MOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MOLT"))))));
 BA.debugLineNum = 363;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
Debug.ShouldStop(1024);
_data.setField ("TIMOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMOLT"))))));
 BA.debugLineNum = 364;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
Debug.ShouldStop(2048);
_data.setField ("NOKOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOLT"))))));
 BA.debugLineNum = 366;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("FEVI"))))) && RemoteObject.solveBoolean("N",_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FEVI")))))) { 
 BA.debugLineNum = 367;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
Debug.ShouldStop(16384);
_data.setField ("FEVI" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FEVI"))))));
 }else {
 BA.debugLineNum = 369;BA.debugLine="data.FEVI = \"\"";
Debug.ShouldStop(65536);
_data.setField ("FEVI" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 BA.debugLineNum = 372;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
Debug.ShouldStop(524288);
_data.setField ("OPERA" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OPERA"))))));
 BA.debugLineNum = 373;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
Debug.ShouldStop(1048576);
_data.setField ("ECUDEF01UD" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ECUDEF01UD"))))));
 BA.debugLineNum = 374;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
Debug.ShouldStop(2097152);
_data.setField ("ECUDEF02UD" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ECUDEF02UD"))))));
 BA.debugLineNum = 376;BA.debugLine="result.Add(data)";
Debug.ShouldStop(8388608);
_result.runVoidMethod ("Add",(Object)((_data)));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 379;BA.debugLine="Return result";
Debug.ShouldStop(67108864);
if (true) return _result;
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Type TableData( _     CODIGO As String, _     COD";
;
 //BA.debugLineNum = 15;BA.debugLine="Dim DataList As List";
frm_impresion._datalist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Dim DataPrice As List";
frm_impresion._dataprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Type OtherPriceData (TILT As String, KOLT As Stri";
;
 //BA.debugLineNum = 18;BA.debugLine="Type OtherData(Principal As String, Rapido As Str";
;
 //BA.debugLineNum = 19;BA.debugLine="Dim ObjSelec As OtherData";
frm_impresion._objselec = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._otherdata");
 //BA.debugLineNum = 20;BA.debugLine="Type Etiqueta (NombreEtiqueta As String, FUNCION";
;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb_buscarlistaprecios(RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Sb_BuscarListaPrecios (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,627);
if (RapidSub.canDelegate("sb_buscarlistaprecios")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","sb_buscarlistaprecios", _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 627;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 629;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(1048576);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 635;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(67108864);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_impresion.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 636;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(134217728);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 638;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(536870912);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_impresion.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 639;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(1073741824);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 640;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(-2147483648);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 641;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(1);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_BuscarListaPrecios\""))));
 BA.debugLineNum = 643;BA.debugLine="Return Js";
Debug.ShouldStop(4);
if (true) return _js;
 BA.debugLineNum = 645;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_imprimiretiquetazpl_01(RemoteObject _me_,RemoteObject _codigo) throws Exception{
try {
		Debug.PushSubsStack("Sb_ImprimirEtiquetaZPL_01 (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1065);
if (RapidSub.canDelegate("sb_imprimiretiquetazpl_01")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","sb_imprimiretiquetazpl_01", _me_, _codigo);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Me_", _me_);
Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 1065;BA.debugLine="Public Sub Sb_ImprimirEtiquetaZPL_01(Me_ As Object";
Debug.ShouldStop(256);
 BA.debugLineNum = 1067;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(1024);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_ImprimirEtiquetaZPL_01 xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("      <_NombreEtiqueta>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((frm_impresion.mostCurrent._tip))),RemoteObject.createImmutable("</_NombreEtiqueta>\n"),RemoteObject.createImmutable("      <_Codigo>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codigo))),RemoteObject.createImmutable("</_Codigo>\n"),RemoteObject.createImmutable("      <_CodLista>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((frm_impresion.mostCurrent._stringprecio1))),RemoteObject.createImmutable("</_CodLista>\n"),RemoteObject.createImmutable("      <_Empresa>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((frm_impresion.mostCurrent._variables._gl_empresa /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("      <_Sucursal>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((frm_impresion.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Sucursal>\n"),RemoteObject.createImmutable("      <_Bodega>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((frm_impresion.mostCurrent._variables._gl_bodega /*RemoteObject*/ ))),RemoteObject.createImmutable("</_Bodega>\n"),RemoteObject.createImmutable("      <_CodAlternativo></_CodAlternativo>\n"),RemoteObject.createImmutable("    </Sb_ImprimirEtiquetaZPL_01>\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 1082;BA.debugLine="Dim PostString As String = \"http://\" & Variables.";
Debug.ShouldStop(33554432);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_impresion.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 1083;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(67108864);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 1085;BA.debugLine="Js.Initialize(\"\", Me_)";
Debug.ShouldStop(268435456);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_impresion.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 1086;BA.debugLine="Js.PostString(PostString, vXml)";
Debug.ShouldStop(536870912);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 1087;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(1073741824);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 1088;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\", \"http://Bak";
Debug.ShouldStop(-2147483648);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)(RemoteObject.createImmutable("http://BakApp/Sb_ImprimirEtiquetaZPL_01")));
 BA.debugLineNum = 1090;BA.debugLine="Return Js";
Debug.ShouldStop(2);
if (true) return _js;
 BA.debugLineNum = 1092;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_inv_traerproductoinventarioticket(RemoteObject _me_,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _tipo,RemoteObject _codigo,RemoteObject _lista) throws Exception{
try {
		Debug.PushSubsStack("Sb_Inv_TraerProductoInventarioTicket (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,646);
if (RapidSub.canDelegate("sb_inv_traerproductoinventarioticket")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","sb_inv_traerproductoinventarioticket", _me_, _empresa, _sucursal, _bodega, _tipo, _codigo, _lista);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Me_", _me_);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("Tipo", _tipo);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 646;BA.debugLine="Public Sub Sb_Inv_TraerProductoInventarioTicket(Me";
Debug.ShouldStop(32);
 BA.debugLineNum = 648;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(128);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_Inv_TraerProductoInventarioTicket xmlns=\"http://BakApp\">\n"),RemoteObject.createImmutable("      <_Empresa>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_empresa))),RemoteObject.createImmutable("</_Empresa>\n"),RemoteObject.createImmutable("      <_Sucursal>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sucursal))),RemoteObject.createImmutable("</_Sucursal>\n"),RemoteObject.createImmutable("      <_Bodega>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_bodega))),RemoteObject.createImmutable("</_Bodega>\n"),RemoteObject.createImmutable("      <_Tipo>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tipo))),RemoteObject.createImmutable("</_Tipo>\n"),RemoteObject.createImmutable("      <_Codigo>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codigo))),RemoteObject.createImmutable("</_Codigo>\n"),RemoteObject.createImmutable("      <_Lista>"),frm_impresion.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lista))),RemoteObject.createImmutable("</_Lista>\n"),RemoteObject.createImmutable("    </Sb_Inv_TraerProductoInventarioTicket>\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 662;BA.debugLine="Dim PostString As String = \"http://\" & Variables.";
Debug.ShouldStop(2097152);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_impresion.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 663;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(4194304);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 665;BA.debugLine="Js.Initialize(\"\", Me_)";
Debug.ShouldStop(16777216);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_impresion.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 666;BA.debugLine="Js.PostString(PostString, vXml)";
Debug.ShouldStop(33554432);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 667;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(67108864);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 668;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\", \"http://Bak";
Debug.ShouldStop(134217728);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)(RemoteObject.createImmutable("http://BakApp/Sb_Inv_TraerProductoInventarioTicket")));
 BA.debugLineNum = 670;BA.debugLine="Return Js";
Debug.ShouldStop(536870912);
if (true) return _js;
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_traeretiquetas(RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Sb_TraerEtiquetas (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,252);
if (RapidSub.canDelegate("sb_traeretiquetas")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","sb_traeretiquetas", _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 252;BA.debugLine="Private Sub Sb_TraerEtiquetas(Me_ As Object) As Ht";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 254;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(536870912);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_TraerEtiquetas xmlns=\"http://BakApp\" />\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>\n"),RemoteObject.createImmutable("")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 262;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(32);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_impresion.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 263;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(64);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 265;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(256);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_impresion.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 266;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(512);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 267;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(1024);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 268;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(2048);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_TraerEtiquetas\""))));
 BA.debugLineNum = 269;BA.debugLine="Return Js";
Debug.ShouldStop(4096);
if (true) return _js;
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner_cant_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner_cant_ItemClick (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,1096);
if (RapidSub.canDelegate("spinner_cant_itemclick")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","spinner_cant_itemclick", _position, _value);}
RemoteObject _seleccionado = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1096;BA.debugLine="Private Sub Spinner_cant_ItemClick (Position As In";
Debug.ShouldStop(128);
 BA.debugLineNum = 1097;BA.debugLine="Dim seleccionado As Int = Value";
Debug.ShouldStop(256);
_seleccionado = BA.numberCast(int.class, _value);Debug.locals.put("seleccionado", _seleccionado);Debug.locals.put("seleccionado", _seleccionado);
 BA.debugLineNum = 1098;BA.debugLine="cantidad = seleccionado";
Debug.ShouldStop(512);
frm_impresion._cantidad = _seleccionado;
 BA.debugLineNum = 1099;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txt_codigo_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("Txt_codigo_EnterPressed (frm_impresion) ","frm_impresion",3,frm_impresion.mostCurrent.activityBA,frm_impresion.mostCurrent,673);
if (RapidSub.canDelegate("txt_codigo_enterpressed")) { return BaKapp.Movil.Tag.frm_impresion.remoteMe.runUserSub(false, "frm_impresion","txt_codigo_enterpressed");}
 BA.debugLineNum = 673;BA.debugLine="Private Sub Txt_codigo_EnterPressed";
Debug.ShouldStop(1);
 BA.debugLineNum = 674;BA.debugLine="Btn_BuscarProd_Click";
Debug.ShouldStop(2);
_btn_buscarprod_click();
 BA.debugLineNum = 675;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}