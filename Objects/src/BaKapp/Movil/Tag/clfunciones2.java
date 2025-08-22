package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clfunciones2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "BaKapp.Movil.Tag.clfunciones2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.clfunciones2.class).invoke(this, new Object[] {null});
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
public String _newpara = "";
public String _consulta_sql = "";
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
public String  _base_resize(BaKapp.Movil.Tag.clfunciones2 __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(BaKapp.Movil.Tag.clfunciones2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clfunciones2";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="Public NewPara As String";
_newpara = "";
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(BaKapp.Movil.Tag.clfunciones2 __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_actualizarcorreoentidad(BaKapp.Movil.Tag.clfunciones2 __ref,String _koen,String _suen,String _para,String _campoemail) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "fx_actualizarcorreoentidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_actualizarcorreoentidad", new Object[] {_koen,_suen,_para,_campoemail}));}
ResumableSub_Fx_ActualizarCorreoEntidad rsub = new ResumableSub_Fx_ActualizarCorreoEntidad(this,__ref,_koen,_suen,_para,_campoemail);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_ActualizarCorreoEntidad extends BA.ResumableSub {
public ResumableSub_Fx_ActualizarCorreoEntidad(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref,String _koen,String _suen,String _para,String _campoemail) {
this.parent = parent;
this.__ref = __ref;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
String _koen;
String _suen;
String _para;
String _campoemail;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim Consulta_Sql As String = \"Update MAEEN Set \"";
parent._consulta_sql = "Update MAEEN Set "+_campoemail+" = '"+_para+"' Where KOEN = '"+_koen+"' And SUEN = '"+_suen+"'"+parent.__c.CRLF+"Select Cast(1 As Bit) As Ok";
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_actualizarcorreoentidad"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
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
RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_enviar_correo_bakapp1(BaKapp.Movil.Tag.clfunciones2 __ref,int _idmaeedo,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "fx_enviar_correo_bakapp1", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_enviar_correo_bakapp1", new Object[] {_idmaeedo,_koen,_suen,_para,_campoemail,_editarmaeen}));}
ResumableSub_Fx_Enviar_Correo_Bakapp1 rsub = new ResumableSub_Fx_Enviar_Correo_Bakapp1(this,__ref,_idmaeedo,_koen,_suen,_para,_campoemail,_editarmaeen);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Enviar_Correo_Bakapp1 extends BA.ResumableSub {
public ResumableSub_Fx_Enviar_Correo_Bakapp1(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref,int _idmaeedo,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) {
this.parent = parent;
this.__ref = __ref;
this._idmaeedo = _idmaeedo;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this._editarmaeen = _editarmaeen;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
int _idmaeedo;
String _koen;
String _suen;
String _para;
String _campoemail;
boolean _editarmaeen;
String _codfuncionario = "";
String _empresa = "";
String _modalidad = "";
String _error = "";
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
String _resultado = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Dim Modalidad As String = Variables.Gl_Modalidad";
_modalidad = parent._variables._gl_modalidad /*String*/ ;
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,ba,_base);
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="Wait For(Sb_Ingresar_Correo_Validar(Koen,Suen,Par";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_enviar_correo_bakapp1"), __ref._sb_ingresar_correo_validar /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_koen,_suen,_para,"EMAILCOMER",parent.__c.True));
this.state = 22;
return;
case 22:
//C
this.state = 1;
_resultado = (String) result[1];
;
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="NewPara = Resultado";
__ref._newpara /*String*/  = _resultado;
RDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="If NewPara = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._newpara /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="Return \"Sin correo receptor\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Sin correo receptor"));return;};
 if (true) break;
;
RDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="If NewPara = \"Cancelar\" Then";

case 4:
//if
this.state = 7;
if ((__ref._newpara /*String*/ ).equals("Cancelar")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6488086;
 //BA.debugLineNum = 6488086;BA.debugLine="Return \"Cancelado por el usuario\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Cancelado por el usuario"));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=6488089;
 //BA.debugLineNum = 6488089;BA.debugLine="Para = NewPara";
_para = __ref._newpara /*String*/ ;
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Env";
_js = parent._funciones._fx_httjob_ws_sb_enviarcorreobakapp /*BaKapp.Movil.Tag.httpjob*/ (ba,parent,_empresa,_modalidad,_codfuncionario,_idmaeedo,__ref._newpara /*String*/ ,"");
RDebugUtils.currentLine=6488092;
 //BA.debugLineNum = 6488092;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_enviar_correo_bakapp1"), (Object)(_js));
this.state = 23;
return;
case 23:
//C
this.state = 8;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=6488094;
 //BA.debugLineNum = 6488094;BA.debugLine="If Js.Success Then";
if (true) break;

case 8:
//if
this.state = 21;
if (_js._success /*boolean*/ ) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=6488096;
 //BA.debugLineNum = 6488096;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=6488098;
 //BA.debugLineNum = 6488098;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 11:
//if
this.state = 20;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=6488100;
 //BA.debugLineNum = 6488100;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=6488101;
 //BA.debugLineNum = 6488101;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
RDebugUtils.currentLine=6488103;
 //BA.debugLineNum = 6488103;BA.debugLine="If Error = \"Ok\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_error).equals("Ok")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=6488104;
 //BA.debugLineNum = 6488104;BA.debugLine="ToastMessageShow(\"Docuemto enviado a casilla d";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Docuemto enviado a casilla de salida de email..."),parent.__c.False);
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=6488110;
 //BA.debugLineNum = 6488110;BA.debugLine="Error = \"Falta la función en el WS\"";
_error = "Falta la función en el WS";
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
RDebugUtils.currentLine=6488115;
 //BA.debugLineNum = 6488115;BA.debugLine="Return Error";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_error));return;};
RDebugUtils.currentLine=6488117;
 //BA.debugLineNum = 6488117;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ingresar_correo_validar(BaKapp.Movil.Tag.clfunciones2 __ref,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "sb_ingresar_correo_validar", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_ingresar_correo_validar", new Object[] {_koen,_suen,_para,_campoemail,_editarmaeen}));}
ResumableSub_Sb_Ingresar_Correo_Validar rsub = new ResumableSub_Sb_Ingresar_Correo_Validar(this,__ref,_koen,_suen,_para,_campoemail,_editarmaeen);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Ingresar_Correo_Validar extends BA.ResumableSub {
public ResumableSub_Sb_Ingresar_Correo_Validar(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) {
this.parent = parent;
this.__ref = __ref;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this._editarmaeen = _editarmaeen;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
String _koen;
String _suen;
String _para;
String _campoemail;
boolean _editarmaeen;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
int _result = 0;
String _resultado = "";
boolean _res = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Base = mBase";
_base = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,ba,_base);
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese correo del cliente"));
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="InputTemplate.Text = Para";
_inputtemplate._text /*String*/  = _para;
RDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_ingresar_correo_validar"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6553619;
 //BA.debugLineNum = 6553619;BA.debugLine="Try";
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
RDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="Para = InputTemplate.Text.Trim";
_para = _inputtemplate._text /*String*/ .trim();
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=6553622;
 //BA.debugLineNum = 6553622;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("66553622",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=6553623;
 //BA.debugLineNum = 6553623;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=6553624;
 //BA.debugLineNum = 6553624;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(parent.__c.LastException(ba).getObject()),"Ok","","",_bmp1,ba,parent.__c.False);
RDebugUtils.currentLine=6553625;
 //BA.debugLineNum = 6553625;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_ingresar_correo_validar"), null);
this.state = 31;
return;
case 31:
//C
this.state = 9;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=6553626;
 //BA.debugLineNum = 6553626;BA.debugLine="Para = \"Error\"";
_para = "Error";
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
RDebugUtils.currentLine=6553629;
 //BA.debugLineNum = 6553629;BA.debugLine="Para = \"Cancelar\"";
_para = "Cancelar";
 if (true) break;
;
RDebugUtils.currentLine=6553632;
 //BA.debugLineNum = 6553632;BA.debugLine="If Para = \"Cancelar\" Then";

case 12:
//if
this.state = 15;
if ((_para).equals("Cancelar")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=6553633;
 //BA.debugLineNum = 6553633;BA.debugLine="Return Para";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_para));return;};
 if (true) break;
;
RDebugUtils.currentLine=6553636;
 //BA.debugLineNum = 6553636;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";

case 15:
//if
this.state = 18;
if (parent._funciones._fx_isemail /*boolean*/ (ba,_para)==parent.__c.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=6553638;
 //BA.debugLineNum = 6553638;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=6553639;
 //BA.debugLineNum = 6553639;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,ba,parent.__c.False);
RDebugUtils.currentLine=6553640;
 //BA.debugLineNum = 6553640;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_ingresar_correo_validar"), null);
this.state = 32;
return;
case 32:
//C
this.state = 18;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=6553642;
 //BA.debugLineNum = 6553642;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Koen,Suen,P";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_ingresar_correo_validar"), __ref._sb_ingresar_correo_validar /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_koen,_suen,_para,_campoemail,_editarmaeen));
this.state = 33;
return;
case 33:
//C
this.state = 18;
_resultado = (String) result[1];
;
RDebugUtils.currentLine=6553644;
 //BA.debugLineNum = 6553644;BA.debugLine="Para = Resultado";
_para = _resultado;
 if (true) break;
;
RDebugUtils.currentLine=6553648;
 //BA.debugLineNum = 6553648;BA.debugLine="If Para <> \"Cancelar\" Then";

case 18:
//if
this.state = 29;
if ((_para).equals("Cancelar") == false) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=6553650;
 //BA.debugLineNum = 6553650;BA.debugLine="If EditarMaeen Then";
if (true) break;

case 21:
//if
this.state = 28;
if (_editarmaeen) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=6553651;
 //BA.debugLineNum = 6553651;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=6553652;
 //BA.debugLineNum = 6553652;BA.debugLine="Wait For (Fx_ActualizarCorreoEntidad(Koen,Suen,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_ingresar_correo_validar"), __ref._fx_actualizarcorreoentidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_koen,_suen,_para,_campoemail));
this.state = 34;
return;
case 34:
//C
this.state = 24;
_res = (Boolean) result[1];
;
RDebugUtils.currentLine=6553653;
 //BA.debugLineNum = 6553653;BA.debugLine="If Res Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_res) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=6553654;
 //BA.debugLineNum = 6553654;BA.debugLine="Msgbox2Async(\"Correo actualizado en la ficha d";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Correo actualizado en la ficha del cliente"),BA.ObjectToCharSequence("Información"),"Ok","","",_bmp1,ba,parent.__c.False);
RDebugUtils.currentLine=6553655;
 //BA.debugLineNum = 6553655;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_ingresar_correo_validar"), null);
this.state = 35;
return;
case 35:
//C
this.state = 27;
_result = (Integer) result[1];
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
RDebugUtils.currentLine=6553661;
 //BA.debugLineNum = 6553661;BA.debugLine="Return Para";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_para));return;};
RDebugUtils.currentLine=6553663;
 //BA.debugLineNum = 6553663;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_formato_modalidad(BaKapp.Movil.Tag.clfunciones2 __ref,String _empresa,String _modalidad,String _tido) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "fx_formato_modalidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_formato_modalidad", new Object[] {_empresa,_modalidad,_tido}));}
ResumableSub_Fx_Formato_Modalidad rsub = new ResumableSub_Fx_Formato_Modalidad(this,__ref,_empresa,_modalidad,_tido);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Formato_Modalidad extends BA.ResumableSub {
public ResumableSub_Fx_Formato_Modalidad(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref,String _empresa,String _modalidad,String _tido) {
this.parent = parent;
this.__ref = __ref;
this._empresa = _empresa;
this._modalidad = _modalidad;
this._tido = _tido;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
String _empresa;
String _modalidad;
String _tido;
anywheresoftware.b4a.objects.collections.Map _respuesta = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim Respuesta As Map";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_For";
_js = parent._funciones._fx_httjob_ws_sb_formatomodalidad /*BaKapp.Movil.Tag.httpjob*/ (ba,_empresa,_modalidad,_tido,parent);
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_formato_modalidad"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Respuesta = Funciones.Fx_DataRow(Js.GetString)";
_respuesta = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ (null));
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
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="Return Respuesta";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuesta));return;};
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_imprimir_bakapp(BaKapp.Movil.Tag.clfunciones2 __ref,int _idmaeedo) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "fx_imprimir_bakapp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_imprimir_bakapp", new Object[] {_idmaeedo}));}
ResumableSub_Fx_Imprimir_Bakapp rsub = new ResumableSub_Fx_Imprimir_Bakapp(this,__ref,_idmaeedo);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Imprimir_Bakapp extends BA.ResumableSub {
public ResumableSub_Fx_Imprimir_Bakapp(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref,int _idmaeedo) {
this.parent = parent;
this.__ref = __ref;
this._idmaeedo = _idmaeedo;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
int _idmaeedo;
String _codfuncionario = "";
String _empresa = "";
String _modalidad = "";
String _error = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Dim Modalidad As String = Variables.Gl_Modalidad";
_modalidad = parent._variables._gl_modalidad /*String*/ ;
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Env";
_js = parent._funciones._fx_httjob_ws_sb_enviarimprimirbakapp /*BaKapp.Movil.Tag.httpjob*/ (ba,parent,_empresa,_modalidad,_codfuncionario,_idmaeedo);
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_imprimir_bakapp"), (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=6684690;
 //BA.debugLineNum = 6684690;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
RDebugUtils.currentLine=6684692;
 //BA.debugLineNum = 6684692;BA.debugLine="If Error = \"Ok\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_error).equals("Ok")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=6684693;
 //BA.debugLineNum = 6684693;BA.debugLine="ToastMessageShow(\"Documento enviado a imprimir";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Documento enviado a imprimir..."),parent.__c.False);
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=6684697;
 //BA.debugLineNum = 6684697;BA.debugLine="Error = \"Falta la función en el WS\"";
_error = "Falta la función en el WS";
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
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="Return Error";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_error));return;};
RDebugUtils.currentLine=6684704;
 //BA.debugLineNum = 6684704;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_revisarformato(BaKapp.Movil.Tag.clfunciones2 __ref,String _tido) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "fx_revisarformato", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_revisarformato", new Object[] {_tido}));}
ResumableSub_Fx_RevisarFormato rsub = new ResumableSub_Fx_RevisarFormato(this,__ref,_tido);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_RevisarFormato extends BA.ResumableSub {
public ResumableSub_Fx_RevisarFormato(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref,String _tido) {
this.parent = parent;
this.__ref = __ref;
this._tido = _tido;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
String _tido;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
BaKapp.Movil.Tag.clfunciones2 _clfx2 = null;
anywheresoftware.b4a.objects.collections.Map _resultado = null;
boolean _escorrecto = false;
String _errormsg = "";
int _result = 0;
boolean _tieneformato = false;
String _nombrefomato = "";
String _nombrefomatoenmod = "";
String _msg = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Dim CLFx2 As ClFunciones2";
_clfx2 = new BaKapp.Movil.Tag.clfunciones2();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="CLFx2.Initialize(Null,\"\")";
_clfx2._initialize /*String*/ (null,ba,parent.__c.Null,"");
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="CLFx2.DesignerCreateView(mBase,Null,Null)";
_clfx2._designercreateview /*String*/ (null,(Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(parent.__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null)));
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Wait For(CLFx2.Fx_Formato_Modalidad(Variables.Gl_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_revisarformato"), _clfx2._fx_formato_modalidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._variables._gl_empresa /*String*/ ,parent._variables._gl_modalidad /*String*/ ,_tido));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_resultado = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="Dim EsCorrecto As Boolean = Resultado.Get(\"EsCorr";
_escorrecto = BA.ObjectToBoolean(_resultado.Get((Object)("EsCorrecto")));
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="If Not(EsCorrecto) Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent.__c.Not(_escorrecto)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="Dim ErrorMsg As String = Resultado.Get(\"Error\")";
_errormsg = BA.ObjectToString(_resultado.Get((Object)("Error")));
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="Msgbox2Async(ErrorMsg & CRLF & _ 					 \"Informe";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(_errormsg+parent.__c.CRLF+"Informe al administrador del sistema"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",_bmp1,ba,parent.__c.True);
RDebugUtils.currentLine=6881297;
 //BA.debugLineNum = 6881297;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_revisarformato"), null);
this.state = 27;
return;
case 27:
//C
this.state = 16;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=6881298;
 //BA.debugLineNum = 6881298;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6881301;
 //BA.debugLineNum = 6881301;BA.debugLine="Dim TieneFormato As Boolean = Resultado.Get(\"Tie";
_tieneformato = BA.ObjectToBoolean(_resultado.Get((Object)("TieneFormato")));
RDebugUtils.currentLine=6881302;
 //BA.debugLineNum = 6881302;BA.debugLine="Dim NombreFomato As String = Resultado.Get(\"Nomb";
_nombrefomato = BA.ObjectToString(_resultado.Get((Object)("NombreFomato")));
RDebugUtils.currentLine=6881303;
 //BA.debugLineNum = 6881303;BA.debugLine="Dim NombreFomatoEnMod As String = Resultado.Get(";
_nombrefomatoenmod = BA.ObjectToString(_resultado.Get((Object)("NombreFomatoEnMod")));
RDebugUtils.currentLine=6881305;
 //BA.debugLineNum = 6881305;BA.debugLine="Dim Msg As String";
_msg = "";
RDebugUtils.currentLine=6881307;
 //BA.debugLineNum = 6881307;BA.debugLine="If Not(TieneFormato) Then";
if (true) break;

case 6:
//if
this.state = 15;
if (parent.__c.Not(_tieneformato)) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=6881309;
 //BA.debugLineNum = 6881309;BA.debugLine="If NombreFomatoEnMod = \"\" Then";
if (true) break;

case 9:
//if
this.state = 14;
if ((_nombrefomatoenmod).equals("")) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=6881311;
 //BA.debugLineNum = 6881311;BA.debugLine="Else If NombreFomato = \"\" Then";
if ((_nombrefomato).equals("")) { 
this.state = 13;
}}
if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=6881310;
 //BA.debugLineNum = 6881310;BA.debugLine="Msg = \"No existe formato asociado a Empresa: [";
_msg = "No existe formato asociado a Empresa: ["+parent._variables._gl_empresa /*String*/ +"],Modalidad: "+parent._variables._gl_modalidad /*String*/ ;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=6881312;
 //BA.debugLineNum = 6881312;BA.debugLine="Msg = \"No existe el formato [\" & NombreFomatoE";
_msg = "No existe el formato ["+_nombrefomatoenmod+"] para Empresa: ["+parent._variables._gl_empresa /*String*/ +"],Modalidad: "+parent._variables._gl_modalidad /*String*/ ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=6881315;
 //BA.debugLineNum = 6881315;BA.debugLine="Msgbox2Async(Msg & CRLF & _ 					 \"Informe al a";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(_msg+parent.__c.CRLF+"Informe al administrador del sistema"),BA.ObjectToCharSequence("Validación"+parent.__c.CRLF+_tido+"-"+BA.ObjectToString(_resultado.Get((Object)("Notido")))),"Aceptar","","",_bmp1,ba,parent.__c.True);
RDebugUtils.currentLine=6881317;
 //BA.debugLineNum = 6881317;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "fx_revisarformato"), null);
this.state = 28;
return;
case 28:
//C
this.state = 15;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=6881318;
 //BA.debugLineNum = 6881318;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=6881322;
 //BA.debugLineNum = 6881322;BA.debugLine="Select Case Tido";

case 16:
//select
this.state = 25;
switch (BA.switchObjectToInt(_tido,"COV","NVV","BLV","FCV")) {
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
RDebugUtils.currentLine=6881324;
 //BA.debugLineNum = 6881324;BA.debugLine="Variables.Global_COV = Resultado";
parent._variables._global_cov /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=6881326;
 //BA.debugLineNum = 6881326;BA.debugLine="Variables.Global_NVV = Resultado";
parent._variables._global_nvv /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=6881328;
 //BA.debugLineNum = 6881328;BA.debugLine="Variables.Global_BLV = Resultado";
parent._variables._global_blv /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=6881330;
 //BA.debugLineNum = 6881330;BA.debugLine="Variables.Global_FCV = Resultado";
parent._variables._global_fcv /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=6881333;
 //BA.debugLineNum = 6881333;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=6881334;
 //BA.debugLineNum = 6881334;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(BaKapp.Movil.Tag.clfunciones2 __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisarformatos(BaKapp.Movil.Tag.clfunciones2 __ref) throws Exception{
RDebugUtils.currentModule="clfunciones2";
if (Debug.shouldDelegate(ba, "sb_revisarformatos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_revisarformatos", null));}
ResumableSub_Sb_RevisarFormatos rsub = new ResumableSub_Sb_RevisarFormatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_RevisarFormatos extends BA.ResumableSub {
public ResumableSub_Sb_RevisarFormatos(BaKapp.Movil.Tag.clfunciones2 parent,BaKapp.Movil.Tag.clfunciones2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.clfunciones2 __ref;
BaKapp.Movil.Tag.clfunciones2 parent;
boolean _resultado = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clfunciones2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Wait For(Fx_RevisarFormato(\"COV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_revisarformatos"), __ref._fx_revisarformato /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"COV"));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_resultado = (Boolean) result[1];
;
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_resultado)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Wait For(Fx_RevisarFormato(\"NVV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_revisarformatos"), __ref._fx_revisarformato /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"NVV"));
this.state = 18;
return;
case 18:
//C
this.state = 5;
_resultado = (Boolean) result[1];
;
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(_resultado)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="Wait For(Fx_RevisarFormato(\"BLV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_revisarformatos"), __ref._fx_revisarformato /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"BLV"));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_resultado = (Boolean) result[1];
;
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 9:
//if
this.state = 12;
if (parent.__c.Not(_resultado)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="Wait For(Fx_RevisarFormato(\"FCV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clfunciones2", "sb_revisarformatos"), __ref._fx_revisarformato /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"FCV"));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_resultado = (Boolean) result[1];
;
RDebugUtils.currentLine=6815762;
 //BA.debugLineNum = 6815762;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent.__c.Not(_resultado)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=6815766;
 //BA.debugLineNum = 6815766;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=6815768;
 //BA.debugLineNum = 6815768;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}