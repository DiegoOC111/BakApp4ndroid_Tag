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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_menu_principal");
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
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
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
 //BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"Menu_Principal\")";
mostCurrent._activity.LoadLayout("Menu_Principal",mostCurrent.activityBA);
 //BA.debugLineNum = 32;BA.debugLine="Lbl_Nombre_Usuario.Text = \"Usuario activo: \" & Va";
mostCurrent._lbl_nombre_usuario.setText(BA.ObjectToCharSequence("Usuario activo: "+BA.ObjectToString(mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")))+"-"+BA.ObjectToString(mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")))));
 //BA.debugLineNum = 33;BA.debugLine="Lbl_Modalidad.Text = \"Modalidad: \" & Variables.Gl";
mostCurrent._lbl_modalidad.setText(BA.ObjectToCharSequence("Modalidad: "+mostCurrent._variables._gl_modalidad /*String*/ ));
 //BA.debugLineNum = 34;BA.debugLine="Lbl_Version.Text = Application.LabelName & \" vers";
mostCurrent._lbl_version.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()+" versión: "+anywheresoftware.b4a.keywords.Common.Application.getVersionName()));
 //BA.debugLineNum = 36;BA.debugLine="Btn_CodAlternativos.Enabled = False";
mostCurrent._btn_codalternativos.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 37;BA.debugLine="Btn_Inventario.Enabled = False";
mostCurrent._btn_inventario.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static String  _btn_etiqueta_click() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Private Sub Btn_Etiqueta_Click";
 //BA.debugLineNum = 129;BA.debugLine="StartActivity(Frm_etiquetas)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_etiquetas.getObject()));
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static void  _btn_postventa_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 51;BA.debugLine="Dim CLFx2 As ClFunciones2";
_clfx2 = new BaKapp.Movil.Tag.clfunciones2();
 //BA.debugLineNum = 52;BA.debugLine="CLFx2.Initialize(Null,\"\")";
_clfx2._initialize /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
 //BA.debugLineNum = 53;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
_clfx2._designercreateview /*String*/ ((Object)(parent.mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 55;BA.debugLine="Wait For(CLFx2.Sb_RevisarFormatos) Complete (Resu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _clfx2._sb_revisarformatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 56;BA.debugLine="If Not(Resultado) Then";
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
 //BA.debugLineNum = 57;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 60;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
_b4a_despachosimple = BA.ObjectToBoolean(parent.mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
 //BA.debugLineNum = 62;BA.debugLine="If B4A_DespachoSimple Then";
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
 //BA.debugLineNum = 63;BA.debugLine="Crear_DocumentoConEndXDefecto";
_crear_documentoconendxdefecto();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 65;BA.debugLine="StartActivity(Frm_Menu_Post_Venta)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_post_venta.getObject()));
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _resultado) throws Exception{
}
public static void  _crear_documentoconendxdefecto() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 72;BA.debugLine="Dim Koen As String = Variables.Global_Row_Configu";
_koen = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_EntidadXdefecto")));
 //BA.debugLineNum = 73;BA.debugLine="Dim Suen As String = Variables.Global_Row_Configu";
_suen = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_SucEntXdefecto")));
 //BA.debugLineNum = 75;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_principal.getObject(),_koen,_suen);
 //BA.debugLineNum = 77;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 79;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 81;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 83;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 85;BA.debugLine="Variables.Global_Row_Entidad_X_Defecto = Funcio";
parent.mostCurrent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/  = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 86;BA.debugLine="Log(\"8.- Cargamos la Entidad por defecto\")";
anywheresoftware.b4a.keywords.Common.LogImpl("519398672","8.- Cargamos la Entidad por defecto",0);
 //BA.debugLineNum = 88;BA.debugLine="StartActivity(Frm_Menu_Post_Venta)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_post_venta.getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 92;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 94;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 96;BA.debugLine="Msgbox2Async(\"No existe la entidad por defecto\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe la entidad por defecto"+anywheresoftware.b4a.keywords.Common.CRLF+"Para poder trabajar con el dispositivo debe configurar una entidad por defecto"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 98;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
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
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Btn_PostVenta As Button";
mostCurrent._btn_postventa = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Lbl_Nombre_Usuario As Label";
mostCurrent._lbl_nombre_usuario = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Lbl_Version As Label";
mostCurrent._lbl_version = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Btn_CodAlternativos As Button";
mostCurrent._btn_codalternativos = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Btn_Inventario As Button";
mostCurrent._btn_inventario = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Lbl_Modalidad As Label";
mostCurrent._lbl_modalidad = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Btn_Etiqueta As Button";
mostCurrent._btn_etiqueta = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static void  _lbl_nombre_usuario_longclick() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 120;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
_cl_permisox = new BaKapp.Movil.Tag.cl_permisoxui();
 //BA.debugLineNum = 121;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
_cl_permisox._initialize /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
 //BA.debugLineNum = 122;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
_cl_permisox._designercreateview /*String*/ ((Object)(parent.mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 124;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Bkp00015"));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbl_version_longclick() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 108;BA.debugLine="Msgbox2Async(\"¿Estas seguro de limpiar la base de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de limpiar la base de datos local?"),BA.ObjectToCharSequence("LIMPIAR DB"),"Si","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 109;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 111;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 112;BA.debugLine="Funciones.Sb_BorrarTodosLosRegistrosDeLaBaseDeDa";
parent.mostCurrent._funciones._sb_borrartodoslosregistrosdelabasededatos /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 113;BA.debugLine="ToastMessageShow(\"BASE DE DATOS LIMPIA...\", Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("BASE DE DATOS LIMPIA..."),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
