package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_menu_principal_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Menu_Principal\")";
Debug.ShouldStop(536870912);
frm_menu_principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Menu_Principal")),frm_menu_principal.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="Lbl_Nombre_Usuario.Text = \"Usuario activo: \" & Va";
Debug.ShouldStop(-2147483648);
frm_menu_principal.mostCurrent._lbl_nombre_usuario.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Usuario activo: "),frm_menu_principal.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))),RemoteObject.createImmutable("-"),frm_menu_principal.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOFU")))))));
 BA.debugLineNum = 33;BA.debugLine="Lbl_Modalidad.Text = \"Modalidad: \" & Variables.Gl";
Debug.ShouldStop(1);
frm_menu_principal.mostCurrent._lbl_modalidad.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Modalidad: "),frm_menu_principal.mostCurrent._variables._gl_modalidad /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="Lbl_Version.Text = Application.LabelName & \" vers";
Debug.ShouldStop(2);
frm_menu_principal.mostCurrent._lbl_version.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(frm_menu_principal.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"),RemoteObject.createImmutable(" versión: "),frm_menu_principal.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionName"))));
 BA.debugLineNum = 36;BA.debugLine="Btn_CodAlternativos.Enabled = False";
Debug.ShouldStop(8);
frm_menu_principal.mostCurrent._btn_codalternativos.runMethod(true,"setEnabled",frm_menu_principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="Btn_Inventario.Enabled = False";
Debug.ShouldStop(16);
frm_menu_principal.mostCurrent._btn_inventario.runMethod(true,"setEnabled",frm_menu_principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
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
public static RemoteObject  _btn_etiqueta_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Etiqueta_Click (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,128);
if (RapidSub.canDelegate("btn_etiqueta_click")) { return BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","btn_etiqueta_click");}
 BA.debugLineNum = 128;BA.debugLine="Private Sub Btn_Etiqueta_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="StartActivity(Frm_etiquetas)";
Debug.ShouldStop(1);
frm_menu_principal.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_principal.processBA,(Object)((frm_menu_principal.mostCurrent._frm_etiquetas.getObject())));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_postventa_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_PostVenta_Click (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,49);
if (RapidSub.canDelegate("btn_postventa_click")) { BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","btn_postventa_click"); return;}
ResumableSub_Btn_PostVenta_Click rsub = new ResumableSub_Btn_PostVenta_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_PostVenta_Click extends BA.ResumableSub {
public ResumableSub_Btn_PostVenta_Click(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_principal parent;
RemoteObject _clfx2 = RemoteObject.declareNull("BaKapp.Movil.Tag.clfunciones2");
RemoteObject _resultado = RemoteObject.createImmutable(false);
RemoteObject _b4a_despachosimple = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_PostVenta_Click (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,49);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 51;BA.debugLine="Dim CLFx2 As ClFunciones2";
Debug.ShouldStop(262144);
_clfx2 = RemoteObject.createNew ("BaKapp.Movil.Tag.clfunciones2");Debug.locals.put("CLFx2", _clfx2);
 BA.debugLineNum = 52;BA.debugLine="CLFx2.Initialize(Null,\"\")";
Debug.ShouldStop(524288);
_clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_initialize" /*RemoteObject*/ ,frm_menu_principal.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 53;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
Debug.ShouldStop(1048576);
_clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_designercreateview" /*RemoteObject*/ ,(Object)((parent.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 55;BA.debugLine="Wait For(CLFx2.Sb_RevisarFormatos) Complete (Resu";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_principal", "btn_postventa_click"), _clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_sb_revisarformatos" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 56;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 57;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 60;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
Debug.ShouldStop(134217728);
_b4a_despachosimple = BA.ObjectToBoolean(parent.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("B4A_DespachoSimple")))));Debug.locals.put("B4A_DespachoSimple", _b4a_despachosimple);Debug.locals.put("B4A_DespachoSimple", _b4a_despachosimple);
 BA.debugLineNum = 62;BA.debugLine="If B4A_DespachoSimple Then";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//if
this.state = 10;
if (_b4a_despachosimple.<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 63;BA.debugLine="Crear_DocumentoConEndXDefecto";
Debug.ShouldStop(1073741824);
_crear_documentoconendxdefecto();
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 65;BA.debugLine="StartActivity(Frm_Menu_Post_Venta)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_principal.processBA,(Object)((parent.mostCurrent._frm_menu_post_venta.getObject())));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static void  _complete(RemoteObject _resultado) throws Exception{
}
public static void  _crear_documentoconendxdefecto() throws Exception{
try {
		Debug.PushSubsStack("Crear_DocumentoConEndXDefecto (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,70);
if (RapidSub.canDelegate("crear_documentoconendxdefecto")) { BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","crear_documentoconendxdefecto"); return;}
ResumableSub_Crear_DocumentoConEndXDefecto rsub = new ResumableSub_Crear_DocumentoConEndXDefecto(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Crear_DocumentoConEndXDefecto extends BA.ResumableSub {
public ResumableSub_Crear_DocumentoConEndXDefecto(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_principal parent;
RemoteObject _koen = RemoteObject.createImmutable("");
RemoteObject _suen = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Crear_DocumentoConEndXDefecto (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 72;BA.debugLine="Dim Koen As String = Variables.Global_Row_Configu";
Debug.ShouldStop(128);
_koen = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Vnta_EntidadXdefecto")))));Debug.locals.put("Koen", _koen);Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 73;BA.debugLine="Dim Suen As String = Variables.Global_Row_Configu";
Debug.ShouldStop(256);
_suen = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Vnta_SucEntXdefecto")))));Debug.locals.put("Suen", _suen);Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 75;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(1024);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_entidad_json" /*RemoteObject*/ ,frm_menu_principal.mostCurrent.activityBA,(Object)(frm_menu_principal.getObject()),(Object)(_koen),(Object)(_suen));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 77;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_menu_principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_principal", "crear_documentoconendxdefecto"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 79;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 81;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 83;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 85;BA.debugLine="Variables.Global_Row_Entidad_X_Defecto = Funcio";
Debug.ShouldStop(1048576);
parent.mostCurrent._variables._global_row_entidad_x_defecto /*RemoteObject*/  = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_menu_principal.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="Log(\"8.- Cargamos la Entidad por defecto\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","616252944",RemoteObject.createImmutable("8.- Cargamos la Entidad por defecto"),0);
 BA.debugLineNum = 88;BA.debugLine="StartActivity(Frm_Menu_Post_Venta)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_menu_principal.processBA,(Object)((parent.mostCurrent._frm_menu_post_venta.getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 92;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(134217728);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 94;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(536870912);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 96;BA.debugLine="Msgbox2Async(\"No existe la entidad por defecto\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No existe la entidad por defecto"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Para poder trabajar con el dispositivo debe configurar una entidad por defecto")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),frm_menu_principal.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 98;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_menu_principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_principal", "crear_documentoconendxdefecto"), null);
this.state = 12;
return;
case 12:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
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
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 16;BA.debugLine="Private Btn_PostVenta As Button";
frm_menu_principal.mostCurrent._btn_postventa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Lbl_Nombre_Usuario As Label";
frm_menu_principal.mostCurrent._lbl_nombre_usuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Lbl_Version As Label";
frm_menu_principal.mostCurrent._lbl_version = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Btn_CodAlternativos As Button";
frm_menu_principal.mostCurrent._btn_codalternativos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Btn_Inventario As Button";
frm_menu_principal.mostCurrent._btn_inventario = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Lbl_Modalidad As Label";
frm_menu_principal.mostCurrent._lbl_modalidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Btn_Etiqueta As Button";
frm_menu_principal.mostCurrent._btn_etiqueta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _lbl_nombre_usuario_longclick() throws Exception{
try {
		Debug.PushSubsStack("Lbl_Nombre_Usuario_LongClick (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,118);
if (RapidSub.canDelegate("lbl_nombre_usuario_longclick")) { BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","lbl_nombre_usuario_longclick"); return;}
ResumableSub_Lbl_Nombre_Usuario_LongClick rsub = new ResumableSub_Lbl_Nombre_Usuario_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Lbl_Nombre_Usuario_LongClick extends BA.ResumableSub {
public ResumableSub_Lbl_Nombre_Usuario_LongClick(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_principal parent;
RemoteObject _cl_permisox = RemoteObject.declareNull("BaKapp.Movil.Tag.cl_permisoxui");
RemoteObject _rst = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Lbl_Nombre_Usuario_LongClick (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,118);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 120;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
Debug.ShouldStop(8388608);
_cl_permisox = RemoteObject.createNew ("BaKapp.Movil.Tag.cl_permisoxui");Debug.locals.put("Cl_PermisoX", _cl_permisox);
 BA.debugLineNum = 121;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
Debug.ShouldStop(16777216);
_cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_initialize" /*RemoteObject*/ ,frm_menu_principal.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 122;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
Debug.ShouldStop(33554432);
_cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_designercreateview" /*RemoteObject*/ ,(Object)((parent.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 124;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_menu_principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_principal", "lbl_nombre_usuario_longclick"), _cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_validarpermisousuario" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Bkp00015"))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
public static void  _lbl_version_longclick() throws Exception{
try {
		Debug.PushSubsStack("Lbl_Version_LongClick (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,106);
if (RapidSub.canDelegate("lbl_version_longclick")) { BaKapp.Movil.Tag.frm_menu_principal.remoteMe.runUserSub(false, "frm_menu_principal","lbl_version_longclick"); return;}
ResumableSub_Lbl_Version_LongClick rsub = new ResumableSub_Lbl_Version_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Lbl_Version_LongClick extends BA.ResumableSub {
public ResumableSub_Lbl_Version_LongClick(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_menu_principal parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Lbl_Version_LongClick (frm_menu_principal) ","frm_menu_principal",19,frm_menu_principal.mostCurrent.activityBA,frm_menu_principal.mostCurrent,106);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 108;BA.debugLine="Msgbox2Async(\"¿Estas seguro de limpiar la base de";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Estas seguro de limpiar la base de datos local?")),(Object)(BA.ObjectToCharSequence("LIMPIAR DB")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),frm_menu_principal.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 109;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_menu_principal.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_menu_principal", "lbl_version_longclick"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 111;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 112;BA.debugLine="Funciones.Sb_BorrarTodosLosRegistrosDeLaBaseDeDa";
Debug.ShouldStop(32768);
parent.mostCurrent._funciones.runVoidMethod ("_sb_borrartodoslosregistrosdelabasededatos" /*RemoteObject*/ ,frm_menu_principal.mostCurrent.activityBA);
 BA.debugLineNum = 113;BA.debugLine="ToastMessageShow(\"BASE DE DATOS LIMPIA...\", Fals";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("BASE DE DATOS LIMPIA...")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 4:
//C
this.state = -1;
;
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}