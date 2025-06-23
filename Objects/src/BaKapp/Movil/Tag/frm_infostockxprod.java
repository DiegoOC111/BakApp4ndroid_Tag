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

public class frm_infostockxprod extends Activity implements B4AActivity{
	public static frm_infostockxprod mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_infostockxprod");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_infostockxprod).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_infostockxprod");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_infostockxprod", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_infostockxprod) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_infostockxprod) Resume **");
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
		return frm_infostockxprod.class;
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
            BA.LogInfo("** Activity (frm_infostockxprod) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_infostockxprod) Pause event (activity is not paused). **");
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
            frm_infostockxprod mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_infostockxprod) Resume **");
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
public static BaKapp.Movil.Tag.mensajes _msj = null;
public static String _codigo = "";
public static String _descripcion = "";
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_codigo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_descripcion = null;
public b4a.example3.customlistview _xclv_stokxbodega = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_bodega = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_infostock = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.buscar_productos _buscar_productos = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
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
 //BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"St_StockXBodega\")";
mostCurrent._activity.LoadLayout("St_StockXBodega",mostCurrent.activityBA);
 //BA.debugLineNum = 36;BA.debugLine="Msj.Initialize";
_msj._initialize /*String*/ (processBA);
 //BA.debugLineNum = 38;BA.debugLine="Lbl_Codigo.Text = Codigo";
mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(_codigo));
 //BA.debugLineNum = 39;BA.debugLine="Lbl_Descripcion.Text = Descripcion";
mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(_descripcion));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 45;BA.debugLine="Revisar_Stock";
_revisar_stock();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim bmp1 As Bitmap";
mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Lbl_Codigo As Label";
mostCurrent._lbl_codigo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Lbl_Descripcion As Label";
mostCurrent._lbl_descripcion = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Xclv_StokXbodega As CustomListView";
mostCurrent._xclv_stokxbodega = new b4a.example3.customlistview();
 //BA.debugLineNum = 27;BA.debugLine="Private Lbl_Bodega As B4XView";
mostCurrent._lbl_bodega = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Lbl_InfoStock As B4XView";
mostCurrent._lbl_infostock = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Msj As Mensajes";
_msj = new BaKapp.Movil.Tag.mensajes();
 //BA.debugLineNum = 12;BA.debugLine="Dim Codigo As String";
_codigo = "";
 //BA.debugLineNum = 13;BA.debugLine="Dim Descripcion As String";
_descripcion = "";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static void  _revisar_stock() throws Exception{
ResumableSub_Revisar_Stock rsub = new ResumableSub_Revisar_Stock(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Revisar_Stock extends BA.ResumableSub {
public ResumableSub_Revisar_Stock(BaKapp.Movil.Tag.frm_infostockxprod parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_infostockxprod parent;
String _consulta_sql = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _tblstockxbodega = null;
BaKapp.Movil.Tag.b4xsearchtemplate _searchtemplatestock = null;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.collections.Map _vfilastb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _stock = "";
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 55;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 57;BA.debugLine="Consulta_Sql = \"Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO";
_consulta_sql = "Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Ts.NOKOSU,Tb.NOKOBO,STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join TABSU Ts On Ts.EMPRESA = Ms.EMPRESA And Ts.KOSU = Ms.KOSU"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent._codigo+"'";
 //BA.debugLineNum = 63;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,_consulta_sql,frm_infostockxprod.getObject());
 //BA.debugLineNum = 64;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 66;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 68;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 70;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 72;BA.debugLine="Msj.Detalle = \"Información\"";
parent._msj._detalle /*String*/  = "Información";
 //BA.debugLineNum = 73;BA.debugLine="Msj.Mensaje = \"No existe información\"";
parent._msj._mensaje /*String*/  = "No existe información";
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 77;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("239321624","Traer Stock x bodega",0);
 //BA.debugLineNum = 78;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 //BA.debugLineNum = 80;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 81;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 86;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 87;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 89;BA.debugLine="Dialog.Initialize (Activity)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject())));
 //BA.debugLineNum = 90;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
 //BA.debugLineNum = 92;BA.debugLine="Xclv_StokXbodega.DefaultTextBackgroundColor = C";
parent.mostCurrent._xclv_stokxbodega._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
 //BA.debugLineNum = 93;BA.debugLine="Xclv_StokXbodega.Clear";
parent.mostCurrent._xclv_stokxbodega._clear();
 //BA.debugLineNum = 95;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
if (true) break;

case 9:
//for
this.state = 12;
_vfilastb = new anywheresoftware.b4a.objects.collections.Map();
group21 = _tblstockxbodega;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 12;
if (index21 < groupLen21) {
this.state = 11;
_vfilastb = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 17:
//C
this.state = 16;
index21++;
if (true) break;

case 11:
//C
this.state = 17;
 //BA.debugLineNum = 97;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 99;BA.debugLine="p.SetLayoutAnimated(100,0,0,Xclv_StokXbodega.A";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclv_stokxbodega._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
 //BA.debugLineNum = 100;BA.debugLine="p.LoadLayout(\"Items_StockXProducto\")";
_p.LoadLayout("Items_StockXProducto",mostCurrent.activityBA);
 //BA.debugLineNum = 101;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 103;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
 //BA.debugLineNum = 107;BA.debugLine="Lbl_Bodega.Text = vFilaStb.Get(\"KOSU\") & \" - \"";
parent.mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence(BA.ObjectToString(_vfilastb.Get((Object)("KOSU")))+" - "+BA.ObjectToString(_vfilastb.Get((Object)("KOBO")))+" - "+BA.ObjectToString(_vfilastb.Get((Object)("NOKOBO")))));
 //BA.debugLineNum = 108;BA.debugLine="Lbl_InfoStock.Text = \"Stock disponible: \" & St";
parent.mostCurrent._lbl_infostock.setText(BA.ObjectToCharSequence("Stock disponible: "+_stock));
 //BA.debugLineNum = 109;BA.debugLine="p.Tag =vFilaStb";
_p.setTag((Object)(_vfilastb.getObject()));
 //BA.debugLineNum = 110;BA.debugLine="Xclv_StokXbodega.add(p,\"\")";
parent.mostCurrent._xclv_stokxbodega._add(_p,(Object)(""));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
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
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static void  _xclv_stokxbodega_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_Xclv_StokXbodega_ItemLongClick rsub = new ResumableSub_Xclv_StokXbodega_ItemLongClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_Xclv_StokXbodega_ItemLongClick extends BA.ResumableSub {
public ResumableSub_Xclv_StokXbodega_ItemLongClick(BaKapp.Movil.Tag.frm_infostockxprod parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
BaKapp.Movil.Tag.frm_infostockxprod parent;
int _index;
Object _value;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.collections.Map _filaseleccionada = null;
String _stock = "";
Object _sf = null;
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
 //BA.debugLineNum = 124;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 125;BA.debugLine="Dim Item As CLVItem  = Xclv_StokXbodega.GetRawLis";
_item = parent.mostCurrent._xclv_stokxbodega._getrawlistitem(_index);
 //BA.debugLineNum = 126;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 129;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 130;BA.debugLine="Msj.Tag = p.Tag";
parent._msj._tag /*Object*/  = _p.getTag();
 //BA.debugLineNum = 131;BA.debugLine="Dim FilaSeleccionada As Map = p.Tag";
_filaseleccionada = new anywheresoftware.b4a.objects.collections.Map();
_filaseleccionada = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_p.getTag()));
 //BA.debugLineNum = 132;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 134;BA.debugLine="Dim Stock As String  = NumberFormat(FilaSeleccion";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_filaseleccionada.Get((Object)("STFI1")))),(int) (0),(int) (2));
 //BA.debugLineNum = 136;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Bodega: \" &";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("Bodega: "+BA.ObjectToString(_filaseleccionada.Get((Object)("NOKOBO")))+anywheresoftware.b4a.keywords.Common.CRLF+"Stock disponible: "+_stock),BA.ObjectToCharSequence("Selección de bodega"),"Confirmar","Cancelar","",parent.mostCurrent._bmp1);
 //BA.debugLineNum = 138;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 140;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 141;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 144;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
}
