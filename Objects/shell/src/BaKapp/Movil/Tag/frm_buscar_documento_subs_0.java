package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_buscar_documento_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"Op_Edita_Print_Email_Etc\")";
Debug.ShouldStop(1024);
frm_buscar_documento.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Op_Edita_Print_Email_Etc")),frm_buscar_documento.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="If Tido = \"COV\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",frm_buscar_documento._tido,BA.ObjectToString("COV"))) { 
 BA.debugLineNum = 46;BA.debugLine="Btn_Transformar_NVV.Enabled = False";
Debug.ShouldStop(8192);
frm_buscar_documento.mostCurrent._btn_transformar_nvv.runMethod(true,"setEnabled",frm_buscar_documento.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 49;BA.debugLine="If Tido = \"COV\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",frm_buscar_documento._tido,BA.ObjectToString("COV"))) { 
 BA.debugLineNum = 50;BA.debugLine="Lbl_Etiqueta.Text = \"Cotización: \" & Nudo";
Debug.ShouldStop(131072);
frm_buscar_documento.mostCurrent._lbl_etiqueta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Cotización: "),frm_buscar_documento._nudo)));
 BA.debugLineNum = 51;BA.debugLine="Btn_Transformar_NVV.Enabled = True";
Debug.ShouldStop(262144);
frm_buscar_documento.mostCurrent._btn_transformar_nvv.runMethod(true,"setEnabled",frm_buscar_documento.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 54;BA.debugLine="If Tido = \"NVV\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",frm_buscar_documento._tido,BA.ObjectToString("NVV"))) { 
 BA.debugLineNum = 55;BA.debugLine="Lbl_Etiqueta.Text = \"Nota de venta: \" & Nudo";
Debug.ShouldStop(4194304);
frm_buscar_documento.mostCurrent._lbl_etiqueta.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Nota de venta: "),frm_buscar_documento._nudo)));
 BA.debugLineNum = 56;BA.debugLine="Btn_Transformar_NVV.Enabled = False";
Debug.ShouldStop(8388608);
frm_buscar_documento.mostCurrent._btn_transformar_nvv.runMethod(true,"setEnabled",frm_buscar_documento.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 59;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
Debug.ShouldStop(67108864);
frm_buscar_documento.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_initialize" /*RemoteObject*/ ,frm_buscar_documento.mostCurrent.activityBA,(Object)(frm_buscar_documento.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 60;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
Debug.ShouldStop(134217728);
frm_buscar_documento.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_designercreateview" /*RemoteObject*/ ,(Object)((frm_buscar_documento.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), frm_buscar_documento.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), frm_buscar_documento.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 62;BA.debugLine="ClFx.Initialize(Null,\"\")";
Debug.ShouldStop(536870912);
frm_buscar_documento.mostCurrent._clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_initialize" /*RemoteObject*/ ,frm_buscar_documento.mostCurrent.activityBA,(Object)(frm_buscar_documento.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 63;BA.debugLine="ClFx.DesignerCreateView(Activity,Null,Null)";
Debug.ShouldStop(1073741824);
frm_buscar_documento.mostCurrent._clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_designercreateview" /*RemoteObject*/ ,(Object)((frm_buscar_documento.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), frm_buscar_documento.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), frm_buscar_documento.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_KeyPress (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,499);
if (RapidSub.canDelegate("activity_keypress")) { return BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 499;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 501;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, frm_buscar_documento.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 502;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return frm_buscar_documento.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,71);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,67);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","activity_resume");}
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Btn_Cerrar_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,483);
if (RapidSub.canDelegate("btn_cerrar_click")) { BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","btn_cerrar_click"); return;}
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
public ResumableSub_Btn_Cerrar_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Cerrar_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,483);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 485;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(16);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 487;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(64);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 489;BA.debugLine="Msgbox2Async(\"¿Confirma cerrar la ventana?\",\"C E";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Confirma cerrar la ventana?")),(Object)(BA.ObjectToCharSequence("C E R R A R")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 490;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_cerrar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 492;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 493;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
Debug.ShouldStop(4096);
parent.mostCurrent._frm_post_01_formulario._grabar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 494;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 497;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static void  _btn_editar_documento_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Documento_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,119);
if (RapidSub.canDelegate("btn_editar_documento_click")) { BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","btn_editar_documento_click"); return;}
ResumableSub_Btn_Editar_Documento_Click rsub = new ResumableSub_Btn_Editar_Documento_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Editar_Documento_Click extends BA.ResumableSub {
public ResumableSub_Btn_Editar_Documento_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _editardocumento = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.createImmutable(false);
RemoteObject _msg = RemoteObject.createImmutable("");
RemoteObject _rsrow = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _permitir = RemoteObject.createImmutable(false);
RemoteObject _haydifprecios = RemoteObject.createImmutable(false);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _permiso = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.createImmutable("");
RemoteObject _versionws = RemoteObject.createImmutable("");
RemoteObject _usar_precio_original = RemoteObject.createImmutable(false);
RemoteObject _msp = RemoteObject.createImmutable("");
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _rst = RemoteObject.createImmutable(false);
RemoteObject _newdoc = RemoteObject.declareNull("BaKapp.Movil.Tag.crear_documento");
RemoteObject _rowentidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_docenc = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Documento_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,119);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 121;BA.debugLine="Dim EditarDocumento As String = \"\"";
Debug.ShouldStop(16777216);
_editardocumento = BA.ObjectToString("");Debug.locals.put("EditarDocumento", _editardocumento);Debug.locals.put("EditarDocumento", _editardocumento);
 BA.debugLineNum = 123;BA.debugLine="If Tido = \"COV\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._tido,BA.ObjectToString("COV"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 124;BA.debugLine="EditarDocumento = \"Editar Documento.\"";
Debug.ShouldStop(134217728);
_editardocumento = BA.ObjectToString("Editar Documento.");Debug.locals.put("EditarDocumento", _editardocumento);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 127;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"proforma-edit.";
Debug.ShouldStop(1073741824);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("proforma-edit.png")));
 BA.debugLineNum = 128;BA.debugLine="Msgbox2Async(\"Editar documento\", Tido & \"-\" & Nud";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Editar documento")),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(parent._tido,RemoteObject.createImmutable("-"),parent._nudo))),(Object)(BA.ObjectToString("Editar Observaciones.")),(Object)(BA.ObjectToString("Cancelar")),(Object)(_editardocumento),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 129;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 64;
return;
case 64:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 131;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 133;BA.debugLine="Frm_Editar_ObsOc.Idmaeedo = Idmaeedo";
Debug.ShouldStop(16);
parent.mostCurrent._frm_editar_obsoc._idmaeedo /*RemoteObject*/  = parent._idmaeedo;
 BA.debugLineNum = 134;BA.debugLine="Frm_Editar_ObsOc.Observaciones = Observaciones";
Debug.ShouldStop(32);
parent.mostCurrent._frm_editar_obsoc._observaciones /*RemoteObject*/  = parent._observaciones;
 BA.debugLineNum = 135;BA.debugLine="Frm_Editar_ObsOc.Orden_compra = OCC";
Debug.ShouldStop(64);
parent.mostCurrent._frm_editar_obsoc._orden_compra /*RemoteObject*/  = parent._occ;
 BA.debugLineNum = 136;BA.debugLine="StartActivity(Frm_Editar_ObsOc)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_buscar_documento.processBA,(Object)((parent.mostCurrent._frm_editar_obsoc.getObject())));
 if (true) break;
;
 BA.debugLineNum = 140;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(2048);

case 8:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 142;BA.debugLine="Wait For(Sb_SePuedeEditarDocumento) Complete (Rs";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _sb_sepuedeeditardocumento());
this.state = 65;
return;
case 65:
//C
this.state = 11;
_rs = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rs", _rs);
;
 BA.debugLineNum = 144;BA.debugLine="If Not(Rs) Then";
Debug.ShouldStop(32768);
if (true) break;

case 11:
//if
this.state = 21;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rs)).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 145;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(65536);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 146;BA.debugLine="Dim Msg As String";
Debug.ShouldStop(131072);
_msg = RemoteObject.createImmutable("");Debug.locals.put("Msg", _msg);
 BA.debugLineNum = 147;BA.debugLine="If Tido = \"COV\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent._tido,BA.ObjectToString("COV"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 148;BA.debugLine="Msg = \"No se puede editar este documento ya qu";
Debug.ShouldStop(524288);
_msg = BA.ObjectToString("No se puede editar este documento ya que es sustentatorio de una NOTA DE VENTA");Debug.locals.put("Msg", _msg);
 if (true) break;
;
 BA.debugLineNum = 150;BA.debugLine="If Tido = \"NVV\" Then";
Debug.ShouldStop(2097152);

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",parent._tido,BA.ObjectToString("NVV"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 151;BA.debugLine="Msg = \"No se puede editar este documento ya qu";
Debug.ShouldStop(4194304);
_msg = BA.ObjectToString("No se puede editar este documento ya que es sustentatorio de una FACTURA");Debug.locals.put("Msg", _msg);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 153;BA.debugLine="Msgbox2Async(Msg,\"Validación\", \"Ok\",\"\",\"\", bmp1";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msg)),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 154;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 158;BA.debugLine="Wait For(Sb_RevisarDifPrecios) Complete (RsRow A";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _sb_revisardifprecios());
this.state = 66;
return;
case 66:
//C
this.state = 22;
_rsrow = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("RsRow", _rsrow);
;
 BA.debugLineNum = 160;BA.debugLine="If RsRow = Null Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("n",_rsrow)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 161;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 165;BA.debugLine="Dim Permitir As Boolean = RsRow.Get(\"Permitir\")";
Debug.ShouldStop(16);
_permitir = BA.ObjectToBoolean(_rsrow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Permitir")))));Debug.locals.put("Permitir", _permitir);Debug.locals.put("Permitir", _permitir);
 BA.debugLineNum = 166;BA.debugLine="Dim HayDifPrecios As Boolean = RsRow.Get(\"HayDif";
Debug.ShouldStop(32);
_haydifprecios = BA.ObjectToBoolean(_rsrow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HayDifPrecios")))));Debug.locals.put("HayDifPrecios", _haydifprecios);Debug.locals.put("HayDifPrecios", _haydifprecios);
 BA.debugLineNum = 167;BA.debugLine="Dim Error As String = RsRow.Get(\"Error\")";
Debug.ShouldStop(64);
_error = BA.ObjectToString(_rsrow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 168;BA.debugLine="Dim Permiso As String = RsRow.Get(\"Permiso\")";
Debug.ShouldStop(128);
_permiso = BA.ObjectToString(_rsrow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Permiso")))));Debug.locals.put("Permiso", _permiso);Debug.locals.put("Permiso", _permiso);
 BA.debugLineNum = 169;BA.debugLine="Dim Respuesta As String = RsRow.Get(\"Respuesta\")";
Debug.ShouldStop(256);
_respuesta = BA.ObjectToString(_rsrow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Respuesta")))));Debug.locals.put("Respuesta", _respuesta);Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 170;BA.debugLine="Dim VersionWs As String	 = RsRow.Get(\"VersionWs\"";
Debug.ShouldStop(512);
_versionws = BA.ObjectToString(_rsrow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VersionWs")))));Debug.locals.put("VersionWs", _versionws);Debug.locals.put("VersionWs", _versionws);
 BA.debugLineNum = 172;BA.debugLine="If Error <> \"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",_error,BA.ObjectToString(""))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 173;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
Debug.ShouldStop(4096);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 174;BA.debugLine="Msgbox2Async(Error,\"Error WebService\", \"Ok\",\"\",";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_error)),(Object)(BA.ObjectToCharSequence("Error WebService")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 175;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 176;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 179;BA.debugLine="Dim	Usar_Precio_Original As Boolean";
Debug.ShouldStop(262144);
_usar_precio_original = RemoteObject.createImmutable(false);Debug.locals.put("Usar_Precio_Original", _usar_precio_original);
 BA.debugLineNum = 181;BA.debugLine="If HayDifPrecios Then";
Debug.ShouldStop(1048576);
if (true) break;

case 30:
//if
this.state = 54;
if (_haydifprecios.<Boolean>get().booleanValue()) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 183;BA.debugLine="Dim MsP As String";
Debug.ShouldStop(4194304);
_msp = RemoteObject.createImmutable("");Debug.locals.put("MsP", _msp);
 BA.debugLineNum = 184;BA.debugLine="If Not(Permitir) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 33:
//if
this.state = 38;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_permitir)).<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 185;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
Debug.ShouldStop(16777216);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("security-danger.png")));
 BA.debugLineNum = 186;BA.debugLine="MsP = CRLF & \" *(Requiere permiso)\"";
Debug.ShouldStop(33554432);
_msp = RemoteObject.concat(parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" *(Requiere permiso)"));Debug.locals.put("MsP", _msp);
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 188;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"warning.png";
Debug.ShouldStop(134217728);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("warning.png")));
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 191;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(1073741824);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 193;BA.debugLine="Msgbox2Async(Respuesta,\"Documento vencido\" & Ms";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_respuesta)),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Documento vencido"),_msp))),(Object)(BA.ObjectToString("Dejar precio original (*)")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("Dejar Precio Actual")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 194;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 68;
return;
case 68:
//C
this.state = 39;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 196;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(8);
if (true) break;

case 39:
//if
this.state = 50;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 198;BA.debugLine="If Not(Permitir) Then";
Debug.ShouldStop(32);
if (true) break;

case 42:
//if
this.state = 49;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_permitir)).<Boolean>get().booleanValue()) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 200;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_validarpermisousuario" /*RemoteObject*/ ,(Object)(_permiso)));
this.state = 69;
return;
case 69:
//C
this.state = 45;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 202;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(512);
if (true) break;

case 45:
//if
this.state = 48;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rst)).<Boolean>get().booleanValue()) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 203;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 208;BA.debugLine="Usar_Precio_Original = True";
Debug.ShouldStop(32768);
_usar_precio_original = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Usar_Precio_Original", _usar_precio_original);
 if (true) break;
;
 BA.debugLineNum = 212;BA.debugLine="If Result= XUI.DialogResponse_Cancel Then";
Debug.ShouldStop(524288);

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Cancel")))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 213;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 218;BA.debugLine="Dim NewDoc As Crear_Documento";
Debug.ShouldStop(33554432);
_newdoc = RemoteObject.createNew ("BaKapp.Movil.Tag.crear_documento");Debug.locals.put("NewDoc", _newdoc);
 BA.debugLineNum = 220;BA.debugLine="NewDoc.Initialize";
Debug.ShouldStop(134217728);
_newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_initialize" /*RemoteObject*/ ,frm_buscar_documento.processBA);
 BA.debugLineNum = 221;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
Debug.ShouldStop(268435456);
_newdoc.setField ("_idmaeedo" /*RemoteObject*/ ,parent._idmaeedo);
 BA.debugLineNum = 222;BA.debugLine="NewDoc.Usar_Precio_Original = Usar_Precio_Origin";
Debug.ShouldStop(536870912);
_newdoc.setField ("_usar_precio_original" /*RemoteObject*/ ,_usar_precio_original);
 BA.debugLineNum = 224;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Com";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_entidad" /*RemoteObject*/ ,(Object)(parent._koen),(Object)(parent._suen)));
this.state = 70;
return;
case 70:
//C
this.state = 55;
_rowentidad = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("RowEntidad", _rowentidad);
;
 BA.debugLineNum = 226;BA.debugLine="If RowEntidad = Null Then";
Debug.ShouldStop(2);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("n",_rowentidad)) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 227;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 58:
//C
this.state = 59;
;
 BA.debugLineNum = 230;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
Debug.ShouldStop(32);
_newdoc.setField ("_row_entidad" /*RemoteObject*/ ,_rowentidad);
 BA.debugLineNum = 232;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_nuevo_documento" /*RemoteObject*/ ));
this.state = 71;
return;
case 71:
//C
this.state = 59;
_id_docenc = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Id_DocEnc", _id_docenc);
;
 BA.debugLineNum = 234;BA.debugLine="If Id_DocEnc <> 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean("!",_id_docenc,BA.numberCast(double.class, 0))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 236;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
Debug.ShouldStop(2048);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 237;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Ahora puede editar el documento")),(Object)(BA.ObjectToCharSequence("Editar Documento")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 238;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 72;
return;
case 72:
//C
this.state = 62;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 240;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
Debug.ShouldStop(32768);
parent.mostCurrent._frm_post_01_formulario._id_docenc /*RemoteObject*/  = _id_docenc;
 BA.debugLineNum = 241;BA.debugLine="Frm_Post_01_Formulario.Idmaeedo_Origen = Idmaee";
Debug.ShouldStop(65536);
parent.mostCurrent._frm_post_01_formulario._idmaeedo_origen /*RemoteObject*/  = parent._idmaeedo;
 BA.debugLineNum = 242;BA.debugLine="Frm_Post_01_Formulario.TipoDoc = Tido";
Debug.ShouldStop(131072);
parent.mostCurrent._frm_post_01_formulario._tipodoc /*RemoteObject*/  = parent._tido;
 BA.debugLineNum = 243;BA.debugLine="Frm_Post_01_Formulario.Nudo_Origen = Nudo";
Debug.ShouldStop(262144);
parent.mostCurrent._frm_post_01_formulario._nudo_origen /*RemoteObject*/  = parent._nudo;
 BA.debugLineNum = 244;BA.debugLine="Frm_Post_01_Formulario.Editar_Documento = True";
Debug.ShouldStop(524288);
parent.mostCurrent._frm_post_01_formulario._editar_documento /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 246;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_buscar_documento.processBA,(Object)((parent.mostCurrent._frm_post_01_formulario.getObject())));
 BA.debugLineNum = 247;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
 BA.debugLineNum = 253;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _rs) throws Exception{
}
public static void  _btn_enviar_correo_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Enviar_Correo_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,314);
if (RapidSub.canDelegate("btn_enviar_correo_click")) { BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","btn_enviar_correo_click"); return;}
ResumableSub_Btn_Enviar_Correo_Click rsub = new ResumableSub_Btn_Enviar_Correo_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Enviar_Correo_Click extends BA.ResumableSub {
public ResumableSub_Btn_Enviar_Correo_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Enviar_Correo_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,314);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 316;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(134217728);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 317;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-back";
Debug.ShouldStop(268435456);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("send-mail-back.png")));
 BA.debugLineNum = 319;BA.debugLine="Msgbox2Async(\"¿Confirma enviar el correo?\",\"CORRE";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Confirma enviar el correo?")),(Object)(BA.ObjectToCharSequence("CORREO")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 320;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 322;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 323;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 330;BA.debugLine="Wait For(ClFx.Fx_Enviar_Correo_Bakapp1(Idmaeedo,K";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), parent.mostCurrent._clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_enviar_correo_bakapp1" /*RemoteObject*/ ,(Object)(parent._idmaeedo),(Object)(parent._koen),(Object)(parent._suen),(Object)(parent._para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.mostCurrent.__c.getField(true,"True"))));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 334;BA.debugLine="If Resultado = \"Ok\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 14;
 BA.debugLineNum = 335;BA.debugLine="Para =	ClFx.NewPara";
Debug.ShouldStop(16384);
parent._para = parent.mostCurrent._clfx.getField(true,"_newpara" /*RemoteObject*/ );
 BA.debugLineNum = 336;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(32768);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 337;BA.debugLine="Msgbox2Async(\"correo enviado correctamente\",\"Cor";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("correo enviado correctamente")),(Object)(BA.ObjectToCharSequence("Correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 338;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 340;BA.debugLine="If Resultado.ToLowerCase <> \"cancelado por el us";
Debug.ShouldStop(524288);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_resultado.runMethod(true,"toLowerCase"),BA.ObjectToString("cancelado por el usuario"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 341;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(1048576);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 342;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar correo\"";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al enviar correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 343;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), null);
this.state = 18;
return;
case 18:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
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
 BA.debugLineNum = 347;BA.debugLine="End Sub";
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
public static void  _btn_enviar_correo_imprimir_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Enviar_Correo_Imprimir_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,349);
if (RapidSub.canDelegate("btn_enviar_correo_imprimir_click")) { BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","btn_enviar_correo_imprimir_click"); return;}
ResumableSub_Btn_Enviar_Correo_Imprimir_Click rsub = new ResumableSub_Btn_Enviar_Correo_Imprimir_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Enviar_Correo_Imprimir_Click extends BA.ResumableSub {
public ResumableSub_Btn_Enviar_Correo_Imprimir_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Enviar_Correo_Imprimir_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,349);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 351;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(1073741824);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 352;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-back";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("send-mail-back-printer.png")));
 BA.debugLineNum = 354;BA.debugLine="Msgbox2Async(\"¿Confirma imprimir y reenviar corre";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Confirma imprimir y reenviar correo?")),(Object)(BA.ObjectToCharSequence("EMAIL-IMPRIMIR")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 355;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 357;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 358;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 365;BA.debugLine="Wait For(ClFx.Fx_Imprimir_Bakapp(Idmaeedo)) Compl";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), parent.mostCurrent._clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_imprimir_bakapp" /*RemoteObject*/ ,(Object)(parent._idmaeedo)));
this.state = 18;
return;
case 18:
//C
this.state = 5;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 367;BA.debugLine="If Resultado = \"Ok\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 368;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(32768);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 369;BA.debugLine="Msgbox2Async(\"Impresión enviada correctamente\",";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Impresión enviada correctamente")),(Object)(BA.ObjectToCharSequence("Imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 370;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 372;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(524288);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 373;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\", \"Ok\"";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 374;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 375;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 382;BA.debugLine="Wait For(ClFx.Fx_Enviar_Correo_Bakapp1(Idmaeedo,K";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), parent.mostCurrent._clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_enviar_correo_bakapp1" /*RemoteObject*/ ,(Object)(parent._idmaeedo),(Object)(parent._koen),(Object)(parent._suen),(Object)(parent._para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.mostCurrent.__c.getField(true,"True"))));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 386;BA.debugLine="If Resultado = \"Ok\" Then";
Debug.ShouldStop(2);
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 BA.debugLineNum = 387;BA.debugLine="Para =	ClFx.NewPara";
Debug.ShouldStop(4);
parent._para = parent.mostCurrent._clfx.getField(true,"_newpara" /*RemoteObject*/ );
 BA.debugLineNum = 388;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(8);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 389;BA.debugLine="Msgbox2Async(\"correo enviado correctamente\",\"Cor";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("correo enviado correctamente")),(Object)(BA.ObjectToCharSequence("Correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 390;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 392;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(128);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 393;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar correo\",";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al enviar correo")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 394;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 23;
return;
case 23:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _btn_imprimir_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Imprimir_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,285);
if (RapidSub.canDelegate("btn_imprimir_click")) { BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","btn_imprimir_click"); return;}
ResumableSub_Btn_Imprimir_Click rsub = new ResumableSub_Btn_Imprimir_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Imprimir_Click extends BA.ResumableSub {
public ResumableSub_Btn_Imprimir_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Imprimir_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,285);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 287;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(1073741824);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("XUI", _xui);
 BA.debugLineNum = 288;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("printer.png")));
 BA.debugLineNum = 290;BA.debugLine="Msgbox2Async(\"¿Confirma imprimir el documento?\",\"";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Confirma imprimir el documento?")),(Object)(BA.ObjectToCharSequence("IMPRIMIR")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 291;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_imprimir_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 293;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 294;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 301;BA.debugLine="Wait For(ClFx.Fx_Imprimir_Bakapp(Idmaeedo)) Compl";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_imprimir_click"), parent.mostCurrent._clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_imprimir_bakapp" /*RemoteObject*/ ,(Object)(parent._idmaeedo)));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 303;BA.debugLine="If Resultado = \"Ok\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_resultado,BA.ObjectToString("Ok"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 304;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(32768);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 305;BA.debugLine="Msgbox2Async(\"Impresión enviada correctamente\",";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Impresión enviada correctamente")),(Object)(BA.ObjectToCharSequence("Imprimir")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 307;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(262144);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 308;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\", \"Ace";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_resultado)),(Object)(BA.ObjectToCharSequence("Error al imprimir")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 309;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 312;BA.debugLine="End Sub";
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
public static void  _btn_transformar_nvv_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Transformar_NVV_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,76);
if (RapidSub.canDelegate("btn_transformar_nvv_click")) { BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","btn_transformar_nvv_click"); return;}
ResumableSub_Btn_Transformar_NVV_Click rsub = new ResumableSub_Btn_Transformar_NVV_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Transformar_NVV_Click extends BA.ResumableSub {
public ResumableSub_Btn_Transformar_NVV_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _newdoc = RemoteObject.declareNull("BaKapp.Movil.Tag.crear_documento");
RemoteObject _rowentidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_docenc = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Transformar_NVV_Click (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,76);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 78;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"proforma-ok-2.";
Debug.ShouldStop(8192);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("proforma-ok-2.png")));
 BA.debugLineNum = 79;BA.debugLine="Msgbox2Async(\"¿Confirma la creación de la NVV?\",";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Confirma la creación de la NVV?")),(Object)(BA.ObjectToCharSequence("Transformar a NVV")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_transformar_nvv_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 82;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 86;BA.debugLine="Dim NewDoc As Crear_Documento";
Debug.ShouldStop(2097152);
_newdoc = RemoteObject.createNew ("BaKapp.Movil.Tag.crear_documento");Debug.locals.put("NewDoc", _newdoc);
 BA.debugLineNum = 87;BA.debugLine="NewDoc.Initialize";
Debug.ShouldStop(4194304);
_newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_initialize" /*RemoteObject*/ ,frm_buscar_documento.processBA);
 BA.debugLineNum = 88;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
Debug.ShouldStop(8388608);
_newdoc.setField ("_idmaeedo" /*RemoteObject*/ ,parent._idmaeedo);
 BA.debugLineNum = 89;BA.debugLine="NewDoc.Crear_NVV_Desde_COV = True";
Debug.ShouldStop(16777216);
_newdoc.setField ("_crear_nvv_desde_cov" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="NewDoc.Usar_Precio_Original = True";
Debug.ShouldStop(33554432);
_newdoc.setField ("_usar_precio_original" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Comp";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_transformar_nvv_click"), _newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_entidad" /*RemoteObject*/ ,(Object)(parent._koen),(Object)(parent._suen)));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_rowentidad = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("RowEntidad", _rowentidad);
;
 BA.debugLineNum = 93;BA.debugLine="If RowEntidad = Null Then";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("n",_rowentidad)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 94;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 97;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
Debug.ShouldStop(1);
_newdoc.setField ("_row_entidad" /*RemoteObject*/ ,_rowentidad);
 BA.debugLineNum = 99;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "btn_transformar_nvv_click"), _newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_nuevo_documento" /*RemoteObject*/ ));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_id_docenc = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Id_DocEnc", _id_docenc);
;
 BA.debugLineNum = 101;BA.debugLine="If Id_DocEnc <> 0 Then";
Debug.ShouldStop(16);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_id_docenc,BA.numberCast(double.class, 0))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 103;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(64);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 104;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",\"";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Ahora puede editar el documento")),(Object)(BA.ObjectToCharSequence("Editar Documento")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_buscar_documento.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 106;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
Debug.ShouldStop(512);
parent.mostCurrent._frm_post_01_formulario._id_docenc /*RemoteObject*/  = _id_docenc;
 BA.debugLineNum = 107;BA.debugLine="Frm_Post_01_Formulario.Crear_NVV_Desde_COV = Tru";
Debug.ShouldStop(1024);
parent.mostCurrent._frm_post_01_formulario._crear_nvv_desde_cov /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 108;BA.debugLine="Frm_Post_01_Formulario.Idmaeedo_Origen = Idmaeed";
Debug.ShouldStop(2048);
parent.mostCurrent._frm_post_01_formulario._idmaeedo_origen /*RemoteObject*/  = parent._idmaeedo;
 BA.debugLineNum = 109;BA.debugLine="Frm_Post_01_Formulario.Nudo_Origen = Nudo";
Debug.ShouldStop(4096);
parent.mostCurrent._frm_post_01_formulario._nudo_origen /*RemoteObject*/  = parent._nudo;
 BA.debugLineNum = 110;BA.debugLine="Frm_Post_01_Formulario.TipoDoc = \"NVV\"";
Debug.ShouldStop(8192);
parent.mostCurrent._frm_post_01_formulario._tipodoc /*RemoteObject*/  = BA.ObjectToString("NVV");
 BA.debugLineNum = 112;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_buscar_documento.processBA,(Object)((parent.mostCurrent._frm_post_01_formulario.getObject())));
 BA.debugLineNum = 113;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 12:
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Dim bmp1 As Bitmap";
frm_buscar_documento.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Btn_Transformar_NVV As Button";
frm_buscar_documento.mostCurrent._btn_transformar_nvv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Btn_Editar_Documento As Button";
frm_buscar_documento.mostCurrent._btn_editar_documento = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Btn_Imprimir As Button";
frm_buscar_documento.mostCurrent._btn_imprimir = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Btn_Enviar_Correo As Button";
frm_buscar_documento.mostCurrent._btn_enviar_correo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Btn_Enviar_Correo_Imprimir As Button";
frm_buscar_documento.mostCurrent._btn_enviar_correo_imprimir = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Lbl_Etiqueta As Label";
frm_buscar_documento.mostCurrent._lbl_etiqueta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Btn_Cerrar As Button";
frm_buscar_documento.mostCurrent._btn_cerrar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
frm_buscar_documento.mostCurrent._cl_permisox = RemoteObject.createNew ("BaKapp.Movil.Tag.cl_permisoxui");
 //BA.debugLineNum = 36;BA.debugLine="Dim ClFx As ClFunciones2";
frm_buscar_documento.mostCurrent._clfx = RemoteObject.createNew ("BaKapp.Movil.Tag.clfunciones2");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Idmaeedo As Int";
frm_buscar_documento._idmaeedo = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Public Tido As String";
frm_buscar_documento._tido = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public Nudo As String";
frm_buscar_documento._nudo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public Koen As String";
frm_buscar_documento._koen = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public Suen As String";
frm_buscar_documento._suen = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Public OCC As String";
frm_buscar_documento._occ = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Public Observaciones As String";
frm_buscar_documento._observaciones = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Public Para As String";
frm_buscar_documento._para = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Public Estado As String";
frm_buscar_documento._estado = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb_revisardifprecios() throws Exception{
try {
		Debug.PushSubsStack("Sb_RevisarDifPrecios (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,508);
if (RapidSub.canDelegate("sb_revisardifprecios")) { return BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","sb_revisardifprecios");}
ResumableSub_Sb_RevisarDifPrecios rsub = new ResumableSub_Sb_RevisarDifPrecios(null);
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
public static class ResumableSub_Sb_RevisarDifPrecios extends BA.ResumableSub {
public ResumableSub_Sb_RevisarDifPrecios(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _vnta_dias_venci_coti = RemoteObject.createImmutable(0);
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_RevisarDifPrecios (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,508);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 510;BA.debugLine="Dim Vnta_Dias_Venci_Coti As Int = Variables.Globa";
Debug.ShouldStop(536870912);
_vnta_dias_venci_coti = BA.numberCast(int.class, parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Vnta_Dias_Venci_Coti")))));Debug.locals.put("Vnta_Dias_Venci_Coti", _vnta_dias_venci_coti);Debug.locals.put("Vnta_Dias_Venci_Coti", _vnta_dias_venci_coti);
 BA.debugLineNum = 512;BA.debugLine="Dim Fila As Map";
Debug.ShouldStop(-2147483648);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 513;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
Debug.ShouldStop(1);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_revisardocvslistaprecio" /*RemoteObject*/ ,frm_buscar_documento.mostCurrent.activityBA,(Object)(frm_buscar_documento.getObject()),(Object)(parent._idmaeedo),(Object)(_vnta_dias_venci_coti));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 515;BA.debugLine="Fila = Null";
Debug.ShouldStop(4);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 517;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "sb_revisardifprecios"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 519;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 521;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(256);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 523;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 525;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(4096);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_buscar_documento.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 526;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(8192);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 531;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","214745623",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 534;BA.debugLine="Return Fila";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_fila));return;};
 BA.debugLineNum = 536;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static RemoteObject  _sb_sepuedeeditardocumento() throws Exception{
try {
		Debug.PushSubsStack("Sb_SePuedeEditarDocumento (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,255);
if (RapidSub.canDelegate("sb_sepuedeeditardocumento")) { return BaKapp.Movil.Tag.frm_buscar_documento.remoteMe.runUserSub(false, "frm_buscar_documento","sb_sepuedeeditardocumento");}
ResumableSub_Sb_SePuedeEditarDocumento rsub = new ResumableSub_Sb_SePuedeEditarDocumento(null);
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
public static class ResumableSub_Sb_SePuedeEditarDocumento extends BA.ResumableSub {
public ResumableSub_Sb_SePuedeEditarDocumento(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_buscar_documento parent;
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _regitros_sutentatorios = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_SePuedeEditarDocumento (frm_buscar_documento) ","frm_buscar_documento",14,frm_buscar_documento.mostCurrent.activityBA,frm_buscar_documento.mostCurrent,255);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 257;BA.debugLine="Dim Consulta_Sql As String = \"Select Count(*) As";
Debug.ShouldStop(1);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Count(*) As Regitros_Sutentatorios"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEDDO Where IDRST In (Select IDMAEDDO From MAEDDO Where IDMAEEDO = "),parent._idmaeedo,RemoteObject.createImmutable(") And ARCHIRST = 'MAEDDO'"));Debug.locals.put("Consulta_Sql", _consulta_sql);Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 260;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(8);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_buscar_documento.mostCurrent.activityBA,(Object)(_consulta_sql),(Object)(frm_buscar_documento.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 261;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_buscar_documento.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_buscar_documento", "sb_sepuedeeditardocumento"), (_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 263;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 265;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(256);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 267;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 269;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
Debug.ShouldStop(4096);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_buscar_documento.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 271;BA.debugLine="Dim Regitros_Sutentatorios As Int = Fila.Get(\"R";
Debug.ShouldStop(16384);
_regitros_sutentatorios = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Regitros_Sutentatorios")))));Debug.locals.put("Regitros_Sutentatorios", _regitros_sutentatorios);Debug.locals.put("Regitros_Sutentatorios", _regitros_sutentatorios);
 BA.debugLineNum = 273;BA.debugLine="If Regitros_Sutentatorios > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_regitros_sutentatorios,BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 274;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
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
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 281;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 283;BA.debugLine="End Sub";
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
}