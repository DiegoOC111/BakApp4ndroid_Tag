package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mensajes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.mensajes");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.mensajes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _escorrecto = false;
public String _id = "";
public String _detalle = "";
public String _mensaje = "";
public String _resultado = "";
public Object _tag = null;
public boolean _usarimagen = false;
public String _nombreimagen = "";
public Object _icono = null;
public boolean _cancelado = false;
public boolean _mostrarmensaje = false;
public boolean _cerrar = false;
public boolean _errordeconexionsql = false;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public EsCorrecto As Boolean";
_escorrecto = false;
 //BA.debugLineNum = 4;BA.debugLine="Public Id As String";
_id = "";
 //BA.debugLineNum = 6;BA.debugLine="Public Detalle As String";
_detalle = "";
 //BA.debugLineNum = 7;BA.debugLine="Public Mensaje As String";
_mensaje = "";
 //BA.debugLineNum = 8;BA.debugLine="Public Resultado As String";
_resultado = "";
 //BA.debugLineNum = 9;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public UsarImagen As Boolean";
_usarimagen = false;
 //BA.debugLineNum = 11;BA.debugLine="Public NombreImagen As String";
_nombreimagen = "";
 //BA.debugLineNum = 12;BA.debugLine="Public Icono As Object";
_icono = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Public Cancelado As Boolean";
_cancelado = false;
 //BA.debugLineNum = 14;BA.debugLine="Public MostrarMensaje As Boolean = True";
_mostrarmensaje = __c.True;
 //BA.debugLineNum = 15;BA.debugLine="Public Cerrar As Boolean";
_cerrar = false;
 //BA.debugLineNum = 16;BA.debugLine="Public ErrorDeConexionSQL As Boolean";
_errordeconexionsql = false;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
