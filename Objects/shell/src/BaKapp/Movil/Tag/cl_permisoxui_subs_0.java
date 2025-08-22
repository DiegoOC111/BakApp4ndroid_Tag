package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cl_permisoxui_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cl_permisoxui","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 35;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
cl_permisoxui._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cl_permisoxui._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
cl_permisoxui._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cl_permisoxui._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView";
cl_permisoxui._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",cl_permisoxui._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
cl_permisoxui._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cl_permisoxui._xui);
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
cl_permisoxui._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",cl_permisoxui._tag);
 //BA.debugLineNum = 10;BA.debugLine="Private Txt_Clave As B4XView";
cl_permisoxui._txt_clave = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txt_clave",cl_permisoxui._txt_clave);
 //BA.debugLineNum = 11;BA.debugLine="Private Lbl_DescripcionPermiso As B4XView";
cl_permisoxui._lbl_descripcionpermiso = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbl_descripcionpermiso",cl_permisoxui._lbl_descripcionpermiso);
 //BA.debugLineNum = 12;BA.debugLine="Public PermisoAceptado As Boolean";
cl_permisoxui._permisoaceptado = RemoteObject.createImmutable(false);__ref.setField("_permisoaceptado",cl_permisoxui._permisoaceptado);
 //BA.debugLineNum = 13;BA.debugLine="Private Consulta_Sql As String";
cl_permisoxui._consulta_sql = RemoteObject.createImmutable("");__ref.setField("_consulta_sql",cl_permisoxui._consulta_sql);
 //BA.debugLineNum = 14;BA.debugLine="Public Error As String";
cl_permisoxui._error = RemoteObject.createImmutable("");__ref.setField("_error",cl_permisoxui._error);
 //BA.debugLineNum = 15;BA.debugLine="Public RowUsuarioAutoriza As Map";
cl_permisoxui._rowusuarioautoriza = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rowusuarioautoriza",cl_permisoxui._rowusuarioautoriza);
 //BA.debugLineNum = 16;BA.debugLine="Private Lbl_Codigo As B4XView";
cl_permisoxui._lbl_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbl_codigo",cl_permisoxui._lbl_codigo);
 //BA.debugLineNum = 17;BA.debugLine="Public bmp1 As Bitmap";
cl_permisoxui._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",cl_permisoxui._bmp1);
 //BA.debugLineNum = 18;BA.debugLine="Public Aceptado As Boolean";
cl_permisoxui._aceptado = RemoteObject.createImmutable(false);__ref.setField("_aceptado",cl_permisoxui._aceptado);
 //BA.debugLineNum = 19;BA.debugLine="Public Cancelado As Boolean";
cl_permisoxui._cancelado = RemoteObject.createImmutable(false);__ref.setField("_cancelado",cl_permisoxui._cancelado);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cl_permisoxui","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="mBase = Base";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 30;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(536870912);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 31;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fx_rowtraerusuario(RemoteObject __ref,RemoteObject _kofu) throws Exception{
try {
		Debug.PushSubsStack("Fx_RowTraerUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("fx_rowtraerusuario")) { return __ref.runUserSub(false, "cl_permisoxui","fx_rowtraerusuario", __ref, _kofu);}
ResumableSub_Fx_RowTraerUsuario rsub = new ResumableSub_Fx_RowTraerUsuario(null,__ref,_kofu);
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
public static class ResumableSub_Fx_RowTraerUsuario extends BA.ResumableSub {
public ResumableSub_Fx_RowTraerUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,RemoteObject __ref,RemoteObject _kofu) {
this.parent = parent;
this.__ref = __ref;
this._kofu = _kofu;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
RemoteObject _kofu;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_RowTraerUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,128);
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
Debug.locals.put("Kofu", _kofu);
 BA.debugLineNum = 130;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(2);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 131;BA.debugLine="Dim Consulta_Sql As String = \"Select Top 1 * From";
Debug.ShouldStop(4);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From TABFU Where KOFU = '"),_kofu,RemoteObject.createImmutable("'"));__ref.setField("_consulta_sql",parent._consulta_sql);
 BA.debugLineNum = 133;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(16);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 134;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_rowtraerusuario"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 136;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 138;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(512);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 140;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 141;BA.debugLine="Row = Funciones.Fx_DataRow(Js.GetString)";
Debug.ShouldStop(4096);
_row = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Row", _row);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 143;BA.debugLine="Error = \"El usuario \" & Kofu & \" no existe\"";
Debug.ShouldStop(16384);
__ref.setField ("_error" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("El usuario "),_kofu,RemoteObject.createImmutable(" no existe")));
 BA.debugLineNum = 144;BA.debugLine="Return Null";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
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
 BA.debugLineNum = 149;BA.debugLine="Return Row";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_row));return;};
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _fx_validarpermisousuario(RemoteObject __ref,RemoteObject _codpermiso) throws Exception{
try {
		Debug.PushSubsStack("Fx_ValidarPermisoUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("fx_validarpermisousuario")) { return __ref.runUserSub(false, "cl_permisoxui","fx_validarpermisousuario", __ref, _codpermiso);}
ResumableSub_Fx_ValidarPermisoUsuario rsub = new ResumableSub_Fx_ValidarPermisoUsuario(null,__ref,_codpermiso);
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
public static class ResumableSub_Fx_ValidarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Fx_ValidarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,RemoteObject __ref,RemoteObject _codpermiso) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
RemoteObject _codpermiso;
RemoteObject _rowpermiso = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result2 = RemoteObject.createImmutable(false);
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _descripcionpermiso = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rst = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_ValidarPermisoUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,54);
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
Debug.locals.put("CodPermiso", _codpermiso);
 BA.debugLineNum = 56;BA.debugLine="Error = \"\"";
Debug.ShouldStop(8388608);
__ref.setField ("_error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 57;BA.debugLine="Aceptado = False";
Debug.ShouldStop(16777216);
__ref.setField ("_aceptado" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="Cancelado = False";
Debug.ShouldStop(33554432);
__ref.setField ("_cancelado" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(134217728);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png"))));
 BA.debugLineNum = 62;BA.debugLine="Wait For(Sb_Traer_Nombre_Permiso(CodPermiso)) Com";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_traer_nombre_permiso" /*RemoteObject*/ ,(Object)(_codpermiso)));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_rowpermiso = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("RowPermiso", _rowpermiso);
;
 BA.debugLineNum = 64;BA.debugLine="If Not(RowPermiso.IsInitialized) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_rowpermiso.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 65;BA.debugLine="Error = \"No existe el permiso [\" & CodPermiso &";
Debug.ShouldStop(1);
__ref.setField ("_error" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("No existe el permiso ["),_codpermiso,RemoteObject.createImmutable("] en la base de datos")));
 BA.debugLineNum = 66;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 69;BA.debugLine="Wait For(TienePermiso(CodPermiso,Variables.Global";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_tienepermiso" /*RemoteObject*/ ,(Object)(_codpermiso),(Object)(BA.ObjectToString(parent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))))));
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result2", _result2);
;
 BA.debugLineNum = 70;BA.debugLine="If Result2 Then";
Debug.ShouldStop(32);
if (true) break;

case 5:
//if
this.state = 8;
if (_result2.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 71;BA.debugLine="RowUsuarioAutoriza = Variables.Global_Row_Usuari";
Debug.ShouldStop(64);
__ref.setField ("_rowusuarioautoriza" /*RemoteObject*/ ,parent._variables._global_row_usuario_activo /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(128);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png"))));
 BA.debugLineNum = 73;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 76;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(2048);
parent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",parent._xui);
 BA.debugLineNum = 77;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(4096);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 79;BA.debugLine="dialog.Initialize (mBase)";
Debug.ShouldStop(16384);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 82;BA.debugLine="p.SetLayoutAnimated(0, 0,0, 320dip, 250dip)";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 83;BA.debugLine="p.LoadLayout(\"Cp_ValidarPermisoUsuario\")";
Debug.ShouldStop(262144);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Cp_ValidarPermisoUsuario")),__ref.getField(false, "ba"));
 BA.debugLineNum = 85;BA.debugLine="Dim DescripcionPermiso As String = RowPermiso.Get";
Debug.ShouldStop(1048576);
_descripcionpermiso = BA.ObjectToString(_rowpermiso.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DescripcionPermiso")))));Debug.locals.put("DescripcionPermiso", _descripcionpermiso);Debug.locals.put("DescripcionPermiso", _descripcionpermiso);
 BA.debugLineNum = 86;BA.debugLine="Lbl_Codigo.Text = \"CODIGO: \" & CodPermiso.Trim";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lbl_codigo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("CODIGO: "),_codpermiso.runMethod(true,"trim"))));
 BA.debugLineNum = 87;BA.debugLine="Lbl_DescripcionPermiso.Text =DescripcionPermiso.T";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lbl_descripcionpermiso" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_descripcionpermiso.runMethod(true,"trim")));
 BA.debugLineNum = 89;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
Debug.ShouldStop(16777216);
_dialog.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="Wait For (dialog.ShowCustom(p, \"ACEPTAR\", \"\", \"CA";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_validarpermisousuario"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("ACEPTAR"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCELAR")))));
this.state = 25;
return;
case 25:
//C
this.state = 9;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 91;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
if (true) break;

case 9:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 11;
}else {
this.state = 21;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 93;BA.debugLine="Aceptado = True";
Debug.ShouldStop(268435456);
__ref.setField ("_aceptado" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="Dim Clave As String = Txt_Clave.Text";
Debug.ShouldStop(536870912);
_clave = __ref.getField(false,"_txt_clave" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("Clave", _clave);Debug.locals.put("Clave", _clave);
 BA.debugLineNum = 96;BA.debugLine="Wait For(Sb_RevisarPermisoUsuario(CodPermiso,Cla";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_revisarpermisousuario" /*RemoteObject*/ ,(Object)(_codpermiso),(Object)(_clave)));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_row = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Row", _row);
;
 BA.debugLineNum = 98;BA.debugLine="If Row = Null Then";
Debug.ShouldStop(2);
if (true) break;

case 12:
//if
this.state = 19;
if (RemoteObject.solveBoolean("n",_row)) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 100;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 101;BA.debugLine="Msgbox2Async(Error , \"Validación\", \"Ok\", \"\", \"\"";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(__ref.getField(true,"_error" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 102;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_validarpermisousuario"), null);
this.state = 27;
return;
case 27:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 104;BA.debugLine="Wait For(Fx_ValidarPermisoUsuario(CodPermiso))";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_fx_validarpermisousuario" /*RemoteObject*/ ,(Object)(_codpermiso)));
this.state = 28;
return;
case 28:
//C
this.state = 15;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 105;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(256);
if (true) break;

case 15:
//if
this.state = 18;
if (parent.__c.runMethod(true,"Not",(Object)(_rst)).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 106;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 111;BA.debugLine="RowUsuarioAutoriza = Row";
Debug.ShouldStop(16384);
__ref.setField ("_rowusuarioautoriza" /*RemoteObject*/ ,_row);
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 115;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 116;BA.debugLine="Cancelado = True";
Debug.ShouldStop(524288);
__ref.setField ("_cancelado" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="Error = \"Accion cancelada, no se ingresa ninguna";
Debug.ShouldStop(1048576);
__ref.setField ("_error" /*RemoteObject*/ ,BA.ObjectToString("Accion cancelada, no se ingresa ninguna clave"));
 BA.debugLineNum = 118;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 122;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 123;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(67108864);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png"))));
 BA.debugLineNum = 124;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
public static void  _complete(RemoteObject __ref,RemoteObject _rowpermiso) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cl_permisoxui","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(4194304);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(8388608);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
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
public static RemoteObject  _sb_revisarpermisousuario(RemoteObject __ref,RemoteObject _codpermiso,RemoteObject _vclave) throws Exception{
try {
		Debug.PushSubsStack("Sb_RevisarPermisoUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("sb_revisarpermisousuario")) { return __ref.runUserSub(false, "cl_permisoxui","sb_revisarpermisousuario", __ref, _codpermiso, _vclave);}
ResumableSub_Sb_RevisarPermisoUsuario rsub = new ResumableSub_Sb_RevisarPermisoUsuario(null,__ref,_codpermiso,_vclave);
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
public static class ResumableSub_Sb_RevisarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Sb_RevisarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,RemoteObject __ref,RemoteObject _codpermiso,RemoteObject _vclave) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this._vclave = _vclave;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
RemoteObject _codpermiso;
RemoteObject _vclave;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _result2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_RevisarPermisoUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,153);
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
Debug.locals.put("CodPermiso", _codpermiso);
Debug.locals.put("vClave", _vclave);
 BA.debugLineNum = 155;BA.debugLine="Dim Row As Map";
Debug.ShouldStop(67108864);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Row", _row);
 BA.debugLineNum = 156;BA.debugLine="vClave = Funciones.Fx_TraeClaveRD(vClave)";
Debug.ShouldStop(134217728);
_vclave = parent._funciones.runMethod(true,"_fx_traeclaverd" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_vclave));Debug.locals.put("vClave", _vclave);
 BA.debugLineNum = 158;BA.debugLine="If vClave.Trim = \"\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_vclave.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 160;BA.debugLine="Error = \"La clave no puede estar vacia\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_error" /*RemoteObject*/ ,BA.ObjectToString("La clave no puede estar vacia"));
 BA.debugLineNum = 161;BA.debugLine="Return Null";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 164;BA.debugLine="Dim Consulta_Sql As String = \"Select Top 1 * From";
Debug.ShouldStop(8);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From TABFU Where PWFU = '"),_vclave,RemoteObject.createImmutable("'"));__ref.setField("_consulta_sql",parent._consulta_sql);
 BA.debugLineNum = 165;BA.debugLine="Log(vClave)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","65505036",_vclave,0);
 BA.debugLineNum = 167;BA.debugLine="ProgressDialogShow(\"Revisando permiso\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Revisando permiso"))));
 BA.debugLineNum = 169;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(256);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 170;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "sb_revisarpermisousuario"), (_js));
this.state = 19;
return;
case 19:
//C
this.state = 5;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 172;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 18;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 174;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8192);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 176;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(32768);
if (true) break;

case 8:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 178;BA.debugLine="Row = Funciones.Fx_DataRow(Js.GetString)";
Debug.ShouldStop(131072);
_row = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Row", _row);
 BA.debugLineNum = 180;BA.debugLine="Wait For(TienePermiso(CodPermiso,Row.Get(\"KOFU\"";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "sb_revisarpermisousuario"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_tienepermiso" /*RemoteObject*/ ,(Object)(_codpermiso),(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))))));
this.state = 20;
return;
case 20:
//C
this.state = 11;
_result2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result2", _result2);
;
 BA.debugLineNum = 182;BA.debugLine="If Not(Result2) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 11:
//if
this.state = 14;
if (parent.__c.runMethod(true,"Not",(Object)(_result2)).<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 183;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 184;BA.debugLine="Return Null";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 188;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 189;BA.debugLine="Error = \"Clave invalida\"";
Debug.ShouldStop(268435456);
__ref.setField ("_error" /*RemoteObject*/ ,BA.ObjectToString("Clave invalida"));
 BA.debugLineNum = 190;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
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
 BA.debugLineNum = 195;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 196;BA.debugLine="Return Row";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_row));return;};
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _sb_traer_nombre_permiso(RemoteObject __ref,RemoteObject _codpermiso) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Nombre_Permiso (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("sb_traer_nombre_permiso")) { return __ref.runUserSub(false, "cl_permisoxui","sb_traer_nombre_permiso", __ref, _codpermiso);}
ResumableSub_Sb_Traer_Nombre_Permiso rsub = new ResumableSub_Sb_Traer_Nombre_Permiso(null,__ref,_codpermiso);
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
public static class ResumableSub_Sb_Traer_Nombre_Permiso extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Nombre_Permiso(BaKapp.Movil.Tag.cl_permisoxui parent,RemoteObject __ref,RemoteObject _codpermiso) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
RemoteObject _codpermiso;
RemoteObject _rowpermiso = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Nombre_Permiso (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,236);
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
Debug.locals.put("CodPermiso", _codpermiso);
 BA.debugLineNum = 238;BA.debugLine="Dim RowPermiso As Map";
Debug.ShouldStop(8192);
_rowpermiso = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("RowPermiso", _rowpermiso);
 BA.debugLineNum = 239;BA.debugLine="ProgressDialogShow(\"Revisando permiso...\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Revisando permiso..."))));
 BA.debugLineNum = 241;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
Debug.ShouldStop(65536);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("ZW_Permisos Where CodPermiso = '"),_codpermiso,RemoteObject.createImmutable("'")));
 BA.debugLineNum = 243;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(262144);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 244;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "sb_traer_nombre_permiso"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 246;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 248;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8388608);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 250;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 251;BA.debugLine="RowPermiso = Funciones.Fx_DataRow(Js.GetString)";
Debug.ShouldStop(67108864);
_rowpermiso = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("RowPermiso", _rowpermiso);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 253;BA.debugLine="RowPermiso = Null";
Debug.ShouldStop(268435456);
_rowpermiso = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));Debug.locals.put("RowPermiso", _rowpermiso);
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
 BA.debugLineNum = 258;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 259;BA.debugLine="Return RowPermiso";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_rowpermiso));return;};
 BA.debugLineNum = 261;BA.debugLine="End Sub";
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
public static RemoteObject  _sb_validarpermisousuario(RemoteObject __ref,RemoteObject _codpermiso) throws Exception{
try {
		Debug.PushSubsStack("Sb_ValidarPermisoUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("sb_validarpermisousuario")) { return __ref.runUserSub(false, "cl_permisoxui","sb_validarpermisousuario", __ref, _codpermiso);}
ResumableSub_Sb_ValidarPermisoUsuario rsub = new ResumableSub_Sb_ValidarPermisoUsuario(null,__ref,_codpermiso);
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
public static class ResumableSub_Sb_ValidarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Sb_ValidarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,RemoteObject __ref,RemoteObject _codpermiso) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
RemoteObject _codpermiso;
RemoteObject _rst = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_ValidarPermisoUsuario (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,39);
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
Debug.locals.put("CodPermiso", _codpermiso);
 BA.debugLineNum = 41;BA.debugLine="Wait For(Fx_ValidarPermisoUsuario(CodPermiso)) Co";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "sb_validarpermisousuario"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_fx_validarpermisousuario" /*RemoteObject*/ ,(Object)(_codpermiso)));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 43;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(_rst)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 44;BA.debugLine="If Not(Cancelado) Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_cancelado" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 45;BA.debugLine="Msgbox2Async(Error , \"Validación\", \"Ok\", \"\", \"\"";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(__ref.getField(true,"_error" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 47;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 50;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
public static RemoteObject  _tienepermiso(RemoteObject __ref,RemoteObject _codpermiso,RemoteObject _codusuario) throws Exception{
try {
		Debug.PushSubsStack("TienePermiso (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("tienepermiso")) { return __ref.runUserSub(false, "cl_permisoxui","tienepermiso", __ref, _codpermiso, _codusuario);}
ResumableSub_TienePermiso rsub = new ResumableSub_TienePermiso(null,__ref,_codpermiso,_codusuario);
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
public static class ResumableSub_TienePermiso extends BA.ResumableSub {
public ResumableSub_TienePermiso(BaKapp.Movil.Tag.cl_permisoxui parent,RemoteObject __ref,RemoteObject _codpermiso,RemoteObject _codusuario) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this._codusuario = _codusuario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
RemoteObject _codpermiso;
RemoteObject _codusuario;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nokofu = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TienePermiso (cl_permisoxui) ","cl_permisoxui",5,__ref.getField(false, "ba"),__ref,200);
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
Debug.locals.put("CodPermiso", _codpermiso);
Debug.locals.put("CodUsuario", _codusuario);
 BA.debugLineNum = 202;BA.debugLine="ProgressDialogShow(\"Revisando permiso...\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Revisando permiso..."))));
 BA.debugLineNum = 203;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
Debug.ShouldStop(1024);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("ZW_PermisosVsUsuarios Where CodUsuario = '"),_codusuario,RemoteObject.createImmutable("' And CodPermiso = '"),_codpermiso,RemoteObject.createImmutable("'")));
 BA.debugLineNum = 205;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(4096);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 206;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "tienepermiso"), (_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 208;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 210;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(131072);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 211;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 213;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 214;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 217;BA.debugLine="Wait For(Fx_RowTraerUsuario(CodUsuario)) Comple";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_permisoxui", "tienepermiso"), __ref.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_fx_rowtraerusuario" /*RemoteObject*/ ,(Object)(_codusuario)));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_rs = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Rs", _rs);
;
 BA.debugLineNum = 219;BA.debugLine="If Rs = Null Then";
Debug.ShouldStop(67108864);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("n",_rs)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 220;BA.debugLine="Error = \"El usuario [\" & CodUsuario & \"] no ex";
Debug.ShouldStop(134217728);
__ref.setField ("_error" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("El usuario ["),_codusuario,RemoteObject.createImmutable("] no exite")));
 BA.debugLineNum = 221;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 223;BA.debugLine="Dim Nokofu As String = Rs.Get(\"NOKOFU\")";
Debug.ShouldStop(1073741824);
_nokofu = BA.ObjectToString(_rs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOFU")))));Debug.locals.put("Nokofu", _nokofu);Debug.locals.put("Nokofu", _nokofu);
 BA.debugLineNum = 224;BA.debugLine="Error = \"El usuario [\" & CodUsuario & \"]-\" & No";
Debug.ShouldStop(-2147483648);
__ref.setField ("_error" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("El usuario ["),_codusuario,RemoteObject.createImmutable("]-"),_nokofu.runMethod(true,"trim"),RemoteObject.createImmutable(" no tiene clave apara realizar esta acción")));
 BA.debugLineNum = 225;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
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
 BA.debugLineNum = 231;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 232;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 234;BA.debugLine="End Sub";
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
}