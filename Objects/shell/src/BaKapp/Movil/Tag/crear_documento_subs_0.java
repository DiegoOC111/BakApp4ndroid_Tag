package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class crear_documento_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Consulta_Sql As String";
crear_documento._consulta_sql = RemoteObject.createImmutable("");__ref.setField("_consulta_sql",crear_documento._consulta_sql);
 //BA.debugLineNum = 5;BA.debugLine="Public Idmaeedo As Int";
crear_documento._idmaeedo = RemoteObject.createImmutable(0);__ref.setField("_idmaeedo",crear_documento._idmaeedo);
 //BA.debugLineNum = 6;BA.debugLine="Public Id_DocEnc As Int";
crear_documento._id_docenc = RemoteObject.createImmutable(0);__ref.setField("_id_docenc",crear_documento._id_docenc);
 //BA.debugLineNum = 7;BA.debugLine="Public Row_Entidad As Map";
crear_documento._row_entidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_row_entidad",crear_documento._row_entidad);
 //BA.debugLineNum = 8;BA.debugLine="Public Fila_Encabezado As Map";
crear_documento._fila_encabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_fila_encabezado",crear_documento._fila_encabezado);
 //BA.debugLineNum = 9;BA.debugLine="Public Fila_Observaciones As Map";
crear_documento._fila_observaciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_fila_observaciones",crear_documento._fila_observaciones);
 //BA.debugLineNum = 10;BA.debugLine="Public Fila_DespaFacil As Map";
crear_documento._fila_despafacil = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_fila_despafacil",crear_documento._fila_despafacil);
 //BA.debugLineNum = 12;BA.debugLine="Public Cambiar_Entidad As Boolean";
crear_documento._cambiar_entidad = RemoteObject.createImmutable(false);__ref.setField("_cambiar_entidad",crear_documento._cambiar_entidad);
 //BA.debugLineNum = 13;BA.debugLine="Public Crear_NVV_Desde_COV As Boolean";
crear_documento._crear_nvv_desde_cov = RemoteObject.createImmutable(false);__ref.setField("_crear_nvv_desde_cov",crear_documento._crear_nvv_desde_cov);
 //BA.debugLineNum = 14;BA.debugLine="Public Usar_Precio_Original As Boolean";
crear_documento._usar_precio_original = RemoteObject.createImmutable(false);__ref.setField("_usar_precio_original",crear_documento._usar_precio_original);
 //BA.debugLineNum = 16;BA.debugLine="Private Fila_IdEnc As Map";
crear_documento._fila_idenc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_fila_idenc",crear_documento._fila_idenc);
 //BA.debugLineNum = 17;BA.debugLine="Public ChkValores As Boolean";
crear_documento._chkvalores = RemoteObject.createImmutable(false);__ref.setField("_chkvalores",crear_documento._chkvalores);
 //BA.debugLineNum = 19;BA.debugLine="Dim FUNCIONARIO As String '= Variables.Global_Row";
crear_documento._funcionario = RemoteObject.createImmutable("");__ref.setField("_funcionario",crear_documento._funcionario);
 //BA.debugLineNum = 21;BA.debugLine="Dim TotalNetoDoc As Double";
crear_documento._totalnetodoc = RemoteObject.createImmutable(0);__ref.setField("_totalnetodoc",crear_documento._totalnetodoc);
 //BA.debugLineNum = 22;BA.debugLine="Dim TotalBrutoDoc As Double";
crear_documento._totalbrutodoc = RemoteObject.createImmutable(0);__ref.setField("_totalbrutodoc",crear_documento._totalbrutodoc);
 //BA.debugLineNum = 24;BA.debugLine="Dim bmp1, bmp2 As Bitmap";
crear_documento._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",crear_documento._bmp1);
crear_documento._bmp2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp2",crear_documento._bmp2);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "crear_documento","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
Debug.ShouldStop(1073741824);
__ref.setField ("_funcionario" /*RemoteObject*/ ,BA.ObjectToString(crear_documento._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_actualizar_datos_de_la_entidad(RemoteObject __ref,RemoteObject _rowentidad,RemoteObject _revisar_permiso_lista_precio,RemoteObject _aplicar_venciminetos) throws Exception{
try {
		Debug.PushSubsStack("Sb_Actualizar_Datos_De_La_Entidad (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("sb_actualizar_datos_de_la_entidad")) { return __ref.runUserSub(false, "crear_documento","sb_actualizar_datos_de_la_entidad", __ref, _rowentidad, _revisar_permiso_lista_precio, _aplicar_venciminetos);}
RemoteObject _fechaemision = RemoteObject.createImmutable(0L);
RemoteObject _fecha_1er_vencimiento = RemoteObject.createImmutable(0L);
RemoteObject _fechaultvencimiento = RemoteObject.createImmutable(0L);
RemoteObject _fecharecepcion = RemoteObject.createImmutable(0L);
RemoteObject _cuotas = RemoteObject.createImmutable(0);
RemoteObject _dias_1er_vencimiento = RemoteObject.createImmutable(0);
RemoteObject _dias_vencimiento = RemoteObject.createImmutable(0);
RemoteObject _forma_pago = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.createImmutable("");
RemoteObject _permiso = RemoteObject.createImmutable("");
RemoteObject _listaprecios = RemoteObject.createImmutable("");
RemoteObject _rut = RemoteObject.createImmutable("");
RemoteObject _cuotas_f = null;
RemoteObject _fechasvenci = RemoteObject.createImmutable(0L);
RemoteObject _dias = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _tiene_permiso_lista = RemoteObject.createImmutable(false);
RemoteObject _cambiar_lista = RemoteObject.createImmutable(false);
RemoteObject _mostrar_mensaje_cambio_lista = RemoteObject.createImmutable(false);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _kolt = RemoteObject.createImmutable("");
RemoteObject _nokolt = RemoteObject.createImmutable("");
RemoteObject _bloqueado = RemoteObject.createImmutable(false);
Debug.locals.put("RowEntidad", _rowentidad);
Debug.locals.put("Revisar_Permiso_Lista_Precio", _revisar_permiso_lista_precio);
Debug.locals.put("Aplicar_Venciminetos", _aplicar_venciminetos);
 BA.debugLineNum = 231;BA.debugLine="Sub Sb_Actualizar_Datos_De_La_Entidad(RowEntidad A";
Debug.ShouldStop(64);
 BA.debugLineNum = 235;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(1024);
_fechaemision = crear_documento.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 236;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
Debug.ShouldStop(2048);
_fecha_1er_vencimiento = _fechaemision;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 BA.debugLineNum = 237;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
Debug.ShouldStop(4096);
_fechaultvencimiento = _fechaemision;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 BA.debugLineNum = 238;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
Debug.ShouldStop(8192);
_fecharecepcion = _fechaemision;Debug.locals.put("FechaRecepcion", _fecharecepcion);Debug.locals.put("FechaRecepcion", _fecharecepcion);
 BA.debugLineNum = 240;BA.debugLine="Dim Cuotas As Int = 1";
Debug.ShouldStop(32768);
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 241;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
Debug.ShouldStop(65536);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 242;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
Debug.ShouldStop(131072);
_dias_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 BA.debugLineNum = 243;BA.debugLine="Dim Forma_pago As String";
Debug.ShouldStop(262144);
_forma_pago = RemoteObject.createImmutable("");Debug.locals.put("Forma_pago", _forma_pago);
 BA.debugLineNum = 245;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 246;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 247;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
Debug.ShouldStop(4194304);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 248;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
Debug.ShouldStop(8388608);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 249;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
Debug.ShouldStop(16777216);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 251;BA.debugLine="Dim Lista As String";
Debug.ShouldStop(67108864);
_lista = RemoteObject.createImmutable("");Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 252;BA.debugLine="Dim Permiso As String";
Debug.ShouldStop(134217728);
_permiso = RemoteObject.createImmutable("");Debug.locals.put("Permiso", _permiso);
 BA.debugLineNum = 254;BA.debugLine="Dim ListaPrecios = Fila_Encabezado.Get(\"ListaPrec";
Debug.ShouldStop(536870912);
_listaprecios = BA.ObjectToString(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));Debug.locals.put("ListaPrecios", _listaprecios);Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 255;BA.debugLine="Lista = ListaPrecios";
Debug.ShouldStop(1073741824);
_lista = _listaprecios;Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 257;BA.debugLine="Cuotas = RowEntidad.Get(\"NUVECR\")";
Debug.ShouldStop(1);
_cuotas = BA.numberCast(int.class, _rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NUVECR")))));Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 258;BA.debugLine="Dias_1er_Vencimiento = RowEntidad.Get(\"DIPRVE\")";
Debug.ShouldStop(2);
_dias_1er_vencimiento = BA.numberCast(int.class, _rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIPRVE")))));Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 259;BA.debugLine="Dias_Vencimiento = RowEntidad.Get(\"DIASVENCI\")";
Debug.ShouldStop(4);
_dias_vencimiento = BA.numberCast(int.class, _rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIASVENCI")))));Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 BA.debugLineNum = 261;BA.debugLine="Dim Rut As String";
Debug.ShouldStop(16);
_rut = RemoteObject.createImmutable("");Debug.locals.put("Rut", _rut);
 BA.debugLineNum = 263;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,RowE";
Debug.ShouldStop(64);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase"))),(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN"))))));
 BA.debugLineNum = 264;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,R";
Debug.ShouldStop(128);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase"))),(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN"))))));
 BA.debugLineNum = 265;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
Debug.ShouldStop(256);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase"))),(Object)(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN"))))));
 BA.debugLineNum = 274;BA.debugLine="Lista = RowEntidad.Get(\"LVEN\")";
Debug.ShouldStop(131072);
_lista = BA.ObjectToString(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("LVEN")))));Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 275;BA.debugLine="Lista = Funciones.Mid(Lista, 6, 3)";
Debug.ShouldStop(262144);
_lista = crear_documento._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_lista),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 277;BA.debugLine="Permiso = \"Lp-\" & Lista";
Debug.ShouldStop(1048576);
_permiso = RemoteObject.concat(RemoteObject.createImmutable("Lp-"),_lista);Debug.locals.put("Permiso", _permiso);
 BA.debugLineNum = 282;BA.debugLine="If Cuotas = 0 Then Cuotas = 1";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cuotas,BA.numberCast(double.class, 0))) { 
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);};
 BA.debugLineNum = 284;BA.debugLine="Dim Cuotas_F(Cuotas - 1) As Long";
Debug.ShouldStop(134217728);
_cuotas_f = RemoteObject.createNewArray ("long", new int[] {RemoteObject.solve(new RemoteObject[] {_cuotas,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Cuotas_F", _cuotas_f);
 BA.debugLineNum = 286;BA.debugLine="If Not(Aplicar_Venciminetos) Then";
Debug.ShouldStop(536870912);
if (crear_documento.__c.runMethod(true,"Not",(Object)(_aplicar_venciminetos)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 287;BA.debugLine="Dias_1er_Vencimiento = 0";
Debug.ShouldStop(1073741824);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 };
 BA.debugLineNum = 290;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_dias_1er_vencimiento,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 297;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLow";
Debug.ShouldStop(256);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_1er_vencimiento)));
 BA.debugLineNum = 298;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCa";
Debug.ShouldStop(512);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_vencimiento)));
 BA.debugLineNum = 304;BA.debugLine="Dim FechasVenci As Long = FechaEmision";
Debug.ShouldStop(32768);
_fechasvenci = _fechaemision;Debug.locals.put("FechasVenci", _fechasvenci);Debug.locals.put("FechasVenci", _fechasvenci);
 BA.debugLineNum = 305;BA.debugLine="Dim dias As Int";
Debug.ShouldStop(65536);
_dias = RemoteObject.createImmutable(0);Debug.locals.put("dias", _dias);
 BA.debugLineNum = 307;BA.debugLine="If Dias_1er_Vencimiento > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_dias_1er_vencimiento,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 308;BA.debugLine="dias = Dias_1er_Vencimiento";
Debug.ShouldStop(524288);
_dias = _dias_1er_vencimiento;Debug.locals.put("dias", _dias);
 BA.debugLineNum = 309;BA.debugLine="For i = 1 To Cuotas";
Debug.ShouldStop(1048576);
{
final int step40 = 1;
final int limit40 = _cuotas.<Integer>get().intValue();
_i = 1 ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 312;BA.debugLine="FechasVenci = DateTime.Add(FechasVenci, 0, 0,";
Debug.ShouldStop(8388608);
_fechasvenci = crear_documento.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_fechasvenci),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_dias));Debug.locals.put("FechasVenci", _fechasvenci);
 BA.debugLineNum = 314;BA.debugLine="Cuotas_F(i - 1) = FechasVenci";
Debug.ShouldStop(33554432);
_cuotas_f.setArrayElement (_fechasvenci,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 315;BA.debugLine="dias = Dias_Vencimiento";
Debug.ShouldStop(67108864);
_dias = _dias_vencimiento;Debug.locals.put("dias", _dias);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 317;BA.debugLine="FechaUltVencimiento = FechasVenci";
Debug.ShouldStop(268435456);
_fechaultvencimiento = _fechasvenci;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 }else {
 BA.debugLineNum = 319;BA.debugLine="Cuotas = 1";
Debug.ShouldStop(1073741824);
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);
 };
 BA.debugLineNum = 322;BA.debugLine="Fecha_1er_Vencimiento = Cuotas_F(0)";
Debug.ShouldStop(2);
_fecha_1er_vencimiento = _cuotas_f.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 }else {
 BA.debugLineNum = 339;BA.debugLine="Fecha_1er_Vencimiento = FechaEmision";
Debug.ShouldStop(262144);
_fecha_1er_vencimiento = _fechaemision;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 BA.debugLineNum = 340;BA.debugLine="FechaUltVencimiento = FechaEmision";
Debug.ShouldStop(524288);
_fechaultvencimiento = _fechaemision;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 BA.debugLineNum = 341;BA.debugLine="Cuotas = 1";
Debug.ShouldStop(1048576);
_cuotas = BA.numberCast(int.class, 1);Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 342;BA.debugLine="Dias_1er_Vencimiento = 0";
Debug.ShouldStop(2097152);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 343;BA.debugLine="Dias_Vencimiento = 0";
Debug.ShouldStop(4194304);
_dias_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 };
 BA.debugLineNum = 347;BA.debugLine="Forma_pago = RowEntidad.Get(\"CPEN\")";
Debug.ShouldStop(67108864);
_forma_pago = BA.ObjectToString(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CPEN")))));Debug.locals.put("Forma_pago", _forma_pago);
 BA.debugLineNum = 349;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaEmision").runMethod(true,"toLowerCase"))),(Object)((_fechaemision)));
 BA.debugLineNum = 350;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
Debug.ShouldStop(536870912);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_fecha_1er_vencimiento)));
 BA.debugLineNum = 351;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase"))),(Object)((_fechaultvencimiento)));
 BA.debugLineNum = 352;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaRecepcion").runMethod(true,"toLowerCase"))),(Object)((_fecharecepcion)));
 BA.debugLineNum = 354;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\",Cuotas)";
Debug.ShouldStop(2);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cuotas"))),(Object)((_cuotas)));
 BA.debugLineNum = 355;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\",Dias_1";
Debug.ShouldStop(4);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dias_1er_Vencimiento"))),(Object)((_dias_1er_vencimiento)));
 BA.debugLineNum = 356;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\",Dias_Venci";
Debug.ShouldStop(8);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dias_Vencimiento"))),(Object)((_dias_vencimiento)));
 BA.debugLineNum = 357;BA.debugLine="Fila_Observaciones.Put(\"Forma_pago\",Forma_pago)";
Debug.ShouldStop(16);
__ref.getField(false,"_fila_observaciones" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Forma_pago"))),(Object)((_forma_pago)));
 BA.debugLineNum = 359;BA.debugLine="If Revisar_Permiso_Lista_Precio Then";
Debug.ShouldStop(64);
if (_revisar_permiso_lista_precio.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 361;BA.debugLine="Dim Tiene_Permiso_Lista As Boolean '= TienePermi";
Debug.ShouldStop(256);
_tiene_permiso_lista = RemoteObject.createImmutable(false);Debug.locals.put("Tiene_Permiso_Lista", _tiene_permiso_lista);
 BA.debugLineNum = 362;BA.debugLine="Dim Cambiar_lista As Boolean";
Debug.ShouldStop(512);
_cambiar_lista = RemoteObject.createImmutable(false);Debug.locals.put("Cambiar_lista", _cambiar_lista);
 BA.debugLineNum = 363;BA.debugLine="Dim Mostrar_Mensaje_cambio_lista As Boolean";
Debug.ShouldStop(1024);
_mostrar_mensaje_cambio_lista = RemoteObject.createImmutable(false);Debug.locals.put("Mostrar_Mensaje_cambio_lista", _mostrar_mensaje_cambio_lista);
 BA.debugLineNum = 366;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usu";
Debug.ShouldStop(8192);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {crear_documento._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 367;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_";
Debug.ShouldStop(16384);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), crear_documento._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 368;BA.debugLine="Dim value As String = m.Get(\"Kolt\")";
Debug.ShouldStop(32768);
_value = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kolt")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 370;BA.debugLine="If Lista = value Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_lista,_value)) { 
 BA.debugLineNum = 371;BA.debugLine="Tiene_Permiso_Lista = True";
Debug.ShouldStop(262144);
_tiene_permiso_lista = crear_documento.__c.getField(true,"True");Debug.locals.put("Tiene_Permiso_Lista", _tiene_permiso_lista);
 BA.debugLineNum = 372;BA.debugLine="Exit";
Debug.ShouldStop(524288);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 377;BA.debugLine="If Tiene_Permiso_Lista Then";
Debug.ShouldStop(16777216);
if (_tiene_permiso_lista.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 378;BA.debugLine="Cambiar_lista = True";
Debug.ShouldStop(33554432);
_cambiar_lista = crear_documento.__c.getField(true,"True");Debug.locals.put("Cambiar_lista", _cambiar_lista);
 }else {
 BA.debugLineNum = 381;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(268435456);
crear_documento._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",crear_documento._bmp1);
 BA.debugLineNum = 383;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_bmp1" /*RemoteObject*/ ,crear_documento.__c.runMethod(false,"LoadBitmap",(Object)(crear_documento.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png"))));
 BA.debugLineNum = 385;BA.debugLine="Msgbox2Async(\"Usted no tiene permiso para traba";
Debug.ShouldStop(1);
crear_documento.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Usted no tiene permiso para trabajar con la lista"),crear_documento.__c.getField(true,"CRLF"),RemoteObject.createImmutable("La lista seguirá siendo:"),_listaprecios))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(crear_documento.__c.getField(true,"False")));
 };
 BA.debugLineNum = 391;BA.debugLine="If Cambiar_lista Then";
Debug.ShouldStop(64);
if (_cambiar_lista.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 392;BA.debugLine="ListaPrecios = Lista";
Debug.ShouldStop(128);
_listaprecios = _lista;Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 393;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,";
Debug.ShouldStop(256);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase"))),(Object)((_listaprecios)));
 };
 };
 BA.debugLineNum = 398;BA.debugLine="For i = 0 To Variables.Global_Listas_Precios_Usua";
Debug.ShouldStop(8192);
{
final int step90 = 1;
final int limit90 = RemoteObject.solve(new RemoteObject[] {crear_documento._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step90 > 0 && _i <= limit90) || (step90 < 0 && _i >= limit90) ;_i = ((int)(0 + _i + step90))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 400;BA.debugLine="Dim m As Map = Variables.Global_Listas_Precios_U";
Debug.ShouldStop(32768);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), crear_documento._variables._global_listas_precios_usuario /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 401;BA.debugLine="Dim Kolt As String = m.Get(\"Kolt\")";
Debug.ShouldStop(65536);
_kolt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kolt")))));Debug.locals.put("Kolt", _kolt);Debug.locals.put("Kolt", _kolt);
 BA.debugLineNum = 402;BA.debugLine="Dim Nokolt As String = m.Get(\"Nokolt\")";
Debug.ShouldStop(131072);
_nokolt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nokolt")))));Debug.locals.put("Nokolt", _nokolt);Debug.locals.put("Nokolt", _nokolt);
 BA.debugLineNum = 404;BA.debugLine="If Lista = Kolt Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_lista,_kolt)) { 
 BA.debugLineNum = 406;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="Dim Bloqueado As Boolean = RowEntidad.Get(\"BLOQUE";
Debug.ShouldStop(268435456);
_bloqueado = BA.ObjectToBoolean(_rowentidad.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BLOQUEADO")))));Debug.locals.put("Bloqueado", _bloqueado);Debug.locals.put("Bloqueado", _bloqueado);
 BA.debugLineNum = 415;BA.debugLine="If Bloqueado Then";
Debug.ShouldStop(1073741824);
if (_bloqueado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 417;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(1);
crear_documento._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",crear_documento._bmp1);
 BA.debugLineNum = 419;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(4);
__ref.setField ("_bmp1" /*RemoteObject*/ ,crear_documento.__c.runMethod(false,"LoadBitmap",(Object)(crear_documento.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png"))));
 BA.debugLineNum = 421;BA.debugLine="Msgbox2Async(\"¡CLIENTE BLOQUEADO!\"  & CRLF & _";
Debug.ShouldStop(16);
crear_documento.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¡CLIENTE BLOQUEADO!"),crear_documento.__c.getField(true,"CRLF"),RemoteObject.createImmutable("LSolo es posible generar cotizaciones")))),(Object)(BA.ObjectToCharSequence("CLIENTE MOROSO")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(crear_documento.__c.getField(true,"False")));
 };
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_incorporar_productos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Incorporar_Productos (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1130);
if (RapidSub.canDelegate("sb_incorporar_productos")) { return __ref.runUserSub(false, "crear_documento","sb_incorporar_productos", __ref);}
ResumableSub_Sb_Incorporar_Productos rsub = new ResumableSub_Sb_Incorporar_Productos(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Incorporar_Productos extends BA.ResumableSub {
public ResumableSub_Sb_Incorporar_Productos(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _campoprecio = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _prct = RemoteObject.createImmutable(false);
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _nulido = RemoteObject.createImmutable("");
RemoteObject _podtglli = RemoteObject.createImmutable(0);
RemoteObject _rludpr = RemoteObject.createImmutable(0);
RemoteObject _udtpr = RemoteObject.createImmutable(0);
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _vaneli = RemoteObject.createImmutable(0);
RemoteObject _vabrdo = RemoteObject.createImmutable(0);
RemoteObject _codfuncionario = RemoteObject.createImmutable("");
RemoteObject _codlista = RemoteObject.createImmutable("");
RemoteObject _moneda = RemoteObject.createImmutable("");
RemoteObject _tipo_moneda = RemoteObject.createImmutable("");
RemoteObject _tipo_cambio = RemoteObject.createImmutable(0);
RemoteObject _idmaeedo_dori = RemoteObject.createImmutable(0);
RemoteObject _idmaeddo_dori = RemoteObject.createImmutable(0);
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _emprepa = RemoteObject.createImmutable("");
RemoteObject _tidopa = RemoteObject.createImmutable("");
RemoteObject _nudopa = RemoteObject.createImmutable("");
RemoteObject _endopa = RemoteObject.createImmutable("");
RemoteObject _nulidopa = RemoteObject.createImmutable("");
RemoteObject _cantud1_dori = RemoteObject.createImmutable(0);
RemoteObject _cantud2_dori = RemoteObject.createImmutable(0);
RemoteObject _precio = RemoteObject.createImmutable(0);
RemoteObject _rowproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fechaemision = RemoteObject.createImmutable(0L);
RemoteObject _id_docdet = RemoteObject.createImmutable(0);
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tbldescuentos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila_dscto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Incorporar_Productos (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1130);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1132;BA.debugLine="Dim CampoPrecio As String";
Debug.ShouldStop(2048);
_campoprecio = RemoteObject.createImmutable("");Debug.locals.put("CampoPrecio", _campoprecio);
 BA.debugLineNum = 1134;BA.debugLine="Consulta_Sql = \"Select * From MAEDDO Where IDMAEE";
Debug.ShouldStop(8192);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From MAEDDO Where IDMAEEDO = "),__ref.getField(true,"_idmaeedo" /*RemoteObject*/ ),RemoteObject.createImmutable(" Order By IDMAEDDO")));
 BA.debugLineNum = 1136;BA.debugLine="ChkValores = True";
Debug.ShouldStop(32768);
__ref.setField ("_chkvalores" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1138;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1139;BA.debugLine="CampoPrecio = \"PPPRNE\"";
Debug.ShouldStop(262144);
_campoprecio = BA.ObjectToString("PPPRNE");Debug.locals.put("CampoPrecio", _campoprecio);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1141;BA.debugLine="CampoPrecio = \"PPPRBR\"";
Debug.ShouldStop(1048576);
_campoprecio = BA.ObjectToString("PPPRBR");Debug.locals.put("CampoPrecio", _campoprecio);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1148;BA.debugLine="Consulta_Sql = \"Select MAEDDO.*,Case WHEN UDTRPR";
Debug.ShouldStop(134217728);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select MAEDDO.*,Case WHEN UDTRPR = 1 Then CAPRCO1-CAPREX1 Else CAPRCO2-CAPREX2 END AS 'Cantidad',"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("CAPRCO1-CAPREX1 As 'CantUd1_Dori',CAPRCO2-CAPREX2 AS 'CantUd2_Dori',"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Case WHEN UDTRPR = 1 Then "),_campoprecio,RemoteObject.createImmutable(" Else "),_campoprecio,RemoteObject.createImmutable("*RLUDPR END AS 'Precio'"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEDDO WITH ( NOLOCK )"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where IDMAEEDO = "),__ref.getField(true,"_idmaeedo" /*RemoteObject*/ ),RemoteObject.createImmutable(" And ( ESLIDO<>'C' OR ESFALI='I')"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order by IDMAEDDO")));
 BA.debugLineNum = 1155;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(4);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1156;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_incorporar_productos"), (_js));
this.state = 52;
return;
case 52:
//C
this.state = 7;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1158;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 51;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1160;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(128);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1162;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(512);
if (true) break;

case 10:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1164;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(2048);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lista = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1166;BA.debugLine="For Each Fila As Map In Lista";
Debug.ShouldStop(8192);
if (true) break;

case 13:
//for
this.state = 49;
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group16 = _lista;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Fila", _fila);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 49;
if (index16 < groupLen16) {
this.state = 15;
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group16.runMethod(false,"Get",index16));Debug.locals.put("Fila", _fila);}
if (true) break;

case 54:
//C
this.state = 53;
index16++;
Debug.locals.put("Fila", _fila);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1168;BA.debugLine="Dim Codigo As String = Fila.Get(\"KOPRCT\")";
Debug.ShouldStop(32768);
_codigo = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOPRCT")))));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 1169;BA.debugLine="Dim Descripcion As String = Fila.Get(\"NOKOPR\")";
Debug.ShouldStop(65536);
_descripcion = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOPR")))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 1170;BA.debugLine="Dim Prct As Boolean = Fila.Get(\"PRCT\")";
Debug.ShouldStop(131072);
_prct = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PRCT")))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 1171;BA.debugLine="Dim Tict As String = Fila.Get(\"TICT\")";
Debug.ShouldStop(262144);
_tict = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TICT")))));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 1172;BA.debugLine="Dim Nulido As String = Fila.Get(\"NULIDO\")";
Debug.ShouldStop(524288);
_nulido = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NULIDO")))));Debug.locals.put("Nulido", _nulido);Debug.locals.put("Nulido", _nulido);
 BA.debugLineNum = 1173;BA.debugLine="Dim Podtglli As Double = Fila.Get(\"PODTGLLI\")";
Debug.ShouldStop(1048576);
_podtglli = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PODTGLLI")))));Debug.locals.put("Podtglli", _podtglli);Debug.locals.put("Podtglli", _podtglli);
 BA.debugLineNum = 1174;BA.debugLine="Dim Rludpr As Double = Fila.Get(\"RLUDPR\")";
Debug.ShouldStop(2097152);
_rludpr = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RLUDPR")))));Debug.locals.put("Rludpr", _rludpr);Debug.locals.put("Rludpr", _rludpr);
 BA.debugLineNum = 1175;BA.debugLine="Dim Udtpr As Int = Fila.Get(\"UDTRPR\")";
Debug.ShouldStop(4194304);
_udtpr = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UDTRPR")))));Debug.locals.put("Udtpr", _udtpr);Debug.locals.put("Udtpr", _udtpr);
 BA.debugLineNum = 1176;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"Cantidad\")";
Debug.ShouldStop(8388608);
_cantidad = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cantidad")))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 1177;BA.debugLine="Dim Vaneli As Double = Fila.Get(\"VANELI\")";
Debug.ShouldStop(16777216);
_vaneli = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VANELI")))));Debug.locals.put("Vaneli", _vaneli);Debug.locals.put("Vaneli", _vaneli);
 BA.debugLineNum = 1178;BA.debugLine="Dim Vabrdo As Double = Fila.Get(\"VABRLI\")";
Debug.ShouldStop(33554432);
_vabrdo = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VABRLI")))));Debug.locals.put("Vabrdo", _vabrdo);Debug.locals.put("Vabrdo", _vabrdo);
 BA.debugLineNum = 1180;BA.debugLine="Dim CodFuncionario As String = Fila.Get(\"KOFUL";
Debug.ShouldStop(134217728);
_codfuncionario = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFULIDO")))));Debug.locals.put("CodFuncionario", _codfuncionario);Debug.locals.put("CodFuncionario", _codfuncionario);
 BA.debugLineNum = 1181;BA.debugLine="Dim Codlista As String = Fila.Get(\"KOLTPR\")";
Debug.ShouldStop(268435456);
_codlista = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOLTPR")))));Debug.locals.put("Codlista", _codlista);Debug.locals.put("Codlista", _codlista);
 BA.debugLineNum = 1182;BA.debugLine="Codlista = Codlista.Replace(\"TABPP\",\"\")";
Debug.ShouldStop(536870912);
_codlista = _codlista.runMethod(true,"replace",(Object)(BA.ObjectToString("TABPP")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Codlista", _codlista);
 BA.debugLineNum = 1183;BA.debugLine="Dim Moneda As String = Fila.Get(\"MOPPPR\")";
Debug.ShouldStop(1073741824);
_moneda = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MOPPPR")))));Debug.locals.put("Moneda", _moneda);Debug.locals.put("Moneda", _moneda);
 BA.debugLineNum = 1184;BA.debugLine="Dim Tipo_moneda As String = Fila.Get(\"TIMOPPPR";
Debug.ShouldStop(-2147483648);
_tipo_moneda = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMOPPPR")))));Debug.locals.put("Tipo_moneda", _tipo_moneda);Debug.locals.put("Tipo_moneda", _tipo_moneda);
 BA.debugLineNum = 1185;BA.debugLine="Dim Tipo_cambio As Double = Fila.Get(\"TAMOPPPR";
Debug.ShouldStop(1);
_tipo_cambio = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TAMOPPPR")))));Debug.locals.put("Tipo_cambio", _tipo_cambio);Debug.locals.put("Tipo_cambio", _tipo_cambio);
 BA.debugLineNum = 1187;BA.debugLine="Dim Idmaeedo_Dori As Int = Fila.Get(\"IDMAEEDO\"";
Debug.ShouldStop(4);
_idmaeedo_dori = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMAEEDO")))));Debug.locals.put("Idmaeedo_Dori", _idmaeedo_dori);Debug.locals.put("Idmaeedo_Dori", _idmaeedo_dori);
 BA.debugLineNum = 1188;BA.debugLine="Dim Idmaeddo_Dori As Int = Fila.Get(\"IDMAEDDO\"";
Debug.ShouldStop(8);
_idmaeddo_dori = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMAEDDO")))));Debug.locals.put("Idmaeddo_Dori", _idmaeddo_dori);Debug.locals.put("Idmaeddo_Dori", _idmaeddo_dori);
 BA.debugLineNum = 1190;BA.debugLine="Dim Empresa As String = Fila.Get(\"EMPRESA\")";
Debug.ShouldStop(32);
_empresa = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA")))));Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 1191;BA.debugLine="Dim Sucursal As String = Fila.Get(\"SULIDO\")";
Debug.ShouldStop(64);
_sucursal = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SULIDO")))));Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 1192;BA.debugLine="Dim Bodega As String = Fila.Get(\"BOSULIDO\")";
Debug.ShouldStop(128);
_bodega = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BOSULIDO")))));Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1194;BA.debugLine="Variables.Gl_Bodega = Bodega";
Debug.ShouldStop(512);
parent._variables._gl_bodega /*RemoteObject*/  = _bodega;
 BA.debugLineNum = 1196;BA.debugLine="Dim Emprepa As String = Fila.Get(\"EMPRESA\")";
Debug.ShouldStop(2048);
_emprepa = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA")))));Debug.locals.put("Emprepa", _emprepa);Debug.locals.put("Emprepa", _emprepa);
 BA.debugLineNum = 1197;BA.debugLine="Dim Tidopa As String = Fila.Get(\"TIDO\")";
Debug.ShouldStop(4096);
_tidopa = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIDO")))));Debug.locals.put("Tidopa", _tidopa);Debug.locals.put("Tidopa", _tidopa);
 BA.debugLineNum = 1198;BA.debugLine="Dim Nudopa As String = Fila.Get(\"NUDO\")";
Debug.ShouldStop(8192);
_nudopa = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NUDO")))));Debug.locals.put("Nudopa", _nudopa);Debug.locals.put("Nudopa", _nudopa);
 BA.debugLineNum = 1199;BA.debugLine="Dim Endopa As String = Fila.Get(\"ENDO\")";
Debug.ShouldStop(16384);
_endopa = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ENDO")))));Debug.locals.put("Endopa", _endopa);Debug.locals.put("Endopa", _endopa);
 BA.debugLineNum = 1200;BA.debugLine="Dim Nulidopa As String = Fila.Get(\"NULIDO\")";
Debug.ShouldStop(32768);
_nulidopa = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NULIDO")))));Debug.locals.put("Nulidopa", _nulidopa);Debug.locals.put("Nulidopa", _nulidopa);
 BA.debugLineNum = 1202;BA.debugLine="Dim CantUd1_Dori As Double = Fila.Get(\"CantUd1";
Debug.ShouldStop(131072);
_cantud1_dori = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CantUd1_Dori")))));Debug.locals.put("CantUd1_Dori", _cantud1_dori);Debug.locals.put("CantUd1_Dori", _cantud1_dori);
 BA.debugLineNum = 1203;BA.debugLine="Dim CantUd2_Dori As Double = Fila.Get(\"CantUd2";
Debug.ShouldStop(262144);
_cantud2_dori = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CantUd2_Dori")))));Debug.locals.put("CantUd2_Dori", _cantud2_dori);Debug.locals.put("CantUd2_Dori", _cantud2_dori);
 BA.debugLineNum = 1205;BA.debugLine="Dim Precio As Double = Fila.Get(\"Precio\")";
Debug.ShouldStop(1048576);
_precio = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Precio")))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 1207;BA.debugLine="If Usar_Precio_Original And Not(Prct) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_usar_precio_original" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(_prct)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1208;BA.debugLine="Wait For(Sb_Traer_Producto2(Codigo,Empresa,Su";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_incorporar_productos"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_producto2" /*RemoteObject*/ ,(Object)(_codigo),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega)));
this.state = 55;
return;
case 55:
//C
this.state = 19;
_rowproducto = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("RowProducto", _rowproducto);
;
 BA.debugLineNum = 1209;BA.debugLine="Precio = RowProducto.Get(\"Precio\")";
Debug.ShouldStop(16777216);
_precio = BA.numberCast(double.class, _rowproducto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Precio")))));Debug.locals.put("Precio", _precio);
 if (true) break;
;
 BA.debugLineNum = 1212;BA.debugLine="If Crear_NVV_Desde_COV = False Then";
Debug.ShouldStop(134217728);

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_crear_nvv_desde_cov" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1214;BA.debugLine="Idmaeedo_Dori = 0";
Debug.ShouldStop(536870912);
_idmaeedo_dori = BA.numberCast(int.class, 0);Debug.locals.put("Idmaeedo_Dori", _idmaeedo_dori);
 BA.debugLineNum = 1215;BA.debugLine="Idmaeddo_Dori = 0";
Debug.ShouldStop(1073741824);
_idmaeddo_dori = BA.numberCast(int.class, 0);Debug.locals.put("Idmaeddo_Dori", _idmaeddo_dori);
 BA.debugLineNum = 1216;BA.debugLine="Emprepa = \"\"";
Debug.ShouldStop(-2147483648);
_emprepa = BA.ObjectToString("");Debug.locals.put("Emprepa", _emprepa);
 BA.debugLineNum = 1217;BA.debugLine="Tidopa = \"\"";
Debug.ShouldStop(1);
_tidopa = BA.ObjectToString("");Debug.locals.put("Tidopa", _tidopa);
 BA.debugLineNum = 1218;BA.debugLine="Nudopa = \"\"";
Debug.ShouldStop(2);
_nudopa = BA.ObjectToString("");Debug.locals.put("Nudopa", _nudopa);
 BA.debugLineNum = 1219;BA.debugLine="Endopa = \"\"";
Debug.ShouldStop(4);
_endopa = BA.ObjectToString("");Debug.locals.put("Endopa", _endopa);
 BA.debugLineNum = 1220;BA.debugLine="Nulidopa = \"\"";
Debug.ShouldStop(8);
_nulidopa = BA.ObjectToString("");Debug.locals.put("Nulidopa", _nulidopa);
 if (true) break;
;
 BA.debugLineNum = 1224;BA.debugLine="If Udtpr = 2 Then";
Debug.ShouldStop(128);

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_udtpr,BA.numberCast(double.class, 2))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1225;BA.debugLine="Precio = Precio*Rludpr";
Debug.ShouldStop(256);
_precio = RemoteObject.solve(new RemoteObject[] {_precio,_rludpr}, "*",0, 0);Debug.locals.put("Precio", _precio);
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 1228;BA.debugLine="ProgressDialogShow(Codigo & \"-\" & Descripcion)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_codigo,RemoteObject.createImmutable("-"),_descripcion))));
 BA.debugLineNum = 1230;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(8192);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 1233;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(65536);
_fechaemision = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 1235;BA.debugLine="If Prct And Usar_Precio_Original Then";
Debug.ShouldStop(262144);
if (true) break;

case 26:
//if
this.state = 37;
if (RemoteObject.solveBoolean(".",_prct) && RemoteObject.solveBoolean(".",__ref.getField(true,"_usar_precio_original" /*RemoteObject*/ ))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1237;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 29:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1239;BA.debugLine="Wait For(Sb_Traer_Concepto(Codigo,Empresa,Su";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_incorporar_productos"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_concepto" /*RemoteObject*/ ,(Object)(_codigo),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_podtglli)));
this.state = 56;
return;
case 56:
//C
this.state = 32;
_id_docdet = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Id_DocDet", _id_docdet);
;
 BA.debugLineNum = 1241;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
Debug.ShouldStop(16777216);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocDet = "),_id_docdet));
 BA.debugLineNum = 1242;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
Debug.ShouldStop(33554432);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 1244;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
Debug.ShouldStop(134217728);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),_id_docdet));
 BA.debugLineNum = 1245;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
Debug.ShouldStop(268435456);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_id = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 1247;BA.debugLine="New_Row.Put(\"Idmaeedo_Dori\",Idmaeedo_Dori)";
Debug.ShouldStop(1073741824);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Idmaeedo_Dori"))),(Object)((_idmaeedo_dori)));
 BA.debugLineNum = 1248;BA.debugLine="New_Row.Put(\"Idmaeddo_Dori\",Idmaeddo_Dori)";
Debug.ShouldStop(-2147483648);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Idmaeddo_Dori"))),(Object)((_idmaeddo_dori)));
 BA.debugLineNum = 1249;BA.debugLine="New_Row.Put(\"Emprepa\",Emprepa)";
Debug.ShouldStop(1);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Emprepa"))),(Object)((_emprepa)));
 BA.debugLineNum = 1250;BA.debugLine="New_Row.Put(\"Tidopa\",Tidopa)";
Debug.ShouldStop(2);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tidopa"))),(Object)((_tidopa)));
 BA.debugLineNum = 1251;BA.debugLine="New_Row.Put(\"Nudopa\",Nudopa)";
Debug.ShouldStop(4);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nudopa"))),(Object)((_nudopa)));
 BA.debugLineNum = 1252;BA.debugLine="New_Row.Put(\"Endopa\",Endopa)";
Debug.ShouldStop(8);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Endopa"))),(Object)((_endopa)));
 BA.debugLineNum = 1253;BA.debugLine="New_Row.Put(\"Nulidopa\",Nulidopa)";
Debug.ShouldStop(16);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nulidopa"))),(Object)((_nulidopa)));
 BA.debugLineNum = 1254;BA.debugLine="New_Row.Put(\"CantUd1_Dori\",CantUd1_Dori)";
Debug.ShouldStop(32);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CantUd1_Dori"))),(Object)((_cantud1_dori)));
 BA.debugLineNum = 1255;BA.debugLine="New_Row.Put(\"CantUd2_Dori\",CantUd2_Dori)";
Debug.ShouldStop(64);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CantUd2_Dori"))),(Object)((_cantud2_dori)));
 BA.debugLineNum = 1257;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
Debug.ShouldStop(256);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codfuncionario"))),(Object)((_codfuncionario)));
 BA.debugLineNum = 1258;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
Debug.ShouldStop(512);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codvendedor"))),(Object)((_codfuncionario)));
 BA.debugLineNum = 1259;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
Debug.ShouldStop(1024);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codlista"))),(Object)((_codlista)));
 BA.debugLineNum = 1261;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
Debug.ShouldStop(4096);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)((_moneda)));
 BA.debugLineNum = 1262;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
Debug.ShouldStop(8192);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)((_tipo_moneda)));
 BA.debugLineNum = 1263;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
Debug.ShouldStop(16384);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)((_tipo_cambio)));
 BA.debugLineNum = 1265;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
Debug.ShouldStop(65536);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fechaemision"))),(Object)((_fechaemision)));
 BA.debugLineNum = 1266;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
Debug.ShouldStop(131072);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fecharecepcion"))),(Object)((_fechaemision)));
 BA.debugLineNum = 1268;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
Debug.ShouldStop(524288);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("empresa"))),(Object)((_empresa)));
 BA.debugLineNum = 1269;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
Debug.ShouldStop(1048576);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sucursal"))),(Object)((_sucursal)));
 BA.debugLineNum = 1270;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
Debug.ShouldStop(2097152);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bodega"))),(Object)((_bodega)));
 BA.debugLineNum = 1272;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\",New_Row)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_procesar_datos" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DescuentoPorc")),(Object)(_new_row));
 BA.debugLineNum = 1274;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
Debug.ShouldStop(33554432);
parent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_new_row),(Object)(_fila_id));
 BA.debugLineNum = 1276;BA.debugLine="If Id_DocDet <> 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",_id_docdet,BA.numberCast(double.class, 0))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1277;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","68650899",RemoteObject.concat(_codigo,RemoteObject.createImmutable("-"),_descripcion),0);
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
 BA.debugLineNum = 1284;BA.debugLine="If Not(Prct) Then";
Debug.ShouldStop(8);

case 37:
//if
this.state = 48;
if (parent.__c.runMethod(true,"Not",(Object)(_prct)).<Boolean>get().booleanValue()) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 1286;BA.debugLine="TotalNetoDoc = TotalNetoDoc + Vaneli";
Debug.ShouldStop(32);
__ref.setField ("_totalnetodoc" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalnetodoc" /*RemoteObject*/ ),_vaneli}, "+",1, 0));
 BA.debugLineNum = 1287;BA.debugLine="TotalBrutoDoc = TotalBrutoDoc + Vabrdo";
Debug.ShouldStop(64);
__ref.setField ("_totalbrutodoc" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_totalbrutodoc" /*RemoteObject*/ ),_vabrdo}, "+",1, 0));
 BA.debugLineNum = 1289;BA.debugLine="Wait For(Sb_Traer_Producto(Codigo,Empresa,Suc";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_incorporar_productos"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_producto" /*RemoteObject*/ ,(Object)(_codigo),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega)));
this.state = 57;
return;
case 57:
//C
this.state = 40;
_id_docdet = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Id_DocDet", _id_docdet);
;
 BA.debugLineNum = 1291;BA.debugLine="If Id_DocDet <> 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 40:
//if
this.state = 47;
if (RemoteObject.solveBoolean("!",_id_docdet,BA.numberCast(double.class, 0))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 1293;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Wh";
Debug.ShouldStop(4096);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocDet = "),_id_docdet));
 BA.debugLineNum = 1294;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Vari";
Debug.ShouldStop(8192);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 1296;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
Debug.ShouldStop(32768);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),_id_docdet));
 BA.debugLineNum = 1297;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Vari";
Debug.ShouldStop(65536);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_id = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 1299;BA.debugLine="New_Row.Put(\"idmaeedo_dori\",Idmaeedo_Dori)";
Debug.ShouldStop(262144);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idmaeedo_dori"))),(Object)((_idmaeedo_dori)));
 BA.debugLineNum = 1300;BA.debugLine="New_Row.Put(\"idmaeddo_dori\",Idmaeddo_Dori)";
Debug.ShouldStop(524288);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idmaeddo_dori"))),(Object)((_idmaeddo_dori)));
 BA.debugLineNum = 1301;BA.debugLine="New_Row.Put(\"emprepa\",Emprepa)";
Debug.ShouldStop(1048576);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("emprepa"))),(Object)((_emprepa)));
 BA.debugLineNum = 1302;BA.debugLine="New_Row.Put(\"tidopa\",Tidopa)";
Debug.ShouldStop(2097152);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tidopa"))),(Object)((_tidopa)));
 BA.debugLineNum = 1303;BA.debugLine="New_Row.Put(\"nudopa\",Nudopa)";
Debug.ShouldStop(4194304);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nudopa"))),(Object)((_nudopa)));
 BA.debugLineNum = 1304;BA.debugLine="New_Row.Put(\"endopa\",Endopa)";
Debug.ShouldStop(8388608);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("endopa"))),(Object)((_endopa)));
 BA.debugLineNum = 1305;BA.debugLine="New_Row.Put(\"nulidopa\",Nulidopa)";
Debug.ShouldStop(16777216);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nulidopa"))),(Object)((_nulidopa)));
 BA.debugLineNum = 1307;BA.debugLine="New_Row.Put(\"cantUd1_dori\",CantUd1_Dori)";
Debug.ShouldStop(67108864);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantUd1_dori"))),(Object)((_cantud1_dori)));
 BA.debugLineNum = 1308;BA.debugLine="New_Row.Put(\"cantUd2_dori\",CantUd2_Dori)";
Debug.ShouldStop(134217728);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantUd2_dori"))),(Object)((_cantud2_dori)));
 BA.debugLineNum = 1310;BA.debugLine="New_Row.Put(\"cantidad\",Cantidad)";
Debug.ShouldStop(536870912);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantidad"))),(Object)((_cantidad)));
 BA.debugLineNum = 1311;BA.debugLine="New_Row.Put(\"precio\",Precio)";
Debug.ShouldStop(1073741824);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precio"))),(Object)((_precio)));
 BA.debugLineNum = 1313;BA.debugLine="New_Row.Put(\"codfuncionario\",CodFuncionario)";
Debug.ShouldStop(1);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codfuncionario"))),(Object)((_codfuncionario)));
 BA.debugLineNum = 1314;BA.debugLine="New_Row.Put(\"codvendedor\",CodFuncionario)";
Debug.ShouldStop(2);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codvendedor"))),(Object)((_codfuncionario)));
 BA.debugLineNum = 1315;BA.debugLine="New_Row.Put(\"codlista\",Codlista)";
Debug.ShouldStop(4);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codlista"))),(Object)((_codlista)));
 BA.debugLineNum = 1317;BA.debugLine="New_Row.Put(\"moneda\",Moneda)";
Debug.ShouldStop(16);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)((_moneda)));
 BA.debugLineNum = 1318;BA.debugLine="New_Row.Put(\"tipo_moneda\",Tipo_moneda)";
Debug.ShouldStop(32);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)((_tipo_moneda)));
 BA.debugLineNum = 1319;BA.debugLine="New_Row.Put(\"tipo_cambio\",Tipo_cambio)";
Debug.ShouldStop(64);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)((_tipo_cambio)));
 BA.debugLineNum = 1321;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
Debug.ShouldStop(256);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fechaemision"))),(Object)((_fechaemision)));
 BA.debugLineNum = 1322;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
Debug.ShouldStop(512);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fecharecepcion"))),(Object)((_fechaemision)));
 BA.debugLineNum = 1324;BA.debugLine="New_Row.Put(\"empresa\",Empresa)";
Debug.ShouldStop(2048);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("empresa"))),(Object)((_empresa)));
 BA.debugLineNum = 1325;BA.debugLine="New_Row.Put(\"sucursal\",Sucursal)";
Debug.ShouldStop(4096);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sucursal"))),(Object)((_sucursal)));
 BA.debugLineNum = 1326;BA.debugLine="New_Row.Put(\"bodega\",Bodega)";
Debug.ShouldStop(8192);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bodega"))),(Object)((_bodega)));
 BA.debugLineNum = 1328;BA.debugLine="Sb_Procesar_Datos(\"Cantidad\",New_Row)";
Debug.ShouldStop(32768);
__ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_procesar_datos" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Cantidad")),(Object)(_new_row));
 BA.debugLineNum = 1330;BA.debugLine="Wait For(Sb_Traer_Descuentos(Nulido)) Comple";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_incorporar_productos"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_descuentos" /*RemoteObject*/ ,(Object)(_nulido)));
this.state = 58;
return;
case 58:
//C
this.state = 43;
_tbldescuentos = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("TblDescuentos", _tbldescuentos);
;
 BA.debugLineNum = 1332;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet F";
Debug.ShouldStop(524288);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "),_id_docdet));
 BA.debugLineNum = 1333;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(V";
Debug.ShouldStop(1048576);
_fila_dscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_dscto = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Dscto", _fila_dscto);Debug.locals.put("Fila_Dscto", _fila_dscto);
 BA.debugLineNum = 1335;BA.debugLine="If TblDescuentos <> Null Then";
Debug.ShouldStop(4194304);
if (true) break;

case 43:
//if
this.state = 46;
if (RemoteObject.solveBoolean("N",_tbldescuentos)) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1336;BA.debugLine="Sb_Insertar_Descuentos_En_Escala(New_Row,Fi";
Debug.ShouldStop(8388608);
__ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_insertar_descuentos_en_escala" /*RemoteObject*/ ,(Object)(_new_row),(Object)(_fila_dscto),(Object)(_tbldescuentos),(Object)(_precio));
 if (true) break;

case 46:
//C
this.state = 47;
;
 BA.debugLineNum = 1339;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detall";
Debug.ShouldStop(67108864);
parent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_new_row),(Object)(_fila_id));
 BA.debugLineNum = 1341;BA.debugLine="Log(Codigo & \"-\" & Descripcion)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","68650963",RemoteObject.concat(_codigo,RemoteObject.createImmutable("-"),_descripcion),0);
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
Debug.locals.put("Fila", _fila);
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
 BA.debugLineNum = 1353;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1355;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _js) throws Exception{
}
public static void  _complete(RemoteObject __ref,RemoteObject _rowproducto) throws Exception{
}
public static RemoteObject  _sb_insertar_descuentos_en_escala(RemoteObject __ref,RemoteObject _fila,RemoteObject _fila_dscto,RemoteObject _tbldescuentos,RemoteObject _precio) throws Exception{
try {
		Debug.PushSubsStack("Sb_Insertar_Descuentos_En_Escala (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1539);
if (RapidSub.canDelegate("sb_insertar_descuentos_en_escala")) { return __ref.runUserSub(false, "crear_documento","sb_insertar_descuentos_en_escala", __ref, _fila, _fila_dscto, _tbldescuentos, _precio);}
RemoteObject _id_docdet = RemoteObject.createImmutable(0);
RemoteObject _nrodscto = RemoteObject.createImmutable(0);
RemoteObject _valor = RemoteObject.createImmutable(0);
RemoteObject _total_descuento = RemoteObject.createImmutable(0);
RemoteObject _total_pc = RemoteObject.createImmutable(0);
RemoteObject _decimales = RemoteObject.createImmutable(0);
RemoteObject _moneda_det = RemoteObject.createImmutable("");
RemoteObject _moneda_enc = RemoteObject.createImmutable("");
RemoteObject _tipo_moneda_enc = RemoteObject.createImmutable("");
RemoteObject _tipo_cambio_ent = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filadscto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _kodt = RemoteObject.createImmutable("");
RemoteObject _podt = RemoteObject.createImmutable(0);
RemoteObject _vadt = RemoteObject.createImmutable(0);
Debug.locals.put("Fila", _fila);
Debug.locals.put("Fila_Dscto", _fila_dscto);
Debug.locals.put("TblDescuentos", _tbldescuentos);
Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 1539;BA.debugLine="Sub Sb_Insertar_Descuentos_En_Escala(Fila As Map,F";
Debug.ShouldStop(4);
 BA.debugLineNum = 1541;BA.debugLine="Dim Id_DocDet As Int = Fila.Get(\"id_docdet\")";
Debug.ShouldStop(16);
_id_docdet = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));Debug.locals.put("Id_DocDet", _id_docdet);Debug.locals.put("Id_DocDet", _id_docdet);
 BA.debugLineNum = 1542;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
Debug.ShouldStop(32);
crear_documento._id_docenc = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));__ref.setField("_id_docenc",crear_documento._id_docenc);
 BA.debugLineNum = 1544;BA.debugLine="Dim NroDscto As Int = 0";
Debug.ShouldStop(128);
_nrodscto = BA.numberCast(int.class, 0);Debug.locals.put("NroDscto", _nrodscto);Debug.locals.put("NroDscto", _nrodscto);
 BA.debugLineNum = 1553;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(65536);
_valor = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));Debug.locals.put("Valor", _valor);Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 1555;BA.debugLine="Dim Total_Descuento As Double";
Debug.ShouldStop(262144);
_total_descuento = RemoteObject.createImmutable(0);Debug.locals.put("Total_Descuento", _total_descuento);
 BA.debugLineNum = 1556;BA.debugLine="Dim Total_Pc As Double";
Debug.ShouldStop(524288);
_total_pc = RemoteObject.createImmutable(0);Debug.locals.put("Total_Pc", _total_pc);
 BA.debugLineNum = 1559;BA.debugLine="If Fila_Dscto.IsInitialized Then";
Debug.ShouldStop(4194304);
if (_fila_dscto.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1560;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
Debug.ShouldStop(8388608);
crear_documento._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(crear_documento._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Descuentos_Doc")),(Object)(_fila_dscto));
 };
 BA.debugLineNum = 1563;BA.debugLine="Dim Decimales As Int";
Debug.ShouldStop(67108864);
_decimales = RemoteObject.createImmutable(0);Debug.locals.put("Decimales", _decimales);
 BA.debugLineNum = 1565;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
Debug.ShouldStop(268435456);
_moneda_det = RemoteObject.createImmutable("");Debug.locals.put("Moneda_Det", _moneda_det);
 BA.debugLineNum = 1566;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
Debug.ShouldStop(536870912);
_moneda_enc = RemoteObject.createImmutable("");Debug.locals.put("Moneda_Enc", _moneda_enc);
 BA.debugLineNum = 1568;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
Debug.ShouldStop(-2147483648);
_tipo_moneda_enc = RemoteObject.createImmutable("");Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);
 BA.debugLineNum = 1569;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
Debug.ShouldStop(1);
_tipo_cambio_ent = RemoteObject.createImmutable(0);Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);
 BA.debugLineNum = 1571;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_moneda_det.runMethod(true,"trim"),_moneda_enc.runMethod(true,"trim"))) { 
 BA.debugLineNum = 1572;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 1573;BA.debugLine="Decimales = 2";
Debug.ShouldStop(16);
_decimales = BA.numberCast(int.class, 2);Debug.locals.put("Decimales", _decimales);
 };
 }else {
 BA.debugLineNum = 1576;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 1577;BA.debugLine="Decimales = 2";
Debug.ShouldStop(256);
_decimales = BA.numberCast(int.class, 2);Debug.locals.put("Decimales", _decimales);
 };
 };
 BA.debugLineNum = 1589;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";
Debug.ShouldStop(1048576);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_tbldescuentos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1591;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
Debug.ShouldStop(4194304);
_filadscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filadscto = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _tbldescuentos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("FilaDscto", _filadscto);Debug.locals.put("FilaDscto", _filadscto);
 BA.debugLineNum = 1596;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
Debug.ShouldStop(134217728);
_kodt = BA.ObjectToString("D_SIN_TIPO");Debug.locals.put("Kodt", _kodt);Debug.locals.put("Kodt", _kodt);
 BA.debugLineNum = 1597;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
Debug.ShouldStop(268435456);
_podt = BA.numberCast(double.class, _filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dscto")))));Debug.locals.put("Podt", _podt);Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 1598;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
Debug.ShouldStop(536870912);
_vadt = BA.numberCast(double.class, _filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Valor")))));Debug.locals.put("Vadt", _vadt);Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 1600;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("!",_vadt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1602;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1604;BA.debugLine="If Podt > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_podt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1605;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
Debug.ShouldStop(16);
_vadt = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_podt,RemoteObject.createImmutable(100)}, "/",0, 0)),_valor}, "*",0, 0)),(Object)(_decimales));Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 1608;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
Debug.ShouldStop(128);
_podt = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_vadt,_valor}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Podt", _podt);
 }else {
 BA.debugLineNum = 1611;BA.debugLine="Vadt = 0";
Debug.ShouldStop(1024);
_vadt = BA.numberCast(double.class, 0);Debug.locals.put("Vadt", _vadt);
 };
 }else {
 BA.debugLineNum = 1616;BA.debugLine="If Vadt <> 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_vadt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1618;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
Debug.ShouldStop(131072);
_podt = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_vadt,_valor}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Podt", _podt);
 }else {
 BA.debugLineNum = 1621;BA.debugLine="Podt = 0";
Debug.ShouldStop(1048576);
_podt = BA.numberCast(double.class, 0);Debug.locals.put("Podt", _podt);
 };
 };
 BA.debugLineNum = 1626;BA.debugLine="Podt = Round2(Podt,Decimales)";
Debug.ShouldStop(33554432);
_podt = crear_documento.__c.runMethod(true,"Round2",(Object)(_podt),(Object)(_decimales));Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 1628;BA.debugLine="If Podt <> 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1630;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
Debug.ShouldStop(536870912);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)"));
 BA.debugLineNum = 1631;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
Debug.ShouldStop(1073741824);
crear_documento._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(crear_documento.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(__ref.getField(true,"_id_docenc" /*RemoteObject*/ )),(_id_docdet),RemoteObject.createImmutable(("")),(_kodt),(_podt),(_vadt),(_podt)})))));
 BA.debugLineNum = 1633;BA.debugLine="NroDscto = NroDscto + 1";
Debug.ShouldStop(1);
_nrodscto = RemoteObject.solve(new RemoteObject[] {_nrodscto,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NroDscto", _nrodscto);
 };
 BA.debugLineNum = 1637;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
Debug.ShouldStop(16);
_total_descuento = RemoteObject.solve(new RemoteObject[] {_total_descuento,_vadt}, "+",1, 0);Debug.locals.put("Total_Descuento", _total_descuento);
 BA.debugLineNum = 1638;BA.debugLine="Valor = Valor - Vadt";
Debug.ShouldStop(32);
_valor = RemoteObject.solve(new RemoteObject[] {_valor,_vadt}, "-",1, 0);Debug.locals.put("Valor", _valor);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1644;BA.debugLine="If Total_Descuento <> 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_total_descuento,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1645;BA.debugLine="Total_Pc = Total_Descuento / Precio";
Debug.ShouldStop(4096);
_total_pc = RemoteObject.solve(new RemoteObject[] {_total_descuento,_precio}, "/",0, 0);Debug.locals.put("Total_Pc", _total_pc);
 };
 BA.debugLineNum = 1660;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
Debug.ShouldStop(134217728);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descuentovalor"))),(Object)((_total_descuento)));
 BA.debugLineNum = 1661;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
Debug.ShouldStop(268435456);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nrodscto"))),(Object)((_nrodscto)));
 BA.debugLineNum = 1666;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\",Fila)";
Debug.ShouldStop(2);
__ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_procesar_datos" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DescuentoValor")),(Object)(_fila));
 BA.debugLineNum = 1668;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_nuevo_documento(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Nuevo_Documento (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("sb_nuevo_documento")) { return __ref.runUserSub(false, "crear_documento","sb_nuevo_documento", __ref);}
ResumableSub_Sb_Nuevo_Documento rsub = new ResumableSub_Sb_Nuevo_Documento(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Nuevo_Documento extends BA.ResumableSub {
public ResumableSub_Sb_Nuevo_Documento(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _b4a_despachosimple = RemoteObject.createImmutable(false);
RemoteObject _fechaemision = RemoteObject.createImmutable(0L);
RemoteObject _fecha_1er_vencimiento = RemoteObject.createImmutable(0L);
RemoteObject _fechaultvencimiento = RemoteObject.createImmutable(0L);
RemoteObject _fecharecepcion = RemoteObject.createImmutable(0L);
RemoteObject _cuotas = RemoteObject.createImmutable(0);
RemoteObject _dias_1er_vencimiento = RemoteObject.createImmutable(0);
RemoteObject _dias_vencimiento = RemoteObject.createImmutable(0);
RemoteObject _forma_de_pago = RemoteObject.createImmutable("");
RemoteObject _centro_costo = RemoteObject.createImmutable("");
RemoteObject _moneda_doc = RemoteObject.createImmutable("");
RemoteObject _valor_dolar = RemoteObject.createImmutable(0);
RemoteObject _tasadorig_doc = RemoteObject.createImmutable(0);
RemoteObject _tipomoneda = RemoteObject.createImmutable("");
RemoteObject _listaprecios = RemoteObject.createImmutable("");
RemoteObject _newnrodocumento = RemoteObject.createImmutable("");
RemoteObject _docen_neto_bruto = RemoteObject.createImmutable("");
RemoteObject _codentidad = RemoteObject.createImmutable("");
RemoteObject _codsucentidad = RemoteObject.createImmutable("");
RemoteObject _nombre_entidad = RemoteObject.createImmutable("");
RemoteObject _fenc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _flobs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fldesp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Nuevo_Documento (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,34);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 36;BA.debugLine="Dim	B4A_DespachoSimple As Boolean = Variables.Glo";
Debug.ShouldStop(8);
_b4a_despachosimple = BA.ObjectToBoolean(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("B4A_DespachoSimple")))));Debug.locals.put("B4A_DespachoSimple", _b4a_despachosimple);Debug.locals.put("B4A_DespachoSimple", _b4a_despachosimple);
 BA.debugLineNum = 38;BA.debugLine="Consulta_Sql = \"DELETE FROM [Encabezado_Doc] WHER";
Debug.ShouldStop(32);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("DELETE FROM [Encabezado_Doc] WHERE [nuevo_doc] = ?"));
 BA.debugLineNum = 39;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(64);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 41;BA.debugLine="Consulta_Sql = \"DELETE FROM [Detalle_Doc] WHERE [";
Debug.ShouldStop(256);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("DELETE FROM [Detalle_Doc] WHERE [id_docenc] = ?"));
 BA.debugLineNum = 42;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(512);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 44;BA.debugLine="Consulta_Sql = \"DELETE FROM [Descuentos_Doc] WHER";
Debug.ShouldStop(2048);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("DELETE FROM [Descuentos_Doc] WHERE id_docenc = ?"));
 BA.debugLineNum = 45;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(4096);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 47;BA.debugLine="Consulta_Sql = \"DELETE FROM [Impuestos_Doc] WHERE";
Debug.ShouldStop(16384);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("DELETE FROM [Impuestos_Doc] WHERE id_docenc = ?"));
 BA.debugLineNum = 48;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(32768);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 50;BA.debugLine="Consulta_Sql = \"DELETE FROM [Observaciones_Doc] W";
Debug.ShouldStop(131072);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("DELETE FROM [Observaciones_Doc] WHERE id_docenc = ?"));
 BA.debugLineNum = 51;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(262144);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 54;BA.debugLine="Consulta_Sql = \"Insert Into Encabezado_Doc (Nuevo";
Debug.ShouldStop(2097152);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Insert Into Encabezado_Doc (Nuevo_Doc,Modalidad,Empresa,Sucursal) Values (?,?,?,?)"));
 BA.debugLineNum = 55;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(4194304);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable((1)),(parent._variables._gl_modalidad /*RemoteObject*/ ),(parent._variables._gl_empresa /*RemoteObject*/ ),(parent._variables._gl_sucursal /*RemoteObject*/ )})))));
 BA.debugLineNum = 58;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(33554432);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select * From Encabezado_Doc Where Nuevo_Doc = 1"));
 BA.debugLineNum = 59;BA.debugLine="Fila_Encabezado = DBUtils.ExecuteMap(Variables.vS";
Debug.ShouldStop(67108864);
__ref.setField ("_fila_encabezado" /*RemoteObject*/ ,parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null")))));
 BA.debugLineNum = 62;BA.debugLine="Id_DocEnc = Fila_Encabezado.Get(\"id_docenc\")";
Debug.ShouldStop(536870912);
__ref.setField ("_id_docenc" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc"))))));
 BA.debugLineNum = 65;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc From Encabezado_";
Debug.ShouldStop(1);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc From Encabezado_Doc Where Id_DocEnc = "),__ref.getField(true,"_id_docenc" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="Fila_IdEnc = DBUtils.ExecuteMap(Variables.vSql,Co";
Debug.ShouldStop(2);
__ref.setField ("_fila_idenc" /*RemoteObject*/ ,parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null")))));
 BA.debugLineNum = 69;BA.debugLine="Consulta_Sql = \"Insert Into Observaciones_Doc (Id";
Debug.ShouldStop(16);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Insert Into Observaciones_Doc (Id_DocEnc) Values (?)"));
 BA.debugLineNum = 70;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(32);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(true,"_id_docenc" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 73;BA.debugLine="Consulta_Sql = \"Select * From Observaciones_Doc W";
Debug.ShouldStop(256);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From Observaciones_Doc Where Id_DocEnc = "),__ref.getField(true,"_id_docenc" /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="Fila_Observaciones = DBUtils.ExecuteMap(Variables";
Debug.ShouldStop(512);
__ref.setField ("_fila_observaciones" /*RemoteObject*/ ,parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null")))));
 BA.debugLineNum = 76;BA.debugLine="If B4A_DespachoSimple Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (_b4a_despachosimple.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 79;BA.debugLine="Consulta_Sql = \"Insert Into DespaFacil_Doc (Id_D";
Debug.ShouldStop(16384);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Insert Into DespaFacil_Doc (Id_DocEnc) Values (?)"));
 BA.debugLineNum = 80;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Array";
Debug.ShouldStop(32768);
parent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(true,"_id_docenc" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 83;BA.debugLine="Consulta_Sql = \"Select * From DespaFacil_Doc Whe";
Debug.ShouldStop(262144);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From DespaFacil_Doc Where Id_DocEnc = "),__ref.getField(true,"_id_docenc" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="Fila_DespaFacil = DBUtils.ExecuteMap(Variables.v";
Debug.ShouldStop(524288);
__ref.setField ("_fila_despafacil" /*RemoteObject*/ ,parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null")))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 88;BA.debugLine="Log(\"Documento cargado... Id_DocEnc = \" & Id_DocE";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","68388662",RemoteObject.concat(RemoteObject.createImmutable("Documento cargado... Id_DocEnc = "),__ref.getField(true,"_id_docenc" /*RemoteObject*/ )),0);
 BA.debugLineNum = 91;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(67108864);
_fechaemision = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 92;BA.debugLine="Dim Fecha_1er_Vencimiento As Long = FechaEmision";
Debug.ShouldStop(134217728);
_fecha_1er_vencimiento = _fechaemision;Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);Debug.locals.put("Fecha_1er_Vencimiento", _fecha_1er_vencimiento);
 BA.debugLineNum = 93;BA.debugLine="Dim FechaUltVencimiento As Long = FechaEmision";
Debug.ShouldStop(268435456);
_fechaultvencimiento = _fechaemision;Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);Debug.locals.put("FechaUltVencimiento", _fechaultvencimiento);
 BA.debugLineNum = 94;BA.debugLine="Dim FechaRecepcion As Long = FechaEmision";
Debug.ShouldStop(536870912);
_fecharecepcion = _fechaemision;Debug.locals.put("FechaRecepcion", _fecharecepcion);Debug.locals.put("FechaRecepcion", _fecharecepcion);
 BA.debugLineNum = 96;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 98;BA.debugLine="Dim Cuotas As Int = 0";
Debug.ShouldStop(2);
_cuotas = BA.numberCast(int.class, 0);Debug.locals.put("Cuotas", _cuotas);Debug.locals.put("Cuotas", _cuotas);
 BA.debugLineNum = 99;BA.debugLine="Dim Dias_1er_Vencimiento As Int = 0";
Debug.ShouldStop(4);
_dias_1er_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);Debug.locals.put("Dias_1er_Vencimiento", _dias_1er_vencimiento);
 BA.debugLineNum = 100;BA.debugLine="Dim Dias_Vencimiento As Int = 0";
Debug.ShouldStop(8);
_dias_vencimiento = BA.numberCast(int.class, 0);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);Debug.locals.put("Dias_Vencimiento", _dias_vencimiento);
 BA.debugLineNum = 101;BA.debugLine="Dim Forma_de_Pago As String = \"\"";
Debug.ShouldStop(16);
_forma_de_pago = BA.ObjectToString("");Debug.locals.put("Forma_de_Pago", _forma_de_pago);Debug.locals.put("Forma_de_Pago", _forma_de_pago);
 BA.debugLineNum = 103;BA.debugLine="Dim Centro_Costo As String";
Debug.ShouldStop(64);
_centro_costo = RemoteObject.createImmutable("");Debug.locals.put("Centro_Costo", _centro_costo);
 BA.debugLineNum = 105;BA.debugLine="Dim Moneda_Doc As String = Variables.Global_Row_M";
Debug.ShouldStop(256);
_moneda_doc = BA.ObjectToString(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO")))));Debug.locals.put("Moneda_Doc", _moneda_doc);Debug.locals.put("Moneda_Doc", _moneda_doc);
 BA.debugLineNum = 106;BA.debugLine="Dim Valor_Dolar As Double = Variables.Global_Row_";
Debug.ShouldStop(512);
_valor_dolar = BA.numberCast(double.class, parent._variables._global_row_dolar /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO")))));Debug.locals.put("Valor_Dolar", _valor_dolar);Debug.locals.put("Valor_Dolar", _valor_dolar);
 BA.debugLineNum = 107;BA.debugLine="Dim Tasadorig_Doc As Double = Variables.Global_Ro";
Debug.ShouldStop(1024);
_tasadorig_doc = BA.numberCast(double.class, parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO")))));Debug.locals.put("Tasadorig_Doc", _tasadorig_doc);Debug.locals.put("Tasadorig_Doc", _tasadorig_doc);
 BA.debugLineNum = 108;BA.debugLine="Dim TipoMoneda As String =Variables.Global_Row_Mo";
Debug.ShouldStop(2048);
_tipomoneda = BA.ObjectToString(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO")))));Debug.locals.put("TipoMoneda", _tipomoneda);Debug.locals.put("TipoMoneda", _tipomoneda);
 BA.debugLineNum = 110;BA.debugLine="Dim ListaPrecios As String";
Debug.ShouldStop(8192);
_listaprecios = RemoteObject.createImmutable("");Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 112;BA.debugLine="Dim NewNroDocumento = \"NEWXXXXXXX\"";
Debug.ShouldStop(32768);
_newnrodocumento = BA.ObjectToString("NEWXXXXXXX");Debug.locals.put("NewNroDocumento", _newnrodocumento);Debug.locals.put("NewNroDocumento", _newnrodocumento);
 BA.debugLineNum = 114;BA.debugLine="Dim DocEn_Neto_Bruto As String = Variables.Global";
Debug.ShouldStop(131072);
_docen_neto_bruto = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Vnta_TipoValor_Bruto_Neto")))));Debug.locals.put("DocEn_Neto_Bruto", _docen_neto_bruto);Debug.locals.put("DocEn_Neto_Bruto", _docen_neto_bruto);
 BA.debugLineNum = 116;BA.debugLine="Centro_Costo = \"LUVTVEN\"";
Debug.ShouldStop(524288);
_centro_costo = BA.ObjectToString("LUVTVEN");Debug.locals.put("Centro_Costo", _centro_costo);
 BA.debugLineNum = 117;BA.debugLine="Centro_Costo = Variables.Global_Row_Configuracion";
Debug.ShouldStop(1048576);
_centro_costo = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((_centro_costo))));Debug.locals.put("Centro_Costo", _centro_costo);
 BA.debugLineNum = 119;BA.debugLine="ListaPrecios = Variables.Gl_Lista_Precios";
Debug.ShouldStop(4194304);
_listaprecios = parent._variables._gl_lista_precios /*RemoteObject*/ ;Debug.locals.put("ListaPrecios", _listaprecios);
 BA.debugLineNum = 121;BA.debugLine="Fila_Encabezado.Put(\"TipoDoc\".ToLowerCase,\"NVV\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoDoc").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable("NVV"))));
 BA.debugLineNum = 122;BA.debugLine="Fila_Encabezado.Put(\"NroDocumento\".ToLowerCase,Ne";
Debug.ShouldStop(33554432);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("NroDocumento").runMethod(true,"toLowerCase"))),(Object)((_newnrodocumento)));
 BA.debugLineNum = 124;BA.debugLine="Fila_Encabezado.Put(\"FechaEmision\".ToLowerCase,Fe";
Debug.ShouldStop(134217728);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaEmision").runMethod(true,"toLowerCase"))),(Object)((_fechaemision)));
 BA.debugLineNum = 125;BA.debugLine="Fila_Encabezado.Put(\"Fecha_1er_Vencimiento\".ToLow";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fecha_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_fecha_1er_vencimiento)));
 BA.debugLineNum = 126;BA.debugLine="Fila_Encabezado.Put(\"FechaUltVencimiento\".ToLower";
Debug.ShouldStop(536870912);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaUltVencimiento").runMethod(true,"toLowerCase"))),(Object)((_fechaultvencimiento)));
 BA.debugLineNum = 127;BA.debugLine="Fila_Encabezado.Put(\"FechaRecepcion\".ToLowerCase,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("FechaRecepcion").runMethod(true,"toLowerCase"))),(Object)((_fecharecepcion)));
 BA.debugLineNum = 129;BA.debugLine="Fila_Encabezado.Put(\"Cuotas\".ToLowerCase,Cuotas)";
Debug.ShouldStop(1);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Cuotas").runMethod(true,"toLowerCase"))),(Object)((_cuotas)));
 BA.debugLineNum = 130;BA.debugLine="Fila_Encabezado.Put(\"Dias_1er_Vencimiento\".ToLowe";
Debug.ShouldStop(2);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_1er_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_1er_vencimiento)));
 BA.debugLineNum = 131;BA.debugLine="Fila_Encabezado.Put(\"Dias_Vencimiento\".ToLowerCas";
Debug.ShouldStop(4);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Dias_Vencimiento").runMethod(true,"toLowerCase"))),(Object)((_dias_vencimiento)));
 BA.debugLineNum = 133;BA.debugLine="If Not(Row_Entidad.IsInitialized) Then";
Debug.ShouldStop(16);
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_row_entidad" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 134;BA.debugLine="Row_Entidad = Variables.Global_Row_Entidad_X_Def";
Debug.ShouldStop(32);
__ref.setField ("_row_entidad" /*RemoteObject*/ ,parent._variables._global_row_entidad_x_defecto /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 137;BA.debugLine="Dim CodEntidad As String = Row_Entidad.Get(\"KOEN\"";
Debug.ShouldStop(256);
_codentidad = BA.ObjectToString(__ref.getField(false,"_row_entidad" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOEN")))));Debug.locals.put("CodEntidad", _codentidad);Debug.locals.put("CodEntidad", _codentidad);
 BA.debugLineNum = 138;BA.debugLine="Dim CodSucEntidad As String = Row_Entidad.Get(\"SU";
Debug.ShouldStop(512);
_codsucentidad = BA.ObjectToString(__ref.getField(false,"_row_entidad" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUEN")))));Debug.locals.put("CodSucEntidad", _codsucentidad);Debug.locals.put("CodSucEntidad", _codsucentidad);
 BA.debugLineNum = 139;BA.debugLine="Dim Nombre_Entidad As String = Row_Entidad.Get(\"N";
Debug.ShouldStop(1024);
_nombre_entidad = BA.ObjectToString(__ref.getField(false,"_row_entidad" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOEN")))));Debug.locals.put("Nombre_Entidad", _nombre_entidad);Debug.locals.put("Nombre_Entidad", _nombre_entidad);
 BA.debugLineNum = 141;BA.debugLine="Fila_Encabezado.Put(\"CodEntidad\".ToLowerCase,CodE";
Debug.ShouldStop(4096);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidad").runMethod(true,"toLowerCase"))),(Object)((_codentidad)));
 BA.debugLineNum = 142;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidad\".ToLowerCase,C";
Debug.ShouldStop(8192);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidad").runMethod(true,"toLowerCase"))),(Object)((_codsucentidad)));
 BA.debugLineNum = 143;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad\".ToLowerCase,";
Debug.ShouldStop(16384);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad").runMethod(true,"toLowerCase"))),(Object)((_nombre_entidad)));
 BA.debugLineNum = 145;BA.debugLine="Fila_Encabezado.Put(\"ListaPrecios\".ToLowerCase,Li";
Debug.ShouldStop(65536);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase"))),(Object)((_listaprecios)));
 BA.debugLineNum = 146;BA.debugLine="Fila_Encabezado.Put(\"CodFuncionario\".ToLowerCase,";
Debug.ShouldStop(131072);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodFuncionario").runMethod(true,"toLowerCase"))),(Object)(parent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 147;BA.debugLine="Fila_Encabezado.Put(\"NomFuncionario\".ToLowerCase,";
Debug.ShouldStop(262144);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("NomFuncionario").runMethod(true,"toLowerCase"))),(Object)(parent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOFU"))))));
 BA.debugLineNum = 149;BA.debugLine="Fila_Encabezado.Put(\"Moneda_Doc\".ToLowerCase,Mone";
Debug.ShouldStop(1048576);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Moneda_Doc").runMethod(true,"toLowerCase"))),(Object)((_moneda_doc)));
 BA.debugLineNum = 150;BA.debugLine="Fila_Encabezado.Put(\"TipoMoneda\".ToLowerCase,Tipo";
Debug.ShouldStop(2097152);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoMoneda").runMethod(true,"toLowerCase"))),(Object)((_tipomoneda)));
 BA.debugLineNum = 151;BA.debugLine="Fila_Encabezado.Put(\"Valor_Dolar\".ToLowerCase,Val";
Debug.ShouldStop(4194304);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Valor_Dolar").runMethod(true,"toLowerCase"))),(Object)((_valor_dolar)));
 BA.debugLineNum = 152;BA.debugLine="Fila_Encabezado.Put(\"Tasadorig_Doc\".ToLowerCase,T";
Debug.ShouldStop(8388608);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Tasadorig_Doc").runMethod(true,"toLowerCase"))),(Object)((_tasadorig_doc)));
 BA.debugLineNum = 154;BA.debugLine="Fila_Encabezado.Put(\"DocEn_Neto_Bruto\".ToLowerCas";
Debug.ShouldStop(33554432);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("DocEn_Neto_Bruto").runMethod(true,"toLowerCase"))),(Object)((_docen_neto_bruto)));
 BA.debugLineNum = 156;BA.debugLine="Fila_Encabezado.Put(\"Centro_Costo\".ToLowerCase,Ce";
Debug.ShouldStop(134217728);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Centro_Costo").runMethod(true,"toLowerCase"))),(Object)((_centro_costo)));
 BA.debugLineNum = 158;BA.debugLine="Fila_Encabezado.Put(\"CodEntidadFisica\".ToLowerCas";
Debug.ShouldStop(536870912);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 159;BA.debugLine="Fila_Encabezado.Put(\"CodSucEntidadFisica\".ToLower";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodSucEntidadFisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 160;BA.debugLine="Fila_Encabezado.Put(\"Nombre_Entidad_Fisica\".ToLow";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Nombre_Entidad_Fisica").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 161;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Deuda_Ven\".ToLowerC";
Debug.ShouldStop(1);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fun_Auto_Deuda_Ven").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 162;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Stock_Ins\".ToLowerC";
Debug.ShouldStop(2);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fun_Auto_Stock_Ins").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 163;BA.debugLine="Fila_Encabezado.Put(\"Fun_Auto_Cupo_Exe\".ToLowerCa";
Debug.ShouldStop(4);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("Fun_Auto_Cupo_Exe").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 164;BA.debugLine="Fila_Encabezado.Put(\"SubTido\".ToLowerCase,\"\")";
Debug.ShouldStop(8);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("SubTido").runMethod(true,"toLowerCase"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 167;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezado_";
Debug.ShouldStop(64);
parent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_fila_idenc" /*RemoteObject*/ )));
 BA.debugLineNum = 169;BA.debugLine="Sb_Actualizar_Datos_De_La_Entidad(Row_Entidad,Fal";
Debug.ShouldStop(256);
__ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_actualizar_datos_de_la_entidad" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_row_entidad" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 171;BA.debugLine="If Idmaeedo <> 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 9:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_idmaeedo" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 173;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("ProgressDialogShow",__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando productos..."))));
 BA.debugLineNum = 175;BA.debugLine="Wait For(Sb_Traer_Encabezado) Complete (FEnc As";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_nuevo_documento"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_encabezado" /*RemoteObject*/ ));
this.state = 28;
return;
case 28:
//C
this.state = 12;
_fenc = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("FEnc", _fenc);
;
 BA.debugLineNum = 177;BA.debugLine="If FEnc.IsInitialized Then";
Debug.ShouldStop(65536);
if (true) break;

case 12:
//if
this.state = 15;
if (_fenc.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 179;BA.debugLine="Fila_Encabezado.Put(\"empresa\",FEnc.Get(\"EMPRESA";
Debug.ShouldStop(262144);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("empresa"))),(Object)(_fenc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA"))))));
 BA.debugLineNum = 180;BA.debugLine="Fila_Encabezado.Put(\"sucursal\",FEnc.Get(\"SUDO\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sucursal"))),(Object)(_fenc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUDO"))))));
 BA.debugLineNum = 181;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Encabezad";
Debug.ShouldStop(1048576);
parent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Encabezado_Doc")),(Object)(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_fila_idenc" /*RemoteObject*/ )));
 BA.debugLineNum = 183;BA.debugLine="Variables.Gl_Empresa = FEnc.Get(\"EMPRESA\")";
Debug.ShouldStop(4194304);
parent._variables._gl_empresa /*RemoteObject*/  = BA.ObjectToString(_fenc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA")))));
 BA.debugLineNum = 184;BA.debugLine="Variables.Gl_Sucursal = FEnc.Get(\"SUDO\")";
Debug.ShouldStop(8388608);
parent._variables._gl_sucursal /*RemoteObject*/  = BA.ObjectToString(_fenc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUDO")))));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 188;BA.debugLine="Wait For(Sb_Incorporar_Productos) Complete (Resu";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_nuevo_documento"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_incorporar_productos" /*RemoteObject*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 190;BA.debugLine="Wait For(Sb_Traer_Observaciones) Complete (Flobs";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_nuevo_documento"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_observaciones" /*RemoteObject*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 16;
_flobs = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Flobs", _flobs);
;
 BA.debugLineNum = 192;BA.debugLine="If Flobs.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 16:
//if
this.state = 19;
if (_flobs.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 193;BA.debugLine="Fila_Observaciones.Put(\"observaciones\",Flobs.Ge";
Debug.ShouldStop(1);
__ref.getField(false,"_fila_observaciones" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("observaciones"))),(Object)(_flobs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OBDO"))))));
 BA.debugLineNum = 194;BA.debugLine="Fila_Observaciones.Put(\"orden_compra\",Flobs.Get";
Debug.ShouldStop(2);
__ref.getField(false,"_fila_observaciones" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("orden_compra"))),(Object)(_flobs.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OCDO"))))));
 BA.debugLineNum = 195;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Observaci";
Debug.ShouldStop(4);
parent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Observaciones_Doc")),(Object)(__ref.getField(false,"_fila_observaciones" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_fila_idenc" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 199;BA.debugLine="If B4A_DespachoSimple Then";
Debug.ShouldStop(64);

case 19:
//if
this.state = 26;
if (_b4a_despachosimple.<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 201;BA.debugLine="Wait For(Sb_Traer_Despacho_Simple) Complete (Fl";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_nuevo_documento"), __ref.runClassMethod (BaKapp.Movil.Tag.crear_documento.class, "_sb_traer_despacho_simple" /*RemoteObject*/ ));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_fldesp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Fldesp", _fldesp);
;
 BA.debugLineNum = 203;BA.debugLine="If Fldesp.IsInitialized Then";
Debug.ShouldStop(1024);
if (true) break;

case 22:
//if
this.state = 25;
if (_fldesp.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 205;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoDespacho\".ToLowerC";
Debug.ShouldStop(4096);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodTipoDespacho").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodTipoDespacho"))))));
 BA.debugLineNum = 206;BA.debugLine="Fila_DespaFacil.Put(\"TipoDespacho\".ToLowerCase";
Debug.ShouldStop(8192);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoDespacho").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoDespacho"))))));
 BA.debugLineNum = 208;BA.debugLine="Fila_DespaFacil.Put(\"CodTipoPagoDesp\".ToLowerC";
Debug.ShouldStop(32768);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodTipoPagoDesp").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodTipoPagoDesp"))))));
 BA.debugLineNum = 209;BA.debugLine="Fila_DespaFacil.Put(\"TipoPagoDesp\".ToLowerCase";
Debug.ShouldStop(65536);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TipoPagoDesp").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPagoDesp"))))));
 BA.debugLineNum = 211;BA.debugLine="Fila_DespaFacil.Put(\"CodDocDestino\".ToLowerCas";
Debug.ShouldStop(262144);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("CodDocDestino").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodDocDestino"))))));
 BA.debugLineNum = 212;BA.debugLine="Fila_DespaFacil.Put(\"DocDestino\".ToLowerCase,F";
Debug.ShouldStop(524288);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("DocDestino").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DocDestino"))))));
 BA.debugLineNum = 214;BA.debugLine="Fila_DespaFacil.Put(\"TransporteDesp\".ToLowerCa";
Debug.ShouldStop(2097152);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("TransporteDesp").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TransporteDesp"))))));
 BA.debugLineNum = 215;BA.debugLine="Fila_DespaFacil.Put(\"DireccionDesp\".ToLowerCas";
Debug.ShouldStop(4194304);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("DireccionDesp").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DireccionDesp"))))));
 BA.debugLineNum = 216;BA.debugLine="Fila_DespaFacil.Put(\"ObservacionesDesp\".ToLowe";
Debug.ShouldStop(8388608);
__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((RemoteObject.createImmutable("ObservacionesDesp").runMethod(true,"toLowerCase"))),(Object)(_fldesp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObservacionesDesp"))))));
 BA.debugLineNum = 218;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"DespaFac";
Debug.ShouldStop(33554432);
parent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("DespaFacil_Doc")),(Object)(__ref.getField(false,"_fila_despafacil" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_fila_idenc" /*RemoteObject*/ )));
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
 BA.debugLineNum = 224;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 227;BA.debugLine="Return Id_DocEnc";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(__ref.getField(true,"_id_docenc" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_procesar_datos(RemoteObject __ref,RemoteObject _cabeza,RemoteObject _fila) throws Exception{
try {
		Debug.PushSubsStack("Sb_Procesar_Datos (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("sb_procesar_datos")) { return __ref.runUserSub(false, "crear_documento","sb_procesar_datos", __ref, _cabeza, _fila);}
RemoteObject _untrans = RemoteObject.createImmutable(0);
RemoteObject _poriva = RemoteObject.createImmutable(0);
RemoteObject _porila = RemoteObject.createImmutable(0);
RemoteObject _rtu = RemoteObject.createImmutable(0);
RemoteObject _impuestos = RemoteObject.createImmutable(0);
RemoteObject _totaliva = RemoteObject.createImmutable(0);
RemoteObject _totalila = RemoteObject.createImmutable(0);
RemoteObject _totalneto = RemoteObject.createImmutable(0);
RemoteObject _totalbruto = RemoteObject.createImmutable(0);
RemoteObject _totaldsctoneto = RemoteObject.createImmutable(0);
RemoteObject _totaldsctobruto = RemoteObject.createImmutable(0);
RemoteObject _precio = RemoteObject.createImmutable(0);
RemoteObject _precioneto = RemoteObject.createImmutable(0);
RemoteObject _preciobruto = RemoteObject.createImmutable(0);
RemoteObject _precionetorealud1 = RemoteObject.createImmutable(0);
RemoteObject _precionetorealud2 = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _decimal = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _cantud1 = RemoteObject.createImmutable(0);
RemoteObject _cantud2 = RemoteObject.createImmutable(0);
RemoteObject _divisible = RemoteObject.createImmutable("");
RemoteObject _divisible2 = RemoteObject.createImmutable("");
RemoteObject _descuentovalor = RemoteObject.createImmutable(0);
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _descuentoporc_original = RemoteObject.createImmutable(0);
RemoteObject _descmaximo = RemoteObject.createImmutable(0);
RemoteObject _tict = RemoteObject.createImmutable("");
RemoteObject _prct = RemoteObject.createImmutable("");
RemoteObject _tipr = RemoteObject.createImmutable("");
RemoteObject _codlista = RemoteObject.createImmutable("");
RemoteObject _numdsctos = RemoteObject.createImmutable(0);
RemoteObject _no_aplica_redondeo = RemoteObject.createImmutable(false);
RemoteObject _aplicar_redondeo = RemoteObject.createImmutable(false);
RemoteObject _totalneto_calculo = RemoteObject.createImmutable(0);
RemoteObject _totalbruto_calculo = RemoteObject.createImmutable(0);
RemoteObject _descontar = RemoteObject.createImmutable(false);
RemoteObject _total_concepto = RemoteObject.createImmutable(0);
RemoteObject _descuentovalor_anterior = RemoteObject.createImmutable(0);
RemoteObject _recargo = RemoteObject.createImmutable(0);
RemoteObject _precio_calculado = RemoteObject.createImmutable(0);
RemoteObject _moneda_enc = RemoteObject.createImmutable("");
RemoteObject _tipo_moneda_enc = RemoteObject.createImmutable("");
RemoteObject _tipo_cambio_ent = RemoteObject.createImmutable(0);
RemoteObject _moneda_det = RemoteObject.createImmutable("");
RemoteObject _tipo_moneda_det = RemoteObject.createImmutable("");
RemoteObject _tipo_cambio_det = RemoteObject.createImmutable(0);
RemoteObject _decimales = RemoteObject.createImmutable("");
RemoteObject _divi = RemoteObject.createImmutable("");
RemoteObject _preciocalculado = RemoteObject.createImmutable(0);
RemoteObject _valor_dscto = RemoteObject.createImmutable(0);
RemoteObject _codfunautoriza_dscto = RemoteObject.createImmutable("");
RemoteObject _codpermiso_dscto = RemoteObject.createImmutable("");
RemoteObject _preciolista = RemoteObject.createImmutable(0);
RemoteObject _precio_cn_dscto = RemoteObject.createImmutable(0);
RemoteObject _precio_netolista = RemoteObject.createImmutable(0);
RemoteObject _valor_dscto_real = RemoteObject.createImmutable(0);
RemoteObject _dscto_real = RemoteObject.createImmutable(0);
RemoteObject _codfunautoriza = RemoteObject.createImmutable("");
RemoteObject _tiene_dscto = RemoteObject.createImmutable(false);
RemoteObject _valvtadescmax = RemoteObject.createImmutable(false);
RemoteObject _vizado = RemoteObject.createImmutable(false);
RemoteObject _mensaje = RemoteObject.createImmutable("");
RemoteObject _msicono = RemoteObject.declareNull("Object");
RemoteObject _msj_dsctoreal = RemoteObject.createImmutable("");
RemoteObject _multiplo = RemoteObject.createImmutable("");
RemoteObject _tipovalor = RemoteObject.createImmutable("");
RemoteObject _precionetoud = RemoteObject.createImmutable(0);
RemoteObject _preciobrutoud = RemoteObject.createImmutable(0);
RemoteObject _precionetoudlista = RemoteObject.createImmutable(0);
RemoteObject _preciobrutoudlista = RemoteObject.createImmutable(0);
Debug.locals.put("Cabeza", _cabeza);
Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 428;BA.debugLine="Sub Sb_Procesar_Datos(Cabeza As String, Fila As Ma";
Debug.ShouldStop(2048);
 BA.debugLineNum = 430;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
Debug.ShouldStop(8192);
_untrans = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("untrans")))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 431;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
Debug.ShouldStop(16384);
_poriva = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("poriva")))));Debug.locals.put("PorIva", _poriva);Debug.locals.put("PorIva", _poriva);
 BA.debugLineNum = 432;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
Debug.ShouldStop(32768);
_porila = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("porila")))));Debug.locals.put("PorIla", _porila);Debug.locals.put("PorIla", _porila);
 BA.debugLineNum = 433;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
Debug.ShouldStop(65536);
_rtu = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rtu")))));Debug.locals.put("Rtu", _rtu);Debug.locals.put("Rtu", _rtu);
 BA.debugLineNum = 435;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
Debug.ShouldStop(262144);
_impuestos = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_poriva,_porila}, "+",1, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))}, "+",1, 0);Debug.locals.put("Impuestos", _impuestos);Debug.locals.put("Impuestos", _impuestos);
 BA.debugLineNum = 437;BA.debugLine="Dim TotalIva As Double";
Debug.ShouldStop(1048576);
_totaliva = RemoteObject.createImmutable(0);Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 438;BA.debugLine="Dim TotalIla As Double";
Debug.ShouldStop(2097152);
_totalila = RemoteObject.createImmutable(0);Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 439;BA.debugLine="Dim TotalNeto As Double";
Debug.ShouldStop(4194304);
_totalneto = RemoteObject.createImmutable(0);Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 440;BA.debugLine="Dim TotalBruto As Double";
Debug.ShouldStop(8388608);
_totalbruto = RemoteObject.createImmutable(0);Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 442;BA.debugLine="Dim TotalDsctoNeto As Double";
Debug.ShouldStop(33554432);
_totaldsctoneto = RemoteObject.createImmutable(0);Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 443;BA.debugLine="Dim TotalDsctoBruto As Double";
Debug.ShouldStop(67108864);
_totaldsctobruto = RemoteObject.createImmutable(0);Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 445;BA.debugLine="Dim Precio As Double = Fila.Get(\"precio\")";
Debug.ShouldStop(268435456);
_precio = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio")))));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 447;BA.debugLine="Dim PrecioNeto As Double";
Debug.ShouldStop(1073741824);
_precioneto = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 448;BA.debugLine="Dim PrecioBruto As Double";
Debug.ShouldStop(-2147483648);
_preciobruto = RemoteObject.createImmutable(0);Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 450;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
Debug.ShouldStop(2);
_precionetorealud1 = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 451;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
Debug.ShouldStop(4);
_precionetorealud2 = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 453;BA.debugLine="Dim Total As Double";
Debug.ShouldStop(16);
_total = RemoteObject.createImmutable(0);Debug.locals.put("Total", _total);
 BA.debugLineNum = 455;BA.debugLine="Dim Decimal = 2";
Debug.ShouldStop(64);
_decimal = BA.NumberToString(2);Debug.locals.put("Decimal", _decimal);Debug.locals.put("Decimal", _decimal);
 BA.debugLineNum = 457;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
Debug.ShouldStop(256);
_cantidad = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cantidad")))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 458;BA.debugLine="Dim CantUd1 As Double";
Debug.ShouldStop(512);
_cantud1 = RemoteObject.createImmutable(0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 459;BA.debugLine="Dim CantUd2 As Double";
Debug.ShouldStop(1024);
_cantud2 = RemoteObject.createImmutable(0);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 461;BA.debugLine="Dim Divisible As String '= RowProducto.Get(\"DIVIS";
Debug.ShouldStop(4096);
_divisible = RemoteObject.createImmutable("");Debug.locals.put("Divisible", _divisible);
 BA.debugLineNum = 462;BA.debugLine="Dim Divisible2 As String '= RowProducto.Get(\"DIVI";
Debug.ShouldStop(8192);
_divisible2 = RemoteObject.createImmutable("");Debug.locals.put("Divisible2", _divisible2);
 BA.debugLineNum = 464;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
Debug.ShouldStop(32768);
_descuentovalor = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentovalor")))));Debug.locals.put("DescuentoValor", _descuentovalor);Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 465;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
Debug.ShouldStop(65536);
_descuentoporc = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));Debug.locals.put("DescuentoPorc", _descuentoporc);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 466;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
Debug.ShouldStop(131072);
_descuentoporc_original = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));Debug.locals.put("DescuentoPorc_Original", _descuentoporc_original);Debug.locals.put("DescuentoPorc_Original", _descuentoporc_original);
 BA.debugLineNum = 467;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
Debug.ShouldStop(262144);
_descmaximo = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descmaximo")))));Debug.locals.put("DescMaximo", _descmaximo);Debug.locals.put("DescMaximo", _descmaximo);
 BA.debugLineNum = 469;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
Debug.ShouldStop(1048576);
_tict = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tict")))));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 470;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
Debug.ShouldStop(2097152);
_prct = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prct")))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 471;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
Debug.ShouldStop(4194304);
_tipr = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipr")))));Debug.locals.put("Tipr", _tipr);Debug.locals.put("Tipr", _tipr);
 BA.debugLineNum = 473;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
Debug.ShouldStop(16777216);
_codlista = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codlista")))));Debug.locals.put("CodLista", _codlista);Debug.locals.put("CodLista", _codlista);
 BA.debugLineNum = 475;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
Debug.ShouldStop(67108864);
_numdsctos = RemoteObject.createImmutable(0);Debug.locals.put("NumDsctos", _numdsctos);
 BA.debugLineNum = 477;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
Debug.ShouldStop(268435456);
_no_aplica_redondeo = RemoteObject.createImmutable(false);Debug.locals.put("No_Aplica_Redondeo", _no_aplica_redondeo);
 BA.debugLineNum = 478;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
Debug.ShouldStop(536870912);
_aplicar_redondeo = RemoteObject.createImmutable(false);Debug.locals.put("Aplicar_Redondeo", _aplicar_redondeo);
 BA.debugLineNum = 480;BA.debugLine="If No_Aplica_Redondeo Then";
Debug.ShouldStop(-2147483648);
if (_no_aplica_redondeo.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 481;BA.debugLine="Aplicar_Redondeo = False";
Debug.ShouldStop(1);
_aplicar_redondeo = crear_documento.__c.getField(true,"False");Debug.locals.put("Aplicar_Redondeo", _aplicar_redondeo);
 };
 BA.debugLineNum = 484;BA.debugLine="Dim TotalNeto_Calculo As Double";
Debug.ShouldStop(8);
_totalneto_calculo = RemoteObject.createImmutable(0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 485;BA.debugLine="Dim TotalBruto_Calculo As Double";
Debug.ShouldStop(16);
_totalbruto_calculo = RemoteObject.createImmutable(0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 487;BA.debugLine="Dim Descontar As Boolean";
Debug.ShouldStop(64);
_descontar = RemoteObject.createImmutable(false);Debug.locals.put("Descontar", _descontar);
 BA.debugLineNum = 488;BA.debugLine="Dim Total_Concepto As Double";
Debug.ShouldStop(128);
_total_concepto = RemoteObject.createImmutable(0);Debug.locals.put("Total_Concepto", _total_concepto);
 BA.debugLineNum = 494;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
Debug.ShouldStop(8192);
_descuentovalor_anterior = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentovalor_anterior")))));Debug.locals.put("DescuentoValor_Anterior", _descuentovalor_anterior);Debug.locals.put("DescuentoValor_Anterior", _descuentovalor_anterior);
 BA.debugLineNum = 495;BA.debugLine="Dim Recargo As Double";
Debug.ShouldStop(16384);
_recargo = RemoteObject.createImmutable(0);Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 497;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cantidad,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_tipr,BA.ObjectToString(""))) { 
 };
 BA.debugLineNum = 504;BA.debugLine="Dim Precio_Calculado As Double";
Debug.ShouldStop(8388608);
_precio_calculado = RemoteObject.createImmutable(0);Debug.locals.put("Precio_Calculado", _precio_calculado);
 BA.debugLineNum = 506;BA.debugLine="Dim Moneda_Enc As String = Fila_Encabezado.Get(\"m";
Debug.ShouldStop(33554432);
_moneda_enc = BA.ObjectToString(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moneda_doc")))));Debug.locals.put("Moneda_Enc", _moneda_enc);Debug.locals.put("Moneda_Enc", _moneda_enc);
 BA.debugLineNum = 507;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Encabezado.G";
Debug.ShouldStop(67108864);
_tipo_moneda_enc = BA.ObjectToString(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipomoneda")))));Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);
 BA.debugLineNum = 508;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Encabezado.G";
Debug.ShouldStop(134217728);
_tipo_cambio_ent = BA.numberCast(double.class, __ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tasadorig_doc")))));Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);
 BA.debugLineNum = 510;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
Debug.ShouldStop(536870912);
_moneda_det = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moneda")))));Debug.locals.put("Moneda_Det", _moneda_det);Debug.locals.put("Moneda_Det", _moneda_det);
 BA.debugLineNum = 511;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
Debug.ShouldStop(1073741824);
_tipo_moneda_det = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo_moneda")))));Debug.locals.put("Tipo_Moneda_Det", _tipo_moneda_det);Debug.locals.put("Tipo_Moneda_Det", _tipo_moneda_det);
 BA.debugLineNum = 512;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
Debug.ShouldStop(-2147483648);
_tipo_cambio_det = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo_cambio")))));Debug.locals.put("Tipo_Cambio_Det", _tipo_cambio_det);Debug.locals.put("Tipo_Cambio_Det", _tipo_cambio_det);
 BA.debugLineNum = 514;BA.debugLine="Dim Decimales = 2";
Debug.ShouldStop(2);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);Debug.locals.put("Decimales", _decimales);
 BA.debugLineNum = 516;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_moneda_det.runMethod(true,"trim"),_moneda_enc.runMethod(true,"trim"))) { 
 BA.debugLineNum = 517;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 518;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
Debug.ShouldStop(32);
_precio_calculado = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_tipo_cambio_ent}, "*",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Precio_Calculado", _precio_calculado);
 }else {
 BA.debugLineNum = 520;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
Debug.ShouldStop(128);
_precio_calculado = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_tipo_cambio_ent}, "/",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Precio_Calculado", _precio_calculado);
 BA.debugLineNum = 521;BA.debugLine="Decimales = 2";
Debug.ShouldStop(256);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);
 };
 }else {
 BA.debugLineNum = 524;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 525;BA.debugLine="Decimales = 2";
Debug.ShouldStop(4096);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);
 };
 BA.debugLineNum = 527;BA.debugLine="Precio_Calculado = Precio";
Debug.ShouldStop(16384);
_precio_calculado = _precio;Debug.locals.put("Precio_Calculado", _precio_calculado);
 };
 BA.debugLineNum = 532;BA.debugLine="Dim Divi As String";
Debug.ShouldStop(524288);
_divi = RemoteObject.createImmutable("");Debug.locals.put("Divi", _divi);
 BA.debugLineNum = 534;BA.debugLine="If UnTrans = 1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 535;BA.debugLine="Divi = Divisible";
Debug.ShouldStop(4194304);
_divi = _divisible;Debug.locals.put("Divi", _divi);
 };
 BA.debugLineNum = 538;BA.debugLine="If UnTrans = 2 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 539;BA.debugLine="Divi = Divisible2";
Debug.ShouldStop(67108864);
_divi = _divisible2;Debug.locals.put("Divi", _divi);
 };
 BA.debugLineNum = 542;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";
Debug.ShouldStop(536870912);
if (crear_documento.__c.runMethod(true,"Not",(Object)(crear_documento._funciones.runMethod(true,"_fx_solo_enteros" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_cantidad),(Object)(_divi)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 544;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
Debug.ShouldStop(-2147483648);
crear_documento.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("El producto solo permite cantidades enteras")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((crear_documento.__c.getField(false,"Null"))),__ref.runMethod(false,"getActivityBA"));
 BA.debugLineNum = 545;BA.debugLine="Cantidad = 0";
Debug.ShouldStop(1);
_cantidad = BA.numberCast(double.class, 0);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 550;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 554;BA.debugLine="If UnTrans = 1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 555;BA.debugLine="If Rtu = 1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_rtu,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 556;BA.debugLine="CantUd1 = Cantidad";
Debug.ShouldStop(2048);
_cantud1 = _cantidad;Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 557;BA.debugLine="CantUd2 = Cantidad * Rtu";
Debug.ShouldStop(4096);
_cantud2 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "*",0, 0);Debug.locals.put("CantUd2", _cantud2);
 }else {
 BA.debugLineNum = 559;BA.debugLine="CantUd1 = Cantidad";
Debug.ShouldStop(16384);
_cantud1 = _cantidad;Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 560;BA.debugLine="CantUd2 = Cantidad / Rtu";
Debug.ShouldStop(32768);
_cantud2 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "/",0, 0);Debug.locals.put("CantUd2", _cantud2);
 };
 };
 BA.debugLineNum = 564;BA.debugLine="If UnTrans = 2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 565;BA.debugLine="If Rtu > 1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_rtu,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 566;BA.debugLine="CantUd2 = Cantidad";
Debug.ShouldStop(2097152);
_cantud2 = _cantidad;Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 567;BA.debugLine="CantUd1 = Cantidad * Rtu";
Debug.ShouldStop(4194304);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 }else {
 BA.debugLineNum = 569;BA.debugLine="CantUd2 = Cantidad";
Debug.ShouldStop(16777216);
_cantud2 = _cantidad;Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 570;BA.debugLine="CantUd1 = Cantidad / Rtu";
Debug.ShouldStop(33554432);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "/",0, 0);Debug.locals.put("CantUd1", _cantud1);
 };
 };
 BA.debugLineNum = 574;BA.debugLine="If Prct = 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(1))) { 
 BA.debugLineNum = 584;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
Debug.ShouldStop(128);
_totalneto_calculo = __ref.getField(true,"_totalnetodoc" /*RemoteObject*/ );Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 585;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
Debug.ShouldStop(256);
_totalbruto_calculo = __ref.getField(true,"_totalbrutodoc" /*RemoteObject*/ );Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 587;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
 BA.debugLineNum = 589;BA.debugLine="Descontar = True";
Debug.ShouldStop(4096);
_descontar = crear_documento.__c.getField(true,"True");Debug.locals.put("Descontar", _descontar);
 BA.debugLineNum = 590;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(8192);
_cantidad = BA.numberCast(double.class, 1);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 590;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(8192);
_cantud1 = BA.numberCast(double.class, 1);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 590;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(8192);
_cantud2 = BA.numberCast(double.class, 1);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 591;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
Debug.ShouldStop(16384);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_descuentovalor_anterior}, "+",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 593;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc"))) { 
 BA.debugLineNum = 595;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 596;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(524288);
_descuentovalor = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 598;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(2097152);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 600;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(8388608);
_descuentovalor = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 602;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(33554432);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }else 
{ BA.debugLineNum = 605;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoValor"))) { 
 BA.debugLineNum = 607;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 609;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(1);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 612;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(8);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }}
;
 }else 
{ BA.debugLineNum = 617;BA.debugLine="Else If Tict = \"R\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 619;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(1024);
_total_concepto = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));Debug.locals.put("Total_Concepto", _total_concepto);
 BA.debugLineNum = 620;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
Debug.ShouldStop(2048);
_recargo = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("recargovalor")))));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 622;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 623;BA.debugLine="TotalNeto = Total_Concepto";
Debug.ShouldStop(16384);
_totalneto = _total_concepto;Debug.locals.put("TotalNeto", _totalneto);
 }else {
 BA.debugLineNum = 625;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
Debug.ShouldStop(65536);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_total_concepto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 626;BA.debugLine="TotalBruto = Total_Concepto";
Debug.ShouldStop(131072);
_totalbruto = _total_concepto;Debug.locals.put("TotalBruto", _totalbruto);
 };
 BA.debugLineNum = 629;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc"))) { 
 BA.debugLineNum = 631;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
Debug.ShouldStop(4194304);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 632;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
Debug.ShouldStop(8388608);
_totalbruto_calculo = RemoteObject.solve(new RemoteObject[] {_totalbruto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 634;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
Debug.ShouldStop(33554432);
_descuentoporc = RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 636;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 638;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
Debug.ShouldStop(536870912);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_descuentoporc}, "+",1, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 639;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
Debug.ShouldStop(1073741824);
_recargo = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_totalneto_calculo}, "-",1, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 641;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
Debug.ShouldStop(1);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_recargo,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 642;BA.debugLine="TotalNeto = Recargo";
Debug.ShouldStop(2);
_totalneto = _recargo;Debug.locals.put("TotalNeto", _totalneto);
 }else {
 BA.debugLineNum = 646;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
Debug.ShouldStop(32);
_recargo = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 648;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
Debug.ShouldStop(128);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_recargo,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }else 
{ BA.debugLineNum = 652;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("ValNetoLinea"))) { 
 BA.debugLineNum = 654;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
Debug.ShouldStop(8192);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 655;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
Debug.ShouldStop(16384);
_totalbruto_calculo = RemoteObject.solve(new RemoteObject[] {_totalbruto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 657;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 659;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
Debug.ShouldStop(262144);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_total_concepto,(_totalneto_calculo)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 662;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
Debug.ShouldStop(2097152);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,(_totalbruto_calculo)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 BA.debugLineNum = 665;BA.debugLine="Recargo = Total_Concepto";
Debug.ShouldStop(16777216);
_recargo = _total_concepto;Debug.locals.put("Recargo", _recargo);
 }}
;
 BA.debugLineNum = 669;BA.debugLine="DescuentoValor = 0";
Debug.ShouldStop(268435456);
_descuentovalor = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoValor", _descuentovalor);
 }}
;
 }else {
 BA.debugLineNum = 685;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 686;BA.debugLine="PrecioNeto = Precio_Calculado";
Debug.ShouldStop(8192);
_precioneto = _precio_calculado;Debug.locals.put("PrecioNeto", _precioneto);
 }else {
 BA.debugLineNum = 688;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
Debug.ShouldStop(32768);
_precioneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio_calculado,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 689;BA.debugLine="PrecioBruto = Precio_Calculado";
Debug.ShouldStop(65536);
_preciobruto = _precio_calculado;Debug.locals.put("PrecioBruto", _preciobruto);
 };
 BA.debugLineNum = 692;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
Debug.ShouldStop(524288);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precioneto,_cantidad}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 693;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), Dec";
Debug.ShouldStop(1048576);
_totalbruto = crear_documento.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 695;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("Cantidad")) && RemoteObject.solveBoolean("=",_tict,BA.ObjectToString(""))) { 
 BA.debugLineNum = 697;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(16777216);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 698;BA.debugLine="DescuentoValor = 0";
Debug.ShouldStop(33554432);
_descuentovalor = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoValor", _descuentovalor);
 };
 BA.debugLineNum = 710;BA.debugLine="TotalNeto_Calculo = TotalNeto";
Debug.ShouldStop(32);
_totalneto_calculo = _totalneto;Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 711;BA.debugLine="TotalBruto_Calculo = TotalBruto";
Debug.ShouldStop(64);
_totalbruto_calculo = _totalbruto;Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 715;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc")) || RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("Precio"))) { 
 BA.debugLineNum = 717;BA.debugLine="If Precio > 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_precio,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 719;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(16384);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 721;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(65536);
_descuentovalor = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 723;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(262144);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 727;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(4194304);
_descuentovalor = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 729;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(16777216);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 };
 }else 
{ BA.debugLineNum = 735;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoValor"))) { 
 BA.debugLineNum = 737;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 739;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
Debug.ShouldStop(4);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 }else {
 BA.debugLineNum = 742;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
Debug.ShouldStop(32);
_descuentoporc = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 };
 }}
;
 };
 BA.debugLineNum = 750;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
Debug.ShouldStop(8192);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoPorc"))),(Object)((_descuentoporc)));
 BA.debugLineNum = 751;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
Debug.ShouldStop(16384);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoValor"))),(Object)((_descuentovalor)));
 BA.debugLineNum = 752;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
Debug.ShouldStop(32768);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoValor_Anterior"))),(Object)((_descuentovalor_anterior)));
 BA.debugLineNum = 754;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
Debug.ShouldStop(131072);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DsctoRealPorc"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 755;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
Debug.ShouldStop(262144);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DsctoRealValor"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 765;BA.debugLine="Dim PrecioCalculado As Double";
Debug.ShouldStop(268435456);
_preciocalculado = RemoteObject.createImmutable(0);Debug.locals.put("PrecioCalculado", _preciocalculado);
 BA.debugLineNum = 767;BA.debugLine="Dim Valor_Dscto As Double";
Debug.ShouldStop(1073741824);
_valor_dscto = RemoteObject.createImmutable(0);Debug.locals.put("Valor_Dscto", _valor_dscto);
 BA.debugLineNum = 768;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
Debug.ShouldStop(-2147483648);
_codfunautoriza_dscto = BA.ObjectToString("xyz");Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);
 BA.debugLineNum = 769;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
Debug.ShouldStop(1);
_codpermiso_dscto = BA.ObjectToString("Bkp00014");Debug.locals.put("CodPermiso_Dscto", _codpermiso_dscto);Debug.locals.put("CodPermiso_Dscto", _codpermiso_dscto);
 BA.debugLineNum = 771;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(0))) { 
 BA.debugLineNum = 773;BA.debugLine="Dim PrecioLista As Double";
Debug.ShouldStop(16);
_preciolista = RemoteObject.createImmutable(0);Debug.locals.put("PrecioLista", _preciolista);
 BA.debugLineNum = 775;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 776;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
Debug.ShouldStop(128);
_preciolista = crear_documento.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precionetoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioLista", _preciolista);
 }else {
 BA.debugLineNum = 778;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
Debug.ShouldStop(512);
_preciolista = crear_documento.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("preciobrutoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioLista", _preciolista);
 };
 BA.debugLineNum = 784;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
Debug.ShouldStop(32768);
_precio_cn_dscto = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio_calculado,_cantidad}, "*",0, 0)),_descuentovalor}, "-",1, 0);Debug.locals.put("Precio_Cn_Dscto", _precio_cn_dscto);Debug.locals.put("Precio_Cn_Dscto", _precio_cn_dscto);
 BA.debugLineNum = 785;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
Debug.ShouldStop(65536);
_precio_netolista = RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.concat(RemoteObject.createImmutable("preciolistaud"),_untrans))))),_cantidad}, "*",0, 0);Debug.locals.put("Precio_NetoLista", _precio_netolista);Debug.locals.put("Precio_NetoLista", _precio_netolista);
 BA.debugLineNum = 786;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
Debug.ShouldStop(131072);
_valor_dscto_real = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio_netolista,_precio_cn_dscto}, "-",1, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Valor_Dscto_Real", _valor_dscto_real);Debug.locals.put("Valor_Dscto_Real", _valor_dscto_real);
 BA.debugLineNum = 788;BA.debugLine="Dim Dscto_Real As Double = 0";
Debug.ShouldStop(524288);
_dscto_real = BA.numberCast(double.class, 0);Debug.locals.put("Dscto_Real", _dscto_real);Debug.locals.put("Dscto_Real", _dscto_real);
 BA.debugLineNum = 790;BA.debugLine="If Valor_Dscto_Real > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_valor_dscto_real,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 791;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
Debug.ShouldStop(4194304);
_dscto_real = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_valor_dscto_real,_precio_netolista}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Dscto_Real", _dscto_real);
 };
 BA.debugLineNum = 798;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
Debug.ShouldStop(536870912);
_codfunautoriza = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codfunautoriza")))));Debug.locals.put("CodFunAutoriza", _codfunautoriza);Debug.locals.put("CodFunAutoriza", _codfunautoriza);
 BA.debugLineNum = 800;BA.debugLine="Dim Tiene_Dscto As Boolean";
Debug.ShouldStop(-2147483648);
_tiene_dscto = RemoteObject.createImmutable(false);Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 801;BA.debugLine="Dim ValVtaDescMax As Boolean";
Debug.ShouldStop(1);
_valvtadescmax = RemoteObject.createImmutable(false);Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 BA.debugLineNum = 803;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_codfunautoriza,BA.ObjectToString("xyz"))) { 
_codfunautoriza = __ref.getField(true,"_funcionario" /*RemoteObject*/ );Debug.locals.put("CodFunAutoriza", _codfunautoriza);};
 BA.debugLineNum = 805;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_precio_cn_dscto,_precio_netolista)) { 
 BA.debugLineNum = 807;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
Debug.ShouldStop(64);
_vizado = RemoteObject.createImmutable(false);Debug.locals.put("Vizado", _vizado);
 BA.debugLineNum = 809;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_descmaximo,BA.numberCast(double.class, 0))) { 
_descmaximo = BA.numberCast(double.class, 0.5);Debug.locals.put("DescMaximo", _descmaximo);};
 BA.debugLineNum = 811;BA.debugLine="If Dscto_Real > DescMaximo Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_dscto_real,_descmaximo)) { 
 BA.debugLineNum = 813;BA.debugLine="Tiene_Dscto = True";
Debug.ShouldStop(4096);
_tiene_dscto = crear_documento.__c.getField(true,"True");Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 815;BA.debugLine="If Vizado Then";
Debug.ShouldStop(16384);
if (_vizado.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 816;BA.debugLine="ValVtaDescMax = True";
Debug.ShouldStop(32768);
_valvtadescmax = crear_documento.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 }else {
 BA.debugLineNum = 821;BA.debugLine="Dim Mensaje = \"\"";
Debug.ShouldStop(1048576);
_mensaje = BA.ObjectToString("");Debug.locals.put("Mensaje", _mensaje);Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 822;BA.debugLine="Dim MsIcono As Object";
Debug.ShouldStop(2097152);
_msicono = RemoteObject.createNew ("Object");Debug.locals.put("MsIcono", _msicono);
 BA.debugLineNum = 830;BA.debugLine="Dim Msj_DsctoReal = \"\"";
Debug.ShouldStop(536870912);
_msj_dsctoreal = BA.ObjectToString("");Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);
 BA.debugLineNum = 832;BA.debugLine="If Precio <> PrecioLista Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_precio,_preciolista)) { 
 BA.debugLineNum = 833;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
Debug.ShouldStop(1);
_msj_dsctoreal = RemoteObject.concat(crear_documento.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Descuento Real: "),_dscto_real,RemoteObject.createImmutable("%"));Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);
 };
 BA.debugLineNum = 836;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_dscto_real,_valor_dscto)) { 
 BA.debugLineNum = 838;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
Debug.ShouldStop(32);
_mensaje = RemoteObject.concat(crear_documento.__c.getField(true,"CRLF"),crear_documento.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!"));Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 841;BA.debugLine="ValVtaDescMax =False";
Debug.ShouldStop(256);
_valvtadescmax = crear_documento.__c.getField(true,"False");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 }else {
 BA.debugLineNum = 844;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
Debug.ShouldStop(2048);
_codfunautoriza_dscto = __ref.getField(true,"_funcionario" /*RemoteObject*/ );Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);
 BA.debugLineNum = 846;BA.debugLine="ValVtaDescMax =True";
Debug.ShouldStop(8192);
_valvtadescmax = crear_documento.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 };
 };
 };
 };
 }else {
 BA.debugLineNum = 868;BA.debugLine="ValVtaDescMax = True";
Debug.ShouldStop(8);
_valvtadescmax = crear_documento.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 };
 BA.debugLineNum = 874;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
Debug.ShouldStop(512);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 876;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
Debug.ShouldStop(2048);
_totalneto = RemoteObject.solve(new RemoteObject[] {_totalneto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalNeto", _totalneto);
 }else {
 BA.debugLineNum = 880;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
Debug.ShouldStop(32768);
_totalbruto = RemoteObject.solve(new RemoteObject[] {_totalbruto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalBruto", _totalbruto);
 };
 BA.debugLineNum = 886;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
Debug.ShouldStop(2097152);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 888;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
Debug.ShouldStop(8388608);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(_totalneto),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 889;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
Debug.ShouldStop(16777216);
_totaliva = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 890;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
Debug.ShouldStop(33554432);
_totalila = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 891;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
Debug.ShouldStop(67108864);
_totalbruto = crear_documento.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 892;BA.debugLine="TotalDsctoNeto = DescuentoValor";
Debug.ShouldStop(134217728);
_totaldsctoneto = _descuentovalor;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 894;BA.debugLine="Total = TotalNeto";
Debug.ShouldStop(536870912);
_total = _totalneto;Debug.locals.put("Total", _total);
 BA.debugLineNum = 896;BA.debugLine="PrecioNeto = Precio";
Debug.ShouldStop(-2147483648);
_precioneto = _precio;Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 897;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, Decimal";
Debug.ShouldStop(1);
_preciobruto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_impuestos}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 899;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
 BA.debugLineNum = 900;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
Debug.ShouldStop(8);
_totaldsctobruto = crear_documento.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_descuentovalor,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 };
 BA.debugLineNum = 903;BA.debugLine="If Tict = \"R\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 905;BA.debugLine="TotalDsctoBruto = TotalBruto";
Debug.ShouldStop(256);
_totaldsctobruto = _totalbruto;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 906;BA.debugLine="TotalDsctoNeto = 0";
Debug.ShouldStop(512);
_totaldsctoneto = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 };
 }else {
 BA.debugLineNum = 912;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
Debug.ShouldStop(32768);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalbruto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 913;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
Debug.ShouldStop(65536);
_totaliva = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 914;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
Debug.ShouldStop(131072);
_totalila = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 915;BA.debugLine="TotalDsctoBruto = DescuentoValor";
Debug.ShouldStop(262144);
_totaldsctobruto = _descuentovalor;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 916;BA.debugLine="Total = TotalBruto";
Debug.ShouldStop(524288);
_total = _totalbruto;Debug.locals.put("Total", _total);
 BA.debugLineNum = 918;BA.debugLine="PrecioBruto = PrecioCalculado";
Debug.ShouldStop(2097152);
_preciobruto = _preciocalculado;Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 919;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
Debug.ShouldStop(4194304);
_precioneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 921;BA.debugLine="If Tict = \"R\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 923;BA.debugLine="TotalDsctoBruto = 0";
Debug.ShouldStop(67108864);
_totaldsctobruto = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 924;BA.debugLine="TotalDsctoNeto = TotalNeto";
Debug.ShouldStop(134217728);
_totaldsctoneto = _totalneto;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 };
 };
 BA.debugLineNum = 931;BA.debugLine="If Descontar Then";
Debug.ShouldStop(4);
if (_descontar.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 933;BA.debugLine="PrecioNetoRealUd1 = 0";
Debug.ShouldStop(16);
_precionetorealud1 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 934;BA.debugLine="PrecioNetoRealUd2 = 0";
Debug.ShouldStop(32);
_precionetorealud2 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 936;BA.debugLine="If Prct = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(0))) { 
 BA.debugLineNum = 938;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
Debug.ShouldStop(512);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 939;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
Debug.ShouldStop(1024);
_totalneto = RemoteObject.solve(new RemoteObject[] {_totalneto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 940;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
Debug.ShouldStop(2048);
_totaliva = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 941;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
Debug.ShouldStop(4096);
_totalila = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 942;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0";
Debug.ShouldStop(8192);
_totalbruto = crear_documento.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 943;BA.debugLine="TotalDsctoNeto = DescuentoValor";
Debug.ShouldStop(16384);
_totaldsctoneto = _descuentovalor;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 944;BA.debugLine="Total = TotalNeto";
Debug.ShouldStop(32768);
_total = _totalneto;Debug.locals.put("Total", _total);
 }else {
 BA.debugLineNum = 946;BA.debugLine="TotalBruto = DescuentoValor";
Debug.ShouldStop(131072);
_totalbruto = _descuentovalor;Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 947;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
Debug.ShouldStop(262144);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalbruto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 948;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
Debug.ShouldStop(524288);
_totaliva = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 949;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
Debug.ShouldStop(1048576);
_totalila = (crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 950;BA.debugLine="TotalDsctoBruto = DescuentoValor";
Debug.ShouldStop(2097152);
_totaldsctobruto = _descuentovalor;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 951;BA.debugLine="Total = TotalBruto";
Debug.ShouldStop(4194304);
_total = _totalbruto;Debug.locals.put("Total", _total);
 };
 BA.debugLineNum = 954;BA.debugLine="If TotalNeto > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_totalneto,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 956;BA.debugLine="TotalIla = TotalIla * -1";
Debug.ShouldStop(134217728);
_totalila = BA.numberCast(double.class, _totalila.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 957;BA.debugLine="TotalIva = TotalIva * -1";
Debug.ShouldStop(268435456);
_totaliva = BA.numberCast(double.class, _totaliva.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 958;BA.debugLine="TotalNeto = TotalNeto * -1";
Debug.ShouldStop(536870912);
_totalneto = BA.numberCast(double.class, _totalneto.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 959;BA.debugLine="TotalBruto = TotalBruto * -1";
Debug.ShouldStop(1073741824);
_totalbruto = BA.numberCast(double.class, _totalbruto.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 960;BA.debugLine="Total = Total * -1";
Debug.ShouldStop(-2147483648);
_total = BA.numberCast(double.class, _total.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("Total", _total);
 };
 };
 }else {
 BA.debugLineNum = 968;BA.debugLine="If Cantidad > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 970;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
Debug.ShouldStop(512);
_precionetorealud1 = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_cantud1}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 971;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
Debug.ShouldStop(1024);
_precionetorealud2 = crear_documento.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_cantud2}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 973;BA.debugLine="If ChkValores = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_chkvalores" /*RemoteObject*/ ),crear_documento.__c.getField(true,"False"))) { 
 BA.debugLineNum = 974;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
Debug.ShouldStop(8192);
_precioneto = _precionetorealud1;Debug.locals.put("PrecioNeto", _precioneto);
 };
 }else {
 BA.debugLineNum = 978;BA.debugLine="PrecioNetoRealUd1 = 0";
Debug.ShouldStop(131072);
_precionetorealud1 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 979;BA.debugLine="PrecioNetoRealUd2 = 0";
Debug.ShouldStop(262144);
_precionetorealud2 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 };
 };
 BA.debugLineNum = 984;BA.debugLine="If Prct = 1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(1))) { 
 BA.debugLineNum = 986;BA.debugLine="Dim Multiplo = 1";
Debug.ShouldStop(33554432);
_multiplo = BA.NumberToString(1);Debug.locals.put("Multiplo", _multiplo);Debug.locals.put("Multiplo", _multiplo);
 BA.debugLineNum = 988;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
 BA.debugLineNum = 989;BA.debugLine="Multiplo = -1";
Debug.ShouldStop(268435456);
_multiplo = BA.NumberToString(-(double) (0 + 1));Debug.locals.put("Multiplo", _multiplo);
 }else 
{ BA.debugLineNum = 990;BA.debugLine="Else If Tict = \"R\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
 BA.debugLineNum = 991;BA.debugLine="Multiplo = 1";
Debug.ShouldStop(1073741824);
_multiplo = BA.NumberToString(1);Debug.locals.put("Multiplo", _multiplo);
 }}
;
 BA.debugLineNum = 994;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(2);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 996;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
Debug.ShouldStop(8);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_totalneto,BA.numberCast(double.class, _multiplo)}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 997;BA.debugLine="CantUd2 = 0";
Debug.ShouldStop(16);
_cantud2 = BA.numberCast(double.class, 0);Debug.locals.put("CantUd2", _cantud2);
 }else {
 BA.debugLineNum = 1002;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
Debug.ShouldStop(512);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_totalbruto,BA.numberCast(double.class, _multiplo)}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 1003;BA.debugLine="CantUd2 = 0";
Debug.ShouldStop(1024);
_cantud2 = BA.numberCast(double.class, 0);Debug.locals.put("CantUd2", _cantud2);
 };
 };
 BA.debugLineNum = 1046;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
Debug.ShouldStop(2097152);
_totalila = crear_documento.__c.runMethod(true,"Round2",(Object)(_totalila),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 1047;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
Debug.ShouldStop(4194304);
_totaliva = crear_documento.__c.runMethod(true,"Round2",(Object)(_totaliva),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 1048;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
Debug.ShouldStop(8388608);
_totalneto = crear_documento.__c.runMethod(true,"Round2",(Object)(_totalneto),(Object)(BA.numberCast(int.class, _decimal)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 1049;BA.debugLine="TotalBruto = Round2(TotalBruto, Decimal)";
Debug.ShouldStop(16777216);
_totalbruto = crear_documento.__c.runMethod(true,"Round2",(Object)(_totalbruto),(Object)(BA.numberCast(int.class, _decimal)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 1057;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
Debug.ShouldStop(1);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantidad"))),(Object)((_cantidad)));
 BA.debugLineNum = 1058;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
Debug.ShouldStop(2);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantud1"))),(Object)((_cantud1)));
 BA.debugLineNum = 1059;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
Debug.ShouldStop(4);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantud2"))),(Object)((_cantud2)));
 BA.debugLineNum = 1061;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
Debug.ShouldStop(16);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valnetolinea"))),(Object)((_totalneto)));
 BA.debugLineNum = 1062;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
Debug.ShouldStop(32);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valivalinea"))),(Object)((_totaliva)));
 BA.debugLineNum = 1063;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
Debug.ShouldStop(64);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valilalinea"))),(Object)((_totalila)));
 BA.debugLineNum = 1064;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
Debug.ShouldStop(128);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valbrutolinea"))),(Object)((_totalbruto)));
 BA.debugLineNum = 1066;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
Debug.ShouldStop(512);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dsctoneto"))),(Object)((_totaldsctoneto)));
 BA.debugLineNum = 1067;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
Debug.ShouldStop(1024);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dsctobruto"))),(Object)((_totaldsctobruto)));
 BA.debugLineNum = 1069;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
Debug.ShouldStop(4096);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetorealud1"))),(Object)((_precionetorealud1)));
 BA.debugLineNum = 1070;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
Debug.ShouldStop(8192);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetorealud2"))),(Object)((_precionetorealud2)));
 BA.debugLineNum = 1075;BA.debugLine="Dim TipoValor As String";
Debug.ShouldStop(262144);
_tipovalor = RemoteObject.createImmutable("");Debug.locals.put("TipoValor", _tipovalor);
 BA.debugLineNum = 1077;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(1048576);
if (__ref.getField(true,"_chkvalores" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1079;BA.debugLine="TipoValor = \"N\"";
Debug.ShouldStop(4194304);
_tipovalor = BA.ObjectToString("N");Debug.locals.put("TipoValor", _tipovalor);
 }else {
 BA.debugLineNum = 1082;BA.debugLine="TipoValor = \"B\"";
Debug.ShouldStop(33554432);
_tipovalor = BA.ObjectToString("B");Debug.locals.put("TipoValor", _tipovalor);
 };
 BA.debugLineNum = 1085;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
Debug.ShouldStop(268435456);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipovalor"))),(Object)((_tipovalor)));
 BA.debugLineNum = 1087;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
Debug.ShouldStop(1073741824);
_precionetoud = _precioneto;Debug.locals.put("PrecioNetoUd", _precionetoud);Debug.locals.put("PrecioNetoUd", _precionetoud);
 BA.debugLineNum = 1088;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
Debug.ShouldStop(-2147483648);
_preciobrutoud = _preciobruto;Debug.locals.put("PrecioBrutoUd", _preciobrutoud);Debug.locals.put("PrecioBrutoUd", _preciobrutoud);
 BA.debugLineNum = 1090;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
Debug.ShouldStop(2);
_precionetoudlista = crear_documento.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precionetoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioNetoUdLista", _precionetoudlista);Debug.locals.put("PrecioNetoUdLista", _precionetoudlista);
 BA.debugLineNum = 1091;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
Debug.ShouldStop(4);
_preciobrutoudlista = crear_documento.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("preciobrutoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioBrutoUdLista", _preciobrutoudlista);Debug.locals.put("PrecioBrutoUdLista", _preciobrutoudlista);
 BA.debugLineNum = 1093;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
Debug.ShouldStop(16);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetoud"))),(Object)((_precionetoud)));
 BA.debugLineNum = 1095;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
Debug.ShouldStop(64);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("preciobrutoud"))),(Object)((_preciobrutoud)));
 BA.debugLineNum = 1098;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_traer_concepto(RemoteObject __ref,RemoteObject _concepto,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _descuentoporc) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Concepto (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1461);
if (RapidSub.canDelegate("sb_traer_concepto")) { return __ref.runUserSub(false, "crear_documento","sb_traer_concepto", __ref, _concepto, _empresa, _sucursal, _bodega, _descuentoporc);}
ResumableSub_Sb_Traer_Concepto rsub = new ResumableSub_Sb_Traer_Concepto(null,__ref,_concepto,_empresa,_sucursal,_bodega,_descuentoporc);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Concepto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Concepto(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref,RemoteObject _concepto,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega,RemoteObject _descuentoporc) {
this.parent = parent;
this.__ref = __ref;
this._concepto = _concepto;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
this._descuentoporc = _descuentoporc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _concepto;
RemoteObject _empresa;
RemoteObject _sucursal;
RemoteObject _bodega;
RemoteObject _descuentoporc;
RemoteObject _lista = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_docdet2 = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Concepto (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1461);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Concepto", _concepto);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 1467;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
Debug.ShouldStop(67108864);
_lista = parent._variables._gl_lista_precios /*RemoteObject*/ ;Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1469;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(268435456);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_concepto_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref),(Object)(_concepto),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_lista),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1471;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_concepto"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1474;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1476;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1478;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1480;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(128);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1481;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
Debug.ShouldStop(256);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1483;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
Debug.ShouldStop(1024);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((__ref.getField(true,"_id_docenc" /*RemoteObject*/ ))));
 BA.debugLineNum = 1485;BA.debugLine="Fila.Put(\"Moneda\",Variables.Global_Row_Moneda.G";
Debug.ShouldStop(4096);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Moneda"))),(Object)(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 1486;BA.debugLine="Fila.Put(\"Tipo_Moneda\",Variables.Global_Row_Mon";
Debug.ShouldStop(8192);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_Moneda"))),(Object)(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 1487;BA.debugLine="Fila.Put(\"Tipo_Cambio\",Variables.Global_Row_Mon";
Debug.ShouldStop(16384);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo_Cambio"))),(Object)(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 1488;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
Debug.ShouldStop(32768);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoPorc"))),(Object)((_descuentoporc)));
 BA.debugLineNum = 1490;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
Debug.ShouldStop(131072);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 1492;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Order";
Debug.ShouldStop(524288);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select * From Detalle_Doc Order by Id_DocDet Desc"));
 BA.debugLineNum = 1493;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(1048576);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 1495;BA.debugLine="Dim Id_DocDet2 As Int = New_Row.Get(\"id_docdet\"";
Debug.ShouldStop(4194304);
_id_docdet2 = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));Debug.locals.put("Id_DocDet2", _id_docdet2);Debug.locals.put("Id_DocDet2", _id_docdet2);
 BA.debugLineNum = 1497;BA.debugLine="Return Id_DocDet2";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_id_docdet2));return;};
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1502;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","68847401",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1503;BA.debugLine="ToastMessageShow(\"CONCEPTO NO ENCONTRADO\", False";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("CONCEPTO NO ENCONTRADO")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1506;BA.debugLine="Return 0";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 BA.debugLineNum = 1508;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_descuentos(RemoteObject __ref,RemoteObject _nulido) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Descuentos (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1510);
if (RapidSub.canDelegate("sb_traer_descuentos")) { return __ref.runUserSub(false, "crear_documento","sb_traer_descuentos", __ref, _nulido);}
ResumableSub_Sb_Traer_Descuentos rsub = new ResumableSub_Sb_Traer_Descuentos(null,__ref,_nulido);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Descuentos extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Descuentos(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref,RemoteObject _nulido) {
this.parent = parent;
this.__ref = __ref;
this._nulido = _nulido;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _nulido;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Descuentos (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1510);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Nulido", _nulido);
 BA.debugLineNum = 1512;BA.debugLine="Consulta_Sql = \"Select *,KODT As 'Kodt',PODT As '";
Debug.ShouldStop(128);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select *,KODT As 'Kodt',PODT As 'Dscto',VADT As 'Valor' From MAEDTLI Where IDMAEEDO = "),__ref.getField(true,"_idmaeedo" /*RemoteObject*/ ),RemoteObject.createImmutable(" And NULIDO = '"),_nulido,RemoteObject.createImmutable("' Order By IDMAEDTLI")));
 BA.debugLineNum = 1514;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(512);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1515;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_descuentos"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1517;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 8;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1519;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16384);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1521;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1527;BA.debugLine="Dim Lista As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(4194304);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lista = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1529;BA.debugLine="Return Lista";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lista));return;};
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
 BA.debugLineNum = 1535;BA.debugLine="Return Null";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1537;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_despacho_simple(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Despacho_Simple (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1730);
if (RapidSub.canDelegate("sb_traer_despacho_simple")) { return __ref.runUserSub(false, "crear_documento","sb_traer_despacho_simple", __ref);}
ResumableSub_Sb_Traer_Despacho_Simple rsub = new ResumableSub_Sb_Traer_Despacho_Simple(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Despacho_Simple extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Despacho_Simple(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Despacho_Simple (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1730);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1732;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
Debug.ShouldStop(8);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_Despacho_Simple Where Idmaeedo = "),__ref.getField(true,"_idmaeedo" /*RemoteObject*/ )));
 BA.debugLineNum = 1734;BA.debugLine="Dim Fila As Map";
Debug.ShouldStop(32);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1735;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(64);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1737;BA.debugLine="Fila = Null";
Debug.ShouldStop(256);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1739;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_despacho_simple"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1741;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1743;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16384);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1745;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1747;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(262144);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1748;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(524288);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1753;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","69175063",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1756;BA.debugLine="Return Fila";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_fila));return;};
 BA.debugLineNum = 1758;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_encabezado(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Encabezado (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1670);
if (RapidSub.canDelegate("sb_traer_encabezado")) { return __ref.runUserSub(false, "crear_documento","sb_traer_encabezado", __ref);}
ResumableSub_Sb_Traer_Encabezado rsub = new ResumableSub_Sb_Traer_Encabezado(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Encabezado extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Encabezado(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Encabezado (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1670);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1672;BA.debugLine="Consulta_Sql = \"Select * From MAEEDO Where IDMAEE";
Debug.ShouldStop(128);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From MAEEDO Where IDMAEEDO = "),__ref.getField(true,"_idmaeedo" /*RemoteObject*/ )));
 BA.debugLineNum = 1674;BA.debugLine="Dim Fila As Map";
Debug.ShouldStop(512);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1675;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1024);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1677;BA.debugLine="Fila = Null";
Debug.ShouldStop(4096);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1679;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_encabezado"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1681;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1683;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(262144);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1685;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1687;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(4194304);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1688;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(8388608);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1693;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","69043991",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1696;BA.debugLine="Return Fila";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_fila));return;};
 BA.debugLineNum = 1698;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_entidad(RemoteObject __ref,RemoteObject _koen,RemoteObject _suen) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Entidad (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1100);
if (RapidSub.canDelegate("sb_traer_entidad")) { return __ref.runUserSub(false, "crear_documento","sb_traer_entidad", __ref, _koen, _suen);}
ResumableSub_Sb_Traer_Entidad rsub = new ResumableSub_Sb_Traer_Entidad(null,__ref,_koen,_suen);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Entidad extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Entidad(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref,RemoteObject _koen,RemoteObject _suen) {
this.parent = parent;
this.__ref = __ref;
this._koen = _koen;
this._suen = _suen;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _koen;
RemoteObject _suen;
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Entidad (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1100);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Koen", _koen);
Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 1102;BA.debugLine="Dim Fila As Map";
Debug.ShouldStop(8192);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1103;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(16384);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_entidad_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref),(Object)(_koen),(Object)(_suen));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1105;BA.debugLine="Fila = Null";
Debug.ShouldStop(65536);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1107;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_entidad"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1109;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1111;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(4194304);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1113;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1115;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(67108864);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1116;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(134217728);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1118;BA.debugLine="Row_Entidad = Fila";
Debug.ShouldStop(536870912);
__ref.setField ("_row_entidad" /*RemoteObject*/ ,_fila);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1123;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","68585239",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1126;BA.debugLine="Return Fila";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_fila));return;};
 BA.debugLineNum = 1128;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_observaciones(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Observaciones (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1700);
if (RapidSub.canDelegate("sb_traer_observaciones")) { return __ref.runUserSub(false, "crear_documento","sb_traer_observaciones", __ref);}
ResumableSub_Sb_Traer_Observaciones rsub = new ResumableSub_Sb_Traer_Observaciones(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Observaciones extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Observaciones(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Observaciones (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1700);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1702;BA.debugLine="Consulta_Sql = \"Select * From MAEEDOOB Where IDMA";
Debug.ShouldStop(32);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From MAEEDOOB Where IDMAEEDO = "),__ref.getField(true,"_idmaeedo" /*RemoteObject*/ )));
 BA.debugLineNum = 1704;BA.debugLine="Dim Fila As Map";
Debug.ShouldStop(128);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1705;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(256);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1707;BA.debugLine="Fila = Null";
Debug.ShouldStop(1024);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1709;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_observaciones"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1711;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 10;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1713;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1715;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1717;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(1048576);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1718;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(2097152);
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1723;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","69109527",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1726;BA.debugLine="Return Fila";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_fila));return;};
 BA.debugLineNum = 1728;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_producto(RemoteObject __ref,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Producto (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1393);
if (RapidSub.canDelegate("sb_traer_producto")) { return __ref.runUserSub(false, "crear_documento","sb_traer_producto", __ref, _codigo, _empresa, _sucursal, _bodega);}
ResumableSub_Sb_Traer_Producto rsub = new ResumableSub_Sb_Traer_Producto(null,__ref,_codigo,_empresa,_sucursal,_bodega);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Producto extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Producto(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega) {
this.parent = parent;
this.__ref = __ref;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _codigo;
RemoteObject _empresa;
RemoteObject _sucursal;
RemoteObject _bodega;
RemoteObject _lista = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errorstr = RemoteObject.createImmutable("");
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id_docdet = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Producto (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1393);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1398;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
Debug.ShouldStop(2097152);
_lista = BA.ObjectToString(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1400;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(8388608);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_productos_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref),(Object)(_codigo),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_lista),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1402;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_producto"), (_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1404;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 14;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1406;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(536870912);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1408;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1410;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(2);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1411;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
Debug.ShouldStop(4);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1413;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Error\")";
Debug.ShouldStop(16);
_errorstr = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("ErrorStr", _errorstr);Debug.locals.put("ErrorStr", _errorstr);
 BA.debugLineNum = 1415;BA.debugLine="If ErrorStr = Null Then";
Debug.ShouldStop(64);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("n",_errorstr)) { 
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
 BA.debugLineNum = 1421;BA.debugLine="Fila.Put(\"Id_DocEnc\",Id_DocEnc)";
Debug.ShouldStop(4096);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((__ref.getField(true,"_id_docenc" /*RemoteObject*/ ))));
 BA.debugLineNum = 1423;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.G";
Debug.ShouldStop(16384);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 1424;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mon";
Debug.ShouldStop(32768);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 1425;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mon";
Debug.ShouldStop(65536);
_fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)(parent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 1427;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc\"";
Debug.ShouldStop(262144);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 1429;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where";
Debug.ShouldStop(1048576);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocEnc = "),__ref.getField(true,"_id_docenc" /*RemoteObject*/ ),RemoteObject.createImmutable(" Order by Id_DocDet Desc")));
 BA.debugLineNum = 1430;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variabl";
Debug.ShouldStop(2097152);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(parent._variables._vsql /*RemoteObject*/ ),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 1432;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\")";
Debug.ShouldStop(8388608);
_id_docdet = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));Debug.locals.put("Id_DocDet", _id_docdet);Debug.locals.put("Id_DocDet", _id_docdet);
 BA.debugLineNum = 1442;BA.debugLine="Return Id_DocDet'Fila_Id";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_id_docdet));return;};
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
 BA.debugLineNum = 1457;BA.debugLine="Return 0";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 BA.debugLineNum = 1459;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _sb_traer_producto2(RemoteObject __ref,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Producto2 (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1357);
if (RapidSub.canDelegate("sb_traer_producto2")) { return __ref.runUserSub(false, "crear_documento","sb_traer_producto2", __ref, _codigo, _empresa, _sucursal, _bodega);}
ResumableSub_Sb_Traer_Producto2 rsub = new ResumableSub_Sb_Traer_Producto2(null,__ref,_codigo,_empresa,_sucursal,_bodega);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Traer_Producto2 extends BA.ResumableSub {
public ResumableSub_Sb_Traer_Producto2(BaKapp.Movil.Tag.crear_documento parent,RemoteObject __ref,RemoteObject _codigo,RemoteObject _empresa,RemoteObject _sucursal,RemoteObject _bodega) {
this.parent = parent;
this.__ref = __ref;
this._codigo = _codigo;
this._empresa = _empresa;
this._sucursal = _sucursal;
this._bodega = _bodega;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.crear_documento parent;
RemoteObject _codigo;
RemoteObject _empresa;
RemoteObject _sucursal;
RemoteObject _bodega;
RemoteObject _lista = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rfila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errorstr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Traer_Producto2 (crear_documento) ","crear_documento",11,__ref.getField(false, "ba"),__ref,1357);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Sucursal", _sucursal);
Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1362;BA.debugLine="Dim Lista As String =  Fila_Encabezado.Get(\"Lista";
Debug.ShouldStop(131072);
_lista = BA.ObjectToString(__ref.getField(false,"_fila_encabezado" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaPrecios").runMethod(true,"toLowerCase")))));Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 1364;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(524288);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_productos_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref),(Object)(_codigo),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_lista),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1366;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "crear_documento", "sb_traer_producto2"), (_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1368;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 14;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1370;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(33554432);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1372;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1374;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(536870912);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1375;BA.debugLine="Dim RFila As Map = Filas.Get(0)";
Debug.ShouldStop(1073741824);
_rfila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rfila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("RFila", _rfila);Debug.locals.put("RFila", _rfila);
 BA.debugLineNum = 1377;BA.debugLine="Dim ErrorStr As String =RFila.Get(\"Error\")";
Debug.ShouldStop(1);
_errorstr = BA.ObjectToString(_rfila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("ErrorStr", _errorstr);Debug.locals.put("ErrorStr", _errorstr);
 BA.debugLineNum = 1379;BA.debugLine="If ErrorStr = Null Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("n",_errorstr)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1380;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
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
 BA.debugLineNum = 1386;BA.debugLine="Return Null";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1389;BA.debugLine="Return RFila";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_rfila));return;};
 BA.debugLineNum = 1391;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}