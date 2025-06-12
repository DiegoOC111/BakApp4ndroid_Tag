package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clfunciones extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.clfunciones");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.clfunciones.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_existetabla(String _tabla) throws Exception{
ResumableSub_Sb_ExisteTabla rsub = new ResumableSub_Sb_ExisteTabla(this,_tabla);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_ExisteTabla extends BA.ResumableSub {
public ResumableSub_Sb_ExisteTabla(BaKapp.Movil.Tag.clfunciones parent,String _tabla) {
this.parent = parent;
this._tabla = _tabla;
}
BaKapp.Movil.Tag.clfunciones parent;
String _tabla;
String _consulta_sql = "";
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
 //BA.debugLineNum = 39;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 41;BA.debugLine="Consulta_Sql = \"Select Top 1 * From INFORMATION_S";
_consulta_sql = "Select Top 1 * From INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+_tabla+"'";
 //BA.debugLineNum = 43;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),_consulta_sql,parent);
 //BA.debugLineNum = 44;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 45;BA.debugLine="Log(\"Revisando la existencia de Tabla \" & Tabla)";
parent.__c.LogImpl("77798794","Revisando la existencia de Tabla "+_tabla,0);
 //BA.debugLineNum = 47;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 49;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 51;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 53;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 55;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 56;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 58;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
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
 //BA.debugLineNum = 65;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tienepermiso(String _codpermiso,String _codusuario) throws Exception{
ResumableSub_TienePermiso rsub = new ResumableSub_TienePermiso(this,_codpermiso,_codusuario);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TienePermiso extends BA.ResumableSub {
public ResumableSub_TienePermiso(BaKapp.Movil.Tag.clfunciones parent,String _codpermiso,String _codusuario) {
this.parent = parent;
this._codpermiso = _codpermiso;
this._codusuario = _codusuario;
}
BaKapp.Movil.Tag.clfunciones parent;
String _codpermiso;
String _codusuario;
String _consulta_sql = "";
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
 //BA.debugLineNum = 12;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 14;BA.debugLine="Consulta_Sql = \"Select Top 1 * From \" & Variables";
_consulta_sql = "Select Top 1 * From "+parent._variables._global_basebk /*String*/ +"ZW_PermisosVsUsuarios Where CodUsuario = '"+_codusuario+"' And CodPermiso = '"+_codpermiso+"'";
 //BA.debugLineNum = 16;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),_consulta_sql,parent);
 //BA.debugLineNum = 17;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 19;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 21;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 23;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 24;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 26;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
 //BA.debugLineNum = 31;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
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
