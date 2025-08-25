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

public class frm_menu_post_venta extends Activity implements B4AActivity{
	public static frm_menu_post_venta mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_menu_post_venta");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_menu_post_venta).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_menu_post_venta");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_menu_post_venta", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_menu_post_venta) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_menu_post_venta) Resume **");
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
		return frm_menu_post_venta.class;
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
            BA.LogInfo("** Activity (frm_menu_post_venta) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_menu_post_venta) Pause event (activity is not paused). **");
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
            frm_menu_post_venta mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_menu_post_venta) Resume **");
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
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_venta = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscar_documentos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_ver_documentos = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
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
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="Activity.LoadLayout(\"Cp_Menu_Post_Venta\")";
mostCurrent._activity.LoadLayout("Cp_Menu_Post_Venta",mostCurrent.activityBA);
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(BaKapp.Movil.Tag.frm_menu_post_venta parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
int _idmaeedo = 0;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="If Frm_Documentos_Generados.Doc_Seleccionado Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._frm_documentos_generados._doc_seleccionado /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="Dim Idmaeedo As Int = Frm_Documentos_Generados.I";
_idmaeedo = parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*int*/ ;
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="Wait For(Sb_Ir_Al_Documento2(Idmaeedo)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "activity_resume"), _sb_ir_al_documento2(_idmaeedo));
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="Frm_Documentos_Generados.Doc_Seleccionado = Fals";
parent.mostCurrent._frm_documentos_generados._doc_seleccionado /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="Frm_Documentos_Generados.Idmaeedo_Sel = 0";
parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*int*/  = (int) (0);
RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="If Result Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_buscar_documento.getObject()));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=18350101;
 //BA.debugLineNum = 18350101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ir_al_documento2(int _idmaeedo) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_ir_al_documento2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_ir_al_documento2", new Object[] {_idmaeedo}));}
ResumableSub_Sb_Ir_Al_Documento2 rsub = new ResumableSub_Sb_Ir_Al_Documento2(null,_idmaeedo);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Ir_Al_Documento2 extends BA.ResumableSub {
public ResumableSub_Sb_Ir_Al_Documento2(BaKapp.Movil.Tag.frm_menu_post_venta parent,int _idmaeedo) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
int _idmaeedo;
anywheresoftware.b4a.objects.collections.Map _documento = null;
boolean _enviado = false;
String _error = "";
String _tido = "";
String _nudo = "";
String _endo = "";
String _suendo = "";
String _obseravacion = "";
String _nroocc = "";
String _kofuen = "";
String _para = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Wait For( Sb_BuscarDoc2(Idmaeedo)) Complete (Docu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ir_al_documento2"), _sb_buscardoc2(_idmaeedo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="If Documento = Null Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_documento== null) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
_enviado = BA.ObjectToBoolean(_documento.Get((Object)("Enviado")));
RDebugUtils.currentLine=18677769;
 //BA.debugLineNum = 18677769;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
_error = BA.ObjectToString(_documento.Get((Object)("Error")));
RDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="If Enviado = False Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_enviado==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18677773;
 //BA.debugLineNum = 18677773;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18677774;
 //BA.debugLineNum = 18677774;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=18677779;
 //BA.debugLineNum = 18677779;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_documento.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=18677780;
 //BA.debugLineNum = 18677780;BA.debugLine="Dim Tido As String = Documento.Get(\"TIDO\")";
_tido = BA.ObjectToString(_documento.Get((Object)("TIDO")));
RDebugUtils.currentLine=18677781;
 //BA.debugLineNum = 18677781;BA.debugLine="Dim Nudo As String = Documento.Get(\"NUDO\")";
_nudo = BA.ObjectToString(_documento.Get((Object)("NUDO")));
RDebugUtils.currentLine=18677782;
 //BA.debugLineNum = 18677782;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
_endo = BA.ObjectToString(_documento.Get((Object)("ENDO")));
RDebugUtils.currentLine=18677783;
 //BA.debugLineNum = 18677783;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
_suendo = BA.ObjectToString(_documento.Get((Object)("SUENDO")));
RDebugUtils.currentLine=18677784;
 //BA.debugLineNum = 18677784;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
_obseravacion = BA.ObjectToString(_documento.Get((Object)("OBDO")));
RDebugUtils.currentLine=18677785;
 //BA.debugLineNum = 18677785;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
_nroocc = BA.ObjectToString(_documento.Get((Object)("OCDO")));
RDebugUtils.currentLine=18677786;
 //BA.debugLineNum = 18677786;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
_kofuen = BA.ObjectToString(_documento.Get((Object)("KOFUDO")));
RDebugUtils.currentLine=18677787;
 //BA.debugLineNum = 18677787;BA.debugLine="Dim Para As String =Documento.Get(\"EMAILCOMER\")";
_para = BA.ObjectToString(_documento.Get((Object)("EMAILCOMER")));
RDebugUtils.currentLine=18677789;
 //BA.debugLineNum = 18677789;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
if (true) break;

case 9:
//if
this.state = 12;
if ((_kofuen).equals(BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))) == false) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18677790;
 //BA.debugLineNum = 18677790;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18677791;
 //BA.debugLineNum = 18677791;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este documento es de otro usuario"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18677792;
 //BA.debugLineNum = 18677792;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18677795;
 //BA.debugLineNum = 18677795;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_buscar_documento._idmaeedo /*int*/  = _idmaeedo;
RDebugUtils.currentLine=18677796;
 //BA.debugLineNum = 18677796;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
parent.mostCurrent._frm_buscar_documento._koen /*String*/  = _endo;
RDebugUtils.currentLine=18677797;
 //BA.debugLineNum = 18677797;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
parent.mostCurrent._frm_buscar_documento._suen /*String*/  = _suendo;
RDebugUtils.currentLine=18677798;
 //BA.debugLineNum = 18677798;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
parent.mostCurrent._frm_buscar_documento._observaciones /*String*/  = _obseravacion;
RDebugUtils.currentLine=18677799;
 //BA.debugLineNum = 18677799;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
parent.mostCurrent._frm_buscar_documento._occ /*String*/  = _nroocc;
RDebugUtils.currentLine=18677800;
 //BA.debugLineNum = 18677800;BA.debugLine="Frm_Buscar_Documento.Para = Para";
parent.mostCurrent._frm_buscar_documento._para /*String*/  = _para;
RDebugUtils.currentLine=18677801;
 //BA.debugLineNum = 18677801;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
parent.mostCurrent._frm_buscar_documento._tido /*String*/  = _tido;
RDebugUtils.currentLine=18677802;
 //BA.debugLineNum = 18677802;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
parent.mostCurrent._frm_buscar_documento._nudo /*String*/  = _nudo;
RDebugUtils.currentLine=18677804;
 //BA.debugLineNum = 18677804;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=18677806;
 //BA.debugLineNum = 18677806;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_buscar_documentos_click() throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_buscar_documentos_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_buscar_documentos_click", null); return;}
ResumableSub_Btn_Buscar_Documentos_Click rsub = new ResumableSub_Btn_Buscar_Documentos_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Buscar_Documentos_Click extends BA.ResumableSub {
public ResumableSub_Btn_Buscar_Documentos_Click(BaKapp.Movil.Tag.frm_menu_post_venta parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
int _result = 0;
String _tido = "";
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
int _numero = 0;
boolean _resultado = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
parent.mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-deliv";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
RDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="Msgbox2Async(\"SELECCIONE EL TIPO DE DOCUMENTO\",\"B";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("SELECCIONE EL TIPO DE DOCUMENTO"),BA.ObjectToCharSequence("Buscar documento"),"NOTA DE VENTA","","COTIZACION",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18546697;
 //BA.debugLineNum = 18546697;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=18546699;
 //BA.debugLineNum = 18546699;BA.debugLine="Dim Tido As String";
_tido = "";
RDebugUtils.currentLine=18546701;
 //BA.debugLineNum = 18546701;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18546702;
 //BA.debugLineNum = 18546702;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;
;
RDebugUtils.currentLine=18546705;
 //BA.debugLineNum = 18546705;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=18546706;
 //BA.debugLineNum = 18546706;BA.debugLine="Tido = \"COV\"";
_tido = "COV";
 if (true) break;
;
RDebugUtils.currentLine=18546709;
 //BA.debugLineNum = 18546709;BA.debugLine="If Tido = \"\" Then";

case 7:
//if
this.state = 10;
if ((_tido).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=18546710;
 //BA.debugLineNum = 18546710;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=18546713;
 //BA.debugLineNum = 18546713;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=18546715;
 //BA.debugLineNum = 18546715;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=18546716;
 //BA.debugLineNum = 18546716;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=18546717;
 //BA.debugLineNum = 18546717;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=18546718;
 //BA.debugLineNum = 18546718;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18546720;
 //BA.debugLineNum = 18546720;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=18546722;
 //BA.debugLineNum = 18546722;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=18546724;
 //BA.debugLineNum = 18546724;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=18546725;
 //BA.debugLineNum = 18546725;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=18546726;
 //BA.debugLineNum = 18546726;BA.debugLine="Dialog.Title = \"Orden de compra\"";
_dialog._title /*Object*/  = (Object)("Orden de compra");
RDebugUtils.currentLine=18546728;
 //BA.debugLineNum = 18546728;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de document";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Número de documento a buscar"));
RDebugUtils.currentLine=18546729;
 //BA.debugLineNum = 18546729;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=18546731;
 //BA.debugLineNum = 18546731;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_numero = (Integer) result[0];
;
RDebugUtils.currentLine=18546732;
 //BA.debugLineNum = 18546732;BA.debugLine="If Numero <> xui.DialogResponse_Positive Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_numero!=_xui.DialogResponse_Positive) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=18546733;
 //BA.debugLineNum = 18546733;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=18546736;
 //BA.debugLineNum = 18546736;BA.debugLine="If InputTemplate.Text = \"\" Then";

case 14:
//if
this.state = 17;
if ((_inputtemplate._text /*String*/ ).equals("")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=18546737;
 //BA.debugLineNum = 18546737;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18546738;
 //BA.debugLineNum = 18546738;BA.debugLine="Msgbox2Async(\"El número del documento no puede e";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El número del documento no puede estar vacío"),BA.ObjectToCharSequence("Validación"),"Okr","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18546739;
 //BA.debugLineNum = 18546739;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=18546742;
 //BA.debugLineNum = 18546742;BA.debugLine="Wait For(Sb_Ir_Al_Documento(Tido,InputTemplate.Te";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), _sb_ir_al_documento(_tido,_inputtemplate._text /*String*/ ));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=18546744;
 //BA.debugLineNum = 18546744;BA.debugLine="If Resultado Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_resultado) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=18546745;
 //BA.debugLineNum = 18546745;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_buscar_documento.getObject()));
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=18546749;
 //BA.debugLineNum = 18546749;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ir_al_documento(String _tido,String _nudo) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_ir_al_documento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_ir_al_documento", new Object[] {_tido,_nudo}));}
ResumableSub_Sb_Ir_Al_Documento rsub = new ResumableSub_Sb_Ir_Al_Documento(null,_tido,_nudo);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Ir_Al_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Ir_Al_Documento(BaKapp.Movil.Tag.frm_menu_post_venta parent,String _tido,String _nudo) {
this.parent = parent;
this._tido = _tido;
this._nudo = _nudo;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
String _tido;
String _nudo;
anywheresoftware.b4a.objects.collections.Map _documento = null;
boolean _enviado = false;
String _error = "";
int _idmaeedo = 0;
String _endo = "";
String _suendo = "";
String _obseravacion = "";
String _nroocc = "";
String _kofuen = "";
String _para = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Wait For( Sb_BuscarDoc(Tido,Nudo)) Complete (Docu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ir_al_documento"), _sb_buscardoc(_tido,_nudo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="If Documento = Null Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_documento== null) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
_enviado = BA.ObjectToBoolean(_documento.Get((Object)("Enviado")));
RDebugUtils.currentLine=18612233;
 //BA.debugLineNum = 18612233;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
_error = BA.ObjectToString(_documento.Get((Object)("Error")));
RDebugUtils.currentLine=18612235;
 //BA.debugLineNum = 18612235;BA.debugLine="If Enviado = False Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_enviado==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=18612236;
 //BA.debugLineNum = 18612236;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18612237;
 //BA.debugLineNum = 18612237;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18612238;
 //BA.debugLineNum = 18612238;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=18612243;
 //BA.debugLineNum = 18612243;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_documento.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=18612244;
 //BA.debugLineNum = 18612244;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
_endo = BA.ObjectToString(_documento.Get((Object)("ENDO")));
RDebugUtils.currentLine=18612245;
 //BA.debugLineNum = 18612245;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
_suendo = BA.ObjectToString(_documento.Get((Object)("SUENDO")));
RDebugUtils.currentLine=18612246;
 //BA.debugLineNum = 18612246;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
_obseravacion = BA.ObjectToString(_documento.Get((Object)("OBDO")));
RDebugUtils.currentLine=18612247;
 //BA.debugLineNum = 18612247;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
_nroocc = BA.ObjectToString(_documento.Get((Object)("OCDO")));
RDebugUtils.currentLine=18612248;
 //BA.debugLineNum = 18612248;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
_kofuen = BA.ObjectToString(_documento.Get((Object)("KOFUDO")));
RDebugUtils.currentLine=18612249;
 //BA.debugLineNum = 18612249;BA.debugLine="Dim Para As String = Documento.Get(\"EMAILCOMER\")";
_para = BA.ObjectToString(_documento.Get((Object)("EMAILCOMER")));
RDebugUtils.currentLine=18612251;
 //BA.debugLineNum = 18612251;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
if (true) break;

case 9:
//if
this.state = 12;
if ((_kofuen).equals(BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))) == false) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18612252;
 //BA.debugLineNum = 18612252;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18612253;
 //BA.debugLineNum = 18612253;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este documento es de otro usuario"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18612254;
 //BA.debugLineNum = 18612254;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18612257;
 //BA.debugLineNum = 18612257;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_buscar_documento._idmaeedo /*int*/  = _idmaeedo;
RDebugUtils.currentLine=18612258;
 //BA.debugLineNum = 18612258;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
parent.mostCurrent._frm_buscar_documento._koen /*String*/  = _endo;
RDebugUtils.currentLine=18612259;
 //BA.debugLineNum = 18612259;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
parent.mostCurrent._frm_buscar_documento._suen /*String*/  = _suendo;
RDebugUtils.currentLine=18612260;
 //BA.debugLineNum = 18612260;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
parent.mostCurrent._frm_buscar_documento._observaciones /*String*/  = _obseravacion;
RDebugUtils.currentLine=18612261;
 //BA.debugLineNum = 18612261;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
parent.mostCurrent._frm_buscar_documento._occ /*String*/  = _nroocc;
RDebugUtils.currentLine=18612262;
 //BA.debugLineNum = 18612262;BA.debugLine="Frm_Buscar_Documento.Para = Para";
parent.mostCurrent._frm_buscar_documento._para /*String*/  = _para;
RDebugUtils.currentLine=18612263;
 //BA.debugLineNum = 18612263;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
parent.mostCurrent._frm_buscar_documento._tido /*String*/  = _tido;
RDebugUtils.currentLine=18612264;
 //BA.debugLineNum = 18612264;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
parent.mostCurrent._frm_buscar_documento._nudo /*String*/  = _nudo;
RDebugUtils.currentLine=18612266;
 //BA.debugLineNum = 18612266;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=18612268;
 //BA.debugLineNum = 18612268;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_venta_click() throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_venta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_venta_click", null));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub Btn_Venta_Click";
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = 0";
mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = (int) (0);
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="Frm_Post_01_Formulario.Nuevo_Documento = True";
mostCurrent._frm_post_01_formulario._nuevo_documento /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18481161;
 //BA.debugLineNum = 18481161;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_formulario.getObject()));
RDebugUtils.currentLine=18481163;
 //BA.debugLineNum = 18481163;BA.debugLine="End Sub";
return "";
}
public static String  _btn_ver_documentos_click() throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ver_documentos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_ver_documentos_click", null));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub Btn_Ver_Documentos_Click";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="StartActivity(Frm_Documentos_Generados)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_documentos_generados.getObject()));
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_buscardoc(String _tido,String _nudo) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_buscardoc", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_buscardoc", new Object[] {_tido,_nudo}));}
ResumableSub_Sb_BuscarDoc rsub = new ResumableSub_Sb_BuscarDoc(null,_tido,_nudo);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_BuscarDoc extends BA.ResumableSub {
public ResumableSub_Sb_BuscarDoc(BaKapp.Movil.Tag.frm_menu_post_venta parent,String _tido,String _nudo) {
this.parent = parent;
this._tido = _tido;
this._nudo = _nudo;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
String _tido;
String _nudo;
anywheresoftware.b4a.objects.collections.Map _row_documento = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Dim Row_Documento As Map";
_row_documento = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_documento /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_tido,_nudo);
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_buscardoc"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=18743309;
 //BA.debugLineNum = 18743309;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=18743310;
 //BA.debugLineNum = 18743310;BA.debugLine="Row_Documento =Filas.Get(0)";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=18743313;
 //BA.debugLineNum = 18743313;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18743317;
 //BA.debugLineNum = 18743317;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18743318;
 //BA.debugLineNum = 18743318;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("218743318",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18743321;
 //BA.debugLineNum = 18743321;BA.debugLine="Return Row_Documento";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_documento));return;};
RDebugUtils.currentLine=18743323;
 //BA.debugLineNum = 18743323;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_buscardoc2(int _idmaeedo) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_buscardoc2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_buscardoc2", new Object[] {_idmaeedo}));}
ResumableSub_Sb_BuscarDoc2 rsub = new ResumableSub_Sb_BuscarDoc2(null,_idmaeedo);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_BuscarDoc2 extends BA.ResumableSub {
public ResumableSub_Sb_BuscarDoc2(BaKapp.Movil.Tag.frm_menu_post_venta parent,int _idmaeedo) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
int _idmaeedo;
anywheresoftware.b4a.objects.collections.Map _row_documento = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Dim Row_Documento As Map";
_row_documento = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_documento2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_idmaeedo);
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_buscardoc2"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="Row_Documento =Filas.Get(0)";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18808854;
 //BA.debugLineNum = 18808854;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("218808854",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18808857;
 //BA.debugLineNum = 18808857;BA.debugLine="Return Row_Documento";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_documento));return;};
RDebugUtils.currentLine=18808859;
 //BA.debugLineNum = 18808859;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_fx_traerdatosentidad(String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_fx_traerdatosentidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_fx_traerdatosentidad", new Object[] {_koen,_suen}));}
ResumableSub_Sb_Fx_TraerDatosEntidad rsub = new ResumableSub_Sb_Fx_TraerDatosEntidad(null,_koen,_suen);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Fx_TraerDatosEntidad extends BA.ResumableSub {
public ResumableSub_Sb_Fx_TraerDatosEntidad(BaKapp.Movil.Tag.frm_menu_post_venta parent,String _koen,String _suen) {
this.parent = parent;
this._koen = _koen;
this._suen = _suen;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
String _koen;
String _suen;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
anywheresoftware.b4a.objects.collections.Map _row_entidad = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="Dim Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_koen,_suen);
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_fx_traerdatosentidad"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=18874384;
 //BA.debugLineNum = 18874384;BA.debugLine="Row_Entidad =Filas.Get(0)";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=18874387;
 //BA.debugLineNum = 18874387;BA.debugLine="Row_Entidad = Null";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18874391;
 //BA.debugLineNum = 18874391;BA.debugLine="Row_Entidad = Null";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18874392;
 //BA.debugLineNum = 18874392;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("218874392",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18874395;
 //BA.debugLineNum = 18874395;BA.debugLine="Return Row_Entidad";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_entidad));return;};
RDebugUtils.currentLine=18874397;
 //BA.debugLineNum = 18874397;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_ver_documento(int _idmaeedo,String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_ver_documento", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_ver_documento", new Object[] {_idmaeedo,_koen,_suen}); return;}
ResumableSub_Sb_Ver_Documento rsub = new ResumableSub_Sb_Ver_Documento(null,_idmaeedo,_koen,_suen);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Ver_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Ver_Documento(BaKapp.Movil.Tag.frm_menu_post_venta parent,int _idmaeedo,String _koen,String _suen) {
this.parent = parent;
this._idmaeedo = _idmaeedo;
this._koen = _koen;
this._suen = _suen;
}
BaKapp.Movil.Tag.frm_menu_post_venta parent;
int _idmaeedo;
String _koen;
String _suen;
BaKapp.Movil.Tag.crear_documento _newdoc = null;
anywheresoftware.b4a.objects.collections.Map _rowentidad = null;
int _id_docenc = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Dim NewDoc As Crear_Documento";
_newdoc = new BaKapp.Movil.Tag.crear_documento();
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="NewDoc.Initialize";
_newdoc._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
_newdoc._idmaeedo /*int*/  = _idmaeedo;
RDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ver_documento"), _newdoc._sb_traer_entidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_koen,_suen));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rowentidad = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="If RowEntidad = Null Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_rowentidad== null) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=19005448;
 //BA.debugLineNum = 19005448;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=19005451;
 //BA.debugLineNum = 19005451;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
_newdoc._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = _rowentidad;
RDebugUtils.currentLine=19005453;
 //BA.debugLineNum = 19005453;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ver_documento"), _newdoc._sb_nuevo_documento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 10;
return;
case 10:
//C
this.state = 5;
_id_docenc = (Integer) result[0];
;
RDebugUtils.currentLine=19005455;
 //BA.debugLineNum = 19005455;BA.debugLine="If Id_DocEnc <> 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_id_docenc!=0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=19005457;
 //BA.debugLineNum = 19005457;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=19005458;
 //BA.debugLineNum = 19005458;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ahora puede editar el documento"),BA.ObjectToCharSequence("Editar Documento"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19005460;
 //BA.debugLineNum = 19005460;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = _id_docenc;
RDebugUtils.currentLine=19005461;
 //BA.debugLineNum = 19005461;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_formulario.getObject()));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=19005465;
 //BA.debugLineNum = 19005465;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}