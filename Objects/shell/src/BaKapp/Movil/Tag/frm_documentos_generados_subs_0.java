package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_documentos_generados_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,55);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","activity_create", _firsttime);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 59;BA.debugLine="Activity.LoadLayout(\"Cp_Documentos_Generados\")";
Debug.ShouldStop(67108864);
frm_documentos_generados.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cp_Documentos_Generados")),frm_documentos_generados.mostCurrent.activityBA);
 BA.debugLineNum = 60;BA.debugLine="Base = Activity";
Debug.ShouldStop(134217728);
frm_documentos_generados.mostCurrent._base = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), frm_documentos_generados.mostCurrent._activity.getObject());
 BA.debugLineNum = 61;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(268435456);
frm_documentos_generados.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(frm_documentos_generados.mostCurrent._base));
 BA.debugLineNum = 62;BA.debugLine="Dialog.Title = \"Bakapp\"";
Debug.ShouldStop(536870912);
frm_documentos_generados.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Bakapp")));
 BA.debugLineNum = 64;BA.debugLine="DateTemplateDesde.Initialize";
Debug.ShouldStop(-2147483648);
frm_documentos_generados.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA);
 BA.debugLineNum = 65;BA.debugLine="DateTemplateHasta.Initialize";
Debug.ShouldStop(1);
frm_documentos_generados.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="DateTemplateDesde.Date = DateTime.Now";
Debug.ShouldStop(4);
frm_documentos_generados.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 68;BA.debugLine="DateTemplateHasta.Date = DateTime.Now";
Debug.ShouldStop(8);
frm_documentos_generados.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 70;BA.debugLine="Btn_Fecha_Desde.Text = DateTime.Date(DateTemplate";
Debug.ShouldStop(32);
frm_documentos_generados.mostCurrent._btn_fecha_desde.runMethod(true,"setText",BA.ObjectToCharSequence(frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(frm_documentos_generados.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))));
 BA.debugLineNum = 71;BA.debugLine="Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplate";
Debug.ShouldStop(64);
frm_documentos_generados.mostCurrent._btn_fecha_hasta.runMethod(true,"setText",BA.ObjectToCharSequence(frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(frm_documentos_generados.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))));
 BA.debugLineNum = 73;BA.debugLine="DateTemplateDesde.MaxYear = DateTime.GetYear(Date";
Debug.ShouldStop(256);
frm_documentos_generados.mostCurrent._datetemplatedesde.setField ("_maxyear" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 74;BA.debugLine="DateTemplateDesde.MinYear = DateTemplateDesde.Max";
Debug.ShouldStop(512);
frm_documentos_generados.mostCurrent._datetemplatedesde.setField ("_minyear" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {frm_documentos_generados.mostCurrent._datetemplatedesde.getField(true,"_maxyear" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "-",1, 1));
 BA.debugLineNum = 76;BA.debugLine="DateTemplateHasta.MaxYear = DateTime.GetYear(Date";
Debug.ShouldStop(2048);
frm_documentos_generados.mostCurrent._datetemplatehasta.setField ("_maxyear" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(frm_documentos_generados.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 77;BA.debugLine="DateTemplateHasta.MinYear = DateTemplateDesde.Max";
Debug.ShouldStop(4096);
frm_documentos_generados.mostCurrent._datetemplatehasta.setField ("_minyear" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {frm_documentos_generados.mostCurrent._datetemplatedesde.getField(true,"_maxyear" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "-",1, 1));
 BA.debugLineNum = 79;BA.debugLine="B4XLoading.Hide";
Debug.ShouldStop(16384);
frm_documentos_generados.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="Dim Items As List";
Debug.ShouldStop(65536);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 82;BA.debugLine="Items.Initialize";
Debug.ShouldStop(131072);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="Items.Add(\"10\")";
Debug.ShouldStop(262144);
_items.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("10"))));
 BA.debugLineNum = 84;BA.debugLine="Items.Add(\"20\")";
Debug.ShouldStop(524288);
_items.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("20"))));
 BA.debugLineNum = 85;BA.debugLine="Items.Add(\"30\")";
Debug.ShouldStop(1048576);
_items.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("30"))));
 BA.debugLineNum = 86;BA.debugLine="Items.Add(\"40\")";
Debug.ShouldStop(2097152);
_items.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("40"))));
 BA.debugLineNum = 87;BA.debugLine="Items.Add(\"50\")";
Debug.ShouldStop(4194304);
_items.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("50"))));
 BA.debugLineNum = 88;BA.debugLine="Items.Add(\"100\")";
Debug.ShouldStop(8388608);
_items.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("100"))));
 BA.debugLineNum = 90;BA.debugLine="CantTop = 10";
Debug.ShouldStop(33554432);
frm_documentos_generados._canttop = BA.numberCast(int.class, 10);
 BA.debugLineNum = 91;BA.debugLine="Txt_Top.Text = CantTop";
Debug.ShouldStop(67108864);
frm_documentos_generados.mostCurrent._txt_top.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(frm_documentos_generados._canttop));
 BA.debugLineNum = 93;BA.debugLine="Doc_Seleccionado = False";
Debug.ShouldStop(268435456);
frm_documentos_generados._doc_seleccionado = frm_documentos_generados.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 94;BA.debugLine="Idmaeedo_Sel = 0";
Debug.ShouldStop(536870912);
frm_documentos_generados._idmaeedo_sel = BA.numberCast(int.class, 0);
 BA.debugLineNum = 95;BA.debugLine="Koen_Sel = \"\"";
Debug.ShouldStop(1073741824);
frm_documentos_generados._koen_sel = BA.ObjectToString("");
 BA.debugLineNum = 96;BA.debugLine="Suen_Sel = \"\"";
Debug.ShouldStop(-2147483648);
frm_documentos_generados._suen_sel = BA.ObjectToString("");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,104);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 104;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Resume (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,100);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","activity_resume");}
 BA.debugLineNum = 100;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_actualizar_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Actualizar_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,148);
if (RapidSub.canDelegate("btn_actualizar_click")) { BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","btn_actualizar_click"); return;}
ResumableSub_Btn_Actualizar_Click rsub = new ResumableSub_Btn_Actualizar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Actualizar_Click extends BA.ResumableSub {
public ResumableSub_Btn_Actualizar_Click(BaKapp.Movil.Tag.frm_documentos_generados parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_documentos_generados parent;
RemoteObject _tido = RemoteObject.createImmutable("");
RemoteObject _ddesde = RemoteObject.createImmutable(0);
RemoteObject _mdesde = RemoteObject.createImmutable(0);
RemoteObject _ydesde = RemoteObject.createImmutable(0);
RemoteObject _dhasta = RemoteObject.createImmutable(0);
RemoteObject _mhasta = RemoteObject.createImmutable(0);
RemoteObject _yhasta = RemoteObject.createImmutable(0);
RemoteObject _fecha = RemoteObject.createImmutable("");
RemoteObject _fechadesde = RemoteObject.createImmutable("");
RemoteObject _fechahasta = RemoteObject.createImmutable("");
RemoteObject _filtroesdo = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nudo = RemoteObject.createImmutable("");
RemoteObject _sudo = RemoteObject.createImmutable("");
RemoteObject _koen = RemoteObject.createImmutable("");
RemoteObject _suen = RemoteObject.createImmutable("");
RemoteObject _rut = RemoteObject.createImmutable("");
RemoteObject _esdo = RemoteObject.createImmutable("");
RemoteObject _feemdo = RemoteObject.createImmutable("");
RemoteObject _razon_social = RemoteObject.createImmutable("");
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.createImmutable(0);
RemoteObject _idmaeedo = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Actualizar_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,148);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 150;BA.debugLine="XclvDetalle.Clear";
Debug.ShouldStop(2097152);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_clear");
 BA.debugLineNum = 151;BA.debugLine="B4XLoading.Show";
Debug.ShouldStop(4194304);
parent.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 153;BA.debugLine="Dim Tido As String";
Debug.ShouldStop(16777216);
_tido = RemoteObject.createImmutable("");Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 155;BA.debugLine="If Rdb_COV.Checked Then Tido = \"COV\"";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._rdb_cov.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_tido = BA.ObjectToString("COV");Debug.locals.put("Tido", _tido);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 156;BA.debugLine="If Rdb_NVV.Checked Then Tido = \"NVV\"";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent._rdb_nvv.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_tido = BA.ObjectToString("NVV");Debug.locals.put("Tido", _tido);
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 158;BA.debugLine="Dim DDesde As Int = DateTime.GetDayOfMonth(DateTe";
Debug.ShouldStop(536870912);
_ddesde = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("DDesde", _ddesde);Debug.locals.put("DDesde", _ddesde);
 BA.debugLineNum = 159;BA.debugLine="Dim MDesde As Int = DateTime.GetMonth(DateTemplat";
Debug.ShouldStop(1073741824);
_mdesde = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("MDesde", _mdesde);Debug.locals.put("MDesde", _mdesde);
 BA.debugLineNum = 160;BA.debugLine="Dim YDesde As Int = DateTime.Getyear(DateTemplate";
Debug.ShouldStop(-2147483648);
_ydesde = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("YDesde", _ydesde);Debug.locals.put("YDesde", _ydesde);
 BA.debugLineNum = 162;BA.debugLine="Dim DHasta As Int = DateTime.GetDayOfMonth(DateTe";
Debug.ShouldStop(2);
_dhasta = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("DHasta", _dhasta);Debug.locals.put("DHasta", _dhasta);
 BA.debugLineNum = 163;BA.debugLine="Dim MHasta As Int = DateTime.GetMonth(DateTemplat";
Debug.ShouldStop(4);
_mhasta = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("MHasta", _mhasta);Debug.locals.put("MHasta", _mhasta);
 BA.debugLineNum = 164;BA.debugLine="Dim YHasta As Int = DateTime.Getyear(DateTemplate";
Debug.ShouldStop(8);
_yhasta = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("YHasta", _yhasta);Debug.locals.put("YHasta", _yhasta);
 BA.debugLineNum = 166;BA.debugLine="Dim Fecha As String = YDesde & Funciones.Rellenar";
Debug.ShouldStop(32);
_fecha = RemoteObject.concat(_ydesde,parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.NumberToString(_mdesde)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0"))),parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.NumberToString(_ddesde)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0"))));Debug.locals.put("Fecha", _fecha);Debug.locals.put("Fecha", _fecha);
 BA.debugLineNum = 167;BA.debugLine="Dim FechaDesde As String = YDesde & \"-\" & Funcion";
Debug.ShouldStop(64);
_fechadesde = RemoteObject.concat(_ydesde,RemoteObject.createImmutable("-"),parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.NumberToString(_mdesde)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0"))),RemoteObject.createImmutable("-"),parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.NumberToString(_ddesde)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0"))));Debug.locals.put("FechaDesde", _fechadesde);Debug.locals.put("FechaDesde", _fechadesde);
 BA.debugLineNum = 168;BA.debugLine="Dim FechaHasta As String = YHasta & \"-\" & Funcion";
Debug.ShouldStop(128);
_fechahasta = RemoteObject.concat(_yhasta,RemoteObject.createImmutable("-"),parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.NumberToString(_mhasta)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0"))),RemoteObject.createImmutable("-"),parent.mostCurrent._funciones.runMethod(true,"_rellenar_izquierda" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.NumberToString(_dhasta)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0"))));Debug.locals.put("FechaHasta", _fechahasta);Debug.locals.put("FechaHasta", _fechahasta);
 BA.debugLineNum = 170;BA.debugLine="Dim FiltroEsdo As String";
Debug.ShouldStop(512);
_filtroesdo = RemoteObject.createImmutable("");Debug.locals.put("FiltroEsdo", _filtroesdo);
 BA.debugLineNum = 172;BA.debugLine="If Chk_SoloPendientes.Checked Then";
Debug.ShouldStop(2048);
if (true) break;

case 13:
//if
this.state = 16;
if (parent.mostCurrent._chk_solopendientes.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 173;BA.debugLine="FiltroEsdo = \"And ESDO = ''\"";
Debug.ShouldStop(4096);
_filtroesdo = BA.ObjectToString("And ESDO = ''");Debug.locals.put("FiltroEsdo", _filtroesdo);
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 176;BA.debugLine="CantTop = Txt_Top.Text";
Debug.ShouldStop(32768);
parent._canttop = BA.numberCast(int.class, parent.mostCurrent._txt_top.runMethod(true,"getText"));
 BA.debugLineNum = 178;BA.debugLine="Consulta_Sql = \"Select Top \" & CantTop & \" IDMAEE";
Debug.ShouldStop(131072);
parent.mostCurrent._consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Top "),parent._canttop,RemoteObject.createImmutable(" IDMAEEDO,TIDO,NUDO,SUDO,ESDO,En.NOKOEN As RAZON,ENDO,SUENDO,CONVERT(varchar, FEEMDO,103) As FEEMDO,En.RTEN As RUT,VANEDO,VAIVDO,VABRDO,"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("(Select Count(KOPRCT) From MAEDDO Ddo Where Edo.IDMAEEDO = Ddo.IDMAEEDO) As ITEMS"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEEDO Edo"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join MAEEN En On En.KOEN = Edo.ENDO And En.SUEN = Edo.SUENDO"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where TIDO = '"),_tido,RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("And FEEMDO BETWEEN CONVERT(DateTime, '"),_fechadesde,RemoteObject.createImmutable(" 00:00:00', 102) AND CONVERT(DATETIME, '"),_fechahasta,RemoteObject.createImmutable(" 23:59:59', 102)"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("--And FEEMDO = '"),_fecha,RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("And KOFUDO = '"),parent.mostCurrent._variables._global_row_usuario_activo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOFU")))),RemoteObject.createImmutable("'"),parent.mostCurrent.__c.getField(true,"CRLF"),_filtroesdo,parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Order by NUDO Desc"));
 BA.debugLineNum = 188;BA.debugLine="ProgressDialogShow(\"Buscando documentos...\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Buscando documentos..."))));
 BA.debugLineNum = 190;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(536870912);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(parent.mostCurrent._consulta_sql),(Object)(frm_documentos_generados.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 191;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_documentos_generados.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_documentos_generados", "btn_actualizar_click"), (_js));
this.state = 43;
return;
case 43:
//C
this.state = 17;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 193;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(1);
if (true) break;

case 17:
//if
this.state = 42;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 195;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(4);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 197;BA.debugLine="If  vJson <> $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(16);
if (true) break;

case 20:
//if
this.state = 41;
if (RemoteObject.solveBoolean("!",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 22;
}else {
this.state = 40;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 199;BA.debugLine="Log(vJson)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","215204403",_vjson,0);
 BA.debugLineNum = 200;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 201;BA.debugLine="parser.Initialize(vJson)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_vjson));
 BA.debugLineNum = 202;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 203;BA.debugLine="Dim Table As List = root.Get(\"Table\")";
Debug.ShouldStop(1024);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_table = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Table")))));Debug.locals.put("Table", _table);Debug.locals.put("Table", _table);
 BA.debugLineNum = 207;BA.debugLine="For Each Fila As Map In Table";
Debug.ShouldStop(16384);
if (true) break;

case 23:
//for
this.state = 38;
_fila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group32 = _table;
index32 = 0;
groupLen32 = group32.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Fila", _fila);
this.state = 44;
if (true) break;

case 44:
//C
this.state = 38;
if (index32 < groupLen32) {
this.state = 25;
_fila = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group32.runMethod(false,"Get",index32));Debug.locals.put("Fila", _fila);}
if (true) break;

case 45:
//C
this.state = 44;
index32++;
Debug.locals.put("Fila", _fila);
if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 209;BA.debugLine="Dim Tido As String = Fila.Get(\"TIDO\")";
Debug.ShouldStop(65536);
_tido = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TIDO")))));Debug.locals.put("Tido", _tido);Debug.locals.put("Tido", _tido);
 BA.debugLineNum = 210;BA.debugLine="Dim Nudo As String = Fila.Get(\"NUDO\")";
Debug.ShouldStop(131072);
_nudo = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NUDO")))));Debug.locals.put("Nudo", _nudo);Debug.locals.put("Nudo", _nudo);
 BA.debugLineNum = 211;BA.debugLine="Dim Sudo As String = Fila.Get(\"SUDO\")";
Debug.ShouldStop(262144);
_sudo = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUDO")))));Debug.locals.put("Sudo", _sudo);Debug.locals.put("Sudo", _sudo);
 BA.debugLineNum = 212;BA.debugLine="Dim Koen As String = Fila.Get(\"ENDO\")";
Debug.ShouldStop(524288);
_koen = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ENDO")))));Debug.locals.put("Koen", _koen);Debug.locals.put("Koen", _koen);
 BA.debugLineNum = 213;BA.debugLine="Dim Suen As String = Fila.Get(\"SUENDO\")";
Debug.ShouldStop(1048576);
_suen = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SUENDO")))));Debug.locals.put("Suen", _suen);Debug.locals.put("Suen", _suen);
 BA.debugLineNum = 214;BA.debugLine="Dim Rut As String = Fila.Get(\"RUT\")";
Debug.ShouldStop(2097152);
_rut = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RUT")))));Debug.locals.put("Rut", _rut);Debug.locals.put("Rut", _rut);
 BA.debugLineNum = 215;BA.debugLine="Dim Esdo As String = Fila.Get(\"ESDO\")";
Debug.ShouldStop(4194304);
_esdo = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESDO")))));Debug.locals.put("Esdo", _esdo);Debug.locals.put("Esdo", _esdo);
 BA.debugLineNum = 216;BA.debugLine="Dim Feemdo As String = Fila.Get(\"FEEMDO\")";
Debug.ShouldStop(8388608);
_feemdo = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FEEMDO")))));Debug.locals.put("Feemdo", _feemdo);Debug.locals.put("Feemdo", _feemdo);
 BA.debugLineNum = 217;BA.debugLine="Dim Razon_Social As String = Fila.Get(\"RAZON\")";
Debug.ShouldStop(16777216);
_razon_social = BA.ObjectToString(_fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RAZON")))));Debug.locals.put("Razon_Social", _razon_social);Debug.locals.put("Razon_Social", _razon_social);
 BA.debugLineNum = 218;BA.debugLine="Dim Total As Double = Fila.Get(\"VABRDO\")";
Debug.ShouldStop(33554432);
_total = BA.numberCast(double.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("VABRDO")))));Debug.locals.put("Total", _total);Debug.locals.put("Total", _total);
 BA.debugLineNum = 219;BA.debugLine="Dim Items As Int = Fila.Get(\"ITEMS\")";
Debug.ShouldStop(67108864);
_items = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ITEMS")))));Debug.locals.put("Items", _items);Debug.locals.put("Items", _items);
 BA.debugLineNum = 220;BA.debugLine="Dim Idmaeedo As Int = Fila.Get(\"IDMAEEDO\")";
Debug.ShouldStop(134217728);
_idmaeedo = BA.numberCast(int.class, _fila.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDMAEEDO")))));Debug.locals.put("Idmaeedo", _idmaeedo);Debug.locals.put("Idmaeedo", _idmaeedo);
 BA.debugLineNum = 222;BA.debugLine="Dim p As B4XView = XUI.CreatePanel(\"\")";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = parent.mostCurrent._xui.runMethod(false,"CreatePanel",frm_documentos_generados.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 224;BA.debugLine="p.SetLayoutAnimated(100,0,0,XclvDetalle.AsView";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._xclvdetalle.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 225;BA.debugLine="p.LoadLayout(\"Items_Documentos_Generados\")";
Debug.ShouldStop(1);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_Documentos_Generados")),frm_documentos_generados.mostCurrent.activityBA);
 BA.debugLineNum = 226;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(2);
_p.runMethod(true,"setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 228;BA.debugLine="Lbl_Tido.Text = Tido";
Debug.ShouldStop(8);
parent.mostCurrent._lbl_tido.runMethod(true,"setText",BA.ObjectToCharSequence(_tido));
 BA.debugLineNum = 229;BA.debugLine="Lbl_Nudo.Text = Nudo";
Debug.ShouldStop(16);
parent.mostCurrent._lbl_nudo.runMethod(true,"setText",BA.ObjectToCharSequence(_nudo));
 BA.debugLineNum = 230;BA.debugLine="Lbl_Sucursal.Text = Sudo";
Debug.ShouldStop(32);
parent.mostCurrent._lbl_sucursal.runMethod(true,"setText",BA.ObjectToCharSequence(_sudo));
 BA.debugLineNum = 231;BA.debugLine="Lbl_Feemdo.Text = Feemdo";
Debug.ShouldStop(64);
parent.mostCurrent._lbl_feemdo.runMethod(true,"setText",BA.ObjectToCharSequence(_feemdo));
 BA.debugLineNum = 232;BA.debugLine="Lbl_KoenSuen.Tag = Koen & \";\" & Suen";
Debug.ShouldStop(128);
parent.mostCurrent._lbl_koensuen.runMethod(false,"setTag",(RemoteObject.concat(_koen,RemoteObject.createImmutable(";"),_suen)));
 BA.debugLineNum = 233;BA.debugLine="Lbl_Razon_Social.Text = Razon_Social";
Debug.ShouldStop(256);
parent.mostCurrent._lbl_razon_social.runMethod(true,"setText",BA.ObjectToCharSequence(_razon_social));
 BA.debugLineNum = 234;BA.debugLine="Lbl_Total.Tag = Total";
Debug.ShouldStop(512);
parent.mostCurrent._lbl_total.runMethod(false,"setTag",(_total));
 BA.debugLineNum = 235;BA.debugLine="Lbl_Total.Text = \"$ \" & NumberFormat(Total,0,2";
Debug.ShouldStop(1024);
parent.mostCurrent._lbl_total.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_total),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 236;BA.debugLine="Lbl_Items.Text = Items";
Debug.ShouldStop(2048);
parent.mostCurrent._lbl_items.runMethod(true,"setText",BA.ObjectToCharSequence(_items));
 BA.debugLineNum = 237;BA.debugLine="Lbl_Rut.Tag = Rut";
Debug.ShouldStop(4096);
parent.mostCurrent._lbl_rut.runMethod(false,"setTag",(_rut));
 BA.debugLineNum = 238;BA.debugLine="Lbl_Rut.Text = NumberFormat(Rut,0,0) & \"-\" & F";
Debug.ShouldStop(8192);
parent.mostCurrent._lbl_rut.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _rut)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("-"),parent.mostCurrent._funciones.runMethod(true,"_rutdigito" /*RemoteObject*/ ,frm_documentos_generados.mostCurrent.activityBA,(Object)(BA.numberCast(long.class, _rut))))));
 BA.debugLineNum = 239;BA.debugLine="Lbl_Idmaeedo.Tag = Idmaeedo";
Debug.ShouldStop(16384);
parent.mostCurrent._lbl_idmaeedo.runMethod(false,"setTag",(_idmaeedo));
 BA.debugLineNum = 240;BA.debugLine="Lbl_Idmaeedo.Text = \"ID: \" & Idmaeedo";
Debug.ShouldStop(32768);
parent.mostCurrent._lbl_idmaeedo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("ID: "),_idmaeedo)));
 BA.debugLineNum = 241;BA.debugLine="Lbl_Estado.Tag = Esdo";
Debug.ShouldStop(65536);
parent.mostCurrent._lbl_estado.runMethod(false,"setTag",(_esdo));
 BA.debugLineNum = 243;BA.debugLine="If Esdo = \"C\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_esdo,BA.ObjectToString("C"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 244;BA.debugLine="Lbl_Estado.Text = \"Cerrado\"";
Debug.ShouldStop(524288);
parent.mostCurrent._lbl_estado.runMethod(true,"setText",BA.ObjectToCharSequence("Cerrado"));
 BA.debugLineNum = 245;BA.debugLine="Lbl_Estado.TextColor = Colors.RGB(240, 124, 7";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbl_estado.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 240)),(Object)(BA.numberCast(int.class, 124)),(Object)(BA.numberCast(int.class, 73))));
 if (true) break;
;
 BA.debugLineNum = 247;BA.debugLine="If Esdo.Trim = \"\" Then";
Debug.ShouldStop(4194304);

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_esdo.runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 248;BA.debugLine="Lbl_Estado.Text = \"Abierto\"";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbl_estado.runMethod(true,"setText",BA.ObjectToCharSequence("Abierto"));
 BA.debugLineNum = 249;BA.debugLine="Lbl_Estado.TextColor = Colors.RGB(189, 247, 1";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbl_estado.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 189)),(Object)(BA.numberCast(int.class, 247)),(Object)(BA.numberCast(int.class, 164))));
 if (true) break;
;
 BA.debugLineNum = 251;BA.debugLine="If Esdo = \"N\" Then Lbl_Estado.Text = \"Nulo\"";
Debug.ShouldStop(67108864);

case 32:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",_esdo,BA.ObjectToString("N"))) { 
this.state = 34;
;}if (true) break;

case 34:
//C
this.state = 37;
parent.mostCurrent._lbl_estado.runMethod(true,"setText",BA.ObjectToCharSequence("Nulo"));
if (true) break;

case 37:
//C
this.state = 45;
;
 BA.debugLineNum = 253;BA.debugLine="XclvDetalle.Add(p,\"\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._xclvdetalle.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 255;BA.debugLine="Log(Lbl_Idmaeedo.Text)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","215204459",parent.mostCurrent._lbl_idmaeedo.runMethod(true,"getText"),0);
 if (true) break;
if (true) break;

case 38:
//C
this.state = 41;
Debug.locals.put("Fila", _fila);
;
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 261;BA.debugLine="ToastMessageShow(\"No se encontraron registros\",";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No se encontraron registros")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = -1;
;
 BA.debugLineNum = 267;BA.debugLine="B4XLoading.Hide";
Debug.ShouldStop(1024);
parent.mostCurrent._b4xloading.runClassMethod (BaKapp.Movil.Tag.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 268;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static void  _btn_fecha_desde_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Fecha_Desde_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,282);
if (RapidSub.canDelegate("btn_fecha_desde_click")) { BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","btn_fecha_desde_click"); return;}
ResumableSub_Btn_Fecha_Desde_Click rsub = new ResumableSub_Btn_Fecha_Desde_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Fecha_Desde_Click extends BA.ResumableSub {
public ResumableSub_Btn_Fecha_Desde_Click(BaKapp.Movil.Tag.frm_documentos_generados parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_documentos_generados parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Fecha_Desde_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,282);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 283;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplateDesde,";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_documentos_generados.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_documentos_generados", "btn_fecha_desde_click"), parent.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._datetemplatedesde)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 284;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 285;BA.debugLine="Btn_Fecha_Desde.Text = DateTime.Date(DateTemplat";
Debug.ShouldStop(268435456);
parent.mostCurrent._btn_fecha_desde.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent._datetemplatedesde.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static void  _btn_fecha_hasta_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Fecha_Hasta_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,289);
if (RapidSub.canDelegate("btn_fecha_hasta_click")) { BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","btn_fecha_hasta_click"); return;}
ResumableSub_Btn_Fecha_Hasta_Click rsub = new ResumableSub_Btn_Fecha_Hasta_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Btn_Fecha_Hasta_Click extends BA.ResumableSub {
public ResumableSub_Btn_Fecha_Hasta_Click(BaKapp.Movil.Tag.frm_documentos_generados parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_documentos_generados parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Btn_Fecha_Hasta_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,289);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 290;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplateHasta,";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", frm_documentos_generados.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_documentos_generados", "btn_fecha_hasta_click"), parent.mostCurrent._dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._datetemplatehasta)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 291;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 292;BA.debugLine="Btn_Fecha_Hasta.Text = DateTime.Date(DateTemplat";
Debug.ShouldStop(8);
parent.mostCurrent._btn_fecha_hasta.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent._datetemplatehasta.runClassMethod (BaKapp.Movil.Tag.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 294;BA.debugLine="End Sub";
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
public static RemoteObject  _btn_volver_click() throws Exception{
try {
		Debug.PushSubsStack("Btn_Volver_Click (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,273);
if (RapidSub.canDelegate("btn_volver_click")) { return BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","btn_volver_click");}
 BA.debugLineNum = 273;BA.debugLine="Private Sub Btn_Volver_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
frm_documentos_generados.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private XUI As XUI";
frm_documentos_generados.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 24;BA.debugLine="Private Dialog As B4XDialog";
frm_documentos_generados.mostCurrent._dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");
 //BA.debugLineNum = 25;BA.debugLine="Private Base As B4XView";
frm_documentos_generados.mostCurrent._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private DateTemplateDesde As B4XDateTemplate";
frm_documentos_generados.mostCurrent._datetemplatedesde = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdatetemplate");
 //BA.debugLineNum = 27;BA.debugLine="Private DateTemplateHasta As B4XDateTemplate";
frm_documentos_generados.mostCurrent._datetemplatehasta = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdatetemplate");
 //BA.debugLineNum = 28;BA.debugLine="Private CantTop As Int";
frm_documentos_generados._canttop = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 30;BA.debugLine="Dim Consulta_Sql As String";
frm_documentos_generados.mostCurrent._consulta_sql = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Private XclvDetalle As CustomListView";
frm_documentos_generados.mostCurrent._xclvdetalle = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 33;BA.debugLine="Private Rdb_COV As RadioButton";
frm_documentos_generados.mostCurrent._rdb_cov = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private Rdb_NVV As RadioButton";
frm_documentos_generados.mostCurrent._rdb_nvv = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private Btn_Actualizar As Button";
frm_documentos_generados.mostCurrent._btn_actualizar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private Btn_Volver As Button";
frm_documentos_generados.mostCurrent._btn_volver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private B4XLoading As B4XLoadingIndicator";
frm_documentos_generados.mostCurrent._b4xloading = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xloadingindicator");
 //BA.debugLineNum = 38;BA.debugLine="Private Lbl_Tido As B4XView";
frm_documentos_generados.mostCurrent._lbl_tido = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private Lbl_Nudo As B4XView";
frm_documentos_generados.mostCurrent._lbl_nudo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Lbl_KoenSuen As B4XView";
frm_documentos_generados.mostCurrent._lbl_koensuen = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Lbl_Rut As B4XView";
frm_documentos_generados.mostCurrent._lbl_rut = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Lbl_Razon_Social As B4XView";
frm_documentos_generados.mostCurrent._lbl_razon_social = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Lbl_Total As B4XView";
frm_documentos_generados.mostCurrent._lbl_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Lbl_Items As B4XView";
frm_documentos_generados.mostCurrent._lbl_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Lbl_Idmaeedo As B4XView";
frm_documentos_generados.mostCurrent._lbl_idmaeedo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Btn_Fecha_Desde As Button";
frm_documentos_generados.mostCurrent._btn_fecha_desde = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Btn_Fecha_Hasta As Button";
frm_documentos_generados.mostCurrent._btn_fecha_hasta = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private Lbl_Feemdo As B4XView";
frm_documentos_generados.mostCurrent._lbl_feemdo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Lbl_Estado As B4XView";
frm_documentos_generados.mostCurrent._lbl_estado = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private Chk_SoloPendientes As CheckBox";
frm_documentos_generados.mostCurrent._chk_solopendientes = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private Txt_Top As EditText";
frm_documentos_generados.mostCurrent._txt_top = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private Lbl_Sucursal As B4XView";
frm_documentos_generados.mostCurrent._lbl_sucursal = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Idmaeedo_Sel As Int";
frm_documentos_generados._idmaeedo_sel = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Public Tido_Sel As String";
frm_documentos_generados._tido_sel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public Nudo_Sel As String";
frm_documentos_generados._nudo_sel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public Koen_Sel As String";
frm_documentos_generados._koen_sel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Public Suen_Sel As String";
frm_documentos_generados._suen_sel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Public Doc_Seleccionado As Boolean";
frm_documentos_generados._doc_seleccionado = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 16;BA.debugLine="Public Estado_Sel As String";
frm_documentos_generados._estado_sel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _xclvdetalle_itemlongclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemLongClick (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,108);
if (RapidSub.canDelegate("xclvdetalle_itemlongclick")) { BaKapp.Movil.Tag.frm_documentos_generados.remoteMe.runUserSub(false, "frm_documentos_generados","xclvdetalle_itemlongclick", _index, _value); return;}
ResumableSub_XclvDetalle_ItemLongClick rsub = new ResumableSub_XclvDetalle_ItemLongClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_XclvDetalle_ItemLongClick extends BA.ResumableSub {
public ResumableSub_XclvDetalle_ItemLongClick(BaKapp.Movil.Tag.frm_documentos_generados parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_documentos_generados parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblnudo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbltido = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblidmaeedo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblestado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("XclvDetalle_ItemLongClick (frm_documentos_generados) ","frm_documentos_generados",15,frm_documentos_generados.mostCurrent.activityBA,frm_documentos_generados.mostCurrent,108);
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
 BA.debugLineNum = 110;BA.debugLine="Dim XUI As XUI";
Debug.ShouldStop(8192);
parent.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 111;BA.debugLine="Dim Item As CLVItem  = XclvDetalle.GetRawListItem";
Debug.ShouldStop(16384);
_item = parent.mostCurrent._xclvdetalle.runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 112;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 114;BA.debugLine="Dim LblNudo As Label = p.GetView(0)";
Debug.ShouldStop(131072);
_lblnudo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblnudo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblNudo", _lblnudo);Debug.locals.put("LblNudo", _lblnudo);
 BA.debugLineNum = 115;BA.debugLine="Dim LblTido As Label = p.GetView(3)";
Debug.ShouldStop(262144);
_lbltido = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbltido = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("LblTido", _lbltido);Debug.locals.put("LblTido", _lbltido);
 BA.debugLineNum = 116;BA.debugLine="Dim LblIdmaeedo As Label = p.GetView(8)";
Debug.ShouldStop(524288);
_lblidmaeedo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblidmaeedo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 8))).getObject());Debug.locals.put("LblIdmaeedo", _lblidmaeedo);Debug.locals.put("LblIdmaeedo", _lblidmaeedo);
 BA.debugLineNum = 117;BA.debugLine="Dim LblEstado As Label = p.GetView(14)";
Debug.ShouldStop(1048576);
_lblestado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblestado = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 14))).getObject());Debug.locals.put("LblEstado", _lblestado);Debug.locals.put("LblEstado", _lblestado);
 BA.debugLineNum = 119;BA.debugLine="Dim bmp1 As Bitmap";
Debug.ShouldStop(4194304);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 120;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"symbol-cancel.";
Debug.ShouldStop(8388608);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("symbol-cancel.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 122;BA.debugLine="If LblEstado.Tag = \"C\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_lblestado.runMethod(false,"getTag"),RemoteObject.createImmutable(("C")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 124;BA.debugLine="Dim sf As Object = XUI.Msgbox2Async(LblTido.Text";
Debug.ShouldStop(134217728);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",frm_documentos_generados.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_lbltido.runMethod(true,"getText"),RemoteObject.createImmutable("-"),_lblnudo.runMethod(true,"getText"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Cerrado completamente")))),(Object)(BA.ObjectToCharSequence("Validación")),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 126;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_documentos_generados.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_documentos_generados", "xclvdetalle_itemlongclick"), _sf);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 127;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 131;BA.debugLine="Estado_Sel = LblEstado.Tag";
Debug.ShouldStop(4);
parent._estado_sel = BA.ObjectToString(_lblestado.runMethod(false,"getTag"));
 BA.debugLineNum = 132;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"question.png\")";
Debug.ShouldStop(8);
_bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png")));Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 134;BA.debugLine="Dim sf As Object = XUI.Msgbox2Async(LblTido.Text";
Debug.ShouldStop(32);
_sf = parent.mostCurrent._xui.runMethod(false,"Msgbox2Async",frm_documentos_generados.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_lbltido.runMethod(true,"getText"),RemoteObject.createImmutable("-"),_lblnudo.runMethod(true,"getText")))),(Object)(BA.ObjectToCharSequence("Seleccionar documento")),(Object)(BA.ObjectToString("Seleccionar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(_bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 135;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_documentos_generados.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_documentos_generados", "xclvdetalle_itemlongclick"), _sf);
this.state = 10;
return;
case 10:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 137;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 139;BA.debugLine="Doc_Seleccionado = True";
Debug.ShouldStop(1024);
parent._doc_seleccionado = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 140;BA.debugLine="Idmaeedo_Sel = LblIdmaeedo.Tag";
Debug.ShouldStop(2048);
parent._idmaeedo_sel = BA.numberCast(int.class, _lblidmaeedo.runMethod(false,"getTag"));
 BA.debugLineNum = 142;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
}