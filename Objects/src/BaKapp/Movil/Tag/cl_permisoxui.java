package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cl_permisoxui extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.cl_permisoxui");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.cl_permisoxui.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txt_clave = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_descripcionpermiso = null;
public boolean _permisoaceptado = false;
public String _consulta_sql = "";
public String _error = "";
public anywheresoftware.b4a.objects.collections.Map _rowusuarioautoriza = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_codigo = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public boolean _aceptado = false;
public boolean _cancelado = false;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Private Txt_Clave As B4XView";
_txt_clave = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private Lbl_DescripcionPermiso As B4XView";
_lbl_descripcionpermiso = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public PermisoAceptado As Boolean";
_permisoaceptado = false;
 //BA.debugLineNum = 13;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 14;BA.debugLine="Public Error As String";
_error = "";
 //BA.debugLineNum = 15;BA.debugLine="Public RowUsuarioAutoriza As Map";
_rowusuarioautoriza = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private Lbl_Codigo As B4XView";
_lbl_codigo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public Aceptado As Boolean";
_aceptado = false;
 //BA.debugLineNum = 19;BA.debugLine="Public Cancelado As Boolean";
_cancelado = false;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 29;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 30;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 31;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_rowtraerusuario(String _kofu) throws Exception{
ResumableSub_Fx_RowTraerUsuario rsub = new ResumableSub_Fx_RowTraerUsuario(this,_kofu);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_RowTraerUsuario extends BA.ResumableSub {
public ResumableSub_Fx_RowTraerUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,String _kofu) {
this.parent = parent;
this._kofu = _kofu;
}
BaKapp.Movil.Tag.cl_permisoxui parent;
String _kofu;
anywheresoftware.b4a.objects.collections.Map _row = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 130;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 131;BA.debugLine="Dim Consulta_Sql As String = \"Select Top 1 * From";
parent._consulta_sql = "Select Top 1 * From TABFU Where KOFU = '"+_kofu+"'";
 //BA.debugLineNum = 133;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,parent._consulta_sql,parent);
 //BA.debugLineNum = 134;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 136;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 138;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 140;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 141;BA.debugLine="Row = Funciones.Fx_DataRow(Js.GetString)";
_row = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ ());
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 143;BA.debugLine="Error = \"El usuario \" & Kofu & \" no existe\"";
parent._error = "El usuario "+_kofu+" no existe";
 //BA.debugLineNum = 144;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
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
 //BA.debugLineNum = 149;BA.debugLine="Return Row";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_row));return;};
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_validarpermisousuario(String _codpermiso) throws Exception{
ResumableSub_Fx_ValidarPermisoUsuario rsub = new ResumableSub_Fx_ValidarPermisoUsuario(this,_codpermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_ValidarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Fx_ValidarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,String _codpermiso) {
this.parent = parent;
this._codpermiso = _codpermiso;
}
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
anywheresoftware.b4a.objects.collections.Map _rowpermiso = null;
boolean _result2 = false;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _descripcionpermiso = "";
int _result = 0;
String _clave = "";
anywheresoftware.b4a.objects.collections.Map _row = null;
boolean _rst = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 56;BA.debugLine="Error = \"\"";
parent._error = "";
 //BA.debugLineNum = 57;BA.debugLine="Aceptado = False";
parent._aceptado = parent.__c.False;
 //BA.debugLineNum = 58;BA.debugLine="Cancelado = False";
parent._cancelado = parent.__c.False;
 //BA.debugLineNum = 60;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 62;BA.debugLine="Wait For(Sb_Traer_Nombre_Permiso(CodPermiso)) Com";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_nombre_permiso(_codpermiso));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_rowpermiso = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="If Not(RowPermiso.IsInitialized) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_rowpermiso.IsInitialized())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 65;BA.debugLine="Error = \"No existe el permiso [\" & CodPermiso &";
parent._error = "No existe el permiso ["+_codpermiso+"] en la base de datos";
 //BA.debugLineNum = 66;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 69;BA.debugLine="Wait For(TienePermiso(CodPermiso,Variables.Global";
parent.__c.WaitFor("complete", ba, this, parent._tienepermiso(_codpermiso,BA.ObjectToString(parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))));
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result2 = (Boolean) result[0];
;
 //BA.debugLineNum = 70;BA.debugLine="If Result2 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result2) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 71;BA.debugLine="RowUsuarioAutoriza = Variables.Global_Row_Usuari";
parent._rowusuarioautoriza = parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 72;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 73;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 76;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 77;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 79;BA.debugLine="dialog.Initialize (mBase)";
_dialog._initialize /*String*/ (ba,parent._mbase);
 //BA.debugLineNum = 81;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 82;BA.debugLine="p.SetLayoutAnimated(0, 0,0, 320dip, 250dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.__c.DipToCurrent((int) (320)),parent.__c.DipToCurrent((int) (250)));
 //BA.debugLineNum = 83;BA.debugLine="p.LoadLayout(\"Cp_ValidarPermisoUsuario\")";
_p.LoadLayout("Cp_ValidarPermisoUsuario",ba);
 //BA.debugLineNum = 85;BA.debugLine="Dim DescripcionPermiso As String = RowPermiso.Get";
_descripcionpermiso = BA.ObjectToString(_rowpermiso.Get((Object)("DescripcionPermiso")));
 //BA.debugLineNum = 86;BA.debugLine="Lbl_Codigo.Text = \"CODIGO: \" & CodPermiso.Trim";
parent._lbl_codigo.setText(BA.ObjectToCharSequence("CODIGO: "+_codpermiso.trim()));
 //BA.debugLineNum = 87;BA.debugLine="Lbl_DescripcionPermiso.Text =DescripcionPermiso.T";
parent._lbl_descripcionpermiso.setText(BA.ObjectToCharSequence(_descripcionpermiso.trim()));
 //BA.debugLineNum = 89;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
_dialog._putattop /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 90;BA.debugLine="Wait For (dialog.ShowCustom(p, \"ACEPTAR\", \"\", \"CA";
parent.__c.WaitFor("complete", ba, this, _dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("ACEPTAR"),(Object)(""),(Object)("CANCELAR")));
this.state = 25;
return;
case 25:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 91;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 9:
//if
this.state = 22;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 11;
}else {
this.state = 21;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 93;BA.debugLine="Aceptado = True";
parent._aceptado = parent.__c.True;
 //BA.debugLineNum = 94;BA.debugLine="Dim Clave As String = Txt_Clave.Text";
_clave = parent._txt_clave.getText();
 //BA.debugLineNum = 96;BA.debugLine="Wait For(Sb_RevisarPermisoUsuario(CodPermiso,Cla";
parent.__c.WaitFor("complete", ba, this, parent._sb_revisarpermisousuario(_codpermiso,_clave));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_row = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 98;BA.debugLine="If Row = Null Then";
if (true) break;

case 12:
//if
this.state = 19;
if (_row== null) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 100;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 101;BA.debugLine="Msgbox2Async(Error , \"Validación\", \"Ok\", \"\", \"\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(parent._error),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 102;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 27;
return;
case 27:
//C
this.state = 15;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 104;BA.debugLine="Wait For(Fx_ValidarPermisoUsuario(CodPermiso))";
parent.__c.WaitFor("complete", ba, this, parent._fx_validarpermisousuario(_codpermiso));
this.state = 28;
return;
case 28:
//C
this.state = 15;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 105;BA.debugLine="If Not(Rst) Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent.__c.Not(_rst)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 106;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
 //BA.debugLineNum = 111;BA.debugLine="RowUsuarioAutoriza = Row";
parent._rowusuarioautoriza = _row;
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 115;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 116;BA.debugLine="Cancelado = True";
parent._cancelado = parent.__c.True;
 //BA.debugLineNum = 117;BA.debugLine="Error = \"Accion cancelada, no se ingresa ninguna";
parent._error = "Accion cancelada, no se ingresa ninguna clave";
 //BA.debugLineNum = 118;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 122;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 123;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 124;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4a.objects.collections.Map _rowpermiso) throws Exception{
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisarpermisousuario(String _codpermiso,String _vclave) throws Exception{
ResumableSub_Sb_RevisarPermisoUsuario rsub = new ResumableSub_Sb_RevisarPermisoUsuario(this,_codpermiso,_vclave);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_RevisarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Sb_RevisarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,String _codpermiso,String _vclave) {
this.parent = parent;
this._codpermiso = _codpermiso;
this._vclave = _vclave;
}
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
String _vclave;
anywheresoftware.b4a.objects.collections.Map _row = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
boolean _result2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 155;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 156;BA.debugLine="vClave = Funciones.Fx_TraeClaveRD(vClave)";
_vclave = parent._funciones._fx_traeclaverd /*String*/ (ba,_vclave);
 //BA.debugLineNum = 158;BA.debugLine="If vClave.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_vclave.trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 160;BA.debugLine="Error = \"La clave no puede estar vacia\"";
parent._error = "La clave no puede estar vacia";
 //BA.debugLineNum = 161;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 164;BA.debugLine="Dim Consulta_Sql As String = \"Select Top 1 * From";
parent._consulta_sql = "Select Top 1 * From TABFU Where PWFU = '"+_vclave+"'";
 //BA.debugLineNum = 165;BA.debugLine="Log(vClave)";
parent.__c.LogImpl("22293772",_vclave,0);
 //BA.debugLineNum = 167;BA.debugLine="ProgressDialogShow(\"Revisando permiso\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Revisando permiso"));
 //BA.debugLineNum = 169;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,parent._consulta_sql,parent);
 //BA.debugLineNum = 170;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 172;BA.debugLine="If Js.Success Then";
if (true) break;

case 5:
//if
this.state = 18;
if (_js._success /*boolean*/ ) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 174;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 176;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 8:
//if
this.state = 17;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 178;BA.debugLine="Row = Funciones.Fx_DataRow(Js.GetString)";
_row = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ ());
 //BA.debugLineNum = 180;BA.debugLine="Wait For(TienePermiso(CodPermiso,Row.Get(\"KOFU\"";
parent.__c.WaitFor("complete", ba, this, parent._tienepermiso(_codpermiso,BA.ObjectToString(_row.Get((Object)("KOFU")))));
this.state = 20;
return;
case 20:
//C
this.state = 11;
_result2 = (Boolean) result[0];
;
 //BA.debugLineNum = 182;BA.debugLine="If Not(Result2) Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent.__c.Not(_result2)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 183;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 184;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 188;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 189;BA.debugLine="Error = \"Clave invalida\"";
parent._error = "Clave invalida";
 //BA.debugLineNum = 190;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
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
 //BA.debugLineNum = 195;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 196;BA.debugLine="Return Row";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_row));return;};
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_nombre_permiso(String _codpermiso) throws Exception{
ResumableSub_Sb_Traer_Nombre_Permiso rsub = new ResumableSub_Sb_Traer_Nombre_Permiso(this,_codpermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Nombre_Permiso extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Nombre_Permiso(BaKapp.Movil.Tag.cl_permisoxui parent,String _codpermiso) {
this.parent = parent;
this._codpermiso = _codpermiso;
}
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
anywheresoftware.b4a.objects.collections.Map _rowpermiso = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 238;BA.debugLine="Dim RowPermiso As Map";
_rowpermiso = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 239;BA.debugLine="ProgressDialogShow(\"Revisando permiso...\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Revisando permiso..."));
 //BA.debugLineNum = 241;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
parent._consulta_sql = "Select Top 1 * From "+parent._variables._global_basebk /*String*/ +"ZW_Permisos Where CodPermiso = '"+_codpermiso+"'";
 //BA.debugLineNum = 243;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,parent._consulta_sql,parent);
 //BA.debugLineNum = 244;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 246;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 248;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 250;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 251;BA.debugLine="RowPermiso = Funciones.Fx_DataRow(Js.GetString)";
_rowpermiso = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ ());
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 253;BA.debugLine="RowPermiso = Null";
_rowpermiso = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
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
 //BA.debugLineNum = 258;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 259;BA.debugLine="Return RowPermiso";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rowpermiso));return;};
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_validarpermisousuario(String _codpermiso) throws Exception{
ResumableSub_Sb_ValidarPermisoUsuario rsub = new ResumableSub_Sb_ValidarPermisoUsuario(this,_codpermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_ValidarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Sb_ValidarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,String _codpermiso) {
this.parent = parent;
this._codpermiso = _codpermiso;
}
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
boolean _rst = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 41;BA.debugLine="Wait For(Fx_ValidarPermisoUsuario(CodPermiso)) Co";
parent.__c.WaitFor("complete", ba, this, parent._fx_validarpermisousuario(_codpermiso));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 43;BA.debugLine="If Not(Rst) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.__c.Not(_rst)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 44;BA.debugLine="If Not(Cancelado) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.Not(parent._cancelado)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 45;BA.debugLine="Msgbox2Async(Error , \"Validación\", \"Ok\", \"\", \"\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(parent._error),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 47;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 50;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tienepermiso(String _codpermiso,String _codusuario) throws Exception{
ResumableSub_TienePermiso rsub = new ResumableSub_TienePermiso(this,_codpermiso,_codusuario);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TienePermiso extends BA.ResumableSub {
public ResumableSub_TienePermiso(BaKapp.Movil.Tag.cl_permisoxui parent,String _codpermiso,String _codusuario) {
this.parent = parent;
this._codpermiso = _codpermiso;
this._codusuario = _codusuario;
}
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
String _codusuario;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _rs = null;
String _nokofu = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 202;BA.debugLine="ProgressDialogShow(\"Revisando permiso...\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Revisando permiso..."));
 //BA.debugLineNum = 203;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
parent._consulta_sql = "Select Top 1 * From "+parent._variables._global_basebk /*String*/ +"ZW_PermisosVsUsuarios Where CodUsuario = '"+_codusuario+"' And CodPermiso = '"+_codpermiso+"'";
 //BA.debugLineNum = 205;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,parent._consulta_sql,parent);
 //BA.debugLineNum = 206;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 208;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 210;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 211;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 213;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 214;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 217;BA.debugLine="Wait For(Fx_RowTraerUsuario(CodUsuario)) Comple";
parent.__c.WaitFor("complete", ba, this, parent._fx_rowtraerusuario(_codusuario));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_rs = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 219;BA.debugLine="If Rs = Null Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_rs== null) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 220;BA.debugLine="Error = \"El usuario [\" & CodUsuario & \"] no ex";
parent._error = "El usuario ["+_codusuario+"] no exite";
 //BA.debugLineNum = 221;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 223;BA.debugLine="Dim Nokofu As String = Rs.Get(\"NOKOFU\")";
_nokofu = BA.ObjectToString(_rs.Get((Object)("NOKOFU")));
 //BA.debugLineNum = 224;BA.debugLine="Error = \"El usuario [\" & CodUsuario & \"]-\" & No";
parent._error = "El usuario ["+_codusuario+"]-"+_nokofu.trim()+" no tiene clave apara realizar esta acción";
 //BA.debugLineNum = 225;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
 //BA.debugLineNum = 231;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 232;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
