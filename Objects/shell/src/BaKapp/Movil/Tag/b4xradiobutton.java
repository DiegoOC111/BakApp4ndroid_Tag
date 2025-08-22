
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xradiobutton {
    public static RemoteObject myClass;
	public b4xradiobutton() {
	}
    public static PCBA staticBA = new PCBA(null, b4xradiobutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _oncolor = RemoteObject.createImmutable(0);
public static RemoteObject _offcolor = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mvalue = RemoteObject.createImmutable(false);
public static RemoteObject _transparent = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _onbrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _offbrush = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
public static RemoteObject _menabled = RemoteObject.createImmutable(false);
public static RemoteObject _mhaptic = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _mlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _scale = RemoteObject.createImmutable(0f);
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
		return new Object[] {"bc",_ref.getField(false, "_bc"),"DateUtils",_ref.getField(false, "_dateutils"),"iv",_ref.getField(false, "_iv"),"LoopIndex",_ref.getField(false, "_loopindex"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEnabled",_ref.getField(false, "_menabled"),"mEventName",_ref.getField(false, "_meventname"),"mHaptic",_ref.getField(false, "_mhaptic"),"mLabel",_ref.getField(false, "_mlabel"),"mValue",_ref.getField(false, "_mvalue"),"OffBrush",_ref.getField(false, "_offbrush"),"OffColor",_ref.getField(false, "_offcolor"),"OnBrush",_ref.getField(false, "_onbrush"),"OnColor",_ref.getField(false, "_oncolor"),"pnl",_ref.getField(false, "_pnl"),"Scale",_ref.getField(false, "_scale"),"Size",_ref.getField(false, "_size"),"Tag",_ref.getField(false, "_tag"),"transparent",_ref.getField(false, "_transparent"),"xui",_ref.getField(false, "_xui")};
}
}