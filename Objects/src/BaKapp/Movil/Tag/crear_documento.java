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
public String  _class_globals(BaKapp.Movil.Tag.crear_documento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crear_documento";
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Private Consulta_Sql As String";
_consulta_sql = "";
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Public Idmaeedo As Int";
_idmaeedo = 0;
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="Public Id_DocEnc As Int";
_id_docenc = 0;
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="Public Row_Entidad As Map";
_row_entidad = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="Public Fila_Encabezado As Map";
_fila_encabezado = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Public Fila_Observaciones As Map";
_fila_observaciones = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Public Fila_DespaFacil As Map";
_fila_despafacil = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Public Cambiar_Entidad As Boolean";
_cambiar_entidad = false;
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="Public Crear_NVV_Desde_COV As Boolean";
_crear_nvv_desde_cov = false;
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="Public Usar_Precio_Original As Boolean";
_usar_precio_original = false;
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="Private Fila_IdEnc As Map";
_fila_idenc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="Public ChkValores As Boolean";
_chkvalores = false;
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="Dim FUNCIONARIO As String '= Variables.Global_Row";
_funcionario = "";
RDebugUtils.currentLine=11468820;
 //BA.debugLineNum = 11468820;BA.debugLine="Dim TotalNetoDoc As Double";
_totalnetodoc = 0;
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="Dim TotalBrutoDoc As Double";
_totalbrutodoc = 0;
RDebugUtils.currentLine=11468823;
 //BA.debugLineNum = 11468823;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=11468825;
 //BA.debugLineNum = 11468825;BA.debugLine="End Sub";
return "";
}
public String  _initialize(BaKapp.Movil.Tag.crear_documento __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="crear_documento";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
__ref._funcionario /*String*/  = BA.ObjectToString(_variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub Sb_Actualizar_Datos_De_La_Entidad(RowEntidad A";
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = __c.DateTime.getNow();
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="Dim Cuotas As Int = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="Dim Forma_pago As String";
_forma_pago = "";
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11665424;
 //BA.debugLineNum = 11665424;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11665425;
 //BA.debugLineNum = 11665425;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11665428;
 //BA.debugLineNum = 11665428;BA.debugLine="Dim Lista As String";
_lista = "";
RDebugUtils.currentLine=11665429;
 //BA.debugLineNum = 11665429;BA.debugLine="Dim Permiso As String";
_permiso = "";
RDebugUtils.currentLine=11665431;
 //BA.debugLineNum = 11665431;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
_listaprecios = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=11665432;
 //BA.debugLineNum = 11665432;BA.debugLine="Lista = ListaPrecios";
_lista = _listaprecios;
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
_cuotas = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("NUVECR"))));
RDebugUtils.currentLine=11665435;
 //BA.debugLineNum = 11665435;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
_dias_1er_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIPRVE"))));
RDebugUtils.currentLine=11665436;
 //BA.debugLineNum = 11665436;BA.debugLine="Dias_Vencimiento = RowEntidad.Get(\"DIASVENCI\")";
_dias_vencimiento = (int)(BA.ObjectToNumber(_rowentidad.Get((Object)("DIASVENCI"))));
RDebugUtils.currentLine=11665438;
 //BA.debugLineNum = 11665438;BA.debugLine="Dim Rut As String";
_rut = "";
RDebugUtils.currentLine=11665440;
 //BA.debugLineNum = 11665440;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidad".toLowerCase()),_rowentidad.Get((Object)("KOEN")));
RDebugUtils.currentLine=11665441;
 //BA.debugLineNum = 11665441;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidad".toLowerCase()),_rowentidad.Get((Object)("SUEN")));
RDebugUtils.currentLine=11665442;
 //BA.debugLineNum = 11665442;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad".toLowerCase()),_rowentidad.Get((Object)("NOKOEN")));
RDebugUtils.currentLine=11665451;
 //BA.debugLineNum = 11665451;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
_lista = BA.ObjectToString(_rowentidad.Get((Object)("LVEN")));
RDebugUtils.currentLine=11665452;
 //BA.debugLineNum = 11665452;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
_lista = _funciones._mid /*String*/ (getActivityBA(),_lista,(int) (6),(int) (3));
RDebugUtils.currentLine=11665454;
 //BA.debugLineNum = 11665454;BA.debugLine="Permiso = \"Lp-\" & Lista";
_permiso = "Lp-"+_lista;
RDebugUtils.currentLine=11665459;
 //BA.debugLineNum = 11665459;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
if (_cuotas==0) { 
_cuotas = (int) (1);};
RDebugUtils.currentLine=11665461;
 //BA.debugLineNum = 11665461;BA.debugLine="Dim Cuotas_F(Cuotas - 1) As Long";
_cuotas_f = new long[(int) (_cuotas-1)];
;
RDebugUtils.currentLine=11665463;
 //BA.debugLineNum = 11665463;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
if (__c.Not(_aplicar_venciminetos)) { 
RDebugUtils.currentLine=11665464;
 //BA.debugLineNum = 11665464;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
 };
RDebugUtils.currentLine=11665467;
 //BA.debugLineNum = 11665467;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (_dias_1er_vencimiento>0) { 
RDebugUtils.currentLine=11665474;
 //BA.debugLineNum = 11665474;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=11665475;
 //BA.debugLineNum = 11665475;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=11665481;
 //BA.debugLineNum = 11665481;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
_fechasvenci = _fechaemision;
RDebugUtils.currentLine=11665482;
 //BA.debugLineNum = 11665482;BA.debugLine="Dim dias As Int";
_dias = 0;
RDebugUtils.currentLine=11665484;
 //BA.debugLineNum = 11665484;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
if (_dias_1er_vencimiento>0) { 
RDebugUtils.currentLine=11665485;
 //BA.debugLineNum = 11665485;BA.debugLine="dias = Dias_1er_Vencimiento";
_dias = _dias_1er_vencimiento;
RDebugUtils.currentLine=11665486;
 //BA.debugLineNum = 11665486;BA.debugLine="For i = 1 To Cuotas";
{
final int step40 = 1;
final int limit40 = _cuotas;
_i = (int) (1) ;
for (;_i <= limit40 ;_i = _i + step40 ) {
RDebugUtils.currentLine=11665489;
 //BA.debugLineNum = 11665489;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
_fechasvenci = __c.DateTime.Add(_fechasvenci,(int) (0),(int) (0),_dias);
RDebugUtils.currentLine=11665491;
 //BA.debugLineNum = 11665491;BA.debugLine="Cuotas_F(i - 1) = FechasVenci";
_cuotas_f[(int) (_i-1)] = _fechasvenci;
RDebugUtils.currentLine=11665492;
 //BA.debugLineNum = 11665492;BA.debugLine="dias = Dias_Vencimiento";
_dias = _dias_vencimiento;
 }
};
RDebugUtils.currentLine=11665494;
 //BA.debugLineNum = 11665494;BA.debugLine="FechaUltVencimiento = FechasVenci";
_fechaultvencimiento = _fechasvenci;
 }else {
RDebugUtils.currentLine=11665496;
 //BA.debugLineNum = 11665496;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
 };
RDebugUtils.currentLine=11665499;
 //BA.debugLineNum = 11665499;BA.debugLine="Fecha_1er_Vencimiento = Cuotas_F(0)";
_fecha_1er_vencimiento = _cuotas_f[(int) (0)];
 }else {
RDebugUtils.currentLine=11665516;
 //BA.debugLineNum = 11665516;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=11665517;
 //BA.debugLineNum = 11665517;BA.debugLine="FechaUltVencimiento = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=11665518;
 //BA.debugLineNum = 11665518;BA.debugLine="Cuotas = 1";
_cuotas = (int) (1);
RDebugUtils.currentLine=11665519;
 //BA.debugLineNum = 11665519;BA.debugLine="Dias_1er_Vencimiento = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=11665520;
 //BA.debugLineNum = 11665520;BA.debugLine="Dias_Vencimiento = 0";
_dias_vencimiento = (int) (0);
 };
RDebugUtils.currentLine=11665524;
 //BA.debugLineNum = 11665524;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
_forma_pago = BA.ObjectToString(_rowentidad.Get((Object)("CPEN")));
RDebugUtils.currentLine=11665526;
 //BA.debugLineNum = 11665526;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=11665527;
 //BA.debugLineNum = 11665527;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=11665528;
 //BA.debugLineNum = 11665528;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=11665529;
 //BA.debugLineNum = 11665529;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=11665531;
 //BA.debugLineNum = 11665531;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Cuotas"),(Object)(_cuotas));
RDebugUtils.currentLine=11665532;
 //BA.debugLineNum = 11665532;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_1er_Vencimiento"),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=11665533;
 //BA.debugLineNum = 11665533;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_Vencimiento"),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=11665534;
 //BA.debugLineNum = 11665534;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Forma_pago"),(Object)(_forma_pago));
RDebugUtils.currentLine=11665536;
 //BA.debugLineNum = 11665536;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
if (_revisar_permiso_lista_precio) { 
RDebugUtils.currentLine=11665538;
 //BA.debugLineNum = 11665538;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean '= TienePermi";
_tiene_permiso_lista = false;
RDebugUtils.currentLine=11665539;
 //BA.debugLineNum = 11665539;BA.debugLine="Dim Cambiar_lista As Boolean";
_cambiar_lista = false;
RDebugUtils.currentLine=11665540;
 //BA.debugLineNum = 11665540;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
_mostrar_mensaje_cambio_lista = false;
RDebugUtils.currentLine=11665543;
 //BA.debugLineNum = 11665543;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
{
final int step70 = 1;
final int limit70 = (int) (_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
RDebugUtils.currentLine=11665544;
 //BA.debugLineNum = 11665544;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=11665545;
 //BA.debugLineNum = 11665545;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
_value = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=11665547;
 //BA.debugLineNum = 11665547;BA.debugLine="If Lista = value Then";
if ((_lista).equals(_value)) { 
RDebugUtils.currentLine=11665548;
 //BA.debugLineNum = 11665548;BA.debugLine="Tiene_Permiso_Lista = True";
_tiene_permiso_lista = __c.True;
RDebugUtils.currentLine=11665549;
 //BA.debugLineNum = 11665549;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=11665554;
 //BA.debugLineNum = 11665554;BA.debugLine="If Tiene_Permiso_Lista Then";
if (_tiene_permiso_lista) { 
RDebugUtils.currentLine=11665555;
 //BA.debugLineNum = 11665555;BA.debugLine="Cambiar_lista = True";
_cambiar_lista = __c.True;
 }else {
RDebugUtils.currentLine=11665558;
 //BA.debugLineNum = 11665558;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=11665560;
 //BA.debugLineNum = 11665560;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __c.LoadBitmap(__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=11665562;
 //BA.debugLineNum = 11665562;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
__c.Msgbox2Async(BA.ObjectToCharSequence("Usted no tiene permiso para trabajar con la lista"+__c.CRLF+"La lista seguirá siendo:"+_listaprecios),BA.ObjectToCharSequence("Validación"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,__c.False);
 };
RDebugUtils.currentLine=11665568;
 //BA.debugLineNum = 11665568;BA.debugLine="If Cambiar_lista Then";
if (_cambiar_lista) { 
RDebugUtils.currentLine=11665569;
 //BA.debugLineNum = 11665569;BA.debugLine="ListaPrecios = Lista";
_listaprecios = _lista;
RDebugUtils.currentLine=11665570;
 //BA.debugLineNum = 11665570;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
 };
 };
RDebugUtils.currentLine=11665575;
 //BA.debugLineNum = 11665575;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
{
final int step90 = 1;
final int limit90 = (int) (_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit90 ;_i = _i + step90 ) {
RDebugUtils.currentLine=11665577;
 //BA.debugLineNum = 11665577;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_variables._global_listas_precios_usuario /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=11665578;
 //BA.debugLineNum = 11665578;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
_kolt = BA.ObjectToString(_m.Get((Object)("Kolt")));
RDebugUtils.currentLine=11665579;
 //BA.debugLineNum = 11665579;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
_nokolt = BA.ObjectToString(_m.Get((Object)("Nokolt")));
RDebugUtils.currentLine=11665581;
 //BA.debugLineNum = 11665581;BA.debugLine="If Lista = Kolt Then";
if ((_lista).equals(_kolt)) { 
RDebugUtils.currentLine=11665583;
 //BA.debugLineNum = 11665583;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=11665590;
 //BA.debugLineNum = 11665590;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
_bloqueado = BA.ObjectToBoolean(_rowentidad.Get((Object)("BLOQUEADO")));
RDebugUtils.currentLine=11665592;
 //BA.debugLineNum = 11665592;BA.debugLine="If Bloqueado Then";
if (_bloqueado) { 
RDebugUtils.currentLine=11665594;
 //BA.debugLineNum = 11665594;BA.debugLine="Dim bmp1 As Bitmap";
_bmp1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=11665596;
 //BA.debugLineNum = 11665596;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __c.LoadBitmap(__c.File.getDirAssets(),"user.png");
RDebugUtils.currentLine=11665598;
 //BA.debugLineNum = 11665598;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
__c.Msgbox2Async(BA.ObjectToCharSequence("¡CLIENTE BLOQUEADO!"+__c.CRLF+"LSolo es posible generar cotizaciones"),BA.ObjectToCharSequence("CLIENTE MOROSO"),"Ok","","",__ref._bmp1 /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ,ba,__c.False);
 };
RDebugUtils.currentLine=11665603;
 //BA.debugLineNum = 11665603;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim CampoPrecio As String";
_campoprecio = "";
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Consulta_Sql = \"Select * From MAEDDO Where IDMAEE";
__ref._consulta_sql /*String*/  = "Select * From MAEDDO Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ )+" Order By IDMAEDDO";
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="ChkValores = True";
__ref._chkvalores /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="If ChkValores Then";
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
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="CampoPrecio = \"PPPRNE\"";
_campoprecio = "PPPRNE";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="CampoPrecio = \"PPPRBR\"";
_campoprecio = "PPPRBR";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=11862034;
 //BA.debugLineNum = 11862034;BA.debugLine="Consulta_Sql = \"Select MAEDDO.*,Case WHEN UDTRPR";
__ref._consulta_sql /*String*/  = "Select MAEDDO.*,Case WHEN UDTRPR = 1 Then CAPRCO1-CAPREX1 Else CAPRCO2-CAPREX2 END AS 'Cantidad',"+parent.__c.CRLF+"CAPRCO1-CAPREX1 As 'CantUd1_Dori',CAPRCO2-CAPREX2 AS 'CantUd2_Dori',"+parent.__c.CRLF+"Case WHEN UDTRPR = 1 Then "+_campoprecio+" Else "+_campoprecio+"*RLUDPR END AS 'Precio'"+parent.__c.CRLF+"From MAEDDO WITH ( NOLOCK )"+parent.__c.CRLF+"Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ )+" And ( ESLIDO<>'C' OR ESFALI='I')"+parent.__c.CRLF+"Order by IDMAEDDO";
RDebugUtils.currentLine=11862041;
 //BA.debugLineNum = 11862041;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=11862042;
 //BA.debugLineNum = 11862042;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), (Object)(_js));
this.state = 52;
return;
case 52:
//C
this.state = 7;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=11862044;
 //BA.debugLineNum = 11862044;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=11862046;
 //BA.debugLineNum = 11862046;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=11862048;
 //BA.debugLineNum = 11862048;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=11862050;
 //BA.debugLineNum = 11862050;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=11862052;
 //BA.debugLineNum = 11862052;BA.debugLine="For Each Fila As Map In Lista";
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
RDebugUtils.currentLine=11862054;
 //BA.debugLineNum = 11862054;BA.debugLine="Dim Codigo As String = Fila.Get(\"KOPRCT\")";
_codigo = BA.ObjectToString(_fila.Get((Object)("KOPRCT")));
RDebugUtils.currentLine=11862055;
 //BA.debugLineNum = 11862055;BA.debugLine="Dim Descripcion As String = Fila.Get(\"NOKOPR\")";
_descripcion = BA.ObjectToString(_fila.Get((Object)("NOKOPR")));
RDebugUtils.currentLine=11862056;
 //BA.debugLineNum = 11862056;BA.debugLine="Dim Prct As Boolean = Fila.Get(\"PRCT\")";
_prct = BA.ObjectToBoolean(_fila.Get((Object)("PRCT")));
RDebugUtils.currentLine=11862057;
 //BA.debugLineNum = 11862057;BA.debugLine="Dim Tict As String = Fila.Get(\"TICT\")";
_tict = BA.ObjectToString(_fila.Get((Object)("TICT")));
RDebugUtils.currentLine=11862058;
 //BA.debugLineNum = 11862058;BA.debugLine="Dim Nulido As String = Fila.Get(\"NULIDO\")";
_nulido = BA.ObjectToString(_fila.Get((Object)("NULIDO")));
RDebugUtils.currentLine=11862059;
 //BA.debugLineNum = 11862059;BA.debugLine="Dim Podtglli As Double = Fila.Get(\"PODTGLLI\")";
_podtglli = (double)(BA.ObjectToNumber(_fila.Get((Object)("PODTGLLI"))));
RDebugUtils.currentLine=11862060;
 //BA.debugLineNum = 11862060;BA.debugLine="Dim Rludpr As Double = Fila.Get(\"RLUDPR\")";
_rludpr = (double)(BA.ObjectToNumber(_fila.Get((Object)("RLUDPR"))));
RDebugUtils.currentLine=11862061;
 //BA.debugLineNum = 11862061;BA.debugLine="Dim Udtpr As Int = Fila.Get(\"UDTRPR\")";
_udtpr = (int)(BA.ObjectToNumber(_fila.Get((Object)("UDTRPR"))));
RDebugUtils.currentLine=11862062;
 //BA.debugLineNum = 11862062;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"Cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(_fila.Get((Object)("Cantidad"))));
RDebugUtils.currentLine=11862063;
 //BA.debugLineNum = 11862063;BA.debugLine="Dim Vaneli As Double = Fila.Get(\"VANELI\")";
_vaneli = (double)(BA.ObjectToNumber(_fila.Get((Object)("VANELI"))));
RDebugUtils.currentLine=11862064;
 //BA.debugLineNum = 11862064;BA.debugLine="Dim Vabrdo As Double = Fila.Get(\"VABRLI\")";
_vabrdo = (double)(BA.ObjectToNumber(_fila.Get((Object)("VABRLI"))));
RDebugUtils.currentLine=11862066;
 //BA.debugLineNum = 11862066;BA.debugLine="Dim CodFuncionario As String = Fila.Get(\"KOFUL";
_codfuncionario = BA.ObjectToString(_fila.Get((Object)("KOFULIDO")));
RDebugUtils.currentLine=11862067;
 //BA.debugLineNum = 11862067;BA.debugLine="Dim Codlista As String = Fila.Get(\"KOLTPR\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("KOLTPR")));
RDebugUtils.currentLine=11862068;
 //BA.debugLineNum = 11862068;BA.debugLine="Codlista = Codlista.Replace(\"TABPP\",\"\")";
_codlista = _codlista.replace("TABPP","");
RDebugUtils.currentLine=11862069;
 //BA.debugLineNum = 11862069;BA.debugLine="Dim Moneda As String = Fila.Get(\"MOPPPR\")";
_moneda = BA.ObjectToString(_fila.Get((Object)("MOPPPR")));
RDebugUtils.currentLine=11862070;
 //BA.debugLineNum = 11862070;BA.debugLine="Dim Tipo_moneda As String = Fila.Get(\"TIMOPPPR";
_tipo_moneda = BA.ObjectToString(_fila.Get((Object)("TIMOPPPR")));
RDebugUtils.currentLine=11862071;
 //BA.debugLineNum = 11862071;BA.debugLine="Dim Tipo_cambio As Double = Fila.Get(\"TAMOPPPR";
_tipo_cambio = (double)(BA.ObjectToNumber(_fila.Get((Object)("TAMOPPPR"))));
RDebugUtils.currentLine=11862073;
 //BA.debugLineNum = 11862073;BA.debugLine="Dim Idmaeedo_Dori As Int = Fila.Get(\"IDMAEEDO\"";
_idmaeedo_dori = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEEDO"))));
RDebugUtils.currentLine=11862074;
 //BA.debugLineNum = 11862074;BA.debugLine="Dim Idmaeddo_Dori As Int = Fila.Get(\"IDMAEDDO\"";
_idmaeddo_dori = (int)(BA.ObjectToNumber(_fila.Get((Object)("IDMAEDDO"))));
RDebugUtils.currentLine=11862076;
 //BA.debugLineNum = 11862076;BA.debugLine="Dim Empresa As String = Fila.Get(\"EMPRESA\")";
_empresa = BA.ObjectToString(_fila.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=11862077;
 //BA.debugLineNum = 11862077;BA.debugLine="Dim Sucursal As String = Fila.Get(\"SULIDO\")";
_sucursal = BA.ObjectToString(_fila.Get((Object)("SULIDO")));
RDebugUtils.currentLine=11862078;
 //BA.debugLineNum = 11862078;BA.debugLine="Dim Bodega As String = Fila.Get(\"BOSULIDO\")";
_bodega = BA.ObjectToString(_fila.Get((Object)("BOSULIDO")));
RDebugUtils.currentLine=11862080;
 //BA.debugLineNum = 11862080;BA.debugLine="Variables.Gl_Bodega = Bodega";
parent._variables._gl_bodega /*String*/  = _bodega;
RDebugUtils.currentLine=11862082;
 //BA.debugLineNum = 11862082;BA.debugLine="Dim Emprepa As String = Fila.Get(\"EMPRESA\")";
_emprepa = BA.ObjectToString(_fila.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=11862083;
 //BA.debugLineNum = 11862083;BA.debugLine="Dim Tidopa As String = Fila.Get(\"TIDO\")";
_tidopa = BA.ObjectToString(_fila.Get((Object)("TIDO")));
RDebugUtils.currentLine=11862084;
 //BA.debugLineNum = 11862084;BA.debugLine="Dim Nudopa As String = Fila.Get(\"NUDO\")";
_nudopa = BA.ObjectToString(_fila.Get((Object)("NUDO")));
RDebugUtils.currentLine=11862085;
 //BA.debugLineNum = 11862085;BA.debugLine="Dim Endopa As String = Fila.Get(\"ENDO\")";
_endopa = BA.ObjectToString(_fila.Get((Object)("ENDO")));
RDebugUtils.currentLine=11862086;
 //BA.debugLineNum = 11862086;BA.debugLine="Dim Nulidopa As String = Fila.Get(\"NULIDO\")";
_nulidopa = BA.ObjectToString(_fila.Get((Object)("NULIDO")));
RDebugUtils.currentLine=11862088;
 //BA.debugLineNum = 11862088;BA.debugLine="Dim CantUd1_Dori As Double = Fila.Get(\"CantUd1";
_cantud1_dori = (double)(BA.ObjectToNumber(_fila.Get((Object)("CantUd1_Dori"))));
RDebugUtils.currentLine=11862089;
 //BA.debugLineNum = 11862089;BA.debugLine="Dim CantUd2_Dori As Double = Fila.Get(\"CantUd2";
_cantud2_dori = (double)(BA.ObjectToNumber(_fila.Get((Object)("CantUd2_Dori"))));
RDebugUtils.currentLine=11862091;
 //BA.debugLineNum = 11862091;BA.debugLine="Dim Precio As Double = Fila.Get(\"Precio\")";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)("Precio"))));
RDebugUtils.currentLine=11862093;
 //BA.debugLineNum = 11862093;BA.debugLine="If Usar_Precio_Original And Not(Prct) Then";
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
RDebugUtils.currentLine=11862094;
 //BA.debugLineNum = 11862094;BA.debugLine="Wait For(Sb_Traer_Producto2(Codigo,Empresa,Su";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_producto2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigo,_empresa,_sucursal,_bodega));
this.state = 55;
return;
case 55:
//C
this.state = 19;
_rowproducto = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11862095;
 //BA.debugLineNum = 11862095;BA.debugLine="Precio = RowProducto.Get(\"Precio\")";
_precio = (double)(BA.ObjectToNumber(_rowproducto.Get((Object)("Precio"))));
 if (true) break;
;
RDebugUtils.currentLine=11862098;
 //BA.debugLineNum = 11862098;BA.debugLine="If Crear_NVV_Desde_COV = False Then";

case 19:
//if
this.state = 22;
if (__ref._crear_nvv_desde_cov /*boolean*/ ==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=11862100;
 //BA.debugLineNum = 11862100;BA.debugLine="Idmaeedo_Dori = 0";
_idmaeedo_dori = (int) (0);
RDebugUtils.currentLine=11862101;
 //BA.debugLineNum = 11862101;BA.debugLine="Idmaeddo_Dori = 0";
_idmaeddo_dori = (int) (0);
RDebugUtils.currentLine=11862102;
 //BA.debugLineNum = 11862102;BA.debugLine="Emprepa = \"\"";
_emprepa = "";
RDebugUtils.currentLine=11862103;
 //BA.debugLineNum = 11862103;BA.debugLine="Tidopa = \"\"";
_tidopa = "";
RDebugUtils.currentLine=11862104;
 //BA.debugLineNum = 11862104;BA.debugLine="Nudopa = \"\"";
_nudopa = "";
RDebugUtils.currentLine=11862105;
 //BA.debugLineNum = 11862105;BA.debugLine="Endopa = \"\"";
_endopa = "";
RDebugUtils.currentLine=11862106;
 //BA.debugLineNum = 11862106;BA.debugLine="Nulidopa = \"\"";
_nulidopa = "";
 if (true) break;
;
RDebugUtils.currentLine=11862110;
 //BA.debugLineNum = 11862110;BA.debugLine="If Udtpr = 2 Then";

case 22:
//if
this.state = 25;
if (_udtpr==2) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=11862111;
 //BA.debugLineNum = 11862111;BA.debugLine="Precio = Precio*Rludpr";
_precio = _precio*_rludpr;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=11862114;
 //BA.debugLineNum = 11862114;BA.debugLine="ProgressDialogShow(Codigo & \"-\" & Descripcion)";
parent.__c.ProgressDialogShow(parent.getActivityBA(),BA.ObjectToCharSequence(_codigo+"-"+_descripcion));
RDebugUtils.currentLine=11862116;
 //BA.debugLineNum = 11862116;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=11862119;
 //BA.debugLineNum = 11862119;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=11862121;
 //BA.debugLineNum = 11862121;BA.debugLine="If Prct And Usar_Precio_Original Then";
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
RDebugUtils.currentLine=11862123;
 //BA.debugLineNum = 11862123;BA.debugLine="If Tict = \"D\" Then";
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
RDebugUtils.currentLine=11862125;
 //BA.debugLineNum = 11862125;BA.debugLine="Wait For(Sb_Traer_Concepto(Codigo,Empresa,Su";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_concepto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigo,_empresa,_sucursal,_bodega,_podtglli));
this.state = 56;
return;
case 56:
//C
this.state = 32;
_id_docdet = (Integer) result[1];
;
RDebugUtils.currentLine=11862127;
 //BA.debugLineNum = 11862127;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=11862128;
 //BA.debugLineNum = 11862128;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11862130;
 //BA.debugLineNum = 11862130;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=11862131;
 //BA.debugLineNum = 11862131;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11862133;
 //BA.debugLineNum = 11862133;BA.debugLine="New_Row.Put(\"Idmaeedo_Dori\",Idmaeedo_Dori)";
_new_row.Put((Object)("Idmaeedo_Dori"),(Object)(_idmaeedo_dori));
RDebugUtils.currentLine=11862134;
 //BA.debugLineNum = 11862134;BA.debugLine="New_Row.Put(\"Idmaeddo_Dori\",Idmaeddo_Dori)";
_new_row.Put((Object)("Idmaeddo_Dori"),(Object)(_idmaeddo_dori));
RDebugUtils.currentLine=11862135;
 //BA.debugLineNum = 11862135;BA.debugLine="New_Row.Put(\"Emprepa\",Emprepa)";
_new_row.Put((Object)("Emprepa"),(Object)(_emprepa));
RDebugUtils.currentLine=11862136;
 //BA.debugLineNum = 11862136;BA.debugLine="New_Row.Put(\"Tidopa\",Tidopa)";
_new_row.Put((Object)("Tidopa"),(Object)(_tidopa));
RDebugUtils.currentLine=11862137;
 //BA.debugLineNum = 11862137;BA.debugLine="New_Row.Put(\"Nudopa\",Nudopa)";
_new_row.Put((Object)("Nudopa"),(Object)(_nudopa));
RDebugUtils.currentLine=11862138;
 //BA.debugLineNum = 11862138;BA.debugLine="New_Row.Put(\"Endopa\",Endopa)";
_new_row.Put((Object)("Endopa"),(Object)(_endopa));
RDebugUtils.currentLine=11862139;
 //BA.debugLineNum = 11862139;BA.debugLine="New_Row.Put(\"Nulidopa\",Nulidopa)";
_new_row.Put((Object)("Nulidopa"),(Object)(_nulidopa));
RDebugUtils.currentLine=11862140;
 //BA.debugLineNum = 11862140;BA.debugLine="New_Row.Put(\"CantUd1_Dori\",CantUd1_Dori)";
_new_row.Put((Object)("CantUd1_Dori"),(Object)(_cantud1_dori));
RDebugUtils.currentLine=11862141;
 //BA.debugLineNum = 11862141;BA.debugLine="New_Row.Put(\"CantUd2_Dori\",CantUd2_Dori)";
_new_row.Put((Object)("CantUd2_Dori"),(Object)(_cantud2_dori));
RDebugUtils.currentLine=11862143;
 //BA.debugLineNum = 11862143;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
_new_row.Put((Object)("codfuncionario"),(Object)(_codfuncionario));
RDebugUtils.currentLine=11862144;
 //BA.debugLineNum = 11862144;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
_new_row.Put((Object)("codvendedor"),(Object)(_codfuncionario));
RDebugUtils.currentLine=11862145;
 //BA.debugLineNum = 11862145;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
_new_row.Put((Object)("codlista"),(Object)(_codlista));
RDebugUtils.currentLine=11862147;
 //BA.debugLineNum = 11862147;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
_new_row.Put((Object)("moneda"),(Object)(_moneda));
RDebugUtils.currentLine=11862148;
 //BA.debugLineNum = 11862148;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
_new_row.Put((Object)("tipo_moneda"),(Object)(_tipo_moneda));
RDebugUtils.currentLine=11862149;
 //BA.debugLineNum = 11862149;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
_new_row.Put((Object)("tipo_cambio"),(Object)(_tipo_cambio));
RDebugUtils.currentLine=11862151;
 //BA.debugLineNum = 11862151;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
RDebugUtils.currentLine=11862152;
 //BA.debugLineNum = 11862152;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
RDebugUtils.currentLine=11862154;
 //BA.debugLineNum = 11862154;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
_new_row.Put((Object)("empresa"),(Object)(_empresa));
RDebugUtils.currentLine=11862155;
 //BA.debugLineNum = 11862155;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
_new_row.Put((Object)("sucursal"),(Object)(_sucursal));
RDebugUtils.currentLine=11862156;
 //BA.debugLineNum = 11862156;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
_new_row.Put((Object)("bodega"),(Object)(_bodega));
RDebugUtils.currentLine=11862158;
 //BA.debugLineNum = 11862158;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\",New_Row)";
__ref._sb_procesar_datos /*String*/ (null,"DescuentoPorc",_new_row);
RDebugUtils.currentLine=11862160;
 //BA.debugLineNum = 11862160;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=11862162;
 //BA.debugLineNum = 11862162;BA.debugLine="If Id_DocDet <> 0 Then";
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
RDebugUtils.currentLine=11862163;
 //BA.debugLineNum = 11862163;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
parent.__c.LogImpl("211862163",_codigo+"-"+_descripcion,0);
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
RDebugUtils.currentLine=11862170;
 //BA.debugLineNum = 11862170;BA.debugLine="If Not(Prct) Then";

case 37:
//if
this.state = 48;
if (parent.__c.Not(_prct)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=11862172;
 //BA.debugLineNum = 11862172;BA.debugLine="TotalNetoDoc = TotalNetoDoc + Vaneli";
__ref._totalnetodoc /*double*/  = __ref._totalnetodoc /*double*/ +_vaneli;
RDebugUtils.currentLine=11862173;
 //BA.debugLineNum = 11862173;BA.debugLine="TotalBrutoDoc = TotalBrutoDoc + Vabrdo";
__ref._totalbrutodoc /*double*/  = __ref._totalbrutodoc /*double*/ +_vabrdo;
RDebugUtils.currentLine=11862175;
 //BA.debugLineNum = 11862175;BA.debugLine="Wait For(Sb_Traer_Producto(Codigo,Empresa,Suc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_producto /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_codigo,_empresa,_sucursal,_bodega));
this.state = 57;
return;
case 57:
//C
this.state = 40;
_id_docdet = (Integer) result[1];
;
RDebugUtils.currentLine=11862177;
 //BA.debugLineNum = 11862177;BA.debugLine="If Id_DocDet <> 0 Then";
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
RDebugUtils.currentLine=11862179;
 //BA.debugLineNum = 11862179;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=11862180;
 //BA.debugLineNum = 11862180;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11862182;
 //BA.debugLineNum = 11862182;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=11862183;
 //BA.debugLineNum = 11862183;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
_fila_id = new anywheresoftware.b4a.objects.collections.Map();
_fila_id = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11862185;
 //BA.debugLineNum = 11862185;BA.debugLine="New_Row.Put(\"idmaeedo_dori\",Idmaeedo_Dori)";
_new_row.Put((Object)("idmaeedo_dori"),(Object)(_idmaeedo_dori));
RDebugUtils.currentLine=11862186;
 //BA.debugLineNum = 11862186;BA.debugLine="New_Row.Put(\"idmaeddo_dori\",Idmaeddo_Dori)";
_new_row.Put((Object)("idmaeddo_dori"),(Object)(_idmaeddo_dori));
RDebugUtils.currentLine=11862187;
 //BA.debugLineNum = 11862187;BA.debugLine="New_Row.Put(\"emprepa\",Emprepa)";
_new_row.Put((Object)("emprepa"),(Object)(_emprepa));
RDebugUtils.currentLine=11862188;
 //BA.debugLineNum = 11862188;BA.debugLine="New_Row.Put(\"tidopa\",Tidopa)";
_new_row.Put((Object)("tidopa"),(Object)(_tidopa));
RDebugUtils.currentLine=11862189;
 //BA.debugLineNum = 11862189;BA.debugLine="New_Row.Put(\"nudopa\",Nudopa)";
_new_row.Put((Object)("nudopa"),(Object)(_nudopa));
RDebugUtils.currentLine=11862190;
 //BA.debugLineNum = 11862190;BA.debugLine="New_Row.Put(\"endopa\",Endopa)";
_new_row.Put((Object)("endopa"),(Object)(_endopa));
RDebugUtils.currentLine=11862191;
 //BA.debugLineNum = 11862191;BA.debugLine="New_Row.Put(\"nulidopa\",Nulidopa)";
_new_row.Put((Object)("nulidopa"),(Object)(_nulidopa));
RDebugUtils.currentLine=11862193;
 //BA.debugLineNum = 11862193;BA.debugLine="New_Row.Put(\"cantUd1_dori\",CantUd1_Dori)";
_new_row.Put((Object)("cantUd1_dori"),(Object)(_cantud1_dori));
RDebugUtils.currentLine=11862194;
 //BA.debugLineNum = 11862194;BA.debugLine="New_Row.Put(\"cantUd2_dori\",CantUd2_Dori)";
_new_row.Put((Object)("cantUd2_dori"),(Object)(_cantud2_dori));
RDebugUtils.currentLine=11862196;
 //BA.debugLineNum = 11862196;BA.debugLine="New_Row.Put(\"cantidad\",Cantidad)";
_new_row.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=11862197;
 //BA.debugLineNum = 11862197;BA.debugLine="New_Row.Put(\"precio\",Precio)";
_new_row.Put((Object)("precio"),(Object)(_precio));
RDebugUtils.currentLine=11862199;
 //BA.debugLineNum = 11862199;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
_new_row.Put((Object)("codfuncionario"),(Object)(_codfuncionario));
RDebugUtils.currentLine=11862200;
 //BA.debugLineNum = 11862200;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
_new_row.Put((Object)("codvendedor"),(Object)(_codfuncionario));
RDebugUtils.currentLine=11862201;
 //BA.debugLineNum = 11862201;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
_new_row.Put((Object)("codlista"),(Object)(_codlista));
RDebugUtils.currentLine=11862203;
 //BA.debugLineNum = 11862203;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
_new_row.Put((Object)("moneda"),(Object)(_moneda));
RDebugUtils.currentLine=11862204;
 //BA.debugLineNum = 11862204;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
_new_row.Put((Object)("tipo_moneda"),(Object)(_tipo_moneda));
RDebugUtils.currentLine=11862205;
 //BA.debugLineNum = 11862205;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
_new_row.Put((Object)("tipo_cambio"),(Object)(_tipo_cambio));
RDebugUtils.currentLine=11862207;
 //BA.debugLineNum = 11862207;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
_new_row.Put((Object)("fechaemision"),(Object)(_fechaemision));
RDebugUtils.currentLine=11862208;
 //BA.debugLineNum = 11862208;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
_new_row.Put((Object)("fecharecepcion"),(Object)(_fechaemision));
RDebugUtils.currentLine=11862210;
 //BA.debugLineNum = 11862210;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
_new_row.Put((Object)("empresa"),(Object)(_empresa));
RDebugUtils.currentLine=11862211;
 //BA.debugLineNum = 11862211;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
_new_row.Put((Object)("sucursal"),(Object)(_sucursal));
RDebugUtils.currentLine=11862212;
 //BA.debugLineNum = 11862212;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
_new_row.Put((Object)("bodega"),(Object)(_bodega));
RDebugUtils.currentLine=11862214;
 //BA.debugLineNum = 11862214;BA.debugLine="Sb_Procesar_Datos(\"Cantidad\",New_Row)";
__ref._sb_procesar_datos /*String*/ (null,"Cantidad",_new_row);
RDebugUtils.currentLine=11862216;
 //BA.debugLineNum = 11862216;BA.debugLine="Wait For(Sb_Traer_Descuentos(Nulido)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_incorporar_productos"), __ref._sb_traer_descuentos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_nulido));
this.state = 58;
return;
case 58:
//C
this.state = 43;
_tbldescuentos = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=11862218;
 //BA.debugLineNum = 11862218;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "+BA.NumberToString(_id_docdet);
RDebugUtils.currentLine=11862219;
 //BA.debugLineNum = 11862219;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(V";
_fila_dscto = new anywheresoftware.b4a.objects.collections.Map();
_fila_dscto = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11862221;
 //BA.debugLineNum = 11862221;BA.debugLine="If TblDescuentos <> Null Then";
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
RDebugUtils.currentLine=11862222;
 //BA.debugLineNum = 11862222;BA.debugLine="Sb_Insertar_Descuentos_En_Escala(New_Row,Fi";
__ref._sb_insertar_descuentos_en_escala /*String*/ (null,_new_row,_fila_dscto,_tbldescuentos,_precio);
 if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=11862225;
 //BA.debugLineNum = 11862225;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_new_row,_fila_id);
RDebugUtils.currentLine=11862227;
 //BA.debugLineNum = 11862227;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
parent.__c.LogImpl("211862227",_codigo+"-"+_descripcion,0);
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
RDebugUtils.currentLine=11862239;
 //BA.debugLineNum = 11862239;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=11862241;
 //BA.debugLineNum = 11862241;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_producto2"), (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=11927563;
 //BA.debugLineNum = 11927563;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=11927565;
 //BA.debugLineNum = 11927565;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=11927567;
 //BA.debugLineNum = 11927567;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=11927569;
 //BA.debugLineNum = 11927569;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=11927570;
 //BA.debugLineNum = 11927570;BA.debugLine="Dim RFila As Map = Filas.Get(0)";
_rfila = new anywheresoftware.b4a.objects.collections.Map();
_rfila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=11927572;
 //BA.debugLineNum = 11927572;BA.debugLine="Dim ErrorStr As String =RFila.Get(\"Error\")";
_errorstr = BA.ObjectToString(_rfila.Get((Object)("Error")));
RDebugUtils.currentLine=11927574;
 //BA.debugLineNum = 11927574;BA.debugLine="If ErrorStr = Null Then";
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
RDebugUtils.currentLine=11927575;
 //BA.debugLineNum = 11927575;BA.debugLine="Return Null";
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
RDebugUtils.currentLine=11927581;
 //BA.debugLineNum = 11927581;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=11927584;
 //BA.debugLineNum = 11927584;BA.debugLine="Return RFila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rfila));return;};
RDebugUtils.currentLine=11927586;
 //BA.debugLineNum = 11927586;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
_lista = parent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_concepto_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_concepto,_empresa,_sucursal,_bodega,_lista,"");
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_concepto"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=12058641;
 //BA.debugLineNum = 12058641;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=12058643;
 //BA.debugLineNum = 12058643;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=12058644;
 //BA.debugLineNum = 12058644;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=12058646;
 //BA.debugLineNum = 12058646;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(__ref._id_docenc /*int*/ ));
RDebugUtils.currentLine=12058648;
 //BA.debugLineNum = 12058648;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("Moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=12058649;
 //BA.debugLineNum = 12058649;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=12058650;
 //BA.debugLineNum = 12058650;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("Tipo_Cambio"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=12058651;
 //BA.debugLineNum = 12058651;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=12058653;
 //BA.debugLineNum = 12058653;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent._dbutils._insertmaps /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=12058655;
 //BA.debugLineNum = 12058655;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Order by Id_DocDet Desc";
RDebugUtils.currentLine=12058656;
 //BA.debugLineNum = 12058656;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=12058658;
 //BA.debugLineNum = 12058658;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
_id_docdet2 = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=12058660;
 //BA.debugLineNum = 12058660;BA.debugLine="Return Id_DocDet2";
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
RDebugUtils.currentLine=12058665;
 //BA.debugLineNum = 12058665;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("212058665",_js._errormessage /*String*/ ,0);
RDebugUtils.currentLine=12058666;
 //BA.debugLineNum = 12058666;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO"),parent.__c.False);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12058669;
 //BA.debugLineNum = 12058669;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
RDebugUtils.currentLine=12058671;
 //BA.debugLineNum = 12058671;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub Sb_Procesar_Datos(Cabeza As String, Fila As Ma";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
_untrans = (int)(BA.ObjectToNumber(_fila.Get((Object)("untrans"))));
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
_poriva = (double)(BA.ObjectToNumber(_fila.Get((Object)("poriva"))));
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
_porila = (double)(BA.ObjectToNumber(_fila.Get((Object)("porila"))));
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
_rtu = (double)(BA.ObjectToNumber(_fila.Get((Object)("rtu"))));
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
_impuestos = 1+((_poriva+_porila)/(double)100);
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Dim TotalIva As Double";
_totaliva = 0;
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="Dim TotalIla As Double";
_totalila = 0;
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="Dim TotalNeto As Double";
_totalneto = 0;
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="Dim TotalBruto As Double";
_totalbruto = 0;
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="Dim TotalDsctoNeto As Double";
_totaldsctoneto = 0;
RDebugUtils.currentLine=11730959;
 //BA.debugLineNum = 11730959;BA.debugLine="Dim TotalDsctoBruto As Double";
_totaldsctobruto = 0;
RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="Dim Precio As Double = Fila.Get(\"precio\")";
_precio = (double)(BA.ObjectToNumber(_fila.Get((Object)("precio"))));
RDebugUtils.currentLine=11730963;
 //BA.debugLineNum = 11730963;BA.debugLine="Dim PrecioNeto As Double";
_precioneto = 0;
RDebugUtils.currentLine=11730964;
 //BA.debugLineNum = 11730964;BA.debugLine="Dim PrecioBruto As Double";
_preciobruto = 0;
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
_precionetorealud1 = 0;
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
_precionetorealud2 = 0;
RDebugUtils.currentLine=11730969;
 //BA.debugLineNum = 11730969;BA.debugLine="Dim Total As Double";
_total = 0;
RDebugUtils.currentLine=11730971;
 //BA.debugLineNum = 11730971;BA.debugLine="Dim Decimal = 2";
_decimal = BA.NumberToString(2);
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
_cantidad = (double)(BA.ObjectToNumber(_fila.Get((Object)("cantidad"))));
RDebugUtils.currentLine=11730974;
 //BA.debugLineNum = 11730974;BA.debugLine="Dim CantUd1 As Double";
_cantud1 = 0;
RDebugUtils.currentLine=11730975;
 //BA.debugLineNum = 11730975;BA.debugLine="Dim CantUd2 As Double";
_cantud2 = 0;
RDebugUtils.currentLine=11730977;
 //BA.debugLineNum = 11730977;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
_divisible = "";
RDebugUtils.currentLine=11730978;
 //BA.debugLineNum = 11730978;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
_divisible2 = "";
RDebugUtils.currentLine=11730980;
 //BA.debugLineNum = 11730980;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
_descuentovalor = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor"))));
RDebugUtils.currentLine=11730981;
 //BA.debugLineNum = 11730981;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
_descuentoporc = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=11730982;
 //BA.debugLineNum = 11730982;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
_descuentoporc_original = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentoporc"))));
RDebugUtils.currentLine=11730983;
 //BA.debugLineNum = 11730983;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
_descmaximo = (double)(BA.ObjectToNumber(_fila.Get((Object)("descmaximo"))));
RDebugUtils.currentLine=11730985;
 //BA.debugLineNum = 11730985;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
_tict = BA.ObjectToString(_fila.Get((Object)("tict")));
RDebugUtils.currentLine=11730986;
 //BA.debugLineNum = 11730986;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
_prct = BA.ObjectToString(_fila.Get((Object)("prct")));
RDebugUtils.currentLine=11730987;
 //BA.debugLineNum = 11730987;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
_tipr = BA.ObjectToString(_fila.Get((Object)("tipr")));
RDebugUtils.currentLine=11730989;
 //BA.debugLineNum = 11730989;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
_codlista = BA.ObjectToString(_fila.Get((Object)("codlista")));
RDebugUtils.currentLine=11730991;
 //BA.debugLineNum = 11730991;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
_numdsctos = 0;
RDebugUtils.currentLine=11730993;
 //BA.debugLineNum = 11730993;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
_no_aplica_redondeo = false;
RDebugUtils.currentLine=11730994;
 //BA.debugLineNum = 11730994;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
_aplicar_redondeo = false;
RDebugUtils.currentLine=11730996;
 //BA.debugLineNum = 11730996;BA.debugLine="If No_Aplica_Redondeo Then";
if (_no_aplica_redondeo) { 
RDebugUtils.currentLine=11730997;
 //BA.debugLineNum = 11730997;BA.debugLine="Aplicar_Redondeo = False";
_aplicar_redondeo = __c.False;
 };
RDebugUtils.currentLine=11731000;
 //BA.debugLineNum = 11731000;BA.debugLine="Dim TotalNeto_Calculo As Double";
_totalneto_calculo = 0;
RDebugUtils.currentLine=11731001;
 //BA.debugLineNum = 11731001;BA.debugLine="Dim TotalBruto_Calculo As Double";
_totalbruto_calculo = 0;
RDebugUtils.currentLine=11731003;
 //BA.debugLineNum = 11731003;BA.debugLine="Dim Descontar As Boolean";
_descontar = false;
RDebugUtils.currentLine=11731004;
 //BA.debugLineNum = 11731004;BA.debugLine="Dim Total_Concepto As Double";
_total_concepto = 0;
RDebugUtils.currentLine=11731010;
 //BA.debugLineNum = 11731010;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
_descuentovalor_anterior = (double)(BA.ObjectToNumber(_fila.Get((Object)("descuentovalor_anterior"))));
RDebugUtils.currentLine=11731011;
 //BA.debugLineNum = 11731011;BA.debugLine="Dim Recargo As Double";
_recargo = 0;
RDebugUtils.currentLine=11731013;
 //BA.debugLineNum = 11731013;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
if (_cantidad==0 && (_tipr).equals("") == false) { 
 };
RDebugUtils.currentLine=11731020;
 //BA.debugLineNum = 11731020;BA.debugLine="Dim Precio_Calculado As Double";
_precio_calculado = 0;
RDebugUtils.currentLine=11731022;
 //BA.debugLineNum = 11731022;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
_moneda_enc = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("moneda_doc")));
RDebugUtils.currentLine=11731023;
 //BA.debugLineNum = 11731023;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
_tipo_moneda_enc = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tipomoneda")));
RDebugUtils.currentLine=11731024;
 //BA.debugLineNum = 11731024;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
_tipo_cambio_ent = (double)(BA.ObjectToNumber(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("tasadorig_doc"))));
RDebugUtils.currentLine=11731026;
 //BA.debugLineNum = 11731026;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
_moneda_det = BA.ObjectToString(_fila.Get((Object)("moneda")));
RDebugUtils.currentLine=11731027;
 //BA.debugLineNum = 11731027;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
_tipo_moneda_det = BA.ObjectToString(_fila.Get((Object)("tipo_moneda")));
RDebugUtils.currentLine=11731028;
 //BA.debugLineNum = 11731028;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
_tipo_cambio_det = (double)(BA.ObjectToNumber(_fila.Get((Object)("tipo_cambio"))));
RDebugUtils.currentLine=11731030;
 //BA.debugLineNum = 11731030;BA.debugLine="Dim Decimales = 2";
_decimales = BA.NumberToString(2);
RDebugUtils.currentLine=11731032;
 //BA.debugLineNum = 11731032;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
RDebugUtils.currentLine=11731033;
 //BA.debugLineNum = 11731033;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
if ((_tipo_moneda_enc).equals("N")) { 
RDebugUtils.currentLine=11731034;
 //BA.debugLineNum = 11731034;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
_precio_calculado = __c.Round2(_precio*_tipo_cambio_ent,(int) (2));
 }else {
RDebugUtils.currentLine=11731036;
 //BA.debugLineNum = 11731036;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
_precio_calculado = __c.Round2(_precio/(double)_tipo_cambio_ent,(int) (2));
RDebugUtils.currentLine=11731037;
 //BA.debugLineNum = 11731037;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
 }else {
RDebugUtils.currentLine=11731040;
 //BA.debugLineNum = 11731040;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=11731041;
 //BA.debugLineNum = 11731041;BA.debugLine="Decimales = 2";
_decimales = BA.NumberToString(2);
 };
RDebugUtils.currentLine=11731043;
 //BA.debugLineNum = 11731043;BA.debugLine="Precio_Calculado = Precio";
_precio_calculado = _precio;
 };
RDebugUtils.currentLine=11731048;
 //BA.debugLineNum = 11731048;BA.debugLine="Dim Divi As String";
_divi = "";
RDebugUtils.currentLine=11731050;
 //BA.debugLineNum = 11731050;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=11731051;
 //BA.debugLineNum = 11731051;BA.debugLine="Divi = Divisible";
_divi = _divisible;
 };
RDebugUtils.currentLine=11731054;
 //BA.debugLineNum = 11731054;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=11731055;
 //BA.debugLineNum = 11731055;BA.debugLine="Divi = Divisible2";
_divi = _divisible2;
 };
RDebugUtils.currentLine=11731058;
 //BA.debugLineNum = 11731058;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";
if (__c.Not(_funciones._fx_solo_enteros /*boolean*/ (getActivityBA(),_cantidad,_divi))) { 
RDebugUtils.currentLine=11731060;
 //BA.debugLineNum = 11731060;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
__c.Msgbox2(BA.ObjectToCharSequence("El producto solo permite cantidades enteras"),BA.ObjectToCharSequence("Validación"),"Ok","","",(android.graphics.Bitmap)(__c.Null),getActivityBA());
RDebugUtils.currentLine=11731061;
 //BA.debugLineNum = 11731061;BA.debugLine="Cantidad = 0";
_cantidad = 0;
RDebugUtils.currentLine=11731066;
 //BA.debugLineNum = 11731066;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11731070;
 //BA.debugLineNum = 11731070;BA.debugLine="If UnTrans = 1 Then";
if (_untrans==1) { 
RDebugUtils.currentLine=11731071;
 //BA.debugLineNum = 11731071;BA.debugLine="If Rtu = 1 Then";
if (_rtu==1) { 
RDebugUtils.currentLine=11731072;
 //BA.debugLineNum = 11731072;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=11731073;
 //BA.debugLineNum = 11731073;BA.debugLine="CantUd2 = Cantidad * Rtu";
_cantud2 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=11731075;
 //BA.debugLineNum = 11731075;BA.debugLine="CantUd1 = Cantidad";
_cantud1 = _cantidad;
RDebugUtils.currentLine=11731076;
 //BA.debugLineNum = 11731076;BA.debugLine="CantUd2 = Cantidad / Rtu";
_cantud2 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=11731080;
 //BA.debugLineNum = 11731080;BA.debugLine="If UnTrans = 2 Then";
if (_untrans==2) { 
RDebugUtils.currentLine=11731081;
 //BA.debugLineNum = 11731081;BA.debugLine="If Rtu > 1 Then";
if (_rtu>1) { 
RDebugUtils.currentLine=11731082;
 //BA.debugLineNum = 11731082;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=11731083;
 //BA.debugLineNum = 11731083;BA.debugLine="CantUd1 = Cantidad * Rtu";
_cantud1 = _cantidad*_rtu;
 }else {
RDebugUtils.currentLine=11731085;
 //BA.debugLineNum = 11731085;BA.debugLine="CantUd2 = Cantidad";
_cantud2 = _cantidad;
RDebugUtils.currentLine=11731086;
 //BA.debugLineNum = 11731086;BA.debugLine="CantUd1 = Cantidad / Rtu";
_cantud1 = _cantidad/(double)_rtu;
 };
 };
RDebugUtils.currentLine=11731090;
 //BA.debugLineNum = 11731090;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=11731100;
 //BA.debugLineNum = 11731100;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
_totalneto_calculo = __ref._totalnetodoc /*double*/ ;
RDebugUtils.currentLine=11731101;
 //BA.debugLineNum = 11731101;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
_totalbruto_calculo = __ref._totalbrutodoc /*double*/ ;
RDebugUtils.currentLine=11731103;
 //BA.debugLineNum = 11731103;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=11731105;
 //BA.debugLineNum = 11731105;BA.debugLine="Descontar = True";
_descontar = __c.True;
RDebugUtils.currentLine=11731106;
 //BA.debugLineNum = 11731106;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantidad = 1;
RDebugUtils.currentLine=11731106;
 //BA.debugLineNum = 11731106;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud1 = 1;
RDebugUtils.currentLine=11731106;
 //BA.debugLineNum = 11731106;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
_cantud2 = 1;
RDebugUtils.currentLine=11731107;
 //BA.debugLineNum = 11731107;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
_totalneto_calculo = _totalneto_calculo+_descuentovalor_anterior;
RDebugUtils.currentLine=11731109;
 //BA.debugLineNum = 11731109;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=11731111;
 //BA.debugLineNum = 11731111;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731112;
 //BA.debugLineNum = 11731112;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731114;
 //BA.debugLineNum = 11731114;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=11731116;
 //BA.debugLineNum = 11731116;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731118;
 //BA.debugLineNum = 11731118;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=11731121;
 //BA.debugLineNum = 11731121;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=11731123;
 //BA.debugLineNum = 11731123;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731125;
 //BA.debugLineNum = 11731125;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=11731128;
 //BA.debugLineNum = 11731128;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 }else 
{RDebugUtils.currentLine=11731133;
 //BA.debugLineNum = 11731133;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=11731135;
 //BA.debugLineNum = 11731135;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
_total_concepto = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=11731136;
 //BA.debugLineNum = 11731136;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
_recargo = (double)(BA.ObjectToNumber(_fila.Get((Object)("recargovalor"))));
RDebugUtils.currentLine=11731138;
 //BA.debugLineNum = 11731138;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731139;
 //BA.debugLineNum = 11731139;BA.debugLine="TotalNeto = Total_Concepto";
_totalneto = _total_concepto;
 }else {
RDebugUtils.currentLine=11731141;
 //BA.debugLineNum = 11731141;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
_totalneto = __c.Round2(_total_concepto/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=11731142;
 //BA.debugLineNum = 11731142;BA.debugLine="TotalBruto = Total_Concepto";
_totalbruto = _total_concepto;
 };
RDebugUtils.currentLine=11731145;
 //BA.debugLineNum = 11731145;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
if ((_cabeza).equals("DescuentoPorc")) { 
RDebugUtils.currentLine=11731147;
 //BA.debugLineNum = 11731147;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=11731148;
 //BA.debugLineNum = 11731148;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=11731150;
 //BA.debugLineNum = 11731150;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
_descuentoporc = _descuentoporc/(double)100;
RDebugUtils.currentLine=11731152;
 //BA.debugLineNum = 11731152;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731154;
 //BA.debugLineNum = 11731154;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
_totalneto = __c.Round2((1+_descuentoporc)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731155;
 //BA.debugLineNum = 11731155;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
_recargo = __c.Round2(_totalneto-_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731157;
 //BA.debugLineNum = 11731157;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
_descuentoporc = __c.Round2((_recargo/(double)_totalneto_calculo)*100,(int) (5));
RDebugUtils.currentLine=11731158;
 //BA.debugLineNum = 11731158;BA.debugLine="TotalNeto = Recargo";
_totalneto = _recargo;
 }else {
RDebugUtils.currentLine=11731162;
 //BA.debugLineNum = 11731162;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
_recargo = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731164;
 //BA.debugLineNum = 11731164;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
_descuentoporc = __c.Round2((_recargo/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }else 
{RDebugUtils.currentLine=11731168;
 //BA.debugLineNum = 11731168;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
if ((_cabeza).equals("ValNetoLinea")) { 
RDebugUtils.currentLine=11731170;
 //BA.debugLineNum = 11731170;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
_totalneto_calculo = _totalneto_calculo-_recargo;
RDebugUtils.currentLine=11731171;
 //BA.debugLineNum = 11731171;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
_totalbruto_calculo = _totalbruto_calculo-_recargo;
RDebugUtils.currentLine=11731173;
 //BA.debugLineNum = 11731173;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731175;
 //BA.debugLineNum = 11731175;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
_descuentoporc = __c.Round2((_total_concepto/(double)(_totalneto_calculo))*100,(int) (5));
 }else {
RDebugUtils.currentLine=11731178;
 //BA.debugLineNum = 11731178;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
_descuentoporc = __c.Round2((_descuentovalor/(double)(_totalbruto_calculo))*100,(int) (5));
 };
RDebugUtils.currentLine=11731181;
 //BA.debugLineNum = 11731181;BA.debugLine="Recargo = Total_Concepto";
_recargo = _total_concepto;
 }}
;
RDebugUtils.currentLine=11731185;
 //BA.debugLineNum = 11731185;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 }}
;
 }else {
RDebugUtils.currentLine=11731201;
 //BA.debugLineNum = 11731201;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731202;
 //BA.debugLineNum = 11731202;BA.debugLine="PrecioNeto = Precio_Calculado";
_precioneto = _precio_calculado;
 }else {
RDebugUtils.currentLine=11731204;
 //BA.debugLineNum = 11731204;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
_precioneto = __c.Round2(_precio_calculado/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=11731205;
 //BA.debugLineNum = 11731205;BA.debugLine="PrecioBruto = Precio_Calculado";
_preciobruto = _precio_calculado;
 };
RDebugUtils.currentLine=11731208;
 //BA.debugLineNum = 11731208;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
_totalneto = __c.Round2(_precioneto*_cantidad,(int) (3));
RDebugUtils.currentLine=11731209;
 //BA.debugLineNum = 11731209;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731211;
 //BA.debugLineNum = 11731211;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
if ((_cabeza).equals("Cantidad") && (_tict).equals("")) { 
RDebugUtils.currentLine=11731213;
 //BA.debugLineNum = 11731213;BA.debugLine="DescuentoPorc = 0";
_descuentoporc = 0;
RDebugUtils.currentLine=11731214;
 //BA.debugLineNum = 11731214;BA.debugLine="DescuentoValor = 0";
_descuentovalor = 0;
 };
RDebugUtils.currentLine=11731226;
 //BA.debugLineNum = 11731226;BA.debugLine="TotalNeto_Calculo = TotalNeto";
_totalneto_calculo = _totalneto;
RDebugUtils.currentLine=11731227;
 //BA.debugLineNum = 11731227;BA.debugLine="TotalBruto_Calculo = TotalBruto";
_totalbruto_calculo = _totalbruto;
RDebugUtils.currentLine=11731231;
 //BA.debugLineNum = 11731231;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
if ((_cabeza).equals("DescuentoPorc") || (_cabeza).equals("Precio")) { 
RDebugUtils.currentLine=11731233;
 //BA.debugLineNum = 11731233;BA.debugLine="If Precio > 0 Then";
if (_precio>0) { 
RDebugUtils.currentLine=11731235;
 //BA.debugLineNum = 11731235;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731237;
 //BA.debugLineNum = 11731237;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalneto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731239;
 //BA.debugLineNum = 11731239;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=11731243;
 //BA.debugLineNum = 11731243;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
_descuentovalor = __c.Round2((_descuentoporc/(double)100)*_totalbruto_calculo,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731245;
 //BA.debugLineNum = 11731245;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 };
 }else 
{RDebugUtils.currentLine=11731251;
 //BA.debugLineNum = 11731251;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
if ((_cabeza).equals("DescuentoValor")) { 
RDebugUtils.currentLine=11731253;
 //BA.debugLineNum = 11731253;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731255;
 //BA.debugLineNum = 11731255;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalneto_calculo)*100,(int) (5));
 }else {
RDebugUtils.currentLine=11731258;
 //BA.debugLineNum = 11731258;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
_descuentoporc = __c.Round2((_descuentovalor/(double)_totalbruto_calculo)*100,(int) (5));
 };
 }}
;
 };
RDebugUtils.currentLine=11731266;
 //BA.debugLineNum = 11731266;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
_fila.Put((Object)("DescuentoPorc"),(Object)(_descuentoporc));
RDebugUtils.currentLine=11731267;
 //BA.debugLineNum = 11731267;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
_fila.Put((Object)("DescuentoValor"),(Object)(_descuentovalor));
RDebugUtils.currentLine=11731268;
 //BA.debugLineNum = 11731268;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
_fila.Put((Object)("DescuentoValor_Anterior"),(Object)(_descuentovalor_anterior));
RDebugUtils.currentLine=11731270;
 //BA.debugLineNum = 11731270;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
_fila.Put((Object)("DsctoRealPorc"),(Object)(0));
RDebugUtils.currentLine=11731271;
 //BA.debugLineNum = 11731271;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
_fila.Put((Object)("DsctoRealValor"),(Object)(0));
RDebugUtils.currentLine=11731281;
 //BA.debugLineNum = 11731281;BA.debugLine="Dim PrecioCalculado As Double";
_preciocalculado = 0;
RDebugUtils.currentLine=11731283;
 //BA.debugLineNum = 11731283;BA.debugLine="Dim Valor_Dscto As Double";
_valor_dscto = 0;
RDebugUtils.currentLine=11731284;
 //BA.debugLineNum = 11731284;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
_codfunautoriza_dscto = "xyz";
RDebugUtils.currentLine=11731285;
 //BA.debugLineNum = 11731285;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
_codpermiso_dscto = "Bkp00014";
RDebugUtils.currentLine=11731287;
 //BA.debugLineNum = 11731287;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=11731289;
 //BA.debugLineNum = 11731289;BA.debugLine="Dim PrecioLista As Double";
_preciolista = 0;
RDebugUtils.currentLine=11731291;
 //BA.debugLineNum = 11731291;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731292;
 //BA.debugLineNum = 11731292;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
_preciolista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
 }else {
RDebugUtils.currentLine=11731294;
 //BA.debugLineNum = 11731294;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
_preciolista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
 };
RDebugUtils.currentLine=11731300;
 //BA.debugLineNum = 11731300;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
_precio_cn_dscto = (_precio_calculado*_cantidad)-_descuentovalor;
RDebugUtils.currentLine=11731301;
 //BA.debugLineNum = 11731301;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
_precio_netolista = (double)(BA.ObjectToNumber(_fila.Get((Object)("preciolistaud"+BA.NumberToString(_untrans)))))*_cantidad;
RDebugUtils.currentLine=11731302;
 //BA.debugLineNum = 11731302;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
_valor_dscto_real = __c.Round2(_precio_netolista-_precio_cn_dscto,(int) (2));
RDebugUtils.currentLine=11731304;
 //BA.debugLineNum = 11731304;BA.debugLine="Dim Dscto_Real As Double = 0";
_dscto_real = 0;
RDebugUtils.currentLine=11731306;
 //BA.debugLineNum = 11731306;BA.debugLine="If Valor_Dscto_Real > 0 Then";
if (_valor_dscto_real>0) { 
RDebugUtils.currentLine=11731307;
 //BA.debugLineNum = 11731307;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
_dscto_real = __c.Round2((_valor_dscto_real/(double)_precio_netolista)*100,(int) (3));
 };
RDebugUtils.currentLine=11731314;
 //BA.debugLineNum = 11731314;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
_codfunautoriza = BA.ObjectToString(_fila.Get((Object)("codfunautoriza")));
RDebugUtils.currentLine=11731316;
 //BA.debugLineNum = 11731316;BA.debugLine="Dim Tiene_Dscto As Boolean";
_tiene_dscto = false;
RDebugUtils.currentLine=11731317;
 //BA.debugLineNum = 11731317;BA.debugLine="Dim ValVtaDescMax As Boolean";
_valvtadescmax = false;
RDebugUtils.currentLine=11731319;
 //BA.debugLineNum = 11731319;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
if ((_codfunautoriza).equals("xyz")) { 
_codfunautoriza = __ref._funcionario /*String*/ ;};
RDebugUtils.currentLine=11731321;
 //BA.debugLineNum = 11731321;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
if (_precio_cn_dscto<_precio_netolista) { 
RDebugUtils.currentLine=11731323;
 //BA.debugLineNum = 11731323;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
_vizado = false;
RDebugUtils.currentLine=11731325;
 //BA.debugLineNum = 11731325;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
if (_descmaximo==0) { 
_descmaximo = 0.5;};
RDebugUtils.currentLine=11731327;
 //BA.debugLineNum = 11731327;BA.debugLine="If Dscto_Real > DescMaximo Then";
if (_dscto_real>_descmaximo) { 
RDebugUtils.currentLine=11731329;
 //BA.debugLineNum = 11731329;BA.debugLine="Tiene_Dscto = True";
_tiene_dscto = __c.True;
RDebugUtils.currentLine=11731331;
 //BA.debugLineNum = 11731331;BA.debugLine="If Vizado Then";
if (_vizado) { 
RDebugUtils.currentLine=11731332;
 //BA.debugLineNum = 11731332;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = __c.True;
 }else {
RDebugUtils.currentLine=11731337;
 //BA.debugLineNum = 11731337;BA.debugLine="Dim Mensaje = \"\"";
_mensaje = "";
RDebugUtils.currentLine=11731338;
 //BA.debugLineNum = 11731338;BA.debugLine="Dim MsIcono As Object";
_msicono = new Object();
RDebugUtils.currentLine=11731346;
 //BA.debugLineNum = 11731346;BA.debugLine="Dim Msj_DsctoReal = \"\"";
_msj_dsctoreal = "";
RDebugUtils.currentLine=11731348;
 //BA.debugLineNum = 11731348;BA.debugLine="If Precio <> PrecioLista Then";
if (_precio!=_preciolista) { 
RDebugUtils.currentLine=11731349;
 //BA.debugLineNum = 11731349;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
_msj_dsctoreal = __c.CRLF+"Descuento Real: "+BA.NumberToString(_dscto_real)+"%";
 };
RDebugUtils.currentLine=11731352;
 //BA.debugLineNum = 11731352;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
if (_dscto_real>_valor_dscto) { 
RDebugUtils.currentLine=11731354;
 //BA.debugLineNum = 11731354;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
_mensaje = __c.CRLF+__c.CRLF+"¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!";
RDebugUtils.currentLine=11731357;
 //BA.debugLineNum = 11731357;BA.debugLine="ValVtaDescMax =False";
_valvtadescmax = __c.False;
 }else {
RDebugUtils.currentLine=11731360;
 //BA.debugLineNum = 11731360;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
_codfunautoriza_dscto = __ref._funcionario /*String*/ ;
RDebugUtils.currentLine=11731362;
 //BA.debugLineNum = 11731362;BA.debugLine="ValVtaDescMax =True";
_valvtadescmax = __c.True;
 };
 };
 };
 };
 }else {
RDebugUtils.currentLine=11731384;
 //BA.debugLineNum = 11731384;BA.debugLine="ValVtaDescMax = True";
_valvtadescmax = __c.True;
 };
RDebugUtils.currentLine=11731390;
 //BA.debugLineNum = 11731390;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731392;
 //BA.debugLineNum = 11731392;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
 }else {
RDebugUtils.currentLine=11731396;
 //BA.debugLineNum = 11731396;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
_totalbruto = _totalbruto-_descuentovalor;
 };
RDebugUtils.currentLine=11731402;
 //BA.debugLineNum = 11731402;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731404;
 //BA.debugLineNum = 11731404;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
_totalneto = __c.Round2(_totalneto,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731405;
 //BA.debugLineNum = 11731405;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=11731406;
 //BA.debugLineNum = 11731406;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=11731407;
 //BA.debugLineNum = 11731407;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=11731408;
 //BA.debugLineNum = 11731408;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=11731410;
 //BA.debugLineNum = 11731410;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
RDebugUtils.currentLine=11731412;
 //BA.debugLineNum = 11731412;BA.debugLine="PrecioNeto = Precio";
_precioneto = _precio;
RDebugUtils.currentLine=11731413;
 //BA.debugLineNum = 11731413;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
_preciobruto = __c.Round2(_precio*_impuestos,(int)(Double.parseDouble(_decimales)));
RDebugUtils.currentLine=11731415;
 //BA.debugLineNum = 11731415;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=11731416;
 //BA.debugLineNum = 11731416;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
_totaldsctobruto = __c.Round2((_descuentovalor*_impuestos),(int)(Double.parseDouble(_decimales)));
 };
RDebugUtils.currentLine=11731419;
 //BA.debugLineNum = 11731419;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=11731421;
 //BA.debugLineNum = 11731421;BA.debugLine="TotalDsctoBruto = TotalBruto";
_totaldsctobruto = _totalbruto;
RDebugUtils.currentLine=11731422;
 //BA.debugLineNum = 11731422;BA.debugLine="TotalDsctoNeto = 0";
_totaldsctoneto = 0;
 };
 }else {
RDebugUtils.currentLine=11731428;
 //BA.debugLineNum = 11731428;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = __c.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=11731429;
 //BA.debugLineNum = 11731429;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=11731430;
 //BA.debugLineNum = 11731430;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=11731431;
 //BA.debugLineNum = 11731431;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=11731432;
 //BA.debugLineNum = 11731432;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
RDebugUtils.currentLine=11731434;
 //BA.debugLineNum = 11731434;BA.debugLine="PrecioBruto = PrecioCalculado";
_preciobruto = _preciocalculado;
RDebugUtils.currentLine=11731435;
 //BA.debugLineNum = 11731435;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
_precioneto = __c.Round2(_precio/(double)_impuestos,(int) (3));
RDebugUtils.currentLine=11731437;
 //BA.debugLineNum = 11731437;BA.debugLine="If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=11731439;
 //BA.debugLineNum = 11731439;BA.debugLine="TotalDsctoBruto = 0";
_totaldsctobruto = 0;
RDebugUtils.currentLine=11731440;
 //BA.debugLineNum = 11731440;BA.debugLine="TotalDsctoNeto = TotalNeto";
_totaldsctoneto = _totalneto;
 };
 };
RDebugUtils.currentLine=11731447;
 //BA.debugLineNum = 11731447;BA.debugLine="If Descontar Then";
if (_descontar) { 
RDebugUtils.currentLine=11731449;
 //BA.debugLineNum = 11731449;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=11731450;
 //BA.debugLineNum = 11731450;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
RDebugUtils.currentLine=11731452;
 //BA.debugLineNum = 11731452;BA.debugLine="If Prct = 0 Then";
if ((_prct).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=11731454;
 //BA.debugLineNum = 11731454;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731455;
 //BA.debugLineNum = 11731455;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
_totalneto = _totalneto-_descuentovalor;
RDebugUtils.currentLine=11731456;
 //BA.debugLineNum = 11731456;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=11731457;
 //BA.debugLineNum = 11731457;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=11731458;
 //BA.debugLineNum = 11731458;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0";
_totalbruto = __c.Round2((_totalneto*_impuestos),(int) (0));
RDebugUtils.currentLine=11731459;
 //BA.debugLineNum = 11731459;BA.debugLine="TotalDsctoNeto = DescuentoValor";
_totaldsctoneto = _descuentovalor;
RDebugUtils.currentLine=11731460;
 //BA.debugLineNum = 11731460;BA.debugLine="Total = TotalNeto";
_total = _totalneto;
 }else {
RDebugUtils.currentLine=11731462;
 //BA.debugLineNum = 11731462;BA.debugLine="TotalBruto = DescuentoValor";
_totalbruto = _descuentovalor;
RDebugUtils.currentLine=11731463;
 //BA.debugLineNum = 11731463;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
_totalneto = __c.Round2(_totalbruto/(double)_impuestos,(int) (5));
RDebugUtils.currentLine=11731464;
 //BA.debugLineNum = 11731464;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
_totaliva = (__c.Round2(_totalneto*(_poriva/(double)100),(int) (5)));
RDebugUtils.currentLine=11731465;
 //BA.debugLineNum = 11731465;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
_totalila = (__c.Round2(_totalneto*(_porila/(double)100),(int) (5)));
RDebugUtils.currentLine=11731466;
 //BA.debugLineNum = 11731466;BA.debugLine="TotalDsctoBruto = DescuentoValor";
_totaldsctobruto = _descuentovalor;
RDebugUtils.currentLine=11731467;
 //BA.debugLineNum = 11731467;BA.debugLine="Total = TotalBruto";
_total = _totalbruto;
 };
RDebugUtils.currentLine=11731470;
 //BA.debugLineNum = 11731470;BA.debugLine="If TotalNeto > 0 Then";
if (_totalneto>0) { 
RDebugUtils.currentLine=11731472;
 //BA.debugLineNum = 11731472;BA.debugLine="TotalIla = TotalIla * -1";
_totalila = _totalila*-1;
RDebugUtils.currentLine=11731473;
 //BA.debugLineNum = 11731473;BA.debugLine="TotalIva = TotalIva * -1";
_totaliva = _totaliva*-1;
RDebugUtils.currentLine=11731474;
 //BA.debugLineNum = 11731474;BA.debugLine="TotalNeto = TotalNeto * -1";
_totalneto = _totalneto*-1;
RDebugUtils.currentLine=11731475;
 //BA.debugLineNum = 11731475;BA.debugLine="TotalBruto = TotalBruto * -1";
_totalbruto = _totalbruto*-1;
RDebugUtils.currentLine=11731476;
 //BA.debugLineNum = 11731476;BA.debugLine="Total = Total * -1";
_total = _total*-1;
 };
 };
 }else {
RDebugUtils.currentLine=11731484;
 //BA.debugLineNum = 11731484;BA.debugLine="If Cantidad > 0 Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=11731486;
 //BA.debugLineNum = 11731486;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
_precionetorealud1 = __c.Round2(_totalneto/(double)_cantud1,(int) (5));
RDebugUtils.currentLine=11731487;
 //BA.debugLineNum = 11731487;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
_precionetorealud2 = __c.Round2(_totalneto/(double)_cantud2,(int) (5));
RDebugUtils.currentLine=11731489;
 //BA.debugLineNum = 11731489;BA.debugLine="If ChkValores = False Then";
if (__ref._chkvalores /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11731490;
 //BA.debugLineNum = 11731490;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
_precioneto = _precionetorealud1;
 };
 }else {
RDebugUtils.currentLine=11731494;
 //BA.debugLineNum = 11731494;BA.debugLine="PrecioNetoRealUd1 = 0";
_precionetorealud1 = 0;
RDebugUtils.currentLine=11731495;
 //BA.debugLineNum = 11731495;BA.debugLine="PrecioNetoRealUd2 = 0";
_precionetorealud2 = 0;
 };
 };
RDebugUtils.currentLine=11731500;
 //BA.debugLineNum = 11731500;BA.debugLine="If Prct = 1 Then";
if ((_prct).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=11731502;
 //BA.debugLineNum = 11731502;BA.debugLine="Dim Multiplo = 1";
_multiplo = BA.NumberToString(1);
RDebugUtils.currentLine=11731504;
 //BA.debugLineNum = 11731504;BA.debugLine="If Tict = \"D\" Then";
if ((_tict).equals("D")) { 
RDebugUtils.currentLine=11731505;
 //BA.debugLineNum = 11731505;BA.debugLine="Multiplo = -1";
_multiplo = BA.NumberToString(-1);
 }else 
{RDebugUtils.currentLine=11731506;
 //BA.debugLineNum = 11731506;BA.debugLine="Else If Tict = \"R\" Then";
if ((_tict).equals("R")) { 
RDebugUtils.currentLine=11731507;
 //BA.debugLineNum = 11731507;BA.debugLine="Multiplo = 1";
_multiplo = BA.NumberToString(1);
 }}
;
RDebugUtils.currentLine=11731510;
 //BA.debugLineNum = 11731510;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731512;
 //BA.debugLineNum = 11731512;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
_cantud1 = _totalneto*(double)(Double.parseDouble(_multiplo));
RDebugUtils.currentLine=11731513;
 //BA.debugLineNum = 11731513;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 }else {
RDebugUtils.currentLine=11731518;
 //BA.debugLineNum = 11731518;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
_cantud1 = _totalbruto*(double)(Double.parseDouble(_multiplo));
RDebugUtils.currentLine=11731519;
 //BA.debugLineNum = 11731519;BA.debugLine="CantUd2 = 0";
_cantud2 = 0;
 };
 };
RDebugUtils.currentLine=11731562;
 //BA.debugLineNum = 11731562;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
_totalila = __c.Round2(_totalila,(int) (2));
RDebugUtils.currentLine=11731563;
 //BA.debugLineNum = 11731563;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
_totaliva = __c.Round2(_totaliva,(int) (2));
RDebugUtils.currentLine=11731564;
 //BA.debugLineNum = 11731564;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
_totalneto = __c.Round2(_totalneto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=11731565;
 //BA.debugLineNum = 11731565;BA.debugLine="TotalBruto = Round2(TotalBruto, Decimal)";
_totalbruto = __c.Round2(_totalbruto,(int)(Double.parseDouble(_decimal)));
RDebugUtils.currentLine=11731573;
 //BA.debugLineNum = 11731573;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
_fila.Put((Object)("cantidad"),(Object)(_cantidad));
RDebugUtils.currentLine=11731574;
 //BA.debugLineNum = 11731574;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
_fila.Put((Object)("cantud1"),(Object)(_cantud1));
RDebugUtils.currentLine=11731575;
 //BA.debugLineNum = 11731575;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
_fila.Put((Object)("cantud2"),(Object)(_cantud2));
RDebugUtils.currentLine=11731577;
 //BA.debugLineNum = 11731577;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
_fila.Put((Object)("valnetolinea"),(Object)(_totalneto));
RDebugUtils.currentLine=11731578;
 //BA.debugLineNum = 11731578;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
_fila.Put((Object)("valivalinea"),(Object)(_totaliva));
RDebugUtils.currentLine=11731579;
 //BA.debugLineNum = 11731579;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
_fila.Put((Object)("valilalinea"),(Object)(_totalila));
RDebugUtils.currentLine=11731580;
 //BA.debugLineNum = 11731580;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
_fila.Put((Object)("valbrutolinea"),(Object)(_totalbruto));
RDebugUtils.currentLine=11731582;
 //BA.debugLineNum = 11731582;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
_fila.Put((Object)("dsctoneto"),(Object)(_totaldsctoneto));
RDebugUtils.currentLine=11731583;
 //BA.debugLineNum = 11731583;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
_fila.Put((Object)("dsctobruto"),(Object)(_totaldsctobruto));
RDebugUtils.currentLine=11731585;
 //BA.debugLineNum = 11731585;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
_fila.Put((Object)("precionetorealud1"),(Object)(_precionetorealud1));
RDebugUtils.currentLine=11731586;
 //BA.debugLineNum = 11731586;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
_fila.Put((Object)("precionetorealud2"),(Object)(_precionetorealud2));
RDebugUtils.currentLine=11731591;
 //BA.debugLineNum = 11731591;BA.debugLine="Dim TipoValor As String";
_tipovalor = "";
RDebugUtils.currentLine=11731593;
 //BA.debugLineNum = 11731593;BA.debugLine="If ChkValores Then";
if (__ref._chkvalores /*boolean*/ ) { 
RDebugUtils.currentLine=11731595;
 //BA.debugLineNum = 11731595;BA.debugLine="TipoValor = \"N\"";
_tipovalor = "N";
 }else {
RDebugUtils.currentLine=11731598;
 //BA.debugLineNum = 11731598;BA.debugLine="TipoValor = \"B\"";
_tipovalor = "B";
 };
RDebugUtils.currentLine=11731601;
 //BA.debugLineNum = 11731601;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
_fila.Put((Object)("tipovalor"),(Object)(_tipovalor));
RDebugUtils.currentLine=11731603;
 //BA.debugLineNum = 11731603;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
_precionetoud = _precioneto;
RDebugUtils.currentLine=11731604;
 //BA.debugLineNum = 11731604;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
_preciobrutoud = _preciobruto;
RDebugUtils.currentLine=11731606;
 //BA.debugLineNum = 11731606;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
_precionetoudlista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("precionetoudlista")))),(int) (0));
RDebugUtils.currentLine=11731607;
 //BA.debugLineNum = 11731607;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
_preciobrutoudlista = __c.Round2((double)(BA.ObjectToNumber(_fila.Get((Object)("preciobrutoudlista")))),(int) (0));
RDebugUtils.currentLine=11731609;
 //BA.debugLineNum = 11731609;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
_fila.Put((Object)("precionetoud"),(Object)(_precionetoud));
RDebugUtils.currentLine=11731611;
 //BA.debugLineNum = 11731611;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
_fila.Put((Object)("preciobrutoud"),(Object)(_preciobrutoud));
RDebugUtils.currentLine=11731614;
 //BA.debugLineNum = 11731614;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
_lista = BA.ObjectToString(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("ListaPrecios".toLowerCase())));
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_productos_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_codigo,_empresa,_sucursal,_bodega,_lista,(int) (1),"");
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_producto"), (Object)(_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=11993099;
 //BA.debugLineNum = 11993099;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=11993101;
 //BA.debugLineNum = 11993101;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=11993103;
 //BA.debugLineNum = 11993103;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=11993105;
 //BA.debugLineNum = 11993105;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=11993106;
 //BA.debugLineNum = 11993106;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
_fila = new anywheresoftware.b4a.objects.collections.Map();
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=11993108;
 //BA.debugLineNum = 11993108;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Error\")";
_errorstr = BA.ObjectToString(_fila.Get((Object)("Error")));
RDebugUtils.currentLine=11993110;
 //BA.debugLineNum = 11993110;BA.debugLine="If ErrorStr = Null Then";
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
RDebugUtils.currentLine=11993116;
 //BA.debugLineNum = 11993116;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
_fila.Put((Object)("Id_DocEnc"),(Object)(__ref._id_docenc /*int*/ ));
RDebugUtils.currentLine=11993118;
 //BA.debugLineNum = 11993118;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
_fila.Put((Object)("moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=11993119;
 //BA.debugLineNum = 11993119;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_moneda"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=11993120;
 //BA.debugLineNum = 11993120;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
_fila.Put((Object)("tipo_cambio"),parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO")));
RDebugUtils.currentLine=11993122;
 //BA.debugLineNum = 11993122;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
parent._dbutils._insertmaps /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Detalle_Doc",_filas);
RDebugUtils.currentLine=11993124;
 //BA.debugLineNum = 11993124;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
__ref._consulta_sql /*String*/  = "Select * From Detalle_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ )+" Order by Id_DocDet Desc";
RDebugUtils.currentLine=11993125;
 //BA.debugLineNum = 11993125;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
_new_row = new anywheresoftware.b4a.objects.collections.Map();
_new_row = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11993127;
 //BA.debugLineNum = 11993127;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(_new_row.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=11993137;
 //BA.debugLineNum = 11993137;BA.debugLine="Return Id_DocDet'Fila_Id";
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
RDebugUtils.currentLine=11993152;
 //BA.debugLineNum = 11993152;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
RDebugUtils.currentLine=11993154;
 //BA.debugLineNum = 11993154;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Consulta_Sql = \"Select *,KODT As 'Kodt',PODT As '";
__ref._consulta_sql /*String*/  = "Select *,KODT As 'Kodt',PODT As 'Dscto',VADT As 'Valor' From MAEDTLI Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ )+" And NULIDO = '"+_nulido+"' Order By IDMAEDTLI";
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_descuentos"), (Object)(_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=12124177;
 //BA.debugLineNum = 12124177;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
_lista = new anywheresoftware.b4a.objects.collections.List();
_lista = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="Return Lista";
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
RDebugUtils.currentLine=12124185;
 //BA.debugLineNum = 12124185;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=12124187;
 //BA.debugLineNum = 12124187;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub Sb_Insertar_Descuentos_En_Escala(Fila As Map,F";
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim Id_DocDet As Int = Fila.Get(\"id_docdet\")";
_id_docdet = (int)(BA.ObjectToNumber(_fila.Get((Object)("id_docdet"))));
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
_id_docenc = (int)(BA.ObjectToNumber(_fila.Get((Object)("id_docenc"))));
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="Dim NroDscto As Int = 0";
_nrodscto = (int) (0);
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
_valor = (double)(BA.ObjectToNumber(_fila.Get((Object)("valnetolinea"))));
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="Dim Total_Descuento As Double";
_total_descuento = 0;
RDebugUtils.currentLine=12189713;
 //BA.debugLineNum = 12189713;BA.debugLine="Dim Total_Pc As Double";
_total_pc = 0;
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="If Fila_Dscto.IsInitialized Then";
if (_fila_dscto.IsInitialized()) { 
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
_dbutils._deleterecord /*String*/ (getActivityBA(),_variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Descuentos_Doc",_fila_dscto);
 };
RDebugUtils.currentLine=12189720;
 //BA.debugLineNum = 12189720;BA.debugLine="Dim Decimales As Int";
_decimales = 0;
RDebugUtils.currentLine=12189722;
 //BA.debugLineNum = 12189722;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
_moneda_det = "";
RDebugUtils.currentLine=12189723;
 //BA.debugLineNum = 12189723;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
_moneda_enc = "";
RDebugUtils.currentLine=12189725;
 //BA.debugLineNum = 12189725;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
_tipo_moneda_enc = "";
RDebugUtils.currentLine=12189726;
 //BA.debugLineNum = 12189726;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
_tipo_cambio_ent = 0;
RDebugUtils.currentLine=12189728;
 //BA.debugLineNum = 12189728;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
if ((_moneda_det.trim()).equals(_moneda_enc.trim()) == false) { 
RDebugUtils.currentLine=12189729;
 //BA.debugLineNum = 12189729;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=12189730;
 //BA.debugLineNum = 12189730;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 };
 }else {
RDebugUtils.currentLine=12189733;
 //BA.debugLineNum = 12189733;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
if ((_tipo_moneda_enc).equals("N") == false) { 
RDebugUtils.currentLine=12189734;
 //BA.debugLineNum = 12189734;BA.debugLine="Decimales = 2";
_decimales = (int) (2);
 };
 };
RDebugUtils.currentLine=12189746;
 //BA.debugLineNum = 12189746;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_tbldescuentos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=12189748;
 //BA.debugLineNum = 12189748;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
_filadscto = new anywheresoftware.b4a.objects.collections.Map();
_filadscto = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_tbldescuentos.Get(_i)));
RDebugUtils.currentLine=12189753;
 //BA.debugLineNum = 12189753;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
_kodt = "D_SIN_TIPO";
RDebugUtils.currentLine=12189754;
 //BA.debugLineNum = 12189754;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
_podt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Dscto"))));
RDebugUtils.currentLine=12189755;
 //BA.debugLineNum = 12189755;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
_vadt = (double)(BA.ObjectToNumber(_filadscto.Get((Object)("Valor"))));
RDebugUtils.currentLine=12189757;
 //BA.debugLineNum = 12189757;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
if (_podt!=0 || _vadt!=0) { 
RDebugUtils.currentLine=12189759;
 //BA.debugLineNum = 12189759;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
if (_podt!=0) { 
RDebugUtils.currentLine=12189761;
 //BA.debugLineNum = 12189761;BA.debugLine="If Podt > 0 Then";
if (_podt>0) { 
RDebugUtils.currentLine=12189762;
 //BA.debugLineNum = 12189762;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
_vadt = __c.Round2((_podt/(double)100)*_valor,_decimales);
RDebugUtils.currentLine=12189765;
 //BA.debugLineNum = 12189765;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = __c.Round2((_vadt/(double)_valor)*100,(int) (5));
 }else {
RDebugUtils.currentLine=12189768;
 //BA.debugLineNum = 12189768;BA.debugLine="Vadt = 0";
_vadt = 0;
 };
 }else {
RDebugUtils.currentLine=12189773;
 //BA.debugLineNum = 12189773;BA.debugLine="If Vadt <> 0 Then";
if (_vadt!=0) { 
RDebugUtils.currentLine=12189775;
 //BA.debugLineNum = 12189775;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
_podt = __c.Round2((_vadt/(double)_valor)*100,(int) (5));
 }else {
RDebugUtils.currentLine=12189778;
 //BA.debugLineNum = 12189778;BA.debugLine="Podt = 0";
_podt = 0;
 };
 };
RDebugUtils.currentLine=12189783;
 //BA.debugLineNum = 12189783;BA.debugLine="Podt = Round2(Podt,Decimales)";
_podt = __c.Round2(_podt,_decimales);
RDebugUtils.currentLine=12189785;
 //BA.debugLineNum = 12189785;BA.debugLine="If Podt <> 0 Then";
if (_podt!=0) { 
RDebugUtils.currentLine=12189787;
 //BA.debugLineNum = 12189787;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
__ref._consulta_sql /*String*/  = "Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)";
RDebugUtils.currentLine=12189788;
 //BA.debugLineNum = 12189788;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
_variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._id_docenc /*int*/ ),(Object)(_id_docdet),(Object)(""),(Object)(_kodt),(Object)(_podt),(Object)(_vadt),(Object)(_podt)}));
RDebugUtils.currentLine=12189790;
 //BA.debugLineNum = 12189790;BA.debugLine="NroDscto = NroDscto + 1";
_nrodscto = (int) (_nrodscto+1);
 };
RDebugUtils.currentLine=12189794;
 //BA.debugLineNum = 12189794;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
_total_descuento = _total_descuento+_vadt;
RDebugUtils.currentLine=12189795;
 //BA.debugLineNum = 12189795;BA.debugLine="Valor = Valor - Vadt";
_valor = _valor-_vadt;
 };
 }
};
RDebugUtils.currentLine=12189801;
 //BA.debugLineNum = 12189801;BA.debugLine="If Total_Descuento <> 0 Then";
if (_total_descuento!=0) { 
RDebugUtils.currentLine=12189802;
 //BA.debugLineNum = 12189802;BA.debugLine="Total_Pc = Total_Descuento / Precio";
_total_pc = _total_descuento/(double)_precio;
 };
RDebugUtils.currentLine=12189817;
 //BA.debugLineNum = 12189817;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
_fila.Put((Object)("descuentovalor"),(Object)(_total_descuento));
RDebugUtils.currentLine=12189818;
 //BA.debugLineNum = 12189818;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
_fila.Put((Object)("nrodscto"),(Object)(_nrodscto));
RDebugUtils.currentLine=12189823;
 //BA.debugLineNum = 12189823;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\",Fila)";
__ref._sb_procesar_datos /*String*/ (null,"DescuentoValor",_fila);
RDebugUtils.currentLine=12189825;
 //BA.debugLineNum = 12189825;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
_b4a_despachosimple = BA.ObjectToBoolean(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("B4A_DespachoSimple")));
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
__ref._consulta_sql /*String*/  = "DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?";
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Consulta_Sql = \"DELETE FROM [Detalle_Doc] WHERE [";
__ref._consulta_sql /*String*/  = "DELETE FROM [Detalle_Doc] WHERE [id_docenc] = ?";
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="Consulta_Sql = \"DELETE FROM [Descuentos_Doc] WHER";
__ref._consulta_sql /*String*/  = "DELETE FROM [Descuentos_Doc] WHERE id_docenc = ?";
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="Consulta_Sql = \"DELETE FROM [Impuestos_Doc] WHERE";
__ref._consulta_sql /*String*/  = "DELETE FROM [Impuestos_Doc] WHERE id_docenc = ?";
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="Consulta_Sql = \"DELETE FROM [Observaciones_Doc] W";
__ref._consulta_sql /*String*/  = "DELETE FROM [Observaciones_Doc] WHERE id_docenc = ?";
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
__ref._consulta_sql /*String*/  = "Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)";
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(parent._variables._gl_modalidad /*String*/ ),(Object)(parent._variables._gl_empresa /*String*/ ),(Object)(parent._variables._gl_sucursal /*String*/ )}));
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
__ref._consulta_sql /*String*/  = "Select * From Encabezado_Doc Where Nuevo_Doc = 1";
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
__ref._id_docenc /*int*/  = (int)(BA.ObjectToNumber(__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("id_docenc"))));
RDebugUtils.currentLine=11599903;
 //BA.debugLineNum = 11599903;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
__ref._consulta_sql /*String*/  = "Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ );
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
__ref._consulta_sql /*String*/  = "Insert Into Observaciones_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=11599908;
 //BA.debugLineNum = 11599908;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._id_docenc /*int*/ )}));
RDebugUtils.currentLine=11599911;
 //BA.debugLineNum = 11599911;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
__ref._consulta_sql /*String*/  = "Select * From Observaciones_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ );
RDebugUtils.currentLine=11599912;
 //BA.debugLineNum = 11599912;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
RDebugUtils.currentLine=11599914;
 //BA.debugLineNum = 11599914;BA.debugLine="If B4A_DespachoSimple Then";
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
RDebugUtils.currentLine=11599917;
 //BA.debugLineNum = 11599917;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
__ref._consulta_sql /*String*/  = "Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)";
RDebugUtils.currentLine=11599918;
 //BA.debugLineNum = 11599918;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2(__ref._consulta_sql /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._id_docenc /*int*/ )}));
RDebugUtils.currentLine=11599921;
 //BA.debugLineNum = 11599921;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
__ref._consulta_sql /*String*/  = "Select * From DespaFacil_Doc Where Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ );
RDebugUtils.currentLine=11599922;
 //BA.debugLineNum = 11599922;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/  = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,__ref._consulta_sql /*String*/ ,(String[])(parent.__c.Null));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11599926;
 //BA.debugLineNum = 11599926;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
parent.__c.LogImpl("211599926","Documento cargado... Id_DocEnc = "+BA.NumberToString(__ref._id_docenc /*int*/ ),0);
RDebugUtils.currentLine=11599929;
 //BA.debugLineNum = 11599929;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
_fechaemision = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=11599930;
 //BA.debugLineNum = 11599930;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
_fecha_1er_vencimiento = _fechaemision;
RDebugUtils.currentLine=11599931;
 //BA.debugLineNum = 11599931;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
_fechaultvencimiento = _fechaemision;
RDebugUtils.currentLine=11599932;
 //BA.debugLineNum = 11599932;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
_fecharecepcion = _fechaemision;
RDebugUtils.currentLine=11599934;
 //BA.debugLineNum = 11599934;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=11599936;
 //BA.debugLineNum = 11599936;BA.debugLine="Dim Cuotas As Int = 0";
_cuotas = (int) (0);
RDebugUtils.currentLine=11599937;
 //BA.debugLineNum = 11599937;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
_dias_1er_vencimiento = (int) (0);
RDebugUtils.currentLine=11599938;
 //BA.debugLineNum = 11599938;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
_dias_vencimiento = (int) (0);
RDebugUtils.currentLine=11599939;
 //BA.debugLineNum = 11599939;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
_forma_de_pago = "";
RDebugUtils.currentLine=11599941;
 //BA.debugLineNum = 11599941;BA.debugLine="Dim Centro_Costo As String";
_centro_costo = "";
RDebugUtils.currentLine=11599943;
 //BA.debugLineNum = 11599943;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
_moneda_doc = BA.ObjectToString(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOMO")));
RDebugUtils.currentLine=11599944;
 //BA.debugLineNum = 11599944;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
_valor_dolar = (double)(BA.ObjectToNumber(parent._variables._global_row_dolar /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=11599945;
 //BA.debugLineNum = 11599945;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
_tasadorig_doc = (double)(BA.ObjectToNumber(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("VAMO"))));
RDebugUtils.currentLine=11599946;
 //BA.debugLineNum = 11599946;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
_tipomoneda = BA.ObjectToString(parent._variables._global_row_moneda /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("TIMO")));
RDebugUtils.currentLine=11599948;
 //BA.debugLineNum = 11599948;BA.debugLine="Dim ListaPrecios As String";
_listaprecios = "";
RDebugUtils.currentLine=11599950;
 //BA.debugLineNum = 11599950;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
_newnrodocumento = "NEWXXXXXXX";
RDebugUtils.currentLine=11599952;
 //BA.debugLineNum = 11599952;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
_docen_neto_bruto = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Vnta_TipoValor_Bruto_Neto")));
RDebugUtils.currentLine=11599954;
 //BA.debugLineNum = 11599954;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
_centro_costo = "LUVTVEN";
RDebugUtils.currentLine=11599955;
 //BA.debugLineNum = 11599955;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
_centro_costo = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_centro_costo)));
RDebugUtils.currentLine=11599957;
 //BA.debugLineNum = 11599957;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
_listaprecios = parent._variables._gl_lista_precios /*String*/ ;
RDebugUtils.currentLine=11599959;
 //BA.debugLineNum = 11599959;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoDoc".toLowerCase()),(Object)("NVV"));
RDebugUtils.currentLine=11599960;
 //BA.debugLineNum = 11599960;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("NroDocumento".toLowerCase()),(Object)(_newnrodocumento));
RDebugUtils.currentLine=11599962;
 //BA.debugLineNum = 11599962;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaEmision".toLowerCase()),(Object)(_fechaemision));
RDebugUtils.currentLine=11599963;
 //BA.debugLineNum = 11599963;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fecha_1er_Vencimiento".toLowerCase()),(Object)(_fecha_1er_vencimiento));
RDebugUtils.currentLine=11599964;
 //BA.debugLineNum = 11599964;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaUltVencimiento".toLowerCase()),(Object)(_fechaultvencimiento));
RDebugUtils.currentLine=11599965;
 //BA.debugLineNum = 11599965;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("FechaRecepcion".toLowerCase()),(Object)(_fecharecepcion));
RDebugUtils.currentLine=11599967;
 //BA.debugLineNum = 11599967;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Cuotas".toLowerCase()),(Object)(_cuotas));
RDebugUtils.currentLine=11599968;
 //BA.debugLineNum = 11599968;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_1er_Vencimiento".toLowerCase()),(Object)(_dias_1er_vencimiento));
RDebugUtils.currentLine=11599969;
 //BA.debugLineNum = 11599969;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Dias_Vencimiento".toLowerCase()),(Object)(_dias_vencimiento));
RDebugUtils.currentLine=11599971;
 //BA.debugLineNum = 11599971;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
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
RDebugUtils.currentLine=11599972;
 //BA.debugLineNum = 11599972;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Def";
__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/  = parent._variables._global_row_entidad_x_defecto /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=11599975;
 //BA.debugLineNum = 11599975;BA.debugLine="Dim CodEntidad As String = Row_Entidad.Get(\"KOEN\"";
_codentidad = BA.ObjectToString(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOEN")));
RDebugUtils.currentLine=11599976;
 //BA.debugLineNum = 11599976;BA.debugLine="Dim CodSucEntidad As String = Row_Entidad.Get(\"SU";
_codsucentidad = BA.ObjectToString(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("SUEN")));
RDebugUtils.currentLine=11599977;
 //BA.debugLineNum = 11599977;BA.debugLine="Dim Nombre_Entidad As String = Row_Entidad.Get(\"N";
_nombre_entidad = BA.ObjectToString(__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOEN")));
RDebugUtils.currentLine=11599979;
 //BA.debugLineNum = 11599979;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidad".toLowerCase()),(Object)(_codentidad));
RDebugUtils.currentLine=11599980;
 //BA.debugLineNum = 11599980;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidad".toLowerCase()),(Object)(_codsucentidad));
RDebugUtils.currentLine=11599981;
 //BA.debugLineNum = 11599981;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad".toLowerCase()),(Object)(_nombre_entidad));
RDebugUtils.currentLine=11599983;
 //BA.debugLineNum = 11599983;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ListaPrecios".toLowerCase()),(Object)(_listaprecios));
RDebugUtils.currentLine=11599984;
 //BA.debugLineNum = 11599984;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodFuncionario".toLowerCase()),parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("KOFU")));
RDebugUtils.currentLine=11599985;
 //BA.debugLineNum = 11599985;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("NomFuncionario".toLowerCase()),parent._variables._global_row_usuario_activo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("NOKOFU")));
RDebugUtils.currentLine=11599987;
 //BA.debugLineNum = 11599987;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Moneda_Doc".toLowerCase()),(Object)(_moneda_doc));
RDebugUtils.currentLine=11599988;
 //BA.debugLineNum = 11599988;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoMoneda".toLowerCase()),(Object)(_tipomoneda));
RDebugUtils.currentLine=11599989;
 //BA.debugLineNum = 11599989;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Valor_Dolar".toLowerCase()),(Object)(_valor_dolar));
RDebugUtils.currentLine=11599990;
 //BA.debugLineNum = 11599990;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Tasadorig_Doc".toLowerCase()),(Object)(_tasadorig_doc));
RDebugUtils.currentLine=11599992;
 //BA.debugLineNum = 11599992;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DocEn_Neto_Bruto".toLowerCase()),(Object)(_docen_neto_bruto));
RDebugUtils.currentLine=11599994;
 //BA.debugLineNum = 11599994;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Centro_Costo".toLowerCase()),(Object)(_centro_costo));
RDebugUtils.currentLine=11599996;
 //BA.debugLineNum = 11599996;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11599997;
 //BA.debugLineNum = 11599997;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodSucEntidadFisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11599998;
 //BA.debugLineNum = 11599998;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Nombre_Entidad_Fisica".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11599999;
 //BA.debugLineNum = 11599999;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fun_Auto_Deuda_Ven".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11600000;
 //BA.debugLineNum = 11600000;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fun_Auto_Stock_Ins".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11600001;
 //BA.debugLineNum = 11600001;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fun_Auto_Cupo_Exe".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11600002;
 //BA.debugLineNum = 11600002;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("SubTido".toLowerCase()),(Object)(""));
RDebugUtils.currentLine=11600005;
 //BA.debugLineNum = 11600005;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=11600007;
 //BA.debugLineNum = 11600007;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fal";
__ref._sb_actualizar_datos_de_la_entidad /*String*/ (null,__ref._row_entidad /*anywheresoftware.b4a.objects.collections.Map*/ ,parent.__c.False,parent.__c.False);
RDebugUtils.currentLine=11600009;
 //BA.debugLineNum = 11600009;BA.debugLine="If Idmaeedo <> 0 Then";
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
RDebugUtils.currentLine=11600011;
 //BA.debugLineNum = 11600011;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
parent.__c.ProgressDialogShow(parent.getActivityBA(),BA.ObjectToCharSequence("Buscando productos..."));
RDebugUtils.currentLine=11600013;
 //BA.debugLineNum = 11600013;BA.debugLine="Wait For(Sb_Traer_Encabezado) Complete (FEnc As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_traer_encabezado /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 28;
return;
case 28:
//C
this.state = 12;
_fenc = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11600015;
 //BA.debugLineNum = 11600015;BA.debugLine="If FEnc.IsInitialized Then";
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
RDebugUtils.currentLine=11600017;
 //BA.debugLineNum = 11600017;BA.debugLine="Fila_Encabezado.Put(\"empresa\",FEnc.Get(\"EMPRESA";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("empresa"),_fenc.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=11600018;
 //BA.debugLineNum = 11600018;BA.debugLine="Fila_Encabezado.Put(\"sucursal\",FEnc.Get(\"SUDO\")";
__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("sucursal"),_fenc.Get((Object)("SUDO")));
RDebugUtils.currentLine=11600019;
 //BA.debugLineNum = 11600019;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Encabezado_Doc",__ref._fila_encabezado /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=11600021;
 //BA.debugLineNum = 11600021;BA.debugLine="Variables.Gl_Empresa = FEnc.Get(\"EMPRESA\")";
parent._variables._gl_empresa /*String*/  = BA.ObjectToString(_fenc.Get((Object)("EMPRESA")));
RDebugUtils.currentLine=11600022;
 //BA.debugLineNum = 11600022;BA.debugLine="Variables.Gl_Sucursal = FEnc.Get(\"SUDO\")";
parent._variables._gl_sucursal /*String*/  = BA.ObjectToString(_fenc.Get((Object)("SUDO")));
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=11600026;
 //BA.debugLineNum = 11600026;BA.debugLine="Wait For(Sb_Incorporar_Productos) Complete (Resu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_incorporar_productos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 16;
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=11600028;
 //BA.debugLineNum = 11600028;BA.debugLine="Wait For(Sb_Traer_Observaciones) Complete (Flobs";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_traer_observaciones /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 16;
_flobs = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11600030;
 //BA.debugLineNum = 11600030;BA.debugLine="If Flobs.IsInitialized Then";
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
RDebugUtils.currentLine=11600031;
 //BA.debugLineNum = 11600031;BA.debugLine="Fila_Observaciones.Put(\"observaciones\",Flobs.Ge";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("observaciones"),_flobs.Get((Object)("OBDO")));
RDebugUtils.currentLine=11600032;
 //BA.debugLineNum = 11600032;BA.debugLine="Fila_Observaciones.Put(\"orden_compra\",Flobs.Get";
__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orden_compra"),_flobs.Get((Object)("OCDO")));
RDebugUtils.currentLine=11600033;
 //BA.debugLineNum = 11600033;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observaci";
parent._dbutils._updaterecord2 /*String*/ (parent.getActivityBA(),parent._variables._vsql /*anywheresoftware.b4a.sql.SQL*/ ,"Observaciones_Doc",__ref._fila_observaciones /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._fila_idenc /*anywheresoftware.b4a.objects.collections.Map*/ );
 if (true) break;
;
RDebugUtils.currentLine=11600037;
 //BA.debugLineNum = 11600037;BA.debugLine="If B4A_DespachoSimple Then";

case 19:
//if
this.state = 26;
if (_b4a_despachosimple) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=11600039;
 //BA.debugLineNum = 11600039;BA.debugLine="Wait For(Sb_Traer_Despacho_Simple) Complete (Fl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_nuevo_documento"), __ref._sb_traer_despacho_simple /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_fldesp = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11600041;
 //BA.debugLineNum = 11600041;BA.debugLine="If Fldesp.IsInitialized Then";
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
RDebugUtils.currentLine=11600043;
 //BA.debugLineNum = 11600043;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\".ToLowerC";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodTipoDespacho".toLowerCase()),_fldesp.Get((Object)("CodTipoDespacho")));
RDebugUtils.currentLine=11600044;
 //BA.debugLineNum = 11600044;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\".ToLowerCase";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoDespacho".toLowerCase()),_fldesp.Get((Object)("TipoDespacho")));
RDebugUtils.currentLine=11600046;
 //BA.debugLineNum = 11600046;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\".ToLowerC";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodTipoPagoDesp".toLowerCase()),_fldesp.Get((Object)("CodTipoPagoDesp")));
RDebugUtils.currentLine=11600047;
 //BA.debugLineNum = 11600047;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\".ToLowerCase";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TipoPagoDesp".toLowerCase()),_fldesp.Get((Object)("TipoPagoDesp")));
RDebugUtils.currentLine=11600049;
 //BA.debugLineNum = 11600049;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\".ToLowerCas";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("CodDocDestino".toLowerCase()),_fldesp.Get((Object)("CodDocDestino")));
RDebugUtils.currentLine=11600050;
 //BA.debugLineNum = 11600050;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\".ToLowerCase,F";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DocDestino".toLowerCase()),_fldesp.Get((Object)("DocDestino")));
RDebugUtils.currentLine=11600052;
 //BA.debugLineNum = 11600052;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\".ToLowerCa";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("TransporteDesp".toLowerCase()),_fldesp.Get((Object)("TransporteDesp")));
RDebugUtils.currentLine=11600053;
 //BA.debugLineNum = 11600053;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\".ToLowerCas";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DireccionDesp".toLowerCase()),_fldesp.Get((Object)("DireccionDesp")));
RDebugUtils.currentLine=11600054;
 //BA.debugLineNum = 11600054;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\".ToLowe";
__ref._fila_despafacil /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ObservacionesDesp".toLowerCase()),_fldesp.Get((Object)("ObservacionesDesp")));
RDebugUtils.currentLine=11600056;
 //BA.debugLineNum = 11600056;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFac";
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
RDebugUtils.currentLine=11600062;
 //BA.debugLineNum = 11600062;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=11600065;
 //BA.debugLineNum = 11600065;BA.debugLine="Return Id_DocEnc";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._id_docenc /*int*/ ));return;};
RDebugUtils.currentLine=11600067;
 //BA.debugLineNum = 11600067;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Consulta_Sql = \"Select * From MAEEDO Where IDMAEE";
__ref._consulta_sql /*String*/  = "Select * From MAEEDO Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ );
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_encabezado"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=12255250;
 //BA.debugLineNum = 12255250;BA.debugLine="Fila =Filas.Get(0)";
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
RDebugUtils.currentLine=12255255;
 //BA.debugLineNum = 12255255;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("212255255",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Consulta_Sql = \"Select * From MAEEDOOB Where IDMA";
__ref._consulta_sql /*String*/  = "Select * From MAEEDOOB Where IDMAEEDO = "+BA.NumberToString(__ref._idmaeedo /*int*/ );
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_observaciones"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=12320781;
 //BA.debugLineNum = 12320781;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="Fila =Filas.Get(0)";
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
RDebugUtils.currentLine=12320791;
 //BA.debugLineNum = 12320791;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("212320791",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12320794;
 //BA.debugLineNum = 12320794;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=12320796;
 //BA.debugLineNum = 12320796;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
__ref._consulta_sql /*String*/  = "Select * From "+parent._variables._global_basebk /*String*/ +"Zw_Despacho_Simple Where Idmaeedo = "+BA.NumberToString(__ref._idmaeedo /*int*/ );
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
_js = parent._funciones._fx_httjob_ws_sb_getdataset_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),__ref._consulta_sql /*String*/ ,parent);
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_despacho_simple"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=12386317;
 //BA.debugLineNum = 12386317;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=12386319;
 //BA.debugLineNum = 12386319;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=12386321;
 //BA.debugLineNum = 12386321;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=12386322;
 //BA.debugLineNum = 12386322;BA.debugLine="Fila =Filas.Get(0)";
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
RDebugUtils.currentLine=12386327;
 //BA.debugLineNum = 12386327;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("212386327",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12386330;
 //BA.debugLineNum = 12386330;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=12386332;
 //BA.debugLineNum = 12386332;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Dim Fila As Map";
_fila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
_js = parent._funciones._fx_httjob_ws_sb_traer_entidad_json /*BaKapp.Movil.Tag.httpjob*/ (parent.getActivityBA(),parent,_koen,_suen);
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="Fila = Null";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null));
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crear_documento", "sb_traer_entidad"), (Object)(_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (BaKapp.Movil.Tag.httpjob) result[1];
;
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="If Js.Success Then";
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
RDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="Dim vJson As String = Js.GetString";
_vjson = _js._getstring /*String*/ (null);
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
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
RDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
_filas = new anywheresoftware.b4a.objects.collections.List();
_filas = parent._funciones._fx_datatable /*anywheresoftware.b4a.objects.collections.List*/ (parent.getActivityBA(),_js._getstring /*String*/ (null));
RDebugUtils.currentLine=11796496;
 //BA.debugLineNum = 11796496;BA.debugLine="Fila =Filas.Get(0)";
_fila = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_filas.Get((int) (0))));
RDebugUtils.currentLine=11796498;
 //BA.debugLineNum = 11796498;BA.debugLine="Row_Entidad = Fila";
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
RDebugUtils.currentLine=11796503;
 //BA.debugLineNum = 11796503;BA.debugLine="Log(Js.ErrorMessage)";
parent.__c.LogImpl("211796503",_js._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11796506;
 //BA.debugLineNum = 11796506;BA.debugLine="Return Fila";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_fila));return;};
RDebugUtils.currentLine=11796508;
 //BA.debugLineNum = 11796508;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}