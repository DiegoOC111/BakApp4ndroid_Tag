package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cl_stxbodxprod_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cl_stxbodxprod) ","cl_stxbodxprod",8,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cl_stxbodxprod","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 25;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
cl_stxbodxprod._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cl_stxbodxprod._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
cl_stxbodxprod._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cl_stxbodxprod._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView";
cl_stxbodxprod._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",cl_stxbodxprod._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
cl_stxbodxprod._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cl_stxbodxprod._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
cl_stxbodxprod._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",cl_stxbodxprod._tag);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cl_stxbodxprod) ","cl_stxbodxprod",8,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cl_stxbodxprod","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 18;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="mBase = Base";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 20;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(524288);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 21;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cl_stxbodxprod) ","cl_stxbodxprod",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cl_stxbodxprod","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(4096);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 14;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(8192);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}