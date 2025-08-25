
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mensajes {
    public static RemoteObject myClass;
	public mensajes() {
	}
    public static PCBA staticBA = new PCBA(null, mensajes.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _escorrecto = RemoteObject.createImmutable(false);
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _detalle = RemoteObject.createImmutable("");
public static RemoteObject _mensaje = RemoteObject.createImmutable("");
public static RemoteObject _resultado = RemoteObject.createImmutable("");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _usarimagen = RemoteObject.createImmutable(false);
public static RemoteObject _nombreimagen = RemoteObject.createImmutable("");
public static RemoteObject _icono = RemoteObject.declareNull("Object");
public static RemoteObject _cancelado = RemoteObject.createImmutable(false);
public static RemoteObject _mostrarmensaje = RemoteObject.createImmutable(false);
public static RemoteObject _cerrar = RemoteObject.createImmutable(false);
public static RemoteObject _errordeconexionsql = RemoteObject.createImmutable(false);
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
		return new Object[] {"Cancelado",_ref.getField(false, "_cancelado"),"Cerrar",_ref.getField(false, "_cerrar"),"DateUtils",_ref.getField(false, "_dateutils"),"Detalle",_ref.getField(false, "_detalle"),"ErrorDeConexionSQL",_ref.getField(false, "_errordeconexionsql"),"EsCorrecto",_ref.getField(false, "_escorrecto"),"Icono",_ref.getField(false, "_icono"),"Id",_ref.getField(false, "_id"),"Mensaje",_ref.getField(false, "_mensaje"),"MostrarMensaje",_ref.getField(false, "_mostrarmensaje"),"NombreImagen",_ref.getField(false, "_nombreimagen"),"Resultado",_ref.getField(false, "_resultado"),"Tag",_ref.getField(false, "_tag"),"UsarImagen",_ref.getField(false, "_usarimagen")};
}
}