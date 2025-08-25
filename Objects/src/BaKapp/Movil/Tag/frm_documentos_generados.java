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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_documentos_generados");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
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
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.collections.List _items = null;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Activity.LoadLayout(\"Cp_Documentos_Generados\")";
mostCurrent._activity.LoadLayout("Cp_Documentos_Generados",mostCurrent.activityBA);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="Dialog.Initialize (Base)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._base);
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="Dialog.Title = \"Bakapp\"";
mostCurrent._dialog._title /*Object*/  = (Object)("Bakapp");
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="DateTemplateDesde.Initialize";
mostCurrent._datetemplatedesde._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="DateTemplateHasta.Initialize";
mostCurrent._datetemplatehasta._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="DateTemplateDesde.Date = DateTime.Now";
mostCurrent._datetemplatedesde._setdate /*long*/ (null,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="DateTemplateHasta.Date = DateTime.Now";
mostCurrent._datetemplatehasta._setdate /*long*/ (null,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="Btn_Fecha_Desde.Text = DateTime.Date(DateTemplate";
mostCurrent._btn_fecha_desde.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._datetemplatedesde._getdate /*long*/ (null))));
RDebugUtils.currentLine=14942224;
 //BA.debugLineNum = 14942224;BA.debugLine="Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplate";
mostCurrent._btn_fecha_hasta.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._datetemplatehasta._getdate /*long*/ (null))));
RDebugUtils.currentLine=14942226;
 //BA.debugLineNum = 14942226;BA.debugLine="DateTemplateDesde.MaxYear = DateTime.GetYear(Date";
mostCurrent._datetemplatedesde._maxyear /*int*/  = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="DateTemplateDesde.MinYear = DateTemplateDesde.Max";
mostCurrent._datetemplatedesde._minyear /*int*/  = (int) (mostCurrent._datetemplatedesde._maxyear /*int*/ -10);
RDebugUtils.currentLine=14942229;
 //BA.debugLineNum = 14942229;BA.debugLine="DateTemplateHasta.MaxYear = DateTime.GetYear(Date";
mostCurrent._datetemplatehasta._maxyear /*int*/  = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14942230;
 //BA.debugLineNum = 14942230;BA.debugLine="DateTemplateHasta.MinYear = DateTemplateDesde.Max";
mostCurrent._datetemplatehasta._minyear /*int*/  = (int) (mostCurrent._datetemplatedesde._maxyear /*int*/ -10);
RDebugUtils.currentLine=14942232;
 //BA.debugLineNum = 14942232;BA.debugLine="B4XLoading.Hide";
mostCurrent._b4xloading._hide /*String*/ (null);
RDebugUtils.currentLine=14942234;
 //BA.debugLineNum = 14942234;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14942235;
 //BA.debugLineNum = 14942235;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=14942236;
 //BA.debugLineNum = 14942236;BA.debugLine="Items.Add(\"10\")";
_items.Add((Object)("10"));
RDebugUtils.currentLine=14942237;
 //BA.debugLineNum = 14942237;BA.debugLine="Items.Add(\"20\")";
_items.Add((Object)("20"));
RDebugUtils.currentLine=14942238;
 //BA.debugLineNum = 14942238;BA.debugLine="Items.Add(\"30\")";
_items.Add((Object)("30"));
RDebugUtils.currentLine=14942239;
 //BA.debugLineNum = 14942239;BA.debugLine="Items.Add(\"40\")";
_items.Add((Object)("40"));
RDebugUtils.currentLine=14942240;
 //BA.debugLineNum = 14942240;BA.debugLine="Items.Add(\"50\")";
_items.Add((Object)("50"));
RDebugUtils.currentLine=14942241;
 //BA.debugLineNum = 14942241;BA.debugLine="Items.Add(\"100\")";
_items.Add((Object)("100"));
RDebugUtils.currentLine=14942243;
 //BA.debugLineNum = 14942243;BA.debugLine="CantTop = 10";
_canttop = (int) (10);
RDebugUtils.currentLine=14942244;
 //BA.debugLineNum = 14942244;BA.debugLine="Txt_Top.Text = CantTop";
mostCurrent._txt_top.setText(BA.ObjectToCharSequence(_canttop));
RDebugUtils.currentLine=14942246;
 //BA.debugLineNum = 14942246;BA.debugLine="Doc_Seleccionado = False";
_doc_seleccionado = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=14942247;
 //BA.debugLineNum = 14942247;BA.debugLine="Idmaeedo_Sel = 0";
_idmaeedo_sel = (int) (0);
RDebugUtils.currentLine=14942248;
 //BA.debugLineNum = 14942248;BA.debugLine="Koen_Sel = \"\"";
_koen_sel = "";
RDebugUtils.currentLine=14942249;
 //BA.debugLineNum = 14942249;BA.debugLine="Suen_Sel = \"\"";
_suen_sel = "";
RDebugUtils.currentLine=14942251;
 //BA.debugLineNum = 14942251;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return "";
}
public static void  _btn_actualizar_click() throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_actualizar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_actualizar_click", null); return;}
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
RDebugUtils.currentModule="frm_documentos_generados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="B4XLoading.Show";
parent.mostCurrent._b4xloading._show /*String*/ (null);
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Dim Tido As String";
_tido = "";
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="If Rdb_COV.Checked Then Tido = \"COV\"";
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
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="If Rdb_NVV.Checked Then Tido = \"NVV\"";
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
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Dim DDesde As Int = DateTime.GetDayOfMonth(DateTe";
_ddesde = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(parent.mostCurrent._datetemplatedesde._getdate /*long*/ (null));
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="Dim MDesde As Int = DateTime.GetMonth(DateTemplat";
_mdesde = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(parent.mostCurrent._datetemplatedesde._getdate /*long*/ (null));
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="Dim YDesde As Int = DateTime.Getyear(DateTemplate";
_ydesde = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(parent.mostCurrent._datetemplatedesde._getdate /*long*/ (null));
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="Dim DHasta As Int = DateTime.GetDayOfMonth(DateTe";
_dhasta = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(parent.mostCurrent._datetemplatehasta._getdate /*long*/ (null));
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="Dim MHasta As Int = DateTime.GetMonth(DateTemplat";
_mhasta = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(parent.mostCurrent._datetemplatehasta._getdate /*long*/ (null));
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="Dim YHasta As Int = DateTime.Getyear(DateTemplate";
_yhasta = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(parent.mostCurrent._datetemplatehasta._getdate /*long*/ (null));
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="Dim Fecha As String = YDesde & Funciones.Rellenar";
_fecha = BA.NumberToString(_ydesde)+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mdesde),(int) (2),"0")+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_ddesde),(int) (2),"0");
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="Dim FechaDesde As String = YDesde & \"-\" & Funcion";
_fechadesde = BA.NumberToString(_ydesde)+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mdesde),(int) (2),"0")+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_ddesde),(int) (2),"0");
RDebugUtils.currentLine=15204372;
 //BA.debugLineNum = 15204372;BA.debugLine="Dim FechaHasta As String = YHasta & \"-\" & Funcion";
_fechahasta = BA.NumberToString(_yhasta)+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mhasta),(int) (2),"0")+"-"+parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_dhasta),(int) (2),"0");
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="Dim FiltroEsdo As String";
_filtroesdo = "";
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="If Chk_SoloPendientes.Checked Then";
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
RDebugUtils.currentLine=15204377;
 //BA.debugLineNum = 15204377;BA.debugLine="FiltroEsdo = \"And ESDO = ''\"";
_filtroesdo = "And ESDO = ''";
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=15204380;
 //BA.debugLineNum = 15204380;BA.debugLine="CantTop = Txt_Top.Text";
parent._canttop = (int)(Double.parseDouble(parent.mostCurrent._txt_top.getText()));
RDebugUtils.currentLine=15204382;
 //BA.debugLineNum = 15204382;BA.debugLine="Consulta_Sql = \"Select Top \" & CantTop & \" IDMAEE";
parent.mostCurrent._consulta_sql = "Select Top "+BA.NumberToString(parent._canttop)+" IDMAEEDO,TIDO,NUDO,SUDO,ESDO,En.NOKOEN As RAZON,ENDO,SUENDO,CONVERT(varchar, FEEMDO,103) As FEEMDO,En.RTEN As RUT,VANEDO,VAIVDO,VABRDO,"+anywheresoftware.b4a.keywords.Common.CRLF+"(Select Count(KOPRCT) From MAEDDO Ddo Where Edo.IDMAEEDO = Ddo.IDMAEEDO) As ITEMS"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEEDO Edo"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join MAEEN En On En.KOEN = Edo.ENDO And En.SUEN = Edo.SUENDO"+anywheresoftware.b4a.keywords.Common.CRLF+"Where TIDO = '"+_tido+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And FEEMDO BETWEEN CONVERT(DateTime, '"+_fechadesde+" 00:00:00', 102) AND CONVERT(DATETIME, '"+_fechahasta+" 23:59:59', 102)"+anywheresoftware.b4a.keywords.Common.CRLF+"--And FEEMDO = '"+_fecha+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And KOFUDO = '"+BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))+"'"+anywheresoftware.b4a.keywords.Common.CRLF+_filtroesdo+anywheresoftware.b4a.keywords.Common.CRLF+"Order by NUDO Desc";
RDebugUtils.currentLine=15204392;
 //BA.debugLineNum = 15204392;BA.debugLine="ProgressDialogShow(\"Buscando documentos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando documentos..."));
RDebugUtils.currentLine=15204394;
 //BA.debugLineNum = 15204394;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_documentos_generados.getObject());
RDebugUtils.currentLine=15204395;
 //BA.debugLineNum = 15204395;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_documentos_generados", "btn_actualizar_click"), (Object)(_js));
this.state = 43;
return;
case 43:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=15204397;
 //BA.debugLineNum = 15204397;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=15204399;
 //BA.debugLineNum = 15204399;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=15204401;
 //BA.debugLineNum = 15204401;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=15204403;
 //BA.debugLineNum = 15204403;BA.debugLine="Log(vJson)";
anywheresoftware.b4a.keywords.Common.LogImpl("215204403",_vjson,0);
RDebugUtils.currentLine=15204404;
 //BA.debugLineNum = 15204404;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15204405;
 //BA.debugLineNum = 15204405;BA.debugLine="parser.Initialize(vJson)";
_parser.Initialize(_vjson);
RDebugUtils.currentLine=15204406;
 //BA.debugLineNum = 15204406;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=15204407;
 //BA.debugLineNum = 15204407;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=15204411;
 //BA.debugLineNum = 15204411;BA.debugLine="For Each Fila As Map In Table";
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
RDebugUtils.currentLine=15204413;
 //BA.debugLineNum = 15204413;BA.debugLine="Dim Tido As String = Fila.Get(\"TIDO\")";
_tido = BA.ObjectToString(_fila.Get((Object)("TIDO")));
RDebugUtils.currentLine=15204414;
 //BA.debugLineNum = 15204414;BA.debugLine="Dim Nudo As String = Fila.Get(\"NUDO\")";
_nudo = BA.ObjectToString(_fila.Get((Object)("NUDO")));
RDebugUtils.currentLine=15204415;
 //BA.debugLineNum = 15204415;BA.debugLine="Dim Sudo As String = Fila.Get(\"SUDO\")";
_sudo = BA.ObjectToString(_fila.Get((Object)("SUDO")));
RDebugUtils.currentLine=15204416;
 //BA.debugLineNum = 15204416;BA.debugLine="Dim Koen As String = Fila.Get(\"ENDO\")";
_koen = BA.ObjectToString(_fila.Get((Object)("ENDO")));
RDebugUtils.currentLine=15204417;
 //BA.debugLineNum = 15204417;BA.debugLine="Dim Suen As String = Fila.Get(\"SUENDO\")";
_suen = BA.ObjectToString(_fila.Get((Object)("SUENDO")));
RDebugUtils.currentLine=15204418;
 //BA.debugLineNum = 15204418;BA.debugLine="Dim Rut As String = Fila.Get(\"RUT\")";
_rut = BA.ObjectToString(_fila.Get((Object)("RUT")));
RDebugUtils.currentLine=15204419;
 //BA.debugLineNum = 15204419;BA.debugLine="Dim Esdo As String = Fila.Get(\"ESDO\")";
_esdo = BA.ObjectToString(_fila.Get((Object)("ESDO")));
RDebugUtils.currentLine=15204420;
 //BA.debugLineNum = 15204420;BA.debugLine="Dim Feemdo As String = Fila.Get(\"FEEMDO\")";
_feemdo = BA.ObjectToString(_fila.Get((Object)("FEEMDO")));
RDebugUtils.currentLine=15204421;
 //BA.debugLineNum = 15204421;BA.debugLine="Dim Razon_Social As String = Fila.Get(\"RAZON\")";
_razon_social = BA.ObjectToString(_fila.Get((Object)("RAZON")));
RDebugUtils.currentLine=15204422;
 //BA.debugLineNum = 15204422;BA.debugLine="Dim Total As Double = Fila.Get(\"VABRDO\")";
_total = (double)(BA.ObjectToNumber(_fila.Get((Object)("VABRDO"))));
RDebugUtils.currentLine=15204423;
 //BA.debugLineNum = 15204423;BA.debugLine="Dim Items As Int = Fila.Get(\"ITEMS\")";
_items = (int)(BA.ObjectToNumber(_fila.Get((Object)("ITEMS"))));
RDebugUtils.currentLine=15204424;
 //BA.debugLineNum = 15204424;BA.debugLine="Dim Idmaeedo As Int = Fila.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=15204426;
 //BA.debugLineNum = 15204426;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent.mostCurrent._xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=15204428;
 //BA.debugLineNum = 15204428;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=15204429;
 //BA.debugLineNum = 15204429;BA.debugLine="p.LoadLayout(\"Items_Documentos_Generados\")";
_p.LoadLayout("Items_Documentos_Generados",mostCurrent.activityBA);
RDebugUtils.currentLine=15204430;
 //BA.debugLineNum = 15204430;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=15204432;
 //BA.debugLineNum = 15204432;BA.debugLine="Lbl_Tido.Text = Tido";
parent.mostCurrent._lbl_tido.setText(BA.ObjectToCharSequence(_tido));
RDebugUtils.currentLine=15204433;
 //BA.debugLineNum = 15204433;BA.debugLine="Lbl_Nudo.Text = Nudo";
parent.mostCurrent._lbl_nudo.setText(BA.ObjectToCharSequence(_nudo));
RDebugUtils.currentLine=15204434;
 //BA.debugLineNum = 15204434;BA.debugLine="Lbl_Sucursal.Text = Sudo";
parent.mostCurrent._lbl_sucursal.setText(BA.ObjectToCharSequence(_sudo));
RDebugUtils.currentLine=15204435;
 //BA.debugLineNum = 15204435;BA.debugLine="Lbl_Feemdo.Text = Feemdo";
parent.mostCurrent._lbl_feemdo.setText(BA.ObjectToCharSequence(_feemdo));
RDebugUtils.currentLine=15204436;
 //BA.debugLineNum = 15204436;BA.debugLine="Lbl_KoenSuen.Tag = Koen & \";\" & Suen";
parent.mostCurrent._lbl_koensuen.setTag((Object)(_koen+";"+_suen));
RDebugUtils.currentLine=15204437;
 //BA.debugLineNum = 15204437;BA.debugLine="Lbl_Razon_Social.Text = Razon_Social";
parent.mostCurrent._lbl_razon_social.setText(BA.ObjectToCharSequence(_razon_social));
RDebugUtils.currentLine=15204438;
 //BA.debugLineNum = 15204438;BA.debugLine="Lbl_Total.Tag = Total";
parent.mostCurrent._lbl_total.setTag((Object)(_total));
RDebugUtils.currentLine=15204439;
 //BA.debugLineNum = 15204439;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(Total,0,2";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_total,(int) (0),(int) (2))));
RDebugUtils.currentLine=15204440;
 //BA.debugLineNum = 15204440;BA.debugLine="Lbl_Items.Text = Items";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence(_items));
RDebugUtils.currentLine=15204441;
 //BA.debugLineNum = 15204441;BA.debugLine="Lbl_Rut.Tag = Rut";
parent.mostCurrent._lbl_rut.setTag((Object)(_rut));
RDebugUtils.currentLine=15204442;
 //BA.debugLineNum = 15204442;BA.debugLine="Lbl_Rut.Text = NumberFormat(Rut,0,0) & \"-\" & F";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_rut)),(int) (0),(int) (0))+"-"+parent.mostCurrent._funciones._rutdigito /*String*/ (mostCurrent.activityBA,(long)(Double.parseDouble(_rut)))));
RDebugUtils.currentLine=15204443;
 //BA.debugLineNum = 15204443;BA.debugLine="Lbl_Idmaeedo.Tag = Idmaeedo";
parent.mostCurrent._lbl_idmaeedo.setTag((Object)(_idmaeedo));
RDebugUtils.currentLine=15204444;
 //BA.debugLineNum = 15204444;BA.debugLine="Lbl_Idmaeedo.Text = \"ID: \" & Idmaeedo";
parent.mostCurrent._lbl_idmaeedo.setText(BA.ObjectToCharSequence("ID: "+BA.NumberToString(_idmaeedo)));
RDebugUtils.currentLine=15204445;
 //BA.debugLineNum = 15204445;BA.debugLine="Lbl_Estado.Tag = Esdo";
parent.mostCurrent._lbl_estado.setTag((Object)(_esdo));
RDebugUtils.currentLine=15204447;
 //BA.debugLineNum = 15204447;BA.debugLine="If Esdo = \"C\" Then";
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
RDebugUtils.currentLine=15204448;
 //BA.debugLineNum = 15204448;BA.debugLine="Lbl_Estado.Text = \"Cerrado\"";
parent.mostCurrent._lbl_estado.setText(BA.ObjectToCharSequence("Cerrado"));
RDebugUtils.currentLine=15204449;
 //BA.debugLineNum = 15204449;BA.debugLine="Lbl_Estado.TextColor = Colors.RGB(240, 124, 7";
parent.mostCurrent._lbl_estado.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (240),(int) (124),(int) (73)));
 if (true) break;
;
RDebugUtils.currentLine=15204451;
 //BA.debugLineNum = 15204451;BA.debugLine="If Esdo.Trim = \"\" Then";

case 29:
//if
this.state = 32;
if ((_esdo.trim()).equals("")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=15204452;
 //BA.debugLineNum = 15204452;BA.debugLine="Lbl_Estado.Text = \"Abierto\"";
parent.mostCurrent._lbl_estado.setText(BA.ObjectToCharSequence("Abierto"));
RDebugUtils.currentLine=15204453;
 //BA.debugLineNum = 15204453;BA.debugLine="Lbl_Estado.TextColor = Colors.RGB(189, 247, 1";
parent.mostCurrent._lbl_estado.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (189),(int) (247),(int) (164)));
 if (true) break;
;
RDebugUtils.currentLine=15204455;
 //BA.debugLineNum = 15204455;BA.debugLine="If Esdo = \"N\" Then Lbl_Estado.Text = \"Nulo\"";

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
RDebugUtils.currentLine=15204457;
 //BA.debugLineNum = 15204457;BA.debugLine="XclvDetalle.Add(p,\"\")";
parent.mostCurrent._xclvdetalle._add(_p,(Object)(""));
RDebugUtils.currentLine=15204459;
 //BA.debugLineNum = 15204459;BA.debugLine="Log(Lbl_Idmaeedo.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("215204459",parent.mostCurrent._lbl_idmaeedo.getText(),0);
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
RDebugUtils.currentLine=15204465;
 //BA.debugLineNum = 15204465;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
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
RDebugUtils.currentLine=15204471;
 //BA.debugLineNum = 15204471;BA.debugLine="B4XLoading.Hide";
parent.mostCurrent._b4xloading._hide /*String*/ (null);
RDebugUtils.currentLine=15204472;
 //BA.debugLineNum = 15204472;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=15204475;
 //BA.debugLineNum = 15204475;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_fecha_desde_click() throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_fecha_desde_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_fecha_desde_click", null); return;}
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
RDebugUtils.currentModule="frm_documentos_generados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplateDesde,";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_documentos_generados", "btn_fecha_desde_click"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._datetemplatedesde),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Btn_Fecha_Desde.Text = DateTime.Date(DateTemplat";
parent.mostCurrent._btn_fecha_desde.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplatedesde._getdate /*long*/ (null))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_fecha_hasta_click() throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_fecha_hasta_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_fecha_hasta_click", null); return;}
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
RDebugUtils.currentModule="frm_documentos_generados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplateHasta,";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_documentos_generados", "btn_fecha_hasta_click"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._datetemplatehasta),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplat";
parent.mostCurrent._btn_fecha_hasta.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplatehasta._getdate /*long*/ (null))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_volver_click() throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_volver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_volver_click", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub Btn_Volver_Click";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="End Sub";
return "";
}
public static void  _xclvdetalle_itemlongclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="frm_documentos_generados";
if (Debug.shouldDelegate(mostCurrent.activityBA, "xclvdetalle_itemlongclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "xclvdetalle_itemlongclick", new Object[] {_index,_value}); return;}
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
RDebugUtils.currentModule="frm_documentos_generados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim XUI As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_index);
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Dim LblNudo As Label = p.GetView(0)";
_lblnudo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblnudo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="Dim LblTido As Label = p.GetView(3)";
_lbltido = new anywheresoftware.b4a.objects.LabelWrapper();
_lbltido = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Dim LblIdmaeedo As Label = p.GetView(8)";
_lblidmaeedo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblidmaeedo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (8)).getObject()));
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="Dim LblEstado As Label = p.GetView(14)";
_lblestado = new anywheresoftware.b4a.objects.LabelWrapper();
_lblestado = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (14)).getObject()));
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="If LblEstado.Tag = \"C\" Then";
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
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="Dim sf As Object = XUI.Msgbox2Async(LblTido.Text";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbltido.getText()+"-"+_lblnudo.getText()+anywheresoftware.b4a.keywords.Common.CRLF+"Cerrado completamente"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1);
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_documentos_generados", "xclvdetalle_itemlongclick"), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="Estado_Sel = LblEstado.Tag";
parent._estado_sel = BA.ObjectToString(_lblestado.getTag());
RDebugUtils.currentLine=15138840;
 //BA.debugLineNum = 15138840;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=15138842;
 //BA.debugLineNum = 15138842;BA.debugLine="Dim sf As Object = XUI.Msgbox2Async(LblTido.Text";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbltido.getText()+"-"+_lblnudo.getText()),BA.ObjectToCharSequence("Seleccionar documento"),"Seleccionar","Cancelar","",_bmp1);
RDebugUtils.currentLine=15138843;
 //BA.debugLineNum = 15138843;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_documentos_generados", "xclvdetalle_itemlongclick"), _sf);
this.state = 10;
return;
case 10:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=15138845;
 //BA.debugLineNum = 15138845;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=15138847;
 //BA.debugLineNum = 15138847;BA.debugLine="Doc_Seleccionado = True";
parent._doc_seleccionado = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=15138848;
 //BA.debugLineNum = 15138848;BA.debugLine="Idmaeedo_Sel = LblIdmaeedo.Tag";
parent._idmaeedo_sel = (int)(BA.ObjectToNumber(_lblidmaeedo.getTag()));
RDebugUtils.currentLine=15138850;
 //BA.debugLineNum = 15138850;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=15138854;
 //BA.debugLineNum = 15138854;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}