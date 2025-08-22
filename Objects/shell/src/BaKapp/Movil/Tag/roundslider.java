
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class roundslider {
    public static RemoteObject myClass;
	public roundslider() {
	}
    public static PCBA staticBA = new PCBA(null, roundslider.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _mmin = RemoteObject.createImmutable(0);
public static RemoteObject _mmax = RemoteObject.createImmutable(0);
public static RemoteObject _thumb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _circlerect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _valuecolor = RemoteObject.createImmutable(0);
public static RemoteObject _stroke = RemoteObject.createImmutable(0);
public static RemoteObject _thumbsize = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _mthumbbordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mthumbinnercolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcirclefillcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcirclenonvaluecolor = RemoteObject.createImmutable(0);
public static RemoteObject _mrollover = RemoteObject.createImmutable(false);
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
		return new Object[] {"CircleRect",_ref.getField(false, "_circlerect"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mCircleFillColor",_ref.getField(false, "_mcirclefillcolor"),"mCircleNonValueColor",_ref.getField(false, "_mcirclenonvaluecolor"),"mEventName",_ref.getField(false, "_meventname"),"mMax",_ref.getField(false, "_mmax"),"mMin",_ref.getField(false, "_mmin"),"mRollOver",_ref.getField(false, "_mrollover"),"mThumbBorderColor",_ref.getField(false, "_mthumbbordercolor"),"mThumbInnerColor",_ref.getField(false, "_mthumbinnercolor"),"mValue",_ref.getField(false, "_mvalue"),"pnl",_ref.getField(false, "_pnl"),"stroke",_ref.getField(false, "_stroke"),"Tag",_ref.getField(false, "_tag"),"thumb",_ref.getField(false, "_thumb"),"ThumbSize",_ref.getField(false, "_thumbsize"),"ValueColor",_ref.getField(false, "_valuecolor"),"xlbl",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}