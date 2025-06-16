package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class conectar_conf extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.conectar_conf");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.conectar_conf.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _consulta_sql = "";
public String _verror = "";
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public String _estado = "";
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
 //BA.debugLineNum = 2;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 3;BA.debugLine="Dim vError As String";
_verror = "";
 //BA.debugLineNum = 4;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public Estado As String";
_estado = "";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_configuracion_estacion() throws Exception{
ResumableSub_Fx_Cargar_Configuracion_Estacion rsub = new ResumableSub_Fx_Cargar_Configuracion_Estacion(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Configuracion_Estacion extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Configuracion_Estacion(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
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
 //BA.debugLineNum = 48;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 52;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
parent._consulta_sql = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_EstacionesBkp Where NombreEquipo = '"+parent._variables._global_iddispositivo /*String*/ +"' And TipoEstacion = 'B4A'";
 //BA.debugLineNum = 54;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 55;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 57;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 59;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 60;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 62;BA.debugLine="Log(\"2.- Una vez que ya tenemos el nombre carga";
parent.__c.LogImpl("28781840","2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp",0);
 //BA.debugLineNum = 63;BA.debugLine="Variables.Global_Row_EstacionBk = Funciones.Fx_";
parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 64;BA.debugLine="Log(\"Configuracion_Estacion_Cargada\")";
parent.__c.LogImpl("28781842","Configuracion_Estacion_Cargada",0);
 //BA.debugLineNum = 65;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 71;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_configuracion_estacion_y_general(String _empresa,String _modalidad) throws Exception{
ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General rsub = new ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General(this,_empresa,_modalidad);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General(BaKapp.Movil.Tag.conectar_conf parent,String _empresa,String _modalidad) {
this.parent = parent;
this._empresa = _empresa;
this._modalidad = _modalidad;
}
BaKapp.Movil.Tag.conectar_conf parent;
String _empresa;
String _modalidad;
int _resultado = 0;
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
 //BA.debugLineNum = 140;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 144;BA.debugLine="Consulta_Sql = \"Select Top 1 *,Getdate() As Fecha";
parent._consulta_sql = "Select Top 1 *,Getdate() As Fecha_Servidor From CONFIEST"+parent.__c.CRLF+"Inner Join "+parent._variables._global_basebk /*String*/ +"Zw_Configuracion On Empresa = EMPRESA And Modalidad = '"+_modalidad+"'"+parent.__c.CRLF+"Where EMPRESA = '"+_empresa+"' And MODALIDAD = '"+_modalidad+"'";
 //BA.debugLineNum = 148;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 149;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 151;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 24;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 153;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 155;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 21;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 157;BA.debugLine="Log(\"6.- Cargamos la configuración por Estación";
parent.__c.LogImpl("28978451","6.- Cargamos la configuración por Estación CONFIEST",0);
 //BA.debugLineNum = 159;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = F";
parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 161;BA.debugLine="Variables.Gl_Modalidad = Modalidad";
parent._variables._gl_modalidad /*String*/  = _modalidad;
 //BA.debugLineNum = 162;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Con";
parent._variables._gl_empresa /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
 //BA.debugLineNum = 163;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Co";
parent._variables._gl_sucursal /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
 //BA.debugLineNum = 164;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Conf";
parent._variables._gl_bodega /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
 //BA.debugLineNum = 165;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Config";
parent._variables._gl_caja /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ECAJA")));
 //BA.debugLineNum = 166;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid(Var";
parent._variables._gl_lista_precios /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTAVEN"))),(int) (6),(int) (3));
 //BA.debugLineNum = 167;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(Varia";
parent._variables._gl_lista_costos /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTACOM"))),(int) (6),(int) (3));
 //BA.debugLineNum = 168;BA.debugLine="Variables.Gl_Fecha_Servidor = Funciones.Mid(Var";
parent._variables._gl_fecha_servidor /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Fecha_Servidor"))),(int) (1),(int) (10));
 //BA.debugLineNum = 172;BA.debugLine="Consulta_Sql = \"Select\" & CRLF & _ 						    \"E";
parent._consulta_sql = "Select"+parent.__c.CRLF+"Empresa,Pr_AutoPr_Crear_Codigo_Principal_Automatico, Pr_AutoPr_Correlativo_Por_Iniciales, Pr_AutoPr_Correlativo_General,"+parent.__c.CRLF+"Pr_AutoPr_Tablas_Para_Iniciales_Cod_Automatico, Pr_AutoPr_Max_Cant_Caracteres_Del_Codigo, Pr_AutoPr_Ultimo_Codigo_Creado_Correlativo_General,"+parent.__c.CRLF+"Pr_Desc_Producto_Solo_Mayusculas, Pr_Creacion_Exigir_Precio, Pr_Creacion_Exigir_Clasificacion_busqueda, Pr_Creacion_Exigir_Codigo_Alternativo,"+parent.__c.CRLF+"Tbl_Ranking, Revisa_Taza_Cambio, Revisar_Taza_Solo_Mon_Extranjeras, Vnta_Dias_Venci_Coti, Vnta_TipoValor_Bruto_Neto, Vnta_EntidadXdefecto,"+parent.__c.CRLF+"Vnta_SucEntXdefecto, Vnta_Producto_NoCreado, Vnta_Preguntar_Documento, SOC_CodTurno, SOC_Buscar_Producto, SOC_Aprueba_Solo_G1,"+parent.__c.CRLF+"SOC_Aprueba_G1_y_G2, SOC_Prod_Crea_Solo_Marcas_Proveedor, SOC_Prod_Crea_Max_Carac_Nom, SOC_Valor_1ra_Aprobacion, SOC_Dias_Apela,"+parent.__c.CRLF+"SOC_Tipo_Creacion_Producto_Normal_Matriz, Precio_Costos_Desde, Precios_Venta_Desde_Random, Precios_Venta_Desde_BakApp,"+parent.__c.CRLF+"Vnta_Redondear_Dscto_Cero, Nodo_Raiz_Asociados, Vnta_Ofrecer_Otras_Bod_Stock_Insuficiente, Conservar_Responzable_Doc_Relacionado,"+parent.__c.CRLF+"Preguntar_Si_Cambia_Responsable_Doc_Relacionado, ServTecnico_Empresa, ServTecnico_Sucursal, ServTecnico_Bodega"+parent.__c.CRLF+"From "+parent._variables._global_basebk /*String*/ +"Zw_Configuracion"+parent.__c.CRLF+"Where Modalidad_General = 1";
 //BA.debugLineNum = 185;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 187;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 26;
return;
case 26:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 189;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 191;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 193;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 195;BA.debugLine="Log(\"7.- Cargamos la configuración General\")";
parent.__c.LogImpl("28978489","7.- Cargamos la configuración General",0);
 //BA.debugLineNum = 196;BA.debugLine="Log(\"Fecha servidor: \" & Variables.Gl_Fecha_S";
parent.__c.LogImpl("28978490","Fecha servidor: "+parent._variables._gl_fecha_servidor /*String*/ ,0);
 //BA.debugLineNum = 198;BA.debugLine="Variables.Global_Row_Configuracion_General =";
parent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 199;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 202;BA.debugLine="Variables.Global_Row_Configuracion_General =";
parent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 206;BA.debugLine="Log(\"Error al cargar Configuracion General\")";
parent.__c.LogImpl("28978500","Error al cargar Configuracion General",0);
 //BA.debugLineNum = 207;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("28978501",_js._errormessage /*String*/ ,0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 211;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = N";
parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 215;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("28978509",_js._errormessage /*String*/ ,0);
 if (true) break;

case 24:
//C
this.state = -1;
;
 //BA.debugLineNum = 218;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_listas_precios_por_usuario(String _usuario_x_defecto) throws Exception{
ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario rsub = new ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario(this,_usuario_x_defecto);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario(BaKapp.Movil.Tag.conectar_conf parent,String _usuario_x_defecto) {
this.parent = parent;
this._usuario_x_defecto = _usuario_x_defecto;
}
BaKapp.Movil.Tag.conectar_conf parent;
String _usuario_x_defecto;
int _resultado = 0;
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
 //BA.debugLineNum = 108;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 112;BA.debugLine="Consulta_Sql = \"Select KOLT As Kolt,KOLT+'-'+NOKO";
parent._consulta_sql = "Select KOLT As Kolt,KOLT+'-'+NOKOLT As Nokolt From TABPP"+parent.__c.CRLF+"Where KOLT In (Select SUBSTRING(KOOP,4,3)"+parent.__c.CRLF+"From MAEUS Where KOUS = '"+_usuario_x_defecto+"' And KOOP LIKE 'LI-%') And TILT = 'P'"+parent.__c.CRLF+"Order By Nokolt";
 //BA.debugLineNum = 117;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 118;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 120;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 122;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 123;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 125;BA.debugLine="Log(\"5.- Traemos la lista de precios asociadas";
parent.__c.LogImpl("28912915","5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar",0);
 //BA.debugLineNum = 126;BA.debugLine="Variables.Global_Listas_Precios_Usuario = Funci";
parent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
 //BA.debugLineNum = 127;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 134;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_sis_despachosimple_docdestino() throws Exception{
ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
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
 //BA.debugLineNum = 430;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 434;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
parent._consulta_sql = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_DOCDESTINO'";
 //BA.debugLineNum = 436;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 437;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 439;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 441;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 442;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 444;BA.debugLine="Log(\"Traemos la lista de tipos de documentos pa";
parent.__c.LogImpl("29240592","Traemos la lista de tipos de documentos para despacho simple",0);
 //BA.debugLineNum = 445;BA.debugLine="Variables.Global_Sis_DespachoSimple_DocDestino";
parent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
 //BA.debugLineNum = 446;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 452;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 454;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_sis_despachosimple_tipo() throws Exception{
ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
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
 //BA.debugLineNum = 458;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 462;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
parent._consulta_sql = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPO'";
 //BA.debugLineNum = 464;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 465;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 467;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 469;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 470;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 472;BA.debugLine="Log(\"Traemos la lista de tipos de despacho o re";
parent.__c.LogImpl("29306128","Traemos la lista de tipos de despacho o retiro",0);
 //BA.debugLineNum = 473;BA.debugLine="Variables.Global_Sis_DespachoSimple_Tipo = Func";
parent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
 //BA.debugLineNum = 474;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 480;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_sis_despachosimple_tipopago() throws Exception{
ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
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
 //BA.debugLineNum = 486;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 490;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
parent._consulta_sql = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPOPAGO'";
 //BA.debugLineNum = 492;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 493;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 495;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 497;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 498;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 500;BA.debugLine="Log(\"Traemos la lista de tipos de pago\")";
parent.__c.LogImpl("29371664","Traemos la lista de tipos de pago",0);
 //BA.debugLineNum = 501;BA.debugLine="Variables.Global_Sis_DespachoSimple_TipoPago =";
parent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
 //BA.debugLineNum = 502;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 508;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_traer_nombre_base_de_datos() throws Exception{
ResumableSub_Fx_Traer_Nombre_Base_De_Datos rsub = new ResumableSub_Fx_Traer_Nombre_Base_De_Datos(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Traer_Nombre_Base_De_Datos extends BA.ResumableSub {
public ResumableSub_Fx_Traer_Nombre_Base_De_Datos(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;

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
 //BA.debugLineNum = 18;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 23;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo.'";
parent._consulta_sql = "Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'";
 //BA.debugLineNum = 25;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 26;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 28;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 30;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 31;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 33;BA.debugLine="Log(\"1.- Obtenemos primero el nombre de la base";
parent.__c.LogImpl("28716305","1.- Obtenemos primero el nombre de la base de datos de Bakapp",0);
 //BA.debugLineNum = 34;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 35;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Base";
parent._variables._global_basebk /*String*/  = BA.ObjectToString(_fila.Get((Object)("Global_BaseBk")));
 //BA.debugLineNum = 36;BA.debugLine="Log(\"DB BakApp: \" & Variables.Global_BaseBk)";
parent.__c.LogImpl("28716308","DB BakApp: "+parent._variables._global_basebk /*String*/ ,0);
 //BA.debugLineNum = 37;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 42;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_traer_usuario_por_defecto(String _usuario_x_defecto) throws Exception{
ResumableSub_Fx_Traer_Usuario_Por_Defecto rsub = new ResumableSub_Fx_Traer_Usuario_Por_Defecto(this,_usuario_x_defecto);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Traer_Usuario_Por_Defecto extends BA.ResumableSub {
public ResumableSub_Fx_Traer_Usuario_Por_Defecto(BaKapp.Movil.Tag.conectar_conf parent,String _usuario_x_defecto) {
this.parent = parent;
this._usuario_x_defecto = _usuario_x_defecto;
}
BaKapp.Movil.Tag.conectar_conf parent;
String _usuario_x_defecto;
int _resultado = 0;
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
 //BA.debugLineNum = 77;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
 //BA.debugLineNum = 82;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where K";
parent._consulta_sql = "Select Top 1 * From TABFU Where KOFU = '"+_usuario_x_defecto+"'";
 //BA.debugLineNum = 84;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 85;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 87;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 89;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 91;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 93;BA.debugLine="Log(\"4.- Cargamos al usuario por defecto y lo t";
parent.__c.LogImpl("28847378","4.- Cargamos al usuario por defecto y lo traemos",0);
 //BA.debugLineNum = 94;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 95;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
 //BA.debugLineNum = 102;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_datos_de_configuracion() throws Exception{
ResumableSub_Sb_Cargar_Datos_De_Configuracion rsub = new ResumableSub_Sb_Cargar_Datos_De_Configuracion(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Cargar_Datos_De_Configuracion extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Datos_De_Configuracion(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
int _result = 0;
boolean _usar_datos_x_defecto = false;
String _empresa_x_defecto = "";
String _usuario_x_defecto = "";
String _modalidad_x_defecto = "";
boolean _resulttmp = false;
BaKapp.Movil.Tag.clfunciones _clfx = null;

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
 //BA.debugLineNum = 224;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 225;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 228;BA.debugLine="Wait For(Fx_Traer_Nombre_Base_De_Datos) Complete";
parent.__c.WaitFor("complete", ba, this, parent._fx_traer_nombre_base_de_datos());
this.state = 33;
return;
case 33:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 230;BA.debugLine="If Result = 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 231;BA.debugLine="Msgbox2Async(\"Falta la configuración de la Base";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración de la Base de datos Bakapp en TABCARAC"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.True);
 //BA.debugLineNum = 232;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 236;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion) Comple";
parent.__c.WaitFor("complete", ba, this, parent._fx_cargar_configuracion_estacion());
this.state = 34;
return;
case 34:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 238;BA.debugLine="If Result = 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 239;BA.debugLine="Msgbox2Async(\"El dispositivo no esta registrado";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El dispositivo no esta registrado en la base de datos"+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 241;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 35;
return;
case 35:
//C
this.state = 8;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 242;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 246;BA.debugLine="Log(\"3.- Iniciamos la sesion\")";
parent.__c.LogImpl("29043992","3.- Iniciamos la sesion",0);
 //BA.debugLineNum = 248;BA.debugLine="Variables.Global_Sesion_Star = True";
parent._variables._global_sesion_star /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 250;BA.debugLine="Dim Usar_Datos_X_Defecto As Boolean = Variables.G";
_usar_datos_x_defecto = BA.ObjectToBoolean(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Usar_Datos_X_Defecto")));
 //BA.debugLineNum = 251;BA.debugLine="Dim Empresa_X_Defecto As String = Variables.Globa";
_empresa_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Empresa_X_Defecto")));
 //BA.debugLineNum = 252;BA.debugLine="Dim Usuario_X_Defecto As String = Funciones.LTrim";
_usuario_x_defecto = parent._funciones._ltrim /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Usuario_X_Defecto"))));
 //BA.debugLineNum = 253;BA.debugLine="Dim Modalidad_X_Defecto As String= Variables.Glob";
_modalidad_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Modalidad_X_Defecto")));
 //BA.debugLineNum = 255;BA.debugLine="If Usuario_X_Defecto = \"\" Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_usuario_x_defecto).equals("")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 256;BA.debugLine="Msgbox2Async(\"Falta el usuario por defecto\"  & C";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Falta el usuario por defecto"+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 258;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 36;
return;
case 36:
//C
this.state = 12;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 259;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 263;BA.debugLine="Wait For(Fx_Traer_Usuario_Por_Defecto(Usuario_X_D";
parent.__c.WaitFor("complete", ba, this, parent._fx_traer_usuario_por_defecto(_usuario_x_defecto));
this.state = 37;
return;
case 37:
//C
this.state = 13;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 265;BA.debugLine="If Result = 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_result==0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 266;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 267;BA.debugLine="Msgbox2Async(\"El usuario no existe.\"  & CRLF & _";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El usuario no existe."+parent.__c.CRLF+"Usuario: "+_usuario_x_defecto),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 269;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 38;
return;
case 38:
//C
this.state = 16;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 270;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 274;BA.debugLine="Wait For(Fx_Cargar_Listas_Precios_Por_Usuario(Usu";
parent.__c.WaitFor("complete", ba, this, parent._fx_cargar_listas_precios_por_usuario(_usuario_x_defecto));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 276;BA.debugLine="If Result = 0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_result==0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 277;BA.debugLine="Msgbox2Async(\"El usuario no posee permisos para";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El usuario no posee permisos para ninguna lista de precios en Random."+parent.__c.CRLF+"Usuario: "+_usuario_x_defecto),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 279;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 40;
return;
case 40:
//C
this.state = 20;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 280;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 284;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion_Y_Gener";
parent.__c.WaitFor("complete", ba, this, parent._fx_cargar_configuracion_estacion_y_general(_empresa_x_defecto,_modalidad_x_defecto));
this.state = 41;
return;
case 41:
//C
this.state = 21;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 286;BA.debugLine="If Result = 0 Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_result==0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 287;BA.debugLine="Msgbox2Async(\"No se reconoce la modalidad para e";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la modalidad para el dispositivo. Modalidad:"+_modalidad_x_defecto+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 289;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 42;
return;
case 42:
//C
this.state = 24;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 290;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 24:
//C
this.state = 25;
;
 //BA.debugLineNum = 295;BA.debugLine="Wait For(Sb_Cargar_Modedas) Complete (Result As I";
parent.__c.WaitFor("complete", ba, this, parent._sb_cargar_modedas());
this.state = 43;
return;
case 43:
//C
this.state = 25;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 297;BA.debugLine="If Result = 0 Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_result==0) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 301;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 305;BA.debugLine="Wait For(Sb_Revisar_Carptea_Tmp_Servidor) Complet";
parent.__c.WaitFor("complete", ba, this, parent._sb_revisar_carptea_tmp_servidor());
this.state = 44;
return;
case 44:
//C
this.state = 29;
_resulttmp = (Boolean) result[0];
;
 //BA.debugLineNum = 307;BA.debugLine="If Not(ResultTmp) Then";
if (true) break;

case 29:
//if
this.state = 32;
if (parent.__c.Not(_resulttmp)) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 308;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 309;BA.debugLine="Msgbox2Async(vError, \"Validación\", \"Ok\", \"\", \"\",";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(parent._verror),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 310;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 45;
return;
case 45:
//C
this.state = 32;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 311;BA.debugLine="Return 2";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(2));return;};
 if (true) break;

case 32:
//C
this.state = -1;
;
 //BA.debugLineNum = 314;BA.debugLine="Dim CLFx As ClFunciones";
_clfx = new BaKapp.Movil.Tag.clfunciones();
 //BA.debugLineNum = 315;BA.debugLine="CLFx.Initialize";
_clfx._initialize /*String*/ (ba);
 //BA.debugLineNum = 317;BA.debugLine="Wait For(CLFx.Sb_ExisteTabla(\"@WMS_GATEWAY_STOCK\"";
parent.__c.WaitFor("complete", ba, this, _clfx._sb_existetabla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("@WMS_GATEWAY_STOCK"));
this.state = 46;
return;
case 46:
//C
this.state = -1;
_resulttmp = (Boolean) result[0];
;
 //BA.debugLineNum = 318;BA.debugLine="Variables.Global_ExisteTabla_MS_GATEWAY_STOCK = R";
parent._variables._global_existetabla_ms_gateway_stock /*boolean*/  = _resulttmp;
 //BA.debugLineNum = 321;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_DocDestino)";
parent.__c.WaitFor("complete", ba, this, parent._fx_cargar_sis_despachosimple_docdestino());
this.state = 47;
return;
case 47:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 322;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_Tipo) Compl";
parent.__c.WaitFor("complete", ba, this, parent._fx_cargar_sis_despachosimple_tipo());
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 323;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_TipoPago) C";
parent.__c.WaitFor("complete", ba, this, parent._fx_cargar_sis_despachosimple_tipopago());
this.state = 49;
return;
case 49:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 325;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public void  _msgbox_result(int _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_modedas() throws Exception{
ResumableSub_Sb_Cargar_Modedas rsub = new ResumableSub_Sb_Cargar_Modedas(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Cargar_Modedas extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Modedas(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
int _result = 0;

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
 //BA.debugLineNum = 331;BA.debugLine="Dim Consulta_Sql As String";
parent._consulta_sql = "";
 //BA.debugLineNum = 333;BA.debugLine="Consulta_Sql = \"Select TOP 1 * From TABMO Where K";
parent._consulta_sql = "Select TOP 1 * From TABMO Where KOMO = '$'";
 //BA.debugLineNum = 335;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 336;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 340;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 342;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 344;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 346;BA.debugLine="Variables.Global_Row_Moneda = Funciones.Fx_Data";
parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 348;BA.debugLine="Consulta_Sql = \"Select TOP 1 * From MAEMO Where";
parent._consulta_sql = "Select TOP 1 * From MAEMO Where KOMO = 'US$' AND FEMO = '20200110' Order by IDMAEMO DESC";
 //BA.debugLineNum = 350;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 351;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 22;
return;
case 22:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 353;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 355;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 357;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 359;BA.debugLine="Variables.Global_Row_Dolar = Funciones.Fx_Dat";
parent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 361;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 369;BA.debugLine="Dim bmp1 As Bitmap";
parent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 371;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 373;BA.debugLine="Msgbox2Async(\"No existe tasa de cambio del dol";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("No existe tasa de cambio del dolar del hoy"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 374;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 23;
return;
case 23:
//C
this.state = 16;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 375;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("29109550",_js._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 385;BA.debugLine="Dim bmp1 As Bitmap";
parent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 387;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent._bmp1 = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 389;BA.debugLine="Msgbox2Async(\"Error al buscar la moneda $\", \"Val";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar la moneda $"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent._bmp1,ba,parent.__c.False);
 //BA.debugLineNum = 390;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 24;
return;
case 24:
//C
this.state = 20;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 391;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("29109566",_js._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 395;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _sb_probar_conexion() throws Exception{
ResumableSub_Sb_Probar_Conexion rsub = new ResumableSub_Sb_Probar_Conexion(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Sb_Probar_Conexion extends BA.ResumableSub {
public ResumableSub_Sb_Probar_Conexion(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 514;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIES";
parent._consulta_sql = "Select Top 1 EMPRESA From CONFIES";
 //BA.debugLineNum = 516;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 517;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 519;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 521;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 522;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 523;BA.debugLine="Estado = \"Conectado\"";
parent._estado = "Conectado";
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 526;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 //BA.debugLineNum = 527;BA.debugLine="Estado = \"Desconectado\"";
parent._estado = "Desconectado";
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisar_carptea_tmp_servidor() throws Exception{
ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor rsub = new ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor(BaKapp.Movil.Tag.conectar_conf parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.conectar_conf parent;
boolean _existeruta = false;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;

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
 //BA.debugLineNum = 401;BA.debugLine="Dim ExisteRuta As Boolean";
_existeruta = false;
 //BA.debugLineNum = 402;BA.debugLine="vError = \"\"";
parent._verror = "";
 //BA.debugLineNum = 404;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent._funciones._fx_httjob_ws_sb_revcarpetatmp /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent);
 //BA.debugLineNum = 405;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 408;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 410;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 412;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 414;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 415;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 417;BA.debugLine="ExisteRuta = Fila.Get(\"ExisteRuta\")";
_existeruta = BA.ObjectToBoolean(_fila.Get((Object)("ExisteRuta")));
 //BA.debugLineNum = 418;BA.debugLine="vError = Fila.Get(\"Error\")";
parent._verror = BA.ObjectToString(_fila.Get((Object)("Error")));
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
 //BA.debugLineNum = 424;BA.debugLine="Return ExisteRuta";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_existeruta));return;};
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
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
