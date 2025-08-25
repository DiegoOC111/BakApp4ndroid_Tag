
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class httpjob {
    public static RemoteObject myClass;
	public httpjob() {
	}
    public static PCBA staticBA = new PCBA(null, httpjob.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _jobname = RemoteObject.createImmutable("");
public static RemoteObject _success = RemoteObject.createImmutable(false);
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _errormessage = RemoteObject.createImmutable("");
public static RemoteObject _target = RemoteObject.declareNull("Object");
public static RemoteObject _taskid = RemoteObject.createImmutable("");
public static RemoteObject _req = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");
public static RemoteObject _response = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _invalidurl = RemoteObject.createImmutable("");
public static RemoteObject _defaultscheme = RemoteObject.createImmutable("");
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"DefaultScheme",_ref.getField(false, "_defaultscheme"),"ErrorMessage",_ref.getField(false, "_errormessage"),"InvalidURL",_ref.getField(false, "_invalidurl"),"JobName",_ref.getField(false, "_jobname"),"Password",_ref.getField(false, "_password"),"req",_ref.getField(false, "_req"),"Response",_ref.getField(false, "_response"),"Success",_ref.getField(false, "_success"),"Tag",_ref.getField(false, "_tag"),"target",_ref.getField(false, "_target"),"taskId",_ref.getField(false, "_taskid"),"Username",_ref.getField(false, "_username")};
}
}