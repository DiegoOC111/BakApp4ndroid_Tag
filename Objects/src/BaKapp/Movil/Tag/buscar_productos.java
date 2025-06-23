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

public class buscar_productos extends Activity implements B4AActivity{
	public static buscar_productos mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.buscar_productos");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (buscar_productos).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.buscar_productos");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.buscar_productos", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (buscar_productos) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (buscar_productos) Resume **");
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
		return buscar_productos.class;
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
            BA.LogInfo("** Activity (buscar_productos) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (buscar_productos) Pause event (activity is not paused). **");
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
            buscar_productos mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (buscar_productos) Resume **");
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
public static String _consulta_sql = "";
public static anywheresoftware.b4a.objects.collections.Map _fila = null;
public static String _lista = "";
public static String _productoabuscar = "";
public static BaKapp.Movil.Tag.mensajes _msj = null;
public static boolean _verstockotrasbodegas = false;
public static String _empresa = "";
public static String _sucursal = "";
public static String _bodega = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txt_codigo_descripcion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscar = null;
public static int _id_docenc = 0;
public anywheresoftware.b4a.objects.IME _tecladosoft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _xclvdetalle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_codigo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_codtecnico = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_descripcion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_datos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btn_seleccionar = null;
public BaKapp.Movil.Tag.b4ximageview _img_eliminar = null;
public BaKapp.Movil.Tag.b4xloadingindicator _b4xloading = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.buscar_entidad _buscar_entidad = null;
public BaKapp.Movil.Tag.conf_local _conf_local = null;
public BaKapp.Movil.Tag.dbutils _dbutils = null;
public BaKapp.Movil.Tag.frm_buscar_documento _frm_buscar_documento = null;
public BaKapp.Movil.Tag.frm_documentos_generados _frm_documentos_generados = null;
public BaKapp.Movil.Tag.frm_editar_obsoc _frm_editar_obsoc = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
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

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"Buscador\")";
mostCurrent._activity.LoadLayout("Buscador",mostCurrent.activityBA);
 //BA.debugLineNum = 55;BA.debugLine="Activity.Title = \"BUSCAR PRODUCTOS\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("BUSCAR PRODUCTOS"));
 //BA.debugLineNum = 57;BA.debugLine="Msj.Initialize";
_msj._initialize /*String*/ (processBA);
 //BA.debugLineNum = 58;BA.debugLine="Txt_Codigo_Descripcion.RequestFocus";
mostCurrent._txt_codigo_descripcion.RequestFocus();
 //BA.debugLineNum = 61;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Codigo_Descripcion)";
mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(mostCurrent._txt_codigo_descripcion.getObject()));
 //BA.debugLineNum = 62;BA.debugLine="B4XLoading.Hide";
mostCurrent._b4xloading._hide /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="Txt_Codigo_Descripcion.Text = ProductoABuscar";
mostCurrent._txt_codigo_descripcion.setText(BA.ObjectToCharSequence(_productoabuscar));
 //BA.debugLineNum = 66;BA.debugLine="If Txt_Codigo_Descripcion.Text <> \"\" Then";
if ((mostCurrent._txt_codigo_descripcion.getText()).equals("") == false) { 
 //BA.debugLineNum = 67;BA.debugLine="Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,T";
_sb_buscar_producto(mostCurrent._txt_codigo_descripcion.getText(),mostCurrent._txt_codigo_descripcion.getText());
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 73;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _btn_buscar_click() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Sub Btn_Buscar_Click";
 //BA.debugLineNum = 176;BA.debugLine="Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Tx";
_sb_buscar_producto(mostCurrent._txt_codigo_descripcion.getText(),mostCurrent._txt_codigo_descripcion.getText());
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public static void  _btn_seleccionar_click() throws Exception{
ResumableSub_Btn_Seleccionar_Click rsub = new ResumableSub_Btn_Seleccionar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Seleccionar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Seleccionar_Click(BaKapp.Movil.Tag.buscar_productos parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.buscar_productos parent;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
String _codigo = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
String _errorstr = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
String _descripcion = "";
double _stockbodega = 0;
String _vstock = "";
Object _sf = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _new_row = null;
long _fechaemision = 0L;
int _id_docdet = 0;
anywheresoftware.b4a.objects.collections.Map _fila_id = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 240;BA.debugLine="Dim Btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 241;BA.debugLine="Dim Codigo As String = Btn.Tag";
_codigo = BA.ObjectToString(_btn.getTag());
 //BA.debugLineNum = 243;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,buscar_productos.getObject(),_codigo,parent.mostCurrent._empresa,parent.mostCurrent._sucursal,parent.mostCurrent._bodega,parent._lista,(int) (1),"");
 //BA.debugLineNum = 245;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 247;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 249;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 251;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 253;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 254;BA.debugLine="Fila = Filas.Get(0)";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 256;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Error\")";
_errorstr = BA.ObjectToString(parent._fila.Get((Object)("Error")));
 //BA.debugLineNum = 258;BA.debugLine="If ErrorStr = Null Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_errorstr== null) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 259;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 260;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 261;BA.debugLine="Msgbox2Async(ErrorStr,\"Problema al traer el pr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_errorstr),BA.ObjectToCharSequence("Problema al traer el producto"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 262;BA.debugLine="Fila = Null";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 263;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 266;BA.debugLine="Dim Codigo As String = Fila.Get(\"Codigo\")";
_codigo = BA.ObjectToString(parent._fila.Get((Object)("Codigo")));
 //BA.debugLineNum = 267;BA.debugLine="Log(Codigo)";
anywheresoftware.b4a.keywords.Common.LogImpl("01572893",_codigo,0);
 //BA.debugLineNum = 268;BA.debugLine="Dim Descripcion As String = Fila.Get(\"Descripci";
_descripcion = BA.ObjectToString(parent._fila.Get((Object)("Descripcion")));
 //BA.debugLineNum = 269;BA.debugLine="Dim StockBodega As Double  = Fila.Get(\"StockBod";
_stockbodega = (double)(BA.ObjectToNumber(parent._fila.Get((Object)("StockBodega"))));
 //BA.debugLineNum = 271;BA.debugLine="Dim vSTOCK As String = \"Stock: \" & StockBodega";
_vstock = "Stock: "+BA.NumberToString(_stockbodega);
 //BA.debugLineNum = 273;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma la selección?"+anywheresoftware.b4a.keywords.Common.CRLF+_descripcion+anywheresoftware.b4a.keywords.Common.CRLF+_vstock),BA.ObjectToCharSequence(_codigo),"SI","","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 274;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 22;
return;
case 22:
//C
this.state = 11;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 278;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 280;BA.debugLine="Fila.Put(\"Id_DocEnc\",Frm_Post_01_Formulario.Id";
parent._fila.Put((Object)("Id_DocEnc"),(Object)(parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/ ));
 //BA.debugLineNum = 282;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 284;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Orde";
parent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
 //BA.debugLineNum = 285;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variab";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 287;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 290;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 292;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
 //BA.debugLineNum = 293;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
 //BA.debugLineNum = 295;BA.debugLine="New_Row.Put(\"moneda\",Variables.Global_Row_Mone";
_new_row.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 296;BA.debugLine="New_Row.Put(\"tipo_moneda\",Variables.Global_Row";
_new_row.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 297;BA.debugLine="New_Row.Put(\"tipo_cambio\",Variables.Global_Row";
_new_row.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 298;BA.debugLine="New_Row.Put(\"codlista\",Lista)";
_new_row.Put((Object)("codlista"),(Object)(parent._lista));
 //BA.debugLineNum = 300;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\"";
_id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 302;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet Fro";
parent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 303;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variab";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 305;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
 //BA.debugLineNum = 307;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 309;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 310;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 //BA.debugLineNum = 312;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 317;BA.debugLine="Fila = Null";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 321;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("01572947",_js._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
mostCurrent._empresa = mostCurrent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 24;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
mostCurrent._sucursal = mostCurrent._variables._gl_sucursal /*String*/ ;
 //BA.debugLineNum = 25;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
mostCurrent._bodega = mostCurrent._variables._gl_bodega /*String*/ ;
 //BA.debugLineNum = 28;BA.debugLine="Private Txt_Codigo_Descripcion As EditText";
mostCurrent._txt_codigo_descripcion = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Btn_Buscar As Button";
mostCurrent._btn_buscar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Public Id_DocEnc As Int";
_id_docenc = 0;
 //BA.debugLineNum = 33;BA.debugLine="Dim TecladoSoft As IME ' biblioteca IME";
mostCurrent._tecladosoft = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 34;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 36;BA.debugLine="Private XclvDetalle As CustomListView";
mostCurrent._xclvdetalle = new b4a.example3.customlistview();
 //BA.debugLineNum = 37;BA.debugLine="Private Lbl_Codigo As B4XView";
mostCurrent._lbl_codigo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_CodTecnico As B4XView";
mostCurrent._lbl_codtecnico = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Descripcion As B4XView";
mostCurrent._lbl_descripcion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_Datos As B4XView";
mostCurrent._lbl_datos = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Btn_Seleccionar As B4XView";
mostCurrent._btn_seleccionar = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Img_Eliminar As B4XImageView";
mostCurrent._img_eliminar = new BaKapp.Movil.Tag.b4ximageview();
 //BA.debugLineNum = 45;BA.debugLine="Private B4XLoading As B4XLoadingIndicator";
mostCurrent._b4xloading = new BaKapp.Movil.Tag.b4xloadingindicator();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static void  _lv_productos_itemlongclick(int _position,Object _value) throws Exception{
ResumableSub_Lv_Productos_ItemLongClick rsub = new ResumableSub_Lv_Productos_ItemLongClick(null,_position,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_Lv_Productos_ItemLongClick extends BA.ResumableSub {
public ResumableSub_Lv_Productos_ItemLongClick(BaKapp.Movil.Tag.buscar_productos parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
BaKapp.Movil.Tag.buscar_productos parent;
int _position;
Object _value;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
String _codigo = "";
String _descripcion = "";
double _stockbodega = 0;
String _vstock = "";
int _vsalir = 0;
anywheresoftware.b4a.objects.collections.Map _new_row = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 181;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
parent.mostCurrent._empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 182;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
parent.mostCurrent._sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
 //BA.debugLineNum = 183;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
parent.mostCurrent._bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
 //BA.debugLineNum = 184;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
parent._lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
 //BA.debugLineNum = 186;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,buscar_productos.getObject(),BA.ObjectToString(_value),parent.mostCurrent._empresa,parent.mostCurrent._sucursal,parent.mostCurrent._bodega,parent._lista,(int) (1),"");
 //BA.debugLineNum = 188;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 190;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 192;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 194;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 196;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 197;BA.debugLine="Fila =Filas.Get(0)";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 199;BA.debugLine="Dim Codigo As String = Fila.Get(\"Codigo\")";
_codigo = BA.ObjectToString(parent._fila.Get((Object)("Codigo")));
 //BA.debugLineNum = 200;BA.debugLine="Log(Codigo)";
anywheresoftware.b4a.keywords.Common.LogImpl("01441813",_codigo,0);
 //BA.debugLineNum = 201;BA.debugLine="Dim Descripcion As String = Fila.Get(\"Descripci";
_descripcion = BA.ObjectToString(parent._fila.Get((Object)("Descripcion")));
 //BA.debugLineNum = 202;BA.debugLine="Dim StockBodega As Double  = Fila.Get(\"StockBod";
_stockbodega = (double)(BA.ObjectToNumber(parent._fila.Get((Object)("StockBodega"))));
 //BA.debugLineNum = 204;BA.debugLine="Dim vSTOCK As String = \"Stock: \" & StockBodega";
_vstock = "Stock: "+BA.NumberToString(_stockbodega);
 //BA.debugLineNum = 206;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
 //BA.debugLineNum = 207;BA.debugLine="vSalir = Msgbox2(\"¿Confirma la selección?\" & CR";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Confirma la selección?"+anywheresoftware.b4a.keywords.Common.CRLF+_descripcion+anywheresoftware.b4a.keywords.Common.CRLF+_vstock),BA.ObjectToCharSequence(_codigo),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 209;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 211;BA.debugLine="Fila.Put(\"Id_DocEnc\",Frm_Post_01_Formulario.Id";
parent._fila.Put((Object)("Id_DocEnc"),(Object)(parent.mostCurrent._frm_post_01_formulario._id_docenc /*int*/ ));
 //BA.debugLineNum = 213;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 215;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Orde";
parent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
 //BA.debugLineNum = 217;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variab";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 219;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 220;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 223;BA.debugLine="Fila = Null";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 229;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("01441842",_js._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Public Lista As String";
_lista = "";
 //BA.debugLineNum = 13;BA.debugLine="Public ProductoABuscar As String";
_productoabuscar = "";
 //BA.debugLineNum = 14;BA.debugLine="Public Msj As Mensajes";
_msj = new BaKapp.Movil.Tag.mensajes();
 //BA.debugLineNum = 15;BA.debugLine="Public VerStockOtrasBodegas As Boolean";
_verstockotrasbodegas = false;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static void  _sb_buscar_producto(String _vcodigo,String _vdescripcion) throws Exception{
ResumableSub_Sb_Buscar_Producto rsub = new ResumableSub_Sb_Buscar_Producto(null,_vcodigo,_vdescripcion);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Buscar_Producto extends BA.ResumableSub {
public ResumableSub_Sb_Buscar_Producto(BaKapp.Movil.Tag.buscar_productos parent,String _vcodigo,String _vdescripcion) {
this.parent = parent;
this._vcodigo = _vcodigo;
this._vdescripcion = _vdescripcion;
}
BaKapp.Movil.Tag.buscar_productos parent;
String _vcodigo;
String _vdescripcion;
String _vcadena = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String _codigo = "";
String _codtecnico = "";
double _stfi1 = 0;
String _descripcion = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 82;BA.debugLine="Dim vCadena As String";
_vcadena = "";
 //BA.debugLineNum = 84;BA.debugLine="vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescr";
_vcadena = parent.mostCurrent._funciones._fx_cadena_a_buscar_sql /*String*/ (mostCurrent.activityBA,_vdescripcion,"Mp.KOPR+Mp.NOKOPR"+" LIKE '%","");
 //BA.debugLineNum = 86;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
 //BA.debugLineNum = 87;BA.debugLine="B4XLoading.Show";
parent.mostCurrent._b4xloading._show /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="Consulta_Sql = \"SELECT TOP (100) Mp.KOPR AS CODIG";
parent._consulta_sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEPR Mp With (Nolock)"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join MAEST Ms On Ms.EMPRESA = '"+parent.mostCurrent._empresa+"' And Ms.KOSU = '"+parent.mostCurrent._sucursal+"' AND Ms.KOBO = '"+parent.mostCurrent._bodega+"' AND Mp.KOPR = Ms.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join TABBOPR Tb On Tb.EMPRESA = '"+parent.mostCurrent._empresa+"' And Tb.KOSU = '"+parent.mostCurrent._sucursal+"' AND Tb.KOBO = '"+parent.mostCurrent._bodega+"' AND Tb.KOPR = Ms.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"WHERE Mp.KOPR+Mp.NOKOPR  Like '%"+_vcadena+"%'"+anywheresoftware.b4a.keywords.Common.CRLF+"Order by Mp.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Option ( Fast 20 )";
 //BA.debugLineNum = 102;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 104;BA.debugLine="Consulta_Sql = \"SELECT TOP (100) Mp.KOPR AS CODI";
parent._consulta_sql = "SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,"+anywheresoftware.b4a.keywords.Common.CRLF+"Case When '"+parent.mostCurrent._bodega.trim()+"' = '01' Then Isnull(Ms.STOCK_ALAMEDA,0) When '"+parent.mostCurrent._bodega.trim()+"' = '02' Then Isnull(Ms.STOCK_ENEA,0) Else 0 End As STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"--,Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEPR Mp With (Nolock)"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join [@WMS_GATEWAY_STOCK] Ms On Ms.SKU = Mp.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"WHERE Mp.KOPR+Mp.NOKOPR  Like '%"+_vcadena+"%'"+anywheresoftware.b4a.keywords.Common.CRLF+"Order by Mp.KOPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Option ( Fast 20 )";
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 115;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent._consulta_sql,buscar_productos.getObject());
 //BA.debugLineNum = 116;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 117;BA.debugLine="ProgressDialogShow(\"Buscando prooductos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando prooductos..."));
 //BA.debugLineNum = 119;BA.debugLine="If Js.Success Then";
if (true) break;

case 5:
//if
this.state = 18;
if (_js._success /*boolean*/ ) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 121;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 123;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 8:
//if
this.state = 17;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 125;BA.debugLine="Log(vJson)";
anywheresoftware.b4a.keywords.Common.LogImpl("01310765",_vjson,0);
 //BA.debugLineNum = 126;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 127;BA.debugLine="parser.Initialize(vJson)";
_parser.Initialize(_vjson);
 //BA.debugLineNum = 128;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 129;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 133;BA.debugLine="For Each Fila As Map In Table";
if (true) break;

case 11:
//for
this.state = 14;
parent._fila = new anywheresoftware.b4a.objects.collections.Map();
group20 = _table;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if (index20 < groupLen20) {
this.state = 13;
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 21:
//C
this.state = 20;
index20++;
if (true) break;

case 13:
//C
this.state = 21;
 //BA.debugLineNum = 135;BA.debugLine="Dim CODIGO As String = Fila.Get(\"CODIGO\")";
_codigo = BA.ObjectToString(parent._fila.Get((Object)("CODIGO")));
 //BA.debugLineNum = 136;BA.debugLine="Dim CODTECNICO As String = Fila.Get(\"CODTECNIC";
_codtecnico = BA.ObjectToString(parent._fila.Get((Object)("CODTECNICO")));
 //BA.debugLineNum = 137;BA.debugLine="Dim STFI1 As Double  = Fila.Get(\"STFI1\")";
_stfi1 = (double)(BA.ObjectToNumber(parent._fila.Get((Object)("STFI1"))));
 //BA.debugLineNum = 138;BA.debugLine="Dim DESCRIPCION As String = Fila.Get(\"DESCRIPC";
_descripcion = BA.ObjectToString(parent._fila.Get((Object)("DESCRIPCION")));
 //BA.debugLineNum = 144;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent.mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 146;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (160)));
 //BA.debugLineNum = 147;BA.debugLine="p.LoadLayout(\"Items_Productos\")";
_p.LoadLayout("Items_Productos",mostCurrent.activityBA);
 //BA.debugLineNum = 148;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 150;BA.debugLine="Btn_Seleccionar.Tag = CODIGO";
parent.mostCurrent._btn_seleccionar.setTag((Object)(_codigo));
 //BA.debugLineNum = 151;BA.debugLine="Lbl_Codigo.Text = CODIGO";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(_codigo));
 //BA.debugLineNum = 152;BA.debugLine="Lbl_CodTecnico.Text = CODTECNICO";
parent.mostCurrent._lbl_codtecnico.setText(BA.ObjectToCharSequence(_codtecnico));
 //BA.debugLineNum = 153;BA.debugLine="Lbl_Descripcion.Text = DESCRIPCION";
parent.mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(_descripcion));
 //BA.debugLineNum = 154;BA.debugLine="Lbl_Datos.Text = \"Stock: \" & STFI1 & \", Bod: \"";
parent.mostCurrent._lbl_datos.setText(BA.ObjectToCharSequence("Stock: "+BA.NumberToString(_stfi1)+", Bod: "+parent.mostCurrent._bodega));
 //BA.debugLineNum = 156;BA.debugLine="XclvDetalle.Add(p,\"\")";
parent.mostCurrent._xclvdetalle._add(_p,(Object)(""));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 //BA.debugLineNum = 160;BA.debugLine="Log(CODIGO & \" - \" & DESCRIPCION)";
anywheresoftware.b4a.keywords.Common.LogImpl("01310800",_codigo+" - "+_descripcion,0);
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 164;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se encontraron registros"),anywheresoftware.b4a.keywords.Common.False);
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
 //BA.debugLineNum = 170;BA.debugLine="B4XLoading.Hide";
parent.mostCurrent._b4xloading._hide /*String*/ ();
 //BA.debugLineNum = 171;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _txt_codigo_descripcion_enterpressed() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Private Sub Txt_Codigo_Descripcion_EnterPressed";
 //BA.debugLineNum = 235;BA.debugLine="Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Tx";
_sb_buscar_producto(mostCurrent._txt_codigo_descripcion.getText(),mostCurrent._txt_codigo_descripcion.getText());
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
}
