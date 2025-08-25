
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xplusminus {
    public static RemoteObject myClass;
	public b4xplusminus() {
	}
    public static PCBA staticBA = new PCBA(null, b4xplusminus.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _pnlplus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlminus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblplus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblminus = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _formation = RemoteObject.createImmutable("");
public static RemoteObject _mcyclic = RemoteObject.createImmutable(false);
public static RemoteObject _mrapid = RemoteObject.createImmutable(false);
public static RemoteObject _mainlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _arrowssize = RemoteObject.createImmutable(0);
public static RemoteObject _mstringitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mstartrange = RemoteObject.createImmutable(0);
public static RemoteObject _minterval = RemoteObject.createImmutable(0);
public static RemoteObject _mendrange = RemoteObject.createImmutable(0);
public static RemoteObject _mselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _rapidperiod1 = RemoteObject.createImmutable(0);
public static RemoteObject _rapidperiod2 = RemoteObject.createImmutable(0);
public static RemoteObject _formatter = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xformatter");
public static RemoteObject _stringmode = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _mhaptic = RemoteObject.createImmutable(false);
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
		return new Object[] {"ArrowsSize",_ref.getField(false, "_arrowssize"),"DateUtils",_ref.getField(false, "_dateutils"),"Formation",_ref.getField(false, "_formation"),"Formatter",_ref.getField(false, "_formatter"),"lblMinus",_ref.getField(false, "_lblminus"),"lblPlus",_ref.getField(false, "_lblplus"),"LoopIndex",_ref.getField(false, "_loopindex"),"MainLabel",_ref.getField(false, "_mainlabel"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mCyclic",_ref.getField(false, "_mcyclic"),"mEndRange",_ref.getField(false, "_mendrange"),"mEventName",_ref.getField(false, "_meventname"),"mHaptic",_ref.getField(false, "_mhaptic"),"mInterval",_ref.getField(false, "_minterval"),"mRapid",_ref.getField(false, "_mrapid"),"mSelectedIndex",_ref.getField(false, "_mselectedindex"),"mStartRange",_ref.getField(false, "_mstartrange"),"mStringItems",_ref.getField(false, "_mstringitems"),"pnlMinus",_ref.getField(false, "_pnlminus"),"pnlPlus",_ref.getField(false, "_pnlplus"),"RapidPeriod1",_ref.getField(false, "_rapidperiod1"),"RapidPeriod2",_ref.getField(false, "_rapidperiod2"),"Size",_ref.getField(false, "_size"),"StringMode",_ref.getField(false, "_stringmode"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}