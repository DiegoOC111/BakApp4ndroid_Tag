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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_etiquetas");
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

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Serial _serial1 = null;
public static anywheresoftware.b4a.objects.SocketWrapper _connectedprinter = null;
public static int _printerport = 0;
public static anywheresoftware.b4a.randomaccessfile.AsyncStreams _astreams = null;
public static String _stringprecio = "";
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
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
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
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
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
public static void  _activity_create(boolean _firsttime) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 58;BA.debugLine="Activity.LoadLayout(\"Etiqueta_men\")";
parent.mostCurrent._activity.LoadLayout("Etiqueta_men",mostCurrent.activityBA);
 //BA.debugLineNum = 61;BA.debugLine="Changes = False";
parent._changes = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 62;BA.debugLine="Dim Js As HttpJob = Sb_BuscarListaPrecios(Me)";
_js = _sb_buscarlistaprecios(frm_etiquetas.getObject());
 //BA.debugLineNum = 63;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 65;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 66;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 68;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 69;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 71;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 72;BA.debugLine="Msgbox2Async(\"Error al buscar la lista de preci";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar la lista de precios."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 73;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 75;BA.debugLine="If Result5 = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 79;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
 //BA.debugLineNum = 82;BA.debugLine="DataPrice = ParseOtherPriceJSON(vJson)";
parent.mostCurrent._dataprice = _parseotherpricejson(_vjson);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 85;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad.";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 86;BA.debugLine="Msgbox2Async(\"Error al comunicarse con la base d";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error al comunicarse con la base de datos."),BA.ObjectToCharSequence("Error"),"OK","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 87;BA.debugLine="Wait For Msgbox_Result (Result5 As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_result5 = (Integer) result[0];
;
 //BA.debugLineNum = 88;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 95;BA.debugLine="stringListPrice.Initialize";
parent.mostCurrent._stringlistprice.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="For Each p As OtherPriceData In DataPrice";
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
 //BA.debugLineNum = 97;BA.debugLine="stringListPrice.Add(p.KOLT &\" | \"& p.NOKOLT)";
parent.mostCurrent._stringlistprice.Add((Object)(_p.KOLT /*String*/ +" | "+_p.NOKOLT /*String*/ ));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 99;BA.debugLine="SelectedPrice = 0";
parent._selectedprice = (int) (0);
 //BA.debugLineNum = 100;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(parent.mostCurrent._dataprice.Get(parent._selectedprice));
 //BA.debugLineNum = 101;BA.debugLine="stringPrecio = aux.KOLT";
parent._stringprecio = _aux.KOLT /*String*/ ;
 //BA.debugLineNum = 102;BA.debugLine="LeerDatos";
_leerdatos();
 //BA.debugLineNum = 103;BA.debugLine="CargarLista";
_cargarlista();
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static void  _msgbox_result(int _result5) throws Exception{
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cerrar_click() throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Private Sub Btn_Cerrar_Click";
 //BA.debugLineNum = 311;BA.debugLine="General.Visible= True";
mostCurrent._general.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 312;BA.debugLine="Panel_Conf.Visible = False";
mostCurrent._panel_conf.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return "";
}
public static String  _btn_conf_click() throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Private Sub Btn_Conf_Click";
 //BA.debugLineNum = 304;BA.debugLine="General.Visible= False";
mostCurrent._general.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 305;BA.debugLine="Btn_Guardar.Color = ColorDisabled";
mostCurrent._btn_guardar.setColor(_colordisabled);
 //BA.debugLineNum = 306;BA.debugLine="IsEnabled = False";
_isenabled = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 307;BA.debugLine="Panel_Conf.Visible = True";
mostCurrent._panel_conf.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return "";
}
public static void  _btn_ed_id_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 325;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 326;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 327;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 331;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 333;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 334;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 337;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese la ip\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese la ip"));
 //BA.debugLineNum = 338;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 341;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[0];
;
 //BA.debugLineNum = 342;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
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
 //BA.debugLineNum = 343;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 345;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 346;BA.debugLine="Lbl_IP.Text = InputTemplate.Text";
parent.mostCurrent._lbl_ip.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _res) throws Exception{
}
public static void  _btn_ed_nombre_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 351;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 352;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 353;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 357;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 359;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 360;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 364;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese el nombre\"";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese el nombre"));
 //BA.debugLineNum = 365;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 367;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_res = (Integer) result[0];
;
 //BA.debugLineNum = 368;BA.debugLine="If (Res = DialogResponse.CANCEL) Then";
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
 //BA.debugLineNum = 369;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 371;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 372;BA.debugLine="Lbl_Nombre.Text = InputTemplate.Text";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(_inputtemplate._text /*String*/ ));
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_ed_precio_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 454;BA.debugLine="InputListAsync(stringListPrice, \"Seleccione preci";
anywheresoftware.b4a.keywords.Common.InputListAsync(parent.mostCurrent._stringlistprice,BA.ObjectToCharSequence("Seleccione precio "),parent._selectedprice,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 455;BA.debugLine="Wait For InputList_Result (Index As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_index = (Integer) result[0];
;
 //BA.debugLineNum = 456;BA.debugLine="If Index <> DialogResponse.CANCEL Then";
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
 //BA.debugLineNum = 457;BA.debugLine="SelectedPrice = Index";
parent._selectedprice = _index;
 //BA.debugLineNum = 458;BA.debugLine="Dim  aux As OtherPriceData = DataPrice.Get(Index";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(parent.mostCurrent._dataprice.Get(_index));
 //BA.debugLineNum = 459;BA.debugLine="stringPrecio = aux.KOLT&\"|\"&aux.NOKOLT";
parent._stringprecio = _aux.KOLT /*String*/ +"|"+_aux.NOKOLT /*String*/ ;
 //BA.debugLineNum = 460;BA.debugLine="Lbl_precio_act.Text = stringPrecio";
parent.mostCurrent._lbl_precio_act.setText(BA.ObjectToCharSequence(parent._stringprecio));
 //BA.debugLineNum = 461;BA.debugLine="Changes = True";
parent._changes = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _inputlist_result(int _index) throws Exception{
}
public static String  _btn_etq1_click() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Private Sub Btn_Etq1_Click";
 //BA.debugLineNum = 316;BA.debugLine="StartActivity(Frm_impresion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_impresion.getObject()));
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public static String  _btn_etq2_click() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Private Sub Btn_Etq2_Click";
 //BA.debugLineNum = 321;BA.debugLine="StartActivity(Frm_impresion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_impresion.getObject()));
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public static void  _btn_guardar_click() throws Exception{
ResumableSub_Btn_Guardar_Click rsub = new ResumableSub_Btn_Guardar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Guardar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Guardar_Click(BaKapp.Movil.Tag.frm_etiquetas parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_etiquetas parent;
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
 //BA.debugLineNum = 405;BA.debugLine="If Changes Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._changes) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 406;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 407;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dang";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
 //BA.debugLineNum = 408;BA.debugLine="Msgbox2Async(\"Se realizaron cambios en la config";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se realizaron cambios en la configuración, debe probar conexión antes de guradar"),BA.ObjectToCharSequence("Configuración Impresora "),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 409;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 24;
return;
case 24:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 410;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 412;BA.debugLine="If IsEnabled Then";

case 4:
//if
this.state = 23;
if (parent._isenabled) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 413;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 414;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"save.png");
 //BA.debugLineNum = 415;BA.debugLine="Msgbox2Async(\"¿Desea guardar la configuración ac";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Desea guardar la configuración actual?"),BA.ObjectToCharSequence("Configuración local"),"Si","No","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 416;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 25;
return;
case 25:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 417;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 22;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 418;BA.debugLine="If Lbl_IP.Text <> \"---\" Then";
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
 //BA.debugLineNum = 419;BA.debugLine="If Lbl_Nombre.Text <> \"---\" Then";
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
 //BA.debugLineNum = 420;BA.debugLine="CrearDatos";
_creardatos();
 //BA.debugLineNum = 421;BA.debugLine="Btn_Etq1.Enabled = True";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 422;BA.debugLine="Lbl_Imprimir.Visible = False";
parent.mostCurrent._lbl_imprimir.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 424;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 425;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-d";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
 //BA.debugLineNum = 426;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, asigne un nombre"),BA.ObjectToCharSequence("Configuración Impresora"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 427;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 26;
return;
case 26:
//C
this.state = 18;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 428;BA.debugLine="Return";
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
 //BA.debugLineNum = 431;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 432;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-da";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
 //BA.debugLineNum = 433;BA.debugLine="Msgbox2Async(\"No puede quedar un parametro en";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede quedar un parametro en blanco, Asigne una ip"),BA.ObjectToCharSequence("Configuración Impresora "),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 434;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 27;
return;
case 27:
//C
this.state = 21;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 435;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 440;BA.debugLine="Btn_Cerrar.Enabled = True";
parent.mostCurrent._btn_cerrar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 441;BA.debugLine="Btn_Etq1.Enabled = True";
parent.mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 443;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = -1;
;
 //BA.debugLineNum = 445;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 446;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
 //BA.debugLineNum = 447;BA.debugLine="Msgbox2Async(\"Antes de guardar una configuración";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Antes de guardar una configuración se debe de probar conexión"),BA.ObjectToCharSequence("Configuración local"),"Continuar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 448;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 28;
return;
case 28:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_probar_conexion_click() throws Exception{
ResumableSub_Btn_Probar_Conexion_Click rsub = new ResumableSub_Btn_Probar_Conexion_Click(null);
rsub.resume(processBA, null);
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 387;BA.debugLine="If Ping(Lbl_IP.Text) Then";
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
 //BA.debugLineNum = 388;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 389;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 390;BA.debugLine="Msgbox2Async(\"Conexión exitosa\" , \"Notificación\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexión exitosa"),BA.ObjectToCharSequence("Notificación"),"Aceptar","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 391;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 393;BA.debugLine="IsEnabled = True";
parent._isenabled = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 394;BA.debugLine="Changes = False";
parent._changes = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 395;BA.debugLine="Btn_Guardar.Color = ColorEnabled";
parent.mostCurrent._btn_guardar.setColor(parent._colorenabled);
 //BA.debugLineNum = 396;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 398;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 399;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"security-dange";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"security-danger.png");
 //BA.debugLineNum = 400;BA.debugLine="Msgbox2Async(\"Conexión Fallida\" , \"Notificación\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexión Fallida"),BA.ObjectToCharSequence("Notificación"),"Aceptar","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 401;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 6;
return;
case 6:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_volver_click() throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Private Sub Btn_Volver_Click";
 //BA.debugLineNum = 467;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return "";
}
public static String  _cargarlista() throws Exception{
anywheresoftware.b4a.objects.collections.List _listapersonas = null;
anywheresoftware.b4a.objects.collections.Map _etiqueta = null;
anywheresoftware.b4a.objects.collections.Map _etiqueta2 = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
 //BA.debugLineNum = 182;BA.debugLine="Sub CargarLista";
 //BA.debugLineNum = 183;BA.debugLine="clv.Clear";
mostCurrent._clv._clear();
 //BA.debugLineNum = 184;BA.debugLine="Dim ListaPersonas As List";
_listapersonas = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 185;BA.debugLine="ListaPersonas.Initialize";
_listapersonas.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="Dim Etiqueta As Map";
_etiqueta = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 188;BA.debugLine="Etiqueta.Initialize";
_etiqueta.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="Etiqueta.Put(\"tipo\", \"Venta\")";
_etiqueta.Put((Object)("tipo"),(Object)("Venta"));
 //BA.debugLineNum = 190;BA.debugLine="Etiqueta.Put(\"imagen\", \"Etiqueta_venta.png\")";
_etiqueta.Put((Object)("imagen"),(Object)("Etiqueta_venta.png"));
 //BA.debugLineNum = 192;BA.debugLine="Dim Etiqueta2 As Map";
_etiqueta2 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 193;BA.debugLine="Etiqueta2.Initialize";
_etiqueta2.Initialize();
 //BA.debugLineNum = 194;BA.debugLine="Etiqueta2.Put(\"tipo\", \"Bodega\")";
_etiqueta2.Put((Object)("tipo"),(Object)("Bodega"));
 //BA.debugLineNum = 195;BA.debugLine="Etiqueta2.Put(\"imagen\", \"Etiqueta_bodega.png\")";
_etiqueta2.Put((Object)("imagen"),(Object)("Etiqueta_bodega.png"));
 //BA.debugLineNum = 197;BA.debugLine="ListaPersonas.Add(Etiqueta)";
_listapersonas.Add((Object)(_etiqueta.getObject()));
 //BA.debugLineNum = 198;BA.debugLine="ListaPersonas.Add(Etiqueta2)";
_listapersonas.Add((Object)(_etiqueta2.getObject()));
 //BA.debugLineNum = 200;BA.debugLine="For Each Etiqueta As Map In ListaPersonas";
_etiqueta = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group14 = _listapersonas;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_etiqueta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));
 //BA.debugLineNum = 201;BA.debugLine="Dim p As Panel = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._xui.CreatePanel(processBA,"").getObject()));
 //BA.debugLineNum = 202;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clv.AsView.Width, 1";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),mostCurrent._clv._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
 //BA.debugLineNum = 203;BA.debugLine="p.LoadLayout(\"item_nombre_imagen\")";
_p.LoadLayout("item_nombre_imagen",mostCurrent.activityBA);
 //BA.debugLineNum = 206;BA.debugLine="Dim lbl As Label = p.GetView(0) ' primer control";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 207;BA.debugLine="Dim img As ImageView = p.GetView(1) ' segundo co";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_p.GetView((int) (1)).getObject()));
 //BA.debugLineNum = 209;BA.debugLine="lbl.Text = Etiqueta.Get(\"tipo\")";
_lbl.setText(BA.ObjectToCharSequence(_etiqueta.Get((Object)("tipo"))));
 //BA.debugLineNum = 210;BA.debugLine="img.Bitmap = LoadBitmap(File.DirAssets, Etiqueta";
_img.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_etiqueta.Get((Object)("imagen")))).getObject()));
 //BA.debugLineNum = 212;BA.debugLine="clv.Add(p, \"\")";
mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
 }
};
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public static String  _creardatos() throws Exception{
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;
String _stringnoprecio = "";
 //BA.debugLineNum = 164;BA.debugLine="Sub CrearDatos()";
 //BA.debugLineNum = 166;BA.debugLine="Dim datos As Map";
mostCurrent._datos = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 167;BA.debugLine="datos.Initialize";
mostCurrent._datos.Initialize();
 //BA.debugLineNum = 168;BA.debugLine="datos.Put(\"Ip\",Lbl_IP.Text )";
mostCurrent._datos.Put((Object)("Ip"),(Object)(mostCurrent._lbl_ip.getText()));
 //BA.debugLineNum = 169;BA.debugLine="datos.Put(\"Nombre\", Lbl_Nombre.Text )";
mostCurrent._datos.Put((Object)("Nombre"),(Object)(mostCurrent._lbl_nombre.getText()));
 //BA.debugLineNum = 170;BA.debugLine="datos.Put(\"Seleccionado\", SelectedPrice)";
mostCurrent._datos.Put((Object)("Seleccionado"),(Object)(_selectedprice));
 //BA.debugLineNum = 171;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Selecte";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(mostCurrent._dataprice.Get(_selectedprice));
 //BA.debugLineNum = 172;BA.debugLine="stringPrecio = aux.KOLT";
_stringprecio = _aux.KOLT /*String*/ ;
 //BA.debugLineNum = 173;BA.debugLine="Dim stringNoPrecio As String  = aux.NOKOLT";
_stringnoprecio = _aux.NOKOLT /*String*/ ;
 //BA.debugLineNum = 174;BA.debugLine="datos.Put(\"KOLT\",stringPrecio )";
mostCurrent._datos.Put((Object)("KOLT"),(Object)(_stringprecio));
 //BA.debugLineNum = 175;BA.debugLine="datos.Put(\"NOKOLT\",stringNoPrecio )";
mostCurrent._datos.Put((Object)("NOKOLT"),(Object)(_stringnoprecio));
 //BA.debugLineNum = 177;BA.debugLine="File.WriteMap(File.DirInternal, \"impresora.map\",";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map",mostCurrent._datos);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private PrinterMap As Map";
mostCurrent._printermap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="Private PrinterList As ListView";
mostCurrent._printerlist = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private SelectedPrinterIP As String  ' IP de la i";
mostCurrent._selectedprinterip = "";
 //BA.debugLineNum = 23;BA.debugLine="Dim datos As Map";
mostCurrent._datos = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 25;BA.debugLine="Dim IsEnabled As Boolean";
_isenabled = false;
 //BA.debugLineNum = 26;BA.debugLine="Private Btn_Conf As Button";
mostCurrent._btn_conf = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Btn_Cerrar As Button";
mostCurrent._btn_cerrar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private General As Panel";
mostCurrent._general = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Panel_Conf As Panel";
mostCurrent._panel_conf = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Btn_Etq1 As Button";
mostCurrent._btn_etq1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Btn_Etq2 As Button";
mostCurrent._btn_etq2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Img_Venta As ImageView";
mostCurrent._img_venta = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Img_bodega As ImageView";
mostCurrent._img_bodega = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Btn_Ed_Nombre As Button";
mostCurrent._btn_ed_nombre = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Btn_Ed_ID As Button";
mostCurrent._btn_ed_id = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Lbl_Nombre As Label";
mostCurrent._lbl_nombre = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Dim stringListPrice As List";
mostCurrent._stringlistprice = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_Estado As Label";
mostCurrent._lbl_estado = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Btn_Probar_Conexion As Button";
mostCurrent._btn_probar_conexion = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_Imprimir As Label";
mostCurrent._lbl_imprimir = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Lbl_IP As Label";
mostCurrent._lbl_ip = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private clv As CustomListView";
mostCurrent._clv = new b4a.example3.customlistview();
 //BA.debugLineNum = 43;BA.debugLine="Private ColorEnabled As Int = Colors.RGB(86,73,25";
_colorenabled = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (86),(int) (73),(int) (255));
 //BA.debugLineNum = 44;BA.debugLine="Private ColorDisabled As Int = Colors.RGB(162,156";
_colordisabled = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (162),(int) (156),(int) (255));
 //BA.debugLineNum = 45;BA.debugLine="Dim SelectedPrice As Int";
_selectedprice = 0;
 //BA.debugLineNum = 46;BA.debugLine="Private Btn_Guardar As Button";
mostCurrent._btn_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Label5 As Label";
mostCurrent._label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Dim DataPrice As List";
mostCurrent._dataprice = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 49;BA.debugLine="Private Btn_Ed_Precio As Button";
mostCurrent._btn_ed_precio = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Dim Changes As Boolean";
_changes = false;
 //BA.debugLineNum = 52;BA.debugLine="Private Btn_Volver As Button";
mostCurrent._btn_volver = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private Lbl_precio_act As Label";
mostCurrent._lbl_precio_act = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _leerdatos() throws Exception{
BaKapp.Movil.Tag.frm_impresion._otherpricedata _aux = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
 //BA.debugLineNum = 215;BA.debugLine="Sub LeerDatos()";
 //BA.debugLineNum = 216;BA.debugLine="If File.Exists(File.DirInternal, \"impresora.map\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map")) { 
 //BA.debugLineNum = 217;BA.debugLine="datos = File.ReadMap(File.DirInternal, \"impresor";
mostCurrent._datos = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"impresora.map");
 //BA.debugLineNum = 218;BA.debugLine="Lbl_IP.Text = datos.Get(\"Ip\")";
mostCurrent._lbl_ip.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Ip"))));
 //BA.debugLineNum = 219;BA.debugLine="Lbl_Nombre.Text = datos.Get(\"Nombre\")";
mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(mostCurrent._datos.Get((Object)("Nombre"))));
 //BA.debugLineNum = 220;BA.debugLine="Lbl_precio_act.Text =  datos.Get(\"KOLT\")  &\"|\"&";
mostCurrent._lbl_precio_act.setText(BA.ObjectToCharSequence(BA.ObjectToString(mostCurrent._datos.Get((Object)("KOLT")))+"|"+BA.ObjectToString(mostCurrent._datos.Get((Object)("NOKOLT")))));
 //BA.debugLineNum = 221;BA.debugLine="Dim aux As OtherPriceData = DataPrice.Get(Select";
_aux = (BaKapp.Movil.Tag.frm_impresion._otherpricedata)(mostCurrent._dataprice.Get(_selectedprice));
 //BA.debugLineNum = 222;BA.debugLine="SelectedPrice = datos.Get(\"Seleccionado\")";
_selectedprice = (int)(BA.ObjectToNumber(mostCurrent._datos.Get((Object)("Seleccionado"))));
 //BA.debugLineNum = 223;BA.debugLine="stringPrecio = aux.KOLT";
_stringprecio = _aux.KOLT /*String*/ ;
 //BA.debugLineNum = 224;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 225;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 226;BA.debugLine="Msgbox2Async(\"Se encontro la configuración de im";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Se encontro la configuración de impresora"),BA.ObjectToCharSequence("Impresora encontrada"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 227;BA.debugLine="Btn_Etq1.Enabled=True";
mostCurrent._btn_etq1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 228;BA.debugLine="Lbl_Imprimir.Visible = False";
mostCurrent._lbl_imprimir.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 230;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 231;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"printer.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"printer.png");
 //BA.debugLineNum = 232;BA.debugLine="Msgbox2Async(\"Falta la configuración la configur";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración la configuración de la impresora."),BA.ObjectToCharSequence("Alerta"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 233;BA.debugLine="Btn_Conf_Click";
_btn_conf_click();
 //BA.debugLineNum = 234;BA.debugLine="Btn_Cerrar.Enabled = False";
mostCurrent._btn_cerrar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 236;BA.debugLine="Log(\"El archivo no existe.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("33342357","El archivo no existe.",0);
 //BA.debugLineNum = 237;BA.debugLine="datos.Initialize  ' Por si necesitas usar el Map";
mostCurrent._datos.Initialize();
 };
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _parseotherpricejson(String _json) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _tablelist = null;
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
BaKapp.Movil.Tag.frm_impresion._otherpricedata _data = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub ParseOtherPriceJSON(json As String) As List";
 //BA.debugLineNum = 108;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 109;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 110;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 111;BA.debugLine="Dim tableList As List = root.Get(\"Table\")";
_tablelist = new anywheresoftware.b4a.objects.collections.List();
_tablelist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 113;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 114;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="For Each entry As Map In tableList";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _tablelist;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));
 //BA.debugLineNum = 117;BA.debugLine="Dim data As OtherPriceData";
_data = new BaKapp.Movil.Tag.frm_impresion._otherpricedata();
 //BA.debugLineNum = 118;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 119;BA.debugLine="data.TILT = entry.Get(\"TILT\")";
_data.TILT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TILT")));
 //BA.debugLineNum = 120;BA.debugLine="data.KOLT = entry.Get(\"KOLT\")";
_data.KOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("KOLT")));
 //BA.debugLineNum = 121;BA.debugLine="data.MELT = entry.Get(\"MELT\")";
_data.MELT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MELT")));
 //BA.debugLineNum = 122;BA.debugLine="data.MOLT = entry.Get(\"MOLT\")";
_data.MOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("MOLT")));
 //BA.debugLineNum = 123;BA.debugLine="data.TIMOLT = entry.Get(\"TIMOLT\")";
_data.TIMOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("TIMOLT")));
 //BA.debugLineNum = 124;BA.debugLine="data.NOKOLT = entry.Get(\"NOKOLT\")";
_data.NOKOLT /*String*/  = BA.ObjectToString(_entry.Get((Object)("NOKOLT")));
 //BA.debugLineNum = 126;BA.debugLine="If entry.ContainsKey(\"FEVI\") And entry.Get(\"FEVI";
if (_entry.ContainsKey((Object)("FEVI")) && _entry.Get((Object)("FEVI"))!= null) { 
 //BA.debugLineNum = 127;BA.debugLine="data.FEVI = entry.Get(\"FEVI\")";
_data.FEVI /*String*/  = BA.ObjectToString(_entry.Get((Object)("FEVI")));
 }else {
 //BA.debugLineNum = 129;BA.debugLine="data.FEVI = \"\"";
_data.FEVI /*String*/  = "";
 };
 //BA.debugLineNum = 132;BA.debugLine="data.OPERA = entry.Get(\"OPERA\")";
_data.OPERA /*String*/  = BA.ObjectToString(_entry.Get((Object)("OPERA")));
 //BA.debugLineNum = 133;BA.debugLine="data.ECUDEF01UD = entry.Get(\"ECUDEF01UD\")";
_data.ECUDEF01UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF01UD")));
 //BA.debugLineNum = 134;BA.debugLine="data.ECUDEF02UD = entry.Get(\"ECUDEF02UD\")";
_data.ECUDEF02UD /*String*/  = BA.ObjectToString(_entry.Get((Object)("ECUDEF02UD")));
 //BA.debugLineNum = 136;BA.debugLine="result.Add(data)";
_result.Add((Object)(_data));
 }
};
 //BA.debugLineNum = 139;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public static boolean  _ping(String _ip) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
int _r = 0;
 //BA.debugLineNum = 288;BA.debugLine="Sub Ping(IP As String) As Boolean";
 //BA.debugLineNum = 289;BA.debugLine="Try";
try { //BA.debugLineNum = 290;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 291;BA.debugLine="Dim r As Int = p.Shell(\"ping -c 1 -w 1 \" & IP, N";
_r = _p.Shell("ping -c 1 -w 1 "+_ip,(String[])(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(anywheresoftware.b4a.keywords.Common.Null),(java.lang.StringBuilder)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 292;BA.debugLine="Return (r = 0)  ' Si el ping es exitoso, devuelv";
if (true) return (_r==0);
 } 
       catch (Exception e6) {
			processBA.setLastException(e6); //BA.debugLineNum = 294;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Serial1 As Serial";
_serial1 = new anywheresoftware.b4a.objects.Serial();
 //BA.debugLineNum = 10;BA.debugLine="Private ConnectedPrinter As Socket";
_connectedprinter = new anywheresoftware.b4a.objects.SocketWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private PrinterPort As Int = 9100  ' Puerto están";
_printerport = (int) (9100);
 //BA.debugLineNum = 12;BA.debugLine="Private AStreams As AsyncStreams";
_astreams = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 13;BA.debugLine="Dim stringPrecio As String";
_stringprecio = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static BaKapp.Movil.Tag.httpjob  _sb_buscarlistaprecios(Object _me_) throws Exception{
String _vxml = "";
String _poststring = "";
BaKapp.Movil.Tag.httpjob _js = null;
 //BA.debugLineNum = 142;BA.debugLine="Public Sub Sb_BuscarListaPrecios(Me_ As Object) As";
 //BA.debugLineNum = 144;BA.debugLine="Dim vXml As String = $\"<?xml version=\"1.0\" encodi";
_vxml = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"+"  <soap:Body>\n"+"    <Sb_BuscarListaPrecios xmlns=\"http://BakApp\" />\n"+"  </soap:Body>\n"+"</soap:Envelope>");
 //BA.debugLineNum = 150;BA.debugLine="Dim PostString As String =\"http://\" & Variables.G";
_poststring = "http://"+mostCurrent._variables._global_ip_webservice /*String*/ +"/Ws_BakApp.asmx";
 //BA.debugLineNum = 151;BA.debugLine="Dim Js As HttpJob";
_js = new BaKapp.Movil.Tag.httpjob();
 //BA.debugLineNum = 153;BA.debugLine="Js.Initialize(\"\",Me_)'";
_js._initialize /*String*/ (processBA,"",_me_);
 //BA.debugLineNum = 154;BA.debugLine="Js.PostString(PostString,vXml)";
_js._poststring /*String*/ (_poststring,_vxml);
 //BA.debugLineNum = 155;BA.debugLine="Js.GetRequest.SetContentType(\"text/xml; charset=u";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/xml; charset=utf-8");
 //BA.debugLineNum = 156;BA.debugLine="Js.GetRequest.SetHeader(\"SOAPAction\",$\"\"http://Ba";
_js._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("SOAPAction",("\"http://BakApp/Sb_BuscarListaPrecios\""));
 //BA.debugLineNum = 158;BA.debugLine="Return Js";
if (true) return _js;
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
}
