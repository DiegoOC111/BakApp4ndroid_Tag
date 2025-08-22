package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_menu_post_venta_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"Cp_Menu_Post_Venta\")";
Debug.ShouldStop(33554432);
frm_menu_post_venta.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cp_Menu_Post_Venta")),frm_menu_post_venta.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(BaKapp.Movil.Tag.frm_menu_post_venta parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _idmaeedo = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,29);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 31;BA.debugLine="If Frm_Documentos_Generados.Doc_Seleccionado Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._frm_documentos_generados._doc_seleccionado /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 33;BA.debugLine="Dim Idmaeedo As Int = Frm_Documentos_Generados.I";
Debug.ShouldStop(1);
_idmaeedo = parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*RemoteObject*/ ;Debug.locals.put("Idmaeedo", _idmaeedo);Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 35;BA.debugLine="Wait For(Sb_Ir_Al_Documento2(Idmaeedo)) Complete";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "activity_resume"), _sb_ir_al_documento2(_idmaeedo));
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 37;BA.debugLine="Frm_Documentos_Generados.Doc_Seleccionado = Fals";
Debug.ShouldStop(16);
parent.mostCurrent._frm_documentos_generados._doc_seleccionado /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 38;BA.debugLine="Frm_Documentos_Generados.Idmaeedo_Sel = 0";
Debug.ShouldStop(32);
parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 40;BA.debugLine="If Result Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 7;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 41;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_post_venta.processBA,(Object)((parent.mostCurrent._frm_buscar_documento.getObject())));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _btn_buscar_documentos_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Documentos_Click (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,69);
if (RapidSub.canDelegate("btn_buscar_documentos_click")) { BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","btn_buscar_documentos_click"); return;}
ResumableSub_Btn_Buscar_Documentos_Click rsub = new ResumableSub_Btn_Buscar_Documentos_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Buscar_Documentos_Click extends BA.ResumableSub {
public ResumableSub_Btn_Buscar_Documentos_Click(BaKapp.Movil.Tag.frm_menu_post_venta parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numero = RemoteObject.createImmutable(0);
RemoteObject _resultado = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Documentos_Click (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,69);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 71;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
Debug.ShouldStop(64);
parent.mostCurrent._frm_post_01_formulario._grabar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 73;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(256);
parent.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 75;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-deliv";
Debug.ShouldStop(1024);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("document-delivery-receipt-ok-2.png")));
 BA.debugLineNum = 77;BA.debugLine="Msgbox2Async(\"SELECCIONE EL TIPO DE DOCUMENTO\",\"B";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("SELECCIONE EL TIPO DE DOCUMENTO")),(Object)(BA.ObjectToCharSequence("Buscar documento")),(Object)(BA.ObjectToString("NOTA DE VENTA")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("COTIZACION")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 80;BA.debugLine="Dim Tido As String";
Debug.ShouldStop(32768);
_tido = RemoteObject.createImmutable("");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 82;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 83;BA.debugLine="Tido = \"NVV\"";
Debug.ShouldStop(262144);
_tido = BA.ObjectToString("NVV");Debug.locals.put("Tido", _tido);
 if (true) break;
;
 BA.debugLineNum = 86;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(2097152);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 87;BA.debugLine="Tido = \"COV\"";
Debug.ShouldStop(4194304);
_tido = BA.ObjectToString("COV");Debug.locals.put("Tido", _tido);
 if (true) break;
;
 BA.debugLineNum = 90;BA.debugLine="If Tido = \"\" Then";
Debug.ShouldStop(33554432);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_tido,BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 91;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 94;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(536870912);
parent.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 96;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(-2147483648);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 97;BA.debugLine="Private xui As XUI";
Debug.ShouldStop(1);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 98;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(2);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 99;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(4);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 101;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(16);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA);
 BA.debugLineNum = 103;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(64);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 105;BA.debugLine="Base = Activity";
Debug.ShouldStop(256);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 106;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(512);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 107;BA.debugLine="Dialog.Title = \"Orden de compra\"";
Debug.ShouldStop(1024);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Orden de compra")));
 BA.debugLineNum = 109;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de document";
Debug.ShouldStop(4096);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Número de documento a buscar"));
 BA.debugLineNum = 110;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(8192);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 112;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_numero = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Numero", _numero);
;
 BA.debugLineNum = 113;BA.debugLine="If Numero <> xui.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_numero,BA.numberCast(double.class, _xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 114;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 117;BA.debugLine="If InputTemplate.Text = \"\" Then";
Debug.ShouldStop(1048576);

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_inputtemplate.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 118;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(2097152);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 119;BA.debugLine="Msgbox2Async(\"El número del documento no puede e";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("El número del documento no puede estar vacío")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Okr")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 120;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 123;BA.debugLine="Wait For(Sb_Ir_Al_Documento(Tido,InputTemplate.Te";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), _sb_ir_al_documento(_tido,_inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 125;BA.debugLine="If Resultado Then";
Debug.ShouldStop(268435456);
if (true) break;

case 18:
//if
this.state = 21;
if (_resultado.<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 126;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_post_venta.processBA,(Object)((parent.mostCurrent._frm_buscar_documento.getObject())));
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _btn_venta_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Venta_Click (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,56);
if (RapidSub.canDelegate("btn_venta_click")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","btn_venta_click");}
 BA.debugLineNum = 56;BA.debugLine="Sub Btn_Venta_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 63;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = 0";
Debug.ShouldStop(1073741824);
frm_menu_post_venta.mostCurrent._frm_post_01_formulario._id_docenc /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 64;BA.debugLine="Frm_Post_01_Formulario.Nuevo_Documento = True";
Debug.ShouldStop(-2147483648);
frm_menu_post_venta.mostCurrent._frm_post_01_formulario._nuevo_documento /*RemoteObject*/  = frm_menu_post_venta.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 65;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
Debug.ShouldStop(1);
frm_menu_post_venta.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_post_venta.processBA,(Object)((frm_menu_post_venta.mostCurrent._frm_post_01_formulario.getObject())));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_ver_documentos_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Ver_Documentos_Click (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,315);
if (RapidSub.canDelegate("btn_ver_documentos_click")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","btn_ver_documentos_click");}
 BA.debugLineNum = 315;BA.debugLine="Private Sub Btn_Ver_Documentos_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
Debug.ShouldStop(134217728);
frm_menu_post_venta.mostCurrent._frm_post_01_formulario._grabar /*RemoteObject*/  = frm_menu_post_venta.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 317;BA.debugLine="StartActivity(Frm_Documentos_Generados)";
Debug.ShouldStop(268435456);
frm_menu_post_venta.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_post_venta.processBA,(Object)((frm_menu_post_venta.mostCurrent._frm_documentos_generados.getObject())));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim bmp1 As Bitmap";
frm_menu_post_venta.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Btn_Venta As Button";
frm_menu_post_venta.mostCurrent._btn_venta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Btn_Buscar_Documentos As Button";
frm_menu_post_venta.mostCurrent._btn_buscar_documentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Btn_Ver_Documentos As Button";
frm_menu_post_venta.mostCurrent._btn_ver_documentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb_buscardoc(RemoteObject _tido,RemoteObject _nudo) throws Exception{
try {
		Debug.PushSubsStack("Sb_BuscarDoc (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,226);
if (RapidSub.canDelegate("sb_buscardoc")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","sb_buscardoc", _tido, _nudo);}
ResumableSub_Sb_BuscarDoc rsub = new ResumableSub_Sb_BuscarDoc(null,_tido,_nudo);
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
public static class ResumableSub_Sb_BuscarDoc extends BA.ResumableSub {
public ResumableSub_Sb_BuscarDoc(BaKapp.Movil.Tag.frm_menu_post_venta parent,RemoteObject _tido,RemoteObject _nudo) {
this.parent = parent;
this._tido = _tido;
this._nudo = _nudo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _tido;
RemoteObject _nudo;
RemoteObject _row_documento = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_BuscarDoc (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,226);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Tido", _tido);
Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 228;BA.debugLine="Dim Row_Documento As Map";
Debug.ShouldStop(8);
_row_documento = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row_Documento", _row_documento);
 BA.debugLineNum = 229;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(16);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_documento" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(frm_menu_post_venta.getObject()),(Object)(_tido),(Object)(_nudo));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 231;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_buscardoc"), (_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 233;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 12;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 235;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1024);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 237;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 239;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(16384);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 240;BA.debugLine="Row_Documento =Filas.Get(0)";
Debug.ShouldStop(32768);
_row_documento = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row_Documento", _row_documento);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 243;BA.debugLine="Row_Documento = Null";
Debug.ShouldStop(262144);
_row_documento = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Row_Documento", _row_documento);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 247;BA.debugLine="Row_Documento = Null";
Debug.ShouldStop(4194304);
_row_documento = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Row_Documento", _row_documento);
 BA.debugLineNum = 248;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","615532054",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 251;BA.debugLine="Return Row_Documento";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_row_documento));return;};
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static RemoteObject  _sb_buscardoc2(RemoteObject _idmaeedo) throws Exception{
try {
		Debug.PushSubsStack("Sb_BuscarDoc2 (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,255);
if (RapidSub.canDelegate("sb_buscardoc2")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","sb_buscardoc2", _idmaeedo);}
ResumableSub_Sb_BuscarDoc2 rsub = new ResumableSub_Sb_BuscarDoc2(null,_idmaeedo);
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
public static class ResumableSub_Sb_BuscarDoc2 extends BA.ResumableSub {
public ResumableSub_Sb_BuscarDoc2(BaKapp.Movil.Tag.frm_menu_post_venta parent,RemoteObject _idmaeedo) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _idmaeedo;
RemoteObject _row_documento = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_BuscarDoc2 (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,255);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 257;BA.debugLine="Dim Row_Documento As Map";
Debug.ShouldStop(1);
_row_documento = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row_Documento", _row_documento);
 BA.debugLineNum = 258;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(2);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_documento2" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(frm_menu_post_venta.getObject()),(Object)(_idmaeedo));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 260;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_buscardoc2"), (_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 262;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 12;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 264;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(128);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 266;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 268;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(2048);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 269;BA.debugLine="Row_Documento =Filas.Get(0)";
Debug.ShouldStop(4096);
_row_documento = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row_Documento", _row_documento);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 272;BA.debugLine="Row_Documento = Null";
Debug.ShouldStop(32768);
_row_documento = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Row_Documento", _row_documento);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 276;BA.debugLine="Row_Documento = Null";
Debug.ShouldStop(524288);
_row_documento = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Row_Documento", _row_documento);
 BA.debugLineNum = 277;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","615597590",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 280;BA.debugLine="Return Row_Documento";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_row_documento));return;};
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _sb_fx_traerdatosentidad(RemoteObject _koen,RemoteObject _suen) throws Exception{
try {
		Debug.PushSubsStack("Sb_Fx_TraerDatosEntidad (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,284);
if (RapidSub.canDelegate("sb_fx_traerdatosentidad")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","sb_fx_traerdatosentidad", _koen, _suen);}
ResumableSub_Sb_Fx_TraerDatosEntidad rsub = new ResumableSub_Sb_Fx_TraerDatosEntidad(null,_koen,_suen);
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
public static class ResumableSub_Sb_Fx_TraerDatosEntidad extends BA.ResumableSub {
public ResumableSub_Sb_Fx_TraerDatosEntidad(BaKapp.Movil.Tag.frm_menu_post_venta parent,RemoteObject _koen,RemoteObject _suen) {
this.parent = parent;
this._koen = _koen;
this._suen = _suen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _koen;
RemoteObject _suen;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Fx_TraerDatosEntidad (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,284);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 286;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(536870912);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 287;BA.debugLine="Dim Row_Entidad As Map";
Debug.ShouldStop(1073741824);
_row_entidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row_Entidad", _row_entidad);
 BA.debugLineNum = 289;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(1);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_entidad_json" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(frm_menu_post_venta.getObject()),(Object)(_koen),(Object)(_suen));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 291;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_fx_traerdatosentidad"), (_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 293;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 12;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 295;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(64);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 297;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 299;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(1024);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_menu_post_venta.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 300;BA.debugLine="Row_Entidad =Filas.Get(0)";
Debug.ShouldStop(2048);
_row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Row_Entidad", _row_entidad);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 303;BA.debugLine="Row_Entidad = Null";
Debug.ShouldStop(16384);
_row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Row_Entidad", _row_entidad);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 307;BA.debugLine="Row_Entidad = Null";
Debug.ShouldStop(262144);
_row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));Debug.locals.put("Row_Entidad", _row_entidad);
 BA.debugLineNum = 308;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","615663128",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 311;BA.debugLine="Return Row_Entidad";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_row_entidad));return;};
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _sb_ir_al_documento(RemoteObject _tido,RemoteObject _nudo) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ir_Al_Documento (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,132);
if (RapidSub.canDelegate("sb_ir_al_documento")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","sb_ir_al_documento", _tido, _nudo);}
ResumableSub_Sb_Ir_Al_Documento rsub = new ResumableSub_Sb_Ir_Al_Documento(null,_tido,_nudo);
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
public static class ResumableSub_Sb_Ir_Al_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Ir_Al_Documento(BaKapp.Movil.Tag.frm_menu_post_venta parent,RemoteObject _tido,RemoteObject _nudo) {
this.parent = parent;
this._tido = _tido;
this._nudo = _nudo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _tido;
RemoteObject _nudo;
RemoteObject _documento = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _enviado = RemoteObject.createImmutable(false);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _idmaeedo = RemoteObject.createImmutable(0);
RemoteObject _endo = RemoteObject.createImmutable("");
RemoteObject _suendo = RemoteObject.createImmutable("");
RemoteObject _obseravacion = RemoteObject.createImmutable("");
RemoteObject _nroocc = RemoteObject.createImmutable("");
RemoteObject _kofuen = RemoteObject.createImmutable("");
RemoteObject _para = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ir_Al_Documento (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,132);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Tido", _tido);
Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 134;BA.debugLine="Wait For( Sb_BuscarDoc(Tido,Nudo)) Complete (Docu";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_ir_al_documento"), _sb_buscardoc(_tido,_nudo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Documento", _documento);
;
 BA.debugLineNum = 136;BA.debugLine="If Documento = Null Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("n",_documento)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 137;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 140;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
Debug.ShouldStop(2048);
_enviado = BA.ObjectToBoolean(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Enviado")))));Debug.locals.put("Enviado", _enviado);Debug.locals.put("Enviado", _enviado);
 BA.debugLineNum = 141;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
Debug.ShouldStop(4096);
_error = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 143;BA.debugLine="If Enviado = False Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_enviado,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 144;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(32768);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 145;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_error)),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 146;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 151;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
Debug.ShouldStop(4194304);
_idmaeedo = BA.numberCast(int.class, _documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMAEEDO")))));Debug.locals.put("Idmaeedo", _idmaeedo);Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 152;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
Debug.ShouldStop(8388608);
_endo = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ENDO")))));Debug.locals.put("Endo", _endo);Debug.locals.put("Endo", _endo);
 BA.debugLineNum = 153;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
Debug.ShouldStop(16777216);
_suendo = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUENDO")))));Debug.locals.put("Suendo", _suendo);Debug.locals.put("Suendo", _suendo);
 BA.debugLineNum = 154;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
Debug.ShouldStop(33554432);
_obseravacion = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OBDO")))));Debug.locals.put("Obseravacion", _obseravacion);Debug.locals.put("Obseravacion", _obseravacion);
 BA.debugLineNum = 155;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
Debug.ShouldStop(67108864);
_nroocc = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OCDO")))));Debug.locals.put("NroOCC", _nroocc);Debug.locals.put("NroOCC", _nroocc);
 BA.debugLineNum = 156;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
Debug.ShouldStop(134217728);
_kofuen = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFUDO")))));Debug.locals.put("Kofuen", _kofuen);Debug.locals.put("Kofuen", _kofuen);
 BA.debugLineNum = 157;BA.debugLine="Dim Para As String = Documento.Get(\"EMAILCOMER\")";
Debug.ShouldStop(268435456);
_para = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMAILCOMER")))));Debug.locals.put("Para", _para);Debug.locals.put("Para", _para);
 BA.debugLineNum = 159;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
Debug.ShouldStop(1073741824);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_kofuen,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 160;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 161;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Este documento es de otro usuario")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 162;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 165;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
Debug.ShouldStop(16);
parent.mostCurrent._frm_buscar_documento._idmaeedo /*RemoteObject*/  = _idmaeedo;
 BA.debugLineNum = 166;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
Debug.ShouldStop(32);
parent.mostCurrent._frm_buscar_documento._koen /*RemoteObject*/  = _endo;
 BA.debugLineNum = 167;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
Debug.ShouldStop(64);
parent.mostCurrent._frm_buscar_documento._suen /*RemoteObject*/  = _suendo;
 BA.debugLineNum = 168;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
Debug.ShouldStop(128);
parent.mostCurrent._frm_buscar_documento._observaciones /*RemoteObject*/  = _obseravacion;
 BA.debugLineNum = 169;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
Debug.ShouldStop(256);
parent.mostCurrent._frm_buscar_documento._occ /*RemoteObject*/  = _nroocc;
 BA.debugLineNum = 170;BA.debugLine="Frm_Buscar_Documento.Para = Para";
Debug.ShouldStop(512);
parent.mostCurrent._frm_buscar_documento._para /*RemoteObject*/  = _para;
 BA.debugLineNum = 171;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
Debug.ShouldStop(1024);
parent.mostCurrent._frm_buscar_documento._tido /*RemoteObject*/  = _tido;
 BA.debugLineNum = 172;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
Debug.ShouldStop(2048);
parent.mostCurrent._frm_buscar_documento._nudo /*RemoteObject*/  = _nudo;
 BA.debugLineNum = 174;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 176;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_ir_al_documento2(RemoteObject _idmaeedo) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ir_Al_Documento2 (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,178);
if (RapidSub.canDelegate("sb_ir_al_documento2")) { return BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","sb_ir_al_documento2", _idmaeedo);}
ResumableSub_Sb_Ir_Al_Documento2 rsub = new ResumableSub_Sb_Ir_Al_Documento2(null,_idmaeedo);
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
public static class ResumableSub_Sb_Ir_Al_Documento2 extends BA.ResumableSub {
public ResumableSub_Sb_Ir_Al_Documento2(BaKapp.Movil.Tag.frm_menu_post_venta parent,RemoteObject _idmaeedo) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _idmaeedo;
RemoteObject _documento = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _enviado = RemoteObject.createImmutable(false);
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _nudo = RemoteObject.createImmutable("");
RemoteObject _endo = RemoteObject.createImmutable("");
RemoteObject _suendo = RemoteObject.createImmutable("");
RemoteObject _obseravacion = RemoteObject.createImmutable("");
RemoteObject _nroocc = RemoteObject.createImmutable("");
RemoteObject _kofuen = RemoteObject.createImmutable("");
RemoteObject _para = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ir_Al_Documento2 (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,178);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 180;BA.debugLine="Wait For( Sb_BuscarDoc2(Idmaeedo)) Complete (Docu";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_ir_al_documento2"), _sb_buscardoc2(_idmaeedo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Documento", _documento);
;
 BA.debugLineNum = 182;BA.debugLine="If Documento = Null Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("n",_documento)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 183;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 186;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
Debug.ShouldStop(33554432);
_enviado = BA.ObjectToBoolean(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Enviado")))));Debug.locals.put("Enviado", _enviado);Debug.locals.put("Enviado", _enviado);
 BA.debugLineNum = 187;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
Debug.ShouldStop(67108864);
_error = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 189;BA.debugLine="If Enviado = False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_enviado,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 190;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(536870912);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 191;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_error)),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 192;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 197;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
Debug.ShouldStop(16);
_idmaeedo = BA.numberCast(int.class, _documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMAEEDO")))));Debug.locals.put("Idmaeedo", _idmaeedo);Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 198;BA.debugLine="Dim Tido As String = Documento.Get(\"TIDO\")";
Debug.ShouldStop(32);
_tido = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIDO")))));Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 199;BA.debugLine="Dim Nudo As String = Documento.Get(\"NUDO\")";
Debug.ShouldStop(64);
_nudo = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NUDO")))));Debug.locals.put("Nudo", _nudo);Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 200;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
Debug.ShouldStop(128);
_endo = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ENDO")))));Debug.locals.put("Endo", _endo);Debug.locals.put("Endo", _endo);
 BA.debugLineNum = 201;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
Debug.ShouldStop(256);
_suendo = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUENDO")))));Debug.locals.put("Suendo", _suendo);Debug.locals.put("Suendo", _suendo);
 BA.debugLineNum = 202;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
Debug.ShouldStop(512);
_obseravacion = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OBDO")))));Debug.locals.put("Obseravacion", _obseravacion);Debug.locals.put("Obseravacion", _obseravacion);
 BA.debugLineNum = 203;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
Debug.ShouldStop(1024);
_nroocc = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OCDO")))));Debug.locals.put("NroOCC", _nroocc);Debug.locals.put("NroOCC", _nroocc);
 BA.debugLineNum = 204;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
Debug.ShouldStop(2048);
_kofuen = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFUDO")))));Debug.locals.put("Kofuen", _kofuen);Debug.locals.put("Kofuen", _kofuen);
 BA.debugLineNum = 205;BA.debugLine="Dim Para As String =Documento.Get(\"EMAILCOMER\")";
Debug.ShouldStop(4096);
_para = BA.ObjectToString(_documento.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMAILCOMER")))));Debug.locals.put("Para", _para);Debug.locals.put("Para", _para);
 BA.debugLineNum = 207;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
Debug.ShouldStop(16384);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_kofuen,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 208;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(32768);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 209;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Este documento es de otro usuario")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 210;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 213;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
Debug.ShouldStop(1048576);
parent.mostCurrent._frm_buscar_documento._idmaeedo /*RemoteObject*/  = _idmaeedo;
 BA.debugLineNum = 214;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
Debug.ShouldStop(2097152);
parent.mostCurrent._frm_buscar_documento._koen /*RemoteObject*/  = _endo;
 BA.debugLineNum = 215;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
Debug.ShouldStop(4194304);
parent.mostCurrent._frm_buscar_documento._suen /*RemoteObject*/  = _suendo;
 BA.debugLineNum = 216;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
Debug.ShouldStop(8388608);
parent.mostCurrent._frm_buscar_documento._observaciones /*RemoteObject*/  = _obseravacion;
 BA.debugLineNum = 217;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
Debug.ShouldStop(16777216);
parent.mostCurrent._frm_buscar_documento._occ /*RemoteObject*/  = _nroocc;
 BA.debugLineNum = 218;BA.debugLine="Frm_Buscar_Documento.Para = Para";
Debug.ShouldStop(33554432);
parent.mostCurrent._frm_buscar_documento._para /*RemoteObject*/  = _para;
 BA.debugLineNum = 219;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
Debug.ShouldStop(67108864);
parent.mostCurrent._frm_buscar_documento._tido /*RemoteObject*/  = _tido;
 BA.debugLineNum = 220;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
Debug.ShouldStop(134217728);
parent.mostCurrent._frm_buscar_documento._nudo /*RemoteObject*/  = _nudo;
 BA.debugLineNum = 222;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _sb_ver_documento(RemoteObject _idmaeedo,RemoteObject _koen,RemoteObject _suen) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ver_Documento (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,320);
if (RapidSub.canDelegate("sb_ver_documento")) { BaKapp.Movil.Tag.frm_menu_post_venta.remoteMe.runUserSub(false, "frm_menu_post_venta","sb_ver_documento", _idmaeedo, _koen, _suen); return;}
ResumableSub_Sb_Ver_Documento rsub = new ResumableSub_Sb_Ver_Documento(null,_idmaeedo,_koen,_suen);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Ver_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Ver_Documento(BaKapp.Movil.Tag.frm_menu_post_venta parent,RemoteObject _idmaeedo,RemoteObject _koen,RemoteObject _suen) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
this._koen = _koen;
this._suen = _suen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_post_venta parent;
RemoteObject _idmaeedo;
RemoteObject _koen;
RemoteObject _suen;
RemoteObject _newdoc = RemoteObject.declareNull("BaKapp.Movil.Tag.crear_documento");
RemoteObject _rowentidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_docenc = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ver_Documento (frm_menu_post_venta) ","frm_menu_post_venta",18,frm_menu_post_venta.mostCurrent.activityBA,frm_menu_post_venta.mostCurrent,320);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Idmaeedo", _idmaeedo);
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 322;BA.debugLine="Dim NewDoc As Crear_Documento";
Debug.ShouldStop(2);
_newdoc = RemoteObject.createNew ("BaKapp.Movil.Tag.crear_documento");Debug.locals.put("NewDoc", _newdoc);
 BA.debugLineNum = 323;BA.debugLine="NewDoc.Initialize";
Debug.ShouldStop(4);
_newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_initialize" /*RemoteObject*/ ,frm_menu_post_venta.processBA);
 BA.debugLineNum = 324;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
Debug.ShouldStop(8);
_newdoc.setField ("_idmaeedo" /*RemoteObject*/ ,_idmaeedo);
 BA.debugLineNum = 325;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Comp";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_ver_documento"), _newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_entidad" /*RemoteObject*/ ,(Object)(_koen),(Object)(_suen)));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rowentidad = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("RowEntidad", _rowentidad);
;
 BA.debugLineNum = 327;BA.debugLine="If RowEntidad = Null Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("n",_rowentidad)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 328;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 331;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
Debug.ShouldStop(1024);
_newdoc.setField ("_row_entidad" /*RemoteObject*/ ,_rowentidad);
 BA.debugLineNum = 333;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_post_venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_post_venta", "sb_ver_documento"), _newdoc.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_nuevo_documento" /*RemoteObject*/ ));
this.state = 10;
return;
case 10:
//C
this.state = 5;
_id_docenc = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Id_DocEnc", _id_docenc);
;
 BA.debugLineNum = 335;BA.debugLine="If Id_DocEnc <> 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_id_docenc,BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 337;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(65536);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 338;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",\"";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Ahora puede editar el documento")),(Object)(BA.ObjectToCharSequence("Editar Documento")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_menu_post_venta.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 340;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
Debug.ShouldStop(524288);
parent.mostCurrent._frm_post_01_formulario._id_docenc /*RemoteObject*/  = _id_docenc;
 BA.debugLineNum = 341;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_post_venta.processBA,(Object)((parent.mostCurrent._frm_post_01_formulario.getObject())));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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