package BaKapp.Movil.Tag;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class frm_impresion extends Activity implements B4AActivity{
	public static frm_impresion mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_impresion");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_impresion).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, true))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_impresion");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_impresion", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_impresion) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_impresion) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return frm_impresion.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (frm_impresion) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_impresion) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            frm_impresion mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_impresion) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static class _tabledata{
public boolean IsInitialized;
public String CODIGO;
public String CODTECNICO;
public String DESCRIPCION;
public String MRPR;
public String RAPIDO;
public String KOPRAL;
public void Initialize() {
IsInitialized = true;
CODIGO = "";
CODTECNICO = "";
DESCRIPCION = "";
MRPR = "";
RAPIDO = "";
KOPRAL = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _otherpricedata{
public boolean IsInitialized;
public String TILT;
public String KOLT;
public String MELT;
public String MOLT;
public String TIMOLT;
public String NOKOLT;
public String FEVI;
public String OPERA;
public String ECUDEF01UD;
public String ECUDEF02UD;
public void Initialize() {
IsInitialized = true;
TILT = "";
KOLT = "";
MELT = "";
MOLT = "";
TIMOLT = "";
NOKOLT = "";
FEVI = "";
OPERA = "";
ECUDEF01UD = "";
ECUDEF02UD = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _otherdata{
public boolean IsInitialized;
public String Principal;
public String Rapido;
public String Tecnico;
public double Rtu;
public String Ud1;
public String Ud2;
public String Descripcion;
public double StFisicoUd1;
public double StFisicoUd2;
public String SuperFamilia;
public String NombreSuper;
public String Familia;
public String NombreFamilia;
public String SubFamilia;
public String NombreSub;
public String MRPR;
public String MARCA;
public double PrecioListaUd1;
public double PrecioListaUd2;
public void Initialize() {
IsInitialized = true;
Principal = "";
Rapido = "";
Tecnico = "";
Rtu = 0;
Ud1 = "";
Ud2 = "";
Descripcion = "";
StFisicoUd1 = 0;
StFisicoUd2 = 0;
SuperFamilia = "";
NombreSuper = "";
Familia = "";
NombreFamilia = "";
SubFamilia = "";
NombreSub = "";
MRPR = "";
MARCA = "";
PrecioListaUd1 = 0;
PrecioListaUd2 = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _etiqueta{
public boolean IsInitialized;
public String NombreEtiqueta;
public String FUNCION;
public void Initialize() {
IsInitialized = true;
NombreEtiqueta = "";
FUNCION = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.List _datalist = null;
public static anywheresoftware.b4a.objects.collections.List _dataprice = null;
public static BaKapp.Movil.Tag.frm_impresion._otherdata _objselec = null;
public static String _tip = "";
public static float _ancho = 0f;
public anywheresoftware.b4a.objects.IME _ime1 = null;
public static float _alto = 0f;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscarprod = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_buscador = null;
public static boolean _yabusco = false;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public BaKapp.Movil.Tag.b4xcombobox _b4xcombobox1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_cerrarbuscador = null;
public static String _selectedstring = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txt_codigo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_tipo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_codigo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_desc = null;
public static int _cantidad = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_precio = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_imprimir = null;
public anywheresoftware.b4a.objects.Serial _serial1 = null;
public anywheresoftware.b4a.objects.SocketWrapper _connectedprinter = null;
public static String _printerip = "";
public static int _printerport = 0;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public BaKapp.Movil.Tag.b4xcombobox _combo_impresion = null;
public BaKapp.Movil.Tag.b4xcombobox _combo_tipobusqueda = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_volver = null;
public anywheresoftware.b4a.objects.collections.Map _datos = null;
public static int _selectedprice = 0;
public static String _stringprecio1 = "";
public BaKapp.Movil.Tag.b4xcombobox _combo_precios = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelvista = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.collections.List _etiquetas = null;
public static String _etiqueta_zpl = "";
public BaKapp.Movil.Tag.b4xplusminus _b4xplusminus1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner_cant = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_limpiar = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.collections.List _stringlist = null;
anywheresoftware.b4a.objects.collections.List _stringlist2 = null;
int _i = 0;
BaKapp.Movil.Tag.frm_impresion._etiqueta _et = null;
String _valorbuscado = "";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Activity.LoadLayout(\"impresion\")";
mostCurrent._activity.LoadLayout("impresion",mostCurrent.activityBA);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="DataPrice.Initialize";
_dataprice.Initialize();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="DataList.Initialize";
_datalist.Initialize();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Dim stringList As List";
_stringlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="stringList.Initialize";
_stringlist.Initialize();
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="stringList.Add(\"Principal\")";
_stringlist.Add((Object)("Principal"));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="stringList.Add(\"Tecnico\")";
_stringlist.Add((Object)("Tecnico"));
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="stringList.Add(\"Rapido\")";
_stringlist.Add((Object)("Rapido"));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="stringList.Add(\"Descripcion\")";
_stringlist.Add((Object)("Descripcion"));
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Dim stringList2 As List";
_stringlist2 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="stringList2.Initialize";
_stringlist2.Initialize();
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="For i = 1 To 10";
{
final int step12 = 1;
final int limit12 = (int) (10);
_i = (int) (1) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="Spinner_cant.Add(i) ' B4A lo convierte automátic";
mostCurrent._spinner_cant.Add(BA.NumberToString(_i));
 }
};
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="cantidad = 1";
_cantidad = (int) (1);
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="Combo_TipoBusqueda.SetItems(stringList)";
mostCurrent._combo_tipobusqueda._setitems /*String*/ (null,_stringlist);
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="Combo_Impresion.SetItems(stringList2)";
mostCurrent._combo_impresion._setitems /*String*/ (null,_stringlist2);
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="selectedString = \"Principal\"";
mostCurrent._selectedstring = "Principal";
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="LeerDatos";
_leerdatos();
RDebugUtils.currentLine=2293804;
 //BA.debugLineNum = 2293804;BA.debugLine="Etiquetas = Frm_etiquetas.Etiquetas";
mostCurrent._etiquetas = mostCurrent._frm_etiquetas._etiquetas /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=2293805;
 //BA.debugLineNum = 2293805;BA.debugLine="For Each ET As Etiqueta In Etiquetas";
{
final anywheresoftware.b4a.BA.IterableList group21 = mostCurrent._etiquetas;
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_et = (BaKapp.Movil.Tag.frm_impresion._etiqueta)(group21.Get(index21));
RDebugUtils.currentLine=2293806;
 //BA.debugLineNum = 2293806;BA.debugLine="stringList2.Add(ET.NombreEtiqueta)";
_stringlist2.Add((Object)(_et.NombreEtiqueta /*String*/ ));
 }
};
RDebugUtils.currentLine=2293815;
 //BA.debugLineNum = 2293815;BA.debugLine="Combo_Impresion.SetItems(stringList2)";
mostCurrent._combo_impresion._setitems /*String*/ (null,_stringlist2);
RDebugUtils.currentLine=2293816;
 //BA.debugLineNum = 2293816;BA.debugLine="If (Frm_etiquetas.default.Length <> 0) Then";
if ((mostCurrent._frm_etiquetas._default /*String*/ .length()!=0)) { 
RDebugUtils.currentLine=2293817;
 //BA.debugLineNum = 2293817;BA.debugLine="Dim valorBuscado As String = Frm_etiquetas.defau";
_valorbuscado = mostCurrent._frm_etiquetas._default /*String*/ ;
RDebugUtils.currentLine=2293819;
 //BA.debugLineNum = 2293819;BA.debugLine="For i = 0 To Combo_Impresion.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (mostCurrent._combo_impresion._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=2293820;
 //BA.debugLineNum = 2293820;BA.debugLine="If Combo_Impresion.GetItem(i) = valorBuscado Th";
if ((mostCurrent._combo_impresion._getitem /*String*/ (null,_i)).equals(_valorbuscado)) { 
RDebugUtils.currentLine=2293821;
 //BA.debugLineNum = 2293821;BA.debugLine="Combo_Impresion.SelectedIndex = i";
mostCurrent._combo_impresion._setselectedindex /*int*/ (null,_i);
RDebugUtils.currentLine=2293822;
 //BA.debugLineNum = 2293822;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=2293825;
 //BA.debugLineNum = 2293825;BA.debugLine="tip = Frm_etiquetas.default";
mostCurrent._tip = mostCurrent._frm_etiquetas._default /*String*/ ;
 }else {
RDebugUtils.currentLine=2293827;
 //BA.debugLineNum = 2293827;BA.debugLine="tip = Combo_Impresion.GetItem(0)";
mostCurrent._tip = mostCurrent._combo_impresion._getitem /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=2293873;
 //BA.debugLineNum = 2293873;BA.debugLine="Btn_Buscar_Click";
_btn_buscar_click();
RDebugUtils.currentLine=2293876;
 //BA.debugLineNum = 2293876;BA.debugLine="End Sub";
return "";
}
public static String  _leerdatos() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "leerdatos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "leerdatos", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub LeerDatos()";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map")) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
mostCurrent._datos = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map");
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="PrinterIP = datos.Get(\"Ip\")";
mostCurrent._printerip = BA.ObjectToString(mostCurrent._datos.Get((Object)("Ip")));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="stringPrecio1 = datos.Get(\"KOLT\")";
mostCurrent._stringprecio1 = BA.ObjectToString(mostCurrent._datos.Get((Object)("KOLT")));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="PrinterPort = datos.Get(\"Puerto\")";
_printerport = (int)(BA.ObjectToNumber(mostCurrent._datos.Get((Object)("Puerto"))));
 }else {
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora."),BA.ObjectToCharSequence("Alerta"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Log(\"El archivo no existe.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("62424844","El archivo no existe.",0);
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
mostCurrent._datos.Initialize();
 };
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="End Sub";
return "";
}
public static String  _btn_buscar_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_buscar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_buscar_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub Btn_Buscar_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Panel_Buscador.Visible = True";
mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Btn_Buscar.Visible = False";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Txt_codigo.Text = \"\"";
mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Txt_codigo.RequestFocus";
mostCurrent._txt_codigo.RequestFocus();
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="IME1.HideKeyboard";
mostCurrent._ime1.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="If YaBusco = False Then";
if (_yabusco==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="If Panel_Buscador.Visible = True Then";
if (mostCurrent._panel_buscador.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Panel_Buscador.Visible = False";
mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Btn_Buscar.Visible = True";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Panelinfo.Visible = True";
mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="else If PanelVista.Visible = True Then";
if (mostCurrent._panelvista.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="PanelVista.Visible = False";
mostCurrent._panelvista.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Btn_Buscar.Visible = True";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="Panelinfo.Visible = True";
mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="Btn_Volver_Click";
_btn_volver_click();
 }}
;
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="End Sub";
return false;
}
public static void  _btn_volver_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_volver_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_volver_click", null); return;}
ResumableSub_Btn_Volver_Click rsub = new ResumableSub_Btn_Volver_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Volver_Click extends BA.ResumableSub {
public ResumableSub_Btn_Volver_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_impresion parent;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Msgbox2Async(\"Si sales, se perdera la información";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Si sales, se perdera la información de la etiqueta actual"),BA.ObjectToCharSequence("Advertencia"),"Salir","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "btn_volver_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="If(Result = DialogResponse.POSITIVE ) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_impresion";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _addlinebreak(String _str) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addlinebreak", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addlinebreak", new Object[] {_str}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub AddLineBreak(str As String) As String";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If str.Length > 22 Then";
if (_str.length()>22) { 
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Return str.SubString2(0, 22) & \"\\n\" & str.SubStr";
if (true) return _str.substring((int) (0),(int) (22))+"\\n"+_str.substring((int) (22));
 }else {
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Return str";
if (true) return _str;
 };
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="End Sub";
return "";
}
public static String  _b4xcombobox1_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "b4xcombobox1_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "b4xcombobox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="selectedString = B4XComboBox1.GetItem(Index)";
mostCurrent._selectedstring = mostCurrent._b4xcombobox1._getitem /*String*/ (null,_index);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _bsc(String _tipo,String _codigo,Object _me_,String _empresa,String _sucursal,String _bodega,String _lista) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bsc", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "bsc", new Object[] {_tipo,_codigo,_me_,_empresa,_sucursal,_bodega,_lista}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub Bsc(Tipo As String, Codigo As String,";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_Inv_TraerProductoInventarioTicket xmlns=\"http://BakApp\">\n"+"      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_empresa))+"</_Empresa>\n"+"      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sucursal))+"</_Sucursal>\n"+"      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_bodega))+"</_Bodega>\n"+"      <_Tipo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipo))+"</_Tipo>\n"+"      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codigo))+"</_Codigo>\n"+"	   <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lista))+"</_Lista>\n"+"    </Sb_Inv_TraerProductoInventarioTicket>\n"+"  </soap:Body>\n"+"</soap:Envelope>\n"+"");
RDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=3342356;
 //BA.debugLineNum = 3342356;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=3342357;
 //BA.debugLineNum = 3342357;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=3342358;
 //BA.debugLineNum = 3342358;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=3342359;
 //BA.debugLineNum = 3342359;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_Inv_TraerProductoInventarioTicket\""));
RDebugUtils.currentLine=3342360;
 //BA.debugLineNum = 3342360;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="End Sub";
return null;
}
public static void  _btn_buscarprod_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_buscarprod_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_buscarprod_click", null); return;}
ResumableSub_Btn_BuscarProd_Click rsub = new ResumableSub_Btn_BuscarProd_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_BuscarProd_Click extends BA.ResumableSub {
public ResumableSub_Btn_BuscarProd_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_impresion parent;
int _ac = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Log(\"Preess\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63014657","Preess",0);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If(Txt_codigo.Text <> \"\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (((parent.mostCurrent._txt_codigo.getText()).equals("") == false)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="IME1.HideKeyboard";
parent.mostCurrent._ime1.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="wait for(Buscar_x_Comentario(selectedString,Txt_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "btn_buscarprod_click"), _buscar_x_comentario(parent.mostCurrent._selectedstring,parent.mostCurrent._txt_codigo.getText(),frm_impresion.getObject()));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_ac = (Integer) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscar_x_comentario(String _tipo,String _vdescripcion,Object _me_) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buscar_x_comentario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "buscar_x_comentario", new Object[] {_tipo,_vdescripcion,_me_}));}
ResumableSub_Buscar_x_Comentario rsub = new ResumableSub_Buscar_x_Comentario(null,_tipo,_vdescripcion,_me_);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Buscar_x_Comentario extends BA.ResumableSub {
public ResumableSub_Buscar_x_Comentario(BaKapp.Movil.Tag.frm_impresion parent,String _tipo,String _vdescripcion,Object _me_) {
this.parent = parent;
this._tipo = _tipo;
this._vdescripcion = _vdescripcion;
this._me_ = _me_;
}
BaKapp.Movil.Tag.frm_impresion parent;
String _tipo;
String _vdescripcion;
Object _me_;
String _vcadena = "";
String _consulta_sql = "";
String _empresa = "";
String _sucursal = "";
String _bodega = "";
String _consul = "";
String _tabcodal = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="DataList.Clear";
parent._datalist.Clear();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="ListView1.Clear";
parent.mostCurrent._listview1.Clear();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Dim vCadena As String";
_vcadena = "";
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescr";
_vcadena = parent.mostCurrent._funciones._fx_cadena_a_buscar_sql /*String*/ (mostCurrent.activityBA,_vdescripcion,"Mp.KOPR+Mp.NOKOPR"+" LIKE '%","");
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="ProgressDialogShow(\"Buscando prooductos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando prooductos..."));
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="Dim Consul As String  = \"\"";
_consul = "";
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="Dim tabcodal As String = \"\"";
_tabcodal = "";
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="If selectedString = \"Tecnico\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((parent.mostCurrent._selectedstring).equals("Tecnico")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=3407895;
 //BA.debugLineNum = 3407895;BA.debugLine="else if selectedString = \"Rapido\" Then";
if ((parent.mostCurrent._selectedstring).equals("Rapido")) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=3407899;
 //BA.debugLineNum = 3407899;BA.debugLine="Else if selectedString = \"Principal\" Then";
if ((parent.mostCurrent._selectedstring).equals("Principal")) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=3407905;
 //BA.debugLineNum = 3407905;BA.debugLine="Else if selectedString = \"Descripcion\" Then";
if ((parent.mostCurrent._selectedstring).equals("Descripcion")) { 
this.state = 9;
}}}}
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=3407893;
 //BA.debugLineNum = 3407893;BA.debugLine="Consul = \"WHERE Mp.KOPRTE  Like '%\" & vCadena &";
_consul = "WHERE Mp.KOPRTE  Like '%"+_vcadena+"%'";
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="Consul = \"WHERE Mp.KOPRRA  Like '%\" & vCadena &";
_consul = "WHERE Mp.KOPRRA  Like '%"+_vcadena+"%'";
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=3407901;
 //BA.debugLineNum = 3407901;BA.debugLine="Consul = \"WHERE (Mp.KOPR  Like '%\" & vCadena & \"";
_consul = "WHERE (Mp.KOPR  Like '%"+_vcadena+"%') OR ((ta.KOPRAL = '"+_vdescripcion+"' ) and (ta.KOEN = '')) ";
RDebugUtils.currentLine=3407902;
 //BA.debugLineNum = 3407902;BA.debugLine="tabcodal = \"left join TABCODAL ta on Mp.KOPR = t";
_tabcodal = "left join TABCODAL ta on Mp.KOPR = ta.KOPR";
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3407907;
 //BA.debugLineNum = 3407907;BA.debugLine="Consul = \"WHERE Mp.NOKOPR  Like '%\" & vCadena &";
_consul = "WHERE Mp.NOKOPR  Like '%"+_vcadena+"%'";
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3407912;
 //BA.debugLineNum = 3407912;BA.debugLine="Consulta_Sql = \"SELECT distinct TOP (25) Mp.KOPR";
_consulta_sql = "SELECT distinct TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEPR Mp With (Nolock)"+anywheresoftware.b4a.keywords.Common.CRLF+"RIGHT Join MAEST Ms On Ms.EMPRESA = '"+_empresa+"' And Ms.KOSU = '"+_sucursal+"' AND Ms.KOBO = '"+_bodega+"' AND Mp.KOPR = Ms.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"RIGHT Join TABBOPR Tb On Tb.EMPRESA = '"+_empresa+"' And Tb.KOSU = '"+_sucursal+"' AND Tb.KOBO = '"+_bodega+"' AND Tb.KOPR = Ms.KOPR "+anywheresoftware.b4a.keywords.Common.CRLF+_tabcodal+anywheresoftware.b4a.keywords.Common.CRLF+_consul+anywheresoftware.b4a.keywords.Common.CRLF+"Order by Mp.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Option ( Fast 25 )";
RDebugUtils.currentLine=3407926;
 //BA.debugLineNum = 3407926;BA.debugLine="Consulta_Sql = $\"SELECT distinct TOP (25) Mp.KOPR";
_consulta_sql = ("SELECT distinct TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR, KOPRRA as RAPIDO,\n"+"Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL\n"+"From MAEPR Mp With (Nolock)\n"+"left join TABCODAL ta on Mp.KOPR = ta.KOPR\n"+"inner join MAEPREM Me on Me.EMPRESA = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_empresa))+"' and Me.KOPR = Mp.KOPR\n"+"\n"+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_consul))+"\n"+"Order by Mp.KOPR");
RDebugUtils.currentLine=3407936;
 //BA.debugLineNum = 3407936;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,_consulta_sql,frm_impresion.getObject());
RDebugUtils.currentLine=3407937;
 //BA.debugLineNum = 3407937;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "buscar_x_comentario"), (Object)(_js));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=3407938;
 //BA.debugLineNum = 3407938;BA.debugLine="If Js.Success Then";
if (true) break;

case 11:
//if
this.state = 22;
if (_js._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3407940;
 //BA.debugLineNum = 3407940;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=3407942;
 //BA.debugLineNum = 3407942;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=3407944;
 //BA.debugLineNum = 3407944;BA.debugLine="ParseJSON(vJson)";
_parsejson(_vjson);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=3407950;
 //BA.debugLineNum = 3407950;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se encontraron registros"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=3407958;
 //BA.debugLineNum = 3407958;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3407960;
 //BA.debugLineNum = 3407960;BA.debugLine="Return 1";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(1));return;};
RDebugUtils.currentLine=3407962;
 //BA.debugLineNum = 3407962;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_calibrar_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_calibrar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_calibrar_click", null); return;}
ResumableSub_Btn_Calibrar_Click rsub = new ResumableSub_Btn_Calibrar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Calibrar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Calibrar_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_impresion parent;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;
String _zpl = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Msgbox2Async(\"¿Estas seguro de calibrar la impres";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de calibrar la impresora?"),BA.ObjectToCharSequence("Impresora"),"Aceptar","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "btn_calibrar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="If(Result <> DialogResponse.POSITIVE ) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="Dim zpl As String = $\"^XA ~JC ^XZ\"$";
_zpl = ("^XA\n"+"~JC\n"+"^XZ");
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="EnviarCalibrar(zpl)";
_enviarcalibrar(_zpl);
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _enviarcalibrar(String _zpl) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "enviarcalibrar", false))
	 {Debug.delegate(mostCurrent.activityBA, "enviarcalibrar", new Object[] {_zpl}); return;}
ResumableSub_EnviarCalibrar rsub = new ResumableSub_EnviarCalibrar(null,_zpl);
rsub.resume(processBA, null);
}
public static class ResumableSub_EnviarCalibrar extends BA.ResumableSub {
public ResumableSub_EnviarCalibrar(BaKapp.Movil.Tag.frm_impresion parent,String _zpl) {
this.parent = parent;
this._zpl = _zpl;
}
BaKapp.Movil.Tag.frm_impresion parent;
String _zpl;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
boolean _success = false;
String _residuales = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 28;
this.catchState = 23;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 23;
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent._connectedprinter.IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="If ConnectedPrinter.Connected Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._connectedprinter.getConnected()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63997706","Conexión anterior cerrada.",0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
parent.mostCurrent._connectedprinter.Initialize("ConnectedPrinter");
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
parent.mostCurrent._connectedprinter.Connect(processBA,parent.mostCurrent._printerip,parent._printerport,(int) (5000));
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("connectedprinter_connected", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviarcalibrar"), null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="If Success Then";
if (true) break;

case 12:
//if
this.state = 21;
if (_success) { 
this.state = 14;
}else {
this.state = 20;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="Log(\"Conectado a la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63997716","Conectado a la impresora.",0);
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Mandando a impresión..."));
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="If AStreams.IsInitialized Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent._astreams.IsInitialized()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
parent.mostCurrent._astreams.Close();
 if (true) break;

case 18:
//C
this.state = 21;
;
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
parent.mostCurrent._astreams.Initialize(processBA,parent.mostCurrent._connectedprinter.getInputStream(),parent.mostCurrent._connectedprinter.getOutputStream(),"AStreams");
RDebugUtils.currentLine=3997724;
 //BA.debugLineNum = 3997724;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
_residuales = "^XA^IDR:*.*^XZ";
RDebugUtils.currentLine=3997725;
 //BA.debugLineNum = 3997725;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_residuales.getBytes("UTF8"));
RDebugUtils.currentLine=3997727;
 //BA.debugLineNum = 3997727;BA.debugLine="AStreams.Write(ZPL.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_zpl.getBytes("UTF8"));
RDebugUtils.currentLine=3997728;
 //BA.debugLineNum = 3997728;BA.debugLine="Log(\"Impresora Calibrada Exitosamente.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63997728","Impresora Calibrada Exitosamente.",0);
RDebugUtils.currentLine=3997729;
 //BA.debugLineNum = 3997729;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3997730;
 //BA.debugLineNum = 3997730;BA.debugLine="ToastMessageShow(\"Calibración completa\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Calibración completa"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=3997733;
 //BA.debugLineNum = 3997733;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3997734;
 //BA.debugLineNum = 3997734;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63997734","Error al conectar con la impresora.",0);
RDebugUtils.currentLine=3997735;
 //BA.debugLineNum = 3997735;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=3997736;
 //BA.debugLineNum = 3997736;BA.debugLine="Msgbox2Async(\"Error de comandos\" , \"Error al ca";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de comandos"),BA.ObjectToCharSequence("Error al calibrar"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3997737;
 //BA.debugLineNum = 3997737;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviarcalibrar"), null);
this.state = 30;
return;
case 30:
//C
this.state = 21;
_result = (Integer) result[0];
;
 if (true) break;

case 21:
//C
this.state = 28;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=3997740;
 //BA.debugLineNum = 3997740;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3997741;
 //BA.debugLineNum = 3997741;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("63997741","Error al enviar la etiqueta: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=3997742;
 //BA.debugLineNum = 3997742;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=3997743;
 //BA.debugLineNum = 3997743;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3997744;
 //BA.debugLineNum = 3997744;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviarcalibrar"), null);
this.state = 31;
return;
case 31:
//C
this.state = 24;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=3997747;
 //BA.debugLineNum = 3997747;BA.debugLine="If ConnectedPrinter.Connected Then";
if (true) break;

case 24:
//if
this.state = 27;
if (parent.mostCurrent._connectedprinter.getConnected()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=3997748;
 //BA.debugLineNum = 3997748;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
RDebugUtils.currentLine=3997749;
 //BA.debugLineNum = 3997749;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63997749","Conexión cerrada después de enviar.",0);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3997752;
 //BA.debugLineNum = 3997752;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _btn_cerrarbuscador_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cerrarbuscador_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cerrarbuscador_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub Btn_CerrarBuscador_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If YaBusco = False Then";
if (_yabusco==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Btn_Buscar.Visible= True";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Panel_Buscador.Visible = False";
mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cerrarview_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cerrarview_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cerrarview_click", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub Btn_cerrarVIEW_Click";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="PanelVista.Visible =False";
mostCurrent._panelvista.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Panelinfo.Visible=True";
mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Btn_Buscar.Visible = True";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="End Sub";
return "";
}
public static String  _btn_imprimir_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_imprimir_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_imprimir_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub Btn_imprimir_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="EnviarEtiqueta(etiqueta_ZPL)";
_enviaretiqueta(mostCurrent._etiqueta_zpl);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static void  _enviaretiqueta(String _zpl) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "enviaretiqueta", false))
	 {Debug.delegate(mostCurrent.activityBA, "enviaretiqueta", new Object[] {_zpl}); return;}
ResumableSub_EnviarEtiqueta rsub = new ResumableSub_EnviarEtiqueta(null,_zpl);
rsub.resume(processBA, null);
}
public static class ResumableSub_EnviarEtiqueta extends BA.ResumableSub {
public ResumableSub_EnviarEtiqueta(BaKapp.Movil.Tag.frm_impresion parent,String _zpl) {
this.parent = parent;
this._zpl = _zpl;
}
BaKapp.Movil.Tag.frm_impresion parent;
String _zpl;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
String _fechaactual = "";
boolean _success = false;
int _i = 0;
String _residuales = "";
int _result = 0;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 27;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 27;
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Dim FechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="ProgressDialogShow(\"Imprimiendo etiquetas\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Imprimiendo etiquetas"));
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent._connectedprinter.IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="If ConnectedPrinter.Connected Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._connectedprinter.getConnected()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("64063246","Conexión anterior cerrada.",0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
parent.mostCurrent._connectedprinter.Initialize("ConnectedPrinter");
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
parent.mostCurrent._connectedprinter.Connect(processBA,parent.mostCurrent._printerip,parent._printerport,(int) (5000));
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("connectedprinter_connected", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiqueta"), null);
this.state = 33;
return;
case 33:
//C
this.state = 12;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="If Success Then";
if (true) break;

case 12:
//if
this.state = 25;
if (_success) { 
this.state = 14;
}else {
this.state = 24;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="Log(\"Conectado a la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("64063256","Conectado a la impresora.",0);
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="If AStreams.IsInitialized Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent._astreams.IsInitialized()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=4063260;
 //BA.debugLineNum = 4063260;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
parent.mostCurrent._astreams.Close();
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
parent.mostCurrent._astreams.Initialize(processBA,parent.mostCurrent._connectedprinter.getInputStream(),parent.mostCurrent._connectedprinter.getOutputStream(),"AStreams");
RDebugUtils.currentLine=4063263;
 //BA.debugLineNum = 4063263;BA.debugLine="For i = 1 To cantidad";
if (true) break;

case 19:
//for
this.state = 22;
step20 = 1;
limit20 = parent._cantidad;
_i = (int) (1) ;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 22;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 21;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step20)) ;
if (true) break;

case 21:
//C
this.state = 35;
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
_residuales = "^XA^IDR:*.*^XZ";
RDebugUtils.currentLine=4063265;
 //BA.debugLineNum = 4063265;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_residuales.getBytes("UTF8"));
RDebugUtils.currentLine=4063267;
 //BA.debugLineNum = 4063267;BA.debugLine="AStreams.Write(zpl.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_zpl.getBytes("UTF8"));
RDebugUtils.currentLine=4063268;
 //BA.debugLineNum = 4063268;BA.debugLine="Log(\"Etiqueta enviada exitosamente.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("64063268","Etiqueta enviada exitosamente.",0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
;
RDebugUtils.currentLine=4063271;
 //BA.debugLineNum = 4063271;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4063272;
 //BA.debugLineNum = 4063272;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=4063273;
 //BA.debugLineNum = 4063273;BA.debugLine="ToastMessageShow(\"impresión exitosa\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("impresión exitosa"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=4063276;
 //BA.debugLineNum = 4063276;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4063277;
 //BA.debugLineNum = 4063277;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("64063277","Error al conectar con la impresora.",0);
RDebugUtils.currentLine=4063278;
 //BA.debugLineNum = 4063278;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=4063279;
 //BA.debugLineNum = 4063279;BA.debugLine="Msgbox2Async(\"Error de impresión\" , \"Error al i";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión"),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4063280;
 //BA.debugLineNum = 4063280;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiqueta"), null);
this.state = 36;
return;
case 36:
//C
this.state = 25;
_result = (Integer) result[0];
;
 if (true) break;

case 25:
//C
this.state = 32;
;
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
RDebugUtils.currentLine=4063283;
 //BA.debugLineNum = 4063283;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=4063284;
 //BA.debugLineNum = 4063284;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("64063284","Error al enviar la etiqueta: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=4063285;
 //BA.debugLineNum = 4063285;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=4063286;
 //BA.debugLineNum = 4063286;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4063287;
 //BA.debugLineNum = 4063287;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiqueta"), null);
this.state = 37;
return;
case 37:
//C
this.state = 28;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=4063290;
 //BA.debugLineNum = 4063290;BA.debugLine="If ConnectedPrinter.Connected Then";
if (true) break;

case 28:
//if
this.state = 31;
if (parent.mostCurrent._connectedprinter.getConnected()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=4063291;
 //BA.debugLineNum = 4063291;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
RDebugUtils.currentLine=4063292;
 //BA.debugLineNum = 4063292;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("64063292","Conexión cerrada después de enviar.",0);
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4063295;
 //BA.debugLineNum = 4063295;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _btn_limpiar_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_limpiar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_limpiar_click", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub Btn_limpiar_Click";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Txt_codigo.Text = \"\"";
mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public static String  _btn_mas_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_mas_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_mas_click", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub Btn_mas_Click";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Ancho = Ancho + 0.5";
_ancho = (float) (_ancho+0.5);
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Alto = Alto + 0.5";
_alto = (float) (_alto+0.5);
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Btn_Ver_Click";
_btn_ver_click();
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="End Sub";
return "";
}
public static void  _btn_ver_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ver_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_ver_click", null); return;}
ResumableSub_Btn_Ver_Click rsub = new ResumableSub_Btn_Ver_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Ver_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ver_Click(BaKapp.Movil.Tag.frm_impresion parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_impresion parent;
String _fechaactual = "";
String _zpl = "";
BaKapp.Movil.Tag.httpjob _job = null;
BaKapp.Movil.Tag.httpjob _j = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Panelinfo.Visible=False";
parent.mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim FechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="FechaActual = DateTime.Date(DateTime.Now)";
_fechaactual = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Dim zpl As String = etiqueta_ZPL";
_zpl = parent.mostCurrent._etiqueta_zpl;
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Dim job As HttpJob";
_job = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,processBA,"",frm_impresion.getObject());
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/prin";
_job._poststring /*String*/ (null,("https://api.labelary.com/v1/printers/8dpmm/labels/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._ancho))+"x"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._alto))+"/0/"),_zpl);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"image/png\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","image/png");
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "btn_ver_click"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="ImageView1.Bitmap = bmp";
parent.mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("64390928","Error: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="ToastMessageShow(\"No se pudo generar la etiqueta";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se pudo generar la etiqueta"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="PanelVista.Visible=True";
parent.mostCurrent._panelvista.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="Btn_Buscar.Visible = False";
parent.mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4390934;
 //BA.debugLineNum = 4390934;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_menos_click() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_menos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_menos_click", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub Btn_Menos_Click";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Ancho = Ancho - 0.5";
_ancho = (float) (_ancho-0.5);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Alto = Alto - 0.5";
_alto = (float) (_alto-0.5);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Btn_Ver_Click";
_btn_ver_click();
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="End Sub";
return "";
}
public static String  _parsejson(String _json) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parsejson", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "parsejson", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._tabledata _data = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub ParseJSON(json As String)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="DataList.Initialize";
_datalist.Initialize();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Dim data As TableData";
_data = new BaKapp.Movil.Tag.frm_impresion._tabledata();
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="data.CODIGO = entry.Get(\"CODIGO\")";
_data.CODIGO /*String*/  = BA.ObjectToString(_entry.Get((Object)("CODIGO")));
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="data.CODTECNICO = entry.Get(\"CODTECNICO\")";
_data.CODTECNICO /*String*/  = BA.ObjectToString(_entry.Get((Object)("CODTECNICO")));
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="data.DESCRIPCION = entry.Get(\"DESCRIPCION\")";
_data.DESCRIPCION /*String*/  = BA.ObjectToString(_entry.Get((Object)("DESCRIPCION")));
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="data.MRPR = entry.Get(\"MRPR\")";
_data.MRPR /*String*/  = BA.ObjectToString(_entry.Get((Object)("MRPR")));
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="data.RAPIDO = entry.Get(\"RAPIDO\")";
_data.RAPIDO /*String*/  = BA.ObjectToString(_entry.Get((Object)("RAPIDO")));
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="data.KOPRAL = entry.Get(\"KOPRAL\")";
_data.KOPRAL /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOPRAL")));
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="DataList.Add(data)";
_datalist.Add((Object)(_data));
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="ListView1.AddTwoLinesAndBitmap(\"Codigo: \"&data.C";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence("Codigo: "+_data.CODIGO /*String*/ ),BA.ObjectToCharSequence(_data.DESCRIPCION /*String*/ ),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 }
};
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="End Sub";
return "";
}
public static void  _combo_impresion_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "combo_impresion_selectedindexchanged", false))
	 {Debug.delegate(mostCurrent.activityBA, "combo_impresion_selectedindexchanged", new Object[] {_index}); return;}
ResumableSub_Combo_Impresion_SelectedIndexChanged rsub = new ResumableSub_Combo_Impresion_SelectedIndexChanged(null,_index);
rsub.resume(processBA, null);
}
public static class ResumableSub_Combo_Impresion_SelectedIndexChanged extends BA.ResumableSub {
public ResumableSub_Combo_Impresion_SelectedIndexChanged(BaKapp.Movil.Tag.frm_impresion parent,int _index) {
this.parent = parent;
this._index = _index;
}
BaKapp.Movil.Tag.frm_impresion parent;
int _index;
BaKapp.Movil.Tag.httpjob _js2 = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
boolean _escorrecto = false;
String _etiqueta = "";
String _mensaje = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result5 = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="tip = Combo_Impresion.GetItem(Index)";
parent.mostCurrent._tip = parent.mostCurrent._combo_impresion._getitem /*String*/ (null,_index);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me";
_js2 = _sb_imprimiretiquetazpl_01(frm_impresion.getObject(),parent._objselec.Principal /*String*/ );
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Wait For (Js2) JobDone(Js2 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "combo_impresion_selectedindexchanged"), (Object)(_js2));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js2 = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="If Js2.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_js2._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="parser.Initialize(Js2.GetString)";
_parser.Initialize(_js2._getstring /*String*/ (null));
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Dim EsCorrecto As Boolean = m.Get(\"EsCorrecto\")";
_escorrecto = BA.ObjectToBoolean(_m.Get((Object)("EsCorrecto")));
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="Dim Etiqueta As String = m.Get(\"Etiqueta\")";
_etiqueta = BA.ObjectToString(_m.Get((Object)("Etiqueta")));
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="Dim Mensaje As String = m.Get(\"Mensaje\")";
_mensaje = BA.ObjectToString(_m.Get((Object)("Mensaje")));
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="If EsCorrecto Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_escorrecto) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="etiqueta_ZPL = Etiqueta";
parent.mostCurrent._etiqueta_zpl = _etiqueta;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="Msgbox2Async(\"Error creando la etiqueta.\", \"Err";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error creando la etiqueta."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "combo_impresion_selectedindexchanged"), null);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=4128794;
 //BA.debugLineNum = 4128794;BA.debugLine="Log(\"Error en la petición HTTP\")";
anywheresoftware.b4a.keywords.Common.LogImpl("64128794","Error en la petición HTTP",0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=4128797;
 //BA.debugLineNum = 4128797;BA.debugLine="Js2.Release";
_js2._release /*String*/ (null);
RDebugUtils.currentLine=4128798;
 //BA.debugLineNum = 4128798;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static BaKapp.Movil.Tag.httpjob  _sb_imprimiretiquetazpl_01(Object _me_,String _codigo) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_imprimiretiquetazpl_01", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_imprimiretiquetazpl_01", new Object[] {_me_,_codigo}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Sb_ImprimirEtiquetaZPL_01(Me_ As Object";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_ImprimirEtiquetaZPL_01 xmlns=\"http://BakApp\">\n"+"      <_NombreEtiqueta>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tip))+"</_NombreEtiqueta>\n"+"      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codigo))+"</_Codigo>\n"+"      <_CodLista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._stringprecio1))+"</_CodLista>\n"+"      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._variables._gl_empresa /*String*/ ))+"</_Empresa>\n"+"      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._variables._gl_sucursal /*String*/ ))+"</_Sucursal>\n"+"      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._variables._gl_bodega /*String*/ ))+"</_Bodega>\n"+"      <_CodAlternativo></_CodAlternativo>\n"+"    </Sb_ImprimirEtiquetaZPL_01>\n"+"  </soap:Body>\n"+"</soap:Envelope>");
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="Dim PostString As String = \"http://\" & Variables.";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="Js.Initialize(\"\", Me_)";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=4653077;
 //BA.debugLineNum = 4653077;BA.debugLine="Js.PostString(PostString, vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=4653078;
 //BA.debugLineNum = 4653078;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\", \"http://Bak";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction","http://BakApp/Sb_ImprimirEtiquetaZPL_01");
RDebugUtils.currentLine=4653081;
 //BA.debugLineNum = 4653081;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=4653083;
 //BA.debugLineNum = 4653083;BA.debugLine="End Sub";
return null;
}
public static String  _combo_tipobusqueda_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "combo_tipobusqueda_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "combo_tipobusqueda_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub Combo_TipoBusqueda_SelectedIndexChange";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="selectedString = Combo_TipoBusqueda.GetItem(Index";
mostCurrent._selectedstring = mostCurrent._combo_tipobusqueda._getitem /*String*/ (null,_index);
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public static String  _crearzplbodega(String _cod,String _desc,String _fech,String _titulo) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "crearzplbodega", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "crearzplbodega", new Object[] {_cod,_desc,_fech,_titulo}));}
String _cpcl = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub CrearZPLBodega(Cod As String, Desc As String,";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim CPCL As String";
_cpcl = "";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="CPCL = $\"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^";
_cpcl = ("^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ\n"+"^XA\n"+"^MMT\n"+"^PW432\n"+"^LL0240\n"+"^LS0\n"+"^BY2,3,48^FT51,100^BCN,,Y,N\n"+"^FD>:<Codigo>^FS\n"+"^FT18,29^A0N,18,43^FH\\^FD<Titulo>^FS\n"+"^FT18,151^A0N,14,14^FH\\^FD<Desc1>^FS\n"+"^FT18,172^A0N,14,14^FH\\^FD<Desc2>^FS\n"+"^FT141,219^A0N,18,33^FH\\^FD<Fecha>^FS\n"+"^PQ1,0,1,Y^XZ\n"+"");
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="CPCL = CPCL.Replace(\"<Codigo>\", Cod)";
_cpcl = _cpcl.replace("<Codigo>",_cod);
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="CPCL = CPCL.Replace(\"<Titulo>\", Titulo)";
_cpcl = _cpcl.replace("<Titulo>",_titulo);
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="CPCL = CPCL.Replace(\"<Fecha>\", Fech)";
_cpcl = _cpcl.replace("<Fecha>",_fech);
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="CPCL = CPCL.Replace(\"<Desc1>\", Desc)";
_cpcl = _cpcl.replace("<Desc1>",_desc);
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="CPCL = CPCL.Replace(\"ñ\",\"n\")";
_cpcl = _cpcl.replace("ñ","n");
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="CPCL = CPCL.Replace(\"Ñ\",\"N\")";
_cpcl = _cpcl.replace("Ñ","N");
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="Return CPCL";
if (true) return _cpcl;
RDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="End Sub";
return "";
}
public static String  _crearzplventa(String _cod,String _desc,String _dinero,String _fech,String _nom,String _sb) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "crearzplventa", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "crearzplventa", new Object[] {_cod,_desc,_dinero,_fech,_nom,_sb}));}
String _cpcl = "";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub CrearZPLVenta(Cod As String, Desc As String, D";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Dim CPCL As String";
_cpcl = "";
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="CPCL = $\"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^";
_cpcl = ("^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ\n"+"^XA\n"+"^MMT\n"+"^PW432\n"+"^LL0240\n"+"^LS0\n"+"^FT17,38^A0N,34,33^FH\\^FD<Nom>^FS\n"+"^FT19,73^A0N,17,16^FH\\^FD<Sb>^FS\n"+"^SL0\n"+"^FT172,232^A0N,31,31\n"+"^FC%,{,#\n"+"^FD%d/%m/%y^FS\n"+"^FT19,128^A0N,44,45^FH\\^FD<Dinero>^FS\n"+"^FT19,166^A0N,17,14^FH\\^FD<Desc>^FS\n"+"^FT19,197^A0N,17,14^FH\\^FD<Cod>^FS\n"+"^PQ1,0,1,Y^XZ");
RDebugUtils.currentLine=3801127;
 //BA.debugLineNum = 3801127;BA.debugLine="CPCL = CPCL.Replace(\"<Nom>\",Nom)";
_cpcl = _cpcl.replace("<Nom>",_nom);
RDebugUtils.currentLine=3801128;
 //BA.debugLineNum = 3801128;BA.debugLine="CPCL = CPCL.Replace(\"<Dinero>\",Dinero)";
_cpcl = _cpcl.replace("<Dinero>",_dinero);
RDebugUtils.currentLine=3801129;
 //BA.debugLineNum = 3801129;BA.debugLine="CPCL = CPCL.Replace(\"<Fecha>\",Fech)";
_cpcl = _cpcl.replace("<Fecha>",_fech);
RDebugUtils.currentLine=3801130;
 //BA.debugLineNum = 3801130;BA.debugLine="CPCL = CPCL.Replace(\"<Desc>\",Desc)";
_cpcl = _cpcl.replace("<Desc>",_desc);
RDebugUtils.currentLine=3801131;
 //BA.debugLineNum = 3801131;BA.debugLine="CPCL = CPCL.Replace(\"<Cod>\",Cod)";
_cpcl = _cpcl.replace("<Cod>",_cod);
RDebugUtils.currentLine=3801132;
 //BA.debugLineNum = 3801132;BA.debugLine="CPCL = CPCL.Replace(\"<Sb>\",Sb)";
_cpcl = _cpcl.replace("<Sb>",_sb);
RDebugUtils.currentLine=3801133;
 //BA.debugLineNum = 3801133;BA.debugLine="CPCL = CPCL.Replace(\"ñ\",\"n\")";
_cpcl = _cpcl.replace("ñ","n");
RDebugUtils.currentLine=3801134;
 //BA.debugLineNum = 3801134;BA.debugLine="CPCL = CPCL.Replace(\"Ñ\",\"N\")";
_cpcl = _cpcl.replace("Ñ","N");
RDebugUtils.currentLine=3801136;
 //BA.debugLineNum = 3801136;BA.debugLine="Return CPCL";
if (true) return _cpcl;
RDebugUtils.currentLine=3801137;
 //BA.debugLineNum = 3801137;BA.debugLine="End Sub";
return "";
}
public static void  _enviaretiquetazpl(String _zpl) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "enviaretiquetazpl", false))
	 {Debug.delegate(mostCurrent.activityBA, "enviaretiquetazpl", new Object[] {_zpl}); return;}
ResumableSub_EnviarEtiquetaZPL rsub = new ResumableSub_EnviarEtiquetaZPL(null,_zpl);
rsub.resume(processBA, null);
}
public static class ResumableSub_EnviarEtiquetaZPL extends BA.ResumableSub {
public ResumableSub_EnviarEtiquetaZPL(BaKapp.Movil.Tag.frm_impresion parent,String _zpl) {
this.parent = parent;
this._zpl = _zpl;
}
BaKapp.Movil.Tag.frm_impresion parent;
String _zpl;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
boolean _success = false;
String _residuales = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 28;
this.catchState = 23;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 23;
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent._connectedprinter.IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="If ConnectedPrinter.Connected Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._connectedprinter.getConnected()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63932170","Conexión anterior cerrada.",0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
parent.mostCurrent._connectedprinter.Initialize("ConnectedPrinter");
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
parent.mostCurrent._connectedprinter.Connect(processBA,parent.mostCurrent._printerip,parent._printerport,(int) (5000));
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("connectedprinter_connected", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (Boolean) result[0];
;
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="If Success Then";
if (true) break;

case 12:
//if
this.state = 21;
if (_success) { 
this.state = 14;
}else {
this.state = 20;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="Log(\"Conectado a la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63932180","Conectado a la impresora.",0);
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Mandando a impresión..."));
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="If AStreams.IsInitialized Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent.mostCurrent._astreams.IsInitialized()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=3932185;
 //BA.debugLineNum = 3932185;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
parent.mostCurrent._astreams.Close();
 if (true) break;

case 18:
//C
this.state = 21;
;
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStre";
parent.mostCurrent._astreams.Initialize(processBA,parent.mostCurrent._connectedprinter.getInputStream(),parent.mostCurrent._connectedprinter.getOutputStream(),"AStreams");
RDebugUtils.currentLine=3932189;
 //BA.debugLineNum = 3932189;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
_residuales = "^XA^IDR:*.*^XZ";
RDebugUtils.currentLine=3932190;
 //BA.debugLineNum = 3932190;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_residuales.getBytes("UTF8"));
RDebugUtils.currentLine=3932192;
 //BA.debugLineNum = 3932192;BA.debugLine="AStreams.Write(ZPL.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_zpl.getBytes("UTF8"));
RDebugUtils.currentLine=3932193;
 //BA.debugLineNum = 3932193;BA.debugLine="Log(\"Etiqueta enviada exitosamente.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63932193","Etiqueta enviada exitosamente.",0);
RDebugUtils.currentLine=3932196;
 //BA.debugLineNum = 3932196;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3932197;
 //BA.debugLineNum = 3932197;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=3932198;
 //BA.debugLineNum = 3932198;BA.debugLine="Msgbox2Async(\"Se ha impreso la etiqueta\",\"Impre";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se ha impreso la etiqueta"),BA.ObjectToCharSequence("Impresión exitosa"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932199;
 //BA.debugLineNum = 3932199;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 30;
return;
case 30:
//C
this.state = 21;
_result = (Integer) result[0];
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=3932201;
 //BA.debugLineNum = 3932201;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3932202;
 //BA.debugLineNum = 3932202;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63932202","Error al conectar con la impresora.",0);
RDebugUtils.currentLine=3932203;
 //BA.debugLineNum = 3932203;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=3932204;
 //BA.debugLineNum = 3932204;BA.debugLine="Msgbox2Async(\"Error de impresión\" , \"Error al i";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión"),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932205;
 //BA.debugLineNum = 3932205;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (Integer) result[0];
;
 if (true) break;

case 21:
//C
this.state = 28;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=3932208;
 //BA.debugLineNum = 3932208;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3932209;
 //BA.debugLineNum = 3932209;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("63932209","Error al enviar la etiqueta: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=3932210;
 //BA.debugLineNum = 3932210;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=3932211;
 //BA.debugLineNum = 3932211;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932212;
 //BA.debugLineNum = 3932212;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "enviaretiquetazpl"), null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=3932215;
 //BA.debugLineNum = 3932215;BA.debugLine="If ConnectedPrinter.Connected Then";
if (true) break;

case 24:
//if
this.state = 27;
if (parent.mostCurrent._connectedprinter.getConnected()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=3932216;
 //BA.debugLineNum = 3932216;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
RDebugUtils.currentLine=3932217;
 //BA.debugLineNum = 3932217;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63932217","Conexión cerrada después de enviar.",0);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3932220;
 //BA.debugLineNum = 3932220;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _formatearmiles(String _numero) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "formatearmiles", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "formatearmiles", new Object[] {_numero}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _contador = 0;
int _i = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub FormatearMiles(numero As String) As String";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="numero = numero.Replace(\",\", \"\").Replace(\".\", \"\")";
_numero = _numero.replace(",","").replace(".","").trim();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="If numero.Length = 0 Then Return \"\"";
if (_numero.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Dim contador As Int = 0";
_contador = (int) (0);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="For i = numero.Length - 1 To 0 Step -1";
{
final int step6 = -1;
final int limit6 = (int) (0);
_i = (int) (_numero.length()-1) ;
for (;_i >= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="sb.Insert(0, numero.CharAt(i))";
_sb.Insert((int) (0),BA.ObjectToString(_numero.charAt(_i)));
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="contador = contador + 1";
_contador = (int) (_contador+1);
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="If contador Mod 3 = 0 And i > 0 Then";
if (_contador%3==0 && _i>0) { 
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="sb.Insert(0, \".\")";
_sb.Insert((int) (0),".");
 };
 }
};
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="End Sub";
return "";
}
public static void  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_ListView1_ItemClick rsub = new ResumableSub_ListView1_ItemClick(null,_position,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListView1_ItemClick extends BA.ResumableSub {
public ResumableSub_ListView1_ItemClick(BaKapp.Movil.Tag.frm_impresion parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
BaKapp.Movil.Tag.frm_impresion parent;
int _position;
Object _value;
BaKapp.Movil.Tag.frm_impresion._tabledata _selecteddata = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result5 = 0;
BaKapp.Movil.Tag.httpjob _js2 = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
boolean _escorrecto = false;
String _etiqueta = "";
String _mensaje = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_impresion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim selectedData As TableData = DataList.Get(Posi";
_selecteddata = (BaKapp.Movil.Tag.frm_impresion._tabledata)(parent._datalist.Get(_position));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="ProgressDialogShow2(\"Rellenando la etiqueta\", Fal";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Rellenando la etiqueta"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim Js As HttpJob = Bsc(\"Principal\",selectedData.";
_js = _bsc("Principal",_selecteddata.CODIGO /*String*/ ,frm_impresion.getObject(),parent.mostCurrent._variables._gl_empresa /*String*/ ,parent.mostCurrent._variables._gl_sucursal /*String*/ ,parent.mostCurrent._variables._gl_bodega /*String*/ ,parent.mostCurrent._stringprecio1);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "listview1_itemclick"), (Object)(_js));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="If  vJson = $\"{\"Table\":[{\"Codigo\":\"Error_No hay";
if (true) break;

case 4:
//if
this.state = 11;
if ((_vjson).equals(("{\"Table\":[{\"Codigo\":\"Error_No hay ninguna fila en la posición 0.\",\"Version\":\"1.0.0.35\"}]}"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="Msgbox2Async(\"Producto no encontrado en la base";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Producto no encontrado en la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "listview1_itemclick"), null);
this.state = 34;
return;
case 34:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="ParseOtherJSON(Js.GetString)";
_parseotherjson(_js._getstring /*String*/ (null));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="Btn_Buscar.Visible= True";
parent.mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="Panelinfo.Visible = True";
parent.mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080220;
 //BA.debugLineNum = 3080220;BA.debugLine="Panel_Buscador.Visible = False";
parent.mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080221;
 //BA.debugLineNum = 3080221;BA.debugLine="Lbl_codigo.Text = ObjSelec.Principal";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(parent._objselec.Principal /*String*/ ));
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="Lbl_Desc.Text = ObjSelec.Descripcion";
parent.mostCurrent._lbl_desc.setText(BA.ObjectToCharSequence(parent._objselec.Descripcion /*String*/ ));
RDebugUtils.currentLine=3080223;
 //BA.debugLineNum = 3080223;BA.debugLine="Lbl_precio.Text = stringPrecio1";
parent.mostCurrent._lbl_precio.setText(BA.ObjectToCharSequence(parent.mostCurrent._stringprecio1));
RDebugUtils.currentLine=3080225;
 //BA.debugLineNum = 3080225;BA.debugLine="Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me";
_js2 = _sb_imprimiretiquetazpl_01(frm_impresion.getObject(),parent._objselec.Principal /*String*/ );
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="Wait For (Js2) JobDone(Js2 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "listview1_itemclick"), (Object)(_js2));
this.state = 35;
return;
case 35:
//C
this.state = 13;
_js2 = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=3080228;
 //BA.debugLineNum = 3080228;BA.debugLine="If Js2.Success Then";
if (true) break;

case 13:
//if
this.state = 32;
if (_js2._success /*boolean*/ ) { 
this.state = 15;
}else {
this.state = 27;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=3080229;
 //BA.debugLineNum = 3080229;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3080230;
 //BA.debugLineNum = 3080230;BA.debugLine="parser.Initialize(Js2.GetString)";
_parser.Initialize(_js2._getstring /*String*/ (null));
RDebugUtils.currentLine=3080232;
 //BA.debugLineNum = 3080232;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
RDebugUtils.currentLine=3080233;
 //BA.debugLineNum = 3080233;BA.debugLine="Dim EsCorrecto As Boolean = m.Get(\"EsCorrecto\")";
_escorrecto = BA.ObjectToBoolean(_m.Get((Object)("EsCorrecto")));
RDebugUtils.currentLine=3080234;
 //BA.debugLineNum = 3080234;BA.debugLine="Dim Etiqueta As String = m.Get(\"Etiqueta\")";
_etiqueta = BA.ObjectToString(_m.Get((Object)("Etiqueta")));
RDebugUtils.currentLine=3080235;
 //BA.debugLineNum = 3080235;BA.debugLine="Dim Mensaje As String = m.Get(\"Mensaje\")";
_mensaje = BA.ObjectToString(_m.Get((Object)("Mensaje")));
RDebugUtils.currentLine=3080236;
 //BA.debugLineNum = 3080236;BA.debugLine="YaBusco = True";
parent._yabusco = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3080237;
 //BA.debugLineNum = 3080237;BA.debugLine="If EsCorrecto Then";
if (true) break;

case 16:
//if
this.state = 25;
if (_escorrecto) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=3080238;
 //BA.debugLineNum = 3080238;BA.debugLine="etiqueta_ZPL = Etiqueta";
parent.mostCurrent._etiqueta_zpl = _etiqueta;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=3080240;
 //BA.debugLineNum = 3080240;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3080242;
 //BA.debugLineNum = 3080242;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=3080243;
 //BA.debugLineNum = 3080243;BA.debugLine="Msgbox2Async(\"Error creando la etiqueta.\", \"Err";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error creando la etiqueta."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080244;
 //BA.debugLineNum = 3080244;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "listview1_itemclick"), null);
this.state = 36;
return;
case 36:
//C
this.state = 21;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=3080246;
 //BA.debugLineNum = 3080246;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 32;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=3080250;
 //BA.debugLineNum = 3080250;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=3080251;
 //BA.debugLineNum = 3080251;BA.debugLine="Msgbox2Async(\"Error de comunicación.\", \"Error\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de comunicación."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080252;
 //BA.debugLineNum = 3080252;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_impresion", "listview1_itemclick"), null);
this.state = 37;
return;
case 37:
//C
this.state = 28;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=3080254;
 //BA.debugLineNum = 3080254;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
if (true) break;

case 28:
//if
this.state = 31;
if (_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=3080256;
 //BA.debugLineNum = 3080256;BA.debugLine="Log(\"Error en la petición HTTP\")";
anywheresoftware.b4a.keywords.Common.LogImpl("63080256","Error en la petición HTTP",0);
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=3080258;
 //BA.debugLineNum = 3080258;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3080260;
 //BA.debugLineNum = 3080260;BA.debugLine="Js2.Release";
_js2._release /*String*/ (null);
RDebugUtils.currentLine=3080261;
 //BA.debugLineNum = 3080261;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _parseotherjson(String _json) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parseotherjson", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "parseotherjson", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._otherdata _data = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub ParseOtherJSON(json As String)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _tablelist;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group5.Get(index5)));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="Dim data As OtherData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherdata();
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="data.Principal = entry.Get(\"Principal\")";
_data.Principal /*String*/  = BA.ObjectToString(_entry.Get((Object)("Principal")));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="data.Rapido = entry.Get(\"Rapido\")";
_data.Rapido /*String*/  = BA.ObjectToString(_entry.Get((Object)("Rapido")));
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="data.Tecnico = entry.Get(\"Tecnico\")";
_data.Tecnico /*String*/  = BA.ObjectToString(_entry.Get((Object)("Tecnico")));
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="data.Rtu = entry.Get(\"Rtu\")";
_data.Rtu /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("Rtu"))));
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="data.Ud1 = entry.Get(\"Ud1\")";
_data.Ud1 /*String*/  = BA.ObjectToString(_entry.Get((Object)("Ud1")));
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="data.Ud2 = entry.Get(\"Ud2\")";
_data.Ud2 /*String*/  = BA.ObjectToString(_entry.Get((Object)("Ud2")));
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="data.Descripcion = entry.Get(\"Descripcion\")";
_data.Descripcion /*String*/  = BA.ObjectToString(_entry.Get((Object)("Descripcion")));
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="data.StFisicoUd1 = entry.Get(\"StFisicoUd1\")";
_data.StFisicoUd1 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("StFisicoUd1"))));
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="data.StFisicoUd2 = entry.Get(\"StFisicoUd2\")";
_data.StFisicoUd2 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("StFisicoUd2"))));
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="data.SuperFamilia = entry.Get(\"SuperFamilia\")";
_data.SuperFamilia /*String*/  = BA.ObjectToString(_entry.Get((Object)("SuperFamilia")));
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="data.NombreSuper = entry.Get(\"NombreSuper\")";
_data.NombreSuper /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreSuper")));
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="data.Familia = entry.Get(\"Familia\")";
_data.Familia /*String*/  = BA.ObjectToString(_entry.Get((Object)("Familia")));
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="data.NombreFamilia = entry.Get(\"NombreFamilia\")";
_data.NombreFamilia /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreFamilia")));
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="data.SubFamilia = entry.Get(\"SubFamilia\")";
_data.SubFamilia /*String*/  = BA.ObjectToString(_entry.Get((Object)("SubFamilia")));
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="data.NombreSub = entry.Get(\"NombreSub\")";
_data.NombreSub /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreSub")));
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="data.MRPR = entry.Get(\"MRPR\")";
_data.MRPR /*String*/  = BA.ObjectToString(_entry.Get((Object)("MRPR")));
RDebugUtils.currentLine=2818073;
 //BA.debugLineNum = 2818073;BA.debugLine="data.MARCA = entry.Get(\"MARCA\")";
_data.MARCA /*String*/  = BA.ObjectToString(_entry.Get((Object)("MARCA")));
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="data.PrecioListaUd1 = entry.Get(\"PrecioListaUd1\"";
_data.PrecioListaUd1 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("PrecioListaUd1"))));
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="data.PrecioListaUd2 = entry.Get(\"PrecioListaUd2\"";
_data.PrecioListaUd2 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("PrecioListaUd2"))));
RDebugUtils.currentLine=2818076;
 //BA.debugLineNum = 2818076;BA.debugLine="ObjSelec = data";
_objselec = _data;
RDebugUtils.currentLine=2818078;
 //BA.debugLineNum = 2818078;BA.debugLine="Log(\"Producto: \" & data.Descripcion & \" - \" & da";
anywheresoftware.b4a.keywords.Common.LogImpl("62818078","Producto: "+_data.Descripcion /*String*/ +" - "+_data.MARCA /*String*/ ,0);
 }
};
RDebugUtils.currentLine=2818081;
 //BA.debugLineNum = 2818081;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _parseetiquetas(String _json) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parseetiquetas", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(mostCurrent.activityBA, "parseetiquetas", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._etiqueta _data = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ParseEtiquetas(Json As String ) As List";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="parser.Initialize(Json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Dim data As Etiqueta";
_data = new BaKapp.Movil.Tag.frm_impresion._etiqueta();
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="data.NombreEtiqueta = entry.Get(\"NombreEtiqueta\"";
_data.NombreEtiqueta /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreEtiqueta")));
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="data.FUNCION = entry.Get(\"FUNCION\")";
_data.FUNCION /*String*/  = BA.ObjectToString(_entry.Get((Object)("FUNCION")));
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _parseotherpricejson(String _json) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parseotherpricejson", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(mostCurrent.activityBA, "parseotherpricejson", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _data = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Dim data As OtherPriceData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherpricedata();
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
_data.TILT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TILT")));
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
_data.KOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOLT")));
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
_data.MELT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MELT")));
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
_data.MOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MOLT")));
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
_data.TIMOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TIMOLT")));
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
_data.NOKOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("NOKOLT")));
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
if (_entry.ContainsKey((Object)("FEVI")) && _entry.Get((Object)("FEVI"))!= null) { 
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
_data.FEVI /*String*/  = BA.ObjectToString(_entry.Get((Object)("FEVI")));
 }else {
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="data.FEVI = \"\"";
_data.FEVI /*String*/  = "";
 };
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
_data.OPERA /*String*/  = BA.ObjectToString(_entry.Get((Object)("OPERA")));
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
_data.ECUDEF01UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF01UD")));
RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
_data.ECUDEF02UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF02UD")));
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
RDebugUtils.currentLine=2883616;
 //BA.debugLineNum = 2883616;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _sb_buscarlistaprecios(Object _me_) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_buscarlistaprecios", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_buscarlistaprecios", new Object[] {_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>");
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_BuscarListaPrecios\""));
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _sb_inv_traerproductoinventarioticket(Object _me_,String _empresa,String _sucursal,String _bodega,String _tipo,String _codigo,String _lista) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_inv_traerproductoinventarioticket", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_inv_traerproductoinventarioticket", new Object[] {_me_,_empresa,_sucursal,_bodega,_tipo,_codigo,_lista}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub Sb_Inv_TraerProductoInventarioTicket(Me";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_Inv_TraerProductoInventarioTicket xmlns=\"http://BakApp\">\n"+"      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_empresa))+"</_Empresa>\n"+"      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sucursal))+"</_Sucursal>\n"+"      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_bodega))+"</_Bodega>\n"+"      <_Tipo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipo))+"</_Tipo>\n"+"      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codigo))+"</_Codigo>\n"+"      <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lista))+"</_Lista>\n"+"    </Sb_Inv_TraerProductoInventarioTicket>\n"+"  </soap:Body>\n"+"</soap:Envelope>");
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="Dim PostString As String = \"http://\" & Variables.";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=3538963;
 //BA.debugLineNum = 3538963;BA.debugLine="Js.Initialize(\"\", Me_)";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="Js.PostString(PostString, vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=3538965;
 //BA.debugLineNum = 3538965;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=3538966;
 //BA.debugLineNum = 3538966;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\", \"http://Bak";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction","http://BakApp/Sb_Inv_TraerProductoInventarioTicket");
RDebugUtils.currentLine=3538968;
 //BA.debugLineNum = 3538968;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=3538970;
 //BA.debugLineNum = 3538970;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _sb_traeretiquetas(Object _me_) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_traeretiquetas", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_traeretiquetas", new Object[] {_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub Sb_TraerEtiquetas(Me_ As Object) As Ht";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_TraerEtiquetas xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>\n"+"");
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_TraerEtiquetas\""));
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="End Sub";
return null;
}
public static String  _spinner_cant_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinner_cant_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinner_cant_itemclick", new Object[] {_position,_value}));}
int _seleccionado = 0;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub Spinner_cant_ItemClick (Position As In";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim seleccionado As Int = Value";
_seleccionado = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="cantidad = seleccionado";
_cantidad = _seleccionado;
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public static String  _txt_codigo_enterpressed() throws Exception{
RDebugUtils.currentModule="frm_impresion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txt_codigo_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txt_codigo_enterpressed", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub Txt_codigo_EnterPressed";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Btn_BuscarProd_Click";
_btn_buscarprod_click();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
}