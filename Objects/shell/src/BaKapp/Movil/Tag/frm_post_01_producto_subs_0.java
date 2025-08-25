package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_post_01_producto_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,77);
if (RapidSub.canDelegate("activity_create")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(BaKapp.Movil.Tag.frm_post_01_producto parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _firsttime;
RemoteObject _kolt = RemoteObject.createImmutable("");
RemoteObject _fl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _kolt1 = RemoteObject.createImmutable("");
RemoteObject _nokolt1 = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject group45;
int index45;
int groupLen45;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 82;BA.debugLine="Activity.LoadLayout(\"Cp_Post_01_Producto\")";
Debug.ShouldStop(131072);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cp_Post_01_Producto")),frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 83;BA.debugLine="Msj.Initialize";
Debug.ShouldStop(262144);
parent._msj.runClassMethod (BaKapp.Movil.Tag.mensajes.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.processBA);
 BA.debugLineNum = 85;BA.debugLine="FUNCIONARIO = Variables.Global_Row_Usuario_Activo";
Debug.ShouldStop(1048576);
parent.mostCurrent._funcionario = BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))));
 BA.debugLineNum = 87;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Variables.Gl_Bo";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbl_bodega.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Stock Bod. "),parent.mostCurrent._variables._gl_bodega /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="Lbl_ModoConsulta.Visible = ModoConsulta";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbl_modoconsulta.runMethod(true,"setVisible",parent._modoconsulta);
 BA.debugLineNum = 89;BA.debugLine="Btn_Aceptar.Visible = Not(ModoConsulta)";
Debug.ShouldStop(16777216);
parent.mostCurrent._btn_aceptar.runMethod(true,"setVisible",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._modoconsulta)));
 BA.debugLineNum = 91;BA.debugLine="If ModoConsulta Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._modoconsulta.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 92;BA.debugLine="Btn_Eliminar.Text = \"CERRAR\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._btn_eliminar.runMethod(true,"setText",BA.ObjectToCharSequence("CERRAR"));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 95;BA.debugLine="ChkValores = True 'Valores Netos";
Debug.ShouldStop(1073741824);
parent._chkvalores = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 97;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(1);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 98;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
Debug.ShouldStop(2);
parent.mostCurrent._fila = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 100;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
Debug.ShouldStop(8);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Detalle_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 101;BA.debugLine="Fila_Id = DBUtils.ExecuteMap(Variables.vSql,Consu";
Debug.ShouldStop(16);
parent.mostCurrent._fila_id = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 103;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From D";
Debug.ShouldStop(64);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 104;BA.debugLine="Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,Co";
Debug.ShouldStop(128);
parent.mostCurrent._fila_dscto = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 107;BA.debugLine="Consulta_Sql = \"Select * From Encabezado_Doc Wher";
Debug.ShouldStop(1024);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Encabezado_Doc Where Id_DocEnc = "),parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));
 BA.debugLineNum = 108;BA.debugLine="Fila_Enc = DBUtils.ExecuteMap(Variables.vSql,Cons";
Debug.ShouldStop(2048);
parent.mostCurrent._fila_enc = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 110;BA.debugLine="Txt_Codigo.Text = Fila.Get(\"codigo\")";
Debug.ShouldStop(8192);
parent.mostCurrent._txt_codigo.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codigo"))))));
 BA.debugLineNum = 111;BA.debugLine="Txt_Cantidad.Tag = Fila.Get(\"cantidad\")";
Debug.ShouldStop(16384);
parent.mostCurrent._txt_cantidad.runMethod(false,"setTag",parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cantidad")))));
 BA.debugLineNum = 112;BA.debugLine="Lbl_Descripcion.Text = Fila.Get(\"descripcion\")";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_descripcion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descripcion"))))));
 BA.debugLineNum = 113;BA.debugLine="Lbl_Precio.Tag = Fila.Get(\"precio\")";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_precio.runMethod(false,"setTag",parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio")))));
 BA.debugLineNum = 114;BA.debugLine="Lbl_Descuento.Tag = Fila.Get(\"descuentoporc\")";
Debug.ShouldStop(131072);
parent.mostCurrent._lbl_descuento.runMethod(false,"setTag",parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));
 BA.debugLineNum = 116;BA.debugLine="Total_Linea = Fila.Get(\"cantidad\")*Fila.Get(\"prec";
Debug.ShouldStop(524288);
parent._total_linea = RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cantidad"))))),BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio")))))}, "*",0, 0);
 BA.debugLineNum = 118;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(2097152);
if (true) break;

case 5:
//if
this.state = 10;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 119;BA.debugLine="Lbl_Total.Tag = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbl_total.runMethod(false,"setTag",parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 121;BA.debugLine="Lbl_Total.Tag = Fila.Get(\"valbrutolinea\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_total.runMethod(false,"setTag",parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valbrutolinea")))));
 if (true) break;
;
 BA.debugLineNum = 124;BA.debugLine="If Lbl_Total.Tag = Null Then";
Debug.ShouldStop(134217728);

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("n",parent.mostCurrent._lbl_total.runMethod(false,"getTag"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 125;BA.debugLine="Lbl_Total.Tag = 0";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbl_total.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 128;BA.debugLine="Lbl_Ubicacion.Text = Fila.Get(\"ubicacionbod\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbl_ubicacion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ubicacionbod"))))));
 BA.debugLineNum = 130;BA.debugLine="If Txt_Cantidad.Tag > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent.mostCurrent._txt_cantidad.runMethod(false,"getTag")),BA.numberCast(double.class, 0))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 131;BA.debugLine="Txt_Cantidad.Text = Txt_Cantidad.Tag";
Debug.ShouldStop(4);
parent.mostCurrent._txt_cantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._txt_cantidad.runMethod(false,"getTag")));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 133;BA.debugLine="Txt_Cantidad.Text = \"\"";
Debug.ShouldStop(16);
parent.mostCurrent._txt_cantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 136;BA.debugLine="Lbl_Precio.Text = \"$ \" & NumberFormat(Lbl_Precio.";
Debug.ShouldStop(128);
parent.mostCurrent._lbl_precio.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_precio.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 137;BA.debugLine="Lbl_Descuento.Text = NumberFormat(Lbl_Descuento.T";
Debug.ShouldStop(256);
parent.mostCurrent._lbl_descuento.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_descuento.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(" %"))));
 BA.debugLineNum = 138;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(Lbl_Total.Ta";
Debug.ShouldStop(512);
parent.mostCurrent._lbl_total.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_total.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 140;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Fila.Get(\"bodeg";
Debug.ShouldStop(2048);
parent.mostCurrent._lbl_bodega.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Stock Bod. "),parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bodega")))))));
 BA.debugLineNum = 141;BA.debugLine="Lbl_Stock.Text = Fila.Get(\"stockbodega\")";
Debug.ShouldStop(4096);
parent.mostCurrent._lbl_stock.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stockbodega"))))));
 BA.debugLineNum = 150;BA.debugLine="Dim Kolt As String = Fila.Get(\"codlista\") 'Funcio";
Debug.ShouldStop(2097152);
_kolt = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codlista")))));Debug.locals.put("Kolt", _kolt);Debug.locals.put("Kolt", _kolt);
 BA.debugLineNum = 152;BA.debugLine="For Each Fl As Map In Variables.Global_Listas_Pre";
Debug.ShouldStop(8388608);
if (true) break;

case 20:
//for
this.state = 27;
_fl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group45 = parent.mostCurrent._variables._global_listas_precios_usuario /*RemoteObject*/ ;
index45 = 0;
groupLen45 = group45.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Fl", _fl);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 27;
if (index45 < groupLen45) {
this.state = 22;
_fl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group45.runMethod(false,"Get",index45));Debug.locals.put("Fl", _fl);}
if (true) break;

case 48:
//C
this.state = 47;
index45++;
Debug.locals.put("Fl", _fl);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 153;BA.debugLine="Dim Kolt1 As String = Fl.Get(\"Kolt\")";
Debug.ShouldStop(16777216);
_kolt1 = BA.ObjectToString(_fl.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kolt")))));Debug.locals.put("Kolt1", _kolt1);Debug.locals.put("Kolt1", _kolt1);
 BA.debugLineNum = 154;BA.debugLine="Dim Nokolt1 As String = Fl.Get(\"Nokolt\")";
Debug.ShouldStop(33554432);
_nokolt1 = BA.ObjectToString(_fl.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nokolt")))));Debug.locals.put("Nokolt1", _nokolt1);Debug.locals.put("Nokolt1", _nokolt1);
 BA.debugLineNum = 155;BA.debugLine="If Kolt = Kolt1 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_kolt,_kolt1)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 156;BA.debugLine="Lbl_ListaPrecio.Text = Nokolt1";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbl_listaprecio.runMethod(true,"setText",BA.ObjectToCharSequence(_nokolt1));
 BA.debugLineNum = 157;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
this.state = 27;
if (true) break;
 if (true) break;

case 26:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("Fl", _fl);
;
 BA.debugLineNum = 164;BA.debugLine="Consulta_Sql = \"Select Mp.*,Mr.*,Cast(Case When C";
Debug.ShouldStop(8);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Mp.*,Mr.*,Cast(Case When Crz.CodigoTabla Is Null Then 0 Else 1 End As Bit) As Acepta_Dscto_Marca,Isnull(Crz.Porcentaje,0) As Dscto_Marca"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEPR Mp"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join TABMR Mr On Mp.MRPR = Mr.KOMR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join "),parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_TablaDeCaracterizaciones Crz On Crz.Tabla = 'DSCTO_MARCA' And Crz.NombreTabla = 'MRPR' And Crz.CodigoTabla = Mp.MRPR"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where Mp.KOPR = '"),parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codigo")))),RemoteObject.createImmutable("'"));
 BA.debugLineNum = 170;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(512);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(frm_post_01_producto.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 172;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "activity_create"), (_js));
this.state = 49;
return;
case 49:
//C
this.state = 28;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 174;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 28:
//if
this.state = 35;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 176;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(32768);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 178;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(131072);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 180;BA.debugLine="RowProducto = Funciones.Fx_DataRow(Js.GetString";
Debug.ShouldStop(524288);
parent.mostCurrent._rowproducto = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));
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
 BA.debugLineNum = 186;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(33554432);
parent._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 188;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Tra";
Debug.ShouldStop(134217728);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_traer_descuentos_seteados_desde_lista" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.getObject()),(Object)(parent.mostCurrent._variables._gl_empresa /*RemoteObject*/ ),(Object)(parent.mostCurrent._variables._gl_sucursal /*RemoteObject*/ ),(Object)(parent.mostCurrent._txt_codigo.runMethod(true,"getText")),(Object)(_kolt),(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("poriva")))))),(Object)(BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("porila")))))),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent.__c.getField(true,"True")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 199;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "activity_create"), (_js));
this.state = 50;
return;
case 50:
//C
this.state = 36;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 201;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 36:
//if
this.state = 43;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 203;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1024);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 205;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(4096);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 207;BA.debugLine="TblDescuentos = Funciones.Fx_DataTable(vJson)";
Debug.ShouldStop(16384);
parent.mostCurrent._tbldescuentos = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_vjson));
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 BA.debugLineNum = 214;BA.debugLine="If Txt_Cantidad.Text = \"\" Then";
Debug.ShouldStop(2097152);

case 43:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._txt_cantidad.runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 215;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Cantidad)";
Debug.ShouldStop(4194304);
parent.mostCurrent._tecladosoft.runVoidMethod ("ShowKeyboard",(Object)((parent.mostCurrent._txt_cantidad.getObject())));
 if (true) break;

case 46:
//C
this.state = -1;
;
 BA.debugLineNum = 218;BA.debugLine="Cl_PermisoX.Initialize(Null,\"\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 219;BA.debugLine="Cl_PermisoX.DesignerCreateView(Activity,Null,Null";
Debug.ShouldStop(67108864);
parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_designercreateview" /*RemoteObject*/ ,(Object)((parent.mostCurrent._activity.getObject())),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 222;BA.debugLine="TecladoSoft.HideKeyboard";
Debug.ShouldStop(536870912);
parent.mostCurrent._tecladosoft.runVoidMethod ("HideKeyboard",frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 224;BA.debugLine="Procesar_Dscto = False";
Debug.ShouldStop(-2147483648);
parent._procesar_dscto = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 226;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,262);
if (RapidSub.canDelegate("activity_keypress")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","activity_keypress", _keycode);}
RemoteObject _vsalir = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 262;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 264;BA.debugLine="Private vSalir As Int";
Debug.ShouldStop(128);
_vsalir = RemoteObject.createImmutable(0);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 266;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, frm_post_01_producto.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 268;BA.debugLine="If ModoConsulta Then";
Debug.ShouldStop(2048);
if (frm_post_01_producto._modoconsulta.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 269;BA.debugLine="ModoConsulta = False";
Debug.ShouldStop(4096);
frm_post_01_producto._modoconsulta = frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 270;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Do";
Debug.ShouldStop(8192);
frm_post_01_producto.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(frm_post_01_producto.mostCurrent._fila_id));
 BA.debugLineNum = 271;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(16384);
frm_post_01_producto._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 272;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 275;BA.debugLine="Dim Total As Double";
Debug.ShouldStop(262144);
_total = RemoteObject.createImmutable(0);Debug.locals.put("Total", _total);
 BA.debugLineNum = 277;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(1048576);
if (frm_post_01_producto._chkvalores.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 278;BA.debugLine="Total = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(2097152);
_total = BA.numberCast(double.class, frm_post_01_producto.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));Debug.locals.put("Total", _total);
 }else {
 BA.debugLineNum = 280;BA.debugLine="Total = Fila.Get(\"valbrutolinea\")";
Debug.ShouldStop(8388608);
_total = BA.numberCast(double.class, frm_post_01_producto.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valbrutolinea")))));Debug.locals.put("Total", _total);
 };
 BA.debugLineNum = 283;BA.debugLine="If 0 = Txt_Cantidad.Tag Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, frm_post_01_producto.mostCurrent._txt_cantidad.runMethod(false,"getTag")))) { 
 BA.debugLineNum = 285;BA.debugLine="vSalir = Msgbox2(\"Si deja la cantidad en cero e";
Debug.ShouldStop(268435456);
_vsalir = frm_post_01_producto.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Si deja la cantidad en cero el producto no se agregara a la lista"),frm_post_01_producto.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Estas seguro de salir?")))),(Object)(BA.ObjectToCharSequence("Validaación")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((frm_post_01_producto.mostCurrent.__c.getField(false,"Null"))),frm_post_01_producto.mostCurrent.activityBA);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 288;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_vsalir,BA.numberCast(double.class, frm_post_01_producto.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 289;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_D";
Debug.ShouldStop(1);
frm_post_01_producto.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(frm_post_01_producto.mostCurrent._fila_id));
 BA.debugLineNum = 290;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(2);
frm_post_01_producto._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 291;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 293;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 298;BA.debugLine="If Total <> Lbl_Total.Tag Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_total,BA.numberCast(double.class, frm_post_01_producto.mostCurrent._lbl_total.runMethod(false,"getTag")))) { 
 BA.debugLineNum = 300;BA.debugLine="vSalir = Msgbox2(\"¿Estas seguro de cerrar sin a";
Debug.ShouldStop(2048);
_vsalir = frm_post_01_producto.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("¿Estas seguro de cerrar sin aplicar los cambios?")),(Object)(BA.ObjectToCharSequence("SALIR SIN GRABAR")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((frm_post_01_producto.mostCurrent.__c.getField(false,"Null"))),frm_post_01_producto.mostCurrent.activityBA);Debug.locals.put("vSalir", _vsalir);
 BA.debugLineNum = 302;BA.debugLine="If vSalir = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_vsalir,BA.numberCast(double.class, frm_post_01_producto.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 304;BA.debugLine="If Not(Editar) Then";
Debug.ShouldStop(32768);
if (frm_post_01_producto.mostCurrent.__c.runMethod(true,"Not",(Object)(frm_post_01_producto._editar)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 305;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_";
Debug.ShouldStop(65536);
frm_post_01_producto.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(frm_post_01_producto.mostCurrent._fila_id));
 };
 BA.debugLineNum = 308;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(524288);
frm_post_01_producto._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 309;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 312;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"True");
 };
 }else {
 BA.debugLineNum = 316;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(134217728);
frm_post_01_producto._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 317;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 };
 };
 BA.debugLineNum = 322;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(2);
frm_post_01_producto._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 323;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) return frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,258);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 258;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,228);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","activity_resume");}
RemoteObject _filaseleccionada = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 228;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 230;BA.debugLine="If Procesar_Dscto Then";
Debug.ShouldStop(32);
if (frm_post_01_producto._procesar_dscto.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 232;BA.debugLine="Fila.Put(\"descuentoporc\",Frm_Post_01_Descuentos.";
Debug.ShouldStop(128);
frm_post_01_producto.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descuentoporc"))),(Object)((frm_post_01_producto.mostCurrent._frm_post_01_descuentos._total_pc /*RemoteObject*/ )));
 BA.debugLineNum = 235;BA.debugLine="Sb_Procesar_Datos(\"DescuentoPorc\")";
Debug.ShouldStop(1024);
_sb_procesar_datos(RemoteObject.createImmutable("DescuentoPorc"));
 BA.debugLineNum = 236;BA.debugLine="Procesar_Dscto = False";
Debug.ShouldStop(2048);
frm_post_01_producto._procesar_dscto = frm_post_01_producto.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 239;BA.debugLine="If Frm_InfoStockXProd.Msj.EsCorrecto Then";
Debug.ShouldStop(16384);
if (frm_post_01_producto.mostCurrent._frm_infostockxprod._msj /*RemoteObject*/ .getField(true,"_escorrecto" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 241;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png";
Debug.ShouldStop(65536);
frm_post_01_producto.mostCurrent._bmp1 = frm_post_01_producto.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(frm_post_01_producto.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 243;BA.debugLine="Dim FilaSeleccionada As Map = Frm_InfoStockXProd";
Debug.ShouldStop(262144);
_filaseleccionada = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filaseleccionada = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), frm_post_01_producto.mostCurrent._frm_infostockxprod._msj /*RemoteObject*/ .getField(false,"_tag" /*RemoteObject*/ ));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 245;BA.debugLine="Fila.Put(\"sucursal\",FilaSeleccionada.Get(\"KOSU\")";
Debug.ShouldStop(1048576);
frm_post_01_producto.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sucursal"))),(Object)(_filaseleccionada.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOSU"))))));
 BA.debugLineNum = 246;BA.debugLine="Fila.Put(\"bodega\",FilaSeleccionada.Get(\"KOBO\"))";
Debug.ShouldStop(2097152);
frm_post_01_producto.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bodega"))),(Object)(_filaseleccionada.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOBO"))))));
 BA.debugLineNum = 248;BA.debugLine="Lbl_Bodega.Text = \"Stock Bod. \" & Fila.Get(\"bode";
Debug.ShouldStop(8388608);
frm_post_01_producto.mostCurrent._lbl_bodega.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Stock Bod. "),frm_post_01_producto.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bodega")))))));
 BA.debugLineNum = 249;BA.debugLine="Lbl_Stock.Text = FilaSeleccionada.Get(\"STFI1\")";
Debug.ShouldStop(16777216);
frm_post_01_producto.mostCurrent._lbl_stock.runMethod(true,"setText",BA.ObjectToCharSequence(_filaseleccionada.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1"))))));
 };
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_aceptar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Aceptar_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1190);
if (RapidSub.canDelegate("btn_aceptar_click")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","btn_aceptar_click"); return;}
ResumableSub_Btn_Aceptar_Click rsub = new ResumableSub_Btn_Aceptar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Aceptar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Aceptar_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _empresa = RemoteObject.createImmutable("");
RemoteObject _sucursal = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable(0);
RemoteObject _untrans = RemoteObject.createImmutable(0);
RemoteObject _tidopa = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filastk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stock_disponible = RemoteObject.createImmutable(0);
RemoteObject _stock_fisico = RemoteObject.createImmutable(0);
RemoteObject _stock_suficiente = RemoteObject.createImmutable(false);
RemoteObject _sf = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Aceptar_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1190);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1192;BA.debugLine="If 0 = Txt_Cantidad.Tag  Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, parent.mostCurrent._txt_cantidad.runMethod(false,"getTag")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 36;
 BA.debugLineNum = 1194;BA.debugLine="Msgbox2Async(\"No puede agregar un producto con c";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No puede agregar un producto con cantidad cero")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1195;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_aceptar_click"), null);
this.state = 37;
return;
case 37:
//C
this.state = 36;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1196;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1200;BA.debugLine="Dim Codigo As String = Fila.Get(\"codigo\")";
Debug.ShouldStop(32768);
_codigo = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codigo")))));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 1201;BA.debugLine="Dim Tido As String = \"NVV\"";
Debug.ShouldStop(65536);
_tido = BA.ObjectToString("NVV");Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 1202;BA.debugLine="Dim Empresa As String = Fila.Get(\"empresa\")";
Debug.ShouldStop(131072);
_empresa = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("empresa")))));Debug.locals.put("Empresa", _empresa);Debug.locals.put("Empresa", _empresa);
 BA.debugLineNum = 1203;BA.debugLine="Dim Sucursal As String = Fila.Get(\"sucursal\")";
Debug.ShouldStop(262144);
_sucursal = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sucursal")))));Debug.locals.put("Sucursal", _sucursal);Debug.locals.put("Sucursal", _sucursal);
 BA.debugLineNum = 1204;BA.debugLine="Dim Bodega As String = Fila.Get(\"bodega\")";
Debug.ShouldStop(524288);
_bodega = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bodega")))));Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1205;BA.debugLine="Dim Cantidad As Double = Fila.Get(\"cantidad\")";
Debug.ShouldStop(1048576);
_cantidad = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cantidad")))));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 1206;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
Debug.ShouldStop(2097152);
_untrans = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("untrans")))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 1207;BA.debugLine="Dim Tidopa As String = Fila.Get(\"tidopa\")";
Debug.ShouldStop(4194304);
_tidopa = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tidopa")))));Debug.locals.put("Tidopa", _tidopa);Debug.locals.put("Tidopa", _tidopa);
 BA.debugLineNum = 1209;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Re";
Debug.ShouldStop(16777216);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_revisar_stock_fila" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.getObject()),(Object)(_tido),(Object)(_empresa),(Object)(_sucursal),(Object)(_bodega),(Object)(_codigo),(Object)(_cantidad),(Object)(_untrans),(Object)(_tidopa));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1211;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_aceptar_click"), (_js));
this.state = 38;
return;
case 38:
//C
this.state = 6;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1213;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 6:
//if
this.state = 35;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 34;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1215;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(1073741824);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1217;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(1);
if (true) break;

case 9:
//if
this.state = 32;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 11;
}else {
this.state = 31;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1219;BA.debugLine="Dim	Filas As List = Funciones.Fx_DataTable(Js.";
Debug.ShouldStop(4);
_filas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filas = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("Filas", _filas);Debug.locals.put("Filas", _filas);
 BA.debugLineNum = 1220;BA.debugLine="Dim FilaStk As Map = Filas.Get(0)";
Debug.ShouldStop(8);
_filastk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filastk = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _filas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaStk", _filastk);Debug.locals.put("FilaStk", _filastk);
 BA.debugLineNum = 1222;BA.debugLine="Dim Stock_Disponible As Double = FilaStk.Get(\"";
Debug.ShouldStop(32);
_stock_disponible = BA.numberCast(double.class, _filastk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Stock_Disponible")))));Debug.locals.put("Stock_Disponible", _stock_disponible);Debug.locals.put("Stock_Disponible", _stock_disponible);
 BA.debugLineNum = 1223;BA.debugLine="Dim Stock_Fisico As Double = FilaStk.Get(\"Stoc";
Debug.ShouldStop(64);
_stock_fisico = BA.numberCast(double.class, _filastk.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Stock_Fisico")))));Debug.locals.put("Stock_Fisico", _stock_fisico);Debug.locals.put("Stock_Fisico", _stock_fisico);
 BA.debugLineNum = 1224;BA.debugLine="Log(\"Stock disponible: \" & Stock_Disponible &";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","224707106",RemoteObject.concat(RemoteObject.createImmutable("Stock disponible: "),_stock_disponible,RemoteObject.createImmutable(", Stock fisico: "),_stock_fisico),0);
 BA.debugLineNum = 1226;BA.debugLine="Dim Stock_Suficiente As Boolean";
Debug.ShouldStop(512);
_stock_suficiente = RemoteObject.createImmutable(false);Debug.locals.put("Stock_Suficiente", _stock_suficiente);
 BA.debugLineNum = 1228;BA.debugLine="If Stock_Disponible <= 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 12:
//if
this.state = 21;
if (RemoteObject.solveBoolean("k",_stock_disponible,BA.numberCast(double.class, 0))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 21;
 BA.debugLineNum = 1229;BA.debugLine="Stock_Suficiente = False";
Debug.ShouldStop(4096);
_stock_suficiente = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Stock_Suficiente", _stock_suficiente);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1231;BA.debugLine="If Stock_Disponible - Cantidad >= 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_stock_disponible,_cantidad}, "-",1, 0),BA.numberCast(double.class, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1232;BA.debugLine="Stock_Suficiente = True";
Debug.ShouldStop(32768);
_stock_suficiente = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Stock_Suficiente", _stock_suficiente);
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
 BA.debugLineNum = 1236;BA.debugLine="Fila.Put(\"stockbodega\",Stock_Disponible)";
Debug.ShouldStop(524288);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stockbodega"))),(Object)((_stock_disponible)));
 BA.debugLineNum = 1237;BA.debugLine="Lbl_Stock.Text = Fila.Get(\"stockbodega\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_stock.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stockbodega"))))));
 BA.debugLineNum = 1239;BA.debugLine="If Stock_Suficiente = False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 22:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_stock_suficiente,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1243;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
Debug.ShouldStop(67108864);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1245;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Producto";
Debug.ShouldStop(268435456);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",frm_post_01_producto.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Producto con stock insuficiente, Stock disponible: "),_stock_disponible,parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Desea agregarlo de todas formas?")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("NO")),(Object)(parent.mostCurrent._bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1247;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_aceptar_click"), _sf);
this.state = 39;
return;
case 39:
//C
this.state = 25;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1249;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.ShouldStop(1);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1250;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 BA.debugLineNum = 1255;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(64);
parent._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1259;BA.debugLine="Fila.Put(\"codfuncionario\",Variables.Global_Row";
Debug.ShouldStop(1024);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codfuncionario"))),(Object)(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 1260;BA.debugLine="Fila.Put(\"codvendedor\",Variables.Global_Row_Us";
Debug.ShouldStop(2048);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("codvendedor"))),(Object)(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU"))))));
 BA.debugLineNum = 1263;BA.debugLine="Fila.Put(\"moneda\",Variables.Global_Row_Moneda.";
Debug.ShouldStop(16384);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOMO"))))));
 BA.debugLineNum = 1264;BA.debugLine="Fila.Put(\"tipo_moneda\",Variables.Global_Row_Mo";
Debug.ShouldStop(32768);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_moneda"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIMO"))))));
 BA.debugLineNum = 1265;BA.debugLine="Fila.Put(\"tipo_cambio\",Variables.Global_Row_Mo";
Debug.ShouldStop(65536);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipo_cambio"))),(Object)(parent.mostCurrent._variables._global_row_moneda /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VAMO"))))));
 BA.debugLineNum = 1267;BA.debugLine="DBUtils.UpdateRecord2(Variables.vSql,\"Detalle_";
Debug.ShouldStop(262144);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(parent.mostCurrent._fila),(Object)(parent.mostCurrent._fila_id));
 BA.debugLineNum = 1268;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(524288);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1269;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1272;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"No se pud";
Debug.ShouldStop(8388608);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",frm_post_01_producto.processBA,(Object)(BA.ObjectToCharSequence("No se pudo establecer comunicación con el servidor WebService...")),(Object)(BA.ObjectToCharSequence("Error de comunicación")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1273;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1277;BA.debugLine="Log(Js.ErrorMessage)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","224707159",_js.getField(true,"_errormessage" /*RemoteObject*/ ),0);
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
 BA.debugLineNum = 1282;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static void  _btn_editar_descuento_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Descuento_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1284);
if (RapidSub.canDelegate("btn_editar_descuento_click")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","btn_editar_descuento_click"); return;}
ResumableSub_Btn_Editar_Descuento_Click rsub = new ResumableSub_Btn_Editar_Descuento_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Editar_Descuento_Click extends BA.ResumableSub {
public ResumableSub_Btn_Editar_Descuento_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _acepta_dscto_marca = RemoteObject.createImmutable(false);
RemoteObject _dscto_max = RemoteObject.createImmutable(0);
RemoteObject _nrodscto = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Descuento_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1284);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1286;BA.debugLine="Dim Acepta_Dscto_Marca As Boolean = RowProducto.G";
Debug.ShouldStop(32);
_acepta_dscto_marca = BA.ObjectToBoolean(parent.mostCurrent._rowproducto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Acepta_Dscto_Marca")))));Debug.locals.put("Acepta_Dscto_Marca", _acepta_dscto_marca);Debug.locals.put("Acepta_Dscto_Marca", _acepta_dscto_marca);
 BA.debugLineNum = 1287;BA.debugLine="Dim Dscto_Max As Double = RowProducto.Get(\"Dscto_";
Debug.ShouldStop(64);
_dscto_max = BA.numberCast(double.class, parent.mostCurrent._rowproducto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dscto_Marca")))));Debug.locals.put("Dscto_Max", _dscto_max);Debug.locals.put("Dscto_Max", _dscto_max);
 BA.debugLineNum = 1288;BA.debugLine="Dim NroDscto As Int";
Debug.ShouldStop(128);
_nrodscto = RemoteObject.createImmutable(0);Debug.locals.put("NroDscto", _nrodscto);
 BA.debugLineNum = 1290;BA.debugLine="If Not(Acepta_Dscto_Marca) Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_acepta_dscto_marca)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1294;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"key.png\")";
Debug.ShouldStop(8192);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("key.png")));
 BA.debugLineNum = 1296;BA.debugLine="Msgbox2Async(\"Para ingresar el descuento necesit";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Para ingresar el descuento necesita una clave de autorización")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1297;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_editar_descuento_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1299;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1300;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1303;BA.debugLine="Wait For(Fx_Insertar_Dscto_Global_Permiso) Compl";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_editar_descuento_click"), _fx_insertar_dscto_global_permiso());
this.state = 14;
return;
case 14:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1304;BA.debugLine="Dscto_Max = Result";
Debug.ShouldStop(8388608);
_dscto_max = BA.numberCast(double.class, _result);Debug.locals.put("Dscto_Max", _dscto_max);
 BA.debugLineNum = 1306;BA.debugLine="If Result = 0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1307;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1312;BA.debugLine="NroDscto = Fila.Get(\"nrodscto\")";
Debug.ShouldStop(-2147483648);
_nrodscto = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nrodscto")))));Debug.locals.put("NroDscto", _nrodscto);
 BA.debugLineNum = 1314;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
Debug.ShouldStop(2);
parent._id_docdet = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 1315;BA.debugLine="Frm_Post_01_Descuentos.Id_DocEnc =Fila.Get(\"id_do";
Debug.ShouldStop(4);
parent.mostCurrent._frm_post_01_descuentos._id_docenc /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));
 BA.debugLineNum = 1316;BA.debugLine="Frm_Post_01_Descuentos.Id_DocDet =Id_DocDet";
Debug.ShouldStop(8);
parent.mostCurrent._frm_post_01_descuentos._id_docdet /*RemoteObject*/  = parent._id_docdet;
 BA.debugLineNum = 1319;BA.debugLine="Frm_Post_01_Descuentos.Dscto_Max = Dscto_Max";
Debug.ShouldStop(64);
parent.mostCurrent._frm_post_01_descuentos._dscto_max /*RemoteObject*/  = BA.numberCast(int.class, _dscto_max);
 BA.debugLineNum = 1320;BA.debugLine="Frm_Post_01_Descuentos.Total_Linea_Origen = Total";
Debug.ShouldStop(128);
parent.mostCurrent._frm_post_01_descuentos._total_linea_origen /*RemoteObject*/  = parent._total_linea;
 BA.debugLineNum = 1321;BA.debugLine="Frm_Post_01_Descuentos.NroDscto = NroDscto";
Debug.ShouldStop(256);
parent.mostCurrent._frm_post_01_descuentos._nrodscto /*RemoteObject*/  = _nrodscto;
 BA.debugLineNum = 1323;BA.debugLine="Procesar_Dscto = True";
Debug.ShouldStop(1024);
parent._procesar_dscto = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1325;BA.debugLine="StartActivity(Frm_Post_01_Descuentos)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_producto.processBA,(Object)((parent.mostCurrent._frm_post_01_descuentos.getObject())));
 BA.debugLineNum = 1327;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _btn_editar_precio_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Precio_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1848);
if (RapidSub.canDelegate("btn_editar_precio_click")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","btn_editar_precio_click"); return;}
ResumableSub_Btn_Editar_Precio_Click rsub = new ResumableSub_Btn_Editar_Precio_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Editar_Precio_Click extends BA.ResumableSub {
public ResumableSub_Btn_Editar_Precio_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _rst = RemoteObject.createImmutable(false);
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _result2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Editar_Precio_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1848);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1850;BA.debugLine="Wait For(Cl_PermisoX.Sb_ValidarPermisoUsuario(\"Bk";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_editar_precio_click"), parent.mostCurrent._cl_permisox.runClassMethod (BaKapp.Movil.Tag.cl_permisoxui.class, "_sb_validarpermisousuario" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Bkp00006"))));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_rst = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Rst", _rst);
;
 BA.debugLineNum = 1852;BA.debugLine="If Not(Rst) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_rst)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1853;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1856;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(-2147483648);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 1857;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(1);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1858;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(2);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 1861;BA.debugLine="Base = Activity";
Debug.ShouldStop(16);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 1862;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(32);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 1864;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(128);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 1866;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(512);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1867;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
Debug.ShouldStop(1024);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese clave del descuento"));
 BA.debugLineNum = 1868;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
Debug.ShouldStop(2048);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1869;BA.debugLine="InputTemplate.Text = Funciones.CDouble(Lbl_Precio";
Debug.ShouldStop(4096);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(parent.mostCurrent._funciones.runMethod(true,"_cdouble" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent._lbl_precio.runMethod(false,"getTag"))))));
 BA.debugLineNum = 1871;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_editar_precio_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 10;
return;
case 10:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1873;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1875;BA.debugLine="Lbl_Precio.Tag = InputTemplate.Text";
Debug.ShouldStop(262144);
parent.mostCurrent._lbl_precio.runMethod(false,"setTag",(_inputtemplate.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1876;BA.debugLine="Lbl_Precio.Text = \"$ \" & NumberFormat(Lbl_Precio";
Debug.ShouldStop(524288);
parent.mostCurrent._lbl_precio.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, parent.mostCurrent._lbl_precio.runMethod(false,"getTag"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1877;BA.debugLine="Txt_Cantidad.Tag = 0";
Debug.ShouldStop(1048576);
parent.mostCurrent._txt_cantidad.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 1878;BA.debugLine="Txt_Cantidad.Text = \"\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._txt_cantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1880;BA.debugLine="Wait For (Sb_Procesar_Datos(\"Cantidad\")) Complet";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_editar_precio_click"), _sb_procesar_datos(RemoteObject.createImmutable("Cantidad")));
this.state = 11;
return;
case 11:
//C
this.state = 8;
_result2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result2", _result2);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1884;BA.debugLine="End Sub";
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
public static void  _btn_eliminar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Eliminar_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,344);
if (RapidSub.canDelegate("btn_eliminar_click")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","btn_eliminar_click"); return;}
ResumableSub_Btn_Eliminar_Click rsub = new ResumableSub_Btn_Eliminar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Eliminar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Eliminar_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Eliminar_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,344);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 346;BA.debugLine="If ModoConsulta Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._modoconsulta.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 347;BA.debugLine="ModoConsulta = False";
Debug.ShouldStop(67108864);
parent._modoconsulta = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 348;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Doc";
Debug.ShouldStop(134217728);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(parent.mostCurrent._fila_id));
 BA.debugLineNum = 349;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(268435456);
parent._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 350;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 351;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 354;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(2);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 356;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Estas segur";
Debug.ShouldStop(8);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",frm_post_01_producto.processBA,(Object)(BA.ObjectToCharSequence("¿Estas seguro de eliminar este producto?")),(Object)(BA.ObjectToCharSequence("E L I M I N A R")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("NO")),(Object)(parent.mostCurrent._bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 357;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_eliminar_click"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 359;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(64);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 361;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Detalle_Doc";
Debug.ShouldStop(256);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(parent.mostCurrent._fila_id));
 BA.debugLineNum = 363;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
Debug.ShouldStop(1024);
parent._id_docdet = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 365;BA.debugLine="Consulta_Sql = \"Select Id_DocEnc,Id_DocDet From";
Debug.ShouldStop(4096);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocEnc,Id_DocDet From Descuentos_Doc Where Id_DocDet = "),parent._id_docdet);
 BA.debugLineNum = 366;BA.debugLine="Fila_Dscto = DBUtils.ExecuteMap(Variables.vSql,C";
Debug.ShouldStop(8192);
parent.mostCurrent._fila_dscto = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 368;BA.debugLine="If Fila_Dscto.IsInitialized Then";
Debug.ShouldStop(32768);
if (true) break;

case 8:
//if
this.state = 11;
if (parent.mostCurrent._fila_dscto.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 369;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos";
Debug.ShouldStop(65536);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Descuentos_Doc")),(Object)(parent.mostCurrent._fila_dscto));
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 372;BA.debugLine="Id_DocDet = 0";
Debug.ShouldStop(524288);
parent._id_docdet = BA.numberCast(int.class, 0);
 BA.debugLineNum = 373;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static void  _btn_revisar_stock_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Revisar_Stock_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1504);
if (RapidSub.canDelegate("btn_revisar_stock_click")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","btn_revisar_stock_click"); return;}
ResumableSub_Btn_Revisar_Stock_Click rsub = new ResumableSub_Btn_Revisar_Stock_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Revisar_Stock_Click extends BA.ResumableSub {
public ResumableSub_Btn_Revisar_Stock_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _msj2 = RemoteObject.declareNull("BaKapp.Movil.Tag.mensajes");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _tblstockxbodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _searchtemplatestock = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stock = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Revisar_Stock_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1504);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1508;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1510;BA.debugLine="Wait For (Revisar_StockVillar) Complete (Msj2 As";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_revisar_stock_click"), _revisar_stockvillar());
this.state = 37;
return;
case 37:
//C
this.state = 4;
_msj2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Msj2", _msj2);
;
 BA.debugLineNum = 1511;BA.debugLine="If Not(Msj2.EsCorrecto) Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_msj2.getField(true,"_escorrecto" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1512;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(128);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1513;BA.debugLine="Msgbox2Async(Msj.Mensaje, Msj.Detalle, \"Ok\", \"\"";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(parent._msj.getField(true,"_mensaje" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence(parent._msj.getField(true,"_detalle" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1514;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1519;BA.debugLine="Frm_InfoStockXProd.Codigo = Txt_Codigo.Text";
Debug.ShouldStop(16384);
parent.mostCurrent._frm_infostockxprod._codigo /*RemoteObject*/  = parent.mostCurrent._txt_codigo.runMethod(true,"getText");
 BA.debugLineNum = 1520;BA.debugLine="Frm_InfoStockXProd.Descripcion = Lbl_Descripcion";
Debug.ShouldStop(32768);
parent.mostCurrent._frm_infostockxprod._descripcion /*RemoteObject*/  = parent.mostCurrent._lbl_descripcion.runMethod(true,"getText");
 BA.debugLineNum = 1521;BA.debugLine="StartActivity(Frm_InfoStockXProd)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",frm_post_01_producto.processBA,(Object)((parent.mostCurrent._frm_infostockxprod.getObject())));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1532;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 BA.debugLineNum = 1534;BA.debugLine="Private xui As XUI";
Debug.ShouldStop(536870912);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1535;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(1073741824);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 1536;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(-2147483648);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 1538;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(2);
parent.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 BA.debugLineNum = 1540;BA.debugLine="Consulta_Sql = \"Select Isnull((SELECT TOP 1 KOBO+";
Debug.ShouldStop(8);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEST Ms"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where KOPR = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)"));
 BA.debugLineNum = 1546;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
Debug.ShouldStop(512);
if (true) break;

case 11:
//if
this.state = 14;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1548;BA.debugLine="Consulta_Sql = \"Select 'ALAMEDA' As BODEGA,STOCK";
Debug.ShouldStop(2048);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Union"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 1554;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(131072);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(frm_post_01_producto.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1555;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_revisar_stock_click"), (_js));
this.state = 38;
return;
case 38:
//C
this.state = 15;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1557;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 15:
//if
this.state = 36;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1559;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(4194304);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1560;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(8388608);
if (true) break;

case 18:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1562;BA.debugLine="Log(\"Traer Stock x bodega\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","224969274",RemoteObject.createImmutable("Traer Stock x bodega"),0);
 BA.debugLineNum = 1563;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
Debug.ShouldStop(67108864);
_tblstockxbodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tblstockxbodega = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_vjson));Debug.locals.put("TblStockXbodega", _tblstockxbodega);Debug.locals.put("TblStockXbodega", _tblstockxbodega);
 BA.debugLineNum = 1565;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
Debug.ShouldStop(268435456);
_searchtemplatestock = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");Debug.locals.put("SearchTemplateStock", _searchtemplatestock);
 BA.debugLineNum = 1566;BA.debugLine="SearchTemplateStock.Initialize";
Debug.ShouldStop(536870912);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1568;BA.debugLine="Dim Items As List";
Debug.ShouldStop(-2147483648);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 1569;BA.debugLine="Items.Initialize";
Debug.ShouldStop(1);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 1571;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
Debug.ShouldStop(4);
if (true) break;

case 21:
//for
this.state = 30;
_vfilastb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group33 = _tblstockxbodega;
index33 = 0;
groupLen33 = group33.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("vFilaStb", _vfilastb);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 30;
if (index33 < groupLen33) {
this.state = 23;
_vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group33.runMethod(false,"Get",index33));Debug.locals.put("vFilaStb", _vfilastb);}
if (true) break;

case 40:
//C
this.state = 39;
index33++;
Debug.locals.put("vFilaStb", _vfilastb);
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1573;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
Debug.ShouldStop(16);
_stock = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Stock", _stock);Debug.locals.put("Stock", _stock);
 BA.debugLineNum = 1574;BA.debugLine="Dim Bodega As String";
Debug.ShouldStop(32);
_bodega = RemoteObject.createImmutable("");Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1576;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STO";
Debug.ShouldStop(128);
if (true) break;

case 24:
//if
this.state = 29;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 1577;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
Debug.ShouldStop(256);
_bodega = BA.ObjectToString(_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BODEGA")))));Debug.locals.put("Bodega", _bodega);
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1579;BA.debugLine="Bodega = Funciones.Mid(vFilaStb.Get(\"BODEGA\")";
Debug.ShouldStop(1024);
_bodega = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(BA.ObjectToString(_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BODEGA")))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("Bodega", _bodega);
 if (true) break;

case 29:
//C
this.state = 40;
;
 BA.debugLineNum = 1582;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
Debug.ShouldStop(8192);
_bodega = parent.mostCurrent._funciones.runMethod(true,"_rellenar_derecha" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_bodega.runMethod(true,"trim")),(Object)(BA.numberCast(int.class, 20)),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1584;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
Debug.ShouldStop(32768);
_name = RemoteObject.concat(_bodega,RemoteObject.createImmutable(" "),_stock);Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 1585;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(65536);
_items.runVoidMethod ("Add",(Object)((_name)));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
Debug.locals.put("vFilaStb", _vfilastb);
;
 BA.debugLineNum = 1589;BA.debugLine="SearchTemplateStock.SetItems(Items)";
Debug.ShouldStop(1048576);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 1591;BA.debugLine="Base = Activity";
Debug.ShouldStop(4194304);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 1592;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(8388608);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 1593;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
Debug.ShouldStop(16777216);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Stock X Bodega")));
 BA.debugLineNum = 1595;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_revisar_stock_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_searchtemplatestock)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CERRAR")))));
this.state = 41;
return;
case 41:
//C
this.state = 31;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1596;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(134217728);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
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
 BA.debugLineNum = 1604;BA.debugLine="End Sub";
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
public static void  _btn_ubicacion_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Ubicacion_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1771);
if (RapidSub.canDelegate("btn_ubicacion_click")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","btn_ubicacion_click"); return;}
ResumableSub_Btn_Ubicacion_Click rsub = new ResumableSub_Btn_Ubicacion_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Ubicacion_Click extends BA.ResumableSub {
public ResumableSub_Btn_Ubicacion_Click(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _tblubicxbodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _searchtemplatestock = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _vfilaub = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _codigo_ubic = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _nokobo = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Ubicacion_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1771);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1774;BA.debugLine="Private xui As XUI";
Debug.ShouldStop(8192);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1775;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(16384);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 1776;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(32768);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 1778;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(131072);
parent.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 BA.debugLineNum = 1780;BA.debugLine="Consulta_Sql = \"Select Pubc.Empresa,Pubc.Sucursal";
Debug.ShouldStop(524288);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Pubc.Empresa,Pubc.Sucursal,Pubc.Bodega,Pubc.Id_Mapa,Pubc.Codigo_Sector,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Pubc.Codigo_Ubic,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Isnull((Select NOKOBO From TABBO Where"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("EMPRESA = Pubc.Empresa And KOSU = Pubc.Sucursal And KOBO = Pubc.Bodega),'') As NOKOBO,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Pubc.Codigo,U_mapa.Nombre_Mapa,U_sector.Nombre_Sector,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Isnull(U_bodega.Descripcion_Ubic,'') As Descripcion_Ubic"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From"),parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_Prod_Ubicacion As Pubc LEFT OUTER JOIN"),parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_WMS_Ubicaciones_Bodega As U_bodega ON Pubc.Id_Mapa = U_bodega.Id_Mapa And Pubc.Codigo_Ubic = U_bodega.Codigo_Ubic LEFT OUTER JOIN"),parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_WMS_Ubicaciones_Mapa_Det As U_sector ON Pubc.Codigo_Sector = U_sector.Codigo_Sector And Pubc.Id_Mapa = U_sector.Id_Mapa LEFT OUTER JOIN"),parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent._variables._global_basebk /*RemoteObject*/ ,RemoteObject.createImmutable("Zw_WMS_Ubicaciones_Mapa_Enc As U_mapa ON Pubc.Id_Mapa = U_mapa.Id_Mapa"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where Pubc.Codigo = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"));
 BA.debugLineNum = 1793;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(frm_post_01_producto.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1794;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_ubicacion_click"), (_js));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1796;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 18;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1798;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(32);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1800;BA.debugLine="If  vJson = $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 17;
 BA.debugLineNum = 1803;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"emoticon-sad";
Debug.ShouldStop(1024);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("emoticon-sad.png")));
 BA.debugLineNum = 1804;BA.debugLine="Msgbox2Async(\"No tiene otras ubicaciones regist";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No tiene otras ubicaciones registradas en el sistema")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1808;BA.debugLine="Log(\"Traer Ubicación x bodega\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","225165861",RemoteObject.createImmutable("Traer Ubicación x bodega"),0);
 BA.debugLineNum = 1809;BA.debugLine="Dim TblUbicXbodega As List = Funciones.Fx_DataT";
Debug.ShouldStop(65536);
_tblubicxbodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tblubicxbodega = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_vjson));Debug.locals.put("TblUbicXbodega", _tblubicxbodega);Debug.locals.put("TblUbicXbodega", _tblubicxbodega);
 BA.debugLineNum = 1811;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
Debug.ShouldStop(262144);
_searchtemplatestock = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");Debug.locals.put("SearchTemplateStock", _searchtemplatestock);
 BA.debugLineNum = 1812;BA.debugLine="SearchTemplateStock.Initialize";
Debug.ShouldStop(524288);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1814;BA.debugLine="Dim Items As List";
Debug.ShouldStop(2097152);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 1815;BA.debugLine="Items.Initialize";
Debug.ShouldStop(4194304);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 1817;BA.debugLine="For Each vFilaUb As Map In TblUbicXbodega";
Debug.ShouldStop(16777216);
if (true) break;

case 9:
//for
this.state = 12;
_vfilaub = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _tblubicxbodega;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("vFilaUb", _vfilaub);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 12;
if (index20 < groupLen20) {
this.state = 11;
_vfilaub = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));Debug.locals.put("vFilaUb", _vfilaub);}
if (true) break;

case 21:
//C
this.state = 20;
index20++;
Debug.locals.put("vFilaUb", _vfilaub);
if (true) break;

case 11:
//C
this.state = 21;
 BA.debugLineNum = 1819;BA.debugLine="Dim Codigo_Ubic As String  = vFilaUb.Get(\"Codi";
Debug.ShouldStop(67108864);
_codigo_ubic = BA.ObjectToString(_vfilaub.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Codigo_Ubic")))));Debug.locals.put("Codigo_Ubic", _codigo_ubic);Debug.locals.put("Codigo_Ubic", _codigo_ubic);
 BA.debugLineNum = 1820;BA.debugLine="Dim Bodega As String = vFilaUb.Get(\"Bodega\")";
Debug.ShouldStop(134217728);
_bodega = BA.ObjectToString(_vfilaub.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Bodega")))));Debug.locals.put("Bodega", _bodega);Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1821;BA.debugLine="Dim Nokobo As String = Funciones.Mid(vFilaUb.G";
Debug.ShouldStop(268435456);
_nokobo = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(BA.ObjectToString(_vfilaub.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOBO")))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("Nokobo", _nokobo);Debug.locals.put("Nokobo", _nokobo);
 BA.debugLineNum = 1823;BA.debugLine="Nokobo = Funciones.Rellenar_Derecha(Nokobo.Tri";
Debug.ShouldStop(1073741824);
_nokobo = parent.mostCurrent._funciones.runMethod(true,"_rellenar_derecha" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_nokobo.runMethod(true,"trim")),(Object)(BA.numberCast(int.class, 20)),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("Nokobo", _nokobo);
 BA.debugLineNum = 1825;BA.debugLine="Dim Name As String = Bodega & \" \" & Codigo_Ubi";
Debug.ShouldStop(1);
_name = RemoteObject.concat(_bodega,RemoteObject.createImmutable(" "),_codigo_ubic);Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 1826;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(2);
_items.runVoidMethod ("Add",(Object)((_name)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("vFilaUb", _vfilaub);
;
 BA.debugLineNum = 1830;BA.debugLine="SearchTemplateStock.SetItems(Items)";
Debug.ShouldStop(32);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 1832;BA.debugLine="Base = Activity";
Debug.ShouldStop(128);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 1833;BA.debugLine="Dialog.Initialize(Base)";
Debug.ShouldStop(256);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 1834;BA.debugLine="Dialog.Title = \"Ubicación X Bodega\"";
Debug.ShouldStop(512);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Ubicación X Bodega")));
 BA.debugLineNum = 1836;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "btn_ubicacion_click"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_searchtemplatestock)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CERRAR")))));
this.state = 22;
return;
case 22:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1837;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(4096);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = 17;
;
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
 BA.debugLineNum = 1846;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _fx_insertar_dscto_global_permiso() throws Exception{
try {
		Debug.PushSubsStack("Fx_Insertar_Dscto_Global_Permiso (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1426);
if (RapidSub.canDelegate("fx_insertar_dscto_global_permiso")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","fx_insertar_dscto_global_permiso");}
ResumableSub_Fx_Insertar_Dscto_Global_Permiso rsub = new ResumableSub_Fx_Insertar_Dscto_Global_Permiso(null);
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
public static class ResumableSub_Fx_Insertar_Dscto_Global_Permiso extends BA.ResumableSub {
public ResumableSub_Fx_Insertar_Dscto_Global_Permiso(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _existe = RemoteObject.createImmutable(false);
RemoteObject _otorgado = RemoteObject.createImmutable(false);
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _filadscto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Fx_Insertar_Dscto_Global_Permiso (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1426);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1428;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(524288);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 1429;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(1048576);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1430;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(2097152);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 1431;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4194304);
parent.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 1433;BA.debugLine="Base = Activity";
Debug.ShouldStop(16777216);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 1434;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(33554432);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 1436;BA.debugLine="Dim Existe As Boolean";
Debug.ShouldStop(134217728);
_existe = RemoteObject.createImmutable(false);Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 1437;BA.debugLine="Dim Otorgado As Boolean";
Debug.ShouldStop(268435456);
_otorgado = RemoteObject.createImmutable(false);Debug.locals.put("Otorgado", _otorgado);
 BA.debugLineNum = 1438;BA.debugLine="Dim DescuentoPorc As Int = 0";
Debug.ShouldStop(536870912);
_descuentoporc = BA.numberCast(int.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 1440;BA.debugLine="Dim Clave As String";
Debug.ShouldStop(-2147483648);
_clave = RemoteObject.createImmutable("");Debug.locals.put("Clave", _clave);
 BA.debugLineNum = 1442;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(2);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 1444;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(8);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1445;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese clave del";
Debug.ShouldStop(16);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese clave del descuento"));
 BA.debugLineNum = 1446;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(32);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1448;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "fx_insertar_dscto_global_permiso"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1449;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1450;BA.debugLine="Clave = InputTemplate.Text";
Debug.ShouldStop(512);
_clave = _inputtemplate.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("Clave", _clave);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1452;BA.debugLine="Return 0";
Debug.ShouldStop(2048);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1455;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(16384);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 1457;BA.debugLine="If Clave = \"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_clave,BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1458;BA.debugLine="Msgbox2Async(\"No se ingreso ninguna clave\" , \"Va";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se ingreso ninguna clave")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1459;BA.debugLine="Return 0";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1462;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Usa";
Debug.ShouldStop(2097152);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_usar_dscto_poswii" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.getObject()),(Object)(_clave),(Object)(BA.ObjectToString(parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1463;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "fx_insertar_dscto_global_permiso"), (_js));
this.state = 40;
return;
case 40:
//C
this.state = 11;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1465;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 11:
//if
this.state = 38;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 37;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1467;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(67108864);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1468;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(134217728);
if (true) break;

case 14:
//if
this.state = 35;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1470;BA.debugLine="Dim FilaDscto As Map = Funciones.Fx_DataRow(Js.";
Debug.ShouldStop(536870912);
_filadscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filadscto = parent.mostCurrent._funciones.runMethod(false,"_fx_datarow" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("FilaDscto", _filadscto);Debug.locals.put("FilaDscto", _filadscto);
 BA.debugLineNum = 1472;BA.debugLine="Existe = FilaDscto.Get(\"Existe\")";
Debug.ShouldStop(-2147483648);
_existe = BA.ObjectToBoolean(_filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Existe")))));Debug.locals.put("Existe", _existe);
 BA.debugLineNum = 1473;BA.debugLine="Otorgado = FilaDscto.Get(\"Otorgado\")";
Debug.ShouldStop(1);
_otorgado = BA.ObjectToBoolean(_filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Otorgado")))));Debug.locals.put("Otorgado", _otorgado);
 BA.debugLineNum = 1474;BA.debugLine="DescuentoPorc = FilaDscto.Get(\"Descuento\")";
Debug.ShouldStop(2);
_descuentoporc = BA.numberCast(int.class, _filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Descuento")))));Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 1476;BA.debugLine="If Existe Then";
Debug.ShouldStop(8);
if (true) break;

case 17:
//if
this.state = 34;
if (_existe.<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 33;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1477;BA.debugLine="If Otorgado Then";
Debug.ShouldStop(16);
if (true) break;

case 20:
//if
this.state = 31;
if (_otorgado.<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 31;
 BA.debugLineNum = 1478;BA.debugLine="Msgbox2Async(\"Este descuento ya fue utilizado";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Este descuento ya fue utilizado")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1479;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(64);
_descuentoporc = BA.numberCast(int.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1481;BA.debugLine="If DescuentoPorc <=0 Then";
Debug.ShouldStop(256);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("k",_descuentoporc,BA.numberCast(double.class, 0))) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 1482;BA.debugLine="Msgbox2Async(\"No se puede incorporar este de";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No se puede incorporar este descuento, ya que no es un valor valido."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Porc.Dscto: "),_descuentoporc,RemoteObject.createImmutable("%")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1484;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(2048);
_descuentoporc = BA.numberCast(int.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1486;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button";
Debug.ShouldStop(8192);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 1487;BA.debugLine="Msgbox2Async(\"Descuento aceptado.\" & CRLF &";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Descuento aceptado."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Porc.Dscto: "),_descuentoporc,RemoteObject.createImmutable("%")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
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
 BA.debugLineNum = 1491;BA.debugLine="Msgbox2Async(\"No se reconoce la clave para el";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No se reconoce la clave para el descuento")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 38;
;
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1496;BA.debugLine="Msgbox2Async(\"Error de conexión con el servidor\"";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error de conexión con el servidor")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_producto.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 1499;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1500;BA.debugLine="Return DescuentoPorc";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_descuentoporc));return;};
 BA.debugLineNum = 1502;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim Consulta_Sql As String";
frm_post_01_producto.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim xui As XUI";
frm_post_01_producto.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 25;BA.debugLine="Private Txt_Codigo As EditText";
frm_post_01_producto.mostCurrent._txt_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Lbl_Descripcion As Label";
frm_post_01_producto.mostCurrent._lbl_descripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Lbl_Ubicacion As Label";
frm_post_01_producto.mostCurrent._lbl_ubicacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Lbl_Stock As Label";
frm_post_01_producto.mostCurrent._lbl_stock = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Txt_Cantidad As EditText";
frm_post_01_producto.mostCurrent._txt_cantidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Lbl_Precio As Label";
frm_post_01_producto.mostCurrent._lbl_precio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Lbl_Descuento As Label";
frm_post_01_producto.mostCurrent._lbl_descuento = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Lbl_Total As Label";
frm_post_01_producto.mostCurrent._lbl_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim Fila_Enc As Map";
frm_post_01_producto.mostCurrent._fila_enc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 35;BA.debugLine="Dim Fila As Map";
frm_post_01_producto.mostCurrent._fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 36;BA.debugLine="Dim Fila_Id As Map";
frm_post_01_producto.mostCurrent._fila_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 37;BA.debugLine="Dim Fila_Dscto As Map";
frm_post_01_producto.mostCurrent._fila_dscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 38;BA.debugLine="Dim RowProducto As Map";
frm_post_01_producto.mostCurrent._rowproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 39;BA.debugLine="Dim TblDescuentos As List";
frm_post_01_producto.mostCurrent._tbldescuentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 41;BA.debugLine="Dim Procesar_Dscto As Boolean";
frm_post_01_producto._procesar_dscto = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 43;BA.debugLine="Private Btn_Aceptar As Button";
frm_post_01_producto.mostCurrent._btn_aceptar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Btn_Eliminar As Button";
frm_post_01_producto.mostCurrent._btn_eliminar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim TecladoSoft As IME ' biblioteca IME";
frm_post_01_producto.mostCurrent._tecladosoft = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 48;BA.debugLine="Dim TotalNetoDoc As Double";
frm_post_01_producto._totalnetodoc = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 49;BA.debugLine="Dim TotalBrutoDoc As Double";
frm_post_01_producto._totalbrutodoc = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 50;BA.debugLine="Dim Total_Linea As Double";
frm_post_01_producto._total_linea = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 52;BA.debugLine="Dim ChkValores As Boolean";
frm_post_01_producto._chkvalores = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 54;BA.debugLine="Dim FUNCIONARIO As String";
frm_post_01_producto.mostCurrent._funcionario = RemoteObject.createImmutable("");
 //BA.debugLineNum = 56;BA.debugLine="Private XclvDescuentos As CustomListView";
frm_post_01_producto.mostCurrent._xclvdescuentos = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 57;BA.debugLine="Private Lbl_Kodt As B4XView";
frm_post_01_producto.mostCurrent._lbl_kodt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private Lbl_Item As B4XView";
frm_post_01_producto.mostCurrent._lbl_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Lbl_Podt As B4XView";
frm_post_01_producto.mostCurrent._lbl_podt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private Lbl_Vadt As B4XView";
frm_post_01_producto.mostCurrent._lbl_vadt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Btn_Editar_Descuento As Button";
frm_post_01_producto.mostCurrent._btn_editar_descuento = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Btn_Revisar_Stock As Button";
frm_post_01_producto.mostCurrent._btn_revisar_stock = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Btn_Ubicacion As Button";
frm_post_01_producto.mostCurrent._btn_ubicacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Lbl_ModoConsulta As Label";
frm_post_01_producto.mostCurrent._lbl_modoconsulta = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private Lbl_Bodega As Label";
frm_post_01_producto.mostCurrent._lbl_bodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private Lbl_ListaPrecio As Label";
frm_post_01_producto.mostCurrent._lbl_listaprecio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private Btn_Editar_Precio As Button";
frm_post_01_producto.mostCurrent._btn_editar_precio = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Dim Cl_PermisoX As Cl_PermisoXui";
frm_post_01_producto.mostCurrent._cl_permisox = RemoteObject.createNew ("BaKapp.Movil.Tag.cl_permisoxui");
 //BA.debugLineNum = 73;BA.debugLine="Dim bmp1 As Bitmap";
frm_post_01_producto.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Id_DocDet As Int";
frm_post_01_producto._id_docdet = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Public Editar As Boolean";
frm_post_01_producto._editar = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 12;BA.debugLine="Public ModoConsulta As Boolean";
frm_post_01_producto._modoconsulta = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 13;BA.debugLine="Public Msj As Mensajes";
frm_post_01_producto._msj = RemoteObject.createNew ("BaKapp.Movil.Tag.mensajes");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _revisar_stock() throws Exception{
try {
		Debug.PushSubsStack("Revisar_Stock (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1691);
if (RapidSub.canDelegate("revisar_stock")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","revisar_stock");}
ResumableSub_Revisar_Stock rsub = new ResumableSub_Revisar_Stock(null);
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
public static class ResumableSub_Revisar_Stock extends BA.ResumableSub {
public ResumableSub_Revisar_Stock(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _tblstockxbodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _searchtemplatestock = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stock = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Revisar_Stock (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1691);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1693;BA.debugLine="Private xui As XUI";
Debug.ShouldStop(268435456);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1694;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(536870912);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 1695;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(1073741824);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 1696;BA.debugLine="Private Msj As Mensajes";
Debug.ShouldStop(-2147483648);
parent._msj = RemoteObject.createNew ("BaKapp.Movil.Tag.mensajes");
 BA.debugLineNum = 1698;BA.debugLine="Msj.Initialize";
Debug.ShouldStop(2);
parent._msj.runClassMethod (BaKapp.Movil.Tag.mensajes.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.processBA);
 BA.debugLineNum = 1700;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(8);
parent.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 BA.debugLineNum = 1702;BA.debugLine="Consulta_Sql = \"Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO";
Debug.ShouldStop(32);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Tb.NOKOBO As BODEGA,STFI1"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEST Ms"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where KOPR = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"));
 BA.debugLineNum = 1707;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1024);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(frm_post_01_producto.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1708;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "revisar_stock"), (_js));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1710;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 20;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1712;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(32768);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1714;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 19;
 BA.debugLineNum = 1716;BA.debugLine="Msj.Detalle = \"Información\"";
Debug.ShouldStop(524288);
parent._msj.setField ("_detalle" /*RemoteObject*/ ,BA.ObjectToString("Información"));
 BA.debugLineNum = 1717;BA.debugLine="Msj.Mensaje = \"No existe información\"";
Debug.ShouldStop(1048576);
parent._msj.setField ("_mensaje" /*RemoteObject*/ ,BA.ObjectToString("No existe información"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1721;BA.debugLine="Log(\"Traer Stock x bodega\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","225100318",RemoteObject.createImmutable("Traer Stock x bodega"),0);
 BA.debugLineNum = 1722;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
Debug.ShouldStop(33554432);
_tblstockxbodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tblstockxbodega = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_vjson));Debug.locals.put("TblStockXbodega", _tblstockxbodega);Debug.locals.put("TblStockXbodega", _tblstockxbodega);
 BA.debugLineNum = 1724;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
Debug.ShouldStop(134217728);
_searchtemplatestock = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");Debug.locals.put("SearchTemplateStock", _searchtemplatestock);
 BA.debugLineNum = 1725;BA.debugLine="SearchTemplateStock.Initialize";
Debug.ShouldStop(268435456);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1727;BA.debugLine="Dim Items As List";
Debug.ShouldStop(1073741824);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 1728;BA.debugLine="Items.Initialize";
Debug.ShouldStop(-2147483648);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 1730;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
Debug.ShouldStop(2);
if (true) break;

case 9:
//for
this.state = 12;
_vfilastb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group22 = _tblstockxbodega;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("vFilaStb", _vfilastb);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 12;
if (index22 < groupLen22) {
this.state = 11;
_vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("vFilaStb", _vfilastb);}
if (true) break;

case 23:
//C
this.state = 22;
index22++;
Debug.locals.put("vFilaStb", _vfilastb);
if (true) break;

case 11:
//C
this.state = 23;
 BA.debugLineNum = 1732;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
Debug.ShouldStop(8);
_stock = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Stock", _stock);Debug.locals.put("Stock", _stock);
 BA.debugLineNum = 1733;BA.debugLine="Dim Bodega As String";
Debug.ShouldStop(16);
_bodega = RemoteObject.createImmutable("");Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1736;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
Debug.ShouldStop(128);
_bodega = BA.ObjectToString(_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BODEGA")))));Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1741;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
Debug.ShouldStop(4096);
_bodega = parent.mostCurrent._funciones.runMethod(true,"_rellenar_derecha" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_bodega.runMethod(true,"trim")),(Object)(BA.numberCast(int.class, 20)),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1743;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
Debug.ShouldStop(16384);
_name = RemoteObject.concat(_bodega,RemoteObject.createImmutable(" "),_stock);Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 1744;BA.debugLine="Items.Add(vFilaStb)";
Debug.ShouldStop(32768);
_items.runVoidMethod ("Add",(Object)((_vfilastb.getObject())));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("vFilaStb", _vfilastb);
;
 BA.debugLineNum = 1748;BA.debugLine="SearchTemplateStock.SetItems(Items)";
Debug.ShouldStop(524288);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 1750;BA.debugLine="Base = Activity";
Debug.ShouldStop(2097152);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 1751;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(4194304);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 1752;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
Debug.ShouldStop(8388608);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Stock X Bodega")));
 BA.debugLineNum = 1754;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "revisar_stock"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_searchtemplatestock)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CERRAR")))));
this.state = 24;
return;
case 24:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1755;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 1756;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(134217728);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1757;BA.debugLine="Msj.Resultado = SearchTemplateStock.SelectedIt";
Debug.ShouldStop(268435456);
parent._msj.setField ("_resultado" /*RemoteObject*/ ,_searchtemplatestock.getField(true,"_selecteditem" /*RemoteObject*/ ));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1759;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(1073741824);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1760;BA.debugLine="Msj.Resultado = \"\"";
Debug.ShouldStop(-2147483648);
parent._msj.setField ("_resultado" /*RemoteObject*/ ,BA.ObjectToString(""));
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
 BA.debugLineNum = 1767;BA.debugLine="Return Msj";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent._msj));return;};
 BA.debugLineNum = 1769;BA.debugLine="End Sub";
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
public static RemoteObject  _revisar_stockvillar() throws Exception{
try {
		Debug.PushSubsStack("Revisar_StockVillar (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1606);
if (RapidSub.canDelegate("revisar_stockvillar")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","revisar_stockvillar");}
ResumableSub_Revisar_StockVillar rsub = new ResumableSub_Revisar_StockVillar(null);
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
public static class ResumableSub_Revisar_StockVillar extends BA.ResumableSub {
public ResumableSub_Revisar_StockVillar(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _tblstockxbodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _searchtemplatestock = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stock = RemoteObject.createImmutable("");
RemoteObject _bodega = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group25;
int index25;
int groupLen25;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Revisar_StockVillar (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1606);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1608;BA.debugLine="Private xui As XUI";
Debug.ShouldStop(128);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1609;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(256);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 1610;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(512);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 1611;BA.debugLine="Private Msj As Mensajes";
Debug.ShouldStop(1024);
parent._msj = RemoteObject.createNew ("BaKapp.Movil.Tag.mensajes");
 BA.debugLineNum = 1613;BA.debugLine="Msj.Initialize";
Debug.ShouldStop(4096);
parent._msj.runClassMethod (BaKapp.Movil.Tag.mensajes.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.processBA);
 BA.debugLineNum = 1615;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(16384);
parent.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 BA.debugLineNum = 1617;BA.debugLine="Consulta_Sql = \"Select Isnull((SELECT TOP 1 KOBO+";
Debug.ShouldStop(65536);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Isnull((SELECT TOP 1 KOBO+'-'+NOKOBO FROM TABBO Tb WHERE Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO),'') As BODEGA,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("EMPRESA,KOSU,KOBO,Case When KOSU = '02' And KOBO = '02' Then (Select Sum(STOCK) From [@STOCK_WMS] Where SKU = KOPR) Else STFI1 End As STFI1"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEST Ms"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where KOPR = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("And EMPRESA+KOSU+KOBO In (Select EMPRESA+KOSU+KOBO From TABBO)"));
 BA.debugLineNum = 1623;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STOCK";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 1625;BA.debugLine="Consulta_Sql = \"Select 'ALAMEDA' As BODEGA,STOCK";
Debug.ShouldStop(16777216);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select 'ALAMEDA' As BODEGA,STOCK_ALAMEDA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Union"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Select 'ENEA' As BODEGA,STOCK_ENEA As STFI1 From [@WMS_GATEWAY_STOCK] Where SKU = '"),parent.mostCurrent._txt_codigo.runMethod(true,"getText"),RemoteObject.createImmutable("'"));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1631;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1073741824);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(frm_post_01_producto.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 1632;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "revisar_stockvillar"), (_js));
this.state = 29;
return;
case 29:
//C
this.state = 5;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 1634;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 28;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1636;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 1638;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(32);
if (true) break;

case 8:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 27;
 BA.debugLineNum = 1640;BA.debugLine="Msj.Detalle = \"Información\"";
Debug.ShouldStop(128);
parent._msj.setField ("_detalle" /*RemoteObject*/ ,BA.ObjectToString("Información"));
 BA.debugLineNum = 1641;BA.debugLine="Msj.Mensaje = \"No existe información\"";
Debug.ShouldStop(256);
parent._msj.setField ("_mensaje" /*RemoteObject*/ ,BA.ObjectToString("No existe información"));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1645;BA.debugLine="Log(\"Traer Stock x bodega\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","225034791",RemoteObject.createImmutable("Traer Stock x bodega"),0);
 BA.debugLineNum = 1646;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
Debug.ShouldStop(8192);
_tblstockxbodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tblstockxbodega = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_vjson));Debug.locals.put("TblStockXbodega", _tblstockxbodega);Debug.locals.put("TblStockXbodega", _tblstockxbodega);
 BA.debugLineNum = 1648;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
Debug.ShouldStop(32768);
_searchtemplatestock = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");Debug.locals.put("SearchTemplateStock", _searchtemplatestock);
 BA.debugLineNum = 1649;BA.debugLine="SearchTemplateStock.Initialize";
Debug.ShouldStop(65536);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1651;BA.debugLine="Dim Items As List";
Debug.ShouldStop(262144);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 1652;BA.debugLine="Items.Initialize";
Debug.ShouldStop(524288);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 1654;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//for
this.state = 22;
_vfilastb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group25 = _tblstockxbodega;
index25 = 0;
groupLen25 = group25.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("vFilaStb", _vfilastb);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 22;
if (index25 < groupLen25) {
this.state = 15;
_vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group25.runMethod(false,"Get",index25));Debug.locals.put("vFilaStb", _vfilastb);}
if (true) break;

case 31:
//C
this.state = 30;
index25++;
Debug.locals.put("vFilaStb", _vfilastb);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1656;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
Debug.ShouldStop(8388608);
_stock = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Stock", _stock);Debug.locals.put("Stock", _stock);
 BA.debugLineNum = 1657;BA.debugLine="Dim Bodega As String";
Debug.ShouldStop(16777216);
_bodega = RemoteObject.createImmutable("");Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1659;BA.debugLine="If Variables.Global_ExisteTabla_MS_GATEWAY_STO";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//if
this.state = 21;
if (parent.mostCurrent._variables._global_existetabla_ms_gateway_stock /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 1660;BA.debugLine="Bodega = vFilaStb.Get(\"BODEGA\")";
Debug.ShouldStop(134217728);
_bodega = BA.ObjectToString(_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BODEGA")))));Debug.locals.put("Bodega", _bodega);
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1662;BA.debugLine="Bodega = Funciones.Mid(vFilaStb.Get(\"BODEGA\")";
Debug.ShouldStop(536870912);
_bodega = parent.mostCurrent._funciones.runMethod(true,"_mid" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(BA.ObjectToString(_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BODEGA")))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("Bodega", _bodega);
 if (true) break;

case 21:
//C
this.state = 31;
;
 BA.debugLineNum = 1665;BA.debugLine="Bodega = Funciones.Rellenar_Derecha(Bodega.Tri";
Debug.ShouldStop(1);
_bodega = parent.mostCurrent._funciones.runMethod(true,"_rellenar_derecha" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_bodega.runMethod(true,"trim")),(Object)(BA.numberCast(int.class, 20)),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("Bodega", _bodega);
 BA.debugLineNum = 1667;BA.debugLine="Dim Name As String = Bodega & \" \" & Stock";
Debug.ShouldStop(4);
_name = RemoteObject.concat(_bodega,RemoteObject.createImmutable(" "),_stock);Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 1668;BA.debugLine="Items.Add(Name)";
Debug.ShouldStop(8);
_items.runVoidMethod ("Add",(Object)((_name)));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("vFilaStb", _vfilastb);
;
 BA.debugLineNum = 1672;BA.debugLine="SearchTemplateStock.SetItems(Items)";
Debug.ShouldStop(128);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_items));
 BA.debugLineNum = 1674;BA.debugLine="Base = Activity";
Debug.ShouldStop(512);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 1675;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1024);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 1676;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
Debug.ShouldStop(2048);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Stock X Bodega")));
 BA.debugLineNum = 1678;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateSto";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "revisar_stockvillar"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_searchtemplatestock)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CERRAR")))));
this.state = 32;
return;
case 32:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1679;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1680;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(32768);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
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
 BA.debugLineNum = 1687;BA.debugLine="Return Msj";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent._msj));return;};
 BA.debugLineNum = 1689;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _sb_cargar_descuentos() throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Descuentos (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1329);
if (RapidSub.canDelegate("sb_cargar_descuentos")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","sb_cargar_descuentos");}
RemoteObject _id_docenc = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _idlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rownumber = RemoteObject.createImmutable(0);
RemoteObject _itemstr = RemoteObject.createImmutable("");
RemoteObject _kodt = RemoteObject.createImmutable(0);
RemoteObject _podt = RemoteObject.createImmutable(0);
RemoteObject _vadt = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1329;BA.debugLine="Sub Sb_Cargar_Descuentos()'(Cargar_Activity As Boo";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1331;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
Debug.ShouldStop(262144);
frm_post_01_producto._id_docdet = BA.numberCast(int.class, frm_post_01_producto.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 1332;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
Debug.ShouldStop(524288);
_id_docenc = BA.numberCast(int.class, frm_post_01_producto.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));Debug.locals.put("Id_DocEnc", _id_docenc);Debug.locals.put("Id_DocEnc", _id_docenc);
 BA.debugLineNum = 1340;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(134217728);
frm_post_01_producto.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1341;BA.debugLine="XclvDescuentos.DefaultTextBackgroundColor = Color";
Debug.ShouldStop(268435456);
frm_post_01_producto.mostCurrent._xclvdescuentos.setField ("_defaulttextbackgroundcolor",frm_post_01_producto.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 1342;BA.debugLine="XclvDescuentos.Clear";
Debug.ShouldStop(536870912);
frm_post_01_producto.mostCurrent._xclvdescuentos.runVoidMethod ("_clear");
 BA.debugLineNum = 1343;BA.debugLine="Private Row As Int";
Debug.ShouldStop(1073741824);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 1344;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(-2147483648);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 1346;BA.debugLine="Private IDList As List";
Debug.ShouldStop(2);
_idlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("IDList", _idlist);
 BA.debugLineNum = 1347;BA.debugLine="IDList.Initialize";
Debug.ShouldStop(4);
_idlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1349;BA.debugLine="Dim RowNumber As Int = 0";
Debug.ShouldStop(16);
_rownumber = BA.numberCast(int.class, 0);Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 1350;BA.debugLine="Dim ItemStr As String";
Debug.ShouldStop(32);
_itemstr = RemoteObject.createImmutable("");Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 1352;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(\"Select Id_Doc";
Debug.ShouldStop(128);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), frm_post_01_producto.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original "),RemoteObject.createImmutable("From Descuentos_Doc Where Id_DocEnc = "),_id_docenc,RemoteObject.createImmutable(" And Id_DocDet = "),frm_post_01_producto._id_docdet))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 1355;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1357;BA.debugLine="RowNumber = Cursor1.RowCount";
Debug.ShouldStop(4096);
_rownumber = _cursor1.runMethod(true,"getRowCount");Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 1359;BA.debugLine="For Row = 0 To RowNumber - 1";
Debug.ShouldStop(16384);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_rownumber,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step15 > 0 && _row.<Integer>get().intValue() <= limit15) || (step15 < 0 && _row.<Integer>get().intValue() >= limit15) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step15))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 1361;BA.debugLine="Cursor1.Position = Row";
Debug.ShouldStop(65536);
_cursor1.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 1362;BA.debugLine="IDList.Add(Cursor1.GetString2(0))";
Debug.ShouldStop(131072);
_idlist.runVoidMethod ("Add",(Object)((_cursor1.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 1365;BA.debugLine="Dim Kodt As Double = Cursor1.GetString(\"Kodt\")";
Debug.ShouldStop(1048576);
_kodt = BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Kodt"))));Debug.locals.put("Kodt", _kodt);Debug.locals.put("Kodt", _kodt);
 BA.debugLineNum = 1366;BA.debugLine="Dim Podt As Double = Cursor1.GetString(\"Podt\")";
Debug.ShouldStop(2097152);
_podt = BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Podt"))));Debug.locals.put("Podt", _podt);Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 1367;BA.debugLine="Dim Vadt As Double = Cursor1.GetString(\"Vadt\")";
Debug.ShouldStop(4194304);
_vadt = BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Vadt"))));Debug.locals.put("Vadt", _vadt);Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 1381;BA.debugLine="Dim Item As Int = Row+1";
Debug.ShouldStop(16);
_item = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1382;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
Debug.ShouldStop(32);
_itemstr = frm_post_01_producto.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(BA.NumberToString(_item)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 1387;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = frm_post_01_producto.mostCurrent._xui.runMethod(false,"CreatePanel",frm_post_01_producto.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1389;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsVi";
Debug.ShouldStop(4096);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(frm_post_01_producto.mostCurrent._xclvdescuentos.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(frm_post_01_producto.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))));
 BA.debugLineNum = 1390;BA.debugLine="p.LoadLayout(\"Items_Detalle\")";
Debug.ShouldStop(8192);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_Detalle")),frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 1391;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(16384);
_p.runMethod(true,"setColor",frm_post_01_producto.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 1393;BA.debugLine="Lbl_Kodt.Tag = Kodt";
Debug.ShouldStop(65536);
frm_post_01_producto.mostCurrent._lbl_kodt.runMethod(false,"setTag",(_kodt));
 BA.debugLineNum = 1394;BA.debugLine="Lbl_Kodt.Text = Kodt";
Debug.ShouldStop(131072);
frm_post_01_producto.mostCurrent._lbl_kodt.runMethod(true,"setText",BA.ObjectToCharSequence(_kodt));
 BA.debugLineNum = 1396;BA.debugLine="Lbl_Podt.Tag = Podt";
Debug.ShouldStop(524288);
frm_post_01_producto.mostCurrent._lbl_podt.runMethod(false,"setTag",(_podt));
 BA.debugLineNum = 1397;BA.debugLine="Lbl_Podt.Text = Podt";
Debug.ShouldStop(1048576);
frm_post_01_producto.mostCurrent._lbl_podt.runMethod(true,"setText",BA.ObjectToCharSequence(_podt));
 BA.debugLineNum = 1399;BA.debugLine="Lbl_Vadt.Tag = Vadt";
Debug.ShouldStop(4194304);
frm_post_01_producto.mostCurrent._lbl_vadt.runMethod(false,"setTag",(_vadt));
 BA.debugLineNum = 1400;BA.debugLine="Lbl_Vadt.Text = Vadt";
Debug.ShouldStop(8388608);
frm_post_01_producto.mostCurrent._lbl_vadt.runMethod(true,"setText",BA.ObjectToCharSequence(_vadt));
 BA.debugLineNum = 1402;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
Debug.ShouldStop(33554432);
frm_post_01_producto.mostCurrent._lbl_item.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Item: "),_itemstr)));
 BA.debugLineNum = 1411;BA.debugLine="XclvDescuentos.Add(p,\"\")";
Debug.ShouldStop(4);
frm_post_01_producto.mostCurrent._xclvdescuentos.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 1416;BA.debugLine="ToastMessageShow(\"No items found\", False)";
Debug.ShouldStop(128);
frm_post_01_producto.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No items found")),(Object)(frm_post_01_producto.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1419;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(1024);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 1423;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_insertar_descuentos_en_escala() throws Exception{
try {
		Debug.PushSubsStack("Sb_Insertar_Descuentos_En_Escala (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1049);
if (RapidSub.canDelegate("sb_insertar_descuentos_en_escala")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","sb_insertar_descuentos_en_escala");}
ResumableSub_Sb_Insertar_Descuentos_En_Escala rsub = new ResumableSub_Sb_Insertar_Descuentos_En_Escala(null);
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
public static class ResumableSub_Sb_Insertar_Descuentos_En_Escala extends BA.ResumableSub {
public ResumableSub_Sb_Insertar_Descuentos_En_Escala(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _id_docenc = RemoteObject.createImmutable(0);
RemoteObject _nrodscto = RemoteObject.createImmutable(0);
RemoteObject _precio = RemoteObject.createImmutable(0);
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
int step26;
int limit26;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Insertar_Descuentos_En_Escala (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1049);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1051;BA.debugLine="ProgressDialogShow(\"Buscando productos...\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_post_01_producto.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando productos..."))));
 BA.debugLineNum = 1053;BA.debugLine="Id_DocDet= Fila.Get(\"id_docdet\")";
Debug.ShouldStop(268435456);
parent._id_docdet = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docdet")))));
 BA.debugLineNum = 1054;BA.debugLine="Dim Id_DocEnc As Int = Fila.Get(\"id_docenc\")";
Debug.ShouldStop(536870912);
_id_docenc = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_docenc")))));Debug.locals.put("Id_DocEnc", _id_docenc);Debug.locals.put("Id_DocEnc", _id_docenc);
 BA.debugLineNum = 1056;BA.debugLine="Dim NroDscto As Int = 0";
Debug.ShouldStop(-2147483648);
_nrodscto = BA.numberCast(int.class, 0);Debug.locals.put("NroDscto", _nrodscto);Debug.locals.put("NroDscto", _nrodscto);
 BA.debugLineNum = 1057;BA.debugLine="Dim Precio As Double = Lbl_Precio.Tag";
Debug.ShouldStop(1);
_precio = BA.numberCast(double.class, parent.mostCurrent._lbl_precio.runMethod(false,"getTag"));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 1065;BA.debugLine="Dim Valor As Double = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(256);
_valor = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));Debug.locals.put("Valor", _valor);Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 1067;BA.debugLine="Dim Total_Descuento As Double";
Debug.ShouldStop(1024);
_total_descuento = RemoteObject.createImmutable(0);Debug.locals.put("Total_Descuento", _total_descuento);
 BA.debugLineNum = 1068;BA.debugLine="Dim Total_Pc As Double";
Debug.ShouldStop(2048);
_total_pc = RemoteObject.createImmutable(0);Debug.locals.put("Total_Pc", _total_pc);
 BA.debugLineNum = 1070;BA.debugLine="If Fila_Dscto.IsInitialized Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._fila_dscto.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1071;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos_";
Debug.ShouldStop(16384);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Descuentos_Doc")),(Object)(parent.mostCurrent._fila_dscto));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1074;BA.debugLine="Dim Decimales As Int";
Debug.ShouldStop(131072);
_decimales = RemoteObject.createImmutable(0);Debug.locals.put("Decimales", _decimales);
 BA.debugLineNum = 1076;BA.debugLine="Dim Moneda_Det As String '= _Fila.Cells(\"Moneda\")";
Debug.ShouldStop(524288);
_moneda_det = RemoteObject.createImmutable("");Debug.locals.put("Moneda_Det", _moneda_det);
 BA.debugLineNum = 1077;BA.debugLine="Dim Moneda_Enc As String '= _TblEncabezado.Rows(0";
Debug.ShouldStop(1048576);
_moneda_enc = RemoteObject.createImmutable("");Debug.locals.put("Moneda_Enc", _moneda_enc);
 BA.debugLineNum = 1079;BA.debugLine="Dim Tipo_Moneda_Enc As String '= _TblEncabezado.R";
Debug.ShouldStop(4194304);
_tipo_moneda_enc = RemoteObject.createImmutable("");Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);
 BA.debugLineNum = 1080;BA.debugLine="Dim Tipo_Cambio_Ent As Double '= _TblEncabezado.R";
Debug.ShouldStop(8388608);
_tipo_cambio_ent = RemoteObject.createImmutable(0);Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);
 BA.debugLineNum = 1082;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
Debug.ShouldStop(33554432);
if (true) break;

case 5:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_moneda_det.runMethod(true,"trim"),_moneda_enc.runMethod(true,"trim"))) { 
this.state = 7;
}else {
this.state = 13;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1083;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1084;BA.debugLine="Decimales = 2";
Debug.ShouldStop(134217728);
_decimales = BA.numberCast(int.class, 2);Debug.locals.put("Decimales", _decimales);
 if (true) break;

case 11:
//C
this.state = 18;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1087;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1088;BA.debugLine="Decimales = 2";
Debug.ShouldStop(-2147483648);
_decimales = BA.numberCast(int.class, 2);Debug.locals.put("Decimales", _decimales);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
 BA.debugLineNum = 1100;BA.debugLine="For i = 0 To TblDescuentos.Size - 1";
Debug.ShouldStop(2048);

case 18:
//for
this.state = 47;
step26 = 1;
limit26 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._tbldescuentos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 51;
if (true) break;

case 51:
//C
this.state = 47;
if ((step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26)) this.state = 20;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step26)) ;
Debug.locals.put("i", _i);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1102;BA.debugLine="Dim FilaDscto As Map = TblDescuentos.Get(i) ' Co";
Debug.ShouldStop(8192);
_filadscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filadscto = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent._tbldescuentos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("FilaDscto", _filadscto);Debug.locals.put("FilaDscto", _filadscto);
 BA.debugLineNum = 1107;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"'FilaDscto.Get(";
Debug.ShouldStop(262144);
_kodt = BA.ObjectToString("D_SIN_TIPO");Debug.locals.put("Kodt", _kodt);Debug.locals.put("Kodt", _kodt);
 BA.debugLineNum = 1108;BA.debugLine="Dim Podt As Double = FilaDscto.Get(\"Dscto\")";
Debug.ShouldStop(524288);
_podt = BA.numberCast(double.class, _filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Dscto")))));Debug.locals.put("Podt", _podt);Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 1109;BA.debugLine="Dim Vadt As Double = FilaDscto.Get(\"Valor\")";
Debug.ShouldStop(1048576);
_vadt = BA.numberCast(double.class, _filadscto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Valor")))));Debug.locals.put("Vadt", _vadt);Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 1111;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 21:
//if
this.state = 46;
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("!",_vadt,BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1113;BA.debugLine="If Podt <> 0 Then '_TCampo = \"Dp\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 24:
//if
this.state = 41;
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0))) { 
this.state = 26;
}else {
this.state = 34;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1115;BA.debugLine="If Podt > 0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean(">",_podt,BA.numberCast(double.class, 0))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 1116;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
Debug.ShouldStop(134217728);
_vadt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_podt,RemoteObject.createImmutable(100)}, "/",0, 0)),_valor}, "*",0, 0)),(Object)(_decimales));Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 1119;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
Debug.ShouldStop(1073741824);
_podt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_vadt,_valor}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Podt", _podt);
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1122;BA.debugLine="Vadt = 0";
Debug.ShouldStop(2);
_vadt = BA.numberCast(double.class, 0);Debug.locals.put("Vadt", _vadt);
 if (true) break;

case 32:
//C
this.state = 41;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1127;BA.debugLine="If Vadt <> 0 Then";
Debug.ShouldStop(64);
if (true) break;

case 35:
//if
this.state = 40;
if (RemoteObject.solveBoolean("!",_vadt,BA.numberCast(double.class, 0))) { 
this.state = 37;
}else {
this.state = 39;
}if (true) break;

case 37:
//C
this.state = 40;
 BA.debugLineNum = 1129;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
Debug.ShouldStop(256);
_podt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_vadt,_valor}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Podt", _podt);
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 1132;BA.debugLine="Podt = 0";
Debug.ShouldStop(2048);
_podt = BA.numberCast(double.class, 0);Debug.locals.put("Podt", _podt);
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 1137;BA.debugLine="Podt = Round2(Podt,Decimales)";
Debug.ShouldStop(65536);
_podt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_podt),(Object)(_decimales));Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 1139;BA.debugLine="If Podt <> 0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 1141;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
Debug.ShouldStop(1048576);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)");
 BA.debugLineNum = 1142;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
Debug.ShouldStop(2097152);
parent.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(parent.mostCurrent._consulta_sql),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_id_docenc),(parent._id_docdet),RemoteObject.createImmutable(("")),(_kodt),(_podt),(_vadt),(_podt)})))));
 BA.debugLineNum = 1144;BA.debugLine="NroDscto = NroDscto + 1";
Debug.ShouldStop(8388608);
_nrodscto = RemoteObject.solve(new RemoteObject[] {_nrodscto,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NroDscto", _nrodscto);
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 1148;BA.debugLine="Total_Descuento = Total_Descuento + Vadt";
Debug.ShouldStop(134217728);
_total_descuento = RemoteObject.solve(new RemoteObject[] {_total_descuento,_vadt}, "+",1, 0);Debug.locals.put("Total_Descuento", _total_descuento);
 BA.debugLineNum = 1149;BA.debugLine="Valor = Valor - Vadt";
Debug.ShouldStop(268435456);
_valor = RemoteObject.solve(new RemoteObject[] {_valor,_vadt}, "-",1, 0);Debug.locals.put("Valor", _valor);
 if (true) break;

case 46:
//C
this.state = 52;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1155;BA.debugLine="If Total_Descuento <> 0 Then";
Debug.ShouldStop(4);

case 47:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",_total_descuento,BA.numberCast(double.class, 0))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 1156;BA.debugLine="Total_Pc = Total_Descuento / Precio";
Debug.ShouldStop(8);
_total_pc = RemoteObject.solve(new RemoteObject[] {_total_descuento,_precio}, "/",0, 0);Debug.locals.put("Total_Pc", _total_pc);
 if (true) break;

case 50:
//C
this.state = -1;
;
 BA.debugLineNum = 1171;BA.debugLine="Fila.Put(\"descuentovalor\",Total_Descuento)";
Debug.ShouldStop(262144);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("descuentovalor"))),(Object)((_total_descuento)));
 BA.debugLineNum = 1172;BA.debugLine="Fila.Put(\"nrodscto\",NroDscto)";
Debug.ShouldStop(524288);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nrodscto"))),(Object)((_nrodscto)));
 BA.debugLineNum = 1177;BA.debugLine="Sb_Procesar_Datos(\"DescuentoValor\")";
Debug.ShouldStop(16777216);
_sb_procesar_datos(RemoteObject.createImmutable("DescuentoValor"));
 BA.debugLineNum = 1179;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1181;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _sb_procesar_datos(RemoteObject _cabeza) throws Exception{
try {
		Debug.PushSubsStack("Sb_Procesar_Datos (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,379);
if (RapidSub.canDelegate("sb_procesar_datos")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","sb_procesar_datos", _cabeza);}
ResumableSub_Sb_Procesar_Datos rsub = new ResumableSub_Sb_Procesar_Datos(null,_cabeza);
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
public static class ResumableSub_Sb_Procesar_Datos extends BA.ResumableSub {
public ResumableSub_Sb_Procesar_Datos(BaKapp.Movil.Tag.frm_post_01_producto parent,RemoteObject _cabeza) {
this.parent = parent;
this._cabeza = _cabeza;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _cabeza;
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

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Procesar_Datos (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,379);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Cabeza", _cabeza);
 BA.debugLineNum = 381;BA.debugLine="Dim UnTrans As Int = Fila.Get(\"untrans\")";
Debug.ShouldStop(268435456);
_untrans = BA.numberCast(int.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("untrans")))));Debug.locals.put("UnTrans", _untrans);Debug.locals.put("UnTrans", _untrans);
 BA.debugLineNum = 382;BA.debugLine="Dim PorIva As Double = Fila.Get(\"poriva\")";
Debug.ShouldStop(536870912);
_poriva = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("poriva")))));Debug.locals.put("PorIva", _poriva);Debug.locals.put("PorIva", _poriva);
 BA.debugLineNum = 383;BA.debugLine="Dim PorIla As Double = Fila.Get(\"porila\")";
Debug.ShouldStop(1073741824);
_porila = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("porila")))));Debug.locals.put("PorIla", _porila);Debug.locals.put("PorIla", _porila);
 BA.debugLineNum = 384;BA.debugLine="Dim Rtu As Double = Fila.Get(\"rtu\")";
Debug.ShouldStop(-2147483648);
_rtu = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rtu")))));Debug.locals.put("Rtu", _rtu);Debug.locals.put("Rtu", _rtu);
 BA.debugLineNum = 386;BA.debugLine="Dim Impuestos As  Double = 1 + ((PorIva + PorIla)";
Debug.ShouldStop(2);
_impuestos = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_poriva,_porila}, "+",1, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))}, "+",1, 0);Debug.locals.put("Impuestos", _impuestos);Debug.locals.put("Impuestos", _impuestos);
 BA.debugLineNum = 388;BA.debugLine="Dim TotalIva As Double";
Debug.ShouldStop(8);
_totaliva = RemoteObject.createImmutable(0);Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 389;BA.debugLine="Dim TotalIla As Double";
Debug.ShouldStop(16);
_totalila = RemoteObject.createImmutable(0);Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 390;BA.debugLine="Dim TotalNeto As Double";
Debug.ShouldStop(32);
_totalneto = RemoteObject.createImmutable(0);Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 391;BA.debugLine="Dim TotalBruto As Double";
Debug.ShouldStop(64);
_totalbruto = RemoteObject.createImmutable(0);Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 393;BA.debugLine="Dim TotalDsctoNeto As Double";
Debug.ShouldStop(256);
_totaldsctoneto = RemoteObject.createImmutable(0);Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 394;BA.debugLine="Dim TotalDsctoBruto As Double";
Debug.ShouldStop(512);
_totaldsctobruto = RemoteObject.createImmutable(0);Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 396;BA.debugLine="Dim Precio As Double = Lbl_Precio.Tag";
Debug.ShouldStop(2048);
_precio = BA.numberCast(double.class, parent.mostCurrent._lbl_precio.runMethod(false,"getTag"));Debug.locals.put("Precio", _precio);Debug.locals.put("Precio", _precio);
 BA.debugLineNum = 398;BA.debugLine="Dim PrecioNeto As Double";
Debug.ShouldStop(8192);
_precioneto = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 399;BA.debugLine="Dim PrecioBruto As Double";
Debug.ShouldStop(16384);
_preciobruto = RemoteObject.createImmutable(0);Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 401;BA.debugLine="Dim PrecioNetoRealUd1 As Double";
Debug.ShouldStop(65536);
_precionetorealud1 = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 402;BA.debugLine="Dim PrecioNetoRealUd2 As Double";
Debug.ShouldStop(131072);
_precionetorealud2 = RemoteObject.createImmutable(0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 404;BA.debugLine="Dim Total As Double";
Debug.ShouldStop(524288);
_total = RemoteObject.createImmutable(0);Debug.locals.put("Total", _total);
 BA.debugLineNum = 406;BA.debugLine="Dim Decimal = 2";
Debug.ShouldStop(2097152);
_decimal = BA.NumberToString(2);Debug.locals.put("Decimal", _decimal);Debug.locals.put("Decimal", _decimal);
 BA.debugLineNum = 408;BA.debugLine="Dim Cantidad As Double = Txt_Cantidad.Tag";
Debug.ShouldStop(8388608);
_cantidad = BA.numberCast(double.class, parent.mostCurrent._txt_cantidad.runMethod(false,"getTag"));Debug.locals.put("Cantidad", _cantidad);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 409;BA.debugLine="Dim CantUd1 As Double";
Debug.ShouldStop(16777216);
_cantud1 = RemoteObject.createImmutable(0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 410;BA.debugLine="Dim CantUd2 As Double";
Debug.ShouldStop(33554432);
_cantud2 = RemoteObject.createImmutable(0);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 412;BA.debugLine="Dim Divisible As String = RowProducto.Get(\"DIVISI";
Debug.ShouldStop(134217728);
_divisible = BA.ObjectToString(parent.mostCurrent._rowproducto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIVISIBLE")))));Debug.locals.put("Divisible", _divisible);Debug.locals.put("Divisible", _divisible);
 BA.debugLineNum = 413;BA.debugLine="Dim Divisible2 As String = RowProducto.Get(\"DIVIS";
Debug.ShouldStop(268435456);
_divisible2 = BA.ObjectToString(parent.mostCurrent._rowproducto.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DIVISIBLE2")))));Debug.locals.put("Divisible2", _divisible2);Debug.locals.put("Divisible2", _divisible2);
 BA.debugLineNum = 415;BA.debugLine="Dim DescuentoValor As Double = Fila.Get(\"descuent";
Debug.ShouldStop(1073741824);
_descuentovalor = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentovalor")))));Debug.locals.put("DescuentoValor", _descuentovalor);Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 416;BA.debugLine="Dim DescuentoPorc As Double = Fila.Get(\"descuento";
Debug.ShouldStop(-2147483648);
_descuentoporc = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));Debug.locals.put("DescuentoPorc", _descuentoporc);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 417;BA.debugLine="Dim DescuentoPorc_Original As Double = Fila.Get(\"";
Debug.ShouldStop(1);
_descuentoporc_original = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentoporc")))));Debug.locals.put("DescuentoPorc_Original", _descuentoporc_original);Debug.locals.put("DescuentoPorc_Original", _descuentoporc_original);
 BA.debugLineNum = 418;BA.debugLine="Dim DescMaximo As Double = Fila.Get(\"descmaximo\")";
Debug.ShouldStop(2);
_descmaximo = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descmaximo")))));Debug.locals.put("DescMaximo", _descmaximo);Debug.locals.put("DescMaximo", _descmaximo);
 BA.debugLineNum = 420;BA.debugLine="Dim Tict = Fila.Get(\"tict\")";
Debug.ShouldStop(8);
_tict = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tict")))));Debug.locals.put("Tict", _tict);Debug.locals.put("Tict", _tict);
 BA.debugLineNum = 421;BA.debugLine="Dim Prct = Fila.Get(\"prct\")";
Debug.ShouldStop(16);
_prct = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prct")))));Debug.locals.put("Prct", _prct);Debug.locals.put("Prct", _prct);
 BA.debugLineNum = 422;BA.debugLine="Dim Tipr = Fila.Get(\"tipr\")";
Debug.ShouldStop(32);
_tipr = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipr")))));Debug.locals.put("Tipr", _tipr);Debug.locals.put("Tipr", _tipr);
 BA.debugLineNum = 424;BA.debugLine="Dim CodLista As String = Fila.Get(\"codlista\")";
Debug.ShouldStop(128);
_codlista = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codlista")))));Debug.locals.put("CodLista", _codlista);Debug.locals.put("CodLista", _codlista);
 BA.debugLineNum = 426;BA.debugLine="Dim NumDsctos As Int '= _Ds_Matriz_Documentos.Tab";
Debug.ShouldStop(512);
_numdsctos = RemoteObject.createImmutable(0);Debug.locals.put("NumDsctos", _numdsctos);
 BA.debugLineNum = 428;BA.debugLine="Dim No_Aplica_Redondeo As Boolean '= Fila.Get(\"no";
Debug.ShouldStop(2048);
_no_aplica_redondeo = RemoteObject.createImmutable(false);Debug.locals.put("No_Aplica_Redondeo", _no_aplica_redondeo);
 BA.debugLineNum = 429;BA.debugLine="Dim Aplicar_Redondeo As Boolean '= Chk_Redondear_";
Debug.ShouldStop(4096);
_aplicar_redondeo = RemoteObject.createImmutable(false);Debug.locals.put("Aplicar_Redondeo", _aplicar_redondeo);
 BA.debugLineNum = 431;BA.debugLine="If No_Aplica_Redondeo Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 4;
if (_no_aplica_redondeo.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 432;BA.debugLine="Aplicar_Redondeo = False";
Debug.ShouldStop(32768);
_aplicar_redondeo = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Aplicar_Redondeo", _aplicar_redondeo);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 435;BA.debugLine="Dim TotalNeto_Calculo As Double";
Debug.ShouldStop(262144);
_totalneto_calculo = RemoteObject.createImmutable(0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 436;BA.debugLine="Dim TotalBruto_Calculo As Double";
Debug.ShouldStop(524288);
_totalbruto_calculo = RemoteObject.createImmutable(0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 438;BA.debugLine="Dim Descontar As Boolean";
Debug.ShouldStop(2097152);
_descontar = RemoteObject.createImmutable(false);Debug.locals.put("Descontar", _descontar);
 BA.debugLineNum = 439;BA.debugLine="Dim Total_Concepto As Double";
Debug.ShouldStop(4194304);
_total_concepto = RemoteObject.createImmutable(0);Debug.locals.put("Total_Concepto", _total_concepto);
 BA.debugLineNum = 445;BA.debugLine="Dim DescuentoValor_Anterior As Double = Fila.Get(";
Debug.ShouldStop(268435456);
_descuentovalor_anterior = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descuentovalor_anterior")))));Debug.locals.put("DescuentoValor_Anterior", _descuentovalor_anterior);Debug.locals.put("DescuentoValor_Anterior", _descuentovalor_anterior);
 BA.debugLineNum = 446;BA.debugLine="Dim Recargo As Double";
Debug.ShouldStop(536870912);
_recargo = RemoteObject.createImmutable(0);Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 448;BA.debugLine="If Cantidad = 0 And Tipr <> \"\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_cantidad,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("!",_tipr,BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 455;BA.debugLine="Dim Precio_Calculado As Double";
Debug.ShouldStop(64);
_precio_calculado = RemoteObject.createImmutable(0);Debug.locals.put("Precio_Calculado", _precio_calculado);
 BA.debugLineNum = 457;BA.debugLine="Dim Moneda_Enc As String = Fila_Enc.Get(\"moneda_d";
Debug.ShouldStop(256);
_moneda_enc = BA.ObjectToString(parent.mostCurrent._fila_enc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moneda_doc")))));Debug.locals.put("Moneda_Enc", _moneda_enc);Debug.locals.put("Moneda_Enc", _moneda_enc);
 BA.debugLineNum = 458;BA.debugLine="Dim Tipo_Moneda_Enc As String = Fila_Enc.Get(\"tip";
Debug.ShouldStop(512);
_tipo_moneda_enc = BA.ObjectToString(parent.mostCurrent._fila_enc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipomoneda")))));Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);Debug.locals.put("Tipo_Moneda_Enc", _tipo_moneda_enc);
 BA.debugLineNum = 459;BA.debugLine="Dim Tipo_Cambio_Ent As Double = Fila_Enc.Get(\"tas";
Debug.ShouldStop(1024);
_tipo_cambio_ent = BA.numberCast(double.class, parent.mostCurrent._fila_enc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tasadorig_doc")))));Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);Debug.locals.put("Tipo_Cambio_Ent", _tipo_cambio_ent);
 BA.debugLineNum = 461;BA.debugLine="Dim Moneda_Det As String = Fila.Get(\"moneda\")";
Debug.ShouldStop(4096);
_moneda_det = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moneda")))));Debug.locals.put("Moneda_Det", _moneda_det);Debug.locals.put("Moneda_Det", _moneda_det);
 BA.debugLineNum = 462;BA.debugLine="Dim Tipo_Moneda_Det As String = Fila.Get(\"tipo_mo";
Debug.ShouldStop(8192);
_tipo_moneda_det = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo_moneda")))));Debug.locals.put("Tipo_Moneda_Det", _tipo_moneda_det);Debug.locals.put("Tipo_Moneda_Det", _tipo_moneda_det);
 BA.debugLineNum = 463;BA.debugLine="Dim Tipo_Cambio_Det As Double = Fila.Get(\"tipo_ca";
Debug.ShouldStop(16384);
_tipo_cambio_det = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tipo_cambio")))));Debug.locals.put("Tipo_Cambio_Det", _tipo_cambio_det);Debug.locals.put("Tipo_Cambio_Det", _tipo_cambio_det);
 BA.debugLineNum = 465;BA.debugLine="Dim Decimales = 2";
Debug.ShouldStop(65536);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);Debug.locals.put("Decimales", _decimales);
 BA.debugLineNum = 467;BA.debugLine="If Moneda_Det.Trim <> Moneda_Enc.Trim Then";
Debug.ShouldStop(262144);
if (true) break;

case 9:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_moneda_det.runMethod(true,"trim"),_moneda_enc.runMethod(true,"trim"))) { 
this.state = 11;
}else {
this.state = 19;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 468;BA.debugLine="If Tipo_Moneda_Enc = \"N\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 469;BA.debugLine="Precio_Calculado = Round2(Precio * Tipo_Cambio_";
Debug.ShouldStop(1048576);
_precio_calculado = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_tipo_cambio_ent}, "*",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Precio_Calculado", _precio_calculado);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 471;BA.debugLine="Precio_Calculado = Round2(Precio / Tipo_Cambio_";
Debug.ShouldStop(4194304);
_precio_calculado = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_tipo_cambio_ent}, "/",0, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Precio_Calculado", _precio_calculado);
 BA.debugLineNum = 472;BA.debugLine="Decimales = 2";
Debug.ShouldStop(8388608);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);
 if (true) break;

case 17:
//C
this.state = 24;
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 475;BA.debugLine="If Tipo_Moneda_Enc <> \"N\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_tipo_moneda_enc,BA.ObjectToString("N"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 476;BA.debugLine="Decimales = 2";
Debug.ShouldStop(134217728);
_decimales = BA.NumberToString(2);Debug.locals.put("Decimales", _decimales);
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 478;BA.debugLine="Precio_Calculado = Precio";
Debug.ShouldStop(536870912);
_precio_calculado = _precio;Debug.locals.put("Precio_Calculado", _precio_calculado);
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 481;BA.debugLine="TecladoSoft.HideKeyboard";
Debug.ShouldStop(1);
parent.mostCurrent._tecladosoft.runVoidMethod ("HideKeyboard",frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 483;BA.debugLine="Dim Divi As String";
Debug.ShouldStop(4);
_divi = RemoteObject.createImmutable("");Debug.locals.put("Divi", _divi);
 BA.debugLineNum = 485;BA.debugLine="If UnTrans = 1 Then";
Debug.ShouldStop(16);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 1))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 486;BA.debugLine="Divi = Divisible";
Debug.ShouldStop(32);
_divi = _divisible;Debug.locals.put("Divi", _divi);
 if (true) break;
;
 BA.debugLineNum = 489;BA.debugLine="If UnTrans = 2 Then";
Debug.ShouldStop(256);

case 28:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 2))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 490;BA.debugLine="Divi = Divisible2";
Debug.ShouldStop(512);
_divi = _divisible2;Debug.locals.put("Divi", _divi);
 if (true) break;
;
 BA.debugLineNum = 493;BA.debugLine="If Not (Funciones.Fx_Solo_Enteros(Cantidad,Divi))";
Debug.ShouldStop(4096);

case 31:
//if
this.state = 34;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._funciones.runMethod(true,"_fx_solo_enteros" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(_cantidad),(Object)(_divi)))).<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 495;BA.debugLine="Msgbox2(\"El producto solo permite cantidades ent";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("El producto solo permite cantidades enteras")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),frm_post_01_producto.mostCurrent.activityBA);
 BA.debugLineNum = 496;BA.debugLine="Cantidad = 0";
Debug.ShouldStop(32768);
_cantidad = BA.numberCast(double.class, 0);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 497;BA.debugLine="Txt_Cantidad.Tag = 0";
Debug.ShouldStop(65536);
parent.mostCurrent._txt_cantidad.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 498;BA.debugLine="Txt_Cantidad.Text = \"\"";
Debug.ShouldStop(131072);
parent.mostCurrent._txt_cantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 499;BA.debugLine="Txt_Cantidad.SelectAll";
Debug.ShouldStop(262144);
parent.mostCurrent._txt_cantidad.runVoidMethod ("SelectAll");
 BA.debugLineNum = 500;BA.debugLine="TecladoSoft.ShowKeyboard(Txt_Cantidad)";
Debug.ShouldStop(524288);
parent.mostCurrent._tecladosoft.runVoidMethod ("ShowKeyboard",(Object)((parent.mostCurrent._txt_cantidad.getObject())));
 BA.debugLineNum = 501;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;
;
 BA.debugLineNum = 505;BA.debugLine="If UnTrans = 1 Then";
Debug.ShouldStop(16777216);

case 34:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 1))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 506;BA.debugLine="If Rtu = 1 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_rtu,BA.numberCast(double.class, 1))) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 507;BA.debugLine="CantUd1 = Cantidad";
Debug.ShouldStop(67108864);
_cantud1 = _cantidad;Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 508;BA.debugLine="CantUd2 = Cantidad * Rtu";
Debug.ShouldStop(134217728);
_cantud2 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "*",0, 0);Debug.locals.put("CantUd2", _cantud2);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 510;BA.debugLine="CantUd1 = Cantidad";
Debug.ShouldStop(536870912);
_cantud1 = _cantidad;Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 511;BA.debugLine="CantUd2 = Cantidad / Rtu";
Debug.ShouldStop(1073741824);
_cantud2 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "/",0, 0);Debug.locals.put("CantUd2", _cantud2);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 BA.debugLineNum = 515;BA.debugLine="If UnTrans = 2 Then";
Debug.ShouldStop(4);

case 43:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_untrans,BA.numberCast(double.class, 2))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 516;BA.debugLine="If Rtu > 1 Then";
Debug.ShouldStop(8);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean(">",_rtu,BA.numberCast(double.class, 1))) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
 BA.debugLineNum = 517;BA.debugLine="CantUd2 = Cantidad";
Debug.ShouldStop(16);
_cantud2 = _cantidad;Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 518;BA.debugLine="CantUd1 = Cantidad * Rtu";
Debug.ShouldStop(32);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 520;BA.debugLine="CantUd2 = Cantidad";
Debug.ShouldStop(128);
_cantud2 = _cantidad;Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 521;BA.debugLine="CantUd1 = Cantidad / Rtu";
Debug.ShouldStop(256);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_cantidad,_rtu}, "/",0, 0);Debug.locals.put("CantUd1", _cantud1);
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;
;
 BA.debugLineNum = 525;BA.debugLine="If Prct = 1 Then";
Debug.ShouldStop(4096);

case 52:
//if
this.state = 136;
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(1))) { 
this.state = 54;
}else {
this.state = 103;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 535;BA.debugLine="TotalNeto_Calculo = TotalNetoDoc";
Debug.ShouldStop(4194304);
_totalneto_calculo = parent._totalnetodoc;Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 536;BA.debugLine="TotalBruto_Calculo = TotalBrutoDoc";
Debug.ShouldStop(8388608);
_totalbruto_calculo = parent._totalbrutodoc;Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 538;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 55:
//if
this.state = 101;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 57;
}else 
{ BA.debugLineNum = 568;BA.debugLine="Else If Tict = \"R\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
this.state = 77;
}}
if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 540;BA.debugLine="Descontar = True";
Debug.ShouldStop(134217728);
_descontar = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Descontar", _descontar);
 BA.debugLineNum = 541;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(268435456);
_cantidad = BA.numberCast(double.class, 1);Debug.locals.put("Cantidad", _cantidad);
 BA.debugLineNum = 541;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(268435456);
_cantud1 = BA.numberCast(double.class, 1);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 541;BA.debugLine="Cantidad = 1 : CantUd1 = 1 : CantUd2 = 1";
Debug.ShouldStop(268435456);
_cantud2 = BA.numberCast(double.class, 1);Debug.locals.put("CantUd2", _cantud2);
 BA.debugLineNum = 542;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo + Descuen";
Debug.ShouldStop(536870912);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_descuentovalor_anterior}, "+",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 544;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 58:
//if
this.state = 75;
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc"))) { 
this.state = 60;
}else 
{ BA.debugLineNum = 556;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoValor"))) { 
this.state = 68;
}}
if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 546;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(2);
if (true) break;

case 61:
//if
this.state = 66;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
 BA.debugLineNum = 547;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(4);
_descuentovalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 549;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(16);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 551;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(64);
_descuentovalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 553;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(256);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 66:
//C
this.state = 75;
;
 if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 558;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(8192);
if (true) break;

case 69:
//if
this.state = 74;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
 BA.debugLineNum = 560;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(32768);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 563;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(262144);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 74:
//C
this.state = 75;
;
 if (true) break;

case 75:
//C
this.state = 101;
;
 if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 570;BA.debugLine="Total_Concepto = Fila.Get(\"valnetolinea\")";
Debug.ShouldStop(33554432);
_total_concepto = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("valnetolinea")))));Debug.locals.put("Total_Concepto", _total_concepto);
 BA.debugLineNum = 571;BA.debugLine="Recargo = Fila.Get(\"recargovalor\")";
Debug.ShouldStop(67108864);
_recargo = BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("recargovalor")))));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 573;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(268435456);
if (true) break;

case 78:
//if
this.state = 83;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 80;
}else {
this.state = 82;
}if (true) break;

case 80:
//C
this.state = 83;
 BA.debugLineNum = 574;BA.debugLine="TotalNeto = Total_Concepto";
Debug.ShouldStop(536870912);
_totalneto = _total_concepto;Debug.locals.put("TotalNeto", _totalneto);
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 576;BA.debugLine="TotalNeto = Round2(Total_Concepto / Impuestos,";
Debug.ShouldStop(-2147483648);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_total_concepto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 577;BA.debugLine="TotalBruto = Total_Concepto";
Debug.ShouldStop(1);
_totalbruto = _total_concepto;Debug.locals.put("TotalBruto", _totalbruto);
 if (true) break;
;
 BA.debugLineNum = 580;BA.debugLine="If Cabeza = \"DescuentoPorc\" Then";
Debug.ShouldStop(8);

case 83:
//if
this.state = 100;
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc"))) { 
this.state = 85;
}else 
{ BA.debugLineNum = 603;BA.debugLine="Else If Cabeza = \"ValNetoLinea\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("ValNetoLinea"))) { 
this.state = 93;
}}
if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 582;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
Debug.ShouldStop(32);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 583;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
Debug.ShouldStop(64);
_totalbruto_calculo = RemoteObject.solve(new RemoteObject[] {_totalbruto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 585;BA.debugLine="DescuentoPorc = DescuentoPorc / 100";
Debug.ShouldStop(256);
_descuentoporc = RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 587;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(1024);
if (true) break;

case 86:
//if
this.state = 91;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 88;
}else {
this.state = 90;
}if (true) break;

case 88:
//C
this.state = 91;
 BA.debugLineNum = 589;BA.debugLine="TotalNeto = Round2((1 + DescuentoPorc) * Tota";
Debug.ShouldStop(4096);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_descuentoporc}, "+",1, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 590;BA.debugLine="Recargo = Round2(TotalNeto - TotalNeto_Calcul";
Debug.ShouldStop(8192);
_recargo = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_totalneto_calculo}, "-",1, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 592;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalNeto_C";
Debug.ShouldStop(32768);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_recargo,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 593;BA.debugLine="TotalNeto = Recargo";
Debug.ShouldStop(65536);
_totalneto = _recargo;Debug.locals.put("TotalNeto", _totalneto);
 if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 597;BA.debugLine="Recargo = Round2((DescuentoPorc / 100) * Tota";
Debug.ShouldStop(1048576);
_recargo = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("Recargo", _recargo);
 BA.debugLineNum = 599;BA.debugLine="DescuentoPorc = Round2((Recargo / TotalBruto_";
Debug.ShouldStop(4194304);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_recargo,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 91:
//C
this.state = 100;
;
 if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 605;BA.debugLine="TotalNeto_Calculo = TotalNeto_Calculo - Recarg";
Debug.ShouldStop(268435456);
_totalneto_calculo = RemoteObject.solve(new RemoteObject[] {_totalneto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 606;BA.debugLine="TotalBruto_Calculo = TotalBruto_Calculo - Reca";
Debug.ShouldStop(536870912);
_totalbruto_calculo = RemoteObject.solve(new RemoteObject[] {_totalbruto_calculo,_recargo}, "-",1, 0);Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 608;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 94:
//if
this.state = 99;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 96;
}else {
this.state = 98;
}if (true) break;

case 96:
//C
this.state = 99;
 BA.debugLineNum = 610;BA.debugLine="DescuentoPorc = Round2((Total_Concepto / (Tot";
Debug.ShouldStop(2);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_total_concepto,(_totalneto_calculo)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 98:
//C
this.state = 99;
 BA.debugLineNum = 613;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / (Tot";
Debug.ShouldStop(16);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,(_totalbruto_calculo)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 99:
//C
this.state = 100;
;
 BA.debugLineNum = 616;BA.debugLine="Recargo = Total_Concepto";
Debug.ShouldStop(128);
_recargo = _total_concepto;Debug.locals.put("Recargo", _recargo);
 if (true) break;

case 100:
//C
this.state = 101;
;
 BA.debugLineNum = 620;BA.debugLine="DescuentoValor = 0";
Debug.ShouldStop(2048);
_descuentovalor = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoValor", _descuentovalor);
 if (true) break;

case 101:
//C
this.state = 136;
;
 if (true) break;

case 103:
//C
this.state = 104;
 BA.debugLineNum = 636;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(134217728);
if (true) break;

case 104:
//if
this.state = 109;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 106;
}else {
this.state = 108;
}if (true) break;

case 106:
//C
this.state = 109;
 BA.debugLineNum = 637;BA.debugLine="PrecioNeto = Precio_Calculado";
Debug.ShouldStop(268435456);
_precioneto = _precio_calculado;Debug.locals.put("PrecioNeto", _precioneto);
 if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 639;BA.debugLine="PrecioNeto = Round2(Precio_Calculado / Impuesto";
Debug.ShouldStop(1073741824);
_precioneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio_calculado,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 640;BA.debugLine="PrecioBruto = Precio_Calculado";
Debug.ShouldStop(-2147483648);
_preciobruto = _precio_calculado;Debug.locals.put("PrecioBruto", _preciobruto);
 if (true) break;

case 109:
//C
this.state = 110;
;
 BA.debugLineNum = 643;BA.debugLine="TotalNeto = Round2(PrecioNeto * Cantidad, 3)";
Debug.ShouldStop(4);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precioneto,_cantidad}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 644;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
Debug.ShouldStop(8);
_totalbruto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 646;BA.debugLine="If Cabeza = \"Cantidad\" And Tict = \"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 110:
//if
this.state = 113;
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("Cantidad")) && RemoteObject.solveBoolean("=",_tict,BA.ObjectToString(""))) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 648;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(128);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 649;BA.debugLine="DescuentoValor = 0";
Debug.ShouldStop(256);
_descuentovalor = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoValor", _descuentovalor);
 if (true) break;

case 113:
//C
this.state = 114;
;
 BA.debugLineNum = 661;BA.debugLine="TotalNeto_Calculo = TotalNeto";
Debug.ShouldStop(1048576);
_totalneto_calculo = _totalneto;Debug.locals.put("TotalNeto_Calculo", _totalneto_calculo);
 BA.debugLineNum = 662;BA.debugLine="TotalBruto_Calculo = TotalBruto";
Debug.ShouldStop(2097152);
_totalbruto_calculo = _totalbruto;Debug.locals.put("TotalBruto_Calculo", _totalbruto_calculo);
 BA.debugLineNum = 666;BA.debugLine="If Cabeza = \"DescuentoPorc\" Or Cabeza = \"Precio\"";
Debug.ShouldStop(33554432);
if (true) break;

case 114:
//if
this.state = 135;
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoPorc")) || RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("Precio"))) { 
this.state = 116;
}else 
{ BA.debugLineNum = 686;BA.debugLine="Else If Cabeza = \"DescuentoValor\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cabeza,BA.ObjectToString("DescuentoValor"))) { 
this.state = 128;
}}
if (true) break;

case 116:
//C
this.state = 117;
 BA.debugLineNum = 668;BA.debugLine="If Precio > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 117:
//if
this.state = 126;
if (RemoteObject.solveBoolean(">",_precio,BA.numberCast(double.class, 0))) { 
this.state = 119;
}if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 670;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(536870912);
if (true) break;

case 120:
//if
this.state = 125;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 122;
}else {
this.state = 124;
}if (true) break;

case 122:
//C
this.state = 125;
 BA.debugLineNum = 672;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(-2147483648);
_descuentovalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalneto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 674;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(2);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 124:
//C
this.state = 125;
 BA.debugLineNum = 678;BA.debugLine="DescuentoValor = Round2((DescuentoPorc / 100)";
Debug.ShouldStop(32);
_descuentovalor = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentoporc,RemoteObject.createImmutable(100)}, "/",0, 0)),_totalbruto_calculo}, "*",0, 0)),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("DescuentoValor", _descuentovalor);
 BA.debugLineNum = 680;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Tota";
Debug.ShouldStop(128);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 125:
//C
this.state = 126;
;
 if (true) break;

case 126:
//C
this.state = 135;
;
 if (true) break;

case 128:
//C
this.state = 129;
 BA.debugLineNum = 688;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(32768);
if (true) break;

case 129:
//if
this.state = 134;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 131;
}else {
this.state = 133;
}if (true) break;

case 131:
//C
this.state = 134;
 BA.debugLineNum = 690;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
Debug.ShouldStop(131072);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalneto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 133:
//C
this.state = 134;
 BA.debugLineNum = 693;BA.debugLine="DescuentoPorc = Round2((DescuentoValor / Total";
Debug.ShouldStop(1048576);
_descuentoporc = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_descuentovalor,_totalbruto_calculo}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 134:
//C
this.state = 135;
;
 if (true) break;

case 135:
//C
this.state = 136;
;
 if (true) break;

case 136:
//C
this.state = 137;
;
 BA.debugLineNum = 701;BA.debugLine="Fila.Put(\"DescuentoPorc\",DescuentoPorc)";
Debug.ShouldStop(268435456);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoPorc"))),(Object)((_descuentoporc)));
 BA.debugLineNum = 702;BA.debugLine="Fila.Put(\"DescuentoValor\",DescuentoValor)";
Debug.ShouldStop(536870912);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoValor"))),(Object)((_descuentovalor)));
 BA.debugLineNum = 703;BA.debugLine="Fila.Put(\"DescuentoValor_Anterior\",DescuentoValor";
Debug.ShouldStop(1073741824);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescuentoValor_Anterior"))),(Object)((_descuentovalor_anterior)));
 BA.debugLineNum = 705;BA.debugLine="Fila.Put(\"DsctoRealPorc\",0)";
Debug.ShouldStop(1);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DsctoRealPorc"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 706;BA.debugLine="Fila.Put(\"DsctoRealValor\",0)";
Debug.ShouldStop(2);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DsctoRealValor"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 716;BA.debugLine="Dim PrecioCalculado As Double";
Debug.ShouldStop(2048);
_preciocalculado = RemoteObject.createImmutable(0);Debug.locals.put("PrecioCalculado", _preciocalculado);
 BA.debugLineNum = 718;BA.debugLine="Dim Valor_Dscto As Double";
Debug.ShouldStop(8192);
_valor_dscto = RemoteObject.createImmutable(0);Debug.locals.put("Valor_Dscto", _valor_dscto);
 BA.debugLineNum = 719;BA.debugLine="Dim CodFunAutoriza_Dscto = \"xyz\"";
Debug.ShouldStop(16384);
_codfunautoriza_dscto = BA.ObjectToString("xyz");Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);
 BA.debugLineNum = 720;BA.debugLine="Dim CodPermiso_Dscto = \"Bkp00014\"";
Debug.ShouldStop(32768);
_codpermiso_dscto = BA.ObjectToString("Bkp00014");Debug.locals.put("CodPermiso_Dscto", _codpermiso_dscto);Debug.locals.put("CodPermiso_Dscto", _codpermiso_dscto);
 BA.debugLineNum = 722;BA.debugLine="If Prct = 0 Then ' String.IsNullOrEmpty(_Tict) An";
Debug.ShouldStop(131072);
if (true) break;

case 137:
//if
this.state = 187;
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(0))) { 
this.state = 139;
}else {
this.state = 186;
}if (true) break;

case 139:
//C
this.state = 140;
 BA.debugLineNum = 724;BA.debugLine="Dim PrecioLista As Double";
Debug.ShouldStop(524288);
_preciolista = RemoteObject.createImmutable(0);Debug.locals.put("PrecioLista", _preciolista);
 BA.debugLineNum = 726;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(2097152);
if (true) break;

case 140:
//if
this.state = 145;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 142;
}else {
this.state = 144;
}if (true) break;

case 142:
//C
this.state = 145;
 BA.debugLineNum = 727;BA.debugLine="PrecioLista = Round2(Fila.Get(\"precionetoudlist";
Debug.ShouldStop(4194304);
_preciolista = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precionetoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioLista", _preciolista);
 if (true) break;

case 144:
//C
this.state = 145;
 BA.debugLineNum = 729;BA.debugLine="PrecioLista = Round2(Fila.Get(\"preciobrutoudlis";
Debug.ShouldStop(16777216);
_preciolista = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("preciobrutoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioLista", _preciolista);
 if (true) break;

case 145:
//C
this.state = 146;
;
 BA.debugLineNum = 735;BA.debugLine="Dim Precio_Cn_Dscto As Double = (Precio_Calculad";
Debug.ShouldStop(1073741824);
_precio_cn_dscto = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio_calculado,_cantidad}, "*",0, 0)),_descuentovalor}, "-",1, 0);Debug.locals.put("Precio_Cn_Dscto", _precio_cn_dscto);Debug.locals.put("Precio_Cn_Dscto", _precio_cn_dscto);
 BA.debugLineNum = 736;BA.debugLine="Dim Precio_NetoLista As Double = Fila.Get(\"preci";
Debug.ShouldStop(-2147483648);
_precio_netolista = RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.concat(RemoteObject.createImmutable("preciolistaud"),_untrans))))),_cantidad}, "*",0, 0);Debug.locals.put("Precio_NetoLista", _precio_netolista);Debug.locals.put("Precio_NetoLista", _precio_netolista);
 BA.debugLineNum = 737;BA.debugLine="Dim Valor_Dscto_Real As Double = Round2(Precio_N";
Debug.ShouldStop(1);
_valor_dscto_real = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio_netolista,_precio_cn_dscto}, "-",1, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Valor_Dscto_Real", _valor_dscto_real);Debug.locals.put("Valor_Dscto_Real", _valor_dscto_real);
 BA.debugLineNum = 739;BA.debugLine="Dim Dscto_Real As Double = 0";
Debug.ShouldStop(4);
_dscto_real = BA.numberCast(double.class, 0);Debug.locals.put("Dscto_Real", _dscto_real);Debug.locals.put("Dscto_Real", _dscto_real);
 BA.debugLineNum = 741;BA.debugLine="If Valor_Dscto_Real > 0 Then";
Debug.ShouldStop(16);
if (true) break;

case 146:
//if
this.state = 149;
if (RemoteObject.solveBoolean(">",_valor_dscto_real,BA.numberCast(double.class, 0))) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
 BA.debugLineNum = 742;BA.debugLine="Dscto_Real = Round2((Valor_Dscto_Real / Precio_";
Debug.ShouldStop(32);
_dscto_real = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_valor_dscto_real,_precio_netolista}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("Dscto_Real", _dscto_real);
 if (true) break;

case 149:
//C
this.state = 150;
;
 BA.debugLineNum = 749;BA.debugLine="Dim CodFunAutoriza As String = Fila.Get(\"codfuna";
Debug.ShouldStop(4096);
_codfunautoriza = BA.ObjectToString(parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codfunautoriza")))));Debug.locals.put("CodFunAutoriza", _codfunautoriza);Debug.locals.put("CodFunAutoriza", _codfunautoriza);
 BA.debugLineNum = 751;BA.debugLine="Dim Tiene_Dscto As Boolean";
Debug.ShouldStop(16384);
_tiene_dscto = RemoteObject.createImmutable(false);Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 752;BA.debugLine="Dim ValVtaDescMax As Boolean";
Debug.ShouldStop(32768);
_valvtadescmax = RemoteObject.createImmutable(false);Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 BA.debugLineNum = 754;BA.debugLine="If CodFunAutoriza = \"xyz\" Then CodFunAutoriza =";
Debug.ShouldStop(131072);
if (true) break;

case 150:
//if
this.state = 155;
if (RemoteObject.solveBoolean("=",_codfunautoriza,BA.ObjectToString("xyz"))) { 
this.state = 152;
;}if (true) break;

case 152:
//C
this.state = 155;
_codfunautoriza = parent.mostCurrent._funcionario;Debug.locals.put("CodFunAutoriza", _codfunautoriza);
if (true) break;

case 155:
//C
this.state = 156;
;
 BA.debugLineNum = 756;BA.debugLine="If Precio_Cn_Dscto < Precio_NetoLista Then";
Debug.ShouldStop(524288);
if (true) break;

case 156:
//if
this.state = 184;
if (RemoteObject.solveBoolean("<",_precio_cn_dscto,_precio_netolista)) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
 BA.debugLineNum = 758;BA.debugLine="Dim Vizado As Boolean '= Grilla_Encabezado.Rows";
Debug.ShouldStop(2097152);
_vizado = RemoteObject.createImmutable(false);Debug.locals.put("Vizado", _vizado);
 BA.debugLineNum = 760;BA.debugLine="If DescMaximo = 0 Then DescMaximo = 0.5";
Debug.ShouldStop(8388608);
if (true) break;

case 159:
//if
this.state = 164;
if (RemoteObject.solveBoolean("=",_descmaximo,BA.numberCast(double.class, 0))) { 
this.state = 161;
;}if (true) break;

case 161:
//C
this.state = 164;
_descmaximo = BA.numberCast(double.class, 0.5);Debug.locals.put("DescMaximo", _descmaximo);
if (true) break;

case 164:
//C
this.state = 165;
;
 BA.debugLineNum = 762;BA.debugLine="If Dscto_Real > DescMaximo Then";
Debug.ShouldStop(33554432);
if (true) break;

case 165:
//if
this.state = 183;
if (RemoteObject.solveBoolean(">",_dscto_real,_descmaximo)) { 
this.state = 167;
}if (true) break;

case 167:
//C
this.state = 168;
 BA.debugLineNum = 764;BA.debugLine="Tiene_Dscto = True";
Debug.ShouldStop(134217728);
_tiene_dscto = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Tiene_Dscto", _tiene_dscto);
 BA.debugLineNum = 766;BA.debugLine="If Vizado Then";
Debug.ShouldStop(536870912);
if (true) break;

case 168:
//if
this.state = 182;
if (_vizado.<Boolean>get().booleanValue()) { 
this.state = 170;
}else {
this.state = 172;
}if (true) break;

case 170:
//C
this.state = 182;
 BA.debugLineNum = 767;BA.debugLine="ValVtaDescMax = True";
Debug.ShouldStop(1073741824);
_valvtadescmax = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 if (true) break;

case 172:
//C
this.state = 173;
 BA.debugLineNum = 772;BA.debugLine="Dim Mensaje = \"\"";
Debug.ShouldStop(8);
_mensaje = BA.ObjectToString("");Debug.locals.put("Mensaje", _mensaje);Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 773;BA.debugLine="Dim MsIcono As Object";
Debug.ShouldStop(16);
_msicono = RemoteObject.createNew ("Object");Debug.locals.put("MsIcono", _msicono);
 BA.debugLineNum = 781;BA.debugLine="Dim Msj_DsctoReal = \"\"";
Debug.ShouldStop(4096);
_msj_dsctoreal = BA.ObjectToString("");Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);
 BA.debugLineNum = 783;BA.debugLine="If Precio <> PrecioLista Then";
Debug.ShouldStop(16384);
if (true) break;

case 173:
//if
this.state = 176;
if (RemoteObject.solveBoolean("!",_precio,_preciolista)) { 
this.state = 175;
}if (true) break;

case 175:
//C
this.state = 176;
 BA.debugLineNum = 784;BA.debugLine="Msj_DsctoReal = CRLF & \"Descuento Real: \" &";
Debug.ShouldStop(32768);
_msj_dsctoreal = RemoteObject.concat(parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Descuento Real: "),_dscto_real,RemoteObject.createImmutable("%"));Debug.locals.put("Msj_DsctoReal", _msj_dsctoreal);
 if (true) break;
;
 BA.debugLineNum = 787;BA.debugLine="If Dscto_Real > Valor_Dscto Then";
Debug.ShouldStop(262144);

case 176:
//if
this.state = 181;
if (RemoteObject.solveBoolean(">",_dscto_real,_valor_dscto)) { 
this.state = 178;
}else {
this.state = 180;
}if (true) break;

case 178:
//C
this.state = 181;
 BA.debugLineNum = 789;BA.debugLine="Mensaje = CRLF & CRLF & \"¡SE SOLICITARA PERM";
Debug.ShouldStop(1048576);
_mensaje = RemoteObject.concat(parent.mostCurrent.__c.getField(true,"CRLF"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¡SE SOLICITARA PERMISO AL GRABAR EL DOCUMENTO!"));Debug.locals.put("Mensaje", _mensaje);
 BA.debugLineNum = 792;BA.debugLine="ValVtaDescMax =False";
Debug.ShouldStop(8388608);
_valvtadescmax = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 if (true) break;

case 180:
//C
this.state = 181;
 BA.debugLineNum = 795;BA.debugLine="CodFunAutoriza_Dscto = FUNCIONARIO";
Debug.ShouldStop(67108864);
_codfunautoriza_dscto = parent.mostCurrent._funcionario;Debug.locals.put("CodFunAutoriza_Dscto", _codfunautoriza_dscto);
 BA.debugLineNum = 797;BA.debugLine="ValVtaDescMax =True";
Debug.ShouldStop(268435456);
_valvtadescmax = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 if (true) break;

case 181:
//C
this.state = 182;
;
 if (true) break;

case 182:
//C
this.state = 183;
;
 if (true) break;

case 183:
//C
this.state = 184;
;
 if (true) break;

case 184:
//C
this.state = 187;
;
 if (true) break;

case 186:
//C
this.state = 187;
 BA.debugLineNum = 819;BA.debugLine="ValVtaDescMax = True";
Debug.ShouldStop(262144);
_valvtadescmax = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ValVtaDescMax", _valvtadescmax);
 if (true) break;
;
 BA.debugLineNum = 825;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
Debug.ShouldStop(16777216);

case 187:
//if
this.state = 192;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 189;
}else {
this.state = 191;
}if (true) break;

case 189:
//C
this.state = 192;
 BA.debugLineNum = 826;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
Debug.ShouldStop(33554432);
_totalneto = RemoteObject.solve(new RemoteObject[] {_totalneto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalNeto", _totalneto);
 if (true) break;

case 191:
//C
this.state = 192;
 BA.debugLineNum = 828;BA.debugLine="TotalBruto = TotalBruto - DescuentoValor";
Debug.ShouldStop(134217728);
_totalbruto = RemoteObject.solve(new RemoteObject[] {_totalbruto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalBruto", _totalbruto);
 if (true) break;
;
 BA.debugLineNum = 833;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
Debug.ShouldStop(1);

case 192:
//if
this.state = 208;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 194;
}else {
this.state = 203;
}if (true) break;

case 194:
//C
this.state = 195;
 BA.debugLineNum = 835;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimales)";
Debug.ShouldStop(4);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalneto),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 836;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
Debug.ShouldStop(8);
_totaliva = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 837;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
Debug.ShouldStop(16);
_totalila = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 838;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
Debug.ShouldStop(32);
_totalbruto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 839;BA.debugLine="TotalDsctoNeto = DescuentoValor";
Debug.ShouldStop(64);
_totaldsctoneto = _descuentovalor;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 841;BA.debugLine="Total = TotalNeto";
Debug.ShouldStop(256);
_total = _totalneto;Debug.locals.put("Total", _total);
 BA.debugLineNum = 843;BA.debugLine="PrecioNeto = Precio";
Debug.ShouldStop(1024);
_precioneto = _precio;Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 844;BA.debugLine="PrecioBruto = Round2(Precio * Impuestos, 0)";
Debug.ShouldStop(2048);
_preciobruto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_impuestos}, "*",0, 0)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 846;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 195:
//if
this.state = 198;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 197;
}if (true) break;

case 197:
//C
this.state = 198;
 BA.debugLineNum = 847;BA.debugLine="TotalDsctoBruto = Round2((DescuentoValor * Impu";
Debug.ShouldStop(16384);
_totaldsctobruto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_descuentovalor,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, _decimales)));Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 if (true) break;
;
 BA.debugLineNum = 850;BA.debugLine="If Tict = \"R\" Then";
Debug.ShouldStop(131072);

case 198:
//if
this.state = 201;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
this.state = 200;
}if (true) break;

case 200:
//C
this.state = 201;
 BA.debugLineNum = 852;BA.debugLine="TotalDsctoBruto = TotalBruto";
Debug.ShouldStop(524288);
_totaldsctobruto = _totalbruto;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 853;BA.debugLine="TotalDsctoNeto = 0";
Debug.ShouldStop(1048576);
_totaldsctoneto = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 if (true) break;

case 201:
//C
this.state = 208;
;
 if (true) break;

case 203:
//C
this.state = 204;
 BA.debugLineNum = 859;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
Debug.ShouldStop(67108864);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalbruto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 860;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100), 5";
Debug.ShouldStop(134217728);
_totaliva = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 861;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100), 5";
Debug.ShouldStop(268435456);
_totalila = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 862;BA.debugLine="TotalDsctoBruto = DescuentoValor";
Debug.ShouldStop(536870912);
_totaldsctobruto = _descuentovalor;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 863;BA.debugLine="Total = TotalBruto";
Debug.ShouldStop(1073741824);
_total = _totalbruto;Debug.locals.put("Total", _total);
 BA.debugLineNum = 865;BA.debugLine="PrecioBruto = PrecioCalculado";
Debug.ShouldStop(1);
_preciobruto = _preciocalculado;Debug.locals.put("PrecioBruto", _preciobruto);
 BA.debugLineNum = 866;BA.debugLine="PrecioNeto = Round2(Precio / Impuestos, 3)";
Debug.ShouldStop(2);
_precioneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_precio,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("PrecioNeto", _precioneto);
 BA.debugLineNum = 868;BA.debugLine="If Tict = \"R\" Then";
Debug.ShouldStop(8);
if (true) break;

case 204:
//if
this.state = 207;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
this.state = 206;
}if (true) break;

case 206:
//C
this.state = 207;
 BA.debugLineNum = 870;BA.debugLine="TotalDsctoBruto = 0";
Debug.ShouldStop(32);
_totaldsctobruto = BA.numberCast(double.class, 0);Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 871;BA.debugLine="TotalDsctoNeto = TotalNeto";
Debug.ShouldStop(64);
_totaldsctoneto = _totalneto;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 if (true) break;

case 207:
//C
this.state = 208;
;
 if (true) break;
;
 BA.debugLineNum = 878;BA.debugLine="If Descontar Then";
Debug.ShouldStop(8192);

case 208:
//if
this.state = 232;
if (_descontar.<Boolean>get().booleanValue()) { 
this.state = 210;
}else {
this.state = 221;
}if (true) break;

case 210:
//C
this.state = 211;
 BA.debugLineNum = 880;BA.debugLine="PrecioNetoRealUd1 = 0";
Debug.ShouldStop(32768);
_precionetorealud1 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 881;BA.debugLine="PrecioNetoRealUd2 = 0";
Debug.ShouldStop(65536);
_precionetorealud2 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 883;BA.debugLine="If ChkValores Then ' SI VALORES SON NETOS";
Debug.ShouldStop(262144);
if (true) break;

case 211:
//if
this.state = 216;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 213;
}else {
this.state = 215;
}if (true) break;

case 213:
//C
this.state = 216;
 BA.debugLineNum = 884;BA.debugLine="TotalNeto = TotalNeto - DescuentoValor";
Debug.ShouldStop(524288);
_totalneto = RemoteObject.solve(new RemoteObject[] {_totalneto,_descuentovalor}, "-",1, 0);Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 885;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
Debug.ShouldStop(1048576);
_totaliva = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 886;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
Debug.ShouldStop(2097152);
_totalila = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 887;BA.debugLine="TotalBruto = Round2((TotalNeto * Impuestos), 0)";
Debug.ShouldStop(4194304);
_totalbruto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)((RemoteObject.solve(new RemoteObject[] {_totalneto,_impuestos}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 888;BA.debugLine="TotalDsctoNeto = DescuentoValor";
Debug.ShouldStop(8388608);
_totaldsctoneto = _descuentovalor;Debug.locals.put("TotalDsctoNeto", _totaldsctoneto);
 BA.debugLineNum = 889;BA.debugLine="Total = TotalNeto";
Debug.ShouldStop(16777216);
_total = _totalneto;Debug.locals.put("Total", _total);
 if (true) break;

case 215:
//C
this.state = 216;
 BA.debugLineNum = 891;BA.debugLine="TotalBruto = DescuentoValor";
Debug.ShouldStop(67108864);
_totalbruto = _descuentovalor;Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 892;BA.debugLine="TotalNeto = Round2(TotalBruto / Impuestos, 5)";
Debug.ShouldStop(134217728);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalbruto,_impuestos}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 893;BA.debugLine="TotalIva = (Round2(TotalNeto * (PorIva / 100),";
Debug.ShouldStop(268435456);
_totaliva = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_poriva,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 894;BA.debugLine="TotalIla = (Round2(TotalNeto * (PorIla / 100),";
Debug.ShouldStop(536870912);
_totalila = (parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,(RemoteObject.solve(new RemoteObject[] {_porila,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 895;BA.debugLine="TotalDsctoBruto = DescuentoValor";
Debug.ShouldStop(1073741824);
_totaldsctobruto = _descuentovalor;Debug.locals.put("TotalDsctoBruto", _totaldsctobruto);
 BA.debugLineNum = 896;BA.debugLine="Total = TotalBruto";
Debug.ShouldStop(-2147483648);
_total = _totalbruto;Debug.locals.put("Total", _total);
 if (true) break;
;
 BA.debugLineNum = 899;BA.debugLine="If TotalNeto > 0 Then";
Debug.ShouldStop(4);

case 216:
//if
this.state = 219;
if (RemoteObject.solveBoolean(">",_totalneto,BA.numberCast(double.class, 0))) { 
this.state = 218;
}if (true) break;

case 218:
//C
this.state = 219;
 BA.debugLineNum = 901;BA.debugLine="TotalIla = TotalIla * -1";
Debug.ShouldStop(16);
_totalila = BA.numberCast(double.class, _totalila.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 902;BA.debugLine="TotalIva = TotalIva * -1";
Debug.ShouldStop(32);
_totaliva = BA.numberCast(double.class, _totaliva.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 903;BA.debugLine="TotalNeto = TotalNeto * -1";
Debug.ShouldStop(64);
_totalneto = BA.numberCast(double.class, _totalneto.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 904;BA.debugLine="TotalBruto = TotalBruto * -1";
Debug.ShouldStop(128);
_totalbruto = BA.numberCast(double.class, _totalbruto.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 905;BA.debugLine="Total = Total * -1";
Debug.ShouldStop(256);
_total = BA.numberCast(double.class, _total.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("Total", _total);
 if (true) break;

case 219:
//C
this.state = 232;
;
 if (true) break;

case 221:
//C
this.state = 222;
 BA.debugLineNum = 913;BA.debugLine="If Cantidad > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 222:
//if
this.state = 231;
if (RemoteObject.solveBoolean(">",_cantidad,BA.numberCast(double.class, 0))) { 
this.state = 224;
}else {
this.state = 230;
}if (true) break;

case 224:
//C
this.state = 225;
 BA.debugLineNum = 915;BA.debugLine="PrecioNetoRealUd1 = Round2(TotalNeto / CantUd1,";
Debug.ShouldStop(262144);
_precionetorealud1 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_cantud1}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 916;BA.debugLine="PrecioNetoRealUd2 = Round2(TotalNeto / CantUd2,";
Debug.ShouldStop(524288);
_precionetorealud2 = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_totalneto,_cantud2}, "/",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 BA.debugLineNum = 918;BA.debugLine="If ChkValores = False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 225:
//if
this.state = 228;
if (RemoteObject.solveBoolean("=",parent._chkvalores,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 227;
}if (true) break;

case 227:
//C
this.state = 228;
 BA.debugLineNum = 919;BA.debugLine="PrecioNeto = PrecioNetoRealUd1";
Debug.ShouldStop(4194304);
_precioneto = _precionetorealud1;Debug.locals.put("PrecioNeto", _precioneto);
 if (true) break;

case 228:
//C
this.state = 231;
;
 if (true) break;

case 230:
//C
this.state = 231;
 BA.debugLineNum = 923;BA.debugLine="PrecioNetoRealUd1 = 0";
Debug.ShouldStop(67108864);
_precionetorealud1 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd1", _precionetorealud1);
 BA.debugLineNum = 924;BA.debugLine="PrecioNetoRealUd2 = 0";
Debug.ShouldStop(134217728);
_precionetorealud2 = BA.numberCast(double.class, 0);Debug.locals.put("PrecioNetoRealUd2", _precionetorealud2);
 if (true) break;

case 231:
//C
this.state = 232;
;
 if (true) break;
;
 BA.debugLineNum = 929;BA.debugLine="If Prct = 1 Then";
Debug.ShouldStop(1);

case 232:
//if
this.state = 246;
if (RemoteObject.solveBoolean("=",_prct,BA.NumberToString(1))) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
 BA.debugLineNum = 931;BA.debugLine="Dim Multiplo = 1";
Debug.ShouldStop(4);
_multiplo = BA.NumberToString(1);Debug.locals.put("Multiplo", _multiplo);Debug.locals.put("Multiplo", _multiplo);
 BA.debugLineNum = 933;BA.debugLine="If Tict = \"D\" Then";
Debug.ShouldStop(16);
if (true) break;

case 235:
//if
this.state = 240;
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("D"))) { 
this.state = 237;
}else 
{ BA.debugLineNum = 935;BA.debugLine="Else If Tict = \"R\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_tict,BA.ObjectToString("R"))) { 
this.state = 239;
}}
if (true) break;

case 237:
//C
this.state = 240;
 BA.debugLineNum = 934;BA.debugLine="Multiplo = -1";
Debug.ShouldStop(32);
_multiplo = BA.NumberToString(-(double) (0 + 1));Debug.locals.put("Multiplo", _multiplo);
 if (true) break;

case 239:
//C
this.state = 240;
 BA.debugLineNum = 936;BA.debugLine="Multiplo = 1";
Debug.ShouldStop(128);
_multiplo = BA.NumberToString(1);Debug.locals.put("Multiplo", _multiplo);
 if (true) break;
;
 BA.debugLineNum = 939;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(1024);

case 240:
//if
this.state = 245;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 242;
}else {
this.state = 244;
}if (true) break;

case 242:
//C
this.state = 245;
 BA.debugLineNum = 941;BA.debugLine="CantUd1 = TotalNeto * Multiplo";
Debug.ShouldStop(4096);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_totalneto,BA.numberCast(double.class, _multiplo)}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 942;BA.debugLine="CantUd2 = 0";
Debug.ShouldStop(8192);
_cantud2 = BA.numberCast(double.class, 0);Debug.locals.put("CantUd2", _cantud2);
 if (true) break;

case 244:
//C
this.state = 245;
 BA.debugLineNum = 947;BA.debugLine="CantUd1 = TotalBruto * Multiplo";
Debug.ShouldStop(262144);
_cantud1 = RemoteObject.solve(new RemoteObject[] {_totalbruto,BA.numberCast(double.class, _multiplo)}, "*",0, 0);Debug.locals.put("CantUd1", _cantud1);
 BA.debugLineNum = 948;BA.debugLine="CantUd2 = 0";
Debug.ShouldStop(524288);
_cantud2 = BA.numberCast(double.class, 0);Debug.locals.put("CantUd2", _cantud2);
 if (true) break;

case 245:
//C
this.state = 246;
;
 if (true) break;

case 246:
//C
this.state = 247;
;
 BA.debugLineNum = 991;BA.debugLine="TotalIla = Round2(TotalIla, 2)";
Debug.ShouldStop(1073741824);
_totalila = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalila),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("TotalIla", _totalila);
 BA.debugLineNum = 992;BA.debugLine="TotalIva = Round2(TotalIva, 2)";
Debug.ShouldStop(-2147483648);
_totaliva = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totaliva),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("TotalIva", _totaliva);
 BA.debugLineNum = 993;BA.debugLine="TotalNeto = Round2(TotalNeto, Decimal)";
Debug.ShouldStop(1);
_totalneto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalneto),(Object)(BA.numberCast(int.class, _decimal)));Debug.locals.put("TotalNeto", _totalneto);
 BA.debugLineNum = 994;BA.debugLine="TotalBruto = Round2(TotalBruto, 0)";
Debug.ShouldStop(2);
_totalbruto = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_totalbruto),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("TotalBruto", _totalbruto);
 BA.debugLineNum = 996;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(8);
if (true) break;

case 247:
//if
this.state = 252;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 249;
}else {
this.state = 251;
}if (true) break;

case 249:
//C
this.state = 252;
 BA.debugLineNum = 997;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalNeto,0";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_total.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_totalneto),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 if (true) break;

case 251:
//C
this.state = 252;
 BA.debugLineNum = 999;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalBruto,";
Debug.ShouldStop(64);
parent.mostCurrent._lbl_total.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_totalbruto),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))));
 if (true) break;

case 252:
//C
this.state = 253;
;
 BA.debugLineNum = 1002;BA.debugLine="Fila.Put(\"cantidad\",Cantidad)";
Debug.ShouldStop(512);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantidad"))),(Object)((_cantidad)));
 BA.debugLineNum = 1003;BA.debugLine="Fila.Put(\"cantud1\",CantUd1)";
Debug.ShouldStop(1024);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantud1"))),(Object)((_cantud1)));
 BA.debugLineNum = 1004;BA.debugLine="Fila.Put(\"cantud2\",CantUd2)";
Debug.ShouldStop(2048);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cantud2"))),(Object)((_cantud2)));
 BA.debugLineNum = 1006;BA.debugLine="Fila.Put(\"valnetolinea\",TotalNeto)";
Debug.ShouldStop(8192);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valnetolinea"))),(Object)((_totalneto)));
 BA.debugLineNum = 1007;BA.debugLine="Fila.Put(\"valivalinea\",TotalIva)";
Debug.ShouldStop(16384);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valivalinea"))),(Object)((_totaliva)));
 BA.debugLineNum = 1008;BA.debugLine="Fila.Put(\"valilalinea\",TotalIla)";
Debug.ShouldStop(32768);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valilalinea"))),(Object)((_totalila)));
 BA.debugLineNum = 1009;BA.debugLine="Fila.Put(\"valbrutolinea\",TotalBruto)";
Debug.ShouldStop(65536);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("valbrutolinea"))),(Object)((_totalbruto)));
 BA.debugLineNum = 1011;BA.debugLine="Fila.Put(\"dsctoneto\",TotalDsctoNeto)";
Debug.ShouldStop(262144);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dsctoneto"))),(Object)((_totaldsctoneto)));
 BA.debugLineNum = 1012;BA.debugLine="Fila.Put(\"dsctobruto\",TotalDsctoBruto)";
Debug.ShouldStop(524288);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dsctobruto"))),(Object)((_totaldsctobruto)));
 BA.debugLineNum = 1014;BA.debugLine="Fila.Put(\"precionetorealud1\",PrecioNetoRealUd1)";
Debug.ShouldStop(2097152);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetorealud1"))),(Object)((_precionetorealud1)));
 BA.debugLineNum = 1015;BA.debugLine="Fila.Put(\"precionetorealud2\",PrecioNetoRealUd2)";
Debug.ShouldStop(4194304);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetorealud2"))),(Object)((_precionetorealud2)));
 BA.debugLineNum = 1017;BA.debugLine="Lbl_Descuento.Text = NumberFormat(DescuentoPorc,0";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_descuento.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_descuentoporc),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(" %"))));
 BA.debugLineNum = 1020;BA.debugLine="Dim TipoValor As String";
Debug.ShouldStop(134217728);
_tipovalor = RemoteObject.createImmutable("");Debug.locals.put("TipoValor", _tipovalor);
 BA.debugLineNum = 1022;BA.debugLine="If ChkValores Then";
Debug.ShouldStop(536870912);
if (true) break;

case 253:
//if
this.state = 258;
if (parent._chkvalores.<Boolean>get().booleanValue()) { 
this.state = 255;
}else {
this.state = 257;
}if (true) break;

case 255:
//C
this.state = 258;
 BA.debugLineNum = 1023;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalNeto,0";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbl_total.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_totalneto),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1024;BA.debugLine="TipoValor = \"N\"";
Debug.ShouldStop(-2147483648);
_tipovalor = BA.ObjectToString("N");Debug.locals.put("TipoValor", _tipovalor);
 BA.debugLineNum = 1025;BA.debugLine="Total_Linea = TotalNeto	+ DescuentoValor";
Debug.ShouldStop(1);
parent._total_linea = RemoteObject.solve(new RemoteObject[] {_totalneto,_descuentovalor}, "+",1, 0);
 if (true) break;

case 257:
//C
this.state = 258;
 BA.debugLineNum = 1027;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(TotalBruto,";
Debug.ShouldStop(4);
parent.mostCurrent._lbl_total.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_totalbruto),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 1028;BA.debugLine="TipoValor = \"B\"";
Debug.ShouldStop(8);
_tipovalor = BA.ObjectToString("B");Debug.locals.put("TipoValor", _tipovalor);
 BA.debugLineNum = 1029;BA.debugLine="Total_Linea = TotalBruto + DescuentoValor";
Debug.ShouldStop(16);
parent._total_linea = RemoteObject.solve(new RemoteObject[] {_totalbruto,_descuentovalor}, "+",1, 0);
 if (true) break;

case 258:
//C
this.state = -1;
;
 BA.debugLineNum = 1032;BA.debugLine="Fila.Put(\"tipovalor\",TipoValor)";
Debug.ShouldStop(128);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tipovalor"))),(Object)((_tipovalor)));
 BA.debugLineNum = 1034;BA.debugLine="Dim PrecioNetoUd As Double = PrecioNeto";
Debug.ShouldStop(512);
_precionetoud = _precioneto;Debug.locals.put("PrecioNetoUd", _precionetoud);Debug.locals.put("PrecioNetoUd", _precionetoud);
 BA.debugLineNum = 1035;BA.debugLine="Dim PrecioBrutoUd As Double = PrecioBruto";
Debug.ShouldStop(1024);
_preciobrutoud = _preciobruto;Debug.locals.put("PrecioBrutoUd", _preciobrutoud);Debug.locals.put("PrecioBrutoUd", _preciobrutoud);
 BA.debugLineNum = 1037;BA.debugLine="Dim PrecioNetoUdLista As Double = Round2(Fila.Get";
Debug.ShouldStop(4096);
_precionetoudlista = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precionetoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioNetoUdLista", _precionetoudlista);Debug.locals.put("PrecioNetoUdLista", _precionetoudlista);
 BA.debugLineNum = 1038;BA.debugLine="Dim PrecioBrutoUdLista As Double = Round2(Fila.Ge";
Debug.ShouldStop(8192);
_preciobrutoudlista = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, parent.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("preciobrutoudlista")))))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("PrecioBrutoUdLista", _preciobrutoudlista);Debug.locals.put("PrecioBrutoUdLista", _preciobrutoudlista);
 BA.debugLineNum = 1040;BA.debugLine="Fila.Put(\"precionetoud\",PrecioNetoUd)";
Debug.ShouldStop(32768);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("precionetoud"))),(Object)((_precionetoud)));
 BA.debugLineNum = 1042;BA.debugLine="Fila.Put(\"preciobrutoud\",PrecioBrutoUd)";
Debug.ShouldStop(131072);
parent.mostCurrent._fila.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("preciobrutoud"))),(Object)((_preciobrutoud)));
 BA.debugLineNum = 1045;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1047;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _sb_revisar_descuentos() throws Exception{
try {
		Debug.PushSubsStack("Sb_Revisar_Descuentos (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,1183);
if (RapidSub.canDelegate("sb_revisar_descuentos")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","sb_revisar_descuentos");}
 BA.debugLineNum = 1183;BA.debugLine="Sub Sb_Revisar_Descuentos";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1185;BA.debugLine="Consulta_Sql = \"Select * From Descuentos_Doc Wher";
Debug.ShouldStop(1);
frm_post_01_producto.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Descuentos_Doc Where Id_DocDet = "),frm_post_01_producto._id_docdet);
 BA.debugLineNum = 1186;BA.debugLine="TblDescuentos = DBUtils.ExecuteList(Variables.vSq";
Debug.ShouldStop(2);
frm_post_01_producto.mostCurrent._tbldescuentos = frm_post_01_producto.mostCurrent._dbutils.runMethod(false,"_executelist" /*RemoteObject*/ ,frm_post_01_producto.mostCurrent.activityBA,(Object)(frm_post_01_producto.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_producto.mostCurrent._consulta_sql),(Object)((frm_post_01_producto.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1188;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txt_cantidad_click() throws Exception{
try {
		Debug.PushSubsStack("Txt_Cantidad_Click (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,327);
if (RapidSub.canDelegate("txt_cantidad_click")) { return BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","txt_cantidad_click");}
 BA.debugLineNum = 327;BA.debugLine="Sub Txt_Cantidad_Click   'if you are in the focus";
Debug.ShouldStop(64);
 BA.debugLineNum = 328;BA.debugLine="Txt_Cantidad.SelectAll";
Debug.ShouldStop(128);
frm_post_01_producto.mostCurrent._txt_cantidad.runVoidMethod ("SelectAll");
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _txt_cantidad_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("Txt_Cantidad_EnterPressed (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,331);
if (RapidSub.canDelegate("txt_cantidad_enterpressed")) { BaKapp.Movil.Tag.frm_post_01_producto.remoteMe.runUserSub(false, "frm_post_01_producto","txt_cantidad_enterpressed"); return;}
ResumableSub_Txt_Cantidad_EnterPressed rsub = new ResumableSub_Txt_Cantidad_EnterPressed(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Txt_Cantidad_EnterPressed extends BA.ResumableSub {
public ResumableSub_Txt_Cantidad_EnterPressed(BaKapp.Movil.Tag.frm_post_01_producto parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_producto parent;
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Txt_Cantidad_EnterPressed (frm_post_01_producto) ","frm_post_01_producto",23,frm_post_01_producto.mostCurrent.activityBA,frm_post_01_producto.mostCurrent,331);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 333;BA.debugLine="Txt_Cantidad.Tag = Txt_Cantidad.Text";
Debug.ShouldStop(4096);
parent.mostCurrent._txt_cantidad.runMethod(false,"setTag",(parent.mostCurrent._txt_cantidad.runMethod(true,"getText")));
 BA.debugLineNum = 334;BA.debugLine="If Txt_Cantidad.Text.Trim = \"\" Then Txt_Cantidad.";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._txt_cantidad.runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent.mostCurrent._txt_cantidad.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 336;BA.debugLine="Wait For (Sb_Procesar_Datos(\"Cantidad\")) Complete";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_producto.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_producto", "txt_cantidad_enterpressed"), _sb_procesar_datos(RemoteObject.createImmutable("Cantidad")));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 338;BA.debugLine="If Txt_Cantidad.Tag > 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent.mostCurrent._txt_cantidad.runMethod(false,"getTag")),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 339;BA.debugLine="Sb_Insertar_Descuentos_En_Escala";
Debug.ShouldStop(262144);
_sb_insertar_descuentos_en_escala();
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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