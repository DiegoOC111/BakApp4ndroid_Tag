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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_menu_post_venta");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_venta = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscar_documentos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_ver_documentos = null;
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
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
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
 //BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"Cp_Menu_Post_Venta\")";
mostCurrent._activity.LoadLayout("Cp_Menu_Post_Venta",mostCurrent.activityBA);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 31;BA.debugLine="If Frm_Documentos_Generados.Doc_Seleccionado Then";
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
 //BA.debugLineNum = 33;BA.debugLine="Dim Idmaeedo As Int = Frm_Documentos_Generados.I";
_idmaeedo = parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*int*/ ;
 //BA.debugLineNum = 35;BA.debugLine="Wait For(Sb_Ir_Al_Documento2(Idmaeedo)) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_ir_al_documento2(_idmaeedo));
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 37;BA.debugLine="Frm_Documentos_Generados.Doc_Seleccionado = Fals";
parent.mostCurrent._frm_documentos_generados._doc_seleccionado /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 38;BA.debugLine="Frm_Documentos_Generados.Idmaeedo_Sel = 0";
parent.mostCurrent._frm_documentos_generados._idmaeedo_sel /*int*/  = (int) (0);
 //BA.debugLineNum = 40;BA.debugLine="If Result Then";
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
 //BA.debugLineNum = 41;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
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
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _result) throws Exception{
}
public static void  _btn_buscar_documentos_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 71;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
parent.mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 73;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 75;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-deliv";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
 //BA.debugLineNum = 77;BA.debugLine="Msgbox2Async(\"SELECCIONE EL TIPO DE DOCUMENTO\",\"B";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("SELECCIONE EL TIPO DE DOCUMENTO"),BA.ObjectToCharSequence("Buscar documento"),"NOTA DE VENTA","","COTIZACION",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 78;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 80;BA.debugLine="Dim Tido As String";
_tido = "";
 //BA.debugLineNum = 82;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 83;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;
;
 //BA.debugLineNum = 86;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 87;BA.debugLine="Tido = \"COV\"";
_tido = "COV";
 if (true) break;
;
 //BA.debugLineNum = 90;BA.debugLine="If Tido = \"\" Then";

case 7:
//if
this.state = 10;
if ((_tido).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 91;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 94;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 96;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 97;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 98;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 99;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 101;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 103;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 105;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 106;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 107;BA.debugLine="Dialog.Title = \"Orden de compra\"";
_dialog._title /*Object*/  = (Object)("Orden de compra");
 //BA.debugLineNum = 109;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de document";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Número de documento a buscar"));
 //BA.debugLineNum = 110;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 112;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_numero = (Integer) result[0];
;
 //BA.debugLineNum = 113;BA.debugLine="If Numero <> xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 114;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 117;BA.debugLine="If InputTemplate.Text = \"\" Then";

case 14:
//if
this.state = 17;
if ((_inputtemplate._text /*String*/ ).equals("")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 118;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 119;BA.debugLine="Msgbox2Async(\"El número del documento no puede e";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El número del documento no puede estar vacío"),BA.ObjectToCharSequence("Validación"),"Okr","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 120;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 //BA.debugLineNum = 123;BA.debugLine="Wait For(Sb_Ir_Al_Documento(Tido,InputTemplate.Te";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_ir_al_documento(_tido,_inputtemplate._text /*String*/ ));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 125;BA.debugLine="If Resultado Then";
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
 //BA.debugLineNum = 126;BA.debugLine="StartActivity(Frm_Buscar_Documento)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_buscar_documento.getObject()));
 if (true) break;

case 21:
//C
this.state = -1;
;
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _btn_venta_click() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub Btn_Venta_Click";
 //BA.debugLineNum = 63;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = 0";
mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = (int) (0);
 //BA.debugLineNum = 64;BA.debugLine="Frm_Post_01_Formulario.Nuevo_Documento = True";
mostCurrent._frm_post_01_formulario._nuevo_documento /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 65;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_formulario.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _btn_ver_documentos_click() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Private Sub Btn_Ver_Documentos_Click";
 //BA.debugLineNum = 316;BA.debugLine="Frm_Post_01_Formulario.Grabar = False";
mostCurrent._frm_post_01_formulario._grabar /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 317;BA.debugLine="StartActivity(Frm_Documentos_Generados)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_documentos_generados.getObject()));
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim bmp1 As Bitmap";
mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Btn_Venta As Button";
mostCurrent._btn_venta = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Btn_Buscar_Documentos As Button";
mostCurrent._btn_buscar_documentos = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Btn_Ver_Documentos As Button";
mostCurrent._btn_ver_documentos = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_buscardoc(String _tido,String _nudo) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 228;BA.debugLine="Dim Row_Documento As Map";
_row_documento = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 229;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_documento /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_tido,_nudo);
 //BA.debugLineNum = 231;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 233;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 235;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 237;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 239;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 240;BA.debugLine="Row_Documento =Filas.Get(0)";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 243;BA.debugLine="Row_Documento = Null";
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
 //BA.debugLineNum = 247;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 248;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("518677782",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 251;BA.debugLine="Return Row_Documento";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_documento));return;};
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_buscardoc2(int _idmaeedo) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 257;BA.debugLine="Dim Row_Documento As Map";
_row_documento = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 258;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_documento2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_idmaeedo);
 //BA.debugLineNum = 260;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 262;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 264;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 266;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 268;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 269;BA.debugLine="Row_Documento =Filas.Get(0)";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 272;BA.debugLine="Row_Documento = Null";
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
 //BA.debugLineNum = 276;BA.debugLine="Row_Documento = Null";
_row_documento = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 277;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("518743318",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 280;BA.debugLine="Return Row_Documento";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_documento));return;};
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_fx_traerdatosentidad(String _koen,String _suen) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 286;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 287;BA.debugLine="Dim Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 289;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_menu_post_venta.getObject(),_koen,_suen);
 //BA.debugLineNum = 291;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 293;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 295;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 297;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 299;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 300;BA.debugLine="Row_Entidad =Filas.Get(0)";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 303;BA.debugLine="Row_Entidad = Null";
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
 //BA.debugLineNum = 307;BA.debugLine="Row_Entidad = Null";
_row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 308;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("518808856",_js._errormessage /*String*/ ,0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 311;BA.debugLine="Return Row_Entidad";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_row_entidad));return;};
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ir_al_documento(String _tido,String _nudo) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 134;BA.debugLine="Wait For( Sb_BuscarDoc(Tido,Nudo)) Complete (Docu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_buscardoc(_tido,_nudo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 136;BA.debugLine="If Documento = Null Then";
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
 //BA.debugLineNum = 137;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 140;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
_enviado = BA.ObjectToBoolean(_documento.Get((Object)("Enviado")));
 //BA.debugLineNum = 141;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
_error = BA.ObjectToString(_documento.Get((Object)("Error")));
 //BA.debugLineNum = 143;BA.debugLine="If Enviado = False Then";
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
 //BA.debugLineNum = 144;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 145;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 146;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 151;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_documento.Get((Object)("IDMAEEDO"))));
 //BA.debugLineNum = 152;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
_endo = BA.ObjectToString(_documento.Get((Object)("ENDO")));
 //BA.debugLineNum = 153;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
_suendo = BA.ObjectToString(_documento.Get((Object)("SUENDO")));
 //BA.debugLineNum = 154;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
_obseravacion = BA.ObjectToString(_documento.Get((Object)("OBDO")));
 //BA.debugLineNum = 155;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
_nroocc = BA.ObjectToString(_documento.Get((Object)("OCDO")));
 //BA.debugLineNum = 156;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
_kofuen = BA.ObjectToString(_documento.Get((Object)("KOFUDO")));
 //BA.debugLineNum = 157;BA.debugLine="Dim Para As String = Documento.Get(\"EMAILCOMER\")";
_para = BA.ObjectToString(_documento.Get((Object)("EMAILCOMER")));
 //BA.debugLineNum = 159;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
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
 //BA.debugLineNum = 160;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 161;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este documento es de otro usuario"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 162;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 165;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_buscar_documento._idmaeedo /*int*/  = _idmaeedo;
 //BA.debugLineNum = 166;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
parent.mostCurrent._frm_buscar_documento._koen /*String*/  = _endo;
 //BA.debugLineNum = 167;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
parent.mostCurrent._frm_buscar_documento._suen /*String*/  = _suendo;
 //BA.debugLineNum = 168;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
parent.mostCurrent._frm_buscar_documento._observaciones /*String*/  = _obseravacion;
 //BA.debugLineNum = 169;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
parent.mostCurrent._frm_buscar_documento._occ /*String*/  = _nroocc;
 //BA.debugLineNum = 170;BA.debugLine="Frm_Buscar_Documento.Para = Para";
parent.mostCurrent._frm_buscar_documento._para /*String*/  = _para;
 //BA.debugLineNum = 171;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
parent.mostCurrent._frm_buscar_documento._tido /*String*/  = _tido;
 //BA.debugLineNum = 172;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
parent.mostCurrent._frm_buscar_documento._nudo /*String*/  = _nudo;
 //BA.debugLineNum = 174;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ir_al_documento2(int _idmaeedo) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 180;BA.debugLine="Wait For( Sb_BuscarDoc2(Idmaeedo)) Complete (Docu";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_buscardoc2(_idmaeedo));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_documento = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 182;BA.debugLine="If Documento = Null Then";
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
 //BA.debugLineNum = 183;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 186;BA.debugLine="Dim Enviado As Boolean = Documento.Get(\"Enviado\")";
_enviado = BA.ObjectToBoolean(_documento.Get((Object)("Enviado")));
 //BA.debugLineNum = 187;BA.debugLine="Dim Error As String = Documento.Get(\"Error\")";
_error = BA.ObjectToString(_documento.Get((Object)("Error")));
 //BA.debugLineNum = 189;BA.debugLine="If Enviado = False Then";
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
 //BA.debugLineNum = 190;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 191;BA.debugLine="Msgbox2Async(Error,\"Validación\", \"Aceptar\",\"\",\"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 192;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 197;BA.debugLine="Dim Idmaeedo As Int = Documento.Get(\"IDMAEEDO\")";
_idmaeedo = (int)(BA.ObjectToNumber(_documento.Get((Object)("IDMAEEDO"))));
 //BA.debugLineNum = 198;BA.debugLine="Dim Tido As String = Documento.Get(\"TIDO\")";
_tido = BA.ObjectToString(_documento.Get((Object)("TIDO")));
 //BA.debugLineNum = 199;BA.debugLine="Dim Nudo As String = Documento.Get(\"NUDO\")";
_nudo = BA.ObjectToString(_documento.Get((Object)("NUDO")));
 //BA.debugLineNum = 200;BA.debugLine="Dim Endo As String = Documento.Get(\"ENDO\")";
_endo = BA.ObjectToString(_documento.Get((Object)("ENDO")));
 //BA.debugLineNum = 201;BA.debugLine="Dim Suendo As String = Documento.Get(\"SUENDO\")";
_suendo = BA.ObjectToString(_documento.Get((Object)("SUENDO")));
 //BA.debugLineNum = 202;BA.debugLine="Dim Obseravacion As String= Documento.Get(\"OBDO\")";
_obseravacion = BA.ObjectToString(_documento.Get((Object)("OBDO")));
 //BA.debugLineNum = 203;BA.debugLine="Dim NroOCC As String = Documento.Get(\"OCDO\")";
_nroocc = BA.ObjectToString(_documento.Get((Object)("OCDO")));
 //BA.debugLineNum = 204;BA.debugLine="Dim Kofuen As String = Documento.Get(\"KOFUDO\")";
_kofuen = BA.ObjectToString(_documento.Get((Object)("KOFUDO")));
 //BA.debugLineNum = 205;BA.debugLine="Dim Para As String =Documento.Get(\"EMAILCOMER\")";
_para = BA.ObjectToString(_documento.Get((Object)("EMAILCOMER")));
 //BA.debugLineNum = 207;BA.debugLine="If Kofuen <> Variables.Global_Row_Usuario_Activo.";
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
 //BA.debugLineNum = 208;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 209;BA.debugLine="Msgbox2Async(\"Este documento es de otro usuario\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este documento es de otro usuario"),BA.ObjectToCharSequence("Validación"),"Aceptar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 210;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 213;BA.debugLine="Frm_Buscar_Documento.Idmaeedo = Idmaeedo";
parent.mostCurrent._frm_buscar_documento._idmaeedo /*int*/  = _idmaeedo;
 //BA.debugLineNum = 214;BA.debugLine="Frm_Buscar_Documento.Koen = Endo";
parent.mostCurrent._frm_buscar_documento._koen /*String*/  = _endo;
 //BA.debugLineNum = 215;BA.debugLine="Frm_Buscar_Documento.Suen = Suendo";
parent.mostCurrent._frm_buscar_documento._suen /*String*/  = _suendo;
 //BA.debugLineNum = 216;BA.debugLine="Frm_Buscar_Documento.Observaciones = Obseravacion";
parent.mostCurrent._frm_buscar_documento._observaciones /*String*/  = _obseravacion;
 //BA.debugLineNum = 217;BA.debugLine="Frm_Buscar_Documento.OCC = NroOCC";
parent.mostCurrent._frm_buscar_documento._occ /*String*/  = _nroocc;
 //BA.debugLineNum = 218;BA.debugLine="Frm_Buscar_Documento.Para = Para";
parent.mostCurrent._frm_buscar_documento._para /*String*/  = _para;
 //BA.debugLineNum = 219;BA.debugLine="Frm_Buscar_Documento.Tido = Tido";
parent.mostCurrent._frm_buscar_documento._tido /*String*/  = _tido;
 //BA.debugLineNum = 220;BA.debugLine="Frm_Buscar_Documento.Nudo = Nudo";
parent.mostCurrent._frm_buscar_documento._nudo /*String*/  = _nudo;
 //BA.debugLineNum = 222;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_ver_documento(int _idmaeedo,String _koen,String _suen) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 322;BA.debugLine="Dim NewDoc As Crear_Documento";
_newdoc = new BaKapp.Movil.Tag.crear_documento();
 //BA.debugLineNum = 323;BA.debugLine="NewDoc.Initialize";
_newdoc._initialize /*String*/ (processBA);
 //BA.debugLineNum = 324;BA.debugLine="NewDoc.Idmaeedo = Idmaeedo";
_newdoc._idmaeedo /*int*/  = _idmaeedo;
 //BA.debugLineNum = 325;BA.debugLine="Wait For(NewDoc.Sb_Traer_Entidad(Koen,Suen)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _newdoc._sb_traer_entidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_koen,_suen));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rowentidad = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 327;BA.debugLine="If RowEntidad = Null Then";
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
 //BA.debugLineNum = 328;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 331;BA.debugLine="NewDoc.Row_Entidad = RowEntidad";
_newdoc._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = _rowentidad;
 //BA.debugLineNum = 333;BA.debugLine="Wait For(NewDoc.Sb_Nuevo_Documento) Complete (Id_";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _newdoc._sb_nuevo_documento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 10;
return;
case 10:
//C
this.state = 5;
_id_docenc = (Integer) result[0];
;
 //BA.debugLineNum = 335;BA.debugLine="If Id_DocEnc <> 0 Then";
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
 //BA.debugLineNum = 337;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 338;BA.debugLine="Msgbox2Async(\"Ahora puede editar el documento\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Ahora puede editar el documento"),BA.ObjectToCharSequence("Editar Documento"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 340;BA.debugLine="Frm_Post_01_Formulario.Id_DocEnc = Id_DocEnc";
parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/  = _id_docenc;
 //BA.debugLineNum = 341;BA.debugLine="StartActivity(Frm_Post_01_Formulario)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_formulario.getObject()));
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}
