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
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nom = null;
public BaKapp.Movil.Tag.b4ximageview _imgview = null;
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
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Activity.LoadLayout(\"Etiqueta_men\")";
parent.mostCurrent._activity.LoadLayout("Etiqueta_men",mostCurrent.activityBA);
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="Changes = False";
parent._changes = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="Dim Js As HttpJob = Sb_BuscarListaPrecios(Me)";
_js = _sb_buscarlistaprecios(frm_etiquetas.getObject());
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "activity_create"), (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="Msgbox2Async(\"Error al buscar la lista de preci";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar la lista de precios."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16121873;
 //BA.debugLineNum = 16121873;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "activity_create"), null);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=16121875;
 //BA.debugLineNum = 16121875;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=16121879;
 //BA.debugLineNum = 16121879;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="DataPrice = ParseOtherPriceJSON(vJson)";
parent.mostCurrent._dataprice = _parseotherpricejson(_vjson);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=16121886;
 //BA.debugLineNum = 16121886;BA.debugLine="Msgbox2Async(\"Error al comunicarse con la base d";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al comunicarse con la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16121887;
 //BA.debugLineNum = 16121887;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "activity_create"), null);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=16121888;
 //BA.debugLineNum = 16121888;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=16121895;
 //BA.debugLineNum = 16121895;BA.debugLine="stringListPrice.Initialize";
parent.mostCurrent._stringlistprice.Initialize();
RDebugUtils.currentLine=16121896;
 //BA.debugLineNum = 16121896;BA.debugLine="For Each p As OtherPriceData In DataPrice";
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
RDebugUtils.currentLine=16121897;
 //BA.debugLineNum = 16121897;BA.debugLine="stringListPrice.Add(p.KOLT &\" | \"& p.NOKOLT)";
parent.mostCurrent._stringlistprice.Add((Object)(_p.KOLT /*String*/ +" | "+_p.NOKOLT /*String*/ ));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=16121899;
 //BA.debugLineNum = 16121899;BA.debugLine="SelectedPrice = 0";
parent._selectedprice = (int) (0);
RDebugUtils.currentLine=16121900;
 //BA.debugLineNum = 16121900;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(parent.mostCurrent._dataprice.Get(parent._selectedprice));
RDebugUtils.currentLine=16121901;
 //BA.debugLineNum = 16121901;BA.debugLine="stringPrecio = aux.KOLT";
parent._stringprecio = _aux.KOLT /*String*/ ;
RDebugUtils.currentLine=16121902;
 //BA.debugLineNum = 16121902;BA.debugLine="LeerDatos";
_leerdatos();
RDebugUtils.currentLine=16121903;
 //BA.debugLineNum = 16121903;BA.debugLine="CargarLista";
_cargarlista();
RDebugUtils.currentLine=16121908;
 //BA.debugLineNum = 16121908;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>");
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=16252939;
 //BA.debugLineNum = 16252939;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=16252940;
 //BA.debugLineNum = 16252940;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=16252941;
 //BA.debugLineNum = 16252941;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=16252942;
 //BA.debugLineNum = 16252942;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_BuscarListaPrecios\""));
RDebugUtils.currentLine=16252944;
 //BA.debugLineNum = 16252944;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=16252946;
 //BA.debugLineNum = 16252946;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="Dim data As OtherPriceData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherpricedata();
RDebugUtils.currentLine=16187403;
 //BA.debugLineNum = 16187403;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=16187404;
 //BA.debugLineNum = 16187404;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
_data.TILT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TILT")));
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
_data.KOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOLT")));
RDebugUtils.currentLine=16187406;
 //BA.debugLineNum = 16187406;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
_data.MELT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MELT")));
RDebugUtils.currentLine=16187407;
 //BA.debugLineNum = 16187407;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
_data.MOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MOLT")));
RDebugUtils.currentLine=16187408;
 //BA.debugLineNum = 16187408;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
_data.TIMOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TIMOLT")));
RDebugUtils.currentLine=16187409;
 //BA.debugLineNum = 16187409;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
_data.NOKOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("NOKOLT")));
RDebugUtils.currentLine=16187411;
 //BA.debugLineNum = 16187411;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
if (_entry.ContainsKey((Object)("FEVI")) && _entry.Get((Object)("FEVI"))!= null) { 
RDebugUtils.currentLine=16187412;
 //BA.debugLineNum = 16187412;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
_data.FEVI /*String*/  = BA.ObjectToString(_entry.Get((Object)("FEVI")));
 }else {
RDebugUtils.currentLine=16187414;
 //BA.debugLineNum = 16187414;BA.debugLine="data.FEVI = \"\"";
_data.FEVI /*String*/  = "";
 };
RDebugUtils.currentLine=16187417;
 //BA.debugLineNum = 16187417;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
_data.OPERA /*String*/  = BA.ObjectToString(_entry.Get((Object)("OPERA")));
RDebugUtils.currentLine=16187418;
 //BA.debugLineNum = 16187418;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
_data.ECUDEF01UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF01UD")));
RDebugUtils.currentLine=16187419;
 //BA.debugLineNum = 16187419;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
_data.ECUDEF02UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF02UD")));
RDebugUtils.currentLine=16187421;
 //BA.debugLineNum = 16187421;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
RDebugUtils.currentLine=16187424;
 //BA.debugLineNum = 16187424;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=16187425;
 //BA.debugLineNum = 16187425;BA.debugLine="End Sub";
return null;
}
public static String  _leerdatos() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "leerdatos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "leerdatos", null));}
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub LeerDatos()";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map")) { 
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
mostCurrent._datos = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map");
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="Lbl_IP.Text = datos.Get(\"Ip\")";
mostCurrent._lbl_ip.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Ip"))));
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="Lbl_Nombre.Text = datos.Get(\"Nombre\")";
mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Nombre"))));
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="Lbl_precio_act.Text =  datos.Get(\"KOLT\")  &\"|\"&";
mostCurrent._lbl_precio_act.setText(BA.ObjectToCharSequence(BA.ObjectToString(mostCurrent._datos.Get((Object)("KOLT")))+"|"+BA.ObjectToString(mostCurrent._datos.Get((Object)("NOKOLT")))));
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Select";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(mostCurrent._dataprice.Get(_selectedprice));
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="SelectedPrice = datos.Get(\"Seleccionado\")";
_selectedprice = (int)(BA.ObjectToNumber(mostCurrent._datos.Get((Object)("Seleccionado"))));
RDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="stringPrecio = aux.KOLT";
_stringprecio = _aux.KOLT /*String*/ ;
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="Lbl_puerto.Text = datos.Get(\"Puerto\")";
mostCurrent._lbl_puerto.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Puerto"))));
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=16646156;
 //BA.debugLineNum = 16646156;BA.debugLine="Msgbox2Async(\"Se encontro la configuración de im";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se encontro la configuración de impresora"),BA.ObjectToCharSequence("Impresora encontrada"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="Btn_Etq1.Enabled=True";
mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="Lbl_Imprimir.Visible = False";
mostCurrent._lbl_imprimir.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=16646160;
 //BA.debugLineNum = 16646160;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16646161;
 //BA.debugLineNum = 16646161;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=16646162;
 //BA.debugLineNum = 16646162;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora."),BA.ObjectToCharSequence("Alerta"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16646163;
 //BA.debugLineNum = 16646163;BA.debugLine="Btn_Conf_Click";
_btn_conf_click();
RDebugUtils.currentLine=16646164;
 //BA.debugLineNum = 16646164;BA.debugLine="Btn_Cerrar.Enabled = False";
mostCurrent._btn_cerrar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16646166;
 //BA.debugLineNum = 16646166;BA.debugLine="Log(\"El archivo no existe.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("216646166","El archivo no existe.",0);
RDebugUtils.currentLine=16646167;
 //BA.debugLineNum = 16646167;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
mostCurrent._datos.Initialize();
 };
RDebugUtils.currentLine=16646175;
 //BA.debugLineNum = 16646175;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.Map _size = null;
String _ancho = "";
String _alto = "";
BaKapp.Movil.Tag.httpjob _j = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.collections.Map _etiqueta = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group55;
int index55;
int groupLen55;

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
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="ProgressDialogShow2(\"Cargando etiquetas\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Cargando etiquetas"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="clv.Clear";
parent.mostCurrent._clv._clear();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Dim ListaPersonas As List";
_listapersonas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="ListaPersonas.Initialize";
_listapersonas.Initialize();
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="Dim Js As HttpJob = Sb_TraerEtiquetas(Me)";
_js = _sb_traeretiquetas(frm_etiquetas.getObject());
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), (Object)(_js));
this.state = 32;
return;
case 32:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 28;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16449550;
 //BA.debugLineNum = 16449550;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=16449554;
 //BA.debugLineNum = 16449554;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=16449556;
 //BA.debugLineNum = 16449556;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=16449557;
 //BA.debugLineNum = 16449557;BA.debugLine="Msgbox2Async(\"No hay etiquetas de tipo '(Movil)";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No hay etiquetas de tipo '(Movil)' en la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16449558;
 //BA.debugLineNum = 16449558;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), null);
this.state = 33;
return;
case 33:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=16449560;
 //BA.debugLineNum = 16449560;BA.debugLine="If(Result5 = DialogResponse.POSITIVE)Then";
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
RDebugUtils.currentLine=16449562;
 //BA.debugLineNum = 16449562;BA.debugLine="Btn_Etq1.Enabled = False";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=16449565;
 //BA.debugLineNum = 16449565;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=16449568;
 //BA.debugLineNum = 16449568;BA.debugLine="Etiquetas = ParseEtiquetas(vJson)";
parent._etiquetas = _parseetiquetas(_vjson);
RDebugUtils.currentLine=16449570;
 //BA.debugLineNum = 16449570;BA.debugLine="For Each ET As Etiqueta In Etiquetas";
if (true) break;

case 12:
//for
this.state = 21;
group21 = parent._etiquetas;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 34;
if (true) break;

case 34:
//C
this.state = 21;
if (index21 < groupLen21) {
this.state = 14;
_et = (BaKapp.Movil.Tag.frm_impresion._etiqueta)(group21.Get(index21));}
if (true) break;

case 35:
//C
this.state = 34;
index21++;
if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=16449571;
 //BA.debugLineNum = 16449571;BA.debugLine="Dim job As HttpJob";
_job = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=16449572;
 //BA.debugLineNum = 16449572;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,processBA,"",frm_etiquetas.getObject());
RDebugUtils.currentLine=16449577;
 //BA.debugLineNum = 16449577;BA.debugLine="Dim size As Map = GetLabelSizeInches(ET.FUNCION";
_size = new anywheresoftware.b4a.objects.collections.Map();
_size = _getlabelsizeinches(_et.FUNCION /*String*/ ,(int) (203));
RDebugUtils.currentLine=16449579;
 //BA.debugLineNum = 16449579;BA.debugLine="Dim Ancho As String = size.Get(\"Width\")";
_ancho = BA.ObjectToString(_size.Get((Object)("Width")));
RDebugUtils.currentLine=16449580;
 //BA.debugLineNum = 16449580;BA.debugLine="Dim Alto As String = size.Get(\"Length\")";
_alto = BA.ObjectToString(_size.Get((Object)("Length")));
RDebugUtils.currentLine=16449582;
 //BA.debugLineNum = 16449582;BA.debugLine="Log(\"Ancho: \" & Ancho & \" in\")";
anywheresoftware.b4a.keywords.Common.LogImpl("216449582","Ancho: "+_ancho+" in",0);
RDebugUtils.currentLine=16449583;
 //BA.debugLineNum = 16449583;BA.debugLine="Log(\"Alto: \" & Alto & \" in\")";
anywheresoftware.b4a.keywords.Common.LogImpl("216449583","Alto: "+_alto+" in",0);
RDebugUtils.currentLine=16449584;
 //BA.debugLineNum = 16449584;BA.debugLine="job.PostString($\"https://api.labelary.com/v1/pr";
_job._poststring /*String*/ (null,("https://api.labelary.com/v1/printers/8dpmm/labels/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ancho))+"x"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alto))+"/0/"),_et.FUNCION /*String*/ );
RDebugUtils.currentLine=16449587;
 //BA.debugLineNum = 16449587;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"image/png\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","image/png");
RDebugUtils.currentLine=16449589;
 //BA.debugLineNum = 16449589;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), (Object)(_job));
this.state = 36;
return;
case 36:
//C
this.state = 15;
_j = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=16449590;
 //BA.debugLineNum = 16449590;BA.debugLine="If j.Success Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=16449591;
 //BA.debugLineNum = 16449591;BA.debugLine="Dim bmp As Bitmap = j.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _j._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=16449592;
 //BA.debugLineNum = 16449592;BA.debugLine="Dim Etiqueta As Map";
_etiqueta = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16449593;
 //BA.debugLineNum = 16449593;BA.debugLine="Etiqueta.Initialize";
_etiqueta.Initialize();
RDebugUtils.currentLine=16449594;
 //BA.debugLineNum = 16449594;BA.debugLine="Etiqueta.Put(\"tipo\", ET.NombreEtiqueta)";
_etiqueta.Put((Object)("tipo"),(Object)(_et.NombreEtiqueta /*String*/ ));
RDebugUtils.currentLine=16449595;
 //BA.debugLineNum = 16449595;BA.debugLine="Etiqueta.Put(\"imagen\", bmp)";
_etiqueta.Put((Object)("imagen"),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=16449598;
 //BA.debugLineNum = 16449598;BA.debugLine="ListaPersonas.Add(Etiqueta)";
_listapersonas.Add((Object)(_etiqueta.getObject()));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=16449601;
 //BA.debugLineNum = 16449601;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("216449601","Error: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=16449602;
 //BA.debugLineNum = 16449602;BA.debugLine="ToastMessageShow(\"No se pudo generar la etique";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se pudo generar la etiqueta"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 20:
//C
this.state = 35;
;
RDebugUtils.currentLine=16449604;
 //BA.debugLineNum = 16449604;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 28;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=16449609;
 //BA.debugLineNum = 16449609;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=16449610;
 //BA.debugLineNum = 16449610;BA.debugLine="Msgbox2Async(\"Error al traer las etiquetas.\", \"E";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al traer las etiquetas."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16449611;
 //BA.debugLineNum = 16449611;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "cargarlista"), null);
this.state = 37;
return;
case 37:
//C
this.state = 24;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=16449612;
 //BA.debugLineNum = 16449612;BA.debugLine="If(Result5 = DialogResponse.POSITIVE)Then";
if (true) break;

case 24:
//if
this.state = 27;
if ((_result5==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=16449613;
 //BA.debugLineNum = 16449613;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=16449615;
 //BA.debugLineNum = 16449615;BA.debugLine="Btn_Etq1.Enabled = False";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=16449618;
 //BA.debugLineNum = 16449618;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=16449620;
 //BA.debugLineNum = 16449620;BA.debugLine="For Each Etiqueta As Map In ListaPersonas";

case 28:
//for
this.state = 31;
_etiqueta = new anywheresoftware.b4a.objects.collections.Map();
group55 = _listapersonas;
index55 = 0;
groupLen55 = group55.getSize();
this.state = 38;
if (true) break;

case 38:
//C
this.state = 31;
if (index55 < groupLen55) {
this.state = 30;
_etiqueta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group55.Get(index55)));}
if (true) break;

case 39:
//C
this.state = 38;
index55++;
if (true) break;

case 30:
//C
this.state = 39;
RDebugUtils.currentLine=16449621;
 //BA.debugLineNum = 16449621;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._xui.CreatePanel(processBA,"").getObject()));
RDebugUtils.currentLine=16449622;
 //BA.debugLineNum = 16449622;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clv.AsView.Width, 2";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.mostCurrent._clv._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
RDebugUtils.currentLine=16449623;
 //BA.debugLineNum = 16449623;BA.debugLine="p.LoadLayout(\"item_nombre_imagen\")";
_p.LoadLayout("item_nombre_imagen",mostCurrent.activityBA);
RDebugUtils.currentLine=16449625;
 //BA.debugLineNum = 16449625;BA.debugLine="LBL_NOM.Text = Etiqueta.Get(\"tipo\")";
parent.mostCurrent._lbl_nom.setText(BA.ObjectToCharSequence(_etiqueta.Get((Object)("tipo"))));
RDebugUtils.currentLine=16449626;
 //BA.debugLineNum = 16449626;BA.debugLine="IMGVIEW.Bitmap = Etiqueta.Get(\"imagen\")";
parent.mostCurrent._imgview._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_etiqueta.Get((Object)("imagen")))));
RDebugUtils.currentLine=16449628;
 //BA.debugLineNum = 16449628;BA.debugLine="clv.Add(p, Etiqueta.Get(\"tipo\"))";
parent.mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),_etiqueta.Get((Object)("tipo")));
 if (true) break;
if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=16449630;
 //BA.debugLineNum = 16449630;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=16449631;
 //BA.debugLineNum = 16449631;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cerrar_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cerrar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cerrar_click", null));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub Btn_Cerrar_Click";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="General.Visible= True";
mostCurrent._general.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Panel_Conf.Visible = False";
mostCurrent._panel_conf.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="End Sub";
return "";
}
public static String  _btn_conf_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_conf_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_conf_click", null));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub Btn_Conf_Click";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="General.Visible= False";
mostCurrent._general.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
mostCurrent._btn_guardar.setColor(_colorenabled);
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="IsEnabled = False";
_isenabled = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Panel_Conf.Visible = True";
mostCurrent._panel_conf.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=17104909;
 //BA.debugLineNum = 17104909;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese la ip\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese la ip"));
RDebugUtils.currentLine=17104910;
 //BA.debugLineNum = 17104910;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_ed_id_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=17104914;
 //BA.debugLineNum = 17104914;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
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
RDebugUtils.currentLine=17104915;
 //BA.debugLineNum = 17104915;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17104917;
 //BA.debugLineNum = 17104917;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=17104918;
 //BA.debugLineNum = 17104918;BA.debugLine="Lbl_IP.Text = InputTemplate.Text";
parent.mostCurrent._lbl_ip.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=17104920;
 //BA.debugLineNum = 17104920;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17170441;
 //BA.debugLineNum = 17170441;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el nombre\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese el nombre"));
RDebugUtils.currentLine=17170447;
 //BA.debugLineNum = 17170447;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=17170449;
 //BA.debugLineNum = 17170449;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_ed_nombre_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=17170450;
 //BA.debugLineNum = 17170450;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
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
RDebugUtils.currentLine=17170451;
 //BA.debugLineNum = 17170451;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17170453;
 //BA.debugLineNum = 17170453;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=17170454;
 //BA.debugLineNum = 17170454;BA.debugLine="Lbl_Nombre.Text = InputTemplate.Text";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=17170455;
 //BA.debugLineNum = 17170455;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="InputListAsync(stringListPrice, \"Seleccione preci";
anywheresoftware.b4a.keywords.Common.InputListAsync(parent.mostCurrent._stringlistprice,BA.ObjectToCharSequence("Seleccione precio "),parent._selectedprice,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="Wait For InputList_Result (Index As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_ed_precio_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_index = (Integer) result[0];
;
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="If Index <> DialogResponse.CANCEL Then";
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
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="SelectedPrice = Index";
parent._selectedprice = _index;
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="Dim  aux As OtherPriceData = DataPrice.Get(Index";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(parent.mostCurrent._dataprice.Get(_index));
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="stringPrecio = aux.KOLT&\"|\"&aux.NOKOLT";
parent._stringprecio = _aux.KOLT /*String*/ +"|"+_aux.NOKOLT /*String*/ ;
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="Lbl_precio_act.Text = stringPrecio";
parent.mostCurrent._lbl_precio_act.setText(BA.ObjectToCharSequence(parent._stringprecio));
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17432588;
 //BA.debugLineNum = 17432588;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="dialog.Initialize(Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el puerto\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese el puerto"));
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="If (Lbl_puerto.Text <> Null) Then";
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
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="InputTemplate.Text = Lbl_puerto.Text";
_inputtemplate._text /*String*/  = parent.mostCurrent._lbl_puerto.getText();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"Gua";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_editarpuerto_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("Guardar"),(Object)("Por defecto"),(Object)("Cancel")));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
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
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="If(Res = DialogResponse.NEGATIVE) Then";

case 10:
//if
this.state = 13;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=17563673;
 //BA.debugLineNum = 17563673;BA.debugLine="Lbl_puerto.Text = 9100";
parent.mostCurrent._lbl_puerto.setText(BA.ObjectToCharSequence(9100));
 if (true) break;
;
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="If(Res = DialogResponse.POSITIVE) Then";

case 13:
//if
this.state = 16;
if ((_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="Lbl_puerto.Text = InputTemplate.Text";
parent.mostCurrent._lbl_puerto.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=17563682;
 //BA.debugLineNum = 17563682;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_etq1_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_etq1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_etq1_click", null));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Private Sub Btn_Etq1_Click";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="StartActivity(Frm_impresion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_impresion.getObject()));
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="End Sub";
return "";
}
public static String  _btn_etq2_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_etq2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_etq2_click", null));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub Btn_Etq2_Click";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="StartActivity(Frm_impresion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_impresion.getObject()));
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Wait For (Btn_Probar_Conexion_Click) Complete (Re";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), _btn_probar_conexion_click());
this.state = 27;
return;
case 27:
//C
this.state = 1;
_result1 = (Boolean) result[0];
;
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="If IsEnabled Then";
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
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"save.png");
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="Msgbox2Async(\"¿Desea guardar la configuración ac";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Desea guardar la configuración actual?"),BA.ObjectToCharSequence("Configuración local"),"Si","No","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 28;
return;
case 28:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="If Lbl_puerto.Text <> \"---\" Then";
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
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="If Lbl_IP.Text <> \"---\" Then";
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
RDebugUtils.currentLine=17367052;
 //BA.debugLineNum = 17367052;BA.debugLine="If Lbl_Nombre.Text <> \"---\" Then";
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
RDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="CrearDatos";
_creardatos();
RDebugUtils.currentLine=17367055;
 //BA.debugLineNum = 17367055;BA.debugLine="Btn_Etq1.Enabled = True";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="Lbl_Imprimir.Visible = False";
parent.mostCurrent._lbl_imprimir.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17367058;
 //BA.debugLineNum = 17367058;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.p";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="Msgbox2Async(\"Datos guardados correctamente\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Datos guardados correctamente"),BA.ObjectToCharSequence("Configuración Impresora"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 29;
return;
case 29:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17367061;
 //BA.debugLineNum = 17367061;BA.debugLine="Btn_Cerrar_Click";
_btn_cerrar_click();
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=17367063;
 //BA.debugLineNum = 17367063;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17367064;
 //BA.debugLineNum = 17367064;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-d";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, asigne un nombre"),BA.ObjectToCharSequence("Configuración Impresora"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367066;
 //BA.debugLineNum = 17367066;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 30;
return;
case 30:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17367067;
 //BA.debugLineNum = 17367067;BA.debugLine="Return";
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
RDebugUtils.currentLine=17367070;
 //BA.debugLineNum = 17367070;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17367071;
 //BA.debugLineNum = 17367071;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=17367072;
 //BA.debugLineNum = 17367072;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne una ip"),BA.ObjectToCharSequence("Configuración Impresora "),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367073;
 //BA.debugLineNum = 17367073;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17367074;
 //BA.debugLineNum = 17367074;BA.debugLine="Return";
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
RDebugUtils.currentLine=17367077;
 //BA.debugLineNum = 17367077;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17367078;
 //BA.debugLineNum = 17367078;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=17367079;
 //BA.debugLineNum = 17367079;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne un puerto"),BA.ObjectToCharSequence("Configuración Impresora "),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367080;
 //BA.debugLineNum = 17367080;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17367081;
 //BA.debugLineNum = 17367081;BA.debugLine="Return";
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
RDebugUtils.currentLine=17367086;
 //BA.debugLineNum = 17367086;BA.debugLine="Btn_Cerrar.Enabled = True";
parent.mostCurrent._btn_cerrar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17367087;
 //BA.debugLineNum = 17367087;BA.debugLine="Btn_Etq1.Enabled = True";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17367089;
 //BA.debugLineNum = 17367089;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=17367091;
 //BA.debugLineNum = 17367091;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17367092;
 //BA.debugLineNum = 17367092;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=17367093;
 //BA.debugLineNum = 17367093;BA.debugLine="Msgbox2Async(\"Antes de guardar una configuración";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Antes de guardar una configuración se debe de probar conexión"),BA.ObjectToCharSequence("Configuración local"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17367094;
 //BA.debugLineNum = 17367094;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_guardar_click"), null);
this.state = 33;
return;
case 33:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17367096;
 //BA.debugLineNum = 17367096;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17235980;
 //BA.debugLineNum = 17235980;BA.debugLine="If Ping(Lbl_IP.Text) Then";
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
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
RDebugUtils.currentLine=17235983;
 //BA.debugLineNum = 17235983;BA.debugLine="Msgbox2Async(\"Conexión exitosa\" , \"Notificación\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexión exitosa"),BA.ObjectToCharSequence("Notificación"),"Aceptar","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17235984;
 //BA.debugLineNum = 17235984;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_probar_conexion_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17235986;
 //BA.debugLineNum = 17235986;BA.debugLine="IsEnabled = True";
parent._isenabled = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=17235987;
 //BA.debugLineNum = 17235987;BA.debugLine="Changes = False";
parent._changes = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17235988;
 //BA.debugLineNum = 17235988;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
parent.mostCurrent._btn_guardar.setColor(parent._colorenabled);
RDebugUtils.currentLine=17235989;
 //BA.debugLineNum = 17235989;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17235991;
 //BA.debugLineNum = 17235991;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17235992;
 //BA.debugLineNum = 17235992;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
RDebugUtils.currentLine=17235993;
 //BA.debugLineNum = 17235993;BA.debugLine="Msgbox2Async(\"Conexión Fallida\" , \"Notificación\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexión Fallida"),BA.ObjectToCharSequence("Notificación"),"Aceptar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17235994;
 //BA.debugLineNum = 17235994;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "btn_probar_conexion_click"), null);
this.state = 6;
return;
case 6:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=17235995;
 //BA.debugLineNum = 17235995;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17235997;
 //BA.debugLineNum = 17235997;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub CrearDatos()";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim datos As Map";
mostCurrent._datos = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="datos.Initialize";
mostCurrent._datos.Initialize();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="datos.Put(\"Ip\",Lbl_IP.Text )";
mostCurrent._datos.Put((Object)("Ip"),(Object)(mostCurrent._lbl_ip.getText()));
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="datos.Put(\"Nombre\", Lbl_Nombre.Text )";
mostCurrent._datos.Put((Object)("Nombre"),(Object)(mostCurrent._lbl_nombre.getText()));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="datos.Put(\"Seleccionado\", SelectedPrice)";
mostCurrent._datos.Put((Object)("Seleccionado"),(Object)(_selectedprice));
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Dim ipText As String = Lbl_puerto.Text";
_iptext = mostCurrent._lbl_puerto.getText();
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Dim IpINT As Int =  ipText";
_ipint = (int)(Double.parseDouble(_iptext));
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="datos.Put(\"Puerto\", IpINT)";
mostCurrent._datos.Put((Object)("Puerto"),(Object)(_ipint));
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(mostCurrent._dataprice.Get(_selectedprice));
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="stringPrecio = aux.KOLT";
_stringprecio = _aux.KOLT /*String*/ ;
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="Dim stringNoPrecio As String  = aux.NOKOLT";
_stringnoprecio = _aux.NOKOLT /*String*/ ;
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="datos.Put(\"KOLT\",stringPrecio )";
mostCurrent._datos.Put((Object)("KOLT"),(Object)(_stringprecio));
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="datos.Put(\"NOKOLT\",stringNoPrecio )";
mostCurrent._datos.Put((Object)("NOKOLT"),(Object)(_stringnoprecio));
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="File.WriteMap(File.DirInternal, \"impresora.map\",";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map",mostCurrent._datos);
RDebugUtils.currentLine=16384020;
 //BA.debugLineNum = 16384020;BA.debugLine="End Sub";
return "";
}
public static boolean  _ping(String _ip) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ping", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "ping", new Object[] {_ip}));}
anywheresoftware.b4a.phone.Phone _p = null;
int _r = 0;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub Ping(IP As String) As Boolean";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Try";
try {RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="Dim r As Int = p.Shell(\"ping -c 1 -w 1 \" & IP, N";
_r = _p.Shell("ping -c 1 -w 1 "+_ip,(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Return (r = 0)  ' Si el ping es exitoso, devuelv";
if (true) return (_r==0);
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="End Sub";
return false;
}
public static String  _btn_volver_click() throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_volver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_volver_click", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub Btn_Volver_Click";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _sb_traeretiquetas(Object _me_) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_traeretiquetas", false))
	 {return ((BaKapp.Movil.Tag.httpjob) Debug.delegate(mostCurrent.activityBA, "sb_traeretiquetas", new Object[] {_me_}));}
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub Sb_TraerEtiquetas(Me_ As Object) As Ht";
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_TraerEtiquetas xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>\n"+"");
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (null,processBA,"",_me_);
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (null,_poststring,_vxml);
RDebugUtils.currentLine=16515087;
 //BA.debugLineNum = 16515087;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/xml; charset=utf-8");
RDebugUtils.currentLine=16515088;
 //BA.debugLineNum = 16515088;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("SOAPAction",("\"http://BakApp/Sb_TraerEtiquetas\""));
RDebugUtils.currentLine=16515089;
 //BA.debugLineNum = 16515089;BA.debugLine="Return Js";
if (true) return _js;
RDebugUtils.currentLine=16515091;
 //BA.debugLineNum = 16515091;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub ParseEtiquetas(Json As String ) As List";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="parser.Initialize(Json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=16580617;
 //BA.debugLineNum = 16580617;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="Dim data As Etiqueta";
_data = new BaKapp.Movil.Tag.frm_impresion._etiqueta();
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="data.NombreEtiqueta = entry.Get(\"NombreEtiqueta\"";
_data.NombreEtiqueta /*String*/  = BA.ObjectToString(_entry.Get((Object)("NombreEtiqueta")));
RDebugUtils.currentLine=16580621;
 //BA.debugLineNum = 16580621;BA.debugLine="data.FUNCION = entry.Get(\"FUNCION\")";
_data.FUNCION /*String*/  = BA.ObjectToString(_entry.Get((Object)("FUNCION")));
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
RDebugUtils.currentLine=16580627;
 //BA.debugLineNum = 16580627;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=16580628;
 //BA.debugLineNum = 16580628;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _getlabelsizeinches(String _zpl,int _dpi) throws Exception{
RDebugUtils.currentModule="frm_etiquetas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlabelsizeinches", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(mostCurrent.activityBA, "getlabelsizeinches", new Object[] {_zpl,_dpi}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
int _widthdots = 0;
int _lengthdots = 0;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m2 = null;
double _widthinches = 0;
double _lengthinches = 0;
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Public Sub GetLabelSizeInches(zpl As String, dpi A";
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=53215236;
 //BA.debugLineNum = 53215236;BA.debugLine="Dim widthDots As Int = 0";
_widthdots = (int) (0);
RDebugUtils.currentLine=53215237;
 //BA.debugLineNum = 53215237;BA.debugLine="Dim lengthDots As Int = 0";
_lengthdots = (int) (0);
RDebugUtils.currentLine=53215240;
 //BA.debugLineNum = 53215240;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\^PW(\\d+)\", zpl";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("\\^PW(\\d+)",_zpl);
RDebugUtils.currentLine=53215241;
 //BA.debugLineNum = 53215241;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=53215242;
 //BA.debugLineNum = 53215242;BA.debugLine="widthDots = m.Group(1)";
_widthdots = (int)(Double.parseDouble(_m.Group((int) (1))));
 };
RDebugUtils.currentLine=53215246;
 //BA.debugLineNum = 53215246;BA.debugLine="Dim m2 As Matcher = Regex.Matcher(\"\\^LL(\\d+)\", zp";
_m2 = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m2 = anywheresoftware.b4a.keywords.Common.Regex.Matcher("\\^LL(\\d+)",_zpl);
RDebugUtils.currentLine=53215247;
 //BA.debugLineNum = 53215247;BA.debugLine="If m2.Find Then";
if (_m2.Find()) { 
RDebugUtils.currentLine=53215248;
 //BA.debugLineNum = 53215248;BA.debugLine="lengthDots = m2.Group(1)";
_lengthdots = (int)(Double.parseDouble(_m2.Group((int) (1))));
 };
RDebugUtils.currentLine=53215252;
 //BA.debugLineNum = 53215252;BA.debugLine="Dim widthInches As Double = widthDots / dpi";
_widthinches = _widthdots/(double)_dpi;
RDebugUtils.currentLine=53215253;
 //BA.debugLineNum = 53215253;BA.debugLine="Dim lengthInches As Double = lengthDots / dpi";
_lengthinches = _lengthdots/(double)_dpi;
RDebugUtils.currentLine=53215255;
 //BA.debugLineNum = 53215255;BA.debugLine="res.Put(\"Width\", widthInches)";
_res.Put((Object)("Width"),(Object)(_widthinches));
RDebugUtils.currentLine=53215256;
 //BA.debugLineNum = 53215256;BA.debugLine="res.Put(\"Length\", lengthInches)";
_res.Put((Object)("Length"),(Object)(_lengthinches));
RDebugUtils.currentLine=53215258;
 //BA.debugLineNum = 53215258;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=53215259;
 //BA.debugLineNum = 53215259;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Msgbox2Async(\"Etiqueta seleccionada: \"&Value , \"C";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Etiqueta seleccionada: "+BA.ObjectToString(_value)),BA.ObjectToCharSequence("Confirmación de etiqueta"),"Seleccionar","","Cancelar",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "clv_itemclick"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result5 = (Integer) result[0];
;
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="default = Value";
parent._default = BA.ObjectToString(_value);
RDebugUtils.currentLine=17629192;
 //BA.debugLineNum = 17629192;BA.debugLine="ToastMessageShow(\"La etiqueta \"&default& \"Design";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("La etiqueta "+parent._default+"Designada para impresión"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="Btn_Etq1_Click";
_btn_etq1_click();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=17629196;
 //BA.debugLineNum = 17629196;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Wait For Btn_Probar_Conexion_Click";
anywheresoftware.b4a.keywords.Common.WaitFor("btn_probar_conexion_click", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_etiquetas", "esperarconfirmacion"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}