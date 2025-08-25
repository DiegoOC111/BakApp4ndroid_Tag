package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_editar_obsoc_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_editar_obsoc.remoteMe.runUserSub(false, "frm_editar_obsoc","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Op_Edita_Observaciones\")";
Debug.ShouldStop(1);
frm_editar_obsoc.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Op_Edita_Observaciones")),frm_editar_obsoc.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="Txt_Observaciones.Text = Observaciones";
Debug.ShouldStop(4);
frm_editar_obsoc.mostCurrent._txt_observaciones.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(frm_editar_obsoc._observaciones));
 BA.debugLineNum = 36;BA.debugLine="Txt_Orden_compra.Text = Orden_compra";
Debug.ShouldStop(8);
frm_editar_obsoc.mostCurrent._txt_orden_compra.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(frm_editar_obsoc._orden_compra));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_KeyPress (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,96);
if (RapidSub.canDelegate("activity_keypress")) { return BaKapp.Movil.Tag.frm_editar_obsoc.remoteMe.runUserSub(false, "frm_editar_obsoc","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, frm_editar_obsoc.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 99;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return frm_editar_obsoc.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_editar_obsoc.remoteMe.runUserSub(false, "frm_editar_obsoc","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_editar_obsoc.remoteMe.runUserSub(false, "frm_editar_obsoc","activity_resume");}
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Txt_Observaciones.Text = Observaciones";
Debug.ShouldStop(256);
frm_editar_obsoc.mostCurrent._txt_observaciones.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(frm_editar_obsoc._observaciones));
 BA.debugLineNum = 42;BA.debugLine="Txt_Orden_compra.Text = Orden_compra";
Debug.ShouldStop(512);
frm_editar_obsoc.mostCurrent._txt_orden_compra.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(frm_editar_obsoc._orden_compra));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_cerrar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Cerrar_Click (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,104);
if (RapidSub.canDelegate("btn_cerrar_click")) { BaKapp.Movil.Tag.frm_editar_obsoc.remoteMe.runUserSub(false, "frm_editar_obsoc","btn_cerrar_click"); return;}
ResumableSub_Btn_Cerrar_Click rsub = new ResumableSub_Btn_Cerrar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Cerrar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Cerrar_Click(BaKapp.Movil.Tag.frm_editar_obsoc parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_editar_obsoc parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Cerrar_Click (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,104);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 106;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(512);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 108;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(2048);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 110;BA.debugLine="Msgbox2Async(\"¿Confirma cerrar sin grabar?\",\"C E";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Confirma cerrar sin grabar?")),(Object)(BA.ObjectToCharSequence("C E R R A R")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent.mostCurrent._bmp1),frm_editar_obsoc.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 111;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_editar_obsoc.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_editar_obsoc", "btn_cerrar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 113;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 114;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _btn_grabar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Grabar_Click (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,50);
if (RapidSub.canDelegate("btn_grabar_click")) { BaKapp.Movil.Tag.frm_editar_obsoc.remoteMe.runUserSub(false, "frm_editar_obsoc","btn_grabar_click"); return;}
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
public ResumableSub_Btn_Grabar_Click(BaKapp.Movil.Tag.frm_editar_obsoc parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_editar_obsoc parent;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _actualizado = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Grabar_Click (frm_editar_obsoc) ","frm_editar_obsoc",16,frm_editar_obsoc.mostCurrent.activityBA,frm_editar_obsoc.mostCurrent,50);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 52;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Act";
Debug.ShouldStop(524288);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_actualizar_observaciones_documento" /*RemoteObject*/ ,frm_editar_obsoc.mostCurrent.activityBA,(Object)(frm_editar_obsoc.getObject()),(Object)(parent._idmaeedo),(Object)(parent.mostCurrent._txt_observaciones.runMethod(true,"getText").runMethod(true,"trim")),(Object)(parent.mostCurrent._txt_orden_compra.runMethod(true,"getText").runMethod(true,"trim")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 53;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_editar_obsoc.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_editar_obsoc", "btn_grabar_click"), (_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 55;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 16;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 57;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 59;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 61;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
Debug.ShouldStop(268435456);
_respuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_respuesta = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_editar_obsoc.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Respuesta", _respuesta);Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 63;BA.debugLine="Dim Actualizado As String = Respuesta.Get(\"Actu";
Debug.ShouldStop(1073741824);
_actualizado = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Actualizado")))));Debug.locals.put("Actualizado", _actualizado);Debug.locals.put("Actualizado", _actualizado);
 BA.debugLineNum = 65;BA.debugLine="If Actualizado Then";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 12;
if (BA.ObjectToBoolean(_actualizado.<String>get()).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 67;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.p";
Debug.ShouldStop(4);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 68;BA.debugLine="Msgbox2Async(\"Datos actualizados correctamente";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Datos actualizados correctamente")),(Object)(BA.ObjectToCharSequence("Actualizar")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_editar_obsoc.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 69;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_editar_obsoc.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_editar_obsoc", "btn_grabar_click"), null);
this.state = 18;
return;
case 18:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 71;BA.debugLine="Frm_Buscar_Documento.Observaciones = Txt_Obser";
Debug.ShouldStop(64);
parent.mostCurrent._frm_buscar_documento._observaciones /*RemoteObject*/  = parent.mostCurrent._txt_observaciones.runMethod(true,"getText");
 BA.debugLineNum = 72;BA.debugLine="Frm_Buscar_Documento.OCC = Txt_Orden_compra.Te";
Debug.ShouldStop(128);
parent.mostCurrent._frm_buscar_documento._occ /*RemoteObject*/  = parent.mostCurrent._txt_orden_compra.runMethod(true,"getText");
 BA.debugLineNum = 74;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 78;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
Debug.ShouldStop(8192);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 79;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",frm_editar_obsoc.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_editar_obsoc.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_editar_obsoc.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_editar_obsoc", "btn_grabar_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 86;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(2097152);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 87;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",frm_editar_obsoc.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_editar_obsoc.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 88;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_editar_obsoc.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_editar_obsoc", "btn_grabar_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim bmp1 As Bitmap";
frm_editar_obsoc.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Txt_Observaciones As EditText";
frm_editar_obsoc.mostCurrent._txt_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Txt_Orden_compra As EditText";
frm_editar_obsoc.mostCurrent._txt_orden_compra = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Btn_Grabar As Button";
frm_editar_obsoc.mostCurrent._btn_grabar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Btn_Cerrar As Button";
frm_editar_obsoc.mostCurrent._btn_cerrar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Idmaeedo As Int";
frm_editar_obsoc._idmaeedo = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Public Observaciones As String";
frm_editar_obsoc._observaciones = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public Orden_compra As String";
frm_editar_obsoc._orden_compra = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}