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

public class frm_post_01_descuentos extends Activity implements B4AActivity{
	public static frm_post_01_descuentos mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_descuentos");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_post_01_descuentos).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_descuentos");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_post_01_descuentos", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_post_01_descuentos) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_post_01_descuentos) Resume **");
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
		return frm_post_01_descuentos.class;
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
            BA.LogInfo("** Activity (frm_post_01_descuentos) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_post_01_descuentos) Pause event (activity is not paused). **");
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
            frm_post_01_descuentos mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_post_01_descuentos) Resume **");
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
public static int _id_docenc = 0;
public static int _id_docdet = 0;
public static double _total_linea_origen = 0;
public static double _total_descuento = 0;
public static double _total_pc = 0;
public static int _nrodscto = 0;
public static int _dscto_max = 0;
public static String _consulta_sql = "";
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _xclvdescuentos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_agregar_descuento = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_dscto_porc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_dscto_valor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_linea = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_volver = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_id_docdsc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_kodt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_item = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_podt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_vadt = null;
public anywheresoftware.b4a.objects.collections.Map _fila = null;
public anywheresoftware.b4a.objects.collections.List _dsctos = null;
public static double _subtotal_linea = 0;
public static int _nrodscto_max = 0;
public b4a.example.dateutils _dateutils = null;
public BaKapp.Movil.Tag.main _main = null;
public BaKapp.Movil.Tag.frm_impresion _frm_impresion = null;
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.variables _variables = null;
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
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
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
String _codigo = "";
String _descripcion = "";
 //BA.debugLineNum = 52;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 57;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 58;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
mostCurrent._fila = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 60;BA.debugLine="Activity.LoadLayout(\"Cp_Post_01_Descuentos\")";
mostCurrent._activity.LoadLayout("Cp_Post_01_Descuentos",mostCurrent.activityBA);
 //BA.debugLineNum = 62;BA.debugLine="Dim Codigo As String =Fila.Get(\"codigo\")";
_codigo = BA.ObjectToString(mostCurrent._fila.Get((Object)("codigo")));
 //BA.debugLineNum = 63;BA.debugLine="Dim Descripcion As String =Fila.Get(\"descripcion\"";
_descripcion = BA.ObjectToString(mostCurrent._fila.Get((Object)("descripcion")));
 //BA.debugLineNum = 65;BA.debugLine="Activity.Title = Codigo.Trim & \"-\" & Descripcion.";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence(_codigo.trim()+"-"+_descripcion.trim()));
 //BA.debugLineNum = 72;BA.debugLine="If Dscto_Max > 0 Then";
if (_dscto_max>0) { 
 //BA.debugLineNum = 73;BA.debugLine="NroDscto_Max = NroDscto+1";
_nrodscto_max = (int) (_nrodscto+1);
 };
 //BA.debugLineNum = 76;BA.debugLine="Sb_Cargar_Descuentos";
_sb_cargar_descuentos();
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static void  _btn_agregar_descuento_click() throws Exception{
ResumableSub_Btn_Agregar_Descuento_Click rsub = new ResumableSub_Btn_Agregar_Descuento_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Agregar_Descuento_Click extends BA.ResumableSub {
public ResumableSub_Btn_Agregar_Descuento_Click(BaKapp.Movil.Tag.frm_post_01_descuentos parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_descuentos parent;
double _descuentoporc = 0;
double _resultdscto = 0;
String _kodt = "";
double _podt = 0;
double _vadt = 0;
double _valor = 0;
int _decimales = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 190;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
 //BA.debugLineNum = 192;BA.debugLine="Wait For(Sb_Agregar_Descuento) Complete (ResultDs";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_agregar_descuento());
this.state = 31;
return;
case 31:
//C
this.state = 1;
_resultdscto = (Double) result[0];
;
 //BA.debugLineNum = 193;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
 //BA.debugLineNum = 195;BA.debugLine="If DescuentoPorc > 0 Then";
if (true) break;

case 1:
//if
this.state = 30;
if (_descuentoporc>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 197;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"";
_kodt = "D_SIN_TIPO";
 //BA.debugLineNum = 198;BA.debugLine="Dim Podt As Double = DescuentoPorc";
_podt = _descuentoporc;
 //BA.debugLineNum = 199;BA.debugLine="Dim Vadt As Double";
_vadt = 0;
 //BA.debugLineNum = 201;BA.debugLine="Dim Valor As Double = SubTotal_Linea";
_valor = parent._subtotal_linea;
 //BA.debugLineNum = 202;BA.debugLine="Dim Decimales As Int = 0";
_decimales = (int) (0);
 //BA.debugLineNum = 204;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
if (true) break;

case 4:
//if
this.state = 29;
if (_podt!=0 || _vadt!=0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 206;BA.debugLine="If Podt <> 0 Then";
if (true) break;

case 7:
//if
this.state = 24;
if (_podt!=0) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 208;BA.debugLine="If Podt > 0 Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_podt>0) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 209;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
_vadt = anywheresoftware.b4a.keywords.Common.Round2((_podt/(double)100)*_valor,_decimales);
 //BA.debugLineNum = 210;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = anywheresoftware.b4a.keywords.Common.Round2((_vadt/(double)_valor)*100,(int) (5));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 212;BA.debugLine="Vadt = 0";
_vadt = 0;
 if (true) break;

case 15:
//C
this.state = 24;
;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 217;BA.debugLine="If Vadt <> 0 Then";
if (true) break;

case 18:
//if
this.state = 23;
if (_vadt!=0) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 //BA.debugLineNum = 218;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = anywheresoftware.b4a.keywords.Common.Round2((_vadt/(double)_valor)*100,(int) (5));
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 220;BA.debugLine="Podt = 0";
_podt = 0;
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 //BA.debugLineNum = 225;BA.debugLine="Podt = Round2(Podt,Decimales)";
_podt = anywheresoftware.b4a.keywords.Common.Round2(_podt,_decimales);
 //BA.debugLineNum = 227;BA.debugLine="If Podt <> 0 Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_podt!=0) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 229;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
parent.mostCurrent._consulta_sql = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)";
 //BA.debugLineNum = 230;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent._id_docenc),(Object)(parent._id_docdet),(Object)(""),(Object)(_kodt),(Object)(_podt),(Object)(_vadt),(Object)(_podt)}));
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 //BA.debugLineNum = 240;BA.debugLine="Sb_Cargar_Descuentos";
_sb_cargar_descuentos();
 if (true) break;

case 30:
//C
this.state = -1;
;
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(double _resultdscto) throws Exception{
}
public static String  _btn_volver_click() throws Exception{
 //BA.debugLineNum = 184;BA.debugLine="Private Sub Btn_Volver_Click";
 //BA.debugLineNum = 185;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Dim Consulta_Sql As String";
mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 26;BA.debugLine="Dim bmp1 As Bitmap";
mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 30;BA.debugLine="Private XclvDescuentos As CustomListView";
mostCurrent._xclvdescuentos = new b4a.example3.customlistview();
 //BA.debugLineNum = 31;BA.debugLine="Private Btn_Agregar_Descuento As Button";
mostCurrent._btn_agregar_descuento = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Lbl_Total_Dscto_Porc As Label";
mostCurrent._lbl_total_dscto_porc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Lbl_Total_Dscto_Valor As Label";
mostCurrent._lbl_total_dscto_valor = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Lbl_Total_Linea As Label";
mostCurrent._lbl_total_linea = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Btn_Volver As Button";
mostCurrent._btn_volver = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Lbl_Id_DocDsc As B4XView";
mostCurrent._lbl_id_docdsc = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Lbl_Kodt As B4XView";
mostCurrent._lbl_kodt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_Item As B4XView";
mostCurrent._lbl_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Podt As B4XView";
mostCurrent._lbl_podt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_Vadt As B4XView";
mostCurrent._lbl_vadt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Dim Fila As Map";
mostCurrent._fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Dim Dsctos As List";
mostCurrent._dsctos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 46;BA.debugLine="Dim	SubTotal_Linea As Double";
_subtotal_linea = 0;
 //BA.debugLineNum = 47;BA.debugLine="Dim NroDscto_Max As Int";
_nrodscto_max = 0;
 //BA.debugLineNum = 48;BA.debugLine="Dim bmp1 As Bitmap";
mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public Id_DocEnc As Int";
_id_docenc = 0;
 //BA.debugLineNum = 10;BA.debugLine="Public Id_DocDet As Int";
_id_docdet = 0;
 //BA.debugLineNum = 13;BA.debugLine="Public Total_Linea_Origen As Double";
_total_linea_origen = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public Total_Descuento As Double";
_total_descuento = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public Total_Pc As Double";
_total_pc = 0;
 //BA.debugLineNum = 16;BA.debugLine="Public NroDscto As Int";
_nrodscto = 0;
 //BA.debugLineNum = 17;BA.debugLine="Public Dscto_Max As Int";
_dscto_max = 0;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_agregar_descuento() throws Exception{
ResumableSub_Sb_Agregar_Descuento rsub = new ResumableSub_Sb_Agregar_Descuento(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Agregar_Descuento extends BA.ResumableSub {
public ResumableSub_Sb_Agregar_Descuento(BaKapp.Movil.Tag.frm_post_01_descuentos parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_descuentos parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
double _descuentoporc = 0;
int _result = 0;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
double _newdescuentoporc = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 248;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 249;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 250;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
 //BA.debugLineNum = 252;BA.debugLine="If Dscto_Max > 0 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._dscto_max>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 254;BA.debugLine="If NroDscto_Max = NroDscto Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._nrodscto_max==parent._nrodscto) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 256;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 257;BA.debugLine="Msgbox2Async(\"No puede agregar mas líneas de de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede agregar mas líneas de descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 258;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 259;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 //BA.debugLineNum = 260;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 267;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 268;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 270;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 271;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 273;BA.debugLine="If Dscto_Max > 0 Then";
if (true) break;

case 9:
//if
this.state = 14;
if (parent._dscto_max>0) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 275;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese % descuen";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese % descuento. Max "+BA.NumberToString(parent._dscto_max)+"%"));
 //BA.debugLineNum = 276;BA.debugLine="InputTemplate.Text = Dscto_Max";
_inputtemplate._text /*String*/  = BA.NumberToString(parent._dscto_max);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 284;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese % descue";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese % descuento"));
 //BA.debugLineNum = 285;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 290;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 292;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 40;
return;
case 40:
//C
this.state = 15;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 294;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 38;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 17;
}else {
this.state = 37;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 295;BA.debugLine="Try";
if (true) break;

case 18:
//try
this.state = 35;
this.catchState = 34;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 34;
 //BA.debugLineNum = 296;BA.debugLine="Dim NewDescuentoPorc As Double = InputTemplate.";
_newdescuentoporc = (double)(Double.parseDouble(_inputtemplate._text /*String*/ ));
 //BA.debugLineNum = 298;BA.debugLine="If Dscto_Max > 0 Then";
if (true) break;

case 21:
//if
this.state = 32;
if (parent._dscto_max>0) { 
this.state = 23;
}else {
this.state = 31;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 300;BA.debugLine="If NewDescuentoPorc > Dscto_Max Then";
if (true) break;

case 24:
//if
this.state = 29;
if (_newdescuentoporc>parent._dscto_max) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 //BA.debugLineNum = 301;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 302;BA.debugLine="Msgbox2Async(\"El descuento no puede ser mayor";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El descuento no puede ser mayor a un "+BA.NumberToString(parent._dscto_max)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 303;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 41;
return;
case 41:
//C
this.state = 29;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 304;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 306;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
_descuentoporc = _newdescuentoporc;
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 310;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
_descuentoporc = _newdescuentoporc;
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
 //BA.debugLineNum = 314;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("717039428",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 //BA.debugLineNum = 315;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 316;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 317;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 42;
return;
case 42:
//C
this.state = 35;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 318;BA.debugLine="DescuentoPorc = -1";
_descuentoporc = -1;
 if (true) break;
if (true) break;

case 35:
//C
this.state = 38;
this.catchState = 0;
;
 if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 321;BA.debugLine="DescuentoPorc = -1";
_descuentoporc = -1;
 if (true) break;

case 38:
//C
this.state = -1;
;
 //BA.debugLineNum = 324;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static String  _sb_cargar_descuentos() throws Exception{
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
String _itemstr = "";
int _id_docdsc = 0;
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _kodt = "";
double _podt = 0;
double _vadt = 0;
 //BA.debugLineNum = 88;BA.debugLine="Sub Sb_Cargar_Descuentos()";
 //BA.debugLineNum = 90;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 91;BA.debugLine="XclvDescuentos.DefaultTextBackgroundColor = Color";
mostCurrent._xclvdescuentos._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
 //BA.debugLineNum = 92;BA.debugLine="XclvDescuentos.Clear";
mostCurrent._xclvdescuentos._clear();
 //BA.debugLineNum = 93;BA.debugLine="Private Row As Int";
_row = 0;
 //BA.debugLineNum = 94;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 96;BA.debugLine="Dsctos.Initialize";
mostCurrent._dsctos.Initialize();
 //BA.debugLineNum = 99;BA.debugLine="Dim ItemStr As String";
_itemstr = "";
 //BA.debugLineNum = 101;BA.debugLine="Consulta_Sql =\"Select Id_DocDsc,Nulido,Kodt,Podt,";
mostCurrent._consulta_sql = "Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc)+" And Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 102;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(Consulta_Sql)";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(mostCurrent._consulta_sql)));
 //BA.debugLineNum = 104;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
 //BA.debugLineNum = 106;BA.debugLine="NroDscto = Cursor1.RowCount";
_nrodscto = _cursor1.getRowCount();
 //BA.debugLineNum = 108;BA.debugLine="For Row = 0 To NroDscto - 1";
{
final int step12 = 1;
final int limit12 = (int) (_nrodscto-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
 //BA.debugLineNum = 110;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
 //BA.debugLineNum = 111;BA.debugLine="Dsctos.Add(Cursor1.GetString2(0))";
mostCurrent._dsctos.Add((Object)(_cursor1.GetString2((int) (0))));
 //BA.debugLineNum = 113;BA.debugLine="Dim Id_DocDsc As Int = Cursor1.GetString(\"Id_Do";
_id_docdsc = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDsc")));
 //BA.debugLineNum = 115;BA.debugLine="Dim Item As Int = Row+1";
_item = (int) (_row+1);
 //BA.debugLineNum = 116;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
_itemstr = mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item),(int) (2),"0");
 //BA.debugLineNum = 118;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 120;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsVi";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),mostCurrent._xclvdescuentos._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)));
 //BA.debugLineNum = 121;BA.debugLine="p.LoadLayout(\"Items_Descuentos\")";
_p.LoadLayout("Items_Descuentos",mostCurrent.activityBA);
 //BA.debugLineNum = 122;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 124;BA.debugLine="Dim Kodt As String = Cursor1.GetString(\"Kodt\")";
_kodt = _cursor1.GetString("Kodt");
 //BA.debugLineNum = 125;BA.debugLine="Dim Podt As Double = Cursor1.GetString(\"Podt\")";
_podt = (double)(Double.parseDouble(_cursor1.GetString("Podt")));
 //BA.debugLineNum = 126;BA.debugLine="Dim Vadt As Double = Cursor1.GetString(\"Vadt\")";
_vadt = (double)(Double.parseDouble(_cursor1.GetString("Vadt")));
 //BA.debugLineNum = 128;BA.debugLine="Lbl_Id_DocDsc.Tag = Id_DocDsc";
mostCurrent._lbl_id_docdsc.setTag((Object)(_id_docdsc));
 //BA.debugLineNum = 129;BA.debugLine="Lbl_Kodt.Text = Kodt";
mostCurrent._lbl_kodt.setText(BA.ObjectToCharSequence(_kodt));
 //BA.debugLineNum = 130;BA.debugLine="Lbl_Podt.Text = \"% \" & NumberFormat(Podt,0,2)";
mostCurrent._lbl_podt.setText(BA.ObjectToCharSequence("% "+anywheresoftware.b4a.keywords.Common.NumberFormat(_podt,(int) (0),(int) (2))));
 //BA.debugLineNum = 131;BA.debugLine="Lbl_Podt.Tag = Podt";
mostCurrent._lbl_podt.setTag((Object)(_podt));
 //BA.debugLineNum = 132;BA.debugLine="Lbl_Vadt.Text = \"$ \" & NumberFormat(Vadt,0,2)";
mostCurrent._lbl_vadt.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_vadt,(int) (0),(int) (2))));
 //BA.debugLineNum = 133;BA.debugLine="Lbl_Vadt.Tag = Vadt";
mostCurrent._lbl_vadt.setTag((Object)(_vadt));
 //BA.debugLineNum = 134;BA.debugLine="Lbl_Item.Tag = Item";
mostCurrent._lbl_item.setTag((Object)(_item));
 //BA.debugLineNum = 135;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
mostCurrent._lbl_item.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
 //BA.debugLineNum = 137;BA.debugLine="XclvDescuentos.Add(p,\"\")";
mostCurrent._xclvdescuentos._add(_p,(Object)(""));
 }
};
 }else {
 //BA.debugLineNum = 142;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 145;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Doc\"";
mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","NroDscto",(Object)(_nrodscto),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(_id_docdet)}));
 //BA.debugLineNum = 147;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 148;BA.debugLine="Sb_Sumar_Totales";
_sb_sumar_totales();
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public static String  _sb_sumar_totales() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _vlbl_vadt = null;
double _vadt = 0;
 //BA.debugLineNum = 152;BA.debugLine="Sub Sb_Sumar_Totales()";
 //BA.debugLineNum = 154;BA.debugLine="Total_Descuento = 0";
_total_descuento = 0;
 //BA.debugLineNum = 156;BA.debugLine="For i = 0 To XclvDescuentos.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._xclvdescuentos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 158;BA.debugLine="Dim p As B4XView = XclvDescuentos.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xclvdescuentos._getpanel(_i);
 //BA.debugLineNum = 160;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 162;BA.debugLine="Dim vLbl_Vadt As Label = p.GetView(4)";
_vlbl_vadt = new anywheresoftware.b4a.objects.LabelWrapper();
_vlbl_vadt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (4)).getObject()));
 //BA.debugLineNum = 163;BA.debugLine="Dim Vadt As Double = Funciones.Fx_NuloPorNro(vL";
_vadt = (double)(Double.parseDouble(mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,_vlbl_vadt.getTag(),0)));
 //BA.debugLineNum = 165;BA.debugLine="Total_Descuento = Total_Descuento+Vadt";
_total_descuento = _total_descuento+_vadt;
 };
 }
};
 //BA.debugLineNum = 171;BA.debugLine="SubTotal_Linea = Round2(Total_Linea_Origen-Total_";
_subtotal_linea = anywheresoftware.b4a.keywords.Common.Round2(_total_linea_origen-_total_descuento,(int) (0));
 //BA.debugLineNum = 172;BA.debugLine="Total_Pc = 0";
_total_pc = 0;
 //BA.debugLineNum = 174;BA.debugLine="If Total_Descuento <> 0 Then";
if (_total_descuento!=0) { 
 //BA.debugLineNum = 175;BA.debugLine="Total_Pc = (Total_Descuento / Total_Linea_Origen";
_total_pc = (_total_descuento/(double)_total_linea_origen)*100;
 };
 //BA.debugLineNum = 178;BA.debugLine="Lbl_Total_Dscto_Porc.Text = \"% \" & NumberFormat(T";
mostCurrent._lbl_total_dscto_porc.setText(BA.ObjectToCharSequence("% "+anywheresoftware.b4a.keywords.Common.NumberFormat(_total_pc,(int) (0),(int) (2))));
 //BA.debugLineNum = 179;BA.debugLine="Lbl_Total_Dscto_Valor.Text = \"$ \" & NumberFormat(";
mostCurrent._lbl_total_dscto_valor.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_total_descuento,(int) (0),(int) (2))));
 //BA.debugLineNum = 180;BA.debugLine="Lbl_Total_Linea.Text = \"$ \" & NumberFormat(SubTot";
mostCurrent._lbl_total_linea.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_subtotal_linea,(int) (0),(int) (2))));
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public static void  _xclvdescuentos_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_XclvDescuentos_ItemLongClick rsub = new ResumableSub_XclvDescuentos_ItemLongClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_XclvDescuentos_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDescuentos_ItemLongClick(BaKapp.Movil.Tag.frm_post_01_descuentos parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
BaKapp.Movil.Tag.frm_post_01_descuentos parent;
int _index;
Object _value;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbliddocdsc = null;
anywheresoftware.b4a.objects.LabelWrapper _lblitem = null;
int _id_docdsc = 0;
Object _sf = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _fila_dscto = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 330;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 331;BA.debugLine="Dim Item As CLVItem  = XclvDescuentos.GetRawListI";
_item = parent.mostCurrent._xclvdescuentos._getrawlistitem(_index);
 //BA.debugLineNum = 332;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 333;BA.debugLine="Dim LblIdDocDsc As Label = p.GetView(0)";
_lbliddocdsc = new anywheresoftware.b4a.objects.LabelWrapper();
_lbliddocdsc = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 334;BA.debugLine="Dim LblItem As Label = p.GetView(5)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (5)).getObject()));
 //BA.debugLineNum = 337;BA.debugLine="If NroDscto <> LblItem.Tag Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._nrodscto!=(double)(BA.ObjectToNumber(_lblitem.getTag()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 338;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 339;BA.debugLine="Msgbox2Async(\"Solo puede hacer cambios en la ult";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Solo puede hacer cambios en la ultima fila"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 340;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 343;BA.debugLine="Dim Id_DocDsc As Int = LblIdDocDsc.Tag";
_id_docdsc = (int)(BA.ObjectToNumber(_lbliddocdsc.getTag()));
 //BA.debugLineNum = 345;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 347;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma la";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma la eliminación de este descuento?"),BA.ObjectToCharSequence(""),"SI","","NO",parent.mostCurrent._bmp1);
 //BA.debugLineNum = 348;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 350;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 352;BA.debugLine="Consulta_Sql = \"Select Id_DocDsc From Descuentos";
parent.mostCurrent._consulta_sql = "Select Id_DocDsc From Descuentos_Doc Where Id_DocDsc = "+BA.NumberToString(_id_docdsc);
 //BA.debugLineNum = 353;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Varia";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 355;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_fila_dscto.IsInitialized()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 356;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 359;BA.debugLine="p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p.";
_p.SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300))),_p.getTop(),_p.getWidth(),_p.getHeight());
 //BA.debugLineNum = 360;BA.debugLine="Sleep(600)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (600));
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 //BA.debugLineNum = 361;BA.debugLine="XclvDescuentos.RemoveAt(Index)";
parent.mostCurrent._xclvdescuentos._removeat(_index);
 //BA.debugLineNum = 365;BA.debugLine="Sb_Cargar_Descuentos";
_sb_cargar_descuentos();
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}
