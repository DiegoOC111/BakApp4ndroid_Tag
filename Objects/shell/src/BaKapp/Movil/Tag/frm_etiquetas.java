
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

public class frm_etiquetas implements IRemote{
	public static frm_etiquetas mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_etiquetas() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_etiquetas"), "BaKapp.Movil.Tag.frm_etiquetas");
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
		pcBA = new PCBA(this, frm_etiquetas.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _serial1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Serial");
public static RemoteObject _connectedprinter = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _astreams = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _stringprecio = RemoteObject.createImmutable("");
public static RemoteObject _etiquetas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _default = RemoteObject.createImmutable("");
public static RemoteObject _printermap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _printerlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _selectedprinterip = RemoteObject.createImmutable("");
public static RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _isenabled = RemoteObject.createImmutable(false);
public static RemoteObject _btn_conf = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_cerrar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _general = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_conf = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btn_etq1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_etq2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _img_venta = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img_bodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _btn_ed_nombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_ed_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_nombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _stringlistprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lbl_estado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_probar_conexion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_imprimir = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_ip = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _colorenabled = RemoteObject.createImmutable(0);
public static RemoteObject _colordisabled = RemoteObject.createImmutable(0);
public static RemoteObject _selectedprice = RemoteObject.createImmutable(0);
public static RemoteObject _btn_guardar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dataprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _btn_ed_precio = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _changes = RemoteObject.createImmutable(false);
public static RemoteObject _btn_volver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_precio_act = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_puerto = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_editarpuerto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
		return new Object[] {"Activity",frm_etiquetas.mostCurrent._activity,"AStreams",frm_etiquetas._astreams,"Btn_Cerrar",frm_etiquetas.mostCurrent._btn_cerrar,"Btn_Conf",frm_etiquetas.mostCurrent._btn_conf,"Btn_Ed_ID",frm_etiquetas.mostCurrent._btn_ed_id,"Btn_Ed_Nombre",frm_etiquetas.mostCurrent._btn_ed_nombre,"Btn_Ed_Precio",frm_etiquetas.mostCurrent._btn_ed_precio,"Btn_editarPuerto",frm_etiquetas.mostCurrent._btn_editarpuerto,"Btn_Etq1",frm_etiquetas.mostCurrent._btn_etq1,"Btn_Etq2",frm_etiquetas.mostCurrent._btn_etq2,"Btn_Guardar",frm_etiquetas.mostCurrent._btn_guardar,"Btn_Probar_Conexion",frm_etiquetas.mostCurrent._btn_probar_conexion,"Btn_Volver",frm_etiquetas.mostCurrent._btn_volver,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"Changes",frm_etiquetas._changes,"clv",frm_etiquetas.mostCurrent._clv,"ColorDisabled",frm_etiquetas._colordisabled,"ColorEnabled",frm_etiquetas._colorenabled,"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"ConnectedPrinter",frm_etiquetas._connectedprinter,"DataPrice",frm_etiquetas.mostCurrent._dataprice,"DateUtils",frm_etiquetas.mostCurrent._dateutils,"datos",frm_etiquetas.mostCurrent._datos,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"default",frm_etiquetas._default,"Etiquetas",frm_etiquetas._etiquetas,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"General",frm_etiquetas.mostCurrent._general,"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Img_bodega",frm_etiquetas.mostCurrent._img_bodega,"Img_Venta",frm_etiquetas.mostCurrent._img_venta,"IsEnabled",frm_etiquetas._isenabled,"Label5",frm_etiquetas.mostCurrent._label5,"Lbl_Estado",frm_etiquetas.mostCurrent._lbl_estado,"Lbl_Imprimir",frm_etiquetas.mostCurrent._lbl_imprimir,"Lbl_IP",frm_etiquetas.mostCurrent._lbl_ip,"Lbl_Nombre",frm_etiquetas.mostCurrent._lbl_nombre,"Lbl_precio_act",frm_etiquetas.mostCurrent._lbl_precio_act,"Lbl_puerto",frm_etiquetas.mostCurrent._lbl_puerto,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"Panel_Conf",frm_etiquetas.mostCurrent._panel_conf,"PrinterList",frm_etiquetas.mostCurrent._printerlist,"PrinterMap",frm_etiquetas.mostCurrent._printermap,"SelectedPrice",frm_etiquetas._selectedprice,"SelectedPrinterIP",frm_etiquetas.mostCurrent._selectedprinterip,"Serial1",frm_etiquetas._serial1,"stringListPrice",frm_etiquetas.mostCurrent._stringlistprice,"stringPrecio",frm_etiquetas._stringprecio,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"xui",frm_etiquetas.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}