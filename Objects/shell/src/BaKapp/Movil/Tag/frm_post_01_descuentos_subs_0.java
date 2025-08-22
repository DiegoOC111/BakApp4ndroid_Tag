package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_post_01_descuentos_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,52);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","activity_create", _firsttime);}
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _descripcion = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 57;BA.debugLine="Consulta_Sql = \"Select * From Detalle_Doc Where I";
Debug.ShouldStop(16777216);
frm_post_01_descuentos.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select * From Detalle_Doc Where Id_DocDet = "),frm_post_01_descuentos._id_docdet);
 BA.debugLineNum = 58;BA.debugLine="Fila = DBUtils.ExecuteMap(Variables.vSql,Consulta";
Debug.ShouldStop(33554432);
frm_post_01_descuentos.mostCurrent._fila = frm_post_01_descuentos.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(frm_post_01_descuentos.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(frm_post_01_descuentos.mostCurrent._consulta_sql),(Object)((frm_post_01_descuentos.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 60;BA.debugLine="Activity.LoadLayout(\"Cp_Post_01_Descuentos\")";
Debug.ShouldStop(134217728);
frm_post_01_descuentos.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cp_Post_01_Descuentos")),frm_post_01_descuentos.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="Dim Codigo As String =Fila.Get(\"codigo\")";
Debug.ShouldStop(536870912);
_codigo = BA.ObjectToString(frm_post_01_descuentos.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codigo")))));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 63;BA.debugLine="Dim Descripcion As String =Fila.Get(\"descripcion\"";
Debug.ShouldStop(1073741824);
_descripcion = BA.ObjectToString(frm_post_01_descuentos.mostCurrent._fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descripcion")))));Debug.locals.put("Descripcion", _descripcion);Debug.locals.put("Descripcion", _descripcion);
 BA.debugLineNum = 65;BA.debugLine="Activity.Title = Codigo.Trim & \"-\" & Descripcion.";
Debug.ShouldStop(1);
frm_post_01_descuentos.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(RemoteObject.concat(_codigo.runMethod(true,"trim"),RemoteObject.createImmutable("-"),_descripcion.runMethod(true,"trim"))));
 BA.debugLineNum = 72;BA.debugLine="If Dscto_Max > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",frm_post_01_descuentos._dscto_max,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 73;BA.debugLine="NroDscto_Max = NroDscto+1";
Debug.ShouldStop(256);
frm_post_01_descuentos._nrodscto_max = RemoteObject.solve(new RemoteObject[] {frm_post_01_descuentos._nrodscto,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 BA.debugLineNum = 76;BA.debugLine="Sb_Cargar_Descuentos";
Debug.ShouldStop(2048);
_sb_cargar_descuentos();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,84);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,80);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","activity_resume");}
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_agregar_descuento_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Agregar_Descuento_Click (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,188);
if (RapidSub.canDelegate("btn_agregar_descuento_click")) { BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","btn_agregar_descuento_click"); return;}
ResumableSub_Btn_Agregar_Descuento_Click rsub = new ResumableSub_Btn_Agregar_Descuento_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Agregar_Descuento_Click extends BA.ResumableSub {
public ResumableSub_Btn_Agregar_Descuento_Click(BaKapp.Movil.Tag.frm_post_01_descuentos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_descuentos parent;
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _resultdscto = RemoteObject.createImmutable(0);
RemoteObject _kodt = RemoteObject.createImmutable("");
RemoteObject _podt = RemoteObject.createImmutable(0);
RemoteObject _vadt = RemoteObject.createImmutable(0);
RemoteObject _valor = RemoteObject.createImmutable(0);
RemoteObject _decimales = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Agregar_Descuento_Click (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,188);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 190;BA.debugLine="Dim DescuentoPorc As Double";
Debug.ShouldStop(536870912);
_descuentoporc = RemoteObject.createImmutable(0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 192;BA.debugLine="Wait For(Sb_Agregar_Descuento) Complete (ResultDs";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_descuentos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "btn_agregar_descuento_click"), _sb_agregar_descuento());
this.state = 31;
return;
case 31:
//C
this.state = 1;
_resultdscto = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ResultDscto", _resultdscto);
;
 BA.debugLineNum = 193;BA.debugLine="DescuentoPorc = ResultDscto";
Debug.ShouldStop(1);
_descuentoporc = _resultdscto;Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 195;BA.debugLine="If DescuentoPorc > 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_descuentoporc,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 197;BA.debugLine="Dim Kodt As String = \"D_SIN_TIPO\"";
Debug.ShouldStop(16);
_kodt = BA.ObjectToString("D_SIN_TIPO");Debug.locals.put("Kodt", _kodt);Debug.locals.put("Kodt", _kodt);
 BA.debugLineNum = 198;BA.debugLine="Dim Podt As Double = DescuentoPorc";
Debug.ShouldStop(32);
_podt = _descuentoporc;Debug.locals.put("Podt", _podt);Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 199;BA.debugLine="Dim Vadt As Double";
Debug.ShouldStop(64);
_vadt = RemoteObject.createImmutable(0);Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 201;BA.debugLine="Dim Valor As Double = SubTotal_Linea";
Debug.ShouldStop(256);
_valor = parent._subtotal_linea;Debug.locals.put("Valor", _valor);Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 202;BA.debugLine="Dim Decimales As Int = 0";
Debug.ShouldStop(512);
_decimales = BA.numberCast(int.class, 0);Debug.locals.put("Decimales", _decimales);Debug.locals.put("Decimales", _decimales);
 BA.debugLineNum = 204;BA.debugLine="If Podt <> 0 Or Vadt <> 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("!",_vadt,BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 206;BA.debugLine="If Podt <> 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 208;BA.debugLine="If Podt > 0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean(">",_podt,BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 209;BA.debugLine="Vadt = Round2((Podt / 100) * Valor,Decimales)";
Debug.ShouldStop(65536);
_vadt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_podt,RemoteObject.createImmutable(100)}, "/",0, 0)),_valor}, "*",0, 0)),(Object)(_decimales));Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 210;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
Debug.ShouldStop(131072);
_podt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_vadt,_valor}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Podt", _podt);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 212;BA.debugLine="Vadt = 0";
Debug.ShouldStop(524288);
_vadt = BA.numberCast(double.class, 0);Debug.locals.put("Vadt", _vadt);
 if (true) break;

case 15:
//C
this.state = 24;
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 217;BA.debugLine="If Vadt <> 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_vadt,BA.numberCast(double.class, 0))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 218;BA.debugLine="Podt = Round2((Vadt / Valor) * 100,5)";
Debug.ShouldStop(33554432);
_podt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_vadt,_valor}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Podt", _podt);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 220;BA.debugLine="Podt = 0";
Debug.ShouldStop(134217728);
_podt = BA.numberCast(double.class, 0);Debug.locals.put("Podt", _podt);
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
 BA.debugLineNum = 225;BA.debugLine="Podt = Round2(Podt,Decimales)";
Debug.ShouldStop(1);
_podt = parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(_podt),(Object)(_decimales));Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 227;BA.debugLine="If Podt <> 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean("!",_podt,BA.numberCast(double.class, 0))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 229;BA.debugLine="Consulta_Sql = \"Insert Into Descuentos_Doc (Id";
Debug.ShouldStop(16);
parent.mostCurrent._consulta_sql = BA.ObjectToString("Insert Into Descuentos_Doc (Id_DocEnc,Id_DocDet,Nulido,Kodt,Podt,Vadt,Podt_Original) Values (?,?,?,?,?,?,?)");
 BA.debugLineNum = 230;BA.debugLine="Variables.vSql.ExecNonQuery2(Consulta_Sql, Arr";
Debug.ShouldStop(32);
parent.mostCurrent._variables._vsql /*RemoteObject*/ .runVoidMethod ("ExecNonQuery2",(Object)(parent.mostCurrent._consulta_sql),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(parent._id_docenc),(parent._id_docdet),RemoteObject.createImmutable(("")),(_kodt),(_podt),(_vadt),(_podt)})))));
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 240;BA.debugLine="Sb_Cargar_Descuentos";
Debug.ShouldStop(32768);
_sb_cargar_descuentos();
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _complete(RemoteObject _resultdscto) throws Exception{
}
public static RemoteObject  _btn_volver_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Volver_Click (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,184);
if (RapidSub.canDelegate("btn_volver_click")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","btn_volver_click");}
 BA.debugLineNum = 184;BA.debugLine="Private Sub Btn_Volver_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
frm_post_01_descuentos.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Dim Consulta_Sql As String";
frm_post_01_descuentos.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="Dim bmp1 As Bitmap";
frm_post_01_descuentos.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim xui As XUI";
frm_post_01_descuentos.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 30;BA.debugLine="Private XclvDescuentos As CustomListView";
frm_post_01_descuentos.mostCurrent._xclvdescuentos = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 31;BA.debugLine="Private Btn_Agregar_Descuento As Button";
frm_post_01_descuentos.mostCurrent._btn_agregar_descuento = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Lbl_Total_Dscto_Porc As Label";
frm_post_01_descuentos.mostCurrent._lbl_total_dscto_porc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Lbl_Total_Dscto_Valor As Label";
frm_post_01_descuentos.mostCurrent._lbl_total_dscto_valor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Lbl_Total_Linea As Label";
frm_post_01_descuentos.mostCurrent._lbl_total_linea = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Btn_Volver As Button";
frm_post_01_descuentos.mostCurrent._btn_volver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Lbl_Id_DocDsc As B4XView";
frm_post_01_descuentos.mostCurrent._lbl_id_docdsc = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Lbl_Kodt As B4XView";
frm_post_01_descuentos.mostCurrent._lbl_kodt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_Item As B4XView";
frm_post_01_descuentos.mostCurrent._lbl_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Podt As B4XView";
frm_post_01_descuentos.mostCurrent._lbl_podt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_Vadt As B4XView";
frm_post_01_descuentos.mostCurrent._lbl_vadt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim Fila As Map";
frm_post_01_descuentos.mostCurrent._fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 45;BA.debugLine="Dim Dsctos As List";
frm_post_01_descuentos.mostCurrent._dsctos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 46;BA.debugLine="Dim	SubTotal_Linea As Double";
frm_post_01_descuentos._subtotal_linea = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 47;BA.debugLine="Dim NroDscto_Max As Int";
frm_post_01_descuentos._nrodscto_max = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 48;BA.debugLine="Dim bmp1 As Bitmap";
frm_post_01_descuentos.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public Id_DocEnc As Int";
frm_post_01_descuentos._id_docenc = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Public Id_DocDet As Int";
frm_post_01_descuentos._id_docdet = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Public Total_Linea_Origen As Double";
frm_post_01_descuentos._total_linea_origen = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Public Total_Descuento As Double";
frm_post_01_descuentos._total_descuento = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 15;BA.debugLine="Public Total_Pc As Double";
frm_post_01_descuentos._total_pc = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Public NroDscto As Int";
frm_post_01_descuentos._nrodscto = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="Public Dscto_Max As Int";
frm_post_01_descuentos._dscto_max = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sb_agregar_descuento() throws Exception{
try {
		Debug.PushSubsStack("Sb_Agregar_Descuento (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,246);
if (RapidSub.canDelegate("sb_agregar_descuento")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","sb_agregar_descuento");}
ResumableSub_Sb_Agregar_Descuento rsub = new ResumableSub_Sb_Agregar_Descuento(null);
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
public static class ResumableSub_Sb_Agregar_Descuento extends BA.ResumableSub {
public ResumableSub_Sb_Agregar_Descuento(BaKapp.Movil.Tag.frm_post_01_descuentos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_descuentos parent;
RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _descuentoporc = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _inputtemplate = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xinputtemplate");
RemoteObject _newdescuentoporc = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Sb_Agregar_Descuento (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,246);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 248;BA.debugLine="Private Base As B4XView";
Debug.ShouldStop(8388608);
_base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("Base", _base);
 BA.debugLineNum = 249;BA.debugLine="Private dialog As B4XDialog";
Debug.ShouldStop(16777216);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("dialog", _dialog);
 BA.debugLineNum = 250;BA.debugLine="Dim DescuentoPorc As Double";
Debug.ShouldStop(33554432);
_descuentoporc = RemoteObject.createImmutable(0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 252;BA.debugLine="If Dscto_Max > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",parent._dscto_max,BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 254;BA.debugLine="If NroDscto_Max = NroDscto Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent._nrodscto_max,BA.numberCast(double.class, parent._nrodscto))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 256;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 257;BA.debugLine="Msgbox2Async(\"No puede agregar mas líneas de de";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("No puede agregar mas líneas de descuento")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_descuentos.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 258;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_descuentos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "sb_agregar_descuento"), null);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 259;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(4);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 BA.debugLineNum = 260;BA.debugLine="Return DescuentoPorc";
Debug.ShouldStop(8);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_descuentoporc));return;};
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
 BA.debugLineNum = 267;BA.debugLine="Base = Activity";
Debug.ShouldStop(1024);
_base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject());Debug.locals.put("Base", _base);
 BA.debugLineNum = 268;BA.debugLine="dialog.Initialize (Base)";
Debug.ShouldStop(2048);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(_base));
 BA.debugLineNum = 270;BA.debugLine="Private InputTemplate As B4XInputTemplate";
Debug.ShouldStop(8192);
_inputtemplate = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xinputtemplate");Debug.locals.put("InputTemplate", _inputtemplate);
 BA.debugLineNum = 271;BA.debugLine="InputTemplate.Initialize";
Debug.ShouldStop(16384);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA);
 BA.debugLineNum = 273;BA.debugLine="If Dscto_Max > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",parent._dscto_max,BA.numberCast(double.class, 0))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 275;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese % descuen";
Debug.ShouldStop(262144);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ingrese % descuento. Max "),parent._dscto_max,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 276;BA.debugLine="InputTemplate.Text = Dscto_Max";
Debug.ShouldStop(524288);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.NumberToString(parent._dscto_max));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 284;BA.debugLine="InputTemplate.lblTitle.Text = \"Ingrese % descue";
Debug.ShouldStop(134217728);
_inputtemplate.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Ingrese % descuento"));
 BA.debugLineNum = 285;BA.debugLine="InputTemplate.Text = \"\"";
Debug.ShouldStop(268435456);
_inputtemplate.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 290;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
Debug.ShouldStop(2);
_inputtemplate.runClassMethod (BaKapp.Movil.Tag.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 292;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_post_01_descuentos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "sb_agregar_descuento"), _dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputtemplate)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 40;
return;
case 40:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 294;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(32);
if (true) break;

case 15:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}else {
this.state = 37;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 295;BA.debugLine="Try";
Debug.ShouldStop(64);
if (true) break;

case 18:
//try
this.state = 35;
this.catchState = 34;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 34;
 BA.debugLineNum = 296;BA.debugLine="Dim NewDescuentoPorc As Double = InputTemplate.";
Debug.ShouldStop(128);
_newdescuentoporc = BA.numberCast(double.class, _inputtemplate.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("NewDescuentoPorc", _newdescuentoporc);Debug.locals.put("NewDescuentoPorc", _newdescuentoporc);
 BA.debugLineNum = 298;BA.debugLine="If Dscto_Max > 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 21:
//if
this.state = 32;
if (RemoteObject.solveBoolean(">",parent._dscto_max,BA.numberCast(double.class, 0))) { 
this.state = 23;
}else {
this.state = 31;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 300;BA.debugLine="If NewDescuentoPorc > Dscto_Max Then";
Debug.ShouldStop(2048);
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean(">",_newdescuentoporc,BA.numberCast(double.class, parent._dscto_max))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 301;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-can";
Debug.ShouldStop(4096);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 302;BA.debugLine="Msgbox2Async(\"El descuento no puede ser mayor";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("El descuento no puede ser mayor a un "),parent._dscto_max,RemoteObject.createImmutable("%")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_descuentos.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 303;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_descuentos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "sb_agregar_descuento"), null);
this.state = 41;
return;
case 41:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 304;BA.debugLine="DescuentoPorc = 0";
Debug.ShouldStop(32768);
_descuentoporc = BA.numberCast(double.class, 0);Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 306;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
Debug.ShouldStop(131072);
_descuentoporc = _newdescuentoporc;Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 310;BA.debugLine="DescuentoPorc = NewDescuentoPorc";
Debug.ShouldStop(2097152);
_descuentoporc = _newdescuentoporc;Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 32:
//C
this.state = 35;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
 BA.debugLineNum = 314;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","617104964",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_descuentos.mostCurrent.activityBA)),0);
 BA.debugLineNum = 315;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cance";
Debug.ShouldStop(67108864);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 316;BA.debugLine="Msgbox2Async(\"Error!\",LastException, \"Ok\", \"\",";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Error!")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(false,"LastException",frm_post_01_descuentos.mostCurrent.activityBA).getObject())),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_descuentos.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 317;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_descuentos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "sb_agregar_descuento"), null);
this.state = 42;
return;
case 42:
//C
this.state = 35;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 318;BA.debugLine="DescuentoPorc = -1";
Debug.ShouldStop(536870912);
_descuentoporc = BA.numberCast(double.class, -(double) (0 + 1));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;
if (true) break;

case 35:
//C
this.state = 38;
this.catchState = 0;
;
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 321;BA.debugLine="DescuentoPorc = -1";
Debug.ShouldStop(1);
_descuentoporc = BA.numberCast(double.class, -(double) (0 + 1));Debug.locals.put("DescuentoPorc", _descuentoporc);
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 324;BA.debugLine="Return DescuentoPorc";
Debug.ShouldStop(8);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_descuentoporc));return;};
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",frm_post_01_descuentos.processBA, e0.toString());}
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
public static RemoteObject  _sb_cargar_descuentos() throws Exception{
try {
		Debug.PushSubsStack("Sb_Cargar_Descuentos (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,88);
if (RapidSub.canDelegate("sb_cargar_descuentos")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","sb_cargar_descuentos");}
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _itemstr = RemoteObject.createImmutable("");
RemoteObject _id_docdsc = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _kodt = RemoteObject.createImmutable("");
RemoteObject _podt = RemoteObject.createImmutable(0);
RemoteObject _vadt = RemoteObject.createImmutable(0);
 BA.debugLineNum = 88;BA.debugLine="Sub Sb_Cargar_Descuentos()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(33554432);
frm_post_01_descuentos.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 91;BA.debugLine="XclvDescuentos.DefaultTextBackgroundColor = Color";
Debug.ShouldStop(67108864);
frm_post_01_descuentos.mostCurrent._xclvdescuentos.setField ("_defaulttextbackgroundcolor",frm_post_01_descuentos.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 92;BA.debugLine="XclvDescuentos.Clear";
Debug.ShouldStop(134217728);
frm_post_01_descuentos.mostCurrent._xclvdescuentos.runVoidMethod ("_clear");
 BA.debugLineNum = 93;BA.debugLine="Private Row As Int";
Debug.ShouldStop(268435456);
_row = RemoteObject.createImmutable(0);Debug.locals.put("Row", _row);
 BA.debugLineNum = 94;BA.debugLine="Private Cursor1 As Cursor";
Debug.ShouldStop(536870912);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 96;BA.debugLine="Dsctos.Initialize";
Debug.ShouldStop(-2147483648);
frm_post_01_descuentos.mostCurrent._dsctos.runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="Dim ItemStr As String";
Debug.ShouldStop(4);
_itemstr = RemoteObject.createImmutable("");Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 101;BA.debugLine="Consulta_Sql =\"Select Id_DocDsc,Nulido,Kodt,Podt,";
Debug.ShouldStop(16);
frm_post_01_descuentos.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDsc,Nulido,Kodt,Podt,Vadt,Podt_Original From Descuentos_Doc Where Id_DocEnc = "),frm_post_01_descuentos._id_docenc,RemoteObject.createImmutable(" And Id_DocDet = "),frm_post_01_descuentos._id_docdet);
 BA.debugLineNum = 102;BA.debugLine="Cursor1 = Variables.vSql.ExecQuery(Consulta_Sql)";
Debug.ShouldStop(32);
_cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), frm_post_01_descuentos.mostCurrent._variables._vsql /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(frm_post_01_descuentos.mostCurrent._consulta_sql)));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 104;BA.debugLine="If Cursor1.RowCount > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 106;BA.debugLine="NroDscto = Cursor1.RowCount";
Debug.ShouldStop(512);
frm_post_01_descuentos._nrodscto = _cursor1.runMethod(true,"getRowCount");
 BA.debugLineNum = 108;BA.debugLine="For Row = 0 To NroDscto - 1";
Debug.ShouldStop(2048);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {frm_post_01_descuentos._nrodscto,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _row.<Integer>get().intValue() <= limit12) || (step12 < 0 && _row.<Integer>get().intValue() >= limit12) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 110;BA.debugLine="Cursor1.Position = Row";
Debug.ShouldStop(8192);
_cursor1.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 111;BA.debugLine="Dsctos.Add(Cursor1.GetString2(0))";
Debug.ShouldStop(16384);
frm_post_01_descuentos.mostCurrent._dsctos.runVoidMethod ("Add",(Object)((_cursor1.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 113;BA.debugLine="Dim Id_DocDsc As Int = Cursor1.GetString(\"Id_Do";
Debug.ShouldStop(65536);
_id_docdsc = BA.numberCast(int.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Id_DocDsc"))));Debug.locals.put("Id_DocDsc", _id_docdsc);Debug.locals.put("Id_DocDsc", _id_docdsc);
 BA.debugLineNum = 115;BA.debugLine="Dim Item As Int = Row+1";
Debug.ShouldStop(262144);
_item = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 116;BA.debugLine="ItemStr = Funciones.Rellenar_Izquierda(Item,2,\"";
Debug.ShouldStop(524288);
_itemstr = frm_post_01_descuentos.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(BA.NumberToString(_item)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("ItemStr", _itemstr);
 BA.debugLineNum = 118;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = frm_post_01_descuentos.mostCurrent._xui.runMethod(false,"CreatePanel",frm_post_01_descuentos.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDescuentos.AsVi";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(frm_post_01_descuentos.mostCurrent._xclvdescuentos.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))));
 BA.debugLineNum = 121;BA.debugLine="p.LoadLayout(\"Items_Descuentos\")";
Debug.ShouldStop(16777216);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_Descuentos")),frm_post_01_descuentos.mostCurrent.activityBA);
 BA.debugLineNum = 122;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(33554432);
_p.runMethod(true,"setColor",frm_post_01_descuentos.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 124;BA.debugLine="Dim Kodt As String = Cursor1.GetString(\"Kodt\")";
Debug.ShouldStop(134217728);
_kodt = _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Kodt")));Debug.locals.put("Kodt", _kodt);Debug.locals.put("Kodt", _kodt);
 BA.debugLineNum = 125;BA.debugLine="Dim Podt As Double = Cursor1.GetString(\"Podt\")";
Debug.ShouldStop(268435456);
_podt = BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Podt"))));Debug.locals.put("Podt", _podt);Debug.locals.put("Podt", _podt);
 BA.debugLineNum = 126;BA.debugLine="Dim Vadt As Double = Cursor1.GetString(\"Vadt\")";
Debug.ShouldStop(536870912);
_vadt = BA.numberCast(double.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Vadt"))));Debug.locals.put("Vadt", _vadt);Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 128;BA.debugLine="Lbl_Id_DocDsc.Tag = Id_DocDsc";
Debug.ShouldStop(-2147483648);
frm_post_01_descuentos.mostCurrent._lbl_id_docdsc.runMethod(false,"setTag",(_id_docdsc));
 BA.debugLineNum = 129;BA.debugLine="Lbl_Kodt.Text = Kodt";
Debug.ShouldStop(1);
frm_post_01_descuentos.mostCurrent._lbl_kodt.runMethod(true,"setText",BA.ObjectToCharSequence(_kodt));
 BA.debugLineNum = 130;BA.debugLine="Lbl_Podt.Text = \"% \" & NumberFormat(Podt,0,2)";
Debug.ShouldStop(2);
frm_post_01_descuentos.mostCurrent._lbl_podt.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("% "),frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_podt),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 131;BA.debugLine="Lbl_Podt.Tag = Podt";
Debug.ShouldStop(4);
frm_post_01_descuentos.mostCurrent._lbl_podt.runMethod(false,"setTag",(_podt));
 BA.debugLineNum = 132;BA.debugLine="Lbl_Vadt.Text = \"$ \" & NumberFormat(Vadt,0,2)";
Debug.ShouldStop(8);
frm_post_01_descuentos.mostCurrent._lbl_vadt.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_vadt),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 133;BA.debugLine="Lbl_Vadt.Tag = Vadt";
Debug.ShouldStop(16);
frm_post_01_descuentos.mostCurrent._lbl_vadt.runMethod(false,"setTag",(_vadt));
 BA.debugLineNum = 134;BA.debugLine="Lbl_Item.Tag = Item";
Debug.ShouldStop(32);
frm_post_01_descuentos.mostCurrent._lbl_item.runMethod(false,"setTag",(_item));
 BA.debugLineNum = 135;BA.debugLine="Lbl_Item.Text = \"Item: \" & ItemStr";
Debug.ShouldStop(64);
frm_post_01_descuentos.mostCurrent._lbl_item.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Item: "),_itemstr)));
 BA.debugLineNum = 137;BA.debugLine="XclvDescuentos.Add(p,\"\")";
Debug.ShouldStop(256);
frm_post_01_descuentos.mostCurrent._xclvdescuentos.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("Row", _row);
;
 }else {
 BA.debugLineNum = 142;BA.debugLine="ToastMessageShow(\"No items found\", False)";
Debug.ShouldStop(8192);
frm_post_01_descuentos.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No items found")),(Object)(frm_post_01_descuentos.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 145;BA.debugLine="DBUtils.UpdateRecord(Variables.vSql,\"Detalle_Doc\"";
Debug.ShouldStop(65536);
frm_post_01_descuentos.mostCurrent._dbutils.runVoidMethod ("_updaterecord" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(frm_post_01_descuentos.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Detalle_Doc")),(Object)(BA.ObjectToString("NroDscto")),(Object)((frm_post_01_descuentos._nrodscto)),(Object)(frm_post_01_descuentos.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Id_DocDet")),(frm_post_01_descuentos._id_docdet)}))));
 BA.debugLineNum = 147;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(262144);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 148;BA.debugLine="Sb_Sumar_Totales";
Debug.ShouldStop(524288);
_sb_sumar_totales();
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sb_sumar_totales() throws Exception{
try {
		Debug.PushSubsStack("Sb_Sumar_Totales (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,152);
if (RapidSub.canDelegate("sb_sumar_totales")) { return BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","sb_sumar_totales");}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _vlbl_vadt = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _vadt = RemoteObject.createImmutable(0);
 BA.debugLineNum = 152;BA.debugLine="Sub Sb_Sumar_Totales()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 154;BA.debugLine="Total_Descuento = 0";
Debug.ShouldStop(33554432);
frm_post_01_descuentos._total_descuento = BA.numberCast(double.class, 0);
 BA.debugLineNum = 156;BA.debugLine="For i = 0 To XclvDescuentos.Size -1";
Debug.ShouldStop(134217728);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {frm_post_01_descuentos.mostCurrent._xclvdescuentos.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 158;BA.debugLine="Dim p As B4XView = XclvDescuentos.GetPanel(i)";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = frm_post_01_descuentos.mostCurrent._xclvdescuentos.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 160;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 162;BA.debugLine="Dim vLbl_Vadt As Label = p.GetView(4)";
Debug.ShouldStop(2);
_vlbl_vadt = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_vlbl_vadt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).getObject());Debug.locals.put("vLbl_Vadt", _vlbl_vadt);Debug.locals.put("vLbl_Vadt", _vlbl_vadt);
 BA.debugLineNum = 163;BA.debugLine="Dim Vadt As Double = Funciones.Fx_NuloPorNro(vL";
Debug.ShouldStop(4);
_vadt = BA.numberCast(double.class, frm_post_01_descuentos.mostCurrent._funciones.runMethod(true,"_fx_nulopornro" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(_vlbl_vadt.runMethod(false,"getTag")),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Vadt", _vadt);Debug.locals.put("Vadt", _vadt);
 BA.debugLineNum = 165;BA.debugLine="Total_Descuento = Total_Descuento+Vadt";
Debug.ShouldStop(16);
frm_post_01_descuentos._total_descuento = RemoteObject.solve(new RemoteObject[] {frm_post_01_descuentos._total_descuento,_vadt}, "+",1, 0);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 171;BA.debugLine="SubTotal_Linea = Round2(Total_Linea_Origen-Total_";
Debug.ShouldStop(1024);
frm_post_01_descuentos._subtotal_linea = frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {frm_post_01_descuentos._total_linea_origen,frm_post_01_descuentos._total_descuento}, "-",1, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 172;BA.debugLine="Total_Pc = 0";
Debug.ShouldStop(2048);
frm_post_01_descuentos._total_pc = BA.numberCast(double.class, 0);
 BA.debugLineNum = 174;BA.debugLine="If Total_Descuento <> 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",frm_post_01_descuentos._total_descuento,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 175;BA.debugLine="Total_Pc = (Total_Descuento / Total_Linea_Origen";
Debug.ShouldStop(16384);
frm_post_01_descuentos._total_pc = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {frm_post_01_descuentos._total_descuento,frm_post_01_descuentos._total_linea_origen}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0);
 };
 BA.debugLineNum = 178;BA.debugLine="Lbl_Total_Dscto_Porc.Text = \"% \" & NumberFormat(T";
Debug.ShouldStop(131072);
frm_post_01_descuentos.mostCurrent._lbl_total_dscto_porc.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("% "),frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(frm_post_01_descuentos._total_pc),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 179;BA.debugLine="Lbl_Total_Dscto_Valor.Text = \"$ \" & NumberFormat(";
Debug.ShouldStop(262144);
frm_post_01_descuentos.mostCurrent._lbl_total_dscto_valor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(frm_post_01_descuentos._total_descuento),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 180;BA.debugLine="Lbl_Total_Linea.Text = \"$ \" & NumberFormat(SubTot";
Debug.ShouldStop(524288);
frm_post_01_descuentos.mostCurrent._lbl_total_linea.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),frm_post_01_descuentos.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(frm_post_01_descuentos._subtotal_linea),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _xclvdescuentos_itemlongclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("XclvDescuentos_ItemLongClick (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,328);
if (RapidSub.canDelegate("xclvdescuentos_itemlongclick")) { BaKapp.Movil.Tag.frm_post_01_descuentos.remoteMe.runUserSub(false, "frm_post_01_descuentos","xclvdescuentos_itemlongclick", _index, _value); return;}
ResumableSub_XclvDescuentos_ItemLongClick rsub = new ResumableSub_XclvDescuentos_ItemLongClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_XclvDescuentos_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDescuentos_ItemLongClick(BaKapp.Movil.Tag.frm_post_01_descuentos parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_post_01_descuentos parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbliddocdsc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _id_docdsc = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _fila_dscto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("XclvDescuentos_ItemLongClick (frm_post_01_descuentos) ","frm_post_01_descuentos",20,frm_post_01_descuentos.mostCurrent.activityBA,frm_post_01_descuentos.mostCurrent,328);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 330;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(512);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 331;BA.debugLine="Dim Item As CLVItem  = XclvDescuentos.GetRawListI";
Debug.ShouldStop(1024);
_item = parent.mostCurrent._xclvdescuentos.runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 332;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 333;BA.debugLine="Dim LblIdDocDsc As Label = p.GetView(0)";
Debug.ShouldStop(4096);
_lbliddocdsc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbliddocdsc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblIdDocDsc", _lbliddocdsc);Debug.locals.put("LblIdDocDsc", _lbliddocdsc);
 BA.debugLineNum = 334;BA.debugLine="Dim LblItem As Label = p.GetView(5)";
Debug.ShouldStop(8192);
_lblitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).getObject());Debug.locals.put("LblItem", _lblitem);Debug.locals.put("LblItem", _lblitem);
 BA.debugLineNum = 337;BA.debugLine="If NroDscto <> LblItem.Tag Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",parent._nrodscto,BA.numberCast(double.class, _lblitem.runMethod(false,"getTag")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 338;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel";
Debug.ShouldStop(131072);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));
 BA.debugLineNum = 339;BA.debugLine="Msgbox2Async(\"Solo puede hacer cambios en la ult";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Solo puede hacer cambios en la ultima fila")),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1),frm_post_01_descuentos.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 340;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 343;BA.debugLine="Dim Id_DocDsc As Int = LblIdDocDsc.Tag";
Debug.ShouldStop(4194304);
_id_docdsc = BA.numberCast(int.class, _lbliddocdsc.runMethod(false,"getTag"));Debug.locals.put("Id_DocDsc", _id_docdsc);Debug.locals.put("Id_DocDsc", _id_docdsc);
 BA.debugLineNum = 345;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));
 BA.debugLineNum = 347;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"¿Confirma la";
Debug.ShouldStop(67108864);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",frm_post_01_descuentos.processBA,(Object)(BA.ObjectToCharSequence("¿Confirma la eliminación de este descuento?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("SI")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("NO")),(Object)(parent.mostCurrent._bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 348;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_post_01_descuentos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "xclvdescuentos_itemlongclick"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 350;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 352;BA.debugLine="Consulta_Sql = \"Select Id_DocDsc From Descuentos";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Id_DocDsc From Descuentos_Doc Where Id_DocDsc = "),_id_docdsc);
 BA.debugLineNum = 353;BA.debugLine="Dim Fila_Dscto As Map = DBUtils.ExecuteMap(Varia";
Debug.ShouldStop(1);
_fila_dscto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fila_dscto = parent.mostCurrent._dbutils.runMethod(false,"_executemap" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(parent.mostCurrent._consulta_sql),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Fila_Dscto", _fila_dscto);Debug.locals.put("Fila_Dscto", _fila_dscto);
 BA.debugLineNum = 355;BA.debugLine="If Fila_Dscto.IsInitialized Then";
Debug.ShouldStop(4);
if (true) break;

case 8:
//if
this.state = 11;
if (_fila_dscto.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 356;BA.debugLine="DBUtils.DeleteRecord(Variables.vSql,\"Descuentos";
Debug.ShouldStop(8);
parent.mostCurrent._dbutils.runVoidMethod ("_deleterecord" /*RemoteObject*/ ,frm_post_01_descuentos.mostCurrent.activityBA,(Object)(parent.mostCurrent._variables._vsql /*RemoteObject*/ ),(Object)(BA.ObjectToString("Descuentos_Doc")),(Object)(_fila_dscto));
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 359;BA.debugLine="p.SetLayoutAnimated(500,-300dip,p.Top,p.Width,p.";
Debug.ShouldStop(64);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, -(double) (0 + parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))).<Integer>get().intValue()))),(Object)(_p.runMethod(true,"getTop")),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 360;BA.debugLine="Sleep(600)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",frm_post_01_descuentos.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_post_01_descuentos", "xclvdescuentos_itemlongclick"),BA.numberCast(int.class, 600));
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 361;BA.debugLine="XclvDescuentos.RemoveAt(Index)";
Debug.ShouldStop(256);
parent.mostCurrent._xclvdescuentos.runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 365;BA.debugLine="Sb_Cargar_Descuentos";
Debug.ShouldStop(4096);
_sb_cargar_descuentos();
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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