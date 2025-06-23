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

public class frm_post_01_formulario extends Activity implements B4AActivity{
	public static frm_post_01_formulario mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_formulario");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (frm_post_01_formulario).");
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
		activityBA = new BA(this, layout, processBA, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_formulario");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "BaKapp.Movil.Tag.frm_post_01_formulario", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (frm_post_01_formulario) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (frm_post_01_formulario) Resume **");
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
		return frm_post_01_formulario.class;
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
            BA.LogInfo("** Activity (frm_post_01_formulario) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (frm_post_01_formulario) Pause event (activity is not paused). **");
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
            frm_post_01_formulario mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (frm_post_01_formulario) Resume **");
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
public static anywheresoftware.b4a.objects.collections.Map _row_entidad = null;
public static anywheresoftware.b4a.objects.collections.Map _fila_encabezado = null;
public static anywheresoftware.b4a.objects.collections.Map _fila_observaciones = null;
public static anywheresoftware.b4a.objects.collections.Map _fila_despafacil = null;
public static boolean _cambiar_entidad = false;
public static boolean _crear_nvv_desde_cov = false;
public static boolean _nuevo_documento = false;
public static boolean _editar_documento = false;
public static int _idmaeedo_origen = 0;
public static String _nudo_origen = "";
public static String _tipodoc = "";
public static boolean _grabar = false;
public BaKapp.Movil.Tag.clfunciones2 _clfx2 = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tab_post = null;
public static String _consulta_sql = "";
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk_valores_netos = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_neto = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_iva = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_impuestos = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_total_bruto = null;
public static int _id_docdet = 0;
public anywheresoftware.b4a.objects.collections.List _idlist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_detalle = null;
public anywheresoftware.b4a.objects.collections.Map _fila_idenc = null;
public static int _new_idmaeedo = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_limpiar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_observaciones = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_orden_compra = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_centro_costo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_codentidad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_codsucentidad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_rut = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_nombre = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_direccion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_ciudad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_comuna = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_codigo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_canbiar_cliente = null;
public b4a.example3.customlistview _xclvdetalle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_codigo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_descripcion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_datos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl_item = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_items = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_fechaemision = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_fecha_1er_vencimiento = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_fechaultvencimiento = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_coutas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_dias_1er_vencimiento = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_dias_vencimiento = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_limpiar_codigo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_grabar = null;
public BaKapp.Movil.Tag.b4xfloattextfield _txt_flp_webservice = null;
public BaKapp.Movil.Tag.b4xinputtemplate _inputtemplate = null;
public BaKapp.Movil.Tag.b4xlongtexttemplate _longtexttemplate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_dsctoglobal = null;
public static boolean _hay_descuentos_globales = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_listaprecio = null;
public BaKapp.Movil.Tag.b4xsearchtemplate _searchtemplate = null;
public BaKapp.Movil.Tag.b4xsearchtemplate _despsimple_docdestino = null;
public BaKapp.Movil.Tag.b4xsearchtemplate _despsimple_tipo = null;
public BaKapp.Movil.Tag.b4xsearchtemplate _despsimple_tipopago = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_lista_precios = null;
public BaKapp.Movil.Tag.cl_permisoxui _cl_permisox = null;
public static boolean _b4a_despachosimple = false;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_tipodespacho = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_tipopagodesp = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_coddocdestino = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_direcciondesp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_transportedesp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_observacionesdesp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_tipodespachosimple = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_tipopagodesp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_coddocdestino = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_direcciondesp = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_transportedesp = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_observacionesdesp = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_observaciones = null;
public static boolean _buscandoproducto = false;
public static boolean _buscandoentidad = false;
public static boolean _editandoproducto = false;
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
public BaKapp.Movil.Tag.frm_infostockxprod _frm_infostockxprod = null;
public BaKapp.Movil.Tag.frm_menu_post_venta _frm_menu_post_venta = null;
public BaKapp.Movil.Tag.frm_menu_principal _frm_menu_principal = null;
public BaKapp.Movil.Tag.frm_post_01_descuentos _frm_post_01_descuentos = null;
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
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _nokolt = "";
String _name = "";
String _nombretabla = "";
 //BA.debugLineNum = 136;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 141;BA.debugLine="Activity.LoadLayout(\"Cp_Post\")";
mostCurrent._activity.LoadLayout("Cp_Post",mostCurrent.activityBA);
 //BA.debugLineNum = 144;BA.debugLine="CLFx2.Initialize(Null,\"\")";
mostCurrent._clfx2._initialize /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
 //BA.debugLineNum = 145;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
mostCurrent._clfx2._designercreateview /*String*/ ((Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 147;BA.debugLine="Grabar = False";
_grabar = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 149;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 149;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user_.png");
 //BA.debugLineNum = 150;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Encabezado");
 //BA.debugLineNum = 152;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_details.png");
 //BA.debugLineNum = 152;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_details_.png");
 //BA.debugLineNum = 153;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Detalle");
 //BA.debugLineNum = 155;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calc.png");
 //BA.debugLineNum = 155;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calc_.png");
 //BA.debugLineNum = 156;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Totales");
 //BA.debugLineNum = 158;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment.png");
 //BA.debugLineNum = 158;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment_.png");
 //BA.debugLineNum = 159;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Observaciones");
 //BA.debugLineNum = 161;BA.debugLine="B4A_DespachoSimple = Variables.Global_Row_Configu";
_b4a_despachosimple = BA.ObjectToBoolean(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
 //BA.debugLineNum = 163;BA.debugLine="If B4A_DespachoSimple Then";
if (_b4a_despachosimple) { 
 //BA.debugLineNum = 165;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"delivery.png");
 //BA.debugLineNum = 165;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"delivery_.png");
 //BA.debugLineNum = 166;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Pos";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_DespSimple");
 };
 //BA.debugLineNum = 171;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
mostCurrent._cl_permisox._initialize /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
 //BA.debugLineNum = 172;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
mostCurrent._cl_permisox._designercreateview /*String*/ ((Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 174;BA.debugLine="Tab_Post.CurrentTab = 1";
mostCurrent._tab_post.setCurrentTab((int) (1));
 //BA.debugLineNum = 176;BA.debugLine="InputTemplate.Initialize";
mostCurrent._inputtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 177;BA.debugLine="LongTextTemplate.Initialize";
mostCurrent._longtexttemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 178;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 180;BA.debugLine="DespSimple_DocDestino.Initialize";
mostCurrent._despsimple_docdestino._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 181;BA.debugLine="DespSimple_Tipo.Initialize";
mostCurrent._despsimple_tipo._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 182;BA.debugLine="DespSimple_TipoPago.Initialize";
mostCurrent._despsimple_tipopago._initialize /*String*/ (mostCurrent.activityBA);
 //BA.debugLineNum = 184;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 185;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="For Each Fila As Map In Variables.Global_Listas_P";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group34 = mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group34.Get(index34)));
 //BA.debugLineNum = 188;BA.debugLine="Dim Nokolt As String = Fila.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_fila.Get((Object)("Nokolt")));
 //BA.debugLineNum = 189;BA.debugLine="Dim Name As String = Nokolt.Trim";
_name = _nokolt.trim();
 //BA.debugLineNum = 190;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
 //BA.debugLineNum = 192;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (_items);
 //BA.debugLineNum = 193;BA.debugLine="Items.Clear";
_items.Clear();
 //BA.debugLineNum = 195;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group41 = mostCurrent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen41 = group41.getSize()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group41.Get(index41)));
 //BA.debugLineNum = 197;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
 //BA.debugLineNum = 198;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
 //BA.debugLineNum = 199;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
 //BA.debugLineNum = 201;BA.debugLine="DespSimple_DocDestino.SetItems(Items)";
mostCurrent._despsimple_docdestino._setitems /*Object*/ (_items);
 //BA.debugLineNum = 202;BA.debugLine="Items.Clear";
_items.Clear();
 //BA.debugLineNum = 204;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group48 = mostCurrent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen48 = group48.getSize()
;int index48 = 0;
;
for (; index48 < groupLen48;index48++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group48.Get(index48)));
 //BA.debugLineNum = 206;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
 //BA.debugLineNum = 207;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
 //BA.debugLineNum = 208;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
 //BA.debugLineNum = 210;BA.debugLine="DespSimple_Tipo.SetItems(Items)";
mostCurrent._despsimple_tipo._setitems /*Object*/ (_items);
 //BA.debugLineNum = 211;BA.debugLine="Items.Clear";
_items.Clear();
 //BA.debugLineNum = 213;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group55 = mostCurrent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen55 = group55.getSize()
;int index55 = 0;
;
for (; index55 < groupLen55;index55++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group55.Get(index55)));
 //BA.debugLineNum = 215;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
 //BA.debugLineNum = 216;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
 //BA.debugLineNum = 217;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
 //BA.debugLineNum = 219;BA.debugLine="DespSimple_TipoPago.SetItems(Items)";
mostCurrent._despsimple_tipopago._setitems /*Object*/ (_items);
 //BA.debugLineNum = 220;BA.debugLine="Items.Clear";
_items.Clear();
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
int _vsalir = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
 //BA.debugLineNum = 625;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 627;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 629;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
 //BA.debugLineNum = 632;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"exit.png");
 //BA.debugLineNum = 634;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de salir de la v";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de salir de la venta?"),BA.ObjectToCharSequence("S A L I R"),"Si","","No",(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),mostCurrent.activityBA);
 //BA.debugLineNum = 635;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 637;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 639;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc))));
 //BA.debugLineNum = 642;BA.debugLine="If Crear_NVV_Desde_COV Or Editar_Documento Or C";
if (_crear_nvv_desde_cov || _editar_documento || _cursor1.getRowCount()==0) { 
 //BA.debugLineNum = 644;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Encabezado_Doc","Id_DocEnc");
 //BA.debugLineNum = 645;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Detalle_Doc","Id_DocEnc");
 //BA.debugLineNum = 646;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Descuentos_Doc","Id_DocEnc");
 //BA.debugLineNum = 647;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Impuestos_Doc","Id_DocEnc");
 //BA.debugLineNum = 648;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Observaciones_Doc","Id_DocEnc");
 //BA.debugLineNum = 649;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"DespaFacil_Doc","Id_DocEnc");
 }else {
 //BA.debugLineNum = 653;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 };
 //BA.debugLineNum = 657;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 659;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
 //BA.debugLineNum = 663;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 665;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _res = false;
boolean _listo = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 227;BA.debugLine="Hay_Descuentos_Globales = False";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 229;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_titulo());
this.state = 37;
return;
case 37:
//C
this.state = 1;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 231;BA.debugLine="If Cambiar_Entidad Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._cambiar_entidad) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 232;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Tr";
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 233;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 //BA.debugLineNum = 234;BA.debugLine="Cambiar_Entidad = False";
parent._cambiar_entidad = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 235;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 238;BA.debugLine="If BuscandoProducto Then";

case 4:
//if
this.state = 11;
if (parent._buscandoproducto) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 239;BA.debugLine="If Not(Buscar_productos.Msj.EsCorrecto) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._buscar_productos._msj /*BaKapp.Movil.Tag.mensajes*/ ._escorrecto /*boolean*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 240;BA.debugLine="BuscandoProducto = False";
parent._buscandoproducto = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 241;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
 //BA.debugLineNum = 245;BA.debugLine="If BuscandoEntidad Then";

case 11:
//if
this.state = 18;
if (parent._buscandoentidad) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 246;BA.debugLine="If Not(Buscar_entidad.Msj.EsCorrecto) Then";
if (true) break;

case 14:
//if
this.state = 17;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._buscar_entidad._msj /*BaKapp.Movil.Tag.mensajes*/ ._escorrecto /*boolean*/ )) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 247;BA.debugLine="BuscandoEntidad = False";
parent._buscandoentidad = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 248;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
 //BA.debugLineNum = 252;BA.debugLine="If EditandoProducto Then";

case 18:
//if
this.state = 25;
if (parent._editandoproducto) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 253;BA.debugLine="EditandoProducto = False";
parent._editandoproducto = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 254;BA.debugLine="If Not(Frm_Post_01_Producto.Msj.EsCorrecto) Then";
if (true) break;

case 21:
//if
this.state = 24;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._frm_post_01_producto._msj /*BaKapp.Movil.Tag.mensajes*/ ._escorrecto /*boolean*/ )) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 255;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;
;
 //BA.debugLineNum = 259;BA.debugLine="If Id_DocEnc = 0 Or Nuevo_Documento Then";

case 25:
//if
this.state = 36;
if (parent._id_docenc==0 || parent._nuevo_documento) { 
this.state = 27;
}else {
this.state = 35;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 261;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
 //BA.debugLineNum = 262;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 264;BA.debugLine="If Not(Fila_Encabezado.IsInitialized) Then";
if (true) break;

case 28:
//if
this.state = 33;
if (anywheresoftware.b4a.keywords.Common.Not(parent._fila_encabezado.IsInitialized())) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
 //BA.debugLineNum = 265;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
 if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 267;BA.debugLine="Wait For (Sb_Cargar_Documento(True)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_cargar_documento(anywheresoftware.b4a.keywords.Common.True));
this.state = 38;
return;
case 38:
//C
this.state = 33;
_listo = (Boolean) result[0];
;
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 272;BA.debugLine="Wait For (Sb_Cargar_Documento(False)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_cargar_documento(anywheresoftware.b4a.keywords.Common.False));
this.state = 39;
return;
case 39:
//C
this.state = 36;
_listo = (Boolean) result[0];
;
 if (true) break;

case 36:
//C
this.state = -1;
;
 //BA.debugLineNum = 276;BA.debugLine="Txt_Codigo.Text = \"\"";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 277;BA.debugLine="Lbl_Items.Text = \"Total Items: 0\"";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence("Total Items: 0"));
 //BA.debugLineNum = 279;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
parent.mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 281;BA.debugLine="Sb_Cargar_Detalle(True)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(boolean _res) throws Exception{
}
public static void  _btn_buscar_click() throws Exception{
ResumableSub_Btn_Buscar_Click rsub = new ResumableSub_Btn_Buscar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Buscar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Buscar_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _rsmoscs = false;
boolean _resultado = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1540;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1542;BA.debugLine="If	Hay_Descuentos_Globales Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._hay_descuentos_globales) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1543;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE AGREMAR MAS ITEM"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1546;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1549;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_productomodoconsulta());
this.state = 13;
return;
case 13:
//C
this.state = 5;
_rsmoscs = (Boolean) result[0];
;
 //BA.debugLineNum = 1550;BA.debugLine="If Not(RsMosCs) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.Not(_rsmoscs)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 1551;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 1554;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 14;
return;
case 14:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 1555;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 9:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(_resultado)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 1556;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 1559;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 1561;BA.debugLine="BuscandoProducto = True";
parent._buscandoproducto = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1562;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Tex";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
 //BA.debugLineNum = 1563;BA.debugLine="Buscar_productos.Lista =  Fila_Encabezado.Get(\"Li";
parent.mostCurrent._buscar_productos._lista /*String*/  = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 1564;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 //BA.debugLineNum = 1566;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_canbiar_cliente_click() throws Exception{
ResumableSub_Btn_Canbiar_Cliente_Click rsub = new ResumableSub_Btn_Canbiar_Cliente_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Canbiar_Cliente_Click extends BA.ResumableSub {
public ResumableSub_Btn_Canbiar_Cliente_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
String _secueven = "";
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
 //BA.debugLineNum = 2231;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 2233;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 2236;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_cursor1.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2238;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEV";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
 //BA.debugLineNum = 2240;BA.debugLine="If Not(Secueven.Contains(\"B\")) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(_secueven.contains("B"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 2241;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2243;BA.debugLine="Msgbox2Async(\"¡No se puede cambiar la entidad y";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡No se puede cambiar la entidad ya que existen datos en el documento!"),BA.ObjectToCharSequence("Validación"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2244;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 7;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2245;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 2250;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 2252;BA.debugLine="BuscandoEntidad = True";
parent._buscandoentidad = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 2253;BA.debugLine="StartActivity(Buscar_entidad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_entidad.getObject()));
 //BA.debugLineNum = 2255;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _result) throws Exception{
}
public static void  _btn_coddocdestino_click() throws Exception{
ResumableSub_Btn_CodDocDestino_Click rsub = new ResumableSub_Btn_CodDocDestino_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_CodDocDestino_Click extends BA.ResumableSub {
public ResumableSub_Btn_CodDocDestino_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _tienepermiso = false;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _codigotabla = "";
String _nombretabla = "";
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4266;BA.debugLine="Wait For (Fx_Cambiar_DocDespSimple_Poswii) comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_cambiar_docdespsimple_poswii());
this.state = 21;
return;
case 21:
//C
this.state = 1;
_tienepermiso = (Boolean) result[0];
;
 //BA.debugLineNum = 4268;BA.debugLine="If Not(TienePermiso) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_tienepermiso)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4269;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 4272;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4273;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 4274;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4276;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 4277;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 4278;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
 //BA.debugLineNum = 4280;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_DocDesti";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._despsimple_docdestino),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 22;
return;
case 22:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4281;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 20;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 4283;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 8:
//if
this.state = 19;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 4285;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
if (true) break;

case 11:
//for
this.state = 18;
_fila = new anywheresoftware.b4a.objects.collections.Map();
group14 = parent.mostCurrent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/ ;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 18;
if (index14 < groupLen14) {
this.state = 13;
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));}
if (true) break;

case 24:
//C
this.state = 23;
index14++;
if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 4287;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
 //BA.debugLineNum = 4288;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
 //BA.debugLineNum = 4290;BA.debugLine="If DespSimple_DocDestino.SelectedItem.Trim = N";
if (true) break;

case 14:
//if
this.state = 17;
if ((parent.mostCurrent._despsimple_docdestino._selecteditem /*String*/ .trim()).equals(_nombretabla.trim())) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 4291;BA.debugLine="Lbl_CodDocDestino.Tag = CodigoTabla";
parent.mostCurrent._lbl_coddocdestino.setTag((Object)(_codigotabla));
 //BA.debugLineNum = 4292;BA.debugLine="Lbl_CodDocDestino.Text = NombreTabla";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(_nombretabla));
 //BA.debugLineNum = 4293;BA.debugLine="Exit";
this.state = 18;
if (true) break;
 if (true) break;

case 17:
//C
this.state = 24;
;
 if (true) break;
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
 //BA.debugLineNum = 4302;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_dsctoglobal_click() throws Exception{
ResumableSub_Btn_DsctoGlobal_Click rsub = new ResumableSub_Btn_DsctoGlobal_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_DsctoGlobal_Click extends BA.ResumableSub {
public ResumableSub_Btn_DsctoGlobal_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
double _descuentoporc = 0;
int _result = 0;
boolean _rsdctogl = false;
double _resultdscto = 0;
String _concepto = "";
String _empresa = "";
String _sucursal = "";
String _bodega = "";
String _lista = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
anywheresoftware.b4a.objects.collections.Map _new_row = null;
int _id_docdet2 = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3267;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3268;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
 //BA.debugLineNum = 3270;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 3273;BA.debugLine="If Cursor1.RowCount = 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_cursor1.getRowCount()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3275;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3277;BA.debugLine="Msgbox2Async(\"¡No se puede agregar un concepto g";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡No se puede agregar un concepto global si no existen datos en el documento!"),BA.ObjectToCharSequence("Validación"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 3278;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 33;
return;
case 33:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3279;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 3283;BA.debugLine="Wait For(Fx_ExisteDescuentoGlobal) Complete (Rsdc";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_existedescuentoglobal());
this.state = 34;
return;
case 34:
//C
this.state = 5;
_rsdctogl = (Boolean) result[0];
;
 //BA.debugLineNum = 3284;BA.debugLine="If RsdctoGl Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_rsdctogl) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 3285;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 3288;BA.debugLine="Btn_DsctoGlobal.Enabled = False";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3290;BA.debugLine="Wait For(Sb_Buscar_Dscto_X_Cliente) Complete (Res";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_buscar_dscto_x_cliente());
this.state = 35;
return;
case 35:
//C
this.state = 9;
_resultdscto = (Double) result[0];
;
 //BA.debugLineNum = 3291;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
 //BA.debugLineNum = 3293;BA.debugLine="If ResultDscto < 0 Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_resultdscto<0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 3294;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 3295;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 3296;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 3299;BA.debugLine="If ResultDscto > 0 Then";

case 12:
//if
this.state = 15;
if (_resultdscto>0) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 3300;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
 if (true) break;
;
 //BA.debugLineNum = 3303;BA.debugLine="If ResultDscto = 0 Then";

case 15:
//if
this.state = 22;
if (_resultdscto==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 3305;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_insertar_dscto_global_permiso());
this.state = 36;
return;
case 36:
//C
this.state = 18;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3306;BA.debugLine="DescuentoPorc = Result";
_descuentoporc = _result;
 //BA.debugLineNum = 3308;BA.debugLine="If Result = 0 Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_result==0) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 3309;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 3310;BA.debugLine="Return";
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
 //BA.debugLineNum = 3315;BA.debugLine="Dim Concepto As String = \"DESCUENTO\"";
_concepto = "DESCUENTO";
 //BA.debugLineNum = 3316;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 3317;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
 //BA.debugLineNum = 3318;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
 //BA.debugLineNum = 3319;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
 //BA.debugLineNum = 3321;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_concepto,_empresa,_sucursal,_bodega,_lista,"");
 //BA.debugLineNum = 3323;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 37;
return;
case 37:
//C
this.state = 23;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3324;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando concepto..."));
 //BA.debugLineNum = 3326;BA.debugLine="If Js.Success Then";
if (true) break;

case 23:
//if
this.state = 32;
if (_js._success /*boolean*/ ) { 
this.state = 25;
}else {
this.state = 31;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 3328;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3330;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 26:
//if
this.state = 29;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 3332;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 3333;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 3335;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
 //BA.debugLineNum = 3337;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("Moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 3338;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 3339;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 3340;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
 //BA.debugLineNum = 3342;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 3344;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
 //BA.debugLineNum = 3345;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 3347;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
_id_docdet2 = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 3349;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Id_DocDet2)";
_sb_procesar_fila("DescuentoPorc",_id_docdet2);
 //BA.debugLineNum = 3351;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 3353;BA.debugLine="Msgbox2Async(\"Descuento incorporado correctamen";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento incorporado correctamente"),BA.ObjectToCharSequence("Dscto. Global"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 3354;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 38;
return;
case 38:
//C
this.state = 29;
_result = (Integer) result[0];
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 3359;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("044105823",_js._errormessage /*String*/ ,0);
 //BA.debugLineNum = 3360;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 32:
//C
this.state = -1;
;
 //BA.debugLineNum = 3363;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 3364;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 3366;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public static String  _btn_editar_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
 //BA.debugLineNum = 667;BA.debugLine="Sub Btn_Editar_Click";
 //BA.debugLineNum = 671;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 673;BA.debugLine="If	Hay_Descuentos_Globales Then";
if (_hay_descuentos_globales) { 
 //BA.debugLineNum = 674;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE EDITAR LA FILA"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 677;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 680;BA.debugLine="Dim Btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 682;BA.debugLine="Id_DocDet = Btn.Tag";
_id_docdet = (int)(BA.ObjectToNumber(_btn.getTag()));
 //BA.debugLineNum = 683;BA.debugLine="EditandoProducto = True";
_editandoproducto = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 684;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
mostCurrent._frm_post_01_producto._id_docdet /*int*/  = _id_docdet;
 //BA.debugLineNum = 685;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_producto.getObject()));
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public static void  _btn_grabar_click() throws Exception{
ResumableSub_Btn_Grabar_Click rsub = new ResumableSub_Btn_Grabar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Grabar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Grabar_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
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
 //BA.debugLineNum = 2382;BA.debugLine="Btn_Grabar.Enabled = False";
parent.mostCurrent._btn_grabar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2384;BA.debugLine="If Editar_Documento Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._editar_documento) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 2385;BA.debugLine="Wait For (Sb_Editar_Documento)  Complete (Result";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_editar_documento());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (Boolean) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 2387;BA.debugLine="Wait For (Sb_Grabara_Nuevo_Documento) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_grabara_nuevo_documento());
this.state = 8;
return;
case 8:
//C
this.state = 6;
_result = (Boolean) result[0];
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 2390;BA.debugLine="Btn_Grabar.Enabled = True";
parent.mostCurrent._btn_grabar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2392;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_limpiar_click() throws Exception{
ResumableSub_Btn_Limpiar_Click rsub = new ResumableSub_Btn_Limpiar_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Limpiar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Limpiar_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
 //BA.debugLineNum = 1970;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 1973;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 1975;BA.debugLine="Msgbox2Async(\"¿Estas seguro de querer limpiar est";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de querer limpiar este documento?"),BA.ObjectToCharSequence("L I M P I A R"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1976;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1978;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1979;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1980;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1981;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1982;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
 //BA.debugLineNum = 1983;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
 //BA.debugLineNum = 1984;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
 //BA.debugLineNum = 1985;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1988;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_limpiar_codigo_click() throws Exception{
 //BA.debugLineNum = 2375;BA.debugLine="Private Sub Btn_Limpiar_Codigo_Click";
 //BA.debugLineNum = 2376;BA.debugLine="Txt_Codigo.Text = \"\"";
mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 2377;BA.debugLine="Txt_Codigo.SelectAll";
mostCurrent._txt_codigo.SelectAll();
 //BA.debugLineNum = 2378;BA.debugLine="End Sub";
return "";
}
public static void  _btn_limpiar_longclick() throws Exception{
ResumableSub_Btn_Limpiar_LongClick rsub = new ResumableSub_Btn_Limpiar_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_Limpiar_LongClick extends BA.ResumableSub {
public ResumableSub_Btn_Limpiar_LongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
String _resultado = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 3620;BA.debugLine="Return";
if (true) return ;
 //BA.debugLineNum = 3623;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(\"\")) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_ingresar_correo_validar(""));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 3625;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 3626;BA.debugLine="Msgbox2Async(Resultado,\"Respuesta correo\", \"Ok\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Respuesta correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3627;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3629;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_tipodespachosimple_click() throws Exception{
ResumableSub_Btn_TipoDespachoSimple_Click rsub = new ResumableSub_Btn_TipoDespachoSimple_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_TipoDespachoSimple_Click extends BA.ResumableSub {
public ResumableSub_Btn_TipoDespachoSimple_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _codigotabla = "";
String _nombretabla = "";
String _emp = "";
String _suc = "";
String _bod = "";
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _rownumber = 0;
boolean _res = false;
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;
int step23;
int limit23;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4154;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4155;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 4156;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4158;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 4159;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 4160;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
 //BA.debugLineNum = 4162;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_Tipo, \"\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._despsimple_tipo),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4163;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 28;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4165;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 27;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 4167;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
if (true) break;

case 7:
//for
this.state = 26;
_fila = new anywheresoftware.b4a.objects.collections.Map();
group10 = parent.mostCurrent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 30;
if (true) break;

case 30:
//C
this.state = 26;
if (index10 < groupLen10) {
this.state = 9;
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));}
if (true) break;

case 31:
//C
this.state = 30;
index10++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4169;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
 //BA.debugLineNum = 4170;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
 //BA.debugLineNum = 4172;BA.debugLine="If DespSimple_Tipo.SelectedItem.Trim = NombreT";
if (true) break;

case 10:
//if
this.state = 25;
if ((parent.mostCurrent._despsimple_tipo._selecteditem /*String*/ .trim()).equals(_nombretabla.trim())) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 4174;BA.debugLine="Dim Emp As String = Fila.Get(\"Emp\")";
_emp = BA.ObjectToString(_fila.Get((Object)("Emp")));
 //BA.debugLineNum = 4175;BA.debugLine="Dim Suc As String = Fila.Get(\"Suc\")";
_suc = BA.ObjectToString(_fila.Get((Object)("Suc")));
 //BA.debugLineNum = 4176;BA.debugLine="Dim Bod As String = Fila.Get(\"Bod\")";
_bod = BA.ObjectToString(_fila.Get((Object)("Bod")));
 //BA.debugLineNum = 4178;BA.debugLine="Private Row As Int";
_row = 0;
 //BA.debugLineNum = 4179;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 4181;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
 //BA.debugLineNum = 4183;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Bo";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Bodega From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 4185;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (true) break;

case 13:
//if
this.state = 24;
if (_cursor1.getRowCount()>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 4186;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
 //BA.debugLineNum = 4187;BA.debugLine="For Row = 0 To RowNumber - 1";
if (true) break;

case 16:
//for
this.state = 23;
step23 = 1;
limit23 = (int) (_rownumber-1);
_row = (int) (0) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 23;
if ((step23 > 0 && _row <= limit23) || (step23 < 0 && _row >= limit23)) this.state = 18;
if (true) break;

case 33:
//C
this.state = 32;
_row = ((int)(0 + _row + step23)) ;
if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 4188;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
 //BA.debugLineNum = 4189;BA.debugLine="If Cursor1.GetString(\"Bodega\").Trim <> Bod.";
if (true) break;

case 19:
//if
this.state = 22;
if ((_cursor1.GetString("Bodega").trim()).equals(_bod.trim()) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 4190;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 4191;BA.debugLine="Msgbox2Async(\"No se puede cambiar el tipo";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede cambiar el tipo de despacho, ya que es de otra sucursal y hay productos en el listado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 4193;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 34;
return;
case 34:
//C
this.state = 22;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4194;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 33;
;
 if (true) break;
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
 //BA.debugLineNum = 4198;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 4200;BA.debugLine="Fila_Encabezado.Put(\"Empresa\".ToLowerCase,Emp";
parent._fila_encabezado.Put((Object)("Empresa".toLowerCase()),(Object)(_emp));
 //BA.debugLineNum = 4201;BA.debugLine="Fila_Encabezado.Put(\"Sucursal\".ToLowerCase,Su";
parent._fila_encabezado.Put((Object)("Sucursal".toLowerCase()),(Object)(_suc));
 //BA.debugLineNum = 4202;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabez";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 //BA.debugLineNum = 4204;BA.debugLine="Variables.Gl_Empresa = Emp";
parent.mostCurrent._variables._gl_empresa /*String*/  = _emp;
 //BA.debugLineNum = 4205;BA.debugLine="Variables.Gl_Sucursal = Suc";
parent.mostCurrent._variables._gl_sucursal /*String*/  = _suc;
 //BA.debugLineNum = 4206;BA.debugLine="Variables.Gl_Bodega = Bod";
parent.mostCurrent._variables._gl_bodega /*String*/  = _bod;
 //BA.debugLineNum = 4208;BA.debugLine="Lbl_TipoDespacho.Tag = CodigoTabla";
parent.mostCurrent._lbl_tipodespacho.setTag((Object)(_codigotabla));
 //BA.debugLineNum = 4209;BA.debugLine="Lbl_TipoDespacho.Text = NombreTabla";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(_nombretabla));
 //BA.debugLineNum = 4211;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_titulo());
this.state = 35;
return;
case 35:
//C
this.state = 25;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 4212;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) com";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_visibleocultardespachosimple());
this.state = 36;
return;
case 36:
//C
this.state = 25;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 4214;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 4216;BA.debugLine="ToastMessageShow(\"SUCURSAL: \" & Suc, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("SUCURSAL: "+_suc),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 4218;BA.debugLine="Exit";
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 31;
;
 if (true) break;
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
 //BA.debugLineNum = 4228;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_tipopagodesp_click() throws Exception{
ResumableSub_Btn_TipoPagoDesp_Click rsub = new ResumableSub_Btn_TipoPagoDesp_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_TipoPagoDesp_Click extends BA.ResumableSub {
public ResumableSub_Btn_TipoPagoDesp_Click(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _codigotabla = "";
String _nombretabla = "";
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4232;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4233;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 4234;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4236;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 4237;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 4238;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
 //BA.debugLineNum = 4240;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_TipoPago";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._despsimple_tipopago),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4241;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4243;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 4245;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
if (true) break;

case 7:
//for
this.state = 14;
_fila = new anywheresoftware.b4a.objects.collections.Map();
group10 = parent.mostCurrent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 14;
if (index10 < groupLen10) {
this.state = 9;
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));}
if (true) break;

case 19:
//C
this.state = 18;
index10++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4247;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
 //BA.debugLineNum = 4248;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
 //BA.debugLineNum = 4250;BA.debugLine="If DespSimple_TipoPago.SelectedItem.Trim = Nom";
if (true) break;

case 10:
//if
this.state = 13;
if ((parent.mostCurrent._despsimple_tipopago._selecteditem /*String*/ .trim()).equals(_nombretabla.trim())) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 4251;BA.debugLine="Lbl_TipoPagoDesp.Tag = CodigoTabla";
parent.mostCurrent._lbl_tipopagodesp.setTag((Object)(_codigotabla));
 //BA.debugLineNum = 4252;BA.debugLine="Lbl_TipoPagoDesp.Text = NombreTabla";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(_nombretabla));
 //BA.debugLineNum = 4253;BA.debugLine="Exit";
this.state = 14;
if (true) break;
 if (true) break;

case 13:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 4262;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cambiar_docdespsimple_poswii() throws Exception{
ResumableSub_Fx_Cambiar_DocDespSimple_Poswii rsub = new ResumableSub_Fx_Cambiar_DocDespSimple_Poswii(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cambiar_DocDespSimple_Poswii extends BA.ResumableSub {
public ResumableSub_Fx_Cambiar_DocDespSimple_Poswii(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
boolean _existe = false;
boolean _otorgado = false;
String _clave = "";
String _koen = "";
int _result = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;

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
 //BA.debugLineNum = 3551;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3552;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3553;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3555;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3556;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3558;BA.debugLine="Dim Existe As Boolean";
_existe = false;
 //BA.debugLineNum = 3559;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
 //BA.debugLineNum = 3561;BA.debugLine="Dim Clave As String";
_clave = "";
 //BA.debugLineNum = 3562;BA.debugLine="Dim Koen As String = Row_Entidad.Get(\"KOEN\")";
_koen = BA.ObjectToString(parent._row_entidad.Get((Object)("KOEN")));
 //BA.debugLineNum = 3564;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del permiso"));
 //BA.debugLineNum = 3565;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 3567;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3568;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 3569;BA.debugLine="Clave = InputTemplate.Text";
_clave = parent.mostCurrent._inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 3571;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3575;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3578;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_clave_docdespsimple_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_clave,_koen,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3579;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 30;
return;
case 30:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3581;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 28;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 27;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3583;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3584;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 25;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 3586;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 3588;BA.debugLine="Existe = Fila.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_fila.Get((Object)("Existe")));
 //BA.debugLineNum = 3589;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_fila.Get((Object)("Otorgado")));
 //BA.debugLineNum = 3591;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 3593;BA.debugLine="If Existe Then";
if (true) break;

case 13:
//if
this.state = 24;
if (_existe) { 
this.state = 15;
}else {
this.state = 23;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 3594;BA.debugLine="If Otorgado Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_otorgado) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 3595;BA.debugLine="Msgbox2Async(\"Este permiso ya fue utilizado\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este permiso ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3596;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 31;
return;
case 31:
//C
this.state = 21;
_result = (Integer) result[0];
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 3601;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 3604;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3605;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (Integer) result[0];
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 3610;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3611;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 33;
return;
case 33:
//C
this.state = 28;
_result = (Integer) result[0];
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 3614;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 3615;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 //BA.debugLineNum = 3617;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_existedescuentoglobal() throws Exception{
ResumableSub_Fx_ExisteDescuentoGlobal rsub = new ResumableSub_Fx_ExisteDescuentoGlobal(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_ExisteDescuentoGlobal extends BA.ResumableSub {
public ResumableSub_Fx_ExisteDescuentoGlobal(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _rownumber = 0;
int _row = 0;
String _tict = "";
int _prct = 0;
int _result = 0;
int step6;
int limit6;

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
 //BA.debugLineNum = 4085;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 4086;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
 //BA.debugLineNum = 4088;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 4091;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_cursor1.getRowCount()>0) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4093;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
 //BA.debugLineNum = 4095;BA.debugLine="For Row = 0 To RowNumber - 1";
if (true) break;

case 4:
//for
this.state = 11;
step6 = 1;
limit6 = (int) (_rownumber-1);
_row = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 11;
if ((step6 > 0 && _row <= limit6) || (step6 < 0 && _row >= limit6)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_row = ((int)(0 + _row + step6)) ;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 4097;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
 //BA.debugLineNum = 4098;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
parent.mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
 //BA.debugLineNum = 4100;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
parent._id_docdet = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDet")));
 //BA.debugLineNum = 4101;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
_tict = _cursor1.GetString("Tict");
 //BA.debugLineNum = 4102;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
_prct = (int)(Double.parseDouble(_cursor1.GetString("Prct")));
 //BA.debugLineNum = 4104;BA.debugLine="If Prct = 1 And Tict = \"D\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_prct==1 && (_tict).equals("D")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4106;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 4107;BA.debugLine="Msgbox2Async(\"¡YA EXISTE UN DESCUENTO GLOBAL!\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡YA EXISTE UN DESCUENTO GLOBAL!"),BA.ObjectToCharSequence("Validación"),"OK","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 4108;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 17;
return;
case 17:
//C
this.state = 10;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 4109;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 10:
//C
this.state = 16;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 4115;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 4118;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 4120;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 //BA.debugLineNum = 4122;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_fx_validar_lineas_por_documento_vs_formato() throws Exception{
ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato rsub = new ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato extends BA.ResumableSub {
public ResumableSub_Fx_Fx_Validar_Lineas_Por_Documento_VS_Formato(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
String _secueven = "";
String _tido = "";
anywheresoftware.b4a.objects.collections.Map _rowdoc = null;
int _nrolineasxpag = 0;
int _lineas = 0;

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
 //BA.debugLineNum = 1592;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
 //BA.debugLineNum = 1593;BA.debugLine="Dim Tido As String = TipoDoc";
_tido = parent._tipodoc;
 //BA.debugLineNum = 1595;BA.debugLine="If Secueven.Contains(\"B\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_secueven.contains("B")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 1596;BA.debugLine="Tido = \"BLV\"";
_tido = "BLV";
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 1598;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1601;BA.debugLine="Dim RowDoc As Map";
_rowdoc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1603;BA.debugLine="Select Case Tido";
if (true) break;

case 7:
//select
this.state = 16;
switch (BA.switchObjectToInt(_tido,"COV","NVV","BLV","FCV")) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
case 3: {
this.state = 15;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 16;
 //BA.debugLineNum = 1605;BA.debugLine="RowDoc = Variables.Global_COV";
_rowdoc = parent.mostCurrent._variables._global_cov /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 11:
//C
this.state = 16;
 //BA.debugLineNum = 1607;BA.debugLine="RowDoc = Variables.Global_NVV";
_rowdoc = parent.mostCurrent._variables._global_nvv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 13:
//C
this.state = 16;
 //BA.debugLineNum = 1609;BA.debugLine="RowDoc = Variables.Global_BLV";
_rowdoc = parent.mostCurrent._variables._global_blv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 1611;BA.debugLine="RowDoc = Variables.Global_FCV";
_rowdoc = parent.mostCurrent._variables._global_fcv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 1614;BA.debugLine="Dim NroLineasXpag As Int = RowDoc.Get(\"NroLineasX";
_nrolineasxpag = (int)(BA.ObjectToNumber(_rowdoc.Get((Object)("NroLineasXpag"))));
 //BA.debugLineNum = 1615;BA.debugLine="Dim Lineas As Int = XclvDetalle.Size";
_lineas = parent.mostCurrent._xclvdetalle._getsize();
 //BA.debugLineNum = 1618;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1620;BA.debugLine="If NroLineasXpag < Lineas+1 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_nrolineasxpag<_lineas+1) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 1621;BA.debugLine="Msgbox2Async(\"No es posible ingresar más líneas";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar más líneas en detalle"+anywheresoftware.b4a.keywords.Common.CRLF+"Máximo de líneas por documento ["+BA.NumberToString(_nrolineasxpag)+"]"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1623;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 1626;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 1627;BA.debugLine="End Sub";
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
public ResumableSub_Fx_Insertar_Dscto_Global_Permiso(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
boolean _existe = false;
boolean _otorgado = false;
int _descuentoporc = 0;
String _clave = "";
int _result = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;

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
 //BA.debugLineNum = 3473;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3474;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3475;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3477;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3478;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3480;BA.debugLine="Dim Existe As Boolean";
_existe = false;
 //BA.debugLineNum = 3481;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
 //BA.debugLineNum = 3482;BA.debugLine="Dim DescuentoPorc As Int = 0";
_descuentoporc = (int) (0);
 //BA.debugLineNum = 3484;BA.debugLine="Dim Clave As String";
_clave = "";
 //BA.debugLineNum = 3486;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
 //BA.debugLineNum = 3487;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 3489;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3490;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 3491;BA.debugLine="Clave = InputTemplate.Text";
_clave = parent.mostCurrent._inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 3493;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3497;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3500;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_dscto_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_clave,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU"))),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3501;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 36;
return;
case 36:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3503;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 34;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 33;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3505;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3506;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 31;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 3508;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 3510;BA.debugLine="Existe = Fila.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_fila.Get((Object)("Existe")));
 //BA.debugLineNum = 3511;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_fila.Get((Object)("Otorgado")));
 //BA.debugLineNum = 3512;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
_descuentoporc = (int)(BA.ObjectToNumber(_fila.Get((Object)("Descuento"))));
 //BA.debugLineNum = 3514;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 3516;BA.debugLine="If Existe Then";
if (true) break;

case 13:
//if
this.state = 30;
if (_existe) { 
this.state = 15;
}else {
this.state = 29;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 3517;BA.debugLine="If Otorgado Then";
if (true) break;

case 16:
//if
this.state = 27;
if (_otorgado) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 27;
 //BA.debugLineNum = 3518;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este descuento ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3519;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 37;
return;
case 37:
//C
this.state = 27;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3520;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 3522;BA.debugLine="If DescuentoPorc <=0 Then";
if (true) break;

case 21:
//if
this.state = 26;
if (_descuentoporc<=0) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 //BA.debugLineNum = 3523;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede incorporar este descuento, ya que no es un valor valido."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3525;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 38;
return;
case 38:
//C
this.state = 26;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3526;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 3528;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 3529;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento aceptado."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3530;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 39;
return;
case 39:
//C
this.state = 26;
_result = (Integer) result[0];
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 3534;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3535;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 40;
return;
case 40:
//C
this.state = 30;
_result = (Integer) result[0];
;
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
 //BA.debugLineNum = 3540;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3541;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 41;
return;
case 41:
//C
this.state = 34;
_result = (Integer) result[0];
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 //BA.debugLineNum = 3544;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 3545;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 //BA.debugLineNum = 3547;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_validar_descuentos_globales() throws Exception{
ResumableSub_Fx_Validar_Descuentos_Globales rsub = new ResumableSub_Fx_Validar_Descuentos_Globales(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Validar_Descuentos_Globales extends BA.ResumableSub {
public ResumableSub_Fx_Validar_Descuentos_Globales(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _contador = 0;
int _contador_item = 0;
double _totalnetodoc = 0;
double _totalivadoc = 0;
double _totaliladoc = 0;
double _totalbrutodoc = 0;
double _totalnetosdscto = 0;
double _totaldsctoglobal = 0;
double _dsctoporcglobal = 0;
boolean _afecta_precio_real = false;
anywheresoftware.b4a.sql.SQL _sql = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _detalle = null;
double _cantidad = 0;
double _precio = 0;
double _valnetolinea = 0;
int _untrans = 0;
String _codigo = "";
String _tict = "";
boolean _prct = false;
int _id_oferta = 0;
String _oferta = "";
int _padre_oferta = 0;
boolean _aplica_oferta = false;
boolean _valvtadescmax = false;
double _var_dsctoglobal = 0;
double _dscto_parcilizado = 0;
boolean _tiene_dscto_superado_autorizado = false;
String _codfuncionario_autoriza = "";
double _importanciaporc = 0;
double _importanciavalor = 0;
double _descuentovalor = 0;
double _netolinea = 0;
double _brutolinea = 0;
double _cantud1 = 0;
double _cantud2 = 0;
double _netorealud1 = 0;
double _netorealud2 = 0;
double _descuentoporc = 0;
double _dsctomaximolinea = 0;
double _rtu = 0;
double _precionetoud1 = 0;
double _dsctoreal = 0;
double _dsctolinea = 0;
double _dsctorealvalor = 0;
boolean _tiene_dscto = false;
String _codfunautoriza = "";
String _codvendedor = "";
String _codpermiso = "";
double _valor_dscto = 0;
boolean _es_padre_oferta = false;

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
 //BA.debugLineNum = 3722;BA.debugLine="Dim Contador As Int";
_contador = 0;
 //BA.debugLineNum = 3723;BA.debugLine="Dim Contador_Item As Int";
_contador_item = 0;
 //BA.debugLineNum = 3725;BA.debugLine="Dim TotalNetoDoc As Double = Funciones.Fx_NuloPor";
_totalnetodoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_neto.getTag(),0)));
 //BA.debugLineNum = 3726;BA.debugLine="Dim TotalIvaDoc As Double = Funciones.Fx_NuloPorN";
_totalivadoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_iva.getTag(),0)));
 //BA.debugLineNum = 3727;BA.debugLine="Dim TotalIlaDoc As Double = Funciones.Fx_NuloPorN";
_totaliladoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_impuestos.getTag(),0)));
 //BA.debugLineNum = 3728;BA.debugLine="Dim TotalBrutoDoc As Double = Funciones.Fx_NuloPo";
_totalbrutodoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_bruto.getTag(),0)));
 //BA.debugLineNum = 3730;BA.debugLine="Dim TotalNetoSDscto As Double = 0";
_totalnetosdscto = 0;
 //BA.debugLineNum = 3731;BA.debugLine="Dim TotalDsctoGlobal As Double = 0";
_totaldsctoglobal = 0;
 //BA.debugLineNum = 3732;BA.debugLine="Dim DsctoPorcGlobal As Double = 0";
_dsctoporcglobal = 0;
 //BA.debugLineNum = 3734;BA.debugLine="Dim Afecta_Precio_Real As Boolean";
_afecta_precio_real = false;
 //BA.debugLineNum = 3736;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
 //BA.debugLineNum = 3737;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 3739;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3741;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
 //BA.debugLineNum = 3743;BA.debugLine="Do While Detalle.NextRow";
if (true) break;

case 1:
//do while
this.state = 20;
while (_detalle.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3745;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
 //BA.debugLineNum = 3746;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
_precio = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Precio")),0)));
 //BA.debugLineNum = 3747;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
_valnetolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("ValNetoLinea")),0)));
 //BA.debugLineNum = 3748;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
 //BA.debugLineNum = 3750;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
 //BA.debugLineNum = 3751;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
 //BA.debugLineNum = 3752;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
 //BA.debugLineNum = 3754;BA.debugLine="Dim Id_Oferta As Int '= Detalle.GetString(\"Id_Of";
_id_oferta = 0;
 //BA.debugLineNum = 3755;BA.debugLine="Dim Oferta As String '= Detalle.GetString(\"Ofert";
_oferta = "";
 //BA.debugLineNum = 3757;BA.debugLine="Dim Padre_Oferta As Int '= Detalle.GetString(\"Pa";
_padre_oferta = 0;
 //BA.debugLineNum = 3758;BA.debugLine="Dim Aplica_Oferta As Boolean '= Detalle.GetStrin";
_aplica_oferta = false;
 //BA.debugLineNum = 3760;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(D";
_valvtadescmax = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("ValVtaDescMax"));
 //BA.debugLineNum = 3762;BA.debugLine="If Tict <> \"D\" Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_tict).equals("D") == false) { 
this.state = 6;
}else if((_tict).equals("D")) { 
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 3765;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Deta";
_totalnetosdscto = _totalnetosdscto+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (2));
 //BA.debugLineNum = 3768;BA.debugLine="If Prct = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_prct==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3769;BA.debugLine="Contador_Item = Contador_Item + 1";
_contador_item = (int) (_contador_item+1);
 if (true) break;

case 10:
//C
this.state = 19;
;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 3774;BA.debugLine="If Aplica_Oferta Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_aplica_oferta) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 3776;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Det";
_totalnetosdscto = _totalnetosdscto+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (2));
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 3785;BA.debugLine="Afecta_Precio_Real = True'_RowConcepto.Item(\"R";
_afecta_precio_real = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 3788;BA.debugLine="TotalDsctoGlobal = TotalDsctoGlobal + Round2(D";
_totaldsctoglobal = _totaldsctoglobal+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea")*-1,(int) (2));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 1;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 3797;BA.debugLine="Dim Var_DsctoGlobal As Double";
_var_dsctoglobal = 0;
 //BA.debugLineNum = 3798;BA.debugLine="Dim Dscto_Parcilizado As Double";
_dscto_parcilizado = 0;
 //BA.debugLineNum = 3800;BA.debugLine="If TotalDsctoGlobal > 0 Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_totaldsctoglobal>0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 3801;BA.debugLine="DsctoPorcGlobal = 0";
_dsctoporcglobal = 0;
 //BA.debugLineNum = 3802;BA.debugLine="DsctoPorcGlobal = TotalDsctoGlobal / TotalNetoSD";
_dsctoporcglobal = _totaldsctoglobal/(double)_totalnetosdscto;
 //BA.debugLineNum = 3803;BA.debugLine="Var_DsctoGlobal = Round2(DsctoPorcGlobal, 3)";
_var_dsctoglobal = anywheresoftware.b4a.keywords.Common.Round2(_dsctoporcglobal,(int) (3));
 //BA.debugLineNum = 3804;BA.debugLine="DsctoPorcGlobal = Round2(100 * DsctoPorcGlobal,";
_dsctoporcglobal = anywheresoftware.b4a.keywords.Common.Round2(100*_dsctoporcglobal,(int) (2));
 //BA.debugLineNum = 3805;BA.debugLine="Dscto_Parcilizado = TotalDsctoGlobal / Contador_";
_dscto_parcilizado = _totaldsctoglobal/(double)_contador_item;
 if (true) break;

case 24:
//C
this.state = 25;
;
 //BA.debugLineNum = 3808;BA.debugLine="Dim Tiene_Dscto_Superado_Autorizado As Boolean";
_tiene_dscto_superado_autorizado = false;
 //BA.debugLineNum = 3809;BA.debugLine="Dim CodFuncionario_Autoriza As String";
_codfuncionario_autoriza = "";
 //BA.debugLineNum = 3811;BA.debugLine="Do While Detalle.NextRow";
if (true) break;

case 25:
//do while
this.state = 80;
while (_detalle.NextRow()) {
this.state = 27;
if (true) break;
}
if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 3813;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
parent._id_docdet = (int)(Double.parseDouble(_detalle.GetString("Id_DocDet")));
 //BA.debugLineNum = 3814;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
 //BA.debugLineNum = 3816;BA.debugLine="If Codigo = \"\" Then Exit";
if (true) break;

case 28:
//if
this.state = 33;
if ((_codigo).equals("")) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 80;
if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
 //BA.debugLineNum = 3818;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
 //BA.debugLineNum = 3819;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
 //BA.debugLineNum = 3821;BA.debugLine="Dim ImportanciaPorc As Double";
_importanciaporc = 0;
 //BA.debugLineNum = 3822;BA.debugLine="Dim ImportanciaValor As Double";
_importanciavalor = 0;
 //BA.debugLineNum = 3824;BA.debugLine="Dim DescuentoValor As Double = Round2(Detalle.Ge";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("DescuentoValor"),(int) (3));
 //BA.debugLineNum = 3825;BA.debugLine="Dim NetoLinea As Double = Round2(Detalle.GetDoub";
_netolinea = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (3));
 //BA.debugLineNum = 3826;BA.debugLine="Dim BrutoLinea As Double = Round2(Detalle.GetDou";
_brutolinea = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValBrutoLinea"),(int) (3));
 //BA.debugLineNum = 3828;BA.debugLine="Dim CantUd1 As Double = Detalle.GetDouble(\"CantU";
_cantud1 = _detalle.GetDouble("CantUd1");
 //BA.debugLineNum = 3829;BA.debugLine="Dim CantUd2 As Double = Detalle.GetDouble(\"CantU";
_cantud2 = _detalle.GetDouble("CantUd2");
 //BA.debugLineNum = 3830;BA.debugLine="Dim NetoRealUd1 As Double";
_netorealud1 = 0;
 //BA.debugLineNum = 3831;BA.debugLine="Dim NetoRealUd2 As Double";
_netorealud2 = 0;
 //BA.debugLineNum = 3833;BA.debugLine="Dim DescuentoPorc As Double = Detalle.GetDouble(";
_descuentoporc = _detalle.GetDouble("DescuentoPorc");
 //BA.debugLineNum = 3834;BA.debugLine="Dim DsctoMaximoLinea As Double = Detalle.GetDoub";
_dsctomaximolinea = _detalle.GetDouble("DescMaximo");
 //BA.debugLineNum = 3835;BA.debugLine="Dim Rtu As Double = Detalle.GetDouble(\"Rtu\")";
_rtu = _detalle.GetDouble("Rtu");
 //BA.debugLineNum = 3837;BA.debugLine="If Prct = False Then";
if (true) break;

case 34:
//if
this.state = 79;
if (_prct==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 3839;BA.debugLine="ImportanciaPorc = Round2(NetoLinea / TotalNetoS";
_importanciaporc = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_totalnetosdscto,(int) (5));
 //BA.debugLineNum = 3840;BA.debugLine="ImportanciaValor = Round2(ImportanciaPorc * Tot";
_importanciavalor = anywheresoftware.b4a.keywords.Common.Round2(_importanciaporc*_totaldsctoglobal,(int) (5));
 //BA.debugLineNum = 3842;BA.debugLine="Dim PrecioNetoUd1 As Double = Round2(NetoLinea";
_precionetoud1 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud1,(int) (3));
 //BA.debugLineNum = 3843;BA.debugLine="NetoRealUd1 = Round2(PrecioNetoUd1 - (PrecioNet";
_netorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_precionetoud1-(_precionetoud1*_var_dsctoglobal),(int) (3));
 //BA.debugLineNum = 3845;BA.debugLine="If Rtu = 1 Then";
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
 //BA.debugLineNum = 3846;BA.debugLine="NetoRealUd2 = NetoRealUd1 * Rtu";
_netorealud2 = _netorealud1*_rtu;
 //BA.debugLineNum = 3847;BA.debugLine="NetoRealUd2 = NetoRealUd1";
_netorealud2 = _netorealud1;
 if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 3849;BA.debugLine="NetoRealUd2 = Round2((NetoLinea / CantUd2) - (";
_netorealud2 = anywheresoftware.b4a.keywords.Common.Round2((_netolinea/(double)_cantud2)-((_netolinea/(double)_cantud2)*_var_dsctoglobal),(int) (3));
 if (true) break;

case 42:
//C
this.state = 43;
;
 //BA.debugLineNum = 3853;BA.debugLine="Dim DsctoReal As Double = DsctoPorcGlobal";
_dsctoreal = _dsctoporcglobal;
 //BA.debugLineNum = 3854;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealPorc",(Object)(_dsctoreal),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3856;BA.debugLine="Dim DsctoLinea As Double = Funciones.Fx_NuloPor";
_dsctolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("DescuentoPorc")),0)));
 //BA.debugLineNum = 3858;BA.debugLine="DsctoReal = Round2(100 * (1 - ((1 - (DsctoLinea";
_dsctoreal = anywheresoftware.b4a.keywords.Common.Round2(100*(1-((1-(_dsctolinea/(double)100.0))*(1-(_dsctoporcglobal/(double)100.0)))),(int) (3));
 //BA.debugLineNum = 3864;BA.debugLine="If Afecta_Precio_Real = False Then";
if (true) break;

case 43:
//if
this.state = 52;
if (_afecta_precio_real==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 3865;BA.debugLine="If NetoLinea > 0 Then";
if (true) break;

case 46:
//if
this.state = 51;
if (_netolinea>0) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
 //BA.debugLineNum = 3866;BA.debugLine="NetoRealUd1 = Round2(NetoLinea / CantUd1, 5)";
_netorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud1,(int) (5));
 //BA.debugLineNum = 3867;BA.debugLine="NetoRealUd2 = Round2(NetoLinea / CantUd2, 5)";
_netorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud2,(int) (5));
 if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 3869;BA.debugLine="NetoRealUd1 = 0";
_netorealud1 = 0;
 //BA.debugLineNum = 3870;BA.debugLine="NetoRealUd2 = 0";
_netorealud2 = 0;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 //BA.debugLineNum = 3875;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","PrecioNetoRealUd1",(Object)(_netorealud1),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3876;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","PrecioNetoRealUd1",(Object)(_netorealud2),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3878;BA.debugLine="Dim DsctoRealValor As Double";
_dsctorealvalor = 0;
 //BA.debugLineNum = 3880;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (true) break;

case 53:
//if
this.state = 58;
if (parent.mostCurrent._chk_valores_netos.getChecked()) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 //BA.debugLineNum = 3881;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
_dsctorealvalor = anywheresoftware.b4a.keywords.Common.Round2((_dsctoreal/(double)100)*_totalnetodoc,(int) (1));
 if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 3883;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
_dsctorealvalor = anywheresoftware.b4a.keywords.Common.Round2((_dsctoreal/(double)100)*_totalbrutodoc,(int) (0));
 if (true) break;

case 58:
//C
this.state = 59;
;
 //BA.debugLineNum = 3886;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealPorc",(Object)(_dsctoreal),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3887;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealValor",(Object)(_dsctorealvalor),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3889;BA.debugLine="Dim Tiene_Dscto As Boolean = Funciones.Cbool(De";
_tiene_dscto = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Tiene_Dscto"));
 //BA.debugLineNum = 3890;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(";
_valvtadescmax = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("ValVtaDescMax"));
 //BA.debugLineNum = 3892;BA.debugLine="If DsctoReal > DsctoMaximoLinea Then";
if (true) break;

case 59:
//if
this.state = 78;
if (_dsctoreal>_dsctomaximolinea) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 //BA.debugLineNum = 3894;BA.debugLine="Dim CodFunAutoriza As String = Detalle.GetStri";
_codfunautoriza = _detalle.GetString("CodFunAutoriza");
 //BA.debugLineNum = 3895;BA.debugLine="Dim CodVendedor As String = Detalle.GetString(";
_codvendedor = _detalle.GetString("CodVendedor");
 //BA.debugLineNum = 3896;BA.debugLine="Dim CodPermiso As String = Funciones.Fx_NuloPo";
_codpermiso = parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetString("CodPermiso")),(double)(Double.parseDouble("")));
 //BA.debugLineNum = 3897;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
 //BA.debugLineNum = 3899;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza";
if (true) break;

case 62:
//if
this.state = 67;
if ((_codfunautoriza).equals("xyz")) { 
this.state = 64;
;}if (true) break;

case 64:
//C
this.state = 67;
_codfunautoriza = _codvendedor;
if (true) break;

case 67:
//C
this.state = 68;
;
 //BA.debugLineNum = 3907;BA.debugLine="Dim Es_Padre_Oferta As Boolean = Funciones.Cbo";
_es_padre_oferta = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Es_Padre_Oferta"));
 //BA.debugLineNum = 3908;BA.debugLine="Dim Aplica_Oferta As Boolean = Funciones.Cbool";
_aplica_oferta = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,(double)(Double.parseDouble(_detalle.GetString("Aplica_Oferta"))));
 //BA.debugLineNum = 3910;BA.debugLine="If Aplica_Oferta = False Or Es_Padre_Oferta Th";
if (true) break;

case 68:
//if
this.state = 77;
if (_aplica_oferta==anywheresoftware.b4a.keywords.Common.False || _es_padre_oferta) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
 //BA.debugLineNum = 3912;BA.debugLine="If Valor_Dscto >= DsctoReal Then";
if (true) break;

case 71:
//if
this.state = 76;
if (_valor_dscto>=_dsctoreal) { 
this.state = 73;
}else {
this.state = 75;
}if (true) break;

case 73:
//C
this.state = 76;
 //BA.debugLineNum = 3917;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoGlobalSuperado",(Object)(anywheresoftware.b4a.keywords.Common.False),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3918;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","CodFuncionario_Autoriza",(Object)(_codfunautoriza),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 if (true) break;

case 75:
//C
this.state = 76;
 //BA.debugLineNum = 3922;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","ValVtaDescMax",(Object)(anywheresoftware.b4a.keywords.Common.True),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3923;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoGlobalSuperado",(Object)(anywheresoftware.b4a.keywords.Common.True),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 //BA.debugLineNum = 3924;BA.debugLine="Contador = Contador + 1";
_contador = (int) (_contador+1);
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = 25;
;
 if (true) break;
;
 //BA.debugLineNum = 3939;BA.debugLine="If Contador = 0 Then";

case 80:
//if
this.state = 85;
if (_contador==0) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 85;
 //BA.debugLineNum = 3957;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 84:
//C
this.state = 85;
 //BA.debugLineNum = 3967;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 85:
//C
this.state = -1;
;
 //BA.debugLineNum = 3971;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String[]  _generaarreglo(String _tabla) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _tbl = null;
int _cantfilas = 0;
String[] _arreglo = null;
int _i = 0;
String _namedb = "";
String _typedb = "";
String _hola = "";
 //BA.debugLineNum = 3201;BA.debugLine="Private Sub GeneraArreglo(Tabla As String) As Stri";
 //BA.debugLineNum = 3203;BA.debugLine="Consulta_Sql = \"PRAGMA table_info('\" & Tabla & \"'";
mostCurrent._consulta_sql = "PRAGMA table_info('"+_tabla+"')";
 //BA.debugLineNum = 3205;BA.debugLine="Private Tbl As Cursor";
_tbl = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3207;BA.debugLine="Tbl = Variables.vSql.ExecQuery(Consulta_Sql)";
_tbl = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(mostCurrent._consulta_sql)));
 //BA.debugLineNum = 3209;BA.debugLine="If Tbl.RowCount > 0 Then";
if (_tbl.getRowCount()>0) { 
 //BA.debugLineNum = 3211;BA.debugLine="Dim	CantFilas As Int = Tbl.RowCount";
_cantfilas = _tbl.getRowCount();
 //BA.debugLineNum = 3212;BA.debugLine="Dim Arreglo(CantFilas) As String";
_arreglo = new String[_cantfilas];
java.util.Arrays.fill(_arreglo,"");
 //BA.debugLineNum = 3214;BA.debugLine="For i = 0 To CantFilas-1";
{
final int step7 = 1;
final int limit7 = (int) (_cantfilas-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 3216;BA.debugLine="Try";
try { //BA.debugLineNum = 3218;BA.debugLine="Tbl.Position = i";
_tbl.setPosition(_i);
 //BA.debugLineNum = 3220;BA.debugLine="Dim nameDB As String = Tbl.GetString(\"name\")";
_namedb = _tbl.GetString("name");
 //BA.debugLineNum = 3221;BA.debugLine="Dim TypeDB As String = Tbl.GetString(\"type\")";
_typedb = _tbl.GetString("type");
 //BA.debugLineNum = 3223;BA.debugLine="If nameDB.Contains(\"Fecha\") And TypeDB = \"DOUB";
if (_namedb.contains("Fecha") && (_typedb).equals("DOUBLE")) { 
 //BA.debugLineNum = 3224;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
_arreglo[_i] = mostCurrent._dbutils._db_date /*String*/ ;
 }else {
 //BA.debugLineNum = 3227;BA.debugLine="Select Case TypeDB";
switch (BA.switchObjectToInt(_typedb,"DOUBLE","INTEGER","INT","INTEGER","BOOLEAN","STRING","DATE")) {
case 0: {
 //BA.debugLineNum = 3229;BA.debugLine="Arreglo(i) = DBUtils.DB_DOUBLE";
_arreglo[_i] = mostCurrent._dbutils._db_double /*String*/ ;
 break; }
case 1: 
case 2: {
 //BA.debugLineNum = 3231;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
_arreglo[_i] = mostCurrent._dbutils._db_integer /*String*/ ;
 break; }
case 3: {
 //BA.debugLineNum = 3233;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
_arreglo[_i] = mostCurrent._dbutils._db_integer /*String*/ ;
 break; }
case 4: {
 //BA.debugLineNum = 3235;BA.debugLine="Arreglo(i) = DBUtils.DB_BOOLEAN";
_arreglo[_i] = mostCurrent._dbutils._db_boolean /*String*/ ;
 break; }
case 5: {
 //BA.debugLineNum = 3237;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
_arreglo[_i] = mostCurrent._dbutils._db_text /*String*/ ;
 break; }
case 6: {
 //BA.debugLineNum = 3239;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
_arreglo[_i] = mostCurrent._dbutils._db_date /*String*/ ;
 break; }
default: {
 //BA.debugLineNum = 3241;BA.debugLine="If TypeDB.Contains(\"CHAR\") Then";
if (_typedb.contains("CHAR")) { 
 //BA.debugLineNum = 3242;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
_arreglo[_i] = mostCurrent._dbutils._db_text /*String*/ ;
 }else {
 //BA.debugLineNum = 3244;BA.debugLine="Dim hola As String = \"Aca\"";
_hola = "Aca";
 };
 break; }
}
;
 };
 } 
       catch (Exception e37) {
			processBA.setLastException(e37); //BA.debugLineNum = 3251;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("044040242",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }
};
 //BA.debugLineNum = 3256;BA.debugLine="Return Arreglo";
if (true) return _arreglo;
 };
 //BA.debugLineNum = 3260;BA.debugLine="Return Null";
if (true) return (String[])(anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 3262;BA.debugLine="End Sub";
return null;
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 37;BA.debugLine="Dim CLFx2 As ClFunciones2";
mostCurrent._clfx2 = new BaKapp.Movil.Tag.clfunciones2();
 //BA.debugLineNum = 39;BA.debugLine="Private Tab_Post As TabHost";
mostCurrent._tab_post = new anywheresoftware.b4a.objects.TabHostWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Consulta_Sql As String";
mostCurrent._consulta_sql = "";
 //BA.debugLineNum = 43;BA.debugLine="Private Chk_Valores_Netos As CheckBox";
mostCurrent._chk_valores_netos = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Lbl_Total_Neto As Label";
mostCurrent._lbl_total_neto = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Lbl_Total_Iva As Label";
mostCurrent._lbl_total_iva = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Lbl_Total_Impuestos As Label";
mostCurrent._lbl_total_impuestos = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Lbl_Total_Bruto As Label";
mostCurrent._lbl_total_bruto = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private Id_DocDet As Int";
_id_docdet = 0;
 //BA.debugLineNum = 51;BA.debugLine="Private IDList As List";
mostCurrent._idlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 53;BA.debugLine="Private Lbl_Detalle As Label";
mostCurrent._lbl_detalle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Dim Fila_IdEnc As Map";
mostCurrent._fila_idenc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 57;BA.debugLine="Dim New_Idmaeedo As Int";
_new_idmaeedo = 0;
 //BA.debugLineNum = 59;BA.debugLine="Private Btn_Limpiar As Button";
mostCurrent._btn_limpiar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private Txt_Observaciones As EditText";
mostCurrent._txt_observaciones = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private Txt_Orden_compra As EditText";
mostCurrent._txt_orden_compra = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private Lbl_Centro_Costo As Label";
mostCurrent._lbl_centro_costo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private Lbl_CodEntidad As Label";
mostCurrent._lbl_codentidad = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private Lbl_CodSucEntidad As Label";
mostCurrent._lbl_codsucentidad = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Private Lbl_Rut As Label";
mostCurrent._lbl_rut = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Private Lbl_Nombre As Label";
mostCurrent._lbl_nombre = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private Lbl_Direccion As Label";
mostCurrent._lbl_direccion = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private Lbl_Ciudad As Label";
mostCurrent._lbl_ciudad = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Private Lbl_Comuna As Label";
mostCurrent._lbl_comuna = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Private Txt_Codigo As EditText";
mostCurrent._txt_codigo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Private Btn_Canbiar_Cliente As Button";
mostCurrent._btn_canbiar_cliente = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Private XclvDetalle As CustomListView";
mostCurrent._xclvdetalle = new b4a.example3.customlistview();
 //BA.debugLineNum = 76;BA.debugLine="Private Label1 As B4XView";
mostCurrent._label1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Private Lbl_Codigo As B4XView";
mostCurrent._lbl_codigo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private Lbl_Descripcion As B4XView";
mostCurrent._lbl_descripcion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private Lbl_Datos As B4XView";
mostCurrent._lbl_datos = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private Lbl_Item As B4XView";
mostCurrent._lbl_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Private Lbl_Items As Label";
mostCurrent._lbl_items = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Private Lbl_FechaEmision As Label";
mostCurrent._lbl_fechaemision = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Private Lbl_Fecha_1er_Vencimiento As Label";
mostCurrent._lbl_fecha_1er_vencimiento = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Private Lbl_FechaUltVencimiento As Label";
mostCurrent._lbl_fechaultvencimiento = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Private Lbl_Coutas As Label";
mostCurrent._lbl_coutas = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 88;BA.debugLine="Private Lbl_Dias_1er_Vencimiento As Label";
mostCurrent._lbl_dias_1er_vencimiento = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 89;BA.debugLine="Private Lbl_Dias_Vencimiento As Label";
mostCurrent._lbl_dias_vencimiento = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private Btn_Limpiar_Codigo As Button";
mostCurrent._btn_limpiar_codigo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 92;BA.debugLine="Private Btn_Grabar As Button";
mostCurrent._btn_grabar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 94;BA.debugLine="Private Txt_Flp_WebService As B4XFloatTextField";
mostCurrent._txt_flp_webservice = new BaKapp.Movil.Tag.b4xfloattextfield();
 //BA.debugLineNum = 95;BA.debugLine="Private InputTemplate As B4XInputTemplate";
mostCurrent._inputtemplate = new BaKapp.Movil.Tag.b4xinputtemplate();
 //BA.debugLineNum = 96;BA.debugLine="Private LongTextTemplate As B4XLongTextTemplate";
mostCurrent._longtexttemplate = new BaKapp.Movil.Tag.b4xlongtexttemplate();
 //BA.debugLineNum = 97;BA.debugLine="Private Btn_DsctoGlobal As Button";
mostCurrent._btn_dsctoglobal = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 99;BA.debugLine="Private Hay_Descuentos_Globales As Boolean";
_hay_descuentos_globales = false;
 //BA.debugLineNum = 101;BA.debugLine="Private Btn_ListaPrecio As Button";
mostCurrent._btn_listaprecio = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
mostCurrent._searchtemplate = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 104;BA.debugLine="Private DespSimple_DocDestino As B4XSearchTemplat";
mostCurrent._despsimple_docdestino = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 105;BA.debugLine="Private DespSimple_Tipo As B4XSearchTemplate";
mostCurrent._despsimple_tipo = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 106;BA.debugLine="Private DespSimple_TipoPago As B4XSearchTemplate";
mostCurrent._despsimple_tipopago = new BaKapp.Movil.Tag.b4xsearchtemplate();
 //BA.debugLineNum = 108;BA.debugLine="Private Lbl_Lista_Precios As Label";
mostCurrent._lbl_lista_precios = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
mostCurrent._cl_permisox = new BaKapp.Movil.Tag.cl_permisoxui();
 //BA.debugLineNum = 111;BA.debugLine="Private B4A_DespachoSimple As Boolean";
_b4a_despachosimple = false;
 //BA.debugLineNum = 113;BA.debugLine="Private Lbl_TipoDespacho As Label";
mostCurrent._lbl_tipodespacho = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Private Lbl_TipoPagoDesp As Label";
mostCurrent._lbl_tipopagodesp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Private Lbl_CodDocDestino As Label";
mostCurrent._lbl_coddocdestino = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Private Txt_DireccionDesp As EditText";
mostCurrent._txt_direcciondesp = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Private Txt_TransporteDesp As EditText";
mostCurrent._txt_transportedesp = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 118;BA.debugLine="Private Txt_ObservacionesDesp As EditText";
mostCurrent._txt_observacionesdesp = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Private Btn_TipoDespachoSimple As Button";
mostCurrent._btn_tipodespachosimple = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 120;BA.debugLine="Private Btn_TipoPagoDesp As Button";
mostCurrent._btn_tipopagodesp = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Private Btn_CodDocDestino As Button";
mostCurrent._btn_coddocdestino = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 123;BA.debugLine="Private bmp1 As Bitmap";
mostCurrent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 124;BA.debugLine="Private bmp2 As Bitmap";
mostCurrent._bmp2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 126;BA.debugLine="Private Lbl_DireccionDesp As Label";
mostCurrent._lbl_direcciondesp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Private Lbl_TransporteDesp As Label";
mostCurrent._lbl_transportedesp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Private Lbl_ObservacionesDesp As Label";
mostCurrent._lbl_observacionesdesp = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Private Lbl_Observaciones As Label";
mostCurrent._lbl_observaciones = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Dim BuscandoProducto As Boolean";
_buscandoproducto = false;
 //BA.debugLineNum = 132;BA.debugLine="Dim BuscandoEntidad As Boolean";
_buscandoentidad = false;
 //BA.debugLineNum = 133;BA.debugLine="Dim EditandoProducto As Boolean";
_editandoproducto = false;
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public static void  _label11_longclick() throws Exception{
ResumableSub_Label11_LongClick rsub = new ResumableSub_Label11_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Label11_LongClick extends BA.ResumableSub {
public ResumableSub_Label11_LongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
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
 //BA.debugLineNum = 3700;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3701;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3702;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3704;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 3706;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3707;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3708;BA.debugLine="Dialog.Title = \"Orden de compra\"";
_dialog._title /*Object*/  = (Object)("Orden de compra");
 //BA.debugLineNum = 3710;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de orden de";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Número de orden de compra"));
 //BA.debugLineNum = 3711;BA.debugLine="InputTemplate.Text = Txt_Orden_compra.Text";
parent.mostCurrent._inputtemplate._text /*String*/  = parent.mostCurrent._txt_orden_compra.getText();
 //BA.debugLineNum = 3713;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3714;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3715;BA.debugLine="Txt_Orden_compra.Text = InputTemplate.Text";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent.mostCurrent._inputtemplate._text /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 3718;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _label12_longclick() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
 //BA.debugLineNum = 3674;BA.debugLine="Private Sub Label12_LongClick";
 //BA.debugLineNum = 3676;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3677;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3678;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3680;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3681;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3682;BA.debugLine="Dialog.Title = \"Observaciones\"";
_dialog._title /*Object*/  = (Object)("Observaciones");
 //BA.debugLineNum = 3684;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextBackg";
mostCurrent._longtexttemplate._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
 //BA.debugLineNum = 3685;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextColor";
mostCurrent._longtexttemplate._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = _xui.Color_Black;
 //BA.debugLineNum = 3686;BA.debugLine="LongTextTemplate.Text = Txt_Observaciones.Text";
mostCurrent._longtexttemplate._text /*Object*/  = (Object)(mostCurrent._txt_observaciones.getText());
 //BA.debugLineNum = 3688;BA.debugLine="Dialog.ShowTemplate(LongTextTemplate, \"OK\", \"\", \"";
_dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(mostCurrent._longtexttemplate),(Object)("OK"),(Object)(""),(Object)(""));
 //BA.debugLineNum = 3694;BA.debugLine="End Sub";
return "";
}
public static void  _lbl_lista_precios_longclick() throws Exception{
ResumableSub_Lbl_Lista_Precios_LongClick rsub = new ResumableSub_Lbl_Lista_Precios_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Lbl_Lista_Precios_LongClick extends BA.ResumableSub {
public ResumableSub_Lbl_Lista_Precios_LongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
boolean _rst = false;
int _result = 0;
String _kolt = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3634;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3635;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3636;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3638;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Bkp00009"));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 3640;BA.debugLine="If Not(Rst) Then";
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
 //BA.debugLineNum = 3641;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 3644;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 3646;BA.debugLine="Msgbox2Async(\"¿desea cambiar la lista de precios";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿desea cambiar la lista de precios "+parent.mostCurrent._searchtemplate._selecteditem /*String*/ +"?"),BA.ObjectToCharSequence("Cambiar lista"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3647;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3649;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result!=_xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 3650;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 3653;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3654;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3655;BA.debugLine="Dialog.Title = \"Listas de precios autorizadas\"";
_dialog._title /*Object*/  = (Object)("Listas de precios autorizadas");
 //BA.debugLineNum = 3657;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplate, \"\",";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3658;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 9:
//if
this.state = 16;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 3660;BA.debugLine="Msgbox2Async(\"¿Confirma utilizar la lista \" & Se";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma utilizar la lista "+parent.mostCurrent._searchtemplate._selecteditem /*String*/ +"?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3661;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 12;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3663;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 3664;BA.debugLine="Lbl_Lista_Precios.Text = SearchTemplate.Selecte";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
 //BA.debugLineNum = 3665;BA.debugLine="Dim Kolt As String = Funciones.Mid(Lbl_Lista_Pr";
_kolt = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_lista_precios.getText(),(int) (1),(int) (3));
 //BA.debugLineNum = 3666;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_kolt));
 //BA.debugLineNum = 3667;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 3672;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Public Id_DocEnc As Int";
_id_docenc = 0;
 //BA.debugLineNum = 12;BA.debugLine="Public Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Public Fila_Encabezado As Map";
_fila_encabezado = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Public Fila_Observaciones As Map";
_fila_observaciones = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Public Fila_DespaFacil As Map";
_fila_despafacil = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Public Cambiar_Entidad As Boolean";
_cambiar_entidad = false;
 //BA.debugLineNum = 19;BA.debugLine="Public Crear_NVV_Desde_COV As Boolean";
_crear_nvv_desde_cov = false;
 //BA.debugLineNum = 20;BA.debugLine="Public Nuevo_Documento As Boolean";
_nuevo_documento = false;
 //BA.debugLineNum = 21;BA.debugLine="Public Editar_Documento As Boolean";
_editar_documento = false;
 //BA.debugLineNum = 22;BA.debugLine="Public Idmaeedo_Origen As Int";
_idmaeedo_origen = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public Nudo_Origen As String";
_nudo_origen = "";
 //BA.debugLineNum = 24;BA.debugLine="Public TipoDoc As String";
_tipodoc = "";
 //BA.debugLineNum = 25;BA.debugLine="Public Grabar As Boolean";
_grabar = false;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static void  _sb_actualizar_datos_de_la_entidad(anywheresoftware.b4a.objects.collections.Map _rowentidad,boolean _revisar_permiso_lista_precio,boolean _aplicar_venciminetos,boolean _actualizarlistaprecio) throws Exception{
ResumableSub_Sb_Actualizar_Datos_De_La_Entidad rsub = new ResumableSub_Sb_Actualizar_Datos_De_La_Entidad(null,_rowentidad,_revisar_permiso_lista_precio,_aplicar_venciminetos,_actualizarlistaprecio);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Actualizar_Datos_De_La_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Actualizar_Datos_De_La_Entidad(BaKapp.Movil.Tag.frm_post_01_formulario parent,anywheresoftware.b4a.objects.collections.Map _rowentidad,boolean _revisar_permiso_lista_precio,boolean _aplicar_venciminetos,boolean _actualizarlistaprecio) {
this.parent = parent;
this._rowentidad = _rowentidad;
this._revisar_permiso_lista_precio = _revisar_permiso_lista_precio;
this._aplicar_venciminetos = _aplicar_venciminetos;
this._actualizarlistaprecio = _actualizarlistaprecio;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.collections.Map _rowentidad;
boolean _revisar_permiso_lista_precio;
boolean _aplicar_venciminetos;
boolean _actualizarlistaprecio;
long _fechaemision = 0L;
long _fecha_1er_vencimiento = 0L;
long _fechaultvencimiento = 0L;
long _fecharecepcion = 0L;
int _cuotas = 0;
int _dias_1er_vencimiento = 0;
int _dias_vencimiento = 0;
String _forma_pago = "";
String _lista = "";
String _permiso = "";
String _listaprecios = "";
String _rut = "";
long _fechasvenci = 0L;
int _dias = 0;
int _i = 0;
boolean _tiene_permiso_lista = false;
boolean _cambiar_lista = false;
boolean _mostrar_mensaje_cambio_lista = false;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _value = "";
String _kolt = "";
String _nokolt = "";
boolean _bloqueado = false;
String _secueven = "";
BaKapp.Movil.Tag.tidonudo _vtidonudo = null;
boolean _res = false;
int step50;
int limit50;
int step81;
int limit81;
int step100;
int limit100;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1995;BA.debugLine="ProgressDialogShow(\"Actualizando datos de la enti";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando datos de la entidad..."));
 //BA.debugLineNum = 1997;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 1999;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 2000;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
 //BA.debugLineNum = 2001;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
 //BA.debugLineNum = 2002;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
 //BA.debugLineNum = 2004;BA.debugLine="Dim Cuotas As Int = 1";
_cuotas = (int) (1);
 //BA.debugLineNum = 2005;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
 //BA.debugLineNum = 2006;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
 //BA.debugLineNum = 2007;BA.debugLine="Dim Forma_pago As String";
_forma_pago = "";
 //BA.debugLineNum = 2009;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 2010;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 2011;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
parent._fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 2012;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
parent._fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 2013;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 2015;BA.debugLine="Dim Lista As String";
_lista = "";
 //BA.debugLineNum = 2016;BA.debugLine="Dim Permiso As String";
_permiso = "";
 //BA.debugLineNum = 2018;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
_listaprecios = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 2019;BA.debugLine="Lista = ListaPrecios";
_lista = _listaprecios;
 //BA.debugLineNum = 2021;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
_cuotas = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("NUVECR"))));
 //BA.debugLineNum = 2022;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
_dias_1er_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIPRVE"))));
 //BA.debugLineNum = 2023;BA.debugLine="Dias_Vencimiento = Funciones.Fx_NuloPorNro(RowEnt";
_dias_vencimiento = (int)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,_rowentidad.Get((Object)("DIASVENCI")),0)));
 //BA.debugLineNum = 2025;BA.debugLine="Dim Rut As String";
_rut = "";
 //BA.debugLineNum = 2027;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),_rowentidad.Get((Object)("KOEN")));
 //BA.debugLineNum = 2028;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),_rowentidad.Get((Object)("SUEN")));
 //BA.debugLineNum = 2029;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),_rowentidad.Get((Object)("NOKOEN")));
 //BA.debugLineNum = 2031;BA.debugLine="Lbl_CodEntidad.Text = RowEntidad.Get(\"KOEN\")";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("KOEN"))));
 //BA.debugLineNum = 2032;BA.debugLine="Lbl_CodSucEntidad.Text = RowEntidad.Get(\"SUEN\")";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("SUEN"))));
 //BA.debugLineNum = 2033;BA.debugLine="Lbl_Rut.Text = RowEntidad.Get(\"Rut\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("Rut"))));
 //BA.debugLineNum = 2034;BA.debugLine="Lbl_Nombre.Text = RowEntidad.Get(\"NOKOEN\")";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("NOKOEN"))));
 //BA.debugLineNum = 2035;BA.debugLine="Lbl_Direccion.Text = RowEntidad.Get(\"DIEN\")";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("DIEN"))));
 //BA.debugLineNum = 2036;BA.debugLine="Lbl_Ciudad.Text = RowEntidad.Get(\"CIUDAD\")";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("CIUDAD"))));
 //BA.debugLineNum = 2037;BA.debugLine="Lbl_Comuna.Text = RowEntidad.Get(\"COMUNA\")";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("COMUNA"))));
 //BA.debugLineNum = 2039;BA.debugLine="If ActualizarListaPrecio Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_actualizarlistaprecio) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2040;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
_lista = BA.ObjectToString(_rowentidad.Get((Object)("LVEN")));
 //BA.debugLineNum = 2041;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
_lista = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,_lista,(int) (6),(int) (3));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 2044;BA.debugLine="Permiso = \"Lp-\" & Lista";
_permiso = "Lp-"+_lista;
 //BA.debugLineNum = 2046;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
if (true) break;

case 5:
//if
this.state = 10;
if (_cuotas==0) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
_cuotas = (int) (1);
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 2048;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
if (true) break;

case 11:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(_aplicar_venciminetos)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 2049;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 if (true) break;
;
 //BA.debugLineNum = 2052;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";

case 14:
//if
this.state = 33;
if (_dias_1er_vencimiento>0) { 
this.state = 16;
}else {
this.state = 32;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 2054;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
 //BA.debugLineNum = 2055;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
 //BA.debugLineNum = 2057;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
_fechasvenci = _fechaemision;
 //BA.debugLineNum = 2058;BA.debugLine="Dim dias As Int";
_dias = 0;
 //BA.debugLineNum = 2060;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (true) break;

case 17:
//if
this.state = 30;
if (_dias_1er_vencimiento>0) { 
this.state = 19;
}else {
this.state = 29;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 2062;BA.debugLine="dias = Dias_1er_Vencimiento";
_dias = _dias_1er_vencimiento;
 //BA.debugLineNum = 2064;BA.debugLine="For i = 1 To Cuotas";
if (true) break;

case 20:
//for
this.state = 27;
step50 = 1;
limit50 = _cuotas;
_i = (int) (1) ;
this.state = 69;
if (true) break;

case 69:
//C
this.state = 27;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 22;
if (true) break;

case 70:
//C
this.state = 69;
_i = ((int)(0 + _i + step50)) ;
if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 2066;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
_fechasvenci = anywheresoftware.b4a.keywords.Common.DateTime.Add(_fechasvenci,(int) (0),(int) (0),_dias);
 //BA.debugLineNum = 2067;BA.debugLine="If i = 1 Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_i==1) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 2068;BA.debugLine="Fecha_1er_Vencimiento = FechasVenci";
_fecha_1er_vencimiento = _fechasvenci;
 if (true) break;

case 26:
//C
this.state = 70;
;
 //BA.debugLineNum = 2071;BA.debugLine="dias = Dias_Vencimiento";
_dias = _dias_vencimiento;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
;
 //BA.debugLineNum = 2075;BA.debugLine="FechaUltVencimiento = FechasVenci";
_fechaultvencimiento = _fechasvenci;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 2078;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
 if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 2083;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
 //BA.debugLineNum = 2084;BA.debugLine="FechaUltVencimiento = FechaEmision";
_fechaultvencimiento = _fechaemision;
 //BA.debugLineNum = 2085;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
 //BA.debugLineNum = 2086;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 //BA.debugLineNum = 2087;BA.debugLine="Dias_Vencimiento = 0";
_dias_vencimiento = (int) (0);
 if (true) break;

case 33:
//C
this.state = 34;
;
 //BA.debugLineNum = 2091;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
_forma_pago = BA.ObjectToString(_rowentidad.Get((Object)("CPEN")));
 //BA.debugLineNum = 2093;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
parent._fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
 //BA.debugLineNum = 2094;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
 //BA.debugLineNum = 2095;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
parent._fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
 //BA.debugLineNum = 2096;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
 //BA.debugLineNum = 2098;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
parent._fila_encabezado.Put((Object)("Cuotas"),(Object)(_cuotas));
 //BA.debugLineNum = 2099;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento"),(Object)(_dias_1er_vencimiento));
 //BA.debugLineNum = 2100;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento"),(Object)(_dias_vencimiento));
 //BA.debugLineNum = 2102;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
parent._fila_observaciones.Put((Object)("Forma_pago"),(Object)(_forma_pago));
 //BA.debugLineNum = 2104;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
if (true) break;

case 34:
//if
this.state = 53;
if (_revisar_permiso_lista_precio) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 2106;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean";
_tiene_permiso_lista = false;
 //BA.debugLineNum = 2107;BA.debugLine="Dim Cambiar_lista As Boolean";
_cambiar_lista = false;
 //BA.debugLineNum = 2108;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
_mostrar_mensaje_cambio_lista = false;
 //BA.debugLineNum = 2111;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
if (true) break;

case 37:
//for
this.state = 44;
step81 = 1;
limit81 = (int) (parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 71;
if (true) break;

case 71:
//C
this.state = 44;
if ((step81 > 0 && _i <= limit81) || (step81 < 0 && _i >= limit81)) this.state = 39;
if (true) break;

case 72:
//C
this.state = 71;
_i = ((int)(0 + _i + step81)) ;
if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 2112;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 2113;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
_value = BA.ObjectToString(_m.Get((Object)("Kolt")));
 //BA.debugLineNum = 2115;BA.debugLine="If Lista = value Then";
if (true) break;

case 40:
//if
this.state = 43;
if ((_lista).equals(_value)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 2116;BA.debugLine="Tiene_Permiso_Lista = True";
_tiene_permiso_lista = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 2117;BA.debugLine="Exit";
this.state = 44;
if (true) break;
 if (true) break;

case 43:
//C
this.state = 72;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 2122;BA.debugLine="If Tiene_Permiso_Lista Then";

case 44:
//if
this.state = 49;
if (_tiene_permiso_lista) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 //BA.debugLineNum = 2123;BA.debugLine="Cambiar_lista = True";
_cambiar_lista = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 2126;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 2128;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Usted no tiene permiso para trabajar con la lista: "+_lista+anywheresoftware.b4a.keywords.Common.CRLF+"La lista seguirá siendo:"+_listaprecios),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
 //BA.debugLineNum = 2133;BA.debugLine="If Cambiar_lista Then";

case 49:
//if
this.state = 52;
if (_cambiar_lista) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 //BA.debugLineNum = 2134;BA.debugLine="ListaPrecios = Lista";
_listaprecios = _lista;
 //BA.debugLineNum = 2135;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
 //BA.debugLineNum = 2140;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";

case 53:
//for
this.state = 60;
step100 = 1;
limit100 = (int) (parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 73;
if (true) break;

case 73:
//C
this.state = 60;
if ((step100 > 0 && _i <= limit100) || (step100 < 0 && _i >= limit100)) this.state = 55;
if (true) break;

case 74:
//C
this.state = 73;
_i = ((int)(0 + _i + step100)) ;
if (true) break;

case 55:
//C
this.state = 56;
 //BA.debugLineNum = 2142;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 2143;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
 //BA.debugLineNum = 2144;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
 //BA.debugLineNum = 2146;BA.debugLine="If Lista = Kolt Then";
if (true) break;

case 56:
//if
this.state = 59;
if ((_lista).equals(_kolt)) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 //BA.debugLineNum = 2147;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(_nokolt));
 //BA.debugLineNum = 2148;BA.debugLine="Exit";
this.state = 60;
if (true) break;
 if (true) break;

case 59:
//C
this.state = 74;
;
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
;
 //BA.debugLineNum = 2155;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
_bloqueado = BA.ObjectToBoolean(_rowentidad.Get((Object)("BLOQUEADO")));
 //BA.debugLineNum = 2157;BA.debugLine="If Bloqueado Then";
if (true) break;

case 61:
//if
this.state = 64;
if (_bloqueado) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 //BA.debugLineNum = 2159;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 2161;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡CLIENTE BLOQUEADO!"+anywheresoftware.b4a.keywords.Common.CRLF+"Solo es posible generar cotizaciones"),BA.ObjectToCharSequence("CLIENTE MOROSO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 64:
//C
this.state = 65;
;
 //BA.debugLineNum = 2166;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
 //BA.debugLineNum = 2167;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
 //BA.debugLineNum = 2168;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
 //BA.debugLineNum = 2170;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas"))));
 //BA.debugLineNum = 2171;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento"))));
 //BA.debugLineNum = 2172;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento"))));
 //BA.debugLineNum = 2174;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
 //BA.debugLineNum = 2176;BA.debugLine="If ActualizarListaPrecio And B4A_DespachoSimple T";
if (true) break;

case 65:
//if
this.state = 68;
if (_actualizarlistaprecio && parent._b4a_despachosimple) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 //BA.debugLineNum = 2178;BA.debugLine="Wait For(Sb_Trae_Secueven(Secueven)) Complete (v";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_trae_secueven(_secueven));
this.state = 75;
return;
case 75:
//C
this.state = 68;
_vtidonudo = (BaKapp.Movil.Tag.tidonudo) result[0];
;
 //BA.debugLineNum = 2180;BA.debugLine="Lbl_CodDocDestino.Tag = vTidoNudo.Tido";
parent.mostCurrent._lbl_coddocdestino.setTag((Object)(_vtidonudo._tido /*String*/ ));
 //BA.debugLineNum = 2181;BA.debugLine="Lbl_CodDocDestino.Text = vTidoNudo.Notido";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(_vtidonudo._notido /*String*/ ));
 //BA.debugLineNum = 2183;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 if (true) break;

case 68:
//C
this.state = -1;
;
 //BA.debugLineNum = 2187;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_visibleocultardespachosimple());
this.state = 76;
return;
case 76:
//C
this.state = -1;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 2189;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 2191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_buscar_dscto_x_cliente() throws Exception{
ResumableSub_Sb_Buscar_Dscto_X_Cliente rsub = new ResumableSub_Sb_Buscar_Dscto_X_Cliente(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Buscar_Dscto_X_Cliente extends BA.ResumableSub {
public ResumableSub_Sb_Buscar_Dscto_X_Cliente(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
String _koen = "";
String _suen = "";
double _descuentoporc = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;
boolean _tienedsctoespecial = false;
String _error = "";
Object _sf = null;
int _result = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
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
 //BA.debugLineNum = 3372;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3374;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
_koen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad".toLowerCase())));
 //BA.debugLineNum = 3375;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
_suen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad".toLowerCase())));
 //BA.debugLineNum = 3377;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
 //BA.debugLineNum = 3379;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 //BA.debugLineNum = 3381;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_descuento_global_x_cliente /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_koen,_suen);
 //BA.debugLineNum = 3382;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3384;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 37;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3386;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3387;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 36;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 3389;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 3391;BA.debugLine="Dim TieneDsctoEspecial As Boolean = Fila.Get(\"T";
_tienedsctoespecial = BA.ObjectToBoolean(_fila.Get((Object)("TieneDsctoEspecial")));
 //BA.debugLineNum = 3392;BA.debugLine="Dim Error As String = Fila.Get(\"Error\")";
_error = BA.ObjectToString(_fila.Get((Object)("Error")));
 //BA.debugLineNum = 3393;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("Descuento"))));
 //BA.debugLineNum = 3405;BA.debugLine="If TieneDsctoEspecial = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_tienedsctoespecial==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3406;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 3409;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 3415;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma el descuento adicional de un "+BA.NumberToString(_descuentoporc)+"%?"),BA.ObjectToCharSequence("Descuento global adicional"),"Confirmar","Cancelar","Ingresar otro dscto.",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 3417;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 39;
return;
case 39:
//C
this.state = 11;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3419;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_result==_xui.DialogResponse_Cancel) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 3420;BA.debugLine="Return -1";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(-1));return;};
 if (true) break;
;
 //BA.debugLineNum = 3423;BA.debugLine="If Result = xui.DialogResponse_Negative Then";

case 14:
//if
this.state = 35;
if (_result==_xui.DialogResponse_Negative) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 3425;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3426;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3428;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3429;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3431;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese descuen";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese descuento. Max "+BA.NumberToString(_descuentoporc)+"%"));
 //BA.debugLineNum = 3432;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 3433;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
parent.mostCurrent._inputtemplate._configurefornumbers /*String*/ (anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3435;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3436;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 17:
//if
this.state = 34;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 19;
}else {
this.state = 33;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 3437;BA.debugLine="Try";
if (true) break;

case 20:
//try
this.state = 31;
this.catchState = 30;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 30;
 //BA.debugLineNum = 3438;BA.debugLine="Dim NewDescuentoPorc As Double = InputTempla";
_newdescuentoporc = (double)(Double.parseDouble(parent.mostCurrent._inputtemplate._text /*String*/ ));
 //BA.debugLineNum = 3440;BA.debugLine="If NewDescuentoPorc > DescuentoPorc Then";
if (true) break;

case 23:
//if
this.state = 28;
if (_newdescuentoporc>_descuentoporc) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 3441;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-c";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3442;BA.debugLine="Msgbox2Async(\"El descuento no puede ser may";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El descuento no puede ser mayor a un "+BA.NumberToString(_descuentoporc)+"%"+anywheresoftware.b4a.keywords.Common.CRLF+"Debe ingresar un código de autorización"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3444;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 41;
return;
case 41:
//C
this.state = 28;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3445;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 3447;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
_descuentoporc = _newdescuentoporc;
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
 //BA.debugLineNum = 3451;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("044171347",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 //BA.debugLineNum = 3452;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3453;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3454;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 42;
return;
case 42:
//C
this.state = 31;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3455;BA.debugLine="DescuentoPorc = -1";
_descuentoporc = -1;
 if (true) break;
if (true) break;

case 31:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 3458;BA.debugLine="DescuentoPorc = -1";
_descuentoporc = -1;
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
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 //BA.debugLineNum = 3467;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 //BA.debugLineNum = 3469;BA.debugLine="End Sub";
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
public static void  _sb_cargar_detalle(boolean _cargar_activity) throws Exception{
ResumableSub_Sb_Cargar_Detalle rsub = new ResumableSub_Sb_Cargar_Detalle(null,_cargar_activity);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Cargar_Detalle extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Detalle(BaKapp.Movil.Tag.frm_post_01_formulario parent,boolean _cargar_activity) {
this.parent = parent;
this._cargar_activity = _cargar_activity;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _cargar_activity;
boolean _res = false;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _rownumber = 0;
String _itemstr = "";
String _codigo = "";
String _descripcion = "";
String _cantidad = "";
String _udtrans = "";
String _tict = "";
int _prct = 0;
String _precio = "";
String _descuentoporc = "";
String _valnetolinea = "";
String _bodega = "";
int _item = 0;
String _datos = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int step19;
int limit19;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 527;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_titulo());
this.state = 28;
return;
case 28:
//C
this.state = 1;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 529;BA.debugLine="If Cargar_Activity Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_cargar_activity) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 530;BA.debugLine="If Frm_Post_01_Producto.Id_DocDet <> 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/ !=0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 531;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 //BA.debugLineNum = 532;BA.debugLine="Return";
if (true) return ;
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
 //BA.debugLineNum = 536;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 537;BA.debugLine="XclvDetalle.DefaultTextBackgroundColor = Colors.T";
parent.mostCurrent._xclvdetalle._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
 //BA.debugLineNum = 538;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
 //BA.debugLineNum = 539;BA.debugLine="Private Row As Int";
_row = 0;
 //BA.debugLineNum = 540;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 542;BA.debugLine="IDList.Initialize";
parent.mostCurrent._idlist.Initialize();
 //BA.debugLineNum = 544;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
 //BA.debugLineNum = 545;BA.debugLine="Dim ItemStr As String";
_itemstr = "";
 //BA.debugLineNum = 547;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea,Bodega "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 550;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (true) break;

case 9:
//if
this.state = 27;
if (_cursor1.getRowCount()>0) { 
this.state = 11;
}else {
this.state = 26;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 552;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
 //BA.debugLineNum = 554;BA.debugLine="For Row = 0 To RowNumber - 1";
if (true) break;

case 12:
//for
this.state = 24;
step19 = 1;
limit19 = (int) (_rownumber-1);
_row = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 24;
if ((step19 > 0 && _row <= limit19) || (step19 < 0 && _row >= limit19)) this.state = 14;
if (true) break;

case 30:
//C
this.state = 29;
_row = ((int)(0 + _row + step19)) ;
if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 556;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
 //BA.debugLineNum = 557;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
parent.mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
 //BA.debugLineNum = 559;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
parent._id_docdet = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDet")));
 //BA.debugLineNum = 560;BA.debugLine="Dim Codigo As String = Cursor1.GetString(\"Codig";
_codigo = _cursor1.GetString("Codigo");
 //BA.debugLineNum = 561;BA.debugLine="Dim Descripcion As String = Cursor1.GetString(\"";
_descripcion = _cursor1.GetString("Descripcion");
 //BA.debugLineNum = 563;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cursor1";
_cantidad = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("Cantidad"))),(int) (0),(int) (2));
 //BA.debugLineNum = 564;BA.debugLine="Dim UdTrans As String = Cursor1.GetString(\"UdTr";
_udtrans = _cursor1.GetString("UdTrans");
 //BA.debugLineNum = 565;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
_tict = _cursor1.GetString("Tict");
 //BA.debugLineNum = 566;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
_prct = (int)(Double.parseDouble(_cursor1.GetString("Prct")));
 //BA.debugLineNum = 567;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Cu";
_precio = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("Precio"))),(int) (0),(int) (2));
 //BA.debugLineNum = 568;BA.debugLine="Dim descuentoporc As String = NumberFormat(Curs";
_descuentoporc = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("DescuentoPorc"))),(int) (0),(int) (2));
 //BA.debugLineNum = 569;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForm";
_valnetolinea = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("ValNetoLinea"))),(int) (0),(int) (0));
 //BA.debugLineNum = 570;BA.debugLine="Dim Bodega As String = Cursor1.GetString(\"Bodeg";
_bodega = _cursor1.GetString("Bodega");
 //BA.debugLineNum = 572;BA.debugLine="If Descripcion.Length > 35 Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_descripcion.length()>35) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 573;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
_descripcion = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,_descripcion,(int) (1),(int) (35));
 if (true) break;
;
 //BA.debugLineNum = 576;BA.debugLine="If Cursor1.GetString(\"DescuentoPorc\") = 0 Then";

case 18:
//if
this.state = 23;
if ((_cursor1.GetString("DescuentoPorc")).equals(BA.NumberToString(0))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 //BA.debugLineNum = 577;BA.debugLine="descuentoporc = \"\"";
_descuentoporc = "";
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 579;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
_descuentoporc = " -%."+_descuentoporc+" ";
 if (true) break;

case 23:
//C
this.state = 30;
;
 //BA.debugLineNum = 582;BA.debugLine="Dim Item As Int = Row+1";
_item = (int) (_row+1);
 //BA.debugLineNum = 583;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item),(int) (2),"0");
 //BA.debugLineNum = 585;BA.debugLine="Dim Datos As String = \"Cant. \" & UdTrans & \" \"";
_datos = "Cant. "+_udtrans+" "+_cantidad+" X "+_precio+_descuentoporc+anywheresoftware.b4a.keywords.Common.CRLF+"Total: "+_valnetolinea+".-		Bod: "+_bodega;
 //BA.debugLineNum = 587;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
 //BA.debugLineNum = 589;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
 //BA.debugLineNum = 590;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
_p.LoadLayout("Items_Detalle",mostCurrent.activityBA);
 //BA.debugLineNum = 591;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 593;BA.debugLine="Lbl_Codigo.Tag = Id_DocDet";
parent.mostCurrent._lbl_codigo.setTag((Object)(parent._id_docdet));
 //BA.debugLineNum = 594;BA.debugLine="Lbl_Codigo.Text = Codigo";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(_codigo));
 //BA.debugLineNum = 595;BA.debugLine="Lbl_Descripcion.Tag = Tict";
parent.mostCurrent._lbl_descripcion.setTag((Object)(_tict));
 //BA.debugLineNum = 596;BA.debugLine="Lbl_Descripcion.Text = Descripcion";
parent.mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(_descripcion));
 //BA.debugLineNum = 597;BA.debugLine="Lbl_Item.Tag = Prct";
parent.mostCurrent._lbl_item.setTag((Object)(_prct));
 //BA.debugLineNum = 598;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
parent.mostCurrent._lbl_item.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
 //BA.debugLineNum = 599;BA.debugLine="Lbl_Datos.Text = Datos";
parent.mostCurrent._lbl_datos.setText(BA.ObjectToCharSequence(_datos));
 //BA.debugLineNum = 607;BA.debugLine="XclvDetalle.Add(p,\"\")";
parent.mostCurrent._xclvdetalle._add(_p,(Object)(""));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 612;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 27:
//C
this.state = -1;
;
 //BA.debugLineNum = 615;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 617;BA.debugLine="Sb_Sumar_Totales";
_sb_sumar_totales();
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_documento(boolean _nuevo_doc) throws Exception{
ResumableSub_Sb_Cargar_Documento rsub = new ResumableSub_Sb_Cargar_Documento(null,_nuevo_doc);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Cargar_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Documento(BaKapp.Movil.Tag.frm_post_01_formulario parent,boolean _nuevo_doc) {
this.parent = parent;
this._nuevo_doc = _nuevo_doc;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _nuevo_doc;
boolean _fin = false;
String _listaprecios = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _kolt = "";
String _nokolt = "";
boolean _res = false;
int step60;
int limit60;

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
 //BA.debugLineNum = 302;BA.debugLine="If Nuevo_Doc Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_nuevo_doc) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 304;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
 //BA.debugLineNum = 305;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 308;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 309;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 313;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
parent._id_docenc = (int)(BA.ObjectToNumber(parent._fila_encabezado.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 316;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 317;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 320;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 321;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 323;BA.debugLine="If Not(Fila_Observaciones.IsInitialized)  Then";
if (true) break;

case 7:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.Not(parent._fila_observaciones.IsInitialized())) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 326;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (I";
parent.mostCurrent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
 //BA.debugLineNum = 327;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
 //BA.debugLineNum = 330;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 331;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variable";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 335;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
parent.mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("observaciones"))));
 //BA.debugLineNum = 336;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("orden_compra"))));
 //BA.debugLineNum = 339;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 340;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 342;BA.debugLine="If Not(Fila_DespaFacil.IsInitialized)  Then";
if (true) break;

case 11:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(parent._fila_despafacil.IsInitialized())) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 344;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
parent.mostCurrent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
 //BA.debugLineNum = 345;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
 //BA.debugLineNum = 347;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 348;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;
;
 //BA.debugLineNum = 352;BA.debugLine="If B4A_DespachoSimple Then";

case 14:
//if
this.state = 17;
if (parent._b4a_despachosimple) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 354;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodT";
parent.mostCurrent._lbl_tipodespacho.setTag(parent._fila_despafacil.Get((Object)("CodTipoDespacho".toLowerCase())));
 //BA.debugLineNum = 355;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tip";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoDespacho".toLowerCase()))));
 //BA.debugLineNum = 357;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"Cod";
parent.mostCurrent._lbl_tipopagodesp.setTag(parent._fila_despafacil.Get((Object)("CodTipoPagoDesp".toLowerCase())));
 //BA.debugLineNum = 358;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tip";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoPagoDesp".toLowerCase()))));
 //BA.debugLineNum = 360;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Co";
parent.mostCurrent._lbl_coddocdestino.setTag(parent._fila_despafacil.Get((Object)("CodDocDestino".toLowerCase())));
 //BA.debugLineNum = 361;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Do";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DocDestino".toLowerCase()))));
 //BA.debugLineNum = 363;BA.debugLine="Txt_TransporteDesp.Text =  Fila_DespaFacil.Get(\"";
parent.mostCurrent._txt_transportedesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TransporteDesp".toLowerCase()))));
 //BA.debugLineNum = 364;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"D";
parent.mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DireccionDesp".toLowerCase()))));
 //BA.debugLineNum = 365;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get";
parent.mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("ObservacionesDesp".toLowerCase()))));
 if (true) break;

case 17:
//C
this.state = 18;
;
 //BA.debugLineNum = 369;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("042074181","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
 //BA.debugLineNum = 371;BA.debugLine="Wait For (Sb_Cargar_Entidad(Editar_Documento)) Co";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_cargar_entidad(parent._editar_documento));
this.state = 37;
return;
case 37:
//C
this.state = 18;
_fin = (Boolean) result[0];
;
 //BA.debugLineNum = 373;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent._row_entidad.IsInitialized()) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 //BA.debugLineNum = 375;BA.debugLine="Lbl_CodEntidad.Text = Row_Entidad.Get(\"KOEN\")";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("KOEN"))));
 //BA.debugLineNum = 376;BA.debugLine="Lbl_CodSucEntidad.Text = Row_Entidad.Get(\"SUEN\")";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("SUEN"))));
 //BA.debugLineNum = 377;BA.debugLine="Lbl_Rut.Text = Row_Entidad.Get(\"Rut\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("Rut"))));
 //BA.debugLineNum = 378;BA.debugLine="Lbl_Nombre.Text = Row_Entidad.Get(\"NOKOEN\")";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("NOKOEN"))));
 //BA.debugLineNum = 379;BA.debugLine="Lbl_Direccion.Text = Row_Entidad.Get(\"DIEN\")";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("DIEN"))));
 //BA.debugLineNum = 380;BA.debugLine="Lbl_Ciudad.Text = Row_Entidad.Get(\"CIUDAD\")";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("CIUDAD"))));
 //BA.debugLineNum = 381;BA.debugLine="Lbl_Comuna.Text = Row_Entidad.Get(\"COMUNA\")";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("COMUNA"))));
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 385;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 386;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 387;BA.debugLine="Lbl_Rut.Text = \"\"";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 388;BA.debugLine="Lbl_Nombre.Text = \"\"";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 389;BA.debugLine="Lbl_Direccion.Text = \"\"";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 390;BA.debugLine="Lbl_Ciudad.Text = \"\"";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 391;BA.debugLine="Lbl_Comuna.Text = \"\"";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 23:
//C
this.state = 24;
;
 //BA.debugLineNum = 395;BA.debugLine="Dim ListaPrecios As String = Fila_Encabezado.Get(";
_listaprecios = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 397;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
if (true) break;

case 24:
//for
this.state = 31;
step60 = 1;
limit60 = (int) (parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 31;
if ((step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60)) this.state = 26;
if (true) break;

case 39:
//C
this.state = 38;
_i = ((int)(0 + _i + step60)) ;
if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 399;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 400;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
 //BA.debugLineNum = 401;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
 //BA.debugLineNum = 403;BA.debugLine="If ListaPrecios = Kolt Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((_listaprecios).equals(_kolt)) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 404;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(_nokolt));
 //BA.debugLineNum = 405;BA.debugLine="Exit";
this.state = 31;
if (true) break;
 if (true) break;

case 30:
//C
this.state = 39;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 410;BA.debugLine="Try";

case 31:
//try
this.state = 36;
this.catchState = 35;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 36;
this.catchState = 35;
 //BA.debugLineNum = 412;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encab";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fechaemision".toLowerCase()))))));
 //BA.debugLineNum = 413;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(F";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
 //BA.debugLineNum = 414;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fil";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
 if (true) break;

case 35:
//C
this.state = 36;
this.catchState = 0;
 //BA.debugLineNum = 416;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("042074228",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 419;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\".To";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas".toLowerCase()))));
 //BA.debugLineNum = 420;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento".toLowerCase()))));
 //BA.debugLineNum = 421;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento".toLowerCase()))));
 //BA.debugLineNum = 423;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_visibleocultardespachosimple());
this.state = 40;
return;
case 40:
//C
this.state = -1;
_res = (Boolean) result[0];
;
 //BA.debugLineNum = 426;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
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
public static void  _sb_cargar_documento2() throws Exception{
ResumableSub_Sb_Cargar_Documento2 rsub = new ResumableSub_Sb_Cargar_Documento2(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Cargar_Documento2 extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Documento2(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _fin = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 433;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 434;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 440;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 441;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 444;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 445;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 447;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
parent.mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("observaciones"))));
 //BA.debugLineNum = 448;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("orden_compra"))));
 //BA.debugLineNum = 452;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 453;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 455;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodTi";
parent.mostCurrent._lbl_tipodespacho.setTag(parent._fila_despafacil.Get((Object)("CodTipoDespacho".toLowerCase())));
 //BA.debugLineNum = 456;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tipo";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoDespacho".toLowerCase()))));
 //BA.debugLineNum = 458;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"CodT";
parent.mostCurrent._lbl_tipopagodesp.setTag(parent._fila_despafacil.Get((Object)("CodTipoPagoDesp".toLowerCase())));
 //BA.debugLineNum = 459;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tipo";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoPagoDesp".toLowerCase()))));
 //BA.debugLineNum = 461;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Cod";
parent.mostCurrent._lbl_coddocdestino.setTag(parent._fila_despafacil.Get((Object)("CodDocDestino".toLowerCase())));
 //BA.debugLineNum = 462;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Doc";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DocDestino".toLowerCase()))));
 //BA.debugLineNum = 464;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"Di";
parent.mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DireccionDesp".toLowerCase()))));
 //BA.debugLineNum = 465;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get(";
parent.mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("ObservacionesDesp".toLowerCase()))));
 //BA.debugLineNum = 467;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("042139685","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
 //BA.debugLineNum = 469;BA.debugLine="Wait For (Sb_Cargar_Entidad(False)) Complete (Fin";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_cargar_entidad(anywheresoftware.b4a.keywords.Common.False));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_fin = (Boolean) result[0];
;
 //BA.debugLineNum = 473;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encabe";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fechaemision".toLowerCase()))))));
 //BA.debugLineNum = 474;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
 //BA.debugLineNum = 475;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
 //BA.debugLineNum = 477;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas"))));
 //BA.debugLineNum = 478;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento"))));
 //BA.debugLineNum = 479;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento"))));
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_entidad(boolean _actualizardatos) throws Exception{
ResumableSub_Sb_Cargar_Entidad rsub = new ResumableSub_Sb_Cargar_Entidad(null,_actualizardatos);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Cargar_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Entidad(BaKapp.Movil.Tag.frm_post_01_formulario parent,boolean _actualizardatos) {
this.parent = parent;
this._actualizardatos = _actualizardatos;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _actualizardatos;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
String _koen = "";
String _suen = "";
String _nokoen = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

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
 //BA.debugLineNum = 485;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 487;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
_koen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad".toLowerCase())));
 //BA.debugLineNum = 488;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
_suen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad".toLowerCase())));
 //BA.debugLineNum = 489;BA.debugLine="Dim Nokoen As String = Fila_Encabezado.Get(\"Nombr";
_nokoen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("Nombre_Entidad".toLowerCase())));
 //BA.debugLineNum = 491;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_koen,_suen);
 //BA.debugLineNum = 493;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 495;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 497;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 499;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 501;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 502;BA.debugLine="Row_Entidad =Filas.Get(0)";
parent._row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 504;BA.debugLine="If ActualizarDatos Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_actualizardatos) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 505;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,";
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,anywheresoftware.b4a.keywords.Common.False,parent._editar_documento,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 10:
//C
this.state = 13;
;
 //BA.debugLineNum = 507;BA.debugLine="Log(\"Entidad cargada \" & Koen.Trim & \" - \" & No";
anywheresoftware.b4a.keywords.Common.LogImpl("042205208","Entidad cargada "+_koen.trim()+" - "+_nokoen,0);
 if (true) break;

case 12:
//C
this.state = 13;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 514;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("042205215",_js._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 517;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_cargar_idlist() throws Exception{
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _rownumber = 0;
 //BA.debugLineNum = 1630;BA.debugLine="Sub Sb_Cargar_IDList";
 //BA.debugLineNum = 1632;BA.debugLine="Private Row As Int";
_row = 0;
 //BA.debugLineNum = 1633;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 1635;BA.debugLine="IDList.Initialize";
mostCurrent._idlist.Initialize();
 //BA.debugLineNum = 1637;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
 //BA.debugLineNum = 1639;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc))));
 //BA.debugLineNum = 1641;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
 //BA.debugLineNum = 1642;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
 //BA.debugLineNum = 1643;BA.debugLine="IDList.Initialize";
mostCurrent._idlist.Initialize();
 //BA.debugLineNum = 1644;BA.debugLine="For Row = 0 To RowNumber - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rownumber-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
 //BA.debugLineNum = 1645;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
 //BA.debugLineNum = 1646;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
 }
};
 }else {
 //BA.debugLineNum = 1649;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 1652;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 1654;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_editar_documento() throws Exception{
ResumableSub_Sb_Editar_Documento rsub = new ResumableSub_Sb_Editar_Documento(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Editar_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Editar_Documento(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _result = 0;
String _tido = "";
boolean _cambiar_nrodocumento = false;
boolean _result2 = false;
boolean _rst = false;
String[] _array_encabezado = null;
anywheresoftware.b4a.objects.collections.Map _encabezado = null;
String[] _array_detalle = null;
anywheresoftware.b4a.objects.collections.Map _detalle = null;
String[] _array_descuentos = null;
anywheresoftware.b4a.objects.collections.Map _descuentos = null;
String[] _array_impuestos = null;
anywheresoftware.b4a.objects.collections.Map _impuestos = null;
String[] _array_observaciones = null;
anywheresoftware.b4a.objects.collections.Map _observaciones = null;
String[] _array_despafacil = null;
anywheresoftware.b4a.objects.collections.Map _despafacil = null;
String _json_encabezado = "";
String _json_detalle = "";
String _json_descuentos = "";
String _json_obseravciones = "";
String _json_despafacil = "";
anywheresoftware.b4a.objects.collections.List _encabezadojs = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
anywheresoftware.b4a.objects.collections.List _detallejs = null;
anywheresoftware.b4a.objects.collections.List _descuentosjs = null;
anywheresoftware.b4a.objects.collections.List _observacionesjs = null;
anywheresoftware.b4a.objects.collections.List _despafaciljs = null;
String _emailrandom = "";
String _para = "";
int _oldidmaeedo = 0;
String _codfuncionario = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _respuesta = null;
int _idmaeedo = 0;
String _error = "";
String _endo = "";
String _suendo = "";
String _nudo = "";
String _obseravacion = "";
String _nroocc = "";
boolean _errormailimp = false;
String _resultado = "";

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
 //BA.debugLineNum = 2698;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 2700;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_grabar_standby());
this.state = 79;
return;
case 79:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2702;BA.debugLine="If Result = 0 Then";
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
 //BA.debugLineNum = 2703;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2704;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe detalle en el documento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2705;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2708;BA.debugLine="If Result = 4 Then";

case 4:
//if
this.state = 9;
if (_result==4) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 2712;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2713;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence("Documento Stand-By"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2714;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 80;
return;
case 80:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2715;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 2718;BA.debugLine="Dim Tido As String = TipoDoc";
_tido = parent._tipodoc;
 //BA.debugLineNum = 2719;BA.debugLine="Dim Cambiar_NroDocumento As Boolean = False";
_cambiar_nrodocumento = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 2721;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)(_tido));
 //BA.debugLineNum = 2722;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 //BA.debugLineNum = 2724;BA.debugLine="If Tido = \"NVV\" Then";
if (true) break;

case 10:
//if
this.state = 21;
if ((_tido).equals("NVV")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 2726;BA.debugLine="Cambiar_NroDocumento = True";
_cambiar_nrodocumento = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 2728;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_recorrer_detalle_rev_stock());
this.state = 81;
return;
case 81:
//C
this.state = 13;
_result2 = (Boolean) result[0];
;
 //BA.debugLineNum = 2736;BA.debugLine="If Result2 = False Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_result2==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 2738;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Bkp00015"));
this.state = 82;
return;
case 82:
//C
this.state = 16;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 2740;BA.debugLine="If Not(Rst) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (anywheresoftware.b4a.keywords.Common.Not(_rst)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 2741;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 19:
//C
this.state = 20;
;
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
 //BA.debugLineNum = 2748;BA.debugLine="ProgressDialogShow(\"Actualizando el documento...\"";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando el documento..."));
 //BA.debugLineNum = 2751;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 2761;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
 //BA.debugLineNum = 2762;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2763;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
 //BA.debugLineNum = 2765;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
 //BA.debugLineNum = 2766;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2767;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
 //BA.debugLineNum = 2769;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
 //BA.debugLineNum = 2770;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2771;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
 //BA.debugLineNum = 2773;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
 //BA.debugLineNum = 2774;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2775;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
 //BA.debugLineNum = 2777;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
 //BA.debugLineNum = 2778;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2779;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
 //BA.debugLineNum = 2781;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
_array_despafacil = _generaarreglo("DespaFacil_Doc");
 //BA.debugLineNum = 2782;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2783;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
_despafacil = new anywheresoftware.b4a.objects.collections.Map();
_despafacil = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_despafacil));
 //BA.debugLineNum = 2785;BA.debugLine="Dim Json_Encabezado As String";
_json_encabezado = "";
 //BA.debugLineNum = 2786;BA.debugLine="Dim Json_Detalle As String";
_json_detalle = "";
 //BA.debugLineNum = 2787;BA.debugLine="Dim Json_Descuentos As String";
_json_descuentos = "";
 //BA.debugLineNum = 2788;BA.debugLine="Dim Json_Obseravciones As String";
_json_obseravciones = "";
 //BA.debugLineNum = 2789;BA.debugLine="Dim Json_DespaFacil As String";
_json_despafacil = "";
 //BA.debugLineNum = 2791;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2792;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
 //BA.debugLineNum = 2793;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
 //BA.debugLineNum = 2794;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2795;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
 //BA.debugLineNum = 2796;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
_json_encabezado = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2798;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2799;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
 //BA.debugLineNum = 2800;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
 //BA.debugLineNum = 2801;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2802;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
 //BA.debugLineNum = 2803;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
_json_detalle = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2805;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2806;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
 //BA.debugLineNum = 2807;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
 //BA.debugLineNum = 2808;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2809;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
 //BA.debugLineNum = 2810;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
_json_descuentos = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2812;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2813;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
 //BA.debugLineNum = 2814;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
 //BA.debugLineNum = 2815;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2816;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
 //BA.debugLineNum = 2817;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
_json_obseravciones = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2819;BA.debugLine="Dim DespaFaciljs As List";
_despafaciljs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2820;BA.debugLine="DespaFaciljs.Initialize";
_despafaciljs.Initialize();
 //BA.debugLineNum = 2821;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
_despafaciljs.Add((Object)(_despafacil.getObject()));
 //BA.debugLineNum = 2822;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2823;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
_jsongenerator.Initialize2(_despafaciljs);
 //BA.debugLineNum = 2824;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
_json_despafacil = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2826;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
_emailrandom = "EMAILCOMER";
 //BA.debugLineNum = 2827;BA.debugLine="Dim Para As String";
_para = "";
 //BA.debugLineNum = 2829;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
if (true) break;

case 22:
//if
this.state = 31;
if ((_emailrandom).equals("") == false && _emailrandom!= null) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 2830;BA.debugLine="Try";
if (true) break;

case 25:
//try
this.state = 30;
this.catchState = 29;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 30;
this.catchState = 29;
 //BA.debugLineNum = 2831;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
_para = BA.ObjectToString(parent._row_entidad.Get((Object)(_emailrandom)));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 //BA.debugLineNum = 2833;BA.debugLine="Para = \"\"";
_para = "";
 //BA.debugLineNum = 2834;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("043843724",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 2838;BA.debugLine="Dim OldIdmaeedo As Int = Idmaeedo_Origen";
_oldidmaeedo = parent._idmaeedo_origen;
 //BA.debugLineNum = 2839;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 2841;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Edi";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_editardocumentojsonbakapp2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_oldidmaeedo,_codfuncionario,_json_encabezado,_json_detalle,_json_descuentos,_json_obseravciones,_json_despafacil,_cambiar_nrodocumento);
 //BA.debugLineNum = 2850;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 83;
return;
case 83:
//C
this.state = 32;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 2852;BA.debugLine="If Js.Success Then";
if (true) break;

case 32:
//if
this.state = 78;
if (_js._success /*boolean*/ ) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 2854;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 2856;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 35:
//if
this.state = 77;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 37;
}else {
this.state = 76;
}if (true) break;

case 37:
//C
this.state = 38;
 //BA.debugLineNum = 2858;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 2860;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 2862;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
_idmaeedo = (int)(BA.ObjectToNumber(_respuesta.Get((Object)("Idmaeedo"))));
 //BA.debugLineNum = 2863;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
 //BA.debugLineNum = 2865;BA.debugLine="If Idmaeedo <> 0 Then";
if (true) break;

case 38:
//if
this.state = 74;
if (_idmaeedo!=0) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 2867;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"CodE";
_endo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad")));
 //BA.debugLineNum = 2868;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"Co";
_suendo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad")));
 //BA.debugLineNum = 2869;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
_tido = BA.ObjectToString(_respuesta.Get((Object)("Tido")));
 //BA.debugLineNum = 2870;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
_nudo = BA.ObjectToString(_respuesta.Get((Object)("Nudo")));
 //BA.debugLineNum = 2871;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
_obseravacion = BA.ObjectToString(parent._fila_observaciones.Get((Object)("Observacion")));
 //BA.debugLineNum = 2872;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
_nroocc = BA.ObjectToString(parent._fila_observaciones.Get((Object)("NroOCC")));
 //BA.debugLineNum = 2887;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
 //BA.debugLineNum = 2890;BA.debugLine="Tab_Post.CurrentTab = 1";
parent.mostCurrent._tab_post.setCurrentTab((int) (1));
 //BA.debugLineNum = 2891;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 2892;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 2893;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 2894;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
 //BA.debugLineNum = 2895;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
 //BA.debugLineNum = 2896;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
 //BA.debugLineNum = 2897;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2899;BA.debugLine="Msgbox2Async(\"Documento actualizado correctame";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Documento actualizado correctamente"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Enviar correo o imprimir","","Cerrar",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2900;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 84;
return;
case 84:
//C
this.state = 41;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2902;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
if (true) break;

case 41:
//if
this.state = 44;
if (_result!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 2903;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 //BA.debugLineNum = 2904;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
 //BA.debugLineNum = 2908;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-b";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"send-mail-back-printer.png");
 //BA.debugLineNum = 2909;BA.debugLine="Dim ErrorMailImp As Boolean";
_errormailimp = false;
 //BA.debugLineNum = 2911;BA.debugLine="Msgbox2Async(\"Elija su opción\", Tido & \"-\" & N";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Elija su opción"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Imprimir","Enviar correo e imprimir","Enviar correo",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2912;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 85;
return;
case 85:
//C
this.state = 45;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2915;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 45:
//if
this.state = 52;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 //BA.debugLineNum = 2918;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo));
this.state = 86;
return;
case 86:
//C
this.state = 48;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2920;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 48:
//if
this.state = 51;
if ((_resultado).equals("Ok") == false) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 2921;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2922;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2923;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 87;
return;
case 87:
//C
this.state = 51;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2924;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
 //BA.debugLineNum = 2930;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 52:
//if
this.state = 59;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
 //BA.debugLineNum = 2933;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 88;
return;
case 88:
//C
this.state = 55;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2935;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 55:
//if
this.state = 58;
if ((_resultado).equals("Ok") == false) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 2936;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2937;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2938;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 89;
return;
case 89:
//C
this.state = 58;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2939;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;
;
 //BA.debugLineNum = 2945;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 59:
//if
this.state = 70;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 //BA.debugLineNum = 2948;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 90;
return;
case 90:
//C
this.state = 62;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2950;BA.debugLine="Log(Resultado)";
anywheresoftware.b4a.keywords.Common.LogImpl("043843840",_resultado,0);
 //BA.debugLineNum = 2951;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 62:
//if
this.state = 65;
if ((_resultado).equals("Ok") == false) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
 //BA.debugLineNum = 2952;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2953;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2954;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 91;
return;
case 91:
//C
this.state = 65;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2955;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 65:
//C
this.state = 66;
;
 //BA.debugLineNum = 2959;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo));
this.state = 92;
return;
case 92:
//C
this.state = 66;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2961;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 66:
//if
this.state = 69;
if ((_resultado).equals("Ok") == false) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 //BA.debugLineNum = 2962;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2963;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2964;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 93;
return;
case 93:
//C
this.state = 69;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2965;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
 //BA.debugLineNum = 2970;BA.debugLine="If ErrorMailImp Then";

case 70:
//if
this.state = 73;
if (_errormailimp) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 //BA.debugLineNum = 2972;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2973;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"+anywheresoftware.b4a.keywords.Common.CRLF+_tido+"-"+_nudo),BA.ObjectToCharSequence("Información"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2975;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 94;
return;
case 94:
//C
this.state = 73;
_result = (Integer) result[0];
;
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;

case 74:
//C
this.state = 77;
;
 //BA.debugLineNum = 2981;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 76:
//C
this.state = 77;
 //BA.debugLineNum = 2985;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2987;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error al grabar"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2988;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 95;
return;
case 95:
//C
this.state = 77;
_result = (Integer) result[0];
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = -1;
;
 //BA.debugLineNum = 2994;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 2996;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 2998;BA.debugLine="End Sub";
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
public static String  _sb_editar_producto(int _index,Object _value) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblcodigo = null;
 //BA.debugLineNum = 2361;BA.debugLine="Sub Sb_Editar_Producto (Index As Int, Value As Obj";
 //BA.debugLineNum = 2363;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 2364;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = mostCurrent._xclvdetalle._getrawlistitem(_index);
 //BA.debugLineNum = 2365;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 2366;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
_lblcodigo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblcodigo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 2368;BA.debugLine="Id_DocDet = LblCodigo.Tag";
_id_docdet = (int)(BA.ObjectToNumber(_lblcodigo.getTag()));
 //BA.debugLineNum = 2370;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
mostCurrent._frm_post_01_producto._id_docdet /*int*/  = _id_docdet;
 //BA.debugLineNum = 2371;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_producto.getObject()));
 //BA.debugLineNum = 2373;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_grabar_standby() throws Exception{
ResumableSub_Sb_Grabar_StandBy rsub = new ResumableSub_Sb_Grabar_StandBy(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Grabar_StandBy extends BA.ResumableSub {
public ResumableSub_Sb_Grabar_StandBy(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _accion = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
String[] _array_encabezado = null;
anywheresoftware.b4a.objects.collections.Map _encabezado = null;
String[] _array_detalle = null;
anywheresoftware.b4a.objects.collections.Map _detalle = null;
String[] _array_descuentos = null;
anywheresoftware.b4a.objects.collections.Map _descuentos = null;
String[] _array_impuestos = null;
anywheresoftware.b4a.objects.collections.Map _impuestos = null;
String[] _array_observaciones = null;
anywheresoftware.b4a.objects.collections.Map _observaciones = null;
anywheresoftware.b4a.objects.collections.List _encabezadojs = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
String _json = "";
String _json2 = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _detallejs = null;
anywheresoftware.b4a.objects.collections.List _descuentosjs = null;
anywheresoftware.b4a.objects.collections.List _observacionesjs = null;

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
 //BA.debugLineNum = 3051;BA.debugLine="Dim Accion As Int";
_accion = 0;
 //BA.debugLineNum = 3053;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3055;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 3058;BA.debugLine="If Cursor1.RowCount = 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_cursor1.getRowCount()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3060;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 3066;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 3077;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
 //BA.debugLineNum = 3078;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3079;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
 //BA.debugLineNum = 3081;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
 //BA.debugLineNum = 3082;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3083;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
 //BA.debugLineNum = 3085;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
 //BA.debugLineNum = 3086;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3087;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
 //BA.debugLineNum = 3089;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
 //BA.debugLineNum = 3090;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3091;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
 //BA.debugLineNum = 3093;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
 //BA.debugLineNum = 3094;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3095;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
 //BA.debugLineNum = 3097;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3098;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
 //BA.debugLineNum = 3099;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
 //BA.debugLineNum = 3100;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3101;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
 //BA.debugLineNum = 3103;BA.debugLine="Dim Json As String = JSONGenerator.ToPrettyString";
_json = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 3104;BA.debugLine="Dim Json2 As String = JSONGenerator.ToString";
_json2 = _jsongenerator.ToString();
 //BA.debugLineNum = 3106;BA.debugLine="Log(Json2)'(JSONGenerator.ToPrettyString(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("043974713",_json2,0);
 //BA.debugLineNum = 3108;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Encabezado");
 //BA.debugLineNum = 3109;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 37;
return;
case 37:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3111;BA.debugLine="If Js.Success Then";
if (true) break;

case 5:
//if
this.state = 36;
if (_js._success /*boolean*/ ) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 3113;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3115;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 8:
//if
this.state = 35;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 3117;BA.debugLine="Accion = 1";
_accion = (int) (1);
 //BA.debugLineNum = 3119;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3120;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
 //BA.debugLineNum = 3121;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
 //BA.debugLineNum = 3122;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3123;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
 //BA.debugLineNum = 3125;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 3127;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Detalle");
 //BA.debugLineNum = 3128;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3130;BA.debugLine="If Js.Success Then";
if (true) break;

case 11:
//if
this.state = 34;
if (_js._success /*boolean*/ ) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 3132;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3134;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 14:
//if
this.state = 33;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 3136;BA.debugLine="Accion = 2";
_accion = (int) (2);
 //BA.debugLineNum = 3138;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3139;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
 //BA.debugLineNum = 3140;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
 //BA.debugLineNum = 3141;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3142;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
 //BA.debugLineNum = 3144;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 3146;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Descuentos");
 //BA.debugLineNum = 3147;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3149;BA.debugLine="If Js.Success Then";
if (true) break;

case 17:
//if
this.state = 32;
if (_js._success /*boolean*/ ) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 3151;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3153;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 20:
//if
this.state = 31;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 3155;BA.debugLine="Accion = 3";
_accion = (int) (3);
 //BA.debugLineNum = 3157;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3158;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
 //BA.debugLineNum = 3159;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
 //BA.debugLineNum = 3160;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3161;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
 //BA.debugLineNum = 3163;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 3165;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Observaciones");
 //BA.debugLineNum = 3166;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 3168;BA.debugLine="If Js.Success Then";
if (true) break;

case 23:
//if
this.state = 30;
if (_js._success /*boolean*/ ) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 3170;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 3172;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 26:
//if
this.state = 29;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 3174;BA.debugLine="Accion = 4";
_accion = (int) (4);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
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
 //BA.debugLineNum = 3195;BA.debugLine="Return Accion";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_accion));return;};
 //BA.debugLineNum = 3197;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_grabara_nuevo_documento() throws Exception{
ResumableSub_Sb_Grabara_Nuevo_Documento rsub = new ResumableSub_Sb_Grabara_Nuevo_Documento(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Grabara_Nuevo_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Grabara_Nuevo_Documento(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _result = 0;
String _tido = "";
boolean _result2 = false;
boolean _rst = false;
String[] _array_encabezado = null;
anywheresoftware.b4a.objects.collections.Map _encabezado = null;
String[] _array_detalle = null;
anywheresoftware.b4a.objects.collections.Map _detalle = null;
String[] _array_descuentos = null;
anywheresoftware.b4a.objects.collections.Map _descuentos = null;
String[] _array_impuestos = null;
anywheresoftware.b4a.objects.collections.Map _impuestos = null;
String[] _array_observaciones = null;
anywheresoftware.b4a.objects.collections.Map _observaciones = null;
String[] _array_despafacil = null;
anywheresoftware.b4a.objects.collections.Map _despafacil = null;
String _json_encabezado = "";
String _json_detalle = "";
String _json_descuentos = "";
String _json_obseravciones = "";
String _json_despafacil = "";
anywheresoftware.b4a.objects.collections.List _encabezadojs = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
anywheresoftware.b4a.objects.collections.List _detallejs = null;
anywheresoftware.b4a.objects.collections.List _descuentosjs = null;
anywheresoftware.b4a.objects.collections.List _observacionesjs = null;
anywheresoftware.b4a.objects.collections.List _despafaciljs = null;
String _emailrandom = "";
String _para = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _respuesta = null;
int _idmaeedo = 0;
String _error = "";
String _endo = "";
String _suendo = "";
String _nudo = "";
String _obseravacion = "";
String _nroocc = "";
boolean _errormailimp = false;
String _resultado = "";

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
 //BA.debugLineNum = 2398;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
 //BA.debugLineNum = 2400;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_grabar_standby());
this.state = 90;
return;
case 90:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2402;BA.debugLine="If Result = 0 Then";
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
 //BA.debugLineNum = 2403;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2404;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe detalle en el documento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2405;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2408;BA.debugLine="If Result = 4 Then";

case 4:
//if
this.state = 9;
if (_result==4) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 2412;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2413;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence("Documento Stand-By"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2414;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 91;
return;
case 91:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2415;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2418;BA.debugLine="If Crear_NVV_Desde_COV Then";

case 9:
//if
this.state = 24;
if (parent._crear_nvv_desde_cov) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 24;
 //BA.debugLineNum = 2419;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 2422;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"save.png");
 //BA.debugLineNum = 2423;BA.debugLine="Msgbox2Async(\"Seleccione documento a grabar\", \"G";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Seleccione documento a grabar"),BA.ObjectToCharSequence("Grabar documento"),"NVV (Nota de venta)","Cancelar","COV (Cotización)",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2424;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 92;
return;
case 92:
//C
this.state = 14;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2426;BA.debugLine="Dim Tido As String = \"\"";
_tido = "";
 //BA.debugLineNum = 2428;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 2429;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;
;
 //BA.debugLineNum = 2432;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 17:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 2433;BA.debugLine="Tido = \"COV\"";
_tido = "COV";
 if (true) break;
;
 //BA.debugLineNum = 2436;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 20:
//if
this.state = 23;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 2437;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
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
 //BA.debugLineNum = 2441;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)(_tido));
 //BA.debugLineNum = 2442;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 //BA.debugLineNum = 2444;BA.debugLine="If Tido = \"NVV\" Then";
if (true) break;

case 25:
//if
this.state = 36;
if ((_tido).equals("NVV")) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 2446;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_recorrer_detalle_rev_stock());
this.state = 93;
return;
case 93:
//C
this.state = 28;
_result2 = (Boolean) result[0];
;
 //BA.debugLineNum = 2454;BA.debugLine="If Result2 = False Then";
if (true) break;

case 28:
//if
this.state = 35;
if (_result2==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 2456;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Bkp00015"));
this.state = 94;
return;
case 94:
//C
this.state = 31;
_rst = (Boolean) result[0];
;
 //BA.debugLineNum = 2458;BA.debugLine="If Not(Rst) Then";
if (true) break;

case 31:
//if
this.state = 34;
if (anywheresoftware.b4a.keywords.Common.Not(_rst)) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 2459;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
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
this.state = 37;
;
 //BA.debugLineNum = 2466;BA.debugLine="ProgressDialogShow(\"Creando documento...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Creando documento..."));
 //BA.debugLineNum = 2469;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 2479;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
 //BA.debugLineNum = 2480;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2481;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
 //BA.debugLineNum = 2483;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
 //BA.debugLineNum = 2484;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2485;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
 //BA.debugLineNum = 2487;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
 //BA.debugLineNum = 2488;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2489;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
 //BA.debugLineNum = 2491;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
 //BA.debugLineNum = 2492;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2493;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
 //BA.debugLineNum = 2495;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
 //BA.debugLineNum = 2496;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2497;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
 //BA.debugLineNum = 2499;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
_array_despafacil = _generaarreglo("DespaFacil_Doc");
 //BA.debugLineNum = 2500;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 2501;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
_despafacil = new anywheresoftware.b4a.objects.collections.Map();
_despafacil = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_despafacil));
 //BA.debugLineNum = 2503;BA.debugLine="Dim Json_Encabezado As String";
_json_encabezado = "";
 //BA.debugLineNum = 2504;BA.debugLine="Dim Json_Detalle As String";
_json_detalle = "";
 //BA.debugLineNum = 2505;BA.debugLine="Dim Json_Descuentos As String";
_json_descuentos = "";
 //BA.debugLineNum = 2506;BA.debugLine="Dim Json_Obseravciones As String";
_json_obseravciones = "";
 //BA.debugLineNum = 2507;BA.debugLine="Dim Json_DespaFacil As String";
_json_despafacil = "";
 //BA.debugLineNum = 2509;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2510;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
 //BA.debugLineNum = 2511;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
 //BA.debugLineNum = 2512;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2513;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
 //BA.debugLineNum = 2514;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
_json_encabezado = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2516;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2517;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
 //BA.debugLineNum = 2518;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
 //BA.debugLineNum = 2519;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2520;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
 //BA.debugLineNum = 2521;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
_json_detalle = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2523;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2524;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
 //BA.debugLineNum = 2525;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
 //BA.debugLineNum = 2526;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2527;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
 //BA.debugLineNum = 2528;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
_json_descuentos = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2530;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2531;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
 //BA.debugLineNum = 2532;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
 //BA.debugLineNum = 2533;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2534;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
 //BA.debugLineNum = 2535;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
_json_obseravciones = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2537;BA.debugLine="Dim DespaFaciljs As List";
_despafaciljs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2538;BA.debugLine="DespaFaciljs.Initialize";
_despafaciljs.Initialize();
 //BA.debugLineNum = 2539;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
_despafaciljs.Add((Object)(_despafacil.getObject()));
 //BA.debugLineNum = 2540;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 2541;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
_jsongenerator.Initialize2(_despafaciljs);
 //BA.debugLineNum = 2542;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
_json_despafacil = _jsongenerator.ToPrettyString((int) (1));
 //BA.debugLineNum = 2544;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
_emailrandom = "EMAILCOMER";
 //BA.debugLineNum = 2545;BA.debugLine="Dim Para As String";
_para = "";
 //BA.debugLineNum = 2547;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
if (true) break;

case 37:
//if
this.state = 46;
if ((_emailrandom).equals("") == false && _emailrandom!= null) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 2548;BA.debugLine="Try";
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
 //BA.debugLineNum = 2549;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
_para = BA.ObjectToString(parent._row_entidad.Get((Object)(_emailrandom)));
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 //BA.debugLineNum = 2551;BA.debugLine="Para = \"\"";
_para = "";
 //BA.debugLineNum = 2552;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("043778206",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 if (true) break;

case 46:
//C
this.state = 47;
;
 //BA.debugLineNum = 2556;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Cre";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_creadocumentojsonbakapp2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json_encabezado,_json_detalle,_json_descuentos,_json_obseravciones,_json_despafacil);
 //BA.debugLineNum = 2557;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 95;
return;
case 95:
//C
this.state = 47;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 2559;BA.debugLine="If Js.Success Then";
if (true) break;

case 47:
//if
this.state = 89;
if (_js._success /*boolean*/ ) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 2561;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 2563;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 50:
//if
this.state = 88;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 //BA.debugLineNum = 2565;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 2567;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 2569;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
_idmaeedo = (int)(BA.ObjectToNumber(_respuesta.Get((Object)("Idmaeedo"))));
 //BA.debugLineNum = 2570;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
 //BA.debugLineNum = 2572;BA.debugLine="If Idmaeedo <> 0 Then";
if (true) break;

case 53:
//if
this.state = 87;
if (_idmaeedo!=0) { 
this.state = 55;
}else {
this.state = 86;
}if (true) break;

case 55:
//C
this.state = 56;
 //BA.debugLineNum = 2574;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"code";
_endo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("codentidad")));
 //BA.debugLineNum = 2575;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"co";
_suendo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("codsucentidad")));
 //BA.debugLineNum = 2576;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
_tido = BA.ObjectToString(_respuesta.Get((Object)("Tido")));
 //BA.debugLineNum = 2577;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
_nudo = BA.ObjectToString(_respuesta.Get((Object)("Nudo")));
 //BA.debugLineNum = 2578;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
_obseravacion = BA.ObjectToString(parent._fila_observaciones.Get((Object)("observacion")));
 //BA.debugLineNum = 2579;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
_nroocc = BA.ObjectToString(parent._fila_observaciones.Get((Object)("nroocc")));
 //BA.debugLineNum = 2597;BA.debugLine="Tab_Post.CurrentTab = 1";
parent.mostCurrent._tab_post.setCurrentTab((int) (1));
 //BA.debugLineNum = 2598;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 2599;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 2600;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 2601;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
 //BA.debugLineNum = 2602;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
 //BA.debugLineNum = 2603;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
 //BA.debugLineNum = 2604;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2606;BA.debugLine="Dim ErrorMailImp As Boolean";
_errormailimp = false;
 //BA.debugLineNum = 2607;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
 //BA.debugLineNum = 2609;BA.debugLine="Msgbox2Async(\"Documento guardado correctamente";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Documento guardado correctamente"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Imprimir","Enviar correo e imprimir","Enviar correo",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2610;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 96;
return;
case 96:
//C
this.state = 56;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2612;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"warning.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"warning.png");
 //BA.debugLineNum = 2615;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 56:
//if
this.state = 63;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 //BA.debugLineNum = 2618;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo));
this.state = 97;
return;
case 97:
//C
this.state = 59;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2620;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 59:
//if
this.state = 62;
if ((_resultado).equals("Ok") == false) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 //BA.debugLineNum = 2621;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2622;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 98;
return;
case 98:
//C
this.state = 62;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2623;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;
;
 //BA.debugLineNum = 2629;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 63:
//if
this.state = 70;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 2631;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 99;
return;
case 99:
//C
this.state = 66;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2633;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 66:
//if
this.state = 69;
if ((_resultado).equals("Ok") == false) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 //BA.debugLineNum = 2634;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2635;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 100;
return;
case 100:
//C
this.state = 69;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2636;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
 //BA.debugLineNum = 2642;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 70:
//if
this.state = 81;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 //BA.debugLineNum = 2644;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 101;
return;
case 101:
//C
this.state = 73;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2646;BA.debugLine="Log(Resultado)";
anywheresoftware.b4a.keywords.Common.LogImpl("043778300",_resultado,0);
 //BA.debugLineNum = 2647;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 73:
//if
this.state = 76;
if ((_resultado).equals("Ok") == false) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 //BA.debugLineNum = 2648;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2649;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 102;
return;
case 102:
//C
this.state = 76;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2650;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 76:
//C
this.state = 77;
;
 //BA.debugLineNum = 2653;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_idmaeedo));
this.state = 103;
return;
case 103:
//C
this.state = 77;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 2655;BA.debugLine="If Resultado <> \"Ok\" Then";
if (true) break;

case 77:
//if
this.state = 80;
if ((_resultado).equals("Ok") == false) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 //BA.debugLineNum = 2657;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2658;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 104;
return;
case 104:
//C
this.state = 80;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2659;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;
;
 //BA.debugLineNum = 2664;BA.debugLine="If ErrorMailImp Then";

case 81:
//if
this.state = 84;
if (_errormailimp) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 //BA.debugLineNum = 2667;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"+anywheresoftware.b4a.keywords.Common.CRLF+_tido+"-"+_nudo),BA.ObjectToCharSequence("Información"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 2670;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 105;
return;
case 105:
//C
this.state = 84;
_result = (Integer) result[0];
;
 if (true) break;

case 84:
//C
this.state = 87;
;
 //BA.debugLineNum = 2674;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 86:
//C
this.state = 87;
 //BA.debugLineNum = 2678;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error al grabar"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2679;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 106;
return;
case 106:
//C
this.state = 87;
_result = (Integer) result[0];
;
 if (true) break;

case 87:
//C
this.state = 88;
;
 if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;

case 89:
//C
this.state = -1;
;
 //BA.debugLineNum = 2687;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 2689;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 2691;BA.debugLine="End Sub";
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
public static String  _sb_grabarobservacionesdespachos() throws Exception{
 //BA.debugLineNum = 4124;BA.debugLine="Private Sub Sb_GrabarObservacionesDespachos";
 //BA.debugLineNum = 4126;BA.debugLine="If  Not(Txt_ObservacionesDesp.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._txt_observacionesdesp.IsInitialized())) { 
 //BA.debugLineNum = 4127;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4130;BA.debugLine="If Txt_ObservacionesDesp.Visible Then";
if (mostCurrent._txt_observacionesdesp.getVisible()) { 
 //BA.debugLineNum = 4131;BA.debugLine="Txt_Observaciones.Text = Txt_ObservacionesDesp.T";
mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(mostCurrent._txt_observacionesdesp.getText()));
 };
 //BA.debugLineNum = 4134;BA.debugLine="Fila_Observaciones.Put(\"Observaciones\",Txt_Observ";
_fila_observaciones.Put((Object)("Observaciones"),(Object)(mostCurrent._txt_observaciones.getText()));
 //BA.debugLineNum = 4135;BA.debugLine="Fila_Observaciones.Put(\"Orden_compra\",Txt_Orden_c";
_fila_observaciones.Put((Object)("Orden_compra"),(Object)(mostCurrent._txt_orden_compra.getText()));
 //BA.debugLineNum = 4136;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observacion";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Observaciones_Doc",_fila_observaciones,mostCurrent._fila_idenc);
 //BA.debugLineNum = 4138;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\",Lbl_TipoDes";
_fila_despafacil.Put((Object)("CodTipoDespacho"),mostCurrent._lbl_tipodespacho.getTag());
 //BA.debugLineNum = 4139;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\",Lbl_TipoDespac";
_fila_despafacil.Put((Object)("TipoDespacho"),(Object)(mostCurrent._lbl_tipodespacho.getText()));
 //BA.debugLineNum = 4140;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\",Lbl_TipoPag";
_fila_despafacil.Put((Object)("CodTipoPagoDesp"),mostCurrent._lbl_tipopagodesp.getTag());
 //BA.debugLineNum = 4141;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\",Lbl_TipoPagoDe";
_fila_despafacil.Put((Object)("TipoPagoDesp"),(Object)(mostCurrent._lbl_tipopagodesp.getText()));
 //BA.debugLineNum = 4142;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\",Lbl_CodDocDes";
_fila_despafacil.Put((Object)("CodDocDestino"),mostCurrent._lbl_coddocdestino.getTag());
 //BA.debugLineNum = 4143;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\",Lbl_CodDocDestin";
_fila_despafacil.Put((Object)("DocDestino"),(Object)(mostCurrent._lbl_coddocdestino.getText()));
 //BA.debugLineNum = 4144;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\",Txt_Transpor";
_fila_despafacil.Put((Object)("TransporteDesp"),(Object)(mostCurrent._txt_transportedesp.getText()));
 //BA.debugLineNum = 4145;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\",Txt_Direccion";
_fila_despafacil.Put((Object)("DireccionDesp"),(Object)(mostCurrent._txt_direcciondesp.getText()));
 //BA.debugLineNum = 4146;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\",Txt_Obser";
_fila_despafacil.Put((Object)("ObservacionesDesp"),(Object)(mostCurrent._txt_observacionesdesp.getText()));
 //BA.debugLineNum = 4147;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFacil_";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"DespaFacil_Doc",_fila_despafacil,mostCurrent._fila_idenc);
 //BA.debugLineNum = 4149;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ingresar_correo_validar(String _para) throws Exception{
ResumableSub_Sb_Ingresar_Correo_Validar rsub = new ResumableSub_Sb_Ingresar_Correo_Validar(null,_para);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Ingresar_Correo_Validar extends BA.ResumableSub {
public ResumableSub_Sb_Ingresar_Correo_Validar(BaKapp.Movil.Tag.frm_post_01_formulario parent,String _para) {
this.parent = parent;
this._para = _para;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
String _para;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _result = 0;
String _resultado = "";

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
 //BA.debugLineNum = 3002;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3004;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
 //BA.debugLineNum = 3005;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
 //BA.debugLineNum = 3006;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (mostCurrent.activityBA,_base);
 //BA.debugLineNum = 3008;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3011;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese correo del cliente"));
 //BA.debugLineNum = 3012;BA.debugLine="InputTemplate.Text = Para";
parent.mostCurrent._inputtemplate._text /*String*/  = _para;
 //BA.debugLineNum = 3014;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3015;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3016;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 //BA.debugLineNum = 3017;BA.debugLine="Para = InputTemplate.Text.Trim";
_para = parent.mostCurrent._inputtemplate._text /*String*/ .trim();
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 //BA.debugLineNum = 3019;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("043909139",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 //BA.debugLineNum = 3020;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3021;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3022;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 9;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3023;BA.debugLine="Para = \"Error\"";
_para = "Error";
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 3026;BA.debugLine="Para = \"Cancelar\"";
_para = "Cancelar";
 if (true) break;
;
 //BA.debugLineNum = 3029;BA.debugLine="If Para = \"Cancelar\" Then";

case 12:
//if
this.state = 15;
if ((_para).equals("Cancelar")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 3030;BA.debugLine="Return Para";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_para));return;};
 if (true) break;
;
 //BA.debugLineNum = 3033;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";

case 15:
//if
this.state = 18;
if (parent.mostCurrent._funciones._fx_isemail /*boolean*/ (mostCurrent.activityBA,_para)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 3035;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 3036;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 3037;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 3039;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Para)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_ingresar_correo_validar(_para));
this.state = 22;
return;
case 22:
//C
this.state = 18;
_resultado = (String) result[0];
;
 //BA.debugLineNum = 3041;BA.debugLine="Para = Resultado";
_para = _resultado;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 3045;BA.debugLine="Return Para";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_para));return;};
 //BA.debugLineNum = 3047;BA.debugLine="End Sub";
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
public static String  _sb_nuevo_documento() throws Exception{
long _fechaemision = 0L;
long _fecha_1er_vencimiento = 0L;
long _fechaultvencimiento = 0L;
long _fecharecepcion = 0L;
int _cuotas = 0;
int _dias_1er_vencimiento = 0;
int _dias_vencimiento = 0;
String _forma_de_pago = "";
String _centro_costo = "";
String _moneda_doc = "";
double _valor_dolar = 0;
double _tasadorig_doc = 0;
String _tipomoneda = "";
String _listaprecios = "";
String _newnrodocumento = "";
String _docen_neto_bruto = "";
String _codentidad = "";
String _codsucentidad = "";
String _nombre_entidad = "";
 //BA.debugLineNum = 1758;BA.debugLine="Sub Sb_Nuevo_Documento";
 //BA.debugLineNum = 1760;BA.debugLine="ProgressDialogShow(\"Preparando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Preparando..."));
 //BA.debugLineNum = 1762;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
mostCurrent._consulta_sql = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?";
 //BA.debugLineNum = 1763;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
 //BA.debugLineNum = 1780;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc] Where I";
mostCurrent._consulta_sql = "Delete From [Detalle_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
 //BA.debugLineNum = 1781;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
 //BA.debugLineNum = 1783;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc] Wher";
mostCurrent._consulta_sql = "Delete From [Descuentos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
 //BA.debugLineNum = 1784;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
 //BA.debugLineNum = 1786;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc] Where";
mostCurrent._consulta_sql = "Delete From [Impuestos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
 //BA.debugLineNum = 1787;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
 //BA.debugLineNum = 1789;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc] W";
mostCurrent._consulta_sql = "Delete From [Observaciones_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
 //BA.debugLineNum = 1790;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
 //BA.debugLineNum = 1792;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc] Wher";
mostCurrent._consulta_sql = "Delete From [DespaFacil_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
 //BA.debugLineNum = 1793;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
 //BA.debugLineNum = 1795;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Confi";
mostCurrent._variables._gl_empresa /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
 //BA.debugLineNum = 1796;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Conf";
mostCurrent._variables._gl_sucursal /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
 //BA.debugLineNum = 1797;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Config";
mostCurrent._variables._gl_bodega /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
 //BA.debugLineNum = 1800;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
mostCurrent._consulta_sql = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)";
 //BA.debugLineNum = 1801;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(mostCurrent._variables._gl_modalidad /*String*/ ),(Object)(mostCurrent._variables._gl_empresa /*String*/ ),(Object)(mostCurrent._variables._gl_sucursal /*String*/ )}));
 //BA.debugLineNum = 1804;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
 //BA.debugLineNum = 1805;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
_fila_encabezado = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 1808;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 1811;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
 //BA.debugLineNum = 1812;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
mostCurrent._fila_idenc = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 1815;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
mostCurrent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
 //BA.debugLineNum = 1816;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id_docenc)}));
 //BA.debugLineNum = 1819;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
 //BA.debugLineNum = 1820;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
_fila_observaciones = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 1822;BA.debugLine="Txt_Observaciones.Text = \"\"";
mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1823;BA.debugLine="Txt_Orden_compra.Text = \"\"";
mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1826;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_Do";
mostCurrent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
 //BA.debugLineNum = 1827;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id_docenc)}));
 //BA.debugLineNum = 1829;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
 //BA.debugLineNum = 1830;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
_fila_despafacil = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 1832;BA.debugLine="If B4A_DespachoSimple Then";
if (_b4a_despachosimple) { 
 //BA.debugLineNum = 1834;BA.debugLine="Lbl_TipoDespacho.Tag = 0";
mostCurrent._lbl_tipodespacho.setTag((Object)(0));
 //BA.debugLineNum = 1835;BA.debugLine="Lbl_TipoDespacho.Text = \"\"";
mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1836;BA.debugLine="Lbl_TipoPagoDesp.Tag =  0";
mostCurrent._lbl_tipopagodesp.setTag((Object)(0));
 //BA.debugLineNum = 1837;BA.debugLine="Lbl_TipoPagoDesp.Text = \"\"";
mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1838;BA.debugLine="Txt_TransporteDesp.Text = \"\"";
mostCurrent._txt_transportedesp.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1839;BA.debugLine="Lbl_CodDocDestino.Tag =  \"\"";
mostCurrent._lbl_coddocdestino.setTag((Object)(""));
 //BA.debugLineNum = 1840;BA.debugLine="Lbl_CodDocDestino.Text = \"\"";
mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1841;BA.debugLine="Txt_DireccionDesp.Text = \"\"";
mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1842;BA.debugLine="Txt_ObservacionesDesp.Text = \"\"";
mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 1846;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("043122776","Documento cargado... Id_DocEnc = "+BA.NumberToString(_id_docenc),0);
 //BA.debugLineNum = 1848;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 1851;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 1852;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
 //BA.debugLineNum = 1853;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
 //BA.debugLineNum = 1854;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
 //BA.debugLineNum = 1858;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
 //BA.debugLineNum = 1859;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fe";
mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
 //BA.debugLineNum = 1860;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fech";
mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
 //BA.debugLineNum = 1862;BA.debugLine="Dim Cuotas As Int = 0";
_cuotas = (int) (0);
 //BA.debugLineNum = 1863;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
 //BA.debugLineNum = 1864;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
 //BA.debugLineNum = 1865;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
_forma_de_pago = "";
 //BA.debugLineNum = 1867;BA.debugLine="Dim Centro_Costo As String";
_centro_costo = "";
 //BA.debugLineNum = 1869;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
_moneda_doc = BA.ObjectToString(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 1870;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
_valor_dolar = (double)(BA.ObjectToNumber(mostCurrent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
 //BA.debugLineNum = 1871;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
_tasadorig_doc = (double)(BA.ObjectToNumber(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
 //BA.debugLineNum = 1872;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
_tipomoneda = BA.ObjectToString(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 1875;BA.debugLine="Dim ListaPrecios As String";
_listaprecios = "";
 //BA.debugLineNum = 1877;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
_newnrodocumento = "NEWXXXXXXX";
 //BA.debugLineNum = 1879;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
_docen_neto_bruto = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_TipoValor_Bruto_Neto")));
 //BA.debugLineNum = 1881;BA.debugLine="If DocEn_Neto_Bruto = \"N\" Then";
if ((_docen_neto_bruto).equals("N")) { 
 //BA.debugLineNum = 1882;BA.debugLine="Chk_Valores_Netos.Checked = True";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 1884;BA.debugLine="Chk_Valores_Netos.Checked = False";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 1887;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
_centro_costo = "LUVTVEN";
 //BA.debugLineNum = 1888;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
_centro_costo = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_centro_costo)));
 //BA.debugLineNum = 1890;BA.debugLine="Lbl_Centro_Costo.Text = Centro_Costo";
mostCurrent._lbl_centro_costo.setText(BA.ObjectToCharSequence(_centro_costo));
 //BA.debugLineNum = 1892;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
_listaprecios = mostCurrent._variables._gl_lista_precios /*String*/ ;
 //BA.debugLineNum = 1894;BA.debugLine="Chk_Valores_Netos.Enabled = False";
mostCurrent._chk_valores_netos.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1896;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
_fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)("NVV"));
 //BA.debugLineNum = 1897;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
_fila_encabezado.Put((Object)("NroDocumento".toLowerCase()),(Object)(_newnrodocumento));
 //BA.debugLineNum = 1899;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
_fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
 //BA.debugLineNum = 1900;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
_fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
 //BA.debugLineNum = 1901;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
_fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
 //BA.debugLineNum = 1902;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
_fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
 //BA.debugLineNum = 1904;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
_fila_encabezado.Put((Object)("Cuotas".toLowerCase()),(Object)(_cuotas));
 //BA.debugLineNum = 1905;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
_fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
 //BA.debugLineNum = 1906;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
_fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
 //BA.debugLineNum = 1908;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Defe";
_row_entidad = mostCurrent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 1910;BA.debugLine="Dim CodEntidad As String";
_codentidad = "";
 //BA.debugLineNum = 1911;BA.debugLine="Dim CodSucEntidad As String";
_codsucentidad = "";
 //BA.debugLineNum = 1912;BA.debugLine="Dim Nombre_Entidad As String";
_nombre_entidad = "";
 //BA.debugLineNum = 1914;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (_row_entidad.IsInitialized()) { 
 //BA.debugLineNum = 1915;BA.debugLine="CodEntidad = Row_Entidad.Get(\"KOEN\")";
_codentidad = BA.ObjectToString(_row_entidad.Get((Object)("KOEN")));
 //BA.debugLineNum = 1916;BA.debugLine="CodSucEntidad = Row_Entidad.Get(\"SUEN\")";
_codsucentidad = BA.ObjectToString(_row_entidad.Get((Object)("SUEN")));
 //BA.debugLineNum = 1917;BA.debugLine="Nombre_Entidad = Row_Entidad.Get(\"NOKOEN\")";
_nombre_entidad = BA.ObjectToString(_row_entidad.Get((Object)("NOKOEN")));
 };
 //BA.debugLineNum = 1920;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
_fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(_codentidad));
 //BA.debugLineNum = 1921;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
_fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(_codsucentidad));
 //BA.debugLineNum = 1922;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
_fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(_nombre_entidad));
 //BA.debugLineNum = 1924;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
_fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 //BA.debugLineNum = 1925;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
_fila_encabezado.Put((Object)("CodFuncionario".toLowerCase()),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 1927;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
_fila_encabezado.Put((Object)("NomFuncionario".toLowerCase()),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
 //BA.debugLineNum = 1929;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
_fila_encabezado.Put((Object)("Moneda_Doc".toLowerCase()),(Object)(_moneda_doc));
 //BA.debugLineNum = 1930;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
_fila_encabezado.Put((Object)("TipoMoneda".toLowerCase()),(Object)(_tipomoneda));
 //BA.debugLineNum = 1931;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
_fila_encabezado.Put((Object)("Valor_Dolar".toLowerCase()),(Object)(_valor_dolar));
 //BA.debugLineNum = 1932;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
_fila_encabezado.Put((Object)("Tasadorig_Doc".toLowerCase()),(Object)(_tasadorig_doc));
 //BA.debugLineNum = 1934;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
_fila_encabezado.Put((Object)("DocEn_Neto_Bruto".toLowerCase()),(Object)(_docen_neto_bruto));
 //BA.debugLineNum = 1936;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
_fila_encabezado.Put((Object)("Centro_Costo".toLowerCase()),(Object)(_centro_costo));
 //BA.debugLineNum = 1938;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
_fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1939;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
_fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1940;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
_fila_encabezado.Put((Object)("Nombre_Entidad_Fisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1941;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
_fila_encabezado.Put((Object)("Fun_Auto_Deuda_Ven".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1942;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
_fila_encabezado.Put((Object)("Fun_Auto_Stock_Ins".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1943;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
_fila_encabezado.Put((Object)("Fun_Auto_Cupo_Exe".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1944;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
_fila_encabezado.Put((Object)("SubTido".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 1947;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",_fila_encabezado,mostCurrent._fila_idenc);
 //BA.debugLineNum = 1949;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (_row_entidad.IsInitialized()) { 
 //BA.debugLineNum = 1950;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fa";
_sb_actualizar_datos_de_la_entidad(_row_entidad,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 1952;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1953;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1954;BA.debugLine="Lbl_Rut.Text = \"\"";
mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1955;BA.debugLine="Lbl_Nombre.Text = \"\"";
mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1956;BA.debugLine="Lbl_Direccion.Text = \"\"";
mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1957;BA.debugLine="Lbl_Ciudad.Text = \"\"";
mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1958;BA.debugLine="Lbl_Comuna.Text = \"\"";
mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1959;BA.debugLine="Tab_Post.CurrentTab = 0";
mostCurrent._tab_post.setCurrentTab((int) (0));
 };
 //BA.debugLineNum = 1962;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1964;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 1966;BA.debugLine="End Sub";
return "";
}
public static String  _sb_procesar_fila(String _cabeza,int _id_docdet2) throws Exception{
anywheresoftware.b4a.objects.collections.Map _fila = null;
anywheresoftware.b4a.objects.collections.Map _fila_id = null;
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
int _multiplo = 0;
 //BA.debugLineNum = 860;BA.debugLine="Sub Sb_Procesar_Fila(Cabeza As String, Id_DocDet2";
 //BA.debugLineNum = 862;BA.debugLine="Dim Fila,Fila_Id As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 864;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet2);
 //BA.debugLineNum = 865;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
_fila_id = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 867;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet2);
 //BA.debugLineNum = 868;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
_fila = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 870;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(_fila.Get((Object)("untrans"))));
 //BA.debugLineNum = 871;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(_fila.Get((Object)("poriva"))));
 //BA.debugLineNum = 872;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(_fila.Get((Object)("porila"))));
 //BA.debugLineNum = 873;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(_fila.Get((Object)("rtu"))));
 //BA.debugLineNum = 875;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
 //BA.debugLineNum = 877;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
 //BA.debugLineNum = 878;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
 //BA.debugLineNum = 879;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
 //BA.debugLineNum = 880;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
 //BA.debugLineNum = 882;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
 //BA.debugLineNum = 883;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
 //BA.debugLineNum = 885;BA.debugLine="Dim Precio As Double = Fila.Get(Cabeza.ToLowerCas";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)(_cabeza.toLowerCase()))));
 //BA.debugLineNum = 887;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
 //BA.debugLineNum = 888;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
 //BA.debugLineNum = 890;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
 //BA.debugLineNum = 891;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
 //BA.debugLineNum = 893;BA.debugLine="Dim Total As Double";
_total = 0;
 //BA.debugLineNum = 895;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
 //BA.debugLineNum = 897;BA.debugLine="Dim Cantidad As Double";
_cantidad = 0;
 //BA.debugLineNum = 898;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
 //BA.debugLineNum = 899;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
 //BA.debugLineNum = 901;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
_divisible = "";
 //BA.debugLineNum = 902;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
_divisible2 = "";
 //BA.debugLineNum = 904;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor"))));
 //BA.debugLineNum = 905;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
 //BA.debugLineNum = 906;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
 //BA.debugLineNum = 907;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(_fila.Get((Object)("descmaximo"))));
 //BA.debugLineNum = 909;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(_fila.Get((Object)("tict")));
 //BA.debugLineNum = 910;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(_fila.Get((Object)("prct")));
 //BA.debugLineNum = 911;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(_fila.Get((Object)("tipr")));
 //BA.debugLineNum = 913;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("codlista")));
 //BA.debugLineNum = 915;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
 //BA.debugLineNum = 917;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
 //BA.debugLineNum = 918;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
 //BA.debugLineNum = 920;BA.debugLine="If No_Aplica_Redondeo Then";
if (_no_aplica_redondeo) { 
 //BA.debugLineNum = 921;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 924;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
 //BA.debugLineNum = 925;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
 //BA.debugLineNum = 927;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
 //BA.debugLineNum = 928;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
 //BA.debugLineNum = 932;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor_anterior"))));
 //BA.debugLineNum = 933;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
 //BA.debugLineNum = 935;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (_cantidad==0 && (_tipr).equals("") == false) { 
 };
 //BA.debugLineNum = 942;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
 //BA.debugLineNum = 944;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("moneda_doc")));
 //BA.debugLineNum = 945;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
_tipo_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("tipomoneda")));
 //BA.debugLineNum = 946;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("tasadorig_doc"))));
 //BA.debugLineNum = 948;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(_fila.Get((Object)("moneda")));
 //BA.debugLineNum = 949;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(_fila.Get((Object)("tipo_moneda")));
 //BA.debugLineNum = 950;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(_fila.Get((Object)("tipo_cambio"))));
 //BA.debugLineNum = 952;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
 //BA.debugLineNum = 954;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
 //BA.debugLineNum = 955;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if ((_tipo_moneda_enc).equals("N")) { 
 //BA.debugLineNum = 956;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio*_tipo_cambio_ent,(int) (2));
 }else {
 //BA.debugLineNum = 958;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
 //BA.debugLineNum = 959;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 }else {
 //BA.debugLineNum = 962;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
 //BA.debugLineNum = 963;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 //BA.debugLineNum = 965;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 };
 //BA.debugLineNum = 970;BA.debugLine="Dim Divi As String";
_divi = "";
 //BA.debugLineNum = 972;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
 //BA.debugLineNum = 973;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 };
 //BA.debugLineNum = 976;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
 //BA.debugLineNum = 977;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 };
 //BA.debugLineNum = 992;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
 //BA.debugLineNum = 993;BA.debugLine="If Rtu = 1 Then";
if (_rtu==1) { 
 //BA.debugLineNum = 994;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
 //BA.debugLineNum = 995;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 }else {
 //BA.debugLineNum = 997;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
 //BA.debugLineNum = 998;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 };
 };
 //BA.debugLineNum = 1002;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
 //BA.debugLineNum = 1003;BA.debugLine="If Rtu > 1 Then";
if (_rtu>1) { 
 //BA.debugLineNum = 1004;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
 //BA.debugLineNum = 1005;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 }else {
 //BA.debugLineNum = 1007;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
 //BA.debugLineNum = 1008;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 };
 };
 //BA.debugLineNum = 1012;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
 //BA.debugLineNum = 1022;BA.debugLine="TotalNeto_Calculo = Lbl_Total_Neto.Tag";
_totalneto_calculo = (double)(BA.ObjectToNumber(mostCurrent._lbl_total_neto.getTag()));
 //BA.debugLineNum = 1023;BA.debugLine="TotalBruto_Calculo = Lbl_Total_Bruto.Tag";
_totalbruto_calculo = (double)(BA.ObjectToNumber(mostCurrent._lbl_total_bruto.getTag()));
 //BA.debugLineNum = 1025;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
 //BA.debugLineNum = 1027;BA.debugLine="Descontar = True";
_descontar = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1028;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
 //BA.debugLineNum = 1028;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
 //BA.debugLineNum = 1028;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
 //BA.debugLineNum = 1029;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
 //BA.debugLineNum = 1031;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
 //BA.debugLineNum = 1033;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1034;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1036;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 1038;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1040;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else if((_cabeza).equals("DescuentoValor")) { 
 //BA.debugLineNum = 1045;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1047;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 1050;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else if((_tict).equals("R")) { 
 //BA.debugLineNum = 1057;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
 //BA.debugLineNum = 1058;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(_fila.Get((Object)("recargovalor"))));
 //BA.debugLineNum = 1060;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1061;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 }else {
 //BA.debugLineNum = 1063;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_total_concepto/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 1064;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 };
 //BA.debugLineNum = 1067;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
 //BA.debugLineNum = 1069;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
 //BA.debugLineNum = 1070;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
 //BA.debugLineNum = 1072;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
 //BA.debugLineNum = 1074;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1076;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1077;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = anywheresoftware.b4a.keywords.Common.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1079;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
 //BA.debugLineNum = 1080;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 }else {
 //BA.debugLineNum = 1084;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1086;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else if((_cabeza).equals("ValNetoLinea")) { 
 //BA.debugLineNum = 1092;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
 //BA.debugLineNum = 1093;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
 //BA.debugLineNum = 1095;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1097;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 }else {
 //BA.debugLineNum = 1100;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 };
 //BA.debugLineNum = 1103;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 };
 //BA.debugLineNum = 1107;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
 }else {
 //BA.debugLineNum = 1123;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1124;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 }else {
 //BA.debugLineNum = 1126;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio_calculado/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 1127;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 };
 //BA.debugLineNum = 1130;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_precioneto*_cantidad,(int) (3));
 //BA.debugLineNum = 1131;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1133;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
 //BA.debugLineNum = 1135;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 //BA.debugLineNum = 1136;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
 //BA.debugLineNum = 1148;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
 //BA.debugLineNum = 1149;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
 //BA.debugLineNum = 1153;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
 //BA.debugLineNum = 1155;BA.debugLine="If Precio > 0 Then";
if (_precio>0) { 
 //BA.debugLineNum = 1157;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1159;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1161;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 1165;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1167;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else if((_cabeza).equals("DescuentoValor")) { 
 //BA.debugLineNum = 1175;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1177;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 1180;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 };
 //BA.debugLineNum = 1188;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
 //BA.debugLineNum = 1189;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
_fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
 //BA.debugLineNum = 1190;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
_fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
 //BA.debugLineNum = 1192;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
_fila.Put((Object)("DsctoRealPorc"),(Object)(0));
 //BA.debugLineNum = 1193;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
_fila.Put((Object)("DsctoRealValor"),(Object)(0));
 //BA.debugLineNum = 1195;BA.debugLine="Fila.Put(\"descmaximo\",DescuentoPorc)";
_fila.Put((Object)("descmaximo"),(Object)(_descuentoporc));
 //BA.debugLineNum = 1205;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
 //BA.debugLineNum = 1207;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
 //BA.debugLineNum = 1208;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
 //BA.debugLineNum = 1209;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
 //BA.debugLineNum = 1211;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if ((_prct).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 1213;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
 //BA.debugLineNum = 1215;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1216;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 }else {
 //BA.debugLineNum = 1218;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 };
 //BA.debugLineNum = 1224;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
 //BA.debugLineNum = 1225;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(_fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
 //BA.debugLineNum = 1226;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = anywheresoftware.b4a.keywords.Common.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
 //BA.debugLineNum = 1228;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
 //BA.debugLineNum = 1230;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (_valor_dscto_real>0) { 
 //BA.debugLineNum = 1231;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = anywheresoftware.b4a.keywords.Common.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 };
 //BA.debugLineNum = 1238;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(_fila.Get((Object)("codfunautoriza")));
 //BA.debugLineNum = 1240;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
 //BA.debugLineNum = 1241;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
 //BA.debugLineNum = 1243;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if ((_codfunautoriza).equals("xyz")) { 
_codfunautoriza = "";};
 //BA.debugLineNum = 1245;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (_precio_cn_dscto<_precio_netolista) { 
 //BA.debugLineNum = 1247;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
 //BA.debugLineNum = 1249;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (_descmaximo==0) { 
_descmaximo = 0.5;};
 //BA.debugLineNum = 1251;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (_dscto_real>_descmaximo) { 
 //BA.debugLineNum = 1253;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 1255;BA.debugLine="If Vizado Then";
if (_vizado) { 
 //BA.debugLineNum = 1256;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 1261;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
 //BA.debugLineNum = 1262;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
 //BA.debugLineNum = 1270;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
 //BA.debugLineNum = 1272;BA.debugLine="If Precio <> PrecioLista Then";
if (_precio!=_preciolista) { 
 //BA.debugLineNum = 1273;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = anywheresoftware.b4a.keywords.Common.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 };
 //BA.debugLineNum = 1276;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
if (_dscto_real>_valor_dscto) { 
 //BA.debugLineNum = 1278;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
 //BA.debugLineNum = 1281;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 1286;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 };
 };
 }else {
 //BA.debugLineNum = 1308;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 1314;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1316;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 }else {
 //BA.debugLineNum = 1320;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 };
 //BA.debugLineNum = 1326;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1328;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1329;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 1330;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 1331;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
 //BA.debugLineNum = 1332;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
 //BA.debugLineNum = 1334;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 //BA.debugLineNum = 1336;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
 //BA.debugLineNum = 1337;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
_preciobruto = anywheresoftware.b4a.keywords.Common.Round2(_precio*_impuestos,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 1339;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
 //BA.debugLineNum = 1340;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 };
 //BA.debugLineNum = 1343;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
 //BA.debugLineNum = 1345;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
 //BA.debugLineNum = 1346;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 };
 }else {
 //BA.debugLineNum = 1352;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
 //BA.debugLineNum = 1353;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 1354;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 1355;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
 //BA.debugLineNum = 1356;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 //BA.debugLineNum = 1358;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
 //BA.debugLineNum = 1359;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 1361;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
 //BA.debugLineNum = 1363;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
 //BA.debugLineNum = 1364;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 };
 };
 //BA.debugLineNum = 1420;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
 //BA.debugLineNum = 1422;BA.debugLine="Dim Multiplo As Int";
_multiplo = 0;
 //BA.debugLineNum = 1424;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
 //BA.debugLineNum = 1425;BA.debugLine="Multiplo = -1";
_multiplo = (int) (-1);
 }else if((_tict).equals("R")) { 
 //BA.debugLineNum = 1427;BA.debugLine="Multiplo = 1";
_multiplo = (int) (1);
 };
 //BA.debugLineNum = 1430;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
 //BA.debugLineNum = 1432;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*_multiplo;
 //BA.debugLineNum = 1433;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 }else {
 //BA.debugLineNum = 1437;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*_multiplo;
 //BA.debugLineNum = 1438;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 };
 };
 //BA.debugLineNum = 1444;BA.debugLine="If Prct = 0 Then";
if ((_prct).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 1446;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
 //BA.debugLineNum = 1448;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud1,(int) (5));
 //BA.debugLineNum = 1449;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud2,(int) (5));
 //BA.debugLineNum = 1451;BA.debugLine="If Chk_Valores_Netos.Checked = False Then";
if (mostCurrent._chk_valores_netos.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 1452;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 };
 }else {
 //BA.debugLineNum = 1456;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
 //BA.debugLineNum = 1457;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 };
 };
 //BA.debugLineNum = 1498;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = anywheresoftware.b4a.keywords.Common.Round2(_totalila,(int) (2));
 //BA.debugLineNum = 1499;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = anywheresoftware.b4a.keywords.Common.Round2(_totaliva,(int) (2));
 //BA.debugLineNum = 1500;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
 //BA.debugLineNum = 1501;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto,(int) (0));
 //BA.debugLineNum = 1510;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
_fila.Put((Object)("cantidad"),(Object)(_cantidad));
 //BA.debugLineNum = 1511;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
_fila.Put((Object)("cantud1"),(Object)(_cantud1));
 //BA.debugLineNum = 1512;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
_fila.Put((Object)("cantud2"),(Object)(_cantud2));
 //BA.debugLineNum = 1514;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
_fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
 //BA.debugLineNum = 1515;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
_fila.Put((Object)("valivalinea"),(Object)(_totaliva));
 //BA.debugLineNum = 1516;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
_fila.Put((Object)("valilalinea"),(Object)(_totalila));
 //BA.debugLineNum = 1517;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
_fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
 //BA.debugLineNum = 1519;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
_fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
 //BA.debugLineNum = 1520;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
_fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
 //BA.debugLineNum = 1522;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
_fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
 //BA.debugLineNum = 1523;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
_fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
 //BA.debugLineNum = 1525;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row_Us";
_fila.Put((Object)("codfuncionario"),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 1526;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Usuar";
_fila.Put((Object)("codvendedor"),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 1528;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_Doc";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_fila,_fila_id);
 //BA.debugLineNum = 1530;BA.debugLine="Sb_Cargar_Detalle(True)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1535;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_productomodoconsulta() throws Exception{
ResumableSub_Sb_ProductoModoConsulta rsub = new ResumableSub_Sb_ProductoModoConsulta(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_ProductoModoConsulta extends BA.ResumableSub {
public ResumableSub_Sb_ProductoModoConsulta(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _result = 0;

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
 //BA.debugLineNum = 1570;BA.debugLine="If B4A_DespachoSimple And XclvDetalle.Size = 0 An";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._b4a_despachosimple && parent.mostCurrent._xclvdetalle._getsize()==0 && (parent.mostCurrent._lbl_tipodespacho.getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1573;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1575;BA.debugLine="Msgbox2Async(\"No existe tipo de despacho\" & CRLF";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe tipo de despacho"+anywheresoftware.b4a.keywords.Common.CRLF+"Indique su opción."),BA.ObjectToCharSequence("Validación"),"SOLO CONSULTAR PRODUCTO","","CANCELAR",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1577;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1579;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 1580;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = True";
parent.mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 1582;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1587;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 1588;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_recorrer_detalle_rev_stock() throws Exception{
ResumableSub_Sb_Recorrer_Detalle_Rev_Stock rsub = new ResumableSub_Sb_Recorrer_Detalle_Rev_Stock(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Recorrer_Detalle_Rev_Stock extends BA.ResumableSub {
public ResumableSub_Sb_Recorrer_Detalle_Rev_Stock(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
anywheresoftware.b4a.sql.SQL _sql = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _detalle = null;
int _proconstockinsuficiente = 0;
String _empresa = "";
String _sucursal = "";
String _bodega = "";
String _codigo = "";
double _cantidad = 0;
int _untrans = 0;
String _tidopa = "";
String _tict = "";
boolean _prct = false;
String _tido = "";
boolean _result = false;

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
 //BA.debugLineNum = 3975;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
 //BA.debugLineNum = 3976;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 3977;BA.debugLine="Dim ProConStockInsuficiente As Int";
_proconstockinsuficiente = 0;
 //BA.debugLineNum = 3979;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 3980;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
 //BA.debugLineNum = 3982;BA.debugLine="ProgressDialogShow(\"Revisando stock...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Revisando stock..."));
 //BA.debugLineNum = 3984;BA.debugLine="Do While Detalle.NextRow";
if (true) break;

case 1:
//do while
this.state = 12;
while (_detalle.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3986;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
parent._id_docdet = (int)(Double.parseDouble(_detalle.GetString("Id_DocDet")));
 //BA.debugLineNum = 3987;BA.debugLine="Dim	Empresa As String = Detalle.GetString(\"Empre";
_empresa = _detalle.GetString("Empresa");
 //BA.debugLineNum = 3988;BA.debugLine="Dim	Sucursal As String = Detalle.GetString(\"Sucu";
_sucursal = _detalle.GetString("Sucursal");
 //BA.debugLineNum = 3989;BA.debugLine="Dim	Bodega As String = Detalle.GetString(\"Bodega";
_bodega = _detalle.GetString("Bodega");
 //BA.debugLineNum = 3990;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
 //BA.debugLineNum = 3991;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
 //BA.debugLineNum = 3992;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
 //BA.debugLineNum = 3993;BA.debugLine="Dim	Tidopa As String";
_tidopa = "";
 //BA.debugLineNum = 3995;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
 //BA.debugLineNum = 3996;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
 //BA.debugLineNum = 3998;BA.debugLine="Dim	Tido As String";
_tido = "";
 //BA.debugLineNum = 4000;BA.debugLine="If Prct = False Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_prct==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 4002;BA.debugLine="Wait For(Sb_Revisar_Stock_X_Fila(Id_DocDet,Tido";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_revisar_stock_x_fila(parent._id_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,""));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 4004;BA.debugLine="If Result = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4005;BA.debugLine="ProConStockInsuficiente = ProConStockInsuficie";
_proconstockinsuficiente = (int) (_proconstockinsuficiente+1);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 1;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 4012;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 4014;BA.debugLine="If ProConStockInsuficiente > 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_proconstockinsuficiente>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 4015;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 4018;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 4020;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisar_stock_x_fila(int _vid_docdet,String _tido,String _codigo,String _empresa,String _sucursal,String _bodega,double _cantidad,int _untrans,String _tidopa) throws Exception{
ResumableSub_Sb_Revisar_Stock_X_Fila rsub = new ResumableSub_Sb_Revisar_Stock_X_Fila(null,_vid_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,_tidopa);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Revisar_Stock_X_Fila extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_Stock_X_Fila(BaKapp.Movil.Tag.frm_post_01_formulario parent,int _vid_docdet,String _tido,String _codigo,String _empresa,String _sucursal,String _bodega,double _cantidad,int _untrans,String _tidopa) {
this.parent = parent;
this._vid_docdet = _vid_docdet;
this._tido = _tido;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this._cantidad = _cantidad;
this._untrans = _untrans;
this._tidopa = _tidopa;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _vid_docdet;
String _tido;
String _codigo;
String _empresa;
String _sucursal;
String _bodega;
double _cantidad;
int _untrans;
String _tidopa;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _filastk = null;
double _stock_disponible = 0;
double _stock_fisico = 0;
boolean _stock_suficiente = false;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
Object _sf = null;

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
 //BA.debugLineNum = 4032;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_revisar_stock_fila /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa);
 //BA.debugLineNum = 4034;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 27;
return;
case 27:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 4036;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 26;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 25;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4038;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 4040;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 23;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 22;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 4042;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 4043;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
_filastk = new anywheresoftware.b4a.objects.collections.Map();
_filastk = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 4045;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"S";
_stock_disponible = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Disponible"))));
 //BA.debugLineNum = 4046;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stock";
_stock_fisico = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Fisico"))));
 //BA.debugLineNum = 4047;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible & \"";
anywheresoftware.b4a.keywords.Common.LogImpl("044761113","Stock disponible: "+BA.NumberToString(_stock_disponible)+", Stock fisico: "+BA.NumberToString(_stock_fisico),0);
 //BA.debugLineNum = 4049;BA.debugLine="Dim Stock_Suficiente As Boolean";
_stock_suficiente = false;
 //BA.debugLineNum = 4051;BA.debugLine="If Stock_Disponible <= 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_stock_disponible<=0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 16;
 //BA.debugLineNum = 4052;BA.debugLine="Stock_Suficiente = False";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 4054;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_stock_disponible-_cantidad>=0) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 4055;BA.debugLine="Stock_Suficiente = True";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 4059;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","stockbodega",(Object)(_stock_disponible),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(_vid_docdet)}));
 //BA.debugLineNum = 4063;BA.debugLine="If Stock_Suficiente = False Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_stock_suficiente==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 4064;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 4069;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4070;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pudo";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService..."),BA.ObjectToCharSequence("Error de comunicación"),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 4071;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 4076;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("044761142",_js._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = -1;
;
 //BA.debugLineNum = 4079;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 4081;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_sumar_totales() throws Exception{
ResumableSub_Sb_Sumar_Totales rsub = new ResumableSub_Sb_Sumar_Totales(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Sumar_Totales extends BA.ResumableSub {
public ResumableSub_Sb_Sumar_Totales(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _accion = false;
double _total_neto = 0;
double _canttotal = 0;
String _items = "";
String _decimal = "";
String _moneda = "";
anywheresoftware.b4a.sql.SQL _sql = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _detalle = null;
double _cantidad = 0;
double _precio = 0;
double _valnetolinea = 0;
String _tict = "";
int _untrans = 0;
double _cant = 0;
String _itemstr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1658;BA.debugLine="Wait For(Fx_Validar_Descuentos_Globales) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_validar_descuentos_globales());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_accion = (Boolean) result[0];
;
 //BA.debugLineNum = 1661;BA.debugLine="Dim Total_Neto As Double";
_total_neto = 0;
 //BA.debugLineNum = 1662;BA.debugLine="Dim CantTotal As Double = 0";
_canttotal = 0;
 //BA.debugLineNum = 1663;BA.debugLine="Dim Items = 0";
_items = BA.NumberToString(0);
 //BA.debugLineNum = 1664;BA.debugLine="Dim Decimal = 0";
_decimal = BA.NumberToString(0);
 //BA.debugLineNum = 1665;BA.debugLine="Dim Moneda As String '= _TblEncabezado.Rows(0).It";
_moneda = "";
 //BA.debugLineNum = 1667;BA.debugLine="If Moneda <> \"$\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_moneda).equals("$") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1668;BA.debugLine="Decimal = 2";
_decimal = BA.NumberToString(2);
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1671;BA.debugLine="Dim Total_Neto As Double";
_total_neto = 0;
 //BA.debugLineNum = 1673;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
 //BA.debugLineNum = 1674;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 1676;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 1678;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
 //BA.debugLineNum = 1680;BA.debugLine="Hay_Descuentos_Globales = False";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 1682;BA.debugLine="Do While Detalle.NextRow";
if (true) break;

case 5:
//do while
this.state = 12;
while (_detalle.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 1684;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
 //BA.debugLineNum = 1685;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
_precio = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Precio")),0)));
 //BA.debugLineNum = 1686;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
_valnetolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("ValNetoLinea")),0)));
 //BA.debugLineNum = 1687;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
 //BA.debugLineNum = 1688;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
 //BA.debugLineNum = 1690;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_tict).equals("D")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 1691;BA.debugLine="Hay_Descuentos_Globales = True";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 5;
;
 //BA.debugLineNum = 1694;BA.debugLine="Dim Cant As Double=Funciones.Fx_NuloPorNro(Detal";
_cant = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("CantUd"+BA.NumberToString(_untrans))),0)));
 //BA.debugLineNum = 1696;BA.debugLine="CantTotal = CantTotal+ Round2(Cant,0)";
_canttotal = _canttotal+anywheresoftware.b4a.keywords.Common.Round2(_cant,(int) (0));
 //BA.debugLineNum = 1698;BA.debugLine="Total_Neto = Total_Neto + ValNetoLinea";
_total_neto = _total_neto+_valnetolinea;
 //BA.debugLineNum = 1700;BA.debugLine="Items = Items+1";
_items = BA.NumberToString((double)(Double.parseDouble(_items))+1);
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1705;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izquie";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,_items,(int) (2),"0");
 //BA.debugLineNum = 1706;BA.debugLine="If ItemStr = \"00\" Then ItemStr = 0";
if (true) break;

case 13:
//if
this.state = 18;
if ((_itemstr).equals("00")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_itemstr = BA.NumberToString(0);
if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 1707;BA.debugLine="Lbl_Items.Text = \"Total Items: \" & ItemStr";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence("Total Items: "+_itemstr));
 //BA.debugLineNum = 1709;BA.debugLine="Lbl_Total_Neto.Tag = Round2(Total_Neto,0)";
parent.mostCurrent._lbl_total_neto.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2(_total_neto,(int) (0))));
 //BA.debugLineNum = 1710;BA.debugLine="Lbl_Total_Iva.Tag = Round2(Total_Neto*0.19,0)";
parent.mostCurrent._lbl_total_iva.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2(_total_neto*0.19,(int) (0))));
 //BA.debugLineNum = 1711;BA.debugLine="Lbl_Total_Impuestos.Tag = 0";
parent.mostCurrent._lbl_total_impuestos.setTag((Object)(0));
 //BA.debugLineNum = 1712;BA.debugLine="Lbl_Total_Bruto.Tag = Round2(Lbl_Total_Neto.Tag+L";
parent.mostCurrent._lbl_total_bruto.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag()))+(double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_iva.getTag())),(int) (0))));
 //BA.debugLineNum = 1714;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1715;BA.debugLine="Lbl_Total_Iva.Text =  \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_iva.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_iva.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1716;BA.debugLine="Lbl_Total_Impuestos.Text  = \"$ \" & NumberFormat(L";
parent.mostCurrent._lbl_total_impuestos.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_impuestos.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1717;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1718;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Bru";
parent.mostCurrent._lbl_total_bruto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_bruto.getTag())),(int) (0),(int) (0))));
 //BA.debugLineNum = 1720;BA.debugLine="Fila_Encabezado.Put(\"TotalNetoDoc\".ToLowerCase,Lb";
parent._fila_encabezado.Put((Object)("TotalNetoDoc".toLowerCase()),parent.mostCurrent._lbl_total_neto.getTag());
 //BA.debugLineNum = 1721;BA.debugLine="Fila_Encabezado.Put(\"TotalIvaDoc\".ToLowerCase,Lbl";
parent._fila_encabezado.Put((Object)("TotalIvaDoc".toLowerCase()),parent.mostCurrent._lbl_total_iva.getTag());
 //BA.debugLineNum = 1722;BA.debugLine="Fila_Encabezado.Put(\"TotalBrutoDoc\".ToLowerCase,L";
parent._fila_encabezado.Put((Object)("TotalBrutoDoc".toLowerCase()),parent.mostCurrent._lbl_total_bruto.getTag());
 //BA.debugLineNum = 1724;BA.debugLine="Fila_Encabezado.Put(\"CantTotal\".ToLowerCase,CantT";
parent._fila_encabezado.Put((Object)("CantTotal".toLowerCase()),(Object)(_canttotal));
 //BA.debugLineNum = 1727;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 //BA.debugLineNum = 1729;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_titulo() throws Exception{
ResumableSub_Sb_Titulo rsub = new ResumableSub_Sb_Titulo(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Titulo extends BA.ResumableSub {
public ResumableSub_Sb_Titulo(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;

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
 //BA.debugLineNum = 287;BA.debugLine="Activity.Title = \"New Doc...\" & Variables.Gl_Sucu";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("New Doc..."+parent.mostCurrent._variables._gl_sucursal /*String*/ ));
 //BA.debugLineNum = 289;BA.debugLine="If Crear_NVV_Desde_COV Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._crear_nvv_desde_cov) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 //BA.debugLineNum = 290;BA.debugLine="Activity.Title = \"NVV desde COV: \" & Nudo_Origen";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("NVV desde COV: "+parent._nudo_origen));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 292;BA.debugLine="If Editar_Documento Then";
if (true) break;

case 6:
//if
this.state = 9;
if (parent._editar_documento) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 293;BA.debugLine="Activity.Title = \"Editando: \" & TipoDoc & \"-\" &";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("Editando: "+parent._tipodoc+"-"+parent._nudo_origen));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 297;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_trae_secueven(String _secueven) throws Exception{
ResumableSub_Sb_Trae_Secueven rsub = new ResumableSub_Sb_Trae_Secueven(null,_secueven);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Trae_Secueven extends BA.ResumableSub {
public ResumableSub_Sb_Trae_Secueven(BaKapp.Movil.Tag.frm_post_01_formulario parent,String _secueven) {
this.parent = parent;
this._secueven = _secueven;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
String _secueven;
BaKapp.Movil.Tag.tidonudo _vsb_tidonotido = null;
String _tido = "";
String _notido = "";

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
 //BA.debugLineNum = 2200;BA.debugLine="Dim vSb_TidoNotido As TidoNudo";
_vsb_tidonotido = new BaKapp.Movil.Tag.tidonudo();
 //BA.debugLineNum = 2201;BA.debugLine="vSb_TidoNotido.Initialize";
_vsb_tidonotido._initialize /*String*/ (processBA);
 //BA.debugLineNum = 2203;BA.debugLine="Dim Tido As String";
_tido = "";
 //BA.debugLineNum = 2204;BA.debugLine="Dim Notido As String";
_notido = "";
 //BA.debugLineNum = 2206;BA.debugLine="Select Case Secueven";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_secueven,"NGF","NFG","NGB","NBG")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 //BA.debugLineNum = 2208;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_tido = "GDV";
 //BA.debugLineNum = 2208;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_notido = "GUIA DE DESPACHO DE VENTA";
 if (true) break;

case 5:
//C
this.state = 12;
 //BA.debugLineNum = 2210;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
_tido = "FCV";
 //BA.debugLineNum = 2210;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
_notido = "FACTURA DE VENTA";
 if (true) break;

case 7:
//C
this.state = 12;
 //BA.debugLineNum = 2212;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_tido = "GDV";
 //BA.debugLineNum = 2212;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_notido = "GUIA DE DESPACHO DE VENTA";
 if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 2214;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
_tido = "BLV";
 //BA.debugLineNum = 2214;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
_notido = "BOLETA DE VENTA";
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 2216;BA.debugLine="Tido = \"\": Notido = \"\"";
_tido = "";
 //BA.debugLineNum = 2216;BA.debugLine="Tido = \"\": Notido = \"\"";
_notido = "";
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 2219;BA.debugLine="vSb_TidoNotido.Tido = Tido";
_vsb_tidonotido._tido /*String*/  = _tido;
 //BA.debugLineNum = 2220;BA.debugLine="vSb_TidoNotido.Notido = Notido";
_vsb_tidonotido._notido /*String*/  = _notido;
 //BA.debugLineNum = 2222;BA.debugLine="Return vSb_TidoNotido";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_vsb_tidonotido));return;};
 //BA.debugLineNum = 2224;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_traer_concepto(String _concepto) throws Exception{
ResumableSub_Sb_Traer_Concepto rsub = new ResumableSub_Sb_Traer_Concepto(null,_concepto);
rsub.resume(processBA, null);
}
public static class ResumableSub_Sb_Traer_Concepto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Concepto(BaKapp.Movil.Tag.frm_post_01_formulario parent,String _concepto) {
this.parent = parent;
this._concepto = _concepto;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
String _concepto;
String _empresa = "";
String _sucursal = "";
String _bodega = "";
String _lista = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
anywheresoftware.b4a.objects.collections.Map _new_row = null;
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
 //BA.debugLineNum = 800;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 801;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
 //BA.debugLineNum = 802;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
 //BA.debugLineNum = 803;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
 //BA.debugLineNum = 805;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 807;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_concepto,_empresa,_sucursal,_bodega,_lista,"");
 //BA.debugLineNum = 809;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 810;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando concepto..."));
 //BA.debugLineNum = 812;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 814;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 816;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 818;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 819;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 821;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
 //BA.debugLineNum = 823;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 824;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 825;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 827;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 829;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
 //BA.debugLineNum = 830;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 832;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 833;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consul";
_fila = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 835;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 837;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 838;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 840;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
 //BA.debugLineNum = 842;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Fila)";
_sb_procesar_fila("DescuentoPorc",(int)(BA.ObjectToNumber(_fila)));
 //BA.debugLineNum = 844;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 845;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 850;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("042598452",_js._errormessage /*String*/ ,0);
 //BA.debugLineNum = 851;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 853;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
 //BA.debugLineNum = 854;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 857;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_visibleocultardespachosimple() throws Exception{
ResumableSub_Sb_VisibleOcultarDespachoSimple rsub = new ResumableSub_Sb_VisibleOcultarDespachoSimple(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_VisibleOcultarDespachoSimple extends BA.ResumableSub {
public ResumableSub_Sb_VisibleOcultarDespachoSimple(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _enbdesp = false;

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
 //BA.debugLineNum = 4306;BA.debugLine="If B4A_DespachoSimple = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._b4a_despachosimple==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4307;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 4311;BA.debugLine="Dim EnbDesp As Boolean";
_enbdesp = false;
 //BA.debugLineNum = 4313;BA.debugLine="If Lbl_TipoDespacho.Text.Contains(\"DESPACHO\") The";
if (true) break;

case 5:
//if
this.state = 10;
if (parent.mostCurrent._lbl_tipodespacho.getText().contains("DESPACHO")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 4314;BA.debugLine="EnbDesp = True";
_enbdesp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4316;BA.debugLine="EnbDesp = False";
_enbdesp = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 4319;BA.debugLine="Txt_DireccionDesp.Visible = EnbDesp";
parent.mostCurrent._txt_direcciondesp.setVisible(_enbdesp);
 //BA.debugLineNum = 4320;BA.debugLine="Txt_ObservacionesDesp.Visible = EnbDesp";
parent.mostCurrent._txt_observacionesdesp.setVisible(_enbdesp);
 //BA.debugLineNum = 4321;BA.debugLine="Txt_TransporteDesp.Visible = EnbDesp";
parent.mostCurrent._txt_transportedesp.setVisible(_enbdesp);
 //BA.debugLineNum = 4323;BA.debugLine="Lbl_DireccionDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_direcciondesp.setVisible(_enbdesp);
 //BA.debugLineNum = 4324;BA.debugLine="Lbl_TransporteDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_transportedesp.setVisible(_enbdesp);
 //BA.debugLineNum = 4325;BA.debugLine="Lbl_ObservacionesDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_observacionesdesp.setVisible(_enbdesp);
 //BA.debugLineNum = 4326;BA.debugLine="Lbl_Observaciones.Visible = EnbDesp";
parent.mostCurrent._lbl_observaciones.setVisible(_enbdesp);
 //BA.debugLineNum = 4327;BA.debugLine="Txt_Observaciones.Visible = Not(EnbDesp)";
parent.mostCurrent._txt_observaciones.setVisible(anywheresoftware.b4a.keywords.Common.Not(_enbdesp));
 //BA.debugLineNum = 4329;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 4331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _tab_post_tabchanged() throws Exception{
 //BA.debugLineNum = 1731;BA.debugLine="Sub Tab_Post_TabChanged";
 //BA.debugLineNum = 1733;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_row_entidad.IsInitialized())) { 
 //BA.debugLineNum = 1735;BA.debugLine="If Tab_Post.CurrentTab <> 0 Then";
if (mostCurrent._tab_post.getCurrentTab()!=0) { 
 //BA.debugLineNum = 1737;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 1738;BA.debugLine="Msgbox2Async(\"Debe ingresar la entidad\",\"Valida";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Debe ingresar la entidad"),BA.ObjectToCharSequence("Validación"),"Ok","","",mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1739;BA.debugLine="Tab_Post.CurrentTab = 0";
mostCurrent._tab_post.setCurrentTab((int) (0));
 };
 };
 //BA.debugLineNum = 1745;BA.debugLine="If Tab_Post.CurrentTab = 2 Then";
if (mostCurrent._tab_post.getCurrentTab()==2) { 
 //BA.debugLineNum = 1747;BA.debugLine="Chk_Valores_Netos.Checked = True";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1749;BA.debugLine="Lbl_Total_Neto.Text = NumberFormat(Lbl_Total_Net";
mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (0))));
 //BA.debugLineNum = 1750;BA.debugLine="Lbl_Total_Iva.Text = NumberFormat(Lbl_Total_Iva.";
mostCurrent._lbl_total_iva.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_iva.getTag())),(int) (0),(int) (0))));
 //BA.debugLineNum = 1751;BA.debugLine="Lbl_Total_Impuestos.Text = NumberFormat(Lbl_Tota";
mostCurrent._lbl_total_impuestos.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_impuestos.getTag())),(int) (0),(int) (0))));
 //BA.debugLineNum = 1752;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Br";
mostCurrent._lbl_total_bruto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_bruto.getTag())),(int) (0),(int) (0))));
 };
 //BA.debugLineNum = 1756;BA.debugLine="End Sub";
return "";
}
public static void  _txt_codigo_enterpressed() throws Exception{
ResumableSub_Txt_Codigo_EnterPressed rsub = new ResumableSub_Txt_Codigo_EnterPressed(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Txt_Codigo_EnterPressed extends BA.ResumableSub {
public ResumableSub_Txt_Codigo_EnterPressed(BaKapp.Movil.Tag.frm_post_01_formulario parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
boolean _rsmoscs = false;
boolean _resultado = false;
String _codigo = "";
String _empresa = "";
String _sucursal = "";
String _bodega = "";
String _lista = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _errorstr = "";
anywheresoftware.b4a.objects.collections.Map _new_row = null;
long _fechaemision = 0L;
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
 //BA.debugLineNum = 694;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 696;BA.debugLine="If	Hay_Descuentos_Globales Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._hay_descuentos_globales) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 697;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE AGREMAR MAS ITEM"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 700;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 703;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _sb_productomodoconsulta());
this.state = 31;
return;
case 31:
//C
this.state = 5;
_rsmoscs = (Boolean) result[0];
;
 //BA.debugLineNum = 704;BA.debugLine="If Not(RsMosCs) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.Not(_rsmoscs)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 705;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 708;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, this, _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 32;
return;
case 32:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
 //BA.debugLineNum = 709;BA.debugLine="If Not(Resultado) Then";
if (true) break;

case 9:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(_resultado)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 710;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 713;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 715;BA.debugLine="Dim Codigo As String = Txt_Codigo.Text.Trim";
_codigo = parent.mostCurrent._txt_codigo.getText().trim();
 //BA.debugLineNum = 717;BA.debugLine="If Codigo = \"\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_codigo).equals("")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 718;BA.debugLine="Txt_Codigo.Text = \"\"";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 719;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 //BA.debugLineNum = 720;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 723;BA.debugLine="ProgressDialogShow(\"Buscando producto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando producto..."));
 //BA.debugLineNum = 725;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
 //BA.debugLineNum = 726;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
 //BA.debugLineNum = 727;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
 //BA.debugLineNum = 728;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 730;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
 //BA.debugLineNum = 732;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_js));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 734;BA.debugLine="If Js.Success Then";
if (true) break;

case 17:
//if
this.state = 30;
if (_js._success /*boolean*/ ) { 
this.state = 19;
}else {
this.state = 29;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 736;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 738;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 20:
//if
this.state = 27;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 740;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ ());
 //BA.debugLineNum = 741;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 743;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Codigo\")";
_errorstr = BA.ObjectToString(_fila.Get((Object)("Codigo")));
 //BA.debugLineNum = 745;BA.debugLine="If ErrorStr.Contains(\"Error_\")  Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_errorstr.contains("Error_")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 746;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 747;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
 //BA.debugLineNum = 748;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 //BA.debugLineNum = 749;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 752;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
 //BA.debugLineNum = 754;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 756;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
 //BA.debugLineNum = 757;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 759;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 762;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 764;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
 //BA.debugLineNum = 765;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
 //BA.debugLineNum = 767;BA.debugLine="New_Row.Put(\"moneda\",Variables.Global_Row_Moned";
_new_row.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 768;BA.debugLine="New_Row.Put(\"tipo_moneda\",Variables.Global_Row_";
_new_row.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 769;BA.debugLine="New_Row.Put(\"tipo_cambio\",Variables.Global_Row_";
_new_row.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 770;BA.debugLine="New_Row.Put(\"codlista\",Lista)";
_new_row.Put((Object)("codlista"),(Object)(_lista));
 //BA.debugLineNum = 772;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 774;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 775;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 777;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
 //BA.debugLineNum = 779;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 780;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 785;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("042532960",_js._errormessage /*String*/ ,0);
 //BA.debugLineNum = 788;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
 //BA.debugLineNum = 789;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 if (true) break;

case 30:
//C
this.state = -1;
;
 //BA.debugLineNum = 792;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xclvdetalle_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 2357;BA.debugLine="Private Sub XclvDetalle_ItemClick (Index As Int, V";
 //BA.debugLineNum = 2359;BA.debugLine="End Sub";
return "";
}
public static void  _xclvdetalle_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_XclvDetalle_ItemLongClick rsub = new ResumableSub_XclvDetalle_ItemLongClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_XclvDetalle_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDetalle_ItemLongClick(BaKapp.Movil.Tag.frm_post_01_formulario parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
BaKapp.Movil.Tag.frm_post_01_formulario parent;
int _index;
Object _value;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblcodigo = null;
anywheresoftware.b4a.objects.LabelWrapper _lbldescripcion = null;
anywheresoftware.b4a.objects.LabelWrapper _lblitem = null;
boolean _prct = false;
String _tict = "";
String _editar = "";
Object _sf = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _fila_id = null;
anywheresoftware.b4a.objects.collections.Map _fila_dscto = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
String _rownumber = "";
int _i = 0;
String _itemstr = "";
int step49;
int limit49;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2259;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 2260;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_index);
 //BA.debugLineNum = 2261;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 2262;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
_lblcodigo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblcodigo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 2263;BA.debugLine="Dim LblDescripcion As Label = p.GetView(1)";
_lbldescripcion = new anywheresoftware.b4a.objects.LabelWrapper();
_lbldescripcion = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (1)).getObject()));
 //BA.debugLineNum = 2264;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
 //BA.debugLineNum = 2265;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(LblItem.Tag";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_lblitem.getTag())));
 //BA.debugLineNum = 2266;BA.debugLine="Dim Tict As String = LblDescripcion.Tag";
_tict = BA.ObjectToString(_lbldescripcion.getTag());
 //BA.debugLineNum = 2269;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
 //BA.debugLineNum = 2271;BA.debugLine="Dim Editar As String = \"Editar\"";
_editar = "Editar";
 //BA.debugLineNum = 2273;BA.debugLine="If Prct Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_prct) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
 //BA.debugLineNum = 2274;BA.debugLine="Editar = \"\"";
_editar = "";
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 2276;BA.debugLine="If	Hay_Descuentos_Globales Then";
if (true) break;

case 6:
//if
this.state = 9;
if (parent._hay_descuentos_globales) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 2277;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
 //BA.debugLineNum = 2278;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CR";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE HACER GESTION EN ESTA FILA"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 2281;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 2285;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(LblDescripcio";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbldescripcion.getText()),BA.ObjectToCharSequence("Código: "+_lblcodigo.getText()),_editar,"Cancelar","Eliminar",parent.mostCurrent._bmp1);
 //BA.debugLineNum = 2286;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 40;
return;
case 40:
//C
this.state = 11;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2288;BA.debugLine="Id_DocDet = LblCodigo.Tag";
parent._id_docdet = (int)(BA.ObjectToNumber(_lblcodigo.getTag()));
 //BA.debugLineNum = 2290;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 2292;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 //BA.debugLineNum = 2293;BA.debugLine="EditandoProducto = True";
parent._editandoproducto = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 2294;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = parent._id_docdet;
 //BA.debugLineNum = 2295;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 if (true) break;
;
 //BA.debugLineNum = 2299;BA.debugLine="If Result = xui.DialogResponse_Negative Then";

case 14:
//if
this.state = 39;
if (_result==_xui.DialogResponse_Negative) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 2301;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma l";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma la eliminación de este articulo?"),BA.ObjectToCharSequence("Código: "+_lblcodigo.getText()),"SI","","NO",parent.mostCurrent._bmp1);
 //BA.debugLineNum = 2302;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, _sf);
this.state = 41;
return;
case 41:
//C
this.state = 17;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 2304;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 17:
//if
this.state = 38;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 2306;BA.debugLine="Dim Fila_Id As Map";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2307;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 2308;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Con";
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 2309;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_fila_id);
 //BA.debugLineNum = 2311;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
 //BA.debugLineNum = 2312;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Vari";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 2314;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (true) break;

case 20:
//if
this.state = 23;
if (_fila_dscto.IsInitialized()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 2315;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuento";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 if (true) break;

case 23:
//C
this.state = 24;
;
 //BA.debugLineNum = 2319;BA.debugLine="p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p";
_p.SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300))),_p.getTop(),_p.getWidth(),_p.getHeight());
 //BA.debugLineNum = 2320;BA.debugLine="Sleep(600)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (600));
this.state = 42;
return;
case 42:
//C
this.state = 24;
;
 //BA.debugLineNum = 2321;BA.debugLine="XclvDetalle.RemoveAt(Index)";
parent.mostCurrent._xclvdetalle._removeat(_index);
 //BA.debugLineNum = 2323;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 2324;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
 //BA.debugLineNum = 2327;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (true) break;

case 24:
//if
this.state = 37;
if (_cursor1.getRowCount()>0) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 2329;BA.debugLine="Dim	RowNumber = Cursor1.RowCount";
_rownumber = BA.NumberToString(_cursor1.getRowCount());
 //BA.debugLineNum = 2331;BA.debugLine="For i = 0 To RowNumber-1";
if (true) break;

case 27:
//for
this.state = 36;
step49 = 1;
limit49 = (int) ((double)(Double.parseDouble(_rownumber))-1);
_i = (int) (0) ;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 36;
if ((step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49)) this.state = 29;
if (true) break;

case 44:
//C
this.state = 43;
_i = ((int)(0 + _i + step49)) ;
if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 2333;BA.debugLine="Try";
if (true) break;

case 30:
//try
this.state = 35;
this.catchState = 34;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 34;
 //BA.debugLineNum = 2334;BA.debugLine="Item = XclvDetalle.GetRawListItem(i)";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_i);
 //BA.debugLineNum = 2335;BA.debugLine="p = Item.Panel.GetView(0)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 2336;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
 //BA.debugLineNum = 2337;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_I";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_i+1),(int) (2),"0");
 //BA.debugLineNum = 2338;BA.debugLine="LblItem.Text = \"Item: \" & ItemStr";
_lblitem.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
 if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
 //BA.debugLineNum = 2340;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("043450451",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 35:
//C
this.state = 44;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 //BA.debugLineNum = 2347;BA.debugLine="Sb_Sumar_Totales";
_sb_sumar_totales();
 if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = -1;
;
 //BA.debugLineNum = 2355;BA.debugLine="End Sub";
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
}
