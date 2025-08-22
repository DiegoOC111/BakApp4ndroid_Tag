
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

public class frm_post_01_formulario implements IRemote{
	public static frm_post_01_formulario mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public frm_post_01_formulario() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("frm_post_01_formulario"), "BaKapp.Movil.Tag.frm_post_01_formulario");
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
		pcBA = new PCBA(this, frm_post_01_formulario.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id_docenc = RemoteObject.createImmutable(0);
public static RemoteObject _row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_encabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_despafacil = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cambiar_entidad = RemoteObject.createImmutable(false);
public static RemoteObject _crear_nvv_desde_cov = RemoteObject.createImmutable(false);
public static RemoteObject _nuevo_documento = RemoteObject.createImmutable(false);
public static RemoteObject _editar_documento = RemoteObject.createImmutable(false);
public static RemoteObject _idmaeedo_origen = RemoteObject.createImmutable(0);
public static RemoteObject _nudo_origen = RemoteObject.createImmutable("");
public static RemoteObject _tipodoc = RemoteObject.createImmutable("");
public static RemoteObject _grabar = RemoteObject.createImmutable(false);
public static RemoteObject _clfx2 = RemoteObject.declareNull("BaKapp.Movil.Tag.clfunciones2");
public static RemoteObject _tab_post = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _chk_valores_netos = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _lbl_total_neto = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_total_iva = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_total_impuestos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_total_bruto = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _id_docdet = RemoteObject.createImmutable(0);
public static RemoteObject _idlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lbl_detalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fila_idenc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _new_idmaeedo = RemoteObject.createImmutable(0);
public static RemoteObject _btn_limpiar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txt_observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_orden_compra = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbl_centro_costo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_codentidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_codsucentidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_rut = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_nombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_direccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_ciudad = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_comuna = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txt_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn_canbiar_cliente = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _xclvdetalle = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_descripcion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_items = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_fechaemision = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_fecha_1er_vencimiento = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_fechaultvencimiento = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_coutas = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_dias_1er_vencimiento = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_dias_vencimiento = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btn_limpiar_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_grabar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txt_flp_webservice = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xfloattextfield");
public static RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
public static RemoteObject _longtexttemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xlongtexttemplate");
public static RemoteObject _btn_dsctoglobal = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _hay_descuentos_globales = RemoteObject.createImmutable(false);
public static RemoteObject _btn_listaprecio = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _searchtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
public static RemoteObject _despsimple_docdestino = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
public static RemoteObject _despsimple_tipo = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
public static RemoteObject _despsimple_tipopago = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
public static RemoteObject _lbl_lista_precios = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _cl_permisox = RemoteObject.declareNull("BaKapp.Movil.Tag.cl_permisoxui");
public static RemoteObject _b4a_despachosimple = RemoteObject.createImmutable(false);
public static RemoteObject _lbl_tipodespacho = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_tipopagodesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_coddocdestino = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txt_direcciondesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_transportedesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_observacionesdesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btn_tipodespachosimple = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_tipopagodesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_coddocdestino = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _lbl_direcciondesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_transportedesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_observacionesdesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buscandoproducto = RemoteObject.createImmutable(false);
public static RemoteObject _buscandoentidad = RemoteObject.createImmutable(false);
public static RemoteObject _editandoproducto = RemoteObject.createImmutable(false);
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
public static BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public static BaKapp.Movil.Tag.funciones _funciones = null;
public static BaKapp.Movil.Tag.variables _variables = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",frm_post_01_formulario.mostCurrent._activity,"B4A_DespachoSimple",frm_post_01_formulario._b4a_despachosimple,"bmp1",frm_post_01_formulario.mostCurrent._bmp1,"bmp2",frm_post_01_formulario.mostCurrent._bmp2,"Btn_Canbiar_Cliente",frm_post_01_formulario.mostCurrent._btn_canbiar_cliente,"Btn_CodDocDestino",frm_post_01_formulario.mostCurrent._btn_coddocdestino,"Btn_DsctoGlobal",frm_post_01_formulario.mostCurrent._btn_dsctoglobal,"Btn_Grabar",frm_post_01_formulario.mostCurrent._btn_grabar,"Btn_Limpiar",frm_post_01_formulario.mostCurrent._btn_limpiar,"Btn_Limpiar_Codigo",frm_post_01_formulario.mostCurrent._btn_limpiar_codigo,"Btn_ListaPrecio",frm_post_01_formulario.mostCurrent._btn_listaprecio,"Btn_TipoDespachoSimple",frm_post_01_formulario.mostCurrent._btn_tipodespachosimple,"Btn_TipoPagoDesp",frm_post_01_formulario.mostCurrent._btn_tipopagodesp,"BuscandoEntidad",frm_post_01_formulario._buscandoentidad,"BuscandoProducto",frm_post_01_formulario._buscandoproducto,"Buscar_entidad",Debug.moduleToString(BaKapp.Movil.Tag.buscar_entidad.class),"Buscar_productos",Debug.moduleToString(BaKapp.Movil.Tag.buscar_productos.class),"Cambiar_Entidad",frm_post_01_formulario._cambiar_entidad,"Chk_Valores_Netos",frm_post_01_formulario.mostCurrent._chk_valores_netos,"Cl_PermisoX",frm_post_01_formulario.mostCurrent._cl_permisox,"CLFx2",frm_post_01_formulario.mostCurrent._clfx2,"Conf_local",Debug.moduleToString(BaKapp.Movil.Tag.conf_local.class),"Consulta_Sql",frm_post_01_formulario.mostCurrent._consulta_sql,"Crear_NVV_Desde_COV",frm_post_01_formulario._crear_nvv_desde_cov,"DateUtils",frm_post_01_formulario.mostCurrent._dateutils,"DBUtils",Debug.moduleToString(BaKapp.Movil.Tag.dbutils.class),"DespSimple_DocDestino",frm_post_01_formulario.mostCurrent._despsimple_docdestino,"DespSimple_Tipo",frm_post_01_formulario.mostCurrent._despsimple_tipo,"DespSimple_TipoPago",frm_post_01_formulario.mostCurrent._despsimple_tipopago,"EditandoProducto",frm_post_01_formulario._editandoproducto,"Editar_Documento",frm_post_01_formulario._editar_documento,"Fila_DespaFacil",frm_post_01_formulario._fila_despafacil,"Fila_Encabezado",frm_post_01_formulario._fila_encabezado,"Fila_IdEnc",frm_post_01_formulario.mostCurrent._fila_idenc,"Fila_Observaciones",frm_post_01_formulario._fila_observaciones,"Frm_Buscar_Documento",Debug.moduleToString(BaKapp.Movil.Tag.frm_buscar_documento.class),"Frm_Documentos_Generados",Debug.moduleToString(BaKapp.Movil.Tag.frm_documentos_generados.class),"Frm_Editar_ObsOc",Debug.moduleToString(BaKapp.Movil.Tag.frm_editar_obsoc.class),"Frm_etiquetas",Debug.moduleToString(BaKapp.Movil.Tag.frm_etiquetas.class),"Frm_impresion",Debug.moduleToString(BaKapp.Movil.Tag.frm_impresion.class),"Frm_InfoStockXProd",Debug.moduleToString(BaKapp.Movil.Tag.frm_infostockxprod.class),"Frm_Menu_Post_Venta",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_post_venta.class),"Frm_Menu_Principal",Debug.moduleToString(BaKapp.Movil.Tag.frm_menu_principal.class),"Frm_Post_01_Descuentos",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_descuentos.class),"Frm_Post_01_Producto",Debug.moduleToString(BaKapp.Movil.Tag.frm_post_01_producto.class),"Funciones",Debug.moduleToString(BaKapp.Movil.Tag.funciones.class),"Grabar",frm_post_01_formulario._grabar,"Hay_Descuentos_Globales",frm_post_01_formulario._hay_descuentos_globales,"HttpUtils2Service",Debug.moduleToString(BaKapp.Movil.Tag.httputils2service.class),"Id_DocDet",frm_post_01_formulario._id_docdet,"Id_DocEnc",frm_post_01_formulario._id_docenc,"IDList",frm_post_01_formulario.mostCurrent._idlist,"Idmaeedo_Origen",frm_post_01_formulario._idmaeedo_origen,"InputTemplate",frm_post_01_formulario.mostCurrent._inputtemplate,"Label1",frm_post_01_formulario.mostCurrent._label1,"Lbl_Centro_Costo",frm_post_01_formulario.mostCurrent._lbl_centro_costo,"Lbl_Ciudad",frm_post_01_formulario.mostCurrent._lbl_ciudad,"Lbl_CodDocDestino",frm_post_01_formulario.mostCurrent._lbl_coddocdestino,"Lbl_CodEntidad",frm_post_01_formulario.mostCurrent._lbl_codentidad,"Lbl_Codigo",frm_post_01_formulario.mostCurrent._lbl_codigo,"Lbl_CodSucEntidad",frm_post_01_formulario.mostCurrent._lbl_codsucentidad,"Lbl_Comuna",frm_post_01_formulario.mostCurrent._lbl_comuna,"Lbl_Coutas",frm_post_01_formulario.mostCurrent._lbl_coutas,"Lbl_Datos",frm_post_01_formulario.mostCurrent._lbl_datos,"Lbl_Descripcion",frm_post_01_formulario.mostCurrent._lbl_descripcion,"Lbl_Detalle",frm_post_01_formulario.mostCurrent._lbl_detalle,"Lbl_Dias_1er_Vencimiento",frm_post_01_formulario.mostCurrent._lbl_dias_1er_vencimiento,"Lbl_Dias_Vencimiento",frm_post_01_formulario.mostCurrent._lbl_dias_vencimiento,"Lbl_Direccion",frm_post_01_formulario.mostCurrent._lbl_direccion,"Lbl_DireccionDesp",frm_post_01_formulario.mostCurrent._lbl_direcciondesp,"Lbl_Fecha_1er_Vencimiento",frm_post_01_formulario.mostCurrent._lbl_fecha_1er_vencimiento,"Lbl_FechaEmision",frm_post_01_formulario.mostCurrent._lbl_fechaemision,"Lbl_FechaUltVencimiento",frm_post_01_formulario.mostCurrent._lbl_fechaultvencimiento,"Lbl_Item",frm_post_01_formulario.mostCurrent._lbl_item,"Lbl_Items",frm_post_01_formulario.mostCurrent._lbl_items,"Lbl_Lista_Precios",frm_post_01_formulario.mostCurrent._lbl_lista_precios,"Lbl_Nombre",frm_post_01_formulario.mostCurrent._lbl_nombre,"Lbl_Observaciones",frm_post_01_formulario.mostCurrent._lbl_observaciones,"Lbl_ObservacionesDesp",frm_post_01_formulario.mostCurrent._lbl_observacionesdesp,"Lbl_Rut",frm_post_01_formulario.mostCurrent._lbl_rut,"Lbl_TipoDespacho",frm_post_01_formulario.mostCurrent._lbl_tipodespacho,"Lbl_TipoPagoDesp",frm_post_01_formulario.mostCurrent._lbl_tipopagodesp,"Lbl_Total_Bruto",frm_post_01_formulario.mostCurrent._lbl_total_bruto,"Lbl_Total_Impuestos",frm_post_01_formulario.mostCurrent._lbl_total_impuestos,"Lbl_Total_Iva",frm_post_01_formulario.mostCurrent._lbl_total_iva,"Lbl_Total_Neto",frm_post_01_formulario.mostCurrent._lbl_total_neto,"Lbl_TransporteDesp",frm_post_01_formulario.mostCurrent._lbl_transportedesp,"LongTextTemplate",frm_post_01_formulario.mostCurrent._longtexttemplate,"Main",Debug.moduleToString(BaKapp.Movil.Tag.main.class),"New_Idmaeedo",frm_post_01_formulario._new_idmaeedo,"Nudo_Origen",frm_post_01_formulario._nudo_origen,"Nuevo_Documento",frm_post_01_formulario._nuevo_documento,"Row_Entidad",frm_post_01_formulario._row_entidad,"SearchTemplate",frm_post_01_formulario.mostCurrent._searchtemplate,"Tab_Post",frm_post_01_formulario.mostCurrent._tab_post,"TipoDoc",frm_post_01_formulario._tipodoc,"Txt_Codigo",frm_post_01_formulario.mostCurrent._txt_codigo,"Txt_DireccionDesp",frm_post_01_formulario.mostCurrent._txt_direcciondesp,"Txt_Flp_WebService",frm_post_01_formulario.mostCurrent._txt_flp_webservice,"Txt_Observaciones",frm_post_01_formulario.mostCurrent._txt_observaciones,"Txt_ObservacionesDesp",frm_post_01_formulario.mostCurrent._txt_observacionesdesp,"Txt_Orden_compra",frm_post_01_formulario.mostCurrent._txt_orden_compra,"Txt_TransporteDesp",frm_post_01_formulario.mostCurrent._txt_transportedesp,"Variables",Debug.moduleToString(BaKapp.Movil.Tag.variables.class),"XclvDetalle",frm_post_01_formulario.mostCurrent._xclvdetalle,"XUIViewsUtils",Debug.moduleToString(BaKapp.Movil.Tag.xuiviewsutils.class)};
}
}