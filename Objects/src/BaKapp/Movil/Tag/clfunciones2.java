package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clfunciones2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.clfunciones2");
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
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Public NewPara As String";
_newpara = "";
 //BA.debugLineNum = 11;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 21;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 22;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 23;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_actualizarcorreoentidad(String _koen,String _suen,String _para,String _campoemail) throws Exception{
ResumableSub_Fx_ActualizarCorreoEntidad rsub = new ResumableSub_Fx_ActualizarCorreoEntidad(this,_koen,_suen,_para,_campoemail);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_ActualizarCorreoEntidad extends BA.ResumableSub {
public ResumableSub_Fx_ActualizarCorreoEntidad(BaKapp.Movil.Tag.clfunciones2 parent,String _koen,String _suen,String _para,String _campoemail) {
this.parent = parent;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
}
BaKapp.Movil.Tag.clfunciones2 parent;
String _koen;
String _suen;
String _para;
String _campoemail;
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
 //BA.debugLineNum = 153;BA.debugLine="Dim Consulta_Sql As String = \"Update MAEEN Set \"";
parent._consulta_sql = "Update MAEEN Set "+_campoemail+" = '"+_para+"' Where KOEN = '"+_koen+"' And SUEN = '"+_suen+"'"+parent.__c.CRLF+"Select Cast(1 As Bit) As Ok";
 //BA.debugLineNum = 156;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (ba,parent._consulta_sql,parent);
 //BA.debugLineNum = 157;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 159;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 161;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 163;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 164;BA.debugLine="Return True";
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
 //BA.debugLineNum = 169;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_enviar_correo_bakapp1(int _idmaeedo,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) throws Exception{
ResumableSub_Fx_Enviar_Correo_Bakapp1 rsub = new ResumableSub_Fx_Enviar_Correo_Bakapp1(this,_idmaeedo,_koen,_suen,_para,_campoemail,_editarmaeen);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Enviar_Correo_Bakapp1 extends BA.ResumableSub {
public ResumableSub_Fx_Enviar_Correo_Bakapp1(BaKapp.Movil.Tag.clfunciones2 parent,int _idmaeedo,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this._editarmaeen = _editarmaeen;
}
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

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 33;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 34;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 35;BA.debugLine="Dim Modalidad As String = Variables.Gl_Modalidad";
_modalidad = parent._variables._gl_modalidad /*String*/ ;
 //BA.debugLineNum = 36;BA.debugLine="Dim Error As String";
_error = "";
 //BA.debugLineNum = 38;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 41;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 43;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 45;BA.debugLine="Wait For(Sb_Ingresar_Correo_Validar(Koen,Suen,Par";
parent.__c.WaitFor("complete", ba, this, parent._sb_ingresar_correo_validar(_koen,_suen,_para,"EMAILCOMER",parent.__c.True));
this.state = 22;
return;
case 22:
//C
this.state = 1;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 46;BA.debugLine="NewPara = Resultado";
parent._newpara = _resultado;
 //BA.debugLineNum = 48;BA.debugLine="If NewPara = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._newpara).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 49;BA.debugLine="Return \"Sin correo receptor\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Sin correo receptor"));return;};
 if (true) break;
;
 //BA.debugLineNum = 52;BA.debugLine="If NewPara = \"Cancelar\" Then";

case 4:
//if
this.state = 7;
if ((parent._newpara).equals("Cancelar")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 53;BA.debugLine="Return \"Cancelado por el usuario\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Cancelado por el usuario"));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 56;BA.debugLine="Para = NewPara";
_para = parent._newpara;
 //BA.debugLineNum = 58;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Env";
_js = parent._funciones._fx_httjob_ws_sb_enviarcorreobakapp /*BaKapp.Movil.Tag.httpjob*/ (ba,parent,_empresa,_modalidad,_codfuncionario,_idmaeedo,parent._newpara,"");
 //BA.debugLineNum = 59;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 23;
return;
case 23:
//C
this.state = 8;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 61;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 63;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 65;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 67;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ ());
 //BA.debugLineNum = 68;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
 //BA.debugLineNum = 70;BA.debugLine="If Error = \"Ok\" Then";
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
 //BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Docuemto enviado a casilla d";
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
 //BA.debugLineNum = 77;BA.debugLine="Error = \"Falta la función en el WS\"";
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
 //BA.debugLineNum = 82;BA.debugLine="Return Error";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_error));return;};
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(String _resultado) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_formato_modalidad(String _empresa,String _modalidad,String _tido) throws Exception{
ResumableSub_Fx_Formato_Modalidad rsub = new ResumableSub_Fx_Formato_Modalidad(this,_empresa,_modalidad,_tido);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Formato_Modalidad extends BA.ResumableSub {
public ResumableSub_Fx_Formato_Modalidad(BaKapp.Movil.Tag.clfunciones2 parent,String _empresa,String _modalidad,String _tido) {
this.parent = parent;
this._empresa = _empresa;
this._modalidad = _modalidad;
this._tido = _tido;
}
BaKapp.Movil.Tag.clfunciones2 parent;
String _empresa;
String _modalidad;
String _tido;
anywheresoftware.b4a.objects.collections.Map _respuesta = null;
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
 //BA.debugLineNum = 209;BA.debugLine="Dim Respuesta As Map";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 211;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_For";
_js = parent._funciones._fx_httjob_ws_sb_formatomodalidad /*BaKapp.Movil.Tag.httpjob*/ (ba,_empresa,_modalidad,_tido,parent);
 //BA.debugLineNum = 212;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 214;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 216;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 217;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 218;BA.debugLine="Respuesta = Funciones.Fx_DataRow(Js.GetString)";
_respuesta = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ ());
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
 //BA.debugLineNum = 222;BA.debugLine="Return Respuesta";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuesta));return;};
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_imprimir_bakapp(int _idmaeedo) throws Exception{
ResumableSub_Fx_Imprimir_Bakapp rsub = new ResumableSub_Fx_Imprimir_Bakapp(this,_idmaeedo);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Imprimir_Bakapp extends BA.ResumableSub {
public ResumableSub_Fx_Imprimir_Bakapp(BaKapp.Movil.Tag.clfunciones2 parent,int _idmaeedo) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
}
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

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 175;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 176;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 177;BA.debugLine="Dim Modalidad As String = Variables.Gl_Modalidad";
_modalidad = parent._variables._gl_modalidad /*String*/ ;
 //BA.debugLineNum = 178;BA.debugLine="Dim Error As String";
_error = "";
 //BA.debugLineNum = 180;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Env";
_js = parent._funciones._fx_httjob_ws_sb_enviarimprimirbakapp /*BaKapp.Movil.Tag.httpjob*/ (ba,parent,_empresa,_modalidad,_codfuncionario,_idmaeedo);
 //BA.debugLineNum = 181;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 183;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 185;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 187;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 189;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_js._getstring /*String*/ ());
 //BA.debugLineNum = 191;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
 //BA.debugLineNum = 193;BA.debugLine="If Error = \"Ok\" Then";
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
 //BA.debugLineNum = 194;BA.debugLine="ToastMessageShow(\"Documento enviado a imprimir";
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
 //BA.debugLineNum = 198;BA.debugLine="Error = \"Falta la función en el WS\"";
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
 //BA.debugLineNum = 203;BA.debugLine="Return Error";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_error));return;};
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_revisarformato(String _tido) throws Exception{
ResumableSub_Fx_RevisarFormato rsub = new ResumableSub_Fx_RevisarFormato(this,_tido);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_RevisarFormato extends BA.ResumableSub {
public ResumableSub_Fx_RevisarFormato(BaKapp.Movil.Tag.clfunciones2 parent,String _tido) {
this.parent = parent;
this._tido = _tido;
}
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

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 254;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 256;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 258;BA.debugLine="Dim CLFx2 As ClFunciones2";
_clfx2 = new BaKapp.Movil.Tag.clfunciones2();
 //BA.debugLineNum = 259;BA.debugLine="CLFx2.Initialize(Null,\"\")";
_clfx2._initialize /*String*/ (ba,parent.__c.Null,"");
 //BA.debugLineNum = 260;BA.debugLine="CLFx2.DesignerCreateView(mBase,Null,Null)";
_clfx2._designercreateview /*String*/ ((Object)(parent._mbase.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(parent.__c.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null)));
 //BA.debugLineNum = 261;BA.debugLine="Wait For(CLFx2.Fx_Formato_Modalidad(Variables.Gl_";
parent.__c.WaitFor("complete", ba, this, _clfx2._fx_formato_modalidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._variables._gl_empresa /*String*/ ,parent._variables._gl_modalidad /*String*/ ,_tido));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_resultado = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 263;BA.debugLine="Dim EsCorrecto As Boolean = Resultado.Get(\"EsCorr";
_escorrecto = BA.ObjectToBoolean(_resultado.Get((Object)("EsCorrecto")));
 //BA.debugLineNum = 265;BA.debugLine="If Not(EsCorrecto) Then";
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
 //BA.debugLineNum = 266;BA.debugLine="Dim ErrorMsg As String = Resultado.Get(\"Error\")";
_errormsg = BA.ObjectToString(_resultado.Get((Object)("Error")));
 //BA.debugLineNum = 267;BA.debugLine="Msgbox2Async(ErrorMsg & CRLF & _ 					 \"Informe";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(_errormsg+parent.__c.CRLF+"Informe al administrador del sistema"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",_bmp1,ba,parent.__c.True);
 //BA.debugLineNum = 269;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 27;
return;
case 27:
//C
this.state = 16;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 270;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 273;BA.debugLine="Dim TieneFormato As Boolean = Resultado.Get(\"Tie";
_tieneformato = BA.ObjectToBoolean(_resultado.Get((Object)("TieneFormato")));
 //BA.debugLineNum = 274;BA.debugLine="Dim NombreFomato As String = Resultado.Get(\"Nomb";
_nombrefomato = BA.ObjectToString(_resultado.Get((Object)("NombreFomato")));
 //BA.debugLineNum = 275;BA.debugLine="Dim NombreFomatoEnMod As String = Resultado.Get(";
_nombrefomatoenmod = BA.ObjectToString(_resultado.Get((Object)("NombreFomatoEnMod")));
 //BA.debugLineNum = 277;BA.debugLine="Dim Msg As String";
_msg = "";
 //BA.debugLineNum = 279;BA.debugLine="If Not(TieneFormato) Then";
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
 //BA.debugLineNum = 281;BA.debugLine="If NombreFomatoEnMod = \"\" Then";
if (true) break;

case 9:
//if
this.state = 14;
if ((_nombrefomatoenmod).equals("")) { 
this.state = 11;
}else if((_nombrefomato).equals("")) { 
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 282;BA.debugLine="Msg = \"No existe formato asociado a Empresa: [";
_msg = "No existe formato asociado a Empresa: ["+parent._variables._gl_empresa /*String*/ +"],Modalidad: "+parent._variables._gl_modalidad /*String*/ ;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 284;BA.debugLine="Msg = \"No existe el formato [\" & NombreFomatoE";
_msg = "No existe el formato ["+_nombrefomatoenmod+"] para Empresa: ["+parent._variables._gl_empresa /*String*/ +"],Modalidad: "+parent._variables._gl_modalidad /*String*/ ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 287;BA.debugLine="Msgbox2Async(Msg & CRLF & _ 					 \"Informe al a";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(_msg+parent.__c.CRLF+"Informe al administrador del sistema"),BA.ObjectToCharSequence("Validación"+parent.__c.CRLF+_tido+"-"+BA.ObjectToString(_resultado.Get((Object)("Notido")))),"Aceptar","","",_bmp1,ba,parent.__c.True);
 //BA.debugLineNum = 289;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 28;
return;
case 28:
//C
this.state = 15;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 290;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 //BA.debugLineNum = 294;BA.debugLine="Select Case Tido";

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
 //BA.debugLineNum = 296;BA.debugLine="Variables.Global_COV = Resultado";
parent._variables._global_cov /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 20:
//C
this.state = 25;
 //BA.debugLineNum = 298;BA.debugLine="Variables.Global_NVV = Resultado";
parent._variables._global_nvv /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 22:
//C
this.state = 25;
 //BA.debugLineNum = 300;BA.debugLine="Variables.Global_BLV = Resultado";
parent._variables._global_blv /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 302;BA.debugLine="Variables.Global_FCV = Resultado";
parent._variables._global_fcv /*anywheresoftware.b4a.objects.collections.Map*/  = _resultado;
 if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 305;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 15;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 16;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ingresar_correo_validar(String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) throws Exception{
ResumableSub_Sb_Ingresar_Correo_Validar rsub = new ResumableSub_Sb_Ingresar_Correo_Validar(this,_koen,_suen,_para,_campoemail,_editarmaeen);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Ingresar_Correo_Validar extends BA.ResumableSub {
public ResumableSub_Sb_Ingresar_Correo_Validar(BaKapp.Movil.Tag.clfunciones2 parent,String _koen,String _suen,String _para,String _campoemail,boolean _editarmaeen) {
this.parent = parent;
this._koen = _koen;
this._suen = _suen;
this._para = _para;
this._campoemail = _campoemail;
this._editarmaeen = _editarmaeen;
}
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

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 88;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 91;BA.debugLine="Base = mBase";
_base = parent._mbase;
 //BA.debugLineNum = 92;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 94;BA.debugLine="Dim xui As XUI";
parent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 95;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 97;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 98;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 100;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese correo del cliente"));
 //BA.debugLineNum = 101;BA.debugLine="InputTemplate.Text = Para";
_inputtemplate._text /*String*/  = _para;
 //BA.debugLineNum = 103;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 104;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 105;BA.debugLine="Try";
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
 //BA.debugLineNum = 106;BA.debugLine="Para = InputTemplate.Text.Trim";
_para = _inputtemplate._text /*String*/ .trim();
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 //BA.debugLineNum = 108;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("78192022",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 109;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 110;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(parent.__c.LastException(ba).getObject()),"Ok","","",_bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 111;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 31;
return;
case 31:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 112;BA.debugLine="Para = \"Error\"";
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
 //BA.debugLineNum = 115;BA.debugLine="Para = \"Cancelar\"";
_para = "Cancelar";
 if (true) break;
;
 //BA.debugLineNum = 118;BA.debugLine="If Para = \"Cancelar\" Then";

case 12:
//if
this.state = 15;
if ((_para).equals("Cancelar")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 119;BA.debugLine="Return Para";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_para));return;};
 if (true) break;
;
 //BA.debugLineNum = 122;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";

case 15:
//if
this.state = 18;
if (parent._funciones._fx_isemail /*boolean*/ (ba,_para)==parent.__c.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 124;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 125;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 126;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 32;
return;
case 32:
//C
this.state = 18;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 128;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Koen,Suen,P";
parent.__c.WaitFor("complete", ba, this, parent._sb_ingresar_correo_validar(_koen,_suen,_para,_campoemail,_editarmaeen));
this.state = 33;
return;
case 33:
//C
this.state = 18;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 130;BA.debugLine="Para = Resultado";
_para = _resultado;
 if (true) break;
;
 //BA.debugLineNum = 134;BA.debugLine="If Para <> \"Cancelar\" Then";

case 18:
//if
this.state = 29;
if ((_para).equals("Cancelar") == false) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 136;BA.debugLine="If EditarMaeen Then";
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
 //BA.debugLineNum = 137;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
_bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 138;BA.debugLine="Wait For (Fx_ActualizarCorreoEntidad(Koen,Suen,";
parent.__c.WaitFor("complete", ba, this, parent._fx_actualizarcorreoentidad(_koen,_suen,_para,_campoemail));
this.state = 34;
return;
case 34:
//C
this.state = 24;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 139;BA.debugLine="If Res Then";
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
 //BA.debugLineNum = 140;BA.debugLine="Msgbox2Async(\"Correo actualizado en la ficha d";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Correo actualizado en la ficha del cliente"),BA.ObjectToCharSequence("Información"),"Ok","","",_bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 141;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 35;
return;
case 35:
//C
this.state = 27;
_result = (Integer) result[0];
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
 //BA.debugLineNum = 147;BA.debugLine="Return Para";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_para));return;};
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisarformatos() throws Exception{
ResumableSub_Sb_RevisarFormatos rsub = new ResumableSub_Sb_RevisarFormatos(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_RevisarFormatos extends BA.ResumableSub {
public ResumableSub_Sb_RevisarFormatos(BaKapp.Movil.Tag.clfunciones2 parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.clfunciones2 parent;
boolean _resultado = false;

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
 //BA.debugLineNum = 228;BA.debugLine="Wait For(Fx_RevisarFormato(\"COV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, this, parent._fx_revisarformato("COV"));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 229;BA.debugLine="If Not(Resultado) Then";
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
 //BA.debugLineNum = 230;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 233;BA.debugLine="Wait For(Fx_RevisarFormato(\"NVV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, this, parent._fx_revisarformato("NVV"));
this.state = 18;
return;
case 18:
//C
this.state = 5;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 234;BA.debugLine="If Not(Resultado) Then";
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
 //BA.debugLineNum = 235;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 238;BA.debugLine="Wait For(Fx_RevisarFormato(\"BLV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, this, parent._fx_revisarformato("BLV"));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 239;BA.debugLine="If Not(Resultado) Then";
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
 //BA.debugLineNum = 240;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 243;BA.debugLine="Wait For(Fx_RevisarFormato(\"FCV\")) Complete (Resu";
parent.__c.WaitFor("complete", ba, this, parent._fx_revisarformato("FCV"));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 244;BA.debugLine="If Not(Resultado) Then";
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
 //BA.debugLineNum = 245;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 248;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
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
