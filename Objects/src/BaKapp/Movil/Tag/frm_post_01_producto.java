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

public class frm_post_01_producto extends Activity implements B4AActivity{
	public static frm_post_01_producto mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_producto");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_post_01_producto).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_producto");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_post_01_producto", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_post_01_producto) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_post_01_producto) Resume **");
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
		return frm_post_01_producto.class;
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
            BA.LogInfo("** Activity (frm_post_01_producto) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_post_01_producto) Pause event (activity is not paused). **");
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
            frm_post_01_producto mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_post_01_producto) Resume **");
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
public static int _id_docdet = 0;
public static boolean _editar = false;
public static boolean _modoconsulta = false;
public static BaKapp.Movil.Tag.mensajes _msj = null;
public static String _consulta_sql = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_codigo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_descripcion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_ubicacion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_stock = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_cantidad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_precio = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_descuento = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total = null;
public anywheresoftware.b4a.objects.collections.Map _fila_enc = null;
public anywheresoftware.b4a.objects.collections.Map _fila = null;
public anywheresoftware.b4a.objects.collections.Map _fila_id = null;
public anywheresoftware.b4a.objects.collections.Map _fila_dscto = null;
public anywheresoftware.b4a.objects.collections.Map _rowproducto = null;
public anywheresoftware.b4a.objects.collections.List _tbldescuentos = null;
public static boolean _procesar_dscto = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_aceptar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_eliminar = null;
public anywheresoftware.b4a.objects.IME _tecladosoft = null;
public static double _totalnetodoc = 0;
public static double _totalbrutodoc = 0;
public static double _total_linea = 0;
public static boolean _chkvalores = false;
public static String _funcionario = "";
public b4a.example3.customlistview _xclvdescuentos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_kodt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_item = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_podt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_vadt = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_editar_descuento = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_revisar_stock = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_ubicacion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_modoconsulta = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_bodega = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_listaprecio = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_editar_precio = null;
public BaKapp.Movil.Tag.cl_permisoxui _cl_permisox = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
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
public BaKapp.Movil.Tag.frm_etiquetas _frm_etiquetas = null;
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.frm_post_01_producto parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
boolean _firsttime;
String _kolt = "";
anywheresoftware.b4a.objects.collections.Map _fl = null;
String _kolt1 = "";
String _nokolt1 = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.BA.IterableList group45;
int index45;
int groupLen45;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="Activity.LoadLayout(\"Cp_Post_01_Producto\")";
parent.mostCurrent._activity.LoadLayout("Cp_Post_01_Producto",mostCurrent.activityBA);
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="Msj.Initialize";
parent._msj._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=20840456;
 //BA.debugLineNum = 20840456;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
parent.mostCurrent._funcionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Variables.Gl_Bo";
parent.mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence("Stock Bod. "+parent.mostCurrent._variables._gl_bodega /*String*/ ));
RDebugUtils.currentLine=20840459;
 //BA.debugLineNum = 20840459;BA.debugLine="Lbl_ModoConsulta.Visible = ModoConsulta";
parent.mostCurrent._lbl_modoconsulta.setVisible(parent._modoconsulta);
RDebugUtils.currentLine=20840460;
 //BA.debugLineNum = 20840460;BA.debugLine="Btn_Aceptar.Visible = Not(ModoConsulta)";
parent.mostCurrent._btn_aceptar.setVisible(anywheresoftware.b4a.keywords.Common.Not(parent._modoconsulta));
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="If ModoConsulta Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._modoconsulta) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="Btn_Eliminar.Text = \"CERRAR\"";
parent.mostCurrent._btn_eliminar.setText(BA.ObjectToCharSequence("CERRAR"));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=20840466;
 //BA.debugLineNum = 20840466;BA.debugLine="ChkValores = True 'Valores Netos";
parent._chkvalores = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=20840468;
 //BA.debugLineNum = 20840468;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=20840469;
 //BA.debugLineNum = 20840469;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
parent.mostCurrent._fila = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840471;
 //BA.debugLineNum = 20840471;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=20840472;
 //BA.debugLineNum = 20840472;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
parent.mostCurrent._fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840474;
 //BA.debugLineNum = 20840474;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=20840475;
 //BA.debugLineNum = 20840475;BA.debugLine="Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840478;
 //BA.debugLineNum = 20840478;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("id_docenc")));
RDebugUtils.currentLine=20840479;
 //BA.debugLineNum = 20840479;BA.debugLine="Fila_Enc = DBUtils.ExecuteMap(Variables.vSql,Cons";
parent.mostCurrent._fila_enc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840481;
 //BA.debugLineNum = 20840481;BA.debugLine="Txt_Codigo.Text = Fila.Get(\"codigo\")";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("codigo"))));
RDebugUtils.currentLine=20840482;
 //BA.debugLineNum = 20840482;BA.debugLine="Txt_Cantidad.Tag = Fila.Get(\"cantidad\")";
parent.mostCurrent._txt_cantidad.setTag(parent.mostCurrent._fila.Get((Object)("cantidad")));
RDebugUtils.currentLine=20840483;
 //BA.debugLineNum = 20840483;BA.debugLine="Lbl_Descripcion.Text = Fila.Get(\"descripcion\")";
parent.mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("descripcion"))));
RDebugUtils.currentLine=20840484;
 //BA.debugLineNum = 20840484;BA.debugLine="Lbl_Precio.Tag = Fila.Get(\"precio\")";
parent.mostCurrent._lbl_precio.setTag(parent.mostCurrent._fila.Get((Object)("precio")));
RDebugUtils.currentLine=20840485;
 //BA.debugLineNum = 20840485;BA.debugLine="Lbl_Descuento.Tag = Fila.Get(\"descuentoporc\")";
parent.mostCurrent._lbl_descuento.setTag(parent.mostCurrent._fila.Get((Object)("descuentoporc")));
RDebugUtils.currentLine=20840487;
 //BA.debugLineNum = 20840487;BA.debugLine="Total_Linea = Fila.Get(\"cantidad\")*Fila.Get(\"prec";
parent._total_linea = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("cantidad"))))*(double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("precio"))));
RDebugUtils.currentLine=20840489;
 //BA.debugLineNum = 20840489;BA.debugLine="If ChkValores Then";
if (true) break;

case 5:
//if
this.state = 10;
if (parent._chkvalores) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=20840490;
 //BA.debugLineNum = 20840490;BA.debugLine="Lbl_Total.Tag = Fila.Get(\"valnetolinea\")";
parent.mostCurrent._lbl_total.setTag(parent.mostCurrent._fila.Get((Object)("valnetolinea")));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=20840492;
 //BA.debugLineNum = 20840492;BA.debugLine="Lbl_Total.Tag = Fila.Get(\"valbrutolinea\")";
parent.mostCurrent._lbl_total.setTag(parent.mostCurrent._fila.Get((Object)("valbrutolinea")));
 if (true) break;
;
RDebugUtils.currentLine=20840495;
 //BA.debugLineNum = 20840495;BA.debugLine="If Lbl_Total.Tag = Null Then";

case 10:
//if
this.state = 13;
if (parent.mostCurrent._lbl_total.getTag()== null) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=20840496;
 //BA.debugLineNum = 20840496;BA.debugLine="Lbl_Total.Tag = 0";
parent.mostCurrent._lbl_total.setTag((Object)(0));
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=20840499;
 //BA.debugLineNum = 20840499;BA.debugLine="Lbl_Ubicacion.Text = Fila.Get(\"ubicacionbod\")";
parent.mostCurrent._lbl_ubicacion.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("ubicacionbod"))));
RDebugUtils.currentLine=20840501;
 //BA.debugLineNum = 20840501;BA.debugLine="If Txt_Cantidad.Tag > 0 Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((double)(BA.ObjectToNumber(parent.mostCurrent._txt_cantidad.getTag()))>0) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=20840502;
 //BA.debugLineNum = 20840502;BA.debugLine="Txt_Cantidad.Text = Txt_Cantidad.Tag";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(parent.mostCurrent._txt_cantidad.getTag()));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=20840504;
 //BA.debugLineNum = 20840504;BA.debugLine="Txt_Cantidad.Text = \"\"";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=20840507;
 //BA.debugLineNum = 20840507;BA.debugLine="Lbl_Precio.Text = \"$ \" & NumberFormat(Lbl_Precio.";
parent.mostCurrent._lbl_precio.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=20840508;
 //BA.debugLineNum = 20840508;BA.debugLine="Lbl_Descuento.Text = NumberFormat(Lbl_Descuento.T";
parent.mostCurrent._lbl_descuento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_descuento.getTag())),(int) (0),(int) (2))+" %"));
RDebugUtils.currentLine=20840509;
 //BA.debugLineNum = 20840509;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(Lbl_Total.Ta";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=20840511;
 //BA.debugLineNum = 20840511;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Fila.Get(\"bodeg";
parent.mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence("Stock Bod. "+BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("bodega")))));
RDebugUtils.currentLine=20840512;
 //BA.debugLineNum = 20840512;BA.debugLine="Lbl_Stock.Text = Fila.Get(\"stockbodega\")";
parent.mostCurrent._lbl_stock.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("stockbodega"))));
RDebugUtils.currentLine=20840521;
 //BA.debugLineNum = 20840521;BA.debugLine="Dim Kolt As String = Fila.Get(\"codlista\") 'Funcio";
_kolt = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codlista")));
RDebugUtils.currentLine=20840523;
 //BA.debugLineNum = 20840523;BA.debugLine="For Each Fl As Map In Variables.Global_Listas_Pre";
if (true) break;

case 20:
//for
this.state = 27;
_fl = new anywheresoftware.b4a.objects.collections.Map();
group45 = parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ ;
index45 = 0;
groupLen45 = group45.getSize();
this.state = 47;
if (true) break;

case 47:
//C
this.state = 27;
if (index45 < groupLen45) {
this.state = 22;
_fl = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group45.Get(index45)));}
if (true) break;

case 48:
//C
this.state = 47;
index45++;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=20840524;
 //BA.debugLineNum = 20840524;BA.debugLine="Dim Kolt1 As String = Fl.Get(\"Kolt\")";
_kolt1 = BA.ObjectToString(_fl.Get((Object)("Kolt")));
RDebugUtils.currentLine=20840525;
 //BA.debugLineNum = 20840525;BA.debugLine="Dim Nokolt1 As String = Fl.Get(\"Nokolt\")";
_nokolt1 = BA.ObjectToString(_fl.Get((Object)("Nokolt")));
RDebugUtils.currentLine=20840526;
 //BA.debugLineNum = 20840526;BA.debugLine="If Kolt = Kolt1 Then";
if (true) break;

case 23:
//if
this.state = 26;
if ((_kolt).equals(_kolt1)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=20840527;
 //BA.debugLineNum = 20840527;BA.debugLine="Lbl_ListaPrecio.Text = Nokolt1";
parent.mostCurrent._lbl_listaprecio.setText(BA.ObjectToCharSequence(_nokolt1));
RDebugUtils.currentLine=20840528;
 //BA.debugLineNum = 20840528;BA.debugLine="Exit";
this.state = 27;
if (true) break;
 if (true) break;

case 26:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=20840535;
 //BA.debugLineNum = 20840535;BA.debugLine="Consulta_Sql = \"Select Mp.*,Mr.*,Cast(Case When C";
parent.mostCurrent._consulta_sql = "Select Mp.*,Mr.*,Cast(Case When Crz.CodigoTabla Is Null Then 0 Else 1 End As Bit) As Acepta_Dscto_Marca,Isnull(Crz.Porcentaje,0) As Dscto_Marca"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEPR Mp"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join TABMR Mr On Mp.MRPR = Mr.KOMR"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join "+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Crz On Crz.Tabla = 'DSCTO_MARCA' And Crz.NombreTabla = 'MRPR' And Crz.CodigoTabla = Mp.MRPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Where Mp.KOPR = '"+BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codigo")))+"'";
RDebugUtils.currentLine=20840541;
 //BA.debugLineNum = 20840541;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
RDebugUtils.currentLine=20840543;
 //BA.debugLineNum = 20840543;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "activity_create"), (Object)(_js));
this.state = 49;
return;
case 49:
//C
this.state = 28;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=20840545;
 //BA.debugLineNum = 20840545;BA.debugLine="If Js.Success Then";
if (true) break;

case 28:
//if
this.state = 35;
if (_js._success /*boolean*/ ) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=20840547;
 //BA.debugLineNum = 20840547;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=20840549;
 //BA.debugLineNum = 20840549;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=20840551;
 //BA.debugLineNum = 20840551;BA.debugLine="RowProducto = Funciones.Fx_DataRow(Js.GetString";
parent.mostCurrent._rowproducto = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=20840557;
 //BA.debugLineNum = 20840557;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
RDebugUtils.currentLine=20840559;
 //BA.debugLineNum = 20840559;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_producto.getObject(),parent.mostCurrent._variables._gl_empresa /*String*/ ,parent.mostCurrent._variables._gl_sucursal /*String*/ ,parent.mostCurrent._txt_codigo.getText(),_kolt,anywheresoftware.b4a.keywords.Common.True,"",(double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("poriva")))),(double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("porila")))),"",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20840570;
 //BA.debugLineNum = 20840570;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "activity_create"), (Object)(_js));
this.state = 50;
return;
case 50:
//C
this.state = 36;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=20840572;
 //BA.debugLineNum = 20840572;BA.debugLine="If Js.Success Then";
if (true) break;

case 36:
//if
this.state = 43;
if (_js._success /*boolean*/ ) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=20840574;
 //BA.debugLineNum = 20840574;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=20840576;
 //BA.debugLineNum = 20840576;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 39:
//if
this.state = 42;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=20840578;
 //BA.debugLineNum = 20840578;BA.debugLine="TblDescuentos = Funciones.Fx_DataTable(vJson)";
parent.mostCurrent._tbldescuentos = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=20840585;
 //BA.debugLineNum = 20840585;BA.debugLine="If Txt_Cantidad.Text = \"\" Then";

case 43:
//if
this.state = 46;
if ((parent.mostCurrent._txt_cantidad.getText()).equals("")) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=20840586;
 //BA.debugLineNum = 20840586;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Cantidad)";
parent.mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(parent.mostCurrent._txt_cantidad.getObject()));
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=20840589;
 //BA.debugLineNum = 20840589;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
parent.mostCurrent._cl_permisox._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=20840590;
 //BA.debugLineNum = 20840590;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
parent.mostCurrent._cl_permisox._designercreateview /*String*/ (null,(Object)(parent.mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=20840593;
 //BA.debugLineNum = 20840593;BA.debugLine="TecladoSoft.HideKeyboard";
parent.mostCurrent._tecladosoft.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=20840595;
 //BA.debugLineNum = 20840595;BA.debugLine="Procesar_Dscto = False";
parent._procesar_dscto = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20840597;
 //BA.debugLineNum = 20840597;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _vsalir = 0;
double _total = 0;
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="If ModoConsulta Then";
if (_modoconsulta) { 
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="ModoConsulta = False";
_modoconsulta = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",mostCurrent._fila_id);
RDebugUtils.currentLine=21037065;
 //BA.debugLineNum = 21037065;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
RDebugUtils.currentLine=21037066;
 //BA.debugLineNum = 21037066;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=21037069;
 //BA.debugLineNum = 21037069;BA.debugLine="Dim Total As Double";
_total = 0;
RDebugUtils.currentLine=21037071;
 //BA.debugLineNum = 21037071;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
RDebugUtils.currentLine=21037072;
 //BA.debugLineNum = 21037072;BA.debugLine="Total = Fila.Get(\"valnetolinea\")";
_total = (double)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("valnetolinea"))));
 }else {
RDebugUtils.currentLine=21037074;
 //BA.debugLineNum = 21037074;BA.debugLine="Total = Fila.Get(\"valbrutolinea\")";
_total = (double)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("valbrutolinea"))));
 };
RDebugUtils.currentLine=21037077;
 //BA.debugLineNum = 21037077;BA.debugLine="If 0 = Txt_Cantidad.Tag Then";
if (0==(double)(BA.ObjectToNumber(mostCurrent._txt_cantidad.getTag()))) { 
RDebugUtils.currentLine=21037079;
 //BA.debugLineNum = 21037079;BA.debugLine="vSalir = Msgbox2(\"Si deja la cantidad en cero e";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Si deja la cantidad en cero el producto no se agregara a la lista"+anywheresoftware.b4a.keywords.Common.CRLF+"¿Estas seguro de salir?"),BA.ObjectToCharSequence("Validaación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=21037082;
 //BA.debugLineNum = 21037082;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=21037083;
 //BA.debugLineNum = 21037083;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_D";
mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",mostCurrent._fila_id);
RDebugUtils.currentLine=21037084;
 //BA.debugLineNum = 21037084;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
RDebugUtils.currentLine=21037085;
 //BA.debugLineNum = 21037085;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=21037087;
 //BA.debugLineNum = 21037087;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=21037092;
 //BA.debugLineNum = 21037092;BA.debugLine="If Total <> Lbl_Total.Tag Then";
if (_total!=(double)(BA.ObjectToNumber(mostCurrent._lbl_total.getTag()))) { 
RDebugUtils.currentLine=21037094;
 //BA.debugLineNum = 21037094;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de cerrar sin a";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de cerrar sin aplicar los cambios?"),BA.ObjectToCharSequence("SALIR SIN GRABAR"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=21037096;
 //BA.debugLineNum = 21037096;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=21037098;
 //BA.debugLineNum = 21037098;BA.debugLine="If Not(Editar) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_editar)) { 
RDebugUtils.currentLine=21037099;
 //BA.debugLineNum = 21037099;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_";
mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",mostCurrent._fila_id);
 };
RDebugUtils.currentLine=21037102;
 //BA.debugLineNum = 21037102;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
RDebugUtils.currentLine=21037103;
 //BA.debugLineNum = 21037103;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=21037106;
 //BA.debugLineNum = 21037106;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=21037110;
 //BA.debugLineNum = 21037110;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
RDebugUtils.currentLine=21037111;
 //BA.debugLineNum = 21037111;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 };
RDebugUtils.currentLine=21037116;
 //BA.debugLineNum = 21037116;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
RDebugUtils.currentLine=21037117;
 //BA.debugLineNum = 21037117;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21037119;
 //BA.debugLineNum = 21037119;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
anywheresoftware.b4a.objects.collections.Map _filaseleccionada = null;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="If Procesar_Dscto Then";
if (_procesar_dscto) { 
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="Fila.Put(\"descuentoporc\",Frm_Post_01_Descuentos.";
mostCurrent._fila.Put((Object)("descuentoporc"),(Object)(mostCurrent._frm_post_01_descuentos._total_pc /*double*/ ));
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\")";
_sb_procesar_datos("DescuentoPorc");
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="Procesar_Dscto = False";
_procesar_dscto = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="If Frm_InfoStockXProd.Msj.EsCorrecto Then";
if (mostCurrent._frm_infostockxprod._msj /*BaKapp.Movil.Tag.mensajes*/ ._escorrecto /*boolean*/ ) { 
RDebugUtils.currentLine=20905997;
 //BA.debugLineNum = 20905997;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=20905999;
 //BA.debugLineNum = 20905999;BA.debugLine="Dim FilaSeleccionada As Map = Frm_InfoStockXProd";
_filaseleccionada = new anywheresoftware.b4a.objects.collections.Map();
_filaseleccionada = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(mostCurrent._frm_infostockxprod._msj /*BaKapp.Movil.Tag.mensajes*/ ._tag /*Object*/ ));
RDebugUtils.currentLine=20906001;
 //BA.debugLineNum = 20906001;BA.debugLine="Fila.Put(\"sucursal\",FilaSeleccionada.Get(\"KOSU\")";
mostCurrent._fila.Put((Object)("sucursal"),_filaseleccionada.Get((Object)("KOSU")));
RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="Fila.Put(\"bodega\",FilaSeleccionada.Get(\"KOBO\"))";
mostCurrent._fila.Put((Object)("bodega"),_filaseleccionada.Get((Object)("KOBO")));
RDebugUtils.currentLine=20906004;
 //BA.debugLineNum = 20906004;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Fila.Get(\"bode";
mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence("Stock Bod. "+BA.ObjectToString(mostCurrent._fila.Get((Object)("bodega")))));
RDebugUtils.currentLine=20906005;
 //BA.debugLineNum = 20906005;BA.debugLine="Lbl_Stock.Text = FilaSeleccionada.Get(\"STFI1\")";
mostCurrent._lbl_stock.setText(BA.ObjectToCharSequence(_filaseleccionada.Get((Object)("STFI1"))));
 };
RDebugUtils.currentLine=20906012;
 //BA.debugLineNum = 20906012;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_procesar_datos(String _cabeza) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_procesar_datos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_procesar_datos", new Object[] {_cabeza}));}
ResumableSub_Sb_Procesar_Datos rsub = new ResumableSub_Sb_Procesar_Datos(null,_cabeza);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Procesar_Datos extends BA.ResumableSub {
public ResumableSub_Sb_Procesar_Datos(BaKapp.Movil.Tag.frm_post_01_producto parent,String _cabeza) {
this.parent = parent;
this._cabeza = _cabeza;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
String _cabeza;
int _untrans = 0;
double _poriva = 0;
double _porila = 0;
double _rtu = 0;
double _impuestos = 0;
double _totaliva = 0;
double _totalila = 0;
double _totalneto = 0;
double _totalbruto = 0;
double _totaldsctoneto = 0;
double _totaldsctobruto = 0;
double _precio = 0;
double _precioneto = 0;
double _preciobruto = 0;
double _precionetorealud1 = 0;
double _precionetorealud2 = 0;
double _total = 0;
String _decimal = "";
double _cantidad = 0;
double _cantud1 = 0;
double _cantud2 = 0;
String _divisible = "";
String _divisible2 = "";
double _descuentovalor = 0;
double _descuentoporc = 0;
double _descuentoporc_original = 0;
double _descmaximo = 0;
String _tict = "";
String _prct = "";
String _tipr = "";
String _codlista = "";
int _numdsctos = 0;
boolean _no_aplica_redondeo = false;
boolean _aplicar_redondeo = false;
double _totalneto_calculo = 0;
double _totalbruto_calculo = 0;
boolean _descontar = false;
double _total_concepto = 0;
double _descuentovalor_anterior = 0;
double _recargo = 0;
double _precio_calculado = 0;
String _moneda_enc = "";
String _tipo_moneda_enc = "";
double _tipo_cambio_ent = 0;
String _moneda_det = "";
String _tipo_moneda_det = "";
double _tipo_cambio_det = 0;
String _decimales = "";
String _divi = "";
double _preciocalculado = 0;
double _valor_dscto = 0;
String _codfunautoriza_dscto = "";
String _codpermiso_dscto = "";
double _preciolista = 0;
double _precio_cn_dscto = 0;
double _precio_netolista = 0;
double _valor_dscto_real = 0;
double _dscto_real = 0;
String _codfunautoriza = "";
boolean _tiene_dscto = false;
boolean _valvtadescmax = false;
boolean _vizado = false;
String _mensaje = "";
Object _msicono = null;
String _msj_dsctoreal = "";
String _multiplo = "";
String _tipovalor = "";
double _precionetoud = 0;
double _preciobrutoud = 0;
double _precionetoudlista = 0;
double _preciobrutoudlista = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("untrans"))));
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("poriva"))));
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("porila"))));
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("rtu"))));
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
RDebugUtils.currentLine=21299217;
 //BA.debugLineNum = 21299217;BA.debugLine="Dim Precio As Double = Lbl_Precio.Tag";
_precio = (double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag()));
RDebugUtils.currentLine=21299219;
 //BA.debugLineNum = 21299219;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
RDebugUtils.currentLine=21299222;
 //BA.debugLineNum = 21299222;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="Dim Total As Double";
_total = 0;
RDebugUtils.currentLine=21299227;
 //BA.debugLineNum = 21299227;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
RDebugUtils.currentLine=21299229;
 //BA.debugLineNum = 21299229;BA.debugLine="Dim Cantidad As Double = Txt_Cantidad.Tag";
_cantidad = (double)(BA.ObjectToNumber(parent.mostCurrent._txt_cantidad.getTag()));
RDebugUtils.currentLine=21299230;
 //BA.debugLineNum = 21299230;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
RDebugUtils.currentLine=21299231;
 //BA.debugLineNum = 21299231;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
RDebugUtils.currentLine=21299233;
 //BA.debugLineNum = 21299233;BA.debugLine="Dim Divisible As String = RowProducto.Get(\"DIVISI";
_divisible = BA.ObjectToString(parent.mostCurrent._rowproducto.Get((Object)("DIVISIBLE")));
RDebugUtils.currentLine=21299234;
 //BA.debugLineNum = 21299234;BA.debugLine="Dim Divisible2 As String = RowProducto.Get(\"DIVIS";
_divisible2 = BA.ObjectToString(parent.mostCurrent._rowproducto.Get((Object)("DIVISIBLE2")));
RDebugUtils.currentLine=21299236;
 //BA.debugLineNum = 21299236;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentovalor"))));
RDebugUtils.currentLine=21299237;
 //BA.debugLineNum = 21299237;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=21299238;
 //BA.debugLineNum = 21299238;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=21299239;
 //BA.debugLineNum = 21299239;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descmaximo"))));
RDebugUtils.currentLine=21299241;
 //BA.debugLineNum = 21299241;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tict")));
RDebugUtils.currentLine=21299242;
 //BA.debugLineNum = 21299242;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("prct")));
RDebugUtils.currentLine=21299243;
 //BA.debugLineNum = 21299243;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tipr")));
RDebugUtils.currentLine=21299245;
 //BA.debugLineNum = 21299245;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codlista")));
RDebugUtils.currentLine=21299247;
 //BA.debugLineNum = 21299247;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
RDebugUtils.currentLine=21299249;
 //BA.debugLineNum = 21299249;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
RDebugUtils.currentLine=21299250;
 //BA.debugLineNum = 21299250;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
RDebugUtils.currentLine=21299252;
 //BA.debugLineNum = 21299252;BA.debugLine="If No_Aplica_Redondeo Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_no_aplica_redondeo) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21299253;
 //BA.debugLineNum = 21299253;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21299256;
 //BA.debugLineNum = 21299256;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
RDebugUtils.currentLine=21299257;
 //BA.debugLineNum = 21299257;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
RDebugUtils.currentLine=21299259;
 //BA.debugLineNum = 21299259;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
RDebugUtils.currentLine=21299260;
 //BA.debugLineNum = 21299260;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
RDebugUtils.currentLine=21299266;
 //BA.debugLineNum = 21299266;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentovalor_anterior"))));
RDebugUtils.currentLine=21299267;
 //BA.debugLineNum = 21299267;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
RDebugUtils.currentLine=21299269;
 //BA.debugLineNum = 21299269;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_cantidad==0 && (_tipr).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=21299276;
 //BA.debugLineNum = 21299276;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
RDebugUtils.currentLine=21299278;
 //BA.debugLineNum = 21299278;BA.debugLine="Dim Moneda_Enc As String = Fila_Enc.Get(\"moneda_d";
_moneda_enc = BA.ObjectToString(parent.mostCurrent._fila_enc.Get((Object)("moneda_doc")));
RDebugUtils.currentLine=21299279;
 //BA.debugLineNum = 21299279;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Enc.Get(\"tip";
_tipo_moneda_enc = BA.ObjectToString(parent.mostCurrent._fila_enc.Get((Object)("tipomoneda")));
RDebugUtils.currentLine=21299280;
 //BA.debugLineNum = 21299280;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Enc.Get(\"tas";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(parent.mostCurrent._fila_enc.Get((Object)("tasadorig_doc"))));
RDebugUtils.currentLine=21299282;
 //BA.debugLineNum = 21299282;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("moneda")));
RDebugUtils.currentLine=21299283;
 //BA.debugLineNum = 21299283;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tipo_moneda")));
RDebugUtils.currentLine=21299284;
 //BA.debugLineNum = 21299284;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("tipo_cambio"))));
RDebugUtils.currentLine=21299286;
 //BA.debugLineNum = 21299286;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
RDebugUtils.currentLine=21299288;
 //BA.debugLineNum = 21299288;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if (true) break;

case 9:
//if
this.state = 24;
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
this.state = 11;
}else {
this.state = 19;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=21299289;
 //BA.debugLineNum = 21299289;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if (true) break;

case 12:
//if
this.state = 17;
if ((_tipo_moneda_enc).equals("N")) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=21299290;
 //BA.debugLineNum = 21299290;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio*_tipo_cambio_ent,(int) (2));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=21299292;
 //BA.debugLineNum = 21299292;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
RDebugUtils.currentLine=21299293;
 //BA.debugLineNum = 21299293;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 if (true) break;

case 17:
//C
this.state = 24;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=21299296;
 //BA.debugLineNum = 21299296;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if (true) break;

case 20:
//if
this.state = 23;
if ((_tipo_moneda_enc).equals("N") == false) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=21299297;
 //BA.debugLineNum = 21299297;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=21299299;
 //BA.debugLineNum = 21299299;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=21299302;
 //BA.debugLineNum = 21299302;BA.debugLine="TecladoSoft.HideKeyboard";
parent.mostCurrent._tecladosoft.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=21299304;
 //BA.debugLineNum = 21299304;BA.debugLine="Dim Divi As String";
_divi = "";
RDebugUtils.currentLine=21299306;
 //BA.debugLineNum = 21299306;BA.debugLine="If UnTrans = 1 Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_untrans==1) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=21299307;
 //BA.debugLineNum = 21299307;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 if (true) break;
;
RDebugUtils.currentLine=21299310;
 //BA.debugLineNum = 21299310;BA.debugLine="If UnTrans = 2 Then";

case 28:
//if
this.state = 31;
if (_untrans==2) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=21299311;
 //BA.debugLineNum = 21299311;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 if (true) break;
;
RDebugUtils.currentLine=21299314;
 //BA.debugLineNum = 21299314;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";

case 31:
//if
this.state = 34;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._funciones._fx_solo_enteros /*boolean*/ (mostCurrent.activityBA,_cantidad,_divi))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=21299316;
 //BA.debugLineNum = 21299316;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("El producto solo permite cantidades enteras"),BA.ObjectToCharSequence("Validación"),"Ok","","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=21299317;
 //BA.debugLineNum = 21299317;BA.debugLine="Cantidad = 0";
_cantidad = 0;
RDebugUtils.currentLine=21299318;
 //BA.debugLineNum = 21299318;BA.debugLine="Txt_Cantidad.Tag = 0";
parent.mostCurrent._txt_cantidad.setTag((Object)(0));
RDebugUtils.currentLine=21299319;
 //BA.debugLineNum = 21299319;BA.debugLine="Txt_Cantidad.Text = \"\"";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21299320;
 //BA.debugLineNum = 21299320;BA.debugLine="Txt_Cantidad.SelectAll";
parent.mostCurrent._txt_cantidad.SelectAll();
RDebugUtils.currentLine=21299321;
 //BA.debugLineNum = 21299321;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Cantidad)";
parent.mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(parent.mostCurrent._txt_cantidad.getObject()));
RDebugUtils.currentLine=21299322;
 //BA.debugLineNum = 21299322;BA.debugLine="Return";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;};
 if (true) break;
;
RDebugUtils.currentLine=21299326;
 //BA.debugLineNum = 21299326;BA.debugLine="If UnTrans = 1 Then";

case 34:
//if
this.state = 43;
if (_untrans==1) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=21299327;
 //BA.debugLineNum = 21299327;BA.debugLine="If Rtu = 1 Then";
if (true) break;

case 37:
//if
this.state = 42;
if (_rtu==1) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=21299328;
 //BA.debugLineNum = 21299328;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=21299329;
 //BA.debugLineNum = 21299329;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=21299331;
 //BA.debugLineNum = 21299331;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=21299332;
 //BA.debugLineNum = 21299332;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=21299336;
 //BA.debugLineNum = 21299336;BA.debugLine="If UnTrans = 2 Then";

case 43:
//if
this.state = 52;
if (_untrans==2) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=21299337;
 //BA.debugLineNum = 21299337;BA.debugLine="If Rtu > 1 Then";
if (true) break;

case 46:
//if
this.state = 51;
if (_rtu>1) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=21299338;
 //BA.debugLineNum = 21299338;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=21299339;
 //BA.debugLineNum = 21299339;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=21299341;
 //BA.debugLineNum = 21299341;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=21299342;
 //BA.debugLineNum = 21299342;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
RDebugUtils.currentLine=21299346;
 //BA.debugLineNum = 21299346;BA.debugLine="If Prct = 1 Then";

case 52:
//if
this.state = 136;
if ((_prct).equals(BA.NumberToString(1))) { 
this.state = 54;
}else {
this.state = 103;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=21299356;
 //BA.debugLineNum = 21299356;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
_totalneto_calculo = parent._totalnetodoc;
RDebugUtils.currentLine=21299357;
 //BA.debugLineNum = 21299357;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
_totalbruto_calculo = parent._totalbrutodoc;
RDebugUtils.currentLine=21299359;
 //BA.debugLineNum = 21299359;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 55:
//if
this.state = 101;
if ((_tict).equals("D")) { 
this.state = 57;
}else 
{RDebugUtils.currentLine=21299389;
 //BA.debugLineNum = 21299389;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
this.state = 77;
}}
if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=21299361;
 //BA.debugLineNum = 21299361;BA.debugLine="Descontar = True";
_descontar = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21299362;
 //BA.debugLineNum = 21299362;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
RDebugUtils.currentLine=21299362;
 //BA.debugLineNum = 21299362;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
RDebugUtils.currentLine=21299362;
 //BA.debugLineNum = 21299362;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
RDebugUtils.currentLine=21299363;
 //BA.debugLineNum = 21299363;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
RDebugUtils.currentLine=21299365;
 //BA.debugLineNum = 21299365;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if (true) break;

case 58:
//if
this.state = 75;
if ((_cabeza).equals("DescuentoPorc")) { 
this.state = 60;
}else 
{RDebugUtils.currentLine=21299377;
 //BA.debugLineNum = 21299377;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
this.state = 68;
}}
if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=21299367;
 //BA.debugLineNum = 21299367;BA.debugLine="If ChkValores Then";
if (true) break;

case 61:
//if
this.state = 66;
if (parent._chkvalores) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
RDebugUtils.currentLine=21299368;
 //BA.debugLineNum = 21299368;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299370;
 //BA.debugLineNum = 21299370;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=21299372;
 //BA.debugLineNum = 21299372;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299374;
 //BA.debugLineNum = 21299374;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 if (true) break;

case 66:
//C
this.state = 75;
;
 if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=21299379;
 //BA.debugLineNum = 21299379;BA.debugLine="If ChkValores Then";
if (true) break;

case 69:
//if
this.state = 74;
if (parent._chkvalores) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
RDebugUtils.currentLine=21299381;
 //BA.debugLineNum = 21299381;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=21299384;
 //BA.debugLineNum = 21299384;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 if (true) break;

case 74:
//C
this.state = 75;
;
 if (true) break;

case 75:
//C
this.state = 101;
;
 if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=21299391;
 //BA.debugLineNum = 21299391;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=21299392;
 //BA.debugLineNum = 21299392;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("recargovalor"))));
RDebugUtils.currentLine=21299394;
 //BA.debugLineNum = 21299394;BA.debugLine="If ChkValores Then";
if (true) break;

case 78:
//if
this.state = 83;
if (parent._chkvalores) { 
this.state = 80;
}else {
this.state = 82;
}if (true) break;

case 80:
//C
this.state = 83;
RDebugUtils.currentLine=21299395;
 //BA.debugLineNum = 21299395;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=21299397;
 //BA.debugLineNum = 21299397;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_total_concepto/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=21299398;
 //BA.debugLineNum = 21299398;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 if (true) break;
;
RDebugUtils.currentLine=21299401;
 //BA.debugLineNum = 21299401;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";

case 83:
//if
this.state = 100;
if ((_cabeza).equals("DescuentoPorc")) { 
this.state = 85;
}else 
{RDebugUtils.currentLine=21299424;
 //BA.debugLineNum = 21299424;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
if ((_cabeza).equals("ValNetoLinea")) { 
this.state = 93;
}}
if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=21299403;
 //BA.debugLineNum = 21299403;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=21299404;
 //BA.debugLineNum = 21299404;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=21299406;
 //BA.debugLineNum = 21299406;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
RDebugUtils.currentLine=21299408;
 //BA.debugLineNum = 21299408;BA.debugLine="If ChkValores Then";
if (true) break;

case 86:
//if
this.state = 91;
if (parent._chkvalores) { 
this.state = 88;
}else {
this.state = 90;
}if (true) break;

case 88:
//C
this.state = 91;
RDebugUtils.currentLine=21299410;
 //BA.debugLineNum = 21299410;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299411;
 //BA.debugLineNum = 21299411;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = anywheresoftware.b4a.keywords.Common.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299413;
 //BA.debugLineNum = 21299413;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
RDebugUtils.currentLine=21299414;
 //BA.debugLineNum = 21299414;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=21299418;
 //BA.debugLineNum = 21299418;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299420;
 //BA.debugLineNum = 21299420;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 if (true) break;

case 91:
//C
this.state = 100;
;
 if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=21299426;
 //BA.debugLineNum = 21299426;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=21299427;
 //BA.debugLineNum = 21299427;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=21299429;
 //BA.debugLineNum = 21299429;BA.debugLine="If ChkValores Then";
if (true) break;

case 94:
//if
this.state = 99;
if (parent._chkvalores) { 
this.state = 96;
}else {
this.state = 98;
}if (true) break;

case 96:
//C
this.state = 99;
RDebugUtils.currentLine=21299431;
 //BA.debugLineNum = 21299431;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 if (true) break;

case 98:
//C
this.state = 99;
RDebugUtils.currentLine=21299434;
 //BA.debugLineNum = 21299434;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 if (true) break;

case 99:
//C
this.state = 100;
;
RDebugUtils.currentLine=21299437;
 //BA.debugLineNum = 21299437;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 if (true) break;

case 100:
//C
this.state = 101;
;
RDebugUtils.currentLine=21299441;
 //BA.debugLineNum = 21299441;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 if (true) break;

case 101:
//C
this.state = 136;
;
 if (true) break;

case 103:
//C
this.state = 104;
RDebugUtils.currentLine=21299457;
 //BA.debugLineNum = 21299457;BA.debugLine="If ChkValores Then";
if (true) break;

case 104:
//if
this.state = 109;
if (parent._chkvalores) { 
this.state = 106;
}else {
this.state = 108;
}if (true) break;

case 106:
//C
this.state = 109;
RDebugUtils.currentLine=21299458;
 //BA.debugLineNum = 21299458;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=21299460;
 //BA.debugLineNum = 21299460;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio_calculado/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=21299461;
 //BA.debugLineNum = 21299461;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 if (true) break;

case 109:
//C
this.state = 110;
;
RDebugUtils.currentLine=21299464;
 //BA.debugLineNum = 21299464;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_precioneto*_cantidad,(int) (3));
RDebugUtils.currentLine=21299465;
 //BA.debugLineNum = 21299465;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=21299467;
 //BA.debugLineNum = 21299467;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if (true) break;

case 110:
//if
this.state = 113;
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
RDebugUtils.currentLine=21299469;
 //BA.debugLineNum = 21299469;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=21299470;
 //BA.debugLineNum = 21299470;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 if (true) break;

case 113:
//C
this.state = 114;
;
RDebugUtils.currentLine=21299482;
 //BA.debugLineNum = 21299482;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
RDebugUtils.currentLine=21299483;
 //BA.debugLineNum = 21299483;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
RDebugUtils.currentLine=21299487;
 //BA.debugLineNum = 21299487;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if (true) break;

case 114:
//if
this.state = 135;
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
this.state = 116;
}else 
{RDebugUtils.currentLine=21299507;
 //BA.debugLineNum = 21299507;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
this.state = 128;
}}
if (true) break;

case 116:
//C
this.state = 117;
RDebugUtils.currentLine=21299489;
 //BA.debugLineNum = 21299489;BA.debugLine="If Precio > 0 Then";
if (true) break;

case 117:
//if
this.state = 126;
if (_precio>0) { 
this.state = 119;
}if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=21299491;
 //BA.debugLineNum = 21299491;BA.debugLine="If ChkValores Then";
if (true) break;

case 120:
//if
this.state = 125;
if (parent._chkvalores) { 
this.state = 122;
}else {
this.state = 124;
}if (true) break;

case 122:
//C
this.state = 125;
RDebugUtils.currentLine=21299493;
 //BA.debugLineNum = 21299493;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299495;
 //BA.debugLineNum = 21299495;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 124:
//C
this.state = 125;
RDebugUtils.currentLine=21299499;
 //BA.debugLineNum = 21299499;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299501;
 //BA.debugLineNum = 21299501;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 if (true) break;

case 125:
//C
this.state = 126;
;
 if (true) break;

case 126:
//C
this.state = 135;
;
 if (true) break;

case 128:
//C
this.state = 129;
RDebugUtils.currentLine=21299509;
 //BA.debugLineNum = 21299509;BA.debugLine="If ChkValores Then";
if (true) break;

case 129:
//if
this.state = 134;
if (parent._chkvalores) { 
this.state = 131;
}else {
this.state = 133;
}if (true) break;

case 131:
//C
this.state = 134;
RDebugUtils.currentLine=21299511;
 //BA.debugLineNum = 21299511;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 133:
//C
this.state = 134;
RDebugUtils.currentLine=21299514;
 //BA.debugLineNum = 21299514;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 if (true) break;

case 134:
//C
this.state = 135;
;
 if (true) break;

case 135:
//C
this.state = 136;
;
 if (true) break;

case 136:
//C
this.state = 137;
;
RDebugUtils.currentLine=21299522;
 //BA.debugLineNum = 21299522;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
parent.mostCurrent._fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=21299523;
 //BA.debugLineNum = 21299523;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
parent.mostCurrent._fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
RDebugUtils.currentLine=21299524;
 //BA.debugLineNum = 21299524;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
parent.mostCurrent._fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
RDebugUtils.currentLine=21299526;
 //BA.debugLineNum = 21299526;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
parent.mostCurrent._fila.Put((Object)("DsctoRealPorc"),(Object)(0));
RDebugUtils.currentLine=21299527;
 //BA.debugLineNum = 21299527;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
parent.mostCurrent._fila.Put((Object)("DsctoRealValor"),(Object)(0));
RDebugUtils.currentLine=21299537;
 //BA.debugLineNum = 21299537;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
RDebugUtils.currentLine=21299539;
 //BA.debugLineNum = 21299539;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=21299540;
 //BA.debugLineNum = 21299540;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
RDebugUtils.currentLine=21299541;
 //BA.debugLineNum = 21299541;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
RDebugUtils.currentLine=21299543;
 //BA.debugLineNum = 21299543;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if (true) break;

case 137:
//if
this.state = 187;
if ((_prct).equals(BA.NumberToString(0))) { 
this.state = 139;
}else {
this.state = 186;
}if (true) break;

case 139:
//C
this.state = 140;
RDebugUtils.currentLine=21299545;
 //BA.debugLineNum = 21299545;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
RDebugUtils.currentLine=21299547;
 //BA.debugLineNum = 21299547;BA.debugLine="If ChkValores Then";
if (true) break;

case 140:
//if
this.state = 145;
if (parent._chkvalores) { 
this.state = 142;
}else {
this.state = 144;
}if (true) break;

case 142:
//C
this.state = 145;
RDebugUtils.currentLine=21299548;
 //BA.debugLineNum = 21299548;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("precionetoudlista")))),(int) (0));
 if (true) break;

case 144:
//C
this.state = 145;
RDebugUtils.currentLine=21299550;
 //BA.debugLineNum = 21299550;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 if (true) break;

case 145:
//C
this.state = 146;
;
RDebugUtils.currentLine=21299556;
 //BA.debugLineNum = 21299556;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
RDebugUtils.currentLine=21299557;
 //BA.debugLineNum = 21299557;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
RDebugUtils.currentLine=21299558;
 //BA.debugLineNum = 21299558;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = anywheresoftware.b4a.keywords.Common.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
RDebugUtils.currentLine=21299560;
 //BA.debugLineNum = 21299560;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
RDebugUtils.currentLine=21299562;
 //BA.debugLineNum = 21299562;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (true) break;

case 146:
//if
this.state = 149;
if (_valor_dscto_real>0) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
RDebugUtils.currentLine=21299563;
 //BA.debugLineNum = 21299563;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = anywheresoftware.b4a.keywords.Common.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 if (true) break;

case 149:
//C
this.state = 150;
;
RDebugUtils.currentLine=21299570;
 //BA.debugLineNum = 21299570;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codfunautoriza")));
RDebugUtils.currentLine=21299572;
 //BA.debugLineNum = 21299572;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
RDebugUtils.currentLine=21299573;
 //BA.debugLineNum = 21299573;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
RDebugUtils.currentLine=21299575;
 //BA.debugLineNum = 21299575;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if (true) break;

case 150:
//if
this.state = 155;
if ((_codfunautoriza).equals("xyz")) { 
this.state = 152;
;}if (true) break;

case 152:
//C
this.state = 155;
_codfunautoriza = parent.mostCurrent._funcionario;
if (true) break;

case 155:
//C
this.state = 156;
;
RDebugUtils.currentLine=21299577;
 //BA.debugLineNum = 21299577;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (true) break;

case 156:
//if
this.state = 184;
if (_precio_cn_dscto<_precio_netolista) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
RDebugUtils.currentLine=21299579;
 //BA.debugLineNum = 21299579;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
RDebugUtils.currentLine=21299581;
 //BA.debugLineNum = 21299581;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (true) break;

case 159:
//if
this.state = 164;
if (_descmaximo==0) { 
this.state = 161;
;}if (true) break;

case 161:
//C
this.state = 164;
_descmaximo = 0.5;
if (true) break;

case 164:
//C
this.state = 165;
;
RDebugUtils.currentLine=21299583;
 //BA.debugLineNum = 21299583;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (true) break;

case 165:
//if
this.state = 183;
if (_dscto_real>_descmaximo) { 
this.state = 167;
}if (true) break;

case 167:
//C
this.state = 168;
RDebugUtils.currentLine=21299585;
 //BA.debugLineNum = 21299585;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21299587;
 //BA.debugLineNum = 21299587;BA.debugLine="If Vizado Then";
if (true) break;

case 168:
//if
this.state = 182;
if (_vizado) { 
this.state = 170;
}else {
this.state = 172;
}if (true) break;

case 170:
//C
this.state = 182;
RDebugUtils.currentLine=21299588;
 //BA.debugLineNum = 21299588;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 172:
//C
this.state = 173;
RDebugUtils.currentLine=21299593;
 //BA.debugLineNum = 21299593;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
RDebugUtils.currentLine=21299594;
 //BA.debugLineNum = 21299594;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
RDebugUtils.currentLine=21299602;
 //BA.debugLineNum = 21299602;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
RDebugUtils.currentLine=21299604;
 //BA.debugLineNum = 21299604;BA.debugLine="If Precio <> PrecioLista Then";
if (true) break;

case 173:
//if
this.state = 176;
if (_precio!=_preciolista) { 
this.state = 175;
}if (true) break;

case 175:
//C
this.state = 176;
RDebugUtils.currentLine=21299605;
 //BA.debugLineNum = 21299605;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = anywheresoftware.b4a.keywords.Common.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 if (true) break;
;
RDebugUtils.currentLine=21299608;
 //BA.debugLineNum = 21299608;BA.debugLine="If Dscto_Real > Valor_Dscto Then";

case 176:
//if
this.state = 181;
if (_dscto_real>_valor_dscto) { 
this.state = 178;
}else {
this.state = 180;
}if (true) break;

case 178:
//C
this.state = 181;
RDebugUtils.currentLine=21299610;
 //BA.debugLineNum = 21299610;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
RDebugUtils.currentLine=21299613;
 //BA.debugLineNum = 21299613;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 180:
//C
this.state = 181;
RDebugUtils.currentLine=21299616;
 //BA.debugLineNum = 21299616;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
_codfunautoriza_dscto = parent.mostCurrent._funcionario;
RDebugUtils.currentLine=21299618;
 //BA.debugLineNum = 21299618;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 181:
//C
this.state = 182;
;
 if (true) break;

case 182:
//C
this.state = 183;
;
 if (true) break;

case 183:
//C
this.state = 184;
;
 if (true) break;

case 184:
//C
this.state = 187;
;
 if (true) break;

case 186:
//C
this.state = 187;
RDebugUtils.currentLine=21299640;
 //BA.debugLineNum = 21299640;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=21299646;
 //BA.debugLineNum = 21299646;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";

case 187:
//if
this.state = 192;
if (parent._chkvalores) { 
this.state = 189;
}else {
this.state = 191;
}if (true) break;

case 189:
//C
this.state = 192;
RDebugUtils.currentLine=21299647;
 //BA.debugLineNum = 21299647;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 if (true) break;

case 191:
//C
this.state = 192;
RDebugUtils.currentLine=21299649;
 //BA.debugLineNum = 21299649;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 if (true) break;
;
RDebugUtils.currentLine=21299654;
 //BA.debugLineNum = 21299654;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";

case 192:
//if
this.state = 208;
if (parent._chkvalores) { 
this.state = 194;
}else {
this.state = 203;
}if (true) break;

case 194:
//C
this.state = 195;
RDebugUtils.currentLine=21299656;
 //BA.debugLineNum = 21299656;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21299657;
 //BA.debugLineNum = 21299657;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=21299658;
 //BA.debugLineNum = 21299658;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=21299659;
 //BA.debugLineNum = 21299659;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=21299660;
 //BA.debugLineNum = 21299660;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=21299662;
 //BA.debugLineNum = 21299662;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
RDebugUtils.currentLine=21299664;
 //BA.debugLineNum = 21299664;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
RDebugUtils.currentLine=21299665;
 //BA.debugLineNum = 21299665;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, 0)";
_preciobruto = anywheresoftware.b4a.keywords.Common.Round2(_precio*_impuestos,(int) (0));
RDebugUtils.currentLine=21299667;
 //BA.debugLineNum = 21299667;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 195:
//if
this.state = 198;
if ((_tict).equals("D")) { 
this.state = 197;
}if (true) break;

case 197:
//C
this.state = 198;
RDebugUtils.currentLine=21299668;
 //BA.debugLineNum = 21299668;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 if (true) break;
;
RDebugUtils.currentLine=21299671;
 //BA.debugLineNum = 21299671;BA.debugLine="If Tict = \"R\" Then";

case 198:
//if
this.state = 201;
if ((_tict).equals("R")) { 
this.state = 200;
}if (true) break;

case 200:
//C
this.state = 201;
RDebugUtils.currentLine=21299673;
 //BA.debugLineNum = 21299673;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
RDebugUtils.currentLine=21299674;
 //BA.debugLineNum = 21299674;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 if (true) break;

case 201:
//C
this.state = 208;
;
 if (true) break;

case 203:
//C
this.state = 204;
RDebugUtils.currentLine=21299680;
 //BA.debugLineNum = 21299680;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=21299681;
 //BA.debugLineNum = 21299681;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=21299682;
 //BA.debugLineNum = 21299682;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=21299683;
 //BA.debugLineNum = 21299683;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=21299684;
 //BA.debugLineNum = 21299684;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
RDebugUtils.currentLine=21299686;
 //BA.debugLineNum = 21299686;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
RDebugUtils.currentLine=21299687;
 //BA.debugLineNum = 21299687;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=21299689;
 //BA.debugLineNum = 21299689;BA.debugLine="If Tict = \"R\" Then";
if (true) break;

case 204:
//if
this.state = 207;
if ((_tict).equals("R")) { 
this.state = 206;
}if (true) break;

case 206:
//C
this.state = 207;
RDebugUtils.currentLine=21299691;
 //BA.debugLineNum = 21299691;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
RDebugUtils.currentLine=21299692;
 //BA.debugLineNum = 21299692;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 if (true) break;

case 207:
//C
this.state = 208;
;
 if (true) break;
;
RDebugUtils.currentLine=21299699;
 //BA.debugLineNum = 21299699;BA.debugLine="If Descontar Then";

case 208:
//if
this.state = 232;
if (_descontar) { 
this.state = 210;
}else {
this.state = 221;
}if (true) break;

case 210:
//C
this.state = 211;
RDebugUtils.currentLine=21299701;
 //BA.debugLineNum = 21299701;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=21299702;
 //BA.debugLineNum = 21299702;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
RDebugUtils.currentLine=21299704;
 //BA.debugLineNum = 21299704;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (true) break;

case 211:
//if
this.state = 216;
if (parent._chkvalores) { 
this.state = 213;
}else {
this.state = 215;
}if (true) break;

case 213:
//C
this.state = 216;
RDebugUtils.currentLine=21299705;
 //BA.debugLineNum = 21299705;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
RDebugUtils.currentLine=21299706;
 //BA.debugLineNum = 21299706;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=21299707;
 //BA.debugLineNum = 21299707;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=21299708;
 //BA.debugLineNum = 21299708;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=21299709;
 //BA.debugLineNum = 21299709;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=21299710;
 //BA.debugLineNum = 21299710;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 if (true) break;

case 215:
//C
this.state = 216;
RDebugUtils.currentLine=21299712;
 //BA.debugLineNum = 21299712;BA.debugLine="TotalBruto = DescuentoValor";
_totalbruto = _descuentovalor;
RDebugUtils.currentLine=21299713;
 //BA.debugLineNum = 21299713;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=21299714;
 //BA.debugLineNum = 21299714;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=21299715;
 //BA.debugLineNum = 21299715;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=21299716;
 //BA.debugLineNum = 21299716;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=21299717;
 //BA.debugLineNum = 21299717;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 if (true) break;
;
RDebugUtils.currentLine=21299720;
 //BA.debugLineNum = 21299720;BA.debugLine="If TotalNeto > 0 Then";

case 216:
//if
this.state = 219;
if (_totalneto>0) { 
this.state = 218;
}if (true) break;

case 218:
//C
this.state = 219;
RDebugUtils.currentLine=21299722;
 //BA.debugLineNum = 21299722;BA.debugLine="TotalIla = TotalIla * -1";
_totalila = _totalila*-1;
RDebugUtils.currentLine=21299723;
 //BA.debugLineNum = 21299723;BA.debugLine="TotalIva = TotalIva * -1";
_totaliva = _totaliva*-1;
RDebugUtils.currentLine=21299724;
 //BA.debugLineNum = 21299724;BA.debugLine="TotalNeto = TotalNeto * -1";
_totalneto = _totalneto*-1;
RDebugUtils.currentLine=21299725;
 //BA.debugLineNum = 21299725;BA.debugLine="TotalBruto = TotalBruto * -1";
_totalbruto = _totalbruto*-1;
RDebugUtils.currentLine=21299726;
 //BA.debugLineNum = 21299726;BA.debugLine="Total = Total * -1";
_total = _total*-1;
 if (true) break;

case 219:
//C
this.state = 232;
;
 if (true) break;

case 221:
//C
this.state = 222;
RDebugUtils.currentLine=21299734;
 //BA.debugLineNum = 21299734;BA.debugLine="If Cantidad > 0 Then";
if (true) break;

case 222:
//if
this.state = 231;
if (_cantidad>0) { 
this.state = 224;
}else {
this.state = 230;
}if (true) break;

case 224:
//C
this.state = 225;
RDebugUtils.currentLine=21299736;
 //BA.debugLineNum = 21299736;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=21299737;
 //BA.debugLineNum = 21299737;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud2,(int) (5));
RDebugUtils.currentLine=21299739;
 //BA.debugLineNum = 21299739;BA.debugLine="If ChkValores = False Then";
if (true) break;

case 225:
//if
this.state = 228;
if (parent._chkvalores==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 227;
}if (true) break;

case 227:
//C
this.state = 228;
RDebugUtils.currentLine=21299740;
 //BA.debugLineNum = 21299740;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 if (true) break;

case 228:
//C
this.state = 231;
;
 if (true) break;

case 230:
//C
this.state = 231;
RDebugUtils.currentLine=21299744;
 //BA.debugLineNum = 21299744;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=21299745;
 //BA.debugLineNum = 21299745;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 if (true) break;

case 231:
//C
this.state = 232;
;
 if (true) break;
;
RDebugUtils.currentLine=21299750;
 //BA.debugLineNum = 21299750;BA.debugLine="If Prct = 1 Then";

case 232:
//if
this.state = 246;
if ((_prct).equals(BA.NumberToString(1))) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
RDebugUtils.currentLine=21299752;
 //BA.debugLineNum = 21299752;BA.debugLine="Dim Multiplo = 1";
_multiplo = BA.NumberToString(1);
RDebugUtils.currentLine=21299754;
 //BA.debugLineNum = 21299754;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 235:
//if
this.state = 240;
if ((_tict).equals("D")) { 
this.state = 237;
}else 
{RDebugUtils.currentLine=21299756;
 //BA.debugLineNum = 21299756;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
this.state = 239;
}}
if (true) break;

case 237:
//C
this.state = 240;
RDebugUtils.currentLine=21299755;
 //BA.debugLineNum = 21299755;BA.debugLine="Multiplo = -1";
_multiplo = BA.NumberToString(-1);
 if (true) break;

case 239:
//C
this.state = 240;
RDebugUtils.currentLine=21299757;
 //BA.debugLineNum = 21299757;BA.debugLine="Multiplo = 1";
_multiplo = BA.NumberToString(1);
 if (true) break;
;
RDebugUtils.currentLine=21299760;
 //BA.debugLineNum = 21299760;BA.debugLine="If ChkValores Then";

case 240:
//if
this.state = 245;
if (parent._chkvalores) { 
this.state = 242;
}else {
this.state = 244;
}if (true) break;

case 242:
//C
this.state = 245;
RDebugUtils.currentLine=21299762;
 //BA.debugLineNum = 21299762;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*(double)(Double.parseDouble(_multiplo));
RDebugUtils.currentLine=21299763;
 //BA.debugLineNum = 21299763;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 if (true) break;

case 244:
//C
this.state = 245;
RDebugUtils.currentLine=21299768;
 //BA.debugLineNum = 21299768;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*(double)(Double.parseDouble(_multiplo));
RDebugUtils.currentLine=21299769;
 //BA.debugLineNum = 21299769;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 if (true) break;

case 245:
//C
this.state = 246;
;
 if (true) break;

case 246:
//C
this.state = 247;
;
RDebugUtils.currentLine=21299812;
 //BA.debugLineNum = 21299812;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = anywheresoftware.b4a.keywords.Common.Round2(_totalila,(int) (2));
RDebugUtils.currentLine=21299813;
 //BA.debugLineNum = 21299813;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = anywheresoftware.b4a.keywords.Common.Round2(_totaliva,(int) (2));
RDebugUtils.currentLine=21299814;
 //BA.debugLineNum = 21299814;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=21299815;
 //BA.debugLineNum = 21299815;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto,(int) (0));
RDebugUtils.currentLine=21299817;
 //BA.debugLineNum = 21299817;BA.debugLine="If ChkValores Then";
if (true) break;

case 247:
//if
this.state = 252;
if (parent._chkvalores) { 
this.state = 249;
}else {
this.state = 251;
}if (true) break;

case 249:
//C
this.state = 252;
RDebugUtils.currentLine=21299818;
 //BA.debugLineNum = 21299818;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalNeto,0";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalneto,(int) (0),(int) (2))));
 if (true) break;

case 251:
//C
this.state = 252;
RDebugUtils.currentLine=21299820;
 //BA.debugLineNum = 21299820;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalBruto,";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalbruto,(int) (0),(int) (0))));
 if (true) break;

case 252:
//C
this.state = 253;
;
RDebugUtils.currentLine=21299823;
 //BA.debugLineNum = 21299823;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
parent.mostCurrent._fila.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=21299824;
 //BA.debugLineNum = 21299824;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
parent.mostCurrent._fila.Put((Object)("cantud1"),(Object)(_cantud1));
RDebugUtils.currentLine=21299825;
 //BA.debugLineNum = 21299825;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
parent.mostCurrent._fila.Put((Object)("cantud2"),(Object)(_cantud2));
RDebugUtils.currentLine=21299827;
 //BA.debugLineNum = 21299827;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
parent.mostCurrent._fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
RDebugUtils.currentLine=21299828;
 //BA.debugLineNum = 21299828;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
parent.mostCurrent._fila.Put((Object)("valivalinea"),(Object)(_totaliva));
RDebugUtils.currentLine=21299829;
 //BA.debugLineNum = 21299829;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
parent.mostCurrent._fila.Put((Object)("valilalinea"),(Object)(_totalila));
RDebugUtils.currentLine=21299830;
 //BA.debugLineNum = 21299830;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
parent.mostCurrent._fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
RDebugUtils.currentLine=21299832;
 //BA.debugLineNum = 21299832;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
parent.mostCurrent._fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
RDebugUtils.currentLine=21299833;
 //BA.debugLineNum = 21299833;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
parent.mostCurrent._fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
RDebugUtils.currentLine=21299835;
 //BA.debugLineNum = 21299835;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
parent.mostCurrent._fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
RDebugUtils.currentLine=21299836;
 //BA.debugLineNum = 21299836;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
parent.mostCurrent._fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
RDebugUtils.currentLine=21299838;
 //BA.debugLineNum = 21299838;BA.debugLine="Lbl_Descuento.Text = NumberFormat(DescuentoPorc,0";
parent.mostCurrent._lbl_descuento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_descuentoporc,(int) (0),(int) (2))+" %"));
RDebugUtils.currentLine=21299841;
 //BA.debugLineNum = 21299841;BA.debugLine="Dim TipoValor As String";
_tipovalor = "";
RDebugUtils.currentLine=21299843;
 //BA.debugLineNum = 21299843;BA.debugLine="If ChkValores Then";
if (true) break;

case 253:
//if
this.state = 258;
if (parent._chkvalores) { 
this.state = 255;
}else {
this.state = 257;
}if (true) break;

case 255:
//C
this.state = 258;
RDebugUtils.currentLine=21299844;
 //BA.debugLineNum = 21299844;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalNeto,0";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalneto,(int) (0),(int) (2))));
RDebugUtils.currentLine=21299845;
 //BA.debugLineNum = 21299845;BA.debugLine="TipoValor = \"N\"";
_tipovalor = "N";
RDebugUtils.currentLine=21299846;
 //BA.debugLineNum = 21299846;BA.debugLine="Total_Linea = TotalNeto	+ DescuentoValor";
parent._total_linea = _totalneto+_descuentovalor;
 if (true) break;

case 257:
//C
this.state = 258;
RDebugUtils.currentLine=21299848;
 //BA.debugLineNum = 21299848;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalBruto,";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalbruto,(int) (0),(int) (0))));
RDebugUtils.currentLine=21299849;
 //BA.debugLineNum = 21299849;BA.debugLine="TipoValor = \"B\"";
_tipovalor = "B";
RDebugUtils.currentLine=21299850;
 //BA.debugLineNum = 21299850;BA.debugLine="Total_Linea = TotalBruto + DescuentoValor";
parent._total_linea = _totalbruto+_descuentovalor;
 if (true) break;

case 258:
//C
this.state = -1;
;
RDebugUtils.currentLine=21299853;
 //BA.debugLineNum = 21299853;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
parent.mostCurrent._fila.Put((Object)("tipovalor"),(Object)(_tipovalor));
RDebugUtils.currentLine=21299855;
 //BA.debugLineNum = 21299855;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
_precionetoud = _precioneto;
RDebugUtils.currentLine=21299856;
 //BA.debugLineNum = 21299856;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
_preciobrutoud = _preciobruto;
RDebugUtils.currentLine=21299858;
 //BA.debugLineNum = 21299858;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
_precionetoudlista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("precionetoudlista")))),(int) (0));
RDebugUtils.currentLine=21299859;
 //BA.debugLineNum = 21299859;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
_preciobrutoudlista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("preciobrutoudlista")))),(int) (0));
RDebugUtils.currentLine=21299861;
 //BA.debugLineNum = 21299861;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
parent.mostCurrent._fila.Put((Object)("precionetoud"),(Object)(_precionetoud));
RDebugUtils.currentLine=21299863;
 //BA.debugLineNum = 21299863;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
parent.mostCurrent._fila.Put((Object)("preciobrutoud"),(Object)(_preciobrutoud));
RDebugUtils.currentLine=21299866;
 //BA.debugLineNum = 21299866;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=21299868;
 //BA.debugLineNum = 21299868;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_aceptar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_aceptar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_aceptar_click", null); return;}
ResumableSub_Btn_Aceptar_Click rsub = new ResumableSub_Btn_Aceptar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Aceptar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Aceptar_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
int _result = 0;
String _codigo = "";
String _tido = "";
String _empresa = "";
String _sucursal = "";
String _bodega = "";
double _cantidad = 0;
int _untrans = 0;
String _tidopa = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _filastk = null;
double _stock_disponible = 0;
double _stock_fisico = 0;
boolean _stock_suficiente = false;
Object _sf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="If 0 = Txt_Cantidad.Tag  Then";
if (true) break;

case 1:
//if
this.state = 36;
if (0==(double)(BA.ObjectToNumber(parent.mostCurrent._txt_cantidad.getTag()))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 36;
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Msgbox2Async(\"No puede agregar un producto con c";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede agregar un producto con cantidad cero"),BA.ObjectToCharSequence("Validación"),"Ok","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_aceptar_click"), null);
this.state = 37;
return;
case 37:
//C
this.state = 36;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="Dim Codigo As String = Fila.Get(\"codigo\")";
_codigo = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codigo")));
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="Dim Tido As String = \"NVV\"";
_tido = "NVV";
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="Dim Empresa As String = Fila.Get(\"empresa\")";
_empresa = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("empresa")));
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="Dim Sucursal As String = Fila.Get(\"sucursal\")";
_sucursal = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("sucursal")));
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="Dim Bodega As String = Fila.Get(\"bodega\")";
_bodega = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("bodega")));
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("cantidad"))));
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("untrans"))));
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="Dim Tidopa As String = Fila.Get(\"tidopa\")";
_tidopa = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tidopa")));
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Re";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_revisar_stock_fila /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_producto.getObject(),_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa);
RDebugUtils.currentLine=21495829;
 //BA.debugLineNum = 21495829;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_aceptar_click"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 6;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21495831;
 //BA.debugLineNum = 21495831;BA.debugLine="If Js.Success Then";
if (true) break;

case 6:
//if
this.state = 35;
if (_js._success /*boolean*/ ) { 
this.state = 8;
}else {
this.state = 34;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21495833;
 //BA.debugLineNum = 21495833;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21495835;
 //BA.debugLineNum = 21495835;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 9:
//if
this.state = 32;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 11;
}else {
this.state = 31;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=21495837;
 //BA.debugLineNum = 21495837;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=21495838;
 //BA.debugLineNum = 21495838;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
_filastk = new anywheresoftware.b4a.objects.collections.Map();
_filastk = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=21495840;
 //BA.debugLineNum = 21495840;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"";
_stock_disponible = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Disponible"))));
RDebugUtils.currentLine=21495841;
 //BA.debugLineNum = 21495841;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stoc";
_stock_fisico = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Fisico"))));
RDebugUtils.currentLine=21495842;
 //BA.debugLineNum = 21495842;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible &";
anywheresoftware.b4a.keywords.Common.LogImpl("621495842","Stock disponible: "+BA.NumberToString(_stock_disponible)+", Stock fisico: "+BA.NumberToString(_stock_fisico),0);
RDebugUtils.currentLine=21495844;
 //BA.debugLineNum = 21495844;BA.debugLine="Dim Stock_Suficiente As Boolean";
_stock_suficiente = false;
RDebugUtils.currentLine=21495846;
 //BA.debugLineNum = 21495846;BA.debugLine="If Stock_Disponible <= 0 Then";
if (true) break;

case 12:
//if
this.state = 21;
if (_stock_disponible<=0) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 21;
RDebugUtils.currentLine=21495847;
 //BA.debugLineNum = 21495847;BA.debugLine="Stock_Suficiente = False";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=21495849;
 //BA.debugLineNum = 21495849;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_stock_disponible-_cantidad>=0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=21495850;
 //BA.debugLineNum = 21495850;BA.debugLine="Stock_Suficiente = True";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=21495854;
 //BA.debugLineNum = 21495854;BA.debugLine="Fila.Put(\"stockbodega\",Stock_Disponible)";
parent.mostCurrent._fila.Put((Object)("stockbodega"),(Object)(_stock_disponible));
RDebugUtils.currentLine=21495855;
 //BA.debugLineNum = 21495855;BA.debugLine="Lbl_Stock.Text = Fila.Get(\"stockbodega\")";
parent.mostCurrent._lbl_stock.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("stockbodega"))));
RDebugUtils.currentLine=21495857;
 //BA.debugLineNum = 21495857;BA.debugLine="If Stock_Suficiente = False Then";
if (true) break;

case 22:
//if
this.state = 29;
if (_stock_suficiente==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=21495861;
 //BA.debugLineNum = 21495861;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21495863;
 //BA.debugLineNum = 21495863;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Producto";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("Producto con stock insuficiente, Stock disponible: "+BA.NumberToString(_stock_disponible)+anywheresoftware.b4a.keywords.Common.CRLF+"¿Desea agregarlo de todas formas?"),BA.ObjectToCharSequence("Validación"),"SI","","NO",parent.mostCurrent._bmp1);
RDebugUtils.currentLine=21495865;
 //BA.debugLineNum = 21495865;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_aceptar_click"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 25;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21495867;
 //BA.debugLineNum = 21495867;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_result!=parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=21495868;
 //BA.debugLineNum = 21495868;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
RDebugUtils.currentLine=21495873;
 //BA.debugLineNum = 21495873;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
RDebugUtils.currentLine=21495877;
 //BA.debugLineNum = 21495877;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row";
parent.mostCurrent._fila.Put((Object)("codfuncionario"),parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=21495878;
 //BA.debugLineNum = 21495878;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Us";
parent.mostCurrent._fila.Put((Object)("codvendedor"),parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=21495881;
 //BA.debugLineNum = 21495881;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.";
parent.mostCurrent._fila.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=21495882;
 //BA.debugLineNum = 21495882;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mo";
parent.mostCurrent._fila.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=21495883;
 //BA.debugLineNum = 21495883;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mo";
parent.mostCurrent._fila.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=21495885;
 //BA.debugLineNum = 21495885;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",parent.mostCurrent._fila,parent.mostCurrent._fila_id);
RDebugUtils.currentLine=21495886;
 //BA.debugLineNum = 21495886;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21495887;
 //BA.debugLineNum = 21495887;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=21495890;
 //BA.debugLineNum = 21495890;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pud";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService..."),BA.ObjectToCharSequence("Error de comunicación"),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=21495891;
 //BA.debugLineNum = 21495891;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=21495895;
 //BA.debugLineNum = 21495895;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("621495895",_js._errormessage /*String*/ ,0);
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=21495900;
 //BA.debugLineNum = 21495900;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_editar_descuento_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_editar_descuento_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_editar_descuento_click", null); return;}
ResumableSub_Btn_Editar_Descuento_Click rsub = new ResumableSub_Btn_Editar_Descuento_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Editar_Descuento_Click extends BA.ResumableSub {
public ResumableSub_Btn_Editar_Descuento_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
boolean _acepta_dscto_marca = false;
double _dscto_max = 0;
int _nrodscto = 0;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Dim Acepta_Dscto_Marca As Boolean = RowProducto.G";
_acepta_dscto_marca = BA.ObjectToBoolean(parent.mostCurrent._rowproducto.Get((Object)("Acepta_Dscto_Marca")));
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Dim Dscto_Max As Double = RowProducto.Get(\"Dscto_";
_dscto_max = (double)(BA.ObjectToNumber(parent.mostCurrent._rowproducto.Get((Object)("Dscto_Marca"))));
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Dim NroDscto As Int";
_nrodscto = 0;
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="If Not(Acepta_Dscto_Marca) Then";
if (true) break;

case 1:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(_acepta_dscto_marca)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"key.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"key.png");
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="Msgbox2Async(\"Para ingresar el descuento necesit";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Para ingresar el descuento necesita una clave de autorización"),BA.ObjectToCharSequence("Validación"),"Ok","Cancelar","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_editar_descuento_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result!=parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=21561360;
 //BA.debugLineNum = 21561360;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_editar_descuento_click"), _fx_insertar_dscto_global_permiso());
this.state = 14;
return;
case 14:
//C
this.state = 8;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21561364;
 //BA.debugLineNum = 21561364;BA.debugLine="Dscto_Max = Result";
_dscto_max = _result;
RDebugUtils.currentLine=21561366;
 //BA.debugLineNum = 21561366;BA.debugLine="If Result = 0 Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_result==0) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=21561367;
 //BA.debugLineNum = 21561367;BA.debugLine="Return";
if (true) return ;
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
RDebugUtils.currentLine=21561372;
 //BA.debugLineNum = 21561372;BA.debugLine="NroDscto = Fila.Get(\"nrodscto\")";
_nrodscto = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("nrodscto"))));
RDebugUtils.currentLine=21561374;
 //BA.debugLineNum = 21561374;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21561375;
 //BA.debugLineNum = 21561375;BA.debugLine="Frm_Post_01_Descuentos.Id_DocEnc =Fila.Get(\"id_do";
parent.mostCurrent._frm_post_01_descuentos._id_docenc /*int*/  = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=21561376;
 //BA.debugLineNum = 21561376;BA.debugLine="Frm_Post_01_Descuentos.Id_DocDet =Id_DocDet";
parent.mostCurrent._frm_post_01_descuentos._id_docdet /*int*/  = parent._id_docdet;
RDebugUtils.currentLine=21561379;
 //BA.debugLineNum = 21561379;BA.debugLine="Frm_Post_01_Descuentos.Dscto_Max = Dscto_Max";
parent.mostCurrent._frm_post_01_descuentos._dscto_max /*int*/  = (int) (_dscto_max);
RDebugUtils.currentLine=21561380;
 //BA.debugLineNum = 21561380;BA.debugLine="Frm_Post_01_Descuentos.Total_Linea_Origen = Total";
parent.mostCurrent._frm_post_01_descuentos._total_linea_origen /*double*/  = parent._total_linea;
RDebugUtils.currentLine=21561381;
 //BA.debugLineNum = 21561381;BA.debugLine="Frm_Post_01_Descuentos.NroDscto = NroDscto";
parent.mostCurrent._frm_post_01_descuentos._nrodscto /*int*/  = _nrodscto;
RDebugUtils.currentLine=21561383;
 //BA.debugLineNum = 21561383;BA.debugLine="Procesar_Dscto = True";
parent._procesar_dscto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21561385;
 //BA.debugLineNum = 21561385;BA.debugLine="StartActivity(Frm_Post_01_Descuentos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_descuentos.getObject()));
RDebugUtils.currentLine=21561387;
 //BA.debugLineNum = 21561387;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_insertar_dscto_global_permiso() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fx_insertar_dscto_global_permiso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "fx_insertar_dscto_global_permiso", null));}
ResumableSub_Fx_Insertar_Dscto_Global_Permiso rsub = new ResumableSub_Fx_Insertar_Dscto_Global_Permiso(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Insertar_Dscto_Global_Permiso extends BA.ResumableSub {
public ResumableSub_Fx_Insertar_Dscto_Global_Permiso(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
boolean _existe = false;
boolean _otorgado = false;
int _descuentoporc = 0;
String _clave = "";
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
int _result = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _filadscto = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=21692426;
 //BA.debugLineNum = 21692426;BA.debugLine="Dim Existe As Boolean";
_existe = false;
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="Dim DescuentoPorc As Int = 0";
_descuentoporc = (int) (0);
RDebugUtils.currentLine=21692430;
 //BA.debugLineNum = 21692430;BA.debugLine="Dim Clave As String";
_clave = "";
RDebugUtils.currentLine=21692432;
 //BA.debugLineNum = 21692432;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=21692434;
 //BA.debugLineNum = 21692434;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=21692435;
 //BA.debugLineNum = 21692435;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
RDebugUtils.currentLine=21692436;
 //BA.debugLineNum = 21692436;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=21692438;
 //BA.debugLineNum = 21692438;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "fx_insertar_dscto_global_permiso"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21692439;
 //BA.debugLineNum = 21692439;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=21692440;
 //BA.debugLineNum = 21692440;BA.debugLine="Clave = InputTemplate.Text";
_clave = _inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=21692442;
 //BA.debugLineNum = 21692442;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=21692445;
 //BA.debugLineNum = 21692445;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21692447;
 //BA.debugLineNum = 21692447;BA.debugLine="If Clave = \"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_clave).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=21692448;
 //BA.debugLineNum = 21692448;BA.debugLine="Msgbox2Async(\"No se ingreso ninguna clave\" , \"Va";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se ingreso ninguna clave"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21692449;
 //BA.debugLineNum = 21692449;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=21692452;
 //BA.debugLineNum = 21692452;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_dscto_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_producto.getObject(),_clave,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU"))),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21692453;
 //BA.debugLineNum = 21692453;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "fx_insertar_dscto_global_permiso"), (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21692455;
 //BA.debugLineNum = 21692455;BA.debugLine="If Js.Success Then";
if (true) break;

case 11:
//if
this.state = 38;
if (_js._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 37;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=21692457;
 //BA.debugLineNum = 21692457;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21692458;
 //BA.debugLineNum = 21692458;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 14:
//if
this.state = 35;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=21692460;
 //BA.debugLineNum = 21692460;BA.debugLine="Dim FilaDscto As Map = Funciones.Fx_DataRow(Js.";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=21692462;
 //BA.debugLineNum = 21692462;BA.debugLine="Existe = FilaDscto.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_filadscto.Get((Object)("Existe")));
RDebugUtils.currentLine=21692463;
 //BA.debugLineNum = 21692463;BA.debugLine="Otorgado = FilaDscto.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_filadscto.Get((Object)("Otorgado")));
RDebugUtils.currentLine=21692464;
 //BA.debugLineNum = 21692464;BA.debugLine="DescuentoPorc = FilaDscto.Get(\"Descuento\")";
_descuentoporc = (int)(BA.ObjectToNumber(_filadscto.Get((Object)("Descuento"))));
RDebugUtils.currentLine=21692466;
 //BA.debugLineNum = 21692466;BA.debugLine="If Existe Then";
if (true) break;

case 17:
//if
this.state = 34;
if (_existe) { 
this.state = 19;
}else {
this.state = 33;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=21692467;
 //BA.debugLineNum = 21692467;BA.debugLine="If Otorgado Then";
if (true) break;

case 20:
//if
this.state = 31;
if (_otorgado) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 31;
RDebugUtils.currentLine=21692468;
 //BA.debugLineNum = 21692468;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este descuento ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21692469;
 //BA.debugLineNum = 21692469;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=21692471;
 //BA.debugLineNum = 21692471;BA.debugLine="If DescuentoPorc <=0 Then";
if (true) break;

case 25:
//if
this.state = 30;
if (_descuentoporc<=0) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=21692472;
 //BA.debugLineNum = 21692472;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede incorporar este descuento, ya que no es un valor valido."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21692474;
 //BA.debugLineNum = 21692474;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=21692476;
 //BA.debugLineNum = 21692476;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=21692477;
 //BA.debugLineNum = 21692477;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento aceptado."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=21692481;
 //BA.debugLineNum = 21692481;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 38;
;
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=21692486;
 //BA.debugLineNum = 21692486;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=21692489;
 //BA.debugLineNum = 21692489;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21692490;
 //BA.debugLineNum = 21692490;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
RDebugUtils.currentLine=21692492;
 //BA.debugLineNum = 21692492;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_editar_precio_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_editar_precio_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_editar_precio_click", null); return;}
ResumableSub_Btn_Editar_Precio_Click rsub = new ResumableSub_Btn_Editar_Precio_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Editar_Precio_Click extends BA.ResumableSub {
public ResumableSub_Btn_Editar_Precio_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
boolean _rst = false;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
int _result = 0;
boolean _result2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_editar_precio_click"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00006"));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="If Not(Rst) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_rst)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=22020112;
 //BA.debugLineNum = 22020112;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
RDebugUtils.currentLine=22020114;
 //BA.debugLineNum = 22020114;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=22020115;
 //BA.debugLineNum = 22020115;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
RDebugUtils.currentLine=22020116;
 //BA.debugLineNum = 22020116;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="InputTemplate.Text = Funciones.CDouble(Lbl_Precio";
_inputtemplate._text /*String*/  = BA.NumberToString(parent.mostCurrent._funciones._cdouble /*double*/ (mostCurrent.activityBA,BA.ObjectToString(parent.mostCurrent._lbl_precio.getTag())));
RDebugUtils.currentLine=22020119;
 //BA.debugLineNum = 22020119;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_editar_precio_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 10;
return;
case 10:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22020121;
 //BA.debugLineNum = 22020121;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=22020123;
 //BA.debugLineNum = 22020123;BA.debugLine="Lbl_Precio.Tag = InputTemplate.Text";
parent.mostCurrent._lbl_precio.setTag((Object)(_inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=22020124;
 //BA.debugLineNum = 22020124;BA.debugLine="Lbl_Precio.Text = \"$ \" & NumberFormat(Lbl_Precio";
parent.mostCurrent._lbl_precio.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=22020125;
 //BA.debugLineNum = 22020125;BA.debugLine="Txt_Cantidad.Tag = 0";
parent.mostCurrent._txt_cantidad.setTag((Object)(0));
RDebugUtils.currentLine=22020126;
 //BA.debugLineNum = 22020126;BA.debugLine="Txt_Cantidad.Text = \"\"";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=22020128;
 //BA.debugLineNum = 22020128;BA.debugLine="Wait For (Sb_Procesar_Datos(\"Cantidad\")) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_editar_precio_click"), _sb_procesar_datos("Cantidad"));
this.state = 11;
return;
case 11:
//C
this.state = 8;
_result2 = (Boolean) result[0];
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=22020132;
 //BA.debugLineNum = 22020132;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_eliminar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_eliminar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_eliminar_click", null); return;}
ResumableSub_Btn_Eliminar_Click rsub = new ResumableSub_Btn_Eliminar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Eliminar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Eliminar_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
Object _sf = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="If ModoConsulta Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._modoconsulta) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="ModoConsulta = False";
parent._modoconsulta = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Doc";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",parent.mostCurrent._fila_id);
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=21233676;
 //BA.debugLineNum = 21233676;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Estas segur";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Estas seguro de eliminar este producto?"),BA.ObjectToCharSequence("E L I M I N A R"),"SI","","NO",parent.mostCurrent._bmp1);
RDebugUtils.currentLine=21233677;
 //BA.debugLineNum = 21233677;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_eliminar_click"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21233679;
 //BA.debugLineNum = 21233679;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=21233681;
 //BA.debugLineNum = 21233681;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Doc";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",parent.mostCurrent._fila_id);
RDebugUtils.currentLine=21233683;
 //BA.debugLineNum = 21233683;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21233685;
 //BA.debugLineNum = 21233685;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=21233686;
 //BA.debugLineNum = 21233686;BA.debugLine="Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,C";
parent.mostCurrent._fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21233688;
 //BA.debugLineNum = 21233688;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (true) break;

case 8:
//if
this.state = 11;
if (parent.mostCurrent._fila_dscto.IsInitialized()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=21233689;
 //BA.debugLineNum = 21233689;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",parent.mostCurrent._fila_dscto);
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=21233692;
 //BA.debugLineNum = 21233692;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
RDebugUtils.currentLine=21233693;
 //BA.debugLineNum = 21233693;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=21233697;
 //BA.debugLineNum = 21233697;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_revisar_stock_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_revisar_stock_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_revisar_stock_click", null); return;}
ResumableSub_Btn_Revisar_Stock_Click rsub = new ResumableSub_Btn_Revisar_Stock_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Revisar_Stock_Click extends BA.ResumableSub {
public ResumableSub_Btn_Revisar_Stock_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
BaKapp.Movil.Tag.mensajes _msj2 = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _tblstockxbodega = null;
BaKapp.Movil.Tag.b4xsearchtemplate _searchtemplatestock = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _vfilastb = null;
String _stock = "";
String _bodega = "";
String _name = "";
int _result = 0;
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="Wait For (Revisar_StockVillar) Complete (Msj2 As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_revisar_stock_click"), _revisar_stockvillar());
this.state = 37;
return;
case 37:
//C
this.state = 4;
_msj2 = (BaKapp.Movil.Tag.mensajes) result[0];
;
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="If Not(Msj2.EsCorrecto) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_msj2._escorrecto /*boolean*/ )) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="Msgbox2Async(Msj.Mensaje, Msj.Detalle, \"Ok\", \"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent._msj._mensaje /*String*/ ),BA.ObjectToCharSequence(parent._msj._detalle /*String*/ ),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21757962;
 //BA.debugLineNum = 21757962;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=21757967;
 //BA.debugLineNum = 21757967;BA.debugLine="Frm_InfoStockXProd.Codigo = Txt_Codigo.Text";
parent.mostCurrent._frm_infostockxprod._codigo /*String*/  = parent.mostCurrent._txt_codigo.getText();
RDebugUtils.currentLine=21757968;
 //BA.debugLineNum = 21757968;BA.debugLine="Frm_InfoStockXProd.Descripcion = Lbl_Descripcion";
parent.mostCurrent._frm_infostockxprod._descripcion /*String*/  = parent.mostCurrent._lbl_descripcion.getText();
RDebugUtils.currentLine=21757969;
 //BA.debugLineNum = 21757969;BA.debugLine="StartActivity(Frm_InfoStockXProd)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_infostockxprod.getObject()));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=21757980;
 //BA.debugLineNum = 21757980;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=21757982;
 //BA.debugLineNum = 21757982;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21757983;
 //BA.debugLineNum = 21757983;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=21757984;
 //BA.debugLineNum = 21757984;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21757986;
 //BA.debugLineNum = 21757986;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
RDebugUtils.currentLine=21757988;
 //BA.debugLineNum = 21757988;BA.debugLine="Consulta_Sql = \"Select Isnull((SELECT TOP 1 KOBO+";
parent.mostCurrent._consulta_sql = "Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA,"+anywheresoftware.b4a.keywords.Common.CRLF+"EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)";
RDebugUtils.currentLine=21757994;
 //BA.debugLineNum = 21757994;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
if (true) break;

case 11:
//if
this.state = 14;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*boolean*/ ) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=21757996;
 //BA.debugLineNum = 21757996;BA.debugLine="Consulta_Sql = \"Select 'ALAMEDA' As BODEGA,STOCK";
parent.mostCurrent._consulta_sql = "Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"Union"+anywheresoftware.b4a.keywords.Common.CRLF+"Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'";
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=21758002;
 //BA.debugLineNum = 21758002;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
RDebugUtils.currentLine=21758003;
 //BA.debugLineNum = 21758003;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_revisar_stock_click"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 15;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21758005;
 //BA.debugLineNum = 21758005;BA.debugLine="If Js.Success Then";
if (true) break;

case 15:
//if
this.state = 36;
if (_js._success /*boolean*/ ) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=21758007;
 //BA.debugLineNum = 21758007;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21758008;
 //BA.debugLineNum = 21758008;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 18:
//if
this.state = 35;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=21758010;
 //BA.debugLineNum = 21758010;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621758010","Traer Stock x bodega",0);
RDebugUtils.currentLine=21758011;
 //BA.debugLineNum = 21758011;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
RDebugUtils.currentLine=21758013;
 //BA.debugLineNum = 21758013;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
RDebugUtils.currentLine=21758014;
 //BA.debugLineNum = 21758014;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=21758016;
 //BA.debugLineNum = 21758016;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21758017;
 //BA.debugLineNum = 21758017;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=21758019;
 //BA.debugLineNum = 21758019;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
if (true) break;

case 21:
//for
this.state = 30;
_vfilastb = new anywheresoftware.b4a.objects.collections.Map();
group33 = _tblstockxbodega;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 30;
if (index33 < groupLen33) {
this.state = 23;
_vfilastb = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group33.Get(index33)));}
if (true) break;

case 40:
//C
this.state = 39;
index33++;
if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=21758021;
 //BA.debugLineNum = 21758021;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
RDebugUtils.currentLine=21758022;
 //BA.debugLineNum = 21758022;BA.debugLine="Dim Bodega As String";
_bodega = "";
RDebugUtils.currentLine=21758024;
 //BA.debugLineNum = 21758024;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STO";
if (true) break;

case 24:
//if
this.state = 29;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*boolean*/ ) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=21758025;
 //BA.debugLineNum = 21758025;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
_bodega = BA.ObjectToString(_vfilastb.Get((Object)("BODEGA")));
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=21758027;
 //BA.debugLineNum = 21758027;BA.debugLine="Bodega = Funciones.Mid(vFilaStb.Get(\"BODEGA\")";
_bodega = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_vfilastb.Get((Object)("BODEGA"))),(int) (1),(int) (15));
 if (true) break;

case 29:
//C
this.state = 40;
;
RDebugUtils.currentLine=21758030;
 //BA.debugLineNum = 21758030;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
_bodega = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_bodega.trim(),(int) (20),".");
RDebugUtils.currentLine=21758032;
 //BA.debugLineNum = 21758032;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
_name = _bodega+" "+_stock;
RDebugUtils.currentLine=21758033;
 //BA.debugLineNum = 21758033;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=21758037;
 //BA.debugLineNum = 21758037;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=21758039;
 //BA.debugLineNum = 21758039;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=21758040;
 //BA.debugLineNum = 21758040;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=21758041;
 //BA.debugLineNum = 21758041;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
RDebugUtils.currentLine=21758043;
 //BA.debugLineNum = 21758043;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_revisar_stock_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 41;
return;
case 41:
//C
this.state = 31;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21758044;
 //BA.debugLineNum = 21758044;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 31:
//if
this.state = 34;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=21758052;
 //BA.debugLineNum = 21758052;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _revisar_stockvillar() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "revisar_stockvillar", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "revisar_stockvillar", null));}
ResumableSub_Revisar_StockVillar rsub = new ResumableSub_Revisar_StockVillar(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Revisar_StockVillar extends BA.ResumableSub {
public ResumableSub_Revisar_StockVillar(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _tblstockxbodega = null;
BaKapp.Movil.Tag.b4xsearchtemplate _searchtemplatestock = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _vfilastb = null;
String _stock = "";
String _bodega = "";
String _name = "";
int _result = 0;
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="Private Msj As Mensajes";
parent._msj = new BaKapp.Movil.Tag.mensajes();
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="Msj.Initialize";
parent._msj._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=21823497;
 //BA.debugLineNum = 21823497;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
RDebugUtils.currentLine=21823499;
 //BA.debugLineNum = 21823499;BA.debugLine="Consulta_Sql = \"Select Isnull((SELECT TOP 1 KOBO+";
parent.mostCurrent._consulta_sql = "Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA,"+anywheresoftware.b4a.keywords.Common.CRLF+"EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)";
RDebugUtils.currentLine=21823505;
 //BA.debugLineNum = 21823505;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
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
RDebugUtils.currentLine=21823507;
 //BA.debugLineNum = 21823507;BA.debugLine="Consulta_Sql = \"Select 'ALAMEDA' As BODEGA,STOCK";
parent.mostCurrent._consulta_sql = "Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"Union"+anywheresoftware.b4a.keywords.Common.CRLF+"Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'";
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21823513;
 //BA.debugLineNum = 21823513;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
RDebugUtils.currentLine=21823514;
 //BA.debugLineNum = 21823514;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "revisar_stockvillar"), (Object)(_js));
this.state = 29;
return;
case 29:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21823516;
 //BA.debugLineNum = 21823516;BA.debugLine="If Js.Success Then";
if (true) break;

case 5:
//if
this.state = 28;
if (_js._success /*boolean*/ ) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=21823518;
 //BA.debugLineNum = 21823518;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21823520;
 //BA.debugLineNum = 21823520;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 8:
//if
this.state = 27;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 27;
RDebugUtils.currentLine=21823522;
 //BA.debugLineNum = 21823522;BA.debugLine="Msj.Detalle = \"Información\"";
parent._msj._detalle /*String*/  = "Información";
RDebugUtils.currentLine=21823523;
 //BA.debugLineNum = 21823523;BA.debugLine="Msj.Mensaje = \"No existe información\"";
parent._msj._mensaje /*String*/  = "No existe información";
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=21823527;
 //BA.debugLineNum = 21823527;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621823527","Traer Stock x bodega",0);
RDebugUtils.currentLine=21823528;
 //BA.debugLineNum = 21823528;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
RDebugUtils.currentLine=21823530;
 //BA.debugLineNum = 21823530;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
RDebugUtils.currentLine=21823531;
 //BA.debugLineNum = 21823531;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=21823533;
 //BA.debugLineNum = 21823533;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21823534;
 //BA.debugLineNum = 21823534;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=21823536;
 //BA.debugLineNum = 21823536;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
if (true) break;

case 13:
//for
this.state = 22;
_vfilastb = new anywheresoftware.b4a.objects.collections.Map();
group25 = _tblstockxbodega;
index25 = 0;
groupLen25 = group25.getSize();
this.state = 30;
if (true) break;

case 30:
//C
this.state = 22;
if (index25 < groupLen25) {
this.state = 15;
_vfilastb = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group25.Get(index25)));}
if (true) break;

case 31:
//C
this.state = 30;
index25++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=21823538;
 //BA.debugLineNum = 21823538;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
RDebugUtils.currentLine=21823539;
 //BA.debugLineNum = 21823539;BA.debugLine="Dim Bodega As String";
_bodega = "";
RDebugUtils.currentLine=21823541;
 //BA.debugLineNum = 21823541;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STO";
if (true) break;

case 16:
//if
this.state = 21;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*boolean*/ ) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=21823542;
 //BA.debugLineNum = 21823542;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
_bodega = BA.ObjectToString(_vfilastb.Get((Object)("BODEGA")));
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=21823544;
 //BA.debugLineNum = 21823544;BA.debugLine="Bodega = Funciones.Mid(vFilaStb.Get(\"BODEGA\")";
_bodega = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_vfilastb.Get((Object)("BODEGA"))),(int) (1),(int) (15));
 if (true) break;

case 21:
//C
this.state = 31;
;
RDebugUtils.currentLine=21823547;
 //BA.debugLineNum = 21823547;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
_bodega = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_bodega.trim(),(int) (20),".");
RDebugUtils.currentLine=21823549;
 //BA.debugLineNum = 21823549;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
_name = _bodega+" "+_stock;
RDebugUtils.currentLine=21823550;
 //BA.debugLineNum = 21823550;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=21823554;
 //BA.debugLineNum = 21823554;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=21823556;
 //BA.debugLineNum = 21823556;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=21823557;
 //BA.debugLineNum = 21823557;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=21823558;
 //BA.debugLineNum = 21823558;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
RDebugUtils.currentLine=21823560;
 //BA.debugLineNum = 21823560;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "revisar_stockvillar"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 32;
return;
case 32:
//C
this.state = 23;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21823561;
 //BA.debugLineNum = 21823561;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=21823562;
 //BA.debugLineNum = 21823562;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=21823569;
 //BA.debugLineNum = 21823569;BA.debugLine="Return Msj";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent._msj));return;};
RDebugUtils.currentLine=21823571;
 //BA.debugLineNum = 21823571;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_ubicacion_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ubicacion_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_ubicacion_click", null); return;}
ResumableSub_Btn_Ubicacion_Click rsub = new ResumableSub_Btn_Ubicacion_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Ubicacion_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ubicacion_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _tblubicxbodega = null;
BaKapp.Movil.Tag.b4xsearchtemplate _searchtemplatestock = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _vfilaub = null;
String _codigo_ubic = "";
String _bodega = "";
String _nokobo = "";
String _name = "";
int _result = 0;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
RDebugUtils.currentLine=21954569;
 //BA.debugLineNum = 21954569;BA.debugLine="Consulta_Sql = \"Select Pubc.Empresa,Pubc.Sucursal";
parent.mostCurrent._consulta_sql = "Select Pubc.Empresa,Pubc.Sucursal,Pubc.Bodega,Pubc.Id_Mapa,Pubc.Codigo_Sector,"+anywheresoftware.b4a.keywords.Common.CRLF+"Pubc.Codigo_Ubic,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull((Select NOKOBO From TABBO Where"+anywheresoftware.b4a.keywords.Common.CRLF+"EMPRESA = Pubc.Empresa And KOSU = Pubc.Sucursal And KOBO = Pubc.Bodega),'') As NOKOBO,"+anywheresoftware.b4a.keywords.Common.CRLF+"Pubc.Codigo,U_mapa.Nombre_Mapa,U_sector.Nombre_Sector,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull(U_bodega.Descripcion_Ubic,'') As Descripcion_Ubic"+anywheresoftware.b4a.keywords.Common.CRLF+"From"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_Prod_Ubicacion As Pubc LEFT OUTER JOIN"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_WMS_Ubicaciones_Bodega As U_bodega ON Pubc.Id_Mapa = U_bodega.Id_Mapa And Pubc.Codigo_Ubic = U_bodega.Codigo_Ubic LEFT OUTER JOIN"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_WMS_Ubicaciones_Mapa_Det As U_sector ON Pubc.Codigo_Sector = U_sector.Codigo_Sector And Pubc.Id_Mapa = U_sector.Id_Mapa LEFT OUTER JOIN"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_WMS_Ubicaciones_Mapa_Enc As U_mapa ON Pubc.Id_Mapa = U_mapa.Id_Mapa"+anywheresoftware.b4a.keywords.Common.CRLF+"Where Pubc.Codigo = '"+parent.mostCurrent._txt_codigo.getText()+"'";
RDebugUtils.currentLine=21954582;
 //BA.debugLineNum = 21954582;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
RDebugUtils.currentLine=21954583;
 //BA.debugLineNum = 21954583;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_ubicacion_click"), (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21954585;
 //BA.debugLineNum = 21954585;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21954587;
 //BA.debugLineNum = 21954587;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21954589;
 //BA.debugLineNum = 21954589;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
RDebugUtils.currentLine=21954592;
 //BA.debugLineNum = 21954592;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
RDebugUtils.currentLine=21954593;
 //BA.debugLineNum = 21954593;BA.debugLine="Msgbox2Async(\"No tiene otras ubicaciones regist";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No tiene otras ubicaciones registradas en el sistema"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21954597;
 //BA.debugLineNum = 21954597;BA.debugLine="Log(\"Traer Ubicación x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621954597","Traer Ubicación x bodega",0);
RDebugUtils.currentLine=21954598;
 //BA.debugLineNum = 21954598;BA.debugLine="Dim TblUbicXbodega As List = Funciones.Fx_DataT";
_tblubicxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblubicxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
RDebugUtils.currentLine=21954600;
 //BA.debugLineNum = 21954600;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
RDebugUtils.currentLine=21954601;
 //BA.debugLineNum = 21954601;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=21954603;
 //BA.debugLineNum = 21954603;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21954604;
 //BA.debugLineNum = 21954604;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=21954606;
 //BA.debugLineNum = 21954606;BA.debugLine="For Each vFilaUb As Map In TblUbicXbodega";
if (true) break;

case 9:
//for
this.state = 12;
_vfilaub = new anywheresoftware.b4a.objects.collections.Map();
group20 = _tblubicxbodega;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 12;
if (index20 < groupLen20) {
this.state = 11;
_vfilaub = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 21:
//C
this.state = 20;
index20++;
if (true) break;

case 11:
//C
this.state = 21;
RDebugUtils.currentLine=21954608;
 //BA.debugLineNum = 21954608;BA.debugLine="Dim Codigo_Ubic As String  = vFilaUb.Get(\"Codi";
_codigo_ubic = BA.ObjectToString(_vfilaub.Get((Object)("Codigo_Ubic")));
RDebugUtils.currentLine=21954609;
 //BA.debugLineNum = 21954609;BA.debugLine="Dim Bodega As String = vFilaUb.Get(\"Bodega\")";
_bodega = BA.ObjectToString(_vfilaub.Get((Object)("Bodega")));
RDebugUtils.currentLine=21954610;
 //BA.debugLineNum = 21954610;BA.debugLine="Dim Nokobo As String = Funciones.Mid(vFilaUb.G";
_nokobo = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_vfilaub.Get((Object)("NOKOBO"))),(int) (1),(int) (15));
RDebugUtils.currentLine=21954612;
 //BA.debugLineNum = 21954612;BA.debugLine="Nokobo = Funciones.Rellenar_Derecha(Nokobo.Tri";
_nokobo = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_nokobo.trim(),(int) (20),".");
RDebugUtils.currentLine=21954614;
 //BA.debugLineNum = 21954614;BA.debugLine="Dim Name As String = Bodega & \" \" & Codigo_Ubi";
_name = _bodega+" "+_codigo_ubic;
RDebugUtils.currentLine=21954615;
 //BA.debugLineNum = 21954615;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=21954619;
 //BA.debugLineNum = 21954619;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=21954621;
 //BA.debugLineNum = 21954621;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=21954622;
 //BA.debugLineNum = 21954622;BA.debugLine="Dialog.Initialize(Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=21954623;
 //BA.debugLineNum = 21954623;BA.debugLine="Dialog.Title = \"Ubicación X Bodega\"";
_dialog._title /*Object*/  = (Object)("Ubicación X Bodega");
RDebugUtils.currentLine=21954625;
 //BA.debugLineNum = 21954625;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "btn_ubicacion_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 22;
return;
case 22:
//C
this.state = 13;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21954626;
 //BA.debugLineNum = 21954626;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = 17;
;
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
RDebugUtils.currentLine=21954635;
 //BA.debugLineNum = 21954635;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _revisar_stock() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "revisar_stock", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "revisar_stock", null));}
ResumableSub_Revisar_Stock rsub = new ResumableSub_Revisar_Stock(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Revisar_Stock extends BA.ResumableSub {
public ResumableSub_Revisar_Stock(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _tblstockxbodega = null;
BaKapp.Movil.Tag.b4xsearchtemplate _searchtemplatestock = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _vfilastb = null;
String _stock = "";
String _bodega = "";
String _name = "";
int _result = 0;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Private Msj As Mensajes";
parent._msj = new BaKapp.Movil.Tag.mensajes();
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="Msj.Initialize";
parent._msj._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=21889033;
 //BA.debugLineNum = 21889033;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
RDebugUtils.currentLine=21889035;
 //BA.debugLineNum = 21889035;BA.debugLine="Consulta_Sql = \"Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO";
parent.mostCurrent._consulta_sql = "Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Tb.NOKOBO As BODEGA,STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent.mostCurrent._txt_codigo.getText()+"'";
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
RDebugUtils.currentLine=21889041;
 //BA.debugLineNum = 21889041;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "revisar_stock"), (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21889043;
 //BA.debugLineNum = 21889043;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21889047;
 //BA.debugLineNum = 21889047;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_vjson).equals(("{\"Table\":[]}"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 19;
RDebugUtils.currentLine=21889049;
 //BA.debugLineNum = 21889049;BA.debugLine="Msj.Detalle = \"Información\"";
parent._msj._detalle /*String*/  = "Información";
RDebugUtils.currentLine=21889050;
 //BA.debugLineNum = 21889050;BA.debugLine="Msj.Mensaje = \"No existe información\"";
parent._msj._mensaje /*String*/  = "No existe información";
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21889054;
 //BA.debugLineNum = 21889054;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("621889054","Traer Stock x bodega",0);
RDebugUtils.currentLine=21889055;
 //BA.debugLineNum = 21889055;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
RDebugUtils.currentLine=21889057;
 //BA.debugLineNum = 21889057;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
RDebugUtils.currentLine=21889058;
 //BA.debugLineNum = 21889058;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=21889060;
 //BA.debugLineNum = 21889060;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21889061;
 //BA.debugLineNum = 21889061;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=21889063;
 //BA.debugLineNum = 21889063;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
if (true) break;

case 9:
//for
this.state = 12;
_vfilastb = new anywheresoftware.b4a.objects.collections.Map();
group22 = _tblstockxbodega;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 12;
if (index22 < groupLen22) {
this.state = 11;
_vfilastb = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));}
if (true) break;

case 23:
//C
this.state = 22;
index22++;
if (true) break;

case 11:
//C
this.state = 23;
RDebugUtils.currentLine=21889065;
 //BA.debugLineNum = 21889065;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
RDebugUtils.currentLine=21889066;
 //BA.debugLineNum = 21889066;BA.debugLine="Dim Bodega As String";
_bodega = "";
RDebugUtils.currentLine=21889069;
 //BA.debugLineNum = 21889069;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
_bodega = BA.ObjectToString(_vfilastb.Get((Object)("BODEGA")));
RDebugUtils.currentLine=21889074;
 //BA.debugLineNum = 21889074;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
_bodega = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_bodega.trim(),(int) (20),".");
RDebugUtils.currentLine=21889076;
 //BA.debugLineNum = 21889076;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
_name = _bodega+" "+_stock;
RDebugUtils.currentLine=21889077;
 //BA.debugLineNum = 21889077;BA.debugLine="Items.Add(vFilaStb)";
_items.Add((Object)(_vfilastb.getObject()));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=21889081;
 //BA.debugLineNum = 21889081;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=21889083;
 //BA.debugLineNum = 21889083;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=21889084;
 //BA.debugLineNum = 21889084;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=21889085;
 //BA.debugLineNum = 21889085;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
RDebugUtils.currentLine=21889087;
 //BA.debugLineNum = 21889087;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "revisar_stock"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 24;
return;
case 24:
//C
this.state = 13;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21889088;
 //BA.debugLineNum = 21889088;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=21889089;
 //BA.debugLineNum = 21889089;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21889090;
 //BA.debugLineNum = 21889090;BA.debugLine="Msj.Resultado = SearchTemplateStock.SelectedIt";
parent._msj._resultado /*String*/  = _searchtemplatestock._selecteditem /*String*/ ;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=21889092;
 //BA.debugLineNum = 21889092;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21889093;
 //BA.debugLineNum = 21889093;BA.debugLine="Msj.Resultado = \"\"";
parent._msj._resultado /*String*/  = "";
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=21889100;
 //BA.debugLineNum = 21889100;BA.debugLine="Return Msj";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent._msj));return;};
RDebugUtils.currentLine=21889102;
 //BA.debugLineNum = 21889102;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_cargar_descuentos() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_cargar_descuentos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_cargar_descuentos", null));}
int _id_docenc = 0;
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
anywheresoftware.b4a.objects.collections.List _idlist = null;
int _rownumber = 0;
String _itemstr = "";
double _kodt = 0;
double _podt = 0;
double _vadt = 0;
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub Sb_Cargar_Descuentos()'(Cargar_Activity As Boo";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=21626891;
 //BA.debugLineNum = 21626891;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="XclvDescuentos.DefaultTextBackgroundColor = Color";
mostCurrent._xclvdescuentos._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="XclvDescuentos.Clear";
mostCurrent._xclvdescuentos._clear();
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=21626895;
 //BA.debugLineNum = 21626895;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=21626897;
 //BA.debugLineNum = 21626897;BA.debugLine="Private IDList As List";
_idlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21626898;
 //BA.debugLineNum = 21626898;BA.debugLine="IDList.Initialize";
_idlist.Initialize();
RDebugUtils.currentLine=21626900;
 //BA.debugLineNum = 21626900;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=21626901;
 //BA.debugLineNum = 21626901;BA.debugLine="Dim ItemStr As String";
_itemstr = "";
RDebugUtils.currentLine=21626903;
 //BA.debugLineNum = 21626903;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original "+"From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc)+" And Id_DocDet = "+BA.NumberToString(_id_docdet))));
RDebugUtils.currentLine=21626906;
 //BA.debugLineNum = 21626906;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
RDebugUtils.currentLine=21626908;
 //BA.debugLineNum = 21626908;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=21626910;
 //BA.debugLineNum = 21626910;BA.debugLine="For Row = 0 To RowNumber - 1";
{
final int step15 = 1;
final int limit15 = (int) (_rownumber-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
RDebugUtils.currentLine=21626912;
 //BA.debugLineNum = 21626912;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=21626913;
 //BA.debugLineNum = 21626913;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
_idlist.Add((Object)(_cursor1.GetString2((int) (0))));
RDebugUtils.currentLine=21626916;
 //BA.debugLineNum = 21626916;BA.debugLine="Dim Kodt As Double = Cursor1.GetString(\"Kodt\")";
_kodt = (double)(Double.parseDouble(_cursor1.GetString("Kodt")));
RDebugUtils.currentLine=21626917;
 //BA.debugLineNum = 21626917;BA.debugLine="Dim Podt As Double = Cursor1.GetString(\"Podt\")";
_podt = (double)(Double.parseDouble(_cursor1.GetString("Podt")));
RDebugUtils.currentLine=21626918;
 //BA.debugLineNum = 21626918;BA.debugLine="Dim Vadt As Double = Cursor1.GetString(\"Vadt\")";
_vadt = (double)(Double.parseDouble(_cursor1.GetString("Vadt")));
RDebugUtils.currentLine=21626932;
 //BA.debugLineNum = 21626932;BA.debugLine="Dim Item As Int = Row+1";
_item = (int) (_row+1);
RDebugUtils.currentLine=21626933;
 //BA.debugLineNum = 21626933;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
_itemstr = mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item),(int) (2),"0");
RDebugUtils.currentLine=21626938;
 //BA.debugLineNum = 21626938;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=21626940;
 //BA.debugLineNum = 21626940;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsVi";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),mostCurrent._xclvdescuentos._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
RDebugUtils.currentLine=21626941;
 //BA.debugLineNum = 21626941;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
_p.LoadLayout("Items_Detalle",mostCurrent.activityBA);
RDebugUtils.currentLine=21626942;
 //BA.debugLineNum = 21626942;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=21626944;
 //BA.debugLineNum = 21626944;BA.debugLine="Lbl_Kodt.Tag = Kodt";
mostCurrent._lbl_kodt.setTag((Object)(_kodt));
RDebugUtils.currentLine=21626945;
 //BA.debugLineNum = 21626945;BA.debugLine="Lbl_Kodt.Text = Kodt";
mostCurrent._lbl_kodt.setText(BA.ObjectToCharSequence(_kodt));
RDebugUtils.currentLine=21626947;
 //BA.debugLineNum = 21626947;BA.debugLine="Lbl_Podt.Tag = Podt";
mostCurrent._lbl_podt.setTag((Object)(_podt));
RDebugUtils.currentLine=21626948;
 //BA.debugLineNum = 21626948;BA.debugLine="Lbl_Podt.Text = Podt";
mostCurrent._lbl_podt.setText(BA.ObjectToCharSequence(_podt));
RDebugUtils.currentLine=21626950;
 //BA.debugLineNum = 21626950;BA.debugLine="Lbl_Vadt.Tag = Vadt";
mostCurrent._lbl_vadt.setTag((Object)(_vadt));
RDebugUtils.currentLine=21626951;
 //BA.debugLineNum = 21626951;BA.debugLine="Lbl_Vadt.Text = Vadt";
mostCurrent._lbl_vadt.setText(BA.ObjectToCharSequence(_vadt));
RDebugUtils.currentLine=21626953;
 //BA.debugLineNum = 21626953;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
mostCurrent._lbl_item.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
RDebugUtils.currentLine=21626962;
 //BA.debugLineNum = 21626962;BA.debugLine="XclvDescuentos.Add(p,\"\")";
mostCurrent._xclvdescuentos._add(_p,(Object)(""));
 }
};
 }else {
RDebugUtils.currentLine=21626967;
 //BA.debugLineNum = 21626967;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21626970;
 //BA.debugLineNum = 21626970;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=21626974;
 //BA.debugLineNum = 21626974;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_insertar_descuentos_en_escala() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_insertar_descuentos_en_escala", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_insertar_descuentos_en_escala", null));}
ResumableSub_Sb_Insertar_Descuentos_En_Escala rsub = new ResumableSub_Sb_Insertar_Descuentos_En_Escala(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Insertar_Descuentos_En_Escala extends BA.ResumableSub {
public ResumableSub_Sb_Insertar_Descuentos_En_Escala(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
int _id_docenc = 0;
int _nrodscto = 0;
double _precio = 0;
double _valor = 0;
double _total_descuento = 0;
double _total_pc = 0;
int _decimales = 0;
String _moneda_det = "";
String _moneda_enc = "";
String _tipo_moneda_enc = "";
double _tipo_cambio_ent = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _filadscto = null;
String _kodt = "";
double _podt = 0;
double _vadt = 0;
int step26;
int limit26;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando productos..."));
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="Dim NroDscto As Int = 0";
_nrodscto = (int) (0);
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="Dim Precio As Double = Lbl_Precio.Tag";
_precio = (double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag()));
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
_valor = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="Dim Total_Descuento As Double";
_total_descuento = 0;
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="Dim Total_Pc As Double";
_total_pc = 0;
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._fila_dscto.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",parent.mostCurrent._fila_dscto);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="Dim Decimales As Int";
_decimales = 0;
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
_moneda_det = "";
RDebugUtils.currentLine=21364764;
 //BA.debugLineNum = 21364764;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
_moneda_enc = "";
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
_tipo_moneda_enc = "";
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
_tipo_cambio_ent = 0;
RDebugUtils.currentLine=21364769;
 //BA.debugLineNum = 21364769;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if (true) break;

case 5:
//if
this.state = 18;
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
this.state = 7;
}else {
this.state = 13;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=21364770;
 //BA.debugLineNum = 21364770;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_tipo_moneda_enc).equals("N") == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=21364771;
 //BA.debugLineNum = 21364771;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 if (true) break;

case 11:
//C
this.state = 18;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=21364774;
 //BA.debugLineNum = 21364774;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_tipo_moneda_enc).equals("N") == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=21364775;
 //BA.debugLineNum = 21364775;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
RDebugUtils.currentLine=21364787;
 //BA.debugLineNum = 21364787;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";

case 18:
//for
this.state = 47;
step26 = 1;
limit26 = (int) (parent.mostCurrent._tbldescuentos.getSize()-1);
_i = (int) (0) ;
this.state = 51;
if (true) break;

case 51:
//C
this.state = 47;
if ((step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26)) this.state = 20;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step26)) ;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=21364789;
 //BA.debugLineNum = 21364789;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._tbldescuentos.Get(_i)));
RDebugUtils.currentLine=21364794;
 //BA.debugLineNum = 21364794;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
_kodt = "D_SIN_TIPO";
RDebugUtils.currentLine=21364795;
 //BA.debugLineNum = 21364795;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
_podt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Dscto"))));
RDebugUtils.currentLine=21364796;
 //BA.debugLineNum = 21364796;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
_vadt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Valor"))));
RDebugUtils.currentLine=21364798;
 //BA.debugLineNum = 21364798;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
if (true) break;

case 21:
//if
this.state = 46;
if (_podt!=0 || _vadt!=0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=21364800;
 //BA.debugLineNum = 21364800;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
if (true) break;

case 24:
//if
this.state = 41;
if (_podt!=0) { 
this.state = 26;
}else {
this.state = 34;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=21364802;
 //BA.debugLineNum = 21364802;BA.debugLine="If Podt > 0 Then";
if (true) break;

case 27:
//if
this.state = 32;
if (_podt>0) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=21364803;
 //BA.debugLineNum = 21364803;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
_vadt = anywheresoftware.b4a.keywords.Common.Round2((_podt/(double)100)*_valor,_decimales);
RDebugUtils.currentLine=21364806;
 //BA.debugLineNum = 21364806;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = anywheresoftware.b4a.keywords.Common.Round2((_vadt/(double)_valor)*100,(int) (5));
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=21364809;
 //BA.debugLineNum = 21364809;BA.debugLine="Vadt = 0";
_vadt = 0;
 if (true) break;

case 32:
//C
this.state = 41;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=21364814;
 //BA.debugLineNum = 21364814;BA.debugLine="If Vadt <> 0 Then";
if (true) break;

case 35:
//if
this.state = 40;
if (_vadt!=0) { 
this.state = 37;
}else {
this.state = 39;
}if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=21364816;
 //BA.debugLineNum = 21364816;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = anywheresoftware.b4a.keywords.Common.Round2((_vadt/(double)_valor)*100,(int) (5));
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=21364819;
 //BA.debugLineNum = 21364819;BA.debugLine="Podt = 0";
_podt = 0;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=21364824;
 //BA.debugLineNum = 21364824;BA.debugLine="Podt = Round2(Podt,Decimales)";
_podt = anywheresoftware.b4a.keywords.Common.Round2(_podt,_decimales);
RDebugUtils.currentLine=21364826;
 //BA.debugLineNum = 21364826;BA.debugLine="If Podt <> 0 Then";
if (true) break;

case 42:
//if
this.state = 45;
if (_podt!=0) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=21364828;
 //BA.debugLineNum = 21364828;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
parent.mostCurrent._consulta_sql = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)";
RDebugUtils.currentLine=21364829;
 //BA.debugLineNum = 21364829;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id_docenc),(Object)(parent._id_docdet),(Object)(""),(Object)(_kodt),(Object)(_podt),(Object)(_vadt),(Object)(_podt)}));
RDebugUtils.currentLine=21364831;
 //BA.debugLineNum = 21364831;BA.debugLine="NroDscto = NroDscto + 1";
_nrodscto = (int) (_nrodscto+1);
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=21364835;
 //BA.debugLineNum = 21364835;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
_total_descuento = _total_descuento+_vadt;
RDebugUtils.currentLine=21364836;
 //BA.debugLineNum = 21364836;BA.debugLine="Valor = Valor - Vadt";
_valor = _valor-_vadt;
 if (true) break;

case 46:
//C
this.state = 52;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=21364842;
 //BA.debugLineNum = 21364842;BA.debugLine="If Total_Descuento <> 0 Then";

case 47:
//if
this.state = 50;
if (_total_descuento!=0) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=21364843;
 //BA.debugLineNum = 21364843;BA.debugLine="Total_Pc = Total_Descuento / Precio";
_total_pc = _total_descuento/(double)_precio;
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=21364858;
 //BA.debugLineNum = 21364858;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
parent.mostCurrent._fila.Put((Object)("descuentovalor"),(Object)(_total_descuento));
RDebugUtils.currentLine=21364859;
 //BA.debugLineNum = 21364859;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
parent.mostCurrent._fila.Put((Object)("nrodscto"),(Object)(_nrodscto));
RDebugUtils.currentLine=21364864;
 //BA.debugLineNum = 21364864;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\")";
_sb_procesar_datos("DescuentoValor");
RDebugUtils.currentLine=21364866;
 //BA.debugLineNum = 21364866;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21364868;
 //BA.debugLineNum = 21364868;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_revisar_descuentos() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_revisar_descuentos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_revisar_descuentos", null));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub Sb_Revisar_Descuentos";
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="TblDescuentos = DBUtils.ExecuteList(Variables.vSq";
mostCurrent._tbldescuentos = mostCurrent._dbutils._executelist /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="End Sub";
return "";
}
public static String  _txt_cantidad_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txt_cantidad_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txt_cantidad_click", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Txt_Cantidad_Click   'if you are in the focus";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Txt_Cantidad.SelectAll";
mostCurrent._txt_cantidad.SelectAll();
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return "";
}
public static void  _txt_cantidad_enterpressed() throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txt_cantidad_enterpressed", false))
	 {Debug.delegate(mostCurrent.activityBA, "txt_cantidad_enterpressed", null); return;}
ResumableSub_Txt_Cantidad_EnterPressed rsub = new ResumableSub_Txt_Cantidad_EnterPressed(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Txt_Cantidad_EnterPressed extends BA.ResumableSub {
public ResumableSub_Txt_Cantidad_EnterPressed(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_producto parent;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="frm_post_01_producto";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Txt_Cantidad.Tag = Txt_Cantidad.Text";
parent.mostCurrent._txt_cantidad.setTag((Object)(parent.mostCurrent._txt_cantidad.getText()));
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="If Txt_Cantidad.Text.Trim = \"\" Then Txt_Cantidad.";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._txt_cantidad.getText().trim()).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.mostCurrent._txt_cantidad.setTag((Object)(0));
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="Wait For (Sb_Procesar_Datos(\"Cantidad\")) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_producto", "txt_cantidad_enterpressed"), _sb_procesar_datos("Cantidad"));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="If Txt_Cantidad.Tag > 0 Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((double)(BA.ObjectToNumber(parent.mostCurrent._txt_cantidad.getTag()))>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=21168136;
 //BA.debugLineNum = 21168136;BA.debugLine="Sb_Insertar_Descuentos_En_Escala";
_sb_insertar_descuentos_en_escala();
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}