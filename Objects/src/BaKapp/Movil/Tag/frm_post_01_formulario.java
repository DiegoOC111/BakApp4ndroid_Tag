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
public BaKapp.Movil.Tag.funciones _funciones = null;
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
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Activity.LoadLayout(\"Cp_Post\")";
mostCurrent._activity.LoadLayout("Cp_Post",mostCurrent.activityBA);
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="CLFx2.Initialize(Null,\"\")";
mostCurrent._clfx2._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="CLFx2.DesignerCreateView(Activity,Null,Null)";
mostCurrent._clfx2._designercreateview /*String*/ (null,(Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=20578315;
 //BA.debugLineNum = 20578315;BA.debugLine="Grabar = False";
_grabar = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\") :	b";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user_.png");
RDebugUtils.currentLine=20578318;
 //BA.debugLineNum = 20578318;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Encabezado");
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_details.png");
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"view_details.p";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"view_details_.png");
RDebugUtils.currentLine=20578321;
 //BA.debugLineNum = 20578321;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Detalle");
RDebugUtils.currentLine=20578323;
 //BA.debugLineNum = 20578323;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calc.png");
RDebugUtils.currentLine=20578323;
 //BA.debugLineNum = 20578323;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"calc.png\") :	b";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"calc_.png");
RDebugUtils.currentLine=20578324;
 //BA.debugLineNum = 20578324;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Totales");
RDebugUtils.currentLine=20578326;
 //BA.debugLineNum = 20578326;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment.png");
RDebugUtils.currentLine=20578326;
 //BA.debugLineNum = 20578326;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"comment.png\")";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment_.png");
RDebugUtils.currentLine=20578327;
 //BA.debugLineNum = 20578327;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Post";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_Observaciones");
RDebugUtils.currentLine=20578329;
 //BA.debugLineNum = 20578329;BA.debugLine="B4A_DespachoSimple = Variables.Global_Row_Configu";
_b4a_despachosimple = BA.ObjectToBoolean(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
RDebugUtils.currentLine=20578331;
 //BA.debugLineNum = 20578331;BA.debugLine="If B4A_DespachoSimple Then";
if (_b4a_despachosimple) { 
RDebugUtils.currentLine=20578333;
 //BA.debugLineNum = 20578333;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"delivery.png");
RDebugUtils.currentLine=20578333;
 //BA.debugLineNum = 20578333;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"delivery.png\"";
mostCurrent._bmp2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"delivery_.png");
RDebugUtils.currentLine=20578334;
 //BA.debugLineNum = 20578334;BA.debugLine="Tab_Post.AddTabWithIcon (\"\", bmp2, bmp1, \"Cp_Pos";
mostCurrent._tab_post.AddTabWithIcon(mostCurrent.activityBA,"",(android.graphics.Bitmap)(mostCurrent._bmp2.getObject()),(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),"Cp_Post_01_DespSimple");
 };
RDebugUtils.currentLine=20578339;
 //BA.debugLineNum = 20578339;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
mostCurrent._cl_permisox._initialize /*String*/ (null,mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=20578340;
 //BA.debugLineNum = 20578340;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
mostCurrent._cl_permisox._designercreateview /*String*/ (null,(Object)(mostCurrent._activity.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=20578342;
 //BA.debugLineNum = 20578342;BA.debugLine="Tab_Post.CurrentTab = 1";
mostCurrent._tab_post.setCurrentTab((int) (1));
RDebugUtils.currentLine=20578344;
 //BA.debugLineNum = 20578344;BA.debugLine="InputTemplate.Initialize";
mostCurrent._inputtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=20578345;
 //BA.debugLineNum = 20578345;BA.debugLine="LongTextTemplate.Initialize";
mostCurrent._longtexttemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=20578346;
 //BA.debugLineNum = 20578346;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=20578348;
 //BA.debugLineNum = 20578348;BA.debugLine="DespSimple_DocDestino.Initialize";
mostCurrent._despsimple_docdestino._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=20578349;
 //BA.debugLineNum = 20578349;BA.debugLine="DespSimple_Tipo.Initialize";
mostCurrent._despsimple_tipo._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=20578350;
 //BA.debugLineNum = 20578350;BA.debugLine="DespSimple_TipoPago.Initialize";
mostCurrent._despsimple_tipopago._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=20578352;
 //BA.debugLineNum = 20578352;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20578353;
 //BA.debugLineNum = 20578353;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=20578355;
 //BA.debugLineNum = 20578355;BA.debugLine="For Each Fila As Map In Variables.Global_Listas_P";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group34 = mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen34 = group34.getSize()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group34.Get(index34)));
RDebugUtils.currentLine=20578356;
 //BA.debugLineNum = 20578356;BA.debugLine="Dim Nokolt As String = Fila.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_fila.Get((Object)("Nokolt")));
RDebugUtils.currentLine=20578357;
 //BA.debugLineNum = 20578357;BA.debugLine="Dim Name As String = Nokolt.Trim";
_name = _nokolt.trim();
RDebugUtils.currentLine=20578358;
 //BA.debugLineNum = 20578358;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=20578360;
 //BA.debugLineNum = 20578360;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=20578361;
 //BA.debugLineNum = 20578361;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=20578363;
 //BA.debugLineNum = 20578363;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group41 = mostCurrent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen41 = group41.getSize()
;int index41 = 0;
;
for (; index41 < groupLen41;index41++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group41.Get(index41)));
RDebugUtils.currentLine=20578365;
 //BA.debugLineNum = 20578365;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=20578366;
 //BA.debugLineNum = 20578366;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
RDebugUtils.currentLine=20578367;
 //BA.debugLineNum = 20578367;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=20578369;
 //BA.debugLineNum = 20578369;BA.debugLine="DespSimple_DocDestino.SetItems(Items)";
mostCurrent._despsimple_docdestino._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=20578370;
 //BA.debugLineNum = 20578370;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=20578372;
 //BA.debugLineNum = 20578372;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group48 = mostCurrent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen48 = group48.getSize()
;int index48 = 0;
;
for (; index48 < groupLen48;index48++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group48.Get(index48)));
RDebugUtils.currentLine=20578374;
 //BA.debugLineNum = 20578374;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=20578375;
 //BA.debugLineNum = 20578375;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
RDebugUtils.currentLine=20578376;
 //BA.debugLineNum = 20578376;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=20578378;
 //BA.debugLineNum = 20578378;BA.debugLine="DespSimple_Tipo.SetItems(Items)";
mostCurrent._despsimple_tipo._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=20578379;
 //BA.debugLineNum = 20578379;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=20578381;
 //BA.debugLineNum = 20578381;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_Desp";
_fila = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group55 = mostCurrent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen55 = group55.getSize()
;int index55 = 0;
;
for (; index55 < groupLen55;index55++){
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group55.Get(index55)));
RDebugUtils.currentLine=20578383;
 //BA.debugLineNum = 20578383;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreTab";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=20578384;
 //BA.debugLineNum = 20578384;BA.debugLine="Dim Name As String = NombreTabla.Trim";
_name = _nombretabla.trim();
RDebugUtils.currentLine=20578385;
 //BA.debugLineNum = 20578385;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=20578387;
 //BA.debugLineNum = 20578387;BA.debugLine="DespSimple_TipoPago.SetItems(Items)";
mostCurrent._despsimple_tipopago._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=20578388;
 //BA.debugLineNum = 20578388;BA.debugLine="Items.Clear";
_items.Clear();
RDebugUtils.currentLine=20578390;
 //BA.debugLineNum = 20578390;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _vsalir = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="Private vSalir As Int";
_vsalir = 0;
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"exit.png\")";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"exit.png");
RDebugUtils.currentLine=21102601;
 //BA.debugLineNum = 21102601;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de salir de la v";
_vsalir = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("¿Estas seguro de salir de la venta?"),BA.ObjectToCharSequence("S A L I R"),"Si","","No",(android.graphics.Bitmap)(mostCurrent._bmp1.getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
if (_vsalir==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=21102604;
 //BA.debugLineNum = 21102604;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=21102606;
 //BA.debugLineNum = 21102606;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc))));
RDebugUtils.currentLine=21102609;
 //BA.debugLineNum = 21102609;BA.debugLine="If Crear_NVV_Desde_COV Or Editar_Documento Or C";
if (_crear_nvv_desde_cov || _editar_documento || _cursor1.getRowCount()==0) { 
RDebugUtils.currentLine=21102611;
 //BA.debugLineNum = 21102611;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Encabezado_Doc","Id_DocEnc");
RDebugUtils.currentLine=21102612;
 //BA.debugLineNum = 21102612;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Detalle_Doc","Id_DocEnc");
RDebugUtils.currentLine=21102613;
 //BA.debugLineNum = 21102613;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Descuentos_Doc","Id_DocEnc");
RDebugUtils.currentLine=21102614;
 //BA.debugLineNum = 21102614;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Impuestos_Doc","Id_DocEnc");
RDebugUtils.currentLine=21102615;
 //BA.debugLineNum = 21102615;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"Observaciones_Doc","Id_DocEnc");
RDebugUtils.currentLine=21102616;
 //BA.debugLineNum = 21102616;BA.debugLine="Funciones.Sb_Borrar_Todos_Registros_De_Tabla(\"";
mostCurrent._funciones._sb_borrar_todos_registros_de_tabla /*String*/ (mostCurrent.activityBA,"DespaFacil_Doc","Id_DocEnc");
 }else {
RDebugUtils.currentLine=21102620;
 //BA.debugLineNum = 21102620;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
 };
RDebugUtils.currentLine=21102624;
 //BA.debugLineNum = 21102624;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=21102626;
 //BA.debugLineNum = 21102626;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=21102630;
 //BA.debugLineNum = 21102630;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21102632;
 //BA.debugLineNum = 21102632;BA.debugLine="End Sub";
return false;
}
public static String  _sb_grabarobservacionesdespachos() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb_grabarobservacionesdespachos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb_grabarobservacionesdespachos", null));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Private Sub Sb_GrabarObservacionesDespachos";
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="If  Not(Txt_ObservacionesDesp.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._txt_observacionesdesp.IsInitialized())) { 
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="If Txt_ObservacionesDesp.Visible Then";
if (mostCurrent._txt_observacionesdesp.getVisible()) { 
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="Txt_Observaciones.Text = Txt_ObservacionesDesp.T";
mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(mostCurrent._txt_observacionesdesp.getText()));
 };
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="Fila_Observaciones.Put(\"Observaciones\",Txt_Observ";
_fila_observaciones.Put((Object)("Observaciones"),(Object)(mostCurrent._txt_observaciones.getText()));
RDebugUtils.currentLine=23592971;
 //BA.debugLineNum = 23592971;BA.debugLine="Fila_Observaciones.Put(\"Orden_compra\",Txt_Orden_c";
_fila_observaciones.Put((Object)("Orden_compra"),(Object)(mostCurrent._txt_orden_compra.getText()));
RDebugUtils.currentLine=23592972;
 //BA.debugLineNum = 23592972;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observacion";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Observaciones_Doc",_fila_observaciones,mostCurrent._fila_idenc);
RDebugUtils.currentLine=23592974;
 //BA.debugLineNum = 23592974;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\",Lbl_TipoDes";
_fila_despafacil.Put((Object)("CodTipoDespacho"),mostCurrent._lbl_tipodespacho.getTag());
RDebugUtils.currentLine=23592975;
 //BA.debugLineNum = 23592975;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\",Lbl_TipoDespac";
_fila_despafacil.Put((Object)("TipoDespacho"),(Object)(mostCurrent._lbl_tipodespacho.getText()));
RDebugUtils.currentLine=23592976;
 //BA.debugLineNum = 23592976;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\",Lbl_TipoPag";
_fila_despafacil.Put((Object)("CodTipoPagoDesp"),mostCurrent._lbl_tipopagodesp.getTag());
RDebugUtils.currentLine=23592977;
 //BA.debugLineNum = 23592977;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\",Lbl_TipoPagoDe";
_fila_despafacil.Put((Object)("TipoPagoDesp"),(Object)(mostCurrent._lbl_tipopagodesp.getText()));
RDebugUtils.currentLine=23592978;
 //BA.debugLineNum = 23592978;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\",Lbl_CodDocDes";
_fila_despafacil.Put((Object)("CodDocDestino"),mostCurrent._lbl_coddocdestino.getTag());
RDebugUtils.currentLine=23592979;
 //BA.debugLineNum = 23592979;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\",Lbl_CodDocDestin";
_fila_despafacil.Put((Object)("DocDestino"),(Object)(mostCurrent._lbl_coddocdestino.getText()));
RDebugUtils.currentLine=23592980;
 //BA.debugLineNum = 23592980;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\",Txt_Transpor";
_fila_despafacil.Put((Object)("TransporteDesp"),(Object)(mostCurrent._txt_transportedesp.getText()));
RDebugUtils.currentLine=23592981;
 //BA.debugLineNum = 23592981;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\",Txt_Direccion";
_fila_despafacil.Put((Object)("DireccionDesp"),(Object)(mostCurrent._txt_direcciondesp.getText()));
RDebugUtils.currentLine=23592982;
 //BA.debugLineNum = 23592982;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\",Txt_Obser";
_fila_despafacil.Put((Object)("ObservacionesDesp"),(Object)(mostCurrent._txt_observacionesdesp.getText()));
RDebugUtils.currentLine=23592983;
 //BA.debugLineNum = 23592983;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFacil_";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"DespaFacil_Doc",_fila_despafacil,mostCurrent._fila_idenc);
RDebugUtils.currentLine=23592985;
 //BA.debugLineNum = 23592985;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="Hay_Descuentos_Globales = False";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "activity_resume"), _sb_titulo());
this.state = 37;
return;
case 37:
//C
this.state = 1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="If Cambiar_Entidad Then";
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
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Tr";
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643848;
 //BA.debugLineNum = 20643848;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="Cambiar_Entidad = False";
parent._cambiar_entidad = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=20643853;
 //BA.debugLineNum = 20643853;BA.debugLine="If BuscandoProducto Then";

case 4:
//if
this.state = 11;
if (parent._buscandoproducto) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=20643854;
 //BA.debugLineNum = 20643854;BA.debugLine="If Not(Buscar_productos.Msj.EsCorrecto) Then";
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
RDebugUtils.currentLine=20643855;
 //BA.debugLineNum = 20643855;BA.debugLine="BuscandoProducto = False";
parent._buscandoproducto = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643856;
 //BA.debugLineNum = 20643856;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=20643860;
 //BA.debugLineNum = 20643860;BA.debugLine="If BuscandoEntidad Then";

case 11:
//if
this.state = 18;
if (parent._buscandoentidad) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=20643861;
 //BA.debugLineNum = 20643861;BA.debugLine="If Not(Buscar_entidad.Msj.EsCorrecto) Then";
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
RDebugUtils.currentLine=20643862;
 //BA.debugLineNum = 20643862;BA.debugLine="BuscandoEntidad = False";
parent._buscandoentidad = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643863;
 //BA.debugLineNum = 20643863;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
RDebugUtils.currentLine=20643867;
 //BA.debugLineNum = 20643867;BA.debugLine="If EditandoProducto Then";

case 18:
//if
this.state = 25;
if (parent._editandoproducto) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=20643868;
 //BA.debugLineNum = 20643868;BA.debugLine="EditandoProducto = False";
parent._editandoproducto = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643869;
 //BA.debugLineNum = 20643869;BA.debugLine="If Not(Frm_Post_01_Producto.Msj.EsCorrecto) Then";
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
RDebugUtils.currentLine=20643870;
 //BA.debugLineNum = 20643870;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;
;
RDebugUtils.currentLine=20643874;
 //BA.debugLineNum = 20643874;BA.debugLine="If Id_DocEnc = 0 Or Nuevo_Documento Then";

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
RDebugUtils.currentLine=20643876;
 //BA.debugLineNum = 20643876;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=20643877;
 //BA.debugLineNum = 20643877;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20643879;
 //BA.debugLineNum = 20643879;BA.debugLine="If Not(Fila_Encabezado.IsInitialized) Then";
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
RDebugUtils.currentLine=20643880;
 //BA.debugLineNum = 20643880;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=20643882;
 //BA.debugLineNum = 20643882;BA.debugLine="Wait For (Sb_Cargar_Documento(True)) Complete (";
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
RDebugUtils.currentLine=20643887;
 //BA.debugLineNum = 20643887;BA.debugLine="Wait For (Sb_Cargar_Documento(False)) Complete (";
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
RDebugUtils.currentLine=20643891;
 //BA.debugLineNum = 20643891;BA.debugLine="Txt_Codigo.Text = \"\"";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20643892;
 //BA.debugLineNum = 20643892;BA.debugLine="Lbl_Items.Text = \"Total Items: 0\"";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence("Total Items: 0"));
RDebugUtils.currentLine=20643894;
 //BA.debugLineNum = 20643894;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
parent.mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=20643896;
 //BA.debugLineNum = 20643896;BA.debugLine="Sb_Cargar_Detalle(True)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643898;
 //BA.debugLineNum = 20643898;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Activity.Title = \"New Doc...\" & Variables.Gl_Sucu";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("New Doc..."+parent.mostCurrent._variables._gl_sucursal /*String*/ ));
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="If Crear_NVV_Desde_COV Then";
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
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="Activity.Title = \"NVV desde COV: \" & Nudo_Origen";
parent.mostCurrent._activity.setTitle(BA.ObjectToCharSequence("NVV desde COV: "+parent._nudo_origen));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="If Editar_Documento Then";
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
RDebugUtils.currentLine=20709384;
 //BA.debugLineNum = 20709384;BA.debugLine="Activity.Title = \"Editando: \" & TipoDoc & \"-\" &";
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
RDebugUtils.currentLine=20709388;
 //BA.debugLineNum = 20709388;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=20709389;
 //BA.debugLineNum = 20709389;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="ProgressDialogShow(\"Actualizando datos de la enti";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando datos de la entidad..."));
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=21954569;
 //BA.debugLineNum = 21954569;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=21954570;
 //BA.debugLineNum = 21954570;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=21954571;
 //BA.debugLineNum = 21954571;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=21954572;
 //BA.debugLineNum = 21954572;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=21954574;
 //BA.debugLineNum = 21954574;BA.debugLine="Dim Cuotas As Int = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=21954575;
 //BA.debugLineNum = 21954575;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=21954576;
 //BA.debugLineNum = 21954576;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=21954577;
 //BA.debugLineNum = 21954577;BA.debugLine="Dim Forma_pago As String";
_forma_pago = "";
RDebugUtils.currentLine=21954579;
 //BA.debugLineNum = 21954579;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21954580;
 //BA.debugLineNum = 21954580;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21954581;
 //BA.debugLineNum = 21954581;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
parent._fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21954582;
 //BA.debugLineNum = 21954582;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
parent._fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21954583;
 //BA.debugLineNum = 21954583;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21954585;
 //BA.debugLineNum = 21954585;BA.debugLine="Dim Lista As String";
_lista = "";
RDebugUtils.currentLine=21954586;
 //BA.debugLineNum = 21954586;BA.debugLine="Dim Permiso As String";
_permiso = "";
RDebugUtils.currentLine=21954588;
 //BA.debugLineNum = 21954588;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
_listaprecios = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=21954589;
 //BA.debugLineNum = 21954589;BA.debugLine="Lista = ListaPrecios";
_lista = _listaprecios;
RDebugUtils.currentLine=21954591;
 //BA.debugLineNum = 21954591;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
_cuotas = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("NUVECR"))));
RDebugUtils.currentLine=21954592;
 //BA.debugLineNum = 21954592;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
_dias_1er_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIPRVE"))));
RDebugUtils.currentLine=21954593;
 //BA.debugLineNum = 21954593;BA.debugLine="Dias_Vencimiento = Funciones.Fx_NuloPorNro(RowEnt";
_dias_vencimiento = (int)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,_rowentidad.Get((Object)("DIASVENCI")),0)));
RDebugUtils.currentLine=21954595;
 //BA.debugLineNum = 21954595;BA.debugLine="Dim Rut As String";
_rut = "";
RDebugUtils.currentLine=21954597;
 //BA.debugLineNum = 21954597;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),_rowentidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=21954598;
 //BA.debugLineNum = 21954598;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),_rowentidad.Get((Object)("SUEN")));
RDebugUtils.currentLine=21954599;
 //BA.debugLineNum = 21954599;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),_rowentidad.Get((Object)("NOKOEN")));
RDebugUtils.currentLine=21954601;
 //BA.debugLineNum = 21954601;BA.debugLine="Lbl_CodEntidad.Text = RowEntidad.Get(\"KOEN\")";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("KOEN"))));
RDebugUtils.currentLine=21954602;
 //BA.debugLineNum = 21954602;BA.debugLine="Lbl_CodSucEntidad.Text = RowEntidad.Get(\"SUEN\")";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("SUEN"))));
RDebugUtils.currentLine=21954603;
 //BA.debugLineNum = 21954603;BA.debugLine="Lbl_Rut.Text = RowEntidad.Get(\"Rut\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("Rut"))));
RDebugUtils.currentLine=21954604;
 //BA.debugLineNum = 21954604;BA.debugLine="Lbl_Nombre.Text = RowEntidad.Get(\"NOKOEN\")";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("NOKOEN"))));
RDebugUtils.currentLine=21954605;
 //BA.debugLineNum = 21954605;BA.debugLine="Lbl_Direccion.Text = RowEntidad.Get(\"DIEN\")";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("DIEN"))));
RDebugUtils.currentLine=21954606;
 //BA.debugLineNum = 21954606;BA.debugLine="Lbl_Ciudad.Text = RowEntidad.Get(\"CIUDAD\")";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("CIUDAD"))));
RDebugUtils.currentLine=21954607;
 //BA.debugLineNum = 21954607;BA.debugLine="Lbl_Comuna.Text = RowEntidad.Get(\"COMUNA\")";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(_rowentidad.Get((Object)("COMUNA"))));
RDebugUtils.currentLine=21954609;
 //BA.debugLineNum = 21954609;BA.debugLine="If ActualizarListaPrecio Then";
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
RDebugUtils.currentLine=21954610;
 //BA.debugLineNum = 21954610;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
_lista = BA.ObjectToString(_rowentidad.Get((Object)("LVEN")));
RDebugUtils.currentLine=21954611;
 //BA.debugLineNum = 21954611;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
_lista = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,_lista,(int) (6),(int) (3));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21954614;
 //BA.debugLineNum = 21954614;BA.debugLine="Permiso = \"Lp-\" & Lista";
_permiso = "Lp-"+_lista;
RDebugUtils.currentLine=21954616;
 //BA.debugLineNum = 21954616;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
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
RDebugUtils.currentLine=21954618;
 //BA.debugLineNum = 21954618;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
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
RDebugUtils.currentLine=21954619;
 //BA.debugLineNum = 21954619;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 if (true) break;
;
RDebugUtils.currentLine=21954622;
 //BA.debugLineNum = 21954622;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";

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
RDebugUtils.currentLine=21954624;
 //BA.debugLineNum = 21954624;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=21954625;
 //BA.debugLineNum = 21954625;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=21954627;
 //BA.debugLineNum = 21954627;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
_fechasvenci = _fechaemision;
RDebugUtils.currentLine=21954628;
 //BA.debugLineNum = 21954628;BA.debugLine="Dim dias As Int";
_dias = 0;
RDebugUtils.currentLine=21954630;
 //BA.debugLineNum = 21954630;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
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
RDebugUtils.currentLine=21954632;
 //BA.debugLineNum = 21954632;BA.debugLine="dias = Dias_1er_Vencimiento";
_dias = _dias_1er_vencimiento;
RDebugUtils.currentLine=21954634;
 //BA.debugLineNum = 21954634;BA.debugLine="For i = 1 To Cuotas";
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
RDebugUtils.currentLine=21954636;
 //BA.debugLineNum = 21954636;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
_fechasvenci = anywheresoftware.b4a.keywords.Common.DateTime.Add(_fechasvenci,(int) (0),(int) (0),_dias);
RDebugUtils.currentLine=21954637;
 //BA.debugLineNum = 21954637;BA.debugLine="If i = 1 Then";
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
RDebugUtils.currentLine=21954638;
 //BA.debugLineNum = 21954638;BA.debugLine="Fecha_1er_Vencimiento = FechasVenci";
_fecha_1er_vencimiento = _fechasvenci;
 if (true) break;

case 26:
//C
this.state = 70;
;
RDebugUtils.currentLine=21954641;
 //BA.debugLineNum = 21954641;BA.debugLine="dias = Dias_Vencimiento";
_dias = _dias_vencimiento;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
;
RDebugUtils.currentLine=21954645;
 //BA.debugLineNum = 21954645;BA.debugLine="FechaUltVencimiento = FechasVenci";
_fechaultvencimiento = _fechasvenci;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=21954648;
 //BA.debugLineNum = 21954648;BA.debugLine="Cuotas = 1";
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
RDebugUtils.currentLine=21954653;
 //BA.debugLineNum = 21954653;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=21954654;
 //BA.debugLineNum = 21954654;BA.debugLine="FechaUltVencimiento = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=21954655;
 //BA.debugLineNum = 21954655;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=21954656;
 //BA.debugLineNum = 21954656;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=21954657;
 //BA.debugLineNum = 21954657;BA.debugLine="Dias_Vencimiento = 0";
_dias_vencimiento = (int) (0);
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=21954661;
 //BA.debugLineNum = 21954661;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
_forma_pago = BA.ObjectToString(_rowentidad.Get((Object)("CPEN")));
RDebugUtils.currentLine=21954663;
 //BA.debugLineNum = 21954663;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
parent._fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=21954664;
 //BA.debugLineNum = 21954664;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=21954665;
 //BA.debugLineNum = 21954665;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
parent._fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=21954666;
 //BA.debugLineNum = 21954666;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=21954668;
 //BA.debugLineNum = 21954668;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
parent._fila_encabezado.Put((Object)("Cuotas"),(Object)(_cuotas));
RDebugUtils.currentLine=21954669;
 //BA.debugLineNum = 21954669;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento"),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=21954670;
 //BA.debugLineNum = 21954670;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento"),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=21954672;
 //BA.debugLineNum = 21954672;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
parent._fila_observaciones.Put((Object)("Forma_pago"),(Object)(_forma_pago));
RDebugUtils.currentLine=21954674;
 //BA.debugLineNum = 21954674;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
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
RDebugUtils.currentLine=21954676;
 //BA.debugLineNum = 21954676;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean";
_tiene_permiso_lista = false;
RDebugUtils.currentLine=21954677;
 //BA.debugLineNum = 21954677;BA.debugLine="Dim Cambiar_lista As Boolean";
_cambiar_lista = false;
RDebugUtils.currentLine=21954678;
 //BA.debugLineNum = 21954678;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
_mostrar_mensaje_cambio_lista = false;
RDebugUtils.currentLine=21954681;
 //BA.debugLineNum = 21954681;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
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
RDebugUtils.currentLine=21954682;
 //BA.debugLineNum = 21954682;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=21954683;
 //BA.debugLineNum = 21954683;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
_value = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=21954685;
 //BA.debugLineNum = 21954685;BA.debugLine="If Lista = value Then";
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
RDebugUtils.currentLine=21954686;
 //BA.debugLineNum = 21954686;BA.debugLine="Tiene_Permiso_Lista = True";
_tiene_permiso_lista = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21954687;
 //BA.debugLineNum = 21954687;BA.debugLine="Exit";
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
RDebugUtils.currentLine=21954692;
 //BA.debugLineNum = 21954692;BA.debugLine="If Tiene_Permiso_Lista Then";

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
RDebugUtils.currentLine=21954693;
 //BA.debugLineNum = 21954693;BA.debugLine="Cambiar_lista = True";
_cambiar_lista = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=21954696;
 //BA.debugLineNum = 21954696;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=21954698;
 //BA.debugLineNum = 21954698;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Usted no tiene permiso para trabajar con la lista: "+_lista+anywheresoftware.b4a.keywords.Common.CRLF+"La lista seguirá siendo:"+_listaprecios),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=21954703;
 //BA.debugLineNum = 21954703;BA.debugLine="If Cambiar_lista Then";

case 49:
//if
this.state = 52;
if (_cambiar_lista) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=21954704;
 //BA.debugLineNum = 21954704;BA.debugLine="ListaPrecios = Lista";
_listaprecios = _lista;
RDebugUtils.currentLine=21954705;
 //BA.debugLineNum = 21954705;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
RDebugUtils.currentLine=21954710;
 //BA.debugLineNum = 21954710;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";

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
RDebugUtils.currentLine=21954712;
 //BA.debugLineNum = 21954712;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=21954713;
 //BA.debugLineNum = 21954713;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=21954714;
 //BA.debugLineNum = 21954714;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
RDebugUtils.currentLine=21954716;
 //BA.debugLineNum = 21954716;BA.debugLine="If Lista = Kolt Then";
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
RDebugUtils.currentLine=21954717;
 //BA.debugLineNum = 21954717;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(_nokolt));
RDebugUtils.currentLine=21954718;
 //BA.debugLineNum = 21954718;BA.debugLine="Exit";
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
RDebugUtils.currentLine=21954725;
 //BA.debugLineNum = 21954725;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
_bloqueado = BA.ObjectToBoolean(_rowentidad.Get((Object)("BLOQUEADO")));
RDebugUtils.currentLine=21954727;
 //BA.debugLineNum = 21954727;BA.debugLine="If Bloqueado Then";
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
RDebugUtils.currentLine=21954729;
 //BA.debugLineNum = 21954729;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=21954731;
 //BA.debugLineNum = 21954731;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡CLIENTE BLOQUEADO!"+anywheresoftware.b4a.keywords.Common.CRLF+"Solo es posible generar cotizaciones"),BA.ObjectToCharSequence("CLIENTE MOROSO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=21954736;
 //BA.debugLineNum = 21954736;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=21954737;
 //BA.debugLineNum = 21954737;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
RDebugUtils.currentLine=21954738;
 //BA.debugLineNum = 21954738;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
RDebugUtils.currentLine=21954740;
 //BA.debugLineNum = 21954740;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas"))));
RDebugUtils.currentLine=21954741;
 //BA.debugLineNum = 21954741;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento"))));
RDebugUtils.currentLine=21954742;
 //BA.debugLineNum = 21954742;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento"))));
RDebugUtils.currentLine=21954744;
 //BA.debugLineNum = 21954744;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
RDebugUtils.currentLine=21954746;
 //BA.debugLineNum = 21954746;BA.debugLine="If ActualizarListaPrecio And B4A_DespachoSimple T";
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
RDebugUtils.currentLine=21954748;
 //BA.debugLineNum = 21954748;BA.debugLine="Wait For(Sb_Trae_Secueven(Secueven)) Complete (v";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_actualizar_datos_de_la_entidad"), _sb_trae_secueven(_secueven));
this.state = 75;
return;
case 75:
//C
this.state = 68;
_vtidonudo = (BaKapp.Movil.Tag.tidonudo) result[0];
;
RDebugUtils.currentLine=21954750;
 //BA.debugLineNum = 21954750;BA.debugLine="Lbl_CodDocDestino.Tag = vTidoNudo.Tido";
parent.mostCurrent._lbl_coddocdestino.setTag((Object)(_vtidonudo._tido /*String*/ ));
RDebugUtils.currentLine=21954751;
 //BA.debugLineNum = 21954751;BA.debugLine="Lbl_CodDocDestino.Text = vTidoNudo.Notido";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(_vtidonudo._notido /*String*/ ));
RDebugUtils.currentLine=21954753;
 //BA.debugLineNum = 21954753;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
 if (true) break;

case 68:
//C
this.state = -1;
;
RDebugUtils.currentLine=21954757;
 //BA.debugLineNum = 21954757;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_actualizar_datos_de_la_entidad"), _sb_visibleocultardespachosimple());
this.state = 76;
return;
case 76:
//C
this.state = -1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=21954759;
 //BA.debugLineNum = 21954759;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21954761;
 //BA.debugLineNum = 21954761;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub Sb_Nuevo_Documento";
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="ProgressDialogShow(\"Preparando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Preparando..."));
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
mostCurrent._consulta_sql = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?";
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
RDebugUtils.currentLine=21823510;
 //BA.debugLineNum = 21823510;BA.debugLine="Consulta_Sql = \"Delete From [Detalle_Doc] Where I";
mostCurrent._consulta_sql = "Delete From [Detalle_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=21823511;
 //BA.debugLineNum = 21823511;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=21823513;
 //BA.debugLineNum = 21823513;BA.debugLine="Consulta_Sql = \"Delete From [Descuentos_Doc] Wher";
mostCurrent._consulta_sql = "Delete From [Descuentos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=21823514;
 //BA.debugLineNum = 21823514;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=21823516;
 //BA.debugLineNum = 21823516;BA.debugLine="Consulta_Sql = \"Delete From [Impuestos_Doc] Where";
mostCurrent._consulta_sql = "Delete From [Impuestos_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=21823517;
 //BA.debugLineNum = 21823517;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=21823519;
 //BA.debugLineNum = 21823519;BA.debugLine="Consulta_Sql = \"Delete From [Observaciones_Doc] W";
mostCurrent._consulta_sql = "Delete From [Observaciones_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=21823520;
 //BA.debugLineNum = 21823520;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=21823522;
 //BA.debugLineNum = 21823522;BA.debugLine="Consulta_Sql = \"Delete From [DespaFacil_Doc] Wher";
mostCurrent._consulta_sql = "Delete From [DespaFacil_Doc] Where Id_DocEnc Not In (Select Id_DocEnc From Encabezado_Doc)";
RDebugUtils.currentLine=21823523;
 //BA.debugLineNum = 21823523;BA.debugLine="Variables.vSql.ExecNonQuery(Consulta_Sql)";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._consulta_sql);
RDebugUtils.currentLine=21823525;
 //BA.debugLineNum = 21823525;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Confi";
mostCurrent._variables._gl_empresa /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
RDebugUtils.currentLine=21823526;
 //BA.debugLineNum = 21823526;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Conf";
mostCurrent._variables._gl_sucursal /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
RDebugUtils.currentLine=21823527;
 //BA.debugLineNum = 21823527;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Config";
mostCurrent._variables._gl_bodega /*String*/  = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
RDebugUtils.currentLine=21823530;
 //BA.debugLineNum = 21823530;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
mostCurrent._consulta_sql = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)";
RDebugUtils.currentLine=21823531;
 //BA.debugLineNum = 21823531;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(mostCurrent._variables._gl_modalidad /*String*/ ),(Object)(mostCurrent._variables._gl_empresa /*String*/ ),(Object)(mostCurrent._variables._gl_sucursal /*String*/ )}));
RDebugUtils.currentLine=21823534;
 //BA.debugLineNum = 21823534;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=21823535;
 //BA.debugLineNum = 21823535;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
_fila_encabezado = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21823538;
 //BA.debugLineNum = 21823538;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=21823541;
 //BA.debugLineNum = 21823541;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
RDebugUtils.currentLine=21823542;
 //BA.debugLineNum = 21823542;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
mostCurrent._fila_idenc = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21823545;
 //BA.debugLineNum = 21823545;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
mostCurrent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=21823546;
 //BA.debugLineNum = 21823546;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id_docenc)}));
RDebugUtils.currentLine=21823549;
 //BA.debugLineNum = 21823549;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
RDebugUtils.currentLine=21823550;
 //BA.debugLineNum = 21823550;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
_fila_observaciones = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21823552;
 //BA.debugLineNum = 21823552;BA.debugLine="Txt_Observaciones.Text = \"\"";
mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823553;
 //BA.debugLineNum = 21823553;BA.debugLine="Txt_Orden_compra.Text = \"\"";
mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823556;
 //BA.debugLineNum = 21823556;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_Do";
mostCurrent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=21823557;
 //BA.debugLineNum = 21823557;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id_docenc)}));
RDebugUtils.currentLine=21823559;
 //BA.debugLineNum = 21823559;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc);
RDebugUtils.currentLine=21823560;
 //BA.debugLineNum = 21823560;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
_fila_despafacil = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21823562;
 //BA.debugLineNum = 21823562;BA.debugLine="If B4A_DespachoSimple Then";
if (_b4a_despachosimple) { 
RDebugUtils.currentLine=21823564;
 //BA.debugLineNum = 21823564;BA.debugLine="Lbl_TipoDespacho.Tag = 0";
mostCurrent._lbl_tipodespacho.setTag((Object)(0));
RDebugUtils.currentLine=21823565;
 //BA.debugLineNum = 21823565;BA.debugLine="Lbl_TipoDespacho.Text = \"\"";
mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823566;
 //BA.debugLineNum = 21823566;BA.debugLine="Lbl_TipoPagoDesp.Tag =  0";
mostCurrent._lbl_tipopagodesp.setTag((Object)(0));
RDebugUtils.currentLine=21823567;
 //BA.debugLineNum = 21823567;BA.debugLine="Lbl_TipoPagoDesp.Text = \"\"";
mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823568;
 //BA.debugLineNum = 21823568;BA.debugLine="Txt_TransporteDesp.Text = \"\"";
mostCurrent._txt_transportedesp.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823569;
 //BA.debugLineNum = 21823569;BA.debugLine="Lbl_CodDocDestino.Tag =  \"\"";
mostCurrent._lbl_coddocdestino.setTag((Object)(""));
RDebugUtils.currentLine=21823570;
 //BA.debugLineNum = 21823570;BA.debugLine="Lbl_CodDocDestino.Text = \"\"";
mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823571;
 //BA.debugLineNum = 21823571;BA.debugLine="Txt_DireccionDesp.Text = \"\"";
mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823572;
 //BA.debugLineNum = 21823572;BA.debugLine="Txt_ObservacionesDesp.Text = \"\"";
mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=21823576;
 //BA.debugLineNum = 21823576;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("221823576","Documento cargado... Id_DocEnc = "+BA.NumberToString(_id_docenc),0);
RDebugUtils.currentLine=21823578;
 //BA.debugLineNum = 21823578;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=21823581;
 //BA.debugLineNum = 21823581;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=21823582;
 //BA.debugLineNum = 21823582;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=21823583;
 //BA.debugLineNum = 21823583;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=21823584;
 //BA.debugLineNum = 21823584;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=21823588;
 //BA.debugLineNum = 21823588;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(FechaEmisio";
mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=21823589;
 //BA.debugLineNum = 21823589;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fe";
mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=21823590;
 //BA.debugLineNum = 21823590;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fech";
mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(_fechaemision)));
RDebugUtils.currentLine=21823592;
 //BA.debugLineNum = 21823592;BA.debugLine="Dim Cuotas As Int = 0";
_cuotas = (int) (0);
RDebugUtils.currentLine=21823593;
 //BA.debugLineNum = 21823593;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=21823594;
 //BA.debugLineNum = 21823594;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=21823595;
 //BA.debugLineNum = 21823595;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
_forma_de_pago = "";
RDebugUtils.currentLine=21823597;
 //BA.debugLineNum = 21823597;BA.debugLine="Dim Centro_Costo As String";
_centro_costo = "";
RDebugUtils.currentLine=21823599;
 //BA.debugLineNum = 21823599;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
_moneda_doc = BA.ObjectToString(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=21823600;
 //BA.debugLineNum = 21823600;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
_valor_dolar = (double)(BA.ObjectToNumber(mostCurrent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=21823601;
 //BA.debugLineNum = 21823601;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
_tasadorig_doc = (double)(BA.ObjectToNumber(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=21823602;
 //BA.debugLineNum = 21823602;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
_tipomoneda = BA.ObjectToString(mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=21823605;
 //BA.debugLineNum = 21823605;BA.debugLine="Dim ListaPrecios As String";
_listaprecios = "";
RDebugUtils.currentLine=21823607;
 //BA.debugLineNum = 21823607;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
_newnrodocumento = "NEWXXXXXXX";
RDebugUtils.currentLine=21823609;
 //BA.debugLineNum = 21823609;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
_docen_neto_bruto = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_TipoValor_Bruto_Neto")));
RDebugUtils.currentLine=21823611;
 //BA.debugLineNum = 21823611;BA.debugLine="If DocEn_Neto_Bruto = \"N\" Then";
if ((_docen_neto_bruto).equals("N")) { 
RDebugUtils.currentLine=21823612;
 //BA.debugLineNum = 21823612;BA.debugLine="Chk_Valores_Netos.Checked = True";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21823614;
 //BA.debugLineNum = 21823614;BA.debugLine="Chk_Valores_Netos.Checked = False";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21823617;
 //BA.debugLineNum = 21823617;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
_centro_costo = "LUVTVEN";
RDebugUtils.currentLine=21823618;
 //BA.debugLineNum = 21823618;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
_centro_costo = BA.ObjectToString(mostCurrent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_centro_costo)));
RDebugUtils.currentLine=21823620;
 //BA.debugLineNum = 21823620;BA.debugLine="Lbl_Centro_Costo.Text = Centro_Costo";
mostCurrent._lbl_centro_costo.setText(BA.ObjectToCharSequence(_centro_costo));
RDebugUtils.currentLine=21823622;
 //BA.debugLineNum = 21823622;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
_listaprecios = mostCurrent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=21823624;
 //BA.debugLineNum = 21823624;BA.debugLine="Chk_Valores_Netos.Enabled = False";
mostCurrent._chk_valores_netos.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21823626;
 //BA.debugLineNum = 21823626;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
_fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)("NVV"));
RDebugUtils.currentLine=21823627;
 //BA.debugLineNum = 21823627;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
_fila_encabezado.Put((Object)("NroDocumento".toLowerCase()),(Object)(_newnrodocumento));
RDebugUtils.currentLine=21823629;
 //BA.debugLineNum = 21823629;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
_fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=21823630;
 //BA.debugLineNum = 21823630;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
_fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=21823631;
 //BA.debugLineNum = 21823631;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
_fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=21823632;
 //BA.debugLineNum = 21823632;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
_fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=21823634;
 //BA.debugLineNum = 21823634;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
_fila_encabezado.Put((Object)("Cuotas".toLowerCase()),(Object)(_cuotas));
RDebugUtils.currentLine=21823635;
 //BA.debugLineNum = 21823635;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
_fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=21823636;
 //BA.debugLineNum = 21823636;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
_fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=21823638;
 //BA.debugLineNum = 21823638;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Defe";
_row_entidad = mostCurrent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=21823640;
 //BA.debugLineNum = 21823640;BA.debugLine="Dim CodEntidad As String";
_codentidad = "";
RDebugUtils.currentLine=21823641;
 //BA.debugLineNum = 21823641;BA.debugLine="Dim CodSucEntidad As String";
_codsucentidad = "";
RDebugUtils.currentLine=21823642;
 //BA.debugLineNum = 21823642;BA.debugLine="Dim Nombre_Entidad As String";
_nombre_entidad = "";
RDebugUtils.currentLine=21823644;
 //BA.debugLineNum = 21823644;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (_row_entidad.IsInitialized()) { 
RDebugUtils.currentLine=21823645;
 //BA.debugLineNum = 21823645;BA.debugLine="CodEntidad = Row_Entidad.Get(\"KOEN\")";
_codentidad = BA.ObjectToString(_row_entidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=21823646;
 //BA.debugLineNum = 21823646;BA.debugLine="CodSucEntidad = Row_Entidad.Get(\"SUEN\")";
_codsucentidad = BA.ObjectToString(_row_entidad.Get((Object)("SUEN")));
RDebugUtils.currentLine=21823647;
 //BA.debugLineNum = 21823647;BA.debugLine="Nombre_Entidad = Row_Entidad.Get(\"NOKOEN\")";
_nombre_entidad = BA.ObjectToString(_row_entidad.Get((Object)("NOKOEN")));
 };
RDebugUtils.currentLine=21823650;
 //BA.debugLineNum = 21823650;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
_fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(_codentidad));
RDebugUtils.currentLine=21823651;
 //BA.debugLineNum = 21823651;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
_fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(_codsucentidad));
RDebugUtils.currentLine=21823652;
 //BA.debugLineNum = 21823652;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
_fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(_nombre_entidad));
RDebugUtils.currentLine=21823654;
 //BA.debugLineNum = 21823654;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
_fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
RDebugUtils.currentLine=21823655;
 //BA.debugLineNum = 21823655;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
_fila_encabezado.Put((Object)("CodFuncionario".toLowerCase()),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=21823657;
 //BA.debugLineNum = 21823657;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
_fila_encabezado.Put((Object)("NomFuncionario".toLowerCase()),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
RDebugUtils.currentLine=21823659;
 //BA.debugLineNum = 21823659;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
_fila_encabezado.Put((Object)("Moneda_Doc".toLowerCase()),(Object)(_moneda_doc));
RDebugUtils.currentLine=21823660;
 //BA.debugLineNum = 21823660;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
_fila_encabezado.Put((Object)("TipoMoneda".toLowerCase()),(Object)(_tipomoneda));
RDebugUtils.currentLine=21823661;
 //BA.debugLineNum = 21823661;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
_fila_encabezado.Put((Object)("Valor_Dolar".toLowerCase()),(Object)(_valor_dolar));
RDebugUtils.currentLine=21823662;
 //BA.debugLineNum = 21823662;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
_fila_encabezado.Put((Object)("Tasadorig_Doc".toLowerCase()),(Object)(_tasadorig_doc));
RDebugUtils.currentLine=21823664;
 //BA.debugLineNum = 21823664;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
_fila_encabezado.Put((Object)("DocEn_Neto_Bruto".toLowerCase()),(Object)(_docen_neto_bruto));
RDebugUtils.currentLine=21823666;
 //BA.debugLineNum = 21823666;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
_fila_encabezado.Put((Object)("Centro_Costo".toLowerCase()),(Object)(_centro_costo));
RDebugUtils.currentLine=21823668;
 //BA.debugLineNum = 21823668;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
_fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823669;
 //BA.debugLineNum = 21823669;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
_fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823670;
 //BA.debugLineNum = 21823670;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
_fila_encabezado.Put((Object)("Nombre_Entidad_Fisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823671;
 //BA.debugLineNum = 21823671;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
_fila_encabezado.Put((Object)("Fun_Auto_Deuda_Ven".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823672;
 //BA.debugLineNum = 21823672;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
_fila_encabezado.Put((Object)("Fun_Auto_Stock_Ins".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823673;
 //BA.debugLineNum = 21823673;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
_fila_encabezado.Put((Object)("Fun_Auto_Cupo_Exe".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823674;
 //BA.debugLineNum = 21823674;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
_fila_encabezado.Put((Object)("SubTido".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=21823677;
 //BA.debugLineNum = 21823677;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",_fila_encabezado,mostCurrent._fila_idenc);
RDebugUtils.currentLine=21823679;
 //BA.debugLineNum = 21823679;BA.debugLine="If Row_Entidad.IsInitialized Then";
if (_row_entidad.IsInitialized()) { 
RDebugUtils.currentLine=21823680;
 //BA.debugLineNum = 21823680;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fa";
_sb_actualizar_datos_de_la_entidad(_row_entidad,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=21823682;
 //BA.debugLineNum = 21823682;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823683;
 //BA.debugLineNum = 21823683;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823684;
 //BA.debugLineNum = 21823684;BA.debugLine="Lbl_Rut.Text = \"\"";
mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823685;
 //BA.debugLineNum = 21823685;BA.debugLine="Lbl_Nombre.Text = \"\"";
mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823686;
 //BA.debugLineNum = 21823686;BA.debugLine="Lbl_Direccion.Text = \"\"";
mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823687;
 //BA.debugLineNum = 21823687;BA.debugLine="Lbl_Ciudad.Text = \"\"";
mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823688;
 //BA.debugLineNum = 21823688;BA.debugLine="Lbl_Comuna.Text = \"\"";
mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21823689;
 //BA.debugLineNum = 21823689;BA.debugLine="Tab_Post.CurrentTab = 0";
mostCurrent._tab_post.setCurrentTab((int) (0));
 };
RDebugUtils.currentLine=21823692;
 //BA.debugLineNum = 21823692;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = False";
mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21823694;
 //BA.debugLineNum = 21823694;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21823696;
 //BA.debugLineNum = 21823696;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="If Nuevo_Doc Then";
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
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20774921;
 //BA.debugLineNum = 20774921;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.v";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=20774925;
 //BA.debugLineNum = 20774925;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
parent._id_docenc = (int)(BA.ObjectToNumber(parent._fila_encabezado.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=20774928;
 //BA.debugLineNum = 20774928;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20774932;
 //BA.debugLineNum = 20774932;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20774933;
 //BA.debugLineNum = 20774933;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20774935;
 //BA.debugLineNum = 20774935;BA.debugLine="If Not(Fila_Observaciones.IsInitialized)  Then";
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
RDebugUtils.currentLine=20774938;
 //BA.debugLineNum = 20774938;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (I";
parent.mostCurrent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=20774939;
 //BA.debugLineNum = 20774939;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
RDebugUtils.currentLine=20774942;
 //BA.debugLineNum = 20774942;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20774943;
 //BA.debugLineNum = 20774943;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variable";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=20774947;
 //BA.debugLineNum = 20774947;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
parent.mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("observaciones"))));
RDebugUtils.currentLine=20774948;
 //BA.debugLineNum = 20774948;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("orden_compra"))));
RDebugUtils.currentLine=20774951;
 //BA.debugLineNum = 20774951;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20774952;
 //BA.debugLineNum = 20774952;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20774954;
 //BA.debugLineNum = 20774954;BA.debugLine="If Not(Fila_DespaFacil.IsInitialized)  Then";
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
RDebugUtils.currentLine=20774956;
 //BA.debugLineNum = 20774956;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
parent.mostCurrent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=20774957;
 //BA.debugLineNum = 20774957;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent.mostCurrent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
RDebugUtils.currentLine=20774959;
 //BA.debugLineNum = 20774959;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20774960;
 //BA.debugLineNum = 20774960;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;
;
RDebugUtils.currentLine=20774964;
 //BA.debugLineNum = 20774964;BA.debugLine="If B4A_DespachoSimple Then";

case 14:
//if
this.state = 17;
if (parent._b4a_despachosimple) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=20774966;
 //BA.debugLineNum = 20774966;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodT";
parent.mostCurrent._lbl_tipodespacho.setTag(parent._fila_despafacil.Get((Object)("CodTipoDespacho".toLowerCase())));
RDebugUtils.currentLine=20774967;
 //BA.debugLineNum = 20774967;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tip";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoDespacho".toLowerCase()))));
RDebugUtils.currentLine=20774969;
 //BA.debugLineNum = 20774969;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"Cod";
parent.mostCurrent._lbl_tipopagodesp.setTag(parent._fila_despafacil.Get((Object)("CodTipoPagoDesp".toLowerCase())));
RDebugUtils.currentLine=20774970;
 //BA.debugLineNum = 20774970;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tip";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoPagoDesp".toLowerCase()))));
RDebugUtils.currentLine=20774972;
 //BA.debugLineNum = 20774972;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Co";
parent.mostCurrent._lbl_coddocdestino.setTag(parent._fila_despafacil.Get((Object)("CodDocDestino".toLowerCase())));
RDebugUtils.currentLine=20774973;
 //BA.debugLineNum = 20774973;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Do";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DocDestino".toLowerCase()))));
RDebugUtils.currentLine=20774975;
 //BA.debugLineNum = 20774975;BA.debugLine="Txt_TransporteDesp.Text =  Fila_DespaFacil.Get(\"";
parent.mostCurrent._txt_transportedesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TransporteDesp".toLowerCase()))));
RDebugUtils.currentLine=20774976;
 //BA.debugLineNum = 20774976;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"D";
parent.mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DireccionDesp".toLowerCase()))));
RDebugUtils.currentLine=20774977;
 //BA.debugLineNum = 20774977;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get";
parent.mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("ObservacionesDesp".toLowerCase()))));
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=20774981;
 //BA.debugLineNum = 20774981;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("220774981","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
RDebugUtils.currentLine=20774983;
 //BA.debugLineNum = 20774983;BA.debugLine="Wait For (Sb_Cargar_Entidad(Editar_Documento)) Co";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_documento"), _sb_cargar_entidad(parent._editar_documento));
this.state = 37;
return;
case 37:
//C
this.state = 18;
_fin = (Boolean) result[0];
;
RDebugUtils.currentLine=20774985;
 //BA.debugLineNum = 20774985;BA.debugLine="If Row_Entidad.IsInitialized Then";
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
RDebugUtils.currentLine=20774987;
 //BA.debugLineNum = 20774987;BA.debugLine="Lbl_CodEntidad.Text = Row_Entidad.Get(\"KOEN\")";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("KOEN"))));
RDebugUtils.currentLine=20774988;
 //BA.debugLineNum = 20774988;BA.debugLine="Lbl_CodSucEntidad.Text = Row_Entidad.Get(\"SUEN\")";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("SUEN"))));
RDebugUtils.currentLine=20774989;
 //BA.debugLineNum = 20774989;BA.debugLine="Lbl_Rut.Text = Row_Entidad.Get(\"Rut\")";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("Rut"))));
RDebugUtils.currentLine=20774990;
 //BA.debugLineNum = 20774990;BA.debugLine="Lbl_Nombre.Text = Row_Entidad.Get(\"NOKOEN\")";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("NOKOEN"))));
RDebugUtils.currentLine=20774991;
 //BA.debugLineNum = 20774991;BA.debugLine="Lbl_Direccion.Text = Row_Entidad.Get(\"DIEN\")";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("DIEN"))));
RDebugUtils.currentLine=20774992;
 //BA.debugLineNum = 20774992;BA.debugLine="Lbl_Ciudad.Text = Row_Entidad.Get(\"CIUDAD\")";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("CIUDAD"))));
RDebugUtils.currentLine=20774993;
 //BA.debugLineNum = 20774993;BA.debugLine="Lbl_Comuna.Text = Row_Entidad.Get(\"COMUNA\")";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(parent._row_entidad.Get((Object)("COMUNA"))));
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=20774997;
 //BA.debugLineNum = 20774997;BA.debugLine="Lbl_CodEntidad.Text = \"\"";
parent.mostCurrent._lbl_codentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20774998;
 //BA.debugLineNum = 20774998;BA.debugLine="Lbl_CodSucEntidad.Text = \"\"";
parent.mostCurrent._lbl_codsucentidad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20774999;
 //BA.debugLineNum = 20774999;BA.debugLine="Lbl_Rut.Text = \"\"";
parent.mostCurrent._lbl_rut.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20775000;
 //BA.debugLineNum = 20775000;BA.debugLine="Lbl_Nombre.Text = \"\"";
parent.mostCurrent._lbl_nombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20775001;
 //BA.debugLineNum = 20775001;BA.debugLine="Lbl_Direccion.Text = \"\"";
parent.mostCurrent._lbl_direccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20775002;
 //BA.debugLineNum = 20775002;BA.debugLine="Lbl_Ciudad.Text = \"\"";
parent.mostCurrent._lbl_ciudad.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=20775003;
 //BA.debugLineNum = 20775003;BA.debugLine="Lbl_Comuna.Text = \"\"";
parent.mostCurrent._lbl_comuna.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=20775007;
 //BA.debugLineNum = 20775007;BA.debugLine="Dim ListaPrecios As String = Fila_Encabezado.Get(";
_listaprecios = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=20775009;
 //BA.debugLineNum = 20775009;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
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
RDebugUtils.currentLine=20775011;
 //BA.debugLineNum = 20775011;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.mostCurrent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=20775012;
 //BA.debugLineNum = 20775012;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=20775013;
 //BA.debugLineNum = 20775013;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
RDebugUtils.currentLine=20775015;
 //BA.debugLineNum = 20775015;BA.debugLine="If ListaPrecios = Kolt Then";
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
RDebugUtils.currentLine=20775016;
 //BA.debugLineNum = 20775016;BA.debugLine="Lbl_Lista_Precios.Text = Nokolt";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(_nokolt));
RDebugUtils.currentLine=20775017;
 //BA.debugLineNum = 20775017;BA.debugLine="Exit";
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
RDebugUtils.currentLine=20775022;
 //BA.debugLineNum = 20775022;BA.debugLine="Try";

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
RDebugUtils.currentLine=20775024;
 //BA.debugLineNum = 20775024;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encab";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fechaemision".toLowerCase()))))));
RDebugUtils.currentLine=20775025;
 //BA.debugLineNum = 20775025;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(F";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
RDebugUtils.currentLine=20775026;
 //BA.debugLineNum = 20775026;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fil";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
 if (true) break;

case 35:
//C
this.state = 36;
this.catchState = 0;
RDebugUtils.currentLine=20775028;
 //BA.debugLineNum = 20775028;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("220775028",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20775031;
 //BA.debugLineNum = 20775031;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\".To";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas".toLowerCase()))));
RDebugUtils.currentLine=20775032;
 //BA.debugLineNum = 20775032;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento".toLowerCase()))));
RDebugUtils.currentLine=20775033;
 //BA.debugLineNum = 20775033;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento".toLowerCase()))));
RDebugUtils.currentLine=20775035;
 //BA.debugLineNum = 20775035;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_documento"), _sb_visibleocultardespachosimple());
this.state = 40;
return;
case 40:
//C
this.state = -1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=20775038;
 //BA.debugLineNum = 20775038;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=20775040;
 //BA.debugLineNum = 20775040;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_detalle"), _sb_titulo());
this.state = 28;
return;
case 28:
//C
this.state = 1;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="If Cargar_Activity Then";
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
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="If Frm_Post_01_Producto.Id_DocDet <> 0 Then";
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
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
RDebugUtils.currentLine=20971530;
 //BA.debugLineNum = 20971530;BA.debugLine="Return";
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
RDebugUtils.currentLine=20971534;
 //BA.debugLineNum = 20971534;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20971535;
 //BA.debugLineNum = 20971535;BA.debugLine="XclvDetalle.DefaultTextBackgroundColor = Colors.T";
parent.mostCurrent._xclvdetalle._defaulttextbackgroundcolor = anywheresoftware.b4a.keywords.Common.Colors.Transparent;
RDebugUtils.currentLine=20971536;
 //BA.debugLineNum = 20971536;BA.debugLine="XclvDetalle.Clear";
parent.mostCurrent._xclvdetalle._clear();
RDebugUtils.currentLine=20971537;
 //BA.debugLineNum = 20971537;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=20971538;
 //BA.debugLineNum = 20971538;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=20971540;
 //BA.debugLineNum = 20971540;BA.debugLine="IDList.Initialize";
parent.mostCurrent._idlist.Initialize();
RDebugUtils.currentLine=20971542;
 //BA.debugLineNum = 20971542;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=20971543;
 //BA.debugLineNum = 20971543;BA.debugLine="Dim ItemStr As String";
_itemstr = "";
RDebugUtils.currentLine=20971545;
 //BA.debugLineNum = 20971545;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea,Bodega "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=20971548;
 //BA.debugLineNum = 20971548;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=20971550;
 //BA.debugLineNum = 20971550;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=20971552;
 //BA.debugLineNum = 20971552;BA.debugLine="For Row = 0 To RowNumber - 1";
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
RDebugUtils.currentLine=20971554;
 //BA.debugLineNum = 20971554;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=20971555;
 //BA.debugLineNum = 20971555;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
parent.mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
RDebugUtils.currentLine=20971557;
 //BA.debugLineNum = 20971557;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
parent._id_docdet = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDet")));
RDebugUtils.currentLine=20971558;
 //BA.debugLineNum = 20971558;BA.debugLine="Dim Codigo As String = Cursor1.GetString(\"Codig";
_codigo = _cursor1.GetString("Codigo");
RDebugUtils.currentLine=20971559;
 //BA.debugLineNum = 20971559;BA.debugLine="Dim Descripcion As String = Cursor1.GetString(\"";
_descripcion = _cursor1.GetString("Descripcion");
RDebugUtils.currentLine=20971561;
 //BA.debugLineNum = 20971561;BA.debugLine="Dim Cantidad As String  =  NumberFormat(Cursor1";
_cantidad = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("Cantidad"))),(int) (0),(int) (2));
RDebugUtils.currentLine=20971562;
 //BA.debugLineNum = 20971562;BA.debugLine="Dim UdTrans As String = Cursor1.GetString(\"UdTr";
_udtrans = _cursor1.GetString("UdTrans");
RDebugUtils.currentLine=20971563;
 //BA.debugLineNum = 20971563;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
_tict = _cursor1.GetString("Tict");
RDebugUtils.currentLine=20971564;
 //BA.debugLineNum = 20971564;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
_prct = (int)(Double.parseDouble(_cursor1.GetString("Prct")));
RDebugUtils.currentLine=20971565;
 //BA.debugLineNum = 20971565;BA.debugLine="Dim Precio As String  = \"$ \" &  NumberFormat(Cu";
_precio = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("Precio"))),(int) (0),(int) (2));
RDebugUtils.currentLine=20971566;
 //BA.debugLineNum = 20971566;BA.debugLine="Dim descuentoporc As String = NumberFormat(Curs";
_descuentoporc = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("DescuentoPorc"))),(int) (0),(int) (2));
RDebugUtils.currentLine=20971567;
 //BA.debugLineNum = 20971567;BA.debugLine="Dim valnetolinea As String = \"$ \" &  NumberForm";
_valnetolinea = "$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cursor1.GetString("ValNetoLinea"))),(int) (0),(int) (0));
RDebugUtils.currentLine=20971568;
 //BA.debugLineNum = 20971568;BA.debugLine="Dim Bodega As String = Cursor1.GetString(\"Bodeg";
_bodega = _cursor1.GetString("Bodega");
RDebugUtils.currentLine=20971570;
 //BA.debugLineNum = 20971570;BA.debugLine="If Descripcion.Length > 35 Then";
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
RDebugUtils.currentLine=20971571;
 //BA.debugLineNum = 20971571;BA.debugLine="Descripcion = Funciones.Mid(Descripcion,1,35)";
_descripcion = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,_descripcion,(int) (1),(int) (35));
 if (true) break;
;
RDebugUtils.currentLine=20971574;
 //BA.debugLineNum = 20971574;BA.debugLine="If Cursor1.GetString(\"DescuentoPorc\") = 0 Then";

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
RDebugUtils.currentLine=20971575;
 //BA.debugLineNum = 20971575;BA.debugLine="descuentoporc = \"\"";
_descuentoporc = "";
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=20971577;
 //BA.debugLineNum = 20971577;BA.debugLine="descuentoporc = \" -%.\" & descuentoporc & \" \"";
_descuentoporc = " -%."+_descuentoporc+" ";
 if (true) break;

case 23:
//C
this.state = 30;
;
RDebugUtils.currentLine=20971580;
 //BA.debugLineNum = 20971580;BA.debugLine="Dim Item As Int = Row+1";
_item = (int) (_row+1);
RDebugUtils.currentLine=20971581;
 //BA.debugLineNum = 20971581;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item),(int) (2),"0");
RDebugUtils.currentLine=20971583;
 //BA.debugLineNum = 20971583;BA.debugLine="Dim Datos As String = \"Cant. \" & UdTrans & \" \"";
_datos = "Cant. "+_udtrans+" "+_cantidad+" X "+_precio+_descuentoporc+anywheresoftware.b4a.keywords.Common.CRLF+"Total: "+_valnetolinea+".-		Bod: "+_bodega;
RDebugUtils.currentLine=20971585;
 //BA.debugLineNum = 20971585;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=20971587;
 //BA.debugLineNum = 20971587;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView.";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),parent.mostCurrent._xclvdetalle._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
RDebugUtils.currentLine=20971588;
 //BA.debugLineNum = 20971588;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
_p.LoadLayout("Items_Detalle",mostCurrent.activityBA);
RDebugUtils.currentLine=20971589;
 //BA.debugLineNum = 20971589;BA.debugLine="p.Color = Colors.Transparent";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=20971591;
 //BA.debugLineNum = 20971591;BA.debugLine="Lbl_Codigo.Tag = Id_DocDet";
parent.mostCurrent._lbl_codigo.setTag((Object)(parent._id_docdet));
RDebugUtils.currentLine=20971592;
 //BA.debugLineNum = 20971592;BA.debugLine="Lbl_Codigo.Text = Codigo";
parent.mostCurrent._lbl_codigo.setText(BA.ObjectToCharSequence(_codigo));
RDebugUtils.currentLine=20971593;
 //BA.debugLineNum = 20971593;BA.debugLine="Lbl_Descripcion.Tag = Tict";
parent.mostCurrent._lbl_descripcion.setTag((Object)(_tict));
RDebugUtils.currentLine=20971594;
 //BA.debugLineNum = 20971594;BA.debugLine="Lbl_Descripcion.Text = Descripcion";
parent.mostCurrent._lbl_descripcion.setText(BA.ObjectToCharSequence(_descripcion));
RDebugUtils.currentLine=20971595;
 //BA.debugLineNum = 20971595;BA.debugLine="Lbl_Item.Tag = Prct";
parent.mostCurrent._lbl_item.setTag((Object)(_prct));
RDebugUtils.currentLine=20971596;
 //BA.debugLineNum = 20971596;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
parent.mostCurrent._lbl_item.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
RDebugUtils.currentLine=20971597;
 //BA.debugLineNum = 20971597;BA.debugLine="Lbl_Datos.Text = Datos";
parent.mostCurrent._lbl_datos.setText(BA.ObjectToCharSequence(_datos));
RDebugUtils.currentLine=20971605;
 //BA.debugLineNum = 20971605;BA.debugLine="XclvDetalle.Add(p,\"\")";
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
RDebugUtils.currentLine=20971610;
 //BA.debugLineNum = 20971610;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=20971613;
 //BA.debugLineNum = 20971613;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=20971615;
 //BA.debugLineNum = 20971615;BA.debugLine="Sb_Sumar_Totales";
_sb_sumar_totales();
RDebugUtils.currentLine=20971617;
 //BA.debugLineNum = 20971617;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="If	Hay_Descuentos_Globales Then";
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
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE AGREMAR MAS ITEM"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_buscar_click"), _sb_productomodoconsulta());
this.state = 13;
return;
case 13:
//C
this.state = 5;
_rsmoscs = (Boolean) result[0];
;
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="If Not(RsMosCs) Then";
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
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=21430289;
 //BA.debugLineNum = 21430289;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_buscar_click"), _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 14;
return;
case 14:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=21430290;
 //BA.debugLineNum = 21430290;BA.debugLine="If Not(Resultado) Then";
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
RDebugUtils.currentLine=21430291;
 //BA.debugLineNum = 21430291;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=21430294;
 //BA.debugLineNum = 21430294;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=21430296;
 //BA.debugLineNum = 21430296;BA.debugLine="BuscandoProducto = True";
parent._buscandoproducto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21430297;
 //BA.debugLineNum = 21430297;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Tex";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=21430298;
 //BA.debugLineNum = 21430298;BA.debugLine="Buscar_productos.Lista =  Fila_Encabezado.Get(\"Li";
parent.mostCurrent._buscar_productos._lista /*String*/  = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=21430299;
 //BA.debugLineNum = 21430299;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
RDebugUtils.currentLine=21430301;
 //BA.debugLineNum = 21430301;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="If B4A_DespachoSimple And XclvDetalle.Size = 0 An";
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
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="Msgbox2Async(\"No existe tipo de despacho\" & CRLF";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe tipo de despacho"+anywheresoftware.b4a.keywords.Common.CRLF+"Indique su opción."),BA.ObjectToCharSequence("Validación"),"SOLO CONSULTAR PRODUCTO","","CANCELAR",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_productomodoconsulta"), null);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="Frm_Post_01_Producto.ModoConsulta = True";
parent.mostCurrent._frm_post_01_producto._modoconsulta /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="Return False";
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
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=21495828;
 //BA.debugLineNum = 21495828;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEVE";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Dim Tido As String = TipoDoc";
_tido = parent._tipodoc;
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="If Secueven.Contains(\"B\") Then";
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
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Tido = \"BLV\"";
_tido = "BLV";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="Dim RowDoc As Map";
_rowdoc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="Select Case Tido";
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
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="RowDoc = Variables.Global_COV";
_rowdoc = parent.mostCurrent._variables._global_cov /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 11:
//C
this.state = 16;
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="RowDoc = Variables.Global_NVV";
_rowdoc = parent.mostCurrent._variables._global_nvv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="RowDoc = Variables.Global_BLV";
_rowdoc = parent.mostCurrent._variables._global_blv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=21561365;
 //BA.debugLineNum = 21561365;BA.debugLine="RowDoc = Variables.Global_FCV";
_rowdoc = parent.mostCurrent._variables._global_fcv /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=21561368;
 //BA.debugLineNum = 21561368;BA.debugLine="Dim NroLineasXpag As Int = RowDoc.Get(\"NroLineasX";
_nrolineasxpag = (int)(BA.ObjectToNumber(_rowdoc.Get((Object)("NroLineasXpag"))));
RDebugUtils.currentLine=21561369;
 //BA.debugLineNum = 21561369;BA.debugLine="Dim Lineas As Int = XclvDetalle.Size";
_lineas = parent.mostCurrent._xclvdetalle._getsize();
RDebugUtils.currentLine=21561372;
 //BA.debugLineNum = 21561372;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21561374;
 //BA.debugLineNum = 21561374;BA.debugLine="If NroLineasXpag < Lineas+1 Then";
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
RDebugUtils.currentLine=21561375;
 //BA.debugLineNum = 21561375;BA.debugLine="Msgbox2Async(\"No es posible ingresar más líneas";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No es posible ingresar más líneas en detalle"+anywheresoftware.b4a.keywords.Common.CRLF+"Máximo de líneas por documento ["+BA.NumberToString(_nrolineasxpag)+"]"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21561377;
 //BA.debugLineNum = 21561377;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=21561380;
 //BA.debugLineNum = 21561380;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=21561381;
 //BA.debugLineNum = 21561381;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="Dim Secueven As String = Row_Entidad.Get(\"SECUEV";
_secueven = BA.ObjectToString(parent._row_entidad.Get((Object)("SECUEVEN")));
RDebugUtils.currentLine=22085644;
 //BA.debugLineNum = 22085644;BA.debugLine="If Not(Secueven.Contains(\"B\")) Then";
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
RDebugUtils.currentLine=22085645;
 //BA.debugLineNum = 22085645;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22085647;
 //BA.debugLineNum = 22085647;BA.debugLine="Msgbox2Async(\"¡No se puede cambiar la entidad y";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡No se puede cambiar la entidad ya que existen datos en el documento!"),BA.ObjectToCharSequence("Validación"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22085648;
 //BA.debugLineNum = 22085648;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_canbiar_cliente_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22085649;
 //BA.debugLineNum = 22085649;BA.debugLine="Return";
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
RDebugUtils.currentLine=22085654;
 //BA.debugLineNum = 22085654;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=22085656;
 //BA.debugLineNum = 22085656;BA.debugLine="BuscandoEntidad = True";
parent._buscandoentidad = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22085657;
 //BA.debugLineNum = 22085657;BA.debugLine="StartActivity(Buscar_entidad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_entidad.getObject()));
RDebugUtils.currentLine=22085659;
 //BA.debugLineNum = 22085659;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Wait For (Fx_Cambiar_DocDespSimple_Poswii) comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_coddocdestino_click"), _fx_cambiar_docdespsimple_poswii());
this.state = 21;
return;
case 21:
//C
this.state = 1;
_tienepermiso = (Boolean) result[0];
;
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="If Not(TienePermiso) Then";
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
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=23789576;
 //BA.debugLineNum = 23789576;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23789577;
 //BA.debugLineNum = 23789577;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23789580;
 //BA.debugLineNum = 23789580;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23789581;
 //BA.debugLineNum = 23789581;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23789582;
 //BA.debugLineNum = 23789582;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
RDebugUtils.currentLine=23789584;
 //BA.debugLineNum = 23789584;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_DocDesti";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_coddocdestino_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._despsimple_docdestino),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 22;
return;
case 22:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23789585;
 //BA.debugLineNum = 23789585;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23789587;
 //BA.debugLineNum = 23789587;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23789589;
 //BA.debugLineNum = 23789589;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
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
RDebugUtils.currentLine=23789591;
 //BA.debugLineNum = 23789591;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
RDebugUtils.currentLine=23789592;
 //BA.debugLineNum = 23789592;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=23789594;
 //BA.debugLineNum = 23789594;BA.debugLine="If DespSimple_DocDestino.SelectedItem.Trim = N";
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
RDebugUtils.currentLine=23789595;
 //BA.debugLineNum = 23789595;BA.debugLine="Lbl_CodDocDestino.Tag = CodigoTabla";
parent.mostCurrent._lbl_coddocdestino.setTag((Object)(_codigotabla));
RDebugUtils.currentLine=23789596;
 //BA.debugLineNum = 23789596;BA.debugLine="Lbl_CodDocDestino.Text = NombreTabla";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(_nombretabla));
RDebugUtils.currentLine=23789597;
 //BA.debugLineNum = 23789597;BA.debugLine="Exit";
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
RDebugUtils.currentLine=23789606;
 //BA.debugLineNum = 23789606;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23003145;
 //BA.debugLineNum = 23003145;BA.debugLine="Dim Existe As Boolean";
_existe = false;
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
RDebugUtils.currentLine=23003148;
 //BA.debugLineNum = 23003148;BA.debugLine="Dim Clave As String";
_clave = "";
RDebugUtils.currentLine=23003149;
 //BA.debugLineNum = 23003149;BA.debugLine="Dim Koen As String = Row_Entidad.Get(\"KOEN\")";
_koen = BA.ObjectToString(parent._row_entidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=23003151;
 //BA.debugLineNum = 23003151;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del permiso"));
RDebugUtils.currentLine=23003152;
 //BA.debugLineNum = 23003152;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=23003154;
 //BA.debugLineNum = 23003154;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23003155;
 //BA.debugLineNum = 23003155;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23003156;
 //BA.debugLineNum = 23003156;BA.debugLine="Clave = InputTemplate.Text";
_clave = parent.mostCurrent._inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=23003158;
 //BA.debugLineNum = 23003158;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=23003162;
 //BA.debugLineNum = 23003162;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=23003165;
 //BA.debugLineNum = 23003165;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_clave_docdespsimple_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_clave,_koen,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23003166;
 //BA.debugLineNum = 23003166;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_cambiar_docdespsimple_poswii"), (Object)(_js));
this.state = 30;
return;
case 30:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=23003168;
 //BA.debugLineNum = 23003168;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=23003170;
 //BA.debugLineNum = 23003170;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=23003171;
 //BA.debugLineNum = 23003171;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=23003173;
 //BA.debugLineNum = 23003173;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=23003175;
 //BA.debugLineNum = 23003175;BA.debugLine="Existe = Fila.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_fila.Get((Object)("Existe")));
RDebugUtils.currentLine=23003176;
 //BA.debugLineNum = 23003176;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_fila.Get((Object)("Otorgado")));
RDebugUtils.currentLine=23003178;
 //BA.debugLineNum = 23003178;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=23003180;
 //BA.debugLineNum = 23003180;BA.debugLine="If Existe Then";
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
RDebugUtils.currentLine=23003181;
 //BA.debugLineNum = 23003181;BA.debugLine="If Otorgado Then";
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
RDebugUtils.currentLine=23003182;
 //BA.debugLineNum = 23003182;BA.debugLine="Msgbox2Async(\"Este permiso ya fue utilizado\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este permiso ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23003183;
 //BA.debugLineNum = 23003183;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=23003188;
 //BA.debugLineNum = 23003188;BA.debugLine="Return True";
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
RDebugUtils.currentLine=23003191;
 //BA.debugLineNum = 23003191;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23003192;
 //BA.debugLineNum = 23003192;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=23003197;
 //BA.debugLineNum = 23003197;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23003198;
 //BA.debugLineNum = 23003198;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=23003201;
 //BA.debugLineNum = 23003201;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=23003202;
 //BA.debugLineNum = 23003202;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=23003204;
 //BA.debugLineNum = 23003204;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
RDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=22806537;
 //BA.debugLineNum = 22806537;BA.debugLine="If Cursor1.RowCount = 0 Then";
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
RDebugUtils.currentLine=22806539;
 //BA.debugLineNum = 22806539;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22806541;
 //BA.debugLineNum = 22806541;BA.debugLine="Msgbox2Async(\"¡No se puede agregar un concepto g";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡No se puede agregar un concepto global si no existen datos en el documento!"),BA.ObjectToCharSequence("Validación"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22806542;
 //BA.debugLineNum = 22806542;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), null);
this.state = 33;
return;
case 33:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22806543;
 //BA.debugLineNum = 22806543;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=22806547;
 //BA.debugLineNum = 22806547;BA.debugLine="Wait For(Fx_ExisteDescuentoGlobal) Complete (Rsdc";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _fx_existedescuentoglobal());
this.state = 34;
return;
case 34:
//C
this.state = 5;
_rsdctogl = (Boolean) result[0];
;
RDebugUtils.currentLine=22806548;
 //BA.debugLineNum = 22806548;BA.debugLine="If RsdctoGl Then";
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
RDebugUtils.currentLine=22806549;
 //BA.debugLineNum = 22806549;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=22806552;
 //BA.debugLineNum = 22806552;BA.debugLine="Btn_DsctoGlobal.Enabled = False";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22806554;
 //BA.debugLineNum = 22806554;BA.debugLine="Wait For(Sb_Buscar_Dscto_X_Cliente) Complete (Res";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _sb_buscar_dscto_x_cliente());
this.state = 35;
return;
case 35:
//C
this.state = 9;
_resultdscto = (Double) result[0];
;
RDebugUtils.currentLine=22806555;
 //BA.debugLineNum = 22806555;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
RDebugUtils.currentLine=22806557;
 //BA.debugLineNum = 22806557;BA.debugLine="If ResultDscto < 0 Then";
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
RDebugUtils.currentLine=22806558;
 //BA.debugLineNum = 22806558;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22806559;
 //BA.debugLineNum = 22806559;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22806560;
 //BA.debugLineNum = 22806560;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=22806563;
 //BA.debugLineNum = 22806563;BA.debugLine="If ResultDscto > 0 Then";

case 12:
//if
this.state = 15;
if (_resultdscto>0) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=22806564;
 //BA.debugLineNum = 22806564;BA.debugLine="DescuentoPorc = ResultDscto";
_descuentoporc = _resultdscto;
 if (true) break;
;
RDebugUtils.currentLine=22806567;
 //BA.debugLineNum = 22806567;BA.debugLine="If ResultDscto = 0 Then";

case 15:
//if
this.state = 22;
if (_resultdscto==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=22806569;
 //BA.debugLineNum = 22806569;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), _fx_insertar_dscto_global_permiso());
this.state = 36;
return;
case 36:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22806570;
 //BA.debugLineNum = 22806570;BA.debugLine="DescuentoPorc = Result";
_descuentoporc = _result;
RDebugUtils.currentLine=22806572;
 //BA.debugLineNum = 22806572;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=22806573;
 //BA.debugLineNum = 22806573;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22806574;
 //BA.debugLineNum = 22806574;BA.debugLine="Return";
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
RDebugUtils.currentLine=22806579;
 //BA.debugLineNum = 22806579;BA.debugLine="Dim Concepto As String = \"DESCUENTO\"";
_concepto = "DESCUENTO";
RDebugUtils.currentLine=22806580;
 //BA.debugLineNum = 22806580;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=22806581;
 //BA.debugLineNum = 22806581;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=22806582;
 //BA.debugLineNum = 22806582;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=22806583;
 //BA.debugLineNum = 22806583;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=22806585;
 //BA.debugLineNum = 22806585;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_concepto,_empresa,_sucursal,_bodega,_lista,"");
RDebugUtils.currentLine=22806587;
 //BA.debugLineNum = 22806587;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_dsctoglobal_click"), (Object)(_js));
this.state = 37;
return;
case 37:
//C
this.state = 23;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22806588;
 //BA.debugLineNum = 22806588;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando concepto..."));
RDebugUtils.currentLine=22806590;
 //BA.debugLineNum = 22806590;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22806592;
 //BA.debugLineNum = 22806592;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22806594;
 //BA.debugLineNum = 22806594;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22806596;
 //BA.debugLineNum = 22806596;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=22806597;
 //BA.debugLineNum = 22806597;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=22806599;
 //BA.debugLineNum = 22806599;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
RDebugUtils.currentLine=22806601;
 //BA.debugLineNum = 22806601;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("Moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=22806602;
 //BA.debugLineNum = 22806602;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=22806603;
 //BA.debugLineNum = 22806603;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=22806604;
 //BA.debugLineNum = 22806604;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=22806606;
 //BA.debugLineNum = 22806606;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=22806608;
 //BA.debugLineNum = 22806608;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=22806609;
 //BA.debugLineNum = 22806609;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=22806611;
 //BA.debugLineNum = 22806611;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
_id_docdet2 = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=22806613;
 //BA.debugLineNum = 22806613;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Id_DocDet2)";
_sb_procesar_fila("DescuentoPorc",_id_docdet2);
RDebugUtils.currentLine=22806615;
 //BA.debugLineNum = 22806615;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.pn";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=22806617;
 //BA.debugLineNum = 22806617;BA.debugLine="Msgbox2Async(\"Descuento incorporado correctamen";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento incorporado correctamente"),BA.ObjectToCharSequence("Dscto. Global"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22806618;
 //BA.debugLineNum = 22806618;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22806623;
 //BA.debugLineNum = 22806623;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("222806623",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=22806624;
 //BA.debugLineNum = 22806624;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=22806627;
 //BA.debugLineNum = 22806627;BA.debugLine="Btn_DsctoGlobal.Enabled = True";
parent.mostCurrent._btn_dsctoglobal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22806628;
 //BA.debugLineNum = 22806628;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22806630;
 //BA.debugLineNum = 22806630;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Prct,Tict,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=23527434;
 //BA.debugLineNum = 23527434;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=23527436;
 //BA.debugLineNum = 23527436;BA.debugLine="For Row = 0 To RowNumber - 1";
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
RDebugUtils.currentLine=23527438;
 //BA.debugLineNum = 23527438;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=23527439;
 //BA.debugLineNum = 23527439;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
parent.mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
RDebugUtils.currentLine=23527441;
 //BA.debugLineNum = 23527441;BA.debugLine="Dim Id_DocDet As Int = Cursor1.GetString(\"Id_Do";
parent._id_docdet = (int)(Double.parseDouble(_cursor1.GetString("Id_DocDet")));
RDebugUtils.currentLine=23527442;
 //BA.debugLineNum = 23527442;BA.debugLine="Dim Tict As String = Cursor1.GetString(\"Tict\")";
_tict = _cursor1.GetString("Tict");
RDebugUtils.currentLine=23527443;
 //BA.debugLineNum = 23527443;BA.debugLine="Dim Prct As Int = Cursor1.GetString(\"Prct\")";
_prct = (int)(Double.parseDouble(_cursor1.GetString("Prct")));
RDebugUtils.currentLine=23527445;
 //BA.debugLineNum = 23527445;BA.debugLine="If Prct = 1 And Tict = \"D\" Then";
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
RDebugUtils.currentLine=23527447;
 //BA.debugLineNum = 23527447;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=23527448;
 //BA.debugLineNum = 23527448;BA.debugLine="Msgbox2Async(\"¡YA EXISTE UN DESCUENTO GLOBAL!\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¡YA EXISTE UN DESCUENTO GLOBAL!"),BA.ObjectToCharSequence("Validación"),"OK","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23527449;
 //BA.debugLineNum = 23527449;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_existedescuentoglobal"), null);
this.state = 17;
return;
case 17:
//C
this.state = 10;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23527450;
 //BA.debugLineNum = 23527450;BA.debugLine="Return True";
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
RDebugUtils.currentLine=23527456;
 //BA.debugLineNum = 23527456;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=23527459;
 //BA.debugLineNum = 23527459;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=23527461;
 //BA.debugLineNum = 23527461;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=23527463;
 //BA.debugLineNum = 23527463;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22872070;
 //BA.debugLineNum = 22872070;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
_koen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad".toLowerCase())));
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
_suen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad".toLowerCase())));
RDebugUtils.currentLine=22872073;
 //BA.debugLineNum = 22872073;BA.debugLine="Dim DescuentoPorc As Double";
_descuentoporc = 0;
RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_descuento_global_x_cliente /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_koen,_suen);
RDebugUtils.currentLine=22872078;
 //BA.debugLineNum = 22872078;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22872080;
 //BA.debugLineNum = 22872080;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22872082;
 //BA.debugLineNum = 22872082;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22872083;
 //BA.debugLineNum = 22872083;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22872085;
 //BA.debugLineNum = 22872085;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=22872087;
 //BA.debugLineNum = 22872087;BA.debugLine="Dim TieneDsctoEspecial As Boolean = Fila.Get(\"T";
_tienedsctoespecial = BA.ObjectToBoolean(_fila.Get((Object)("TieneDsctoEspecial")));
RDebugUtils.currentLine=22872088;
 //BA.debugLineNum = 22872088;BA.debugLine="Dim Error As String = Fila.Get(\"Error\")";
_error = BA.ObjectToString(_fila.Get((Object)("Error")));
RDebugUtils.currentLine=22872089;
 //BA.debugLineNum = 22872089;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("Descuento"))));
RDebugUtils.currentLine=22872101;
 //BA.debugLineNum = 22872101;BA.debugLine="If TieneDsctoEspecial = False Then";
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
RDebugUtils.currentLine=22872102;
 //BA.debugLineNum = 22872102;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=22872105;
 //BA.debugLineNum = 22872105;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=22872111;
 //BA.debugLineNum = 22872111;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma el descuento adicional de un "+BA.NumberToString(_descuentoporc)+"%?"),BA.ObjectToCharSequence("Descuento global adicional"),"Confirmar","Cancelar","Ingresar otro dscto.",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=22872113;
 //BA.debugLineNum = 22872113;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 11;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22872115;
 //BA.debugLineNum = 22872115;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
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
RDebugUtils.currentLine=22872116;
 //BA.debugLineNum = 22872116;BA.debugLine="Return -1";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(-1));return;};
 if (true) break;
;
RDebugUtils.currentLine=22872119;
 //BA.debugLineNum = 22872119;BA.debugLine="If Result = xui.DialogResponse_Negative Then";

case 14:
//if
this.state = 35;
if (_result==_xui.DialogResponse_Negative) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=22872121;
 //BA.debugLineNum = 22872121;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22872122;
 //BA.debugLineNum = 22872122;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=22872124;
 //BA.debugLineNum = 22872124;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=22872125;
 //BA.debugLineNum = 22872125;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=22872127;
 //BA.debugLineNum = 22872127;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese descuen";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese descuento. Max "+BA.NumberToString(_descuentoporc)+"%"));
RDebugUtils.currentLine=22872128;
 //BA.debugLineNum = 22872128;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=22872129;
 //BA.debugLineNum = 22872129;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
parent.mostCurrent._inputtemplate._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22872131;
 //BA.debugLineNum = 22872131;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22872132;
 //BA.debugLineNum = 22872132;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=22872133;
 //BA.debugLineNum = 22872133;BA.debugLine="Try";
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
RDebugUtils.currentLine=22872134;
 //BA.debugLineNum = 22872134;BA.debugLine="Dim NewDescuentoPorc As Double = InputTempla";
_newdescuentoporc = (double)(Double.parseDouble(parent.mostCurrent._inputtemplate._text /*String*/ ));
RDebugUtils.currentLine=22872136;
 //BA.debugLineNum = 22872136;BA.debugLine="If NewDescuentoPorc > DescuentoPorc Then";
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
RDebugUtils.currentLine=22872137;
 //BA.debugLineNum = 22872137;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-c";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22872138;
 //BA.debugLineNum = 22872138;BA.debugLine="Msgbox2Async(\"El descuento no puede ser may";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El descuento no puede ser mayor a un "+BA.NumberToString(_descuentoporc)+"%"+anywheresoftware.b4a.keywords.Common.CRLF+"Debe ingresar un código de autorización"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22872140;
 //BA.debugLineNum = 22872140;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), null);
this.state = 41;
return;
case 41:
//C
this.state = 28;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22872141;
 //BA.debugLineNum = 22872141;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=22872143;
 //BA.debugLineNum = 22872143;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
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
RDebugUtils.currentLine=22872147;
 //BA.debugLineNum = 22872147;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222872147",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=22872148;
 //BA.debugLineNum = 22872148;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22872149;
 //BA.debugLineNum = 22872149;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22872150;
 //BA.debugLineNum = 22872150;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_buscar_dscto_x_cliente"), null);
this.state = 42;
return;
case 42:
//C
this.state = 31;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22872151;
 //BA.debugLineNum = 22872151;BA.debugLine="DescuentoPorc = -1";
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
RDebugUtils.currentLine=22872154;
 //BA.debugLineNum = 22872154;BA.debugLine="DescuentoPorc = -1";
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
RDebugUtils.currentLine=22872163;
 //BA.debugLineNum = 22872163;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
RDebugUtils.currentLine=22872165;
 //BA.debugLineNum = 22872165;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="Dim Existe As Boolean";
_existe = false;
RDebugUtils.currentLine=22937610;
 //BA.debugLineNum = 22937610;BA.debugLine="Dim Otorgado As Boolean";
_otorgado = false;
RDebugUtils.currentLine=22937611;
 //BA.debugLineNum = 22937611;BA.debugLine="Dim DescuentoPorc As Int = 0";
_descuentoporc = (int) (0);
RDebugUtils.currentLine=22937613;
 //BA.debugLineNum = 22937613;BA.debugLine="Dim Clave As String";
_clave = "";
RDebugUtils.currentLine=22937615;
 //BA.debugLineNum = 22937615;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese clave del descuento"));
RDebugUtils.currentLine=22937616;
 //BA.debugLineNum = 22937616;BA.debugLine="InputTemplate.Text = \"\"";
parent.mostCurrent._inputtemplate._text /*String*/  = "";
RDebugUtils.currentLine=22937618;
 //BA.debugLineNum = 22937618;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22937619;
 //BA.debugLineNum = 22937619;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=22937620;
 //BA.debugLineNum = 22937620;BA.debugLine="Clave = InputTemplate.Text";
_clave = parent.mostCurrent._inputtemplate._text /*String*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=22937622;
 //BA.debugLineNum = 22937622;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=22937626;
 //BA.debugLineNum = 22937626;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22937629;
 //BA.debugLineNum = 22937629;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_usar_dscto_poswii /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_clave,BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU"))),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22937630;
 //BA.debugLineNum = 22937630;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), (Object)(_js));
this.state = 36;
return;
case 36:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22937632;
 //BA.debugLineNum = 22937632;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22937634;
 //BA.debugLineNum = 22937634;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22937635;
 //BA.debugLineNum = 22937635;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22937637;
 //BA.debugLineNum = 22937637;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=22937639;
 //BA.debugLineNum = 22937639;BA.debugLine="Existe = Fila.Get(\"Existe\")";
_existe = BA.ObjectToBoolean(_fila.Get((Object)("Existe")));
RDebugUtils.currentLine=22937640;
 //BA.debugLineNum = 22937640;BA.debugLine="Otorgado = Fila.Get(\"Otorgado\")";
_otorgado = BA.ObjectToBoolean(_fila.Get((Object)("Otorgado")));
RDebugUtils.currentLine=22937641;
 //BA.debugLineNum = 22937641;BA.debugLine="DescuentoPorc = Fila.Get(\"Descuento\")";
_descuentoporc = (int)(BA.ObjectToNumber(_fila.Get((Object)("Descuento"))));
RDebugUtils.currentLine=22937643;
 //BA.debugLineNum = 22937643;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22937645;
 //BA.debugLineNum = 22937645;BA.debugLine="If Existe Then";
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
RDebugUtils.currentLine=22937646;
 //BA.debugLineNum = 22937646;BA.debugLine="If Otorgado Then";
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
RDebugUtils.currentLine=22937647;
 //BA.debugLineNum = 22937647;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Este descuento ya fue utilizado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22937648;
 //BA.debugLineNum = 22937648;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 37;
return;
case 37:
//C
this.state = 27;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22937649;
 //BA.debugLineNum = 22937649;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=22937651;
 //BA.debugLineNum = 22937651;BA.debugLine="If DescuentoPorc <=0 Then";
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
RDebugUtils.currentLine=22937652;
 //BA.debugLineNum = 22937652;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede incorporar este descuento, ya que no es un valor valido."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22937654;
 //BA.debugLineNum = 22937654;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "fx_insertar_dscto_global_permiso"), null);
this.state = 38;
return;
case 38:
//C
this.state = 26;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22937655;
 //BA.debugLineNum = 22937655;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = (int) (0);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=22937657;
 //BA.debugLineNum = 22937657;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=22937658;
 //BA.debugLineNum = 22937658;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Descuento aceptado."+anywheresoftware.b4a.keywords.Common.CRLF+"Porc.Dscto: "+BA.NumberToString(_descuentoporc)+"%"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22937659;
 //BA.debugLineNum = 22937659;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22937663;
 //BA.debugLineNum = 22937663;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la clave para el descuento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22937664;
 //BA.debugLineNum = 22937664;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22937669;
 //BA.debugLineNum = 22937669;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error de conexión con el servidor"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22937670;
 //BA.debugLineNum = 22937670;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22937673;
 //BA.debugLineNum = 22937673;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22937674;
 //BA.debugLineNum = 22937674;BA.debugLine="Return DescuentoPorc";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_descuentoporc));return;};
RDebugUtils.currentLine=22937676;
 //BA.debugLineNum = 22937676;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub Sb_Procesar_Fila(Cabeza As String, Id_DocDet2";
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Dim Fila,Fila_Id As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet2);
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
_fila_id = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet2);
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
_fila = mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(_fila.Get((Object)("untrans"))));
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(_fila.Get((Object)("poriva"))));
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(_fila.Get((Object)("porila"))));
RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(_fila.Get((Object)("rtu"))));
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
RDebugUtils.currentLine=21364756;
 //BA.debugLineNum = 21364756;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="Dim Precio As Double = Fila.Get(Cabeza.ToLowerCas";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)(_cabeza.toLowerCase()))));
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
RDebugUtils.currentLine=21364764;
 //BA.debugLineNum = 21364764;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
RDebugUtils.currentLine=21364769;
 //BA.debugLineNum = 21364769;BA.debugLine="Dim Total As Double";
_total = 0;
RDebugUtils.currentLine=21364771;
 //BA.debugLineNum = 21364771;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
RDebugUtils.currentLine=21364773;
 //BA.debugLineNum = 21364773;BA.debugLine="Dim Cantidad As Double";
_cantidad = 0;
RDebugUtils.currentLine=21364774;
 //BA.debugLineNum = 21364774;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
RDebugUtils.currentLine=21364775;
 //BA.debugLineNum = 21364775;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
RDebugUtils.currentLine=21364777;
 //BA.debugLineNum = 21364777;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
_divisible = "";
RDebugUtils.currentLine=21364778;
 //BA.debugLineNum = 21364778;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
_divisible2 = "";
RDebugUtils.currentLine=21364780;
 //BA.debugLineNum = 21364780;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor"))));
RDebugUtils.currentLine=21364781;
 //BA.debugLineNum = 21364781;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=21364782;
 //BA.debugLineNum = 21364782;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=21364783;
 //BA.debugLineNum = 21364783;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(_fila.Get((Object)("descmaximo"))));
RDebugUtils.currentLine=21364785;
 //BA.debugLineNum = 21364785;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(_fila.Get((Object)("tict")));
RDebugUtils.currentLine=21364786;
 //BA.debugLineNum = 21364786;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(_fila.Get((Object)("prct")));
RDebugUtils.currentLine=21364787;
 //BA.debugLineNum = 21364787;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(_fila.Get((Object)("tipr")));
RDebugUtils.currentLine=21364789;
 //BA.debugLineNum = 21364789;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("codlista")));
RDebugUtils.currentLine=21364791;
 //BA.debugLineNum = 21364791;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
RDebugUtils.currentLine=21364793;
 //BA.debugLineNum = 21364793;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
RDebugUtils.currentLine=21364794;
 //BA.debugLineNum = 21364794;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
RDebugUtils.currentLine=21364796;
 //BA.debugLineNum = 21364796;BA.debugLine="If No_Aplica_Redondeo Then";
if (_no_aplica_redondeo) { 
RDebugUtils.currentLine=21364797;
 //BA.debugLineNum = 21364797;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=21364800;
 //BA.debugLineNum = 21364800;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
RDebugUtils.currentLine=21364801;
 //BA.debugLineNum = 21364801;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
RDebugUtils.currentLine=21364803;
 //BA.debugLineNum = 21364803;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
RDebugUtils.currentLine=21364804;
 //BA.debugLineNum = 21364804;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
RDebugUtils.currentLine=21364808;
 //BA.debugLineNum = 21364808;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor_anterior"))));
RDebugUtils.currentLine=21364809;
 //BA.debugLineNum = 21364809;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
RDebugUtils.currentLine=21364811;
 //BA.debugLineNum = 21364811;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (_cantidad==0 && (_tipr).equals("") == false) { 
 };
RDebugUtils.currentLine=21364818;
 //BA.debugLineNum = 21364818;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
RDebugUtils.currentLine=21364820;
 //BA.debugLineNum = 21364820;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("moneda_doc")));
RDebugUtils.currentLine=21364821;
 //BA.debugLineNum = 21364821;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
_tipo_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("tipomoneda")));
RDebugUtils.currentLine=21364822;
 //BA.debugLineNum = 21364822;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("tasadorig_doc"))));
RDebugUtils.currentLine=21364824;
 //BA.debugLineNum = 21364824;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(_fila.Get((Object)("moneda")));
RDebugUtils.currentLine=21364825;
 //BA.debugLineNum = 21364825;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(_fila.Get((Object)("tipo_moneda")));
RDebugUtils.currentLine=21364826;
 //BA.debugLineNum = 21364826;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(_fila.Get((Object)("tipo_cambio"))));
RDebugUtils.currentLine=21364828;
 //BA.debugLineNum = 21364828;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
RDebugUtils.currentLine=21364830;
 //BA.debugLineNum = 21364830;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
RDebugUtils.currentLine=21364831;
 //BA.debugLineNum = 21364831;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if ((_tipo_moneda_enc).equals("N")) { 
RDebugUtils.currentLine=21364832;
 //BA.debugLineNum = 21364832;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio*_tipo_cambio_ent,(int) (2));
 }else {
RDebugUtils.currentLine=21364834;
 //BA.debugLineNum = 21364834;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
RDebugUtils.currentLine=21364835;
 //BA.debugLineNum = 21364835;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 }else {
RDebugUtils.currentLine=21364838;
 //BA.debugLineNum = 21364838;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=21364839;
 //BA.debugLineNum = 21364839;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
RDebugUtils.currentLine=21364841;
 //BA.debugLineNum = 21364841;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 };
RDebugUtils.currentLine=21364846;
 //BA.debugLineNum = 21364846;BA.debugLine="Dim Divi As String";
_divi = "";
RDebugUtils.currentLine=21364848;
 //BA.debugLineNum = 21364848;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=21364849;
 //BA.debugLineNum = 21364849;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 };
RDebugUtils.currentLine=21364852;
 //BA.debugLineNum = 21364852;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=21364853;
 //BA.debugLineNum = 21364853;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 };
RDebugUtils.currentLine=21364868;
 //BA.debugLineNum = 21364868;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=21364869;
 //BA.debugLineNum = 21364869;BA.debugLine="If Rtu = 1 Then";
if (_rtu==1) { 
RDebugUtils.currentLine=21364870;
 //BA.debugLineNum = 21364870;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=21364871;
 //BA.debugLineNum = 21364871;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=21364873;
 //BA.debugLineNum = 21364873;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=21364874;
 //BA.debugLineNum = 21364874;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=21364878;
 //BA.debugLineNum = 21364878;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=21364879;
 //BA.debugLineNum = 21364879;BA.debugLine="If Rtu > 1 Then";
if (_rtu>1) { 
RDebugUtils.currentLine=21364880;
 //BA.debugLineNum = 21364880;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=21364881;
 //BA.debugLineNum = 21364881;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=21364883;
 //BA.debugLineNum = 21364883;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=21364884;
 //BA.debugLineNum = 21364884;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=21364888;
 //BA.debugLineNum = 21364888;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=21364898;
 //BA.debugLineNum = 21364898;BA.debugLine="TotalNeto_Calculo = Lbl_Total_Neto.Tag";
_totalneto_calculo = (double)(BA.ObjectToNumber(mostCurrent._lbl_total_neto.getTag()));
RDebugUtils.currentLine=21364899;
 //BA.debugLineNum = 21364899;BA.debugLine="TotalBruto_Calculo = Lbl_Total_Bruto.Tag";
_totalbruto_calculo = (double)(BA.ObjectToNumber(mostCurrent._lbl_total_bruto.getTag()));
RDebugUtils.currentLine=21364901;
 //BA.debugLineNum = 21364901;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=21364903;
 //BA.debugLineNum = 21364903;BA.debugLine="Descontar = True";
_descontar = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21364904;
 //BA.debugLineNum = 21364904;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
RDebugUtils.currentLine=21364904;
 //BA.debugLineNum = 21364904;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
RDebugUtils.currentLine=21364904;
 //BA.debugLineNum = 21364904;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
RDebugUtils.currentLine=21364905;
 //BA.debugLineNum = 21364905;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
RDebugUtils.currentLine=21364907;
 //BA.debugLineNum = 21364907;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=21364909;
 //BA.debugLineNum = 21364909;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21364910;
 //BA.debugLineNum = 21364910;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21364912;
 //BA.debugLineNum = 21364912;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=21364914;
 //BA.debugLineNum = 21364914;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21364916;
 //BA.debugLineNum = 21364916;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=21364919;
 //BA.debugLineNum = 21364919;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=21364921;
 //BA.debugLineNum = 21364921;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21364923;
 //BA.debugLineNum = 21364923;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=21364926;
 //BA.debugLineNum = 21364926;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 }else 
{RDebugUtils.currentLine=21364931;
 //BA.debugLineNum = 21364931;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=21364933;
 //BA.debugLineNum = 21364933;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=21364934;
 //BA.debugLineNum = 21364934;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(_fila.Get((Object)("recargovalor"))));
RDebugUtils.currentLine=21364936;
 //BA.debugLineNum = 21364936;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21364937;
 //BA.debugLineNum = 21364937;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 }else {
RDebugUtils.currentLine=21364939;
 //BA.debugLineNum = 21364939;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_total_concepto/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=21364940;
 //BA.debugLineNum = 21364940;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 };
RDebugUtils.currentLine=21364943;
 //BA.debugLineNum = 21364943;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=21364945;
 //BA.debugLineNum = 21364945;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=21364946;
 //BA.debugLineNum = 21364946;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=21364948;
 //BA.debugLineNum = 21364948;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
RDebugUtils.currentLine=21364950;
 //BA.debugLineNum = 21364950;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21364952;
 //BA.debugLineNum = 21364952;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21364953;
 //BA.debugLineNum = 21364953;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = anywheresoftware.b4a.keywords.Common.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21364955;
 //BA.debugLineNum = 21364955;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
RDebugUtils.currentLine=21364956;
 //BA.debugLineNum = 21364956;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 }else {
RDebugUtils.currentLine=21364960;
 //BA.debugLineNum = 21364960;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21364962;
 //BA.debugLineNum = 21364962;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=21364966;
 //BA.debugLineNum = 21364966;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
if ((_cabeza).equals("ValNetoLinea")) { 
RDebugUtils.currentLine=21364968;
 //BA.debugLineNum = 21364968;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=21364969;
 //BA.debugLineNum = 21364969;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=21364971;
 //BA.debugLineNum = 21364971;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21364973;
 //BA.debugLineNum = 21364973;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 }else {
RDebugUtils.currentLine=21364976;
 //BA.debugLineNum = 21364976;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 };
RDebugUtils.currentLine=21364979;
 //BA.debugLineNum = 21364979;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 }}
;
RDebugUtils.currentLine=21364983;
 //BA.debugLineNum = 21364983;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 }}
;
 }else {
RDebugUtils.currentLine=21364999;
 //BA.debugLineNum = 21364999;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365000;
 //BA.debugLineNum = 21365000;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 }else {
RDebugUtils.currentLine=21365002;
 //BA.debugLineNum = 21365002;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio_calculado/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=21365003;
 //BA.debugLineNum = 21365003;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 };
RDebugUtils.currentLine=21365006;
 //BA.debugLineNum = 21365006;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_precioneto*_cantidad,(int) (3));
RDebugUtils.currentLine=21365007;
 //BA.debugLineNum = 21365007;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21365009;
 //BA.debugLineNum = 21365009;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
RDebugUtils.currentLine=21365011;
 //BA.debugLineNum = 21365011;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=21365012;
 //BA.debugLineNum = 21365012;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
RDebugUtils.currentLine=21365024;
 //BA.debugLineNum = 21365024;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
RDebugUtils.currentLine=21365025;
 //BA.debugLineNum = 21365025;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
RDebugUtils.currentLine=21365029;
 //BA.debugLineNum = 21365029;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
RDebugUtils.currentLine=21365031;
 //BA.debugLineNum = 21365031;BA.debugLine="If Precio > 0 Then";
if (_precio>0) { 
RDebugUtils.currentLine=21365033;
 //BA.debugLineNum = 21365033;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365035;
 //BA.debugLineNum = 21365035;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21365037;
 //BA.debugLineNum = 21365037;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=21365041;
 //BA.debugLineNum = 21365041;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21365043;
 //BA.debugLineNum = 21365043;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else 
{RDebugUtils.currentLine=21365049;
 //BA.debugLineNum = 21365049;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=21365051;
 //BA.debugLineNum = 21365051;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365053;
 //BA.debugLineNum = 21365053;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=21365056;
 //BA.debugLineNum = 21365056;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 };
RDebugUtils.currentLine=21365064;
 //BA.debugLineNum = 21365064;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=21365065;
 //BA.debugLineNum = 21365065;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
_fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
RDebugUtils.currentLine=21365066;
 //BA.debugLineNum = 21365066;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
_fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
RDebugUtils.currentLine=21365068;
 //BA.debugLineNum = 21365068;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
_fila.Put((Object)("DsctoRealPorc"),(Object)(0));
RDebugUtils.currentLine=21365069;
 //BA.debugLineNum = 21365069;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
_fila.Put((Object)("DsctoRealValor"),(Object)(0));
RDebugUtils.currentLine=21365071;
 //BA.debugLineNum = 21365071;BA.debugLine="Fila.Put(\"descmaximo\",DescuentoPorc)";
_fila.Put((Object)("descmaximo"),(Object)(_descuentoporc));
RDebugUtils.currentLine=21365081;
 //BA.debugLineNum = 21365081;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
RDebugUtils.currentLine=21365083;
 //BA.debugLineNum = 21365083;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=21365084;
 //BA.debugLineNum = 21365084;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
RDebugUtils.currentLine=21365085;
 //BA.debugLineNum = 21365085;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
RDebugUtils.currentLine=21365087;
 //BA.debugLineNum = 21365087;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=21365089;
 //BA.debugLineNum = 21365089;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
RDebugUtils.currentLine=21365091;
 //BA.debugLineNum = 21365091;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365092;
 //BA.debugLineNum = 21365092;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 }else {
RDebugUtils.currentLine=21365094;
 //BA.debugLineNum = 21365094;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 };
RDebugUtils.currentLine=21365100;
 //BA.debugLineNum = 21365100;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
RDebugUtils.currentLine=21365101;
 //BA.debugLineNum = 21365101;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(_fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
RDebugUtils.currentLine=21365102;
 //BA.debugLineNum = 21365102;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = anywheresoftware.b4a.keywords.Common.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
RDebugUtils.currentLine=21365104;
 //BA.debugLineNum = 21365104;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
RDebugUtils.currentLine=21365106;
 //BA.debugLineNum = 21365106;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (_valor_dscto_real>0) { 
RDebugUtils.currentLine=21365107;
 //BA.debugLineNum = 21365107;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = anywheresoftware.b4a.keywords.Common.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 };
RDebugUtils.currentLine=21365114;
 //BA.debugLineNum = 21365114;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(_fila.Get((Object)("codfunautoriza")));
RDebugUtils.currentLine=21365116;
 //BA.debugLineNum = 21365116;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
RDebugUtils.currentLine=21365117;
 //BA.debugLineNum = 21365117;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
RDebugUtils.currentLine=21365119;
 //BA.debugLineNum = 21365119;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if ((_codfunautoriza).equals("xyz")) { 
_codfunautoriza = "";};
RDebugUtils.currentLine=21365121;
 //BA.debugLineNum = 21365121;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (_precio_cn_dscto<_precio_netolista) { 
RDebugUtils.currentLine=21365123;
 //BA.debugLineNum = 21365123;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
RDebugUtils.currentLine=21365125;
 //BA.debugLineNum = 21365125;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (_descmaximo==0) { 
_descmaximo = 0.5;};
RDebugUtils.currentLine=21365127;
 //BA.debugLineNum = 21365127;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (_dscto_real>_descmaximo) { 
RDebugUtils.currentLine=21365129;
 //BA.debugLineNum = 21365129;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21365131;
 //BA.debugLineNum = 21365131;BA.debugLine="If Vizado Then";
if (_vizado) { 
RDebugUtils.currentLine=21365132;
 //BA.debugLineNum = 21365132;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=21365137;
 //BA.debugLineNum = 21365137;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
RDebugUtils.currentLine=21365138;
 //BA.debugLineNum = 21365138;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
RDebugUtils.currentLine=21365146;
 //BA.debugLineNum = 21365146;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
RDebugUtils.currentLine=21365148;
 //BA.debugLineNum = 21365148;BA.debugLine="If Precio <> PrecioLista Then";
if (_precio!=_preciolista) { 
RDebugUtils.currentLine=21365149;
 //BA.debugLineNum = 21365149;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = anywheresoftware.b4a.keywords.Common.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 };
RDebugUtils.currentLine=21365152;
 //BA.debugLineNum = 21365152;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
if (_dscto_real>_valor_dscto) { 
RDebugUtils.currentLine=21365154;
 //BA.debugLineNum = 21365154;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
RDebugUtils.currentLine=21365157;
 //BA.debugLineNum = 21365157;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=21365162;
 //BA.debugLineNum = 21365162;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 };
 };
 }else {
RDebugUtils.currentLine=21365184;
 //BA.debugLineNum = 21365184;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=21365190;
 //BA.debugLineNum = 21365190;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365192;
 //BA.debugLineNum = 21365192;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 }else {
RDebugUtils.currentLine=21365196;
 //BA.debugLineNum = 21365196;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 };
RDebugUtils.currentLine=21365202;
 //BA.debugLineNum = 21365202;BA.debugLine="If Chk_Valores_Netos.Checked Then ' SI VALORES SO";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365204;
 //BA.debugLineNum = 21365204;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21365205;
 //BA.debugLineNum = 21365205;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=21365206;
 //BA.debugLineNum = 21365206;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=21365207;
 //BA.debugLineNum = 21365207;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=21365208;
 //BA.debugLineNum = 21365208;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=21365210;
 //BA.debugLineNum = 21365210;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
RDebugUtils.currentLine=21365212;
 //BA.debugLineNum = 21365212;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
RDebugUtils.currentLine=21365213;
 //BA.debugLineNum = 21365213;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
_preciobruto = anywheresoftware.b4a.keywords.Common.Round2(_precio*_impuestos,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=21365215;
 //BA.debugLineNum = 21365215;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=21365216;
 //BA.debugLineNum = 21365216;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = anywheresoftware.b4a.keywords.Common.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 };
RDebugUtils.currentLine=21365219;
 //BA.debugLineNum = 21365219;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=21365221;
 //BA.debugLineNum = 21365221;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
RDebugUtils.currentLine=21365222;
 //BA.debugLineNum = 21365222;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 };
 }else {
RDebugUtils.currentLine=21365228;
 //BA.debugLineNum = 21365228;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=21365229;
 //BA.debugLineNum = 21365229;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=21365230;
 //BA.debugLineNum = 21365230;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (anywheresoftware.b4a.keywords.Common.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=21365231;
 //BA.debugLineNum = 21365231;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=21365232;
 //BA.debugLineNum = 21365232;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
RDebugUtils.currentLine=21365234;
 //BA.debugLineNum = 21365234;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
RDebugUtils.currentLine=21365235;
 //BA.debugLineNum = 21365235;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = anywheresoftware.b4a.keywords.Common.Round2(_precio/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=21365237;
 //BA.debugLineNum = 21365237;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=21365239;
 //BA.debugLineNum = 21365239;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
RDebugUtils.currentLine=21365240;
 //BA.debugLineNum = 21365240;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 };
 };
RDebugUtils.currentLine=21365296;
 //BA.debugLineNum = 21365296;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=21365298;
 //BA.debugLineNum = 21365298;BA.debugLine="Dim Multiplo As Int";
_multiplo = 0;
RDebugUtils.currentLine=21365300;
 //BA.debugLineNum = 21365300;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=21365301;
 //BA.debugLineNum = 21365301;BA.debugLine="Multiplo = -1";
_multiplo = (int) (-1);
 }else 
{RDebugUtils.currentLine=21365302;
 //BA.debugLineNum = 21365302;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=21365303;
 //BA.debugLineNum = 21365303;BA.debugLine="Multiplo = 1";
_multiplo = (int) (1);
 }}
;
RDebugUtils.currentLine=21365306;
 //BA.debugLineNum = 21365306;BA.debugLine="If Chk_Valores_Netos.Checked Then";
if (mostCurrent._chk_valores_netos.getChecked()) { 
RDebugUtils.currentLine=21365308;
 //BA.debugLineNum = 21365308;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*_multiplo;
RDebugUtils.currentLine=21365309;
 //BA.debugLineNum = 21365309;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 }else {
RDebugUtils.currentLine=21365313;
 //BA.debugLineNum = 21365313;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*_multiplo;
RDebugUtils.currentLine=21365314;
 //BA.debugLineNum = 21365314;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 };
 };
RDebugUtils.currentLine=21365320;
 //BA.debugLineNum = 21365320;BA.debugLine="If Prct = 0 Then";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=21365322;
 //BA.debugLineNum = 21365322;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=21365324;
 //BA.debugLineNum = 21365324;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=21365325;
 //BA.debugLineNum = 21365325;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_totalneto/(double)_cantud2,(int) (5));
RDebugUtils.currentLine=21365327;
 //BA.debugLineNum = 21365327;BA.debugLine="If Chk_Valores_Netos.Checked = False Then";
if (mostCurrent._chk_valores_netos.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=21365328;
 //BA.debugLineNum = 21365328;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 };
 }else {
RDebugUtils.currentLine=21365332;
 //BA.debugLineNum = 21365332;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=21365333;
 //BA.debugLineNum = 21365333;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 };
 };
RDebugUtils.currentLine=21365374;
 //BA.debugLineNum = 21365374;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = anywheresoftware.b4a.keywords.Common.Round2(_totalila,(int) (2));
RDebugUtils.currentLine=21365375;
 //BA.debugLineNum = 21365375;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = anywheresoftware.b4a.keywords.Common.Round2(_totaliva,(int) (2));
RDebugUtils.currentLine=21365376;
 //BA.debugLineNum = 21365376;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = anywheresoftware.b4a.keywords.Common.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=21365377;
 //BA.debugLineNum = 21365377;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
_totalbruto = anywheresoftware.b4a.keywords.Common.Round2(_totalbruto,(int) (0));
RDebugUtils.currentLine=21365386;
 //BA.debugLineNum = 21365386;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
_fila.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=21365387;
 //BA.debugLineNum = 21365387;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
_fila.Put((Object)("cantud1"),(Object)(_cantud1));
RDebugUtils.currentLine=21365388;
 //BA.debugLineNum = 21365388;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
_fila.Put((Object)("cantud2"),(Object)(_cantud2));
RDebugUtils.currentLine=21365390;
 //BA.debugLineNum = 21365390;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
_fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
RDebugUtils.currentLine=21365391;
 //BA.debugLineNum = 21365391;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
_fila.Put((Object)("valivalinea"),(Object)(_totaliva));
RDebugUtils.currentLine=21365392;
 //BA.debugLineNum = 21365392;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
_fila.Put((Object)("valilalinea"),(Object)(_totalila));
RDebugUtils.currentLine=21365393;
 //BA.debugLineNum = 21365393;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
_fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
RDebugUtils.currentLine=21365395;
 //BA.debugLineNum = 21365395;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
_fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
RDebugUtils.currentLine=21365396;
 //BA.debugLineNum = 21365396;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
_fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
RDebugUtils.currentLine=21365398;
 //BA.debugLineNum = 21365398;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
_fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
RDebugUtils.currentLine=21365399;
 //BA.debugLineNum = 21365399;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
_fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
RDebugUtils.currentLine=21365401;
 //BA.debugLineNum = 21365401;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row_Us";
_fila.Put((Object)("codfuncionario"),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=21365402;
 //BA.debugLineNum = 21365402;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Usuar";
_fila.Put((Object)("codvendedor"),mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=21365404;
 //BA.debugLineNum = 21365404;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_Doc";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_fila,_fila_id);
RDebugUtils.currentLine=21365406;
 //BA.debugLineNum = 21365406;BA.debugLine="Sb_Cargar_Detalle(True)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21365411;
 //BA.debugLineNum = 21365411;BA.debugLine="End Sub";
return "";
}
public static String  _btn_editar_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_editar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_editar_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub Btn_Editar_Click";
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="If	Hay_Descuentos_Globales Then";
if (_hay_descuentos_globales) { 
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE EDITAR LA FILA"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21168138;
 //BA.debugLineNum = 21168138;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21168141;
 //BA.debugLineNum = 21168141;BA.debugLine="Dim Btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=21168143;
 //BA.debugLineNum = 21168143;BA.debugLine="Id_DocDet = Btn.Tag";
_id_docdet = (int)(BA.ObjectToNumber(_btn.getTag()));
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="EditandoProducto = True";
_editandoproducto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21168145;
 //BA.debugLineNum = 21168145;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
mostCurrent._frm_post_01_producto._id_docdet /*int*/  = _id_docdet;
RDebugUtils.currentLine=21168146;
 //BA.debugLineNum = 21168146;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_producto.getObject()));
RDebugUtils.currentLine=21168148;
 //BA.debugLineNum = 21168148;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="Btn_Grabar.Enabled = False";
parent.mostCurrent._btn_grabar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="If Editar_Documento Then";
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
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="Wait For (Sb_Editar_Documento)  Complete (Result";
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
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="Wait For (Sb_Grabara_Nuevo_Documento) Complete (";
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
RDebugUtils.currentLine=22413322;
 //BA.debugLineNum = 22413322;BA.debugLine="Btn_Grabar.Enabled = True";
parent.mostCurrent._btn_grabar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22413324;
 //BA.debugLineNum = 22413324;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), _sb_grabar_standby());
this.state = 79;
return;
case 79:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=22544393;
 //BA.debugLineNum = 22544393;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544394;
 //BA.debugLineNum = 22544394;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe detalle en el documento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544395;
 //BA.debugLineNum = 22544395;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=22544398;
 //BA.debugLineNum = 22544398;BA.debugLine="If Result = 4 Then";

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
RDebugUtils.currentLine=22544402;
 //BA.debugLineNum = 22544402;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544403;
 //BA.debugLineNum = 22544403;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence("Documento Stand-By"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22544404;
 //BA.debugLineNum = 22544404;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 80;
return;
case 80:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544405;
 //BA.debugLineNum = 22544405;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=22544408;
 //BA.debugLineNum = 22544408;BA.debugLine="Dim Tido As String = TipoDoc";
_tido = parent._tipodoc;
RDebugUtils.currentLine=22544409;
 //BA.debugLineNum = 22544409;BA.debugLine="Dim Cambiar_NroDocumento As Boolean = False";
_cambiar_nrodocumento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22544411;
 //BA.debugLineNum = 22544411;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)(_tido));
RDebugUtils.currentLine=22544412;
 //BA.debugLineNum = 22544412;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=22544414;
 //BA.debugLineNum = 22544414;BA.debugLine="If Tido = \"NVV\" Then";
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
RDebugUtils.currentLine=22544416;
 //BA.debugLineNum = 22544416;BA.debugLine="Cambiar_NroDocumento = True";
_cambiar_nrodocumento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22544418;
 //BA.debugLineNum = 22544418;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), _sb_recorrer_detalle_rev_stock());
this.state = 81;
return;
case 81:
//C
this.state = 13;
_result2 = (Boolean) result[0];
;
RDebugUtils.currentLine=22544426;
 //BA.debugLineNum = 22544426;BA.debugLine="If Result2 = False Then";
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
RDebugUtils.currentLine=22544428;
 //BA.debugLineNum = 22544428;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00015"));
this.state = 82;
return;
case 82:
//C
this.state = 16;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=22544430;
 //BA.debugLineNum = 22544430;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=22544431;
 //BA.debugLineNum = 22544431;BA.debugLine="Return True";
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
RDebugUtils.currentLine=22544438;
 //BA.debugLineNum = 22544438;BA.debugLine="ProgressDialogShow(\"Actualizando el documento...\"";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando el documento..."));
RDebugUtils.currentLine=22544441;
 //BA.debugLineNum = 22544441;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=22544451;
 //BA.debugLineNum = 22544451;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
RDebugUtils.currentLine=22544452;
 //BA.debugLineNum = 22544452;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22544453;
 //BA.debugLineNum = 22544453;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
RDebugUtils.currentLine=22544455;
 //BA.debugLineNum = 22544455;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
RDebugUtils.currentLine=22544456;
 //BA.debugLineNum = 22544456;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22544457;
 //BA.debugLineNum = 22544457;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
RDebugUtils.currentLine=22544459;
 //BA.debugLineNum = 22544459;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
RDebugUtils.currentLine=22544460;
 //BA.debugLineNum = 22544460;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22544461;
 //BA.debugLineNum = 22544461;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
RDebugUtils.currentLine=22544463;
 //BA.debugLineNum = 22544463;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
RDebugUtils.currentLine=22544464;
 //BA.debugLineNum = 22544464;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22544465;
 //BA.debugLineNum = 22544465;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
RDebugUtils.currentLine=22544467;
 //BA.debugLineNum = 22544467;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
RDebugUtils.currentLine=22544468;
 //BA.debugLineNum = 22544468;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22544469;
 //BA.debugLineNum = 22544469;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
RDebugUtils.currentLine=22544471;
 //BA.debugLineNum = 22544471;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
_array_despafacil = _generaarreglo("DespaFacil_Doc");
RDebugUtils.currentLine=22544472;
 //BA.debugLineNum = 22544472;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22544473;
 //BA.debugLineNum = 22544473;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
_despafacil = new anywheresoftware.b4a.objects.collections.Map();
_despafacil = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_despafacil));
RDebugUtils.currentLine=22544475;
 //BA.debugLineNum = 22544475;BA.debugLine="Dim Json_Encabezado As String";
_json_encabezado = "";
RDebugUtils.currentLine=22544476;
 //BA.debugLineNum = 22544476;BA.debugLine="Dim Json_Detalle As String";
_json_detalle = "";
RDebugUtils.currentLine=22544477;
 //BA.debugLineNum = 22544477;BA.debugLine="Dim Json_Descuentos As String";
_json_descuentos = "";
RDebugUtils.currentLine=22544478;
 //BA.debugLineNum = 22544478;BA.debugLine="Dim Json_Obseravciones As String";
_json_obseravciones = "";
RDebugUtils.currentLine=22544479;
 //BA.debugLineNum = 22544479;BA.debugLine="Dim Json_DespaFacil As String";
_json_despafacil = "";
RDebugUtils.currentLine=22544481;
 //BA.debugLineNum = 22544481;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22544482;
 //BA.debugLineNum = 22544482;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
RDebugUtils.currentLine=22544483;
 //BA.debugLineNum = 22544483;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
RDebugUtils.currentLine=22544484;
 //BA.debugLineNum = 22544484;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22544485;
 //BA.debugLineNum = 22544485;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
RDebugUtils.currentLine=22544486;
 //BA.debugLineNum = 22544486;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
_json_encabezado = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22544488;
 //BA.debugLineNum = 22544488;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22544489;
 //BA.debugLineNum = 22544489;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
RDebugUtils.currentLine=22544490;
 //BA.debugLineNum = 22544490;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
RDebugUtils.currentLine=22544491;
 //BA.debugLineNum = 22544491;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22544492;
 //BA.debugLineNum = 22544492;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
RDebugUtils.currentLine=22544493;
 //BA.debugLineNum = 22544493;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
_json_detalle = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22544495;
 //BA.debugLineNum = 22544495;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22544496;
 //BA.debugLineNum = 22544496;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
RDebugUtils.currentLine=22544497;
 //BA.debugLineNum = 22544497;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
RDebugUtils.currentLine=22544498;
 //BA.debugLineNum = 22544498;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22544499;
 //BA.debugLineNum = 22544499;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
RDebugUtils.currentLine=22544500;
 //BA.debugLineNum = 22544500;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
_json_descuentos = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22544502;
 //BA.debugLineNum = 22544502;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22544503;
 //BA.debugLineNum = 22544503;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
RDebugUtils.currentLine=22544504;
 //BA.debugLineNum = 22544504;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
RDebugUtils.currentLine=22544505;
 //BA.debugLineNum = 22544505;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22544506;
 //BA.debugLineNum = 22544506;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
RDebugUtils.currentLine=22544507;
 //BA.debugLineNum = 22544507;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
_json_obseravciones = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22544509;
 //BA.debugLineNum = 22544509;BA.debugLine="Dim DespaFaciljs As List";
_despafaciljs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22544510;
 //BA.debugLineNum = 22544510;BA.debugLine="DespaFaciljs.Initialize";
_despafaciljs.Initialize();
RDebugUtils.currentLine=22544511;
 //BA.debugLineNum = 22544511;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
_despafaciljs.Add((Object)(_despafacil.getObject()));
RDebugUtils.currentLine=22544512;
 //BA.debugLineNum = 22544512;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22544513;
 //BA.debugLineNum = 22544513;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
_jsongenerator.Initialize2(_despafaciljs);
RDebugUtils.currentLine=22544514;
 //BA.debugLineNum = 22544514;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
_json_despafacil = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22544516;
 //BA.debugLineNum = 22544516;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
_emailrandom = "EMAILCOMER";
RDebugUtils.currentLine=22544517;
 //BA.debugLineNum = 22544517;BA.debugLine="Dim Para As String";
_para = "";
RDebugUtils.currentLine=22544519;
 //BA.debugLineNum = 22544519;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
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
RDebugUtils.currentLine=22544520;
 //BA.debugLineNum = 22544520;BA.debugLine="Try";
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
RDebugUtils.currentLine=22544521;
 //BA.debugLineNum = 22544521;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
_para = BA.ObjectToString(parent._row_entidad.Get((Object)(_emailrandom)));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=22544523;
 //BA.debugLineNum = 22544523;BA.debugLine="Para = \"\"";
_para = "";
RDebugUtils.currentLine=22544524;
 //BA.debugLineNum = 22544524;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222544524",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
RDebugUtils.currentLine=22544528;
 //BA.debugLineNum = 22544528;BA.debugLine="Dim OldIdmaeedo As Int = Idmaeedo_Origen";
_oldidmaeedo = parent._idmaeedo_origen;
RDebugUtils.currentLine=22544529;
 //BA.debugLineNum = 22544529;BA.debugLine="Dim CodFuncionario As String = Variables.Global_R";
_codfuncionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=22544531;
 //BA.debugLineNum = 22544531;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Edi";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_editardocumentojsonbakapp2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_oldidmaeedo,_codfuncionario,_json_encabezado,_json_detalle,_json_descuentos,_json_obseravciones,_json_despafacil,_cambiar_nrodocumento);
RDebugUtils.currentLine=22544540;
 //BA.debugLineNum = 22544540;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), (Object)(_js));
this.state = 83;
return;
case 83:
//C
this.state = 32;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22544542;
 //BA.debugLineNum = 22544542;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22544544;
 //BA.debugLineNum = 22544544;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22544546;
 //BA.debugLineNum = 22544546;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22544548;
 //BA.debugLineNum = 22544548;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22544550;
 //BA.debugLineNum = 22544550;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=22544552;
 //BA.debugLineNum = 22544552;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
_idmaeedo = (int)(BA.ObjectToNumber(_respuesta.Get((Object)("Idmaeedo"))));
RDebugUtils.currentLine=22544553;
 //BA.debugLineNum = 22544553;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
RDebugUtils.currentLine=22544555;
 //BA.debugLineNum = 22544555;BA.debugLine="If Idmaeedo <> 0 Then";
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
RDebugUtils.currentLine=22544557;
 //BA.debugLineNum = 22544557;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"CodE";
_endo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad")));
RDebugUtils.currentLine=22544558;
 //BA.debugLineNum = 22544558;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"Co";
_suendo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad")));
RDebugUtils.currentLine=22544559;
 //BA.debugLineNum = 22544559;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
_tido = BA.ObjectToString(_respuesta.Get((Object)("Tido")));
RDebugUtils.currentLine=22544560;
 //BA.debugLineNum = 22544560;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
_nudo = BA.ObjectToString(_respuesta.Get((Object)("Nudo")));
RDebugUtils.currentLine=22544561;
 //BA.debugLineNum = 22544561;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
_obseravacion = BA.ObjectToString(parent._fila_observaciones.Get((Object)("Observacion")));
RDebugUtils.currentLine=22544562;
 //BA.debugLineNum = 22544562;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
_nroocc = BA.ObjectToString(parent._fila_observaciones.Get((Object)("NroOCC")));
RDebugUtils.currentLine=22544577;
 //BA.debugLineNum = 22544577;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
RDebugUtils.currentLine=22544580;
 //BA.debugLineNum = 22544580;BA.debugLine="Tab_Post.CurrentTab = 1";
parent.mostCurrent._tab_post.setCurrentTab((int) (1));
RDebugUtils.currentLine=22544581;
 //BA.debugLineNum = 22544581;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22544582;
 //BA.debugLineNum = 22544582;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22544583;
 //BA.debugLineNum = 22544583;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22544584;
 //BA.debugLineNum = 22544584;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
RDebugUtils.currentLine=22544585;
 //BA.debugLineNum = 22544585;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
RDebugUtils.currentLine=22544586;
 //BA.debugLineNum = 22544586;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
RDebugUtils.currentLine=22544587;
 //BA.debugLineNum = 22544587;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22544589;
 //BA.debugLineNum = 22544589;BA.debugLine="Msgbox2Async(\"Documento actualizado correctame";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Documento actualizado correctamente"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Enviar correo o imprimir","","Cerrar",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544590;
 //BA.debugLineNum = 22544590;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 84;
return;
case 84:
//C
this.state = 41;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544592;
 //BA.debugLineNum = 22544592;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=22544593;
 //BA.debugLineNum = 22544593;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=22544594;
 //BA.debugLineNum = 22544594;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=22544598;
 //BA.debugLineNum = 22544598;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"send-mail-b";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"send-mail-back-printer.png");
RDebugUtils.currentLine=22544599;
 //BA.debugLineNum = 22544599;BA.debugLine="Dim ErrorMailImp As Boolean";
_errormailimp = false;
RDebugUtils.currentLine=22544601;
 //BA.debugLineNum = 22544601;BA.debugLine="Msgbox2Async(\"Elija su opción\", Tido & \"-\" & N";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Elija su opción"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Imprimir","Enviar correo e imprimir","Enviar correo",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544602;
 //BA.debugLineNum = 22544602;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 85;
return;
case 85:
//C
this.state = 45;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544605;
 //BA.debugLineNum = 22544605;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=22544608;
 //BA.debugLineNum = 22544608;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 86;
return;
case 86:
//C
this.state = 48;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22544610;
 //BA.debugLineNum = 22544610;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22544611;
 //BA.debugLineNum = 22544611;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544612;
 //BA.debugLineNum = 22544612;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544613;
 //BA.debugLineNum = 22544613;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 87;
return;
case 87:
//C
this.state = 51;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544614;
 //BA.debugLineNum = 22544614;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
RDebugUtils.currentLine=22544620;
 //BA.debugLineNum = 22544620;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 52:
//if
this.state = 59;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=22544623;
 //BA.debugLineNum = 22544623;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 88;
return;
case 88:
//C
this.state = 55;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22544625;
 //BA.debugLineNum = 22544625;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22544626;
 //BA.debugLineNum = 22544626;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544627;
 //BA.debugLineNum = 22544627;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544628;
 //BA.debugLineNum = 22544628;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 89;
return;
case 89:
//C
this.state = 58;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544629;
 //BA.debugLineNum = 22544629;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;
;
RDebugUtils.currentLine=22544635;
 //BA.debugLineNum = 22544635;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 59:
//if
this.state = 70;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=22544638;
 //BA.debugLineNum = 22544638;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 90;
return;
case 90:
//C
this.state = 62;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22544640;
 //BA.debugLineNum = 22544640;BA.debugLine="Log(Resultado)";
anywheresoftware.b4a.keywords.Common.LogImpl("222544640",_resultado,0);
RDebugUtils.currentLine=22544641;
 //BA.debugLineNum = 22544641;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22544642;
 //BA.debugLineNum = 22544642;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544643;
 //BA.debugLineNum = 22544643;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544644;
 //BA.debugLineNum = 22544644;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 91;
return;
case 91:
//C
this.state = 65;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544645;
 //BA.debugLineNum = 22544645;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=22544649;
 //BA.debugLineNum = 22544649;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 92;
return;
case 92:
//C
this.state = 66;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22544651;
 //BA.debugLineNum = 22544651;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22544652;
 //BA.debugLineNum = 22544652;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-ca";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544653;
 //BA.debugLineNum = 22544653;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544654;
 //BA.debugLineNum = 22544654;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_editar_documento"), null);
this.state = 93;
return;
case 93:
//C
this.state = 69;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22544655;
 //BA.debugLineNum = 22544655;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
RDebugUtils.currentLine=22544660;
 //BA.debugLineNum = 22544660;BA.debugLine="If ErrorMailImp Then";

case 70:
//if
this.state = 73;
if (_errormailimp) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=22544662;
 //BA.debugLineNum = 22544662;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544663;
 //BA.debugLineNum = 22544663;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"+anywheresoftware.b4a.keywords.Common.CRLF+_tido+"-"+_nudo),BA.ObjectToCharSequence("Información"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22544665;
 //BA.debugLineNum = 22544665;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22544671;
 //BA.debugLineNum = 22544671;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=22544675;
 //BA.debugLineNum = 22544675;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22544677;
 //BA.debugLineNum = 22544677;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error al grabar"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22544678;
 //BA.debugLineNum = 22544678;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22544684;
 //BA.debugLineNum = 22544684;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22544686;
 //BA.debugLineNum = 22544686;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=22544688;
 //BA.debugLineNum = 22544688;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="Wait For(Sb_Grabar_StandBy) Complete (Result As I";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), _sb_grabar_standby());
this.state = 90;
return;
case 90:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="Msgbox2Async(\"No existe detalle en el documento\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No existe detalle en el documento"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22478859;
 //BA.debugLineNum = 22478859;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=22478862;
 //BA.debugLineNum = 22478862;BA.debugLine="If Result = 4 Then";

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
RDebugUtils.currentLine=22478866;
 //BA.debugLineNum = 22478866;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22478867;
 //BA.debugLineNum = 22478867;BA.debugLine="Msgbox2Async(\"Error!\", \"Documento Stand-By\", \"Ok";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence("Documento Stand-By"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22478868;
 //BA.debugLineNum = 22478868;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 91;
return;
case 91:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22478869;
 //BA.debugLineNum = 22478869;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=22478872;
 //BA.debugLineNum = 22478872;BA.debugLine="If Crear_NVV_Desde_COV Then";

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
RDebugUtils.currentLine=22478873;
 //BA.debugLineNum = 22478873;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=22478876;
 //BA.debugLineNum = 22478876;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"save.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"save.png");
RDebugUtils.currentLine=22478877;
 //BA.debugLineNum = 22478877;BA.debugLine="Msgbox2Async(\"Seleccione documento a grabar\", \"G";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Seleccione documento a grabar"),BA.ObjectToCharSequence("Grabar documento"),"NVV (Nota de venta)","Cancelar","COV (Cotización)",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22478878;
 //BA.debugLineNum = 22478878;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 92;
return;
case 92:
//C
this.state = 14;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22478880;
 //BA.debugLineNum = 22478880;BA.debugLine="Dim Tido As String = \"\"";
_tido = "";
RDebugUtils.currentLine=22478882;
 //BA.debugLineNum = 22478882;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=22478883;
 //BA.debugLineNum = 22478883;BA.debugLine="Tido = \"NVV\"";
_tido = "NVV";
 if (true) break;
;
RDebugUtils.currentLine=22478886;
 //BA.debugLineNum = 22478886;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 17:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=22478887;
 //BA.debugLineNum = 22478887;BA.debugLine="Tido = \"COV\"";
_tido = "COV";
 if (true) break;
;
RDebugUtils.currentLine=22478890;
 //BA.debugLineNum = 22478890;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 20:
//if
this.state = 23;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=22478891;
 //BA.debugLineNum = 22478891;BA.debugLine="Return True";
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
RDebugUtils.currentLine=22478895;
 //BA.debugLineNum = 22478895;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,Tido)";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)(_tido));
RDebugUtils.currentLine=22478896;
 //BA.debugLineNum = 22478896;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=22478898;
 //BA.debugLineNum = 22478898;BA.debugLine="If Tido = \"NVV\" Then";
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
RDebugUtils.currentLine=22478900;
 //BA.debugLineNum = 22478900;BA.debugLine="Wait For(Sb_Recorrer_Detalle_Rev_Stock) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), _sb_recorrer_detalle_rev_stock());
this.state = 93;
return;
case 93:
//C
this.state = 28;
_result2 = (Boolean) result[0];
;
RDebugUtils.currentLine=22478908;
 //BA.debugLineNum = 22478908;BA.debugLine="If Result2 = False Then";
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
RDebugUtils.currentLine=22478910;
 //BA.debugLineNum = 22478910;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00015"));
this.state = 94;
return;
case 94:
//C
this.state = 31;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=22478912;
 //BA.debugLineNum = 22478912;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=22478913;
 //BA.debugLineNum = 22478913;BA.debugLine="Return True";
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
RDebugUtils.currentLine=22478920;
 //BA.debugLineNum = 22478920;BA.debugLine="ProgressDialogShow(\"Creando documento...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Creando documento..."));
RDebugUtils.currentLine=22478923;
 //BA.debugLineNum = 22478923;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=22478933;
 //BA.debugLineNum = 22478933;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
RDebugUtils.currentLine=22478934;
 //BA.debugLineNum = 22478934;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22478935;
 //BA.debugLineNum = 22478935;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
RDebugUtils.currentLine=22478937;
 //BA.debugLineNum = 22478937;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
RDebugUtils.currentLine=22478938;
 //BA.debugLineNum = 22478938;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22478939;
 //BA.debugLineNum = 22478939;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
RDebugUtils.currentLine=22478941;
 //BA.debugLineNum = 22478941;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
RDebugUtils.currentLine=22478942;
 //BA.debugLineNum = 22478942;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22478943;
 //BA.debugLineNum = 22478943;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
RDebugUtils.currentLine=22478945;
 //BA.debugLineNum = 22478945;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
RDebugUtils.currentLine=22478946;
 //BA.debugLineNum = 22478946;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22478947;
 //BA.debugLineNum = 22478947;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
RDebugUtils.currentLine=22478949;
 //BA.debugLineNum = 22478949;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
RDebugUtils.currentLine=22478950;
 //BA.debugLineNum = 22478950;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22478951;
 //BA.debugLineNum = 22478951;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
RDebugUtils.currentLine=22478953;
 //BA.debugLineNum = 22478953;BA.debugLine="Dim Array_DespaFacil() As String = GeneraArreglo(";
_array_despafacil = _generaarreglo("DespaFacil_Doc");
RDebugUtils.currentLine=22478954;
 //BA.debugLineNum = 22478954;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22478955;
 //BA.debugLineNum = 22478955;BA.debugLine="Dim DespaFacil As Map = DBUtils.ExecuteJSON(Varia";
_despafacil = new anywheresoftware.b4a.objects.collections.Map();
_despafacil = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_despafacil));
RDebugUtils.currentLine=22478957;
 //BA.debugLineNum = 22478957;BA.debugLine="Dim Json_Encabezado As String";
_json_encabezado = "";
RDebugUtils.currentLine=22478958;
 //BA.debugLineNum = 22478958;BA.debugLine="Dim Json_Detalle As String";
_json_detalle = "";
RDebugUtils.currentLine=22478959;
 //BA.debugLineNum = 22478959;BA.debugLine="Dim Json_Descuentos As String";
_json_descuentos = "";
RDebugUtils.currentLine=22478960;
 //BA.debugLineNum = 22478960;BA.debugLine="Dim Json_Obseravciones As String";
_json_obseravciones = "";
RDebugUtils.currentLine=22478961;
 //BA.debugLineNum = 22478961;BA.debugLine="Dim Json_DespaFacil As String";
_json_despafacil = "";
RDebugUtils.currentLine=22478963;
 //BA.debugLineNum = 22478963;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22478964;
 //BA.debugLineNum = 22478964;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
RDebugUtils.currentLine=22478965;
 //BA.debugLineNum = 22478965;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
RDebugUtils.currentLine=22478966;
 //BA.debugLineNum = 22478966;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22478967;
 //BA.debugLineNum = 22478967;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
RDebugUtils.currentLine=22478968;
 //BA.debugLineNum = 22478968;BA.debugLine="Json_Encabezado = JSONGenerator.ToPrettyString(1)";
_json_encabezado = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22478970;
 //BA.debugLineNum = 22478970;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22478971;
 //BA.debugLineNum = 22478971;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
RDebugUtils.currentLine=22478972;
 //BA.debugLineNum = 22478972;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
RDebugUtils.currentLine=22478973;
 //BA.debugLineNum = 22478973;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22478974;
 //BA.debugLineNum = 22478974;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
RDebugUtils.currentLine=22478975;
 //BA.debugLineNum = 22478975;BA.debugLine="Json_Detalle = JSONGenerator.ToPrettyString(1)";
_json_detalle = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22478977;
 //BA.debugLineNum = 22478977;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22478978;
 //BA.debugLineNum = 22478978;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
RDebugUtils.currentLine=22478979;
 //BA.debugLineNum = 22478979;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
RDebugUtils.currentLine=22478980;
 //BA.debugLineNum = 22478980;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22478981;
 //BA.debugLineNum = 22478981;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
RDebugUtils.currentLine=22478982;
 //BA.debugLineNum = 22478982;BA.debugLine="Json_Descuentos = JSONGenerator.ToPrettyString(1)";
_json_descuentos = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22478984;
 //BA.debugLineNum = 22478984;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22478985;
 //BA.debugLineNum = 22478985;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
RDebugUtils.currentLine=22478986;
 //BA.debugLineNum = 22478986;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
RDebugUtils.currentLine=22478987;
 //BA.debugLineNum = 22478987;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22478988;
 //BA.debugLineNum = 22478988;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
RDebugUtils.currentLine=22478989;
 //BA.debugLineNum = 22478989;BA.debugLine="Json_Obseravciones = JSONGenerator.ToPrettyString";
_json_obseravciones = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22478991;
 //BA.debugLineNum = 22478991;BA.debugLine="Dim DespaFaciljs As List";
_despafaciljs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22478992;
 //BA.debugLineNum = 22478992;BA.debugLine="DespaFaciljs.Initialize";
_despafaciljs.Initialize();
RDebugUtils.currentLine=22478993;
 //BA.debugLineNum = 22478993;BA.debugLine="DespaFaciljs.Add(DespaFacil)";
_despafaciljs.Add((Object)(_despafacil.getObject()));
RDebugUtils.currentLine=22478994;
 //BA.debugLineNum = 22478994;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22478995;
 //BA.debugLineNum = 22478995;BA.debugLine="JSONGenerator.Initialize2(DespaFaciljs)";
_jsongenerator.Initialize2(_despafaciljs);
RDebugUtils.currentLine=22478996;
 //BA.debugLineNum = 22478996;BA.debugLine="Json_DespaFacil = JSONGenerator.ToPrettyString(1)";
_json_despafacil = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22478998;
 //BA.debugLineNum = 22478998;BA.debugLine="Dim EmailRandom As String = \"EMAILCOMER\" 'Variabl";
_emailrandom = "EMAILCOMER";
RDebugUtils.currentLine=22478999;
 //BA.debugLineNum = 22478999;BA.debugLine="Dim Para As String";
_para = "";
RDebugUtils.currentLine=22479001;
 //BA.debugLineNum = 22479001;BA.debugLine="If EmailRandom <> \"\" And EmailRandom <> Null Then";
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
RDebugUtils.currentLine=22479002;
 //BA.debugLineNum = 22479002;BA.debugLine="Try";
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
RDebugUtils.currentLine=22479003;
 //BA.debugLineNum = 22479003;BA.debugLine="Para = Row_Entidad.Get(EmailRandom)";
_para = BA.ObjectToString(parent._row_entidad.Get((Object)(_emailrandom)));
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=22479005;
 //BA.debugLineNum = 22479005;BA.debugLine="Para = \"\"";
_para = "";
RDebugUtils.currentLine=22479006;
 //BA.debugLineNum = 22479006;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222479006",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
RDebugUtils.currentLine=22479010;
 //BA.debugLineNum = 22479010;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Cre";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_creadocumentojsonbakapp2 /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json_encabezado,_json_detalle,_json_descuentos,_json_obseravciones,_json_despafacil);
RDebugUtils.currentLine=22479011;
 //BA.debugLineNum = 22479011;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), (Object)(_js));
this.state = 95;
return;
case 95:
//C
this.state = 47;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22479013;
 //BA.debugLineNum = 22479013;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22479015;
 //BA.debugLineNum = 22479015;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22479017;
 //BA.debugLineNum = 22479017;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22479019;
 //BA.debugLineNum = 22479019;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22479021;
 //BA.debugLineNum = 22479021;BA.debugLine="Dim Respuesta As Map = Funciones.Fx_DataRow(Js.";
_respuesta = new anywheresoftware.b4a.objects.collections.Map();
_respuesta = parent.mostCurrent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=22479023;
 //BA.debugLineNum = 22479023;BA.debugLine="Dim Idmaeedo As Int = Respuesta.Get(\"Idmaeedo\")";
_idmaeedo = (int)(BA.ObjectToNumber(_respuesta.Get((Object)("Idmaeedo"))));
RDebugUtils.currentLine=22479024;
 //BA.debugLineNum = 22479024;BA.debugLine="Dim Error As String = Respuesta.Get(\"Error\")";
_error = BA.ObjectToString(_respuesta.Get((Object)("Error")));
RDebugUtils.currentLine=22479026;
 //BA.debugLineNum = 22479026;BA.debugLine="If Idmaeedo <> 0 Then";
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
RDebugUtils.currentLine=22479028;
 //BA.debugLineNum = 22479028;BA.debugLine="Dim Endo As String = Fila_Encabezado.Get(\"code";
_endo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("codentidad")));
RDebugUtils.currentLine=22479029;
 //BA.debugLineNum = 22479029;BA.debugLine="Dim Suendo As String = Fila_Encabezado.Get(\"co";
_suendo = BA.ObjectToString(parent._fila_encabezado.Get((Object)("codsucentidad")));
RDebugUtils.currentLine=22479030;
 //BA.debugLineNum = 22479030;BA.debugLine="Dim Tido As String = Respuesta.Get(\"Tido\")";
_tido = BA.ObjectToString(_respuesta.Get((Object)("Tido")));
RDebugUtils.currentLine=22479031;
 //BA.debugLineNum = 22479031;BA.debugLine="Dim Nudo As String = Respuesta.Get(\"Nudo\")";
_nudo = BA.ObjectToString(_respuesta.Get((Object)("Nudo")));
RDebugUtils.currentLine=22479032;
 //BA.debugLineNum = 22479032;BA.debugLine="Dim Obseravacion As String = Fila_Observacione";
_obseravacion = BA.ObjectToString(parent._fila_observaciones.Get((Object)("observacion")));
RDebugUtils.currentLine=22479033;
 //BA.debugLineNum = 22479033;BA.debugLine="Dim NroOCC As String = Fila_Observaciones.Get(";
_nroocc = BA.ObjectToString(parent._fila_observaciones.Get((Object)("nroocc")));
RDebugUtils.currentLine=22479051;
 //BA.debugLineNum = 22479051;BA.debugLine="Tab_Post.CurrentTab = 1";
parent.mostCurrent._tab_post.setCurrentTab((int) (1));
RDebugUtils.currentLine=22479052;
 //BA.debugLineNum = 22479052;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22479053;
 //BA.debugLineNum = 22479053;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22479054;
 //BA.debugLineNum = 22479054;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22479055;
 //BA.debugLineNum = 22479055;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
RDebugUtils.currentLine=22479056;
 //BA.debugLineNum = 22479056;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
RDebugUtils.currentLine=22479057;
 //BA.debugLineNum = 22479057;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
RDebugUtils.currentLine=22479058;
 //BA.debugLineNum = 22479058;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479060;
 //BA.debugLineNum = 22479060;BA.debugLine="Dim ErrorMailImp As Boolean";
_errormailimp = false;
RDebugUtils.currentLine=22479061;
 //BA.debugLineNum = 22479061;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"document-de";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"document-delivery-receipt-ok-2.png");
RDebugUtils.currentLine=22479063;
 //BA.debugLineNum = 22479063;BA.debugLine="Msgbox2Async(\"Documento guardado correctamente";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Documento guardado correctamente"),BA.ObjectToCharSequence(_tido+"-"+_nudo),"Imprimir","Enviar correo e imprimir","Enviar correo",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479064;
 //BA.debugLineNum = 22479064;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 96;
return;
case 96:
//C
this.state = 56;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22479066;
 //BA.debugLineNum = 22479066;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"warning.png";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"warning.png");
RDebugUtils.currentLine=22479069;
 //BA.debugLineNum = 22479069;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=22479072;
 //BA.debugLineNum = 22479072;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 97;
return;
case 97:
//C
this.state = 59;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22479074;
 //BA.debugLineNum = 22479074;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22479075;
 //BA.debugLineNum = 22479075;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479076;
 //BA.debugLineNum = 22479076;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 98;
return;
case 98:
//C
this.state = 62;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22479077;
 //BA.debugLineNum = 22479077;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;
;
RDebugUtils.currentLine=22479083;
 //BA.debugLineNum = 22479083;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";

case 63:
//if
this.state = 70;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=22479085;
 //BA.debugLineNum = 22479085;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 99;
return;
case 99:
//C
this.state = 66;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22479087;
 //BA.debugLineNum = 22479087;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22479088;
 //BA.debugLineNum = 22479088;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479089;
 //BA.debugLineNum = 22479089;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 100;
return;
case 100:
//C
this.state = 69;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22479090;
 //BA.debugLineNum = 22479090;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;
;
RDebugUtils.currentLine=22479096;
 //BA.debugLineNum = 22479096;BA.debugLine="If Result = DialogResponse.CANCEL Then";

case 70:
//if
this.state = 81;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=22479098;
 //BA.debugLineNum = 22479098;BA.debugLine="Wait For(CLFx2.Fx_Enviar_Correo_Bakapp1(Idmae";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_enviar_correo_bakapp1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo,_endo,_suendo,_para,"EMAILCOMER",anywheresoftware.b4a.keywords.Common.True));
this.state = 101;
return;
case 101:
//C
this.state = 73;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22479100;
 //BA.debugLineNum = 22479100;BA.debugLine="Log(Resultado)";
anywheresoftware.b4a.keywords.Common.LogImpl("222479100",_resultado,0);
RDebugUtils.currentLine=22479101;
 //BA.debugLineNum = 22479101;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22479102;
 //BA.debugLineNum = 22479102;BA.debugLine="Msgbox2Async(Resultado,\"Error al enviar corr";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al enviar correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479103;
 //BA.debugLineNum = 22479103;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 102;
return;
case 102:
//C
this.state = 76;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22479104;
 //BA.debugLineNum = 22479104;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=22479107;
 //BA.debugLineNum = 22479107;BA.debugLine="Wait For(CLFx2.Fx_Imprimir_Bakapp(Idmaeedo))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), parent.mostCurrent._clfx2._fx_imprimir_bakapp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idmaeedo));
this.state = 103;
return;
case 103:
//C
this.state = 77;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22479109;
 //BA.debugLineNum = 22479109;BA.debugLine="If Resultado <> \"Ok\" Then";
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
RDebugUtils.currentLine=22479111;
 //BA.debugLineNum = 22479111;BA.debugLine="Msgbox2Async(Resultado,\"Error al imprimir\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Error al imprimir"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479112;
 //BA.debugLineNum = 22479112;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabara_nuevo_documento"), null);
this.state = 104;
return;
case 104:
//C
this.state = 80;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22479113;
 //BA.debugLineNum = 22479113;BA.debugLine="ErrorMailImp = True";
_errormailimp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;
;
RDebugUtils.currentLine=22479118;
 //BA.debugLineNum = 22479118;BA.debugLine="If ErrorMailImp Then";

case 81:
//if
this.state = 84;
if (_errormailimp) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=22479121;
 //BA.debugLineNum = 22479121;BA.debugLine="Msgbox2Async(\"Hubo error al imprimir o enviar";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Hubo error al imprimir o enviar correo, sin embargo el documento se grabo correctamente"+anywheresoftware.b4a.keywords.Common.CRLF+_tido+"-"+_nudo),BA.ObjectToCharSequence("Información"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22479124;
 //BA.debugLineNum = 22479124;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22479128;
 //BA.debugLineNum = 22479128;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=22479132;
 //BA.debugLineNum = 22479132;BA.debugLine="Msgbox2Async(Error,\"Error al grabar\", \"Cerrar\"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_error),BA.ObjectToCharSequence("Error al grabar"),"Cerrar","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22479133;
 //BA.debugLineNum = 22479133;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
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
RDebugUtils.currentLine=22479141;
 //BA.debugLineNum = 22479141;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=22479143;
 //BA.debugLineNum = 22479143;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=22479145;
 //BA.debugLineNum = 22479145;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Dim XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="Msgbox2Async(\"¿Estas seguro de querer limpiar est";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Estas seguro de querer limpiar este documento?"),BA.ObjectToCharSequence("L I M P I A R"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_limpiar_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=21889034;
 //BA.debugLineNum = 21889034;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=21889035;
 //BA.debugLineNum = 21889035;BA.debugLine="Crear_NVV_Desde_COV = False";
parent._crear_nvv_desde_cov = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21889036;
 //BA.debugLineNum = 21889036;BA.debugLine="Nuevo_Documento = True";
parent._nuevo_documento = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=21889037;
 //BA.debugLineNum = 21889037;BA.debugLine="Editar_Documento = False";
parent._editar_documento = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="Idmaeedo_Origen = 0";
parent._idmaeedo_origen = (int) (0);
RDebugUtils.currentLine=21889039;
 //BA.debugLineNum = 21889039;BA.debugLine="Nudo_Origen = \"\"";
parent._nudo_origen = "";
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="Sb_Nuevo_Documento";
_sb_nuevo_documento();
RDebugUtils.currentLine=21889041;
 //BA.debugLineNum = 21889041;BA.debugLine="Sb_Cargar_Detalle(False)";
_sb_cargar_detalle(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_limpiar_codigo_click() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_limpiar_codigo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_limpiar_codigo_click", null));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub Btn_Limpiar_Codigo_Click";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Txt_Codigo.Text = \"\"";
mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Txt_Codigo.SelectAll";
mostCurrent._txt_codigo.SelectAll();
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(\"\")) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_limpiar_longclick"), _sb_ingresar_correo_validar(""));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="Msgbox2Async(Resultado,\"Respuesta correo\", \"Ok\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_resultado),BA.ObjectToCharSequence("Respuesta correo"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_limpiar_longclick"), null);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="Private dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=22609928;
 //BA.debugLineNum = 22609928;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22609931;
 //BA.debugLineNum = 22609931;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese correo del";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Ingrese correo del cliente"));
RDebugUtils.currentLine=22609932;
 //BA.debugLineNum = 22609932;BA.debugLine="InputTemplate.Text = Para";
parent.mostCurrent._inputtemplate._text /*String*/  = _para;
RDebugUtils.currentLine=22609934;
 //BA.debugLineNum = 22609934;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22609935;
 //BA.debugLineNum = 22609935;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=22609936;
 //BA.debugLineNum = 22609936;BA.debugLine="Try";
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
RDebugUtils.currentLine=22609937;
 //BA.debugLineNum = 22609937;BA.debugLine="Para = InputTemplate.Text.Trim";
_para = parent.mostCurrent._inputtemplate._text /*String*/ .trim();
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=22609939;
 //BA.debugLineNum = 22609939;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222609939",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=22609940;
 //BA.debugLineNum = 22609940;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22609941;
 //BA.debugLineNum = 22609941;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Error!"),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22609942;
 //BA.debugLineNum = 22609942;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), null);
this.state = 20;
return;
case 20:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22609943;
 //BA.debugLineNum = 22609943;BA.debugLine="Para = \"Error\"";
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
RDebugUtils.currentLine=22609946;
 //BA.debugLineNum = 22609946;BA.debugLine="Para = \"Cancelar\"";
_para = "Cancelar";
 if (true) break;
;
RDebugUtils.currentLine=22609949;
 //BA.debugLineNum = 22609949;BA.debugLine="If Para = \"Cancelar\" Then";

case 12:
//if
this.state = 15;
if ((_para).equals("Cancelar")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=22609950;
 //BA.debugLineNum = 22609950;BA.debugLine="Return Para";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_para));return;};
 if (true) break;
;
RDebugUtils.currentLine=22609953;
 //BA.debugLineNum = 22609953;BA.debugLine="If Funciones.Fx_IsEmail(Para) = False Then";

case 15:
//if
this.state = 18;
if (parent.mostCurrent._funciones._fx_isemail /*boolean*/ (mostCurrent.activityBA,_para)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=22609955;
 //BA.debugLineNum = 22609955;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22609956;
 //BA.debugLineNum = 22609956;BA.debugLine="Msgbox2Async(\"Por favor vuelve a comprobar tu di";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Por favor vuelve a comprobar tu dirección de email"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=22609957;
 //BA.debugLineNum = 22609957;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), null);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22609959;
 //BA.debugLineNum = 22609959;BA.debugLine="Wait For (Sb_Ingresar_Correo_Validar(Para)) Comp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_ingresar_correo_validar"), _sb_ingresar_correo_validar(_para));
this.state = 22;
return;
case 22:
//C
this.state = 18;
_resultado = (String) result[0];
;
RDebugUtils.currentLine=22609961;
 //BA.debugLineNum = 22609961;BA.debugLine="Para = Resultado";
_para = _resultado;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=22609965;
 //BA.debugLineNum = 22609965;BA.debugLine="Return Para";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_para));return;};
RDebugUtils.currentLine=22609967;
 //BA.debugLineNum = 22609967;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_Tipo, \"\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._despsimple_tipo),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23658507;
 //BA.debugLineNum = 23658507;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23658509;
 //BA.debugLineNum = 23658509;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23658511;
 //BA.debugLineNum = 23658511;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
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
RDebugUtils.currentLine=23658513;
 //BA.debugLineNum = 23658513;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
RDebugUtils.currentLine=23658514;
 //BA.debugLineNum = 23658514;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=23658516;
 //BA.debugLineNum = 23658516;BA.debugLine="If DespSimple_Tipo.SelectedItem.Trim = NombreT";
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
RDebugUtils.currentLine=23658518;
 //BA.debugLineNum = 23658518;BA.debugLine="Dim Emp As String = Fila.Get(\"Emp\")";
_emp = BA.ObjectToString(_fila.Get((Object)("Emp")));
RDebugUtils.currentLine=23658519;
 //BA.debugLineNum = 23658519;BA.debugLine="Dim Suc As String = Fila.Get(\"Suc\")";
_suc = BA.ObjectToString(_fila.Get((Object)("Suc")));
RDebugUtils.currentLine=23658520;
 //BA.debugLineNum = 23658520;BA.debugLine="Dim Bod As String = Fila.Get(\"Bod\")";
_bod = BA.ObjectToString(_fila.Get((Object)("Bod")));
RDebugUtils.currentLine=23658522;
 //BA.debugLineNum = 23658522;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=23658523;
 //BA.debugLineNum = 23658523;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=23658525;
 //BA.debugLineNum = 23658525;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=23658527;
 //BA.debugLineNum = 23658527;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Bo";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Bodega From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=23658529;
 //BA.debugLineNum = 23658529;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=23658530;
 //BA.debugLineNum = 23658530;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=23658531;
 //BA.debugLineNum = 23658531;BA.debugLine="For Row = 0 To RowNumber - 1";
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
RDebugUtils.currentLine=23658532;
 //BA.debugLineNum = 23658532;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=23658533;
 //BA.debugLineNum = 23658533;BA.debugLine="If Cursor1.GetString(\"Bodega\").Trim <> Bod.";
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
RDebugUtils.currentLine=23658534;
 //BA.debugLineNum = 23658534;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=23658535;
 //BA.debugLineNum = 23658535;BA.debugLine="Msgbox2Async(\"No se puede cambiar el tipo";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("No se puede cambiar el tipo de despacho, ya que es de otra sucursal y hay productos en el listado"),BA.ObjectToCharSequence("Validación"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23658537;
 //BA.debugLineNum = 23658537;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), null);
this.state = 34;
return;
case 34:
//C
this.state = 22;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23658538;
 //BA.debugLineNum = 23658538;BA.debugLine="Return";
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
RDebugUtils.currentLine=23658542;
 //BA.debugLineNum = 23658542;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=23658544;
 //BA.debugLineNum = 23658544;BA.debugLine="Fila_Encabezado.Put(\"Empresa\".ToLowerCase,Emp";
parent._fila_encabezado.Put((Object)("Empresa".toLowerCase()),(Object)(_emp));
RDebugUtils.currentLine=23658545;
 //BA.debugLineNum = 23658545;BA.debugLine="Fila_Encabezado.Put(\"Sucursal\".ToLowerCase,Su";
parent._fila_encabezado.Put((Object)("Sucursal".toLowerCase()),(Object)(_suc));
RDebugUtils.currentLine=23658546;
 //BA.debugLineNum = 23658546;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabez";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=23658548;
 //BA.debugLineNum = 23658548;BA.debugLine="Variables.Gl_Empresa = Emp";
parent.mostCurrent._variables._gl_empresa /*String*/  = _emp;
RDebugUtils.currentLine=23658549;
 //BA.debugLineNum = 23658549;BA.debugLine="Variables.Gl_Sucursal = Suc";
parent.mostCurrent._variables._gl_sucursal /*String*/  = _suc;
RDebugUtils.currentLine=23658550;
 //BA.debugLineNum = 23658550;BA.debugLine="Variables.Gl_Bodega = Bod";
parent.mostCurrent._variables._gl_bodega /*String*/  = _bod;
RDebugUtils.currentLine=23658552;
 //BA.debugLineNum = 23658552;BA.debugLine="Lbl_TipoDespacho.Tag = CodigoTabla";
parent.mostCurrent._lbl_tipodespacho.setTag((Object)(_codigotabla));
RDebugUtils.currentLine=23658553;
 //BA.debugLineNum = 23658553;BA.debugLine="Lbl_TipoDespacho.Text = NombreTabla";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(_nombretabla));
RDebugUtils.currentLine=23658555;
 //BA.debugLineNum = 23658555;BA.debugLine="Wait For(Sb_Titulo) complete(res As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _sb_titulo());
this.state = 35;
return;
case 35:
//C
this.state = 25;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=23658556;
 //BA.debugLineNum = 23658556;BA.debugLine="Wait For(Sb_VisibleOcultarDespachoSimple) com";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipodespachosimple_click"), _sb_visibleocultardespachosimple());
this.state = 36;
return;
case 36:
//C
this.state = 25;
_res = (Boolean) result[0];
;
RDebugUtils.currentLine=23658558;
 //BA.debugLineNum = 23658558;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=23658560;
 //BA.debugLineNum = 23658560;BA.debugLine="ToastMessageShow(\"SUCURSAL: \" & Suc, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("SUCURSAL: "+_suc),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23658562;
 //BA.debugLineNum = 23658562;BA.debugLine="Exit";
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
RDebugUtils.currentLine=23658572;
 //BA.debugLineNum = 23658572;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="If B4A_DespachoSimple = False Then";
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
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=23855111;
 //BA.debugLineNum = 23855111;BA.debugLine="Dim EnbDesp As Boolean";
_enbdesp = false;
RDebugUtils.currentLine=23855113;
 //BA.debugLineNum = 23855113;BA.debugLine="If Lbl_TipoDespacho.Text.Contains(\"DESPACHO\") The";
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
RDebugUtils.currentLine=23855114;
 //BA.debugLineNum = 23855114;BA.debugLine="EnbDesp = True";
_enbdesp = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=23855116;
 //BA.debugLineNum = 23855116;BA.debugLine="EnbDesp = False";
_enbdesp = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=23855119;
 //BA.debugLineNum = 23855119;BA.debugLine="Txt_DireccionDesp.Visible = EnbDesp";
parent.mostCurrent._txt_direcciondesp.setVisible(_enbdesp);
RDebugUtils.currentLine=23855120;
 //BA.debugLineNum = 23855120;BA.debugLine="Txt_ObservacionesDesp.Visible = EnbDesp";
parent.mostCurrent._txt_observacionesdesp.setVisible(_enbdesp);
RDebugUtils.currentLine=23855121;
 //BA.debugLineNum = 23855121;BA.debugLine="Txt_TransporteDesp.Visible = EnbDesp";
parent.mostCurrent._txt_transportedesp.setVisible(_enbdesp);
RDebugUtils.currentLine=23855123;
 //BA.debugLineNum = 23855123;BA.debugLine="Lbl_DireccionDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_direcciondesp.setVisible(_enbdesp);
RDebugUtils.currentLine=23855124;
 //BA.debugLineNum = 23855124;BA.debugLine="Lbl_TransporteDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_transportedesp.setVisible(_enbdesp);
RDebugUtils.currentLine=23855125;
 //BA.debugLineNum = 23855125;BA.debugLine="Lbl_ObservacionesDesp.Visible = EnbDesp";
parent.mostCurrent._lbl_observacionesdesp.setVisible(_enbdesp);
RDebugUtils.currentLine=23855126;
 //BA.debugLineNum = 23855126;BA.debugLine="Lbl_Observaciones.Visible = EnbDesp";
parent.mostCurrent._lbl_observaciones.setVisible(_enbdesp);
RDebugUtils.currentLine=23855127;
 //BA.debugLineNum = 23855127;BA.debugLine="Txt_Observaciones.Visible = Not(EnbDesp)";
parent.mostCurrent._txt_observaciones.setVisible(anywheresoftware.b4a.keywords.Common.Not(_enbdesp));
RDebugUtils.currentLine=23855129;
 //BA.debugLineNum = 23855129;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=23855131;
 //BA.debugLineNum = 23855131;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="Dialog.Title = \"Seleccione el Tipo de despacho\"";
_dialog._title /*Object*/  = (Object)("Seleccione el Tipo de despacho");
RDebugUtils.currentLine=23724042;
 //BA.debugLineNum = 23724042;BA.debugLine="Wait For (Dialog.ShowTemplate(DespSimple_TipoPago";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "btn_tipopagodesp_click"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._despsimple_tipopago),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23724043;
 //BA.debugLineNum = 23724043;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23724045;
 //BA.debugLineNum = 23724045;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23724047;
 //BA.debugLineNum = 23724047;BA.debugLine="For Each Fila As Map In Variables.Global_Sis_De";
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
RDebugUtils.currentLine=23724049;
 //BA.debugLineNum = 23724049;BA.debugLine="Dim CodigoTabla As String  = Fila.Get(\"CodigoT";
_codigotabla = BA.ObjectToString(_fila.Get((Object)("CodigoTabla")));
RDebugUtils.currentLine=23724050;
 //BA.debugLineNum = 23724050;BA.debugLine="Dim NombreTabla As String  = Fila.Get(\"NombreT";
_nombretabla = BA.ObjectToString(_fila.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=23724052;
 //BA.debugLineNum = 23724052;BA.debugLine="If DespSimple_TipoPago.SelectedItem.Trim = Nom";
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
RDebugUtils.currentLine=23724053;
 //BA.debugLineNum = 23724053;BA.debugLine="Lbl_TipoPagoDesp.Tag = CodigoTabla";
parent.mostCurrent._lbl_tipopagodesp.setTag((Object)(_codigotabla));
RDebugUtils.currentLine=23724054;
 //BA.debugLineNum = 23724054;BA.debugLine="Lbl_TipoPagoDesp.Text = NombreTabla";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(_nombretabla));
RDebugUtils.currentLine=23724055;
 //BA.debugLineNum = 23724055;BA.debugLine="Exit";
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
RDebugUtils.currentLine=23724064;
 //BA.debugLineNum = 23724064;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim Contador As Int";
_contador = 0;
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Dim Contador_Item As Int";
_contador_item = 0;
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="Dim TotalNetoDoc As Double = Funciones.Fx_NuloPor";
_totalnetodoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_neto.getTag(),0)));
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Dim TotalIvaDoc As Double = Funciones.Fx_NuloPorN";
_totalivadoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_iva.getTag(),0)));
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="Dim TotalIlaDoc As Double = Funciones.Fx_NuloPorN";
_totaliladoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_impuestos.getTag(),0)));
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="Dim TotalBrutoDoc As Double = Funciones.Fx_NuloPo";
_totalbrutodoc = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_total_bruto.getTag(),0)));
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="Dim TotalNetoSDscto As Double = 0";
_totalnetosdscto = 0;
RDebugUtils.currentLine=23330827;
 //BA.debugLineNum = 23330827;BA.debugLine="Dim TotalDsctoGlobal As Double = 0";
_totaldsctoglobal = 0;
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="Dim DsctoPorcGlobal As Double = 0";
_dsctoporcglobal = 0;
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="Dim Afecta_Precio_Real As Boolean";
_afecta_precio_real = false;
RDebugUtils.currentLine=23330832;
 //BA.debugLineNum = 23330832;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=23330835;
 //BA.debugLineNum = 23330835;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
RDebugUtils.currentLine=23330839;
 //BA.debugLineNum = 23330839;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
RDebugUtils.currentLine=23330842;
 //BA.debugLineNum = 23330842;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
_precio = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Precio")),0)));
RDebugUtils.currentLine=23330843;
 //BA.debugLineNum = 23330843;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
_valnetolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("ValNetoLinea")),0)));
RDebugUtils.currentLine=23330844;
 //BA.debugLineNum = 23330844;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
RDebugUtils.currentLine=23330846;
 //BA.debugLineNum = 23330846;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
RDebugUtils.currentLine=23330847;
 //BA.debugLineNum = 23330847;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=23330848;
 //BA.debugLineNum = 23330848;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
RDebugUtils.currentLine=23330850;
 //BA.debugLineNum = 23330850;BA.debugLine="Dim Id_Oferta As Int '= Detalle.GetString(\"Id_Of";
_id_oferta = 0;
RDebugUtils.currentLine=23330851;
 //BA.debugLineNum = 23330851;BA.debugLine="Dim Oferta As String '= Detalle.GetString(\"Ofert";
_oferta = "";
RDebugUtils.currentLine=23330853;
 //BA.debugLineNum = 23330853;BA.debugLine="Dim Padre_Oferta As Int '= Detalle.GetString(\"Pa";
_padre_oferta = 0;
RDebugUtils.currentLine=23330854;
 //BA.debugLineNum = 23330854;BA.debugLine="Dim Aplica_Oferta As Boolean '= Detalle.GetStrin";
_aplica_oferta = false;
RDebugUtils.currentLine=23330856;
 //BA.debugLineNum = 23330856;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(D";
_valvtadescmax = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("ValVtaDescMax"));
RDebugUtils.currentLine=23330858;
 //BA.debugLineNum = 23330858;BA.debugLine="If Tict <> \"D\" Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_tict).equals("D") == false) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="Else If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
this.state = 12;
}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=23330861;
 //BA.debugLineNum = 23330861;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Deta";
_totalnetosdscto = _totalnetosdscto+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (2));
RDebugUtils.currentLine=23330864;
 //BA.debugLineNum = 23330864;BA.debugLine="If Prct = False Then";
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
RDebugUtils.currentLine=23330865;
 //BA.debugLineNum = 23330865;BA.debugLine="Contador_Item = Contador_Item + 1";
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
RDebugUtils.currentLine=23330870;
 //BA.debugLineNum = 23330870;BA.debugLine="If Aplica_Oferta Then";
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
RDebugUtils.currentLine=23330872;
 //BA.debugLineNum = 23330872;BA.debugLine="TotalNetoSDscto = TotalNetoSDscto + Round2(Det";
_totalnetosdscto = _totalnetosdscto+anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (2));
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=23330881;
 //BA.debugLineNum = 23330881;BA.debugLine="Afecta_Precio_Real = True'_RowConcepto.Item(\"R";
_afecta_precio_real = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=23330884;
 //BA.debugLineNum = 23330884;BA.debugLine="TotalDsctoGlobal = TotalDsctoGlobal + Round2(D";
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
RDebugUtils.currentLine=23330893;
 //BA.debugLineNum = 23330893;BA.debugLine="Dim Var_DsctoGlobal As Double";
_var_dsctoglobal = 0;
RDebugUtils.currentLine=23330894;
 //BA.debugLineNum = 23330894;BA.debugLine="Dim Dscto_Parcilizado As Double";
_dscto_parcilizado = 0;
RDebugUtils.currentLine=23330896;
 //BA.debugLineNum = 23330896;BA.debugLine="If TotalDsctoGlobal > 0 Then";
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
RDebugUtils.currentLine=23330897;
 //BA.debugLineNum = 23330897;BA.debugLine="DsctoPorcGlobal = 0";
_dsctoporcglobal = 0;
RDebugUtils.currentLine=23330898;
 //BA.debugLineNum = 23330898;BA.debugLine="DsctoPorcGlobal = TotalDsctoGlobal / TotalNetoSD";
_dsctoporcglobal = _totaldsctoglobal/(double)_totalnetosdscto;
RDebugUtils.currentLine=23330899;
 //BA.debugLineNum = 23330899;BA.debugLine="Var_DsctoGlobal = Round2(DsctoPorcGlobal, 3)";
_var_dsctoglobal = anywheresoftware.b4a.keywords.Common.Round2(_dsctoporcglobal,(int) (3));
RDebugUtils.currentLine=23330900;
 //BA.debugLineNum = 23330900;BA.debugLine="DsctoPorcGlobal = Round2(100 * DsctoPorcGlobal,";
_dsctoporcglobal = anywheresoftware.b4a.keywords.Common.Round2(100*_dsctoporcglobal,(int) (2));
RDebugUtils.currentLine=23330901;
 //BA.debugLineNum = 23330901;BA.debugLine="Dscto_Parcilizado = TotalDsctoGlobal / Contador_";
_dscto_parcilizado = _totaldsctoglobal/(double)_contador_item;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=23330904;
 //BA.debugLineNum = 23330904;BA.debugLine="Dim Tiene_Dscto_Superado_Autorizado As Boolean";
_tiene_dscto_superado_autorizado = false;
RDebugUtils.currentLine=23330905;
 //BA.debugLineNum = 23330905;BA.debugLine="Dim CodFuncionario_Autoriza As String";
_codfuncionario_autoriza = "";
RDebugUtils.currentLine=23330907;
 //BA.debugLineNum = 23330907;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=23330909;
 //BA.debugLineNum = 23330909;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
parent._id_docdet = (int)(Double.parseDouble(_detalle.GetString("Id_DocDet")));
RDebugUtils.currentLine=23330910;
 //BA.debugLineNum = 23330910;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
RDebugUtils.currentLine=23330912;
 //BA.debugLineNum = 23330912;BA.debugLine="If Codigo = \"\" Then Exit";
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
RDebugUtils.currentLine=23330914;
 //BA.debugLineNum = 23330914;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
RDebugUtils.currentLine=23330915;
 //BA.debugLineNum = 23330915;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=23330917;
 //BA.debugLineNum = 23330917;BA.debugLine="Dim ImportanciaPorc As Double";
_importanciaporc = 0;
RDebugUtils.currentLine=23330918;
 //BA.debugLineNum = 23330918;BA.debugLine="Dim ImportanciaValor As Double";
_importanciavalor = 0;
RDebugUtils.currentLine=23330920;
 //BA.debugLineNum = 23330920;BA.debugLine="Dim DescuentoValor As Double = Round2(Detalle.Ge";
_descuentovalor = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("DescuentoValor"),(int) (3));
RDebugUtils.currentLine=23330921;
 //BA.debugLineNum = 23330921;BA.debugLine="Dim NetoLinea As Double = Round2(Detalle.GetDoub";
_netolinea = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValNetoLinea"),(int) (3));
RDebugUtils.currentLine=23330922;
 //BA.debugLineNum = 23330922;BA.debugLine="Dim BrutoLinea As Double = Round2(Detalle.GetDou";
_brutolinea = anywheresoftware.b4a.keywords.Common.Round2(_detalle.GetDouble("ValBrutoLinea"),(int) (3));
RDebugUtils.currentLine=23330924;
 //BA.debugLineNum = 23330924;BA.debugLine="Dim CantUd1 As Double = Detalle.GetDouble(\"CantU";
_cantud1 = _detalle.GetDouble("CantUd1");
RDebugUtils.currentLine=23330925;
 //BA.debugLineNum = 23330925;BA.debugLine="Dim CantUd2 As Double = Detalle.GetDouble(\"CantU";
_cantud2 = _detalle.GetDouble("CantUd2");
RDebugUtils.currentLine=23330926;
 //BA.debugLineNum = 23330926;BA.debugLine="Dim NetoRealUd1 As Double";
_netorealud1 = 0;
RDebugUtils.currentLine=23330927;
 //BA.debugLineNum = 23330927;BA.debugLine="Dim NetoRealUd2 As Double";
_netorealud2 = 0;
RDebugUtils.currentLine=23330929;
 //BA.debugLineNum = 23330929;BA.debugLine="Dim DescuentoPorc As Double = Detalle.GetDouble(";
_descuentoporc = _detalle.GetDouble("DescuentoPorc");
RDebugUtils.currentLine=23330930;
 //BA.debugLineNum = 23330930;BA.debugLine="Dim DsctoMaximoLinea As Double = Detalle.GetDoub";
_dsctomaximolinea = _detalle.GetDouble("DescMaximo");
RDebugUtils.currentLine=23330931;
 //BA.debugLineNum = 23330931;BA.debugLine="Dim Rtu As Double = Detalle.GetDouble(\"Rtu\")";
_rtu = _detalle.GetDouble("Rtu");
RDebugUtils.currentLine=23330933;
 //BA.debugLineNum = 23330933;BA.debugLine="If Prct = False Then";
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
RDebugUtils.currentLine=23330935;
 //BA.debugLineNum = 23330935;BA.debugLine="ImportanciaPorc = Round2(NetoLinea / TotalNetoS";
_importanciaporc = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_totalnetosdscto,(int) (5));
RDebugUtils.currentLine=23330936;
 //BA.debugLineNum = 23330936;BA.debugLine="ImportanciaValor = Round2(ImportanciaPorc * Tot";
_importanciavalor = anywheresoftware.b4a.keywords.Common.Round2(_importanciaporc*_totaldsctoglobal,(int) (5));
RDebugUtils.currentLine=23330938;
 //BA.debugLineNum = 23330938;BA.debugLine="Dim PrecioNetoUd1 As Double = Round2(NetoLinea";
_precionetoud1 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud1,(int) (3));
RDebugUtils.currentLine=23330939;
 //BA.debugLineNum = 23330939;BA.debugLine="NetoRealUd1 = Round2(PrecioNetoUd1 - (PrecioNet";
_netorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_precionetoud1-(_precionetoud1*_var_dsctoglobal),(int) (3));
RDebugUtils.currentLine=23330941;
 //BA.debugLineNum = 23330941;BA.debugLine="If Rtu = 1 Then";
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
RDebugUtils.currentLine=23330942;
 //BA.debugLineNum = 23330942;BA.debugLine="NetoRealUd2 = NetoRealUd1 * Rtu";
_netorealud2 = _netorealud1*_rtu;
RDebugUtils.currentLine=23330943;
 //BA.debugLineNum = 23330943;BA.debugLine="NetoRealUd2 = NetoRealUd1";
_netorealud2 = _netorealud1;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=23330945;
 //BA.debugLineNum = 23330945;BA.debugLine="NetoRealUd2 = Round2((NetoLinea / CantUd2) - (";
_netorealud2 = anywheresoftware.b4a.keywords.Common.Round2((_netolinea/(double)_cantud2)-((_netolinea/(double)_cantud2)*_var_dsctoglobal),(int) (3));
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=23330949;
 //BA.debugLineNum = 23330949;BA.debugLine="Dim DsctoReal As Double = DsctoPorcGlobal";
_dsctoreal = _dsctoporcglobal;
RDebugUtils.currentLine=23330950;
 //BA.debugLineNum = 23330950;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealPorc",(Object)(_dsctoreal),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23330952;
 //BA.debugLineNum = 23330952;BA.debugLine="Dim DsctoLinea As Double = Funciones.Fx_NuloPor";
_dsctolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("DescuentoPorc")),0)));
RDebugUtils.currentLine=23330954;
 //BA.debugLineNum = 23330954;BA.debugLine="DsctoReal = Round2(100 * (1 - ((1 - (DsctoLinea";
_dsctoreal = anywheresoftware.b4a.keywords.Common.Round2(100*(1-((1-(_dsctolinea/(double)100.0))*(1-(_dsctoporcglobal/(double)100.0)))),(int) (3));
RDebugUtils.currentLine=23330960;
 //BA.debugLineNum = 23330960;BA.debugLine="If Afecta_Precio_Real = False Then";
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
RDebugUtils.currentLine=23330961;
 //BA.debugLineNum = 23330961;BA.debugLine="If NetoLinea > 0 Then";
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
RDebugUtils.currentLine=23330962;
 //BA.debugLineNum = 23330962;BA.debugLine="NetoRealUd1 = Round2(NetoLinea / CantUd1, 5)";
_netorealud1 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=23330963;
 //BA.debugLineNum = 23330963;BA.debugLine="NetoRealUd2 = Round2(NetoLinea / CantUd2, 5)";
_netorealud2 = anywheresoftware.b4a.keywords.Common.Round2(_netolinea/(double)_cantud2,(int) (5));
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=23330965;
 //BA.debugLineNum = 23330965;BA.debugLine="NetoRealUd1 = 0";
_netorealud1 = 0;
RDebugUtils.currentLine=23330966;
 //BA.debugLineNum = 23330966;BA.debugLine="NetoRealUd2 = 0";
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
RDebugUtils.currentLine=23330971;
 //BA.debugLineNum = 23330971;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","PrecioNetoRealUd1",(Object)(_netorealud1),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23330972;
 //BA.debugLineNum = 23330972;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","PrecioNetoRealUd1",(Object)(_netorealud2),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23330974;
 //BA.debugLineNum = 23330974;BA.debugLine="Dim DsctoRealValor As Double";
_dsctorealvalor = 0;
RDebugUtils.currentLine=23330976;
 //BA.debugLineNum = 23330976;BA.debugLine="If Chk_Valores_Netos.Checked Then";
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
RDebugUtils.currentLine=23330977;
 //BA.debugLineNum = 23330977;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
_dsctorealvalor = anywheresoftware.b4a.keywords.Common.Round2((_dsctoreal/(double)100)*_totalnetodoc,(int) (1));
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=23330979;
 //BA.debugLineNum = 23330979;BA.debugLine="DsctoRealValor = Round2((DsctoReal / 100) * To";
_dsctorealvalor = anywheresoftware.b4a.keywords.Common.Round2((_dsctoreal/(double)100)*_totalbrutodoc,(int) (0));
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=23330982;
 //BA.debugLineNum = 23330982;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealPorc",(Object)(_dsctoreal),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23330983;
 //BA.debugLineNum = 23330983;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoRealValor",(Object)(_dsctorealvalor),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23330985;
 //BA.debugLineNum = 23330985;BA.debugLine="Dim Tiene_Dscto As Boolean = Funciones.Cbool(De";
_tiene_dscto = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Tiene_Dscto"));
RDebugUtils.currentLine=23330986;
 //BA.debugLineNum = 23330986;BA.debugLine="Dim ValVtaDescMax As Boolean = Funciones.Cbool(";
_valvtadescmax = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("ValVtaDescMax"));
RDebugUtils.currentLine=23330988;
 //BA.debugLineNum = 23330988;BA.debugLine="If DsctoReal > DsctoMaximoLinea Then";
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
RDebugUtils.currentLine=23330990;
 //BA.debugLineNum = 23330990;BA.debugLine="Dim CodFunAutoriza As String = Detalle.GetStri";
_codfunautoriza = _detalle.GetString("CodFunAutoriza");
RDebugUtils.currentLine=23330991;
 //BA.debugLineNum = 23330991;BA.debugLine="Dim CodVendedor As String = Detalle.GetString(";
_codvendedor = _detalle.GetString("CodVendedor");
RDebugUtils.currentLine=23330992;
 //BA.debugLineNum = 23330992;BA.debugLine="Dim CodPermiso As String = Funciones.Fx_NuloPo";
_codpermiso = parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetString("CodPermiso")),(double)(Double.parseDouble("")));
RDebugUtils.currentLine=23330993;
 //BA.debugLineNum = 23330993;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=23330995;
 //BA.debugLineNum = 23330995;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza";
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
RDebugUtils.currentLine=23331003;
 //BA.debugLineNum = 23331003;BA.debugLine="Dim Es_Padre_Oferta As Boolean = Funciones.Cbo";
_es_padre_oferta = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Es_Padre_Oferta"));
RDebugUtils.currentLine=23331004;
 //BA.debugLineNum = 23331004;BA.debugLine="Dim Aplica_Oferta As Boolean = Funciones.Cbool";
_aplica_oferta = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,(double)(Double.parseDouble(_detalle.GetString("Aplica_Oferta"))));
RDebugUtils.currentLine=23331006;
 //BA.debugLineNum = 23331006;BA.debugLine="If Aplica_Oferta = False Or Es_Padre_Oferta Th";
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
RDebugUtils.currentLine=23331008;
 //BA.debugLineNum = 23331008;BA.debugLine="If Valor_Dscto >= DsctoReal Then";
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
RDebugUtils.currentLine=23331013;
 //BA.debugLineNum = 23331013;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoGlobalSuperado",(Object)(anywheresoftware.b4a.keywords.Common.False),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23331014;
 //BA.debugLineNum = 23331014;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","CodFuncionario_Autoriza",(Object)(_codfunautoriza),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=23331018;
 //BA.debugLineNum = 23331018;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","ValVtaDescMax",(Object)(anywheresoftware.b4a.keywords.Common.True),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23331019;
 //BA.debugLineNum = 23331019;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","DsctoGlobalSuperado",(Object)(anywheresoftware.b4a.keywords.Common.True),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(parent._id_docdet)}));
RDebugUtils.currentLine=23331020;
 //BA.debugLineNum = 23331020;BA.debugLine="Contador = Contador + 1";
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
RDebugUtils.currentLine=23331035;
 //BA.debugLineNum = 23331035;BA.debugLine="If Contador = 0 Then";

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
RDebugUtils.currentLine=23331053;
 //BA.debugLineNum = 23331053;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=23331063;
 //BA.debugLineNum = 23331063;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 85:
//C
this.state = -1;
;
RDebugUtils.currentLine=23331067;
 //BA.debugLineNum = 23331067;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub GeneraArreglo(Tabla As String) As Stri";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Consulta_Sql = \"PRAGMA table_info('\" & Tabla & \"'";
mostCurrent._consulta_sql = "PRAGMA table_info('"+_tabla+"')";
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="Private Tbl As Cursor";
_tbl = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="Tbl = Variables.vSql.ExecQuery(Consulta_Sql)";
_tbl = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(mostCurrent._consulta_sql)));
RDebugUtils.currentLine=22741000;
 //BA.debugLineNum = 22741000;BA.debugLine="If Tbl.RowCount > 0 Then";
if (_tbl.getRowCount()>0) { 
RDebugUtils.currentLine=22741002;
 //BA.debugLineNum = 22741002;BA.debugLine="Dim	CantFilas As Int = Tbl.RowCount";
_cantfilas = _tbl.getRowCount();
RDebugUtils.currentLine=22741003;
 //BA.debugLineNum = 22741003;BA.debugLine="Dim Arreglo(CantFilas) As String";
_arreglo = new String[_cantfilas];
java.util.Arrays.fill(_arreglo,"");
RDebugUtils.currentLine=22741005;
 //BA.debugLineNum = 22741005;BA.debugLine="For i = 0 To CantFilas-1";
{
final int step7 = 1;
final int limit7 = (int) (_cantfilas-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=22741007;
 //BA.debugLineNum = 22741007;BA.debugLine="Try";
try {RDebugUtils.currentLine=22741009;
 //BA.debugLineNum = 22741009;BA.debugLine="Tbl.Position = i";
_tbl.setPosition(_i);
RDebugUtils.currentLine=22741011;
 //BA.debugLineNum = 22741011;BA.debugLine="Dim nameDB As String = Tbl.GetString(\"name\")";
_namedb = _tbl.GetString("name");
RDebugUtils.currentLine=22741012;
 //BA.debugLineNum = 22741012;BA.debugLine="Dim TypeDB As String = Tbl.GetString(\"type\")";
_typedb = _tbl.GetString("type");
RDebugUtils.currentLine=22741014;
 //BA.debugLineNum = 22741014;BA.debugLine="If nameDB.Contains(\"Fecha\") And TypeDB = \"DOUB";
if (_namedb.contains("Fecha") && (_typedb).equals("DOUBLE")) { 
RDebugUtils.currentLine=22741015;
 //BA.debugLineNum = 22741015;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
_arreglo[_i] = mostCurrent._dbutils._db_date /*String*/ ;
 }else {
RDebugUtils.currentLine=22741018;
 //BA.debugLineNum = 22741018;BA.debugLine="Select Case TypeDB";
switch (BA.switchObjectToInt(_typedb,"DOUBLE","INTEGER","INT","INTEGER","BOOLEAN","STRING","DATE")) {
case 0: {
RDebugUtils.currentLine=22741020;
 //BA.debugLineNum = 22741020;BA.debugLine="Arreglo(i) = DBUtils.DB_DOUBLE";
_arreglo[_i] = mostCurrent._dbutils._db_double /*String*/ ;
 break; }
case 1: 
case 2: {
RDebugUtils.currentLine=22741022;
 //BA.debugLineNum = 22741022;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
_arreglo[_i] = mostCurrent._dbutils._db_integer /*String*/ ;
 break; }
case 3: {
RDebugUtils.currentLine=22741024;
 //BA.debugLineNum = 22741024;BA.debugLine="Arreglo(i) = DBUtils.DB_INTEGER";
_arreglo[_i] = mostCurrent._dbutils._db_integer /*String*/ ;
 break; }
case 4: {
RDebugUtils.currentLine=22741026;
 //BA.debugLineNum = 22741026;BA.debugLine="Arreglo(i) = DBUtils.DB_BOOLEAN";
_arreglo[_i] = mostCurrent._dbutils._db_boolean /*String*/ ;
 break; }
case 5: {
RDebugUtils.currentLine=22741028;
 //BA.debugLineNum = 22741028;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
_arreglo[_i] = mostCurrent._dbutils._db_text /*String*/ ;
 break; }
case 6: {
RDebugUtils.currentLine=22741030;
 //BA.debugLineNum = 22741030;BA.debugLine="Arreglo(i) = DBUtils.DB_DATE";
_arreglo[_i] = mostCurrent._dbutils._db_date /*String*/ ;
 break; }
default: {
RDebugUtils.currentLine=22741032;
 //BA.debugLineNum = 22741032;BA.debugLine="If TypeDB.Contains(\"CHAR\") Then";
if (_typedb.contains("CHAR")) { 
RDebugUtils.currentLine=22741033;
 //BA.debugLineNum = 22741033;BA.debugLine="Arreglo(i) = DBUtils.DB_TEXT";
_arreglo[_i] = mostCurrent._dbutils._db_text /*String*/ ;
 }else {
RDebugUtils.currentLine=22741035;
 //BA.debugLineNum = 22741035;BA.debugLine="Dim hola As String = \"Aca\"";
_hola = "Aca";
 };
 break; }
}
;
 };
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=22741042;
 //BA.debugLineNum = 22741042;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222741042",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }
};
RDebugUtils.currentLine=22741047;
 //BA.debugLineNum = 22741047;BA.debugLine="Return Arreglo";
if (true) return _arreglo;
 };
RDebugUtils.currentLine=22741051;
 //BA.debugLineNum = 22741051;BA.debugLine="Return Null";
if (true) return (String[])(anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=22741053;
 //BA.debugLineNum = 22741053;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="Dialog.Title = \"Orden de compra\"";
_dialog._title /*Object*/  = (Object)("Orden de compra");
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="InputTemplate.lblTitle.Text = \"Número de orden de";
parent.mostCurrent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Número de orden de compra"));
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="InputTemplate.Text = Txt_Orden_compra.Text";
parent.mostCurrent._inputtemplate._text /*String*/  = parent.mostCurrent._txt_orden_compra.getText();
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="Wait For (Dialog.ShowTemplate(InputTemplate, \"OK\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "label11_longclick"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23265298;
 //BA.debugLineNum = 23265298;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="Txt_Orden_compra.Text = InputTemplate.Text";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent.mostCurrent._inputtemplate._text /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=23265302;
 //BA.debugLineNum = 23265302;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Private Sub Label12_LongClick";
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="Dialog.Title = \"Observaciones\"";
_dialog._title /*Object*/  = (Object)("Observaciones");
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextBackg";
mostCurrent._longtexttemplate._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
RDebugUtils.currentLine=23199755;
 //BA.debugLineNum = 23199755;BA.debugLine="LongTextTemplate.CustomListView1.DefaultTextColor";
mostCurrent._longtexttemplate._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = _xui.Color_Black;
RDebugUtils.currentLine=23199756;
 //BA.debugLineNum = 23199756;BA.debugLine="LongTextTemplate.Text = Txt_Observaciones.Text";
mostCurrent._longtexttemplate._text /*Object*/  = (Object)(mostCurrent._txt_observaciones.getText());
RDebugUtils.currentLine=23199758;
 //BA.debugLineNum = 23199758;BA.debugLine="Dialog.ShowTemplate(LongTextTemplate, \"OK\", \"\", \"";
_dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(mostCurrent._longtexttemplate),(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=23199764;
 //BA.debugLineNum = 23199764;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new BaKapp.Movil.Tag.b4xdialog();
RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), parent.mostCurrent._cl_permisox._sb_validarpermisousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Bkp00009"));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rst = (Boolean) result[0];
;
RDebugUtils.currentLine=23134217;
 //BA.debugLineNum = 23134217;BA.debugLine="If Not(Rst) Then";
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
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="Msgbox2Async(\"¿desea cambiar la lista de precios";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿desea cambiar la lista de precios "+parent.mostCurrent._searchtemplate._selecteditem /*String*/ +"?"),BA.ObjectToCharSequence("Cambiar lista"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), null);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23134226;
 //BA.debugLineNum = 23134226;BA.debugLine="If Result <> XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23134227;
 //BA.debugLineNum = 23134227;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=23134230;
 //BA.debugLineNum = 23134230;BA.debugLine="Base = Activity";
_base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=23134231;
 //BA.debugLineNum = 23134231;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (null,mostCurrent.activityBA,_base);
RDebugUtils.currentLine=23134232;
 //BA.debugLineNum = 23134232;BA.debugLine="Dialog.Title = \"Listas de precios autorizadas\"";
_dialog._title /*Object*/  = (Object)("Listas de precios autorizadas");
RDebugUtils.currentLine=23134234;
 //BA.debugLineNum = 23134234;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplate, \"\",";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), _dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23134235;
 //BA.debugLineNum = 23134235;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23134237;
 //BA.debugLineNum = 23134237;BA.debugLine="Msgbox2Async(\"¿Confirma utilizar la lista \" & Se";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("¿Confirma utilizar la lista "+parent.mostCurrent._searchtemplate._selecteditem /*String*/ +"?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134238;
 //BA.debugLineNum = 23134238;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "lbl_lista_precios_longclick"), null);
this.state = 20;
return;
case 20:
//C
this.state = 12;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=23134240;
 //BA.debugLineNum = 23134240;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=23134241;
 //BA.debugLineNum = 23134241;BA.debugLine="Lbl_Lista_Precios.Text = SearchTemplate.Selecte";
parent.mostCurrent._lbl_lista_precios.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
RDebugUtils.currentLine=23134242;
 //BA.debugLineNum = 23134242;BA.debugLine="Dim Kolt As String = Funciones.Mid(Lbl_Lista_Pr";
_kolt = parent.mostCurrent._funciones._mid /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lbl_lista_precios.getText(),(int) (1),(int) (3));
RDebugUtils.currentLine=23134243;
 //BA.debugLineNum = 23134243;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_kolt));
RDebugUtils.currentLine=23134244;
 //BA.debugLineNum = 23134244;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
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
RDebugUtils.currentLine=23134249;
 //BA.debugLineNum = 23134249;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="Dim vSb_TidoNotido As TidoNudo";
_vsb_tidonotido = new BaKapp.Movil.Tag.tidonudo();
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="vSb_TidoNotido.Initialize";
_vsb_tidonotido._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="Dim Tido As String";
_tido = "";
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="Dim Notido As String";
_notido = "";
RDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="Select Case Secueven";
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
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_tido = "GDV";
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_notido = "GUIA DE DESPACHO DE VENTA";
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
_tido = "FCV";
RDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="Tido = \"FCV\": Notido = \"FACTURA DE VENTA\"";
_notido = "FACTURA DE VENTA";
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=22020115;
 //BA.debugLineNum = 22020115;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_tido = "GDV";
RDebugUtils.currentLine=22020115;
 //BA.debugLineNum = 22020115;BA.debugLine="Tido = \"GDV\": Notido = \"GUIA DE DESPACHO DE VEN";
_notido = "GUIA DE DESPACHO DE VENTA";
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
_tido = "BLV";
RDebugUtils.currentLine=22020117;
 //BA.debugLineNum = 22020117;BA.debugLine="Tido = \"BLV\": Notido = \"BOLETA DE VENTA\"";
_notido = "BOLETA DE VENTA";
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=22020119;
 //BA.debugLineNum = 22020119;BA.debugLine="Tido = \"\": Notido = \"\"";
_tido = "";
RDebugUtils.currentLine=22020119;
 //BA.debugLineNum = 22020119;BA.debugLine="Tido = \"\": Notido = \"\"";
_notido = "";
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=22020122;
 //BA.debugLineNum = 22020122;BA.debugLine="vSb_TidoNotido.Tido = Tido";
_vsb_tidonotido._tido /*String*/  = _tido;
RDebugUtils.currentLine=22020123;
 //BA.debugLineNum = 22020123;BA.debugLine="vSb_TidoNotido.Notido = Notido";
_vsb_tidonotido._notido /*String*/  = _notido;
RDebugUtils.currentLine=22020125;
 //BA.debugLineNum = 22020125;BA.debugLine="Return vSb_TidoNotido";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_vsb_tidonotido));return;};
RDebugUtils.currentLine=22020127;
 //BA.debugLineNum = 22020127;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Wait For(Fx_Validar_Descuentos_Globales) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_sumar_totales"), _fx_validar_descuentos_globales());
this.state = 19;
return;
case 19:
//C
this.state = 1;
_accion = (Boolean) result[0];
;
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Dim Total_Neto As Double";
_total_neto = 0;
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="Dim CantTotal As Double = 0";
_canttotal = 0;
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="Dim Items = 0";
_items = BA.NumberToString(0);
RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="Dim Decimal = 0";
_decimal = BA.NumberToString(0);
RDebugUtils.currentLine=21692425;
 //BA.debugLineNum = 21692425;BA.debugLine="Dim Moneda As String '= _TblEncabezado.Rows(0).It";
_moneda = "";
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="If Moneda <> \"$\" Then";
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
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="Decimal = 2";
_decimal = BA.NumberToString(2);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21692431;
 //BA.debugLineNum = 21692431;BA.debugLine="Dim Total_Neto As Double";
_total_neto = 0;
RDebugUtils.currentLine=21692433;
 //BA.debugLineNum = 21692433;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=21692434;
 //BA.debugLineNum = 21692434;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=21692436;
 //BA.debugLineNum = 21692436;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=21692438;
 //BA.debugLineNum = 21692438;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
RDebugUtils.currentLine=21692440;
 //BA.debugLineNum = 21692440;BA.debugLine="Hay_Descuentos_Globales = False";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=21692442;
 //BA.debugLineNum = 21692442;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=21692444;
 //BA.debugLineNum = 21692444;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
RDebugUtils.currentLine=21692445;
 //BA.debugLineNum = 21692445;BA.debugLine="Dim Precio As Double =Funciones.Fx_NuloPorNro(De";
_precio = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Precio")),0)));
RDebugUtils.currentLine=21692446;
 //BA.debugLineNum = 21692446;BA.debugLine="Dim ValNetoLinea As Double =Funciones.Fx_NuloPor";
_valnetolinea = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("ValNetoLinea")),0)));
RDebugUtils.currentLine=21692447;
 //BA.debugLineNum = 21692447;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=21692448;
 //BA.debugLineNum = 21692448;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
RDebugUtils.currentLine=21692450;
 //BA.debugLineNum = 21692450;BA.debugLine="If Tict = \"D\" Then";
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
RDebugUtils.currentLine=21692451;
 //BA.debugLineNum = 21692451;BA.debugLine="Hay_Descuentos_Globales = True";
parent._hay_descuentos_globales = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 5;
;
RDebugUtils.currentLine=21692454;
 //BA.debugLineNum = 21692454;BA.debugLine="Dim Cant As Double=Funciones.Fx_NuloPorNro(Detal";
_cant = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("CantUd"+BA.NumberToString(_untrans))),0)));
RDebugUtils.currentLine=21692456;
 //BA.debugLineNum = 21692456;BA.debugLine="CantTotal = CantTotal+ Round2(Cant,0)";
_canttotal = _canttotal+anywheresoftware.b4a.keywords.Common.Round2(_cant,(int) (0));
RDebugUtils.currentLine=21692458;
 //BA.debugLineNum = 21692458;BA.debugLine="Total_Neto = Total_Neto + ValNetoLinea";
_total_neto = _total_neto+_valnetolinea;
RDebugUtils.currentLine=21692460;
 //BA.debugLineNum = 21692460;BA.debugLine="Items = Items+1";
_items = BA.NumberToString((double)(Double.parseDouble(_items))+1);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=21692465;
 //BA.debugLineNum = 21692465;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_Izquie";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,_items,(int) (2),"0");
RDebugUtils.currentLine=21692466;
 //BA.debugLineNum = 21692466;BA.debugLine="If ItemStr = \"00\" Then ItemStr = 0";
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
RDebugUtils.currentLine=21692467;
 //BA.debugLineNum = 21692467;BA.debugLine="Lbl_Items.Text = \"Total Items: \" & ItemStr";
parent.mostCurrent._lbl_items.setText(BA.ObjectToCharSequence("Total Items: "+_itemstr));
RDebugUtils.currentLine=21692469;
 //BA.debugLineNum = 21692469;BA.debugLine="Lbl_Total_Neto.Tag = Round2(Total_Neto,0)";
parent.mostCurrent._lbl_total_neto.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2(_total_neto,(int) (0))));
RDebugUtils.currentLine=21692470;
 //BA.debugLineNum = 21692470;BA.debugLine="Lbl_Total_Iva.Tag = Round2(Total_Neto*0.19,0)";
parent.mostCurrent._lbl_total_iva.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2(_total_neto*0.19,(int) (0))));
RDebugUtils.currentLine=21692471;
 //BA.debugLineNum = 21692471;BA.debugLine="Lbl_Total_Impuestos.Tag = 0";
parent.mostCurrent._lbl_total_impuestos.setTag((Object)(0));
RDebugUtils.currentLine=21692472;
 //BA.debugLineNum = 21692472;BA.debugLine="Lbl_Total_Bruto.Tag = Round2(Lbl_Total_Neto.Tag+L";
parent.mostCurrent._lbl_total_bruto.setTag((Object)(anywheresoftware.b4a.keywords.Common.Round2((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag()))+(double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_iva.getTag())),(int) (0))));
RDebugUtils.currentLine=21692474;
 //BA.debugLineNum = 21692474;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=21692475;
 //BA.debugLineNum = 21692475;BA.debugLine="Lbl_Total_Iva.Text =  \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_iva.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_iva.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=21692476;
 //BA.debugLineNum = 21692476;BA.debugLine="Lbl_Total_Impuestos.Text  = \"$ \" & NumberFormat(L";
parent.mostCurrent._lbl_total_impuestos.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_impuestos.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=21692477;
 //BA.debugLineNum = 21692477;BA.debugLine="Lbl_Total_Neto.Text = \"$ \" & NumberFormat(Lbl_Tot";
parent.mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence("$ "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (2))));
RDebugUtils.currentLine=21692478;
 //BA.debugLineNum = 21692478;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Bru";
parent.mostCurrent._lbl_total_bruto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(parent.mostCurrent._lbl_total_bruto.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=21692480;
 //BA.debugLineNum = 21692480;BA.debugLine="Fila_Encabezado.Put(\"TotalNetoDoc\".ToLowerCase,Lb";
parent._fila_encabezado.Put((Object)("TotalNetoDoc".toLowerCase()),parent.mostCurrent._lbl_total_neto.getTag());
RDebugUtils.currentLine=21692481;
 //BA.debugLineNum = 21692481;BA.debugLine="Fila_Encabezado.Put(\"TotalIvaDoc\".ToLowerCase,Lbl";
parent._fila_encabezado.Put((Object)("TotalIvaDoc".toLowerCase()),parent.mostCurrent._lbl_total_iva.getTag());
RDebugUtils.currentLine=21692482;
 //BA.debugLineNum = 21692482;BA.debugLine="Fila_Encabezado.Put(\"TotalBrutoDoc\".ToLowerCase,L";
parent._fila_encabezado.Put((Object)("TotalBrutoDoc".toLowerCase()),parent.mostCurrent._lbl_total_bruto.getTag());
RDebugUtils.currentLine=21692484;
 //BA.debugLineNum = 21692484;BA.debugLine="Fila_Encabezado.Put(\"CantTotal\".ToLowerCase,CantT";
parent._fila_encabezado.Put((Object)("CantTotal".toLowerCase()),(Object)(_canttotal));
RDebugUtils.currentLine=21692487;
 //BA.debugLineNum = 21692487;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent.mostCurrent._fila_idenc);
RDebugUtils.currentLine=21692489;
 //BA.debugLineNum = 21692489;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="Dim Koen As String = Fila_Encabezado.Get(\"CodEnti";
_koen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodEntidad".toLowerCase())));
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="Dim Suen As String = Fila_Encabezado.Get(\"CodSucE";
_suen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("CodSucEntidad".toLowerCase())));
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="Dim Nokoen As String = Fila_Encabezado.Get(\"Nombr";
_nokoen = BA.ObjectToString(parent._fila_encabezado.Get((Object)("Nombre_Entidad".toLowerCase())));
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_koen,_suen);
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_entidad"), (Object)(_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=20905996;
 //BA.debugLineNum = 20905996;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=20905998;
 //BA.debugLineNum = 20905998;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=20906000;
 //BA.debugLineNum = 20906000;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=20906003;
 //BA.debugLineNum = 20906003;BA.debugLine="Row_Entidad =Filas.Get(0)";
parent._row_entidad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=20906005;
 //BA.debugLineNum = 20906005;BA.debugLine="If ActualizarDatos Then";
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
RDebugUtils.currentLine=20906006;
 //BA.debugLineNum = 20906006;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,";
_sb_actualizar_datos_de_la_entidad(parent._row_entidad,anywheresoftware.b4a.keywords.Common.False,parent._editar_documento,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=20906008;
 //BA.debugLineNum = 20906008;BA.debugLine="Log(\"Entidad cargada \" & Koen.Trim & \" - \" & No";
anywheresoftware.b4a.keywords.Common.LogImpl("220906008","Entidad cargada "+_koen.trim()+" - "+_nokoen,0);
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
RDebugUtils.currentLine=20906015;
 //BA.debugLineNum = 20906015;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("220906015",_js._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=20906018;
 //BA.debugLineNum = 20906018;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=20906020;
 //BA.debugLineNum = 20906020;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
parent._fila_encabezado = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20840459;
 //BA.debugLineNum = 20840459;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent.mostCurrent._fila_idenc = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840465;
 //BA.debugLineNum = 20840465;BA.debugLine="Txt_Observaciones.Text = Fila_Observaciones.Get(\"";
parent.mostCurrent._txt_observaciones.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("observaciones"))));
RDebugUtils.currentLine=20840466;
 //BA.debugLineNum = 20840466;BA.debugLine="Txt_Orden_compra.Text = Fila_Observaciones.Get(\"o";
parent.mostCurrent._txt_orden_compra.setText(BA.ObjectToCharSequence(parent._fila_observaciones.Get((Object)("orden_compra"))));
RDebugUtils.currentLine=20840470;
 //BA.debugLineNum = 20840470;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=20840471;
 //BA.debugLineNum = 20840471;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.vS";
parent._fila_despafacil = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=20840473;
 //BA.debugLineNum = 20840473;BA.debugLine="Lbl_TipoDespacho.Tag = Fila_DespaFacil.Get(\"CodTi";
parent.mostCurrent._lbl_tipodespacho.setTag(parent._fila_despafacil.Get((Object)("CodTipoDespacho".toLowerCase())));
RDebugUtils.currentLine=20840474;
 //BA.debugLineNum = 20840474;BA.debugLine="Lbl_TipoDespacho.Text = Fila_DespaFacil.Get(\"Tipo";
parent.mostCurrent._lbl_tipodespacho.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoDespacho".toLowerCase()))));
RDebugUtils.currentLine=20840476;
 //BA.debugLineNum = 20840476;BA.debugLine="Lbl_TipoPagoDesp.Tag =  Fila_DespaFacil.Get(\"CodT";
parent.mostCurrent._lbl_tipopagodesp.setTag(parent._fila_despafacil.Get((Object)("CodTipoPagoDesp".toLowerCase())));
RDebugUtils.currentLine=20840477;
 //BA.debugLineNum = 20840477;BA.debugLine="Lbl_TipoPagoDesp.Text = Fila_DespaFacil.Get(\"Tipo";
parent.mostCurrent._lbl_tipopagodesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("TipoPagoDesp".toLowerCase()))));
RDebugUtils.currentLine=20840479;
 //BA.debugLineNum = 20840479;BA.debugLine="Lbl_CodDocDestino.Tag =  Fila_DespaFacil.Get(\"Cod";
parent.mostCurrent._lbl_coddocdestino.setTag(parent._fila_despafacil.Get((Object)("CodDocDestino".toLowerCase())));
RDebugUtils.currentLine=20840480;
 //BA.debugLineNum = 20840480;BA.debugLine="Lbl_CodDocDestino.Text = Fila_DespaFacil.Get(\"Doc";
parent.mostCurrent._lbl_coddocdestino.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DocDestino".toLowerCase()))));
RDebugUtils.currentLine=20840482;
 //BA.debugLineNum = 20840482;BA.debugLine="Txt_DireccionDesp.Text =  Fila_DespaFacil.Get(\"Di";
parent.mostCurrent._txt_direcciondesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("DireccionDesp".toLowerCase()))));
RDebugUtils.currentLine=20840483;
 //BA.debugLineNum = 20840483;BA.debugLine="Txt_ObservacionesDesp.Text = Fila_DespaFacil.Get(";
parent.mostCurrent._txt_observacionesdesp.setText(BA.ObjectToCharSequence(parent._fila_despafacil.Get((Object)("ObservacionesDesp".toLowerCase()))));
RDebugUtils.currentLine=20840485;
 //BA.debugLineNum = 20840485;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
anywheresoftware.b4a.keywords.Common.LogImpl("220840485","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
RDebugUtils.currentLine=20840487;
 //BA.debugLineNum = 20840487;BA.debugLine="Wait For (Sb_Cargar_Entidad(False)) Complete (Fin";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_cargar_documento2"), _sb_cargar_entidad(anywheresoftware.b4a.keywords.Common.False));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_fin = (Boolean) result[0];
;
RDebugUtils.currentLine=20840491;
 //BA.debugLineNum = 20840491;BA.debugLine="Lbl_FechaEmision.Text = DateTime.Date(Fila_Encabe";
parent.mostCurrent._lbl_fechaemision.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fechaemision".toLowerCase()))))));
RDebugUtils.currentLine=20840492;
 //BA.debugLineNum = 20840492;BA.debugLine="Lbl_Fecha_1er_Vencimiento.Text = DateTime.Date(Fi";
parent.mostCurrent._lbl_fecha_1er_vencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("Fecha_1er_Vencimiento".toLowerCase()))))));
RDebugUtils.currentLine=20840493;
 //BA.debugLineNum = 20840493;BA.debugLine="Lbl_FechaUltVencimiento.Text = DateTime.Date(Fila";
parent.mostCurrent._lbl_fechaultvencimiento.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(parent._fila_encabezado.Get((Object)("FechaUltVencimiento".toLowerCase()))))));
RDebugUtils.currentLine=20840495;
 //BA.debugLineNum = 20840495;BA.debugLine="Lbl_Coutas.Text = Fila_Encabezado.Get(\"Cuotas\")";
parent.mostCurrent._lbl_coutas.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Cuotas"))));
RDebugUtils.currentLine=20840496;
 //BA.debugLineNum = 20840496;BA.debugLine="Lbl_Dias_1er_Vencimiento.Text = Fila_Encabezado.G";
parent.mostCurrent._lbl_dias_1er_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_1er_Vencimiento"))));
RDebugUtils.currentLine=20840497;
 //BA.debugLineNum = 20840497;BA.debugLine="Lbl_Dias_Vencimiento.Text = Fila_Encabezado.Get(\"";
parent.mostCurrent._lbl_dias_vencimiento.setText(BA.ObjectToCharSequence(parent._fila_encabezado.Get((Object)("Dias_Vencimiento"))));
RDebugUtils.currentLine=20840499;
 //BA.debugLineNum = 20840499;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Sub Sb_Cargar_IDList";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Private Row As Int";
_row = 0;
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="IDList.Initialize";
mostCurrent._idlist.Initialize();
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Dim RowNumber As Int = 0";
_rownumber = (int) (0);
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(_id_docenc))));
RDebugUtils.currentLine=21626891;
 //BA.debugLineNum = 21626891;BA.debugLine="If Cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="RowNumber = Cursor1.RowCount";
_rownumber = _cursor1.getRowCount();
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="IDList.Initialize";
mostCurrent._idlist.Initialize();
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="For Row = 0 To RowNumber - 1";
{
final int step9 = 1;
final int limit9 = (int) (_rownumber-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
RDebugUtils.currentLine=21626895;
 //BA.debugLineNum = 21626895;BA.debugLine="Cursor1.Position = Row";
_cursor1.setPosition(_row);
RDebugUtils.currentLine=21626896;
 //BA.debugLineNum = 21626896;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
mostCurrent._idlist.Add((Object)(_cursor1.GetString2((int) (0))));
 }
};
 }else {
RDebugUtils.currentLine=21626899;
 //BA.debugLineNum = 21626899;BA.debugLine="ToastMessageShow(\"No items found\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No items found"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=21626902;
 //BA.debugLineNum = 21626902;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=21626904;
 //BA.debugLineNum = 21626904;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Dim Accion As Int";
_accion = 0;
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,UdTrans,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=22675465;
 //BA.debugLineNum = 22675465;BA.debugLine="If Cursor1.RowCount = 0 Then";
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
RDebugUtils.currentLine=22675467;
 //BA.debugLineNum = 22675467;BA.debugLine="Return 0";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=22675473;
 //BA.debugLineNum = 22675473;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=22675484;
 //BA.debugLineNum = 22675484;BA.debugLine="Dim Array_Encabezado() As String = GeneraArreglo(";
_array_encabezado = _generaarreglo("Encabezado_Doc");
RDebugUtils.currentLine=22675485;
 //BA.debugLineNum = 22675485;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22675486;
 //BA.debugLineNum = 22675486;BA.debugLine="Dim Encabezado As Map = DBUtils.ExecuteJSON(Varia";
_encabezado = new anywheresoftware.b4a.objects.collections.Map();
_encabezado = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_encabezado));
RDebugUtils.currentLine=22675488;
 //BA.debugLineNum = 22675488;BA.debugLine="Dim Array_Detalle() As String = GeneraArreglo(\"De";
_array_detalle = _generaarreglo("Detalle_Doc");
RDebugUtils.currentLine=22675489;
 //BA.debugLineNum = 22675489;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22675490;
 //BA.debugLineNum = 22675490;BA.debugLine="Dim Detalle As Map = DBUtils.ExecuteJSON(Variable";
_detalle = new anywheresoftware.b4a.objects.collections.Map();
_detalle = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_detalle));
RDebugUtils.currentLine=22675492;
 //BA.debugLineNum = 22675492;BA.debugLine="Dim Array_Descuentos() As String = GeneraArreglo(";
_array_descuentos = _generaarreglo("Descuentos_Doc");
RDebugUtils.currentLine=22675493;
 //BA.debugLineNum = 22675493;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
parent.mostCurrent._consulta_sql = "Select * From Descuentos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22675494;
 //BA.debugLineNum = 22675494;BA.debugLine="Dim Descuentos As Map = DBUtils.ExecuteJSON(Varia";
_descuentos = new anywheresoftware.b4a.objects.collections.Map();
_descuentos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_descuentos));
RDebugUtils.currentLine=22675496;
 //BA.debugLineNum = 22675496;BA.debugLine="Dim Array_Impuestos() As String = GeneraArreglo(\"";
_array_impuestos = _generaarreglo("Impuestos_Doc");
RDebugUtils.currentLine=22675497;
 //BA.debugLineNum = 22675497;BA.debugLine="Consulta_Sql = \"Select * From Impuestos_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Impuestos_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22675498;
 //BA.debugLineNum = 22675498;BA.debugLine="Dim Impuestos As Map = DBUtils.ExecuteJSON(Variab";
_impuestos = new anywheresoftware.b4a.objects.collections.Map();
_impuestos = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_impuestos));
RDebugUtils.currentLine=22675500;
 //BA.debugLineNum = 22675500;BA.debugLine="Dim Array_Observaciones() As String = GeneraArreg";
_array_observaciones = _generaarreglo("Observaciones_Doc");
RDebugUtils.currentLine=22675501;
 //BA.debugLineNum = 22675501;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent.mostCurrent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=22675502;
 //BA.debugLineNum = 22675502;BA.debugLine="Dim Observaciones As Map = DBUtils.ExecuteJSON(Va";
_observaciones = new anywheresoftware.b4a.objects.collections.Map();
_observaciones = parent.mostCurrent._dbutils._executejson /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0),anywheresoftware.b4a.keywords.Common.ArrayToList(_array_observaciones));
RDebugUtils.currentLine=22675504;
 //BA.debugLineNum = 22675504;BA.debugLine="Dim Encabezadojs As List";
_encabezadojs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22675505;
 //BA.debugLineNum = 22675505;BA.debugLine="Encabezadojs.Initialize";
_encabezadojs.Initialize();
RDebugUtils.currentLine=22675506;
 //BA.debugLineNum = 22675506;BA.debugLine="Encabezadojs.Add(Encabezado)";
_encabezadojs.Add((Object)(_encabezado.getObject()));
RDebugUtils.currentLine=22675507;
 //BA.debugLineNum = 22675507;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22675508;
 //BA.debugLineNum = 22675508;BA.debugLine="JSONGenerator.Initialize2(Encabezadojs)";
_jsongenerator.Initialize2(_encabezadojs);
RDebugUtils.currentLine=22675510;
 //BA.debugLineNum = 22675510;BA.debugLine="Dim Json As String = JSONGenerator.ToPrettyString";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22675511;
 //BA.debugLineNum = 22675511;BA.debugLine="Dim Json2 As String = JSONGenerator.ToString";
_json2 = _jsongenerator.ToString();
RDebugUtils.currentLine=22675513;
 //BA.debugLineNum = 22675513;BA.debugLine="Log(Json2)'(JSONGenerator.ToPrettyString(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("222675513",_json2,0);
RDebugUtils.currentLine=22675515;
 //BA.debugLineNum = 22675515;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Encabezado");
RDebugUtils.currentLine=22675516;
 //BA.debugLineNum = 22675516;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 37;
return;
case 37:
//C
this.state = 5;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22675518;
 //BA.debugLineNum = 22675518;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22675520;
 //BA.debugLineNum = 22675520;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22675522;
 //BA.debugLineNum = 22675522;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22675524;
 //BA.debugLineNum = 22675524;BA.debugLine="Accion = 1";
_accion = (int) (1);
RDebugUtils.currentLine=22675526;
 //BA.debugLineNum = 22675526;BA.debugLine="Dim Detallejs As List";
_detallejs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22675527;
 //BA.debugLineNum = 22675527;BA.debugLine="Detallejs.Initialize";
_detallejs.Initialize();
RDebugUtils.currentLine=22675528;
 //BA.debugLineNum = 22675528;BA.debugLine="Detallejs.Add(Detalle)";
_detallejs.Add((Object)(_detalle.getObject()));
RDebugUtils.currentLine=22675529;
 //BA.debugLineNum = 22675529;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22675530;
 //BA.debugLineNum = 22675530;BA.debugLine="JSONGenerator.Initialize2(Detallejs)";
_jsongenerator.Initialize2(_detallejs);
RDebugUtils.currentLine=22675532;
 //BA.debugLineNum = 22675532;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22675534;
 //BA.debugLineNum = 22675534;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Detalle");
RDebugUtils.currentLine=22675535;
 //BA.debugLineNum = 22675535;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 38;
return;
case 38:
//C
this.state = 11;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22675537;
 //BA.debugLineNum = 22675537;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22675539;
 //BA.debugLineNum = 22675539;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22675541;
 //BA.debugLineNum = 22675541;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22675543;
 //BA.debugLineNum = 22675543;BA.debugLine="Accion = 2";
_accion = (int) (2);
RDebugUtils.currentLine=22675545;
 //BA.debugLineNum = 22675545;BA.debugLine="Dim Descuentosjs As List";
_descuentosjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22675546;
 //BA.debugLineNum = 22675546;BA.debugLine="Descuentosjs.Initialize";
_descuentosjs.Initialize();
RDebugUtils.currentLine=22675547;
 //BA.debugLineNum = 22675547;BA.debugLine="Descuentosjs.Add(Descuentos)";
_descuentosjs.Add((Object)(_descuentos.getObject()));
RDebugUtils.currentLine=22675548;
 //BA.debugLineNum = 22675548;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22675549;
 //BA.debugLineNum = 22675549;BA.debugLine="JSONGenerator.Initialize2(Descuentosjs)";
_jsongenerator.Initialize2(_descuentosjs);
RDebugUtils.currentLine=22675551;
 //BA.debugLineNum = 22675551;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22675553;
 //BA.debugLineNum = 22675553;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Descuentos");
RDebugUtils.currentLine=22675554;
 //BA.debugLineNum = 22675554;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22675556;
 //BA.debugLineNum = 22675556;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22675558;
 //BA.debugLineNum = 22675558;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22675560;
 //BA.debugLineNum = 22675560;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22675562;
 //BA.debugLineNum = 22675562;BA.debugLine="Accion = 3";
_accion = (int) (3);
RDebugUtils.currentLine=22675564;
 //BA.debugLineNum = 22675564;BA.debugLine="Dim Observacionesjs As List";
_observacionesjs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22675565;
 //BA.debugLineNum = 22675565;BA.debugLine="Observacionesjs.Initialize";
_observacionesjs.Initialize();
RDebugUtils.currentLine=22675566;
 //BA.debugLineNum = 22675566;BA.debugLine="Observacionesjs.Add(Observaciones)";
_observacionesjs.Add((Object)(_observaciones.getObject()));
RDebugUtils.currentLine=22675567;
 //BA.debugLineNum = 22675567;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=22675568;
 //BA.debugLineNum = 22675568;BA.debugLine="JSONGenerator.Initialize2(Observacionesjs)";
_jsongenerator.Initialize2(_observacionesjs);
RDebugUtils.currentLine=22675570;
 //BA.debugLineNum = 22675570;BA.debugLine="Json = JSONGenerator.ToPrettyString(1)";
_json = _jsongenerator.ToPrettyString((int) (1));
RDebugUtils.currentLine=22675572;
 //BA.debugLineNum = 22675572;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_getdataset_sb_json_impbk /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_json,"Observaciones");
RDebugUtils.currentLine=22675573;
 //BA.debugLineNum = 22675573;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_grabar_standby"), (Object)(_js));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=22675575;
 //BA.debugLineNum = 22675575;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=22675577;
 //BA.debugLineNum = 22675577;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=22675579;
 //BA.debugLineNum = 22675579;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=22675581;
 //BA.debugLineNum = 22675581;BA.debugLine="Accion = 4";
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
RDebugUtils.currentLine=22675602;
 //BA.debugLineNum = 22675602;BA.debugLine="Return Accion";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=22675604;
 //BA.debugLineNum = 22675604;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim SQL As SQL = Variables.vSql";
_sql = parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Dim Detalle As ResultSet";
_detalle = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="Dim ProConStockInsuficiente As Int";
_proconstockinsuficiente = 0;
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
RDebugUtils.currentLine=23396359;
 //BA.debugLineNum = 23396359;BA.debugLine="Detalle = SQL.ExecQuery(Consulta_Sql)";
_detalle = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery(parent.mostCurrent._consulta_sql)));
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="ProgressDialogShow(\"Revisando stock...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Revisando stock..."));
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="Do While Detalle.NextRow";
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
RDebugUtils.currentLine=23396365;
 //BA.debugLineNum = 23396365;BA.debugLine="Dim Id_DocDet As Int = Detalle.GetString(\"Id_Doc";
parent._id_docdet = (int)(Double.parseDouble(_detalle.GetString("Id_DocDet")));
RDebugUtils.currentLine=23396366;
 //BA.debugLineNum = 23396366;BA.debugLine="Dim	Empresa As String = Detalle.GetString(\"Empre";
_empresa = _detalle.GetString("Empresa");
RDebugUtils.currentLine=23396367;
 //BA.debugLineNum = 23396367;BA.debugLine="Dim	Sucursal As String = Detalle.GetString(\"Sucu";
_sucursal = _detalle.GetString("Sucursal");
RDebugUtils.currentLine=23396368;
 //BA.debugLineNum = 23396368;BA.debugLine="Dim	Bodega As String = Detalle.GetString(\"Bodega";
_bodega = _detalle.GetString("Bodega");
RDebugUtils.currentLine=23396369;
 //BA.debugLineNum = 23396369;BA.debugLine="Dim Codigo As String = Detalle.GetString(\"Codigo";
_codigo = _detalle.GetString("Codigo");
RDebugUtils.currentLine=23396370;
 //BA.debugLineNum = 23396370;BA.debugLine="Dim Cantidad As Double =Funciones.Fx_NuloPorNro(";
_cantidad = (double)(Double.parseDouble(parent.mostCurrent._funciones._fx_nulopornro /*String*/ (mostCurrent.activityBA,(Object)(_detalle.GetDouble("Cantidad")),0)));
RDebugUtils.currentLine=23396371;
 //BA.debugLineNum = 23396371;BA.debugLine="Dim UnTrans As Int= Detalle.GetString(\"UnTrans\")";
_untrans = (int)(Double.parseDouble(_detalle.GetString("UnTrans")));
RDebugUtils.currentLine=23396372;
 //BA.debugLineNum = 23396372;BA.debugLine="Dim	Tidopa As String";
_tidopa = "";
RDebugUtils.currentLine=23396374;
 //BA.debugLineNum = 23396374;BA.debugLine="Dim Tict As String = Detalle.GetString(\"Tict\")";
_tict = _detalle.GetString("Tict");
RDebugUtils.currentLine=23396375;
 //BA.debugLineNum = 23396375;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(Detalle.Ge";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,_detalle.GetInt("Prct"));
RDebugUtils.currentLine=23396377;
 //BA.debugLineNum = 23396377;BA.debugLine="Dim	Tido As String";
_tido = "";
RDebugUtils.currentLine=23396379;
 //BA.debugLineNum = 23396379;BA.debugLine="If Prct = False Then";
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
RDebugUtils.currentLine=23396381;
 //BA.debugLineNum = 23396381;BA.debugLine="Wait For(Sb_Revisar_Stock_X_Fila(Id_DocDet,Tido";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_recorrer_detalle_rev_stock"), _sb_revisar_stock_x_fila(parent._id_docdet,_tido,_codigo,_empresa,_sucursal,_bodega,_cantidad,_untrans,""));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=23396383;
 //BA.debugLineNum = 23396383;BA.debugLine="If Result = False Then";
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
RDebugUtils.currentLine=23396384;
 //BA.debugLineNum = 23396384;BA.debugLine="ProConStockInsuficiente = ProConStockInsuficie";
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
RDebugUtils.currentLine=23396391;
 //BA.debugLineNum = 23396391;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=23396393;
 //BA.debugLineNum = 23396393;BA.debugLine="If ProConStockInsuficiente > 0 Then";
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
RDebugUtils.currentLine=23396394;
 //BA.debugLineNum = 23396394;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=23396397;
 //BA.debugLineNum = 23396397;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=23396399;
 //BA.debugLineNum = 23396399;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Sub Sb_Editar_Producto (Index As Int, Value As Obj";
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = mostCurrent._xclvdetalle._getrawlistitem(_index);
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
_lblcodigo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblcodigo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="Id_DocDet = LblCodigo.Tag";
_id_docdet = (int)(BA.ObjectToNumber(_lblcodigo.getTag()));
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
mostCurrent._frm_post_01_producto._id_docdet /*int*/  = _id_docdet;
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._frm_post_01_producto.getObject()));
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_revisar_stock_fila /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_tido,_empresa,_sucursal,_bodega,_codigo,_cantidad,_untrans,_tidopa);
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_revisar_stock_x_fila"), (Object)(_js));
this.state = 27;
return;
case 27:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=23461904;
 //BA.debugLineNum = 23461904;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=23461906;
 //BA.debugLineNum = 23461906;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=23461908;
 //BA.debugLineNum = 23461908;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=23461909;
 //BA.debugLineNum = 23461909;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
_filastk = new anywheresoftware.b4a.objects.collections.Map();
_filastk = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=23461911;
 //BA.debugLineNum = 23461911;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"S";
_stock_disponible = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Disponible"))));
RDebugUtils.currentLine=23461912;
 //BA.debugLineNum = 23461912;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stock";
_stock_fisico = (double)(BA.ObjectToNumber(_filastk.Get((Object)("Stock_Fisico"))));
RDebugUtils.currentLine=23461913;
 //BA.debugLineNum = 23461913;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible & \"";
anywheresoftware.b4a.keywords.Common.LogImpl("223461913","Stock disponible: "+BA.NumberToString(_stock_disponible)+", Stock fisico: "+BA.NumberToString(_stock_fisico),0);
RDebugUtils.currentLine=23461915;
 //BA.debugLineNum = 23461915;BA.debugLine="Dim Stock_Suficiente As Boolean";
_stock_suficiente = false;
RDebugUtils.currentLine=23461917;
 //BA.debugLineNum = 23461917;BA.debugLine="If Stock_Disponible <= 0 Then";
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
RDebugUtils.currentLine=23461918;
 //BA.debugLineNum = 23461918;BA.debugLine="Stock_Suficiente = False";
_stock_suficiente = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=23461920;
 //BA.debugLineNum = 23461920;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
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
RDebugUtils.currentLine=23461921;
 //BA.debugLineNum = 23461921;BA.debugLine="Stock_Suficiente = True";
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
RDebugUtils.currentLine=23461925;
 //BA.debugLineNum = 23461925;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._updaterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc","stockbodega",(Object)(_stock_disponible),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Id_DocDet"),(Object)(_vid_docdet)}));
RDebugUtils.currentLine=23461929;
 //BA.debugLineNum = 23461929;BA.debugLine="If Stock_Suficiente = False Then";
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
RDebugUtils.currentLine=23461930;
 //BA.debugLineNum = 23461930;BA.debugLine="Return False";
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
RDebugUtils.currentLine=23461935;
 //BA.debugLineNum = 23461935;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23461936;
 //BA.debugLineNum = 23461936;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pudo";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService..."),BA.ObjectToCharSequence("Error de comunicación"),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=23461937;
 //BA.debugLineNum = 23461937;BA.debugLine="Return False";
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
RDebugUtils.currentLine=23461942;
 //BA.debugLineNum = 23461942;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("223461942",_js._errormessage /*String*/ ,0);
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=23461945;
 //BA.debugLineNum = 23461945;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=23461947;
 //BA.debugLineNum = 23461947;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent.mostCurrent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_concepto,_empresa,_sucursal,_bodega,_lista,"");
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "sb_traer_concepto"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="ProgressDialogShow(\"Buscando concepto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando concepto..."));
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=21299216;
 //BA.debugLineNum = 21299216;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=21299221;
 //BA.debugLineNum = 21299221;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
RDebugUtils.currentLine=21299225;
 //BA.debugLineNum = 21299225;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=21299226;
 //BA.debugLineNum = 21299226;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=21299227;
 //BA.debugLineNum = 21299227;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=21299229;
 //BA.debugLineNum = 21299229;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=21299231;
 //BA.debugLineNum = 21299231;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=21299232;
 //BA.debugLineNum = 21299232;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21299234;
 //BA.debugLineNum = 21299234;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=21299235;
 //BA.debugLineNum = 21299235;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consul";
_fila = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21299237;
 //BA.debugLineNum = 21299237;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21299239;
 //BA.debugLineNum = 21299239;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=21299240;
 //BA.debugLineNum = 21299240;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21299242;
 //BA.debugLineNum = 21299242;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=21299244;
 //BA.debugLineNum = 21299244;BA.debugLine="Sb_Procesar_Fila(\"DescuentoPorc\",Fila)";
_sb_procesar_fila("DescuentoPorc",(int)(BA.ObjectToNumber(_fila)));
RDebugUtils.currentLine=21299246;
 //BA.debugLineNum = 21299246;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21299247;
 //BA.debugLineNum = 21299247;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
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
RDebugUtils.currentLine=21299252;
 //BA.debugLineNum = 21299252;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("221299252",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=21299253;
 //BA.debugLineNum = 21299253;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=21299255;
 //BA.debugLineNum = 21299255;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=21299256;
 //BA.debugLineNum = 21299256;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=21299259;
 //BA.debugLineNum = 21299259;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _tab_post_tabchanged() throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tab_post_tabchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tab_post_tabchanged", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub Tab_Post_TabChanged";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_row_entidad.IsInitialized())) { 
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="If Tab_Post.CurrentTab <> 0 Then";
if (mostCurrent._tab_post.getCurrentTab()!=0) { 
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="Msgbox2Async(\"Debe ingresar la entidad\",\"Valida";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Debe ingresar la entidad"),BA.ObjectToCharSequence("Validación"),"Ok","","",mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="Tab_Post.CurrentTab = 0";
mostCurrent._tab_post.setCurrentTab((int) (0));
 };
 };
RDebugUtils.currentLine=21757966;
 //BA.debugLineNum = 21757966;BA.debugLine="If Tab_Post.CurrentTab = 2 Then";
if (mostCurrent._tab_post.getCurrentTab()==2) { 
RDebugUtils.currentLine=21757968;
 //BA.debugLineNum = 21757968;BA.debugLine="Chk_Valores_Netos.Checked = True";
mostCurrent._chk_valores_netos.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21757970;
 //BA.debugLineNum = 21757970;BA.debugLine="Lbl_Total_Neto.Text = NumberFormat(Lbl_Total_Net";
mostCurrent._lbl_total_neto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_neto.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=21757971;
 //BA.debugLineNum = 21757971;BA.debugLine="Lbl_Total_Iva.Text = NumberFormat(Lbl_Total_Iva.";
mostCurrent._lbl_total_iva.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_iva.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=21757972;
 //BA.debugLineNum = 21757972;BA.debugLine="Lbl_Total_Impuestos.Text = NumberFormat(Lbl_Tota";
mostCurrent._lbl_total_impuestos.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_impuestos.getTag())),(int) (0),(int) (0))));
RDebugUtils.currentLine=21757973;
 //BA.debugLineNum = 21757973;BA.debugLine="Lbl_Total_Bruto.Text = NumberFormat(Lbl_Total_Br";
mostCurrent._lbl_total_bruto.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(mostCurrent._lbl_total_bruto.getTag())),(int) (0),(int) (0))));
 };
RDebugUtils.currentLine=21757977;
 //BA.debugLineNum = 21757977;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="If	Hay_Descuentos_Globales Then";
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
RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CRL";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE AGREMAR MAS ITEM"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO PARA INGRESAR MAS PRODUCTOS"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=21233675;
 //BA.debugLineNum = 21233675;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=21233678;
 //BA.debugLineNum = 21233678;BA.debugLine="Wait For(Sb_ProductoModoConsulta) Complete (RsMos";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), _sb_productomodoconsulta());
this.state = 31;
return;
case 31:
//C
this.state = 5;
_rsmoscs = (Boolean) result[0];
;
RDebugUtils.currentLine=21233679;
 //BA.debugLineNum = 21233679;BA.debugLine="If Not(RsMosCs) Then";
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
RDebugUtils.currentLine=21233680;
 //BA.debugLineNum = 21233680;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=21233683;
 //BA.debugLineNum = 21233683;BA.debugLine="Wait For(Fx_Fx_Validar_Lineas_Por_Documento_VS_Fo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), _fx_fx_validar_lineas_por_documento_vs_formato());
this.state = 32;
return;
case 32:
//C
this.state = 9;
_resultado = (Boolean) result[0];
;
RDebugUtils.currentLine=21233684;
 //BA.debugLineNum = 21233684;BA.debugLine="If Not(Resultado) Then";
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
RDebugUtils.currentLine=21233685;
 //BA.debugLineNum = 21233685;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=21233688;
 //BA.debugLineNum = 21233688;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=21233690;
 //BA.debugLineNum = 21233690;BA.debugLine="Dim Codigo As String = Txt_Codigo.Text.Trim";
_codigo = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=21233692;
 //BA.debugLineNum = 21233692;BA.debugLine="If Codigo = \"\" Then";
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
RDebugUtils.currentLine=21233693;
 //BA.debugLineNum = 21233693;BA.debugLine="Txt_Codigo.Text = \"\"";
parent.mostCurrent._txt_codigo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=21233694;
 //BA.debugLineNum = 21233694;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
RDebugUtils.currentLine=21233695;
 //BA.debugLineNum = 21233695;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=21233698;
 //BA.debugLineNum = 21233698;BA.debugLine="ProgressDialogShow(\"Buscando producto...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Buscando producto..."));
RDebugUtils.currentLine=21233700;
 //BA.debugLineNum = 21233700;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
_empresa = parent.mostCurrent._variables._gl_empresa /*String*/ ;
RDebugUtils.currentLine=21233701;
 //BA.debugLineNum = 21233701;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
_sucursal = parent.mostCurrent._variables._gl_sucursal /*String*/ ;
RDebugUtils.currentLine=21233702;
 //BA.debugLineNum = 21233702;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
_bodega = parent.mostCurrent._variables._gl_bodega /*String*/ ;
RDebugUtils.currentLine=21233703;
 //BA.debugLineNum = 21233703;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=21233705;
 //BA.debugLineNum = 21233705;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent.mostCurrent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (mostCurrent.activityBA,frm_post_01_formulario.getObject(),_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
RDebugUtils.currentLine=21233707;
 //BA.debugLineNum = 21233707;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "txt_codigo_enterpressed"), (Object)(_js));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
RDebugUtils.currentLine=21233709;
 //BA.debugLineNum = 21233709;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=21233711;
 //BA.debugLineNum = 21233711;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=21233713;
 //BA.debugLineNum = 21233713;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=21233715;
 //BA.debugLineNum = 21233715;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent.mostCurrent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_js._getstring /*String*/ (null));
RDebugUtils.currentLine=21233716;
 //BA.debugLineNum = 21233716;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=21233718;
 //BA.debugLineNum = 21233718;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Codigo\")";
_errorstr = BA.ObjectToString(_fila.Get((Object)("Codigo")));
RDebugUtils.currentLine=21233720;
 //BA.debugLineNum = 21233720;BA.debugLine="If ErrorStr.Contains(\"Error_\")  Then";
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
RDebugUtils.currentLine=21233721;
 //BA.debugLineNum = 21233721;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21233722;
 //BA.debugLineNum = 21233722;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=21233723;
 //BA.debugLineNum = 21233723;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
RDebugUtils.currentLine=21233724;
 //BA.debugLineNum = 21233724;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=21233727;
 //BA.debugLineNum = 21233727;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
RDebugUtils.currentLine=21233729;
 //BA.debugLineNum = 21233729;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=21233731;
 //BA.debugLineNum = 21233731;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent.mostCurrent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=21233732;
 //BA.debugLineNum = 21233732;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21233734;
 //BA.debugLineNum = 21233734;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=21233737;
 //BA.debugLineNum = 21233737;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=21233739;
 //BA.debugLineNum = 21233739;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
RDebugUtils.currentLine=21233740;
 //BA.debugLineNum = 21233740;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
RDebugUtils.currentLine=21233742;
 //BA.debugLineNum = 21233742;BA.debugLine="New_Row.Put(\"moneda\",Variables.Global_Row_Moned";
_new_row.Put((Object)("moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=21233743;
 //BA.debugLineNum = 21233743;BA.debugLine="New_Row.Put(\"tipo_moneda\",Variables.Global_Row_";
_new_row.Put((Object)("tipo_moneda"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=21233744;
 //BA.debugLineNum = 21233744;BA.debugLine="New_Row.Put(\"tipo_cambio\",Variables.Global_Row_";
_new_row.Put((Object)("tipo_cambio"),parent.mostCurrent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=21233745;
 //BA.debugLineNum = 21233745;BA.debugLine="New_Row.Put(\"codlista\",Lista)";
_new_row.Put((Object)("codlista"),(Object)(_lista));
RDebugUtils.currentLine=21233747;
 //BA.debugLineNum = 21233747;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
parent._id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21233749;
 //BA.debugLineNum = 21233749;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=21233750;
 //BA.debugLineNum = 21233750;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variabl";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=21233752;
 //BA.debugLineNum = 21233752;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_D";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=21233754;
 //BA.debugLineNum = 21233754;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"i";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=21233755;
 //BA.debugLineNum = 21233755;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
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
RDebugUtils.currentLine=21233760;
 //BA.debugLineNum = 21233760;BA.debugLine="Log(Js.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("221233760",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=21233763;
 //BA.debugLineNum = 21233763;BA.debugLine="Buscar_productos.ProductoABuscar = Txt_Codigo.Te";
parent.mostCurrent._buscar_productos._productoabuscar /*String*/  = parent.mostCurrent._txt_codigo.getText().trim();
RDebugUtils.currentLine=21233764;
 //BA.debugLineNum = 21233764;BA.debugLine="StartActivity(Buscar_productos)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._buscar_productos.getObject()));
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=21233767;
 //BA.debugLineNum = 21233767;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=21233769;
 //BA.debugLineNum = 21233769;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xclvdetalle_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="frm_post_01_formulario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "xclvdetalle_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "xclvdetalle_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub XclvDetalle_ItemClick (Index As Int, V";
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_index);
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="Dim LblCodigo As Label = p.GetView(0)";
_lblcodigo = new anywheresoftware.b4a.objects.LabelWrapper();
_lblcodigo = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="Dim LblDescripcion As Label = p.GetView(1)";
_lbldescripcion = new anywheresoftware.b4a.objects.LabelWrapper();
_lbldescripcion = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=22151175;
 //BA.debugLineNum = 22151175;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="Dim Prct As Boolean = Funciones.Cbool(LblItem.Tag";
_prct = parent.mostCurrent._funciones._cbool /*boolean*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_lblitem.getTag())));
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="Dim Tict As String = LblDescripcion.Tag";
_tict = BA.ObjectToString(_lbldescripcion.getTag());
RDebugUtils.currentLine=22151180;
 //BA.debugLineNum = 22151180;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png");
RDebugUtils.currentLine=22151182;
 //BA.debugLineNum = 22151182;BA.debugLine="Dim Editar As String = \"Editar\"";
_editar = "Editar";
RDebugUtils.currentLine=22151184;
 //BA.debugLineNum = 22151184;BA.debugLine="If Prct Then";
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
RDebugUtils.currentLine=22151185;
 //BA.debugLineNum = 22151185;BA.debugLine="Editar = \"\"";
_editar = "";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=22151187;
 //BA.debugLineNum = 22151187;BA.debugLine="If	Hay_Descuentos_Globales Then";
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
RDebugUtils.currentLine=22151188;
 //BA.debugLineNum = 22151188;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
parent.mostCurrent._bmp1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=22151189;
 //BA.debugLineNum = 22151189;BA.debugLine="Msgbox2Async(\"EXISTEN DESCUENTOS GLOBALES\" & CR";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("EXISTEN DESCUENTOS GLOBALES"+anywheresoftware.b4a.keywords.Common.CRLF+"NO PUEDE HACER GESTION EN ESTA FILA"+anywheresoftware.b4a.keywords.Common.CRLF+"DEBE ELIMINAR EL DESCUENTO GLOBAL PARA PODER HACER LA GESTION"),BA.ObjectToCharSequence("Doc. VISADO"),"Ok","","",parent.mostCurrent._bmp1,processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22151192;
 //BA.debugLineNum = 22151192;BA.debugLine="Return";
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
RDebugUtils.currentLine=22151196;
 //BA.debugLineNum = 22151196;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(LblDescripcio";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence(_lbldescripcion.getText()),BA.ObjectToCharSequence("Código: "+_lblcodigo.getText()),_editar,"Cancelar","Eliminar",parent.mostCurrent._bmp1);
RDebugUtils.currentLine=22151197;
 //BA.debugLineNum = 22151197;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 11;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22151199;
 //BA.debugLineNum = 22151199;BA.debugLine="Id_DocDet = LblCodigo.Tag";
parent._id_docdet = (int)(BA.ObjectToNumber(_lblcodigo.getTag()));
RDebugUtils.currentLine=22151201;
 //BA.debugLineNum = 22151201;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=22151203;
 //BA.debugLineNum = 22151203;BA.debugLine="Sb_GrabarObservacionesDespachos";
_sb_grabarobservacionesdespachos();
RDebugUtils.currentLine=22151204;
 //BA.debugLineNum = 22151204;BA.debugLine="EditandoProducto = True";
parent._editandoproducto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22151205;
 //BA.debugLineNum = 22151205;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = Id_DocDet";
parent.mostCurrent._frm_post_01_producto._id_docdet /*int*/  = parent._id_docdet;
RDebugUtils.currentLine=22151206;
 //BA.debugLineNum = 22151206;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._frm_post_01_producto.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=22151210;
 //BA.debugLineNum = 22151210;BA.debugLine="If Result = xui.DialogResponse_Negative Then";

case 14:
//if
this.state = 39;
if (_result==_xui.DialogResponse_Negative) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=22151212;
 //BA.debugLineNum = 22151212;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma l";
_sf = _xui.Msgbox2Async(processBA,BA.ObjectToCharSequence("¿Confirma la eliminación de este articulo?"),BA.ObjectToCharSequence("Código: "+_lblcodigo.getText()),"SI","","NO",parent.mostCurrent._bmp1);
RDebugUtils.currentLine=22151213;
 //BA.debugLineNum = 22151213;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"), _sf);
this.state = 41;
return;
case 41:
//C
this.state = 17;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=22151215;
 //BA.debugLineNum = 22151215;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=22151217;
 //BA.debugLineNum = 22151217;BA.debugLine="Dim Fila_Id As Map";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22151218;
 //BA.debugLineNum = 22151218;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=22151219;
 //BA.debugLineNum = 22151219;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Con";
_fila_id = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=22151220;
 //BA.debugLineNum = 22151220;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_fila_id);
RDebugUtils.currentLine=22151222;
 //BA.debugLineNum = 22151222;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
parent.mostCurrent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(parent._id_docdet);
RDebugUtils.currentLine=22151223;
 //BA.debugLineNum = 22151223;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Vari";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent.mostCurrent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent.mostCurrent._consulta_sql,(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=22151225;
 //BA.debugLineNum = 22151225;BA.debugLine="If Fila_Dscto.IsInitialized Then";
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
RDebugUtils.currentLine=22151226;
 //BA.debugLineNum = 22151226;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuento";
parent.mostCurrent._dbutils._deleterecord /*String*/ (mostCurrent.activityBA,parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=22151230;
 //BA.debugLineNum = 22151230;BA.debugLine="p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p";
_p.SetLayoutAnimated((int) (500),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300))),_p.getTop(),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=22151231;
 //BA.debugLineNum = 22151231;BA.debugLine="Sleep(600)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frm_post_01_formulario", "xclvdetalle_itemlongclick"),(int) (600));
this.state = 42;
return;
case 42:
//C
this.state = 24;
;
RDebugUtils.currentLine=22151232;
 //BA.debugLineNum = 22151232;BA.debugLine="XclvDetalle.RemoveAt(Index)";
parent.mostCurrent._xclvdetalle._removeat(_index);
RDebugUtils.currentLine=22151234;
 //BA.debugLineNum = 22151234;BA.debugLine="Private Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=22151235;
 //BA.debugLineNum = 22151235;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_D";
_cursor1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("Select Id_DocDet,Codigo,Descripcion,Cantidad,Precio,DescuentoPorc,ValNetoLinea "+"From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc))));
RDebugUtils.currentLine=22151238;
 //BA.debugLineNum = 22151238;BA.debugLine="If Cursor1.RowCount > 0 Then";
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
RDebugUtils.currentLine=22151240;
 //BA.debugLineNum = 22151240;BA.debugLine="Dim	RowNumber = Cursor1.RowCount";
_rownumber = BA.NumberToString(_cursor1.getRowCount());
RDebugUtils.currentLine=22151242;
 //BA.debugLineNum = 22151242;BA.debugLine="For i = 0 To RowNumber-1";
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
RDebugUtils.currentLine=22151244;
 //BA.debugLineNum = 22151244;BA.debugLine="Try";
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
RDebugUtils.currentLine=22151245;
 //BA.debugLineNum = 22151245;BA.debugLine="Item = XclvDetalle.GetRawListItem(i)";
_item = parent.mostCurrent._xclvdetalle._getrawlistitem(_i);
RDebugUtils.currentLine=22151246;
 //BA.debugLineNum = 22151246;BA.debugLine="p = Item.Panel.GetView(0)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_item.Panel.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=22151247;
 //BA.debugLineNum = 22151247;BA.debugLine="Dim LblItem As Label = p.GetView(3)";
_lblitem = new anywheresoftware.b4a.objects.LabelWrapper();
_lblitem = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=22151248;
 //BA.debugLineNum = 22151248;BA.debugLine="Dim ItemStr As String = Funciones.Rellenar_I";
_itemstr = parent.mostCurrent._funciones._rellenar_izquierda /*String*/ (mostCurrent.activityBA,BA.NumberToString(_i+1),(int) (2),"0");
RDebugUtils.currentLine=22151249;
 //BA.debugLineNum = 22151249;BA.debugLine="LblItem.Text = \"Item: \" & ItemStr";
_lblitem.setText(BA.ObjectToCharSequence("Item: "+_itemstr));
 if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
RDebugUtils.currentLine=22151251;
 //BA.debugLineNum = 22151251;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("222151251",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
RDebugUtils.currentLine=22151258;
 //BA.debugLineNum = 22151258;BA.debugLine="Sb_Sumar_Totales";
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
RDebugUtils.currentLine=22151266;
 //BA.debugLineNum = 22151266;BA.debugLine="End Sub";
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