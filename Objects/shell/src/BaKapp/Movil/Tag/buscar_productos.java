
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

public class buscar_productos implements IRemote{
	public static buscar_productos mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public buscar_productos() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("buscar_productos"), "BaKapp.Movil.Tag.buscar_productos");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, buscar_productos.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _lista = RemoteObject.createImmutable("");
public static RemoteObject _productoabuscar = RemoteObject.createImmutable("");
public static RemoteObject _msj = RemoteObject.declareNull("BaKapp.Movil.Tag.mensajes");
public static RemoteObject _verstockotrasbodegas = RemoteObject.createImmutable(false);
public static RemoteObject _empresa = RemoteObject.createImmutable("");
public static RemoteObject _sucursal = RemoteObject.createImmutable("");
public static RemoteObject _bodega = RemoteObject.createImmutable("");
public static RemoteObject _txt_codigo_descripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn_buscar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _id_docenc = RemoteObject.createImmutable(0);
public static RemoteObject _tecladosoft = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _xclvdetalle = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _lbl_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_codtecnico = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_descripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btn_seleccionar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _img_eliminar = RemoteObject.declareNull("BaKapp.Movil.Tag.b4ximageview");
public static RemoteObject _b4xloading = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xloadingindicator");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static BaKapp.Movil.Tag.main _main = null;
public static BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public static BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
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
public static BaKapp.Movil.Tag.funciones _funciones = null;
public static BaKapp.Movil.Tag.variables _variables = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",buscar_productos.mostCurrent._activity,"B4XLoading",buscar_productos.mostCurrent._b4xloading,"Bodega",buscar_productos.mostCurrent._bodega,"Btn_Buscar",buscar_productos.mostCurrent._btn_buscar,"Btn_Seleccionar",buscar_productos.mostCurrent._btn_seleccionar,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"Consulta_Sql",buscar_productos._consulta_sql,"DateUtils",buscar_productos.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"Empresa",buscar_productos.mostCurrent._empresa,"Fila",buscar_productos._fila,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Id_DocEnc",buscar_productos._id_docenc,"Img_Eliminar",buscar_productos.mostCurrent._img_eliminar,"Lbl_Codigo",buscar_productos.mostCurrent._lbl_codigo,"Lbl_CodTecnico",buscar_productos.mostCurrent._lbl_codtecnico,"Lbl_Datos",buscar_productos.mostCurrent._lbl_datos,"Lbl_Descripcion",buscar_productos.mostCurrent._lbl_descripcion,"Lista",buscar_productos._lista,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"Msj",buscar_productos._msj,"ProductoABuscar",buscar_productos._productoabuscar,"Sucursal",buscar_productos.mostCurrent._sucursal,"TecladoSoft",buscar_productos.mostCurrent._tecladosoft,"Txt_Codigo_Descripcion",buscar_productos.mostCurrent._txt_codigo_descripcion,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"VerStockOtrasBodegas",buscar_productos._verstockotrasbodegas,"XclvDetalle",buscar_productos.mostCurrent._xclvdetalle,"xui",buscar_productos.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}