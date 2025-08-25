
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cl_permisoxui {
    public static RemoteObject myClass;
	public cl_permisoxui() {
	}
    public static PCBA staticBA = new PCBA(null, cl_permisoxui.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _txt_clave = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbl_descripcionpermiso = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _permisoaceptado = RemoteObject.createImmutable(false);
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _error = RemoteObject.createImmutable("");
public static RemoteObject _rowusuarioautoriza = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _lbl_codigo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _aceptado = RemoteObject.createImmutable(false);
public static RemoteObject _cancelado = RemoteObject.createImmutable(false);
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
public static BaKapp.Movil.Tag.variables _variables = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Aceptado",_ref.getField(false, "_aceptado"),"bmp1",_ref.getField(false, "_bmp1"),"Cancelado",_ref.getField(false, "_cancelado"),"Consulta_Sql",_ref.getField(false, "_consulta_sql"),"DateUtils",_ref.getField(false, "_dateutils"),"Error",_ref.getField(false, "_error"),"Lbl_Codigo",_ref.getField(false, "_lbl_codigo"),"Lbl_DescripcionPermiso",_ref.getField(false, "_lbl_descripcionpermiso"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"PermisoAceptado",_ref.getField(false, "_permisoaceptado"),"RowUsuarioAutoriza",_ref.getField(false, "_rowusuarioautoriza"),"Tag",_ref.getField(false, "_tag"),"Txt_Clave",_ref.getField(false, "_txt_clave"),"xui",_ref.getField(false, "_xui")};
}
}