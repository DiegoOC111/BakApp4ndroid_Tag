
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

public class frm_documentos_generados implements IRemote{
	public static frm_documentos_generados mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_documentos_generados() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_documentos_generados"), "BaKapp.Movil.Tag.frm_documentos_generados");
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
		pcBA = new PCBA(this, frm_documentos_generados.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _idmaeedo_sel = RemoteObject.createImmutable(0);
public static RemoteObject _tido_sel = RemoteObject.createImmutable("");
public static RemoteObject _nudo_sel = RemoteObject.createImmutable("");
public static RemoteObject _koen_sel = RemoteObject.createImmutable("");
public static RemoteObject _suen_sel = RemoteObject.createImmutable("");
public static RemoteObject _doc_seleccionado = RemoteObject.createImmutable(false);
public static RemoteObject _estado_sel = RemoteObject.createImmutable("");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _datetemplatedesde = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdatetemplate");
public static RemoteObject _datetemplatehasta = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdatetemplate");
public static RemoteObject _canttop = RemoteObject.createImmutable(0);
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _xclvdetalle = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _rdb_cov = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _rdb_nvv = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _btn_actualizar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_volver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _b4xloading = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xloadingindicator");
public static RemoteObject _lbl_tido = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_nudo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_koensuen = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_rut = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_razon_social = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_total = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_items = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_idmaeedo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btn_fecha_desde = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_fecha_hasta = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_feemdo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_estado = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _chk_solopendientes = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _txt_top = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbl_sucursal = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static BaKapp.Movil.Tag.main _main = null;
public static BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public static BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public static BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public static BaKapp.Movil.Tag.conf_local _conf_local = null;
public static BaKapp.Movil.Tag.dbutils _dbutils = null;
public static BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
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
		return new Object[] {"Activity",frm_documentos_generados.mostCurrent._activity,"B4XLoading",frm_documentos_generados.mostCurrent._b4xloading,"Base",frm_documentos_generados.mostCurrent._base,"Btn_Actualizar",frm_documentos_generados.mostCurrent._btn_actualizar,"Btn_Fecha_Desde",frm_documentos_generados.mostCurrent._btn_fecha_desde,"Btn_Fecha_Hasta",frm_documentos_generados.mostCurrent._btn_fecha_hasta,"Btn_Volver",frm_documentos_generados.mostCurrent._btn_volver,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"CantTop",frm_documentos_generados._canttop,"Chk_SoloPendientes",frm_documentos_generados.mostCurrent._chk_solopendientes,"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"Consulta_Sql",frm_documentos_generados.mostCurrent._consulta_sql,"DateTemplateDesde",frm_documentos_generados.mostCurrent._datetemplatedesde,"DateTemplateHasta",frm_documentos_generados.mostCurrent._datetemplatehasta,"DateUtils",frm_documentos_generados.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"Dialog",frm_documentos_generados.mostCurrent._dialog,"Doc_Seleccionado",frm_documentos_generados._doc_seleccionado,"Estado_Sel",frm_documentos_generados._estado_sel,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Idmaeedo_Sel",frm_documentos_generados._idmaeedo_sel,"Koen_Sel",frm_documentos_generados._koen_sel,"Lbl_Estado",frm_documentos_generados.mostCurrent._lbl_estado,"Lbl_Feemdo",frm_documentos_generados.mostCurrent._lbl_feemdo,"Lbl_Idmaeedo",frm_documentos_generados.mostCurrent._lbl_idmaeedo,"Lbl_Items",frm_documentos_generados.mostCurrent._lbl_items,"Lbl_KoenSuen",frm_documentos_generados.mostCurrent._lbl_koensuen,"Lbl_Nudo",frm_documentos_generados.mostCurrent._lbl_nudo,"Lbl_Razon_Social",frm_documentos_generados.mostCurrent._lbl_razon_social,"Lbl_Rut",frm_documentos_generados.mostCurrent._lbl_rut,"Lbl_Sucursal",frm_documentos_generados.mostCurrent._lbl_sucursal,"Lbl_Tido",frm_documentos_generados.mostCurrent._lbl_tido,"Lbl_Total",frm_documentos_generados.mostCurrent._lbl_total,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"Nudo_Sel",frm_documentos_generados._nudo_sel,"Rdb_COV",frm_documentos_generados.mostCurrent._rdb_cov,"Rdb_NVV",frm_documentos_generados.mostCurrent._rdb_nvv,"Suen_Sel",frm_documentos_generados._suen_sel,"Tido_Sel",frm_documentos_generados._tido_sel,"Txt_Top",frm_documentos_generados.mostCurrent._txt_top,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"XclvDetalle",frm_documentos_generados.mostCurrent._xclvdetalle,"XUI",frm_documentos_generados.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}