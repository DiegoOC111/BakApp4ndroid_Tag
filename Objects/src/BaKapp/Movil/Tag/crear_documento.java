package BaKapp.Movil.Tag;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class crear_documento extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "BaKapp.Movil.Tag.crear_documento");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public String  _class_globals(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crear_documento";
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Public Idmaeedo As Int";
_idmaeedo = 0;
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Public Id_DocEnc As Int";
_id_docenc = 0;
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Public Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Public Fila_Encabezado As Map";
_fila_encabezado = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Public Fila_Observaciones As Map";
_fila_observaciones = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Public Fila_DespaFacil As Map";
_fila_despafacil = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="Public Cambiar_Entidad As Boolean";
_cambiar_entidad = false;
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="Public Crear_NVV_Desde_COV As Boolean";
_crear_nvv_desde_cov = false;
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="Public Usar_Precio_Original As Boolean";
_usar_precio_original = false;
RDebugUtils.currentLine=8257551;
 //BA.debugLineNum = 8257551;BA.debugLine="Private Fila_IdEnc As Map";
_fila_idenc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="Public ChkValores As Boolean";
_chkvalores = false;
RDebugUtils.currentLine=8257554;
 //BA.debugLineNum = 8257554;BA.debugLine="Dim FUNCIONARIO As String '= Variables.Global_Row";
_funcionario = "";
RDebugUtils.currentLine=8257556;
 //BA.debugLineNum = 8257556;BA.debugLine="Dim TotalNetoDoc As Double";
_totalnetodoc = 0;
RDebugUtils.currentLine=8257557;
 //BA.debugLineNum = 8257557;BA.debugLine="Dim TotalBrutoDoc As Double";
_totalbrutodoc = 0;
RDebugUtils.currentLine=8257559;
 //BA.debugLineNum = 8257559;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=8257561;
 //BA.debugLineNum = 8257561;BA.debugLine="End Sub";
return "";
}
public String  _initialize(BaKapp.Movil.Tag.crear_documento __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
__ref._funcionario /*String*/  = BA.ObjectToString(_variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="End Sub";
return "";
}
public String  _sb_actualizar_datos_de_la_entidad(BaKapp.Movil.Tag.crear_documento __ref,anywheresoftware.b4a.objects.collections.Map _rowentidad,boolean _revisar_permiso_lista_precio,boolean _aplicar_venciminetos) throws Exception{
__ref = this;
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_actualizar_datos_de_la_entidad", false))
	 {return ((String) Debug.delegate(ba, "sb_actualizar_datos_de_la_entidad", new Object[] {_rowentidad,_revisar_permiso_lista_precio,_aplicar_venciminetos}));}
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
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Sb_Actualizar_Datos_De_La_Entidad(RowEntidad A";
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = __c.DateTime.getNow();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="Dim Cuotas As Int = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="Dim Forma_pago As String";
_forma_pago = "";
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8454162;
 //BA.debugLineNum = 8454162;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="Dim Lista As String";
_lista = "";
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="Dim Permiso As String";
_permiso = "";
RDebugUtils.currentLine=8454167;
 //BA.debugLineNum = 8454167;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
_listaprecios = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=8454168;
 //BA.debugLineNum = 8454168;BA.debugLine="Lista = ListaPrecios";
_lista = _listaprecios;
RDebugUtils.currentLine=8454170;
 //BA.debugLineNum = 8454170;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
_cuotas = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("NUVECR"))));
RDebugUtils.currentLine=8454171;
 //BA.debugLineNum = 8454171;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
_dias_1er_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIPRVE"))));
RDebugUtils.currentLine=8454172;
 //BA.debugLineNum = 8454172;BA.debugLine="Dias_Vencimiento = RowEntidad.Get(\"DIASVENCI\")";
_dias_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIASVENCI"))));
RDebugUtils.currentLine=8454174;
 //BA.debugLineNum = 8454174;BA.debugLine="Dim Rut As String";
_rut = "";
RDebugUtils.currentLine=8454176;
 //BA.debugLineNum = 8454176;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidad".toLowerCase()),_rowentidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=8454177;
 //BA.debugLineNum = 8454177;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidad".toLowerCase()),_rowentidad.Get((Object)("SUEN")));
RDebugUtils.currentLine=8454178;
 //BA.debugLineNum = 8454178;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad".toLowerCase()),_rowentidad.Get((Object)("NOKOEN")));
RDebugUtils.currentLine=8454187;
 //BA.debugLineNum = 8454187;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
_lista = BA.ObjectToString(_rowentidad.Get((Object)("LVEN")));
RDebugUtils.currentLine=8454188;
 //BA.debugLineNum = 8454188;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
_lista = _funciones._mid /*String*/ (getActivityBA(),_lista,(int) (6),(int) (3));
RDebugUtils.currentLine=8454190;
 //BA.debugLineNum = 8454190;BA.debugLine="Permiso = \"Lp-\" & Lista";
_permiso = "Lp-"+_lista;
RDebugUtils.currentLine=8454195;
 //BA.debugLineNum = 8454195;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
if (_cuotas==0) { 
_cuotas = (int) (1);};
RDebugUtils.currentLine=8454197;
 //BA.debugLineNum = 8454197;BA.debugLine="Dim Cuotas_F(Cuotas - 1) As Long";
_cuotas_f = new long[(int) (_cuotas-1)];
;
RDebugUtils.currentLine=8454199;
 //BA.debugLineNum = 8454199;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
if (__c.Not(_aplicar_venciminetos)) { 
RDebugUtils.currentLine=8454200;
 //BA.debugLineNum = 8454200;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 };
RDebugUtils.currentLine=8454203;
 //BA.debugLineNum = 8454203;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (_dias_1er_vencimiento>0) { 
RDebugUtils.currentLine=8454210;
 //BA.debugLineNum = 8454210;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=8454211;
 //BA.debugLineNum = 8454211;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=8454217;
 //BA.debugLineNum = 8454217;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
_fechasvenci = _fechaemision;
RDebugUtils.currentLine=8454218;
 //BA.debugLineNum = 8454218;BA.debugLine="Dim dias As Int";
_dias = 0;
RDebugUtils.currentLine=8454220;
 //BA.debugLineNum = 8454220;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (_dias_1er_vencimiento>0) { 
RDebugUtils.currentLine=8454221;
 //BA.debugLineNum = 8454221;BA.debugLine="dias = Dias_1er_Vencimiento";
_dias = _dias_1er_vencimiento;
RDebugUtils.currentLine=8454222;
 //BA.debugLineNum = 8454222;BA.debugLine="For i = 1 To Cuotas";
{
final int step40 = 1;
final int limit40 = _cuotas;
_i = (int) (1) ;
for (;_i <= limit40 ;_i = _i + step40 ) {
RDebugUtils.currentLine=8454225;
 //BA.debugLineNum = 8454225;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
_fechasvenci = __c.DateTime.Add(_fechasvenci,(int) (0),(int) (0),_dias);
RDebugUtils.currentLine=8454227;
 //BA.debugLineNum = 8454227;BA.debugLine="Cuotas_F(i - 1) = FechasVenci";
_cuotas_f[(int) (_i-1)] = _fechasvenci;
RDebugUtils.currentLine=8454228;
 //BA.debugLineNum = 8454228;BA.debugLine="dias = Dias_Vencimiento";
_dias = _dias_vencimiento;
 }
};
RDebugUtils.currentLine=8454230;
 //BA.debugLineNum = 8454230;BA.debugLine="FechaUltVencimiento = FechasVenci";
_fechaultvencimiento = _fechasvenci;
 }else {
RDebugUtils.currentLine=8454232;
 //BA.debugLineNum = 8454232;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
 };
RDebugUtils.currentLine=8454235;
 //BA.debugLineNum = 8454235;BA.debugLine="Fecha_1er_Vencimiento = Cuotas_F(0)";
_fecha_1er_vencimiento = _cuotas_f[(int) (0)];
 }else {
RDebugUtils.currentLine=8454252;
 //BA.debugLineNum = 8454252;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=8454253;
 //BA.debugLineNum = 8454253;BA.debugLine="FechaUltVencimiento = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=8454254;
 //BA.debugLineNum = 8454254;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=8454255;
 //BA.debugLineNum = 8454255;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=8454256;
 //BA.debugLineNum = 8454256;BA.debugLine="Dias_Vencimiento = 0";
_dias_vencimiento = (int) (0);
 };
RDebugUtils.currentLine=8454260;
 //BA.debugLineNum = 8454260;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
_forma_pago = BA.ObjectToString(_rowentidad.Get((Object)("CPEN")));
RDebugUtils.currentLine=8454262;
 //BA.debugLineNum = 8454262;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=8454263;
 //BA.debugLineNum = 8454263;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=8454264;
 //BA.debugLineNum = 8454264;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=8454265;
 //BA.debugLineNum = 8454265;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=8454267;
 //BA.debugLineNum = 8454267;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Cuotas"),(Object)(_cuotas));
RDebugUtils.currentLine=8454268;
 //BA.debugLineNum = 8454268;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_1er_Vencimiento"),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=8454269;
 //BA.debugLineNum = 8454269;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_Vencimiento"),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=8454270;
 //BA.debugLineNum = 8454270;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Forma_pago"),(Object)(_forma_pago));
RDebugUtils.currentLine=8454272;
 //BA.debugLineNum = 8454272;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
if (_revisar_permiso_lista_precio) { 
RDebugUtils.currentLine=8454274;
 //BA.debugLineNum = 8454274;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean '= TienePermi";
_tiene_permiso_lista = false;
RDebugUtils.currentLine=8454275;
 //BA.debugLineNum = 8454275;BA.debugLine="Dim Cambiar_lista As Boolean";
_cambiar_lista = false;
RDebugUtils.currentLine=8454276;
 //BA.debugLineNum = 8454276;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
_mostrar_mensaje_cambio_lista = false;
RDebugUtils.currentLine=8454279;
 //BA.debugLineNum = 8454279;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
{
final int step70 = 1;
final int limit70 = (int) (_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
RDebugUtils.currentLine=8454280;
 //BA.debugLineNum = 8454280;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=8454281;
 //BA.debugLineNum = 8454281;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
_value = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=8454283;
 //BA.debugLineNum = 8454283;BA.debugLine="If Lista = value Then";
if ((_lista).equals(_value)) { 
RDebugUtils.currentLine=8454284;
 //BA.debugLineNum = 8454284;BA.debugLine="Tiene_Permiso_Lista = True";
_tiene_permiso_lista = __c.True;
RDebugUtils.currentLine=8454285;
 //BA.debugLineNum = 8454285;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=8454290;
 //BA.debugLineNum = 8454290;BA.debugLine="If Tiene_Permiso_Lista Then";
if (_tiene_permiso_lista) { 
RDebugUtils.currentLine=8454291;
 //BA.debugLineNum = 8454291;BA.debugLine="Cambiar_lista = True";
_cambiar_lista = __c.True;
 }else {
RDebugUtils.currentLine=8454294;
 //BA.debugLineNum = 8454294;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=8454296;
 //BA.debugLineNum = 8454296;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __c.LoadBitmap(__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=8454298;
 //BA.debugLineNum = 8454298;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
__c.Msgbox2Async(BA.ObjectToCharSequence("Usted no tiene permiso para trabajar con la lista"+__c.CRLF+"La lista seguirá siendo:"+_listaprecios),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,__c.False);
 };
RDebugUtils.currentLine=8454304;
 //BA.debugLineNum = 8454304;BA.debugLine="If Cambiar_lista Then";
if (_cambiar_lista) { 
RDebugUtils.currentLine=8454305;
 //BA.debugLineNum = 8454305;BA.debugLine="ListaPrecios = Lista";
_listaprecios = _lista;
RDebugUtils.currentLine=8454306;
 //BA.debugLineNum = 8454306;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 };
 };
RDebugUtils.currentLine=8454311;
 //BA.debugLineNum = 8454311;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
{
final int step90 = 1;
final int limit90 = (int) (_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit90 ;_i = _i + step90 ) {
RDebugUtils.currentLine=8454313;
 //BA.debugLineNum = 8454313;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=8454314;
 //BA.debugLineNum = 8454314;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=8454315;
 //BA.debugLineNum = 8454315;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
RDebugUtils.currentLine=8454317;
 //BA.debugLineNum = 8454317;BA.debugLine="If Lista = Kolt Then";
if ((_lista).equals(_kolt)) { 
RDebugUtils.currentLine=8454319;
 //BA.debugLineNum = 8454319;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=8454326;
 //BA.debugLineNum = 8454326;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
_bloqueado = BA.ObjectToBoolean(_rowentidad.Get((Object)("BLOQUEADO")));
RDebugUtils.currentLine=8454328;
 //BA.debugLineNum = 8454328;BA.debugLine="If Bloqueado Then";
if (_bloqueado) { 
RDebugUtils.currentLine=8454330;
 //BA.debugLineNum = 8454330;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=8454332;
 //BA.debugLineNum = 8454332;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __c.LoadBitmap(__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=8454334;
 //BA.debugLineNum = 8454334;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
__c.Msgbox2Async(BA.ObjectToCharSequence("¡CLIENTE BLOQUEADO!"+__c.CRLF+"LSolo es posible generar cotizaciones"),BA.ObjectToCharSequence("CLIENTE MOROSO"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,__c.False);
 };
RDebugUtils.currentLine=8454339;
 //BA.debugLineNum = 8454339;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_incorporar_productos(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_incorporar_productos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_incorporar_productos", null));}
ResumableSub_Sb_Incorporar_Productos rsub = new ResumableSub_Sb_Incorporar_Productos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Incorporar_Productos extends BA.ResumableSub {
public ResumableSub_Sb_Incorporar_Productos(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
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
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim CampoPrecio As String";
_campoprecio = "";
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Consulta_Sql = \"Select * From MAEDDO Where IDMAEE";
__ref._consulta_sql /*String*/  = "Select * From MAEDDO Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ )+" Order By IDMAEDDO";
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="ChkValores = True";
__ref._chkvalores /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="If ChkValores Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._chkvalores /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="CampoPrecio = \"PPPRNE\"";
_campoprecio = "PPPRNE";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="CampoPrecio = \"PPPRBR\"";
_campoprecio = "PPPRBR";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="Consulta_Sql = \"Select MAEDDO.*,Case WHEN UDTRPR";
__ref._consulta_sql /*String*/  = "Select MAEDDO.*,Case WHEN UDTRPR = 1 Then CAPRCO1-CAPREX1 Else CAPRCO2-CAPREX2 END AS 'Cantidad',"+parent.__c.CRLF+"CAPRCO1-CAPREX1 As 'CantUd1_Dori',CAPRCO2-CAPREX2 AS 'CantUd2_Dori',"+parent.__c.CRLF+"Case WHEN UDTRPR = 1 Then "+_campoprecio+" Else "+_campoprecio+"*RLUDPR END AS 'Precio'"+parent.__c.CRLF+"From MAEDDO WITH ( NOLOCK )"+parent.__c.CRLF+"Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ )+" And ( ESLIDO<>'C' OR ESFALI='I')"+parent.__c.CRLF+"Order by IDMAEDDO";
RDebugUtils.currentLine=8650777;
 //BA.debugLineNum = 8650777;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=8650778;
 //BA.debugLineNum = 8650778;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), (Object)(_js));
this.state = 52;
return;
case 52:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=8650780;
 //BA.debugLineNum = 8650780;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=8650782;
 //BA.debugLineNum = 8650782;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=8650784;
 //BA.debugLineNum = 8650784;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=8650786;
 //BA.debugLineNum = 8650786;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=8650788;
 //BA.debugLineNum = 8650788;BA.debugLine="For Each Fila As Map In Lista";
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
RDebugUtils.currentLine=8650790;
 //BA.debugLineNum = 8650790;BA.debugLine="Dim Codigo As String = Fila.Get(\"KOPRCT\")";
_codigo = BA.ObjectToString(_fila.Get((Object)("KOPRCT")));
RDebugUtils.currentLine=8650791;
 //BA.debugLineNum = 8650791;BA.debugLine="Dim Descripcion As String = Fila.Get(\"NOKOPR\")";
_descripcion = BA.ObjectToString(_fila.Get((Object)("NOKOPR")));
RDebugUtils.currentLine=8650792;
 //BA.debugLineNum = 8650792;BA.debugLine="Dim Prct As Boolean = Fila.Get(\"PRCT\")";
_prct = BA.ObjectToBoolean(_fila.Get((Object)("PRCT")));
RDebugUtils.currentLine=8650793;
 //BA.debugLineNum = 8650793;BA.debugLine="Dim Tict As String = Fila.Get(\"TICT\")";
_tict = BA.ObjectToString(_fila.Get((Object)("TICT")));
RDebugUtils.currentLine=8650794;
 //BA.debugLineNum = 8650794;BA.debugLine="Dim Nulido As String = Fila.Get(\"NULIDO\")";
_nulido = BA.ObjectToString(_fila.Get((Object)("NULIDO")));
RDebugUtils.currentLine=8650795;
 //BA.debugLineNum = 8650795;BA.debugLine="Dim Podtglli As Double = Fila.Get(\"PODTGLLI\")";
_podtglli = (double)(BA.ObjectToNumber(_fila.Get((Object)("PODTGLLI"))));
RDebugUtils.currentLine=8650796;
 //BA.debugLineNum = 8650796;BA.debugLine="Dim Rludpr As Double = Fila.Get(\"RLUDPR\")";
_rludpr = (double)(BA.ObjectToNumber(_fila.Get((Object)("RLUDPR"))));
RDebugUtils.currentLine=8650797;
 //BA.debugLineNum = 8650797;BA.debugLine="Dim Udtpr As Int = Fila.Get(\"UDTRPR\")";
_udtpr = (int)(BA.ObjectToNumber(_fila.Get((Object)("UDTRPR"))));
RDebugUtils.currentLine=8650798;
 //BA.debugLineNum = 8650798;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"Cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(_fila.Get((Object)("Cantidad"))));
RDebugUtils.currentLine=8650799;
 //BA.debugLineNum = 8650799;BA.debugLine="Dim Vaneli As Double = Fila.Get(\"VANELI\")";
_vaneli = (double)(BA.ObjectToNumber(_fila.Get((Object)("VANELI"))));
RDebugUtils.currentLine=8650800;
 //BA.debugLineNum = 8650800;BA.debugLine="Dim Vabrdo As Double = Fila.Get(\"VABRLI\")";
_vabrdo = (double)(BA.ObjectToNumber(_fila.Get((Object)("VABRLI"))));
RDebugUtils.currentLine=8650802;
 //BA.debugLineNum = 8650802;BA.debugLine="Dim CodFuncionario As String = Fila.Get(\"KOFUL";
_codfuncionario = BA.ObjectToString(_fila.Get((Object)("KOFULIDO")));
RDebugUtils.currentLine=8650803;
 //BA.debugLineNum = 8650803;BA.debugLine="Dim Codlista As String = Fila.Get(\"KOLTPR\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("KOLTPR")));
RDebugUtils.currentLine=8650804;
 //BA.debugLineNum = 8650804;BA.debugLine="Codlista = Codlista.Replace(\"TABPP\",\"\")";
_codlista = _codlista.replace("TABPP","");
RDebugUtils.currentLine=8650805;
 //BA.debugLineNum = 8650805;BA.debugLine="Dim Moneda As String = Fila.Get(\"MOPPPR\")";
_moneda = BA.ObjectToString(_fila.Get((Object)("MOPPPR")));
RDebugUtils.currentLine=8650806;
 //BA.debugLineNum = 8650806;BA.debugLine="Dim Tipo_moneda As String = Fila.Get(\"TIMOPPPR";
_tipo_moneda = BA.ObjectToString(_fila.Get((Object)("TIMOPPPR")));
RDebugUtils.currentLine=8650807;
 //BA.debugLineNum = 8650807;BA.debugLine="Dim Tipo_cambio As Double = Fila.Get(\"TAMOPPPR";
_tipo_cambio = (double)(BA.ObjectToNumber(_fila.Get((Object)("TAMOPPPR"))));
RDebugUtils.currentLine=8650809;
 //BA.debugLineNum = 8650809;BA.debugLine="Dim Idmaeedo_Dori As Int = Fila.Get(\"IDMAEEDO\"";
_idmaeedo_dori = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=8650810;
 //BA.debugLineNum = 8650810;BA.debugLine="Dim Idmaeddo_Dori As Int = Fila.Get(\"IDMAEDDO\"";
_idmaeddo_dori = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEDDO"))));
RDebugUtils.currentLine=8650812;
 //BA.debugLineNum = 8650812;BA.debugLine="Dim Empresa As String = Fila.Get(\"EMPRESA\")";
_empresa = BA.ObjectToString(_fila.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=8650813;
 //BA.debugLineNum = 8650813;BA.debugLine="Dim Sucursal As String = Fila.Get(\"SULIDO\")";
_sucursal = BA.ObjectToString(_fila.Get((Object)("SULIDO")));
RDebugUtils.currentLine=8650814;
 //BA.debugLineNum = 8650814;BA.debugLine="Dim Bodega As String = Fila.Get(\"BOSULIDO\")";
_bodega = BA.ObjectToString(_fila.Get((Object)("BOSULIDO")));
RDebugUtils.currentLine=8650816;
 //BA.debugLineNum = 8650816;BA.debugLine="Variables.Gl_Bodega = Bodega";
parent._variables._gl_bodega /*String*/  = _bodega;
RDebugUtils.currentLine=8650818;
 //BA.debugLineNum = 8650818;BA.debugLine="Dim Emprepa As String = Fila.Get(\"EMPRESA\")";
_emprepa = BA.ObjectToString(_fila.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=8650819;
 //BA.debugLineNum = 8650819;BA.debugLine="Dim Tidopa As String = Fila.Get(\"TIDO\")";
_tidopa = BA.ObjectToString(_fila.Get((Object)("TIDO")));
RDebugUtils.currentLine=8650820;
 //BA.debugLineNum = 8650820;BA.debugLine="Dim Nudopa As String = Fila.Get(\"NUDO\")";
_nudopa = BA.ObjectToString(_fila.Get((Object)("NUDO")));
RDebugUtils.currentLine=8650821;
 //BA.debugLineNum = 8650821;BA.debugLine="Dim Endopa As String = Fila.Get(\"ENDO\")";
_endopa = BA.ObjectToString(_fila.Get((Object)("ENDO")));
RDebugUtils.currentLine=8650822;
 //BA.debugLineNum = 8650822;BA.debugLine="Dim Nulidopa As String = Fila.Get(\"NULIDO\")";
_nulidopa = BA.ObjectToString(_fila.Get((Object)("NULIDO")));
RDebugUtils.currentLine=8650824;
 //BA.debugLineNum = 8650824;BA.debugLine="Dim CantUd1_Dori As Double = Fila.Get(\"CantUd1";
_cantud1_dori = (double)(BA.ObjectToNumber(_fila.Get((Object)("CantUd1_Dori"))));
RDebugUtils.currentLine=8650825;
 //BA.debugLineNum = 8650825;BA.debugLine="Dim CantUd2_Dori As Double = Fila.Get(\"CantUd2";
_cantud2_dori = (double)(BA.ObjectToNumber(_fila.Get((Object)("CantUd2_Dori"))));
RDebugUtils.currentLine=8650827;
 //BA.debugLineNum = 8650827;BA.debugLine="Dim Precio As Double = Fila.Get(\"Precio\")";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)("Precio"))));
RDebugUtils.currentLine=8650829;
 //BA.debugLineNum = 8650829;BA.debugLine="If Usar_Precio_Original And Not(Prct) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._usar_precio_original /*boolean*/  && parent.__c.Not(_prct)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=8650830;
 //BA.debugLineNum = 8650830;BA.debugLine="Wait For(Sb_Traer_Producto2(Codigo,Empresa,Su";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_producto2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigo,_empresa,_sucursal,_bodega));
this.state = 55;
return;
case 55:
//C
this.state = 19;
_rowproducto = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8650831;
 //BA.debugLineNum = 8650831;BA.debugLine="Precio = RowProducto.Get(\"Precio\")";
_precio = (double)(BA.ObjectToNumber(_rowproducto.Get((Object)("Precio"))));
 if (true) break;
;
RDebugUtils.currentLine=8650834;
 //BA.debugLineNum = 8650834;BA.debugLine="If Crear_NVV_Desde_COV = False Then";

case 19:
//if
this.state = 22;
if (__ref._crear_nvv_desde_cov /*boolean*/ ==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=8650836;
 //BA.debugLineNum = 8650836;BA.debugLine="Idmaeedo_Dori = 0";
_idmaeedo_dori = (int) (0);
RDebugUtils.currentLine=8650837;
 //BA.debugLineNum = 8650837;BA.debugLine="Idmaeddo_Dori = 0";
_idmaeddo_dori = (int) (0);
RDebugUtils.currentLine=8650838;
 //BA.debugLineNum = 8650838;BA.debugLine="Emprepa = \"\"";
_emprepa = "";
RDebugUtils.currentLine=8650839;
 //BA.debugLineNum = 8650839;BA.debugLine="Tidopa = \"\"";
_tidopa = "";
RDebugUtils.currentLine=8650840;
 //BA.debugLineNum = 8650840;BA.debugLine="Nudopa = \"\"";
_nudopa = "";
RDebugUtils.currentLine=8650841;
 //BA.debugLineNum = 8650841;BA.debugLine="Endopa = \"\"";
_endopa = "";
RDebugUtils.currentLine=8650842;
 //BA.debugLineNum = 8650842;BA.debugLine="Nulidopa = \"\"";
_nulidopa = "";
 if (true) break;
;
RDebugUtils.currentLine=8650846;
 //BA.debugLineNum = 8650846;BA.debugLine="If Udtpr = 2 Then";

case 22:
//if
this.state = 25;
if (_udtpr==2) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=8650847;
 //BA.debugLineNum = 8650847;BA.debugLine="Precio = Precio*Rludpr";
_precio = _precio*_rludpr;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=8650850;
 //BA.debugLineNum = 8650850;BA.debugLine="ProgressDialogShow(Codigo & \"-\" & Descripcion)";
parent.__c.ProgressDialogShow(parent.getActivityBA(),BA.ObjectToCharSequence(_codigo+"-"+_descripcion));
RDebugUtils.currentLine=8650852;
 //BA.debugLineNum = 8650852;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=8650855;
 //BA.debugLineNum = 8650855;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=8650857;
 //BA.debugLineNum = 8650857;BA.debugLine="If Prct And Usar_Precio_Original Then";
if (true) break;

case 26:
//if
this.state = 37;
if (_prct && __ref._usar_precio_original /*boolean*/ ) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=8650859;
 //BA.debugLineNum = 8650859;BA.debugLine="If Tict = \"D\" Then";
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
RDebugUtils.currentLine=8650861;
 //BA.debugLineNum = 8650861;BA.debugLine="Wait For(Sb_Traer_Concepto(Codigo,Empresa,Su";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_concepto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigo,_empresa,_sucursal,_bodega,_podtglli));
this.state = 56;
return;
case 56:
//C
this.state = 32;
_id_docdet = (Integer) result[1];
;
RDebugUtils.currentLine=8650863;
 //BA.debugLineNum = 8650863;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=8650864;
 //BA.debugLineNum = 8650864;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8650866;
 //BA.debugLineNum = 8650866;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=8650867;
 //BA.debugLineNum = 8650867;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8650869;
 //BA.debugLineNum = 8650869;BA.debugLine="New_Row.Put(\"Idmaeedo_Dori\",Idmaeedo_Dori)";
_new_row.Put((Object)("Idmaeedo_Dori"),(Object)(_idmaeedo_dori));
RDebugUtils.currentLine=8650870;
 //BA.debugLineNum = 8650870;BA.debugLine="New_Row.Put(\"Idmaeddo_Dori\",Idmaeddo_Dori)";
_new_row.Put((Object)("Idmaeddo_Dori"),(Object)(_idmaeddo_dori));
RDebugUtils.currentLine=8650871;
 //BA.debugLineNum = 8650871;BA.debugLine="New_Row.Put(\"Emprepa\",Emprepa)";
_new_row.Put((Object)("Emprepa"),(Object)(_emprepa));
RDebugUtils.currentLine=8650872;
 //BA.debugLineNum = 8650872;BA.debugLine="New_Row.Put(\"Tidopa\",Tidopa)";
_new_row.Put((Object)("Tidopa"),(Object)(_tidopa));
RDebugUtils.currentLine=8650873;
 //BA.debugLineNum = 8650873;BA.debugLine="New_Row.Put(\"Nudopa\",Nudopa)";
_new_row.Put((Object)("Nudopa"),(Object)(_nudopa));
RDebugUtils.currentLine=8650874;
 //BA.debugLineNum = 8650874;BA.debugLine="New_Row.Put(\"Endopa\",Endopa)";
_new_row.Put((Object)("Endopa"),(Object)(_endopa));
RDebugUtils.currentLine=8650875;
 //BA.debugLineNum = 8650875;BA.debugLine="New_Row.Put(\"Nulidopa\",Nulidopa)";
_new_row.Put((Object)("Nulidopa"),(Object)(_nulidopa));
RDebugUtils.currentLine=8650876;
 //BA.debugLineNum = 8650876;BA.debugLine="New_Row.Put(\"CantUd1_Dori\",CantUd1_Dori)";
_new_row.Put((Object)("CantUd1_Dori"),(Object)(_cantud1_dori));
RDebugUtils.currentLine=8650877;
 //BA.debugLineNum = 8650877;BA.debugLine="New_Row.Put(\"CantUd2_Dori\",CantUd2_Dori)";
_new_row.Put((Object)("CantUd2_Dori"),(Object)(_cantud2_dori));
RDebugUtils.currentLine=8650879;
 //BA.debugLineNum = 8650879;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
_new_row.Put((Object)("codfuncionario"),(Object)(_codfuncionario));
RDebugUtils.currentLine=8650880;
 //BA.debugLineNum = 8650880;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
_new_row.Put((Object)("codvendedor"),(Object)(_codfuncionario));
RDebugUtils.currentLine=8650881;
 //BA.debugLineNum = 8650881;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
_new_row.Put((Object)("codlista"),(Object)(_codlista));
RDebugUtils.currentLine=8650883;
 //BA.debugLineNum = 8650883;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
_new_row.Put((Object)("moneda"),(Object)(_moneda));
RDebugUtils.currentLine=8650884;
 //BA.debugLineNum = 8650884;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
_new_row.Put((Object)("tipo_moneda"),(Object)(_tipo_moneda));
RDebugUtils.currentLine=8650885;
 //BA.debugLineNum = 8650885;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
_new_row.Put((Object)("tipo_cambio"),(Object)(_tipo_cambio));
RDebugUtils.currentLine=8650887;
 //BA.debugLineNum = 8650887;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
RDebugUtils.currentLine=8650888;
 //BA.debugLineNum = 8650888;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
RDebugUtils.currentLine=8650890;
 //BA.debugLineNum = 8650890;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
_new_row.Put((Object)("empresa"),(Object)(_empresa));
RDebugUtils.currentLine=8650891;
 //BA.debugLineNum = 8650891;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
_new_row.Put((Object)("sucursal"),(Object)(_sucursal));
RDebugUtils.currentLine=8650892;
 //BA.debugLineNum = 8650892;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
_new_row.Put((Object)("bodega"),(Object)(_bodega));
RDebugUtils.currentLine=8650894;
 //BA.debugLineNum = 8650894;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\",New_Row)";
__ref._sb_procesar_datos /*String*/ (null,"DescuentoPorc",_new_row);
RDebugUtils.currentLine=8650896;
 //BA.debugLineNum = 8650896;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=8650898;
 //BA.debugLineNum = 8650898;BA.debugLine="If Id_DocDet <> 0 Then";
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
RDebugUtils.currentLine=8650899;
 //BA.debugLineNum = 8650899;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
parent.__c.LogImpl("68650899",_codigo+"-"+_descripcion,0);
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
RDebugUtils.currentLine=8650906;
 //BA.debugLineNum = 8650906;BA.debugLine="If Not(Prct) Then";

case 37:
//if
this.state = 48;
if (parent.__c.Not(_prct)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=8650908;
 //BA.debugLineNum = 8650908;BA.debugLine="TotalNetoDoc = TotalNetoDoc + Vaneli";
__ref._totalnetodoc /*double*/  = __ref._totalnetodoc /*double*/ +_vaneli;
RDebugUtils.currentLine=8650909;
 //BA.debugLineNum = 8650909;BA.debugLine="TotalBrutoDoc = TotalBrutoDoc + Vabrdo";
__ref._totalbrutodoc /*double*/  = __ref._totalbrutodoc /*double*/ +_vabrdo;
RDebugUtils.currentLine=8650911;
 //BA.debugLineNum = 8650911;BA.debugLine="Wait For(Sb_Traer_Producto(Codigo,Empresa,Suc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_producto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigo,_empresa,_sucursal,_bodega));
this.state = 57;
return;
case 57:
//C
this.state = 40;
_id_docdet = (Integer) result[1];
;
RDebugUtils.currentLine=8650913;
 //BA.debugLineNum = 8650913;BA.debugLine="If Id_DocDet <> 0 Then";
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
RDebugUtils.currentLine=8650915;
 //BA.debugLineNum = 8650915;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=8650916;
 //BA.debugLineNum = 8650916;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8650918;
 //BA.debugLineNum = 8650918;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=8650919;
 //BA.debugLineNum = 8650919;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8650921;
 //BA.debugLineNum = 8650921;BA.debugLine="New_Row.Put(\"idmaeedo_dori\",Idmaeedo_Dori)";
_new_row.Put((Object)("idmaeedo_dori"),(Object)(_idmaeedo_dori));
RDebugUtils.currentLine=8650922;
 //BA.debugLineNum = 8650922;BA.debugLine="New_Row.Put(\"idmaeddo_dori\",Idmaeddo_Dori)";
_new_row.Put((Object)("idmaeddo_dori"),(Object)(_idmaeddo_dori));
RDebugUtils.currentLine=8650923;
 //BA.debugLineNum = 8650923;BA.debugLine="New_Row.Put(\"emprepa\",Emprepa)";
_new_row.Put((Object)("emprepa"),(Object)(_emprepa));
RDebugUtils.currentLine=8650924;
 //BA.debugLineNum = 8650924;BA.debugLine="New_Row.Put(\"tidopa\",Tidopa)";
_new_row.Put((Object)("tidopa"),(Object)(_tidopa));
RDebugUtils.currentLine=8650925;
 //BA.debugLineNum = 8650925;BA.debugLine="New_Row.Put(\"nudopa\",Nudopa)";
_new_row.Put((Object)("nudopa"),(Object)(_nudopa));
RDebugUtils.currentLine=8650926;
 //BA.debugLineNum = 8650926;BA.debugLine="New_Row.Put(\"endopa\",Endopa)";
_new_row.Put((Object)("endopa"),(Object)(_endopa));
RDebugUtils.currentLine=8650927;
 //BA.debugLineNum = 8650927;BA.debugLine="New_Row.Put(\"nulidopa\",Nulidopa)";
_new_row.Put((Object)("nulidopa"),(Object)(_nulidopa));
RDebugUtils.currentLine=8650929;
 //BA.debugLineNum = 8650929;BA.debugLine="New_Row.Put(\"cantUd1_dori\",CantUd1_Dori)";
_new_row.Put((Object)("cantUd1_dori"),(Object)(_cantud1_dori));
RDebugUtils.currentLine=8650930;
 //BA.debugLineNum = 8650930;BA.debugLine="New_Row.Put(\"cantUd2_dori\",CantUd2_Dori)";
_new_row.Put((Object)("cantUd2_dori"),(Object)(_cantud2_dori));
RDebugUtils.currentLine=8650932;
 //BA.debugLineNum = 8650932;BA.debugLine="New_Row.Put(\"cantidad\",Cantidad)";
_new_row.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=8650933;
 //BA.debugLineNum = 8650933;BA.debugLine="New_Row.Put(\"precio\",Precio)";
_new_row.Put((Object)("precio"),(Object)(_precio));
RDebugUtils.currentLine=8650935;
 //BA.debugLineNum = 8650935;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
_new_row.Put((Object)("codfuncionario"),(Object)(_codfuncionario));
RDebugUtils.currentLine=8650936;
 //BA.debugLineNum = 8650936;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
_new_row.Put((Object)("codvendedor"),(Object)(_codfuncionario));
RDebugUtils.currentLine=8650937;
 //BA.debugLineNum = 8650937;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
_new_row.Put((Object)("codlista"),(Object)(_codlista));
RDebugUtils.currentLine=8650939;
 //BA.debugLineNum = 8650939;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
_new_row.Put((Object)("moneda"),(Object)(_moneda));
RDebugUtils.currentLine=8650940;
 //BA.debugLineNum = 8650940;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
_new_row.Put((Object)("tipo_moneda"),(Object)(_tipo_moneda));
RDebugUtils.currentLine=8650941;
 //BA.debugLineNum = 8650941;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
_new_row.Put((Object)("tipo_cambio"),(Object)(_tipo_cambio));
RDebugUtils.currentLine=8650943;
 //BA.debugLineNum = 8650943;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
RDebugUtils.currentLine=8650944;
 //BA.debugLineNum = 8650944;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
RDebugUtils.currentLine=8650946;
 //BA.debugLineNum = 8650946;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
_new_row.Put((Object)("empresa"),(Object)(_empresa));
RDebugUtils.currentLine=8650947;
 //BA.debugLineNum = 8650947;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
_new_row.Put((Object)("sucursal"),(Object)(_sucursal));
RDebugUtils.currentLine=8650948;
 //BA.debugLineNum = 8650948;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
_new_row.Put((Object)("bodega"),(Object)(_bodega));
RDebugUtils.currentLine=8650950;
 //BA.debugLineNum = 8650950;BA.debugLine="Sb_Procesar_Datos(\"Cantidad\",New_Row)";
__ref._sb_procesar_datos /*String*/ (null,"Cantidad",_new_row);
RDebugUtils.currentLine=8650952;
 //BA.debugLineNum = 8650952;BA.debugLine="Wait For(Sb_Traer_Descuentos(Nulido)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_descuentos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_nulido));
this.state = 58;
return;
case 58:
//C
this.state = 43;
_tbldescuentos = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=8650954;
 //BA.debugLineNum = 8650954;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=8650955;
 //BA.debugLineNum = 8650955;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(V";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8650957;
 //BA.debugLineNum = 8650957;BA.debugLine="If TblDescuentos <> Null Then";
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
RDebugUtils.currentLine=8650958;
 //BA.debugLineNum = 8650958;BA.debugLine="Sb_Insertar_Descuentos_En_Escala(New_Row,Fi";
__ref._sb_insertar_descuentos_en_escala /*String*/ (null,_new_row,_fila_dscto,_tbldescuentos,_precio);
 if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=8650961;
 //BA.debugLineNum = 8650961;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=8650963;
 //BA.debugLineNum = 8650963;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
parent.__c.LogImpl("68650963",_codigo+"-"+_descripcion,0);
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
RDebugUtils.currentLine=8650975;
 //BA.debugLineNum = 8650975;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8650977;
 //BA.debugLineNum = 8650977;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_producto2(BaKapp.Movil.Tag.crear_documento __ref,String _codigo,String _empresa,String _sucursal,String _bodega) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_producto2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_producto2", new Object[] {_codigo,_empresa,_sucursal,_bodega}));}
ResumableSub_Sb_Traer_Producto2 rsub = new ResumableSub_Sb_Traer_Producto2(this,__ref,_codigo,_empresa,_sucursal,_bodega);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Producto2 extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Producto2(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref,String _codigo,String _empresa,String _sucursal,String _bodega) {
this.parent = parent;
this.__ref = __ref;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
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
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_producto2"), (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=8716305;
 //BA.debugLineNum = 8716305;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=8716306;
 //BA.debugLineNum = 8716306;BA.debugLine="Dim RFila As Map = Filas.Get(0)";
_rfila = new anywheresoftware.b4a.objects.collections.Map();
_rfila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=8716308;
 //BA.debugLineNum = 8716308;BA.debugLine="Dim ErrorStr As String =RFila.Get(\"Error\")";
_errorstr = BA.ObjectToString(_rfila.Get((Object)("Error")));
RDebugUtils.currentLine=8716310;
 //BA.debugLineNum = 8716310;BA.debugLine="If ErrorStr = Null Then";
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
RDebugUtils.currentLine=8716311;
 //BA.debugLineNum = 8716311;BA.debugLine="Return Null";
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
RDebugUtils.currentLine=8716317;
 //BA.debugLineNum = 8716317;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8716320;
 //BA.debugLineNum = 8716320;BA.debugLine="Return RFila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rfila));return;};
RDebugUtils.currentLine=8716322;
 //BA.debugLineNum = 8716322;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_concepto(BaKapp.Movil.Tag.crear_documento __ref,String _concepto,String _empresa,String _sucursal,String _bodega,double _descuentoporc) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_concepto", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_concepto", new Object[] {_concepto,_empresa,_sucursal,_bodega,_descuentoporc}));}
ResumableSub_Sb_Traer_Concepto rsub = new ResumableSub_Sb_Traer_Concepto(this,__ref,_concepto,_empresa,_sucursal,_bodega,_descuentoporc);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Concepto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Concepto(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref,String _concepto,String _empresa,String _sucursal,String _bodega,double _descuentoporc) {
this.parent = parent;
this.__ref = __ref;
this._concepto = _concepto;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this._descuentoporc = _descuentoporc;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
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
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_concepto,_empresa,_sucursal,_bodega,_lista,"");
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_concepto"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=8847377;
 //BA.debugLineNum = 8847377;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=8847379;
 //BA.debugLineNum = 8847379;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=8847382;
 //BA.debugLineNum = 8847382;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(__ref._id_docenc /*int*/ ));
RDebugUtils.currentLine=8847384;
 //BA.debugLineNum = 8847384;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("Moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=8847385;
 //BA.debugLineNum = 8847385;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=8847386;
 //BA.debugLineNum = 8847386;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Cambio"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=8847387;
 //BA.debugLineNum = 8847387;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=8847389;
 //BA.debugLineNum = 8847389;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent._dbutils._insertmaps /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=8847391;
 //BA.debugLineNum = 8847391;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=8847392;
 //BA.debugLineNum = 8847392;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8847394;
 //BA.debugLineNum = 8847394;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
_id_docdet2 = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=8847396;
 //BA.debugLineNum = 8847396;BA.debugLine="Return Id_DocDet2";
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
RDebugUtils.currentLine=8847401;
 //BA.debugLineNum = 8847401;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("68847401",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=8847402;
 //BA.debugLineNum = 8847402;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),parent.__c.False);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=8847405;
 //BA.debugLineNum = 8847405;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
RDebugUtils.currentLine=8847407;
 //BA.debugLineNum = 8847407;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sb_procesar_datos(BaKapp.Movil.Tag.crear_documento __ref,String _cabeza,anywheresoftware.b4a.objects.collections.Map _fila) throws Exception{
__ref = this;
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_procesar_datos", false))
	 {return ((String) Debug.delegate(ba, "sb_procesar_datos", new Object[] {_cabeza,_fila}));}
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
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub Sb_Procesar_Datos(Cabeza As String, Fila As Ma";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(_fila.Get((Object)("untrans"))));
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(_fila.Get((Object)("poriva"))));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(_fila.Get((Object)("porila"))));
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(_fila.Get((Object)("rtu"))));
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Dim Precio As Double = Fila.Get(\"precio\")";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)("precio"))));
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
RDebugUtils.currentLine=8519703;
 //BA.debugLineNum = 8519703;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="Dim Total As Double";
_total = 0;
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(_fila.Get((Object)("cantidad"))));
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
RDebugUtils.currentLine=8519713;
 //BA.debugLineNum = 8519713;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
_divisible = "";
RDebugUtils.currentLine=8519714;
 //BA.debugLineNum = 8519714;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
_divisible2 = "";
RDebugUtils.currentLine=8519716;
 //BA.debugLineNum = 8519716;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor"))));
RDebugUtils.currentLine=8519717;
 //BA.debugLineNum = 8519717;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=8519718;
 //BA.debugLineNum = 8519718;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=8519719;
 //BA.debugLineNum = 8519719;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(_fila.Get((Object)("descmaximo"))));
RDebugUtils.currentLine=8519721;
 //BA.debugLineNum = 8519721;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(_fila.Get((Object)("tict")));
RDebugUtils.currentLine=8519722;
 //BA.debugLineNum = 8519722;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(_fila.Get((Object)("prct")));
RDebugUtils.currentLine=8519723;
 //BA.debugLineNum = 8519723;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(_fila.Get((Object)("tipr")));
RDebugUtils.currentLine=8519725;
 //BA.debugLineNum = 8519725;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("codlista")));
RDebugUtils.currentLine=8519727;
 //BA.debugLineNum = 8519727;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
RDebugUtils.currentLine=8519729;
 //BA.debugLineNum = 8519729;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
RDebugUtils.currentLine=8519730;
 //BA.debugLineNum = 8519730;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
RDebugUtils.currentLine=8519732;
 //BA.debugLineNum = 8519732;BA.debugLine="If No_Aplica_Redondeo Then";
if (_no_aplica_redondeo) { 
RDebugUtils.currentLine=8519733;
 //BA.debugLineNum = 8519733;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = __c.False;
 };
RDebugUtils.currentLine=8519736;
 //BA.debugLineNum = 8519736;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
RDebugUtils.currentLine=8519737;
 //BA.debugLineNum = 8519737;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
RDebugUtils.currentLine=8519739;
 //BA.debugLineNum = 8519739;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
RDebugUtils.currentLine=8519740;
 //BA.debugLineNum = 8519740;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
RDebugUtils.currentLine=8519746;
 //BA.debugLineNum = 8519746;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor_anterior"))));
RDebugUtils.currentLine=8519747;
 //BA.debugLineNum = 8519747;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
RDebugUtils.currentLine=8519749;
 //BA.debugLineNum = 8519749;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (_cantidad==0 && (_tipr).equals("") == false) { 
 };
RDebugUtils.currentLine=8519756;
 //BA.debugLineNum = 8519756;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
RDebugUtils.currentLine=8519758;
 //BA.debugLineNum = 8519758;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
_moneda_enc = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("moneda_doc")));
RDebugUtils.currentLine=8519759;
 //BA.debugLineNum = 8519759;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
_tipo_moneda_enc = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tipomoneda")));
RDebugUtils.currentLine=8519760;
 //BA.debugLineNum = 8519760;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tasadorig_doc"))));
RDebugUtils.currentLine=8519762;
 //BA.debugLineNum = 8519762;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(_fila.Get((Object)("moneda")));
RDebugUtils.currentLine=8519763;
 //BA.debugLineNum = 8519763;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(_fila.Get((Object)("tipo_moneda")));
RDebugUtils.currentLine=8519764;
 //BA.debugLineNum = 8519764;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(_fila.Get((Object)("tipo_cambio"))));
RDebugUtils.currentLine=8519766;
 //BA.debugLineNum = 8519766;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
RDebugUtils.currentLine=8519768;
 //BA.debugLineNum = 8519768;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
RDebugUtils.currentLine=8519769;
 //BA.debugLineNum = 8519769;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if ((_tipo_moneda_enc).equals("N")) { 
RDebugUtils.currentLine=8519770;
 //BA.debugLineNum = 8519770;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = __c.Round2(_precio*_tipo_cambio_ent,(int) (2));
 }else {
RDebugUtils.currentLine=8519772;
 //BA.debugLineNum = 8519772;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = __c.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
RDebugUtils.currentLine=8519773;
 //BA.debugLineNum = 8519773;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 }else {
RDebugUtils.currentLine=8519776;
 //BA.debugLineNum = 8519776;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=8519777;
 //BA.debugLineNum = 8519777;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
RDebugUtils.currentLine=8519779;
 //BA.debugLineNum = 8519779;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 };
RDebugUtils.currentLine=8519784;
 //BA.debugLineNum = 8519784;BA.debugLine="Dim Divi As String";
_divi = "";
RDebugUtils.currentLine=8519786;
 //BA.debugLineNum = 8519786;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=8519787;
 //BA.debugLineNum = 8519787;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 };
RDebugUtils.currentLine=8519790;
 //BA.debugLineNum = 8519790;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=8519791;
 //BA.debugLineNum = 8519791;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 };
RDebugUtils.currentLine=8519794;
 //BA.debugLineNum = 8519794;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";
if (__c.Not(_funciones._fx_solo_enteros /*boolean*/ (getActivityBA(),_cantidad,_divi))) { 
RDebugUtils.currentLine=8519796;
 //BA.debugLineNum = 8519796;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
__c.Msgbox2(BA.ObjectToCharSequence("El producto solo permite cantidades enteras"),BA.ObjectToCharSequence("Validación"),"Ok","","",(android.graphics.Bitmap)(__c.Null),getActivityBA());
RDebugUtils.currentLine=8519797;
 //BA.debugLineNum = 8519797;BA.debugLine="Cantidad = 0";
_cantidad = 0;
RDebugUtils.currentLine=8519802;
 //BA.debugLineNum = 8519802;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8519806;
 //BA.debugLineNum = 8519806;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=8519807;
 //BA.debugLineNum = 8519807;BA.debugLine="If Rtu = 1 Then";
if (_rtu==1) { 
RDebugUtils.currentLine=8519808;
 //BA.debugLineNum = 8519808;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=8519809;
 //BA.debugLineNum = 8519809;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=8519811;
 //BA.debugLineNum = 8519811;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=8519812;
 //BA.debugLineNum = 8519812;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=8519816;
 //BA.debugLineNum = 8519816;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=8519817;
 //BA.debugLineNum = 8519817;BA.debugLine="If Rtu > 1 Then";
if (_rtu>1) { 
RDebugUtils.currentLine=8519818;
 //BA.debugLineNum = 8519818;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=8519819;
 //BA.debugLineNum = 8519819;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=8519821;
 //BA.debugLineNum = 8519821;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=8519822;
 //BA.debugLineNum = 8519822;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=8519826;
 //BA.debugLineNum = 8519826;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=8519836;
 //BA.debugLineNum = 8519836;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
_totalneto_calculo = __ref._totalnetodoc /*double*/ ;
RDebugUtils.currentLine=8519837;
 //BA.debugLineNum = 8519837;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
_totalbruto_calculo = __ref._totalbrutodoc /*double*/ ;
RDebugUtils.currentLine=8519839;
 //BA.debugLineNum = 8519839;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=8519841;
 //BA.debugLineNum = 8519841;BA.debugLine="Descontar = True";
_descontar = __c.True;
RDebugUtils.currentLine=8519842;
 //BA.debugLineNum = 8519842;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
RDebugUtils.currentLine=8519842;
 //BA.debugLineNum = 8519842;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
RDebugUtils.currentLine=8519842;
 //BA.debugLineNum = 8519842;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
RDebugUtils.currentLine=8519843;
 //BA.debugLineNum = 8519843;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
RDebugUtils.currentLine=8519845;
 //BA.debugLineNum = 8519845;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=8519847;
 //BA.debugLineNum = 8519847;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519848;
 //BA.debugLineNum = 8519848;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519850;
 //BA.debugLineNum = 8519850;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=8519852;
 //BA.debugLineNum = 8519852;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519854;
 //BA.debugLineNum = 8519854;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=8519857;
 //BA.debugLineNum = 8519857;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=8519859;
 //BA.debugLineNum = 8519859;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519861;
 //BA.debugLineNum = 8519861;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=8519864;
 //BA.debugLineNum = 8519864;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 }else 
{RDebugUtils.currentLine=8519869;
 //BA.debugLineNum = 8519869;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=8519871;
 //BA.debugLineNum = 8519871;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=8519872;
 //BA.debugLineNum = 8519872;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(_fila.Get((Object)("recargovalor"))));
RDebugUtils.currentLine=8519874;
 //BA.debugLineNum = 8519874;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519875;
 //BA.debugLineNum = 8519875;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 }else {
RDebugUtils.currentLine=8519877;
 //BA.debugLineNum = 8519877;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = __c.Round2(_total_concepto/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=8519878;
 //BA.debugLineNum = 8519878;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 };
RDebugUtils.currentLine=8519881;
 //BA.debugLineNum = 8519881;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=8519883;
 //BA.debugLineNum = 8519883;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=8519884;
 //BA.debugLineNum = 8519884;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=8519886;
 //BA.debugLineNum = 8519886;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
RDebugUtils.currentLine=8519888;
 //BA.debugLineNum = 8519888;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519890;
 //BA.debugLineNum = 8519890;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = __c.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519891;
 //BA.debugLineNum = 8519891;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = __c.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519893;
 //BA.debugLineNum = 8519893;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = __c.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
RDebugUtils.currentLine=8519894;
 //BA.debugLineNum = 8519894;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 }else {
RDebugUtils.currentLine=8519898;
 //BA.debugLineNum = 8519898;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519900;
 //BA.debugLineNum = 8519900;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = __c.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=8519904;
 //BA.debugLineNum = 8519904;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
if ((_cabeza).equals("ValNetoLinea")) { 
RDebugUtils.currentLine=8519906;
 //BA.debugLineNum = 8519906;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=8519907;
 //BA.debugLineNum = 8519907;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=8519909;
 //BA.debugLineNum = 8519909;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519911;
 //BA.debugLineNum = 8519911;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = __c.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 }else {
RDebugUtils.currentLine=8519914;
 //BA.debugLineNum = 8519914;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = __c.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 };
RDebugUtils.currentLine=8519917;
 //BA.debugLineNum = 8519917;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 }}
;
RDebugUtils.currentLine=8519921;
 //BA.debugLineNum = 8519921;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 }}
;
 }else {
RDebugUtils.currentLine=8519937;
 //BA.debugLineNum = 8519937;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519938;
 //BA.debugLineNum = 8519938;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 }else {
RDebugUtils.currentLine=8519940;
 //BA.debugLineNum = 8519940;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = __c.Round2(_precio_calculado/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=8519941;
 //BA.debugLineNum = 8519941;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 };
RDebugUtils.currentLine=8519944;
 //BA.debugLineNum = 8519944;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = __c.Round2(_precioneto*_cantidad,(int) (3));
RDebugUtils.currentLine=8519945;
 //BA.debugLineNum = 8519945;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519947;
 //BA.debugLineNum = 8519947;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
RDebugUtils.currentLine=8519949;
 //BA.debugLineNum = 8519949;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=8519950;
 //BA.debugLineNum = 8519950;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
RDebugUtils.currentLine=8519962;
 //BA.debugLineNum = 8519962;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
RDebugUtils.currentLine=8519963;
 //BA.debugLineNum = 8519963;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
RDebugUtils.currentLine=8519967;
 //BA.debugLineNum = 8519967;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
RDebugUtils.currentLine=8519969;
 //BA.debugLineNum = 8519969;BA.debugLine="If Precio > 0 Then";
if (_precio>0) { 
RDebugUtils.currentLine=8519971;
 //BA.debugLineNum = 8519971;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519973;
 //BA.debugLineNum = 8519973;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519975;
 //BA.debugLineNum = 8519975;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=8519979;
 //BA.debugLineNum = 8519979;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8519981;
 //BA.debugLineNum = 8519981;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else 
{RDebugUtils.currentLine=8519987;
 //BA.debugLineNum = 8519987;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=8519989;
 //BA.debugLineNum = 8519989;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8519991;
 //BA.debugLineNum = 8519991;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=8519994;
 //BA.debugLineNum = 8519994;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 };
RDebugUtils.currentLine=8520002;
 //BA.debugLineNum = 8520002;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=8520003;
 //BA.debugLineNum = 8520003;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
_fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
RDebugUtils.currentLine=8520004;
 //BA.debugLineNum = 8520004;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
_fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
RDebugUtils.currentLine=8520006;
 //BA.debugLineNum = 8520006;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
_fila.Put((Object)("DsctoRealPorc"),(Object)(0));
RDebugUtils.currentLine=8520007;
 //BA.debugLineNum = 8520007;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
_fila.Put((Object)("DsctoRealValor"),(Object)(0));
RDebugUtils.currentLine=8520017;
 //BA.debugLineNum = 8520017;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
RDebugUtils.currentLine=8520019;
 //BA.debugLineNum = 8520019;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=8520020;
 //BA.debugLineNum = 8520020;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
RDebugUtils.currentLine=8520021;
 //BA.debugLineNum = 8520021;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
RDebugUtils.currentLine=8520023;
 //BA.debugLineNum = 8520023;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=8520025;
 //BA.debugLineNum = 8520025;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
RDebugUtils.currentLine=8520027;
 //BA.debugLineNum = 8520027;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8520028;
 //BA.debugLineNum = 8520028;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 }else {
RDebugUtils.currentLine=8520030;
 //BA.debugLineNum = 8520030;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 };
RDebugUtils.currentLine=8520036;
 //BA.debugLineNum = 8520036;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
RDebugUtils.currentLine=8520037;
 //BA.debugLineNum = 8520037;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(_fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
RDebugUtils.currentLine=8520038;
 //BA.debugLineNum = 8520038;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = __c.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
RDebugUtils.currentLine=8520040;
 //BA.debugLineNum = 8520040;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
RDebugUtils.currentLine=8520042;
 //BA.debugLineNum = 8520042;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (_valor_dscto_real>0) { 
RDebugUtils.currentLine=8520043;
 //BA.debugLineNum = 8520043;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = __c.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 };
RDebugUtils.currentLine=8520050;
 //BA.debugLineNum = 8520050;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(_fila.Get((Object)("codfunautoriza")));
RDebugUtils.currentLine=8520052;
 //BA.debugLineNum = 8520052;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
RDebugUtils.currentLine=8520053;
 //BA.debugLineNum = 8520053;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
RDebugUtils.currentLine=8520055;
 //BA.debugLineNum = 8520055;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if ((_codfunautoriza).equals("xyz")) { 
_codfunautoriza = __ref._funcionario /*String*/ ;};
RDebugUtils.currentLine=8520057;
 //BA.debugLineNum = 8520057;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (_precio_cn_dscto<_precio_netolista) { 
RDebugUtils.currentLine=8520059;
 //BA.debugLineNum = 8520059;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
RDebugUtils.currentLine=8520061;
 //BA.debugLineNum = 8520061;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (_descmaximo==0) { 
_descmaximo = 0.5;};
RDebugUtils.currentLine=8520063;
 //BA.debugLineNum = 8520063;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (_dscto_real>_descmaximo) { 
RDebugUtils.currentLine=8520065;
 //BA.debugLineNum = 8520065;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = __c.True;
RDebugUtils.currentLine=8520067;
 //BA.debugLineNum = 8520067;BA.debugLine="If Vizado Then";
if (_vizado) { 
RDebugUtils.currentLine=8520068;
 //BA.debugLineNum = 8520068;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = __c.True;
 }else {
RDebugUtils.currentLine=8520073;
 //BA.debugLineNum = 8520073;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
RDebugUtils.currentLine=8520074;
 //BA.debugLineNum = 8520074;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
RDebugUtils.currentLine=8520082;
 //BA.debugLineNum = 8520082;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
RDebugUtils.currentLine=8520084;
 //BA.debugLineNum = 8520084;BA.debugLine="If Precio <> PrecioLista Then";
if (_precio!=_preciolista) { 
RDebugUtils.currentLine=8520085;
 //BA.debugLineNum = 8520085;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = __c.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 };
RDebugUtils.currentLine=8520088;
 //BA.debugLineNum = 8520088;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
if (_dscto_real>_valor_dscto) { 
RDebugUtils.currentLine=8520090;
 //BA.debugLineNum = 8520090;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = __c.CRLF+__c.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
RDebugUtils.currentLine=8520093;
 //BA.debugLineNum = 8520093;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = __c.False;
 }else {
RDebugUtils.currentLine=8520096;
 //BA.debugLineNum = 8520096;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
_codfunautoriza_dscto = __ref._funcionario /*String*/ ;
RDebugUtils.currentLine=8520098;
 //BA.debugLineNum = 8520098;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = __c.True;
 };
 };
 };
 };
 }else {
RDebugUtils.currentLine=8520120;
 //BA.debugLineNum = 8520120;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = __c.True;
 };
RDebugUtils.currentLine=8520126;
 //BA.debugLineNum = 8520126;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8520128;
 //BA.debugLineNum = 8520128;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 }else {
RDebugUtils.currentLine=8520132;
 //BA.debugLineNum = 8520132;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 };
RDebugUtils.currentLine=8520138;
 //BA.debugLineNum = 8520138;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8520140;
 //BA.debugLineNum = 8520140;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = __c.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8520141;
 //BA.debugLineNum = 8520141;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=8520142;
 //BA.debugLineNum = 8520142;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=8520143;
 //BA.debugLineNum = 8520143;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=8520144;
 //BA.debugLineNum = 8520144;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=8520146;
 //BA.debugLineNum = 8520146;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
RDebugUtils.currentLine=8520148;
 //BA.debugLineNum = 8520148;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
RDebugUtils.currentLine=8520149;
 //BA.debugLineNum = 8520149;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
_preciobruto = __c.Round2(_precio*_impuestos,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=8520151;
 //BA.debugLineNum = 8520151;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=8520152;
 //BA.debugLineNum = 8520152;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = __c.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 };
RDebugUtils.currentLine=8520155;
 //BA.debugLineNum = 8520155;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=8520157;
 //BA.debugLineNum = 8520157;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
RDebugUtils.currentLine=8520158;
 //BA.debugLineNum = 8520158;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 };
 }else {
RDebugUtils.currentLine=8520164;
 //BA.debugLineNum = 8520164;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = __c.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=8520165;
 //BA.debugLineNum = 8520165;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=8520166;
 //BA.debugLineNum = 8520166;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=8520167;
 //BA.debugLineNum = 8520167;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=8520168;
 //BA.debugLineNum = 8520168;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
RDebugUtils.currentLine=8520170;
 //BA.debugLineNum = 8520170;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
RDebugUtils.currentLine=8520171;
 //BA.debugLineNum = 8520171;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = __c.Round2(_precio/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=8520173;
 //BA.debugLineNum = 8520173;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=8520175;
 //BA.debugLineNum = 8520175;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
RDebugUtils.currentLine=8520176;
 //BA.debugLineNum = 8520176;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 };
 };
RDebugUtils.currentLine=8520183;
 //BA.debugLineNum = 8520183;BA.debugLine="If Descontar Then";
if (_descontar) { 
RDebugUtils.currentLine=8520185;
 //BA.debugLineNum = 8520185;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=8520186;
 //BA.debugLineNum = 8520186;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
RDebugUtils.currentLine=8520188;
 //BA.debugLineNum = 8520188;BA.debugLine="If Prct = 0 Then";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=8520190;
 //BA.debugLineNum = 8520190;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8520191;
 //BA.debugLineNum = 8520191;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
RDebugUtils.currentLine=8520192;
 //BA.debugLineNum = 8520192;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=8520193;
 //BA.debugLineNum = 8520193;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=8520194;
 //BA.debugLineNum = 8520194;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=8520195;
 //BA.debugLineNum = 8520195;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=8520196;
 //BA.debugLineNum = 8520196;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 }else {
RDebugUtils.currentLine=8520198;
 //BA.debugLineNum = 8520198;BA.debugLine="TotalBruto = DescuentoValor";
_totalbruto = _descuentovalor;
RDebugUtils.currentLine=8520199;
 //BA.debugLineNum = 8520199;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = __c.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=8520200;
 //BA.debugLineNum = 8520200;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=8520201;
 //BA.debugLineNum = 8520201;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=8520202;
 //BA.debugLineNum = 8520202;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=8520203;
 //BA.debugLineNum = 8520203;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 };
RDebugUtils.currentLine=8520206;
 //BA.debugLineNum = 8520206;BA.debugLine="If TotalNeto > 0 Then";
if (_totalneto>0) { 
RDebugUtils.currentLine=8520208;
 //BA.debugLineNum = 8520208;BA.debugLine="TotalIla = TotalIla * -1";
_totalila = _totalila*-1;
RDebugUtils.currentLine=8520209;
 //BA.debugLineNum = 8520209;BA.debugLine="TotalIva = TotalIva * -1";
_totaliva = _totaliva*-1;
RDebugUtils.currentLine=8520210;
 //BA.debugLineNum = 8520210;BA.debugLine="TotalNeto = TotalNeto * -1";
_totalneto = _totalneto*-1;
RDebugUtils.currentLine=8520211;
 //BA.debugLineNum = 8520211;BA.debugLine="TotalBruto = TotalBruto * -1";
_totalbruto = _totalbruto*-1;
RDebugUtils.currentLine=8520212;
 //BA.debugLineNum = 8520212;BA.debugLine="Total = Total * -1";
_total = _total*-1;
 };
 };
 }else {
RDebugUtils.currentLine=8520220;
 //BA.debugLineNum = 8520220;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=8520222;
 //BA.debugLineNum = 8520222;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = __c.Round2(_totalneto/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=8520223;
 //BA.debugLineNum = 8520223;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = __c.Round2(_totalneto/(double)_cantud2,(int) (5));
RDebugUtils.currentLine=8520225;
 //BA.debugLineNum = 8520225;BA.debugLine="If ChkValores = False Then";
if (__ref._chkvalores /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=8520226;
 //BA.debugLineNum = 8520226;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 };
 }else {
RDebugUtils.currentLine=8520230;
 //BA.debugLineNum = 8520230;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=8520231;
 //BA.debugLineNum = 8520231;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 };
 };
RDebugUtils.currentLine=8520236;
 //BA.debugLineNum = 8520236;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=8520238;
 //BA.debugLineNum = 8520238;BA.debugLine="Dim Multiplo = 1";
_multiplo = BA.NumberToString(1);
RDebugUtils.currentLine=8520240;
 //BA.debugLineNum = 8520240;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=8520241;
 //BA.debugLineNum = 8520241;BA.debugLine="Multiplo = -1";
_multiplo = BA.NumberToString(-1);
 }else 
{RDebugUtils.currentLine=8520242;
 //BA.debugLineNum = 8520242;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=8520243;
 //BA.debugLineNum = 8520243;BA.debugLine="Multiplo = 1";
_multiplo = BA.NumberToString(1);
 }}
;
RDebugUtils.currentLine=8520246;
 //BA.debugLineNum = 8520246;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8520248;
 //BA.debugLineNum = 8520248;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*(double)(Double.parseDouble(_multiplo));
RDebugUtils.currentLine=8520249;
 //BA.debugLineNum = 8520249;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 }else {
RDebugUtils.currentLine=8520254;
 //BA.debugLineNum = 8520254;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*(double)(Double.parseDouble(_multiplo));
RDebugUtils.currentLine=8520255;
 //BA.debugLineNum = 8520255;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 };
 };
RDebugUtils.currentLine=8520298;
 //BA.debugLineNum = 8520298;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = __c.Round2(_totalila,(int) (2));
RDebugUtils.currentLine=8520299;
 //BA.debugLineNum = 8520299;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = __c.Round2(_totaliva,(int) (2));
RDebugUtils.currentLine=8520300;
 //BA.debugLineNum = 8520300;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = __c.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=8520301;
 //BA.debugLineNum = 8520301;BA.debugLine="TotalBruto = Round2(TotalBruto, Decimal)";
_totalbruto = __c.Round2(_totalbruto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=8520309;
 //BA.debugLineNum = 8520309;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
_fila.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=8520310;
 //BA.debugLineNum = 8520310;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
_fila.Put((Object)("cantud1"),(Object)(_cantud1));
RDebugUtils.currentLine=8520311;
 //BA.debugLineNum = 8520311;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
_fila.Put((Object)("cantud2"),(Object)(_cantud2));
RDebugUtils.currentLine=8520313;
 //BA.debugLineNum = 8520313;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
_fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
RDebugUtils.currentLine=8520314;
 //BA.debugLineNum = 8520314;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
_fila.Put((Object)("valivalinea"),(Object)(_totaliva));
RDebugUtils.currentLine=8520315;
 //BA.debugLineNum = 8520315;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
_fila.Put((Object)("valilalinea"),(Object)(_totalila));
RDebugUtils.currentLine=8520316;
 //BA.debugLineNum = 8520316;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
_fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
RDebugUtils.currentLine=8520318;
 //BA.debugLineNum = 8520318;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
_fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
RDebugUtils.currentLine=8520319;
 //BA.debugLineNum = 8520319;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
_fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
RDebugUtils.currentLine=8520321;
 //BA.debugLineNum = 8520321;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
_fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
RDebugUtils.currentLine=8520322;
 //BA.debugLineNum = 8520322;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
_fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
RDebugUtils.currentLine=8520327;
 //BA.debugLineNum = 8520327;BA.debugLine="Dim TipoValor As String";
_tipovalor = "";
RDebugUtils.currentLine=8520329;
 //BA.debugLineNum = 8520329;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=8520331;
 //BA.debugLineNum = 8520331;BA.debugLine="TipoValor = \"N\"";
_tipovalor = "N";
 }else {
RDebugUtils.currentLine=8520334;
 //BA.debugLineNum = 8520334;BA.debugLine="TipoValor = \"B\"";
_tipovalor = "B";
 };
RDebugUtils.currentLine=8520337;
 //BA.debugLineNum = 8520337;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
_fila.Put((Object)("tipovalor"),(Object)(_tipovalor));
RDebugUtils.currentLine=8520339;
 //BA.debugLineNum = 8520339;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
_precionetoud = _precioneto;
RDebugUtils.currentLine=8520340;
 //BA.debugLineNum = 8520340;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
_preciobrutoud = _preciobruto;
RDebugUtils.currentLine=8520342;
 //BA.debugLineNum = 8520342;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
_precionetoudlista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
RDebugUtils.currentLine=8520343;
 //BA.debugLineNum = 8520343;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
_preciobrutoudlista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
RDebugUtils.currentLine=8520345;
 //BA.debugLineNum = 8520345;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
_fila.Put((Object)("precionetoud"),(Object)(_precionetoud));
RDebugUtils.currentLine=8520347;
 //BA.debugLineNum = 8520347;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
_fila.Put((Object)("preciobrutoud"),(Object)(_preciobrutoud));
RDebugUtils.currentLine=8520350;
 //BA.debugLineNum = 8520350;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_producto(BaKapp.Movil.Tag.crear_documento __ref,String _codigo,String _empresa,String _sucursal,String _bodega) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_producto", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_producto", new Object[] {_codigo,_empresa,_sucursal,_bodega}));}
ResumableSub_Sb_Traer_Producto rsub = new ResumableSub_Sb_Traer_Producto(this,__ref,_codigo,_empresa,_sucursal,_bodega);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Producto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Producto(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref,String _codigo,String _empresa,String _sucursal,String _bodega) {
this.parent = parent;
this.__ref = __ref;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
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
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_producto"), (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=8781842;
 //BA.debugLineNum = 8781842;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Error\")";
_errorstr = BA.ObjectToString(_fila.Get((Object)("Error")));
RDebugUtils.currentLine=8781846;
 //BA.debugLineNum = 8781846;BA.debugLine="If ErrorStr = Null Then";
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
RDebugUtils.currentLine=8781852;
 //BA.debugLineNum = 8781852;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(__ref._id_docenc /*int*/ ));
RDebugUtils.currentLine=8781854;
 //BA.debugLineNum = 8781854;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=8781855;
 //BA.debugLineNum = 8781855;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=8781856;
 //BA.debugLineNum = 8781856;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_cambio"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=8781858;
 //BA.debugLineNum = 8781858;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent._dbutils._insertmaps /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=8781860;
 //BA.debugLineNum = 8781860;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ )+" Order by Id_DocDet Desc";
RDebugUtils.currentLine=8781861;
 //BA.debugLineNum = 8781861;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8781863;
 //BA.debugLineNum = 8781863;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=8781873;
 //BA.debugLineNum = 8781873;BA.debugLine="Return Id_DocDet'Fila_Id";
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
RDebugUtils.currentLine=8781888;
 //BA.debugLineNum = 8781888;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
RDebugUtils.currentLine=8781890;
 //BA.debugLineNum = 8781890;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_descuentos(BaKapp.Movil.Tag.crear_documento __ref,String _nulido) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_descuentos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_descuentos", new Object[] {_nulido}));}
ResumableSub_Sb_Traer_Descuentos rsub = new ResumableSub_Sb_Traer_Descuentos(this,__ref,_nulido);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Descuentos extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Descuentos(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref,String _nulido) {
this.parent = parent;
this.__ref = __ref;
this._nulido = _nulido;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
BaKapp.Movil.Tag.crear_documento parent;
String _nulido;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _lista = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Consulta_Sql = \"Select *,KODT As 'Kodt',PODT As '";
__ref._consulta_sql /*String*/  = "Select *,KODT As 'Kodt',PODT As 'Dscto',VADT As 'Valor' From MAEDTLI Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ )+" And NULIDO = '"+_nulido+"' Order By IDMAEDTLI";
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_descuentos"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="Return Lista";
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
RDebugUtils.currentLine=8912921;
 //BA.debugLineNum = 8912921;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=8912923;
 //BA.debugLineNum = 8912923;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sb_insertar_descuentos_en_escala(BaKapp.Movil.Tag.crear_documento __ref,anywheresoftware.b4a.objects.collections.Map _fila,anywheresoftware.b4a.objects.collections.Map _fila_dscto,anywheresoftware.b4a.objects.collections.List _tbldescuentos,double _precio) throws Exception{
__ref = this;
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_insertar_descuentos_en_escala", false))
	 {return ((String) Debug.delegate(ba, "sb_insertar_descuentos_en_escala", new Object[] {_fila,_fila_dscto,_tbldescuentos,_precio}));}
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
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub Sb_Insertar_Descuentos_En_Escala(Fila As Map,F";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Dim Id_DocDet As Int = Fila.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(_fila.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(_fila.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Dim NroDscto As Int = 0";
_nrodscto = (int) (0);
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
_valor = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="Dim Total_Descuento As Double";
_total_descuento = 0;
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="Dim Total_Pc As Double";
_total_pc = 0;
RDebugUtils.currentLine=8978452;
 //BA.debugLineNum = 8978452;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (_fila_dscto.IsInitialized()) { 
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
_dbutils._deleterecord /*String*/ (getActivityBA(),_variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 };
RDebugUtils.currentLine=8978456;
 //BA.debugLineNum = 8978456;BA.debugLine="Dim Decimales As Int";
_decimales = 0;
RDebugUtils.currentLine=8978458;
 //BA.debugLineNum = 8978458;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
_moneda_det = "";
RDebugUtils.currentLine=8978459;
 //BA.debugLineNum = 8978459;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
_moneda_enc = "";
RDebugUtils.currentLine=8978461;
 //BA.debugLineNum = 8978461;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
_tipo_moneda_enc = "";
RDebugUtils.currentLine=8978462;
 //BA.debugLineNum = 8978462;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
_tipo_cambio_ent = 0;
RDebugUtils.currentLine=8978464;
 //BA.debugLineNum = 8978464;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
RDebugUtils.currentLine=8978465;
 //BA.debugLineNum = 8978465;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=8978466;
 //BA.debugLineNum = 8978466;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 };
 }else {
RDebugUtils.currentLine=8978469;
 //BA.debugLineNum = 8978469;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=8978470;
 //BA.debugLineNum = 8978470;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 };
 };
RDebugUtils.currentLine=8978482;
 //BA.debugLineNum = 8978482;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_tbldescuentos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=8978484;
 //BA.debugLineNum = 8978484;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_tbldescuentos.Get(_i)));
RDebugUtils.currentLine=8978489;
 //BA.debugLineNum = 8978489;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
_kodt = "D_SIN_TIPO";
RDebugUtils.currentLine=8978490;
 //BA.debugLineNum = 8978490;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
_podt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Dscto"))));
RDebugUtils.currentLine=8978491;
 //BA.debugLineNum = 8978491;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
_vadt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Valor"))));
RDebugUtils.currentLine=8978493;
 //BA.debugLineNum = 8978493;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
if (_podt!=0 || _vadt!=0) { 
RDebugUtils.currentLine=8978495;
 //BA.debugLineNum = 8978495;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
if (_podt!=0) { 
RDebugUtils.currentLine=8978497;
 //BA.debugLineNum = 8978497;BA.debugLine="If Podt > 0 Then";
if (_podt>0) { 
RDebugUtils.currentLine=8978498;
 //BA.debugLineNum = 8978498;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
_vadt = __c.Round2((_podt/(double)100)*_valor,_decimales);
RDebugUtils.currentLine=8978501;
 //BA.debugLineNum = 8978501;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = __c.Round2((_vadt/(double)_valor)*100,(int) (5));
 }else {
RDebugUtils.currentLine=8978504;
 //BA.debugLineNum = 8978504;BA.debugLine="Vadt = 0";
_vadt = 0;
 };
 }else {
RDebugUtils.currentLine=8978509;
 //BA.debugLineNum = 8978509;BA.debugLine="If Vadt <> 0 Then";
if (_vadt!=0) { 
RDebugUtils.currentLine=8978511;
 //BA.debugLineNum = 8978511;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = __c.Round2((_vadt/(double)_valor)*100,(int) (5));
 }else {
RDebugUtils.currentLine=8978514;
 //BA.debugLineNum = 8978514;BA.debugLine="Podt = 0";
_podt = 0;
 };
 };
RDebugUtils.currentLine=8978519;
 //BA.debugLineNum = 8978519;BA.debugLine="Podt = Round2(Podt,Decimales)";
_podt = __c.Round2(_podt,_decimales);
RDebugUtils.currentLine=8978521;
 //BA.debugLineNum = 8978521;BA.debugLine="If Podt <> 0 Then";
if (_podt!=0) { 
RDebugUtils.currentLine=8978523;
 //BA.debugLineNum = 8978523;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
__ref._consulta_sql /*String*/  = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)";
RDebugUtils.currentLine=8978524;
 //BA.debugLineNum = 8978524;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
_variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._id_docenc /*int*/ ),(Object)(_id_docdet),(Object)(""),(Object)(_kodt),(Object)(_podt),(Object)(_vadt),(Object)(_podt)}));
RDebugUtils.currentLine=8978526;
 //BA.debugLineNum = 8978526;BA.debugLine="NroDscto = NroDscto + 1";
_nrodscto = (int) (_nrodscto+1);
 };
RDebugUtils.currentLine=8978530;
 //BA.debugLineNum = 8978530;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
_total_descuento = _total_descuento+_vadt;
RDebugUtils.currentLine=8978531;
 //BA.debugLineNum = 8978531;BA.debugLine="Valor = Valor - Vadt";
_valor = _valor-_vadt;
 };
 }
};
RDebugUtils.currentLine=8978537;
 //BA.debugLineNum = 8978537;BA.debugLine="If Total_Descuento <> 0 Then";
if (_total_descuento!=0) { 
RDebugUtils.currentLine=8978538;
 //BA.debugLineNum = 8978538;BA.debugLine="Total_Pc = Total_Descuento / Precio";
_total_pc = _total_descuento/(double)_precio;
 };
RDebugUtils.currentLine=8978553;
 //BA.debugLineNum = 8978553;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
_fila.Put((Object)("descuentovalor"),(Object)(_total_descuento));
RDebugUtils.currentLine=8978554;
 //BA.debugLineNum = 8978554;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
_fila.Put((Object)("nrodscto"),(Object)(_nrodscto));
RDebugUtils.currentLine=8978559;
 //BA.debugLineNum = 8978559;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\",Fila)";
__ref._sb_procesar_datos /*String*/ (null,"DescuentoValor",_fila);
RDebugUtils.currentLine=8978561;
 //BA.debugLineNum = 8978561;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_nuevo_documento(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_nuevo_documento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_nuevo_documento", null));}
ResumableSub_Sb_Nuevo_Documento rsub = new ResumableSub_Sb_Nuevo_Documento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Nuevo_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Nuevo_Documento(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
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
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
_b4a_despachosimple = BA.ObjectToBoolean(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
__ref._consulta_sql /*String*/  = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?";
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="Consulta_Sql = \"DELETE FROM [Detalle_Doc] WHERE [";
__ref._consulta_sql /*String*/  = "DELETE FROM [Detalle_Doc] WHERE [id_docenc] = ?";
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="Consulta_Sql = \"DELETE FROM [Descuentos_Doc] WHER";
__ref._consulta_sql /*String*/  = "DELETE FROM [Descuentos_Doc] WHERE id_docenc = ?";
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="Consulta_Sql = \"DELETE FROM [Impuestos_Doc] WHERE";
__ref._consulta_sql /*String*/  = "DELETE FROM [Impuestos_Doc] WHERE id_docenc = ?";
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=8388624;
 //BA.debugLineNum = 8388624;BA.debugLine="Consulta_Sql = \"DELETE FROM [Observaciones_Doc] W";
__ref._consulta_sql /*String*/  = "DELETE FROM [Observaciones_Doc] WHERE id_docenc = ?";
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=8388628;
 //BA.debugLineNum = 8388628;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
__ref._consulta_sql /*String*/  = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)";
RDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(parent._variables._gl_modalidad /*String*/ ),(Object)(parent._variables._gl_empresa /*String*/ ),(Object)(parent._variables._gl_sucursal /*String*/ )}));
RDebugUtils.currentLine=8388632;
 //BA.debugLineNum = 8388632;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
__ref._consulta_sql /*String*/  = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=8388633;
 //BA.debugLineNum = 8388633;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8388636;
 //BA.debugLineNum = 8388636;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
__ref._id_docenc /*int*/  = (int)(BA.ObjectToNumber(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("id_docenc"))));
RDebugUtils.currentLine=8388639;
 //BA.debugLineNum = 8388639;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ );
RDebugUtils.currentLine=8388640;
 //BA.debugLineNum = 8388640;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8388643;
 //BA.debugLineNum = 8388643;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
__ref._consulta_sql /*String*/  = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=8388644;
 //BA.debugLineNum = 8388644;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._id_docenc /*int*/ )}));
RDebugUtils.currentLine=8388647;
 //BA.debugLineNum = 8388647;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
__ref._consulta_sql /*String*/  = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ );
RDebugUtils.currentLine=8388648;
 //BA.debugLineNum = 8388648;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=8388650;
 //BA.debugLineNum = 8388650;BA.debugLine="If B4A_DespachoSimple Then";
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
RDebugUtils.currentLine=8388653;
 //BA.debugLineNum = 8388653;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
__ref._consulta_sql /*String*/  = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=8388654;
 //BA.debugLineNum = 8388654;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._id_docenc /*int*/ )}));
RDebugUtils.currentLine=8388657;
 //BA.debugLineNum = 8388657;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
__ref._consulta_sql /*String*/  = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ );
RDebugUtils.currentLine=8388658;
 //BA.debugLineNum = 8388658;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=8388662;
 //BA.debugLineNum = 8388662;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
parent.__c.LogImpl("68388662","Documento cargado... Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ ),0);
RDebugUtils.currentLine=8388665;
 //BA.debugLineNum = 8388665;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=8388666;
 //BA.debugLineNum = 8388666;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=8388667;
 //BA.debugLineNum = 8388667;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=8388668;
 //BA.debugLineNum = 8388668;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=8388670;
 //BA.debugLineNum = 8388670;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=8388672;
 //BA.debugLineNum = 8388672;BA.debugLine="Dim Cuotas As Int = 0";
_cuotas = (int) (0);
RDebugUtils.currentLine=8388673;
 //BA.debugLineNum = 8388673;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=8388674;
 //BA.debugLineNum = 8388674;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=8388675;
 //BA.debugLineNum = 8388675;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
_forma_de_pago = "";
RDebugUtils.currentLine=8388677;
 //BA.debugLineNum = 8388677;BA.debugLine="Dim Centro_Costo As String";
_centro_costo = "";
RDebugUtils.currentLine=8388679;
 //BA.debugLineNum = 8388679;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
_moneda_doc = BA.ObjectToString(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=8388680;
 //BA.debugLineNum = 8388680;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
_valor_dolar = (double)(BA.ObjectToNumber(parent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=8388681;
 //BA.debugLineNum = 8388681;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
_tasadorig_doc = (double)(BA.ObjectToNumber(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=8388682;
 //BA.debugLineNum = 8388682;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
_tipomoneda = BA.ObjectToString(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=8388684;
 //BA.debugLineNum = 8388684;BA.debugLine="Dim ListaPrecios As String";
_listaprecios = "";
RDebugUtils.currentLine=8388686;
 //BA.debugLineNum = 8388686;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
_newnrodocumento = "NEWXXXXXXX";
RDebugUtils.currentLine=8388688;
 //BA.debugLineNum = 8388688;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
_docen_neto_bruto = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_TipoValor_Bruto_Neto")));
RDebugUtils.currentLine=8388690;
 //BA.debugLineNum = 8388690;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
_centro_costo = "LUVTVEN";
RDebugUtils.currentLine=8388691;
 //BA.debugLineNum = 8388691;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
_centro_costo = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_centro_costo)));
RDebugUtils.currentLine=8388693;
 //BA.debugLineNum = 8388693;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
_listaprecios = parent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=8388695;
 //BA.debugLineNum = 8388695;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoDoc".toLowerCase()),(Object)("NVV"));
RDebugUtils.currentLine=8388696;
 //BA.debugLineNum = 8388696;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("NroDocumento".toLowerCase()),(Object)(_newnrodocumento));
RDebugUtils.currentLine=8388698;
 //BA.debugLineNum = 8388698;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=8388699;
 //BA.debugLineNum = 8388699;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=8388700;
 //BA.debugLineNum = 8388700;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=8388701;
 //BA.debugLineNum = 8388701;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=8388703;
 //BA.debugLineNum = 8388703;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Cuotas".toLowerCase()),(Object)(_cuotas));
RDebugUtils.currentLine=8388704;
 //BA.debugLineNum = 8388704;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=8388705;
 //BA.debugLineNum = 8388705;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=8388707;
 //BA.debugLineNum = 8388707;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized())) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=8388708;
 //BA.debugLineNum = 8388708;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Def";
__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = parent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=8388711;
 //BA.debugLineNum = 8388711;BA.debugLine="Dim CodEntidad As String = Row_Entidad.Get(\"KOEN\"";
_codentidad = BA.ObjectToString(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOEN")));
RDebugUtils.currentLine=8388712;
 //BA.debugLineNum = 8388712;BA.debugLine="Dim CodSucEntidad As String = Row_Entidad.Get(\"SU";
_codsucentidad = BA.ObjectToString(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("SUEN")));
RDebugUtils.currentLine=8388713;
 //BA.debugLineNum = 8388713;BA.debugLine="Dim Nombre_Entidad As String = Row_Entidad.Get(\"N";
_nombre_entidad = BA.ObjectToString(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOEN")));
RDebugUtils.currentLine=8388715;
 //BA.debugLineNum = 8388715;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidad".toLowerCase()),(Object)(_codentidad));
RDebugUtils.currentLine=8388716;
 //BA.debugLineNum = 8388716;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidad".toLowerCase()),(Object)(_codsucentidad));
RDebugUtils.currentLine=8388717;
 //BA.debugLineNum = 8388717;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(_nombre_entidad));
RDebugUtils.currentLine=8388719;
 //BA.debugLineNum = 8388719;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
RDebugUtils.currentLine=8388720;
 //BA.debugLineNum = 8388720;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodFuncionario".toLowerCase()),parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=8388721;
 //BA.debugLineNum = 8388721;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("NomFuncionario".toLowerCase()),parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
RDebugUtils.currentLine=8388723;
 //BA.debugLineNum = 8388723;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Moneda_Doc".toLowerCase()),(Object)(_moneda_doc));
RDebugUtils.currentLine=8388724;
 //BA.debugLineNum = 8388724;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoMoneda".toLowerCase()),(Object)(_tipomoneda));
RDebugUtils.currentLine=8388725;
 //BA.debugLineNum = 8388725;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Valor_Dolar".toLowerCase()),(Object)(_valor_dolar));
RDebugUtils.currentLine=8388726;
 //BA.debugLineNum = 8388726;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Tasadorig_Doc".toLowerCase()),(Object)(_tasadorig_doc));
RDebugUtils.currentLine=8388728;
 //BA.debugLineNum = 8388728;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DocEn_Neto_Bruto".toLowerCase()),(Object)(_docen_neto_bruto));
RDebugUtils.currentLine=8388730;
 //BA.debugLineNum = 8388730;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Centro_Costo".toLowerCase()),(Object)(_centro_costo));
RDebugUtils.currentLine=8388732;
 //BA.debugLineNum = 8388732;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388733;
 //BA.debugLineNum = 8388733;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388734;
 //BA.debugLineNum = 8388734;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad_Fisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388735;
 //BA.debugLineNum = 8388735;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fun_Auto_Deuda_Ven".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388736;
 //BA.debugLineNum = 8388736;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fun_Auto_Stock_Ins".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388737;
 //BA.debugLineNum = 8388737;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fun_Auto_Cupo_Exe".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388738;
 //BA.debugLineNum = 8388738;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("SubTido".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=8388741;
 //BA.debugLineNum = 8388741;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=8388743;
 //BA.debugLineNum = 8388743;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fal";
__ref._sb_actualizar_datos_de_la_entidad /*String*/ (null,__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ ,parent.__c.False,parent.__c.False);
RDebugUtils.currentLine=8388745;
 //BA.debugLineNum = 8388745;BA.debugLine="If Idmaeedo <> 0 Then";
if (true) break;

case 9:
//if
this.state = 27;
if (__ref._idmaeedo /*int*/ !=0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=8388747;
 //BA.debugLineNum = 8388747;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
parent.__c.ProgressDialogShow(parent.getActivityBA(),BA.ObjectToCharSequence("Buscando productos..."));
RDebugUtils.currentLine=8388749;
 //BA.debugLineNum = 8388749;BA.debugLine="Wait For(Sb_Traer_Encabezado) Complete (FEnc As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_traer_encabezado /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 28;
return;
case 28:
//C
this.state = 12;
_fenc = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8388751;
 //BA.debugLineNum = 8388751;BA.debugLine="If FEnc.IsInitialized Then";
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
RDebugUtils.currentLine=8388753;
 //BA.debugLineNum = 8388753;BA.debugLine="Fila_Encabezado.Put(\"empresa\",FEnc.Get(\"EMPRESA";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("empresa"),_fenc.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=8388754;
 //BA.debugLineNum = 8388754;BA.debugLine="Fila_Encabezado.Put(\"sucursal\",FEnc.Get(\"SUDO\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("sucursal"),_fenc.Get((Object)("SUDO")));
RDebugUtils.currentLine=8388755;
 //BA.debugLineNum = 8388755;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=8388757;
 //BA.debugLineNum = 8388757;BA.debugLine="Variables.Gl_Empresa = FEnc.Get(\"EMPRESA\")";
parent._variables._gl_empresa /*String*/  = BA.ObjectToString(_fenc.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=8388758;
 //BA.debugLineNum = 8388758;BA.debugLine="Variables.Gl_Sucursal = FEnc.Get(\"SUDO\")";
parent._variables._gl_sucursal /*String*/  = BA.ObjectToString(_fenc.Get((Object)("SUDO")));
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=8388762;
 //BA.debugLineNum = 8388762;BA.debugLine="Wait For(Sb_Incorporar_Productos) Complete (Resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_incorporar_productos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 16;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=8388764;
 //BA.debugLineNum = 8388764;BA.debugLine="Wait For(Sb_Traer_Observaciones) Complete (Flobs";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_traer_observaciones /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 16;
_flobs = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8388766;
 //BA.debugLineNum = 8388766;BA.debugLine="If Flobs.IsInitialized Then";
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
RDebugUtils.currentLine=8388767;
 //BA.debugLineNum = 8388767;BA.debugLine="Fila_Observaciones.Put(\"observaciones\",Flobs.Ge";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("observaciones"),_flobs.Get((Object)("OBDO")));
RDebugUtils.currentLine=8388768;
 //BA.debugLineNum = 8388768;BA.debugLine="Fila_Observaciones.Put(\"orden_compra\",Flobs.Get";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orden_compra"),_flobs.Get((Object)("OCDO")));
RDebugUtils.currentLine=8388769;
 //BA.debugLineNum = 8388769;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observaci";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Observaciones_Doc",__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
 if (true) break;
;
RDebugUtils.currentLine=8388773;
 //BA.debugLineNum = 8388773;BA.debugLine="If B4A_DespachoSimple Then";

case 19:
//if
this.state = 26;
if (_b4a_despachosimple) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=8388775;
 //BA.debugLineNum = 8388775;BA.debugLine="Wait For(Sb_Traer_Despacho_Simple) Complete (Fl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_traer_despacho_simple /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_fldesp = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8388777;
 //BA.debugLineNum = 8388777;BA.debugLine="If Fldesp.IsInitialized Then";
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
RDebugUtils.currentLine=8388779;
 //BA.debugLineNum = 8388779;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\".ToLowerC";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodTipoDespacho".toLowerCase()),_fldesp.Get((Object)("CodTipoDespacho")));
RDebugUtils.currentLine=8388780;
 //BA.debugLineNum = 8388780;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\".ToLowerCase";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoDespacho".toLowerCase()),_fldesp.Get((Object)("TipoDespacho")));
RDebugUtils.currentLine=8388782;
 //BA.debugLineNum = 8388782;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\".ToLowerC";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodTipoPagoDesp".toLowerCase()),_fldesp.Get((Object)("CodTipoPagoDesp")));
RDebugUtils.currentLine=8388783;
 //BA.debugLineNum = 8388783;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\".ToLowerCase";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoPagoDesp".toLowerCase()),_fldesp.Get((Object)("TipoPagoDesp")));
RDebugUtils.currentLine=8388785;
 //BA.debugLineNum = 8388785;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\".ToLowerCas";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodDocDestino".toLowerCase()),_fldesp.Get((Object)("CodDocDestino")));
RDebugUtils.currentLine=8388786;
 //BA.debugLineNum = 8388786;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\".ToLowerCase,F";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DocDestino".toLowerCase()),_fldesp.Get((Object)("DocDestino")));
RDebugUtils.currentLine=8388788;
 //BA.debugLineNum = 8388788;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\".ToLowerCa";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TransporteDesp".toLowerCase()),_fldesp.Get((Object)("TransporteDesp")));
RDebugUtils.currentLine=8388789;
 //BA.debugLineNum = 8388789;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\".ToLowerCas";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DireccionDesp".toLowerCase()),_fldesp.Get((Object)("DireccionDesp")));
RDebugUtils.currentLine=8388790;
 //BA.debugLineNum = 8388790;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\".ToLowe";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ObservacionesDesp".toLowerCase()),_fldesp.Get((Object)("ObservacionesDesp")));
RDebugUtils.currentLine=8388792;
 //BA.debugLineNum = 8388792;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFac";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"DespaFacil_Doc",__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
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
RDebugUtils.currentLine=8388798;
 //BA.debugLineNum = 8388798;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=8388801;
 //BA.debugLineNum = 8388801;BA.debugLine="Return Id_DocEnc";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._id_docenc /*int*/ ));return;};
RDebugUtils.currentLine=8388803;
 //BA.debugLineNum = 8388803;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_encabezado(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_encabezado", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_encabezado", null));}
ResumableSub_Sb_Traer_Encabezado rsub = new ResumableSub_Sb_Traer_Encabezado(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Encabezado extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Encabezado(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
BaKapp.Movil.Tag.crear_documento parent;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Consulta_Sql = \"Select * From MAEEDO Where IDMAEE";
__ref._consulta_sql /*String*/  = "Select * From MAEEDO Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ );
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_encabezado"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="Fila =Filas.Get(0)";
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
RDebugUtils.currentLine=9043991;
 //BA.debugLineNum = 9043991;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("69043991",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9043994;
 //BA.debugLineNum = 9043994;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=9043996;
 //BA.debugLineNum = 9043996;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_observaciones(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_observaciones", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_observaciones", null));}
ResumableSub_Sb_Traer_Observaciones rsub = new ResumableSub_Sb_Traer_Observaciones(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Observaciones extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Observaciones(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
BaKapp.Movil.Tag.crear_documento parent;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Consulta_Sql = \"Select * From MAEEDOOB Where IDMA";
__ref._consulta_sql /*String*/  = "Select * From MAEEDOOB Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ );
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_observaciones"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="Fila =Filas.Get(0)";
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
RDebugUtils.currentLine=9109527;
 //BA.debugLineNum = 9109527;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("69109527",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9109530;
 //BA.debugLineNum = 9109530;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=9109532;
 //BA.debugLineNum = 9109532;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_despacho_simple(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_despacho_simple", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_despacho_simple", null));}
ResumableSub_Sb_Traer_Despacho_Simple rsub = new ResumableSub_Sb_Traer_Despacho_Simple(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Despacho_Simple extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Despacho_Simple(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
BaKapp.Movil.Tag.crear_documento parent;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_Despacho_Simple Where Idmaeedo = "+BA.NumberToString(__ref._idmaeedo /*int*/ );
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_despacho_simple"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="Fila =Filas.Get(0)";
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
RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("69175063",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=9175068;
 //BA.debugLineNum = 9175068;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sb_traer_entidad(BaKapp.Movil.Tag.crear_documento __ref,String _koen,String _suen) throws Exception{
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "sb_traer_entidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sb_traer_entidad", new Object[] {_koen,_suen}));}
ResumableSub_Sb_Traer_Entidad rsub = new ResumableSub_Sb_Traer_Entidad(this,__ref,_koen,_suen);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Sb_Traer_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Entidad(BaKapp.Movil.Tag.crear_documento parent,BaKapp.Movil.Tag.crear_documento __ref,String _koen,String _suen) {
this.parent = parent;
this.__ref = __ref;
this._koen = _koen;
this._suen = _suen;
this.__ref = parent;
}
BaKapp.Movil.Tag.crear_documento __ref;
BaKapp.Movil.Tag.crear_documento parent;
String _koen;
String _suen;
anywheresoftware.b4a.objects.collections.Map _fila = null;
BaKapp.Movil.Tag.httpjob _js = null;
String _vjson = "";
anywheresoftware.b4a.objects.collections.List _filas = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crear_documento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_koen,_suen);
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_entidad"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=8585227;
 //BA.debugLineNum = 8585227;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=8585231;
 //BA.debugLineNum = 8585231;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="Row_Entidad = Fila";
__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = _fila;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=8585239;
 //BA.debugLineNum = 8585239;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("68585239",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=8585242;
 //BA.debugLineNum = 8585242;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=8585244;
 //BA.debugLineNum = 8585244;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}