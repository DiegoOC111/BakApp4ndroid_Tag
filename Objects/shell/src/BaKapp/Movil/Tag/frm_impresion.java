
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

public class frm_impresion implements IRemote{
	public static frm_impresion mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_impresion() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_impresion"), "BaKapp.Movil.Tag.frm_impresion");
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
		pcBA = new PCBA(this, frm_impresion.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _datalist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dataprice = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _objselec = RemoteObject.declareNull("BaKapp.Movil.Tag.frm_impresion._otherdata");
public static RemoteObject _tip = RemoteObject.createImmutable("");
public static RemoteObject _ancho = RemoteObject.createImmutable(0f);
public static RemoteObject _ime1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _alto = RemoteObject.createImmutable(0f);
public static RemoteObject _btn_buscar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btn_buscarprod = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panel_buscador = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _yabusco = RemoteObject.createImmutable(false);
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _b4xcombobox1 = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xcombobox");
public static RemoteObject _btn_cerrarbuscador = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _selectedstring = RemoteObject.createImmutable("");
public static RemoteObject _txt_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbl_tipo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_desc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cantidad = RemoteObject.createImmutable(0);
public static RemoteObject _lbl_precio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_imprimir = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _serial1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Serial");
public static RemoteObject _connectedprinter = RemoteObject.declareNull("anywheresoftware.b4a.objects.SocketWrapper");
public static RemoteObject _printerip = RemoteObject.createImmutable("");
public static RemoteObject _printerport = RemoteObject.createImmutable(0);
public static RemoteObject _astreams = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.AsyncStreams");
public static RemoteObject _combo_impresion = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xcombobox");
public static RemoteObject _combo_tipobusqueda = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xcombobox");
public static RemoteObject _btn_volver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _selectedprice = RemoteObject.createImmutable(0);
public static RemoteObject _stringprecio1 = RemoteObject.createImmutable("");
public static RemoteObject _combo_precios = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xcombobox");
public static RemoteObject _panelvista = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _etiquetas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _etiqueta_zpl = RemoteObject.createImmutable("");
public static RemoteObject _b4xplusminus1 = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xplusminus");
public static RemoteObject _spinner_cant = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _btn_limpiar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static BaKapp.Movil.Tag.main _main = null;
public static BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public static BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
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
		return new Object[] {"Activity",frm_impresion.mostCurrent._activity,"Alto",frm_impresion._alto,"Ancho",frm_impresion._ancho,"AStreams",frm_impresion.mostCurrent._astreams,"B4XComboBox1",frm_impresion.mostCurrent._b4xcombobox1,"B4XPlusMinus1",frm_impresion.mostCurrent._b4xplusminus1,"Btn_Buscar",frm_impresion.mostCurrent._btn_buscar,"Btn_BuscarProd",frm_impresion.mostCurrent._btn_buscarprod,"Btn_CerrarBuscador",frm_impresion.mostCurrent._btn_cerrarbuscador,"Btn_imprimir",frm_impresion.mostCurrent._btn_imprimir,"Btn_limpiar",frm_impresion.mostCurrent._btn_limpiar,"Btn_Volver",frm_impresion.mostCurrent._btn_volver,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"cantidad",frm_impresion._cantidad,"Combo_Impresion",frm_impresion.mostCurrent._combo_impresion,"Combo_precios",frm_impresion.mostCurrent._combo_precios,"Combo_TipoBusqueda",frm_impresion.mostCurrent._combo_tipobusqueda,"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"ConnectedPrinter",frm_impresion.mostCurrent._connectedprinter,"DataList",frm_impresion._datalist,"DataPrice",frm_impresion._dataprice,"DateUtils",frm_impresion.mostCurrent._dateutils,"datos",frm_impresion.mostCurrent._datos,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"EditText1",frm_impresion.mostCurrent._edittext1,"etiqueta_ZPL",frm_impresion.mostCurrent._etiqueta_zpl,"Etiquetas",frm_impresion.mostCurrent._etiquetas,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"ImageView1",frm_impresion.mostCurrent._imageview1,"IME1",frm_impresion.mostCurrent._ime1,"Lbl_codigo",frm_impresion.mostCurrent._lbl_codigo,"Lbl_Desc",frm_impresion.mostCurrent._lbl_desc,"Lbl_precio",frm_impresion.mostCurrent._lbl_precio,"Lbl_tipo",frm_impresion.mostCurrent._lbl_tipo,"ListView1",frm_impresion.mostCurrent._listview1,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"ObjSelec",frm_impresion._objselec,"Panel_Buscador",frm_impresion.mostCurrent._panel_buscador,"Panelinfo",frm_impresion.mostCurrent._panelinfo,"PanelVista",frm_impresion.mostCurrent._panelvista,"PrinterIP",frm_impresion.mostCurrent._printerip,"PrinterPort",frm_impresion._printerport,"SelectedPrice",frm_impresion._selectedprice,"selectedString",frm_impresion.mostCurrent._selectedstring,"Serial1",frm_impresion.mostCurrent._serial1,"Spinner_cant",frm_impresion.mostCurrent._spinner_cant,"stringPrecio1",frm_impresion.mostCurrent._stringprecio1,"tip",frm_impresion.mostCurrent._tip,"Txt_codigo",frm_impresion.mostCurrent._txt_codigo,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"WebView1",frm_impresion.mostCurrent._webview1,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class),"YaBusco",frm_impresion._yabusco};
}
}