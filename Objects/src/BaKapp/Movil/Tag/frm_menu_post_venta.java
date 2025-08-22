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
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Activity.LoadLayout(\"Cp_Menu_Post_Venta\")";
mostCurrent._activity.LoadLayout("Cp_Menu_Post_Venta",mostCurrent.activityBA);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="If Frm_Documentos_Generados.Doc_Seleccionado Then";
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
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim Idmaeedo As Int = Frm_Documentos_Generados.I";
_idmaeedo = parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*int*/ ;
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Wait For(Sb_Ir_Al_Documento2(Idmaeedo)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "activity_resume"), _sb_ir_al_documento2(_idmaeedo));
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Frm_Documentos_Generados.Doc_Seleccionado = Fals";
parent.mostCurrent._frm_documentos_generados._doc_seleccionado /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="Frm_Documentos_Generados.Idmaeedo_Sel = 0";
parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*int*/  = (int) (0);
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
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
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Wait For( Sb_BuscarDoc2(Idmaeedo)) Complete (Docu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ir_al_documento2"), _sb_buscardoc2(_idmaeedo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="If Documento = Null Then";
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
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
_enviado = BA.ObjectToBoolean(_documento.Get((Object)("Enviado")));
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
_error = BA.ObjectToString(_documento.Get((Object)("Error")));
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="If Enviado = False Then";
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
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=15466509;
 //BA.debugLineNum = 15466509;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15466510;
 //BA.debugLineNum = 15466510;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=15466515;
 //BA.debugLineNum = 15466515;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_documento.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=15466516;
 //BA.debugLineNum = 15466516;BA.debugLine="Dim Tido As String = Documento.Get(\"TIDO\")";
_tido = BA.ObjectToString(_documento.Get((Object)("TIDO")));
RDebugUtils.currentLine=15466517;
 //BA.debugLineNum = 15466517;BA.debugLine="Dim Nudo As String = Documento.Get(\"NUDO\")";
_nudo = BA.ObjectToString(_documento.Get((Object)("NUDO")));
RDebugUtils.currentLine=15466518;
 //BA.debugLineNum = 15466518;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
_endo = BA.ObjectToString(_documento.Get((Object)("ENDO")));
RDebugUtils.currentLine=15466519;
 //BA.debugLineNum = 15466519;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
_suendo = BA.ObjectToString(_documento.Get((Object)("SUENDO")));
RDebugUtils.currentLine=15466520;
 //BA.debugLineNum = 15466520;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
_obseravacion = BA.ObjectToString(_documento.Get((Object)("OBDO")));
RDebugUtils.currentLine=15466521;
 //BA.debugLineNum = 15466521;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
_nroocc = BA.ObjectToString(_documento.Get((Object)("OCDO")));
RDebugUtils.currentLine=15466522;
 //BA.debugLineNum = 15466522;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
_kofuen = BA.ObjectToString(_documento.Get((Object)("KOFUDO")));
RDebugUtils.currentLine=15466523;
 //BA.debugLineNum = 15466523;BA.debugLine="Dim Para As String =Documento.Get(\"EMAILCOMER\")";
_para = BA.ObjectToString(_documento.Get((Object)("EMAILCOMER")));
RDebugUtils.currentLine=15466525;
 //BA.debugLineNum = 15466525;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
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
RDebugUtils.currentLine=15466526;
 //BA.debugLineNum = 15466526;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=15466527;
 //BA.debugLineNum = 15466527;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este documento es de otro usuario"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15466528;
 //BA.debugLineNum = 15466528;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=15466531;
 //BA.debugLineNum = 15466531;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_buscar_documento._idmaeedo /*int*/  = _idmaeedo;
RDebugUtils.currentLine=15466532;
 //BA.debugLineNum = 15466532;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
parent.mostCurrent._frm_buscar_documento._koen /*String*/  = _endo;
RDebugUtils.currentLine=15466533;
 //BA.debugLineNum = 15466533;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
parent.mostCurrent._frm_buscar_documento._suen /*String*/  = _suendo;
RDebugUtils.currentLine=15466534;
 //BA.debugLineNum = 15466534;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
parent.mostCurrent._frm_buscar_documento._observaciones /*String*/  = _obseravacion;
RDebugUtils.currentLine=15466535;
 //BA.debugLineNum = 15466535;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
parent.mostCurrent._frm_buscar_documento._occ /*String*/  = _nroocc;
RDebugUtils.currentLine=15466536;
 //BA.debugLineNum = 15466536;BA.debugLine="Frm_Buscar_Documento.Para = Para";
parent.mostCurrent._frm_buscar_documento._para /*String*/  = _para;
RDebugUtils.currentLine=15466537;
 //BA.debugLineNum = 15466537;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
parent.mostCurrent._frm_buscar_documento._tido /*String*/  = _tido;
RDebugUtils.currentLine=15466538;
 //BA.debugLineNum = 15466538;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
parent.mostCurrent._frm_buscar_documento._nudo /*String*/  = _nudo;
RDebugUtils.currentLine=15466540;
 //BA.debugLineNum = 15466540;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=15466542;
 //BA.debugLineNum = 15466542;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
parent.mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-deliv";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="Msgbox2Async(\"SELECCIONE EL TIPO DE DOCUMENTO\",\"B";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("SELECCIONE EL TIPO DE DOCUMENTO"),BA.ObjectToCharSequence("Buscar documento"),"NOTA DE VENTA","","COTIZACION",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="Dim Tido As String";
_tido = "";
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=15335438;
 //BA.debugLineNum = 15335438;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;
;
RDebugUtils.currentLine=15335441;
 //BA.debugLineNum = 15335441;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=15335442;
 //BA.debugLineNum = 15335442;BA.debugLine="Tido = \"COV\"";
_tido = "COV";
 if (true) break;
;
RDebugUtils.currentLine=15335445;
 //BA.debugLineNum = 15335445;BA.debugLine="If Tido = \"\" Then";

case 7:
//if
this.state = 10;
if ((_tido).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=15335446;
 //BA.debugLineNum = 15335446;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=15335449;
 //BA.debugLineNum = 15335449;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=15335451;
 //BA.debugLineNum = 15335451;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=15335452;
 //BA.debugLineNum = 15335452;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15335453;
 //BA.debugLineNum = 15335453;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=15335454;
 //BA.debugLineNum = 15335454;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15335456;
 //BA.debugLineNum = 15335456;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=15335458;
 //BA.debugLineNum = 15335458;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=15335460;
 //BA.debugLineNum = 15335460;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=15335461;
 //BA.debugLineNum = 15335461;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=15335462;
 //BA.debugLineNum = 15335462;BA.debugLine="Dialog.Title = \"Orden de compra\"";
_dialog._title /*Object*/  = (Object)("Orden de compra");
RDebugUtils.currentLine=15335464;
 //BA.debugLineNum = 15335464;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de document";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Número de documento a buscar"));
RDebugUtils.currentLine=15335465;
 //BA.debugLineNum = 15335465;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=15335467;
 //BA.debugLineNum = 15335467;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_numero = (Integer) result[0];
;
RDebugUtils.currentLine=15335468;
 //BA.debugLineNum = 15335468;BA.debugLine="If Numero <> xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=15335469;
 //BA.debugLineNum = 15335469;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=15335472;
 //BA.debugLineNum = 15335472;BA.debugLine="If InputTemplate.Text = \"\" Then";

case 14:
//if
this.state = 17;
if ((_inputtemplate._text /*String*/ ).equals("")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=15335473;
 //BA.debugLineNum = 15335473;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=15335474;
 //BA.debugLineNum = 15335474;BA.debugLine="Msgbox2Async(\"El número del documento no puede e";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El número del documento no puede estar vacío"),BA.ObjectToCharSequence("Validación"),"Okr","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15335475;
 //BA.debugLineNum = 15335475;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=15335478;
 //BA.debugLineNum = 15335478;BA.debugLine="Wait For(Sb_Ir_Al_Documento(Tido,InputTemplate.Te";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "btn_buscar_documentos_click"), _sb_ir_al_documento(_tido,_inputtemplate._text /*String*/ ));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=15335480;
 //BA.debugLineNum = 15335480;BA.debugLine="If Resultado Then";
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
RDebugUtils.currentLine=15335481;
 //BA.debugLineNum = 15335481;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_buscar_documento.getObject()));
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=15335485;
 //BA.debugLineNum = 15335485;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Wait For( Sb_BuscarDoc(Tido,Nudo)) Complete (Docu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ir_al_documento"), _sb_buscardoc(_tido,_nudo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="If Documento = Null Then";
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
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
_enviado = BA.ObjectToBoolean(_documento.Get((Object)("Enviado")));
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
_error = BA.ObjectToString(_documento.Get((Object)("Error")));
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="If Enviado = False Then";
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
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=15400979;
 //BA.debugLineNum = 15400979;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_documento.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=15400980;
 //BA.debugLineNum = 15400980;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
_endo = BA.ObjectToString(_documento.Get((Object)("ENDO")));
RDebugUtils.currentLine=15400981;
 //BA.debugLineNum = 15400981;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
_suendo = BA.ObjectToString(_documento.Get((Object)("SUENDO")));
RDebugUtils.currentLine=15400982;
 //BA.debugLineNum = 15400982;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
_obseravacion = BA.ObjectToString(_documento.Get((Object)("OBDO")));
RDebugUtils.currentLine=15400983;
 //BA.debugLineNum = 15400983;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
_nroocc = BA.ObjectToString(_documento.Get((Object)("OCDO")));
RDebugUtils.currentLine=15400984;
 //BA.debugLineNum = 15400984;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
_kofuen = BA.ObjectToString(_documento.Get((Object)("KOFUDO")));
RDebugUtils.currentLine=15400985;
 //BA.debugLineNum = 15400985;BA.debugLine="Dim Para As String = Documento.Get(\"EMAILCOMER\")";
_para = BA.ObjectToString(_documento.Get((Object)("EMAILCOMER")));
RDebugUtils.currentLine=15400987;
 //BA.debugLineNum = 15400987;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
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
RDebugUtils.currentLine=15400988;
 //BA.debugLineNum = 15400988;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=15400989;
 //BA.debugLineNum = 15400989;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este documento es de otro usuario"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15400990;
 //BA.debugLineNum = 15400990;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=15400993;
 //BA.debugLineNum = 15400993;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_buscar_documento._idmaeedo /*int*/  = _idmaeedo;
RDebugUtils.currentLine=15400994;
 //BA.debugLineNum = 15400994;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
parent.mostCurrent._frm_buscar_documento._koen /*String*/  = _endo;
RDebugUtils.currentLine=15400995;
 //BA.debugLineNum = 15400995;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
parent.mostCurrent._frm_buscar_documento._suen /*String*/  = _suendo;
RDebugUtils.currentLine=15400996;
 //BA.debugLineNum = 15400996;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
parent.mostCurrent._frm_buscar_documento._observaciones /*String*/  = _obseravacion;
RDebugUtils.currentLine=15400997;
 //BA.debugLineNum = 15400997;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
parent.mostCurrent._frm_buscar_documento._occ /*String*/  = _nroocc;
RDebugUtils.currentLine=15400998;
 //BA.debugLineNum = 15400998;BA.debugLine="Frm_Buscar_Documento.Para = Para";
parent.mostCurrent._frm_buscar_documento._para /*String*/  = _para;
RDebugUtils.currentLine=15400999;
 //BA.debugLineNum = 15400999;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
parent.mostCurrent._frm_buscar_documento._tido /*String*/  = _tido;
RDebugUtils.currentLine=15401000;
 //BA.debugLineNum = 15401000;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
parent.mostCurrent._frm_buscar_documento._nudo /*String*/  = _nudo;
RDebugUtils.currentLine=15401002;
 //BA.debugLineNum = 15401002;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=15401004;
 //BA.debugLineNum = 15401004;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_venta_click() throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_venta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_venta_click", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub Btn_Venta_Click";
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = 0";
mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = (int) (0);
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="Frm_Post_01_Formulario.Nuevo_Documento = True";
mostCurrent._frm_post_01_formulario._nuevo_documento /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_formulario.getObject()));
RDebugUtils.currentLine=15269899;
 //BA.debugLineNum = 15269899;BA.debugLine="End Sub";
return "";
}
public static String  _btn_ver_documentos_click() throws Exception{
RDebugUtils.currentModule="frm_menu_post_venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ver_documentos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_ver_documentos_click", null));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub Btn_Ver_Documentos_Click";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="StartActivity(Frm_Documentos_Generados)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_documentos_generados.getObject()));
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim Row_Documento As Map";
_row_documento = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_documento /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_tido,_nudo);
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_buscardoc"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="Row_Documento =Filas.Get(0)";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="Row_Documento = Null";
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
RDebugUtils.currentLine=15532053;
 //BA.debugLineNum = 15532053;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=15532054;
 //BA.debugLineNum = 15532054;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("615532054",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=15532057;
 //BA.debugLineNum = 15532057;BA.debugLine="Return Row_Documento";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_documento));return;};
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Dim Row_Documento As Map";
_row_documento = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_documento2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_idmaeedo);
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_buscardoc2"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=15597579;
 //BA.debugLineNum = 15597579;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=15597581;
 //BA.debugLineNum = 15597581;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=15597582;
 //BA.debugLineNum = 15597582;BA.debugLine="Row_Documento =Filas.Get(0)";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15597585;
 //BA.debugLineNum = 15597585;BA.debugLine="Row_Documento = Null";
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
RDebugUtils.currentLine=15597589;
 //BA.debugLineNum = 15597589;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=15597590;
 //BA.debugLineNum = 15597590;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("615597590",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=15597593;
 //BA.debugLineNum = 15597593;BA.debugLine="Return Row_Documento";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_documento));return;};
RDebugUtils.currentLine=15597595;
 //BA.debugLineNum = 15597595;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="Dim Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_koen,_suen);
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_fx_traerdatosentidad"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=15663115;
 //BA.debugLineNum = 15663115;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=15663117;
 //BA.debugLineNum = 15663117;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=15663119;
 //BA.debugLineNum = 15663119;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=15663120;
 //BA.debugLineNum = 15663120;BA.debugLine="Row_Entidad =Filas.Get(0)";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15663123;
 //BA.debugLineNum = 15663123;BA.debugLine="Row_Entidad = Null";
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
RDebugUtils.currentLine=15663127;
 //BA.debugLineNum = 15663127;BA.debugLine="Row_Entidad = Null";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=15663128;
 //BA.debugLineNum = 15663128;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("615663128",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=15663131;
 //BA.debugLineNum = 15663131;BA.debugLine="Return Row_Entidad";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_entidad));return;};
RDebugUtils.currentLine=15663133;
 //BA.debugLineNum = 15663133;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Dim NewDoc As Crear_Documento";
_newdoc = new BaKapp.Movil.Tag.crear_documento();
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="NewDoc.Initialize";
_newdoc._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
_newdoc._idmaeedo /*int*/  = _idmaeedo;
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ver_documento"), _newdoc._sb_traer_entidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_koen,_suen));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rowentidad = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="If RowEntidad = Null Then";
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
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=15794187;
 //BA.debugLineNum = 15794187;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
_newdoc._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = _rowentidad;
RDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_post_venta", "sb_ver_documento"), _newdoc._sb_nuevo_documento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 10;
return;
case 10:
//C
this.state = 5;
_id_docenc = (Integer) result[0];
;
RDebugUtils.currentLine=15794191;
 //BA.debugLineNum = 15794191;BA.debugLine="If Id_DocEnc <> 0 Then";
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
RDebugUtils.currentLine=15794193;
 //BA.debugLineNum = 15794193;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=15794194;
 //BA.debugLineNum = 15794194;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ahora puede editar el documento"),BA.ObjectToCharSequence("Editar Documento"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15794196;
 //BA.debugLineNum = 15794196;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = _id_docenc;
RDebugUtils.currentLine=15794197;
 //BA.debugLineNum = 15794197;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_formulario.getObject()));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=15794201;
 //BA.debugLineNum = 15794201;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}