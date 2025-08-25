package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cl_conf_local_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim Consulta_Sql As String";
cl_conf_local._consulta_sql = RemoteObject.createImmutable("");__ref.setField("_consulta_sql",cl_conf_local._consulta_sql);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cl_conf_local) ","cl_conf_local",6,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cl_conf_local","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_revisar_webservice(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_WebService (cl_conf_local) ","cl_conf_local",6,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("sb_revisar_webservice")) { return __ref.runUserSub(false, "cl_conf_local","sb_revisar_webservice", __ref);}
ResumableSub_Sb_Revisar_WebService rsub = new ResumableSub_Sb_Revisar_WebService(null,__ref);
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
public static class ResumableSub_Sb_Revisar_WebService extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_WebService(BaKapp.Movil.Tag.cl_conf_local parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_conf_local parent;
RemoteObject _exite_ip_webservice = RemoteObject.createImmutable(false);
RemoteObject _existe = RemoteObject.createImmutable(0);
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_WebService (cl_conf_local) ","cl_conf_local",6,__ref.getField(false, "ba"),__ref,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 14;BA.debugLine="Dim Exite_Ip_webservice As Boolean";
Debug.ShouldStop(8192);
_exite_ip_webservice = RemoteObject.createImmutable(false);Debug.locals.put("Exite_Ip_webservice", _exite_ip_webservice);
 BA.debugLineNum = 16;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 17;BA.debugLine="Consulta_Sql = \"Select * From Conf_Local\"";
Debug.ShouldStop(65536);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select * From Conf_Local"));
 BA.debugLineNum = 18;BA.debugLine="Dim Existe As Int = Variables.vSql.ExecQuerySing";
Debug.ShouldStop(131072);
_existe = BA.numberCast(int.class, parent._variables._vsql /*RemoteObject*/ .runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("Select Count(*) From Conf_Local"))));Debug.locals.put("Existe", _existe);Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 20;BA.debugLine="If Existe = 0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_existe,BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 21;BA.debugLine="Consulta_Sql = \"Insert Into Conf_Local (Ip_WebS";
Debug.ShouldStop(1048576);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Insert Into Conf_Local (Ip_WebService,IdDispositivo) Values ('...','"),parent._variables._global_iddispositivo /*RemoteObject*/ ,RemoteObject.createImmutable("')")));
 BA.debugLineNum = 22;BA.debugLine="Variables.vSql.ExecQuery(Consulta_Sql)";
Debug.ShouldStop(2097152);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecQuery",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="Exite_Ip_webservice = False";
Debug.ShouldStop(4194304);
_exite_ip_webservice = parent.__c.getField(true,"False");Debug.locals.put("Exite_Ip_webservice", _exite_ip_webservice);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 25;BA.debugLine="Exite_Ip_webservice = True";
Debug.ShouldStop(16777216);
_exite_ip_webservice = parent.__c.getField(true,"True");Debug.locals.put("Exite_Ip_webservice", _exite_ip_webservice);
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 28;BA.debugLine="Consulta_Sql = \"Select * From Conf_Local\"";
Debug.ShouldStop(134217728);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select * From Conf_Local"));
 BA.debugLineNum = 29;BA.debugLine="Dim Fila As Map";
Debug.ShouldStop(268435456);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 30;BA.debugLine="Fila.Initialize";
Debug.ShouldStop(536870912);
_fila.runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consult";
Debug.ShouldStop(1073741824);
_fila = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 33;BA.debugLine="Variables.Global_Ip_WebService = Fila.Get(\"ip_we";
Debug.ShouldStop(1);
parent._variables._global_ip_webservice /*RemoteObject*/  = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ip_webservice")))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 35;BA.debugLine="Variables.Global_Ip_WebService = \"...\"";
Debug.ShouldStop(4);
parent._variables._global_ip_webservice /*RemoteObject*/  = BA.ObjectToString("...");
 BA.debugLineNum = 36;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","29109528",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 39;BA.debugLine="Return Exite_Ip_webservice";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_exite_ip_webservice));return;};
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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