package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class crear_documento extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "BaKapp.Movil.Tag.crear_documento");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", BaKapp.Movil.Tag.crear_documento.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _consulta_sql = "";
public int _idmaeedo = 0;
public int _id_docenc = 0;
public anywheresoftware.b4a.objects.collections.Map _row_entidad = null;
public anywheresoftware.b4a.objects.collections.Map _fila_encabezado = null;
public anywheresoftware.b4a.objects.collections.Map _fila_observaciones = null;
public anywheresoftware.b4a.objects.collections.Map _fila_despafacil = null;
public boolean _cambiar_entidad = false;
public boolean _crear_nvv_desde_cov = false;
public boolean _usar_precio_original = false;
public anywheresoftware.b4a.objects.collections.Map _fila_idenc = null;
public boolean _chkvalores = false;
public String _funcionario = "";
public double _totalnetodoc = 0;
public double _totalbrutodoc = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp2 = null;
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
public BaKapp.Movil.Tag.frm_post_01_formulario _frm_post_01_formulario = null;
public BaKapp.Movil.Tag.frm_post_01_producto _frm_post_01_producto = null;
public BaKapp.Movil.Tag.funciones _funciones = null;
public BaKapp.Movil.Tag.variables _variables = null;
public BaKapp.Movil.Tag.httputils2service _httputils2service = null;
public BaKapp.Movil.Tag.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
 //BA.debugLineNum = 5;BA.debugLine="Public Idmaeedo As Int";
_idmaeedo = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public Id_DocEnc As Int";
_id_docenc = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public Fila_Encabezado As Map";
_fila_encabezado = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public Fila_Observaciones As Map";
_fila_observaciones = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Public Fila_DespaFacil As Map";
_fila_despafacil = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Public Cambiar_Entidad As Boolean";
_cambiar_entidad = false;
 //BA.debugLineNum = 13;BA.debugLine="Public Crear_NVV_Desde_COV As Boolean";
_crear_nvv_desde_cov = false;
 //BA.debugLineNum = 14;BA.debugLine="Public Usar_Precio_Original As Boolean";
_usar_precio_original = false;
 //BA.debugLineNum = 16;BA.debugLine="Private Fila_IdEnc As Map";
_fila_idenc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Public ChkValores As Boolean";
_chkvalores = false;
 //BA.debugLineNum = 19;BA.debugLine="Dim FUNCIONARIO As String '= Variables.Global_Row";
_funcionario = "";
 //BA.debugLineNum = 21;BA.debugLine="Dim TotalNetoDoc As Double";
_totalnetodoc = 0;
 //BA.debugLineNum = 22;BA.debugLine="Dim TotalBrutoDoc As Double";
_totalbrutodoc = 0;
 //BA.debugLineNum = 24;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 31;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
_funcionario = BA.ObjectToString(_variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _sb_actualizar_datos_de_la_entidad(anywheresoftware.b4a.objects.collections.Map _rowentidad,boolean _revisar_permiso_lista_precio,boolean _aplicar_venciminetos) throws Exception{
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
long[] _cuotas_f = null;
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
 //BA.debugLineNum = 231;BA.debugLine="Sub Sb_Actualizar_Datos_De_La_Entidad(RowEntidad A";
 //BA.debugLineNum = 235;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = __c.DateTime.getNow();
 //BA.debugLineNum = 236;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
 //BA.debugLineNum = 237;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
 //BA.debugLineNum = 238;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
 //BA.debugLineNum = 240;BA.debugLine="Dim Cuotas As Int = 1";
_cuotas = (int) (1);
 //BA.debugLineNum = 241;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
 //BA.debugLineNum = 242;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
 //BA.debugLineNum = 243;BA.debugLine="Dim Forma_pago As String";
_forma_pago = "";
 //BA.debugLineNum = 245;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
_fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 246;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
_fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 247;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
_fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 248;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
_fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 249;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
_fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 251;BA.debugLine="Dim Lista As String";
_lista = "";
 //BA.debugLineNum = 252;BA.debugLine="Dim Permiso As String";
_permiso = "";
 //BA.debugLineNum = 254;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
_listaprecios = BA.ObjectToString(_fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 255;BA.debugLine="Lista = ListaPrecios";
_lista = _listaprecios;
 //BA.debugLineNum = 257;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
_cuotas = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("NUVECR"))));
 //BA.debugLineNum = 258;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
_dias_1er_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIPRVE"))));
 //BA.debugLineNum = 259;BA.debugLine="Dias_Vencimiento = RowEntidad.Get(\"DIASVENCI\")";
_dias_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIASVENCI"))));
 //BA.debugLineNum = 261;BA.debugLine="Dim Rut As String";
_rut = "";
 //BA.debugLineNum = 263;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
_fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),_rowentidad.Get((Object)("KOEN")));
 //BA.debugLineNum = 264;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
_fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),_rowentidad.Get((Object)("SUEN")));
 //BA.debugLineNum = 265;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
_fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),_rowentidad.Get((Object)("NOKOEN")));
 //BA.debugLineNum = 274;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
_lista = BA.ObjectToString(_rowentidad.Get((Object)("LVEN")));
 //BA.debugLineNum = 275;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
_lista = _funciones._mid /*String*/ (getActivityBA(),_lista,(int) (6),(int) (3));
 //BA.debugLineNum = 277;BA.debugLine="Permiso = \"Lp-\" & Lista";
_permiso = "Lp-"+_lista;
 //BA.debugLineNum = 282;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
if (_cuotas==0) { 
_cuotas = (int) (1);};
 //BA.debugLineNum = 284;BA.debugLine="Dim Cuotas_F(Cuotas - 1) As Long";
_cuotas_f = new long[(int) (_cuotas-1)];
;
 //BA.debugLineNum = 286;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
if (__c.Not(_aplicar_venciminetos)) { 
 //BA.debugLineNum = 287;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 };
 //BA.debugLineNum = 290;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (_dias_1er_vencimiento>0) { 
 //BA.debugLineNum = 297;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
_fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
 //BA.debugLineNum = 298;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
_fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
 //BA.debugLineNum = 304;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
_fechasvenci = _fechaemision;
 //BA.debugLineNum = 305;BA.debugLine="Dim dias As Int";
_dias = 0;
 //BA.debugLineNum = 307;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (_dias_1er_vencimiento>0) { 
 //BA.debugLineNum = 308;BA.debugLine="dias = Dias_1er_Vencimiento";
_dias = _dias_1er_vencimiento;
 //BA.debugLineNum = 309;BA.debugLine="For i = 1 To Cuotas";
{
final int step40 = 1;
final int limit40 = _cuotas;
_i = (int) (1) ;
for (;_i <= limit40 ;_i = _i + step40 ) {
 //BA.debugLineNum = 312;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
_fechasvenci = __c.DateTime.Add(_fechasvenci,(int) (0),(int) (0),_dias);
 //BA.debugLineNum = 314;BA.debugLine="Cuotas_F(i - 1) = FechasVenci";
_cuotas_f[(int) (_i-1)] = _fechasvenci;
 //BA.debugLineNum = 315;BA.debugLine="dias = Dias_Vencimiento";
_dias = _dias_vencimiento;
 }
};
 //BA.debugLineNum = 317;BA.debugLine="FechaUltVencimiento = FechasVenci";
_fechaultvencimiento = _fechasvenci;
 }else {
 //BA.debugLineNum = 319;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
 };
 //BA.debugLineNum = 322;BA.debugLine="Fecha_1er_Vencimiento = Cuotas_F(0)";
_fecha_1er_vencimiento = _cuotas_f[(int) (0)];
 }else {
 //BA.debugLineNum = 339;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
 //BA.debugLineNum = 340;BA.debugLine="FechaUltVencimiento = FechaEmision";
_fechaultvencimiento = _fechaemision;
 //BA.debugLineNum = 341;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
 //BA.debugLineNum = 342;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 //BA.debugLineNum = 343;BA.debugLine="Dias_Vencimiento = 0";
_dias_vencimiento = (int) (0);
 };
 //BA.debugLineNum = 347;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
_forma_pago = BA.ObjectToString(_rowentidad.Get((Object)("CPEN")));
 //BA.debugLineNum = 349;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
_fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
 //BA.debugLineNum = 350;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
_fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
 //BA.debugLineNum = 351;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
_fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
 //BA.debugLineNum = 352;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
_fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
 //BA.debugLineNum = 354;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
_fila_encabezado.Put((Object)("Cuotas"),(Object)(_cuotas));
 //BA.debugLineNum = 355;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
_fila_encabezado.Put((Object)("Dias_1er_Vencimiento"),(Object)(_dias_1er_vencimiento));
 //BA.debugLineNum = 356;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
_fila_encabezado.Put((Object)("Dias_Vencimiento"),(Object)(_dias_vencimiento));
 //BA.debugLineNum = 357;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
_fila_observaciones.Put((Object)("Forma_pago"),(Object)(_forma_pago));
 //BA.debugLineNum = 359;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
if (_revisar_permiso_lista_precio) { 
 //BA.debugLineNum = 361;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean '= TienePermi";
_tiene_permiso_lista = false;
 //BA.debugLineNum = 362;BA.debugLine="Dim Cambiar_lista As Boolean";
_cambiar_lista = false;
 //BA.debugLineNum = 363;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
_mostrar_mensaje_cambio_lista = false;
 //BA.debugLineNum = 366;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
{
final int step70 = 1;
final int limit70 = (int) (_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
 //BA.debugLineNum = 367;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 368;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
_value = BA.ObjectToString(_m.Get((Object)("Kolt")));
 //BA.debugLineNum = 370;BA.debugLine="If Lista = value Then";
if ((_lista).equals(_value)) { 
 //BA.debugLineNum = 371;BA.debugLine="Tiene_Permiso_Lista = True";
_tiene_permiso_lista = __c.True;
 //BA.debugLineNum = 372;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 377;BA.debugLine="If Tiene_Permiso_Lista Then";
if (_tiene_permiso_lista) { 
 //BA.debugLineNum = 378;BA.debugLine="Cambiar_lista = True";
_cambiar_lista = __c.True;
 }else {
 //BA.debugLineNum = 381;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 383;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
_bmp1 = __c.LoadBitmap(__c.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 385;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
__c.Msgbox2Async(BA.ObjectToCharSequence("Usted no tiene permiso para trabajar con la lista"+__c.CRLF+"La lista seguirá siendo:"+_listaprecios),BA.ObjectToCharSequence("Validación"),"Ok","","",_bmp1,ba,__c.False);
 };
 //BA.debugLineNum = 391;BA.debugLine="If Cambiar_lista Then";
if (_cambiar_lista) { 
 //BA.debugLineNum = 392;BA.debugLine="ListaPrecios = Lista";
_listaprecios = _lista;
 //BA.debugLineNum = 393;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
_fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 };
 };
 //BA.debugLineNum = 398;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
{
final int step90 = 1;
final int limit90 = (int) (_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit90 ;_i = _i + step90 ) {
 //BA.debugLineNum = 400;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 401;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
 //BA.debugLineNum = 402;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
 //BA.debugLineNum = 404;BA.debugLine="If Lista = Kolt Then";
if ((_lista).equals(_kolt)) { 
 //BA.debugLineNum = 406;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 413;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
_bloqueado = BA.ObjectToBoolean(_rowentidad.Get((Object)("BLOQUEADO")));
 //BA.debugLineNum = 415;BA.debugLine="If Bloqueado Then";
if (_bloqueado) { 
 //BA.debugLineNum = 417;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 419;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
_bmp1 = __c.LoadBitmap(__c.File.getDirAssets(),"user.png");
 //BA.debugLineNum = 421;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
__c.Msgbox2Async(BA.ObjectToCharSequence("¡CLIENTE BLOQUEADO!"+__c.CRLF+"LSolo es posible generar cotizaciones"),BA.ObjectToCharSequence("CLIENTE MOROSO"),"Ok","","",_bmp1,ba,__c.False);
 };
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_incorporar_productos() throws Exception{
ResumableSub_Sb_Incorporar_Productos rsub = new ResumableSub_Sb_Incorporar_Productos(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Incorporar_Productos extends BA.ResumableSub {
public ResumableSub_Sb_Incorporar_Productos(BaKapp.Movil.Tag.crear_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.crear_documento parent;
String _campoprecio = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _lista = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _codigo = "";
String _descripcion = "";
boolean _prct = false;
String _tict = "";
String _nulido = "";
double _podtglli = 0;
double _rludpr = 0;
int _udtpr = 0;
double _cantidad = 0;
double _vaneli = 0;
double _vabrdo = 0;
String _codfuncionario = "";
String _codlista = "";
String _moneda = "";
String _tipo_moneda = "";
double _tipo_cambio = 0;
int _idmaeedo_dori = 0;
int _idmaeddo_dori = 0;
String _empresa = "";
String _sucursal = "";
String _bodega = "";
String _emprepa = "";
String _tidopa = "";
String _nudopa = "";
String _endopa = "";
String _nulidopa = "";
double _cantud1_dori = 0;
double _cantud2_dori = 0;
double _precio = 0;
anywheresoftware.b4a.objects.collections.Map _rowproducto = null;
long _fechaemision = 0L;
int _id_docdet = 0;
anywheresoftware.b4a.objects.collections.Map _new_row = null;
anywheresoftware.b4a.objects.collections.Map _fila_id = null;
anywheresoftware.b4a.objects.collections.List _tbldescuentos = null;
anywheresoftware.b4a.objects.collections.Map _fila_dscto = null;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1132;BA.debugLine="Dim CampoPrecio As String";
_campoprecio = "";
 //BA.debugLineNum = 1134;BA.debugLine="Consulta_Sql = \"Select * From MAEDDO Where IDMAEE";
parent._consulta_sql = "Select * From MAEDDO Where IDMAEEDO = "+BA.NumberToString(parent._idmaeedo)+" Order By IDMAEDDO";
 //BA.debugLineNum = 1136;BA.debugLine="ChkValores = True";
parent._chkvalores = parent.__c.True;
 //BA.debugLineNum = 1138;BA.debugLine="If ChkValores Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._chkvalores) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 1139;BA.debugLine="CampoPrecio = \"PPPRNE\"";
_campoprecio = "PPPRNE";
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 1141;BA.debugLine="CampoPrecio = \"PPPRBR\"";
_campoprecio = "PPPRBR";
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1148;BA.debugLine="Consulta_Sql = \"Select MAEDDO.*,Case WHEN UDTRPR";
parent._consulta_sql = "Select MAEDDO.*,Case WHEN UDTRPR = 1 Then CAPRCO1-CAPREX1 Else CAPRCO2-CAPREX2 END AS 'Cantidad',"+parent.__c.CRLF+"CAPRCO1-CAPREX1 As 'CantUd1_Dori',CAPRCO2-CAPREX2 AS 'CantUd2_Dori',"+parent.__c.CRLF+"Case WHEN UDTRPR = 1 Then "+_campoprecio+" Else "+_campoprecio+"*RLUDPR END AS 'Precio'"+parent.__c.CRLF+"From MAEDDO WITH ( NOLOCK )"+parent.__c.CRLF+"Where IDMAEEDO = "+BA.NumberToString(parent._idmaeedo)+" And ( ESLIDO<>'C' OR ESFALI='I')"+parent.__c.CRLF+"Order by IDMAEDDO";
 //BA.debugLineNum = 1155;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 1156;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 52;
return;
case 52:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1158;BA.debugLine="If Js.Success Then";
if (true) break;

case 7:
//if
this.state = 51;
if (_js._success /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1160;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1162;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 10:
//if
this.state = 50;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 1164;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1166;BA.debugLine="For Each Fila As Map In Lista";
if (true) break;

case 13:
//for
this.state = 49;
_fila = new anywheresoftware.b4a.objects.collections.Map();
group16 = _lista;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 53;
if (true) break;

case 53:
//C
this.state = 49;
if (index16 < groupLen16) {
this.state = 15;
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group16.Get(index16)));}
if (true) break;

case 54:
//C
this.state = 53;
index16++;
if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 1168;BA.debugLine="Dim Codigo As String = Fila.Get(\"KOPRCT\")";
_codigo = BA.ObjectToString(_fila.Get((Object)("KOPRCT")));
 //BA.debugLineNum = 1169;BA.debugLine="Dim Descripcion As String = Fila.Get(\"NOKOPR\")";
_descripcion = BA.ObjectToString(_fila.Get((Object)("NOKOPR")));
 //BA.debugLineNum = 1170;BA.debugLine="Dim Prct As Boolean = Fila.Get(\"PRCT\")";
_prct = BA.ObjectToBoolean(_fila.Get((Object)("PRCT")));
 //BA.debugLineNum = 1171;BA.debugLine="Dim Tict As String = Fila.Get(\"TICT\")";
_tict = BA.ObjectToString(_fila.Get((Object)("TICT")));
 //BA.debugLineNum = 1172;BA.debugLine="Dim Nulido As String = Fila.Get(\"NULIDO\")";
_nulido = BA.ObjectToString(_fila.Get((Object)("NULIDO")));
 //BA.debugLineNum = 1173;BA.debugLine="Dim Podtglli As Double = Fila.Get(\"PODTGLLI\")";
_podtglli = (double)(BA.ObjectToNumber(_fila.Get((Object)("PODTGLLI"))));
 //BA.debugLineNum = 1174;BA.debugLine="Dim Rludpr As Double = Fila.Get(\"RLUDPR\")";
_rludpr = (double)(BA.ObjectToNumber(_fila.Get((Object)("RLUDPR"))));
 //BA.debugLineNum = 1175;BA.debugLine="Dim Udtpr As Int = Fila.Get(\"UDTRPR\")";
_udtpr = (int)(BA.ObjectToNumber(_fila.Get((Object)("UDTRPR"))));
 //BA.debugLineNum = 1176;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"Cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(_fila.Get((Object)("Cantidad"))));
 //BA.debugLineNum = 1177;BA.debugLine="Dim Vaneli As Double = Fila.Get(\"VANELI\")";
_vaneli = (double)(BA.ObjectToNumber(_fila.Get((Object)("VANELI"))));
 //BA.debugLineNum = 1178;BA.debugLine="Dim Vabrdo As Double = Fila.Get(\"VABRLI\")";
_vabrdo = (double)(BA.ObjectToNumber(_fila.Get((Object)("VABRLI"))));
 //BA.debugLineNum = 1180;BA.debugLine="Dim CodFuncionario As String = Fila.Get(\"KOFUL";
_codfuncionario = BA.ObjectToString(_fila.Get((Object)("KOFULIDO")));
 //BA.debugLineNum = 1181;BA.debugLine="Dim Codlista As String = Fila.Get(\"KOLTPR\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("KOLTPR")));
 //BA.debugLineNum = 1182;BA.debugLine="Codlista = Codlista.Replace(\"TABPP\",\"\")";
_codlista = _codlista.replace("TABPP","");
 //BA.debugLineNum = 1183;BA.debugLine="Dim Moneda As String = Fila.Get(\"MOPPPR\")";
_moneda = BA.ObjectToString(_fila.Get((Object)("MOPPPR")));
 //BA.debugLineNum = 1184;BA.debugLine="Dim Tipo_moneda As String = Fila.Get(\"TIMOPPPR";
_tipo_moneda = BA.ObjectToString(_fila.Get((Object)("TIMOPPPR")));
 //BA.debugLineNum = 1185;BA.debugLine="Dim Tipo_cambio As Double = Fila.Get(\"TAMOPPPR";
_tipo_cambio = (double)(BA.ObjectToNumber(_fila.Get((Object)("TAMOPPPR"))));
 //BA.debugLineNum = 1187;BA.debugLine="Dim Idmaeedo_Dori As Int = Fila.Get(\"IDMAEEDO\"";
_idmaeedo_dori = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEEDO"))));
 //BA.debugLineNum = 1188;BA.debugLine="Dim Idmaeddo_Dori As Int = Fila.Get(\"IDMAEDDO\"";
_idmaeddo_dori = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEDDO"))));
 //BA.debugLineNum = 1190;BA.debugLine="Dim Empresa As String = Fila.Get(\"EMPRESA\")";
_empresa = BA.ObjectToString(_fila.Get((Object)("EMPRESA")));
 //BA.debugLineNum = 1191;BA.debugLine="Dim Sucursal As String = Fila.Get(\"SULIDO\")";
_sucursal = BA.ObjectToString(_fila.Get((Object)("SULIDO")));
 //BA.debugLineNum = 1192;BA.debugLine="Dim Bodega As String = Fila.Get(\"BOSULIDO\")";
_bodega = BA.ObjectToString(_fila.Get((Object)("BOSULIDO")));
 //BA.debugLineNum = 1194;BA.debugLine="Variables.Gl_Bodega = Bodega";
parent._variables._gl_bodega /*String*/  = _bodega;
 //BA.debugLineNum = 1196;BA.debugLine="Dim Emprepa As String = Fila.Get(\"EMPRESA\")";
_emprepa = BA.ObjectToString(_fila.Get((Object)("EMPRESA")));
 //BA.debugLineNum = 1197;BA.debugLine="Dim Tidopa As String = Fila.Get(\"TIDO\")";
_tidopa = BA.ObjectToString(_fila.Get((Object)("TIDO")));
 //BA.debugLineNum = 1198;BA.debugLine="Dim Nudopa As String = Fila.Get(\"NUDO\")";
_nudopa = BA.ObjectToString(_fila.Get((Object)("NUDO")));
 //BA.debugLineNum = 1199;BA.debugLine="Dim Endopa As String = Fila.Get(\"ENDO\")";
_endopa = BA.ObjectToString(_fila.Get((Object)("ENDO")));
 //BA.debugLineNum = 1200;BA.debugLine="Dim Nulidopa As String = Fila.Get(\"NULIDO\")";
_nulidopa = BA.ObjectToString(_fila.Get((Object)("NULIDO")));
 //BA.debugLineNum = 1202;BA.debugLine="Dim CantUd1_Dori As Double = Fila.Get(\"CantUd1";
_cantud1_dori = (double)(BA.ObjectToNumber(_fila.Get((Object)("CantUd1_Dori"))));
 //BA.debugLineNum = 1203;BA.debugLine="Dim CantUd2_Dori As Double = Fila.Get(\"CantUd2";
_cantud2_dori = (double)(BA.ObjectToNumber(_fila.Get((Object)("CantUd2_Dori"))));
 //BA.debugLineNum = 1205;BA.debugLine="Dim Precio As Double = Fila.Get(\"Precio\")";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)("Precio"))));
 //BA.debugLineNum = 1207;BA.debugLine="If Usar_Precio_Original And Not(Prct) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._usar_precio_original && parent.__c.Not(_prct)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1208;BA.debugLine="Wait For(Sb_Traer_Producto2(Codigo,Empresa,Su";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_producto2(_codigo,_empresa,_sucursal,_bodega));
this.state = 55;
return;
case 55:
//C
this.state = 19;
_rowproducto = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 1209;BA.debugLine="Precio = RowProducto.Get(\"Precio\")";
_precio = (double)(BA.ObjectToNumber(_rowproducto.Get((Object)("Precio"))));
 if (true) break;
;
 //BA.debugLineNum = 1212;BA.debugLine="If Crear_NVV_Desde_COV = False Then";

case 19:
//if
this.state = 22;
if (parent._crear_nvv_desde_cov==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 1214;BA.debugLine="Idmaeedo_Dori = 0";
_idmaeedo_dori = (int) (0);
 //BA.debugLineNum = 1215;BA.debugLine="Idmaeddo_Dori = 0";
_idmaeddo_dori = (int) (0);
 //BA.debugLineNum = 1216;BA.debugLine="Emprepa = \"\"";
_emprepa = "";
 //BA.debugLineNum = 1217;BA.debugLine="Tidopa = \"\"";
_tidopa = "";
 //BA.debugLineNum = 1218;BA.debugLine="Nudopa = \"\"";
_nudopa = "";
 //BA.debugLineNum = 1219;BA.debugLine="Endopa = \"\"";
_endopa = "";
 //BA.debugLineNum = 1220;BA.debugLine="Nulidopa = \"\"";
_nulidopa = "";
 if (true) break;
;
 //BA.debugLineNum = 1224;BA.debugLine="If Udtpr = 2 Then";

case 22:
//if
this.state = 25;
if (_udtpr==2) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 1225;BA.debugLine="Precio = Precio*Rludpr";
_precio = _precio*_rludpr;
 if (true) break;

case 25:
//C
this.state = 26;
;
 //BA.debugLineNum = 1228;BA.debugLine="ProgressDialogShow(Codigo & \"-\" & Descripcion)";
parent.__c.ProgressDialogShow(parent.getActivityBA(),BA.ObjectToCharSequence(_codigo+"-"+_descripcion));
 //BA.debugLineNum = 1230;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 1233;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 1235;BA.debugLine="If Prct And Usar_Precio_Original Then";
if (true) break;

case 26:
//if
this.state = 37;
if (_prct && parent._usar_precio_original) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 1237;BA.debugLine="If Tict = \"D\" Then";
if (true) break;

case 29:
//if
this.state = 36;
if ((_tict).equals("D")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 1239;BA.debugLine="Wait For(Sb_Traer_Concepto(Codigo,Empresa,Su";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_concepto(_codigo,_empresa,_sucursal,_bodega,_podtglli));
this.state = 56;
return;
case 56:
//C
this.state = 32;
_id_docdet = (Integer) result[0];
;
 //BA.debugLineNum = 1241;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
parent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 1242;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1244;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
parent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 1245;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1247;BA.debugLine="New_Row.Put(\"Idmaeedo_Dori\",Idmaeedo_Dori)";
_new_row.Put((Object)("Idmaeedo_Dori"),(Object)(_idmaeedo_dori));
 //BA.debugLineNum = 1248;BA.debugLine="New_Row.Put(\"Idmaeddo_Dori\",Idmaeddo_Dori)";
_new_row.Put((Object)("Idmaeddo_Dori"),(Object)(_idmaeddo_dori));
 //BA.debugLineNum = 1249;BA.debugLine="New_Row.Put(\"Emprepa\",Emprepa)";
_new_row.Put((Object)("Emprepa"),(Object)(_emprepa));
 //BA.debugLineNum = 1250;BA.debugLine="New_Row.Put(\"Tidopa\",Tidopa)";
_new_row.Put((Object)("Tidopa"),(Object)(_tidopa));
 //BA.debugLineNum = 1251;BA.debugLine="New_Row.Put(\"Nudopa\",Nudopa)";
_new_row.Put((Object)("Nudopa"),(Object)(_nudopa));
 //BA.debugLineNum = 1252;BA.debugLine="New_Row.Put(\"Endopa\",Endopa)";
_new_row.Put((Object)("Endopa"),(Object)(_endopa));
 //BA.debugLineNum = 1253;BA.debugLine="New_Row.Put(\"Nulidopa\",Nulidopa)";
_new_row.Put((Object)("Nulidopa"),(Object)(_nulidopa));
 //BA.debugLineNum = 1254;BA.debugLine="New_Row.Put(\"CantUd1_Dori\",CantUd1_Dori)";
_new_row.Put((Object)("CantUd1_Dori"),(Object)(_cantud1_dori));
 //BA.debugLineNum = 1255;BA.debugLine="New_Row.Put(\"CantUd2_Dori\",CantUd2_Dori)";
_new_row.Put((Object)("CantUd2_Dori"),(Object)(_cantud2_dori));
 //BA.debugLineNum = 1257;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
_new_row.Put((Object)("codfuncionario"),(Object)(_codfuncionario));
 //BA.debugLineNum = 1258;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
_new_row.Put((Object)("codvendedor"),(Object)(_codfuncionario));
 //BA.debugLineNum = 1259;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
_new_row.Put((Object)("codlista"),(Object)(_codlista));
 //BA.debugLineNum = 1261;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
_new_row.Put((Object)("moneda"),(Object)(_moneda));
 //BA.debugLineNum = 1262;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
_new_row.Put((Object)("tipo_moneda"),(Object)(_tipo_moneda));
 //BA.debugLineNum = 1263;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
_new_row.Put((Object)("tipo_cambio"),(Object)(_tipo_cambio));
 //BA.debugLineNum = 1265;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
 //BA.debugLineNum = 1266;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
 //BA.debugLineNum = 1268;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
_new_row.Put((Object)("empresa"),(Object)(_empresa));
 //BA.debugLineNum = 1269;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
_new_row.Put((Object)("sucursal"),(Object)(_sucursal));
 //BA.debugLineNum = 1270;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
_new_row.Put((Object)("bodega"),(Object)(_bodega));
 //BA.debugLineNum = 1272;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\",New_Row)";
parent._sb_procesar_datos("DescuentoPorc",_new_row);
 //BA.debugLineNum = 1274;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
 //BA.debugLineNum = 1276;BA.debugLine="If Id_DocDet <> 0 Then";
if (true) break;

case 32:
//if
this.state = 35;
if (_id_docdet!=0) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 1277;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
parent.__c.LogImpl("230474387",_codigo+"-"+_descripcion,0);
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
;
 //BA.debugLineNum = 1284;BA.debugLine="If Not(Prct) Then";

case 37:
//if
this.state = 48;
if (parent.__c.Not(_prct)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 1286;BA.debugLine="TotalNetoDoc = TotalNetoDoc + Vaneli";
parent._totalnetodoc = parent._totalnetodoc+_vaneli;
 //BA.debugLineNum = 1287;BA.debugLine="TotalBrutoDoc = TotalBrutoDoc + Vabrdo";
parent._totalbrutodoc = parent._totalbrutodoc+_vabrdo;
 //BA.debugLineNum = 1289;BA.debugLine="Wait For(Sb_Traer_Producto(Codigo,Empresa,Suc";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_producto(_codigo,_empresa,_sucursal,_bodega));
this.state = 57;
return;
case 57:
//C
this.state = 40;
_id_docdet = (Integer) result[0];
;
 //BA.debugLineNum = 1291;BA.debugLine="If Id_DocDet <> 0 Then";
if (true) break;

case 40:
//if
this.state = 47;
if (_id_docdet!=0) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 1293;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
parent._consulta_sql = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 1294;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1296;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
parent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 1297;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1299;BA.debugLine="New_Row.Put(\"idmaeedo_dori\",Idmaeedo_Dori)";
_new_row.Put((Object)("idmaeedo_dori"),(Object)(_idmaeedo_dori));
 //BA.debugLineNum = 1300;BA.debugLine="New_Row.Put(\"idmaeddo_dori\",Idmaeddo_Dori)";
_new_row.Put((Object)("idmaeddo_dori"),(Object)(_idmaeddo_dori));
 //BA.debugLineNum = 1301;BA.debugLine="New_Row.Put(\"emprepa\",Emprepa)";
_new_row.Put((Object)("emprepa"),(Object)(_emprepa));
 //BA.debugLineNum = 1302;BA.debugLine="New_Row.Put(\"tidopa\",Tidopa)";
_new_row.Put((Object)("tidopa"),(Object)(_tidopa));
 //BA.debugLineNum = 1303;BA.debugLine="New_Row.Put(\"nudopa\",Nudopa)";
_new_row.Put((Object)("nudopa"),(Object)(_nudopa));
 //BA.debugLineNum = 1304;BA.debugLine="New_Row.Put(\"endopa\",Endopa)";
_new_row.Put((Object)("endopa"),(Object)(_endopa));
 //BA.debugLineNum = 1305;BA.debugLine="New_Row.Put(\"nulidopa\",Nulidopa)";
_new_row.Put((Object)("nulidopa"),(Object)(_nulidopa));
 //BA.debugLineNum = 1307;BA.debugLine="New_Row.Put(\"cantUd1_dori\",CantUd1_Dori)";
_new_row.Put((Object)("cantUd1_dori"),(Object)(_cantud1_dori));
 //BA.debugLineNum = 1308;BA.debugLine="New_Row.Put(\"cantUd2_dori\",CantUd2_Dori)";
_new_row.Put((Object)("cantUd2_dori"),(Object)(_cantud2_dori));
 //BA.debugLineNum = 1310;BA.debugLine="New_Row.Put(\"cantidad\",Cantidad)";
_new_row.Put((Object)("cantidad"),(Object)(_cantidad));
 //BA.debugLineNum = 1311;BA.debugLine="New_Row.Put(\"precio\",Precio)";
_new_row.Put((Object)("precio"),(Object)(_precio));
 //BA.debugLineNum = 1313;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
_new_row.Put((Object)("codfuncionario"),(Object)(_codfuncionario));
 //BA.debugLineNum = 1314;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
_new_row.Put((Object)("codvendedor"),(Object)(_codfuncionario));
 //BA.debugLineNum = 1315;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
_new_row.Put((Object)("codlista"),(Object)(_codlista));
 //BA.debugLineNum = 1317;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
_new_row.Put((Object)("moneda"),(Object)(_moneda));
 //BA.debugLineNum = 1318;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
_new_row.Put((Object)("tipo_moneda"),(Object)(_tipo_moneda));
 //BA.debugLineNum = 1319;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
_new_row.Put((Object)("tipo_cambio"),(Object)(_tipo_cambio));
 //BA.debugLineNum = 1321;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
 //BA.debugLineNum = 1322;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
 //BA.debugLineNum = 1324;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
_new_row.Put((Object)("empresa"),(Object)(_empresa));
 //BA.debugLineNum = 1325;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
_new_row.Put((Object)("sucursal"),(Object)(_sucursal));
 //BA.debugLineNum = 1326;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
_new_row.Put((Object)("bodega"),(Object)(_bodega));
 //BA.debugLineNum = 1328;BA.debugLine="Sb_Procesar_Datos(\"Cantidad\",New_Row)";
parent._sb_procesar_datos("Cantidad",_new_row);
 //BA.debugLineNum = 1330;BA.debugLine="Wait For(Sb_Traer_Descuentos(Nulido)) Comple";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_descuentos(_nulido));
this.state = 58;
return;
case 58:
//C
this.state = 43;
_tbldescuentos = (anywheresoftware.b4a.objects.collections.List) result[0];
;
 //BA.debugLineNum = 1332;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
parent._consulta_sql = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
 //BA.debugLineNum = 1333;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(V";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1335;BA.debugLine="If TblDescuentos <> Null Then";
if (true) break;

case 43:
//if
this.state = 46;
if (_tbldescuentos!= null) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 1336;BA.debugLine="Sb_Insertar_Descuentos_En_Escala(New_Row,Fi";
parent._sb_insertar_descuentos_en_escala(_new_row,_fila_dscto,_tbldescuentos,_precio);
 if (true) break;

case 46:
//C
this.state = 47;
;
 //BA.debugLineNum = 1339;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
 //BA.debugLineNum = 1341;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
parent.__c.LogImpl("230474451",_codigo+"-"+_descripcion,0);
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = -1;
;
 //BA.debugLineNum = 1353;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1355;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(BaKapp.Movil.Tag.httpjob _js) throws Exception{
}
public void  _complete(anywheresoftware.b4a.objects.collections.Map _rowproducto) throws Exception{
}
public String  _sb_insertar_descuentos_en_escala(anywheresoftware.b4a.objects.collections.Map _fila,anywheresoftware.b4a.objects.collections.Map _fila_dscto,anywheresoftware.b4a.objects.collections.List _tbldescuentos,double _precio) throws Exception{
int _id_docdet = 0;
int _nrodscto = 0;
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
 //BA.debugLineNum = 1539;BA.debugLine="Sub Sb_Insertar_Descuentos_En_Escala(Fila As Map,F";
 //BA.debugLineNum = 1541;BA.debugLine="Dim Id_DocDet As Int = Fila.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(_fila.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 1542;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(_fila.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 1544;BA.debugLine="Dim NroDscto As Int = 0";
_nrodscto = (int) (0);
 //BA.debugLineNum = 1553;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
_valor = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
 //BA.debugLineNum = 1555;BA.debugLine="Dim Total_Descuento As Double";
_total_descuento = 0;
 //BA.debugLineNum = 1556;BA.debugLine="Dim Total_Pc As Double";
_total_pc = 0;
 //BA.debugLineNum = 1559;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (_fila_dscto.IsInitialized()) { 
 //BA.debugLineNum = 1560;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
_dbutils._deleterecord /*String*/ (getActivityBA(),_variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 };
 //BA.debugLineNum = 1563;BA.debugLine="Dim Decimales As Int";
_decimales = 0;
 //BA.debugLineNum = 1565;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
_moneda_det = "";
 //BA.debugLineNum = 1566;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
_moneda_enc = "";
 //BA.debugLineNum = 1568;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
_tipo_moneda_enc = "";
 //BA.debugLineNum = 1569;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
_tipo_cambio_ent = 0;
 //BA.debugLineNum = 1571;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
 //BA.debugLineNum = 1572;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
 //BA.debugLineNum = 1573;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 };
 }else {
 //BA.debugLineNum = 1576;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
 //BA.debugLineNum = 1577;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 };
 };
 //BA.debugLineNum = 1589;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_tbldescuentos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 1591;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_tbldescuentos.Get(_i)));
 //BA.debugLineNum = 1596;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
_kodt = "D_SIN_TIPO";
 //BA.debugLineNum = 1597;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
_podt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Dscto"))));
 //BA.debugLineNum = 1598;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
_vadt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Valor"))));
 //BA.debugLineNum = 1600;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
if (_podt!=0 || _vadt!=0) { 
 //BA.debugLineNum = 1602;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
if (_podt!=0) { 
 //BA.debugLineNum = 1604;BA.debugLine="If Podt > 0 Then";
if (_podt>0) { 
 //BA.debugLineNum = 1605;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
_vadt = __c.Round2((_podt/(double)100)*_valor,_decimales);
 //BA.debugLineNum = 1608;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = __c.Round2((_vadt/(double)_valor)*100,(int) (5));
 }else {
 //BA.debugLineNum = 1611;BA.debugLine="Vadt = 0";
_vadt = 0;
 };
 }else {
 //BA.debugLineNum = 1616;BA.debugLine="If Vadt <> 0 Then";
if (_vadt!=0) { 
 //BA.debugLineNum = 1618;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = __c.Round2((_vadt/(double)_valor)*100,(int) (5));
 }else {
 //BA.debugLineNum = 1621;BA.debugLine="Podt = 0";
_podt = 0;
 };
 };
 //BA.debugLineNum = 1626;BA.debugLine="Podt = Round2(Podt,Decimales)";
_podt = __c.Round2(_podt,_decimales);
 //BA.debugLineNum = 1628;BA.debugLine="If Podt <> 0 Then";
if (_podt!=0) { 
 //BA.debugLineNum = 1630;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
_consulta_sql = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)";
 //BA.debugLineNum = 1631;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
_variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(_consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id_docenc),(Object)(_id_docdet),(Object)(""),(Object)(_kodt),(Object)(_podt),(Object)(_vadt),(Object)(_podt)}));
 //BA.debugLineNum = 1633;BA.debugLine="NroDscto = NroDscto + 1";
_nrodscto = (int) (_nrodscto+1);
 };
 //BA.debugLineNum = 1637;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
_total_descuento = _total_descuento+_vadt;
 //BA.debugLineNum = 1638;BA.debugLine="Valor = Valor - Vadt";
_valor = _valor-_vadt;
 };
 }
};
 //BA.debugLineNum = 1644;BA.debugLine="If Total_Descuento <> 0 Then";
if (_total_descuento!=0) { 
 //BA.debugLineNum = 1645;BA.debugLine="Total_Pc = Total_Descuento / Precio";
_total_pc = _total_descuento/(double)_precio;
 };
 //BA.debugLineNum = 1660;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
_fila.Put((Object)("descuentovalor"),(Object)(_total_descuento));
 //BA.debugLineNum = 1661;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
_fila.Put((Object)("nrodscto"),(Object)(_nrodscto));
 //BA.debugLineNum = 1666;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\",Fila)";
_sb_procesar_datos("DescuentoValor",_fila);
 //BA.debugLineNum = 1668;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_nuevo_documento() throws Exception{
ResumableSub_Sb_Nuevo_Documento rsub = new ResumableSub_Sb_Nuevo_Documento(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Nuevo_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Nuevo_Documento(BaKapp.Movil.Tag.crear_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.crear_documento parent;
boolean _b4a_despachosimple = false;
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
anywheresoftware.b4a.objects.collections.Map _fenc = null;
boolean _result = false;
anywheresoftware.b4a.objects.collections.Map _flobs = null;
anywheresoftware.b4a.objects.collections.Map _fldesp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 36;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
_b4a_despachosimple = BA.ObjectToBoolean(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
 //BA.debugLineNum = 38;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
parent._consulta_sql = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?";
 //BA.debugLineNum = 39;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
 //BA.debugLineNum = 41;BA.debugLine="Consulta_Sql = \"DELETE FROM [Detalle_Doc] WHERE [";
parent._consulta_sql = "DELETE FROM [Detalle_Doc] WHERE [id_docenc] = ?";
 //BA.debugLineNum = 42;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
 //BA.debugLineNum = 44;BA.debugLine="Consulta_Sql = \"DELETE FROM [Descuentos_Doc] WHER";
parent._consulta_sql = "DELETE FROM [Descuentos_Doc] WHERE id_docenc = ?";
 //BA.debugLineNum = 45;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
 //BA.debugLineNum = 47;BA.debugLine="Consulta_Sql = \"DELETE FROM [Impuestos_Doc] WHERE";
parent._consulta_sql = "DELETE FROM [Impuestos_Doc] WHERE id_docenc = ?";
 //BA.debugLineNum = 48;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
 //BA.debugLineNum = 50;BA.debugLine="Consulta_Sql = \"DELETE FROM [Observaciones_Doc] W";
parent._consulta_sql = "DELETE FROM [Observaciones_Doc] WHERE id_docenc = ?";
 //BA.debugLineNum = 51;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
 //BA.debugLineNum = 54;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
parent._consulta_sql = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)";
 //BA.debugLineNum = 55;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(parent._variables._gl_modalidad /*String*/ ),(Object)(parent._variables._gl_empresa /*String*/ ),(Object)(parent._variables._gl_sucursal /*String*/ )}));
 //BA.debugLineNum = 58;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
parent._consulta_sql = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
 //BA.debugLineNum = 59;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
parent._fila_encabezado = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 62;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
parent._id_docenc = (int)(BA.ObjectToNumber(parent._fila_encabezado.Get((Object)("id_docenc"))));
 //BA.debugLineNum = 65;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
parent._consulta_sql = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 66;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
parent._fila_idenc = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 69;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
parent._consulta_sql = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
 //BA.debugLineNum = 70;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
 //BA.debugLineNum = 73;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
parent._consulta_sql = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 74;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
parent._fila_observaciones = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 76;BA.debugLine="If B4A_DespachoSimple Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_b4a_despachosimple) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 79;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
parent._consulta_sql = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
 //BA.debugLineNum = 80;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(parent._consulta_sql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._id_docenc)}));
 //BA.debugLineNum = 83;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
parent._consulta_sql = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc);
 //BA.debugLineNum = 84;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
parent._fila_despafacil = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 88;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
parent.__c.LogImpl("230212150","Documento cargado... Id_DocEnc = "+BA.NumberToString(parent._id_docenc),0);
 //BA.debugLineNum = 91;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 92;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
 //BA.debugLineNum = 93;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
 //BA.debugLineNum = 94;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
 //BA.debugLineNum = 96;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 98;BA.debugLine="Dim Cuotas As Int = 0";
_cuotas = (int) (0);
 //BA.debugLineNum = 99;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
 //BA.debugLineNum = 100;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
 //BA.debugLineNum = 101;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
_forma_de_pago = "";
 //BA.debugLineNum = 103;BA.debugLine="Dim Centro_Costo As String";
_centro_costo = "";
 //BA.debugLineNum = 105;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
_moneda_doc = BA.ObjectToString(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 106;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
_valor_dolar = (double)(BA.ObjectToNumber(parent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
 //BA.debugLineNum = 107;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
_tasadorig_doc = (double)(BA.ObjectToNumber(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
 //BA.debugLineNum = 108;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
_tipomoneda = BA.ObjectToString(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 110;BA.debugLine="Dim ListaPrecios As String";
_listaprecios = "";
 //BA.debugLineNum = 112;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
_newnrodocumento = "NEWXXXXXXX";
 //BA.debugLineNum = 114;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
_docen_neto_bruto = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_TipoValor_Bruto_Neto")));
 //BA.debugLineNum = 116;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
_centro_costo = "LUVTVEN";
 //BA.debugLineNum = 117;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
_centro_costo = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_centro_costo)));
 //BA.debugLineNum = 119;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
_listaprecios = parent._variables._gl_lista_precios /*String*/ ;
 //BA.debugLineNum = 121;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
parent._fila_encabezado.Put((Object)("TipoDoc".toLowerCase()),(Object)("NVV"));
 //BA.debugLineNum = 122;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
parent._fila_encabezado.Put((Object)("NroDocumento".toLowerCase()),(Object)(_newnrodocumento));
 //BA.debugLineNum = 124;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
parent._fila_encabezado.Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
 //BA.debugLineNum = 125;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
parent._fila_encabezado.Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
 //BA.debugLineNum = 126;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
parent._fila_encabezado.Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
 //BA.debugLineNum = 127;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
 //BA.debugLineNum = 129;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
parent._fila_encabezado.Put((Object)("Cuotas".toLowerCase()),(Object)(_cuotas));
 //BA.debugLineNum = 130;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
parent._fila_encabezado.Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
 //BA.debugLineNum = 131;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
parent._fila_encabezado.Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
 //BA.debugLineNum = 133;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(parent._row_entidad.IsInitialized())) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 134;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Def";
parent._row_entidad = parent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 137;BA.debugLine="Dim CodEntidad As String = Row_Entidad.Get(\"KOEN\"";
_codentidad = BA.ObjectToString(parent._row_entidad.Get((Object)("KOEN")));
 //BA.debugLineNum = 138;BA.debugLine="Dim CodSucEntidad As String = Row_Entidad.Get(\"SU";
_codsucentidad = BA.ObjectToString(parent._row_entidad.Get((Object)("SUEN")));
 //BA.debugLineNum = 139;BA.debugLine="Dim Nombre_Entidad As String = Row_Entidad.Get(\"N";
_nombre_entidad = BA.ObjectToString(parent._row_entidad.Get((Object)("NOKOEN")));
 //BA.debugLineNum = 141;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
parent._fila_encabezado.Put((Object)("CodEntidad".toLowerCase()),(Object)(_codentidad));
 //BA.debugLineNum = 142;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
parent._fila_encabezado.Put((Object)("CodSucEntidad".toLowerCase()),(Object)(_codsucentidad));
 //BA.debugLineNum = 143;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(_nombre_entidad));
 //BA.debugLineNum = 145;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
parent._fila_encabezado.Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 //BA.debugLineNum = 146;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("CodFuncionario".toLowerCase()),parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
 //BA.debugLineNum = 147;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
parent._fila_encabezado.Put((Object)("NomFuncionario".toLowerCase()),parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
 //BA.debugLineNum = 149;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
parent._fila_encabezado.Put((Object)("Moneda_Doc".toLowerCase()),(Object)(_moneda_doc));
 //BA.debugLineNum = 150;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
parent._fila_encabezado.Put((Object)("TipoMoneda".toLowerCase()),(Object)(_tipomoneda));
 //BA.debugLineNum = 151;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
parent._fila_encabezado.Put((Object)("Valor_Dolar".toLowerCase()),(Object)(_valor_dolar));
 //BA.debugLineNum = 152;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
parent._fila_encabezado.Put((Object)("Tasadorig_Doc".toLowerCase()),(Object)(_tasadorig_doc));
 //BA.debugLineNum = 154;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
parent._fila_encabezado.Put((Object)("DocEn_Neto_Bruto".toLowerCase()),(Object)(_docen_neto_bruto));
 //BA.debugLineNum = 156;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
parent._fila_encabezado.Put((Object)("Centro_Costo".toLowerCase()),(Object)(_centro_costo));
 //BA.debugLineNum = 158;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
parent._fila_encabezado.Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 159;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
parent._fila_encabezado.Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 160;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
parent._fila_encabezado.Put((Object)("Nombre_Entidad_Fisica".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 161;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
parent._fila_encabezado.Put((Object)("Fun_Auto_Deuda_Ven".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 162;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
parent._fila_encabezado.Put((Object)("Fun_Auto_Stock_Ins".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 163;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
parent._fila_encabezado.Put((Object)("Fun_Auto_Cupo_Exe".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 164;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
parent._fila_encabezado.Put((Object)("SubTido".toLowerCase()),(Object)(""));
 //BA.debugLineNum = 167;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent._fila_idenc);
 //BA.debugLineNum = 169;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fal";
parent._sb_actualizar_datos_de_la_entidad(parent._row_entidad,parent.__c.False,parent.__c.False);
 //BA.debugLineNum = 171;BA.debugLine="If Idmaeedo <> 0 Then";
if (true) break;

case 9:
//if
this.state = 27;
if (parent._idmaeedo!=0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 173;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
parent.__c.ProgressDialogShow(parent.getActivityBA(),BA.ObjectToCharSequence("Buscando productos..."));
 //BA.debugLineNum = 175;BA.debugLine="Wait For(Sb_Traer_Encabezado) Complete (FEnc As";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_encabezado());
this.state = 28;
return;
case 28:
//C
this.state = 12;
_fenc = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 177;BA.debugLine="If FEnc.IsInitialized Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_fenc.IsInitialized()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 179;BA.debugLine="Fila_Encabezado.Put(\"empresa\",FEnc.Get(\"EMPRESA";
parent._fila_encabezado.Put((Object)("empresa"),_fenc.Get((Object)("EMPRESA")));
 //BA.debugLineNum = 180;BA.debugLine="Fila_Encabezado.Put(\"sucursal\",FEnc.Get(\"SUDO\")";
parent._fila_encabezado.Put((Object)("sucursal"),_fenc.Get((Object)("SUDO")));
 //BA.debugLineNum = 181;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",parent._fila_encabezado,parent._fila_idenc);
 //BA.debugLineNum = 183;BA.debugLine="Variables.Gl_Empresa = FEnc.Get(\"EMPRESA\")";
parent._variables._gl_empresa /*String*/  = BA.ObjectToString(_fenc.Get((Object)("EMPRESA")));
 //BA.debugLineNum = 184;BA.debugLine="Variables.Gl_Sucursal = FEnc.Get(\"SUDO\")";
parent._variables._gl_sucursal /*String*/  = BA.ObjectToString(_fenc.Get((Object)("SUDO")));
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 188;BA.debugLine="Wait For(Sb_Incorporar_Productos) Complete (Resu";
parent.__c.WaitFor("complete", ba, this, parent._sb_incorporar_productos());
this.state = 29;
return;
case 29:
//C
this.state = 16;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 190;BA.debugLine="Wait For(Sb_Traer_Observaciones) Complete (Flobs";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_observaciones());
this.state = 30;
return;
case 30:
//C
this.state = 16;
_flobs = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 192;BA.debugLine="If Flobs.IsInitialized Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_flobs.IsInitialized()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 193;BA.debugLine="Fila_Observaciones.Put(\"observaciones\",Flobs.Ge";
parent._fila_observaciones.Put((Object)("observaciones"),_flobs.Get((Object)("OBDO")));
 //BA.debugLineNum = 194;BA.debugLine="Fila_Observaciones.Put(\"orden_compra\",Flobs.Get";
parent._fila_observaciones.Put((Object)("orden_compra"),_flobs.Get((Object)("OCDO")));
 //BA.debugLineNum = 195;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observaci";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Observaciones_Doc",parent._fila_observaciones,parent._fila_idenc);
 if (true) break;
;
 //BA.debugLineNum = 199;BA.debugLine="If B4A_DespachoSimple Then";

case 19:
//if
this.state = 26;
if (_b4a_despachosimple) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 201;BA.debugLine="Wait For(Sb_Traer_Despacho_Simple) Complete (Fl";
parent.__c.WaitFor("complete", ba, this, parent._sb_traer_despacho_simple());
this.state = 31;
return;
case 31:
//C
this.state = 22;
_fldesp = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 203;BA.debugLine="If Fldesp.IsInitialized Then";
if (true) break;

case 22:
//if
this.state = 25;
if (_fldesp.IsInitialized()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 205;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\".ToLowerC";
parent._fila_despafacil.Put((Object)("CodTipoDespacho".toLowerCase()),_fldesp.Get((Object)("CodTipoDespacho")));
 //BA.debugLineNum = 206;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\".ToLowerCase";
parent._fila_despafacil.Put((Object)("TipoDespacho".toLowerCase()),_fldesp.Get((Object)("TipoDespacho")));
 //BA.debugLineNum = 208;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\".ToLowerC";
parent._fila_despafacil.Put((Object)("CodTipoPagoDesp".toLowerCase()),_fldesp.Get((Object)("CodTipoPagoDesp")));
 //BA.debugLineNum = 209;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\".ToLowerCase";
parent._fila_despafacil.Put((Object)("TipoPagoDesp".toLowerCase()),_fldesp.Get((Object)("TipoPagoDesp")));
 //BA.debugLineNum = 211;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\".ToLowerCas";
parent._fila_despafacil.Put((Object)("CodDocDestino".toLowerCase()),_fldesp.Get((Object)("CodDocDestino")));
 //BA.debugLineNum = 212;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\".ToLowerCase,F";
parent._fila_despafacil.Put((Object)("DocDestino".toLowerCase()),_fldesp.Get((Object)("DocDestino")));
 //BA.debugLineNum = 214;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\".ToLowerCa";
parent._fila_despafacil.Put((Object)("TransporteDesp".toLowerCase()),_fldesp.Get((Object)("TransporteDesp")));
 //BA.debugLineNum = 215;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\".ToLowerCas";
parent._fila_despafacil.Put((Object)("DireccionDesp".toLowerCase()),_fldesp.Get((Object)("DireccionDesp")));
 //BA.debugLineNum = 216;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\".ToLowe";
parent._fila_despafacil.Put((Object)("ObservacionesDesp".toLowerCase()),_fldesp.Get((Object)("ObservacionesDesp")));
 //BA.debugLineNum = 218;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFac";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"DespaFacil_Doc",parent._fila_despafacil,parent._fila_idenc);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 224;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 27:
//C
this.state = -1;
;
 //BA.debugLineNum = 227;BA.debugLine="Return Id_DocEnc";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._id_docenc));return;};
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sb_procesar_datos(String _cabeza,anywheresoftware.b4a.objects.collections.Map _fila) throws Exception{
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
 //BA.debugLineNum = 428;BA.debugLine="Sub Sb_Procesar_Datos(Cabeza As String, Fila As Ma";
 //BA.debugLineNum = 430;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(_fila.Get((Object)("untrans"))));
 //BA.debugLineNum = 431;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(_fila.Get((Object)("poriva"))));
 //BA.debugLineNum = 432;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(_fila.Get((Object)("porila"))));
 //BA.debugLineNum = 433;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(_fila.Get((Object)("rtu"))));
 //BA.debugLineNum = 435;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
 //BA.debugLineNum = 437;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
 //BA.debugLineNum = 438;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
 //BA.debugLineNum = 439;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
 //BA.debugLineNum = 440;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
 //BA.debugLineNum = 442;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
 //BA.debugLineNum = 443;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
 //BA.debugLineNum = 445;BA.debugLine="Dim Precio As Double = Fila.Get(\"precio\")";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)("precio"))));
 //BA.debugLineNum = 447;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
 //BA.debugLineNum = 448;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
 //BA.debugLineNum = 450;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
 //BA.debugLineNum = 451;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
 //BA.debugLineNum = 453;BA.debugLine="Dim Total As Double";
_total = 0;
 //BA.debugLineNum = 455;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
 //BA.debugLineNum = 457;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(_fila.Get((Object)("cantidad"))));
 //BA.debugLineNum = 458;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
 //BA.debugLineNum = 459;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
 //BA.debugLineNum = 461;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
_divisible = "";
 //BA.debugLineNum = 462;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
_divisible2 = "";
 //BA.debugLineNum = 464;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor"))));
 //BA.debugLineNum = 465;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
 //BA.debugLineNum = 466;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
 //BA.debugLineNum = 467;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(_fila.Get((Object)("descmaximo"))));
 //BA.debugLineNum = 469;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(_fila.Get((Object)("tict")));
 //BA.debugLineNum = 470;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(_fila.Get((Object)("prct")));
 //BA.debugLineNum = 471;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(_fila.Get((Object)("tipr")));
 //BA.debugLineNum = 473;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("codlista")));
 //BA.debugLineNum = 475;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
 //BA.debugLineNum = 477;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
 //BA.debugLineNum = 478;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
 //BA.debugLineNum = 480;BA.debugLine="If No_Aplica_Redondeo Then";
if (_no_aplica_redondeo) { 
 //BA.debugLineNum = 481;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = __c.False;
 };
 //BA.debugLineNum = 484;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
 //BA.debugLineNum = 485;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
 //BA.debugLineNum = 487;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
 //BA.debugLineNum = 488;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
 //BA.debugLineNum = 494;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor_anterior"))));
 //BA.debugLineNum = 495;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
 //BA.debugLineNum = 497;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (_cantidad==0 && (_tipr).equals("") == false) { 
 };
 //BA.debugLineNum = 504;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
 //BA.debugLineNum = 506;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("moneda_doc")));
 //BA.debugLineNum = 507;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
_tipo_moneda_enc = BA.ObjectToString(_fila_encabezado.Get((Object)("tipomoneda")));
 //BA.debugLineNum = 508;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(_fila_encabezado.Get((Object)("tasadorig_doc"))));
 //BA.debugLineNum = 510;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(_fila.Get((Object)("moneda")));
 //BA.debugLineNum = 511;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(_fila.Get((Object)("tipo_moneda")));
 //BA.debugLineNum = 512;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(_fila.Get((Object)("tipo_cambio"))));
 //BA.debugLineNum = 514;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
 //BA.debugLineNum = 516;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
 //BA.debugLineNum = 517;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if ((_tipo_moneda_enc).equals("N")) { 
 //BA.debugLineNum = 518;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = __c.Round2(_precio*_tipo_cambio_ent,(int) (2));
 }else {
 //BA.debugLineNum = 520;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = __c.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
 //BA.debugLineNum = 521;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 }else {
 //BA.debugLineNum = 524;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
 //BA.debugLineNum = 525;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 //BA.debugLineNum = 527;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 };
 //BA.debugLineNum = 532;BA.debugLine="Dim Divi As String";
_divi = "";
 //BA.debugLineNum = 534;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
 //BA.debugLineNum = 535;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 };
 //BA.debugLineNum = 538;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
 //BA.debugLineNum = 539;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 };
 //BA.debugLineNum = 542;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";
if (__c.Not(_funciones._fx_solo_enteros /*boolean*/ (getActivityBA(),_cantidad,_divi))) { 
 //BA.debugLineNum = 544;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
__c.Msgbox2(BA.ObjectToCharSequence("El producto solo permite cantidades enteras"),BA.ObjectToCharSequence("Validación"),"Ok","","",(android.graphics.Bitmap)(__c.Null),getActivityBA());
 //BA.debugLineNum = 545;BA.debugLine="Cantidad = 0";
_cantidad = 0;
 //BA.debugLineNum = 550;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 554;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
 //BA.debugLineNum = 555;BA.debugLine="If Rtu = 1 Then";
if (_rtu==1) { 
 //BA.debugLineNum = 556;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
 //BA.debugLineNum = 557;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 }else {
 //BA.debugLineNum = 559;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
 //BA.debugLineNum = 560;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 };
 };
 //BA.debugLineNum = 564;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
 //BA.debugLineNum = 565;BA.debugLine="If Rtu > 1 Then";
if (_rtu>1) { 
 //BA.debugLineNum = 566;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
 //BA.debugLineNum = 567;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 }else {
 //BA.debugLineNum = 569;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
 //BA.debugLineNum = 570;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 };
 };
 //BA.debugLineNum = 574;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
 //BA.debugLineNum = 584;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
_totalneto_calculo = _totalnetodoc;
 //BA.debugLineNum = 585;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
_totalbruto_calculo = _totalbrutodoc;
 //BA.debugLineNum = 587;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
 //BA.debugLineNum = 589;BA.debugLine="Descontar = True";
_descontar = __c.True;
 //BA.debugLineNum = 590;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
 //BA.debugLineNum = 590;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
 //BA.debugLineNum = 590;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
 //BA.debugLineNum = 591;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
 //BA.debugLineNum = 593;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
 //BA.debugLineNum = 595;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 596;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 598;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 600;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 602;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else if((_cabeza).equals("DescuentoValor")) { 
 //BA.debugLineNum = 607;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 609;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 612;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else if((_tict).equals("R")) { 
 //BA.debugLineNum = 619;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
 //BA.debugLineNum = 620;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(_fila.Get((Object)("recargovalor"))));
 //BA.debugLineNum = 622;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 623;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 }else {
 //BA.debugLineNum = 625;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = __c.Round2(_total_concepto/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 626;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 };
 //BA.debugLineNum = 629;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
 //BA.debugLineNum = 631;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
 //BA.debugLineNum = 632;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
 //BA.debugLineNum = 634;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
 //BA.debugLineNum = 636;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 638;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = __c.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 639;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = __c.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 641;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = __c.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
 //BA.debugLineNum = 642;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 }else {
 //BA.debugLineNum = 646;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 648;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = __c.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else if((_cabeza).equals("ValNetoLinea")) { 
 //BA.debugLineNum = 654;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
 //BA.debugLineNum = 655;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
 //BA.debugLineNum = 657;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 659;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = __c.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 }else {
 //BA.debugLineNum = 662;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = __c.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 };
 //BA.debugLineNum = 665;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 };
 //BA.debugLineNum = 669;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
 }else {
 //BA.debugLineNum = 685;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 686;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 }else {
 //BA.debugLineNum = 688;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = __c.Round2(_precio_calculado/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 689;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 };
 //BA.debugLineNum = 692;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = __c.Round2(_precioneto*_cantidad,(int) (3));
 //BA.debugLineNum = 693;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 695;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
 //BA.debugLineNum = 697;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
 //BA.debugLineNum = 698;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
 //BA.debugLineNum = 710;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
 //BA.debugLineNum = 711;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
 //BA.debugLineNum = 715;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
 //BA.debugLineNum = 717;BA.debugLine="If Precio > 0 Then";
if (_precio>0) { 
 //BA.debugLineNum = 719;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 721;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 723;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 727;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 729;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else if((_cabeza).equals("DescuentoValor")) { 
 //BA.debugLineNum = 737;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 739;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
 //BA.debugLineNum = 742;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 };
 //BA.debugLineNum = 750;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
 //BA.debugLineNum = 751;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
_fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
 //BA.debugLineNum = 752;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
_fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
 //BA.debugLineNum = 754;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
_fila.Put((Object)("DsctoRealPorc"),(Object)(0));
 //BA.debugLineNum = 755;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
_fila.Put((Object)("DsctoRealValor"),(Object)(0));
 //BA.debugLineNum = 765;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
 //BA.debugLineNum = 767;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
 //BA.debugLineNum = 768;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
 //BA.debugLineNum = 769;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
 //BA.debugLineNum = 771;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if ((_prct).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 773;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
 //BA.debugLineNum = 775;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 776;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 }else {
 //BA.debugLineNum = 778;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 };
 //BA.debugLineNum = 784;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
 //BA.debugLineNum = 785;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(_fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
 //BA.debugLineNum = 786;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = __c.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
 //BA.debugLineNum = 788;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
 //BA.debugLineNum = 790;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (_valor_dscto_real>0) { 
 //BA.debugLineNum = 791;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = __c.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 };
 //BA.debugLineNum = 798;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(_fila.Get((Object)("codfunautoriza")));
 //BA.debugLineNum = 800;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
 //BA.debugLineNum = 801;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
 //BA.debugLineNum = 803;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if ((_codfunautoriza).equals("xyz")) { 
_codfunautoriza = _funcionario;};
 //BA.debugLineNum = 805;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (_precio_cn_dscto<_precio_netolista) { 
 //BA.debugLineNum = 807;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
 //BA.debugLineNum = 809;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (_descmaximo==0) { 
_descmaximo = 0.5;};
 //BA.debugLineNum = 811;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (_dscto_real>_descmaximo) { 
 //BA.debugLineNum = 813;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = __c.True;
 //BA.debugLineNum = 815;BA.debugLine="If Vizado Then";
if (_vizado) { 
 //BA.debugLineNum = 816;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = __c.True;
 }else {
 //BA.debugLineNum = 821;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
 //BA.debugLineNum = 822;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
 //BA.debugLineNum = 830;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
 //BA.debugLineNum = 832;BA.debugLine="If Precio <> PrecioLista Then";
if (_precio!=_preciolista) { 
 //BA.debugLineNum = 833;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = __c.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 };
 //BA.debugLineNum = 836;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
if (_dscto_real>_valor_dscto) { 
 //BA.debugLineNum = 838;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = __c.CRLF+__c.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
 //BA.debugLineNum = 841;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = __c.False;
 }else {
 //BA.debugLineNum = 844;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
_codfunautoriza_dscto = _funcionario;
 //BA.debugLineNum = 846;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = __c.True;
 };
 };
 };
 };
 }else {
 //BA.debugLineNum = 868;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = __c.True;
 };
 //BA.debugLineNum = 874;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (_chkvalores) { 
 //BA.debugLineNum = 876;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 }else {
 //BA.debugLineNum = 880;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 };
 //BA.debugLineNum = 886;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (_chkvalores) { 
 //BA.debugLineNum = 888;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = __c.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 889;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 890;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 891;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int) (0));
 //BA.debugLineNum = 892;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
 //BA.debugLineNum = 894;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 //BA.debugLineNum = 896;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
 //BA.debugLineNum = 897;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
_preciobruto = __c.Round2(_precio*_impuestos,(int)(Double.parseDouble(_decimales)));
 //BA.debugLineNum = 899;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
 //BA.debugLineNum = 900;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = __c.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 };
 //BA.debugLineNum = 903;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
 //BA.debugLineNum = 905;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
 //BA.debugLineNum = 906;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 };
 }else {
 //BA.debugLineNum = 912;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = __c.Round2(_totalbruto/(double)_impuestos,(int) (5));
 //BA.debugLineNum = 913;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 914;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 915;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
 //BA.debugLineNum = 916;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 //BA.debugLineNum = 918;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
 //BA.debugLineNum = 919;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = __c.Round2(_precio/(double)_impuestos,(int) (3));
 //BA.debugLineNum = 921;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
 //BA.debugLineNum = 923;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
 //BA.debugLineNum = 924;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 };
 };
 //BA.debugLineNum = 931;BA.debugLine="If Descontar Then";
if (_descontar) { 
 //BA.debugLineNum = 933;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
 //BA.debugLineNum = 934;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 //BA.debugLineNum = 936;BA.debugLine="If Prct = 0 Then";
if ((_prct).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 938;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (_chkvalores) { 
 //BA.debugLineNum = 939;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 //BA.debugLineNum = 940;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 941;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 942;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int) (0));
 //BA.debugLineNum = 943;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
 //BA.debugLineNum = 944;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 }else {
 //BA.debugLineNum = 946;BA.debugLine="TotalBruto = DescuentoValor";
_totalbruto = _descuentovalor;
 //BA.debugLineNum = 947;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = __c.Round2(_totalbruto/(double)_impuestos,(int) (5));
 //BA.debugLineNum = 948;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
 //BA.debugLineNum = 949;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
 //BA.debugLineNum = 950;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
 //BA.debugLineNum = 951;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 };
 //BA.debugLineNum = 954;BA.debugLine="If TotalNeto > 0 Then";
if (_totalneto>0) { 
 //BA.debugLineNum = 956;BA.debugLine="TotalIla = TotalIla * -1";
_totalila = _totalila*-1;
 //BA.debugLineNum = 957;BA.debugLine="TotalIva = TotalIva * -1";
_totaliva = _totaliva*-1;
 //BA.debugLineNum = 958;BA.debugLine="TotalNeto = TotalNeto * -1";
_totalneto = _totalneto*-1;
 //BA.debugLineNum = 959;BA.debugLine="TotalBruto = TotalBruto * -1";
_totalbruto = _totalbruto*-1;
 //BA.debugLineNum = 960;BA.debugLine="Total = Total * -1";
_total = _total*-1;
 };
 };
 }else {
 //BA.debugLineNum = 968;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
 //BA.debugLineNum = 970;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = __c.Round2(_totalneto/(double)_cantud1,(int) (5));
 //BA.debugLineNum = 971;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = __c.Round2(_totalneto/(double)_cantud2,(int) (5));
 //BA.debugLineNum = 973;BA.debugLine="If ChkValores = False Then";
if (_chkvalores==__c.False) { 
 //BA.debugLineNum = 974;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 };
 }else {
 //BA.debugLineNum = 978;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
 //BA.debugLineNum = 979;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 };
 };
 //BA.debugLineNum = 984;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
 //BA.debugLineNum = 986;BA.debugLine="Dim Multiplo = 1";
_multiplo = BA.NumberToString(1);
 //BA.debugLineNum = 988;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
 //BA.debugLineNum = 989;BA.debugLine="Multiplo = -1";
_multiplo = BA.NumberToString(-1);
 }else if((_tict).equals("R")) { 
 //BA.debugLineNum = 991;BA.debugLine="Multiplo = 1";
_multiplo = BA.NumberToString(1);
 };
 //BA.debugLineNum = 994;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 996;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*(double)(Double.parseDouble(_multiplo));
 //BA.debugLineNum = 997;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 }else {
 //BA.debugLineNum = 1002;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*(double)(Double.parseDouble(_multiplo));
 //BA.debugLineNum = 1003;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 };
 };
 //BA.debugLineNum = 1046;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = __c.Round2(_totalila,(int) (2));
 //BA.debugLineNum = 1047;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = __c.Round2(_totaliva,(int) (2));
 //BA.debugLineNum = 1048;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = __c.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
 //BA.debugLineNum = 1049;BA.debugLine="TotalBruto = Round2(TotalBruto, Decimal)";
_totalbruto = __c.Round2(_totalbruto,(int)(Double.parseDouble(_decimal)));
 //BA.debugLineNum = 1057;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
_fila.Put((Object)("cantidad"),(Object)(_cantidad));
 //BA.debugLineNum = 1058;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
_fila.Put((Object)("cantud1"),(Object)(_cantud1));
 //BA.debugLineNum = 1059;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
_fila.Put((Object)("cantud2"),(Object)(_cantud2));
 //BA.debugLineNum = 1061;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
_fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
 //BA.debugLineNum = 1062;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
_fila.Put((Object)("valivalinea"),(Object)(_totaliva));
 //BA.debugLineNum = 1063;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
_fila.Put((Object)("valilalinea"),(Object)(_totalila));
 //BA.debugLineNum = 1064;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
_fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
 //BA.debugLineNum = 1066;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
_fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
 //BA.debugLineNum = 1067;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
_fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
 //BA.debugLineNum = 1069;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
_fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
 //BA.debugLineNum = 1070;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
_fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
 //BA.debugLineNum = 1075;BA.debugLine="Dim TipoValor As String";
_tipovalor = "";
 //BA.debugLineNum = 1077;BA.debugLine="If ChkValores Then";
if (_chkvalores) { 
 //BA.debugLineNum = 1079;BA.debugLine="TipoValor = \"N\"";
_tipovalor = "N";
 }else {
 //BA.debugLineNum = 1082;BA.debugLine="TipoValor = \"B\"";
_tipovalor = "B";
 };
 //BA.debugLineNum = 1085;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
_fila.Put((Object)("tipovalor"),(Object)(_tipovalor));
 //BA.debugLineNum = 1087;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
_precionetoud = _precioneto;
 //BA.debugLineNum = 1088;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
_preciobrutoud = _preciobruto;
 //BA.debugLineNum = 1090;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
_precionetoudlista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 //BA.debugLineNum = 1091;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
_preciobrutoudlista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 //BA.debugLineNum = 1093;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
_fila.Put((Object)("precionetoud"),(Object)(_precionetoud));
 //BA.debugLineNum = 1095;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
_fila.Put((Object)("preciobrutoud"),(Object)(_preciobrutoud));
 //BA.debugLineNum = 1098;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_concepto(String _concepto,String _empresa,String _sucursal,String _bodega,double _descuentoporc) throws Exception{
ResumableSub_Sb_Traer_Concepto rsub = new ResumableSub_Sb_Traer_Concepto(this,_concepto,_empresa,_sucursal,_bodega,_descuentoporc);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Concepto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Concepto(BaKapp.Movil.Tag.crear_documento parent,String _concepto,String _empresa,String _sucursal,String _bodega,double _descuentoporc) {
this.parent = parent;
this._concepto = _concepto;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this._descuentoporc = _descuentoporc;
}
BaKapp.Movil.Tag.crear_documento parent;
String _concepto;
String _empresa;
String _sucursal;
String _bodega;
double _descuentoporc;
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
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1467;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent._variables._gl_lista_precios /*String*/ ;
 //BA.debugLineNum = 1469;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_concepto,_empresa,_sucursal,_bodega,_lista,"");
 //BA.debugLineNum = 1471;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1474;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1476;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1478;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1480;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1481;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 1483;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
 //BA.debugLineNum = 1485;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("Moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 1486;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 1487;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Cambio"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 1488;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
 //BA.debugLineNum = 1490;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent._dbutils._insertmaps /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 1492;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
parent._consulta_sql = "Select * From Detalle_Doc Order by Id_DocDet Desc";
 //BA.debugLineNum = 1493;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1495;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
_id_docdet2 = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 1497;BA.debugLine="Return Id_DocDet2";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_id_docdet2));return;};
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1502;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("230670889",_js._errormessage /*String*/ ,0);
 //BA.debugLineNum = 1503;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),parent.__c.False);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1506;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 //BA.debugLineNum = 1508;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_descuentos(String _nulido) throws Exception{
ResumableSub_Sb_Traer_Descuentos rsub = new ResumableSub_Sb_Traer_Descuentos(this,_nulido);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Descuentos extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Descuentos(BaKapp.Movil.Tag.crear_documento parent,String _nulido) {
this.parent = parent;
this._nulido = _nulido;
}
BaKapp.Movil.Tag.crear_documento parent;
String _nulido;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _lista = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1512;BA.debugLine="Consulta_Sql = \"Select *,KODT As 'Kodt',PODT As '";
parent._consulta_sql = "Select *,KODT As 'Kodt',PODT As 'Dscto',VADT As 'Valor' From MAEDTLI Where IDMAEEDO = "+BA.NumberToString(parent._idmaeedo)+" And NULIDO = '"+_nulido+"' Order By IDMAEDTLI";
 //BA.debugLineNum = 1514;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 1515;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1517;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1519;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1521;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1527;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1529;BA.debugLine="Return Lista";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lista));return;};
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
 //BA.debugLineNum = 1535;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 //BA.debugLineNum = 1537;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_despacho_simple() throws Exception{
ResumableSub_Sb_Traer_Despacho_Simple rsub = new ResumableSub_Sb_Traer_Despacho_Simple(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Despacho_Simple extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Despacho_Simple(BaKapp.Movil.Tag.crear_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.crear_documento parent;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1732;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
parent._consulta_sql = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_Despacho_Simple Where Idmaeedo = "+BA.NumberToString(parent._idmaeedo);
 //BA.debugLineNum = 1734;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1735;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 1737;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 //BA.debugLineNum = 1739;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1741;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1743;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1745;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1747;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1748;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1753;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("230998551",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1756;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
 //BA.debugLineNum = 1758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_encabezado() throws Exception{
ResumableSub_Sb_Traer_Encabezado rsub = new ResumableSub_Sb_Traer_Encabezado(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Encabezado extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Encabezado(BaKapp.Movil.Tag.crear_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.crear_documento parent;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1672;BA.debugLine="Consulta_Sql = \"Select * From MAEEDO Where IDMAEE";
parent._consulta_sql = "Select * From MAEEDO Where IDMAEEDO = "+BA.NumberToString(parent._idmaeedo);
 //BA.debugLineNum = 1674;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1675;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 1677;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 //BA.debugLineNum = 1679;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1681;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1683;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1685;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1687;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1688;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1693;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("230867479",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1696;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
 //BA.debugLineNum = 1698;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_entidad(String _koen,String _suen) throws Exception{
ResumableSub_Sb_Traer_Entidad rsub = new ResumableSub_Sb_Traer_Entidad(this,_koen,_suen);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Entidad(BaKapp.Movil.Tag.crear_documento parent,String _koen,String _suen) {
this.parent = parent;
this._koen = _koen;
this._suen = _suen;
}
BaKapp.Movil.Tag.crear_documento parent;
String _koen;
String _suen;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1102;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1103;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_koen,_suen);
 //BA.debugLineNum = 1105;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 //BA.debugLineNum = 1107;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1109;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1111;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1113;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1115;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1116;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 1118;BA.debugLine="Row_Entidad = Fila";
parent._row_entidad = _fila;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1123;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("230408727",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1126;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
 //BA.debugLineNum = 1128;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_observaciones() throws Exception{
ResumableSub_Sb_Traer_Observaciones rsub = new ResumableSub_Sb_Traer_Observaciones(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Observaciones extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Observaciones(BaKapp.Movil.Tag.crear_documento parent) {
this.parent = parent;
}
BaKapp.Movil.Tag.crear_documento parent;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1702;BA.debugLine="Consulta_Sql = \"Select * From MAEEDOOB Where IDMA";
parent._consulta_sql = "Select * From MAEEDOOB Where IDMAEEDO = "+BA.NumberToString(parent._idmaeedo);
 //BA.debugLineNum = 1704;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1705;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent._consulta_sql,parent);
 //BA.debugLineNum = 1707;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
 //BA.debugLineNum = 1709;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1711;BA.debugLine="If Js.Success Then";
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
 //BA.debugLineNum = 1713;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1715;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
 //BA.debugLineNum = 1717;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1718;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1723;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("230933015",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1726;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
 //BA.debugLineNum = 1728;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_producto(String _codigo,String _empresa,String _sucursal,String _bodega) throws Exception{
ResumableSub_Sb_Traer_Producto rsub = new ResumableSub_Sb_Traer_Producto(this,_codigo,_empresa,_sucursal,_bodega);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Producto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Producto(BaKapp.Movil.Tag.crear_documento parent,String _codigo,String _empresa,String _sucursal,String _bodega) {
this.parent = parent;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
}
BaKapp.Movil.Tag.crear_documento parent;
String _codigo;
String _empresa;
String _sucursal;
String _bodega;
String _lista = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _fila = null;
String _errorstr = "";
anywheresoftware.b4a.objects.collections.Map _new_row = null;
int _id_docdet = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1398;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 1400;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
 //BA.debugLineNum = 1402;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1404;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1406;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1408;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1410;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1411;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 1413;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Error\")";
_errorstr = BA.ObjectToString(_fila.Get((Object)("Error")));
 //BA.debugLineNum = 1415;BA.debugLine="If ErrorStr = Null Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_errorstr== null) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1421;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(parent._id_docenc));
 //BA.debugLineNum = 1423;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
 //BA.debugLineNum = 1424;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
 //BA.debugLineNum = 1425;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_cambio"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
 //BA.debugLineNum = 1427;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent._dbutils._insertmaps /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
 //BA.debugLineNum = 1429;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
parent._consulta_sql = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(parent._id_docenc)+" Order by Id_DocDet Desc";
 //BA.debugLineNum = 1430;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,parent._consulta_sql,(String[])(parent.__c.Null));
 //BA.debugLineNum = 1432;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
 //BA.debugLineNum = 1442;BA.debugLine="Return Id_DocDet'Fila_Id";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_id_docdet));return;};
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 1457;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 //BA.debugLineNum = 1459;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_producto2(String _codigo,String _empresa,String _sucursal,String _bodega) throws Exception{
ResumableSub_Sb_Traer_Producto2 rsub = new ResumableSub_Sb_Traer_Producto2(this,_codigo,_empresa,_sucursal,_bodega);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Producto2 extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Producto2(BaKapp.Movil.Tag.crear_documento parent,String _codigo,String _empresa,String _sucursal,String _bodega) {
this.parent = parent;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
}
BaKapp.Movil.Tag.crear_documento parent;
String _codigo;
String _empresa;
String _sucursal;
String _bodega;
String _lista = "";
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;
anywheresoftware.b4a.objects.collections.Map _rfila = null;
String _errorstr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1362;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(parent._fila_encabezado.Get((Object)("ListaPrecios".toLowerCase())));
 //BA.debugLineNum = 1364;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
 //BA.debugLineNum = 1366;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[0];
;
 //BA.debugLineNum = 1368;BA.debugLine="If Js.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_js._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1370;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ ();
 //BA.debugLineNum = 1372;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_vjson).equals(("{\"Table\":[]}")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1374;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ ());
 //BA.debugLineNum = 1375;BA.debugLine="Dim RFila As Map = Filas.Get(0)";
_rfila = new anywheresoftware.b4a.objects.collections.Map();
_rfila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
 //BA.debugLineNum = 1377;BA.debugLine="Dim ErrorStr As String =RFila.Get(\"Error\")";
_errorstr = BA.ObjectToString(_rfila.Get((Object)("Error")));
 //BA.debugLineNum = 1379;BA.debugLine="If ErrorStr = Null Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_errorstr== null) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1380;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 1386;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 1389;BA.debugLine="Return RFila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rfila));return;};
 //BA.debugLineNum = 1391;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
