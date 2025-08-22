package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class conectar_conf_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Consulta_Sql As String";
conectar_conf._consulta_sql = RemoteObject.createImmutable("");__ref.setField("_consulta_sql",conectar_conf._consulta_sql);
 //BA.debugLineNum = 3;BA.debugLine="Dim vError As String";
conectar_conf._verror = RemoteObject.createImmutable("");__ref.setField("_verror",conectar_conf._verror);
 //BA.debugLineNum = 4;BA.debugLine="Dim bmp1 As Bitmap";
conectar_conf._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",conectar_conf._bmp1);
 //BA.debugLineNum = 5;BA.debugLine="Public Estado As String";
conectar_conf._estado = RemoteObject.createImmutable("");__ref.setField("_estado",conectar_conf._estado);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _fx_cargar_configuracion_estacion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Configuracion_Estacion (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("fx_cargar_configuracion_estacion")) { return __ref.runUserSub(false, "conectar_conf","fx_cargar_configuracion_estacion", __ref);}
ResumableSub_Fx_Cargar_Configuracion_Estacion rsub = new ResumableSub_Fx_Cargar_Configuracion_Estacion(null,__ref);
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
public static class ResumableSub_Fx_Cargar_Configuracion_Estacion extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Configuracion_Estacion(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Configuracion_Estacion (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,46);
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
 BA.debugLineNum = 48;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(32768);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 52;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
Debug.ShouldStop(524288);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_EstacionesBkp Where NombreEquipo = '"),parent._variables._global_iddispositivo /*RemoteObject*/ ,RemoteObject.createImmutable("' And TipoEstacion = 'B4A'")));
 BA.debugLineNum = 54;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(2097152);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 55;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_configuracion_estacion"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 57;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 59;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(67108864);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 60;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 62;BA.debugLine="Log(\"2.- Una vez que ya tenemos el nombre carga";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","67143440",RemoteObject.createImmutable("2.- Una vez que ya tenemos el nombre cargamos la configuración de la estación en la tabla Zw_EstacionesBkp"),0);
 BA.debugLineNum = 63;BA.debugLine="Variables.Global_Row_EstacionBk = Funciones.Fx_";
Debug.ShouldStop(1073741824);
parent._variables._global_row_estacionbk /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="Log(\"Configuracion_Estacion_Cargada\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","67143442",RemoteObject.createImmutable("Configuracion_Estacion_Cargada"),0);
 BA.debugLineNum = 65;BA.debugLine="Resultado = 1";
Debug.ShouldStop(1);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 71;BA.debugLine="Return Resultado";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _fx_cargar_configuracion_estacion_y_general(RemoteObject __ref,RemoteObject _empresa,RemoteObject _modalidad) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Configuracion_Estacion_Y_General (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("fx_cargar_configuracion_estacion_y_general")) { return __ref.runUserSub(false, "conectar_conf","fx_cargar_configuracion_estacion_y_general", __ref, _empresa, _modalidad);}
ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General rsub = new ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General(null,__ref,_empresa,_modalidad);
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
public static class ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Configuracion_Estacion_Y_General(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref,RemoteObject _empresa,RemoteObject _modalidad) {
this.parent = parent;
this.__ref = __ref;
this._empresa = _empresa;
this._modalidad = _modalidad;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _empresa;
RemoteObject _modalidad;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Configuracion_Estacion_Y_General (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,138);
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
Debug.locals.put("Empresa", _empresa);
Debug.locals.put("Modalidad", _modalidad);
 BA.debugLineNum = 140;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(2048);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 144;BA.debugLine="Consulta_Sql = \"Select Top 1 *,Getdate() As Fecha";
Debug.ShouldStop(32768);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 *,Getdate() As Fecha_Servidor From CONFIEST"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Inner Join "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_Configuracion On Empresa = EMPRESA And Modalidad = '"),_modalidad,RemoteObject.createImmutable("'"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where EMPRESA = '"),_empresa,RemoteObject.createImmutable("' And MODALIDAD = '"),_modalidad,RemoteObject.createImmutable("'")));
 BA.debugLineNum = 148;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(524288);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 149;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_configuracion_estacion_y_general"), (_js));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 151;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 24;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 153;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 155;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 157;BA.debugLine="Log(\"6.- Cargamos la configuración por Estación";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","67340051",RemoteObject.createImmutable("6.- Cargamos la configuración por Estación CONFIEST"),0);
 BA.debugLineNum = 159;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = F";
Debug.ShouldStop(1073741824);
parent._variables._global_row_configuracion_estacion /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 161;BA.debugLine="Variables.Gl_Modalidad = Modalidad";
Debug.ShouldStop(1);
parent._variables._gl_modalidad /*RemoteObject*/  = _modalidad;
 BA.debugLineNum = 162;BA.debugLine="Variables.Gl_Empresa = Variables.Global_Row_Con";
Debug.ShouldStop(2);
parent._variables._gl_empresa /*RemoteObject*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EMPRESA")))));
 BA.debugLineNum = 163;BA.debugLine="Variables.Gl_Sucursal = Variables.Global_Row_Co";
Debug.ShouldStop(4);
parent._variables._gl_sucursal /*RemoteObject*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESUCURSAL")))));
 BA.debugLineNum = 164;BA.debugLine="Variables.Gl_Bodega = Variables.Global_Row_Conf";
Debug.ShouldStop(8);
parent._variables._gl_bodega /*RemoteObject*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EBODEGA")))));
 BA.debugLineNum = 165;BA.debugLine="Variables.Gl_Caja = Variables.Global_Row_Config";
Debug.ShouldStop(16);
parent._variables._gl_caja /*RemoteObject*/  = BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ECAJA")))));
 BA.debugLineNum = 166;BA.debugLine="Variables.Gl_Lista_Precios =  Funciones.Mid(Var";
Debug.ShouldStop(32);
parent._variables._gl_lista_precios /*RemoteObject*/  = parent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ELISTAVEN")))))),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 167;BA.debugLine="Variables.Gl_Lista_Costos = Funciones.Mid(Varia";
Debug.ShouldStop(64);
parent._variables._gl_lista_costos /*RemoteObject*/  = parent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ELISTACOM")))))),(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 168;BA.debugLine="Variables.Gl_Fecha_Servidor = Funciones.Mid(Var";
Debug.ShouldStop(128);
parent._variables._gl_fecha_servidor /*RemoteObject*/  = parent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToString(parent._variables._global_row_configuracion_estacion /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha_Servidor")))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 172;BA.debugLine="Consulta_Sql = \"Select\" & CRLF & _ 						    \"E";
Debug.ShouldStop(2048);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Empresa,Pr_AutoPr_Crear_Codigo_Principal_Automatico, Pr_AutoPr_Correlativo_Por_Iniciales, Pr_AutoPr_Correlativo_General,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Pr_AutoPr_Tablas_Para_Iniciales_Cod_Automatico, Pr_AutoPr_Max_Cant_Caracteres_Del_Codigo, Pr_AutoPr_Ultimo_Codigo_Creado_Correlativo_General,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Pr_Desc_Producto_Solo_Mayusculas, Pr_Creacion_Exigir_Precio, Pr_Creacion_Exigir_Clasificacion_busqueda, Pr_Creacion_Exigir_Codigo_Alternativo,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Tbl_Ranking, Revisa_Taza_Cambio, Revisar_Taza_Solo_Mon_Extranjeras, Vnta_Dias_Venci_Coti, Vnta_TipoValor_Bruto_Neto, Vnta_EntidadXdefecto,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Vnta_SucEntXdefecto, Vnta_Producto_NoCreado, Vnta_Preguntar_Documento, SOC_CodTurno, SOC_Buscar_Producto, SOC_Aprueba_Solo_G1,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("SOC_Aprueba_G1_y_G2, SOC_Prod_Crea_Solo_Marcas_Proveedor, SOC_Prod_Crea_Max_Carac_Nom, SOC_Valor_1ra_Aprobacion, SOC_Dias_Apela,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("SOC_Tipo_Creacion_Producto_Normal_Matriz, Precio_Costos_Desde, Precios_Venta_Desde_Random, Precios_Venta_Desde_BakApp,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Vnta_Redondear_Dscto_Cero, Nodo_Raiz_Asociados, Vnta_Ofrecer_Otras_Bod_Stock_Insuficiente, Conservar_Responzable_Doc_Relacionado,"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Preguntar_Si_Cambia_Responsable_Doc_Relacionado, ServTecnico_Empresa, ServTecnico_Sucursal, ServTecnico_Bodega"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_Configuracion"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where Modalidad_General = 1")));
 BA.debugLineNum = 185;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
Debug.ShouldStop(16777216);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 187;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_configuracion_estacion_y_general"), (_js));
this.state = 26;
return;
case 26:
//C
this.state = 7;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 189;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 18;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 191;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1073741824);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 193;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 195;BA.debugLine="Log(\"7.- Cargamos la configuración General\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","67340089",RemoteObject.createImmutable("7.- Cargamos la configuración General"),0);
 BA.debugLineNum = 196;BA.debugLine="Log(\"Fecha servidor: \" & Variables.Gl_Fecha_S";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","67340090",RemoteObject.concat(RemoteObject.createImmutable("Fecha servidor: "),parent._variables._gl_fecha_servidor /*RemoteObject*/ ),0);
 BA.debugLineNum = 198;BA.debugLine="Variables.Global_Row_Configuracion_General =";
Debug.ShouldStop(32);
parent._variables._global_row_configuracion_general /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 199;BA.debugLine="Resultado = 1";
Debug.ShouldStop(64);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 202;BA.debugLine="Variables.Global_Row_Configuracion_General =";
Debug.ShouldStop(512);
parent._variables._global_row_configuracion_general /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 206;BA.debugLine="Log(\"Error al cargar Configuracion General\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","67340100",RemoteObject.createImmutable("Error al cargar Configuracion General"),0);
 BA.debugLineNum = 207;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","67340101",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 211;BA.debugLine="Variables.Global_Row_Configuracion_Estacion = N";
Debug.ShouldStop(262144);
parent._variables._global_row_configuracion_estacion /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.__c.getField(false,"Null"));
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 215;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","67340109",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 218;BA.debugLine="Return Resultado";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _fx_cargar_listas_precios_por_usuario(RemoteObject __ref,RemoteObject _usuario_x_defecto) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Listas_Precios_Por_Usuario (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("fx_cargar_listas_precios_por_usuario")) { return __ref.runUserSub(false, "conectar_conf","fx_cargar_listas_precios_por_usuario", __ref, _usuario_x_defecto);}
ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario rsub = new ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario(null,__ref,_usuario_x_defecto);
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
public static class ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Listas_Precios_Por_Usuario(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref,RemoteObject _usuario_x_defecto) {
this.parent = parent;
this.__ref = __ref;
this._usuario_x_defecto = _usuario_x_defecto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _usuario_x_defecto;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Listas_Precios_Por_Usuario (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,106);
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
Debug.locals.put("Usuario_X_Defecto", _usuario_x_defecto);
 BA.debugLineNum = 108;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(2048);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 112;BA.debugLine="Consulta_Sql = \"Select KOLT As Kolt,KOLT+'-'+NOKO";
Debug.ShouldStop(32768);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select KOLT As Kolt,KOLT+'-'+NOKOLT As Nokolt From TABPP"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where KOLT In (Select SUBSTRING(KOOP,4,3)"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEUS Where KOUS = '"),_usuario_x_defecto,RemoteObject.createImmutable("' And KOOP LIKE 'LI-%') And TILT = 'P'"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order By Nokolt")));
 BA.debugLineNum = 117;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1048576);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 118;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_listas_precios_por_usuario"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 120;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 122;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(33554432);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 123;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 125;BA.debugLine="Log(\"5.- Traemos la lista de precios asociadas";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","67274515",RemoteObject.createImmutable("5.- Traemos la lista de precios asociadas al usuario, con las que puede trabajar"),0);
 BA.debugLineNum = 126;BA.debugLine="Variables.Global_Listas_Precios_Usuario = Funci";
Debug.ShouldStop(536870912);
parent._variables._global_listas_precios_usuario /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_vjson));
 BA.debugLineNum = 127;BA.debugLine="Resultado = 1";
Debug.ShouldStop(1073741824);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 134;BA.debugLine="Return Resultado";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 136;BA.debugLine="End Sub";
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
public static RemoteObject  _fx_cargar_sis_despachosimple_docdestino(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Sis_DespachoSimple_DocDestino (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("fx_cargar_sis_despachosimple_docdestino")) { return __ref.runUserSub(false, "conectar_conf","fx_cargar_sis_despachosimple_docdestino", __ref);}
ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino(null,__ref);
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
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_DocDestino(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Sis_DespachoSimple_DocDestino (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,428);
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
 BA.debugLineNum = 430;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(8192);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 434;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
Debug.ShouldStop(131072);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_DOCDESTINO'")));
 BA.debugLineNum = 436;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(524288);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 437;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_docdestino"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 439;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 441;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 442;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 444;BA.debugLine="Log(\"Traemos la lista de tipos de documentos pa";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","67602192",RemoteObject.createImmutable("Traemos la lista de tipos de documentos para despacho simple"),0);
 BA.debugLineNum = 445;BA.debugLine="Variables.Global_Sis_DespachoSimple_DocDestino";
Debug.ShouldStop(268435456);
parent._variables._global_sis_despachosimple_docdestino /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_vjson));
 BA.debugLineNum = 446;BA.debugLine="Resultado = 1";
Debug.ShouldStop(536870912);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 452;BA.debugLine="Return Resultado";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _fx_cargar_sis_despachosimple_tipo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Sis_DespachoSimple_Tipo (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,456);
if (RapidSub.canDelegate("fx_cargar_sis_despachosimple_tipo")) { return __ref.runUserSub(false, "conectar_conf","fx_cargar_sis_despachosimple_tipo", __ref);}
ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo(null,__ref);
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
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_Tipo(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Sis_DespachoSimple_Tipo (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,456);
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
 BA.debugLineNum = 458;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(512);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 462;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
Debug.ShouldStop(8192);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPO'")));
 BA.debugLineNum = 464;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(32768);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 465;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_tipo"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 467;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 469;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1048576);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 470;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 472;BA.debugLine="Log(\"Traemos la lista de tipos de despacho o re";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","67667728",RemoteObject.createImmutable("Traemos la lista de tipos de despacho o retiro"),0);
 BA.debugLineNum = 473;BA.debugLine="Variables.Global_Sis_DespachoSimple_Tipo = Func";
Debug.ShouldStop(16777216);
parent._variables._global_sis_despachosimple_tipo /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_vjson));
 BA.debugLineNum = 474;BA.debugLine="Resultado = 1";
Debug.ShouldStop(33554432);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 480;BA.debugLine="Return Resultado";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 482;BA.debugLine="End Sub";
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
public static RemoteObject  _fx_cargar_sis_despachosimple_tipopago(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Sis_DespachoSimple_TipoPago (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,484);
if (RapidSub.canDelegate("fx_cargar_sis_despachosimple_tipopago")) { return __ref.runUserSub(false, "conectar_conf","fx_cargar_sis_despachosimple_tipopago", __ref);}
ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago rsub = new ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago(null,__ref);
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
public static class ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago extends BA.ResumableSub {
public ResumableSub_Fx_Cargar_Sis_DespachoSimple_TipoPago(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Cargar_Sis_DespachoSimple_TipoPago (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,484);
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
 BA.debugLineNum = 486;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(32);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 490;BA.debugLine="Consulta_Sql = \"Select * From \" & Variables.Globa";
Debug.ShouldStop(512);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select * From "),parent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_TablaDeCaracterizaciones Where Tabla = 'SIS_DESPACHOSIMPLE_TIPOPAGO'")));
 BA.debugLineNum = 492;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(2048);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 493;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_cargar_sis_despachosimple_tipopago"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 495;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 497;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(65536);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 498;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 500;BA.debugLine="Log(\"Traemos la lista de tipos de pago\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","67733264",RemoteObject.createImmutable("Traemos la lista de tipos de pago"),0);
 BA.debugLineNum = 501;BA.debugLine="Variables.Global_Sis_DespachoSimple_TipoPago =";
Debug.ShouldStop(1048576);
parent._variables._global_sis_despachosimple_tipopago /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_vjson));
 BA.debugLineNum = 502;BA.debugLine="Resultado = 1";
Debug.ShouldStop(2097152);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 508;BA.debugLine="Return Resultado";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 510;BA.debugLine="End Sub";
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
public static RemoteObject  _fx_traer_nombre_base_de_datos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Fx_Traer_Nombre_Base_De_Datos (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("fx_traer_nombre_base_de_datos")) { return __ref.runUserSub(false, "conectar_conf","fx_traer_nombre_base_de_datos", __ref);}
ResumableSub_Fx_Traer_Nombre_Base_De_Datos rsub = new ResumableSub_Fx_Traer_Nombre_Base_De_Datos(null,__ref);
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
public static class ResumableSub_Fx_Traer_Nombre_Base_De_Datos extends BA.ResumableSub {
public ResumableSub_Fx_Traer_Nombre_Base_De_Datos(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Traer_Nombre_Base_De_Datos (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,16);
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
 BA.debugLineNum = 18;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(131072);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 23;BA.debugLine="Consulta_Sql = 	\"Select Top 1 *,NOKOCARAC+'.dbo.'";
Debug.ShouldStop(4194304);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select Top 1 *,NOKOCARAC+'.dbo.' As Global_BaseBk From TABCARAC Where KOTABLA = 'BAKAPP' And KOCARAC = 'BASE'"));
 BA.debugLineNum = 25;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(16777216);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 26;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_traer_nombre_base_de_datos"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 28;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 30;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(536870912);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 31;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 33;BA.debugLine="Log(\"1.- Obtenemos primero el nombre de la base";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","67077905",RemoteObject.createImmutable("1.- Obtenemos primero el nombre de la base de datos de Bakapp"),0);
 BA.debugLineNum = 34;BA.debugLine="Dim Fila As Map = Funciones.Fx_DataRow(Js.GetSt";
Debug.ShouldStop(2);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 35;BA.debugLine="Variables.Global_BaseBk = Fila.Get(\"Global_Base";
Debug.ShouldStop(4);
parent._variables._global_basebk /*RemoteObject*/  = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Global_BaseBk")))));
 BA.debugLineNum = 36;BA.debugLine="Log(\"DB BakApp: \" & Variables.Global_BaseBk)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","67077908",RemoteObject.concat(RemoteObject.createImmutable("DB BakApp: "),parent._variables._global_basebk /*RemoteObject*/ ),0);
 BA.debugLineNum = 37;BA.debugLine="Resultado = 1";
Debug.ShouldStop(16);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 42;BA.debugLine="Return Resultado";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _fx_traer_usuario_por_defecto(RemoteObject __ref,RemoteObject _usuario_x_defecto) throws Exception{
try {
		Debug.PushSubsStack("Fx_Traer_Usuario_Por_Defecto (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("fx_traer_usuario_por_defecto")) { return __ref.runUserSub(false, "conectar_conf","fx_traer_usuario_por_defecto", __ref, _usuario_x_defecto);}
ResumableSub_Fx_Traer_Usuario_Por_Defecto rsub = new ResumableSub_Fx_Traer_Usuario_Por_Defecto(null,__ref,_usuario_x_defecto);
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
public static class ResumableSub_Fx_Traer_Usuario_Por_Defecto extends BA.ResumableSub {
public ResumableSub_Fx_Traer_Usuario_Por_Defecto(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref,RemoteObject _usuario_x_defecto) {
this.parent = parent;
this.__ref = __ref;
this._usuario_x_defecto = _usuario_x_defecto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _usuario_x_defecto;
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Traer_Usuario_Por_Defecto (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,75);
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
Debug.locals.put("Usuario_X_Defecto", _usuario_x_defecto);
 BA.debugLineNum = 77;BA.debugLine="Dim Resultado As Int = 0";
Debug.ShouldStop(4096);
_resultado = BA.numberCast(int.class, 0);Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 82;BA.debugLine="Consulta_Sql = \"Select Top 1 * From TABFU Where K";
Debug.ShouldStop(131072);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Select Top 1 * From TABFU Where KOFU = '"),_usuario_x_defecto,RemoteObject.createImmutable("'")));
 BA.debugLineNum = 84;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(524288);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 85;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "fx_traer_usuario_por_defecto"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 87;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 89;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 91;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 93;BA.debugLine="Log(\"4.- Cargamos al usuario por defecto y lo t";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","67208978",RemoteObject.createImmutable("4.- Cargamos al usuario por defecto y lo traemos"),0);
 BA.debugLineNum = 94;BA.debugLine="Variables.Global_Row_Usuario_Activo = Funciones";
Debug.ShouldStop(536870912);
parent._variables._global_row_usuario_activo /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 95;BA.debugLine="Resultado = 1";
Debug.ShouldStop(1073741824);
_resultado = BA.numberCast(int.class, 1);Debug.locals.put("Resultado", _resultado);
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
 BA.debugLineNum = 102;BA.debugLine="Return Resultado";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "conectar_conf","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_cargar_datos_de_configuracion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Datos_De_Configuracion (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("sb_cargar_datos_de_configuracion")) { return __ref.runUserSub(false, "conectar_conf","sb_cargar_datos_de_configuracion", __ref);}
ResumableSub_Sb_Cargar_Datos_De_Configuracion rsub = new ResumableSub_Sb_Cargar_Datos_De_Configuracion(null,__ref);
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
public static class ResumableSub_Sb_Cargar_Datos_De_Configuracion extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Datos_De_Configuracion(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _usar_datos_x_defecto = RemoteObject.createImmutable(false);
RemoteObject _empresa_x_defecto = RemoteObject.createImmutable("");
RemoteObject _usuario_x_defecto = RemoteObject.createImmutable("");
RemoteObject _modalidad_x_defecto = RemoteObject.createImmutable("");
RemoteObject _resulttmp = RemoteObject.createImmutable(false);
RemoteObject _clfx = RemoteObject.declareNull("BaKapp.Movil.Tag.clfunciones");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Datos_De_Configuracion (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,222);
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
 BA.debugLineNum = 224;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png"))));
 BA.debugLineNum = 225;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(1);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png"))));
 BA.debugLineNum = 228;BA.debugLine="Wait For(Fx_Traer_Nombre_Base_De_Datos) Complete";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_traer_nombre_base_de_datos" /*RemoteObject*/ ));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 230;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 231;BA.debugLine="Msgbox2Async(\"Falta la configuración de la Base";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Falta la configuración de la Base de datos Bakapp en TABCARAC")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 232;BA.debugLine="Return 0";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 236;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion) Comple";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_cargar_configuracion_estacion" /*RemoteObject*/ ));
this.state = 34;
return;
case 34:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 238;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 239;BA.debugLine="Msgbox2Async(\"El dispositivo no esta registrado";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("El dispositivo no esta registrado en la base de datos"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Id del dispositivo: "),parent._variables._global_iddispositivo /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 241;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 35;
return;
case 35:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 242;BA.debugLine="Return 0";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 246;BA.debugLine="Log(\"3.- Iniciamos la sesion\")";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","67405592",RemoteObject.createImmutable("3.- Iniciamos la sesion"),0);
 BA.debugLineNum = 248;BA.debugLine="Variables.Global_Sesion_Star = True";
Debug.ShouldStop(8388608);
parent._variables._global_sesion_star /*RemoteObject*/  = parent.__c.getField(true,"True");
 BA.debugLineNum = 250;BA.debugLine="Dim Usar_Datos_X_Defecto As Boolean = Variables.G";
Debug.ShouldStop(33554432);
_usar_datos_x_defecto = BA.ObjectToBoolean(parent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Usar_Datos_X_Defecto")))));Debug.locals.put("Usar_Datos_X_Defecto", _usar_datos_x_defecto);Debug.locals.put("Usar_Datos_X_Defecto", _usar_datos_x_defecto);
 BA.debugLineNum = 251;BA.debugLine="Dim Empresa_X_Defecto As String = Variables.Globa";
Debug.ShouldStop(67108864);
_empresa_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Empresa_X_Defecto")))));Debug.locals.put("Empresa_X_Defecto", _empresa_x_defecto);Debug.locals.put("Empresa_X_Defecto", _empresa_x_defecto);
 BA.debugLineNum = 252;BA.debugLine="Dim Usuario_X_Defecto As String = Funciones.LTrim";
Debug.ShouldStop(134217728);
_usuario_x_defecto = parent._funciones.runMethod(true,"_ltrim" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(BA.ObjectToString(parent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Usuario_X_Defecto")))))));Debug.locals.put("Usuario_X_Defecto", _usuario_x_defecto);Debug.locals.put("Usuario_X_Defecto", _usuario_x_defecto);
 BA.debugLineNum = 253;BA.debugLine="Dim Modalidad_X_Defecto As String= Variables.Glob";
Debug.ShouldStop(268435456);
_modalidad_x_defecto = BA.ObjectToString(parent._variables._global_row_estacionbk /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Modalidad_X_Defecto")))));Debug.locals.put("Modalidad_X_Defecto", _modalidad_x_defecto);Debug.locals.put("Modalidad_X_Defecto", _modalidad_x_defecto);
 BA.debugLineNum = 255;BA.debugLine="If Usuario_X_Defecto = \"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_usuario_x_defecto,BA.ObjectToString(""))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 256;BA.debugLine="Msgbox2Async(\"Falta el usuario por defecto\"  & C";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Falta el usuario por defecto"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Id del dispositivo: "),parent._variables._global_iddispositivo /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 258;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 36;
return;
case 36:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 259;BA.debugLine="Return 0";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 263;BA.debugLine="Wait For(Fx_Traer_Usuario_Por_Defecto(Usuario_X_D";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_traer_usuario_por_defecto" /*RemoteObject*/ ,(Object)(_usuario_x_defecto)));
this.state = 37;
return;
case 37:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 265;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(256);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 266;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(512);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png"))));
 BA.debugLineNum = 267;BA.debugLine="Msgbox2Async(\"El usuario no existe.\"  & CRLF & _";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("El usuario no existe."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Usuario: "),_usuario_x_defecto))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 269;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 38;
return;
case 38:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 270;BA.debugLine="Return 0";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 274;BA.debugLine="Wait For(Fx_Cargar_Listas_Precios_Por_Usuario(Usu";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_cargar_listas_precios_por_usuario" /*RemoteObject*/ ,(Object)(_usuario_x_defecto)));
this.state = 39;
return;
case 39:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 276;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 277;BA.debugLine="Msgbox2Async(\"El usuario no posee permisos para";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("El usuario no posee permisos para ninguna lista de precios en Random."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Usuario: "),_usuario_x_defecto))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 279;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 40;
return;
case 40:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 280;BA.debugLine="Return 0";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 284;BA.debugLine="Wait For(Fx_Cargar_Configuracion_Estacion_Y_Gener";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_cargar_configuracion_estacion_y_general" /*RemoteObject*/ ,(Object)(_empresa_x_defecto),(Object)(_modalidad_x_defecto)));
this.state = 41;
return;
case 41:
//C
this.state = 21;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 286;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 287;BA.debugLine="Msgbox2Async(\"No se reconoce la modalidad para e";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se reconoce la modalidad para el dispositivo. Modalidad:"),_modalidad_x_defecto,parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Id del dispositivo: "),parent._variables._global_iddispositivo /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 289;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 42;
return;
case 42:
//C
this.state = 24;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 290;BA.debugLine="Return 0";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 295;BA.debugLine="Wait For(Sb_Cargar_Modedas) Complete (Result As I";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_sb_cargar_modedas" /*RemoteObject*/ ));
this.state = 43;
return;
case 43:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 297;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(256);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 301;BA.debugLine="Return 0";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 305;BA.debugLine="Wait For(Sb_Revisar_Carptea_Tmp_Servidor) Complet";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_sb_revisar_carptea_tmp_servidor" /*RemoteObject*/ ));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_resulttmp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ResultTmp", _resulttmp);
;
 BA.debugLineNum = 307;BA.debugLine="If Not(ResultTmp) Then";
Debug.ShouldStop(262144);
if (true) break;

case 29:
//if
this.state = 32;
if (parent.__c.runMethod(true,"Not",(Object)(_resulttmp)).<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 308;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(524288);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png"))));
 BA.debugLineNum = 309;BA.debugLine="Msgbox2Async(vError, \"Validación\", \"Ok\", \"\", \"\",";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(__ref.getField(true,"_verror" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 310;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), null);
this.state = 45;
return;
case 45:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 311;BA.debugLine="Return 2";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((2)));return;};
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 314;BA.debugLine="Dim CLFx As ClFunciones";
Debug.ShouldStop(33554432);
_clfx = RemoteObject.createNew ("BaKapp.Movil.Tag.clfunciones");Debug.locals.put("CLFx", _clfx);
 BA.debugLineNum = 315;BA.debugLine="CLFx.Initialize";
Debug.ShouldStop(67108864);
_clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 317;BA.debugLine="Wait For(CLFx.Sb_ExisteTabla(\"@WMS_GATEWAY_STOCK\"";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), _clfx.runClassMethod (BaKapp.Movil.Tag.clfunciones.class, "_sb_existetabla" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("@WMS_GATEWAY_STOCK"))));
this.state = 46;
return;
case 46:
//C
this.state = -1;
_resulttmp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ResultTmp", _resulttmp);
;
 BA.debugLineNum = 318;BA.debugLine="Variables.Global_ExisteTabla_MS_GATEWAY_STOCK = R";
Debug.ShouldStop(536870912);
parent._variables._global_existetabla_ms_gateway_stock /*RemoteObject*/  = _resulttmp;
 BA.debugLineNum = 321;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_DocDestino)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_cargar_sis_despachosimple_docdestino" /*RemoteObject*/ ));
this.state = 47;
return;
case 47:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 322;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_Tipo) Compl";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_cargar_sis_despachosimple_tipo" /*RemoteObject*/ ));
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 323;BA.debugLine="Wait For(Fx_Cargar_Sis_DespachoSimple_TipoPago) C";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_datos_de_configuracion"), __ref.runClassMethod (BaKapp.Movil.Tag.conectar_conf.class, "_fx_cargar_sis_despachosimple_tipopago" /*RemoteObject*/ ));
this.state = 49;
return;
case 49:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 325;BA.debugLine="Return 1";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((1)));return;};
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _sb_cargar_modedas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Modedas (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("sb_cargar_modedas")) { return __ref.runUserSub(false, "conectar_conf","sb_cargar_modedas", __ref);}
ResumableSub_Sb_Cargar_Modedas rsub = new ResumableSub_Sb_Cargar_Modedas(null,__ref);
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
public static class ResumableSub_Sb_Cargar_Modedas extends BA.ResumableSub {
public ResumableSub_Sb_Cargar_Modedas(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Modedas (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,329);
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
 BA.debugLineNum = 331;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(1024);
parent._consulta_sql = RemoteObject.createImmutable("");__ref.setField("_consulta_sql",parent._consulta_sql);
 BA.debugLineNum = 333;BA.debugLine="Consulta_Sql = \"Select TOP 1 * From TABMO Where K";
Debug.ShouldStop(4096);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select TOP 1 * From TABMO Where KOMO = '$'"));
 BA.debugLineNum = 335;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(16384);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 336;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_modedas"), (_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 340;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 20;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 342;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(2097152);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 344;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 346;BA.debugLine="Variables.Global_Row_Moneda = Funciones.Fx_Data";
Debug.ShouldStop(33554432);
parent._variables._global_row_moneda /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 348;BA.debugLine="Consulta_Sql = $\"Select TOP 1 * From MAEMO Wher";
Debug.ShouldStop(134217728);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,(RemoteObject.createImmutable("Select TOP 1 * From MAEMO Where KOMO = 'US$' AND CAST(FEMO AS DATE) = CAST(GETDATE() AS DATE)Order by IDMAEMO DESC")));
 BA.debugLineNum = 350;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_G";
Debug.ShouldStop(536870912);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 351;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_modedas"), (_js));
this.state = 22;
return;
case 22:
//C
this.state = 7;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 353;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 16;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 355;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(4);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 357;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(16);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 359;BA.debugLine="Variables.Global_Row_Dolar = Funciones.Fx_Dat";
Debug.ShouldStop(64);
parent._variables._global_row_dolar /*RemoteObject*/  = parent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 361;BA.debugLine="Return 1";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((1)));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 369;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(65536);
parent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",parent._bmp1);
 BA.debugLineNum = 371;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(262144);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png"))));
 BA.debugLineNum = 373;BA.debugLine="Msgbox2Async(\"No existe tasa de cambio del dol";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No existe tasa de cambio del dolar del hoy")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 374;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_modedas"), null);
this.state = 23;
return;
case 23:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 375;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","67471150",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
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
 BA.debugLineNum = 385;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(1);
parent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_bmp1",parent._bmp1);
 BA.debugLineNum = 387;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"user.png\")";
Debug.ShouldStop(4);
__ref.setField ("_bmp1" /*RemoteObject*/ ,parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user.png"))));
 BA.debugLineNum = 389;BA.debugLine="Msgbox2Async(\"Error al buscar la moneda $\", \"Val";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error al buscar la moneda $")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_bmp1" /*RemoteObject*/ )),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 390;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_cargar_modedas"), null);
this.state = 24;
return;
case 24:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 391;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","67471166",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 395;BA.debugLine="Return 0";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _sb_probar_conexion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Probar_Conexion (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("sb_probar_conexion")) { __ref.runUserSub(false, "conectar_conf","sb_probar_conexion", __ref); return;}
ResumableSub_Sb_Probar_Conexion rsub = new ResumableSub_Sb_Probar_Conexion(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Probar_Conexion extends BA.ResumableSub {
public ResumableSub_Sb_Probar_Conexion(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Probar_Conexion (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,512);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 514;BA.debugLine="Consulta_Sql = \"Select Top 1 EMPRESA From CONFIES";
Debug.ShouldStop(2);
__ref.setField ("_consulta_sql" /*RemoteObject*/ ,BA.ObjectToString("Select Top 1 EMPRESA From CONFIES"));
 BA.debugLineNum = 516;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(8);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(true,"_consulta_sql" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 517;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_probar_conexion"), (_js));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 519;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 521;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(256);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 522;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 523;BA.debugLine="Estado = \"Conectado\"";
Debug.ShouldStop(1024);
__ref.setField ("_estado" /*RemoteObject*/ ,BA.ObjectToString("Conectado"));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 526;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 527;BA.debugLine="Estado = \"Desconectado\"";
Debug.ShouldStop(16384);
__ref.setField ("_estado" /*RemoteObject*/ ,BA.ObjectToString("Desconectado"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static RemoteObject  _sb_revisar_carptea_tmp_servidor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_Carptea_Tmp_Servidor (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("sb_revisar_carptea_tmp_servidor")) { return __ref.runUserSub(false, "conectar_conf","sb_revisar_carptea_tmp_servidor", __ref);}
ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor rsub = new ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor(null,__ref);
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
public static class ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor extends BA.ResumableSub {
public ResumableSub_Sb_Revisar_Carptea_Tmp_Servidor(BaKapp.Movil.Tag.conectar_conf parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
BaKapp.Movil.Tag.conectar_conf parent;
RemoteObject _existeruta = RemoteObject.createImmutable(false);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_Carptea_Tmp_Servidor (conectar_conf) ","conectar_conf",9,__ref.getField(false, "ba"),__ref,399);
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
 BA.debugLineNum = 401;BA.debugLine="Dim ExisteRuta As Boolean";
Debug.ShouldStop(65536);
_existeruta = RemoteObject.createImmutable(false);Debug.locals.put("ExisteRuta", _existeruta);
 BA.debugLineNum = 402;BA.debugLine="vError = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_verror" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 404;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Rev";
Debug.ShouldStop(524288);
_js = parent._funciones.runMethod(false,"_fx_httjob_ws_sb_revcarpetatmp" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(__ref));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 405;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "conectar_conf", "sb_revisar_carptea_tmp_servidor"), (_js));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 408;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 410;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(33554432);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 412;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 414;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(536870912);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA"),(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 415;BA.debugLine="Dim Fila As Map = Filas.Get(0)";
Debug.ShouldStop(1073741824);
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Fila", _fila);Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 417;BA.debugLine="ExisteRuta = Fila.Get(\"ExisteRuta\")";
Debug.ShouldStop(1);
_existeruta = BA.ObjectToBoolean(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExisteRuta")))));Debug.locals.put("ExisteRuta", _existeruta);
 BA.debugLineNum = 418;BA.debugLine="vError = Fila.Get(\"Error\")";
Debug.ShouldStop(2);
__ref.setField ("_verror" /*RemoteObject*/ ,BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error"))))));
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
 BA.debugLineNum = 424;BA.debugLine="Return ExisteRuta";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_existeruta));return;};
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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