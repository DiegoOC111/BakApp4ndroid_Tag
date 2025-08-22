package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class conf_local_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (conf_local) ","conf_local",10,conf_local.mostCurrent.activityBA,conf_local.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.conf_local.remoteMe.runUserSub(false, "conf_local","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"Conf_Local1\")";
Debug.ShouldStop(8388608);
conf_local.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Conf_Local1")),conf_local.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="Txt_Ip_WebService.Text = Variables.Global_Ip_WebS";
Debug.ShouldStop(33554432);
conf_local.mostCurrent._txt_ip_webservice.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(conf_local.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (conf_local) ","conf_local",10,conf_local.mostCurrent.activityBA,conf_local.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.conf_local.remoteMe.runUserSub(false, "conf_local","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (conf_local) ","conf_local",10,conf_local.mostCurrent.activityBA,conf_local.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.conf_local.remoteMe.runUserSub(false, "conf_local","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_grabar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Grabar_Click (conf_local) ","conf_local",10,conf_local.mostCurrent.activityBA,conf_local.mostCurrent,39);
if (RapidSub.canDelegate("btn_grabar_click")) { BaKapp.Movil.Tag.conf_local.remoteMe.runUserSub(false, "conf_local","btn_grabar_click"); return;}
ResumableSub_Btn_Grabar_Click rsub = new ResumableSub_Btn_Grabar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Grabar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Grabar_Click(BaKapp.Movil.Tag.conf_local parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.conf_local parent;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Grabar_Click (conf_local) ","conf_local",10,conf_local.mostCurrent.activityBA,conf_local.mostCurrent,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 41;BA.debugLine="Variables.Global_Ip_WebService = Txt_Ip_WebServic";
Debug.ShouldStop(256);
parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/  = parent.mostCurrent._txt_ip_webservice.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 43;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIES";
Debug.ShouldStop(1024);
parent._consulta_sql = BA.ObjectToString("Select Top 1 EMPRESA From CONFIES");
 BA.debugLineNum = 45;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(4096);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,conf_local.mostCurrent.activityBA,(Object)(parent._consulta_sql),(Object)(conf_local.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 46;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", conf_local.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conf_local", "btn_grabar_click"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 47;BA.debugLine="ProgressDialogShow(\"Probando conexión\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",conf_local.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Probando conexión"))));
 BA.debugLineNum = 48;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 50;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(131072);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 51;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 52;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 53;BA.debugLine="Msgbox2Async(\"Conexion existosa\" , \"Conexión We";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Conexion existosa")),(Object)(BA.ObjectToCharSequence("Conexión WebService")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),conf_local.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", conf_local.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conf_local", "btn_grabar_click"), null);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 56;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Conf_Local";
Debug.ShouldStop(8388608);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,conf_local.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Conf_Local")),(Object)(BA.ObjectToString("Ip_Webservice")),(Object)((parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("IdDispositivo")),(parent.mostCurrent._variables._global_iddispositivo /*RemoteObject*/ )}))));
 BA.debugLineNum = 58;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 62;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 63;BA.debugLine="Msgbox2Async(\"No se pudo establecer la conexion";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se pudo establecer la conexion con el Web Service")),(Object)(BA.ObjectToCharSequence("Conexión WebService")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),conf_local.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Label1 As Label";
conf_local.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Txt_Ip_WebService As EditText";
conf_local.mostCurrent._txt_ip_webservice = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Btn_Grabar As Button";
conf_local.mostCurrent._btn_grabar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim Consulta_Sql As String";
conf_local._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}