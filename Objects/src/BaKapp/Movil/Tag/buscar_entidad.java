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

public class buscar_entidad extends Activity implements B4AActivity{
	public static buscar_entidad mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.buscar_entidad");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (buscar_entidad).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.buscar_entidad");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.buscar_entidad", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (buscar_entidad) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (buscar_entidad) Resume **");
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
		return buscar_entidad.class;
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
            BA.LogInfo("** Activity (buscar_entidad) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (buscar_entidad) Pause event (activity is not paused). **");
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
            buscar_entidad mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (buscar_entidad) Resume **");
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
public static BaKapp.Movil.Tag.mensajes _msj = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_codigo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_codsucursal = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_razon_social = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_direccion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_rut = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_tipo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_codigo_descripcion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_buscar = null;
public BaKapp.Movil.Tag.b4xloadingindicator _b4xloading = null;
public b4a.example3.customlistview _xclvdetalle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitems = null;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"Buscador\")";
mostCurrent._activity.LoadLayout("Buscador",mostCurrent.activityBA);
 //BA.debugLineNum = 42;BA.debugLine="Activity.Title = \"BUSCAR ENTIDADES\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("BUSCAR ENTIDADES"));
 //BA.debugLineNum = 44;BA.debugLine="XclvDetalle.DefaultTextBackgroundColor = Colors.T";
mostCurrent._xclvdetalle._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
 //BA.debugLineNum = 45;BA.debugLine="B4XLoading.Hide";
mostCurrent._b4xloading._hide /*String*/ ();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _btn_aceptar_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub Btn_Aceptar_Click";
 //BA.debugLineNum = 58;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 59;BA.debugLine="ToastMessageShow(btn.Tag,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_btn.getTag()),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _btn_buscar_click() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Private Sub Btn_Buscar_Click";
 //BA.debugLineNum = 63;BA.debugLine="Sb_Buscar_Entidad(Txt_Codigo_Descripcion.Text)";
_sb_buscar_entidad(mostCurrent._txt_codigo_descripcion.getText());
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 22;BA.debugLine="Private Lbl_Codigo As B4XView";
mostCurrent._lbl_codigo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Lbl_Codsucursal As B4XView";
mostCurrent._lbl_codsucursal = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Lbl_Razon_Social As B4XView";
mostCurrent._lbl_razon_social = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Lbl_Direccion As B4XView";
mostCurrent._lbl_direccion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Lbl_Rut As B4XView";
mostCurrent._lbl_rut = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Lbl_Tipo As B4XView";
mostCurrent._lbl_tipo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Txt_Codigo_Descripcion As EditText";
mostCurrent._txt_codigo_descripcion = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Btn_Buscar As Button";
mostCurrent._btn_buscar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private B4XLoading As B4XLoadingIndicator";
mostCurrent._b4xloading = new BaKapp.Movil.Tag.b4xloadingindicator();
 //BA.debugLineNum = 32;BA.debugLine="Private XclvDetalle As CustomListView";
mostCurrent._xclvdetalle = new b4a.example3.customlistview();
 //BA.debugLineNum = 33;BA.debugLine="Private LblItems As Label";
mostCurrent._lblitems = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Public Msj As Mensajes";
_msj = new BaKapp.Movil.Tag.mensajes();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static void  _sb_buscar_entidad(String _descripcion) throws Exception{
ResumableSub_Sb_Buscar_Entidad rsub = new ResumableSub_Sb_Buscar_Entidad(null,_descripcion);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Buscar_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Buscar_Entidad(BaKapp.Movil.Tag.buscar_entidad parent,String _descripcion) {
this.parent = parent;
this._descripcion = _descripcion;
}
BaKapp.Movil.Tag.buscar_entidad parent;
String _descripcion;
String _cadena = "";
String _condicion_entidad = "";
String _filtro_extra = "";
String _filtro_entidades = "";
String _filtro_vendedores = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String _koen = "";
String _suen = "";
String _nokoen = "";
String _dien = "";
String _tipo = "";
String _rten = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
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
 //BA.debugLineNum = 72;BA.debugLine="Dim Cadena As String";
_cadena = "";
 //BA.debugLineNum = 74;BA.debugLine="Cadena = Funciones.Fx_Cadena_a_buscar_SQL(Descrip";
_cadena = parent.mostCurrent._funciones._fx_cadena_a_buscar_sql /*String*/ (mostCurrent.activityBA,_descripcion,"KOEN+NOKOEN+SUEN+DIEN"+" LIKE '%","");
 //BA.debugLineNum = 76;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
 //BA.debugLineNum = 77;BA.debugLine="B4XLoading.Show";
parent.mostCurrent._b4xloading._show /*String*/ ();
 //BA.debugLineNum = 79;BA.debugLine="Dim Condicion_Entidad As String";
_condicion_entidad = "";
 //BA.debugLineNum = 80;BA.debugLine="Dim Filtro_Extra As String";
_filtro_extra = "";
 //BA.debugLineNum = 81;BA.debugLine="Dim Filtro_Entidades As String";
_filtro_entidades = "";
 //BA.debugLineNum = 82;BA.debugLine="Dim Filtro_Vendedores As String";
_filtro_vendedores = "";
 //BA.debugLineNum = 84;BA.debugLine="Consulta_Sql = \"Select Top (30) IDMAEEN,KOEN,SUEN";
parent._consulta_sql = "Select Top (30) IDMAEEN,KOEN,SUEN,RTEN,NOKOEN,SIEN,DIEN,"+anywheresoftware.b4a.keywords.Common.CRLF+"Case TIEN "+anywheresoftware.b4a.keywords.Common.CRLF+"When 'A' Then 'Ambos' "+anywheresoftware.b4a.keywords.Common.CRLF+"When 'P' Then 'Proveedor' When 'C' Then 'Cliente' Else '' End As Tipo_Entidad,"+anywheresoftware.b4a.keywords.Common.CRLF+"SUBSTRING(LCEN,6,3) As LCosto,SUBSTRING(LVEN,6,3) As LVenta,"+anywheresoftware.b4a.keywords.Common.CRLF+"BLOQUEADO,BLOQENCOM,"+anywheresoftware.b4a.keywords.Common.CRLF+"Case BLOQUEADO When 1 Then 'SI' Else '' End As Bloqueado_Venta,"+anywheresoftware.b4a.keywords.Common.CRLF+"Case BLOQENCOM When 1 Then 'SI' Else '' End As Bloqueado_Compra"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEEN With (Nolock) "+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOEN+NOKOEN+SUEN+DIEN LIKE '%"+_cadena+"%'"+anywheresoftware.b4a.keywords.Common.CRLF+_condicion_entidad+anywheresoftware.b4a.keywords.Common.CRLF+_filtro_extra+anywheresoftware.b4a.keywords.Common.CRLF+_filtro_entidades+anywheresoftware.b4a.keywords.Common.CRLF+_filtro_vendedores+anywheresoftware.b4a.keywords.Common.CRLF+"Order by KOEN";
 //BA.debugLineNum = 100;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent._consulta_sql,buscar_entidad.getObject());
 //BA.debugLineNum = 101;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 102;BA.debugLine="ProgressDialogShow(\"Buscando entidades...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando entidades..."));
 //BA.debugLineNum = 104;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 106;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 108;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 110;BA.debugLine="Log(vJson)";
anywheresoftware.b4a.keywords.Common.LogImpl("37929896",_vjson,0);
 //BA.debugLineNum = 111;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 112;BA.debugLine="parser.Initialize(vJson)";
_parser.Initialize(_vjson);
 //BA.debugLineNum = 113;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 114;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
_table = new anywheresoftware.b4a.objects.collections.List();
_table = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("Table"))));
 //BA.debugLineNum = 118;BA.debugLine="For Each Fila As Map In Table";
if (true) break;

case 7:
//for
this.state = 16;
parent._fila = new anywheresoftware.b4a.objects.collections.Map();
group21 = _table;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 9;
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 23:
//C
this.state = 22;
index21++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 120;BA.debugLine="Dim Koen As String = Fila.Get(\"KOEN\")";
_koen = BA.ObjectToString(parent._fila.Get((Object)("KOEN")));
 //BA.debugLineNum = 121;BA.debugLine="Dim Suen As String = Fila.Get(\"SUEN\")";
_suen = BA.ObjectToString(parent._fila.Get((Object)("SUEN")));
 //BA.debugLineNum = 122;BA.debugLine="Dim Nokoen As String = Fila.Get(\"NOKOEN\")";
_nokoen = BA.ObjectToString(parent._fila.Get((Object)("NOKOEN")));
 //BA.debugLineNum = 123;BA.debugLine="Dim Dien As String = Fila.Get(\"DIEN\")";
_dien = BA.ObjectToString(parent._fila.Get((Object)("DIEN")));
 //BA.debugLineNum = 124;BA.debugLine="Dim Tipo As String = Fila.Get(\"Tipo_Entidad\")";
_tipo = BA.ObjectToString(parent._fila.Get((Object)("Tipo_Entidad")));
 //BA.debugLineNum = 125;BA.debugLine="Dim Rten As String = Fila.Get(\"RTEN\")";
_rten = BA.ObjectToString(parent._fila.Get((Object)("RTEN")));
 //BA.debugLineNum = 128;BA.debugLine="Rten = NumberFormat(Rten,0,0) & \"-\" & Funcione";
_rten = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_rten)),(int) (0),(int) (0))+"-"+parent.mostCurrent._funciones._rutdigito /*String*/ (mostCurrent.activityBA,(long)(Double.parseDouble(_rten)));
 //BA.debugLineNum = 130;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent.mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 132;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (160)));
 //BA.debugLineNum = 133;BA.debugLine="p.LoadLayout(\"Items_Entidades\")";
_p.LoadLayout("Items_Entidades",mostCurrent.activityBA);
 //BA.debugLineNum = 134;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 136;BA.debugLine="Lbl_Codigo.Tag = Koen";
parent.mostCurrent._lbl_codigo.setTag((Object)(_koen));
 //BA.debugLineNum = 137;BA.debugLine="Lbl_Codsucursal.Tag = Suen";
parent.mostCurrent._lbl_codsucursal.setTag((Object)(_suen));
 //BA.debugLineNum = 138;BA.debugLine="Lbl_Razon_Social.Tag = Nokoen";
parent.mostCurrent._lbl_razon_social.setTag((Object)(_nokoen));
 //BA.debugLineNum = 139;BA.debugLine="Lbl_Direccion.Tag = Dien";
parent.mostCurrent._lbl_direccion.setTag((Object)(_dien));
 //BA.debugLineNum = 140;BA.debugLine="Lbl_Tipo.Text = Tipo.ToUpperCase";
parent.mostCurrent._lbl_tipo.setText(BA.ObjectToCharSequence(_tipo.toUpperCase()));
 //BA.debugLineNum = 141;BA.debugLine="Lbl_Rut.Text = Rten.Replace(\",\",\".\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(_rten.replace(",",".")));
 //BA.debugLineNum = 143;BA.debugLine="Lbl_Codigo.Text = Koen";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(_koen));
 //BA.debugLineNum = 144;BA.debugLine="If Suen.Trim <> \"\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_suen.trim()).equals("") == false) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 145;BA.debugLine="Lbl_Codsucursal.Text = \"Suc.: \" & Suen";
parent.mostCurrent._lbl_codsucursal.setText(BA.ObjectToCharSequence("Suc.: "+_suen));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 147;BA.debugLine="Lbl_Codsucursal.Text = \"\"";
parent.mostCurrent._lbl_codsucursal.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 15:
//C
this.state = 23;
;
 //BA.debugLineNum = 149;BA.debugLine="Lbl_Razon_Social.Text = Nokoen";
parent.mostCurrent._lbl_razon_social.setText(BA.ObjectToCharSequence(_nokoen));
 //BA.debugLineNum = 150;BA.debugLine="Lbl_Direccion.Text = Dien";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(_dien));
 //BA.debugLineNum = 152;BA.debugLine="XclvDetalle.Add(p,\"\")";
parent.mostCurrent._xclvdetalle._add(_p,(Object)(""));
 //BA.debugLineNum = 154;BA.debugLine="Log(Koen & Suen & Nokoen)";
anywheresoftware.b4a.keywords.Common.LogImpl("37929940",_koen+_suen+_nokoen,0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 162;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No se encontraron registros"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 166;BA.debugLine="B4XLoading.Hide";
parent.mostCurrent._b4xloading._hide /*String*/ ();
 //BA.debugLineNum = 167;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static String  _txt_codigo_descripcion_enterpressed() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub Txt_Codigo_Descripcion_EnterPressed";
 //BA.debugLineNum = 67;BA.debugLine="Sb_Buscar_Entidad(Txt_Codigo_Descripcion.Text)";
_sb_buscar_entidad(mostCurrent._txt_codigo_descripcion.getText());
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static void  _xclvdetalle_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_XclvDetalle_ItemLongClick rsub = new ResumableSub_XclvDetalle_ItemLongClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_XclvDetalle_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDetalle_ItemLongClick(BaKapp.Movil.Tag.buscar_entidad parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
BaKapp.Movil.Tag.buscar_entidad parent;
int _index;
Object _value;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblkoen = null;
anywheresoftware.b4a.objects.LabelWrapper _lblsuen = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
String _nokoen = "";
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
 //BA.debugLineNum = 173;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 174;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_index);
 //BA.debugLineNum = 175;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 176;BA.debugLine="Dim LblKoen As Label = p.GetView(0)";
_lblkoen = new anywheresoftware.b4a.objects.LabelWrapper();
_lblkoen = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 177;BA.debugLine="Dim LblSuen As Label = p.GetView(1)";
_lblsuen = new anywheresoftware.b4a.objects.LabelWrapper();
_lblsuen = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (1)).getObject()));
 //BA.debugLineNum = 179;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,buscar_entidad.getObject(),_lblkoen.getText(),BA.ObjectToString(_lblsuen.getTag()));
 //BA.debugLineNum = 181;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 183;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 185;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 187;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 189;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 190;BA.debugLine="Fila =Filas.Get(0)";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 192;BA.debugLine="Log(LblKoen.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("37995413",_lblkoen.getText(),0);
 //BA.debugLineNum = 193;BA.debugLine="Dim Nokoen As String = Fila.Get(\"NOKOEN\")";
_nokoen = BA.ObjectToString(parent._fila.Get((Object)("NOKOEN")));
 //BA.debugLineNum = 195;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma la selección?"+anywheresoftware.b4a.keywords.Common.CRLF+_nokoen),BA.ObjectToCharSequence(_lblkoen.getText()+_lblsuen.getText()),"SI","","NO",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 196;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 18;
return;
case 18:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 198;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 200;BA.debugLine="Frm_Post_01_Formulario.Row_Entidad = Fila";
parent.mostCurrent._frm_post_01_formulario._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = parent._fila;
 //BA.debugLineNum = 201;BA.debugLine="Frm_Post_01_Formulario.Fila_Encabezado.Put(\"co";
parent.mostCurrent._frm_post_01_formulario._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("codentidad"),(Object)(_lblkoen.getText()));
 //BA.debugLineNum = 202;BA.debugLine="Frm_Post_01_Formulario.Fila_Encabezado.Put(\"co";
parent.mostCurrent._frm_post_01_formulario._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("codsucentidad"),_lblsuen.getTag());
 //BA.debugLineNum = 203;BA.debugLine="Frm_Post_01_Formulario.Fila_Encabezado.Put(\"no";
parent.mostCurrent._frm_post_01_formulario._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("nombre_entidad"),(Object)(_nokoen));
 //BA.debugLineNum = 204;BA.debugLine="Frm_Post_01_Formulario.Cambiar_Entidad = True";
parent.mostCurrent._frm_post_01_formulario._cambiar_entidad /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 206;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 208;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 213;BA.debugLine="Fila = Null";
parent._fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 217;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("37995438",_js._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
}
