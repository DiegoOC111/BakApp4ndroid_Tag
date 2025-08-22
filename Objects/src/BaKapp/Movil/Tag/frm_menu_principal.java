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

public class frm_menu_principal extends Activity implements B4AActivity{
	public static frm_menu_principal mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_menu_principal");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_menu_principal).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_menu_principal");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_menu_principal", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_menu_principal) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_menu_principal) Resume **");
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
		return frm_menu_principal.class;
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
            BA.LogInfo("** Activity (frm_menu_principal) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_menu_principal) Pause event (activity is not paused). **");
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
            frm_menu_principal mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_menu_principal) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _btn_postventa = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nombre_usuario = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_version = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_codalternativos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_inventario = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_modalidad = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_etiqueta = null;
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
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="Activity.LoadLayout(\"Menu_Principal\")";
mostCurrent._activity.LoadLayout("Menu_Principal",mostCurrent.activityBA);
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="Lbl_Nombre_Usuario.Text = \"Usuario activo: \" & Va";
mostCurrent._lbl_nombre_usuario.setText(BA.ObjectToCharSequence("Usuario activo: "+BA.ObjectToString(mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))+"-"+BA.ObjectToString(mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")))));
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="Lbl_Modalidad.Text = \"Modalidad: \" & Variables.Gl";
mostCurrent._lbl_modalidad.setText(BA.ObjectToCharSequence("Modalidad: "+mostCurrent._variables._gl_modalidad /*String*/ ));
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="Lbl_Version.Text = Application.LabelName & \" vers";
mostCurrent._lbl_version.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()+" versión: "+anywheresoftware.b4a.keywords.Common.Application.getVersionName()));
RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="Btn_CodAlternativos.Enabled = False";
mostCurrent._btn_codalternativos.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="Btn_Inventario.Enabled = False";
mostCurrent._btn_inventario.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15990797;
 //BA.debugLineNum = 15990797;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="End Sub";
return "";
}
public static String  _btn_etiqueta_click() throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_etiqueta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_etiqueta_click", null));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub Btn_Etiqueta_Click";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="StartActivity(Frm_etiquetas)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_etiquetas.getObject()));
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="End Sub";
return "";
}
public static void  _btn_postventa_click() throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_postventa_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_postventa_click", null); return;}
ResumableSub_Btn_PostVenta_Click rsub = new ResumableSub_Btn_PostVenta_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_PostVenta_Click extends BA.ResumableSub {
public ResumableSub_Btn_PostVenta_Click(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_menu_principal parent;
BaKapp.Movil.Tag.clfunciones2 _clfx2 = null;
boolean _resultado = false;
boolean _b4a_despachosimple = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim CLFx2 As ClFunciones2";
_clfx2 = new BaKapp.Movil.Tag.clfunciones2();
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="CLFx2.Initialize(Null,\"\")";
_clfx2._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
_clfx2._designercreateview /*String*/ (null,(Object)(parent.mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="Wait For(CLFx2.Sb_RevisarFormatos) Complete (Resu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_principal", "btn_postventa_click"), _clfx2._sb_revisarformatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_resultado)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=16187403;
 //BA.debugLineNum = 16187403;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
_b4a_despachosimple = BA.ObjectToBoolean(parent.mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="If B4A_DespachoSimple Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_b4a_despachosimple) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=16187406;
 //BA.debugLineNum = 16187406;BA.debugLine="Crear_DocumentoConEndXDefecto";
_crear_documentoconendxdefecto();
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=16187408;
 //BA.debugLineNum = 16187408;BA.debugLine="StartActivity(Frm_Menu_Post_Venta)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_post_venta.getObject()));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16187411;
 //BA.debugLineNum = 16187411;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _crear_documentoconendxdefecto() throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "crear_documentoconendxdefecto", false))
	 {Debug.delegate(mostCurrent.activityBA, "crear_documentoconendxdefecto", null); return;}
ResumableSub_Crear_DocumentoConEndXDefecto rsub = new ResumableSub_Crear_DocumentoConEndXDefecto(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Crear_DocumentoConEndXDefecto extends BA.ResumableSub {
public ResumableSub_Crear_DocumentoConEndXDefecto(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_menu_principal parent;
String _koen = "";
String _suen = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim Koen As String = Variables.Global_Row_Configu";
_koen = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_EntidadXdefecto")));
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="Dim Suen As String = Variables.Global_Row_Configu";
_suen = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_SucEntXdefecto")));
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_principal.getObject(),_koen,_suen);
RDebugUtils.currentLine=16252935;
 //BA.debugLineNum = 16252935;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_principal", "crear_documentoconendxdefecto"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16252939;
 //BA.debugLineNum = 16252939;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=16252941;
 //BA.debugLineNum = 16252941;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=16252943;
 //BA.debugLineNum = 16252943;BA.debugLine="Variables.Global_Row_Entidad_X_Defecto = Funcio";
parent.mostCurrent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/  = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=16252944;
 //BA.debugLineNum = 16252944;BA.debugLine="Log(\"8.- Cargamos la Entidad por defecto\")";
anywheresoftware.b4a.keywords.Common.LogImpl("616252944","8.- Cargamos la Entidad por defecto",0);
RDebugUtils.currentLine=16252946;
 //BA.debugLineNum = 16252946;BA.debugLine="StartActivity(Frm_Menu_Post_Venta)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_post_venta.getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=16252950;
 //BA.debugLineNum = 16252950;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16252952;
 //BA.debugLineNum = 16252952;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=16252954;
 //BA.debugLineNum = 16252954;BA.debugLine="Msgbox2Async(\"No existe la entidad por defecto\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe la entidad por defecto"+anywheresoftware.b4a.keywords.Common.CRLF+"Para poder trabajar con el dispositivo debe configurar una entidad por defecto"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16252956;
 //BA.debugLineNum = 16252956;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_principal", "crear_documentoconendxdefecto"), null);
this.state = 12;
return;
case 12:
//C
this.state = 9;
_result = (Integer) result[0];
;
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=16252962;
 //BA.debugLineNum = 16252962;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbl_nombre_usuario_longclick() throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_nombre_usuario_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbl_nombre_usuario_longclick", null); return;}
ResumableSub_Lbl_Nombre_Usuario_LongClick rsub = new ResumableSub_Lbl_Nombre_Usuario_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Lbl_Nombre_Usuario_LongClick extends BA.ResumableSub {
public ResumableSub_Lbl_Nombre_Usuario_LongClick(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_menu_principal parent;
BaKapp.Movil.Tag.cl_permisoxui _cl_permisox = null;
boolean _rst = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
_cl_permisox = new BaKapp.Movil.Tag.cl_permisoxui();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
_cl_permisox._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
_cl_permisox._designercreateview /*String*/ (null,(Object)(parent.mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_principal", "lbl_nombre_usuario_longclick"), _cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00015"));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbl_version_longclick() throws Exception{
RDebugUtils.currentModule="frm_menu_principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_version_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbl_version_longclick", null); return;}
ResumableSub_Lbl_Version_LongClick rsub = new ResumableSub_Lbl_Version_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Lbl_Version_LongClick extends BA.ResumableSub {
public ResumableSub_Lbl_Version_LongClick(BaKapp.Movil.Tag.frm_menu_principal parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_menu_principal parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_menu_principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Msgbox2Async(\"¿Estas seguro de limpiar la base de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de limpiar la base de datos local?"),BA.ObjectToCharSequence("LIMPIAR DB"),"Si","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_menu_principal", "lbl_version_longclick"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="Funciones.Sb_BorrarTodosLosRegistrosDeLaBaseDeDa";
parent.mostCurrent._funciones._sb_borrartodoslosregistrosdelabasededatos /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="ToastMessageShow(\"BASE DE DATOS LIMPIA...\", Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("BASE DE DATOS LIMPIA..."),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}