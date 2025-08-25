package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class buscar_productos_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,49);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"Buscador\")";
Debug.ShouldStop(2097152);
buscar_productos.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Buscador")),buscar_productos.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="Activity.Title = \"BUSCAR PRODUCTOS\"";
Debug.ShouldStop(4194304);
buscar_productos.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("BUSCAR PRODUCTOS"));
 BA.debugLineNum = 57;BA.debugLine="Msj.Initialize";
Debug.ShouldStop(16777216);
buscar_productos._msj.runClassMethod (BaKapp.Movil.Tag.mensajes.class, "_initialize" /*RemoteObject*/ ,buscar_productos.processBA);
 BA.debugLineNum = 58;BA.debugLine="Txt_Codigo_Descripcion.RequestFocus";
Debug.ShouldStop(33554432);
buscar_productos.mostCurrent._txt_codigo_descripcion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 61;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Codigo_Descripcion)";
Debug.ShouldStop(268435456);
buscar_productos.mostCurrent._tecladosoft.runVoidMethod ("ShowKeyboard",(Object)((buscar_productos.mostCurrent._txt_codigo_descripcion.getObject())));
 BA.debugLineNum = 62;BA.debugLine="B4XLoading.Hide";
Debug.ShouldStop(536870912);
buscar_productos.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="Txt_Codigo_Descripcion.Text = ProductoABuscar";
Debug.ShouldStop(-2147483648);
buscar_productos.mostCurrent._txt_codigo_descripcion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(buscar_productos._productoabuscar));
 BA.debugLineNum = 66;BA.debugLine="If Txt_Codigo_Descripcion.Text <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 67;BA.debugLine="Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,T";
Debug.ShouldStop(4);
_sb_buscar_producto(buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"),buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"));
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,76);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,72);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","activity_resume");}
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Fila = Null";
Debug.ShouldStop(256);
buscar_productos._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), buscar_productos.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_buscar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Buscar_Click (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,175);
if (RapidSub.canDelegate("btn_buscar_click")) { return BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","btn_buscar_click");}
 BA.debugLineNum = 175;BA.debugLine="Sub Btn_Buscar_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Tx";
Debug.ShouldStop(32768);
_sb_buscar_producto(buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"),buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_seleccionar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Seleccionar_Click (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,238);
if (RapidSub.canDelegate("btn_seleccionar_click")) { BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","btn_seleccionar_click"); return;}
ResumableSub_Btn_Seleccionar_Click rsub = new ResumableSub_Btn_Seleccionar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Seleccionar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Seleccionar_Click(BaKapp.Movil.Tag.buscar_productos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.buscar_productos parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _errorstr = RemoteObject.createImmutable("");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _stockbodega = RemoteObject.createImmutable(0);
RemoteObject _vstock = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fechaemision = RemoteObject.createImmutable(0L);
RemoteObject _id_docdet = RemoteObject.createImmutable(0);
RemoteObject _fila_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Seleccionar_Click (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,238);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 240;BA.debugLine="Dim Btn As Button = Sender";
Debug.ShouldStop(32768);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",buscar_productos.mostCurrent.activityBA));Debug.locals.put("Btn", _btn);Debug.locals.put("Btn", _btn);
 BA.debugLineNum = 241;BA.debugLine="Dim Codigo As String = Btn.Tag";
Debug.ShouldStop(65536);
_codigo = BA.ObjectToString(_btn.runMethod(false,"getTag"));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 243;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(262144);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_productos_json" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(buscar_productos.getObject()),(Object)(_codigo),(Object)(parent.mostCurrent._empresa),(Object)(parent.mostCurrent._sucursal),(Object)(parent.mostCurrent._bodega),(Object)(parent._lista),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 245;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", buscar_productos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_productos", "btn_seleccionar_click"), (_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 247;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 249;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 251;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 253;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(268435456);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 254;BA.debugLine="Fila = Filas.Get(0)";
Debug.ShouldStop(536870912);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 256;BA.debugLine="Dim ErrorStr As String =Fila.Get(\"Error\")";
Debug.ShouldStop(-2147483648);
_errorstr = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("ErrorStr", _errorstr);Debug.locals.put("ErrorStr", _errorstr);
 BA.debugLineNum = 258;BA.debugLine="If ErrorStr = Null Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 259;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 260;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-canc";
Debug.ShouldStop(8);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 261;BA.debugLine="Msgbox2Async(ErrorStr,\"Problema al traer el pr";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_errorstr)),(Object)(BA.ObjectToCharSequence("Problema al traer el producto")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1),buscar_productos.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 262;BA.debugLine="Fila = Null";
Debug.ShouldStop(32);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 263;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 266;BA.debugLine="Dim Codigo As String = Fila.Get(\"Codigo\")";
Debug.ShouldStop(512);
_codigo = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Codigo")))));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 267;BA.debugLine="Log(Codigo)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22097181",_codigo,0);
 BA.debugLineNum = 268;BA.debugLine="Dim Descripcion As String = Fila.Get(\"Descripci";
Debug.ShouldStop(2048);
_descripcion = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descripcion")))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 269;BA.debugLine="Dim StockBodega As Double  = Fila.Get(\"StockBod";
Debug.ShouldStop(4096);
_stockbodega = BA.numberCast(double.class, parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StockBodega")))));Debug.locals.put("StockBodega", _stockbodega);Debug.locals.put("StockBodega", _stockbodega);
 BA.debugLineNum = 271;BA.debugLine="Dim vSTOCK As String = \"Stock: \" & StockBodega";
Debug.ShouldStop(16384);
_vstock = RemoteObject.concat(RemoteObject.createImmutable("Stock: "),_stockbodega);Debug.locals.put("vSTOCK", _vstock);Debug.locals.put("vSTOCK", _vstock);
 BA.debugLineNum = 273;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma";
Debug.ShouldStop(65536);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",buscar_productos.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¿Confirma la selección?"),parent.mostCurrent.__c.getField(true,"CRLF"),_descripcion,parent.mostCurrent.__c.getField(true,"CRLF"),_vstock))),(Object)(BA.ObjectToCharSequence(_codigo)),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("NO")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 274;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", buscar_productos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_productos", "btn_seleccionar_click"), _sf);
this.state = 22;
return;
case 22:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 278;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2097152);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 280;BA.debugLine="Fila.Put(\"Id_DocEnc\",Frm_Post_01_Formulario.Id";
Debug.ShouldStop(8388608);
parent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((parent.mostCurrent._frm_post_01_formulario._id_docenc /*RemoteObject*/ )));
 BA.debugLineNum = 282;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc";
Debug.ShouldStop(33554432);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 284;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Orde";
Debug.ShouldStop(134217728);
parent._consulta_sql = BA.ObjectToString("Select * From Detalle_Doc Order by Id_DocDet Desc");
 BA.debugLineNum = 285;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variab";
Debug.ShouldStop(268435456);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 287;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 290;BA.debugLine="Dim FechaEmision As Long = DateTime.Now";
Debug.ShouldStop(2);
_fechaemision = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("FechaEmision", _fechaemision);Debug.locals.put("FechaEmision", _fechaemision);
 BA.debugLineNum = 292;BA.debugLine="New_Row.Put(\"fechaemision\",FechaEmision)";
Debug.ShouldStop(8);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fechaemision"))),(Object)((_fechaemision)));
 BA.debugLineNum = 293;BA.debugLine="New_Row.Put(\"fecharecepcion\",FechaEmision)";
Debug.ShouldStop(16);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fecharecepcion"))),(Object)((_fechaemision)));
 BA.debugLineNum = 295;BA.debugLine="New_Row.Put(\"moneda\",Variables.Global_Row_Mone";
Debug.ShouldStop(64);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 296;BA.debugLine="New_Row.Put(\"tipo_moneda\",Variables.Global_Row";
Debug.ShouldStop(128);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 297;BA.debugLine="New_Row.Put(\"tipo_cambio\",Variables.Global_Row";
Debug.ShouldStop(256);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 298;BA.debugLine="New_Row.Put(\"codlista\",Lista)";
Debug.ShouldStop(512);
_new_row.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codlista"))),(Object)((parent._lista)));
 BA.debugLineNum = 300;BA.debugLine="Dim Id_DocDet As Int = New_Row.Get(\"id_docdet\"";
Debug.ShouldStop(2048);
_id_docdet = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));Debug.locals.put("Id_DocDet", _id_docdet);Debug.locals.put("Id_DocDet", _id_docdet);
 BA.debugLineNum = 302;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet Fro";
Debug.ShouldStop(8192);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),_id_docdet);
 BA.debugLineNum = 303;BA.debugLine="Dim Fila_Id As Map = DBUtils.ExecuteMap(Variab";
Debug.ShouldStop(16384);
_fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_id = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Id", _fila_id);Debug.locals.put("Fila_Id", _fila_id);
 BA.debugLineNum = 305;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_";
Debug.ShouldStop(65536);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_new_row),(Object)(_fila_id));
 BA.debugLineNum = 307;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(262144);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 309;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"";
Debug.ShouldStop(1048576);
parent.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 310;BA.debugLine="StartActivity(Frm_Post_01_Producto)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",buscar_productos.processBA,(Object)((parent.mostCurrent._frm_post_01_producto.getObject())));
 BA.debugLineNum = 312;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 317;BA.debugLine="Fila = Null";
Debug.ShouldStop(268435456);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 321;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","22097235",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 324;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
buscar_productos.mostCurrent._empresa = buscar_productos.mostCurrent._variables._gl_empresa /*RemoteObject*/ ;
 //BA.debugLineNum = 24;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
buscar_productos.mostCurrent._sucursal = buscar_productos.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ;
 //BA.debugLineNum = 25;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
buscar_productos.mostCurrent._bodega = buscar_productos.mostCurrent._variables._gl_bodega /*RemoteObject*/ ;
 //BA.debugLineNum = 28;BA.debugLine="Private Txt_Codigo_Descripcion As EditText";
buscar_productos.mostCurrent._txt_codigo_descripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Btn_Buscar As Button";
buscar_productos.mostCurrent._btn_buscar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Public Id_DocEnc As Int";
buscar_productos._id_docenc = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 33;BA.debugLine="Dim TecladoSoft As IME ' biblioteca IME";
buscar_productos.mostCurrent._tecladosoft = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 34;BA.debugLine="Dim xui As XUI";
buscar_productos.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 36;BA.debugLine="Private XclvDetalle As CustomListView";
buscar_productos.mostCurrent._xclvdetalle = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 37;BA.debugLine="Private Lbl_Codigo As B4XView";
buscar_productos.mostCurrent._lbl_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_CodTecnico As B4XView";
buscar_productos.mostCurrent._lbl_codtecnico = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Descripcion As B4XView";
buscar_productos.mostCurrent._lbl_descripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_Datos As B4XView";
buscar_productos.mostCurrent._lbl_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Btn_Seleccionar As B4XView";
buscar_productos.mostCurrent._btn_seleccionar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Img_Eliminar As B4XImageView";
buscar_productos.mostCurrent._img_eliminar = RemoteObject.createNew ("BaKapp.Movil.Tag.b4ximageview");
 //BA.debugLineNum = 45;BA.debugLine="Private B4XLoading As B4XLoadingIndicator";
buscar_productos.mostCurrent._b4xloading = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xloadingindicator");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _lv_productos_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Lv_Productos_ItemLongClick (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,179);
if (RapidSub.canDelegate("lv_productos_itemlongclick")) { BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","lv_productos_itemlongclick", _position, _value); return;}
ResumableSub_Lv_Productos_ItemLongClick rsub = new ResumableSub_Lv_Productos_ItemLongClick(null,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Lv_Productos_ItemLongClick extends BA.ResumableSub {
public ResumableSub_Lv_Productos_ItemLongClick(BaKapp.Movil.Tag.buscar_productos parent,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.buscar_productos parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _stockbodega = RemoteObject.createImmutable(0);
RemoteObject _vstock = RemoteObject.createImmutable("");
RemoteObject _vsalir = RemoteObject.createImmutable(0);
RemoteObject _new_row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Lv_Productos_ItemLongClick (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,179);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 181;BA.debugLine="Dim Empresa As String = Variables.Gl_Empresa";
Debug.ShouldStop(1048576);
parent.mostCurrent._empresa = parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ;
 BA.debugLineNum = 182;BA.debugLine="Dim Sucursal As String = Variables.Gl_Sucursal";
Debug.ShouldStop(2097152);
parent.mostCurrent._sucursal = parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ;
 BA.debugLineNum = 183;BA.debugLine="Dim Bodega As String = Variables.Gl_Bodega";
Debug.ShouldStop(4194304);
parent.mostCurrent._bodega = parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ ;
 BA.debugLineNum = 184;BA.debugLine="Dim Lista As String = Variables.Gl_Lista_Precios";
Debug.ShouldStop(8388608);
parent._lista = parent.mostCurrent._variables._gl_lista_precios /*RemoteObject*/ ;
 BA.debugLineNum = 186;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(33554432);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_productos_json" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(buscar_productos.getObject()),(Object)(BA.ObjectToString(_value)),(Object)(parent.mostCurrent._empresa),(Object)(parent.mostCurrent._sucursal),(Object)(parent.mostCurrent._bodega),(Object)(parent._lista),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 188;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", buscar_productos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_productos", "lv_productos_itemlongclick"), (_js));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 190;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 16;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 192;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(-2147483648);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 194;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(2);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 196;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.G";
Debug.ShouldStop(8);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 197;BA.debugLine="Fila =Filas.Get(0)";
Debug.ShouldStop(16);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 199;BA.debugLine="Dim Codigo As String = Fila.Get(\"Codigo\")";
Debug.ShouldStop(64);
_codigo = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Codigo")))));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 200;BA.debugLine="Log(Codigo)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21966101",_codigo,0);
 BA.debugLineNum = 201;BA.debugLine="Dim Descripcion As String = Fila.Get(\"Descripci";
Debug.ShouldStop(256);
_descripcion = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descripcion")))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 202;BA.debugLine="Dim StockBodega As Double  = Fila.Get(\"StockBod";
Debug.ShouldStop(512);
_stockbodega = BA.numberCast(double.class, parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StockBodega")))));Debug.locals.put("StockBodega", _stockbodega);Debug.locals.put("StockBodega", _stockbodega);
 BA.debugLineNum = 204;BA.debugLine="Dim vSTOCK As String = \"Stock: \" & StockBodega";
Debug.ShouldStop(2048);
_vstock = RemoteObject.concat(RemoteObject.createImmutable("Stock: "),_stockbodega);Debug.locals.put("vSTOCK", _vstock);Debug.locals.put("vSTOCK", _vstock);
 BA.debugLineNum = 206;BA.debugLine="Private vSalir As Int";
Debug.ShouldStop(8192);
_vsalir = RemoteObject.createImmutable(0);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 207;BA.debugLine="vSalir = Msgbox2(\"¿Confirma la selección?\" & CR";
Debug.ShouldStop(16384);
_vsalir = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("¿Confirma la selección?"),parent.mostCurrent.__c.getField(true,"CRLF"),_descripcion,parent.mostCurrent.__c.getField(true,"CRLF"),_vstock))),(Object)(BA.ObjectToCharSequence(_codigo)),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),buscar_productos.mostCurrent.activityBA);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 209;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_vsalir,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 211;BA.debugLine="Fila.Put(\"Id_DocEnc\",Frm_Post_01_Formulario.Id";
Debug.ShouldStop(262144);
parent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Id_DocEnc"))),(Object)((parent.mostCurrent._frm_post_01_formulario._id_docenc /*RemoteObject*/ )));
 BA.debugLineNum = 213;BA.debugLine="DBUtils.InsertMaps(Variables.vSql,\"Detalle_Doc";
Debug.ShouldStop(1048576);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(_filas));
 BA.debugLineNum = 215;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Orde";
Debug.ShouldStop(4194304);
parent._consulta_sql = BA.ObjectToString("Select * From Detalle_Doc Order by Id_DocDet Desc");
 BA.debugLineNum = 217;BA.debugLine="Dim New_Row As Map = DBUtils.ExecuteMap(Variab";
Debug.ShouldStop(16777216);
_new_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_new_row = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("New_Row", _new_row);Debug.locals.put("New_Row", _new_row);
 BA.debugLineNum = 219;BA.debugLine="Frm_Post_01_Producto.Id_DocDet = New_Row.Get(\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._frm_post_01_producto._id_docdet /*RemoteObject*/  = BA.numberCast(int.class, _new_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 220;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 223;BA.debugLine="Fila = Null";
Debug.ShouldStop(1073741824);
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 229;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21966130",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Consulta_Sql As String";
buscar_productos._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public Fila As Map";
buscar_productos._fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="Public Lista As String";
buscar_productos._lista = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public ProductoABuscar As String";
buscar_productos._productoabuscar = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public Msj As Mensajes";
buscar_productos._msj = RemoteObject.createNew ("BaKapp.Movil.Tag.mensajes");
 //BA.debugLineNum = 15;BA.debugLine="Public VerStockOtrasBodegas As Boolean";
buscar_productos._verstockotrasbodegas = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _sb_buscar_producto(RemoteObject _vcodigo,RemoteObject _vdescripcion) throws Exception{
try {
		Debug.PushSubsStack("Sb_Buscar_Producto (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,80);
if (RapidSub.canDelegate("sb_buscar_producto")) { BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","sb_buscar_producto", _vcodigo, _vdescripcion); return;}
ResumableSub_Sb_Buscar_Producto rsub = new ResumableSub_Sb_Buscar_Producto(null,_vcodigo,_vdescripcion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Sb_Buscar_Producto extends BA.ResumableSub {
public ResumableSub_Sb_Buscar_Producto(BaKapp.Movil.Tag.buscar_productos parent,RemoteObject _vcodigo,RemoteObject _vdescripcion) {
this.parent = parent;
this._vcodigo = _vcodigo;
this._vdescripcion = _vdescripcion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.buscar_productos parent;
RemoteObject _vcodigo;
RemoteObject _vdescripcion;
RemoteObject _vcadena = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _codtecnico = RemoteObject.createImmutable("");
RemoteObject _stfi1 = RemoteObject.createImmutable(0);
RemoteObject _descripcion = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Buscar_Producto (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,80);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("VCodigo", _vcodigo);
Debug.locals.put("VDescripcion", _vdescripcion);
 BA.debugLineNum = 82;BA.debugLine="Dim vCadena As String";
Debug.ShouldStop(131072);
_vcadena = RemoteObject.createImmutable("");Debug.locals.put("vCadena", _vcadena);
 BA.debugLineNum = 84;BA.debugLine="vCadena = Funciones.Fx_Cadena_a_buscar_SQL(VDescr";
Debug.ShouldStop(524288);
_vcadena = parent.mostCurrent._funciones.runMethod(true,"_fx_cadena_a_buscar_sql" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(_vdescripcion),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Mp.KOPR+Mp.NOKOPR"),RemoteObject.createImmutable(" LIKE '%"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("vCadena", _vcadena);
 BA.debugLineNum = 86;BA.debugLine="XclvDetalle.Clear";
Debug.ShouldStop(2097152);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_clear");
 BA.debugLineNum = 87;BA.debugLine="B4XLoading.Show";
Debug.ShouldStop(4194304);
parent.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="Consulta_Sql = \"SELECT TOP (100) Mp.KOPR AS CODIG";
Debug.ShouldStop(16777216);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,Isnull(Ms.STFI1,0) As STFI1,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEPR Mp With (Nolock)"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join MAEST Ms On Ms.EMPRESA = '"),parent.mostCurrent._empresa,RemoteObject.createImmutable("' And Ms.KOSU = '"),parent.mostCurrent._sucursal,RemoteObject.createImmutable("' AND Ms.KOBO = '"),parent.mostCurrent._bodega,RemoteObject.createImmutable("' AND Mp.KOPR = Ms.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join TABBOPR Tb On Tb.EMPRESA = '"),parent.mostCurrent._empresa,RemoteObject.createImmutable("' And Tb.KOSU = '"),parent.mostCurrent._sucursal,RemoteObject.createImmutable("' AND Tb.KOBO = '"),parent.mostCurrent._bodega,RemoteObject.createImmutable("' AND Tb.KOPR = Ms.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("WHERE Mp.KOPR+Mp.NOKOPR  Like '%"),_vcadena,RemoteObject.createImmutable("%'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order by Mp.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Option ( Fast 20 )"));
 BA.debugLineNum = 102;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 104;BA.debugLine="Consulta_Sql = \"SELECT TOP (100) Mp.KOPR AS CODI";
Debug.ShouldStop(128);
parent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("SELECT TOP (100) Mp.KOPR AS CODIGO,Mp.KOPRTE As CODTECNICO, NOKOPR AS DESCRIPCION,MRPR,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Case When '"),parent.mostCurrent._bodega.runMethod(true,"trim"),RemoteObject.createImmutable("' = '01' Then Isnull(Ms.STOCK_ALAMEDA,0) When '"),parent.mostCurrent._bodega.runMethod(true,"trim"),RemoteObject.createImmutable("' = '02' Then Isnull(Ms.STOCK_ENEA,0) Else 0 End As STFI1"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("--,Isnull((Select Top 1 KOPRAL From TABCODAL Tcd Where Mp.KOPR = Tcd.KOPR),'') As KOPRAL,Isnull(DATOSUBIC,'') As DATOSUBIC"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEPR Mp With (Nolock)"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join [@WMS_GATEWAY_STOCK] Ms On Ms.SKU = Mp.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("WHERE Mp.KOPR+Mp.NOKOPR  Like '%"),_vcadena,RemoteObject.createImmutable("%'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order by Mp.KOPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Option ( Fast 20 )"));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 115;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(262144);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,buscar_productos.mostCurrent.activityBA,(Object)(parent._consulta_sql),(Object)(buscar_productos.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 116;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", buscar_productos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buscar_productos", "sb_buscar_producto"), (_js));
this.state = 19;
return;
case 19:
//C
this.state = 5;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 117;BA.debugLine="ProgressDialogShow(\"Buscando prooductos...\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",buscar_productos.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando prooductos..."))));
 BA.debugLineNum = 119;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//if
this.state = 18;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 121;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(16777216);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 123;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 125;BA.debugLine="Log(vJson)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21835053",_vjson,0);
 BA.debugLineNum = 126;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 127;BA.debugLine="parser.Initialize(vJson)";
Debug.ShouldStop(1073741824);
_parser.runVoidMethod ("Initialize",(Object)(_vjson));
 BA.debugLineNum = 128;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(-2147483648);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 129;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
Debug.ShouldStop(1);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 133;BA.debugLine="For Each Fila As Map In Table";
Debug.ShouldStop(16);
if (true) break;

case 11:
//for
this.state = 14;
parent._fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _table;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if (index20 < groupLen20) {
this.state = 13;
parent._fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));}
if (true) break;

case 21:
//C
this.state = 20;
index20++;
if (true) break;

case 13:
//C
this.state = 21;
 BA.debugLineNum = 135;BA.debugLine="Dim CODIGO As String = Fila.Get(\"CODIGO\")";
Debug.ShouldStop(64);
_codigo = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODIGO")))));Debug.locals.put("CODIGO", _codigo);Debug.locals.put("CODIGO", _codigo);
 BA.debugLineNum = 136;BA.debugLine="Dim CODTECNICO As String = Fila.Get(\"CODTECNIC";
Debug.ShouldStop(128);
_codtecnico = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CODTECNICO")))));Debug.locals.put("CODTECNICO", _codtecnico);Debug.locals.put("CODTECNICO", _codtecnico);
 BA.debugLineNum = 137;BA.debugLine="Dim STFI1 As Double  = Fila.Get(\"STFI1\")";
Debug.ShouldStop(256);
_stfi1 = BA.numberCast(double.class, parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1")))));Debug.locals.put("STFI1", _stfi1);Debug.locals.put("STFI1", _stfi1);
 BA.debugLineNum = 138;BA.debugLine="Dim DESCRIPCION As String = Fila.Get(\"DESCRIPC";
Debug.ShouldStop(512);
_descripcion = BA.ObjectToString(parent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DESCRIPCION")))));Debug.locals.put("DESCRIPCION", _descripcion);Debug.locals.put("DESCRIPCION", _descripcion);
 BA.debugLineNum = 144;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent.mostCurrent._xui.runMethod(false,"CreatePanel",buscar_productos.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 146;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._xclvdetalle.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))));
 BA.debugLineNum = 147;BA.debugLine="p.LoadLayout(\"Items_Productos\")";
Debug.ShouldStop(262144);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_Productos")),buscar_productos.mostCurrent.activityBA);
 BA.debugLineNum = 148;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(524288);
_p.runMethod(true,"setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 150;BA.debugLine="Btn_Seleccionar.Tag = CODIGO";
Debug.ShouldStop(2097152);
parent.mostCurrent._btn_seleccionar.runMethod(false,"setTag",(_codigo));
 BA.debugLineNum = 151;BA.debugLine="Lbl_Codigo.Text = CODIGO";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbl_codigo.runMethod(true,"setText",BA.ObjectToCharSequence(_codigo));
 BA.debugLineNum = 152;BA.debugLine="Lbl_CodTecnico.Text = CODTECNICO";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbl_codtecnico.runMethod(true,"setText",BA.ObjectToCharSequence(_codtecnico));
 BA.debugLineNum = 153;BA.debugLine="Lbl_Descripcion.Text = DESCRIPCION";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_descripcion.runMethod(true,"setText",BA.ObjectToCharSequence(_descripcion));
 BA.debugLineNum = 154;BA.debugLine="Lbl_Datos.Text = \"Stock: \" & STFI1 & \", Bod: \"";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbl_datos.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Stock: "),_stfi1,RemoteObject.createImmutable(", Bod: "),parent.mostCurrent._bodega)));
 BA.debugLineNum = 156;BA.debugLine="XclvDetalle.Add(p,\"\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 BA.debugLineNum = 160;BA.debugLine="Log(CODIGO & \" - \" & DESCRIPCION)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","21835088",RemoteObject.concat(_codigo,RemoteObject.createImmutable(" - "),_descripcion),0);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 164;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No se encontraron registros")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 170;BA.debugLine="B4XLoading.Hide";
Debug.ShouldStop(512);
parent.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 171;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 173;BA.debugLine="End Sub";
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
public static RemoteObject  _txt_codigo_descripcion_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("Txt_Codigo_Descripcion_EnterPressed (buscar_productos) ","buscar_productos",2,buscar_productos.mostCurrent.activityBA,buscar_productos.mostCurrent,234);
if (RapidSub.canDelegate("txt_codigo_descripcion_enterpressed")) { return BaKapp.Movil.Tag.buscar_productos.remoteMe.runUserSub(false, "buscar_productos","txt_codigo_descripcion_enterpressed");}
 BA.debugLineNum = 234;BA.debugLine="Private Sub Txt_Codigo_Descripcion_EnterPressed";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="Sb_Buscar_Producto(Txt_Codigo_Descripcion.Text,Tx";
Debug.ShouldStop(1024);
_sb_buscar_producto(buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"),buscar_productos.mostCurrent._txt_codigo_descripcion.runMethod(true,"getText"));
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}