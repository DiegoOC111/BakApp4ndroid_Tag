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

public class frm_documentos_generados extends Activity implements B4AActivity{
	public static frm_documentos_generados mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_documentos_generados");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_documentos_generados).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_documentos_generados");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_documentos_generados", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_documentos_generados) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_documentos_generados) Resume **");
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
		return frm_documentos_generados.class;
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
            BA.LogInfo("** Activity (frm_documentos_generados) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_documentos_generados) Pause event (activity is not paused). **");
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
            frm_documentos_generados mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_documentos_generados) Resume **");
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
public static int _idmaeedo_sel = 0;
public static String _tido_sel = "";
public static String _nudo_sel = "";
public static String _koen_sel = "";
public static String _suen_sel = "";
public static boolean _doc_seleccionado = false;
public static String _estado_sel = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public BaKapp.Movil.Tag.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public BaKapp.Movil.Tag.b4xdatetemplate _datetemplatedesde = null;
public BaKapp.Movil.Tag.b4xdatetemplate _datetemplatehasta = null;
public static int _canttop = 0;
public static String _consulta_sql = "";
public b4a.example3.customlistview _xclvdetalle = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdb_cov = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdb_nvv = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_actualizar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_volver = null;
public BaKapp.Movil.Tag.b4xloadingindicator _b4xloading = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_tido = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_nudo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_koensuen = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_rut = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_razon_social = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_total = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_items = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_idmaeedo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_fecha_desde = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_fecha_hasta = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_feemdo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_estado = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk_solopendientes = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_top = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_sucursal = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
 //BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 59;BA.debugLine="Activity.LoadLayout(\"Cp_Documentos_Generados\")";
mostCurrent._activity.LoadLayout("Cp_Documentos_Generados",mostCurrent.activityBA);
 //BA.debugLineNum = 60;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
 //BA.debugLineNum = 61;BA.debugLine="Dialog.Initialize (Base)";
mostCurrent._dialog._initialize /*String*/ (mostCurrent.activityBA,mostCurrent._base);
 //BA.debugLineNum = 62;BA.debugLine="Dialog.Title = \"Bakapp\"";
mostCurrent._dialog._title /*Object*/  = (Object)("Bakapp");
 //BA.debugLineNum = 64;BA.debugLine="DateTemplateDesde.Initialize";
mostCurrent._datetemplatedesde._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 65;BA.debugLine="DateTemplateHasta.Initialize";
mostCurrent._datetemplatehasta._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 67;BA.debugLine="DateTemplateDesde.Date = DateTime.Now";
mostCurrent._datetemplatedesde._setdate /*long*/ (anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 68;BA.debugLine="DateTemplateHasta.Date = DateTime.Now";
mostCurrent._datetemplatehasta._setdate /*long*/ (anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 70;BA.debugLine="Btn_Fecha_Desde.Text = DateTime.Date(DateTemplate";
mostCurrent._btn_fecha_desde.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._datetemplatedesde._getdate /*long*/ ())));
 //BA.debugLineNum = 71;BA.debugLine="Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplate";
mostCurrent._btn_fecha_hasta.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._datetemplatehasta._getdate /*long*/ ())));
 //BA.debugLineNum = 73;BA.debugLine="DateTemplateDesde.MaxYear = DateTime.GetYear(Date";
mostCurrent._datetemplatedesde._maxyear /*int*/  = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 74;BA.debugLine="DateTemplateDesde.MinYear = DateTemplateDesde.Max";
mostCurrent._datetemplatedesde._minyear /*int*/  = (int) (mostCurrent._datetemplatedesde._maxyear /*int*/ -10);
 //BA.debugLineNum = 76;BA.debugLine="DateTemplateHasta.MaxYear = DateTime.GetYear(Date";
mostCurrent._datetemplatehasta._maxyear /*int*/  = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 77;BA.debugLine="DateTemplateHasta.MinYear = DateTemplateDesde.Max";
mostCurrent._datetemplatehasta._minyear /*int*/  = (int) (mostCurrent._datetemplatedesde._maxyear /*int*/ -10);
 //BA.debugLineNum = 79;BA.debugLine="B4XLoading.Hide";
mostCurrent._b4xloading._hide /*String*/ ();
 //BA.debugLineNum = 81;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 82;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 83;BA.debugLine="Items.Add(\"10\")";
_items.Add((Object)("10"));
 //BA.debugLineNum = 84;BA.debugLine="Items.Add(\"20\")";
_items.Add((Object)("20"));
 //BA.debugLineNum = 85;BA.debugLine="Items.Add(\"30\")";
_items.Add((Object)("30"));
 //BA.debugLineNum = 86;BA.debugLine="Items.Add(\"40\")";
_items.Add((Object)("40"));
 //BA.debugLineNum = 87;BA.debugLine="Items.Add(\"50\")";
_items.Add((Object)("50"));
 //BA.debugLineNum = 88;BA.debugLine="Items.Add(\"100\")";
_items.Add((Object)("100"));
 //BA.debugLineNum = 90;BA.debugLine="CantTop = 10";
_canttop = (int) (10);
 //BA.debugLineNum = 91;BA.debugLine="Txt_Top.Text = CantTop";
mostCurrent._txt_top.setText(BA.ObjectToCharSequence(_canttop));
 //BA.debugLineNum = 93;BA.debugLine="Doc_Seleccionado = False";
_doc_seleccionado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 94;BA.debugLine="Idmaeedo_Sel = 0";
_idmaeedo_sel = (int) (0);
 //BA.debugLineNum = 95;BA.debugLine="Koen_Sel = \"\"";
_koen_sel = "";
 //BA.debugLineNum = 96;BA.debugLine="Suen_Sel = \"\"";
_suen_sel = "";
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public static void  _btn_actualizar_click() throws Exception{
ResumableSub_Btn_Actualizar_Click rsub = new ResumableSub_Btn_Actualizar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Actualizar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Actualizar_Click(BaKapp.Movil.Tag.frm_documentos_generados parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_documentos_generados parent;
String _tido = "";
int _ddesde = 0;
int _mdesde = 0;
int _ydesde = 0;
int _dhasta = 0;
int _mhasta = 0;
int _yhasta = 0;
String _fecha = "";
String _fechadesde = "";
String _fechahasta = "";
String _filtroesdo = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _nudo = "";
String _sudo = "";
String _koen = "";
String _suen = "";
String _rut = "";
String _esdo = "";
String _feemdo = "";
String _razon_social = "";
double _total = 0;
int _items = 0;
int _idmaeedo = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 150;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
 //BA.debugLineNum = 151;BA.debugLine="B4XLoading.Show";
parent.mostCurrent._b4xloading._show /*String*/ ();
 //BA.debugLineNum = 153;BA.debugLine="Dim Tido As String";
_tido = "";
 //BA.debugLineNum = 155;BA.debugLine="If Rdb_COV.Checked Then Tido = \"COV\"";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._rdb_cov.getChecked()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_tido = "COV";
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 156;BA.debugLine="If Rdb_NVV.Checked Then Tido = \"NVV\"";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent._rdb_nvv.getChecked()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_tido = "NVV";
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 158;BA.debugLine="Dim DDesde As Int = DateTime.GetDayOfMonth(DateTe";
_ddesde = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(parent.mostCurrent._datetemplatedesde._getdate /*long*/ ());
 //BA.debugLineNum = 159;BA.debugLine="Dim MDesde As Int = DateTime.GetMonth(DateTemplat";
_mdesde = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(parent.mostCurrent._datetemplatedesde._getdate /*long*/ ());
 //BA.debugLineNum = 160;BA.debugLine="Dim YDesde As Int = DateTime.Getyear(DateTemplate";
_ydesde = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(parent.mostCurrent._datetemplatedesde._getdate /*long*/ ());
 //BA.debugLineNum = 162;BA.debugLine="Dim DHasta As Int = DateTime.GetDayOfMonth(DateTe";
_dhasta = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(parent.mostCurrent._datetemplatehasta._getdate /*long*/ ());
 //BA.debugLineNum = 163;BA.debugLine="Dim MHasta As Int = DateTime.GetMonth(DateTemplat";
_mhasta = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(parent.mostCurrent._datetemplatehasta._getdate /*long*/ ());
 //BA.debugLineNum = 164;BA.debugLine="Dim YHasta As Int = DateTime.Getyear(DateTemplate";
_yhasta = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(parent.mostCurrent._datetemplatehasta._getdate /*long*/ ());
 //BA.debugLineNum = 166;BA.debugLine="Dim Fecha As String = YDesde & Funciones.Rellenar";
_fecha = BA.NumberToString(_ydesde)+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mdesde),(int) (2),"0")+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_ddesde),(int) (2),"0");
 //BA.debugLineNum = 167;BA.debugLine="Dim FechaDesde As String = YDesde & \"-\" & Funcion";
_fechadesde = BA.NumberToString(_ydesde)+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mdesde),(int) (2),"0")+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_ddesde),(int) (2),"0");
 //BA.debugLineNum = 168;BA.debugLine="Dim FechaHasta As String = YHasta & \"-\" & Funcion";
_fechahasta = BA.NumberToString(_yhasta)+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mhasta),(int) (2),"0")+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_dhasta),(int) (2),"0");
 //BA.debugLineNum = 170;BA.debugLine="Dim FiltroEsdo As String";
_filtroesdo = "";
 //BA.debugLineNum = 172;BA.debugLine="If Chk_SoloPendientes.Checked Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent.mostCurrent._chk_solopendientes.getChecked()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 173;BA.debugLine="FiltroEsdo = \"And ESDO = ''\"";
_filtroesdo = "And ESDO = ''";
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 176;BA.debugLine="CantTop = Txt_Top.Text";
parent._canttop = (int)(Double.parseDouble(parent.mostCurrent._txt_top.getText()));
 //BA.debugLineNum = 178;BA.debugLine="Consulta_Sql = \"Select Top \" & CantTop & \" IDMAEE";
parent.mostCurrent._consulta_sql = "Select Top "+BA.NumberToString(parent._canttop)+" IDMAEEDO,TIDO,NUDO,SUDO,ESDO,En.NOKOEN As RAZON,ENDO,SUENDO,CONVERT(varchar, FEEMDO,103) As FEEMDO,En.RTEN As RUT,VANEDO,VAIVDO,VABRDO,"+anywheresoftware.b4a.keywords.Common.CRLF+"(Select Count(KOPRCT) From MAEDDO Ddo Where Edo.IDMAEEDO = Ddo.IDMAEEDO) As ITEMS"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEEDO Edo"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join MAEEN En On En.KOEN = Edo.ENDO And En.SUEN = Edo.SUENDO"+anywheresoftware.b4a.keywords.Common.CRLF+"Where TIDO = '"+_tido+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And FEEMDO BETWEEN CONVERT(DateTime, '"+_fechadesde+" 00:00:00', 102) AND CONVERT(DATETIME, '"+_fechahasta+" 23:59:59', 102)"+anywheresoftware.b4a.keywords.Common.CRLF+"--And FEEMDO = '"+_fecha+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And KOFUDO = '"+BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))+"'"+anywheresoftware.b4a.keywords.Common.CRLF+_filtroesdo+anywheresoftware.b4a.keywords.Common.CRLF+"Order by NUDO Desc";
 //BA.debugLineNum = 188;BA.debugLine="ProgressDialogShow(\"Buscando documentos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando documentos..."));
 //BA.debugLineNum = 190;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_documentos_generados.getObject());
 //BA.debugLineNum = 191;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 43;
return;
case 43:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 193;BA.debugLine="If Js.Success Then";
if (true) break;

case 17:
//if
this.state = 42;
if (_js._success /*boolean*/ ) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 195;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 197;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 20:
//if
this.state = 41;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 22;
}else {
this.state = 40;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 199;BA.debugLine="Log(vJson)";
anywheresoftware.b4a.keywords.Common.LogImpl("315859763",_vjson,0);
 //BA.debugLineNum = 200;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 201;BA.debugLine="parser.Initialize(vJson)";
_parser.Initialize(_vjson);
 //BA.debugLineNum = 202;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 203;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 207;BA.debugLine="For Each Fila As Map In Table";
if (true) break;

case 23:
//for
this.state = 38;
_fila = new anywheresoftware.b4a.objects.collections.Map();
group32 = _table;
index32 = 0;
groupLen32 = group32.getSize();
this.state = 44;
if (true) break;

case 44:
//C
this.state = 38;
if (index32 < groupLen32) {
this.state = 25;
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group32.Get(index32)));}
if (true) break;

case 45:
//C
this.state = 44;
index32++;
if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 209;BA.debugLine="Dim Tido As String = Fila.Get(\"TIDO\")";
_tido = BA.ObjectToString(_fila.Get((Object)("TIDO")));
 //BA.debugLineNum = 210;BA.debugLine="Dim Nudo As String = Fila.Get(\"NUDO\")";
_nudo = BA.ObjectToString(_fila.Get((Object)("NUDO")));
 //BA.debugLineNum = 211;BA.debugLine="Dim Sudo As String = Fila.Get(\"SUDO\")";
_sudo = BA.ObjectToString(_fila.Get((Object)("SUDO")));
 //BA.debugLineNum = 212;BA.debugLine="Dim Koen As String = Fila.Get(\"ENDO\")";
_koen = BA.ObjectToString(_fila.Get((Object)("ENDO")));
 //BA.debugLineNum = 213;BA.debugLine="Dim Suen As String = Fila.Get(\"SUENDO\")";
_suen = BA.ObjectToString(_fila.Get((Object)("SUENDO")));
 //BA.debugLineNum = 214;BA.debugLine="Dim Rut As String = Fila.Get(\"RUT\")";
_rut = BA.ObjectToString(_fila.Get((Object)("RUT")));
 //BA.debugLineNum = 215;BA.debugLine="Dim Esdo As String = Fila.Get(\"ESDO\")";
_esdo = BA.ObjectToString(_fila.Get((Object)("ESDO")));
 //BA.debugLineNum = 216;BA.debugLine="Dim Feemdo As String = Fila.Get(\"FEEMDO\")";
_feemdo = BA.ObjectToString(_fila.Get((Object)("FEEMDO")));
 //BA.debugLineNum = 217;BA.debugLine="Dim Razon_Social As String = Fila.Get(\"RAZON\")";
_razon_social = BA.ObjectToString(_fila.Get((Object)("RAZON")));
 //BA.debugLineNum = 218;BA.debugLine="Dim Total As Double = Fila.Get(\"VABRDO\")";
_total = (double)(BA.ObjectToNumber(_fila.Get((Object)("VABRDO"))));
 //BA.debugLineNum = 219;BA.debugLine="Dim Items As Int = Fila.Get(\"ITEMS\")";
_items = (int)(BA.ObjectToNumber(_fila.Get((Object)("ITEMS"))));
 //BA.debugLineNum = 220;BA.debugLine="Dim Idmaeedo As Int = Fila.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEEDO"))));
 //BA.debugLineNum = 222;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent.mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 224;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
 //BA.debugLineNum = 225;BA.debugLine="p.LoadLayout(\"Items_Documentos_Generados\")";
_p.LoadLayout("Items_Documentos_Generados",mostCurrent.activityBA);
 //BA.debugLineNum = 226;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 228;BA.debugLine="Lbl_Tido.Text = Tido";
parent.mostCurrent._lbl_tido.setText(BA.ObjectToCharSequence(_tido));
 //BA.debugLineNum = 229;BA.debugLine="Lbl_Nudo.Text = Nudo";
parent.mostCurrent._lbl_nudo.setText(BA.ObjectToCharSequence(_nudo));
 //BA.debugLineNum = 230;BA.debugLine="Lbl_Sucursal.Text = Sudo";
parent.mostCurrent._lbl_sucursal.setText(BA.ObjectToCharSequence(_sudo));
 //BA.debugLineNum = 231;BA.debugLine="Lbl_Feemdo.Text = Feemdo";
parent.mostCurrent._lbl_feemdo.setText(BA.ObjectToCharSequence(_feemdo));
 //BA.debugLineNum = 232;BA.debugLine="Lbl_KoenSuen.Tag = Koen & \";\" & Suen";
parent.mostCurrent._lbl_koensuen.setTag((Object)(_koen+";"+_suen));
 //BA.debugLineNum = 233;BA.debugLine="Lbl_Razon_Social.Text = Razon_Social";
parent.mostCurrent._lbl_razon_social.setText(BA.ObjectToCharSequence(_razon_social));
 //BA.debugLineNum = 234;BA.debugLine="Lbl_Total.Tag = Total";
parent.mostCurrent._lbl_total.setTag((Object)(_total));
 //BA.debugLineNum = 235;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(Total,0,2";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_total,(int) (0),(int) (2))));
 //BA.debugLineNum = 236;BA.debugLine="Lbl_Items.Text = Items";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence(_items));
 //BA.debugLineNum = 237;BA.debugLine="Lbl_Rut.Tag = Rut";
parent.mostCurrent._lbl_rut.setTag((Object)(_rut));
 //BA.debugLineNum = 238;BA.debugLine="Lbl_Rut.Text = NumberFormat(Rut,0,0) & \"-\" & F";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_rut)),(int) (0),(int) (0))+"-"+parent.mostCurrent._funciones._rutdigito /*String*/ (mostCurrent.activityBA,(long)(Double.parseDouble(_rut)))));
 //BA.debugLineNum = 239;BA.debugLine="Lbl_Idmaeedo.Tag = Idmaeedo";
parent.mostCurrent._lbl_idmaeedo.setTag((Object)(_idmaeedo));
 //BA.debugLineNum = 240;BA.debugLine="Lbl_Idmaeedo.Text = \"ID: \" & Idmaeedo";
parent.mostCurrent._lbl_idmaeedo.setText(BA.ObjectToCharSequence("ID: "+BA.NumberToString(_idmaeedo)));
 //BA.debugLineNum = 241;BA.debugLine="Lbl_Estado.Tag = Esdo";
parent.mostCurrent._lbl_estado.setTag((Object)(_esdo));
 //BA.debugLineNum = 243;BA.debugLine="If Esdo = \"C\" Then";
if (true) break;

case 26:
//if
this.state = 29;
if ((_esdo).equals("C")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 244;BA.debugLine="Lbl_Estado.Text = \"Cerrado\"";
parent.mostCurrent._lbl_estado.setText(BA.ObjectToCharSequence("Cerrado"));
 //BA.debugLineNum = 245;BA.debugLine="Lbl_Estado.TextColor = Colors.RGB(240, 124, 7";
parent.mostCurrent._lbl_estado.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (240),(int) (124),(int) (73)));
 if (true) break;
;
 //BA.debugLineNum = 247;BA.debugLine="If Esdo.Trim = \"\" Then";

case 29:
//if
this.state = 32;
if ((_esdo.trim()).equals("")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 248;BA.debugLine="Lbl_Estado.Text = \"Abierto\"";
parent.mostCurrent._lbl_estado.setText(BA.ObjectToCharSequence("Abierto"));
 //BA.debugLineNum = 249;BA.debugLine="Lbl_Estado.TextColor = Colors.RGB(189, 247, 1";
parent.mostCurrent._lbl_estado.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (247),(int) (164)));
 if (true) break;
;
 //BA.debugLineNum = 251;BA.debugLine="If Esdo = \"N\" Then Lbl_Estado.Text = \"Nulo\"";

case 32:
//if
this.state = 37;
if ((_esdo).equals("N")) { 
this.state = 34;
;}if (true) break;

case 34:
//C
this.state = 37;
parent.mostCurrent._lbl_estado.setText(BA.ObjectToCharSequence("Nulo"));
if (true) break;

case 37:
//C
this.state = 45;
;
 //BA.debugLineNum = 253;BA.debugLine="XclvDetalle.Add(p,\"\")";
parent.mostCurrent._xclvdetalle._add(_p,(Object)(""));
 //BA.debugLineNum = 255;BA.debugLine="Log(Lbl_Idmaeedo.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("315859819",parent.mostCurrent._lbl_idmaeedo.getText(),0);
 if (true) break;
if (true) break;

case 38:
//C
this.state = 41;
;
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 261;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se encontraron registros"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = -1;
;
 //BA.debugLineNum = 267;BA.debugLine="B4XLoading.Hide";
parent.mostCurrent._b4xloading._hide /*String*/ ();
 //BA.debugLineNum = 268;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static void  _btn_fecha_desde_click() throws Exception{
ResumableSub_Btn_Fecha_Desde_Click rsub = new ResumableSub_Btn_Fecha_Desde_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Fecha_Desde_Click extends BA.ResumableSub {
public ResumableSub_Btn_Fecha_Desde_Click(BaKapp.Movil.Tag.frm_documentos_generados parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_documentos_generados parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 283;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplateDesde,";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._datetemplatedesde),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 284;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 285;BA.debugLine="Btn_Fecha_Desde.Text = DateTime.Date(DateTemplat";
parent.mostCurrent._btn_fecha_desde.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplatedesde._getdate /*long*/ ())));
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static void  _btn_fecha_hasta_click() throws Exception{
ResumableSub_Btn_Fecha_Hasta_Click rsub = new ResumableSub_Btn_Fecha_Hasta_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Fecha_Hasta_Click extends BA.ResumableSub {
public ResumableSub_Btn_Fecha_Hasta_Click(BaKapp.Movil.Tag.frm_documentos_generados parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_documentos_generados parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 290;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplateHasta,";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._datetemplatehasta),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 291;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 292;BA.debugLine="Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplat";
parent.mostCurrent._btn_fecha_hasta.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplatehasta._getdate /*long*/ ())));
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_volver_click() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Private Sub Btn_Volver_Click";
 //BA.debugLineNum = 274;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private XUI As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 24;BA.debugLine="Private Dialog As B4XDialog";
mostCurrent._dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 25;BA.debugLine="Private Base As B4XView";
mostCurrent._base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private DateTemplateDesde As B4XDateTemplate";
mostCurrent._datetemplatedesde = new BaKapp.Movil.Tag.b4xdatetemplate();
 //BA.debugLineNum = 27;BA.debugLine="Private DateTemplateHasta As B4XDateTemplate";
mostCurrent._datetemplatehasta = new BaKapp.Movil.Tag.b4xdatetemplate();
 //BA.debugLineNum = 28;BA.debugLine="Private CantTop As Int";
_canttop = 0;
 //BA.debugLineNum = 30;BA.debugLine="Dim Consulta_Sql As String";
mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 32;BA.debugLine="Private XclvDetalle As CustomListView";
mostCurrent._xclvdetalle = new b4a.example3.customlistview();
 //BA.debugLineNum = 33;BA.debugLine="Private Rdb_COV As RadioButton";
mostCurrent._rdb_cov = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Rdb_NVV As RadioButton";
mostCurrent._rdb_nvv = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Btn_Actualizar As Button";
mostCurrent._btn_actualizar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Btn_Volver As Button";
mostCurrent._btn_volver = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private B4XLoading As B4XLoadingIndicator";
mostCurrent._b4xloading = new BaKapp.Movil.Tag.b4xloadingindicator();
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_Tido As B4XView";
mostCurrent._lbl_tido = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Nudo As B4XView";
mostCurrent._lbl_nudo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_KoenSuen As B4XView";
mostCurrent._lbl_koensuen = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Lbl_Rut As B4XView";
mostCurrent._lbl_rut = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Lbl_Razon_Social As B4XView";
mostCurrent._lbl_razon_social = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Lbl_Total As B4XView";
mostCurrent._lbl_total = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Lbl_Items As B4XView";
mostCurrent._lbl_items = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Lbl_Idmaeedo As B4XView";
mostCurrent._lbl_idmaeedo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Btn_Fecha_Desde As Button";
mostCurrent._btn_fecha_desde = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Btn_Fecha_Hasta As Button";
mostCurrent._btn_fecha_hasta = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private Lbl_Feemdo As B4XView";
mostCurrent._lbl_feemdo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private Lbl_Estado As B4XView";
mostCurrent._lbl_estado = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private Chk_SoloPendientes As CheckBox";
mostCurrent._chk_solopendientes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private Txt_Top As EditText";
mostCurrent._txt_top = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private Lbl_Sucursal As B4XView";
mostCurrent._lbl_sucursal = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Idmaeedo_Sel As Int";
_idmaeedo_sel = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public Tido_Sel As String";
_tido_sel = "";
 //BA.debugLineNum = 12;BA.debugLine="Public Nudo_Sel As String";
_nudo_sel = "";
 //BA.debugLineNum = 13;BA.debugLine="Public Koen_Sel As String";
_koen_sel = "";
 //BA.debugLineNum = 14;BA.debugLine="Public Suen_Sel As String";
_suen_sel = "";
 //BA.debugLineNum = 15;BA.debugLine="Public Doc_Seleccionado As Boolean";
_doc_seleccionado = false;
 //BA.debugLineNum = 16;BA.debugLine="Public Estado_Sel As String";
_estado_sel = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public static void  _xclvdetalle_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_XclvDetalle_ItemLongClick rsub = new ResumableSub_XclvDetalle_ItemLongClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_XclvDetalle_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDetalle_ItemLongClick(BaKapp.Movil.Tag.frm_documentos_generados parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
BaKapp.Movil.Tag.frm_documentos_generados parent;
int _index;
Object _value;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblnudo = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltido = null;
anywheresoftware.b4a.objects.LabelWrapper _lblidmaeedo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblestado = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
Object _sf = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 110;BA.debugLine="Dim XUI As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 111;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_index);
 //BA.debugLineNum = 112;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 114;BA.debugLine="Dim LblNudo As Label = p.GetView(0)";
_lblnudo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblnudo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 115;BA.debugLine="Dim LblTido As Label = p.GetView(3)";
_lbltido = new anywheresoftware.b4a.objects.LabelWrapper();
_lbltido = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
 //BA.debugLineNum = 116;BA.debugLine="Dim LblIdmaeedo As Label = p.GetView(8)";
_lblidmaeedo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblidmaeedo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (8)).getObject()));
 //BA.debugLineNum = 117;BA.debugLine="Dim LblEstado As Label = p.GetView(14)";
_lblestado = new anywheresoftware.b4a.objects.LabelWrapper();
_lblestado = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (14)).getObject()));
 //BA.debugLineNum = 119;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 120;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 122;BA.debugLine="If LblEstado.Tag = \"C\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_lblestado.getTag()).equals((Object)("C"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 124;BA.debugLine="Dim sf As Object = XUI.Msgbox2Async(LblTido.Text";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbltido.getText()+"-"+_lblnudo.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"Cerrado completamente"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1);
 //BA.debugLineNum = 126;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 127;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 131;BA.debugLine="Estado_Sel = LblEstado.Tag";
parent._estado_sel = BA.ObjectToString(_lblestado.getTag());
 //BA.debugLineNum = 132;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 134;BA.debugLine="Dim sf As Object = XUI.Msgbox2Async(LblTido.Text";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbltido.getText()+"-"+_lblnudo.getText()),BA.ObjectToCharSequence("Seleccionar documento"),"Seleccionar","Cancelar","",_bmp1);
 //BA.debugLineNum = 135;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 10;
return;
case 10:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 137;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 139;BA.debugLine="Doc_Seleccionado = True";
parent._doc_seleccionado = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 140;BA.debugLine="Idmaeedo_Sel = LblIdmaeedo.Tag";
parent._idmaeedo_sel = (int)(BA.ObjectToNumber(_lblidmaeedo.getTag()));
 //BA.debugLineNum = 142;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
}
