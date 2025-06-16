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
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_producto");
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 82;BA.debugLine="Activity.LoadLayout(\"Cp_Post_01_Producto\")";
parent.mostCurrent._activity.LoadLayout("Cp_Post_01_Producto",mostCurrent.activityBA);
 //BA.debugLineNum = 83;BA.debugLine="Msj.Initialize";
parent._msj._initialize /*String*/ (processBA);
 //BA.debugLineNum = 85;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
parent.mostCurrent._funcionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 87;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Variables.Gl_Bo";
parent.mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence("Stock Bod. "+parent.mostCurrent._variables._gl_bodega /*String*/ ));
 //BA.debugLineNum = 88;BA.debugLine="Lbl_ModoConsulta.Visible = ModoConsulta";
parent.mostCurrent._lbl_modoconsulta.setVisible(parent._modoconsulta);
 //BA.debugLineNum = 89;BA.debugLine="Btn_Aceptar.Visible = Not(ModoConsulta)";
parent.mostCurrent._btn_aceptar.setVisible(anywheresoftware.b4a.keywords.Common.Not(parent._modoconsulta));
 //BA.debugLineNum = 91;BA.debugLine="If ModoConsulta Then";
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
 //BA.debugLineNum = 92;BA.debugLine="Btn_Eliminar.Text = \"CERRAR\"";
parent.mostCurrent._btn_eliminar.setText(BA.ObjectToCharSequence("CERRAR"));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 95;BA.debugLine="ChkValores = True 'Valores Netos";
parent._chkvalores = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 97;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 98;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
parent.mostCurrent._fila = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 100;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 101;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
parent.mostCurrent._fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 103;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 104;BA.debugLine="Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 107;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("id_docenc")));
 //BA.debugLineNum = 108;BA.debugLine="Fila_Enc = DBUtils.ExecuteMap(Variables.vSql,Cons";
parent.mostCurrent._fila_enc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 110;BA.debugLine="Txt_Codigo.Text = Fila.Get(\"codigo\")";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("codigo"))));
 //BA.debugLineNum = 111;BA.debugLine="Txt_Cantidad.Tag = Fila.Get(\"cantidad\")";
parent.mostCurrent._txt_cantidad.setTag(parent.mostCurrent._fila.Get((Object)("cantidad")));
 //BA.debugLineNum = 112;BA.debugLine="Lbl_Descripcion.Text = Fila.Get(\"descripcion\")";
parent.mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("descripcion"))));
 //BA.debugLineNum = 113;BA.debugLine="Lbl_Precio.Tag = Fila.Get(\"precio\")";
parent.mostCurrent._lbl_precio.setTag(parent.mostCurrent._fila.Get((Object)("precio")));
 //BA.debugLineNum = 114;BA.debugLine="Lbl_Descuento.Tag = Fila.Get(\"descuentoporc\")";
parent.mostCurrent._lbl_descuento.setTag(parent.mostCurrent._fila.Get((Object)("descuentoporc")));
 //BA.debugLineNum = 116;BA.debugLine="Total_Linea = Fila.Get(\"cantidad\")*Fila.Get(\"prec";
parent._total_linea = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("cantidad"))))*(double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("precio"))));
 //BA.debugLineNum = 118;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 119;BA.debugLine="Lbl_Total.Tag = Fila.Get(\"valnetolinea\")";
parent.mostCurrent._lbl_total.setTag(parent.mostCurrent._fila.Get((Object)("valnetolinea")));
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 121;BA.debugLine="Lbl_Total.Tag = Fila.Get(\"valbrutolinea\")";
parent.mostCurrent._lbl_total.setTag(parent.mostCurrent._fila.Get((Object)("valbrutolinea")));
 if (true) break;
;
 //BA.debugLineNum = 124;BA.debugLine="If Lbl_Total.Tag = Null Then";

case 10:
//if
this.state = 13;
if (parent.mostCurrent._lbl_total.getTag()== null) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 125;BA.debugLine="Lbl_Total.Tag = 0";
parent.mostCurrent._lbl_total.setTag((Object)(0));
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 128;BA.debugLine="Lbl_Ubicacion.Text = Fila.Get(\"ubicacionbod\")";
parent.mostCurrent._lbl_ubicacion.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("ubicacionbod"))));
 //BA.debugLineNum = 130;BA.debugLine="If Txt_Cantidad.Tag > 0 Then";
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
 //BA.debugLineNum = 131;BA.debugLine="Txt_Cantidad.Text = Txt_Cantidad.Tag";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(parent.mostCurrent._txt_cantidad.getTag()));
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 133;BA.debugLine="Txt_Cantidad.Text = \"\"";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 136;BA.debugLine="Lbl_Precio.Text = \"$ \" & NumberFormat(Lbl_Precio.";
parent.mostCurrent._lbl_precio.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 137;BA.debugLine="Lbl_Descuento.Text = NumberFormat(Lbl_Descuento.T";
parent.mostCurrent._lbl_descuento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_descuento.getTag())),(int) (0),(int) (2))+" %"));
 //BA.debugLineNum = 138;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(Lbl_Total.Ta";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 140;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Fila.Get(\"bodeg";
parent.mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence("Stock Bod. "+BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("bodega")))));
 //BA.debugLineNum = 141;BA.debugLine="Lbl_Stock.Text = Fila.Get(\"stockbodega\")";
parent.mostCurrent._lbl_stock.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("stockbodega"))));
 //BA.debugLineNum = 150;BA.debugLine="Dim Kolt As String = Fila.Get(\"codlista\") 'Funcio";
_kolt = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codlista")));
 //BA.debugLineNum = 152;BA.debugLine="For Each Fl As Map In Variables.Global_Listas_Pre";
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
 //BA.debugLineNum = 153;BA.debugLine="Dim Kolt1 As String = Fl.Get(\"Kolt\")";
_kolt1 = BA.ObjectToString(_fl.Get((Object)("Kolt")));
 //BA.debugLineNum = 154;BA.debugLine="Dim Nokolt1 As String = Fl.Get(\"Nokolt\")";
_nokolt1 = BA.ObjectToString(_fl.Get((Object)("Nokolt")));
 //BA.debugLineNum = 155;BA.debugLine="If Kolt = Kolt1 Then";
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
 //BA.debugLineNum = 156;BA.debugLine="Lbl_ListaPrecio.Text = Nokolt1";
parent.mostCurrent._lbl_listaprecio.setText(BA.ObjectToCharSequence(_nokolt1));
 //BA.debugLineNum = 157;BA.debugLine="Exit";
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
 //BA.debugLineNum = 164;BA.debugLine="Consulta_Sql = \"Select Mp.*,Mr.*,Cast(Case When C";
parent.mostCurrent._consulta_sql = "Select Mp.*,Mr.*,Cast(Case When Crz.CodigoTabla Is Null Then 0 Else 1 End As Bit) As Acepta_Dscto_Marca,Isnull(Crz.Porcentaje,0) As Dscto_Marca"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEPR Mp"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join TABMR Mr On Mp.MRPR = Mr.KOMR"+anywheresoftware.b4a.keywords.Common.CRLF+"Left Join "+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Crz On Crz.Tabla = 'DSCTO_MARCA' And Crz.NombreTabla = 'MRPR' And Crz.CodigoTabla = Mp.MRPR"+anywheresoftware.b4a.keywords.Common.CRLF+"Where Mp.KOPR = '"+BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codigo")))+"'";
 //BA.debugLineNum = 170;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
 //BA.debugLineNum = 172;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 49;
return;
case 49:
//C
this.state = 28;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 174;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 176;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 178;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 180;BA.debugLine="RowProducto = Funciones.Fx_DataRow(Js.GetString";
parent.mostCurrent._rowproducto = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
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
 //BA.debugLineNum = 186;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
 //BA.debugLineNum = 188;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_producto.getObject(),parent.mostCurrent._variables._gl_empresa /*String*/ ,parent.mostCurrent._variables._gl_sucursal /*String*/ ,parent.mostCurrent._txt_codigo.getText(),_kolt,anywheresoftware.b4a.keywords.Common.True,"",(double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("poriva")))),(double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("porila")))),"",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 199;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 50;
return;
case 50:
//C
this.state = 36;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 201;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 203;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 205;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 207;BA.debugLine="TblDescuentos = Funciones.Fx_DataTable(vJson)";
parent.mostCurrent._tbldescuentos = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 //BA.debugLineNum = 214;BA.debugLine="If Txt_Cantidad.Text = \"\" Then";

case 43:
//if
this.state = 46;
if ((parent.mostCurrent._txt_cantidad.getText()).equals("")) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 215;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Cantidad)";
parent.mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(parent.mostCurrent._txt_cantidad.getObject()));
 if (true) break;

case 46:
//C
this.state = -1;
;
 //BA.debugLineNum = 218;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
parent.mostCurrent._cl_permisox._initialize /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
 //BA.debugLineNum = 219;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
parent.mostCurrent._cl_permisox._designercreateview /*String*/ ((Object)(parent.mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 222;BA.debugLine="TecladoSoft.HideKeyboard";
parent.mostCurrent._tecladosoft.HideKeyboard(mostCurrent.activityBA);
 //BA.debugLineNum = 224;BA.debugLine="Procesar_Dscto = False";
parent._procesar_dscto = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
int _vsalir = 0;
double _total = 0;
 //BA.debugLineNum = 262;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 264;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
 //BA.debugLineNum = 266;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 268;BA.debugLine="If ModoConsulta Then";
if (_modoconsulta) { 
 //BA.debugLineNum = 269;BA.debugLine="ModoConsulta = False";
_modoconsulta = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 270;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",mostCurrent._fila_id);
 //BA.debugLineNum = 271;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
 //BA.debugLineNum = 272;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 275;BA.debugLine="Dim Total As Double";
_total = 0;
 //BA.debugLineNum = 277;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 278;BA.debugLine="Total = Fila.Get(\"valnetolinea\")";
_total = (double)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("valnetolinea"))));
 }else {
 //BA.debugLineNum = 280;BA.debugLine="Total = Fila.Get(\"valbrutolinea\")";
_total = (double)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("valbrutolinea"))));
 };
 //BA.debugLineNum = 283;BA.debugLine="If 0 = Txt_Cantidad.Tag Then";
if (0==(double)(BA.ObjectToNumber(mostCurrent._txt_cantidad.getTag()))) { 
 //BA.debugLineNum = 285;BA.debugLine="vSalir = Msgbox2(\"Si deja la cantidad en cero e";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Si deja la cantidad en cero el producto no se agregara a la lista"+anywheresoftware.b4a.keywords.Common.CRLF+"¿Estas seguro de salir?"),BA.ObjectToCharSequence("Validaación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 288;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 289;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_D";
mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",mostCurrent._fila_id);
 //BA.debugLineNum = 290;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
 //BA.debugLineNum = 291;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 293;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
 //BA.debugLineNum = 298;BA.debugLine="If Total <> Lbl_Total.Tag Then";
if (_total!=(double)(BA.ObjectToNumber(mostCurrent._lbl_total.getTag()))) { 
 //BA.debugLineNum = 300;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de cerrar sin a";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de cerrar sin aplicar los cambios?"),BA.ObjectToCharSequence("SALIR SIN GRABAR"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 302;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 304;BA.debugLine="If Not(Editar) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_editar)) { 
 //BA.debugLineNum = 305;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_";
mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",mostCurrent._fila_id);
 };
 //BA.debugLineNum = 308;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
 //BA.debugLineNum = 309;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 312;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
 //BA.debugLineNum = 316;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
 //BA.debugLineNum = 317;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 };
 //BA.debugLineNum = 322;BA.debugLine="Id_DocDet = 0";
_id_docdet = (int) (0);
 //BA.debugLineNum = 323;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
anywheresoftware.b4a.objects.collections.Map _filaseleccionada = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 230;BA.debugLine="If Procesar_Dscto Then";
if (_procesar_dscto) { 
 //BA.debugLineNum = 232;BA.debugLine="Fila.Put(\"descuentoporc\",Frm_Post_01_Descuentos.";
mostCurrent._fila.Put((Object)("descuentoporc"),(Object)(mostCurrent._frm_post_01_descuentos._total_pc /*double*/ ));
 //BA.debugLineNum = 235;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\")";
_sb_procesar_datos("DescuentoPorc");
 //BA.debugLineNum = 236;BA.debugLine="Procesar_Dscto = False";
_procesar_dscto = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 239;BA.debugLine="If Frm_InfoStockXProd.Msj.EsCorrecto Then";
if (mostCurrent._frm_infostockxprod._msj /*BaKapp.Movil.Tag.mensajes*/ ._escorrecto /*boolean*/ ) { 
 //BA.debugLineNum = 241;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 243;BA.debugLine="Dim FilaSeleccionada As Map = Frm_InfoStockXProd";
_filaseleccionada = new anywheresoftware.b4a.objects.collections.Map();
_filaseleccionada = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(mostCurrent._frm_infostockxprod._msj /*BaKapp.Movil.Tag.mensajes*/ ._tag /*Object*/ ));
 //BA.debugLineNum = 245;BA.debugLine="Fila.Put(\"sucursal\",FilaSeleccionada.Get(\"KOSU\")";
mostCurrent._fila.Put((Object)("sucursal"),_filaseleccionada.Get((Object)("KOSU")));
 //BA.debugLineNum = 246;BA.debugLine="Fila.Put(\"bodega\",FilaSeleccionada.Get(\"KOBO\"))";
mostCurrent._fila.Put((Object)("bodega"),_filaseleccionada.Get((Object)("KOBO")));
 //BA.debugLineNum = 248;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Fila.Get(\"bode";
mostCurrent._lbl_bodega.setText(BA.ObjectToCharSequence("Stock Bod. "+BA.ObjectToString(mostCurrent._fila.Get((Object)("bodega")))));
 //BA.debugLineNum = 249;BA.debugLine="Lbl_Stock.Text = FilaSeleccionada.Get(\"STFI1\")";
mostCurrent._lbl_stock.setText(BA.ObjectToCharSequence(_filaseleccionada.Get((Object)("STFI1"))));
 };
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public static void  _btn_aceptar_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1192;BA.debugLine="If 0 = Txt_Cantidad.Tag  Then";
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
 //BA.debugLineNum = 1194;BA.debugLine="Msgbox2Async(\"No puede agregar un producto con c";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No puede agregar un producto con cantidad cero"),BA.ObjectToCharSequence("Validación"),"Ok","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1195;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 37;
return;
case 37:
//C
this.state = 36;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1196;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 1200;BA.debugLine="Dim Codigo As String = Fila.Get(\"codigo\")";
_codigo = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codigo")));
 //BA.debugLineNum = 1201;BA.debugLine="Dim Tido As String = \"NVV\"";
_tido = "NVV";
 //BA.debugLineNum = 1202;BA.debugLine="Dim Empresa As String = Fila.Get(\"empresa\")";
_empresa = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("empresa")));
 //BA.debugLineNum = 1203;BA.debugLine="Dim Sucursal As String = Fila.Get(\"sucursal\")";
_sucursal = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("sucursal")));
 //BA.debugLineNum = 1204;BA.debugLine="Dim Bodega As String = Fila.Get(\"bodega\")";
_bodega = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("bodega")));
 //BA.debugLineNum = 1205;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("cantidad"))));
 //BA.debugLineNum = 1206;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("untrans"))));
 //BA.debugLineNum = 1207;BA.debugLine="Dim Tidopa As String = Fila.Get(\"tidopa\")";
_tidopa = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tidopa")));
 //BA.debugLineNum = 1209;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Re";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_revisar_stock_fila /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_producto.getObject(),_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa);
 //BA.debugLineNum = 1211;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 6;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1213;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1215;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1217;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1219;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 1220;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
_filastk = new anywheresoftware.b4a.objects.collections.Map();
_filastk = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 1222;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"";
_stock_disponible = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Disponible"))));
 //BA.debugLineNum = 1223;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stoc";
_stock_fisico = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Fisico"))));
 //BA.debugLineNum = 1224;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible &";
anywheresoftware.b4a.keywords.Common.LogImpl("524641570","Stock disponible: "+BA.NumberToString(_stock_disponible)+", Stock fisico: "+BA.NumberToString(_stock_fisico),0);
 //BA.debugLineNum = 1226;BA.debugLine="Dim Stock_Suficiente As Boolean";
_stock_suficiente = false;
 //BA.debugLineNum = 1228;BA.debugLine="If Stock_Disponible <= 0 Then";
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
 //BA.debugLineNum = 1229;BA.debugLine="Stock_Suficiente = False";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 1231;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
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
 //BA.debugLineNum = 1232;BA.debugLine="Stock_Suficiente = True";
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
 //BA.debugLineNum = 1236;BA.debugLine="Fila.Put(\"stockbodega\",Stock_Disponible)";
parent.mostCurrent._fila.Put((Object)("stockbodega"),(Object)(_stock_disponible));
 //BA.debugLineNum = 1237;BA.debugLine="Lbl_Stock.Text = Fila.Get(\"stockbodega\")";
parent.mostCurrent._lbl_stock.setText(BA.ObjectToCharSequence(parent.mostCurrent._fila.Get((Object)("stockbodega"))));
 //BA.debugLineNum = 1239;BA.debugLine="If Stock_Suficiente = False Then";
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
 //BA.debugLineNum = 1243;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1245;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Producto";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("Producto con stock insuficiente, Stock disponible: "+BA.NumberToString(_stock_disponible)+anywheresoftware.b4a.keywords.Common.CRLF+"¿Desea agregarlo de todas formas?"),BA.ObjectToCharSequence("Validación"),"SI","","NO",parent.mostCurrent._bmp1);
 //BA.debugLineNum = 1247;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 39;
return;
case 39:
//C
this.state = 25;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1249;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1250;BA.debugLine="Return";
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
 //BA.debugLineNum = 1255;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
 //BA.debugLineNum = 1259;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row";
parent.mostCurrent._fila.Put((Object)("codfuncionario"),parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 1260;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Us";
parent.mostCurrent._fila.Put((Object)("codvendedor"),parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 1263;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.";
parent.mostCurrent._fila.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 1264;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mo";
parent.mostCurrent._fila.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 1265;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mo";
parent.mostCurrent._fila.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 1267;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",parent.mostCurrent._fila,parent.mostCurrent._fila_id);
 //BA.debugLineNum = 1268;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1269;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 1272;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pud";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService..."),BA.ObjectToCharSequence("Error de comunicación"),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 1273;BA.debugLine="Return";
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
 //BA.debugLineNum = 1277;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("524641623",_js._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 1282;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static void  _btn_editar_descuento_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1286;BA.debugLine="Dim Acepta_Dscto_Marca As Boolean = RowProducto.G";
_acepta_dscto_marca = BA.ObjectToBoolean(parent.mostCurrent._rowproducto.Get((Object)("Acepta_Dscto_Marca")));
 //BA.debugLineNum = 1287;BA.debugLine="Dim Dscto_Max As Double = RowProducto.Get(\"Dscto_";
_dscto_max = (double)(BA.ObjectToNumber(parent.mostCurrent._rowproducto.Get((Object)("Dscto_Marca"))));
 //BA.debugLineNum = 1288;BA.debugLine="Dim NroDscto As Int";
_nrodscto = 0;
 //BA.debugLineNum = 1290;BA.debugLine="If Not(Acepta_Dscto_Marca) Then";
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
 //BA.debugLineNum = 1294;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"key.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"key.png");
 //BA.debugLineNum = 1296;BA.debugLine="Msgbox2Async(\"Para ingresar el descuento necesit";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Para ingresar el descuento necesita una clave de autorización"),BA.ObjectToCharSequence("Validación"),"Ok","Cancelar","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1297;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1299;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1300;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 1303;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_insertar_dscto_global_permiso());
this.state = 14;
return;
case 14:
//C
this.state = 8;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1304;BA.debugLine="Dscto_Max = Result";
_dscto_max = _result;
 //BA.debugLineNum = 1306;BA.debugLine="If Result = 0 Then";
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
 //BA.debugLineNum = 1307;BA.debugLine="Return";
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
 //BA.debugLineNum = 1312;BA.debugLine="NroDscto = Fila.Get(\"nrodscto\")";
_nrodscto = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("nrodscto"))));
 //BA.debugLineNum = 1314;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 1315;BA.debugLine="Frm_Post_01_Descuentos.Id_DocEnc =Fila.Get(\"id_do";
parent.mostCurrent._frm_post_01_descuentos._id_docenc /*int*/  = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 1316;BA.debugLine="Frm_Post_01_Descuentos.Id_DocDet =Id_DocDet";
parent.mostCurrent._frm_post_01_descuentos._id_docdet /*int*/  = parent._id_docdet;
 //BA.debugLineNum = 1319;BA.debugLine="Frm_Post_01_Descuentos.Dscto_Max = Dscto_Max";
parent.mostCurrent._frm_post_01_descuentos._dscto_max /*int*/  = (int) (_dscto_max);
 //BA.debugLineNum = 1320;BA.debugLine="Frm_Post_01_Descuentos.Total_Linea_Origen = Total";
parent.mostCurrent._frm_post_01_descuentos._total_linea_origen /*double*/  = parent._total_linea;
 //BA.debugLineNum = 1321;BA.debugLine="Frm_Post_01_Descuentos.NroDscto = NroDscto";
parent.mostCurrent._frm_post_01_descuentos._nrodscto /*int*/  = _nrodscto;
 //BA.debugLineNum = 1323;BA.debugLine="Procesar_Dscto = True";
parent._procesar_dscto = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1325;BA.debugLine="StartActivity(Frm_Post_01_Descuentos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_descuentos.getObject()));
 //BA.debugLineNum = 1327;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(int _result) throws Exception{
}
public static void  _btn_editar_precio_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1850;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Bkp00006"));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 1852;BA.debugLine="If Not(Rst) Then";
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
 //BA.debugLineNum = 1853;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1856;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1857;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1858;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 1861;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 1862;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 1864;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 1866;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 1867;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
 //BA.debugLineNum = 1868;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
_inputtemplate._configurefornumbers /*String*/ (anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1869;BA.debugLine="InputTemplate.Text = Funciones.CDouble(Lbl_Precio";
_inputtemplate._text /*String*/  = BA.NumberToString(parent.mostCurrent._funciones._cdouble /*double*/ (mostCurrent.activityBA,BA.ObjectToString(parent.mostCurrent._lbl_precio.getTag())));
 //BA.debugLineNum = 1871;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 10;
return;
case 10:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1873;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1875;BA.debugLine="Lbl_Precio.Tag = InputTemplate.Text";
parent.mostCurrent._lbl_precio.setTag((Object)(_inputtemplate._text /*String*/ ));
 //BA.debugLineNum = 1876;BA.debugLine="Lbl_Precio.Text = \"$ \" & NumberFormat(Lbl_Precio";
parent.mostCurrent._lbl_precio.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1877;BA.debugLine="Txt_Cantidad.Tag = 0";
parent.mostCurrent._txt_cantidad.setTag((Object)(0));
 //BA.debugLineNum = 1878;BA.debugLine="Txt_Cantidad.Text = \"\"";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1880;BA.debugLine="Wait For (Sb_Procesar_Datos(\"Cantidad\")) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_procesar_datos("Cantidad"));
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
 //BA.debugLineNum = 1884;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_eliminar_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 346;BA.debugLine="If ModoConsulta Then";
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
 //BA.debugLineNum = 347;BA.debugLine="ModoConsulta = False";
parent._modoconsulta = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 348;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Doc";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",parent.mostCurrent._fila_id);
 //BA.debugLineNum = 349;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
 //BA.debugLineNum = 350;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 //BA.debugLineNum = 351;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 354;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 356;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Estas segur";
_sf = parent.mostCurrent._xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Estas seguro de eliminar este producto?"),BA.ObjectToCharSequence("E L I M I N A R"),"SI","","NO",parent.mostCurrent._bmp1);
 //BA.debugLineNum = 357;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 359;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 361;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Doc";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",parent.mostCurrent._fila_id);
 //BA.debugLineNum = 363;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 365;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 366;BA.debugLine="Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,C";
parent.mostCurrent._fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 368;BA.debugLine="If Fila_Dscto.IsInitialized Then";
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
 //BA.debugLineNum = 369;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",parent.mostCurrent._fila_dscto);
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 372;BA.debugLine="Id_DocDet = 0";
parent._id_docdet = (int) (0);
 //BA.debugLineNum = 373;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_revisar_stock_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1508;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
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
 //BA.debugLineNum = 1510;BA.debugLine="Wait For (Revisar_StockVillar) Complete (Msj2 As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _revisar_stockvillar());
this.state = 37;
return;
case 37:
//C
this.state = 4;
_msj2 = (BaKapp.Movil.Tag.mensajes) result[0];
;
 //BA.debugLineNum = 1511;BA.debugLine="If Not(Msj2.EsCorrecto) Then";
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
 //BA.debugLineNum = 1512;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1513;BA.debugLine="Msgbox2Async(Msj.Mensaje, Msj.Detalle, \"Ok\", \"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent._msj._mensaje /*String*/ ),BA.ObjectToCharSequence(parent._msj._detalle /*String*/ ),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1514;BA.debugLine="Return";
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
 //BA.debugLineNum = 1519;BA.debugLine="Frm_InfoStockXProd.Codigo = Txt_Codigo.Text";
parent.mostCurrent._frm_infostockxprod._codigo /*String*/  = parent.mostCurrent._txt_codigo.getText();
 //BA.debugLineNum = 1520;BA.debugLine="Frm_InfoStockXProd.Descripcion = Lbl_Descripcion";
parent.mostCurrent._frm_infostockxprod._descripcion /*String*/  = parent.mostCurrent._lbl_descripcion.getText();
 //BA.debugLineNum = 1521;BA.debugLine="StartActivity(Frm_InfoStockXProd)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_infostockxprod.getObject()));
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1532;BA.debugLine="Return";
if (true) return ;
 //BA.debugLineNum = 1534;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1535;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 1536;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1538;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 1540;BA.debugLine="Consulta_Sql = \"Select Isnull((SELECT TOP 1 KOBO+";
parent.mostCurrent._consulta_sql = "Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA,"+anywheresoftware.b4a.keywords.Common.CRLF+"EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)";
 //BA.debugLineNum = 1546;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
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
 //BA.debugLineNum = 1548;BA.debugLine="Consulta_Sql = \"Select 'ALAMEDA' As BODEGA,STOCK";
parent.mostCurrent._consulta_sql = "Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"Union"+anywheresoftware.b4a.keywords.Common.CRLF+"Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'";
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 1554;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
 //BA.debugLineNum = 1555;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 15;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1557;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1559;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1560;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1562;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("524903738","Traer Stock x bodega",0);
 //BA.debugLineNum = 1563;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 //BA.debugLineNum = 1565;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 1566;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 1568;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1569;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 1571;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
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
 //BA.debugLineNum = 1573;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
 //BA.debugLineNum = 1574;BA.debugLine="Dim Bodega As String";
_bodega = "";
 //BA.debugLineNum = 1576;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STO";
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
 //BA.debugLineNum = 1577;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
_bodega = BA.ObjectToString(_vfilastb.Get((Object)("BODEGA")));
 if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 1579;BA.debugLine="Bodega = Funciones.Mid(vFilaStb.Get(\"BODEGA\")";
_bodega = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_vfilastb.Get((Object)("BODEGA"))),(int) (1),(int) (15));
 if (true) break;

case 29:
//C
this.state = 40;
;
 //BA.debugLineNum = 1582;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
_bodega = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_bodega.trim(),(int) (20),".");
 //BA.debugLineNum = 1584;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
_name = _bodega+" "+_stock;
 //BA.debugLineNum = 1585;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 1589;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (_items);
 //BA.debugLineNum = 1591;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 1592;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 1593;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
 //BA.debugLineNum = 1595;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 41;
return;
case 41:
//C
this.state = 31;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1596;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1604;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_ubicacion_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1774;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1775;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 1776;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1778;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 1780;BA.debugLine="Consulta_Sql = \"Select Pubc.Empresa,Pubc.Sucursal";
parent.mostCurrent._consulta_sql = "Select Pubc.Empresa,Pubc.Sucursal,Pubc.Bodega,Pubc.Id_Mapa,Pubc.Codigo_Sector,"+anywheresoftware.b4a.keywords.Common.CRLF+"Pubc.Codigo_Ubic,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull((Select NOKOBO From TABBO Where"+anywheresoftware.b4a.keywords.Common.CRLF+"EMPRESA = Pubc.Empresa And KOSU = Pubc.Sucursal And KOBO = Pubc.Bodega),'') As NOKOBO,"+anywheresoftware.b4a.keywords.Common.CRLF+"Pubc.Codigo,U_mapa.Nombre_Mapa,U_sector.Nombre_Sector,"+anywheresoftware.b4a.keywords.Common.CRLF+"Isnull(U_bodega.Descripcion_Ubic,'') As Descripcion_Ubic"+anywheresoftware.b4a.keywords.Common.CRLF+"From"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_Prod_Ubicacion As Pubc LEFT OUTER JOIN"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_WMS_Ubicaciones_Bodega As U_bodega ON Pubc.Id_Mapa = U_bodega.Id_Mapa And Pubc.Codigo_Ubic = U_bodega.Codigo_Ubic LEFT OUTER JOIN"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_WMS_Ubicaciones_Mapa_Det As U_sector ON Pubc.Codigo_Sector = U_sector.Codigo_Sector And Pubc.Id_Mapa = U_sector.Id_Mapa LEFT OUTER JOIN"+anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._variables._global_basebk /*String*/ +"Zw_WMS_Ubicaciones_Mapa_Enc As U_mapa ON Pubc.Id_Mapa = U_mapa.Id_Mapa"+anywheresoftware.b4a.keywords.Common.CRLF+"Where Pubc.Codigo = '"+parent.mostCurrent._txt_codigo.getText()+"'";
 //BA.debugLineNum = 1793;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
 //BA.debugLineNum = 1794;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1796;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1798;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1800;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1803;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"emoticon-sad.png");
 //BA.debugLineNum = 1804;BA.debugLine="Msgbox2Async(\"No tiene otras ubicaciones regist";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No tiene otras ubicaciones registradas en el sistema"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 1808;BA.debugLine="Log(\"Traer Ubicación x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("525100325","Traer Ubicación x bodega",0);
 //BA.debugLineNum = 1809;BA.debugLine="Dim TblUbicXbodega As List = Funciones.Fx_DataT";
_tblubicxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblubicxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 //BA.debugLineNum = 1811;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 1812;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 1814;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1815;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 1817;BA.debugLine="For Each vFilaUb As Map In TblUbicXbodega";
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
 //BA.debugLineNum = 1819;BA.debugLine="Dim Codigo_Ubic As String  = vFilaUb.Get(\"Codi";
_codigo_ubic = BA.ObjectToString(_vfilaub.Get((Object)("Codigo_Ubic")));
 //BA.debugLineNum = 1820;BA.debugLine="Dim Bodega As String = vFilaUb.Get(\"Bodega\")";
_bodega = BA.ObjectToString(_vfilaub.Get((Object)("Bodega")));
 //BA.debugLineNum = 1821;BA.debugLine="Dim Nokobo As String = Funciones.Mid(vFilaUb.G";
_nokobo = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_vfilaub.Get((Object)("NOKOBO"))),(int) (1),(int) (15));
 //BA.debugLineNum = 1823;BA.debugLine="Nokobo = Funciones.Rellenar_Derecha(Nokobo.Tri";
_nokobo = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_nokobo.trim(),(int) (20),".");
 //BA.debugLineNum = 1825;BA.debugLine="Dim Name As String = Bodega & \" \" & Codigo_Ubi";
_name = _bodega+" "+_codigo_ubic;
 //BA.debugLineNum = 1826;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1830;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (_items);
 //BA.debugLineNum = 1832;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 1833;BA.debugLine="Dialog.Initialize(Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 1834;BA.debugLine="Dialog.Title = \"Ubicación X Bodega\"";
_dialog._title /*Object*/  = (Object)("Ubicación X Bodega");
 //BA.debugLineNum = 1836;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 22;
return;
case 22:
//C
this.state = 13;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1837;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1846;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_insertar_dscto_global_permiso() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1428;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1429;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1430;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 1431;BA.debugLine="Dim bmp1 As Bitmap";
parent.mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 1433;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 1434;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 1436;BA.debugLine="Dim Existe As Boolean";
_existe = false;
 //BA.debugLineNum = 1437;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
 //BA.debugLineNum = 1438;BA.debugLine="Dim DescuentoPorc As Int = 0";
_descuentoporc = (int) (0);
 //BA.debugLineNum = 1440;BA.debugLine="Dim Clave As String";
_clave = "";
 //BA.debugLineNum = 1442;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 1444;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 1445;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
_inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
 //BA.debugLineNum = 1446;BA.debugLine="InputTemplate.Text = \"\"";
_inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 1448;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1449;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1450;BA.debugLine="Clave = InputTemplate.Text";
_clave = _inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 1452;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1455;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1457;BA.debugLine="If Clave = \"\" Then";
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
 //BA.debugLineNum = 1458;BA.debugLine="Msgbox2Async(\"No se ingreso ninguna clave\" , \"Va";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se ingreso ninguna clave"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1459;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1462;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_dscto_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_producto.getObject(),_clave,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU"))),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1463;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1465;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1467;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1468;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1470;BA.debugLine="Dim FilaDscto As Map = Funciones.Fx_DataRow(Js.";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 1472;BA.debugLine="Existe = FilaDscto.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_filadscto.Get((Object)("Existe")));
 //BA.debugLineNum = 1473;BA.debugLine="Otorgado = FilaDscto.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_filadscto.Get((Object)("Otorgado")));
 //BA.debugLineNum = 1474;BA.debugLine="DescuentoPorc = FilaDscto.Get(\"Descuento\")";
_descuentoporc = (int)(BA.ObjectToNumber(_filadscto.Get((Object)("Descuento"))));
 //BA.debugLineNum = 1476;BA.debugLine="If Existe Then";
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
 //BA.debugLineNum = 1477;BA.debugLine="If Otorgado Then";
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
 //BA.debugLineNum = 1478;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este descuento ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1479;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 1481;BA.debugLine="If DescuentoPorc <=0 Then";
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
 //BA.debugLineNum = 1482;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede incorporar este descuento, ya que no es un valor valido."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1484;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 1486;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 1487;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
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
 //BA.debugLineNum = 1491;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
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
 //BA.debugLineNum = 1496;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 38:
//C
this.state = -1;
;
 //BA.debugLineNum = 1499;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 1500;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 //BA.debugLineNum = 1502;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim Consulta_Sql As String";
mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 23;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 25;BA.debugLine="Private Txt_Codigo As EditText";
mostCurrent._txt_codigo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Lbl_Descripcion As Label";
mostCurrent._lbl_descripcion = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Lbl_Ubicacion As Label";
mostCurrent._lbl_ubicacion = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Lbl_Stock As Label";
mostCurrent._lbl_stock = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Txt_Cantidad As EditText";
mostCurrent._txt_cantidad = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Lbl_Precio As Label";
mostCurrent._lbl_precio = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Lbl_Descuento As Label";
mostCurrent._lbl_descuento = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Lbl_Total As Label";
mostCurrent._lbl_total = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim Fila_Enc As Map";
mostCurrent._fila_enc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 35;BA.debugLine="Dim Fila As Map";
mostCurrent._fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Dim Fila_Id As Map";
mostCurrent._fila_id = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 37;BA.debugLine="Dim Fila_Dscto As Map";
mostCurrent._fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 38;BA.debugLine="Dim RowProducto As Map";
mostCurrent._rowproducto = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 39;BA.debugLine="Dim TblDescuentos As List";
mostCurrent._tbldescuentos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 41;BA.debugLine="Dim Procesar_Dscto As Boolean";
_procesar_dscto = false;
 //BA.debugLineNum = 43;BA.debugLine="Private Btn_Aceptar As Button";
mostCurrent._btn_aceptar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Btn_Eliminar As Button";
mostCurrent._btn_eliminar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Dim TecladoSoft As IME ' biblioteca IME";
mostCurrent._tecladosoft = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 48;BA.debugLine="Dim TotalNetoDoc As Double";
_totalnetodoc = 0;
 //BA.debugLineNum = 49;BA.debugLine="Dim TotalBrutoDoc As Double";
_totalbrutodoc = 0;
 //BA.debugLineNum = 50;BA.debugLine="Dim Total_Linea As Double";
_total_linea = 0;
 //BA.debugLineNum = 52;BA.debugLine="Dim ChkValores As Boolean";
_chkvalores = false;
 //BA.debugLineNum = 54;BA.debugLine="Dim FUNCIONARIO As String";
mostCurrent._funcionario = "";
 //BA.debugLineNum = 56;BA.debugLine="Private XclvDescuentos As CustomListView";
mostCurrent._xclvdescuentos = new b4a.example3.customlistview();
 //BA.debugLineNum = 57;BA.debugLine="Private Lbl_Kodt As B4XView";
mostCurrent._lbl_kodt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private Lbl_Item As B4XView";
mostCurrent._lbl_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private Lbl_Podt As B4XView";
mostCurrent._lbl_podt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private Lbl_Vadt As B4XView";
mostCurrent._lbl_vadt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private Btn_Editar_Descuento As Button";
mostCurrent._btn_editar_descuento = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private Btn_Revisar_Stock As Button";
mostCurrent._btn_revisar_stock = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private Btn_Ubicacion As Button";
mostCurrent._btn_ubicacion = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private Lbl_ModoConsulta As Label";
mostCurrent._lbl_modoconsulta = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private Lbl_Bodega As Label";
mostCurrent._lbl_bodega = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private Lbl_ListaPrecio As Label";
mostCurrent._lbl_listaprecio = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private Btn_Editar_Precio As Button";
mostCurrent._btn_editar_precio = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
mostCurrent._cl_permisox = new BaKapp.Movil.Tag.cl_permisoxui();
 //BA.debugLineNum = 73;BA.debugLine="Dim bmp1 As Bitmap";
mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Id_DocDet As Int";
_id_docdet = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public Editar As Boolean";
_editar = false;
 //BA.debugLineNum = 12;BA.debugLine="Public ModoConsulta As Boolean";
_modoconsulta = false;
 //BA.debugLineNum = 13;BA.debugLine="Public Msj As Mensajes";
_msj = new BaKapp.Movil.Tag.mensajes();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _revisar_stock() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1693;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1694;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 1695;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1696;BA.debugLine="Private Msj As Mensajes";
parent._msj = new BaKapp.Movil.Tag.mensajes();
 //BA.debugLineNum = 1698;BA.debugLine="Msj.Initialize";
parent._msj._initialize /*String*/ (processBA);
 //BA.debugLineNum = 1700;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 1702;BA.debugLine="Consulta_Sql = \"Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO";
parent.mostCurrent._consulta_sql = "Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Tb.NOKOBO As BODEGA,STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent.mostCurrent._txt_codigo.getText()+"'";
 //BA.debugLineNum = 1707;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
 //BA.debugLineNum = 1708;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1710;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1712;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1714;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1716;BA.debugLine="Msj.Detalle = \"Información\"";
parent._msj._detalle /*String*/  = "Información";
 //BA.debugLineNum = 1717;BA.debugLine="Msj.Mensaje = \"No existe información\"";
parent._msj._mensaje /*String*/  = "No existe información";
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 1721;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("525034782","Traer Stock x bodega",0);
 //BA.debugLineNum = 1722;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 //BA.debugLineNum = 1724;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 1725;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 1727;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1728;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 1730;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
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
 //BA.debugLineNum = 1732;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
 //BA.debugLineNum = 1733;BA.debugLine="Dim Bodega As String";
_bodega = "";
 //BA.debugLineNum = 1736;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
_bodega = BA.ObjectToString(_vfilastb.Get((Object)("BODEGA")));
 //BA.debugLineNum = 1741;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
_bodega = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_bodega.trim(),(int) (20),".");
 //BA.debugLineNum = 1743;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
_name = _bodega+" "+_stock;
 //BA.debugLineNum = 1744;BA.debugLine="Items.Add(vFilaStb)";
_items.Add((Object)(_vfilastb.getObject()));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1748;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (_items);
 //BA.debugLineNum = 1750;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 1751;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 1752;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
 //BA.debugLineNum = 1754;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 24;
return;
case 24:
//C
this.state = 13;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1755;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1756;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1757;BA.debugLine="Msj.Resultado = SearchTemplateStock.SelectedIt";
parent._msj._resultado /*String*/  = _searchtemplatestock._selecteditem /*String*/ ;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 1759;BA.debugLine="Msj.EsCorrecto = True";
parent._msj._escorrecto /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1760;BA.debugLine="Msj.Resultado = \"\"";
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
 //BA.debugLineNum = 1767;BA.debugLine="Return Msj";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent._msj));return;};
 //BA.debugLineNum = 1769;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _revisar_stockvillar() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1608;BA.debugLine="Private xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1609;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 1610;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1611;BA.debugLine="Private Msj As Mensajes";
parent._msj = new BaKapp.Movil.Tag.mensajes();
 //BA.debugLineNum = 1613;BA.debugLine="Msj.Initialize";
parent._msj._initialize /*String*/ (processBA);
 //BA.debugLineNum = 1615;BA.debugLine="Dim Consulta_Sql As String";
parent.mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 1617;BA.debugLine="Consulta_Sql = \"Select Isnull((SELECT TOP 1 KOBO+";
parent.mostCurrent._consulta_sql = "Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA,"+anywheresoftware.b4a.keywords.Common.CRLF+"EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1"+anywheresoftware.b4a.keywords.Common.CRLF+"From MAEST Ms"+anywheresoftware.b4a.keywords.Common.CRLF+"Where KOPR = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)";
 //BA.debugLineNum = 1623;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
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
 //BA.debugLineNum = 1625;BA.debugLine="Consulta_Sql = \"Select 'ALAMEDA' As BODEGA,STOCK";
parent.mostCurrent._consulta_sql = "Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'"+anywheresoftware.b4a.keywords.Common.CRLF+"Union"+anywheresoftware.b4a.keywords.Common.CRLF+"Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"+parent.mostCurrent._txt_codigo.getText()+"'";
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1631;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._consulta_sql,frm_post_01_producto.getObject());
 //BA.debugLineNum = 1632;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 29;
return;
case 29:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1634;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1636;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1638;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1640;BA.debugLine="Msj.Detalle = \"Información\"";
parent._msj._detalle /*String*/  = "Información";
 //BA.debugLineNum = 1641;BA.debugLine="Msj.Mensaje = \"No existe información\"";
parent._msj._mensaje /*String*/  = "No existe información";
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 1645;BA.debugLine="Log(\"Traer Stock x bodega\")";
anywheresoftware.b4a.keywords.Common.LogImpl("524969255","Traer Stock x bodega",0);
 //BA.debugLineNum = 1646;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
_tblstockxbodega = new anywheresoftware.b4a.objects.collections.List();
_tblstockxbodega = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_vjson);
 //BA.debugLineNum = 1648;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
_searchtemplatestock = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 1649;BA.debugLine="SearchTemplateStock.Initialize";
_searchtemplatestock._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 1651;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1652;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 1654;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
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
 //BA.debugLineNum = 1656;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
_stock = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_vfilastb.Get((Object)("STFI1")))),(int) (0),(int) (2));
 //BA.debugLineNum = 1657;BA.debugLine="Dim Bodega As String";
_bodega = "";
 //BA.debugLineNum = 1659;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STO";
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
 //BA.debugLineNum = 1660;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
_bodega = BA.ObjectToString(_vfilastb.Get((Object)("BODEGA")));
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 1662;BA.debugLine="Bodega = Funciones.Mid(vFilaStb.Get(\"BODEGA\")";
_bodega = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_vfilastb.Get((Object)("BODEGA"))),(int) (1),(int) (15));
 if (true) break;

case 21:
//C
this.state = 31;
;
 //BA.debugLineNum = 1665;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
_bodega = parent.mostCurrent._funciones._rellenar_derecha /*String*/ (mostCurrent.activityBA,_bodega.trim(),(int) (20),".");
 //BA.debugLineNum = 1667;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
_name = _bodega+" "+_stock;
 //BA.debugLineNum = 1668;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 1672;BA.debugLine="SearchTemplateStock.SetItems(Items)";
_searchtemplatestock._setitems /*Object*/ (_items);
 //BA.debugLineNum = 1674;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 1675;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 1676;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
_dialog._title /*Object*/  = (Object)("Stock X Bodega");
 //BA.debugLineNum = 1678;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_searchtemplatestock),(Object)(""),(Object)(""),(Object)("CERRAR")));
this.state = 32;
return;
case 32:
//C
this.state = 23;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1679;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1680;BA.debugLine="Msj.EsCorrecto = True";
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
 //BA.debugLineNum = 1687;BA.debugLine="Return Msj";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent._msj));return;};
 //BA.debugLineNum = 1689;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_cargar_descuentos() throws Exception{
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
 //BA.debugLineNum = 1329;BA.debugLine="Sub Sb_Cargar_Descuentos()'(Cargar_Activity As Boo";
 //BA.debugLineNum = 1331;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 1332;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(mostCurrent._fila.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 1340;BA.debugLine="Dim xui As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1341;BA.debugLine="XclvDescuentos.DefaultTextBackgroundColor = Color";
mostCurrent._xclvdescuentos._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
 //BA.debugLineNum = 1342;BA.debugLine="XclvDescuentos.Clear";
mostCurrent._xclvdescuentos._clear();
 //BA.debugLineNum = 1343;BA.debugLine="Private Row As Int";
_row = 0;
 //BA.debugLineNum = 1344;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 1346;BA.debugLine="Private IDList As List";
_idlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1347;BA.debugLine="IDList.Initialize";
_idlist.Initialize();
 //BA.debugLineNum = 1349;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
 //BA.debugLineNum = 1350;BA.debugLine="Dim ItemStr As String";
_itemstr = "";
 //BA.debugLineNum = 1352;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original "+"From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc)+" And Id_DocDet = "+BA.NumberToString(_id_docdet))));
 //BA.debugLineNum = 1355;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
 //BA.debugLineNum = 1357;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
 //BA.debugLineNum = 1359;BA.debugLine="For Row = 0 To RowNumber - 1";
{
final int step15 = 1;
final int limit15 = (int) (_rownumber-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
 //BA.debugLineNum = 1361;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
 //BA.debugLineNum = 1362;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
_idlist.Add((Object)(_cursor1.GetString2((int) (0))));
 //BA.debugLineNum = 1365;BA.debugLine="Dim Kodt As Double = Cursor1.GetString(\"Kodt\")";
_kodt = (double)(Double.parseDouble(_cursor1.GetString("Kodt")));
 //BA.debugLineNum = 1366;BA.debugLine="Dim Podt As Double = Cursor1.GetString(\"Podt\")";
_podt = (double)(Double.parseDouble(_cursor1.GetString("Podt")));
 //BA.debugLineNum = 1367;BA.debugLine="Dim Vadt As Double = Cursor1.GetString(\"Vadt\")";
_vadt = (double)(Double.parseDouble(_cursor1.GetString("Vadt")));
 //BA.debugLineNum = 1381;BA.debugLine="Dim Item As Int = Row+1";
_item = (int) (_row+1);
 //BA.debugLineNum = 1382;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
_itemstr = mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item),(int) (2),"0");
 //BA.debugLineNum = 1387;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 1389;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsVi";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),mostCurrent._xclvdescuentos._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
 //BA.debugLineNum = 1390;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
_p.LoadLayout("Items_Detalle",mostCurrent.activityBA);
 //BA.debugLineNum = 1391;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 1393;BA.debugLine="Lbl_Kodt.Tag = Kodt";
mostCurrent._lbl_kodt.setTag((Object)(_kodt));
 //BA.debugLineNum = 1394;BA.debugLine="Lbl_Kodt.Text = Kodt";
mostCurrent._lbl_kodt.setText(BA.ObjectToCharSequence(_kodt));
 //BA.debugLineNum = 1396;BA.debugLine="Lbl_Podt.Tag = Podt";
mostCurrent._lbl_podt.setTag((Object)(_podt));
 //BA.debugLineNum = 1397;BA.debugLine="Lbl_Podt.Text = Podt";
mostCurrent._lbl_podt.setText(BA.ObjectToCharSequence(_podt));
 //BA.debugLineNum = 1399;BA.debugLine="Lbl_Vadt.Tag = Vadt";
mostCurrent._lbl_vadt.setTag((Object)(_vadt));
 //BA.debugLineNum = 1400;BA.debugLine="Lbl_Vadt.Text = Vadt";
mostCurrent._lbl_vadt.setText(BA.ObjectToCharSequence(_vadt));
 //BA.debugLineNum = 1402;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
mostCurrent._lbl_item.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
 //BA.debugLineNum = 1411;BA.debugLine="XclvDescuentos.Add(p,\"\")";
mostCurrent._xclvdescuentos._add(_p,(Object)(""));
 }
};
 }else {
 //BA.debugLineNum = 1416;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 1419;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 1423;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_insertar_descuentos_en_escala() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1051;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando productos..."));
 //BA.debugLineNum = 1053;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 1054;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 1056;BA.debugLine="Dim NroDscto As Int = 0";
_nrodscto = (int) (0);
 //BA.debugLineNum = 1057;BA.debugLine="Dim Precio As Double = Lbl_Precio.Tag";
_precio = (double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag()));
 //BA.debugLineNum = 1065;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
_valor = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("valnetolinea"))));
 //BA.debugLineNum = 1067;BA.debugLine="Dim Total_Descuento As Double";
_total_descuento = 0;
 //BA.debugLineNum = 1068;BA.debugLine="Dim Total_Pc As Double";
_total_pc = 0;
 //BA.debugLineNum = 1070;BA.debugLine="If Fila_Dscto.IsInitialized Then";
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
 //BA.debugLineNum = 1071;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",parent.mostCurrent._fila_dscto);
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1074;BA.debugLine="Dim Decimales As Int";
_decimales = 0;
 //BA.debugLineNum = 1076;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
_moneda_det = "";
 //BA.debugLineNum = 1077;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
_moneda_enc = "";
 //BA.debugLineNum = 1079;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
_tipo_moneda_enc = "";
 //BA.debugLineNum = 1080;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
_tipo_cambio_ent = 0;
 //BA.debugLineNum = 1082;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
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
 //BA.debugLineNum = 1083;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
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
 //BA.debugLineNum = 1084;BA.debugLine="Decimales = 2";
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
 //BA.debugLineNum = 1087;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
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
 //BA.debugLineNum = 1088;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
 //BA.debugLineNum = 1100;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";

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
 //BA.debugLineNum = 1102;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._tbldescuentos.Get(_i)));
 //BA.debugLineNum = 1107;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
_kodt = "D_SIN_TIPO";
 //BA.debugLineNum = 1108;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
_podt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Dscto"))));
 //BA.debugLineNum = 1109;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
_vadt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Valor"))));
 //BA.debugLineNum = 1111;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
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
 //BA.debugLineNum = 1113;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
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
 //BA.debugLineNum = 1115;BA.debugLine="If Podt > 0 Then";
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
 //BA.debugLineNum = 1116;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
_vadt = anywheresoftware.b4a.keywords.Common.Round2((_podt/(double)100)*_valor,_decimales);
 //BA.debugLineNum = 1119;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = anywheresoftware.b4a.keywords.Common.Round2((_vadt/(double)_valor)*100,(int) (5));
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 1122;BA.debugLine="Vadt = 0";
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
 //BA.debugLineNum = 1127;BA.debugLine="If Vadt <> 0 Then";
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
 //BA.debugLineNum = 1129;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = anywheresoftware.b4a.keywords.Common.Round2((_vadt/(double)_valor)*100,(int) (5));
 if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 1132;BA.debugLine="Podt = 0";
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
 //BA.debugLineNum = 1137;BA.debugLine="Podt = Round2(Podt,Decimales)";
_podt = anywheresoftware.b4a.keywords.Common.Round2(_podt,_decimales);
 //BA.debugLineNum = 1139;BA.debugLine="If Podt <> 0 Then";
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
 //BA.debugLineNum = 1141;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
parent.mostCurrent._consulta_sql = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)";
 //BA.debugLineNum = 1142;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id_docenc),(Object)(parent._id_docdet),(Object)(""),(Object)(_kodt),(Object)(_podt),(Object)(_vadt),(Object)(_podt)}));
 //BA.debugLineNum = 1144;BA.debugLine="NroDscto = NroDscto + 1";
_nrodscto = (int) (_nrodscto+1);
 if (true) break;

case 45:
//C
this.state = 46;
;
 //BA.debugLineNum = 1148;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
_total_descuento = _total_descuento+_vadt;
 //BA.debugLineNum = 1149;BA.debugLine="Valor = Valor - Vadt";
_valor = _valor-_vadt;
 if (true) break;

case 46:
//C
this.state = 52;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1155;BA.debugLine="If Total_Descuento <> 0 Then";

case 47:
//if
this.state = 50;
if (_total_descuento!=0) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 1156;BA.debugLine="Total_Pc = Total_Descuento / Precio";
_total_pc = _total_descuento/(double)_precio;
 if (true) break;

case 50:
//C
this.state = -1;
;
 //BA.debugLineNum = 1171;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
parent.mostCurrent._fila.Put((Object)("descuentovalor"),(Object)(_total_descuento));
 //BA.debugLineNum = 1172;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
parent.mostCurrent._fila.Put((Object)("nrodscto"),(Object)(_nrodscto));
 //BA.debugLineNum = 1177;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\")";
_sb_procesar_datos("DescuentoValor");
 //BA.debugLineNum = 1179;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 1181;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_procesar_datos(String _cabeza) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 381;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("untrans"))));
 //BA.debugLineNum = 382;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("poriva"))));
 //BA.debugLineNum = 383;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("porila"))));
 //BA.debugLineNum = 384;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("rtu"))));
 //BA.debugLineNum = 386;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
 //BA.debugLineNum = 388;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
 //BA.debugLineNum = 389;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
 //BA.debugLineNum = 390;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
 //BA.debugLineNum = 391;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
 //BA.debugLineNum = 393;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
 //BA.debugLineNum = 394;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
 //BA.debugLineNum = 396;BA.debugLine="Dim Precio As Double = Lbl_Precio.Tag";
_precio = (double)(BA.ObjectToNumber(parent.mostCurrent._lbl_precio.getTag()));
 //BA.debugLineNum = 398;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
 //BA.debugLineNum = 399;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
 //BA.debugLineNum = 401;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
 //BA.debugLineNum = 402;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
 //BA.debugLineNum = 404;BA.debugLine="Dim Total As Double";
_total = 0;
 //BA.debugLineNum = 406;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
 //BA.debugLineNum = 408;BA.debugLine="Dim Cantidad As Double = Txt_Cantidad.Tag";
_cantidad = (double)(BA.ObjectToNumber(parent.mostCurrent._txt_cantidad.getTag()));
 //BA.debugLineNum = 409;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
 //BA.debugLineNum = 410;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
 //BA.debugLineNum = 412;BA.debugLine="Dim Divisible As String = RowProducto.Get(\"DIVISI";
_divisible = BA.ObjectToString(parent.mostCurrent._rowproducto.Get((Object)("DIVISIBLE")));
 //BA.debugLineNum = 413;BA.debugLine="Dim Divisible2 As String = RowProducto.Get(\"DIVIS";
_divisible2 = BA.ObjectToString(parent.mostCurrent._rowproducto.Get((Object)("DIVISIBLE2")));
 //BA.debugLineNum = 415;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentovalor"))));
 //BA.debugLineNum = 416;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentoporc"))));
 //BA.debugLineNum = 417;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentoporc"))));
 //BA.debugLineNum = 418;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descmaximo"))));
 //BA.debugLineNum = 420;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tict")));
 //BA.debugLineNum = 421;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("prct")));
 //BA.debugLineNum = 422;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tipr")));
 //BA.debugLineNum = 424;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codlista")));
 //BA.debugLineNum = 426;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
 //BA.debugLineNum = 428;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
 //BA.debugLineNum = 429;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
 //BA.debugLineNum = 431;BA.debugLine="If No_Aplica_Redondeo Then";
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
 //BA.debugLineNum = 432;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 435;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
 //BA.debugLineNum = 436;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
 //BA.debugLineNum = 438;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
 //BA.debugLineNum = 439;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
 //BA.debugLineNum = 445;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("descuentovalor_anterior"))));
 //BA.debugLineNum = 446;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
 //BA.debugLineNum = 448;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
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
 //BA.debugLineNum = 455;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
 //BA.debugLineNum = 457;BA.debugLine="Dim Moneda_Enc As String = Fila_Enc.Get(\"moneda_d";
_moneda_enc = BA.ObjectToString(parent.mostCurrent._fila_enc.Get((Object)("moneda_doc")));
 //BA.debugLineNum = 458;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Enc.Get(\"tip";
_tipo_moneda_enc = BA.ObjectToString(parent.mostCurrent._fila_enc.Get((Object)("tipomoneda")));
 //BA.debugLineNum = 459;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Enc.Get(\"tas";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(parent.mostCurrent._fila_enc.Get((Object)("tasadorig_doc"))));
 //BA.debugLineNum = 461;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("moneda")));
 //BA.debugLineNum = 462;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("tipo_moneda")));
 //BA.debugLineNum = 463;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("tipo_cambio"))));
 //BA.debugLineNum = 465;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
 //BA.debugLineNum = 467;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
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
 //BA.debugLineNum = 468;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
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
 //BA.debugLineNum = 469;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio*_tipo_cambio_ent,(int) (2));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 471;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
 //BA.debugLineNum = 472;BA.debugLine="Decimales = 2";
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
 //BA.debugLineNum = 475;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
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
 //BA.debugLineNum = 476;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 if (true) break;

case 23:
//C
this.state = 24;
;
 //BA.debugLineNum = 478;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 if (true) break;

case 24:
//C
this.state = 25;
;
 //BA.debugLineNum = 481;BA.debugLine="TecladoSoft.HideKeyboard";
parent.mostCurrent._tecladosoft.HideKeyboard(mostCurrent.activityBA);
 //BA.debugLineNum = 483;BA.debugLine="Dim Divi As String";
_divi = "";
 //BA.debugLineNum = 485;BA.debugLine="If UnTrans = 1 Then";
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
 //BA.debugLineNum = 486;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 if (true) break;
;
 //BA.debugLineNum = 489;BA.debugLine="If UnTrans = 2 Then";

case 28:
//if
this.state = 31;
if (_untrans==2) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 490;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 if (true) break;
;
 //BA.debugLineNum = 493;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";

case 31:
//if
this.state = 34;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._funciones._fx_solo_enteros /*boolean*/ (mostCurrent.activityBA,_cantidad,_divi))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 495;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("El producto solo permite cantidades enteras"),BA.ObjectToCharSequence("Validación"),"Ok","","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 496;BA.debugLine="Cantidad = 0";
_cantidad = 0;
 //BA.debugLineNum = 497;BA.debugLine="Txt_Cantidad.Tag = 0";
parent.mostCurrent._txt_cantidad.setTag((Object)(0));
 //BA.debugLineNum = 498;BA.debugLine="Txt_Cantidad.Text = \"\"";
parent.mostCurrent._txt_cantidad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 499;BA.debugLine="Txt_Cantidad.SelectAll";
parent.mostCurrent._txt_cantidad.SelectAll();
 //BA.debugLineNum = 500;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Cantidad)";
parent.mostCurrent._tecladosoft.ShowKeyboard((android.view.View)(parent.mostCurrent._txt_cantidad.getObject()));
 //BA.debugLineNum = 501;BA.debugLine="Return";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;};
 if (true) break;
;
 //BA.debugLineNum = 505;BA.debugLine="If UnTrans = 1 Then";

case 34:
//if
this.state = 43;
if (_untrans==1) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 506;BA.debugLine="If Rtu = 1 Then";
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
 //BA.debugLineNum = 507;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
 //BA.debugLineNum = 508;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 510;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
 //BA.debugLineNum = 511;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 //BA.debugLineNum = 515;BA.debugLine="If UnTrans = 2 Then";

case 43:
//if
this.state = 52;
if (_untrans==2) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 516;BA.debugLine="If Rtu > 1 Then";
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
 //BA.debugLineNum = 517;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
 //BA.debugLineNum = 518;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 520;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
 //BA.debugLineNum = 521;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
 //BA.debugLineNum = 525;BA.debugLine="If Prct = 1 Then";

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
 //BA.debugLineNum = 535;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
_totalneto_calculo = parent._totalnetodoc;
 //BA.debugLineNum = 536;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
_totalbruto_calculo = parent._totalbrutodoc;
 //BA.debugLineNum = 538;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 55:
//if
this.state = 101;
if ((_tict).equals("D")) { 
this.state = 57;
}else if((_tict).equals("R")) { 
this.state = 77;
}if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 540;BA.debugLine="Descontar = True";
_descontar = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 541;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
 //BA.debugLineNum = 541;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
 //BA.debugLineNum = 541;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
 //BA.debugLineNum = 542;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
 //BA.debugLineNum = 544;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if (true) break;

case 58:
//if
this.state = 75;
if ((_cabeza).equals("DescuentoPorc")) { 
this.state = 60;
}else if((_cabeza).equals("DescuentoValor")) { 
this.state = 68;
}if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 546;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 547;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 549;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 551;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 553;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
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
 //BA.debugLineNum = 558;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 560;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 73:
//C
this.state = 74;
 //BA.debugLineNum = 563;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
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
 //BA.debugLineNum = 570;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("valnetolinea"))));
 //BA.debugLineNum = 571;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("recargovalor"))));
 //BA.debugLineNum = 573;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 574;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 if (true) break;

case 82:
//C
this.state = 83;
 //BA.debugLineNum = 576;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_total_concepto/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 577;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 if (true) break;
;
 //BA.debugLineNum = 580;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";

case 83:
//if
this.state = 100;
if ((_cabeza).equals("DescuentoPorc")) { 
this.state = 85;
}else if((_cabeza).equals("ValNetoLinea")) { 
this.state = 93;
}if (true) break;

case 85:
//C
this.state = 86;
 //BA.debugLineNum = 582;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
 //BA.debugLineNum = 583;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
 //BA.debugLineNum = 585;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
 //BA.debugLineNum = 587;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 589;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 590;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = anywheresoftware.b4a.keywords.Common.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 592;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
 //BA.debugLineNum = 593;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 if (true) break;

case 90:
//C
this.state = 91;
 //BA.debugLineNum = 597;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 599;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
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
 //BA.debugLineNum = 605;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
 //BA.debugLineNum = 606;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
 //BA.debugLineNum = 608;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 610;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 if (true) break;

case 98:
//C
this.state = 99;
 //BA.debugLineNum = 613;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 if (true) break;

case 99:
//C
this.state = 100;
;
 //BA.debugLineNum = 616;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 if (true) break;

case 100:
//C
this.state = 101;
;
 //BA.debugLineNum = 620;BA.debugLine="DescuentoValor = 0";
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
 //BA.debugLineNum = 636;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 637;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 if (true) break;

case 108:
//C
this.state = 109;
 //BA.debugLineNum = 639;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio_calculado/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 640;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 if (true) break;

case 109:
//C
this.state = 110;
;
 //BA.debugLineNum = 643;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_precioneto*_cantidad,(int) (3));
 //BA.debugLineNum = 644;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
 //BA.debugLineNum = 646;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
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
 //BA.debugLineNum = 648;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 //BA.debugLineNum = 649;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 if (true) break;

case 113:
//C
this.state = 114;
;
 //BA.debugLineNum = 661;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
 //BA.debugLineNum = 662;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
 //BA.debugLineNum = 666;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if (true) break;

case 114:
//if
this.state = 135;
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
this.state = 116;
}else if((_cabeza).equals("DescuentoValor")) { 
this.state = 128;
}if (true) break;

case 116:
//C
this.state = 117;
 //BA.debugLineNum = 668;BA.debugLine="If Precio > 0 Then";
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
 //BA.debugLineNum = 670;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 672;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 674;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 124:
//C
this.state = 125;
 //BA.debugLineNum = 678;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 680;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
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
 //BA.debugLineNum = 688;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 690;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 if (true) break;

case 133:
//C
this.state = 134;
 //BA.debugLineNum = 693;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
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
 //BA.debugLineNum = 701;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
parent.mostCurrent._fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
 //BA.debugLineNum = 702;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
parent.mostCurrent._fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
 //BA.debugLineNum = 703;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
parent.mostCurrent._fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
 //BA.debugLineNum = 705;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
parent.mostCurrent._fila.Put((Object)("DsctoRealPorc"),(Object)(0));
 //BA.debugLineNum = 706;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
parent.mostCurrent._fila.Put((Object)("DsctoRealValor"),(Object)(0));
 //BA.debugLineNum = 716;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
 //BA.debugLineNum = 718;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
 //BA.debugLineNum = 719;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
 //BA.debugLineNum = 720;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
 //BA.debugLineNum = 722;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
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
 //BA.debugLineNum = 724;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
 //BA.debugLineNum = 726;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 727;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("precionetoudlista")))),(int) (0));
 if (true) break;

case 144:
//C
this.state = 145;
 //BA.debugLineNum = 729;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 if (true) break;

case 145:
//C
this.state = 146;
;
 //BA.debugLineNum = 735;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
 //BA.debugLineNum = 736;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
 //BA.debugLineNum = 737;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = anywheresoftware.b4a.keywords.Common.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
 //BA.debugLineNum = 739;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
 //BA.debugLineNum = 741;BA.debugLine="If Valor_Dscto_Real > 0 Then";
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
 //BA.debugLineNum = 742;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = anywheresoftware.b4a.keywords.Common.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 if (true) break;

case 149:
//C
this.state = 150;
;
 //BA.debugLineNum = 749;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(parent.mostCurrent._fila.Get((Object)("codfunautoriza")));
 //BA.debugLineNum = 751;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
 //BA.debugLineNum = 752;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
 //BA.debugLineNum = 754;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
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
 //BA.debugLineNum = 756;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
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
 //BA.debugLineNum = 758;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
 //BA.debugLineNum = 760;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
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
 //BA.debugLineNum = 762;BA.debugLine="If Dscto_Real > DescMaximo Then";
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
 //BA.debugLineNum = 764;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 766;BA.debugLine="If Vizado Then";
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
 //BA.debugLineNum = 767;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 172:
//C
this.state = 173;
 //BA.debugLineNum = 772;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
 //BA.debugLineNum = 773;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
 //BA.debugLineNum = 781;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
 //BA.debugLineNum = 783;BA.debugLine="If Precio <> PrecioLista Then";
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
 //BA.debugLineNum = 784;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = anywheresoftware.b4a.keywords.Common.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 if (true) break;
;
 //BA.debugLineNum = 787;BA.debugLine="If Dscto_Real > Valor_Dscto Then";

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
 //BA.debugLineNum = 789;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
 //BA.debugLineNum = 792;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 180:
//C
this.state = 181;
 //BA.debugLineNum = 795;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
_codfunautoriza_dscto = parent.mostCurrent._funcionario;
 //BA.debugLineNum = 797;BA.debugLine="ValVtaDescMax =True";
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
 //BA.debugLineNum = 819;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
 //BA.debugLineNum = 825;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";

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
 //BA.debugLineNum = 826;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 if (true) break;

case 191:
//C
this.state = 192;
 //BA.debugLineNum = 828;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 if (true) break;
;
 //BA.debugLineNum = 833;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";

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
 //BA.debugLineNum = 835;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 836;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 837;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 838;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
 //BA.debugLineNum = 839;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
 //BA.debugLineNum = 841;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 //BA.debugLineNum = 843;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
 //BA.debugLineNum = 844;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, 0)";
_preciobruto = anywheresoftware.b4a.keywords.Common.Round2(_precio*_impuestos,(int) (0));
 //BA.debugLineNum = 846;BA.debugLine="If Tict = \"D\" Then";
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
 //BA.debugLineNum = 847;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 if (true) break;
;
 //BA.debugLineNum = 850;BA.debugLine="If Tict = \"R\" Then";

case 198:
//if
this.state = 201;
if ((_tict).equals("R")) { 
this.state = 200;
}if (true) break;

case 200:
//C
this.state = 201;
 //BA.debugLineNum = 852;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
 //BA.debugLineNum = 853;BA.debugLine="TotalDsctoNeto = 0";
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
 //BA.debugLineNum = 859;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
 //BA.debugLineNum = 860;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 861;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 862;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
 //BA.debugLineNum = 863;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 //BA.debugLineNum = 865;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
 //BA.debugLineNum = 866;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 868;BA.debugLine="If Tict = \"R\" Then";
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
 //BA.debugLineNum = 870;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
 //BA.debugLineNum = 871;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 if (true) break;

case 207:
//C
this.state = 208;
;
 if (true) break;
;
 //BA.debugLineNum = 878;BA.debugLine="If Descontar Then";

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
 //BA.debugLineNum = 880;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
 //BA.debugLineNum = 881;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 //BA.debugLineNum = 883;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
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
 //BA.debugLineNum = 884;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 //BA.debugLineNum = 885;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 886;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 887;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
 //BA.debugLineNum = 888;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
 //BA.debugLineNum = 889;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 if (true) break;

case 215:
//C
this.state = 216;
 //BA.debugLineNum = 891;BA.debugLine="TotalBruto = DescuentoValor";
_totalbruto = _descuentovalor;
 //BA.debugLineNum = 892;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
 //BA.debugLineNum = 893;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 894;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 895;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
 //BA.debugLineNum = 896;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 if (true) break;
;
 //BA.debugLineNum = 899;BA.debugLine="If TotalNeto > 0 Then";

case 216:
//if
this.state = 219;
if (_totalneto>0) { 
this.state = 218;
}if (true) break;

case 218:
//C
this.state = 219;
 //BA.debugLineNum = 901;BA.debugLine="TotalIla = TotalIla * -1";
_totalila = _totalila*-1;
 //BA.debugLineNum = 902;BA.debugLine="TotalIva = TotalIva * -1";
_totaliva = _totaliva*-1;
 //BA.debugLineNum = 903;BA.debugLine="TotalNeto = TotalNeto * -1";
_totalneto = _totalneto*-1;
 //BA.debugLineNum = 904;BA.debugLine="TotalBruto = TotalBruto * -1";
_totalbruto = _totalbruto*-1;
 //BA.debugLineNum = 905;BA.debugLine="Total = Total * -1";
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
 //BA.debugLineNum = 913;BA.debugLine="If Cantidad > 0 Then";
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
 //BA.debugLineNum = 915;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud1,(int) (5));
 //BA.debugLineNum = 916;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud2,(int) (5));
 //BA.debugLineNum = 918;BA.debugLine="If ChkValores = False Then";
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
 //BA.debugLineNum = 919;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
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
 //BA.debugLineNum = 923;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
 //BA.debugLineNum = 924;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 if (true) break;

case 231:
//C
this.state = 232;
;
 if (true) break;
;
 //BA.debugLineNum = 929;BA.debugLine="If Prct = 1 Then";

case 232:
//if
this.state = 246;
if ((_prct).equals(BA.NumberToString(1))) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
 //BA.debugLineNum = 931;BA.debugLine="Dim Multiplo = 1";
_multiplo = BA.NumberToString(1);
 //BA.debugLineNum = 933;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 235:
//if
this.state = 240;
if ((_tict).equals("D")) { 
this.state = 237;
}else if((_tict).equals("R")) { 
this.state = 239;
}if (true) break;

case 237:
//C
this.state = 240;
 //BA.debugLineNum = 934;BA.debugLine="Multiplo = -1";
_multiplo = BA.NumberToString(-1);
 if (true) break;

case 239:
//C
this.state = 240;
 //BA.debugLineNum = 936;BA.debugLine="Multiplo = 1";
_multiplo = BA.NumberToString(1);
 if (true) break;
;
 //BA.debugLineNum = 939;BA.debugLine="If ChkValores Then";

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
 //BA.debugLineNum = 941;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*(double)(Double.parseDouble(_multiplo));
 //BA.debugLineNum = 942;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 if (true) break;

case 244:
//C
this.state = 245;
 //BA.debugLineNum = 947;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*(double)(Double.parseDouble(_multiplo));
 //BA.debugLineNum = 948;BA.debugLine="CantUd2 = 0";
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
 //BA.debugLineNum = 991;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = anywheresoftware.b4a.keywords.Common.Round2(_totalila,(int) (2));
 //BA.debugLineNum = 992;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = anywheresoftware.b4a.keywords.Common.Round2(_totaliva,(int) (2));
 //BA.debugLineNum = 993;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
 //BA.debugLineNum = 994;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto,(int) (0));
 //BA.debugLineNum = 996;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 997;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalNeto,0";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalneto,(int) (0),(int) (2))));
 if (true) break;

case 251:
//C
this.state = 252;
 //BA.debugLineNum = 999;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalBruto,";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalbruto,(int) (0),(int) (0))));
 if (true) break;

case 252:
//C
this.state = 253;
;
 //BA.debugLineNum = 1002;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
parent.mostCurrent._fila.Put((Object)("cantidad"),(Object)(_cantidad));
 //BA.debugLineNum = 1003;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
parent.mostCurrent._fila.Put((Object)("cantud1"),(Object)(_cantud1));
 //BA.debugLineNum = 1004;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
parent.mostCurrent._fila.Put((Object)("cantud2"),(Object)(_cantud2));
 //BA.debugLineNum = 1006;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
parent.mostCurrent._fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
 //BA.debugLineNum = 1007;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
parent.mostCurrent._fila.Put((Object)("valivalinea"),(Object)(_totaliva));
 //BA.debugLineNum = 1008;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
parent.mostCurrent._fila.Put((Object)("valilalinea"),(Object)(_totalila));
 //BA.debugLineNum = 1009;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
parent.mostCurrent._fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
 //BA.debugLineNum = 1011;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
parent.mostCurrent._fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
 //BA.debugLineNum = 1012;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
parent.mostCurrent._fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
 //BA.debugLineNum = 1014;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
parent.mostCurrent._fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
 //BA.debugLineNum = 1015;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
parent.mostCurrent._fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
 //BA.debugLineNum = 1017;BA.debugLine="Lbl_Descuento.Text = NumberFormat(DescuentoPorc,0";
parent.mostCurrent._lbl_descuento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_descuentoporc,(int) (0),(int) (2))+" %"));
 //BA.debugLineNum = 1020;BA.debugLine="Dim TipoValor As String";
_tipovalor = "";
 //BA.debugLineNum = 1022;BA.debugLine="If ChkValores Then";
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
 //BA.debugLineNum = 1023;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalNeto,0";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalneto,(int) (0),(int) (2))));
 //BA.debugLineNum = 1024;BA.debugLine="TipoValor = \"N\"";
_tipovalor = "N";
 //BA.debugLineNum = 1025;BA.debugLine="Total_Linea = TotalNeto	+ DescuentoValor";
parent._total_linea = _totalneto+_descuentovalor;
 if (true) break;

case 257:
//C
this.state = 258;
 //BA.debugLineNum = 1027;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalBruto,";
parent.mostCurrent._lbl_total.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat(_totalbruto,(int) (0),(int) (0))));
 //BA.debugLineNum = 1028;BA.debugLine="TipoValor = \"B\"";
_tipovalor = "B";
 //BA.debugLineNum = 1029;BA.debugLine="Total_Linea = TotalBruto + DescuentoValor";
parent._total_linea = _totalbruto+_descuentovalor;
 if (true) break;

case 258:
//C
this.state = -1;
;
 //BA.debugLineNum = 1032;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
parent.mostCurrent._fila.Put((Object)("tipovalor"),(Object)(_tipovalor));
 //BA.debugLineNum = 1034;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
_precionetoud = _precioneto;
 //BA.debugLineNum = 1035;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
_preciobrutoud = _preciobruto;
 //BA.debugLineNum = 1037;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
_precionetoudlista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("precionetoudlista")))),(int) (0));
 //BA.debugLineNum = 1038;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
_preciobrutoudlista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 //BA.debugLineNum = 1040;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
parent.mostCurrent._fila.Put((Object)("precionetoud"),(Object)(_precionetoud));
 //BA.debugLineNum = 1042;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
parent.mostCurrent._fila.Put((Object)("preciobrutoud"),(Object)(_preciobrutoud));
 //BA.debugLineNum = 1045;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_revisar_descuentos() throws Exception{
 //BA.debugLineNum = 1183;BA.debugLine="Sub Sb_Revisar_Descuentos";
 //BA.debugLineNum = 1185;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 1186;BA.debugLine="TblDescuentos = DBUtils.ExecuteList(Variables.vSq";
mostCurrent._tbldescuentos = mostCurrent._dbutils._executelist /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
 //BA.debugLineNum = 1188;BA.debugLine="End Sub";
return "";
}
public static String  _txt_cantidad_click() throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub Txt_Cantidad_Click   'if you are in the focus";
 //BA.debugLineNum = 328;BA.debugLine="Txt_Cantidad.SelectAll";
mostCurrent._txt_cantidad.SelectAll();
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public static void  _txt_cantidad_enterpressed() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 333;BA.debugLine="Txt_Cantidad.Tag = Txt_Cantidad.Text";
parent.mostCurrent._txt_cantidad.setTag((Object)(parent.mostCurrent._txt_cantidad.getText()));
 //BA.debugLineNum = 334;BA.debugLine="If Txt_Cantidad.Text.Trim = \"\" Then Txt_Cantidad.";
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
 //BA.debugLineNum = 336;BA.debugLine="Wait For (Sb_Procesar_Datos(\"Cantidad\")) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_procesar_datos("Cantidad"));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 338;BA.debugLine="If Txt_Cantidad.Tag > 0 Then";
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
 //BA.debugLineNum = 339;BA.debugLine="Sb_Insertar_Descuentos_En_Escala";
_sb_insertar_descuentos_en_escala();
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}
