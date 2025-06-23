package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cl_conf_local extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.cl_conf_local");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.cl_conf_local.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _consulta_sql = "";
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisar_webservice() throws Exception{
ResumableSub_Sb_Revisar_WebService rsub = new ResumableSub_Sb_Revisar_WebService(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Revisar_WebService extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_WebService(BaKapp.Movil.Tag.cl_conf_local parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.cl_conf_local parent;
boolean _exite_ip_webservice = false;
int _existe = 0;
anywheresoftware.b4a.objects.collections.Map _fila = null;

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
 //BA.debugLineNum = 14;BA.debugLine="Dim Exite_Ip_webservice As Boolean";
_exite_ip_webservice = false;
 //BA.debugLineNum = 16;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 17;BA.debugLine="Consulta_Sql = \"Select * From Conf_Local\"";
parent._consulta_sql = "Select * From Conf_Local";
 //BA.debugLineNum = 18;BA.debugLine="Dim Existe As Int = Variables.vSql.ExecQuerySing";
_existe = (int)(Double.parseDouble(parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("Select Count(*) From Conf_Local")));
 //BA.debugLineNum = 20;BA.debugLine="If Existe = 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_existe==0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 21;BA.debugLine="Consulta_Sql = \"Insert Into Conf_Local (Ip_WebS";
parent._consulta_sql = "Insert Into Conf_Local (Ip_WebService,IdDispositivo) Values ('...','"+parent._variables._global_iddispositivo /*String*/ +"')";
 //BA.debugLineNum = 22;BA.debugLine="Variables.vSql.ExecQuery(Consulta_Sql)";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(parent._consulta_sql);
 //BA.debugLineNum = 23;BA.debugLine="Exite_Ip_webservice = False";
_exite_ip_webservice = parent.__c.False;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 25;BA.debugLine="Exite_Ip_webservice = True";
_exite_ip_webservice = parent.__c.True;
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 28;BA.debugLine="Consulta_Sql = \"Select * From Conf_Local\"";
parent._consulta_sql = "Select * From Conf_Local";
 //BA.debugLineNum = 29;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Fila.Initialize";
_fila.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consult";
_fila = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 33;BA.debugLine="Variables.Global_Ip_WebService = Fila.Get(\"ip_we";
parent._variables._global_ip_webservice /*String*/  = BA.ObjectToString(_fila.Get((Object)("ip_webservice")));
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 35;BA.debugLine="Variables.Global_Ip_WebService = \"...\"";
parent._variables._global_ip_webservice /*String*/  = "...";
 //BA.debugLineNum = 36;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("21769496",BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 39;BA.debugLine="Return Exite_Ip_webservice";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_exite_ip_webservice));return;};
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
