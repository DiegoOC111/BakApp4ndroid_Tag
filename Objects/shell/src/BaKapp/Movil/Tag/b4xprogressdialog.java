
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xprogressdialog {
    public static RemoteObject myClass;
	public b4xprogressdialog() {
	}
    public static PCBA staticBA = new PCBA(null, b4xprogressdialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mtext = RemoteObject.declareNull("Object");
public static RemoteObject _loadingindicator = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xloadingindicator");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mdialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
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
public static BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public static BaKapp.Movil.Tag.funciones _funciones = null;
public static BaKapp.Movil.Tag.variables _variables = null;
public static BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public static BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"Label1",_ref.getField(false, "_label1"),"LoadingIndicator",_ref.getField(false, "_loadingindicator"),"mBase",_ref.getField(false, "_mbase"),"mDialog",_ref.getField(false, "_mdialog"),"mText",_ref.getField(false, "_mtext"),"xui",_ref.getField(false, "_xui")};
}
}