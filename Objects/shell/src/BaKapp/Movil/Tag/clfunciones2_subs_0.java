package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clfunciones2_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "clfunciones2","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 27;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
clfunciones2._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",clfunciones2._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
clfunciones2._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",clfunciones2._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView";
clfunciones2._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",clfunciones2._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
clfunciones2._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clfunciones2._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
clfunciones2._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",clfunciones2._tag);
 //BA.debugLineNum = 10;BA.debugLine="Public NewPara As String";
clfunciones2._newpara = RemoteObject.createImmutable("");__ref.setField("_newpara",clfunciones2._newpara);
 //BA.debugLineNum = 11;BA.debugLine="Private Consulta_Sql As String";
clfunciones2._consulta_sql = RemoteObject.createImmutable("");__ref.setField("_consulta_sql",clfunciones2._consulta_sql);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "clfunciones2","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 22;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(2097152);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 23;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_actualizarcorreoentidad(RemoteObject __ref,RemoteObject _koen,RemoteObject _suen,RemoteObject _para,RemoteObject _campoemail) throws Exception{
try {
		Debug.PushSubsStack("Fx_ActualizarCorreoEntidad (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("fx_actualizarcorreoentidad")) { return __ref.runUserSub(false, "clfunciones2","fx_actualizarcorreoentidad", __ref, _koen, _suen, _para, _campoemail);}
ResumableSub_Fx_ActualizarCorreoEntidad rsub = new ResumableSub_Fx_ActualizarCorreoEntidad(null,__ref,_koen,_suen,_para,_campoemail);
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
public static class ResumableSub_Fx_ActualizarCorreoEntidad extends BA.ResumableSub {
public ResumableSub_Fx_ActualizarCorreoEntidad(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref,RemoteObject _koen,RemoteObject _suen,RemoteObject _para,RemoteObject _campoemail) {
this.parent = parent;
this.__ref = __ref;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _koen;
RemoteObject _suen;
RemoteObject _para;
RemoteObject _campoemail;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_ActualizarCorreoEntidad (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,151);
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
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
Debug.locals.put("Para", _para);
Debug.locals.put("CampoEmail", _campoemail);
 BA.debugLineNum = 153;BA.debugLine="Dim Consulta_Sql As String = \"Update MAEEN Set \"";
Debug.ShouldStop(16777216);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Update MAEEN Set "),_campoemail,RemoteObject.createImmutable(" = '"),_para,RemoteObject.createImmutable("' Where KOEN = '"),_koen,RemoteObject.createImmutable("' And SUEN = '"),_suen,RemoteObject.createImmutable("'"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Select Cast(1 As Bit) As Ok"));__ref.setField("_consulta_sql",parent._consulta_sql);
 BA.debugLineNum = 156;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(134217728);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 157;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_actualizarcorreoentidad"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 159;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 8;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 161;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 163;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 164;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 169;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _fx_enviar_correo_bakapp1(RemoteObject __ref,RemoteObject _idmaeedo,RemoteObject _koen,RemoteObject _suen,RemoteObject _para,RemoteObject _campoemail,RemoteObject _editarmaeen) throws Exception{
try {
		Debug.PushSubsStack("Fx_Enviar_Correo_Bakapp1 (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("fx_enviar_correo_bakapp1")) { return __ref.runUserSub(false, "clfunciones2","fx_enviar_correo_bakapp1", __ref, _idmaeedo, _koen, _suen, _para, _campoemail, _editarmaeen);}
ResumableSub_Fx_Enviar_Correo_Bakapp1 rsub = new ResumableSub_Fx_Enviar_Correo_Bakapp1(null,__ref,_idmaeedo,_koen,_suen,_para,_campoemail,_editarmaeen);
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
public static class ResumableSub_Fx_Enviar_Correo_Bakapp1 extends BA.ResumableSub {
public ResumableSub_Fx_Enviar_Correo_Bakapp1(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref,RemoteObject _idmaeedo,RemoteObject _koen,RemoteObject _suen,RemoteObject _para,RemoteObject _campoemail,RemoteObject _editarmaeen) {
this.parent = parent;
this.__ref = __ref;
this._idmaeedo = _idmaeedo;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this._editarmaeen = _editarmaeen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _idmaeedo;
RemoteObject _koen;
RemoteObject _suen;
RemoteObject _para;
RemoteObject _campoemail;
RemoteObject _editarmaeen;
RemoteObject _codfuncionario = RemoteObject.createImmutable("");
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _modalidad = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _resultado = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Enviar_Correo_Bakapp1 (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,31);
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
Debug.locals.put("Idmaeedo", _idmaeedo);
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
Debug.locals.put("Para", _para);
Debug.locals.put("CampoEmail", _campoemail);
Debug.locals.put("EditarMaeen", _editarmaeen);
 BA.debugLineNum = 33;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
Debug.ShouldStop(1);
_codfuncionario = BA.ObjectToString(parent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))));Debug.locals.put("CodFuncionario", _codfuncionario);Debug.locals.put("CodFuncionario", _codfuncionario);
 BA.debugLineNum = 34;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(2);
_empresa = parent._variables._gl_empresa /*RemoteObject*/ ;Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 35;BA.debugLine="Dim Modalidad As String = Variables.Gl_Modalidad";
Debug.ShouldStop(4);
_modalidad = parent._variables._gl_modalidad /*RemoteObject*/ ;Debug.locals.put("Modalidad", _modalidad);Debug.locals.put("Modalidad", _modalidad);
 BA.debugLineNum = 36;BA.debugLine="Dim Error As String";
Debug.ShouldStop(8);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 38;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(32);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 39;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(64);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 41;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(256);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_base));
 BA.debugLineNum = 43;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(1024);
parent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",parent._xui);
 BA.debugLineNum = 45;BA.debugLine="Wait For(Sb_Ingresar_Correo_Validar(Koen,Suen,Par";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_enviar_correo_bakapp1"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_sb_ingresar_correo_validar" /*RemoteObject*/ ,(Object)(_koen),(Object)(_suen),(Object)(_para),(Object)(BA.ObjectToString("EMAILCOMER")),(Object)(parent.__c.getField(true,"True"))));
this.state = 22;
return;
case 22:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 46;BA.debugLine="NewPara = Resultado";
Debug.ShouldStop(8192);
__ref.setField ("_newpara" /*RemoteObject*/ ,_resultado);
 BA.debugLineNum = 48;BA.debugLine="If NewPara = \"\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_newpara" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="Return \"Sin correo receptor\"";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Sin correo receptor")));return;};
 if (true) break;
;
 BA.debugLineNum = 52;BA.debugLine="If NewPara = \"Cancelar\" Then";
Debug.ShouldStop(524288);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_newpara" /*RemoteObject*/ ),BA.ObjectToString("Cancelar"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 53;BA.debugLine="Return \"Cancelado por el usuario\"";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Cancelado por el usuario")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 56;BA.debugLine="Para = NewPara";
Debug.ShouldStop(8388608);
_para = __ref.getField(true,"_newpara" /*RemoteObject*/ );Debug.locals.put("Para", _para);
 BA.debugLineNum = 58;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Env";
Debug.ShouldStop(33554432);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_enviarcorreobakapp" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(_empresa),(Object)(_modalidad),(Object)(_codfuncionario),(Object)(_idmaeedo),(Object)(__ref.getField(true,"_newpara" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 59;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_enviar_correo_bakapp1"), (_js));
this.state = 23;
return;
case 23:
//C
this.state = 8;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 61;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 8:
//if
this.state = 21;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 63;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1073741824);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 65;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1);
if (true) break;

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 67;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
Debug.ShouldStop(4);
_respuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_respuesta = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Respuesta", _respuesta);Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 68;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
Debug.ShouldStop(8);
_error = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 70;BA.debugLine="If Error = \"Ok\" Then";
Debug.ShouldStop(32);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_error,BA.ObjectToString("Ok"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Docuemto enviado a casilla d";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Docuemto enviado a casilla de salida de email...")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 77;BA.debugLine="Error = \"Falta la función en el WS\"";
Debug.ShouldStop(4096);
_error = BA.ObjectToString("Falta la función en el WS");Debug.locals.put("Error", _error);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 82;BA.debugLine="Return Error";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_error));return;};
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _fx_formato_modalidad(RemoteObject __ref,RemoteObject _empresa,RemoteObject _modalidad,RemoteObject _tido) throws Exception{
try {
		Debug.PushSubsStack("Fx_Formato_Modalidad (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("fx_formato_modalidad")) { return __ref.runUserSub(false, "clfunciones2","fx_formato_modalidad", __ref, _empresa, _modalidad, _tido);}
ResumableSub_Fx_Formato_Modalidad rsub = new ResumableSub_Fx_Formato_Modalidad(null,__ref,_empresa,_modalidad,_tido);
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
public static class ResumableSub_Fx_Formato_Modalidad extends BA.ResumableSub {
public ResumableSub_Fx_Formato_Modalidad(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref,RemoteObject _empresa,RemoteObject _modalidad,RemoteObject _tido) {
this.parent = parent;
this.__ref = __ref;
this._empresa = _empresa;
this._modalidad = _modalidad;
this._tido = _tido;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _empresa;
RemoteObject _modalidad;
RemoteObject _tido;
RemoteObject _respuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Formato_Modalidad (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,207);
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
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Modalidad", _modalidad);
Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 209;BA.debugLine="Dim Respuesta As Map";
Debug.ShouldStop(65536);
_respuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 211;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_For";
Debug.ShouldStop(262144);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_formatomodalidad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_empresa),(Object)(_modalidad),(Object)(_tido),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 212;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_formato_modalidad"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 214;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 8;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 216;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8388608);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 217;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 218;BA.debugLine="Respuesta = Funciones.Fx_DataRow(Js.GetString)";
Debug.ShouldStop(33554432);
_respuesta = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Respuesta", _respuesta);
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
 BA.debugLineNum = 222;BA.debugLine="Return Respuesta";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuesta));return;};
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
public static RemoteObject  _fx_imprimir_bakapp(RemoteObject __ref,RemoteObject _idmaeedo) throws Exception{
try {
		Debug.PushSubsStack("Fx_Imprimir_Bakapp (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("fx_imprimir_bakapp")) { return __ref.runUserSub(false, "clfunciones2","fx_imprimir_bakapp", __ref, _idmaeedo);}
ResumableSub_Fx_Imprimir_Bakapp rsub = new ResumableSub_Fx_Imprimir_Bakapp(null,__ref,_idmaeedo);
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
public static class ResumableSub_Fx_Imprimir_Bakapp extends BA.ResumableSub {
public ResumableSub_Fx_Imprimir_Bakapp(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref,RemoteObject _idmaeedo) {
this.parent = parent;
this.__ref = __ref;
this._idmaeedo = _idmaeedo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _idmaeedo;
RemoteObject _codfuncionario = RemoteObject.createImmutable("");
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _modalidad = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _respuesta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Imprimir_Bakapp (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,173);
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
Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 175;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
Debug.ShouldStop(16384);
_codfuncionario = BA.ObjectToString(parent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))));Debug.locals.put("CodFuncionario", _codfuncionario);Debug.locals.put("CodFuncionario", _codfuncionario);
 BA.debugLineNum = 176;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(32768);
_empresa = parent._variables._gl_empresa /*RemoteObject*/ ;Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 177;BA.debugLine="Dim Modalidad As String = Variables.Gl_Modalidad";
Debug.ShouldStop(65536);
_modalidad = parent._variables._gl_modalidad /*RemoteObject*/ ;Debug.locals.put("Modalidad", _modalidad);Debug.locals.put("Modalidad", _modalidad);
 BA.debugLineNum = 178;BA.debugLine="Dim Error As String";
Debug.ShouldStop(131072);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 180;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Env";
Debug.ShouldStop(524288);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_enviarimprimirbakapp" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(_empresa),(Object)(_modalidad),(Object)(_codfuncionario),(Object)(_idmaeedo));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 181;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_imprimir_bakapp"), (_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 183;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 185;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 187;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 189;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
Debug.ShouldStop(268435456);
_respuesta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_respuesta = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Respuesta", _respuesta);Debug.locals.put("Respuesta", _respuesta);
 BA.debugLineNum = 191;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
Debug.ShouldStop(1073741824);
_error = BA.ObjectToString(_respuesta.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("Error", _error);Debug.locals.put("Error", _error);
 BA.debugLineNum = 193;BA.debugLine="If Error = \"Ok\" Then";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_error,BA.ObjectToString("Ok"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 194;BA.debugLine="ToastMessageShow(\"Documento enviado a imprimir";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Documento enviado a imprimir...")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 198;BA.debugLine="Error = \"Falta la función en el WS\"";
Debug.ShouldStop(32);
_error = BA.ObjectToString("Falta la función en el WS");Debug.locals.put("Error", _error);
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
 BA.debugLineNum = 203;BA.debugLine="Return Error";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_error));return;};
 BA.debugLineNum = 205;BA.debugLine="End Sub";
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
public static RemoteObject  _fx_revisarformato(RemoteObject __ref,RemoteObject _tido) throws Exception{
try {
		Debug.PushSubsStack("Fx_RevisarFormato (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("fx_revisarformato")) { return __ref.runUserSub(false, "clfunciones2","fx_revisarformato", __ref, _tido);}
ResumableSub_Fx_RevisarFormato rsub = new ResumableSub_Fx_RevisarFormato(null,__ref,_tido);
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
public static class ResumableSub_Fx_RevisarFormato extends BA.ResumableSub {
public ResumableSub_Fx_RevisarFormato(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref,RemoteObject _tido) {
this.parent = parent;
this.__ref = __ref;
this._tido = _tido;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _tido;
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _clfx2 = RemoteObject.declareNull("BaKapp.Movil.Tag.clfunciones2");
RemoteObject _resultado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _escorrecto = RemoteObject.createImmutable(false);
RemoteObject _errormsg = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _tieneformato = RemoteObject.createImmutable(false);
RemoteObject _nombrefomato = RemoteObject.createImmutable("");
RemoteObject _nombrefomatoenmod = RemoteObject.createImmutable("");
RemoteObject _msg = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_RevisarFormato (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,252);
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
Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 254;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(536870912);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 256;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(-2147483648);
_bmp1 = parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 258;BA.debugLine="Dim CLFx2 As ClFunciones2";
Debug.ShouldStop(2);
_clfx2 = RemoteObject.createNew ("BaKapp.Movil.Tag.clfunciones2");Debug.locals.put("CLFx2", _clfx2);
 BA.debugLineNum = 259;BA.debugLine="CLFx2.Initialize(Null,\"\")";
Debug.ShouldStop(4);
_clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 260;BA.debugLine="CLFx2.DesignerCreateView(mBase,Null,Null)";
Debug.ShouldStop(8);
_clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_designercreateview" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 261;BA.debugLine="Wait For(CLFx2.Fx_Formato_Modalidad(Variables.Gl_";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_revisarformato"), _clfx2.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_formato_modalidad" /*RemoteObject*/ ,(Object)(parent._variables._gl_empresa /*RemoteObject*/ ),(Object)(parent._variables._gl_modalidad /*RemoteObject*/ ),(Object)(_tido)));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 263;BA.debugLine="Dim EsCorrecto As Boolean = Resultado.Get(\"EsCorr";
Debug.ShouldStop(64);
_escorrecto = BA.ObjectToBoolean(_resultado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EsCorrecto")))));Debug.locals.put("EsCorrecto", _escorrecto);Debug.locals.put("EsCorrecto", _escorrecto);
 BA.debugLineNum = 265;BA.debugLine="If Not(EsCorrecto) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(_escorrecto)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
 BA.debugLineNum = 266;BA.debugLine="Dim ErrorMsg As String = Resultado.Get(\"Error\")";
Debug.ShouldStop(512);
_errormsg = BA.ObjectToString(_resultado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("ErrorMsg", _errormsg);Debug.locals.put("ErrorMsg", _errormsg);
 BA.debugLineNum = 267;BA.debugLine="Msgbox2Async(ErrorMsg & CRLF & _ 					 \"Informe";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_errormsg,parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Informe al administrador del sistema")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 269;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_revisarformato"), null);
this.state = 27;
return;
case 27:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 270;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 273;BA.debugLine="Dim TieneFormato As Boolean = Resultado.Get(\"Tie";
Debug.ShouldStop(65536);
_tieneformato = BA.ObjectToBoolean(_resultado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TieneFormato")))));Debug.locals.put("TieneFormato", _tieneformato);Debug.locals.put("TieneFormato", _tieneformato);
 BA.debugLineNum = 274;BA.debugLine="Dim NombreFomato As String = Resultado.Get(\"Nomb";
Debug.ShouldStop(131072);
_nombrefomato = BA.ObjectToString(_resultado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreFomato")))));Debug.locals.put("NombreFomato", _nombrefomato);Debug.locals.put("NombreFomato", _nombrefomato);
 BA.debugLineNum = 275;BA.debugLine="Dim NombreFomatoEnMod As String = Resultado.Get(";
Debug.ShouldStop(262144);
_nombrefomatoenmod = BA.ObjectToString(_resultado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreFomatoEnMod")))));Debug.locals.put("NombreFomatoEnMod", _nombrefomatoenmod);Debug.locals.put("NombreFomatoEnMod", _nombrefomatoenmod);
 BA.debugLineNum = 277;BA.debugLine="Dim Msg As String";
Debug.ShouldStop(1048576);
_msg = RemoteObject.createImmutable("");Debug.locals.put("Msg", _msg);
 BA.debugLineNum = 279;BA.debugLine="If Not(TieneFormato) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 6:
//if
this.state = 15;
if (parent.__c.runMethod(true,"Not",(Object)(_tieneformato)).<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 281;BA.debugLine="If NombreFomatoEnMod = \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_nombrefomatoenmod,BA.ObjectToString(""))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 283;BA.debugLine="Else If NombreFomato = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_nombrefomato,BA.ObjectToString(""))) { 
this.state = 13;
}}
if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 282;BA.debugLine="Msg = \"No existe formato asociado a Empresa: [";
Debug.ShouldStop(33554432);
_msg = RemoteObject.concat(RemoteObject.createImmutable("No existe formato asociado a Empresa: ["),parent._variables._gl_empresa /*RemoteObject*/ ,RemoteObject.createImmutable("],Modalidad: "),parent._variables._gl_modalidad /*RemoteObject*/ );Debug.locals.put("Msg", _msg);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 284;BA.debugLine="Msg = \"No existe el formato [\" & NombreFomatoE";
Debug.ShouldStop(134217728);
_msg = RemoteObject.concat(RemoteObject.createImmutable("No existe el formato ["),_nombrefomatoenmod,RemoteObject.createImmutable("] para Empresa: ["),parent._variables._gl_empresa /*RemoteObject*/ ,RemoteObject.createImmutable("],Modalidad: "),parent._variables._gl_modalidad /*RemoteObject*/ );Debug.locals.put("Msg", _msg);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 287;BA.debugLine="Msgbox2Async(Msg & CRLF & _ 					 \"Informe al a";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_msg,parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Informe al administrador del sistema")))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Validación"),parent.__c.getField(true,"CRLF"),_tido,RemoteObject.createImmutable("-"),_resultado.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Notido"))))))),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 289;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "fx_revisarformato"), null);
this.state = 28;
return;
case 28:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 290;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 294;BA.debugLine="Select Case Tido";
Debug.ShouldStop(32);

case 16:
//select
this.state = 25;
switch (BA.switchObjectToInt(_tido,BA.ObjectToString("COV"),BA.ObjectToString("NVV"),BA.ObjectToString("BLV"),BA.ObjectToString("FCV"))) {
case 0: {
this.state = 18;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
case 2: {
this.state = 22;
if (true) break;
}
case 3: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 18:
//C
this.state = 25;
 BA.debugLineNum = 296;BA.debugLine="Variables.Global_COV = Resultado";
Debug.ShouldStop(128);
parent._variables._global_cov /*RemoteObject*/  = _resultado;
 if (true) break;

case 20:
//C
this.state = 25;
 BA.debugLineNum = 298;BA.debugLine="Variables.Global_NVV = Resultado";
Debug.ShouldStop(512);
parent._variables._global_nvv /*RemoteObject*/  = _resultado;
 if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 300;BA.debugLine="Variables.Global_BLV = Resultado";
Debug.ShouldStop(2048);
parent._variables._global_blv /*RemoteObject*/  = _resultado;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 302;BA.debugLine="Variables.Global_FCV = Resultado";
Debug.ShouldStop(8192);
parent._variables._global_fcv /*RemoteObject*/  = _resultado;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 305;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 306;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clfunciones2","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16384);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 16;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(32768);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_ingresar_correo_validar(RemoteObject __ref,RemoteObject _koen,RemoteObject _suen,RemoteObject _para,RemoteObject _campoemail,RemoteObject _editarmaeen) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ingresar_Correo_Validar (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("sb_ingresar_correo_validar")) { return __ref.runUserSub(false, "clfunciones2","sb_ingresar_correo_validar", __ref, _koen, _suen, _para, _campoemail, _editarmaeen);}
ResumableSub_Sb_Ingresar_Correo_Validar rsub = new ResumableSub_Sb_Ingresar_Correo_Validar(null,__ref,_koen,_suen,_para,_campoemail,_editarmaeen);
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
public static class ResumableSub_Sb_Ingresar_Correo_Validar extends BA.ResumableSub {
public ResumableSub_Sb_Ingresar_Correo_Validar(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref,RemoteObject _koen,RemoteObject _suen,RemoteObject _para,RemoteObject _campoemail,RemoteObject _editarmaeen) {
this.parent = parent;
this.__ref = __ref;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this._editarmaeen = _editarmaeen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _koen;
RemoteObject _suen;
RemoteObject _para;
RemoteObject _campoemail;
RemoteObject _editarmaeen;
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultado = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Ingresar_Correo_Validar (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,86);
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
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
Debug.locals.put("Para", _para);
Debug.locals.put("CampoEmail", _campoemail);
Debug.locals.put("EditarMaeen", _editarmaeen);
 BA.debugLineNum = 88;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(8388608);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 90;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(33554432);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 91;BA.debugLine="Base = mBase";
Debug.ShouldStop(67108864);
_base = __ref.getField(false,"_mbase" /*RemoteObject*/ );Debug.locals.put("Base", _base);
 BA.debugLineNum = 92;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(134217728);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_base));
 BA.debugLineNum = 94;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(536870912);
parent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",parent._xui);
 BA.debugLineNum = 95;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(1073741824);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 97;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(1);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 98;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(2);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 100;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
Debug.ShouldStop(8);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese correo del cliente"));
 BA.debugLineNum = 101;BA.debugLine="InputTemplate.Text = Para";
Debug.ShouldStop(16);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,_para);
 BA.debugLineNum = 103;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_ingresar_correo_validar"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 104;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 105;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 106;BA.debugLine="Para = InputTemplate.Text.Trim";
Debug.ShouldStop(512);
_para = _inputtemplate.getField(true,"_text" /*RemoteObject*/ ).runMethod(true,"trim");Debug.locals.put("Para", _para);
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 108;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","66553622",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 109;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(4096);
_bmp1 = parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 110;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).getObject())),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 111;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_ingresar_correo_validar"), null);
this.state = 31;
return;
case 31:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 112;BA.debugLine="Para = \"Error\"";
Debug.ShouldStop(32768);
_para = BA.ObjectToString("Error");Debug.locals.put("Para", _para);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 115;BA.debugLine="Para = \"Cancelar\"";
Debug.ShouldStop(262144);
_para = BA.ObjectToString("Cancelar");Debug.locals.put("Para", _para);
 if (true) break;
;
 BA.debugLineNum = 118;BA.debugLine="If Para = \"Cancelar\" Then";
Debug.ShouldStop(2097152);

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_para,BA.ObjectToString("Cancelar"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 119;BA.debugLine="Return Para";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_para));return;};
 if (true) break;
;
 BA.debugLineNum = 122;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";
Debug.ShouldStop(33554432);

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent._funciones.runMethod(true,"_fx_isemail" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_para)),parent.__c.getField(true,"False"))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 124;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(134217728);
_bmp1 = parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 125;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 126;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_ingresar_correo_validar"), null);
this.state = 32;
return;
case 32:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 128;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Koen,Suen,P";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_ingresar_correo_validar"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_sb_ingresar_correo_validar" /*RemoteObject*/ ,(Object)(_koen),(Object)(_suen),(Object)(_para),(Object)(_campoemail),(Object)(_editarmaeen)));
this.state = 33;
return;
case 33:
//C
this.state = 18;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 130;BA.debugLine="Para = Resultado";
Debug.ShouldStop(2);
_para = _resultado;Debug.locals.put("Para", _para);
 if (true) break;
;
 BA.debugLineNum = 134;BA.debugLine="If Para <> \"Cancelar\" Then";
Debug.ShouldStop(32);

case 18:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",_para,BA.ObjectToString("Cancelar"))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 136;BA.debugLine="If EditarMaeen Then";
Debug.ShouldStop(128);
if (true) break;

case 21:
//if
this.state = 28;
if (_editarmaeen.<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 137;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
Debug.ShouldStop(256);
_bmp1 = parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 138;BA.debugLine="Wait For (Fx_ActualizarCorreoEntidad(Koen,Suen,";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_ingresar_correo_validar"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_actualizarcorreoentidad" /*RemoteObject*/ ,(Object)(_koen),(Object)(_suen),(Object)(_para),(Object)(_campoemail)));
this.state = 34;
return;
case 34:
//C
this.state = 24;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 139;BA.debugLine="If Res Then";
Debug.ShouldStop(1024);
if (true) break;

case 24:
//if
this.state = 27;
if (_res.<Boolean>get().booleanValue()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 140;BA.debugLine="Msgbox2Async(\"Correo actualizado en la ficha d";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Correo actualizado en la ficha del cliente")),(Object)(BA.ObjectToCharSequence("Información")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 141;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_ingresar_correo_validar"), null);
this.state = 35;
return;
case 35:
//C
this.state = 27;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 147;BA.debugLine="Return Para";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_para));return;};
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _sb_revisarformatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_RevisarFormatos (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("sb_revisarformatos")) { return __ref.runUserSub(false, "clfunciones2","sb_revisarformatos", __ref);}
ResumableSub_Sb_RevisarFormatos rsub = new ResumableSub_Sb_RevisarFormatos(null,__ref);
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
public static class ResumableSub_Sb_RevisarFormatos extends BA.ResumableSub {
public ResumableSub_Sb_RevisarFormatos(BaKapp.Movil.Tag.clfunciones2 parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
RemoteObject _resultado = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_RevisarFormatos (clfunciones2) ","clfunciones2",8,__ref.getField(false, "ba"),__ref,226);
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
 BA.debugLineNum = 228;BA.debugLine="Wait For(Fx_RevisarFormato(\"COV\")) Complete (Resu";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_revisarformatos"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_revisarformato" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("COV"))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 229;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 230;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 233;BA.debugLine="Wait For(Fx_RevisarFormato(\"NVV\")) Complete (Resu";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_revisarformatos"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_revisarformato" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("NVV"))));
this.state = 18;
return;
case 18:
//C
this.state = 5;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 234;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(512);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 235;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 238;BA.debugLine="Wait For(Fx_RevisarFormato(\"BLV\")) Complete (Resu";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_revisarformatos"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_revisarformato" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("BLV"))));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 239;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(16384);
if (true) break;

case 9:
//if
this.state = 12;
if (parent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 240;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 243;BA.debugLine="Wait For(Fx_RevisarFormato(\"FCV\")) Complete (Resu";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clfunciones2", "sb_revisarformatos"), __ref.runClassMethod (BaKapp.Movil.Tag.clfunciones2.class, "_fx_revisarformato" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("FCV"))));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 244;BA.debugLine="If Not(Resultado) Then";
Debug.ShouldStop(524288);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.__c.runMethod(true,"Not",(Object)(_resultado)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 245;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 248;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 250;BA.debugLine="End Sub";
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
}