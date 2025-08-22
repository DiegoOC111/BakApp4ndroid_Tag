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

public class frm_buscar_documento extends Activity implements B4AActivity{
	public static frm_buscar_documento mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_buscar_documento");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_buscar_documento).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_buscar_documento");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_buscar_documento", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_buscar_documento) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_buscar_documento) Resume **");
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
		return frm_buscar_documento.class;
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
            BA.LogInfo("** Activity (frm_buscar_documento) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_buscar_documento) Pause event (activity is not paused). **");
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
            frm_buscar_documento mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_buscar_documento) Resume **");
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
public static int _idmaeedo = 0;
public static String _tido = "";
public static String _nudo = "";
public static String _koen = "";
public static String _suen = "";
public static String _occ = "";
public static String _observaciones = "";
public static String _para = "";
public static String _estado = "";
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_transformar_nvv = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_editar_documento = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_imprimir = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_enviar_correo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_enviar_correo_imprimir = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_etiqueta = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_cerrar = null;
public BaKapp.Movil.Tag.cl_permisoxui _cl_permisox = null;
public BaKapp.Movil.Tag.clfunciones2 _clfx = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
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
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Activity.LoadLayout(\"Op_Edita_Print_Email_Etc\")";
mostCurrent._activity.LoadLayout("Op_Edita_Print_Email_Etc",mostCurrent.activityBA);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="If Tido = \"COV\" Then";
if ((_tido).equals("COV")) { 
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="Btn_Transformar_NVV.Enabled = False";
mostCurrent._btn_transformar_nvv.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="If Tido = \"COV\" Then";
if ((_tido).equals("COV")) { 
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="Lbl_Etiqueta.Text = \"Cotización: \" & Nudo";
mostCurrent._lbl_etiqueta.setText(BA.ObjectToCharSequence("Cotización: "+_nudo));
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="Btn_Transformar_NVV.Enabled = True";
mostCurrent._btn_transformar_nvv.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="If Tido = \"NVV\" Then";
if ((_tido).equals("NVV")) { 
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="Lbl_Etiqueta.Text = \"Nota de venta: \" & Nudo";
mostCurrent._lbl_etiqueta.setText(BA.ObjectToCharSequence("Nota de venta: "+_nudo));
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="Btn_Transformar_NVV.Enabled = False";
mostCurrent._btn_transformar_nvv.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
mostCurrent._cl_permisox._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
mostCurrent._cl_permisox._designercreateview /*String*/ (null,(Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="ClFx.Initialize(Null,\"\")";
mostCurrent._clfx._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=10813463;
 //BA.debugLineNum = 10813463;BA.debugLine="ClFx.DesignerCreateView(Activity,Null,Null)";
mostCurrent._clfx._designercreateview /*String*/ (null,(Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=10813465;
 //BA.debugLineNum = 10813465;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return "";
}
public static void  _btn_cerrar_click() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cerrar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_cerrar_click", null); return;}
ResumableSub_Btn_Cerrar_Click rsub = new ResumableSub_Btn_Cerrar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Cerrar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Cerrar_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Msgbox2Async(\"¿Confirma cerrar la ventana?\",\"C E";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma cerrar la ventana?"),BA.ObjectToCharSequence("C E R R A R"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_cerrar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
parent.mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_editar_documento_click() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_editar_documento_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_editar_documento_click", null); return;}
ResumableSub_Btn_Editar_Documento_Click rsub = new ResumableSub_Btn_Editar_Documento_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Editar_Documento_Click extends BA.ResumableSub {
public ResumableSub_Btn_Editar_Documento_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
String _editardocumento = "";
int _result = 0;
boolean _rs = false;
String _msg = "";
anywheresoftware.b4a.objects.collections.Map _rsrow = null;
boolean _permitir = false;
boolean _haydifprecios = false;
String _error = "";
String _permiso = "";
String _respuesta = "";
String _versionws = "";
boolean _usar_precio_original = false;
String _msp = "";
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
boolean _rst = false;
BaKapp.Movil.Tag.crear_documento _newdoc = null;
anywheresoftware.b4a.objects.collections.Map _rowentidad = null;
int _id_docenc = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Dim EditarDocumento As String = \"\"";
_editardocumento = "";
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="If Tido = \"COV\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._tido).equals("COV")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="EditarDocumento = \"Editar Documento.\"";
_editardocumento = "Editar Documento.";
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"proforma-edit.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"proforma-edit.png");
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="Msgbox2Async(\"Editar documento\", Tido & \"-\" & Nud";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Editar documento"),BA.ObjectToCharSequence(parent._tido+"-"+parent._nudo),"Editar Observaciones.","Cancelar",_editardocumento,parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 64;
return;
case 64:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="Frm_Editar_ObsOc.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_editar_obsoc._idmaeedo /*int*/  = parent._idmaeedo;
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="Frm_Editar_ObsOc.Observaciones = Observaciones";
parent.mostCurrent._frm_editar_obsoc._observaciones /*String*/  = parent._observaciones;
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="Frm_Editar_ObsOc.Orden_compra = OCC";
parent.mostCurrent._frm_editar_obsoc._orden_compra /*String*/  = parent._occ;
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="StartActivity(Frm_Editar_ObsOc)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_editar_obsoc.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=11075605;
 //BA.debugLineNum = 11075605;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 8:
//if
this.state = 63;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=11075607;
 //BA.debugLineNum = 11075607;BA.debugLine="Wait For(Sb_SePuedeEditarDocumento) Complete (Rs";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _sb_sepuedeeditardocumento());
this.state = 65;
return;
case 65:
//C
this.state = 11;
_rs = (Boolean) result[0];
;
RDebugUtils.currentLine=11075609;
 //BA.debugLineNum = 11075609;BA.debugLine="If Not(Rs) Then";
if (true) break;

case 11:
//if
this.state = 21;
if (anywheresoftware.b4a.keywords.Common.Not(_rs)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=11075610;
 //BA.debugLineNum = 11075610;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=11075611;
 //BA.debugLineNum = 11075611;BA.debugLine="Dim Msg As String";
_msg = "";
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="If Tido = \"COV\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((parent._tido).equals("COV")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=11075613;
 //BA.debugLineNum = 11075613;BA.debugLine="Msg = \"No se puede editar este documento ya qu";
_msg = "No se puede editar este documento ya que es sustentatorio de una NOTA DE VENTA";
 if (true) break;
;
RDebugUtils.currentLine=11075615;
 //BA.debugLineNum = 11075615;BA.debugLine="If Tido = \"NVV\" Then";

case 17:
//if
this.state = 20;
if ((parent._tido).equals("NVV")) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=11075616;
 //BA.debugLineNum = 11075616;BA.debugLine="Msg = \"No se puede editar este documento ya qu";
_msg = "No se puede editar este documento ya que es sustentatorio de una FACTURA";
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=11075618;
 //BA.debugLineNum = 11075618;BA.debugLine="Msgbox2Async(Msg,\"Validación\", \"Ok\",\"\",\"\", bmp1";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11075619;
 //BA.debugLineNum = 11075619;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=11075623;
 //BA.debugLineNum = 11075623;BA.debugLine="Wait For(Sb_RevisarDifPrecios) Complete (RsRow A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _sb_revisardifprecios());
this.state = 66;
return;
case 66:
//C
this.state = 22;
_rsrow = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=11075625;
 //BA.debugLineNum = 11075625;BA.debugLine="If RsRow = Null Then";
if (true) break;

case 22:
//if
this.state = 25;
if (_rsrow== null) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=11075626;
 //BA.debugLineNum = 11075626;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=11075630;
 //BA.debugLineNum = 11075630;BA.debugLine="Dim Permitir As Boolean = RsRow.Get(\"Permitir\")";
_permitir = BA.ObjectToBoolean(_rsrow.Get((Object)("Permitir")));
RDebugUtils.currentLine=11075631;
 //BA.debugLineNum = 11075631;BA.debugLine="Dim HayDifPrecios As Boolean = RsRow.Get(\"HayDif";
_haydifprecios = BA.ObjectToBoolean(_rsrow.Get((Object)("HayDifPrecios")));
RDebugUtils.currentLine=11075632;
 //BA.debugLineNum = 11075632;BA.debugLine="Dim Error As String = RsRow.Get(\"Error\")";
_error = BA.ObjectToString(_rsrow.Get((Object)("Error")));
RDebugUtils.currentLine=11075633;
 //BA.debugLineNum = 11075633;BA.debugLine="Dim Permiso As String = RsRow.Get(\"Permiso\")";
_permiso = BA.ObjectToString(_rsrow.Get((Object)("Permiso")));
RDebugUtils.currentLine=11075634;
 //BA.debugLineNum = 11075634;BA.debugLine="Dim Respuesta As String = RsRow.Get(\"Respuesta\")";
_respuesta = BA.ObjectToString(_rsrow.Get((Object)("Respuesta")));
RDebugUtils.currentLine=11075635;
 //BA.debugLineNum = 11075635;BA.debugLine="Dim VersionWs As String	 = RsRow.Get(\"VersionWs\"";
_versionws = BA.ObjectToString(_rsrow.Get((Object)("VersionWs")));
RDebugUtils.currentLine=11075637;
 //BA.debugLineNum = 11075637;BA.debugLine="If Error <> \"\" Then";
if (true) break;

case 26:
//if
this.state = 29;
if ((_error).equals("") == false) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=11075638;
 //BA.debugLineNum = 11075638;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11075639;
 //BA.debugLineNum = 11075639;BA.debugLine="Msgbox2Async(Error,\"Error WebService\", \"Ok\",\"\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error WebService"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11075640;
 //BA.debugLineNum = 11075640;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11075641;
 //BA.debugLineNum = 11075641;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=11075644;
 //BA.debugLineNum = 11075644;BA.debugLine="Dim	Usar_Precio_Original As Boolean";
_usar_precio_original = false;
RDebugUtils.currentLine=11075646;
 //BA.debugLineNum = 11075646;BA.debugLine="If HayDifPrecios Then";
if (true) break;

case 30:
//if
this.state = 54;
if (_haydifprecios) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=11075648;
 //BA.debugLineNum = 11075648;BA.debugLine="Dim MsP As String";
_msp = "";
RDebugUtils.currentLine=11075649;
 //BA.debugLineNum = 11075649;BA.debugLine="If Not(Permitir) Then";
if (true) break;

case 33:
//if
this.state = 38;
if (anywheresoftware.b4a.keywords.Common.Not(_permitir)) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 38;
RDebugUtils.currentLine=11075650;
 //BA.debugLineNum = 11075650;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=11075651;
 //BA.debugLineNum = 11075651;BA.debugLine="MsP = CRLF & \" *(Requiere permiso)\"";
_msp = anywheresoftware.b4a.keywords.Common.CRLF+" *(Requiere permiso)";
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=11075653;
 //BA.debugLineNum = 11075653;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"warning.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"warning.png");
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=11075656;
 //BA.debugLineNum = 11075656;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11075658;
 //BA.debugLineNum = 11075658;BA.debugLine="Msgbox2Async(Respuesta,\"Documento vencido\" & Ms";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_respuesta),BA.ObjectToCharSequence("Documento vencido"+_msp),"Dejar precio original (*)","Cancelar","Dejar Precio Actual",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11075659;
 //BA.debugLineNum = 11075659;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 68;
return;
case 68:
//C
this.state = 39;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11075661;
 //BA.debugLineNum = 11075661;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 39:
//if
this.state = 50;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=11075663;
 //BA.debugLineNum = 11075663;BA.debugLine="If Not(Permitir) Then";
if (true) break;

case 42:
//if
this.state = 49;
if (anywheresoftware.b4a.keywords.Common.Not(_permitir)) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=11075665;
 //BA.debugLineNum = 11075665;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_permiso));
this.state = 69;
return;
case 69:
//C
this.state = 45;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=11075667;
 //BA.debugLineNum = 11075667;BA.debugLine="If Not(Rst) Then";
if (true) break;

case 45:
//if
this.state = 48;
if (anywheresoftware.b4a.keywords.Common.Not(_rst)) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=11075668;
 //BA.debugLineNum = 11075668;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=11075673;
 //BA.debugLineNum = 11075673;BA.debugLine="Usar_Precio_Original = True";
_usar_precio_original = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=11075677;
 //BA.debugLineNum = 11075677;BA.debugLine="If Result= XUI.DialogResponse_Cancel Then";

case 50:
//if
this.state = 53;
if (_result==_xui.DialogResponse_Cancel) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=11075678;
 //BA.debugLineNum = 11075678;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=11075683;
 //BA.debugLineNum = 11075683;BA.debugLine="Dim NewDoc As Crear_Documento";
_newdoc = new BaKapp.Movil.Tag.crear_documento();
RDebugUtils.currentLine=11075685;
 //BA.debugLineNum = 11075685;BA.debugLine="NewDoc.Initialize";
_newdoc._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=11075686;
 //BA.debugLineNum = 11075686;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
_newdoc._idmaeedo /*int*/  = parent._idmaeedo;
RDebugUtils.currentLine=11075687;
 //BA.debugLineNum = 11075687;BA.debugLine="NewDoc.Usar_Precio_Original = Usar_Precio_Origin";
_newdoc._usar_precio_original /*boolean*/  = _usar_precio_original;
RDebugUtils.currentLine=11075689;
 //BA.debugLineNum = 11075689;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Com";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _newdoc._sb_traer_entidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._koen,parent._suen));
this.state = 70;
return;
case 70:
//C
this.state = 55;
_rowentidad = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=11075691;
 //BA.debugLineNum = 11075691;BA.debugLine="If RowEntidad = Null Then";
if (true) break;

case 55:
//if
this.state = 58;
if (_rowentidad== null) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=11075692;
 //BA.debugLineNum = 11075692;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=11075695;
 //BA.debugLineNum = 11075695;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
_newdoc._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = _rowentidad;
RDebugUtils.currentLine=11075697;
 //BA.debugLineNum = 11075697;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), _newdoc._sb_nuevo_documento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 71;
return;
case 71:
//C
this.state = 59;
_id_docenc = (Integer) result[0];
;
RDebugUtils.currentLine=11075699;
 //BA.debugLineNum = 11075699;BA.debugLine="If Id_DocEnc <> 0 Then";
if (true) break;

case 59:
//if
this.state = 62;
if (_id_docenc!=0) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=11075701;
 //BA.debugLineNum = 11075701;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11075702;
 //BA.debugLineNum = 11075702;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ahora puede editar el documento"),BA.ObjectToCharSequence("Editar Documento"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11075703;
 //BA.debugLineNum = 11075703;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_editar_documento_click"), null);
this.state = 72;
return;
case 72:
//C
this.state = 62;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11075705;
 //BA.debugLineNum = 11075705;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = _id_docenc;
RDebugUtils.currentLine=11075706;
 //BA.debugLineNum = 11075706;BA.debugLine="Frm_Post_01_Formulario.Idmaeedo_Origen = Idmaee";
parent.mostCurrent._frm_post_01_formulario._idmaeedo_origen /*int*/  = parent._idmaeedo;
RDebugUtils.currentLine=11075707;
 //BA.debugLineNum = 11075707;BA.debugLine="Frm_Post_01_Formulario.TipoDoc = Tido";
parent.mostCurrent._frm_post_01_formulario._tipodoc /*String*/  = parent._tido;
RDebugUtils.currentLine=11075708;
 //BA.debugLineNum = 11075708;BA.debugLine="Frm_Post_01_Formulario.Nudo_Origen = Nudo";
parent.mostCurrent._frm_post_01_formulario._nudo_origen /*String*/  = parent._nudo;
RDebugUtils.currentLine=11075709;
 //BA.debugLineNum = 11075709;BA.debugLine="Frm_Post_01_Formulario.Editar_Documento = True";
parent.mostCurrent._frm_post_01_formulario._editar_documento /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11075711;
 //BA.debugLineNum = 11075711;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_formulario.getObject()));
RDebugUtils.currentLine=11075712;
 //BA.debugLineNum = 11075712;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
RDebugUtils.currentLine=11075718;
 //BA.debugLineNum = 11075718;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_sepuedeeditardocumento() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_sepuedeeditardocumento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_sepuedeeditardocumento", null));}
ResumableSub_Sb_SePuedeEditarDocumento rsub = new ResumableSub_Sb_SePuedeEditarDocumento(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_SePuedeEditarDocumento extends BA.ResumableSub {
public ResumableSub_Sb_SePuedeEditarDocumento(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
String _consulta_sql = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;
int _regitros_sutentatorios = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim Consulta_Sql As String = \"Select Count(*) As";
_consulta_sql = "Select Count(*) As Regitros_Sutentatorios"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEDDO Where IDRST In (Select IDMAEDDO From MAEDDO Where IDMAEEDO = "+BA.NumberToString(parent._idmaeedo)+") And ARCHIRST = 'MAEDDO'";
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,_consulta_sql,frm_buscar_documento.getObject());
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "sb_sepuedeeditardocumento"), (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=11141136;
 //BA.debugLineNum = 11141136;BA.debugLine="Dim Regitros_Sutentatorios As Int = Fila.Get(\"R";
_regitros_sutentatorios = (int)(BA.ObjectToNumber(_fila.Get((Object)("Regitros_Sutentatorios"))));
RDebugUtils.currentLine=11141138;
 //BA.debugLineNum = 11141138;BA.debugLine="If Regitros_Sutentatorios > 0 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_regitros_sutentatorios>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
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
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=11141146;
 //BA.debugLineNum = 11141146;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=11141148;
 //BA.debugLineNum = 11141148;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisardifprecios() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_revisardifprecios", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_revisardifprecios", null));}
ResumableSub_Sb_RevisarDifPrecios rsub = new ResumableSub_Sb_RevisarDifPrecios(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_RevisarDifPrecios extends BA.ResumableSub {
public ResumableSub_Sb_RevisarDifPrecios(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
int _vnta_dias_venci_coti = 0;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim Vnta_Dias_Venci_Coti As Int = Variables.Globa";
_vnta_dias_venci_coti = (int)(BA.ObjectToNumber(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_Dias_Venci_Coti"))));
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_revisardocvslistaprecio /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_buscar_documento.getObject(),parent._idmaeedo,_vnta_dias_venci_coti);
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "sb_revisardifprecios"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11534359;
 //BA.debugLineNum = 11534359;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("611534359",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11534362;
 //BA.debugLineNum = 11534362;BA.debugLine="Return Fila";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=11534364;
 //BA.debugLineNum = 11534364;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_enviar_correo_click() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_enviar_correo_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_enviar_correo_click", null); return;}
ResumableSub_Btn_Enviar_Correo_Click rsub = new ResumableSub_Btn_Enviar_Correo_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Enviar_Correo_Click extends BA.ResumableSub {
public ResumableSub_Btn_Enviar_Correo_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _result = 0;
String _resultado = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-back";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"send-mail-back.png");
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Msgbox2Async(\"¿Confirma enviar el correo?\",\"CORRE";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma enviar el correo?"),BA.ObjectToCharSequence("CORREO"),"Si","Cancelar","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result!=_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="Wait For(ClFx.Fx_Enviar_Correo_Bakapp1(Idmaeedo,K";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), parent.mostCurrent._clfx._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._idmaeedo,parent._koen,parent._suen,parent._para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=11272212;
 //BA.debugLineNum = 11272212;BA.debugLine="If Resultado = \"Ok\" Then";
if (true) break;

case 5:
//if
this.state = 14;
if ((_resultado).equals("Ok")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 14;
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="Para =	ClFx.NewPara";
parent._para = parent.mostCurrent._clfx._newpara /*String*/ ;
RDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="Msgbox2Async(\"correo enviado correctamente\",\"Cor";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("correo enviado correctamente"),BA.ObjectToCharSequence("Correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11272216;
 //BA.debugLineNum = 11272216;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 14;
_result = (Integer) result[0];
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="If Resultado.ToLowerCase <> \"cancelado por el us";
if (true) break;

case 10:
//if
this.state = 13;
if ((_resultado.toLowerCase()).equals("cancelado por el usuario") == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=11272219;
 //BA.debugLineNum = 11272219;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=11272220;
 //BA.debugLineNum = 11272220;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar correo\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11272221;
 //BA.debugLineNum = 11272221;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_click"), null);
this.state = 18;
return;
case 18:
//C
this.state = 13;
_result = (Integer) result[0];
;
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
RDebugUtils.currentLine=11272225;
 //BA.debugLineNum = 11272225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_enviar_correo_imprimir_click() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_enviar_correo_imprimir_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_enviar_correo_imprimir_click", null); return;}
ResumableSub_Btn_Enviar_Correo_Imprimir_Click rsub = new ResumableSub_Btn_Enviar_Correo_Imprimir_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Enviar_Correo_Imprimir_Click extends BA.ResumableSub {
public ResumableSub_Btn_Enviar_Correo_Imprimir_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _result = 0;
String _resultado = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-back";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"send-mail-back-printer.png");
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Msgbox2Async(\"¿Confirma imprimir y reenviar corre";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma imprimir y reenviar correo?"),BA.ObjectToCharSequence("EMAIL-IMPRIMIR"),"Si","Cancelar","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result!=_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11337744;
 //BA.debugLineNum = 11337744;BA.debugLine="Wait For(ClFx.Fx_Imprimir_Bakapp(Idmaeedo)) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), parent.mostCurrent._clfx._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._idmaeedo));
this.state = 18;
return;
case 18:
//C
this.state = 5;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=11337746;
 //BA.debugLineNum = 11337746;BA.debugLine="If Resultado = \"Ok\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((_resultado).equals("Ok")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=11337747;
 //BA.debugLineNum = 11337747;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11337748;
 //BA.debugLineNum = 11337748;BA.debugLine="Msgbox2Async(\"Impresión enviada correctamente\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Impresión enviada correctamente"),BA.ObjectToCharSequence("Imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337749;
 //BA.debugLineNum = 11337749;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 10;
_result = (Integer) result[0];
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11337751;
 //BA.debugLineNum = 11337751;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=11337752;
 //BA.debugLineNum = 11337752;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\", \"Ok\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337753;
 //BA.debugLineNum = 11337753;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 20;
return;
case 20:
//C
this.state = 10;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11337754;
 //BA.debugLineNum = 11337754;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=11337761;
 //BA.debugLineNum = 11337761;BA.debugLine="Wait For(ClFx.Fx_Enviar_Correo_Bakapp1(Idmaeedo,K";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), parent.mostCurrent._clfx._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._idmaeedo,parent._koen,parent._suen,parent._para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=11337765;
 //BA.debugLineNum = 11337765;BA.debugLine="If Resultado = \"Ok\" Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((_resultado).equals("Ok")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=11337766;
 //BA.debugLineNum = 11337766;BA.debugLine="Para =	ClFx.NewPara";
parent._para = parent.mostCurrent._clfx._newpara /*String*/ ;
RDebugUtils.currentLine=11337767;
 //BA.debugLineNum = 11337767;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11337768;
 //BA.debugLineNum = 11337768;BA.debugLine="Msgbox2Async(\"correo enviado correctamente\",\"Cor";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("correo enviado correctamente"),BA.ObjectToCharSequence("Correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337769;
 //BA.debugLineNum = 11337769;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 16;
_result = (Integer) result[0];
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=11337771;
 //BA.debugLineNum = 11337771;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=11337772;
 //BA.debugLineNum = 11337772;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar correo\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337773;
 //BA.debugLineNum = 11337773;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_enviar_correo_imprimir_click"), null);
this.state = 23;
return;
case 23:
//C
this.state = 16;
_result = (Integer) result[0];
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=11337776;
 //BA.debugLineNum = 11337776;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_imprimir_click() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_imprimir_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_imprimir_click", null); return;}
ResumableSub_Btn_Imprimir_Click rsub = new ResumableSub_Btn_Imprimir_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Imprimir_Click extends BA.ResumableSub {
public ResumableSub_Btn_Imprimir_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _result = 0;
String _resultado = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Msgbox2Async(\"¿Confirma imprimir el documento?\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma imprimir el documento?"),BA.ObjectToCharSequence("IMPRIMIR"),"Si","Cancelar","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_imprimir_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result!=_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="Wait For(ClFx.Fx_Imprimir_Bakapp(Idmaeedo)) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_imprimir_click"), parent.mostCurrent._clfx._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._idmaeedo));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="If Resultado = \"Ok\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((_resultado).equals("Ok")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="Msgbox2Async(\"Impresión enviada correctamente\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Impresión enviada correctamente"),BA.ObjectToCharSequence("Imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11206678;
 //BA.debugLineNum = 11206678;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\", \"Ace";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11206680;
 //BA.debugLineNum = 11206680;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11206683;
 //BA.debugLineNum = 11206683;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_transformar_nvv_click() throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_transformar_nvv_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_transformar_nvv_click", null); return;}
ResumableSub_Btn_Transformar_NVV_Click rsub = new ResumableSub_Btn_Transformar_NVV_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Transformar_NVV_Click extends BA.ResumableSub {
public ResumableSub_Btn_Transformar_NVV_Click(BaKapp.Movil.Tag.frm_buscar_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_buscar_documento parent;
int _result = 0;
BaKapp.Movil.Tag.crear_documento _newdoc = null;
anywheresoftware.b4a.objects.collections.Map _rowentidad = null;
int _id_docenc = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_buscar_documento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"proforma-ok-2.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"proforma-ok-2.png");
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Msgbox2Async(\"¿Confirma la creación de la NVV?\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma la creación de la NVV?"),BA.ObjectToCharSequence("Transformar a NVV"),"Si","Cancelar","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_transformar_nvv_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="Dim NewDoc As Crear_Documento";
_newdoc = new BaKapp.Movil.Tag.crear_documento();
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="NewDoc.Initialize";
_newdoc._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
_newdoc._idmaeedo /*int*/  = parent._idmaeedo;
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="NewDoc.Crear_NVV_Desde_COV = True";
_newdoc._crear_nvv_desde_cov /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="NewDoc.Usar_Precio_Original = True";
_newdoc._usar_precio_original /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_transformar_nvv_click"), _newdoc._sb_traer_entidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent._koen,parent._suen));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_rowentidad = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="If RowEntidad = Null Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_rowentidad== null) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=11010066;
 //BA.debugLineNum = 11010066;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=11010069;
 //BA.debugLineNum = 11010069;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
_newdoc._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = _rowentidad;
RDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_buscar_documento", "btn_transformar_nvv_click"), _newdoc._sb_nuevo_documento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_id_docenc = (Integer) result[0];
;
RDebugUtils.currentLine=11010073;
 //BA.debugLineNum = 11010073;BA.debugLine="If Id_DocEnc <> 0 Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_id_docenc!=0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ahora puede editar el documento"),BA.ObjectToCharSequence("Editar Documento"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11010078;
 //BA.debugLineNum = 11010078;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = _id_docenc;
RDebugUtils.currentLine=11010079;
 //BA.debugLineNum = 11010079;BA.debugLine="Frm_Post_01_Formulario.Crear_NVV_Desde_COV = Tru";
parent.mostCurrent._frm_post_01_formulario._crear_nvv_desde_cov /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11010080;
 //BA.debugLineNum = 11010080;BA.debugLine="Frm_Post_01_Formulario.Idmaeedo_Origen = Idmaeed";
parent.mostCurrent._frm_post_01_formulario._idmaeedo_origen /*int*/  = parent._idmaeedo;
RDebugUtils.currentLine=11010081;
 //BA.debugLineNum = 11010081;BA.debugLine="Frm_Post_01_Formulario.Nudo_Origen = Nudo";
parent.mostCurrent._frm_post_01_formulario._nudo_origen /*String*/  = parent._nudo;
RDebugUtils.currentLine=11010082;
 //BA.debugLineNum = 11010082;BA.debugLine="Frm_Post_01_Formulario.TipoDoc = \"NVV\"";
parent.mostCurrent._frm_post_01_formulario._tipodoc /*String*/  = "NVV";
RDebugUtils.currentLine=11010084;
 //BA.debugLineNum = 11010084;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_formulario.getObject()));
RDebugUtils.currentLine=11010085;
 //BA.debugLineNum = 11010085;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=11010089;
 //BA.debugLineNum = 11010089;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}