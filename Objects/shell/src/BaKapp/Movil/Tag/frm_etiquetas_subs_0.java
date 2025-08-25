package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_etiquetas_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,64);
if (RapidSub.canDelegate("activity_create")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.frm_etiquetas parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _firsttime;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result5 = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");
RemoteObject _aux = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");
RemoteObject group24;
int index24;
int groupLen24;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 66;BA.debugLine="Activity.LoadLayout(\"Etiqueta_men\")";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Etiqueta_men")),frm_etiquetas.mostCurrent.activityBA);
 BA.debugLineNum = 69;BA.debugLine="Changes = False";
Debug.ShouldStop(16);
parent._changes = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 70;BA.debugLine="Dim Js As HttpJob = Sb_BuscarListaPrecios(Me)";
Debug.ShouldStop(32);
_js = _sb_buscarlistaprecios(frm_etiquetas.getObject());Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 71;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "activity_create"), (_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 73;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 14;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 74;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(512);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 76;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 77;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4096);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 79;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
Debug.ShouldStop(16384);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 80;BA.debugLine="Msgbox2Async(\"Error al buscar la lista de preci";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error al buscar la lista de precios.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 81;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "activity_create"), null);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 83;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 87;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
 BA.debugLineNum = 90;BA.debugLine="DataPrice = ParseOtherPriceJSON(vJson)";
Debug.ShouldStop(33554432);
parent.mostCurrent._dataprice = _parseotherpricejson(_vjson);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 93;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
Debug.ShouldStop(268435456);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 94;BA.debugLine="Msgbox2Async(\"Error al comunicarse con la base d";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error al comunicarse con la base de datos.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 95;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "activity_create"), null);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 103;BA.debugLine="stringListPrice.Initialize";
Debug.ShouldStop(64);
parent.mostCurrent._stringlistprice.runVoidMethod ("Initialize");
 BA.debugLineNum = 104;BA.debugLine="For Each p As OtherPriceData In DataPrice";
Debug.ShouldStop(128);
if (true) break;

case 15:
//for
this.state = 18;
group24 = parent.mostCurrent._dataprice;
index24 = 0;
groupLen24 = group24.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("p", _p);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 18;
if (index24 < groupLen24) {
this.state = 17;
_p = (group24.runMethod(false,"Get",index24));Debug.locals.put("p", _p);}
if (true) break;

case 23:
//C
this.state = 22;
index24++;
Debug.locals.put("p", _p);
if (true) break;

case 17:
//C
this.state = 23;
 BA.debugLineNum = 105;BA.debugLine="stringListPrice.Add(p.KOLT &\" | \"& p.NOKOLT)";
Debug.ShouldStop(256);
parent.mostCurrent._stringlistprice.runVoidMethod ("Add",(Object)((RemoteObject.concat(_p.getField(true,"KOLT" /*RemoteObject*/ ),RemoteObject.createImmutable(" | "),_p.getField(true,"NOKOLT" /*RemoteObject*/ )))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
Debug.locals.put("p", _p);
;
 BA.debugLineNum = 107;BA.debugLine="SelectedPrice = 0";
Debug.ShouldStop(1024);
parent._selectedprice = BA.numberCast(int.class, 0);
 BA.debugLineNum = 108;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
Debug.ShouldStop(2048);
_aux = (parent.mostCurrent._dataprice.runMethod(false,"Get",(Object)(parent._selectedprice)));Debug.locals.put("aux", _aux);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 109;BA.debugLine="stringPrecio = aux.KOLT";
Debug.ShouldStop(4096);
parent._stringprecio = _aux.getField(true,"KOLT" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="LeerDatos";
Debug.ShouldStop(8192);
_leerdatos();
 BA.debugLineNum = 111;BA.debugLine="CargarLista";
Debug.ShouldStop(16384);
_cargarlista();
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static void  _msgbox_result(RemoteObject _result5) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,402);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 402;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Resume (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,173);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","activity_resume");}
 BA.debugLineNum = 173;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_cerrar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Cerrar_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,466);
if (RapidSub.canDelegate("btn_cerrar_click")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_cerrar_click");}
 BA.debugLineNum = 466;BA.debugLine="Private Sub Btn_Cerrar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="General.Visible= True";
Debug.ShouldStop(262144);
frm_etiquetas.mostCurrent._general.runMethod(true,"setVisible",frm_etiquetas.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 468;BA.debugLine="Panel_Conf.Visible = False";
Debug.ShouldStop(524288);
frm_etiquetas.mostCurrent._panel_conf.runMethod(true,"setVisible",frm_etiquetas.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_conf_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Conf_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,459);
if (RapidSub.canDelegate("btn_conf_click")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_conf_click");}
 BA.debugLineNum = 459;BA.debugLine="Private Sub Btn_Conf_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 460;BA.debugLine="General.Visible= False";
Debug.ShouldStop(2048);
frm_etiquetas.mostCurrent._general.runMethod(true,"setVisible",frm_etiquetas.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 461;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
Debug.ShouldStop(4096);
frm_etiquetas.mostCurrent._btn_guardar.runVoidMethod ("setColor",frm_etiquetas._colorenabled);
 BA.debugLineNum = 462;BA.debugLine="IsEnabled = False";
Debug.ShouldStop(8192);
frm_etiquetas._isenabled = frm_etiquetas.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 463;BA.debugLine="Panel_Conf.Visible = True";
Debug.ShouldStop(16384);
frm_etiquetas.mostCurrent._panel_conf.runMethod(true,"setVisible",frm_etiquetas.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_ed_id_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Ed_ID_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,480);
if (RapidSub.canDelegate("btn_ed_id_click")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_ed_id_click"); return;}
ResumableSub_Btn_Ed_ID_Click rsub = new ResumableSub_Btn_Ed_ID_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Ed_ID_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ed_ID_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Ed_ID_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,480);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 481;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(1);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 482;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(2);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 483;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(4);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 487;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(64);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.mostCurrent.activityBA);
 BA.debugLineNum = 489;BA.debugLine="Base = Activity";
Debug.ShouldStop(256);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 490;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(512);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 493;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese la ip\"";
Debug.ShouldStop(4096);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese la ip"));
 BA.debugLineNum = 494;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(8192);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 497;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_ed_id_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 498;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 499;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 501;BA.debugLine="Changes = True";
Debug.ShouldStop(1048576);
parent._changes = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 502;BA.debugLine="Lbl_IP.Text = InputTemplate.Text";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbl_ip.runMethod(true,"setText",BA.ObjectToCharSequence(_inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _complete(RemoteObject _res) throws Exception{
}
public static void  _btn_ed_nombre_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Ed_Nombre_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,506);
if (RapidSub.canDelegate("btn_ed_nombre_click")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_ed_nombre_click"); return;}
ResumableSub_Btn_Ed_Nombre_Click rsub = new ResumableSub_Btn_Ed_Nombre_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Ed_Nombre_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ed_Nombre_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Ed_Nombre_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,506);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 507;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(67108864);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 508;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(134217728);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 509;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(268435456);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 513;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(1);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.mostCurrent.activityBA);
 BA.debugLineNum = 515;BA.debugLine="Base = Activity";
Debug.ShouldStop(4);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 516;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(8);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 520;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el nombre\"";
Debug.ShouldStop(128);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese el nombre"));
 BA.debugLineNum = 521;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(256);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 523;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_ed_nombre_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 524;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 525;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 527;BA.debugLine="Changes = True";
Debug.ShouldStop(16384);
parent._changes = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 528;BA.debugLine="Lbl_Nombre.Text = InputTemplate.Text";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_nombre.runMethod(true,"setText",BA.ObjectToCharSequence(_inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 529;BA.debugLine="End Sub";
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
public static void  _btn_ed_precio_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Ed_Precio_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,624);
if (RapidSub.canDelegate("btn_ed_precio_click")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_ed_precio_click"); return;}
ResumableSub_Btn_Ed_Precio_Click rsub = new ResumableSub_Btn_Ed_Precio_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Ed_Precio_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ed_Precio_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _aux = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Ed_Precio_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,624);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 626;BA.debugLine="InputListAsync(stringListPrice, \"Seleccione preci";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("InputListAsync",(Object)(parent.mostCurrent._stringlistprice),(Object)(BA.ObjectToCharSequence("Seleccione precio ")),(Object)(parent._selectedprice),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 627;BA.debugLine="Wait For InputList_Result (Index As Int)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","inputlist_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_ed_precio_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_index = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Index", _index);
;
 BA.debugLineNum = 628;BA.debugLine="If Index <> DialogResponse.CANCEL Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 629;BA.debugLine="SelectedPrice = Index";
Debug.ShouldStop(1048576);
parent._selectedprice = _index;
 BA.debugLineNum = 630;BA.debugLine="Dim  aux As OtherPriceData = DataPrice.Get(Index";
Debug.ShouldStop(2097152);
_aux = (parent.mostCurrent._dataprice.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("aux", _aux);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 631;BA.debugLine="stringPrecio = aux.KOLT&\"|\"&aux.NOKOLT";
Debug.ShouldStop(4194304);
parent._stringprecio = RemoteObject.concat(_aux.getField(true,"KOLT" /*RemoteObject*/ ),RemoteObject.createImmutable("|"),_aux.getField(true,"NOKOLT" /*RemoteObject*/ ));
 BA.debugLineNum = 632;BA.debugLine="Lbl_precio_act.Text = stringPrecio";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbl_precio_act.runMethod(true,"setText",BA.ObjectToCharSequence(parent._stringprecio));
 BA.debugLineNum = 633;BA.debugLine="Changes = True";
Debug.ShouldStop(16777216);
parent._changes = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _inputlist_result(RemoteObject _index) throws Exception{
}
public static void  _btn_editarpuerto_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_editarPuerto_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,643);
if (RapidSub.canDelegate("btn_editarpuerto_click")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_editarpuerto_click"); return;}
ResumableSub_Btn_editarPuerto_Click rsub = new ResumableSub_Btn_editarPuerto_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_editarPuerto_Click extends BA.ResumableSub {
public ResumableSub_Btn_editarPuerto_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_editarPuerto_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,643);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 644;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(8);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 645;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(16);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 646;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(32);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 648;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(128);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.mostCurrent.activityBA);
 BA.debugLineNum = 649;BA.debugLine="Base = Activity";
Debug.ShouldStop(256);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 650;BA.debugLine="dialog.Initialize(Base)";
Debug.ShouldStop(512);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 652;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el puerto\"";
Debug.ShouldStop(2048);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese el puerto"));
 BA.debugLineNum = 653;BA.debugLine="If (Lbl_puerto.Text <> Null) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if ((RemoteObject.solveBoolean("N",parent.mostCurrent._lbl_puerto.runMethod(true,"getText")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 654;BA.debugLine="InputTemplate.Text = Lbl_puerto.Text";
Debug.ShouldStop(8192);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,parent.mostCurrent._lbl_puerto.runMethod(true,"getText"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 656;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(32768);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 660;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
Debug.ShouldStop(524288);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 662;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"Gua";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_editarpuerto_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("Guardar"))),(Object)(RemoteObject.createImmutable(("Por defecto"))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 663;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"CANCEL"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 664;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 666;BA.debugLine="If(Res = DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(33554432);

case 10:
//if
this.state = 13;
if ((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 667;BA.debugLine="Changes = True";
Debug.ShouldStop(67108864);
parent._changes = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 668;BA.debugLine="Lbl_puerto.Text = 9100";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_puerto.runMethod(true,"setText",BA.ObjectToCharSequence(9100));
 if (true) break;
;
 BA.debugLineNum = 670;BA.debugLine="If(Res = DialogResponse.POSITIVE) Then";
Debug.ShouldStop(536870912);

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 671;BA.debugLine="Changes = True";
Debug.ShouldStop(1073741824);
parent._changes = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 672;BA.debugLine="Lbl_puerto.Text = InputTemplate.Text";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_puerto.runMethod(true,"setText",BA.ObjectToCharSequence(_inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _btn_etq1_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Etq1_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,471);
if (RapidSub.canDelegate("btn_etq1_click")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_etq1_click");}
 BA.debugLineNum = 471;BA.debugLine="Private Sub Btn_Etq1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="StartActivity(Frm_impresion)";
Debug.ShouldStop(8388608);
frm_etiquetas.mostCurrent.__c.runVoidMethod ("StartActivity",frm_etiquetas.processBA,(Object)((frm_etiquetas.mostCurrent._frm_impresion.getObject())));
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_etq2_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Etq2_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,476);
if (RapidSub.canDelegate("btn_etq2_click")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_etq2_click");}
 BA.debugLineNum = 476;BA.debugLine="Private Sub Btn_Etq2_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 477;BA.debugLine="StartActivity(Frm_impresion)";
Debug.ShouldStop(268435456);
frm_etiquetas.mostCurrent.__c.runVoidMethod ("StartActivity",frm_etiquetas.processBA,(Object)((frm_etiquetas.mostCurrent._frm_impresion.getObject())));
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_guardar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Guardar_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,566);
if (RapidSub.canDelegate("btn_guardar_click")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_guardar_click"); return;}
ResumableSub_Btn_Guardar_Click rsub = new ResumableSub_Btn_Guardar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Guardar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Guardar_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _result1 = RemoteObject.createImmutable(false);
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Guardar_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,566);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 567;BA.debugLine="Wait For (Btn_Probar_Conexion_Click) Complete (Re";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), _btn_probar_conexion_click());
this.state = 27;
return;
case 27:
//C
this.state = 1;
_result1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result1", _result1);
;
 BA.debugLineNum = 569;BA.debugLine="If IsEnabled Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 26;
if (parent._isenabled.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 570;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(33554432);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 571;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
Debug.ShouldStop(67108864);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("save.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 572;BA.debugLine="Msgbox2Async(\"¿Desea guardar la configuración ac";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Desea guardar la configuración actual?")),(Object)(BA.ObjectToCharSequence("Configuración local")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("No")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 573;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 574;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 575;BA.debugLine="If Lbl_puerto.Text <> \"---\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._lbl_puerto.runMethod(true,"getText"),BA.ObjectToString("---"))) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 577;BA.debugLine="If Lbl_IP.Text <> \"---\" Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._lbl_ip.runMethod(true,"getText"),BA.ObjectToString("---"))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 578;BA.debugLine="If Lbl_Nombre.Text <> \"---\" Then";
Debug.ShouldStop(2);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",parent.mostCurrent._lbl_nombre.runMethod(true,"getText"),BA.ObjectToString("---"))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 580;BA.debugLine="CrearDatos";
Debug.ShouldStop(8);
_creardatos();
 BA.debugLineNum = 581;BA.debugLine="Btn_Etq1.Enabled = True";
Debug.ShouldStop(16);
parent.mostCurrent._btn_etq1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 582;BA.debugLine="Lbl_Imprimir.Visible = False";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_imprimir.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 583;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(64);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 584;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.p";
Debug.ShouldStop(128);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 585;BA.debugLine="Msgbox2Async(\"Datos guardados correctamente\"";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Datos guardados correctamente")),(Object)(BA.ObjectToCharSequence("Configuración Impresora")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 586;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 29;
return;
case 29:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 587;BA.debugLine="Btn_Cerrar_Click";
Debug.ShouldStop(1024);
_btn_cerrar_click();
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 589;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4096);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 590;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-d";
Debug.ShouldStop(8192);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("security-danger.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 591;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, asigne un nombre")),(Object)(BA.ObjectToCharSequence("Configuración Impresora")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 592;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 30;
return;
case 30:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 593;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 596;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(524288);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 597;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
Debug.ShouldStop(1048576);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("security-danger.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 598;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne una ip")),(Object)(BA.ObjectToCharSequence("Configuración Impresora ")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 599;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 600;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 603;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(67108864);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 604;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
Debug.ShouldStop(134217728);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("security-danger.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 605;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne un puerto")),(Object)(BA.ObjectToCharSequence("Configuración Impresora ")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 606;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 607;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 612;BA.debugLine="Btn_Cerrar.Enabled = True";
Debug.ShouldStop(8);
parent.mostCurrent._btn_cerrar.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 613;BA.debugLine="Btn_Etq1.Enabled = True";
Debug.ShouldStop(16);
parent.mostCurrent._btn_etq1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 615;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 617;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(256);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 618;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
Debug.ShouldStop(512);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("security-danger.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 619;BA.debugLine="Msgbox2Async(\"Antes de guardar una configuración";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Antes de guardar una configuración se debe de probar conexión")),(Object)(BA.ObjectToCharSequence("Configuración local")),(Object)(BA.ObjectToString("Continuar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 620;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 33;
return;
case 33:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _btn_probar_conexion_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Probar_Conexion_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,531);
if (RapidSub.canDelegate("btn_probar_conexion_click")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_probar_conexion_click");}
ResumableSub_Btn_Probar_Conexion_Click rsub = new ResumableSub_Btn_Probar_Conexion_Click(null);
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
public static class ResumableSub_Btn_Probar_Conexion_Click extends BA.ResumableSub {
public ResumableSub_Btn_Probar_Conexion_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Probar_Conexion_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,531);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 543;BA.debugLine="If Ping(Lbl_IP.Text) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (_ping(parent.mostCurrent._lbl_ip.runMethod(true,"getText")).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 544;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(-2147483648);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 545;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
Debug.ShouldStop(1);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 546;BA.debugLine="Msgbox2Async(\"Conexión exitosa\" , \"Notificación\"";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Conexión exitosa")),(Object)(BA.ObjectToCharSequence("Notificación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 547;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_probar_conexion_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 549;BA.debugLine="IsEnabled = True";
Debug.ShouldStop(16);
parent._isenabled = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 550;BA.debugLine="Changes = False";
Debug.ShouldStop(32);
parent._changes = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 551;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
Debug.ShouldStop(64);
parent.mostCurrent._btn_guardar.runVoidMethod ("setColor",parent._colorenabled);
 BA.debugLineNum = 552;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 554;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(512);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 555;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
Debug.ShouldStop(1024);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("security-danger.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 556;BA.debugLine="Msgbox2Async(\"Conexión Fallida\" , \"Notificación\",";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Conexión Fallida")),(Object)(BA.ObjectToCharSequence("Notificación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 557;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "btn_probar_conexion_click"), null);
this.state = 6;
return;
case 6:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 558;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 560;BA.debugLine="End Sub";
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
public static RemoteObject  _btn_volver_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Volver_Click (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,638);
if (RapidSub.canDelegate("btn_volver_click")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","btn_volver_click");}
 BA.debugLineNum = 638;BA.debugLine="Private Sub Btn_Volver_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 639;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
frm_etiquetas.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 641;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargarlista() throws Exception{
try {
		Debug.PushSubsStack("CargarLista (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,230);
if (RapidSub.canDelegate("cargarlista")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","cargarlista"); return;}
ResumableSub_CargarLista rsub = new ResumableSub_CargarLista(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargarLista extends BA.ResumableSub {
public ResumableSub_CargarLista(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _listapersonas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result5 = RemoteObject.createImmutable(0);
RemoteObject _et = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._etiqueta");
RemoteObject _job = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _size = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ancho = RemoteObject.createImmutable("");
RemoteObject _alto = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _etiqueta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject group21;
int index21;
int groupLen21;
RemoteObject group55;
int index55;
int groupLen55;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargarLista (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,230);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 231;BA.debugLine="ProgressDialogShow2(\"Cargando etiquetas\",False)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",frm_etiquetas.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Cargando etiquetas")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 232;BA.debugLine="clv.Clear";
Debug.ShouldStop(128);
parent.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 233;BA.debugLine="Dim ListaPersonas As List";
Debug.ShouldStop(256);
_listapersonas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListaPersonas", _listapersonas);
 BA.debugLineNum = 234;BA.debugLine="ListaPersonas.Initialize";
Debug.ShouldStop(512);
_listapersonas.runVoidMethod ("Initialize");
 BA.debugLineNum = 240;BA.debugLine="Dim Js As HttpJob = Sb_TraerEtiquetas(Me)";
Debug.ShouldStop(32768);
_js = _sb_traeretiquetas(frm_etiquetas.getObject());Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 241;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "cargarlista"), (_js));
this.state = 32;
return;
case 32:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 243;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 28;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 244;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(524288);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 246;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 247;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4194304);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 248;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 250;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
Debug.ShouldStop(33554432);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 251;BA.debugLine="Msgbox2Async(\"No hay etiquetas de tipo '(Movil)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No hay etiquetas de tipo '(Movil)' en la base de datos.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 252;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "cargarlista"), null);
this.state = 33;
return;
case 33:
//C
this.state = 7;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 254;BA.debugLine="If(Result5 = DialogResponse.POSITIVE)Then";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 256;BA.debugLine="Btn_Etq1.Enabled = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._btn_etq1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 259;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 262;BA.debugLine="Etiquetas = ParseEtiquetas(vJson)";
Debug.ShouldStop(32);
parent._etiquetas = _parseetiquetas(_vjson);
 BA.debugLineNum = 264;BA.debugLine="For Each ET As Etiqueta In Etiquetas";
Debug.ShouldStop(128);
if (true) break;

case 12:
//for
this.state = 21;
group21 = parent._etiquetas;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ET", _et);
this.state = 34;
if (true) break;

case 34:
//C
this.state = 21;
if (index21 < groupLen21) {
this.state = 14;
_et = (group21.runMethod(false,"Get",index21));Debug.locals.put("ET", _et);}
if (true) break;

case 35:
//C
this.state = 34;
index21++;
Debug.locals.put("ET", _et);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 265;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 266;BA.debugLine="job.Initialize(\"\", Me)";
Debug.ShouldStop(512);
_job.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.processBA,(Object)(BA.ObjectToString("")),(Object)(frm_etiquetas.getObject()));
 BA.debugLineNum = 271;BA.debugLine="Dim size As Map = GetLabelSizeInches(ET.FUNCION";
Debug.ShouldStop(16384);
_size = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_size = _getlabelsizeinches(_et.getField(true,"FUNCION" /*RemoteObject*/ ),BA.numberCast(int.class, 203));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 273;BA.debugLine="Dim Ancho As String = size.Get(\"Width\")";
Debug.ShouldStop(65536);
_ancho = BA.ObjectToString(_size.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Width")))));Debug.locals.put("Ancho", _ancho);Debug.locals.put("Ancho", _ancho);
 BA.debugLineNum = 274;BA.debugLine="Dim Alto As String = size.Get(\"Length\")";
Debug.ShouldStop(131072);
_alto = BA.ObjectToString(_size.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Length")))));Debug.locals.put("Alto", _alto);Debug.locals.put("Alto", _alto);
 BA.debugLineNum = 276;BA.debugLine="Log(\"Ancho: \" & Ancho & \" in\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","216449582",RemoteObject.concat(RemoteObject.createImmutable("Ancho: "),_ancho,RemoteObject.createImmutable(" in")),0);
 BA.debugLineNum = 277;BA.debugLine="Log(\"Alto: \" & Alto & \" in\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","216449583",RemoteObject.concat(RemoteObject.createImmutable("Alto: "),_alto,RemoteObject.createImmutable(" in")),0);
 BA.debugLineNum = 278;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/pr";
Debug.ShouldStop(2097152);
_job.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://api.labelary.com/v1/printers/8dpmm/labels/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ancho))),RemoteObject.createImmutable("x"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alto))),RemoteObject.createImmutable("/0/")))),(Object)(_et.getField(true,"FUNCION" /*RemoteObject*/ )));
 BA.debugLineNum = 281;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"image/png\")";
Debug.ShouldStop(16777216);
_job.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("image/png")));
 BA.debugLineNum = 283;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "cargarlista"), (_job));
this.state = 36;
return;
case 36:
//C
this.state = 15;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 284;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 15:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 285;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
Debug.ShouldStop(268435456);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _j.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getbitmap" /*RemoteObject*/ );Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 286;BA.debugLine="Dim Etiqueta As Map";
Debug.ShouldStop(536870912);
_etiqueta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Etiqueta", _etiqueta);
 BA.debugLineNum = 287;BA.debugLine="Etiqueta.Initialize";
Debug.ShouldStop(1073741824);
_etiqueta.runVoidMethod ("Initialize");
 BA.debugLineNum = 288;BA.debugLine="Etiqueta.Put(\"tipo\", ET.NombreEtiqueta)";
Debug.ShouldStop(-2147483648);
_etiqueta.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo"))),(Object)((_et.getField(true,"NombreEtiqueta" /*RemoteObject*/ ))));
 BA.debugLineNum = 289;BA.debugLine="Etiqueta.Put(\"imagen\", bmp)";
Debug.ShouldStop(1);
_etiqueta.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imagen"))),(Object)((_bmp.getObject())));
 BA.debugLineNum = 292;BA.debugLine="ListaPersonas.Add(Etiqueta)";
Debug.ShouldStop(8);
_listapersonas.runVoidMethod ("Add",(Object)((_etiqueta.getObject())));
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 295;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","216449601",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 296;BA.debugLine="ToastMessageShow(\"No se pudo generar la etique";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No se pudo generar la etiqueta")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 20:
//C
this.state = 35;
;
 BA.debugLineNum = 298;BA.debugLine="j.Release";
Debug.ShouldStop(512);
_j.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;
if (true) break;

case 21:
//C
this.state = 28;
Debug.locals.put("ET", _et);
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 303;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
Debug.ShouldStop(16384);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 304;BA.debugLine="Msgbox2Async(\"Error al traer las etiquetas.\", \"E";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error al traer las etiquetas.")),(Object)(BA.ObjectToCharSequence("Error")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 305;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "cargarlista"), null);
this.state = 37;
return;
case 37:
//C
this.state = 24;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 306;BA.debugLine="If(Result5 = DialogResponse.POSITIVE)Then";
Debug.ShouldStop(131072);
if (true) break;

case 24:
//if
this.state = 27;
if ((RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 307;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 309;BA.debugLine="Btn_Etq1.Enabled = False";
Debug.ShouldStop(1048576);
parent.mostCurrent._btn_etq1.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 312;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 314;BA.debugLine="For Each Etiqueta As Map In ListaPersonas";
Debug.ShouldStop(33554432);

case 28:
//for
this.state = 31;
_etiqueta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group55 = _listapersonas;
index55 = 0;
groupLen55 = group55.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Etiqueta", _etiqueta);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 31;
if (index55 < groupLen55) {
this.state = 30;
_etiqueta = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group55.runMethod(false,"Get",index55));Debug.locals.put("Etiqueta", _etiqueta);}
if (true) break;

case 39:
//C
this.state = 38;
index55++;
Debug.locals.put("Etiqueta", _etiqueta);
if (true) break;

case 30:
//C
this.state = 39;
 BA.debugLineNum = 315;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), parent.mostCurrent._xui.runMethod(false,"CreatePanel",frm_etiquetas.processBA,(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 316;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clv.AsView.Width, 2";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 317;BA.debugLine="p.LoadLayout(\"item_nombre_imagen\")";
Debug.ShouldStop(268435456);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("item_nombre_imagen")),frm_etiquetas.mostCurrent.activityBA);
 BA.debugLineNum = 319;BA.debugLine="LBL_NOM.Text = Etiqueta.Get(\"tipo\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbl_nom.runMethod(true,"setText",BA.ObjectToCharSequence(_etiqueta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo"))))));
 BA.debugLineNum = 320;BA.debugLine="IMGVIEW.Bitmap = Etiqueta.Get(\"imagen\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._imgview.runClassMethod (BaKapp.Movil.Tag.b4ximageview.class, "_setbitmap" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _etiqueta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imagen"))))));
 BA.debugLineNum = 322;BA.debugLine="clv.Add(p, Etiqueta.Get(\"tipo\"))";
Debug.ShouldStop(2);
parent.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)(_etiqueta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo"))))));
 if (true) break;
if (true) break;

case 31:
//C
this.state = -1;
Debug.locals.put("Etiqueta", _etiqueta);
;
 BA.debugLineNum = 324;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemClick (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,680);
if (RapidSub.canDelegate("clv_itemclick")) { BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","clv_itemclick", _index, _value); return;}
ResumableSub_clv_ItemClick rsub = new ResumableSub_clv_ItemClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_clv_ItemClick extends BA.ResumableSub {
public ResumableSub_clv_ItemClick(BaKapp.Movil.Tag.frm_etiquetas parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result5 = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("clv_ItemClick (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,680);
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
 BA.debugLineNum = 681;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(256);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 682;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(512);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 683;BA.debugLine="Msgbox2Async(\"Etiqueta seleccionada: \"&Value , \"C";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Etiqueta seleccionada: "),_value))),(Object)(BA.ObjectToCharSequence("Confirmación de etiqueta")),(Object)(BA.ObjectToString("Seleccionar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Cancelar")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 684;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "clv_itemclick"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result5 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result5", _result5);
;
 BA.debugLineNum = 686;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result5,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 687;BA.debugLine="default = Value";
Debug.ShouldStop(16384);
parent._default = BA.ObjectToString(_value);
 BA.debugLineNum = 688;BA.debugLine="ToastMessageShow(\"La etiqueta \"&default& \"Design";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("La etiqueta "),parent._default,RemoteObject.createImmutable("Designada para impresión")))),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 689;BA.debugLine="Btn_Etq1_Click";
Debug.ShouldStop(65536);
_btn_etq1_click();
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 692;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 BA.debugLineNum = 693;BA.debugLine="End Sub";
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
public static RemoteObject  _creardatos() throws Exception{
try {
		Debug.PushSubsStack("CrearDatos (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,176);
if (RapidSub.canDelegate("creardatos")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","creardatos");}
RemoteObject _iptext = RemoteObject.createImmutable("");
RemoteObject _ipint = RemoteObject.createImmutable(0);
RemoteObject _aux = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");
RemoteObject _stringnoprecio = RemoteObject.createImmutable("");
 BA.debugLineNum = 176;BA.debugLine="Sub CrearDatos()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 178;BA.debugLine="Dim datos As Map";
Debug.ShouldStop(131072);
frm_etiquetas.mostCurrent._datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 179;BA.debugLine="datos.Initialize";
Debug.ShouldStop(262144);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Initialize");
 BA.debugLineNum = 180;BA.debugLine="datos.Put(\"Ip\",Lbl_IP.Text )";
Debug.ShouldStop(524288);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Ip"))),(Object)((frm_etiquetas.mostCurrent._lbl_ip.runMethod(true,"getText"))));
 BA.debugLineNum = 181;BA.debugLine="datos.Put(\"Nombre\", Lbl_Nombre.Text )";
Debug.ShouldStop(1048576);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((frm_etiquetas.mostCurrent._lbl_nombre.runMethod(true,"getText"))));
 BA.debugLineNum = 182;BA.debugLine="datos.Put(\"Seleccionado\", SelectedPrice)";
Debug.ShouldStop(2097152);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Seleccionado"))),(Object)((frm_etiquetas._selectedprice)));
 BA.debugLineNum = 183;BA.debugLine="Dim ipText As String = Lbl_puerto.Text";
Debug.ShouldStop(4194304);
_iptext = frm_etiquetas.mostCurrent._lbl_puerto.runMethod(true,"getText");Debug.locals.put("ipText", _iptext);Debug.locals.put("ipText", _iptext);
 BA.debugLineNum = 184;BA.debugLine="Dim IpINT As Int =  ipText";
Debug.ShouldStop(8388608);
_ipint = BA.numberCast(int.class, _iptext);Debug.locals.put("IpINT", _ipint);Debug.locals.put("IpINT", _ipint);
 BA.debugLineNum = 185;BA.debugLine="datos.Put(\"Puerto\", IpINT)";
Debug.ShouldStop(16777216);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Puerto"))),(Object)((_ipint)));
 BA.debugLineNum = 186;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
Debug.ShouldStop(33554432);
_aux = (frm_etiquetas.mostCurrent._dataprice.runMethod(false,"Get",(Object)(frm_etiquetas._selectedprice)));Debug.locals.put("aux", _aux);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 187;BA.debugLine="stringPrecio = aux.KOLT";
Debug.ShouldStop(67108864);
frm_etiquetas._stringprecio = _aux.getField(true,"KOLT" /*RemoteObject*/ );
 BA.debugLineNum = 188;BA.debugLine="Dim stringNoPrecio As String  = aux.NOKOLT";
Debug.ShouldStop(134217728);
_stringnoprecio = _aux.getField(true,"NOKOLT" /*RemoteObject*/ );Debug.locals.put("stringNoPrecio", _stringnoprecio);Debug.locals.put("stringNoPrecio", _stringnoprecio);
 BA.debugLineNum = 189;BA.debugLine="datos.Put(\"KOLT\",stringPrecio )";
Debug.ShouldStop(268435456);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("KOLT"))),(Object)((frm_etiquetas._stringprecio)));
 BA.debugLineNum = 190;BA.debugLine="datos.Put(\"NOKOLT\",stringNoPrecio )";
Debug.ShouldStop(536870912);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NOKOLT"))),(Object)((_stringnoprecio)));
 BA.debugLineNum = 192;BA.debugLine="File.WriteMap(File.DirInternal, \"impresora.map\",";
Debug.ShouldStop(-2147483648);
frm_etiquetas.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("impresora.map")),(Object)(frm_etiquetas.mostCurrent._datos));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esperarconfirmacion() throws Exception{
try {
		Debug.PushSubsStack("EsperarConfirmacion (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,561);
if (RapidSub.canDelegate("esperarconfirmacion")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","esperarconfirmacion");}
ResumableSub_EsperarConfirmacion rsub = new ResumableSub_EsperarConfirmacion(null);
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
public static class ResumableSub_EsperarConfirmacion extends BA.ResumableSub {
public ResumableSub_EsperarConfirmacion(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_etiquetas parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EsperarConfirmacion (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,561);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
 BA.debugLineNum = 562;BA.debugLine="Wait For Btn_Probar_Conexion_Click";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","btn_probar_conexion_click", frm_etiquetas.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_etiquetas", "esperarconfirmacion"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 563;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 564;BA.debugLine="End Sub";
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
public static RemoteObject  _getlabelsizeinches(RemoteObject _zpl,RemoteObject _dpi) throws Exception{
try {
		Debug.PushSubsStack("GetLabelSizeInches (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,201);
if (RapidSub.canDelegate("getlabelsizeinches")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","getlabelsizeinches", _zpl, _dpi);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _widthdots = RemoteObject.createImmutable(0);
RemoteObject _lengthdots = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _m2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _widthinches = RemoteObject.createImmutable(0);
RemoteObject _lengthinches = RemoteObject.createImmutable(0);
Debug.locals.put("zpl", _zpl);
Debug.locals.put("dpi", _dpi);
 BA.debugLineNum = 201;BA.debugLine="Public Sub GetLabelSizeInches(zpl As String, dpi A";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Dim res As Map";
Debug.ShouldStop(512);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 203;BA.debugLine="res.Initialize";
Debug.ShouldStop(1024);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 205;BA.debugLine="Dim widthDots As Int = 0";
Debug.ShouldStop(4096);
_widthdots = BA.numberCast(int.class, 0);Debug.locals.put("widthDots", _widthdots);Debug.locals.put("widthDots", _widthdots);
 BA.debugLineNum = 206;BA.debugLine="Dim lengthDots As Int = 0";
Debug.ShouldStop(8192);
_lengthdots = BA.numberCast(int.class, 0);Debug.locals.put("lengthDots", _lengthdots);Debug.locals.put("lengthDots", _lengthdots);
 BA.debugLineNum = 209;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\^PW(\\d+)\", zpl";
Debug.ShouldStop(65536);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = frm_etiquetas.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("\\^PW(\\d+)")),(Object)(_zpl));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 210;BA.debugLine="If m.Find Then";
Debug.ShouldStop(131072);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="widthDots = m.Group(1)";
Debug.ShouldStop(262144);
_widthdots = BA.numberCast(int.class, _m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("widthDots", _widthdots);
 };
 BA.debugLineNum = 215;BA.debugLine="Dim m2 As Matcher = Regex.Matcher(\"\\^LL(\\d+)\", zp";
Debug.ShouldStop(4194304);
_m2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m2 = frm_etiquetas.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("\\^LL(\\d+)")),(Object)(_zpl));Debug.locals.put("m2", _m2);Debug.locals.put("m2", _m2);
 BA.debugLineNum = 216;BA.debugLine="If m2.Find Then";
Debug.ShouldStop(8388608);
if (_m2.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="lengthDots = m2.Group(1)";
Debug.ShouldStop(16777216);
_lengthdots = BA.numberCast(int.class, _m2.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("lengthDots", _lengthdots);
 };
 BA.debugLineNum = 221;BA.debugLine="Dim widthInches As Double = widthDots / dpi";
Debug.ShouldStop(268435456);
_widthinches = RemoteObject.solve(new RemoteObject[] {_widthdots,_dpi}, "/",0, 0);Debug.locals.put("widthInches", _widthinches);Debug.locals.put("widthInches", _widthinches);
 BA.debugLineNum = 222;BA.debugLine="Dim lengthInches As Double = lengthDots / dpi";
Debug.ShouldStop(536870912);
_lengthinches = RemoteObject.solve(new RemoteObject[] {_lengthdots,_dpi}, "/",0, 0);Debug.locals.put("lengthInches", _lengthinches);Debug.locals.put("lengthInches", _lengthinches);
 BA.debugLineNum = 224;BA.debugLine="res.Put(\"Width\", widthInches)";
Debug.ShouldStop(-2147483648);
_res.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Width"))),(Object)((_widthinches)));
 BA.debugLineNum = 225;BA.debugLine="res.Put(\"Length\", lengthInches)";
Debug.ShouldStop(1);
_res.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Length"))),(Object)((_lengthinches)));
 BA.debugLineNum = 227;BA.debugLine="Return res";
Debug.ShouldStop(4);
if (true) return _res;
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Private PrinterMap As Map";
frm_etiquetas.mostCurrent._printermap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 23;BA.debugLine="Private PrinterList As ListView";
frm_etiquetas.mostCurrent._printerlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private SelectedPrinterIP As String  ' IP de la i";
frm_etiquetas.mostCurrent._selectedprinterip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim datos As Map";
frm_etiquetas.mostCurrent._datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 26;BA.debugLine="Dim xui As XUI";
frm_etiquetas.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 27;BA.debugLine="Dim IsEnabled As Boolean";
frm_etiquetas._isenabled = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 28;BA.debugLine="Private Btn_Conf As Button";
frm_etiquetas.mostCurrent._btn_conf = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Btn_Cerrar As Button";
frm_etiquetas.mostCurrent._btn_cerrar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private General As Panel";
frm_etiquetas.mostCurrent._general = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Panel_Conf As Panel";
frm_etiquetas.mostCurrent._panel_conf = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Btn_Etq1 As Button";
frm_etiquetas.mostCurrent._btn_etq1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Btn_Etq2 As Button";
frm_etiquetas.mostCurrent._btn_etq2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Img_Venta As ImageView";
frm_etiquetas.mostCurrent._img_venta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Img_bodega As ImageView";
frm_etiquetas.mostCurrent._img_bodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Btn_Ed_Nombre As Button";
frm_etiquetas.mostCurrent._btn_ed_nombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Btn_Ed_ID As Button";
frm_etiquetas.mostCurrent._btn_ed_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_Nombre As Label";
frm_etiquetas.mostCurrent._lbl_nombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim stringListPrice As List";
frm_etiquetas.mostCurrent._stringlistprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_Estado As Label";
frm_etiquetas.mostCurrent._lbl_estado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Btn_Probar_Conexion As Button";
frm_etiquetas.mostCurrent._btn_probar_conexion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Lbl_Imprimir As Label";
frm_etiquetas.mostCurrent._lbl_imprimir = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Lbl_IP As Label";
frm_etiquetas.mostCurrent._lbl_ip = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private clv As CustomListView";
frm_etiquetas.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 45;BA.debugLine="Private ColorEnabled As Int = Colors.RGB(86,73,25";
frm_etiquetas._colorenabled = frm_etiquetas.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 86)),(Object)(BA.numberCast(int.class, 73)),(Object)(BA.numberCast(int.class, 255)));
 //BA.debugLineNum = 46;BA.debugLine="Private ColorDisabled As Int = Colors.RGB(162,156";
frm_etiquetas._colordisabled = frm_etiquetas.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 162)),(Object)(BA.numberCast(int.class, 156)),(Object)(BA.numberCast(int.class, 255)));
 //BA.debugLineNum = 47;BA.debugLine="Dim SelectedPrice As Int";
frm_etiquetas._selectedprice = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 48;BA.debugLine="Private Btn_Guardar As Button";
frm_etiquetas.mostCurrent._btn_guardar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Label5 As Label";
frm_etiquetas.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Dim DataPrice As List";
frm_etiquetas.mostCurrent._dataprice = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 51;BA.debugLine="Private Btn_Ed_Precio As Button";
frm_etiquetas.mostCurrent._btn_ed_precio = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Dim Changes As Boolean";
frm_etiquetas._changes = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 54;BA.debugLine="Private Btn_Volver As Button";
frm_etiquetas.mostCurrent._btn_volver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Lbl_precio_act As Label";
frm_etiquetas.mostCurrent._lbl_precio_act = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private Lbl_puerto As Label";
frm_etiquetas.mostCurrent._lbl_puerto = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private Btn_editarPuerto As Button";
frm_etiquetas.mostCurrent._btn_editarpuerto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private LBL_NOM As Label";
frm_etiquetas.mostCurrent._lbl_nom = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private IMGVIEW As B4XImageView";
frm_etiquetas.mostCurrent._imgview = RemoteObject.createNew ("BaKapp.Movil.Tag.b4ximageview");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _leerdatos() throws Exception{
try {
		Debug.PushSubsStack("LeerDatos (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,370);
if (RapidSub.canDelegate("leerdatos")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","leerdatos");}
RemoteObject _aux = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 370;BA.debugLine="Sub LeerDatos()";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
Debug.ShouldStop(262144);
if (frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("impresora.map"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 372;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
Debug.ShouldStop(524288);
frm_etiquetas.mostCurrent._datos = frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("impresora.map")));
 BA.debugLineNum = 373;BA.debugLine="Lbl_IP.Text = datos.Get(\"Ip\")";
Debug.ShouldStop(1048576);
frm_etiquetas.mostCurrent._lbl_ip.runMethod(true,"setText",BA.ObjectToCharSequence(frm_etiquetas.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ip"))))));
 BA.debugLineNum = 374;BA.debugLine="Lbl_Nombre.Text = datos.Get(\"Nombre\")";
Debug.ShouldStop(2097152);
frm_etiquetas.mostCurrent._lbl_nombre.runMethod(true,"setText",BA.ObjectToCharSequence(frm_etiquetas.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre"))))));
 BA.debugLineNum = 375;BA.debugLine="Lbl_precio_act.Text =  datos.Get(\"KOLT\")  &\"|\"&";
Debug.ShouldStop(4194304);
frm_etiquetas.mostCurrent._lbl_precio_act.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(frm_etiquetas.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOLT")))),RemoteObject.createImmutable("|"),frm_etiquetas.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOLT")))))));
 BA.debugLineNum = 376;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Select";
Debug.ShouldStop(8388608);
_aux = (frm_etiquetas.mostCurrent._dataprice.runMethod(false,"Get",(Object)(frm_etiquetas._selectedprice)));Debug.locals.put("aux", _aux);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 377;BA.debugLine="SelectedPrice = datos.Get(\"Seleccionado\")";
Debug.ShouldStop(16777216);
frm_etiquetas._selectedprice = BA.numberCast(int.class, frm_etiquetas.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Seleccionado")))));
 BA.debugLineNum = 378;BA.debugLine="stringPrecio = aux.KOLT";
Debug.ShouldStop(33554432);
frm_etiquetas._stringprecio = _aux.getField(true,"KOLT" /*RemoteObject*/ );
 BA.debugLineNum = 379;BA.debugLine="Lbl_puerto.Text = datos.Get(\"Puerto\")";
Debug.ShouldStop(67108864);
frm_etiquetas.mostCurrent._lbl_puerto.runMethod(true,"setText",BA.ObjectToCharSequence(frm_etiquetas.mostCurrent._datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Puerto"))))));
 BA.debugLineNum = 380;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(134217728);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 381;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
Debug.ShouldStop(268435456);
_bmp1 = frm_etiquetas.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 382;BA.debugLine="Msgbox2Async(\"Se encontro la configuración de im";
Debug.ShouldStop(536870912);
frm_etiquetas.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Se encontro la configuración de impresora")),(Object)(BA.ObjectToCharSequence("Impresora encontrada")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(frm_etiquetas.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 383;BA.debugLine="Btn_Etq1.Enabled=True";
Debug.ShouldStop(1073741824);
frm_etiquetas.mostCurrent._btn_etq1.runMethod(true,"setEnabled",frm_etiquetas.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 384;BA.debugLine="Lbl_Imprimir.Visible = False";
Debug.ShouldStop(-2147483648);
frm_etiquetas.mostCurrent._lbl_imprimir.runMethod(true,"setVisible",frm_etiquetas.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 386;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(2);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 387;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
Debug.ShouldStop(4);
_bmp1 = frm_etiquetas.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_etiquetas.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 388;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
Debug.ShouldStop(8);
frm_etiquetas.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora.")),(Object)(BA.ObjectToCharSequence("Alerta")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_etiquetas.processBA,(Object)(frm_etiquetas.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 389;BA.debugLine="Btn_Conf_Click";
Debug.ShouldStop(16);
_btn_conf_click();
 BA.debugLineNum = 390;BA.debugLine="Btn_Cerrar.Enabled = False";
Debug.ShouldStop(32);
frm_etiquetas.mostCurrent._btn_cerrar.runMethod(true,"setEnabled",frm_etiquetas.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 392;BA.debugLine="Log(\"El archivo no existe.\")";
Debug.ShouldStop(128);
frm_etiquetas.mostCurrent.__c.runVoidMethod ("LogImpl","216646166",RemoteObject.createImmutable("El archivo no existe."),0);
 BA.debugLineNum = 393;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
Debug.ShouldStop(256);
frm_etiquetas.mostCurrent._datos.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseetiquetas(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("ParseEtiquetas (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,349);
if (RapidSub.canDelegate("parseetiquetas")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","parseetiquetas", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tablelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._etiqueta");
Debug.locals.put("Json", _json);
 BA.debugLineNum = 349;BA.debugLine="Sub ParseEtiquetas(Json As String ) As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 351;BA.debugLine="parser.Initialize(Json)";
Debug.ShouldStop(1073741824);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 352;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(-2147483648);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 353;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
Debug.ShouldStop(1);
_tablelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tablelist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("tableList", _tablelist);Debug.locals.put("tableList", _tablelist);
 BA.debugLineNum = 355;BA.debugLine="Dim result As List";
Debug.ShouldStop(4);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 356;BA.debugLine="result.Initialize";
Debug.ShouldStop(8);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 358;BA.debugLine="For Each entry As Map In tableList";
Debug.ShouldStop(32);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _tablelist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 359;BA.debugLine="Dim data As Etiqueta";
Debug.ShouldStop(64);
_data = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._etiqueta");Debug.locals.put("data", _data);
 BA.debugLineNum = 360;BA.debugLine="data.Initialize";
Debug.ShouldStop(128);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 361;BA.debugLine="data.NombreEtiqueta = entry.Get(\"NombreEtiqueta\"";
Debug.ShouldStop(256);
_data.setField ("NombreEtiqueta" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreEtiqueta"))))));
 BA.debugLineNum = 362;BA.debugLine="data.FUNCION = entry.Get(\"FUNCION\")";
Debug.ShouldStop(512);
_data.setField ("FUNCION" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FUNCION"))))));
 BA.debugLineNum = 365;BA.debugLine="result.Add(data)";
Debug.ShouldStop(4096);
_result.runVoidMethod ("Add",(Object)((_data)));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 368;BA.debugLine="Return result";
Debug.ShouldStop(32768);
if (true) return _result;
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseotherpricejson(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("ParseOtherPriceJSON (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,119);
if (RapidSub.canDelegate("parseotherpricejson")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","parseotherpricejson", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tablelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherpricedata");
Debug.locals.put("json", _json);
 BA.debugLineNum = 119;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 121;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 122;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 123;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
Debug.ShouldStop(67108864);
_tablelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tablelist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("tableList", _tablelist);Debug.locals.put("tableList", _tablelist);
 BA.debugLineNum = 125;BA.debugLine="Dim result As List";
Debug.ShouldStop(268435456);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 126;BA.debugLine="result.Initialize";
Debug.ShouldStop(536870912);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="For Each entry As Map In tableList";
Debug.ShouldStop(-2147483648);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _tablelist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 129;BA.debugLine="Dim data As OtherPriceData";
Debug.ShouldStop(1);
_data = RemoteObject.createNew ("BaKapp.Movil.Tag.frm_impresion._otherpricedata");Debug.locals.put("data", _data);
 BA.debugLineNum = 130;BA.debugLine="data.Initialize";
Debug.ShouldStop(2);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 131;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
Debug.ShouldStop(4);
_data.setField ("TILT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TILT"))))));
 BA.debugLineNum = 132;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
Debug.ShouldStop(8);
_data.setField ("KOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOLT"))))));
 BA.debugLineNum = 133;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
Debug.ShouldStop(16);
_data.setField ("MELT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MELT"))))));
 BA.debugLineNum = 134;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
Debug.ShouldStop(32);
_data.setField ("MOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MOLT"))))));
 BA.debugLineNum = 135;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
Debug.ShouldStop(64);
_data.setField ("TIMOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMOLT"))))));
 BA.debugLineNum = 136;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
Debug.ShouldStop(128);
_data.setField ("NOKOLT" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOLT"))))));
 BA.debugLineNum = 138;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",_entry.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("FEVI"))))) && RemoteObject.solveBoolean("N",_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FEVI")))))) { 
 BA.debugLineNum = 139;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
Debug.ShouldStop(1024);
_data.setField ("FEVI" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FEVI"))))));
 }else {
 BA.debugLineNum = 141;BA.debugLine="data.FEVI = \"\"";
Debug.ShouldStop(4096);
_data.setField ("FEVI" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 BA.debugLineNum = 144;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
Debug.ShouldStop(32768);
_data.setField ("OPERA" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OPERA"))))));
 BA.debugLineNum = 145;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
Debug.ShouldStop(65536);
_data.setField ("ECUDEF01UD" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ECUDEF01UD"))))));
 BA.debugLineNum = 146;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
Debug.ShouldStop(131072);
_data.setField ("ECUDEF02UD" /*RemoteObject*/ ,BA.ObjectToString(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ECUDEF02UD"))))));
 BA.debugLineNum = 148;BA.debugLine="result.Add(data)";
Debug.ShouldStop(524288);
_result.runVoidMethod ("Add",(Object)((_data)));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 151;BA.debugLine="Return result";
Debug.ShouldStop(4194304);
if (true) return _result;
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ping(RemoteObject _ip) throws Exception{
try {
		Debug.PushSubsStack("Ping (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,444);
if (RapidSub.canDelegate("ping")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","ping", _ip);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("IP", _ip);
 BA.debugLineNum = 444;BA.debugLine="Sub Ping(IP As String) As Boolean";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 446;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 447;BA.debugLine="Dim r As Int = p.Shell(\"ping -c 1 -w 1 \" & IP, N";
Debug.ShouldStop(1073741824);
_r = _p.runMethod(true,"Shell",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ping -c 1 -w 1 "),_ip)),(Object)((frm_etiquetas.mostCurrent.__c.getField(false,"Null"))),(Object)((frm_etiquetas.mostCurrent.__c.getField(false,"Null"))),(Object)((frm_etiquetas.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 448;BA.debugLine="Return (r = 0)  ' Si el ping es exitoso, devuelv";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, 0))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",frm_etiquetas.processBA, e6.toString()); BA.debugLineNum = 450;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) return frm_etiquetas.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Serial1 As Serial";
frm_etiquetas._serial1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial");
 //BA.debugLineNum = 10;BA.debugLine="Private ConnectedPrinter As Socket";
frm_etiquetas._connectedprinter = RemoteObject.createNew ("anywheresoftware.b4a.objects.SocketWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private AStreams As AsyncStreams";
frm_etiquetas._astreams = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
 //BA.debugLineNum = 13;BA.debugLine="Dim stringPrecio As String";
frm_etiquetas._stringprecio = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim Etiquetas As List";
frm_etiquetas._etiquetas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 15;BA.debugLine="Dim default As String";
frm_etiquetas._default = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb_buscarlistaprecios(RemoteObject _me_) throws Exception{
try {
		Debug.PushSubsStack("Sb_BuscarListaPrecios (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,154);
if (RapidSub.canDelegate("sb_buscarlistaprecios")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","sb_buscarlistaprecios", _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 154;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(134217728);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 162;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(2);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_etiquetas.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 163;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(4);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 165;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(16);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 166;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(32);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 167;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(64);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 168;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(128);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_BuscarListaPrecios\""))));
 BA.debugLineNum = 170;BA.debugLine="Return Js";
Debug.ShouldStop(512);
if (true) return _js;
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Sb_TraerEtiquetas (frm_etiquetas) ","frm_etiquetas",17,frm_etiquetas.mostCurrent.activityBA,frm_etiquetas.mostCurrent,328);
if (RapidSub.canDelegate("sb_traeretiquetas")) { return BaKapp.Movil.Tag.frm_etiquetas.remoteMe.runUserSub(false, "frm_etiquetas","sb_traeretiquetas", _me_);}
RemoteObject _vxml = RemoteObject.createImmutable("");
RemoteObject _poststring = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
Debug.locals.put("Me_", _me_);
 BA.debugLineNum = 328;BA.debugLine="Private Sub Sb_TraerEtiquetas(Me_ As Object) As Ht";
Debug.ShouldStop(128);
 BA.debugLineNum = 330;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(512);
_vxml = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"),RemoteObject.createImmutable("  <soap:Body>\n"),RemoteObject.createImmutable("    <Sb_TraerEtiquetas xmlns=\"http://BakApp\" />\n"),RemoteObject.createImmutable("  </soap:Body>\n"),RemoteObject.createImmutable("</soap:Envelope>\n"),RemoteObject.createImmutable("")));Debug.locals.put("vXml", _vxml);Debug.locals.put("vXml", _vxml);
 BA.debugLineNum = 338;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
Debug.ShouldStop(131072);
_poststring = RemoteObject.concat(RemoteObject.createImmutable("http://"),frm_etiquetas.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,RemoteObject.createImmutable("/Ws_BakApp.asmx"));Debug.locals.put("PostString", _poststring);Debug.locals.put("PostString", _poststring);
 BA.debugLineNum = 339;BA.debugLine="Dim Js As HttpJob";
Debug.ShouldStop(262144);
_js = RemoteObject.createNew ("BaKapp.Movil.Tag.httpjob");Debug.locals.put("Js", _js);
 BA.debugLineNum = 341;BA.debugLine="Js.Initialize(\"\",Me_)'";
Debug.ShouldStop(1048576);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_initialize" /*RemoteObject*/ ,frm_etiquetas.processBA,(Object)(BA.ObjectToString("")),(Object)(_me_));
 BA.debugLineNum = 342;BA.debugLine="Js.PostString(PostString,vXml)";
Debug.ShouldStop(2097152);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_poststring),(Object)(_vxml));
 BA.debugLineNum = 343;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
Debug.ShouldStop(4194304);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("text/xml; charset=utf-8")));
 BA.debugLineNum = 344;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
Debug.ShouldStop(8388608);
_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("SOAPAction")),(Object)((RemoteObject.createImmutable("\"http://BakApp/Sb_TraerEtiquetas\""))));
 BA.debugLineNum = 345;BA.debugLine="Return Js";
Debug.ShouldStop(16777216);
if (true) return _js;
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}