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
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(BaKapp.Movil.Tag.conectar_conf __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="conectar_conf";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ok_button.png");
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Wait For(Fx_Traer_Nombre_Base_De_Datos) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_traer_nombre_base_de_datos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="Msgbox2Async(\"Falta la configuración de la Base";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Falta la configuración de la Base de datos Bakapp en TABCARAC"),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.True);
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_configuracion_estacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 34;
return;
case 34:
//C
this.state = 5;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405584;
 //BA.debugLineNum = 7405584;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="Msgbox2Async(\"El dispositivo no esta registrado";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El dispositivo no esta registrado en la base de datos"+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 35;
return;
case 35:
//C
this.state = 8;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=7405592;
 //BA.debugLineNum = 7405592;BA.debugLine="Log(\"3.- Iniciamos la sesion\")";
parent.__c.LogImpl("67405592","3.- Iniciamos la sesion",0);
RDebugUtils.currentLine=7405594;
 //BA.debugLineNum = 7405594;BA.debugLine="Variables.Global_Sesion_Star = True";
parent._variables._global_sesion_star /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7405596;
 //BA.debugLineNum = 7405596;BA.debugLine="Dim Usar_Datos_X_Defecto As Boolean = Variables.G";
_usar_datos_x_defecto = BA.ObjectToBoolean(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Usar_Datos_X_Defecto")));
RDebugUtils.currentLine=7405597;
 //BA.debugLineNum = 7405597;BA.debugLine="Dim Empresa_X_Defecto As String = Variables.Globa";
_empresa_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Empresa_X_Defecto")));
RDebugUtils.currentLine=7405598;
 //BA.debugLineNum = 7405598;BA.debugLine="Dim Usuario_X_Defecto As String = Funciones.LTrim";
_usuario_x_defecto = parent._funciones._ltrim /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Usuario_X_Defecto"))));
RDebugUtils.currentLine=7405599;
 //BA.debugLineNum = 7405599;BA.debugLine="Dim Modalidad_X_Defecto As String= Variables.Glob";
_modalidad_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Modalidad_X_Defecto")));
RDebugUtils.currentLine=7405601;
 //BA.debugLineNum = 7405601;BA.debugLine="If Usuario_X_Defecto = \"\" Then";
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
RDebugUtils.currentLine=7405602;
 //BA.debugLineNum = 7405602;BA.debugLine="Msgbox2Async(\"Falta el usuario por defecto\"  & C";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Falta el usuario por defecto"+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7405604;
 //BA.debugLineNum = 7405604;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 36;
return;
case 36:
//C
this.state = 12;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405605;
 //BA.debugLineNum = 7405605;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=7405609;
 //BA.debugLineNum = 7405609;BA.debugLine="Wait For(Fx_Traer_Usuario_Por_Defecto(Usuario_X_D";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_traer_usuario_por_defecto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_usuario_x_defecto));
this.state = 37;
return;
case 37:
//C
this.state = 13;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405611;
 //BA.debugLineNum = 7405611;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=7405612;
 //BA.debugLineNum = 7405612;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=7405613;
 //BA.debugLineNum = 7405613;BA.debugLine="Msgbox2Async(\"El usuario no existe.\"  & CRLF & _";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El usuario no existe."+parent.__c.CRLF+"Usuario: "+_usuario_x_defecto),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7405615;
 //BA.debugLineNum = 7405615;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 38;
return;
case 38:
//C
this.state = 16;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405616;
 //BA.debugLineNum = 7405616;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=7405620;
 //BA.debugLineNum = 7405620;BA.debugLine="Wait For(Fx_Cargar_Listas_Precios_Por_Usuario(Usu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_listas_precios_por_usuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_usuario_x_defecto));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405622;
 //BA.debugLineNum = 7405622;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=7405623;
 //BA.debugLineNum = 7405623;BA.debugLine="Msgbox2Async(\"El usuario no posee permisos para";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("El usuario no posee permisos para ninguna lista de precios en Random."+parent.__c.CRLF+"Usuario: "+_usuario_x_defecto),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7405625;
 //BA.debugLineNum = 7405625;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 40;
return;
case 40:
//C
this.state = 20;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405626;
 //BA.debugLineNum = 7405626;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=7405630;
 //BA.debugLineNum = 7405630;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion_Y_Gener";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_configuracion_estacion_y_general /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_empresa_x_defecto,_modalidad_x_defecto));
this.state = 41;
return;
case 41:
//C
this.state = 21;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405632;
 //BA.debugLineNum = 7405632;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=7405633;
 //BA.debugLineNum = 7405633;BA.debugLine="Msgbox2Async(\"No se reconoce la modalidad para e";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("No se reconoce la modalidad para el dispositivo. Modalidad:"+_modalidad_x_defecto+parent.__c.CRLF+"Id del dispositivo: "+parent._variables._global_iddispositivo /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7405635;
 //BA.debugLineNum = 7405635;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 42;
return;
case 42:
//C
this.state = 24;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405636;
 //BA.debugLineNum = 7405636;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=7405641;
 //BA.debugLineNum = 7405641;BA.debugLine="Wait For(Sb_Cargar_Modedas) Complete (Result As I";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._sb_cargar_modedas /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 43;
return;
case 43:
//C
this.state = 25;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405643;
 //BA.debugLineNum = 7405643;BA.debugLine="If Result = 0 Then";
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
RDebugUtils.currentLine=7405647;
 //BA.debugLineNum = 7405647;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=7405651;
 //BA.debugLineNum = 7405651;BA.debugLine="Wait For(Sb_Revisar_Carptea_Tmp_Servidor) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._sb_revisar_carptea_tmp_servidor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_resulttmp = (Boolean) result[1];
;
RDebugUtils.currentLine=7405653;
 //BA.debugLineNum = 7405653;BA.debugLine="If Not(ResultTmp) Then";
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
RDebugUtils.currentLine=7405654;
 //BA.debugLineNum = 7405654;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"symbol-cancel.png");
RDebugUtils.currentLine=7405655;
 //BA.debugLineNum = 7405655;BA.debugLine="Msgbox2Async(vError, \"Validación\", \"Ok\", \"\", \"\",";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(__ref._verror /*String*/ ),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7405656;
 //BA.debugLineNum = 7405656;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 45;
return;
case 45:
//C
this.state = 32;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405657;
 //BA.debugLineNum = 7405657;BA.debugLine="Return 2";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(2));return;};
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=7405660;
 //BA.debugLineNum = 7405660;BA.debugLine="Dim CLFx As ClFunciones";
_clfx = new BaKapp.Movil.Tag.clfunciones();
RDebugUtils.currentLine=7405661;
 //BA.debugLineNum = 7405661;BA.debugLine="CLFx.Initialize";
_clfx._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=7405663;
 //BA.debugLineNum = 7405663;BA.debugLine="Wait For(CLFx.Sb_ExisteTabla(\"@WMS_GATEWAY_STOCK\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), _clfx._sb_existetabla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"@WMS_GATEWAY_STOCK"));
this.state = 46;
return;
case 46:
//C
this.state = -1;
_resulttmp = (Boolean) result[1];
;
RDebugUtils.currentLine=7405664;
 //BA.debugLineNum = 7405664;BA.debugLine="Variables.Global_ExisteTabla_MS_GATEWAY_STOCK = R";
parent._variables._global_existetabla_ms_gateway_stock /*boolean*/  = _resulttmp;
RDebugUtils.currentLine=7405667;
 //BA.debugLineNum = 7405667;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_DocDestino)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_sis_despachosimple_docdestino /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 47;
return;
case 47:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405668;
 //BA.debugLineNum = 7405668;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_Tipo) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_sis_despachosimple_tipo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405669;
 //BA.debugLineNum = 7405669;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_TipoPago) C";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref._fx_cargar_sis_despachosimple_tipopago /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 49;
return;
case 49:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7405671;
 //BA.debugLineNum = 7405671;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
RDebugUtils.currentLine=7405673;
 //BA.debugLineNum = 7405673;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(BaKapp.Movil.Tag.conectar_conf __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="conectar_conf";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Dim vError As String";
_verror = "";
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Public Estado As String";
_estado = "";
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_EstacionesBkp Where NombreEquipo = '"+parent._variables._global_iddispositivo /*String*/ +"' And TipoEstacion = 'B4A'";
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_configuracion_estacion"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="Log(\"2.- Una vez que ya tenemos el nombre carga";
parent.__c.LogImpl("67143440","2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp",0);
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Variables.Global_Row_EstacionBk = Funciones.Fx_";
parent._variables._global_row_estacionbk /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="Log(\"Configuracion_Estacion_Cargada\")";
parent.__c.LogImpl("67143442","Configuracion_Estacion_Cargada",0);
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7143451;
 //BA.debugLineNum = 7143451;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Consulta_Sql = \"Select Top 1 *,Getdate() As Fecha";
__ref._consulta_sql /*String*/  = "Select Top 1 *,Getdate() As Fecha_Servidor From CONFIEST"+parent.__c.CRLF+"Inner Join "+parent._variables._global_basebk /*String*/ +"Zw_Configuracion On Empresa = EMPRESA And Modalidad = '"+_modalidad+"'"+parent.__c.CRLF+"Where EMPRESA = '"+_empresa+"' And MODALIDAD = '"+_modalidad+"'";
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_configuracion_estacion_y_general"), (Object)(_js));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Log(\"6.- Cargamos la configuración por Estación";
parent.__c.LogImpl("67340051","6.- Cargamos la configuración por Estación CONFIEST",0);
RDebugUtils.currentLine=7340053;
 //BA.debugLineNum = 7340053;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = F";
parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7340055;
 //BA.debugLineNum = 7340055;BA.debugLine="Variables.Gl_Modalidad = Modalidad";
parent._variables._gl_modalidad /*String*/  = _modalidad;
RDebugUtils.currentLine=7340056;
 //BA.debugLineNum = 7340056;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Con";
parent._variables._gl_empresa /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EMPRESA")));
RDebugUtils.currentLine=7340057;
 //BA.debugLineNum = 7340057;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Co";
parent._variables._gl_sucursal /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ESUCURSAL")));
RDebugUtils.currentLine=7340058;
 //BA.debugLineNum = 7340058;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Conf";
parent._variables._gl_bodega /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("EBODEGA")));
RDebugUtils.currentLine=7340059;
 //BA.debugLineNum = 7340059;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Config";
parent._variables._gl_caja /*String*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ECAJA")));
RDebugUtils.currentLine=7340060;
 //BA.debugLineNum = 7340060;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid(Var";
parent._variables._gl_lista_precios /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTAVEN"))),(int) (6),(int) (3));
RDebugUtils.currentLine=7340061;
 //BA.debugLineNum = 7340061;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(Varia";
parent._variables._gl_lista_costos /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ELISTACOM"))),(int) (6),(int) (3));
RDebugUtils.currentLine=7340062;
 //BA.debugLineNum = 7340062;BA.debugLine="Variables.Gl_Fecha_Servidor = Funciones.Mid(Var";
parent._variables._gl_fecha_servidor /*String*/  = parent._funciones._mid /*String*/ (parent.getActivityBA(),BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Fecha_Servidor"))),(int) (1),(int) (10));
RDebugUtils.currentLine=7340066;
 //BA.debugLineNum = 7340066;BA.debugLine="Consulta_Sql = \"Select\" & CRLF & _ 						    \"E";
__ref._consulta_sql /*String*/  = "Select"+parent.__c.CRLF+"Empresa,Pr_AutoPr_Crear_Codigo_Principal_Automatico, Pr_AutoPr_Correlativo_Por_Iniciales, Pr_AutoPr_Correlativo_General,"+parent.__c.CRLF+"Pr_AutoPr_Tablas_Para_Iniciales_Cod_Automatico, Pr_AutoPr_Max_Cant_Caracteres_Del_Codigo, Pr_AutoPr_Ultimo_Codigo_Creado_Correlativo_General,"+parent.__c.CRLF+"Pr_Desc_Producto_Solo_Mayusculas, Pr_Creacion_Exigir_Precio, Pr_Creacion_Exigir_Clasificacion_busqueda, Pr_Creacion_Exigir_Codigo_Alternativo,"+parent.__c.CRLF+"Tbl_Ranking, Revisa_Taza_Cambio, Revisar_Taza_Solo_Mon_Extranjeras, Vnta_Dias_Venci_Coti, Vnta_TipoValor_Bruto_Neto, Vnta_EntidadXdefecto,"+parent.__c.CRLF+"Vnta_SucEntXdefecto, Vnta_Producto_NoCreado, Vnta_Preguntar_Documento, SOC_CodTurno, SOC_Buscar_Producto, SOC_Aprueba_Solo_G1,"+parent.__c.CRLF+"SOC_Aprueba_G1_y_G2, SOC_Prod_Crea_Solo_Marcas_Proveedor, SOC_Prod_Crea_Max_Carac_Nom, SOC_Valor_1ra_Aprobacion, SOC_Dias_Apela,"+parent.__c.CRLF+"SOC_Tipo_Creacion_Producto_Normal_Matriz, Precio_Costos_Desde, Precios_Venta_Desde_Random, Precios_Venta_Desde_BakApp,"+parent.__c.CRLF+"Vnta_Redondear_Dscto_Cero, Nodo_Raiz_Asociados, Vnta_Ofrecer_Otras_Bod_Stock_Insuficiente, Conservar_Responzable_Doc_Relacionado,"+parent.__c.CRLF+"Preguntar_Si_Cambia_Responsable_Doc_Relacionado, ServTecnico_Empresa, ServTecnico_Sucursal, ServTecnico_Bodega"+parent.__c.CRLF+"From "+parent._variables._global_basebk /*String*/ +"Zw_Configuracion"+parent.__c.CRLF+"Where Modalidad_General = 1";
RDebugUtils.currentLine=7340079;
 //BA.debugLineNum = 7340079;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7340081;
 //BA.debugLineNum = 7340081;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_configuracion_estacion_y_general"), (Object)(_js));
this.state = 26;
return;
case 26:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7340083;
 //BA.debugLineNum = 7340083;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7340085;
 //BA.debugLineNum = 7340085;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7340087;
 //BA.debugLineNum = 7340087;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7340089;
 //BA.debugLineNum = 7340089;BA.debugLine="Log(\"7.- Cargamos la configuración General\")";
parent.__c.LogImpl("67340089","7.- Cargamos la configuración General",0);
RDebugUtils.currentLine=7340090;
 //BA.debugLineNum = 7340090;BA.debugLine="Log(\"Fecha servidor: \" & Variables.Gl_Fecha_S";
parent.__c.LogImpl("67340090","Fecha servidor: "+parent._variables._gl_fecha_servidor /*String*/ ,0);
RDebugUtils.currentLine=7340092;
 //BA.debugLineNum = 7340092;BA.debugLine="Variables.Global_Row_Configuracion_General =";
parent._variables._global_row_configuracion_general /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7340093;
 //BA.debugLineNum = 7340093;BA.debugLine="Resultado = 1";
_resultado = (int) (1);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=7340096;
 //BA.debugLineNum = 7340096;BA.debugLine="Variables.Global_Row_Configuracion_General =";
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
RDebugUtils.currentLine=7340100;
 //BA.debugLineNum = 7340100;BA.debugLine="Log(\"Error al cargar Configuracion General\")";
parent.__c.LogImpl("67340100","Error al cargar Configuracion General",0);
RDebugUtils.currentLine=7340101;
 //BA.debugLineNum = 7340101;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("67340101",_js._errormessage /*String*/ ,0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=7340105;
 //BA.debugLineNum = 7340105;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = N";
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
RDebugUtils.currentLine=7340109;
 //BA.debugLineNum = 7340109;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("67340109",_js._errormessage /*String*/ ,0);
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=7340112;
 //BA.debugLineNum = 7340112;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7340114;
 //BA.debugLineNum = 7340114;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Consulta_Sql = \"Select KOLT As Kolt,KOLT+'-'+NOKO";
__ref._consulta_sql /*String*/  = "Select KOLT As Kolt,KOLT+'-'+NOKOLT As Nokolt From TABPP"+parent.__c.CRLF+"Where KOLT In (Select SUBSTRING(KOOP,4,3)"+parent.__c.CRLF+"From MAEUS Where KOUS = '"+_usuario_x_defecto+"' And KOOP LIKE 'LI-%') And TILT = 'P'"+parent.__c.CRLF+"Order By Nokolt";
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_listas_precios_por_usuario"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Log(\"5.- Traemos la lista de precios asociadas";
parent.__c.LogImpl("67274515","5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar",0);
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Variables.Global_Listas_Precios_Usuario = Funci";
parent._variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7274526;
 //BA.debugLineNum = 7274526;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_DOCDESTINO'";
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_docdestino"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="Log(\"Traemos la lista de tipos de documentos pa";
parent.__c.LogImpl("67602192","Traemos la lista de tipos de documentos para despacho simple",0);
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="Variables.Global_Sis_DespachoSimple_DocDestino";
parent._variables._global_sis_despachosimple_docdestino /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPO'";
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_tipo"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="Log(\"Traemos la lista de tipos de despacho o re";
parent.__c.LogImpl("67667728","Traemos la lista de tipos de despacho o retiro",0);
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="Variables.Global_Sis_DespachoSimple_Tipo = Func";
parent._variables._global_sis_despachosimple_tipo /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7667736;
 //BA.debugLineNum = 7667736;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7667738;
 //BA.debugLineNum = 7667738;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPOPAGO'";
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_tipopago"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="Log(\"Traemos la lista de tipos de pago\")";
parent.__c.LogImpl("67733264","Traemos la lista de tipos de pago",0);
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="Variables.Global_Sis_DespachoSimple_TipoPago =";
parent._variables._global_sis_despachosimple_tipopago /*anywheresoftware.b4a.objects.collections.List*/  = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_vjson);
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7733272;
 //BA.debugLineNum = 7733272;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7733274;
 //BA.debugLineNum = 7733274;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo.'";
__ref._consulta_sql /*String*/  = "Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'";
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_traer_nombre_base_de_datos"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="Log(\"1.- Obtenemos primero el nombre de la base";
parent.__c.LogImpl("67077905","1.- Obtenemos primero el nombre de la base de datos de Bakapp",0);
RDebugUtils.currentLine=7077906;
 //BA.debugLineNum = 7077906;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7077907;
 //BA.debugLineNum = 7077907;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Base";
parent._variables._global_basebk /*String*/  = BA.ObjectToString(_fila.Get((Object)("Global_BaseBk")));
RDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="Log(\"DB BakApp: \" & Variables.Global_BaseBk)";
parent.__c.LogImpl("67077908","DB BakApp: "+parent._variables._global_basebk /*String*/ ,0);
RDebugUtils.currentLine=7077909;
 //BA.debugLineNum = 7077909;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7077914;
 //BA.debugLineNum = 7077914;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7077916;
 //BA.debugLineNum = 7077916;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim Resultado As Int = 0";
_resultado = (int) (0);
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where K";
__ref._consulta_sql /*String*/  = "Select Top 1 * From TABFU Where KOFU = '"+_usuario_x_defecto+"'";
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "fx_traer_usuario_por_defecto"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="Log(\"4.- Cargamos al usuario por defecto y lo t";
parent.__c.LogImpl("67208978","4.- Cargamos al usuario por defecto y lo traemos",0);
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="Resultado = 1";
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
RDebugUtils.currentLine=7208987;
 //BA.debugLineNum = 7208987;BA.debugLine="Return Resultado";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=7208989;
 //BA.debugLineNum = 7208989;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim Consulta_Sql As String";
parent._consulta_sql = "";
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Consulta_Sql = \"Select TOP 1 * From TABMO Where K";
__ref._consulta_sql /*String*/  = "Select TOP 1 * From TABMO Where KOMO = '$'";
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), (Object)(_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="Variables.Global_Row_Moneda = Funciones.Fx_Data";
parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="Consulta_Sql = $\"Select TOP 1 * From MAEMO Wher";
__ref._consulta_sql /*String*/  = ("Select TOP 1 * From MAEMO Where KOMO = 'US$' AND CAST(FEMO AS DATE) = CAST(GETDATE() AS DATE)Order by IDMAEMO DESC");
RDebugUtils.currentLine=7471125;
 //BA.debugLineNum = 7471125;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), (Object)(_js));
this.state = 22;
return;
case 22:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7471128;
 //BA.debugLineNum = 7471128;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7471130;
 //BA.debugLineNum = 7471130;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7471134;
 //BA.debugLineNum = 7471134;BA.debugLine="Variables.Global_Row_Dolar = Funciones.Fx_Dat";
parent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/  = parent._funciones._fx_datarow /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7471136;
 //BA.debugLineNum = 7471136;BA.debugLine="Return 1";
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
RDebugUtils.currentLine=7471144;
 //BA.debugLineNum = 7471144;BA.debugLine="Dim bmp1 As Bitmap";
parent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=7471146;
 //BA.debugLineNum = 7471146;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=7471148;
 //BA.debugLineNum = 7471148;BA.debugLine="Msgbox2Async(\"No existe tasa de cambio del dol";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("No existe tasa de cambio del dolar del hoy"),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7471149;
 //BA.debugLineNum = 7471149;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), null);
this.state = 23;
return;
case 23:
//C
this.state = 16;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7471150;
 //BA.debugLineNum = 7471150;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("67471150",_js._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=7471160;
 //BA.debugLineNum = 7471160;BA.debugLine="Dim bmp1 As Bitmap";
parent._bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=7471162;
 //BA.debugLineNum = 7471162;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=7471164;
 //BA.debugLineNum = 7471164;BA.debugLine="Msgbox2Async(\"Error al buscar la moneda $\", \"Val";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Error al buscar la moneda $"),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,parent.__c.False);
RDebugUtils.currentLine=7471165;
 //BA.debugLineNum = 7471165;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_cargar_modedas"), null);
this.state = 24;
return;
case 24:
//C
this.state = 20;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=7471166;
 //BA.debugLineNum = 7471166;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("67471166",_js._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=7471170;
 //BA.debugLineNum = 7471170;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
RDebugUtils.currentLine=7471172;
 //BA.debugLineNum = 7471172;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim ExisteRuta As Boolean";
_existeruta = false;
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="vError = \"\"";
__ref._verror /*String*/  = "";
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
_js = parent._funciones._fx_httjob_ws_sb_revcarpetatmp /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent);
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_revisar_carptea_tmp_servidor"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="ExisteRuta = Fila.Get(\"ExisteRuta\")";
_existeruta = BA.ObjectToBoolean(_fila.Get((Object)("ExisteRuta")));
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="vError = Fila.Get(\"Error\")";
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
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="Return ExisteRuta";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_existeruta));return;};
RDebugUtils.currentLine=7536667;
 //BA.debugLineNum = 7536667;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIES";
__ref._consulta_sql /*String*/  = "Select Top 1 EMPRESA From CONFIES";
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "conectar_conf", "sb_probar_conexion"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="Estado = \"Conectado\"";
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
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="Estado = \"Desconectado\"";
__ref._estado /*String*/  = "Desconectado";
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}