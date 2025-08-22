
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

public class frm_infostockxprod implements IRemote{
	public static frm_infostockxprod mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_infostockxprod() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_infostockxprod"), "BaKapp.Movil.Tag.frm_infostockxprod");
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
		pcBA = new PCBA(this, frm_infostockxprod.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _msj = RemoteObject.declareNull("BaKapp.Movil.Tag.mensajes");
public static RemoteObject _codigo = RemoteObject.createImmutable("");
public static RemoteObject _descripcion = RemoteObject.createImmutable("");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _lbl_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_descripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _xclv_stokxbodega = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _lbl_bodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_infostock = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static BaKapp.Movil.Tag.main _main = null;
public static BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public static BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public static BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public static BaKapp.Movil.Tag.conf_local _conf_local = null;
public static BaKapp.Movil.Tag.dbutils _dbutils = null;
public static BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public static BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public static BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public static BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
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
		return new Object[] {"Activity",frm_infostockxprod.mostCurrent._activity,"bmp1",frm_infostockxprod.mostCurrent._bmp1,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"Codigo",frm_infostockxprod._codigo,"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"DateUtils",frm_infostockxprod.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"Descripcion",frm_infostockxprod._descripcion,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Lbl_Bodega",frm_infostockxprod.mostCurrent._lbl_bodega,"Lbl_Codigo",frm_infostockxprod.mostCurrent._lbl_codigo,"Lbl_Descripcion",frm_infostockxprod.mostCurrent._lbl_descripcion,"Lbl_InfoStock",frm_infostockxprod.mostCurrent._lbl_infostock,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"Msj",frm_infostockxprod._msj,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"Xclv_StokXbodega",frm_infostockxprod.mostCurrent._xclv_stokxbodega,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}