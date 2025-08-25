package BaKapp.Movil.Tag;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frm_infostockxprod_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return BaKapp.Movil.Tag.frm_infostockxprod.remoteMe.runUserSub(false, "frm_infostockxprod","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"St_StockXBodega\")";
Debug.ShouldStop(4);
frm_infostockxprod.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("St_StockXBodega")),frm_infostockxprod.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="Msj.Initialize";
Debug.ShouldStop(8);
frm_infostockxprod._msj.runClassMethod (BaKapp.Movil.Tag.mensajes.class, "_initialize" /*RemoteObject*/ ,frm_infostockxprod.processBA);
 BA.debugLineNum = 38;BA.debugLine="Lbl_Codigo.Text = Codigo";
Debug.ShouldStop(32);
frm_infostockxprod.mostCurrent._lbl_codigo.runMethod(true,"setText",BA.ObjectToCharSequence(frm_infostockxprod._codigo));
 BA.debugLineNum = 39;BA.debugLine="Lbl_Descripcion.Text = Descripcion";
Debug.ShouldStop(64);
frm_infostockxprod.mostCurrent._lbl_descripcion.runMethod(true,"setText",BA.ObjectToCharSequence(frm_infostockxprod._descripcion));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) { return BaKapp.Movil.Tag.frm_infostockxprod.remoteMe.runUserSub(false, "frm_infostockxprod","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return BaKapp.Movil.Tag.frm_infostockxprod.remoteMe.runUserSub(false, "frm_infostockxprod","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="Revisar_Stock";
Debug.ShouldStop(4096);
_revisar_stock();
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim bmp1 As Bitmap";
frm_infostockxprod.mostCurrent._bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Lbl_Codigo As Label";
frm_infostockxprod.mostCurrent._lbl_codigo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Lbl_Descripcion As Label";
frm_infostockxprod.mostCurrent._lbl_descripcion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Xclv_StokXbodega As CustomListView";
frm_infostockxprod.mostCurrent._xclv_stokxbodega = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 27;BA.debugLine="Private Lbl_Bodega As B4XView";
frm_infostockxprod.mostCurrent._lbl_bodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Lbl_InfoStock As B4XView";
frm_infostockxprod.mostCurrent._lbl_infostock = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Msj As Mensajes";
frm_infostockxprod._msj = RemoteObject.createNew ("BaKapp.Movil.Tag.mensajes");
 //BA.debugLineNum = 12;BA.debugLine="Dim Codigo As String";
frm_infostockxprod._codigo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim Descripcion As String";
frm_infostockxprod._descripcion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _revisar_stock() throws Exception{
try {
		Debug.PushSubsStack("Revisar_Stock (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,53);
if (RapidSub.canDelegate("revisar_stock")) { BaKapp.Movil.Tag.frm_infostockxprod.remoteMe.runUserSub(false, "frm_infostockxprod","revisar_stock"); return;}
ResumableSub_Revisar_Stock rsub = new ResumableSub_Revisar_Stock(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Revisar_Stock extends BA.ResumableSub {
public ResumableSub_Revisar_Stock(BaKapp.Movil.Tag.frm_infostockxprod parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_infostockxprod parent;
RemoteObject _consulta_sql = RemoteObject.createImmutable("");
RemoteObject _js = RemoteObject.declareNull("BaKapp.Movil.Tag.httpjob");
RemoteObject _vjson = RemoteObject.createImmutable("");
RemoteObject _tblstockxbodega = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _searchtemplatestock = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xsearchtemplate");
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _dialog = RemoteObject.declareNull("BaKapp.Movil.Tag.b4xdialog");
RemoteObject _vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _stock = RemoteObject.createImmutable("");
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Revisar_Stock (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 55;BA.debugLine="Dim Consulta_Sql As String";
Debug.ShouldStop(4194304);
_consulta_sql = RemoteObject.createImmutable("");Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 57;BA.debugLine="Consulta_Sql = \"Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO";
Debug.ShouldStop(16777216);
_consulta_sql = RemoteObject.concat(RemoteObject.createImmutable("Select Tb.EMPRESA,Tb.KOSU,Tb.KOBO,Ts.NOKOSU,Tb.NOKOBO,STFI1"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("From MAEST Ms"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Inner Join TABBO Tb On Tb.EMPRESA = Ms.EMPRESA And Tb.KOSU = Ms.KOSU And Tb.KOBO = Ms.KOBO"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Left Join TABSU Ts On Ts.EMPRESA = Ms.EMPRESA And Ts.KOSU = Ms.KOSU"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Where KOPR = '"),parent._codigo,RemoteObject.createImmutable("'"));Debug.locals.put("Consulta_Sql", _consulta_sql);
 BA.debugLineNum = 63;BA.debugLine="Dim Js As HttpJob = Funciones.Fx_HttJob_Ws_Sb_Get";
Debug.ShouldStop(1073741824);
_js = parent.mostCurrent._funciones.runMethod(false,"_fx_httjob_ws_sb_getdataset_json" /*RemoteObject*/ ,frm_infostockxprod.mostCurrent.activityBA,(Object)(_consulta_sql),(Object)(frm_infostockxprod.getObject()));Debug.locals.put("Js", _js);Debug.locals.put("Js", _js);
 BA.debugLineNum = 64;BA.debugLine="Wait For (Js) JobDone(Js As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", frm_infostockxprod.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_infostockxprod", "revisar_stock"), (_js));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_js = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Js", _js);
;
 BA.debugLineNum = 66;BA.debugLine="If Js.Success Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 14;
if (_js.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 68;BA.debugLine="Dim vJson As String = Js.GetString";
Debug.ShouldStop(8);
_vjson = _js.runClassMethod (BaKapp.Movil.Tag.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("vJson", _vjson);Debug.locals.put("vJson", _vjson);
 BA.debugLineNum = 70;BA.debugLine="If	vJson = $\"{\"Table\":[]}\"$ Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_vjson,(RemoteObject.createImmutable("{\"Table\":[]}")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 72;BA.debugLine="Msj.Detalle = \"Información\"";
Debug.ShouldStop(128);
parent._msj.setField ("_detalle" /*RemoteObject*/ ,BA.ObjectToString("Información"));
 BA.debugLineNum = 73;BA.debugLine="Msj.Mensaje = \"No existe información\"";
Debug.ShouldStop(256);
parent._msj.setField ("_mensaje" /*RemoteObject*/ ,BA.ObjectToString("No existe información"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 77;BA.debugLine="Log(\"Traer Stock x bodega\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","218022424",RemoteObject.createImmutable("Traer Stock x bodega"),0);
 BA.debugLineNum = 78;BA.debugLine="Dim TblStockXbodega As List = Funciones.Fx_Data";
Debug.ShouldStop(8192);
_tblstockxbodega = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tblstockxbodega = parent.mostCurrent._funciones.runMethod(false,"_fx_datatable" /*RemoteObject*/ ,frm_infostockxprod.mostCurrent.activityBA,(Object)(_vjson));Debug.locals.put("TblStockXbodega", _tblstockxbodega);Debug.locals.put("TblStockXbodega", _tblstockxbodega);
 BA.debugLineNum = 80;BA.debugLine="Private SearchTemplateStock As B4XSearchTemplat";
Debug.ShouldStop(32768);
_searchtemplatestock = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xsearchtemplate");Debug.locals.put("SearchTemplateStock", _searchtemplatestock);
 BA.debugLineNum = 81;BA.debugLine="SearchTemplateStock.Initialize";
Debug.ShouldStop(65536);
_searchtemplatestock.runClassMethod (BaKapp.Movil.Tag.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,frm_infostockxprod.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(2097152);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 87;BA.debugLine="Private Dialog As B4XDialog";
Debug.ShouldStop(4194304);
_dialog = RemoteObject.createNew ("BaKapp.Movil.Tag.b4xdialog");Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 89;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(16777216);
_dialog.runClassMethod (BaKapp.Movil.Tag.b4xdialog.class, "_initialize" /*RemoteObject*/ ,frm_infostockxprod.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._activity.getObject()));
 BA.debugLineNum = 90;BA.debugLine="Dialog.Title = \"Stock X Bodega\"";
Debug.ShouldStop(33554432);
_dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Stock X Bodega")));
 BA.debugLineNum = 92;BA.debugLine="Xclv_StokXbodega.DefaultTextBackgroundColor = C";
Debug.ShouldStop(134217728);
parent.mostCurrent._xclv_stokxbodega.setField ("_defaulttextbackgroundcolor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 93;BA.debugLine="Xclv_StokXbodega.Clear";
Debug.ShouldStop(268435456);
parent.mostCurrent._xclv_stokxbodega.runVoidMethod ("_clear");
 BA.debugLineNum = 95;BA.debugLine="For Each vFilaStb As Map In TblStockXbodega";
Debug.ShouldStop(1073741824);
if (true) break;

case 9:
//for
this.state = 12;
_vfilastb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _tblstockxbodega;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("vFilaStb", _vfilastb);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 12;
if (index21 < groupLen21) {
this.state = 11;
_vfilastb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group21.runMethod(false,"Get",index21));Debug.locals.put("vFilaStb", _vfilastb);}
if (true) break;

case 17:
//C
this.state = 16;
index21++;
Debug.locals.put("vFilaStb", _vfilastb);
if (true) break;

case 11:
//C
this.state = 17;
 BA.debugLineNum = 97;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _xui.runMethod(false,"CreatePanel",frm_infostockxprod.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="p.SetLayoutAnimated(100,0,0,Xclv_StokXbodega.A";
Debug.ShouldStop(4);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._xclv_stokxbodega.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 100;BA.debugLine="p.LoadLayout(\"Items_StockXProducto\")";
Debug.ShouldStop(8);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Items_StockXProducto")),frm_infostockxprod.mostCurrent.activityBA);
 BA.debugLineNum = 101;BA.debugLine="p.Color = Colors.Transparent";
Debug.ShouldStop(16);
_p.runMethod(true,"setColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 103;BA.debugLine="Dim Stock As String  = NumberFormat(vFilaStb.G";
Debug.ShouldStop(64);
_stock = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Stock", _stock);Debug.locals.put("Stock", _stock);
 BA.debugLineNum = 107;BA.debugLine="Lbl_Bodega.Text = vFilaStb.Get(\"KOSU\") & \" - \"";
Debug.ShouldStop(1024);
parent.mostCurrent._lbl_bodega.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOSU")))),RemoteObject.createImmutable(" - "),_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("KOBO")))),RemoteObject.createImmutable(" - "),_vfilastb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOBO")))))));
 BA.debugLineNum = 108;BA.debugLine="Lbl_InfoStock.Text = \"Stock disponible: \" & St";
Debug.ShouldStop(2048);
parent.mostCurrent._lbl_infostock.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Stock disponible: "),_stock)));
 BA.debugLineNum = 109;BA.debugLine="p.Tag =vFilaStb";
Debug.ShouldStop(4096);
_p.runMethod(false,"setTag",(_vfilastb.getObject()));
 BA.debugLineNum = 110;BA.debugLine="Xclv_StokXbodega.add(p,\"\")";
Debug.ShouldStop(8192);
parent.mostCurrent._xclv_stokxbodega.runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
Debug.locals.put("vFilaStb", _vfilastb);
;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _js) throws Exception{
}
public static void  _xclv_stokxbodega_itemlongclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Xclv_StokXbodega_ItemLongClick (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,120);
if (RapidSub.canDelegate("xclv_stokxbodega_itemlongclick")) { BaKapp.Movil.Tag.frm_infostockxprod.remoteMe.runUserSub(false, "frm_infostockxprod","xclv_stokxbodega_itemlongclick", _index, _value); return;}
ResumableSub_Xclv_StokXbodega_ItemLongClick rsub = new ResumableSub_Xclv_StokXbodega_ItemLongClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Xclv_StokXbodega_ItemLongClick extends BA.ResumableSub {
public ResumableSub_Xclv_StokXbodega_ItemLongClick(BaKapp.Movil.Tag.frm_infostockxprod parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
BaKapp.Movil.Tag.frm_infostockxprod parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _item = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _filaseleccionada = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stock = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Xclv_StokXbodega_ItemLongClick (frm_infostockxprod) ","frm_infostockxprod",18,frm_infostockxprod.mostCurrent.activityBA,frm_infostockxprod.mostCurrent,120);
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
 BA.debugLineNum = 124;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(134217728);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 125;BA.debugLine="Dim Item As CLVItem  = Xclv_StokXbodega.GetRawLis";
Debug.ShouldStop(268435456);
_item = parent.mostCurrent._xclv_stokxbodega.runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 126;BA.debugLine="Dim p As Panel = Item.Panel.GetView(0)";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="Msj.EsCorrecto = True";
Debug.ShouldStop(1);
parent._msj.setField ("_escorrecto" /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 130;BA.debugLine="Msj.Tag = p.Tag";
Debug.ShouldStop(2);
parent._msj.setField ("_tag" /*RemoteObject*/ ,_p.runMethod(false,"getTag"));
 BA.debugLineNum = 131;BA.debugLine="Dim FilaSeleccionada As Map = p.Tag";
Debug.ShouldStop(4);
_filaseleccionada = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_filaseleccionada = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _p.runMethod(false,"getTag"));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 132;BA.debugLine="bmp1 = LoadBitmap(File.DirAssets, \"ok_button.png\"";
Debug.ShouldStop(8);
parent.mostCurrent._bmp1 = parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ok_button.png")));
 BA.debugLineNum = 134;BA.debugLine="Dim Stock As String  = NumberFormat(FilaSeleccion";
Debug.ShouldStop(32);
_stock = parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _filaseleccionada.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("STFI1")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Stock", _stock);Debug.locals.put("Stock", _stock);
 BA.debugLineNum = 136;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Bodega: \" &";
Debug.ShouldStop(128);
_sf = _xui.runMethod(false,"Msgbox2Async",frm_infostockxprod.processBA,(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Bodega: "),_filaseleccionada.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOKOBO")))),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Stock disponible: "),_stock))),(Object)(BA.ObjectToCharSequence("Selección de bodega")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)(parent.mostCurrent._bmp1));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 138;BA.debugLine="Wait For (sf) Msgbox_result (Result As Int)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", frm_infostockxprod.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frm_infostockxprod", "xclv_stokxbodega_itemlongclick"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 140;BA.debugLine="If Result <> DialogResponse.POSITIVE Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 141;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 144;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
parent.mostCurrent._activity.runVoidMethod ("Finish");
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