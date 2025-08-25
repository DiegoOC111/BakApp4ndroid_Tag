
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xseekbar {
    public static RemoteObject myClass;
	public b4xseekbar() {
	}
    public static PCBA staticBA = new PCBA(null, b4xseekbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _color1 = RemoteObject.createImmutable(0);
public static RemoteObject _color2 = RemoteObject.createImmutable(0);
public static RemoteObject _thumbcolor = RemoteObject.createImmutable(0);
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _touchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _minvalue = RemoteObject.createImmutable(0);
public static RemoteObject _maxvalue = RemoteObject.createImmutable(0);
public static RemoteObject _interval = RemoteObject.createImmutable(0);
public static RemoteObject _vertical = RemoteObject.createImmutable(false);
public static RemoteObject _size1 = RemoteObject.createImmutable(0);
public static RemoteObject _size2 = RemoteObject.createImmutable(0);
public static RemoteObject _radius1 = RemoteObject.createImmutable(0);
public static RemoteObject _radius2 = RemoteObject.createImmutable(0);
public static RemoteObject _pressed = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
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
		return new Object[] {"Color1",_ref.getField(false, "_color1"),"Color2",_ref.getField(false, "_color2"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"Interval",_ref.getField(false, "_interval"),"MaxValue",_ref.getField(false, "_maxvalue"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"MinValue",_ref.getField(false, "_minvalue"),"mValue",_ref.getField(false, "_mvalue"),"Pressed",_ref.getField(false, "_pressed"),"Radius1",_ref.getField(false, "_radius1"),"Radius2",_ref.getField(false, "_radius2"),"size",_ref.getField(false, "_size"),"Size1",_ref.getField(false, "_size1"),"Size2",_ref.getField(false, "_size2"),"Tag",_ref.getField(false, "_tag"),"ThumbColor",_ref.getField(false, "_thumbcolor"),"TouchPanel",_ref.getField(false, "_touchpanel"),"Vertical",_ref.getField(false, "_vertical"),"xui",_ref.getField(false, "_xui")};
}
}