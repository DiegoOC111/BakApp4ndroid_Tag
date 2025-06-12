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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_impresion");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.List _datalist = null;
public static anywheresoftware.b4a.objects.collections.List _dataprice = null;
public static BaKapp.Movil.Tag.frm_impresion._otherdata _objselec = null;
public static String _tip = "";
public static float _ancho = 0f;
public static float _alto = 0f;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscarprod = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_buscador = null;
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
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
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
public double STFI1;
public String RAPIDO;
public String KOPRAL;
public String DATOSUBIC;
public void Initialize() {
IsInitialized = true;
CODIGO = "";
CODTECNICO = "";
DESCRIPCION = "";
MRPR = "";
STFI1 = 0;
RAPIDO = "";
KOPRAL = "";
DATOSUBIC = "";
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
public static void  _activity_create(boolean _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.frm_impresion parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
BaKapp.Movil.Tag.frm_impresion parent;
boolean _firsttime;
anywheresoftware.b4a.objects.collections.List _stringlist = null;
anywheresoftware.b4a.objects.collections.List _stringlist2 = null;
int _i = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result5 = 0;
BaKapp.Movil.Tag.frm_impresion._etiqueta _et = null;
int step12;
int limit12;
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 61;BA.debugLine="Activity.LoadLayout(\"impresion\")";
parent.mostCurrent._activity.LoadLayout("impresion",mostCurrent.activityBA);
 //BA.debugLineNum = 62;BA.debugLine="DataPrice.Initialize";
parent._dataprice.Initialize();
 //BA.debugLineNum = 63;BA.debugLine="DataList.Initialize";
parent._datalist.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="Dim stringList As List";
_stringlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 65;BA.debugLine="stringList.Initialize";
_stringlist.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="stringList.Add(\"Tecnico\")";
_stringlist.Add((Object)("Tecnico"));
 //BA.debugLineNum = 67;BA.debugLine="stringList.Add(\"Rapido\")";
_stringlist.Add((Object)("Rapido"));
 //BA.debugLineNum = 68;BA.debugLine="stringList.Add(\"Principal\")";
_stringlist.Add((Object)("Principal"));
 //BA.debugLineNum = 69;BA.debugLine="stringList.Add(\"Descripcion\")";
_stringlist.Add((Object)("Descripcion"));
 //BA.debugLineNum = 71;BA.debugLine="Dim stringList2 As List";
_stringlist2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 72;BA.debugLine="stringList2.Initialize";
_stringlist2.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="For i = 1 To 10";
if (true) break;

case 1:
//for
this.state = 4;
step12 = 1;
limit12 = (int) (10);
_i = (int) (1) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 4;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 3:
//C
this.state = 24;
 //BA.debugLineNum = 75;BA.debugLine="Spinner_cant.Add(i) ' B4A lo convierte automátic";
parent.mostCurrent._spinner_cant.Add(BA.NumberToString(_i));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 77;BA.debugLine="Combo_TipoBusqueda.SetItems(stringList)";
parent.mostCurrent._combo_tipobusqueda._setitems /*String*/ (_stringlist);
 //BA.debugLineNum = 78;BA.debugLine="Combo_Impresion.SetItems(stringList2)";
parent.mostCurrent._combo_impresion._setitems /*String*/ (_stringlist2);
 //BA.debugLineNum = 79;BA.debugLine="selectedString = \"Tecnico\"";
parent.mostCurrent._selectedstring = "Tecnico";
 //BA.debugLineNum = 80;BA.debugLine="LeerDatos";
_leerdatos();
 //BA.debugLineNum = 81;BA.debugLine="Dim Js As HttpJob = Sb_TraerEtiquetas(Me)";
_js = _sb_traeretiquetas(frm_impresion.getObject());
 //BA.debugLineNum = 82;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 25;
return;
case 25:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 84;BA.debugLine="If Js.Success Then";
if (true) break;

case 5:
//if
this.state = 22;
if (_js._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 21;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 85;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 87;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 8:
//if
this.state = 15;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 88;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 90;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 91;BA.debugLine="Msgbox2Async(\"Error al buscar las etiquetas.\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar las etiquetas."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 92;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 26;
return;
case 26:
//C
this.state = 11;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 94;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 98;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 101;BA.debugLine="Etiquetas = ParseEtiquetas(vJson)";
parent.mostCurrent._etiquetas = _parseetiquetas(_vjson);
 //BA.debugLineNum = 102;BA.debugLine="For Each ET As Etiqueta In Etiquetas";
if (true) break;

case 16:
//for
this.state = 19;
group33 = parent.mostCurrent._etiquetas;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 19;
if (index33 < groupLen33) {
this.state = 18;
_et = (BaKapp.Movil.Tag.frm_impresion._etiqueta)(group33.Get(index33));}
if (true) break;

case 28:
//C
this.state = 27;
index33++;
if (true) break;

case 18:
//C
this.state = 28;
 //BA.debugLineNum = 103;BA.debugLine="stringList2.Add(ET.NombreEtiqueta)";
_stringlist2.Add((Object)(_et.NombreEtiqueta /*String*/ ));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 107;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 108;BA.debugLine="Msgbox2Async(\"Error al traer las etiquetas.\", \"E";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al traer las etiquetas."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 109;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 29;
return;
case 29:
//C
this.state = 22;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 110;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 112;BA.debugLine="Combo_Impresion.SetItems(stringList2)";
parent.mostCurrent._combo_impresion._setitems /*String*/ (_stringlist2);
 //BA.debugLineNum = 113;BA.debugLine="tip = Combo_Impresion.GetItem(0)";
parent.mostCurrent._tip = parent.mostCurrent._combo_impresion._getitem /*String*/ ((int) (0));
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static void  _msgbox_result(int _result5) throws Exception{
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _addlinebreak(String _str) throws Exception{
 //BA.debugLineNum = 622;BA.debugLine="Sub AddLineBreak(str As String) As String";
 //BA.debugLineNum = 623;BA.debugLine="If str.Length > 22 Then";
if (_str.length()>22) { 
 //BA.debugLineNum = 624;BA.debugLine="Return str.SubString2(0, 22) & \"\\n\" & str.SubStr";
if (true) return _str.substring((int) (0),(int) (22))+"\\n"+_str.substring((int) (22));
 }else {
 //BA.debugLineNum = 626;BA.debugLine="Return str";
if (true) return _str;
 };
 //BA.debugLineNum = 628;BA.debugLine="End Sub";
return "";
}
public static String  _b4xcombobox1_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
 //BA.debugLineNum = 426;BA.debugLine="selectedString = B4XComboBox1.GetItem(Index)";
mostCurrent._selectedstring = mostCurrent._b4xcombobox1._getitem /*String*/ (_index);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _bsc(String _tipo,String _codigo,Object _me_,String _empresa,String _sucursal,String _bodega,String _lista) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 436;BA.debugLine="Private Sub Bsc(Tipo As String, Codigo As String,";
 //BA.debugLineNum = 438;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_Inv_TraerProductoInventarioTicket xmlns=\"http://BakApp\">\n"+"      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_empresa))+"</_Empresa>\n"+"      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sucursal))+"</_Sucursal>\n"+"      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_bodega))+"</_Bodega>\n"+"      <_Tipo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipo))+"</_Tipo>\n"+"      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codigo))+"</_Codigo>\n"+"	   <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lista))+"</_Lista>\n"+"    </Sb_Inv_TraerProductoInventarioTicket>\n"+"  </soap:Body>\n"+"</soap:Envelope>\n"+"");
 //BA.debugLineNum = 453;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 454;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 456;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (processBA,"",_me_);
 //BA.debugLineNum = 457;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 458;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 459;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_Inv_TraerProductoInventarioTicket\""));
 //BA.debugLineNum = 460;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public static String  _btn_buscar_click() throws Exception{
 //BA.debugLineNum = 326;BA.debugLine="Private Sub Btn_Buscar_Click";
 //BA.debugLineNum = 327;BA.debugLine="Panel_Buscador.Visible = True";
mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 328;BA.debugLine="Btn_Buscar.Visible = False";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public static void  _btn_buscarprod_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 332;BA.debugLine="Log(\"Preess\")";
anywheresoftware.b4a.keywords.Common.LogImpl("71638401","Preess",0);
 //BA.debugLineNum = 333;BA.debugLine="If(Txt_codigo.Text <> \"\") Then";
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
 //BA.debugLineNum = 334;BA.debugLine="wait for(Buscar_x_Comentario(selectedString,Txt_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _buscar_x_comentario(parent.mostCurrent._selectedstring,parent.mostCurrent._txt_codigo.getText(),frm_impresion.getObject()));
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
 //BA.debugLineNum = 336;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _ac) throws Exception{
}
public static void  _btn_calibrar_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 937;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 938;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 939;BA.debugLine="Msgbox2Async(\"¿Estas seguro de calibrar la impres";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de calibrar la impresora?"),BA.ObjectToCharSequence("Impresora"),"Aceptar","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 940;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 941;BA.debugLine="If(Result <> DialogResponse.POSITIVE ) Then";
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
 //BA.debugLineNum = 942;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 945;BA.debugLine="Dim zpl As String = $\"^XA ~JC ^XZ\"$";
_zpl = ("^XA\n"+"~JC\n"+"^XZ");
 //BA.debugLineNum = 948;BA.debugLine="EnviarCalibrar(zpl)";
_enviarcalibrar(_zpl);
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_cerrarbuscador_click() throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Private Sub Btn_CerrarBuscador_Click";
 //BA.debugLineNum = 430;BA.debugLine="Btn_Buscar.Visible= True";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 432;BA.debugLine="Panel_Buscador.Visible = False";
mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cerrarview_click() throws Exception{
 //BA.debugLineNum = 976;BA.debugLine="Private Sub Btn_cerrarVIEW_Click";
 //BA.debugLineNum = 977;BA.debugLine="PanelVista.Visible =False";
mostCurrent._panelvista.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 978;BA.debugLine="Panelinfo.Visible=True";
mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 979;BA.debugLine="Btn_Buscar.Visible = True";
mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 981;BA.debugLine="End Sub";
return "";
}
public static String  _btn_imprimir_click() throws Exception{
 //BA.debugLineNum = 619;BA.debugLine="Private Sub Btn_imprimir_Click";
 //BA.debugLineNum = 620;BA.debugLine="EnviarEtiqueta(etiqueta_ZPL)";
_enviaretiqueta(mostCurrent._etiqueta_zpl);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return "";
}
public static String  _btn_mas_click() throws Exception{
 //BA.debugLineNum = 989;BA.debugLine="Private Sub Btn_mas_Click";
 //BA.debugLineNum = 990;BA.debugLine="Ancho = Ancho + 0.5";
_ancho = (float) (_ancho+0.5);
 //BA.debugLineNum = 991;BA.debugLine="Alto = Alto + 0.5";
_alto = (float) (_alto+0.5);
 //BA.debugLineNum = 992;BA.debugLine="Btn_Ver_Click";
_btn_ver_click();
 //BA.debugLineNum = 993;BA.debugLine="End Sub";
return "";
}
public static String  _btn_menos_click() throws Exception{
 //BA.debugLineNum = 983;BA.debugLine="Private Sub Btn_Menos_Click";
 //BA.debugLineNum = 984;BA.debugLine="Ancho = Ancho - 0.5";
_ancho = (float) (_ancho-0.5);
 //BA.debugLineNum = 985;BA.debugLine="Alto = Alto - 0.5";
_alto = (float) (_alto-0.5);
 //BA.debugLineNum = 986;BA.debugLine="Btn_Ver_Click";
_btn_ver_click();
 //BA.debugLineNum = 987;BA.debugLine="End Sub";
return "";
}
public static void  _btn_ver_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 953;BA.debugLine="Panelinfo.Visible=False";
parent.mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 954;BA.debugLine="Dim FechaActual As String";
_fechaactual = "";
 //BA.debugLineNum = 955;BA.debugLine="FechaActual = DateTime.Date(DateTime.Now)";
_fechaactual = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 956;BA.debugLine="Dim zpl As String = etiqueta_ZPL";
_zpl = parent.mostCurrent._etiqueta_zpl;
 //BA.debugLineNum = 958;BA.debugLine="Dim job As HttpJob";
_job = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 959;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (processBA,"",frm_impresion.getObject());
 //BA.debugLineNum = 960;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/prin";
_job._poststring /*String*/ (("https://api.labelary.com/v1/printers/8dpmm/labels/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._ancho))+"x"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._alto))+"/0/"),_zpl);
 //BA.debugLineNum = 961;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"image/png\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Accept","image/png");
 //BA.debugLineNum = 963;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 964;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 965;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ();
 //BA.debugLineNum = 966;BA.debugLine="ImageView1.Bitmap = bmp";
parent.mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 968;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("73014672","Error: "+_j._errormessage /*String*/ ,0);
 //BA.debugLineNum = 969;BA.debugLine="ToastMessageShow(\"No se pudo generar la etiqueta";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se pudo generar la etiqueta"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 971;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 972;BA.debugLine="PanelVista.Visible=True";
parent.mostCurrent._panelvista.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 973;BA.debugLine="Btn_Buscar.Visible = False";
parent.mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 974;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_volver_click() throws Exception{
 //BA.debugLineNum = 925;BA.debugLine="Private Sub Btn_Volver_Click";
 //BA.debugLineNum = 926;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 928;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscar_x_comentario(String _tipo,String _vdescripcion,Object _me_) throws Exception{
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
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 465;BA.debugLine="DataList.Clear";
parent._datalist.Clear();
 //BA.debugLineNum = 466;BA.debugLine="ListView1.Clear";
parent.mostCurrent._listview1.Clear();
 //BA.debugLineNum = 468;BA.debugLine="Dim vCadena As String";
_vcadena = "";
 //BA.debugLineNum = 469;BA.debugLine="vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescr";
_vcadena = parent.mostCurrent._funciones._fx_cadena_a_buscar_sql /*String*/ (mostCurrent.activityBA,_vdescripcion,"Mp.KOPR+Mp.NOKOPR"+" LIKE '%","");
 //BA.debugLineNum = 475;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 476;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 477;BA.debugLine="Dim Sucursal As String = \"CM \"";
_sucursal = "CM ";
 //BA.debugLineNum = 478;BA.debugLine="Dim Bodega As String = \"PR \"";
_bodega = "PR ";
 //BA.debugLineNum = 479;BA.debugLine="Dim Consul As String  = \"\"";
_consul = "";
 //BA.debugLineNum = 481;BA.debugLine="If selectedString = \"Tecnico\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((parent.mostCurrent._selectedstring).equals("Tecnico")) { 
this.state = 3;
}else if((parent.mostCurrent._selectedstring).equals("Rapido")) { 
this.state = 5;
}else if((parent.mostCurrent._selectedstring).equals("Principal")) { 
this.state = 7;
}else if((parent.mostCurrent._selectedstring).equals("Descripcion")) { 
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 10;
 //BA.debugLineNum = 483;BA.debugLine="Consul = \"WHERE Mp.KOPRTE  Like '%\" & vCadena &";
_consul = "WHERE Mp.KOPRTE  Like '%"+_vcadena+"%'";
 if (true) break;

case 5:
//C
this.state = 10;
 //BA.debugLineNum = 487;BA.debugLine="Consul = \"WHERE Mp.KOPRRA  Like '%\" & vCadena &";
_consul = "WHERE Mp.KOPRRA  Like '%"+_vcadena+"%'";
 if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 491;BA.debugLine="Consul = \"WHERE Mp.KOPR  Like '%\" & vCadena & \"%";
_consul = "WHERE Mp.KOPR  Like '%"+_vcadena+"%'";
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 495;BA.debugLine="Consul = \"WHERE Mp.NOKOPR  Like '%\" & vCadena &";
_consul = "WHERE Mp.NOKOPR  Like '%"+_vcadena+"%'";
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 525;BA.debugLine="Consulta_Sql = \"SELECT TOP (25) Mp.KOPR AS CODIGO";
_consulta_sql = "SELECT TOP (25) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1, KOPRRA as RAPIDO,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEPR Mp With (Nolock)"+anywheresoftware.b4a.keywords.Common.CRLF+"RIGHT Join MAEST Ms On Ms.EMPRESA = '"+_empresa+"' And Ms.KOSU = '"+_sucursal+"' AND Ms.KOBO = '"+_bodega+"' AND Mp.KOPR = Ms.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"RIGHT Join TABBOPR Tb On Tb.EMPRESA = '"+_empresa+"' And Tb.KOSU = '"+_sucursal+"' AND Tb.KOBO = '"+_bodega+"' AND Tb.KOPR = Ms.KOPR "+anywheresoftware.b4a.keywords.Common.CRLF+_consul+anywheresoftware.b4a.keywords.Common.CRLF+"Order by Mp.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Option ( Fast 25 )";
 //BA.debugLineNum = 539;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,_consulta_sql,frm_impresion.getObject());
 //BA.debugLineNum = 540;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 541;BA.debugLine="ProgressDialogShow(\"Buscando prooductos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando prooductos..."));
 //BA.debugLineNum = 543;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 545;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 547;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 549;BA.debugLine="ParseJSON(vJson)";
_parsejson(_vjson);
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 555;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
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
 //BA.debugLineNum = 563;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 565;BA.debugLine="Return 1";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(1));return;};
 //BA.debugLineNum = 567;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _combo_impresion_selectedindexchanged(int _index) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 890;BA.debugLine="tip = Combo_Impresion.GetItem(Index)";
parent.mostCurrent._tip = parent.mostCurrent._combo_impresion._getitem /*String*/ (_index);
 //BA.debugLineNum = 891;BA.debugLine="Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me";
_js2 = _sb_imprimiretiquetazpl_01(frm_impresion.getObject(),parent._objselec.Principal /*String*/ );
 //BA.debugLineNum = 892;BA.debugLine="Wait For (Js2) JobDone(Js2 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js2));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js2 = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 893;BA.debugLine="If Js2.Success Then";
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
 //BA.debugLineNum = 894;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 895;BA.debugLine="parser.Initialize(Js2.GetString)";
_parser.Initialize(_js2._getstring /*String*/ ());
 //BA.debugLineNum = 897;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
 //BA.debugLineNum = 898;BA.debugLine="Dim EsCorrecto As Boolean = m.Get(\"EsCorrecto\")";
_escorrecto = BA.ObjectToBoolean(_m.Get((Object)("EsCorrecto")));
 //BA.debugLineNum = 899;BA.debugLine="Dim Etiqueta As String = m.Get(\"Etiqueta\")";
_etiqueta = BA.ObjectToString(_m.Get((Object)("Etiqueta")));
 //BA.debugLineNum = 900;BA.debugLine="Dim Mensaje As String = m.Get(\"Mensaje\")";
_mensaje = BA.ObjectToString(_m.Get((Object)("Mensaje")));
 //BA.debugLineNum = 902;BA.debugLine="If EsCorrecto Then";
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
 //BA.debugLineNum = 903;BA.debugLine="etiqueta_ZPL = Etiqueta";
parent.mostCurrent._etiqueta_zpl = _etiqueta;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 905;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 907;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 908;BA.debugLine="Msgbox2Async(\"Error creando la etiqueta.\", \"Err";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error creando la etiqueta."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 909;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 9;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 911;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 915;BA.debugLine="Log(\"Error en la petición HTTP\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72752538","Error en la petición HTTP",0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 918;BA.debugLine="Js2.Release";
_js2._release /*String*/ ();
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _combo_tipobusqueda_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 921;BA.debugLine="Private Sub Combo_TipoBusqueda_SelectedIndexChange";
 //BA.debugLineNum = 922;BA.debugLine="selectedString = Combo_TipoBusqueda.GetItem(Index";
mostCurrent._selectedstring = mostCurrent._combo_tipobusqueda._getitem /*String*/ (_index);
 //BA.debugLineNum = 923;BA.debugLine="End Sub";
return "";
}
public static String  _crearzplbodega(String _cod,String _desc,String _fech,String _titulo) throws Exception{
String _cpcl = "";
 //BA.debugLineNum = 680;BA.debugLine="Sub CrearZPLBodega(Cod As String, Desc As String,";
 //BA.debugLineNum = 681;BA.debugLine="Dim CPCL As String";
_cpcl = "";
 //BA.debugLineNum = 682;BA.debugLine="CPCL = $\"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^";
_cpcl = ("^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ\n"+"^XA\n"+"^MMT\n"+"^PW432\n"+"^LL0240\n"+"^LS0\n"+"^BY2,3,48^FT51,100^BCN,,Y,N\n"+"^FD>:<Codigo>^FS\n"+"^FT18,29^A0N,18,43^FH\\^FD<Titulo>^FS\n"+"^FT18,151^A0N,14,14^FH\\^FD<Desc1>^FS\n"+"^FT18,172^A0N,14,14^FH\\^FD<Desc2>^FS\n"+"^FT141,219^A0N,18,33^FH\\^FD<Fecha>^FS\n"+"^PQ1,0,1,Y^XZ\n"+"");
 //BA.debugLineNum = 697;BA.debugLine="CPCL = CPCL.Replace(\"<Codigo>\", Cod)";
_cpcl = _cpcl.replace("<Codigo>",_cod);
 //BA.debugLineNum = 698;BA.debugLine="CPCL = CPCL.Replace(\"<Titulo>\", Titulo)";
_cpcl = _cpcl.replace("<Titulo>",_titulo);
 //BA.debugLineNum = 699;BA.debugLine="CPCL = CPCL.Replace(\"<Fecha>\", Fech)";
_cpcl = _cpcl.replace("<Fecha>",_fech);
 //BA.debugLineNum = 700;BA.debugLine="CPCL = CPCL.Replace(\"<Desc1>\", Desc)";
_cpcl = _cpcl.replace("<Desc1>",_desc);
 //BA.debugLineNum = 701;BA.debugLine="CPCL = CPCL.Replace(\"ñ\",\"n\")";
_cpcl = _cpcl.replace("ñ","n");
 //BA.debugLineNum = 702;BA.debugLine="CPCL = CPCL.Replace(\"Ñ\",\"N\")";
_cpcl = _cpcl.replace("Ñ","N");
 //BA.debugLineNum = 704;BA.debugLine="Return CPCL";
if (true) return _cpcl;
 //BA.debugLineNum = 705;BA.debugLine="End Sub";
return "";
}
public static String  _crearzplventa(String _cod,String _desc,String _dinero,String _fech,String _nom,String _sb) throws Exception{
String _cpcl = "";
 //BA.debugLineNum = 630;BA.debugLine="Sub CrearZPLVenta(Cod As String, Desc As String, D";
 //BA.debugLineNum = 632;BA.debugLine="Dim CPCL As String";
_cpcl = "";
 //BA.debugLineNum = 633;BA.debugLine="CPCL = $\"^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^";
_cpcl = ("^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR3,3~SD10^JUS^LRN^CI0^XZ\n"+"^XA\n"+"^MMT\n"+"^PW432\n"+"^LL0240\n"+"^LS0\n"+"^FT17,38^A0N,34,33^FH\\^FD<Nom>^FS\n"+"^FT19,73^A0N,17,16^FH\\^FD<Sb>^FS\n"+"^SL0\n"+"^FT172,232^A0N,31,31\n"+"^FC%,{,#\n"+"^FD%d/%m/%y^FS\n"+"^FT19,128^A0N,44,45^FH\\^FD<Dinero>^FS\n"+"^FT19,166^A0N,17,14^FH\\^FD<Desc>^FS\n"+"^FT19,197^A0N,17,14^FH\\^FD<Cod>^FS\n"+"^PQ1,0,1,Y^XZ");
 //BA.debugLineNum = 669;BA.debugLine="CPCL = CPCL.Replace(\"<Nom>\",Nom)";
_cpcl = _cpcl.replace("<Nom>",_nom);
 //BA.debugLineNum = 670;BA.debugLine="CPCL = CPCL.Replace(\"<Dinero>\",Dinero)";
_cpcl = _cpcl.replace("<Dinero>",_dinero);
 //BA.debugLineNum = 671;BA.debugLine="CPCL = CPCL.Replace(\"<Fecha>\",Fech)";
_cpcl = _cpcl.replace("<Fecha>",_fech);
 //BA.debugLineNum = 672;BA.debugLine="CPCL = CPCL.Replace(\"<Desc>\",Desc)";
_cpcl = _cpcl.replace("<Desc>",_desc);
 //BA.debugLineNum = 673;BA.debugLine="CPCL = CPCL.Replace(\"<Cod>\",Cod)";
_cpcl = _cpcl.replace("<Cod>",_cod);
 //BA.debugLineNum = 674;BA.debugLine="CPCL = CPCL.Replace(\"<Sb>\",Sb)";
_cpcl = _cpcl.replace("<Sb>",_sb);
 //BA.debugLineNum = 675;BA.debugLine="CPCL = CPCL.Replace(\"ñ\",\"n\")";
_cpcl = _cpcl.replace("ñ","n");
 //BA.debugLineNum = 676;BA.debugLine="CPCL = CPCL.Replace(\"Ñ\",\"N\")";
_cpcl = _cpcl.replace("Ñ","N");
 //BA.debugLineNum = 678;BA.debugLine="Return CPCL";
if (true) return _cpcl;
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return "";
}
public static void  _enviarcalibrar(String _zpl) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 766;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 767;BA.debugLine="Try";
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
 //BA.debugLineNum = 772;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
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
 //BA.debugLineNum = 773;BA.debugLine="If ConnectedPrinter.Connected Then";
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
 //BA.debugLineNum = 774;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
 //BA.debugLineNum = 775;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72621450","Conexión anterior cerrada.",0);
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
 //BA.debugLineNum = 780;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
parent.mostCurrent._connectedprinter.Initialize("ConnectedPrinter");
 //BA.debugLineNum = 781;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
parent.mostCurrent._connectedprinter.Connect(processBA,parent.mostCurrent._printerip,parent._printerport,(int) (5000));
 //BA.debugLineNum = 783;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("connectedprinter_connected", processBA, this, null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 784;BA.debugLine="If Success Then";
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
 //BA.debugLineNum = 785;BA.debugLine="Log(\"Conectado a la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72621460","Conectado a la impresora.",0);
 //BA.debugLineNum = 786;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Mandando a impresión..."));
 //BA.debugLineNum = 789;BA.debugLine="If AStreams.IsInitialized Then";
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
 //BA.debugLineNum = 790;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
parent.mostCurrent._astreams.Close();
 if (true) break;

case 18:
//C
this.state = 21;
;
 //BA.debugLineNum = 792;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
parent.mostCurrent._astreams.Initialize(processBA,parent.mostCurrent._connectedprinter.getInputStream(),parent.mostCurrent._connectedprinter.getOutputStream(),"AStreams");
 //BA.debugLineNum = 793;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
_residuales = "^XA^IDR:*.*^XZ";
 //BA.debugLineNum = 794;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_residuales.getBytes("UTF8"));
 //BA.debugLineNum = 796;BA.debugLine="AStreams.Write(ZPL.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_zpl.getBytes("UTF8"));
 //BA.debugLineNum = 797;BA.debugLine="Log(\"Impresora Calibrada Exitosamente.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72621472","Impresora Calibrada Exitosamente.",0);
 //BA.debugLineNum = 798;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 799;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 800;BA.debugLine="Msgbox2Async(\"Impresora Calibrada Exitosamente\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Impresora Calibrada Exitosamente"),BA.ObjectToCharSequence("Calibración exitosa"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 801;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 803;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 804;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72621479","Error al conectar con la impresora.",0);
 //BA.debugLineNum = 805;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 806;BA.debugLine="Msgbox2Async(\"Error de comandos\" , \"Error al ca";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de comandos"),BA.ObjectToCharSequence("Error al calibrar"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 807;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 810;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 811;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("72621486","Error al enviar la etiqueta: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 //BA.debugLineNum = 812;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 813;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 814;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 817;BA.debugLine="If ConnectedPrinter.Connected Then";
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
 //BA.debugLineNum = 818;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
 //BA.debugLineNum = 819;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72621494","Conexión cerrada después de enviar.",0);
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
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
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
public static void  _connectedprinter_connected(boolean _success) throws Exception{
}
public static void  _enviaretiqueta(String _zpl) throws Exception{
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
String _residuales = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 827;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 828;BA.debugLine="Try";
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
 //BA.debugLineNum = 829;BA.debugLine="Dim FechaActual As String";
_fechaactual = "";
 //BA.debugLineNum = 836;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
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
 //BA.debugLineNum = 837;BA.debugLine="If ConnectedPrinter.Connected Then";
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
 //BA.debugLineNum = 838;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
 //BA.debugLineNum = 839;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72686989","Conexión anterior cerrada.",0);
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
 //BA.debugLineNum = 844;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
parent.mostCurrent._connectedprinter.Initialize("ConnectedPrinter");
 //BA.debugLineNum = 845;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
parent.mostCurrent._connectedprinter.Connect(processBA,parent.mostCurrent._printerip,parent._printerport,(int) (5000));
 //BA.debugLineNum = 847;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("connectedprinter_connected", processBA, this, null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 848;BA.debugLine="If Success Then";
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
 //BA.debugLineNum = 849;BA.debugLine="Log(\"Conectado a la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72686999","Conectado a la impresora.",0);
 //BA.debugLineNum = 850;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Mandando a impresión..."));
 //BA.debugLineNum = 853;BA.debugLine="If AStreams.IsInitialized Then";
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
 //BA.debugLineNum = 854;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
parent.mostCurrent._astreams.Close();
 if (true) break;

case 18:
//C
this.state = 21;
;
 //BA.debugLineNum = 856;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
parent.mostCurrent._astreams.Initialize(processBA,parent.mostCurrent._connectedprinter.getInputStream(),parent.mostCurrent._connectedprinter.getOutputStream(),"AStreams");
 //BA.debugLineNum = 857;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
_residuales = "^XA^IDR:*.*^XZ";
 //BA.debugLineNum = 858;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_residuales.getBytes("UTF8"));
 //BA.debugLineNum = 860;BA.debugLine="AStreams.Write(zpl.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_zpl.getBytes("UTF8"));
 //BA.debugLineNum = 861;BA.debugLine="Log(\"Etiqueta enviada exitosamente.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72687011","Etiqueta enviada exitosamente.",0);
 //BA.debugLineNum = 862;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 863;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 864;BA.debugLine="Msgbox2Async(\"Se ha impreso la etiqueta\",\"Impre";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se ha impreso la etiqueta"),BA.ObjectToCharSequence("Impresión exitosa"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 865;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 867;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 868;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72687018","Error al conectar con la impresora.",0);
 //BA.debugLineNum = 869;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 870;BA.debugLine="Msgbox2Async(\"Error de impresión\" , \"Error al i";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión"),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 871;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 874;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 875;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("72687025","Error al enviar la etiqueta: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 //BA.debugLineNum = 876;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 877;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 878;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 881;BA.debugLine="If ConnectedPrinter.Connected Then";
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
 //BA.debugLineNum = 882;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
 //BA.debugLineNum = 883;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72687033","Conexión cerrada después de enviar.",0);
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
 //BA.debugLineNum = 886;BA.debugLine="End Sub";
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
public static void  _enviaretiquetazpl(String _zpl) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 708;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 709;BA.debugLine="Try";
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
 //BA.debugLineNum = 714;BA.debugLine="If ConnectedPrinter.IsInitialized Then";
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
 //BA.debugLineNum = 715;BA.debugLine="If ConnectedPrinter.Connected Then";
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
 //BA.debugLineNum = 716;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
 //BA.debugLineNum = 717;BA.debugLine="Log(\"Conexión anterior cerrada.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72555914","Conexión anterior cerrada.",0);
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
 //BA.debugLineNum = 722;BA.debugLine="ConnectedPrinter.Initialize(\"ConnectedPrinter\")";
parent.mostCurrent._connectedprinter.Initialize("ConnectedPrinter");
 //BA.debugLineNum = 723;BA.debugLine="ConnectedPrinter.Connect(PrinterIP, PrinterPort,";
parent.mostCurrent._connectedprinter.Connect(processBA,parent.mostCurrent._printerip,parent._printerport,(int) (5000));
 //BA.debugLineNum = 725;BA.debugLine="Wait For ConnectedPrinter_Connected (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("connectedprinter_connected", processBA, this, null);
this.state = 29;
return;
case 29:
//C
this.state = 12;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 726;BA.debugLine="If Success Then";
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
 //BA.debugLineNum = 727;BA.debugLine="Log(\"Conectado a la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72555924","Conectado a la impresora.",0);
 //BA.debugLineNum = 728;BA.debugLine="ProgressDialogShow(\"Mandando a impresión...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Mandando a impresión..."));
 //BA.debugLineNum = 731;BA.debugLine="If AStreams.IsInitialized Then";
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
 //BA.debugLineNum = 732;BA.debugLine="AStreams.Close ' Cerrar AsyncStreams si estaba";
parent.mostCurrent._astreams.Close();
 if (true) break;

case 18:
//C
this.state = 21;
;
 //BA.debugLineNum = 734;BA.debugLine="AStreams.Initialize(ConnectedPrinter.InputStrea";
parent.mostCurrent._astreams.Initialize(processBA,parent.mostCurrent._connectedprinter.getInputStream(),parent.mostCurrent._connectedprinter.getOutputStream(),"AStreams");
 //BA.debugLineNum = 735;BA.debugLine="Dim residuales As String = \"^XA^IDR:*.*^XZ\"";
_residuales = "^XA^IDR:*.*^XZ";
 //BA.debugLineNum = 736;BA.debugLine="AStreams.Write(residuales.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_residuales.getBytes("UTF8"));
 //BA.debugLineNum = 738;BA.debugLine="AStreams.Write(ZPL.GetBytes(\"UTF8\"))";
parent.mostCurrent._astreams.Write(_zpl.getBytes("UTF8"));
 //BA.debugLineNum = 739;BA.debugLine="Log(\"Etiqueta enviada exitosamente.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72555936","Etiqueta enviada exitosamente.",0);
 //BA.debugLineNum = 740;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 741;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 742;BA.debugLine="Msgbox2Async(\"Se ha impreso la etiqueta\",\"Impre";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se ha impreso la etiqueta"),BA.ObjectToCharSequence("Impresión exitosa"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 743;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 745;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 746;BA.debugLine="Log(\"Error al conectar con la impresora.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72555943","Error al conectar con la impresora.",0);
 //BA.debugLineNum = 747;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 748;BA.debugLine="Msgbox2Async(\"Error de impresión\" , \"Error al i";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión"),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 749;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 752;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 753;BA.debugLine="Log(\"Error al enviar la etiqueta: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("72555950","Error al enviar la etiqueta: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 //BA.debugLineNum = 754;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 755;BA.debugLine="Msgbox2Async( \"Error de impresión: \"&LastExcepti";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de impresión: "+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 756;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 759;BA.debugLine="If ConnectedPrinter.Connected Then";
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
 //BA.debugLineNum = 760;BA.debugLine="ConnectedPrinter.Close";
parent.mostCurrent._connectedprinter.Close();
 //BA.debugLineNum = 761;BA.debugLine="Log(\"Conexión cerrada después de enviar.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("72555958","Conexión cerrada después de enviar.",0);
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
 //BA.debugLineNum = 764;BA.debugLine="End Sub";
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
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _contador = 0;
int _i = 0;
 //BA.debugLineNum = 404;BA.debugLine="Sub FormatearMiles(numero As String) As String";
 //BA.debugLineNum = 406;BA.debugLine="numero = numero.Replace(\",\", \"\").Replace(\".\", \"\")";
_numero = _numero.replace(",","").replace(".","").trim();
 //BA.debugLineNum = 408;BA.debugLine="If numero.Length = 0 Then Return \"\"";
if (_numero.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 410;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 411;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 413;BA.debugLine="Dim contador As Int = 0";
_contador = (int) (0);
 //BA.debugLineNum = 414;BA.debugLine="For i = numero.Length - 1 To 0 Step -1";
{
final int step6 = -1;
final int limit6 = (int) (0);
_i = (int) (_numero.length()-1) ;
for (;_i >= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 415;BA.debugLine="sb.Insert(0, numero.CharAt(i))";
_sb.Insert((int) (0),BA.ObjectToString(_numero.charAt(_i)));
 //BA.debugLineNum = 416;BA.debugLine="contador = contador + 1";
_contador = (int) (_contador+1);
 //BA.debugLineNum = 417;BA.debugLine="If contador Mod 3 = 0 And i > 0 Then";
if (_contador%3==0 && _i>0) { 
 //BA.debugLineNum = 418;BA.debugLine="sb.Insert(0, \".\")";
_sb.Insert((int) (0),".");
 };
 }
};
 //BA.debugLineNum = 422;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private tip As String";
mostCurrent._tip = "";
 //BA.debugLineNum = 20;BA.debugLine="Private Ancho As Float = 2";
_ancho = (float) (2);
 //BA.debugLineNum = 21;BA.debugLine="Private Alto As Float = 1.6";
_alto = (float) (1.6);
 //BA.debugLineNum = 22;BA.debugLine="Private Btn_Buscar As Button";
mostCurrent._btn_buscar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Panelinfo As Panel";
mostCurrent._panelinfo = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Btn_BuscarProd As Button";
mostCurrent._btn_buscarprod = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Panel_Buscador As Panel";
mostCurrent._panel_buscador = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private ListView1 As ListView";
mostCurrent._listview1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private EditText1 As EditText";
mostCurrent._edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
mostCurrent._b4xcombobox1 = new BaKapp.Movil.Tag.b4xcombobox();
 //BA.debugLineNum = 29;BA.debugLine="Private Btn_CerrarBuscador As Button";
mostCurrent._btn_cerrarbuscador = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private selectedString As String";
mostCurrent._selectedstring = "";
 //BA.debugLineNum = 31;BA.debugLine="Private Txt_codigo As EditText";
mostCurrent._txt_codigo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Lbl_tipo As Label";
mostCurrent._lbl_tipo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Lbl_codigo As Label";
mostCurrent._lbl_codigo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Lbl_Desc As Label";
mostCurrent._lbl_desc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private cantidad As Int";
_cantidad = 0;
 //BA.debugLineNum = 36;BA.debugLine="Private Lbl_precio As Label";
mostCurrent._lbl_precio = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Btn_imprimir As Button";
mostCurrent._btn_imprimir = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Serial1 As Serial";
mostCurrent._serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 39;BA.debugLine="Private ConnectedPrinter As Socket";
mostCurrent._connectedprinter = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private PrinterIP As String  ' Dirección IP de la";
mostCurrent._printerip = "";
 //BA.debugLineNum = 41;BA.debugLine="Private PrinterPort As Int = 9100  ' Puerto están";
_printerport = (int) (9100);
 //BA.debugLineNum = 42;BA.debugLine="Private AStreams As AsyncStreams  ' Manejo de flu";
mostCurrent._astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 43;BA.debugLine="Private Combo_Impresion As B4XComboBox";
mostCurrent._combo_impresion = new BaKapp.Movil.Tag.b4xcombobox();
 //BA.debugLineNum = 44;BA.debugLine="Private Combo_TipoBusqueda As B4XComboBox";
mostCurrent._combo_tipobusqueda = new BaKapp.Movil.Tag.b4xcombobox();
 //BA.debugLineNum = 45;BA.debugLine="Private Btn_Volver As Button";
mostCurrent._btn_volver = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Dim datos As Map";
mostCurrent._datos = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 47;BA.debugLine="Dim SelectedPrice As Int";
_selectedprice = 0;
 //BA.debugLineNum = 48;BA.debugLine="Dim stringPrecio1 As String";
mostCurrent._stringprecio1 = "";
 //BA.debugLineNum = 49;BA.debugLine="Private Combo_precios As B4XComboBox";
mostCurrent._combo_precios = new BaKapp.Movil.Tag.b4xcombobox();
 //BA.debugLineNum = 50;BA.debugLine="Private PanelVista As Panel";
mostCurrent._panelvista = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private WebView1 As WebView";
mostCurrent._webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Dim Etiquetas As List";
mostCurrent._etiquetas = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 54;BA.debugLine="Dim etiqueta_ZPL As String";
mostCurrent._etiqueta_zpl = "";
 //BA.debugLineNum = 55;BA.debugLine="Private B4XPlusMinus1 As B4XPlusMinus";
mostCurrent._b4xplusminus1 = new BaKapp.Movil.Tag.b4xplusminus();
 //BA.debugLineNum = 56;BA.debugLine="Private Spinner_cant As Spinner";
mostCurrent._spinner_cant = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _leerdatos() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
 //BA.debugLineNum = 178;BA.debugLine="Sub LeerDatos()";
 //BA.debugLineNum = 179;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map")) { 
 //BA.debugLineNum = 180;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
mostCurrent._datos = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map");
 //BA.debugLineNum = 181;BA.debugLine="PrinterIP = datos.Get(\"Ip\")";
mostCurrent._printerip = BA.ObjectToString(mostCurrent._datos.Get((Object)("Ip")));
 //BA.debugLineNum = 182;BA.debugLine="stringPrecio1 = datos.Get(\"KOLT\")";
mostCurrent._stringprecio1 = BA.ObjectToString(mostCurrent._datos.Get((Object)("KOLT")));
 //BA.debugLineNum = 183;BA.debugLine="PrinterPort = datos.Get(\"Puerto\")";
_printerport = (int)(BA.ObjectToNumber(mostCurrent._datos.Get((Object)("Puerto"))));
 }else {
 //BA.debugLineNum = 186;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 187;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 188;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora."),BA.ObjectToCharSequence("Alerta"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 190;BA.debugLine="Log(\"El archivo no existe.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("71114124","El archivo no existe.",0);
 //BA.debugLineNum = 191;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
mostCurrent._datos.Initialize();
 };
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public static void  _listview1_itemclick(int _position,Object _value) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 341;BA.debugLine="Dim selectedData As TableData = DataList.Get(Posi";
_selecteddata = (BaKapp.Movil.Tag.frm_impresion._tabledata)(parent._datalist.Get(_position));
 //BA.debugLineNum = 343;BA.debugLine="Dim Js As HttpJob = Bsc(\"Principal\",selectedData.";
_js = _bsc("Principal",_selecteddata.CODIGO /*String*/ ,frm_impresion.getObject(),parent.mostCurrent._variables._gl_empresa /*String*/ ,parent.mostCurrent._variables._gl_sucursal /*String*/ ,parent.mostCurrent._variables._gl_bodega /*String*/ ,parent.mostCurrent._stringprecio1);
 //BA.debugLineNum = 344;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 346;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 348;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 350;BA.debugLine="If  vJson = $\"{\"Table\":[{\"Codigo\":\"Error_No hay n";
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
 //BA.debugLineNum = 352;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 354;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 355;BA.debugLine="Msgbox2Async(\"Producto no encontrado en la base";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Producto no encontrado en la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 356;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 30;
return;
case 30:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 358;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 361;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 364;BA.debugLine="ParseOtherJSON(Js.GetString)";
_parseotherjson(_js._getstring /*String*/ ());
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 366;BA.debugLine="Btn_Buscar.Visible= True";
parent.mostCurrent._btn_buscar.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 367;BA.debugLine="Panelinfo.Visible = True";
parent.mostCurrent._panelinfo.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 368;BA.debugLine="Panel_Buscador.Visible = False";
parent.mostCurrent._panel_buscador.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 369;BA.debugLine="Lbl_codigo.Text = ObjSelec.Principal.As(String)";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence((parent._objselec.Principal /*String*/ )));
 //BA.debugLineNum = 370;BA.debugLine="Lbl_Desc.Text = ObjSelec.Descripcion";
parent.mostCurrent._lbl_desc.setText(BA.ObjectToCharSequence(parent._objselec.Descripcion /*String*/ ));
 //BA.debugLineNum = 371;BA.debugLine="Lbl_precio.Text = \"$\"&FormatearMiles(ObjSelec.Pre";
parent.mostCurrent._lbl_precio.setText(BA.ObjectToCharSequence("$"+_formatearmiles(BA.NumberToString(parent._objselec.PrecioListaUd1 /*double*/ ))+".-"));
 //BA.debugLineNum = 373;BA.debugLine="Dim Js2 As HttpJob = Sb_ImprimirEtiquetaZPL_01(Me";
_js2 = _sb_imprimiretiquetazpl_01(frm_impresion.getObject(),parent._objselec.Principal /*String*/ );
 //BA.debugLineNum = 374;BA.debugLine="Wait For (Js2) JobDone(Js2 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js2));
this.state = 31;
return;
case 31:
//C
this.state = 13;
_js2 = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 376;BA.debugLine="If Js2.Success Then";
if (true) break;

case 13:
//if
this.state = 28;
if (_js2._success /*boolean*/ ) { 
this.state = 15;
}else {
this.state = 27;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 377;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 378;BA.debugLine="parser.Initialize(Js2.GetString)";
_parser.Initialize(_js2._getstring /*String*/ ());
 //BA.debugLineNum = 380;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
 //BA.debugLineNum = 381;BA.debugLine="Dim EsCorrecto As Boolean = m.Get(\"EsCorrecto\")";
_escorrecto = BA.ObjectToBoolean(_m.Get((Object)("EsCorrecto")));
 //BA.debugLineNum = 382;BA.debugLine="Dim Etiqueta As String = m.Get(\"Etiqueta\")";
_etiqueta = BA.ObjectToString(_m.Get((Object)("Etiqueta")));
 //BA.debugLineNum = 383;BA.debugLine="Dim Mensaje As String = m.Get(\"Mensaje\")";
_mensaje = BA.ObjectToString(_m.Get((Object)("Mensaje")));
 //BA.debugLineNum = 385;BA.debugLine="If EsCorrecto Then";
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
 //BA.debugLineNum = 386;BA.debugLine="etiqueta_ZPL = Etiqueta";
parent.mostCurrent._etiqueta_zpl = _etiqueta;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 388;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 390;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 391;BA.debugLine="Msgbox2Async(\"Error creando la etiqueta.\", \"Err";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error creando la etiqueta."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 392;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 32;
return;
case 32:
//C
this.state = 21;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 394;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 398;BA.debugLine="Log(\"Error en la petición HTTP\")";
anywheresoftware.b4a.keywords.Common.LogImpl("71703994","Error en la petición HTTP",0);
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 401;BA.debugLine="Js2.Release";
_js2._release /*String*/ ();
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _parseetiquetas(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._etiqueta _data = null;
 //BA.debugLineNum = 157;BA.debugLine="Sub ParseEtiquetas(Json As String ) As List";
 //BA.debugLineNum = 158;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 159;BA.debugLine="parser.Initialize(Json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 160;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 161;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 163;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 164;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 166;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
 //BA.debugLineNum = 167;BA.debugLine="Dim data As Etiqueta";
_data = new BaKapp.Movil.Tag.frm_impresion._etiqueta();
 //BA.debugLineNum = 168;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 169;BA.debugLine="data.NombreEtiqueta = entry.Get(\"NombreEtiqueta\"";
_data.NombreEtiqueta /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreEtiqueta")));
 //BA.debugLineNum = 170;BA.debugLine="data.FUNCION = entry.Get(\"FUNCION\")";
_data.FUNCION /*String*/  = BA.ObjectToString(_entry.Get((Object)("FUNCION")));
 //BA.debugLineNum = 173;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
 //BA.debugLineNum = 176;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public static String  _parsejson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._tabledata _data = null;
 //BA.debugLineNum = 230;BA.debugLine="Sub ParseJSON(json As String)";
 //BA.debugLineNum = 231;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 232;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 233;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 234;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 236;BA.debugLine="DataList.Initialize";
_datalist.Initialize();
 //BA.debugLineNum = 238;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _tablelist;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
 //BA.debugLineNum = 239;BA.debugLine="Dim data As TableData";
_data = new BaKapp.Movil.Tag.frm_impresion._tabledata();
 //BA.debugLineNum = 240;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 241;BA.debugLine="data.CODIGO = entry.Get(\"CODIGO\")";
_data.CODIGO /*String*/  = BA.ObjectToString(_entry.Get((Object)("CODIGO")));
 //BA.debugLineNum = 242;BA.debugLine="data.CODTECNICO = entry.Get(\"CODTECNICO\")";
_data.CODTECNICO /*String*/  = BA.ObjectToString(_entry.Get((Object)("CODTECNICO")));
 //BA.debugLineNum = 243;BA.debugLine="data.DESCRIPCION = entry.Get(\"DESCRIPCION\")";
_data.DESCRIPCION /*String*/  = BA.ObjectToString(_entry.Get((Object)("DESCRIPCION")));
 //BA.debugLineNum = 244;BA.debugLine="data.MRPR = entry.Get(\"MRPR\")";
_data.MRPR /*String*/  = BA.ObjectToString(_entry.Get((Object)("MRPR")));
 //BA.debugLineNum = 245;BA.debugLine="data.STFI1 = entry.Get(\"STFI1\")";
_data.STFI1 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("STFI1"))));
 //BA.debugLineNum = 246;BA.debugLine="data.RAPIDO = entry.Get(\"RAPIDO\")";
_data.RAPIDO /*String*/  = BA.ObjectToString(_entry.Get((Object)("RAPIDO")));
 //BA.debugLineNum = 247;BA.debugLine="data.KOPRAL = entry.Get(\"KOPRAL\")";
_data.KOPRAL /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOPRAL")));
 //BA.debugLineNum = 248;BA.debugLine="data.DATOSUBIC = entry.Get(\"DATOSUBIC\")";
_data.DATOSUBIC /*String*/  = BA.ObjectToString(_entry.Get((Object)("DATOSUBIC")));
 //BA.debugLineNum = 250;BA.debugLine="DataList.Add(data)";
_datalist.Add((Object)(_data));
 //BA.debugLineNum = 253;BA.debugLine="ListView1.AddTwoLinesAndBitmap(\"Codigo: \"&data.C";
mostCurrent._listview1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence("Codigo: "+_data.CODIGO /*String*/ ),BA.ObjectToCharSequence(_data.DESCRIPCION /*String*/ ),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 }
};
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public static String  _parseotherjson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._otherdata _data = null;
 //BA.debugLineNum = 256;BA.debugLine="Sub ParseOtherJSON(json As String)";
 //BA.debugLineNum = 257;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 258;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 259;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 260;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 262;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _tablelist;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group5.Get(index5)));
 //BA.debugLineNum = 263;BA.debugLine="Dim data As OtherData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherdata();
 //BA.debugLineNum = 264;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 265;BA.debugLine="data.Principal = entry.Get(\"Principal\")";
_data.Principal /*String*/  = BA.ObjectToString(_entry.Get((Object)("Principal")));
 //BA.debugLineNum = 266;BA.debugLine="data.Rapido = entry.Get(\"Rapido\")";
_data.Rapido /*String*/  = BA.ObjectToString(_entry.Get((Object)("Rapido")));
 //BA.debugLineNum = 267;BA.debugLine="data.Tecnico = entry.Get(\"Tecnico\")";
_data.Tecnico /*String*/  = BA.ObjectToString(_entry.Get((Object)("Tecnico")));
 //BA.debugLineNum = 268;BA.debugLine="data.Rtu = entry.Get(\"Rtu\")";
_data.Rtu /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("Rtu"))));
 //BA.debugLineNum = 269;BA.debugLine="data.Ud1 = entry.Get(\"Ud1\")";
_data.Ud1 /*String*/  = BA.ObjectToString(_entry.Get((Object)("Ud1")));
 //BA.debugLineNum = 270;BA.debugLine="data.Ud2 = entry.Get(\"Ud2\")";
_data.Ud2 /*String*/  = BA.ObjectToString(_entry.Get((Object)("Ud2")));
 //BA.debugLineNum = 271;BA.debugLine="data.Descripcion = entry.Get(\"Descripcion\")";
_data.Descripcion /*String*/  = BA.ObjectToString(_entry.Get((Object)("Descripcion")));
 //BA.debugLineNum = 272;BA.debugLine="data.StFisicoUd1 = entry.Get(\"StFisicoUd1\")";
_data.StFisicoUd1 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("StFisicoUd1"))));
 //BA.debugLineNum = 273;BA.debugLine="data.StFisicoUd2 = entry.Get(\"StFisicoUd2\")";
_data.StFisicoUd2 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("StFisicoUd2"))));
 //BA.debugLineNum = 274;BA.debugLine="data.SuperFamilia = entry.Get(\"SuperFamilia\")";
_data.SuperFamilia /*String*/  = BA.ObjectToString(_entry.Get((Object)("SuperFamilia")));
 //BA.debugLineNum = 275;BA.debugLine="data.NombreSuper = entry.Get(\"NombreSuper\")";
_data.NombreSuper /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreSuper")));
 //BA.debugLineNum = 276;BA.debugLine="data.Familia = entry.Get(\"Familia\")";
_data.Familia /*String*/  = BA.ObjectToString(_entry.Get((Object)("Familia")));
 //BA.debugLineNum = 277;BA.debugLine="data.NombreFamilia = entry.Get(\"NombreFamilia\")";
_data.NombreFamilia /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreFamilia")));
 //BA.debugLineNum = 278;BA.debugLine="data.SubFamilia = entry.Get(\"SubFamilia\")";
_data.SubFamilia /*String*/  = BA.ObjectToString(_entry.Get((Object)("SubFamilia")));
 //BA.debugLineNum = 279;BA.debugLine="data.NombreSub = entry.Get(\"NombreSub\")";
_data.NombreSub /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreSub")));
 //BA.debugLineNum = 280;BA.debugLine="data.MRPR = entry.Get(\"MRPR\")";
_data.MRPR /*String*/  = BA.ObjectToString(_entry.Get((Object)("MRPR")));
 //BA.debugLineNum = 281;BA.debugLine="data.MARCA = entry.Get(\"MARCA\")";
_data.MARCA /*String*/  = BA.ObjectToString(_entry.Get((Object)("MARCA")));
 //BA.debugLineNum = 282;BA.debugLine="data.PrecioListaUd1 = entry.Get(\"PrecioListaUd1\"";
_data.PrecioListaUd1 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("PrecioListaUd1"))));
 //BA.debugLineNum = 283;BA.debugLine="data.PrecioListaUd2 = entry.Get(\"PrecioListaUd2\"";
_data.PrecioListaUd2 /*double*/  = (double)(BA.ObjectToNumber(_entry.Get((Object)("PrecioListaUd2"))));
 //BA.debugLineNum = 284;BA.debugLine="ObjSelec = data";
_objselec = _data;
 //BA.debugLineNum = 286;BA.debugLine="Log(\"Producto: \" & data.Descripcion & \" - \" & da";
anywheresoftware.b4a.keywords.Common.LogImpl("71441822","Producto: "+_data.Descripcion /*String*/ +" - "+_data.MARCA /*String*/ ,0);
 }
};
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _parseotherpricejson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _data = null;
 //BA.debugLineNum = 290;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
 //BA.debugLineNum = 291;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 292;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 293;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 294;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 296;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 297;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 299;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
 //BA.debugLineNum = 300;BA.debugLine="Dim data As OtherPriceData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherpricedata();
 //BA.debugLineNum = 301;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 302;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
_data.TILT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TILT")));
 //BA.debugLineNum = 303;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
_data.KOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOLT")));
 //BA.debugLineNum = 304;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
_data.MELT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MELT")));
 //BA.debugLineNum = 305;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
_data.MOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MOLT")));
 //BA.debugLineNum = 306;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
_data.TIMOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TIMOLT")));
 //BA.debugLineNum = 307;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
_data.NOKOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("NOKOLT")));
 //BA.debugLineNum = 309;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
if (_entry.ContainsKey((Object)("FEVI")) && _entry.Get((Object)("FEVI"))!= null) { 
 //BA.debugLineNum = 310;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
_data.FEVI /*String*/  = BA.ObjectToString(_entry.Get((Object)("FEVI")));
 }else {
 //BA.debugLineNum = 312;BA.debugLine="data.FEVI = \"\"";
_data.FEVI /*String*/  = "";
 };
 //BA.debugLineNum = 315;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
_data.OPERA /*String*/  = BA.ObjectToString(_entry.Get((Object)("OPERA")));
 //BA.debugLineNum = 316;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
_data.ECUDEF01UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF01UD")));
 //BA.debugLineNum = 317;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
_data.ECUDEF02UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF02UD")));
 //BA.debugLineNum = 319;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
 //BA.debugLineNum = 322;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Type TableData(CODIGO As String, CODTECNICO As St";
;
 //BA.debugLineNum = 8;BA.debugLine="Dim DataList As List";
_datalist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Dim DataPrice As List";
_dataprice = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Type OtherPriceData (TILT As String, KOLT As Stri";
;
 //BA.debugLineNum = 11;BA.debugLine="Type OtherData(Principal As String, Rapido As Str";
;
 //BA.debugLineNum = 12;BA.debugLine="Dim ObjSelec As OtherData";
_objselec = new BaKapp.Movil.Tag.frm_impresion._otherdata();
 //BA.debugLineNum = 13;BA.debugLine="Type Etiqueta (NombreEtiqueta As String, FUNCION";
;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _sb_buscarlistaprecios(Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 569;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
 //BA.debugLineNum = 571;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>");
 //BA.debugLineNum = 577;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 578;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 580;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (processBA,"",_me_);
 //BA.debugLineNum = 581;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 582;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 583;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_BuscarListaPrecios\""));
 //BA.debugLineNum = 585;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _sb_imprimiretiquetazpl_01(Object _me_,String _codigo) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 995;BA.debugLine="Public Sub Sb_ImprimirEtiquetaZPL_01(Me_ As Object";
 //BA.debugLineNum = 997;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_ImprimirEtiquetaZPL_01 xmlns=\"http://BakApp\">\n"+"      <_NombreEtiqueta>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._tip))+"</_NombreEtiqueta>\n"+"      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codigo))+"</_Codigo>\n"+"      <_CodLista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._stringprecio1))+"</_CodLista>\n"+"      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._variables._gl_empresa /*String*/ ))+"</_Empresa>\n"+"      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._variables._gl_sucursal /*String*/ ))+"</_Sucursal>\n"+"      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._variables._gl_bodega /*String*/ ))+"</_Bodega>\n"+"      <_CodAlternativo></_CodAlternativo>\n"+"    </Sb_ImprimirEtiquetaZPL_01>\n"+"  </soap:Body>\n"+"</soap:Envelope>");
 //BA.debugLineNum = 1012;BA.debugLine="Dim PostString As String = \"http://\" & Variables.";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 1013;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 1015;BA.debugLine="Js.Initialize(\"\", Me_)";
_js._initialize /*String*/ (processBA,"",_me_);
 //BA.debugLineNum = 1016;BA.debugLine="Js.PostString(PostString, vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 1017;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 1018;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\", \"http://Bak";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction","http://BakApp/Sb_ImprimirEtiquetaZPL_01");
 //BA.debugLineNum = 1020;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 1022;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _sb_inv_traerproductoinventarioticket(Object _me_,String _empresa,String _sucursal,String _bodega,String _tipo,String _codigo,String _lista) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 588;BA.debugLine="Public Sub Sb_Inv_TraerProductoInventarioTicket(Me";
 //BA.debugLineNum = 590;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_Inv_TraerProductoInventarioTicket xmlns=\"http://BakApp\">\n"+"      <_Empresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_empresa))+"</_Empresa>\n"+"      <_Sucursal>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sucursal))+"</_Sucursal>\n"+"      <_Bodega>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_bodega))+"</_Bodega>\n"+"      <_Tipo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipo))+"</_Tipo>\n"+"      <_Codigo>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codigo))+"</_Codigo>\n"+"      <_Lista>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lista))+"</_Lista>\n"+"    </Sb_Inv_TraerProductoInventarioTicket>\n"+"  </soap:Body>\n"+"</soap:Envelope>");
 //BA.debugLineNum = 604;BA.debugLine="Dim PostString As String = \"http://\" & Variables.";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 605;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 607;BA.debugLine="Js.Initialize(\"\", Me_)";
_js._initialize /*String*/ (processBA,"",_me_);
 //BA.debugLineNum = 608;BA.debugLine="Js.PostString(PostString, vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 609;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 610;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\", \"http://Bak";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction","http://BakApp/Sb_Inv_TraerProductoInventarioTicket");
 //BA.debugLineNum = 612;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return null;
}
public static BaKapp.Movil.Tag.httpjob  _sb_traeretiquetas(Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 197;BA.debugLine="Private Sub Sb_TraerEtiquetas(Me_ As Object) As Ht";
 //BA.debugLineNum = 199;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_TraerEtiquetas xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>\n"+"");
 //BA.debugLineNum = 207;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 208;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 210;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (processBA,"",_me_);
 //BA.debugLineNum = 211;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 212;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 213;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_TraerEtiquetas\""));
 //BA.debugLineNum = 214;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public static String  _spinner_cant_itemclick(int _position,Object _value) throws Exception{
int _seleccionado = 0;
 //BA.debugLineNum = 1026;BA.debugLine="Private Sub Spinner_cant_ItemClick (Position As In";
 //BA.debugLineNum = 1027;BA.debugLine="Dim seleccionado As Int = Value";
_seleccionado = (int)(BA.ObjectToNumber(_value));
 //BA.debugLineNum = 1028;BA.debugLine="cantidad = seleccionado";
_cantidad = _seleccionado;
 //BA.debugLineNum = 1029;BA.debugLine="End Sub";
return "";
}
public static String  _txt_codigo_enterpressed() throws Exception{
 //BA.debugLineNum = 615;BA.debugLine="Private Sub Txt_codigo_EnterPressed";
 //BA.debugLineNum = 616;BA.debugLine="Btn_BuscarProd_Click";
_btn_buscarprod_click();
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return "";
}
}
