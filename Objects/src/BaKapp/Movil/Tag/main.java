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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (buscar_entidad.mostCurrent != null);
vis = vis | (buscar_productos.mostCurrent != null);
vis = vis | (frm_impresion.mostCurrent != null);
vis = vis | (conf_local.mostCurrent != null);
vis = vis | (frm_buscar_documento.mostCurrent != null);
vis = vis | (frm_documentos_generados.mostCurrent != null);
vis = vis | (frm_editar_obsoc.mostCurrent != null);
vis = vis | (frm_etiquetas.mostCurrent != null);
vis = vis | (frm_infostockxprod.mostCurrent != null);
vis = vis | (frm_menu_post_venta.mostCurrent != null);
vis = vis | (frm_menu_principal.mostCurrent != null);
vis = vis | (frm_post_01_descuentos.mostCurrent != null);
vis = vis | (frm_post_01_formulario.mostCurrent != null);
vis = vis | (frm_post_01_producto.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (buscar_entidad.previousOne != null) {
				__a = buscar_entidad.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(buscar_entidad.mostCurrent == null ? null : buscar_entidad.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (buscar_productos.previousOne != null) {
				__a = buscar_productos.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(buscar_productos.mostCurrent == null ? null : buscar_productos.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_impresion.previousOne != null) {
				__a = frm_impresion.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_impresion.mostCurrent == null ? null : frm_impresion.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (conf_local.previousOne != null) {
				__a = conf_local.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(conf_local.mostCurrent == null ? null : conf_local.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_buscar_documento.previousOne != null) {
				__a = frm_buscar_documento.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_buscar_documento.mostCurrent == null ? null : frm_buscar_documento.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_documentos_generados.previousOne != null) {
				__a = frm_documentos_generados.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_documentos_generados.mostCurrent == null ? null : frm_documentos_generados.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_editar_obsoc.previousOne != null) {
				__a = frm_editar_obsoc.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_editar_obsoc.mostCurrent == null ? null : frm_editar_obsoc.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_etiquetas.previousOne != null) {
				__a = frm_etiquetas.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_etiquetas.mostCurrent == null ? null : frm_etiquetas.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_infostockxprod.previousOne != null) {
				__a = frm_infostockxprod.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_infostockxprod.mostCurrent == null ? null : frm_infostockxprod.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_menu_post_venta.previousOne != null) {
				__a = frm_menu_post_venta.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_menu_post_venta.mostCurrent == null ? null : frm_menu_post_venta.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_menu_principal.previousOne != null) {
				__a = frm_menu_principal.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_menu_principal.mostCurrent == null ? null : frm_menu_principal.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_post_01_descuentos.previousOne != null) {
				__a = frm_post_01_descuentos.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_post_01_descuentos.mostCurrent == null ? null : frm_post_01_descuentos.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_post_01_formulario.previousOne != null) {
				__a = frm_post_01_formulario.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_post_01_formulario.mostCurrent == null ? null : frm_post_01_formulario.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (frm_post_01_producto.previousOne != null) {
				__a = frm_post_01_producto.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(frm_post_01_producto.mostCurrent == null ? null : frm_post_01_producto.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _consulta_sql = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txt_clave = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_aceptar_login = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_version = null;
public anywheresoftware.b4a.objects.IME _tecladosoft = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_id_dispositivo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_conf_acceso_ws = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public BaKapp.Movil.Tag.b4xdialog _dialog = null;
public BaKapp.Movil.Tag.b4xfloattextfield _txt_flp_webservice = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
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
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
BaKapp.Movil.Tag.main parent;
boolean _firsttime;
String _dbfilename = "";
String _dbfiledir = "";
String _directoriodef = "";
String _targetdir = "";
int _result = 0;
String _line = "";
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Activity.LoadLayout(\"Acreditacion_Login\")";
parent.mostCurrent._activity.LoadLayout("Acreditacion_Login",mostCurrent.activityBA);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="dialog.Initialize(Activity)";
parent.mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject())));
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="dialog.Title = \"Conexión WebService\"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("Conexión WebService");
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="DisableStrictMode";
_disablestrictmode();
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Variables.Global_Version_BakApp = Application.Ver";
parent.mostCurrent._variables._global_version_bakapp /*String*/  = anywheresoftware.b4a.keywords.Common.Application.getVersionName();
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="Lbl_Version.Text = Application.LabelName & \" Vers";
parent.mostCurrent._lbl_version.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()+" Versión: "+anywheresoftware.b4a.keywords.Common.Application.getVersionName()));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="Txt_Clave.PasswordMode=False";
parent.mostCurrent._txt_clave.setPasswordMode(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="Dim DBFileName As String = \"bakapp_db.db\" '\"BakAp";
_dbfilename = "bakapp_db.db";
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="Dim DBFileDir As String";
_dbfiledir = "";
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="Dim DirectorioDef As String= DBUtils.GetDBFolder";
_directoriodef = parent.mostCurrent._dbutils._getdbfolder /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="If File.Exists(DirectorioDef, DBFileName) = True";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_directoriodef,_dbfilename)==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="File.Delete(DirectorioDef, \"bakapp_db.db\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_directoriodef,"bakapp_db.db");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="DBFileDir = DBUtils.CopyDBFromAssets(DBFileName)";
_dbfiledir = parent.mostCurrent._dbutils._copydbfromassets /*String*/ (mostCurrent.activityBA,_dbfilename);
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="Variables.vSql.Initialize(DBFileDir, DBFileName,";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(_dbfiledir,_dbfilename,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="Variables.Global_IdDispositivo = Funciones.Fx_Tra";
parent.mostCurrent._variables._global_iddispositivo /*String*/  = parent.mostCurrent._funciones._fx_traer_iddispositivo /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Clave)";
parent.mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(parent.mostCurrent._txt_clave.getObject()));
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="Lbl_Id_Dispositivo.Text = \"Id. dispositivo: \" & V";
parent.mostCurrent._lbl_id_dispositivo.setText(BA.ObjectToCharSequence("Id. dispositivo: "+parent.mostCurrent._variables._global_iddispositivo /*String*/ ));
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="Dim TargetDir As String = DBUtils.GetDBFolder";
_targetdir = parent.mostCurrent._dbutils._getdbfolder /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=131133;
 //BA.debugLineNum = 131133;BA.debugLine="If Not(File.Exists(TargetDir, \"ConexionWebService";
if (true) break;

case 5:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,"ConexionWebService.txt"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 14;
RDebugUtils.currentLine=131134;
 //BA.debugLineNum = 131134;BA.debugLine="Msgbox2Async(\"Falta la configuración al Web Serv";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración al Web Service."),BA.ObjectToCharSequence("Validación"),"Ok","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "activity_create"), null);
this.state = 15;
return;
case 15:
//C
this.state = 14;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=131136;
 //BA.debugLineNum = 131136;BA.debugLine="Log(\"No existe el archivo ConexionWebService.txt";
anywheresoftware.b4a.keywords.Common.LogImpl("2131136","No existe el archivo ConexionWebService.txt",0);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="For Each line As String In File.ReadList(TargetD";
if (true) break;

case 10:
//for
this.state = 13;
group25 = anywheresoftware.b4a.keywords.Common.File.ReadList(_targetdir,"ConexionWebService.txt");
index25 = 0;
groupLen25 = group25.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if (index25 < groupLen25) {
this.state = 12;
_line = BA.ObjectToString(group25.Get(index25));}
if (true) break;

case 17:
//C
this.state = 16;
index25++;
if (true) break;

case 12:
//C
this.state = 17;
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="Variables.Global_Ip_WebService = line";
parent.mostCurrent._variables._global_ip_webservice /*String*/  = _line;
RDebugUtils.currentLine=131142;
 //BA.debugLineNum = 131142;BA.debugLine="Exit";
this.state = 13;
if (true) break;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="Log(Variables.Global_Ip_WebService)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131144",parent.mostCurrent._variables._global_ip_webservice /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _disablestrictmode() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "disablestrictmode", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "disablestrictmode", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _policy = null;
anywheresoftware.b4j.object.JavaObject _sm = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub DisableStrictMode";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
_jo.InitializeStatic("android.os.Build.VERSION");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
if ((double)(BA.ObjectToNumber(_jo.GetField("SDK_INT")))>9) { 
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim policy As JavaObject";
_policy = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="policy = policy.InitializeNewInstance(\"android.o";
_policy = _policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null).R";
_policy = _policy.RunMethodJO("permitAll",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("build",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="Dim sm As JavaObject";
_sm = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").Run";
_sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy",new Object[]{(Object)(_policy.getObject())});
 };
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _vsalir = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"exit.png");
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de cerrar la apl";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de cerrar la aplicación?"),BA.ObjectToCharSequence("S A L I R"),"Si","","No",(android.graphics.Bitmap)(_bmp1.getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static void  _btn_aceptar_login_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_aceptar_login_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_aceptar_login_click", null); return;}
ResumableSub_Btn_Aceptar_Login_Click rsub = new ResumableSub_Btn_Aceptar_Login_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Aceptar_Login_Click extends BA.ResumableSub {
public ResumableSub_Btn_Aceptar_Login_Click(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.main parent;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
BaKapp.Movil.Tag.conectar_conf _conf = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="Btn_Aceptar_Login.Enabled = False";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="Txt_Clave.Enabled = False";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = False";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="Dim Conf As Conectar_Conf";
_conf = new BaKapp.Movil.Tag.conectar_conf();
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="Conf.Initialize";
_conf._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="ProgressDialogShow(\"Cargando datos de configuraci";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Cargando datos de configuración..."));
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="Wait For(Conf.Sb_Cargar_Datos_De_Configuracion())";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_aceptar_login_click"), _conf._sb_cargar_datos_de_configuracion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=327712;
 //BA.debugLineNum = 327712;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="If Result = 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=327716;
 //BA.debugLineNum = 327716;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="Msgbox2Async(\"No es posible ingresar al sistema,";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar al sistema, faltan configuraciones desde Bakapp Windows Form"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_aceptar_login_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=327719;
 //BA.debugLineNum = 327719;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327720;
 //BA.debugLineNum = 327720;BA.debugLine="Txt_Clave.Enabled = True";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327721;
 //BA.debugLineNum = 327721;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=327726;
 //BA.debugLineNum = 327726;BA.debugLine="If Result = 2 Then";

case 4:
//if
this.state = 7;
if (_result==2) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=327728;
 //BA.debugLineNum = 327728;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=327729;
 //BA.debugLineNum = 327729;BA.debugLine="Msgbox2Async(\"No es posible ingresar al sistema,";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar al sistema, faltan configuraciones en WebService"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327730;
 //BA.debugLineNum = 327730;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_aceptar_login_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=327731;
 //BA.debugLineNum = 327731;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327732;
 //BA.debugLineNum = 327732;BA.debugLine="Txt_Clave.Enabled = True";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327733;
 //BA.debugLineNum = 327733;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327734;
 //BA.debugLineNum = 327734;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=327738;
 //BA.debugLineNum = 327738;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=327740;
 //BA.debugLineNum = 327740;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=327741;
 //BA.debugLineNum = 327741;BA.debugLine="Msgbox2Async(\"ACCESO AUTORIZADO\" , \"Ingresar al s";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("ACCESO AUTORIZADO"),BA.ObjectToCharSequence("Ingresar al sistema"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327742;
 //BA.debugLineNum = 327742;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_aceptar_login_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=327744;
 //BA.debugLineNum = 327744;BA.debugLine="StartActivity(Frm_Menu_Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_principal.getObject()));
RDebugUtils.currentLine=327746;
 //BA.debugLineNum = 327746;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327747;
 //BA.debugLineNum = 327747;BA.debugLine="Txt_Clave.Enabled = True";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327748;
 //BA.debugLineNum = 327748;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327750;
 //BA.debugLineNum = 327750;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_conf_acceso_ws_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_conf_acceso_ws_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_conf_acceso_ws_click", null); return;}
ResumableSub_Btn_Conf_Acceso_WS_Click rsub = new ResumableSub_Btn_Conf_Acceso_WS_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Conf_Acceso_WS_Click extends BA.ResumableSub {
public ResumableSub_Btn_Conf_Acceso_WS_Click(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.main parent;
boolean _rsconf = false;
String _old_global_ip_webservice = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _result = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
String _targetdir = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Wait For (Sb_Clave_ConfLocal) Complete (RsConf As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_conf_acceso_ws_click"), _sb_clave_conflocal());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_rsconf = (Boolean) result[0];
;
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="If Not(RsConf) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_rsconf)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Dim Old_Global_Ip_WebService As String = Variable";
_old_global_ip_webservice = parent.mostCurrent._variables._global_ip_webservice /*String*/ ;
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent.mostCurrent._xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="p.SetLayoutAnimated(0, 0, 20dip, 300dip, 80dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="p.LoadLayout(\"Conf_Local1\")";
_p.LoadLayout("Conf_Local1",mostCurrent.activityBA);
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Txt_Flp_WebService.Text = Variables.Global_Ip_Web";
parent.mostCurrent._txt_flp_webservice._settext /*String*/ (null,parent.mostCurrent._variables._global_ip_webservice /*String*/ );
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
parent.mostCurrent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_conf_acceso_ws_click"), parent.mostCurrent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 20;
return;
case 20:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 18;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Variables.Global_Ip_WebService = Txt_Flp_WebServ";
parent.mostCurrent._variables._global_ip_webservice /*String*/  = parent.mostCurrent._txt_flp_webservice._gettext /*String*/ (null).trim();
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIE";
parent.mostCurrent._consulta_sql = "Select Top 1 EMPRESA From CONFIES";
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="ProgressDialogShow(\"Probando conexión\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Probando conexión"));
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Ge";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_conf_acceso_ws_click"), (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 8;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="If Js.Success Then";
if (true) break;

case 8:
//if
this.state = 17;
if (_js._success /*boolean*/ ) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="Dim bmp1 As Bitmap = LoadBitmap(File.DirAssets";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="Msgbox2Async(\"Conexion existosa\" , \"Conexión W";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexion existosa"),BA.ObjectToCharSequence("Conexión WebService"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btn_conf_acceso_ws_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 14;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="Dim TargetDir As String = DBUtils.GetDBFolder";
_targetdir = parent.mostCurrent._dbutils._getdbfolder /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="File.Delete(TargetDir, \"ConexionWebService.txt";
anywheresoftware.b4a.keywords.Common.File.Delete(_targetdir,"ConexionWebService.txt");
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="File.WriteString(TargetDir,\"ConexionWebService";
anywheresoftware.b4a.keywords.Common.File.WriteString(_targetdir,"ConexionWebService.txt",parent.mostCurrent._variables._global_ip_webservice /*String*/ );
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="Msgbox2Async(\"No se pudo establecer la conexion";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se pudo establecer la conexion con el Web Service"),BA.ObjectToCharSequence("Conexión WebService"),"Ok","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589875;
 //BA.debugLineNum = 589875;BA.debugLine="Variables.Global_Ip_WebService = Old_Global_Ip_";
parent.mostCurrent._variables._global_ip_webservice /*String*/  = _old_global_ip_webservice;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=589882;
 //BA.debugLineNum = 589882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_clave_conflocal() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_clave_conflocal", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_clave_conflocal", null));}
ResumableSub_Sb_Clave_ConfLocal rsub = new ResumableSub_Sb_Clave_ConfLocal(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Clave_ConfLocal extends BA.ResumableSub {
public ResumableSub_Sb_Clave_ConfLocal(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.main parent;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
boolean _clave_aceptada = false;
String _msg = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;
int _rsclave = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Private dialog As B4XDialog";
parent.mostCurrent._dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim Clave_Aceptada As Boolean";
_clave_aceptada = false;
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Dim Msg As String";
_msg = "";
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="dialog.Initialize (Base)";
parent.mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"key.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"key.png");
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Msg = \"Para ingresar a la configuración debera in";
_msg = "Para ingresar a la configuración debera ingresar una clave de validación";
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="Msgbox2Async(Msg , \"Configuración local\", \"Ok\", \"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Configuración local"),"Ok","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sb_clave_conflocal"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result!=parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese Clave de C";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese Clave de Conf.Local"));
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sb_clave_conflocal"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rsclave = (Integer) result[0];
;
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="If RsClave = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 14;
if (_rsclave==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="If	InputTemplate.Text = \"971364\" Then";
if (true) break;

case 8:
//if
this.state = 13;
if ((_inputtemplate._text /*String*/ ).equals("971364")) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="Clave_Aceptada = True";
_clave_aceptada = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="Msg = \"Clave incorrecta\"";
_msg = "Clave incorrecta";
RDebugUtils.currentLine=786467;
 //BA.debugLineNum = 786467;BA.debugLine="Msgbox2Async(Msg , \"Configuración local\", \"Ok\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Configuración local"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786468;
 //BA.debugLineNum = 786468;BA.debugLine="Clave_Aceptada = False";
_clave_aceptada = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=786472;
 //BA.debugLineNum = 786472;BA.debugLine="Return Clave_Aceptada";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_clave_aceptada));return;};
RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lbl_id_dispositivo_longclick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_id_dispositivo_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_id_dispositivo_longclick", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub Lbl_Id_Dispositivo_LongClick";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="xui.MsgboxAsync(Lbl_Id_Dispositivo.Text, \"Bakapp";
mostCurrent._xui.MsgboxAsync(processBA,BA.ObjectToCharSequence(mostCurrent._lbl_id_dispositivo.getText()),BA.ObjectToCharSequence("Bakapp información"));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static void  _sb_login_ws_json(String _vclave) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_login_ws_json", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_login_ws_json", new Object[] {_vclave}); return;}
ResumableSub_Sb_Login_Ws_Json rsub = new ResumableSub_Sb_Login_Ws_Json(null,_vclave);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Login_Ws_Json extends BA.ResumableSub {
public ResumableSub_Sb_Login_Ws_Json(BaKapp.Movil.Tag.main parent,String _vclave) {
this.parent = parent;
this._vclave = _vclave;
}
BaKapp.Movil.Tag.main parent;
String _vclave;
String _vmensaje = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
String _vnokofu = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim vMensaje As String";
_vmensaje = "";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="vClave = Funciones.Fx_TraeClaveRD(vClave)";
_vclave = parent.mostCurrent._funciones._fx_traeclaverd /*String*/ (mostCurrent.activityBA,_vclave);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="If vClave.Trim = \"\" Then vClave = \"X\"";
if (true) break;

case 1:
//if
this.state = 6;
if ((_vclave.trim()).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_vclave = "X";
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where P";
parent.mostCurrent._consulta_sql = "Select Top 1 * From TABFU Where PWFU = '"+_vclave+"'";
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Log(vClave)";
anywheresoftware.b4a.keywords.Common.LogImpl("2458760",_vclave,0);
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sb_login_ws_json"), (Object)(_js));
this.state = 39;
return;
case 39:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 38;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 37;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 35;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/  = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="Dim vNOKOFU As String = Variables.Global_Row_Us";
_vnokofu = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="vMensaje = \"Bienvenido: \" & vNOKOFU";
_vmensaje = "Bienvenido: "+_vnokofu;
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo";
parent.mostCurrent._consulta_sql = "Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'";
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sb_login_ws_json"), (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 13;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="If Js.Success Then";
if (true) break;

case 13:
//if
this.state = 32;
if (_js._success /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 16:
//if
this.state = 31;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.Get";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Ba";
parent.mostCurrent._variables._global_basebk /*String*/  = BA.ObjectToString(_fila.Get((Object)("Global_BaseBk")));
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="Variables.Global_Sesion_Star = True";
parent.mostCurrent._variables._global_sesion_star /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="Consulta_Sql = \"Select Top 1 * From CONFIEST\"";
parent.mostCurrent._consulta_sql = "Select Top 1 * From CONFIEST"+anywheresoftware.b4a.keywords.Common.CRLF+"Inner Join "+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_Configuracion On Empresa = EMPRESA And Modalidad = MODALIDAD"+anywheresoftware.b4a.keywords.Common.CRLF+"Where EMPRESA = '01'";
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
RDebugUtils.currentLine=458797;
 //BA.debugLineNum = 458797;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sb_login_ws_json"), (Object)(_js));
this.state = 41;
return;
case 41:
//C
this.state = 19;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="If Js.Success Then";
if (true) break;

case 19:
//if
this.state = 30;
if (_js._success /*boolean*/ ) { 
this.state = 21;
}else {
this.state = 29;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=458801;
 //BA.debugLineNum = 458801;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=458803;
 //BA.debugLineNum = 458803;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 22:
//if
this.state = 27;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=458805;
 //BA.debugLineNum = 458805;BA.debugLine="Variables.Global_Row_Configuracion_General";
parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=458807;
 //BA.debugLineNum = 458807;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row";
parent.mostCurrent._variables._gl_empresa /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
RDebugUtils.currentLine=458808;
 //BA.debugLineNum = 458808;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Ro";
parent.mostCurrent._variables._gl_sucursal /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
RDebugUtils.currentLine=458809;
 //BA.debugLineNum = 458809;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_";
parent.mostCurrent._variables._gl_bodega /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
RDebugUtils.currentLine=458810;
 //BA.debugLineNum = 458810;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Co";
parent.mostCurrent._variables._gl_caja /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ECAJA")));
RDebugUtils.currentLine=458811;
 //BA.debugLineNum = 458811;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid";
parent.mostCurrent._variables._gl_lista_precios /*String*/  = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTAVEN"))),(int) (6),(int) (3));
RDebugUtils.currentLine=458812;
 //BA.debugLineNum = 458812;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(V";
parent.mostCurrent._variables._gl_lista_costos /*String*/  = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTACOM"))),(int) (6),(int) (3));
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=458815;
 //BA.debugLineNum = 458815;BA.debugLine="Variables.Global_Row_Configuracion_General";
parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=458819;
 //BA.debugLineNum = 458819;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("2458819",_js._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=458823;
 //BA.debugLineNum = 458823;BA.debugLine="StartActivity(Frm_Menu_Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_principal.getObject()));
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=458830;
 //BA.debugLineNum = 458830;BA.debugLine="vMensaje = \"ACCESO DENEGADO\"";
_vmensaje = "ACCESO DENEGADO";
RDebugUtils.currentLine=458831;
 //BA.debugLineNum = 458831;BA.debugLine="Txt_Clave.Text = \"\"";
parent.mostCurrent._txt_clave.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 35:
//C
this.state = 38;
;
RDebugUtils.currentLine=458834;
 //BA.debugLineNum = 458834;BA.debugLine="Log(Variables.Global_BaseBk)";
anywheresoftware.b4a.keywords.Common.LogImpl("2458834",parent.mostCurrent._variables._global_basebk /*String*/ ,0);
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=458839;
 //BA.debugLineNum = 458839;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("2458839",_js._errormessage /*String*/ ,0);
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=458842;
 //BA.debugLineNum = 458842;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _txt_clave_enterpressed() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txt_clave_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txt_clave_enterpressed", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Txt_Clave_EnterPressed";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Sb_Login_Ws_Json(Txt_Clave.Text)";
_sb_login_ws_json(mostCurrent._txt_clave.getText());
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
}