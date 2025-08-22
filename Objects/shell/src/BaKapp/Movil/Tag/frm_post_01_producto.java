
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

public class frm_post_01_producto implements IRemote{
	public static frm_post_01_producto mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_post_01_producto() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_post_01_producto"), "BaKapp.Movil.Tag.frm_post_01_producto");
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
		pcBA = new PCBA(this, frm_post_01_producto.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id_docdet = RemoteObject.createImmutable(0);
public static RemoteObject _editar = RemoteObject.createImmutable(false);
public static RemoteObject _modoconsulta = RemoteObject.createImmutable(false);
public static RemoteObject _msj = RemoteObject.declareNull("BaKapp.Movil.Tag.mensajes");
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txt_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbl_descripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_ubicacion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_stock = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txt_cantidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbl_precio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_descuento = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_total = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fila_enc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_dscto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _rowproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tbldescuentos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _procesar_dscto = RemoteObject.createImmutable(false);
public static RemoteObject _btn_aceptar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_eliminar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tecladosoft = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _totalnetodoc = RemoteObject.createImmutable(0);
public static RemoteObject _totalbrutodoc = RemoteObject.createImmutable(0);
public static RemoteObject _total_linea = RemoteObject.createImmutable(0);
public static RemoteObject _chkvalores = RemoteObject.createImmutable(false);
public static RemoteObject _funcionario = RemoteObject.createImmutable("");
public static RemoteObject _xclvdescuentos = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _lbl_kodt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_podt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_vadt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btn_editar_descuento = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_revisar_stock = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_ubicacion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbl_modoconsulta = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_bodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_listaprecio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_editar_precio = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _cl_permisox = RemoteObject.declareNull("BaKapp.Movil.Tag.cl_permisoxui");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
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
public static BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public static BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public static BaKapp.Movil.Tag.funciones _funciones = null;
public static BaKapp.Movil.Tag.variables _variables = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",frm_post_01_producto.mostCurrent._activity,"bmp1",frm_post_01_producto.mostCurrent._bmp1,"Btn_Aceptar",frm_post_01_producto.mostCurrent._btn_aceptar,"Btn_Editar_Descuento",frm_post_01_producto.mostCurrent._btn_editar_descuento,"Btn_Editar_Precio",frm_post_01_producto.mostCurrent._btn_editar_precio,"Btn_Eliminar",frm_post_01_producto.mostCurrent._btn_eliminar,"Btn_Revisar_Stock",frm_post_01_producto.mostCurrent._btn_revisar_stock,"Btn_Ubicacion",frm_post_01_producto.mostCurrent._btn_ubicacion,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"ChkValores",frm_post_01_producto._chkvalores,"Cl_PermisoX",frm_post_01_producto.mostCurrent._cl_permisox,"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"Consulta_Sql",frm_post_01_producto.mostCurrent._consulta_sql,"DateUtils",frm_post_01_producto.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"Editar",frm_post_01_producto._editar,"Fila",frm_post_01_producto.mostCurrent._fila,"Fila_Dscto",frm_post_01_producto.mostCurrent._fila_dscto,"Fila_Enc",frm_post_01_producto.mostCurrent._fila_enc,"Fila_Id",frm_post_01_producto.mostCurrent._fila_id,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Formulario",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_formulario.class),"FUNCIONARIO",frm_post_01_producto.mostCurrent._funcionario,"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Id_DocDet",frm_post_01_producto._id_docdet,"Lbl_Bodega",frm_post_01_producto.mostCurrent._lbl_bodega,"Lbl_Descripcion",frm_post_01_producto.mostCurrent._lbl_descripcion,"Lbl_Descuento",frm_post_01_producto.mostCurrent._lbl_descuento,"Lbl_Item",frm_post_01_producto.mostCurrent._lbl_item,"Lbl_Kodt",frm_post_01_producto.mostCurrent._lbl_kodt,"Lbl_ListaPrecio",frm_post_01_producto.mostCurrent._lbl_listaprecio,"Lbl_ModoConsulta",frm_post_01_producto.mostCurrent._lbl_modoconsulta,"Lbl_Podt",frm_post_01_producto.mostCurrent._lbl_podt,"Lbl_Precio",frm_post_01_producto.mostCurrent._lbl_precio,"Lbl_Stock",frm_post_01_producto.mostCurrent._lbl_stock,"Lbl_Total",frm_post_01_producto.mostCurrent._lbl_total,"Lbl_Ubicacion",frm_post_01_producto.mostCurrent._lbl_ubicacion,"Lbl_Vadt",frm_post_01_producto.mostCurrent._lbl_vadt,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"ModoConsulta",frm_post_01_producto._modoconsulta,"Msj",frm_post_01_producto._msj,"Procesar_Dscto",frm_post_01_producto._procesar_dscto,"RowProducto",frm_post_01_producto.mostCurrent._rowproducto,"TblDescuentos",frm_post_01_producto.mostCurrent._tbldescuentos,"TecladoSoft",frm_post_01_producto.mostCurrent._tecladosoft,"Total_Linea",frm_post_01_producto._total_linea,"TotalBrutoDoc",frm_post_01_producto._totalbrutodoc,"TotalNetoDoc",frm_post_01_producto._totalnetodoc,"Txt_Cantidad",frm_post_01_producto.mostCurrent._txt_cantidad,"Txt_Codigo",frm_post_01_producto.mostCurrent._txt_codigo,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"XclvDescuentos",frm_post_01_producto.mostCurrent._xclvdescuentos,"xui",frm_post_01_producto.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}