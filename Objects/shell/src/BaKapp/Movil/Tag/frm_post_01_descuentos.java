
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

public class frm_post_01_descuentos implements IRemote{
	public static frm_post_01_descuentos mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_post_01_descuentos() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_post_01_descuentos"), "BaKapp.Movil.Tag.frm_post_01_descuentos");
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
		pcBA = new PCBA(this, frm_post_01_descuentos.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id_docenc = RemoteObject.createImmutable(0);
public static RemoteObject _id_docdet = RemoteObject.createImmutable(0);
public static RemoteObject _total_linea_origen = RemoteObject.createImmutable(0);
public static RemoteObject _total_descuento = RemoteObject.createImmutable(0);
public static RemoteObject _total_pc = RemoteObject.createImmutable(0);
public static RemoteObject _nrodscto = RemoteObject.createImmutable(0);
public static RemoteObject _dscto_max = RemoteObject.createImmutable(0);
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _xclvdescuentos = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _btn_agregar_descuento = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_total_dscto_porc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_total_dscto_valor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_total_linea = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_volver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_id_docdsc = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_kodt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_podt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_vadt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _dsctos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _subtotal_linea = RemoteObject.createImmutable(0);
public static RemoteObject _nrodscto_max = RemoteObject.createImmutable(0);
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
public static BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public static BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public static BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public static BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public static BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public static BaKapp.Movil.Tag.funciones _funciones = null;
public static BaKapp.Movil.Tag.variables _variables = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",frm_post_01_descuentos.mostCurrent._activity,"bmp1",frm_post_01_descuentos.mostCurrent._bmp1,"Btn_Agregar_Descuento",frm_post_01_descuentos.mostCurrent._btn_agregar_descuento,"Btn_Volver",frm_post_01_descuentos.mostCurrent._btn_volver,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"Consulta_Sql",frm_post_01_descuentos.mostCurrent._consulta_sql,"DateUtils",frm_post_01_descuentos.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"Dscto_Max",frm_post_01_descuentos._dscto_max,"Dsctos",frm_post_01_descuentos.mostCurrent._dsctos,"Fila",frm_post_01_descuentos.mostCurrent._fila,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Id_DocDet",frm_post_01_descuentos._id_docdet,"Id_DocEnc",frm_post_01_descuentos._id_docenc,"Lbl_Id_DocDsc",frm_post_01_descuentos.mostCurrent._lbl_id_docdsc,"Lbl_Item",frm_post_01_descuentos.mostCurrent._lbl_item,"Lbl_Kodt",frm_post_01_descuentos.mostCurrent._lbl_kodt,"Lbl_Podt",frm_post_01_descuentos.mostCurrent._lbl_podt,"Lbl_Total_Dscto_Porc",frm_post_01_descuentos.mostCurrent._lbl_total_dscto_porc,"Lbl_Total_Dscto_Valor",frm_post_01_descuentos.mostCurrent._lbl_total_dscto_valor,"Lbl_Total_Linea",frm_post_01_descuentos.mostCurrent._lbl_total_linea,"Lbl_Vadt",frm_post_01_descuentos.mostCurrent._lbl_vadt,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"NroDscto",frm_post_01_descuentos._nrodscto,"NroDscto_Max",frm_post_01_descuentos._nrodscto_max,"SubTotal_Linea",frm_post_01_descuentos._subtotal_linea,"Total_Descuento",frm_post_01_descuentos._total_descuento,"Total_Linea_Origen",frm_post_01_descuentos._total_linea_origen,"Total_Pc",frm_post_01_descuentos._total_pc,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"XclvDescuentos",frm_post_01_descuentos.mostCurrent._xclvdescuentos,"xui",frm_post_01_descuentos.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}