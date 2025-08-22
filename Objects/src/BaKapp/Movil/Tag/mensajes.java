package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mensajes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "BaKapp.Movil.Tag.mensajes");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(BaKapp.Movil.Tag.mensajes __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mensajes";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(BaKapp.Movil.Tag.mensajes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mensajes";
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="Public EsCorrecto As Boolean";
_escorrecto = false;
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="Public Id As String";
_id = "";
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="Public Detalle As String";
_detalle = "";
RDebugUtils.currentLine=25296902;
 //BA.debugLineNum = 25296902;BA.debugLine="Public Mensaje As String";
_mensaje = "";
RDebugUtils.currentLine=25296903;
 //BA.debugLineNum = 25296903;BA.debugLine="Public Resultado As String";
_resultado = "";
RDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=25296905;
 //BA.debugLineNum = 25296905;BA.debugLine="Public UsarImagen As Boolean";
_usarimagen = false;
RDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="Public NombreImagen As String";
_nombreimagen = "";
RDebugUtils.currentLine=25296907;
 //BA.debugLineNum = 25296907;BA.debugLine="Public Icono As Object";
_icono = new Object();
RDebugUtils.currentLine=25296908;
 //BA.debugLineNum = 25296908;BA.debugLine="Public Cancelado As Boolean";
_cancelado = false;
RDebugUtils.currentLine=25296909;
 //BA.debugLineNum = 25296909;BA.debugLine="Public MostrarMensaje As Boolean = True";
_mostrarmensaje = __c.True;
RDebugUtils.currentLine=25296910;
 //BA.debugLineNum = 25296910;BA.debugLine="Public Cerrar As Boolean";
_cerrar = false;
RDebugUtils.currentLine=25296911;
 //BA.debugLineNum = 25296911;BA.debugLine="Public ErrorDeConexionSQL As Boolean";
_errordeconexionsql = false;
RDebugUtils.currentLine=25296913;
 //BA.debugLineNum = 25296913;BA.debugLine="End Sub";
return "";
}
}