
package BaKapp.Movil.Tag;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class variables implements IRemote{
	public static variables mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public variables() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, variables.class);
    static {
		mostCurrent = new variables();
        remoteMe = RemoteObject.declareNull("BaKapp.Movil.Tag.variables");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("variables"), "BaKapp.Movil.Tag.variables");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("BaKapp.Movil.Tag.variables"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _global_row_usuario_activo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_row_estacionbk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_row_modalidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_row_configuracion_general = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_row_configuracion_estacion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_row_dolar = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_row_moneda = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_version_bakapp = RemoteObject.createImmutable("");
public static RemoteObject _global_basebk = RemoteObject.createImmutable("");
public static RemoteObject _global_ip_webservice = RemoteObject.createImmutable("");
public static RemoteObject _global_sesion_star = RemoteObject.createImmutable(false);
public static RemoteObject _global_iddispositivo = RemoteObject.createImmutable("");
public static RemoteObject _gl_empresa = RemoteObject.createImmutable("");
public static RemoteObject _gl_modalidad = RemoteObject.createImmutable("");
public static RemoteObject _gl_sucursal = RemoteObject.createImmutable("");
public static RemoteObject _gl_bodega = RemoteObject.createImmutable("");
public static RemoteObject _gl_caja = RemoteObject.createImmutable("");
public static RemoteObject _gl_lista_precios = RemoteObject.createImmutable("");
public static RemoteObject _gl_lista_costos = RemoteObject.createImmutable("");
public static RemoteObject _gl_fecha_servidor = RemoteObject.createImmutable("");
public static RemoteObject _gl_nombreempresa = RemoteObject.createImmutable("");
public static RemoteObject _global_listas_precios_usuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _global_row_entidad_x_defecto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _vsql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _global_existetabla_ms_gateway_stock = RemoteObject.createImmutable(false);
public static RemoteObject _global_cov = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_nvv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_blv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_fcv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _global_sis_despachosimple_docdestino = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _global_sis_despachosimple_tipo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _global_sis_despachosimple_tipopago = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static BaKapp.Movil.Tag.main _main = null;
public static BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public static BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public static BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public static BaKapp.Movil.Tag.funciones _funciones = null;
public static BaKapp.Movil.Tag.conf_local _conf_local = null;
public static BaKapp.Movil.Tag.dbutils _dbutils = null;
public static BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public static BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public static BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public static BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public static BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public static BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public static BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public static BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public static BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public static BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"DateUtils",variables.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"Gl_Bodega",variables._gl_bodega,"Gl_Caja",variables._gl_caja,"Gl_Empresa",variables._gl_empresa,"Gl_Fecha_Servidor",variables._gl_fecha_servidor,"Gl_Lista_Costos",variables._gl_lista_costos,"Gl_Lista_Precios",variables._gl_lista_precios,"Gl_Modalidad",variables._gl_modalidad,"GL_NombreEmpresa",variables._gl_nombreempresa,"Gl_Sucursal",variables._gl_sucursal,"Global_BaseBk",variables._global_basebk,"Global_BLV",variables._global_blv,"Global_COV",variables._global_cov,"Global_ExisteTabla_MS_GATEWAY_STOCK",variables._global_existetabla_ms_gateway_stock,"Global_FCV",variables._global_fcv,"Global_IdDispositivo",variables._global_iddispositivo,"Global_Ip_WebService",variables._global_ip_webservice,"Global_Listas_Precios_Usuario",variables._global_listas_precios_usuario,"Global_NVV",variables._global_nvv,"Global_Row_Configuracion_Estacion",variables._global_row_configuracion_estacion,"Global_Row_Configuracion_General",variables._global_row_configuracion_general,"Global_Row_Dolar",variables._global_row_dolar,"Global_Row_Entidad_X_Defecto",variables._global_row_entidad_x_defecto,"Global_Row_EstacionBk",variables._global_row_estacionbk,"Global_Row_Modalidad",variables._global_row_modalidad,"Global_Row_Moneda",variables._global_row_moneda,"Global_Row_Usuario_Activo",variables._global_row_usuario_activo,"Global_Sesion_Star",variables._global_sesion_star,"Global_Sis_DespachoSimple_DocDestino",variables._global_sis_despachosimple_docdestino,"Global_Sis_DespachoSimple_Tipo",variables._global_sis_despachosimple_tipo,"Global_Sis_DespachoSimple_TipoPago",variables._global_sis_despachosimple_tipopago,"Global_Version_BakApp",variables._global_version_bakapp,"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"vSql",variables._vsql,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}