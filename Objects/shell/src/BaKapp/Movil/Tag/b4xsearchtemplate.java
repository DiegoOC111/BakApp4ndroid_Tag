
package BaKapp.Movil.Tag;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xsearchtemplate {
    public static RemoteObject myClass;
	public b4xsearchtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xsearchtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _xdialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
public static RemoteObject _searchfield = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xfloattextfield");
public static RemoteObject _prefixlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _substringlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _texthighlightcolor = RemoteObject.createImmutable(0);
public static RemoteObject _itemhightlightcolor = RemoteObject.createImmutable(0);
public static RemoteObject _max_limit = RemoteObject.createImmutable(0);
public static RemoteObject _maxnumberofitemstoshow = RemoteObject.createImmutable(0);
public static RemoteObject _itemscache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _allitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _selecteditem = RemoteObject.createImmutable("");
public static RemoteObject _lastterm = RemoteObject.createImmutable("");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _allowunlistedtext = RemoteObject.createImmutable(false);
public static RemoteObject _prefixonly = RemoteObject.createImmutable(false);
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
		return new Object[] {"AllItems",_ref.getField(false, "_allitems"),"AllowUnlistedText",_ref.getField(false, "_allowunlistedtext"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"IME",_ref.getField(false, "_ime"),"ItemHightlightColor",_ref.getField(false, "_itemhightlightcolor"),"ItemsCache",_ref.getField(false, "_itemscache"),"LastTerm",_ref.getField(false, "_lastterm"),"MAX_LIMIT",_ref.getField(false, "_max_limit"),"MaxNumberOfItemsToShow",_ref.getField(false, "_maxnumberofitemstoshow"),"mBase",_ref.getField(false, "_mbase"),"prefixList",_ref.getField(false, "_prefixlist"),"PrefixOnly",_ref.getField(false, "_prefixonly"),"SearchField",_ref.getField(false, "_searchfield"),"SelectedItem",_ref.getField(false, "_selecteditem"),"substringList",_ref.getField(false, "_substringlist"),"TextHighlightColor",_ref.getField(false, "_texthighlightcolor"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}