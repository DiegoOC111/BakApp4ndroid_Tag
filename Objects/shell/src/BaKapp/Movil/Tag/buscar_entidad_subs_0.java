package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class buscar_entidad_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"Buscador\")";
Debug.ShouldStop(256);
buscar_entidad.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Buscador")),buscar_entidad.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="Activity.Title = \"BUSCAR ENTIDADES\"";
Debug.ShouldStop(512);
buscar_entidad.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("BUSCAR ENTIDADES"));
 BA.debugLineNum = 44;BA.debugLine="XclvDetalle.DefaultTextBackgroundColor = Colors.T";
Debug.ShouldStop(2048);
buscar_entidad.mostCurrent._xclvdetalle.setField ("_defaulttextbackgroundcolor",buscar_entidad.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 45;BA.debugLine="B4XLoading.Hide";
Debug.ShouldStop(4096);
buscar_entidad.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,49);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","activity_resume");}
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_aceptar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Aceptar_Click (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,57);
if (RapidSub.canDelegate("btn_aceptar_click")) { return BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","btn_aceptar_click");}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 57;BA.debugLine="Private Sub Btn_Aceptar_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(33554432);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), buscar_entidad.mostCurrent.__c.runMethod(false,"Sender",buscar_entidad.mostCurrent.activityBA));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 59;BA.debugLine="ToastMessageShow(btn.Tag,False)";
Debug.ShouldStop(67108864);
buscar_entidad.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_btn.runMethod(false,"getTag"))),(Object)(buscar_entidad.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_buscar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Click (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,62);
if (RapidSub.canDelegate("btn_buscar_click")) { return BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","btn_buscar_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub Btn_Buscar_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Sb_Buscar_Entidad(Txt_Codigo_Descripcion.Text)";
Debug.ShouldStop(1073741824);
_sb_buscar_entidad(buscar_entidad.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim xui As XUI";
buscar_entidad.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 22;BA.debugLine="Private Lbl_Codigo As B4XView";
buscar_entidad.mostCurrent._lbl_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Lbl_Codsucursal As B4XView";
buscar_entidad.mostCurrent._lbl_codsucursal = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Lbl_Razon_Social As B4XView";
buscar_entidad.mostCurrent._lbl_razon_social = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Lbl_Direccion As B4XView";
buscar_entidad.mostCurrent._lbl_direccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Lbl_Rut As B4XView";
buscar_entidad.mostCurrent._lbl_rut = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Lbl_Tipo As B4XView";
buscar_entidad.mostCurrent._lbl_tipo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Txt_Codigo_Descripcion As EditText";
buscar_entidad.mostCurrent._txt_codigo_descripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Btn_Buscar As Button";
buscar_entidad.mostCurrent._btn_buscar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private B4XLoading As B4XLoadingIndicator";
buscar_entidad.mostCurrent._b4xloading = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xloadingindicator");
 //BA.debugLineNum = 32;BA.debugLine="Private XclvDetalle As CustomListView";
buscar_entidad.mostCurrent._xclvdetalle = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 33;BA.debugLine="Private LblItems As Label";
buscar_entidad.mostCurrent._lblitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Consulta_Sql As String";
buscar_entidad._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public Fila As Map";
buscar_entidad._fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="Public Msj As Mensajes";
buscar_entidad._msj = RemoteObject.createNew ("BaKapp.Movil.Tag.mensajes");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _sb_buscar_entidad(RemoteObject _descripcion) throws Exception{
try {
		Debug.PushSubsStack("Sb_Buscar_Entidad (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,70);
if (RapidSub.canDelegate("sb_buscar_entidad")) { BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","sb_buscar_entidad", _descripcion); return;}
ResumableSub_Sb_Buscar_Entidad rsub = new ResumableSub_Sb_Buscar_Entidad(null,_descripcion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Buscar_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Buscar_Entidad(BaKapp.Movil.Tag.buscar_entidad parent,RemoteObject _descripcion) {
this.parent = parent;
this._descripcion = _descripcion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.buscar_entidad parent;
RemoteObject _descripcion;
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _condicion_entidad = RemoteObject.createImmutable("");
RemoteObject _filtro_extra = RemoteObject.createImmutable("");
RemoteObject _filtro_entidades = RemoteObject.createImmutable("");
RemoteObject _filtro_vendedores = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _koen = RemoteObject.createImmutable("");
RemoteObject _suen = RemoteObject.createImmutable("");
RemoteObject _nokoen = RemoteObject.createImmutable("");
RemoteObject _dien = RemoteObject.createImmutable("");
RemoteObject _tipo = RemoteObject.createImmutable("");
RemoteObject _rten = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Buscar_Entidad (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 72;BA.debugLine="Dim Cadena As String";
Debug.ShouldStop(128);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("Cadena", _cadena);
 BA.debugLineNum = 74;BA.debugLine="Cadena = Funciones.Fx_Cadena_a_buscar_SQL(Descrip";
Debug.ShouldStop(512);
_cadena = parent.mostCurrent._funciones.runMethod(true,"_fx_cadena_a_buscar_sql" /*RemoteObject*/ ,buscar_entidad.mostCurrent.activityBA,(Object)(_descripcion),(Object)(RemoteObject.concat(RemoteObject.createImmutable("KOEN+NOKOEN+SUEN+DIEN"),RemoteObject.createImmutable(" LIKE '%"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Cadena", _cadena);
 BA.debugLineNum = 76;BA.debugLine="XclvDetalle.Clear";
Debug.ShouldStop(2048);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_clear");
 BA.debugLineNum = 77;BA.debugLine="B4XLoading.Show";
Debug.ShouldStop(4096);
parent.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="Dim Condicion_Entidad As String";
Debug.ShouldStop(16384);
_condicion_entidad = RemoteObject.createImmutable("");Debug.locals.put("Condicion_Entidad", _condicion_entidad);
 BA.debugLineNum = 80;BA.debugLine="Dim Filtro_Extra As String";
Debug.ShouldStop(32768);
_filtro_extra = RemoteObject.createImmutable("");Debug.locals.put("Filtro_Extra", _filtro_extra);
 BA.debugLineNum = 81;BA.debugLine="Dim Filtro_Entidades As String";
Debug.ShouldStop(65536);
_filtro_entidades = RemoteObject.createImmutable("");Debug.locals.put("Filtro_Entidades", _filtro_entidades);
 BA.debugLineNum = 82;BA.debugLine="Dim Filtro_Vendedores As String";
Debug.ShouldStop(131072);
_filtro_vendedores = RemoteObject.createImmutable("");Debug.locals.put("Filtro_Vendedores", _filtro_vendedores);
 BA.debugLineNum = 84;BA.debugLine="Consulta_Sql = \"Select Top (30) IDMAEEN,KOEN,SUEN";
Debug.ShouldStop(524288);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top (30) IDMAEEN,KOEN,SUEN,RTEN,NOKOEN,SIEN,DIEN,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Case TIEN "),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("When 'A' Then 'Ambos' "),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("When 'P' Then 'Proveedor' When 'C' Then 'Cliente' Else '' End As Tipo_Entidad,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("SUBSTRING(LCEN,6,3) As LCosto,SUBSTRING(LVEN,6,3) As LVenta,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("BLOQUEADO,BLOQENCOM,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Case BLOQUEADO When 1 Then 'SI' Else '' End As Bloqueado_Venta,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Case BLOQENCOM When 1 Then 'SI' Else '' End As Bloqueado_Compra"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEEN With (Nolock) "),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where KOEN+NOKOEN+SUEN+DIEN LIKE '%"),_cadena,RemoteObject.createImmutable("%'"),parent.mostCurrent.__c.getField(true,"CRLF"),_condicion_entidad,parent.mostCurrent.__c.getField(true,"CRLF"),_filtro_extra,parent.mostCurrent.__c.getField(true,"CRLF"),_filtro_entidades,parent.mostCurrent.__c.getField(true,"CRLF"),_filtro_vendedores,parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order by KOEN"));
 BA.debugLineNum = 100;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(8);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,buscar_entidad.mostCurrent.activityBA,(Object)(parent._consulta_sql),(Object)(buscar_entidad.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 101;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", buscar_entidad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_entidad", "sb_buscar_entidad"), (_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 102;BA.debugLine="ProgressDialogShow(\"Buscando entidades...\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",buscar_entidad.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando entidades..."))));
 BA.debugLineNum = 104;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 20;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 106;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(512);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 108;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 110;BA.debugLine="Log(vJson)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21376296",_vjson,0);
 BA.debugLineNum = 111;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16384);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 112;BA.debugLine="parser.Initialize(vJson)";
Debug.ShouldStop(32768);
_parser.runVoidMethod ("Initialize",(Object)(_vjson));
 BA.debugLineNum = 113;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(65536);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 114;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
Debug.ShouldStop(131072);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 118;BA.debugLine="For Each Fila As Map In Table";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//for
this.state = 16;
parent._fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _table;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 9;
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));}
if (true) break;

case 23:
//C
this.state = 22;
index21++;
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 120;BA.debugLine="Dim Koen As String = Fila.Get(\"KOEN\")";
Debug.ShouldStop(8388608);
_koen = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN")))));Debug.locals.put("Koen", _koen);Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 121;BA.debugLine="Dim Suen As String = Fila.Get(\"SUEN\")";
Debug.ShouldStop(16777216);
_suen = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN")))));Debug.locals.put("Suen", _suen);Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 122;BA.debugLine="Dim Nokoen As String = Fila.Get(\"NOKOEN\")";
Debug.ShouldStop(33554432);
_nokoen = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN")))));Debug.locals.put("Nokoen", _nokoen);Debug.locals.put("Nokoen", _nokoen);
 BA.debugLineNum = 123;BA.debugLine="Dim Dien As String = Fila.Get(\"DIEN\")";
Debug.ShouldStop(67108864);
_dien = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIEN")))));Debug.locals.put("Dien", _dien);Debug.locals.put("Dien", _dien);
 BA.debugLineNum = 124;BA.debugLine="Dim Tipo As String = Fila.Get(\"Tipo_Entidad\")";
Debug.ShouldStop(134217728);
_tipo = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Tipo_Entidad")))));Debug.locals.put("Tipo", _tipo);Debug.locals.put("Tipo", _tipo);
 BA.debugLineNum = 125;BA.debugLine="Dim Rten As String = Fila.Get(\"RTEN\")";
Debug.ShouldStop(268435456);
_rten = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RTEN")))));Debug.locals.put("Rten", _rten);Debug.locals.put("Rten", _rten);
 BA.debugLineNum = 128;BA.debugLine="Rten = NumberFormat(Rten,0,0) & \"-\" & Funcione";
Debug.ShouldStop(-2147483648);
_rten = RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _rten)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("-"),parent.mostCurrent._funciones.runMethod(true,"_rutdigito" /*RemoteObject*/ ,buscar_entidad.mostCurrent.activityBA,(Object)(BA.numberCast(long.class, _rten))));Debug.locals.put("Rten", _rten);
 BA.debugLineNum = 130;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent.mostCurrent._xui.runMethod(false,"CreatePanel",buscar_entidad.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 132;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
Debug.ShouldStop(8);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._xclvdetalle.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))));
 BA.debugLineNum = 133;BA.debugLine="p.LoadLayout(\"Items_Entidades\")";
Debug.ShouldStop(16);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_Entidades")),buscar_entidad.mostCurrent.activityBA);
 BA.debugLineNum = 134;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(32);
_p.runMethod(true,"setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 136;BA.debugLine="Lbl_Codigo.Tag = Koen";
Debug.ShouldStop(128);
parent.mostCurrent._lbl_codigo.runMethod(false,"setTag",(_koen));
 BA.debugLineNum = 137;BA.debugLine="Lbl_Codsucursal.Tag = Suen";
Debug.ShouldStop(256);
parent.mostCurrent._lbl_codsucursal.runMethod(false,"setTag",(_suen));
 BA.debugLineNum = 138;BA.debugLine="Lbl_Razon_Social.Tag = Nokoen";
Debug.ShouldStop(512);
parent.mostCurrent._lbl_razon_social.runMethod(false,"setTag",(_nokoen));
 BA.debugLineNum = 139;BA.debugLine="Lbl_Direccion.Tag = Dien";
Debug.ShouldStop(1024);
parent.mostCurrent._lbl_direccion.runMethod(false,"setTag",(_dien));
 BA.debugLineNum = 140;BA.debugLine="Lbl_Tipo.Text = Tipo.ToUpperCase";
Debug.ShouldStop(2048);
parent.mostCurrent._lbl_tipo.runMethod(true,"setText",BA.ObjectToCharSequence(_tipo.runMethod(true,"toUpperCase")));
 BA.debugLineNum = 141;BA.debugLine="Lbl_Rut.Text = Rten.Replace(\",\",\".\")";
Debug.ShouldStop(4096);
parent.mostCurrent._lbl_rut.runMethod(true,"setText",BA.ObjectToCharSequence(_rten.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(".")))));
 BA.debugLineNum = 143;BA.debugLine="Lbl_Codigo.Text = Koen";
Debug.ShouldStop(16384);
parent.mostCurrent._lbl_codigo.runMethod(true,"setText",BA.ObjectToCharSequence(_koen));
 BA.debugLineNum = 144;BA.debugLine="If Suen.Trim <> \"\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_suen.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 145;BA.debugLine="Lbl_Codsucursal.Text = \"Suc.: \" & Suen";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_codsucursal.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Suc.: "),_suen)));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 147;BA.debugLine="Lbl_Codsucursal.Text = \"\"";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_codsucursal.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 15:
//C
this.state = 23;
;
 BA.debugLineNum = 149;BA.debugLine="Lbl_Razon_Social.Text = Nokoen";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_razon_social.runMethod(true,"setText",BA.ObjectToCharSequence(_nokoen));
 BA.debugLineNum = 150;BA.debugLine="Lbl_Direccion.Text = Dien";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbl_direccion.runMethod(true,"setText",BA.ObjectToCharSequence(_dien));
 BA.debugLineNum = 152;BA.debugLine="XclvDetalle.Add(p,\"\")";
Debug.ShouldStop(8388608);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 154;BA.debugLine="Log(Koen & Suen & Nokoen)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21376340",RemoteObject.concat(_koen,_suen,_nokoen),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 162;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",F";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No se encontraron registros")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 166;BA.debugLine="B4XLoading.Hide";
Debug.ShouldStop(32);
parent.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 167;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static RemoteObject  _txt_codigo_descripcion_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("Txt_Codigo_Descripcion_EnterPressed (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,66);
if (RapidSub.canDelegate("txt_codigo_descripcion_enterpressed")) { return BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","txt_codigo_descripcion_enterpressed");}
 BA.debugLineNum = 66;BA.debugLine="Private Sub Txt_Codigo_Descripcion_EnterPressed";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Sb_Buscar_Entidad(Txt_Codigo_Descripcion.Text)";
Debug.ShouldStop(4);
_sb_buscar_entidad(buscar_entidad.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _xclvdetalle_itemlongclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemLongClick (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,171);
if (RapidSub.canDelegate("xclvdetalle_itemlongclick")) { BaKapp.Movil.Tag.buscar_entidad.remoteMe.runUserSub(false, "buscar_entidad","xclvdetalle_itemlongclick", _index, _value); return;}
ResumableSub_XclvDetalle_ItemLongClick rsub = new ResumableSub_XclvDetalle_ItemLongClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_XclvDetalle_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDetalle_ItemLongClick(BaKapp.Movil.Tag.buscar_entidad parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.buscar_entidad parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblkoen = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblsuen = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nokoen = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemLongClick (buscar_entidad) ","buscar_entidad",1,buscar_entidad.mostCurrent.activityBA,buscar_entidad.mostCurrent,171);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 173;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(4096);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 174;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
Debug.ShouldStop(8192);
_item = parent.mostCurrent._xclvdetalle.runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 175;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 176;BA.debugLine="Dim LblKoen As Label = p.GetView(0)";
Debug.ShouldStop(32768);
_lblkoen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblkoen = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblKoen", _lblkoen);Debug.locals.put("LblKoen", _lblkoen);
 BA.debugLineNum = 177;BA.debugLine="Dim LblSuen As Label = p.GetView(1)";
Debug.ShouldStop(65536);
_lblsuen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblsuen = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("LblSuen", _lblsuen);Debug.locals.put("LblSuen", _lblsuen);
 BA.debugLineNum = 179;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(262144);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_entidad_json" /*RemoteObject*/ ,buscar_entidad.mostCurrent.activityBA,(Object)(buscar_entidad.getObject()),(Object)(_lblkoen.runMethod(true,"getText")),(Object)(BA.ObjectToString(_lblsuen.runMethod(false,"getTag"))));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 181;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", buscar_entidad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_entidad", "xclvdetalle_itemlongclick"), (_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 183;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 16;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 185;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 187;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 189;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(268435456);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,buscar_entidad.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 190;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(536870912);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 192;BA.debugLine="Log(LblKoen.Text)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21441813",_lblkoen.runMethod(true,"getText"),0);
 BA.debugLineNum = 193;BA.debugLine="Dim Nokoen As String = Fila.Get(\"NOKOEN\")";
Debug.ShouldStop(1);
_nokoen = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN")))));Debug.locals.put("Nokoen", _nokoen);Debug.locals.put("Nokoen", _nokoen);
 BA.debugLineNum = 195;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
Debug.ShouldStop(4);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",buscar_entidad.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¿Confirma la selección?"),parent.mostCurrent.__c.getField(true,"CRLF"),_nokoen))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_lblkoen.runMethod(true,"getText"),_lblsuen.runMethod(true,"getText")))),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("NO")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 196;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", buscar_entidad.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_entidad", "xclvdetalle_itemlongclick"), _sf);
this.state = 18;
return;
case 18:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 198;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 200;BA.debugLine="Frm_Post_01_Formulario.Row_Entidad = Fila";
Debug.ShouldStop(128);
parent.mostCurrent._frm_post_01_formulario._row_entidad /*RemoteObject*/  = parent._fila;
 BA.debugLineNum = 201;BA.debugLine="Frm_Post_01_Formulario.Fila_Encabezado.Put(\"co";
Debug.ShouldStop(256);
parent.mostCurrent._frm_post_01_formulario._fila_encabezado /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codentidad"))),(Object)((_lblkoen.runMethod(true,"getText"))));
 BA.debugLineNum = 202;BA.debugLine="Frm_Post_01_Formulario.Fila_Encabezado.Put(\"co";
Debug.ShouldStop(512);
parent.mostCurrent._frm_post_01_formulario._fila_encabezado /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codsucentidad"))),(Object)(_lblsuen.runMethod(false,"getTag")));
 BA.debugLineNum = 203;BA.debugLine="Frm_Post_01_Formulario.Fila_Encabezado.Put(\"no";
Debug.ShouldStop(1024);
parent.mostCurrent._frm_post_01_formulario._fila_encabezado /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nombre_entidad"))),(Object)((_nokoen)));
 BA.debugLineNum = 204;BA.debugLine="Frm_Post_01_Formulario.Cambiar_Entidad = True";
Debug.ShouldStop(2048);
parent.mostCurrent._frm_post_01_formulario._cambiar_entidad /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 206;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(8192);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 208;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 213;BA.debugLine="Fila = Null";
Debug.ShouldStop(1048576);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 217;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21441838",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
}