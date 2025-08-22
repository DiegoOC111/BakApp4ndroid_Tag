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

public class frm_etiquetas extends Activity implements B4AActivity{
	public static frm_etiquetas mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_etiquetas");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_etiquetas).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_etiquetas");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_etiquetas", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_etiquetas) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_etiquetas) Resume **");
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
		return frm_etiquetas.class;
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
            BA.LogInfo("** Activity (frm_etiquetas) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_etiquetas) Pause event (activity is not paused). **");
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
            frm_etiquetas mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_etiquetas) Resume **");
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
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static anywheresoftware.b4a.objects.SocketWrapper _connectedprinter = null;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public static String _stringprecio = "";
public static anywheresoftware.b4a.objects.collections.List _etiquetas = null;
public static String _default = "";
public anywheresoftware.b4a.objects.collections.Map _printermap = null;
public anywheresoftware.b4a.objects.ListViewWrapper _printerlist = null;
public static String _selectedprinterip = "";
public anywheresoftware.b4a.objects.collections.Map _datos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static boolean _isenabled = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_conf = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_cerrar = null;
public anywheresoftware.b4a.objects.PanelWrapper _general = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_conf = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_etq1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_etq2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_venta = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_bodega = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_ed_nombre = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_ed_id = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nombre = null;
public anywheresoftware.b4a.objects.collections.List _stringlistprice = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_estado = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_probar_conexion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_imprimir = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_ip = null;
public b4a.example3.customlistview _clv = null;
public static int _colorenabled = 0;
public static int _colordisabled = 0;
public static int _selectedprice = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_guardar = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.collections.List _dataprice = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_ed_precio = null;
public static boolean _changes = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_volver = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_precio_act = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_puerto = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_editarpuerto = null;
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
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.frm_etiquetas parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
boolean _firsttime;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result5 = 0;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _p = null;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;
anywheresoftware.b4a.BA.IterableList group24;
int index24;
int groupLen24;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Activity.LoadLayout(\"Etiqueta_men\")";
parent.mostCurrent._activity.LoadLayout("Etiqueta_men",mostCurrent.activityBA);
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="Changes = False";
parent._changes = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Dim Js As HttpJob = Sb_BuscarListaPrecios(Me)";
_js = _sb_buscarlistaprecios(frm_etiquetas.getObject());
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "activity_create"), (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=12910608;
 //BA.debugLineNum = 12910608;BA.debugLine="Msgbox2Async(\"Error al buscar la lista de preci";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar la lista de precios."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12910609;
 //BA.debugLineNum = 12910609;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "activity_create"), null);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=12910611;
 //BA.debugLineNum = 12910611;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=12910615;
 //BA.debugLineNum = 12910615;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=12910618;
 //BA.debugLineNum = 12910618;BA.debugLine="DataPrice = ParseOtherPriceJSON(vJson)";
parent.mostCurrent._dataprice = _parseotherpricejson(_vjson);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=12910621;
 //BA.debugLineNum = 12910621;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=12910622;
 //BA.debugLineNum = 12910622;BA.debugLine="Msgbox2Async(\"Error al comunicarse con la base d";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al comunicarse con la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12910623;
 //BA.debugLineNum = 12910623;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "activity_create"), null);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=12910624;
 //BA.debugLineNum = 12910624;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=12910631;
 //BA.debugLineNum = 12910631;BA.debugLine="stringListPrice.Initialize";
parent.mostCurrent._stringlistprice.Initialize();
RDebugUtils.currentLine=12910632;
 //BA.debugLineNum = 12910632;BA.debugLine="For Each p As OtherPriceData In DataPrice";
if (true) break;

case 15:
//for
this.state = 18;
group24 = parent.mostCurrent._dataprice;
index24 = 0;
groupLen24 = group24.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 18;
if (index24 < groupLen24) {
this.state = 17;
_p = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(group24.Get(index24));}
if (true) break;

case 23:
//C
this.state = 22;
index24++;
if (true) break;

case 17:
//C
this.state = 23;
RDebugUtils.currentLine=12910633;
 //BA.debugLineNum = 12910633;BA.debugLine="stringListPrice.Add(p.KOLT &\" | \"& p.NOKOLT)";
parent.mostCurrent._stringlistprice.Add((Object)(_p.KOLT /*String*/ +" | "+_p.NOKOLT /*String*/ ));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=12910635;
 //BA.debugLineNum = 12910635;BA.debugLine="SelectedPrice = 0";
parent._selectedprice = (int) (0);
RDebugUtils.currentLine=12910636;
 //BA.debugLineNum = 12910636;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(parent.mostCurrent._dataprice.Get(parent._selectedprice));
RDebugUtils.currentLine=12910637;
 //BA.debugLineNum = 12910637;BA.debugLine="stringPrecio = aux.KOLT";
parent._stringprecio = _aux.KOLT /*String*/ ;
RDebugUtils.currentLine=12910638;
 //BA.debugLineNum = 12910638;BA.debugLine="LeerDatos";
_leerdatos();
RDebugUtils.currentLine=12910639;
 //BA.debugLineNum = 12910639;BA.debugLine="CargarLista";
_cargarlista();
RDebugUtils.currentLine=12910644;
 //BA.debugLineNum = 12910644;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static BaKapp.Movil.Tag.httpjob  _sb_buscarlistaprecios(Object _me_) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_buscarlistaprecios", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_buscarlistaprecios", new Object[] {_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>");
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=13041676;
 //BA.debugLineNum = 13041676;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=13041677;
 //BA.debugLineNum = 13041677;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_BuscarListaPrecios\""));
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _parseotherpricejson(String _json) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parseotherpricejson", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(mostCurrent.activityBA, "parseotherpricejson", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _data = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="Dim data As OtherPriceData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherpricedata();
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
_data.TILT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TILT")));
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
_data.KOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOLT")));
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
_data.MELT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MELT")));
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
_data.MOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MOLT")));
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
_data.TIMOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TIMOLT")));
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
_data.NOKOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("NOKOLT")));
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
if (_entry.ContainsKey((Object)("FEVI")) && _entry.Get((Object)("FEVI"))!= null) { 
RDebugUtils.currentLine=12976148;
 //BA.debugLineNum = 12976148;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
_data.FEVI /*String*/  = BA.ObjectToString(_entry.Get((Object)("FEVI")));
 }else {
RDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="data.FEVI = \"\"";
_data.FEVI /*String*/  = "";
 };
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
_data.OPERA /*String*/  = BA.ObjectToString(_entry.Get((Object)("OPERA")));
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
_data.ECUDEF01UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF01UD")));
RDebugUtils.currentLine=12976155;
 //BA.debugLineNum = 12976155;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
_data.ECUDEF02UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF02UD")));
RDebugUtils.currentLine=12976157;
 //BA.debugLineNum = 12976157;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
RDebugUtils.currentLine=12976160;
 //BA.debugLineNum = 12976160;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="End Sub";
return null;
}
public static String  _leerdatos() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "leerdatos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "leerdatos", null));}
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub LeerDatos()";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map")) { 
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
mostCurrent._datos = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map");
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Lbl_IP.Text = datos.Get(\"Ip\")";
mostCurrent._lbl_ip.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Ip"))));
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Lbl_Nombre.Text = datos.Get(\"Nombre\")";
mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Nombre"))));
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Lbl_precio_act.Text =  datos.Get(\"KOLT\")  &\"|\"&";
mostCurrent._lbl_precio_act.setText(BA.ObjectToCharSequence(BA.ObjectToString(mostCurrent._datos.Get((Object)("KOLT")))+"|"+BA.ObjectToString(mostCurrent._datos.Get((Object)("NOKOLT")))));
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Select";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(mostCurrent._dataprice.Get(_selectedprice));
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="SelectedPrice = datos.Get(\"Seleccionado\")";
_selectedprice = (int)(BA.ObjectToNumber(mostCurrent._datos.Get((Object)("Seleccionado"))));
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="stringPrecio = aux.KOLT";
_stringprecio = _aux.KOLT /*String*/ ;
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Lbl_puerto.Text = datos.Get(\"Puerto\")";
mostCurrent._lbl_puerto.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Puerto"))));
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="Msgbox2Async(\"Se encontro la configuración de im";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se encontro la configuración de impresora"),BA.ObjectToCharSequence("Impresora encontrada"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="Btn_Etq1.Enabled=True";
mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13434894;
 //BA.debugLineNum = 13434894;BA.debugLine="Lbl_Imprimir.Visible = False";
mostCurrent._lbl_imprimir.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=13434897;
 //BA.debugLineNum = 13434897;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=13434898;
 //BA.debugLineNum = 13434898;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora."),BA.ObjectToCharSequence("Alerta"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13434899;
 //BA.debugLineNum = 13434899;BA.debugLine="Btn_Conf_Click";
_btn_conf_click();
RDebugUtils.currentLine=13434900;
 //BA.debugLineNum = 13434900;BA.debugLine="Btn_Cerrar.Enabled = False";
mostCurrent._btn_cerrar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13434902;
 //BA.debugLineNum = 13434902;BA.debugLine="Log(\"El archivo no existe.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("613434902","El archivo no existe.",0);
RDebugUtils.currentLine=13434903;
 //BA.debugLineNum = 13434903;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
mostCurrent._datos.Initialize();
 };
RDebugUtils.currentLine=13434911;
 //BA.debugLineNum = 13434911;BA.debugLine="End Sub";
return "";
}
public static void  _cargarlista() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarlista", false))
	 {Debug.delegate(mostCurrent.activityBA, "cargarlista", null); return;}
ResumableSub_CargarLista rsub = new ResumableSub_CargarLista(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CargarLista extends BA.ResumableSub {
public ResumableSub_CargarLista(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
anywheresoftware.b4a.objects.collections.List _listapersonas = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result5 = 0;
BaKapp.Movil.Tag.frm_impresion._etiqueta _et = null;
BaKapp.Movil.Tag.httpjob _job = null;
float _ancho = 0f;
float _alto = 0f;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
BaKapp.Movil.Tag.httpjob _j = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.collections.Map _etiqueta = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group64;
int index64;
int groupLen64;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="ProgressDialogShow2(\"Cargando etiquetas\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Cargando etiquetas"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="clv.Clear";
parent.mostCurrent._clv._clear();
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim ListaPersonas As List";
_listapersonas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="ListaPersonas.Initialize";
_listapersonas.Initialize();
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="Dim Js As HttpJob = Sb_TraerEtiquetas(Me)";
_js = _sb_traeretiquetas(frm_etiquetas.getObject());
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 34;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 29;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="Msgbox2Async(\"No hay etiquetas de tipo '(Movil)";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No hay etiquetas de tipo '(Movil)' en la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13238294;
 //BA.debugLineNum = 13238294;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), null);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="If(Result5 = DialogResponse.POSITIVE)Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=13238298;
 //BA.debugLineNum = 13238298;BA.debugLine="Btn_Etq1.Enabled = False";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=13238301;
 //BA.debugLineNum = 13238301;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=13238304;
 //BA.debugLineNum = 13238304;BA.debugLine="Etiquetas = ParseEtiquetas(vJson)";
parent._etiquetas = _parseetiquetas(_vjson);
RDebugUtils.currentLine=13238306;
 //BA.debugLineNum = 13238306;BA.debugLine="For Each ET As Etiqueta In Etiquetas";
if (true) break;

case 12:
//for
this.state = 27;
group21 = parent._etiquetas;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 40;
if (true) break;

case 40:
//C
this.state = 27;
if (index21 < groupLen21) {
this.state = 14;
_et = (BaKapp.Movil.Tag.frm_impresion._etiqueta)(group21.Get(index21));}
if (true) break;

case 41:
//C
this.state = 40;
index21++;
if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=13238307;
 //BA.debugLineNum = 13238307;BA.debugLine="Dim job As HttpJob";
_job = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=13238308;
 //BA.debugLineNum = 13238308;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,processBA,"",frm_etiquetas.getObject());
RDebugUtils.currentLine=13238311;
 //BA.debugLineNum = 13238311;BA.debugLine="Dim Ancho, Alto As Float";
_ancho = 0f;
_alto = 0f;
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\d+)[xX](\\d+";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("(\\d+)[xX](\\d+)",_et.NombreEtiqueta /*String*/ );
RDebugUtils.currentLine=13238314;
 //BA.debugLineNum = 13238314;BA.debugLine="If m.Find Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_m.Find()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=13238315;
 //BA.debugLineNum = 13238315;BA.debugLine="Ancho = m.Group(1)";
_ancho = (float)(Double.parseDouble(_m.Group((int) (1))));
RDebugUtils.currentLine=13238316;
 //BA.debugLineNum = 13238316;BA.debugLine="Alto = m.Group(2)";
_alto = (float)(Double.parseDouble(_m.Group((int) (2))));
RDebugUtils.currentLine=13238317;
 //BA.debugLineNum = 13238317;BA.debugLine="Ancho = Ancho / 2.54";
_ancho = (float) (_ancho/(double)2.54);
RDebugUtils.currentLine=13238318;
 //BA.debugLineNum = 13238318;BA.debugLine="Alto = Alto / 2.54";
_alto = (float) (_alto/(double)2.54);
RDebugUtils.currentLine=13238319;
 //BA.debugLineNum = 13238319;BA.debugLine="Ancho = NumberFormat2(Ancho, 1, 2, 2, False)";
_ancho = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat2(_ancho,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)));
RDebugUtils.currentLine=13238320;
 //BA.debugLineNum = 13238320;BA.debugLine="Alto = NumberFormat2(Alto, 1, 2, 2, False)";
_alto = (float)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.NumberFormat2(_alto,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)));
RDebugUtils.currentLine=13238321;
 //BA.debugLineNum = 13238321;BA.debugLine="Log(\"Ancho: \" & Ancho)";
anywheresoftware.b4a.keywords.Common.LogImpl("613238321","Ancho: "+BA.NumberToString(_ancho),0);
RDebugUtils.currentLine=13238322;
 //BA.debugLineNum = 13238322;BA.debugLine="Log(\"Alto: \" & Alto)";
anywheresoftware.b4a.keywords.Common.LogImpl("613238322","Alto: "+BA.NumberToString(_alto),0);
RDebugUtils.currentLine=13238323;
 //BA.debugLineNum = 13238323;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/p";
_job._poststring /*String*/ (null,("https://api.labelary.com/v1/printers/8dpmm/labels/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alto))+"x"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ancho))+"/0/"),_et.FUNCION /*String*/ );
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=13238325;
 //BA.debugLineNum = 13238325;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/p";
_job._poststring /*String*/ (null,("https://api.labelary.com/v1/printers/8dpmm/labels/2x5/0/"),_et.FUNCION /*String*/ );
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=13238329;
 //BA.debugLineNum = 13238329;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"image/png\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","image/png");
RDebugUtils.currentLine=13238331;
 //BA.debugLineNum = 13238331;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), (Object)(_job));
this.state = 42;
return;
case 42:
//C
this.state = 21;
_j = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=13238332;
 //BA.debugLineNum = 13238332;BA.debugLine="If j.Success Then";
if (true) break;

case 21:
//if
this.state = 26;
if (_j._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=13238333;
 //BA.debugLineNum = 13238333;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=13238334;
 //BA.debugLineNum = 13238334;BA.debugLine="Dim Etiqueta As Map";
_etiqueta = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238335;
 //BA.debugLineNum = 13238335;BA.debugLine="Etiqueta.Initialize";
_etiqueta.Initialize();
RDebugUtils.currentLine=13238336;
 //BA.debugLineNum = 13238336;BA.debugLine="Etiqueta.Put(\"tipo\", ET.NombreEtiqueta)";
_etiqueta.Put((Object)("tipo"),(Object)(_et.NombreEtiqueta /*String*/ ));
RDebugUtils.currentLine=13238337;
 //BA.debugLineNum = 13238337;BA.debugLine="Etiqueta.Put(\"imagen\", bmp)";
_etiqueta.Put((Object)("imagen"),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=13238340;
 //BA.debugLineNum = 13238340;BA.debugLine="ListaPersonas.Add(Etiqueta)";
_listapersonas.Add((Object)(_etiqueta.getObject()));
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=13238343;
 //BA.debugLineNum = 13238343;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("613238343","Error: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=13238344;
 //BA.debugLineNum = 13238344;BA.debugLine="ToastMessageShow(\"No se pudo generar la etique";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se pudo generar la etiqueta"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 26:
//C
this.state = 41;
;
RDebugUtils.currentLine=13238346;
 //BA.debugLineNum = 13238346;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 34;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=13238351;
 //BA.debugLineNum = 13238351;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=13238352;
 //BA.debugLineNum = 13238352;BA.debugLine="Msgbox2Async(\"Error al traer las etiquetas.\", \"E";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al traer las etiquetas."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13238353;
 //BA.debugLineNum = 13238353;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), null);
this.state = 43;
return;
case 43:
//C
this.state = 30;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=13238354;
 //BA.debugLineNum = 13238354;BA.debugLine="If(Result5 = DialogResponse.POSITIVE)Then";
if (true) break;

case 30:
//if
this.state = 33;
if ((_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=13238355;
 //BA.debugLineNum = 13238355;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13238357;
 //BA.debugLineNum = 13238357;BA.debugLine="Btn_Etq1.Enabled = False";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=13238360;
 //BA.debugLineNum = 13238360;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=13238363;
 //BA.debugLineNum = 13238363;BA.debugLine="For Each Etiqueta As Map In ListaPersonas";

case 34:
//for
this.state = 37;
_etiqueta = new anywheresoftware.b4a.objects.collections.Map();
group64 = _listapersonas;
index64 = 0;
groupLen64 = group64.getSize();
this.state = 44;
if (true) break;

case 44:
//C
this.state = 37;
if (index64 < groupLen64) {
this.state = 36;
_etiqueta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group64.Get(index64)));}
if (true) break;

case 45:
//C
this.state = 44;
index64++;
if (true) break;

case 36:
//C
this.state = 45;
RDebugUtils.currentLine=13238364;
 //BA.debugLineNum = 13238364;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._xui.CreatePanel(processBA,"").getObject()));
RDebugUtils.currentLine=13238365;
 //BA.debugLineNum = 13238365;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clv.AsView.Width, 2";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.mostCurrent._clv._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
RDebugUtils.currentLine=13238366;
 //BA.debugLineNum = 13238366;BA.debugLine="p.LoadLayout(\"item_nombre_imagen\")";
_p.LoadLayout("item_nombre_imagen",mostCurrent.activityBA);
RDebugUtils.currentLine=13238369;
 //BA.debugLineNum = 13238369;BA.debugLine="Dim lbl As Label = p.GetView(0) ' primer control";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=13238370;
 //BA.debugLineNum = 13238370;BA.debugLine="Dim img As ImageView = p.GetView(1) ' segundo co";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=13238372;
 //BA.debugLineNum = 13238372;BA.debugLine="lbl.Text = Etiqueta.Get(\"tipo\")";
_lbl.setText(BA.ObjectToCharSequence(_etiqueta.Get((Object)("tipo"))));
RDebugUtils.currentLine=13238373;
 //BA.debugLineNum = 13238373;BA.debugLine="img.Bitmap = Etiqueta.Get(\"imagen\")";
_img.setBitmap((android.graphics.Bitmap)(_etiqueta.Get((Object)("imagen"))));
RDebugUtils.currentLine=13238375;
 //BA.debugLineNum = 13238375;BA.debugLine="clv.Add(p, Etiqueta.Get(\"tipo\"))";
parent.mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),_etiqueta.Get((Object)("tipo")));
 if (true) break;
if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=13238378;
 //BA.debugLineNum = 13238378;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13238379;
 //BA.debugLineNum = 13238379;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cerrar_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cerrar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cerrar_click", null));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Private Sub Btn_Cerrar_Click";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="General.Visible= True";
mostCurrent._general.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Panel_Conf.Visible = False";
mostCurrent._panel_conf.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="End Sub";
return "";
}
public static String  _btn_conf_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_conf_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_conf_click", null));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub Btn_Conf_Click";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="General.Visible= False";
mostCurrent._general.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
mostCurrent._btn_guardar.setColor(_colorenabled);
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="IsEnabled = False";
_isenabled = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Panel_Conf.Visible = True";
mostCurrent._panel_conf.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="End Sub";
return "";
}
public static void  _btn_ed_id_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ed_id_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_ed_id_click", null); return;}
ResumableSub_Btn_Ed_ID_Click rsub = new ResumableSub_Btn_Ed_ID_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Ed_ID_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ed_ID_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese la ip\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese la ip"));
RDebugUtils.currentLine=13893646;
 //BA.debugLineNum = 13893646;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_ed_id_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=13893650;
 //BA.debugLineNum = 13893650;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13893651;
 //BA.debugLineNum = 13893651;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13893653;
 //BA.debugLineNum = 13893653;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=13893654;
 //BA.debugLineNum = 13893654;BA.debugLine="Lbl_IP.Text = InputTemplate.Text";
parent.mostCurrent._lbl_ip.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=13893656;
 //BA.debugLineNum = 13893656;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_ed_nombre_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ed_nombre_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_ed_nombre_click", null); return;}
ResumableSub_Btn_Ed_Nombre_Click rsub = new ResumableSub_Btn_Ed_Nombre_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Ed_Nombre_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ed_Nombre_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=13959182;
 //BA.debugLineNum = 13959182;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el nombre\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese el nombre"));
RDebugUtils.currentLine=13959183;
 //BA.debugLineNum = 13959183;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=13959185;
 //BA.debugLineNum = 13959185;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_ed_nombre_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=13959186;
 //BA.debugLineNum = 13959186;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13959187;
 //BA.debugLineNum = 13959187;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=13959189;
 //BA.debugLineNum = 13959189;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=13959190;
 //BA.debugLineNum = 13959190;BA.debugLine="Lbl_Nombre.Text = InputTemplate.Text";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=13959191;
 //BA.debugLineNum = 13959191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_ed_precio_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ed_precio_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_ed_precio_click", null); return;}
ResumableSub_Btn_Ed_Precio_Click rsub = new ResumableSub_Btn_Ed_Precio_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Ed_Precio_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ed_Precio_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
int _index = 0;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="InputListAsync(stringListPrice, \"Seleccione preci";
anywheresoftware.b4a.keywords.Common.InputListAsync(parent.mostCurrent._stringlistprice,BA.ObjectToCharSequence("Seleccione precio "),parent._selectedprice,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Wait For InputList_Result (Index As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_ed_precio_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_index = (Integer) result[0];
;
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="If Index <> DialogResponse.CANCEL Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_index!=anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="SelectedPrice = Index";
parent._selectedprice = _index;
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="Dim  aux As OtherPriceData = DataPrice.Get(Index";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(parent.mostCurrent._dataprice.Get(_index));
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="stringPrecio = aux.KOLT&\"|\"&aux.NOKOLT";
parent._stringprecio = _aux.KOLT /*String*/ +"|"+_aux.NOKOLT /*String*/ ;
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="Lbl_precio_act.Text = stringPrecio";
parent.mostCurrent._lbl_precio_act.setText(BA.ObjectToCharSequence(parent._stringprecio));
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14221324;
 //BA.debugLineNum = 14221324;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_editarpuerto_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_editarpuerto_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_editarpuerto_click", null); return;}
ResumableSub_Btn_editarPuerto_Click rsub = new ResumableSub_Btn_editarPuerto_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_editarPuerto_Click extends BA.ResumableSub {
public ResumableSub_Btn_editarPuerto_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="dialog.Initialize(Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el puerto\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese el puerto"));
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="If (Lbl_puerto.Text <> Null) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._lbl_puerto.getText()!= null)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="InputTemplate.Text = Lbl_puerto.Text";
_inputtemplate._text /*String*/  = parent.mostCurrent._lbl_puerto.getText();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=14352397;
 //BA.debugLineNum = 14352397;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=14352401;
 //BA.debugLineNum = 14352401;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14352403;
 //BA.debugLineNum = 14352403;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"Gua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_editarpuerto_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("Guardar"),(Object)("Por defecto"),(Object)("Cancel")));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=14352405;
 //BA.debugLineNum = 14352405;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=14352407;
 //BA.debugLineNum = 14352407;BA.debugLine="If(Res = DialogResponse.NEGATIVE) Then";

case 10:
//if
this.state = 13;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=14352408;
 //BA.debugLineNum = 14352408;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=14352409;
 //BA.debugLineNum = 14352409;BA.debugLine="Lbl_puerto.Text = 9100";
parent.mostCurrent._lbl_puerto.setText(BA.ObjectToCharSequence(9100));
 if (true) break;
;
RDebugUtils.currentLine=14352411;
 //BA.debugLineNum = 14352411;BA.debugLine="If(Res = DialogResponse.POSITIVE) Then";

case 13:
//if
this.state = 16;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=14352412;
 //BA.debugLineNum = 14352412;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=14352413;
 //BA.debugLineNum = 14352413;BA.debugLine="Lbl_puerto.Text = InputTemplate.Text";
parent.mostCurrent._lbl_puerto.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=14352418;
 //BA.debugLineNum = 14352418;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_etq1_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_etq1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_etq1_click", null));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub Btn_Etq1_Click";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="StartActivity(Frm_impresion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_impresion.getObject()));
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="End Sub";
return "";
}
public static String  _btn_etq2_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_etq2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_etq2_click", null));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub Btn_Etq2_Click";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="StartActivity(Frm_impresion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_impresion.getObject()));
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="End Sub";
return "";
}
public static void  _btn_guardar_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_guardar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_guardar_click", null); return;}
ResumableSub_Btn_Guardar_Click rsub = new ResumableSub_Btn_Guardar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Guardar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Guardar_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
boolean _result1 = false;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Wait For (Btn_Probar_Conexion_Click) Complete (Re";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), _btn_probar_conexion_click());
this.state = 27;
return;
case 27:
//C
this.state = 1;
_result1 = (Boolean) result[0];
;
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="If IsEnabled Then";
if (true) break;

case 1:
//if
this.state = 26;
if (parent._isenabled) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"save.png");
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="Msgbox2Async(\"¿Desea guardar la configuración ac";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Desea guardar la configuración actual?"),BA.ObjectToCharSequence("Configuración local"),"Si","No","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 25;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="If Lbl_puerto.Text <> \"---\" Then";
if (true) break;

case 7:
//if
this.state = 24;
if ((parent.mostCurrent._lbl_puerto.getText()).equals("---") == false) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=14155787;
 //BA.debugLineNum = 14155787;BA.debugLine="If Lbl_IP.Text <> \"---\" Then";
if (true) break;

case 10:
//if
this.state = 21;
if ((parent.mostCurrent._lbl_ip.getText()).equals("---") == false) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="If Lbl_Nombre.Text <> \"---\" Then";
if (true) break;

case 13:
//if
this.state = 18;
if ((parent.mostCurrent._lbl_nombre.getText()).equals("---") == false) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=14155790;
 //BA.debugLineNum = 14155790;BA.debugLine="CrearDatos";
_creardatos();
RDebugUtils.currentLine=14155791;
 //BA.debugLineNum = 14155791;BA.debugLine="Btn_Etq1.Enabled = True";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14155792;
 //BA.debugLineNum = 14155792;BA.debugLine="Lbl_Imprimir.Visible = False";
parent.mostCurrent._lbl_imprimir.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155793;
 //BA.debugLineNum = 14155793;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14155794;
 //BA.debugLineNum = 14155794;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.p";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=14155795;
 //BA.debugLineNum = 14155795;BA.debugLine="Msgbox2Async(\"Datos guardados correctamente\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Datos guardados correctamente"),BA.ObjectToCharSequence("Configuración Impresora"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155796;
 //BA.debugLineNum = 14155796;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 29;
return;
case 29:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14155797;
 //BA.debugLineNum = 14155797;BA.debugLine="Btn_Cerrar_Click";
_btn_cerrar_click();
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=14155799;
 //BA.debugLineNum = 14155799;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14155800;
 //BA.debugLineNum = 14155800;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-d";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=14155801;
 //BA.debugLineNum = 14155801;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, asigne un nombre"),BA.ObjectToCharSequence("Configuración Impresora"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155802;
 //BA.debugLineNum = 14155802;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 30;
return;
case 30:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14155803;
 //BA.debugLineNum = 14155803;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=14155806;
 //BA.debugLineNum = 14155806;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14155807;
 //BA.debugLineNum = 14155807;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=14155808;
 //BA.debugLineNum = 14155808;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne una ip"),BA.ObjectToCharSequence("Configuración Impresora "),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155809;
 //BA.debugLineNum = 14155809;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14155810;
 //BA.debugLineNum = 14155810;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=14155813;
 //BA.debugLineNum = 14155813;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14155814;
 //BA.debugLineNum = 14155814;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=14155815;
 //BA.debugLineNum = 14155815;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne un puerto"),BA.ObjectToCharSequence("Configuración Impresora "),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155816;
 //BA.debugLineNum = 14155816;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14155817;
 //BA.debugLineNum = 14155817;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=14155822;
 //BA.debugLineNum = 14155822;BA.debugLine="Btn_Cerrar.Enabled = True";
parent.mostCurrent._btn_cerrar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14155823;
 //BA.debugLineNum = 14155823;BA.debugLine="Btn_Etq1.Enabled = True";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14155825;
 //BA.debugLineNum = 14155825;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=14155827;
 //BA.debugLineNum = 14155827;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14155828;
 //BA.debugLineNum = 14155828;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=14155829;
 //BA.debugLineNum = 14155829;BA.debugLine="Msgbox2Async(\"Antes de guardar una configuración";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Antes de guardar una configuración se debe de probar conexión"),BA.ObjectToCharSequence("Configuración local"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155830;
 //BA.debugLineNum = 14155830;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 33;
return;
case 33:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14155832;
 //BA.debugLineNum = 14155832;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _btn_probar_conexion_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_probar_conexion_click", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "btn_probar_conexion_click", null));}
ResumableSub_Btn_Probar_Conexion_Click rsub = new ResumableSub_Btn_Probar_Conexion_Click(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Btn_Probar_Conexion_Click extends BA.ResumableSub {
public ResumableSub_Btn_Probar_Conexion_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14024716;
 //BA.debugLineNum = 14024716;BA.debugLine="If Ping(Lbl_IP.Text) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_ping(parent.mostCurrent._lbl_ip.getText())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14024717;
 //BA.debugLineNum = 14024717;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14024718;
 //BA.debugLineNum = 14024718;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=14024719;
 //BA.debugLineNum = 14024719;BA.debugLine="Msgbox2Async(\"Conexión exitosa\" , \"Notificación\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexión exitosa"),BA.ObjectToCharSequence("Notificación"),"Aceptar","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14024720;
 //BA.debugLineNum = 14024720;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_probar_conexion_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14024722;
 //BA.debugLineNum = 14024722;BA.debugLine="IsEnabled = True";
parent._isenabled = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=14024723;
 //BA.debugLineNum = 14024723;BA.debugLine="Changes = False";
parent._changes = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=14024724;
 //BA.debugLineNum = 14024724;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
parent.mostCurrent._btn_guardar.setColor(parent._colorenabled);
RDebugUtils.currentLine=14024725;
 //BA.debugLineNum = 14024725;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14024727;
 //BA.debugLineNum = 14024727;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14024728;
 //BA.debugLineNum = 14024728;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=14024729;
 //BA.debugLineNum = 14024729;BA.debugLine="Msgbox2Async(\"Conexión Fallida\" , \"Notificación\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexión Fallida"),BA.ObjectToCharSequence("Notificación"),"Aceptar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14024730;
 //BA.debugLineNum = 14024730;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_probar_conexion_click"), null);
this.state = 6;
return;
case 6:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=14024731;
 //BA.debugLineNum = 14024731;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=14024733;
 //BA.debugLineNum = 14024733;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _creardatos() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creardatos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creardatos", null));}
String _iptext = "";
int _ipint = 0;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;
String _stringnoprecio = "";
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub CrearDatos()";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim datos As Map";
mostCurrent._datos = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="datos.Initialize";
mostCurrent._datos.Initialize();
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="datos.Put(\"Ip\",Lbl_IP.Text )";
mostCurrent._datos.Put((Object)("Ip"),(Object)(mostCurrent._lbl_ip.getText()));
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="datos.Put(\"Nombre\", Lbl_Nombre.Text )";
mostCurrent._datos.Put((Object)("Nombre"),(Object)(mostCurrent._lbl_nombre.getText()));
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="datos.Put(\"Seleccionado\", SelectedPrice)";
mostCurrent._datos.Put((Object)("Seleccionado"),(Object)(_selectedprice));
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Dim ipText As String = Lbl_puerto.Text";
_iptext = mostCurrent._lbl_puerto.getText();
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="Dim IpINT As Int =  ipText";
_ipint = (int)(Double.parseDouble(_iptext));
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="datos.Put(\"Puerto\", IpINT)";
mostCurrent._datos.Put((Object)("Puerto"),(Object)(_ipint));
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(mostCurrent._dataprice.Get(_selectedprice));
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="stringPrecio = aux.KOLT";
_stringprecio = _aux.KOLT /*String*/ ;
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="Dim stringNoPrecio As String  = aux.NOKOLT";
_stringnoprecio = _aux.NOKOLT /*String*/ ;
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="datos.Put(\"KOLT\",stringPrecio )";
mostCurrent._datos.Put((Object)("KOLT"),(Object)(_stringprecio));
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="datos.Put(\"NOKOLT\",stringNoPrecio )";
mostCurrent._datos.Put((Object)("NOKOLT"),(Object)(_stringnoprecio));
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="File.WriteMap(File.DirInternal, \"impresora.map\",";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map",mostCurrent._datos);
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="End Sub";
return "";
}
public static boolean  _ping(String _ip) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ping", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "ping", new Object[] {_ip}));}
anywheresoftware.b4a.phone.Phone _p = null;
int _r = 0;
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub Ping(IP As String) As Boolean";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Try";
try {RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Dim r As Int = p.Shell(\"ping -c 1 -w 1 \" & IP, N";
_r = _p.Shell("ping -c 1 -w 1 "+_ip,(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="Return (r = 0)  ' Si el ping es exitoso, devuelv";
if (true) return (_r==0);
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="End Sub";
return false;
}
public static String  _btn_volver_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_volver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_volver_click", null));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub Btn_Volver_Click";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _sb_traeretiquetas(Object _me_) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_traeretiquetas", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_traeretiquetas", new Object[] {_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub Sb_TraerEtiquetas(Me_ As Object) As Ht";
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_TraerEtiquetas xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>\n"+"");
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=13303821;
 //BA.debugLineNum = 13303821;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=13303822;
 //BA.debugLineNum = 13303822;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=13303823;
 //BA.debugLineNum = 13303823;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=13303824;
 //BA.debugLineNum = 13303824;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_TraerEtiquetas\""));
RDebugUtils.currentLine=13303825;
 //BA.debugLineNum = 13303825;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=13303827;
 //BA.debugLineNum = 13303827;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _parseetiquetas(String _json) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "parseetiquetas", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(mostCurrent.activityBA, "parseetiquetas", new Object[] {_json}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._etiqueta _data = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub ParseEtiquetas(Json As String ) As List";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="parser.Initialize(Json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="Dim data As Etiqueta";
_data = new BaKapp.Movil.Tag.frm_impresion._etiqueta();
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="data.NombreEtiqueta = entry.Get(\"NombreEtiqueta\"";
_data.NombreEtiqueta /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreEtiqueta")));
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="data.FUNCION = entry.Get(\"FUNCION\")";
_data.FUNCION /*String*/  = BA.ObjectToString(_entry.Get((Object)("FUNCION")));
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=13369364;
 //BA.debugLineNum = 13369364;BA.debugLine="End Sub";
return null;
}
public static void  _clv_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "clv_itemclick", new Object[] {_index,_value}); return;}
ResumableSub_clv_ItemClick rsub = new ResumableSub_clv_ItemClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_clv_ItemClick extends BA.ResumableSub {
public ResumableSub_clv_ItemClick(BaKapp.Movil.Tag.frm_etiquetas parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
int _index;
Object _value;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result5 = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="Msgbox2Async(\"Etiqueta seleccionada: \"&Value , \"C";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Etiqueta seleccionada: "+BA.ObjectToString(_value)),BA.ObjectToCharSequence("Confirmación de etiqueta"),"Seleccionar","","Cancelar",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "clv_itemclick"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="default = Value";
parent._default = BA.ObjectToString(_value);
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="ToastMessageShow(\"La etiqueta \"&default& \"Design";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("La etiqueta "+parent._default+"Designada para impresión"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="Btn_Etq1_Click";
_btn_etq1_click();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=14417933;
 //BA.debugLineNum = 14417933;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _esperarconfirmacion() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "esperarconfirmacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "esperarconfirmacion", null));}
ResumableSub_EsperarConfirmacion rsub = new ResumableSub_EsperarConfirmacion(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EsperarConfirmacion extends BA.ResumableSub {
public ResumableSub_EsperarConfirmacion(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Wait For Btn_Probar_Conexion_Click";
anywheresoftware.b4a.keywords.Common.WaitFor("btn_probar_conexion_click", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "esperarconfirmacion"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}