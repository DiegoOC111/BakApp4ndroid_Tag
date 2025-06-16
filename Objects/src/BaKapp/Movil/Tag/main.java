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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _txt_clave = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_aceptar_login = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_version = null;
public anywheresoftware.b4a.objects.IME _tecladosoft = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_id_dispositivo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_conf_acceso_ws = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public BaKapp.Movil.Tag.b4xdialog _dialog = null;
public BaKapp.Movil.Tag.b4xfloattextfield _txt_flp_webservice = null;
public b4a.example.dateutils _dateutils = null;
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
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (frm_impresion.mostCurrent != null);
vis = vis | (frm_etiquetas.mostCurrent != null);
vis = vis | (buscar_entidad.mostCurrent != null);
vis = vis | (buscar_productos.mostCurrent != null);
vis = vis | (conf_local.mostCurrent != null);
vis = vis | (frm_buscar_documento.mostCurrent != null);
vis = vis | (frm_documentos_generados.mostCurrent != null);
vis = vis | (frm_editar_obsoc.mostCurrent != null);
vis = vis | (frm_infostockxprod.mostCurrent != null);
vis = vis | (frm_menu_post_venta.mostCurrent != null);
vis = vis | (frm_menu_principal.mostCurrent != null);
vis = vis | (frm_post_01_descuentos.mostCurrent != null);
vis = vis | (frm_post_01_formulario.mostCurrent != null);
vis = vis | (frm_post_01_producto.mostCurrent != null);
return vis;}
public static void  _activity_create(boolean _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
BaKapp.Movil.Tag.main parent;
boolean _firsttime;
String _dbfilename = "";
String _dbfiledir = "";
String _directoriodef = "";
String _targetdir = "";
int _result = 0;
String _line = "";
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 57;BA.debugLine="Activity.LoadLayout(\"Acreditacion_Login\")";
parent.mostCurrent._activity.LoadLayout("Acreditacion_Login",mostCurrent.activityBA);
 //BA.debugLineNum = 58;BA.debugLine="dialog.Initialize(Activity)";
parent.mostCurrent._dialog._initialize /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject())));
 //BA.debugLineNum = 59;BA.debugLine="dialog.Title = \"Conexión WebService\"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("Conexión WebService");
 //BA.debugLineNum = 65;BA.debugLine="DisableStrictMode";
_disablestrictmode();
 //BA.debugLineNum = 67;BA.debugLine="Variables.Global_Version_BakApp = Application.Ver";
parent.mostCurrent._variables._global_version_bakapp /*String*/  = anywheresoftware.b4a.keywords.Common.Application.getVersionName();
 //BA.debugLineNum = 70;BA.debugLine="Lbl_Version.Text = Application.LabelName & \" Vers";
parent.mostCurrent._lbl_version.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()+" Versión: "+anywheresoftware.b4a.keywords.Common.Application.getVersionName()));
 //BA.debugLineNum = 71;BA.debugLine="Txt_Clave.PasswordMode=False";
parent.mostCurrent._txt_clave.setPasswordMode(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 73;BA.debugLine="Dim DBFileName As String = \"bakapp_db.db\" '\"BakAp";
_dbfilename = "bakapp_db.db";
 //BA.debugLineNum = 74;BA.debugLine="Dim DBFileDir As String";
_dbfiledir = "";
 //BA.debugLineNum = 75;BA.debugLine="Dim DirectorioDef As String= DBUtils.GetDBFolder";
_directoriodef = parent.mostCurrent._dbutils._getdbfolder /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 77;BA.debugLine="If File.Exists(DirectorioDef, DBFileName) = True";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_directoriodef,_dbfilename)==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 78;BA.debugLine="File.Delete(DirectorioDef, \"bakapp_db.db\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_directoriodef,"bakapp_db.db");
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 81;BA.debugLine="DBFileDir = DBUtils.CopyDBFromAssets(DBFileName)";
_dbfiledir = parent.mostCurrent._dbutils._copydbfromassets /*String*/ (mostCurrent.activityBA,_dbfilename);
 //BA.debugLineNum = 82;BA.debugLine="Variables.vSql.Initialize(DBFileDir, DBFileName,";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(_dbfiledir,_dbfilename,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 93;BA.debugLine="Variables.Global_IdDispositivo = Funciones.Fx_Tra";
parent.mostCurrent._variables._global_iddispositivo /*String*/  = parent.mostCurrent._funciones._fx_traer_iddispositivo /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 95;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Clave)";
parent.mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(parent.mostCurrent._txt_clave.getObject()));
 //BA.debugLineNum = 96;BA.debugLine="Lbl_Id_Dispositivo.Text = \"Id. dispositivo: \" & V";
parent.mostCurrent._lbl_id_dispositivo.setText(BA.ObjectToCharSequence("Id. dispositivo: "+parent.mostCurrent._variables._global_iddispositivo /*String*/ ));
 //BA.debugLineNum = 112;BA.debugLine="Dim TargetDir As String = DBUtils.GetDBFolder";
_targetdir = parent.mostCurrent._dbutils._getdbfolder /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 114;BA.debugLine="If Not(File.Exists(TargetDir, \"ConexionWebService";
if (true) break;

case 5:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,"ConexionWebService.txt"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 14;
 //BA.debugLineNum = 115;BA.debugLine="Msgbox2Async(\"Falta la configuración al Web Serv";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración al Web Service."),BA.ObjectToCharSequence("Validación"),"Ok","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 116;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 15;
return;
case 15:
//C
this.state = 14;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 117;BA.debugLine="Log(\"No existe el archivo ConexionWebService.txt";
anywheresoftware.b4a.keywords.Common.LogImpl("5131136","No existe el archivo ConexionWebService.txt",0);
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 119;BA.debugLine="For Each line As String In File.ReadList(TargetD";
if (true) break;

case 10:
//for
this.state = 13;
group25 = anywheresoftware.b4a.keywords.Common.File.ReadList(_targetdir,"ConexionWebService.txt");
index25 = 0;
groupLen25 = group25.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 13;
if (index25 < groupLen25) {
this.state = 12;
_line = BA.ObjectToString(group25.Get(index25));}
if (true) break;

case 17:
//C
this.state = 16;
index25++;
if (true) break;

case 12:
//C
this.state = 17;
 //BA.debugLineNum = 122;BA.debugLine="Variables.Global_Ip_WebService = line";
parent.mostCurrent._variables._global_ip_webservice /*String*/  = _line;
 //BA.debugLineNum = 123;BA.debugLine="Exit";
this.state = 13;
if (true) break;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 125;BA.debugLine="Log(Variables.Global_Ip_WebService)";
anywheresoftware.b4a.keywords.Common.LogImpl("5131144",parent.mostCurrent._variables._global_ip_webservice /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
int _vsalir = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
 //BA.debugLineNum = 315;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 316;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 317;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
 //BA.debugLineNum = 318;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 319;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"exit.png");
 //BA.debugLineNum = 320;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de cerrar la apl";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de cerrar la aplicación?"),BA.ObjectToCharSequence("S A L I R"),"Si","","No",(android.graphics.Bitmap)(_bmp1.getObject()),mostCurrent.activityBA);
 //BA.debugLineNum = 327;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 328;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 330;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
 //BA.debugLineNum = 333;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public static void  _btn_aceptar_login_click() throws Exception{
ResumableSub_Btn_Aceptar_Login_Click rsub = new ResumableSub_Btn_Aceptar_Login_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Aceptar_Login_Click extends BA.ResumableSub {
public ResumableSub_Btn_Aceptar_Login_Click(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.main parent;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
BaKapp.Movil.Tag.conectar_conf _conf = null;
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
 //BA.debugLineNum = 164;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 166;BA.debugLine="Btn_Aceptar_Login.Enabled = False";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 167;BA.debugLine="Txt_Clave.Enabled = False";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 168;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = False";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 170;BA.debugLine="Dim Conf As Conectar_Conf";
_conf = new BaKapp.Movil.Tag.conectar_conf();
 //BA.debugLineNum = 171;BA.debugLine="Conf.Initialize";
_conf._initialize /*String*/ (processBA);
 //BA.debugLineNum = 173;BA.debugLine="ProgressDialogShow(\"Cargando datos de configuraci";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Cargando datos de configuración..."));
 //BA.debugLineNum = 177;BA.debugLine="Wait For(Conf.Sb_Cargar_Datos_De_Configuracion())";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _conf._sb_cargar_datos_de_configuracion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 178;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 180;BA.debugLine="If Result = 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 182;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 183;BA.debugLine="Msgbox2Async(\"No es posible ingresar al sistema,";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar al sistema, faltan configuraciones desde Bakapp Windows Form"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 184;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 185;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 186;BA.debugLine="Txt_Clave.Enabled = True";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 187;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 188;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 192;BA.debugLine="If Result = 2 Then";

case 4:
//if
this.state = 7;
if (_result==2) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 194;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 195;BA.debugLine="Msgbox2Async(\"No es posible ingresar al sistema,";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar al sistema, faltan configuraciones en WebService"),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 196;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 10;
return;
case 10:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 197;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 198;BA.debugLine="Txt_Clave.Enabled = True";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 199;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 200;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 204;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 206;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 207;BA.debugLine="Msgbox2Async(\"ACCESO AUTORIZADO\" , \"Ingresar al s";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("ACCESO AUTORIZADO"),BA.ObjectToCharSequence("Ingresar al sistema"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 208;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 11;
return;
case 11:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 210;BA.debugLine="StartActivity(Frm_Menu_Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_principal.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="Btn_Aceptar_Login.Enabled = True";
parent.mostCurrent._btn_aceptar_login.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 213;BA.debugLine="Txt_Clave.Enabled = True";
parent.mostCurrent._txt_clave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 214;BA.debugLine="Btn_Conf_Acceso_WS.Enabled = True";
parent.mostCurrent._btn_conf_acceso_ws.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static void  _btn_conf_acceso_ws_click() throws Exception{
ResumableSub_Btn_Conf_Acceso_WS_Click rsub = new ResumableSub_Btn_Conf_Acceso_WS_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Conf_Acceso_WS_Click extends BA.ResumableSub {
public ResumableSub_Btn_Conf_Acceso_WS_Click(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.main parent;
boolean _rsconf = false;
String _old_global_ip_webservice = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _result = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
String _targetdir = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 338;BA.debugLine="Wait For (Sb_Clave_ConfLocal) Complete (RsConf As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_clave_conflocal());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_rsconf = (Boolean) result[0];
;
 //BA.debugLineNum = 340;BA.debugLine="If Not(RsConf) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_rsconf)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 341;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 344;BA.debugLine="Dim Old_Global_Ip_WebService As String = Variable";
_old_global_ip_webservice = parent.mostCurrent._variables._global_ip_webservice /*String*/ ;
 //BA.debugLineNum = 346;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent.mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 347;BA.debugLine="p.SetLayoutAnimated(0, 0, 20dip, 300dip, 80dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 //BA.debugLineNum = 348;BA.debugLine="p.LoadLayout(\"Conf_Local1\")";
_p.LoadLayout("Conf_Local1",mostCurrent.activityBA);
 //BA.debugLineNum = 350;BA.debugLine="Txt_Flp_WebService.Text = Variables.Global_Ip_Web";
parent.mostCurrent._txt_flp_webservice._settext /*String*/ (parent.mostCurrent._variables._global_ip_webservice /*String*/ );
 //BA.debugLineNum = 352;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
parent.mostCurrent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 353;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 20;
return;
case 20:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 354;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 18;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 356;BA.debugLine="Variables.Global_Ip_WebService = Txt_Flp_WebServ";
parent.mostCurrent._variables._global_ip_webservice /*String*/  = parent.mostCurrent._txt_flp_webservice._gettext /*String*/ ().trim();
 //BA.debugLineNum = 358;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIE";
parent.mostCurrent._consulta_sql = "Select Top 1 EMPRESA From CONFIES";
 //BA.debugLineNum = 359;BA.debugLine="ProgressDialogShow(\"Probando conexión\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Probando conexión"));
 //BA.debugLineNum = 360;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Ge";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
 //BA.debugLineNum = 361;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 8;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 363;BA.debugLine="If Js.Success Then";
if (true) break;

case 8:
//if
this.state = 17;
if (_js._success /*boolean*/ ) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 365;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 366;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 367;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 369;BA.debugLine="Dim bmp1 As Bitmap = LoadBitmap(File.DirAssets";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 371;BA.debugLine="Msgbox2Async(\"Conexion existosa\" , \"Conexión W";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Conexion existosa"),BA.ObjectToCharSequence("Conexión WebService"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 372;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 22;
return;
case 22:
//C
this.state = 14;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 374;BA.debugLine="Dim TargetDir As String = DBUtils.GetDBFolder";
_targetdir = parent.mostCurrent._dbutils._getdbfolder /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 375;BA.debugLine="File.Delete(TargetDir, \"ConexionWebService.txt";
anywheresoftware.b4a.keywords.Common.File.Delete(_targetdir,"ConexionWebService.txt");
 //BA.debugLineNum = 376;BA.debugLine="File.WriteString(TargetDir,\"ConexionWebService";
anywheresoftware.b4a.keywords.Common.File.WriteString(_targetdir,"ConexionWebService.txt",parent.mostCurrent._variables._global_ip_webservice /*String*/ );
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 385;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 386;BA.debugLine="Msgbox2Async(\"No se pudo establecer la conexion";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se pudo establecer la conexion con el Web Service"),BA.ObjectToCharSequence("Conexión WebService"),"Ok","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 387;BA.debugLine="Variables.Global_Ip_WebService = Old_Global_Ip_";
parent.mostCurrent._variables._global_ip_webservice /*String*/  = _old_global_ip_webservice;
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
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static String  _disablestrictmode() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _policy = null;
anywheresoftware.b4j.object.JavaObject _sm = null;
 //BA.debugLineNum = 397;BA.debugLine="Sub DisableStrictMode";
 //BA.debugLineNum = 398;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 399;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
_jo.InitializeStatic("android.os.Build.VERSION");
 //BA.debugLineNum = 400;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
if ((double)(BA.ObjectToNumber(_jo.GetField("SDK_INT")))>9) { 
 //BA.debugLineNum = 401;BA.debugLine="Dim policy As JavaObject";
_policy = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 402;BA.debugLine="policy = policy.InitializeNewInstance(\"android.o";
_policy = _policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 403;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null).R";
_policy = _policy.RunMethodJO("permitAll",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("build",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 404;BA.debugLine="Dim sm As JavaObject";
_sm = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 405;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").Run";
_sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy",new Object[]{(Object)(_policy.getObject())});
 };
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 35;BA.debugLine="Dim Consulta_Sql As String";
mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 37;BA.debugLine="Private Txt_Clave As EditText";
mostCurrent._txt_clave = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Btn_Aceptar_Login As Button";
mostCurrent._btn_aceptar_login = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Version As Label";
mostCurrent._lbl_version = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Dim TecladoSoft As IME ' biblioteca IME";
mostCurrent._tecladosoft = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 43;BA.debugLine="Private Lbl_Id_Dispositivo As Label";
mostCurrent._lbl_id_dispositivo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Btn_Conf_Acceso_WS As Button";
mostCurrent._btn_conf_acceso_ws = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 47;BA.debugLine="Private dialog As B4XDialog";
mostCurrent._dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 49;BA.debugLine="Private Txt_Flp_WebService As B4XFloatTextField";
mostCurrent._txt_flp_webservice = new BaKapp.Movil.Tag.b4xfloattextfield();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_id_dispositivo_longclick() throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Private Sub Lbl_Id_Dispositivo_LongClick";
 //BA.debugLineNum = 411;BA.debugLine="xui.MsgboxAsync(Lbl_Id_Dispositivo.Text, \"Bakapp";
mostCurrent._xui.MsgboxAsync(processBA,BA.ObjectToCharSequence(mostCurrent._lbl_id_dispositivo.getText()),BA.ObjectToCharSequence("Bakapp información"));
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
frm_impresion._process_globals();
frm_etiquetas._process_globals();
variables._process_globals();
funciones._process_globals();
buscar_entidad._process_globals();
buscar_productos._process_globals();
conf_local._process_globals();
dbutils._process_globals();
frm_buscar_documento._process_globals();
frm_documentos_generados._process_globals();
frm_editar_obsoc._process_globals();
frm_infostockxprod._process_globals();
frm_menu_post_venta._process_globals();
frm_menu_principal._process_globals();
frm_post_01_descuentos._process_globals();
frm_post_01_formulario._process_globals();
frm_post_01_producto._process_globals();
httputils2service._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_clave_conflocal() throws Exception{
ResumableSub_Sb_Clave_ConfLocal rsub = new ResumableSub_Sb_Clave_ConfLocal(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Clave_ConfLocal extends BA.ResumableSub {
public ResumableSub_Sb_Clave_ConfLocal(BaKapp.Movil.Tag.main parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.main parent;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
boolean _clave_aceptada = false;
String _msg = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
int _result = 0;
int _rsclave = 0;

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
 //BA.debugLineNum = 416;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 417;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 418;BA.debugLine="Private dialog As B4XDialog";
parent.mostCurrent._dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 419;BA.debugLine="Dim Clave_Aceptada As Boolean";
_clave_aceptada = false;
 //BA.debugLineNum = 420;BA.debugLine="Dim Msg As String";
_msg = "";
 //BA.debugLineNum = 421;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 423;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 425;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 426;BA.debugLine="dialog.Initialize (Base)";
parent.mostCurrent._dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 428;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"key.png\")";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"key.png");
 //BA.debugLineNum = 429;BA.debugLine="Msg = \"Para ingresar a la configuración debera in";
_msg = "Para ingresar a la configuración debera ingresar una clave de validación";
 //BA.debugLineNum = 430;BA.debugLine="Msgbox2Async(Msg , \"Configuración local\", \"Ok\", \"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Configuración local"),"Ok","Cancelar","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 431;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 433;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result!=parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 434;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 437;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese Clave de C";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese Clave de Conf.Local"));
 //BA.debugLineNum = 438;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 439;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 441;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rsclave = (Integer) result[0];
;
 //BA.debugLineNum = 442;BA.debugLine="If RsClave = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 14;
if (_rsclave==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 443;BA.debugLine="If	InputTemplate.Text = \"971364\" Then";
if (true) break;

case 8:
//if
this.state = 13;
if ((_inputtemplate._text /*String*/ ).equals("971364")) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 444;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 445;BA.debugLine="Clave_Aceptada = True";
_clave_aceptada = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 447;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
_bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 448;BA.debugLine="Msg = \"Clave incorrecta\"";
_msg = "Clave incorrecta";
 //BA.debugLineNum = 449;BA.debugLine="Msgbox2Async(Msg , \"Configuración local\", \"Ok\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Configuración local"),"Ok","","",_bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 450;BA.debugLine="Clave_Aceptada = False";
_clave_aceptada = anywheresoftware.b4a.keywords.Common.False;
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
 //BA.debugLineNum = 454;BA.debugLine="Return Clave_Aceptada";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_clave_aceptada));return;};
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_login_ws_json(String _vclave) throws Exception{
ResumableSub_Sb_Login_Ws_Json rsub = new ResumableSub_Sb_Login_Ws_Json(null,_vclave);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Login_Ws_Json extends BA.ResumableSub {
public ResumableSub_Sb_Login_Ws_Json(BaKapp.Movil.Tag.main parent,String _vclave) {
this.parent = parent;
this._vclave = _vclave;
}
BaKapp.Movil.Tag.main parent;
String _vclave;
String _vmensaje = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
String _vnokofu = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 226;BA.debugLine="Dim vMensaje As String";
_vmensaje = "";
 //BA.debugLineNum = 227;BA.debugLine="vClave = Funciones.Fx_TraeClaveRD(vClave)";
_vclave = parent.mostCurrent._funciones._fx_traeclaverd /*String*/ (mostCurrent.activityBA,_vclave);
 //BA.debugLineNum = 229;BA.debugLine="If vClave.Trim = \"\" Then vClave = \"X\"";
if (true) break;

case 1:
//if
this.state = 6;
if ((_vclave.trim()).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_vclave = "X";
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 231;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where P";
parent.mostCurrent._consulta_sql = "Select Top 1 * From TABFU Where PWFU = '"+_vclave+"'";
 //BA.debugLineNum = 232;BA.debugLine="Log(vClave)";
anywheresoftware.b4a.keywords.Common.LogImpl("5458760",_vclave,0);
 //BA.debugLineNum = 234;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
 //BA.debugLineNum = 235;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 39;
return;
case 39:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 237;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 38;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 37;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 239;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 241;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 35;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 243;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/  = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 245;BA.debugLine="Dim vNOKOFU As String = Variables.Global_Row_Us";
_vnokofu = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
 //BA.debugLineNum = 247;BA.debugLine="vMensaje = \"Bienvenido: \" & vNOKOFU";
_vmensaje = "Bienvenido: "+_vnokofu;
 //BA.debugLineNum = 248;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo";
parent.mostCurrent._consulta_sql = "Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'";
 //BA.debugLineNum = 250;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
 //BA.debugLineNum = 251;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 13;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 253;BA.debugLine="If Js.Success Then";
if (true) break;

case 13:
//if
this.state = 32;
if (_js._success /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 255;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 257;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 16:
//if
this.state = 31;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 259;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.Get";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 261;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Ba";
parent.mostCurrent._variables._global_basebk /*String*/  = BA.ObjectToString(_fila.Get((Object)("Global_BaseBk")));
 //BA.debugLineNum = 262;BA.debugLine="Variables.Global_Sesion_Star = True";
parent.mostCurrent._variables._global_sesion_star /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 264;BA.debugLine="Consulta_Sql = \"Select Top 1 * From CONFIEST\"";
parent.mostCurrent._consulta_sql = "Select Top 1 * From CONFIEST"+anywheresoftware.b4a.keywords.Common.CRLF+"Inner Join "+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_Configuracion On Empresa = EMPRESA And Modalidad = MODALIDAD"+anywheresoftware.b4a.keywords.Common.CRLF+"Where EMPRESA = '01'";
 //BA.debugLineNum = 268;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,main.getObject());
 //BA.debugLineNum = 269;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 41;
return;
case 41:
//C
this.state = 19;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 271;BA.debugLine="If Js.Success Then";
if (true) break;

case 19:
//if
this.state = 30;
if (_js._success /*boolean*/ ) { 
this.state = 21;
}else {
this.state = 29;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 273;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 275;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 22:
//if
this.state = 27;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 //BA.debugLineNum = 277;BA.debugLine="Variables.Global_Row_Configuracion_General";
parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 279;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row";
parent.mostCurrent._variables._gl_empresa /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
 //BA.debugLineNum = 280;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Ro";
parent.mostCurrent._variables._gl_sucursal /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
 //BA.debugLineNum = 281;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_";
parent.mostCurrent._variables._gl_bodega /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
 //BA.debugLineNum = 282;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Co";
parent.mostCurrent._variables._gl_caja /*String*/  = BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ECAJA")));
 //BA.debugLineNum = 283;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid";
parent.mostCurrent._variables._gl_lista_precios /*String*/  = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTAVEN"))),(int) (6),(int) (3));
 //BA.debugLineNum = 284;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(V";
parent.mostCurrent._variables._gl_lista_costos /*String*/  = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTACOM"))),(int) (6),(int) (3));
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 287;BA.debugLine="Variables.Global_Row_Configuracion_General";
parent.mostCurrent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 291;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("5458819",_js._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 295;BA.debugLine="StartActivity(Frm_Menu_Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_menu_principal.getObject()));
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 302;BA.debugLine="vMensaje = \"ACCESO DENEGADO\"";
_vmensaje = "ACCESO DENEGADO";
 //BA.debugLineNum = 303;BA.debugLine="Txt_Clave.Text = \"\"";
parent.mostCurrent._txt_clave.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 35:
//C
this.state = 38;
;
 //BA.debugLineNum = 306;BA.debugLine="Log(Variables.Global_BaseBk)";
anywheresoftware.b4a.keywords.Common.LogImpl("5458834",parent.mostCurrent._variables._global_basebk /*String*/ ,0);
 if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 311;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("5458839",_js._errormessage /*String*/ ,0);
 if (true) break;

case 38:
//C
this.state = -1;
;
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _txt_clave_enterpressed() throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub Txt_Clave_EnterPressed";
 //BA.debugLineNum = 220;BA.debugLine="Sb_Login_Ws_Json(Txt_Clave.Text)";
_sb_login_ws_json(mostCurrent._txt_clave.getText());
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
}
