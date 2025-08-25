package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class conectar_conf extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "BaKapp.Movil.Tag.conectar_conf");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.conectar_conf.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _consulta_sql = "";
public String _verror = "";
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public String _estado = "";
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
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(BaKapp.Movil.Tag.conectar_conf __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_datos_de_configuracion(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "sb_cargar_datos_de_configuracion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_cargar_datos_de_configuracion", null));}
ResumableSub_Sb_Cargar_Datos_De_Configuracion rsub = new ResumableSub_Sb_Cargar_Datos_De_Configuracion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Cargar_Datos_De_Configuracion extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Datos_De_Configuracion(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
int _result = 0;
boolean _usar_datos_x_defecto = false;
String _empresa_x_defecto = "";
String _usuario_x_defecto = "";
String _modalidad_x_defecto = "";
boolean _resulttmp = false;
BaKapp.Movil.Tag.clfunciones _clfx = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Wait For(Fx_Traer_Nombre_Base_De_Datos) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_traer_nombre_base_de_datos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="Msgbox2Async(\"Falta la configuración de la Base";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración de la Base de datos Bakapp en TABCARAC"),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.True);
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_configuracion_estacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 34;
return;
case 34:
//C
this.state = 5;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="If Result = 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="Msgbox2Async(\"El dispositivo no esta registrado";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El dispositivo no esta registrado en la base de datos"+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 35;
return;
case 35:
//C
this.state = 8;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="Log(\"3.- Iniciamos la sesion\")";
parent.__c.LogImpl("25308440","3.- Iniciamos la sesion",0);
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="Variables.Global_Sesion_Star = True";
parent._variables._global_sesion_star /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=5308444;
 //BA.debugLineNum = 5308444;BA.debugLine="Dim Usar_Datos_X_Defecto As Boolean = Variables.G";
_usar_datos_x_defecto = BA.ObjectToBoolean(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Usar_Datos_X_Defecto")));
RDebugUtils.currentLine=5308445;
 //BA.debugLineNum = 5308445;BA.debugLine="Dim Empresa_X_Defecto As String = Variables.Globa";
_empresa_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Empresa_X_Defecto")));
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="Dim Usuario_X_Defecto As String = Funciones.LTrim";
_usuario_x_defecto = parent._funciones._ltrim /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Usuario_X_Defecto"))));
RDebugUtils.currentLine=5308447;
 //BA.debugLineNum = 5308447;BA.debugLine="Dim Modalidad_X_Defecto As String= Variables.Glob";
_modalidad_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Modalidad_X_Defecto")));
RDebugUtils.currentLine=5308449;
 //BA.debugLineNum = 5308449;BA.debugLine="If Usuario_X_Defecto = \"\" Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_usuario_x_defecto).equals("")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=5308450;
 //BA.debugLineNum = 5308450;BA.debugLine="Msgbox2Async(\"Falta el usuario por defecto\"  & C";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Falta el usuario por defecto"+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5308452;
 //BA.debugLineNum = 5308452;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 36;
return;
case 36:
//C
this.state = 12;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308453;
 //BA.debugLineNum = 5308453;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=5308457;
 //BA.debugLineNum = 5308457;BA.debugLine="Wait For(Fx_Traer_Usuario_Por_Defecto(Usuario_X_D";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_traer_usuario_por_defecto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_usuario_x_defecto));
this.state = 37;
return;
case 37:
//C
this.state = 13;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308459;
 //BA.debugLineNum = 5308459;BA.debugLine="If Result = 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_result==0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=5308460;
 //BA.debugLineNum = 5308460;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=5308461;
 //BA.debugLineNum = 5308461;BA.debugLine="Msgbox2Async(\"El usuario no existe.\"  & CRLF & _";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El usuario no existe."+parent.__c.CRLF+"Usuario: "+_usuario_x_defecto),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5308463;
 //BA.debugLineNum = 5308463;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 38;
return;
case 38:
//C
this.state = 16;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308464;
 //BA.debugLineNum = 5308464;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=5308468;
 //BA.debugLineNum = 5308468;BA.debugLine="Wait For(Fx_Cargar_Listas_Precios_Por_Usuario(Usu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_listas_precios_por_usuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_usuario_x_defecto));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308470;
 //BA.debugLineNum = 5308470;BA.debugLine="If Result = 0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_result==0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=5308471;
 //BA.debugLineNum = 5308471;BA.debugLine="Msgbox2Async(\"El usuario no posee permisos para";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El usuario no posee permisos para ninguna lista de precios en Random."+parent.__c.CRLF+"Usuario: "+_usuario_x_defecto),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5308473;
 //BA.debugLineNum = 5308473;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 40;
return;
case 40:
//C
this.state = 20;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308474;
 //BA.debugLineNum = 5308474;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=5308478;
 //BA.debugLineNum = 5308478;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion_Y_Gener";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_configuracion_estacion_y_general /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_empresa_x_defecto,_modalidad_x_defecto));
this.state = 41;
return;
case 41:
//C
this.state = 21;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308480;
 //BA.debugLineNum = 5308480;BA.debugLine="If Result = 0 Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_result==0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=5308481;
 //BA.debugLineNum = 5308481;BA.debugLine="Msgbox2Async(\"No se reconoce la modalidad para e";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la modalidad para el dispositivo. Modalidad:"+_modalidad_x_defecto+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5308483;
 //BA.debugLineNum = 5308483;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 42;
return;
case 42:
//C
this.state = 24;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308484;
 //BA.debugLineNum = 5308484;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=5308489;
 //BA.debugLineNum = 5308489;BA.debugLine="Wait For(Sb_Cargar_Modedas) Complete (Result As I";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._sb_cargar_modedas /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 43;
return;
case 43:
//C
this.state = 25;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308491;
 //BA.debugLineNum = 5308491;BA.debugLine="If Result = 0 Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_result==0) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=5308495;
 //BA.debugLineNum = 5308495;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=5308499;
 //BA.debugLineNum = 5308499;BA.debugLine="Wait For(Sb_Revisar_Carptea_Tmp_Servidor) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._sb_revisar_carptea_tmp_servidor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_resulttmp = (Boolean) result[1];
;
RDebugUtils.currentLine=5308501;
 //BA.debugLineNum = 5308501;BA.debugLine="If Not(ResultTmp) Then";
if (true) break;

case 29:
//if
this.state = 32;
if (parent.__c.Not(_resulttmp)) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=5308502;
 //BA.debugLineNum = 5308502;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=5308503;
 //BA.debugLineNum = 5308503;BA.debugLine="Msgbox2Async(vError, \"Validación\", \"Ok\", \"\", \"\",";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._verror /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5308504;
 //BA.debugLineNum = 5308504;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 45;
return;
case 45:
//C
this.state = 32;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308505;
 //BA.debugLineNum = 5308505;BA.debugLine="Return 2";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(2));return;};
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=5308508;
 //BA.debugLineNum = 5308508;BA.debugLine="Dim CLFx As ClFunciones";
_clfx = new BaKapp.Movil.Tag.clfunciones();
RDebugUtils.currentLine=5308509;
 //BA.debugLineNum = 5308509;BA.debugLine="CLFx.Initialize";
_clfx._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5308511;
 //BA.debugLineNum = 5308511;BA.debugLine="Wait For(CLFx.Sb_ExisteTabla(\"@WMS_GATEWAY_STOCK\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), _clfx._sb_existetabla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"@WMS_GATEWAY_STOCK"));
this.state = 46;
return;
case 46:
//C
this.state = -1;
_resulttmp = (Boolean) result[1];
;
RDebugUtils.currentLine=5308512;
 //BA.debugLineNum = 5308512;BA.debugLine="Variables.Global_ExisteTabla_MS_GATEWAY_STOCK = R";
parent._variables._global_existetabla_ms_gateway_stock /*boolean*/  = _resulttmp;
RDebugUtils.currentLine=5308515;
 //BA.debugLineNum = 5308515;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_DocDestino)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_sis_despachosimple_docdestino /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 47;
return;
case 47:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308516;
 //BA.debugLineNum = 5308516;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_Tipo) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_sis_despachosimple_tipo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308517;
 //BA.debugLineNum = 5308517;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_TipoPago) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_sis_despachosimple_tipopago /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 49;
return;
case 49:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5308519;
 //BA.debugLineNum = 5308519;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
RDebugUtils.currentLine=5308521;
 //BA.debugLineNum = 5308521;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="conectar_conf";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim vError As String";
_verror = "";
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="Public Estado As String";
_estado = "";
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_configuracion_estacion(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_cargar_configuracion_estacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_cargar_configuracion_estacion", null));}
ResumableSub_Fx_Cargar_Configuracion_Estacion rsub = new ResumableSub_Fx_Cargar_Configuracion_Estacion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Configuracion_Estacion extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Configuracion_Estacion(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_EstacionesBkp Where NombreEquipo = '"+parent._variables._global_iddispositivo /*String*/ +"' And TipoEstacion = 'B4A'";
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_configuracion_estacion"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="Log(\"2.- Una vez que ya tenemos el nombre carga";
parent.__c.LogImpl("25046288","2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp",0);
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="Variables.Global_Row_EstacionBk = Funciones.Fx_";
parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="Log(\"Configuracion_Estacion_Cargada\")";
parent.__c.LogImpl("25046290","Configuracion_Estacion_Cargada",0);
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5046299;
 //BA.debugLineNum = 5046299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_configuracion_estacion_y_general(BaKapp.Movil.Tag.conectar_conf __ref,String _empresa,String _modalidad) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_cargar_configuracion_estacion_y_general", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_cargar_configuracion_estacion_y_general", new Object[] {_empresa,_modalidad}));}
ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General rsub = new ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General(this,__ref,_empresa,_modalidad);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref,String _empresa,String _modalidad) {
this.parent = parent;
this.__ref = __ref;
this._empresa = _empresa;
this._modalidad = _modalidad;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
String _empresa;
String _modalidad;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Consulta_Sql = \"Select Top 1 *,Getdate() As Fecha";
__ref._consulta_sql /*String*/  = "Select Top 1 *,Getdate() As Fecha_Servidor From CONFIEST"+parent.__c.CRLF+"Inner Join "+parent._variables._global_basebk /*String*/ +"Zw_Configuracion On Empresa = EMPRESA And Modalidad = '"+_modalidad+"'"+parent.__c.CRLF+"Where EMPRESA = '"+_empresa+"' And MODALIDAD = '"+_modalidad+"'";
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_configuracion_estacion_y_general"), (Object)(_js));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 24;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 21;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="Log(\"6.- Cargamos la configuración por Estación";
parent.__c.LogImpl("25242899","6.- Cargamos la configuración por Estación CONFIEST",0);
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = F";
parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5242903;
 //BA.debugLineNum = 5242903;BA.debugLine="Variables.Gl_Modalidad = Modalidad";
parent._variables._gl_modalidad /*String*/  = _modalidad;
RDebugUtils.currentLine=5242904;
 //BA.debugLineNum = 5242904;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Con";
parent._variables._gl_empresa /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
RDebugUtils.currentLine=5242905;
 //BA.debugLineNum = 5242905;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Co";
parent._variables._gl_sucursal /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Conf";
parent._variables._gl_bodega /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
RDebugUtils.currentLine=5242907;
 //BA.debugLineNum = 5242907;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Config";
parent._variables._gl_caja /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ECAJA")));
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid(Var";
parent._variables._gl_lista_precios /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTAVEN"))),(int) (6),(int) (3));
RDebugUtils.currentLine=5242909;
 //BA.debugLineNum = 5242909;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(Varia";
parent._variables._gl_lista_costos /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTACOM"))),(int) (6),(int) (3));
RDebugUtils.currentLine=5242910;
 //BA.debugLineNum = 5242910;BA.debugLine="Variables.Gl_Fecha_Servidor = Funciones.Mid(Var";
parent._variables._gl_fecha_servidor /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Fecha_Servidor"))),(int) (1),(int) (10));
RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="Consulta_Sql = \"Select\" & CRLF & _ 						    \"E";
__ref._consulta_sql /*String*/  = "Select"+parent.__c.CRLF+"Empresa,Pr_AutoPr_Crear_Codigo_Principal_Automatico, Pr_AutoPr_Correlativo_Por_Iniciales, Pr_AutoPr_Correlativo_General,"+parent.__c.CRLF+"Pr_AutoPr_Tablas_Para_Iniciales_Cod_Automatico, Pr_AutoPr_Max_Cant_Caracteres_Del_Codigo, Pr_AutoPr_Ultimo_Codigo_Creado_Correlativo_General,"+parent.__c.CRLF+"Pr_Desc_Producto_Solo_Mayusculas, Pr_Creacion_Exigir_Precio, Pr_Creacion_Exigir_Clasificacion_busqueda, Pr_Creacion_Exigir_Codigo_Alternativo,"+parent.__c.CRLF+"Tbl_Ranking, Revisa_Taza_Cambio, Revisar_Taza_Solo_Mon_Extranjeras, Vnta_Dias_Venci_Coti, Vnta_TipoValor_Bruto_Neto, Vnta_EntidadXdefecto,"+parent.__c.CRLF+"Vnta_SucEntXdefecto, Vnta_Producto_NoCreado, Vnta_Preguntar_Documento, SOC_CodTurno, SOC_Buscar_Producto, SOC_Aprueba_Solo_G1,"+parent.__c.CRLF+"SOC_Aprueba_G1_y_G2, SOC_Prod_Crea_Solo_Marcas_Proveedor, SOC_Prod_Crea_Max_Carac_Nom, SOC_Valor_1ra_Aprobacion, SOC_Dias_Apela,"+parent.__c.CRLF+"SOC_Tipo_Creacion_Producto_Normal_Matriz, Precio_Costos_Desde, Precios_Venta_Desde_Random, Precios_Venta_Desde_BakApp,"+parent.__c.CRLF+"Vnta_Redondear_Dscto_Cero, Nodo_Raiz_Asociados, Vnta_Ofrecer_Otras_Bod_Stock_Insuficiente, Conservar_Responzable_Doc_Relacionado,"+parent.__c.CRLF+"Preguntar_Si_Cambia_Responsable_Doc_Relacionado, ServTecnico_Empresa, ServTecnico_Sucursal, ServTecnico_Bodega"+parent.__c.CRLF+"From "+parent._variables._global_basebk /*String*/ +"Zw_Configuracion"+parent.__c.CRLF+"Where Modalidad_General = 1";
RDebugUtils.currentLine=5242927;
 //BA.debugLineNum = 5242927;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5242929;
 //BA.debugLineNum = 5242929;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_configuracion_estacion_y_general"), (Object)(_js));
this.state = 26;
return;
case 26:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5242931;
 //BA.debugLineNum = 5242931;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5242933;
 //BA.debugLineNum = 5242933;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5242935;
 //BA.debugLineNum = 5242935;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=5242937;
 //BA.debugLineNum = 5242937;BA.debugLine="Log(\"7.- Cargamos la configuración General\")";
parent.__c.LogImpl("25242937","7.- Cargamos la configuración General",0);
RDebugUtils.currentLine=5242938;
 //BA.debugLineNum = 5242938;BA.debugLine="Log(\"Fecha servidor: \" & Variables.Gl_Fecha_S";
parent.__c.LogImpl("25242938","Fecha servidor: "+parent._variables._gl_fecha_servidor /*String*/ ,0);
RDebugUtils.currentLine=5242940;
 //BA.debugLineNum = 5242940;BA.debugLine="Variables.Global_Row_Configuracion_General =";
parent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5242941;
 //BA.debugLineNum = 5242941;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=5242944;
 //BA.debugLineNum = 5242944;BA.debugLine="Variables.Global_Row_Configuracion_General =";
parent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=5242948;
 //BA.debugLineNum = 5242948;BA.debugLine="Log(\"Error al cargar Configuracion General\")";
parent.__c.LogImpl("25242948","Error al cargar Configuracion General",0);
RDebugUtils.currentLine=5242949;
 //BA.debugLineNum = 5242949;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("25242949",_js._errormessage /*String*/ ,0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=5242953;
 //BA.debugLineNum = 5242953;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = N";
parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=5242957;
 //BA.debugLineNum = 5242957;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("25242957",_js._errormessage /*String*/ ,0);
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=5242960;
 //BA.debugLineNum = 5242960;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5242962;
 //BA.debugLineNum = 5242962;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_listas_precios_por_usuario(BaKapp.Movil.Tag.conectar_conf __ref,String _usuario_x_defecto) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_cargar_listas_precios_por_usuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_cargar_listas_precios_por_usuario", new Object[] {_usuario_x_defecto}));}
ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario rsub = new ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario(this,__ref,_usuario_x_defecto);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref,String _usuario_x_defecto) {
this.parent = parent;
this.__ref = __ref;
this._usuario_x_defecto = _usuario_x_defecto;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
String _usuario_x_defecto;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Consulta_Sql = \"Select KOLT As Kolt,KOLT+'-'+NOKO";
__ref._consulta_sql /*String*/  = "Select KOLT As Kolt,KOLT+'-'+NOKOLT As Nokolt From TABPP"+parent.__c.CRLF+"Where KOLT In (Select SUBSTRING(KOOP,4,3)"+parent.__c.CRLF+"From MAEUS Where KOUS = '"+_usuario_x_defecto+"' And KOOP LIKE 'LI-%') And TILT = 'P'"+parent.__c.CRLF+"Order By Nokolt";
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_listas_precios_por_usuario"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="Log(\"5.- Traemos la lista de precios asociadas";
parent.__c.LogImpl("25177363","5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar",0);
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Variables.Global_Listas_Precios_Usuario = Funci";
parent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_sis_despachosimple_docdestino(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_cargar_sis_despachosimple_docdestino", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_cargar_sis_despachosimple_docdestino", null));}
ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_DOCDESTINO'";
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_docdestino"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="Log(\"Traemos la lista de tipos de documentos pa";
parent.__c.LogImpl("25505040","Traemos la lista de tipos de documentos para despacho simple",0);
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="Variables.Global_Sis_DespachoSimple_DocDestino";
parent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_sis_despachosimple_tipo(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_cargar_sis_despachosimple_tipo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_cargar_sis_despachosimple_tipo", null));}
ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPO'";
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_tipo"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5570576;
 //BA.debugLineNum = 5570576;BA.debugLine="Log(\"Traemos la lista de tipos de despacho o re";
parent.__c.LogImpl("25570576","Traemos la lista de tipos de despacho o retiro",0);
RDebugUtils.currentLine=5570577;
 //BA.debugLineNum = 5570577;BA.debugLine="Variables.Global_Sis_DespachoSimple_Tipo = Func";
parent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=5570578;
 //BA.debugLineNum = 5570578;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=5570584;
 //BA.debugLineNum = 5570584;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5570586;
 //BA.debugLineNum = 5570586;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_cargar_sis_despachosimple_tipopago(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_cargar_sis_despachosimple_tipopago", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_cargar_sis_despachosimple_tipopago", null));}
ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPOPAGO'";
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_tipopago"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="Log(\"Traemos la lista de tipos de pago\")";
parent.__c.LogImpl("25636112","Traemos la lista de tipos de pago",0);
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="Variables.Global_Sis_DespachoSimple_TipoPago =";
parent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=5636114;
 //BA.debugLineNum = 5636114;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=5636120;
 //BA.debugLineNum = 5636120;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5636122;
 //BA.debugLineNum = 5636122;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_traer_nombre_base_de_datos(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_traer_nombre_base_de_datos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_traer_nombre_base_de_datos", null));}
ResumableSub_Fx_Traer_Nombre_Base_De_Datos rsub = new ResumableSub_Fx_Traer_Nombre_Base_De_Datos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Traer_Nombre_Base_De_Datos extends BA.ResumableSub {
public ResumableSub_Fx_Traer_Nombre_Base_De_Datos(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.Map _fila = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo.'";
__ref._consulta_sql /*String*/  = "Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'";
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_traer_nombre_base_de_datos"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="Log(\"1.- Obtenemos primero el nombre de la base";
parent.__c.LogImpl("24980753","1.- Obtenemos primero el nombre de la base de datos de Bakapp",0);
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=4980755;
 //BA.debugLineNum = 4980755;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Base";
parent._variables._global_basebk /*String*/  = BA.ObjectToString(_fila.Get((Object)("Global_BaseBk")));
RDebugUtils.currentLine=4980756;
 //BA.debugLineNum = 4980756;BA.debugLine="Log(\"DB BakApp: \" & Variables.Global_BaseBk)";
parent.__c.LogImpl("24980756","DB BakApp: "+parent._variables._global_basebk /*String*/ ,0);
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=4980762;
 //BA.debugLineNum = 4980762;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=4980764;
 //BA.debugLineNum = 4980764;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fx_traer_usuario_por_defecto(BaKapp.Movil.Tag.conectar_conf __ref,String _usuario_x_defecto) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "fx_traer_usuario_por_defecto", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fx_traer_usuario_por_defecto", new Object[] {_usuario_x_defecto}));}
ResumableSub_Fx_Traer_Usuario_Por_Defecto rsub = new ResumableSub_Fx_Traer_Usuario_Por_Defecto(this,__ref,_usuario_x_defecto);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Fx_Traer_Usuario_Por_Defecto extends BA.ResumableSub {
public ResumableSub_Fx_Traer_Usuario_Por_Defecto(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref,String _usuario_x_defecto) {
this.parent = parent;
this.__ref = __ref;
this._usuario_x_defecto = _usuario_x_defecto;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
String _usuario_x_defecto;
int _resultado = 0;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where K";
__ref._consulta_sql /*String*/  = "Select Top 1 * From TABFU Where KOFU = '"+_usuario_x_defecto+"'";
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_traer_usuario_por_defecto"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="Log(\"4.- Cargamos al usuario por defecto y lo t";
parent.__c.LogImpl("25111826","4.- Cargamos al usuario por defecto y lo traemos",0);
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5111828;
 //BA.debugLineNum = 5111828;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
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
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=5111837;
 //BA.debugLineNum = 5111837;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_cargar_modedas(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "sb_cargar_modedas", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_cargar_modedas", null));}
ResumableSub_Sb_Cargar_Modedas rsub = new ResumableSub_Sb_Cargar_Modedas(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Cargar_Modedas extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Modedas(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim Consulta_Sql As String";
parent._consulta_sql = "";
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Consulta_Sql = \"Select TOP 1 * From TABMO Where K";
__ref._consulta_sql /*String*/  = "Select TOP 1 * From TABMO Where KOMO = '$'";
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="Variables.Global_Row_Moneda = Funciones.Fx_Data";
parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="Consulta_Sql = $\"Select TOP 1 * From MAEMO Wher";
__ref._consulta_sql /*String*/  = ("Select TOP 1 * From MAEMO Where KOMO = 'US$' AND CAST(FEMO AS DATE) = CAST(GETDATE() AS DATE)Order by IDMAEMO DESC");
RDebugUtils.currentLine=5373973;
 //BA.debugLineNum = 5373973;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5373974;
 //BA.debugLineNum = 5373974;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), (Object)(_js));
this.state = 22;
return;
case 22:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5373978;
 //BA.debugLineNum = 5373978;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5373980;
 //BA.debugLineNum = 5373980;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=5373982;
 //BA.debugLineNum = 5373982;BA.debugLine="Variables.Global_Row_Dolar = Funciones.Fx_Dat";
parent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5373984;
 //BA.debugLineNum = 5373984;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=5373992;
 //BA.debugLineNum = 5373992;BA.debugLine="Dim bmp1 As Bitmap";
parent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5373994;
 //BA.debugLineNum = 5373994;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=5373996;
 //BA.debugLineNum = 5373996;BA.debugLine="Msgbox2Async(\"No existe tasa de cambio del dol";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("No existe tasa de cambio del dolar del hoy"),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5373997;
 //BA.debugLineNum = 5373997;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), null);
this.state = 23;
return;
case 23:
//C
this.state = 16;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5373998;
 //BA.debugLineNum = 5373998;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("25373998",_js._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=5374008;
 //BA.debugLineNum = 5374008;BA.debugLine="Dim bmp1 As Bitmap";
parent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5374010;
 //BA.debugLineNum = 5374010;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=5374012;
 //BA.debugLineNum = 5374012;BA.debugLine="Msgbox2Async(\"Error al buscar la moneda $\", \"Val";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar la moneda $"),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=5374013;
 //BA.debugLineNum = 5374013;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), null);
this.state = 24;
return;
case 24:
//C
this.state = 20;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=5374014;
 //BA.debugLineNum = 5374014;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("25374014",_js._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=5374018;
 //BA.debugLineNum = 5374018;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
RDebugUtils.currentLine=5374020;
 //BA.debugLineNum = 5374020;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_revisar_carptea_tmp_servidor(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "sb_revisar_carptea_tmp_servidor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_revisar_carptea_tmp_servidor", null));}
ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor rsub = new ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
boolean _existeruta = false;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim ExisteRuta As Boolean";
_existeruta = false;
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="vError = \"\"";
__ref._verror /*String*/  = "";
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent._funciones._fx_httjob_ws_sb_revcarpetatmp /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_revisar_carptea_tmp_servidor"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="ExisteRuta = Fila.Get(\"ExisteRuta\")";
_existeruta = BA.ObjectToBoolean(_fila.Get((Object)("ExisteRuta")));
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="vError = Fila.Get(\"Error\")";
__ref._verror /*String*/  = BA.ObjectToString(_fila.Get((Object)("Error")));
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
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="Return ExisteRuta";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_existeruta));return;};
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _sb_probar_conexion(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "sb_probar_conexion", false))
	 {Debug.delegate(ba, "sb_probar_conexion", null); return;}
ResumableSub_Sb_Probar_Conexion rsub = new ResumableSub_Sb_Probar_Conexion(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Sb_Probar_Conexion extends BA.ResumableSub {
public ResumableSub_Sb_Probar_Conexion(BaKapp.Movil.Tag.conectar_conf parent,BaKapp.Movil.Tag.conectar_conf __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.conectar_conf __ref;
BaKapp.Movil.Tag.conectar_conf parent;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="conectar_conf";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIES";
__ref._consulta_sql /*String*/  = "Select Top 1 EMPRESA From CONFIES";
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_probar_conexion"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="Estado = \"Conectado\"";
__ref._estado /*String*/  = "Conectado";
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="Estado = \"Desconectado\"";
__ref._estado /*String*/  = "Desconectado";
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}