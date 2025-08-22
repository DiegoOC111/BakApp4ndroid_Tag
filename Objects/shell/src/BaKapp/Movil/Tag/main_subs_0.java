package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_create")) { BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
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
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.main parent;
RemoteObject _firsttime;
RemoteObject _dbfilename = RemoteObject.createImmutable("");
RemoteObject _dbfiledir = RemoteObject.createImmutable("");
RemoteObject _directoriodef = RemoteObject.createImmutable("");
RemoteObject _targetdir = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject group25;
int index25;
int groupLen25;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 57;BA.debugLine="Activity.LoadLayout(\"Acreditacion_Login\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Acreditacion_Login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 58;BA.debugLine="dialog.Initialize(Activity)";
Debug.ShouldStop(33554432);
parent.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject()));
 BA.debugLineNum = 59;BA.debugLine="dialog.Title = \"Conexión WebService\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Conexión WebService")));
 BA.debugLineNum = 65;BA.debugLine="DisableStrictMode";
Debug.ShouldStop(1);
_disablestrictmode();
 BA.debugLineNum = 67;BA.debugLine="Variables.Global_Version_BakApp = Application.Ver";
Debug.ShouldStop(4);
parent.mostCurrent._variables._global_version_bakapp /*RemoteObject*/  = parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionName");
 BA.debugLineNum = 70;BA.debugLine="Lbl_Version.Text = Application.LabelName & \" Vers";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_version.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"),RemoteObject.createImmutable(" Versión: "),parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionName"))));
 BA.debugLineNum = 71;BA.debugLine="Txt_Clave.PasswordMode=False";
Debug.ShouldStop(64);
parent.mostCurrent._txt_clave.runVoidMethod ("setPasswordMode",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="Dim DBFileName As String = \"bakapp_db.db\" '\"BakAp";
Debug.ShouldStop(256);
_dbfilename = BA.ObjectToString("bakapp_db.db");Debug.locals.put("DBFileName", _dbfilename);Debug.locals.put("DBFileName", _dbfilename);
 BA.debugLineNum = 74;BA.debugLine="Dim DBFileDir As String";
Debug.ShouldStop(512);
_dbfiledir = RemoteObject.createImmutable("");Debug.locals.put("DBFileDir", _dbfiledir);
 BA.debugLineNum = 75;BA.debugLine="Dim DirectorioDef As String= DBUtils.GetDBFolder";
Debug.ShouldStop(1024);
_directoriodef = parent.mostCurrent._dbutils.runMethod(true,"_getdbfolder" /*RemoteObject*/ ,main.mostCurrent.activityBA);Debug.locals.put("DirectorioDef", _directoriodef);Debug.locals.put("DirectorioDef", _directoriodef);
 BA.debugLineNum = 77;BA.debugLine="If File.Exists(DirectorioDef, DBFileName) = True";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_directoriodef),(Object)(_dbfilename)),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 78;BA.debugLine="File.Delete(DirectorioDef, \"bakapp_db.db\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_directoriodef),(Object)(RemoteObject.createImmutable("bakapp_db.db")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 81;BA.debugLine="DBFileDir = DBUtils.CopyDBFromAssets(DBFileName)";
Debug.ShouldStop(65536);
_dbfiledir = parent.mostCurrent._dbutils.runMethod(true,"_copydbfromassets" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_dbfilename));Debug.locals.put("DBFileDir", _dbfiledir);
 BA.debugLineNum = 82;BA.debugLine="Variables.vSql.Initialize(DBFileDir, DBFileName,";
Debug.ShouldStop(131072);
parent.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(_dbfiledir),(Object)(_dbfilename),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 93;BA.debugLine="Variables.Global_IdDispositivo = Funciones.Fx_Tra";
Debug.ShouldStop(268435456);
parent.mostCurrent._variables._global_iddispositivo /*RemoteObject*/  = parent.mostCurrent._funciones.runMethod(true,"_fx_traer_iddispositivo" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 95;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Clave)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._tecladosoft.runVoidMethod ("ShowKeyboard",(Object)((parent.mostCurrent._txt_clave.getObject())));
 BA.debugLineNum = 96;BA.debugLine="Lbl_Id_Dispositivo.Text = \"Id. dispositivo: \" & V";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_id_dispositivo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Id. dispositivo: "),parent.mostCurrent._variables._global_iddispositivo /*RemoteObject*/ )));
 BA.debugLineNum = 112;BA.debugLine="Dim TargetDir As String = DBUtils.GetDBFolder";
Debug.ShouldStop(32768);
_targetdir = parent.mostCurrent._dbutils.runMethod(true,"_getdbfolder" /*RemoteObject*/ ,main.mostCurrent.activityBA);Debug.locals.put("TargetDir", _targetdir);Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 114;BA.debugLine="If Not(File.Exists(TargetDir, \"ConexionWebService";
Debug.ShouldStop(131072);
if (true) break;

case 5:
//if
this.state = 14;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_targetdir),(Object)(RemoteObject.createImmutable("ConexionWebService.txt"))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 14;
 BA.debugLineNum = 115;BA.debugLine="Msgbox2Async(\"Falta la configuración al Web Serv";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Falta la configuración al Web Service.")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 116;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 15;
return;
case 15:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 117;BA.debugLine="Log(\"No existe el archivo ConexionWebService.txt";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6131136",RemoteObject.createImmutable("No existe el archivo ConexionWebService.txt"),0);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 119;BA.debugLine="For Each line As String In File.ReadList(TargetD";
Debug.ShouldStop(4194304);
if (true) break;

case 10:
//for
this.state = 13;
group25 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(_targetdir),(Object)(RemoteObject.createImmutable("ConexionWebService.txt")));
index25 = 0;
groupLen25 = group25.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("line", _line);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if (index25 < groupLen25) {
this.state = 12;
_line = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("line", _line);}
if (true) break;

case 17:
//C
this.state = 16;
index25++;
Debug.locals.put("line", _line);
if (true) break;

case 12:
//C
this.state = 17;
 BA.debugLineNum = 122;BA.debugLine="Variables.Global_Ip_WebService = line";
Debug.ShouldStop(33554432);
parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/  = _line;
 BA.debugLineNum = 123;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
this.state = 13;
if (true) break;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("line", _line);
;
 BA.debugLineNum = 125;BA.debugLine="Log(Variables.Global_Ip_WebService)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6131144",parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 136;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,315);
if (RapidSub.canDelegate("activity_keypress")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
RemoteObject _vsalir = RemoteObject.createImmutable(0);
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 315;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 317;BA.debugLine="Private vSalir As Int";
Debug.ShouldStop(268435456);
_vsalir = RemoteObject.createImmutable(0);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 318;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(536870912);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 319;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
Debug.ShouldStop(1073741824);
_bmp1 = main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("exit.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 320;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de cerrar la apl";
Debug.ShouldStop(-2147483648);
_vsalir = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("¿Estas seguro de cerrar la aplicación?")),(Object)(BA.ObjectToCharSequence("S A L I R")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((_bmp1.getObject())),main.mostCurrent.activityBA);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 327;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_vsalir,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 328;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 330;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 333;BA.debugLine="Return False";
Debug.ShouldStop(4096);
if (true) return main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,142);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 142;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 138;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_aceptar_login_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Aceptar_Login_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,146);
if (RapidSub.canDelegate("btn_aceptar_login_click")) { BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","btn_aceptar_login_click"); return;}
ResumableSub_Btn_Aceptar_Login_Click rsub = new ResumableSub_Btn_Aceptar_Login_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Aceptar_Login_Click extends BA.ResumableSub {
public ResumableSub_Btn_Aceptar_Login_Click(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.main parent;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _conf = RemoteObject.declareNull("BaKapp.Movil.Tag.conectar_conf");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Aceptar_Login_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,146);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 164;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(8);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 166;BA.debugLine="Btn_Aceptar_Login.Enabled = False";
Debug.ShouldStop(32);
parent.mostCurrent._btn_aceptar_login.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 167;BA.debugLine="Txt_Clave.Enabled = False";
Debug.ShouldStop(64);
parent.mostCurrent._txt_clave.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 168;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = False";
Debug.ShouldStop(128);
parent.mostCurrent._btn_conf_acceso_ws.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="Dim Conf As Conectar_Conf";
Debug.ShouldStop(512);
_conf = RemoteObject.createNew ("BaKapp.Movil.Tag.conectar_conf");Debug.locals.put("Conf", _conf);
 BA.debugLineNum = 171;BA.debugLine="Conf.Initialize";
Debug.ShouldStop(1024);
_conf.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 173;BA.debugLine="ProgressDialogShow(\"Cargando datos de configuraci";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Cargando datos de configuración..."))));
 BA.debugLineNum = 177;BA.debugLine="Wait For(Conf.Sb_Cargar_Datos_De_Configuracion())";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_aceptar_login_click"), _conf.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_sb_cargar_datos_de_configuracion" /*RemoteObject*/ ));
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 178;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 180;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 182;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(2097152);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 183;BA.debugLine="Msgbox2Async(\"No es posible ingresar al sistema,";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No es posible ingresar al sistema, faltan configuraciones desde Bakapp Windows Form")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 184;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_aceptar_login_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 185;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
Debug.ShouldStop(16777216);
parent.mostCurrent._btn_aceptar_login.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 186;BA.debugLine="Txt_Clave.Enabled = True";
Debug.ShouldStop(33554432);
parent.mostCurrent._txt_clave.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 187;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
Debug.ShouldStop(67108864);
parent.mostCurrent._btn_conf_acceso_ws.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 188;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 192;BA.debugLine="If Result = 2 Then";
Debug.ShouldStop(-2147483648);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 2))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 194;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(2);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 195;BA.debugLine="Msgbox2Async(\"No es posible ingresar al sistema,";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No es posible ingresar al sistema, faltan configuraciones en WebService")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 196;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_aceptar_login_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 197;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
Debug.ShouldStop(16);
parent.mostCurrent._btn_aceptar_login.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 198;BA.debugLine="Txt_Clave.Enabled = True";
Debug.ShouldStop(32);
parent.mostCurrent._txt_clave.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 199;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
Debug.ShouldStop(64);
parent.mostCurrent._btn_conf_acceso_ws.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 200;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 204;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 206;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(8192);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 207;BA.debugLine="Msgbox2Async(\"ACCESO AUTORIZADO\" , \"Ingresar al s";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("ACCESO AUTORIZADO")),(Object)(BA.ObjectToCharSequence("Ingresar al sistema")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 208;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_aceptar_login_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 210;BA.debugLine="StartActivity(Frm_Menu_Principal)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._frm_menu_principal.getObject())));
 BA.debugLineNum = 212;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
Debug.ShouldStop(524288);
parent.mostCurrent._btn_aceptar_login.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 213;BA.debugLine="Txt_Clave.Enabled = True";
Debug.ShouldStop(1048576);
parent.mostCurrent._txt_clave.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 214;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._btn_conf_acceso_ws.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _btn_conf_acceso_ws_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Conf_Acceso_WS_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,336);
if (RapidSub.canDelegate("btn_conf_acceso_ws_click")) { BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","btn_conf_acceso_ws_click"); return;}
ResumableSub_Btn_Conf_Acceso_WS_Click rsub = new ResumableSub_Btn_Conf_Acceso_WS_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Conf_Acceso_WS_Click extends BA.ResumableSub {
public ResumableSub_Btn_Conf_Acceso_WS_Click(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.main parent;
RemoteObject _rsconf = RemoteObject.createImmutable(false);
RemoteObject _old_global_ip_webservice = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _targetdir = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Conf_Acceso_WS_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,336);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 338;BA.debugLine="Wait For (Sb_Clave_ConfLocal) Complete (RsConf As";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_conf_acceso_ws_click"), _sb_clave_conflocal());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_rsconf = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RsConf", _rsconf);
;
 BA.debugLineNum = 340;BA.debugLine="If Not(RsConf) Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rsconf)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 341;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 344;BA.debugLine="Dim Old_Global_Ip_WebService As String = Variable";
Debug.ShouldStop(8388608);
_old_global_ip_webservice = parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ;Debug.locals.put("Old_Global_Ip_WebService", _old_global_ip_webservice);Debug.locals.put("Old_Global_Ip_WebService", _old_global_ip_webservice);
 BA.debugLineNum = 346;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent.mostCurrent._xui.runMethod(false,"CreatePanel",main.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 347;BA.debugLine="p.SetLayoutAnimated(0, 0, 20dip, 300dip, 80dip)";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 BA.debugLineNum = 348;BA.debugLine="p.LoadLayout(\"Conf_Local1\")";
Debug.ShouldStop(134217728);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Conf_Local1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 350;BA.debugLine="Txt_Flp_WebService.Text = Variables.Global_Ip_Web";
Debug.ShouldStop(536870912);
parent.mostCurrent._txt_flp_webservice.runClassMethod (BaKapp.Movil.Tag.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ );
 BA.debugLineNum = 352;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._dialog.setField ("_putattop" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 353;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_conf_acceso_ws_click"), parent.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 20;
return;
case 20:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 354;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 356;BA.debugLine="Variables.Global_Ip_WebService = Txt_Flp_WebServ";
Debug.ShouldStop(8);
parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/  = parent.mostCurrent._txt_flp_webservice.runClassMethod (BaKapp.Movil.Tag.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ).runMethod(true,"trim");
 BA.debugLineNum = 358;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIE";
Debug.ShouldStop(32);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select Top 1 EMPRESA From CONFIES");
 BA.debugLineNum = 359;BA.debugLine="ProgressDialogShow(\"Probando conexión\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Probando conexión"))));
 BA.debugLineNum = 360;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Ge";
Debug.ShouldStop(128);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(main.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 361;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_conf_acceso_ws_click"), (_js));
this.state = 21;
return;
case 21:
//C
this.state = 8;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 363;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 8:
//if
this.state = 17;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 365;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(4096);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 366;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(8192);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 367;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 369;BA.debugLine="Dim bmp1 As Bitmap = LoadBitmap(File.DirAssets";
Debug.ShouldStop(65536);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));Debug.locals.put("bmp1", _bmp1);Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 371;BA.debugLine="Msgbox2Async(\"Conexion existosa\" , \"Conexión W";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Conexion existosa")),(Object)(BA.ObjectToCharSequence("Conexión WebService")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 372;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btn_conf_acceso_ws_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 374;BA.debugLine="Dim TargetDir As String = DBUtils.GetDBFolder";
Debug.ShouldStop(2097152);
_targetdir = parent.mostCurrent._dbutils.runMethod(true,"_getdbfolder" /*RemoteObject*/ ,main.mostCurrent.activityBA);Debug.locals.put("TargetDir", _targetdir);Debug.locals.put("TargetDir", _targetdir);
 BA.debugLineNum = 375;BA.debugLine="File.Delete(TargetDir, \"ConexionWebService.txt";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(_targetdir),(Object)(RemoteObject.createImmutable("ConexionWebService.txt")));
 BA.debugLineNum = 376;BA.debugLine="File.WriteString(TargetDir,\"ConexionWebService";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_targetdir),(Object)(BA.ObjectToString("ConexionWebService.txt")),(Object)(parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/ ));
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 385;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 386;BA.debugLine="Msgbox2Async(\"No se pudo establecer la conexion";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se pudo establecer la conexion con el Web Service")),(Object)(BA.ObjectToCharSequence("Conexión WebService")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 387;BA.debugLine="Variables.Global_Ip_WebService = Old_Global_Ip_";
Debug.ShouldStop(4);
parent.mostCurrent._variables._global_ip_webservice /*RemoteObject*/  = _old_global_ip_webservice;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _disablestrictmode() throws Exception{
try {
		Debug.PushSubsStack("DisableStrictMode (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,397);
if (RapidSub.canDelegate("disablestrictmode")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","disablestrictmode");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _policy = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _sm = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 397;BA.debugLine="Sub DisableStrictMode";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 399;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
Debug.ShouldStop(16384);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build.VERSION")));
 BA.debugLineNum = 400;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))),BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 401;BA.debugLine="Dim policy As JavaObject";
Debug.ShouldStop(65536);
_policy = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("policy", _policy);
 BA.debugLineNum = 402;BA.debugLine="policy = policy.InitializeNewInstance(\"android.o";
Debug.ShouldStop(131072);
_policy = _policy.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("android.os.StrictMode.ThreadPolicy.Builder")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("policy", _policy);
 BA.debugLineNum = 403;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null).R";
Debug.ShouldStop(262144);
_policy = _policy.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("permitAll")),(Object)((main.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("build")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("policy", _policy);
 BA.debugLineNum = 404;BA.debugLine="Dim sm As JavaObject";
Debug.ShouldStop(524288);
_sm = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("sm", _sm);
 BA.debugLineNum = 405;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").Run";
Debug.ShouldStop(1048576);
_sm.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.StrictMode"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setThreadPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_policy.getObject())})));
 };
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 35;BA.debugLine="Dim Consulta_Sql As String";
main.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Private Txt_Clave As EditText";
main.mostCurrent._txt_clave = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Btn_Aceptar_Login As Button";
main.mostCurrent._btn_aceptar_login = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Version As Label";
main.mostCurrent._lbl_version = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim TecladoSoft As IME ' biblioteca IME";
main.mostCurrent._tecladosoft = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 43;BA.debugLine="Private Lbl_Id_Dispositivo As Label";
main.mostCurrent._lbl_id_dispositivo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Btn_Conf_Acceso_WS As Button";
main.mostCurrent._btn_conf_acceso_ws = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim xui As XUI";
main.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 47;BA.debugLine="Private dialog As B4XDialog";
main.mostCurrent._dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");
 //BA.debugLineNum = 49;BA.debugLine="Private Txt_Flp_WebService As B4XFloatTextField";
main.mostCurrent._txt_flp_webservice = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xfloattextfield");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_id_dispositivo_longclick() throws Exception{
try {
		Debug.PushSubsStack("Lbl_Id_Dispositivo_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,410);
if (RapidSub.canDelegate("lbl_id_dispositivo_longclick")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","lbl_id_dispositivo_longclick");}
 BA.debugLineNum = 410;BA.debugLine="Private Sub Lbl_Id_Dispositivo_LongClick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 411;BA.debugLine="xui.MsgboxAsync(Lbl_Id_Dispositivo.Text, \"Bakapp";
Debug.ShouldStop(67108864);
main.mostCurrent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence(main.mostCurrent._lbl_id_dispositivo.runMethod(true,"getText"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Bakapp información"))));
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
buscar_entidad_subs_0._process_globals();
buscar_productos_subs_0._process_globals();
frm_impresion_subs_0._process_globals();
conf_local_subs_0._process_globals();
dbutils_subs_0._process_globals();
frm_buscar_documento_subs_0._process_globals();
frm_documentos_generados_subs_0._process_globals();
frm_editar_obsoc_subs_0._process_globals();
frm_etiquetas_subs_0._process_globals();
frm_infostockxprod_subs_0._process_globals();
frm_menu_post_venta_subs_0._process_globals();
frm_menu_principal_subs_0._process_globals();
frm_post_01_descuentos_subs_0._process_globals();
frm_post_01_formulario_subs_0._process_globals();
frm_post_01_producto_subs_0._process_globals();
funciones_subs_0._process_globals();
variables_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.main");
buscar_entidad.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.buscar_entidad");
buscar_productos.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.buscar_productos");
frm_impresion.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_impresion");
cl_conf_local.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.cl_conf_local");
cl_permisoxui.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.cl_permisoxui");
cl_stxbodxprod.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.cl_stxbodxprod");
clfunciones.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.clfunciones");
clfunciones2.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.clfunciones2");
conectar_conf.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.conectar_conf");
conf_local.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.conf_local");
crear_documento.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.crear_documento");
dbutils.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.dbutils");
frm_buscar_documento.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_buscar_documento");
frm_documentos_generados.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_documentos_generados");
frm_editar_obsoc.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_editar_obsoc");
frm_etiquetas.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_etiquetas");
frm_infostockxprod.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_infostockxprod");
frm_menu_post_venta.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_menu_post_venta");
frm_menu_principal.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_menu_principal");
frm_post_01_descuentos.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_post_01_descuentos");
frm_post_01_formulario.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_post_01_formulario");
frm_post_01_producto.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.frm_post_01_producto");
funciones.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.funciones");
mensajes.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.mensajes");
producto.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.producto");
tidonudo.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.tidonudo");
variables.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.variables");
xml2map.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.xml2map");
httputils2service.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.httputils2service");
httpjob.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xplusminus");
b4xprogressdialog.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xprogressdialog");
b4xradiobutton.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("BaKapp.Movil.Tag.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb_clave_conflocal() throws Exception{
try {
		Debug.PushSubsStack("Sb_Clave_ConfLocal (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,414);
if (RapidSub.canDelegate("sb_clave_conflocal")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","sb_clave_conflocal");}
ResumableSub_Sb_Clave_ConfLocal rsub = new ResumableSub_Sb_Clave_ConfLocal(null);
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
public static class ResumableSub_Sb_Clave_ConfLocal extends BA.ResumableSub {
public ResumableSub_Sb_Clave_ConfLocal(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.main parent;
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _clave_aceptada = RemoteObject.createImmutable(false);
RemoteObject _msg = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _rsclave = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Clave_ConfLocal (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,414);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 416;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(-2147483648);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 417;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(1);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 418;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(2);
parent.mostCurrent._dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");
 BA.debugLineNum = 419;BA.debugLine="Dim Clave_Aceptada As Boolean";
Debug.ShouldStop(4);
_clave_aceptada = RemoteObject.createImmutable(false);Debug.locals.put("Clave_Aceptada", _clave_aceptada);
 BA.debugLineNum = 420;BA.debugLine="Dim Msg As String";
Debug.ShouldStop(8);
_msg = RemoteObject.createImmutable("");Debug.locals.put("Msg", _msg);
 BA.debugLineNum = 421;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(16);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 423;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(64);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA);
 BA.debugLineNum = 425;BA.debugLine="Base = Activity";
Debug.ShouldStop(256);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 426;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(512);
parent.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 428;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"key.png\")";
Debug.ShouldStop(2048);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("key.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 429;BA.debugLine="Msg = \"Para ingresar a la configuración debera in";
Debug.ShouldStop(4096);
_msg = BA.ObjectToString("Para ingresar a la configuración debera ingresar una clave de validación");Debug.locals.put("Msg", _msg);
 BA.debugLineNum = 430;BA.debugLine="Msgbox2Async(Msg , \"Configuración local\", \"Ok\", \"";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msg)),(Object)(BA.ObjectToCharSequence("Configuración local")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 431;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "sb_clave_conflocal"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 433;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 434;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 437;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese Clave de C";
Debug.ShouldStop(1048576);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese Clave de Conf.Local"));
 BA.debugLineNum = 438;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(2097152);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 439;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
Debug.ShouldStop(4194304);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 441;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "sb_clave_conflocal"), parent.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rsclave = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RsClave", _rsclave);
;
 BA.debugLineNum = 442;BA.debugLine="If RsClave = xui.DialogResponse_Positive Then";
Debug.ShouldStop(33554432);
if (true) break;

case 5:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_rsclave,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 443;BA.debugLine="If	InputTemplate.Text = \"971364\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_inputtemplate.getField(true,"_text" /*RemoteObject*/ ),BA.ObjectToString("971364"))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 444;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
Debug.ShouldStop(134217728);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 445;BA.debugLine="Clave_Aceptada = True";
Debug.ShouldStop(268435456);
_clave_aceptada = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Clave_Aceptada", _clave_aceptada);
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 447;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(1073741824);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 448;BA.debugLine="Msg = \"Clave incorrecta\"";
Debug.ShouldStop(-2147483648);
_msg = BA.ObjectToString("Clave incorrecta");Debug.locals.put("Msg", _msg);
 BA.debugLineNum = 449;BA.debugLine="Msgbox2Async(Msg , \"Configuración local\", \"Ok\",";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msg)),(Object)(BA.ObjectToCharSequence("Configuración local")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 450;BA.debugLine="Clave_Aceptada = False";
Debug.ShouldStop(2);
_clave_aceptada = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Clave_Aceptada", _clave_aceptada);
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
 BA.debugLineNum = 454;BA.debugLine="Return Clave_Aceptada";
Debug.ShouldStop(32);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clave_aceptada));return;};
 BA.debugLineNum = 456;BA.debugLine="End Sub";
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
public static void  _sb_login_ws_json(RemoteObject _vclave) throws Exception{
try {
		Debug.PushSubsStack("Sb_Login_Ws_Json (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,224);
if (RapidSub.canDelegate("sb_login_ws_json")) { BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","sb_login_ws_json", _vclave); return;}
ResumableSub_Sb_Login_Ws_Json rsub = new ResumableSub_Sb_Login_Ws_Json(null,_vclave);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Login_Ws_Json extends BA.ResumableSub {
public ResumableSub_Sb_Login_Ws_Json(BaKapp.Movil.Tag.main parent,RemoteObject _vclave) {
this.parent = parent;
this._vclave = _vclave;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.main parent;
RemoteObject _vclave;
RemoteObject _vmensaje = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _vnokofu = RemoteObject.createImmutable("");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Login_Ws_Json (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,224);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("vClave", _vclave);
 BA.debugLineNum = 226;BA.debugLine="Dim vMensaje As String";
Debug.ShouldStop(2);
_vmensaje = RemoteObject.createImmutable("");Debug.locals.put("vMensaje", _vmensaje);
 BA.debugLineNum = 227;BA.debugLine="vClave = Funciones.Fx_TraeClaveRD(vClave)";
Debug.ShouldStop(4);
_vclave = parent.mostCurrent._funciones.runMethod(true,"_fx_traeclaverd" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_vclave));Debug.locals.put("vClave", _vclave);
 BA.debugLineNum = 229;BA.debugLine="If vClave.Trim = \"\" Then vClave = \"X\"";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_vclave.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_vclave = BA.ObjectToString("X");Debug.locals.put("vClave", _vclave);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 231;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where P";
Debug.ShouldStop(64);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From TABFU Where PWFU = '"),_vclave,RemoteObject.createImmutable("'"));
 BA.debugLineNum = 232;BA.debugLine="Log(vClave)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6458760",_vclave,0);
 BA.debugLineNum = 234;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(512);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(main.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 235;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "sb_login_ws_json"), (_js));
this.state = 39;
return;
case 39:
//C
this.state = 7;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 237;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 38;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 37;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 239;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16384);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 241;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(65536);
if (true) break;

case 10:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 243;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
Debug.ShouldStop(262144);
parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/  = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 245;BA.debugLine="Dim vNOKOFU As String = Variables.Global_Row_Us";
Debug.ShouldStop(1048576);
_vnokofu = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOFU")))));Debug.locals.put("vNOKOFU", _vnokofu);Debug.locals.put("vNOKOFU", _vnokofu);
 BA.debugLineNum = 247;BA.debugLine="vMensaje = \"Bienvenido: \" & vNOKOFU";
Debug.ShouldStop(4194304);
_vmensaje = RemoteObject.concat(RemoteObject.createImmutable("Bienvenido: "),_vnokofu);Debug.locals.put("vMensaje", _vmensaje);
 BA.debugLineNum = 248;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo";
Debug.ShouldStop(8388608);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'");
 BA.debugLineNum = 250;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
Debug.ShouldStop(33554432);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(main.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 251;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "sb_login_ws_json"), (_js));
this.state = 40;
return;
case 40:
//C
this.state = 13;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 253;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 13:
//if
this.state = 32;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 255;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1073741824);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 257;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1);
if (true) break;

case 16:
//if
this.state = 31;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 259;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.Get";
Debug.ShouldStop(4);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 261;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Ba";
Debug.ShouldStop(16);
parent.mostCurrent._variables._global_basebk /*RemoteObject*/  = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Global_BaseBk")))));
 BA.debugLineNum = 262;BA.debugLine="Variables.Global_Sesion_Star = True";
Debug.ShouldStop(32);
parent.mostCurrent._variables._global_sesion_star /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 264;BA.debugLine="Consulta_Sql = \"Select Top 1 * From CONFIEST\"";
Debug.ShouldStop(128);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From CONFIEST"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Inner Join "),parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_Configuracion On Empresa = EMPRESA And Modalidad = MODALIDAD"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where EMPRESA = '01'"));
 BA.debugLineNum = 268;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
Debug.ShouldStop(2048);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(main.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 269;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "sb_login_ws_json"), (_js));
this.state = 41;
return;
case 41:
//C
this.state = 19;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 271;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 19:
//if
this.state = 30;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 29;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 273;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 275;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(262144);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 277;BA.debugLine="Variables.Global_Row_Configuracion_General";
Debug.ShouldStop(1048576);
parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/  = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 279;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row";
Debug.ShouldStop(4194304);
parent.mostCurrent._variables._gl_empresa /*RemoteObject*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA")))));
 BA.debugLineNum = 280;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Ro";
Debug.ShouldStop(8388608);
parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESUCURSAL")))));
 BA.debugLineNum = 281;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_";
Debug.ShouldStop(16777216);
parent.mostCurrent._variables._gl_bodega /*RemoteObject*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EBODEGA")))));
 BA.debugLineNum = 282;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Co";
Debug.ShouldStop(33554432);
parent.mostCurrent._variables._gl_caja /*RemoteObject*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ECAJA")))));
 BA.debugLineNum = 283;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid";
Debug.ShouldStop(67108864);
parent.mostCurrent._variables._gl_lista_precios /*RemoteObject*/  = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ELISTAVEN")))))),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 284;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(V";
Debug.ShouldStop(134217728);
parent.mostCurrent._variables._gl_lista_costos /*RemoteObject*/  = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ELISTACOM")))))),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 3)));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 287;BA.debugLine="Variables.Global_Row_Configuracion_General";
Debug.ShouldStop(1073741824);
parent.mostCurrent._variables._global_row_configuracion_general /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 291;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6458819",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 295;BA.debugLine="StartActivity(Frm_Menu_Principal)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._frm_menu_principal.getObject())));
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 302;BA.debugLine="vMensaje = \"ACCESO DENEGADO\"";
Debug.ShouldStop(8192);
_vmensaje = BA.ObjectToString("ACCESO DENEGADO");Debug.locals.put("vMensaje", _vmensaje);
 BA.debugLineNum = 303;BA.debugLine="Txt_Clave.Text = \"\"";
Debug.ShouldStop(16384);
parent.mostCurrent._txt_clave.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 35:
//C
this.state = 38;
;
 BA.debugLineNum = 306;BA.debugLine="Log(Variables.Global_BaseBk)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6458834",parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,0);
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 311;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6458839",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 314;BA.debugLine="End Sub";
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
public static RemoteObject  _txt_clave_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("Txt_Clave_EnterPressed (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,218);
if (RapidSub.canDelegate("txt_clave_enterpressed")) { return BaKapp.Movil.Tag.main.remoteMe.runUserSub(false, "main","txt_clave_enterpressed");}
 BA.debugLineNum = 218;BA.debugLine="Sub Txt_Clave_EnterPressed";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 220;BA.debugLine="Sb_Login_Ws_Json(Txt_Clave.Text)";
Debug.ShouldStop(134217728);
_sb_login_ws_json(main.mostCurrent._txt_clave.runMethod(true,"getText"));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}