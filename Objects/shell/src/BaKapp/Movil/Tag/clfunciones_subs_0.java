package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clfunciones_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clfunciones) ","clfunciones",9,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clfunciones","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_existetabla(RemoteObject __ref,RemoteObject _tabla) throws Exception{
try {
		Debug.PushSubsStack("Sb_ExisteTabla (clfunciones) ","clfunciones",9,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("sb_existetabla")) { return __ref.runUserSub(false, "clfunciones","sb_existetabla", __ref, _tabla);}
ResumableSub_Sb_ExisteTabla rsub = new ResumableSub_Sb_ExisteTabla(null,__ref,_tabla);
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
public static class ResumableSub_Sb_ExisteTabla extends BA.ResumableSub {
public ResumableSub_Sb_ExisteTabla(BaKapp.Movil.Tag.clfunciones parent,RemoteObject __ref,RemoteObject _tabla) {
this.parent = parent;
this.__ref = __ref;
this._tabla = _tabla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones parent;
RemoteObject _tabla;
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_ExisteTabla (clfunciones) ","clfunciones",9,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Tabla", _tabla);
 BA.debugLineNum = 39;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(64);
_consulta_sql = RemoteObject.createImmutable("");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 41;BA.debugLine="Consulta_Sql = \"Select Top 1 * From INFORMATION_S";
Debug.ShouldStop(256);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"),_tabla,RemoteObject.createImmutable("'"));Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 43;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1024);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_consulta_sql),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 44;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones", "sb_existetabla"), (_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 45;BA.debugLine="Log(\"Revisando la existencia de Tabla \" & Tabla)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","210289162",RemoteObject.concat(RemoteObject.createImmutable("Revisando la existencia de Tabla "),_tabla),0);
 BA.debugLineNum = 47;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 14;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 51;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 53;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1048576);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 55;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 56;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 58;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 65;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _js) throws Exception{
}
public static RemoteObject  _tienepermiso(RemoteObject __ref,RemoteObject _codpermiso,RemoteObject _codusuario) throws Exception{
try {
		Debug.PushSubsStack("TienePermiso (clfunciones) ","clfunciones",9,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("tienepermiso")) { return __ref.runUserSub(false, "clfunciones","tienepermiso", __ref, _codpermiso, _codusuario);}
ResumableSub_TienePermiso rsub = new ResumableSub_TienePermiso(null,__ref,_codpermiso,_codusuario);
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
public static class ResumableSub_TienePermiso extends BA.ResumableSub {
public ResumableSub_TienePermiso(BaKapp.Movil.Tag.clfunciones parent,RemoteObject __ref,RemoteObject _codpermiso,RemoteObject _codusuario) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this._codusuario = _codusuario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones parent;
RemoteObject _codpermiso;
RemoteObject _codusuario;
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TienePermiso (clfunciones) ","clfunciones",9,__ref.getField(false, "ba"),__ref,10);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("CodPermiso", _codpermiso);
Debug.locals.put("CodUsuario", _codusuario);
 BA.debugLineNum = 12;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(2048);
_consulta_sql = RemoteObject.createImmutable("");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 14;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
Debug.ShouldStop(8192);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("ZW_PermisosVsUsuarios Where CodUsuario = '"),_codusuario,RemoteObject.createImmutable("' And CodPermiso = '"),_codpermiso,RemoteObject.createImmutable("'"));Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 16;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(32768);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_consulta_sql),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 17;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones", "tienepermiso"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 19;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 21;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1048576);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 23;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 24;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 26;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 31;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
}