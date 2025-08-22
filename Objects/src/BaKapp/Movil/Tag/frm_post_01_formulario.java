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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "BaKapp.Movil.Tag", "BaKapp.Movil.Tag.frm_post_01_formulario");
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



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
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
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _nokolt = "";
String _name = "";
String _nombretabla = "";
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="Activity.LoadLayout(\"Cp_Post\")";
mostCurrent._activity.LoadLayout("Cp_Post",mostCurrent.activityBA);
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="CLFx2.Initialize(Null,\"\")";
mostCurrent._clfx2._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
mostCurrent._clfx2._designercreateview /*String*/ (null,(Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="Grabar = False";
_grabar = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17367053;
 //BA.debugLineNum = 17367053;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=17367053;
 //BA.debugLineNum = 17367053;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user_.png");
RDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Encabezado");
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_details.png");
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_details_.png");
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Detalle");
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calc.png");
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calc_.png");
RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Totales");
RDebugUtils.currentLine=17367062;
 //BA.debugLineNum = 17367062;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment.png");
RDebugUtils.currentLine=17367062;
 //BA.debugLineNum = 17367062;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment_.png");
RDebugUtils.currentLine=17367063;
 //BA.debugLineNum = 17367063;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Observaciones");
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="B4A_DespachoSimple = Variables.Global_Row_Configu";
_b4a_despachosimple = BA.ObjectToBoolean(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
RDebugUtils.currentLine=17367067;
 //BA.debugLineNum = 17367067;BA.debugLine="If B4A_DespachoSimple Then";
if (_b4a_despachosimple) { 
RDebugUtils.currentLine=17367069;
 //BA.debugLineNum = 17367069;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"delivery.png");
RDebugUtils.currentLine=17367069;
 //BA.debugLineNum = 17367069;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"delivery_.png");
RDebugUtils.currentLine=17367070;
 //BA.debugLineNum = 17367070;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Pos";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_DespSimple");
 };
RDebugUtils.currentLine=17367075;
 //BA.debugLineNum = 17367075;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
mostCurrent._cl_permisox._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=17367076;
 //BA.debugLineNum = 17367076;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
mostCurrent._cl_permisox._designercreateview /*String*/ (null,(Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=17367078;
 //BA.debugLineNum = 17367078;BA.debugLine="Tab_Post.CurrentTab = 1";
mostCurrent._tab_post.setCurrentTab((int) (1));
RDebugUtils.currentLine=17367080;
 //BA.debugLineNum = 17367080;BA.debugLine="InputTemplate.Initialize";
mostCurrent._inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17367081;
 //BA.debugLineNum = 17367081;BA.debugLine="LongTextTemplate.Initialize";
mostCurrent._longtexttemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17367082;
 //BA.debugLineNum = 17367082;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17367084;
 //BA.debugLineNum = 17367084;BA.debugLine="DespSimple_DocDestino.Initialize";
mostCurrent._despsimple_docdestino._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17367085;
 //BA.debugLineNum = 17367085;BA.debugLine="DespSimple_Tipo.Initialize";
mostCurrent._despsimple_tipo._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17367086;
 //BA.debugLineNum = 17367086;BA.debugLine="DespSimple_TipoPago.Initialize";
mostCurrent._despsimple_tipopago._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=17367088;
 //BA.debugLineNum = 17367088;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17367089;
 //BA.debugLineNum = 17367089;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=17367091;
 //BA.debugLineNum = 17367091;BA.debugLine="For Each Fila As Map In Variables.Global_Listas_P";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group34 = mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group34.Get(index34)));
RDebugUtils.currentLine=17367092;
 //BA.debugLineNum = 17367092;BA.debugLine="Dim Nokolt As String = Fila.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_fila.Get((Object)("Nokolt")));
RDebugUtils.currentLine=17367093;
 //BA.debugLineNum = 17367093;BA.debugLine="Dim Name As String = Nokolt.Trim";
_name = _nokolt.trim();
RDebugUtils.currentLine=17367094;
 //BA.debugLineNum = 17367094;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=17367096;
 //BA.debugLineNum = 17367096;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=17367097;
 //BA.debugLineNum = 17367097;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=17367099;
 //BA.debugLineNum = 17367099;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group41 = mostCurrent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen41 = group41.getSize()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group41.Get(index41)));
RDebugUtils.currentLine=17367101;
 //BA.debugLineNum = 17367101;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=17367102;
 //BA.debugLineNum = 17367102;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
RDebugUtils.currentLine=17367103;
 //BA.debugLineNum = 17367103;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=17367105;
 //BA.debugLineNum = 17367105;BA.debugLine="DespSimple_DocDestino.SetItems(Items)";
mostCurrent._despsimple_docdestino._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=17367106;
 //BA.debugLineNum = 17367106;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=17367108;
 //BA.debugLineNum = 17367108;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group48 = mostCurrent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen48 = group48.getSize()
;int index48 = 0;
;
for (; index48 < groupLen48;index48++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group48.Get(index48)));
RDebugUtils.currentLine=17367110;
 //BA.debugLineNum = 17367110;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=17367111;
 //BA.debugLineNum = 17367111;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
RDebugUtils.currentLine=17367112;
 //BA.debugLineNum = 17367112;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=17367114;
 //BA.debugLineNum = 17367114;BA.debugLine="DespSimple_Tipo.SetItems(Items)";
mostCurrent._despsimple_tipo._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=17367115;
 //BA.debugLineNum = 17367115;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=17367117;
 //BA.debugLineNum = 17367117;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group55 = mostCurrent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen55 = group55.getSize()
;int index55 = 0;
;
for (; index55 < groupLen55;index55++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group55.Get(index55)));
RDebugUtils.currentLine=17367119;
 //BA.debugLineNum = 17367119;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=17367120;
 //BA.debugLineNum = 17367120;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
RDebugUtils.currentLine=17367121;
 //BA.debugLineNum = 17367121;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=17367123;
 //BA.debugLineNum = 17367123;BA.debugLine="DespSimple_TipoPago.SetItems(Items)";
mostCurrent._despsimple_tipopago._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=17367124;
 //BA.debugLineNum = 17367124;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=17367126;
 //BA.debugLineNum = 17367126;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _vsalir = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"exit.png");
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de salir de la v";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de salir de la venta?"),BA.ObjectToCharSequence("S A L I R"),"Si","","No",(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc))));
RDebugUtils.currentLine=17891345;
 //BA.debugLineNum = 17891345;BA.debugLine="If Crear_NVV_Desde_COV Or Editar_Documento Or C";
if (_crear_nvv_desde_cov || _editar_documento || _cursor1.getRowCount()==0) { 
RDebugUtils.currentLine=17891347;
 //BA.debugLineNum = 17891347;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Encabezado_Doc","Id_DocEnc");
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Detalle_Doc","Id_DocEnc");
RDebugUtils.currentLine=17891349;
 //BA.debugLineNum = 17891349;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Descuentos_Doc","Id_DocEnc");
RDebugUtils.currentLine=17891350;
 //BA.debugLineNum = 17891350;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Impuestos_Doc","Id_DocEnc");
RDebugUtils.currentLine=17891351;
 //BA.debugLineNum = 17891351;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Observaciones_Doc","Id_DocEnc");
RDebugUtils.currentLine=17891352;
 //BA.debugLineNum = 17891352;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"DespaFacil_Doc","Id_DocEnc");
 }else {
RDebugUtils.currentLine=17891356;
 //BA.debugLineNum = 17891356;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 };
RDebugUtils.currentLine=17891360;
 //BA.debugLineNum = 17891360;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=17891362;
 //BA.debugLineNum = 17891362;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=17891366;
 //BA.debugLineNum = 17891366;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17891368;
 //BA.debugLineNum = 17891368;BA.debugLine="End Sub";
return false;
}
public static String  _sb_grabarobservacionesdespachos() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_grabarobservacionesdespachos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_grabarobservacionesdespachos", null));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub Sb_GrabarObservacionesDespachos";
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="If  Not(Txt_ObservacionesDesp.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._txt_observacionesdesp.IsInitialized())) { 
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="If Txt_ObservacionesDesp.Visible Then";
if (mostCurrent._txt_observacionesdesp.getVisible()) { 
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="Txt_Observaciones.Text = Txt_ObservacionesDesp.T";
mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(mostCurrent._txt_observacionesdesp.getText()));
 };
RDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="Fila_Observaciones.Put(\"Observaciones\",Txt_Observ";
_fila_observaciones.Put((Object)("Observaciones"),(Object)(mostCurrent._txt_observaciones.getText()));
RDebugUtils.currentLine=20381707;
 //BA.debugLineNum = 20381707;BA.debugLine="Fila_Observaciones.Put(\"Orden_compra\",Txt_Orden_c";
_fila_observaciones.Put((Object)("Orden_compra"),(Object)(mostCurrent._txt_orden_compra.getText()));
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observacion";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Observaciones_Doc",_fila_observaciones,mostCurrent._fila_idenc);
RDebugUtils.currentLine=20381710;
 //BA.debugLineNum = 20381710;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\",Lbl_TipoDes";
_fila_despafacil.Put((Object)("CodTipoDespacho"),mostCurrent._lbl_tipodespacho.getTag());
RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\",Lbl_TipoDespac";
_fila_despafacil.Put((Object)("TipoDespacho"),(Object)(mostCurrent._lbl_tipodespacho.getText()));
RDebugUtils.currentLine=20381712;
 //BA.debugLineNum = 20381712;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\",Lbl_TipoPag";
_fila_despafacil.Put((Object)("CodTipoPagoDesp"),mostCurrent._lbl_tipopagodesp.getTag());
RDebugUtils.currentLine=20381713;
 //BA.debugLineNum = 20381713;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\",Lbl_TipoPagoDe";
_fila_despafacil.Put((Object)("TipoPagoDesp"),(Object)(mostCurrent._lbl_tipopagodesp.getText()));
RDebugUtils.currentLine=20381714;
 //BA.debugLineNum = 20381714;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\",Lbl_CodDocDes";
_fila_despafacil.Put((Object)("CodDocDestino"),mostCurrent._lbl_coddocdestino.getTag());
RDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\",Lbl_CodDocDestin";
_fila_despafacil.Put((Object)("DocDestino"),(Object)(mostCurrent._lbl_coddocdestino.getText()));
RDebugUtils.currentLine=20381716;
 //BA.debugLineNum = 20381716;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\",Txt_Transpor";
_fila_despafacil.Put((Object)("TransporteDesp"),(Object)(mostCurrent._txt_transportedesp.getText()));
RDebugUtils.currentLine=20381717;
 //BA.debugLineNum = 20381717;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\",Txt_Direccion";
_fila_despafacil.Put((Object)("DireccionDesp"),(Object)(mostCurrent._txt_direcciondesp.getText()));
RDebugUtils.currentLine=20381718;
 //BA.debugLineNum = 20381718;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\",Txt_Obser";
_fila_despafacil.Put((Object)("ObservacionesDesp"),(Object)(mostCurrent._txt_observacionesdesp.getText()));
RDebugUtils.currentLine=20381719;
 //BA.debugLineNum = 20381719;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFacil_";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"DespaFacil_Doc",_fila_despafacil,mostCurrent._fila_idenc);
RDebugUtils.currentLine=20381721;
 //BA.debugLineNum = 20381721;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Hay_Descuentos_Globales = False";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "activity_resume"), _sb_titulo());
this.state = 37;
return;
case 37:
//C
this.state = 1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="If Cambiar_Entidad Then";
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
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Tr";
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="Cambiar_Entidad = False";
parent._cambiar_entidad = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17432586;
 //BA.debugLineNum = 17432586;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="If BuscandoProducto Then";

case 4:
//if
this.state = 11;
if (parent._buscandoproducto) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=17432590;
 //BA.debugLineNum = 17432590;BA.debugLine="If Not(Buscar_productos.Msj.EsCorrecto) Then";
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
RDebugUtils.currentLine=17432591;
 //BA.debugLineNum = 17432591;BA.debugLine="BuscandoProducto = False";
parent._buscandoproducto = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17432592;
 //BA.debugLineNum = 17432592;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=17432596;
 //BA.debugLineNum = 17432596;BA.debugLine="If BuscandoEntidad Then";

case 11:
//if
this.state = 18;
if (parent._buscandoentidad) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=17432597;
 //BA.debugLineNum = 17432597;BA.debugLine="If Not(Buscar_entidad.Msj.EsCorrecto) Then";
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
RDebugUtils.currentLine=17432598;
 //BA.debugLineNum = 17432598;BA.debugLine="BuscandoEntidad = False";
parent._buscandoentidad = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17432599;
 //BA.debugLineNum = 17432599;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
RDebugUtils.currentLine=17432603;
 //BA.debugLineNum = 17432603;BA.debugLine="If EditandoProducto Then";

case 18:
//if
this.state = 25;
if (parent._editandoproducto) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=17432604;
 //BA.debugLineNum = 17432604;BA.debugLine="EditandoProducto = False";
parent._editandoproducto = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17432605;
 //BA.debugLineNum = 17432605;BA.debugLine="If Not(Frm_Post_01_Producto.Msj.EsCorrecto) Then";
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
RDebugUtils.currentLine=17432606;
 //BA.debugLineNum = 17432606;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;
;
RDebugUtils.currentLine=17432610;
 //BA.debugLineNum = 17432610;BA.debugLine="If Id_DocEnc = 0 Or Nuevo_Documento Then";

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
RDebugUtils.currentLine=17432612;
 //BA.debugLineNum = 17432612;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=17432613;
 //BA.debugLineNum = 17432613;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17432615;
 //BA.debugLineNum = 17432615;BA.debugLine="If Not(Fila_Encabezado.IsInitialized) Then";
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
RDebugUtils.currentLine=17432616;
 //BA.debugLineNum = 17432616;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=17432618;
 //BA.debugLineNum = 17432618;BA.debugLine="Wait For (Sb_Cargar_Documento(True)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "activity_resume"), _sb_cargar_documento(anywheresoftware.b4a.keywords.Common.True));
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
RDebugUtils.currentLine=17432623;
 //BA.debugLineNum = 17432623;BA.debugLine="Wait For (Sb_Cargar_Documento(False)) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "activity_resume"), _sb_cargar_documento(anywheresoftware.b4a.keywords.Common.False));
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
RDebugUtils.currentLine=17432627;
 //BA.debugLineNum = 17432627;BA.debugLine="Txt_Codigo.Text = \"\"";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17432628;
 //BA.debugLineNum = 17432628;BA.debugLine="Lbl_Items.Text = \"Total Items: 0\"";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence("Total Items: 0"));
RDebugUtils.currentLine=17432630;
 //BA.debugLineNum = 17432630;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
parent.mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17432632;
 //BA.debugLineNum = 17432632;BA.debugLine="Sb_Cargar_Detalle(True)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17432634;
 //BA.debugLineNum = 17432634;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_titulo() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_titulo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_titulo", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="Activity.Title = \"New Doc...\" & Variables.Gl_Sucu";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("New Doc..."+parent.mostCurrent._variables._gl_sucursal /*String*/ ));
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="If Crear_NVV_Desde_COV Then";
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
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="Activity.Title = \"NVV desde COV: \" & Nudo_Origen";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("NVV desde COV: "+parent._nudo_origen));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17498119;
 //BA.debugLineNum = 17498119;BA.debugLine="If Editar_Documento Then";
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
RDebugUtils.currentLine=17498120;
 //BA.debugLineNum = 17498120;BA.debugLine="Activity.Title = \"Editando: \" & TipoDoc & \"-\" &";
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
RDebugUtils.currentLine=17498124;
 //BA.debugLineNum = 17498124;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17498125;
 //BA.debugLineNum = 17498125;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_actualizar_datos_de_la_entidad(anywheresoftware.b4a.objects.collections.Map _rowentidad,boolean _revisar_permiso_lista_precio,boolean _aplicar_venciminetos,boolean _actualizarlistaprecio) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_actualizar_datos_de_la_entidad", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_actualizar_datos_de_la_entidad", new Object[] {_rowentidad,_revisar_permiso_lista_precio,_aplicar_venciminetos,_actualizarlistaprecio}); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="ProgressDialogShow(\"Actualizando datos de la enti";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando datos de la entidad..."));
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=18743308;
 //BA.debugLineNum = 18743308;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=18743310;
 //BA.debugLineNum = 18743310;BA.debugLine="Dim Cuotas As Int = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=18743311;
 //BA.debugLineNum = 18743311;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=18743312;
 //BA.debugLineNum = 18743312;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=18743313;
 //BA.debugLineNum = 18743313;BA.debugLine="Dim Forma_pago As String";
_forma_pago = "";
RDebugUtils.currentLine=18743315;
 //BA.debugLineNum = 18743315;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18743316;
 //BA.debugLineNum = 18743316;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18743317;
 //BA.debugLineNum = 18743317;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
parent._fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18743318;
 //BA.debugLineNum = 18743318;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
parent._fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18743319;
 //BA.debugLineNum = 18743319;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18743321;
 //BA.debugLineNum = 18743321;BA.debugLine="Dim Lista As String";
_lista = "";
RDebugUtils.currentLine=18743322;
 //BA.debugLineNum = 18743322;BA.debugLine="Dim Permiso As String";
_permiso = "";
RDebugUtils.currentLine=18743324;
 //BA.debugLineNum = 18743324;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
_listaprecios = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=18743325;
 //BA.debugLineNum = 18743325;BA.debugLine="Lista = ListaPrecios";
_lista = _listaprecios;
RDebugUtils.currentLine=18743327;
 //BA.debugLineNum = 18743327;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
_cuotas = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("NUVECR"))));
RDebugUtils.currentLine=18743328;
 //BA.debugLineNum = 18743328;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
_dias_1er_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIPRVE"))));
RDebugUtils.currentLine=18743329;
 //BA.debugLineNum = 18743329;BA.debugLine="Dias_Vencimiento = Funciones.Fx_NuloPorNro(RowEnt";
_dias_vencimiento = (int)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,_rowentidad.Get((Object)("DIASVENCI")),0)));
RDebugUtils.currentLine=18743331;
 //BA.debugLineNum = 18743331;BA.debugLine="Dim Rut As String";
_rut = "";
RDebugUtils.currentLine=18743333;
 //BA.debugLineNum = 18743333;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),_rowentidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=18743334;
 //BA.debugLineNum = 18743334;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),_rowentidad.Get((Object)("SUEN")));
RDebugUtils.currentLine=18743335;
 //BA.debugLineNum = 18743335;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),_rowentidad.Get((Object)("NOKOEN")));
RDebugUtils.currentLine=18743337;
 //BA.debugLineNum = 18743337;BA.debugLine="Lbl_CodEntidad.Text = RowEntidad.Get(\"KOEN\")";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("KOEN"))));
RDebugUtils.currentLine=18743338;
 //BA.debugLineNum = 18743338;BA.debugLine="Lbl_CodSucEntidad.Text = RowEntidad.Get(\"SUEN\")";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("SUEN"))));
RDebugUtils.currentLine=18743339;
 //BA.debugLineNum = 18743339;BA.debugLine="Lbl_Rut.Text = RowEntidad.Get(\"Rut\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("Rut"))));
RDebugUtils.currentLine=18743340;
 //BA.debugLineNum = 18743340;BA.debugLine="Lbl_Nombre.Text = RowEntidad.Get(\"NOKOEN\")";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("NOKOEN"))));
RDebugUtils.currentLine=18743341;
 //BA.debugLineNum = 18743341;BA.debugLine="Lbl_Direccion.Text = RowEntidad.Get(\"DIEN\")";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("DIEN"))));
RDebugUtils.currentLine=18743342;
 //BA.debugLineNum = 18743342;BA.debugLine="Lbl_Ciudad.Text = RowEntidad.Get(\"CIUDAD\")";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("CIUDAD"))));
RDebugUtils.currentLine=18743343;
 //BA.debugLineNum = 18743343;BA.debugLine="Lbl_Comuna.Text = RowEntidad.Get(\"COMUNA\")";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("COMUNA"))));
RDebugUtils.currentLine=18743345;
 //BA.debugLineNum = 18743345;BA.debugLine="If ActualizarListaPrecio Then";
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
RDebugUtils.currentLine=18743346;
 //BA.debugLineNum = 18743346;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
_lista = BA.ObjectToString(_rowentidad.Get((Object)("LVEN")));
RDebugUtils.currentLine=18743347;
 //BA.debugLineNum = 18743347;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
_lista = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,_lista,(int) (6),(int) (3));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=18743350;
 //BA.debugLineNum = 18743350;BA.debugLine="Permiso = \"Lp-\" & Lista";
_permiso = "Lp-"+_lista;
RDebugUtils.currentLine=18743352;
 //BA.debugLineNum = 18743352;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
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
RDebugUtils.currentLine=18743354;
 //BA.debugLineNum = 18743354;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
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
RDebugUtils.currentLine=18743355;
 //BA.debugLineNum = 18743355;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 if (true) break;
;
RDebugUtils.currentLine=18743358;
 //BA.debugLineNum = 18743358;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";

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
RDebugUtils.currentLine=18743360;
 //BA.debugLineNum = 18743360;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=18743361;
 //BA.debugLineNum = 18743361;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=18743363;
 //BA.debugLineNum = 18743363;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
_fechasvenci = _fechaemision;
RDebugUtils.currentLine=18743364;
 //BA.debugLineNum = 18743364;BA.debugLine="Dim dias As Int";
_dias = 0;
RDebugUtils.currentLine=18743366;
 //BA.debugLineNum = 18743366;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
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
RDebugUtils.currentLine=18743368;
 //BA.debugLineNum = 18743368;BA.debugLine="dias = Dias_1er_Vencimiento";
_dias = _dias_1er_vencimiento;
RDebugUtils.currentLine=18743370;
 //BA.debugLineNum = 18743370;BA.debugLine="For i = 1 To Cuotas";
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
RDebugUtils.currentLine=18743372;
 //BA.debugLineNum = 18743372;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
_fechasvenci = anywheresoftware.b4a.keywords.Common.DateTime.Add(_fechasvenci,(int) (0),(int) (0),_dias);
RDebugUtils.currentLine=18743373;
 //BA.debugLineNum = 18743373;BA.debugLine="If i = 1 Then";
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
RDebugUtils.currentLine=18743374;
 //BA.debugLineNum = 18743374;BA.debugLine="Fecha_1er_Vencimiento = FechasVenci";
_fecha_1er_vencimiento = _fechasvenci;
 if (true) break;

case 26:
//C
this.state = 70;
;
RDebugUtils.currentLine=18743377;
 //BA.debugLineNum = 18743377;BA.debugLine="dias = Dias_Vencimiento";
_dias = _dias_vencimiento;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
;
RDebugUtils.currentLine=18743381;
 //BA.debugLineNum = 18743381;BA.debugLine="FechaUltVencimiento = FechasVenci";
_fechaultvencimiento = _fechasvenci;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=18743384;
 //BA.debugLineNum = 18743384;BA.debugLine="Cuotas = 1";
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
RDebugUtils.currentLine=18743389;
 //BA.debugLineNum = 18743389;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=18743390;
 //BA.debugLineNum = 18743390;BA.debugLine="FechaUltVencimiento = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=18743391;
 //BA.debugLineNum = 18743391;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=18743392;
 //BA.debugLineNum = 18743392;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=18743393;
 //BA.debugLineNum = 18743393;BA.debugLine="Dias_Vencimiento = 0";
_dias_vencimiento = (int) (0);
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=18743397;
 //BA.debugLineNum = 18743397;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
_forma_pago = BA.ObjectToString(_rowentidad.Get((Object)("CPEN")));
RDebugUtils.currentLine=18743399;
 //BA.debugLineNum = 18743399;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
parent._fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=18743400;
 //BA.debugLineNum = 18743400;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=18743401;
 //BA.debugLineNum = 18743401;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
parent._fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=18743402;
 //BA.debugLineNum = 18743402;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=18743404;
 //BA.debugLineNum = 18743404;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
parent._fila_encabezado.Put((Object)("Cuotas"),(Object)(_cuotas));
RDebugUtils.currentLine=18743405;
 //BA.debugLineNum = 18743405;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento"),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=18743406;
 //BA.debugLineNum = 18743406;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento"),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=18743408;
 //BA.debugLineNum = 18743408;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
parent._fila_observaciones.Put((Object)("Forma_pago"),(Object)(_forma_pago));
RDebugUtils.currentLine=18743410;
 //BA.debugLineNum = 18743410;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
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
RDebugUtils.currentLine=18743412;
 //BA.debugLineNum = 18743412;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean";
_tiene_permiso_lista = false;
RDebugUtils.currentLine=18743413;
 //BA.debugLineNum = 18743413;BA.debugLine="Dim Cambiar_lista As Boolean";
_cambiar_lista = false;
RDebugUtils.currentLine=18743414;
 //BA.debugLineNum = 18743414;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
_mostrar_mensaje_cambio_lista = false;
RDebugUtils.currentLine=18743417;
 //BA.debugLineNum = 18743417;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
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
RDebugUtils.currentLine=18743418;
 //BA.debugLineNum = 18743418;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=18743419;
 //BA.debugLineNum = 18743419;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
_value = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=18743421;
 //BA.debugLineNum = 18743421;BA.debugLine="If Lista = value Then";
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
RDebugUtils.currentLine=18743422;
 //BA.debugLineNum = 18743422;BA.debugLine="Tiene_Permiso_Lista = True";
_tiene_permiso_lista = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18743423;
 //BA.debugLineNum = 18743423;BA.debugLine="Exit";
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
RDebugUtils.currentLine=18743428;
 //BA.debugLineNum = 18743428;BA.debugLine="If Tiene_Permiso_Lista Then";

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
RDebugUtils.currentLine=18743429;
 //BA.debugLineNum = 18743429;BA.debugLine="Cambiar_lista = True";
_cambiar_lista = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=18743432;
 //BA.debugLineNum = 18743432;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=18743434;
 //BA.debugLineNum = 18743434;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Usted no tiene permiso para trabajar con la lista: "+_lista+anywheresoftware.b4a.keywords.Common.CRLF+"La lista seguirá siendo:"+_listaprecios),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=18743439;
 //BA.debugLineNum = 18743439;BA.debugLine="If Cambiar_lista Then";

case 49:
//if
this.state = 52;
if (_cambiar_lista) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=18743440;
 //BA.debugLineNum = 18743440;BA.debugLine="ListaPrecios = Lista";
_listaprecios = _lista;
RDebugUtils.currentLine=18743441;
 //BA.debugLineNum = 18743441;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
RDebugUtils.currentLine=18743446;
 //BA.debugLineNum = 18743446;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";

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
RDebugUtils.currentLine=18743448;
 //BA.debugLineNum = 18743448;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=18743449;
 //BA.debugLineNum = 18743449;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=18743450;
 //BA.debugLineNum = 18743450;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
RDebugUtils.currentLine=18743452;
 //BA.debugLineNum = 18743452;BA.debugLine="If Lista = Kolt Then";
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
RDebugUtils.currentLine=18743453;
 //BA.debugLineNum = 18743453;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(_nokolt));
RDebugUtils.currentLine=18743454;
 //BA.debugLineNum = 18743454;BA.debugLine="Exit";
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
RDebugUtils.currentLine=18743461;
 //BA.debugLineNum = 18743461;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
_bloqueado = BA.ObjectToBoolean(_rowentidad.Get((Object)("BLOQUEADO")));
RDebugUtils.currentLine=18743463;
 //BA.debugLineNum = 18743463;BA.debugLine="If Bloqueado Then";
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
RDebugUtils.currentLine=18743465;
 //BA.debugLineNum = 18743465;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=18743467;
 //BA.debugLineNum = 18743467;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡CLIENTE BLOQUEADO!"+anywheresoftware.b4a.keywords.Common.CRLF+"Solo es posible generar cotizaciones"),BA.ObjectToCharSequence("CLIENTE MOROSO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=18743472;
 //BA.debugLineNum = 18743472;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=18743473;
 //BA.debugLineNum = 18743473;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
RDebugUtils.currentLine=18743474;
 //BA.debugLineNum = 18743474;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
RDebugUtils.currentLine=18743476;
 //BA.debugLineNum = 18743476;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas"))));
RDebugUtils.currentLine=18743477;
 //BA.debugLineNum = 18743477;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento"))));
RDebugUtils.currentLine=18743478;
 //BA.debugLineNum = 18743478;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento"))));
RDebugUtils.currentLine=18743480;
 //BA.debugLineNum = 18743480;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
RDebugUtils.currentLine=18743482;
 //BA.debugLineNum = 18743482;BA.debugLine="If ActualizarListaPrecio And B4A_DespachoSimple T";
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
RDebugUtils.currentLine=18743484;
 //BA.debugLineNum = 18743484;BA.debugLine="Wait For(Sb_Trae_Secueven(Secueven)) Complete (v";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_actualizar_datos_de_la_entidad"), _sb_trae_secueven(_secueven));
this.state = 75;
return;
case 75:
//C
this.state = 68;
_vtidonudo = (BaKapp.Movil.Tag.tidonudo) result[0];
;
RDebugUtils.currentLine=18743486;
 //BA.debugLineNum = 18743486;BA.debugLine="Lbl_CodDocDestino.Tag = vTidoNudo.Tido";
parent.mostCurrent._lbl_coddocdestino.setTag((Object)(_vtidonudo._tido /*String*/ ));
RDebugUtils.currentLine=18743487;
 //BA.debugLineNum = 18743487;BA.debugLine="Lbl_CodDocDestino.Text = vTidoNudo.Notido";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(_vtidonudo._notido /*String*/ ));
RDebugUtils.currentLine=18743489;
 //BA.debugLineNum = 18743489;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 if (true) break;

case 68:
//C
this.state = -1;
;
RDebugUtils.currentLine=18743493;
 //BA.debugLineNum = 18743493;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_actualizar_datos_de_la_entidad"), _sb_visibleocultardespachosimple());
this.state = 76;
return;
case 76:
//C
this.state = -1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=18743495;
 //BA.debugLineNum = 18743495;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18743497;
 //BA.debugLineNum = 18743497;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_nuevo_documento() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_nuevo_documento", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_nuevo_documento", null));}
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
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Sub Sb_Nuevo_Documento";
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="ProgressDialogShow(\"Preparando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Preparando..."));
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
mostCurrent._consulta_sql = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?";
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
RDebugUtils.currentLine=18612246;
 //BA.debugLineNum = 18612246;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc] Where I";
mostCurrent._consulta_sql = "Delete From [Detalle_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=18612247;
 //BA.debugLineNum = 18612247;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=18612249;
 //BA.debugLineNum = 18612249;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc] Wher";
mostCurrent._consulta_sql = "Delete From [Descuentos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=18612250;
 //BA.debugLineNum = 18612250;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=18612252;
 //BA.debugLineNum = 18612252;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc] Where";
mostCurrent._consulta_sql = "Delete From [Impuestos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=18612253;
 //BA.debugLineNum = 18612253;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=18612255;
 //BA.debugLineNum = 18612255;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc] W";
mostCurrent._consulta_sql = "Delete From [Observaciones_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=18612256;
 //BA.debugLineNum = 18612256;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=18612258;
 //BA.debugLineNum = 18612258;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc] Wher";
mostCurrent._consulta_sql = "Delete From [DespaFacil_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=18612259;
 //BA.debugLineNum = 18612259;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=18612261;
 //BA.debugLineNum = 18612261;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Confi";
mostCurrent._variables._gl_empresa /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
RDebugUtils.currentLine=18612262;
 //BA.debugLineNum = 18612262;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Conf";
mostCurrent._variables._gl_sucursal /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
RDebugUtils.currentLine=18612263;
 //BA.debugLineNum = 18612263;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Config";
mostCurrent._variables._gl_bodega /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
RDebugUtils.currentLine=18612266;
 //BA.debugLineNum = 18612266;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
mostCurrent._consulta_sql = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)";
RDebugUtils.currentLine=18612267;
 //BA.debugLineNum = 18612267;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(mostCurrent._variables._gl_modalidad /*String*/ ),(Object)(mostCurrent._variables._gl_empresa /*String*/ ),(Object)(mostCurrent._variables._gl_sucursal /*String*/ )}));
RDebugUtils.currentLine=18612270;
 //BA.debugLineNum = 18612270;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=18612271;
 //BA.debugLineNum = 18612271;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
_fila_encabezado = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18612274;
 //BA.debugLineNum = 18612274;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=18612277;
 //BA.debugLineNum = 18612277;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
RDebugUtils.currentLine=18612278;
 //BA.debugLineNum = 18612278;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
mostCurrent._fila_idenc = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18612281;
 //BA.debugLineNum = 18612281;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
mostCurrent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=18612282;
 //BA.debugLineNum = 18612282;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id_docenc)}));
RDebugUtils.currentLine=18612285;
 //BA.debugLineNum = 18612285;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
RDebugUtils.currentLine=18612286;
 //BA.debugLineNum = 18612286;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
_fila_observaciones = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18612288;
 //BA.debugLineNum = 18612288;BA.debugLine="Txt_Observaciones.Text = \"\"";
mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612289;
 //BA.debugLineNum = 18612289;BA.debugLine="Txt_Orden_compra.Text = \"\"";
mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612292;
 //BA.debugLineNum = 18612292;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_Do";
mostCurrent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=18612293;
 //BA.debugLineNum = 18612293;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id_docenc)}));
RDebugUtils.currentLine=18612295;
 //BA.debugLineNum = 18612295;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
RDebugUtils.currentLine=18612296;
 //BA.debugLineNum = 18612296;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
_fila_despafacil = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18612298;
 //BA.debugLineNum = 18612298;BA.debugLine="If B4A_DespachoSimple Then";
if (_b4a_despachosimple) { 
RDebugUtils.currentLine=18612300;
 //BA.debugLineNum = 18612300;BA.debugLine="Lbl_TipoDespacho.Tag = 0";
mostCurrent._lbl_tipodespacho.setTag((Object)(0));
RDebugUtils.currentLine=18612301;
 //BA.debugLineNum = 18612301;BA.debugLine="Lbl_TipoDespacho.Text = \"\"";
mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612302;
 //BA.debugLineNum = 18612302;BA.debugLine="Lbl_TipoPagoDesp.Tag =  0";
mostCurrent._lbl_tipopagodesp.setTag((Object)(0));
RDebugUtils.currentLine=18612303;
 //BA.debugLineNum = 18612303;BA.debugLine="Lbl_TipoPagoDesp.Text = \"\"";
mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612304;
 //BA.debugLineNum = 18612304;BA.debugLine="Txt_TransporteDesp.Text = \"\"";
mostCurrent._txt_transportedesp.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612305;
 //BA.debugLineNum = 18612305;BA.debugLine="Lbl_CodDocDestino.Tag =  \"\"";
mostCurrent._lbl_coddocdestino.setTag((Object)(""));
RDebugUtils.currentLine=18612306;
 //BA.debugLineNum = 18612306;BA.debugLine="Lbl_CodDocDestino.Text = \"\"";
mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612307;
 //BA.debugLineNum = 18612307;BA.debugLine="Txt_DireccionDesp.Text = \"\"";
mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612308;
 //BA.debugLineNum = 18612308;BA.debugLine="Txt_ObservacionesDesp.Text = \"\"";
mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=18612312;
 //BA.debugLineNum = 18612312;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("618612312","Documento cargado... Id_DocEnc = "+BA.NumberToString(_id_docenc),0);
RDebugUtils.currentLine=18612314;
 //BA.debugLineNum = 18612314;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=18612317;
 //BA.debugLineNum = 18612317;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=18612318;
 //BA.debugLineNum = 18612318;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=18612319;
 //BA.debugLineNum = 18612319;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=18612320;
 //BA.debugLineNum = 18612320;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=18612324;
 //BA.debugLineNum = 18612324;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=18612325;
 //BA.debugLineNum = 18612325;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fe";
mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=18612326;
 //BA.debugLineNum = 18612326;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fech";
mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=18612328;
 //BA.debugLineNum = 18612328;BA.debugLine="Dim Cuotas As Int = 0";
_cuotas = (int) (0);
RDebugUtils.currentLine=18612329;
 //BA.debugLineNum = 18612329;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=18612330;
 //BA.debugLineNum = 18612330;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=18612331;
 //BA.debugLineNum = 18612331;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
_forma_de_pago = "";
RDebugUtils.currentLine=18612333;
 //BA.debugLineNum = 18612333;BA.debugLine="Dim Centro_Costo As String";
_centro_costo = "";
RDebugUtils.currentLine=18612335;
 //BA.debugLineNum = 18612335;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
_moneda_doc = BA.ObjectToString(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=18612336;
 //BA.debugLineNum = 18612336;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
_valor_dolar = (double)(BA.ObjectToNumber(mostCurrent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=18612337;
 //BA.debugLineNum = 18612337;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
_tasadorig_doc = (double)(BA.ObjectToNumber(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=18612338;
 //BA.debugLineNum = 18612338;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
_tipomoneda = BA.ObjectToString(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=18612341;
 //BA.debugLineNum = 18612341;BA.debugLine="Dim ListaPrecios As String";
_listaprecios = "";
RDebugUtils.currentLine=18612343;
 //BA.debugLineNum = 18612343;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
_newnrodocumento = "NEWXXXXXXX";
RDebugUtils.currentLine=18612345;
 //BA.debugLineNum = 18612345;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
_docen_neto_bruto = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_TipoValor_Bruto_Neto")));
RDebugUtils.currentLine=18612347;
 //BA.debugLineNum = 18612347;BA.debugLine="If DocEn_Neto_Bruto = \"N\" Then";
if ((_docen_neto_bruto).equals("N")) { 
RDebugUtils.currentLine=18612348;
 //BA.debugLineNum = 18612348;BA.debugLine="Chk_Valores_Netos.Checked = True";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=18612350;
 //BA.debugLineNum = 18612350;BA.debugLine="Chk_Valores_Netos.Checked = False";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=18612353;
 //BA.debugLineNum = 18612353;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
_centro_costo = "LUVTVEN";
RDebugUtils.currentLine=18612354;
 //BA.debugLineNum = 18612354;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
_centro_costo = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_centro_costo)));
RDebugUtils.currentLine=18612356;
 //BA.debugLineNum = 18612356;BA.debugLine="Lbl_Centro_Costo.Text = Centro_Costo";
mostCurrent._lbl_centro_costo.setText(BA.ObjectToCharSequence(_centro_costo));
RDebugUtils.currentLine=18612358;
 //BA.debugLineNum = 18612358;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
_listaprecios = mostCurrent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=18612360;
 //BA.debugLineNum = 18612360;BA.debugLine="Chk_Valores_Netos.Enabled = False";
mostCurrent._chk_valores_netos.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18612362;
 //BA.debugLineNum = 18612362;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
_fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)("NVV"));
RDebugUtils.currentLine=18612363;
 //BA.debugLineNum = 18612363;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
_fila_encabezado.Put((Object)("NroDocumento".toLowerCase()),(Object)(_newnrodocumento));
RDebugUtils.currentLine=18612365;
 //BA.debugLineNum = 18612365;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
_fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=18612366;
 //BA.debugLineNum = 18612366;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
_fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=18612367;
 //BA.debugLineNum = 18612367;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
_fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=18612368;
 //BA.debugLineNum = 18612368;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
_fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=18612370;
 //BA.debugLineNum = 18612370;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
_fila_encabezado.Put((Object)("Cuotas".toLowerCase()),(Object)(_cuotas));
RDebugUtils.currentLine=18612371;
 //BA.debugLineNum = 18612371;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
_fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=18612372;
 //BA.debugLineNum = 18612372;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
_fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=18612374;
 //BA.debugLineNum = 18612374;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Defe";
_row_entidad = mostCurrent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=18612376;
 //BA.debugLineNum = 18612376;BA.debugLine="Dim CodEntidad As String";
_codentidad = "";
RDebugUtils.currentLine=18612377;
 //BA.debugLineNum = 18612377;BA.debugLine="Dim CodSucEntidad As String";
_codsucentidad = "";
RDebugUtils.currentLine=18612378;
 //BA.debugLineNum = 18612378;BA.debugLine="Dim Nombre_Entidad As String";
_nombre_entidad = "";
RDebugUtils.currentLine=18612380;
 //BA.debugLineNum = 18612380;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (_row_entidad.IsInitialized()) { 
RDebugUtils.currentLine=18612381;
 //BA.debugLineNum = 18612381;BA.debugLine="CodEntidad = Row_Entidad.Get(\"KOEN\")";
_codentidad = BA.ObjectToString(_row_entidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=18612382;
 //BA.debugLineNum = 18612382;BA.debugLine="CodSucEntidad = Row_Entidad.Get(\"SUEN\")";
_codsucentidad = BA.ObjectToString(_row_entidad.Get((Object)("SUEN")));
RDebugUtils.currentLine=18612383;
 //BA.debugLineNum = 18612383;BA.debugLine="Nombre_Entidad = Row_Entidad.Get(\"NOKOEN\")";
_nombre_entidad = BA.ObjectToString(_row_entidad.Get((Object)("NOKOEN")));
 };
RDebugUtils.currentLine=18612386;
 //BA.debugLineNum = 18612386;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
_fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(_codentidad));
RDebugUtils.currentLine=18612387;
 //BA.debugLineNum = 18612387;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
_fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(_codsucentidad));
RDebugUtils.currentLine=18612388;
 //BA.debugLineNum = 18612388;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
_fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(_nombre_entidad));
RDebugUtils.currentLine=18612390;
 //BA.debugLineNum = 18612390;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
_fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
RDebugUtils.currentLine=18612391;
 //BA.debugLineNum = 18612391;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
_fila_encabezado.Put((Object)("CodFuncionario".toLowerCase()),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=18612393;
 //BA.debugLineNum = 18612393;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
_fila_encabezado.Put((Object)("NomFuncionario".toLowerCase()),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
RDebugUtils.currentLine=18612395;
 //BA.debugLineNum = 18612395;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
_fila_encabezado.Put((Object)("Moneda_Doc".toLowerCase()),(Object)(_moneda_doc));
RDebugUtils.currentLine=18612396;
 //BA.debugLineNum = 18612396;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
_fila_encabezado.Put((Object)("TipoMoneda".toLowerCase()),(Object)(_tipomoneda));
RDebugUtils.currentLine=18612397;
 //BA.debugLineNum = 18612397;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
_fila_encabezado.Put((Object)("Valor_Dolar".toLowerCase()),(Object)(_valor_dolar));
RDebugUtils.currentLine=18612398;
 //BA.debugLineNum = 18612398;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
_fila_encabezado.Put((Object)("Tasadorig_Doc".toLowerCase()),(Object)(_tasadorig_doc));
RDebugUtils.currentLine=18612400;
 //BA.debugLineNum = 18612400;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
_fila_encabezado.Put((Object)("DocEn_Neto_Bruto".toLowerCase()),(Object)(_docen_neto_bruto));
RDebugUtils.currentLine=18612402;
 //BA.debugLineNum = 18612402;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
_fila_encabezado.Put((Object)("Centro_Costo".toLowerCase()),(Object)(_centro_costo));
RDebugUtils.currentLine=18612404;
 //BA.debugLineNum = 18612404;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
_fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612405;
 //BA.debugLineNum = 18612405;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
_fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612406;
 //BA.debugLineNum = 18612406;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
_fila_encabezado.Put((Object)("Nombre_Entidad_Fisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612407;
 //BA.debugLineNum = 18612407;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
_fila_encabezado.Put((Object)("Fun_Auto_Deuda_Ven".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612408;
 //BA.debugLineNum = 18612408;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
_fila_encabezado.Put((Object)("Fun_Auto_Stock_Ins".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612409;
 //BA.debugLineNum = 18612409;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
_fila_encabezado.Put((Object)("Fun_Auto_Cupo_Exe".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612410;
 //BA.debugLineNum = 18612410;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
_fila_encabezado.Put((Object)("SubTido".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=18612413;
 //BA.debugLineNum = 18612413;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",_fila_encabezado,mostCurrent._fila_idenc);
RDebugUtils.currentLine=18612415;
 //BA.debugLineNum = 18612415;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (_row_entidad.IsInitialized()) { 
RDebugUtils.currentLine=18612416;
 //BA.debugLineNum = 18612416;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fa";
_sb_actualizar_datos_de_la_entidad(_row_entidad,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=18612418;
 //BA.debugLineNum = 18612418;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612419;
 //BA.debugLineNum = 18612419;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612420;
 //BA.debugLineNum = 18612420;BA.debugLine="Lbl_Rut.Text = \"\"";
mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612421;
 //BA.debugLineNum = 18612421;BA.debugLine="Lbl_Nombre.Text = \"\"";
mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612422;
 //BA.debugLineNum = 18612422;BA.debugLine="Lbl_Direccion.Text = \"\"";
mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612423;
 //BA.debugLineNum = 18612423;BA.debugLine="Lbl_Ciudad.Text = \"\"";
mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612424;
 //BA.debugLineNum = 18612424;BA.debugLine="Lbl_Comuna.Text = \"\"";
mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612425;
 //BA.debugLineNum = 18612425;BA.debugLine="Tab_Post.CurrentTab = 0";
mostCurrent._tab_post.setCurrentTab((int) (0));
 };
RDebugUtils.currentLine=18612428;
 //BA.debugLineNum = 18612428;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18612430;
 //BA.debugLineNum = 18612430;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18612432;
 //BA.debugLineNum = 18612432;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_documento(boolean _nuevo_doc) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_cargar_documento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_cargar_documento", new Object[] {_nuevo_doc}));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="If Nuevo_Doc Then";
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
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
parent._id_docenc = (int)(BA.ObjectToNumber(parent._fila_encabezado.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="If Not(Fila_Observaciones.IsInitialized)  Then";
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
RDebugUtils.currentLine=17563674;
 //BA.debugLineNum = 17563674;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (I";
parent.mostCurrent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
RDebugUtils.currentLine=17563678;
 //BA.debugLineNum = 17563678;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17563679;
 //BA.debugLineNum = 17563679;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variable";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=17563683;
 //BA.debugLineNum = 17563683;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
parent.mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("observaciones"))));
RDebugUtils.currentLine=17563684;
 //BA.debugLineNum = 17563684;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("orden_compra"))));
RDebugUtils.currentLine=17563687;
 //BA.debugLineNum = 17563687;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17563688;
 //BA.debugLineNum = 17563688;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17563690;
 //BA.debugLineNum = 17563690;BA.debugLine="If Not(Fila_DespaFacil.IsInitialized)  Then";
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
RDebugUtils.currentLine=17563692;
 //BA.debugLineNum = 17563692;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
parent.mostCurrent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=17563693;
 //BA.debugLineNum = 17563693;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
RDebugUtils.currentLine=17563695;
 //BA.debugLineNum = 17563695;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17563696;
 //BA.debugLineNum = 17563696;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;
;
RDebugUtils.currentLine=17563700;
 //BA.debugLineNum = 17563700;BA.debugLine="If B4A_DespachoSimple Then";

case 14:
//if
this.state = 17;
if (parent._b4a_despachosimple) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=17563702;
 //BA.debugLineNum = 17563702;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodT";
parent.mostCurrent._lbl_tipodespacho.setTag(parent._fila_despafacil.Get((Object)("CodTipoDespacho".toLowerCase())));
RDebugUtils.currentLine=17563703;
 //BA.debugLineNum = 17563703;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tip";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoDespacho".toLowerCase()))));
RDebugUtils.currentLine=17563705;
 //BA.debugLineNum = 17563705;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"Cod";
parent.mostCurrent._lbl_tipopagodesp.setTag(parent._fila_despafacil.Get((Object)("CodTipoPagoDesp".toLowerCase())));
RDebugUtils.currentLine=17563706;
 //BA.debugLineNum = 17563706;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tip";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoPagoDesp".toLowerCase()))));
RDebugUtils.currentLine=17563708;
 //BA.debugLineNum = 17563708;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Co";
parent.mostCurrent._lbl_coddocdestino.setTag(parent._fila_despafacil.Get((Object)("CodDocDestino".toLowerCase())));
RDebugUtils.currentLine=17563709;
 //BA.debugLineNum = 17563709;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Do";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DocDestino".toLowerCase()))));
RDebugUtils.currentLine=17563711;
 //BA.debugLineNum = 17563711;BA.debugLine="Txt_TransporteDesp.Text =  Fila_DespaFacil.Get(\"";
parent.mostCurrent._txt_transportedesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TransporteDesp".toLowerCase()))));
RDebugUtils.currentLine=17563712;
 //BA.debugLineNum = 17563712;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"D";
parent.mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DireccionDesp".toLowerCase()))));
RDebugUtils.currentLine=17563713;
 //BA.debugLineNum = 17563713;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get";
parent.mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("ObservacionesDesp".toLowerCase()))));
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=17563717;
 //BA.debugLineNum = 17563717;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("617563717","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
RDebugUtils.currentLine=17563719;
 //BA.debugLineNum = 17563719;BA.debugLine="Wait For (Sb_Cargar_Entidad(Editar_Documento)) Co";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_documento"), _sb_cargar_entidad(parent._editar_documento));
this.state = 37;
return;
case 37:
//C
this.state = 18;
_fin = (Boolean) result[0];
;
RDebugUtils.currentLine=17563721;
 //BA.debugLineNum = 17563721;BA.debugLine="If Row_Entidad.IsInitialized Then";
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
RDebugUtils.currentLine=17563723;
 //BA.debugLineNum = 17563723;BA.debugLine="Lbl_CodEntidad.Text = Row_Entidad.Get(\"KOEN\")";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("KOEN"))));
RDebugUtils.currentLine=17563724;
 //BA.debugLineNum = 17563724;BA.debugLine="Lbl_CodSucEntidad.Text = Row_Entidad.Get(\"SUEN\")";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("SUEN"))));
RDebugUtils.currentLine=17563725;
 //BA.debugLineNum = 17563725;BA.debugLine="Lbl_Rut.Text = Row_Entidad.Get(\"Rut\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("Rut"))));
RDebugUtils.currentLine=17563726;
 //BA.debugLineNum = 17563726;BA.debugLine="Lbl_Nombre.Text = Row_Entidad.Get(\"NOKOEN\")";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("NOKOEN"))));
RDebugUtils.currentLine=17563727;
 //BA.debugLineNum = 17563727;BA.debugLine="Lbl_Direccion.Text = Row_Entidad.Get(\"DIEN\")";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("DIEN"))));
RDebugUtils.currentLine=17563728;
 //BA.debugLineNum = 17563728;BA.debugLine="Lbl_Ciudad.Text = Row_Entidad.Get(\"CIUDAD\")";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("CIUDAD"))));
RDebugUtils.currentLine=17563729;
 //BA.debugLineNum = 17563729;BA.debugLine="Lbl_Comuna.Text = Row_Entidad.Get(\"COMUNA\")";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("COMUNA"))));
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=17563733;
 //BA.debugLineNum = 17563733;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17563734;
 //BA.debugLineNum = 17563734;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17563735;
 //BA.debugLineNum = 17563735;BA.debugLine="Lbl_Rut.Text = \"\"";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17563736;
 //BA.debugLineNum = 17563736;BA.debugLine="Lbl_Nombre.Text = \"\"";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17563737;
 //BA.debugLineNum = 17563737;BA.debugLine="Lbl_Direccion.Text = \"\"";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17563738;
 //BA.debugLineNum = 17563738;BA.debugLine="Lbl_Ciudad.Text = \"\"";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=17563739;
 //BA.debugLineNum = 17563739;BA.debugLine="Lbl_Comuna.Text = \"\"";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=17563743;
 //BA.debugLineNum = 17563743;BA.debugLine="Dim ListaPrecios As String = Fila_Encabezado.Get(";
_listaprecios = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=17563745;
 //BA.debugLineNum = 17563745;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
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
RDebugUtils.currentLine=17563747;
 //BA.debugLineNum = 17563747;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=17563748;
 //BA.debugLineNum = 17563748;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=17563749;
 //BA.debugLineNum = 17563749;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
RDebugUtils.currentLine=17563751;
 //BA.debugLineNum = 17563751;BA.debugLine="If ListaPrecios = Kolt Then";
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
RDebugUtils.currentLine=17563752;
 //BA.debugLineNum = 17563752;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(_nokolt));
RDebugUtils.currentLine=17563753;
 //BA.debugLineNum = 17563753;BA.debugLine="Exit";
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
RDebugUtils.currentLine=17563758;
 //BA.debugLineNum = 17563758;BA.debugLine="Try";

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
RDebugUtils.currentLine=17563760;
 //BA.debugLineNum = 17563760;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encab";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fechaemision".toLowerCase()))))));
RDebugUtils.currentLine=17563761;
 //BA.debugLineNum = 17563761;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(F";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
RDebugUtils.currentLine=17563762;
 //BA.debugLineNum = 17563762;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fil";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
 if (true) break;

case 35:
//C
this.state = 36;
this.catchState = 0;
RDebugUtils.currentLine=17563764;
 //BA.debugLineNum = 17563764;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("617563764",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=17563767;
 //BA.debugLineNum = 17563767;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\".To";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas".toLowerCase()))));
RDebugUtils.currentLine=17563768;
 //BA.debugLineNum = 17563768;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento".toLowerCase()))));
RDebugUtils.currentLine=17563769;
 //BA.debugLineNum = 17563769;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento".toLowerCase()))));
RDebugUtils.currentLine=17563771;
 //BA.debugLineNum = 17563771;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_documento"), _sb_visibleocultardespachosimple());
this.state = 40;
return;
case 40:
//C
this.state = -1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=17563774;
 //BA.debugLineNum = 17563774;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17563776;
 //BA.debugLineNum = 17563776;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_cargar_detalle", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_cargar_detalle", new Object[] {_cargar_activity}); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_detalle"), _sb_titulo());
this.state = 28;
return;
case 28:
//C
this.state = 1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="If Cargar_Activity Then";
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
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="If Frm_Post_01_Producto.Id_DocDet <> 0 Then";
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
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="Return";
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
RDebugUtils.currentLine=17760270;
 //BA.debugLineNum = 17760270;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17760271;
 //BA.debugLineNum = 17760271;BA.debugLine="XclvDetalle.DefaultTextBackgroundColor = Colors.T";
parent.mostCurrent._xclvdetalle._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
RDebugUtils.currentLine=17760272;
 //BA.debugLineNum = 17760272;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
RDebugUtils.currentLine=17760273;
 //BA.debugLineNum = 17760273;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=17760274;
 //BA.debugLineNum = 17760274;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=17760276;
 //BA.debugLineNum = 17760276;BA.debugLine="IDList.Initialize";
parent.mostCurrent._idlist.Initialize();
RDebugUtils.currentLine=17760278;
 //BA.debugLineNum = 17760278;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=17760279;
 //BA.debugLineNum = 17760279;BA.debugLine="Dim ItemStr As String";
_itemstr = "";
RDebugUtils.currentLine=17760281;
 //BA.debugLineNum = 17760281;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea,Bodega "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=17760284;
 //BA.debugLineNum = 17760284;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=17760286;
 //BA.debugLineNum = 17760286;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=17760288;
 //BA.debugLineNum = 17760288;BA.debugLine="For Row = 0 To RowNumber - 1";
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
RDebugUtils.currentLine=17760290;
 //BA.debugLineNum = 17760290;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=17760291;
 //BA.debugLineNum = 17760291;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
parent.mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
RDebugUtils.currentLine=17760293;
 //BA.debugLineNum = 17760293;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
parent._id_docdet = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDet")));
RDebugUtils.currentLine=17760294;
 //BA.debugLineNum = 17760294;BA.debugLine="Dim Codigo As String = Cursor1.GetString(\"Codig";
_codigo = _cursor1.GetString("Codigo");
RDebugUtils.currentLine=17760295;
 //BA.debugLineNum = 17760295;BA.debugLine="Dim Descripcion As String = Cursor1.GetString(\"";
_descripcion = _cursor1.GetString("Descripcion");
RDebugUtils.currentLine=17760297;
 //BA.debugLineNum = 17760297;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cursor1";
_cantidad = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("Cantidad"))),(int) (0),(int) (2));
RDebugUtils.currentLine=17760298;
 //BA.debugLineNum = 17760298;BA.debugLine="Dim UdTrans As String = Cursor1.GetString(\"UdTr";
_udtrans = _cursor1.GetString("UdTrans");
RDebugUtils.currentLine=17760299;
 //BA.debugLineNum = 17760299;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
_tict = _cursor1.GetString("Tict");
RDebugUtils.currentLine=17760300;
 //BA.debugLineNum = 17760300;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
_prct = (int)(Double.parseDouble(_cursor1.GetString("Prct")));
RDebugUtils.currentLine=17760301;
 //BA.debugLineNum = 17760301;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Cu";
_precio = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("Precio"))),(int) (0),(int) (2));
RDebugUtils.currentLine=17760302;
 //BA.debugLineNum = 17760302;BA.debugLine="Dim descuentoporc As String = NumberFormat(Curs";
_descuentoporc = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("DescuentoPorc"))),(int) (0),(int) (2));
RDebugUtils.currentLine=17760303;
 //BA.debugLineNum = 17760303;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForm";
_valnetolinea = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("ValNetoLinea"))),(int) (0),(int) (0));
RDebugUtils.currentLine=17760304;
 //BA.debugLineNum = 17760304;BA.debugLine="Dim Bodega As String = Cursor1.GetString(\"Bodeg";
_bodega = _cursor1.GetString("Bodega");
RDebugUtils.currentLine=17760306;
 //BA.debugLineNum = 17760306;BA.debugLine="If Descripcion.Length > 35 Then";
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
RDebugUtils.currentLine=17760307;
 //BA.debugLineNum = 17760307;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
_descripcion = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,_descripcion,(int) (1),(int) (35));
 if (true) break;
;
RDebugUtils.currentLine=17760310;
 //BA.debugLineNum = 17760310;BA.debugLine="If Cursor1.GetString(\"DescuentoPorc\") = 0 Then";

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
RDebugUtils.currentLine=17760311;
 //BA.debugLineNum = 17760311;BA.debugLine="descuentoporc = \"\"";
_descuentoporc = "";
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=17760313;
 //BA.debugLineNum = 17760313;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
_descuentoporc = " -%."+_descuentoporc+" ";
 if (true) break;

case 23:
//C
this.state = 30;
;
RDebugUtils.currentLine=17760316;
 //BA.debugLineNum = 17760316;BA.debugLine="Dim Item As Int = Row+1";
_item = (int) (_row+1);
RDebugUtils.currentLine=17760317;
 //BA.debugLineNum = 17760317;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item),(int) (2),"0");
RDebugUtils.currentLine=17760319;
 //BA.debugLineNum = 17760319;BA.debugLine="Dim Datos As String = \"Cant. \" & UdTrans & \" \"";
_datos = "Cant. "+_udtrans+" "+_cantidad+" X "+_precio+_descuentoporc+anywheresoftware.b4a.keywords.Common.CRLF+"Total: "+_valnetolinea+".-		Bod: "+_bodega;
RDebugUtils.currentLine=17760321;
 //BA.debugLineNum = 17760321;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=17760323;
 //BA.debugLineNum = 17760323;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
RDebugUtils.currentLine=17760324;
 //BA.debugLineNum = 17760324;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
_p.LoadLayout("Items_Detalle",mostCurrent.activityBA);
RDebugUtils.currentLine=17760325;
 //BA.debugLineNum = 17760325;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=17760327;
 //BA.debugLineNum = 17760327;BA.debugLine="Lbl_Codigo.Tag = Id_DocDet";
parent.mostCurrent._lbl_codigo.setTag((Object)(parent._id_docdet));
RDebugUtils.currentLine=17760328;
 //BA.debugLineNum = 17760328;BA.debugLine="Lbl_Codigo.Text = Codigo";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(_codigo));
RDebugUtils.currentLine=17760329;
 //BA.debugLineNum = 17760329;BA.debugLine="Lbl_Descripcion.Tag = Tict";
parent.mostCurrent._lbl_descripcion.setTag((Object)(_tict));
RDebugUtils.currentLine=17760330;
 //BA.debugLineNum = 17760330;BA.debugLine="Lbl_Descripcion.Text = Descripcion";
parent.mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(_descripcion));
RDebugUtils.currentLine=17760331;
 //BA.debugLineNum = 17760331;BA.debugLine="Lbl_Item.Tag = Prct";
parent.mostCurrent._lbl_item.setTag((Object)(_prct));
RDebugUtils.currentLine=17760332;
 //BA.debugLineNum = 17760332;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
parent.mostCurrent._lbl_item.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
RDebugUtils.currentLine=17760333;
 //BA.debugLineNum = 17760333;BA.debugLine="Lbl_Datos.Text = Datos";
parent.mostCurrent._lbl_datos.setText(BA.ObjectToCharSequence(_datos));
RDebugUtils.currentLine=17760341;
 //BA.debugLineNum = 17760341;BA.debugLine="XclvDetalle.Add(p,\"\")";
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
RDebugUtils.currentLine=17760346;
 //BA.debugLineNum = 17760346;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=17760349;
 //BA.debugLineNum = 17760349;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=17760351;
 //BA.debugLineNum = 17760351;BA.debugLine="Sb_Sumar_Totales";
_sb_sumar_totales();
RDebugUtils.currentLine=17760353;
 //BA.debugLineNum = 17760353;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_buscar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_buscar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_buscar_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="If	Hay_Descuentos_Globales Then";
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
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE AGREMAR MAS ITEM"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18219017;
 //BA.debugLineNum = 18219017;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=18219020;
 //BA.debugLineNum = 18219020;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_buscar_click"), _sb_productomodoconsulta());
this.state = 13;
return;
case 13:
//C
this.state = 5;
_rsmoscs = (Boolean) result[0];
;
RDebugUtils.currentLine=18219021;
 //BA.debugLineNum = 18219021;BA.debugLine="If Not(RsMosCs) Then";
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
RDebugUtils.currentLine=18219022;
 //BA.debugLineNum = 18219022;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=18219025;
 //BA.debugLineNum = 18219025;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_buscar_click"), _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 14;
return;
case 14:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=18219026;
 //BA.debugLineNum = 18219026;BA.debugLine="If Not(Resultado) Then";
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
RDebugUtils.currentLine=18219027;
 //BA.debugLineNum = 18219027;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18219030;
 //BA.debugLineNum = 18219030;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=18219032;
 //BA.debugLineNum = 18219032;BA.debugLine="BuscandoProducto = True";
parent._buscandoproducto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18219033;
 //BA.debugLineNum = 18219033;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Tex";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=18219034;
 //BA.debugLineNum = 18219034;BA.debugLine="Buscar_productos.Lista =  Fila_Encabezado.Get(\"Li";
parent.mostCurrent._buscar_productos._lista /*String*/  = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=18219035;
 //BA.debugLineNum = 18219035;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
RDebugUtils.currentLine=18219037;
 //BA.debugLineNum = 18219037;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_productomodoconsulta() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_productomodoconsulta", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_productomodoconsulta", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="If B4A_DespachoSimple And XclvDetalle.Size = 0 An";
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
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="Msgbox2Async(\"No existe tipo de despacho\" & CRLF";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe tipo de despacho"+anywheresoftware.b4a.keywords.Common.CRLF+"Indique su opción."),BA.ObjectToCharSequence("Validación"),"SOLO CONSULTAR PRODUCTO","","CANCELAR",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_productomodoconsulta"), null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=18284556;
 //BA.debugLineNum = 18284556;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = True";
parent.mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=18284558;
 //BA.debugLineNum = 18284558;BA.debugLine="Return False";
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
RDebugUtils.currentLine=18284563;
 //BA.debugLineNum = 18284563;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=18284564;
 //BA.debugLineNum = 18284564;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_fx_validar_lineas_por_documento_vs_formato() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fx_fx_validar_lineas_por_documento_vs_formato", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "fx_fx_validar_lineas_por_documento_vs_formato", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="Dim Tido As String = TipoDoc";
_tido = parent._tipodoc;
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="If Secueven.Contains(\"B\") Then";
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
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="Tido = \"BLV\"";
_tido = "BLV";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="Dim RowDoc As Map";
_rowdoc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18350093;
 //BA.debugLineNum = 18350093;BA.debugLine="Select Case Tido";
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
RDebugUtils.currentLine=18350095;
 //BA.debugLineNum = 18350095;BA.debugLine="RowDoc = Variables.Global_COV";
_rowdoc = parent.mostCurrent._variables._global_cov /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 11:
//C
this.state = 16;
RDebugUtils.currentLine=18350097;
 //BA.debugLineNum = 18350097;BA.debugLine="RowDoc = Variables.Global_NVV";
_rowdoc = parent.mostCurrent._variables._global_nvv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=18350099;
 //BA.debugLineNum = 18350099;BA.debugLine="RowDoc = Variables.Global_BLV";
_rowdoc = parent.mostCurrent._variables._global_blv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=18350101;
 //BA.debugLineNum = 18350101;BA.debugLine="RowDoc = Variables.Global_FCV";
_rowdoc = parent.mostCurrent._variables._global_fcv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=18350104;
 //BA.debugLineNum = 18350104;BA.debugLine="Dim NroLineasXpag As Int = RowDoc.Get(\"NroLineasX";
_nrolineasxpag = (int)(BA.ObjectToNumber(_rowdoc.Get((Object)("NroLineasXpag"))));
RDebugUtils.currentLine=18350105;
 //BA.debugLineNum = 18350105;BA.debugLine="Dim Lineas As Int = XclvDetalle.Size";
_lineas = parent.mostCurrent._xclvdetalle._getsize();
RDebugUtils.currentLine=18350108;
 //BA.debugLineNum = 18350108;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18350110;
 //BA.debugLineNum = 18350110;BA.debugLine="If NroLineasXpag < Lineas+1 Then";
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
RDebugUtils.currentLine=18350111;
 //BA.debugLineNum = 18350111;BA.debugLine="Msgbox2Async(\"No es posible ingresar más líneas";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar más líneas en detalle"+anywheresoftware.b4a.keywords.Common.CRLF+"Máximo de líneas por documento ["+BA.NumberToString(_nrolineasxpag)+"]"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18350113;
 //BA.debugLineNum = 18350113;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=18350116;
 //BA.debugLineNum = 18350116;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=18350117;
 //BA.debugLineNum = 18350117;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_canbiar_cliente_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_canbiar_cliente_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_canbiar_cliente_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEV";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
RDebugUtils.currentLine=18874380;
 //BA.debugLineNum = 18874380;BA.debugLine="If Not(Secueven.Contains(\"B\")) Then";
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
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="Msgbox2Async(\"¡No se puede cambiar la entidad y";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡No se puede cambiar la entidad ya que existen datos en el documento!"),BA.ObjectToCharSequence("Validación"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18874384;
 //BA.debugLineNum = 18874384;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_canbiar_cliente_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=18874385;
 //BA.debugLineNum = 18874385;BA.debugLine="Return";
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
RDebugUtils.currentLine=18874390;
 //BA.debugLineNum = 18874390;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=18874392;
 //BA.debugLineNum = 18874392;BA.debugLine="BuscandoEntidad = True";
parent._buscandoentidad = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18874393;
 //BA.debugLineNum = 18874393;BA.debugLine="StartActivity(Buscar_entidad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_entidad.getObject()));
RDebugUtils.currentLine=18874395;
 //BA.debugLineNum = 18874395;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_coddocdestino_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_coddocdestino_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_coddocdestino_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="Wait For (Fx_Cambiar_DocDespSimple_Poswii) comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_coddocdestino_click"), _fx_cambiar_docdespsimple_poswii());
this.state = 21;
return;
case 21:
//C
this.state = 1;
_tienepermiso = (Boolean) result[0];
;
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="If Not(TienePermiso) Then";
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
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=20578314;
 //BA.debugLineNum = 20578314;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20578316;
 //BA.debugLineNum = 20578316;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=20578318;
 //BA.debugLineNum = 20578318;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_DocDesti";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_coddocdestino_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._despsimple_docdestino),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 22;
return;
case 22:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=20578321;
 //BA.debugLineNum = 20578321;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20578323;
 //BA.debugLineNum = 20578323;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20578325;
 //BA.debugLineNum = 20578325;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
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
RDebugUtils.currentLine=20578327;
 //BA.debugLineNum = 20578327;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
RDebugUtils.currentLine=20578328;
 //BA.debugLineNum = 20578328;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=20578330;
 //BA.debugLineNum = 20578330;BA.debugLine="If DespSimple_DocDestino.SelectedItem.Trim = N";
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
RDebugUtils.currentLine=20578331;
 //BA.debugLineNum = 20578331;BA.debugLine="Lbl_CodDocDestino.Tag = CodigoTabla";
parent.mostCurrent._lbl_coddocdestino.setTag((Object)(_codigotabla));
RDebugUtils.currentLine=20578332;
 //BA.debugLineNum = 20578332;BA.debugLine="Lbl_CodDocDestino.Text = NombreTabla";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(_nombretabla));
RDebugUtils.currentLine=20578333;
 //BA.debugLineNum = 20578333;BA.debugLine="Exit";
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
RDebugUtils.currentLine=20578342;
 //BA.debugLineNum = 20578342;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cambiar_docdespsimple_poswii() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fx_cambiar_docdespsimple_poswii", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "fx_cambiar_docdespsimple_poswii", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="Dim Existe As Boolean";
_existe = false;
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="Dim Clave As String";
_clave = "";
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="Dim Koen As String = Row_Entidad.Get(\"KOEN\")";
_koen = BA.ObjectToString(parent._row_entidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=19791887;
 //BA.debugLineNum = 19791887;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del permiso"));
RDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=19791890;
 //BA.debugLineNum = 19791890;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19791891;
 //BA.debugLineNum = 19791891;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19791892;
 //BA.debugLineNum = 19791892;BA.debugLine="Clave = InputTemplate.Text";
_clave = parent.mostCurrent._inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=19791894;
 //BA.debugLineNum = 19791894;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=19791898;
 //BA.debugLineNum = 19791898;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19791901;
 //BA.debugLineNum = 19791901;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_clave_docdespsimple_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_clave,_koen,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19791902;
 //BA.debugLineNum = 19791902;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), (Object)(_js));
this.state = 30;
return;
case 30:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19791904;
 //BA.debugLineNum = 19791904;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19791906;
 //BA.debugLineNum = 19791906;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19791907;
 //BA.debugLineNum = 19791907;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19791909;
 //BA.debugLineNum = 19791909;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=19791911;
 //BA.debugLineNum = 19791911;BA.debugLine="Existe = Fila.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_fila.Get((Object)("Existe")));
RDebugUtils.currentLine=19791912;
 //BA.debugLineNum = 19791912;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_fila.Get((Object)("Otorgado")));
RDebugUtils.currentLine=19791914;
 //BA.debugLineNum = 19791914;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19791916;
 //BA.debugLineNum = 19791916;BA.debugLine="If Existe Then";
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
RDebugUtils.currentLine=19791917;
 //BA.debugLineNum = 19791917;BA.debugLine="If Otorgado Then";
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
RDebugUtils.currentLine=19791918;
 //BA.debugLineNum = 19791918;BA.debugLine="Msgbox2Async(\"Este permiso ya fue utilizado\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este permiso ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19791919;
 //BA.debugLineNum = 19791919;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), null);
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
RDebugUtils.currentLine=19791924;
 //BA.debugLineNum = 19791924;BA.debugLine="Return True";
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
RDebugUtils.currentLine=19791927;
 //BA.debugLineNum = 19791927;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19791928;
 //BA.debugLineNum = 19791928;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), null);
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
RDebugUtils.currentLine=19791933;
 //BA.debugLineNum = 19791933;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19791934;
 //BA.debugLineNum = 19791934;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), null);
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
RDebugUtils.currentLine=19791937;
 //BA.debugLineNum = 19791937;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19791938;
 //BA.debugLineNum = 19791938;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=19791940;
 //BA.debugLineNum = 19791940;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_dsctoglobal_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_dsctoglobal_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_dsctoglobal_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="If Cursor1.RowCount = 0 Then";
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
RDebugUtils.currentLine=19595275;
 //BA.debugLineNum = 19595275;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19595277;
 //BA.debugLineNum = 19595277;BA.debugLine="Msgbox2Async(\"¡No se puede agregar un concepto g";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡No se puede agregar un concepto global si no existen datos en el documento!"),BA.ObjectToCharSequence("Validación"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595278;
 //BA.debugLineNum = 19595278;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), null);
this.state = 33;
return;
case 33:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19595279;
 //BA.debugLineNum = 19595279;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=19595283;
 //BA.debugLineNum = 19595283;BA.debugLine="Wait For(Fx_ExisteDescuentoGlobal) Complete (Rsdc";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _fx_existedescuentoglobal());
this.state = 34;
return;
case 34:
//C
this.state = 5;
_rsdctogl = (Boolean) result[0];
;
RDebugUtils.currentLine=19595284;
 //BA.debugLineNum = 19595284;BA.debugLine="If RsdctoGl Then";
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
RDebugUtils.currentLine=19595285;
 //BA.debugLineNum = 19595285;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=19595288;
 //BA.debugLineNum = 19595288;BA.debugLine="Btn_DsctoGlobal.Enabled = False";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19595290;
 //BA.debugLineNum = 19595290;BA.debugLine="Wait For(Sb_Buscar_Dscto_X_Cliente) Complete (Res";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _sb_buscar_dscto_x_cliente());
this.state = 35;
return;
case 35:
//C
this.state = 9;
_resultdscto = (Double) result[0];
;
RDebugUtils.currentLine=19595291;
 //BA.debugLineNum = 19595291;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
RDebugUtils.currentLine=19595293;
 //BA.debugLineNum = 19595293;BA.debugLine="If ResultDscto < 0 Then";
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
RDebugUtils.currentLine=19595294;
 //BA.debugLineNum = 19595294;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595295;
 //BA.debugLineNum = 19595295;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19595296;
 //BA.debugLineNum = 19595296;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=19595299;
 //BA.debugLineNum = 19595299;BA.debugLine="If ResultDscto > 0 Then";

case 12:
//if
this.state = 15;
if (_resultdscto>0) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=19595300;
 //BA.debugLineNum = 19595300;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
 if (true) break;
;
RDebugUtils.currentLine=19595303;
 //BA.debugLineNum = 19595303;BA.debugLine="If ResultDscto = 0 Then";

case 15:
//if
this.state = 22;
if (_resultdscto==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=19595305;
 //BA.debugLineNum = 19595305;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _fx_insertar_dscto_global_permiso());
this.state = 36;
return;
case 36:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19595306;
 //BA.debugLineNum = 19595306;BA.debugLine="DescuentoPorc = Result";
_descuentoporc = _result;
RDebugUtils.currentLine=19595308;
 //BA.debugLineNum = 19595308;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=19595309;
 //BA.debugLineNum = 19595309;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595310;
 //BA.debugLineNum = 19595310;BA.debugLine="Return";
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
RDebugUtils.currentLine=19595315;
 //BA.debugLineNum = 19595315;BA.debugLine="Dim Concepto As String = \"DESCUENTO\"";
_concepto = "DESCUENTO";
RDebugUtils.currentLine=19595316;
 //BA.debugLineNum = 19595316;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=19595317;
 //BA.debugLineNum = 19595317;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=19595318;
 //BA.debugLineNum = 19595318;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=19595319;
 //BA.debugLineNum = 19595319;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=19595321;
 //BA.debugLineNum = 19595321;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_concepto,_empresa,_sucursal,_bodega,_lista,"");
RDebugUtils.currentLine=19595323;
 //BA.debugLineNum = 19595323;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), (Object)(_js));
this.state = 37;
return;
case 37:
//C
this.state = 23;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19595324;
 //BA.debugLineNum = 19595324;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando concepto..."));
RDebugUtils.currentLine=19595326;
 //BA.debugLineNum = 19595326;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19595328;
 //BA.debugLineNum = 19595328;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19595330;
 //BA.debugLineNum = 19595330;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19595332;
 //BA.debugLineNum = 19595332;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=19595333;
 //BA.debugLineNum = 19595333;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=19595335;
 //BA.debugLineNum = 19595335;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
RDebugUtils.currentLine=19595337;
 //BA.debugLineNum = 19595337;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("Moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=19595338;
 //BA.debugLineNum = 19595338;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=19595339;
 //BA.debugLineNum = 19595339;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=19595340;
 //BA.debugLineNum = 19595340;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=19595342;
 //BA.debugLineNum = 19595342;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=19595344;
 //BA.debugLineNum = 19595344;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=19595345;
 //BA.debugLineNum = 19595345;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=19595347;
 //BA.debugLineNum = 19595347;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
_id_docdet2 = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=19595349;
 //BA.debugLineNum = 19595349;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Id_DocDet2)";
_sb_procesar_fila("DescuentoPorc",_id_docdet2);
RDebugUtils.currentLine=19595351;
 //BA.debugLineNum = 19595351;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=19595353;
 //BA.debugLineNum = 19595353;BA.debugLine="Msgbox2Async(\"Descuento incorporado correctamen";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento incorporado correctamente"),BA.ObjectToCharSequence("Dscto. Global"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595354;
 //BA.debugLineNum = 19595354;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), null);
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
RDebugUtils.currentLine=19595359;
 //BA.debugLineNum = 19595359;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("619595359",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=19595360;
 //BA.debugLineNum = 19595360;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=19595363;
 //BA.debugLineNum = 19595363;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19595364;
 //BA.debugLineNum = 19595364;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19595366;
 //BA.debugLineNum = 19595366;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_existedescuentoglobal() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fx_existedescuentoglobal", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "fx_existedescuentoglobal", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=20316170;
 //BA.debugLineNum = 20316170;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="For Row = 0 To RowNumber - 1";
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
RDebugUtils.currentLine=20316174;
 //BA.debugLineNum = 20316174;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=20316175;
 //BA.debugLineNum = 20316175;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
parent.mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
RDebugUtils.currentLine=20316177;
 //BA.debugLineNum = 20316177;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
parent._id_docdet = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDet")));
RDebugUtils.currentLine=20316178;
 //BA.debugLineNum = 20316178;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
_tict = _cursor1.GetString("Tict");
RDebugUtils.currentLine=20316179;
 //BA.debugLineNum = 20316179;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
_prct = (int)(Double.parseDouble(_cursor1.GetString("Prct")));
RDebugUtils.currentLine=20316181;
 //BA.debugLineNum = 20316181;BA.debugLine="If Prct = 1 And Tict = \"D\" Then";
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
RDebugUtils.currentLine=20316183;
 //BA.debugLineNum = 20316183;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=20316184;
 //BA.debugLineNum = 20316184;BA.debugLine="Msgbox2Async(\"¡YA EXISTE UN DESCUENTO GLOBAL!\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡YA EXISTE UN DESCUENTO GLOBAL!"),BA.ObjectToCharSequence("Validación"),"OK","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20316185;
 //BA.debugLineNum = 20316185;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_existedescuentoglobal"), null);
this.state = 17;
return;
case 17:
//C
this.state = 10;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=20316186;
 //BA.debugLineNum = 20316186;BA.debugLine="Return True";
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
RDebugUtils.currentLine=20316192;
 //BA.debugLineNum = 20316192;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=20316195;
 //BA.debugLineNum = 20316195;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=20316197;
 //BA.debugLineNum = 20316197;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=20316199;
 //BA.debugLineNum = 20316199;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_buscar_dscto_x_cliente() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_buscar_dscto_x_cliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_buscar_dscto_x_cliente", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
_koen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad".toLowerCase())));
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
_suen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad".toLowerCase())));
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=19660813;
 //BA.debugLineNum = 19660813;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_descuento_global_x_cliente /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_koen,_suen);
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19660816;
 //BA.debugLineNum = 19660816;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19660818;
 //BA.debugLineNum = 19660818;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19660819;
 //BA.debugLineNum = 19660819;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19660821;
 //BA.debugLineNum = 19660821;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=19660823;
 //BA.debugLineNum = 19660823;BA.debugLine="Dim TieneDsctoEspecial As Boolean = Fila.Get(\"T";
_tienedsctoespecial = BA.ObjectToBoolean(_fila.Get((Object)("TieneDsctoEspecial")));
RDebugUtils.currentLine=19660824;
 //BA.debugLineNum = 19660824;BA.debugLine="Dim Error As String = Fila.Get(\"Error\")";
_error = BA.ObjectToString(_fila.Get((Object)("Error")));
RDebugUtils.currentLine=19660825;
 //BA.debugLineNum = 19660825;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("Descuento"))));
RDebugUtils.currentLine=19660837;
 //BA.debugLineNum = 19660837;BA.debugLine="If TieneDsctoEspecial = False Then";
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
RDebugUtils.currentLine=19660838;
 //BA.debugLineNum = 19660838;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=19660841;
 //BA.debugLineNum = 19660841;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=19660847;
 //BA.debugLineNum = 19660847;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma el descuento adicional de un "+BA.NumberToString(_descuentoporc)+"%?"),BA.ObjectToCharSequence("Descuento global adicional"),"Confirmar","Cancelar","Ingresar otro dscto.",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=19660849;
 //BA.debugLineNum = 19660849;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 11;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19660851;
 //BA.debugLineNum = 19660851;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
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
RDebugUtils.currentLine=19660852;
 //BA.debugLineNum = 19660852;BA.debugLine="Return -1";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(-1));return;};
 if (true) break;
;
RDebugUtils.currentLine=19660855;
 //BA.debugLineNum = 19660855;BA.debugLine="If Result = xui.DialogResponse_Negative Then";

case 14:
//if
this.state = 35;
if (_result==_xui.DialogResponse_Negative) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=19660857;
 //BA.debugLineNum = 19660857;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19660858;
 //BA.debugLineNum = 19660858;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=19660860;
 //BA.debugLineNum = 19660860;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19660861;
 //BA.debugLineNum = 19660861;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=19660863;
 //BA.debugLineNum = 19660863;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese descuen";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese descuento. Max "+BA.NumberToString(_descuentoporc)+"%"));
RDebugUtils.currentLine=19660864;
 //BA.debugLineNum = 19660864;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=19660865;
 //BA.debugLineNum = 19660865;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
parent.mostCurrent._inputtemplate._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19660867;
 //BA.debugLineNum = 19660867;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19660868;
 //BA.debugLineNum = 19660868;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19660869;
 //BA.debugLineNum = 19660869;BA.debugLine="Try";
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
RDebugUtils.currentLine=19660870;
 //BA.debugLineNum = 19660870;BA.debugLine="Dim NewDescuentoPorc As Double = InputTempla";
_newdescuentoporc = (double)(Double.parseDouble(parent.mostCurrent._inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=19660872;
 //BA.debugLineNum = 19660872;BA.debugLine="If NewDescuentoPorc > DescuentoPorc Then";
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
RDebugUtils.currentLine=19660873;
 //BA.debugLineNum = 19660873;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-c";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19660874;
 //BA.debugLineNum = 19660874;BA.debugLine="Msgbox2Async(\"El descuento no puede ser may";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El descuento no puede ser mayor a un "+BA.NumberToString(_descuentoporc)+"%"+anywheresoftware.b4a.keywords.Common.CRLF+"Debe ingresar un código de autorización"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19660876;
 //BA.debugLineNum = 19660876;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), null);
this.state = 41;
return;
case 41:
//C
this.state = 28;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19660877;
 //BA.debugLineNum = 19660877;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=19660879;
 //BA.debugLineNum = 19660879;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
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
RDebugUtils.currentLine=19660883;
 //BA.debugLineNum = 19660883;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("619660883",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=19660884;
 //BA.debugLineNum = 19660884;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19660885;
 //BA.debugLineNum = 19660885;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19660886;
 //BA.debugLineNum = 19660886;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), null);
this.state = 42;
return;
case 42:
//C
this.state = 31;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19660887;
 //BA.debugLineNum = 19660887;BA.debugLine="DescuentoPorc = -1";
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
RDebugUtils.currentLine=19660890;
 //BA.debugLineNum = 19660890;BA.debugLine="DescuentoPorc = -1";
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
RDebugUtils.currentLine=19660899;
 //BA.debugLineNum = 19660899;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
RDebugUtils.currentLine=19660901;
 //BA.debugLineNum = 19660901;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_insertar_dscto_global_permiso() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fx_insertar_dscto_global_permiso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "fx_insertar_dscto_global_permiso", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="Dim Existe As Boolean";
_existe = false;
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="Dim DescuentoPorc As Int = 0";
_descuentoporc = (int) (0);
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="Dim Clave As String";
_clave = "";
RDebugUtils.currentLine=19726351;
 //BA.debugLineNum = 19726351;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
RDebugUtils.currentLine=19726352;
 //BA.debugLineNum = 19726352;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=19726354;
 //BA.debugLineNum = 19726354;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19726355;
 //BA.debugLineNum = 19726355;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19726356;
 //BA.debugLineNum = 19726356;BA.debugLine="Clave = InputTemplate.Text";
_clave = parent.mostCurrent._inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=19726358;
 //BA.debugLineNum = 19726358;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=19726362;
 //BA.debugLineNum = 19726362;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19726365;
 //BA.debugLineNum = 19726365;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_dscto_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_clave,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU"))),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19726366;
 //BA.debugLineNum = 19726366;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), (Object)(_js));
this.state = 36;
return;
case 36:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19726368;
 //BA.debugLineNum = 19726368;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19726370;
 //BA.debugLineNum = 19726370;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19726371;
 //BA.debugLineNum = 19726371;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19726373;
 //BA.debugLineNum = 19726373;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=19726375;
 //BA.debugLineNum = 19726375;BA.debugLine="Existe = Fila.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_fila.Get((Object)("Existe")));
RDebugUtils.currentLine=19726376;
 //BA.debugLineNum = 19726376;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_fila.Get((Object)("Otorgado")));
RDebugUtils.currentLine=19726377;
 //BA.debugLineNum = 19726377;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
_descuentoporc = (int)(BA.ObjectToNumber(_fila.Get((Object)("Descuento"))));
RDebugUtils.currentLine=19726379;
 //BA.debugLineNum = 19726379;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19726381;
 //BA.debugLineNum = 19726381;BA.debugLine="If Existe Then";
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
RDebugUtils.currentLine=19726382;
 //BA.debugLineNum = 19726382;BA.debugLine="If Otorgado Then";
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
RDebugUtils.currentLine=19726383;
 //BA.debugLineNum = 19726383;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este descuento ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19726384;
 //BA.debugLineNum = 19726384;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 37;
return;
case 37:
//C
this.state = 27;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19726385;
 //BA.debugLineNum = 19726385;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=19726387;
 //BA.debugLineNum = 19726387;BA.debugLine="If DescuentoPorc <=0 Then";
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
RDebugUtils.currentLine=19726388;
 //BA.debugLineNum = 19726388;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede incorporar este descuento, ya que no es un valor valido."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19726390;
 //BA.debugLineNum = 19726390;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 38;
return;
case 38:
//C
this.state = 26;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19726391;
 //BA.debugLineNum = 19726391;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=19726393;
 //BA.debugLineNum = 19726393;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=19726394;
 //BA.debugLineNum = 19726394;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento aceptado."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19726395;
 //BA.debugLineNum = 19726395;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
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
RDebugUtils.currentLine=19726399;
 //BA.debugLineNum = 19726399;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19726400;
 //BA.debugLineNum = 19726400;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
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
RDebugUtils.currentLine=19726405;
 //BA.debugLineNum = 19726405;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19726406;
 //BA.debugLineNum = 19726406;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
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
RDebugUtils.currentLine=19726409;
 //BA.debugLineNum = 19726409;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19726410;
 //BA.debugLineNum = 19726410;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
RDebugUtils.currentLine=19726412;
 //BA.debugLineNum = 19726412;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_procesar_fila(String _cabeza,int _id_docdet2) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_procesar_fila", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_procesar_fila", new Object[] {_cabeza,_id_docdet2}));}
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
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub Sb_Procesar_Fila(Cabeza As String, Id_DocDet2";
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Dim Fila,Fila_Id As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet2);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
_fila_id = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet2);
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
_fila = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18153482;
 //BA.debugLineNum = 18153482;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(_fila.Get((Object)("untrans"))));
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(_fila.Get((Object)("poriva"))));
RDebugUtils.currentLine=18153484;
 //BA.debugLineNum = 18153484;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(_fila.Get((Object)("porila"))));
RDebugUtils.currentLine=18153485;
 //BA.debugLineNum = 18153485;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(_fila.Get((Object)("rtu"))));
RDebugUtils.currentLine=18153487;
 //BA.debugLineNum = 18153487;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
RDebugUtils.currentLine=18153489;
 //BA.debugLineNum = 18153489;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
RDebugUtils.currentLine=18153490;
 //BA.debugLineNum = 18153490;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
RDebugUtils.currentLine=18153491;
 //BA.debugLineNum = 18153491;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
RDebugUtils.currentLine=18153492;
 //BA.debugLineNum = 18153492;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
RDebugUtils.currentLine=18153494;
 //BA.debugLineNum = 18153494;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
RDebugUtils.currentLine=18153495;
 //BA.debugLineNum = 18153495;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
RDebugUtils.currentLine=18153497;
 //BA.debugLineNum = 18153497;BA.debugLine="Dim Precio As Double = Fila.Get(Cabeza.ToLowerCas";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)(_cabeza.toLowerCase()))));
RDebugUtils.currentLine=18153499;
 //BA.debugLineNum = 18153499;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
RDebugUtils.currentLine=18153500;
 //BA.debugLineNum = 18153500;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
RDebugUtils.currentLine=18153502;
 //BA.debugLineNum = 18153502;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
RDebugUtils.currentLine=18153503;
 //BA.debugLineNum = 18153503;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
RDebugUtils.currentLine=18153505;
 //BA.debugLineNum = 18153505;BA.debugLine="Dim Total As Double";
_total = 0;
RDebugUtils.currentLine=18153507;
 //BA.debugLineNum = 18153507;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
RDebugUtils.currentLine=18153509;
 //BA.debugLineNum = 18153509;BA.debugLine="Dim Cantidad As Double";
_cantidad = 0;
RDebugUtils.currentLine=18153510;
 //BA.debugLineNum = 18153510;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
RDebugUtils.currentLine=18153511;
 //BA.debugLineNum = 18153511;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
RDebugUtils.currentLine=18153513;
 //BA.debugLineNum = 18153513;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
_divisible = "";
RDebugUtils.currentLine=18153514;
 //BA.debugLineNum = 18153514;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
_divisible2 = "";
RDebugUtils.currentLine=18153516;
 //BA.debugLineNum = 18153516;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor"))));
RDebugUtils.currentLine=18153517;
 //BA.debugLineNum = 18153517;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=18153518;
 //BA.debugLineNum = 18153518;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=18153519;
 //BA.debugLineNum = 18153519;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(_fila.Get((Object)("descmaximo"))));
RDebugUtils.currentLine=18153521;
 //BA.debugLineNum = 18153521;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(_fila.Get((Object)("tict")));
RDebugUtils.currentLine=18153522;
 //BA.debugLineNum = 18153522;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(_fila.Get((Object)("prct")));
RDebugUtils.currentLine=18153523;
 //BA.debugLineNum = 18153523;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(_fila.Get((Object)("tipr")));
RDebugUtils.currentLine=18153525;
 //BA.debugLineNum = 18153525;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("codlista")));
RDebugUtils.currentLine=18153527;
 //BA.debugLineNum = 18153527;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
RDebugUtils.currentLine=18153529;
 //BA.debugLineNum = 18153529;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
RDebugUtils.currentLine=18153530;
 //BA.debugLineNum = 18153530;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
RDebugUtils.currentLine=18153532;
 //BA.debugLineNum = 18153532;BA.debugLine="If No_Aplica_Redondeo Then";
if (_no_aplica_redondeo) { 
RDebugUtils.currentLine=18153533;
 //BA.debugLineNum = 18153533;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=18153536;
 //BA.debugLineNum = 18153536;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
RDebugUtils.currentLine=18153537;
 //BA.debugLineNum = 18153537;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
RDebugUtils.currentLine=18153539;
 //BA.debugLineNum = 18153539;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
RDebugUtils.currentLine=18153540;
 //BA.debugLineNum = 18153540;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
RDebugUtils.currentLine=18153544;
 //BA.debugLineNum = 18153544;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor_anterior"))));
RDebugUtils.currentLine=18153545;
 //BA.debugLineNum = 18153545;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
RDebugUtils.currentLine=18153547;
 //BA.debugLineNum = 18153547;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (_cantidad==0 && (_tipr).equals("") == false) { 
 };
RDebugUtils.currentLine=18153554;
 //BA.debugLineNum = 18153554;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
RDebugUtils.currentLine=18153556;
 //BA.debugLineNum = 18153556;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("moneda_doc")));
RDebugUtils.currentLine=18153557;
 //BA.debugLineNum = 18153557;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
_tipo_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("tipomoneda")));
RDebugUtils.currentLine=18153558;
 //BA.debugLineNum = 18153558;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("tasadorig_doc"))));
RDebugUtils.currentLine=18153560;
 //BA.debugLineNum = 18153560;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(_fila.Get((Object)("moneda")));
RDebugUtils.currentLine=18153561;
 //BA.debugLineNum = 18153561;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(_fila.Get((Object)("tipo_moneda")));
RDebugUtils.currentLine=18153562;
 //BA.debugLineNum = 18153562;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(_fila.Get((Object)("tipo_cambio"))));
RDebugUtils.currentLine=18153564;
 //BA.debugLineNum = 18153564;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
RDebugUtils.currentLine=18153566;
 //BA.debugLineNum = 18153566;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
RDebugUtils.currentLine=18153567;
 //BA.debugLineNum = 18153567;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if ((_tipo_moneda_enc).equals("N")) { 
RDebugUtils.currentLine=18153568;
 //BA.debugLineNum = 18153568;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio*_tipo_cambio_ent,(int) (2));
 }else {
RDebugUtils.currentLine=18153570;
 //BA.debugLineNum = 18153570;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
RDebugUtils.currentLine=18153571;
 //BA.debugLineNum = 18153571;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 }else {
RDebugUtils.currentLine=18153574;
 //BA.debugLineNum = 18153574;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=18153575;
 //BA.debugLineNum = 18153575;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
RDebugUtils.currentLine=18153577;
 //BA.debugLineNum = 18153577;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 };
RDebugUtils.currentLine=18153582;
 //BA.debugLineNum = 18153582;BA.debugLine="Dim Divi As String";
_divi = "";
RDebugUtils.currentLine=18153584;
 //BA.debugLineNum = 18153584;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=18153585;
 //BA.debugLineNum = 18153585;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 };
RDebugUtils.currentLine=18153588;
 //BA.debugLineNum = 18153588;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=18153589;
 //BA.debugLineNum = 18153589;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 };
RDebugUtils.currentLine=18153604;
 //BA.debugLineNum = 18153604;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=18153605;
 //BA.debugLineNum = 18153605;BA.debugLine="If Rtu = 1 Then";
if (_rtu==1) { 
RDebugUtils.currentLine=18153606;
 //BA.debugLineNum = 18153606;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=18153607;
 //BA.debugLineNum = 18153607;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=18153609;
 //BA.debugLineNum = 18153609;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=18153610;
 //BA.debugLineNum = 18153610;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=18153614;
 //BA.debugLineNum = 18153614;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=18153615;
 //BA.debugLineNum = 18153615;BA.debugLine="If Rtu > 1 Then";
if (_rtu>1) { 
RDebugUtils.currentLine=18153616;
 //BA.debugLineNum = 18153616;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=18153617;
 //BA.debugLineNum = 18153617;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=18153619;
 //BA.debugLineNum = 18153619;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=18153620;
 //BA.debugLineNum = 18153620;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=18153624;
 //BA.debugLineNum = 18153624;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=18153634;
 //BA.debugLineNum = 18153634;BA.debugLine="TotalNeto_Calculo = Lbl_Total_Neto.Tag";
_totalneto_calculo = (double)(BA.ObjectToNumber(mostCurrent._lbl_total_neto.getTag()));
RDebugUtils.currentLine=18153635;
 //BA.debugLineNum = 18153635;BA.debugLine="TotalBruto_Calculo = Lbl_Total_Bruto.Tag";
_totalbruto_calculo = (double)(BA.ObjectToNumber(mostCurrent._lbl_total_bruto.getTag()));
RDebugUtils.currentLine=18153637;
 //BA.debugLineNum = 18153637;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=18153639;
 //BA.debugLineNum = 18153639;BA.debugLine="Descontar = True";
_descontar = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18153640;
 //BA.debugLineNum = 18153640;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
RDebugUtils.currentLine=18153640;
 //BA.debugLineNum = 18153640;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
RDebugUtils.currentLine=18153640;
 //BA.debugLineNum = 18153640;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
RDebugUtils.currentLine=18153641;
 //BA.debugLineNum = 18153641;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
RDebugUtils.currentLine=18153643;
 //BA.debugLineNum = 18153643;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=18153645;
 //BA.debugLineNum = 18153645;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153646;
 //BA.debugLineNum = 18153646;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153648;
 //BA.debugLineNum = 18153648;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=18153650;
 //BA.debugLineNum = 18153650;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153652;
 //BA.debugLineNum = 18153652;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=18153655;
 //BA.debugLineNum = 18153655;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=18153657;
 //BA.debugLineNum = 18153657;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153659;
 //BA.debugLineNum = 18153659;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=18153662;
 //BA.debugLineNum = 18153662;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 }else 
{RDebugUtils.currentLine=18153667;
 //BA.debugLineNum = 18153667;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=18153669;
 //BA.debugLineNum = 18153669;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=18153670;
 //BA.debugLineNum = 18153670;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(_fila.Get((Object)("recargovalor"))));
RDebugUtils.currentLine=18153672;
 //BA.debugLineNum = 18153672;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153673;
 //BA.debugLineNum = 18153673;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 }else {
RDebugUtils.currentLine=18153675;
 //BA.debugLineNum = 18153675;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_total_concepto/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=18153676;
 //BA.debugLineNum = 18153676;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 };
RDebugUtils.currentLine=18153679;
 //BA.debugLineNum = 18153679;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=18153681;
 //BA.debugLineNum = 18153681;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=18153682;
 //BA.debugLineNum = 18153682;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=18153684;
 //BA.debugLineNum = 18153684;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
RDebugUtils.currentLine=18153686;
 //BA.debugLineNum = 18153686;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153688;
 //BA.debugLineNum = 18153688;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153689;
 //BA.debugLineNum = 18153689;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = anywheresoftware.b4a.keywords.Common.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153691;
 //BA.debugLineNum = 18153691;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
RDebugUtils.currentLine=18153692;
 //BA.debugLineNum = 18153692;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 }else {
RDebugUtils.currentLine=18153696;
 //BA.debugLineNum = 18153696;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153698;
 //BA.debugLineNum = 18153698;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=18153702;
 //BA.debugLineNum = 18153702;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
if ((_cabeza).equals("ValNetoLinea")) { 
RDebugUtils.currentLine=18153704;
 //BA.debugLineNum = 18153704;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=18153705;
 //BA.debugLineNum = 18153705;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=18153707;
 //BA.debugLineNum = 18153707;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153709;
 //BA.debugLineNum = 18153709;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 }else {
RDebugUtils.currentLine=18153712;
 //BA.debugLineNum = 18153712;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 };
RDebugUtils.currentLine=18153715;
 //BA.debugLineNum = 18153715;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 }}
;
RDebugUtils.currentLine=18153719;
 //BA.debugLineNum = 18153719;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 }}
;
 }else {
RDebugUtils.currentLine=18153735;
 //BA.debugLineNum = 18153735;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153736;
 //BA.debugLineNum = 18153736;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 }else {
RDebugUtils.currentLine=18153738;
 //BA.debugLineNum = 18153738;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio_calculado/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=18153739;
 //BA.debugLineNum = 18153739;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 };
RDebugUtils.currentLine=18153742;
 //BA.debugLineNum = 18153742;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_precioneto*_cantidad,(int) (3));
RDebugUtils.currentLine=18153743;
 //BA.debugLineNum = 18153743;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153745;
 //BA.debugLineNum = 18153745;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
RDebugUtils.currentLine=18153747;
 //BA.debugLineNum = 18153747;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=18153748;
 //BA.debugLineNum = 18153748;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
RDebugUtils.currentLine=18153760;
 //BA.debugLineNum = 18153760;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
RDebugUtils.currentLine=18153761;
 //BA.debugLineNum = 18153761;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
RDebugUtils.currentLine=18153765;
 //BA.debugLineNum = 18153765;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
RDebugUtils.currentLine=18153767;
 //BA.debugLineNum = 18153767;BA.debugLine="If Precio > 0 Then";
if (_precio>0) { 
RDebugUtils.currentLine=18153769;
 //BA.debugLineNum = 18153769;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153771;
 //BA.debugLineNum = 18153771;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153773;
 //BA.debugLineNum = 18153773;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=18153777;
 //BA.debugLineNum = 18153777;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153779;
 //BA.debugLineNum = 18153779;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else 
{RDebugUtils.currentLine=18153785;
 //BA.debugLineNum = 18153785;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=18153787;
 //BA.debugLineNum = 18153787;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153789;
 //BA.debugLineNum = 18153789;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=18153792;
 //BA.debugLineNum = 18153792;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 };
RDebugUtils.currentLine=18153800;
 //BA.debugLineNum = 18153800;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=18153801;
 //BA.debugLineNum = 18153801;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
_fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
RDebugUtils.currentLine=18153802;
 //BA.debugLineNum = 18153802;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
_fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
RDebugUtils.currentLine=18153804;
 //BA.debugLineNum = 18153804;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
_fila.Put((Object)("DsctoRealPorc"),(Object)(0));
RDebugUtils.currentLine=18153805;
 //BA.debugLineNum = 18153805;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
_fila.Put((Object)("DsctoRealValor"),(Object)(0));
RDebugUtils.currentLine=18153807;
 //BA.debugLineNum = 18153807;BA.debugLine="Fila.Put(\"descmaximo\",DescuentoPorc)";
_fila.Put((Object)("descmaximo"),(Object)(_descuentoporc));
RDebugUtils.currentLine=18153817;
 //BA.debugLineNum = 18153817;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
RDebugUtils.currentLine=18153819;
 //BA.debugLineNum = 18153819;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=18153820;
 //BA.debugLineNum = 18153820;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
RDebugUtils.currentLine=18153821;
 //BA.debugLineNum = 18153821;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
RDebugUtils.currentLine=18153823;
 //BA.debugLineNum = 18153823;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=18153825;
 //BA.debugLineNum = 18153825;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
RDebugUtils.currentLine=18153827;
 //BA.debugLineNum = 18153827;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153828;
 //BA.debugLineNum = 18153828;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 }else {
RDebugUtils.currentLine=18153830;
 //BA.debugLineNum = 18153830;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 };
RDebugUtils.currentLine=18153836;
 //BA.debugLineNum = 18153836;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
RDebugUtils.currentLine=18153837;
 //BA.debugLineNum = 18153837;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(_fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
RDebugUtils.currentLine=18153838;
 //BA.debugLineNum = 18153838;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = anywheresoftware.b4a.keywords.Common.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
RDebugUtils.currentLine=18153840;
 //BA.debugLineNum = 18153840;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
RDebugUtils.currentLine=18153842;
 //BA.debugLineNum = 18153842;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (_valor_dscto_real>0) { 
RDebugUtils.currentLine=18153843;
 //BA.debugLineNum = 18153843;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = anywheresoftware.b4a.keywords.Common.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 };
RDebugUtils.currentLine=18153850;
 //BA.debugLineNum = 18153850;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(_fila.Get((Object)("codfunautoriza")));
RDebugUtils.currentLine=18153852;
 //BA.debugLineNum = 18153852;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
RDebugUtils.currentLine=18153853;
 //BA.debugLineNum = 18153853;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
RDebugUtils.currentLine=18153855;
 //BA.debugLineNum = 18153855;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if ((_codfunautoriza).equals("xyz")) { 
_codfunautoriza = "";};
RDebugUtils.currentLine=18153857;
 //BA.debugLineNum = 18153857;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (_precio_cn_dscto<_precio_netolista) { 
RDebugUtils.currentLine=18153859;
 //BA.debugLineNum = 18153859;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
RDebugUtils.currentLine=18153861;
 //BA.debugLineNum = 18153861;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (_descmaximo==0) { 
_descmaximo = 0.5;};
RDebugUtils.currentLine=18153863;
 //BA.debugLineNum = 18153863;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (_dscto_real>_descmaximo) { 
RDebugUtils.currentLine=18153865;
 //BA.debugLineNum = 18153865;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18153867;
 //BA.debugLineNum = 18153867;BA.debugLine="If Vizado Then";
if (_vizado) { 
RDebugUtils.currentLine=18153868;
 //BA.debugLineNum = 18153868;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=18153873;
 //BA.debugLineNum = 18153873;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
RDebugUtils.currentLine=18153874;
 //BA.debugLineNum = 18153874;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
RDebugUtils.currentLine=18153882;
 //BA.debugLineNum = 18153882;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
RDebugUtils.currentLine=18153884;
 //BA.debugLineNum = 18153884;BA.debugLine="If Precio <> PrecioLista Then";
if (_precio!=_preciolista) { 
RDebugUtils.currentLine=18153885;
 //BA.debugLineNum = 18153885;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = anywheresoftware.b4a.keywords.Common.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 };
RDebugUtils.currentLine=18153888;
 //BA.debugLineNum = 18153888;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
if (_dscto_real>_valor_dscto) { 
RDebugUtils.currentLine=18153890;
 //BA.debugLineNum = 18153890;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
RDebugUtils.currentLine=18153893;
 //BA.debugLineNum = 18153893;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=18153898;
 //BA.debugLineNum = 18153898;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 };
 };
 }else {
RDebugUtils.currentLine=18153920;
 //BA.debugLineNum = 18153920;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=18153926;
 //BA.debugLineNum = 18153926;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153928;
 //BA.debugLineNum = 18153928;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 }else {
RDebugUtils.currentLine=18153932;
 //BA.debugLineNum = 18153932;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 };
RDebugUtils.currentLine=18153938;
 //BA.debugLineNum = 18153938;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18153940;
 //BA.debugLineNum = 18153940;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153941;
 //BA.debugLineNum = 18153941;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=18153942;
 //BA.debugLineNum = 18153942;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=18153943;
 //BA.debugLineNum = 18153943;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=18153944;
 //BA.debugLineNum = 18153944;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=18153946;
 //BA.debugLineNum = 18153946;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
RDebugUtils.currentLine=18153948;
 //BA.debugLineNum = 18153948;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
RDebugUtils.currentLine=18153949;
 //BA.debugLineNum = 18153949;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
_preciobruto = anywheresoftware.b4a.keywords.Common.Round2(_precio*_impuestos,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=18153951;
 //BA.debugLineNum = 18153951;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=18153952;
 //BA.debugLineNum = 18153952;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 };
RDebugUtils.currentLine=18153955;
 //BA.debugLineNum = 18153955;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=18153957;
 //BA.debugLineNum = 18153957;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
RDebugUtils.currentLine=18153958;
 //BA.debugLineNum = 18153958;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 };
 }else {
RDebugUtils.currentLine=18153964;
 //BA.debugLineNum = 18153964;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=18153965;
 //BA.debugLineNum = 18153965;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=18153966;
 //BA.debugLineNum = 18153966;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=18153967;
 //BA.debugLineNum = 18153967;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=18153968;
 //BA.debugLineNum = 18153968;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
RDebugUtils.currentLine=18153970;
 //BA.debugLineNum = 18153970;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
RDebugUtils.currentLine=18153971;
 //BA.debugLineNum = 18153971;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=18153973;
 //BA.debugLineNum = 18153973;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=18153975;
 //BA.debugLineNum = 18153975;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
RDebugUtils.currentLine=18153976;
 //BA.debugLineNum = 18153976;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 };
 };
RDebugUtils.currentLine=18154032;
 //BA.debugLineNum = 18154032;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=18154034;
 //BA.debugLineNum = 18154034;BA.debugLine="Dim Multiplo As Int";
_multiplo = 0;
RDebugUtils.currentLine=18154036;
 //BA.debugLineNum = 18154036;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=18154037;
 //BA.debugLineNum = 18154037;BA.debugLine="Multiplo = -1";
_multiplo = (int) (-1);
 }else 
{RDebugUtils.currentLine=18154038;
 //BA.debugLineNum = 18154038;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=18154039;
 //BA.debugLineNum = 18154039;BA.debugLine="Multiplo = 1";
_multiplo = (int) (1);
 }}
;
RDebugUtils.currentLine=18154042;
 //BA.debugLineNum = 18154042;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=18154044;
 //BA.debugLineNum = 18154044;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*_multiplo;
RDebugUtils.currentLine=18154045;
 //BA.debugLineNum = 18154045;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 }else {
RDebugUtils.currentLine=18154049;
 //BA.debugLineNum = 18154049;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*_multiplo;
RDebugUtils.currentLine=18154050;
 //BA.debugLineNum = 18154050;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 };
 };
RDebugUtils.currentLine=18154056;
 //BA.debugLineNum = 18154056;BA.debugLine="If Prct = 0 Then";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=18154058;
 //BA.debugLineNum = 18154058;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=18154060;
 //BA.debugLineNum = 18154060;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=18154061;
 //BA.debugLineNum = 18154061;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud2,(int) (5));
RDebugUtils.currentLine=18154063;
 //BA.debugLineNum = 18154063;BA.debugLine="If Chk_Valores_Netos.Checked = False Then";
if (mostCurrent._chk_valores_netos.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=18154064;
 //BA.debugLineNum = 18154064;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 };
 }else {
RDebugUtils.currentLine=18154068;
 //BA.debugLineNum = 18154068;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=18154069;
 //BA.debugLineNum = 18154069;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 };
 };
RDebugUtils.currentLine=18154110;
 //BA.debugLineNum = 18154110;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = anywheresoftware.b4a.keywords.Common.Round2(_totalila,(int) (2));
RDebugUtils.currentLine=18154111;
 //BA.debugLineNum = 18154111;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = anywheresoftware.b4a.keywords.Common.Round2(_totaliva,(int) (2));
RDebugUtils.currentLine=18154112;
 //BA.debugLineNum = 18154112;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=18154113;
 //BA.debugLineNum = 18154113;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto,(int) (0));
RDebugUtils.currentLine=18154122;
 //BA.debugLineNum = 18154122;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
_fila.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=18154123;
 //BA.debugLineNum = 18154123;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
_fila.Put((Object)("cantud1"),(Object)(_cantud1));
RDebugUtils.currentLine=18154124;
 //BA.debugLineNum = 18154124;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
_fila.Put((Object)("cantud2"),(Object)(_cantud2));
RDebugUtils.currentLine=18154126;
 //BA.debugLineNum = 18154126;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
_fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
RDebugUtils.currentLine=18154127;
 //BA.debugLineNum = 18154127;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
_fila.Put((Object)("valivalinea"),(Object)(_totaliva));
RDebugUtils.currentLine=18154128;
 //BA.debugLineNum = 18154128;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
_fila.Put((Object)("valilalinea"),(Object)(_totalila));
RDebugUtils.currentLine=18154129;
 //BA.debugLineNum = 18154129;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
_fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
RDebugUtils.currentLine=18154131;
 //BA.debugLineNum = 18154131;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
_fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
RDebugUtils.currentLine=18154132;
 //BA.debugLineNum = 18154132;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
_fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
RDebugUtils.currentLine=18154134;
 //BA.debugLineNum = 18154134;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
_fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
RDebugUtils.currentLine=18154135;
 //BA.debugLineNum = 18154135;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
_fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
RDebugUtils.currentLine=18154137;
 //BA.debugLineNum = 18154137;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row_Us";
_fila.Put((Object)("codfuncionario"),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=18154138;
 //BA.debugLineNum = 18154138;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Usuar";
_fila.Put((Object)("codvendedor"),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=18154140;
 //BA.debugLineNum = 18154140;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_Doc";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_fila,_fila_id);
RDebugUtils.currentLine=18154142;
 //BA.debugLineNum = 18154142;BA.debugLine="Sb_Cargar_Detalle(True)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18154147;
 //BA.debugLineNum = 18154147;BA.debugLine="End Sub";
return "";
}
public static String  _btn_editar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_editar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_editar_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub Btn_Editar_Click";
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="If	Hay_Descuentos_Globales Then";
if (_hay_descuentos_globales) { 
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE EDITAR LA FILA"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17956877;
 //BA.debugLineNum = 17956877;BA.debugLine="Dim Btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=17956879;
 //BA.debugLineNum = 17956879;BA.debugLine="Id_DocDet = Btn.Tag";
_id_docdet = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=17956880;
 //BA.debugLineNum = 17956880;BA.debugLine="EditandoProducto = True";
_editandoproducto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=17956881;
 //BA.debugLineNum = 17956881;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
mostCurrent._frm_post_01_producto._id_docdet /*int*/  = _id_docdet;
RDebugUtils.currentLine=17956882;
 //BA.debugLineNum = 17956882;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_producto.getObject()));
RDebugUtils.currentLine=17956884;
 //BA.debugLineNum = 17956884;BA.debugLine="End Sub";
return "";
}
public static void  _btn_grabar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_grabar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_grabar_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="Btn_Grabar.Enabled = False";
parent.mostCurrent._btn_grabar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="If Editar_Documento Then";
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
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="Wait For (Sb_Editar_Documento)  Complete (Result";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_grabar_click"), _sb_editar_documento());
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
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="Wait For (Sb_Grabara_Nuevo_Documento) Complete (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_grabar_click"), _sb_grabara_nuevo_documento());
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
RDebugUtils.currentLine=19202058;
 //BA.debugLineNum = 19202058;BA.debugLine="Btn_Grabar.Enabled = True";
parent.mostCurrent._btn_grabar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_editar_documento() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_editar_documento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_editar_documento", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), _sb_grabar_standby());
this.state = 79;
return;
case 79:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe detalle en el documento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=19333134;
 //BA.debugLineNum = 19333134;BA.debugLine="If Result = 4 Then";

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
RDebugUtils.currentLine=19333138;
 //BA.debugLineNum = 19333138;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333139;
 //BA.debugLineNum = 19333139;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence("Documento Stand-By"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19333140;
 //BA.debugLineNum = 19333140;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 80;
return;
case 80:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333141;
 //BA.debugLineNum = 19333141;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=19333144;
 //BA.debugLineNum = 19333144;BA.debugLine="Dim Tido As String = TipoDoc";
_tido = parent._tipodoc;
RDebugUtils.currentLine=19333145;
 //BA.debugLineNum = 19333145;BA.debugLine="Dim Cambiar_NroDocumento As Boolean = False";
_cambiar_nrodocumento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=19333147;
 //BA.debugLineNum = 19333147;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)(_tido));
RDebugUtils.currentLine=19333148;
 //BA.debugLineNum = 19333148;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=19333150;
 //BA.debugLineNum = 19333150;BA.debugLine="If Tido = \"NVV\" Then";
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
RDebugUtils.currentLine=19333152;
 //BA.debugLineNum = 19333152;BA.debugLine="Cambiar_NroDocumento = True";
_cambiar_nrodocumento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=19333154;
 //BA.debugLineNum = 19333154;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), _sb_recorrer_detalle_rev_stock());
this.state = 81;
return;
case 81:
//C
this.state = 13;
_result2 = (Boolean) result[0];
;
RDebugUtils.currentLine=19333162;
 //BA.debugLineNum = 19333162;BA.debugLine="If Result2 = False Then";
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
RDebugUtils.currentLine=19333164;
 //BA.debugLineNum = 19333164;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00015"));
this.state = 82;
return;
case 82:
//C
this.state = 16;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=19333166;
 //BA.debugLineNum = 19333166;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=19333167;
 //BA.debugLineNum = 19333167;BA.debugLine="Return True";
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
RDebugUtils.currentLine=19333174;
 //BA.debugLineNum = 19333174;BA.debugLine="ProgressDialogShow(\"Actualizando el documento...\"";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando el documento..."));
RDebugUtils.currentLine=19333177;
 //BA.debugLineNum = 19333177;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=19333187;
 //BA.debugLineNum = 19333187;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
RDebugUtils.currentLine=19333188;
 //BA.debugLineNum = 19333188;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19333189;
 //BA.debugLineNum = 19333189;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
RDebugUtils.currentLine=19333191;
 //BA.debugLineNum = 19333191;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
RDebugUtils.currentLine=19333192;
 //BA.debugLineNum = 19333192;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19333193;
 //BA.debugLineNum = 19333193;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
RDebugUtils.currentLine=19333195;
 //BA.debugLineNum = 19333195;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
RDebugUtils.currentLine=19333196;
 //BA.debugLineNum = 19333196;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19333197;
 //BA.debugLineNum = 19333197;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
RDebugUtils.currentLine=19333199;
 //BA.debugLineNum = 19333199;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
RDebugUtils.currentLine=19333200;
 //BA.debugLineNum = 19333200;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19333201;
 //BA.debugLineNum = 19333201;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
RDebugUtils.currentLine=19333203;
 //BA.debugLineNum = 19333203;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
RDebugUtils.currentLine=19333204;
 //BA.debugLineNum = 19333204;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19333205;
 //BA.debugLineNum = 19333205;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
RDebugUtils.currentLine=19333207;
 //BA.debugLineNum = 19333207;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
_array_despafacil = _generaarreglo("DespaFacil_Doc");
RDebugUtils.currentLine=19333208;
 //BA.debugLineNum = 19333208;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19333209;
 //BA.debugLineNum = 19333209;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
_despafacil = new anywheresoftware.b4a.objects.collections.Map();
_despafacil = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_despafacil));
RDebugUtils.currentLine=19333211;
 //BA.debugLineNum = 19333211;BA.debugLine="Dim Json_Encabezado As String";
_json_encabezado = "";
RDebugUtils.currentLine=19333212;
 //BA.debugLineNum = 19333212;BA.debugLine="Dim Json_Detalle As String";
_json_detalle = "";
RDebugUtils.currentLine=19333213;
 //BA.debugLineNum = 19333213;BA.debugLine="Dim Json_Descuentos As String";
_json_descuentos = "";
RDebugUtils.currentLine=19333214;
 //BA.debugLineNum = 19333214;BA.debugLine="Dim Json_Obseravciones As String";
_json_obseravciones = "";
RDebugUtils.currentLine=19333215;
 //BA.debugLineNum = 19333215;BA.debugLine="Dim Json_DespaFacil As String";
_json_despafacil = "";
RDebugUtils.currentLine=19333217;
 //BA.debugLineNum = 19333217;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333218;
 //BA.debugLineNum = 19333218;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
RDebugUtils.currentLine=19333219;
 //BA.debugLineNum = 19333219;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
RDebugUtils.currentLine=19333220;
 //BA.debugLineNum = 19333220;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19333221;
 //BA.debugLineNum = 19333221;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
RDebugUtils.currentLine=19333222;
 //BA.debugLineNum = 19333222;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
_json_encabezado = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19333224;
 //BA.debugLineNum = 19333224;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333225;
 //BA.debugLineNum = 19333225;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
RDebugUtils.currentLine=19333226;
 //BA.debugLineNum = 19333226;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
RDebugUtils.currentLine=19333227;
 //BA.debugLineNum = 19333227;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19333228;
 //BA.debugLineNum = 19333228;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
RDebugUtils.currentLine=19333229;
 //BA.debugLineNum = 19333229;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
_json_detalle = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19333231;
 //BA.debugLineNum = 19333231;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333232;
 //BA.debugLineNum = 19333232;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
RDebugUtils.currentLine=19333233;
 //BA.debugLineNum = 19333233;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
RDebugUtils.currentLine=19333234;
 //BA.debugLineNum = 19333234;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19333235;
 //BA.debugLineNum = 19333235;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
RDebugUtils.currentLine=19333236;
 //BA.debugLineNum = 19333236;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
_json_descuentos = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19333238;
 //BA.debugLineNum = 19333238;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333239;
 //BA.debugLineNum = 19333239;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
RDebugUtils.currentLine=19333240;
 //BA.debugLineNum = 19333240;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
RDebugUtils.currentLine=19333241;
 //BA.debugLineNum = 19333241;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19333242;
 //BA.debugLineNum = 19333242;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
RDebugUtils.currentLine=19333243;
 //BA.debugLineNum = 19333243;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
_json_obseravciones = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19333245;
 //BA.debugLineNum = 19333245;BA.debugLine="Dim DespaFaciljs As List";
_despafaciljs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19333246;
 //BA.debugLineNum = 19333246;BA.debugLine="DespaFaciljs.Initialize";
_despafaciljs.Initialize();
RDebugUtils.currentLine=19333247;
 //BA.debugLineNum = 19333247;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
_despafaciljs.Add((Object)(_despafacil.getObject()));
RDebugUtils.currentLine=19333248;
 //BA.debugLineNum = 19333248;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19333249;
 //BA.debugLineNum = 19333249;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
_jsongenerator.Initialize2(_despafaciljs);
RDebugUtils.currentLine=19333250;
 //BA.debugLineNum = 19333250;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
_json_despafacil = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19333252;
 //BA.debugLineNum = 19333252;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
_emailrandom = "EMAILCOMER";
RDebugUtils.currentLine=19333253;
 //BA.debugLineNum = 19333253;BA.debugLine="Dim Para As String";
_para = "";
RDebugUtils.currentLine=19333255;
 //BA.debugLineNum = 19333255;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
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
RDebugUtils.currentLine=19333256;
 //BA.debugLineNum = 19333256;BA.debugLine="Try";
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
RDebugUtils.currentLine=19333257;
 //BA.debugLineNum = 19333257;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
_para = BA.ObjectToString(parent._row_entidad.Get((Object)(_emailrandom)));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=19333259;
 //BA.debugLineNum = 19333259;BA.debugLine="Para = \"\"";
_para = "";
RDebugUtils.currentLine=19333260;
 //BA.debugLineNum = 19333260;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("619333260",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
RDebugUtils.currentLine=19333264;
 //BA.debugLineNum = 19333264;BA.debugLine="Dim OldIdmaeedo As Int = Idmaeedo_Origen";
_oldidmaeedo = parent._idmaeedo_origen;
RDebugUtils.currentLine=19333265;
 //BA.debugLineNum = 19333265;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=19333267;
 //BA.debugLineNum = 19333267;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Edi";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_editardocumentojsonbakapp2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_oldidmaeedo,_codfuncionario,_json_encabezado,_json_detalle,_json_descuentos,_json_obseravciones,_json_despafacil,_cambiar_nrodocumento);
RDebugUtils.currentLine=19333276;
 //BA.debugLineNum = 19333276;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), (Object)(_js));
this.state = 83;
return;
case 83:
//C
this.state = 32;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19333278;
 //BA.debugLineNum = 19333278;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19333280;
 //BA.debugLineNum = 19333280;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19333282;
 //BA.debugLineNum = 19333282;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19333284;
 //BA.debugLineNum = 19333284;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19333286;
 //BA.debugLineNum = 19333286;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=19333288;
 //BA.debugLineNum = 19333288;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
_idmaeedo = (int)(BA.ObjectToNumber(_respuesta.Get((Object)("Idmaeedo"))));
RDebugUtils.currentLine=19333289;
 //BA.debugLineNum = 19333289;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
RDebugUtils.currentLine=19333291;
 //BA.debugLineNum = 19333291;BA.debugLine="If Idmaeedo <> 0 Then";
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
RDebugUtils.currentLine=19333293;
 //BA.debugLineNum = 19333293;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"CodE";
_endo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad")));
RDebugUtils.currentLine=19333294;
 //BA.debugLineNum = 19333294;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"Co";
_suendo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad")));
RDebugUtils.currentLine=19333295;
 //BA.debugLineNum = 19333295;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
_tido = BA.ObjectToString(_respuesta.Get((Object)("Tido")));
RDebugUtils.currentLine=19333296;
 //BA.debugLineNum = 19333296;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
_nudo = BA.ObjectToString(_respuesta.Get((Object)("Nudo")));
RDebugUtils.currentLine=19333297;
 //BA.debugLineNum = 19333297;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
_obseravacion = BA.ObjectToString(parent._fila_observaciones.Get((Object)("Observacion")));
RDebugUtils.currentLine=19333298;
 //BA.debugLineNum = 19333298;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
_nroocc = BA.ObjectToString(parent._fila_observaciones.Get((Object)("NroOCC")));
RDebugUtils.currentLine=19333313;
 //BA.debugLineNum = 19333313;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
RDebugUtils.currentLine=19333316;
 //BA.debugLineNum = 19333316;BA.debugLine="Tab_Post.CurrentTab = 1";
parent.mostCurrent._tab_post.setCurrentTab((int) (1));
RDebugUtils.currentLine=19333317;
 //BA.debugLineNum = 19333317;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=19333318;
 //BA.debugLineNum = 19333318;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=19333319;
 //BA.debugLineNum = 19333319;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=19333320;
 //BA.debugLineNum = 19333320;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
RDebugUtils.currentLine=19333321;
 //BA.debugLineNum = 19333321;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
RDebugUtils.currentLine=19333322;
 //BA.debugLineNum = 19333322;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
RDebugUtils.currentLine=19333323;
 //BA.debugLineNum = 19333323;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19333325;
 //BA.debugLineNum = 19333325;BA.debugLine="Msgbox2Async(\"Documento actualizado correctame";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Documento actualizado correctamente"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Enviar correo o imprimir","","Cerrar",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333326;
 //BA.debugLineNum = 19333326;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 84;
return;
case 84:
//C
this.state = 41;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333328;
 //BA.debugLineNum = 19333328;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=19333329;
 //BA.debugLineNum = 19333329;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=19333330;
 //BA.debugLineNum = 19333330;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=19333334;
 //BA.debugLineNum = 19333334;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-b";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"send-mail-back-printer.png");
RDebugUtils.currentLine=19333335;
 //BA.debugLineNum = 19333335;BA.debugLine="Dim ErrorMailImp As Boolean";
_errormailimp = false;
RDebugUtils.currentLine=19333337;
 //BA.debugLineNum = 19333337;BA.debugLine="Msgbox2Async(\"Elija su opción\", Tido & \"-\" & N";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Elija su opción"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Imprimir","Enviar correo e imprimir","Enviar correo",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333338;
 //BA.debugLineNum = 19333338;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 85;
return;
case 85:
//C
this.state = 45;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333341;
 //BA.debugLineNum = 19333341;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=19333344;
 //BA.debugLineNum = 19333344;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 86;
return;
case 86:
//C
this.state = 48;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19333346;
 //BA.debugLineNum = 19333346;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19333347;
 //BA.debugLineNum = 19333347;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333348;
 //BA.debugLineNum = 19333348;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333349;
 //BA.debugLineNum = 19333349;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 87;
return;
case 87:
//C
this.state = 51;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333350;
 //BA.debugLineNum = 19333350;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
RDebugUtils.currentLine=19333356;
 //BA.debugLineNum = 19333356;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 52:
//if
this.state = 59;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=19333359;
 //BA.debugLineNum = 19333359;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 88;
return;
case 88:
//C
this.state = 55;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19333361;
 //BA.debugLineNum = 19333361;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19333362;
 //BA.debugLineNum = 19333362;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333363;
 //BA.debugLineNum = 19333363;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333364;
 //BA.debugLineNum = 19333364;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 89;
return;
case 89:
//C
this.state = 58;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333365;
 //BA.debugLineNum = 19333365;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;
;
RDebugUtils.currentLine=19333371;
 //BA.debugLineNum = 19333371;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 59:
//if
this.state = 70;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=19333374;
 //BA.debugLineNum = 19333374;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 90;
return;
case 90:
//C
this.state = 62;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19333376;
 //BA.debugLineNum = 19333376;BA.debugLine="Log(Resultado)";
anywheresoftware.b4a.keywords.Common.LogImpl("619333376",_resultado,0);
RDebugUtils.currentLine=19333377;
 //BA.debugLineNum = 19333377;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19333378;
 //BA.debugLineNum = 19333378;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333379;
 //BA.debugLineNum = 19333379;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333380;
 //BA.debugLineNum = 19333380;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 91;
return;
case 91:
//C
this.state = 65;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333381;
 //BA.debugLineNum = 19333381;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=19333385;
 //BA.debugLineNum = 19333385;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 92;
return;
case 92:
//C
this.state = 66;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19333387;
 //BA.debugLineNum = 19333387;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19333388;
 //BA.debugLineNum = 19333388;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333389;
 //BA.debugLineNum = 19333389;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333390;
 //BA.debugLineNum = 19333390;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 93;
return;
case 93:
//C
this.state = 69;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19333391;
 //BA.debugLineNum = 19333391;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
RDebugUtils.currentLine=19333396;
 //BA.debugLineNum = 19333396;BA.debugLine="If ErrorMailImp Then";

case 70:
//if
this.state = 73;
if (_errormailimp) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=19333398;
 //BA.debugLineNum = 19333398;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333399;
 //BA.debugLineNum = 19333399;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"+anywheresoftware.b4a.keywords.Common.CRLF+_tido+"-"+_nudo),BA.ObjectToCharSequence("Información"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19333401;
 //BA.debugLineNum = 19333401;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
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
RDebugUtils.currentLine=19333407;
 //BA.debugLineNum = 19333407;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=19333411;
 //BA.debugLineNum = 19333411;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19333413;
 //BA.debugLineNum = 19333413;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error al grabar"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19333414;
 //BA.debugLineNum = 19333414;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
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
RDebugUtils.currentLine=19333420;
 //BA.debugLineNum = 19333420;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19333422;
 //BA.debugLineNum = 19333422;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=19333424;
 //BA.debugLineNum = 19333424;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_grabara_nuevo_documento() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_grabara_nuevo_documento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_grabara_nuevo_documento", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), _sb_grabar_standby());
this.state = 90;
return;
case 90:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19267594;
 //BA.debugLineNum = 19267594;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe detalle en el documento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19267595;
 //BA.debugLineNum = 19267595;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=19267598;
 //BA.debugLineNum = 19267598;BA.debugLine="If Result = 4 Then";

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
RDebugUtils.currentLine=19267602;
 //BA.debugLineNum = 19267602;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19267603;
 //BA.debugLineNum = 19267603;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence("Documento Stand-By"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267604;
 //BA.debugLineNum = 19267604;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 91;
return;
case 91:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267605;
 //BA.debugLineNum = 19267605;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=19267608;
 //BA.debugLineNum = 19267608;BA.debugLine="If Crear_NVV_Desde_COV Then";

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
RDebugUtils.currentLine=19267609;
 //BA.debugLineNum = 19267609;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=19267612;
 //BA.debugLineNum = 19267612;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"save.png");
RDebugUtils.currentLine=19267613;
 //BA.debugLineNum = 19267613;BA.debugLine="Msgbox2Async(\"Seleccione documento a grabar\", \"G";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Seleccione documento a grabar"),BA.ObjectToCharSequence("Grabar documento"),"NVV (Nota de venta)","Cancelar","COV (Cotización)",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267614;
 //BA.debugLineNum = 19267614;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 92;
return;
case 92:
//C
this.state = 14;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267616;
 //BA.debugLineNum = 19267616;BA.debugLine="Dim Tido As String = \"\"";
_tido = "";
RDebugUtils.currentLine=19267618;
 //BA.debugLineNum = 19267618;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=19267619;
 //BA.debugLineNum = 19267619;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;
;
RDebugUtils.currentLine=19267622;
 //BA.debugLineNum = 19267622;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 17:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=19267623;
 //BA.debugLineNum = 19267623;BA.debugLine="Tido = \"COV\"";
_tido = "COV";
 if (true) break;
;
RDebugUtils.currentLine=19267626;
 //BA.debugLineNum = 19267626;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 20:
//if
this.state = 23;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=19267627;
 //BA.debugLineNum = 19267627;BA.debugLine="Return True";
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
RDebugUtils.currentLine=19267631;
 //BA.debugLineNum = 19267631;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)(_tido));
RDebugUtils.currentLine=19267632;
 //BA.debugLineNum = 19267632;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=19267634;
 //BA.debugLineNum = 19267634;BA.debugLine="If Tido = \"NVV\" Then";
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
RDebugUtils.currentLine=19267636;
 //BA.debugLineNum = 19267636;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), _sb_recorrer_detalle_rev_stock());
this.state = 93;
return;
case 93:
//C
this.state = 28;
_result2 = (Boolean) result[0];
;
RDebugUtils.currentLine=19267644;
 //BA.debugLineNum = 19267644;BA.debugLine="If Result2 = False Then";
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
RDebugUtils.currentLine=19267646;
 //BA.debugLineNum = 19267646;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00015"));
this.state = 94;
return;
case 94:
//C
this.state = 31;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=19267648;
 //BA.debugLineNum = 19267648;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=19267649;
 //BA.debugLineNum = 19267649;BA.debugLine="Return True";
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
RDebugUtils.currentLine=19267656;
 //BA.debugLineNum = 19267656;BA.debugLine="ProgressDialogShow(\"Creando documento...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Creando documento..."));
RDebugUtils.currentLine=19267659;
 //BA.debugLineNum = 19267659;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=19267669;
 //BA.debugLineNum = 19267669;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
RDebugUtils.currentLine=19267670;
 //BA.debugLineNum = 19267670;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19267671;
 //BA.debugLineNum = 19267671;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
RDebugUtils.currentLine=19267673;
 //BA.debugLineNum = 19267673;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
RDebugUtils.currentLine=19267674;
 //BA.debugLineNum = 19267674;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19267675;
 //BA.debugLineNum = 19267675;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
RDebugUtils.currentLine=19267677;
 //BA.debugLineNum = 19267677;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
RDebugUtils.currentLine=19267678;
 //BA.debugLineNum = 19267678;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19267679;
 //BA.debugLineNum = 19267679;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
RDebugUtils.currentLine=19267681;
 //BA.debugLineNum = 19267681;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
RDebugUtils.currentLine=19267682;
 //BA.debugLineNum = 19267682;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19267683;
 //BA.debugLineNum = 19267683;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
RDebugUtils.currentLine=19267685;
 //BA.debugLineNum = 19267685;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
RDebugUtils.currentLine=19267686;
 //BA.debugLineNum = 19267686;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19267687;
 //BA.debugLineNum = 19267687;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
RDebugUtils.currentLine=19267689;
 //BA.debugLineNum = 19267689;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
_array_despafacil = _generaarreglo("DespaFacil_Doc");
RDebugUtils.currentLine=19267690;
 //BA.debugLineNum = 19267690;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19267691;
 //BA.debugLineNum = 19267691;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
_despafacil = new anywheresoftware.b4a.objects.collections.Map();
_despafacil = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_despafacil));
RDebugUtils.currentLine=19267693;
 //BA.debugLineNum = 19267693;BA.debugLine="Dim Json_Encabezado As String";
_json_encabezado = "";
RDebugUtils.currentLine=19267694;
 //BA.debugLineNum = 19267694;BA.debugLine="Dim Json_Detalle As String";
_json_detalle = "";
RDebugUtils.currentLine=19267695;
 //BA.debugLineNum = 19267695;BA.debugLine="Dim Json_Descuentos As String";
_json_descuentos = "";
RDebugUtils.currentLine=19267696;
 //BA.debugLineNum = 19267696;BA.debugLine="Dim Json_Obseravciones As String";
_json_obseravciones = "";
RDebugUtils.currentLine=19267697;
 //BA.debugLineNum = 19267697;BA.debugLine="Dim Json_DespaFacil As String";
_json_despafacil = "";
RDebugUtils.currentLine=19267699;
 //BA.debugLineNum = 19267699;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19267700;
 //BA.debugLineNum = 19267700;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
RDebugUtils.currentLine=19267701;
 //BA.debugLineNum = 19267701;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
RDebugUtils.currentLine=19267702;
 //BA.debugLineNum = 19267702;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19267703;
 //BA.debugLineNum = 19267703;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
RDebugUtils.currentLine=19267704;
 //BA.debugLineNum = 19267704;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
_json_encabezado = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19267706;
 //BA.debugLineNum = 19267706;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19267707;
 //BA.debugLineNum = 19267707;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
RDebugUtils.currentLine=19267708;
 //BA.debugLineNum = 19267708;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
RDebugUtils.currentLine=19267709;
 //BA.debugLineNum = 19267709;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19267710;
 //BA.debugLineNum = 19267710;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
RDebugUtils.currentLine=19267711;
 //BA.debugLineNum = 19267711;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
_json_detalle = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19267713;
 //BA.debugLineNum = 19267713;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19267714;
 //BA.debugLineNum = 19267714;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
RDebugUtils.currentLine=19267715;
 //BA.debugLineNum = 19267715;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
RDebugUtils.currentLine=19267716;
 //BA.debugLineNum = 19267716;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19267717;
 //BA.debugLineNum = 19267717;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
RDebugUtils.currentLine=19267718;
 //BA.debugLineNum = 19267718;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
_json_descuentos = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19267720;
 //BA.debugLineNum = 19267720;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19267721;
 //BA.debugLineNum = 19267721;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
RDebugUtils.currentLine=19267722;
 //BA.debugLineNum = 19267722;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
RDebugUtils.currentLine=19267723;
 //BA.debugLineNum = 19267723;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19267724;
 //BA.debugLineNum = 19267724;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
RDebugUtils.currentLine=19267725;
 //BA.debugLineNum = 19267725;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
_json_obseravciones = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19267727;
 //BA.debugLineNum = 19267727;BA.debugLine="Dim DespaFaciljs As List";
_despafaciljs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19267728;
 //BA.debugLineNum = 19267728;BA.debugLine="DespaFaciljs.Initialize";
_despafaciljs.Initialize();
RDebugUtils.currentLine=19267729;
 //BA.debugLineNum = 19267729;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
_despafaciljs.Add((Object)(_despafacil.getObject()));
RDebugUtils.currentLine=19267730;
 //BA.debugLineNum = 19267730;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19267731;
 //BA.debugLineNum = 19267731;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
_jsongenerator.Initialize2(_despafaciljs);
RDebugUtils.currentLine=19267732;
 //BA.debugLineNum = 19267732;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
_json_despafacil = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19267734;
 //BA.debugLineNum = 19267734;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
_emailrandom = "EMAILCOMER";
RDebugUtils.currentLine=19267735;
 //BA.debugLineNum = 19267735;BA.debugLine="Dim Para As String";
_para = "";
RDebugUtils.currentLine=19267737;
 //BA.debugLineNum = 19267737;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
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
RDebugUtils.currentLine=19267738;
 //BA.debugLineNum = 19267738;BA.debugLine="Try";
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
RDebugUtils.currentLine=19267739;
 //BA.debugLineNum = 19267739;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
_para = BA.ObjectToString(parent._row_entidad.Get((Object)(_emailrandom)));
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=19267741;
 //BA.debugLineNum = 19267741;BA.debugLine="Para = \"\"";
_para = "";
RDebugUtils.currentLine=19267742;
 //BA.debugLineNum = 19267742;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267742",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
RDebugUtils.currentLine=19267746;
 //BA.debugLineNum = 19267746;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Cre";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_creadocumentojsonbakapp2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json_encabezado,_json_detalle,_json_descuentos,_json_obseravciones,_json_despafacil);
RDebugUtils.currentLine=19267747;
 //BA.debugLineNum = 19267747;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), (Object)(_js));
this.state = 95;
return;
case 95:
//C
this.state = 47;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19267749;
 //BA.debugLineNum = 19267749;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19267751;
 //BA.debugLineNum = 19267751;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19267753;
 //BA.debugLineNum = 19267753;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19267755;
 //BA.debugLineNum = 19267755;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19267757;
 //BA.debugLineNum = 19267757;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=19267759;
 //BA.debugLineNum = 19267759;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
_idmaeedo = (int)(BA.ObjectToNumber(_respuesta.Get((Object)("Idmaeedo"))));
RDebugUtils.currentLine=19267760;
 //BA.debugLineNum = 19267760;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
RDebugUtils.currentLine=19267762;
 //BA.debugLineNum = 19267762;BA.debugLine="If Idmaeedo <> 0 Then";
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
RDebugUtils.currentLine=19267764;
 //BA.debugLineNum = 19267764;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"code";
_endo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("codentidad")));
RDebugUtils.currentLine=19267765;
 //BA.debugLineNum = 19267765;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"co";
_suendo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("codsucentidad")));
RDebugUtils.currentLine=19267766;
 //BA.debugLineNum = 19267766;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
_tido = BA.ObjectToString(_respuesta.Get((Object)("Tido")));
RDebugUtils.currentLine=19267767;
 //BA.debugLineNum = 19267767;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
_nudo = BA.ObjectToString(_respuesta.Get((Object)("Nudo")));
RDebugUtils.currentLine=19267768;
 //BA.debugLineNum = 19267768;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
_obseravacion = BA.ObjectToString(parent._fila_observaciones.Get((Object)("observacion")));
RDebugUtils.currentLine=19267769;
 //BA.debugLineNum = 19267769;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
_nroocc = BA.ObjectToString(parent._fila_observaciones.Get((Object)("nroocc")));
RDebugUtils.currentLine=19267787;
 //BA.debugLineNum = 19267787;BA.debugLine="Tab_Post.CurrentTab = 1";
parent.mostCurrent._tab_post.setCurrentTab((int) (1));
RDebugUtils.currentLine=19267788;
 //BA.debugLineNum = 19267788;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=19267789;
 //BA.debugLineNum = 19267789;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=19267790;
 //BA.debugLineNum = 19267790;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=19267791;
 //BA.debugLineNum = 19267791;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
RDebugUtils.currentLine=19267792;
 //BA.debugLineNum = 19267792;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
RDebugUtils.currentLine=19267793;
 //BA.debugLineNum = 19267793;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
RDebugUtils.currentLine=19267794;
 //BA.debugLineNum = 19267794;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267796;
 //BA.debugLineNum = 19267796;BA.debugLine="Dim ErrorMailImp As Boolean";
_errormailimp = false;
RDebugUtils.currentLine=19267797;
 //BA.debugLineNum = 19267797;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
RDebugUtils.currentLine=19267799;
 //BA.debugLineNum = 19267799;BA.debugLine="Msgbox2Async(\"Documento guardado correctamente";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Documento guardado correctamente"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Imprimir","Enviar correo e imprimir","Enviar correo",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267800;
 //BA.debugLineNum = 19267800;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 96;
return;
case 96:
//C
this.state = 56;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267802;
 //BA.debugLineNum = 19267802;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"warning.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"warning.png");
RDebugUtils.currentLine=19267805;
 //BA.debugLineNum = 19267805;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=19267808;
 //BA.debugLineNum = 19267808;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 97;
return;
case 97:
//C
this.state = 59;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19267810;
 //BA.debugLineNum = 19267810;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19267811;
 //BA.debugLineNum = 19267811;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267812;
 //BA.debugLineNum = 19267812;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 98;
return;
case 98:
//C
this.state = 62;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267813;
 //BA.debugLineNum = 19267813;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;
;
RDebugUtils.currentLine=19267819;
 //BA.debugLineNum = 19267819;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 63:
//if
this.state = 70;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=19267821;
 //BA.debugLineNum = 19267821;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 99;
return;
case 99:
//C
this.state = 66;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19267823;
 //BA.debugLineNum = 19267823;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19267824;
 //BA.debugLineNum = 19267824;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267825;
 //BA.debugLineNum = 19267825;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 100;
return;
case 100:
//C
this.state = 69;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267826;
 //BA.debugLineNum = 19267826;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
RDebugUtils.currentLine=19267832;
 //BA.debugLineNum = 19267832;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 70:
//if
this.state = 81;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=19267834;
 //BA.debugLineNum = 19267834;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 101;
return;
case 101:
//C
this.state = 73;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19267836;
 //BA.debugLineNum = 19267836;BA.debugLine="Log(Resultado)";
anywheresoftware.b4a.keywords.Common.LogImpl("619267836",_resultado,0);
RDebugUtils.currentLine=19267837;
 //BA.debugLineNum = 19267837;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19267838;
 //BA.debugLineNum = 19267838;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267839;
 //BA.debugLineNum = 19267839;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 102;
return;
case 102:
//C
this.state = 76;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267840;
 //BA.debugLineNum = 19267840;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=19267843;
 //BA.debugLineNum = 19267843;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 103;
return;
case 103:
//C
this.state = 77;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19267845;
 //BA.debugLineNum = 19267845;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=19267847;
 //BA.debugLineNum = 19267847;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267848;
 //BA.debugLineNum = 19267848;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 104;
return;
case 104:
//C
this.state = 80;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19267849;
 //BA.debugLineNum = 19267849;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;
;
RDebugUtils.currentLine=19267854;
 //BA.debugLineNum = 19267854;BA.debugLine="If ErrorMailImp Then";

case 81:
//if
this.state = 84;
if (_errormailimp) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=19267857;
 //BA.debugLineNum = 19267857;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"+anywheresoftware.b4a.keywords.Common.CRLF+_tido+"-"+_nudo),BA.ObjectToCharSequence("Información"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19267860;
 //BA.debugLineNum = 19267860;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
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
RDebugUtils.currentLine=19267864;
 //BA.debugLineNum = 19267864;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=19267868;
 //BA.debugLineNum = 19267868;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error al grabar"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=19267869;
 //BA.debugLineNum = 19267869;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
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
RDebugUtils.currentLine=19267877;
 //BA.debugLineNum = 19267877;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=19267879;
 //BA.debugLineNum = 19267879;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=19267881;
 //BA.debugLineNum = 19267881;BA.debugLine="End Sub";
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
public static void  _btn_limpiar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_limpiar_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_limpiar_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="Msgbox2Async(\"¿Estas seguro de querer limpiar est";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de querer limpiar este documento?"),BA.ObjectToCharSequence("L I M P I A R"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_limpiar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18677773;
 //BA.debugLineNum = 18677773;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18677774;
 //BA.debugLineNum = 18677774;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
RDebugUtils.currentLine=18677775;
 //BA.debugLineNum = 18677775;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
RDebugUtils.currentLine=18677776;
 //BA.debugLineNum = 18677776;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
RDebugUtils.currentLine=18677777;
 //BA.debugLineNum = 18677777;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=18677780;
 //BA.debugLineNum = 18677780;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_limpiar_codigo_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_limpiar_codigo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_limpiar_codigo_click", null));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub Btn_Limpiar_Codigo_Click";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Txt_Codigo.Text = \"\"";
mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="Txt_Codigo.SelectAll";
mostCurrent._txt_codigo.SelectAll();
RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="End Sub";
return "";
}
public static void  _btn_limpiar_longclick() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_limpiar_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_limpiar_longclick", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(\"\")) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_limpiar_longclick"), _sb_ingresar_correo_validar(""));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="Msgbox2Async(Resultado,\"Respuesta correo\", \"Ok\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Respuesta correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_limpiar_longclick"), null);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_ingresar_correo_validar(String _para) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_ingresar_correo_validar", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_ingresar_correo_validar", new Object[] {_para}));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese correo del cliente"));
RDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="InputTemplate.Text = Para";
parent.mostCurrent._inputtemplate._text /*String*/  = _para;
RDebugUtils.currentLine=19398670;
 //BA.debugLineNum = 19398670;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="Try";
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
RDebugUtils.currentLine=19398673;
 //BA.debugLineNum = 19398673;BA.debugLine="Para = InputTemplate.Text.Trim";
_para = parent.mostCurrent._inputtemplate._text /*String*/ .trim();
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=19398675;
 //BA.debugLineNum = 19398675;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("619398675",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=19398676;
 //BA.debugLineNum = 19398676;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19398677;
 //BA.debugLineNum = 19398677;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19398678;
 //BA.debugLineNum = 19398678;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), null);
this.state = 20;
return;
case 20:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19398679;
 //BA.debugLineNum = 19398679;BA.debugLine="Para = \"Error\"";
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
RDebugUtils.currentLine=19398682;
 //BA.debugLineNum = 19398682;BA.debugLine="Para = \"Cancelar\"";
_para = "Cancelar";
 if (true) break;
;
RDebugUtils.currentLine=19398685;
 //BA.debugLineNum = 19398685;BA.debugLine="If Para = \"Cancelar\" Then";

case 12:
//if
this.state = 15;
if ((_para).equals("Cancelar")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=19398686;
 //BA.debugLineNum = 19398686;BA.debugLine="Return Para";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_para));return;};
 if (true) break;
;
RDebugUtils.currentLine=19398689;
 //BA.debugLineNum = 19398689;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";

case 15:
//if
this.state = 18;
if (parent.mostCurrent._funciones._fx_isemail /*boolean*/ (mostCurrent.activityBA,_para)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=19398691;
 //BA.debugLineNum = 19398691;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=19398692;
 //BA.debugLineNum = 19398692;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19398693;
 //BA.debugLineNum = 19398693;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), null);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19398695;
 //BA.debugLineNum = 19398695;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Para)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), _sb_ingresar_correo_validar(_para));
this.state = 22;
return;
case 22:
//C
this.state = 18;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=19398697;
 //BA.debugLineNum = 19398697;BA.debugLine="Para = Resultado";
_para = _resultado;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=19398701;
 //BA.debugLineNum = 19398701;BA.debugLine="Return Para";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_para));return;};
RDebugUtils.currentLine=19398703;
 //BA.debugLineNum = 19398703;BA.debugLine="End Sub";
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
public static void  _btn_tipodespachosimple_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_tipodespachosimple_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_tipodespachosimple_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_Tipo, \"\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._despsimple_tipo),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20447245;
 //BA.debugLineNum = 20447245;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20447247;
 //BA.debugLineNum = 20447247;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
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
RDebugUtils.currentLine=20447249;
 //BA.debugLineNum = 20447249;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
RDebugUtils.currentLine=20447250;
 //BA.debugLineNum = 20447250;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=20447252;
 //BA.debugLineNum = 20447252;BA.debugLine="If DespSimple_Tipo.SelectedItem.Trim = NombreT";
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
RDebugUtils.currentLine=20447254;
 //BA.debugLineNum = 20447254;BA.debugLine="Dim Emp As String = Fila.Get(\"Emp\")";
_emp = BA.ObjectToString(_fila.Get((Object)("Emp")));
RDebugUtils.currentLine=20447255;
 //BA.debugLineNum = 20447255;BA.debugLine="Dim Suc As String = Fila.Get(\"Suc\")";
_suc = BA.ObjectToString(_fila.Get((Object)("Suc")));
RDebugUtils.currentLine=20447256;
 //BA.debugLineNum = 20447256;BA.debugLine="Dim Bod As String = Fila.Get(\"Bod\")";
_bod = BA.ObjectToString(_fila.Get((Object)("Bod")));
RDebugUtils.currentLine=20447258;
 //BA.debugLineNum = 20447258;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=20447259;
 //BA.debugLineNum = 20447259;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20447261;
 //BA.debugLineNum = 20447261;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=20447263;
 //BA.debugLineNum = 20447263;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Bo";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Bodega From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=20447265;
 //BA.debugLineNum = 20447265;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=20447266;
 //BA.debugLineNum = 20447266;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=20447267;
 //BA.debugLineNum = 20447267;BA.debugLine="For Row = 0 To RowNumber - 1";
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
RDebugUtils.currentLine=20447268;
 //BA.debugLineNum = 20447268;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=20447269;
 //BA.debugLineNum = 20447269;BA.debugLine="If Cursor1.GetString(\"Bodega\").Trim <> Bod.";
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
RDebugUtils.currentLine=20447270;
 //BA.debugLineNum = 20447270;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=20447271;
 //BA.debugLineNum = 20447271;BA.debugLine="Msgbox2Async(\"No se puede cambiar el tipo";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede cambiar el tipo de despacho, ya que es de otra sucursal y hay productos en el listado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20447273;
 //BA.debugLineNum = 20447273;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), null);
this.state = 34;
return;
case 34:
//C
this.state = 22;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=20447274;
 //BA.debugLineNum = 20447274;BA.debugLine="Return";
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
RDebugUtils.currentLine=20447278;
 //BA.debugLineNum = 20447278;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=20447280;
 //BA.debugLineNum = 20447280;BA.debugLine="Fila_Encabezado.Put(\"Empresa\".ToLowerCase,Emp";
parent._fila_encabezado.Put((Object)("Empresa".toLowerCase()),(Object)(_emp));
RDebugUtils.currentLine=20447281;
 //BA.debugLineNum = 20447281;BA.debugLine="Fila_Encabezado.Put(\"Sucursal\".ToLowerCase,Su";
parent._fila_encabezado.Put((Object)("Sucursal".toLowerCase()),(Object)(_suc));
RDebugUtils.currentLine=20447282;
 //BA.debugLineNum = 20447282;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabez";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=20447284;
 //BA.debugLineNum = 20447284;BA.debugLine="Variables.Gl_Empresa = Emp";
parent.mostCurrent._variables._gl_empresa /*String*/  = _emp;
RDebugUtils.currentLine=20447285;
 //BA.debugLineNum = 20447285;BA.debugLine="Variables.Gl_Sucursal = Suc";
parent.mostCurrent._variables._gl_sucursal /*String*/  = _suc;
RDebugUtils.currentLine=20447286;
 //BA.debugLineNum = 20447286;BA.debugLine="Variables.Gl_Bodega = Bod";
parent.mostCurrent._variables._gl_bodega /*String*/  = _bod;
RDebugUtils.currentLine=20447288;
 //BA.debugLineNum = 20447288;BA.debugLine="Lbl_TipoDespacho.Tag = CodigoTabla";
parent.mostCurrent._lbl_tipodespacho.setTag((Object)(_codigotabla));
RDebugUtils.currentLine=20447289;
 //BA.debugLineNum = 20447289;BA.debugLine="Lbl_TipoDespacho.Text = NombreTabla";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(_nombretabla));
RDebugUtils.currentLine=20447291;
 //BA.debugLineNum = 20447291;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _sb_titulo());
this.state = 35;
return;
case 35:
//C
this.state = 25;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=20447292;
 //BA.debugLineNum = 20447292;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) com";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _sb_visibleocultardespachosimple());
this.state = 36;
return;
case 36:
//C
this.state = 25;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=20447294;
 //BA.debugLineNum = 20447294;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=20447296;
 //BA.debugLineNum = 20447296;BA.debugLine="ToastMessageShow(\"SUCURSAL: \" & Suc, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("SUCURSAL: "+_suc),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20447298;
 //BA.debugLineNum = 20447298;BA.debugLine="Exit";
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
RDebugUtils.currentLine=20447308;
 //BA.debugLineNum = 20447308;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_visibleocultardespachosimple() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_visibleocultardespachosimple", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_visibleocultardespachosimple", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="If B4A_DespachoSimple = False Then";
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
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="Dim EnbDesp As Boolean";
_enbdesp = false;
RDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="If Lbl_TipoDespacho.Text.Contains(\"DESPACHO\") The";
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
RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="EnbDesp = True";
_enbdesp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=20643852;
 //BA.debugLineNum = 20643852;BA.debugLine="EnbDesp = False";
_enbdesp = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=20643855;
 //BA.debugLineNum = 20643855;BA.debugLine="Txt_DireccionDesp.Visible = EnbDesp";
parent.mostCurrent._txt_direcciondesp.setVisible(_enbdesp);
RDebugUtils.currentLine=20643856;
 //BA.debugLineNum = 20643856;BA.debugLine="Txt_ObservacionesDesp.Visible = EnbDesp";
parent.mostCurrent._txt_observacionesdesp.setVisible(_enbdesp);
RDebugUtils.currentLine=20643857;
 //BA.debugLineNum = 20643857;BA.debugLine="Txt_TransporteDesp.Visible = EnbDesp";
parent.mostCurrent._txt_transportedesp.setVisible(_enbdesp);
RDebugUtils.currentLine=20643859;
 //BA.debugLineNum = 20643859;BA.debugLine="Lbl_DireccionDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_direcciondesp.setVisible(_enbdesp);
RDebugUtils.currentLine=20643860;
 //BA.debugLineNum = 20643860;BA.debugLine="Lbl_TransporteDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_transportedesp.setVisible(_enbdesp);
RDebugUtils.currentLine=20643861;
 //BA.debugLineNum = 20643861;BA.debugLine="Lbl_ObservacionesDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_observacionesdesp.setVisible(_enbdesp);
RDebugUtils.currentLine=20643862;
 //BA.debugLineNum = 20643862;BA.debugLine="Lbl_Observaciones.Visible = EnbDesp";
parent.mostCurrent._lbl_observaciones.setVisible(_enbdesp);
RDebugUtils.currentLine=20643863;
 //BA.debugLineNum = 20643863;BA.debugLine="Txt_Observaciones.Visible = Not(EnbDesp)";
parent.mostCurrent._txt_observaciones.setVisible(anywheresoftware.b4a.keywords.Common.Not(_enbdesp));
RDebugUtils.currentLine=20643865;
 //BA.debugLineNum = 20643865;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=20643867;
 //BA.debugLineNum = 20643867;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btn_tipopagodesp_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_tipopagodesp_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_tipopagodesp_click", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=20512775;
 //BA.debugLineNum = 20512775;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=20512776;
 //BA.debugLineNum = 20512776;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
RDebugUtils.currentLine=20512778;
 //BA.debugLineNum = 20512778;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_TipoPago";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipopagodesp_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._despsimple_tipopago),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20512781;
 //BA.debugLineNum = 20512781;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20512783;
 //BA.debugLineNum = 20512783;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
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
RDebugUtils.currentLine=20512785;
 //BA.debugLineNum = 20512785;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
RDebugUtils.currentLine=20512786;
 //BA.debugLineNum = 20512786;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=20512788;
 //BA.debugLineNum = 20512788;BA.debugLine="If DespSimple_TipoPago.SelectedItem.Trim = Nom";
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
RDebugUtils.currentLine=20512789;
 //BA.debugLineNum = 20512789;BA.debugLine="Lbl_TipoPagoDesp.Tag = CodigoTabla";
parent.mostCurrent._lbl_tipopagodesp.setTag((Object)(_codigotabla));
RDebugUtils.currentLine=20512790;
 //BA.debugLineNum = 20512790;BA.debugLine="Lbl_TipoPagoDesp.Text = NombreTabla";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(_nombretabla));
RDebugUtils.currentLine=20512791;
 //BA.debugLineNum = 20512791;BA.debugLine="Exit";
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
RDebugUtils.currentLine=20512800;
 //BA.debugLineNum = 20512800;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_validar_descuentos_globales() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fx_validar_descuentos_globales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "fx_validar_descuentos_globales", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim Contador As Int";
_contador = 0;
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Dim Contador_Item As Int";
_contador_item = 0;
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="Dim TotalNetoDoc As Double = Funciones.Fx_NuloPor";
_totalnetodoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_neto.getTag(),0)));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="Dim TotalIvaDoc As Double = Funciones.Fx_NuloPorN";
_totalivadoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_iva.getTag(),0)));
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="Dim TotalIlaDoc As Double = Funciones.Fx_NuloPorN";
_totaliladoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_impuestos.getTag(),0)));
RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="Dim TotalBrutoDoc As Double = Funciones.Fx_NuloPo";
_totalbrutodoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_bruto.getTag(),0)));
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="Dim TotalNetoSDscto As Double = 0";
_totalnetosdscto = 0;
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="Dim TotalDsctoGlobal As Double = 0";
_totaldsctoglobal = 0;
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="Dim DsctoPorcGlobal As Double = 0";
_dsctoporcglobal = 0;
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="Dim Afecta_Precio_Real As Boolean";
_afecta_precio_real = false;
RDebugUtils.currentLine=20119568;
 //BA.debugLineNum = 20119568;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=20119569;
 //BA.debugLineNum = 20119569;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=20119571;
 //BA.debugLineNum = 20119571;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20119573;
 //BA.debugLineNum = 20119573;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
RDebugUtils.currentLine=20119575;
 //BA.debugLineNum = 20119575;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=20119577;
 //BA.debugLineNum = 20119577;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
RDebugUtils.currentLine=20119578;
 //BA.debugLineNum = 20119578;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
_precio = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Precio")),0)));
RDebugUtils.currentLine=20119579;
 //BA.debugLineNum = 20119579;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
_valnetolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("ValNetoLinea")),0)));
RDebugUtils.currentLine=20119580;
 //BA.debugLineNum = 20119580;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
RDebugUtils.currentLine=20119582;
 //BA.debugLineNum = 20119582;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
RDebugUtils.currentLine=20119583;
 //BA.debugLineNum = 20119583;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=20119584;
 //BA.debugLineNum = 20119584;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
RDebugUtils.currentLine=20119586;
 //BA.debugLineNum = 20119586;BA.debugLine="Dim Id_Oferta As Int '= Detalle.GetString(\"Id_Of";
_id_oferta = 0;
RDebugUtils.currentLine=20119587;
 //BA.debugLineNum = 20119587;BA.debugLine="Dim Oferta As String '= Detalle.GetString(\"Ofert";
_oferta = "";
RDebugUtils.currentLine=20119589;
 //BA.debugLineNum = 20119589;BA.debugLine="Dim Padre_Oferta As Int '= Detalle.GetString(\"Pa";
_padre_oferta = 0;
RDebugUtils.currentLine=20119590;
 //BA.debugLineNum = 20119590;BA.debugLine="Dim Aplica_Oferta As Boolean '= Detalle.GetStrin";
_aplica_oferta = false;
RDebugUtils.currentLine=20119592;
 //BA.debugLineNum = 20119592;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(D";
_valvtadescmax = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("ValVtaDescMax"));
RDebugUtils.currentLine=20119594;
 //BA.debugLineNum = 20119594;BA.debugLine="If Tict <> \"D\" Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_tict).equals("D") == false) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=20119604;
 //BA.debugLineNum = 20119604;BA.debugLine="Else If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
this.state = 12;
}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=20119597;
 //BA.debugLineNum = 20119597;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Deta";
_totalnetosdscto = _totalnetosdscto+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (2));
RDebugUtils.currentLine=20119600;
 //BA.debugLineNum = 20119600;BA.debugLine="If Prct = False Then";
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
RDebugUtils.currentLine=20119601;
 //BA.debugLineNum = 20119601;BA.debugLine="Contador_Item = Contador_Item + 1";
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
RDebugUtils.currentLine=20119606;
 //BA.debugLineNum = 20119606;BA.debugLine="If Aplica_Oferta Then";
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
RDebugUtils.currentLine=20119608;
 //BA.debugLineNum = 20119608;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Det";
_totalnetosdscto = _totalnetosdscto+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (2));
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=20119617;
 //BA.debugLineNum = 20119617;BA.debugLine="Afecta_Precio_Real = True'_RowConcepto.Item(\"R";
_afecta_precio_real = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=20119620;
 //BA.debugLineNum = 20119620;BA.debugLine="TotalDsctoGlobal = TotalDsctoGlobal + Round2(D";
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
RDebugUtils.currentLine=20119629;
 //BA.debugLineNum = 20119629;BA.debugLine="Dim Var_DsctoGlobal As Double";
_var_dsctoglobal = 0;
RDebugUtils.currentLine=20119630;
 //BA.debugLineNum = 20119630;BA.debugLine="Dim Dscto_Parcilizado As Double";
_dscto_parcilizado = 0;
RDebugUtils.currentLine=20119632;
 //BA.debugLineNum = 20119632;BA.debugLine="If TotalDsctoGlobal > 0 Then";
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
RDebugUtils.currentLine=20119633;
 //BA.debugLineNum = 20119633;BA.debugLine="DsctoPorcGlobal = 0";
_dsctoporcglobal = 0;
RDebugUtils.currentLine=20119634;
 //BA.debugLineNum = 20119634;BA.debugLine="DsctoPorcGlobal = TotalDsctoGlobal / TotalNetoSD";
_dsctoporcglobal = _totaldsctoglobal/(double)_totalnetosdscto;
RDebugUtils.currentLine=20119635;
 //BA.debugLineNum = 20119635;BA.debugLine="Var_DsctoGlobal = Round2(DsctoPorcGlobal, 3)";
_var_dsctoglobal = anywheresoftware.b4a.keywords.Common.Round2(_dsctoporcglobal,(int) (3));
RDebugUtils.currentLine=20119636;
 //BA.debugLineNum = 20119636;BA.debugLine="DsctoPorcGlobal = Round2(100 * DsctoPorcGlobal,";
_dsctoporcglobal = anywheresoftware.b4a.keywords.Common.Round2(100*_dsctoporcglobal,(int) (2));
RDebugUtils.currentLine=20119637;
 //BA.debugLineNum = 20119637;BA.debugLine="Dscto_Parcilizado = TotalDsctoGlobal / Contador_";
_dscto_parcilizado = _totaldsctoglobal/(double)_contador_item;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=20119640;
 //BA.debugLineNum = 20119640;BA.debugLine="Dim Tiene_Dscto_Superado_Autorizado As Boolean";
_tiene_dscto_superado_autorizado = false;
RDebugUtils.currentLine=20119641;
 //BA.debugLineNum = 20119641;BA.debugLine="Dim CodFuncionario_Autoriza As String";
_codfuncionario_autoriza = "";
RDebugUtils.currentLine=20119643;
 //BA.debugLineNum = 20119643;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=20119645;
 //BA.debugLineNum = 20119645;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
parent._id_docdet = (int)(Double.parseDouble(_detalle.GetString("Id_DocDet")));
RDebugUtils.currentLine=20119646;
 //BA.debugLineNum = 20119646;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
RDebugUtils.currentLine=20119648;
 //BA.debugLineNum = 20119648;BA.debugLine="If Codigo = \"\" Then Exit";
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
RDebugUtils.currentLine=20119650;
 //BA.debugLineNum = 20119650;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
RDebugUtils.currentLine=20119651;
 //BA.debugLineNum = 20119651;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=20119653;
 //BA.debugLineNum = 20119653;BA.debugLine="Dim ImportanciaPorc As Double";
_importanciaporc = 0;
RDebugUtils.currentLine=20119654;
 //BA.debugLineNum = 20119654;BA.debugLine="Dim ImportanciaValor As Double";
_importanciavalor = 0;
RDebugUtils.currentLine=20119656;
 //BA.debugLineNum = 20119656;BA.debugLine="Dim DescuentoValor As Double = Round2(Detalle.Ge";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("DescuentoValor"),(int) (3));
RDebugUtils.currentLine=20119657;
 //BA.debugLineNum = 20119657;BA.debugLine="Dim NetoLinea As Double = Round2(Detalle.GetDoub";
_netolinea = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (3));
RDebugUtils.currentLine=20119658;
 //BA.debugLineNum = 20119658;BA.debugLine="Dim BrutoLinea As Double = Round2(Detalle.GetDou";
_brutolinea = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValBrutoLinea"),(int) (3));
RDebugUtils.currentLine=20119660;
 //BA.debugLineNum = 20119660;BA.debugLine="Dim CantUd1 As Double = Detalle.GetDouble(\"CantU";
_cantud1 = _detalle.GetDouble("CantUd1");
RDebugUtils.currentLine=20119661;
 //BA.debugLineNum = 20119661;BA.debugLine="Dim CantUd2 As Double = Detalle.GetDouble(\"CantU";
_cantud2 = _detalle.GetDouble("CantUd2");
RDebugUtils.currentLine=20119662;
 //BA.debugLineNum = 20119662;BA.debugLine="Dim NetoRealUd1 As Double";
_netorealud1 = 0;
RDebugUtils.currentLine=20119663;
 //BA.debugLineNum = 20119663;BA.debugLine="Dim NetoRealUd2 As Double";
_netorealud2 = 0;
RDebugUtils.currentLine=20119665;
 //BA.debugLineNum = 20119665;BA.debugLine="Dim DescuentoPorc As Double = Detalle.GetDouble(";
_descuentoporc = _detalle.GetDouble("DescuentoPorc");
RDebugUtils.currentLine=20119666;
 //BA.debugLineNum = 20119666;BA.debugLine="Dim DsctoMaximoLinea As Double = Detalle.GetDoub";
_dsctomaximolinea = _detalle.GetDouble("DescMaximo");
RDebugUtils.currentLine=20119667;
 //BA.debugLineNum = 20119667;BA.debugLine="Dim Rtu As Double = Detalle.GetDouble(\"Rtu\")";
_rtu = _detalle.GetDouble("Rtu");
RDebugUtils.currentLine=20119669;
 //BA.debugLineNum = 20119669;BA.debugLine="If Prct = False Then";
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
RDebugUtils.currentLine=20119671;
 //BA.debugLineNum = 20119671;BA.debugLine="ImportanciaPorc = Round2(NetoLinea / TotalNetoS";
_importanciaporc = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_totalnetosdscto,(int) (5));
RDebugUtils.currentLine=20119672;
 //BA.debugLineNum = 20119672;BA.debugLine="ImportanciaValor = Round2(ImportanciaPorc * Tot";
_importanciavalor = anywheresoftware.b4a.keywords.Common.Round2(_importanciaporc*_totaldsctoglobal,(int) (5));
RDebugUtils.currentLine=20119674;
 //BA.debugLineNum = 20119674;BA.debugLine="Dim PrecioNetoUd1 As Double = Round2(NetoLinea";
_precionetoud1 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud1,(int) (3));
RDebugUtils.currentLine=20119675;
 //BA.debugLineNum = 20119675;BA.debugLine="NetoRealUd1 = Round2(PrecioNetoUd1 - (PrecioNet";
_netorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_precionetoud1-(_precionetoud1*_var_dsctoglobal),(int) (3));
RDebugUtils.currentLine=20119677;
 //BA.debugLineNum = 20119677;BA.debugLine="If Rtu = 1 Then";
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
RDebugUtils.currentLine=20119678;
 //BA.debugLineNum = 20119678;BA.debugLine="NetoRealUd2 = NetoRealUd1 * Rtu";
_netorealud2 = _netorealud1*_rtu;
RDebugUtils.currentLine=20119679;
 //BA.debugLineNum = 20119679;BA.debugLine="NetoRealUd2 = NetoRealUd1";
_netorealud2 = _netorealud1;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=20119681;
 //BA.debugLineNum = 20119681;BA.debugLine="NetoRealUd2 = Round2((NetoLinea / CantUd2) - (";
_netorealud2 = anywheresoftware.b4a.keywords.Common.Round2((_netolinea/(double)_cantud2)-((_netolinea/(double)_cantud2)*_var_dsctoglobal),(int) (3));
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=20119685;
 //BA.debugLineNum = 20119685;BA.debugLine="Dim DsctoReal As Double = DsctoPorcGlobal";
_dsctoreal = _dsctoporcglobal;
RDebugUtils.currentLine=20119686;
 //BA.debugLineNum = 20119686;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealPorc",(Object)(_dsctoreal),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119688;
 //BA.debugLineNum = 20119688;BA.debugLine="Dim DsctoLinea As Double = Funciones.Fx_NuloPor";
_dsctolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("DescuentoPorc")),0)));
RDebugUtils.currentLine=20119690;
 //BA.debugLineNum = 20119690;BA.debugLine="DsctoReal = Round2(100 * (1 - ((1 - (DsctoLinea";
_dsctoreal = anywheresoftware.b4a.keywords.Common.Round2(100*(1-((1-(_dsctolinea/(double)100.0))*(1-(_dsctoporcglobal/(double)100.0)))),(int) (3));
RDebugUtils.currentLine=20119696;
 //BA.debugLineNum = 20119696;BA.debugLine="If Afecta_Precio_Real = False Then";
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
RDebugUtils.currentLine=20119697;
 //BA.debugLineNum = 20119697;BA.debugLine="If NetoLinea > 0 Then";
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
RDebugUtils.currentLine=20119698;
 //BA.debugLineNum = 20119698;BA.debugLine="NetoRealUd1 = Round2(NetoLinea / CantUd1, 5)";
_netorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=20119699;
 //BA.debugLineNum = 20119699;BA.debugLine="NetoRealUd2 = Round2(NetoLinea / CantUd2, 5)";
_netorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud2,(int) (5));
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=20119701;
 //BA.debugLineNum = 20119701;BA.debugLine="NetoRealUd1 = 0";
_netorealud1 = 0;
RDebugUtils.currentLine=20119702;
 //BA.debugLineNum = 20119702;BA.debugLine="NetoRealUd2 = 0";
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
RDebugUtils.currentLine=20119707;
 //BA.debugLineNum = 20119707;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","PrecioNetoRealUd1",(Object)(_netorealud1),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119708;
 //BA.debugLineNum = 20119708;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","PrecioNetoRealUd1",(Object)(_netorealud2),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119710;
 //BA.debugLineNum = 20119710;BA.debugLine="Dim DsctoRealValor As Double";
_dsctorealvalor = 0;
RDebugUtils.currentLine=20119712;
 //BA.debugLineNum = 20119712;BA.debugLine="If Chk_Valores_Netos.Checked Then";
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
RDebugUtils.currentLine=20119713;
 //BA.debugLineNum = 20119713;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
_dsctorealvalor = anywheresoftware.b4a.keywords.Common.Round2((_dsctoreal/(double)100)*_totalnetodoc,(int) (1));
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=20119715;
 //BA.debugLineNum = 20119715;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
_dsctorealvalor = anywheresoftware.b4a.keywords.Common.Round2((_dsctoreal/(double)100)*_totalbrutodoc,(int) (0));
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=20119718;
 //BA.debugLineNum = 20119718;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealPorc",(Object)(_dsctoreal),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119719;
 //BA.debugLineNum = 20119719;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealValor",(Object)(_dsctorealvalor),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119721;
 //BA.debugLineNum = 20119721;BA.debugLine="Dim Tiene_Dscto As Boolean = Funciones.Cbool(De";
_tiene_dscto = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Tiene_Dscto"));
RDebugUtils.currentLine=20119722;
 //BA.debugLineNum = 20119722;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(";
_valvtadescmax = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("ValVtaDescMax"));
RDebugUtils.currentLine=20119724;
 //BA.debugLineNum = 20119724;BA.debugLine="If DsctoReal > DsctoMaximoLinea Then";
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
RDebugUtils.currentLine=20119726;
 //BA.debugLineNum = 20119726;BA.debugLine="Dim CodFunAutoriza As String = Detalle.GetStri";
_codfunautoriza = _detalle.GetString("CodFunAutoriza");
RDebugUtils.currentLine=20119727;
 //BA.debugLineNum = 20119727;BA.debugLine="Dim CodVendedor As String = Detalle.GetString(";
_codvendedor = _detalle.GetString("CodVendedor");
RDebugUtils.currentLine=20119728;
 //BA.debugLineNum = 20119728;BA.debugLine="Dim CodPermiso As String = Funciones.Fx_NuloPo";
_codpermiso = parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetString("CodPermiso")),(double)(Double.parseDouble("")));
RDebugUtils.currentLine=20119729;
 //BA.debugLineNum = 20119729;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=20119731;
 //BA.debugLineNum = 20119731;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza";
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
RDebugUtils.currentLine=20119739;
 //BA.debugLineNum = 20119739;BA.debugLine="Dim Es_Padre_Oferta As Boolean = Funciones.Cbo";
_es_padre_oferta = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Es_Padre_Oferta"));
RDebugUtils.currentLine=20119740;
 //BA.debugLineNum = 20119740;BA.debugLine="Dim Aplica_Oferta As Boolean = Funciones.Cbool";
_aplica_oferta = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,(double)(Double.parseDouble(_detalle.GetString("Aplica_Oferta"))));
RDebugUtils.currentLine=20119742;
 //BA.debugLineNum = 20119742;BA.debugLine="If Aplica_Oferta = False Or Es_Padre_Oferta Th";
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
RDebugUtils.currentLine=20119744;
 //BA.debugLineNum = 20119744;BA.debugLine="If Valor_Dscto >= DsctoReal Then";
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
RDebugUtils.currentLine=20119749;
 //BA.debugLineNum = 20119749;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoGlobalSuperado",(Object)(anywheresoftware.b4a.keywords.Common.False),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119750;
 //BA.debugLineNum = 20119750;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","CodFuncionario_Autoriza",(Object)(_codfunautoriza),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=20119754;
 //BA.debugLineNum = 20119754;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","ValVtaDescMax",(Object)(anywheresoftware.b4a.keywords.Common.True),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119755;
 //BA.debugLineNum = 20119755;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoGlobalSuperado",(Object)(anywheresoftware.b4a.keywords.Common.True),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=20119756;
 //BA.debugLineNum = 20119756;BA.debugLine="Contador = Contador + 1";
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
RDebugUtils.currentLine=20119771;
 //BA.debugLineNum = 20119771;BA.debugLine="If Contador = 0 Then";

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
RDebugUtils.currentLine=20119789;
 //BA.debugLineNum = 20119789;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=20119799;
 //BA.debugLineNum = 20119799;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 85:
//C
this.state = -1;
;
RDebugUtils.currentLine=20119803;
 //BA.debugLineNum = 20119803;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String[]  _generaarreglo(String _tabla) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "generaarreglo", false))
	 {return ((String[]) Debug.delegate(mostCurrent.activityBA, "generaarreglo", new Object[] {_tabla}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _tbl = null;
int _cantfilas = 0;
String[] _arreglo = null;
int _i = 0;
String _namedb = "";
String _typedb = "";
String _hola = "";
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub GeneraArreglo(Tabla As String) As Stri";
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Consulta_Sql = \"PRAGMA table_info('\" & Tabla & \"'";
mostCurrent._consulta_sql = "PRAGMA table_info('"+_tabla+"')";
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Private Tbl As Cursor";
_tbl = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Tbl = Variables.vSql.ExecQuery(Consulta_Sql)";
_tbl = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(mostCurrent._consulta_sql)));
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="If Tbl.RowCount > 0 Then";
if (_tbl.getRowCount()>0) { 
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="Dim	CantFilas As Int = Tbl.RowCount";
_cantfilas = _tbl.getRowCount();
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="Dim Arreglo(CantFilas) As String";
_arreglo = new String[_cantfilas];
java.util.Arrays.fill(_arreglo,"");
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="For i = 0 To CantFilas-1";
{
final int step7 = 1;
final int limit7 = (int) (_cantfilas-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="Try";
try {RDebugUtils.currentLine=19529745;
 //BA.debugLineNum = 19529745;BA.debugLine="Tbl.Position = i";
_tbl.setPosition(_i);
RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="Dim nameDB As String = Tbl.GetString(\"name\")";
_namedb = _tbl.GetString("name");
RDebugUtils.currentLine=19529748;
 //BA.debugLineNum = 19529748;BA.debugLine="Dim TypeDB As String = Tbl.GetString(\"type\")";
_typedb = _tbl.GetString("type");
RDebugUtils.currentLine=19529750;
 //BA.debugLineNum = 19529750;BA.debugLine="If nameDB.Contains(\"Fecha\") And TypeDB = \"DOUB";
if (_namedb.contains("Fecha") && (_typedb).equals("DOUBLE")) { 
RDebugUtils.currentLine=19529751;
 //BA.debugLineNum = 19529751;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
_arreglo[_i] = mostCurrent._dbutils._db_date /*String*/ ;
 }else {
RDebugUtils.currentLine=19529754;
 //BA.debugLineNum = 19529754;BA.debugLine="Select Case TypeDB";
switch (BA.switchObjectToInt(_typedb,"DOUBLE","INTEGER","INT","INTEGER","BOOLEAN","STRING","DATE")) {
case 0: {
RDebugUtils.currentLine=19529756;
 //BA.debugLineNum = 19529756;BA.debugLine="Arreglo(i) = DBUtils.DB_DOUBLE";
_arreglo[_i] = mostCurrent._dbutils._db_double /*String*/ ;
 break; }
case 1: 
case 2: {
RDebugUtils.currentLine=19529758;
 //BA.debugLineNum = 19529758;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
_arreglo[_i] = mostCurrent._dbutils._db_integer /*String*/ ;
 break; }
case 3: {
RDebugUtils.currentLine=19529760;
 //BA.debugLineNum = 19529760;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
_arreglo[_i] = mostCurrent._dbutils._db_integer /*String*/ ;
 break; }
case 4: {
RDebugUtils.currentLine=19529762;
 //BA.debugLineNum = 19529762;BA.debugLine="Arreglo(i) = DBUtils.DB_BOOLEAN";
_arreglo[_i] = mostCurrent._dbutils._db_boolean /*String*/ ;
 break; }
case 5: {
RDebugUtils.currentLine=19529764;
 //BA.debugLineNum = 19529764;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
_arreglo[_i] = mostCurrent._dbutils._db_text /*String*/ ;
 break; }
case 6: {
RDebugUtils.currentLine=19529766;
 //BA.debugLineNum = 19529766;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
_arreglo[_i] = mostCurrent._dbutils._db_date /*String*/ ;
 break; }
default: {
RDebugUtils.currentLine=19529768;
 //BA.debugLineNum = 19529768;BA.debugLine="If TypeDB.Contains(\"CHAR\") Then";
if (_typedb.contains("CHAR")) { 
RDebugUtils.currentLine=19529769;
 //BA.debugLineNum = 19529769;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
_arreglo[_i] = mostCurrent._dbutils._db_text /*String*/ ;
 }else {
RDebugUtils.currentLine=19529771;
 //BA.debugLineNum = 19529771;BA.debugLine="Dim hola As String = \"Aca\"";
_hola = "Aca";
 };
 break; }
}
;
 };
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=19529778;
 //BA.debugLineNum = 19529778;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("619529778",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }
};
RDebugUtils.currentLine=19529783;
 //BA.debugLineNum = 19529783;BA.debugLine="Return Arreglo";
if (true) return _arreglo;
 };
RDebugUtils.currentLine=19529787;
 //BA.debugLineNum = 19529787;BA.debugLine="Return Null";
if (true) return (String[])(anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=19529789;
 //BA.debugLineNum = 19529789;BA.debugLine="End Sub";
return null;
}
public static void  _label11_longclick() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label11_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "label11_longclick", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=20054026;
 //BA.debugLineNum = 20054026;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=20054027;
 //BA.debugLineNum = 20054027;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=20054028;
 //BA.debugLineNum = 20054028;BA.debugLine="Dialog.Title = \"Orden de compra\"";
_dialog._title /*Object*/  = (Object)("Orden de compra");
RDebugUtils.currentLine=20054030;
 //BA.debugLineNum = 20054030;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de orden de";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Número de orden de compra"));
RDebugUtils.currentLine=20054031;
 //BA.debugLineNum = 20054031;BA.debugLine="InputTemplate.Text = Txt_Orden_compra.Text";
parent.mostCurrent._inputtemplate._text /*String*/  = parent.mostCurrent._txt_orden_compra.getText();
RDebugUtils.currentLine=20054033;
 //BA.debugLineNum = 20054033;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "label11_longclick"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=20054034;
 //BA.debugLineNum = 20054034;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=20054035;
 //BA.debugLineNum = 20054035;BA.debugLine="Txt_Orden_compra.Text = InputTemplate.Text";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent.mostCurrent._inputtemplate._text /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=20054038;
 //BA.debugLineNum = 20054038;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _label12_longclick() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "label12_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "label12_longclick", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
BaKapp.Movil.Tag.b4xdialog _dialog = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub Label12_LongClick";
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="Dialog.Title = \"Observaciones\"";
_dialog._title /*Object*/  = (Object)("Observaciones");
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextBackg";
mostCurrent._longtexttemplate._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextColor";
mostCurrent._longtexttemplate._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = _xui.Color_Black;
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="LongTextTemplate.Text = Txt_Observaciones.Text";
mostCurrent._longtexttemplate._text /*Object*/  = (Object)(mostCurrent._txt_observaciones.getText());
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="Dialog.ShowTemplate(LongTextTemplate, \"OK\", \"\", \"";
_dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(mostCurrent._longtexttemplate),(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=19988500;
 //BA.debugLineNum = 19988500;BA.debugLine="End Sub";
return "";
}
public static void  _lbl_lista_precios_longclick() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_lista_precios_longclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbl_lista_precios_longclick", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00009"));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=19922959;
 //BA.debugLineNum = 19922959;BA.debugLine="Msgbox2Async(\"¿desea cambiar la lista de precios";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿desea cambiar la lista de precios "+parent.mostCurrent._searchtemplate._selecteditem /*String*/ +"?"),BA.ObjectToCharSequence("Cambiar lista"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19922960;
 //BA.debugLineNum = 19922960;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), null);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19922962;
 //BA.debugLineNum = 19922962;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19922963;
 //BA.debugLineNum = 19922963;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=19922966;
 //BA.debugLineNum = 19922966;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=19922967;
 //BA.debugLineNum = 19922967;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=19922968;
 //BA.debugLineNum = 19922968;BA.debugLine="Dialog.Title = \"Listas de precios autorizadas\"";
_dialog._title /*Object*/  = (Object)("Listas de precios autorizadas");
RDebugUtils.currentLine=19922970;
 //BA.debugLineNum = 19922970;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplate, \"\",";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19922971;
 //BA.debugLineNum = 19922971;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19922973;
 //BA.debugLineNum = 19922973;BA.debugLine="Msgbox2Async(\"¿Confirma utilizar la lista \" & Se";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma utilizar la lista "+parent.mostCurrent._searchtemplate._selecteditem /*String*/ +"?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=19922974;
 //BA.debugLineNum = 19922974;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), null);
this.state = 20;
return;
case 20:
//C
this.state = 12;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=19922976;
 //BA.debugLineNum = 19922976;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=19922977;
 //BA.debugLineNum = 19922977;BA.debugLine="Lbl_Lista_Precios.Text = SearchTemplate.Selecte";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
RDebugUtils.currentLine=19922978;
 //BA.debugLineNum = 19922978;BA.debugLine="Dim Kolt As String = Funciones.Mid(Lbl_Lista_Pr";
_kolt = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_lista_precios.getText(),(int) (1),(int) (3));
RDebugUtils.currentLine=19922979;
 //BA.debugLineNum = 19922979;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_kolt));
RDebugUtils.currentLine=19922980;
 //BA.debugLineNum = 19922980;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
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
RDebugUtils.currentLine=19922985;
 //BA.debugLineNum = 19922985;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_trae_secueven(String _secueven) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_trae_secueven", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_trae_secueven", new Object[] {_secueven}));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="Dim vSb_TidoNotido As TidoNudo";
_vsb_tidonotido = new BaKapp.Movil.Tag.tidonudo();
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="vSb_TidoNotido.Initialize";
_vsb_tidonotido._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="Dim Tido As String";
_tido = "";
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="Dim Notido As String";
_notido = "";
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="Select Case Secueven";
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
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_tido = "GDV";
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_notido = "GUIA DE DESPACHO DE VENTA";
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
_tido = "FCV";
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
_notido = "FACTURA DE VENTA";
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_tido = "GDV";
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_notido = "GUIA DE DESPACHO DE VENTA";
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
_tido = "BLV";
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
_notido = "BOLETA DE VENTA";
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=18808855;
 //BA.debugLineNum = 18808855;BA.debugLine="Tido = \"\": Notido = \"\"";
_tido = "";
RDebugUtils.currentLine=18808855;
 //BA.debugLineNum = 18808855;BA.debugLine="Tido = \"\": Notido = \"\"";
_notido = "";
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=18808858;
 //BA.debugLineNum = 18808858;BA.debugLine="vSb_TidoNotido.Tido = Tido";
_vsb_tidonotido._tido /*String*/  = _tido;
RDebugUtils.currentLine=18808859;
 //BA.debugLineNum = 18808859;BA.debugLine="vSb_TidoNotido.Notido = Notido";
_vsb_tidonotido._notido /*String*/  = _notido;
RDebugUtils.currentLine=18808861;
 //BA.debugLineNum = 18808861;BA.debugLine="Return vSb_TidoNotido";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_vsb_tidonotido));return;};
RDebugUtils.currentLine=18808863;
 //BA.debugLineNum = 18808863;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_sumar_totales() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_sumar_totales", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_sumar_totales", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Wait For(Fx_Validar_Descuentos_Globales) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_sumar_totales"), _fx_validar_descuentos_globales());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_accion = (Boolean) result[0];
;
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Dim Total_Neto As Double";
_total_neto = 0;
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="Dim CantTotal As Double = 0";
_canttotal = 0;
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Dim Items = 0";
_items = BA.NumberToString(0);
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="Dim Decimal = 0";
_decimal = BA.NumberToString(0);
RDebugUtils.currentLine=18481161;
 //BA.debugLineNum = 18481161;BA.debugLine="Dim Moneda As String '= _TblEncabezado.Rows(0).It";
_moneda = "";
RDebugUtils.currentLine=18481163;
 //BA.debugLineNum = 18481163;BA.debugLine="If Moneda <> \"$\" Then";
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
RDebugUtils.currentLine=18481164;
 //BA.debugLineNum = 18481164;BA.debugLine="Decimal = 2";
_decimal = BA.NumberToString(2);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=18481167;
 //BA.debugLineNum = 18481167;BA.debugLine="Dim Total_Neto As Double";
_total_neto = 0;
RDebugUtils.currentLine=18481169;
 //BA.debugLineNum = 18481169;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=18481170;
 //BA.debugLineNum = 18481170;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=18481172;
 //BA.debugLineNum = 18481172;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=18481174;
 //BA.debugLineNum = 18481174;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
RDebugUtils.currentLine=18481176;
 //BA.debugLineNum = 18481176;BA.debugLine="Hay_Descuentos_Globales = False";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=18481178;
 //BA.debugLineNum = 18481178;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=18481180;
 //BA.debugLineNum = 18481180;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
RDebugUtils.currentLine=18481181;
 //BA.debugLineNum = 18481181;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
_precio = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Precio")),0)));
RDebugUtils.currentLine=18481182;
 //BA.debugLineNum = 18481182;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
_valnetolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("ValNetoLinea")),0)));
RDebugUtils.currentLine=18481183;
 //BA.debugLineNum = 18481183;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=18481184;
 //BA.debugLineNum = 18481184;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
RDebugUtils.currentLine=18481186;
 //BA.debugLineNum = 18481186;BA.debugLine="If Tict = \"D\" Then";
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
RDebugUtils.currentLine=18481187;
 //BA.debugLineNum = 18481187;BA.debugLine="Hay_Descuentos_Globales = True";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 5;
;
RDebugUtils.currentLine=18481190;
 //BA.debugLineNum = 18481190;BA.debugLine="Dim Cant As Double=Funciones.Fx_NuloPorNro(Detal";
_cant = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("CantUd"+BA.NumberToString(_untrans))),0)));
RDebugUtils.currentLine=18481192;
 //BA.debugLineNum = 18481192;BA.debugLine="CantTotal = CantTotal+ Round2(Cant,0)";
_canttotal = _canttotal+anywheresoftware.b4a.keywords.Common.Round2(_cant,(int) (0));
RDebugUtils.currentLine=18481194;
 //BA.debugLineNum = 18481194;BA.debugLine="Total_Neto = Total_Neto + ValNetoLinea";
_total_neto = _total_neto+_valnetolinea;
RDebugUtils.currentLine=18481196;
 //BA.debugLineNum = 18481196;BA.debugLine="Items = Items+1";
_items = BA.NumberToString((double)(Double.parseDouble(_items))+1);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=18481201;
 //BA.debugLineNum = 18481201;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izquie";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,_items,(int) (2),"0");
RDebugUtils.currentLine=18481202;
 //BA.debugLineNum = 18481202;BA.debugLine="If ItemStr = \"00\" Then ItemStr = 0";
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
RDebugUtils.currentLine=18481203;
 //BA.debugLineNum = 18481203;BA.debugLine="Lbl_Items.Text = \"Total Items: \" & ItemStr";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence("Total Items: "+_itemstr));
RDebugUtils.currentLine=18481205;
 //BA.debugLineNum = 18481205;BA.debugLine="Lbl_Total_Neto.Tag = Round2(Total_Neto,0)";
parent.mostCurrent._lbl_total_neto.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2(_total_neto,(int) (0))));
RDebugUtils.currentLine=18481206;
 //BA.debugLineNum = 18481206;BA.debugLine="Lbl_Total_Iva.Tag = Round2(Total_Neto*0.19,0)";
parent.mostCurrent._lbl_total_iva.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2(_total_neto*0.19,(int) (0))));
RDebugUtils.currentLine=18481207;
 //BA.debugLineNum = 18481207;BA.debugLine="Lbl_Total_Impuestos.Tag = 0";
parent.mostCurrent._lbl_total_impuestos.setTag((Object)(0));
RDebugUtils.currentLine=18481208;
 //BA.debugLineNum = 18481208;BA.debugLine="Lbl_Total_Bruto.Tag = Round2(Lbl_Total_Neto.Tag+L";
parent.mostCurrent._lbl_total_bruto.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag()))+(double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_iva.getTag())),(int) (0))));
RDebugUtils.currentLine=18481210;
 //BA.debugLineNum = 18481210;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=18481211;
 //BA.debugLineNum = 18481211;BA.debugLine="Lbl_Total_Iva.Text =  \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_iva.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_iva.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=18481212;
 //BA.debugLineNum = 18481212;BA.debugLine="Lbl_Total_Impuestos.Text  = \"$ \" & NumberFormat(L";
parent.mostCurrent._lbl_total_impuestos.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_impuestos.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=18481213;
 //BA.debugLineNum = 18481213;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=18481214;
 //BA.debugLineNum = 18481214;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Bru";
parent.mostCurrent._lbl_total_bruto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_bruto.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=18481216;
 //BA.debugLineNum = 18481216;BA.debugLine="Fila_Encabezado.Put(\"TotalNetoDoc\".ToLowerCase,Lb";
parent._fila_encabezado.Put((Object)("TotalNetoDoc".toLowerCase()),parent.mostCurrent._lbl_total_neto.getTag());
RDebugUtils.currentLine=18481217;
 //BA.debugLineNum = 18481217;BA.debugLine="Fila_Encabezado.Put(\"TotalIvaDoc\".ToLowerCase,Lbl";
parent._fila_encabezado.Put((Object)("TotalIvaDoc".toLowerCase()),parent.mostCurrent._lbl_total_iva.getTag());
RDebugUtils.currentLine=18481218;
 //BA.debugLineNum = 18481218;BA.debugLine="Fila_Encabezado.Put(\"TotalBrutoDoc\".ToLowerCase,L";
parent._fila_encabezado.Put((Object)("TotalBrutoDoc".toLowerCase()),parent.mostCurrent._lbl_total_bruto.getTag());
RDebugUtils.currentLine=18481220;
 //BA.debugLineNum = 18481220;BA.debugLine="Fila_Encabezado.Put(\"CantTotal\".ToLowerCase,CantT";
parent._fila_encabezado.Put((Object)("CantTotal".toLowerCase()),(Object)(_canttotal));
RDebugUtils.currentLine=18481223;
 //BA.debugLineNum = 18481223;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=18481225;
 //BA.debugLineNum = 18481225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_entidad(boolean _actualizardatos) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_cargar_entidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_cargar_entidad", new Object[] {_actualizardatos}));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
_koen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad".toLowerCase())));
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
_suen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad".toLowerCase())));
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="Dim Nokoen As String = Fila_Encabezado.Get(\"Nombr";
_nokoen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("Nombre_Entidad".toLowerCase())));
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_koen,_suen);
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_entidad"), (Object)(_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=17694732;
 //BA.debugLineNum = 17694732;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=17694734;
 //BA.debugLineNum = 17694734;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=17694736;
 //BA.debugLineNum = 17694736;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=17694738;
 //BA.debugLineNum = 17694738;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=17694739;
 //BA.debugLineNum = 17694739;BA.debugLine="Row_Entidad =Filas.Get(0)";
parent._row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=17694741;
 //BA.debugLineNum = 17694741;BA.debugLine="If ActualizarDatos Then";
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
RDebugUtils.currentLine=17694742;
 //BA.debugLineNum = 17694742;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,";
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,anywheresoftware.b4a.keywords.Common.False,parent._editar_documento,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=17694744;
 //BA.debugLineNum = 17694744;BA.debugLine="Log(\"Entidad cargada \" & Koen.Trim & \" - \" & No";
anywheresoftware.b4a.keywords.Common.LogImpl("617694744","Entidad cargada "+_koen.trim()+" - "+_nokoen,0);
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
RDebugUtils.currentLine=17694751;
 //BA.debugLineNum = 17694751;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("617694751",_js._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=17694754;
 //BA.debugLineNum = 17694754;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=17694756;
 //BA.debugLineNum = 17694756;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_cargar_documento2() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_cargar_documento2", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_cargar_documento2", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17629199;
 //BA.debugLineNum = 17629199;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17629201;
 //BA.debugLineNum = 17629201;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
parent.mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("observaciones"))));
RDebugUtils.currentLine=17629202;
 //BA.debugLineNum = 17629202;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("orden_compra"))));
RDebugUtils.currentLine=17629206;
 //BA.debugLineNum = 17629206;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=17629207;
 //BA.debugLineNum = 17629207;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=17629209;
 //BA.debugLineNum = 17629209;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodTi";
parent.mostCurrent._lbl_tipodespacho.setTag(parent._fila_despafacil.Get((Object)("CodTipoDespacho".toLowerCase())));
RDebugUtils.currentLine=17629210;
 //BA.debugLineNum = 17629210;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tipo";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoDespacho".toLowerCase()))));
RDebugUtils.currentLine=17629212;
 //BA.debugLineNum = 17629212;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"CodT";
parent.mostCurrent._lbl_tipopagodesp.setTag(parent._fila_despafacil.Get((Object)("CodTipoPagoDesp".toLowerCase())));
RDebugUtils.currentLine=17629213;
 //BA.debugLineNum = 17629213;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tipo";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoPagoDesp".toLowerCase()))));
RDebugUtils.currentLine=17629215;
 //BA.debugLineNum = 17629215;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Cod";
parent.mostCurrent._lbl_coddocdestino.setTag(parent._fila_despafacil.Get((Object)("CodDocDestino".toLowerCase())));
RDebugUtils.currentLine=17629216;
 //BA.debugLineNum = 17629216;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Doc";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DocDestino".toLowerCase()))));
RDebugUtils.currentLine=17629218;
 //BA.debugLineNum = 17629218;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"Di";
parent.mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DireccionDesp".toLowerCase()))));
RDebugUtils.currentLine=17629219;
 //BA.debugLineNum = 17629219;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get(";
parent.mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("ObservacionesDesp".toLowerCase()))));
RDebugUtils.currentLine=17629221;
 //BA.debugLineNum = 17629221;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("617629221","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
RDebugUtils.currentLine=17629223;
 //BA.debugLineNum = 17629223;BA.debugLine="Wait For (Sb_Cargar_Entidad(False)) Complete (Fin";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_documento2"), _sb_cargar_entidad(anywheresoftware.b4a.keywords.Common.False));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_fin = (Boolean) result[0];
;
RDebugUtils.currentLine=17629227;
 //BA.debugLineNum = 17629227;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encabe";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fechaemision".toLowerCase()))))));
RDebugUtils.currentLine=17629228;
 //BA.debugLineNum = 17629228;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
RDebugUtils.currentLine=17629229;
 //BA.debugLineNum = 17629229;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
RDebugUtils.currentLine=17629231;
 //BA.debugLineNum = 17629231;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas"))));
RDebugUtils.currentLine=17629232;
 //BA.debugLineNum = 17629232;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento"))));
RDebugUtils.currentLine=17629233;
 //BA.debugLineNum = 17629233;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento"))));
RDebugUtils.currentLine=17629235;
 //BA.debugLineNum = 17629235;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_cargar_idlist() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_cargar_idlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_cargar_idlist", null));}
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _rownumber = 0;
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Sub Sb_Cargar_IDList";
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="IDList.Initialize";
mostCurrent._idlist.Initialize();
RDebugUtils.currentLine=18415623;
 //BA.debugLineNum = 18415623;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=18415625;
 //BA.debugLineNum = 18415625;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc))));
RDebugUtils.currentLine=18415627;
 //BA.debugLineNum = 18415627;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
RDebugUtils.currentLine=18415628;
 //BA.debugLineNum = 18415628;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=18415629;
 //BA.debugLineNum = 18415629;BA.debugLine="IDList.Initialize";
mostCurrent._idlist.Initialize();
RDebugUtils.currentLine=18415630;
 //BA.debugLineNum = 18415630;BA.debugLine="For Row = 0 To RowNumber - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rownumber-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
RDebugUtils.currentLine=18415631;
 //BA.debugLineNum = 18415631;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=18415632;
 //BA.debugLineNum = 18415632;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
 }
};
 }else {
RDebugUtils.currentLine=18415635;
 //BA.debugLineNum = 18415635;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=18415638;
 //BA.debugLineNum = 18415638;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=18415640;
 //BA.debugLineNum = 18415640;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_grabar_standby() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_grabar_standby", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_grabar_standby", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Dim Accion As Int";
_accion = 0;
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="If Cursor1.RowCount = 0 Then";
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
RDebugUtils.currentLine=19464203;
 //BA.debugLineNum = 19464203;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=19464209;
 //BA.debugLineNum = 19464209;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=19464220;
 //BA.debugLineNum = 19464220;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
RDebugUtils.currentLine=19464221;
 //BA.debugLineNum = 19464221;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19464222;
 //BA.debugLineNum = 19464222;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
RDebugUtils.currentLine=19464224;
 //BA.debugLineNum = 19464224;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
RDebugUtils.currentLine=19464225;
 //BA.debugLineNum = 19464225;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19464226;
 //BA.debugLineNum = 19464226;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
RDebugUtils.currentLine=19464228;
 //BA.debugLineNum = 19464228;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
RDebugUtils.currentLine=19464229;
 //BA.debugLineNum = 19464229;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19464230;
 //BA.debugLineNum = 19464230;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
RDebugUtils.currentLine=19464232;
 //BA.debugLineNum = 19464232;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
RDebugUtils.currentLine=19464233;
 //BA.debugLineNum = 19464233;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19464234;
 //BA.debugLineNum = 19464234;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
RDebugUtils.currentLine=19464236;
 //BA.debugLineNum = 19464236;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
RDebugUtils.currentLine=19464237;
 //BA.debugLineNum = 19464237;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=19464238;
 //BA.debugLineNum = 19464238;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
RDebugUtils.currentLine=19464240;
 //BA.debugLineNum = 19464240;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19464241;
 //BA.debugLineNum = 19464241;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
RDebugUtils.currentLine=19464242;
 //BA.debugLineNum = 19464242;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
RDebugUtils.currentLine=19464243;
 //BA.debugLineNum = 19464243;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19464244;
 //BA.debugLineNum = 19464244;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
RDebugUtils.currentLine=19464246;
 //BA.debugLineNum = 19464246;BA.debugLine="Dim Json As String = JSONGenerator.ToPrettyString";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19464247;
 //BA.debugLineNum = 19464247;BA.debugLine="Dim Json2 As String = JSONGenerator.ToString";
_json2 = _jsongenerator.ToString();
RDebugUtils.currentLine=19464249;
 //BA.debugLineNum = 19464249;BA.debugLine="Log(Json2)'(JSONGenerator.ToPrettyString(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("619464249",_json2,0);
RDebugUtils.currentLine=19464251;
 //BA.debugLineNum = 19464251;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Encabezado");
RDebugUtils.currentLine=19464252;
 //BA.debugLineNum = 19464252;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 37;
return;
case 37:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19464254;
 //BA.debugLineNum = 19464254;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19464256;
 //BA.debugLineNum = 19464256;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19464258;
 //BA.debugLineNum = 19464258;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19464260;
 //BA.debugLineNum = 19464260;BA.debugLine="Accion = 1";
_accion = (int) (1);
RDebugUtils.currentLine=19464262;
 //BA.debugLineNum = 19464262;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19464263;
 //BA.debugLineNum = 19464263;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
RDebugUtils.currentLine=19464264;
 //BA.debugLineNum = 19464264;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
RDebugUtils.currentLine=19464265;
 //BA.debugLineNum = 19464265;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19464266;
 //BA.debugLineNum = 19464266;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
RDebugUtils.currentLine=19464268;
 //BA.debugLineNum = 19464268;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19464270;
 //BA.debugLineNum = 19464270;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Detalle");
RDebugUtils.currentLine=19464271;
 //BA.debugLineNum = 19464271;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19464273;
 //BA.debugLineNum = 19464273;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19464275;
 //BA.debugLineNum = 19464275;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19464277;
 //BA.debugLineNum = 19464277;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19464279;
 //BA.debugLineNum = 19464279;BA.debugLine="Accion = 2";
_accion = (int) (2);
RDebugUtils.currentLine=19464281;
 //BA.debugLineNum = 19464281;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19464282;
 //BA.debugLineNum = 19464282;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
RDebugUtils.currentLine=19464283;
 //BA.debugLineNum = 19464283;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
RDebugUtils.currentLine=19464284;
 //BA.debugLineNum = 19464284;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19464285;
 //BA.debugLineNum = 19464285;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
RDebugUtils.currentLine=19464287;
 //BA.debugLineNum = 19464287;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19464289;
 //BA.debugLineNum = 19464289;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Descuentos");
RDebugUtils.currentLine=19464290;
 //BA.debugLineNum = 19464290;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19464292;
 //BA.debugLineNum = 19464292;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19464294;
 //BA.debugLineNum = 19464294;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19464296;
 //BA.debugLineNum = 19464296;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19464298;
 //BA.debugLineNum = 19464298;BA.debugLine="Accion = 3";
_accion = (int) (3);
RDebugUtils.currentLine=19464300;
 //BA.debugLineNum = 19464300;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19464301;
 //BA.debugLineNum = 19464301;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
RDebugUtils.currentLine=19464302;
 //BA.debugLineNum = 19464302;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
RDebugUtils.currentLine=19464303;
 //BA.debugLineNum = 19464303;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=19464304;
 //BA.debugLineNum = 19464304;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
RDebugUtils.currentLine=19464306;
 //BA.debugLineNum = 19464306;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=19464308;
 //BA.debugLineNum = 19464308;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Observaciones");
RDebugUtils.currentLine=19464309;
 //BA.debugLineNum = 19464309;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=19464311;
 //BA.debugLineNum = 19464311;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=19464313;
 //BA.debugLineNum = 19464313;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=19464315;
 //BA.debugLineNum = 19464315;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=19464317;
 //BA.debugLineNum = 19464317;BA.debugLine="Accion = 4";
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
RDebugUtils.currentLine=19464338;
 //BA.debugLineNum = 19464338;BA.debugLine="Return Accion";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=19464340;
 //BA.debugLineNum = 19464340;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_recorrer_detalle_rev_stock() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_recorrer_detalle_rev_stock", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_recorrer_detalle_rev_stock", null));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Dim ProConStockInsuficiente As Int";
_proconstockinsuficiente = 0;
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="ProgressDialogShow(\"Revisando stock...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Revisando stock..."));
RDebugUtils.currentLine=20185099;
 //BA.debugLineNum = 20185099;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=20185101;
 //BA.debugLineNum = 20185101;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
parent._id_docdet = (int)(Double.parseDouble(_detalle.GetString("Id_DocDet")));
RDebugUtils.currentLine=20185102;
 //BA.debugLineNum = 20185102;BA.debugLine="Dim	Empresa As String = Detalle.GetString(\"Empre";
_empresa = _detalle.GetString("Empresa");
RDebugUtils.currentLine=20185103;
 //BA.debugLineNum = 20185103;BA.debugLine="Dim	Sucursal As String = Detalle.GetString(\"Sucu";
_sucursal = _detalle.GetString("Sucursal");
RDebugUtils.currentLine=20185104;
 //BA.debugLineNum = 20185104;BA.debugLine="Dim	Bodega As String = Detalle.GetString(\"Bodega";
_bodega = _detalle.GetString("Bodega");
RDebugUtils.currentLine=20185105;
 //BA.debugLineNum = 20185105;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
RDebugUtils.currentLine=20185106;
 //BA.debugLineNum = 20185106;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
RDebugUtils.currentLine=20185107;
 //BA.debugLineNum = 20185107;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
RDebugUtils.currentLine=20185108;
 //BA.debugLineNum = 20185108;BA.debugLine="Dim	Tidopa As String";
_tidopa = "";
RDebugUtils.currentLine=20185110;
 //BA.debugLineNum = 20185110;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=20185111;
 //BA.debugLineNum = 20185111;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
RDebugUtils.currentLine=20185113;
 //BA.debugLineNum = 20185113;BA.debugLine="Dim	Tido As String";
_tido = "";
RDebugUtils.currentLine=20185115;
 //BA.debugLineNum = 20185115;BA.debugLine="If Prct = False Then";
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
RDebugUtils.currentLine=20185117;
 //BA.debugLineNum = 20185117;BA.debugLine="Wait For(Sb_Revisar_Stock_X_Fila(Id_DocDet,Tido";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_recorrer_detalle_rev_stock"), _sb_revisar_stock_x_fila(parent._id_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,""));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=20185119;
 //BA.debugLineNum = 20185119;BA.debugLine="If Result = False Then";
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
RDebugUtils.currentLine=20185120;
 //BA.debugLineNum = 20185120;BA.debugLine="ProConStockInsuficiente = ProConStockInsuficie";
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
RDebugUtils.currentLine=20185127;
 //BA.debugLineNum = 20185127;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=20185129;
 //BA.debugLineNum = 20185129;BA.debugLine="If ProConStockInsuficiente > 0 Then";
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
RDebugUtils.currentLine=20185130;
 //BA.debugLineNum = 20185130;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=20185133;
 //BA.debugLineNum = 20185133;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=20185135;
 //BA.debugLineNum = 20185135;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sb_editar_producto(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_editar_producto", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_editar_producto", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lblcodigo = null;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Sub Sb_Editar_Producto (Index As Int, Value As Obj";
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = mostCurrent._xclvdetalle._getrawlistitem(_index);
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
_lblcodigo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblcodigo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="Id_DocDet = LblCodigo.Tag";
_id_docdet = (int)(BA.ObjectToNumber(_lblcodigo.getTag()));
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
mostCurrent._frm_post_01_producto._id_docdet /*int*/  = _id_docdet;
RDebugUtils.currentLine=19070986;
 //BA.debugLineNum = 19070986;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_producto.getObject()));
RDebugUtils.currentLine=19070988;
 //BA.debugLineNum = 19070988;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisar_stock_x_fila(int _vid_docdet,String _tido,String _codigo,String _empresa,String _sucursal,String _bodega,double _cantidad,int _untrans,String _tidopa) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_revisar_stock_x_fila", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sb_revisar_stock_x_fila", new Object[] {_vid_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,_tidopa}));}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20250634;
 //BA.debugLineNum = 20250634;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_revisar_stock_fila /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa);
RDebugUtils.currentLine=20250636;
 //BA.debugLineNum = 20250636;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_revisar_stock_x_fila"), (Object)(_js));
this.state = 27;
return;
case 27:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=20250638;
 //BA.debugLineNum = 20250638;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=20250640;
 //BA.debugLineNum = 20250640;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=20250642;
 //BA.debugLineNum = 20250642;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=20250644;
 //BA.debugLineNum = 20250644;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=20250645;
 //BA.debugLineNum = 20250645;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
_filastk = new anywheresoftware.b4a.objects.collections.Map();
_filastk = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=20250647;
 //BA.debugLineNum = 20250647;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"S";
_stock_disponible = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Disponible"))));
RDebugUtils.currentLine=20250648;
 //BA.debugLineNum = 20250648;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stock";
_stock_fisico = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Fisico"))));
RDebugUtils.currentLine=20250649;
 //BA.debugLineNum = 20250649;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible & \"";
anywheresoftware.b4a.keywords.Common.LogImpl("620250649","Stock disponible: "+BA.NumberToString(_stock_disponible)+", Stock fisico: "+BA.NumberToString(_stock_fisico),0);
RDebugUtils.currentLine=20250651;
 //BA.debugLineNum = 20250651;BA.debugLine="Dim Stock_Suficiente As Boolean";
_stock_suficiente = false;
RDebugUtils.currentLine=20250653;
 //BA.debugLineNum = 20250653;BA.debugLine="If Stock_Disponible <= 0 Then";
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
RDebugUtils.currentLine=20250654;
 //BA.debugLineNum = 20250654;BA.debugLine="Stock_Suficiente = False";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=20250656;
 //BA.debugLineNum = 20250656;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
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
RDebugUtils.currentLine=20250657;
 //BA.debugLineNum = 20250657;BA.debugLine="Stock_Suficiente = True";
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
RDebugUtils.currentLine=20250661;
 //BA.debugLineNum = 20250661;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","stockbodega",(Object)(_stock_disponible),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(_vid_docdet)}));
RDebugUtils.currentLine=20250665;
 //BA.debugLineNum = 20250665;BA.debugLine="If Stock_Suficiente = False Then";
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
RDebugUtils.currentLine=20250666;
 //BA.debugLineNum = 20250666;BA.debugLine="Return False";
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
RDebugUtils.currentLine=20250671;
 //BA.debugLineNum = 20250671;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20250672;
 //BA.debugLineNum = 20250672;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pudo";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService..."),BA.ObjectToCharSequence("Error de comunicación"),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=20250673;
 //BA.debugLineNum = 20250673;BA.debugLine="Return False";
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
RDebugUtils.currentLine=20250678;
 //BA.debugLineNum = 20250678;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("620250678",_js._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=20250681;
 //BA.debugLineNum = 20250681;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=20250683;
 //BA.debugLineNum = 20250683;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _sb_traer_concepto(String _concepto) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_traer_concepto", false))
	 {Debug.delegate(mostCurrent.activityBA, "sb_traer_concepto", new Object[] {_concepto}); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_concepto,_empresa,_sucursal,_bodega,_lista,"");
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_traer_concepto"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando concepto..."));
RDebugUtils.currentLine=18087950;
 //BA.debugLineNum = 18087950;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=18087954;
 //BA.debugLineNum = 18087954;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=18087956;
 //BA.debugLineNum = 18087956;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=18087957;
 //BA.debugLineNum = 18087957;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=18087959;
 //BA.debugLineNum = 18087959;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
RDebugUtils.currentLine=18087961;
 //BA.debugLineNum = 18087961;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=18087962;
 //BA.debugLineNum = 18087962;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=18087963;
 //BA.debugLineNum = 18087963;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=18087965;
 //BA.debugLineNum = 18087965;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=18087967;
 //BA.debugLineNum = 18087967;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=18087968;
 //BA.debugLineNum = 18087968;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18087970;
 //BA.debugLineNum = 18087970;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=18087971;
 //BA.debugLineNum = 18087971;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consul";
_fila = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18087973;
 //BA.debugLineNum = 18087973;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=18087975;
 //BA.debugLineNum = 18087975;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=18087976;
 //BA.debugLineNum = 18087976;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18087978;
 //BA.debugLineNum = 18087978;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=18087980;
 //BA.debugLineNum = 18087980;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Fila)";
_sb_procesar_fila("DescuentoPorc",(int)(BA.ObjectToNumber(_fila)));
RDebugUtils.currentLine=18087982;
 //BA.debugLineNum = 18087982;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=18087983;
 //BA.debugLineNum = 18087983;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
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
RDebugUtils.currentLine=18087988;
 //BA.debugLineNum = 18087988;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("618087988",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=18087989;
 //BA.debugLineNum = 18087989;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=18087991;
 //BA.debugLineNum = 18087991;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=18087992;
 //BA.debugLineNum = 18087992;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=18087995;
 //BA.debugLineNum = 18087995;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _tab_post_tabchanged() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tab_post_tabchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tab_post_tabchanged", null));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub Tab_Post_TabChanged";
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_row_entidad.IsInitialized())) { 
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="If Tab_Post.CurrentTab <> 0 Then";
if (mostCurrent._tab_post.getCurrentTab()!=0) { 
RDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18546695;
 //BA.debugLineNum = 18546695;BA.debugLine="Msgbox2Async(\"Debe ingresar la entidad\",\"Valida";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Debe ingresar la entidad"),BA.ObjectToCharSequence("Validación"),"Ok","","",mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="Tab_Post.CurrentTab = 0";
mostCurrent._tab_post.setCurrentTab((int) (0));
 };
 };
RDebugUtils.currentLine=18546702;
 //BA.debugLineNum = 18546702;BA.debugLine="If Tab_Post.CurrentTab = 2 Then";
if (mostCurrent._tab_post.getCurrentTab()==2) { 
RDebugUtils.currentLine=18546704;
 //BA.debugLineNum = 18546704;BA.debugLine="Chk_Valores_Netos.Checked = True";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18546706;
 //BA.debugLineNum = 18546706;BA.debugLine="Lbl_Total_Neto.Text = NumberFormat(Lbl_Total_Net";
mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=18546707;
 //BA.debugLineNum = 18546707;BA.debugLine="Lbl_Total_Iva.Text = NumberFormat(Lbl_Total_Iva.";
mostCurrent._lbl_total_iva.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_iva.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=18546708;
 //BA.debugLineNum = 18546708;BA.debugLine="Lbl_Total_Impuestos.Text = NumberFormat(Lbl_Tota";
mostCurrent._lbl_total_impuestos.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_impuestos.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=18546709;
 //BA.debugLineNum = 18546709;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Br";
mostCurrent._lbl_total_bruto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_bruto.getTag())),(int) (0),(int) (0))));
 };
RDebugUtils.currentLine=18546713;
 //BA.debugLineNum = 18546713;BA.debugLine="End Sub";
return "";
}
public static void  _txt_codigo_enterpressed() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txt_codigo_enterpressed", false))
	 {Debug.delegate(mostCurrent.activityBA, "txt_codigo_enterpressed", null); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="If	Hay_Descuentos_Globales Then";
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
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE AGREMAR MAS ITEM"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), _sb_productomodoconsulta());
this.state = 31;
return;
case 31:
//C
this.state = 5;
_rsmoscs = (Boolean) result[0];
;
RDebugUtils.currentLine=18022415;
 //BA.debugLineNum = 18022415;BA.debugLine="If Not(RsMosCs) Then";
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
RDebugUtils.currentLine=18022416;
 //BA.debugLineNum = 18022416;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=18022419;
 //BA.debugLineNum = 18022419;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 32;
return;
case 32:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=18022420;
 //BA.debugLineNum = 18022420;BA.debugLine="If Not(Resultado) Then";
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
RDebugUtils.currentLine=18022421;
 //BA.debugLineNum = 18022421;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=18022424;
 //BA.debugLineNum = 18022424;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=18022426;
 //BA.debugLineNum = 18022426;BA.debugLine="Dim Codigo As String = Txt_Codigo.Text.Trim";
_codigo = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=18022428;
 //BA.debugLineNum = 18022428;BA.debugLine="If Codigo = \"\" Then";
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
RDebugUtils.currentLine=18022429;
 //BA.debugLineNum = 18022429;BA.debugLine="Txt_Codigo.Text = \"\"";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18022430;
 //BA.debugLineNum = 18022430;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
RDebugUtils.currentLine=18022431;
 //BA.debugLineNum = 18022431;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=18022434;
 //BA.debugLineNum = 18022434;BA.debugLine="ProgressDialogShow(\"Buscando producto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando producto..."));
RDebugUtils.currentLine=18022436;
 //BA.debugLineNum = 18022436;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=18022437;
 //BA.debugLineNum = 18022437;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=18022438;
 //BA.debugLineNum = 18022438;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=18022439;
 //BA.debugLineNum = 18022439;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=18022441;
 //BA.debugLineNum = 18022441;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
RDebugUtils.currentLine=18022443;
 //BA.debugLineNum = 18022443;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), (Object)(_js));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=18022445;
 //BA.debugLineNum = 18022445;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=18022447;
 //BA.debugLineNum = 18022447;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=18022449;
 //BA.debugLineNum = 18022449;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=18022451;
 //BA.debugLineNum = 18022451;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=18022452;
 //BA.debugLineNum = 18022452;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=18022454;
 //BA.debugLineNum = 18022454;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Codigo\")";
_errorstr = BA.ObjectToString(_fila.Get((Object)("Codigo")));
RDebugUtils.currentLine=18022456;
 //BA.debugLineNum = 18022456;BA.debugLine="If ErrorStr.Contains(\"Error_\")  Then";
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
RDebugUtils.currentLine=18022457;
 //BA.debugLineNum = 18022457;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18022458;
 //BA.debugLineNum = 18022458;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=18022459;
 //BA.debugLineNum = 18022459;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
RDebugUtils.currentLine=18022460;
 //BA.debugLineNum = 18022460;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=18022463;
 //BA.debugLineNum = 18022463;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
RDebugUtils.currentLine=18022465;
 //BA.debugLineNum = 18022465;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=18022467;
 //BA.debugLineNum = 18022467;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=18022468;
 //BA.debugLineNum = 18022468;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18022470;
 //BA.debugLineNum = 18022470;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=18022473;
 //BA.debugLineNum = 18022473;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=18022475;
 //BA.debugLineNum = 18022475;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
RDebugUtils.currentLine=18022476;
 //BA.debugLineNum = 18022476;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
RDebugUtils.currentLine=18022478;
 //BA.debugLineNum = 18022478;BA.debugLine="New_Row.Put(\"moneda\",Variables.Global_Row_Moned";
_new_row.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=18022479;
 //BA.debugLineNum = 18022479;BA.debugLine="New_Row.Put(\"tipo_moneda\",Variables.Global_Row_";
_new_row.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=18022480;
 //BA.debugLineNum = 18022480;BA.debugLine="New_Row.Put(\"tipo_cambio\",Variables.Global_Row_";
_new_row.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=18022481;
 //BA.debugLineNum = 18022481;BA.debugLine="New_Row.Put(\"codlista\",Lista)";
_new_row.Put((Object)("codlista"),(Object)(_lista));
RDebugUtils.currentLine=18022483;
 //BA.debugLineNum = 18022483;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=18022485;
 //BA.debugLineNum = 18022485;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=18022486;
 //BA.debugLineNum = 18022486;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18022488;
 //BA.debugLineNum = 18022488;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=18022490;
 //BA.debugLineNum = 18022490;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=18022491;
 //BA.debugLineNum = 18022491;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
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
RDebugUtils.currentLine=18022496;
 //BA.debugLineNum = 18022496;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("618022496",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=18022499;
 //BA.debugLineNum = 18022499;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=18022500;
 //BA.debugLineNum = 18022500;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=18022503;
 //BA.debugLineNum = 18022503;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=18022505;
 //BA.debugLineNum = 18022505;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xclvdetalle_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "xclvdetalle_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "xclvdetalle_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub XclvDetalle_ItemClick (Index As Int, V";
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return "";
}
public static void  _xclvdetalle_itemlongclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "xclvdetalle_itemlongclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "xclvdetalle_itemlongclick", new Object[] {_index,_value}); return;}
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
RDebugUtils.currentModule="frm_post_01_formulario";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_index);
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
_lblcodigo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblcodigo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="Dim LblDescripcion As Label = p.GetView(1)";
_lbldescripcion = new anywheresoftware.b4a.objects.LabelWrapper();
_lbldescripcion = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=18939911;
 //BA.debugLineNum = 18939911;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(LblItem.Tag";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_lblitem.getTag())));
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="Dim Tict As String = LblDescripcion.Tag";
_tict = BA.ObjectToString(_lbldescripcion.getTag());
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="Dim Editar As String = \"Editar\"";
_editar = "Editar";
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="If Prct Then";
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
RDebugUtils.currentLine=18939921;
 //BA.debugLineNum = 18939921;BA.debugLine="Editar = \"\"";
_editar = "";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18939923;
 //BA.debugLineNum = 18939923;BA.debugLine="If	Hay_Descuentos_Globales Then";
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
RDebugUtils.currentLine=18939924;
 //BA.debugLineNum = 18939924;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=18939925;
 //BA.debugLineNum = 18939925;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CR";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE HACER GESTION EN ESTA FILA"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="Return";
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
RDebugUtils.currentLine=18939932;
 //BA.debugLineNum = 18939932;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(LblDescripcio";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbldescripcion.getText()),BA.ObjectToCharSequence("Código: "+_lblcodigo.getText()),_editar,"Cancelar","Eliminar",parent.mostCurrent._bmp1);
RDebugUtils.currentLine=18939933;
 //BA.debugLineNum = 18939933;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 11;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=18939935;
 //BA.debugLineNum = 18939935;BA.debugLine="Id_DocDet = LblCodigo.Tag";
parent._id_docdet = (int)(BA.ObjectToNumber(_lblcodigo.getTag()));
RDebugUtils.currentLine=18939937;
 //BA.debugLineNum = 18939937;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18939939;
 //BA.debugLineNum = 18939939;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=18939940;
 //BA.debugLineNum = 18939940;BA.debugLine="EditandoProducto = True";
parent._editandoproducto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=18939941;
 //BA.debugLineNum = 18939941;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = parent._id_docdet;
RDebugUtils.currentLine=18939942;
 //BA.debugLineNum = 18939942;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=18939946;
 //BA.debugLineNum = 18939946;BA.debugLine="If Result = xui.DialogResponse_Negative Then";

case 14:
//if
this.state = 39;
if (_result==_xui.DialogResponse_Negative) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=18939948;
 //BA.debugLineNum = 18939948;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma l";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma la eliminación de este articulo?"),BA.ObjectToCharSequence("Código: "+_lblcodigo.getText()),"SI","","NO",parent.mostCurrent._bmp1);
RDebugUtils.currentLine=18939949;
 //BA.debugLineNum = 18939949;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 17;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=18939951;
 //BA.debugLineNum = 18939951;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18939953;
 //BA.debugLineNum = 18939953;BA.debugLine="Dim Fila_Id As Map";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18939954;
 //BA.debugLineNum = 18939954;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=18939955;
 //BA.debugLineNum = 18939955;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Con";
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18939956;
 //BA.debugLineNum = 18939956;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_fila_id);
RDebugUtils.currentLine=18939958;
 //BA.debugLineNum = 18939958;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=18939959;
 //BA.debugLineNum = 18939959;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Vari";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=18939961;
 //BA.debugLineNum = 18939961;BA.debugLine="If Fila_Dscto.IsInitialized Then";
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
RDebugUtils.currentLine=18939962;
 //BA.debugLineNum = 18939962;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuento";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=18939966;
 //BA.debugLineNum = 18939966;BA.debugLine="p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p";
_p.SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300))),_p.getTop(),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=18939967;
 //BA.debugLineNum = 18939967;BA.debugLine="Sleep(600)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"),(int) (600));
this.state = 42;
return;
case 42:
//C
this.state = 24;
;
RDebugUtils.currentLine=18939968;
 //BA.debugLineNum = 18939968;BA.debugLine="XclvDetalle.RemoveAt(Index)";
parent.mostCurrent._xclvdetalle._removeat(_index);
RDebugUtils.currentLine=18939970;
 //BA.debugLineNum = 18939970;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18939971;
 //BA.debugLineNum = 18939971;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=18939974;
 //BA.debugLineNum = 18939974;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=18939976;
 //BA.debugLineNum = 18939976;BA.debugLine="Dim	RowNumber = Cursor1.RowCount";
_rownumber = BA.NumberToString(_cursor1.getRowCount());
RDebugUtils.currentLine=18939978;
 //BA.debugLineNum = 18939978;BA.debugLine="For i = 0 To RowNumber-1";
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
RDebugUtils.currentLine=18939980;
 //BA.debugLineNum = 18939980;BA.debugLine="Try";
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
RDebugUtils.currentLine=18939981;
 //BA.debugLineNum = 18939981;BA.debugLine="Item = XclvDetalle.GetRawListItem(i)";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_i);
RDebugUtils.currentLine=18939982;
 //BA.debugLineNum = 18939982;BA.debugLine="p = Item.Panel.GetView(0)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=18939983;
 //BA.debugLineNum = 18939983;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=18939984;
 //BA.debugLineNum = 18939984;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_I";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_i+1),(int) (2),"0");
RDebugUtils.currentLine=18939985;
 //BA.debugLineNum = 18939985;BA.debugLine="LblItem.Text = \"Item: \" & ItemStr";
_lblitem.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
 if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
RDebugUtils.currentLine=18939987;
 //BA.debugLineNum = 18939987;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("618939987",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
RDebugUtils.currentLine=18939994;
 //BA.debugLineNum = 18939994;BA.debugLine="Sb_Sumar_Totales";
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
RDebugUtils.currentLine=18940002;
 //BA.debugLineNum = 18940002;BA.debugLine="End Sub";
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