
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class crear_documento {
    public static RemoteObject myClass;
	public crear_documento() {
	}
    public static PCBA staticBA = new PCBA(null, crear_documento.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _consulta_sql = RemoteObject.createImmutable("");
public static RemoteObject _idmaeedo = RemoteObject.createImmutable(0);
public static RemoteObject _id_docenc = RemoteObject.createImmutable(0);
public static RemoteObject _row_entidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_encabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_observaciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fila_despafacil = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cambiar_entidad = RemoteObject.createImmutable(false);
public static RemoteObject _crear_nvv_desde_cov = RemoteObject.createImmutable(false);
public static RemoteObject _usar_precio_original = RemoteObject.createImmutable(false);
public static RemoteObject _fila_idenc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _chkvalores = RemoteObject.createImmutable(false);
public static RemoteObject _funcionario = RemoteObject.createImmutable("");
public static RemoteObject _totalnetodoc = RemoteObject.createImmutable(0);
public static RemoteObject _totalbrutodoc = RemoteObject.createImmutable(0);
public static RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _bmp2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
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
		return new Object[] {"bmp1",_ref.getField(false, "_bmp1"),"bmp2",_ref.getField(false, "_bmp2"),"Cambiar_Entidad",_ref.getField(false, "_cambiar_entidad"),"ChkValores",_ref.getField(false, "_chkvalores"),"Consulta_Sql",_ref.getField(false, "_consulta_sql"),"Crear_NVV_Desde_COV",_ref.getField(false, "_crear_nvv_desde_cov"),"DateUtils",_ref.getField(false, "_dateutils"),"Fila_DespaFacil",_ref.getField(false, "_fila_despafacil"),"Fila_Encabezado",_ref.getField(false, "_fila_encabezado"),"Fila_IdEnc",_ref.getField(false, "_fila_idenc"),"Fila_Observaciones",_ref.getField(false, "_fila_observaciones"),"FUNCIONARIO",_ref.getField(false, "_funcionario"),"Id_DocEnc",_ref.getField(false, "_id_docenc"),"Idmaeedo",_ref.getField(false, "_idmaeedo"),"Row_Entidad",_ref.getField(false, "_row_entidad"),"TotalBrutoDoc",_ref.getField(false, "_totalbrutodoc"),"TotalNetoDoc",_ref.getField(false, "_totalnetodoc"),"Usar_Precio_Original",_ref.getField(false, "_usar_precio_original")};
}
}