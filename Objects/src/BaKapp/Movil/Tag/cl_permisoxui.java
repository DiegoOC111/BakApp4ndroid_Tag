package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cl_permisoxui extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "BaKapp.Movil.Tag.cl_permisoxui");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
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
public String  _base_resize(BaKapp.Movil.Tag.cl_permisoxui __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(BaKapp.Movil.Tag.cl_permisoxui __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_permisoxui";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Private Txt_Clave As B4XView";
_txt_clave = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Private Lbl_DescripcionPermiso As B4XView";
_lbl_descripcionpermiso = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Public PermisoAceptado As Boolean";
_permisoaceptado = false;
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="Public Error As String";
_error = "";
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="Public RowUsuarioAutoriza As Map";
_rowusuarioautoriza = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="Private Lbl_Codigo As B4XView";
_lbl_codigo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="Public bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="Public Aceptado As Boolean";
_aceptado = false;
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="Public Cancelado As Boolean";
_cancelado = false;
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(BaKapp.Movil.Tag.cl_permisoxui __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_rowtraerusuario(BaKapp.Movil.Tag.cl_permisoxui __ref,String _kofu) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "fx_rowtraerusuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_rowtraerusuario", new Object[] {_kofu}));}
ResumableSub_Fx_RowTraerUsuario rsub = new ResumableSub_Fx_RowTraerUsuario(this,__ref,_kofu);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_RowTraerUsuario extends BA.ResumableSub {
public ResumableSub_Fx_RowTraerUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,BaKapp.Movil.Tag.cl_permisoxui __ref,String _kofu) {
this.parent = parent;
this.__ref = __ref;
this._kofu = _kofu;
this.__ref = parent;
}
BaKapp.Movil.Tag.cl_permisoxui __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
String _kofu;
anywheresoftware.b4a.objects.collections.Map _row = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Dim Consulta_Sql As String = \"Select Top 1 * From";
parent._consulta_sql = "Select Top 1 * From TABFU Where KOFU = '"+_kofu+"'";
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_rowtraerusuario"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="Row = Funciones.Fx_DataRow(Js.GetString)";
_row = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ (null));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="Error = \"El usuario \" & Kofu & \" no existe\"";
__ref._error /*String*/  = "El usuario "+_kofu+" no existe";
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="Return Null";
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
RDebugUtils.currentLine=5439509;
 //BA.debugLineNum = 5439509;BA.debugLine="Return Row";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_row));return;};
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_validarpermisousuario(BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "fx_validarpermisousuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_validarpermisousuario", new Object[] {_codpermiso}));}
ResumableSub_Fx_ValidarPermisoUsuario rsub = new ResumableSub_Fx_ValidarPermisoUsuario(this,__ref,_codpermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_ValidarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Fx_ValidarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this.__ref = parent;
}
BaKapp.Movil.Tag.cl_permisoxui __ref;
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
RDebugUtils.currentModule="cl_permisoxui";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Error = \"\"";
__ref._error /*String*/  = "";
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Aceptado = False";
__ref._aceptado /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Cancelado = False";
__ref._cancelado /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Wait For(Sb_Traer_Nombre_Permiso(CodPermiso)) Com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref._sb_traer_nombre_permiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codpermiso));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_rowpermiso = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="If Not(RowPermiso.IsInitialized) Then";
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
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="Error = \"No existe el permiso [\" & CodPermiso &";
__ref._error /*String*/  = "No existe el permiso ["+_codpermiso+"] en la base de datos";
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Wait For(TienePermiso(CodPermiso,Variables.Global";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref._tienepermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codpermiso,BA.ObjectToString(parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))));
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result2 = (Boolean) result[1];
;
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="If Result2 Then";
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
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="RowUsuarioAutoriza = Variables.Global_Row_Usuari";
__ref._rowusuarioautoriza /*anywheresoftware.b4a.objects.collections.Map*/  = parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=5373974;
 //BA.debugLineNum = 5373974;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="dialog.Initialize (mBase)";
_dialog._initialize /*String*/ (null,ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=5373979;
 //BA.debugLineNum = 5373979;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=5373980;
 //BA.debugLineNum = 5373980;BA.debugLine="p.SetLayoutAnimated(0, 0,0, 320dip, 250dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.__c.DipToCurrent((int) (320)),parent.__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=5373981;
 //BA.debugLineNum = 5373981;BA.debugLine="p.LoadLayout(\"Cp_ValidarPermisoUsuario\")";
_p.LoadLayout("Cp_ValidarPermisoUsuario",ba);
RDebugUtils.currentLine=5373983;
 //BA.debugLineNum = 5373983;BA.debugLine="Dim DescripcionPermiso As String = RowPermiso.Get";
_descripcionpermiso = BA.ObjectToString(_rowpermiso.Get((Object)("DescripcionPermiso")));
RDebugUtils.currentLine=5373984;
 //BA.debugLineNum = 5373984;BA.debugLine="Lbl_Codigo.Text = \"CODIGO: \" & CodPermiso.Trim";
__ref._lbl_codigo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("CODIGO: "+_codpermiso.trim()));
RDebugUtils.currentLine=5373985;
 //BA.debugLineNum = 5373985;BA.debugLine="Lbl_DescripcionPermiso.Text =DescripcionPermiso.T";
__ref._lbl_descripcionpermiso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_descripcionpermiso.trim()));
RDebugUtils.currentLine=5373987;
 //BA.debugLineNum = 5373987;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
_dialog._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=5373988;
 //BA.debugLineNum = 5373988;BA.debugLine="Wait For (dialog.ShowCustom(p, \"ACEPTAR\", \"\", \"CA";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_validarpermisousuario"), _dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("ACEPTAR"),(Object)(""),(Object)("CANCELAR")));
this.state = 25;
return;
case 25:
//C
this.state = 9;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5373989;
 //BA.debugLineNum = 5373989;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 9:
//if
this.state = 22;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 11;
}else {
this.state = 21;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=5373991;
 //BA.debugLineNum = 5373991;BA.debugLine="Aceptado = True";
__ref._aceptado /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=5373992;
 //BA.debugLineNum = 5373992;BA.debugLine="Dim Clave As String = Txt_Clave.Text";
_clave = __ref._txt_clave /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=5373994;
 //BA.debugLineNum = 5373994;BA.debugLine="Wait For(Sb_RevisarPermisoUsuario(CodPermiso,Cla";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref._sb_revisarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codpermiso,_clave));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_row = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5373996;
 //BA.debugLineNum = 5373996;BA.debugLine="If Row = Null Then";
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
RDebugUtils.currentLine=5373998;
 //BA.debugLineNum = 5373998;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5373999;
 //BA.debugLineNum = 5373999;BA.debugLine="Msgbox2Async(Error , \"Validación\", \"Ok\", \"\", \"\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._error /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5374000;
 //BA.debugLineNum = 5374000;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_validarpermisousuario"), null);
this.state = 27;
return;
case 27:
//C
this.state = 15;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5374002;
 //BA.debugLineNum = 5374002;BA.debugLine="Wait For(Fx_ValidarPermisoUsuario(CodPermiso))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "fx_validarpermisousuario"), __ref._fx_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codpermiso));
this.state = 28;
return;
case 28:
//C
this.state = 15;
_rst = (Boolean) result[1];
;
RDebugUtils.currentLine=5374003;
 //BA.debugLineNum = 5374003;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=5374004;
 //BA.debugLineNum = 5374004;BA.debugLine="Return False";
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
RDebugUtils.currentLine=5374009;
 //BA.debugLineNum = 5374009;BA.debugLine="RowUsuarioAutoriza = Row";
__ref._rowusuarioautoriza /*anywheresoftware.b4a.objects.collections.Map*/  = _row;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=5374013;
 //BA.debugLineNum = 5374013;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5374014;
 //BA.debugLineNum = 5374014;BA.debugLine="Cancelado = True";
__ref._cancelado /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=5374015;
 //BA.debugLineNum = 5374015;BA.debugLine="Error = \"Accion cancelada, no se ingresa ninguna";
__ref._error /*String*/  = "Accion cancelada, no se ingresa ninguna clave";
RDebugUtils.currentLine=5374016;
 //BA.debugLineNum = 5374016;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=5374020;
 //BA.debugLineNum = 5374020;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5374021;
 //BA.debugLineNum = 5374021;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=5374022;
 //BA.debugLineNum = 5374022;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=5374024;
 //BA.debugLineNum = 5374024;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_nombre_permiso(BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "sb_traer_nombre_permiso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_nombre_permiso", new Object[] {_codpermiso}));}
ResumableSub_Sb_Traer_Nombre_Permiso rsub = new ResumableSub_Sb_Traer_Nombre_Permiso(this,__ref,_codpermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Nombre_Permiso extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Nombre_Permiso(BaKapp.Movil.Tag.cl_permisoxui parent,BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this.__ref = parent;
}
BaKapp.Movil.Tag.cl_permisoxui __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
anywheresoftware.b4a.objects.collections.Map _rowpermiso = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim RowPermiso As Map";
_rowpermiso = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="ProgressDialogShow(\"Revisando permiso...\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Revisando permiso..."));
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
__ref._consulta_sql /*String*/  = "Select Top 1 * From "+parent._variables._global_basebk /*String*/ +"ZW_Permisos Where CodPermiso = '"+_codpermiso+"'";
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "sb_traer_nombre_permiso"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="RowPermiso = Funciones.Fx_DataRow(Js.GetString)";
_rowpermiso = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ (null));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="RowPermiso = Null";
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
RDebugUtils.currentLine=5636118;
 //BA.debugLineNum = 5636118;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5636119;
 //BA.debugLineNum = 5636119;BA.debugLine="Return RowPermiso";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rowpermiso));return;};
RDebugUtils.currentLine=5636121;
 //BA.debugLineNum = 5636121;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tienepermiso(BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso,String _codusuario) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "tienepermiso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "tienepermiso", new Object[] {_codpermiso,_codusuario}));}
ResumableSub_TienePermiso rsub = new ResumableSub_TienePermiso(this,__ref,_codpermiso,_codusuario);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TienePermiso extends BA.ResumableSub {
public ResumableSub_TienePermiso(BaKapp.Movil.Tag.cl_permisoxui parent,BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso,String _codusuario) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this._codusuario = _codusuario;
this.__ref = parent;
}
BaKapp.Movil.Tag.cl_permisoxui __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
String _codusuario;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _rs = null;
String _nokofu = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="ProgressDialogShow(\"Revisando permiso...\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Revisando permiso..."));
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
__ref._consulta_sql /*String*/  = "Select Top 1 * From "+parent._variables._global_basebk /*String*/ +"ZW_PermisosVsUsuarios Where CodUsuario = '"+_codusuario+"' And CodPermiso = '"+_codpermiso+"'";
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "tienepermiso"), (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="Wait For(Fx_RowTraerUsuario(CodUsuario)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "tienepermiso"), __ref._fx_rowtraerusuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codusuario));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_rs = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5570579;
 //BA.debugLineNum = 5570579;BA.debugLine="If Rs = Null Then";
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
RDebugUtils.currentLine=5570580;
 //BA.debugLineNum = 5570580;BA.debugLine="Error = \"El usuario [\" & CodUsuario & \"] no ex";
__ref._error /*String*/  = "El usuario ["+_codusuario+"] no exite";
RDebugUtils.currentLine=5570581;
 //BA.debugLineNum = 5570581;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=5570583;
 //BA.debugLineNum = 5570583;BA.debugLine="Dim Nokofu As String = Rs.Get(\"NOKOFU\")";
_nokofu = BA.ObjectToString(_rs.Get((Object)("NOKOFU")));
RDebugUtils.currentLine=5570584;
 //BA.debugLineNum = 5570584;BA.debugLine="Error = \"El usuario [\" & CodUsuario & \"]-\" & No";
__ref._error /*String*/  = "El usuario ["+_codusuario+"]-"+_nokofu.trim()+" no tiene clave apara realizar esta acción";
RDebugUtils.currentLine=5570585;
 //BA.debugLineNum = 5570585;BA.debugLine="Return False";
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
RDebugUtils.currentLine=5570591;
 //BA.debugLineNum = 5570591;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5570592;
 //BA.debugLineNum = 5570592;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=5570594;
 //BA.debugLineNum = 5570594;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisarpermisousuario(BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso,String _vclave) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "sb_revisarpermisousuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_revisarpermisousuario", new Object[] {_codpermiso,_vclave}));}
ResumableSub_Sb_RevisarPermisoUsuario rsub = new ResumableSub_Sb_RevisarPermisoUsuario(this,__ref,_codpermiso,_vclave);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_RevisarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Sb_RevisarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso,String _vclave) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this._vclave = _vclave;
this.__ref = parent;
}
BaKapp.Movil.Tag.cl_permisoxui __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
String _vclave;
anywheresoftware.b4a.objects.collections.Map _row = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
boolean _result2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="vClave = Funciones.Fx_TraeClaveRD(vClave)";
_vclave = parent._funciones._fx_traeclaverd /*String*/ (ba,_vclave);
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="If vClave.Trim = \"\" Then";
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
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Error = \"La clave no puede estar vacia\"";
__ref._error /*String*/  = "La clave no puede estar vacia";
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="Dim Consulta_Sql As String = \"Select Top 1 * From";
parent._consulta_sql = "Select Top 1 * From TABFU Where PWFU = '"+_vclave+"'";
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="Log(vClave)";
parent.__c.LogImpl("65505036",_vclave,0);
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="ProgressDialogShow(\"Revisando permiso\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("Revisando permiso"));
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "sb_revisarpermisousuario"), (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=5505045;
 //BA.debugLineNum = 5505045;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="Row = Funciones.Fx_DataRow(Js.GetString)";
_row = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5505051;
 //BA.debugLineNum = 5505051;BA.debugLine="Wait For(TienePermiso(CodPermiso,Row.Get(\"KOFU\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "sb_revisarpermisousuario"), __ref._tienepermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codpermiso,BA.ObjectToString(_row.Get((Object)("KOFU")))));
this.state = 20;
return;
case 20:
//C
this.state = 11;
_result2 = (Boolean) result[1];
;
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="If Not(Result2) Then";
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
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5505055;
 //BA.debugLineNum = 5505055;BA.debugLine="Return Null";
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
RDebugUtils.currentLine=5505059;
 //BA.debugLineNum = 5505059;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5505060;
 //BA.debugLineNum = 5505060;BA.debugLine="Error = \"Clave invalida\"";
__ref._error /*String*/  = "Clave invalida";
RDebugUtils.currentLine=5505061;
 //BA.debugLineNum = 5505061;BA.debugLine="Return Null";
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
RDebugUtils.currentLine=5505066;
 //BA.debugLineNum = 5505066;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5505067;
 //BA.debugLineNum = 5505067;BA.debugLine="Return Row";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_row));return;};
RDebugUtils.currentLine=5505069;
 //BA.debugLineNum = 5505069;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(BaKapp.Movil.Tag.cl_permisoxui __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_validarpermisousuario(BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";
if (Debug.shouldDelegate(ba, "sb_validarpermisousuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_validarpermisousuario", new Object[] {_codpermiso}));}
ResumableSub_Sb_ValidarPermisoUsuario rsub = new ResumableSub_Sb_ValidarPermisoUsuario(this,__ref,_codpermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_ValidarPermisoUsuario extends BA.ResumableSub {
public ResumableSub_Sb_ValidarPermisoUsuario(BaKapp.Movil.Tag.cl_permisoxui parent,BaKapp.Movil.Tag.cl_permisoxui __ref,String _codpermiso) {
this.parent = parent;
this.__ref = __ref;
this._codpermiso = _codpermiso;
this.__ref = parent;
}
BaKapp.Movil.Tag.cl_permisoxui __ref;
BaKapp.Movil.Tag.cl_permisoxui parent;
String _codpermiso;
boolean _rst = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cl_permisoxui";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Wait For(Fx_ValidarPermisoUsuario(CodPermiso)) Co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cl_permisoxui", "sb_validarpermisousuario"), __ref._fx_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codpermiso));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rst = (Boolean) result[1];
;
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="If Not(Cancelado) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.Not(__ref._cancelado /*boolean*/ )) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Msgbox2Async(Error , \"Validación\", \"Ok\", \"\", \"\"";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._error /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}